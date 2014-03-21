/**
 */
package SmartHouse.tests;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;

import SmartHouse.EV;
import SmartHouse.House;
import SmartHouse.Room;
import SmartHouse.SmartHouseFactory;
import SmartHouse.SmartHousePackage;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ocl2z3.codegen.Z3Generator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HouseTest extends TestCase {

	/**
	 * The fixture for this House test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    protected Resource res = null;
    
    protected Z3Generator generator = new Z3Generator();
    protected List<EObject> allContents = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
            TestRunner.run(HouseTest.class);
    }

    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
            ResourceSet resourceSet = new ResourceSetImpl();
            
            
            resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
                    (Resource.Factory.Registry.DEFAULT_EXTENSION, 
                     new XMIResourceFactoryImpl());

            
            resourceSet.getPackageRegistry().put
                    (SmartHousePackage.eNS_URI, 
                     SmartHousePackage.eINSTANCE);
            
            //URI uri = URI.createFileURI("../smarthouse/model/VerySimpleHouse.xmi");
            //URI uri = URI.createFileURI("../smarthouse/model/Not-Make-Sense-House.xmi");
            URI uri = URI.createFileURI("../smarthouse/model/House.xmi");
            this.res = resourceSet.getResource(uri, true);
            
            ArrayList<EObject> lst = new ArrayList<EObject>();
            for(Iterator<EObject> i=res.getAllContents();i.hasNext();)
                    lst.add(i.next());
            allContents = lst;
    }
	
	
	public void ttestNotEmptyResource(){
		this.assertTrue(this.res.getAllContents().hasNext());
	}
	
	public void ttestURI(){
		for(Iterator<EObject> i=res.getAllContents();i.hasNext();){
			EObject e = i.next();
			System.out.println(generator.getEObjectName(e));
			System.out.println(generator.getEObjectPath(e));
		}
		
	}

	public void toVar(){		
		System.out.println();
	}
	
	public void ttestEVOCLAnnotation() throws ParserException{
		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		Helper helper = ocl.createOCLHelper();
		
		House root = (House)this.res.getContents().get(0);
		
		EV ev = root.getEv().get(0);
		EAnnotation oclAnno = root.eClass().getEAnnotation("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
		String s=oclAnno.getDetails().get("TooExpensiveToUseThemTogether");
		System.out.println(s);
		
		helper.setContext(root.eClass());
		OCLExpression query=helper.createQuery(s);
		
		ocl.createQuery(query).evaluate(root);
		
		System.out.println(query);
	}
	
	public void ttestOCLAnnotation() throws ParserException{
		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		Helper helper = ocl.createOCLHelper();
		
		House root = (House)this.res.getContents().get(0);
		Room room = root.getRoom().get(0);
		EAnnotation oclAnno = room.eClass().getEAnnotation("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
		String s=oclAnno.getDetails().get("ExtremelyColdNeedMoreHeating");
		System.out.println(s);
		
		helper.setContext(room.eClass());
		OCLExpression query=helper.createQuery(s);
		
		ocl.createQuery(query).evaluate(room);
		
		System.out.println(query);
	}
	
	public void testGenerateAll() throws Exception{
		PrintWriter out = new PrintWriter(new FileWriter("../z4/src/homecsp.py")); 
		out.println("from z3 import *");
		out.println(generator.generateVariables(allContents));
		out.println(generator.generateConstraints(allContents));
		out.close();
		
		
		System.out.println(generator.configCount);
		System.out.println(generator.variableCount);
		System.out.println(generator.goalCount);
		
		System.out.println("Total variables: "+ generator.variableCount);
		System.out.println("Total constraints: " + (generator.variableCount+generator.configCount+generator.goalCount));
		System.out.println("Total weak constraints: "+(generator.configCount + generator.goalCount));
	}
	
	public void toConstraint() throws Exception{
		System.out.println();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
	}
	
	

} //HouseTest
