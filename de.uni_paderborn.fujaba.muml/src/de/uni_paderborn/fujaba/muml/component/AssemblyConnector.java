/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.AssemblyConnector#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.AssemblyConnector#getComponentParts <em>Component Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getAssemblyConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoSelfAssembliesForSinglePortsOfSingleParts ValidContinuousPortDirections AssemblyBetweenDiscretePortsRequiresCoordinationPattern AssemblyBetweenDiscretePortsRequiresSameCoordinationPattern AssemblyBetweenDiscretePortsRequiresDifferentRoles AssemblyBetweenDiscretePortsSameMessageInterfaces ValidDiscreteInPortCombination ValidDiscreteOutPortCombination ValidDiscreteInOutPortCombination ValidContinuousInPortCombination ValidContinuousOutPortCombination ValidHybridInPortCombination ValidHybridOutPortCombination'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoSelfAssembliesForSinglePortsOfSingleParts='(self.ports[0].cardinality.upperBound.value <= 1 and self.ports[0].cardinality.upperBound.value <= 1)\r\nimplies\r\nself.ports[0] <> self.ports[1]' ValidContinuousPortDirections='not self.fromContinuousPort.oclIsUndefined() and not self.toContinuousPort.oclIsUndefined()\n\timplies\n\tself.fromContinuousPort.kind <> self.toContinuousPort.kind' AssemblyBetweenDiscretePortsRequiresCoordinationPattern='if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\t-- assembly between two discrete ports requires a coordination pattern\n\tnot self.coordinationPattern.oclIsUndefined()\nelse\n\ttrue\nendif' AssemblyBetweenDiscretePortsRequiresSameCoordinationPattern='if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n\t\tand\n\t\t-- both refinements must belong to the same pattern\n\t\tself.fromDiscretePort.refines.coordinationPattern = self.toDiscretePort.refines.coordinationPattern\nelse\n\ttrue\nendif' AssemblyBetweenDiscretePortsRequiresDifferentRoles='if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n\t\tand\n\t\t-- both ports should have different roles (unless the pattern has only one role)\n\t\t(self.fromDiscretePort.refines.coordinationPattern.roles->size() = 2 implies (self.fromDiscretePort.refines.name <> self.toDiscretePort.refines.name))\nelse\n\ttrue\nendif' AssemblyBetweenDiscretePortsSameMessageInterfaces='if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\t-- message interfaces must be compatible\n\tself.fromDiscretePort.senderMessageInterface = self.toDiscretePort.receiverMessageInterface\n\tand\n\tself.fromDiscretePort.receiverMessageInterface = self.toDiscretePort.senderMessageInterface\nelse\n\ttrue\nendif' ValidDiscreteInPortCombination='not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteOutPort\n\t)' ValidDiscreteOutPortCombination='not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteOutPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInPort\n\t)' ValidDiscreteInOutPortCombination='not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInOutPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInOutPort\n\t)' ValidContinuousInPortCombination='not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousInPort\n\timplies (\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort\n\t\tor\n\t\tnot self.toHybridPort.oclIsUndefined() and self.toHybridPort.isHybridOutPort\n\t)' ValidContinuousOutPortCombination='not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousOutPort\n\timplies (\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort\n\t\tor\n\t\tnot self.toHybridPort.oclIsUndefined() and self.toHybridPort.isHybridInPort\n\t)' ValidHybridInPortCombination='not self.fromHybridPort.oclIsUndefined() and self.fromHybridPort.isHybridInPort\n\timplies (\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort\n\t)' ValidHybridOutPortCombination='not self.fromHybridPort.oclIsUndefined() and self.fromHybridPort.isHybridOutPort\n\timplies (\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort\n\t)'"
 * @generated
 */
public interface AssemblyConnector extends PortConnector {
	/**
	 * Returns the value of the '<em><b>Coordination Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination pattern that defines the protocol of this assembly.
	 * 
	 * \todosd{Why does it reference the CoordinationPattern and not the PatternOccurence?}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol</em>' reference.
	 * @see #setCoordinationProtocol(CoordinationProtocol)
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getAssemblyConnector_CoordinationProtocol()
	 * @model
	 * @generated
	 */
	CoordinationProtocol getCoordinationProtocol();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.component.AssemblyConnector#getCoordinationProtocol <em>Coordination Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Protocol</em>' reference.
	 * @see #getCoordinationProtocol()
	 * @generated
	 */
	void setCoordinationProtocol(CoordinationProtocol value);

	/**
	 * Returns the value of the '<em><b>Component Parts</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.component.ComponentPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Parts</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getAssemblyConnector_ComponentParts()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<ComponentPart> getComponentParts();

} // AssemblyConnector
