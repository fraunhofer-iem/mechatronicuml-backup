/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component;

import de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.protocol.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a concrete port specification which provides the discrete functionality of a port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DiscretePort#getRefinedRole <em>Refined Role</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DiscretePort#isIsDiscreteInPort <em>Is Discrete In Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DiscretePort#isIsDiscreteOutPort <em>Is Discrete Out Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DiscretePort#isIsDiscreteInOutPort <em>Is Discrete In Out Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DiscretePort#isMultiPort <em>Multi Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DiscretePort#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDiscretePort()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DiscretePortRequiresMessageTypes DiscretePortAndRoleSameMessageTypes DiscretePortRequiresBehavior DiscretePortAtStructuredComponentHasNoBehavior DiscretePortRequiresRole DiscretePortCardinalityMustComplyWithRefinedRoleCardinality MultiPortOfAtomicComponentRequiresRoleAndAdaptationBehavior'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL DiscretePortRequiresMessageTypes='self.senderMessageTypes->notEmpty() or self.receiverMessageTypes->notEmpty()' DiscretePortRequiresBehavior='-- A discrete port of an atomic component must have a Behavior Specification\r\n(not self.component.oclIsUndefined() and self.component.oclIsTypeOf(component::AtomicComponent))\r\n\timplies not self.behavior.oclIsUndefined()' DiscretePortAtStructuredComponentHasNoBehavior='(not self.component.oclIsUndefined() and self.component.oclIsTypeOf(component::StructuredComponent))\n\timplies self.behavior.oclIsUndefined()' DiscretePortRequiresRole='self.oclIsTypeOf(component::DiscretePort) implies not self.refinedRole.oclIsUndefined()' DiscretePortAndRoleSameMessageTypes='not self.refinedRole.oclIsUndefined() implies\r\n\t(self.senderMessageTypes = self.refinedRole.senderMessageTypes\r\n\t and\r\n\t self.receiverMessageTypes = self.refinedRole.receiverMessageTypes\r\n\t)' DiscretePortCardinalityMustComplyWithRefinedRoleCardinality='((not self.cardinality.oclIsUndefined()) and (not self.refinedRole.oclIsUndefined())) \r\nimplies \r\n(self.cardinality.lowerBound.greaterOrEqual(self.refinedRole.cardinality.lowerBound) and self.cardinality.upperBound.lessOrEqual(self.refinedRole.cardinality.upperBound))' MultiPortOfAtomicComponentRequiresRoleAndAdaptationBehavior='(self.multiPort and self.component.oclIsKindOf(AtomicComponent)) \r\nimplies \r\n((not self.adaptationBehavior.oclIsUndefined()) and (not self.roleAndAdaptationBehavior.oclIsUndefined()))'"
 * @generated
 */
public interface DiscretePort extends Port, DiscreteInteractionEndpoint {
	/**
	 * Returns the value of the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role of a coordination protocol that this port refines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refined Role</em>' reference.
	 * @see #setRefinedRole(Role)
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDiscretePort_RefinedRole()
	 * @model
	 * @generated
	 */
	Role getRefinedRole();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.component.DiscretePort#getRefinedRole <em>Refined Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined Role</em>' reference.
	 * @see #getRefinedRole()
	 * @generated
	 */
	void setRefinedRole(Role value);

	/**
	 * Returns the value of the '<em><b>Is Discrete In Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the discrete port is an IN port
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Discrete In Port</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDiscretePort_IsDiscreteInPort()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.receiverMessageTypes ->size() >= 1 and self.senderMessageTypes ->size() = 0'"
	 * @generated
	 */
	boolean isIsDiscreteInPort();

	/**
	 * Returns the value of the '<em><b>Is Discrete Out Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the discrete port is an OUT port
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Discrete Out Port</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDiscretePort_IsDiscreteOutPort()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.receiverMessageTypes ->size() = 0 and self.senderMessageTypes ->size() >= 1'"
	 * @generated
	 */
	boolean isIsDiscreteOutPort();

	/**
	 * Returns the value of the '<em><b>Is Discrete In Out Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the discrete port is an IN OUT port
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Discrete In Out Port</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDiscretePort_IsDiscreteInOutPort()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.receiverMessageTypes ->size() >= 1 and self.senderMessageTypes ->size() >= 1'"
	 * @generated
	 */
	boolean isIsDiscreteInOutPort();

	/**
	 * Returns the value of the '<em><b>Multi Port</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the port is a multi port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Port</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDiscretePort_MultiPort()
	 * @model default="" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.multi'"
	 * @generated
	 */
	boolean isMultiPort();

	/**
	 * Returns the value of the '<em><b>Coordination Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derives the coordinationProtocol of the refined port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDiscretePort_CoordinationProtocol()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if refinedRole.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\trefinedRole.coordinationProtocol.oclIsKindOf(protocol::CoordinationProtocol).oclAsType(protocol::CoordinationProtocol)\r\nendif\r\n\r\n\r\n'"
	 * @generated
	 */
	CoordinationProtocol getCoordinationProtocol();

} // DiscretePort
