/**
 */
package SmartHouse;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Water Heater</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SmartHouse.WaterHeater#getTemp <em>Temp</em>}</li>
 *   <li>{@link SmartHouse.WaterHeater#isOn <em>On</em>}</li>
 *   <li>{@link SmartHouse.WaterHeater#isBoost <em>Boost</em>}</li>
 *   <li>{@link SmartHouse.WaterHeater#getHouse <em>House</em>}</li>
 * </ul>
 * </p>
 *
 * @see SmartHouse.SmartHousePackage#getWaterHeater()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DoNotHeatItForever ColdWaterNeedHeating INeedHotWaterInTheMorning User__HotWaterAlways'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot DoNotHeatItForever='temp < 50 or not on' ColdWaterNeedHeating='temp < 30 implies on' INeedHotWaterInTheMorning='house.time < 2 or house.time > 8 or on' User__HotWaterAlways='temp < 30 and (house.time < 2 or house.time > 8) implies on = true'"
 * @generated
 */
public interface WaterHeater extends EObject {
	/**
	 * Returns the value of the '<em><b>Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp</em>' attribute.
	 * @see #setTemp(BigDecimal)
	 * @see SmartHouse.SmartHousePackage#getWaterHeater_Temp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigDecimal getTemp();

	/**
	 * Sets the value of the '{@link SmartHouse.WaterHeater#getTemp <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp</em>' attribute.
	 * @see #getTemp()
	 * @generated
	 */
	void setTemp(BigDecimal value);

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
	 * @see SmartHouse.SmartHousePackage#getWaterHeater_On()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isOn();

	/**
	 * Sets the value of the '{@link SmartHouse.WaterHeater#isOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' attribute.
	 * @see #isOn()
	 * @generated
	 */
	void setOn(boolean value);

	/**
	 * Returns the value of the '<em><b>Boost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boost</em>' attribute.
	 * @see #setBoost(boolean)
	 * @see SmartHouse.SmartHousePackage#getWaterHeater_Boost()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isBoost();

	/**
	 * Sets the value of the '{@link SmartHouse.WaterHeater#isBoost <em>Boost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boost</em>' attribute.
	 * @see #isBoost()
	 * @generated
	 */
	void setBoost(boolean value);

	/**
	 * Returns the value of the '<em><b>House</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SmartHouse.House#getWh <em>Wh</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' container reference.
	 * @see #setHouse(House)
	 * @see SmartHouse.SmartHousePackage#getWaterHeater_House()
	 * @see SmartHouse.House#getWh
	 * @model opposite="wh" required="true" transient="false" ordered="false"
	 * @generated
	 */
	House getHouse();

	/**
	 * Sets the value of the '{@link SmartHouse.WaterHeater#getHouse <em>House</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House</em>' container reference.
	 * @see #getHouse()
	 * @generated
	 */
	void setHouse(House value);

} // WaterHeater
