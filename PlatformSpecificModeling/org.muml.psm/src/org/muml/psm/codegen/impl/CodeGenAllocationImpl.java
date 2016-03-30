/**
 */
package org.muml.psm.codegen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.psm.codegen.CodeGenAllocation;
import org.muml.psm.codegen.CodegenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Gen Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.codegen.impl.CodeGenAllocationImpl#getHpic <em>Hpic</em>}</li>
 *   <li>{@link org.muml.psm.codegen.impl.CodeGenAllocationImpl#getCic <em>Cic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeGenAllocationImpl extends MinimalEObjectImpl.Container implements CodeGenAllocation {
	/**
	 * The cached value of the '{@link #getHpic() <em>Hpic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHpic()
	 * @generated
	 * @ordered
	 */
	protected HWPlatformInstanceConfiguration hpic;

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
	protected CodeGenAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.CODE_GEN_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformInstanceConfiguration getHpic() {
		return hpic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHpic(HWPlatformInstanceConfiguration newHpic, NotificationChain msgs) {
		HWPlatformInstanceConfiguration oldHpic = hpic;
		hpic = newHpic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenPackage.CODE_GEN_ALLOCATION__HPIC, oldHpic, newHpic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHpic(HWPlatformInstanceConfiguration newHpic) {
		if (newHpic != hpic) {
			NotificationChain msgs = null;
			if (hpic != null)
				msgs = ((InternalEObject)hpic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.CODE_GEN_ALLOCATION__HPIC, null, msgs);
			if (newHpic != null)
				msgs = ((InternalEObject)newHpic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.CODE_GEN_ALLOCATION__HPIC, null, msgs);
			msgs = basicSetHpic(newHpic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.CODE_GEN_ALLOCATION__HPIC, newHpic, newHpic));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenPackage.CODE_GEN_ALLOCATION__CIC, oldCic, newCic);
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
				msgs = ((InternalEObject)cic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.CODE_GEN_ALLOCATION__CIC, null, msgs);
			if (newCic != null)
				msgs = ((InternalEObject)newCic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.CODE_GEN_ALLOCATION__CIC, null, msgs);
			msgs = basicSetCic(newCic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.CODE_GEN_ALLOCATION__CIC, newCic, newCic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.CODE_GEN_ALLOCATION__HPIC:
				return basicSetHpic(null, msgs);
			case CodegenPackage.CODE_GEN_ALLOCATION__CIC:
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
			case CodegenPackage.CODE_GEN_ALLOCATION__HPIC:
				return getHpic();
			case CodegenPackage.CODE_GEN_ALLOCATION__CIC:
				return getCic();
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
			case CodegenPackage.CODE_GEN_ALLOCATION__HPIC:
				setHpic((HWPlatformInstanceConfiguration)newValue);
				return;
			case CodegenPackage.CODE_GEN_ALLOCATION__CIC:
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
			case CodegenPackage.CODE_GEN_ALLOCATION__HPIC:
				setHpic((HWPlatformInstanceConfiguration)null);
				return;
			case CodegenPackage.CODE_GEN_ALLOCATION__CIC:
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
			case CodegenPackage.CODE_GEN_ALLOCATION__HPIC:
				return hpic != null;
			case CodegenPackage.CODE_GEN_ALLOCATION__CIC:
				return cic != null;
		}
		return super.eIsSet(featureID);
	}

} //CodeGenAllocationImpl
