/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.model.pattern.DiscreteInteractionPoint;
import de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getRefines <em>Refines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#isIsDiscreteInPort <em>Is Discrete In Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#isIsDiscreteOutPort <em>Is Discrete Out Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#isIsDiscreteInOutPort <em>Is Discrete In Out Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getDiscretePort()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOneMessageInterface DiscretePortRequiresBehavior DiscretePortAtStructuredComponentHasNoBehavior DiscretePortRequiresRole DiscretePortAndRoleSameMessageInterface MultiPortMustRefineMultiRole'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtLeastOneMessageInterface='self.oclIsTypeOf(component::DiscretePort) implies (not (self.senderMessageInterface.oclIsUndefined() and self.receiverMessageInterface.oclIsUndefined()))' DiscretePortRequiresBehavior='-- this also holds for a hybrid port, ports of structured components do not require a behavior\r\n(not self.component.oclIsUndefined() and self.component.oclIsTypeOf(component::AtomicComponent))\r\n\timplies not self.behavior.oclIsUndefined()' DiscretePortAtStructuredComponentHasNoBehavior='(not self.component.oclIsUndefined() and self.component.oclIsTypeOf(component::StructuredComponent))\n\timplies self.behavior.oclIsUndefined()' DiscretePortRequiresRole='self.oclIsTypeOf(component::DiscretePort) implies not self.refines.oclIsUndefined()' DiscretePortAndRoleSameMessageInterface='not self.refines.oclIsUndefined() implies\n\t(self.senderMessageInterface = self.refines.senderMessageInterface\n\t and\n\t self.receiverMessageInterface = self.refines.receiverMessageInterface\n\t)' MultiPortMustRefineMultiRole='if not (self.refines.oclIsUndefined() and self.refines.cardinality.oclIsUndefined() and self.refines.cardinality.upperBound.oclIsUndefined()) then\r\n       self.isMultiPort implies self.refines.isMultiRole\r\nelse\r\n\ttrue\r\nendif'"
 * @generated
 */
public interface DiscretePort extends Port, DiscreteInteractionPoint {
	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role of a coordination pattern that this port refines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refines</em>' reference.
	 * @see #setRefines(Role)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getDiscretePort_Refines()
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#getPort
	 * @model opposite="port"
	 * @generated
	 */
	Role getRefines();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getRefines <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' reference.
	 * @see #getRefines()
	 * @generated
	 */
	void setRefines(Role value);

	/**
	 * Returns the value of the '<em><b>Is Discrete In Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the discrete port is an IN port
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Discrete In Port</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getDiscretePort_IsDiscreteInPort()
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getDiscretePort_IsDiscreteOutPort()
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getDiscretePort_IsDiscreteInOutPort()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.receiverMessageTypes ->size() >= 1 and self.senderMessageTypes ->size() >= 1'"
	 * @generated
	 */
	boolean isIsDiscreteInOutPort();

	/**
	 * Returns the value of the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derived properties of the refined role regarding the receiver message buffers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Message Buffer</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getDiscretePort_ReceiverMessageBuffer()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.refines.receiverMessageBuffer'"
	 * @generated
	 */
	EList<MessageBuffer> getReceiverMessageBuffer();

} // DiscretePort
