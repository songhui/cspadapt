/**
 */
package VmPlacement.impl;

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
 * An implementation of the model object '<em><b>PM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link VmPlacement.impl.PMImpl#getName <em>Name</em>}</li>
 *   <li>{@link VmPlacement.impl.PMImpl#getRes <em>Res</em>}</li>
 *   <li>{@link VmPlacement.impl.PMImpl#getNear <em>Near</em>}</li>
 *   <li>{@link VmPlacement.impl.PMImpl#getHost <em>Host</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PMImpl extends MinimalEObjectImpl.Container implements PM {
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
	 * The default value of the '{@link #getRes() <em>Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRes()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRes() <em>Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRes()
	 * @generated
	 * @ordered
	 */
	protected BigInteger res = RES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNear() <em>Near</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNear()
	 * @generated
	 * @ordered
	 */
	protected EList<PM> near;

	/**
	 * The cached setting delegate for the '{@link #getHost() <em>Host</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HOST__ESETTING_DELEGATE = ((EStructuralFeature.Internal)VmPlacementPackage.Literals.PM__HOST).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPlacementPackage.Literals.PM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VmPlacementPackage.PM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRes() {
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRes(BigInteger newRes) {
		BigInteger oldRes = res;
		res = newRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPlacementPackage.PM__RES, oldRes, res));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PM> getNear() {
		if (near == null) {
			near = new EObjectWithInverseResolvingEList.ManyInverse<PM>(PM.class, this, VmPlacementPackage.PM__NEAR, VmPlacementPackage.PM__NEAR);
		}
		return near;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VM> getHost() {
		return (EList<VM>)HOST__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			case VmPlacementPackage.PM__NEAR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNear()).basicAdd(otherEnd, msgs);
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
			case VmPlacementPackage.PM__NEAR:
				return ((InternalEList<?>)getNear()).basicRemove(otherEnd, msgs);
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
			case VmPlacementPackage.PM__NAME:
				return getName();
			case VmPlacementPackage.PM__RES:
				return getRes();
			case VmPlacementPackage.PM__NEAR:
				return getNear();
			case VmPlacementPackage.PM__HOST:
				return getHost();
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
			case VmPlacementPackage.PM__NAME:
				setName((String)newValue);
				return;
			case VmPlacementPackage.PM__RES:
				setRes((BigInteger)newValue);
				return;
			case VmPlacementPackage.PM__NEAR:
				getNear().clear();
				getNear().addAll((Collection<? extends PM>)newValue);
				return;
			case VmPlacementPackage.PM__HOST:
				getHost().clear();
				getHost().addAll((Collection<? extends VM>)newValue);
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
			case VmPlacementPackage.PM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VmPlacementPackage.PM__RES:
				setRes(RES_EDEFAULT);
				return;
			case VmPlacementPackage.PM__NEAR:
				getNear().clear();
				return;
			case VmPlacementPackage.PM__HOST:
				getHost().clear();
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
			case VmPlacementPackage.PM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VmPlacementPackage.PM__RES:
				return RES_EDEFAULT == null ? res != null : !RES_EDEFAULT.equals(res);
			case VmPlacementPackage.PM__NEAR:
				return near != null && !near.isEmpty();
			case VmPlacementPackage.PM__HOST:
				return HOST__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(", res: ");
		result.append(res);
		result.append(')');
		return result.toString();
	}

} //PMImpl
