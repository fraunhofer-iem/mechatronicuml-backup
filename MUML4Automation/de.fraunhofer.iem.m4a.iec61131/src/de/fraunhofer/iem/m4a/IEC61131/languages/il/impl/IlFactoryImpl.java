/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il.impl;

import de.fraunhofer.iem.m4a.IEC61131.languages.il.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class IlFactoryImpl extends EFactoryImpl implements IlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IlFactory init() {
		try {
			IlFactory theIlFactory = (IlFactory)EPackage.Registry.INSTANCE.getEFactory(IlPackage.eNS_URI);
			if (theIlFactory != null) {
				return theIlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlFactoryImpl() {
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
			case IlPackage.INSTRUCTION_LIST: return createInstructionList();
			case IlPackage.JUMP_OPERATION: return createJumpOperation();
			case IlPackage.IL_EXPRESSION: return createIlExpression();
			case IlPackage.IL_FB_CALL: return createIlFBCall();
			case IlPackage.IL_FORMAL_FUNCT_CALL: return createIlFormalFunctCall();
			case IlPackage.RETURN_OPERATOR_PLACE_HOLDER: return createReturnOperatorPlaceHolder();
			case IlPackage.IL_PARAM_ASSIGNMENT: return createIlParamAssignment();
			case IlPackage.IL_PARAM_OUT_ASSIGNMENT: return createIlParamOutAssignment();
			case IlPackage.PARAM_LIST: return createParamList();
			case IlPackage.OPERAND_LIST: return createOperandList();
			case IlPackage.IL_LABEL: return createIlLabel();
			case IlPackage.OPERAND_CONSTANT: return createOperandConstant();
			case IlPackage.OPERAND_ENUMERATED_VALUE: return createOperandEnumeratedValue();
			case IlPackage.OPERAND_VARIABLE: return createOperandVariable();
			case IlPackage.SIMPLE_OPERATION_OPERAND: return createSimpleOperationOperand();
			case IlPackage.SIMPLE_OPERATION_FUNCTION: return createSimpleOperationFunction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IlPackage.SIMPLE_OPERATOR:
				return createSimpleOperatorFromString(eDataType, initialValue);
			case IlPackage.EXPR_OPERATOR:
				return createExprOperatorFromString(eDataType, initialValue);
			case IlPackage.JUMP_OPERATOR:
				return createJumpOperatorFromString(eDataType, initialValue);
			case IlPackage.CALL_OPERATOR:
				return createCallOperatorFromString(eDataType, initialValue);
			case IlPackage.RETURN_OPERATOR:
				return createReturnOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IlPackage.SIMPLE_OPERATOR:
				return convertSimpleOperatorToString(eDataType, instanceValue);
			case IlPackage.EXPR_OPERATOR:
				return convertExprOperatorToString(eDataType, instanceValue);
			case IlPackage.JUMP_OPERATOR:
				return convertJumpOperatorToString(eDataType, instanceValue);
			case IlPackage.CALL_OPERATOR:
				return convertCallOperatorToString(eDataType, instanceValue);
			case IlPackage.RETURN_OPERATOR:
				return convertReturnOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionList createInstructionList() {
		InstructionListImpl instructionList = new InstructionListImpl();
		return instructionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpOperation createJumpOperation() {
		JumpOperationImpl jumpOperation = new JumpOperationImpl();
		return jumpOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlExpression createIlExpression() {
		IlExpressionImpl ilExpression = new IlExpressionImpl();
		return ilExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlFBCall createIlFBCall() {
		IlFBCallImpl ilFBCall = new IlFBCallImpl();
		return ilFBCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlFormalFunctCall createIlFormalFunctCall() {
		IlFormalFunctCallImpl ilFormalFunctCall = new IlFormalFunctCallImpl();
		return ilFormalFunctCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnOperatorPlaceHolder createReturnOperatorPlaceHolder() {
		ReturnOperatorPlaceHolderImpl returnOperatorPlaceHolder = new ReturnOperatorPlaceHolderImpl();
		return returnOperatorPlaceHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlParamAssignment createIlParamAssignment() {
		IlParamAssignmentImpl ilParamAssignment = new IlParamAssignmentImpl();
		return ilParamAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlParamOutAssignment createIlParamOutAssignment() {
		IlParamOutAssignmentImpl ilParamOutAssignment = new IlParamOutAssignmentImpl();
		return ilParamOutAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamList createParamList() {
		ParamListImpl paramList = new ParamListImpl();
		return paramList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperandList createOperandList() {
		OperandListImpl operandList = new OperandListImpl();
		return operandList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlLabel createIlLabel() {
		IlLabelImpl ilLabel = new IlLabelImpl();
		return ilLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperandConstant createOperandConstant() {
		OperandConstantImpl operandConstant = new OperandConstantImpl();
		return operandConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperandEnumeratedValue createOperandEnumeratedValue() {
		OperandEnumeratedValueImpl operandEnumeratedValue = new OperandEnumeratedValueImpl();
		return operandEnumeratedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperandVariable createOperandVariable() {
		OperandVariableImpl operandVariable = new OperandVariableImpl();
		return operandVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleOperationOperand createSimpleOperationOperand() {
		SimpleOperationOperandImpl simpleOperationOperand = new SimpleOperationOperandImpl();
		return simpleOperationOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleOperationFunction createSimpleOperationFunction() {
		SimpleOperationFunctionImpl simpleOperationFunction = new SimpleOperationFunctionImpl();
		return simpleOperationFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleOperator createSimpleOperatorFromString(EDataType eDataType, String initialValue) {
		SimpleOperator result = SimpleOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExprOperator createExprOperatorFromString(EDataType eDataType, String initialValue) {
		ExprOperator result = ExprOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExprOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpOperator createJumpOperatorFromString(EDataType eDataType, String initialValue) {
		JumpOperator result = JumpOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJumpOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperator createCallOperatorFromString(EDataType eDataType, String initialValue) {
		CallOperator result = CallOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnOperator createReturnOperatorFromString(EDataType eDataType, String initialValue) {
		ReturnOperator result = ReturnOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReturnOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlPackage getIlPackage() {
		return (IlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IlPackage getPackage() {
		return IlPackage.eINSTANCE;
	}

} //IlFactoryImpl
