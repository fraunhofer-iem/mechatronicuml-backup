/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.protocol;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.connector.Connector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a communication channel for asynchronous messages connecting two roles of a coordination protocol.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.protocol.RoleConnector#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 *   <li>{@link org.muml.pim.protocol.RoleConnector#getConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}</li>
 *   <li>{@link org.muml.pim.protocol.RoleConnector#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.protocol.ProtocolPackage#getRoleConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyRolesOfSameCoordinationProtocol'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OnlyRolesOfSameCoordinationProtocol='-- Role connector must not connect roles at different coordination protocols\r\nif self.coordinationProtocol.roles-&gt;oclIsUndefined() then \r\ntrue\r\nelse\r\nself.coordinationProtocol.roles = self.roles\r\nendif'"
 * @generated
 */
public interface RoleConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Coordination Protocol</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.protocol.AbstractCoordinationSpecification#getRoleConnector <em>Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination protocol this role connector is part of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol</em>' container reference.
	 * @see #setCoordinationProtocol(AbstractCoordinationSpecification)
	 * @see org.muml.pim.protocol.ProtocolPackage#getRoleConnector_CoordinationProtocol()
	 * @see org.muml.pim.protocol.AbstractCoordinationSpecification#getRoleConnector
	 * @model opposite="roleConnector" required="true" transient="false"
	 * @generated
	 */
	AbstractCoordinationSpecification getCoordinationProtocol();

	/**
	 * Sets the value of the '{@link org.muml.pim.protocol.RoleConnector#getCoordinationProtocol <em>Coordination Protocol</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Protocol</em>' container reference.
	 * @see #getCoordinationProtocol()
	 * @generated
	 */
	void setCoordinationProtocol(AbstractCoordinationSpecification value);

	/**
	 * Returns the value of the '<em><b>Connector Quality Of Service Assumptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A role connector has exactly one reference for defining its quality of service assumptions like message delay and message loss.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Quality Of Service Assumptions</em>' containment reference.
	 * @see #setConnectorQualityOfServiceAssumptions(ConnectorQualityOfServiceAssumptions)
	 * @see org.muml.pim.protocol.ProtocolPackage#getRoleConnector_ConnectorQualityOfServiceAssumptions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectorQualityOfServiceAssumptions getConnectorQualityOfServiceAssumptions();

	/**
	 * Sets the value of the '{@link org.muml.pim.protocol.RoleConnector#getConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Quality Of Service Assumptions</em>' containment reference.
	 * @see #getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	void setConnectorQualityOfServiceAssumptions(ConnectorQualityOfServiceAssumptions value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.protocol.Role}.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.protocol.Role#getRoleConnector <em>Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The two roles that are connected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.muml.pim.protocol.ProtocolPackage#getRoleConnector_Roles()
	 * @see org.muml.pim.protocol.Role#getRoleConnector
	 * @model opposite="roleConnector" lower="2" upper="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints-&gt;select(e | e.oclIsKindOf(Role)).oclAsType(Role)-&gt;asOrderedSet()'"
	 * @generated
	 */
	EList<Role> getRoles();

} // RoleConnector
