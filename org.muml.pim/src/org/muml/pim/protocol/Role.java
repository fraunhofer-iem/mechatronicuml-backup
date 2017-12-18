/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.protocol;

import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.types.DataType;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.protocol.Role#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 *   <li>{@link org.muml.pim.protocol.Role#getRoleConnector <em>Role Connector</em>}</li>
 *   <li>{@link org.muml.pim.protocol.Role#isMultiRole <em>Multi Role</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.protocol.ProtocolPackage#getRole()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RoleRequiresBehavior RoleRequiresMessageTypes MultiRoleRequiresSubroleBehaviorAndCoordinatorBehavior'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL RoleRequiresBehavior='-- Role requires behavior\nnot self.behavior.oclIsUndefined()' RoleRequiresMessageTypes='-- Role requires message types to be set\nself.senderMessageTypes-&gt;notEmpty() or self.receiverMessageTypes-&gt;notEmpty()' MultiRoleRequiresSubroleBehaviorAndCoordinatorBehavior='-- A multiport requires that either all messages in the RTSCs use one-to-many communication schemata or that the references coordinatorBehavior and subroleBehavior are set.\r\n(not self.behavior.oclAsType(realtimestatechart::RealtimeStatechart).usesOneToManyCommunicationSchemata implies self.multiRole = not self.coordinatorBehavior.oclIsUndefined())\r\nand self.coordinatorBehavior.oclIsUndefined() = self.subroleBehavior.oclIsUndefined()'"
 * @generated
 */
public interface Role extends DiscreteInteractionEndpoint, DataType {
	/**
	 * Returns the value of the '<em><b>Coordination Protocol</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.protocol.AbstractCoordinationSpecification#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination protocol this role belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol</em>' container reference.
	 * @see #setCoordinationProtocol(AbstractCoordinationSpecification)
	 * @see org.muml.pim.protocol.ProtocolPackage#getRole_CoordinationProtocol()
	 * @see org.muml.pim.protocol.AbstractCoordinationSpecification#getRoles
	 * @model opposite="roles" required="true" transient="false"
	 * @generated
	 */
	AbstractCoordinationSpecification getCoordinationProtocol();

	/**
	 * Sets the value of the '{@link org.muml.pim.protocol.Role#getCoordinationProtocol <em>Coordination Protocol</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Protocol</em>' container reference.
	 * @see #getCoordinationProtocol()
	 * @generated
	 */
	void setCoordinationProtocol(AbstractCoordinationSpecification value);

	/**
	 * Returns the value of the '<em><b>Role Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.protocol.RoleConnector#getRoles <em>Roles</em>}'.
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
	 * @see org.muml.pim.protocol.ProtocolPackage#getRole_RoleConnector()
	 * @see org.muml.pim.protocol.RoleConnector#getRoles
	 * @model opposite="roles" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectors-&gt;any(c | c.oclIsKindOf(RoleConnector)).oclAsType(RoleConnector)'"
	 * @generated
	 */
	RoleConnector getRoleConnector();

	/**
	 * Returns the value of the '<em><b>Multi Role</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the role is a multi role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Role</em>' attribute.
	 * @see org.muml.pim.protocol.ProtocolPackage#getRole_MultiRole()
	 * @model default="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.multi'"
	 * @generated
	 */
	boolean isMultiRole();

} // Role
