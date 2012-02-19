/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an assembly connector. Assembly connectors connect the port parts of two component parts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getTo <em>To</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getFrom <em>From</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getAssembly()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoSelfAssembliesForSinglePorts ValidContinuousPortDirections AssemblyBetweenDiscretePortsRequiresCoordinationPattern AssemblyBetweenDiscretePortsRequiresSameCoordinationPattern AssemblyBetweenDiscretePortsRequiresDifferentRoles AssemblyBetweenDiscretePortsSameMessageInterfaces ValidDiscreteInPortCombination ValidDiscreteOutPortCombination ValidDiscreteInOutPortCombination ValidContinuousInPortCombination ValidContinuousOutPortCombination ValidHybridInPortCombination ValidHybridOutPortCombination'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoSelfAssembliesForSinglePorts='self.fromPort.cardinality.upperBound.value <= 1\r\nimplies\r\nself.fromPort <> self.toPort' ValidContinuousPortDirections='not self.fromContinuousPort.oclIsUndefined() and not self.toContinuousPort.oclIsUndefined()\n\timplies\n\tself.fromContinuousPort.kind <> self.toContinuousPort.kind' AssemblyBetweenDiscretePortsRequiresCoordinationPattern='if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\t-- assembly between two discrete ports requires a coordination pattern\n\tnot self.coordinationPattern.oclIsUndefined()\nelse\n\ttrue\nendif' AssemblyBetweenDiscretePortsRequiresSameCoordinationPattern='if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n\t\tand\n\t\t-- both refinements must belong to the same pattern\n\t\tself.fromDiscretePort.refines.coordinationPattern = self.toDiscretePort.refines.coordinationPattern\nelse\n\ttrue\nendif' AssemblyBetweenDiscretePortsRequiresDifferentRoles='if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n\t\tand\n\t\t-- both ports should have different roles (unless the pattern has only one role)\n\t\t(self.fromDiscretePort.refines.coordinationPattern.roles->size() = 2 implies (self.fromDiscretePort.refines.name <> self.toDiscretePort.refines.name))\nelse\n\ttrue\nendif' AssemblyBetweenDiscretePortsSameMessageInterfaces='if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\t-- message interfaces must be compatible\n\tself.fromDiscretePort.senderMessageInterface = self.toDiscretePort.receiverMessageInterface\n\tand\n\tself.fromDiscretePort.receiverMessageInterface = self.toDiscretePort.senderMessageInterface\nelse\n\ttrue\nendif' ValidDiscreteInPortCombination='not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteOutPort\n\t)' ValidDiscreteOutPortCombination='not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteOutPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInPort\n\t)' ValidDiscreteInOutPortCombination='not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInOutPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInOutPort\n\t)' ValidContinuousInPortCombination='not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousInPort\n\timplies (\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort\n\t\tor\n\t\tnot self.toHybridPort.oclIsUndefined() and self.toHybridPort.isHybridOutPort\n\t)' ValidContinuousOutPortCombination='not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousOutPort\n\timplies (\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort\n\t\tor\n\t\tnot self.toHybridPort.oclIsUndefined() and self.toHybridPort.isHybridInPort\n\t)' ValidHybridInPortCombination='not self.fromHybridPort.oclIsUndefined() and self.fromHybridPort.isHybridInPort\n\timplies (\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort\n\t)' ValidHybridOutPortCombination='not self.fromHybridPort.oclIsUndefined() and self.fromHybridPort.isHybridOutPort\n\timplies (\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort\n\t)'"
 * @generated
 */
public interface Assembly extends BehavioralConnector {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getToRev <em>To Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component part of the port part to which this assembly leads.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(ComponentPart)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getAssembly_To()
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getToRev
	 * @model opposite="toRev" required="true"
	 * @generated
	 */
	ComponentPart getTo();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ComponentPart value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getFromRev <em>From Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component part of the port part from which this assembly originates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ComponentPart)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getAssembly_From()
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getFromRev
	 * @model opposite="fromRev" required="true"
	 * @generated
	 */
	ComponentPart getFrom();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ComponentPart value);

	/**
	 * Returns the value of the '<em><b>Coordination Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination pattern that defines the protocol of this assembly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Pattern</em>' reference.
	 * @see #setCoordinationPattern(CoordinationPattern)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getAssembly_CoordinationPattern()
	 * @model
	 * @generated
	 */
	CoordinationPattern getCoordinationPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.Assembly#getCoordinationPattern <em>Coordination Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Pattern</em>' reference.
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	void setCoordinationPattern(CoordinationPattern value);

} // Assembly
