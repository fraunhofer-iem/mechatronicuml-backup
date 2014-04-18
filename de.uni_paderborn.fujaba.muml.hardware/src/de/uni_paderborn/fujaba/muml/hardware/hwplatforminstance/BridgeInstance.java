/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bridge Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a bridge or a gateway. Bridges are used to connect two or more CommunicationMedia.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BridgeInstance#getConnectedCommunicationMediaInstance <em>Connected Communication Media Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getBridgeInstance()
 * @model
 * @generated
 */
public interface BridgeInstance extends NetworkingHardwareInstance, ConnectorEndpointInstance {
	/**
	 * Returns the value of the '<em><b>Connected Communication Media Instance</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CommunicationMedia which are connected to this Bridge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Communication Media Instance</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getBridgeInstance_ConnectedCommunicationMediaInstance()
	 * @model lower="2" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='let links:Set(CommunicationMediaInstance) = self.connectorInstances->select(c|c.oclIsKindOf(LinkInstance)).oclAsType(CommunicationMediaInstance)->asOrderedSet() in\nlet buses: Set(CommunicationMediaInstance) = self.connectorInstances->select(c|c.oclIsKindOf(BusConnectorInstance)).oclAsType(BusConnectorInstance)->collect(connectedBusInstance).oclAsType(CommunicationMediaInstance)->asOrderedSet() in\nlinks->union(buses)->asOrderedSet()'"
	 * @generated
	 */
	EList<CommunicationMediaInstance> getConnectedCommunicationMediaInstance();

} // BridgeInstance
