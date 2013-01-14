/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.protocol;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.model.constraint.ConstrainableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A coordination protocol specifies the coordination between a certain number of communication members. The communication members are represented by roles. To specify which roles communicate whith each other they are connected by channels. The communication protocol used by the roles is specified by realtime statecharts. Each role has its own realtime statechart describing the roles communication behavior. Furthermore channels own a realtime statechart which enables specifying properties of certain real communication channels e.g. propagation delay or buffering of messages. Furthermore constraints can be assigned to coordination patterns. Constraints specify certain properties the coordination specified by the pattern has to fullfill.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol#getRoles <em>Roles</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol#getRoleConnector <em>Role Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol#getGmfCoordinationProtocol <em>Gmf Coordination Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage#getCoordinationProtocol()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueRoleNames CoordinationProtocolNamesMustBeUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueRoleNames='self.roles->isUnique(name)' CoordinationProtocolNamesMustBeUnique='CoordinationProtocol.allInstances()->isUnique(name)'"
 * @generated
 */
public interface CoordinationProtocol extends NamedElement, ConstrainableElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.protocol.Role}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.protocol.Role#getCoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The roles belonging to this pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage#getCoordinationProtocol_Roles()
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.Role#getCoordinationProtocol
	 * @model opposite="coordinationProtocol" containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Role Connector</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector#getCoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each coordination pattern has exactly one role connector.
	 * Cardinality is 1 because there exists no useful pattern wir more than two roles. If a useful pattern exists with more than 2 roles, than change cardinality to 1..*
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Connector</em>' containment reference.
	 * @see #setRoleConnector(RoleConnector)
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage#getCoordinationProtocol_RoleConnector()
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector#getCoordinationProtocol
	 * @model opposite="coordinationProtocol" containment="true" required="true"
	 * @generated
	 */
	RoleConnector getRoleConnector();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol#getRoleConnector <em>Role Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Connector</em>' containment reference.
	 * @see #getRoleConnector()
	 * @generated
	 */
	void setRoleConnector(RoleConnector value);

	/**
	 * Returns the value of the '<em><b>Gmf Coordination Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived reference only exists because GMF needs it to visualize the inner ellipse of a Real-Time Coordination Pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gmf Coordination Protocol</em>' containment reference.
	 * @see #setGmfCoordinationProtocol(CoordinationProtocol)
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage#getCoordinationProtocol_GmfCoordinationProtocol()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self'"
	 * @generated
	 */
	CoordinationProtocol getGmfCoordinationProtocol();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol#getGmfCoordinationProtocol <em>Gmf Coordination Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gmf Coordination Protocol</em>' containment reference.
	 * @see #getGmfCoordinationProtocol()
	 * @generated
	 */
	void setGmfCoordinationProtocol(CoordinationProtocol value);

} // CoordinationProtocol
