/**
 */
package VmPlacement.util;

import VmPlacement.App;
import VmPlacement.PM;
import VmPlacement.VM;
import VmPlacement.VmPlacementPackage;
import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see VmPlacement.VmPlacementPackage
 * @generated
 */
public class VmPlacementValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final VmPlacementValidator INSTANCE = new VmPlacementValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "VmPlacement";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmPlacementValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return VmPlacementPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case VmPlacementPackage.SYSTEM:
				return validateSystem((VmPlacement.System)value, diagnostics, context);
			case VmPlacementPackage.VM:
				return validateVM((VM)value, diagnostics, context);
			case VmPlacementPackage.PM:
				return validatePM((PM)value, diagnostics, context);
			case VmPlacementPackage.APP:
				return validateApp((App)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(VmPlacement.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(system, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVM(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validateVM_BackupSplit(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validateVM_FrequentCloser(vm, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the BackupSplit constraint of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VM__BACKUP_SPLIT__EEXPRESSION = "backup->forAll(vm : VM | self.plc <> vm.plc)";

	/**
	 * Validates the BackupSplit constraint of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVM_BackupSplit(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(VmPlacementPackage.Literals.VM,
				 vm,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "BackupSplit",
				 VM__BACKUP_SPLIT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the FrequentCloser constraint of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VM__FREQUENT_CLOSER__EEXPRESSION = "frequent->forAll(v : VM | self.plc.near->includes(v.plc) or self.plc = v.plc)";

	/**
	 * Validates the FrequentCloser constraint of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVM_FrequentCloser(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(VmPlacementPackage.Literals.VM,
				 vm,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "FrequentCloser",
				 VM__FREQUENT_CLOSER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePM(PM pm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pm, diagnostics, context);
		if (result || diagnostics != null) result &= validatePM_ResourceLimit(pm, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ResourceLimit constraint of '<em>PM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PM__RESOURCE_LIMIT__EEXPRESSION = "\n" +
		"\t\t\thost->collect(e | e.req)->sum() <= res";

	/**
	 * Validates the ResourceLimit constraint of '<em>PM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePM_ResourceLimit(PM pm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(VmPlacementPackage.Literals.PM,
				 pm,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ResourceLimit",
				 PM__RESOURCE_LIMIT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApp(App app, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(app, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //VmPlacementValidator
