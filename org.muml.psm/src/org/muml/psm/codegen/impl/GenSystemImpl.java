/**
 */
package org.muml.psm.codegen.impl;

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
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.psm.codegen.CodegenPackage;
import org.muml.psm.codegen.GenECU;
import org.muml.psm.codegen.GenSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.codegen.impl.GenSystemImpl#getGenECUs <em>Gen EC Us</em>}</li>
 *   <li>{@link org.muml.psm.codegen.impl.GenSystemImpl#getCic <em>Cic</em>}</li>
 *   <li>{@link org.muml.psm.codegen.impl.GenSystemImpl#getHpic <em>Hpic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenSystemImpl extends MinimalEObjectImpl.Container implements GenSystem {
	/**
	 * The cached value of the '{@link #getGenECUs() <em>Gen EC Us</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenECUs()
	 * @generated
	 * @ordered
	 */
	protected EList<GenECU> genECUs;

	/**
	 * The cached value of the '{@link #getCic() <em>Cic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCic()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstanceConfiguration cic;
	/**
	 * The cached value of the '{@link #getHpic() <em>Hpic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHpic()
	 * @generated
	 * @ordered
	 */
	protected HWPlatformInstanceConfiguration hpic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.GEN_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenECU> getGenECUs() {
		if (genECUs == null) {
			genECUs = new EObjectContainmentEList<GenECU>(GenECU.class, this, CodegenPackage.GEN_SYSTEM__GEN_EC_US);
		}
		return genECUs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration getCic() {
		if (cic != null && cic.eIsProxy()) {
			InternalEObject oldCic = (InternalEObject)cic;
			cic = (ComponentInstanceConfiguration)eResolveProxy(oldCic);
			if (cic != oldCic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.GEN_SYSTEM__CIC, oldCic, cic));
			}
		}
		return cic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration basicGetCic() {
		return cic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCic(ComponentInstanceConfiguration newCic) {
		ComponentInstanceConfiguration oldCic = cic;
		cic = newCic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.GEN_SYSTEM__CIC, oldCic, cic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformInstanceConfiguration getHpic() {
		if (hpic != null && hpic.eIsProxy()) {
			InternalEObject oldHpic = (InternalEObject)hpic;
			hpic = (HWPlatformInstanceConfiguration)eResolveProxy(oldHpic);
			if (hpic != oldHpic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.GEN_SYSTEM__HPIC, oldHpic, hpic));
			}
		}
		return hpic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformInstanceConfiguration basicGetHpic() {
		return hpic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHpic(HWPlatformInstanceConfiguration newHpic) {
		HWPlatformInstanceConfiguration oldHpic = hpic;
		hpic = newHpic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.GEN_SYSTEM__HPIC, oldHpic, hpic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.GEN_SYSTEM__GEN_EC_US:
				return ((InternalEList<?>)getGenECUs()).basicRemove(otherEnd, msgs);
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
			case CodegenPackage.GEN_SYSTEM__GEN_EC_US:
				return getGenECUs();
			case CodegenPackage.GEN_SYSTEM__CIC:
				if (resolve) return getCic();
				return basicGetCic();
			case CodegenPackage.GEN_SYSTEM__HPIC:
				if (resolve) return getHpic();
				return basicGetHpic();
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
			case CodegenPackage.GEN_SYSTEM__GEN_EC_US:
				getGenECUs().clear();
				getGenECUs().addAll((Collection<? extends GenECU>)newValue);
				return;
			case CodegenPackage.GEN_SYSTEM__CIC:
				setCic((ComponentInstanceConfiguration)newValue);
				return;
			case CodegenPackage.GEN_SYSTEM__HPIC:
				setHpic((HWPlatformInstanceConfiguration)newValue);
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
			case CodegenPackage.GEN_SYSTEM__GEN_EC_US:
				getGenECUs().clear();
				return;
			case CodegenPackage.GEN_SYSTEM__CIC:
				setCic((ComponentInstanceConfiguration)null);
				return;
			case CodegenPackage.GEN_SYSTEM__HPIC:
				setHpic((HWPlatformInstanceConfiguration)null);
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
			case CodegenPackage.GEN_SYSTEM__GEN_EC_US:
				return genECUs != null && !genECUs.isEmpty();
			case CodegenPackage.GEN_SYSTEM__CIC:
				return cic != null;
			case CodegenPackage.GEN_SYSTEM__HPIC:
				return hpic != null;
		}
		return super.eIsSet(featureID);
	}

} //GenSystemImpl
