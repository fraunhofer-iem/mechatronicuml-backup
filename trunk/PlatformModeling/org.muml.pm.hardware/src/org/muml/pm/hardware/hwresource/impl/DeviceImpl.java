/**
 */
package org.muml.pm.hardware.hwresource.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pm.hardware.hwresource.Device;
import org.muml.pm.hardware.hwresource.DeviceKind;
import org.muml.pm.hardware.hwresource.HwresourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.DeviceImpl#getDeviceKind <em>Device Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends ResourceImpl implements Device {
	/**
	 * The default value of the '{@link #getDeviceKind() <em>Device Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceKind()
	 * @generated
	 * @ordered
	 */
	protected static final DeviceKind DEVICE_KIND_EDEFAULT = DeviceKind.SENSOR;

	/**
	 * The cached value of the '{@link #getDeviceKind() <em>Device Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceKind()
	 * @generated
	 * @ordered
	 */
	protected DeviceKind deviceKind = DEVICE_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourcePackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceKind getDeviceKind() {
		return deviceKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceKind(DeviceKind newDeviceKind) {
		DeviceKind oldDeviceKind = deviceKind;
		deviceKind = newDeviceKind == null ? DEVICE_KIND_EDEFAULT : newDeviceKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.DEVICE__DEVICE_KIND, oldDeviceKind, deviceKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwresourcePackage.DEVICE__DEVICE_KIND:
				return getDeviceKind();
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
			case HwresourcePackage.DEVICE__DEVICE_KIND:
				setDeviceKind((DeviceKind)newValue);
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
			case HwresourcePackage.DEVICE__DEVICE_KIND:
				setDeviceKind(DEVICE_KIND_EDEFAULT);
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
			case HwresourcePackage.DEVICE__DEVICE_KIND:
				return deviceKind != DEVICE_KIND_EDEFAULT;
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
		result.append(" (deviceKind: ");
		result.append(deviceKind);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
