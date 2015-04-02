/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations;

import de.fraunhofer.iem.m4a.IEC61131.core.CorePackage;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * contains configurations and instances of programs and instance specific initializations
 * <!-- end-model-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigurationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configurations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iem.fraunhofer.de/m4a/iec61131/1.0/core/configurations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "configurations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationsPackage eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationDeclarationImpl <em>Configuration Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getConfigurationDeclaration()
	 * @generated
	 */
	int CONFIGURATION_DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DECLARATION__IDENTIFIER = CorePackage.LIBRARY_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DECLARATION__RESOURCES = CorePackage.LIBRARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DECLARATION__DECLARATIONS = CorePackage.LIBRARY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DECLARATION__ACCESS = CorePackage.LIBRARY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instance Specific Inits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DECLARATION__INSTANCE_SPECIFIC_INITS = CorePackage.LIBRARY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Global Var Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DECLARATION__GLOBAL_VAR_NAMES = CorePackage.LIBRARY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Configuration Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DECLARATION_FEATURE_COUNT = CorePackage.LIBRARY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Configuration Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DECLARATION_OPERATION_COUNT = CorePackage.LIBRARY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ResourceDeclarationImpl <em>Resource Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ResourceDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getResourceDeclaration()
	 * @generated
	 */
	int RESOURCE_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DECLARATION__IDENTIFIER = LiteralsPackage.NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DECLARATION__DECLARATIONS = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Program Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DECLARATION__PROGRAM_CONFIGURATIONS = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Task Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DECLARATION__TASK_CONFIGURATIONS = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Global Var Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DECLARATION__GLOBAL_VAR_NAMES = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>On Hardware Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DECLARATION__ON_HARDWARE_RESOURCE = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Resource Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DECLARATION_FEATURE_COUNT = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Resource Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DECLARATION_OPERATION_COUNT = LiteralsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgramConfigurationImpl <em>Program Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgramConfigurationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getProgramConfiguration()
	 * @generated
	 */
	int PROGRAM_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIGURATION__IDENTIFIER = LiteralsPackage.NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIGURATION__WITH = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIGURATION__PROGRAM = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Retain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIGURATION__RETAIN = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Prog Conf Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIGURATION__PROG_CONF_ELEMENTS = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Program Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIGURATION_FEATURE_COUNT = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Program Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CONFIGURATION_OPERATION_COUNT = LiteralsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.TaskConfigurationImpl <em>Task Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.TaskConfigurationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getTaskConfiguration()
	 * @generated
	 */
	int TASK_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIGURATION__IDENTIFIER = LiteralsPackage.NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIGURATION__SINGLE = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIGURATION__INTERVAL = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIGURATION__PRIORITY = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIGURATION_FEATURE_COUNT = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Task Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIGURATION_OPERATION_COUNT = LiteralsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSource <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSource
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 4;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.GlobalVarReferenceImpl <em>Global Var Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.GlobalVarReferenceImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getGlobalVarReference()
	 * @generated
	 */
	int GLOBAL_VAR_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_REFERENCE__REFERENCE = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Structure Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_REFERENCE__STRUCTURE_ELEMENT_NAME = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Global Var Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_REFERENCE_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Global Var Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_REFERENCE_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgramOutputReferenceImpl <em>Program Output Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgramOutputReferenceImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getProgramOutputReference()
	 * @generated
	 */
	int PROGRAM_OUTPUT_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Refernce</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OUTPUT_REFERENCE__REFERNCE = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program Output Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OUTPUT_REFERENCE_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Program Output Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OUTPUT_REFERENCE_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgConfElement <em>Prog Conf Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgConfElement
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getProgConfElement()
	 * @generated
	 */
	int PROG_CONF_ELEMENT = 7;

	/**
	 * The number of structural features of the '<em>Prog Conf Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_CONF_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Prog Conf Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_CONF_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.FBTaskImpl <em>FB Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.FBTaskImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getFBTask()
	 * @generated
	 */
	int FB_TASK = 8;

	/**
	 * The feature id for the '<em><b>With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_TASK__WITH = PROG_CONF_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_TASK__FUNCTION_BLOCK = PROG_CONF_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FB Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_TASK_FEATURE_COUNT = PROG_CONF_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>FB Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_TASK_OPERATION_COUNT = PROG_CONF_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgCnxnImpl <em>Prog Cnxn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgCnxnImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getProgCnxn()
	 * @generated
	 */
	int PROG_CNXN = 9;

	/**
	 * The feature id for the '<em><b>Prog Data Source Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_CNXN__PROG_DATA_SOURCE_VAR = PROG_CONF_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prog Data Source Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_CNXN__PROG_DATA_SOURCE_VALUE = PROG_CONF_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Sink Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_CNXN__DATA_SINK_VAR = PROG_CONF_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Sink Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_CNXN__DATA_SINK_VALUE = PROG_CONF_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Prog Cnxn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_CNXN_FEATURE_COUNT = PROG_CONF_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Prog Cnxn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_CNXN_OPERATION_COUNT = PROG_CONF_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource <em>Prog Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getProgDataSource()
	 * @generated
	 */
	int PROG_DATA_SOURCE = 10;

	/**
	 * The number of structural features of the '<em>Prog Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_DATA_SOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Prog Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_DATA_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSink <em>Data Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSink
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getDataSink()
	 * @generated
	 */
	int DATA_SINK = 11;

	/**
	 * The number of structural features of the '<em>Data Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.Retain <em>Retain</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.Retain
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getRetain()
	 * @generated
	 */
	int RETAIN = 12;


	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration <em>Configuration Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration
	 * @generated
	 */
	EClass getConfigurationDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration#getResources()
	 * @see #getConfigurationDeclaration()
	 * @generated
	 */
	EReference getConfigurationDeclaration_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration#getDeclarations()
	 * @see #getConfigurationDeclaration()
	 * @generated
	 */
	EReference getConfigurationDeclaration_Declarations();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration#getAccess()
	 * @see #getConfigurationDeclaration()
	 * @generated
	 */
	EReference getConfigurationDeclaration_Access();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration#getInstanceSpecificInits <em>Instance Specific Inits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance Specific Inits</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration#getInstanceSpecificInits()
	 * @see #getConfigurationDeclaration()
	 * @generated
	 */
	EReference getConfigurationDeclaration_InstanceSpecificInits();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration#getGlobalVarNames <em>Global Var Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Var Names</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration#getGlobalVarNames()
	 * @see #getConfigurationDeclaration()
	 * @generated
	 */
	EReference getConfigurationDeclaration_GlobalVarNames();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration <em>Resource Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration
	 * @generated
	 */
	EClass getResourceDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration#getDeclarations()
	 * @see #getResourceDeclaration()
	 * @generated
	 */
	EReference getResourceDeclaration_Declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration#getProgramConfigurations <em>Program Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Program Configurations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration#getProgramConfigurations()
	 * @see #getResourceDeclaration()
	 * @generated
	 */
	EReference getResourceDeclaration_ProgramConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration#getTaskConfigurations <em>Task Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Configurations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration#getTaskConfigurations()
	 * @see #getResourceDeclaration()
	 * @generated
	 */
	EReference getResourceDeclaration_TaskConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration#getGlobalVarNames <em>Global Var Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Var Names</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration#getGlobalVarNames()
	 * @see #getResourceDeclaration()
	 * @generated
	 */
	EReference getResourceDeclaration_GlobalVarNames();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration#getOnHardwareResource <em>On Hardware Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Hardware Resource</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration#getOnHardwareResource()
	 * @see #getResourceDeclaration()
	 * @generated
	 */
	EAttribute getResourceDeclaration_OnHardwareResource();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration <em>Program Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Configuration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration
	 * @generated
	 */
	EClass getProgramConfiguration();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>With</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration#getWith()
	 * @see #getProgramConfiguration()
	 * @generated
	 */
	EReference getProgramConfiguration_With();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Program</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration#getProgram()
	 * @see #getProgramConfiguration()
	 * @generated
	 */
	EReference getProgramConfiguration_Program();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration#getRetain <em>Retain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retain</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration#getRetain()
	 * @see #getProgramConfiguration()
	 * @generated
	 */
	EAttribute getProgramConfiguration_Retain();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration#getProgConfElements <em>Prog Conf Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prog Conf Elements</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration#getProgConfElements()
	 * @see #getProgramConfiguration()
	 * @generated
	 */
	EReference getProgramConfiguration_ProgConfElements();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration <em>Task Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Configuration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration
	 * @generated
	 */
	EClass getTaskConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration#getSingle <em>Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration#getSingle()
	 * @see #getTaskConfiguration()
	 * @generated
	 */
	EReference getTaskConfiguration_Single();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interval</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration#getInterval()
	 * @see #getTaskConfiguration()
	 * @generated
	 */
	EReference getTaskConfiguration_Interval();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priority</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration#getPriority()
	 * @see #getTaskConfiguration()
	 * @generated
	 */
	EReference getTaskConfiguration_Priority();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.GlobalVarReference <em>Global Var Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Var Reference</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.GlobalVarReference
	 * @generated
	 */
	EClass getGlobalVarReference();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.GlobalVarReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.GlobalVarReference#getReference()
	 * @see #getGlobalVarReference()
	 * @generated
	 */
	EReference getGlobalVarReference_Reference();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.GlobalVarReference#getStructureElementName <em>Structure Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure Element Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.GlobalVarReference#getStructureElementName()
	 * @see #getGlobalVarReference()
	 * @generated
	 */
	EAttribute getGlobalVarReference_StructureElementName();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramOutputReference <em>Program Output Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Output Reference</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramOutputReference
	 * @generated
	 */
	EClass getProgramOutputReference();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramOutputReference#getRefernce <em>Refernce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refernce</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramOutputReference#getRefernce()
	 * @see #getProgramOutputReference()
	 * @generated
	 */
	EReference getProgramOutputReference_Refernce();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgConfElement <em>Prog Conf Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prog Conf Element</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgConfElement
	 * @generated
	 */
	EClass getProgConfElement();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.FBTask <em>FB Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FB Task</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.FBTask
	 * @generated
	 */
	EClass getFBTask();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.FBTask#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>With</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.FBTask#getWith()
	 * @see #getFBTask()
	 * @generated
	 */
	EReference getFBTask_With();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.FBTask#getFunctionBlock <em>Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Block</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.FBTask#getFunctionBlock()
	 * @see #getFBTask()
	 * @generated
	 */
	EReference getFBTask_FunctionBlock();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn <em>Prog Cnxn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prog Cnxn</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn
	 * @generated
	 */
	EClass getProgCnxn();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn#getProgDataSourceVar <em>Prog Data Source Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prog Data Source Var</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn#getProgDataSourceVar()
	 * @see #getProgCnxn()
	 * @generated
	 */
	EReference getProgCnxn_ProgDataSourceVar();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn#getProgDataSourceValue <em>Prog Data Source Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prog Data Source Value</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn#getProgDataSourceValue()
	 * @see #getProgCnxn()
	 * @generated
	 */
	EReference getProgCnxn_ProgDataSourceValue();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn#getDataSinkVar <em>Data Sink Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Sink Var</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn#getDataSinkVar()
	 * @see #getProgCnxn()
	 * @generated
	 */
	EReference getProgCnxn_DataSinkVar();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn#getDataSinkValue <em>Data Sink Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Sink Value</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn#getDataSinkValue()
	 * @see #getProgCnxn()
	 * @generated
	 */
	EReference getProgCnxn_DataSinkValue();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource <em>Prog Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prog Data Source</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource
	 * @generated
	 */
	EClass getProgDataSource();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSink <em>Data Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Sink</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSink
	 * @generated
	 */
	EClass getDataSink();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.Retain <em>Retain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Retain</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.Retain
	 * @generated
	 */
	EEnum getRetain();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationsFactory getConfigurationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationDeclarationImpl <em>Configuration Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getConfigurationDeclaration()
		 * @generated
		 */
		EClass CONFIGURATION_DECLARATION = eINSTANCE.getConfigurationDeclaration();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_DECLARATION__RESOURCES = eINSTANCE.getConfigurationDeclaration_Resources();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_DECLARATION__DECLARATIONS = eINSTANCE.getConfigurationDeclaration_Declarations();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_DECLARATION__ACCESS = eINSTANCE.getConfigurationDeclaration_Access();

		/**
		 * The meta object literal for the '<em><b>Instance Specific Inits</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_DECLARATION__INSTANCE_SPECIFIC_INITS = eINSTANCE.getConfigurationDeclaration_InstanceSpecificInits();

		/**
		 * The meta object literal for the '<em><b>Global Var Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_DECLARATION__GLOBAL_VAR_NAMES = eINSTANCE.getConfigurationDeclaration_GlobalVarNames();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ResourceDeclarationImpl <em>Resource Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ResourceDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getResourceDeclaration()
		 * @generated
		 */
		EClass RESOURCE_DECLARATION = eINSTANCE.getResourceDeclaration();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_DECLARATION__DECLARATIONS = eINSTANCE.getResourceDeclaration_Declarations();

		/**
		 * The meta object literal for the '<em><b>Program Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_DECLARATION__PROGRAM_CONFIGURATIONS = eINSTANCE.getResourceDeclaration_ProgramConfigurations();

		/**
		 * The meta object literal for the '<em><b>Task Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_DECLARATION__TASK_CONFIGURATIONS = eINSTANCE.getResourceDeclaration_TaskConfigurations();

		/**
		 * The meta object literal for the '<em><b>Global Var Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_DECLARATION__GLOBAL_VAR_NAMES = eINSTANCE.getResourceDeclaration_GlobalVarNames();

		/**
		 * The meta object literal for the '<em><b>On Hardware Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_DECLARATION__ON_HARDWARE_RESOURCE = eINSTANCE.getResourceDeclaration_OnHardwareResource();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgramConfigurationImpl <em>Program Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgramConfigurationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getProgramConfiguration()
		 * @generated
		 */
		EClass PROGRAM_CONFIGURATION = eINSTANCE.getProgramConfiguration();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_CONFIGURATION__WITH = eINSTANCE.getProgramConfiguration_With();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_CONFIGURATION__PROGRAM = eINSTANCE.getProgramConfiguration_Program();

		/**
		 * The meta object literal for the '<em><b>Retain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_CONFIGURATION__RETAIN = eINSTANCE.getProgramConfiguration_Retain();

		/**
		 * The meta object literal for the '<em><b>Prog Conf Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_CONFIGURATION__PROG_CONF_ELEMENTS = eINSTANCE.getProgramConfiguration_ProgConfElements();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.TaskConfigurationImpl <em>Task Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.TaskConfigurationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getTaskConfiguration()
		 * @generated
		 */
		EClass TASK_CONFIGURATION = eINSTANCE.getTaskConfiguration();

		/**
		 * The meta object literal for the '<em><b>Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONFIGURATION__SINGLE = eINSTANCE.getTaskConfiguration_Single();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONFIGURATION__INTERVAL = eINSTANCE.getTaskConfiguration_Interval();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONFIGURATION__PRIORITY = eINSTANCE.getTaskConfiguration_Priority();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSource <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSource
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.GlobalVarReferenceImpl <em>Global Var Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.GlobalVarReferenceImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getGlobalVarReference()
		 * @generated
		 */
		EClass GLOBAL_VAR_REFERENCE = eINSTANCE.getGlobalVarReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_VAR_REFERENCE__REFERENCE = eINSTANCE.getGlobalVarReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Structure Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VAR_REFERENCE__STRUCTURE_ELEMENT_NAME = eINSTANCE.getGlobalVarReference_StructureElementName();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgramOutputReferenceImpl <em>Program Output Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgramOutputReferenceImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getProgramOutputReference()
		 * @generated
		 */
		EClass PROGRAM_OUTPUT_REFERENCE = eINSTANCE.getProgramOutputReference();

		/**
		 * The meta object literal for the '<em><b>Refernce</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_OUTPUT_REFERENCE__REFERNCE = eINSTANCE.getProgramOutputReference_Refernce();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgConfElement <em>Prog Conf Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgConfElement
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getProgConfElement()
		 * @generated
		 */
		EClass PROG_CONF_ELEMENT = eINSTANCE.getProgConfElement();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.FBTaskImpl <em>FB Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.FBTaskImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getFBTask()
		 * @generated
		 */
		EClass FB_TASK = eINSTANCE.getFBTask();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FB_TASK__WITH = eINSTANCE.getFBTask_With();

		/**
		 * The meta object literal for the '<em><b>Function Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FB_TASK__FUNCTION_BLOCK = eINSTANCE.getFBTask_FunctionBlock();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgCnxnImpl <em>Prog Cnxn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgCnxnImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getProgCnxn()
		 * @generated
		 */
		EClass PROG_CNXN = eINSTANCE.getProgCnxn();

		/**
		 * The meta object literal for the '<em><b>Prog Data Source Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROG_CNXN__PROG_DATA_SOURCE_VAR = eINSTANCE.getProgCnxn_ProgDataSourceVar();

		/**
		 * The meta object literal for the '<em><b>Prog Data Source Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROG_CNXN__PROG_DATA_SOURCE_VALUE = eINSTANCE.getProgCnxn_ProgDataSourceValue();

		/**
		 * The meta object literal for the '<em><b>Data Sink Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROG_CNXN__DATA_SINK_VAR = eINSTANCE.getProgCnxn_DataSinkVar();

		/**
		 * The meta object literal for the '<em><b>Data Sink Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROG_CNXN__DATA_SINK_VALUE = eINSTANCE.getProgCnxn_DataSinkValue();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource <em>Prog Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getProgDataSource()
		 * @generated
		 */
		EClass PROG_DATA_SOURCE = eINSTANCE.getProgDataSource();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSink <em>Data Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSink
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getDataSink()
		 * @generated
		 */
		EClass DATA_SINK = eINSTANCE.getDataSink();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.Retain <em>Retain</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.Retain
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl#getRetain()
		 * @generated
		 */
		EEnum RETAIN = eINSTANCE.getRetain();

	}

} //ConfigurationsPackage
