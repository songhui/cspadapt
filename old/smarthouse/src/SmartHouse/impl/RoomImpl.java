/**
 */
package SmartHouse.impl;

import SmartHouse.AirConditioner;
import SmartHouse.CoffeeMaker;
import SmartHouse.Cooker;
import SmartHouse.Heating;
import SmartHouse.House;
import SmartHouse.Light;
import SmartHouse.Person;
import SmartHouse.Projector;
import SmartHouse.Room;
import SmartHouse.Sensor;
import SmartHouse.SmartHousePackage;

import SmartHouse.WashingMachine;
import SmartHouse.Window;
import java.math.BigDecimal;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SmartHouse.impl.RoomImpl#getTemp <em>Temp</em>}</li>
 *   <li>{@link SmartHouse.impl.RoomImpl#getBright <em>Bright</em>}</li>
 *   <li>{@link SmartHouse.impl.RoomImpl#getAir <em>Air</em>}</li>
 *   <li>{@link SmartHouse.impl.RoomImpl#getName <em>Name</em>}</li>
 *   <li>{@link SmartHouse.impl.RoomImpl#getHouse <em>House</em>}</li>
 *   <li>{@link SmartHouse.impl.RoomImpl#getWindow <em>Window</em>}</li>
 *   <li>{@link SmartHouse.impl.RoomImpl#getHeating <em>Heating</em>}</li>
 *   <li>{@link SmartHouse.impl.RoomImpl#getLight <em>Light</em>}</li>
 *   <li>{@link SmartHouse.impl.RoomImpl#getAc <em>Ac</em>}</li>
 *   <li>{@link SmartHouse.impl.RoomImpl#getOccupied <em>Occupied</em>}</li>
 *   <li>{@link SmartHouse.impl.RoomImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link SmartHouse.impl.RoomImpl#getProjector <em>Projector</em>}</li>
 *   <li>{@link SmartHouse.impl.RoomImpl#getCooker <em>Cooker</em>}</li>
 *   <li>{@link SmartHouse.impl.RoomImpl#getWm <em>Wm</em>}</li>
 *   <li>{@link SmartHouse.impl.RoomImpl#getCm <em>Cm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomImpl extends EObjectImpl implements Room {
	/**
	 * The default value of the '{@link #getTemp() <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemp()
	 * @generated
	 * @ordered
	 */
	protected static final double TEMP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTemp() <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemp()
	 * @generated
	 * @ordered
	 */
	protected double temp = TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getBright() <em>Bright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBright()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BRIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBright() <em>Bright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBright()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal bright = BRIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAir() <em>Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAir()
	 * @generated
	 * @ordered
	 */
	protected static final int AIR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAir() <em>Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAir()
	 * @generated
	 * @ordered
	 */
	protected int air = AIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWindow() <em>Window</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow()
	 * @generated
	 * @ordered
	 */
	protected EList<Window> window;

	/**
	 * The cached value of the '{@link #getHeating() <em>Heating</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating()
	 * @generated
	 * @ordered
	 */
	protected EList<Heating> heating;

	/**
	 * The cached value of the '{@link #getLight() <em>Light</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected EList<Light> light;

	/**
	 * The cached value of the '{@link #getAc() <em>Ac</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAc()
	 * @generated
	 * @ordered
	 */
	protected EList<AirConditioner> ac;

	/**
	 * The cached value of the '{@link #getOccupied() <em>Occupied</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupied()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> occupied;

	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensor;

	/**
	 * The cached value of the '{@link #getProjector() <em>Projector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjector()
	 * @generated
	 * @ordered
	 */
	protected Projector projector;

	/**
	 * The cached value of the '{@link #getCooker() <em>Cooker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooker()
	 * @generated
	 * @ordered
	 */
	protected Cooker cooker;

	/**
	 * The cached value of the '{@link #getWm() <em>Wm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWm()
	 * @generated
	 * @ordered
	 */
	protected WashingMachine wm;

	/**
	 * The cached value of the '{@link #getCm() <em>Cm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCm()
	 * @generated
	 * @ordered
	 */
	protected CoffeeMaker cm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHousePackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTemp() {
		return temp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemp(double newTemp) {
		double oldTemp = temp;
		temp = newTemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.ROOM__TEMP, oldTemp, temp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getBright() {
		return bright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBright(BigDecimal newBright) {
		BigDecimal oldBright = bright;
		bright = newBright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.ROOM__BRIGHT, oldBright, bright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAir() {
		return air;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAir(int newAir) {
		int oldAir = air;
		air = newAir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.ROOM__AIR, oldAir, air));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.ROOM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House getHouse() {
		if (eContainerFeatureID() != SmartHousePackage.ROOM__HOUSE) return null;
		return (House)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHouse(House newHouse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHouse, SmartHousePackage.ROOM__HOUSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouse(House newHouse) {
		if (newHouse != eInternalContainer() || (eContainerFeatureID() != SmartHousePackage.ROOM__HOUSE && newHouse != null)) {
			if (EcoreUtil.isAncestor(this, newHouse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHouse != null)
				msgs = ((InternalEObject)newHouse).eInverseAdd(this, SmartHousePackage.HOUSE__ROOM, House.class, msgs);
			msgs = basicSetHouse(newHouse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.ROOM__HOUSE, newHouse, newHouse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Window> getWindow() {
		if (window == null) {
			window = new EObjectContainmentEList<Window>(Window.class, this, SmartHousePackage.ROOM__WINDOW);
		}
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Heating> getHeating() {
		if (heating == null) {
			heating = new EObjectContainmentEList<Heating>(Heating.class, this, SmartHousePackage.ROOM__HEATING);
		}
		return heating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Light> getLight() {
		if (light == null) {
			light = new EObjectContainmentEList<Light>(Light.class, this, SmartHousePackage.ROOM__LIGHT);
		}
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AirConditioner> getAc() {
		if (ac == null) {
			ac = new EObjectContainmentWithInverseEList<AirConditioner>(AirConditioner.class, this, SmartHousePackage.ROOM__AC, SmartHousePackage.AIR_CONDITIONER__ROOM);
		}
		return ac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getOccupied() {
		if (occupied == null) {
			occupied = new EObjectResolvingEList<Person>(Person.class, this, SmartHousePackage.ROOM__OCCUPIED);
		}
		return occupied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensor() {
		if (sensor == null) {
			sensor = new EObjectContainmentEList<Sensor>(Sensor.class, this, SmartHousePackage.ROOM__SENSOR);
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Projector getProjector() {
		return projector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjector(Projector newProjector, NotificationChain msgs) {
		Projector oldProjector = projector;
		projector = newProjector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartHousePackage.ROOM__PROJECTOR, oldProjector, newProjector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjector(Projector newProjector) {
		if (newProjector != projector) {
			NotificationChain msgs = null;
			if (projector != null)
				msgs = ((InternalEObject)projector).eInverseRemove(this, SmartHousePackage.PROJECTOR__ROOM, Projector.class, msgs);
			if (newProjector != null)
				msgs = ((InternalEObject)newProjector).eInverseAdd(this, SmartHousePackage.PROJECTOR__ROOM, Projector.class, msgs);
			msgs = basicSetProjector(newProjector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.ROOM__PROJECTOR, newProjector, newProjector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cooker getCooker() {
		return cooker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCooker(Cooker newCooker, NotificationChain msgs) {
		Cooker oldCooker = cooker;
		cooker = newCooker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartHousePackage.ROOM__COOKER, oldCooker, newCooker);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooker(Cooker newCooker) {
		if (newCooker != cooker) {
			NotificationChain msgs = null;
			if (cooker != null)
				msgs = ((InternalEObject)cooker).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartHousePackage.ROOM__COOKER, null, msgs);
			if (newCooker != null)
				msgs = ((InternalEObject)newCooker).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartHousePackage.ROOM__COOKER, null, msgs);
			msgs = basicSetCooker(newCooker, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.ROOM__COOKER, newCooker, newCooker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WashingMachine getWm() {
		return wm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWm(WashingMachine newWm, NotificationChain msgs) {
		WashingMachine oldWm = wm;
		wm = newWm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartHousePackage.ROOM__WM, oldWm, newWm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWm(WashingMachine newWm) {
		if (newWm != wm) {
			NotificationChain msgs = null;
			if (wm != null)
				msgs = ((InternalEObject)wm).eInverseRemove(this, SmartHousePackage.WASHING_MACHINE__ROOM, WashingMachine.class, msgs);
			if (newWm != null)
				msgs = ((InternalEObject)newWm).eInverseAdd(this, SmartHousePackage.WASHING_MACHINE__ROOM, WashingMachine.class, msgs);
			msgs = basicSetWm(newWm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.ROOM__WM, newWm, newWm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoffeeMaker getCm() {
		return cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCm(CoffeeMaker newCm, NotificationChain msgs) {
		CoffeeMaker oldCm = cm;
		cm = newCm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartHousePackage.ROOM__CM, oldCm, newCm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCm(CoffeeMaker newCm) {
		if (newCm != cm) {
			NotificationChain msgs = null;
			if (cm != null)
				msgs = ((InternalEObject)cm).eInverseRemove(this, SmartHousePackage.COFFEE_MAKER__ROOM, CoffeeMaker.class, msgs);
			if (newCm != null)
				msgs = ((InternalEObject)newCm).eInverseAdd(this, SmartHousePackage.COFFEE_MAKER__ROOM, CoffeeMaker.class, msgs);
			msgs = basicSetCm(newCm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.ROOM__CM, newCm, newCm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartHousePackage.ROOM__HOUSE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHouse((House)otherEnd, msgs);
			case SmartHousePackage.ROOM__AC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAc()).basicAdd(otherEnd, msgs);
			case SmartHousePackage.ROOM__PROJECTOR:
				if (projector != null)
					msgs = ((InternalEObject)projector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartHousePackage.ROOM__PROJECTOR, null, msgs);
				return basicSetProjector((Projector)otherEnd, msgs);
			case SmartHousePackage.ROOM__WM:
				if (wm != null)
					msgs = ((InternalEObject)wm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartHousePackage.ROOM__WM, null, msgs);
				return basicSetWm((WashingMachine)otherEnd, msgs);
			case SmartHousePackage.ROOM__CM:
				if (cm != null)
					msgs = ((InternalEObject)cm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartHousePackage.ROOM__CM, null, msgs);
				return basicSetCm((CoffeeMaker)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartHousePackage.ROOM__HOUSE:
				return basicSetHouse(null, msgs);
			case SmartHousePackage.ROOM__WINDOW:
				return ((InternalEList<?>)getWindow()).basicRemove(otherEnd, msgs);
			case SmartHousePackage.ROOM__HEATING:
				return ((InternalEList<?>)getHeating()).basicRemove(otherEnd, msgs);
			case SmartHousePackage.ROOM__LIGHT:
				return ((InternalEList<?>)getLight()).basicRemove(otherEnd, msgs);
			case SmartHousePackage.ROOM__AC:
				return ((InternalEList<?>)getAc()).basicRemove(otherEnd, msgs);
			case SmartHousePackage.ROOM__SENSOR:
				return ((InternalEList<?>)getSensor()).basicRemove(otherEnd, msgs);
			case SmartHousePackage.ROOM__PROJECTOR:
				return basicSetProjector(null, msgs);
			case SmartHousePackage.ROOM__COOKER:
				return basicSetCooker(null, msgs);
			case SmartHousePackage.ROOM__WM:
				return basicSetWm(null, msgs);
			case SmartHousePackage.ROOM__CM:
				return basicSetCm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SmartHousePackage.ROOM__HOUSE:
				return eInternalContainer().eInverseRemove(this, SmartHousePackage.HOUSE__ROOM, House.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmartHousePackage.ROOM__TEMP:
				return getTemp();
			case SmartHousePackage.ROOM__BRIGHT:
				return getBright();
			case SmartHousePackage.ROOM__AIR:
				return getAir();
			case SmartHousePackage.ROOM__NAME:
				return getName();
			case SmartHousePackage.ROOM__HOUSE:
				return getHouse();
			case SmartHousePackage.ROOM__WINDOW:
				return getWindow();
			case SmartHousePackage.ROOM__HEATING:
				return getHeating();
			case SmartHousePackage.ROOM__LIGHT:
				return getLight();
			case SmartHousePackage.ROOM__AC:
				return getAc();
			case SmartHousePackage.ROOM__OCCUPIED:
				return getOccupied();
			case SmartHousePackage.ROOM__SENSOR:
				return getSensor();
			case SmartHousePackage.ROOM__PROJECTOR:
				return getProjector();
			case SmartHousePackage.ROOM__COOKER:
				return getCooker();
			case SmartHousePackage.ROOM__WM:
				return getWm();
			case SmartHousePackage.ROOM__CM:
				return getCm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmartHousePackage.ROOM__TEMP:
				setTemp((Double)newValue);
				return;
			case SmartHousePackage.ROOM__BRIGHT:
				setBright((BigDecimal)newValue);
				return;
			case SmartHousePackage.ROOM__AIR:
				setAir((Integer)newValue);
				return;
			case SmartHousePackage.ROOM__NAME:
				setName((String)newValue);
				return;
			case SmartHousePackage.ROOM__HOUSE:
				setHouse((House)newValue);
				return;
			case SmartHousePackage.ROOM__WINDOW:
				getWindow().clear();
				getWindow().addAll((Collection<? extends Window>)newValue);
				return;
			case SmartHousePackage.ROOM__HEATING:
				getHeating().clear();
				getHeating().addAll((Collection<? extends Heating>)newValue);
				return;
			case SmartHousePackage.ROOM__LIGHT:
				getLight().clear();
				getLight().addAll((Collection<? extends Light>)newValue);
				return;
			case SmartHousePackage.ROOM__AC:
				getAc().clear();
				getAc().addAll((Collection<? extends AirConditioner>)newValue);
				return;
			case SmartHousePackage.ROOM__OCCUPIED:
				getOccupied().clear();
				getOccupied().addAll((Collection<? extends Person>)newValue);
				return;
			case SmartHousePackage.ROOM__SENSOR:
				getSensor().clear();
				getSensor().addAll((Collection<? extends Sensor>)newValue);
				return;
			case SmartHousePackage.ROOM__PROJECTOR:
				setProjector((Projector)newValue);
				return;
			case SmartHousePackage.ROOM__COOKER:
				setCooker((Cooker)newValue);
				return;
			case SmartHousePackage.ROOM__WM:
				setWm((WashingMachine)newValue);
				return;
			case SmartHousePackage.ROOM__CM:
				setCm((CoffeeMaker)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SmartHousePackage.ROOM__TEMP:
				setTemp(TEMP_EDEFAULT);
				return;
			case SmartHousePackage.ROOM__BRIGHT:
				setBright(BRIGHT_EDEFAULT);
				return;
			case SmartHousePackage.ROOM__AIR:
				setAir(AIR_EDEFAULT);
				return;
			case SmartHousePackage.ROOM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmartHousePackage.ROOM__HOUSE:
				setHouse((House)null);
				return;
			case SmartHousePackage.ROOM__WINDOW:
				getWindow().clear();
				return;
			case SmartHousePackage.ROOM__HEATING:
				getHeating().clear();
				return;
			case SmartHousePackage.ROOM__LIGHT:
				getLight().clear();
				return;
			case SmartHousePackage.ROOM__AC:
				getAc().clear();
				return;
			case SmartHousePackage.ROOM__OCCUPIED:
				getOccupied().clear();
				return;
			case SmartHousePackage.ROOM__SENSOR:
				getSensor().clear();
				return;
			case SmartHousePackage.ROOM__PROJECTOR:
				setProjector((Projector)null);
				return;
			case SmartHousePackage.ROOM__COOKER:
				setCooker((Cooker)null);
				return;
			case SmartHousePackage.ROOM__WM:
				setWm((WashingMachine)null);
				return;
			case SmartHousePackage.ROOM__CM:
				setCm((CoffeeMaker)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SmartHousePackage.ROOM__TEMP:
				return temp != TEMP_EDEFAULT;
			case SmartHousePackage.ROOM__BRIGHT:
				return BRIGHT_EDEFAULT == null ? bright != null : !BRIGHT_EDEFAULT.equals(bright);
			case SmartHousePackage.ROOM__AIR:
				return air != AIR_EDEFAULT;
			case SmartHousePackage.ROOM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmartHousePackage.ROOM__HOUSE:
				return getHouse() != null;
			case SmartHousePackage.ROOM__WINDOW:
				return window != null && !window.isEmpty();
			case SmartHousePackage.ROOM__HEATING:
				return heating != null && !heating.isEmpty();
			case SmartHousePackage.ROOM__LIGHT:
				return light != null && !light.isEmpty();
			case SmartHousePackage.ROOM__AC:
				return ac != null && !ac.isEmpty();
			case SmartHousePackage.ROOM__OCCUPIED:
				return occupied != null && !occupied.isEmpty();
			case SmartHousePackage.ROOM__SENSOR:
				return sensor != null && !sensor.isEmpty();
			case SmartHousePackage.ROOM__PROJECTOR:
				return projector != null;
			case SmartHousePackage.ROOM__COOKER:
				return cooker != null;
			case SmartHousePackage.ROOM__WM:
				return wm != null;
			case SmartHousePackage.ROOM__CM:
				return cm != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (temp: ");
		result.append(temp);
		result.append(", bright: ");
		result.append(bright);
		result.append(", air: ");
		result.append(air);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
