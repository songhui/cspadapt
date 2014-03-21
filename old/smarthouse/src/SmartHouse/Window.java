/**
 */
package SmartHouse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SmartHouse.Window#getName <em>Name</em>}</li>
 *   <li>{@link SmartHouse.Window#isCurtainOn <em>Curtain On</em>}</li>
 *   <li>{@link SmartHouse.Window#isOpened <em>Opened</em>}</li>
 * </ul>
 * </p>
 *
 * @see SmartHouse.SmartHousePackage#getWindow()
 * @model
 * @generated
 */
public interface Window extends EObject {
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
	 * @see SmartHouse.SmartHousePackage#getWindow_Name()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SmartHouse.Window#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Curtain On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curtain On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curtain On</em>' attribute.
	 * @see #setCurtainOn(boolean)
	 * @see SmartHouse.SmartHousePackage#getWindow_CurtainOn()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCurtainOn();

	/**
	 * Sets the value of the '{@link SmartHouse.Window#isCurtainOn <em>Curtain On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curtain On</em>' attribute.
	 * @see #isCurtainOn()
	 * @generated
	 */
	void setCurtainOn(boolean value);

	/**
	 * Returns the value of the '<em><b>Opened</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opened</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opened</em>' attribute.
	 * @see #setOpened(boolean)
	 * @see SmartHouse.SmartHousePackage#getWindow_Opened()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isOpened();

	/**
	 * Sets the value of the '{@link SmartHouse.Window#isOpened <em>Opened</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opened</em>' attribute.
	 * @see #isOpened()
	 * @generated
	 */
	void setOpened(boolean value);

} // Window
