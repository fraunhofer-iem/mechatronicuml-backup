/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * contains language constructs of structured text, addon package to the core package for modeling st programs
 * <!-- end-model-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StFactory
 * @model kind="package"
 * @generated
 */
public interface StPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "st";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iem.fraunhofer.de/m4a/iec61131/1.0/languages/st";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "st";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StPackage eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpressionValue <em>Primary Expression Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpressionValue
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getPrimaryExpressionValue()
	 * @generated
	 */
	int PRIMARY_EXPRESSION_VALUE = 4;

	/**
	 * The number of structural features of the '<em>Primary Expression Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_EXPRESSION_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Primary Expression Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_EXPRESSION_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ExpressionImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OPERATOR = PRIMARY_EXPRESSION_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = PRIMARY_EXPRESSION_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.OperatorImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OPERAND = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.PrimaryExpressionImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getPrimaryExpression()
	 * @generated
	 */
	int PRIMARY_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_EXPRESSION__OPERATOR = EXPRESSION__OPERATOR;

	/**
	 * The feature id for the '<em><b>Unary Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_EXPRESSION__UNARY_OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Primary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.UnaryOperatorImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 3;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR__OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.FunctionInvocationImpl <em>Function Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.FunctionInvocationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getFunctionInvocation()
	 * @generated
	 */
	int FUNCTION_INVOCATION = 5;

	/**
	 * The feature id for the '<em><b>Param Assignment List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOCATION__PARAM_ASSIGNMENT_LIST = PRIMARY_EXPRESSION_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOCATION__FUNCTION = PRIMARY_EXPRESSION_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOCATION_FEATURE_COUNT = PRIMARY_EXPRESSION_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INVOCATION_OPERATION_COUNT = PRIMARY_EXPRESSION_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamAssignment <em>Param Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamAssignment
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getParamAssignment()
	 * @generated
	 */
	int PARAM_ASSIGNMENT = 6;

	/**
	 * The number of structural features of the '<em>Param Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_ASSIGNMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Param Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StatementListImpl <em>Statement List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StatementListImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getStatementList()
	 * @generated
	 */
	int STATEMENT_LIST = 7;

	/**
	 * The feature id for the '<em><b>Statments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST__STATMENTS = PousPackage.FUNCTION_BODY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statement List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST_FEATURE_COUNT = PousPackage.FUNCTION_BODY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Statement List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LIST_OPERATION_COUNT = PousPackage.FUNCTION_BODY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Statement <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.Statement
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 8;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.AssignmentStatementImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getAssignmentStatement()
	 * @generated
	 */
	int ASSIGNMENT_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT__VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.SubprogramControlStatement <em>Subprogram Control Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.SubprogramControlStatement
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getSubprogramControlStatement()
	 * @generated
	 */
	int SUBPROGRAM_CONTROL_STATEMENT = 10;

	/**
	 * The number of structural features of the '<em>Subprogram Control Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CONTROL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subprogram Control Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_CONTROL_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.SelectionStatement <em>Selection Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.SelectionStatement
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getSelectionStatement()
	 * @generated
	 */
	int SELECTION_STATEMENT = 11;

	/**
	 * The number of structural features of the '<em>Selection Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selection Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IterationStatement <em>Iteration Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.IterationStatement
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getIterationStatement()
	 * @generated
	 */
	int ITERATION_STATEMENT = 12;

	/**
	 * The number of structural features of the '<em>Iteration Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iteration Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.NILStatementImpl <em>NIL Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.NILStatementImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getNILStatement()
	 * @generated
	 */
	int NIL_STATEMENT = 13;

	/**
	 * The number of structural features of the '<em>NIL Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NIL Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIL_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.FBInvocationImpl <em>FB Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.FBInvocationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getFBInvocation()
	 * @generated
	 */
	int FB_INVOCATION = 14;

	/**
	 * The feature id for the '<em><b>Function Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_INVOCATION__FUNCTION_BLOCK = SUBPROGRAM_CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Param Assignment List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_INVOCATION__PARAM_ASSIGNMENT_LIST = SUBPROGRAM_CONTROL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FB Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_INVOCATION_FEATURE_COUNT = SUBPROGRAM_CONTROL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>FB Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_INVOCATION_OPERATION_COUNT = SUBPROGRAM_CONTROL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ReturnImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 15;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = SUBPROGRAM_CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATION_COUNT = SUBPROGRAM_CONTROL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ParamImplicationImpl <em>Param Implication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ParamImplicationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getParamImplication()
	 * @generated
	 */
	int PARAM_IMPLICATION = 16;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_IMPLICATION__NOT = PARAM_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_IMPLICATION__LEFT_SIDE = PARAM_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_IMPLICATION__RIGHT_SIDE = PARAM_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Param Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_IMPLICATION_FEATURE_COUNT = PARAM_ASSIGNMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Param Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_IMPLICATION_OPERATION_COUNT = PARAM_ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ParamExpressionImpl <em>Param Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ParamExpressionImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getParamExpression()
	 * @generated
	 */
	int PARAM_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_EXPRESSION__VARIABLE_NAME = PARAM_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_EXPRESSION__EXPRESSION = PARAM_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Param Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_EXPRESSION_FEATURE_COUNT = PARAM_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Param Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_EXPRESSION_OPERATION_COUNT = PARAM_ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.IfStatementImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 18;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONDITION = SELECTION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elsif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSIF = SELECTION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__THEN = SELECTION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE = SELECTION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = SELECTION_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_OPERATION_COUNT = SELECTION_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.CaseStatementImpl <em>Case Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.CaseStatementImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getCaseStatement()
	 * @generated
	 */
	int CASE_STATEMENT = 19;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT__ELSE = SELECTION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT__CONDITION = SELECTION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Case Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT__CASE_ELEMENTS = SELECTION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Case Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT_FEATURE_COUNT = SELECTION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Case Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_STATEMENT_OPERATION_COUNT = SELECTION_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ElseImpl <em>Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ElseImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getElse()
	 * @generated
	 */
	int ELSE = 20;

	/**
	 * The feature id for the '<em><b>Then</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__THEN = 0;

	/**
	 * The number of structural features of the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.CaseElementImpl <em>Case Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.CaseElementImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getCaseElement()
	 * @generated
	 */
	int CASE_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Case List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ELEMENT__CASE_LIST = 0;

	/**
	 * The feature id for the '<em><b>Statement List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ELEMENT__STATEMENT_LIST = 1;

	/**
	 * The number of structural features of the '<em>Case Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Case Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseListElement <em>Case List Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseListElement
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getCaseListElement()
	 * @generated
	 */
	int CASE_LIST_ELEMENT = 22;

	/**
	 * The number of structural features of the '<em>Case List Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_LIST_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Case List Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_LIST_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ForStatementImpl <em>For Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ForStatementImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getForStatement()
	 * @generated
	 */
	int FOR_STATEMENT = 23;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__FROM = ITERATION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__TO = ITERATION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__BY = ITERATION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Do</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__DO = ITERATION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_FEATURE_COUNT = ITERATION_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_OPERATION_COUNT = ITERATION_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.WhileStatementImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 24;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__CONDITION = ITERATION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Do</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__DO = ITERATION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = ITERATION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_OPERATION_COUNT = ITERATION_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.RepeatStatementImpl <em>Repeat Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.RepeatStatementImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getRepeatStatement()
	 * @generated
	 */
	int REPEAT_STATEMENT = 25;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__CONDITION = ITERATION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Do</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__DO = ITERATION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repeat Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT_FEATURE_COUNT = ITERATION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Repeat Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT_OPERATION_COUNT = ITERATION_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ExitStatementImpl <em>Exit Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ExitStatementImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getExitStatement()
	 * @generated
	 */
	int EXIT_STATEMENT = 26;

	/**
	 * The number of structural features of the '<em>Exit Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT_FEATURE_COUNT = ITERATION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exit Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT_OPERATION_COUNT = ITERATION_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.VariableRefImpl <em>Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.VariableRefImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getVariableRef()
	 * @generated
	 */
	int VARIABLE_REF = 27;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__VARIABLE = PRIMARY_EXPRESSION_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_FEATURE_COUNT = PRIMARY_EXPRESSION_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_OPERATION_COUNT = PRIMARY_EXPRESSION_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.EnumeratedValueRefImpl <em>Enumerated Value Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.EnumeratedValueRefImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getEnumeratedValueRef()
	 * @generated
	 */
	int ENUMERATED_VALUE_REF = 28;

	/**
	 * The feature id for the '<em><b>Enum Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE_REF__ENUM_VALUE = PRIMARY_EXPRESSION_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumerated Value Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE_REF_FEATURE_COUNT = PRIMARY_EXPRESSION_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumerated Value Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE_REF_OPERATION_COUNT = PRIMARY_EXPRESSION_VALUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Expression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.Expression#getOperator()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Operator();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Operator#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.Operator#getOperand()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Operand();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Operator#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.Operator#getOperation()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Operation();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression <em>Primary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Expression</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression
	 * @generated
	 */
	EClass getPrimaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression#getUnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unary Operator</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression#getUnaryOperator()
	 * @see #getPrimaryExpression()
	 * @generated
	 */
	EReference getPrimaryExpression_UnaryOperator();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression#getValue()
	 * @see #getPrimaryExpression()
	 * @generated
	 */
	EReference getPrimaryExpression_Value();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operator</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.UnaryOperator
	 * @generated
	 */
	EClass getUnaryOperator();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.UnaryOperator#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.UnaryOperator#getOperation()
	 * @see #getUnaryOperator()
	 * @generated
	 */
	EAttribute getUnaryOperator_Operation();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpressionValue <em>Primary Expression Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Expression Value</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpressionValue
	 * @generated
	 */
	EClass getPrimaryExpressionValue();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FunctionInvocation <em>Function Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Invocation</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.FunctionInvocation
	 * @generated
	 */
	EClass getFunctionInvocation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FunctionInvocation#getParamAssignmentList <em>Param Assignment List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param Assignment List</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.FunctionInvocation#getParamAssignmentList()
	 * @see #getFunctionInvocation()
	 * @generated
	 */
	EReference getFunctionInvocation_ParamAssignmentList();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FunctionInvocation#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.FunctionInvocation#getFunction()
	 * @see #getFunctionInvocation()
	 * @generated
	 */
	EReference getFunctionInvocation_Function();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamAssignment <em>Param Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Assignment</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamAssignment
	 * @generated
	 */
	EClass getParamAssignment();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.StatementList <em>Statement List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement List</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StatementList
	 * @generated
	 */
	EClass getStatementList();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.StatementList#getStatments <em>Statments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statments</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StatementList#getStatments()
	 * @see #getStatementList()
	 * @generated
	 */
	EReference getStatementList_Statments();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.AssignmentStatement <em>Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Statement</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.AssignmentStatement
	 * @generated
	 */
	EClass getAssignmentStatement();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.AssignmentStatement#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.AssignmentStatement#getVariable()
	 * @see #getAssignmentStatement()
	 * @generated
	 */
	EReference getAssignmentStatement_Variable();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.AssignmentStatement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.AssignmentStatement#getValue()
	 * @see #getAssignmentStatement()
	 * @generated
	 */
	EReference getAssignmentStatement_Value();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.SubprogramControlStatement <em>Subprogram Control Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Control Statement</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.SubprogramControlStatement
	 * @generated
	 */
	EClass getSubprogramControlStatement();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.SelectionStatement <em>Selection Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Statement</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.SelectionStatement
	 * @generated
	 */
	EClass getSelectionStatement();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IterationStatement <em>Iteration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteration Statement</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.IterationStatement
	 * @generated
	 */
	EClass getIterationStatement();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.NILStatement <em>NIL Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NIL Statement</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.NILStatement
	 * @generated
	 */
	EClass getNILStatement();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FBInvocation <em>FB Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FB Invocation</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.FBInvocation
	 * @generated
	 */
	EClass getFBInvocation();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FBInvocation#getFunctionBlock <em>Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Block</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.FBInvocation#getFunctionBlock()
	 * @see #getFBInvocation()
	 * @generated
	 */
	EReference getFBInvocation_FunctionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FBInvocation#getParamAssignmentList <em>Param Assignment List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param Assignment List</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.FBInvocation#getParamAssignmentList()
	 * @see #getFBInvocation()
	 * @generated
	 */
	EReference getFBInvocation_ParamAssignmentList();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication <em>Param Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Implication</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication
	 * @generated
	 */
	EClass getParamImplication();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication#isNot()
	 * @see #getParamImplication()
	 * @generated
	 */
	EAttribute getParamImplication_Not();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication#getLeftSide <em>Left Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Side</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication#getLeftSide()
	 * @see #getParamImplication()
	 * @generated
	 */
	EReference getParamImplication_LeftSide();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication#getRightSide <em>Right Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Side</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication#getRightSide()
	 * @see #getParamImplication()
	 * @generated
	 */
	EReference getParamImplication_RightSide();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamExpression <em>Param Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Expression</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamExpression
	 * @generated
	 */
	EClass getParamExpression();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamExpression#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamExpression#getVariableName()
	 * @see #getParamExpression()
	 * @generated
	 */
	EReference getParamExpression_VariableName();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamExpression#getExpression()
	 * @see #getParamExpression()
	 * @generated
	 */
	EReference getParamExpression_Expression();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement#getCondition()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement#getElsif <em>Elsif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elsif</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement#getElsif()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Elsif();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement#getThen()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Then();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement#getElse()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Else();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement <em>Case Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Statement</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement
	 * @generated
	 */
	EClass getCaseStatement();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement#getElse()
	 * @see #getCaseStatement()
	 * @generated
	 */
	EReference getCaseStatement_Else();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement#getCondition()
	 * @see #getCaseStatement()
	 * @generated
	 */
	EReference getCaseStatement_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement#getCaseElements <em>Case Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case Elements</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement#getCaseElements()
	 * @see #getCaseStatement()
	 * @generated
	 */
	EReference getCaseStatement_CaseElements();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Else <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.Else
	 * @generated
	 */
	EClass getElse();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Else#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Then</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.Else#getThen()
	 * @see #getElse()
	 * @generated
	 */
	EReference getElse_Then();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseElement <em>Case Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Element</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseElement
	 * @generated
	 */
	EClass getCaseElement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseElement#getCaseList <em>Case List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case List</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseElement#getCaseList()
	 * @see #getCaseElement()
	 * @generated
	 */
	EReference getCaseElement_CaseList();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseElement#getStatementList <em>Statement List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement List</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseElement#getStatementList()
	 * @see #getCaseElement()
	 * @generated
	 */
	EReference getCaseElement_StatementList();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseListElement <em>Case List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case List Element</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseListElement
	 * @generated
	 */
	EClass getCaseListElement();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Statement</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement
	 * @generated
	 */
	EClass getForStatement();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement#getFrom()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_From();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement#getTo()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_To();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement#getBy <em>By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>By</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement#getBy()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_By();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement#getDo <em>Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement#getDo()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Do();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.WhileStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.WhileStatement#getCondition()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.WhileStatement#getDo <em>Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.WhileStatement#getDo()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Do();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.RepeatStatement <em>Repeat Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Statement</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.RepeatStatement
	 * @generated
	 */
	EClass getRepeatStatement();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.RepeatStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.RepeatStatement#getCondition()
	 * @see #getRepeatStatement()
	 * @generated
	 */
	EReference getRepeatStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.RepeatStatement#getDo <em>Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.RepeatStatement#getDo()
	 * @see #getRepeatStatement()
	 * @generated
	 */
	EReference getRepeatStatement_Do();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ExitStatement <em>Exit Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Statement</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ExitStatement
	 * @generated
	 */
	EClass getExitStatement();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Ref</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.VariableRef
	 * @generated
	 */
	EClass getVariableRef();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.VariableRef#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.VariableRef#getVariable()
	 * @see #getVariableRef()
	 * @generated
	 */
	EReference getVariableRef_Variable();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.EnumeratedValueRef <em>Enumerated Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Value Ref</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.EnumeratedValueRef
	 * @generated
	 */
	EClass getEnumeratedValueRef();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.EnumeratedValueRef#getEnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Value</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.EnumeratedValueRef#getEnumValue()
	 * @see #getEnumeratedValueRef()
	 * @generated
	 */
	EReference getEnumeratedValueRef_EnumValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StFactory getStFactory();

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
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ExpressionImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__OPERATOR = eINSTANCE.getExpression_Operator();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.OperatorImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__OPERAND = eINSTANCE.getOperator_Operand();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__OPERATION = eINSTANCE.getOperator_Operation();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.PrimaryExpressionImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getPrimaryExpression()
		 * @generated
		 */
		EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimaryExpression();

		/**
		 * The meta object literal for the '<em><b>Unary Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_EXPRESSION__UNARY_OPERATOR = eINSTANCE.getPrimaryExpression_UnaryOperator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_EXPRESSION__VALUE = eINSTANCE.getPrimaryExpression_Value();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.UnaryOperatorImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EClass UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_OPERATOR__OPERATION = eINSTANCE.getUnaryOperator_Operation();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpressionValue <em>Primary Expression Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpressionValue
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getPrimaryExpressionValue()
		 * @generated
		 */
		EClass PRIMARY_EXPRESSION_VALUE = eINSTANCE.getPrimaryExpressionValue();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.FunctionInvocationImpl <em>Function Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.FunctionInvocationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getFunctionInvocation()
		 * @generated
		 */
		EClass FUNCTION_INVOCATION = eINSTANCE.getFunctionInvocation();

		/**
		 * The meta object literal for the '<em><b>Param Assignment List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INVOCATION__PARAM_ASSIGNMENT_LIST = eINSTANCE.getFunctionInvocation_ParamAssignmentList();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INVOCATION__FUNCTION = eINSTANCE.getFunctionInvocation_Function();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamAssignment <em>Param Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamAssignment
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getParamAssignment()
		 * @generated
		 */
		EClass PARAM_ASSIGNMENT = eINSTANCE.getParamAssignment();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StatementListImpl <em>Statement List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StatementListImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getStatementList()
		 * @generated
		 */
		EClass STATEMENT_LIST = eINSTANCE.getStatementList();

		/**
		 * The meta object literal for the '<em><b>Statments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_LIST__STATMENTS = eINSTANCE.getStatementList_Statments();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Statement <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.Statement
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.AssignmentStatementImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getAssignmentStatement()
		 * @generated
		 */
		EClass ASSIGNMENT_STATEMENT = eINSTANCE.getAssignmentStatement();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_STATEMENT__VARIABLE = eINSTANCE.getAssignmentStatement_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_STATEMENT__VALUE = eINSTANCE.getAssignmentStatement_Value();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.SubprogramControlStatement <em>Subprogram Control Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.SubprogramControlStatement
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getSubprogramControlStatement()
		 * @generated
		 */
		EClass SUBPROGRAM_CONTROL_STATEMENT = eINSTANCE.getSubprogramControlStatement();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.SelectionStatement <em>Selection Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.SelectionStatement
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getSelectionStatement()
		 * @generated
		 */
		EClass SELECTION_STATEMENT = eINSTANCE.getSelectionStatement();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IterationStatement <em>Iteration Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.IterationStatement
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getIterationStatement()
		 * @generated
		 */
		EClass ITERATION_STATEMENT = eINSTANCE.getIterationStatement();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.NILStatementImpl <em>NIL Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.NILStatementImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getNILStatement()
		 * @generated
		 */
		EClass NIL_STATEMENT = eINSTANCE.getNILStatement();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.FBInvocationImpl <em>FB Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.FBInvocationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getFBInvocation()
		 * @generated
		 */
		EClass FB_INVOCATION = eINSTANCE.getFBInvocation();

		/**
		 * The meta object literal for the '<em><b>Function Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FB_INVOCATION__FUNCTION_BLOCK = eINSTANCE.getFBInvocation_FunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Param Assignment List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FB_INVOCATION__PARAM_ASSIGNMENT_LIST = eINSTANCE.getFBInvocation_ParamAssignmentList();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ReturnImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ParamImplicationImpl <em>Param Implication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ParamImplicationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getParamImplication()
		 * @generated
		 */
		EClass PARAM_IMPLICATION = eINSTANCE.getParamImplication();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_IMPLICATION__NOT = eINSTANCE.getParamImplication_Not();

		/**
		 * The meta object literal for the '<em><b>Left Side</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_IMPLICATION__LEFT_SIDE = eINSTANCE.getParamImplication_LeftSide();

		/**
		 * The meta object literal for the '<em><b>Right Side</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_IMPLICATION__RIGHT_SIDE = eINSTANCE.getParamImplication_RightSide();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ParamExpressionImpl <em>Param Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ParamExpressionImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getParamExpression()
		 * @generated
		 */
		EClass PARAM_EXPRESSION = eINSTANCE.getParamExpression();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_EXPRESSION__VARIABLE_NAME = eINSTANCE.getParamExpression_VariableName();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_EXPRESSION__EXPRESSION = eINSTANCE.getParamExpression_Expression();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.IfStatementImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__CONDITION = eINSTANCE.getIfStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Elsif</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSIF = eINSTANCE.getIfStatement_Elsif();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__THEN = eINSTANCE.getIfStatement_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSE = eINSTANCE.getIfStatement_Else();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.CaseStatementImpl <em>Case Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.CaseStatementImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getCaseStatement()
		 * @generated
		 */
		EClass CASE_STATEMENT = eINSTANCE.getCaseStatement();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_STATEMENT__ELSE = eINSTANCE.getCaseStatement_Else();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_STATEMENT__CONDITION = eINSTANCE.getCaseStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Case Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_STATEMENT__CASE_ELEMENTS = eINSTANCE.getCaseStatement_CaseElements();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ElseImpl <em>Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ElseImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getElse()
		 * @generated
		 */
		EClass ELSE = eINSTANCE.getElse();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE__THEN = eINSTANCE.getElse_Then();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.CaseElementImpl <em>Case Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.CaseElementImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getCaseElement()
		 * @generated
		 */
		EClass CASE_ELEMENT = eINSTANCE.getCaseElement();

		/**
		 * The meta object literal for the '<em><b>Case List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_ELEMENT__CASE_LIST = eINSTANCE.getCaseElement_CaseList();

		/**
		 * The meta object literal for the '<em><b>Statement List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_ELEMENT__STATEMENT_LIST = eINSTANCE.getCaseElement_StatementList();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseListElement <em>Case List Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseListElement
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getCaseListElement()
		 * @generated
		 */
		EClass CASE_LIST_ELEMENT = eINSTANCE.getCaseListElement();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ForStatementImpl <em>For Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ForStatementImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getForStatement()
		 * @generated
		 */
		EClass FOR_STATEMENT = eINSTANCE.getForStatement();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__FROM = eINSTANCE.getForStatement_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__TO = eINSTANCE.getForStatement_To();

		/**
		 * The meta object literal for the '<em><b>By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__BY = eINSTANCE.getForStatement_By();

		/**
		 * The meta object literal for the '<em><b>Do</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__DO = eINSTANCE.getForStatement_Do();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.WhileStatementImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__CONDITION = eINSTANCE.getWhileStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Do</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__DO = eINSTANCE.getWhileStatement_Do();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.RepeatStatementImpl <em>Repeat Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.RepeatStatementImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getRepeatStatement()
		 * @generated
		 */
		EClass REPEAT_STATEMENT = eINSTANCE.getRepeatStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_STATEMENT__CONDITION = eINSTANCE.getRepeatStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Do</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_STATEMENT__DO = eINSTANCE.getRepeatStatement_Do();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ExitStatementImpl <em>Exit Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ExitStatementImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getExitStatement()
		 * @generated
		 */
		EClass EXIT_STATEMENT = eINSTANCE.getExitStatement();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.VariableRefImpl <em>Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.VariableRefImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getVariableRef()
		 * @generated
		 */
		EClass VARIABLE_REF = eINSTANCE.getVariableRef();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REF__VARIABLE = eINSTANCE.getVariableRef_Variable();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.EnumeratedValueRefImpl <em>Enumerated Value Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.EnumeratedValueRefImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl#getEnumeratedValueRef()
		 * @generated
		 */
		EClass ENUMERATED_VALUE_REF = eINSTANCE.getEnumeratedValueRef();

		/**
		 * The meta object literal for the '<em><b>Enum Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_VALUE_REF__ENUM_VALUE = eINSTANCE.getEnumeratedValueRef_EnumValue();

	}

} //StPackage
