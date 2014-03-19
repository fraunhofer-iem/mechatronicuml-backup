/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype;


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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Device#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends ResourceType {
	/**
	 * Returns the value of the '<em><b>Device Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.DeviceKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the type of the Device: Sensor or Actuator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.DeviceKind
	 * @see #setDeviceType(DeviceKind)
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#getDevice_DeviceType()
	 * @model required="true"
	 * @generated
	 */
	DeviceKind getDeviceType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Device#getDeviceType <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.DeviceKind
	 * @see #getDeviceType()
	 * @generated
	 */
	void setDeviceType(DeviceKind value);

} // Device
