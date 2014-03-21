/**
 */
package VmPlacement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see VmPlacement.VmPlacementFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface VmPlacementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "VmPlacement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sintef.no/ict/vmplacement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "VmPlacement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmPlacementPackage eINSTANCE = VmPlacement.impl.VmPlacementPackageImpl.init();

	/**
	 * The meta object id for the '{@link VmPlacement.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VmPlacement.impl.SystemImpl
	 * @see VmPlacement.impl.VmPlacementPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Vm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__VM = 1;

	/**
	 * The feature id for the '<em><b>Pm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PM = 2;

	/**
	 * The feature id for the '<em><b>App</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__APP = 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VmPlacement.impl.VMImpl <em>VM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VmPlacement.impl.VMImpl
	 * @see VmPlacement.impl.VmPlacementPackageImpl#getVM()
	 * @generated
	 */
	int VM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__REQ = 1;

	/**
	 * The feature id for the '<em><b>Plc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__PLC = 2;

	/**
	 * The feature id for the '<em><b>Backup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__BACKUP = 3;

	/**
	 * The feature id for the '<em><b>Frequent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__FREQUENT = 4;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__HOST = 5;

	/**
	 * The number of structural features of the '<em>VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VmPlacement.impl.PMImpl <em>PM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VmPlacement.impl.PMImpl
	 * @see VmPlacement.impl.VmPlacementPackageImpl#getPM()
	 * @generated
	 */
	int PM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PM__RES = 1;

	/**
	 * The feature id for the '<em><b>Near</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PM__NEAR = 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PM__HOST = 3;

	/**
	 * The number of structural features of the '<em>PM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>PM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PM_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link VmPlacement.impl.AppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VmPlacement.impl.AppImpl
	 * @see VmPlacement.impl.VmPlacementPackageImpl#getApp()
	 * @generated
	 */
	int APP = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__DESTINATION = 2;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link VmPlacement.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see VmPlacement.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link VmPlacement.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see VmPlacement.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link VmPlacement.System#getVm <em>Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vm</em>'.
	 * @see VmPlacement.System#getVm()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Vm();

	/**
	 * Returns the meta object for the containment reference list '{@link VmPlacement.System#getPm <em>Pm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pm</em>'.
	 * @see VmPlacement.System#getPm()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Pm();

	/**
	 * Returns the meta object for the containment reference list '{@link VmPlacement.System#getApp <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>App</em>'.
	 * @see VmPlacement.System#getApp()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_App();

	/**
	 * Returns the meta object for class '{@link VmPlacement.VM <em>VM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM</em>'.
	 * @see VmPlacement.VM
	 * @generated
	 */
	EClass getVM();

	/**
	 * Returns the meta object for the attribute '{@link VmPlacement.VM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see VmPlacement.VM#getName()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_Name();

	/**
	 * Returns the meta object for the attribute '{@link VmPlacement.VM#getReq <em>Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req</em>'.
	 * @see VmPlacement.VM#getReq()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_Req();

	/**
	 * Returns the meta object for the reference '{@link VmPlacement.VM#getPlc <em>Plc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plc</em>'.
	 * @see VmPlacement.VM#getPlc()
	 * @see #getVM()
	 * @generated
	 */
	EReference getVM_Plc();

	/**
	 * Returns the meta object for the reference list '{@link VmPlacement.VM#getBackup <em>Backup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Backup</em>'.
	 * @see VmPlacement.VM#getBackup()
	 * @see #getVM()
	 * @generated
	 */
	EReference getVM_Backup();

	/**
	 * Returns the meta object for the reference list '{@link VmPlacement.VM#getFrequent <em>Frequent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Frequent</em>'.
	 * @see VmPlacement.VM#getFrequent()
	 * @see #getVM()
	 * @generated
	 */
	EReference getVM_Frequent();

	/**
	 * Returns the meta object for the reference '{@link VmPlacement.VM#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see VmPlacement.VM#getHost()
	 * @see #getVM()
	 * @generated
	 */
	EReference getVM_Host();

	/**
	 * Returns the meta object for class '{@link VmPlacement.PM <em>PM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PM</em>'.
	 * @see VmPlacement.PM
	 * @generated
	 */
	EClass getPM();

	/**
	 * Returns the meta object for the attribute '{@link VmPlacement.PM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see VmPlacement.PM#getName()
	 * @see #getPM()
	 * @generated
	 */
	EAttribute getPM_Name();

	/**
	 * Returns the meta object for the attribute '{@link VmPlacement.PM#getRes <em>Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res</em>'.
	 * @see VmPlacement.PM#getRes()
	 * @see #getPM()
	 * @generated
	 */
	EAttribute getPM_Res();

	/**
	 * Returns the meta object for the reference list '{@link VmPlacement.PM#getNear <em>Near</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Near</em>'.
	 * @see VmPlacement.PM#getNear()
	 * @see #getPM()
	 * @generated
	 */
	EReference getPM_Near();

	/**
	 * Returns the meta object for the reference list '{@link VmPlacement.PM#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Host</em>'.
	 * @see VmPlacement.PM#getHost()
	 * @see #getPM()
	 * @generated
	 */
	EReference getPM_Host();

	/**
	 * Returns the meta object for class '{@link VmPlacement.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see VmPlacement.App
	 * @generated
	 */
	EClass getApp();

	/**
	 * Returns the meta object for the attribute '{@link VmPlacement.App#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see VmPlacement.App#getType()
	 * @see #getApp()
	 * @generated
	 */
	EAttribute getApp_Type();

	/**
	 * Returns the meta object for the attribute '{@link VmPlacement.App#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see VmPlacement.App#getName()
	 * @see #getApp()
	 * @generated
	 */
	EAttribute getApp_Name();

	/**
	 * Returns the meta object for the reference '{@link VmPlacement.App#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see VmPlacement.App#getDestination()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Destination();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VmPlacementFactory getVmPlacementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link VmPlacement.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VmPlacement.impl.SystemImpl
		 * @see VmPlacement.impl.VmPlacementPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Vm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__VM = eINSTANCE.getSystem_Vm();

		/**
		 * The meta object literal for the '<em><b>Pm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PM = eINSTANCE.getSystem_Pm();

		/**
		 * The meta object literal for the '<em><b>App</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__APP = eINSTANCE.getSystem_App();

		/**
		 * The meta object literal for the '{@link VmPlacement.impl.VMImpl <em>VM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VmPlacement.impl.VMImpl
		 * @see VmPlacement.impl.VmPlacementPackageImpl#getVM()
		 * @generated
		 */
		EClass VM = eINSTANCE.getVM();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__NAME = eINSTANCE.getVM_Name();

		/**
		 * The meta object literal for the '<em><b>Req</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__REQ = eINSTANCE.getVM_Req();

		/**
		 * The meta object literal for the '<em><b>Plc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM__PLC = eINSTANCE.getVM_Plc();

		/**
		 * The meta object literal for the '<em><b>Backup</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM__BACKUP = eINSTANCE.getVM_Backup();

		/**
		 * The meta object literal for the '<em><b>Frequent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM__FREQUENT = eINSTANCE.getVM_Frequent();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM__HOST = eINSTANCE.getVM_Host();

		/**
		 * The meta object literal for the '{@link VmPlacement.impl.PMImpl <em>PM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VmPlacement.impl.PMImpl
		 * @see VmPlacement.impl.VmPlacementPackageImpl#getPM()
		 * @generated
		 */
		EClass PM = eINSTANCE.getPM();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PM__NAME = eINSTANCE.getPM_Name();

		/**
		 * The meta object literal for the '<em><b>Res</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PM__RES = eINSTANCE.getPM_Res();

		/**
		 * The meta object literal for the '<em><b>Near</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PM__NEAR = eINSTANCE.getPM_Near();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PM__HOST = eINSTANCE.getPM_Host();

		/**
		 * The meta object literal for the '{@link VmPlacement.impl.AppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VmPlacement.impl.AppImpl
		 * @see VmPlacement.impl.VmPlacementPackageImpl#getApp()
		 * @generated
		 */
		EClass APP = eINSTANCE.getApp();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP__TYPE = eINSTANCE.getApp_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP__NAME = eINSTANCE.getApp_Name();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__DESTINATION = eINSTANCE.getApp_Destination();

	}

} //VmPlacementPackage
