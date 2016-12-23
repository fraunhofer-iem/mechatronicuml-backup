/**
 */
package org.muml.pm.hardware.hwplatforminstance;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pm.hardware.hwresourceinstance.HWPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.HWPortInstance#getConnectedNetworkConnectorInstances <em>Connected Network Connector Instances</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.HWPortInstance#isIsNetworkInterface <em>Is Network Interface</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPortInstance()
 * @model
 * @generated
 */
public interface HWPortInstance extends ConnectorEndpointInstance, HWPort {
	/**
	 * Returns the value of the '<em><b>Connected Network Connector Instances</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The communication media to which this HWPortPart is connected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Network Connector Instances</em>' reference list.
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPortInstance_ConnectedNetworkConnectorInstances()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorInstances->select(c|c.oclIsKindOf(NetworkConnectorInstance)).oclAsType(NetworkConnectorInstance)->asOrderedSet()'"
	 * @generated
	 */
	EList<NetworkConnectorInstance> getConnectedNetworkConnectorInstances();

	/**
	 * Returns the value of the '<em><b>Is Network Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Network Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specfies wheter this HWPortInstance is used for network communication or for reading/writing sensors/actuators.
	 * This attribute is derived from the used CommunicationProtocol.
	 * Moreover, this attribute is used in the CodeGeneration to identify possible routings for messages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Network Interface</em>' attribute.
	 * @see #setIsNetworkInterface(boolean)
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPortInstance_IsNetworkInterface()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.protocol.oclIsUndefined()) then\n\tfalse\nelse self.protocol.isNetworkingProtocol\nendif'"
	 * @generated
	 */
	boolean isIsNetworkInterface();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatforminstance.HWPortInstance#isIsNetworkInterface <em>Is Network Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Network Interface</em>' attribute.
	 * @see #isIsNetworkInterface()
	 * @generated
	 */
	void setIsNetworkInterface(boolean value);

} // HWPortInstance
