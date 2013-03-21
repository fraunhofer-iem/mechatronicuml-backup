/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;

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
 * This package contains all classes which are needed to define reconfigurable components in MechatronicUML. A reconfigurable component may change its ports and, in case of a structured component, its inner structure. The supported structural changes include adding or removing embedded component instances, adding or removing port instances, adding or removing or redirecting assemblies and delegations.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ReconfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reconfiguration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/reconfiguration/0.3.8";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reconfiguration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReconfigurationPackage eINSTANCE = de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurableStructuredComponentImpl <em>Reconfigurable Structured Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurableStructuredComponentImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurableStructuredComponent()
	 * @generated
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__ANNOTATION = ComponentPackage.STRUCTURED_COMPONENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__EXTENSION = ComponentPackage.STRUCTURED_COMPONENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__NAME = ComponentPackage.STRUCTURED_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__COMMENT = ComponentPackage.STRUCTURED_COMPONENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__CONSTRAINT = ComponentPackage.STRUCTURED_COMPONENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__PORTS = ComponentPackage.STRUCTURED_COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__COMPONENT_TYPE = ComponentPackage.STRUCTURED_COMPONENT__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Embedded Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__EMBEDDED_COMPONENT_PARTS = ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__CONNECTORS = ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>All Structured Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS = ComponentPackage.STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>All Atomic Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS = ComponentPackage.STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Coordination Protocol Occurences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__COORDINATION_PROTOCOL_OCCURENCES = ComponentPackage.STRUCTURED_COMPONENT__COORDINATION_PROTOCOL_OCCURENCES;

	/**
	 * The feature id for the '<em><b>Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLERS = ComponentPackage.STRUCTURED_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__MANAGER = ComponentPackage.STRUCTURED_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__EXECUTOR = ComponentPackage.STRUCTURED_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reconfigurable Structured Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_FEATURE_COUNT = ComponentPackage.STRUCTURED_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationPort()
	 * @generated
	 */
	int RECONFIGURATION_PORT = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__ANNOTATION = ComponentPackage.DISCRETE_PORT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__EXTENSION = ComponentPackage.DISCRETE_PORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__NAME = ComponentPackage.DISCRETE_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__COMMENT = ComponentPackage.DISCRETE_PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__CONNECTORS = ComponentPackage.DISCRETE_PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__CONSTRAINT = ComponentPackage.DISCRETE_PORT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__COMPONENT = ComponentPackage.DISCRETE_PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Port Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__PORT_CONNECTORS = ComponentPackage.DISCRETE_PORT__PORT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__BEHAVIOR = ComponentPackage.DISCRETE_PORT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__SENDER_MESSAGE_TYPES = ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__RECEIVER_MESSAGE_TYPES = ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__ADAPTATION_BEHAVIOR = ComponentPackage.DISCRETE_PORT__ADAPTATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Role And Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__ROLE_AND_ADAPTATION_BEHAVIOR = ComponentPackage.DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__CARDINALITY = ComponentPackage.DISCRETE_PORT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__REFINED_ROLE = ComponentPackage.DISCRETE_PORT__REFINED_ROLE;

	/**
	 * The feature id for the '<em><b>Is Discrete In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__IS_DISCRETE_IN_PORT = ComponentPackage.DISCRETE_PORT__IS_DISCRETE_IN_PORT;

	/**
	 * The feature id for the '<em><b>Is Discrete Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__IS_DISCRETE_OUT_PORT = ComponentPackage.DISCRETE_PORT__IS_DISCRETE_OUT_PORT;

	/**
	 * The feature id for the '<em><b>Is Discrete In Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__IS_DISCRETE_IN_OUT_PORT = ComponentPackage.DISCRETE_PORT__IS_DISCRETE_IN_OUT_PORT;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__RECEIVER_MESSAGE_BUFFER = ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Multi Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__MULTI_PORT = ComponentPackage.DISCRETE_PORT__MULTI_PORT;

	/**
	 * The feature id for the '<em><b>Coordination Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__COORDINATION_PROTOCOL = ComponentPackage.DISCRETE_PORT__COORDINATION_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Interface Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__INTERFACE_ENTRIES = ComponentPackage.DISCRETE_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_FEATURE_COUNT = ComponentPackage.DISCRETE_PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ControllerImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__BEHAVIOR = BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__ANNOTATION = BehaviorPackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__EXTENSION = BehaviorPackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = BehaviorPackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__COMMENT = BehaviorPackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Structured Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__STRUCTURED_COMPONENT = BehaviorPackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = BehaviorPackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationControllerImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationController()
	 * @generated
	 */
	int RECONFIGURATION_CONTROLLER = 12;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.RuleBasedReconfigurationControllerImpl <em>Rule Based Reconfiguration Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.RuleBasedReconfigurationControllerImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getRuleBasedReconfigurationController()
	 * @generated
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER = 13;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ManagerImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__BEHAVIOR = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__SPECIFICATION_ENTRIES = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reconfiguration Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__RECONFIGURATION_CONTROLLER = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__PORTS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutorImpl <em>Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutorImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getExecutor()
	 * @generated
	 */
	int EXECUTOR = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__BEHAVIOR = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__SPECIFICATION_ENTRIES = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reconfiguration Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__RECONFIGURATION_CONTROLLER = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__PORTS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationRuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationRuleImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationRule()
	 * @generated
	 */
	int RECONFIGURATION_RULE = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__PARAMETERS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__RETURN_PARAMETERS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reconfigured Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__RECONFIGURED_COMPONENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Wcet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__WCET = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationConditionImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationCondition()
	 * @generated
	 */
	int RECONFIGURATION_CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONDITION__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONDITION__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONDITION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONDITION__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONDITION__PARAMETERS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONDITION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableComponent <em>Reconfigurable Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableComponent
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurableComponent()
	 * @generated
	 */
	int RECONFIGURABLE_COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT__ANNOTATION = ComponentPackage.COMPONENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT__EXTENSION = ComponentPackage.COMPONENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT__NAME = ComponentPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT__COMMENT = ComponentPackage.COMPONENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT__CONSTRAINT = ComponentPackage.COMPONENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT__PORTS = ComponentPackage.COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT__COMPONENT_TYPE = ComponentPackage.COMPONENT__COMPONENT_TYPE;

	/**
	 * The number of structural features of the '<em>Reconfigurable Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_FEATURE_COUNT = ComponentPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationMessagePortImpl <em>Message Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationMessagePortImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessagePort()
	 * @generated
	 */
	int RECONFIGURATION_MESSAGE_PORT = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__ANNOTATION = RECONFIGURATION_PORT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__EXTENSION = RECONFIGURATION_PORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__NAME = RECONFIGURATION_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__COMMENT = RECONFIGURATION_PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__CONNECTORS = RECONFIGURATION_PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__CONSTRAINT = RECONFIGURATION_PORT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__COMPONENT = RECONFIGURATION_PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Port Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__PORT_CONNECTORS = RECONFIGURATION_PORT__PORT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__BEHAVIOR = RECONFIGURATION_PORT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__SENDER_MESSAGE_TYPES = RECONFIGURATION_PORT__SENDER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__RECEIVER_MESSAGE_TYPES = RECONFIGURATION_PORT__RECEIVER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__ADAPTATION_BEHAVIOR = RECONFIGURATION_PORT__ADAPTATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Role And Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR = RECONFIGURATION_PORT__ROLE_AND_ADAPTATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__CARDINALITY = RECONFIGURATION_PORT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__REFINED_ROLE = RECONFIGURATION_PORT__REFINED_ROLE;

	/**
	 * The feature id for the '<em><b>Is Discrete In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__IS_DISCRETE_IN_PORT = RECONFIGURATION_PORT__IS_DISCRETE_IN_PORT;

	/**
	 * The feature id for the '<em><b>Is Discrete Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__IS_DISCRETE_OUT_PORT = RECONFIGURATION_PORT__IS_DISCRETE_OUT_PORT;

	/**
	 * The feature id for the '<em><b>Is Discrete In Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__IS_DISCRETE_IN_OUT_PORT = RECONFIGURATION_PORT__IS_DISCRETE_IN_OUT_PORT;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__RECEIVER_MESSAGE_BUFFER = RECONFIGURATION_PORT__RECEIVER_MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Multi Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__MULTI_PORT = RECONFIGURATION_PORT__MULTI_PORT;

	/**
	 * The feature id for the '<em><b>Coordination Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__COORDINATION_PROTOCOL = RECONFIGURATION_PORT__COORDINATION_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Interface Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__INTERFACE_ENTRIES = RECONFIGURATION_PORT__INTERFACE_ENTRIES;

	/**
	 * The number of structural features of the '<em>Message Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_FEATURE_COUNT = RECONFIGURATION_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationExecutionPortImpl <em>Execution Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationExecutionPortImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationExecutionPort()
	 * @generated
	 */
	int RECONFIGURATION_EXECUTION_PORT = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__ANNOTATION = RECONFIGURATION_PORT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__EXTENSION = RECONFIGURATION_PORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__NAME = RECONFIGURATION_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__COMMENT = RECONFIGURATION_PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__CONNECTORS = RECONFIGURATION_PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__CONSTRAINT = RECONFIGURATION_PORT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__COMPONENT = RECONFIGURATION_PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Port Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__PORT_CONNECTORS = RECONFIGURATION_PORT__PORT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__BEHAVIOR = RECONFIGURATION_PORT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__SENDER_MESSAGE_TYPES = RECONFIGURATION_PORT__SENDER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__RECEIVER_MESSAGE_TYPES = RECONFIGURATION_PORT__RECEIVER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__ADAPTATION_BEHAVIOR = RECONFIGURATION_PORT__ADAPTATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Role And Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__ROLE_AND_ADAPTATION_BEHAVIOR = RECONFIGURATION_PORT__ROLE_AND_ADAPTATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__CARDINALITY = RECONFIGURATION_PORT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__REFINED_ROLE = RECONFIGURATION_PORT__REFINED_ROLE;

	/**
	 * The feature id for the '<em><b>Is Discrete In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__IS_DISCRETE_IN_PORT = RECONFIGURATION_PORT__IS_DISCRETE_IN_PORT;

	/**
	 * The feature id for the '<em><b>Is Discrete Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__IS_DISCRETE_OUT_PORT = RECONFIGURATION_PORT__IS_DISCRETE_OUT_PORT;

	/**
	 * The feature id for the '<em><b>Is Discrete In Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__IS_DISCRETE_IN_OUT_PORT = RECONFIGURATION_PORT__IS_DISCRETE_IN_OUT_PORT;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__RECEIVER_MESSAGE_BUFFER = RECONFIGURATION_PORT__RECEIVER_MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Multi Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__MULTI_PORT = RECONFIGURATION_PORT__MULTI_PORT;

	/**
	 * The feature id for the '<em><b>Coordination Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__COORDINATION_PROTOCOL = RECONFIGURATION_PORT__COORDINATION_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Interface Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__INTERFACE_ENTRIES = RECONFIGURATION_PORT__INTERFACE_ENTRIES;

	/**
	 * The number of structural features of the '<em>Execution Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_FEATURE_COUNT = RECONFIGURATION_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutorSpecificationEntryImpl <em>Executor Specification Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutorSpecificationEntryImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getExecutorSpecificationEntry()
	 * @generated
	 */
	int EXECUTOR_SPECIFICATION_ENTRY = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reconfiguration Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__RECONFIGURATION_RULE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Executor Specification Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ManagerSpecificationEntryImpl <em>Manager Specification Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ManagerSpecificationEntryImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getManagerSpecificationEntry()
	 * @generated
	 */
	int MANAGER_SPECIFICATION_ENTRY = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Treat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__TREAT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Propagate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__PROPAGATE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__MANAGER = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__MESSAGE_TYPE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__GUARD = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reconfiguration Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__RECONFIGURATION_RULE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Invoke Planner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__INVOKE_PLANNER = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Time For Planning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__TIME_FOR_PLANNING = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Manager Specification Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER__BEHAVIOR = CONTROLLER__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER__ANNOTATION = CONTROLLER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER__EXTENSION = CONTROLLER__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER__NAME = CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER__COMMENT = CONTROLLER__COMMENT;

	/**
	 * The feature id for the '<em><b>Structured Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT = CONTROLLER__STRUCTURED_COMPONENT;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_FEATURE_COUNT = CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER__BEHAVIOR = RECONFIGURATION_CONTROLLER__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER__ANNOTATION = RECONFIGURATION_CONTROLLER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER__EXTENSION = RECONFIGURATION_CONTROLLER__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER__NAME = RECONFIGURATION_CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER__COMMENT = RECONFIGURATION_CONTROLLER__COMMENT;

	/**
	 * The feature id for the '<em><b>Structured Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT = RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR = RECONFIGURATION_CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER__MANAGER = RECONFIGURATION_CONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule Based Reconfiguration Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_FEATURE_COUNT = RECONFIGURATION_CONTROLLER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortInterfaceEntryImpl <em>Port Interface Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortInterfaceEntryImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationPortInterfaceEntry()
	 * @generated
	 */
	int RECONFIGURATION_PORT_INTERFACE_ENTRY = 14;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INTERFACE_ENTRY__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INTERFACE_ENTRY__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Port</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INTERFACE_ENTRY__PORT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INTERFACE_ENTRY__DESCRIPTION = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INTERFACE_ENTRY__MESSAGE_TYPE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Port Interface Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationMessagePortInterfaceEntryImpl <em>Message Port Interface Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationMessagePortInterfaceEntryImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessagePortInterfaceEntry()
	 * @generated
	 */
	int RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY = 15;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__ANNOTATION = RECONFIGURATION_PORT_INTERFACE_ENTRY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXTENSION = RECONFIGURATION_PORT_INTERFACE_ENTRY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Port</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__PORT = RECONFIGURATION_PORT_INTERFACE_ENTRY__PORT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__DESCRIPTION = RECONFIGURATION_PORT_INTERFACE_ENTRY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__MESSAGE_TYPE = RECONFIGURATION_PORT_INTERFACE_ENTRY__MESSAGE_TYPE;

	/**
	 * The feature id for the '<em><b>Message Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__MESSAGE_KIND = RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expected Response Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME = RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Port Interface Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY_FEATURE_COUNT = RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationExecutionPortInterfaceEntryImpl <em>Execution Port Interface Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationExecutionPortInterfaceEntryImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationExecutionPortInterfaceEntry()
	 * @generated
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY = 16;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__ANNOTATION = RECONFIGURATION_PORT_INTERFACE_ENTRY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__EXTENSION = RECONFIGURATION_PORT_INTERFACE_ENTRY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Port</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__PORT = RECONFIGURATION_PORT_INTERFACE_ENTRY__PORT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__DESCRIPTION = RECONFIGURATION_PORT_INTERFACE_ENTRY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__MESSAGE_TYPE = RECONFIGURATION_PORT_INTERFACE_ENTRY__MESSAGE_TYPE;

	/**
	 * The feature id for the '<em><b>Time For Decision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_DECISION = RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time For Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_EXECUTION = RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Execution Port Interface Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY_FEATURE_COUNT = RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessageKind <em>Message Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessageKind
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessageKind()
	 * @generated
	 */
	int RECONFIGURATION_MESSAGE_KIND = 17;

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent <em>Reconfigurable Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfigurable Structured Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent
	 * @generated
	 */
	EClass getReconfigurableStructuredComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controllers</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent#getControllers()
	 * @see #getReconfigurableStructuredComponent()
	 * @generated
	 */
	EReference getReconfigurableStructuredComponent_Controllers();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent#getManager()
	 * @see #getReconfigurableStructuredComponent()
	 * @generated
	 */
	EReference getReconfigurableStructuredComponent_Manager();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent#getExecutor()
	 * @see #getReconfigurableStructuredComponent()
	 * @generated
	 */
	EReference getReconfigurableStructuredComponent_Executor();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPort
	 * @generated
	 */
	EClass getReconfigurationPort();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPort#getInterfaceEntries <em>Interface Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Entries</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPort#getInterfaceEntries()
	 * @see #getReconfigurationPort()
	 * @generated
	 */
	EReference getReconfigurationPort_InterfaceEntries();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Controller#getStructuredComponent <em>Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Structured Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.Controller#getStructuredComponent()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_StructuredComponent();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationController
	 * @generated
	 */
	EClass getReconfigurationController();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController <em>Rule Based Reconfiguration Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Based Reconfiguration Controller</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController
	 * @generated
	 */
	EClass getRuleBasedReconfigurationController();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Executor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController#getExecutor()
	 * @see #getRuleBasedReconfigurationController()
	 * @generated
	 */
	EReference getRuleBasedReconfigurationController_Executor();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manager</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController#getManager()
	 * @see #getRuleBasedReconfigurationController()
	 * @generated
	 */
	EReference getRuleBasedReconfigurationController_Manager();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry <em>Port Interface Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Interface Entry</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry
	 * @generated
	 */
	EClass getReconfigurationPortInterfaceEntry();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry#getPort()
	 * @see #getReconfigurationPortInterfaceEntry()
	 * @generated
	 */
	EReference getReconfigurationPortInterfaceEntry_Port();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry#getDescription()
	 * @see #getReconfigurationPortInterfaceEntry()
	 * @generated
	 */
	EAttribute getReconfigurationPortInterfaceEntry_Description();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry#getMessageType()
	 * @see #getReconfigurationPortInterfaceEntry()
	 * @generated
	 */
	EReference getReconfigurationPortInterfaceEntry_MessageType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry <em>Message Port Interface Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Port Interface Entry</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry
	 * @generated
	 */
	EClass getReconfigurationMessagePortInterfaceEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getMessageKind <em>Message Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getMessageKind()
	 * @see #getReconfigurationMessagePortInterfaceEntry()
	 * @generated
	 */
	EAttribute getReconfigurationMessagePortInterfaceEntry_MessageKind();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getExpectedResponseTime <em>Expected Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expected Response Time</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getExpectedResponseTime()
	 * @see #getReconfigurationMessagePortInterfaceEntry()
	 * @generated
	 */
	EReference getReconfigurationMessagePortInterfaceEntry_ExpectedResponseTime();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry <em>Execution Port Interface Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Port Interface Entry</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry
	 * @generated
	 */
	EClass getReconfigurationExecutionPortInterfaceEntry();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getTimeForDecision <em>Time For Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time For Decision</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getTimeForDecision()
	 * @see #getReconfigurationExecutionPortInterfaceEntry()
	 * @generated
	 */
	EReference getReconfigurationExecutionPortInterfaceEntry_TimeForDecision();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getTimeForExecution <em>Time For Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time For Execution</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getTimeForExecution()
	 * @see #getReconfigurationExecutionPortInterfaceEntry()
	 * @generated
	 */
	EReference getReconfigurationExecutionPortInterfaceEntry_TimeForExecution();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessageKind <em>Message Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessageKind
	 * @generated
	 */
	EEnum getReconfigurationMessageKind();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getSpecificationEntries <em>Specification Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification Entries</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getSpecificationEntries()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_SpecificationEntries();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getReconfigurationController <em>Reconfiguration Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reconfiguration Controller</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getReconfigurationController()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_ReconfigurationController();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getPorts()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_Ports();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Executor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.Executor
	 * @generated
	 */
	EClass getExecutor();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Executor#getSpecificationEntries <em>Specification Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification Entries</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.Executor#getSpecificationEntries()
	 * @see #getExecutor()
	 * @generated
	 */
	EReference getExecutor_SpecificationEntries();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Executor#getReconfigurationController <em>Reconfiguration Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reconfiguration Controller</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.Executor#getReconfigurationController()
	 * @see #getExecutor()
	 * @generated
	 */
	EReference getExecutor_ReconfigurationController();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Executor#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.Executor#getPorts()
	 * @see #getExecutor()
	 * @generated
	 */
	EReference getExecutor_Ports();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule
	 * @generated
	 */
	EClass getReconfigurationRule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getParameters()
	 * @see #getReconfigurationRule()
	 * @generated
	 */
	EReference getReconfigurationRule_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getReturnParameters <em>Return Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Parameters</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getReturnParameters()
	 * @see #getReconfigurationRule()
	 * @generated
	 */
	EReference getReconfigurationRule_ReturnParameters();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getReconfiguredComponent <em>Reconfigured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconfigured Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getReconfiguredComponent()
	 * @see #getReconfigurationRule()
	 * @generated
	 */
	EReference getReconfigurationRule_ReconfiguredComponent();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getWcet <em>Wcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wcet</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getWcet()
	 * @see #getReconfigurationRule()
	 * @generated
	 */
	EReference getReconfigurationRule_Wcet();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationCondition
	 * @generated
	 */
	EClass getReconfigurationCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationCondition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationCondition#getParameters()
	 * @see #getReconfigurationCondition()
	 * @generated
	 */
	EReference getReconfigurationCondition_Parameters();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableComponent <em>Reconfigurable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfigurable Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableComponent
	 * @generated
	 */
	EClass getReconfigurableComponent();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort <em>Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort
	 * @generated
	 */
	EClass getReconfigurationMessagePort();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort <em>Execution Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort
	 * @generated
	 */
	EClass getReconfigurationExecutionPort();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ExecutorSpecificationEntry <em>Executor Specification Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor Specification Entry</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ExecutorSpecificationEntry
	 * @generated
	 */
	EClass getExecutorSpecificationEntry();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ExecutorSpecificationEntry#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Executor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ExecutorSpecificationEntry#getExecutor()
	 * @see #getExecutorSpecificationEntry()
	 * @generated
	 */
	EReference getExecutorSpecificationEntry_Executor();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ExecutorSpecificationEntry#getReconfigurationRule <em>Reconfiguration Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconfiguration Rule</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ExecutorSpecificationEntry#getReconfigurationRule()
	 * @see #getExecutorSpecificationEntry()
	 * @generated
	 */
	EReference getExecutorSpecificationEntry_ReconfigurationRule();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry <em>Manager Specification Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager Specification Entry</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry
	 * @generated
	 */
	EClass getManagerSpecificationEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#isTreat <em>Treat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treat</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#isTreat()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EAttribute getManagerSpecificationEntry_Treat();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#isPropagate <em>Propagate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Propagate</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#isPropagate()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EAttribute getManagerSpecificationEntry_Propagate();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Manager</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getManager()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EReference getManagerSpecificationEntry_Manager();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getMessageType()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EReference getManagerSpecificationEntry_MessageType();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getGuard()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EReference getManagerSpecificationEntry_Guard();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getReconfigurationRule <em>Reconfiguration Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconfiguration Rule</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getReconfigurationRule()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EReference getManagerSpecificationEntry_ReconfigurationRule();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#isInvokePlanner <em>Invoke Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoke Planner</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#isInvokePlanner()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EAttribute getManagerSpecificationEntry_InvokePlanner();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getTimeForPlanning <em>Time For Planning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time For Planning</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getTimeForPlanning()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EReference getManagerSpecificationEntry_TimeForPlanning();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReconfigurationFactory getReconfigurationFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurableStructuredComponentImpl <em>Reconfigurable Structured Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurableStructuredComponentImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurableStructuredComponent()
		 * @generated
		 */
		EClass RECONFIGURABLE_STRUCTURED_COMPONENT = eINSTANCE.getReconfigurableStructuredComponent();

		/**
		 * The meta object literal for the '<em><b>Controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLERS = eINSTANCE.getReconfigurableStructuredComponent_Controllers();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURABLE_STRUCTURED_COMPONENT__MANAGER = eINSTANCE.getReconfigurableStructuredComponent_Manager();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURABLE_STRUCTURED_COMPONENT__EXECUTOR = eINSTANCE.getReconfigurableStructuredComponent_Executor();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationPort()
		 * @generated
		 */
		EClass RECONFIGURATION_PORT = eINSTANCE.getReconfigurationPort();

		/**
		 * The meta object literal for the '<em><b>Interface Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_PORT__INTERFACE_ENTRIES = eINSTANCE.getReconfigurationPort_InterfaceEntries();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ControllerImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Structured Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__STRUCTURED_COMPONENT = eINSTANCE.getController_StructuredComponent();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationControllerImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationController()
		 * @generated
		 */
		EClass RECONFIGURATION_CONTROLLER = eINSTANCE.getReconfigurationController();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.RuleBasedReconfigurationControllerImpl <em>Rule Based Reconfiguration Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.RuleBasedReconfigurationControllerImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getRuleBasedReconfigurationController()
		 * @generated
		 */
		EClass RULE_BASED_RECONFIGURATION_CONTROLLER = eINSTANCE.getRuleBasedReconfigurationController();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR = eINSTANCE.getRuleBasedReconfigurationController_Executor();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_BASED_RECONFIGURATION_CONTROLLER__MANAGER = eINSTANCE.getRuleBasedReconfigurationController_Manager();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortInterfaceEntryImpl <em>Port Interface Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortInterfaceEntryImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationPortInterfaceEntry()
		 * @generated
		 */
		EClass RECONFIGURATION_PORT_INTERFACE_ENTRY = eINSTANCE.getReconfigurationPortInterfaceEntry();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_PORT_INTERFACE_ENTRY__PORT = eINSTANCE.getReconfigurationPortInterfaceEntry_Port();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATION_PORT_INTERFACE_ENTRY__DESCRIPTION = eINSTANCE.getReconfigurationPortInterfaceEntry_Description();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_PORT_INTERFACE_ENTRY__MESSAGE_TYPE = eINSTANCE.getReconfigurationPortInterfaceEntry_MessageType();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationMessagePortInterfaceEntryImpl <em>Message Port Interface Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationMessagePortInterfaceEntryImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessagePortInterfaceEntry()
		 * @generated
		 */
		EClass RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY = eINSTANCE.getReconfigurationMessagePortInterfaceEntry();

		/**
		 * The meta object literal for the '<em><b>Message Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__MESSAGE_KIND = eINSTANCE.getReconfigurationMessagePortInterfaceEntry_MessageKind();

		/**
		 * The meta object literal for the '<em><b>Expected Response Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME = eINSTANCE.getReconfigurationMessagePortInterfaceEntry_ExpectedResponseTime();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationExecutionPortInterfaceEntryImpl <em>Execution Port Interface Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationExecutionPortInterfaceEntryImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationExecutionPortInterfaceEntry()
		 * @generated
		 */
		EClass RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY = eINSTANCE.getReconfigurationExecutionPortInterfaceEntry();

		/**
		 * The meta object literal for the '<em><b>Time For Decision</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_DECISION = eINSTANCE.getReconfigurationExecutionPortInterfaceEntry_TimeForDecision();

		/**
		 * The meta object literal for the '<em><b>Time For Execution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_EXECUTION = eINSTANCE.getReconfigurationExecutionPortInterfaceEntry_TimeForExecution();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessageKind <em>Message Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessageKind
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessageKind()
		 * @generated
		 */
		EEnum RECONFIGURATION_MESSAGE_KIND = eINSTANCE.getReconfigurationMessageKind();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ManagerImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

		/**
		 * The meta object literal for the '<em><b>Specification Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__SPECIFICATION_ENTRIES = eINSTANCE.getManager_SpecificationEntries();

		/**
		 * The meta object literal for the '<em><b>Reconfiguration Controller</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__RECONFIGURATION_CONTROLLER = eINSTANCE.getManager_ReconfigurationController();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__PORTS = eINSTANCE.getManager_Ports();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutorImpl <em>Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutorImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getExecutor()
		 * @generated
		 */
		EClass EXECUTOR = eINSTANCE.getExecutor();

		/**
		 * The meta object literal for the '<em><b>Specification Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR__SPECIFICATION_ENTRIES = eINSTANCE.getExecutor_SpecificationEntries();

		/**
		 * The meta object literal for the '<em><b>Reconfiguration Controller</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR__RECONFIGURATION_CONTROLLER = eINSTANCE.getExecutor_ReconfigurationController();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR__PORTS = eINSTANCE.getExecutor_Ports();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationRuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationRuleImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationRule()
		 * @generated
		 */
		EClass RECONFIGURATION_RULE = eINSTANCE.getReconfigurationRule();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_RULE__PARAMETERS = eINSTANCE.getReconfigurationRule_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_RULE__RETURN_PARAMETERS = eINSTANCE.getReconfigurationRule_ReturnParameters();

		/**
		 * The meta object literal for the '<em><b>Reconfigured Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_RULE__RECONFIGURED_COMPONENT = eINSTANCE.getReconfigurationRule_ReconfiguredComponent();

		/**
		 * The meta object literal for the '<em><b>Wcet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_RULE__WCET = eINSTANCE.getReconfigurationRule_Wcet();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationConditionImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationCondition()
		 * @generated
		 */
		EClass RECONFIGURATION_CONDITION = eINSTANCE.getReconfigurationCondition();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_CONDITION__PARAMETERS = eINSTANCE.getReconfigurationCondition_Parameters();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableComponent <em>Reconfigurable Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableComponent
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurableComponent()
		 * @generated
		 */
		EClass RECONFIGURABLE_COMPONENT = eINSTANCE.getReconfigurableComponent();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationMessagePortImpl <em>Message Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationMessagePortImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessagePort()
		 * @generated
		 */
		EClass RECONFIGURATION_MESSAGE_PORT = eINSTANCE.getReconfigurationMessagePort();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationExecutionPortImpl <em>Execution Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationExecutionPortImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationExecutionPort()
		 * @generated
		 */
		EClass RECONFIGURATION_EXECUTION_PORT = eINSTANCE.getReconfigurationExecutionPort();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutorSpecificationEntryImpl <em>Executor Specification Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutorSpecificationEntryImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getExecutorSpecificationEntry()
		 * @generated
		 */
		EClass EXECUTOR_SPECIFICATION_ENTRY = eINSTANCE.getExecutorSpecificationEntry();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR = eINSTANCE.getExecutorSpecificationEntry_Executor();

		/**
		 * The meta object literal for the '<em><b>Reconfiguration Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR_SPECIFICATION_ENTRY__RECONFIGURATION_RULE = eINSTANCE.getExecutorSpecificationEntry_ReconfigurationRule();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ManagerSpecificationEntryImpl <em>Manager Specification Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ManagerSpecificationEntryImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl#getManagerSpecificationEntry()
		 * @generated
		 */
		EClass MANAGER_SPECIFICATION_ENTRY = eINSTANCE.getManagerSpecificationEntry();

		/**
		 * The meta object literal for the '<em><b>Treat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_SPECIFICATION_ENTRY__TREAT = eINSTANCE.getManagerSpecificationEntry_Treat();

		/**
		 * The meta object literal for the '<em><b>Propagate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_SPECIFICATION_ENTRY__PROPAGATE = eINSTANCE.getManagerSpecificationEntry_Propagate();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_SPECIFICATION_ENTRY__MANAGER = eINSTANCE.getManagerSpecificationEntry_Manager();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_SPECIFICATION_ENTRY__MESSAGE_TYPE = eINSTANCE.getManagerSpecificationEntry_MessageType();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_SPECIFICATION_ENTRY__GUARD = eINSTANCE.getManagerSpecificationEntry_Guard();

		/**
		 * The meta object literal for the '<em><b>Reconfiguration Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_SPECIFICATION_ENTRY__RECONFIGURATION_RULE = eINSTANCE.getManagerSpecificationEntry_ReconfigurationRule();

		/**
		 * The meta object literal for the '<em><b>Invoke Planner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_SPECIFICATION_ENTRY__INVOKE_PLANNER = eINSTANCE.getManagerSpecificationEntry_InvokePlanner();

		/**
		 * The meta object literal for the '<em><b>Time For Planning</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_SPECIFICATION_ENTRY__TIME_FOR_PLANNING = eINSTANCE.getManagerSpecificationEntry_TimeForPlanning();

	}

} //ReconfigurationPackage
