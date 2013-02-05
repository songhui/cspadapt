/**
 */
package SmartHouse.util;

import SmartHouse.*;

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
 * @see SmartHouse.SmartHousePackage
 * @generated
 */
public class SmartHouseValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SmartHouseValidator INSTANCE = new SmartHouseValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "SmartHouse";

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
	public SmartHouseValidator() {
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
	  return SmartHousePackage.eINSTANCE;
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
			case SmartHousePackage.HOUSE:
				return validateHouse((House)value, diagnostics, context);
			case SmartHousePackage.GATE:
				return validateGate((Gate)value, diagnostics, context);
			case SmartHousePackage.SECURITY:
				return validateSecurity((Security)value, diagnostics, context);
			case SmartHousePackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case SmartHousePackage.WATER_HEATER:
				return validateWaterHeater((WaterHeater)value, diagnostics, context);
			case SmartHousePackage.EV:
				return validateEV((EV)value, diagnostics, context);
			case SmartHousePackage.ROOM:
				return validateRoom((Room)value, diagnostics, context);
			case SmartHousePackage.HEATING:
				return validateHeating((Heating)value, diagnostics, context);
			case SmartHousePackage.WINDOW:
				return validateWindow((Window)value, diagnostics, context);
			case SmartHousePackage.AIR_CONDITIONER:
				return validateAirConditioner((AirConditioner)value, diagnostics, context);
			case SmartHousePackage.LIGHT:
				return validateLight((Light)value, diagnostics, context);
			case SmartHousePackage.PROJECTOR:
				return validateProjector((Projector)value, diagnostics, context);
			case SmartHousePackage.WASHING_MACHINE:
				return validateWashingMachine((WashingMachine)value, diagnostics, context);
			case SmartHousePackage.SENSOR:
				return validateSensor((Sensor)value, diagnostics, context);
			case SmartHousePackage.COOKER:
				return validateCooker((Cooker)value, diagnostics, context);
			case SmartHousePackage.COFFEE_MAKER:
				return validateCoffeeMaker((CoffeeMaker)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHouse(House house, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(house, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(house, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(house, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(house, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(house, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(house, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(house, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(house, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(house, diagnostics, context);
		if (result || diagnostics != null) result &= validateHouse_TooExpensiveToUseThemTogether(house, diagnostics, context);
		if (result || diagnostics != null) result &= validateHouse_SuperExpensiveNotUseAnything(house, diagnostics, context);
		if (result || diagnostics != null) result &= validateHouse_WatchDog(house, diagnostics, context);
		if (result || diagnostics != null) result &= validateHouse_NoWindowOpenWhenSecOn(house, diagnostics, context);
		if (result || diagnostics != null) result &= validateHouse_User__VeryNotSafe(house, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TooExpensiveToUseThemTogether constraint of '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HOUSE__TOO_EXPENSIVE_TO_USE_THEM_TOGETHER__EEXPRESSION = "eprice > 15 implies ev->forAll(e : EV | e.charging = false) or not wh.on or room.heating->flatten()->forAll(e : Heating | e.level < 3)";

	/**
	 * Validates the TooExpensiveToUseThemTogether constraint of '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHouse_TooExpensiveToUseThemTogether(House house, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.HOUSE,
				 house,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TooExpensiveToUseThemTogether",
				 HOUSE__TOO_EXPENSIVE_TO_USE_THEM_TOGETHER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SuperExpensiveNotUseAnything constraint of '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HOUSE__SUPER_EXPENSIVE_NOT_USE_ANYTHING__EEXPRESSION = "eprice > 20 implies ev->forAll(e : EV | e.charging = false) and not wh.on and room.heating->flatten()->forAll(e : Heating | e.level = 0)";

	/**
	 * Validates the SuperExpensiveNotUseAnything constraint of '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHouse_SuperExpensiveNotUseAnything(House house, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.HOUSE,
				 house,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SuperExpensiveNotUseAnything",
				 HOUSE__SUPER_EXPENSIVE_NOT_USE_ANYTHING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the WatchDog constraint of '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HOUSE__WATCH_DOG__EEXPRESSION = "gate.outlocked implies sec.on";

	/**
	 * Validates the WatchDog constraint of '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHouse_WatchDog(House house, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.HOUSE,
				 house,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "WatchDog",
				 HOUSE__WATCH_DOG__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoWindowOpenWhenSecOn constraint of '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HOUSE__NO_WINDOW_OPEN_WHEN_SEC_ON__EEXPRESSION = "sec.on implies room->select(e : Room | e.name = 'liv').window->flatten()->forAll(e : Window | e.opened = false)";

	/**
	 * Validates the NoWindowOpenWhenSecOn constraint of '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHouse_NoWindowOpenWhenSecOn(House house, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.HOUSE,
				 house,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoWindowOpenWhenSecOn",
				 HOUSE__NO_WINDOW_OPEN_WHEN_SEC_ON__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the User__VeryNotSafe constraint of '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HOUSE__USER_VERY_NOT_SAFE__EEXPRESSION = "gate.outlocked implies sec.on = true";

	/**
	 * Validates the User__VeryNotSafe constraint of '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHouse_User__VeryNotSafe(House house, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.HOUSE,
				 house,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "User__VeryNotSafe",
				 HOUSE__USER_VERY_NOT_SAFE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurity(Security security, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(security, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(room, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_TooColdNeedHeating(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_ExtremelyColdNeedMoreHeating(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_NoWindowOpenWhenHeating(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_NoHeatingAndCoolingTogether(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_TooLateNoShouting(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_ProjectingInDarkness(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_INeedFreshAir(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_TooColdToOpenWindow(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_User__AlwaysOpenWindow(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_User__AlwaysTurnOnFirstHeating(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_User__ILoveCurtains(room, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TooColdNeedHeating constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROOM__TOO_COLD_NEED_HEATING__EEXPRESSION = "temp < 18 implies heating->exists(e : Heating | e.level > 0)";

	/**
	 * Validates the TooColdNeedHeating constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_TooColdNeedHeating(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.ROOM,
				 room,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TooColdNeedHeating",
				 ROOM__TOO_COLD_NEED_HEATING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ExtremelyColdNeedMoreHeating constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROOM__EXTREMELY_COLD_NEED_MORE_HEATING__EEXPRESSION = "temp < 10 implies heating.level->sum() > 3 * heating->size()";

	/**
	 * Validates the ExtremelyColdNeedMoreHeating constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_ExtremelyColdNeedMoreHeating(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.ROOM,
				 room,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ExtremelyColdNeedMoreHeating",
				 ROOM__EXTREMELY_COLD_NEED_MORE_HEATING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoWindowOpenWhenHeating constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROOM__NO_WINDOW_OPEN_WHEN_HEATING__EEXPRESSION = "window->forAll(e : Window | e.opened = false) or ac->forAll(e : AirConditioner | e.level = 0)";

	/**
	 * Validates the NoWindowOpenWhenHeating constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_NoWindowOpenWhenHeating(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.ROOM,
				 room,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoWindowOpenWhenHeating",
				 ROOM__NO_WINDOW_OPEN_WHEN_HEATING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoHeatingAndCoolingTogether constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROOM__NO_HEATING_AND_COOLING_TOGETHER__EEXPRESSION = "heating->forAll(e : Heating | e.level = 0) or ac->forAll(e : AirConditioner | e.level = 0)";

	/**
	 * Validates the NoHeatingAndCoolingTogether constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_NoHeatingAndCoolingTogether(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.ROOM,
				 room,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoHeatingAndCoolingTogether",
				 ROOM__NO_HEATING_AND_COOLING_TOGETHER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TooLateNoShouting constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROOM__TOO_LATE_NO_SHOUTING__EEXPRESSION = "house.time > 22 implies projector.volume < 4";

	/**
	 * Validates the TooLateNoShouting constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_TooLateNoShouting(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.ROOM,
				 room,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TooLateNoShouting",
				 ROOM__TOO_LATE_NO_SHOUTING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ProjectingInDarkness constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROOM__PROJECTING_IN_DARKNESS__EEXPRESSION = "projector.on and bright > 500 implies light->forAll(e : Light | e.level = 0) and window->forAll(e : Window | e.curtainOn)";

	/**
	 * Validates the ProjectingInDarkness constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_ProjectingInDarkness(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.ROOM,
				 room,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProjectingInDarkness",
				 ROOM__PROJECTING_IN_DARKNESS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the INeedFreshAir constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROOM__INEED_FRESH_AIR__EEXPRESSION = "air > 5 implies window->exists(e : Window | e.opened)";

	/**
	 * Validates the INeedFreshAir constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_INeedFreshAir(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.ROOM,
				 room,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "INeedFreshAir",
				 ROOM__INEED_FRESH_AIR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TooColdToOpenWindow constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROOM__TOO_COLD_TO_OPEN_WINDOW__EEXPRESSION = "house.outtemp > 5 or window->forAll(e : Window | not e.opened)";

	/**
	 * Validates the TooColdToOpenWindow constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_TooColdToOpenWindow(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.ROOM,
				 room,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TooColdToOpenWindow",
				 ROOM__TOO_COLD_TO_OPEN_WINDOW__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the User__AlwaysOpenWindow constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROOM__USER_ALWAYS_OPEN_WINDOW__EEXPRESSION = "air > 6 and house.outtemp >= 10 implies window->asSequence()->first().opened = true";

	/**
	 * Validates the User__AlwaysOpenWindow constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_User__AlwaysOpenWindow(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.ROOM,
				 room,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "User__AlwaysOpenWindow",
				 ROOM__USER_ALWAYS_OPEN_WINDOW__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the User__AlwaysTurnOnFirstHeating constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROOM__USER_ALWAYS_TURN_ON_FIRST_HEATING__EEXPRESSION = "temp < 10 and house.eprice < 20 implies heating->asSequence()->first().level = 10";

	/**
	 * Validates the User__AlwaysTurnOnFirstHeating constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_User__AlwaysTurnOnFirstHeating(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.ROOM,
				 room,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "User__AlwaysTurnOnFirstHeating",
				 ROOM__USER_ALWAYS_TURN_ON_FIRST_HEATING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the User__ILoveCurtains constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROOM__USER_ILOVE_CURTAINS__EEXPRESSION = "projector.on implies window->asSequence()->first().curtainOn = true";

	/**
	 * Validates the User__ILoveCurtains constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_User__ILoveCurtains(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.ROOM,
				 room,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "User__ILoveCurtains",
				 ROOM__USER_ILOVE_CURTAINS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeating(Heating heating, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(heating, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWindow(Window window, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(window, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirConditioner(AirConditioner airConditioner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(airConditioner, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(airConditioner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(airConditioner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(airConditioner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(airConditioner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(airConditioner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(airConditioner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(airConditioner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(airConditioner, diagnostics, context);
		if (result || diagnostics != null) result &= validateAirConditioner_TooHotOpenAC(airConditioner, diagnostics, context);
		if (result || diagnostics != null) result &= validateAirConditioner_CodeNoAC(airConditioner, diagnostics, context);
		if (result || diagnostics != null) result &= validateAirConditioner_HotOutside(airConditioner, diagnostics, context);
		if (result || diagnostics != null) result &= validateAirConditioner_User__HotOutside(airConditioner, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TooHotOpenAC constraint of '<em>Air Conditioner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AIR_CONDITIONER__TOO_HOT_OPEN_AC__EEXPRESSION = "room.temp > 28 implies level > 5";

	/**
	 * Validates the TooHotOpenAC constraint of '<em>Air Conditioner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirConditioner_TooHotOpenAC(AirConditioner airConditioner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.AIR_CONDITIONER,
				 airConditioner,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TooHotOpenAC",
				 AIR_CONDITIONER__TOO_HOT_OPEN_AC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the CodeNoAC constraint of '<em>Air Conditioner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AIR_CONDITIONER__CODE_NO_AC__EEXPRESSION = "room.temp < 23 implies level = 0";

	/**
	 * Validates the CodeNoAC constraint of '<em>Air Conditioner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirConditioner_CodeNoAC(AirConditioner airConditioner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.AIR_CONDITIONER,
				 airConditioner,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "CodeNoAC",
				 AIR_CONDITIONER__CODE_NO_AC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the HotOutside constraint of '<em>Air Conditioner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AIR_CONDITIONER__HOT_OUTSIDE__EEXPRESSION = "room.house.outtemp > 30 implies level > 5";

	/**
	 * Validates the HotOutside constraint of '<em>Air Conditioner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirConditioner_HotOutside(AirConditioner airConditioner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.AIR_CONDITIONER,
				 airConditioner,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "HotOutside",
				 AIR_CONDITIONER__HOT_OUTSIDE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the User__HotOutside constraint of '<em>Air Conditioner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AIR_CONDITIONER__USER_HOT_OUTSIDE__EEXPRESSION = "level > 0 implies level = 9";

	/**
	 * Validates the User__HotOutside constraint of '<em>Air Conditioner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAirConditioner_User__HotOutside(AirConditioner airConditioner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.AIR_CONDITIONER,
				 airConditioner,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "User__HotOutside",
				 AIR_CONDITIONER__USER_HOT_OUTSIDE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLight(Light light, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(light, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(light, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(light, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(light, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(light, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(light, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(light, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(light, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(light, diagnostics, context);
		if (result || diagnostics != null) result &= validateLight_User__LightWideOpen(light, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the User__LightWideOpen constraint of '<em>Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LIGHT__USER_LIGHT_WIDE_OPEN__EEXPRESSION = "level <> 0 implies level = 5";

	/**
	 * Validates the User__LightWideOpen constraint of '<em>Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLight_User__LightWideOpen(Light light, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.LIGHT,
				 light,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "User__LightWideOpen",
				 LIGHT__USER_LIGHT_WIDE_OPEN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjector(Projector projector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(projector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(projector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(projector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(projector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(projector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(projector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(projector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(projector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(projector, diagnostics, context);
		if (result || diagnostics != null) result &= validateProjector_TooNoisyToWatchTVWhenWashing(projector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TooNoisyToWatchTVWhenWashing constraint of '<em>Projector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROJECTOR__TOO_NOISY_TO_WATCH_TV_WHEN_WASHING__EEXPRESSION = "if room.wm <> null then not room.wm.on or not on else true endif";

	/**
	 * Validates the TooNoisyToWatchTVWhenWashing constraint of '<em>Projector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjector_TooNoisyToWatchTVWhenWashing(Projector projector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.PROJECTOR,
				 projector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TooNoisyToWatchTVWhenWashing",
				 PROJECTOR__TOO_NOISY_TO_WATCH_TV_WHEN_WASHING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWashingMachine(WashingMachine washingMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(washingMachine, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(washingMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(washingMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(washingMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(washingMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(washingMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(washingMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(washingMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(washingMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateWashingMachine_OnWhenLoaded(washingMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateWashingMachine_User__WashImmediately(washingMachine, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnWhenLoaded constraint of '<em>Washing Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WASHING_MACHINE__ON_WHEN_LOADED__EEXPRESSION = "loaded implies on";

	/**
	 * Validates the OnWhenLoaded constraint of '<em>Washing Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWashingMachine_OnWhenLoaded(WashingMachine washingMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.WASHING_MACHINE,
				 washingMachine,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OnWhenLoaded",
				 WASHING_MACHINE__ON_WHEN_LOADED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the User__WashImmediately constraint of '<em>Washing Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WASHING_MACHINE__USER_WASH_IMMEDIATELY__EEXPRESSION = "loaded implies on = true";

	/**
	 * Validates the User__WashImmediately constraint of '<em>Washing Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWashingMachine_User__WashImmediately(WashingMachine washingMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.WASHING_MACHINE,
				 washingMachine,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "User__WashImmediately",
				 WASHING_MACHINE__USER_WASH_IMMEDIATELY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sensor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validateSensor_RunningOutOfPower(sensor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the RunningOutOfPower constraint of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SENSOR__RUNNING_OUT_OF_POWER__EEXPRESSION = "battery < 20 implies circle < 30";

	/**
	 * Validates the RunningOutOfPower constraint of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor_RunningOutOfPower(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.SENSOR,
				 sensor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RunningOutOfPower",
				 SENSOR__RUNNING_OUT_OF_POWER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCooker(Cooker cooker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cooker, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoffeeMaker(CoffeeMaker coffeeMaker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coffeeMaker, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coffeeMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coffeeMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coffeeMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(coffeeMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coffeeMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coffeeMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coffeeMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coffeeMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoffeeMaker_MakeCoffeeForMeInTheMorning(coffeeMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoffeeMaker_NoCarNoCoffee(coffeeMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoffeeMaker_KeepItWarm(coffeeMaker, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoffeeMaker_User__IWantWarmed(coffeeMaker, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MakeCoffeeForMeInTheMorning constraint of '<em>Coffee Maker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COFFEE_MAKER__MAKE_COFFEE_FOR_ME_IN_THE_MORNING__EEXPRESSION = "room.house.time = 7 and loaded implies on";

	/**
	 * Validates the MakeCoffeeForMeInTheMorning constraint of '<em>Coffee Maker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoffeeMaker_MakeCoffeeForMeInTheMorning(CoffeeMaker coffeeMaker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.COFFEE_MAKER,
				 coffeeMaker,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "MakeCoffeeForMeInTheMorning",
				 COFFEE_MAKER__MAKE_COFFEE_FOR_ME_IN_THE_MORNING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoCarNoCoffee constraint of '<em>Coffee Maker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COFFEE_MAKER__NO_CAR_NO_COFFEE__EEXPRESSION = "room.house.ev->exists(e : EV | e.pluged) or on";

	/**
	 * Validates the NoCarNoCoffee constraint of '<em>Coffee Maker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoffeeMaker_NoCarNoCoffee(CoffeeMaker coffeeMaker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.COFFEE_MAKER,
				 coffeeMaker,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoCarNoCoffee",
				 COFFEE_MAKER__NO_CAR_NO_COFFEE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the KeepItWarm constraint of '<em>Coffee Maker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COFFEE_MAKER__KEEP_IT_WARM__EEXPRESSION = "room.temp > 20 implies not warming";

	/**
	 * Validates the KeepItWarm constraint of '<em>Coffee Maker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoffeeMaker_KeepItWarm(CoffeeMaker coffeeMaker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.COFFEE_MAKER,
				 coffeeMaker,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "KeepItWarm",
				 COFFEE_MAKER__KEEP_IT_WARM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the User__IWantWarmed constraint of '<em>Coffee Maker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COFFEE_MAKER__USER_IWANT_WARMED__EEXPRESSION = "loaded implies warming = true";

	/**
	 * Validates the User__IWantWarmed constraint of '<em>Coffee Maker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoffeeMaker_User__IWantWarmed(CoffeeMaker coffeeMaker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.COFFEE_MAKER,
				 coffeeMaker,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "User__IWantWarmed",
				 COFFEE_MAKER__USER_IWANT_WARMED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaterHeater(WaterHeater waterHeater, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(waterHeater, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(waterHeater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(waterHeater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(waterHeater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(waterHeater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(waterHeater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(waterHeater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(waterHeater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(waterHeater, diagnostics, context);
		if (result || diagnostics != null) result &= validateWaterHeater_DoNotHeatItForever(waterHeater, diagnostics, context);
		if (result || diagnostics != null) result &= validateWaterHeater_ColdWaterNeedHeating(waterHeater, diagnostics, context);
		if (result || diagnostics != null) result &= validateWaterHeater_INeedHotWaterInTheMorning(waterHeater, diagnostics, context);
		if (result || diagnostics != null) result &= validateWaterHeater_User__HotWaterAlways(waterHeater, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DoNotHeatItForever constraint of '<em>Water Heater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WATER_HEATER__DO_NOT_HEAT_IT_FOREVER__EEXPRESSION = "temp < 50 or not on";

	/**
	 * Validates the DoNotHeatItForever constraint of '<em>Water Heater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaterHeater_DoNotHeatItForever(WaterHeater waterHeater, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.WATER_HEATER,
				 waterHeater,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DoNotHeatItForever",
				 WATER_HEATER__DO_NOT_HEAT_IT_FOREVER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ColdWaterNeedHeating constraint of '<em>Water Heater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WATER_HEATER__COLD_WATER_NEED_HEATING__EEXPRESSION = "temp < 30 implies on";

	/**
	 * Validates the ColdWaterNeedHeating constraint of '<em>Water Heater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaterHeater_ColdWaterNeedHeating(WaterHeater waterHeater, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.WATER_HEATER,
				 waterHeater,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ColdWaterNeedHeating",
				 WATER_HEATER__COLD_WATER_NEED_HEATING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the INeedHotWaterInTheMorning constraint of '<em>Water Heater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WATER_HEATER__INEED_HOT_WATER_IN_THE_MORNING__EEXPRESSION = "house.time < 2 or house.time > 8 or on";

	/**
	 * Validates the INeedHotWaterInTheMorning constraint of '<em>Water Heater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaterHeater_INeedHotWaterInTheMorning(WaterHeater waterHeater, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.WATER_HEATER,
				 waterHeater,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "INeedHotWaterInTheMorning",
				 WATER_HEATER__INEED_HOT_WATER_IN_THE_MORNING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the User__HotWaterAlways constraint of '<em>Water Heater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WATER_HEATER__USER_HOT_WATER_ALWAYS__EEXPRESSION = "temp < 30 and (house.time < 2 or house.time > 8) implies on = true";

	/**
	 * Validates the User__HotWaterAlways constraint of '<em>Water Heater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaterHeater_User__HotWaterAlways(WaterHeater waterHeater, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.WATER_HEATER,
				 waterHeater,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "User__HotWaterAlways",
				 WATER_HEATER__USER_HOT_WATER_ALWAYS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEV(EV ev, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ev, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ev, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ev, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ev, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ev, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ev, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ev, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ev, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ev, diagnostics, context);
		if (result || diagnostics != null) result &= validateEV_LowLeveNeedCharge(ev, diagnostics, context);
		if (result || diagnostics != null) result &= validateEV_LowPricePleaseCharge(ev, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the LowLeveNeedCharge constraint of '<em>EV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EV__LOW_LEVE_NEED_CHARGE__EEXPRESSION = "if pluged then level < 30 implies charging else true endif";

	/**
	 * Validates the LowLeveNeedCharge constraint of '<em>EV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEV_LowLeveNeedCharge(EV ev, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.EV,
				 ev,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "LowLeveNeedCharge",
				 EV__LOW_LEVE_NEED_CHARGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the LowPricePleaseCharge constraint of '<em>EV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EV__LOW_PRICE_PLEASE_CHARGE__EEXPRESSION = "if pluged then house.eprice < 10 implies charging else true endif";

	/**
	 * Validates the LowPricePleaseCharge constraint of '<em>EV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEV_LowPricePleaseCharge(EV ev, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SmartHousePackage.Literals.EV,
				 ev,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "LowPricePleaseCharge",
				 EV__LOW_PRICE_PLEASE_CHARGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //SmartHouseValidator
