/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.protocol;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.connector.Connector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a communication channel connecting two roles of a coordination protocol.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.RoleConnector#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.RoleConnector#getConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.RoleConnector#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getRoleConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyRolesOfSameCoordinationProtocol'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OnlyRolesOfSameCoordinationProtocol='if self.coordinationProtocol.roles->oclIsUndefined() then \r\ntrue\r\nelse\r\nself.coordinationProtocol.roles = self.roles\r\nendif'"
 * @generated
 */
public interface RoleConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Coordination Protocol</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol#getRoleConnector <em>Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination protocol this role connector is part of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol</em>' container reference.
	 * @see #setCoordinationProtocol(CoordinationProtocol)
	 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getRoleConnector_CoordinationProtocol()
	 * @see de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol#getRoleConnector
	 * @model opposite="roleConnector" required="true" transient="false"
	 * @generated
	 */
	CoordinationProtocol getCoordinationProtocol();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.protocol.RoleConnector#getCoordinationProtocol <em>Coordination Protocol</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Protocol</em>' container reference.
	 * @see #getCoordinationProtocol()
	 * @generated
	 */
	void setCoordinationProtocol(CoordinationProtocol value);

	/**
	 * Returns the value of the '<em><b>Connector Quality Of Service Assumptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A role connector has exactly one reference for defining its quality of service assumptions like message delay and message loss.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Quality Of Service Assumptions</em>' containment reference.
	 * @see #setConnectorQualityOfServiceAssumptions(ConnectorQualityOfServiceAssumptions)
	 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getRoleConnector_ConnectorQualityOfServiceAssumptions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectorQualityOfServiceAssumptions getConnectorQualityOfServiceAssumptions();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.protocol.RoleConnector#getConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Quality Of Service Assumptions</em>' containment reference.
	 * @see #getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	void setConnectorQualityOfServiceAssumptions(ConnectorQualityOfServiceAssumptions value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.protocol.Role}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.protocol.Role#getRoleConnector <em>Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The two roles that are connected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getRoleConnector_Roles()
	 * @see de.uni_paderborn.fujaba.muml.protocol.Role#getRoleConnector
	 * @model opposite="roleConnector" lower="2" upper="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(e | e.oclIsKindOf(Role)).oclAsType(Role)->asOrderedSet()'"
	 * @generated
	 */
	EList<Role> getRoles();

} // RoleConnector
