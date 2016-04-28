/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.connector;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.mumlcore.CorePackage;

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
 * This package defines a set of abstract classes that form the basis for all connectors
 * that we use in our meta-model. They define the connectors, different types of 
 * endpoints that are connected by connectors, and their instances.
 * <!-- end-model-doc -->
 * @see org.muml.pim.connector.ConnectorFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ConnectorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "connector";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/pim/connector/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "connector";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConnectorPackage eINSTANCE = org.muml.pim.connector.impl.ConnectorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.pim.connector.impl.ConnectorEndpointImpl <em>Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.connector.impl.ConnectorEndpointImpl
	 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getConnectorEndpoint()
	 * @generated
	 */
	int CONNECTOR_ENDPOINT = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT__CONNECTORS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.connector.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.connector.impl.ConnectorImpl
	 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONNECTOR_ENDPOINTS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Self Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SELF_CONNECTOR = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.connector.impl.ConnectorEndpointInstanceImpl <em>Endpoint Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.connector.impl.ConnectorEndpointInstanceImpl
	 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getConnectorEndpointInstance()
	 * @generated
	 */
	int CONNECTOR_ENDPOINT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT_INSTANCE__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT_INSTANCE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT_INSTANCE__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT_INSTANCE__TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Endpoint Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT_INSTANCE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Endpoint Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT_INSTANCE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.connector.impl.ConnectorInstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.connector.impl.ConnectorInstanceImpl
	 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getConnectorInstance()
	 * @generated
	 */
	int CONNECTOR_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__TYPE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.connector.impl.DiscreteInteractionEndpointImpl <em>Discrete Interaction Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.connector.impl.DiscreteInteractionEndpointImpl
	 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getDiscreteInteractionEndpoint()
	 * @generated
	 */
	int DISCRETE_INTERACTION_ENDPOINT = 4;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__EXTENSIONS = CONNECTOR_ENDPOINT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__COMMENT = CONNECTOR_ENDPOINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__CONNECTORS = CONNECTOR_ENDPOINT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__BEHAVIOR = CONNECTOR_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__NAME = CONNECTOR_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES = CONNECTOR_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES = CONNECTOR_ENDPOINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Coordinator Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__COORDINATOR_BEHAVIOR = CONNECTOR_ENDPOINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Subrole Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__SUBROLE_BEHAVIOR = CONNECTOR_ENDPOINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__CARDINALITY = CONNECTOR_ENDPOINT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER = CONNECTOR_ENDPOINT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__MULTI = CONNECTOR_ENDPOINT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Discrete Interaction Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_FEATURE_COUNT = CONNECTOR_ENDPOINT_FEATURE_COUNT + 9;


	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT___GET_EXTENSION__ECLASS = CONNECTOR_ENDPOINT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Discrete Interaction Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_OPERATION_COUNT = CONNECTOR_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.connector.impl.DiscreteInteractionEndpointInstanceImpl <em>Discrete Interaction Endpoint Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.connector.impl.DiscreteInteractionEndpointInstanceImpl
	 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getDiscreteInteractionEndpointInstance()
	 * @generated
	 */
	int DISCRETE_INTERACTION_ENDPOINT_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_INSTANCE__EXTENSIONS = CONNECTOR_ENDPOINT_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_INSTANCE__NAME = CONNECTOR_ENDPOINT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_INSTANCE__COMMENT = CONNECTOR_ENDPOINT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES = CONNECTOR_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_INSTANCE__TYPE = CONNECTOR_ENDPOINT_INSTANCE__TYPE;

	/**
	 * The number of structural features of the '<em>Discrete Interaction Endpoint Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT = CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_INSTANCE___GET_EXTENSION__ECLASS = CONNECTOR_ENDPOINT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Discrete Interaction Endpoint Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_INSTANCE_OPERATION_COUNT = CONNECTOR_ENDPOINT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.connector.impl.DiscreteSingleInteractionEndpointInstanceImpl <em>Discrete Single Interaction Endpoint Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.connector.impl.DiscreteSingleInteractionEndpointInstanceImpl
	 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getDiscreteSingleInteractionEndpointInstance()
	 * @generated
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__EXTENSIONS = DISCRETE_INTERACTION_ENDPOINT_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__NAME = DISCRETE_INTERACTION_ENDPOINT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__COMMENT = DISCRETE_INTERACTION_ENDPOINT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES = DISCRETE_INTERACTION_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__TYPE = DISCRETE_INTERACTION_ENDPOINT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Multi Interaction Endpoint Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE = DISCRETE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__NEXT = DISCRETE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__PREVIOUS = DISCRETE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__FIRST = DISCRETE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__LAST = DISCRETE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Discrete Single Interaction Endpoint Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT = DISCRETE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE___GET_EXTENSION__ECLASS = DISCRETE_INTERACTION_ENDPOINT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Discrete Single Interaction Endpoint Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE_OPERATION_COUNT = DISCRETE_INTERACTION_ENDPOINT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.connector.impl.DiscreteMultiInteractionEndpointInstanceImpl <em>Discrete Multi Interaction Endpoint Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.connector.impl.DiscreteMultiInteractionEndpointInstanceImpl
	 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getDiscreteMultiInteractionEndpointInstance()
	 * @generated
	 */
	int DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__EXTENSIONS = DISCRETE_INTERACTION_ENDPOINT_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__NAME = DISCRETE_INTERACTION_ENDPOINT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__COMMENT = DISCRETE_INTERACTION_ENDPOINT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES = DISCRETE_INTERACTION_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__TYPE = DISCRETE_INTERACTION_ENDPOINT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Sub Interaction Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES = DISCRETE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__FIRST = DISCRETE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__LAST = DISCRETE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Discrete Multi Interaction Endpoint Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT = DISCRETE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT + 3;


	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE___GET_EXTENSION__ECLASS = DISCRETE_INTERACTION_ENDPOINT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Discrete Multi Interaction Endpoint Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE_OPERATION_COUNT = DISCRETE_INTERACTION_ENDPOINT_INSTANCE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.muml.pim.connector.impl.MessageBufferImpl <em>Message Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.connector.impl.MessageBufferImpl
	 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getMessageBuffer()
	 * @generated
	 */
	int MESSAGE_BUFFER = 8;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Discrete Interaction Endpoint</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Buffer Overflow Avoidance Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__BUFFER_OVERFLOW_AVOIDANCE_STRATEGY = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gmf Message Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__GMF_MESSAGE_TYPES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Message Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Message Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.muml.pim.connector.BufferOverflowAvoidanceStrategy <em>Buffer Overflow Avoidance Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.connector.BufferOverflowAvoidanceStrategy
	 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getBufferOverflowAvoidanceStrategy()
	 * @generated
	 */
	int BUFFER_OVERFLOW_AVOIDANCE_STRATEGY = 9;


	/**
	 * Returns the meta object for class '{@link org.muml.pim.connector.ConnectorEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint</em>'.
	 * @see org.muml.pim.connector.ConnectorEndpoint
	 * @generated
	 */
	EClass getConnectorEndpoint();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.connector.ConnectorEndpoint#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connectors</em>'.
	 * @see org.muml.pim.connector.ConnectorEndpoint#getConnectors()
	 * @see #getConnectorEndpoint()
	 * @generated
	 */
	EReference getConnectorEndpoint_Connectors();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.connector.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.muml.pim.connector.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.connector.Connector#getConnectorEndpoints <em>Connector Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connector Endpoints</em>'.
	 * @see org.muml.pim.connector.Connector#getConnectorEndpoints()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_ConnectorEndpoints();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.connector.Connector#isSelfConnector <em>Self Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Connector</em>'.
	 * @see org.muml.pim.connector.Connector#isSelfConnector()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SelfConnector();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.connector.ConnectorEndpointInstance <em>Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint Instance</em>'.
	 * @see org.muml.pim.connector.ConnectorEndpointInstance
	 * @generated
	 */
	EClass getConnectorEndpointInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.connector.ConnectorEndpointInstance#getConnectorInstances <em>Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connector Instances</em>'.
	 * @see org.muml.pim.connector.ConnectorEndpointInstance#getConnectorInstances()
	 * @see #getConnectorEndpointInstance()
	 * @generated
	 */
	EReference getConnectorEndpointInstance_ConnectorInstances();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.connector.ConnectorEndpointInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.muml.pim.connector.ConnectorEndpointInstance#getType()
	 * @see #getConnectorEndpointInstance()
	 * @generated
	 */
	EReference getConnectorEndpointInstance_Type();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.connector.ConnectorInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see org.muml.pim.connector.ConnectorInstance
	 * @generated
	 */
	EClass getConnectorInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.connector.ConnectorInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.muml.pim.connector.ConnectorInstance#getType()
	 * @see #getConnectorInstance()
	 * @generated
	 */
	EReference getConnectorInstance_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.connector.ConnectorInstance#getConnectorEndpointInstances <em>Connector Endpoint Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connector Endpoint Instances</em>'.
	 * @see org.muml.pim.connector.ConnectorInstance#getConnectorEndpointInstances()
	 * @see #getConnectorInstance()
	 * @generated
	 */
	EReference getConnectorInstance_ConnectorEndpointInstances();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.connector.DiscreteInteractionEndpoint <em>Discrete Interaction Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Interaction Endpoint</em>'.
	 * @see org.muml.pim.connector.DiscreteInteractionEndpoint
	 * @generated
	 */
	EClass getDiscreteInteractionEndpoint();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.connector.DiscreteInteractionEndpoint#getSenderMessageTypes <em>Sender Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sender Message Types</em>'.
	 * @see org.muml.pim.connector.DiscreteInteractionEndpoint#getSenderMessageTypes()
	 * @see #getDiscreteInteractionEndpoint()
	 * @generated
	 */
	EReference getDiscreteInteractionEndpoint_SenderMessageTypes();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.connector.DiscreteInteractionEndpoint#getReceiverMessageTypes <em>Receiver Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receiver Message Types</em>'.
	 * @see org.muml.pim.connector.DiscreteInteractionEndpoint#getReceiverMessageTypes()
	 * @see #getDiscreteInteractionEndpoint()
	 * @generated
	 */
	EReference getDiscreteInteractionEndpoint_ReceiverMessageTypes();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.connector.DiscreteInteractionEndpoint#getCoordinatorBehavior <em>Coordinator Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordinator Behavior</em>'.
	 * @see org.muml.pim.connector.DiscreteInteractionEndpoint#getCoordinatorBehavior()
	 * @see #getDiscreteInteractionEndpoint()
	 * @generated
	 */
	EReference getDiscreteInteractionEndpoint_CoordinatorBehavior();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.connector.DiscreteInteractionEndpoint#getSubroleBehavior <em>Subrole Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subrole Behavior</em>'.
	 * @see org.muml.pim.connector.DiscreteInteractionEndpoint#getSubroleBehavior()
	 * @see #getDiscreteInteractionEndpoint()
	 * @generated
	 */
	EReference getDiscreteInteractionEndpoint_SubroleBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.connector.DiscreteInteractionEndpoint#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see org.muml.pim.connector.DiscreteInteractionEndpoint#getCardinality()
	 * @see #getDiscreteInteractionEndpoint()
	 * @generated
	 */
	EReference getDiscreteInteractionEndpoint_Cardinality();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.connector.DiscreteInteractionEndpoint#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Receiver Message Buffer</em>'.
	 * @see org.muml.pim.connector.DiscreteInteractionEndpoint#getReceiverMessageBuffer()
	 * @see #getDiscreteInteractionEndpoint()
	 * @generated
	 */
	EReference getDiscreteInteractionEndpoint_ReceiverMessageBuffer();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.connector.DiscreteInteractionEndpoint#isMulti <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi</em>'.
	 * @see org.muml.pim.connector.DiscreteInteractionEndpoint#isMulti()
	 * @see #getDiscreteInteractionEndpoint()
	 * @generated
	 */
	EAttribute getDiscreteInteractionEndpoint_Multi();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.connector.DiscreteInteractionEndpointInstance <em>Discrete Interaction Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Interaction Endpoint Instance</em>'.
	 * @see org.muml.pim.connector.DiscreteInteractionEndpointInstance
	 * @generated
	 */
	EClass getDiscreteInteractionEndpointInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance <em>Discrete Single Interaction Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Single Interaction Endpoint Instance</em>'.
	 * @see org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance
	 * @generated
	 */
	EClass getDiscreteSingleInteractionEndpointInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getMultiInteractionEndpointInstance <em>Multi Interaction Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multi Interaction Endpoint Instance</em>'.
	 * @see org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getMultiInteractionEndpointInstance()
	 * @see #getDiscreteSingleInteractionEndpointInstance()
	 * @generated
	 */
	EReference getDiscreteSingleInteractionEndpointInstance_MultiInteractionEndpointInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getNext()
	 * @see #getDiscreteSingleInteractionEndpointInstance()
	 * @generated
	 */
	EReference getDiscreteSingleInteractionEndpointInstance_Next();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getPrevious()
	 * @see #getDiscreteSingleInteractionEndpointInstance()
	 * @generated
	 */
	EReference getDiscreteSingleInteractionEndpointInstance_Previous();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getFirst()
	 * @see #getDiscreteSingleInteractionEndpointInstance()
	 * @generated
	 */
	EReference getDiscreteSingleInteractionEndpointInstance_First();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last</em>'.
	 * @see org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getLast()
	 * @see #getDiscreteSingleInteractionEndpointInstance()
	 * @generated
	 */
	EReference getDiscreteSingleInteractionEndpointInstance_Last();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance <em>Discrete Multi Interaction Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Multi Interaction Endpoint Instance</em>'.
	 * @see org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance
	 * @generated
	 */
	EClass getDiscreteMultiInteractionEndpointInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance#getSubInteractionEndpointInstances <em>Sub Interaction Endpoint Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Interaction Endpoint Instances</em>'.
	 * @see org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance#getSubInteractionEndpointInstances()
	 * @see #getDiscreteMultiInteractionEndpointInstance()
	 * @generated
	 */
	EReference getDiscreteMultiInteractionEndpointInstance_SubInteractionEndpointInstances();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance#getFirst()
	 * @see #getDiscreteMultiInteractionEndpointInstance()
	 * @generated
	 */
	EReference getDiscreteMultiInteractionEndpointInstance_First();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last</em>'.
	 * @see org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance#getLast()
	 * @see #getDiscreteMultiInteractionEndpointInstance()
	 * @generated
	 */
	EReference getDiscreteMultiInteractionEndpointInstance_Last();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.connector.MessageBuffer <em>Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Buffer</em>'.
	 * @see org.muml.pim.connector.MessageBuffer
	 * @generated
	 */
	EClass getMessageBuffer();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.connector.MessageBuffer#getBufferSize <em>Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Buffer Size</em>'.
	 * @see org.muml.pim.connector.MessageBuffer#getBufferSize()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EReference getMessageBuffer_BufferSize();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.connector.MessageBuffer#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message Type</em>'.
	 * @see org.muml.pim.connector.MessageBuffer#getMessageType()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EReference getMessageBuffer_MessageType();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.connector.MessageBuffer#getDiscreteInteractionEndpoint <em>Discrete Interaction Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Discrete Interaction Endpoint</em>'.
	 * @see org.muml.pim.connector.MessageBuffer#getDiscreteInteractionEndpoint()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EReference getMessageBuffer_DiscreteInteractionEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.connector.MessageBuffer#getBufferOverflowAvoidanceStrategy <em>Buffer Overflow Avoidance Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Overflow Avoidance Strategy</em>'.
	 * @see org.muml.pim.connector.MessageBuffer#getBufferOverflowAvoidanceStrategy()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EAttribute getMessageBuffer_BufferOverflowAvoidanceStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.connector.MessageBuffer#getGmfMessageTypes <em>Gmf Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gmf Message Types</em>'.
	 * @see org.muml.pim.connector.MessageBuffer#getGmfMessageTypes()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EReference getMessageBuffer_GmfMessageTypes();

	/**
	 * Returns the meta object for enum '{@link org.muml.pim.connector.BufferOverflowAvoidanceStrategy <em>Buffer Overflow Avoidance Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Buffer Overflow Avoidance Strategy</em>'.
	 * @see org.muml.pim.connector.BufferOverflowAvoidanceStrategy
	 * @generated
	 */
	EEnum getBufferOverflowAvoidanceStrategy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConnectorFactory getConnectorFactory();

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
		 * The meta object literal for the '{@link org.muml.pim.connector.impl.ConnectorEndpointImpl <em>Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.connector.impl.ConnectorEndpointImpl
		 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getConnectorEndpoint()
		 * @generated
		 */
		EClass CONNECTOR_ENDPOINT = eINSTANCE.getConnectorEndpoint();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_ENDPOINT__CONNECTORS = eINSTANCE.getConnectorEndpoint_Connectors();

		/**
		 * The meta object literal for the '{@link org.muml.pim.connector.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.connector.impl.ConnectorImpl
		 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Connector Endpoints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__CONNECTOR_ENDPOINTS = eINSTANCE.getConnector_ConnectorEndpoints();

		/**
		 * The meta object literal for the '<em><b>Self Connector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SELF_CONNECTOR = eINSTANCE.getConnector_SelfConnector();

		/**
		 * The meta object literal for the '{@link org.muml.pim.connector.impl.ConnectorEndpointInstanceImpl <em>Endpoint Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.connector.impl.ConnectorEndpointInstanceImpl
		 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getConnectorEndpointInstance()
		 * @generated
		 */
		EClass CONNECTOR_ENDPOINT_INSTANCE = eINSTANCE.getConnectorEndpointInstance();

		/**
		 * The meta object literal for the '<em><b>Connector Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES = eINSTANCE.getConnectorEndpointInstance_ConnectorInstances();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_ENDPOINT_INSTANCE__TYPE = eINSTANCE.getConnectorEndpointInstance_Type();

		/**
		 * The meta object literal for the '{@link org.muml.pim.connector.impl.ConnectorInstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.connector.impl.ConnectorInstanceImpl
		 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getConnectorInstance()
		 * @generated
		 */
		EClass CONNECTOR_INSTANCE = eINSTANCE.getConnectorInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_INSTANCE__TYPE = eINSTANCE.getConnectorInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Connector Endpoint Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES = eINSTANCE.getConnectorInstance_ConnectorEndpointInstances();

		/**
		 * The meta object literal for the '{@link org.muml.pim.connector.impl.DiscreteInteractionEndpointImpl <em>Discrete Interaction Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.connector.impl.DiscreteInteractionEndpointImpl
		 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getDiscreteInteractionEndpoint()
		 * @generated
		 */
		EClass DISCRETE_INTERACTION_ENDPOINT = eINSTANCE.getDiscreteInteractionEndpoint();

		/**
		 * The meta object literal for the '<em><b>Sender Message Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES = eINSTANCE.getDiscreteInteractionEndpoint_SenderMessageTypes();

		/**
		 * The meta object literal for the '<em><b>Receiver Message Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES = eINSTANCE.getDiscreteInteractionEndpoint_ReceiverMessageTypes();

		/**
		 * The meta object literal for the '<em><b>Coordinator Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_INTERACTION_ENDPOINT__COORDINATOR_BEHAVIOR = eINSTANCE.getDiscreteInteractionEndpoint_CoordinatorBehavior();

		/**
		 * The meta object literal for the '<em><b>Subrole Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_INTERACTION_ENDPOINT__SUBROLE_BEHAVIOR = eINSTANCE.getDiscreteInteractionEndpoint_SubroleBehavior();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_INTERACTION_ENDPOINT__CARDINALITY = eINSTANCE.getDiscreteInteractionEndpoint_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Receiver Message Buffer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER = eINSTANCE.getDiscreteInteractionEndpoint_ReceiverMessageBuffer();

		/**
		 * The meta object literal for the '<em><b>Multi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_INTERACTION_ENDPOINT__MULTI = eINSTANCE.getDiscreteInteractionEndpoint_Multi();

		/**
		 * The meta object literal for the '{@link org.muml.pim.connector.impl.DiscreteInteractionEndpointInstanceImpl <em>Discrete Interaction Endpoint Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.connector.impl.DiscreteInteractionEndpointInstanceImpl
		 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getDiscreteInteractionEndpointInstance()
		 * @generated
		 */
		EClass DISCRETE_INTERACTION_ENDPOINT_INSTANCE = eINSTANCE.getDiscreteInteractionEndpointInstance();

		/**
		 * The meta object literal for the '{@link org.muml.pim.connector.impl.DiscreteSingleInteractionEndpointInstanceImpl <em>Discrete Single Interaction Endpoint Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.connector.impl.DiscreteSingleInteractionEndpointInstanceImpl
		 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getDiscreteSingleInteractionEndpointInstance()
		 * @generated
		 */
		EClass DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE = eINSTANCE.getDiscreteSingleInteractionEndpointInstance();

		/**
		 * The meta object literal for the '<em><b>Multi Interaction Endpoint Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE = eINSTANCE.getDiscreteSingleInteractionEndpointInstance_MultiInteractionEndpointInstance();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__NEXT = eINSTANCE.getDiscreteSingleInteractionEndpointInstance_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__PREVIOUS = eINSTANCE.getDiscreteSingleInteractionEndpointInstance_Previous();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__FIRST = eINSTANCE.getDiscreteSingleInteractionEndpointInstance_First();

		/**
		 * The meta object literal for the '<em><b>Last</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__LAST = eINSTANCE.getDiscreteSingleInteractionEndpointInstance_Last();

		/**
		 * The meta object literal for the '{@link org.muml.pim.connector.impl.DiscreteMultiInteractionEndpointInstanceImpl <em>Discrete Multi Interaction Endpoint Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.connector.impl.DiscreteMultiInteractionEndpointInstanceImpl
		 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getDiscreteMultiInteractionEndpointInstance()
		 * @generated
		 */
		EClass DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE = eINSTANCE.getDiscreteMultiInteractionEndpointInstance();

		/**
		 * The meta object literal for the '<em><b>Sub Interaction Endpoint Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES = eINSTANCE.getDiscreteMultiInteractionEndpointInstance_SubInteractionEndpointInstances();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__FIRST = eINSTANCE.getDiscreteMultiInteractionEndpointInstance_First();

		/**
		 * The meta object literal for the '<em><b>Last</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__LAST = eINSTANCE.getDiscreteMultiInteractionEndpointInstance_Last();

		/**
		 * The meta object literal for the '{@link org.muml.pim.connector.impl.MessageBufferImpl <em>Message Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.connector.impl.MessageBufferImpl
		 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getMessageBuffer()
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
		 * The meta object literal for the '<em><b>Discrete Interaction Endpoint</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT = eINSTANCE.getMessageBuffer_DiscreteInteractionEndpoint();

		/**
		 * The meta object literal for the '<em><b>Buffer Overflow Avoidance Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_BUFFER__BUFFER_OVERFLOW_AVOIDANCE_STRATEGY = eINSTANCE.getMessageBuffer_BufferOverflowAvoidanceStrategy();

		/**
		 * The meta object literal for the '<em><b>Gmf Message Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_BUFFER__GMF_MESSAGE_TYPES = eINSTANCE.getMessageBuffer_GmfMessageTypes();

		/**
		 * The meta object literal for the '{@link org.muml.pim.connector.BufferOverflowAvoidanceStrategy <em>Buffer Overflow Avoidance Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.connector.BufferOverflowAvoidanceStrategy
		 * @see org.muml.pim.connector.impl.ConnectorPackageImpl#getBufferOverflowAvoidanceStrategy()
		 * @generated
		 */
		EEnum BUFFER_OVERFLOW_AVOIDANCE_STRATEGY = eINSTANCE.getBufferOverflowAvoidanceStrategy();

	}

} //ConnectorPackage
