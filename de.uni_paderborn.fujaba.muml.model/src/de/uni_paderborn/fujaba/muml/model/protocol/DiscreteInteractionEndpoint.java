/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.protocol;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.model.constraint.ConstrainableElement;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.msgtype.MessageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Interaction Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction point for discrete communication via asynchronous messages. This class generalizes concepts of classes DiscretePort and Role.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.protocol.DiscreteInteractionEndpoint#getSenderMessageTypes <em>Sender Message Types</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.protocol.DiscreteInteractionEndpoint#getReceiverMessageTypes <em>Receiver Message Types</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.protocol.DiscreteInteractionEndpoint#getAdaptationBehavior <em>Adaptation Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.protocol.DiscreteInteractionEndpoint#getRoleAndAdaptationBehavior <em>Role And Adaptation Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage#getDiscreteInteractionEndpoint()
 * @model abstract="true"
 * @generated
 */
public interface DiscreteInteractionEndpoint extends BehavioralElement, ConstrainableElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Sender Message Types</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.msgtype.MessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sender message interface defines which messages this discrete port specification sends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender Message Types</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage#getDiscreteInteractionEndpoint_SenderMessageTypes()
	 * @model
	 * @generated
	 */
	EList<MessageType> getSenderMessageTypes();

	/**
	 * Returns the value of the '<em><b>Receiver Message Types</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.msgtype.MessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The receiver message interface defines which messages this discrete port specification receives.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Message Types</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage#getDiscreteInteractionEndpoint_ReceiverMessageTypes()
	 * @model
	 * @generated
	 */
	EList<MessageType> getReceiverMessageTypes();

	/**
	 * Returns the value of the '<em><b>Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this port is a multi-port, this reference points to the real-time statechart that
	 * contains the adaptation behavior of the multi-port.  Then, this real-time statechart 
	 * is contained in the only state of the real-time statechart we is obtained by the
	 * reference roleAndAdaptationBehavior.
	 * If this port is a single-port, this reference will be undefined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adaptation Behavior</em>' reference.
	 * @see #setAdaptationBehavior(Behavior)
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage#getDiscreteInteractionEndpoint_AdaptationBehavior()
	 * @model
	 * @generated
	 */
	Behavior getAdaptationBehavior();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.protocol.DiscreteInteractionEndpoint#getAdaptationBehavior <em>Adaptation Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adaptation Behavior</em>' reference.
	 * @see #getAdaptationBehavior()
	 * @generated
	 */
	void setAdaptationBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Role And Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this port is a multi-port, this reference points to the real-time statechart that
	 * contains the adaptation behavior and the sub-port behavior. Thus, this real-time
	 * statechart only contains one state which embeds the real-time statecharts
	 * specifying the adaptation behavior and the sub-port behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role And Adaptation Behavior</em>' reference.
	 * @see #setRoleAndAdaptationBehavior(Behavior)
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage#getDiscreteInteractionEndpoint_RoleAndAdaptationBehavior()
	 * @model
	 * @generated
	 */
	Behavior getRoleAndAdaptationBehavior();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.protocol.DiscreteInteractionEndpoint#getRoleAndAdaptationBehavior <em>Role And Adaptation Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role And Adaptation Behavior</em>' reference.
	 * @see #getRoleAndAdaptationBehavior()
	 * @generated
	 */
	void setRoleAndAdaptationBehavior(Behavior value);

} // DiscreteInteractionEndpoint
