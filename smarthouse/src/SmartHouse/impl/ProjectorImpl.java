/**
 */
package SmartHouse.impl;

import SmartHouse.Projector;
import SmartHouse.Room;
import SmartHouse.SmartHousePackage;

import java.math.BigInteger;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Projector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SmartHouse.impl.ProjectorImpl#isOn <em>On</em>}</li>
 *   <li>{@link SmartHouse.impl.ProjectorImpl#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link SmartHouse.impl.ProjectorImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link SmartHouse.impl.ProjectorImpl#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectorImpl extends EObjectImpl implements Projector {
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
	 * The default value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrightness()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BRIGHTNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrightness()
	 * @generated
	 * @ordered
	 */
	protected BigInteger brightness = BRIGHTNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VOLUME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected BigInteger volume = VOLUME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHousePackage.Literals.PROJECTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.PROJECTOR__ON, oldOn, on));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBrightness() {
		return brightness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrightness(BigInteger newBrightness) {
		BigInteger oldBrightness = brightness;
		brightness = newBrightness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.PROJECTOR__BRIGHTNESS, oldBrightness, brightness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(BigInteger newVolume) {
		BigInteger oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.PROJECTOR__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (eContainerFeatureID() != SmartHousePackage.PROJECTOR__ROOM) return null;
		return (Room)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoom(Room newRoom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoom, SmartHousePackage.PROJECTOR__ROOM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		if (newRoom != eInternalContainer() || (eContainerFeatureID() != SmartHousePackage.PROJECTOR__ROOM && newRoom != null)) {
			if (EcoreUtil.isAncestor(this, newRoom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoom != null)
				msgs = ((InternalEObject)newRoom).eInverseAdd(this, SmartHousePackage.ROOM__PROJECTOR, Room.class, msgs);
			msgs = basicSetRoom(newRoom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.PROJECTOR__ROOM, newRoom, newRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartHousePackage.PROJECTOR__ROOM:
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
			case SmartHousePackage.PROJECTOR__ROOM:
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
			case SmartHousePackage.PROJECTOR__ROOM:
				return eInternalContainer().eInverseRemove(this, SmartHousePackage.ROOM__PROJECTOR, Room.class, msgs);
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
			case SmartHousePackage.PROJECTOR__ON:
				return isOn();
			case SmartHousePackage.PROJECTOR__BRIGHTNESS:
				return getBrightness();
			case SmartHousePackage.PROJECTOR__VOLUME:
				return getVolume();
			case SmartHousePackage.PROJECTOR__ROOM:
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
			case SmartHousePackage.PROJECTOR__ON:
				setOn((Boolean)newValue);
				return;
			case SmartHousePackage.PROJECTOR__BRIGHTNESS:
				setBrightness((BigInteger)newValue);
				return;
			case SmartHousePackage.PROJECTOR__VOLUME:
				setVolume((BigInteger)newValue);
				return;
			case SmartHousePackage.PROJECTOR__ROOM:
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
			case SmartHousePackage.PROJECTOR__ON:
				setOn(ON_EDEFAULT);
				return;
			case SmartHousePackage.PROJECTOR__BRIGHTNESS:
				setBrightness(BRIGHTNESS_EDEFAULT);
				return;
			case SmartHousePackage.PROJECTOR__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case SmartHousePackage.PROJECTOR__ROOM:
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
			case SmartHousePackage.PROJECTOR__ON:
				return on != ON_EDEFAULT;
			case SmartHousePackage.PROJECTOR__BRIGHTNESS:
				return BRIGHTNESS_EDEFAULT == null ? brightness != null : !BRIGHTNESS_EDEFAULT.equals(brightness);
			case SmartHousePackage.PROJECTOR__VOLUME:
				return VOLUME_EDEFAULT == null ? volume != null : !VOLUME_EDEFAULT.equals(volume);
			case SmartHousePackage.PROJECTOR__ROOM:
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
		result.append(" (on: ");
		result.append(on);
		result.append(", brightness: ");
		result.append(brightness);
		result.append(", volume: ");
		result.append(volume);
		result.append(')');
		return result.toString();
	}

} //ProjectorImpl
