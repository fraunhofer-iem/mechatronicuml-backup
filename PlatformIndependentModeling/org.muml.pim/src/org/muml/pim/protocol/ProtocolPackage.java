/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.protocol;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.CorePackage;
import org.muml.pim.connector.ConnectorPackage;

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
 * <!-- begin-model-doc -->
 * This package provides modeling support for coordination protocols including roles, role connectors, and quality of service assumptions.
 * <!-- end-model-doc -->
 * @see org.muml.pim.protocol.ProtocolFactory
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
	String eNS_URI = "http://www.muml.org/pim/protocol/1.0.0";

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
	ProtocolPackage eINSTANCE = org.muml.pim.protocol.impl.ProtocolPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.pim.protocol.impl.AbstractCoordinationSpecificationImpl <em>Abstract Coordination Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.protocol.impl.AbstractCoordinationSpecificationImpl
	 * @see org.muml.pim.protocol.impl.ProtocolPackageImpl#getAbstractCoordinationSpecification()
	 * @generated
	 */
	int ABSTRACT_COORDINATION_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_SPECIFICATION__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_SPECIFICATION__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_SPECIFICATION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_SPECIFICATION__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verification Constraint Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_SPECIFICATION__VERIFICATION_CONSTRAINT_REPOSITORIES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_SPECIFICATION__ROLES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gmf Abstract Coordination Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_SPECIFICATION__GMF_ABSTRACT_COORDINATION_SPECIFICATION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gmf Message Buffers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_SPECIFICATION__GMF_MESSAGE_BUFFERS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gmf Connector Quality Of Service Assumptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_SPECIFICATION__GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Adapted From Pattern</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_SPECIFICATION__ADAPTED_FROM_PATTERN = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Abstract Coordination Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_SPECIFICATION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_SPECIFICATION___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Abstract Coordination Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_SPECIFICATION_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.protocol.impl.RoleConnectorImpl <em>Role Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.protocol.impl.RoleConnectorImpl
	 * @see org.muml.pim.protocol.impl.ProtocolPackageImpl#getRoleConnector()
	 * @generated
	 */
	int ROLE_CONNECTOR = 3;

	/**
	 * The meta object id for the '{@link org.muml.pim.protocol.impl.CoordinationProtocolImpl <em>Coordination Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.protocol.impl.CoordinationProtocolImpl
	 * @see org.muml.pim.protocol.impl.ProtocolPackageImpl#getCoordinationProtocol()
	 * @generated
	 */
	int COORDINATION_PROTOCOL = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__ANNOTATIONS = ABSTRACT_COORDINATION_SPECIFICATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__EXTENSIONS = ABSTRACT_COORDINATION_SPECIFICATION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__NAME = ABSTRACT_COORDINATION_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__COMMENT = ABSTRACT_COORDINATION_SPECIFICATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Verification Constraint Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__VERIFICATION_CONSTRAINT_REPOSITORIES = ABSTRACT_COORDINATION_SPECIFICATION__VERIFICATION_CONSTRAINT_REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__ROLES = ABSTRACT_COORDINATION_SPECIFICATION__ROLES;

	/**
	 * The feature id for the '<em><b>Role Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__ROLE_CONNECTOR = ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Gmf Abstract Coordination Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__GMF_ABSTRACT_COORDINATION_SPECIFICATION = ABSTRACT_COORDINATION_SPECIFICATION__GMF_ABSTRACT_COORDINATION_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Gmf Message Buffers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__GMF_MESSAGE_BUFFERS = ABSTRACT_COORDINATION_SPECIFICATION__GMF_MESSAGE_BUFFERS;

	/**
	 * The feature id for the '<em><b>Gmf Connector Quality Of Service Assumptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS = ABSTRACT_COORDINATION_SPECIFICATION__GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS;

	/**
	 * The feature id for the '<em><b>Adapted From Pattern</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL__ADAPTED_FROM_PATTERN = ABSTRACT_COORDINATION_SPECIFICATION__ADAPTED_FROM_PATTERN;

	/**
	 * The number of structural features of the '<em>Coordination Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_FEATURE_COUNT = ABSTRACT_COORDINATION_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL___GET_EXTENSION__ECLASS = ABSTRACT_COORDINATION_SPECIFICATION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Coordination Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_OPERATION_COUNT = ABSTRACT_COORDINATION_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.protocol.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.protocol.impl.RoleImpl
	 * @see org.muml.pim.protocol.impl.ProtocolPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ANNOTATIONS = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__EXTENSIONS = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__COMMENT = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONNECTORS = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__BEHAVIOR = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__NAME;

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
	 * The feature id for the '<em><b>Coordinator Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__COORDINATOR_BEHAVIOR = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__COORDINATOR_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Subrole Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SUBROLE_BEHAVIOR = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SUBROLE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CARDINALITY = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__RECEIVER_MESSAGE_BUFFER = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__MULTI = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__MULTI;

	/**
	 * The feature id for the '<em><b>Coordination Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__COORDINATION_PROTOCOL = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_CONNECTOR = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multi Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__MULTI_ROLE = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_EXTENSION__ECLASS = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__ANNOTATIONS = ConnectorPackage.CONNECTOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__EXTENSIONS = ConnectorPackage.CONNECTOR__EXTENSIONS;

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
	 * The feature id for the '<em><b>Self Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR__SELF_CONNECTOR = ConnectorPackage.CONNECTOR__SELF_CONNECTOR;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Role Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTOR_OPERATION_COUNT = ConnectorPackage.CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.protocol.impl.ConnectorQualityOfServiceAssumptionsImpl <em>Connector Quality Of Service Assumptions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.protocol.impl.ConnectorQualityOfServiceAssumptionsImpl
	 * @see org.muml.pim.protocol.impl.ProtocolPackageImpl#getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__ANNOTATIONS = CorePackage.COMMENTABLE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Connector Quality Of Service Assumptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.muml.pim.protocol.AbstractCoordinationSpecification <em>Abstract Coordination Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Coordination Specification</em>'.
	 * @see org.muml.pim.protocol.AbstractCoordinationSpecification
	 * @generated
	 */
	EClass getAbstractCoordinationSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.protocol.AbstractCoordinationSpecification#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.muml.pim.protocol.AbstractCoordinationSpecification#getRoles()
	 * @see #getAbstractCoordinationSpecification()
	 * @generated
	 */
	EReference getAbstractCoordinationSpecification_Roles();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.protocol.AbstractCoordinationSpecification#getRoleConnector <em>Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Connector</em>'.
	 * @see org.muml.pim.protocol.AbstractCoordinationSpecification#getRoleConnector()
	 * @see #getAbstractCoordinationSpecification()
	 * @generated
	 */
	EReference getAbstractCoordinationSpecification_RoleConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.protocol.AbstractCoordinationSpecification#getGmfAbstractCoordinationSpecification <em>Gmf Abstract Coordination Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gmf Abstract Coordination Specification</em>'.
	 * @see org.muml.pim.protocol.AbstractCoordinationSpecification#getGmfAbstractCoordinationSpecification()
	 * @see #getAbstractCoordinationSpecification()
	 * @generated
	 */
	EReference getAbstractCoordinationSpecification_GmfAbstractCoordinationSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.protocol.AbstractCoordinationSpecification#getGmfMessageBuffers <em>Gmf Message Buffers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gmf Message Buffers</em>'.
	 * @see org.muml.pim.protocol.AbstractCoordinationSpecification#getGmfMessageBuffers()
	 * @see #getAbstractCoordinationSpecification()
	 * @generated
	 */
	EReference getAbstractCoordinationSpecification_GmfMessageBuffers();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.protocol.AbstractCoordinationSpecification#getGmfConnectorQualityOfServiceAssumptions <em>Gmf Connector Quality Of Service Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gmf Connector Quality Of Service Assumptions</em>'.
	 * @see org.muml.pim.protocol.AbstractCoordinationSpecification#getGmfConnectorQualityOfServiceAssumptions()
	 * @see #getAbstractCoordinationSpecification()
	 * @generated
	 */
	EReference getAbstractCoordinationSpecification_GmfConnectorQualityOfServiceAssumptions();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.protocol.AbstractCoordinationSpecification#getAdaptedFromPattern <em>Adapted From Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Adapted From Pattern</em>'.
	 * @see org.muml.pim.protocol.AbstractCoordinationSpecification#getAdaptedFromPattern()
	 * @see #getAbstractCoordinationSpecification()
	 * @generated
	 */
	EReference getAbstractCoordinationSpecification_AdaptedFromPattern();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.protocol.RoleConnector <em>Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Connector</em>'.
	 * @see org.muml.pim.protocol.RoleConnector
	 * @generated
	 */
	EClass getRoleConnector();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.protocol.RoleConnector#getCoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Coordination Protocol</em>'.
	 * @see org.muml.pim.protocol.RoleConnector#getCoordinationProtocol()
	 * @see #getRoleConnector()
	 * @generated
	 */
	EReference getRoleConnector_CoordinationProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.protocol.RoleConnector#getConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector Quality Of Service Assumptions</em>'.
	 * @see org.muml.pim.protocol.RoleConnector#getConnectorQualityOfServiceAssumptions()
	 * @see #getRoleConnector()
	 * @generated
	 */
	EReference getRoleConnector_ConnectorQualityOfServiceAssumptions();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.protocol.RoleConnector#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see org.muml.pim.protocol.RoleConnector#getRoles()
	 * @see #getRoleConnector()
	 * @generated
	 */
	EReference getRoleConnector_Roles();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.protocol.CoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Protocol</em>'.
	 * @see org.muml.pim.protocol.CoordinationProtocol
	 * @generated
	 */
	EClass getCoordinationProtocol();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.protocol.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.muml.pim.protocol.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.protocol.Role#getCoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Coordination Protocol</em>'.
	 * @see org.muml.pim.protocol.Role#getCoordinationProtocol()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_CoordinationProtocol();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.protocol.Role#getRoleConnector <em>Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Connector</em>'.
	 * @see org.muml.pim.protocol.Role#getRoleConnector()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RoleConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.protocol.Role#isMultiRole <em>Multi Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Role</em>'.
	 * @see org.muml.pim.protocol.Role#isMultiRole()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_MultiRole();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Quality Of Service Assumptions</em>'.
	 * @see org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions
	 * @generated
	 */
	EClass getConnectorQualityOfServiceAssumptions();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions#getMinMessageDelay <em>Min Message Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Message Delay</em>'.
	 * @see org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions#getMinMessageDelay()
	 * @see #getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	EReference getConnectorQualityOfServiceAssumptions_MinMessageDelay();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions#getMaxMessageDelay <em>Max Message Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Message Delay</em>'.
	 * @see org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions#getMaxMessageDelay()
	 * @see #getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	EReference getConnectorQualityOfServiceAssumptions_MaxMessageDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions#isMessageLossPossible <em>Message Loss Possible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Loss Possible</em>'.
	 * @see org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions#isMessageLossPossible()
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
		 * The meta object literal for the '{@link org.muml.pim.protocol.impl.AbstractCoordinationSpecificationImpl <em>Abstract Coordination Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.protocol.impl.AbstractCoordinationSpecificationImpl
		 * @see org.muml.pim.protocol.impl.ProtocolPackageImpl#getAbstractCoordinationSpecification()
		 * @generated
		 */
		EClass ABSTRACT_COORDINATION_SPECIFICATION = eINSTANCE.getAbstractCoordinationSpecification();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COORDINATION_SPECIFICATION__ROLES = eINSTANCE.getAbstractCoordinationSpecification_Roles();

		/**
		 * The meta object literal for the '<em><b>Role Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR = eINSTANCE.getAbstractCoordinationSpecification_RoleConnector();

		/**
		 * The meta object literal for the '<em><b>Gmf Abstract Coordination Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COORDINATION_SPECIFICATION__GMF_ABSTRACT_COORDINATION_SPECIFICATION = eINSTANCE.getAbstractCoordinationSpecification_GmfAbstractCoordinationSpecification();

		/**
		 * The meta object literal for the '<em><b>Gmf Message Buffers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COORDINATION_SPECIFICATION__GMF_MESSAGE_BUFFERS = eINSTANCE.getAbstractCoordinationSpecification_GmfMessageBuffers();

		/**
		 * The meta object literal for the '<em><b>Gmf Connector Quality Of Service Assumptions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COORDINATION_SPECIFICATION__GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS = eINSTANCE.getAbstractCoordinationSpecification_GmfConnectorQualityOfServiceAssumptions();

		/**
		 * The meta object literal for the '<em><b>Adapted From Pattern</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COORDINATION_SPECIFICATION__ADAPTED_FROM_PATTERN = eINSTANCE.getAbstractCoordinationSpecification_AdaptedFromPattern();

		/**
		 * The meta object literal for the '{@link org.muml.pim.protocol.impl.RoleConnectorImpl <em>Role Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.protocol.impl.RoleConnectorImpl
		 * @see org.muml.pim.protocol.impl.ProtocolPackageImpl#getRoleConnector()
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
		 * The meta object literal for the '{@link org.muml.pim.protocol.impl.CoordinationProtocolImpl <em>Coordination Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.protocol.impl.CoordinationProtocolImpl
		 * @see org.muml.pim.protocol.impl.ProtocolPackageImpl#getCoordinationProtocol()
		 * @generated
		 */
		EClass COORDINATION_PROTOCOL = eINSTANCE.getCoordinationProtocol();

		/**
		 * The meta object literal for the '{@link org.muml.pim.protocol.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.protocol.impl.RoleImpl
		 * @see org.muml.pim.protocol.impl.ProtocolPackageImpl#getRole()
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
		 * The meta object literal for the '{@link org.muml.pim.protocol.impl.ConnectorQualityOfServiceAssumptionsImpl <em>Connector Quality Of Service Assumptions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.protocol.impl.ConnectorQualityOfServiceAssumptionsImpl
		 * @see org.muml.pim.protocol.impl.ProtocolPackageImpl#getConnectorQualityOfServiceAssumptions()
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
