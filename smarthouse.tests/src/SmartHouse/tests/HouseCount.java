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
public class HouseCount extends TestCase {

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
            TestRunner.run(HouseCount.class);
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
	
	
	public void testCount(){
		System.out.println(allContents.size());
		int attr = 0;
		int ref = 0;
		for(EObject obj: allContents){
			System.out.println(obj.eClass().getEAttributes().size());
			attr += obj.eClass().getEAttributes().size();
			ref += obj.eClass().getEReferences().size();
		}
		System.out.println(attr);
		System.out.println(ref);
	}
	

} //HouseTest
