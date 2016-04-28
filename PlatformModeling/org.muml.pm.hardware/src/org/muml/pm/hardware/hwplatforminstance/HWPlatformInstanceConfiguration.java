/**
 */
package org.muml.pm.hardware.hwplatforminstance;

import org.eclipse.emf.common.util.EList;
import org.muml.core.CommentableElement;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Platform Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a HWPlatformInstanceConfiguration.
 * A HWPlatformInstanceConfiguration consists of several HWPlatformInstances.
 * The HWPlatformInstances might be connected via different NetworkConnectorInstances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getHwplatformInstances <em>Hwplatform Instances</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getNetworkingHardwareInstances <em>Networking Hardware Instances</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getResources <em>Resources</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getParentHWPlatformInstance <em>Parent HW Platform Instance</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getNetworkConnectorInstances <em>Network Connector Instances</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstanceConfiguration()
 * @model
 * @generated
 */
public interface HWPlatformInstanceConfiguration extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Hwplatform Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance}.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getParentHPIC <em>Parent HPIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of HWPlatformInstances of this HWPlatformInstanceConfiguration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwplatform Instances</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstanceConfiguration_HwplatformInstances()
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getParentHPIC
	 * @model opposite="parentHPIC" containment="true"
	 * @generated
	 */
	EList<HWPlatformInstance> getHwplatformInstances();

	/**
	 * Returns the value of the '<em><b>Networking Hardware Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwplatforminstance.NetworkingHardwareInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NetworkingHardwareInstances of this HWPlatformInstanceConfiguration. 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Networking Hardware Instances</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstanceConfiguration_NetworkingHardwareInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkingHardwareInstance> getNetworkingHardwareInstances();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwresourceinstance.ResourceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResourceInstances that belong to this HWPlatformInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstanceConfiguration_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceInstance> getResources();

	/**
	 * Returns the value of the '<em><b>Parent HW Platform Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getEmbeddedHPIC <em>Embedded HPIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent HW Platform Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent HWPlatformInstance is which this HWPlatformInstanceConfiguration is embedded.
	 * The bound is 0..1, because the root HWPlatformInstanceConfiguration is not embedded in any HWPlatformInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent HW Platform Instance</em>' container reference.
	 * @see #setParentHWPlatformInstance(HWPlatformInstance)
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstanceConfiguration_ParentHWPlatformInstance()
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getEmbeddedHPIC
	 * @model opposite="embeddedHPIC" transient="false"
	 * @generated
	 */
	HWPlatformInstance getParentHWPlatformInstance();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getParentHWPlatformInstance <em>Parent HW Platform Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent HW Platform Instance</em>' container reference.
	 * @see #getParentHWPlatformInstance()
	 * @generated
	 */
	void setParentHWPlatformInstance(HWPlatformInstance value);

	/**
	 * Returns the value of the '<em><b>Network Connector Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Connector Instances</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NetworkingConnectorInstances of this HWPlatformInstanceConfiguration. 
	 * NetworkConnectorInstances are used to connect different HWPlatformInstances via bridges or HWPortInstances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Connector Instances</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPlatformInstanceConfiguration_NetworkConnectorInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkConnectorInstance> getNetworkConnectorInstances();

} // HWPlatformInstanceConfiguration
