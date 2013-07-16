/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.AssemblyConnector#getCoordinationProtocolOccurence <em>Coordination Protocol Occurence</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.AssemblyConnector#getPortParts <em>Port Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getAssemblyConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints=''"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoSelfAssembliesForSinglePortsOfSingleParts='(self.ports[0].cardinality.upperBound.value <= 1 and self.ports[0].cardinality.upperBound.value <= 1)\r\nimplies\r\nself.ports[0] <> self.ports[1]' ValidContinuousPortDirections='not self.fromContinuousPort.oclIsUndefined() and not self.toContinuousPort.oclIsUndefined()\n\timplies\n\tself.fromContinuousPort.kind <> self.toContinuousPort.kind' AssemblyBetweenDiscretePortsRequiresCoordinationProtocol='-- assembly between two discrete ports requires a coordination protocol\r\nif not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\r\n\tnot self.coordinationProtocol.oclIsUndefined()\r\nelse\r\n\ttrue\r\nendif' AssemblyBetweenDiscretePortsRequiresSameCoordinationProtocol='if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refinedRole.oclIsUndefined() and not self.toDiscretePort.refinedRole.oclIsUndefined()\n\t\tand\n\t\t-- both refinements must belong to the same coordination protocol\n\t\tself.fromDiscretePort.refinedRole.coordinationProtocol = self.toDiscretePort.refinedRole.coordinationProtocol\nelse\n\ttrue\nendif' AssemblyBetweenDiscretePortsRequiresDifferentRoles='if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refinedRole.oclIsUndefined() and not self.toDiscretePort.refinedRole.oclIsUndefined()\n\t\tand\n\t\t-- both ports should have different roles (unless the coordination protocol has only one role)\n\t\t(self.fromDiscretePort.refinedRole.coordinationProtocol.roles->size() = 2 implies (self.fromDiscretePort.refinedRole.name <> self.toDiscretePort.refinedRole.name))\nelse\n\ttrue\nendif' AssemblyBetweenDiscretePortsSameMessageInterfaces='if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\t-- message interfaces must be compatible\n\tself.fromDiscretePort.senderMessageInterface = self.toDiscretePort.receiverMessageInterface\n\tand\n\tself.fromDiscretePort.receiverMessageInterface = self.toDiscretePort.senderMessageInterface\nelse\n\ttrue\nendif' ValidDiscreteInPortCombination='not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteOutPort\n\t)' ValidDiscreteOutPortCombination='not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteOutPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInPort\n\t)' ValidDiscreteInOutPortCombination='not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInOutPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInOutPort\n\t)' ValidContinuousInPortCombination='not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousInPort\n\timplies (\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort\n\t\tor\n\t\tnot self.toHybridPort.oclIsUndefined() and self.toHybridPort.isHybridOutPort\n\t)' ValidContinuousOutPortCombination='not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousOutPort\n\timplies (\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort\n\t\tor\n\t\tnot self.toHybridPort.oclIsUndefined() and self.toHybridPort.isHybridInPort\n\t)' ValidHybridInPortCombination='not self.fromHybridPort.oclIsUndefined() and self.fromHybridPort.isHybridInPort\n\timplies (\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort\n\t)' ValidHybridOutPortCombination='not self.fromHybridPort.oclIsUndefined() and self.fromHybridPort.isHybridOutPort\n\timplies (\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort\n\t)'"
 * @generated
 */
public interface AssemblyConnector extends PortConnector {
	/**
	 * Returns the value of the '<em><b>Coordination Protocol Occurence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination protocol occurence that this assembly uses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol Occurence</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getAssemblyConnector_CoordinationProtocolOccurence()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.portParts->first().coordinationProtocolOccurence'"
	 * @generated
	 */
	CoordinationProtocolOccurrence getCoordinationProtocolOccurence();

	/**
	 * Returns the value of the '<em><b>Port Parts</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.component.PortPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Parts</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getAssemblyConnector_PortParts()
	 * @model lower="2" upper="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(c | c.oclIsKindOf(PortPart)).oclAsType(PortPart)->asOrderedSet()'"
	 * @generated
	 */
	EList<PortPart> getPortParts();

} // AssemblyConnector
