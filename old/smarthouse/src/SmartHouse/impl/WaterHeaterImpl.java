/**
 */
package SmartHouse.impl;

import SmartHouse.House;
import SmartHouse.SmartHousePackage;
import SmartHouse.WaterHeater;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Water Heater</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SmartHouse.impl.WaterHeaterImpl#getTemp <em>Temp</em>}</li>
 *   <li>{@link SmartHouse.impl.WaterHeaterImpl#isOn <em>On</em>}</li>
 *   <li>{@link SmartHouse.impl.WaterHeaterImpl#isBoost <em>Boost</em>}</li>
 *   <li>{@link SmartHouse.impl.WaterHeaterImpl#getHouse <em>House</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WaterHeaterImpl extends EObjectImpl implements WaterHeater {
	/**
	 * The default value of the '{@link #getTemp() <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemp()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemp() <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemp()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal temp = TEMP_EDEFAULT;

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
	 * The default value of the '{@link #isBoost() <em>Boost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoost()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBoost() <em>Boost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoost()
	 * @generated
	 * @ordered
	 */
	protected boolean boost = BOOST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaterHeaterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHousePackage.Literals.WATER_HEATER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTemp() {
		return temp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemp(BigDecimal newTemp) {
		BigDecimal oldTemp = temp;
		temp = newTemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.WATER_HEATER__TEMP, oldTemp, temp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.WATER_HEATER__ON, oldOn, on));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBoost() {
		return boost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoost(boolean newBoost) {
		boolean oldBoost = boost;
		boost = newBoost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.WATER_HEATER__BOOST, oldBoost, boost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House getHouse() {
		if (eContainerFeatureID() != SmartHousePackage.WATER_HEATER__HOUSE) return null;
		return (House)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHouse(House newHouse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHouse, SmartHousePackage.WATER_HEATER__HOUSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouse(House newHouse) {
		if (newHouse != eInternalContainer() || (eContainerFeatureID() != SmartHousePackage.WATER_HEATER__HOUSE && newHouse != null)) {
			if (EcoreUtil.isAncestor(this, newHouse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHouse != null)
				msgs = ((InternalEObject)newHouse).eInverseAdd(this, SmartHousePackage.HOUSE__WH, House.class, msgs);
			msgs = basicSetHouse(newHouse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.WATER_HEATER__HOUSE, newHouse, newHouse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartHousePackage.WATER_HEATER__HOUSE:
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
			case SmartHousePackage.WATER_HEATER__HOUSE:
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
			case SmartHousePackage.WATER_HEATER__HOUSE:
				return eInternalContainer().eInverseRemove(this, SmartHousePackage.HOUSE__WH, House.class, msgs);
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
			case SmartHousePackage.WATER_HEATER__TEMP:
				return getTemp();
			case SmartHousePackage.WATER_HEATER__ON:
				return isOn();
			case SmartHousePackage.WATER_HEATER__BOOST:
				return isBoost();
			case SmartHousePackage.WATER_HEATER__HOUSE:
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
			case SmartHousePackage.WATER_HEATER__TEMP:
				setTemp((BigDecimal)newValue);
				return;
			case SmartHousePackage.WATER_HEATER__ON:
				setOn((Boolean)newValue);
				return;
			case SmartHousePackage.WATER_HEATER__BOOST:
				setBoost((Boolean)newValue);
				return;
			case SmartHousePackage.WATER_HEATER__HOUSE:
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
			case SmartHousePackage.WATER_HEATER__TEMP:
				setTemp(TEMP_EDEFAULT);
				return;
			case SmartHousePackage.WATER_HEATER__ON:
				setOn(ON_EDEFAULT);
				return;
			case SmartHousePackage.WATER_HEATER__BOOST:
				setBoost(BOOST_EDEFAULT);
				return;
			case SmartHousePackage.WATER_HEATER__HOUSE:
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
			case SmartHousePackage.WATER_HEATER__TEMP:
				return TEMP_EDEFAULT == null ? temp != null : !TEMP_EDEFAULT.equals(temp);
			case SmartHousePackage.WATER_HEATER__ON:
				return on != ON_EDEFAULT;
			case SmartHousePackage.WATER_HEATER__BOOST:
				return boost != BOOST_EDEFAULT;
			case SmartHousePackage.WATER_HEATER__HOUSE:
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
		result.append(" (temp: ");
		result.append(temp);
		result.append(", on: ");
		result.append(on);
		result.append(", boost: ");
		result.append(boost);
		result.append(')');
		return result.toString();
	}

} //WaterHeaterImpl
