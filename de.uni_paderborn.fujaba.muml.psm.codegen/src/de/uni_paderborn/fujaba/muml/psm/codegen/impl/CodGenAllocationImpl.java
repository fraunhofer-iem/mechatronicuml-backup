/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;

import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;

import de.uni_paderborn.fujaba.muml.psm.codegen.CodGenAllocation;
import de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage;

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
 * An implementation of the model object '<em><b>Cod Gen Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodGenAllocationImpl#getHpic <em>Hpic</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodGenAllocationImpl#getCic <em>Cic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodGenAllocationImpl extends MinimalEObjectImpl.Container implements CodGenAllocation {
	/**
	 * The cached value of the '{@link #getHpic() <em>Hpic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHpic()
	 * @generated
	 * @ordered
	 */
	protected EList<HWPlatformInstanceConfiguration> hpic;

	/**
	 * The cached value of the '{@link #getCic() <em>Cic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCic()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstanceConfiguration cic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodGenAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.COD_GEN_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWPlatformInstanceConfiguration> getHpic() {
		if (hpic == null) {
			hpic = new EObjectContainmentEList<HWPlatformInstanceConfiguration>(HWPlatformInstanceConfiguration.class, this, CodegenPackage.COD_GEN_ALLOCATION__HPIC);
		}
		return hpic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration getCic() {
		return cic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCic(ComponentInstanceConfiguration newCic, NotificationChain msgs) {
		ComponentInstanceConfiguration oldCic = cic;
		cic = newCic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenPackage.COD_GEN_ALLOCATION__CIC, oldCic, newCic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCic(ComponentInstanceConfiguration newCic) {
		if (newCic != cic) {
			NotificationChain msgs = null;
			if (cic != null)
				msgs = ((InternalEObject)cic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.COD_GEN_ALLOCATION__CIC, null, msgs);
			if (newCic != null)
				msgs = ((InternalEObject)newCic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.COD_GEN_ALLOCATION__CIC, null, msgs);
			msgs = basicSetCic(newCic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.COD_GEN_ALLOCATION__CIC, newCic, newCic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.COD_GEN_ALLOCATION__HPIC:
				return ((InternalEList<?>)getHpic()).basicRemove(otherEnd, msgs);
			case CodegenPackage.COD_GEN_ALLOCATION__CIC:
				return basicSetCic(null, msgs);
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
			case CodegenPackage.COD_GEN_ALLOCATION__HPIC:
				return getHpic();
			case CodegenPackage.COD_GEN_ALLOCATION__CIC:
				return getCic();
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
			case CodegenPackage.COD_GEN_ALLOCATION__HPIC:
				getHpic().clear();
				getHpic().addAll((Collection<? extends HWPlatformInstanceConfiguration>)newValue);
				return;
			case CodegenPackage.COD_GEN_ALLOCATION__CIC:
				setCic((ComponentInstanceConfiguration)newValue);
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
			case CodegenPackage.COD_GEN_ALLOCATION__HPIC:
				getHpic().clear();
				return;
			case CodegenPackage.COD_GEN_ALLOCATION__CIC:
				setCic((ComponentInstanceConfiguration)null);
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
			case CodegenPackage.COD_GEN_ALLOCATION__HPIC:
				return hpic != null && !hpic.isEmpty();
			case CodegenPackage.COD_GEN_ALLOCATION__CIC:
				return cic != null;
		}
		return super.eIsSet(featureID);
	}

} //CodGenAllocationImpl
