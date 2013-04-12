/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component;


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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DelegationConnector#getPortPart <em>Port Part</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DelegationConnector#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDelegationConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints=''"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ValidContinuousPortDirections='not self.fromContinuousPort.oclIsUndefined() and not self.toContinuousPort.oclIsUndefined()\n\timplies\n\tself.fromContinuousPort.kind = self.toContinuousPort.kind' DelegationBetweenContinuousPortsRequiresSameDataType='not self.fromContinuousPort.oclIsUndefined() and not self.toContinuousPort.oclIsUndefined()\n\timplies\n\tself.fromContinuousPort.type = self.toContinuousPort.type' DelegationBetweenDiscretePortsRequiresSameCoordinationProtocol='if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n\t\tand\n\t\t-- both refinements must belong to the same coordination protocol\n\t\tself.fromDiscretePort.refines.coordinationProtocol = self.toDiscretePort.refines.coordinationProtocol\nelse\n\ttrue\nendif' DelegationBetweenDiscretePortsRequiresSameRoles='if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n\t\tand\n\t\t-- both ports should have the same roles\n\t\tself.fromDiscretePort.refines.name = self.toDiscretePort.refines.name\nelse\n\ttrue\nendif' DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart='not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined()\nand self.fromPort.isMultiPort\n\timplies (\n\t\t-- the target port is a multi port\n\t\tself.toPort.isMultiPort\n\t\tor\n\t\t-- the target part is a multi part\n\t\tself.componentPart.isMultiPart\n\t)' ValidDiscreteInPortCombination='not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInPort\n\t)' ValidDiscreteOutPortCombination='not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteOutPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteOutPort\n\t)' ValidDiscreteInOutPortCombination='not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInOutPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInOutPort\n\t)' ValidContinuousInPortCombination='not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousInPort\r\n\timplies (\r\n\t\t(not self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort)\r\n\t\tor\r\n\t\t(not self.toHybridPort.oclIsUndefined() and self.toHybridPort.isHybridInPort)\r\n\t)' ValidContinuousOutPortCombination='-- not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousOutPort implies (not self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort) \r\n\r\nnot self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousOutPort\r\n\timplies (\r\n\t\t(not self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort)\r\n\t\tor\r\n\t\t(not self.toHybridPort.oclIsUndefined() and self.toHybridPort.isHybridOutPort)\r\n\t)' ValidHybridInPortCombination='not self.fromHybridPort.oclIsUndefined() and self.fromHybridPort.isHybridInPort\r\n\timplies (\r\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort\r\n\t)' ValidHybridOutPortCombination='not self.fromHybridPort.oclIsUndefined() \r\nand \r\nself.fromHybridPort.isHybridOutPort \r\nimplies (not self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort) ' ValidPortDirections='-- direction of two connected directed typed ports must be identical\r\nself.ports ->forAll(p1, p2 | p1.oclIsKindOf(DirectedTypedPort) and p2.oclIsKindOf(DirectedTypedPort) )'"
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
	 * @return the value of the '<em>Port Part</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDelegationConnector_PortPart()
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
	 * @return the value of the '<em>Port</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDelegationConnector_Port()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(c | c.oclIsKindOf(Port)).oclAsType(Port) -> any(true)'"
	 * @generated
	 */
	Port getPort();

} // DelegationConnector
