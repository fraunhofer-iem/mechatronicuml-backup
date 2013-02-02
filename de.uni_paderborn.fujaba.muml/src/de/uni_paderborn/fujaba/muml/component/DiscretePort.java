/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.protocol.MessageBuffer;
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
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DiscretePort#getRefines <em>Refines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DiscretePort#isIsDiscreteInPort <em>Is Discrete In Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DiscretePort#isIsDiscreteOutPort <em>Is Discrete Out Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DiscretePort#isIsDiscreteInOutPort <em>Is Discrete In Out Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DiscretePort#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DiscretePort#isMultiPort <em>Multi Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DiscretePort#getGmfProtocol <em>Gmf Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDiscretePort()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOneMessageType DiscretePortAndRoleSameMessageTypes DiscretePortRequiresBehavior DiscretePortAtStructuredComponentHasNoBehavior DiscretePortRequiresRole MultiPortMustRefineMultiRole'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtLeastOneMessageType='not self.senderMessageTypes->isEmpty() or not self.receiverMessageTypes->isEmpty()' DiscretePortRequiresBehavior='-- this also holds for a hybrid port, ports of structured components do not require a behavior\r\n(not self.component.oclIsUndefined() and self.component.oclIsTypeOf(component::AtomicComponent))\r\n\timplies not self.behavior.oclIsUndefined()' DiscretePortAtStructuredComponentHasNoBehavior='(not self.component.oclIsUndefined() and self.component.oclIsTypeOf(component::StructuredComponent))\n\timplies self.behavior.oclIsUndefined()' DiscretePortRequiresRole='self.oclIsTypeOf(component::DiscretePort) implies not self.refines.oclIsUndefined()' DiscretePortAndRoleSameMessageTypes='not self.refines.oclIsUndefined() implies\n\t(self.senderMessageTypes = self.refines.senderMessageTypes\n\t and\n\t self.receiverMessageTypes = self.refines.receiverMessageTypes\n\t)' MultiPortMustRefineMultiRole='if not (self.refines.oclIsUndefined() and self.refines.cardinality.oclIsUndefined() and self.refines.cardinality.upperBound.oclIsUndefined()) then\r\n       self.multiPort implies self.refines.multiRole\r\nelse\r\n\ttrue\r\nendif'"
 * @generated
 */
public interface DiscretePort extends Port, DiscreteInteractionEndpoint {
	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.protocol.Role#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role of a coordination pattern that this port refines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refines</em>' reference.
	 * @see #setRefines(Role)
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDiscretePort_Refines()
	 * @see de.uni_paderborn.fujaba.muml.protocol.Role#getPort
	 * @model opposite="port"
	 * @generated
	 */
	Role getRefines();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.component.DiscretePort#getRefines <em>Refines</em>}' reference.
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
	 * Returns the value of the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.protocol.MessageBuffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derived properties of the refined role regarding the receiver message buffers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Message Buffer</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDiscretePort_ReceiverMessageBuffer()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.refines.receiverMessageBuffer'"
	 * @generated
	 */
	EList<MessageBuffer> getReceiverMessageBuffer();

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
	 * @model default="" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not (self.cardinality.oclIsUndefined()) then\r\n\t(self.cardinality.upperBound.value > 1) or self.cardinality.upperBound.infinity\r\nelse\r\n\tfalse\r\nendif\r\n\r\n'"
	 * @generated
	 */
	boolean isMultiPort();

	/**
	 * Returns the value of the '<em><b>Gmf Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference is needed by GMF to visualize the connection from the discrete port to the coordination protocol within the structured component editor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gmf Protocol</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDiscretePort_GmfProtocol()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if refines.oclIsUndefined() then\n\tnull\nelse\n\trefines.coordinationProtocol\nendif'"
	 * @generated
	 */
	CoordinationProtocol getGmfProtocol();

} // DiscretePort
