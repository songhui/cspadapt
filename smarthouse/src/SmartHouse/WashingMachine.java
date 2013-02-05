/**
 */
package SmartHouse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Washing Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SmartHouse.WashingMachine#isLoaded <em>Loaded</em>}</li>
 *   <li>{@link SmartHouse.WashingMachine#isOn <em>On</em>}</li>
 *   <li>{@link SmartHouse.WashingMachine#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @see SmartHouse.SmartHousePackage#getWashingMachine()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnWhenLoaded User__WashImmediately'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OnWhenLoaded='loaded implies on' User__WashImmediately='loaded implies on = true'"
 * @generated
 */
public interface WashingMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loaded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loaded</em>' attribute.
	 * @see #setLoaded(boolean)
	 * @see SmartHouse.SmartHousePackage#getWashingMachine_Loaded()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isLoaded();

	/**
	 * Sets the value of the '{@link SmartHouse.WashingMachine#isLoaded <em>Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loaded</em>' attribute.
	 * @see #isLoaded()
	 * @generated
	 */
	void setLoaded(boolean value);

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
	 * @see SmartHouse.SmartHousePackage#getWashingMachine_On()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isOn();

	/**
	 * Sets the value of the '{@link SmartHouse.WashingMachine#isOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' attribute.
	 * @see #isOn()
	 * @generated
	 */
	void setOn(boolean value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SmartHouse.Room#getWm <em>Wm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' container reference.
	 * @see #setRoom(Room)
	 * @see SmartHouse.SmartHousePackage#getWashingMachine_Room()
	 * @see SmartHouse.Room#getWm
	 * @model opposite="wm" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link SmartHouse.WashingMachine#getRoom <em>Room</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' container reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

} // WashingMachine
