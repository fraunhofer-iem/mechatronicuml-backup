/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an assembly connector. Assembly connectors connect the port parts of two component parts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.component.AssemblyConnector#getCoordinationProtocolPart <em>Coordination Protocol Part</em>}</li>
 *   <li>{@link org.muml.pim.component.AssemblyConnector#getPortParts <em>Port Parts</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.component.ComponentPackage#getAssemblyConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AssemblySameStructuredComponent SelfAssemblyOnlyForMultiPortsOrMultiParts AssemblyBetweenDirectedTypedPortsRequiresSameDataType AssemblyBetweenDiscretePortsOrDirectedTypedPorts ValidPortDirections AssemblyBetweenDiscretePortsRequiresSameCoordinationProtocol AssemblyBetweenDiscretePortsRequiresDifferentRoles AssemblyBetweenDiscretePortsCompatibleMessageTypes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SelfAssemblyOnlyForMultiPortsOrMultiParts='--  Self assembly only allowed for multi ports and multi component-parts\nselfConnector implies\nlet portPart : PortPart = portParts->first() in\nportPart.portType.oclIsKindOf(component::DiscretePort) and (portPart.portType.oclAsType(component::DiscretePort).multi or portPart.componentPart.multiPart)\n-- author: bingo, cgerking, see MUML #872' AssemblySameStructuredComponent='-- Assembly must connect port parts within same structured component.\r\nportParts.componentPart.parentComponent->forAll(a, b | a = b)\r\n' AssemblyBetweenDirectedTypedPortsRequiresSameDataType='-- Assembly between DirectedTypedPorts requires same Data Type\nlet directedTypedPorts : Sequence(component::DirectedTypedPort) = portParts.portType->select(oclIsKindOf(component::DirectedTypedPort)).oclAsType(component::DirectedTypedPort) in\ndirectedTypedPorts->forAll(p1,p2 | p1.dataType = p2.dataType)\n-- author: bingo, cgerking, see MUML #873' AssemblyBetweenDiscretePortsOrDirectedTypedPorts='-- Assembly may only connect exclusively Discrete Ports or exclusively Directed Typed Ports\n(portParts.portType->forAll(oclIsKindOf(component::DiscretePort)) or portParts.portType->forAll(oclIsKindOf(component::DirectedTypedPort)))\n-- author: bingo, cgerking, see MUML #874' ValidPortDirections='-- Assembly may only connect Directed Typed Ports with different Port Direction Kinds\nportParts.portType->select(oclIsKindOf(component::DirectedTypedPort)).oclAsType(component::DirectedTypedPort)->isUnique(kind)\n-- author: bingo, cgerking, see MUML #875' AssemblyBetweenDiscretePortsRequiresSameCoordinationProtocol='-- Assembly may only connect ports refining roles of the same coordination protocol\nportParts.refinedRole->reject(oclIsUndefined())->forAll(r1,r2 | r1.coordinationProtocol = r2.coordinationProtocol)\n-- author: bingo, cgerking, see MUML #876' AssemblyBetweenDiscretePortsRequiresDifferentRoles='-- Assembly may only connect ports refining different roles\r\nportParts.refinedRole->reject(oclIsUndefined())->isUnique(r | r)\r\n-- author: bingo, cgerking, see MUML #877' AssemblyBetweenDiscretePortsCompatibleMessageTypes='-- Assembly may only connect discrete ports with compatible message types (a.senderMessageTypes = b.receiverMessageTypes)\nportParts.portType->select(oclIsKindOf(component::DiscretePort)).oclAsType(component::DiscretePort)->\nforAll(p1, p2 | p1 <> p2 implies p1.senderMessageTypes->asSet() = p2.receiverMessageTypes->asSet())\n-- author: bingo, cgerking, see MUML #878'"
 * @generated
 */
public interface AssemblyConnector extends PortConnector {
	/**
	 * Returns the value of the '<em><b>Coordination Protocol Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination protocol part that this assembly uses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol Part</em>' reference.
	 * @see org.muml.pim.component.ComponentPackage#getAssemblyConnector_CoordinationProtocolPart()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.portParts->first().coordinationProtocolPart'"
	 * @generated
	 */
	CoordinationProtocolPart getCoordinationProtocolPart();

	/**
	 * Returns the value of the '<em><b>Port Parts</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.component.PortPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port parts that the assembly connects. In case of a self-assembly, this will include only one port part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Parts</em>' reference list.
	 * @see org.muml.pim.component.ComponentPackage#getAssemblyConnector_PortParts()
	 * @model required="true" upper="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(c | c.oclIsKindOf(PortPart)).oclAsType(PortPart)->asOrderedSet()'"
	 * @generated
	 */
	EList<PortPart> getPortParts();

} // AssemblyConnector
