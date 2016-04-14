/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package org.muml.pm.hardware.hwplatform;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.connector.Connector;
import org.muml.pm.hardware.hwresource.CommunicationKind;
import org.muml.pm.hardware.hwresource.CommunicationProtocol;
import org.muml.pm.hardware.hwvaluetype.DataRate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a network connection between hardware resources.
 * This class inherits from pim::Connector to be conistent with the muml metamodel.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatform.NetworkConnector#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.NetworkConnector#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.NetworkConnector#getHwportParts <em>Hwport Parts</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.NetworkConnector#getConnectorKind <em>Connector Kind</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.NetworkConnector#getDelegationHWPorts <em>Delegation HW Ports</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getNetworkConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SameProtocol'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SameProtocol='-- Connected Ports must use the same Protocol\r\nself.hwportParts.hwport->forAll(p1 , p2 | p1.protocol = p2.protocol)'"
 * @generated
 */
public interface NetworkConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The protocol this CommunicationMedia uses to transmit data. A CommunicationMedia can only be connected to HWPortInstances that use the same protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see #setProtocol(CommunicationProtocol)
	 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getNetworkConnector_Protocol()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.hwportParts->notEmpty()) then \t\n\tself.hwportParts.hwport->select(p| not p.protocol.oclIsUndefined())->any(true).protocol \nelse      \n\tnull \nendif'"
	 * @generated
	 */
	CommunicationProtocol getProtocol();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatform.NetworkConnector#getProtocol <em>Protocol</em>}' reference.
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
	 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getNetworkConnector_Bandwidth()
	 * @model containment="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.protocol.oclIsUndefined()) then\r\n\tnull\r\nelse \r\n\tself.protocol.bandwidth\r\nendif'"
	 * @generated
	 */
	DataRate getBandwidth();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatform.NetworkConnector#getBandwidth <em>Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth</em>' containment reference.
	 * @see #getBandwidth()
	 * @generated
	 */
	void setBandwidth(DataRate value);

	/**
	 * Returns the value of the '<em><b>Hwport Parts</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwplatform.HWPortPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hardware port parts that the NetworkConnector connects. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwport Parts</em>' reference list.
	 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getNetworkConnector_HwportParts()
	 * @model upper="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(c | c.oclIsKindOf(HWPortPart)).oclAsType(HWPortPart)->asOrderedSet()'"
	 * @generated
	 */
	EList<HWPortPart> getHwportParts();

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
	 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getNetworkConnector_ConnectorKind()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.delegationHWPorts->notEmpty()) then\r\n\thwresource::CommunicationKind::DELEGATION\r\nelse \r\n   self.hwportParts.hwport->any(true).portKind\r\n  endif'"
	 * @generated
	 */
	CommunicationKind getConnectorKind();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatform.NetworkConnector#getConnectorKind <em>Connector Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Kind</em>' attribute.
	 * @see org.muml.pm.hardware.hwresource.CommunicationKind
	 * @see #getConnectorKind()
	 * @generated
	 */
	void setConnectorKind(CommunicationKind value);

	/**
	 * Returns the value of the '<em><b>Delegation HW Ports</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwplatform.DelegationHWPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hardware port parts that the NetworkConnector connects. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegation HW Ports</em>' reference list.
	 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getNetworkConnector_DelegationHWPorts()
	 * @model upper="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(c | c.oclIsKindOf(DelegationHWPort)).oclAsType(DelegationHWPort)->asOrderedSet()'"
	 * @generated
	 */
	EList<DelegationHWPort> getDelegationHWPorts();

} // NetworkConnector
