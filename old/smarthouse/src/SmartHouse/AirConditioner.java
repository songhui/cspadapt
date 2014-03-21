/**
 */
package SmartHouse;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Air Conditioner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SmartHouse.AirConditioner#getLevel <em>Level</em>}</li>
 *   <li>{@link SmartHouse.AirConditioner#isFreshAir <em>Fresh Air</em>}</li>
 *   <li>{@link SmartHouse.AirConditioner#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @see SmartHouse.SmartHousePackage#getAirConditioner()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TooHotOpenAC CodeNoAC HotOutside User__HotOutside'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TooHotOpenAC='room.temp > 28 implies level > 5' CodeNoAC='room.temp < 23 implies level = 0' HotOutside='room.house.outtemp > 30 implies level > 5' User__HotOutside='level > 0 implies level = 9'"
 * @generated
 */
public interface AirConditioner extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(BigInteger)
	 * @see SmartHouse.SmartHousePackage#getAirConditioner_Level()
	 * @model required="true" ordered="false"
	 *        annotation="config domain='0..10'"
	 * @generated
	 */
	BigInteger getLevel();

	/**
	 * Sets the value of the '{@link SmartHouse.AirConditioner#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Fresh Air</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fresh Air</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fresh Air</em>' attribute.
	 * @see #setFreshAir(boolean)
	 * @see SmartHouse.SmartHousePackage#getAirConditioner_FreshAir()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isFreshAir();

	/**
	 * Sets the value of the '{@link SmartHouse.AirConditioner#isFreshAir <em>Fresh Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fresh Air</em>' attribute.
	 * @see #isFreshAir()
	 * @generated
	 */
	void setFreshAir(boolean value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SmartHouse.Room#getAc <em>Ac</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' container reference.
	 * @see #setRoom(Room)
	 * @see SmartHouse.SmartHousePackage#getAirConditioner_Room()
	 * @see SmartHouse.Room#getAc
	 * @model opposite="ac" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link SmartHouse.AirConditioner#getRoom <em>Room</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' container reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

} // AirConditioner
