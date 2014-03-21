/**
 */
package VmPlacement.impl;

import VmPlacement.App;
import VmPlacement.PM;
import VmPlacement.VM;
import VmPlacement.VmPlacementPackage;
import java.math.BigInteger;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link VmPlacement.impl.VMImpl#getName <em>Name</em>}</li>
 *   <li>{@link VmPlacement.impl.VMImpl#getReq <em>Req</em>}</li>
 *   <li>{@link VmPlacement.impl.VMImpl#getPlc <em>Plc</em>}</li>
 *   <li>{@link VmPlacement.impl.VMImpl#getBackup <em>Backup</em>}</li>
 *   <li>{@link VmPlacement.impl.VMImpl#getFrequent <em>Frequent</em>}</li>
 *   <li>{@link VmPlacement.impl.VMImpl#getHost <em>Host</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VMImpl extends MinimalEObjectImpl.Container implements VM {
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
	 * The default value of the '{@link #getReq() <em>Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReq()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger REQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReq() <em>Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReq()
	 * @generated
	 * @ordered
	 */
	protected BigInteger req = REQ_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlc() <em>Plc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlc()
	 * @generated
	 * @ordered
	 */
	protected PM plc;

	/**
	 * The cached setting delegate for the '{@link #getBackup() <em>Backup</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackup()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BACKUP__ESETTING_DELEGATE = ((EStructuralFeature.Internal)VmPlacementPackage.Literals.VM__BACKUP).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getFrequent() <em>Frequent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequent()
	 * @generated
	 * @ordered
	 */
	protected EList<VM> frequent;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected App host;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPlacementPackage.Literals.VM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VmPlacementPackage.VM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getReq() {
		return req;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReq(BigInteger newReq) {
		BigInteger oldReq = req;
		req = newReq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPlacementPackage.VM__REQ, oldReq, req));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PM getPlc() {
		if (plc != null && plc.eIsProxy()) {
			InternalEObject oldPlc = (InternalEObject)plc;
			plc = (PM)eResolveProxy(oldPlc);
			if (plc != oldPlc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmPlacementPackage.VM__PLC, oldPlc, plc));
			}
		}
		return plc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PM basicGetPlc() {
		return plc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlc(PM newPlc) {
		PM oldPlc = plc;
		plc = newPlc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPlacementPackage.VM__PLC, oldPlc, plc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VM> getBackup() {
		return (EList<VM>)BACKUP__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VM> getFrequent() {
		if (frequent == null) {
			frequent = new EObjectWithInverseResolvingEList.ManyInverse<VM>(VM.class, this, VmPlacementPackage.VM__FREQUENT, VmPlacementPackage.VM__FREQUENT);
		}
		return frequent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App getHost() {
		if (host != null && host.eIsProxy()) {
			InternalEObject oldHost = (InternalEObject)host;
			host = (App)eResolveProxy(oldHost);
			if (host != oldHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmPlacementPackage.VM__HOST, oldHost, host));
			}
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App basicGetHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHost(App newHost, NotificationChain msgs) {
		App oldHost = host;
		host = newHost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmPlacementPackage.VM__HOST, oldHost, newHost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(App newHost) {
		if (newHost != host) {
			NotificationChain msgs = null;
			if (host != null)
				msgs = ((InternalEObject)host).eInverseRemove(this, VmPlacementPackage.APP__DESTINATION, App.class, msgs);
			if (newHost != null)
				msgs = ((InternalEObject)newHost).eInverseAdd(this, VmPlacementPackage.APP__DESTINATION, App.class, msgs);
			msgs = basicSetHost(newHost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPlacementPackage.VM__HOST, newHost, newHost));
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
			case VmPlacementPackage.VM__FREQUENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFrequent()).basicAdd(otherEnd, msgs);
			case VmPlacementPackage.VM__HOST:
				if (host != null)
					msgs = ((InternalEObject)host).eInverseRemove(this, VmPlacementPackage.APP__DESTINATION, App.class, msgs);
				return basicSetHost((App)otherEnd, msgs);
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
			case VmPlacementPackage.VM__FREQUENT:
				return ((InternalEList<?>)getFrequent()).basicRemove(otherEnd, msgs);
			case VmPlacementPackage.VM__HOST:
				return basicSetHost(null, msgs);
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
			case VmPlacementPackage.VM__NAME:
				return getName();
			case VmPlacementPackage.VM__REQ:
				return getReq();
			case VmPlacementPackage.VM__PLC:
				if (resolve) return getPlc();
				return basicGetPlc();
			case VmPlacementPackage.VM__BACKUP:
				return getBackup();
			case VmPlacementPackage.VM__FREQUENT:
				return getFrequent();
			case VmPlacementPackage.VM__HOST:
				if (resolve) return getHost();
				return basicGetHost();
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
			case VmPlacementPackage.VM__NAME:
				setName((String)newValue);
				return;
			case VmPlacementPackage.VM__REQ:
				setReq((BigInteger)newValue);
				return;
			case VmPlacementPackage.VM__PLC:
				setPlc((PM)newValue);
				return;
			case VmPlacementPackage.VM__BACKUP:
				getBackup().clear();
				getBackup().addAll((Collection<? extends VM>)newValue);
				return;
			case VmPlacementPackage.VM__FREQUENT:
				getFrequent().clear();
				getFrequent().addAll((Collection<? extends VM>)newValue);
				return;
			case VmPlacementPackage.VM__HOST:
				setHost((App)newValue);
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
			case VmPlacementPackage.VM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VmPlacementPackage.VM__REQ:
				setReq(REQ_EDEFAULT);
				return;
			case VmPlacementPackage.VM__PLC:
				setPlc((PM)null);
				return;
			case VmPlacementPackage.VM__BACKUP:
				getBackup().clear();
				return;
			case VmPlacementPackage.VM__FREQUENT:
				getFrequent().clear();
				return;
			case VmPlacementPackage.VM__HOST:
				setHost((App)null);
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
			case VmPlacementPackage.VM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VmPlacementPackage.VM__REQ:
				return REQ_EDEFAULT == null ? req != null : !REQ_EDEFAULT.equals(req);
			case VmPlacementPackage.VM__PLC:
				return plc != null;
			case VmPlacementPackage.VM__BACKUP:
				return BACKUP__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case VmPlacementPackage.VM__FREQUENT:
				return frequent != null && !frequent.isEmpty();
			case VmPlacementPackage.VM__HOST:
				return host != null;
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
		result.append(", req: ");
		result.append(req);
		result.append(')');
		return result.toString();
	}

} //VMImpl
