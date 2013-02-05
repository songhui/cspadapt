/**
 */
package SmartHouse;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SmartHouse.Sensor#isTemp <em>Temp</em>}</li>
 *   <li>{@link SmartHouse.Sensor#isAir <em>Air</em>}</li>
 *   <li>{@link SmartHouse.Sensor#isBrightness <em>Brightness</em>}</li>
 *   <li>{@link SmartHouse.Sensor#getBattery <em>Battery</em>}</li>
 *   <li>{@link SmartHouse.Sensor#getCircle <em>Circle</em>}</li>
 * </ul>
 * </p>
 *
 * @see SmartHouse.SmartHousePackage#getSensor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RunningOutOfPower'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot RunningOutOfPower='battery < 20 implies circle < 30'"
 * @generated
 */
public interface Sensor extends EObject {
	/**
	 * Returns the value of the '<em><b>Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp</em>' attribute.
	 * @see #setTemp(boolean)
	 * @see SmartHouse.SmartHousePackage#getSensor_Temp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isTemp();

	/**
	 * Sets the value of the '{@link SmartHouse.Sensor#isTemp <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp</em>' attribute.
	 * @see #isTemp()
	 * @generated
	 */
	void setTemp(boolean value);

	/**
	 * Returns the value of the '<em><b>Air</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Air</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air</em>' attribute.
	 * @see #setAir(boolean)
	 * @see SmartHouse.SmartHousePackage#getSensor_Air()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isAir();

	/**
	 * Sets the value of the '{@link SmartHouse.Sensor#isAir <em>Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air</em>' attribute.
	 * @see #isAir()
	 * @generated
	 */
	void setAir(boolean value);

	/**
	 * Returns the value of the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brightness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brightness</em>' attribute.
	 * @see #setBrightness(boolean)
	 * @see SmartHouse.SmartHousePackage#getSensor_Brightness()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isBrightness();

	/**
	 * Sets the value of the '{@link SmartHouse.Sensor#isBrightness <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brightness</em>' attribute.
	 * @see #isBrightness()
	 * @generated
	 */
	void setBrightness(boolean value);

	/**
	 * Returns the value of the '<em><b>Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery</em>' attribute.
	 * @see #setBattery(BigInteger)
	 * @see SmartHouse.SmartHousePackage#getSensor_Battery()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigInteger getBattery();

	/**
	 * Sets the value of the '{@link SmartHouse.Sensor#getBattery <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery</em>' attribute.
	 * @see #getBattery()
	 * @generated
	 */
	void setBattery(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Circle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circle</em>' attribute.
	 * @see #setCircle(BigDecimal)
	 * @see SmartHouse.SmartHousePackage#getSensor_Circle()
	 * @model required="true" ordered="false"
	 *        annotation="config domain='0..10'"
	 * @generated
	 */
	BigDecimal getCircle();

	/**
	 * Sets the value of the '{@link SmartHouse.Sensor#getCircle <em>Circle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circle</em>' attribute.
	 * @see #getCircle()
	 * @generated
	 */
	void setCircle(BigDecimal value);

} // Sensor
