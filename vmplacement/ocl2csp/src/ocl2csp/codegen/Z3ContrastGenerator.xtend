package ocl2csp.codegen

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.ocl.ecore.OCLExpression
import java.util.Map
import org.eclipse.ocl.ecore.PropertyCallExp
import org.eclipse.ocl.ecore.OCL
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory
import org.eclipse.ocl.ecore.OCL$Helper
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EStructuralFeature
import java.util.ArrayList
import java.util.HashMap
import org.eclipse.ocl.ecore.impl.IteratorExpImpl
import java.util.Collection
import org.eclipse.ocl.ecore.OperationCallExp

import org.eclipse.emf.ecore.EParameter
import org.eclipse.ocl.expressions.Variable
import java.util.HashSet
import org.eclipse.emf.ecore.EReference
import java.util.Collections

class Z3ContrastGenerator {
	
	
	public final static String ANNO_CONFIG = "config"
	public final static String ANNO_CONTEXT = "context"
	public final static String ANNO_DYNAMIC = "dynamic"
	public final static String ANNO_EXTENDED = "PropertyExtended"
	
	public final static String PIVOT = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
	
	OCL ocl = OCL::newInstance(EcoreEnvironmentFactory::INSTANCE);
	Helper helper = ocl.createOCLHelper();
	
	Set<EStructuralFeature> openedFeatures = <EStructuralFeature> newHashSet()
	
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
	
	Map<EClass,List<EObject>> allInstances = <EClass,List<EObject>> newHashMap()
	public Map<String, EStructuralFeature> mutualConsFeature = <String, EStructuralFeature> newHashMap();
	public Map<String, Set<EObject>> mutualCons = <String, Set<EObject>> newHashMap();
	public Set<EStructuralFeature> mentioned = <EStructuralFeature> newHashSet();
	private List<Dependency> dependencies = <Dependency> newArrayList();
	//
	private Dependency currentDep = null;
	
	def genObj2Enum(EClass clazz, Iterable<EObject> objects){
		
		val clazzName = clazz.name
		val objName = clazzName.toFirstLower		
		val reprs = objects.map[it.objectID]
		val py_reprs = '''«objName»_names = «reprs.join('[', ', ', ']')["'"+it+"'"]»'''
		val py_obj_dict = '''«objName»s = dict()'''
		val py_enum_dec = 
			'''
			«clazzName», («reprs.map[objName+"_"+it].join(", ")») = EnumSort('«clazzName»', «objName»_names)
		  	'''
		
		val py_enum_lit = '''«clazz.name.toLowerCase»lit = [«reprs.map[objName+"_"+it].join(", ")»]'''
		 
		  	
		val py_func_decls = clazz.EAllAttributes.filter[ a |
			a.EAnnotations.exists[anno | anno.source == ANNO_CONFIG || anno.source == ANNO_CONTEXT]
		].map[ a |
			val funcName = a.funcName
			'''objName = Function('«funcName»', «clazzName», «dataTypeSort(a.EType.name)») '''.toString
		]
		
		
		return '''
			«py_reprs»
			«py_obj_dict»
			«py_enum_dec»
			«py_enum_lit»
			«FOR py_func : py_func_decls»
				«py_func»
			«ENDFOR»
		'''
	}
	
	def fullEvaluate(OCLExpression oclexpr, EObject context, Map<String,Object> evEnv){
		helper.setContext(context.eClass)
		val query = ocl.createQuery(oclexpr)
		for(s:evEnv.keySet){
			val value = evEnv.get(s)
			if(value!=null)
				query.evaluationEnvironment.add(s,value)
		}
		query.evaluate(context)
	}
	
