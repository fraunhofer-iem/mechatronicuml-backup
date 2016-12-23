/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package org.muml.pm.hardware.hwplatform;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pm.hardware.hwvaluetype.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Bridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a bridge or a gateway. Bridges are used to connect two or more Networks.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatform.NetworkBridge#getConnectedNetworkConnector <em>Connected Network Connector</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.NetworkBridge#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getNetworkBridge()
 * @model
 * @generated
 */
public interface NetworkBridge extends NetworkingHardware, ConnectorEndpoint {
	/**
	 * Returns the value of the '<em><b>Connected Network Connector</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwplatform.NetworkConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CommunicationMedia which are connected to this Bridge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Network Connector</em>' reference list.
	 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getNetworkBridge_ConnectedNetworkConnector()
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
	 * The time variation this Bridge needs to transmit data between different Networks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay</em>' containment reference.
	 * @see #setDelay(TimeInterval)
	 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getNetworkBridge_Delay()
	 * @model containment="true"
	 * @generated
	 */
	TimeInterval getDelay();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatform.NetworkBridge#getDelay <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' containment reference.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(TimeInterval value);

} // NetworkBridge
