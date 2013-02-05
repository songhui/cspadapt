/**
 */
package SmartHouse.impl;

import SmartHouse.EV;
import SmartHouse.House;
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
 * An implementation of the model object '<em><b>EV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SmartHouse.impl.EVImpl#getName <em>Name</em>}</li>
 *   <li>{@link SmartHouse.impl.EVImpl#isPluged <em>Pluged</em>}</li>
 *   <li>{@link SmartHouse.impl.EVImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link SmartHouse.impl.EVImpl#isCharging <em>Charging</em>}</li>
 *   <li>{@link SmartHouse.impl.EVImpl#getHouse <em>House</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EVImpl extends EObjectImpl implements EV {
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
	 * The default value of the '{@link #isPluged() <em>Pluged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPluged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PLUGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPluged() <em>Pluged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPluged()
	 * @generated
	 * @ordered
	 */
	protected boolean pluged = PLUGED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected BigInteger level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isCharging() <em>Charging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCharging()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHARGING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCharging() <em>Charging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCharging()
	 * @generated
	 * @ordered
	 */
	protected boolean charging = CHARGING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EVImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHousePackage.Literals.EV;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.EV__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPluged() {
		return pluged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluged(boolean newPluged) {
		boolean oldPluged = pluged;
		pluged = newPluged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.EV__PLUGED, oldPluged, pluged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(BigInteger newLevel) {
		BigInteger oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.EV__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCharging() {
		return charging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharging(boolean newCharging) {
		boolean oldCharging = charging;
		charging = newCharging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.EV__CHARGING, oldCharging, charging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House getHouse() {
		if (eContainerFeatureID() != SmartHousePackage.EV__HOUSE) return null;
		return (House)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHouse(House newHouse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHouse, SmartHousePackage.EV__HOUSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouse(House newHouse) {
		if (newHouse != eInternalContainer() || (eContainerFeatureID() != SmartHousePackage.EV__HOUSE && newHouse != null)) {
			if (EcoreUtil.isAncestor(this, newHouse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHouse != null)
				msgs = ((InternalEObject)newHouse).eInverseAdd(this, SmartHousePackage.HOUSE__EV, House.class, msgs);
			msgs = basicSetHouse(newHouse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.EV__HOUSE, newHouse, newHouse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartHousePackage.EV__HOUSE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHouse((House)otherEnd, msgs);
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
			case SmartHousePackage.EV__HOUSE:
				return basicSetHouse(null, msgs);
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
			case SmartHousePackage.EV__HOUSE:
				return eInternalContainer().eInverseRemove(this, SmartHousePackage.HOUSE__EV, House.class, msgs);
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
			case SmartHousePackage.EV__NAME:
				return getName();
			case SmartHousePackage.EV__PLUGED:
				return isPluged();
			case SmartHousePackage.EV__LEVEL:
				return getLevel();
			case SmartHousePackage.EV__CHARGING:
				return isCharging();
			case SmartHousePackage.EV__HOUSE:
				return getHouse();
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
			case SmartHousePackage.EV__NAME:
				setName((String)newValue);
				return;
			case SmartHousePackage.EV__PLUGED:
				setPluged((Boolean)newValue);
				return;
			case SmartHousePackage.EV__LEVEL:
				setLevel((BigInteger)newValue);
				return;
			case SmartHousePackage.EV__CHARGING:
				setCharging((Boolean)newValue);
				return;
			case SmartHousePackage.EV__HOUSE:
				setHouse((House)newValue);
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
			case SmartHousePackage.EV__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmartHousePackage.EV__PLUGED:
				setPluged(PLUGED_EDEFAULT);
				return;
			case SmartHousePackage.EV__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case SmartHousePackage.EV__CHARGING:
				setCharging(CHARGING_EDEFAULT);
				return;
			case SmartHousePackage.EV__HOUSE:
				setHouse((House)null);
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
			case SmartHousePackage.EV__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmartHousePackage.EV__PLUGED:
				return pluged != PLUGED_EDEFAULT;
			case SmartHousePackage.EV__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
			case SmartHousePackage.EV__CHARGING:
				return charging != CHARGING_EDEFAULT;
			case SmartHousePackage.EV__HOUSE:
				return getHouse() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", pluged: ");
		result.append(pluged);
		result.append(", level: ");
		result.append(level);
		result.append(", charging: ");
		result.append(charging);
		result.append(')');
		return result.toString();
	}

} //EVImpl
