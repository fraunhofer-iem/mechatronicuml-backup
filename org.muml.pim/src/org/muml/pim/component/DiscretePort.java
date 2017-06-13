/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component;

import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.pim.protocol.Role;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.component.DiscretePort#getRefinedRole <em>Refined Role</em>}</li>
 *   <li>{@link org.muml.pim.component.DiscretePort#isIsDiscreteInPort <em>Is Discrete In Port</em>}</li>
 *   <li>{@link org.muml.pim.component.DiscretePort#isIsDiscreteOutPort <em>Is Discrete Out Port</em>}</li>
 *   <li>{@link org.muml.pim.component.DiscretePort#isIsDiscreteInOutPort <em>Is Discrete In Out Port</em>}</li>
 *   <li>{@link org.muml.pim.component.DiscretePort#isMultiPort <em>Multi Port</em>}</li>
 *   <li>{@link org.muml.pim.component.DiscretePort#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.component.ComponentPackage#getDiscretePort()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DiscretePortRequiresMessageTypes DiscretePortAndRoleSameMessageTypes DiscretePortRequiresBehavior DiscretePortAtStructuredComponentHasNoBehavior DiscretePortShouldRefineRole DiscretePortCardinalityMustComplyWithRefinedRoleCardinality MultiPortOfAtomicComponentRequiresSubroleBehaviorAndCoordinatorBehavior'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL DiscretePortRequiresMessageTypes='-- Discrete Port must define sender or receiver message types\nself.senderMessageTypes->notEmpty() or self.receiverMessageTypes->notEmpty()' DiscretePortRequiresBehavior='-- A discrete port of an atomic component must have a Behavior Specification\r\n(not self.component.oclIsUndefined() and self.component.oclIsKindOf(component::AtomicComponent))\r\n\timplies not self.behavior.oclIsUndefined()' DiscretePortAtStructuredComponentHasNoBehavior='-- Discrete Port at Structured Component must not have behavior\n(not self.component.oclIsUndefined() and self.component.oclIsKindOf(component::StructuredComponent))\n\timplies self.behavior.oclIsUndefined()' DiscretePortShouldRefineRole='-- @warning\n-- Discrete Port should refine a role\nself.oclIsKindOf(component::DiscretePort) implies not self.refinedRole.oclIsUndefined()' DiscretePortAndRoleSameMessageTypes='-- Discrete Port must have the same message types as its refined role\r\nnot self.refinedRole.oclIsUndefined() implies\r\n\t(self.senderMessageTypes->asSet() = self.refinedRole.senderMessageTypes->asSet() \r\n\t and\r\n\t self.receiverMessageTypes->asSet() = self.refinedRole.receiverMessageTypes->asSet() \r\n\t)' DiscretePortCardinalityMustComplyWithRefinedRoleCardinality='-- Cardinality of discrete port and its refined role must match\r\n((not self.cardinality.oclIsUndefined()) and (not self.refinedRole.oclIsUndefined())) \r\nimplies \r\n((not self.multi) or self.cardinality.lowerBound.greaterOrEqual(self.refinedRole.cardinality.lowerBound) and self.cardinality.upperBound.lessOrEqual(self.refinedRole.cardinality.upperBound))' MultiPortOfAtomicComponentRequiresSubroleBehaviorAndCoordinatorBehavior='-- A multiport requires that either all messages in the RTSCs use one-to-many communication schemata or that the references coordinatorBehavior and subroleBehavior are set.\r\n(not self.behavior.oclAsType(realtimestatechart::RealtimeStatechart).usesOneToManyCommunicationSchemata implies (self.multiPort and self.component.oclIsKindOf(AtomicComponent)) = not self.coordinatorBehavior.oclIsUndefined())\r\nand self.coordinatorBehavior.oclIsUndefined() = self.subroleBehavior.oclIsUndefined()'"
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
	 * @see org.muml.pim.component.ComponentPackage#getDiscretePort_RefinedRole()
	 * @model
	 * @generated
	 */
	Role getRefinedRole();

	/**
	 * Sets the value of the '{@link org.muml.pim.component.DiscretePort#getRefinedRole <em>Refined Role</em>}' reference.
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
	 * @see org.muml.pim.component.ComponentPackage#getDiscretePort_IsDiscreteInPort()
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
	 * @see org.muml.pim.component.ComponentPackage#getDiscretePort_IsDiscreteOutPort()
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
	 * @see org.muml.pim.component.ComponentPackage#getDiscretePort_IsDiscreteInOutPort()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.receiverMessageTypes ->size() >= 1 and self.senderMessageTypes ->size() >= 1'"
	 * @generated
	 */
	boolean isIsDiscreteInOutPort();

	/**
	 * Returns the value of the '<em><b>Multi Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the port is a multi port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Port</em>' attribute.
	 * @see org.muml.pim.component.ComponentPackage#getDiscretePort_MultiPort()
	 * @model default="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
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
	 * @see org.muml.pim.component.ComponentPackage#getDiscretePort_CoordinationProtocol()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if refinedRole.oclIsUndefined() or not refinedRole.coordinationProtocol.oclIsKindOf(protocol::CoordinationProtocol) then\r\n\tnull\r\nelse\r\n\trefinedRole.coordinationProtocol.oclAsType(protocol::CoordinationProtocol)\r\nendif\r\n\r\n\r\n'"
	 * @generated
	 */
	CoordinationProtocol getCoordinationProtocol();

} // DiscretePort
