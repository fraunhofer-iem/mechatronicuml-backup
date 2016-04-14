/**
 */
package org.muml.pm.software;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.muml.core.CorePackage;

import org.muml.pim.types.TypesPackage;

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
 * The platform package describes the informatation of the platform, e.g. the api-commands.
 * It serves the viewpoint for modelling api-commands in a concrete platform.
 * <!-- end-model-doc -->
 * @see org.muml.pm.software.SoftwareFactory
 * @model kind="package"
 * @generated
 */
public interface SoftwarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "software";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/pm/software/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "software";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwarePackage eINSTANCE = org.muml.pm.software.impl.SoftwarePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.pm.software.impl.OperatingSystemImpl <em>Operating System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.software.impl.OperatingSystemImpl
	 * @see org.muml.pm.software.impl.SoftwarePackageImpl#getOperatingSystem()
	 * @generated
	 */
	int OPERATING_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Apirepositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__APIREPOSITORIES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enumeration Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__ENUMERATION_DATA_TYPES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__IMPORTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.software.impl.APIRepositoryImpl <em>API Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.software.impl.APIRepositoryImpl
	 * @see org.muml.pm.software.impl.SoftwarePackageImpl#getAPIRepository()
	 * @generated
	 */
	int API_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REPOSITORY__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REPOSITORY__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REPOSITORY__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REPOSITORY__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Api Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REPOSITORY__API_COMMANDS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sw Platform</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REPOSITORY__SW_PLATFORM = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>API Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REPOSITORY_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REPOSITORY___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>API Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REPOSITORY_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.software.impl.APICommandImpl <em>API Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.software.impl.APICommandImpl
	 * @see org.muml.pm.software.impl.SoftwarePackageImpl#getAPICommand()
	 * @generated
	 */
	int API_COMMAND = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_COMMAND__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_COMMAND__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_COMMAND__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_COMMAND__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_COMMAND__RETURN_DATA_TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_COMMAND__PARAMETERS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_COMMAND__REPOSITORY = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_COMMAND__CONSTRAINTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>API Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_COMMAND_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_COMMAND___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>API Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_COMMAND_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.software.impl.EnumerationValueImpl <em>Enumeration Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.software.impl.EnumerationValueImpl
	 * @see org.muml.pm.software.impl.SoftwarePackageImpl#getEnumerationValue()
	 * @generated
	 */
	int ENUMERATION_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE__ANNOTATIONS = CorePackage.EXTENDABLE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE__VALUE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enumeration Data Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE__ENUMERATION_DATA_TYPE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Enumeration Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.software.impl.EnumerationDataTypeImpl <em>Enumeration Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.software.impl.EnumerationDataTypeImpl
	 * @see org.muml.pm.software.impl.SoftwarePackageImpl#getEnumerationDataType()
	 * @generated
	 */
	int ENUMERATION_DATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_DATA_TYPE__ANNOTATIONS = TypesPackage.DATA_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_DATA_TYPE__EXTENSIONS = TypesPackage.DATA_TYPE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_DATA_TYPE__NAME = TypesPackage.DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_DATA_TYPE__COMMENT = TypesPackage.DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Enumeration Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_DATA_TYPE__ENUMERATION_VALUES = TypesPackage.DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_DATA_TYPE_FEATURE_COUNT = TypesPackage.DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_DATA_TYPE___GET_EXTENSION__ECLASS = TypesPackage.DATA_TYPE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Enumeration Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_DATA_TYPE_OPERATION_COUNT = TypesPackage.DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.software.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.software.impl.ConstraintImpl
	 * @see org.muml.pm.software.impl.SoftwarePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Api Command</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__API_COMMAND = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.software.impl.TimeConstraintImpl <em>Time Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.software.impl.TimeConstraintImpl
	 * @see org.muml.pm.software.impl.SoftwarePackageImpl#getTimeConstraint()
	 * @generated
	 */
	int TIME_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Api Command</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__API_COMMAND = CONSTRAINT__API_COMMAND;

	/**
	 * The feature id for the '<em><b>Sampling Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__SAMPLING_TIME = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.software.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.software.impl.ImportImpl
	 * @see org.muml.pm.software.impl.SoftwarePackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 7;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.muml.pm.software.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating System</em>'.
	 * @see org.muml.pm.software.OperatingSystem
	 * @generated
	 */
	EClass getOperatingSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.software.OperatingSystem#getApirepositories <em>Apirepositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apirepositories</em>'.
	 * @see org.muml.pm.software.OperatingSystem#getApirepositories()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EReference getOperatingSystem_Apirepositories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.software.OperatingSystem#getEnumerationDataTypes <em>Enumeration Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration Data Types</em>'.
	 * @see org.muml.pm.software.OperatingSystem#getEnumerationDataTypes()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EReference getOperatingSystem_EnumerationDataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.software.OperatingSystem#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.muml.pm.software.OperatingSystem#getImports()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EReference getOperatingSystem_Imports();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.software.APIRepository <em>API Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Repository</em>'.
	 * @see org.muml.pm.software.APIRepository
	 * @generated
	 */
	EClass getAPIRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.software.APIRepository#getApiCommands <em>Api Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Api Commands</em>'.
	 * @see org.muml.pm.software.APIRepository#getApiCommands()
	 * @see #getAPIRepository()
	 * @generated
	 */
	EReference getAPIRepository_ApiCommands();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pm.software.APIRepository#getSwPlatform <em>Sw Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sw Platform</em>'.
	 * @see org.muml.pm.software.APIRepository#getSwPlatform()
	 * @see #getAPIRepository()
	 * @generated
	 */
	EReference getAPIRepository_SwPlatform();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.software.APICommand <em>API Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Command</em>'.
	 * @see org.muml.pm.software.APICommand
	 * @generated
	 */
	EClass getAPICommand();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.software.APICommand#getReturnDataType <em>Return Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Data Type</em>'.
	 * @see org.muml.pm.software.APICommand#getReturnDataType()
	 * @see #getAPICommand()
	 * @generated
	 */
	EReference getAPICommand_ReturnDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.software.APICommand#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.muml.pm.software.APICommand#getParameters()
	 * @see #getAPICommand()
	 * @generated
	 */
	EReference getAPICommand_Parameters();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pm.software.APICommand#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see org.muml.pm.software.APICommand#getRepository()
	 * @see #getAPICommand()
	 * @generated
	 */
	EReference getAPICommand_Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.software.APICommand#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.muml.pm.software.APICommand#getConstraints()
	 * @see #getAPICommand()
	 * @generated
	 */
	EReference getAPICommand_Constraints();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.software.EnumerationValue <em>Enumeration Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Value</em>'.
	 * @see org.muml.pm.software.EnumerationValue
	 * @generated
	 */
	EClass getEnumerationValue();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.software.EnumerationValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.muml.pm.software.EnumerationValue#getValue()
	 * @see #getEnumerationValue()
	 * @generated
	 */
	EAttribute getEnumerationValue_Value();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pm.software.EnumerationValue#getEnumerationDataType <em>Enumeration Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enumeration Data Type</em>'.
	 * @see org.muml.pm.software.EnumerationValue#getEnumerationDataType()
	 * @see #getEnumerationValue()
	 * @generated
	 */
	EReference getEnumerationValue_EnumerationDataType();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.software.EnumerationDataType <em>Enumeration Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Data Type</em>'.
	 * @see org.muml.pm.software.EnumerationDataType
	 * @generated
	 */
	EClass getEnumerationDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.software.EnumerationDataType#getEnumerationValues <em>Enumeration Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration Values</em>'.
	 * @see org.muml.pm.software.EnumerationDataType#getEnumerationValues()
	 * @see #getEnumerationDataType()
	 * @generated
	 */
	EReference getEnumerationDataType_EnumerationValues();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.software.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.muml.pm.software.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pm.software.Constraint#getApiCommand <em>Api Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Api Command</em>'.
	 * @see org.muml.pm.software.Constraint#getApiCommand()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ApiCommand();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.software.TimeConstraint <em>Time Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Constraint</em>'.
	 * @see org.muml.pm.software.TimeConstraint
	 * @generated
	 */
	EClass getTimeConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.software.TimeConstraint#getSamplingTime <em>Sampling Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sampling Time</em>'.
	 * @see org.muml.pm.software.TimeConstraint#getSamplingTime()
	 * @see #getTimeConstraint()
	 * @generated
	 */
	EReference getTimeConstraint_SamplingTime();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.software.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.muml.pm.software.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.software.Import#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see org.muml.pm.software.Import#getImportURI()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SoftwareFactory getSoftwareFactory();

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
		 * The meta object literal for the '{@link org.muml.pm.software.impl.OperatingSystemImpl <em>Operating System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.software.impl.OperatingSystemImpl
		 * @see org.muml.pm.software.impl.SoftwarePackageImpl#getOperatingSystem()
		 * @generated
		 */
		EClass OPERATING_SYSTEM = eINSTANCE.getOperatingSystem();

		/**
		 * The meta object literal for the '<em><b>Apirepositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATING_SYSTEM__APIREPOSITORIES = eINSTANCE.getOperatingSystem_Apirepositories();

		/**
		 * The meta object literal for the '<em><b>Enumeration Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATING_SYSTEM__ENUMERATION_DATA_TYPES = eINSTANCE.getOperatingSystem_EnumerationDataTypes();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATING_SYSTEM__IMPORTS = eINSTANCE.getOperatingSystem_Imports();

		/**
		 * The meta object literal for the '{@link org.muml.pm.software.impl.APIRepositoryImpl <em>API Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.software.impl.APIRepositoryImpl
		 * @see org.muml.pm.software.impl.SoftwarePackageImpl#getAPIRepository()
		 * @generated
		 */
		EClass API_REPOSITORY = eINSTANCE.getAPIRepository();

		/**
		 * The meta object literal for the '<em><b>Api Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_REPOSITORY__API_COMMANDS = eINSTANCE.getAPIRepository_ApiCommands();

		/**
		 * The meta object literal for the '<em><b>Sw Platform</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_REPOSITORY__SW_PLATFORM = eINSTANCE.getAPIRepository_SwPlatform();

		/**
		 * The meta object literal for the '{@link org.muml.pm.software.impl.APICommandImpl <em>API Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.software.impl.APICommandImpl
		 * @see org.muml.pm.software.impl.SoftwarePackageImpl#getAPICommand()
		 * @generated
		 */
		EClass API_COMMAND = eINSTANCE.getAPICommand();

		/**
		 * The meta object literal for the '<em><b>Return Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_COMMAND__RETURN_DATA_TYPE = eINSTANCE.getAPICommand_ReturnDataType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_COMMAND__PARAMETERS = eINSTANCE.getAPICommand_Parameters();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_COMMAND__REPOSITORY = eINSTANCE.getAPICommand_Repository();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_COMMAND__CONSTRAINTS = eINSTANCE.getAPICommand_Constraints();

		/**
		 * The meta object literal for the '{@link org.muml.pm.software.impl.EnumerationValueImpl <em>Enumeration Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.software.impl.EnumerationValueImpl
		 * @see org.muml.pm.software.impl.SoftwarePackageImpl#getEnumerationValue()
		 * @generated
		 */
		EClass ENUMERATION_VALUE = eINSTANCE.getEnumerationValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_VALUE__VALUE = eINSTANCE.getEnumerationValue_Value();

		/**
		 * The meta object literal for the '<em><b>Enumeration Data Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_VALUE__ENUMERATION_DATA_TYPE = eINSTANCE.getEnumerationValue_EnumerationDataType();

		/**
		 * The meta object literal for the '{@link org.muml.pm.software.impl.EnumerationDataTypeImpl <em>Enumeration Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.software.impl.EnumerationDataTypeImpl
		 * @see org.muml.pm.software.impl.SoftwarePackageImpl#getEnumerationDataType()
		 * @generated
		 */
		EClass ENUMERATION_DATA_TYPE = eINSTANCE.getEnumerationDataType();

		/**
		 * The meta object literal for the '<em><b>Enumeration Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_DATA_TYPE__ENUMERATION_VALUES = eINSTANCE.getEnumerationDataType_EnumerationValues();

		/**
		 * The meta object literal for the '{@link org.muml.pm.software.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.software.impl.ConstraintImpl
		 * @see org.muml.pm.software.impl.SoftwarePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Api Command</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__API_COMMAND = eINSTANCE.getConstraint_ApiCommand();

		/**
		 * The meta object literal for the '{@link org.muml.pm.software.impl.TimeConstraintImpl <em>Time Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.software.impl.TimeConstraintImpl
		 * @see org.muml.pm.software.impl.SoftwarePackageImpl#getTimeConstraint()
		 * @generated
		 */
		EClass TIME_CONSTRAINT = eINSTANCE.getTimeConstraint();

		/**
		 * The meta object literal for the '<em><b>Sampling Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_CONSTRAINT__SAMPLING_TIME = eINSTANCE.getTimeConstraint_SamplingTime();

		/**
		 * The meta object literal for the '{@link org.muml.pm.software.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.software.impl.ImportImpl
		 * @see org.muml.pm.software.impl.SoftwarePackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

	}

} //SoftwarePackage
