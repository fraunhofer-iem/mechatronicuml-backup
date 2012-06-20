/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;

import org.eclipse.emf.ecore.EAttribute;
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
	String eNS_URI = "http://www.fujaba.de/muml/reconfiguration/0.3.0";

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
	 * The feature id for the '<em><b>Declared Reconfiguration Message Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT__DECLARED_RECONFIGURATION_MESSAGE_TYPES = ComponentPackage.STRUCTURED_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reconfigurable Structured Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURABLE_STRUCTURED_COMPONENT_FEATURE_COUNT = ComponentPackage.STRUCTURED_COMPONENT_FEATURE_COUNT + 4;

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
	int RECONFIGURATION_PORT__ANNOTATION = ComponentPackage.PORT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__EXTENSION = ComponentPackage.PORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__NAME = ComponentPackage.PORT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__COMMENT = ComponentPackage.PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__CONSTRAINT = ComponentPackage.PORT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__CARDINALITY = ComponentPackage.PORT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Incoming Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__INCOMING_CONNECTORS = ComponentPackage.PORT__INCOMING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Outgoing Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__OUTGOING_CONNECTORS = ComponentPackage.PORT__OUTGOING_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__COMPONENT = ComponentPackage.PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__CONNECTORS = ComponentPackage.PORT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Is Multi Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT__IS_MULTI_PORT = ComponentPackage.PORT__IS_MULTI_PORT;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_PORT_FEATURE_COUNT = ComponentPackage.PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationControllerImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationController()
	 * @generated
	 */
	int RECONFIGURATION_CONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Structured Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implementations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER__IMPLEMENTATIONS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

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
	int MANAGER__ANNOTATION = RECONFIGURATION_CONTROLLER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__EXTENSION = RECONFIGURATION_CONTROLLER__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__NAME = RECONFIGURATION_CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__COMMENT = RECONFIGURATION_CONTROLLER__COMMENT;

	/**
	 * The feature id for the '<em><b>Structured Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__STRUCTURED_COMPONENT = RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT;

	/**
	 * The feature id for the '<em><b>Implementations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__IMPLEMENTATIONS = RECONFIGURATION_CONTROLLER__IMPLEMENTATIONS;

	/**
	 * The feature id for the '<em><b>Specification Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__SPECIFICATION_ENTRIES = RECONFIGURATION_CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = RECONFIGURATION_CONTROLLER_FEATURE_COUNT + 1;

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
	int EXECUTOR__ANNOTATION = RECONFIGURATION_CONTROLLER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__EXTENSION = RECONFIGURATION_CONTROLLER__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__NAME = RECONFIGURATION_CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__COMMENT = RECONFIGURATION_CONTROLLER__COMMENT;

	/**
	 * The feature id for the '<em><b>Structured Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__STRUCTURED_COMPONENT = RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT;

	/**
	 * The feature id for the '<em><b>Implementations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__IMPLEMENTATIONS = RECONFIGURATION_CONTROLLER__IMPLEMENTATIONS;

	/**
	 * The feature id for the '<em><b>Specification Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__SPECIFICATION_ENTRIES = RECONFIGURATION_CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_FEATURE_COUNT = RECONFIGURATION_CONTROLLER_FEATURE_COUNT + 1;


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
	 * The feature id for the '<em><b>Return Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__RETURN_PARAMETERS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;


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
	int PART_DATA_TYPE__ANNOTATION = de.uni_paderborn.fujaba.muml.model.core.CorePackage.DATA_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DATA_TYPE__EXTENSION = de.uni_paderborn.fujaba.muml.model.core.CorePackage.DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DATA_TYPE__NAME = de.uni_paderborn.fujaba.muml.model.core.CorePackage.DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DATA_TYPE__COMMENT = de.uni_paderborn.fujaba.muml.model.core.CorePackage.DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DATA_TYPE__COMPONENT_PART = de.uni_paderborn.fujaba.muml.model.core.CorePackage.DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Part Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DATA_TYPE_FEATURE_COUNT = de.uni_paderborn.fujaba.muml.model.core.CorePackage.DATA_TYPE_FEATURE_COUNT + 1;

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
	int PORT_DATA_TYPE__ANNOTATION = de.uni_paderborn.fujaba.muml.model.core.CorePackage.DATA_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_TYPE__EXTENSION = de.uni_paderborn.fujaba.muml.model.core.CorePackage.DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_TYPE__NAME = de.uni_paderborn.fujaba.muml.model.core.CorePackage.DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_TYPE__COMMENT = de.uni_paderborn.fujaba.muml.model.core.CorePackage.DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_TYPE__PORT = de.uni_paderborn.fujaba.muml.model.core.CorePackage.DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DATA_TYPE_FEATURE_COUNT = de.uni_paderborn.fujaba.muml.model.core.CorePackage.DATA_TYPE_FEATURE_COUNT + 1;


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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationControllerImplementationImpl <em>Controller Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationControllerImplementationImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationControllerImplementation()
	 * @generated
	 */
	int RECONFIGURATION_CONTROLLER_IMPLEMENTATION = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_IMPLEMENTATION__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_IMPLEMENTATION__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_IMPLEMENTATION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_IMPLEMENTATION__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Controller Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_IMPLEMENTATION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.StatechartImplementationImpl <em>Statechart Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.StatechartImplementationImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getStatechartImplementation()
	 * @generated
	 */
	int STATECHART_IMPLEMENTATION = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATECHART_IMPLEMENTATION__ANNOTATION = RECONFIGURATION_CONTROLLER_IMPLEMENTATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATECHART_IMPLEMENTATION__EXTENSION = RECONFIGURATION_CONTROLLER_IMPLEMENTATION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATECHART_IMPLEMENTATION__NAME = RECONFIGURATION_CONTROLLER_IMPLEMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATECHART_IMPLEMENTATION__COMMENT = RECONFIGURATION_CONTROLLER_IMPLEMENTATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATECHART_IMPLEMENTATION__IMPLEMENTATION = RECONFIGURATION_CONTROLLER_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statechart Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATECHART_IMPLEMENTATION_FEATURE_COUNT = RECONFIGURATION_CONTROLLER_IMPLEMENTATION_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationMessagePortImpl <em>Message Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationMessagePortImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessagePort()
	 * @generated
	 */
	int RECONFIGURATION_MESSAGE_PORT = 12;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationExecutionPortImpl <em>Execution Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationExecutionPortImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationExecutionPort()
	 * @generated
	 */
	int RECONFIGURATION_EXECUTION_PORT = 13;

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
	 * The feature id for the '<em><b>Specification Entries</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT__SPECIFICATION_ENTRIES = RECONFIGURATION_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_EXECUTION_PORT_FEATURE_COUNT = RECONFIGURATION_PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExecutorSpecificationEntryImpl <em>Executor Specification Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExecutorSpecificationEntryImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getExecutorSpecificationEntry()
	 * @generated
	 */
	int EXECUTOR_SPECIFICATION_ENTRY = 14;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR = 0;

	/**
	 * The feature id for the '<em><b>Reconfiguration Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__RECONFIGURATION_RULE = 1;

	/**
	 * The feature id for the '<em><b>Externally Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__EXTERNALLY_VISIBLE = 2;

	/**
	 * The feature id for the '<em><b>Time To Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_FAILURE = 3;

	/**
	 * The feature id for the '<em><b>Time To Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_SUCCESS = 4;

	/**
	 * The number of structural features of the '<em>Executor Specification Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_SPECIFICATION_ENTRY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerSpecificationEntryImpl <em>Manager Specification Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerSpecificationEntryImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getManagerSpecificationEntry()
	 * @generated
	 */
	int MANAGER_SPECIFICATION_ENTRY = 15;

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
	 * The feature id for the '<em><b>Reconfiguration Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__RECONFIGURATION_MESSAGE_TYPE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY__GUARD = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Manager Specification Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_SPECIFICATION_ENTRY_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationMessageTypeImpl <em>Message Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationMessageTypeImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessageType()
	 * @generated
	 */
	int RECONFIGURATION_MESSAGE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_TYPE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_TYPE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_TYPE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_TYPE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationMessagePortEntryImpl <em>Message Port Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationMessagePortEntryImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessagePortEntry()
	 * @generated
	 */
	int RECONFIGURATION_MESSAGE_PORT_ENTRY = 17;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_ENTRY__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_ENTRY__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_ENTRY__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Reconfiguration Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_ENTRY__RECONFIGURATION_MESSAGE_TYPE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Port Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_MESSAGE_PORT_ENTRY_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;


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
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent#getDeclaredReconfigurationMessageTypes <em>Declared Reconfiguration Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declared Reconfiguration Message Types</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent#getDeclaredReconfigurationMessageTypes()
	 * @see #getReconfigurableStructuredComponent()
	 * @generated
	 */
	EReference getReconfigurableStructuredComponent_DeclaredReconfigurationMessageTypes();

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
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationController
	 * @generated
	 */
	EClass getReconfigurationController();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationController#getStructuredComponent <em>Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Structured Component</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationController#getStructuredComponent()
	 * @see #getReconfigurationController()
	 * @generated
	 */
	EReference getReconfigurationController_StructuredComponent();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationController#getImplementations <em>Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementations</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationController#getImplementations()
	 * @see #getReconfigurationController()
	 * @generated
	 */
	EReference getReconfigurationController_Implementations();

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
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationControllerImplementation <em>Controller Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Implementation</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationControllerImplementation
	 * @generated
	 */
	EClass getReconfigurationControllerImplementation();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.StatechartImplementation <em>Statechart Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statechart Implementation</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.StatechartImplementation
	 * @generated
	 */
	EClass getStatechartImplementation();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.StatechartImplementation#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.StatechartImplementation#getImplementation()
	 * @see #getStatechartImplementation()
	 * @generated
	 */
	EReference getStatechartImplementation_Implementation();

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
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessagePort#getInterfaceEntries <em>Interface Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Entries</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessagePort#getInterfaceEntries()
	 * @see #getReconfigurationMessagePort()
	 * @generated
	 */
	EReference getReconfigurationMessagePort_InterfaceEntries();

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
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationExecutionPort#getSpecificationEntries <em>Specification Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification Entries</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationExecutionPort#getSpecificationEntries()
	 * @see #getReconfigurationExecutionPort()
	 * @generated
	 */
	EReference getReconfigurationExecutionPort_SpecificationEntries();

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
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getReconfigurationRule <em>Reconfiguration Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reconfiguration Rule</em>'.
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
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#getReconfigurationMessageType <em>Reconfiguration Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconfiguration Message Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#getReconfigurationMessageType()
	 * @see #getManagerSpecificationEntry()
	 * @generated
	 */
	EReference getManagerSpecificationEntry_ReconfigurationMessageType();

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
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessageType
	 * @generated
	 */
	EClass getReconfigurationMessageType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessagePortEntry <em>Message Port Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Port Entry</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessagePortEntry
	 * @generated
	 */
	EClass getReconfigurationMessagePortEntry();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessagePortEntry#getReconfigurationMessageType <em>Reconfiguration Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconfiguration Message Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessagePortEntry#getReconfigurationMessageType()
	 * @see #getReconfigurationMessagePortEntry()
	 * @generated
	 */
	EReference getReconfigurationMessagePortEntry_ReconfigurationMessageType();

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
		 * The meta object literal for the '<em><b>Declared Reconfiguration Message Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURABLE_STRUCTURED_COMPONENT__DECLARED_RECONFIGURATION_MESSAGE_TYPES = eINSTANCE.getReconfigurableStructuredComponent_DeclaredReconfigurationMessageTypes();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationControllerImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationController()
		 * @generated
		 */
		EClass RECONFIGURATION_CONTROLLER = eINSTANCE.getReconfigurationController();

		/**
		 * The meta object literal for the '<em><b>Structured Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT = eINSTANCE.getReconfigurationController_StructuredComponent();

		/**
		 * The meta object literal for the '<em><b>Implementations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_CONTROLLER__IMPLEMENTATIONS = eINSTANCE.getReconfigurationController_Implementations();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationControllerImplementationImpl <em>Controller Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationControllerImplementationImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationControllerImplementation()
		 * @generated
		 */
		EClass RECONFIGURATION_CONTROLLER_IMPLEMENTATION = eINSTANCE.getReconfigurationControllerImplementation();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.StatechartImplementationImpl <em>Statechart Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.StatechartImplementationImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getStatechartImplementation()
		 * @generated
		 */
		EClass STATECHART_IMPLEMENTATION = eINSTANCE.getStatechartImplementation();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATECHART_IMPLEMENTATION__IMPLEMENTATION = eINSTANCE.getStatechartImplementation_Implementation();

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
		 * The meta object literal for the '<em><b>Interface Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_MESSAGE_PORT__INTERFACE_ENTRIES = eINSTANCE.getReconfigurationMessagePort_InterfaceEntries();

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
		 * The meta object literal for the '<em><b>Specification Entries</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_EXECUTION_PORT__SPECIFICATION_ENTRIES = eINSTANCE.getReconfigurationExecutionPort_SpecificationEntries();

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
		 * The meta object literal for the '<em><b>Reconfiguration Rule</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Reconfiguration Message Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_SPECIFICATION_ENTRY__RECONFIGURATION_MESSAGE_TYPE = eINSTANCE.getManagerSpecificationEntry_ReconfigurationMessageType();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_SPECIFICATION_ENTRY__GUARD = eINSTANCE.getManagerSpecificationEntry_Guard();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationMessageTypeImpl <em>Message Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationMessageTypeImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessageType()
		 * @generated
		 */
		EClass RECONFIGURATION_MESSAGE_TYPE = eINSTANCE.getReconfigurationMessageType();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationMessagePortEntryImpl <em>Message Port Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationMessagePortEntryImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationMessagePortEntry()
		 * @generated
		 */
		EClass RECONFIGURATION_MESSAGE_PORT_ENTRY = eINSTANCE.getReconfigurationMessagePortEntry();

		/**
		 * The meta object literal for the '<em><b>Reconfiguration Message Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_MESSAGE_PORT_ENTRY__RECONFIGURATION_MESSAGE_TYPE = eINSTANCE.getReconfigurationMessagePortEntry_ReconfigurationMessageType();

	}

} //ReconfigurationPackage
