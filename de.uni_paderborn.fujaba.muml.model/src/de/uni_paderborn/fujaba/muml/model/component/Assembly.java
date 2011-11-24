/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;


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
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getAssembly()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidDiscretePortDiscretePortConnection'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ValidDiscretePortDiscretePortConnection='if not self.fromPort.oclIsUndefined() and not self.toPort.oclIsUndefined() then\n    if self.fromPort.oclIsKindOf(component::DiscretePort) and self.toPort.oclIsKindOf(component::DiscretePort) then\n        -- check compatibility of message interfaces\n        let fromPort : component::DiscretePort = self.fromPort.oclAsType(component::DiscretePort) in\n        let toPort : component::DiscretePort = self.toPort.oclAsType(component::DiscretePort) in\n        fromPort.senderMessageInterface = toPort.receiverMessageInterface \n        and fromPort.receiverMessageInterface = toPort.senderMessageInterface\n        and (\n            -- check refines\n            if fromPort.refines.oclIsUndefined() xor toPort.refines.oclIsUndefined() then\n                -- only one port has a refinement\n                false\n            else\n                fromPort.refines.oclIsUndefined() \n                -- both ports have a refinement\n                or fromPort.refines.coordinationPattern = toPort.refines.coordinationPattern\n                -- this check is sufficient\n                and not fromPort.refines.coordinationPattern.oclIsUndefined()\n                and (\n                    if fromPort.refines.coordinationPattern.roles->size() = 2 then\n                        fromPort.refines.name <> toPort.refines.name\n                    else\n                        -- both ports have the same role and belong the same pattern\n                        true\n                    endif\n                )\n            endif\n        )\n    else\n        -- this case must be checked by other constraints\n        true\n    endif\nelse\n    false\nendif'"
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

} // Assembly
