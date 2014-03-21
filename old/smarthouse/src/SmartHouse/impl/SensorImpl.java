/**
 */
package SmartHouse.impl;

import SmartHouse.Sensor;
import SmartHouse.SmartHousePackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SmartHouse.impl.SensorImpl#isTemp <em>Temp</em>}</li>
 *   <li>{@link SmartHouse.impl.SensorImpl#isAir <em>Air</em>}</li>
 *   <li>{@link SmartHouse.impl.SensorImpl#isBrightness <em>Brightness</em>}</li>
 *   <li>{@link SmartHouse.impl.SensorImpl#getBattery <em>Battery</em>}</li>
 *   <li>{@link SmartHouse.impl.SensorImpl#getCircle <em>Circle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensorImpl extends EObjectImpl implements Sensor {
	/**
	 * The default value of the '{@link #isTemp() <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEMP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTemp() <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemp()
	 * @generated
	 * @ordered
	 */
	protected boolean temp = TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #isAir() <em>Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAir()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AIR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAir() <em>Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAir()
	 * @generated
	 * @ordered
	 */
	protected boolean air = AIR_EDEFAULT;

	/**
	 * The default value of the '{@link #isBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBrightness()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BRIGHTNESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBrightness()
	 * @generated
	 * @ordered
	 */
	protected boolean brightness = BRIGHTNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBattery() <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BATTERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBattery() <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery()
	 * @generated
	 * @ordered
	 */
	protected BigInteger battery = BATTERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCircle() <em>Circle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircle()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CIRCLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCircle() <em>Circle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircle()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal circle = CIRCLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHousePackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemp() {
		return temp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemp(boolean newTemp) {
		boolean oldTemp = temp;
		temp = newTemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.SENSOR__TEMP, oldTemp, temp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAir() {
		return air;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAir(boolean newAir) {
		boolean oldAir = air;
		air = newAir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.SENSOR__AIR, oldAir, air));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBrightness() {
		return brightness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrightness(boolean newBrightness) {
		boolean oldBrightness = brightness;
		brightness = newBrightness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.SENSOR__BRIGHTNESS, oldBrightness, brightness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBattery() {
		return battery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBattery(BigInteger newBattery) {
		BigInteger oldBattery = battery;
		battery = newBattery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.SENSOR__BATTERY, oldBattery, battery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCircle() {
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircle(BigDecimal newCircle) {
		BigDecimal oldCircle = circle;
		circle = newCircle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.SENSOR__CIRCLE, oldCircle, circle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmartHousePackage.SENSOR__TEMP:
				return isTemp();
			case SmartHousePackage.SENSOR__AIR:
				return isAir();
			case SmartHousePackage.SENSOR__BRIGHTNESS:
				return isBrightness();
			case SmartHousePackage.SENSOR__BATTERY:
				return getBattery();
			case SmartHousePackage.SENSOR__CIRCLE:
				return getCircle();
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
			case SmartHousePackage.SENSOR__TEMP:
				setTemp((Boolean)newValue);
				return;
			case SmartHousePackage.SENSOR__AIR:
				setAir((Boolean)newValue);
				return;
			case SmartHousePackage.SENSOR__BRIGHTNESS:
				setBrightness((Boolean)newValue);
				return;
			case SmartHousePackage.SENSOR__BATTERY:
				setBattery((BigInteger)newValue);
				return;
			case SmartHousePackage.SENSOR__CIRCLE:
				setCircle((BigDecimal)newValue);
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
			case SmartHousePackage.SENSOR__TEMP:
				setTemp(TEMP_EDEFAULT);
				return;
			case SmartHousePackage.SENSOR__AIR:
				setAir(AIR_EDEFAULT);
				return;
			case SmartHousePackage.SENSOR__BRIGHTNESS:
				setBrightness(BRIGHTNESS_EDEFAULT);
				return;
			case SmartHousePackage.SENSOR__BATTERY:
				setBattery(BATTERY_EDEFAULT);
				return;
			case SmartHousePackage.SENSOR__CIRCLE:
				setCircle(CIRCLE_EDEFAULT);
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
			case SmartHousePackage.SENSOR__TEMP:
				return temp != TEMP_EDEFAULT;
			case SmartHousePackage.SENSOR__AIR:
				return air != AIR_EDEFAULT;
			case SmartHousePackage.SENSOR__BRIGHTNESS:
				return brightness != BRIGHTNESS_EDEFAULT;
			case SmartHousePackage.SENSOR__BATTERY:
				return BATTERY_EDEFAULT == null ? battery != null : !BATTERY_EDEFAULT.equals(battery);
			case SmartHousePackage.SENSOR__CIRCLE:
				return CIRCLE_EDEFAULT == null ? circle != null : !CIRCLE_EDEFAULT.equals(circle);
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
		result.append(", air: ");
		result.append(air);
		result.append(", brightness: ");
		result.append(brightness);
		result.append(", battery: ");
		result.append(battery);
		result.append(", circle: ");
		result.append(circle);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
