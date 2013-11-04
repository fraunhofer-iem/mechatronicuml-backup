/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.protocol;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.Role#getRoleConnector <em>Role Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.Role#isMultiRole <em>Multi Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getRole()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RoleRequiresBehavior RoleRequiresMessageTypes ReceiverRoleRequiresMessageBuffer ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer MultiRoleRequiresRoleAndAdaptationBehavior'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL RoleRequiresBehavior='not self.behavior.oclIsUndefined()' RoleRequiresMessageTypes='self.senderMessageTypes->notEmpty() or self.receiverMessageTypes->notEmpty()' ReceiverRoleRequiresMessageBuffer='self.receiverMessageTypes->notEmpty() \r\nimplies \r\nself.receiverMessageBuffer->notEmpty()' ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer='-- Each receiver message type should be assigned to exactly one buffer\r\nself.receiverMessageTypes->forAll(type | self.receiverMessageBuffer->one(messageType->includes(type)))' MultiRoleRequiresRoleAndAdaptationBehavior='self.multiRole implies \r\n((not self.adaptationBehavior.oclIsUndefined()) and (not self.roleAndAdaptationBehavior.oclIsUndefined()))'"
 * @generated
 */
public interface Role extends DiscreteInteractionEndpoint, DataType {
	/**
	 * Returns the value of the '<em><b>Coordination Protocol</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination protocol this role belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol</em>' container reference.
	 * @see #setCoordinationProtocol(AbstractCoordinationSpecification)
	 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getRole_CoordinationProtocol()
	 * @see de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification#getRoles
	 * @model opposite="roles" required="true" transient="false"
	 * @generated
	 */
	AbstractCoordinationSpecification getCoordinationProtocol();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.protocol.Role#getCoordinationProtocol <em>Coordination Protocol</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Protocol</em>' container reference.
	 * @see #getCoordinationProtocol()
	 * @generated
	 */
	void setCoordinationProtocol(AbstractCoordinationSpecification value);

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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.multi'"
	 * @generated
	 */
	boolean isMultiRole();

} // Role