	def Object partialEvaluate(OCLExpression oclexpr,EObject context,Map<String,Object> evEnv){
		//System.out.println(oclexpr)
		
		switch oclexpr{
			PropertyCallExp:{
				val source = (oclexpr.source as OCLExpression).partialEvaluate(context,evEnv)
				if(source == null)
					return ""
				val property = oclexpr.referredProperty
				try{
					val derivation = property.getEAnnotation(PIVOT).details.get("derivation") as String;
					if(!derivation.nullOrEmpty){
						val devExpr = helper.createQuery(derivation)
						val result =(devExpr as OCLExpression).partialEvaluate(source as EObject, <String,Object>newHashMap())
						return result
					}
				}catch(Exception e){
					//System.err.println(e)
				}
				switch(source){
					Z3Expr:{
						val rel = new Z3RelExpr() => [
							relName = property.funcName
							params += source
						]
						return rel
					}
					EObject:{
						if(property.getEAnnotation(ANNO_CONFIG) != null 
							// || property.getEAnnotation(ANNO_CONTEXT) !=null
						){
							if(property.upperBound==1){
								val rel = new Z3RelExpr() =>[
									relName = property.funcName
									params += source.pyObjectVarName
								]
								return rel
							}
							else{
								val res = allInstances.get(property.EType).map[e|
									new Z3IfExpr()=>[
										zif = new Z3RelExpr()=>[
											relName = property.funcName
											params += source.pyObjectVarName
											params += e.pyObjectVarName
										]
										zthen = e.pyObjectVarName
										
									]
								]
								return res
							}
						}
						else{
							//helper.setContext(context.eClass)
							//return oclexpr.fullEvaluate(context,evEnv)
							val re = source.eGet(property)
							return re
						}						
					}
					default: {
						return Z3Expr::EMPTY
					}
					
				}
				
			}
			IteratorExpImpl:{
				val sourceValue = (oclexpr.source as OCLExpression).partialEvaluate(context, evEnv)
				//System.out.println("--"+oclexpr.source)
				//System.out.println(sourceValue)
				val sourceValue_col = sourceValue as Iterable<Object>
				val bodyValues = (sourceValue_col).map[Object sv |
					switch(sv){
						EObject:{
							evalIterator(oclexpr.iterator.head, evEnv, sv, oclexpr.body, context)	
						}
						Z3IfExpr:{
							evalIterator(oclexpr.iterator.head, evEnv, sv.zref, oclexpr.body, context)
						}
						
						default: Z3Expr::EMPTY
					}
				]
				val opName = oclexpr.name
				switch(opName){
					case (opName == "forAll"): {
						val conj = new Z3ConjOfExpr()
						conj.clauses.addAll(bodyValues)
						return conj
					}
					case (opName == "exists") : {
						
						return bodyValues.join('Or(', ',', ')')[toString]
					}
					case 'select':{
						if(bodyValues.head instanceof Z3Expr){
							val bodyRes = bodyValues.map[ 
									val b = it as Z3Expr
									new Z3IfExpr() => [
										zif = b
									]
								]
							val finalBodyRes = <Z3IfExpr>newArrayList()
							var i = 0
							for(bodyres : bodyRes){
								bodyres.zref = sourceValue_col.get(i)
								finalBodyRes += bodyres
								i = i+1
							}
							finalBodyRes
						}
						else{
							return oclexpr.fullEvaluate(context, evEnv)
//							val resValues = newArrayList()
//							var i = 0
//							for(s : sourceValue_col){
//								if(bodyValues.get(i) as Boolean)
//									resValues.add(s)
//								i = i+1
//							}
//							return resValues
						}
							
					}
					case 'collect':{
						if(sourceValue_col.head instanceof Z3IfExpr){
							var i = 0
							for(sv : sourceValue_col){
								(sv as Z3IfExpr).zthen = bodyValues.get(i)
								i = i + 1
							}
							return sourceValue_col
						}
						else 
							return bodyValues
					}
					default: return Z3Expr.EMPTY
				}
			}
			
			OperationCallExp:{
				val operation = oclexpr.referredOperation
				val source = oclexpr.source as OCLExpression
				val argument = oclexpr.argument;
				val sourceValue = source.partialEvaluate(context,evEnv)
				val opName = operation.name
				switch(opName){
				 case (PrimitiveOperand.keySet.contains(opName) || PrimitiveBooleanOperand.keySet.contains(opName)):{
					var argString =
						if(argument.empty)
							Z3Expr::EMPTY
						else
							(argument.get(0) as OCLExpression).partialEvaluate(context,evEnv)
					if(!((sourceValue instanceof Z3Expr) || (argString instanceof Z3Expr)))
						return oclexpr.fullEvaluate(context, evEnv)
					val opMath = PrimitiveOperand.get(operation.name)
					if(opMath != null)
						if(sourceValue == null || sourceValue.nullOrEmptyString)
							return null
						else if(argString.toString != "")
							return new Z3Expr('''(«sourceValue.toExprString») «opMath» («argString.toExprString»)'''.toString)
						else if(argument.empty && opMath == "-")
							return new Z3Expr('''-«sourceValue.toExprString»'''.toString)
						else
							throw new RuntimeException('''«oclexpr» not supported''')
					val opBoolean = PrimitiveBooleanOperand.get(operation.name)
					if(sourceValue.nullOrEmptyString || argString.nullOrEmptyString){
						if(opBoolean == "Implies")
							return Z3Expr::EMPTY
						return new Z3Expr('''«sourceValue.toExprString»«argString.toExprString»'''.toString)
					}
					if(opBoolean == 'Implies' && (sourceValue instanceof Boolean) ){
						if(sourceValue as Boolean)
							return argString
						else
							return Z3Expr::EMPTY
					}
					else{
						return new Z3Expr('''«PrimitiveBooleanOperand.get(operation.name)»(«sourceValue.toExprString», «argString.toExprString»)'''.toString)
					}
				}
				case 'not' : {
					if(sourceValue.nullOrEmptyString)
						return null
					return new Z3Expr('''Not(«sourceValue»)'''.toString)
				}
				case 'sum' : {
					val sourceValue_col = sourceValue as Iterable
					if(sourceValue_col.head instanceof Z3IfExpr){
						sourceValue_col.forEach[ (it as Z3IfExpr).zelse = '0']
					}
					return new Z3Expr(sourceValue_col.join('(', '+', ')')[s | s.toString])
				}
				case (opName == 'includes' || opName == 'excludes'):{
					if(sourceValue instanceof Z3RelExpr){
						val rel = sourceValue as Z3RelExpr
						rel.params += (argument.get(0) as OCLExpression).partialEvaluate(context, evEnv)
						val trueFalse = if(opName == 'includes') 'True' else 'False'
						return new Z3Expr('''(«rel» == «trueFalse») '''.toString)
					}
					else
						throw new RuntimeException('''«oclexpr»: include from object is not supported yet! ''')
				}
				case 'allInstances':{
					return allInstances.get(sourceValue)
				}
				default:
					throw new RuntimeException('''«oclexpr» not supported!''')
				
				}
				
			}
			default:{
				return oclexpr.fullEvaluate(context,evEnv);
			}
			
			
		}
		//throw new RuntimeException('''«oclexpr» not supported!''')
	}

