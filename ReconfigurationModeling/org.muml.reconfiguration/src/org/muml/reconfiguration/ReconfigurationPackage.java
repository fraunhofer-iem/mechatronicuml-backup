/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfiguration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.CorePackage;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.types.TypesPackage;

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
 * @see org.muml.reconfiguration.ReconfigurationFactory
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
	String eNS_URI = "http://www.muml.org/reconfiguration/1.0.0";

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
	ReconfigurationPackage eINSTANCE = org.muml.reconfiguration.impl.ReconfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ReconfigurableStructuredComponentImpl <em>Reconfigurable Structured Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ReconfigurableStructuredComponentImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurableStructuredComponent()
	 * @generated
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT = 2;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ReconfigurableAtomicComponentImpl <em>Reconfigurable Atomic Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ReconfigurableAtomicComponentImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurableAtomicComponent()
	 * @generated
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT = 1;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ReconfigurationPortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ReconfigurationPortImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationPort()
	 * @generated
	 */
	int RECONFIGURATION_PORT = 3;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ControllerImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 13;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ReconfigurationControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ReconfigurationControllerImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationController()
	 * @generated
	 */
	int RECONFIGURATION_CONTROLLER = 14;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.RuleBasedReconfigurationControllerImpl <em>Rule Based Reconfiguration Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.RuleBasedReconfigurationControllerImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getRuleBasedReconfigurationController()
	 * @generated
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER = 15;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ManagerImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 16;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ExecutorImpl <em>Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ExecutorImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getExecutor()
	 * @generated
	 */
	int EXECUTOR = 18;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ReconfigurationRuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ReconfigurationRuleImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationRule()
	 * @generated
	 */
	int RECONFIGURATION_RULE = 20;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.StructuralConditionImpl <em>Structural Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.StructuralConditionImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getStructuralCondition()
	 * @generated
	 */
	int STRUCTURAL_CONDITION = 22;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ReconfigurableComponentImpl <em>Reconfigurable Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ReconfigurableComponentImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurableComponent()
	 * @generated
	 */
	int RECONFIGURABLE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT__EXTENSIONS = ComponentPackage.COMPONENT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Component Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT__COMPONENT_KIND = ComponentPackage.COMPONENT__COMPONENT_KIND;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT__PORTS = ComponentPackage.COMPONENT__PORTS;

	/**
	 * The number of structural features of the '<em>Reconfigurable Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_FEATURE_COUNT = ComponentPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT___GET_EXTENSION__ECLASS = ComponentPackage.COMPONENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Reconfigurable Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_COMPONENT_OPERATION_COUNT = ComponentPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT__EXTENSIONS = ComponentPackage.ATOMIC_COMPONENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT__NAME = ComponentPackage.ATOMIC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT__COMMENT = ComponentPackage.ATOMIC_COMPONENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Component Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT__COMPONENT_KIND = ComponentPackage.ATOMIC_COMPONENT__COMPONENT_KIND;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT__PORTS = ComponentPackage.ATOMIC_COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT__BEHAVIOR = ComponentPackage.ATOMIC_COMPONENT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Verification Constraint Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT__VERIFICATION_CONSTRAINT_REPOSITORIES = ComponentPackage.ATOMIC_COMPONENT__VERIFICATION_CONSTRAINT_REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Execution Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT__EXECUTION_ENTRIES = ComponentPackage.ATOMIC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Management Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT__MANAGEMENT_ENTRIES = ComponentPackage.ATOMIC_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hybrid Port Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT__HYBRID_PORT_MAPPINGS = ComponentPackage.ATOMIC_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reconfigurable Atomic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_FEATURE_COUNT = ComponentPackage.ATOMIC_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT___GET_EXTENSION__ECLASS = ComponentPackage.ATOMIC_COMPONENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT___TO_STRING = ComponentPackage.ATOMIC_COMPONENT___TO_STRING;

	/**
	 * The number of operations of the '<em>Reconfigurable Atomic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_ATOMIC_COMPONENT_OPERATION_COUNT = ComponentPackage.ATOMIC_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__EXTENSIONS = ComponentPackage.STRUCTURED_COMPONENT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Component Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__COMPONENT_KIND = ComponentPackage.STRUCTURED_COMPONENT__COMPONENT_KIND;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__PORTS = ComponentPackage.STRUCTURED_COMPONENT__PORTS;

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
	 * The feature id for the '<em><b>Coordination Protocol Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__COORDINATION_PROTOCOL_PARTS = ComponentPackage.STRUCTURED_COMPONENT__COORDINATION_PROTOCOL_PARTS;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLER = ComponentPackage.STRUCTURED_COMPONENT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Initial Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__INITIAL_CONFIGURATION = ComponentPackage.STRUCTURED_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reconfigurable Structured Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_FEATURE_COUNT = ComponentPackage.STRUCTURED_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT___GET_EXTENSION__ECLASS = ComponentPackage.STRUCTURED_COMPONENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT___TO_STRING = ComponentPackage.STRUCTURED_COMPONENT___TO_STRING;

	/**
	 * The number of operations of the '<em>Reconfigurable Structured Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_OPERATION_COUNT = ComponentPackage.STRUCTURED_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__EXTENSIONS = ComponentPackage.PORT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__COMMENT = ComponentPackage.PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__CONNECTORS = ComponentPackage.PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__NAME = ComponentPackage.PORT__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__COMPONENT = ComponentPackage.PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Port Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__PORT_CONNECTORS = ComponentPackage.PORT__PORT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__BEHAVIOR = ComponentPackage.PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__SENDER_MESSAGE_TYPES = ComponentPackage.PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__RECEIVER_MESSAGE_TYPES = ComponentPackage.PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Coordinator Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__COORDINATOR_BEHAVIOR = ComponentPackage.PORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subrole Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__SUBROLE_BEHAVIOR = ComponentPackage.PORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__CARDINALITY = ComponentPackage.PORT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__RECEIVER_MESSAGE_BUFFER = ComponentPackage.PORT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__MULTI = ComponentPackage.PORT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_FEATURE_COUNT = ComponentPackage.PORT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT___GET_EXTENSION__ECLASS = ComponentPackage.PORT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_OPERATION_COUNT = ComponentPackage.PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ReconfigurationMessagePortImpl <em>Message Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ReconfigurationMessagePortImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessagePort()
	 * @generated
	 */
	int RECONFIGURATION_MESSAGE_PORT = 5;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ReconfigurationExecutionPortImpl <em>Execution Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ReconfigurationExecutionPortImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationExecutionPort()
	 * @generated
	 */
	int RECONFIGURATION_EXECUTION_PORT = 7;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ExecutorSpecificationEntryImpl <em>Executor Specification Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ExecutorSpecificationEntryImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getExecutorSpecificationEntry()
	 * @generated
	 */
	int EXECUTOR_SPECIFICATION_ENTRY = 19;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ManagerSpecificationEntryImpl <em>Manager Specification Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ManagerSpecificationEntryImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getManagerSpecificationEntry()
	 * @generated
	 */
	int MANAGER_SPECIFICATION_ENTRY = 17;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ReconfigurationPortInterfaceEntryImpl <em>Port Interface Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ReconfigurationPortInterfaceEntryImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationPortInterfaceEntry()
	 * @generated
	 */
	int RECONFIGURATION_PORT_INTERFACE_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INTERFACE_ENTRY__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INTERFACE_ENTRY__DESCRIPTION = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INTERFACE_ENTRY__MESSAGE_TYPE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Interface Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INTERFACE_ENTRY___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Port Interface Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_INTERFACE_ENTRY_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__EXTENSIONS = RECONFIGURATION_PORT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__NAME = RECONFIGURATION_PORT__NAME;

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
	 * The feature id for the '<em><b>Coordinator Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__COORDINATOR_BEHAVIOR = RECONFIGURATION_PORT__COORDINATOR_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Subrole Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__SUBROLE_BEHAVIOR = RECONFIGURATION_PORT__SUBROLE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__CARDINALITY = RECONFIGURATION_PORT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__RECEIVER_MESSAGE_BUFFER = RECONFIGURATION_PORT__RECEIVER_MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__MULTI = RECONFIGURATION_PORT__MULTI;

	/**
	 * The feature id for the '<em><b>Interface Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT__INTERFACE_ENTRIES = RECONFIGURATION_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_FEATURE_COUNT = RECONFIGURATION_PORT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT___GET_EXTENSION__ECLASS = RECONFIGURATION_PORT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Message Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_OPERATION_COUNT = RECONFIGURATION_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ReconfigurationMessagePortInterfaceEntryImpl <em>Message Port Interface Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ReconfigurationMessagePortInterfaceEntryImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessagePortInterfaceEntry()
	 * @generated
	 */
	int RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXTENSIONS = RECONFIGURATION_PORT_INTERFACE_ENTRY__EXTENSIONS;

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
	 * The feature id for the '<em><b>Reconfiguration Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_TYPE = RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expected Response Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME = RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reconfiguration Message Port</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_PORT = RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Message Port Interface Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY_FEATURE_COUNT = RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY___GET_EXTENSION__ECLASS = RECONFIGURATION_PORT_INTERFACE_ENTRY___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Message Port Interface Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY_OPERATION_COUNT = RECONFIGURATION_PORT_INTERFACE_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__EXTENSIONS = RECONFIGURATION_PORT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__NAME = RECONFIGURATION_PORT__NAME;

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
	 * The feature id for the '<em><b>Coordinator Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__COORDINATOR_BEHAVIOR = RECONFIGURATION_PORT__COORDINATOR_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Subrole Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__SUBROLE_BEHAVIOR = RECONFIGURATION_PORT__SUBROLE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__CARDINALITY = RECONFIGURATION_PORT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__RECEIVER_MESSAGE_BUFFER = RECONFIGURATION_PORT__RECEIVER_MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__MULTI = RECONFIGURATION_PORT__MULTI;

	/**
	 * The feature id for the '<em><b>Interface Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__INTERFACE_ENTRIES = RECONFIGURATION_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_FEATURE_COUNT = RECONFIGURATION_PORT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT___GET_EXTENSION__ECLASS = RECONFIGURATION_PORT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Execution Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_OPERATION_COUNT = RECONFIGURATION_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ReconfigurationExecutionPortInterfaceEntryImpl <em>Execution Port Interface Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ReconfigurationExecutionPortInterfaceEntryImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationExecutionPortInterfaceEntry()
	 * @generated
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY = 8;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__EXTENSIONS = RECONFIGURATION_PORT_INTERFACE_ENTRY__EXTENSIONS;

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
	 * The feature id for the '<em><b>Time For Execution Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_EXECUTION_PHASE = RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reconfiguration Execution Port</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RECONFIGURATION_EXECUTION_PORT = RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minimum Commit Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__MINIMUM_COMMIT_TIME = RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RETURN_VALUES = RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Minimum Retry Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__MINIMUM_RETRY_TIME = RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Execution Port Interface Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY_FEATURE_COUNT = RECONFIGURATION_PORT_INTERFACE_ENTRY_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY___GET_EXTENSION__ECLASS = RECONFIGURATION_PORT_INTERFACE_ENTRY___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Execution Port Interface Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY_OPERATION_COUNT = RECONFIGURATION_PORT_INTERFACE_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ExecutionTimingSpecificationImpl <em>Execution Timing Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ExecutionTimingSpecificationImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getExecutionTimingSpecification()
	 * @generated
	 */
	int EXECUTION_TIMING_SPECIFICATION = 9;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIMING_SPECIFICATION__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The number of structural features of the '<em>Execution Timing Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIMING_SPECIFICATION_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIMING_SPECIFICATION___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Execution Timing Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIMING_SPECIFICATION_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ExecutionTimingSpecificationSinglePhaseImpl <em>Execution Timing Specification Single Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ExecutionTimingSpecificationSinglePhaseImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getExecutionTimingSpecificationSinglePhase()
	 * @generated
	 */
	int EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE = 10;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE__EXTENSIONS = EXECUTION_TIMING_SPECIFICATION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Time For Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE__TIME_FOR_EXECUTION = EXECUTION_TIMING_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution Timing Specification Single Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE_FEATURE_COUNT = EXECUTION_TIMING_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE___GET_EXTENSION__ECLASS = EXECUTION_TIMING_SPECIFICATION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Execution Timing Specification Single Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE_OPERATION_COUNT = EXECUTION_TIMING_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ExecutionTimingSpecificationThreePhaseImpl <em>Execution Timing Specification Three Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ExecutionTimingSpecificationThreePhaseImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getExecutionTimingSpecificationThreePhase()
	 * @generated
	 */
	int EXECUTION_TIMING_SPECIFICATION_THREE_PHASE = 11;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__EXTENSIONS = EXECUTION_TIMING_SPECIFICATION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Time For Setup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_SETUP = EXECUTION_TIMING_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time For Fading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_FADING = EXECUTION_TIMING_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time For Teardown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_TEARDOWN = EXECUTION_TIMING_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Execution Timing Specification Three Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIMING_SPECIFICATION_THREE_PHASE_FEATURE_COUNT = EXECUTION_TIMING_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIMING_SPECIFICATION_THREE_PHASE___GET_EXTENSION__ECLASS = EXECUTION_TIMING_SPECIFICATION___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Execution Timing Specification Three Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIMING_SPECIFICATION_THREE_PHASE_OPERATION_COUNT = EXECUTION_TIMING_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.SignatureImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 21;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.InternalReconfigurationCommunicationPortImpl <em>Internal Reconfiguration Communication Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.InternalReconfigurationCommunicationPortImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getInternalReconfigurationCommunicationPort()
	 * @generated
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT = 12;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT__EXTENSIONS = RECONFIGURATION_PORT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT__COMMENT = RECONFIGURATION_PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT__CONNECTORS = RECONFIGURATION_PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT__NAME = RECONFIGURATION_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT__COMPONENT = RECONFIGURATION_PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Port Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT__PORT_CONNECTORS = RECONFIGURATION_PORT__PORT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT__BEHAVIOR = RECONFIGURATION_PORT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT__SENDER_MESSAGE_TYPES = RECONFIGURATION_PORT__SENDER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT__RECEIVER_MESSAGE_TYPES = RECONFIGURATION_PORT__RECEIVER_MESSAGE_TYPES;

	/**
	 * The feature id for the '<em><b>Coordinator Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT__COORDINATOR_BEHAVIOR = RECONFIGURATION_PORT__COORDINATOR_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Subrole Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT__SUBROLE_BEHAVIOR = RECONFIGURATION_PORT__SUBROLE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT__CARDINALITY = RECONFIGURATION_PORT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Receiver Message Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT__RECEIVER_MESSAGE_BUFFER = RECONFIGURATION_PORT__RECEIVER_MESSAGE_BUFFER;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT__MULTI = RECONFIGURATION_PORT__MULTI;

	/**
	 * The number of structural features of the '<em>Internal Reconfiguration Communication Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_FEATURE_COUNT = RECONFIGURATION_PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT___GET_EXTENSION__ECLASS = RECONFIGURATION_PORT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Internal Reconfiguration Communication Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_OPERATION_COUNT = RECONFIGURATION_PORT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__BEHAVIOR = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Structured Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__STRUCTURED_COMPONENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER__EXTENSIONS = CONTROLLER__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER__NAME = CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER__BEHAVIOR = CONTROLLER__BEHAVIOR;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER___GET_EXTENSION__ECLASS = CONTROLLER___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_OPERATION_COUNT = CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER__EXTENSIONS = RECONFIGURATION_CONTROLLER__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER__NAME = RECONFIGURATION_CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER__BEHAVIOR = RECONFIGURATION_CONTROLLER__BEHAVIOR;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER___GET_EXTENSION__ECLASS = RECONFIGURATION_CONTROLLER___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Rule Based Reconfiguration Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_RECONFIGURATION_CONTROLLER_OPERATION_COUNT = RECONFIGURATION_CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Reconfiguration Message Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__RECONFIGURATION_MESSAGE_PORTS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Structural Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__STRUCTURAL_CONDITION = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Blockable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__BLOCKABLE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Manager Specification Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Manager Specification Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Reconfiguration Execution Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__RECONFIGURATION_EXECUTION_PORTS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Wcet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__WCET = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__ID = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Executor Specification Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Executor Specification Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Reconfigured Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__RECONFIGURED_COMPONENT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__SIGNATURE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__NAME = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__PARAMETERS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__RETURN_PARAMETERS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reconfiguration Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__RECONFIGURATION_RULE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_CONDITION__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_CONDITION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_CONDITION__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_CONDITION__PARAMETERS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reconfigurable Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_CONDITION__RECONFIGURABLE_COMPONENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Structural Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_CONDITION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_CONDITION___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Structural Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_CONDITION_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ReconfigurationPortAssemblyConnectorImpl <em>Port Assembly Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ReconfigurationPortAssemblyConnectorImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationPortAssemblyConnector()
	 * @generated
	 */
	int RECONFIGURATION_PORT_ASSEMBLY_CONNECTOR = 23;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_ASSEMBLY_CONNECTOR__EXTENSIONS = ComponentPackage.PORT_CONNECTOR__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_ASSEMBLY_CONNECTOR__COMMENT = ComponentPackage.PORT_CONNECTOR__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_ASSEMBLY_CONNECTOR__CONNECTOR_ENDPOINTS = ComponentPackage.PORT_CONNECTOR__CONNECTOR_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Self Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_ASSEMBLY_CONNECTOR__SELF_CONNECTOR = ComponentPackage.PORT_CONNECTOR__SELF_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_ASSEMBLY_CONNECTOR__PARENT_COMPONENT = ComponentPackage.PORT_CONNECTOR__PARENT_COMPONENT;

	/**
	 * The number of structural features of the '<em>Port Assembly Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_ASSEMBLY_CONNECTOR_FEATURE_COUNT = ComponentPackage.PORT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_ASSEMBLY_CONNECTOR___GET_EXTENSION__ECLASS = ComponentPackage.PORT_CONNECTOR___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Port Assembly Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_ASSEMBLY_CONNECTOR_OPERATION_COUNT = ComponentPackage.PORT_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ReconfigurationPortDelegationConnectorImpl <em>Port Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ReconfigurationPortDelegationConnectorImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationPortDelegationConnector()
	 * @generated
	 */
	int RECONFIGURATION_PORT_DELEGATION_CONNECTOR = 24;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_DELEGATION_CONNECTOR__EXTENSIONS = ComponentPackage.PORT_CONNECTOR__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_DELEGATION_CONNECTOR__COMMENT = ComponentPackage.PORT_CONNECTOR__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_DELEGATION_CONNECTOR__CONNECTOR_ENDPOINTS = ComponentPackage.PORT_CONNECTOR__CONNECTOR_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Self Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_DELEGATION_CONNECTOR__SELF_CONNECTOR = ComponentPackage.PORT_CONNECTOR__SELF_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_DELEGATION_CONNECTOR__PARENT_COMPONENT = ComponentPackage.PORT_CONNECTOR__PARENT_COMPONENT;

	/**
	 * The number of structural features of the '<em>Port Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_DELEGATION_CONNECTOR_FEATURE_COUNT = ComponentPackage.PORT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_DELEGATION_CONNECTOR___GET_EXTENSION__ECLASS = ComponentPackage.PORT_CONNECTOR___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Port Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_DELEGATION_CONNECTOR_OPERATION_COUNT = ComponentPackage.PORT_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.FadingComponentImpl <em>Fading Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.FadingComponentImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getFadingComponent()
	 * @generated
	 */
	int FADING_COMPONENT = 25;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT__EXTENSIONS = ComponentPackage.ATOMIC_COMPONENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT__NAME = ComponentPackage.ATOMIC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT__COMMENT = ComponentPackage.ATOMIC_COMPONENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Component Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT__COMPONENT_KIND = ComponentPackage.ATOMIC_COMPONENT__COMPONENT_KIND;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT__PORTS = ComponentPackage.ATOMIC_COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT__BEHAVIOR = ComponentPackage.ATOMIC_COMPONENT__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Verification Constraint Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT__VERIFICATION_CONSTRAINT_REPOSITORIES = ComponentPackage.ATOMIC_COMPONENT__VERIFICATION_CONSTRAINT_REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Fading Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT__FADING_FUNCTION = ComponentPackage.ATOMIC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fading Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_FEATURE_COUNT = ComponentPackage.ATOMIC_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT___GET_EXTENSION__ECLASS = ComponentPackage.ATOMIC_COMPONENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT___TO_STRING = ComponentPackage.ATOMIC_COMPONENT___TO_STRING;

	/**
	 * The number of operations of the '<em>Fading Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_COMPONENT_OPERATION_COUNT = ComponentPackage.ATOMIC_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.FadingFunctionImpl <em>Fading Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.FadingFunctionImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getFadingFunction()
	 * @generated
	 */
	int FADING_FUNCTION = 26;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION__FROM_PORT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION__TO_PORT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fading Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Fading Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ReconfigurationConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ReconfigurationConstraintImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationConstraint()
	 * @generated
	 */
	int RECONFIGURATION_CONSTRAINT = 27;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.HybridPortMappingImpl <em>Hybrid Port Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.HybridPortMappingImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getHybridPortMapping()
	 * @generated
	 */
	int HYBRID_PORT_MAPPING = 28;

	/**
	 * The feature id for the '<em><b>Hybrid Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_MAPPING__HYBRID_PORT = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_MAPPING__FUNCTION = 1;

	/**
	 * The number of structural features of the '<em>Hybrid Port Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hybrid Port Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_PORT_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ReconfigurationExecutionSpecificationEntryImpl <em>Execution Specification Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ReconfigurationExecutionSpecificationEntryImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationExecutionSpecificationEntry()
	 * @generated
	 */
	int RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY = 29;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__EXTENSIONS = TypesPackage.DATA_TYPE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__NAME = TypesPackage.DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__COMMENT = TypesPackage.DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__GUARDS = TypesPackage.DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__MESSAGE = TypesPackage.DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reconfiguration Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__RECONFIGURATION_RULE = TypesPackage.DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hybrid Port Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__HYBRID_PORT_MAPPINGS = TypesPackage.DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Execution Specification Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY_FEATURE_COUNT = TypesPackage.DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY___GET_EXTENSION__ECLASS = TypesPackage.DATA_TYPE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Execution Specification Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY_OPERATION_COUNT = TypesPackage.DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.impl.ReconfigurationManagementSpecificationEntryImpl <em>Management Specification Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.impl.ReconfigurationManagementSpecificationEntryImpl
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationManagementSpecificationEntry()
	 * @generated
	 */
	int RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY = 30;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__EXTENSIONS = TypesPackage.DATA_TYPE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__NAME = TypesPackage.DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__COMMENT = TypesPackage.DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__CONDITIONS = TypesPackage.DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__MESSAGE = TypesPackage.DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Management Specification Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY_FEATURE_COUNT = TypesPackage.DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY___GET_EXTENSION__ECLASS = TypesPackage.DATA_TYPE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Management Specification Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY_OPERATION_COUNT = TypesPackage.DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.reconfiguration.ReconfigurationMessageTypeEnum <em>Message Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfiguration.ReconfigurationMessageTypeEnum
	 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessageTypeEnum()
	 * @generated
	 */
	int RECONFIGURATION_MESSAGE_TYPE_ENUM = 31;

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ReconfigurableStructuredComponent <em>Reconfigurable Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfigurable Structured Component</em>'.
	 * @see org.muml.reconfiguration.ReconfigurableStructuredComponent
	 * @generated
	 */
	EClass getReconfigurableStructuredComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.ReconfigurableStructuredComponent#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Controller</em>'.
	 * @see org.muml.reconfiguration.ReconfigurableStructuredComponent#getController()
	 * @see #getReconfigurableStructuredComponent()
	 * @generated
	 */
	EReference getReconfigurableStructuredComponent_Controller();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.ReconfigurableStructuredComponent#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager</em>'.
	 * @see org.muml.reconfiguration.ReconfigurableStructuredComponent#getManager()
	 * @see #getReconfigurableStructuredComponent()
	 * @generated
	 */
	EReference getReconfigurableStructuredComponent_Manager();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.ReconfigurableStructuredComponent#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executor</em>'.
	 * @see org.muml.reconfiguration.ReconfigurableStructuredComponent#getExecutor()
	 * @see #getReconfigurableStructuredComponent()
	 * @generated
	 */
	EReference getReconfigurableStructuredComponent_Executor();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.ReconfigurableStructuredComponent#getInitialConfiguration <em>Initial Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Configuration</em>'.
	 * @see org.muml.reconfiguration.ReconfigurableStructuredComponent#getInitialConfiguration()
	 * @see #getReconfigurableStructuredComponent()
	 * @generated
	 */
	EReference getReconfigurableStructuredComponent_InitialConfiguration();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ReconfigurableAtomicComponent <em>Reconfigurable Atomic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfigurable Atomic Component</em>'.
	 * @see org.muml.reconfiguration.ReconfigurableAtomicComponent
	 * @generated
	 */
	EClass getReconfigurableAtomicComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.ReconfigurableAtomicComponent#getExecutionEntries <em>Execution Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execution Entries</em>'.
	 * @see org.muml.reconfiguration.ReconfigurableAtomicComponent#getExecutionEntries()
	 * @see #getReconfigurableAtomicComponent()
	 * @generated
	 */
	EReference getReconfigurableAtomicComponent_ExecutionEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.ReconfigurableAtomicComponent#getManagementEntries <em>Management Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Management Entries</em>'.
	 * @see org.muml.reconfiguration.ReconfigurableAtomicComponent#getManagementEntries()
	 * @see #getReconfigurableAtomicComponent()
	 * @generated
	 */
	EReference getReconfigurableAtomicComponent_ManagementEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.ReconfigurableAtomicComponent#getHybridPortMappings <em>Hybrid Port Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hybrid Port Mappings</em>'.
	 * @see org.muml.reconfiguration.ReconfigurableAtomicComponent#getHybridPortMappings()
	 * @see #getReconfigurableAtomicComponent()
	 * @generated
	 */
	EReference getReconfigurableAtomicComponent_HybridPortMappings();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ReconfigurationPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationPort
	 * @generated
	 */
	EClass getReconfigurationPort();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see org.muml.reconfiguration.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.reconfiguration.Controller#getStructuredComponent <em>Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Structured Component</em>'.
	 * @see org.muml.reconfiguration.Controller#getStructuredComponent()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_StructuredComponent();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ReconfigurationController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationController
	 * @generated
	 */
	EClass getReconfigurationController();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.RuleBasedReconfigurationController <em>Rule Based Reconfiguration Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Based Reconfiguration Controller</em>'.
	 * @see org.muml.reconfiguration.RuleBasedReconfigurationController
	 * @generated
	 */
	EClass getRuleBasedReconfigurationController();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.RuleBasedReconfigurationController#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Executor</em>'.
	 * @see org.muml.reconfiguration.RuleBasedReconfigurationController#getExecutor()
	 * @see #getRuleBasedReconfigurationController()
	 * @generated
	 */
	EReference getRuleBasedReconfigurationController_Executor();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.RuleBasedReconfigurationController#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manager</em>'.
	 * @see org.muml.reconfiguration.RuleBasedReconfigurationController#getManager()
	 * @see #getRuleBasedReconfigurationController()
	 * @generated
	 */
	EReference getRuleBasedReconfigurationController_Manager();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ReconfigurationPortInterfaceEntry <em>Port Interface Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Interface Entry</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationPortInterfaceEntry
	 * @generated
	 */
	EClass getReconfigurationPortInterfaceEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfiguration.ReconfigurationPortInterfaceEntry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationPortInterfaceEntry#getDescription()
	 * @see #getReconfigurationPortInterfaceEntry()
	 * @generated
	 */
	EAttribute getReconfigurationPortInterfaceEntry_Description();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.ReconfigurationPortInterfaceEntry#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Type</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationPortInterfaceEntry#getMessageType()
	 * @see #getReconfigurationPortInterfaceEntry()
	 * @generated
	 */
	EReference getReconfigurationPortInterfaceEntry_MessageType();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry <em>Message Port Interface Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Port Interface Entry</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry
	 * @generated
	 */
	EClass getReconfigurationMessagePortInterfaceEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getReconfigurationMessageType <em>Reconfiguration Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconfiguration Message Type</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getReconfigurationMessageType()
	 * @see #getReconfigurationMessagePortInterfaceEntry()
	 * @generated
	 */
	EAttribute getReconfigurationMessagePortInterfaceEntry_ReconfigurationMessageType();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getExpectedResponseTime <em>Expected Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expected Response Time</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getExpectedResponseTime()
	 * @see #getReconfigurationMessagePortInterfaceEntry()
	 * @generated
	 */
	EReference getReconfigurationMessagePortInterfaceEntry_ExpectedResponseTime();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getReconfigurationMessagePort <em>Reconfiguration Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reconfiguration Message Port</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getReconfigurationMessagePort()
	 * @see #getReconfigurationMessagePortInterfaceEntry()
	 * @generated
	 */
	EReference getReconfigurationMessagePortInterfaceEntry_ReconfigurationMessagePort();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry <em>Execution Port Interface Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Port Interface Entry</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry
	 * @generated
	 */
	EClass getReconfigurationExecutionPortInterfaceEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getTimeForDecision <em>Time For Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time For Decision</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getTimeForDecision()
	 * @see #getReconfigurationExecutionPortInterfaceEntry()
	 * @generated
	 */
	EReference getReconfigurationExecutionPortInterfaceEntry_TimeForDecision();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getTimeForExecutionPhase <em>Time For Execution Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time For Execution Phase</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getTimeForExecutionPhase()
	 * @see #getReconfigurationExecutionPortInterfaceEntry()
	 * @generated
	 */
	EReference getReconfigurationExecutionPortInterfaceEntry_TimeForExecutionPhase();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getReconfigurationExecutionPort <em>Reconfiguration Execution Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reconfiguration Execution Port</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getReconfigurationExecutionPort()
	 * @see #getReconfigurationExecutionPortInterfaceEntry()
	 * @generated
	 */
	EReference getReconfigurationExecutionPortInterfaceEntry_ReconfigurationExecutionPort();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getMinimumCommitTime <em>Minimum Commit Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum Commit Time</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getMinimumCommitTime()
	 * @see #getReconfigurationExecutionPortInterfaceEntry()
	 * @generated
	 */
	EReference getReconfigurationExecutionPortInterfaceEntry_MinimumCommitTime();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getReturnValues <em>Return Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Values</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getReturnValues()
	 * @see #getReconfigurationExecutionPortInterfaceEntry()
	 * @generated
	 */
	EReference getReconfigurationExecutionPortInterfaceEntry_ReturnValues();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getMinimumRetryTime <em>Minimum Retry Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum Retry Time</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry#getMinimumRetryTime()
	 * @see #getReconfigurationExecutionPortInterfaceEntry()
	 * @generated
	 */
	EReference getReconfigurationExecutionPortInterfaceEntry_MinimumRetryTime();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ExecutionTimingSpecification <em>Execution Timing Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Timing Specification</em>'.
	 * @see org.muml.reconfiguration.ExecutionTimingSpecification
	 * @generated
	 */
	EClass getExecutionTimingSpecification();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ExecutionTimingSpecificationSinglePhase <em>Execution Timing Specification Single Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Timing Specification Single Phase</em>'.
	 * @see org.muml.reconfiguration.ExecutionTimingSpecificationSinglePhase
	 * @generated
	 */
	EClass getExecutionTimingSpecificationSinglePhase();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.ExecutionTimingSpecificationSinglePhase#getTimeForExecution <em>Time For Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time For Execution</em>'.
	 * @see org.muml.reconfiguration.ExecutionTimingSpecificationSinglePhase#getTimeForExecution()
	 * @see #getExecutionTimingSpecificationSinglePhase()
	 * @generated
	 */
	EReference getExecutionTimingSpecificationSinglePhase_TimeForExecution();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ExecutionTimingSpecificationThreePhase <em>Execution Timing Specification Three Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Timing Specification Three Phase</em>'.
	 * @see org.muml.reconfiguration.ExecutionTimingSpecificationThreePhase
	 * @generated
	 */
	EClass getExecutionTimingSpecificationThreePhase();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.ExecutionTimingSpecificationThreePhase#getTimeForSetup <em>Time For Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time For Setup</em>'.
	 * @see org.muml.reconfiguration.ExecutionTimingSpecificationThreePhase#getTimeForSetup()
	 * @see #getExecutionTimingSpecificationThreePhase()
	 * @generated
	 */
	EReference getExecutionTimingSpecificationThreePhase_TimeForSetup();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.ExecutionTimingSpecificationThreePhase#getTimeForFading <em>Time For Fading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time For Fading</em>'.
	 * @see org.muml.reconfiguration.ExecutionTimingSpecificationThreePhase#getTimeForFading()
	 * @see #getExecutionTimingSpecificationThreePhase()
	 * @generated
	 */
	EReference getExecutionTimingSpecificationThreePhase_TimeForFading();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.ExecutionTimingSpecificationThreePhase#getTimeForTeardown <em>Time For Teardown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time For Teardown</em>'.
	 * @see org.muml.reconfiguration.ExecutionTimingSpecificationThreePhase#getTimeForTeardown()
	 * @see #getExecutionTimingSpecificationThreePhase()
	 * @generated
	 */
	EReference getExecutionTimingSpecificationThreePhase_TimeForTeardown();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see org.muml.reconfiguration.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.Signature#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.muml.reconfiguration.Signature#getParameters()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.Signature#getReturnParameters <em>Return Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Parameters</em>'.
	 * @see org.muml.reconfiguration.Signature#getReturnParameters()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_ReturnParameters();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.reconfiguration.Signature#getReconfigurationRule <em>Reconfiguration Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reconfiguration Rule</em>'.
	 * @see org.muml.reconfiguration.Signature#getReconfigurationRule()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_ReconfigurationRule();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.InternalReconfigurationCommunicationPort <em>Internal Reconfiguration Communication Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Reconfiguration Communication Port</em>'.
	 * @see org.muml.reconfiguration.InternalReconfigurationCommunicationPort
	 * @generated
	 */
	EClass getInternalReconfigurationCommunicationPort();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ReconfigurationPortAssemblyConnector <em>Port Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Assembly Connector</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationPortAssemblyConnector
	 * @generated
	 */
	EClass getReconfigurationPortAssemblyConnector();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ReconfigurationPortDelegationConnector <em>Port Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Delegation Connector</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationPortDelegationConnector
	 * @generated
	 */
	EClass getReconfigurationPortDelegationConnector();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.FadingComponent <em>Fading Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fading Component</em>'.
	 * @see org.muml.reconfiguration.FadingComponent
	 * @generated
	 */
	EClass getFadingComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.FadingComponent#getFadingFunction <em>Fading Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fading Function</em>'.
	 * @see org.muml.reconfiguration.FadingComponent#getFadingFunction()
	 * @see #getFadingComponent()
	 * @generated
	 */
	EReference getFadingComponent_FadingFunction();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.FadingFunction <em>Fading Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fading Function</em>'.
	 * @see org.muml.reconfiguration.FadingFunction
	 * @generated
	 */
	EClass getFadingFunction();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.FadingFunction#getFromPort <em>From Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Port</em>'.
	 * @see org.muml.reconfiguration.FadingFunction#getFromPort()
	 * @see #getFadingFunction()
	 * @generated
	 */
	EReference getFadingFunction_FromPort();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.FadingFunction#getToPort <em>To Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Port</em>'.
	 * @see org.muml.reconfiguration.FadingFunction#getToPort()
	 * @see #getFadingFunction()
	 * @generated
	 */
	EReference getFadingFunction_ToPort();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ReconfigurationConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationConstraint
	 * @generated
	 */
	EClass getReconfigurationConstraint();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.HybridPortMapping <em>Hybrid Port Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Port Mapping</em>'.
	 * @see org.muml.reconfiguration.HybridPortMapping
	 * @generated
	 */
	EClass getHybridPortMapping();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.HybridPortMapping#getHybridPort <em>Hybrid Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hybrid Port</em>'.
	 * @see org.muml.reconfiguration.HybridPortMapping#getHybridPort()
	 * @see #getHybridPortMapping()
	 * @generated
	 */
	EReference getHybridPortMapping_HybridPort();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.HybridPortMapping#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see org.muml.reconfiguration.HybridPortMapping#getFunction()
	 * @see #getHybridPortMapping()
	 * @generated
	 */
	EReference getHybridPortMapping_Function();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry <em>Execution Specification Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Specification Entry</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry
	 * @generated
	 */
	EClass getReconfigurationExecutionSpecificationEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry#getGuards <em>Guards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guards</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry#getGuards()
	 * @see #getReconfigurationExecutionSpecificationEntry()
	 * @generated
	 */
	EReference getReconfigurationExecutionSpecificationEntry_Guards();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry#getMessage()
	 * @see #getReconfigurationExecutionSpecificationEntry()
	 * @generated
	 */
	EReference getReconfigurationExecutionSpecificationEntry_Message();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry#getReconfigurationRule <em>Reconfiguration Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconfiguration Rule</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry#getReconfigurationRule()
	 * @see #getReconfigurationExecutionSpecificationEntry()
	 * @generated
	 */
	EReference getReconfigurationExecutionSpecificationEntry_ReconfigurationRule();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry#getHybridPortMappings <em>Hybrid Port Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hybrid Port Mappings</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry#getHybridPortMappings()
	 * @see #getReconfigurationExecutionSpecificationEntry()
	 * @generated
	 */
	EReference getReconfigurationExecutionSpecificationEntry_HybridPortMappings();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ReconfigurationManagementSpecificationEntry <em>Management Specification Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Management Specification Entry</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationManagementSpecificationEntry
	 * @generated
	 */
	EClass getReconfigurationManagementSpecificationEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.ReconfigurationManagementSpecificationEntry#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationManagementSpecificationEntry#getConditions()
	 * @see #getReconfigurationManagementSpecificationEntry()
	 * @generated
	 */
	EReference getReconfigurationManagementSpecificationEntry_Conditions();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.ReconfigurationManagementSpecificationEntry#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationManagementSpecificationEntry#getMessage()
	 * @see #getReconfigurationManagementSpecificationEntry()
	 * @generated
	 */
	EReference getReconfigurationManagementSpecificationEntry_Message();

	/**
	 * Returns the meta object for enum '{@link org.muml.reconfiguration.ReconfigurationMessageTypeEnum <em>Message Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Type Enum</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationMessageTypeEnum
	 * @generated
	 */
	EEnum getReconfigurationMessageTypeEnum();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see org.muml.reconfiguration.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.Manager#getSpecificationEntries <em>Specification Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification Entries</em>'.
	 * @see org.muml.reconfiguration.Manager#getSpecificationEntries()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_SpecificationEntries();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.reconfiguration.Manager#getReconfigurationController <em>Reconfiguration Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reconfiguration Controller</em>'.
	 * @see org.muml.reconfiguration.Manager#getReconfigurationController()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_ReconfigurationController();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.Manager#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.muml.reconfiguration.Manager#getPorts()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_Ports();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.reconfiguration.Manager#getReconfigurationMessagePorts <em>Reconfiguration Message Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reconfiguration Message Ports</em>'.
	 * @see org.muml.reconfiguration.Manager#getReconfigurationMessagePorts()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_ReconfigurationMessagePorts();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.Executor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor</em>'.
	 * @see org.muml.reconfiguration.Executor
	 * @generated
	 */
	EClass getExecutor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.Executor#getSpecificationEntries <em>Specification Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification Entries</em>'.
	 * @see org.muml.reconfiguration.Executor#getSpecificationEntries()
	 * @see #getExecutor()
	 * @generated
	 */
	EReference getExecutor_SpecificationEntries();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.reconfiguration.Executor#getReconfigurationController <em>Reconfiguration Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reconfiguration Controller</em>'.
	 * @see org.muml.reconfiguration.Executor#getReconfigurationController()
	 * @see #getExecutor()
	 * @generated
	 */
	EReference getExecutor_ReconfigurationController();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.Executor#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.muml.reconfiguration.Executor#getPorts()
	 * @see #getExecutor()
	 * @generated
	 */
	EReference getExecutor_Ports();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.reconfiguration.Executor#getReconfigurationExecutionPorts <em>Reconfiguration Execution Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reconfiguration Execution Ports</em>'.
	 * @see org.muml.reconfiguration.Executor#getReconfigurationExecutionPorts()
	 * @see #getExecutor()
	 * @generated
	 */
	EReference getExecutor_ReconfigurationExecutionPorts();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ReconfigurationRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationRule
	 * @generated
	 */
	EClass getReconfigurationRule();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.ReconfigurationRule#getReconfiguredComponent <em>Reconfigured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconfigured Component</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationRule#getReconfiguredComponent()
	 * @see #getReconfigurationRule()
	 * @generated
	 */
	EReference getReconfigurationRule_ReconfiguredComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.ReconfigurationRule#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationRule#getSignature()
	 * @see #getReconfigurationRule()
	 * @generated
	 */
	EReference getReconfigurationRule_Signature();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfiguration.ReconfigurationRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationRule#getName()
	 * @see #getReconfigurationRule()
	 * @generated
	 */
	EAttribute getReconfigurationRule_Name();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.StructuralCondition <em>Structural Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Condition</em>'.
	 * @see org.muml.reconfiguration.StructuralCondition
	 * @generated
	 */
	EClass getStructuralCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.StructuralCondition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.muml.reconfiguration.StructuralCondition#getParameters()
	 * @see #getStructuralCondition()
	 * @generated
	 */
	EReference getStructuralCondition_Parameters();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.StructuralCondition#getReconfigurableComponent <em>Reconfigurable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconfigurable Component</em>'.
	 * @see org.muml.reconfiguration.StructuralCondition#getReconfigurableComponent()
	 * @see #getStructuralCondition()
	 * @generated
	 */
	EReference getStructuralCondition_ReconfigurableComponent();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ReconfigurableComponent <em>Reconfigurable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfigurable Component</em>'.
	 * @see org.muml.reconfiguration.ReconfigurableComponent
	 * @generated
	 */
	EClass getReconfigurableComponent();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ReconfigurationMessagePort <em>Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Port</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationMessagePort
	 * @generated
	 */
	EClass getReconfigurationMessagePort();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.ReconfigurationMessagePort#getInterfaceEntries <em>Interface Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Entries</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationMessagePort#getInterfaceEntries()
	 * @see #getReconfigurationMessagePort()
	 * @generated
	 */
	EReference getReconfigurationMessagePort_InterfaceEntries();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ReconfigurationExecutionPort <em>Execution Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Port</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationExecutionPort
	 * @generated
	 */
	EClass getReconfigurationExecutionPort();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfiguration.ReconfigurationExecutionPort#getInterfaceEntries <em>Interface Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Entries</em>'.
	 * @see org.muml.reconfiguration.ReconfigurationExecutionPort#getInterfaceEntries()
	 * @see #getReconfigurationExecutionPort()
	 * @generated
	 */
	EReference getReconfigurationExecutionPort_InterfaceEntries();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ExecutorSpecificationEntry <em>Executor Specification Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor Specification Entry</em>'.
	 * @see org.muml.reconfiguration.ExecutorSpecificationEntry
	 * @generated
	 */
	EClass getExecutorSpecificationEntry();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.reconfiguration.ExecutorSpecificationEntry#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Executor</em>'.
	 * @see org.muml.reconfiguration.ExecutorSpecificationEntry#getExecutor()
	 * @see #getExecutorSpecificationEntry()
	 * @generated
	 */
	EReference getExecutorSpecificationEntry_Executor();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.ExecutorSpecificationEntry#getReconfigurationRule <em>Reconfiguration Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconfiguration Rule</em>'.
	 * @see org.muml.reconfiguration.ExecutorSpecificationEntry#getReconfigurationRule()
	 * @see #getExecutorSpecificationEntry()
	 * @generated
	 */
	EReference getExecutorSpecificationEntry_ReconfigurationRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.ExecutorSpecificationEntry#getWcet <em>Wcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wcet</em>'.
	 * @see org.muml.reconfiguration.ExecutorSpecificationEntry#getWcet()
	 * @see #getExecutorSpecificationEntry()
	 * @generated
	 */
	EReference getExecutorSpecificationEntry_Wcet();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfiguration.ExecutorSpecificationEntry#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.muml.reconfiguration.ExecutorSpecificationEntry#getId()
	 * @see #getExecutorSpecificationEntry()
	 * @generated
	 */
	EAttribute getExecutorSpecificationEntry_Id();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfiguration.ManagerSpecificationEntry <em>Manager Specification Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager Specification Entry</em>'.
	 * @see org.muml.reconfiguration.ManagerSpecificationEntry
	 * @generated
	 */
	EClass getManagerSpecificationEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfiguration.ManagerSpecificationEntry#isTreat <em>Treat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treat</em>'.
	 * @see org.muml.reconfiguration.ManagerSpecificationEntry#isTreat()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EAttribute getManagerSpecificationEntry_Treat();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfiguration.ManagerSpecificationEntry#isPropagate <em>Propagate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Propagate</em>'.
	 * @see org.muml.reconfiguration.ManagerSpecificationEntry#isPropagate()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EAttribute getManagerSpecificationEntry_Propagate();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.reconfiguration.ManagerSpecificationEntry#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Manager</em>'.
	 * @see org.muml.reconfiguration.ManagerSpecificationEntry#getManager()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EReference getManagerSpecificationEntry_Manager();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.ManagerSpecificationEntry#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Type</em>'.
	 * @see org.muml.reconfiguration.ManagerSpecificationEntry#getMessageType()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EReference getManagerSpecificationEntry_MessageType();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.ManagerSpecificationEntry#getStructuralCondition <em>Structural Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structural Condition</em>'.
	 * @see org.muml.reconfiguration.ManagerSpecificationEntry#getStructuralCondition()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EReference getManagerSpecificationEntry_StructuralCondition();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfiguration.ManagerSpecificationEntry#getReconfigurationRule <em>Reconfiguration Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconfiguration Rule</em>'.
	 * @see org.muml.reconfiguration.ManagerSpecificationEntry#getReconfigurationRule()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EReference getManagerSpecificationEntry_ReconfigurationRule();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfiguration.ManagerSpecificationEntry#isInvokePlanner <em>Invoke Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoke Planner</em>'.
	 * @see org.muml.reconfiguration.ManagerSpecificationEntry#isInvokePlanner()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EAttribute getManagerSpecificationEntry_InvokePlanner();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfiguration.ManagerSpecificationEntry#getTimeForPlanning <em>Time For Planning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time For Planning</em>'.
	 * @see org.muml.reconfiguration.ManagerSpecificationEntry#getTimeForPlanning()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EReference getManagerSpecificationEntry_TimeForPlanning();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfiguration.ManagerSpecificationEntry#isBlockable <em>Blockable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blockable</em>'.
	 * @see org.muml.reconfiguration.ManagerSpecificationEntry#isBlockable()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EAttribute getManagerSpecificationEntry_Blockable();

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
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ReconfigurableStructuredComponentImpl <em>Reconfigurable Structured Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ReconfigurableStructuredComponentImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurableStructuredComponent()
		 * @generated
		 */
		EClass RECONFIGURABLE_STRUCTURED_COMPONENT = eINSTANCE.getReconfigurableStructuredComponent();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLER = eINSTANCE.getReconfigurableStructuredComponent_Controller();

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
		 * The meta object literal for the '<em><b>Initial Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURABLE_STRUCTURED_COMPONENT__INITIAL_CONFIGURATION = eINSTANCE.getReconfigurableStructuredComponent_InitialConfiguration();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ReconfigurableAtomicComponentImpl <em>Reconfigurable Atomic Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ReconfigurableAtomicComponentImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurableAtomicComponent()
		 * @generated
		 */
		EClass RECONFIGURABLE_ATOMIC_COMPONENT = eINSTANCE.getReconfigurableAtomicComponent();

		/**
		 * The meta object literal for the '<em><b>Execution Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURABLE_ATOMIC_COMPONENT__EXECUTION_ENTRIES = eINSTANCE.getReconfigurableAtomicComponent_ExecutionEntries();

		/**
		 * The meta object literal for the '<em><b>Management Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURABLE_ATOMIC_COMPONENT__MANAGEMENT_ENTRIES = eINSTANCE.getReconfigurableAtomicComponent_ManagementEntries();

		/**
		 * The meta object literal for the '<em><b>Hybrid Port Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURABLE_ATOMIC_COMPONENT__HYBRID_PORT_MAPPINGS = eINSTANCE.getReconfigurableAtomicComponent_HybridPortMappings();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ReconfigurationPortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ReconfigurationPortImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationPort()
		 * @generated
		 */
		EClass RECONFIGURATION_PORT = eINSTANCE.getReconfigurationPort();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ControllerImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getController()
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
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ReconfigurationControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ReconfigurationControllerImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationController()
		 * @generated
		 */
		EClass RECONFIGURATION_CONTROLLER = eINSTANCE.getReconfigurationController();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.RuleBasedReconfigurationControllerImpl <em>Rule Based Reconfiguration Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.RuleBasedReconfigurationControllerImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getRuleBasedReconfigurationController()
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
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ReconfigurationPortInterfaceEntryImpl <em>Port Interface Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ReconfigurationPortInterfaceEntryImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationPortInterfaceEntry()
		 * @generated
		 */
		EClass RECONFIGURATION_PORT_INTERFACE_ENTRY = eINSTANCE.getReconfigurationPortInterfaceEntry();

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
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ReconfigurationMessagePortInterfaceEntryImpl <em>Message Port Interface Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ReconfigurationMessagePortInterfaceEntryImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessagePortInterfaceEntry()
		 * @generated
		 */
		EClass RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY = eINSTANCE.getReconfigurationMessagePortInterfaceEntry();

		/**
		 * The meta object literal for the '<em><b>Reconfiguration Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_TYPE = eINSTANCE.getReconfigurationMessagePortInterfaceEntry_ReconfigurationMessageType();

		/**
		 * The meta object literal for the '<em><b>Expected Response Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME = eINSTANCE.getReconfigurationMessagePortInterfaceEntry_ExpectedResponseTime();

		/**
		 * The meta object literal for the '<em><b>Reconfiguration Message Port</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_PORT = eINSTANCE.getReconfigurationMessagePortInterfaceEntry_ReconfigurationMessagePort();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ReconfigurationExecutionPortInterfaceEntryImpl <em>Execution Port Interface Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ReconfigurationExecutionPortInterfaceEntryImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationExecutionPortInterfaceEntry()
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
		 * The meta object literal for the '<em><b>Time For Execution Phase</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_EXECUTION_PHASE = eINSTANCE.getReconfigurationExecutionPortInterfaceEntry_TimeForExecutionPhase();

		/**
		 * The meta object literal for the '<em><b>Reconfiguration Execution Port</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RECONFIGURATION_EXECUTION_PORT = eINSTANCE.getReconfigurationExecutionPortInterfaceEntry_ReconfigurationExecutionPort();

		/**
		 * The meta object literal for the '<em><b>Minimum Commit Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__MINIMUM_COMMIT_TIME = eINSTANCE.getReconfigurationExecutionPortInterfaceEntry_MinimumCommitTime();

		/**
		 * The meta object literal for the '<em><b>Return Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RETURN_VALUES = eINSTANCE.getReconfigurationExecutionPortInterfaceEntry_ReturnValues();

		/**
		 * The meta object literal for the '<em><b>Minimum Retry Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__MINIMUM_RETRY_TIME = eINSTANCE.getReconfigurationExecutionPortInterfaceEntry_MinimumRetryTime();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ExecutionTimingSpecificationImpl <em>Execution Timing Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ExecutionTimingSpecificationImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getExecutionTimingSpecification()
		 * @generated
		 */
		EClass EXECUTION_TIMING_SPECIFICATION = eINSTANCE.getExecutionTimingSpecification();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ExecutionTimingSpecificationSinglePhaseImpl <em>Execution Timing Specification Single Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ExecutionTimingSpecificationSinglePhaseImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getExecutionTimingSpecificationSinglePhase()
		 * @generated
		 */
		EClass EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE = eINSTANCE.getExecutionTimingSpecificationSinglePhase();

		/**
		 * The meta object literal for the '<em><b>Time For Execution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE__TIME_FOR_EXECUTION = eINSTANCE.getExecutionTimingSpecificationSinglePhase_TimeForExecution();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ExecutionTimingSpecificationThreePhaseImpl <em>Execution Timing Specification Three Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ExecutionTimingSpecificationThreePhaseImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getExecutionTimingSpecificationThreePhase()
		 * @generated
		 */
		EClass EXECUTION_TIMING_SPECIFICATION_THREE_PHASE = eINSTANCE.getExecutionTimingSpecificationThreePhase();

		/**
		 * The meta object literal for the '<em><b>Time For Setup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_SETUP = eINSTANCE.getExecutionTimingSpecificationThreePhase_TimeForSetup();

		/**
		 * The meta object literal for the '<em><b>Time For Fading</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_FADING = eINSTANCE.getExecutionTimingSpecificationThreePhase_TimeForFading();

		/**
		 * The meta object literal for the '<em><b>Time For Teardown</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_TEARDOWN = eINSTANCE.getExecutionTimingSpecificationThreePhase_TimeForTeardown();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.SignatureImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__PARAMETERS = eINSTANCE.getSignature_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__RETURN_PARAMETERS = eINSTANCE.getSignature_ReturnParameters();

		/**
		 * The meta object literal for the '<em><b>Reconfiguration Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__RECONFIGURATION_RULE = eINSTANCE.getSignature_ReconfigurationRule();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.InternalReconfigurationCommunicationPortImpl <em>Internal Reconfiguration Communication Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.InternalReconfigurationCommunicationPortImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getInternalReconfigurationCommunicationPort()
		 * @generated
		 */
		EClass INTERNAL_RECONFIGURATION_COMMUNICATION_PORT = eINSTANCE.getInternalReconfigurationCommunicationPort();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ReconfigurationPortAssemblyConnectorImpl <em>Port Assembly Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ReconfigurationPortAssemblyConnectorImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationPortAssemblyConnector()
		 * @generated
		 */
		EClass RECONFIGURATION_PORT_ASSEMBLY_CONNECTOR = eINSTANCE.getReconfigurationPortAssemblyConnector();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ReconfigurationPortDelegationConnectorImpl <em>Port Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ReconfigurationPortDelegationConnectorImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationPortDelegationConnector()
		 * @generated
		 */
		EClass RECONFIGURATION_PORT_DELEGATION_CONNECTOR = eINSTANCE.getReconfigurationPortDelegationConnector();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.FadingComponentImpl <em>Fading Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.FadingComponentImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getFadingComponent()
		 * @generated
		 */
		EClass FADING_COMPONENT = eINSTANCE.getFadingComponent();

		/**
		 * The meta object literal for the '<em><b>Fading Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FADING_COMPONENT__FADING_FUNCTION = eINSTANCE.getFadingComponent_FadingFunction();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.FadingFunctionImpl <em>Fading Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.FadingFunctionImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getFadingFunction()
		 * @generated
		 */
		EClass FADING_FUNCTION = eINSTANCE.getFadingFunction();

		/**
		 * The meta object literal for the '<em><b>From Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FADING_FUNCTION__FROM_PORT = eINSTANCE.getFadingFunction_FromPort();

		/**
		 * The meta object literal for the '<em><b>To Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FADING_FUNCTION__TO_PORT = eINSTANCE.getFadingFunction_ToPort();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ReconfigurationConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ReconfigurationConstraintImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationConstraint()
		 * @generated
		 */
		EClass RECONFIGURATION_CONSTRAINT = eINSTANCE.getReconfigurationConstraint();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.HybridPortMappingImpl <em>Hybrid Port Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.HybridPortMappingImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getHybridPortMapping()
		 * @generated
		 */
		EClass HYBRID_PORT_MAPPING = eINSTANCE.getHybridPortMapping();

		/**
		 * The meta object literal for the '<em><b>Hybrid Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_PORT_MAPPING__HYBRID_PORT = eINSTANCE.getHybridPortMapping_HybridPort();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_PORT_MAPPING__FUNCTION = eINSTANCE.getHybridPortMapping_Function();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ReconfigurationExecutionSpecificationEntryImpl <em>Execution Specification Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ReconfigurationExecutionSpecificationEntryImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationExecutionSpecificationEntry()
		 * @generated
		 */
		EClass RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY = eINSTANCE.getReconfigurationExecutionSpecificationEntry();

		/**
		 * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__GUARDS = eINSTANCE.getReconfigurationExecutionSpecificationEntry_Guards();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__MESSAGE = eINSTANCE.getReconfigurationExecutionSpecificationEntry_Message();

		/**
		 * The meta object literal for the '<em><b>Reconfiguration Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__RECONFIGURATION_RULE = eINSTANCE.getReconfigurationExecutionSpecificationEntry_ReconfigurationRule();

		/**
		 * The meta object literal for the '<em><b>Hybrid Port Mappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__HYBRID_PORT_MAPPINGS = eINSTANCE.getReconfigurationExecutionSpecificationEntry_HybridPortMappings();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ReconfigurationManagementSpecificationEntryImpl <em>Management Specification Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ReconfigurationManagementSpecificationEntryImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationManagementSpecificationEntry()
		 * @generated
		 */
		EClass RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY = eINSTANCE.getReconfigurationManagementSpecificationEntry();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__CONDITIONS = eINSTANCE.getReconfigurationManagementSpecificationEntry_Conditions();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__MESSAGE = eINSTANCE.getReconfigurationManagementSpecificationEntry_Message();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.ReconfigurationMessageTypeEnum <em>Message Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.ReconfigurationMessageTypeEnum
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessageTypeEnum()
		 * @generated
		 */
		EEnum RECONFIGURATION_MESSAGE_TYPE_ENUM = eINSTANCE.getReconfigurationMessageTypeEnum();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ManagerImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getManager()
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
		 * The meta object literal for the '<em><b>Reconfiguration Message Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__RECONFIGURATION_MESSAGE_PORTS = eINSTANCE.getManager_ReconfigurationMessagePorts();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ExecutorImpl <em>Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ExecutorImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getExecutor()
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
		 * The meta object literal for the '<em><b>Reconfiguration Execution Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR__RECONFIGURATION_EXECUTION_PORTS = eINSTANCE.getExecutor_ReconfigurationExecutionPorts();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ReconfigurationRuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ReconfigurationRuleImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationRule()
		 * @generated
		 */
		EClass RECONFIGURATION_RULE = eINSTANCE.getReconfigurationRule();

		/**
		 * The meta object literal for the '<em><b>Reconfigured Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_RULE__RECONFIGURED_COMPONENT = eINSTANCE.getReconfigurationRule_ReconfiguredComponent();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_RULE__SIGNATURE = eINSTANCE.getReconfigurationRule_Signature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATION_RULE__NAME = eINSTANCE.getReconfigurationRule_Name();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.StructuralConditionImpl <em>Structural Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.StructuralConditionImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getStructuralCondition()
		 * @generated
		 */
		EClass STRUCTURAL_CONDITION = eINSTANCE.getStructuralCondition();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_CONDITION__PARAMETERS = eINSTANCE.getStructuralCondition_Parameters();

		/**
		 * The meta object literal for the '<em><b>Reconfigurable Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_CONDITION__RECONFIGURABLE_COMPONENT = eINSTANCE.getStructuralCondition_ReconfigurableComponent();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ReconfigurableComponentImpl <em>Reconfigurable Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ReconfigurableComponentImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurableComponent()
		 * @generated
		 */
		EClass RECONFIGURABLE_COMPONENT = eINSTANCE.getReconfigurableComponent();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ReconfigurationMessagePortImpl <em>Message Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ReconfigurationMessagePortImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessagePort()
		 * @generated
		 */
		EClass RECONFIGURATION_MESSAGE_PORT = eINSTANCE.getReconfigurationMessagePort();

		/**
		 * The meta object literal for the '<em><b>Interface Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_MESSAGE_PORT__INTERFACE_ENTRIES = eINSTANCE.getReconfigurationMessagePort_InterfaceEntries();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ReconfigurationExecutionPortImpl <em>Execution Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ReconfigurationExecutionPortImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationExecutionPort()
		 * @generated
		 */
		EClass RECONFIGURATION_EXECUTION_PORT = eINSTANCE.getReconfigurationExecutionPort();

		/**
		 * The meta object literal for the '<em><b>Interface Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_EXECUTION_PORT__INTERFACE_ENTRIES = eINSTANCE.getReconfigurationExecutionPort_InterfaceEntries();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ExecutorSpecificationEntryImpl <em>Executor Specification Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ExecutorSpecificationEntryImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getExecutorSpecificationEntry()
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
		 * The meta object literal for the '<em><b>Wcet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR_SPECIFICATION_ENTRY__WCET = eINSTANCE.getExecutorSpecificationEntry_Wcet();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTOR_SPECIFICATION_ENTRY__ID = eINSTANCE.getExecutorSpecificationEntry_Id();

		/**
		 * The meta object literal for the '{@link org.muml.reconfiguration.impl.ManagerSpecificationEntryImpl <em>Manager Specification Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfiguration.impl.ManagerSpecificationEntryImpl
		 * @see org.muml.reconfiguration.impl.ReconfigurationPackageImpl#getManagerSpecificationEntry()
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
		 * The meta object literal for the '<em><b>Structural Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_SPECIFICATION_ENTRY__STRUCTURAL_CONDITION = eINSTANCE.getManagerSpecificationEntry_StructuralCondition();

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

		/**
		 * The meta object literal for the '<em><b>Blockable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_SPECIFICATION_ENTRY__BLOCKABLE = eINSTANCE.getManagerSpecificationEntry_Blockable();

	}

} //ReconfigurationPackage
