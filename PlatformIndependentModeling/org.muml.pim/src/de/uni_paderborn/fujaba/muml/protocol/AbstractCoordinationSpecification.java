/**
 */
package de.uni_paderborn.fujaba.muml.protocol;

import org.eclipse.emf.common.util.EList;
import org.muml.core.CommentableElement;
import org.muml.core.NamedElement;

import de.uni_paderborn.fujaba.muml.connector.MessageBuffer;
import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.pattern.AbstractCoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Coordination Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for coordination protocols.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification#getRoles <em>Roles</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification#getRoleConnector <em>Role Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification#getGmfAbstractCoordinationSpecification <em>Gmf Abstract Coordination Specification</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification#getGmfMessageBuffers <em>Gmf Message Buffers</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification#getGmfConnectorQualityOfServiceAssumptions <em>Gmf Connector Quality Of Service Assumptions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification#getAdaptedFromPattern <em>Adapted From Pattern</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getAbstractCoordinationSpecification()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueRoleNames RoleMessageTypesMustBeCompatible SingleRoleImpliesMultiRole'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueRoleNames='-- Names of roles must be unique\nself.roles->isUnique(name)' RoleMessageTypesMustBeCompatible='-- Every Role must have the senderMessageTypes of all other Roles set as receiverMessageTypes\r\nself.roles->forAll(role1 : Role, role2 : Role |\r\n   role1 <> role2\r\n   implies\r\n   role1.senderMessageTypes->asSet() = role2.receiverMessageTypes->asSet()\r\n)' SingleRoleImpliesMultiRole='-- Only one role exists, so it must be a Multi Role.\r\nself.roles->size() = 1 implies self.roles->any(true).multiRole'"
 * @generated
 */
public interface AbstractCoordinationSpecification extends NamedElement, CommentableElement, VerifiableElement {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.protocol.Role}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.protocol.Role#getCoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The roles belonging to this coordination protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getAbstractCoordinationSpecification_Roles()
	 * @see de.uni_paderborn.fujaba.muml.protocol.Role#getCoordinationProtocol
	 * @model opposite="coordinationProtocol" containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Role Connector</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.protocol.RoleConnector#getCoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each coordination protocol has exactly one role connector.
	 * Cardinality is 1 because there exists no useful protocol with more than two roles. If a useful protocol exists with more than 2 roles, then change cardinality to 1..*
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Connector</em>' containment reference.
	 * @see #setRoleConnector(RoleConnector)
	 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getAbstractCoordinationSpecification_RoleConnector()
	 * @see de.uni_paderborn.fujaba.muml.protocol.RoleConnector#getCoordinationProtocol
	 * @model opposite="coordinationProtocol" containment="true" required="true"
	 * @generated
	 */
	RoleConnector getRoleConnector();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification#getRoleConnector <em>Role Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Connector</em>' containment reference.
	 * @see #getRoleConnector()
	 * @generated
	 */
	void setRoleConnector(RoleConnector value);

	/**
	 * Returns the value of the '<em><b>Gmf Abstract Coordination Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived reference only exists because GMF needs it to visualize the inner hexagon of a Real-Time Coordination Protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gmf Abstract Coordination Specification</em>' containment reference.
	 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getAbstractCoordinationSpecification_GmfAbstractCoordinationSpecification()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self'"
	 * @generated
	 */
	AbstractCoordinationSpecification getGmfAbstractCoordinationSpecification();

	/**
	 * Returns the value of the '<em><b>Gmf Message Buffers</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.connector.MessageBuffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived reference only exists because GMF needs it to display the MessageBuffer within the coordination protocol rectangle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gmf Message Buffers</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getAbstractCoordinationSpecification_GmfMessageBuffers()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='roles->collect(receiverMessageBuffer)->asOrderedSet()'"
	 * @generated
	 */
	EList<MessageBuffer> getGmfMessageBuffers();

	/**
	 * Returns the value of the '<em><b>Gmf Connector Quality Of Service Assumptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived reference only exists because GMF needs it to display the ConnectorQualityOfServiceAssumption within the coordination protocol rectangle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gmf Connector Quality Of Service Assumptions</em>' containment reference.
	 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getAbstractCoordinationSpecification_GmfConnectorQualityOfServiceAssumptions()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.roleConnector.connectorQualityOfServiceAssumptions.oclIsInvalid() then\r\n\tnull\r\nelse\r\n\tself.roleConnector.connectorQualityOfServiceAssumptions\r\nendif'"
	 * @generated
	 */
	ConnectorQualityOfServiceAssumptions getGmfConnectorQualityOfServiceAssumptions();

	/**
	 * Returns the value of the '<em><b>Adapted From Pattern</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.pattern.AbstractCoordinationPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this coordination specification is adapted from one or more Real-Time Coordination Pattern, then these patterns are listed here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adapted From Pattern</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getAbstractCoordinationSpecification_AdaptedFromPattern()
	 * @model annotation="http://www.muml.org/emf/OCLFilter filter='pattern::CoordinationPattern::allInstances()->select(p| not (p = self))'"
	 * @generated
	 */
	EList<AbstractCoordinationPattern> getAdaptedFromPattern();

} // AbstractCoordinationSpecification
