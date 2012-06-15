/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;

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
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_CONTROLLER_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

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
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = RECONFIGURATION_CONTROLLER_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_FEATURE_COUNT = RECONFIGURATION_CONTROLLER_FEATURE_COUNT + 0;


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
	 * The feature id for the '<em><b>In Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__IN_PARAMETERS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE__OUT_PARAMETERS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.PartDataTypeImpl <em>Part Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.PartDataTypeImpl
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getPartDataType()
	 * @generated
	 */
	int PART_DATA_TYPE = 6;

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
	int PORT_DATA_TYPE = 7;

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
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager
	 * @generated
	 */
	EClass getManager();

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
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule
	 * @generated
	 */
	EClass getReconfigurationRule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule#getInParameters <em>In Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Parameters</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule#getInParameters()
	 * @see #getReconfigurationRule()
	 * @generated
	 */
	EReference getReconfigurationRule_InParameters();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule#getOutParameters <em>Out Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Parameters</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule#getOutParameters()
	 * @see #getReconfigurationRule()
	 * @generated
	 */
	EReference getReconfigurationRule_OutParameters();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationRuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationRuleImpl
		 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationPackageImpl#getReconfigurationRule()
		 * @generated
		 */
		EClass RECONFIGURATION_RULE = eINSTANCE.getReconfigurationRule();

		/**
		 * The meta object literal for the '<em><b>In Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_RULE__IN_PARAMETERS = eINSTANCE.getReconfigurationRule_InParameters();

		/**
		 * The meta object literal for the '<em><b>Out Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_RULE__OUT_PARAMETERS = eINSTANCE.getReconfigurationRule_OutParameters();

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

	}

} //ReconfigurationPackage
