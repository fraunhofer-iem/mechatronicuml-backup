/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getSenderMessageInterface <em>Sender Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getReceiverMessageInterface <em>Receiver Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getAdaptationBehavior <em>Adaptation Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getRoleAndAdaptationBehavior <em>Role And Adaptation Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getDiscretePort()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOneMessageInterface'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtLeastOneMessageInterface='not self.senderMessageInterface.oclIsUndefined() or not self.receiverMessageInterface.oclIsUndefined()'"
 * @generated
 */
public interface DiscretePort extends Port, BehavioralElement {
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
	 * Returns the value of the '<em><b>Sender Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sender message interface defines which messages this discrete port specification sends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender Message Interface</em>' reference.
	 * @see #setSenderMessageInterface(MessageInterface)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getDiscretePort_SenderMessageInterface()
	 * @model
	 * @generated
	 */
	MessageInterface getSenderMessageInterface();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getSenderMessageInterface <em>Sender Message Interface</em>}' reference.
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
	 * The receiver message interface defines which messages this discrete port specification receives.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Message Interface</em>' reference.
	 * @see #setReceiverMessageInterface(MessageInterface)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getDiscretePort_ReceiverMessageInterface()
	 * @model
	 * @generated
	 */
	MessageInterface getReceiverMessageInterface();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getReceiverMessageInterface <em>Receiver Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Message Interface</em>' reference.
	 * @see #getReceiverMessageInterface()
	 * @generated
	 */
	void setReceiverMessageInterface(MessageInterface value);

	/**
	 * Returns the value of the '<em><b>Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptation Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptation Behavior</em>' reference.
	 * @see #setAdaptationBehavior(Behavior)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getDiscretePort_AdaptationBehavior()
	 * @model
	 * @generated
	 */
	Behavior getAdaptationBehavior();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getAdaptationBehavior <em>Adaptation Behavior</em>}' reference.
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
	 * <p>
	 * If the meaning of the '<em>Role And Adaptation Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role And Adaptation Behavior</em>' reference.
	 * @see #setRoleAndAdaptationBehavior(Behavior)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getDiscretePort_RoleAndAdaptationBehavior()
	 * @model
	 * @generated
	 */
	Behavior getRoleAndAdaptationBehavior();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getRoleAndAdaptationBehavior <em>Role And Adaptation Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role And Adaptation Behavior</em>' reference.
	 * @see #getRoleAndAdaptationBehavior()
	 * @generated
	 */
	void setRoleAndAdaptationBehavior(Behavior value);

} // DiscretePort
