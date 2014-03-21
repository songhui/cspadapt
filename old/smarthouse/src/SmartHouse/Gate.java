/**
 */
package SmartHouse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SmartHouse.Gate#isOutlocked <em>Outlocked</em>}</li>
 *   <li>{@link SmartHouse.Gate#getHouse <em>House</em>}</li>
 * </ul>
 * </p>
 *
 * @see SmartHouse.SmartHousePackage#getGate()
 * @model
 * @generated
 */
public interface Gate extends EObject {
	/**
	 * Returns the value of the '<em><b>Outlocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outlocked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outlocked</em>' attribute.
	 * @see #setOutlocked(boolean)
	 * @see SmartHouse.SmartHousePackage#getGate_Outlocked()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isOutlocked();

	/**
	 * Sets the value of the '{@link SmartHouse.Gate#isOutlocked <em>Outlocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outlocked</em>' attribute.
	 * @see #isOutlocked()
	 * @generated
	 */
	void setOutlocked(boolean value);

	/**
	 * Returns the value of the '<em><b>House</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SmartHouse.House#getGate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' container reference.
	 * @see #setHouse(House)
	 * @see SmartHouse.SmartHousePackage#getGate_House()
	 * @see SmartHouse.House#getGate
	 * @model opposite="gate" required="true" transient="false" ordered="false"
	 * @generated
	 */
	House getHouse();

	/**
	 * Sets the value of the '{@link SmartHouse.Gate#getHouse <em>House</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House</em>' container reference.
	 * @see #getHouse()
	 * @generated
	 */
	void setHouse(House value);

} // Gate
