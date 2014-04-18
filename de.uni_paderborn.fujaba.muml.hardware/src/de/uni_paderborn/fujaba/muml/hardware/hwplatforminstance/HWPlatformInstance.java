/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance;

import org.eclipse.emf.common.util.EList;

import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Platform Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a hardware platform at instance level. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getHwplatformType <em>Hwplatform Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getResources <em>Resources</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getNetworkingHardwareInstances <em>Networking Hardware Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getHwplatformInstances <em>Hwplatform Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getDelegationPorts <em>Delegation Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstance()
 * @model
 * @generated
 */
public interface HWPlatformInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Hwplatform Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPlatform type of which this instance is derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwplatform Type</em>' reference.
	 * @see #setHwplatformType(HWPlatform)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstance_HwplatformType()
	 * @model required="true"
	 * @generated
	 */
	HWPlatform getHwplatformType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getHwplatformType <em>Hwplatform Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hwplatform Type</em>' reference.
	 * @see #getHwplatformType()
	 * @generated
	 */
	void setHwplatformType(HWPlatform value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResourceInstances that belong to this HWPlatformInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstance_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceInstance> getResources();

	/**
	 * Returns the value of the '<em><b>Networking Hardware Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.NetworkingHardwareInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CommunicationResources that belong to this HWPlatformInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Networking Hardware Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstance_NetworkingHardwareInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkingHardwareInstance> getNetworkingHardwareInstances();

	/**
	 * Returns the value of the '<em><b>Hwplatform Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPlatformInstances that are embedded in this HWPlatformInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwplatform Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstance_HwplatformInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<HWPlatformInstance> getHwplatformInstances();

	/**
	 * Returns the value of the '<em><b>Delegation Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance#getParentHWPlatformInstance <em>Parent HW Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The delegation ports of this HWPlatformInstance. They are derived from the HWPlatform type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegation Ports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstance_DelegationPorts()
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance#getParentHWPlatformInstance
	 * @model opposite="parentHWPlatformInstance" containment="true"
	 * @generated
	 */
	EList<DelegationHWPortInstance> getDelegationPorts();

} // HWPlatformInstance
