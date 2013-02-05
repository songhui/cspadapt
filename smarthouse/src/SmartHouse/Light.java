/**
 */
package SmartHouse;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SmartHouse.Light#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see SmartHouse.SmartHousePackage#getLight()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='User__LightWideOpen'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot User__LightWideOpen='level <> 0 implies level = 5'"
 * @generated
 */
public interface Light extends EObject {
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
	 * @see SmartHouse.SmartHousePackage#getLight_Level()
	 * @model required="true" ordered="false"
	 *        annotation="config domain='0..10'"
	 * @generated
	 */
	BigInteger getLevel();

	/**
	 * Sets the value of the '{@link SmartHouse.Light#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(BigInteger value);

} // Light
