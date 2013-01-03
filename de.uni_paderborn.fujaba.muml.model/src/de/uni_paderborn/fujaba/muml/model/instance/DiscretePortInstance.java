/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import de.uni_paderborn.fujaba.muml.model.connector.DiscreteInteractionEndpointInstance;
import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.model.msgtype.MessageType;
import de.uni_paderborn.fujaba.muml.model.protocol.MessageBuffer;
import de.uni_paderborn.fujaba.muml.model.protocol.Role;


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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getReceiverMessageTypes <em>Receiver Message Types</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getSenderMessageTypes <em>Sender Message Types</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getRefines <em>Refines</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDiscretePortInstance()
 * @model abstract="true"
 * @generated
 */
public interface DiscretePortInstance extends PortInstance, DiscreteInteractionEndpointInstance {

	/**
	 * Returns the value of the '<em><b>Receiver Message Types</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.msgtype.MessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The receiver message interface defines which messages this port instance receives
	 * It is derived from the receiver message interface of its port.
	 * \todosd{ocl: implement derived}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Message Types</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDiscretePortInstance_ReceiverMessageTypes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if portType.oclIsUndefined() or not portType.oclIsKindOf(component::DiscretePort) then\r\n\tOrderedSet { }\r\nelse\r\n\tportType.oclAsType(component::DiscretePort).receiverMessageTypes\r\nendif'"
	 * @generated
	 */
	EList<MessageType> getReceiverMessageTypes();

	/**
	 * Returns the value of the '<em><b>Sender Message Types</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.msgtype.MessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sender message interface defines which messages this port instance sends.
	 * It is derived from the sender message interface of its port.
	 * \todosd{ocl: implement derived}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender Message Types</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDiscretePortInstance_SenderMessageTypes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if portType.oclIsUndefined() or not portType.oclIsKindOf(component::DiscretePort) then\r\n\tOrderedSet { }\r\nelse\r\n\tportType.oclAsType(component::DiscretePort).senderMessageTypes\r\nendif'"
	 * @generated
	 */
	EList<MessageType> getSenderMessageTypes();

	/**
	 * Returns the value of the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.protocol.MessageBuffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derived properties of the refined role regarding the receiver message buffers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Message Buffer</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDiscretePortInstance_ReceiverMessageBuffer()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.refines.receiverMessageBuffer'"
	 * @generated
	 */
	EList<MessageBuffer> getReceiverMessageBuffer();

	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role of a coordination pattern that the port type of this port instance refines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refines</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDiscretePortInstance_Refines()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.portType.oclAsType(component::DiscretePort).refines'"
	 * @generated
	 */
	Role getRefines();
} // DiscretePortInstance
