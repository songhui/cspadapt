/**
 */
package net.modelbased.constraintext.impl;

import net.modelbased.constraintext.ConfigAnno;
import net.modelbased.constraintext.ConstraintExtFactory;
import net.modelbased.constraintext.ConstraintExtPackage;
import net.modelbased.constraintext.ExpDetail;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintExtPackageImpl extends EPackageImpl implements ConstraintExtPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configAnnoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expDetailEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.modelbased.constraintext.ConstraintExtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConstraintExtPackageImpl() {
		super(eNS_URI, ConstraintExtFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConstraintExtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConstraintExtPackage init() {
		if (isInited) return (ConstraintExtPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintExtPackage.eNS_URI);

		// Obtain or create and register package
		ConstraintExtPackageImpl theConstraintExtPackage = (ConstraintExtPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConstraintExtPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConstraintExtPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BaseCSTPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConstraintExtPackage.createPackageContents();

		// Initialize created meta-data
		theConstraintExtPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConstraintExtPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConstraintExtPackage.eNS_URI, theConstraintExtPackage);
		return theConstraintExtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigAnno() {
		return configAnnoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpDetail() {
		return expDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpDetail_Expr() {
		return (EReference)expDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintExtFactory getConstraintExtFactory() {
		return (ConstraintExtFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		configAnnoEClass = createEClass(CONFIG_ANNO);

		expDetailEClass = createEClass(EXP_DETAIL);
		createEReference(expDetailEClass, EXP_DETAIL__EXPR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BaseCSTPackage theBaseCSTPackage = (BaseCSTPackage)EPackage.Registry.INSTANCE.getEPackage(BaseCSTPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		configAnnoEClass.getESuperTypes().add(theBaseCSTPackage.getAnnotationCS());
		expDetailEClass.getESuperTypes().add(theBaseCSTPackage.getDetailCS());

		// Initialize classes, features, and operations; add parameters
		initEClass(configAnnoEClass, ConfigAnno.class, "ConfigAnno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expDetailEClass, ExpDetail.class, "ExpDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpDetail_Expr(), theBaseCSTPackage.getSpecificationCS(), null, "expr", null, 0, -1, ExpDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "base", "http://www.eclipse.org/ocl/3.1.0/BaseCST#/"
		   });
	}

} //ConstraintExtPackageImpl
