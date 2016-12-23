/**
 */
package org.muml.pm.hardware.hwplatform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pm.hardware.hwplatform.HWPlatform;
import org.muml.pm.hardware.hwplatform.HWPlatformPart;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.hwplatform.NetworkBridge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Platform Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.HWPlatformPartImpl#getHwplatformType <em>Hwplatform Type</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.HWPlatformPartImpl#getEmbeddedBridges <em>Embedded Bridges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HWPlatformPartImpl extends PlatformPartImpl implements HWPlatformPart {
	/**
	 * The cached value of the '{@link #getHwplatformType() <em>Hwplatform Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwplatformType()
	 * @generated
	 * @ordered
	 */
	protected HWPlatform hwplatformType;

	/**
	 * The cached setting delegate for the '{@link #getEmbeddedBridges() <em>Embedded Bridges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedBridges()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EMBEDDED_BRIDGES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.HW_PLATFORM_PART__EMBEDDED_BRIDGES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPlatformPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatformPackage.Literals.HW_PLATFORM_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatform getHwplatformType() {
		if (hwplatformType != null && hwplatformType.eIsProxy()) {
			InternalEObject oldHwplatformType = (InternalEObject)hwplatformType;
			hwplatformType = (HWPlatform)eResolveProxy(oldHwplatformType);
			if (hwplatformType != oldHwplatformType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwplatformPackage.HW_PLATFORM_PART__HWPLATFORM_TYPE, oldHwplatformType, hwplatformType));
			}
		}
		return hwplatformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatform basicGetHwplatformType() {
		return hwplatformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwplatformType(HWPlatform newHwplatformType) {
		HWPlatform oldHwplatformType = hwplatformType;
		hwplatformType = newHwplatformType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.HW_PLATFORM_PART__HWPLATFORM_TYPE, oldHwplatformType, hwplatformType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NetworkBridge> getEmbeddedBridges() {
		return (EList<NetworkBridge>)EMBEDDED_BRIDGES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwplatformPackage.HW_PLATFORM_PART__EMBEDDED_BRIDGES:
				return ((InternalEList<?>)getEmbeddedBridges()).basicRemove(otherEnd, msgs);
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
			case HwplatformPackage.HW_PLATFORM_PART__HWPLATFORM_TYPE:
				if (resolve) return getHwplatformType();
				return basicGetHwplatformType();
			case HwplatformPackage.HW_PLATFORM_PART__EMBEDDED_BRIDGES:
				return getEmbeddedBridges();
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
			case HwplatformPackage.HW_PLATFORM_PART__HWPLATFORM_TYPE:
				setHwplatformType((HWPlatform)newValue);
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
			case HwplatformPackage.HW_PLATFORM_PART__HWPLATFORM_TYPE:
				setHwplatformType((HWPlatform)null);
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
			case HwplatformPackage.HW_PLATFORM_PART__HWPLATFORM_TYPE:
				return hwplatformType != null;
			case HwplatformPackage.HW_PLATFORM_PART__EMBEDDED_BRIDGES:
				return EMBEDDED_BRIDGES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //HWPlatformPartImpl
