/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;


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
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDiscretePortInstance()
 * @model abstract="true"
 * @generated
 */
public interface DiscretePortInstance extends PortInstance {

	/**
	 * Returns the value of the '<em><b>Receiver Message Types</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.msgiface.MessageType}.
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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if portType.oclIsUndefined() or not portType.oclIsKindOf(component::DiscretePort) then\r\n\tnull\r\nelse\r\n\tportType.oclAsType(component::DiscretePort).receiverMessageTypes\r\nendif'"
	 * @generated
	 */
	EList<MessageType> getReceiverMessageTypes();

	/**
	 * Returns the value of the '<em><b>Sender Message Types</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.msgiface.MessageType}.
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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if portType.oclIsUndefined() or not portType.oclIsKindOf(component::DiscretePort) then\r\n\tnull\r\nelse\r\n\tportType.oclAsType(component::DiscretePort).senderMessageTypes\r\nendif'"
	 * @generated
	 */
	EList<MessageType> getSenderMessageTypes();
} // DiscretePortInstance
