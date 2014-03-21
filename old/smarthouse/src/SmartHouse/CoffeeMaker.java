/**
 */
package SmartHouse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coffee Maker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SmartHouse.CoffeeMaker#isLoaded <em>Loaded</em>}</li>
 *   <li>{@link SmartHouse.CoffeeMaker#isOn <em>On</em>}</li>
 *   <li>{@link SmartHouse.CoffeeMaker#isWarming <em>Warming</em>}</li>
 *   <li>{@link SmartHouse.CoffeeMaker#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @see SmartHouse.SmartHousePackage#getCoffeeMaker()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MakeCoffeeForMeInTheMorning NoCarNoCoffee KeepItWarm KeepItWarm User__IWantWarmed'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot MakeCoffeeForMeInTheMorning='room.house.time = 7 and loaded implies on' NoCarNoCoffee='room.house.ev->exists(e : EV | e.pluged) or on' KeepItWarm='room.temp > 20 implies not warming' User__IWantWarmed='loaded implies warming = true'"
 * @generated
 */
public interface CoffeeMaker extends EObject {
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
	 * @see SmartHouse.SmartHousePackage#getCoffeeMaker_Loaded()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isLoaded();

	/**
	 * Sets the value of the '{@link SmartHouse.CoffeeMaker#isLoaded <em>Loaded</em>}' attribute.
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
	 * @see SmartHouse.SmartHousePackage#getCoffeeMaker_On()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isOn();

	/**
	 * Sets the value of the '{@link SmartHouse.CoffeeMaker#isOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' attribute.
	 * @see #isOn()
	 * @generated
	 */
	void setOn(boolean value);

	/**
	 * Returns the value of the '<em><b>Warming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warming</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warming</em>' attribute.
	 * @see #setWarming(boolean)
	 * @see SmartHouse.SmartHousePackage#getCoffeeMaker_Warming()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isWarming();

	/**
	 * Sets the value of the '{@link SmartHouse.CoffeeMaker#isWarming <em>Warming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warming</em>' attribute.
	 * @see #isWarming()
	 * @generated
	 */
	void setWarming(boolean value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SmartHouse.Room#getCm <em>Cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' container reference.
	 * @see #setRoom(Room)
	 * @see SmartHouse.SmartHousePackage#getCoffeeMaker_Room()
	 * @see SmartHouse.Room#getCm
	 * @model opposite="cm" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link SmartHouse.CoffeeMaker#getRoom <em>Room</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' container reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

} // CoffeeMaker
