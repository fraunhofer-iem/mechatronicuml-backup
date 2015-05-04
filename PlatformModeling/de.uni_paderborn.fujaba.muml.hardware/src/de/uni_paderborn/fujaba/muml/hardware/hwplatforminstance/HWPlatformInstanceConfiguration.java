/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance;
import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getResources <em>Resources</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getParentHWPlatformInstance <em>Parent HW Platform Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getNetworkConnectorInstances <em>Network Connector Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstanceConfiguration()
 * @model
 * @generated
 */
public interface HWPlatformInstanceConfiguration extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Hwplatform Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getParentHPIC <em>Parent HPIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of HWPlatformInstances of this HWPlatformInstanceConfiguration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwplatform Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstanceConfiguration_HwplatformInstances()
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getParentHPIC
	 * @model opposite="parentHPIC" containment="true"
	 * @generated
	 */
	EList<HWPlatformInstance> getHwplatformInstances();

	/**
	 * Returns the value of the '<em><b>Networking Hardware Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.NetworkingHardwareInstance}.
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
	EList<NetworkingHardwareInstance> getNetworkingHardwareInstances();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResourceInstances that belong to this HWPlatformInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstanceConfiguration_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceInstance> getResources();

	/**
	 * Returns the value of the '<em><b>Parent HW Platform Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getEmbeddedHPIC <em>Embedded HPIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent HW Platform Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent HW Platform Instance</em>' container reference.
	 * @see #setParentHWPlatformInstance(HWPlatformInstance)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstanceConfiguration_ParentHWPlatformInstance()
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getEmbeddedHPIC
	 * @model opposite="embeddedHPIC" transient="false"
	 * @generated
	 */
	HWPlatformInstance getParentHWPlatformInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getParentHWPlatformInstance <em>Parent HW Platform Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent HW Platform Instance</em>' container reference.
	 * @see #getParentHWPlatformInstance()
	 * @generated
	 */
	void setParentHWPlatformInstance(HWPlatformInstance value);

	/**
	 * Returns the value of the '<em><b>Network Connector Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Connector Instances</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Connector Instances</em>' containment reference.
	 * @see #setNetworkConnectorInstances(NetworkConnectorInstance)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstanceConfiguration_NetworkConnectorInstances()
	 * @model containment="true"
	 * @generated
	 */
	NetworkConnectorInstance getNetworkConnectorInstances();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getNetworkConnectorInstances <em>Network Connector Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Connector Instances</em>' containment reference.
	 * @see #getNetworkConnectorInstances()
	 * @generated
	 */
	void setNetworkConnectorInstances(NetworkConnectorInstance value);

} // HWPlatformInstanceConfiguration
