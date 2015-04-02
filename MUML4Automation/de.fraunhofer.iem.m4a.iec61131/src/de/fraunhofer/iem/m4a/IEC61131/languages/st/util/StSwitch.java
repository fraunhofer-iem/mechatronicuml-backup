/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st.util;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockBody;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBody;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage
 * @generated
 */
public class StSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StSwitch() {
		if (modelPackage == null) {
			modelPackage = StPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = casePrimaryExpressionValue(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.PRIMARY_EXPRESSION: {
				PrimaryExpression primaryExpression = (PrimaryExpression)theEObject;
				T result = casePrimaryExpression(primaryExpression);
				if (result == null) result = caseExpression(primaryExpression);
				if (result == null) result = casePrimaryExpressionValue(primaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.UNARY_OPERATOR: {
				UnaryOperator unaryOperator = (UnaryOperator)theEObject;
				T result = caseUnaryOperator(unaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.PRIMARY_EXPRESSION_VALUE: {
				PrimaryExpressionValue primaryExpressionValue = (PrimaryExpressionValue)theEObject;
				T result = casePrimaryExpressionValue(primaryExpressionValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.FUNCTION_INVOCATION: {
				FunctionInvocation functionInvocation = (FunctionInvocation)theEObject;
				T result = caseFunctionInvocation(functionInvocation);
				if (result == null) result = casePrimaryExpressionValue(functionInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.PARAM_ASSIGNMENT: {
				ParamAssignment paramAssignment = (ParamAssignment)theEObject;
				T result = caseParamAssignment(paramAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.STATEMENT_LIST: {
				StatementList statementList = (StatementList)theEObject;
				T result = caseStatementList(statementList);
				if (result == null) result = caseFunctionBody(statementList);
				if (result == null) result = caseFunctionBlockBody(statementList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.ASSIGNMENT_STATEMENT: {
				AssignmentStatement assignmentStatement = (AssignmentStatement)theEObject;
				T result = caseAssignmentStatement(assignmentStatement);
				if (result == null) result = caseStatement(assignmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.SUBPROGRAM_CONTROL_STATEMENT: {
				SubprogramControlStatement subprogramControlStatement = (SubprogramControlStatement)theEObject;
				T result = caseSubprogramControlStatement(subprogramControlStatement);
				if (result == null) result = caseStatement(subprogramControlStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.SELECTION_STATEMENT: {
				SelectionStatement selectionStatement = (SelectionStatement)theEObject;
				T result = caseSelectionStatement(selectionStatement);
				if (result == null) result = caseStatement(selectionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.ITERATION_STATEMENT: {
				IterationStatement iterationStatement = (IterationStatement)theEObject;
				T result = caseIterationStatement(iterationStatement);
				if (result == null) result = caseStatement(iterationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.NIL_STATEMENT: {
				NILStatement nilStatement = (NILStatement)theEObject;
				T result = caseNILStatement(nilStatement);
				if (result == null) result = caseStatement(nilStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.FB_INVOCATION: {
				FBInvocation fbInvocation = (FBInvocation)theEObject;
				T result = caseFBInvocation(fbInvocation);
				if (result == null) result = caseSubprogramControlStatement(fbInvocation);
				if (result == null) result = caseStatement(fbInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.RETURN: {
				Return return_ = (Return)theEObject;
				T result = caseReturn(return_);
				if (result == null) result = caseSubprogramControlStatement(return_);
				if (result == null) result = caseStatement(return_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.PARAM_IMPLICATION: {
				ParamImplication paramImplication = (ParamImplication)theEObject;
				T result = caseParamImplication(paramImplication);
				if (result == null) result = caseParamAssignment(paramImplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.PARAM_EXPRESSION: {
				ParamExpression paramExpression = (ParamExpression)theEObject;
				T result = caseParamExpression(paramExpression);
				if (result == null) result = caseParamAssignment(paramExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.IF_STATEMENT: {
				IfStatement ifStatement = (IfStatement)theEObject;
				T result = caseIfStatement(ifStatement);
				if (result == null) result = caseSelectionStatement(ifStatement);
				if (result == null) result = caseStatement(ifStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.CASE_STATEMENT: {
				CaseStatement caseStatement = (CaseStatement)theEObject;
				T result = caseCaseStatement(caseStatement);
				if (result == null) result = caseSelectionStatement(caseStatement);
				if (result == null) result = caseStatement(caseStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.ELSE: {
				Else else_ = (Else)theEObject;
				T result = caseElse(else_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.CASE_ELEMENT: {
				CaseElement caseElement = (CaseElement)theEObject;
				T result = caseCaseElement(caseElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.CASE_LIST_ELEMENT: {
				CaseListElement caseListElement = (CaseListElement)theEObject;
				T result = caseCaseListElement(caseListElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.FOR_STATEMENT: {
				ForStatement forStatement = (ForStatement)theEObject;
				T result = caseForStatement(forStatement);
				if (result == null) result = caseIterationStatement(forStatement);
				if (result == null) result = caseStatement(forStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.WHILE_STATEMENT: {
				WhileStatement whileStatement = (WhileStatement)theEObject;
				T result = caseWhileStatement(whileStatement);
				if (result == null) result = caseIterationStatement(whileStatement);
				if (result == null) result = caseStatement(whileStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.REPEAT_STATEMENT: {
				RepeatStatement repeatStatement = (RepeatStatement)theEObject;
				T result = caseRepeatStatement(repeatStatement);
				if (result == null) result = caseIterationStatement(repeatStatement);
				if (result == null) result = caseStatement(repeatStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.EXIT_STATEMENT: {
				ExitStatement exitStatement = (ExitStatement)theEObject;
				T result = caseExitStatement(exitStatement);
				if (result == null) result = caseIterationStatement(exitStatement);
				if (result == null) result = caseStatement(exitStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.VARIABLE_REF: {
				VariableRef variableRef = (VariableRef)theEObject;
				T result = caseVariableRef(variableRef);
				if (result == null) result = casePrimaryExpressionValue(variableRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StPackage.ENUMERATED_VALUE_REF: {
				EnumeratedValueRef enumeratedValueRef = (EnumeratedValueRef)theEObject;
				T result = caseEnumeratedValueRef(enumeratedValueRef);
				if (result == null) result = casePrimaryExpressionValue(enumeratedValueRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryExpression(PrimaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryOperator(UnaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Expression Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Expression Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryExpressionValue(PrimaryExpressionValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionInvocation(FunctionInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamAssignment(ParamAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementList(StatementList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentStatement(AssignmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Control Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Control Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramControlStatement(SubprogramControlStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionStatement(SelectionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iteration Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iteration Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterationStatement(IterationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NIL Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NIL Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNILStatement(NILStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FB Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FB Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFBInvocation(FBInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturn(Return object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Implication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Implication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamImplication(ParamImplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamExpression(ParamExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseStatement(CaseStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElse(Else object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseElement(CaseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case List Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case List Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseListElement(CaseListElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForStatement(ForStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileStatement(WhileStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatStatement(RepeatStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitStatement(ExitStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableRef(VariableRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Value Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Value Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedValueRef(EnumeratedValueRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionBody(FunctionBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Block Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Block Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionBlockBody(FunctionBlockBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StSwitch
