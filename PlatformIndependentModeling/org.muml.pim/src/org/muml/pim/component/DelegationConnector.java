/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a delegation connector. A delegation connector 
 * connects a port of a structured component type and a port part of 
 * component part the structured component contains.
 * The delegation has no behavior. In a running system, the port of the structured
 * component and the port of the component part will be the same object like 
 * interfaces of classes where interface and class are the same object at runtime.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.component.DelegationConnector#getPortPart <em>Port Part</em>}</li>
 *   <li>{@link org.muml.pim.component.DelegationConnector#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.component.ComponentPackage#getDelegationConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DelegationOnlyBetweenSameDiscreteInteractionEndpoints DelegateToEmbeddedPort DelegationBetweenDirectedTypedPortsRequiresSameDataType DelegationBetweenDiscretePortsOrDirectedTypedPorts DelegationBetweenDiscretePortsEqualMessageTypes ValidPortDirections DelegationBetweenDiscretePortsRequiresSameRoles DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL DelegationBetweenDirectedTypedPortsRequiresSameDataType='-- Delegation between DirectedTypedPorts requires same Data Type\r\n(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined() and portPart.portType.oclIsKindOf(component::DirectedTypedPort) and port.oclIsKindOf(component::DirectedTypedPort))\r\nimplies \r\nportPart.portType.oclAsType(component::DirectedTypedPort).dataType = port.oclAsType(component::DirectedTypedPort).dataType\r\n-- author: bingo, cgerking, see MUML #879' DelegationBetweenDiscretePortsOrDirectedTypedPorts='-- Delegation may only connect exclusively Discrete Ports or exclusively Directed Typed Ports\r\n(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined())\r\nimplies \r\nlet ports : OrderedSet(Port) = OrderedSet { portPart.portType, port } in\r\n(ports->forAll(oclIsKindOf(connector::DiscreteInteractionEndpoint)) or ports->forAll(oclIsKindOf(component::DirectedTypedPort)))\r\n-- author: bingo, cgerking, see MUML #880' DelegationBetweenDiscretePortsEqualMessageTypes='-- Delegation may only connect discrete ports with equal message types\r\n(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined())\r\nimplies \r\nlet ports : OrderedSet(Port) = OrderedSet { portPart.portType, port } in\r\nports->select(oclIsKindOf(component::DiscretePort)).oclAsType(component::DiscretePort)->forAll(p1, p2 | p1.senderMessageTypes->asSet() = p2.senderMessageTypes->asSet() and p1.receiverMessageTypes->asSet() = p2.receiverMessageTypes->asSet())\r\n-- author: bingo, cgerking, see MUML #81' ValidPortDirections='-- Delegation may only connect Directed Typed Ports with different Port Direction Kinds\r\n(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined())\r\nimplies \r\nlet ports : OrderedSet (Port) = OrderedSet { portPart.portType, port } in ports->select(oclIsKindOf(component::DirectedTypedPort)).oclAsType(component::DirectedTypedPort)->forAll(p1, p2 | p1.kind = p2.kind)\r\n-- author: bingo, cgerking, see MUML #882' DelegationBetweenDiscretePortsRequiresSameRoles='-- Delegation may only connect ports refining same roles\r\n(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined() and self.port.oclIsKindOf(DiscretePort)) \r\nimplies \r\nself.port.oclAsType(DiscretePort).refinedRole = self.portPart.refinedRole\r\n-- author: bingo, cgerking, see MUML #883' DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart='-- Delegation starting at Multi Port must connect to a multi port or single port at multi part\r\n(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined() and self.port.oclIsKindOf(DiscretePort) and self.port.oclAsType(DiscretePort).multi)\r\nimplies\r\n((self.portPart.portType.oclIsKindOf(DiscretePort) and self.portPart.portType.oclAsType(DiscretePort).multi) or self.portPart.componentPart.multiPart)\r\n-- author: bingo, cgerking, see MUML #884' DelegateToEmbeddedPort='-- Delegation must delegate to a Port at an embedded Component Part.\r\nif portPart.oclIsUndefined() or portPart.componentPart.oclIsUndefined() or port.oclIsUndefined() then\r\n\ttrue\r\nelse\r\n\tportPart.componentPart.parentComponent = port.component\r\nendif\r\n' DelegationOnlyBetweenSameDiscreteInteractionEndpoints='-- Delegations may only connect Ports of the same kind\r\n(not portPart.portType.oclIsUndefined() and not port.oclIsUndefined())\r\nimplies (\r\n\t(port.oclIsKindOf(connector::DiscreteInteractionEndpoint))\r\n\timplies\r\n\t(port.oclAsType(ecore::EObject).eClass() = portPart.portType.oclAsType(ecore::EObject).eClass())\r\n)\r\n-- author: chris227, see MUML #1043'"
 * @generated
 */
public interface DelegationConnector extends PortConnector {
	/**
	 * Returns the value of the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port part that this delegation delegates to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Part</em>' reference.
	 * @see org.muml.pim.component.ComponentPackage#getDelegationConnector_PortPart()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(c | c.oclIsKindOf(PortPart)).oclAsType(PortPart) -> any(true)'"
	 * @generated
	 */
	PortPart getPortPart();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The delegating port for this delegation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see org.muml.pim.component.ComponentPackage#getDelegationConnector_Port()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(c | c.oclIsKindOf(Port)).oclAsType(Port) -> any(true)'"
	 * @generated
	 */
	Port getPort();

} // DelegationConnector
