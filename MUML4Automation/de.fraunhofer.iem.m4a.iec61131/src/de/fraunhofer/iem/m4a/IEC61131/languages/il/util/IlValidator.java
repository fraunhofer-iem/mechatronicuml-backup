/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il.util;

import de.fraunhofer.iem.m4a.IEC61131.languages.il.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage
 * @generated
 */
public class IlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final IlValidator INSTANCE = new IlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.fraunhofer.iem.m4a.IEC61131.languages.il";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return IlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case IlPackage.INSTRUCTION_LIST:
				return validateInstructionList((InstructionList)value, diagnostics, context);
			case IlPackage.INSTRUCTION:
				return validateInstruction((Instruction)value, diagnostics, context);
			case IlPackage.SIMPLE_OPERATION:
				return validateSimpleOperation((SimpleOperation)value, diagnostics, context);
			case IlPackage.JUMP_OPERATION:
				return validateJumpOperation((JumpOperation)value, diagnostics, context);
			case IlPackage.IL_EXPRESSION:
				return validateIlExpression((IlExpression)value, diagnostics, context);
			case IlPackage.IL_FB_CALL:
				return validateIlFBCall((IlFBCall)value, diagnostics, context);
			case IlPackage.IL_FORMAL_FUNCT_CALL:
				return validateIlFormalFunctCall((IlFormalFunctCall)value, diagnostics, context);
			case IlPackage.RETURN_OPERATOR_PLACE_HOLDER:
				return validateReturnOperatorPlaceHolder((ReturnOperatorPlaceHolder)value, diagnostics, context);
			case IlPackage.OPERAND:
				return validateOperand((Operand)value, diagnostics, context);
			case IlPackage.SIMPLE_INSTRUCTION:
				return validateSimpleInstruction((SimpleInstruction)value, diagnostics, context);
			case IlPackage.PARAM_INSTRUCTION:
				return validateParamInstruction((ParamInstruction)value, diagnostics, context);
			case IlPackage.IL_PARAM_ASSIGNMENT:
				return validateIlParamAssignment((IlParamAssignment)value, diagnostics, context);
			case IlPackage.IL_PARAM_OUT_ASSIGNMENT:
				return validateIlParamOutAssignment((IlParamOutAssignment)value, diagnostics, context);
			case IlPackage.PARAM_ASSIGNMENT_OPERAND:
				return validateParamAssignmentOperand((ParamAssignmentOperand)value, diagnostics, context);
			case IlPackage.PARAM_LIST:
				return validateParamList((ParamList)value, diagnostics, context);
			case IlPackage.OPERAND_LIST:
				return validateOperandList((OperandList)value, diagnostics, context);
			case IlPackage.FB_CALL_PARAM_PLACE_HOLDER:
				return validateFBCallParamPlaceHolder((FBCallParamPlaceHolder)value, diagnostics, context);
			case IlPackage.IL_LABEL:
				return validateIlLabel((IlLabel)value, diagnostics, context);
			case IlPackage.OPERAND_CONSTANT:
				return validateOperandConstant((OperandConstant)value, diagnostics, context);
			case IlPackage.OPERAND_ENUMERATED_VALUE:
				return validateOperandEnumeratedValue((OperandEnumeratedValue)value, diagnostics, context);
			case IlPackage.OPERAND_VARIABLE:
				return validateOperandVariable((OperandVariable)value, diagnostics, context);
			case IlPackage.SIMPLE_OPERATION_OPERAND:
				return validateSimpleOperationOperand((SimpleOperationOperand)value, diagnostics, context);
			case IlPackage.SIMPLE_OPERATION_FUNCTION:
				return validateSimpleOperationFunction((SimpleOperationFunction)value, diagnostics, context);
			case IlPackage.SIMPLE_OPERATOR:
				return validateSimpleOperator((SimpleOperator)value, diagnostics, context);
			case IlPackage.EXPR_OPERATOR:
				return validateExprOperator((ExprOperator)value, diagnostics, context);
			case IlPackage.JUMP_OPERATOR:
				return validateJumpOperator((JumpOperator)value, diagnostics, context);
			case IlPackage.CALL_OPERATOR:
				return validateCallOperator((CallOperator)value, diagnostics, context);
			case IlPackage.RETURN_OPERATOR:
				return validateReturnOperator((ReturnOperator)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionList(InstructionList instructionList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instructionList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstruction(Instruction instruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleOperation(SimpleOperation simpleOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJumpOperation(JumpOperation jumpOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jumpOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIlExpression(IlExpression ilExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ilExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIlFBCall(IlFBCall ilFBCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ilFBCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIlFormalFunctCall(IlFormalFunctCall ilFormalFunctCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ilFormalFunctCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnOperatorPlaceHolder(ReturnOperatorPlaceHolder returnOperatorPlaceHolder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(returnOperatorPlaceHolder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperand(Operand operand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleInstruction(SimpleInstruction simpleInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleInstruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamInstruction(ParamInstruction paramInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paramInstruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIlParamAssignment(IlParamAssignment ilParamAssignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ilParamAssignment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIlParamOutAssignment(IlParamOutAssignment ilParamOutAssignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ilParamOutAssignment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ilParamOutAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ilParamOutAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ilParamOutAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ilParamOutAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ilParamOutAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ilParamOutAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ilParamOutAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ilParamOutAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validateIlParamOutAssignment_isLastElementInList(ilParamOutAssignment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the isLastElementInList constraint of '<em>Param Out Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIlParamOutAssignment_isLastElementInList(IlParamOutAssignment ilParamOutAssignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "isLastElementInList", getObjectLabel(ilParamOutAssignment, context) },
						 new Object[] { ilParamOutAssignment },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamAssignmentOperand(ParamAssignmentOperand paramAssignmentOperand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paramAssignmentOperand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamList(ParamList paramList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paramList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperandList(OperandList operandList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operandList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFBCallParamPlaceHolder(FBCallParamPlaceHolder fbCallParamPlaceHolder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fbCallParamPlaceHolder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIlLabel(IlLabel ilLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ilLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperandConstant(OperandConstant operandConstant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operandConstant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperandEnumeratedValue(OperandEnumeratedValue operandEnumeratedValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operandEnumeratedValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperandVariable(OperandVariable operandVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operandVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleOperationOperand(SimpleOperationOperand simpleOperationOperand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(simpleOperationOperand, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(simpleOperationOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(simpleOperationOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(simpleOperationOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(simpleOperationOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(simpleOperationOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(simpleOperationOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(simpleOperationOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(simpleOperationOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimpleOperationOperand_hasOnlyOneOperator(simpleOperationOperand, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasOnlyOneOperator constraint of '<em>Simple Operation Operand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleOperationOperand_hasOnlyOneOperator(SimpleOperationOperand simpleOperationOperand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasOnlyOneOperator", getObjectLabel(simpleOperationOperand, context) },
						 new Object[] { simpleOperationOperand },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleOperationFunction(SimpleOperationFunction simpleOperationFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleOperationFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleOperator(SimpleOperator simpleOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExprOperator(ExprOperator exprOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJumpOperator(JumpOperator jumpOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallOperator(CallOperator callOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnOperator(ReturnOperator returnOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //IlValidator
