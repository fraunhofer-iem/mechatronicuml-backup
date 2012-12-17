/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.protocol;

import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a communication channel connecting two roles of a coordination pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector#getConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage#getRoleConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyRolesOfSameCoordinationPattern'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OnlyRolesOfSameCoordinationPattern='(not source.oclIsUndefined() and not target.oclIsUndefined()) implies source.coordinationPattern = target.coordinationPattern'"
 * @generated
 */
public interface RoleConnector extends BehavioralElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.protocol.Role#getOutgoingRoleConnector <em>Outgoing Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The roles connected by this channel. At the moment an arbitrary number of roles are allow. This probably should be discussed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Role)
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage#getRoleConnector_Source()
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.Role#getOutgoingRoleConnector
	 * @model opposite="outgoingRoleConnector" required="true"
	 * @generated
	 */
	Role getSource();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Role value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.protocol.Role#getIncomingRoleConnector <em>Incoming Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The roles connected by this channel. At the moment an arbitrary number of roles are allow. This probably should be discussed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Role)
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage#getRoleConnector_Target()
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.Role#getIncomingRoleConnector
	 * @model opposite="incomingRoleConnector" required="true"
	 * @generated
	 */
	Role getTarget();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Role value);

	/**
	 * Returns the value of the '<em><b>Coordination Protocol</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol#getRoleConnector <em>Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination pattern this role connector is part of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol</em>' container reference.
	 * @see #setCoordinationProtocol(CoordinationProtocol)
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage#getRoleConnector_CoordinationProtocol()
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol#getRoleConnector
	 * @model opposite="roleConnector" required="true" transient="false"
	 * @generated
	 */
	CoordinationProtocol getCoordinationProtocol();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector#getCoordinationProtocol <em>Coordination Protocol</em>}' container reference.
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
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage#getRoleConnector_ConnectorQualityOfServiceAssumptions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectorQualityOfServiceAssumptions getConnectorQualityOfServiceAssumptions();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector#getConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Quality Of Service Assumptions</em>' containment reference.
	 * @see #getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	void setConnectorQualityOfServiceAssumptions(ConnectorQualityOfServiceAssumptions value);

} // RoleConnector
