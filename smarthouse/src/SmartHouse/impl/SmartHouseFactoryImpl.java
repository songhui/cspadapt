/**
 */
package SmartHouse.impl;

import SmartHouse.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartHouseFactoryImpl extends EFactoryImpl implements SmartHouseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmartHouseFactory init() {
		try {
			SmartHouseFactory theSmartHouseFactory = (SmartHouseFactory)EPackage.Registry.INSTANCE.getEFactory("http://dsg.cs.tcd.ie/smarthouse"); 
			if (theSmartHouseFactory != null) {
				return theSmartHouseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmartHouseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartHouseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SmartHousePackage.HOUSE: return createHouse();
			case SmartHousePackage.GATE: return createGate();
			case SmartHousePackage.SECURITY: return createSecurity();
			case SmartHousePackage.PERSON: return createPerson();
			case SmartHousePackage.WATER_HEATER: return createWaterHeater();
			case SmartHousePackage.EV: return createEV();
			case SmartHousePackage.ROOM: return createRoom();
			case SmartHousePackage.HEATING: return createHeating();
			case SmartHousePackage.WINDOW: return createWindow();
			case SmartHousePackage.AIR_CONDITIONER: return createAirConditioner();
			case SmartHousePackage.LIGHT: return createLight();
			case SmartHousePackage.PROJECTOR: return createProjector();
			case SmartHousePackage.WASHING_MACHINE: return createWashingMachine();
			case SmartHousePackage.SENSOR: return createSensor();
			case SmartHousePackage.COOKER: return createCooker();
			case SmartHousePackage.COFFEE_MAKER: return createCoffeeMaker();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House createHouse() {
		HouseImpl house = new HouseImpl();
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security createSecurity() {
		SecurityImpl security = new SecurityImpl();
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Heating createHeating() {
		HeatingImpl heating = new HeatingImpl();
		return heating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Window createWindow() {
		WindowImpl window = new WindowImpl();
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirConditioner createAirConditioner() {
		AirConditionerImpl airConditioner = new AirConditionerImpl();
		return airConditioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Light createLight() {
		LightImpl light = new LightImpl();
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Projector createProjector() {
		ProjectorImpl projector = new ProjectorImpl();
		return projector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WashingMachine createWashingMachine() {
		WashingMachineImpl washingMachine = new WashingMachineImpl();
		return washingMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cooker createCooker() {
		CookerImpl cooker = new CookerImpl();
		return cooker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoffeeMaker createCoffeeMaker() {
		CoffeeMakerImpl coffeeMaker = new CoffeeMakerImpl();
		return coffeeMaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterHeater createWaterHeater() {
		WaterHeaterImpl waterHeater = new WaterHeaterImpl();
		return waterHeater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EV createEV() {
		EVImpl ev = new EVImpl();
		return ev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartHousePackage getSmartHousePackage() {
		return (SmartHousePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmartHousePackage getPackage() {
		return SmartHousePackage.eINSTANCE;
	}

} //SmartHouseFactoryImpl
