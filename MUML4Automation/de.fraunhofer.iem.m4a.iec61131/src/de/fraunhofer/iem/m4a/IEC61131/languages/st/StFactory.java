/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage
 * @generated
 */
public interface StFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StFactory eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operator</em>'.
	 * @generated
	 */
	Operator createOperator();

	/**
	 * Returns a new object of class '<em>Primary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primary Expression</em>'.
	 * @generated
	 */
	PrimaryExpression createPrimaryExpression();

	/**
	 * Returns a new object of class '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Operator</em>'.
	 * @generated
	 */
	UnaryOperator createUnaryOperator();

	/**
	 * Returns a new object of class '<em>Function Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Invocation</em>'.
	 * @generated
	 */
	FunctionInvocation createFunctionInvocation();

	/**
	 * Returns a new object of class '<em>Statement List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement List</em>'.
	 * @generated
	 */
	StatementList createStatementList();

	/**
	 * Returns a new object of class '<em>Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Statement</em>'.
	 * @generated
	 */
	AssignmentStatement createAssignmentStatement();

	/**
	 * Returns a new object of class '<em>NIL Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NIL Statement</em>'.
	 * @generated
	 */
	NILStatement createNILStatement();

	/**
	 * Returns a new object of class '<em>FB Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FB Invocation</em>'.
	 * @generated
	 */
	FBInvocation createFBInvocation();

	/**
	 * Returns a new object of class '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return</em>'.
	 * @generated
	 */
	Return createReturn();

	/**
	 * Returns a new object of class '<em>Param Implication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Implication</em>'.
	 * @generated
	 */
	ParamImplication createParamImplication();

	/**
	 * Returns a new object of class '<em>Param Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Expression</em>'.
	 * @generated
	 */
	ParamExpression createParamExpression();

	/**
	 * Returns a new object of class '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement</em>'.
	 * @generated
	 */
	IfStatement createIfStatement();

	/**
	 * Returns a new object of class '<em>Case Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Statement</em>'.
	 * @generated
	 */
	CaseStatement createCaseStatement();

	/**
	 * Returns a new object of class '<em>Else</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Else</em>'.
	 * @generated
	 */
	Else createElse();

	/**
	 * Returns a new object of class '<em>Case Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Element</em>'.
	 * @generated
	 */
	CaseElement createCaseElement();

	/**
	 * Returns a new object of class '<em>For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Statement</em>'.
	 * @generated
	 */
	ForStatement createForStatement();

	/**
	 * Returns a new object of class '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Statement</em>'.
	 * @generated
	 */
	WhileStatement createWhileStatement();

	/**
	 * Returns a new object of class '<em>Repeat Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat Statement</em>'.
	 * @generated
	 */
	RepeatStatement createRepeatStatement();

	/**
	 * Returns a new object of class '<em>Exit Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Statement</em>'.
	 * @generated
	 */
	ExitStatement createExitStatement();

	/**
	 * Returns a new object of class '<em>Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Ref</em>'.
	 * @generated
	 */
	VariableRef createVariableRef();

	/**
	 * Returns a new object of class '<em>Enumerated Value Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerated Value Ref</em>'.
	 * @generated
	 */
	EnumeratedValueRef createEnumeratedValueRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StPackage getStPackage();

} //StFactory
