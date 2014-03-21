/**
 */
package VmPlacement.tests;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ocl2csp.codegen.Z3ContrastGenerator;
import ocl2csp.codegen.Z3ObjGenerator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import VmPlacement.VmPlacementFactory;
import VmPlacement.VmPlacementPackage;
import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemTest extends TestCase {
	
	Resource resource = null;
	Z3ObjGenerator generator = new Z3ObjGenerator();
	EPackage metaPackage = null;

	
	@Override
	protected void setUp() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		
		Resource metaRes = resourceSet.getResource(
				URI.createFileURI("model/generated-casestudy.ecore"), 
				true);
		metaPackage = (EPackage) metaRes.getContents().get(0);
		
		resourceSet.getPackageRegistry().put(metaPackage.getNsURI(), metaPackage);
		
		
		
		URI uri = URI.createFileURI("inst/casestudy.xmi");
		resource = resourceSet.getResource(uri, true);
		
	}
	
	public void ttestEnum(){
		Map<EClass, Set<EObject>> clazzMap = new HashMap<EClass,Set<EObject>>();
		for(Iterator<EObject> it = resource.getAllContents(); it.hasNext();){
			EObject obj = it.next();
			EClass clazz = obj.eClass();
			if(clazz.getEAnnotation("dynamic") == null)
				continue;
			if(!clazzMap.containsKey(clazz)){
				clazzMap.put(clazz, new HashSet<EObject>() );
			}
			clazzMap.get(clazz).add(obj);
		}
		
		for(Map.Entry<EClass, Set<EObject>> entry : clazzMap.entrySet()){
			System.out.println(generator.genObj2Enum(entry.getKey(), 
					new ArrayList<EObject>(entry.getValue())));
		}
		
	}
	
	public void testFartialEvaluation() throws IOException{
		List<EObject> objects = new ArrayList<EObject>();
		for(Iterator<EObject> it = resource.getAllContents(); it.hasNext();)
			objects.add(it.next());
		generator.mutualConsFeature.put("FrequentNear", 
				((EClass)metaPackage.getEClassifier("VM")).getEStructuralFeature("frqt"));
		generator.mutualCons.put("FrequentNear", new HashSet<EObject>());
		generator.mutualConsFeature.put("BackupSplit", 
				((EClass)metaPackage.getEClassifier("VM")).getEStructuralFeature("backup"));
		generator.mutualCons.put("BackupSplit", new HashSet<EObject>());
		generator.mutualConsFeature.put("SyncPeakSplit", 
				((EClass)metaPackage.getEClassifier("VM")).getEStructuralFeature("synchPeak"));
		generator.mutualCons.put("SyncPeakSplit", new HashSet<EObject>());
		String s = generator.generateConstraints(objects);
		
		
		PrintWriter out = new PrintWriter(new FileWriter("../z4/vmplc/generated.py")); 
		out.println("from z3 import *");
		out.println(s);
		out.close();
		
		//for(int i=0;i<50;i++)
			//System.out.println(i);
	}
	
	public void testContrastEvaluation() throws IOException{
		List<EObject> objects = new ArrayList<EObject>();
		for(Iterator<EObject> it = resource.getAllContents(); it.hasNext();)
			objects.add(it.next());
		
		Z3ContrastGenerator contrastGenerator = new Z3ContrastGenerator();
		String s = contrastGenerator.generateConstraints(objects);
		PrintWriter out = new PrintWriter(new FileWriter("../z4/vmplc/formanual.py")); 
		out.println("from z3 import *");
		out.println(s);
		out.close();
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

} //SystemTest
