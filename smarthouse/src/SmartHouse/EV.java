/**
 */
package SmartHouse;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SmartHouse.EV#getName <em>Name</em>}</li>
 *   <li>{@link SmartHouse.EV#isPluged <em>Pluged</em>}</li>
 *   <li>{@link SmartHouse.EV#getLevel <em>Level</em>}</li>
 *   <li>{@link SmartHouse.EV#isCharging <em>Charging</em>}</li>
 *   <li>{@link SmartHouse.EV#getHouse <em>House</em>}</li>
 * </ul>
 * </p>
 *
 * @see SmartHouse.SmartHousePackage#getEV()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LowLeveNeedCharge LowPricePleaseCharge'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot LowLeveNeedCharge='if pluged then level < 30 implies charging else true endif' LowPricePleaseCharge='if pluged then house.eprice < 10 implies charging else true endif'"
 * @generated
 */
public interface EV extends EObject {
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
	 * @see SmartHouse.SmartHousePackage#getEV_Name()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SmartHouse.EV#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pluged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pluged</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pluged</em>' attribute.
	 * @see #setPluged(boolean)
	 * @see SmartHouse.SmartHousePackage#getEV_Pluged()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isPluged();

	/**
	 * Sets the value of the '{@link SmartHouse.EV#isPluged <em>Pluged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pluged</em>' attribute.
	 * @see #isPluged()
	 * @generated
	 */
	void setPluged(boolean value);

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
	 * @see SmartHouse.SmartHousePackage#getEV_Level()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigInteger getLevel();

	/**
	 * Sets the value of the '{@link SmartHouse.EV#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Charging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charging</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charging</em>' attribute.
	 * @see #setCharging(boolean)
	 * @see SmartHouse.SmartHousePackage#getEV_Charging()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCharging();

	/**
	 * Sets the value of the '{@link SmartHouse.EV#isCharging <em>Charging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charging</em>' attribute.
	 * @see #isCharging()
	 * @generated
	 */
	void setCharging(boolean value);

	/**
	 * Returns the value of the '<em><b>House</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SmartHouse.House#getEv <em>Ev</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' container reference.
	 * @see #setHouse(House)
	 * @see SmartHouse.SmartHousePackage#getEV_House()
	 * @see SmartHouse.House#getEv
	 * @model opposite="ev" required="true" transient="false" ordered="false"
	 * @generated
	 */
	House getHouse();

	/**
	 * Sets the value of the '{@link SmartHouse.EV#getHouse <em>House</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House</em>' container reference.
	 * @see #getHouse()
	 * @generated
	 */
	void setHouse(House value);

} // EV