	def evalIterator(Variable<EClassifier,EParameter> itvar, Map<String,Object> evEnv, Object sv, org.eclipse.ocl.expressions.OCLExpression<EClassifier> bodyExpr, EObject context) {
		val varname = itvar.name
		val original = evEnv.get(varname)
		evEnv.put(varname, sv)
		val res= (bodyExpr as OCLExpression).partialEvaluate(context,evEnv)
		evEnv.put(varname,original)
		res
	}

	def getObjectID(EObject obj) {
		val clazz = obj.eClass
		val ids = clazz.EAllAttributes.filter[it.ID]
		if(ids.size != 1){
			throw new RuntimeException("must have one and only one ID"+clazz.name)
		}
		val id = ids.head
		obj.eGet(id).toString
	}
	
	def getFuncName(EStructuralFeature feature){
		openedFeatures += feature
		feature.EContainingClass.name.toFirstLower + "_" + feature.name
	}
	def getFuncNameClean(EStructuralFeature feature){
		feature.EContainingClass.name.toFirstLower + "_" + feature.name
	}
	
	def getPyObjectVarName(EObject obj){
		'''«obj.eClass.name.toFirstLower»_«obj.objectID»'''.toString
	}
	
	def getPyObjectVarNameOrValue(Object obj){
		switch(obj){
			EObject: obj.pyObjectVarName
			Boolean: if(obj) 'True' else 'False'
			default: obj.toString
		}
	}
	
	def dataTypeSort(String dataType){
		switch(dataType){
			case "EInt": "IntSort()"
			case "EBigInteger" : "IntSort()"
			case "EInteger" : "IntSort()"
			case "EDouble": "RealSort()"
			case "EBoolean": "BoolSort()"
			default: "*"
		}
	}
	

