/**
 */
package SmartHouse;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SmartHouse.House#getName <em>Name</em>}</li>
 *   <li>{@link SmartHouse.House#getEprice <em>Eprice</em>}</li>
 *   <li>{@link SmartHouse.House#getTime <em>Time</em>}</li>
 *   <li>{@link SmartHouse.House#getOuttemp <em>Outtemp</em>}</li>
 *   <li>{@link SmartHouse.House#getRoom <em>Room</em>}</li>
 *   <li>{@link SmartHouse.House#getMember <em>Member</em>}</li>
 *   <li>{@link SmartHouse.House#getWh <em>Wh</em>}</li>
 *   <li>{@link SmartHouse.House#getEv <em>Ev</em>}</li>
 *   <li>{@link SmartHouse.House#getGate <em>Gate</em>}</li>
 *   <li>{@link SmartHouse.House#getSec <em>Sec</em>}</li>
 * </ul>
 * </p>
 *
 * @see SmartHouse.SmartHousePackage#getHouse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TooExpensiveToUseThemTogether SuperExpensiveNotUseAnything WatchDog NoWindowOpenWhenSecOn User__VeryNotSafe'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TooExpensiveToUseThemTogether='eprice > 15 implies ev->forAll(e : EV | e.charging = false) or not wh.on or room.heating->flatten()->forAll(e : Heating | e.level < 3)' SuperExpensiveNotUseAnything='eprice > 20 implies ev->forAll(e : EV | e.charging = false) and not wh.on and room.heating->flatten()->forAll(e : Heating | e.level = 0)' WatchDog='gate.outlocked implies sec.on' NoWindowOpenWhenSecOn='sec.on implies room->select(e : Room | e.name = \'liv\').window->flatten()->forAll(e : Window | e.opened = false)' User__VeryNotSafe='gate.outlocked implies sec.on = true'"
 * @generated
 */
public interface House extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SmartHouse.SmartHousePackage#getHouse_Name()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SmartHouse.House#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Eprice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eprice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eprice</em>' attribute.
	 * @see #setEprice(BigDecimal)
	 * @see SmartHouse.SmartHousePackage#getHouse_Eprice()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigDecimal getEprice();

	/**
	 * Sets the value of the '{@link SmartHouse.House#getEprice <em>Eprice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eprice</em>' attribute.
	 * @see #getEprice()
	 * @generated
	 */
	void setEprice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(BigInteger)
	 * @see SmartHouse.SmartHousePackage#getHouse_Time()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigInteger getTime();

	/**
	 * Sets the value of the '{@link SmartHouse.House#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Outtemp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outtemp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outtemp</em>' attribute.
	 * @see #setOuttemp(BigDecimal)
	 * @see SmartHouse.SmartHousePackage#getHouse_Outtemp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigDecimal getOuttemp();

	/**
	 * Sets the value of the '{@link SmartHouse.House#getOuttemp <em>Outtemp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outtemp</em>' attribute.
	 * @see #getOuttemp()
	 * @generated
	 */
	void setOuttemp(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' containment reference list.
	 * The list contents are of type {@link SmartHouse.Room}.
	 * It is bidirectional and its opposite is '{@link SmartHouse.Room#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' containment reference list.
	 * @see SmartHouse.SmartHousePackage#getHouse_Room()
	 * @see SmartHouse.Room#getHouse
	 * @model opposite="house" containment="true" ordered="false"
	 * @generated
	 */
	EList<Room> getRoom();

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link SmartHouse.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see SmartHouse.SmartHousePackage#getHouse_Member()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Person> getMember();

	/**
	 * Returns the value of the '<em><b>Wh</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link SmartHouse.WaterHeater#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wh</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wh</em>' containment reference.
	 * @see #setWh(WaterHeater)
	 * @see SmartHouse.SmartHousePackage#getHouse_Wh()
	 * @see SmartHouse.WaterHeater#getHouse
	 * @model opposite="house" containment="true" ordered="false"
	 * @generated
	 */
	WaterHeater getWh();

	/**
	 * Sets the value of the '{@link SmartHouse.House#getWh <em>Wh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wh</em>' containment reference.
	 * @see #getWh()
	 * @generated
	 */
	void setWh(WaterHeater value);

	/**
	 * Returns the value of the '<em><b>Ev</b></em>' containment reference list.
	 * The list contents are of type {@link SmartHouse.EV}.
	 * It is bidirectional and its opposite is '{@link SmartHouse.EV#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ev</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ev</em>' containment reference list.
	 * @see SmartHouse.SmartHousePackage#getHouse_Ev()
	 * @see SmartHouse.EV#getHouse
	 * @model opposite="house" containment="true" ordered="false"
	 * @generated
	 */
	EList<EV> getEv();

	/**
	 * Returns the value of the '<em><b>Gate</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link SmartHouse.Gate#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate</em>' containment reference.
	 * @see #setGate(Gate)
	 * @see SmartHouse.SmartHousePackage#getHouse_Gate()
	 * @see SmartHouse.Gate#getHouse
	 * @model opposite="house" containment="true" ordered="false"
	 * @generated
	 */
	Gate getGate();

	/**
	 * Sets the value of the '{@link SmartHouse.House#getGate <em>Gate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gate</em>' containment reference.
	 * @see #getGate()
	 * @generated
	 */
	void setGate(Gate value);

	/**
	 * Returns the value of the '<em><b>Sec</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link SmartHouse.Security#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sec</em>' containment reference.
	 * @see #setSec(Security)
	 * @see SmartHouse.SmartHousePackage#getHouse_Sec()
	 * @see SmartHouse.Security#getHouse
	 * @model opposite="house" containment="true" ordered="false"
	 * @generated
	 */
	Security getSec();

	/**
	 * Sets the value of the '{@link SmartHouse.House#getSec <em>Sec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sec</em>' containment reference.
	 * @see #getSec()
	 * @generated
	 */
	void setSec(Security value);

} // House
