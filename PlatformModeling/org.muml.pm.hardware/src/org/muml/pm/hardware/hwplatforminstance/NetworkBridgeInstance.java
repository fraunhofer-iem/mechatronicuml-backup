/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package org.muml.pm.hardware.hwplatforminstance;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pm.hardware.hwplatform.NetworkBridge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Bridge Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a bridge or a gateway. Bridges are used to connect two or more CommunicationMedia.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.NetworkBridgeInstance#getConnectedNetworkConnectorInstances <em>Connected Network Connector Instances</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.NetworkBridgeInstance#getNetworkBridgeType <em>Network Bridge Type</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getNetworkBridgeInstance()
 * @model
 * @generated
 */
public interface NetworkBridgeInstance extends NetworkingHardwareInstance, ConnectorEndpointInstance {
	/**
	 * Returns the value of the '<em><b>Connected Network Connector Instances</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CommunicationMedia which are connected to this Bridge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Network Connector Instances</em>' reference list.
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getNetworkBridgeInstance_ConnectedNetworkConnectorInstances()
	 * @model lower="2" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorInstances->select(c|c.oclIsKindOf(hwplatforminstance::NetworkConnectorInstance)).oclAsType(hwplatforminstance::NetworkConnectorInstance)->asOrderedSet()'"
	 * @generated
	 */
	EList<NetworkConnectorInstance> getConnectedNetworkConnectorInstances();

	/**
	 * Returns the value of the '<em><b>Network Bridge Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NetworkBridge type of this NetworkBridgeInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Bridge Type</em>' reference.
	 * @see #setNetworkBridgeType(NetworkBridge)
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getNetworkBridgeInstance_NetworkBridgeType()
	 * @model required="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if  self.type.oclIsKindOf(hwplatform::NetworkBridge) then\r\n\tself.type.oclAsType(hwplatform::NetworkBridge)\r\nelse\r\n\tnull\r\nendif'"
	 * @generated
	 */
	NetworkBridge getNetworkBridgeType();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatforminstance.NetworkBridgeInstance#getNetworkBridgeType <em>Network Bridge Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Bridge Type</em>' reference.
	 * @see #getNetworkBridgeType()
	 * @generated
	 */
	void setNetworkBridgeType(NetworkBridge value);

} // NetworkBridgeInstance
