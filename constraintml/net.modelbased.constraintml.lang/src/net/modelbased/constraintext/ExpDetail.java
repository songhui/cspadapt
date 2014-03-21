/**
 */
package net.modelbased.constraintext;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.examples.xtext.base.baseCST.DetailCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.SpecificationCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.modelbased.constraintext.ExpDetail#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.modelbased.constraintext.ConstraintExtPackage#getExpDetail()
 * @model
 * @generated
 */
public interface ExpDetail extends DetailCS {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.xtext.base.baseCST.SpecificationCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference list.
	 * @see net.modelbased.constraintext.ConstraintExtPackage#getExpDetail_Expr()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecificationCS> getExpr();

} // ExpDetail
