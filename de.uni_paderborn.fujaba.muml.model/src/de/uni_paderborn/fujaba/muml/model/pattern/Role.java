/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.storydriven.modeling.NamedElement;

import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.core.Cardinality;
import de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a role of a coordination pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getIncomingRoleConnector <em>Incoming Role Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getSenderMessageInterface <em>Sender Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getReceiverMessageInterface <em>Receiver Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getPort <em>Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getAdaptationBehavior <em>Adaptation Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getRoleAndAdaptationBehavior <em>Role And Adaptation Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getOrderVariable <em>Order Variable</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getOutgoingRoleConnector <em>Outgoing Role Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getRoleConnector <em>Role Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OrderOnlyForMultiPort OrderedRequiresIntegerOrderVariable RoleHasConnector'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OrderOnlyForMultiPort='self.ordered implies (self.cardinality.upperBound.value > 1 or self.cardinality.upperBound.infinity)' OrderedRequiresIntegerOrderVariable='self.ordered implies (self.orderVariable->notEmpty() implies self.orderVariable.eAttributeType =\'EInt\')' RoleHasConnector='self.incomingRoleConnector->notEmpty() or self.outgoingRoleConnector->notEmpty()'"
 * @generated
 */
public interface Role extends NamedElement, ConstrainableElement, BehavioralElement {
	/**
	 * Returns the value of the '<em><b>Incoming Role Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The incoming RoleConnector, which connects this role with another role.
	 * Either incomingRoleConnector or outgoingRoleConnector (or both) must be set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Role Connector</em>' reference.
	 * @see #setIncomingRoleConnector(RoleConnector)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_IncomingRoleConnector()
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	RoleConnector getIncomingRoleConnector();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getIncomingRoleConnector <em>Incoming Role Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Role Connector</em>' reference.
	 * @see #getIncomingRoleConnector()
	 * @generated
	 */
	void setIncomingRoleConnector(RoleConnector value);

	/**
	 * Returns the value of the '<em><b>Role Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Connector</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_RoleConnector()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.incomingConnector -> notEmpty() then\r\n\tself.incomingConnector\r\nelse\r\n\tself.outgoingConnector\r\nEndif'"
	 * @generated
	 */
	RoleConnector getRoleConnector();

	/**
	 * Returns the value of the '<em><b>Coordination Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination pattern this role belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Pattern</em>' container reference.
	 * @see #setCoordinationPattern(CoordinationPattern)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_CoordinationPattern()
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getRoles
	 * @model opposite="roles" required="true" transient="false"
	 * @generated
	 */
	CoordinationPattern getCoordinationPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getCoordinationPattern <em>Coordination Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Pattern</em>' container reference.
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	void setCoordinationPattern(CoordinationPattern value);

	/**
	 * Returns the value of the '<em><b>Sender Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sender message interface defines which messages this port sends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender Message Interface</em>' reference.
	 * @see #setSenderMessageInterface(MessageInterface)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_SenderMessageInterface()
	 * @model
	 * @generated
	 */
	MessageInterface getSenderMessageInterface();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getSenderMessageInterface <em>Sender Message Interface</em>}' reference.
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
	 * The receiver message interface defines which messages this port receives.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Message Interface</em>' reference.
	 * @see #setReceiverMessageInterface(MessageInterface)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_ReceiverMessageInterface()
	 * @model
	 * @generated
	 */
	MessageInterface getReceiverMessageInterface();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getReceiverMessageInterface <em>Receiver Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Message Interface</em>' reference.
	 * @see #getReceiverMessageInterface()
	 * @generated
	 */
	void setReceiverMessageInterface(MessageInterface value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A role has a cardinality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ports this role is assigned to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_Port()
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getRefines
	 * @model opposite="refines"
	 * @generated
	 */
	EList<DiscretePort> getPort();

	/**
	 * Returns the value of the '<em><b>Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The adaptation behavior of this role. Note that only multi-ports have an adaptation behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adaptation Behavior</em>' reference.
	 * @see #setAdaptationBehavior(Behavior)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_AdaptationBehavior()
	 * @model
	 * @generated
	 */
	Behavior getAdaptationBehavior();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getAdaptationBehavior <em>Adaptation Behavior</em>}' reference.
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_RoleAndAdaptationBehavior()
	 * @model
	 * @generated
	 */
	Behavior getRoleAndAdaptationBehavior();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getRoleAndAdaptationBehavior <em>Role And Adaptation Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role And Adaptation Behavior</em>' reference.
	 * @see #getRoleAndAdaptationBehavior()
	 * @generated
	 */
	void setRoleAndAdaptationBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute marks a multi-role as being ordered. In an ordered multi-role, one of the contained integer attributes is used to define the order. Then, the instances of the multi-role are numbered from 1 to n for n instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(boolean)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_Ordered()
	 * @model
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#isOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Order Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute defines the order on the instances of the multi-role. It must be defined in the real-time statechart of this role and it must be of type integer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Variable</em>' reference.
	 * @see #setOrderVariable(EAttribute)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_OrderVariable()
	 * @model
	 * @generated
	 */
	EAttribute getOrderVariable();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getOrderVariable <em>Order Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Variable</em>' reference.
	 * @see #getOrderVariable()
	 * @generated
	 */
	void setOrderVariable(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Outgoing Role Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Role Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outgoing RoleConnector, which connects this role with another role.
	 * Either incomingRoleConnector or outgoingRoleConnector (or both) must be set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Role Connector</em>' reference.
	 * @see #setOutgoingRoleConnector(RoleConnector)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRole_OutgoingRoleConnector()
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getSource
	 * @model opposite="source"
	 * @generated
	 */
	RoleConnector getOutgoingRoleConnector();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getOutgoingRoleConnector <em>Outgoing Role Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Role Connector</em>' reference.
	 * @see #getOutgoingRoleConnector()
	 * @generated
	 */
	void setOutgoingRoleConnector(RoleConnector value);

} // Role
