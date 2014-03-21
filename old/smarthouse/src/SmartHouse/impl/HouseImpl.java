/**
 */
package SmartHouse.impl;

import SmartHouse.EV;
import SmartHouse.Gate;
import SmartHouse.Heating;
import SmartHouse.House;
import SmartHouse.Person;
import SmartHouse.Room;
import SmartHouse.Security;
import SmartHouse.SmartHousePackage;
import SmartHouse.WaterHeater;
import java.math.BigDecimal;
import java.math.BigInteger;
import SmartHouse.Window;

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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SmartHouse.impl.HouseImpl#getName <em>Name</em>}</li>
 *   <li>{@link SmartHouse.impl.HouseImpl#getEprice <em>Eprice</em>}</li>
 *   <li>{@link SmartHouse.impl.HouseImpl#getTime <em>Time</em>}</li>
 *   <li>{@link SmartHouse.impl.HouseImpl#getOuttemp <em>Outtemp</em>}</li>
 *   <li>{@link SmartHouse.impl.HouseImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link SmartHouse.impl.HouseImpl#getMember <em>Member</em>}</li>
 *   <li>{@link SmartHouse.impl.HouseImpl#getWh <em>Wh</em>}</li>
 *   <li>{@link SmartHouse.impl.HouseImpl#getEv <em>Ev</em>}</li>
 *   <li>{@link SmartHouse.impl.HouseImpl#getGate <em>Gate</em>}</li>
 *   <li>{@link SmartHouse.impl.HouseImpl#getSec <em>Sec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HouseImpl extends EObjectImpl implements House {
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
	 * The default value of the '{@link #getEprice() <em>Eprice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEprice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal EPRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEprice() <em>Eprice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEprice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal eprice = EPRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected BigInteger time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOuttemp() <em>Outtemp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuttemp()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OUTTEMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOuttemp() <em>Outtemp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuttemp()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal outtemp = OUTTEMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> room;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> member;

	/**
	 * The cached value of the '{@link #getWh() <em>Wh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWh()
	 * @generated
	 * @ordered
	 */
	protected WaterHeater wh;

	/**
	 * The cached value of the '{@link #getEv() <em>Ev</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEv()
	 * @generated
	 * @ordered
	 */
	protected EList<EV> ev;

	/**
	 * The cached value of the '{@link #getGate() <em>Gate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGate()
	 * @generated
	 * @ordered
	 */
	protected Gate gate;

	/**
	 * The cached value of the '{@link #getSec() <em>Sec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSec()
	 * @generated
	 * @ordered
	 */
	protected Security sec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HouseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHousePackage.Literals.HOUSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.HOUSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getEprice() {
		return eprice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEprice(BigDecimal newEprice) {
		BigDecimal oldEprice = eprice;
		eprice = newEprice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.HOUSE__EPRICE, oldEprice, eprice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(BigInteger newTime) {
		BigInteger oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.HOUSE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getOuttemp() {
		return outtemp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuttemp(BigDecimal newOuttemp) {
		BigDecimal oldOuttemp = outtemp;
		outtemp = newOuttemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.HOUSE__OUTTEMP, oldOuttemp, outtemp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRoom() {
		if (room == null) {
			room = new EObjectContainmentWithInverseEList<Room>(Room.class, this, SmartHousePackage.HOUSE__ROOM, SmartHousePackage.ROOM__HOUSE);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getMember() {
		if (member == null) {
			member = new EObjectContainmentEList<Person>(Person.class, this, SmartHousePackage.HOUSE__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterHeater getWh() {
		return wh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWh(WaterHeater newWh, NotificationChain msgs) {
		WaterHeater oldWh = wh;
		wh = newWh;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartHousePackage.HOUSE__WH, oldWh, newWh);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWh(WaterHeater newWh) {
		if (newWh != wh) {
			NotificationChain msgs = null;
			if (wh != null)
				msgs = ((InternalEObject)wh).eInverseRemove(this, SmartHousePackage.WATER_HEATER__HOUSE, WaterHeater.class, msgs);
			if (newWh != null)
				msgs = ((InternalEObject)newWh).eInverseAdd(this, SmartHousePackage.WATER_HEATER__HOUSE, WaterHeater.class, msgs);
			msgs = basicSetWh(newWh, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.HOUSE__WH, newWh, newWh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EV> getEv() {
		if (ev == null) {
			ev = new EObjectContainmentWithInverseEList<EV>(EV.class, this, SmartHousePackage.HOUSE__EV, SmartHousePackage.EV__HOUSE);
		}
		return ev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getGate() {
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGate(Gate newGate, NotificationChain msgs) {
		Gate oldGate = gate;
		gate = newGate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartHousePackage.HOUSE__GATE, oldGate, newGate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGate(Gate newGate) {
		if (newGate != gate) {
			NotificationChain msgs = null;
			if (gate != null)
				msgs = ((InternalEObject)gate).eInverseRemove(this, SmartHousePackage.GATE__HOUSE, Gate.class, msgs);
			if (newGate != null)
				msgs = ((InternalEObject)newGate).eInverseAdd(this, SmartHousePackage.GATE__HOUSE, Gate.class, msgs);
			msgs = basicSetGate(newGate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.HOUSE__GATE, newGate, newGate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security getSec() {
		return sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSec(Security newSec, NotificationChain msgs) {
		Security oldSec = sec;
		sec = newSec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartHousePackage.HOUSE__SEC, oldSec, newSec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSec(Security newSec) {
		if (newSec != sec) {
			NotificationChain msgs = null;
			if (sec != null)
				msgs = ((InternalEObject)sec).eInverseRemove(this, SmartHousePackage.SECURITY__HOUSE, Security.class, msgs);
			if (newSec != null)
				msgs = ((InternalEObject)newSec).eInverseAdd(this, SmartHousePackage.SECURITY__HOUSE, Security.class, msgs);
			msgs = basicSetSec(newSec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.HOUSE__SEC, newSec, newSec));
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
			case SmartHousePackage.HOUSE__ROOM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoom()).basicAdd(otherEnd, msgs);
			case SmartHousePackage.HOUSE__WH:
				if (wh != null)
					msgs = ((InternalEObject)wh).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartHousePackage.HOUSE__WH, null, msgs);
				return basicSetWh((WaterHeater)otherEnd, msgs);
			case SmartHousePackage.HOUSE__EV:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEv()).basicAdd(otherEnd, msgs);
			case SmartHousePackage.HOUSE__GATE:
				if (gate != null)
					msgs = ((InternalEObject)gate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartHousePackage.HOUSE__GATE, null, msgs);
				return basicSetGate((Gate)otherEnd, msgs);
			case SmartHousePackage.HOUSE__SEC:
				if (sec != null)
					msgs = ((InternalEObject)sec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartHousePackage.HOUSE__SEC, null, msgs);
				return basicSetSec((Security)otherEnd, msgs);
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
			case SmartHousePackage.HOUSE__ROOM:
				return ((InternalEList<?>)getRoom()).basicRemove(otherEnd, msgs);
			case SmartHousePackage.HOUSE__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
			case SmartHousePackage.HOUSE__WH:
				return basicSetWh(null, msgs);
			case SmartHousePackage.HOUSE__EV:
				return ((InternalEList<?>)getEv()).basicRemove(otherEnd, msgs);
			case SmartHousePackage.HOUSE__GATE:
				return basicSetGate(null, msgs);
			case SmartHousePackage.HOUSE__SEC:
				return basicSetSec(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmartHousePackage.HOUSE__NAME:
				return getName();
			case SmartHousePackage.HOUSE__EPRICE:
				return getEprice();
			case SmartHousePackage.HOUSE__TIME:
				return getTime();
			case SmartHousePackage.HOUSE__OUTTEMP:
				return getOuttemp();
			case SmartHousePackage.HOUSE__ROOM:
				return getRoom();
			case SmartHousePackage.HOUSE__MEMBER:
				return getMember();
			case SmartHousePackage.HOUSE__WH:
				return getWh();
			case SmartHousePackage.HOUSE__EV:
				return getEv();
			case SmartHousePackage.HOUSE__GATE:
				return getGate();
			case SmartHousePackage.HOUSE__SEC:
				return getSec();
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
			case SmartHousePackage.HOUSE__NAME:
				setName((String)newValue);
				return;
			case SmartHousePackage.HOUSE__EPRICE:
				setEprice((BigDecimal)newValue);
				return;
			case SmartHousePackage.HOUSE__TIME:
				setTime((BigInteger)newValue);
				return;
			case SmartHousePackage.HOUSE__OUTTEMP:
				setOuttemp((BigDecimal)newValue);
				return;
			case SmartHousePackage.HOUSE__ROOM:
				getRoom().clear();
				getRoom().addAll((Collection<? extends Room>)newValue);
				return;
			case SmartHousePackage.HOUSE__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends Person>)newValue);
				return;
			case SmartHousePackage.HOUSE__WH:
				setWh((WaterHeater)newValue);
				return;
			case SmartHousePackage.HOUSE__EV:
				getEv().clear();
				getEv().addAll((Collection<? extends EV>)newValue);
				return;
			case SmartHousePackage.HOUSE__GATE:
				setGate((Gate)newValue);
				return;
			case SmartHousePackage.HOUSE__SEC:
				setSec((Security)newValue);
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
			case SmartHousePackage.HOUSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmartHousePackage.HOUSE__EPRICE:
				setEprice(EPRICE_EDEFAULT);
				return;
			case SmartHousePackage.HOUSE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case SmartHousePackage.HOUSE__OUTTEMP:
				setOuttemp(OUTTEMP_EDEFAULT);
				return;
			case SmartHousePackage.HOUSE__ROOM:
				getRoom().clear();
				return;
			case SmartHousePackage.HOUSE__MEMBER:
				getMember().clear();
				return;
			case SmartHousePackage.HOUSE__WH:
				setWh((WaterHeater)null);
				return;
			case SmartHousePackage.HOUSE__EV:
				getEv().clear();
				return;
			case SmartHousePackage.HOUSE__GATE:
				setGate((Gate)null);
				return;
			case SmartHousePackage.HOUSE__SEC:
				setSec((Security)null);
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
			case SmartHousePackage.HOUSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmartHousePackage.HOUSE__EPRICE:
				return EPRICE_EDEFAULT == null ? eprice != null : !EPRICE_EDEFAULT.equals(eprice);
			case SmartHousePackage.HOUSE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case SmartHousePackage.HOUSE__OUTTEMP:
				return OUTTEMP_EDEFAULT == null ? outtemp != null : !OUTTEMP_EDEFAULT.equals(outtemp);
			case SmartHousePackage.HOUSE__ROOM:
				return room != null && !room.isEmpty();
			case SmartHousePackage.HOUSE__MEMBER:
				return member != null && !member.isEmpty();
			case SmartHousePackage.HOUSE__WH:
				return wh != null;
			case SmartHousePackage.HOUSE__EV:
				return ev != null && !ev.isEmpty();
			case SmartHousePackage.HOUSE__GATE:
				return gate != null;
			case SmartHousePackage.HOUSE__SEC:
				return sec != null;
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
		result.append(", eprice: ");
		result.append(eprice);
		result.append(", time: ");
		result.append(time);
		result.append(", outtemp: ");
		result.append(outtemp);
		result.append(')');
		return result.toString();
	}

} //HouseImpl
