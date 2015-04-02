/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st.impl;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StFactoryImpl extends EFactoryImpl implements StFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StFactory init() {
		try {
			StFactory theStFactory = (StFactory)EPackage.Registry.INSTANCE.getEFactory(StPackage.eNS_URI);
			if (theStFactory != null) {
				return theStFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StPackage.OPERATOR: return createOperator();
			case StPackage.PRIMARY_EXPRESSION: return createPrimaryExpression();
			case StPackage.UNARY_OPERATOR: return createUnaryOperator();
			case StPackage.FUNCTION_INVOCATION: return createFunctionInvocation();
			case StPackage.STATEMENT_LIST: return createStatementList();
			case StPackage.ASSIGNMENT_STATEMENT: return createAssignmentStatement();
			case StPackage.NIL_STATEMENT: return createNILStatement();
			case StPackage.FB_INVOCATION: return createFBInvocation();
			case StPackage.RETURN: return createReturn();
			case StPackage.PARAM_IMPLICATION: return createParamImplication();
			case StPackage.PARAM_EXPRESSION: return createParamExpression();
			case StPackage.IF_STATEMENT: return createIfStatement();
			case StPackage.CASE_STATEMENT: return createCaseStatement();
			case StPackage.ELSE: return createElse();
			case StPackage.CASE_ELEMENT: return createCaseElement();
			case StPackage.FOR_STATEMENT: return createForStatement();
			case StPackage.WHILE_STATEMENT: return createWhileStatement();
			case StPackage.REPEAT_STATEMENT: return createRepeatStatement();
			case StPackage.EXIT_STATEMENT: return createExitStatement();
			case StPackage.VARIABLE_REF: return createVariableRef();
			case StPackage.ENUMERATED_VALUE_REF: return createEnumeratedValueRef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperator() {
		OperatorImpl operator = new OperatorImpl();
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryExpression createPrimaryExpression() {
		PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
		return primaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator createUnaryOperator() {
		UnaryOperatorImpl unaryOperator = new UnaryOperatorImpl();
		return unaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInvocation createFunctionInvocation() {
		FunctionInvocationImpl functionInvocation = new FunctionInvocationImpl();
		return functionInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementList createStatementList() {
		StatementListImpl statementList = new StatementListImpl();
		return statementList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentStatement createAssignmentStatement() {
		AssignmentStatementImpl assignmentStatement = new AssignmentStatementImpl();
		return assignmentStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NILStatement createNILStatement() {
		NILStatementImpl nilStatement = new NILStatementImpl();
		return nilStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FBInvocation createFBInvocation() {
		FBInvocationImpl fbInvocation = new FBInvocationImpl();
		return fbInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamImplication createParamImplication() {
		ParamImplicationImpl paramImplication = new ParamImplicationImpl();
		return paramImplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamExpression createParamExpression() {
		ParamExpressionImpl paramExpression = new ParamExpressionImpl();
		return paramExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseStatement createCaseStatement() {
		CaseStatementImpl caseStatement = new CaseStatementImpl();
		return caseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Else createElse() {
		ElseImpl else_ = new ElseImpl();
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseElement createCaseElement() {
		CaseElementImpl caseElement = new CaseElementImpl();
		return caseElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForStatement createForStatement() {
		ForStatementImpl forStatement = new ForStatementImpl();
		return forStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatStatement createRepeatStatement() {
		RepeatStatementImpl repeatStatement = new RepeatStatementImpl();
		return repeatStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitStatement createExitStatement() {
		ExitStatementImpl exitStatement = new ExitStatementImpl();
		return exitStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableRef createVariableRef() {
		VariableRefImpl variableRef = new VariableRefImpl();
		return variableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedValueRef createEnumeratedValueRef() {
		EnumeratedValueRefImpl enumeratedValueRef = new EnumeratedValueRefImpl();
		return enumeratedValueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StPackage getStPackage() {
		return (StPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StPackage getPackage() {
		return StPackage.eINSTANCE;
	}

} //StFactoryImpl
