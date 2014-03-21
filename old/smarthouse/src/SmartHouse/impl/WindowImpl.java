/**
 */
package SmartHouse.impl;

import SmartHouse.SmartHousePackage;
import SmartHouse.Window;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SmartHouse.impl.WindowImpl#getName <em>Name</em>}</li>
 *   <li>{@link SmartHouse.impl.WindowImpl#isCurtainOn <em>Curtain On</em>}</li>
 *   <li>{@link SmartHouse.impl.WindowImpl#isOpened <em>Opened</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WindowImpl extends EObjectImpl implements Window {
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
	 * The default value of the '{@link #isCurtainOn() <em>Curtain On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurtainOn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CURTAIN_ON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCurtainOn() <em>Curtain On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurtainOn()
	 * @generated
	 * @ordered
	 */
	protected boolean curtainOn = CURTAIN_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #isOpened() <em>Opened</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpened()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPENED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOpened() <em>Opened</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpened()
	 * @generated
	 * @ordered
	 */
	protected boolean opened = OPENED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHousePackage.Literals.WINDOW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.WINDOW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCurtainOn() {
		return curtainOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurtainOn(boolean newCurtainOn) {
		boolean oldCurtainOn = curtainOn;
		curtainOn = newCurtainOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.WINDOW__CURTAIN_ON, oldCurtainOn, curtainOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpened() {
		return opened;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpened(boolean newOpened) {
		boolean oldOpened = opened;
		opened = newOpened;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHousePackage.WINDOW__OPENED, oldOpened, opened));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmartHousePackage.WINDOW__NAME:
				return getName();
			case SmartHousePackage.WINDOW__CURTAIN_ON:
				return isCurtainOn();
			case SmartHousePackage.WINDOW__OPENED:
				return isOpened();
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
			case SmartHousePackage.WINDOW__NAME:
				setName((String)newValue);
				return;
			case SmartHousePackage.WINDOW__CURTAIN_ON:
				setCurtainOn((Boolean)newValue);
				return;
			case SmartHousePackage.WINDOW__OPENED:
				setOpened((Boolean)newValue);
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
			case SmartHousePackage.WINDOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmartHousePackage.WINDOW__CURTAIN_ON:
				setCurtainOn(CURTAIN_ON_EDEFAULT);
				return;
			case SmartHousePackage.WINDOW__OPENED:
				setOpened(OPENED_EDEFAULT);
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
			case SmartHousePackage.WINDOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmartHousePackage.WINDOW__CURTAIN_ON:
				return curtainOn != CURTAIN_ON_EDEFAULT;
			case SmartHousePackage.WINDOW__OPENED:
				return opened != OPENED_EDEFAULT;
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
		result.append(", curtainOn: ");
		result.append(curtainOn);
		result.append(", opened: ");
		result.append(opened);
		result.append(')');
		return result.toString();
	}

} //WindowImpl
