/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * <!-- begin-model-doc -->
 * The package components contains all classes for modeling atomic and structured components.
 * Components are defined on the type level and may be instantiated in a component instance configuration.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ComponentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "component";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/model/component/0.3.8";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "component";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentPackage eINSTANCE = de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONSTRAINT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Referencing Component Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REFERENCING_COMPONENT_PARTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ANNOTATION = ConnectorPackage.CONNECTOR_ENDPOINT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__EXTENSION = ConnectorPackage.CONNECTOR_ENDPOINT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = ConnectorPackage.CONNECTOR_ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__COMMENT = ConnectorPackage.CONNECTOR_ENDPOINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CONNECTORS = ConnectorPackage.CONNECTOR_ENDPOINT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CONSTRAINT = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__COMPONENT = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT_CONNECTORS = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.DirectedTypedPortImpl <em>Directed Typed Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.DirectedTypedPortImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getDirectedTypedPort()
	 * @generated
	 */
	int DIRECTED_TYPED_PORT = 13;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__ANNOTATION = PORT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__EXTENSION = PORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__COMMENT = PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__CONNECTORS = PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__CONSTRAINT = PORT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__COMPONENT = PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Port Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__PORT_CONNECTORS = PORT__PORT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__KIND = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__TYPE = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Directed Typed Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.ContinuousPortImpl <em>Continuous Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ContinuousPortImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getContinuousPort()
	 * @generated
	 */
	int CONTINUOUS_PORT = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__ANNOTATION = DIRECTED_TYPED_PORT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__EXTENSION = DIRECTED_TYPED_PORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__NAME = DIRECTED_TYPED_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__COMMENT = DIRECTED_TYPED_PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__CONNECTORS = DIRECTED_TYPED_PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__CONSTRAINT = DIRECTED_TYPED_PORT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__COMPONENT = DIRECTED_TYPED_PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Port Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__PORT_CONNECTORS = DIRECTED_TYPED_PORT__PORT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__KIND = DIRECTED_TYPED_PORT__KIND;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__TYPE = DIRECTED_TYPED_PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Is Continuous In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__IS_CONTINUOUS_IN_PORT = DIRECTED_TYPED_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Continuous Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__IS_CONTINUOUS_OUT_PORT = DIRECTED_TYPED_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Continuous Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_FEATURE_COUNT = DIRECTED_TYPED_PORT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl <em>Discrete Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getDiscretePort()
	 * @generated
	 */
	int DISCRETE_PORT = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__ANNOTATION = PORT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__EXTENSION = PORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__COMMENT = PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__CONNECTORS = PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__CONSTRAINT = PORT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__COMPONENT = PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Port Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__PORT_CONNECTORS = PORT__PORT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__BEHAVIOR = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__SENDER_MESSAGE_TYPES = PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__RECEIVER_MESSAGE_TYPES = PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__ADAPTATION_BEHAVIOR = PORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role And Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR = PORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__CARDINALITY = PORT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__REFINES = PORT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Discrete In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__IS_DISCRETE_IN_PORT = PORT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Discrete Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__IS_DISCRETE_OUT_PORT = PORT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Discrete In Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__IS_DISCRETE_IN_OUT_PORT = PORT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER = PORT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Multi Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__MULTI_PORT = PORT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Discrete Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getComponentPart()
	 * @generated
	 */
	int COMPONENT_PART = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__NAME = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__COMPONENT_TYPE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__PARENT_COMPONENT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assembly Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__ASSEMBLY_CONNECTORS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Delegation Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__DELEGATION_CONNECTORS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__CARDINALITY = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__PORTS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Multi Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__MULTI_PART = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.StructuredComponentImpl <em>Structured Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.StructuredComponentImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getStructuredComponent()
	 * @generated
	 */
	int STRUCTURED_COMPONENT = 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__ANNOTATION = COMPONENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__EXTENSION = COMPONENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__COMMENT = COMPONENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__CONSTRAINT = COMPONENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__PORTS = COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Referencing Component Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__REFERENCING_COMPONENT_PARTS = COMPONENT__REFERENCING_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__COMPONENT_TYPE = COMPONENT__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Embedded Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__EMBEDDED_PARTS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__CONNECTORS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Structured Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Atomic Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Structured Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.StaticStructuredComponentImpl <em>Static Structured Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.StaticStructuredComponentImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getStaticStructuredComponent()
	 * @generated
	 */
	int STATIC_STRUCTURED_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__ANNOTATION = STRUCTURED_COMPONENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__EXTENSION = STRUCTURED_COMPONENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__NAME = STRUCTURED_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__COMMENT = STRUCTURED_COMPONENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__CONSTRAINT = STRUCTURED_COMPONENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__PORTS = STRUCTURED_COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Referencing Component Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__REFERENCING_COMPONENT_PARTS = STRUCTURED_COMPONENT__REFERENCING_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__COMPONENT_TYPE = STRUCTURED_COMPONENT__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Embedded Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__EMBEDDED_PARTS = STRUCTURED_COMPONENT__EMBEDDED_PARTS;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__CONNECTORS = STRUCTURED_COMPONENT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>All Structured Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS = STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>All Atomic Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS = STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS;

	/**
	 * The number of structural features of the '<em>Static Structured Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT_FEATURE_COUNT = STRUCTURED_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.AtomicComponentImpl <em>Atomic Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.AtomicComponentImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getAtomicComponent()
	 * @generated
	 */
	int ATOMIC_COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__ANNOTATION = COMPONENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__EXTENSION = COMPONENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__COMMENT = COMPONENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__CONSTRAINT = COMPONENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__PORTS = COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Referencing Component Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__REFERENCING_COMPONENT_PARTS = COMPONENT__REFERENCING_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__COMPONENT_TYPE = COMPONENT__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__BEHAVIOR = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortConnectorImpl <em>Port Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.PortConnectorImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getPortConnector()
	 * @generated
	 */
	int PORT_CONNECTOR = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__ANNOTATION = ConnectorPackage.CONNECTOR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__EXTENSION = ConnectorPackage.CONNECTOR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__COMMENT = ConnectorPackage.CONNECTOR__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__CONNECTOR_ENDPOINTS = ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__PARENT_COMPONENT = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__PORTS = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_FEATURE_COUNT = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.AssemblyConnectorImpl <em>Assembly Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.AssemblyConnectorImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getAssemblyConnector()
	 * @generated
	 */
	int ASSEMBLY_CONNECTOR = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__ANNOTATION = PORT_CONNECTOR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__EXTENSION = PORT_CONNECTOR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__COMMENT = PORT_CONNECTOR__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__CONNECTOR_ENDPOINTS = PORT_CONNECTOR__CONNECTOR_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__PARENT_COMPONENT = PORT_CONNECTOR__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__PORTS = PORT_CONNECTOR__PORTS;

	/**
	 * The feature id for the '<em><b>Coordination Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL = PORT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__COMPONENT_PARTS = PORT_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assembly Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_FEATURE_COUNT = PORT_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.DelegationConnectorImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getDelegationConnector()
	 * @generated
	 */
	int DELEGATION_CONNECTOR = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__ANNOTATION = PORT_CONNECTOR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__EXTENSION = PORT_CONNECTOR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__COMMENT = PORT_CONNECTOR__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__CONNECTOR_ENDPOINTS = PORT_CONNECTOR__CONNECTOR_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__PARENT_COMPONENT = PORT_CONNECTOR__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__PORTS = PORT_CONNECTOR__PORTS;

	/**
	 * The feature id for the '<em><b>Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__COMPONENT_PART = PORT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_FEATURE_COUNT = PORT_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl <em>Hybrid Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getHybridPort()
	 * @generated
	 */
	int HYBRID_PORT = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__ANNOTATION = DIRECTED_TYPED_PORT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__EXTENSION = DIRECTED_TYPED_PORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__NAME = DIRECTED_TYPED_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__COMMENT = DIRECTED_TYPED_PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__CONNECTORS = DIRECTED_TYPED_PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__CONSTRAINT = DIRECTED_TYPED_PORT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__COMPONENT = DIRECTED_TYPED_PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Port Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__PORT_CONNECTORS = DIRECTED_TYPED_PORT__PORT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__KIND = DIRECTED_TYPED_PORT__KIND;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__TYPE = DIRECTED_TYPED_PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__DATA_TYPE = DIRECTED_TYPED_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Hybrid In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__IS_HYBRID_IN_PORT = DIRECTED_TYPED_PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Hybrid Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__IS_HYBRID_OUT_PORT = DIRECTED_TYPED_PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sampling Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__SAMPLING_INTERVAL = DIRECTED_TYPED_PORT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Hybrid Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_FEATURE_COUNT = DIRECTED_TYPED_PORT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.CoordinationProtocolOccurrenceImpl <em>Coordination Protocol Occurrence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.CoordinationProtocolOccurrenceImpl
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getCoordinationProtocolOccurrence()
	 * @generated
	 */
	int COORDINATION_PROTOCOL_OCCURRENCE = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_OCCURRENCE__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_OCCURRENCE__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_OCCURRENCE__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Coordination Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_OCCURRENCE__COORDINATION_PROTOCOL = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_OCCURRENCE__PORTS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coordination Protocol Occurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_OCCURRENCE_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentKind <em>Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentKind
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getComponentKind()
	 * @generated
	 */
	int COMPONENT_KIND = 14;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind <em>Continuous Port Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind
	 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getContinuousPortDirectionKind()
	 * @generated
	 */
	int CONTINUOUS_PORT_DIRECTION_KIND = 15;

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.component.Component#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Component#getPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Ports();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.component.Component#getReferencingComponentParts <em>Referencing Component Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referencing Component Parts</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Component#getReferencingComponentParts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ReferencingComponentParts();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.Component#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Component#getComponentType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ComponentType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.component.Port#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Port#getComponent()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Component();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.component.Port#getPortConnectors <em>Port Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Connectors</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.Port#getPortConnectors()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_PortConnectors();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort <em>Continuous Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ContinuousPort
	 * @generated
	 */
	EClass getContinuousPort();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#isIsContinuousInPort <em>Is Continuous In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Continuous In Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#isIsContinuousInPort()
	 * @see #getContinuousPort()
	 * @generated
	 */
	EAttribute getContinuousPort_IsContinuousInPort();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#isIsContinuousOutPort <em>Is Continuous Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Continuous Out Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ContinuousPort#isIsContinuousOutPort()
	 * @see #getContinuousPort()
	 * @generated
	 */
	EAttribute getContinuousPort_IsContinuousOutPort();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort <em>Discrete Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort
	 * @generated
	 */
	EClass getDiscretePort();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refines</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getRefines()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EReference getDiscretePort_Refines();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#isIsDiscreteInPort <em>Is Discrete In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Discrete In Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort#isIsDiscreteInPort()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EAttribute getDiscretePort_IsDiscreteInPort();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#isIsDiscreteOutPort <em>Is Discrete Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Discrete Out Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort#isIsDiscreteOutPort()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EAttribute getDiscretePort_IsDiscreteOutPort();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#isIsDiscreteInOutPort <em>Is Discrete In Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Discrete In Out Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort#isIsDiscreteInOutPort()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EAttribute getDiscretePort_IsDiscreteInOutPort();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receiver Message Buffer</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort#getReceiverMessageBuffer()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EReference getDiscretePort_ReceiverMessageBuffer();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePort#isMultiPort <em>Multi Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePort#isMultiPort()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EAttribute getDiscretePort_MultiPort();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart
	 * @generated
	 */
	EClass getComponentPart();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getComponentType()
	 * @see #getComponentPart()
	 * @generated
	 */
	EReference getComponentPart_ComponentType();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getParentComponent <em>Parent Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getParentComponent()
	 * @see #getComponentPart()
	 * @generated
	 */
	EReference getComponentPart_ParentComponent();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getAssemblyConnectors <em>Assembly Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assembly Connectors</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getAssemblyConnectors()
	 * @see #getComponentPart()
	 * @generated
	 */
	EReference getComponentPart_AssemblyConnectors();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getDelegationConnectors <em>Delegation Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegation Connectors</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getDelegationConnectors()
	 * @see #getComponentPart()
	 * @generated
	 */
	EReference getComponentPart_DelegationConnectors();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#isMultiPart <em>Multi Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#isMultiPart()
	 * @see #getComponentPart()
	 * @generated
	 */
	EAttribute getComponentPart_MultiPart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.StaticStructuredComponent <em>Static Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Structured Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.StaticStructuredComponent
	 * @generated
	 */
	EClass getStaticStructuredComponent();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getCardinality()
	 * @see #getComponentPart()
	 * @generated
	 */
	EReference getComponentPart_Cardinality();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getPorts()
	 * @see #getComponentPart()
	 * @generated
	 */
	EReference getComponentPart_Ports();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent <em>Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.StructuredComponent
	 * @generated
	 */
	EClass getStructuredComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getEmbeddedParts <em>Embedded Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Parts</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getEmbeddedParts()
	 * @see #getStructuredComponent()
	 * @generated
	 */
	EReference getStructuredComponent_EmbeddedParts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getConnectors()
	 * @see #getStructuredComponent()
	 * @generated
	 */
	EReference getStructuredComponent_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getAllStructuredComponents <em>All Structured Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Structured Components</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getAllStructuredComponents()
	 * @see #getStructuredComponent()
	 * @generated
	 */
	EReference getStructuredComponent_AllStructuredComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getAllAtomicComponents <em>All Atomic Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Atomic Components</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getAllAtomicComponents()
	 * @see #getStructuredComponent()
	 * @generated
	 */
	EReference getStructuredComponent_AllAtomicComponents();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.DirectedTypedPort <em>Directed Typed Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Typed Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DirectedTypedPort
	 * @generated
	 */
	EClass getDirectedTypedPort();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.DirectedTypedPort#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DirectedTypedPort#getKind()
	 * @see #getDirectedTypedPort()
	 * @generated
	 */
	EAttribute getDirectedTypedPort_Kind();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.DirectedTypedPort#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DirectedTypedPort#getType()
	 * @see #getDirectedTypedPort()
	 * @generated
	 */
	EReference getDirectedTypedPort_Type();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.AtomicComponent <em>Atomic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.AtomicComponent
	 * @generated
	 */
	EClass getAtomicComponent();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.PortConnector <em>Port Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.PortConnector
	 * @generated
	 */
	EClass getPortConnector();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.component.PortConnector#getParentComponent <em>Parent Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.PortConnector#getParentComponent()
	 * @see #getPortConnector()
	 * @generated
	 */
	EReference getPortConnector_ParentComponent();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.component.PortConnector#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.PortConnector#getPorts()
	 * @see #getPortConnector()
	 * @generated
	 */
	EReference getPortConnector_Ports();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Connector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector
	 * @generated
	 */
	EClass getAssemblyConnector();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector#getCoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordination Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector#getCoordinationProtocol()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_CoordinationProtocol();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector#getComponentParts <em>Component Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component Parts</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector#getComponentParts()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_ComponentParts();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.DelegationConnector <em>Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Connector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DelegationConnector
	 * @generated
	 */
	EClass getDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.DelegationConnector#getComponentPart <em>Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.DelegationConnector#getComponentPart()
	 * @see #getDelegationConnector()
	 * @generated
	 */
	EReference getDelegationConnector_ComponentPart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.HybridPort <em>Hybrid Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.HybridPort
	 * @generated
	 */
	EClass getHybridPort();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.HybridPort#isIsHybridInPort <em>Is Hybrid In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Hybrid In Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.HybridPort#isIsHybridInPort()
	 * @see #getHybridPort()
	 * @generated
	 */
	EAttribute getHybridPort_IsHybridInPort();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.component.HybridPort#isIsHybridOutPort <em>Is Hybrid Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Hybrid Out Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.HybridPort#isIsHybridOutPort()
	 * @see #getHybridPort()
	 * @generated
	 */
	EAttribute getHybridPort_IsHybridOutPort();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.component.HybridPort#getSamplingInterval <em>Sampling Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sampling Interval</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.HybridPort#getSamplingInterval()
	 * @see #getHybridPort()
	 * @generated
	 */
	EReference getHybridPort_SamplingInterval();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.component.CoordinationProtocolOccurrence <em>Coordination Protocol Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Protocol Occurrence</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.CoordinationProtocolOccurrence
	 * @generated
	 */
	EClass getCoordinationProtocolOccurrence();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.component.CoordinationProtocolOccurrence#getCoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordination Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.CoordinationProtocolOccurrence#getCoordinationProtocol()
	 * @see #getCoordinationProtocolOccurrence()
	 * @generated
	 */
	EReference getCoordinationProtocolOccurrence_CoordinationProtocol();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.component.CoordinationProtocolOccurrence#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.CoordinationProtocolOccurrence#getPorts()
	 * @see #getCoordinationProtocolOccurrence()
	 * @generated
	 */
	EReference getCoordinationProtocolOccurrence_Ports();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentKind
	 * @generated
	 */
	EEnum getComponentKind();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind <em>Continuous Port Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Continuous Port Direction Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind
	 * @generated
	 */
	EEnum getContinuousPortDirectionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentFactory getComponentFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PORTS = eINSTANCE.getComponent_Ports();

		/**
		 * The meta object literal for the '<em><b>Referencing Component Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REFERENCING_COMPONENT_PARTS = eINSTANCE.getComponent_ReferencingComponentParts();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMPONENT_TYPE = eINSTANCE.getComponent_ComponentType();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.PortImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__COMPONENT = eINSTANCE.getPort_Component();

		/**
		 * The meta object literal for the '<em><b>Port Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__PORT_CONNECTORS = eINSTANCE.getPort_PortConnectors();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.ContinuousPortImpl <em>Continuous Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ContinuousPortImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getContinuousPort()
		 * @generated
		 */
		EClass CONTINUOUS_PORT = eINSTANCE.getContinuousPort();

		/**
		 * The meta object literal for the '<em><b>Is Continuous In Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINUOUS_PORT__IS_CONTINUOUS_IN_PORT = eINSTANCE.getContinuousPort_IsContinuousInPort();

		/**
		 * The meta object literal for the '<em><b>Is Continuous Out Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINUOUS_PORT__IS_CONTINUOUS_OUT_PORT = eINSTANCE.getContinuousPort_IsContinuousOutPort();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl <em>Discrete Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getDiscretePort()
		 * @generated
		 */
		EClass DISCRETE_PORT = eINSTANCE.getDiscretePort();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT__REFINES = eINSTANCE.getDiscretePort_Refines();

		/**
		 * The meta object literal for the '<em><b>Is Discrete In Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_PORT__IS_DISCRETE_IN_PORT = eINSTANCE.getDiscretePort_IsDiscreteInPort();

		/**
		 * The meta object literal for the '<em><b>Is Discrete Out Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_PORT__IS_DISCRETE_OUT_PORT = eINSTANCE.getDiscretePort_IsDiscreteOutPort();

		/**
		 * The meta object literal for the '<em><b>Is Discrete In Out Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_PORT__IS_DISCRETE_IN_OUT_PORT = eINSTANCE.getDiscretePort_IsDiscreteInOutPort();

		/**
		 * The meta object literal for the '<em><b>Receiver Message Buffer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER = eINSTANCE.getDiscretePort_ReceiverMessageBuffer();

		/**
		 * The meta object literal for the '<em><b>Multi Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_PORT__MULTI_PORT = eINSTANCE.getDiscretePort_MultiPort();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getComponentPart()
		 * @generated
		 */
		EClass COMPONENT_PART = eINSTANCE.getComponentPart();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PART__COMPONENT_TYPE = eINSTANCE.getComponentPart_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Parent Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PART__PARENT_COMPONENT = eINSTANCE.getComponentPart_ParentComponent();

		/**
		 * The meta object literal for the '<em><b>Assembly Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PART__ASSEMBLY_CONNECTORS = eINSTANCE.getComponentPart_AssemblyConnectors();

		/**
		 * The meta object literal for the '<em><b>Delegation Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PART__DELEGATION_CONNECTORS = eINSTANCE.getComponentPart_DelegationConnectors();

		/**
		 * The meta object literal for the '<em><b>Multi Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_PART__MULTI_PART = eINSTANCE.getComponentPart_MultiPart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.StaticStructuredComponentImpl <em>Static Structured Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.StaticStructuredComponentImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getStaticStructuredComponent()
		 * @generated
		 */
		EClass STATIC_STRUCTURED_COMPONENT = eINSTANCE.getStaticStructuredComponent();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PART__CARDINALITY = eINSTANCE.getComponentPart_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PART__PORTS = eINSTANCE.getComponentPart_Ports();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.StructuredComponentImpl <em>Structured Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.StructuredComponentImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getStructuredComponent()
		 * @generated
		 */
		EClass STRUCTURED_COMPONENT = eINSTANCE.getStructuredComponent();

		/**
		 * The meta object literal for the '<em><b>Embedded Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_COMPONENT__EMBEDDED_PARTS = eINSTANCE.getStructuredComponent_EmbeddedParts();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_COMPONENT__CONNECTORS = eINSTANCE.getStructuredComponent_Connectors();

		/**
		 * The meta object literal for the '<em><b>All Structured Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS = eINSTANCE.getStructuredComponent_AllStructuredComponents();

		/**
		 * The meta object literal for the '<em><b>All Atomic Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS = eINSTANCE.getStructuredComponent_AllAtomicComponents();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.DirectedTypedPortImpl <em>Directed Typed Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.DirectedTypedPortImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getDirectedTypedPort()
		 * @generated
		 */
		EClass DIRECTED_TYPED_PORT = eINSTANCE.getDirectedTypedPort();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTED_TYPED_PORT__KIND = eINSTANCE.getDirectedTypedPort_Kind();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_TYPED_PORT__TYPE = eINSTANCE.getDirectedTypedPort_Type();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.AtomicComponentImpl <em>Atomic Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.AtomicComponentImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getAtomicComponent()
		 * @generated
		 */
		EClass ATOMIC_COMPONENT = eINSTANCE.getAtomicComponent();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.PortConnectorImpl <em>Port Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.PortConnectorImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getPortConnector()
		 * @generated
		 */
		EClass PORT_CONNECTOR = eINSTANCE.getPortConnector();

		/**
		 * The meta object literal for the '<em><b>Parent Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTOR__PARENT_COMPONENT = eINSTANCE.getPortConnector_ParentComponent();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTOR__PORTS = eINSTANCE.getPortConnector_Ports();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.AssemblyConnectorImpl <em>Assembly Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.AssemblyConnectorImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getAssemblyConnector()
		 * @generated
		 */
		EClass ASSEMBLY_CONNECTOR = eINSTANCE.getAssemblyConnector();

		/**
		 * The meta object literal for the '<em><b>Coordination Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL = eINSTANCE.getAssemblyConnector_CoordinationProtocol();

		/**
		 * The meta object literal for the '<em><b>Component Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__COMPONENT_PARTS = eINSTANCE.getAssemblyConnector_ComponentParts();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.DelegationConnectorImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getDelegationConnector()
		 * @generated
		 */
		EClass DELEGATION_CONNECTOR = eINSTANCE.getDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Component Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR__COMPONENT_PART = eINSTANCE.getDelegationConnector_ComponentPart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl <em>Hybrid Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getHybridPort()
		 * @generated
		 */
		EClass HYBRID_PORT = eINSTANCE.getHybridPort();

		/**
		 * The meta object literal for the '<em><b>Is Hybrid In Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYBRID_PORT__IS_HYBRID_IN_PORT = eINSTANCE.getHybridPort_IsHybridInPort();

		/**
		 * The meta object literal for the '<em><b>Is Hybrid Out Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYBRID_PORT__IS_HYBRID_OUT_PORT = eINSTANCE.getHybridPort_IsHybridOutPort();

		/**
		 * The meta object literal for the '<em><b>Sampling Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_PORT__SAMPLING_INTERVAL = eINSTANCE.getHybridPort_SamplingInterval();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.impl.CoordinationProtocolOccurrenceImpl <em>Coordination Protocol Occurrence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.CoordinationProtocolOccurrenceImpl
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getCoordinationProtocolOccurrence()
		 * @generated
		 */
		EClass COORDINATION_PROTOCOL_OCCURRENCE = eINSTANCE.getCoordinationProtocolOccurrence();

		/**
		 * The meta object literal for the '<em><b>Coordination Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PROTOCOL_OCCURRENCE__COORDINATION_PROTOCOL = eINSTANCE.getCoordinationProtocolOccurrence_CoordinationProtocol();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PROTOCOL_OCCURRENCE__PORTS = eINSTANCE.getCoordinationProtocolOccurrence_Ports();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentKind <em>Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentKind
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getComponentKind()
		 * @generated
		 */
		EEnum COMPONENT_KIND = eINSTANCE.getComponentKind();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind <em>Continuous Port Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind
		 * @see de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl#getContinuousPortDirectionKind()
		 * @generated
		 */
		EEnum CONTINUOUS_PORT_DIRECTION_KIND = eINSTANCE.getContinuousPortDirectionKind();

	}

} //ComponentPackage
