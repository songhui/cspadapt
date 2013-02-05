/**
 */
package SmartHouse;

import java.math.BigInteger;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SmartHouse.Projector#isOn <em>On</em>}</li>
 *   <li>{@link SmartHouse.Projector#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link SmartHouse.Projector#getVolume <em>Volume</em>}</li>
 *   <li>{@link SmartHouse.Projector#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @see SmartHouse.SmartHousePackage#getProjector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TooNoisyToWatchTVWhenWashing'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TooNoisyToWatchTVWhenWashing='if room.wm <> null then not room.wm.on or not on else true endif'"
 * @generated
 */
public interface Projector extends EObject {
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
	 * @see SmartHouse.SmartHousePackage#getProjector_On()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isOn();

	/**
	 * Sets the value of the '{@link SmartHouse.Projector#isOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' attribute.
	 * @see #isOn()
	 * @generated
	 */
	void setOn(boolean value);

	/**
	 * Returns the value of the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brightness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brightness</em>' attribute.
	 * @see #setBrightness(BigInteger)
	 * @see SmartHouse.SmartHousePackage#getProjector_Brightness()
	 * @model required="true" ordered="false"
	 *        annotation="config domain='0..10'"
	 * @generated
	 */
	BigInteger getBrightness();

	/**
	 * Sets the value of the '{@link SmartHouse.Projector#getBrightness <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brightness</em>' attribute.
	 * @see #getBrightness()
	 * @generated
	 */
	void setBrightness(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(BigInteger)
	 * @see SmartHouse.SmartHousePackage#getProjector_Volume()
	 * @model required="true" ordered="false"
	 *        annotation="config domain='0..10'"
	 * @generated
	 */
	BigInteger getVolume();

	/**
	 * Sets the value of the '{@link SmartHouse.Projector#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SmartHouse.Room#getProjector <em>Projector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' container reference.
	 * @see #setRoom(Room)
	 * @see SmartHouse.SmartHousePackage#getProjector_Room()
	 * @see SmartHouse.Room#getProjector
	 * @model opposite="projector" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link SmartHouse.Projector#getRoom <em>Room</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' container reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

} // Projector
