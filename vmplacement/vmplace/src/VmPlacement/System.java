/**
 */
package VmPlacement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link VmPlacement.System#getName <em>Name</em>}</li>
 *   <li>{@link VmPlacement.System#getVm <em>Vm</em>}</li>
 *   <li>{@link VmPlacement.System#getPm <em>Pm</em>}</li>
 *   <li>{@link VmPlacement.System#getApp <em>App</em>}</li>
 * </ul>
 * </p>
 *
 * @see VmPlacement.VmPlacementPackage#getSystem()
 * @model annotation="weight ResourceConstraint='-1'"
 * @generated
 */
public interface System extends EObject {
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
	 * @see VmPlacement.VmPlacementPackage#getSystem_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link VmPlacement.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Vm</b></em>' containment reference list.
	 * The list contents are of type {@link VmPlacement.VM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm</em>' containment reference list.
	 * @see VmPlacement.VmPlacementPackage#getSystem_Vm()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VM> getVm();

	/**
	 * Returns the value of the '<em><b>Pm</b></em>' containment reference list.
	 * The list contents are of type {@link VmPlacement.PM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pm</em>' containment reference list.
	 * @see VmPlacement.VmPlacementPackage#getSystem_Pm()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PM> getPm();

	/**
	 * Returns the value of the '<em><b>App</b></em>' containment reference list.
	 * The list contents are of type {@link VmPlacement.App}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App</em>' containment reference list.
	 * @see VmPlacement.VmPlacementPackage#getSystem_App()
	 * @model containment="true"
	 * @generated
	 */
	EList<App> getApp();

} // System
