/**
 */
package net.modelbased.constraintext.impl;

import net.modelbased.constraintext.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintExtFactoryImpl extends EFactoryImpl implements ConstraintExtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConstraintExtFactory init() {
		try {
			ConstraintExtFactory theConstraintExtFactory = (ConstraintExtFactory)EPackage.Registry.INSTANCE.getEFactory(ConstraintExtPackage.eNS_URI);
			if (theConstraintExtFactory != null) {
				return theConstraintExtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConstraintExtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintExtFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConstraintExtPackage.CONFIG_ANNO: return createConfigAnno();
			case ConstraintExtPackage.EXP_DETAIL: return createExpDetail();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigAnno createConfigAnno() {
		ConfigAnnoImpl configAnno = new ConfigAnnoImpl();
		return configAnno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpDetail createExpDetail() {
		ExpDetailImpl expDetail = new ExpDetailImpl();
		return expDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintExtPackage getConstraintExtPackage() {
		return (ConstraintExtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConstraintExtPackage getPackage() {
		return ConstraintExtPackage.eINSTANCE;
	}

} //ConstraintExtFactoryImpl
