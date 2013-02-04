/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.connector;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.CorePackage;

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
 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorFactory
 * @model kind="package"
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
	String eNS_URI = "http://www.fujaba.de/muml/connector/0.3.15";

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
	ConnectorPackage eINSTANCE = de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.connector.impl.ConnectorEndpointImpl <em>Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorEndpointImpl
	 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl#getConnectorEndpoint()
	 * @generated
	 */
	int CONNECTOR_ENDPOINT = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT__CONNECTORS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.connector.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorImpl
	 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

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
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.connector.impl.ConnectorEndpointInstanceImpl <em>Endpoint Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorEndpointInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl#getConnectorEndpointInstance()
	 * @generated
	 */
	int CONNECTOR_ENDPOINT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT_INSTANCE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ENDPOINT_INSTANCE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.connector.impl.ConnectorInstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl#getConnectorInstance()
	 * @generated
	 */
	int CONNECTOR_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_INSTANCE__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.connector.impl.DiscreteInteractionEndpointImpl <em>Discrete Interaction Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.connector.impl.DiscreteInteractionEndpointImpl
	 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl#getDiscreteInteractionEndpoint()
	 * @generated
	 */
	int DISCRETE_INTERACTION_ENDPOINT = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__ANNOTATION = CONNECTOR_ENDPOINT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__EXTENSION = CONNECTOR_ENDPOINT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__NAME = CONNECTOR_ENDPOINT__NAME;

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
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__CONSTRAINT = CONNECTOR_ENDPOINT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__ADAPTATION_BEHAVIOR = CONNECTOR_ENDPOINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role And Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__ROLE_AND_ADAPTATION_BEHAVIOR = CONNECTOR_ENDPOINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT__CARDINALITY = CONNECTOR_ENDPOINT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Discrete Interaction Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_FEATURE_COUNT = CONNECTOR_ENDPOINT_FEATURE_COUNT + 7;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.connector.impl.DiscreteInteractionEndpointInstanceImpl <em>Discrete Interaction Endpoint Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.connector.impl.DiscreteInteractionEndpointInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl#getDiscreteInteractionEndpointInstance()
	 * @generated
	 */
	int DISCRETE_INTERACTION_ENDPOINT_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_INSTANCE__ANNOTATION = CONNECTOR_ENDPOINT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INTERACTION_ENDPOINT_INSTANCE__EXTENSION = CONNECTOR_ENDPOINT_INSTANCE__EXTENSION;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.connector.impl.DiscreteSingleInteractionEndpointInstanceImpl <em>Discrete Single Interaction Endpoint Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.connector.impl.DiscreteSingleInteractionEndpointInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl#getDiscreteSingleInteractionEndpointInstance()
	 * @generated
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__ANNOTATION = DISCRETE_INTERACTION_ENDPOINT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__EXTENSION = DISCRETE_INTERACTION_ENDPOINT_INSTANCE__EXTENSION;

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
	 * The number of structural features of the '<em>Discrete Single Interaction Endpoint Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT = DISCRETE_INTERACTION_ENDPOINT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.connector.impl.DiscreteMultiInteractionEndpointInstanceImpl <em>Discrete Multi Interaction Endpoint Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.connector.impl.DiscreteMultiInteractionEndpointInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl#getDiscreteMultiInteractionEndpointInstance()
	 * @generated
	 */
	int DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__ANNOTATION = DISCRETE_INTERACTION_ENDPOINT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__EXTENSION = DISCRETE_INTERACTION_ENDPOINT_INSTANCE__EXTENSION;

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
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint
	 * @generated
	 */
	EClass getConnectorEndpoint();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connectors</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint#getConnectors()
	 * @see #getConnectorEndpoint()
	 * @generated
	 */
	EReference getConnectorEndpoint_Connectors();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.connector.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.connector.Connector#getConnectorEndpoints <em>Connector Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connector Endpoints</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.Connector#getConnectorEndpoints()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_ConnectorEndpoints();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance <em>Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance
	 * @generated
	 */
	EClass getConnectorEndpointInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance#getConnectorInstances <em>Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connector Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance#getConnectorInstances()
	 * @see #getConnectorEndpointInstance()
	 * @generated
	 */
	EReference getConnectorEndpointInstance_ConnectorInstances();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance#getType()
	 * @see #getConnectorEndpointInstance()
	 * @generated
	 */
	EReference getConnectorEndpointInstance_Type();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.connector.ConnectorInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorInstance
	 * @generated
	 */
	EClass getConnectorInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.connector.ConnectorInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorInstance#getType()
	 * @see #getConnectorInstance()
	 * @generated
	 */
	EReference getConnectorInstance_Type();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.connector.ConnectorInstance#getConnectorEndpointInstances <em>Connector Endpoint Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connector Endpoint Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorInstance#getConnectorEndpointInstances()
	 * @see #getConnectorInstance()
	 * @generated
	 */
	EReference getConnectorInstance_ConnectorEndpointInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint <em>Discrete Interaction Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Interaction Endpoint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint
	 * @generated
	 */
	EClass getDiscreteInteractionEndpoint();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint#getSenderMessageTypes <em>Sender Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sender Message Types</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint#getSenderMessageTypes()
	 * @see #getDiscreteInteractionEndpoint()
	 * @generated
	 */
	EReference getDiscreteInteractionEndpoint_SenderMessageTypes();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint#getReceiverMessageTypes <em>Receiver Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receiver Message Types</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint#getReceiverMessageTypes()
	 * @see #getDiscreteInteractionEndpoint()
	 * @generated
	 */
	EReference getDiscreteInteractionEndpoint_ReceiverMessageTypes();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint#getAdaptationBehavior <em>Adaptation Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adaptation Behavior</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint#getAdaptationBehavior()
	 * @see #getDiscreteInteractionEndpoint()
	 * @generated
	 */
	EReference getDiscreteInteractionEndpoint_AdaptationBehavior();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint#getRoleAndAdaptationBehavior <em>Role And Adaptation Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role And Adaptation Behavior</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint#getRoleAndAdaptationBehavior()
	 * @see #getDiscreteInteractionEndpoint()
	 * @generated
	 */
	EReference getDiscreteInteractionEndpoint_RoleAndAdaptationBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint#getCardinality()
	 * @see #getDiscreteInteractionEndpoint()
	 * @generated
	 */
	EReference getDiscreteInteractionEndpoint_Cardinality();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpointInstance <em>Discrete Interaction Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Interaction Endpoint Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpointInstance
	 * @generated
	 */
	EClass getDiscreteInteractionEndpointInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance <em>Discrete Single Interaction Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Single Interaction Endpoint Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance
	 * @generated
	 */
	EClass getDiscreteSingleInteractionEndpointInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getMultiInteractionEndpointInstance <em>Multi Interaction Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multi Interaction Endpoint Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getMultiInteractionEndpointInstance()
	 * @see #getDiscreteSingleInteractionEndpointInstance()
	 * @generated
	 */
	EReference getDiscreteSingleInteractionEndpointInstance_MultiInteractionEndpointInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getNext()
	 * @see #getDiscreteSingleInteractionEndpointInstance()
	 * @generated
	 */
	EReference getDiscreteSingleInteractionEndpointInstance_Next();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getPrevious()
	 * @see #getDiscreteSingleInteractionEndpointInstance()
	 * @generated
	 */
	EReference getDiscreteSingleInteractionEndpointInstance_Previous();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance <em>Discrete Multi Interaction Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Multi Interaction Endpoint Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance
	 * @generated
	 */
	EClass getDiscreteMultiInteractionEndpointInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance#getSubInteractionEndpointInstances <em>Sub Interaction Endpoint Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Interaction Endpoint Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance#getSubInteractionEndpointInstances()
	 * @see #getDiscreteMultiInteractionEndpointInstance()
	 * @generated
	 */
	EReference getDiscreteMultiInteractionEndpointInstance_SubInteractionEndpointInstances();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance#getFirst()
	 * @see #getDiscreteMultiInteractionEndpointInstance()
	 * @generated
	 */
	EReference getDiscreteMultiInteractionEndpointInstance_First();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last</em>'.
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance#getLast()
	 * @see #getDiscreteMultiInteractionEndpointInstance()
	 * @generated
	 */
	EReference getDiscreteMultiInteractionEndpointInstance_Last();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.connector.impl.ConnectorEndpointImpl <em>Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorEndpointImpl
		 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl#getConnectorEndpoint()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.connector.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorImpl
		 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl#getConnector()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.connector.impl.ConnectorEndpointInstanceImpl <em>Endpoint Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorEndpointInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl#getConnectorEndpointInstance()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.connector.impl.ConnectorInstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl#getConnectorInstance()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.connector.impl.DiscreteInteractionEndpointImpl <em>Discrete Interaction Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.connector.impl.DiscreteInteractionEndpointImpl
		 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl#getDiscreteInteractionEndpoint()
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
		 * The meta object literal for the '<em><b>Adaptation Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_INTERACTION_ENDPOINT__ADAPTATION_BEHAVIOR = eINSTANCE.getDiscreteInteractionEndpoint_AdaptationBehavior();

		/**
		 * The meta object literal for the '<em><b>Role And Adaptation Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_INTERACTION_ENDPOINT__ROLE_AND_ADAPTATION_BEHAVIOR = eINSTANCE.getDiscreteInteractionEndpoint_RoleAndAdaptationBehavior();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_INTERACTION_ENDPOINT__CARDINALITY = eINSTANCE.getDiscreteInteractionEndpoint_Cardinality();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.connector.impl.DiscreteInteractionEndpointInstanceImpl <em>Discrete Interaction Endpoint Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.connector.impl.DiscreteInteractionEndpointInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl#getDiscreteInteractionEndpointInstance()
		 * @generated
		 */
		EClass DISCRETE_INTERACTION_ENDPOINT_INSTANCE = eINSTANCE.getDiscreteInteractionEndpointInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.connector.impl.DiscreteSingleInteractionEndpointInstanceImpl <em>Discrete Single Interaction Endpoint Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.connector.impl.DiscreteSingleInteractionEndpointInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl#getDiscreteSingleInteractionEndpointInstance()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.connector.impl.DiscreteMultiInteractionEndpointInstanceImpl <em>Discrete Multi Interaction Endpoint Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.connector.impl.DiscreteMultiInteractionEndpointInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl#getDiscreteMultiInteractionEndpointInstance()
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

	}

} //ConnectorPackage
