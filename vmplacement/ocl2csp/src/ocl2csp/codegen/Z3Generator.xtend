package ocl2csp.codegen


import org.eclipse.emf.ecore.EObject
import java.util.List
import org.eclipse.emf.common.util.EList
import java.util.ArrayList
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.xtext.xbase.lib.Pair
import org.eclipse.ocl.ecore.OCL
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCLExpression
import org.eclipse.ocl.ecore.PrimitiveType
import org.eclipse.ocl.ecore.PropertyCallExp
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.ocl.ecore.OperationCallExp
import java.util.Map
import org.eclipse.ocl.ecore.BooleanLiteralExp
import org.eclipse.ocl.ecore.IntegerLiteralExp
import org.eclipse.ocl.ecore.RealLiteralExp
import org.eclipse.ocl.ecore.IteratorExp
import org.eclipse.ocl.ecore.OCL$Helper
import java.util.Collection
import java.util.HashMap
import org.eclipse.ocl.ecore.IfExp
import org.eclipse.ocl.ecore.IterateExp
import java.util.Set

class Z3Generator {
	
	static String CONFIG_ANNO_SOURCE = "config"
	static String DOMAIN_ANNO_KEY = "domain"
	
	
	
	OCL ocl = OCL::newInstance(EcoreEnvironmentFactory::INSTANCE);
	Helper helper = ocl.createOCLHelper();
	
	Map<String,String> PrimitiveOperand = newHashMap(
			"<" -> "<",
			">" -> ">",
			"<=" -> "<=",
			">=" -> ">=",
			"<>" -> "!=",
			"+" -> "+",
			"-" -> "-",
			"*" -> "*",
			"/" -> "/",
			"=" -> "=="	
		)
		
	Map<String,String> PrimitiveBooleanOperand = newHashMap(
			"and" -> "And",
			"or" -> "Or",
			"implies" -> "Implies"		
		)
	
	Set<String> StructuralOperation = newHashSet("size")
	
	public int variableCount = 0;
	public int goalCount = 0;
	public int constraintCount = 0;
	public int configCount = 0;
	
	def generateVariables(List<EObject> objects){
		val varNames=new ArrayList<Pair<String,String>>()
		val configNames = new ArrayList<String>();
		val contextNames = new ArrayList<String>();
		val attrValueMap = new HashMap<String,String>();
		for(obj:objects)
			for(attr:obj.eClass.EAllAttributes){
				val objName = obj.EObjectPath
				if(attr.canBeVariable){
					var z3Type = switch attr.EType.name{
						case "EInt":"Int"
						case "EDouble": "Real"
						case "EBigDecimal" : "Real"
						case "EBigInteger" : "Int"
						case "EBoolean": "Bool"
						default: "Undefined"
					}
					val attrFullName = objName+"."+attr.name
					varNames.add(new Pair<String,String>(
						attrFullName, z3Type
					))
					if(attr.getEAnnotation(CONFIG_ANNO_SOURCE)==null)
						contextNames += attrFullName
					else
						configNames += attrFullName
					val attrValue=obj.eGet(attr)
					val attrNormalValue = switch(attrValue){
						Boolean case attrValue.booleanValue: 'True'
						Boolean case ! attrValue.booleanValue: 'False'
						default:{
							try{	
								attrValue.toString
							}catch(Exception e){
								System::out.println(attrFullName)
								e.printStackTrace()
								null
							}
						}
					}
					attrValueMap.put(attrFullName, attrNormalValue)
				}
			}
			
		this.variableCount = varNames.size
		this.configCount = configNames.size
		val variableState=
		'''
		variables = {
			«FOR varName : varNames»
				'«varName.key»': «varName.value»('«varName.key»'),
			«ENDFOR»
		}
		'''.toString.removeLastSplitter(",")
		
		val configParaState=
		'''
		config_para = [
			«FOR varName : configNames»
				variables['«varName»'],
			«ENDFOR»
		]
		'''.toString.removeLastSplitter(",")
		
		val contextParaState=
		'''
		context_para = [
			«FOR varName : contextNames»
				variables['«varName»'],
			«ENDFOR»
		]
		'''.toString.removeLastSplitter(",")
		
		val configState = 
		'''
		config = {
			«FOR varName : configNames»
				'«varName»': «attrValueMap.get(varName)»,
			«ENDFOR»
		}
		'''.toString.removeLastSplitter(",")
		
		val contextState = 
		'''
		context = {
			«FOR varName : contextNames»
				'«varName»': «attrValueMap.get(varName)»,
			«ENDFOR»
		}
		'''.toString.removeLastSplitter(",")
		
		return variableState + configParaState + contextParaState + configState + contextState
	}
	
