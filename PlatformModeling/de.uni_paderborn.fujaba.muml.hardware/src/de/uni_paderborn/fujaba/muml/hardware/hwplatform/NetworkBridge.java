/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.TimeInterval;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Bridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a bridge or a gateway. Bridges are used to connect two or more CommunicationMedia.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkBridge#getConnectedNetworkConnector <em>Connected Network Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkBridge#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getNetworkBridge()
 * @model
 * @generated
 */
public interface NetworkBridge extends NetworkingHardware, ConnectorEndpoint {
	/**
	 * Returns the value of the '<em><b>Connected Network Connector</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CommunicationMedia which are connected to this Bridge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Network Connector</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getNetworkBridge_ConnectedNetworkConnector()
	 * @model lower="2" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectors->select(c|c.oclIsKindOf(hwplatform::NetworkConnector)).oclAsType(hwplatform::NetworkConnector)->asOrderedSet()'"
	 * @generated
	 */
	EList<NetworkConnector> getConnectedNetworkConnector();

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time variation this Bridge needs to transmit data between different CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay</em>' containment reference.
	 * @see #setDelay(TimeInterval)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getNetworkBridge_Delay()
	 * @model containment="true"
	 * @generated
	 */
	TimeInterval getDelay();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkBridge#getDelay <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' containment reference.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(TimeInterval value);

} // NetworkBridge
