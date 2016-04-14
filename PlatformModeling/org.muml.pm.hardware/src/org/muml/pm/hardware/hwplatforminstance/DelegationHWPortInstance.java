/**
 */
package org.muml.pm.hardware.hwplatforminstance;

import org.muml.pim.connector.ConnectorEndpointInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation HW Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a DelegationPort of a HWPlatform on instance-level.
 * In order to be conistent with the muml metamodel, this class inherits from pim::ConnectorEndpointInstance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance#getParentHWPlatformInstance <em>Parent HW Platform Instance</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getDelegationHWPortInstance()
 * @model
 * @generated
 */
public interface DelegationHWPortInstance extends ConnectorEndpointInstance {
	/**
	 * Returns the value of the '<em><b>Parent HW Platform Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getDelegationPorts <em>Delegation Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent HW Platform Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPlatformInstance this DelegationHWPortInstance belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent HW Platform Instance</em>' container reference.
	 * @see #setParentHWPlatformInstance(HWPlatformInstance)
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getDelegationHWPortInstance_ParentHWPlatformInstance()
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getDelegationPorts
	 * @model opposite="delegationPorts" required="true" transient="false"
	 * @generated
	 */
	HWPlatformInstance getParentHWPlatformInstance();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance#getParentHWPlatformInstance <em>Parent HW Platform Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent HW Platform Instance</em>' container reference.
	 * @see #getParentHWPlatformInstance()
	 * @generated
	 */
	void setParentHWPlatformInstance(HWPlatformInstance value);

} // DelegationHWPortInstance
