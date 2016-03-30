/**
 */
package org.muml.pm.hardware.hwresource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a device.
 * Devices are resources that interact with the environment (i.e. sensors, actuators).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.Device#getDeviceKind <em>Device Kind</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends Resource {
	/**
	 * Returns the value of the '<em><b>Device Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.pm.hardware.hwresource.DeviceKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the type of the Device: Sensor or Actuator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Kind</em>' attribute.
	 * @see org.muml.pm.hardware.hwresource.DeviceKind
	 * @see #setDeviceKind(DeviceKind)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getDevice_DeviceKind()
	 * @model required="true"
	 * @generated
	 */
	DeviceKind getDeviceKind();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.Device#getDeviceKind <em>Device Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Kind</em>' attribute.
	 * @see org.muml.pm.hardware.hwresource.DeviceKind
	 * @see #getDeviceKind()
	 * @generated
	 */
	void setDeviceKind(DeviceKind value);

} // Device