	def generateConstraints(List<EObject> objects){
		
		for(object:objects){
			val clazz = object.eClass
			if(allInstances.get(clazz) == null)
				allInstances.put(clazz, <EObject>newArrayList())
			allInstances.get(clazz).add(object)
		}
		
		val goals = new ArrayList<String>()	
		val weights = new ArrayList<String>()	
		
		openedFeatures.clear()
		for(object:objects){
			val clazz = object.eClass
			openedFeatures += clazz.EStructuralFeatures.filter[
				x|x.EType.name != "EString" && 
				( (x instanceof EAttribute) || ! (x as EReference).containment)
			]
		}
			
		val openedType = new HashSet<EClass>()
		
		val featureFuncs = <String> newArrayList()
		for(feature : openedFeatures){
			val ownerType = feature.EContainingClass
			openedType += ownerType 
			val type = feature.EType
			var boolean multiple = false;
			val sortName = 
				switch(feature){
					EReference : {
						multiple = feature.upperBound != 1
						openedType += feature.EType as EClass
						feature.EType.name
					}
					EAttribute : {
						multiple = feature.upperBound > 1
						feature.EType.name.dataTypeSort
					}
				}
			val funcName = ownerType.name.toFirstLower + '_' + feature.name
			if(multiple){
				featureFuncs += '''«funcName» = Function('«funcName»', «ownerType.name», «sortName», BoolSort())'''
			}
			else{
				featureFuncs += '''«funcName» = Function('«funcName»', «ownerType.name», «sortName»)'''
			}
		}
		
		val typeEnums = <String> newArrayList()
		for(type : openedType){
			typeEnums += type.genObj2Enum(objects.filter[it.eClass == type])
		}
		
		val currentValues = <String> newArrayList()
		val currentContext = <String> newArrayList()
		for(obj:objects){
			for(fea : openedFeatures){
				//val objcls = obj.eClass.name
				//val feacls = fea.EContainingClass
				val currentSome = if(fea.getEAnnotation(ANNO_CONFIG)==null) currentContext else currentValues
				try{
					
					
					if(obj.eClass.name == fea.EContainingClass.name){
						
						val anno = fea.getEAnnotation(ANNO_EXTENDED)
						try{
							val domainString = anno.details.get('domain')
							if(domainString.nullOrEmpty) throw new NullPointerException()
							helper.setContext(obj.eClass)
							val domain = helper.createQuery(domainString).fullEvaluate(obj,Collections.emptyMap)
							try{
								currentContext += (domain as Collection).join('Or(', ', ', ')')[o |
									'''(«fea.funcNameClean»(«obj.pyObjectVarName»)) == «o.pyObjectVarNameOrValue»'''.toString
								]
								
							}catch(ClassCastException e){
								throw new RuntimeException('Domain should return a collection')
							}
							
						}catch(NullPointerException e){
							
						}
						var priority = 0
						try{
							val priorityString = anno.details.get('resistance')
							helper.setContext(obj.eClass)
							val res = helper.createQuery(priorityString).fullEvaluate(obj,Collections.emptyMap)
							priority = res as Integer
						}
						catch(NullPointerException e){
							
						}catch(Exception e){
							//e.printStackTrace
						}
						
						if(fea.EType.name.dataTypeSort == '*'){
							if(fea.upperBound == 1){
								val resobj = obj.eGet(fea) as EObject
								currentSome += '''(«fea.funcNameClean»(«obj.pyObjectVarName»)) == («resobj.pyObjectVarName»)'''.toString
								if(currentSome == currentValues) weights += priority.toString
							}
							else{
								for(objres : allInstances.get(fea.EType)){
									val included = (obj.eGet(fea) as Collection<EObject>)
									val trueFalse = if(included.contains(objres))
														'True'
													else
														'False'
									currentSome += '''(«fea.funcNameClean»(«obj.pyObjectVarName», «objres.pyObjectVarName»)) == «trueFalse»'''.toString
									
									if(currentSome == currentValues) weights += priority.toString
								}
							}
						}
						else{
							currentSome += '''(«fea.funcNameClean»(«obj.pyObjectVarName»)) == («obj.eGet(fea).pyObjectVarNameOrValue»)'''.toString
							if(currentSome == currentValues) weights += priority.toString
						}
					}
					
				}
				catch(Exception e){
					//e.printStackTrace
				}
			}
		}
		
		val depValues = <String> newArrayList()
		var i = 0
		var j = 0
		val system = objects.filter[o|o.eClass.name=='System'].head
		val pmlist = system.eGet(system.eClass.getEStructuralFeature("pms")) as List
		val vmlist =system.eGet(system.eClass.getEStructuralFeature("vms")) as List
		for(v : vmlist){
			val vm = v as EObject
			depValues += '''(«pmlist.indexOf((vm.eGet(vm.eClass.getEStructuralFeature("plc"))))»,«i*2»)'''
			depValues += '''(«pmlist.indexOf((vm.eGet(vm.eClass.getEStructuralFeature("plc"))))+pmlist.size»,«i*2»)'''
			
			i = i+1
		}
		
		'''
		«FOR typeEnum : typeEnums»
			«typeEnum»
		«ENDFOR»
		
		«FOR featureFunc : featureFuncs»
			«featureFunc»
		«ENDFOR»
		
		goals = [
			«FOR goal : goals» 
				«goal»,
			«ENDFOR»
		]
			
		current = [
			«FOR curr : currentValues»
				«curr»,
			«ENDFOR»
		]
		
		hard = [
			«FOR hard : currentContext»
				«hard»,
			«ENDFOR»
		]
		
		weights = «weights.join('[', ', ', ']')[toString]»
		
		deps = «depValues.join('[',', ',']')[toString]»
		 '''.toString
		
		
		
	}
	
