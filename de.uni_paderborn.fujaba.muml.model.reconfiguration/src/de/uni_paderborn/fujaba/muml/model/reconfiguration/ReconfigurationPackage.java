/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.storydriven.core.expressions.ExpressionsPackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;

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
 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationFactory
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
	String eNS_URI = "http://www.fujaba.de/muml/reconfiguration/0.3.1";

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
	ReconfigurationPackage eINSTANCE = de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurableStructuredComponentImpl <em>Reconfigurable Structured Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurableStructuredComponentImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurableStructuredComponent()
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
	 * The feature id for the '<em><b>Referencing Component Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__REFERENCING_COMPONENT_PARTS = ComponentPackage.STRUCTURED_COMPONENT__REFERENCING_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__COMPONENT_TYPE = ComponentPackage.STRUCTURED_COMPONENT__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Embedded Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__EMBEDDED_PARTS = ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_PARTS;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPortImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationPort()
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
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__CONSTRAINT = ComponentPackage.DISCRETE_PORT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__CARDINALITY = ComponentPackage.DISCRETE_PORT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Incoming Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__INCOMING_CONNECTORS = ComponentPackage.DISCRETE_PORT__INCOMING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Outgoing Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__OUTGOING_CONNECTORS = ComponentPackage.DISCRETE_PORT__OUTGOING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__COMPONENT = ComponentPackage.DISCRETE_PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__CONNECTORS = ComponentPackage.DISCRETE_PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Is Multi Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__IS_MULTI_PORT = ComponentPackage.DISCRETE_PORT__IS_MULTI_PORT;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__BEHAVIOR = ComponentPackage.DISCRETE_PORT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__REFINES = ComponentPackage.DISCRETE_PORT__REFINES;

	/**
	 * The feature id for the '<em><b>Sender Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__SENDER_MESSAGE_INTERFACE = ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Receiver Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__RECEIVER_MESSAGE_INTERFACE = ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_INTERFACE;

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
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_FEATURE_COUNT = ComponentPackage.DISCRETE_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ControllerImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getController()
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
	int CONTROLLER__BEHAVIOR = CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__ANNOTATION = CorePackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__EXTENSION = CorePackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = CorePackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__COMMENT = CorePackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Structured Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__STRUCTURED_COMPONENT = CorePackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = CorePackage.BEHAVIORAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationControllerImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationController()
	 * @generated
	 */
	int RECONFIGURATION_CONTROLLER = 14;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.RuleBasedReconfigurationControllerImpl <em>Rule Based Reconfiguration Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.RuleBasedReconfigurationControllerImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getRuleBasedReconfigurationController()
	 * @generated
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER = 15;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExternalReconfigurationExecutionPortImpl <em>External Reconfiguration Execution Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExternalReconfigurationExecutionPortImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getExternalReconfigurationExecutionPort()
	 * @generated
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT = 16;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.InternalReconfigurationExecutionPortImpl <em>Internal Reconfiguration Execution Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.InternalReconfigurationExecutionPortImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getInternalReconfigurationExecutionPort()
	 * @generated
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT = 17;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getManager()
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
	int MANAGER__ANNOTATION = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__EXTENSION = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__COMMENT = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Specification Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__SPECIFICATION_ENTRIES = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reconfiguration Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__RECONFIGURATION_CONTROLLER = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExecutorImpl <em>Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExecutorImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getExecutor()
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
	int EXECUTOR__ANNOTATION = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__EXTENSION = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__COMMENT = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Specification Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__SPECIFICATION_ENTRIES = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reconfiguration Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__RECONFIGURATION_CONTROLLER = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_FEATURE_COUNT = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationRuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationRuleImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationRule()
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
	int RECONFIGURATION_RULE__ANNOTATION = org.storydriven.core.CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__EXTENSION = org.storydriven.core.CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__NAME = org.storydriven.core.CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__COMMENT = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__PARAMETERS = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__RETURN_PARAMETERS = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_FEATURE_COUNT = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationConditionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationCondition()
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
	int RECONFIGURATION_CONDITION__ANNOTATION = org.storydriven.core.CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONDITION__EXTENSION = org.storydriven.core.CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONDITION__NAME = org.storydriven.core.CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONDITION__COMMENT = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONDITION__PARAMETERS = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONDITION_FEATURE_COUNT = org.storydriven.core.CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.PartDataTypeImpl <em>Part Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.PartDataTypeImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getPartDataType()
	 * @generated
	 */
	int PART_DATA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DATA_TYPE__ANNOTATION = CorePackage.DATA_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DATA_TYPE__EXTENSION = CorePackage.DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DATA_TYPE__NAME = CorePackage.DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DATA_TYPE__COMMENT = CorePackage.DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DATA_TYPE__COMPONENT_PART = CorePackage.DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Part Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DATA_TYPE_FEATURE_COUNT = CorePackage.DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.PortDataTypeImpl <em>Port Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.PortDataTypeImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getPortDataType()
	 * @generated
	 */
	int PORT_DATA_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_TYPE__ANNOTATION = CorePackage.DATA_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_TYPE__EXTENSION = CorePackage.DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_TYPE__NAME = CorePackage.DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_TYPE__COMMENT = CorePackage.DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_TYPE__PORT = CorePackage.DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_TYPE_FEATURE_COUNT = CorePackage.DATA_TYPE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableComponent <em>Reconfigurable Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableComponent
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurableComponent()
	 * @generated
	 */
	int RECONFIGURABLE_COMPONENT = 9;

	/**
	 * The number of structural features of the '<em>Reconfigurable Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationMessagePortImpl <em>Message Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationMessagePortImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessagePort()
	 * @generated
	 */
	int RECONFIGURATION_MESSAGE_PORT = 10;

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
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__CONSTRAINT = RECONFIGURATION_PORT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__CARDINALITY = RECONFIGURATION_PORT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Incoming Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__INCOMING_CONNECTORS = RECONFIGURATION_PORT__INCOMING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Outgoing Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__OUTGOING_CONNECTORS = RECONFIGURATION_PORT__OUTGOING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__COMPONENT = RECONFIGURATION_PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__CONNECTORS = RECONFIGURATION_PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Is Multi Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__IS_MULTI_PORT = RECONFIGURATION_PORT__IS_MULTI_PORT;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__BEHAVIOR = RECONFIGURATION_PORT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__REFINES = RECONFIGURATION_PORT__REFINES;

	/**
	 * The feature id for the '<em><b>Sender Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__SENDER_MESSAGE_INTERFACE = RECONFIGURATION_PORT__SENDER_MESSAGE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Receiver Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__RECEIVER_MESSAGE_INTERFACE = RECONFIGURATION_PORT__RECEIVER_MESSAGE_INTERFACE;

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
	 * The number of structural features of the '<em>Message Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_FEATURE_COUNT = RECONFIGURATION_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationExecutionPortImpl <em>Execution Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationExecutionPortImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationExecutionPort()
	 * @generated
	 */
	int RECONFIGURATION_EXECUTION_PORT = 11;

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
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__CONSTRAINT = RECONFIGURATION_PORT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__CARDINALITY = RECONFIGURATION_PORT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Incoming Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__INCOMING_CONNECTORS = RECONFIGURATION_PORT__INCOMING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Outgoing Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__OUTGOING_CONNECTORS = RECONFIGURATION_PORT__OUTGOING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__COMPONENT = RECONFIGURATION_PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__CONNECTORS = RECONFIGURATION_PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Is Multi Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__IS_MULTI_PORT = RECONFIGURATION_PORT__IS_MULTI_PORT;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__BEHAVIOR = RECONFIGURATION_PORT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__REFINES = RECONFIGURATION_PORT__REFINES;

	/**
	 * The feature id for the '<em><b>Sender Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__SENDER_MESSAGE_INTERFACE = RECONFIGURATION_PORT__SENDER_MESSAGE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Receiver Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__RECEIVER_MESSAGE_INTERFACE = RECONFIGURATION_PORT__RECEIVER_MESSAGE_INTERFACE;

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
	 * The number of structural features of the '<em>Execution Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_FEATURE_COUNT = RECONFIGURATION_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExecutorSpecificationEntryImpl <em>Executor Specification Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExecutorSpecificationEntryImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getExecutorSpecificationEntry()
	 * @generated
	 */
	int EXECUTOR_SPECIFICATION_ENTRY = 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__ANNOTATION = org.storydriven.core.CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__EXTENSION = org.storydriven.core.CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR = org.storydriven.core.CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reconfiguration Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__RECONFIGURATION_RULE = org.storydriven.core.CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Externally Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__EXTERNALLY_VISIBLE = org.storydriven.core.CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time To Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_FAILURE = org.storydriven.core.CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time To Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_SUCCESS = org.storydriven.core.CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Executor Specification Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY_FEATURE_COUNT = org.storydriven.core.CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerSpecificationEntryImpl <em>Manager Specification Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerSpecificationEntryImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getManagerSpecificationEntry()
	 * @generated
	 */
	int MANAGER_SPECIFICATION_ENTRY = 13;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__ANNOTATION = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__EXTENSION = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__COMMENT = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Treat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__TREAT = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Propagate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__PROPAGATE = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__MANAGER = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__MESSAGE_TYPE = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__GUARD = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Manager Specification Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY_FEATURE_COUNT = org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__ANNOTATION = RECONFIGURATION_EXECUTION_PORT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__EXTENSION = RECONFIGURATION_EXECUTION_PORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__NAME = RECONFIGURATION_EXECUTION_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__COMMENT = RECONFIGURATION_EXECUTION_PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__CONSTRAINT = RECONFIGURATION_EXECUTION_PORT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__CARDINALITY = RECONFIGURATION_EXECUTION_PORT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Incoming Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__INCOMING_CONNECTORS = RECONFIGURATION_EXECUTION_PORT__INCOMING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Outgoing Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__OUTGOING_CONNECTORS = RECONFIGURATION_EXECUTION_PORT__OUTGOING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__COMPONENT = RECONFIGURATION_EXECUTION_PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__CONNECTORS = RECONFIGURATION_EXECUTION_PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Is Multi Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__IS_MULTI_PORT = RECONFIGURATION_EXECUTION_PORT__IS_MULTI_PORT;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__BEHAVIOR = RECONFIGURATION_EXECUTION_PORT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__REFINES = RECONFIGURATION_EXECUTION_PORT__REFINES;

	/**
	 * The feature id for the '<em><b>Sender Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__SENDER_MESSAGE_INTERFACE = RECONFIGURATION_EXECUTION_PORT__SENDER_MESSAGE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Receiver Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__RECEIVER_MESSAGE_INTERFACE = RECONFIGURATION_EXECUTION_PORT__RECEIVER_MESSAGE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__ADAPTATION_BEHAVIOR = RECONFIGURATION_EXECUTION_PORT__ADAPTATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Role And Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__ROLE_AND_ADAPTATION_BEHAVIOR = RECONFIGURATION_EXECUTION_PORT__ROLE_AND_ADAPTATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Is Discrete In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__IS_DISCRETE_IN_PORT = RECONFIGURATION_EXECUTION_PORT__IS_DISCRETE_IN_PORT;

	/**
	 * The feature id for the '<em><b>Is Discrete Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__IS_DISCRETE_OUT_PORT = RECONFIGURATION_EXECUTION_PORT__IS_DISCRETE_OUT_PORT;

	/**
	 * The feature id for the '<em><b>Is Discrete In Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__IS_DISCRETE_IN_OUT_PORT = RECONFIGURATION_EXECUTION_PORT__IS_DISCRETE_IN_OUT_PORT;

	/**
	 * The feature id for the '<em><b>Specification Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT__SPECIFICATION_ENTRIES = RECONFIGURATION_EXECUTION_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Reconfiguration Execution Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RECONFIGURATION_EXECUTION_PORT_FEATURE_COUNT = RECONFIGURATION_EXECUTION_PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__ANNOTATION = RECONFIGURATION_EXECUTION_PORT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__EXTENSION = RECONFIGURATION_EXECUTION_PORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__NAME = RECONFIGURATION_EXECUTION_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__COMMENT = RECONFIGURATION_EXECUTION_PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__CONSTRAINT = RECONFIGURATION_EXECUTION_PORT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__CARDINALITY = RECONFIGURATION_EXECUTION_PORT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Incoming Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__INCOMING_CONNECTORS = RECONFIGURATION_EXECUTION_PORT__INCOMING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Outgoing Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__OUTGOING_CONNECTORS = RECONFIGURATION_EXECUTION_PORT__OUTGOING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__COMPONENT = RECONFIGURATION_EXECUTION_PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__CONNECTORS = RECONFIGURATION_EXECUTION_PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Is Multi Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__IS_MULTI_PORT = RECONFIGURATION_EXECUTION_PORT__IS_MULTI_PORT;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__BEHAVIOR = RECONFIGURATION_EXECUTION_PORT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__REFINES = RECONFIGURATION_EXECUTION_PORT__REFINES;

	/**
	 * The feature id for the '<em><b>Sender Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__SENDER_MESSAGE_INTERFACE = RECONFIGURATION_EXECUTION_PORT__SENDER_MESSAGE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Receiver Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__RECEIVER_MESSAGE_INTERFACE = RECONFIGURATION_EXECUTION_PORT__RECEIVER_MESSAGE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__ADAPTATION_BEHAVIOR = RECONFIGURATION_EXECUTION_PORT__ADAPTATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Role And Adaptation Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__ROLE_AND_ADAPTATION_BEHAVIOR = RECONFIGURATION_EXECUTION_PORT__ROLE_AND_ADAPTATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Is Discrete In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__IS_DISCRETE_IN_PORT = RECONFIGURATION_EXECUTION_PORT__IS_DISCRETE_IN_PORT;

	/**
	 * The feature id for the '<em><b>Is Discrete Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__IS_DISCRETE_OUT_PORT = RECONFIGURATION_EXECUTION_PORT__IS_DISCRETE_OUT_PORT;

	/**
	 * The feature id for the '<em><b>Is Discrete In Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT__IS_DISCRETE_IN_OUT_PORT = RECONFIGURATION_EXECUTION_PORT__IS_DISCRETE_IN_OUT_PORT;

	/**
	 * The number of structural features of the '<em>Internal Reconfiguration Execution Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_EXECUTION_PORT_FEATURE_COUNT = RECONFIGURATION_EXECUTION_PORT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationRuleCallExpressionImpl <em>Rule Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationRuleCallExpressionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationRuleCallExpression()
	 * @generated
	 */
	int RECONFIGURATION_RULE_CALL_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_CALL_EXPRESSION__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_CALL_EXPRESSION__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_CALL_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Reconfiguration Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_CALL_EXPRESSION__RECONFIGURATION_RULE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_CALL_EXPRESSION__PARAMETER_BINDINGS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_CALL_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent <em>Reconfigurable Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfigurable Structured Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent
	 * @generated
	 */
	EClass getReconfigurableStructuredComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controllers</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent#getControllers()
	 * @see #getReconfigurableStructuredComponent()
	 * @generated
	 */
	EReference getReconfigurableStructuredComponent_Controllers();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent#getManager()
	 * @see #getReconfigurableStructuredComponent()
	 * @generated
	 */
	EReference getReconfigurableStructuredComponent_Manager();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent#getExecutor()
	 * @see #getReconfigurableStructuredComponent()
	 * @generated
	 */
	EReference getReconfigurableStructuredComponent_Executor();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPort
	 * @generated
	 */
	EClass getReconfigurationPort();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.Controller#getStructuredComponent <em>Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Structured Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.Controller#getStructuredComponent()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_StructuredComponent();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationController
	 * @generated
	 */
	EClass getReconfigurationController();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.RuleBasedReconfigurationController <em>Rule Based Reconfiguration Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Based Reconfiguration Controller</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.RuleBasedReconfigurationController
	 * @generated
	 */
	EClass getRuleBasedReconfigurationController();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.RuleBasedReconfigurationController#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Executor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.RuleBasedReconfigurationController#getExecutor()
	 * @see #getRuleBasedReconfigurationController()
	 * @generated
	 */
	EReference getRuleBasedReconfigurationController_Executor();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.RuleBasedReconfigurationController#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manager</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.RuleBasedReconfigurationController#getManager()
	 * @see #getRuleBasedReconfigurationController()
	 * @generated
	 */
	EReference getRuleBasedReconfigurationController_Manager();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExternalReconfigurationExecutionPort <em>External Reconfiguration Execution Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Reconfiguration Execution Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ExternalReconfigurationExecutionPort
	 * @generated
	 */
	EClass getExternalReconfigurationExecutionPort();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExternalReconfigurationExecutionPort#getSpecificationEntries <em>Specification Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specification Entries</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ExternalReconfigurationExecutionPort#getSpecificationEntries()
	 * @see #getExternalReconfigurationExecutionPort()
	 * @generated
	 */
	EReference getExternalReconfigurationExecutionPort_SpecificationEntries();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.InternalReconfigurationExecutionPort <em>Internal Reconfiguration Execution Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Reconfiguration Execution Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.InternalReconfigurationExecutionPort
	 * @generated
	 */
	EClass getInternalReconfigurationExecutionPort();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRuleCallExpression <em>Rule Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Call Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRuleCallExpression
	 * @generated
	 */
	EClass getReconfigurationRuleCallExpression();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRuleCallExpression#getReconfigurationRule <em>Reconfiguration Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconfiguration Rule</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRuleCallExpression#getReconfigurationRule()
	 * @see #getReconfigurationRuleCallExpression()
	 * @generated
	 */
	EReference getReconfigurationRuleCallExpression_ReconfigurationRule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRuleCallExpression#getParameterBindings <em>Parameter Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Bindings</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRuleCallExpression#getParameterBindings()
	 * @see #getReconfigurationRuleCallExpression()
	 * @generated
	 */
	EReference getReconfigurationRuleCallExpression_ParameterBindings();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager#getSpecificationEntries <em>Specification Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification Entries</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager#getSpecificationEntries()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_SpecificationEntries();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager#getReconfigurationController <em>Reconfiguration Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reconfiguration Controller</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager#getReconfigurationController()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_ReconfigurationController();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.Executor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.Executor
	 * @generated
	 */
	EClass getExecutor();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.Executor#getSpecificationEntries <em>Specification Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification Entries</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.Executor#getSpecificationEntries()
	 * @see #getExecutor()
	 * @generated
	 */
	EReference getExecutor_SpecificationEntries();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.Executor#getReconfigurationController <em>Reconfiguration Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reconfiguration Controller</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.Executor#getReconfigurationController()
	 * @see #getExecutor()
	 * @generated
	 */
	EReference getExecutor_ReconfigurationController();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule
	 * @generated
	 */
	EClass getReconfigurationRule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule#getParameters()
	 * @see #getReconfigurationRule()
	 * @generated
	 */
	EReference getReconfigurationRule_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule#getReturnParameters <em>Return Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Return Parameters</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule#getReturnParameters()
	 * @see #getReconfigurationRule()
	 * @generated
	 */
	EReference getReconfigurationRule_ReturnParameters();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationCondition
	 * @generated
	 */
	EClass getReconfigurationCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationCondition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationCondition#getParameters()
	 * @see #getReconfigurationCondition()
	 * @generated
	 */
	EReference getReconfigurationCondition_Parameters();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.PartDataType <em>Part Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Data Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.PartDataType
	 * @generated
	 */
	EClass getPartDataType();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.PartDataType#getComponentPart <em>Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.PartDataType#getComponentPart()
	 * @see #getPartDataType()
	 * @generated
	 */
	EReference getPartDataType_ComponentPart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.PortDataType <em>Port Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Data Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.PortDataType
	 * @generated
	 */
	EClass getPortDataType();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.PortDataType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.PortDataType#getPort()
	 * @see #getPortDataType()
	 * @generated
	 */
	EReference getPortDataType_Port();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableComponent <em>Reconfigurable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfigurable Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableComponent
	 * @generated
	 */
	EClass getReconfigurableComponent();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessagePort <em>Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessagePort
	 * @generated
	 */
	EClass getReconfigurationMessagePort();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationExecutionPort <em>Execution Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationExecutionPort
	 * @generated
	 */
	EClass getReconfigurationExecutionPort();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry <em>Executor Specification Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor Specification Entry</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry
	 * @generated
	 */
	EClass getExecutorSpecificationEntry();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Executor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getExecutor()
	 * @see #getExecutorSpecificationEntry()
	 * @generated
	 */
	EReference getExecutorSpecificationEntry_Executor();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getReconfigurationRule <em>Reconfiguration Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconfiguration Rule</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getReconfigurationRule()
	 * @see #getExecutorSpecificationEntry()
	 * @generated
	 */
	EReference getExecutorSpecificationEntry_ReconfigurationRule();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#isExternallyVisible <em>Externally Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Externally Visible</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#isExternallyVisible()
	 * @see #getExecutorSpecificationEntry()
	 * @generated
	 */
	EAttribute getExecutorSpecificationEntry_ExternallyVisible();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getTimeToFailure <em>Time To Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time To Failure</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getTimeToFailure()
	 * @see #getExecutorSpecificationEntry()
	 * @generated
	 */
	EAttribute getExecutorSpecificationEntry_TimeToFailure();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getTimeToSuccess <em>Time To Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time To Success</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getTimeToSuccess()
	 * @see #getExecutorSpecificationEntry()
	 * @generated
	 */
	EAttribute getExecutorSpecificationEntry_TimeToSuccess();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry <em>Manager Specification Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager Specification Entry</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry
	 * @generated
	 */
	EClass getManagerSpecificationEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#isTreat <em>Treat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treat</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#isTreat()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EAttribute getManagerSpecificationEntry_Treat();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#isPropagate <em>Propagate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Propagate</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#isPropagate()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EAttribute getManagerSpecificationEntry_Propagate();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Manager</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#getManager()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EReference getManagerSpecificationEntry_Manager();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#getMessageType()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EReference getManagerSpecificationEntry_MessageType();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#getGuard()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EReference getManagerSpecificationEntry_Guard();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurableStructuredComponentImpl <em>Reconfigurable Structured Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurableStructuredComponentImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurableStructuredComponent()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPortImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationPort()
		 * @generated
		 */
		EClass RECONFIGURATION_PORT = eINSTANCE.getReconfigurationPort();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ControllerImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getController()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationControllerImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationController()
		 * @generated
		 */
		EClass RECONFIGURATION_CONTROLLER = eINSTANCE.getReconfigurationController();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.RuleBasedReconfigurationControllerImpl <em>Rule Based Reconfiguration Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.RuleBasedReconfigurationControllerImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getRuleBasedReconfigurationController()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExternalReconfigurationExecutionPortImpl <em>External Reconfiguration Execution Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExternalReconfigurationExecutionPortImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getExternalReconfigurationExecutionPort()
		 * @generated
		 */
		EClass EXTERNAL_RECONFIGURATION_EXECUTION_PORT = eINSTANCE.getExternalReconfigurationExecutionPort();

		/**
		 * The meta object literal for the '<em><b>Specification Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_RECONFIGURATION_EXECUTION_PORT__SPECIFICATION_ENTRIES = eINSTANCE.getExternalReconfigurationExecutionPort_SpecificationEntries();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.InternalReconfigurationExecutionPortImpl <em>Internal Reconfiguration Execution Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.InternalReconfigurationExecutionPortImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getInternalReconfigurationExecutionPort()
		 * @generated
		 */
		EClass INTERNAL_RECONFIGURATION_EXECUTION_PORT = eINSTANCE.getInternalReconfigurationExecutionPort();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationRuleCallExpressionImpl <em>Rule Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationRuleCallExpressionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationRuleCallExpression()
		 * @generated
		 */
		EClass RECONFIGURATION_RULE_CALL_EXPRESSION = eINSTANCE.getReconfigurationRuleCallExpression();

		/**
		 * The meta object literal for the '<em><b>Reconfiguration Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_RULE_CALL_EXPRESSION__RECONFIGURATION_RULE = eINSTANCE.getReconfigurationRuleCallExpression_ReconfigurationRule();

		/**
		 * The meta object literal for the '<em><b>Parameter Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_RULE_CALL_EXPRESSION__PARAMETER_BINDINGS = eINSTANCE.getReconfigurationRuleCallExpression_ParameterBindings();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getManager()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExecutorImpl <em>Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExecutorImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getExecutor()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationRuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationRuleImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationRule()
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
		 * The meta object literal for the '<em><b>Return Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_RULE__RETURN_PARAMETERS = eINSTANCE.getReconfigurationRule_ReturnParameters();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationConditionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationCondition()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.PartDataTypeImpl <em>Part Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.PartDataTypeImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getPartDataType()
		 * @generated
		 */
		EClass PART_DATA_TYPE = eINSTANCE.getPartDataType();

		/**
		 * The meta object literal for the '<em><b>Component Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_DATA_TYPE__COMPONENT_PART = eINSTANCE.getPartDataType_ComponentPart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.PortDataTypeImpl <em>Port Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.PortDataTypeImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getPortDataType()
		 * @generated
		 */
		EClass PORT_DATA_TYPE = eINSTANCE.getPortDataType();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_DATA_TYPE__PORT = eINSTANCE.getPortDataType_Port();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableComponent <em>Reconfigurable Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableComponent
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurableComponent()
		 * @generated
		 */
		EClass RECONFIGURABLE_COMPONENT = eINSTANCE.getReconfigurableComponent();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationMessagePortImpl <em>Message Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationMessagePortImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessagePort()
		 * @generated
		 */
		EClass RECONFIGURATION_MESSAGE_PORT = eINSTANCE.getReconfigurationMessagePort();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationExecutionPortImpl <em>Execution Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationExecutionPortImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationExecutionPort()
		 * @generated
		 */
		EClass RECONFIGURATION_EXECUTION_PORT = eINSTANCE.getReconfigurationExecutionPort();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExecutorSpecificationEntryImpl <em>Executor Specification Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExecutorSpecificationEntryImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getExecutorSpecificationEntry()
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
		 * The meta object literal for the '<em><b>Externally Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTOR_SPECIFICATION_ENTRY__EXTERNALLY_VISIBLE = eINSTANCE.getExecutorSpecificationEntry_ExternallyVisible();

		/**
		 * The meta object literal for the '<em><b>Time To Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_FAILURE = eINSTANCE.getExecutorSpecificationEntry_TimeToFailure();

		/**
		 * The meta object literal for the '<em><b>Time To Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_SUCCESS = eINSTANCE.getExecutorSpecificationEntry_TimeToSuccess();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerSpecificationEntryImpl <em>Manager Specification Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerSpecificationEntryImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getManagerSpecificationEntry()
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

	}

} //ReconfigurationPackage
