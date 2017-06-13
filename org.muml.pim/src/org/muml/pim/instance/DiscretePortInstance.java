/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.connector.DiscreteInteractionEndpointInstance;
import org.muml.pim.connector.MessageBuffer;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.protocol.Role;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a discrete port at instance level. At instance level, we 
 * distinguish between single-port instances and multi-port instances by using
 * two subclasses of this abstract class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.instance.DiscretePortInstance#getReceiverMessageTypes <em>Receiver Message Types</em>}</li>
 *   <li>{@link org.muml.pim.instance.DiscretePortInstance#getSenderMessageTypes <em>Sender Message Types</em>}</li>
 *   <li>{@link org.muml.pim.instance.DiscretePortInstance#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}</li>
 *   <li>{@link org.muml.pim.instance.DiscretePortInstance#getRefinedRole <em>Refined Role</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.instance.InstancePackage#getDiscretePortInstance()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL PortTypeIsKindOfDiscretePort='-- The port type of a DiscretePortInstance has to be of kind DiscretePort\n(not self.portType.oclIsUndefined()) implies self.portType.oclIsKindOf(component::DiscretePort)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PortTypeIsKindOfDiscretePort'"
 * @generated
 */
public interface DiscretePortInstance extends PortInstance, DiscreteInteractionEndpointInstance {

	/**
	 * Returns the value of the '<em><b>Receiver Message Types</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.msgtype.MessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The receiver message interface defines which messages this port instance receives
	 * It is derived from the receiver message interface of its port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Message Types</em>' reference list.
	 * @see org.muml.pim.instance.InstancePackage#getDiscretePortInstance_ReceiverMessageTypes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if portType.oclIsUndefined() or not portType.oclIsKindOf(component::DiscretePort) then\r\n\tOrderedSet { }\r\nelse\r\n\tportType.oclAsType(component::DiscretePort).receiverMessageTypes\r\nendif'"
	 * @generated
	 */
	EList<MessageType> getReceiverMessageTypes();

	/**
	 * Returns the value of the '<em><b>Sender Message Types</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.msgtype.MessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sender message interface defines which messages this port instance sends.
	 * It is derived from the sender message interface of its port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender Message Types</em>' reference list.
	 * @see org.muml.pim.instance.InstancePackage#getDiscretePortInstance_SenderMessageTypes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if portType.oclIsUndefined() or not portType.oclIsKindOf(component::DiscretePort) then\r\n\tOrderedSet { }\r\nelse\r\n\tportType.oclAsType(component::DiscretePort).senderMessageTypes\r\nendif'"
	 * @generated
	 */
	EList<MessageType> getSenderMessageTypes();

	/**
	 * Returns the value of the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.connector.MessageBuffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derived properties of the refined role regarding the receiver message buffers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Message Buffer</em>' reference list.
	 * @see org.muml.pim.instance.InstancePackage#getDiscretePortInstance_ReceiverMessageBuffer()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (not self.portType.oclIsUndefined()) and self.portType.oclIsKindOf(component::DiscretePort) then\n\tself.portType.oclAsType(component::DiscretePort).receiverMessageBuffer\nelse\n\tOrderedSet { }\nendif'"
	 * @generated
	 */
	EList<MessageBuffer> getReceiverMessageBuffer();

	/**
	 * Returns the value of the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role of a coordination protocol that the port type of this port instance refines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refined Role</em>' reference.
	 * @see org.muml.pim.instance.InstancePackage#getDiscretePortInstance_RefinedRole()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not self.portType.oclIsUndefined() and self.portType.oclIsKindOf(component::DiscretePort) then\r\n\tself.portType.oclAsType(component::DiscretePort).refinedRole\r\nelse\r\n\tnull\r\nendif'"
	 * @generated
	 */
	Role getRefinedRole();
} // DiscretePortInstance
