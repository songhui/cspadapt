/**
 */
package VmPlacement;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link VmPlacement.PM#getName <em>Name</em>}</li>
 *   <li>{@link VmPlacement.PM#getRes <em>Res</em>}</li>
 *   <li>{@link VmPlacement.PM#getNear <em>Near</em>}</li>
 *   <li>{@link VmPlacement.PM#getHost <em>Host</em>}</li>
 * </ul>
 * </p>
 *
 * @see VmPlacement.VmPlacementPackage#getPM()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ResourceLimit'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ResourceLimit='\n\t\t\thost->collect(e | e.req)->sum() <= res'"
 * @generated
 */
public interface PM extends EObject {
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
	 * @see VmPlacement.VmPlacementPackage#getPM_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link VmPlacement.PM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res</em>' attribute.
	 * @see #setRes(BigInteger)
	 * @see VmPlacement.VmPlacementPackage#getPM_Res()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getRes();

	/**
	 * Sets the value of the '{@link VmPlacement.PM#getRes <em>Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res</em>' attribute.
	 * @see #getRes()
	 * @generated
	 */
	void setRes(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Near</b></em>' reference list.
	 * The list contents are of type {@link VmPlacement.PM}.
	 * It is bidirectional and its opposite is '{@link VmPlacement.PM#getNear <em>Near</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Near</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Near</em>' reference list.
	 * @see VmPlacement.VmPlacementPackage#getPM_Near()
	 * @see VmPlacement.PM#getNear
	 * @model opposite="near" ordered="false"
	 * @generated
	 */
	EList<PM> getNear();

	/**
	 * Returns the value of the '<em><b>Host</b></em>' reference list.
	 * The list contents are of type {@link VmPlacement.VM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' reference list.
	 * @see VmPlacement.VmPlacementPackage#getPM_Host()
	 * @model derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='VM.allInstances()->select(e | e.plc = self)'"
	 * @generated
	 */
	EList<VM> getHost();

} // PM
