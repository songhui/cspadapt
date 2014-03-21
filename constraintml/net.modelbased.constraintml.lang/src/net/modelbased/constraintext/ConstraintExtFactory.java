/**
 */
package net.modelbased.constraintext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.modelbased.constraintext.ConstraintExtPackage
 * @generated
 */
public interface ConstraintExtFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintExtFactory eINSTANCE = net.modelbased.constraintext.impl.ConstraintExtFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Config Anno</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Anno</em>'.
	 * @generated
	 */
	ConfigAnno createConfigAnno();

	/**
	 * Returns a new object of class '<em>Exp Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exp Detail</em>'.
	 * @generated
	 */
	ExpDetail createExpDetail();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConstraintExtPackage getConstraintExtPackage();

} //ConstraintExtFactory
