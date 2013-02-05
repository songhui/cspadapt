/**
 */
package SmartHouse.impl;

import SmartHouse.AirConditioner;
import SmartHouse.CoffeeMaker;
import SmartHouse.Cooker;
import SmartHouse.Gate;
import SmartHouse.Heating;
import SmartHouse.House;
import SmartHouse.Light;
import SmartHouse.Person;
import SmartHouse.Projector;
import SmartHouse.Room;
import SmartHouse.Security;
import SmartHouse.Sensor;
import SmartHouse.SmartHouseFactory;
import SmartHouse.SmartHousePackage;
import SmartHouse.WashingMachine;
import SmartHouse.WaterHeater;
import SmartHouse.Window;

import SmartHouse.util.SmartHouseValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartHousePackageImpl extends EPackageImpl implements SmartHousePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass houseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heatingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass airConditionerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass washingMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cookerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coffeeMakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waterHeaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see SmartHouse.SmartHousePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SmartHousePackageImpl() {
		super(eNS_URI, SmartHouseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SmartHousePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SmartHousePackage init() {
		if (isInited) return (SmartHousePackage)EPackage.Registry.INSTANCE.getEPackage(SmartHousePackage.eNS_URI);

		// Obtain or create and register package
		SmartHousePackageImpl theSmartHousePackage = (SmartHousePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SmartHousePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SmartHousePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSmartHousePackage.createPackageContents();

		// Initialize created meta-data
		theSmartHousePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSmartHousePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SmartHouseValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSmartHousePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SmartHousePackage.eNS_URI, theSmartHousePackage);
		return theSmartHousePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHouse() {
		return houseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Name() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Eprice() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Time() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Outtemp() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouse_Room() {
		return (EReference)houseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouse_Member() {
		return (EReference)houseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouse_Wh() {
		return (EReference)houseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouse_Ev() {
		return (EReference)houseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouse_Gate() {
		return (EReference)houseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouse_Sec() {
		return (EReference)houseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGate_Outlocked() {
		return (EAttribute)gateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGate_House() {
		return (EReference)gateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurity() {
		return securityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurity_On() {
		return (EAttribute)securityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurity_House() {
		return (EReference)securityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Temp() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Bright() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Air() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Name() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_House() {
		return (EReference)roomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Window() {
		return (EReference)roomEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Heating() {
		return (EReference)roomEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Light() {
		return (EReference)roomEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Ac() {
		return (EReference)roomEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Occupied() {
		return (EReference)roomEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Sensor() {
		return (EReference)roomEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Projector() {
		return (EReference)roomEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Cooker() {
		return (EReference)roomEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Wm() {
		return (EReference)roomEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Cm() {
		return (EReference)roomEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeating() {
		return heatingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeating_Name() {
		return (EAttribute)heatingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeating_Level() {
		return (EAttribute)heatingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindow() {
		return windowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_Name() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_CurtainOn() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_Opened() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAirConditioner() {
		return airConditionerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAirConditioner_Level() {
		return (EAttribute)airConditionerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAirConditioner_FreshAir() {
		return (EAttribute)airConditionerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAirConditioner_Room() {
		return (EReference)airConditionerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLight() {
		return lightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLight_Level() {
		return (EAttribute)lightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjector() {
		return projectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjector_On() {
		return (EAttribute)projectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjector_Brightness() {
		return (EAttribute)projectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjector_Volume() {
		return (EAttribute)projectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjector_Room() {
		return (EReference)projectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWashingMachine() {
		return washingMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWashingMachine_Loaded() {
		return (EAttribute)washingMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWashingMachine_On() {
		return (EAttribute)washingMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWashingMachine_Room() {
		return (EReference)washingMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Temp() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Air() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Brightness() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Battery() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Circle() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCooker() {
		return cookerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCooker_On() {
		return (EAttribute)cookerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoffeeMaker() {
		return coffeeMakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoffeeMaker_Loaded() {
		return (EAttribute)coffeeMakerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoffeeMaker_On() {
		return (EAttribute)coffeeMakerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoffeeMaker_Warming() {
		return (EAttribute)coffeeMakerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoffeeMaker_Room() {
		return (EReference)coffeeMakerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaterHeater() {
		return waterHeaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaterHeater_Temp() {
		return (EAttribute)waterHeaterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaterHeater_On() {
		return (EAttribute)waterHeaterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaterHeater_Boost() {
		return (EAttribute)waterHeaterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWaterHeater_House() {
		return (EReference)waterHeaterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEV() {
		return evEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEV_Name() {
		return (EAttribute)evEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEV_Pluged() {
		return (EAttribute)evEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEV_Level() {
		return (EAttribute)evEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEV_Charging() {
		return (EAttribute)evEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEV_House() {
		return (EReference)evEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartHouseFactory getSmartHouseFactory() {
		return (SmartHouseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		houseEClass = createEClass(HOUSE);
		createEAttribute(houseEClass, HOUSE__NAME);
		createEAttribute(houseEClass, HOUSE__EPRICE);
		createEAttribute(houseEClass, HOUSE__TIME);
		createEAttribute(houseEClass, HOUSE__OUTTEMP);
		createEReference(houseEClass, HOUSE__ROOM);
		createEReference(houseEClass, HOUSE__MEMBER);
		createEReference(houseEClass, HOUSE__WH);
		createEReference(houseEClass, HOUSE__EV);
		createEReference(houseEClass, HOUSE__GATE);
		createEReference(houseEClass, HOUSE__SEC);

		gateEClass = createEClass(GATE);
		createEAttribute(gateEClass, GATE__OUTLOCKED);
		createEReference(gateEClass, GATE__HOUSE);

		securityEClass = createEClass(SECURITY);
		createEAttribute(securityEClass, SECURITY__ON);
		createEReference(securityEClass, SECURITY__HOUSE);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__NAME);

		waterHeaterEClass = createEClass(WATER_HEATER);
		createEAttribute(waterHeaterEClass, WATER_HEATER__TEMP);
		createEAttribute(waterHeaterEClass, WATER_HEATER__ON);
		createEAttribute(waterHeaterEClass, WATER_HEATER__BOOST);
		createEReference(waterHeaterEClass, WATER_HEATER__HOUSE);

		evEClass = createEClass(EV);
		createEAttribute(evEClass, EV__NAME);
		createEAttribute(evEClass, EV__PLUGED);
		createEAttribute(evEClass, EV__LEVEL);
		createEAttribute(evEClass, EV__CHARGING);
		createEReference(evEClass, EV__HOUSE);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__TEMP);
		createEAttribute(roomEClass, ROOM__BRIGHT);
		createEAttribute(roomEClass, ROOM__AIR);
		createEAttribute(roomEClass, ROOM__NAME);
		createEReference(roomEClass, ROOM__HOUSE);
		createEReference(roomEClass, ROOM__WINDOW);
		createEReference(roomEClass, ROOM__HEATING);
		createEReference(roomEClass, ROOM__LIGHT);
		createEReference(roomEClass, ROOM__AC);
		createEReference(roomEClass, ROOM__OCCUPIED);
		createEReference(roomEClass, ROOM__SENSOR);
		createEReference(roomEClass, ROOM__PROJECTOR);
		createEReference(roomEClass, ROOM__COOKER);
		createEReference(roomEClass, ROOM__WM);
		createEReference(roomEClass, ROOM__CM);

		heatingEClass = createEClass(HEATING);
		createEAttribute(heatingEClass, HEATING__NAME);
		createEAttribute(heatingEClass, HEATING__LEVEL);

		windowEClass = createEClass(WINDOW);
		createEAttribute(windowEClass, WINDOW__NAME);
		createEAttribute(windowEClass, WINDOW__CURTAIN_ON);
		createEAttribute(windowEClass, WINDOW__OPENED);

		airConditionerEClass = createEClass(AIR_CONDITIONER);
		createEAttribute(airConditionerEClass, AIR_CONDITIONER__LEVEL);
		createEAttribute(airConditionerEClass, AIR_CONDITIONER__FRESH_AIR);
		createEReference(airConditionerEClass, AIR_CONDITIONER__ROOM);

		lightEClass = createEClass(LIGHT);
		createEAttribute(lightEClass, LIGHT__LEVEL);

		projectorEClass = createEClass(PROJECTOR);
		createEAttribute(projectorEClass, PROJECTOR__ON);
		createEAttribute(projectorEClass, PROJECTOR__BRIGHTNESS);
		createEAttribute(projectorEClass, PROJECTOR__VOLUME);
		createEReference(projectorEClass, PROJECTOR__ROOM);

		washingMachineEClass = createEClass(WASHING_MACHINE);
		createEAttribute(washingMachineEClass, WASHING_MACHINE__LOADED);
		createEAttribute(washingMachineEClass, WASHING_MACHINE__ON);
		createEReference(washingMachineEClass, WASHING_MACHINE__ROOM);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__TEMP);
		createEAttribute(sensorEClass, SENSOR__AIR);
		createEAttribute(sensorEClass, SENSOR__BRIGHTNESS);
		createEAttribute(sensorEClass, SENSOR__BATTERY);
		createEAttribute(sensorEClass, SENSOR__CIRCLE);

		cookerEClass = createEClass(COOKER);
		createEAttribute(cookerEClass, COOKER__ON);

		coffeeMakerEClass = createEClass(COFFEE_MAKER);
		createEAttribute(coffeeMakerEClass, COFFEE_MAKER__LOADED);
		createEAttribute(coffeeMakerEClass, COFFEE_MAKER__ON);
		createEAttribute(coffeeMakerEClass, COFFEE_MAKER__WARMING);
		createEReference(coffeeMakerEClass, COFFEE_MAKER__ROOM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(houseEClass, House.class, "House", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHouse_Name(), ecorePackage.getEString(), "name", null, 1, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHouse_Eprice(), ecorePackage.getEBigDecimal(), "eprice", null, 1, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHouse_Time(), ecorePackage.getEBigInteger(), "time", null, 1, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHouse_Outtemp(), ecorePackage.getEBigDecimal(), "outtemp", null, 1, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHouse_Room(), this.getRoom(), this.getRoom_House(), "room", null, 0, -1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHouse_Member(), this.getPerson(), null, "member", null, 0, -1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHouse_Wh(), this.getWaterHeater(), this.getWaterHeater_House(), "wh", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHouse_Ev(), this.getEV(), this.getEV_House(), "ev", null, 0, -1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHouse_Gate(), this.getGate(), this.getGate_House(), "gate", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHouse_Sec(), this.getSecurity(), this.getSecurity_House(), "sec", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gateEClass, Gate.class, "Gate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGate_Outlocked(), ecorePackage.getEBoolean(), "outlocked", null, 1, 1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGate_House(), this.getHouse(), this.getHouse_Gate(), "house", null, 1, 1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(securityEClass, Security.class, "Security", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurity_On(), ecorePackage.getEBoolean(), "on", null, 1, 1, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurity_House(), this.getHouse(), this.getHouse_Sec(), "house", null, 1, 1, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(waterHeaterEClass, WaterHeater.class, "WaterHeater", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWaterHeater_Temp(), ecorePackage.getEBigDecimal(), "temp", null, 1, 1, WaterHeater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWaterHeater_On(), ecorePackage.getEBoolean(), "on", null, 1, 1, WaterHeater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWaterHeater_Boost(), ecorePackage.getEBoolean(), "boost", null, 1, 1, WaterHeater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWaterHeater_House(), this.getHouse(), this.getHouse_Wh(), "house", null, 1, 1, WaterHeater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(evEClass, SmartHouse.EV.class, "EV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEV_Name(), ecorePackage.getEString(), "name", null, 1, 1, SmartHouse.EV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEV_Pluged(), ecorePackage.getEBoolean(), "pluged", null, 1, 1, SmartHouse.EV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEV_Level(), ecorePackage.getEBigInteger(), "level", null, 1, 1, SmartHouse.EV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEV_Charging(), ecorePackage.getEBoolean(), "charging", null, 1, 1, SmartHouse.EV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEV_House(), this.getHouse(), this.getHouse_Ev(), "house", null, 1, 1, SmartHouse.EV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Temp(), ecorePackage.getEDouble(), "temp", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Bright(), ecorePackage.getEBigDecimal(), "bright", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Air(), ecorePackage.getEInt(), "air", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Name(), ecorePackage.getEString(), "name", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_House(), this.getHouse(), this.getHouse_Room(), "house", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Window(), this.getWindow(), null, "window", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Heating(), this.getHeating(), null, "heating", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Light(), this.getLight(), null, "light", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Ac(), this.getAirConditioner(), this.getAirConditioner_Room(), "ac", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Occupied(), this.getPerson(), null, "occupied", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Sensor(), this.getSensor(), null, "sensor", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Projector(), this.getProjector(), this.getProjector_Room(), "projector", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Cooker(), this.getCooker(), null, "cooker", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Wm(), this.getWashingMachine(), this.getWashingMachine_Room(), "wm", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Cm(), this.getCoffeeMaker(), this.getCoffeeMaker_Room(), "cm", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(heatingEClass, Heating.class, "Heating", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeating_Name(), ecorePackage.getEString(), "name", null, 1, 1, Heating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHeating_Level(), ecorePackage.getEInt(), "level", null, 1, 1, Heating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(windowEClass, Window.class, "Window", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWindow_Name(), ecorePackage.getEString(), "name", null, 1, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWindow_CurtainOn(), ecorePackage.getEBoolean(), "curtainOn", null, 1, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWindow_Opened(), ecorePackage.getEBoolean(), "opened", null, 1, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(airConditionerEClass, AirConditioner.class, "AirConditioner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAirConditioner_Level(), ecorePackage.getEBigInteger(), "level", null, 1, 1, AirConditioner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAirConditioner_FreshAir(), ecorePackage.getEBoolean(), "freshAir", null, 1, 1, AirConditioner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAirConditioner_Room(), this.getRoom(), this.getRoom_Ac(), "room", null, 1, 1, AirConditioner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lightEClass, Light.class, "Light", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLight_Level(), ecorePackage.getEBigInteger(), "level", null, 1, 1, Light.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(projectorEClass, Projector.class, "Projector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjector_On(), ecorePackage.getEBoolean(), "on", null, 1, 1, Projector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProjector_Brightness(), ecorePackage.getEBigInteger(), "brightness", null, 1, 1, Projector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProjector_Volume(), ecorePackage.getEBigInteger(), "volume", null, 1, 1, Projector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProjector_Room(), this.getRoom(), this.getRoom_Projector(), "room", null, 1, 1, Projector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(washingMachineEClass, WashingMachine.class, "WashingMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWashingMachine_Loaded(), ecorePackage.getEBoolean(), "loaded", null, 1, 1, WashingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWashingMachine_On(), ecorePackage.getEBoolean(), "on", null, 1, 1, WashingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWashingMachine_Room(), this.getRoom(), this.getRoom_Wm(), "room", null, 1, 1, WashingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Temp(), ecorePackage.getEBoolean(), "temp", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSensor_Air(), ecorePackage.getEBoolean(), "air", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSensor_Brightness(), ecorePackage.getEBoolean(), "brightness", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSensor_Battery(), ecorePackage.getEBigInteger(), "battery", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSensor_Circle(), ecorePackage.getEBigDecimal(), "circle", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cookerEClass, Cooker.class, "Cooker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCooker_On(), ecorePackage.getEBoolean(), "on", null, 1, 1, Cooker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(coffeeMakerEClass, CoffeeMaker.class, "CoffeeMaker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoffeeMaker_Loaded(), ecorePackage.getEBoolean(), "loaded", null, 1, 1, CoffeeMaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCoffeeMaker_On(), ecorePackage.getEBoolean(), "on", null, 1, 1, CoffeeMaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCoffeeMaker_Warming(), ecorePackage.getEBoolean(), "warming", null, 1, 1, CoffeeMaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoffeeMaker_Room(), this.getRoom(), this.getRoom_Cm(), "room", null, 1, 1, CoffeeMaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// config
		createConfigAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });		
		addAnnotation
		  (houseEClass, 
		   source, 
		   new String[] {
			 "constraints", "TooExpensiveToUseThemTogether SuperExpensiveNotUseAnything WatchDog NoWindowOpenWhenSecOn User__VeryNotSafe"
		   });				
		addAnnotation
		  (waterHeaterEClass, 
		   source, 
		   new String[] {
			 "constraints", "DoNotHeatItForever ColdWaterNeedHeating INeedHotWaterInTheMorning User__HotWaterAlways"
		   });					
		addAnnotation
		  (evEClass, 
		   source, 
		   new String[] {
			 "constraints", "LowLeveNeedCharge LowPricePleaseCharge"
		   });				
		addAnnotation
		  (roomEClass, 
		   source, 
		   new String[] {
			 "constraints", "TooColdNeedHeating ExtremelyColdNeedMoreHeating NoWindowOpenWhenHeating NoWindowOpenWhenHeating NoHeatingAndCoolingTogether TooLateNoShouting ProjectingInDarkness INeedFreshAir TooColdToOpenWindow User__AlwaysOpenWindow User__AlwaysTurnOnFirstHeating User__ILoveCurtains"
		   });						
		addAnnotation
		  (airConditionerEClass, 
		   source, 
		   new String[] {
			 "constraints", "TooHotOpenAC CodeNoAC HotOutside User__HotOutside"
		   });					
		addAnnotation
		  (lightEClass, 
		   source, 
		   new String[] {
			 "constraints", "User__LightWideOpen"
		   });				
		addAnnotation
		  (projectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "TooNoisyToWatchTVWhenWashing"
		   });						
		addAnnotation
		  (washingMachineEClass, 
		   source, 
		   new String[] {
			 "constraints", "OnWhenLoaded User__WashImmediately"
		   });				
		addAnnotation
		  (sensorEClass, 
		   source, 
		   new String[] {
			 "constraints", "RunningOutOfPower"
		   });								
		addAnnotation
		  (coffeeMakerEClass, 
		   source, 
		   new String[] {
			 "constraints", "MakeCoffeeForMeInTheMorning NoCarNoCoffee KeepItWarm KeepItWarm User__IWantWarmed"
		   });			
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";				
		addAnnotation
		  (houseEClass, 
		   source, 
		   new String[] {
			 "TooExpensiveToUseThemTogether", "eprice > 15 implies ev->forAll(e : EV | e.charging = false) or not wh.on or room.heating->flatten()->forAll(e : Heating | e.level < 3)",
			 "SuperExpensiveNotUseAnything", "eprice > 20 implies ev->forAll(e : EV | e.charging = false) and not wh.on and room.heating->flatten()->forAll(e : Heating | e.level = 0)",
			 "WatchDog", "gate.outlocked implies sec.on",
			 "NoWindowOpenWhenSecOn", "sec.on implies room->select(e : Room | e.name = \'liv\').window->flatten()->forAll(e : Window | e.opened = false)",
			 "User__VeryNotSafe", "gate.outlocked implies sec.on = true"
		   });				
		addAnnotation
		  (waterHeaterEClass, 
		   source, 
		   new String[] {
			 "DoNotHeatItForever", "temp < 50 or not on",
			 "ColdWaterNeedHeating", "temp < 30 implies on",
			 "INeedHotWaterInTheMorning", "house.time < 2 or house.time > 8 or on",
			 "User__HotWaterAlways", "temp < 30 and (house.time < 2 or house.time > 8) implies on = true"
		   });					
		addAnnotation
		  (evEClass, 
		   source, 
		   new String[] {
			 "LowLeveNeedCharge", "if pluged then level < 30 implies charging else true endif",
			 "LowPricePleaseCharge", "if pluged then house.eprice < 10 implies charging else true endif"
		   });				
		addAnnotation
		  (roomEClass, 
		   source, 
		   new String[] {
			 "TooColdNeedHeating", "temp < 18 implies heating->exists(e : Heating | e.level > 0)",
			 "ExtremelyColdNeedMoreHeating", "temp < 10 implies heating.level->sum() > 3 * heating->size()",
			 "NoWindowOpenWhenHeating", "window->forAll(e : Window | e.opened = false) or ac->forAll(e : AirConditioner | e.level = 0)",
			 "NoHeatingAndCoolingTogether", "heating->forAll(e : Heating | e.level = 0) or ac->forAll(e : AirConditioner | e.level = 0)",
			 "TooLateNoShouting", "house.time > 22 implies projector.volume < 4",
			 "ProjectingInDarkness", "projector.on and bright > 500 implies light->forAll(e : Light | e.level = 0) and window->forAll(e : Window | e.curtainOn)",
			 "INeedFreshAir", "air > 5 implies window->exists(e : Window | e.opened)",
			 "TooColdToOpenWindow", "house.outtemp > 5 or window->forAll(e : Window | not e.opened)",
			 "User__AlwaysOpenWindow", "air > 6 and house.outtemp >= 10 implies window->asSequence()->first().opened = true",
			 "User__AlwaysTurnOnFirstHeating", "temp < 10 and house.eprice < 20 implies heating->asSequence()->first().level = 10",
			 "User__ILoveCurtains", "projector.on implies window->asSequence()->first().curtainOn = true"
		   });						
		addAnnotation
		  (airConditionerEClass, 
		   source, 
		   new String[] {
			 "TooHotOpenAC", "room.temp > 28 implies level > 5",
			 "CodeNoAC", "room.temp < 23 implies level = 0",
			 "HotOutside", "room.house.outtemp > 30 implies level > 5",
			 "User__HotOutside", "level > 0 implies level = 9"
		   });					
		addAnnotation
		  (lightEClass, 
		   source, 
		   new String[] {
			 "User__LightWideOpen", "level <> 0 implies level = 5"
		   });				
		addAnnotation
		  (projectorEClass, 
		   source, 
		   new String[] {
			 "TooNoisyToWatchTVWhenWashing", "if room.wm <> null then not room.wm.on or not on else true endif"
		   });						
		addAnnotation
		  (washingMachineEClass, 
		   source, 
		   new String[] {
			 "OnWhenLoaded", "loaded implies on",
			 "User__WashImmediately", "loaded implies on = true"
		   });				
		addAnnotation
		  (sensorEClass, 
		   source, 
		   new String[] {
			 "RunningOutOfPower", "battery < 20 implies circle < 30"
		   });								
		addAnnotation
		  (coffeeMakerEClass, 
		   source, 
		   new String[] {
			 "MakeCoffeeForMeInTheMorning", "room.house.time = 7 and loaded implies on",
			 "NoCarNoCoffee", "room.house.ev->exists(e : EV | e.pluged) or on",
			 "KeepItWarm", "room.temp > 20 implies not warming",
			 "User__IWantWarmed", "loaded implies warming = true"
		   });		
	}

	/**
	 * Initializes the annotations for <b>config</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConfigAnnotations() {
		String source = "config";					
		addAnnotation
		  (getSecurity_On(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getWaterHeater_On(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getWaterHeater_Boost(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getEV_Charging(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getHeating_Level(), 
		   source, 
		   new String[] {
			 "domain", "0..10"
		   });		
		addAnnotation
		  (getWindow_CurtainOn(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getWindow_Opened(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getAirConditioner_Level(), 
		   source, 
		   new String[] {
			 "domain", "0..10"
		   });		
		addAnnotation
		  (getAirConditioner_FreshAir(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getLight_Level(), 
		   source, 
		   new String[] {
			 "domain", "0..10"
		   });				
		addAnnotation
		  (getProjector_On(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getProjector_Brightness(), 
		   source, 
		   new String[] {
			 "domain", "0..10"
		   });		
		addAnnotation
		  (getProjector_Volume(), 
		   source, 
		   new String[] {
			 "domain", "0..10"
		   });				
		addAnnotation
		  (getWashingMachine_On(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getSensor_Temp(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSensor_Air(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSensor_Brightness(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getSensor_Circle(), 
		   source, 
		   new String[] {
			 "domain", "0..10"
		   });		
		addAnnotation
		  (getCooker_On(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getCoffeeMaker_On(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getCoffeeMaker_Warming(), 
		   source, 
		   new String[] {
		   });
	}

} //SmartHousePackageImpl
