/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation HW Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort#getParentHWPlatform <em>Parent HW Platform</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getDelegationHWPort()
 * @model
 * @generated
 */
public interface DelegationHWPort extends ConnectorEndpoint {
	/**
	 * Returns the value of the '<em><b>Parent HW Platform</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform#getDelegationPorts <em>Delegation Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent HW Platform</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent HW Platform</em>' container reference.
	 * @see #setParentHWPlatform(HWPlatform)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getDelegationHWPort_ParentHWPlatform()
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform#getDelegationPorts
	 * @model opposite="delegationPorts" required="true" transient="false"
	 * @generated
	 */
	HWPlatform getParentHWPlatform();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort#getParentHWPlatform <em>Parent HW Platform</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent HW Platform</em>' container reference.
	 * @see #getParentHWPlatform()
	 * @generated
	 */
	void setParentHWPlatform(HWPlatform value);

} // DelegationHWPort
