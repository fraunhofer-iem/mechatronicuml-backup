/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package org.muml.pm.hardware.hwplatforminstance;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.connector.ConnectorInstance;
import org.muml.pm.hardware.hwplatform.NetworkConnector;
import org.muml.pm.hardware.hwresource.CommunicationKind;
import org.muml.pm.hardware.hwresource.CommunicationProtocol;
import org.muml.pm.hardware.hwvaluetype.DataRate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a network connection between hardware resources on instance-level.
 * This class inherits from pim::ConnectorInstance to be conistent with the muml metamodel.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getConnectedHWPortInstances <em>Connected HW Port Instances</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getConnectorKind <em>Connector Kind</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getNetworkConnectorType <em>Network Connector Type</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getNetworkConnectorInstance()
 * @model
 * @generated
 */
public interface NetworkConnectorInstance extends ConnectorInstance {
	/**
	 * Returns the value of the '<em><b>Connected HW Port Instances</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwplatforminstance.HWPortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connected LinkPortInstances.
	 *  They are derived from the reference connectedHWPortInstances of the super class CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected HW Port Instances</em>' reference list.
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getNetworkConnectorInstance_ConnectedHWPortInstances()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpointInstances->select(e|e.oclIsKindOf(HWPortInstance)).oclAsType(HWPortInstance)->asOrderedSet()\n'"
	 * @generated
	 */
	EList<HWPortInstance> getConnectedHWPortInstances();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The protocol this CommunicationMedia uses to transmit data. A CommunicationMedia can only be connected to HWPortInstances that use the same protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see #setProtocol(CommunicationProtocol)
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getNetworkConnectorInstance_Protocol()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.networkConnectorType.oclIsUndefined()) then\r\n\tnull\r\nelse \r\n\tself.networkConnectorType.protocol\r\nendif'"
	 * @generated
	 */
	CommunicationProtocol getProtocol();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getProtocol <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(CommunicationProtocol value);

	/**
	 * Returns the value of the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bandwidth of this CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bandwidth</em>' containment reference.
	 * @see #setBandwidth(DataRate)
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getNetworkConnectorInstance_Bandwidth()
	 * @model containment="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.networkConnectorType.oclIsUndefined()) then\r\n\tnull\r\nelse \r\n\tself.networkConnectorType.bandwidth\r\nendif'"
	 * @generated
	 */
	DataRate getBandwidth();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getBandwidth <em>Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth</em>' containment reference.
	 * @see #getBandwidth()
	 * @generated
	 */
	void setBandwidth(DataRate value);

	/**
	 * Returns the value of the '<em><b>Connector Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.pm.hardware.hwresource.CommunicationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines if this HWPort is  a bus or a link port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Kind</em>' attribute.
	 * @see org.muml.pm.hardware.hwresource.CommunicationKind
	 * @see #setConnectorKind(CommunicationKind)
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getNetworkConnectorInstance_ConnectorKind()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.networkConnectorType.oclIsUndefined()) then\r\n\tnull\r\nelse \r\n  self.networkConnectorType.connectorKind\r\nendif'"
	 * @generated
	 */
	CommunicationKind getConnectorKind();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getConnectorKind <em>Connector Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Kind</em>' attribute.
	 * @see org.muml.pm.hardware.hwresource.CommunicationKind
	 * @see #getConnectorKind()
	 * @generated
	 */
	void setConnectorKind(CommunicationKind value);

	/**
	 * Returns the value of the '<em><b>Network Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Connector Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Connector Type</em>' reference.
	 * @see #setNetworkConnectorType(NetworkConnector)
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getNetworkConnectorInstance_NetworkConnectorType()
	 * @model derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if  self.type.oclIsKindOf(hwplatform::NetworkConnector) then\r\n\tself.type.oclAsType(hwplatform::NetworkConnector)\r\nelse\r\n\tnull\r\nendif'"
	 * @generated
	 */
	NetworkConnector getNetworkConnectorType();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getNetworkConnectorType <em>Network Connector Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Connector Type</em>' reference.
	 * @see #getNetworkConnectorType()
	 * @generated
	 */
	void setNetworkConnectorType(NetworkConnector value);

} // NetworkConnectorInstance
