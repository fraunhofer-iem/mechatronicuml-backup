/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il.util;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockBody;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBody;

import de.fraunhofer.iem.m4a.IEC61131.languages.il.*;

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
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage
 * @generated
 */
public class IlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlSwitch() {
		if (modelPackage == null) {
			modelPackage = IlPackage.eINSTANCE;
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
			case IlPackage.INSTRUCTION_LIST: {
				InstructionList instructionList = (InstructionList)theEObject;
				T result = caseInstructionList(instructionList);
				if (result == null) result = caseFunctionBody(instructionList);
				if (result == null) result = caseFunctionBlockBody(instructionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.INSTRUCTION: {
				Instruction instruction = (Instruction)theEObject;
				T result = caseInstruction(instruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.SIMPLE_OPERATION: {
				SimpleOperation simpleOperation = (SimpleOperation)theEObject;
				T result = caseSimpleOperation(simpleOperation);
				if (result == null) result = caseInstruction(simpleOperation);
				if (result == null) result = caseSimpleInstruction(simpleOperation);
				if (result == null) result = caseParamAssignmentOperand(simpleOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.JUMP_OPERATION: {
				JumpOperation jumpOperation = (JumpOperation)theEObject;
				T result = caseJumpOperation(jumpOperation);
				if (result == null) result = caseInstruction(jumpOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.IL_EXPRESSION: {
				IlExpression ilExpression = (IlExpression)theEObject;
				T result = caseIlExpression(ilExpression);
				if (result == null) result = caseInstruction(ilExpression);
				if (result == null) result = caseSimpleInstruction(ilExpression);
				if (result == null) result = caseParamAssignmentOperand(ilExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.IL_FB_CALL: {
				IlFBCall ilFBCall = (IlFBCall)theEObject;
				T result = caseIlFBCall(ilFBCall);
				if (result == null) result = caseInstruction(ilFBCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.IL_FORMAL_FUNCT_CALL: {
				IlFormalFunctCall ilFormalFunctCall = (IlFormalFunctCall)theEObject;
				T result = caseIlFormalFunctCall(ilFormalFunctCall);
				if (result == null) result = caseInstruction(ilFormalFunctCall);
				if (result == null) result = caseSimpleInstruction(ilFormalFunctCall);
				if (result == null) result = caseParamAssignmentOperand(ilFormalFunctCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.RETURN_OPERATOR_PLACE_HOLDER: {
				ReturnOperatorPlaceHolder returnOperatorPlaceHolder = (ReturnOperatorPlaceHolder)theEObject;
				T result = caseReturnOperatorPlaceHolder(returnOperatorPlaceHolder);
				if (result == null) result = caseInstruction(returnOperatorPlaceHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.OPERAND: {
				Operand operand = (Operand)theEObject;
				T result = caseOperand(operand);
				if (result == null) result = caseParamAssignmentOperand(operand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.SIMPLE_INSTRUCTION: {
				SimpleInstruction simpleInstruction = (SimpleInstruction)theEObject;
				T result = caseSimpleInstruction(simpleInstruction);
				if (result == null) result = caseParamAssignmentOperand(simpleInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.PARAM_INSTRUCTION: {
				ParamInstruction paramInstruction = (ParamInstruction)theEObject;
				T result = caseParamInstruction(paramInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.IL_PARAM_ASSIGNMENT: {
				IlParamAssignment ilParamAssignment = (IlParamAssignment)theEObject;
				T result = caseIlParamAssignment(ilParamAssignment);
				if (result == null) result = caseParamInstruction(ilParamAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.IL_PARAM_OUT_ASSIGNMENT: {
				IlParamOutAssignment ilParamOutAssignment = (IlParamOutAssignment)theEObject;
				T result = caseIlParamOutAssignment(ilParamOutAssignment);
				if (result == null) result = caseParamInstruction(ilParamOutAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.PARAM_ASSIGNMENT_OPERAND: {
				ParamAssignmentOperand paramAssignmentOperand = (ParamAssignmentOperand)theEObject;
				T result = caseParamAssignmentOperand(paramAssignmentOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.PARAM_LIST: {
				ParamList paramList = (ParamList)theEObject;
				T result = caseParamList(paramList);
				if (result == null) result = caseFBCallParamPlaceHolder(paramList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.OPERAND_LIST: {
				OperandList operandList = (OperandList)theEObject;
				T result = caseOperandList(operandList);
				if (result == null) result = caseFBCallParamPlaceHolder(operandList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.FB_CALL_PARAM_PLACE_HOLDER: {
				FBCallParamPlaceHolder fbCallParamPlaceHolder = (FBCallParamPlaceHolder)theEObject;
				T result = caseFBCallParamPlaceHolder(fbCallParamPlaceHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.IL_LABEL: {
				IlLabel ilLabel = (IlLabel)theEObject;
				T result = caseIlLabel(ilLabel);
				if (result == null) result = caseNamedElement(ilLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.OPERAND_CONSTANT: {
				OperandConstant operandConstant = (OperandConstant)theEObject;
				T result = caseOperandConstant(operandConstant);
				if (result == null) result = caseOperand(operandConstant);
				if (result == null) result = caseParamAssignmentOperand(operandConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.OPERAND_ENUMERATED_VALUE: {
				OperandEnumeratedValue operandEnumeratedValue = (OperandEnumeratedValue)theEObject;
				T result = caseOperandEnumeratedValue(operandEnumeratedValue);
				if (result == null) result = caseOperand(operandEnumeratedValue);
				if (result == null) result = caseParamAssignmentOperand(operandEnumeratedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.OPERAND_VARIABLE: {
				OperandVariable operandVariable = (OperandVariable)theEObject;
				T result = caseOperandVariable(operandVariable);
				if (result == null) result = caseOperand(operandVariable);
				if (result == null) result = caseParamAssignmentOperand(operandVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.SIMPLE_OPERATION_OPERAND: {
				SimpleOperationOperand simpleOperationOperand = (SimpleOperationOperand)theEObject;
				T result = caseSimpleOperationOperand(simpleOperationOperand);
				if (result == null) result = caseSimpleOperation(simpleOperationOperand);
				if (result == null) result = caseInstruction(simpleOperationOperand);
				if (result == null) result = caseSimpleInstruction(simpleOperationOperand);
				if (result == null) result = caseParamAssignmentOperand(simpleOperationOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IlPackage.SIMPLE_OPERATION_FUNCTION: {
				SimpleOperationFunction simpleOperationFunction = (SimpleOperationFunction)theEObject;
				T result = caseSimpleOperationFunction(simpleOperationFunction);
				if (result == null) result = caseSimpleOperation(simpleOperationFunction);
				if (result == null) result = caseInstruction(simpleOperationFunction);
				if (result == null) result = caseSimpleInstruction(simpleOperationFunction);
				if (result == null) result = caseParamAssignmentOperand(simpleOperationFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionList(InstructionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleOperation(SimpleOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumpOperation(JumpOperation object) {
		return null;
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
	public T caseIlExpression(IlExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FB Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FB Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIlFBCall(IlFBCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Funct Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Funct Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIlFormalFunctCall(IlFormalFunctCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Operator Place Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Operator Place Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnOperatorPlaceHolder(ReturnOperatorPlaceHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperand(Operand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleInstruction(SimpleInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamInstruction(ParamInstruction object) {
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
	public T caseIlParamAssignment(IlParamAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Out Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Out Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIlParamOutAssignment(IlParamOutAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Assignment Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Assignment Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamAssignmentOperand(ParamAssignmentOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamList(ParamList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operand List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operand List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperandList(OperandList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FB Call Param Place Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FB Call Param Place Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFBCallParamPlaceHolder(FBCallParamPlaceHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIlLabel(IlLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operand Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operand Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperandConstant(OperandConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operand Enumerated Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operand Enumerated Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperandEnumeratedValue(OperandEnumeratedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operand Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operand Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperandVariable(OperandVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Operation Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Operation Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleOperationOperand(SimpleOperationOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Operation Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Operation Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleOperationFunction(SimpleOperationFunction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
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

} //IlSwitch
