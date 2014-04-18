/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation HW Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance#getParentHWPlatformInstance <em>Parent HW Platform Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getDelegationHWPortInstance()
 * @model
 * @generated
 */
public interface DelegationHWPortInstance extends ConnectorEndpointInstance {
	/**
	 * Returns the value of the '<em><b>Parent HW Platform Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getDelegationPorts <em>Delegation Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent HW Platform Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent HW Platform Instance</em>' container reference.
	 * @see #setParentHWPlatformInstance(HWPlatformInstance)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getDelegationHWPortInstance_ParentHWPlatformInstance()
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getDelegationPorts
	 * @model opposite="delegationPorts" required="true" transient="false"
	 * @generated
	 */
	HWPlatformInstance getParentHWPlatformInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance#getParentHWPlatformInstance <em>Parent HW Platform Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent HW Platform Instance</em>' container reference.
	 * @see #getParentHWPlatformInstance()
	 * @generated
	 */
	void setParentHWPlatformInstance(HWPlatformInstance value);

} // DelegationHWPortInstance
