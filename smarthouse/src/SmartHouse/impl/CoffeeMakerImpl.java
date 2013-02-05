/**
 */
package SmartHouse.impl;

import SmartHouse.CoffeeMaker;
import SmartHouse.Room;
import SmartHouse.SmartHousePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coffee Maker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SmartHouse.impl.CoffeeMakerImpl#isLoaded <em>Loaded</em>}</li>
 *   <li>{@link SmartHouse.impl.CoffeeMakerImpl#isOn <em>On</em>}</li>
 *   <li>{@link SmartHouse.impl.CoffeeMakerImpl#isWarming <em>Warming</em>}</li>
 *   <li>{@link SmartHouse.impl.CoffeeMakerImpl#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoffeeMakerImpl extends EObjectImpl implements CoffeeMaker {
	/**
	 * The default value of the '{@link #isLoaded() <em>Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoaded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOADED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLoaded() <em>Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoaded()
	 * @generated
	 * @ordered
	 */
	protected boolean loaded = LOADED_EDEFAULT;

	/**
	 * The default value of the '{@link #isOn() <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOn() <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOn()
	 * @generated
	 * @ordered
	 */
	protected boolean on = ON_EDEFAULT;

	/**
	 * The default value of the '{@link #isWarming() <em>Warming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWarming()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WARMING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWarming() <em>Warming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWarming()
	 * @generated
	 * @ordered
	 */
	protected boolean warming = WARMING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoffeeMakerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHousePackage.Literals.COFFEE_MAKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoaded() {
		return loaded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoaded(boolean newLoaded) {
		boolean oldLoaded = loaded;
		loaded = newLoaded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.COFFEE_MAKER__LOADED, oldLoaded, loaded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOn() {
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOn(boolean newOn) {
		boolean oldOn = on;
		on = newOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.COFFEE_MAKER__ON, oldOn, on));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWarming() {
		return warming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarming(boolean newWarming) {
		boolean oldWarming = warming;
		warming = newWarming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.COFFEE_MAKER__WARMING, oldWarming, warming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (eContainerFeatureID() != SmartHousePackage.COFFEE_MAKER__ROOM) return null;
		return (Room)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoom(Room newRoom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoom, SmartHousePackage.COFFEE_MAKER__ROOM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		if (newRoom != eInternalContainer() || (eContainerFeatureID() != SmartHousePackage.COFFEE_MAKER__ROOM && newRoom != null)) {
			if (EcoreUtil.isAncestor(this, newRoom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoom != null)
				msgs = ((InternalEObject)newRoom).eInverseAdd(this, SmartHousePackage.ROOM__CM, Room.class, msgs);
			msgs = basicSetRoom(newRoom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.COFFEE_MAKER__ROOM, newRoom, newRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartHousePackage.COFFEE_MAKER__ROOM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoom((Room)otherEnd, msgs);
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
			case SmartHousePackage.COFFEE_MAKER__ROOM:
				return basicSetRoom(null, msgs);
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
			case SmartHousePackage.COFFEE_MAKER__ROOM:
				return eInternalContainer().eInverseRemove(this, SmartHousePackage.ROOM__CM, Room.class, msgs);
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
			case SmartHousePackage.COFFEE_MAKER__LOADED:
				return isLoaded();
			case SmartHousePackage.COFFEE_MAKER__ON:
				return isOn();
			case SmartHousePackage.COFFEE_MAKER__WARMING:
				return isWarming();
			case SmartHousePackage.COFFEE_MAKER__ROOM:
				return getRoom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmartHousePackage.COFFEE_MAKER__LOADED:
				setLoaded((Boolean)newValue);
				return;
			case SmartHousePackage.COFFEE_MAKER__ON:
				setOn((Boolean)newValue);
				return;
			case SmartHousePackage.COFFEE_MAKER__WARMING:
				setWarming((Boolean)newValue);
				return;
			case SmartHousePackage.COFFEE_MAKER__ROOM:
				setRoom((Room)newValue);
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
			case SmartHousePackage.COFFEE_MAKER__LOADED:
				setLoaded(LOADED_EDEFAULT);
				return;
			case SmartHousePackage.COFFEE_MAKER__ON:
				setOn(ON_EDEFAULT);
				return;
			case SmartHousePackage.COFFEE_MAKER__WARMING:
				setWarming(WARMING_EDEFAULT);
				return;
			case SmartHousePackage.COFFEE_MAKER__ROOM:
				setRoom((Room)null);
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
			case SmartHousePackage.COFFEE_MAKER__LOADED:
				return loaded != LOADED_EDEFAULT;
			case SmartHousePackage.COFFEE_MAKER__ON:
				return on != ON_EDEFAULT;
			case SmartHousePackage.COFFEE_MAKER__WARMING:
				return warming != WARMING_EDEFAULT;
			case SmartHousePackage.COFFEE_MAKER__ROOM:
				return getRoom() != null;
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
		result.append(" (loaded: ");
		result.append(loaded);
		result.append(", on: ");
		result.append(on);
		result.append(", warming: ");
		result.append(warming);
		result.append(')');
		return result.toString();
	}

} //CoffeeMakerImpl
