/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

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
 * contains all kinds of variable declarations, different types of variables are supported by this model
 * <!-- end-model-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsFactory
 * @model kind="package"
 * @generated
 */
public interface DeclarationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "declarations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iem.fraunhofer.de/m4a/iec61131/1.0/core/declarations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "declarations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeclarationsPackage eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VariableDeclaration <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VariableDeclaration
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 0;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVariableDeclaration <em>Function Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVariableDeclaration
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getFunctionVariableDeclaration()
	 * @generated
	 */
	int FUNCTION_VARIABLE_DECLARATION = 15;

	/**
	 * The number of structural features of the '<em>Function Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VARIABLE_DECLARATION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VARIABLE_DECLARATION_OPERATION_COUNT = VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IOVarDeclaration <em>IO Var Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.IOVarDeclaration
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getIOVarDeclaration()
	 * @generated
	 */
	int IO_VAR_DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>IO Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_VAR_DECLARATION_FEATURE_COUNT = FUNCTION_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IO Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_VAR_DECLARATION_OPERATION_COUNT = FUNCTION_VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InputVarContainerImpl <em>Input Var Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InputVarContainerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getInputVarContainer()
	 * @generated
	 */
	int INPUT_VAR_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Retain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VAR_CONTAINER__RETAIN = IO_VAR_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VAR_CONTAINER__DECLARATIONS = IO_VAR_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Var Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VAR_CONTAINER_FEATURE_COUNT = IO_VAR_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Var Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VAR_CONTAINER_OPERATION_COUNT = IO_VAR_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.OutputVarContainerImpl <em>Output Var Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.OutputVarContainerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getOutputVarContainer()
	 * @generated
	 */
	int OUTPUT_VAR_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VAR_CONTAINER__DECLARATIONS = IO_VAR_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Retain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VAR_CONTAINER__RETAIN = IO_VAR_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Var Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VAR_CONTAINER_FEATURE_COUNT = IO_VAR_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Output Var Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VAR_CONTAINER_OPERATION_COUNT = IO_VAR_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InputOutputVarContainerImpl <em>Input Output Var Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InputOutputVarContainerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getInputOutputVarContainer()
	 * @generated
	 */
	int INPUT_OUTPUT_VAR_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_VAR_CONTAINER__DECLARATIONS = IO_VAR_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Output Var Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_VAR_CONTAINER_FEATURE_COUNT = IO_VAR_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Output Var Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_VAR_CONTAINER_OPERATION_COUNT = IO_VAR_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramVariableDeclaration <em>Program Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramVariableDeclaration
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getProgramVariableDeclaration()
	 * @generated
	 */
	int PROGRAM_VARIABLE_DECLARATION = 17;

	/**
	 * The number of structural features of the '<em>Program Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_VARIABLE_DECLARATION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Program Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_VARIABLE_DECLARATION_OPERATION_COUNT = VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionBlockVariableDeclaration <em>Function Block Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionBlockVariableDeclaration
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getFunctionBlockVariableDeclaration()
	 * @generated
	 */
	int FUNCTION_BLOCK_VARIABLE_DECLARATION = 16;

	/**
	 * The number of structural features of the '<em>Function Block Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_VARIABLE_DECLARATION_FEATURE_COUNT = PROGRAM_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Block Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_VARIABLE_DECLARATION_OPERATION_COUNT = PROGRAM_VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBProgramVarDeclaration <em>FB Program Var Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBProgramVarDeclaration
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getFBProgramVarDeclaration()
	 * @generated
	 */
	int FB_PROGRAM_VAR_DECLARATION = 5;

	/**
	 * The number of structural features of the '<em>FB Program Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_PROGRAM_VAR_DECLARATION_FEATURE_COUNT = FUNCTION_BLOCK_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FB Program Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_PROGRAM_VAR_DECLARATION_OPERATION_COUNT = FUNCTION_BLOCK_VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.VarDeclarationContainerImpl <em>Var Declaration Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.VarDeclarationContainerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVarDeclarationContainer()
	 * @generated
	 */
	int VAR_DECLARATION_CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>Declaration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_CONTAINER__DECLARATION_TYPE = FB_PROGRAM_VAR_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_CONTAINER__DECLARATIONS = FB_PROGRAM_VAR_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Var Declaration Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_CONTAINER_FEATURE_COUNT = FB_PROGRAM_VAR_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Var Declaration Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_CONTAINER_OPERATION_COUNT = FB_PROGRAM_VAR_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ExternalVarContainerImpl <em>External Var Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ExternalVarContainerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getExternalVarContainer()
	 * @generated
	 */
	int EXTERNAL_VAR_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VAR_CONTAINER__CONSTANT = FB_PROGRAM_VAR_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VAR_CONTAINER__DECLARATIONS = FB_PROGRAM_VAR_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Var Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VAR_CONTAINER_FEATURE_COUNT = FB_PROGRAM_VAR_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>External Var Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VAR_CONTAINER_OPERATION_COUNT = FB_PROGRAM_VAR_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.TempVarDeclarationContainerImpl <em>Temp Var Declaration Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.TempVarDeclarationContainerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getTempVarDeclarationContainer()
	 * @generated
	 */
	int TEMP_VAR_DECLARATION_CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_VAR_DECLARATION_CONTAINER__DECLARATIONS = FB_PROGRAM_VAR_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Temp Var Declaration Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_VAR_DECLARATION_CONTAINER_FEATURE_COUNT = FB_PROGRAM_VAR_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Temp Var Declaration Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_VAR_DECLARATION_CONTAINER_OPERATION_COUNT = FB_PROGRAM_VAR_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.IncomplLocatedVarContainerImpl <em>Incompl Located Var Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.IncomplLocatedVarContainerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getIncomplLocatedVarContainer()
	 * @generated
	 */
	int INCOMPL_LOCATED_VAR_CONTAINER = 9;

	/**
	 * The feature id for the '<em><b>Retain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPL_LOCATED_VAR_CONTAINER__RETAIN = FB_PROGRAM_VAR_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPL_LOCATED_VAR_CONTAINER__DECLARATIONS = FB_PROGRAM_VAR_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Incompl Located Var Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPL_LOCATED_VAR_CONTAINER_FEATURE_COUNT = FB_PROGRAM_VAR_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Incompl Located Var Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPL_LOCATED_VAR_CONTAINER_OPERATION_COUNT = FB_PROGRAM_VAR_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramSpecificDeclaration <em>Program Specific Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramSpecificDeclaration
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getProgramSpecificDeclaration()
	 * @generated
	 */
	int PROGRAM_SPECIFIC_DECLARATION = 10;

	/**
	 * The number of structural features of the '<em>Program Specific Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SPECIFIC_DECLARATION_FEATURE_COUNT = PROGRAM_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Program Specific Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SPECIFIC_DECLARATION_OPERATION_COUNT = PROGRAM_VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedVarDeclarationContainerImpl <em>Located Var Declaration Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedVarDeclarationContainerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getLocatedVarDeclarationContainer()
	 * @generated
	 */
	int LOCATED_VAR_DECLARATION_CONTAINER = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_VAR_DECLARATION_CONTAINER__TYPE = PROGRAM_SPECIFIC_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_VAR_DECLARATION_CONTAINER__DECLARATIONS = PROGRAM_SPECIFIC_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Located Var Declaration Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_VAR_DECLARATION_CONTAINER_FEATURE_COUNT = PROGRAM_SPECIFIC_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Located Var Declaration Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_VAR_DECLARATION_CONTAINER_OPERATION_COUNT = PROGRAM_SPECIFIC_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ProgramAccessContainerImpl <em>Program Access Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ProgramAccessContainerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getProgramAccessContainer()
	 * @generated
	 */
	int PROGRAM_ACCESS_CONTAINER = 12;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ACCESS_CONTAINER__DECLARATIONS = PROGRAM_SPECIFIC_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program Access Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ACCESS_CONTAINER_FEATURE_COUNT = PROGRAM_SPECIFIC_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Program Access Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ACCESS_CONTAINER_OPERATION_COUNT = PROGRAM_SPECIFIC_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.FunctionVarContainerImpl <em>Function Var Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.FunctionVarContainerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getFunctionVarContainer()
	 * @generated
	 */
	int FUNCTION_VAR_CONTAINER = 13;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VAR_CONTAINER__DECLARATIONS = FUNCTION_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONSTANT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VAR_CONTAINER__CONSTANT = FUNCTION_VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Var Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VAR_CONTAINER_FEATURE_COUNT = FUNCTION_VARIABLE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Var Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_VAR_CONTAINER_OPERATION_COUNT = FUNCTION_VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationVariableDeclaration <em>Configuration Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationVariableDeclaration
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getConfigurationVariableDeclaration()
	 * @generated
	 */
	int CONFIGURATION_VARIABLE_DECLARATION = 18;

	/**
	 * The number of structural features of the '<em>Configuration Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_VARIABLE_DECLARATION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Configuration Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_VARIABLE_DECLARATION_OPERATION_COUNT = VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.GlobalVarDeclarationContainerImpl <em>Global Var Declaration Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.GlobalVarDeclarationContainerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getGlobalVarDeclarationContainer()
	 * @generated
	 */
	int GLOBAL_VAR_DECLARATION_CONTAINER = 14;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_DECLARATION_CONTAINER__DECLARATIONS = CONFIGURATION_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Global Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_DECLARATION_CONTAINER__GLOBAL_ATTRIBUTE = CONFIGURATION_VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Global Var Declaration Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_DECLARATION_CONTAINER_FEATURE_COUNT = CONFIGURATION_VARIABLE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Global Var Declaration Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_DECLARATION_CONTAINER_OPERATION_COUNT = CONFIGURATION_VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ResourceVariableDeclaration <em>Resource Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ResourceVariableDeclaration
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getResourceVariableDeclaration()
	 * @generated
	 */
	int RESOURCE_VARIABLE_DECLARATION = 19;

	/**
	 * The number of structural features of the '<em>Resource Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VARIABLE_DECLARATION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VARIABLE_DECLARATION_OPERATION_COUNT = VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationSpecificDeclaration <em>Configuration Specific Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationSpecificDeclaration
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getConfigurationSpecificDeclaration()
	 * @generated
	 */
	int CONFIGURATION_SPECIFIC_DECLARATION = 22;

	/**
	 * The number of structural features of the '<em>Configuration Specific Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SPECIFIC_DECLARATION_FEATURE_COUNT = CONFIGURATION_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Configuration Specific Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SPECIFIC_DECLARATION_OPERATION_COUNT = CONFIGURATION_VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.AccessVarContainerImpl <em>Access Var Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.AccessVarContainerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getAccessVarContainer()
	 * @generated
	 */
	int ACCESS_VAR_CONTAINER = 20;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_VAR_CONTAINER__DECLARATIONS = CONFIGURATION_SPECIFIC_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Access Var Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_VAR_CONTAINER_FEATURE_COUNT = CONFIGURATION_SPECIFIC_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Access Var Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_VAR_CONTAINER_OPERATION_COUNT = CONFIGURATION_SPECIFIC_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificVarContainterImpl <em>Instance Specific Var Containter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificVarContainterImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getInstanceSpecificVarContainter()
	 * @generated
	 */
	int INSTANCE_SPECIFIC_VAR_CONTAINTER = 21;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_VAR_CONTAINTER__DECLARATIONS = CONFIGURATION_SPECIFIC_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Specific Var Containter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_VAR_CONTAINTER_FEATURE_COUNT = CONFIGURATION_SPECIFIC_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instance Specific Var Containter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_VAR_CONTAINTER_OPERATION_COUNT = CONFIGURATION_SPECIFIC_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputDeclaration <em>Input Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputDeclaration
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getInputDeclaration()
	 * @generated
	 */
	int INPUT_DECLARATION = 23;

	/**
	 * The number of structural features of the '<em>Input Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Input Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.EdgeDeclarationImpl <em>Edge Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.EdgeDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getEdgeDeclaration()
	 * @generated
	 */
	int EDGE_DECLARATION = 24;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DECLARATION__VARIABLE_NAME = INPUT_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edge Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DECLARATION__EDGE_TYPE = INPUT_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edge Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DECLARATION_FEATURE_COUNT = INPUT_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Edge Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_DECLARATION_OPERATION_COUNT = INPUT_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarInitDeclaration <em>Var Init Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarInitDeclaration
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVarInitDeclaration()
	 * @generated
	 */
	int VAR_INIT_DECLARATION = 25;

	/**
	 * The number of structural features of the '<em>Var Init Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_INIT_DECLARATION_FEATURE_COUNT = INPUT_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Var Init Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_INIT_DECLARATION_OPERATION_COUNT = INPUT_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.NamedVariableDeclarationImpl <em>Named Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.NamedVariableDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getNamedVariableDeclaration()
	 * @generated
	 */
	int NAMED_VARIABLE_DECLARATION = 62;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VARIABLE_DECLARATION__VARIABLE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VARIABLE_DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_VARIABLE_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.Var1SpecInitDeclImpl <em>Var1 Spec Init Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.Var1SpecInitDeclImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVar1SpecInitDecl()
	 * @generated
	 */
	int VAR1_SPEC_INIT_DECL = 26;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR1_SPEC_INIT_DECL__VARIABLE_NAME = NAMED_VARIABLE_DECLARATION__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Spec Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR1_SPEC_INIT_DECL__SPEC_INIT = NAMED_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var1 Spec Init Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR1_SPEC_INIT_DECL_FEATURE_COUNT = NAMED_VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Var1 Spec Init Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR1_SPEC_INIT_DECL_OPERATION_COUNT = NAMED_VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationOnly <em>Var Declaration Only</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationOnly
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVarDeclarationOnly()
	 * @generated
	 */
	int VAR_DECLARATION_ONLY = 30;

	/**
	 * The number of structural features of the '<em>Var Declaration Only</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_ONLY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Var Declaration Only</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_ONLY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclaration <em>Temp Var Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclaration
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getTempVarDeclaration()
	 * @generated
	 */
	int TEMP_VAR_DECLARATION = 31;

	/**
	 * The number of structural features of the '<em>Temp Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_VAR_DECLARATION_FEATURE_COUNT = VAR_DECLARATION_ONLY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temp Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_VAR_DECLARATION_OPERATION_COUNT = VAR_DECLARATION_ONLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.StringVarDeclImpl <em>String Var Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.StringVarDeclImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getStringVarDecl()
	 * @generated
	 */
	int STRING_VAR_DECL = 27;

	/**
	 * The number of structural features of the '<em>String Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VAR_DECL_FEATURE_COUNT = TEMP_VAR_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Var Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VAR_DECL_OPERATION_COUNT = TEMP_VAR_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.StringVariableImpl <em>String Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.StringVariableImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getStringVariable()
	 * @generated
	 */
	int STRING_VARIABLE = 49;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE__LENGTH = 0;

	/**
	 * The number of structural features of the '<em>String Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>String Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SingleByteStringVarImpl <em>Single Byte String Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SingleByteStringVarImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getSingleByteStringVar()
	 * @generated
	 */
	int SINGLE_BYTE_STRING_VAR = 47;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BYTE_STRING_VAR__LENGTH = STRING_VARIABLE__LENGTH;

	/**
	 * The number of structural features of the '<em>Single Byte String Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BYTE_STRING_VAR_FEATURE_COUNT = STRING_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Byte String Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BYTE_STRING_VAR_OPERATION_COUNT = STRING_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SingleByteStringSpecInitImpl <em>Single Byte String Spec Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SingleByteStringSpecInitImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getSingleByteStringSpecInit()
	 * @generated
	 */
	int SINGLE_BYTE_STRING_SPEC_INIT = 28;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BYTE_STRING_SPEC_INIT__LENGTH = SINGLE_BYTE_STRING_VAR__LENGTH;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BYTE_STRING_SPEC_INIT__INIT = SINGLE_BYTE_STRING_VAR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Byte String Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BYTE_STRING_SPEC_INIT_FEATURE_COUNT = SINGLE_BYTE_STRING_VAR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Byte String Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BYTE_STRING_SPEC_INIT_OPERATION_COUNT = SINGLE_BYTE_STRING_VAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DoubleByteStringSpecInitImpl <em>Double Byte String Spec Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DoubleByteStringSpecInitImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getDoubleByteStringSpecInit()
	 * @generated
	 */
	int DOUBLE_BYTE_STRING_SPEC_INIT = 29;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BYTE_STRING_SPEC_INIT__LENGTH = STRING_VAR_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BYTE_STRING_SPEC_INIT__INIT = STRING_VAR_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Double Byte String Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BYTE_STRING_SPEC_INIT_FEATURE_COUNT = STRING_VAR_DECL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Double Byte String Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BYTE_STRING_SPEC_INIT_OPERATION_COUNT = STRING_VAR_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.Var1DeclImpl <em>Var1 Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.Var1DeclImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVar1Decl()
	 * @generated
	 */
	int VAR1_DECL = 32;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR1_DECL__VARIABLE_NAME = TEMP_VAR_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR1_DECL__SPECIFICATION = TEMP_VAR_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Var1 Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR1_DECL_FEATURE_COUNT = TEMP_VAR_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Var1 Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR1_DECL_OPERATION_COUNT = TEMP_VAR_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedVarDeclarationImpl <em>Located Var Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedVarDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getLocatedVarDeclaration()
	 * @generated
	 */
	int LOCATED_VAR_DECLARATION = 33;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_VAR_DECLARATION__VARIABLE_NAME = NAMED_VARIABLE_DECLARATION__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_VAR_DECLARATION__LOCATION = NAMED_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spec Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_VAR_DECLARATION__SPEC_INIT = NAMED_VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Located Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_VAR_DECLARATION_FEATURE_COUNT = NAMED_VARIABLE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Located Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_VAR_DECLARATION_OPERATION_COUNT = NAMED_VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.IncomplLocatedVarDeclarationImpl <em>Incompl Located Var Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.IncomplLocatedVarDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getIncomplLocatedVarDeclaration()
	 * @generated
	 */
	int INCOMPL_LOCATED_VAR_DECLARATION = 34;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPL_LOCATED_VAR_DECLARATION__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPL_LOCATED_VAR_DECLARATION__VARIABLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPL_LOCATED_VAR_DECLARATION__SPEC = 2;

	/**
	 * The number of structural features of the '<em>Incompl Located Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPL_LOCATED_VAR_DECLARATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Incompl Located Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPL_LOCATED_VAR_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.VarSpecImpl <em>Var Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.VarSpecImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVarSpec()
	 * @generated
	 */
	int VAR_SPEC = 36;

	/**
	 * The number of structural features of the '<em>Var Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_SPEC_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Var Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.StringSpecificationImpl <em>String Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.StringSpecificationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getStringSpecification()
	 * @generated
	 */
	int STRING_SPECIFICATION = 35;

	/**
	 * The number of structural features of the '<em>String Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SPECIFICATION_FEATURE_COUNT = VAR_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SPECIFICATION_OPERATION_COUNT = VAR_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpec <em>Global Var Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpec
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getGlobalVarSpec()
	 * @generated
	 */
	int GLOBAL_VAR_SPEC = 39;

	/**
	 * The number of structural features of the '<em>Global Var Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_SPEC_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Global Var Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.OnlyNamedGlobalVarImpl <em>Only Named Global Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.OnlyNamedGlobalVarImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getOnlyNamedGlobalVar()
	 * @generated
	 */
	int ONLY_NAMED_GLOBAL_VAR = 37;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_NAMED_GLOBAL_VAR__VARIABLE_NAME = GLOBAL_VAR_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Only Named Global Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_NAMED_GLOBAL_VAR_FEATURE_COUNT = GLOBAL_VAR_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Only Named Global Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_NAMED_GLOBAL_VAR_OPERATION_COUNT = GLOBAL_VAR_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedGlobalVarImpl <em>Located Global Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedGlobalVarImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getLocatedGlobalVar()
	 * @generated
	 */
	int LOCATED_GLOBAL_VAR = 38;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_GLOBAL_VAR__VARIABLE_NAME = GLOBAL_VAR_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_GLOBAL_VAR__LOCATION = GLOBAL_VAR_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Located Global Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_GLOBAL_VAR_FEATURE_COUNT = GLOBAL_VAR_SPEC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Located Global Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_GLOBAL_VAR_OPERATION_COUNT = GLOBAL_VAR_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.GlobalVarDeclarationImpl <em>Global Var Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.GlobalVarDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getGlobalVarDeclaration()
	 * @generated
	 */
	int GLOBAL_VAR_DECLARATION = 40;

	/**
	 * The feature id for the '<em><b>Var Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_DECLARATION__VAR_SPEC = 0;

	/**
	 * The feature id for the '<em><b>Spec Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_DECLARATION__SPEC_INIT = 1;

	/**
	 * The number of structural features of the '<em>Global Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Global Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.Var2SpecInitDeclImpl <em>Var2 Spec Init Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.Var2SpecInitDeclImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVar2SpecInitDecl()
	 * @generated
	 */
	int VAR2_SPEC_INIT_DECL = 41;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR2_SPEC_INIT_DECL__VARIABLE_NAME = NAMED_VARIABLE_DECLARATION__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Spec Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR2_SPEC_INIT_DECL__SPEC_INIT = NAMED_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var2 Spec Init Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR2_SPEC_INIT_DECL_FEATURE_COUNT = NAMED_VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Var2 Spec Init Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR2_SPEC_INIT_DECL_OPERATION_COUNT = NAMED_VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ProgramAccessDeclarationImpl <em>Program Access Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ProgramAccessDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getProgramAccessDeclaration()
	 * @generated
	 */
	int PROGRAM_ACCESS_DECLARATION = 42;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ACCESS_DECLARATION__IDENTIFIER = LiteralsPackage.NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ACCESS_DECLARATION__TYPE = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ACCESS_DECLARATION__VARIABLE = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ACCESS_DECLARATION__DIRECTION = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Program Access Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ACCESS_DECLARATION_FEATURE_COUNT = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Program Access Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ACCESS_DECLARATION_OPERATION_COUNT = LiteralsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.FBInstanceImpl <em>FB Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.FBInstanceImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getFBInstance()
	 * @generated
	 */
	int FB_INSTANCE = 43;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_INSTANCE__IDENTIFIER = VAR_INIT_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_INSTANCE__INIT = VAR_INIT_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_INSTANCE__TYPE = VAR_INIT_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Function Block Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_INSTANCE__FUNCTION_BLOCK_TYPE = VAR_INIT_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>FB Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_INSTANCE_FEATURE_COUNT = VAR_INIT_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>FB Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_INSTANCE_OPERATION_COUNT = VAR_INIT_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ExternalVarDeclarationImpl <em>External Var Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ExternalVarDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getExternalVarDeclaration()
	 * @generated
	 */
	int EXTERNAL_VAR_DECLARATION = 44;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VAR_DECLARATION__VARIABLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VAR_DECLARATION__SPEC = 1;

	/**
	 * The number of structural features of the '<em>External Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VAR_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>External Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VAR_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ArrayStructVarSpecImpl <em>Array Struct Var Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ArrayStructVarSpecImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getArrayStructVarSpec()
	 * @generated
	 */
	int ARRAY_STRUCT_VAR_SPEC = 45;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_STRUCT_VAR_SPEC__VARIABLE_NAME = TEMP_VAR_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Struct Var Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_STRUCT_VAR_SPEC_FEATURE_COUNT = TEMP_VAR_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Struct Var Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_STRUCT_VAR_SPEC_OPERATION_COUNT = TEMP_VAR_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SharedVarSpecImpl <em>Shared Var Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SharedVarSpecImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getSharedVarSpec()
	 * @generated
	 */
	int SHARED_VAR_SPEC = 46;

	/**
	 * The number of structural features of the '<em>Shared Var Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VAR_SPEC_FEATURE_COUNT = VAR_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shared Var Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_VAR_SPEC_OPERATION_COUNT = VAR_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SingleByteStringSpecImpl <em>Single Byte String Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SingleByteStringSpecImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getSingleByteStringSpec()
	 * @generated
	 */
	int SINGLE_BYTE_STRING_SPEC = 48;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BYTE_STRING_SPEC__LENGTH = SINGLE_BYTE_STRING_VAR__LENGTH;

	/**
	 * The number of structural features of the '<em>Single Byte String Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BYTE_STRING_SPEC_FEATURE_COUNT = SINGLE_BYTE_STRING_VAR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Byte String Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BYTE_STRING_SPEC_OPERATION_COUNT = SINGLE_BYTE_STRING_VAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DoubleByteStringSpecImpl <em>Double Byte String Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DoubleByteStringSpecImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getDoubleByteStringSpec()
	 * @generated
	 */
	int DOUBLE_BYTE_STRING_SPEC = 50;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BYTE_STRING_SPEC__LENGTH = STRING_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Byte String Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BYTE_STRING_SPEC_FEATURE_COUNT = STRING_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Byte String Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BYTE_STRING_SPEC_OPERATION_COUNT = STRING_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DoubleByteStringVarImpl <em>Double Byte String Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DoubleByteStringVarImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getDoubleByteStringVar()
	 * @generated
	 */
	int DOUBLE_BYTE_STRING_VAR = 51;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BYTE_STRING_VAR__LENGTH = STRING_VARIABLE__LENGTH;

	/**
	 * The number of structural features of the '<em>Double Byte String Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BYTE_STRING_VAR_FEATURE_COUNT = STRING_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double Byte String Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BYTE_STRING_VAR_OPERATION_COUNT = STRING_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.AccessDeclarationImpl <em>Access Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.AccessDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getAccessDeclaration()
	 * @generated
	 */
	int ACCESS_DECLARATION = 52;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECLARATION__IDENTIFIER = LiteralsPackage.NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECLARATION__DIRECTION = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECLARATION__TYPE = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECLARATION__RESOURCE_REF = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Access Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECLARATION_FEATURE_COUNT = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Access Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_DECLARATION_OPERATION_COUNT = LiteralsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SymbolicAccessPathImpl <em>Symbolic Access Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SymbolicAccessPathImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getSymbolicAccessPath()
	 * @generated
	 */
	int SYMBOLIC_ACCESS_PATH = 53;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_ACCESS_PATH__IDENTIFIER = ACCESS_DECLARATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_ACCESS_PATH__DIRECTION = ACCESS_DECLARATION__DIRECTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_ACCESS_PATH__TYPE = ACCESS_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_ACCESS_PATH__RESOURCE_REF = ACCESS_DECLARATION__RESOURCE_REF;

	/**
	 * The feature id for the '<em><b>Fb Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_ACCESS_PATH__FB_REF = ACCESS_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Program Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_ACCESS_PATH__PROGRAM_REF = ACCESS_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_ACCESS_PATH__VARIABLE = ACCESS_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Symbolic Access Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_ACCESS_PATH_FEATURE_COUNT = ACCESS_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Symbolic Access Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_ACCESS_PATH_OPERATION_COUNT = ACCESS_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificVarInitImpl <em>Instance Specific Var Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificVarInitImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getInstanceSpecificVarInit()
	 * @generated
	 */
	int INSTANCE_SPECIFIC_VAR_INIT = 54;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_VAR_INIT__RESOURCE_REF = 0;

	/**
	 * The feature id for the '<em><b>Program Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_VAR_INIT__PROGRAM_REF = 1;

	/**
	 * The number of structural features of the '<em>Instance Specific Var Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_VAR_INIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Instance Specific Var Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_VAR_INIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificVariableImpl <em>Instance Specific Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificVariableImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getInstanceSpecificVariable()
	 * @generated
	 */
	int INSTANCE_SPECIFIC_VARIABLE = 55;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_VARIABLE__RESOURCE_REF = INSTANCE_SPECIFIC_VAR_INIT__RESOURCE_REF;

	/**
	 * The feature id for the '<em><b>Program Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_VARIABLE__PROGRAM_REF = INSTANCE_SPECIFIC_VAR_INIT__PROGRAM_REF;

	/**
	 * The feature id for the '<em><b>Variable Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_VARIABLE__VARIABLE_REF = INSTANCE_SPECIFIC_VAR_INIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_VARIABLE__LOCATION = INSTANCE_SPECIFIC_VAR_INIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Specinit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_VARIABLE__SPECINIT = INSTANCE_SPECIFIC_VAR_INIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instance Specific Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_VARIABLE_FEATURE_COUNT = INSTANCE_SPECIFIC_VAR_INIT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instance Specific Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_VARIABLE_OPERATION_COUNT = INSTANCE_SPECIFIC_VAR_INIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificFBImpl <em>Instance Specific FB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificFBImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getInstanceSpecificFB()
	 * @generated
	 */
	int INSTANCE_SPECIFIC_FB = 56;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_FB__RESOURCE_REF = INSTANCE_SPECIFIC_VAR_INIT__RESOURCE_REF;

	/**
	 * The feature id for the '<em><b>Program Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_FB__PROGRAM_REF = INSTANCE_SPECIFIC_VAR_INIT__PROGRAM_REF;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_FB__INIT = INSTANCE_SPECIFIC_VAR_INIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fb Instance Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_FB__FB_INSTANCE_REF = INSTANCE_SPECIFIC_VAR_INIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Specific FB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_FB_FEATURE_COUNT = INSTANCE_SPECIFIC_VAR_INIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instance Specific FB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_FB_OPERATION_COUNT = INSTANCE_SPECIFIC_VAR_INIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ExternalVarSpecImpl <em>External Var Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ExternalVarSpecImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getExternalVarSpec()
	 * @generated
	 */
	int EXTERNAL_VAR_SPEC = 57;

	/**
	 * The number of structural features of the '<em>External Var Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VAR_SPEC_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>External Var Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VAR_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.GlobalVarSpecInitImpl <em>Global Var Spec Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.GlobalVarSpecInitImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getGlobalVarSpecInit()
	 * @generated
	 */
	int GLOBAL_VAR_SPEC_INIT = 58;

	/**
	 * The number of structural features of the '<em>Global Var Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_SPEC_INIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Global Var Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_SPEC_INIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificSpecInit <em>Instance Specific Spec Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificSpecInit
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getInstanceSpecificSpecInit()
	 * @generated
	 */
	int INSTANCE_SPECIFIC_SPEC_INIT = 59;

	/**
	 * The number of structural features of the '<em>Instance Specific Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_SPEC_INIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Instance Specific Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFIC_SPEC_INIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInit <em>Var2 Spec Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInit
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVar2SpecInit()
	 * @generated
	 */
	int VAR2_SPEC_INIT = 60;

	/**
	 * The number of structural features of the '<em>Var2 Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR2_SPEC_INIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Var2 Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR2_SPEC_INIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInit <em>Var1 Spec Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInit
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVar1SpecInit()
	 * @generated
	 */
	int VAR1_SPEC_INIT = 61;

	/**
	 * The number of structural features of the '<em>Var1 Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR1_SPEC_INIT_FEATURE_COUNT = VAR2_SPEC_INIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Var1 Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR1_SPEC_INIT_OPERATION_COUNT = VAR2_SPEC_INIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedVarSpecInitImpl <em>Located Var Spec Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedVarSpecInitImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getLocatedVarSpecInit()
	 * @generated
	 */
	int LOCATED_VAR_SPEC_INIT = 63;

	/**
	 * The number of structural features of the '<em>Located Var Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_VAR_SPEC_INIT_FEATURE_COUNT = GLOBAL_VAR_SPEC_INIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Located Var Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_VAR_SPEC_INIT_OPERATION_COUNT = GLOBAL_VAR_SPEC_INIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Specification <em>Var1 Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Specification
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVar1Specification()
	 * @generated
	 */
	int VAR1_SPECIFICATION = 64;

	/**
	 * The number of structural features of the '<em>Var1 Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR1_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Var1 Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR1_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationType <em>Var Declaration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationType
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVarDeclarationType()
	 * @generated
	 */
	int VAR_DECLARATION_TYPE = 65;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeType <em>Edge Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeType
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getEdgeType()
	 * @generated
	 */
	int EDGE_TYPE = 66;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalAttribute <em>Global Attribute</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalAttribute
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getGlobalAttribute()
	 * @generated
	 */
	int GLOBAL_ATTRIBUTE = 67;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Direction
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 68;


	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IOVarDeclaration <em>IO Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Var Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.IOVarDeclaration
	 * @generated
	 */
	EClass getIOVarDeclaration();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputVarContainer <em>Input Var Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Var Container</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputVarContainer
	 * @generated
	 */
	EClass getInputVarContainer();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputVarContainer#isRetain <em>Retain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retain</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputVarContainer#isRetain()
	 * @see #getInputVarContainer()
	 * @generated
	 */
	EAttribute getInputVarContainer_Retain();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputVarContainer#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputVarContainer#getDeclarations()
	 * @see #getInputVarContainer()
	 * @generated
	 */
	EReference getInputVarContainer_Declarations();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.OutputVarContainer <em>Output Var Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Var Container</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.OutputVarContainer
	 * @generated
	 */
	EClass getOutputVarContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.OutputVarContainer#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.OutputVarContainer#getDeclarations()
	 * @see #getOutputVarContainer()
	 * @generated
	 */
	EReference getOutputVarContainer_Declarations();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.OutputVarContainer#isRetain <em>Retain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retain</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.OutputVarContainer#isRetain()
	 * @see #getOutputVarContainer()
	 * @generated
	 */
	EAttribute getOutputVarContainer_Retain();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputOutputVarContainer <em>Input Output Var Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Output Var Container</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputOutputVarContainer
	 * @generated
	 */
	EClass getInputOutputVarContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputOutputVarContainer#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputOutputVarContainer#getDeclarations()
	 * @see #getInputOutputVarContainer()
	 * @generated
	 */
	EReference getInputOutputVarContainer_Declarations();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBProgramVarDeclaration <em>FB Program Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FB Program Var Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBProgramVarDeclaration
	 * @generated
	 */
	EClass getFBProgramVarDeclaration();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationContainer <em>Var Declaration Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Declaration Container</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationContainer
	 * @generated
	 */
	EClass getVarDeclarationContainer();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationContainer#getDeclarationType <em>Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationContainer#getDeclarationType()
	 * @see #getVarDeclarationContainer()
	 * @generated
	 */
	EAttribute getVarDeclarationContainer_DeclarationType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationContainer#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationContainer#getDeclarations()
	 * @see #getVarDeclarationContainer()
	 * @generated
	 */
	EReference getVarDeclarationContainer_Declarations();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarContainer <em>External Var Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Var Container</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarContainer
	 * @generated
	 */
	EClass getExternalVarContainer();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarContainer#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarContainer#isConstant()
	 * @see #getExternalVarContainer()
	 * @generated
	 */
	EAttribute getExternalVarContainer_Constant();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarContainer#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarContainer#getDeclarations()
	 * @see #getExternalVarContainer()
	 * @generated
	 */
	EReference getExternalVarContainer_Declarations();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclarationContainer <em>Temp Var Declaration Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temp Var Declaration Container</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclarationContainer
	 * @generated
	 */
	EClass getTempVarDeclarationContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclarationContainer#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclarationContainer#getDeclarations()
	 * @see #getTempVarDeclarationContainer()
	 * @generated
	 */
	EReference getTempVarDeclarationContainer_Declarations();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarContainer <em>Incompl Located Var Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incompl Located Var Container</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarContainer
	 * @generated
	 */
	EClass getIncomplLocatedVarContainer();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarContainer#isRetain <em>Retain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retain</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarContainer#isRetain()
	 * @see #getIncomplLocatedVarContainer()
	 * @generated
	 */
	EAttribute getIncomplLocatedVarContainer_Retain();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarContainer#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarContainer#getDeclarations()
	 * @see #getIncomplLocatedVarContainer()
	 * @generated
	 */
	EReference getIncomplLocatedVarContainer_Declarations();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramSpecificDeclaration <em>Program Specific Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Specific Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramSpecificDeclaration
	 * @generated
	 */
	EClass getProgramSpecificDeclaration();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclarationContainer <em>Located Var Declaration Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Located Var Declaration Container</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclarationContainer
	 * @generated
	 */
	EClass getLocatedVarDeclarationContainer();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclarationContainer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclarationContainer#getType()
	 * @see #getLocatedVarDeclarationContainer()
	 * @generated
	 */
	EAttribute getLocatedVarDeclarationContainer_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclarationContainer#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclarationContainer#getDeclarations()
	 * @see #getLocatedVarDeclarationContainer()
	 * @generated
	 */
	EReference getLocatedVarDeclarationContainer_Declarations();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessContainer <em>Program Access Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Access Container</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessContainer
	 * @generated
	 */
	EClass getProgramAccessContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessContainer#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessContainer#getDeclarations()
	 * @see #getProgramAccessContainer()
	 * @generated
	 */
	EReference getProgramAccessContainer_Declarations();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVarContainer <em>Function Var Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Var Container</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVarContainer
	 * @generated
	 */
	EClass getFunctionVarContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVarContainer#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVarContainer#getDeclarations()
	 * @see #getFunctionVarContainer()
	 * @generated
	 */
	EReference getFunctionVarContainer_Declarations();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVarContainer#isCONSTANT <em>CONSTANT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CONSTANT</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVarContainer#isCONSTANT()
	 * @see #getFunctionVarContainer()
	 * @generated
	 */
	EAttribute getFunctionVarContainer_CONSTANT();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclarationContainer <em>Global Var Declaration Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Var Declaration Container</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclarationContainer
	 * @generated
	 */
	EClass getGlobalVarDeclarationContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclarationContainer#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclarationContainer#getDeclarations()
	 * @see #getGlobalVarDeclarationContainer()
	 * @generated
	 */
	EReference getGlobalVarDeclarationContainer_Declarations();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclarationContainer#getGlobalAttribute <em>Global Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Attribute</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclarationContainer#getGlobalAttribute()
	 * @see #getGlobalVarDeclarationContainer()
	 * @generated
	 */
	EAttribute getGlobalVarDeclarationContainer_GlobalAttribute();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVariableDeclaration <em>Function Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Variable Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVariableDeclaration
	 * @generated
	 */
	EClass getFunctionVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionBlockVariableDeclaration <em>Function Block Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block Variable Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionBlockVariableDeclaration
	 * @generated
	 */
	EClass getFunctionBlockVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramVariableDeclaration <em>Program Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Variable Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramVariableDeclaration
	 * @generated
	 */
	EClass getProgramVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationVariableDeclaration <em>Configuration Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Variable Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationVariableDeclaration
	 * @generated
	 */
	EClass getConfigurationVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ResourceVariableDeclaration <em>Resource Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Variable Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ResourceVariableDeclaration
	 * @generated
	 */
	EClass getResourceVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessVarContainer <em>Access Var Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Var Container</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessVarContainer
	 * @generated
	 */
	EClass getAccessVarContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessVarContainer#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessVarContainer#getDeclarations()
	 * @see #getAccessVarContainer()
	 * @generated
	 */
	EReference getAccessVarContainer_Declarations();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarContainter <em>Instance Specific Var Containter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Specific Var Containter</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarContainter
	 * @generated
	 */
	EClass getInstanceSpecificVarContainter();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarContainter#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarContainter#getDeclarations()
	 * @see #getInstanceSpecificVarContainter()
	 * @generated
	 */
	EReference getInstanceSpecificVarContainter_Declarations();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationSpecificDeclaration <em>Configuration Specific Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Specific Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationSpecificDeclaration
	 * @generated
	 */
	EClass getConfigurationSpecificDeclaration();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputDeclaration <em>Input Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputDeclaration
	 * @generated
	 */
	EClass getInputDeclaration();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeDeclaration <em>Edge Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeDeclaration
	 * @generated
	 */
	EClass getEdgeDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeDeclaration#getEdgeType <em>Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeDeclaration#getEdgeType()
	 * @see #getEdgeDeclaration()
	 * @generated
	 */
	EAttribute getEdgeDeclaration_EdgeType();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarInitDeclaration <em>Var Init Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Init Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarInitDeclaration
	 * @generated
	 */
	EClass getVarInitDeclaration();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInitDecl <em>Var1 Spec Init Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var1 Spec Init Decl</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInitDecl
	 * @generated
	 */
	EClass getVar1SpecInitDecl();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInitDecl#getSpecInit <em>Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInitDecl#getSpecInit()
	 * @see #getVar1SpecInitDecl()
	 * @generated
	 */
	EReference getVar1SpecInitDecl_SpecInit();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringVarDecl <em>String Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Var Decl</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringVarDecl
	 * @generated
	 */
	EClass getStringVarDecl();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpecInit <em>Single Byte String Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Byte String Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpecInit
	 * @generated
	 */
	EClass getSingleByteStringSpecInit();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpecInit#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpecInit#getInit()
	 * @see #getSingleByteStringSpecInit()
	 * @generated
	 */
	EReference getSingleByteStringSpecInit_Init();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpecInit <em>Double Byte String Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Byte String Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpecInit
	 * @generated
	 */
	EClass getDoubleByteStringSpecInit();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpecInit#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpecInit#getInit()
	 * @see #getDoubleByteStringSpecInit()
	 * @generated
	 */
	EReference getDoubleByteStringSpecInit_Init();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationOnly <em>Var Declaration Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Declaration Only</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationOnly
	 * @generated
	 */
	EClass getVarDeclarationOnly();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclaration <em>Temp Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temp Var Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclaration
	 * @generated
	 */
	EClass getTempVarDeclaration();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Decl <em>Var1 Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var1 Decl</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Decl
	 * @generated
	 */
	EClass getVar1Decl();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Decl#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Decl#getSpecification()
	 * @see #getVar1Decl()
	 * @generated
	 */
	EReference getVar1Decl_Specification();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration <em>Located Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Located Var Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration
	 * @generated
	 */
	EClass getLocatedVarDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration#getLocation()
	 * @see #getLocatedVarDeclaration()
	 * @generated
	 */
	EReference getLocatedVarDeclaration_Location();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration#getSpecInit <em>Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration#getSpecInit()
	 * @see #getLocatedVarDeclaration()
	 * @generated
	 */
	EReference getLocatedVarDeclaration_SpecInit();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration <em>Incompl Located Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incompl Located Var Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration
	 * @generated
	 */
	EClass getIncomplLocatedVarDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration#getLocation()
	 * @see #getIncomplLocatedVarDeclaration()
	 * @generated
	 */
	EAttribute getIncomplLocatedVarDeclaration_Location();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration#getVariableName()
	 * @see #getIncomplLocatedVarDeclaration()
	 * @generated
	 */
	EReference getIncomplLocatedVarDeclaration_VariableName();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spec</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration#getSpec()
	 * @see #getIncomplLocatedVarDeclaration()
	 * @generated
	 */
	EReference getIncomplLocatedVarDeclaration_Spec();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringSpecification <em>String Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Specification</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringSpecification
	 * @generated
	 */
	EClass getStringSpecification();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarSpec <em>Var Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Spec</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarSpec
	 * @generated
	 */
	EClass getVarSpec();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.OnlyNamedGlobalVar <em>Only Named Global Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Only Named Global Var</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.OnlyNamedGlobalVar
	 * @generated
	 */
	EClass getOnlyNamedGlobalVar();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.OnlyNamedGlobalVar#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.OnlyNamedGlobalVar#getVariableName()
	 * @see #getOnlyNamedGlobalVar()
	 * @generated
	 */
	EReference getOnlyNamedGlobalVar_VariableName();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedGlobalVar <em>Located Global Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Located Global Var</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedGlobalVar
	 * @generated
	 */
	EClass getLocatedGlobalVar();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedGlobalVar#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedGlobalVar#getVariableName()
	 * @see #getLocatedGlobalVar()
	 * @generated
	 */
	EReference getLocatedGlobalVar_VariableName();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedGlobalVar#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedGlobalVar#getLocation()
	 * @see #getLocatedGlobalVar()
	 * @generated
	 */
	EReference getLocatedGlobalVar_Location();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpec <em>Global Var Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Var Spec</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpec
	 * @generated
	 */
	EClass getGlobalVarSpec();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclaration <em>Global Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Var Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclaration
	 * @generated
	 */
	EClass getGlobalVarDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclaration#getVarSpec <em>Var Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var Spec</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclaration#getVarSpec()
	 * @see #getGlobalVarDeclaration()
	 * @generated
	 */
	EReference getGlobalVarDeclaration_VarSpec();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclaration#getSpecInit <em>Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclaration#getSpecInit()
	 * @see #getGlobalVarDeclaration()
	 * @generated
	 */
	EReference getGlobalVarDeclaration_SpecInit();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInitDecl <em>Var2 Spec Init Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var2 Spec Init Decl</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInitDecl
	 * @generated
	 */
	EClass getVar2SpecInitDecl();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInitDecl#getSpecInit <em>Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInitDecl#getSpecInit()
	 * @see #getVar2SpecInitDecl()
	 * @generated
	 */
	EReference getVar2SpecInitDecl_SpecInit();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessDeclaration <em>Program Access Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Access Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessDeclaration
	 * @generated
	 */
	EClass getProgramAccessDeclaration();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessDeclaration#getType()
	 * @see #getProgramAccessDeclaration()
	 * @generated
	 */
	EReference getProgramAccessDeclaration_Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessDeclaration#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessDeclaration#getVariable()
	 * @see #getProgramAccessDeclaration()
	 * @generated
	 */
	EReference getProgramAccessDeclaration_Variable();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessDeclaration#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramAccessDeclaration#getDirection()
	 * @see #getProgramAccessDeclaration()
	 * @generated
	 */
	EAttribute getProgramAccessDeclaration_Direction();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance <em>FB Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FB Instance</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance
	 * @generated
	 */
	EClass getFBInstance();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance#getInit()
	 * @see #getFBInstance()
	 * @generated
	 */
	EReference getFBInstance_Init();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance#getType()
	 * @see #getFBInstance()
	 * @generated
	 */
	EReference getFBInstance_Type();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance#getFunctionBlockType <em>Function Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Block Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance#getFunctionBlockType()
	 * @see #getFBInstance()
	 * @generated
	 */
	EReference getFBInstance_FunctionBlockType();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarDeclaration <em>External Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Var Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarDeclaration
	 * @generated
	 */
	EClass getExternalVarDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarDeclaration#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarDeclaration#getVariableName()
	 * @see #getExternalVarDeclaration()
	 * @generated
	 */
	EReference getExternalVarDeclaration_VariableName();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarDeclaration#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spec</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarDeclaration#getSpec()
	 * @see #getExternalVarDeclaration()
	 * @generated
	 */
	EReference getExternalVarDeclaration_Spec();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ArrayStructVarSpec <em>Array Struct Var Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Struct Var Spec</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ArrayStructVarSpec
	 * @generated
	 */
	EClass getArrayStructVarSpec();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ArrayStructVarSpec#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ArrayStructVarSpec#getVariableName()
	 * @see #getArrayStructVarSpec()
	 * @generated
	 */
	EReference getArrayStructVarSpec_VariableName();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SharedVarSpec <em>Shared Var Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Var Spec</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.SharedVarSpec
	 * @generated
	 */
	EClass getSharedVarSpec();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringVar <em>Single Byte String Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Byte String Var</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringVar
	 * @generated
	 */
	EClass getSingleByteStringVar();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpec <em>Single Byte String Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Byte String Spec</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpec
	 * @generated
	 */
	EClass getSingleByteStringSpec();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringVariable <em>String Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringVariable
	 * @generated
	 */
	EClass getStringVariable();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringVariable#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringVariable#getLength()
	 * @see #getStringVariable()
	 * @generated
	 */
	EReference getStringVariable_Length();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpec <em>Double Byte String Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Byte String Spec</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpec
	 * @generated
	 */
	EClass getDoubleByteStringSpec();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringVar <em>Double Byte String Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Byte String Var</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringVar
	 * @generated
	 */
	EClass getDoubleByteStringVar();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessDeclaration <em>Access Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessDeclaration
	 * @generated
	 */
	EClass getAccessDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessDeclaration#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessDeclaration#getDirection()
	 * @see #getAccessDeclaration()
	 * @generated
	 */
	EAttribute getAccessDeclaration_Direction();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessDeclaration#getType()
	 * @see #getAccessDeclaration()
	 * @generated
	 */
	EReference getAccessDeclaration_Type();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessDeclaration#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Ref</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessDeclaration#getResourceRef()
	 * @see #getAccessDeclaration()
	 * @generated
	 */
	EReference getAccessDeclaration_ResourceRef();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath <em>Symbolic Access Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbolic Access Path</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath
	 * @generated
	 */
	EClass getSymbolicAccessPath();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath#getFbRef <em>Fb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fb Ref</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath#getFbRef()
	 * @see #getSymbolicAccessPath()
	 * @generated
	 */
	EReference getSymbolicAccessPath_FbRef();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath#getProgramRef <em>Program Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Program Ref</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath#getProgramRef()
	 * @see #getSymbolicAccessPath()
	 * @generated
	 */
	EReference getSymbolicAccessPath_ProgramRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath#getVariable()
	 * @see #getSymbolicAccessPath()
	 * @generated
	 */
	EReference getSymbolicAccessPath_Variable();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarInit <em>Instance Specific Var Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Specific Var Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarInit
	 * @generated
	 */
	EClass getInstanceSpecificVarInit();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarInit#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Ref</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarInit#getResourceRef()
	 * @see #getInstanceSpecificVarInit()
	 * @generated
	 */
	EReference getInstanceSpecificVarInit_ResourceRef();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarInit#getProgramRef <em>Program Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Program Ref</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarInit#getProgramRef()
	 * @see #getInstanceSpecificVarInit()
	 * @generated
	 */
	EReference getInstanceSpecificVarInit_ProgramRef();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable <em>Instance Specific Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Specific Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable
	 * @generated
	 */
	EClass getInstanceSpecificVariable();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable#getVariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Ref</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable#getVariableRef()
	 * @see #getInstanceSpecificVariable()
	 * @generated
	 */
	EReference getInstanceSpecificVariable_VariableRef();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable#getLocation()
	 * @see #getInstanceSpecificVariable()
	 * @generated
	 */
	EReference getInstanceSpecificVariable_Location();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable#getSpecinit <em>Specinit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specinit</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable#getSpecinit()
	 * @see #getInstanceSpecificVariable()
	 * @generated
	 */
	EReference getInstanceSpecificVariable_Specinit();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificFB <em>Instance Specific FB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Specific FB</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificFB
	 * @generated
	 */
	EClass getInstanceSpecificFB();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificFB#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificFB#getInit()
	 * @see #getInstanceSpecificFB()
	 * @generated
	 */
	EReference getInstanceSpecificFB_Init();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificFB#getFbInstanceRef <em>Fb Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fb Instance Ref</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificFB#getFbInstanceRef()
	 * @see #getInstanceSpecificFB()
	 * @generated
	 */
	EReference getInstanceSpecificFB_FbInstanceRef();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarSpec <em>External Var Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Var Spec</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarSpec
	 * @generated
	 */
	EClass getExternalVarSpec();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpecInit <em>Global Var Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Var Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpecInit
	 * @generated
	 */
	EClass getGlobalVarSpecInit();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificSpecInit <em>Instance Specific Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Specific Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificSpecInit
	 * @generated
	 */
	EClass getInstanceSpecificSpecInit();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInit <em>Var2 Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var2 Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInit
	 * @generated
	 */
	EClass getVar2SpecInit();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInit <em>Var1 Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var1 Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInit
	 * @generated
	 */
	EClass getVar1SpecInit();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.NamedVariableDeclaration <em>Named Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Variable Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.NamedVariableDeclaration
	 * @generated
	 */
	EClass getNamedVariableDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.NamedVariableDeclaration#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.NamedVariableDeclaration#getVariableName()
	 * @see #getNamedVariableDeclaration()
	 * @generated
	 */
	EReference getNamedVariableDeclaration_VariableName();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarSpecInit <em>Located Var Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Located Var Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarSpecInit
	 * @generated
	 */
	EClass getLocatedVarSpecInit();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Specification <em>Var1 Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var1 Specification</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Specification
	 * @generated
	 */
	EClass getVar1Specification();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationType <em>Var Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Var Declaration Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationType
	 * @generated
	 */
	EEnum getVarDeclarationType();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeType <em>Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Edge Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeType
	 * @generated
	 */
	EEnum getEdgeType();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalAttribute <em>Global Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Global Attribute</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalAttribute
	 * @generated
	 */
	EEnum getGlobalAttribute();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeclarationsFactory getDeclarationsFactory();

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
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VariableDeclaration <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VariableDeclaration
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IOVarDeclaration <em>IO Var Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.IOVarDeclaration
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getIOVarDeclaration()
		 * @generated
		 */
		EClass IO_VAR_DECLARATION = eINSTANCE.getIOVarDeclaration();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InputVarContainerImpl <em>Input Var Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InputVarContainerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getInputVarContainer()
		 * @generated
		 */
		EClass INPUT_VAR_CONTAINER = eINSTANCE.getInputVarContainer();

		/**
		 * The meta object literal for the '<em><b>Retain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_VAR_CONTAINER__RETAIN = eINSTANCE.getInputVarContainer_Retain();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VAR_CONTAINER__DECLARATIONS = eINSTANCE.getInputVarContainer_Declarations();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.OutputVarContainerImpl <em>Output Var Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.OutputVarContainerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getOutputVarContainer()
		 * @generated
		 */
		EClass OUTPUT_VAR_CONTAINER = eINSTANCE.getOutputVarContainer();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_VAR_CONTAINER__DECLARATIONS = eINSTANCE.getOutputVarContainer_Declarations();

		/**
		 * The meta object literal for the '<em><b>Retain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_VAR_CONTAINER__RETAIN = eINSTANCE.getOutputVarContainer_Retain();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InputOutputVarContainerImpl <em>Input Output Var Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InputOutputVarContainerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getInputOutputVarContainer()
		 * @generated
		 */
		EClass INPUT_OUTPUT_VAR_CONTAINER = eINSTANCE.getInputOutputVarContainer();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_OUTPUT_VAR_CONTAINER__DECLARATIONS = eINSTANCE.getInputOutputVarContainer_Declarations();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBProgramVarDeclaration <em>FB Program Var Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBProgramVarDeclaration
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getFBProgramVarDeclaration()
		 * @generated
		 */
		EClass FB_PROGRAM_VAR_DECLARATION = eINSTANCE.getFBProgramVarDeclaration();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.VarDeclarationContainerImpl <em>Var Declaration Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.VarDeclarationContainerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVarDeclarationContainer()
		 * @generated
		 */
		EClass VAR_DECLARATION_CONTAINER = eINSTANCE.getVarDeclarationContainer();

		/**
		 * The meta object literal for the '<em><b>Declaration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_DECLARATION_CONTAINER__DECLARATION_TYPE = eINSTANCE.getVarDeclarationContainer_DeclarationType();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_DECLARATION_CONTAINER__DECLARATIONS = eINSTANCE.getVarDeclarationContainer_Declarations();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ExternalVarContainerImpl <em>External Var Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ExternalVarContainerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getExternalVarContainer()
		 * @generated
		 */
		EClass EXTERNAL_VAR_CONTAINER = eINSTANCE.getExternalVarContainer();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_VAR_CONTAINER__CONSTANT = eINSTANCE.getExternalVarContainer_Constant();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_VAR_CONTAINER__DECLARATIONS = eINSTANCE.getExternalVarContainer_Declarations();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.TempVarDeclarationContainerImpl <em>Temp Var Declaration Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.TempVarDeclarationContainerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getTempVarDeclarationContainer()
		 * @generated
		 */
		EClass TEMP_VAR_DECLARATION_CONTAINER = eINSTANCE.getTempVarDeclarationContainer();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMP_VAR_DECLARATION_CONTAINER__DECLARATIONS = eINSTANCE.getTempVarDeclarationContainer_Declarations();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.IncomplLocatedVarContainerImpl <em>Incompl Located Var Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.IncomplLocatedVarContainerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getIncomplLocatedVarContainer()
		 * @generated
		 */
		EClass INCOMPL_LOCATED_VAR_CONTAINER = eINSTANCE.getIncomplLocatedVarContainer();

		/**
		 * The meta object literal for the '<em><b>Retain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOMPL_LOCATED_VAR_CONTAINER__RETAIN = eINSTANCE.getIncomplLocatedVarContainer_Retain();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMPL_LOCATED_VAR_CONTAINER__DECLARATIONS = eINSTANCE.getIncomplLocatedVarContainer_Declarations();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramSpecificDeclaration <em>Program Specific Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramSpecificDeclaration
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getProgramSpecificDeclaration()
		 * @generated
		 */
		EClass PROGRAM_SPECIFIC_DECLARATION = eINSTANCE.getProgramSpecificDeclaration();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedVarDeclarationContainerImpl <em>Located Var Declaration Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedVarDeclarationContainerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getLocatedVarDeclarationContainer()
		 * @generated
		 */
		EClass LOCATED_VAR_DECLARATION_CONTAINER = eINSTANCE.getLocatedVarDeclarationContainer();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_VAR_DECLARATION_CONTAINER__TYPE = eINSTANCE.getLocatedVarDeclarationContainer_Type();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATED_VAR_DECLARATION_CONTAINER__DECLARATIONS = eINSTANCE.getLocatedVarDeclarationContainer_Declarations();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ProgramAccessContainerImpl <em>Program Access Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ProgramAccessContainerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getProgramAccessContainer()
		 * @generated
		 */
		EClass PROGRAM_ACCESS_CONTAINER = eINSTANCE.getProgramAccessContainer();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_ACCESS_CONTAINER__DECLARATIONS = eINSTANCE.getProgramAccessContainer_Declarations();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.FunctionVarContainerImpl <em>Function Var Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.FunctionVarContainerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getFunctionVarContainer()
		 * @generated
		 */
		EClass FUNCTION_VAR_CONTAINER = eINSTANCE.getFunctionVarContainer();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_VAR_CONTAINER__DECLARATIONS = eINSTANCE.getFunctionVarContainer_Declarations();

		/**
		 * The meta object literal for the '<em><b>CONSTANT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_VAR_CONTAINER__CONSTANT = eINSTANCE.getFunctionVarContainer_CONSTANT();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.GlobalVarDeclarationContainerImpl <em>Global Var Declaration Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.GlobalVarDeclarationContainerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getGlobalVarDeclarationContainer()
		 * @generated
		 */
		EClass GLOBAL_VAR_DECLARATION_CONTAINER = eINSTANCE.getGlobalVarDeclarationContainer();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_VAR_DECLARATION_CONTAINER__DECLARATIONS = eINSTANCE.getGlobalVarDeclarationContainer_Declarations();

		/**
		 * The meta object literal for the '<em><b>Global Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VAR_DECLARATION_CONTAINER__GLOBAL_ATTRIBUTE = eINSTANCE.getGlobalVarDeclarationContainer_GlobalAttribute();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVariableDeclaration <em>Function Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVariableDeclaration
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getFunctionVariableDeclaration()
		 * @generated
		 */
		EClass FUNCTION_VARIABLE_DECLARATION = eINSTANCE.getFunctionVariableDeclaration();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionBlockVariableDeclaration <em>Function Block Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionBlockVariableDeclaration
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getFunctionBlockVariableDeclaration()
		 * @generated
		 */
		EClass FUNCTION_BLOCK_VARIABLE_DECLARATION = eINSTANCE.getFunctionBlockVariableDeclaration();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramVariableDeclaration <em>Program Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ProgramVariableDeclaration
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getProgramVariableDeclaration()
		 * @generated
		 */
		EClass PROGRAM_VARIABLE_DECLARATION = eINSTANCE.getProgramVariableDeclaration();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationVariableDeclaration <em>Configuration Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationVariableDeclaration
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getConfigurationVariableDeclaration()
		 * @generated
		 */
		EClass CONFIGURATION_VARIABLE_DECLARATION = eINSTANCE.getConfigurationVariableDeclaration();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ResourceVariableDeclaration <em>Resource Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ResourceVariableDeclaration
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getResourceVariableDeclaration()
		 * @generated
		 */
		EClass RESOURCE_VARIABLE_DECLARATION = eINSTANCE.getResourceVariableDeclaration();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.AccessVarContainerImpl <em>Access Var Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.AccessVarContainerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getAccessVarContainer()
		 * @generated
		 */
		EClass ACCESS_VAR_CONTAINER = eINSTANCE.getAccessVarContainer();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_VAR_CONTAINER__DECLARATIONS = eINSTANCE.getAccessVarContainer_Declarations();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificVarContainterImpl <em>Instance Specific Var Containter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificVarContainterImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getInstanceSpecificVarContainter()
		 * @generated
		 */
		EClass INSTANCE_SPECIFIC_VAR_CONTAINTER = eINSTANCE.getInstanceSpecificVarContainter();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_SPECIFIC_VAR_CONTAINTER__DECLARATIONS = eINSTANCE.getInstanceSpecificVarContainter_Declarations();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationSpecificDeclaration <em>Configuration Specific Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationSpecificDeclaration
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getConfigurationSpecificDeclaration()
		 * @generated
		 */
		EClass CONFIGURATION_SPECIFIC_DECLARATION = eINSTANCE.getConfigurationSpecificDeclaration();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputDeclaration <em>Input Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InputDeclaration
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getInputDeclaration()
		 * @generated
		 */
		EClass INPUT_DECLARATION = eINSTANCE.getInputDeclaration();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.EdgeDeclarationImpl <em>Edge Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.EdgeDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getEdgeDeclaration()
		 * @generated
		 */
		EClass EDGE_DECLARATION = eINSTANCE.getEdgeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Edge Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_DECLARATION__EDGE_TYPE = eINSTANCE.getEdgeDeclaration_EdgeType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarInitDeclaration <em>Var Init Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarInitDeclaration
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVarInitDeclaration()
		 * @generated
		 */
		EClass VAR_INIT_DECLARATION = eINSTANCE.getVarInitDeclaration();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.Var1SpecInitDeclImpl <em>Var1 Spec Init Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.Var1SpecInitDeclImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVar1SpecInitDecl()
		 * @generated
		 */
		EClass VAR1_SPEC_INIT_DECL = eINSTANCE.getVar1SpecInitDecl();

		/**
		 * The meta object literal for the '<em><b>Spec Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR1_SPEC_INIT_DECL__SPEC_INIT = eINSTANCE.getVar1SpecInitDecl_SpecInit();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.StringVarDeclImpl <em>String Var Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.StringVarDeclImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getStringVarDecl()
		 * @generated
		 */
		EClass STRING_VAR_DECL = eINSTANCE.getStringVarDecl();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SingleByteStringSpecInitImpl <em>Single Byte String Spec Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SingleByteStringSpecInitImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getSingleByteStringSpecInit()
		 * @generated
		 */
		EClass SINGLE_BYTE_STRING_SPEC_INIT = eINSTANCE.getSingleByteStringSpecInit();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_BYTE_STRING_SPEC_INIT__INIT = eINSTANCE.getSingleByteStringSpecInit_Init();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DoubleByteStringSpecInitImpl <em>Double Byte String Spec Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DoubleByteStringSpecInitImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getDoubleByteStringSpecInit()
		 * @generated
		 */
		EClass DOUBLE_BYTE_STRING_SPEC_INIT = eINSTANCE.getDoubleByteStringSpecInit();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOUBLE_BYTE_STRING_SPEC_INIT__INIT = eINSTANCE.getDoubleByteStringSpecInit_Init();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationOnly <em>Var Declaration Only</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationOnly
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVarDeclarationOnly()
		 * @generated
		 */
		EClass VAR_DECLARATION_ONLY = eINSTANCE.getVarDeclarationOnly();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclaration <em>Temp Var Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclaration
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getTempVarDeclaration()
		 * @generated
		 */
		EClass TEMP_VAR_DECLARATION = eINSTANCE.getTempVarDeclaration();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.Var1DeclImpl <em>Var1 Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.Var1DeclImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVar1Decl()
		 * @generated
		 */
		EClass VAR1_DECL = eINSTANCE.getVar1Decl();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR1_DECL__SPECIFICATION = eINSTANCE.getVar1Decl_Specification();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedVarDeclarationImpl <em>Located Var Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedVarDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getLocatedVarDeclaration()
		 * @generated
		 */
		EClass LOCATED_VAR_DECLARATION = eINSTANCE.getLocatedVarDeclaration();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATED_VAR_DECLARATION__LOCATION = eINSTANCE.getLocatedVarDeclaration_Location();

		/**
		 * The meta object literal for the '<em><b>Spec Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATED_VAR_DECLARATION__SPEC_INIT = eINSTANCE.getLocatedVarDeclaration_SpecInit();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.IncomplLocatedVarDeclarationImpl <em>Incompl Located Var Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.IncomplLocatedVarDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getIncomplLocatedVarDeclaration()
		 * @generated
		 */
		EClass INCOMPL_LOCATED_VAR_DECLARATION = eINSTANCE.getIncomplLocatedVarDeclaration();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOMPL_LOCATED_VAR_DECLARATION__LOCATION = eINSTANCE.getIncomplLocatedVarDeclaration_Location();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMPL_LOCATED_VAR_DECLARATION__VARIABLE_NAME = eINSTANCE.getIncomplLocatedVarDeclaration_VariableName();

		/**
		 * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMPL_LOCATED_VAR_DECLARATION__SPEC = eINSTANCE.getIncomplLocatedVarDeclaration_Spec();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.StringSpecificationImpl <em>String Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.StringSpecificationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getStringSpecification()
		 * @generated
		 */
		EClass STRING_SPECIFICATION = eINSTANCE.getStringSpecification();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.VarSpecImpl <em>Var Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.VarSpecImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVarSpec()
		 * @generated
		 */
		EClass VAR_SPEC = eINSTANCE.getVarSpec();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.OnlyNamedGlobalVarImpl <em>Only Named Global Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.OnlyNamedGlobalVarImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getOnlyNamedGlobalVar()
		 * @generated
		 */
		EClass ONLY_NAMED_GLOBAL_VAR = eINSTANCE.getOnlyNamedGlobalVar();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONLY_NAMED_GLOBAL_VAR__VARIABLE_NAME = eINSTANCE.getOnlyNamedGlobalVar_VariableName();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedGlobalVarImpl <em>Located Global Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedGlobalVarImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getLocatedGlobalVar()
		 * @generated
		 */
		EClass LOCATED_GLOBAL_VAR = eINSTANCE.getLocatedGlobalVar();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATED_GLOBAL_VAR__VARIABLE_NAME = eINSTANCE.getLocatedGlobalVar_VariableName();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATED_GLOBAL_VAR__LOCATION = eINSTANCE.getLocatedGlobalVar_Location();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpec <em>Global Var Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpec
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getGlobalVarSpec()
		 * @generated
		 */
		EClass GLOBAL_VAR_SPEC = eINSTANCE.getGlobalVarSpec();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.GlobalVarDeclarationImpl <em>Global Var Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.GlobalVarDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getGlobalVarDeclaration()
		 * @generated
		 */
		EClass GLOBAL_VAR_DECLARATION = eINSTANCE.getGlobalVarDeclaration();

		/**
		 * The meta object literal for the '<em><b>Var Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_VAR_DECLARATION__VAR_SPEC = eINSTANCE.getGlobalVarDeclaration_VarSpec();

		/**
		 * The meta object literal for the '<em><b>Spec Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_VAR_DECLARATION__SPEC_INIT = eINSTANCE.getGlobalVarDeclaration_SpecInit();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.Var2SpecInitDeclImpl <em>Var2 Spec Init Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.Var2SpecInitDeclImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVar2SpecInitDecl()
		 * @generated
		 */
		EClass VAR2_SPEC_INIT_DECL = eINSTANCE.getVar2SpecInitDecl();

		/**
		 * The meta object literal for the '<em><b>Spec Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR2_SPEC_INIT_DECL__SPEC_INIT = eINSTANCE.getVar2SpecInitDecl_SpecInit();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ProgramAccessDeclarationImpl <em>Program Access Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ProgramAccessDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getProgramAccessDeclaration()
		 * @generated
		 */
		EClass PROGRAM_ACCESS_DECLARATION = eINSTANCE.getProgramAccessDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_ACCESS_DECLARATION__TYPE = eINSTANCE.getProgramAccessDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_ACCESS_DECLARATION__VARIABLE = eINSTANCE.getProgramAccessDeclaration_Variable();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_ACCESS_DECLARATION__DIRECTION = eINSTANCE.getProgramAccessDeclaration_Direction();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.FBInstanceImpl <em>FB Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.FBInstanceImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getFBInstance()
		 * @generated
		 */
		EClass FB_INSTANCE = eINSTANCE.getFBInstance();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FB_INSTANCE__INIT = eINSTANCE.getFBInstance_Init();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FB_INSTANCE__TYPE = eINSTANCE.getFBInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Function Block Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FB_INSTANCE__FUNCTION_BLOCK_TYPE = eINSTANCE.getFBInstance_FunctionBlockType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ExternalVarDeclarationImpl <em>External Var Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ExternalVarDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getExternalVarDeclaration()
		 * @generated
		 */
		EClass EXTERNAL_VAR_DECLARATION = eINSTANCE.getExternalVarDeclaration();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_VAR_DECLARATION__VARIABLE_NAME = eINSTANCE.getExternalVarDeclaration_VariableName();

		/**
		 * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_VAR_DECLARATION__SPEC = eINSTANCE.getExternalVarDeclaration_Spec();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ArrayStructVarSpecImpl <em>Array Struct Var Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ArrayStructVarSpecImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getArrayStructVarSpec()
		 * @generated
		 */
		EClass ARRAY_STRUCT_VAR_SPEC = eINSTANCE.getArrayStructVarSpec();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_STRUCT_VAR_SPEC__VARIABLE_NAME = eINSTANCE.getArrayStructVarSpec_VariableName();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SharedVarSpecImpl <em>Shared Var Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SharedVarSpecImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getSharedVarSpec()
		 * @generated
		 */
		EClass SHARED_VAR_SPEC = eINSTANCE.getSharedVarSpec();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SingleByteStringVarImpl <em>Single Byte String Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SingleByteStringVarImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getSingleByteStringVar()
		 * @generated
		 */
		EClass SINGLE_BYTE_STRING_VAR = eINSTANCE.getSingleByteStringVar();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SingleByteStringSpecImpl <em>Single Byte String Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SingleByteStringSpecImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getSingleByteStringSpec()
		 * @generated
		 */
		EClass SINGLE_BYTE_STRING_SPEC = eINSTANCE.getSingleByteStringSpec();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.StringVariableImpl <em>String Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.StringVariableImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getStringVariable()
		 * @generated
		 */
		EClass STRING_VARIABLE = eINSTANCE.getStringVariable();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_VARIABLE__LENGTH = eINSTANCE.getStringVariable_Length();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DoubleByteStringSpecImpl <em>Double Byte String Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DoubleByteStringSpecImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getDoubleByteStringSpec()
		 * @generated
		 */
		EClass DOUBLE_BYTE_STRING_SPEC = eINSTANCE.getDoubleByteStringSpec();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DoubleByteStringVarImpl <em>Double Byte String Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DoubleByteStringVarImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getDoubleByteStringVar()
		 * @generated
		 */
		EClass DOUBLE_BYTE_STRING_VAR = eINSTANCE.getDoubleByteStringVar();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.AccessDeclarationImpl <em>Access Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.AccessDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getAccessDeclaration()
		 * @generated
		 */
		EClass ACCESS_DECLARATION = eINSTANCE.getAccessDeclaration();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_DECLARATION__DIRECTION = eINSTANCE.getAccessDeclaration_Direction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_DECLARATION__TYPE = eINSTANCE.getAccessDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Resource Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_DECLARATION__RESOURCE_REF = eINSTANCE.getAccessDeclaration_ResourceRef();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SymbolicAccessPathImpl <em>Symbolic Access Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SymbolicAccessPathImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getSymbolicAccessPath()
		 * @generated
		 */
		EClass SYMBOLIC_ACCESS_PATH = eINSTANCE.getSymbolicAccessPath();

		/**
		 * The meta object literal for the '<em><b>Fb Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOLIC_ACCESS_PATH__FB_REF = eINSTANCE.getSymbolicAccessPath_FbRef();

		/**
		 * The meta object literal for the '<em><b>Program Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOLIC_ACCESS_PATH__PROGRAM_REF = eINSTANCE.getSymbolicAccessPath_ProgramRef();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOLIC_ACCESS_PATH__VARIABLE = eINSTANCE.getSymbolicAccessPath_Variable();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificVarInitImpl <em>Instance Specific Var Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificVarInitImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getInstanceSpecificVarInit()
		 * @generated
		 */
		EClass INSTANCE_SPECIFIC_VAR_INIT = eINSTANCE.getInstanceSpecificVarInit();

		/**
		 * The meta object literal for the '<em><b>Resource Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_SPECIFIC_VAR_INIT__RESOURCE_REF = eINSTANCE.getInstanceSpecificVarInit_ResourceRef();

		/**
		 * The meta object literal for the '<em><b>Program Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_SPECIFIC_VAR_INIT__PROGRAM_REF = eINSTANCE.getInstanceSpecificVarInit_ProgramRef();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificVariableImpl <em>Instance Specific Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificVariableImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getInstanceSpecificVariable()
		 * @generated
		 */
		EClass INSTANCE_SPECIFIC_VARIABLE = eINSTANCE.getInstanceSpecificVariable();

		/**
		 * The meta object literal for the '<em><b>Variable Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_SPECIFIC_VARIABLE__VARIABLE_REF = eINSTANCE.getInstanceSpecificVariable_VariableRef();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_SPECIFIC_VARIABLE__LOCATION = eINSTANCE.getInstanceSpecificVariable_Location();

		/**
		 * The meta object literal for the '<em><b>Specinit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_SPECIFIC_VARIABLE__SPECINIT = eINSTANCE.getInstanceSpecificVariable_Specinit();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificFBImpl <em>Instance Specific FB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificFBImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getInstanceSpecificFB()
		 * @generated
		 */
		EClass INSTANCE_SPECIFIC_FB = eINSTANCE.getInstanceSpecificFB();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_SPECIFIC_FB__INIT = eINSTANCE.getInstanceSpecificFB_Init();

		/**
		 * The meta object literal for the '<em><b>Fb Instance Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_SPECIFIC_FB__FB_INSTANCE_REF = eINSTANCE.getInstanceSpecificFB_FbInstanceRef();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ExternalVarSpecImpl <em>External Var Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ExternalVarSpecImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getExternalVarSpec()
		 * @generated
		 */
		EClass EXTERNAL_VAR_SPEC = eINSTANCE.getExternalVarSpec();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.GlobalVarSpecInitImpl <em>Global Var Spec Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.GlobalVarSpecInitImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getGlobalVarSpecInit()
		 * @generated
		 */
		EClass GLOBAL_VAR_SPEC_INIT = eINSTANCE.getGlobalVarSpecInit();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificSpecInit <em>Instance Specific Spec Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificSpecInit
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getInstanceSpecificSpecInit()
		 * @generated
		 */
		EClass INSTANCE_SPECIFIC_SPEC_INIT = eINSTANCE.getInstanceSpecificSpecInit();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInit <em>Var2 Spec Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInit
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVar2SpecInit()
		 * @generated
		 */
		EClass VAR2_SPEC_INIT = eINSTANCE.getVar2SpecInit();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInit <em>Var1 Spec Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInit
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVar1SpecInit()
		 * @generated
		 */
		EClass VAR1_SPEC_INIT = eINSTANCE.getVar1SpecInit();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.NamedVariableDeclarationImpl <em>Named Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.NamedVariableDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getNamedVariableDeclaration()
		 * @generated
		 */
		EClass NAMED_VARIABLE_DECLARATION = eINSTANCE.getNamedVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_VARIABLE_DECLARATION__VARIABLE_NAME = eINSTANCE.getNamedVariableDeclaration_VariableName();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedVarSpecInitImpl <em>Located Var Spec Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.LocatedVarSpecInitImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getLocatedVarSpecInit()
		 * @generated
		 */
		EClass LOCATED_VAR_SPEC_INIT = eINSTANCE.getLocatedVarSpecInit();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Specification <em>Var1 Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Specification
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVar1Specification()
		 * @generated
		 */
		EClass VAR1_SPECIFICATION = eINSTANCE.getVar1Specification();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationType <em>Var Declaration Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationType
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getVarDeclarationType()
		 * @generated
		 */
		EEnum VAR_DECLARATION_TYPE = eINSTANCE.getVarDeclarationType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeType <em>Edge Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeType
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getEdgeType()
		 * @generated
		 */
		EEnum EDGE_TYPE = eINSTANCE.getEdgeType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalAttribute <em>Global Attribute</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalAttribute
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getGlobalAttribute()
		 * @generated
		 */
		EEnum GLOBAL_ATTRIBUTE = eINSTANCE.getGlobalAttribute();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.Direction
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

	}

} //DeclarationsPackage
