/**
 */
package SmartHouse;

import java.math.BigDecimal;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SmartHouse.Room#getTemp <em>Temp</em>}</li>
 *   <li>{@link SmartHouse.Room#getBright <em>Bright</em>}</li>
 *   <li>{@link SmartHouse.Room#getAir <em>Air</em>}</li>
 *   <li>{@link SmartHouse.Room#getName <em>Name</em>}</li>
 *   <li>{@link SmartHouse.Room#getHouse <em>House</em>}</li>
 *   <li>{@link SmartHouse.Room#getWindow <em>Window</em>}</li>
 *   <li>{@link SmartHouse.Room#getHeating <em>Heating</em>}</li>
 *   <li>{@link SmartHouse.Room#getLight <em>Light</em>}</li>
 *   <li>{@link SmartHouse.Room#getAc <em>Ac</em>}</li>
 *   <li>{@link SmartHouse.Room#getOccupied <em>Occupied</em>}</li>
 *   <li>{@link SmartHouse.Room#getSensor <em>Sensor</em>}</li>
 *   <li>{@link SmartHouse.Room#getProjector <em>Projector</em>}</li>
 *   <li>{@link SmartHouse.Room#getCooker <em>Cooker</em>}</li>
 *   <li>{@link SmartHouse.Room#getWm <em>Wm</em>}</li>
 *   <li>{@link SmartHouse.Room#getCm <em>Cm</em>}</li>
 * </ul>
 * </p>
 *
 * @see SmartHouse.SmartHousePackage#getRoom()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TooColdNeedHeating ExtremelyColdNeedMoreHeating NoWindowOpenWhenHeating NoWindowOpenWhenHeating NoHeatingAndCoolingTogether TooLateNoShouting ProjectingInDarkness INeedFreshAir TooColdToOpenWindow User__AlwaysOpenWindow User__AlwaysTurnOnFirstHeating User__ILoveCurtains'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TooColdNeedHeating='temp < 18 implies heating->exists(e : Heating | e.level > 0)' ExtremelyColdNeedMoreHeating='temp < 10 implies heating.level->sum() > 3 * heating->size()' NoWindowOpenWhenHeating='window->forAll(e : Window | e.opened = false) or ac->forAll(e : AirConditioner | e.level = 0)' NoHeatingAndCoolingTogether='heating->forAll(e : Heating | e.level = 0) or ac->forAll(e : AirConditioner | e.level = 0)' TooLateNoShouting='house.time > 22 implies projector.volume < 4' ProjectingInDarkness='projector.on and bright > 500 implies light->forAll(e : Light | e.level = 0) and window->forAll(e : Window | e.curtainOn)' INeedFreshAir='air > 5 implies window->exists(e : Window | e.opened)' TooColdToOpenWindow='house.outtemp > 5 or window->forAll(e : Window | not e.opened)' User__AlwaysOpenWindow='air > 6 and house.outtemp >= 10 implies window->asSequence()->first().opened = true' User__AlwaysTurnOnFirstHeating='temp < 10 and house.eprice < 20 implies heating->asSequence()->first().level = 10' User__ILoveCurtains='projector.on implies window->asSequence()->first().curtainOn = true'"
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp</em>' attribute.
	 * @see #setTemp(double)
	 * @see SmartHouse.SmartHousePackage#getRoom_Temp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getTemp();

	/**
	 * Sets the value of the '{@link SmartHouse.Room#getTemp <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp</em>' attribute.
	 * @see #getTemp()
	 * @generated
	 */
	void setTemp(double value);

	/**
	 * Returns the value of the '<em><b>Bright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bright</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bright</em>' attribute.
	 * @see #setBright(BigDecimal)
	 * @see SmartHouse.SmartHousePackage#getRoom_Bright()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigDecimal getBright();

	/**
	 * Sets the value of the '{@link SmartHouse.Room#getBright <em>Bright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bright</em>' attribute.
	 * @see #getBright()
	 * @generated
	 */
	void setBright(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Air</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Air</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air</em>' attribute.
	 * @see #setAir(int)
	 * @see SmartHouse.SmartHousePackage#getRoom_Air()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getAir();

	/**
	 * Sets the value of the '{@link SmartHouse.Room#getAir <em>Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air</em>' attribute.
	 * @see #getAir()
	 * @generated
	 */
	void setAir(int value);

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
	 * @see SmartHouse.SmartHousePackage#getRoom_Name()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SmartHouse.Room#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>House</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SmartHouse.House#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' container reference.
	 * @see #setHouse(House)
	 * @see SmartHouse.SmartHousePackage#getRoom_House()
	 * @see SmartHouse.House#getRoom
	 * @model opposite="room" transient="false" ordered="false"
	 * @generated
	 */
	House getHouse();

	/**
	 * Sets the value of the '{@link SmartHouse.Room#getHouse <em>House</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House</em>' container reference.
	 * @see #getHouse()
	 * @generated
	 */
	void setHouse(House value);

	/**
	 * Returns the value of the '<em><b>Window</b></em>' containment reference list.
	 * The list contents are of type {@link SmartHouse.Window}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window</em>' containment reference list.
	 * @see SmartHouse.SmartHousePackage#getRoom_Window()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Window> getWindow();

	/**
	 * Returns the value of the '<em><b>Heating</b></em>' containment reference list.
	 * The list contents are of type {@link SmartHouse.Heating}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heating</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heating</em>' containment reference list.
	 * @see SmartHouse.SmartHousePackage#getRoom_Heating()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Heating> getHeating();

	/**
	 * Returns the value of the '<em><b>Light</b></em>' containment reference list.
	 * The list contents are of type {@link SmartHouse.Light}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' containment reference list.
	 * @see SmartHouse.SmartHousePackage#getRoom_Light()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Light> getLight();

	/**
	 * Returns the value of the '<em><b>Ac</b></em>' containment reference list.
	 * The list contents are of type {@link SmartHouse.AirConditioner}.
	 * It is bidirectional and its opposite is '{@link SmartHouse.AirConditioner#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ac</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ac</em>' containment reference list.
	 * @see SmartHouse.SmartHousePackage#getRoom_Ac()
	 * @see SmartHouse.AirConditioner#getRoom
	 * @model opposite="room" containment="true" ordered="false"
	 * @generated
	 */
	EList<AirConditioner> getAc();

	/**
	 * Returns the value of the '<em><b>Occupied</b></em>' reference list.
	 * The list contents are of type {@link SmartHouse.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupied</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupied</em>' reference list.
	 * @see SmartHouse.SmartHousePackage#getRoom_Occupied()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Person> getOccupied();

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link SmartHouse.Sensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' containment reference list.
	 * @see SmartHouse.SmartHousePackage#getRoom_Sensor()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Sensor> getSensor();

	/**
	 * Returns the value of the '<em><b>Projector</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link SmartHouse.Projector#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projector</em>' containment reference.
	 * @see #setProjector(Projector)
	 * @see SmartHouse.SmartHousePackage#getRoom_Projector()
	 * @see SmartHouse.Projector#getRoom
	 * @model opposite="room" containment="true" required="true" ordered="false"
	 * @generated
	 */
	Projector getProjector();

	/**
	 * Sets the value of the '{@link SmartHouse.Room#getProjector <em>Projector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projector</em>' containment reference.
	 * @see #getProjector()
	 * @generated
	 */
	void setProjector(Projector value);

	/**
	 * Returns the value of the '<em><b>Cooker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cooker</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooker</em>' containment reference.
	 * @see #setCooker(Cooker)
	 * @see SmartHouse.SmartHousePackage#getRoom_Cooker()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Cooker getCooker();

	/**
	 * Sets the value of the '{@link SmartHouse.Room#getCooker <em>Cooker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooker</em>' containment reference.
	 * @see #getCooker()
	 * @generated
	 */
	void setCooker(Cooker value);

	/**
	 * Returns the value of the '<em><b>Wm</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link SmartHouse.WashingMachine#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wm</em>' containment reference.
	 * @see #setWm(WashingMachine)
	 * @see SmartHouse.SmartHousePackage#getRoom_Wm()
	 * @see SmartHouse.WashingMachine#getRoom
	 * @model opposite="room" containment="true" ordered="false"
	 * @generated
	 */
	WashingMachine getWm();

	/**
	 * Sets the value of the '{@link SmartHouse.Room#getWm <em>Wm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wm</em>' containment reference.
	 * @see #getWm()
	 * @generated
	 */
	void setWm(WashingMachine value);

	/**
	 * Returns the value of the '<em><b>Cm</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link SmartHouse.CoffeeMaker#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cm</em>' containment reference.
	 * @see #setCm(CoffeeMaker)
	 * @see SmartHouse.SmartHousePackage#getRoom_Cm()
	 * @see SmartHouse.CoffeeMaker#getRoom
	 * @model opposite="room" containment="true" ordered="false"
	 * @generated
	 */
	CoffeeMaker getCm();

	/**
	 * Sets the value of the '{@link SmartHouse.Room#getCm <em>Cm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cm</em>' containment reference.
	 * @see #getCm()
	 * @generated
	 */
	void setCm(CoffeeMaker value);

} // Room
