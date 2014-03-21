/**
 */
package VmPlacement.impl;

import VmPlacement.App;
import VmPlacement.PM;
import VmPlacement.VM;
import VmPlacement.VmPlacementPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link VmPlacement.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link VmPlacement.impl.SystemImpl#getVm <em>Vm</em>}</li>
 *   <li>{@link VmPlacement.impl.SystemImpl#getPm <em>Pm</em>}</li>
 *   <li>{@link VmPlacement.impl.SystemImpl#getApp <em>App</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements VmPlacement.System {
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
	 * The cached value of the '{@link #getVm() <em>Vm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVm()
	 * @generated
	 * @ordered
	 */
	protected EList<VM> vm;

	/**
	 * The cached value of the '{@link #getPm() <em>Pm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPm()
	 * @generated
	 * @ordered
	 */
	protected EList<PM> pm;

	/**
	 * The cached value of the '{@link #getApp() <em>App</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp()
	 * @generated
	 * @ordered
	 */
	protected EList<App> app;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPlacementPackage.Literals.SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VmPlacementPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VM> getVm() {
		if (vm == null) {
			vm = new EObjectContainmentEList<VM>(VM.class, this, VmPlacementPackage.SYSTEM__VM);
		}
		return vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PM> getPm() {
		if (pm == null) {
			pm = new EObjectContainmentEList<PM>(PM.class, this, VmPlacementPackage.SYSTEM__PM);
		}
		return pm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<App> getApp() {
		if (app == null) {
			app = new EObjectContainmentEList<App>(App.class, this, VmPlacementPackage.SYSTEM__APP);
		}
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmPlacementPackage.SYSTEM__VM:
				return ((InternalEList<?>)getVm()).basicRemove(otherEnd, msgs);
			case VmPlacementPackage.SYSTEM__PM:
				return ((InternalEList<?>)getPm()).basicRemove(otherEnd, msgs);
			case VmPlacementPackage.SYSTEM__APP:
				return ((InternalEList<?>)getApp()).basicRemove(otherEnd, msgs);
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
			case VmPlacementPackage.SYSTEM__NAME:
				return getName();
			case VmPlacementPackage.SYSTEM__VM:
				return getVm();
			case VmPlacementPackage.SYSTEM__PM:
				return getPm();
			case VmPlacementPackage.SYSTEM__APP:
				return getApp();
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
			case VmPlacementPackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case VmPlacementPackage.SYSTEM__VM:
				getVm().clear();
				getVm().addAll((Collection<? extends VM>)newValue);
				return;
			case VmPlacementPackage.SYSTEM__PM:
				getPm().clear();
				getPm().addAll((Collection<? extends PM>)newValue);
				return;
			case VmPlacementPackage.SYSTEM__APP:
				getApp().clear();
				getApp().addAll((Collection<? extends App>)newValue);
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
			case VmPlacementPackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VmPlacementPackage.SYSTEM__VM:
				getVm().clear();
				return;
			case VmPlacementPackage.SYSTEM__PM:
				getPm().clear();
				return;
			case VmPlacementPackage.SYSTEM__APP:
				getApp().clear();
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
			case VmPlacementPackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VmPlacementPackage.SYSTEM__VM:
				return vm != null && !vm.isEmpty();
			case VmPlacementPackage.SYSTEM__PM:
				return pm != null && !pm.isEmpty();
			case VmPlacementPackage.SYSTEM__APP:
				return app != null && !app.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SystemImpl
