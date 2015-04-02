/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage;

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
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFactory
 * @model kind="package"
 * @generated
 */
public interface IlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "il";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iem.fraunhofer.de/m4a/iec61131/1.0/languages/il";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IlPackage eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.InstructionListImpl <em>Instruction List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.InstructionListImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getInstructionList()
	 * @generated
	 */
	int INSTRUCTION_LIST = 0;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_LIST__INSTRUCTION = PousPackage.FUNCTION_BODY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instruction List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_LIST_FEATURE_COUNT = PousPackage.FUNCTION_BODY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instruction List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_LIST_OPERATION_COUNT = PousPackage.FUNCTION_BODY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.Instruction <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.Instruction
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperation <em>Simple Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperation
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getSimpleOperation()
	 * @generated
	 */
	int SIMPLE_OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION__LABEL = INSTRUCTION__LABEL;

	/**
	 * The number of structural features of the '<em>Simple Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.JumpOperationImpl <em>Jump Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.JumpOperationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getJumpOperation()
	 * @generated
	 */
	int JUMP_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_OPERATION__LABEL = INSTRUCTION__LABEL;

	/**
	 * The feature id for the '<em><b>Jump Operator Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_OPERATION__JUMP_OPERATOR_LABEL = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jump Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_OPERATION__JUMP_OPERATOR = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Jump Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_OPERATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Jump Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_OPERATION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlExpressionImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getIlExpression()
	 * @generated
	 */
	int IL_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_EXPRESSION__LABEL = INSTRUCTION__LABEL;

	/**
	 * The feature id for the '<em><b>Expr Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_EXPRESSION__EXPR_OPERATOR = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_EXPRESSION__OPERAND = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Simple Instruction List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_EXPRESSION__SIMPLE_INSTRUCTION_LIST = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_EXPRESSION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_EXPRESSION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlFBCallImpl <em>FB Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlFBCallImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getIlFBCall()
	 * @generated
	 */
	int IL_FB_CALL = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_FB_CALL__LABEL = INSTRUCTION__LABEL;

	/**
	 * The feature id for the '<em><b>Call Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_FB_CALL__CALL_OPERATOR = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fb Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_FB_CALL__FB_NAME = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fb Call Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_FB_CALL__FB_CALL_PARAM = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>FB Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_FB_CALL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>FB Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_FB_CALL_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlFormalFunctCallImpl <em>Formal Funct Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlFormalFunctCallImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getIlFormalFunctCall()
	 * @generated
	 */
	int IL_FORMAL_FUNCT_CALL = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_FORMAL_FUNCT_CALL__LABEL = INSTRUCTION__LABEL;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_FORMAL_FUNCT_CALL__FUNCTION_NAME = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Param List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_FORMAL_FUNCT_CALL__PARAM_LIST = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Formal Funct Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_FORMAL_FUNCT_CALL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Formal Funct Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_FORMAL_FUNCT_CALL_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.ReturnOperatorPlaceHolderImpl <em>Return Operator Place Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.ReturnOperatorPlaceHolderImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getReturnOperatorPlaceHolder()
	 * @generated
	 */
	int RETURN_OPERATOR_PLACE_HOLDER = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATOR_PLACE_HOLDER__LABEL = INSTRUCTION__LABEL;

	/**
	 * The feature id for the '<em><b>Return Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATOR_PLACE_HOLDER__RETURN_OPERATOR = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Operator Place Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATOR_PLACE_HOLDER_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return Operator Place Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATOR_PLACE_HOLDER_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamAssignmentOperand <em>Param Assignment Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamAssignmentOperand
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getParamAssignmentOperand()
	 * @generated
	 */
	int PARAM_ASSIGNMENT_OPERAND = 13;

	/**
	 * The number of structural features of the '<em>Param Assignment Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_ASSIGNMENT_OPERAND_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Param Assignment Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_ASSIGNMENT_OPERAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.Operand <em>Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.Operand
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getOperand()
	 * @generated
	 */
	int OPERAND = 8;

	/**
	 * The number of structural features of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_FEATURE_COUNT = PARAM_ASSIGNMENT_OPERAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_OPERATION_COUNT = PARAM_ASSIGNMENT_OPERAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleInstruction <em>Simple Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleInstruction
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getSimpleInstruction()
	 * @generated
	 */
	int SIMPLE_INSTRUCTION = 9;

	/**
	 * The number of structural features of the '<em>Simple Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTRUCTION_FEATURE_COUNT = PARAM_ASSIGNMENT_OPERAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INSTRUCTION_OPERATION_COUNT = PARAM_ASSIGNMENT_OPERAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamInstruction <em>Param Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamInstruction
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getParamInstruction()
	 * @generated
	 */
	int PARAM_INSTRUCTION = 10;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_INSTRUCTION__VARIABLE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Param Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_INSTRUCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Param Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlParamAssignmentImpl <em>Param Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlParamAssignmentImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getIlParamAssignment()
	 * @generated
	 */
	int IL_PARAM_ASSIGNMENT = 11;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_PARAM_ASSIGNMENT__VARIABLE_NAME = PARAM_INSTRUCTION__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_PARAM_ASSIGNMENT__OPERAND = PARAM_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Param Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_PARAM_ASSIGNMENT_FEATURE_COUNT = PARAM_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Param Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_PARAM_ASSIGNMENT_OPERATION_COUNT = PARAM_INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlParamOutAssignmentImpl <em>Param Out Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlParamOutAssignmentImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getIlParamOutAssignment()
	 * @generated
	 */
	int IL_PARAM_OUT_ASSIGNMENT = 12;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_PARAM_OUT_ASSIGNMENT__VARIABLE_NAME = PARAM_INSTRUCTION__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>NOT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_PARAM_OUT_ASSIGNMENT__NOT = PARAM_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_PARAM_OUT_ASSIGNMENT__VARIABLE = PARAM_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Param Out Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_PARAM_OUT_ASSIGNMENT_FEATURE_COUNT = PARAM_INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Param Out Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_PARAM_OUT_ASSIGNMENT_OPERATION_COUNT = PARAM_INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.FBCallParamPlaceHolder <em>FB Call Param Place Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.FBCallParamPlaceHolder
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getFBCallParamPlaceHolder()
	 * @generated
	 */
	int FB_CALL_PARAM_PLACE_HOLDER = 16;

	/**
	 * The number of structural features of the '<em>FB Call Param Place Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_CALL_PARAM_PLACE_HOLDER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>FB Call Param Place Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_CALL_PARAM_PLACE_HOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.ParamListImpl <em>Param List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.ParamListImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getParamList()
	 * @generated
	 */
	int PARAM_LIST = 14;

	/**
	 * The feature id for the '<em><b>Param Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_LIST__PARAM_INSTRUCTIONS = FB_CALL_PARAM_PLACE_HOLDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Param List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_LIST_FEATURE_COUNT = FB_CALL_PARAM_PLACE_HOLDER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Param List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_LIST_OPERATION_COUNT = FB_CALL_PARAM_PLACE_HOLDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.OperandListImpl <em>Operand List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.OperandListImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getOperandList()
	 * @generated
	 */
	int OPERAND_LIST = 15;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_LIST__OPERANDS = FB_CALL_PARAM_PLACE_HOLDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operand List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_LIST_FEATURE_COUNT = FB_CALL_PARAM_PLACE_HOLDER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operand List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_LIST_OPERATION_COUNT = FB_CALL_PARAM_PLACE_HOLDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlLabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlLabelImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getIlLabel()
	 * @generated
	 */
	int IL_LABEL = 17;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_LABEL__IDENTIFIER = LiteralsPackage.NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_LABEL_FEATURE_COUNT = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IL_LABEL_OPERATION_COUNT = LiteralsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.OperandConstantImpl <em>Operand Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.OperandConstantImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getOperandConstant()
	 * @generated
	 */
	int OPERAND_CONSTANT = 18;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_CONSTANT__CONSTANT = OPERAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operand Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_CONSTANT_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operand Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_CONSTANT_OPERATION_COUNT = OPERAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.OperandEnumeratedValueImpl <em>Operand Enumerated Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.OperandEnumeratedValueImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getOperandEnumeratedValue()
	 * @generated
	 */
	int OPERAND_ENUMERATED_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Enumerated Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_ENUMERATED_VALUE__ENUMERATED_VALUE = OPERAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operand Enumerated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_ENUMERATED_VALUE_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operand Enumerated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_ENUMERATED_VALUE_OPERATION_COUNT = OPERAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.OperandVariableImpl <em>Operand Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.OperandVariableImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getOperandVariable()
	 * @generated
	 */
	int OPERAND_VARIABLE = 20;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_VARIABLE__VARIABLE = OPERAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operand Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_VARIABLE_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operand Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_VARIABLE_OPERATION_COUNT = OPERAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.SimpleOperationOperandImpl <em>Simple Operation Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.SimpleOperationOperandImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getSimpleOperationOperand()
	 * @generated
	 */
	int SIMPLE_OPERATION_OPERAND = 21;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_OPERAND__LABEL = SIMPLE_OPERATION__LABEL;

	/**
	 * The feature id for the '<em><b>Simple Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_OPERAND__SIMPLE_OPERATOR = SIMPLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expr Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_OPERAND__EXPR_OPERATOR = SIMPLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_OPERAND__OPERAND = SIMPLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Simple Operation Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_OPERAND_FEATURE_COUNT = SIMPLE_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Simple Operation Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_OPERAND_OPERATION_COUNT = SIMPLE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.SimpleOperationFunctionImpl <em>Simple Operation Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.SimpleOperationFunctionImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getSimpleOperationFunction()
	 * @generated
	 */
	int SIMPLE_OPERATION_FUNCTION = 22;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_FUNCTION__LABEL = SIMPLE_OPERATION__LABEL;

	/**
	 * The feature id for the '<em><b>Operand List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_FUNCTION__OPERAND_LIST = SIMPLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_FUNCTION__FUNCTION_NAME = SIMPLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Operation Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_FUNCTION_FEATURE_COUNT = SIMPLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Simple Operation Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_FUNCTION_OPERATION_COUNT = SIMPLE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperator <em>Simple Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperator
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getSimpleOperator()
	 * @generated
	 */
	int SIMPLE_OPERATOR = 23;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ExprOperator <em>Expr Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ExprOperator
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getExprOperator()
	 * @generated
	 */
	int EXPR_OPERATOR = 24;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperator <em>Jump Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperator
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getJumpOperator()
	 * @generated
	 */
	int JUMP_OPERATOR = 25;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.CallOperator <em>Call Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.CallOperator
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getCallOperator()
	 * @generated
	 */
	int CALL_OPERATOR = 26;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperator <em>Return Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperator
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getReturnOperator()
	 * @generated
	 */
	int RETURN_OPERATOR = 27;


	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.InstructionList <em>Instruction List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction List</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.InstructionList
	 * @generated
	 */
	EClass getInstructionList();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.InstructionList#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instruction</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.InstructionList#getInstruction()
	 * @see #getInstructionList()
	 * @generated
	 */
	EReference getInstructionList_Instruction();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.Instruction#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.Instruction#getLabel()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Label();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperation <em>Simple Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Operation</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperation
	 * @generated
	 */
	EClass getSimpleOperation();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperation <em>Jump Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump Operation</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperation
	 * @generated
	 */
	EClass getJumpOperation();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperation#getJumpOperatorLabel <em>Jump Operator Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jump Operator Label</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperation#getJumpOperatorLabel()
	 * @see #getJumpOperation()
	 * @generated
	 */
	EReference getJumpOperation_JumpOperatorLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperation#getJumpOperator <em>Jump Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jump Operator</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperation#getJumpOperator()
	 * @see #getJumpOperation()
	 * @generated
	 */
	EAttribute getJumpOperation_JumpOperator();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlExpression
	 * @generated
	 */
	EClass getIlExpression();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlExpression#getExprOperator <em>Expr Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr Operator</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlExpression#getExprOperator()
	 * @see #getIlExpression()
	 * @generated
	 */
	EAttribute getIlExpression_ExprOperator();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlExpression#getOperand()
	 * @see #getIlExpression()
	 * @generated
	 */
	EReference getIlExpression_Operand();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlExpression#getSimpleInstructionList <em>Simple Instruction List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Instruction List</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlExpression#getSimpleInstructionList()
	 * @see #getIlExpression()
	 * @generated
	 */
	EReference getIlExpression_SimpleInstructionList();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFBCall <em>FB Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FB Call</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFBCall
	 * @generated
	 */
	EClass getIlFBCall();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFBCall#getCallOperator <em>Call Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Operator</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFBCall#getCallOperator()
	 * @see #getIlFBCall()
	 * @generated
	 */
	EAttribute getIlFBCall_CallOperator();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFBCall#getFbName <em>Fb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fb Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFBCall#getFbName()
	 * @see #getIlFBCall()
	 * @generated
	 */
	EReference getIlFBCall_FbName();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFBCall#getFbCallParam <em>Fb Call Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fb Call Param</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFBCall#getFbCallParam()
	 * @see #getIlFBCall()
	 * @generated
	 */
	EReference getIlFBCall_FbCallParam();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFormalFunctCall <em>Formal Funct Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Funct Call</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFormalFunctCall
	 * @generated
	 */
	EClass getIlFormalFunctCall();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFormalFunctCall#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFormalFunctCall#getFunctionName()
	 * @see #getIlFormalFunctCall()
	 * @generated
	 */
	EReference getIlFormalFunctCall_FunctionName();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFormalFunctCall#getParamList <em>Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param List</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFormalFunctCall#getParamList()
	 * @see #getIlFormalFunctCall()
	 * @generated
	 */
	EReference getIlFormalFunctCall_ParamList();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperatorPlaceHolder <em>Return Operator Place Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Operator Place Holder</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperatorPlaceHolder
	 * @generated
	 */
	EClass getReturnOperatorPlaceHolder();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperatorPlaceHolder#getReturnOperator <em>Return Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Operator</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperatorPlaceHolder#getReturnOperator()
	 * @see #getReturnOperatorPlaceHolder()
	 * @generated
	 */
	EAttribute getReturnOperatorPlaceHolder_ReturnOperator();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.Operand
	 * @generated
	 */
	EClass getOperand();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleInstruction <em>Simple Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Instruction</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleInstruction
	 * @generated
	 */
	EClass getSimpleInstruction();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamInstruction <em>Param Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Instruction</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamInstruction
	 * @generated
	 */
	EClass getParamInstruction();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamInstruction#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamInstruction#getVariableName()
	 * @see #getParamInstruction()
	 * @generated
	 */
	EReference getParamInstruction_VariableName();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamAssignment <em>Param Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Assignment</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamAssignment
	 * @generated
	 */
	EClass getIlParamAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamAssignment#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamAssignment#getOperand()
	 * @see #getIlParamAssignment()
	 * @generated
	 */
	EReference getIlParamAssignment_Operand();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamOutAssignment <em>Param Out Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Out Assignment</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamOutAssignment
	 * @generated
	 */
	EClass getIlParamOutAssignment();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamOutAssignment#isNOT <em>NOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NOT</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamOutAssignment#isNOT()
	 * @see #getIlParamOutAssignment()
	 * @generated
	 */
	EAttribute getIlParamOutAssignment_NOT();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamOutAssignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamOutAssignment#getVariable()
	 * @see #getIlParamOutAssignment()
	 * @generated
	 */
	EReference getIlParamOutAssignment_Variable();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamAssignmentOperand <em>Param Assignment Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Assignment Operand</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamAssignmentOperand
	 * @generated
	 */
	EClass getParamAssignmentOperand();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamList <em>Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param List</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamList
	 * @generated
	 */
	EClass getParamList();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamList#getParamInstructions <em>Param Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param Instructions</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamList#getParamInstructions()
	 * @see #getParamList()
	 * @generated
	 */
	EReference getParamList_ParamInstructions();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandList <em>Operand List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand List</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandList
	 * @generated
	 */
	EClass getOperandList();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandList#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandList#getOperands()
	 * @see #getOperandList()
	 * @generated
	 */
	EReference getOperandList_Operands();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.FBCallParamPlaceHolder <em>FB Call Param Place Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FB Call Param Place Holder</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.FBCallParamPlaceHolder
	 * @generated
	 */
	EClass getFBCallParamPlaceHolder();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlLabel
	 * @generated
	 */
	EClass getIlLabel();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandConstant <em>Operand Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand Constant</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandConstant
	 * @generated
	 */
	EClass getOperandConstant();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandConstant#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandConstant#getConstant()
	 * @see #getOperandConstant()
	 * @generated
	 */
	EReference getOperandConstant_Constant();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandEnumeratedValue <em>Operand Enumerated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand Enumerated Value</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandEnumeratedValue
	 * @generated
	 */
	EClass getOperandEnumeratedValue();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandEnumeratedValue#getEnumeratedValue <em>Enumerated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumerated Value</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandEnumeratedValue#getEnumeratedValue()
	 * @see #getOperandEnumeratedValue()
	 * @generated
	 */
	EReference getOperandEnumeratedValue_EnumeratedValue();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandVariable <em>Operand Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandVariable
	 * @generated
	 */
	EClass getOperandVariable();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandVariable#getVariable()
	 * @see #getOperandVariable()
	 * @generated
	 */
	EReference getOperandVariable_Variable();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationOperand <em>Simple Operation Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Operation Operand</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationOperand
	 * @generated
	 */
	EClass getSimpleOperationOperand();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationOperand#getSimpleOperator <em>Simple Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Operator</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationOperand#getSimpleOperator()
	 * @see #getSimpleOperationOperand()
	 * @generated
	 */
	EAttribute getSimpleOperationOperand_SimpleOperator();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationOperand#getExprOperator <em>Expr Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr Operator</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationOperand#getExprOperator()
	 * @see #getSimpleOperationOperand()
	 * @generated
	 */
	EAttribute getSimpleOperationOperand_ExprOperator();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationOperand#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationOperand#getOperand()
	 * @see #getSimpleOperationOperand()
	 * @generated
	 */
	EReference getSimpleOperationOperand_Operand();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationFunction <em>Simple Operation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Operation Function</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationFunction
	 * @generated
	 */
	EClass getSimpleOperationFunction();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationFunction#getOperandList <em>Operand List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand List</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationFunction#getOperandList()
	 * @see #getSimpleOperationFunction()
	 * @generated
	 */
	EReference getSimpleOperationFunction_OperandList();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationFunction#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationFunction#getFunctionName()
	 * @see #getSimpleOperationFunction()
	 * @generated
	 */
	EReference getSimpleOperationFunction_FunctionName();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperator <em>Simple Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simple Operator</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperator
	 * @generated
	 */
	EEnum getSimpleOperator();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ExprOperator <em>Expr Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expr Operator</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ExprOperator
	 * @generated
	 */
	EEnum getExprOperator();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperator <em>Jump Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Jump Operator</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperator
	 * @generated
	 */
	EEnum getJumpOperator();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.CallOperator <em>Call Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Call Operator</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.CallOperator
	 * @generated
	 */
	EEnum getCallOperator();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperator <em>Return Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Return Operator</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperator
	 * @generated
	 */
	EEnum getReturnOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IlFactory getIlFactory();

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
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.InstructionListImpl <em>Instruction List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.InstructionListImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getInstructionList()
		 * @generated
		 */
		EClass INSTRUCTION_LIST = eINSTANCE.getInstructionList();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_LIST__INSTRUCTION = eINSTANCE.getInstructionList_Instruction();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.Instruction <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.Instruction
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__LABEL = eINSTANCE.getInstruction_Label();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperation <em>Simple Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperation
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getSimpleOperation()
		 * @generated
		 */
		EClass SIMPLE_OPERATION = eINSTANCE.getSimpleOperation();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.JumpOperationImpl <em>Jump Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.JumpOperationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getJumpOperation()
		 * @generated
		 */
		EClass JUMP_OPERATION = eINSTANCE.getJumpOperation();

		/**
		 * The meta object literal for the '<em><b>Jump Operator Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP_OPERATION__JUMP_OPERATOR_LABEL = eINSTANCE.getJumpOperation_JumpOperatorLabel();

		/**
		 * The meta object literal for the '<em><b>Jump Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUMP_OPERATION__JUMP_OPERATOR = eINSTANCE.getJumpOperation_JumpOperator();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlExpressionImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getIlExpression()
		 * @generated
		 */
		EClass IL_EXPRESSION = eINSTANCE.getIlExpression();

		/**
		 * The meta object literal for the '<em><b>Expr Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IL_EXPRESSION__EXPR_OPERATOR = eINSTANCE.getIlExpression_ExprOperator();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IL_EXPRESSION__OPERAND = eINSTANCE.getIlExpression_Operand();

		/**
		 * The meta object literal for the '<em><b>Simple Instruction List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IL_EXPRESSION__SIMPLE_INSTRUCTION_LIST = eINSTANCE.getIlExpression_SimpleInstructionList();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlFBCallImpl <em>FB Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlFBCallImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getIlFBCall()
		 * @generated
		 */
		EClass IL_FB_CALL = eINSTANCE.getIlFBCall();

		/**
		 * The meta object literal for the '<em><b>Call Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IL_FB_CALL__CALL_OPERATOR = eINSTANCE.getIlFBCall_CallOperator();

		/**
		 * The meta object literal for the '<em><b>Fb Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IL_FB_CALL__FB_NAME = eINSTANCE.getIlFBCall_FbName();

		/**
		 * The meta object literal for the '<em><b>Fb Call Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IL_FB_CALL__FB_CALL_PARAM = eINSTANCE.getIlFBCall_FbCallParam();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlFormalFunctCallImpl <em>Formal Funct Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlFormalFunctCallImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getIlFormalFunctCall()
		 * @generated
		 */
		EClass IL_FORMAL_FUNCT_CALL = eINSTANCE.getIlFormalFunctCall();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IL_FORMAL_FUNCT_CALL__FUNCTION_NAME = eINSTANCE.getIlFormalFunctCall_FunctionName();

		/**
		 * The meta object literal for the '<em><b>Param List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IL_FORMAL_FUNCT_CALL__PARAM_LIST = eINSTANCE.getIlFormalFunctCall_ParamList();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.ReturnOperatorPlaceHolderImpl <em>Return Operator Place Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.ReturnOperatorPlaceHolderImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getReturnOperatorPlaceHolder()
		 * @generated
		 */
		EClass RETURN_OPERATOR_PLACE_HOLDER = eINSTANCE.getReturnOperatorPlaceHolder();

		/**
		 * The meta object literal for the '<em><b>Return Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_OPERATOR_PLACE_HOLDER__RETURN_OPERATOR = eINSTANCE.getReturnOperatorPlaceHolder_ReturnOperator();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.Operand <em>Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.Operand
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getOperand()
		 * @generated
		 */
		EClass OPERAND = eINSTANCE.getOperand();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleInstruction <em>Simple Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleInstruction
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getSimpleInstruction()
		 * @generated
		 */
		EClass SIMPLE_INSTRUCTION = eINSTANCE.getSimpleInstruction();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamInstruction <em>Param Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamInstruction
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getParamInstruction()
		 * @generated
		 */
		EClass PARAM_INSTRUCTION = eINSTANCE.getParamInstruction();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_INSTRUCTION__VARIABLE_NAME = eINSTANCE.getParamInstruction_VariableName();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlParamAssignmentImpl <em>Param Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlParamAssignmentImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getIlParamAssignment()
		 * @generated
		 */
		EClass IL_PARAM_ASSIGNMENT = eINSTANCE.getIlParamAssignment();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IL_PARAM_ASSIGNMENT__OPERAND = eINSTANCE.getIlParamAssignment_Operand();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlParamOutAssignmentImpl <em>Param Out Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlParamOutAssignmentImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getIlParamOutAssignment()
		 * @generated
		 */
		EClass IL_PARAM_OUT_ASSIGNMENT = eINSTANCE.getIlParamOutAssignment();

		/**
		 * The meta object literal for the '<em><b>NOT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IL_PARAM_OUT_ASSIGNMENT__NOT = eINSTANCE.getIlParamOutAssignment_NOT();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IL_PARAM_OUT_ASSIGNMENT__VARIABLE = eINSTANCE.getIlParamOutAssignment_Variable();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamAssignmentOperand <em>Param Assignment Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamAssignmentOperand
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getParamAssignmentOperand()
		 * @generated
		 */
		EClass PARAM_ASSIGNMENT_OPERAND = eINSTANCE.getParamAssignmentOperand();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.ParamListImpl <em>Param List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.ParamListImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getParamList()
		 * @generated
		 */
		EClass PARAM_LIST = eINSTANCE.getParamList();

		/**
		 * The meta object literal for the '<em><b>Param Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_LIST__PARAM_INSTRUCTIONS = eINSTANCE.getParamList_ParamInstructions();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.OperandListImpl <em>Operand List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.OperandListImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getOperandList()
		 * @generated
		 */
		EClass OPERAND_LIST = eINSTANCE.getOperandList();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERAND_LIST__OPERANDS = eINSTANCE.getOperandList_Operands();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.FBCallParamPlaceHolder <em>FB Call Param Place Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.FBCallParamPlaceHolder
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getFBCallParamPlaceHolder()
		 * @generated
		 */
		EClass FB_CALL_PARAM_PLACE_HOLDER = eINSTANCE.getFBCallParamPlaceHolder();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlLabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlLabelImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getIlLabel()
		 * @generated
		 */
		EClass IL_LABEL = eINSTANCE.getIlLabel();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.OperandConstantImpl <em>Operand Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.OperandConstantImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getOperandConstant()
		 * @generated
		 */
		EClass OPERAND_CONSTANT = eINSTANCE.getOperandConstant();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERAND_CONSTANT__CONSTANT = eINSTANCE.getOperandConstant_Constant();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.OperandEnumeratedValueImpl <em>Operand Enumerated Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.OperandEnumeratedValueImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getOperandEnumeratedValue()
		 * @generated
		 */
		EClass OPERAND_ENUMERATED_VALUE = eINSTANCE.getOperandEnumeratedValue();

		/**
		 * The meta object literal for the '<em><b>Enumerated Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERAND_ENUMERATED_VALUE__ENUMERATED_VALUE = eINSTANCE.getOperandEnumeratedValue_EnumeratedValue();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.OperandVariableImpl <em>Operand Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.OperandVariableImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getOperandVariable()
		 * @generated
		 */
		EClass OPERAND_VARIABLE = eINSTANCE.getOperandVariable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERAND_VARIABLE__VARIABLE = eINSTANCE.getOperandVariable_Variable();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.SimpleOperationOperandImpl <em>Simple Operation Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.SimpleOperationOperandImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getSimpleOperationOperand()
		 * @generated
		 */
		EClass SIMPLE_OPERATION_OPERAND = eINSTANCE.getSimpleOperationOperand();

		/**
		 * The meta object literal for the '<em><b>Simple Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_OPERATION_OPERAND__SIMPLE_OPERATOR = eINSTANCE.getSimpleOperationOperand_SimpleOperator();

		/**
		 * The meta object literal for the '<em><b>Expr Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_OPERATION_OPERAND__EXPR_OPERATOR = eINSTANCE.getSimpleOperationOperand_ExprOperator();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_OPERATION_OPERAND__OPERAND = eINSTANCE.getSimpleOperationOperand_Operand();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.SimpleOperationFunctionImpl <em>Simple Operation Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.SimpleOperationFunctionImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getSimpleOperationFunction()
		 * @generated
		 */
		EClass SIMPLE_OPERATION_FUNCTION = eINSTANCE.getSimpleOperationFunction();

		/**
		 * The meta object literal for the '<em><b>Operand List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_OPERATION_FUNCTION__OPERAND_LIST = eINSTANCE.getSimpleOperationFunction_OperandList();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_OPERATION_FUNCTION__FUNCTION_NAME = eINSTANCE.getSimpleOperationFunction_FunctionName();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperator <em>Simple Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperator
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getSimpleOperator()
		 * @generated
		 */
		EEnum SIMPLE_OPERATOR = eINSTANCE.getSimpleOperator();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ExprOperator <em>Expr Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ExprOperator
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getExprOperator()
		 * @generated
		 */
		EEnum EXPR_OPERATOR = eINSTANCE.getExprOperator();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperator <em>Jump Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperator
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getJumpOperator()
		 * @generated
		 */
		EEnum JUMP_OPERATOR = eINSTANCE.getJumpOperator();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.CallOperator <em>Call Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.CallOperator
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getCallOperator()
		 * @generated
		 */
		EEnum CALL_OPERATOR = eINSTANCE.getCallOperator();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperator <em>Return Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperator
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl#getReturnOperator()
		 * @generated
		 */
		EEnum RETURN_OPERATOR = eINSTANCE.getReturnOperator();

	}

} //IlPackage
