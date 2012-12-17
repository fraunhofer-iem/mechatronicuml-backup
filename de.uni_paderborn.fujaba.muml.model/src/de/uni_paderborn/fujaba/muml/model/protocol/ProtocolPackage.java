/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.protocol;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.protocol.ProtocolFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ProtocolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "protocol";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/model/protocol/0.3.7";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "protocol";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProtocolPackage eINSTANCE = de.uni_paderborn.fujaba.muml.model.protocol.impl.ProtocolPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.protocol.impl.RoleConnectorImpl <em>Role Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.RoleConnectorImpl
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.ProtocolPackageImpl#getRoleConnector()
	 * @generated
	 */
	int ROLE_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__ANNOTATION = ConnectorPackage.CONNECTOR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__EXTENSION = ConnectorPackage.CONNECTOR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__COMMENT = ConnectorPackage.CONNECTOR__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__CONNECTOR_ENDPOINTS = ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Coordination Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__COORDINATION_PROTOCOL = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector Quality Of Service Assumptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__ROLES = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Role Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR_FEATURE_COUNT = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.protocol.impl.CoordinationProtocolImpl <em>Coordination Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.CoordinationProtocolImpl
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.ProtocolPackageImpl#getCoordinationProtocol()
	 * @generated
	 */
	int COORDINATION_PROTOCOL = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__CONSTRAINT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__ROLES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__ROLE_CONNECTOR = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Coordination Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__COORDINATION_PROTOCOL = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Coordination Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.protocol.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.RoleImpl
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.ProtocolPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 2;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__BEHAVIOR = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ANNOTATION = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__EXTENSION = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONSTRAINT = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SENDER_MESSAGE_TYPES = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__RECEIVER_MESSAGE_TYPES = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ADAPTATION_BEHAVIOR = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__ADAPTATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Role And Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_AND_ADAPTATION_BEHAVIOR = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__ROLE_AND_ADAPTATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CARDINALITY = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__COMMENT = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coordination Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__COORDINATION_PROTOCOL = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PORT = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_CONNECTOR = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multi Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__MULTI_ROLE = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__RECEIVER_MESSAGE_BUFFER = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.protocol.impl.MessageBufferImpl <em>Message Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.MessageBufferImpl
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.ProtocolPackageImpl#getMessageBuffer()
	 * @generated
	 */
	int MESSAGE_BUFFER = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__BUFFER_SIZE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__MESSAGE_TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__ROLE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Message Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.protocol.impl.ConnectorQualityOfServiceAssumptionsImpl <em>Connector Quality Of Service Assumptions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.ConnectorQualityOfServiceAssumptionsImpl
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.ProtocolPackageImpl#getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Min Message Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Message Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Loss Possible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connector Quality Of Service Assumptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector <em>Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Connector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector
	 * @generated
	 */
	EClass getRoleConnector();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector#getCoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Coordination Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector#getCoordinationProtocol()
	 * @see #getRoleConnector()
	 * @generated
	 */
	EReference getRoleConnector_CoordinationProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector#getConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector Quality Of Service Assumptions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector#getConnectorQualityOfServiceAssumptions()
	 * @see #getRoleConnector()
	 * @generated
	 */
	EReference getRoleConnector_ConnectorQualityOfServiceAssumptions();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector#getRoles()
	 * @see #getRoleConnector()
	 * @generated
	 */
	EReference getRoleConnector_Roles();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol
	 * @generated
	 */
	EClass getCoordinationProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol#getRoles()
	 * @see #getCoordinationProtocol()
	 * @generated
	 */
	EReference getCoordinationProtocol_Roles();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol#getRoleConnector <em>Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Connector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol#getRoleConnector()
	 * @see #getCoordinationProtocol()
	 * @generated
	 */
	EReference getCoordinationProtocol_RoleConnector();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol#getCoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordination Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol#getCoordinationProtocol()
	 * @see #getCoordinationProtocol()
	 * @generated
	 */
	EReference getCoordinationProtocol_CoordinationProtocol();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.protocol.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.protocol.Role#getCoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Coordination Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.Role#getCoordinationProtocol()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_CoordinationProtocol();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.protocol.Role#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.Role#getPort()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Port();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.protocol.Role#getRoleConnector <em>Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Connector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.Role#getRoleConnector()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RoleConnector();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.protocol.Role#isMultiRole <em>Multi Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Role</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.Role#isMultiRole()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_MultiRole();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.protocol.Role#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Receiver Message Buffer</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.Role#getReceiverMessageBuffer()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ReceiverMessageBuffer();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.protocol.MessageBuffer <em>Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Buffer</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.MessageBuffer
	 * @generated
	 */
	EClass getMessageBuffer();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.protocol.MessageBuffer#getBufferSize <em>Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Buffer Size</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.MessageBuffer#getBufferSize()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EReference getMessageBuffer_BufferSize();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.protocol.MessageBuffer#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.MessageBuffer#getMessageType()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EReference getMessageBuffer_MessageType();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.protocol.MessageBuffer#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Role</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.MessageBuffer#getRole()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EReference getMessageBuffer_Role();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.protocol.ConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Quality Of Service Assumptions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.ConnectorQualityOfServiceAssumptions
	 * @generated
	 */
	EClass getConnectorQualityOfServiceAssumptions();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.protocol.ConnectorQualityOfServiceAssumptions#getMinMessageDelay <em>Min Message Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Message Delay</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.ConnectorQualityOfServiceAssumptions#getMinMessageDelay()
	 * @see #getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	EReference getConnectorQualityOfServiceAssumptions_MinMessageDelay();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.protocol.ConnectorQualityOfServiceAssumptions#getMaxMessageDelay <em>Max Message Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Message Delay</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.ConnectorQualityOfServiceAssumptions#getMaxMessageDelay()
	 * @see #getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	EReference getConnectorQualityOfServiceAssumptions_MaxMessageDelay();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.protocol.ConnectorQualityOfServiceAssumptions#isMessageLossPossible <em>Message Loss Possible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Loss Possible</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.protocol.ConnectorQualityOfServiceAssumptions#isMessageLossPossible()
	 * @see #getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	EAttribute getConnectorQualityOfServiceAssumptions_MessageLossPossible();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProtocolFactory getProtocolFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.protocol.impl.RoleConnectorImpl <em>Role Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.RoleConnectorImpl
		 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.ProtocolPackageImpl#getRoleConnector()
		 * @generated
		 */
		EClass ROLE_CONNECTOR = eINSTANCE.getRoleConnector();

		/**
		 * The meta object literal for the '<em><b>Coordination Protocol</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CONNECTOR__COORDINATION_PROTOCOL = eINSTANCE.getRoleConnector_CoordinationProtocol();

		/**
		 * The meta object literal for the '<em><b>Connector Quality Of Service Assumptions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS = eINSTANCE.getRoleConnector_ConnectorQualityOfServiceAssumptions();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CONNECTOR__ROLES = eINSTANCE.getRoleConnector_Roles();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.protocol.impl.CoordinationProtocolImpl <em>Coordination Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.CoordinationProtocolImpl
		 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.ProtocolPackageImpl#getCoordinationProtocol()
		 * @generated
		 */
		EClass COORDINATION_PROTOCOL = eINSTANCE.getCoordinationProtocol();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PROTOCOL__ROLES = eINSTANCE.getCoordinationProtocol_Roles();

		/**
		 * The meta object literal for the '<em><b>Role Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PROTOCOL__ROLE_CONNECTOR = eINSTANCE.getCoordinationProtocol_RoleConnector();

		/**
		 * The meta object literal for the '<em><b>Coordination Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PROTOCOL__COORDINATION_PROTOCOL = eINSTANCE.getCoordinationProtocol_CoordinationProtocol();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.protocol.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.RoleImpl
		 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.ProtocolPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Coordination Protocol</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__COORDINATION_PROTOCOL = eINSTANCE.getRole_CoordinationProtocol();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PORT = eINSTANCE.getRole_Port();

		/**
		 * The meta object literal for the '<em><b>Role Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ROLE_CONNECTOR = eINSTANCE.getRole_RoleConnector();

		/**
		 * The meta object literal for the '<em><b>Multi Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__MULTI_ROLE = eINSTANCE.getRole_MultiRole();

		/**
		 * The meta object literal for the '<em><b>Receiver Message Buffer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__RECEIVER_MESSAGE_BUFFER = eINSTANCE.getRole_ReceiverMessageBuffer();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.protocol.impl.MessageBufferImpl <em>Message Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.MessageBufferImpl
		 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.ProtocolPackageImpl#getMessageBuffer()
		 * @generated
		 */
		EClass MESSAGE_BUFFER = eINSTANCE.getMessageBuffer();

		/**
		 * The meta object literal for the '<em><b>Buffer Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_BUFFER__BUFFER_SIZE = eINSTANCE.getMessageBuffer_BufferSize();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_BUFFER__MESSAGE_TYPE = eINSTANCE.getMessageBuffer_MessageType();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_BUFFER__ROLE = eINSTANCE.getMessageBuffer_Role();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.protocol.impl.ConnectorQualityOfServiceAssumptionsImpl <em>Connector Quality Of Service Assumptions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.ConnectorQualityOfServiceAssumptionsImpl
		 * @see de.uni_paderborn.fujaba.muml.model.protocol.impl.ProtocolPackageImpl#getConnectorQualityOfServiceAssumptions()
		 * @generated
		 */
		EClass CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS = eINSTANCE.getConnectorQualityOfServiceAssumptions();

		/**
		 * The meta object literal for the '<em><b>Min Message Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY = eINSTANCE.getConnectorQualityOfServiceAssumptions_MinMessageDelay();

		/**
		 * The meta object literal for the '<em><b>Max Message Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY = eINSTANCE.getConnectorQualityOfServiceAssumptions_MaxMessageDelay();

		/**
		 * The meta object literal for the '<em><b>Message Loss Possible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE = eINSTANCE.getConnectorQualityOfServiceAssumptions_MessageLossPossible();

	}

} //ProtocolPackage
