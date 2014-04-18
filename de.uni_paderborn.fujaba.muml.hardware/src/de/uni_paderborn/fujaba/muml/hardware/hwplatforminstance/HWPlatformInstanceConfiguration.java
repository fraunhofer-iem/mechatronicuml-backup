/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkingHardwarePart;

import org.eclipse.emf.common.util.EList;

import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Platform Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a HWPlatformInstanceConfiguration.
 * A HWPlatformInstanceConfiguration consists of several HWPlatformInstances.
 * The HWPlatformInstances might be connected via different CommunicationMedia.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getHwplatformInstances <em>Hwplatform Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getNetworkingHardwareInstances <em>Networking Hardware Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstanceConfiguration()
 * @model
 * @generated
 */
public interface HWPlatformInstanceConfiguration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Hwplatform Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of HWPlatformInstances of this HWPlatformInstanceConfiguration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwplatform Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstanceConfiguration_HwplatformInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<HWPlatformInstance> getHwplatformInstances();

	/**
	 * Returns the value of the '<em><b>Networking Hardware Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkingHardwarePart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CommunicationMedia of this HWPlatformInstanceConfiguration. 
	 * The CommunicationMedia are used to connect different HWPlatformInstances via their Bridges or HWPortInstances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Networking Hardware Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstanceConfiguration_NetworkingHardwareInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkingHardwarePart> getNetworkingHardwareInstances();

} // HWPlatformInstanceConfiguration