	def generateConstraints(List<EObject> objects){
		val goals = new ArrayList<String>()		
		val domains = new ArrayList<String>()
		val users = new ArrayList<ArrayList<String>>()
		for(obj:objects){
			helper.setContext(obj.eClass)
			val oclanno = obj.eClass.getEAnnotation("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
			if(oclanno != null){
				for (key : oclanno.details.keySet){
					if(! key.startsWith('User__')){
						try{
							userflag = false
							val query = helper.createQuery(oclanno.details.get(key))
							try{
							val z3expr = query.getZ3Expression(obj, new HashMap<String,Object>());
							if(!z3expr.nullOrEmpty && z3expr!="True" && z3expr!="False")
								if(key.startsWith("Domain__"))
									domains += z3expr
								else
									goals += z3expr
							}
							catch(Exception e){
								System::out.println(query)
								e.printStackTrace
							}
						}catch(Exception e){
							System::out.println(key + ": " + oclanno.details.get(key))
							e.printStackTrace
						}
					}
					else{
						userflag = true
						val query = helper.createQuery(oclanno.details.get(key))
						try{
							switch query{
								OperationCallExp:{
									val source = query.source as OCLExpression
									val arg = query.argument.get(0)
									val argleft = (arg as OperationCallExp).source as OCLExpression
									val argright = (arg as OperationCallExp).argument.get(0) as OCLExpression
									
									val triple = new ArrayList<String>(3)
									
									triple += source.getZ3Expression(obj,new HashMap<String,Object>())
									val leftStr = argleft.getZ3Expression(obj,new HashMap<String,Object>())
									triple += leftStr.substring(5,leftStr.length-1)
									triple += argright.getZ3Expression(obj,new HashMap<String,Object>())
									
									if(! triple.get(0).nullOrEmpty)
										users.add(triple)
								}
							}
						}
						catch(Exception e){
								System::out.println(query)
								e.printStackTrace
						}
						finally{
							userflag = false
						}
					}
				}
			}
			for(attr:obj.eClass.EAllAttributes){
				val objPath = obj.EObjectPath
				val domainAnno = attr.getEAnnotation(CONFIG_ANNO_SOURCE)
				if(domainAnno != null){
					val dom = domainAnno.details.get(DOMAIN_ANNO_KEY) as String
					if(dom != null){
						try{
							val vals = dom.split('\\.\\.')
							val attrName = objPath + "." + attr.name
							domains += '''And(variables['«attrName»'] >= «vals.get(0)», variables['«attrName»'] <= «vals.get(1)»)'''.toString
						}
						catch(Exception e){
							System::out.println(dom)
							e.printStackTrace
							throw new RuntimeException('''domain «dom» not supported''')
						}
					}
				}
			}
		}
		this.goalCount = goals.size
		val goalState = '''
		goals = [
			«FOR goal: goals» 
				«goal»,
			«ENDFOR»
		]
		'''.toString
		
		val domainState= '''
		domains = [
			«FOR domain: domains»
				«domain»,
			«ENDFOR»
		]
		'''.toString
		
		val userState = '''
		users = [
			«FOR user: users»
				(lambda cont,conf:«user.get(0)» , «user.get(1)», «user.get(2)»),
			«ENDFOR»
		]
		'''.toString
		return goalState.removeLastSplitter(",") + domainState.removeLastSplitter(",") + userState.removeLastSplitter(",");
	}
	
	boolean userflag;
	def String getZ3Expression(OCLExpression oclexpr,EObject context,Map<String,Object> evEnv){
		switch oclexpr{
			PropertyCallExp case (oclexpr.referredProperty instanceof EAttribute):{
				val source = this.getQueryResult(oclexpr.source as OCLExpression, context,evEnv) as EObject
				if(source == null)
					return ""
				val vname = source.EObjectPath+"."+oclexpr.referredProperty.name
				if(userflag){
					if(oclexpr.referredProperty.getEAnnotation(CONFIG_ANNO_SOURCE)!=null)
						return '''conf['«vname»']'''.toString
					else
						return '''cont['«vname»'] '''.toString
				}		
				else
					return '''variables['«vname»']'''.toString
			}
			OperationCallExp:{
				val operation = oclexpr.referredOperation
				val source = oclexpr.source as OCLExpression
				val argument = oclexpr.argument;
				if(PrimitiveOperand.keySet.contains(operation.name) || PrimitiveBooleanOperand.keySet.contains(operation.name)){
					val sourceString = source.getZ3Expression(context,evEnv)
					
					var argString = "";
					if(argument.empty)
						argString = ""
					else
						argString = (argument.get(0) as OCLExpression).getZ3Expression(context,evEnv)
					
					val opMath = PrimitiveOperand.get(operation.name)
					if(opMath != null)
						if(sourceString.nullOrEmpty)
							return ""
						else if(argString!="")
							return '''(«sourceString») «opMath» («argString»)'''.toString
						else if(argument.empty && opMath == "-")
							return '''-«sourceString»'''.toString
						else
							throw new RuntimeException('''«oclexpr» not supported''')
					val opBoolean = PrimitiveBooleanOperand.get(operation.name)
					if(sourceString.nullOrEmpty || argString.nullOrEmpty){
						if(opBoolean == "Implies")
							return ""
						return '''«sourceString»«argString»'''.toString
					}
					else{
						if(!userflag)
							return '''«opBoolean»(«sourceString», «argString»)'''.toString
						else
							return ''' «sourceString» «operation.name» «argString» '''.toString
					}
				}
				if(operation.name == "not"){
					val sourceString = source.getZ3Expression(context,evEnv)
					if(sourceString.nullOrEmpty)
						return ""
					return '''Not(«sourceString»)'''.toString
				}
				if(oclexpr.name == null && oclexpr.referredOperation!=null && oclexpr.referredOperation.name == "sum"){					
					if(source.name == "collect"){
						val itsource = source as IteratorExp
						val results = itsource.resolveIteratorSourceList(context,evEnv)
						if(results.size==0)
							return ""
						val ^final = '''«FOR result:results»«result» + «ENDFOR»'''.toString
						return ^final.removeLastSplitter("+ ")
					}
				}
				if(oclexpr.name == null && oclexpr.referredOperation!=null && StructuralOperation.contains(oclexpr.referredOperation.name)){
					val value = oclexpr.getQueryResult(context,evEnv)
					if(value != null)
						return value.toString
				}
				else
					throw new RuntimeException('''«oclexpr» not supported!''')
			}
			IteratorExp:{
				if(oclexpr.name == 'forAll' || oclexpr.name == 'exists'){
					//&&&&
					val results = oclexpr.resolveIteratorSourceList(context,evEnv)
					if(results.size==0)
						return ""
					val op = if(oclexpr.name=='forAll') 'And' else 'Or'
					val ^final = '''«op»(«FOR result:results»«result», «ENDFOR»)'''.toString
					return ^final.removeLastSplitter(", ")
				}
					
				throw new RuntimeException('''iterator «oclexpr.name» not supported!''')
				
			}
			IfExp:{
				val cond = (oclexpr.condition as OCLExpression).getQueryResult(context,evEnv) as Boolean
				if(cond.booleanValue)
					return (oclexpr.thenExpression as OCLExpression).getZ3Expression(context,evEnv).toString
				else
					return (oclexpr.elseExpression as OCLExpression).getZ3Expression(context,evEnv).toString
			}
			BooleanLiteralExp:{
				if(oclexpr.toString == "true")
					return 'True'
				else
					return 'False'
			}
			IntegerLiteralExp:{
				return oclexpr.toString
			}
			RealLiteralExp:{
				return oclexpr.toString
			}
			
		}
		throw new RuntimeException('''«oclexpr» not supported!''')
	}
	
	def getQueryResult(OCLExpression oclexpr, EObject context, Map<String,Object> evEnv){
		val query = ocl.createQuery(oclexpr)
		for(s:evEnv.keySet){
			val value = evEnv.get(s)
			if(value!=null)
				query.evaluationEnvironment.add(s,value)
		}
		query.evaluate(context)
	}
	
	def getEObjectName(EObject obj){
		for(attr:obj.eClass.EAllAttributes){
			if(attr.ID)
				return obj.eGet(attr).toString()
		}
		val list = obj.eContainer.eGet(obj.eContainingFeature) as EList;
		return list.indexOf(obj).toString()
	}
	
	def getEObjectPath(EObject obj) {
		if(obj.eContainer == null)
			"/" + obj.EObjectName
		else{
			if(obj.eContainingFeature.upperBound==1)
				obj.eContainer.EObjectPath + "/" + obj.eContainingFeature.name
			else
				obj.eContainer.EObjectPath + "/" + obj.eContainingFeature.name +
			 		"#" + obj.EObjectName
		}
	}
	
	def canBeVariable(EAttribute attr){
		if(attr.ID)
			return false
		return true
	}
	
	def getZ3Type(EAttribute attr){
		
	}
	
	def removeLastSplitter(String s, String splitter){
		val lastComma = s.lastIndexOf(splitter)
		if(lastComma > 0)
			return s.substring(0,lastComma)+ s.substring(lastComma+1)
		else
			return s
	}
	
	def resolveIteratorSourceList(IteratorExp oclexpr, EObject context,Map<String,Object> evEnv){
		val lst = (oclexpr.source as OCLExpression).getQueryResult(context,evEnv) as Collection;
		val results = new ArrayList<String>();				
		for(itelement: lst){
			for(itvar : oclexpr.iterator){
				val varname = itvar.name
				val original = evEnv.get(varname);
				evEnv.put(varname,itelement)
				val res= (oclexpr.body as OCLExpression).getZ3Expression(context,evEnv)
				if(!res.nullOrEmpty)
					results.add(res)
				evEnv.put(varname,original)
			}	
		}
		results
	}

}
