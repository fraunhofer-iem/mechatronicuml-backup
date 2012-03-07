/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;


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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getReceiverMessageInterface <em>Receiver Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance#getSenderMessageInterface <em>Sender Message Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDiscretePortInstance()
 * @model abstract="true"
 * @generated
 */
public interface DiscretePortInstance extends PortInstance {

	/**
	 * Returns the value of the '<em><b>Receiver Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The receiver message interface defines which messages this port instance receives
	 * It is derived from the receiver message interface of its port.
	 * \todosd{ocl: implement derived}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Message Interface</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDiscretePortInstance_ReceiverMessageInterface()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if portType.oclIsUndefined() or not portType.oclIsKindOf(component::DiscretePort) then\n\tnull\nelse\n\tportType.oclAsType(component::DiscretePort).receiverMessageInterface\nendif'"
	 * @generated
	 */
	MessageInterface getReceiverMessageInterface();

	/**
	 * Returns the value of the '<em><b>Sender Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sender message interface defines which messages this port instance sends.
	 * It is derived from the sender message interface of its port.
	 * \todosd{ocl: implement derived}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender Message Interface</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDiscretePortInstance_SenderMessageInterface()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if portType.oclIsUndefined() or not portType.oclIsKindOf(component::DiscretePort) then\n\tnull\nelse\n\tportType.oclAsType(component::DiscretePort).senderMessageInterface\nendif'"
	 * @generated
	 */
	MessageInterface getSenderMessageInterface();
} // DiscretePortInstance
