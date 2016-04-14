/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * The package components contains all classes for modeling atomic and structured components.
 * Components are defined on the type level and may be instantiated in a component instance configuration.
 * <!-- end-model-doc -->
 * @see org.muml.pim.component.ComponentFactory
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
	String eNS_URI = "http://www.muml.org/pim/component/1.0.0";

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
	ComponentPackage eINSTANCE = org.muml.pim.component.impl.ComponentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.pim.component.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.impl.ComponentImpl
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Component Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_KIND = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.impl.PortImpl
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ANNOTATIONS = ConnectorPackage.CONNECTOR_ENDPOINT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__EXTENSIONS = ConnectorPackage.CONNECTOR_ENDPOINT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 0;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.impl.DirectedTypedPortImpl <em>Directed Typed Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.impl.DirectedTypedPortImpl
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getDirectedTypedPort()
	 * @generated
	 */
	int DIRECTED_TYPED_PORT = 13;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__ANNOTATIONS = PORT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__EXTENSIONS = PORT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__NAME = PORT__NAME;

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
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__DATA_TYPE = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__KIND = PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__OPTIONAL = PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__OUT_PORT = PORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__IN_PORT = PORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Initialize Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION = PORT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Directed Typed Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT___GET_EXTENSION__ECLASS = PORT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Directed Typed Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TYPED_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.impl.ContinuousPortImpl <em>Continuous Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.impl.ContinuousPortImpl
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getContinuousPort()
	 * @generated
	 */
	int CONTINUOUS_PORT = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__ANNOTATIONS = DIRECTED_TYPED_PORT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__EXTENSIONS = DIRECTED_TYPED_PORT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__NAME = DIRECTED_TYPED_PORT__NAME;

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
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__DATA_TYPE = DIRECTED_TYPED_PORT__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__KIND = DIRECTED_TYPED_PORT__KIND;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__OPTIONAL = DIRECTED_TYPED_PORT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__OUT_PORT = DIRECTED_TYPED_PORT__OUT_PORT;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__IN_PORT = DIRECTED_TYPED_PORT__IN_PORT;

	/**
	 * The feature id for the '<em><b>Initialize Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT__INITIALIZE_EXPRESSION = DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Continuous Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_FEATURE_COUNT = DIRECTED_TYPED_PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT___GET_EXTENSION__ECLASS = DIRECTED_TYPED_PORT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Continuous Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PORT_OPERATION_COUNT = DIRECTED_TYPED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.impl.DiscretePortImpl <em>Discrete Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.impl.DiscretePortImpl
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getDiscretePort()
	 * @generated
	 */
	int DISCRETE_PORT = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__ANNOTATIONS = PORT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__EXTENSIONS = PORT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__NAME = PORT__NAME;

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
	 * The feature id for the '<em><b>Coordinator Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__COORDINATOR_BEHAVIOR = PORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subrole Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__SUBROLE_BEHAVIOR = PORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__CARDINALITY = PORT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER = PORT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__MULTI = PORT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__REFINED_ROLE = PORT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Discrete In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__IS_DISCRETE_IN_PORT = PORT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Discrete Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__IS_DISCRETE_OUT_PORT = PORT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Discrete In Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__IS_DISCRETE_IN_OUT_PORT = PORT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Multi Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__MULTI_PORT = PORT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Coordination Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT__COORDINATION_PROTOCOL = PORT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Discrete Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT___GET_EXTENSION__ECLASS = PORT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Discrete Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.impl.ComponentPartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.impl.ComponentPartImpl
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getComponentPart()
	 * @generated
	 */
	int COMPONENT_PART = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__COMPONENT_TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__PARENT_COMPONENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__CARDINALITY = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__PORT_PARTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Multi Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART__MULTI_PART = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PART_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.impl.StructuredComponentImpl <em>Structured Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.impl.StructuredComponentImpl
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getStructuredComponent()
	 * @generated
	 */
	int STRUCTURED_COMPONENT = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__ANNOTATIONS = COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__EXTENSIONS = COMPONENT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Component Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__COMPONENT_KIND = COMPONENT__COMPONENT_KIND;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__PORTS = COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Embedded Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__EMBEDDED_COMPONENT_PARTS = COMPONENT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Coordination Protocol Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT__COORDINATION_PROTOCOL_PARTS = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Structured Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT___GET_EXTENSION__ECLASS = COMPONENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT___TO_STRING = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Structured Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.impl.StaticStructuredComponentImpl <em>Static Structured Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.impl.StaticStructuredComponentImpl
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getStaticStructuredComponent()
	 * @generated
	 */
	int STATIC_STRUCTURED_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__ANNOTATIONS = STRUCTURED_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__EXTENSIONS = STRUCTURED_COMPONENT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Component Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__COMPONENT_KIND = STRUCTURED_COMPONENT__COMPONENT_KIND;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__PORTS = STRUCTURED_COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Embedded Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__EMBEDDED_COMPONENT_PARTS = STRUCTURED_COMPONENT__EMBEDDED_COMPONENT_PARTS;

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
	 * The feature id for the '<em><b>Coordination Protocol Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT__COORDINATION_PROTOCOL_PARTS = STRUCTURED_COMPONENT__COORDINATION_PROTOCOL_PARTS;

	/**
	 * The number of structural features of the '<em>Static Structured Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT_FEATURE_COUNT = STRUCTURED_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT___GET_EXTENSION__ECLASS = STRUCTURED_COMPONENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT___TO_STRING = STRUCTURED_COMPONENT___TO_STRING;

	/**
	 * The number of operations of the '<em>Static Structured Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_STRUCTURED_COMPONENT_OPERATION_COUNT = STRUCTURED_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.impl.AtomicComponentImpl <em>Atomic Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.impl.AtomicComponentImpl
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getAtomicComponent()
	 * @generated
	 */
	int ATOMIC_COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__ANNOTATIONS = COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__EXTENSIONS = COMPONENT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Component Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__COMPONENT_KIND = COMPONENT__COMPONENT_KIND;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__PORTS = COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__BEHAVIOR = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verification Constraint Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT__VERIFICATION_CONSTRAINT_REPOSITORIES = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atomic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT___GET_EXTENSION__ECLASS = COMPONENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT___TO_STRING = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Atomic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.impl.PortConnectorImpl <em>Port Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.impl.PortConnectorImpl
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getPortConnector()
	 * @generated
	 */
	int PORT_CONNECTOR = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__ANNOTATIONS = ConnectorPackage.CONNECTOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__EXTENSIONS = ConnectorPackage.CONNECTOR__EXTENSIONS;

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
	 * The feature id for the '<em><b>Self Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__SELF_CONNECTOR = ConnectorPackage.CONNECTOR__SELF_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__PARENT_COMPONENT = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_FEATURE_COUNT = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Port Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_OPERATION_COUNT = ConnectorPackage.CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.impl.AssemblyConnectorImpl <em>Assembly Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.impl.AssemblyConnectorImpl
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getAssemblyConnector()
	 * @generated
	 */
	int ASSEMBLY_CONNECTOR = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__ANNOTATIONS = PORT_CONNECTOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__EXTENSIONS = PORT_CONNECTOR__EXTENSIONS;

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
	 * The feature id for the '<em><b>Self Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__SELF_CONNECTOR = PORT_CONNECTOR__SELF_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__PARENT_COMPONENT = PORT_CONNECTOR__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Coordination Protocol Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL_PART = PORT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__PORT_PARTS = PORT_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assembly Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_FEATURE_COUNT = PORT_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR___GET_EXTENSION__ECLASS = PORT_CONNECTOR___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Assembly Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_OPERATION_COUNT = PORT_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.impl.DelegationConnectorImpl
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getDelegationConnector()
	 * @generated
	 */
	int DELEGATION_CONNECTOR = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__ANNOTATIONS = PORT_CONNECTOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__EXTENSIONS = PORT_CONNECTOR__EXTENSIONS;

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
	 * The feature id for the '<em><b>Self Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__SELF_CONNECTOR = PORT_CONNECTOR__SELF_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__PARENT_COMPONENT = PORT_CONNECTOR__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__PORT_PART = PORT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__PORT = PORT_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_FEATURE_COUNT = PORT_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR___GET_EXTENSION__ECLASS = PORT_CONNECTOR___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_OPERATION_COUNT = PORT_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.impl.HybridPortImpl <em>Hybrid Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.impl.HybridPortImpl
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getHybridPort()
	 * @generated
	 */
	int HYBRID_PORT = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__ANNOTATIONS = DIRECTED_TYPED_PORT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__EXTENSIONS = DIRECTED_TYPED_PORT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__NAME = DIRECTED_TYPED_PORT__NAME;

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
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__DATA_TYPE = DIRECTED_TYPED_PORT__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__KIND = DIRECTED_TYPED_PORT__KIND;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__OPTIONAL = DIRECTED_TYPED_PORT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__OUT_PORT = DIRECTED_TYPED_PORT__OUT_PORT;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__IN_PORT = DIRECTED_TYPED_PORT__IN_PORT;

	/**
	 * The feature id for the '<em><b>Initialize Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__INITIALIZE_EXPRESSION = DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Sampling Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT__SAMPLING_INTERVAL = DIRECTED_TYPED_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hybrid Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_FEATURE_COUNT = DIRECTED_TYPED_PORT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT___GET_EXTENSION__ECLASS = DIRECTED_TYPED_PORT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Hybrid Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_OPERATION_COUNT = DIRECTED_TYPED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.impl.CoordinationProtocolPartImpl <em>Coordination Protocol Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.impl.CoordinationProtocolPartImpl
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getCoordinationProtocolPart()
	 * @generated
	 */
	int COORDINATION_PROTOCOL_PART = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_PART__ANNOTATIONS = CorePackage.COMMENTABLE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_PART__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_PART__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Coordination Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_PART__COORDINATION_PROTOCOL = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_PART__PORT_PARTS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coordination Protocol Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_PART_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_PART___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Coordination Protocol Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_PROTOCOL_PART_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.impl.PortPartImpl <em>Port Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.impl.PortPartImpl
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getPortPart()
	 * @generated
	 */
	int PORT_PART = 14;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PART__ANNOTATIONS = ConnectorPackage.CONNECTOR_ENDPOINT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PART__EXTENSIONS = ConnectorPackage.CONNECTOR_ENDPOINT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PART__COMMENT = ConnectorPackage.CONNECTOR_ENDPOINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PART__CONNECTORS = ConnectorPackage.CONNECTOR_ENDPOINT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PART__PORT_TYPE = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PART__COMPONENT_PART = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coordination Protocol Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PART__COORDINATION_PROTOCOL_PART = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PART__REFINED_ROLE = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PART__NAME = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Port Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PART_FEATURE_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PART___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Port Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PART_OPERATION_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.impl.StaticAtomicComponentImpl <em>Static Atomic Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.impl.StaticAtomicComponentImpl
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getStaticAtomicComponent()
	 * @generated
	 */
	int STATIC_ATOMIC_COMPONENT = 15;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATOMIC_COMPONENT__ANNOTATIONS = ATOMIC_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATOMIC_COMPONENT__EXTENSIONS = ATOMIC_COMPONENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATOMIC_COMPONENT__NAME = ATOMIC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATOMIC_COMPONENT__COMMENT = ATOMIC_COMPONENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Component Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATOMIC_COMPONENT__COMPONENT_KIND = ATOMIC_COMPONENT__COMPONENT_KIND;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATOMIC_COMPONENT__PORTS = ATOMIC_COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATOMIC_COMPONENT__BEHAVIOR = ATOMIC_COMPONENT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Verification Constraint Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATOMIC_COMPONENT__VERIFICATION_CONSTRAINT_REPOSITORIES = ATOMIC_COMPONENT__VERIFICATION_CONSTRAINT_REPOSITORIES;

	/**
	 * The number of structural features of the '<em>Static Atomic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATOMIC_COMPONENT_FEATURE_COUNT = ATOMIC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATOMIC_COMPONENT___GET_EXTENSION__ECLASS = ATOMIC_COMPONENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATOMIC_COMPONENT___TO_STRING = ATOMIC_COMPONENT___TO_STRING;

	/**
	 * The number of operations of the '<em>Static Atomic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ATOMIC_COMPONENT_OPERATION_COUNT = ATOMIC_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.impl.StaticComponentImpl <em>Static Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.impl.StaticComponentImpl
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getStaticComponent()
	 * @generated
	 */
	int STATIC_COMPONENT = 16;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_COMPONENT__ANNOTATIONS = COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_COMPONENT__EXTENSIONS = COMPONENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_COMPONENT__COMMENT = COMPONENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Component Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_COMPONENT__COMPONENT_KIND = COMPONENT__COMPONENT_KIND;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_COMPONENT__PORTS = COMPONENT__PORTS;

	/**
	 * The number of structural features of the '<em>Static Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_COMPONENT___GET_EXTENSION__ECLASS = COMPONENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Static Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.ComponentKind <em>Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.ComponentKind
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getComponentKind()
	 * @generated
	 */
	int COMPONENT_KIND = 17;

	/**
	 * The meta object id for the '{@link org.muml.pim.component.PortDirectionKind <em>Port Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.component.PortDirectionKind
	 * @see org.muml.pim.component.impl.ComponentPackageImpl#getPortDirectionKind()
	 * @generated
	 */
	int PORT_DIRECTION_KIND = 18;

	/**
	 * Returns the meta object for class '{@link org.muml.pim.component.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.muml.pim.component.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.component.Component#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.muml.pim.component.Component#getPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Ports();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.component.Component#getComponentKind <em>Component Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Kind</em>'.
	 * @see org.muml.pim.component.Component#getComponentKind()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ComponentKind();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.component.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.muml.pim.component.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.component.Port#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see org.muml.pim.component.Port#getComponent()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Component();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.component.Port#getPortConnectors <em>Port Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Connectors</em>'.
	 * @see org.muml.pim.component.Port#getPortConnectors()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_PortConnectors();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.component.ContinuousPort <em>Continuous Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Port</em>'.
	 * @see org.muml.pim.component.ContinuousPort
	 * @generated
	 */
	EClass getContinuousPort();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.component.DiscretePort <em>Discrete Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Port</em>'.
	 * @see org.muml.pim.component.DiscretePort
	 * @generated
	 */
	EClass getDiscretePort();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.component.DiscretePort#getRefinedRole <em>Refined Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined Role</em>'.
	 * @see org.muml.pim.component.DiscretePort#getRefinedRole()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EReference getDiscretePort_RefinedRole();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.component.DiscretePort#isIsDiscreteInPort <em>Is Discrete In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Discrete In Port</em>'.
	 * @see org.muml.pim.component.DiscretePort#isIsDiscreteInPort()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EAttribute getDiscretePort_IsDiscreteInPort();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.component.DiscretePort#isIsDiscreteOutPort <em>Is Discrete Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Discrete Out Port</em>'.
	 * @see org.muml.pim.component.DiscretePort#isIsDiscreteOutPort()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EAttribute getDiscretePort_IsDiscreteOutPort();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.component.DiscretePort#isIsDiscreteInOutPort <em>Is Discrete In Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Discrete In Out Port</em>'.
	 * @see org.muml.pim.component.DiscretePort#isIsDiscreteInOutPort()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EAttribute getDiscretePort_IsDiscreteInOutPort();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.component.DiscretePort#isMultiPort <em>Multi Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Port</em>'.
	 * @see org.muml.pim.component.DiscretePort#isMultiPort()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EAttribute getDiscretePort_MultiPort();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.component.DiscretePort#getCoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordination Protocol</em>'.
	 * @see org.muml.pim.component.DiscretePort#getCoordinationProtocol()
	 * @see #getDiscretePort()
	 * @generated
	 */
	EReference getDiscretePort_CoordinationProtocol();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.component.ComponentPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see org.muml.pim.component.ComponentPart
	 * @generated
	 */
	EClass getComponentPart();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.component.ComponentPart#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see org.muml.pim.component.ComponentPart#getComponentType()
	 * @see #getComponentPart()
	 * @generated
	 */
	EReference getComponentPart_ComponentType();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.component.ComponentPart#getParentComponent <em>Parent Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Component</em>'.
	 * @see org.muml.pim.component.ComponentPart#getParentComponent()
	 * @see #getComponentPart()
	 * @generated
	 */
	EReference getComponentPart_ParentComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.component.ComponentPart#isMultiPart <em>Multi Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Part</em>'.
	 * @see org.muml.pim.component.ComponentPart#isMultiPart()
	 * @see #getComponentPart()
	 * @generated
	 */
	EAttribute getComponentPart_MultiPart();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.component.StaticStructuredComponent <em>Static Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Structured Component</em>'.
	 * @see org.muml.pim.component.StaticStructuredComponent
	 * @generated
	 */
	EClass getStaticStructuredComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.component.ComponentPart#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see org.muml.pim.component.ComponentPart#getCardinality()
	 * @see #getComponentPart()
	 * @generated
	 */
	EReference getComponentPart_Cardinality();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.component.ComponentPart#getPortParts <em>Port Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Parts</em>'.
	 * @see org.muml.pim.component.ComponentPart#getPortParts()
	 * @see #getComponentPart()
	 * @generated
	 */
	EReference getComponentPart_PortParts();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.component.StructuredComponent <em>Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Component</em>'.
	 * @see org.muml.pim.component.StructuredComponent
	 * @generated
	 */
	EClass getStructuredComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.component.StructuredComponent#getEmbeddedComponentParts <em>Embedded Component Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Component Parts</em>'.
	 * @see org.muml.pim.component.StructuredComponent#getEmbeddedComponentParts()
	 * @see #getStructuredComponent()
	 * @generated
	 */
	EReference getStructuredComponent_EmbeddedComponentParts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.component.StructuredComponent#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see org.muml.pim.component.StructuredComponent#getConnectors()
	 * @see #getStructuredComponent()
	 * @generated
	 */
	EReference getStructuredComponent_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.component.StructuredComponent#getAllStructuredComponents <em>All Structured Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Structured Components</em>'.
	 * @see org.muml.pim.component.StructuredComponent#getAllStructuredComponents()
	 * @see #getStructuredComponent()
	 * @generated
	 */
	EReference getStructuredComponent_AllStructuredComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.component.StructuredComponent#getAllAtomicComponents <em>All Atomic Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Atomic Components</em>'.
	 * @see org.muml.pim.component.StructuredComponent#getAllAtomicComponents()
	 * @see #getStructuredComponent()
	 * @generated
	 */
	EReference getStructuredComponent_AllAtomicComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.component.StructuredComponent#getCoordinationProtocolParts <em>Coordination Protocol Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordination Protocol Parts</em>'.
	 * @see org.muml.pim.component.StructuredComponent#getCoordinationProtocolParts()
	 * @see #getStructuredComponent()
	 * @generated
	 */
	EReference getStructuredComponent_CoordinationProtocolParts();

	/**
	 * Returns the meta object for the '{@link org.muml.pim.component.StructuredComponent#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.muml.pim.component.StructuredComponent#toString()
	 * @generated
	 */
	EOperation getStructuredComponent__ToString();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.component.DirectedTypedPort <em>Directed Typed Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Typed Port</em>'.
	 * @see org.muml.pim.component.DirectedTypedPort
	 * @generated
	 */
	EClass getDirectedTypedPort();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.component.DirectedTypedPort#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.muml.pim.component.DirectedTypedPort#getKind()
	 * @see #getDirectedTypedPort()
	 * @generated
	 */
	EAttribute getDirectedTypedPort_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.component.DirectedTypedPort#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.muml.pim.component.DirectedTypedPort#isOptional()
	 * @see #getDirectedTypedPort()
	 * @generated
	 */
	EAttribute getDirectedTypedPort_Optional();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.component.DirectedTypedPort#isInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Port</em>'.
	 * @see org.muml.pim.component.DirectedTypedPort#isInPort()
	 * @see #getDirectedTypedPort()
	 * @generated
	 */
	EAttribute getDirectedTypedPort_InPort();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.component.DirectedTypedPort#getInitializeExpression <em>Initialize Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialize Expression</em>'.
	 * @see org.muml.pim.component.DirectedTypedPort#getInitializeExpression()
	 * @see #getDirectedTypedPort()
	 * @generated
	 */
	EReference getDirectedTypedPort_InitializeExpression();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.component.PortPart <em>Port Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Part</em>'.
	 * @see org.muml.pim.component.PortPart
	 * @generated
	 */
	EClass getPortPart();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.component.PortPart#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Type</em>'.
	 * @see org.muml.pim.component.PortPart#getPortType()
	 * @see #getPortPart()
	 * @generated
	 */
	EReference getPortPart_PortType();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.component.PortPart#getComponentPart <em>Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Part</em>'.
	 * @see org.muml.pim.component.PortPart#getComponentPart()
	 * @see #getPortPart()
	 * @generated
	 */
	EReference getPortPart_ComponentPart();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.component.PortPart#getCoordinationProtocolPart <em>Coordination Protocol Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordination Protocol Part</em>'.
	 * @see org.muml.pim.component.PortPart#getCoordinationProtocolPart()
	 * @see #getPortPart()
	 * @generated
	 */
	EReference getPortPart_CoordinationProtocolPart();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.component.PortPart#getRefinedRole <em>Refined Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined Role</em>'.
	 * @see org.muml.pim.component.PortPart#getRefinedRole()
	 * @see #getPortPart()
	 * @generated
	 */
	EReference getPortPart_RefinedRole();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.component.PortPart#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.pim.component.PortPart#getName()
	 * @see #getPortPart()
	 * @generated
	 */
	EAttribute getPortPart_Name();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.component.StaticAtomicComponent <em>Static Atomic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Atomic Component</em>'.
	 * @see org.muml.pim.component.StaticAtomicComponent
	 * @generated
	 */
	EClass getStaticAtomicComponent();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.component.StaticComponent <em>Static Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Component</em>'.
	 * @see org.muml.pim.component.StaticComponent
	 * @generated
	 */
	EClass getStaticComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.component.DirectedTypedPort#isOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Port</em>'.
	 * @see org.muml.pim.component.DirectedTypedPort#isOutPort()
	 * @see #getDirectedTypedPort()
	 * @generated
	 */
	EAttribute getDirectedTypedPort_OutPort();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.component.AtomicComponent <em>Atomic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Component</em>'.
	 * @see org.muml.pim.component.AtomicComponent
	 * @generated
	 */
	EClass getAtomicComponent();

	/**
	 * Returns the meta object for the '{@link org.muml.pim.component.AtomicComponent#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.muml.pim.component.AtomicComponent#toString()
	 * @generated
	 */
	EOperation getAtomicComponent__ToString();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.component.PortConnector <em>Port Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connector</em>'.
	 * @see org.muml.pim.component.PortConnector
	 * @generated
	 */
	EClass getPortConnector();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.component.PortConnector#getParentComponent <em>Parent Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Component</em>'.
	 * @see org.muml.pim.component.PortConnector#getParentComponent()
	 * @see #getPortConnector()
	 * @generated
	 */
	EReference getPortConnector_ParentComponent();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.component.AssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Connector</em>'.
	 * @see org.muml.pim.component.AssemblyConnector
	 * @generated
	 */
	EClass getAssemblyConnector();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.component.AssemblyConnector#getCoordinationProtocolPart <em>Coordination Protocol Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordination Protocol Part</em>'.
	 * @see org.muml.pim.component.AssemblyConnector#getCoordinationProtocolPart()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_CoordinationProtocolPart();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.component.AssemblyConnector#getPortParts <em>Port Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Parts</em>'.
	 * @see org.muml.pim.component.AssemblyConnector#getPortParts()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_PortParts();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.component.DelegationConnector <em>Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Connector</em>'.
	 * @see org.muml.pim.component.DelegationConnector
	 * @generated
	 */
	EClass getDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.component.DelegationConnector#getPortPart <em>Port Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Part</em>'.
	 * @see org.muml.pim.component.DelegationConnector#getPortPart()
	 * @see #getDelegationConnector()
	 * @generated
	 */
	EReference getDelegationConnector_PortPart();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.component.DelegationConnector#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.muml.pim.component.DelegationConnector#getPort()
	 * @see #getDelegationConnector()
	 * @generated
	 */
	EReference getDelegationConnector_Port();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.component.HybridPort <em>Hybrid Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Port</em>'.
	 * @see org.muml.pim.component.HybridPort
	 * @generated
	 */
	EClass getHybridPort();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.component.HybridPort#getSamplingInterval <em>Sampling Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sampling Interval</em>'.
	 * @see org.muml.pim.component.HybridPort#getSamplingInterval()
	 * @see #getHybridPort()
	 * @generated
	 */
	EReference getHybridPort_SamplingInterval();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.component.CoordinationProtocolPart <em>Coordination Protocol Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Protocol Part</em>'.
	 * @see org.muml.pim.component.CoordinationProtocolPart
	 * @generated
	 */
	EClass getCoordinationProtocolPart();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.component.CoordinationProtocolPart#getCoordinationProtocol <em>Coordination Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordination Protocol</em>'.
	 * @see org.muml.pim.component.CoordinationProtocolPart#getCoordinationProtocol()
	 * @see #getCoordinationProtocolPart()
	 * @generated
	 */
	EReference getCoordinationProtocolPart_CoordinationProtocol();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.component.CoordinationProtocolPart#getPortParts <em>Port Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Parts</em>'.
	 * @see org.muml.pim.component.CoordinationProtocolPart#getPortParts()
	 * @see #getCoordinationProtocolPart()
	 * @generated
	 */
	EReference getCoordinationProtocolPart_PortParts();

	/**
	 * Returns the meta object for enum '{@link org.muml.pim.component.ComponentKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind</em>'.
	 * @see org.muml.pim.component.ComponentKind
	 * @generated
	 */
	EEnum getComponentKind();

	/**
	 * Returns the meta object for enum '{@link org.muml.pim.component.PortDirectionKind <em>Port Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Direction Kind</em>'.
	 * @see org.muml.pim.component.PortDirectionKind
	 * @generated
	 */
	EEnum getPortDirectionKind();

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
		 * The meta object literal for the '{@link org.muml.pim.component.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.impl.ComponentImpl
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getComponent()
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
		 * The meta object literal for the '<em><b>Component Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMPONENT_KIND = eINSTANCE.getComponent_ComponentKind();

		/**
		 * The meta object literal for the '{@link org.muml.pim.component.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.impl.PortImpl
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getPort()
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
		 * The meta object literal for the '{@link org.muml.pim.component.impl.ContinuousPortImpl <em>Continuous Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.impl.ContinuousPortImpl
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getContinuousPort()
		 * @generated
		 */
		EClass CONTINUOUS_PORT = eINSTANCE.getContinuousPort();

		/**
		 * The meta object literal for the '{@link org.muml.pim.component.impl.DiscretePortImpl <em>Discrete Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.impl.DiscretePortImpl
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getDiscretePort()
		 * @generated
		 */
		EClass DISCRETE_PORT = eINSTANCE.getDiscretePort();

		/**
		 * The meta object literal for the '<em><b>Refined Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT__REFINED_ROLE = eINSTANCE.getDiscretePort_RefinedRole();

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
		 * The meta object literal for the '<em><b>Multi Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_PORT__MULTI_PORT = eINSTANCE.getDiscretePort_MultiPort();

		/**
		 * The meta object literal for the '<em><b>Coordination Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_PORT__COORDINATION_PROTOCOL = eINSTANCE.getDiscretePort_CoordinationProtocol();

		/**
		 * The meta object literal for the '{@link org.muml.pim.component.impl.ComponentPartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.impl.ComponentPartImpl
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getComponentPart()
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
		 * The meta object literal for the '<em><b>Multi Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_PART__MULTI_PART = eINSTANCE.getComponentPart_MultiPart();

		/**
		 * The meta object literal for the '{@link org.muml.pim.component.impl.StaticStructuredComponentImpl <em>Static Structured Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.impl.StaticStructuredComponentImpl
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getStaticStructuredComponent()
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
		 * The meta object literal for the '<em><b>Port Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PART__PORT_PARTS = eINSTANCE.getComponentPart_PortParts();

		/**
		 * The meta object literal for the '{@link org.muml.pim.component.impl.StructuredComponentImpl <em>Structured Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.impl.StructuredComponentImpl
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getStructuredComponent()
		 * @generated
		 */
		EClass STRUCTURED_COMPONENT = eINSTANCE.getStructuredComponent();

		/**
		 * The meta object literal for the '<em><b>Embedded Component Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_COMPONENT__EMBEDDED_COMPONENT_PARTS = eINSTANCE.getStructuredComponent_EmbeddedComponentParts();

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
		 * The meta object literal for the '<em><b>Coordination Protocol Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_COMPONENT__COORDINATION_PROTOCOL_PARTS = eINSTANCE.getStructuredComponent_CoordinationProtocolParts();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRUCTURED_COMPONENT___TO_STRING = eINSTANCE.getStructuredComponent__ToString();

		/**
		 * The meta object literal for the '{@link org.muml.pim.component.impl.CoordinationProtocolPartImpl <em>Coordination Protocol Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.impl.CoordinationProtocolPartImpl
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getCoordinationProtocolPart()
		 * @generated
		 */
		EClass COORDINATION_PROTOCOL_PART = eINSTANCE.getCoordinationProtocolPart();

		/**
		 * The meta object literal for the '<em><b>Coordination Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PROTOCOL_PART__COORDINATION_PROTOCOL = eINSTANCE.getCoordinationProtocolPart_CoordinationProtocol();

		/**
		 * The meta object literal for the '<em><b>Port Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_PROTOCOL_PART__PORT_PARTS = eINSTANCE.getCoordinationProtocolPart_PortParts();

		/**
		 * The meta object literal for the '{@link org.muml.pim.component.impl.DirectedTypedPortImpl <em>Directed Typed Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.impl.DirectedTypedPortImpl
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getDirectedTypedPort()
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
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTED_TYPED_PORT__OPTIONAL = eINSTANCE.getDirectedTypedPort_Optional();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTED_TYPED_PORT__IN_PORT = eINSTANCE.getDirectedTypedPort_InPort();

		/**
		 * The meta object literal for the '<em><b>Initialize Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION = eINSTANCE.getDirectedTypedPort_InitializeExpression();

		/**
		 * The meta object literal for the '{@link org.muml.pim.component.impl.PortPartImpl <em>Port Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.impl.PortPartImpl
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getPortPart()
		 * @generated
		 */
		EClass PORT_PART = eINSTANCE.getPortPart();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_PART__PORT_TYPE = eINSTANCE.getPortPart_PortType();

		/**
		 * The meta object literal for the '<em><b>Component Part</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_PART__COMPONENT_PART = eINSTANCE.getPortPart_ComponentPart();

		/**
		 * The meta object literal for the '<em><b>Coordination Protocol Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_PART__COORDINATION_PROTOCOL_PART = eINSTANCE.getPortPart_CoordinationProtocolPart();

		/**
		 * The meta object literal for the '<em><b>Refined Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_PART__REFINED_ROLE = eINSTANCE.getPortPart_RefinedRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_PART__NAME = eINSTANCE.getPortPart_Name();

		/**
		 * The meta object literal for the '{@link org.muml.pim.component.impl.StaticAtomicComponentImpl <em>Static Atomic Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.impl.StaticAtomicComponentImpl
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getStaticAtomicComponent()
		 * @generated
		 */
		EClass STATIC_ATOMIC_COMPONENT = eINSTANCE.getStaticAtomicComponent();

		/**
		 * The meta object literal for the '{@link org.muml.pim.component.impl.StaticComponentImpl <em>Static Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.impl.StaticComponentImpl
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getStaticComponent()
		 * @generated
		 */
		EClass STATIC_COMPONENT = eINSTANCE.getStaticComponent();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTED_TYPED_PORT__OUT_PORT = eINSTANCE.getDirectedTypedPort_OutPort();

		/**
		 * The meta object literal for the '{@link org.muml.pim.component.impl.AtomicComponentImpl <em>Atomic Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.impl.AtomicComponentImpl
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getAtomicComponent()
		 * @generated
		 */
		EClass ATOMIC_COMPONENT = eINSTANCE.getAtomicComponent();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATOMIC_COMPONENT___TO_STRING = eINSTANCE.getAtomicComponent__ToString();

		/**
		 * The meta object literal for the '{@link org.muml.pim.component.impl.PortConnectorImpl <em>Port Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.impl.PortConnectorImpl
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getPortConnector()
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
		 * The meta object literal for the '{@link org.muml.pim.component.impl.AssemblyConnectorImpl <em>Assembly Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.impl.AssemblyConnectorImpl
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getAssemblyConnector()
		 * @generated
		 */
		EClass ASSEMBLY_CONNECTOR = eINSTANCE.getAssemblyConnector();

		/**
		 * The meta object literal for the '<em><b>Coordination Protocol Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL_PART = eINSTANCE.getAssemblyConnector_CoordinationProtocolPart();

		/**
		 * The meta object literal for the '<em><b>Port Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__PORT_PARTS = eINSTANCE.getAssemblyConnector_PortParts();

		/**
		 * The meta object literal for the '{@link org.muml.pim.component.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.impl.DelegationConnectorImpl
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getDelegationConnector()
		 * @generated
		 */
		EClass DELEGATION_CONNECTOR = eINSTANCE.getDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Port Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR__PORT_PART = eINSTANCE.getDelegationConnector_PortPart();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR__PORT = eINSTANCE.getDelegationConnector_Port();

		/**
		 * The meta object literal for the '{@link org.muml.pim.component.impl.HybridPortImpl <em>Hybrid Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.impl.HybridPortImpl
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getHybridPort()
		 * @generated
		 */
		EClass HYBRID_PORT = eINSTANCE.getHybridPort();

		/**
		 * The meta object literal for the '<em><b>Sampling Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_PORT__SAMPLING_INTERVAL = eINSTANCE.getHybridPort_SamplingInterval();

		/**
		 * The meta object literal for the '{@link org.muml.pim.component.ComponentKind <em>Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.ComponentKind
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getComponentKind()
		 * @generated
		 */
		EEnum COMPONENT_KIND = eINSTANCE.getComponentKind();

		/**
		 * The meta object literal for the '{@link org.muml.pim.component.PortDirectionKind <em>Port Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.component.PortDirectionKind
		 * @see org.muml.pim.component.impl.ComponentPackageImpl#getPortDirectionKind()
		 * @generated
		 */
		EEnum PORT_DIRECTION_KIND = eINSTANCE.getPortDirectionKind();

	}

} //ComponentPackage
