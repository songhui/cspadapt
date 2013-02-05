/**
 */
package SmartHouse;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SmartHouse.SmartHouseFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface SmartHousePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SmartHouse";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dsg.cs.tcd.ie/smarthouse";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SmartHouse";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmartHousePackage eINSTANCE = SmartHouse.impl.SmartHousePackageImpl.init();

	/**
	 * The meta object id for the '{@link SmartHouse.impl.HouseImpl <em>House</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartHouse.impl.HouseImpl
	 * @see SmartHouse.impl.SmartHousePackageImpl#getHouse()
	 * @generated
	 */
	int HOUSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Eprice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__EPRICE = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__TIME = 2;

	/**
	 * The feature id for the '<em><b>Outtemp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__OUTTEMP = 3;

	/**
	 * The feature id for the '<em><b>Room</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__ROOM = 4;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__MEMBER = 5;

	/**
	 * The feature id for the '<em><b>Wh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__WH = 6;

	/**
	 * The feature id for the '<em><b>Ev</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__EV = 7;

	/**
	 * The feature id for the '<em><b>Gate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__GATE = 8;

	/**
	 * The feature id for the '<em><b>Sec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__SEC = 9;

	/**
	 * The number of structural features of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link SmartHouse.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartHouse.impl.GateImpl
	 * @see SmartHouse.impl.SmartHousePackageImpl#getGate()
	 * @generated
	 */
	int GATE = 1;

	/**
	 * The feature id for the '<em><b>Outlocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__OUTLOCKED = 0;

	/**
	 * The feature id for the '<em><b>House</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__HOUSE = 1;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SmartHouse.impl.SecurityImpl <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartHouse.impl.SecurityImpl
	 * @see SmartHouse.impl.SmartHousePackageImpl#getSecurity()
	 * @generated
	 */
	int SECURITY = 2;

	/**
	 * The feature id for the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__ON = 0;

	/**
	 * The feature id for the '<em><b>House</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__HOUSE = 1;

	/**
	 * The number of structural features of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SmartHouse.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartHouse.impl.RoomImpl
	 * @see SmartHouse.impl.SmartHousePackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 6;

	/**
	 * The meta object id for the '{@link SmartHouse.impl.HeatingImpl <em>Heating</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartHouse.impl.HeatingImpl
	 * @see SmartHouse.impl.SmartHousePackageImpl#getHeating()
	 * @generated
	 */
	int HEATING = 7;

	/**
	 * The meta object id for the '{@link SmartHouse.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartHouse.impl.WindowImpl
	 * @see SmartHouse.impl.SmartHousePackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 8;

	/**
	 * The meta object id for the '{@link SmartHouse.impl.AirConditionerImpl <em>Air Conditioner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartHouse.impl.AirConditionerImpl
	 * @see SmartHouse.impl.SmartHousePackageImpl#getAirConditioner()
	 * @generated
	 */
	int AIR_CONDITIONER = 9;

	/**
	 * The meta object id for the '{@link SmartHouse.impl.LightImpl <em>Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartHouse.impl.LightImpl
	 * @see SmartHouse.impl.SmartHousePackageImpl#getLight()
	 * @generated
	 */
	int LIGHT = 10;

	/**
	 * The meta object id for the '{@link SmartHouse.impl.ProjectorImpl <em>Projector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartHouse.impl.ProjectorImpl
	 * @see SmartHouse.impl.SmartHousePackageImpl#getProjector()
	 * @generated
	 */
	int PROJECTOR = 11;

	/**
	 * The meta object id for the '{@link SmartHouse.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartHouse.impl.PersonImpl
	 * @see SmartHouse.impl.SmartHousePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link SmartHouse.impl.WaterHeaterImpl <em>Water Heater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartHouse.impl.WaterHeaterImpl
	 * @see SmartHouse.impl.SmartHousePackageImpl#getWaterHeater()
	 * @generated
	 */
	int WATER_HEATER = 4;

	/**
	 * The feature id for the '<em><b>Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_HEATER__TEMP = 0;

	/**
	 * The feature id for the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_HEATER__ON = 1;

	/**
	 * The feature id for the '<em><b>Boost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_HEATER__BOOST = 2;

	/**
	 * The feature id for the '<em><b>House</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_HEATER__HOUSE = 3;

	/**
	 * The number of structural features of the '<em>Water Heater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_HEATER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link SmartHouse.impl.EVImpl <em>EV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartHouse.impl.EVImpl
	 * @see SmartHouse.impl.SmartHousePackageImpl#getEV()
	 * @generated
	 */
	int EV = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pluged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV__PLUGED = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV__LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Charging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV__CHARGING = 3;

	/**
	 * The feature id for the '<em><b>House</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV__HOUSE = 4;

	/**
	 * The number of structural features of the '<em>EV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__TEMP = 0;

	/**
	 * The feature id for the '<em><b>Bright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__BRIGHT = 1;

	/**
	 * The feature id for the '<em><b>Air</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__AIR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 3;

	/**
	 * The feature id for the '<em><b>House</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__HOUSE = 4;

	/**
	 * The feature id for the '<em><b>Window</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__WINDOW = 5;

	/**
	 * The feature id for the '<em><b>Heating</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__HEATING = 6;

	/**
	 * The feature id for the '<em><b>Light</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__LIGHT = 7;

	/**
	 * The feature id for the '<em><b>Ac</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__AC = 8;

	/**
	 * The feature id for the '<em><b>Occupied</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__OCCUPIED = 9;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SENSOR = 10;

	/**
	 * The feature id for the '<em><b>Projector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__PROJECTOR = 11;

	/**
	 * The feature id for the '<em><b>Cooker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__COOKER = 12;

	/**
	 * The feature id for the '<em><b>Wm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__WM = 13;

	/**
	 * The feature id for the '<em><b>Cm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CM = 14;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATING__LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Heating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATING_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Curtain On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__CURTAIN_ON = 1;

	/**
	 * The feature id for the '<em><b>Opened</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__OPENED = 2;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_CONDITIONER__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Fresh Air</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_CONDITIONER__FRESH_AIR = 1;

	/**
	 * The feature id for the '<em><b>Room</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_CONDITIONER__ROOM = 2;

	/**
	 * The number of structural features of the '<em>Air Conditioner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIR_CONDITIONER_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__LEVEL = 0;

	/**
	 * The number of structural features of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTOR__ON = 0;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTOR__BRIGHTNESS = 1;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTOR__VOLUME = 2;

	/**
	 * The feature id for the '<em><b>Room</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTOR__ROOM = 3;

	/**
	 * The number of structural features of the '<em>Projector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTOR_FEATURE_COUNT = 4;


	/**
	 * The meta object id for the '{@link SmartHouse.impl.WashingMachineImpl <em>Washing Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartHouse.impl.WashingMachineImpl
	 * @see SmartHouse.impl.SmartHousePackageImpl#getWashingMachine()
	 * @generated
	 */
	int WASHING_MACHINE = 12;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASHING_MACHINE__LOADED = 0;

	/**
	 * The feature id for the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASHING_MACHINE__ON = 1;

	/**
	 * The feature id for the '<em><b>Room</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASHING_MACHINE__ROOM = 2;

	/**
	 * The number of structural features of the '<em>Washing Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASHING_MACHINE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link SmartHouse.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartHouse.impl.SensorImpl
	 * @see SmartHouse.impl.SmartHousePackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 13;

	/**
	 * The feature id for the '<em><b>Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TEMP = 0;

	/**
	 * The feature id for the '<em><b>Air</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__AIR = 1;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__BRIGHTNESS = 2;

	/**
	 * The feature id for the '<em><b>Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__BATTERY = 3;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CIRCLE = 4;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link SmartHouse.impl.CookerImpl <em>Cooker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartHouse.impl.CookerImpl
	 * @see SmartHouse.impl.SmartHousePackageImpl#getCooker()
	 * @generated
	 */
	int COOKER = 14;

	/**
	 * The feature id for the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKER__ON = 0;

	/**
	 * The number of structural features of the '<em>Cooker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKER_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link SmartHouse.impl.CoffeeMakerImpl <em>Coffee Maker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartHouse.impl.CoffeeMakerImpl
	 * @see SmartHouse.impl.SmartHousePackageImpl#getCoffeeMaker()
	 * @generated
	 */
	int COFFEE_MAKER = 15;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MAKER__LOADED = 0;

	/**
	 * The feature id for the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MAKER__ON = 1;

	/**
	 * The feature id for the '<em><b>Warming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MAKER__WARMING = 2;

	/**
	 * The feature id for the '<em><b>Room</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MAKER__ROOM = 3;

	/**
	 * The number of structural features of the '<em>Coffee Maker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MAKER_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link SmartHouse.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House</em>'.
	 * @see SmartHouse.House
	 * @generated
	 */
	EClass getHouse();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.House#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SmartHouse.House#getName()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Name();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.House#getEprice <em>Eprice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eprice</em>'.
	 * @see SmartHouse.House#getEprice()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Eprice();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.House#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see SmartHouse.House#getTime()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Time();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.House#getOuttemp <em>Outtemp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outtemp</em>'.
	 * @see SmartHouse.House#getOuttemp()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Outtemp();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartHouse.House#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Room</em>'.
	 * @see SmartHouse.House#getRoom()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Room();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartHouse.House#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see SmartHouse.House#getMember()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Member();

	/**
	 * Returns the meta object for the containment reference '{@link SmartHouse.House#getWh <em>Wh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wh</em>'.
	 * @see SmartHouse.House#getWh()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Wh();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartHouse.House#getEv <em>Ev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ev</em>'.
	 * @see SmartHouse.House#getEv()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Ev();

	/**
	 * Returns the meta object for the containment reference '{@link SmartHouse.House#getGate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gate</em>'.
	 * @see SmartHouse.House#getGate()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Gate();

	/**
	 * Returns the meta object for the containment reference '{@link SmartHouse.House#getSec <em>Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sec</em>'.
	 * @see SmartHouse.House#getSec()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Sec();

	/**
	 * Returns the meta object for class '{@link SmartHouse.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see SmartHouse.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Gate#isOutlocked <em>Outlocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outlocked</em>'.
	 * @see SmartHouse.Gate#isOutlocked()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_Outlocked();

	/**
	 * Returns the meta object for the container reference '{@link SmartHouse.Gate#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>House</em>'.
	 * @see SmartHouse.Gate#getHouse()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_House();

	/**
	 * Returns the meta object for class '{@link SmartHouse.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see SmartHouse.Security
	 * @generated
	 */
	EClass getSecurity();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Security#isOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see SmartHouse.Security#isOn()
	 * @see #getSecurity()
	 * @generated
	 */
	EAttribute getSecurity_On();

	/**
	 * Returns the meta object for the container reference '{@link SmartHouse.Security#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>House</em>'.
	 * @see SmartHouse.Security#getHouse()
	 * @see #getSecurity()
	 * @generated
	 */
	EReference getSecurity_House();

	/**
	 * Returns the meta object for class '{@link SmartHouse.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see SmartHouse.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Room#getTemp <em>Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp</em>'.
	 * @see SmartHouse.Room#getTemp()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Temp();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Room#getBright <em>Bright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bright</em>'.
	 * @see SmartHouse.Room#getBright()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Bright();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Room#getAir <em>Air</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Air</em>'.
	 * @see SmartHouse.Room#getAir()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Air();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SmartHouse.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the container reference '{@link SmartHouse.Room#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>House</em>'.
	 * @see SmartHouse.Room#getHouse()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_House();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartHouse.Room#getWindow <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Window</em>'.
	 * @see SmartHouse.Room#getWindow()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Window();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartHouse.Room#getHeating <em>Heating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Heating</em>'.
	 * @see SmartHouse.Room#getHeating()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Heating();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartHouse.Room#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Light</em>'.
	 * @see SmartHouse.Room#getLight()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Light();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartHouse.Room#getAc <em>Ac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ac</em>'.
	 * @see SmartHouse.Room#getAc()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Ac();

	/**
	 * Returns the meta object for the reference list '{@link SmartHouse.Room#getOccupied <em>Occupied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occupied</em>'.
	 * @see SmartHouse.Room#getOccupied()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Occupied();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartHouse.Room#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor</em>'.
	 * @see SmartHouse.Room#getSensor()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Sensor();

	/**
	 * Returns the meta object for the containment reference '{@link SmartHouse.Room#getProjector <em>Projector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Projector</em>'.
	 * @see SmartHouse.Room#getProjector()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Projector();

	/**
	 * Returns the meta object for the containment reference '{@link SmartHouse.Room#getCooker <em>Cooker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cooker</em>'.
	 * @see SmartHouse.Room#getCooker()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Cooker();

	/**
	 * Returns the meta object for the containment reference '{@link SmartHouse.Room#getWm <em>Wm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wm</em>'.
	 * @see SmartHouse.Room#getWm()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Wm();

	/**
	 * Returns the meta object for the containment reference '{@link SmartHouse.Room#getCm <em>Cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cm</em>'.
	 * @see SmartHouse.Room#getCm()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Cm();

	/**
	 * Returns the meta object for class '{@link SmartHouse.Heating <em>Heating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heating</em>'.
	 * @see SmartHouse.Heating
	 * @generated
	 */
	EClass getHeating();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Heating#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SmartHouse.Heating#getName()
	 * @see #getHeating()
	 * @generated
	 */
	EAttribute getHeating_Name();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Heating#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see SmartHouse.Heating#getLevel()
	 * @see #getHeating()
	 * @generated
	 */
	EAttribute getHeating_Level();

	/**
	 * Returns the meta object for class '{@link SmartHouse.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see SmartHouse.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Window#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SmartHouse.Window#getName()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_Name();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Window#isCurtainOn <em>Curtain On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curtain On</em>'.
	 * @see SmartHouse.Window#isCurtainOn()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_CurtainOn();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Window#isOpened <em>Opened</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opened</em>'.
	 * @see SmartHouse.Window#isOpened()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_Opened();

	/**
	 * Returns the meta object for class '{@link SmartHouse.AirConditioner <em>Air Conditioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Air Conditioner</em>'.
	 * @see SmartHouse.AirConditioner
	 * @generated
	 */
	EClass getAirConditioner();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.AirConditioner#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see SmartHouse.AirConditioner#getLevel()
	 * @see #getAirConditioner()
	 * @generated
	 */
	EAttribute getAirConditioner_Level();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.AirConditioner#isFreshAir <em>Fresh Air</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fresh Air</em>'.
	 * @see SmartHouse.AirConditioner#isFreshAir()
	 * @see #getAirConditioner()
	 * @generated
	 */
	EAttribute getAirConditioner_FreshAir();

	/**
	 * Returns the meta object for the container reference '{@link SmartHouse.AirConditioner#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Room</em>'.
	 * @see SmartHouse.AirConditioner#getRoom()
	 * @see #getAirConditioner()
	 * @generated
	 */
	EReference getAirConditioner_Room();

	/**
	 * Returns the meta object for class '{@link SmartHouse.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light</em>'.
	 * @see SmartHouse.Light
	 * @generated
	 */
	EClass getLight();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Light#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see SmartHouse.Light#getLevel()
	 * @see #getLight()
	 * @generated
	 */
	EAttribute getLight_Level();

	/**
	 * Returns the meta object for class '{@link SmartHouse.Projector <em>Projector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projector</em>'.
	 * @see SmartHouse.Projector
	 * @generated
	 */
	EClass getProjector();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Projector#isOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see SmartHouse.Projector#isOn()
	 * @see #getProjector()
	 * @generated
	 */
	EAttribute getProjector_On();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Projector#getBrightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brightness</em>'.
	 * @see SmartHouse.Projector#getBrightness()
	 * @see #getProjector()
	 * @generated
	 */
	EAttribute getProjector_Brightness();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Projector#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see SmartHouse.Projector#getVolume()
	 * @see #getProjector()
	 * @generated
	 */
	EAttribute getProjector_Volume();

	/**
	 * Returns the meta object for the container reference '{@link SmartHouse.Projector#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Room</em>'.
	 * @see SmartHouse.Projector#getRoom()
	 * @see #getProjector()
	 * @generated
	 */
	EReference getProjector_Room();

	/**
	 * Returns the meta object for class '{@link SmartHouse.WashingMachine <em>Washing Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Washing Machine</em>'.
	 * @see SmartHouse.WashingMachine
	 * @generated
	 */
	EClass getWashingMachine();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.WashingMachine#isLoaded <em>Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loaded</em>'.
	 * @see SmartHouse.WashingMachine#isLoaded()
	 * @see #getWashingMachine()
	 * @generated
	 */
	EAttribute getWashingMachine_Loaded();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.WashingMachine#isOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see SmartHouse.WashingMachine#isOn()
	 * @see #getWashingMachine()
	 * @generated
	 */
	EAttribute getWashingMachine_On();

	/**
	 * Returns the meta object for the container reference '{@link SmartHouse.WashingMachine#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Room</em>'.
	 * @see SmartHouse.WashingMachine#getRoom()
	 * @see #getWashingMachine()
	 * @generated
	 */
	EReference getWashingMachine_Room();

	/**
	 * Returns the meta object for class '{@link SmartHouse.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see SmartHouse.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Sensor#isTemp <em>Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp</em>'.
	 * @see SmartHouse.Sensor#isTemp()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Temp();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Sensor#isAir <em>Air</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Air</em>'.
	 * @see SmartHouse.Sensor#isAir()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Air();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Sensor#isBrightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brightness</em>'.
	 * @see SmartHouse.Sensor#isBrightness()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Brightness();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Sensor#getBattery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery</em>'.
	 * @see SmartHouse.Sensor#getBattery()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Battery();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Sensor#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Circle</em>'.
	 * @see SmartHouse.Sensor#getCircle()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Circle();

	/**
	 * Returns the meta object for class '{@link SmartHouse.Cooker <em>Cooker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cooker</em>'.
	 * @see SmartHouse.Cooker
	 * @generated
	 */
	EClass getCooker();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Cooker#isOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see SmartHouse.Cooker#isOn()
	 * @see #getCooker()
	 * @generated
	 */
	EAttribute getCooker_On();

	/**
	 * Returns the meta object for class '{@link SmartHouse.CoffeeMaker <em>Coffee Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coffee Maker</em>'.
	 * @see SmartHouse.CoffeeMaker
	 * @generated
	 */
	EClass getCoffeeMaker();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.CoffeeMaker#isLoaded <em>Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loaded</em>'.
	 * @see SmartHouse.CoffeeMaker#isLoaded()
	 * @see #getCoffeeMaker()
	 * @generated
	 */
	EAttribute getCoffeeMaker_Loaded();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.CoffeeMaker#isOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see SmartHouse.CoffeeMaker#isOn()
	 * @see #getCoffeeMaker()
	 * @generated
	 */
	EAttribute getCoffeeMaker_On();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.CoffeeMaker#isWarming <em>Warming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warming</em>'.
	 * @see SmartHouse.CoffeeMaker#isWarming()
	 * @see #getCoffeeMaker()
	 * @generated
	 */
	EAttribute getCoffeeMaker_Warming();

	/**
	 * Returns the meta object for the container reference '{@link SmartHouse.CoffeeMaker#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Room</em>'.
	 * @see SmartHouse.CoffeeMaker#getRoom()
	 * @see #getCoffeeMaker()
	 * @generated
	 */
	EReference getCoffeeMaker_Room();

	/**
	 * Returns the meta object for class '{@link SmartHouse.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see SmartHouse.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SmartHouse.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for class '{@link SmartHouse.WaterHeater <em>Water Heater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Heater</em>'.
	 * @see SmartHouse.WaterHeater
	 * @generated
	 */
	EClass getWaterHeater();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.WaterHeater#getTemp <em>Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp</em>'.
	 * @see SmartHouse.WaterHeater#getTemp()
	 * @see #getWaterHeater()
	 * @generated
	 */
	EAttribute getWaterHeater_Temp();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.WaterHeater#isOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see SmartHouse.WaterHeater#isOn()
	 * @see #getWaterHeater()
	 * @generated
	 */
	EAttribute getWaterHeater_On();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.WaterHeater#isBoost <em>Boost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boost</em>'.
	 * @see SmartHouse.WaterHeater#isBoost()
	 * @see #getWaterHeater()
	 * @generated
	 */
	EAttribute getWaterHeater_Boost();

	/**
	 * Returns the meta object for the container reference '{@link SmartHouse.WaterHeater#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>House</em>'.
	 * @see SmartHouse.WaterHeater#getHouse()
	 * @see #getWaterHeater()
	 * @generated
	 */
	EReference getWaterHeater_House();

	/**
	 * Returns the meta object for class '{@link SmartHouse.EV <em>EV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EV</em>'.
	 * @see SmartHouse.EV
	 * @generated
	 */
	EClass getEV();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.EV#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SmartHouse.EV#getName()
	 * @see #getEV()
	 * @generated
	 */
	EAttribute getEV_Name();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.EV#isPluged <em>Pluged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pluged</em>'.
	 * @see SmartHouse.EV#isPluged()
	 * @see #getEV()
	 * @generated
	 */
	EAttribute getEV_Pluged();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.EV#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see SmartHouse.EV#getLevel()
	 * @see #getEV()
	 * @generated
	 */
	EAttribute getEV_Level();

	/**
	 * Returns the meta object for the attribute '{@link SmartHouse.EV#isCharging <em>Charging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charging</em>'.
	 * @see SmartHouse.EV#isCharging()
	 * @see #getEV()
	 * @generated
	 */
	EAttribute getEV_Charging();

	/**
	 * Returns the meta object for the container reference '{@link SmartHouse.EV#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>House</em>'.
	 * @see SmartHouse.EV#getHouse()
	 * @see #getEV()
	 * @generated
	 */
	EReference getEV_House();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmartHouseFactory getSmartHouseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SmartHouse.impl.HouseImpl <em>House</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartHouse.impl.HouseImpl
		 * @see SmartHouse.impl.SmartHousePackageImpl#getHouse()
		 * @generated
		 */
		EClass HOUSE = eINSTANCE.getHouse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__NAME = eINSTANCE.getHouse_Name();

		/**
		 * The meta object literal for the '<em><b>Eprice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__EPRICE = eINSTANCE.getHouse_Eprice();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__TIME = eINSTANCE.getHouse_Time();

		/**
		 * The meta object literal for the '<em><b>Outtemp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__OUTTEMP = eINSTANCE.getHouse_Outtemp();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__ROOM = eINSTANCE.getHouse_Room();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__MEMBER = eINSTANCE.getHouse_Member();

		/**
		 * The meta object literal for the '<em><b>Wh</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__WH = eINSTANCE.getHouse_Wh();

		/**
		 * The meta object literal for the '<em><b>Ev</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__EV = eINSTANCE.getHouse_Ev();

		/**
		 * The meta object literal for the '<em><b>Gate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__GATE = eINSTANCE.getHouse_Gate();

		/**
		 * The meta object literal for the '<em><b>Sec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__SEC = eINSTANCE.getHouse_Sec();

		/**
		 * The meta object literal for the '{@link SmartHouse.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartHouse.impl.GateImpl
		 * @see SmartHouse.impl.SmartHousePackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Outlocked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__OUTLOCKED = eINSTANCE.getGate_Outlocked();

		/**
		 * The meta object literal for the '<em><b>House</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__HOUSE = eINSTANCE.getGate_House();

		/**
		 * The meta object literal for the '{@link SmartHouse.impl.SecurityImpl <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartHouse.impl.SecurityImpl
		 * @see SmartHouse.impl.SmartHousePackageImpl#getSecurity()
		 * @generated
		 */
		EClass SECURITY = eINSTANCE.getSecurity();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY__ON = eINSTANCE.getSecurity_On();

		/**
		 * The meta object literal for the '<em><b>House</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY__HOUSE = eINSTANCE.getSecurity_House();

		/**
		 * The meta object literal for the '{@link SmartHouse.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartHouse.impl.RoomImpl
		 * @see SmartHouse.impl.SmartHousePackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Temp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__TEMP = eINSTANCE.getRoom_Temp();

		/**
		 * The meta object literal for the '<em><b>Bright</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__BRIGHT = eINSTANCE.getRoom_Bright();

		/**
		 * The meta object literal for the '<em><b>Air</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__AIR = eINSTANCE.getRoom_Air();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '<em><b>House</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__HOUSE = eINSTANCE.getRoom_House();

		/**
		 * The meta object literal for the '<em><b>Window</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__WINDOW = eINSTANCE.getRoom_Window();

		/**
		 * The meta object literal for the '<em><b>Heating</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__HEATING = eINSTANCE.getRoom_Heating();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__LIGHT = eINSTANCE.getRoom_Light();

		/**
		 * The meta object literal for the '<em><b>Ac</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__AC = eINSTANCE.getRoom_Ac();

		/**
		 * The meta object literal for the '<em><b>Occupied</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__OCCUPIED = eINSTANCE.getRoom_Occupied();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__SENSOR = eINSTANCE.getRoom_Sensor();

		/**
		 * The meta object literal for the '<em><b>Projector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__PROJECTOR = eINSTANCE.getRoom_Projector();

		/**
		 * The meta object literal for the '<em><b>Cooker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__COOKER = eINSTANCE.getRoom_Cooker();

		/**
		 * The meta object literal for the '<em><b>Wm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__WM = eINSTANCE.getRoom_Wm();

		/**
		 * The meta object literal for the '<em><b>Cm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__CM = eINSTANCE.getRoom_Cm();

		/**
		 * The meta object literal for the '{@link SmartHouse.impl.HeatingImpl <em>Heating</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartHouse.impl.HeatingImpl
		 * @see SmartHouse.impl.SmartHousePackageImpl#getHeating()
		 * @generated
		 */
		EClass HEATING = eINSTANCE.getHeating();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEATING__NAME = eINSTANCE.getHeating_Name();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEATING__LEVEL = eINSTANCE.getHeating_Level();

		/**
		 * The meta object literal for the '{@link SmartHouse.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartHouse.impl.WindowImpl
		 * @see SmartHouse.impl.SmartHousePackageImpl#getWindow()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWindow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__NAME = eINSTANCE.getWindow_Name();

		/**
		 * The meta object literal for the '<em><b>Curtain On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__CURTAIN_ON = eINSTANCE.getWindow_CurtainOn();

		/**
		 * The meta object literal for the '<em><b>Opened</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__OPENED = eINSTANCE.getWindow_Opened();

		/**
		 * The meta object literal for the '{@link SmartHouse.impl.AirConditionerImpl <em>Air Conditioner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartHouse.impl.AirConditionerImpl
		 * @see SmartHouse.impl.SmartHousePackageImpl#getAirConditioner()
		 * @generated
		 */
		EClass AIR_CONDITIONER = eINSTANCE.getAirConditioner();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIR_CONDITIONER__LEVEL = eINSTANCE.getAirConditioner_Level();

		/**
		 * The meta object literal for the '<em><b>Fresh Air</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIR_CONDITIONER__FRESH_AIR = eINSTANCE.getAirConditioner_FreshAir();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIR_CONDITIONER__ROOM = eINSTANCE.getAirConditioner_Room();

		/**
		 * The meta object literal for the '{@link SmartHouse.impl.LightImpl <em>Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartHouse.impl.LightImpl
		 * @see SmartHouse.impl.SmartHousePackageImpl#getLight()
		 * @generated
		 */
		EClass LIGHT = eINSTANCE.getLight();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT__LEVEL = eINSTANCE.getLight_Level();

		/**
		 * The meta object literal for the '{@link SmartHouse.impl.ProjectorImpl <em>Projector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartHouse.impl.ProjectorImpl
		 * @see SmartHouse.impl.SmartHousePackageImpl#getProjector()
		 * @generated
		 */
		EClass PROJECTOR = eINSTANCE.getProjector();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTOR__ON = eINSTANCE.getProjector_On();

		/**
		 * The meta object literal for the '<em><b>Brightness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTOR__BRIGHTNESS = eINSTANCE.getProjector_Brightness();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTOR__VOLUME = eINSTANCE.getProjector_Volume();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTOR__ROOM = eINSTANCE.getProjector_Room();

		/**
		 * The meta object literal for the '{@link SmartHouse.impl.WashingMachineImpl <em>Washing Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartHouse.impl.WashingMachineImpl
		 * @see SmartHouse.impl.SmartHousePackageImpl#getWashingMachine()
		 * @generated
		 */
		EClass WASHING_MACHINE = eINSTANCE.getWashingMachine();

		/**
		 * The meta object literal for the '<em><b>Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WASHING_MACHINE__LOADED = eINSTANCE.getWashingMachine_Loaded();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WASHING_MACHINE__ON = eINSTANCE.getWashingMachine_On();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WASHING_MACHINE__ROOM = eINSTANCE.getWashingMachine_Room();

		/**
		 * The meta object literal for the '{@link SmartHouse.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartHouse.impl.SensorImpl
		 * @see SmartHouse.impl.SmartHousePackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Temp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TEMP = eINSTANCE.getSensor_Temp();

		/**
		 * The meta object literal for the '<em><b>Air</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__AIR = eINSTANCE.getSensor_Air();

		/**
		 * The meta object literal for the '<em><b>Brightness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__BRIGHTNESS = eINSTANCE.getSensor_Brightness();

		/**
		 * The meta object literal for the '<em><b>Battery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__BATTERY = eINSTANCE.getSensor_Battery();

		/**
		 * The meta object literal for the '<em><b>Circle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__CIRCLE = eINSTANCE.getSensor_Circle();

		/**
		 * The meta object literal for the '{@link SmartHouse.impl.CookerImpl <em>Cooker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartHouse.impl.CookerImpl
		 * @see SmartHouse.impl.SmartHousePackageImpl#getCooker()
		 * @generated
		 */
		EClass COOKER = eINSTANCE.getCooker();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COOKER__ON = eINSTANCE.getCooker_On();

		/**
		 * The meta object literal for the '{@link SmartHouse.impl.CoffeeMakerImpl <em>Coffee Maker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartHouse.impl.CoffeeMakerImpl
		 * @see SmartHouse.impl.SmartHousePackageImpl#getCoffeeMaker()
		 * @generated
		 */
		EClass COFFEE_MAKER = eINSTANCE.getCoffeeMaker();

		/**
		 * The meta object literal for the '<em><b>Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COFFEE_MAKER__LOADED = eINSTANCE.getCoffeeMaker_Loaded();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COFFEE_MAKER__ON = eINSTANCE.getCoffeeMaker_On();

		/**
		 * The meta object literal for the '<em><b>Warming</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COFFEE_MAKER__WARMING = eINSTANCE.getCoffeeMaker_Warming();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COFFEE_MAKER__ROOM = eINSTANCE.getCoffeeMaker_Room();

		/**
		 * The meta object literal for the '{@link SmartHouse.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartHouse.impl.PersonImpl
		 * @see SmartHouse.impl.SmartHousePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '{@link SmartHouse.impl.WaterHeaterImpl <em>Water Heater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartHouse.impl.WaterHeaterImpl
		 * @see SmartHouse.impl.SmartHousePackageImpl#getWaterHeater()
		 * @generated
		 */
		EClass WATER_HEATER = eINSTANCE.getWaterHeater();

		/**
		 * The meta object literal for the '<em><b>Temp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATER_HEATER__TEMP = eINSTANCE.getWaterHeater_Temp();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATER_HEATER__ON = eINSTANCE.getWaterHeater_On();

		/**
		 * The meta object literal for the '<em><b>Boost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATER_HEATER__BOOST = eINSTANCE.getWaterHeater_Boost();

		/**
		 * The meta object literal for the '<em><b>House</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_HEATER__HOUSE = eINSTANCE.getWaterHeater_House();

		/**
		 * The meta object literal for the '{@link SmartHouse.impl.EVImpl <em>EV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartHouse.impl.EVImpl
		 * @see SmartHouse.impl.SmartHousePackageImpl#getEV()
		 * @generated
		 */
		EClass EV = eINSTANCE.getEV();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EV__NAME = eINSTANCE.getEV_Name();

		/**
		 * The meta object literal for the '<em><b>Pluged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EV__PLUGED = eINSTANCE.getEV_Pluged();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EV__LEVEL = eINSTANCE.getEV_Level();

		/**
		 * The meta object literal for the '<em><b>Charging</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EV__CHARGING = eINSTANCE.getEV_Charging();

		/**
		 * The meta object literal for the '<em><b>House</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EV__HOUSE = eINSTANCE.getEV_House();

	}

} //SmartHousePackage
