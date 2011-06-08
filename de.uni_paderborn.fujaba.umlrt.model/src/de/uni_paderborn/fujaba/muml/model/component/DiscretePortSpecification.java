/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import de.uni_paderborn.fujaba.muml.model.core.AdaptationBehavior;
import de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;

import de.uni_paderborn.fujaba.muml.model.pattern.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Port Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a concrete port specification which provides the discrete functionality of a port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePortSpecification#getRefines <em>Refines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePortSpecification#getSenderMessageInterface <em>Sender Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePortSpecification#getReceiverMessageInterface <em>Receiver Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePortSpecification#getEventQueueSize <em>Event Queue Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePortSpecification#getAdaptationBehavior <em>Adaptation Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getDiscretePortSpecification()
 * @model
 * @generated
 */
public interface DiscretePortSpecification extends PortSpecification, BehavioralElement {
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getDiscretePortSpecification_Refines()
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#getPort
	 * @model opposite="port"
	 * @generated
	 */
	Role getRefines();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePortSpecification#getRefines <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' reference.
	 * @see #getRefines()
	 * @generated
	 */
	void setRefines(Role value);

	/**
	 * Returns the value of the '<em><b>Sender Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This association stores the required message interface of this port. The required message interface defines which messages are allowed to be sent by this port.
	 * \todosd{Uwe and my oponion: rename to senderMessageInterface}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender Message Interface</em>' reference.
	 * @see #setSenderMessageInterface(MessageInterface)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getDiscretePortSpecification_SenderMessageInterface()
	 * @model
	 * @generated
	 */
	MessageInterface getSenderMessageInterface();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePortSpecification#getSenderMessageInterface <em>Sender Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Message Interface</em>' reference.
	 * @see #getSenderMessageInterface()
	 * @generated
	 */
	void setSenderMessageInterface(MessageInterface value);

	/**
	 * Returns the value of the '<em><b>Receiver Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This association stores the provided message interface of this port. The provided message interface defines which messages are allowed to be received by this port.
	 * \todosd{Uwe and my oponion: rename to receiverMessageInterface}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Message Interface</em>' reference.
	 * @see #setReceiverMessageInterface(MessageInterface)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getDiscretePortSpecification_ReceiverMessageInterface()
	 * @model
	 * @generated
	 */
	MessageInterface getReceiverMessageInterface();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePortSpecification#getReceiverMessageInterface <em>Receiver Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Message Interface</em>' reference.
	 * @see #getReceiverMessageInterface()
	 * @generated
	 */
	void setReceiverMessageInterface(MessageInterface value);

	/**
	 * Returns the value of the '<em><b>Event Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of the event queue of this port. It defines the maximum number of events
	 * that may be temporarily buffered by the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Queue Size</em>' attribute.
	 * @see #setEventQueueSize(int)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getDiscretePortSpecification_EventQueueSize()
	 * @model
	 * @generated
	 */
	int getEventQueueSize();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePortSpecification#getEventQueueSize <em>Event Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Queue Size</em>' attribute.
	 * @see #getEventQueueSize()
	 * @generated
	 */
	void setEventQueueSize(int value);

	/**
	 * Returns the value of the '<em><b>Adaptation Behavior</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.core.AdaptationBehavior#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptation Behavior</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptation Behavior</em>' container reference.
	 * @see #setAdaptationBehavior(AdaptationBehavior)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getDiscretePortSpecification_AdaptationBehavior()
	 * @see de.uni_paderborn.fujaba.muml.model.core.AdaptationBehavior#getPort
	 * @model opposite="port" transient="false"
	 * @generated
	 */
	AdaptationBehavior getAdaptationBehavior();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePortSpecification#getAdaptationBehavior <em>Adaptation Behavior</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adaptation Behavior</em>' container reference.
	 * @see #getAdaptationBehavior()
	 * @generated
	 */
	void setAdaptationBehavior(AdaptationBehavior value);

} // DiscretePortSpecification
