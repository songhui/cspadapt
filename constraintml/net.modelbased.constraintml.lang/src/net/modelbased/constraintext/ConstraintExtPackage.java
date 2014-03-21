/**
 */
package net.modelbased.constraintext;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.modelbased.constraintext.ConstraintExtFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import base='http://www.eclipse.org/ocl/3.1.0/BaseCST#/'"
 * @generated
 */
public interface ConstraintExtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "constraintext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelbased.net/constraint/constraintext";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cst";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintExtPackage eINSTANCE = net.modelbased.constraintext.impl.ConstraintExtPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.modelbased.constraintext.impl.ConfigAnnoImpl <em>Config Anno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.modelbased.constraintext.impl.ConfigAnnoImpl
	 * @see net.modelbased.constraintext.impl.ConstraintExtPackageImpl#getConfigAnno()
	 * @generated
	 */
	int CONFIG_ANNO = 0;

	/**
	 * The feature id for the '<em><b>Logical Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ANNO__LOGICAL_PARENT = BaseCSTPackage.ANNOTATION_CS__LOGICAL_PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ANNO__PIVOT = BaseCSTPackage.ANNOTATION_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ANNO__OWNED_ANNOTATION = BaseCSTPackage.ANNOTATION_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ANNO__ORIGINAL_XMI_ID = BaseCSTPackage.ANNOTATION_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ANNO__CSI = BaseCSTPackage.ANNOTATION_CS__CSI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ANNO__NAME = BaseCSTPackage.ANNOTATION_CS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Detail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ANNO__OWNED_DETAIL = BaseCSTPackage.ANNOTATION_CS__OWNED_DETAIL;

	/**
	 * The feature id for the '<em><b>Owned Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ANNO__OWNED_CONTENT = BaseCSTPackage.ANNOTATION_CS__OWNED_CONTENT;

	/**
	 * The feature id for the '<em><b>Owned Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ANNO__OWNED_REFERENCE = BaseCSTPackage.ANNOTATION_CS__OWNED_REFERENCE;

	/**
	 * The number of structural features of the '<em>Config Anno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ANNO_FEATURE_COUNT = BaseCSTPackage.ANNOTATION_CS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int CONFIG_ANNO___GET_DESCRIPTION = BaseCSTPackage.ANNOTATION_CS___GET_DESCRIPTION;

	/**
	 * The number of operations of the '<em>Config Anno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int CONFIG_ANNO_OPERATION_COUNT = BaseCSTPackage.ANNOTATION_CS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int CONFIG_ANNO___GET_DESCRIPTION = BaseCSTPackage.ANNOTATION_CS___GET_DESCRIPTION;

	/**
	 * The number of operations of the '<em>Config Anno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int CONFIG_ANNO_OPERATION_COUNT = BaseCSTPackage.ANNOTATION_CS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int CONFIG_ANNO___GET_DESCRIPTION = BaseCSTPackage.ANNOTATION_CS___GET_DESCRIPTION;

	/**
	 * The number of operations of the '<em>Config Anno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int CONFIG_ANNO_OPERATION_COUNT = BaseCSTPackage.ANNOTATION_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.modelbased.constraintext.impl.ExpDetailImpl <em>Exp Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.modelbased.constraintext.impl.ExpDetailImpl
	 * @see net.modelbased.constraintext.impl.ConstraintExtPackageImpl#getExpDetail()
	 * @generated
	 */
	int EXP_DETAIL = 1;

	/**
	 * The feature id for the '<em><b>Logical Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_DETAIL__LOGICAL_PARENT = BaseCSTPackage.DETAIL_CS__LOGICAL_PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_DETAIL__PIVOT = BaseCSTPackage.DETAIL_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_DETAIL__OWNED_ANNOTATION = BaseCSTPackage.DETAIL_CS__OWNED_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_DETAIL__ORIGINAL_XMI_ID = BaseCSTPackage.DETAIL_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_DETAIL__CSI = BaseCSTPackage.DETAIL_CS__CSI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_DETAIL__NAME = BaseCSTPackage.DETAIL_CS__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_DETAIL__VALUE = BaseCSTPackage.DETAIL_CS__VALUE;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_DETAIL__EXPR = BaseCSTPackage.DETAIL_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exp Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_DETAIL_FEATURE_COUNT = BaseCSTPackage.DETAIL_CS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int EXP_DETAIL___GET_DESCRIPTION = BaseCSTPackage.DETAIL_CS___GET_DESCRIPTION;

	/**
	 * The number of operations of the '<em>Exp Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int EXP_DETAIL_OPERATION_COUNT = BaseCSTPackage.DETAIL_CS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int EXP_DETAIL___GET_DESCRIPTION = BaseCSTPackage.DETAIL_CS___GET_DESCRIPTION;

	/**
	 * The number of operations of the '<em>Exp Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int EXP_DETAIL_OPERATION_COUNT = BaseCSTPackage.DETAIL_CS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int EXP_DETAIL___GET_DESCRIPTION = BaseCSTPackage.DETAIL_CS___GET_DESCRIPTION;

	/**
	 * The number of operations of the '<em>Exp Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int EXP_DETAIL_OPERATION_COUNT = BaseCSTPackage.DETAIL_CS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int CONFIG_ANNO___GET_DESCRIPTION = BaseCSTPackage.A//.ANNOTATION_CS___GET_DESCRIPTION;

	/**
	 * The number of operations of the '<em>Config Anno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int CONFIG_ANNO_OPERATION_COUNT = BaseCSTPackage.ANNOTATION_CS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.modelbased.constraintext.ConfigAnno <em>Config Anno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Anno</em>'.
	 * @see net.modelbased.constraintext.ConfigAnno
	 * @generated
	 */
	EClass getConfigAnno();

	/**
	 * Returns the meta object for class '{@link net.modelbased.constraintext.ExpDetail <em>Exp Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exp Detail</em>'.
	 * @see net.modelbased.constraintext.ExpDetail
	 * @generated
	 */
	EClass getExpDetail();

	/**
	 * Returns the meta object for the containment reference list '{@link net.modelbased.constraintext.ExpDetail#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expr</em>'.
	 * @see net.modelbased.constraintext.ExpDetail#getExpr()
	 * @see #getExpDetail()
	 * @generated
	 */
	EReference getExpDetail_Expr();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConstraintExtFactory getConstraintExtFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.modelbased.constraintext.impl.ConfigAnnoImpl <em>Config Anno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.modelbased.constraintext.impl.ConfigAnnoImpl
		 * @see net.modelbased.constraintext.impl.ConstraintExtPackageImpl#getConfigAnno()
		 * @generated
		 */
		EClass CONFIG_ANNO = eINSTANCE.getConfigAnno();
		/**
		 * The meta object literal for the '{@link net.modelbased.constraintext.impl.ExpDetailImpl <em>Exp Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.modelbased.constraintext.impl.ExpDetailImpl
		 * @see net.modelbased.constraintext.impl.ConstraintExtPackageImpl#getExpDetail()
		 * @generated
		 */
		EClass EXP_DETAIL = eINSTANCE.getExpDetail();
		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXP_DETAIL__EXPR = eINSTANCE.getExpDetail_Expr();

	}

} //ConstraintExtPackage
