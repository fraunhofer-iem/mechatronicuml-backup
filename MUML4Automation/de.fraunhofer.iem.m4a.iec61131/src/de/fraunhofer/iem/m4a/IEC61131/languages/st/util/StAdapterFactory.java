/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st.util;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockBody;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBody;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage
 * @generated
 */
public class StAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StSwitch<Adapter> modelSwitch =
		new StSwitch<Adapter>() {
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter casePrimaryExpression(PrimaryExpression object) {
				return createPrimaryExpressionAdapter();
			}
			@Override
			public Adapter caseUnaryOperator(UnaryOperator object) {
				return createUnaryOperatorAdapter();
			}
			@Override
			public Adapter casePrimaryExpressionValue(PrimaryExpressionValue object) {
				return createPrimaryExpressionValueAdapter();
			}
			@Override
			public Adapter caseFunctionInvocation(FunctionInvocation object) {
				return createFunctionInvocationAdapter();
			}
			@Override
			public Adapter caseParamAssignment(ParamAssignment object) {
				return createParamAssignmentAdapter();
			}
			@Override
			public Adapter caseStatementList(StatementList object) {
				return createStatementListAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseAssignmentStatement(AssignmentStatement object) {
				return createAssignmentStatementAdapter();
			}
			@Override
			public Adapter caseSubprogramControlStatement(SubprogramControlStatement object) {
				return createSubprogramControlStatementAdapter();
			}
			@Override
			public Adapter caseSelectionStatement(SelectionStatement object) {
				return createSelectionStatementAdapter();
			}
			@Override
			public Adapter caseIterationStatement(IterationStatement object) {
				return createIterationStatementAdapter();
			}
			@Override
			public Adapter caseNILStatement(NILStatement object) {
				return createNILStatementAdapter();
			}
			@Override
			public Adapter caseFBInvocation(FBInvocation object) {
				return createFBInvocationAdapter();
			}
			@Override
			public Adapter caseReturn(Return object) {
				return createReturnAdapter();
			}
			@Override
			public Adapter caseParamImplication(ParamImplication object) {
				return createParamImplicationAdapter();
			}
			@Override
			public Adapter caseParamExpression(ParamExpression object) {
				return createParamExpressionAdapter();
			}
			@Override
			public Adapter caseIfStatement(IfStatement object) {
				return createIfStatementAdapter();
			}
			@Override
			public Adapter caseCaseStatement(CaseStatement object) {
				return createCaseStatementAdapter();
			}
			@Override
			public Adapter caseElse(Else object) {
				return createElseAdapter();
			}
			@Override
			public Adapter caseCaseElement(CaseElement object) {
				return createCaseElementAdapter();
			}
			@Override
			public Adapter caseCaseListElement(CaseListElement object) {
				return createCaseListElementAdapter();
			}
			@Override
			public Adapter caseForStatement(ForStatement object) {
				return createForStatementAdapter();
			}
			@Override
			public Adapter caseWhileStatement(WhileStatement object) {
				return createWhileStatementAdapter();
			}
			@Override
			public Adapter caseRepeatStatement(RepeatStatement object) {
				return createRepeatStatementAdapter();
			}
			@Override
			public Adapter caseExitStatement(ExitStatement object) {
				return createExitStatementAdapter();
			}
			@Override
			public Adapter caseVariableRef(VariableRef object) {
				return createVariableRefAdapter();
			}
			@Override
			public Adapter caseEnumeratedValueRef(EnumeratedValueRef object) {
				return createEnumeratedValueRefAdapter();
			}
			@Override
			public Adapter caseFunctionBody(FunctionBody object) {
				return createFunctionBodyAdapter();
			}
			@Override
			public Adapter caseFunctionBlockBody(FunctionBlockBody object) {
				return createFunctionBlockBodyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression <em>Primary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression
	 * @generated
	 */
	public Adapter createPrimaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.UnaryOperator
	 * @generated
	 */
	public Adapter createUnaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpressionValue <em>Primary Expression Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpressionValue
	 * @generated
	 */
	public Adapter createPrimaryExpressionValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FunctionInvocation <em>Function Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.FunctionInvocation
	 * @generated
	 */
	public Adapter createFunctionInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamAssignment <em>Param Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamAssignment
	 * @generated
	 */
	public Adapter createParamAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.StatementList <em>Statement List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StatementList
	 * @generated
	 */
	public Adapter createStatementListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.AssignmentStatement <em>Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.AssignmentStatement
	 * @generated
	 */
	public Adapter createAssignmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.SubprogramControlStatement <em>Subprogram Control Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.SubprogramControlStatement
	 * @generated
	 */
	public Adapter createSubprogramControlStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.SelectionStatement <em>Selection Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.SelectionStatement
	 * @generated
	 */
	public Adapter createSelectionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IterationStatement <em>Iteration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.IterationStatement
	 * @generated
	 */
	public Adapter createIterationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.NILStatement <em>NIL Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.NILStatement
	 * @generated
	 */
	public Adapter createNILStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FBInvocation <em>FB Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.FBInvocation
	 * @generated
	 */
	public Adapter createFBInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.Return
	 * @generated
	 */
	public Adapter createReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication <em>Param Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication
	 * @generated
	 */
	public Adapter createParamImplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamExpression <em>Param Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamExpression
	 * @generated
	 */
	public Adapter createParamExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement
	 * @generated
	 */
	public Adapter createIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement <em>Case Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement
	 * @generated
	 */
	public Adapter createCaseStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Else <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.Else
	 * @generated
	 */
	public Adapter createElseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseElement <em>Case Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseElement
	 * @generated
	 */
	public Adapter createCaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseListElement <em>Case List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseListElement
	 * @generated
	 */
	public Adapter createCaseListElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement
	 * @generated
	 */
	public Adapter createForStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.WhileStatement
	 * @generated
	 */
	public Adapter createWhileStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.RepeatStatement <em>Repeat Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.RepeatStatement
	 * @generated
	 */
	public Adapter createRepeatStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ExitStatement <em>Exit Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.ExitStatement
	 * @generated
	 */
	public Adapter createExitStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.VariableRef
	 * @generated
	 */
	public Adapter createVariableRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.EnumeratedValueRef <em>Enumerated Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.EnumeratedValueRef
	 * @generated
	 */
	public Adapter createEnumeratedValueRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBody <em>Function Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBody
	 * @generated
	 */
	public Adapter createFunctionBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockBody <em>Function Block Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockBody
	 * @generated
	 */
	public Adapter createFunctionBlockBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StAdapterFactory
