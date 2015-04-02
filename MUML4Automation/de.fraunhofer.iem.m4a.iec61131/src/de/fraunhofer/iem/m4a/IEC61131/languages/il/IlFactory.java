/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage
 * @generated
 */
public interface IlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IlFactory eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Instruction List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruction List</em>'.
	 * @generated
	 */
	InstructionList createInstructionList();

	/**
	 * Returns a new object of class '<em>Jump Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jump Operation</em>'.
	 * @generated
	 */
	JumpOperation createJumpOperation();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	IlExpression createIlExpression();

	/**
	 * Returns a new object of class '<em>FB Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FB Call</em>'.
	 * @generated
	 */
	IlFBCall createIlFBCall();

	/**
	 * Returns a new object of class '<em>Formal Funct Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formal Funct Call</em>'.
	 * @generated
	 */
	IlFormalFunctCall createIlFormalFunctCall();

	/**
	 * Returns a new object of class '<em>Return Operator Place Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Operator Place Holder</em>'.
	 * @generated
	 */
	ReturnOperatorPlaceHolder createReturnOperatorPlaceHolder();

	/**
	 * Returns a new object of class '<em>Param Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Assignment</em>'.
	 * @generated
	 */
	IlParamAssignment createIlParamAssignment();

	/**
	 * Returns a new object of class '<em>Param Out Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Out Assignment</em>'.
	 * @generated
	 */
	IlParamOutAssignment createIlParamOutAssignment();

	/**
	 * Returns a new object of class '<em>Param List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param List</em>'.
	 * @generated
	 */
	ParamList createParamList();

	/**
	 * Returns a new object of class '<em>Operand List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operand List</em>'.
	 * @generated
	 */
	OperandList createOperandList();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	IlLabel createIlLabel();

	/**
	 * Returns a new object of class '<em>Operand Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operand Constant</em>'.
	 * @generated
	 */
	OperandConstant createOperandConstant();

	/**
	 * Returns a new object of class '<em>Operand Enumerated Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operand Enumerated Value</em>'.
	 * @generated
	 */
	OperandEnumeratedValue createOperandEnumeratedValue();

	/**
	 * Returns a new object of class '<em>Operand Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operand Variable</em>'.
	 * @generated
	 */
	OperandVariable createOperandVariable();

	/**
	 * Returns a new object of class '<em>Simple Operation Operand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Operation Operand</em>'.
	 * @generated
	 */
	SimpleOperationOperand createSimpleOperationOperand();

	/**
	 * Returns a new object of class '<em>Simple Operation Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Operation Function</em>'.
	 * @generated
	 */
	SimpleOperationFunction createSimpleOperationFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IlPackage getIlPackage();

} //IlFactory
