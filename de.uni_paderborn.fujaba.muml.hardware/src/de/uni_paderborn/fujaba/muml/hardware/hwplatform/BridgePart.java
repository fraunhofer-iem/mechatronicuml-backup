/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.TimeInterval;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bridge Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a bridge or a gateway. Bridges are used to connect two or more CommunicationMedia.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart#getConnectedCommunicationMediaPart <em>Connected Communication Media Part</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getBridgePart()
 * @model
 * @generated
 */
public interface BridgePart extends NetworkingHardwarePart, ConnectorEndpoint {
	/**
	 * Returns the value of the '<em><b>Connected Communication Media Part</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CommunicationMedia which are connected to this Bridge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Communication Media Part</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getBridgePart_ConnectedCommunicationMediaPart()
	 * @model lower="2" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='let links:Set(CommunicationMediaPart) = self.connectors->select(c|c.oclIsKindOf(LinkPart)).oclAsType(CommunicationMediaPart)->asOrderedSet() in\nlet buses: Set(CommunicationMediaPart) = self.connectors->select(c|c.oclIsKindOf(BusConnector)).oclAsType(BusConnector)->collect(connectedBusPart).oclAsType(CommunicationMediaPart)->asOrderedSet() in\nlinks->union(buses)->asOrderedSet()'"
	 * @generated
	 */
	EList<CommunicationMediaPart> getConnectedCommunicationMediaPart();

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time variation this Bridge needs to transmit data between different CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay</em>' containment reference.
	 * @see #setDelay(TimeInterval)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getBridgePart_Delay()
	 * @model containment="true"
	 * @generated
	 */
	TimeInterval getDelay();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart#getDelay <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' containment reference.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(TimeInterval value);

} // BridgePart
