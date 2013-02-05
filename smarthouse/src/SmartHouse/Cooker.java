/**
 */
package SmartHouse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cooker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SmartHouse.Cooker#isOn <em>On</em>}</li>
 * </ul>
 * </p>
 *
 * @see SmartHouse.SmartHousePackage#getCooker()
 * @model
 * @generated
 */
public interface Cooker extends EObject {
	/**
	 * Returns the value of the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' attribute.
	 * @see #setOn(boolean)
	 * @see SmartHouse.SmartHousePackage#getCooker_On()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isOn();

	/**
	 * Sets the value of the '{@link SmartHouse.Cooker#isOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' attribute.
	 * @see #isOn()
	 * @generated
	 */
	void setOn(boolean value);

} // Cooker
