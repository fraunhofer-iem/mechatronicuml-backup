/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.pim.actionlanguage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.pim.actionlanguage.ActionlanguagePackage
 * @generated
 */
public class ActionlanguageValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ActionlanguageValidator INSTANCE = new ActionlanguageValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.pim.actionlanguage";

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
	public ActionlanguageValidator() {
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
	  return ActionlanguagePackage.eINSTANCE;
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
			case ActionlanguagePackage.BLOCK:
				return validateBlock((Block)value, diagnostics, context);
			case ActionlanguagePackage.LOOP:
				return validateLoop((Loop)value, diagnostics, context);
			case ActionlanguagePackage.WHILE_LOOP:
				return validateWhileLoop((WhileLoop)value, diagnostics, context);
			case ActionlanguagePackage.DO_WHILE_LOOP:
				return validateDoWhileLoop((DoWhileLoop)value, diagnostics, context);
			case ActionlanguagePackage.ASSIGNMENT:
				return validateAssignment((Assignment)value, diagnostics, context);
			case ActionlanguagePackage.FOR_LOOP:
				return validateForLoop((ForLoop)value, diagnostics, context);
			case ActionlanguagePackage.IF_STATEMENT:
				return validateIfStatement((IfStatement)value, diagnostics, context);
			case ActionlanguagePackage.OPERATION_CALL:
				return validateOperationCall((OperationCall)value, diagnostics, context);
			case ActionlanguagePackage.RETURN_STATEMENT:
				return validateReturnStatement((ReturnStatement)value, diagnostics, context);
			case ActionlanguagePackage.TRIGGER_MESSAGE_EXPRESSION:
				return validateTriggerMessageExpression((TriggerMessageExpression)value, diagnostics, context);
			case ActionlanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE:
				return validateDiscreteInteractionEndpointReference((DiscreteInteractionEndpointReference)value, diagnostics, context);
			case ActionlanguagePackage.POSITION_SELECTOR:
				return validatePositionSelector((PositionSelector)value, diagnostics, context);
			case ActionlanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT:
				return validateLocalVariableDeclarationStatement((LocalVariableDeclarationStatement)value, diagnostics, context);
			case ActionlanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION:
				return validateTypedNamedElementExpression((TypedNamedElementExpression)value, diagnostics, context);
			case ActionlanguagePackage.ARRAY_INITIALIZE_EXPRESSION:
				return validateArrayInitializeExpression((ArrayInitializeExpression)value, diagnostics, context);
			case ActionlanguagePackage.NONDETERMINISTIC_CHOICE_EXPRESSION:
				return validateNondeterministicChoiceExpression((NondeterministicChoiceExpression)value, diagnostics, context);
			case ActionlanguagePackage.TIME_VALUE_EXPRESSION:
				return validateTimeValueExpression((TimeValueExpression)value, diagnostics, context);
			case ActionlanguagePackage.TYPE_CAST_EXPRESSION:
				return validateTypeCastExpression((TypeCastExpression)value, diagnostics, context);
			case ActionlanguagePackage.ELEMENT_ACCESSOR_EXPRESSION:
				return validateElementAccessorExpression((ElementAccessorExpression)value, diagnostics, context);
			case ActionlanguagePackage.ARRAY_INDEX_EXPRESSION:
				return validateArrayIndexExpression((ArrayIndexExpression)value, diagnostics, context);
			case ActionlanguagePackage.ATTRIBUTE_ACCESSOR_EXPRESSION:
				return validateAttributeAccessorExpression((AttributeAccessorExpression)value, diagnostics, context);
			case ActionlanguagePackage.ELSE_IF_STATEMENT:
				return validateElseIfStatement((ElseIfStatement)value, diagnostics, context);
			case ActionlanguagePackage.MAX_MESSAGE_DELAY_REFERENCE_EXPRESSION:
				return validateMaxMessageDelayReferenceExpression((MaxMessageDelayReferenceExpression)value, diagnostics, context);
			case ActionlanguagePackage.ASSIGN_OPERATOR:
				return validateAssignOperator((AssignOperator)value, diagnostics, context);
			case ActionlanguagePackage.INCREMENT_DECREMENT_OPERATOR:
				return validateIncrementDecrementOperator((IncrementDecrementOperator)value, diagnostics, context);
			case ActionlanguagePackage.POSITION_SELECTOR_KIND:
				return validatePositionSelectorKind((PositionSelectorKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock(Block block, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(block, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoop(Loop loop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhileLoop(WhileLoop whileLoop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(whileLoop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoWhileLoop(DoWhileLoop doWhileLoop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doWhileLoop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignment(Assignment assignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assignment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForLoop(ForLoop forLoop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(forLoop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfStatement(IfStatement ifStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationCall(OperationCall operationCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationCall, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperationCall_ParameterBindingForEveryParameter(operationCall, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ParameterBindingForEveryParameter constraint of '<em>Operation Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION_CALL__PARAMETER_BINDING_FOR_EVERY_PARAMETER__EEXPRESSION = "-- An OperationCall must bind exactly one value to every parameter\n" +
		"not operation.oclIsUndefined() implies \n" +
		"operation.parameters->asBag() = parameterBinding.parameter->asBag()\n" +
		"-- author: bingo, adann";

	/**
	 * Validates the ParameterBindingForEveryParameter constraint of '<em>Operation Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationCall_ParameterBindingForEveryParameter(OperationCall operationCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionlanguagePackage.Literals.OPERATION_CALL,
				 operationCall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ParameterBindingForEveryParameter",
				 OPERATION_CALL__PARAMETER_BINDING_FOR_EVERY_PARAMETER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnStatement(ReturnStatement returnStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(returnStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerMessageExpression(TriggerMessageExpression triggerMessageExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerMessageExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteInteractionEndpointReference(DiscreteInteractionEndpointReference discreteInteractionEndpointReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discreteInteractionEndpointReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionSelector(PositionSelector positionSelector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positionSelector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalVariableDeclarationStatement(LocalVariableDeclarationStatement localVariableDeclarationStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(localVariableDeclarationStatement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(localVariableDeclarationStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(localVariableDeclarationStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(localVariableDeclarationStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(localVariableDeclarationStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(localVariableDeclarationStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(localVariableDeclarationStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(localVariableDeclarationStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(localVariableDeclarationStatement, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocalVariableDeclarationStatement_UniqueName(localVariableDeclarationStatement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueName constraint of '<em>Local Variable Declaration Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCAL_VARIABLE_DECLARATION_STATEMENT__UNIQUE_NAME__EEXPRESSION = "-- check if no variable with the same name was defined before\r\n" +
		"self.allSurroundingBlocks->collect(\r\n" +
		"\texpressions\r\n" +
		")->select(\r\n" +
		"\toclIsKindOf(LocalVariableDeclarationStatement)\r\n" +
		")->collect(\r\n" +
		"\toclAsType(LocalVariableDeclarationStatement)\r\n" +
		")->one(\r\n" +
		"\tvariable.name = self.variable.name\r\n" +
		")";

	/**
	 * Validates the UniqueName constraint of '<em>Local Variable Declaration Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalVariableDeclarationStatement_UniqueName(LocalVariableDeclarationStatement localVariableDeclarationStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionlanguagePackage.Literals.LOCAL_VARIABLE_DECLARATION_STATEMENT,
				 localVariableDeclarationStatement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueName",
				 LOCAL_VARIABLE_DECLARATION_STATEMENT__UNIQUE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedNamedElementExpression(TypedNamedElementExpression typedNamedElementExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typedNamedElementExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayInitializeExpression(ArrayInitializeExpression arrayInitializeExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayInitializeExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNondeterministicChoiceExpression(NondeterministicChoiceExpression nondeterministicChoiceExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nondeterministicChoiceExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeValueExpression(TimeValueExpression timeValueExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeValueExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeCastExpression(TypeCastExpression typeCastExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeCastExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementAccessorExpression(ElementAccessorExpression elementAccessorExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementAccessorExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayIndexExpression(ArrayIndexExpression arrayIndexExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayIndexExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeAccessorExpression(AttributeAccessorExpression attributeAccessorExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeAccessorExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElseIfStatement(ElseIfStatement elseIfStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elseIfStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxMessageDelayReferenceExpression(MaxMessageDelayReferenceExpression maxMessageDelayReferenceExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maxMessageDelayReferenceExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignOperator(AssignOperator assignOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncrementDecrementOperator(IncrementDecrementOperator incrementDecrementOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionSelectorKind(PositionSelectorKind positionSelectorKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ActionlanguageValidator
