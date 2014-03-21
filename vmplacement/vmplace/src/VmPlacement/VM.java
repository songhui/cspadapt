/**
 */
package VmPlacement;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link VmPlacement.VM#getName <em>Name</em>}</li>
 *   <li>{@link VmPlacement.VM#getReq <em>Req</em>}</li>
 *   <li>{@link VmPlacement.VM#getPlc <em>Plc</em>}</li>
 *   <li>{@link VmPlacement.VM#getBackup <em>Backup</em>}</li>
 *   <li>{@link VmPlacement.VM#getFrequent <em>Frequent</em>}</li>
 *   <li>{@link VmPlacement.VM#getHost <em>Host</em>}</li>
 * </ul>
 * </p>
 *
 * @see VmPlacement.VmPlacementPackage#getVM()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='BackupSplit FrequentCloser'"
 *        annotation="weight BackupSlit='100' plc='req * 10'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot BackupSplit='backup->forAll(vm : VM | self.plc <> vm.plc)' FrequentCloser='frequent->forAll(v : VM | self.plc.near->includes(v.plc) or self.plc = v.plc)'"
 * @generated
 */
public interface VM extends EObject {
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
	 * @see VmPlacement.VmPlacementPackage#getVM_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link VmPlacement.VM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req</em>' attribute.
	 * @see #setReq(BigInteger)
	 * @see VmPlacement.VmPlacementPackage#getVM_Req()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getReq();

	/**
	 * Sets the value of the '{@link VmPlacement.VM#getReq <em>Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req</em>' attribute.
	 * @see #getReq()
	 * @generated
	 */
	void setReq(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Plc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plc</em>' reference.
	 * @see #setPlc(PM)
	 * @see VmPlacement.VmPlacementPackage#getVM_Plc()
	 * @model required="true"
	 * @generated
	 */
	PM getPlc();

	/**
	 * Sets the value of the '{@link VmPlacement.VM#getPlc <em>Plc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plc</em>' reference.
	 * @see #getPlc()
	 * @generated
	 */
	void setPlc(PM value);

	/**
	 * Returns the value of the '<em><b>Backup</b></em>' reference list.
	 * The list contents are of type {@link VmPlacement.VM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backup</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backup</em>' reference list.
	 * @see VmPlacement.VmPlacementPackage#getVM_Backup()
	 * @model derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='VM.allInstances()->select(v|v.host.name = self.host.name and v<>self)'"
	 * @generated
	 */
	EList<VM> getBackup();

	/**
	 * Returns the value of the '<em><b>Frequent</b></em>' reference list.
	 * The list contents are of type {@link VmPlacement.VM}.
	 * It is bidirectional and its opposite is '{@link VmPlacement.VM#getFrequent <em>Frequent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequent</em>' reference list.
	 * @see VmPlacement.VmPlacementPackage#getVM_Frequent()
	 * @see VmPlacement.VM#getFrequent
	 * @model opposite="frequent" ordered="false"
	 * @generated
	 */
	EList<VM> getFrequent();

	/**
	 * Returns the value of the '<em><b>Host</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link VmPlacement.App#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' reference.
	 * @see #setHost(App)
	 * @see VmPlacement.VmPlacementPackage#getVM_Host()
	 * @see VmPlacement.App#getDestination
	 * @model opposite="destination" required="true"
	 * @generated
	 */
	App getHost();

	/**
	 * Sets the value of the '{@link VmPlacement.VM#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(App value);

} // VM
