/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.protocol;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint;
import de.uni_paderborn.fujaba.muml.types.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a role of a coordination protocol.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.Role#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.Role#getPort <em>Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.Role#getRoleConnector <em>Role Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.Role#isMultiRole <em>Multi Role</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.Role#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getRole()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RoleRequiresBehavior RoleRequiresMessageTypes ReceiverRoleRequiresMessageBuffer ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL RoleRequiresBehavior='not self.behavior.oclIsUndefined()' RoleRequiresMessageTypes='self.senderMessageTypes->notEmpty() or self.receiverMessageTypes->notEmpty()' ReceiverRoleRequiresMessageBuffer='self.receiverMessageTypes->notEmpty() \r\nimplies \r\nself.receiverMessageBuffer->notEmpty()' ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer='-- Each receiver message type should be assigned to exactly one buffer\r\nself.receiverMessageTypes->forAll(type | self.receiverMessageBuffer->one(messageType->includes(type)))'"
 * @generated
 */
public interface Role extends DiscreteInteractionEndpoint, DataType {
	/**
	 * Returns the value of the '<em><b>Coordination Protocol</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination protocol this role belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol</em>' container reference.
	 * @see #setCoordinationProtocol(CoordinationProtocol)
	 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getRole_CoordinationProtocol()
	 * @see de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol#getRoles
	 * @model opposite="roles" required="true" transient="false"
	 * @generated
	 */
	CoordinationProtocol getCoordinationProtocol();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.protocol.Role#getCoordinationProtocol <em>Coordination Protocol</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Protocol</em>' container reference.
	 * @see #getCoordinationProtocol()
	 * @generated
	 */
	void setCoordinationProtocol(CoordinationProtocol value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.component.DiscretePort}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.component.DiscretePort#getRefinedRole <em>Refined Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ports this role is assigned to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getRole_Port()
	 * @see de.uni_paderborn.fujaba.muml.component.DiscretePort#getRefinedRole
	 * @model opposite="refinedRole"
	 * @generated
	 */
	EList<DiscretePort> getPort();

	/**
	 * Returns the value of the '<em><b>Role Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.protocol.RoleConnector#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role connector that connects this role with another role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Connector</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getRole_RoleConnector()
	 * @see de.uni_paderborn.fujaba.muml.protocol.RoleConnector#getRoles
	 * @model opposite="roles" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectors->any(c | c.oclIsKindOf(RoleConnector)).oclAsType(RoleConnector)'"
	 * @generated
	 */
	RoleConnector getRoleConnector();

	/**
	 * Returns the value of the '<em><b>Multi Role</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the role is a multi role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Role</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getRole_MultiRole()
	 * @model default="" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not (self.cardinality.oclIsUndefined()) then\r\n\t(self.cardinality.upperBound.value > 1) or self.cardinality.upperBound.infinity\r\nelse\r\n\tfalse\r\nendif'"
	 * @generated
	 */
	boolean isMultiRole();

	/**
	 * Returns the value of the '<em><b>Receiver Message Buffer</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.protocol.MessageBuffer}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.protocol.MessageBuffer#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A role contains message buffers to store received messages. If this role can only send messages then no message buffer is allowed; otherwise at least one message buffer must be defined. The maximal number of message buffers is limited to the number of message this role may receive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Message Buffer</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getRole_ReceiverMessageBuffer()
	 * @see de.uni_paderborn.fujaba.muml.protocol.MessageBuffer#getRole
	 * @model opposite="role" containment="true"
	 * @generated
	 */
	EList<MessageBuffer> getReceiverMessageBuffer();

} // Role