	def Integer handleConfigAndReturnWeight(EObject obj, EStructuralFeature feature, List<String> hard, List<String> weight){
		val anno = feature.getEAnnotation(ANNO_EXTENDED)
		val domainString = anno.details.get('domain')
		val domain = helper.createQuery(domainString).fullEvaluate(obj,Collections.emptyMap)
		try{
			for(o : domain as Collection){
				hard += '''(«feature.funcNameClean»(«obj.pyObjectVarName»)) == «o.pyObjectVarNameOrValue»'''
			}
		}catch(ClassCastException e){
			throw new RuntimeException('Domain should return a collection')
		}
		
		val priorityString = anno.details.get('resistance')
		val priority = helper.createQuery(priorityString).fullEvaluate(obj,Collections.emptyMap) as Integer
		priority
	}
	
	def boolean nullOrEmptyString(Object ir){
		if(ir == null || ir.toString.nullOrEmpty)
			true
		else
			false
	}
	
	def String toExprString(Object ir){
		switch(ir){
			EObject: ir.getPyObjectVarName
			Z3Expr: ir.toString
			Boolean: if(ir) 'True' else 'False'
			default: ir.toString
		}
	}
	
	def Pair<Object, Object> stringSort(Object a, Object b){
		var Pair<Object,Object> res = null
		if(a.toString < b.toString)
			res = new Pair<Object,Object>(a, b)
		else
			res = new Pair<Object,Object>(b, a)
		res
	}
}

class InterResult{
		
}

class Z3Expr extends InterResult{
	//public EClass eType
	public String strZ3Expr
	public static Z3Expr _empty = new Z3Expr("")
	new (String str){
		strZ3Expr = str
		//this.eType = eType
	}
	
	override toString(){
		return strZ3Expr
	}
	
	static def EMPTY(){
		return _empty
	}
	
}

class Z3IfExpr extends Z3Expr{
	public Object zif
	public Object zthen
	public Object zelse
	public Object zref
	
	new (){
		super(null)
	}
	
	override toString(){
		'''If(«zif», «zthen», «zelse»)'''
	}
}

class Z3ConjOfExpr extends Z3Expr{
	public Collection<Object> clauses
	new(){
		super(null);
		clauses = newArrayList()
	}
	
	override toString(){
		return clauses.join('And(', ',', ')')[toString]
	}
}

class Z3RelExpr extends Z3Expr{
	public String relName;
	public Collection<Object> params;
	new(){
		super(null)
		params = newArrayList()
	}
	
	override toString(){
		params.join(relName+'(', ',', ')')[toString]
	}
}

class Dependency{
	public int goal;
	public EObject result;
	//public Map<EObject> objects;
	public EStructuralFeature feature;
	//public 
}