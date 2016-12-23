/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.pim.actionlanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionlanguageFactoryImpl extends EFactoryImpl implements ActionlanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionlanguageFactory init() {
		try {
			ActionlanguageFactory theActionlanguageFactory = (ActionlanguageFactory)EPackage.Registry.INSTANCE.getEFactory(ActionlanguagePackage.eNS_URI);
			if (theActionlanguageFactory != null) {
				return theActionlanguageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActionlanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionlanguageFactoryImpl() {
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
			case ActionlanguagePackage.BLOCK: return createBlock();
			case ActionlanguagePackage.WHILE_LOOP: return createWhileLoop();
			case ActionlanguagePackage.DO_WHILE_LOOP: return createDoWhileLoop();
			case ActionlanguagePackage.ASSIGNMENT: return createAssignment();
			case ActionlanguagePackage.FOR_LOOP: return createForLoop();
			case ActionlanguagePackage.IF_STATEMENT: return createIfStatement();
			case ActionlanguagePackage.OPERATION_CALL: return createOperationCall();
			case ActionlanguagePackage.RETURN_STATEMENT: return createReturnStatement();
			case ActionlanguagePackage.TRIGGER_MESSAGE_EXPRESSION: return createTriggerMessageExpression();
			case ActionlanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE: return createDiscreteInteractionEndpointReference();
			case ActionlanguagePackage.POSITION_SELECTOR: return createPositionSelector();
			case ActionlanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT: return createLocalVariableDeclarationStatement();
			case ActionlanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION: return createTypedNamedElementExpression();
			case ActionlanguagePackage.ARRAY_INITIALIZE_EXPRESSION: return createArrayInitializeExpression();
			case ActionlanguagePackage.NONDETERMINISTIC_CHOICE_EXPRESSION: return createNondeterministicChoiceExpression();
			case ActionlanguagePackage.TIME_VALUE_EXPRESSION: return createTimeValueExpression();
			case ActionlanguagePackage.TYPE_CAST_EXPRESSION: return createTypeCastExpression();
			case ActionlanguagePackage.ARRAY_INDEX_EXPRESSION: return createArrayIndexExpression();
			case ActionlanguagePackage.ATTRIBUTE_ACCESSOR_EXPRESSION: return createAttributeAccessorExpression();
			case ActionlanguagePackage.ELSE_IF_STATEMENT: return createElseIfStatement();
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
			case ActionlanguagePackage.ASSIGN_OPERATOR:
				return createAssignOperatorFromString(eDataType, initialValue);
			case ActionlanguagePackage.INCREMENT_DECREMENT_OPERATOR:
				return createIncrementDecrementOperatorFromString(eDataType, initialValue);
			case ActionlanguagePackage.POSITION_SELECTOR_KIND:
				return createPositionSelectorKindFromString(eDataType, initialValue);
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
			case ActionlanguagePackage.ASSIGN_OPERATOR:
				return convertAssignOperatorToString(eDataType, instanceValue);
			case ActionlanguagePackage.INCREMENT_DECREMENT_OPERATOR:
				return convertIncrementDecrementOperatorToString(eDataType, instanceValue);
			case ActionlanguagePackage.POSITION_SELECTOR_KIND:
				return convertPositionSelectorKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileLoop createWhileLoop() {
		WhileLoopImpl whileLoop = new WhileLoopImpl();
		return whileLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoWhileLoop createDoWhileLoop() {
		DoWhileLoopImpl doWhileLoop = new DoWhileLoopImpl();
		return doWhileLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForLoop createForLoop() {
		ForLoopImpl forLoop = new ForLoopImpl();
		return forLoop;
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
	public OperationCall createOperationCall() {
		OperationCallImpl operationCall = new OperationCallImpl();
		return operationCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnStatement createReturnStatement() {
		ReturnStatementImpl returnStatement = new ReturnStatementImpl();
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerMessageExpression createTriggerMessageExpression() {
		TriggerMessageExpressionImpl triggerMessageExpression = new TriggerMessageExpressionImpl();
		return triggerMessageExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteInteractionEndpointReference createDiscreteInteractionEndpointReference() {
		DiscreteInteractionEndpointReferenceImpl discreteInteractionEndpointReference = new DiscreteInteractionEndpointReferenceImpl();
		return discreteInteractionEndpointReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionSelector createPositionSelector() {
		PositionSelectorImpl positionSelector = new PositionSelectorImpl();
		return positionSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariableDeclarationStatement createLocalVariableDeclarationStatement() {
		LocalVariableDeclarationStatementImpl localVariableDeclarationStatement = new LocalVariableDeclarationStatementImpl();
		return localVariableDeclarationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedNamedElementExpression createTypedNamedElementExpression() {
		TypedNamedElementExpressionImpl typedNamedElementExpression = new TypedNamedElementExpressionImpl();
		return typedNamedElementExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInitializeExpression createArrayInitializeExpression() {
		ArrayInitializeExpressionImpl arrayInitializeExpression = new ArrayInitializeExpressionImpl();
		return arrayInitializeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NondeterministicChoiceExpression createNondeterministicChoiceExpression() {
		NondeterministicChoiceExpressionImpl nondeterministicChoiceExpression = new NondeterministicChoiceExpressionImpl();
		return nondeterministicChoiceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValueExpression createTimeValueExpression() {
		TimeValueExpressionImpl timeValueExpression = new TimeValueExpressionImpl();
		return timeValueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCastExpression createTypeCastExpression() {
		TypeCastExpressionImpl typeCastExpression = new TypeCastExpressionImpl();
		return typeCastExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayIndexExpression createArrayIndexExpression() {
		ArrayIndexExpressionImpl arrayIndexExpression = new ArrayIndexExpressionImpl();
		return arrayIndexExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAccessorExpression createAttributeAccessorExpression() {
		AttributeAccessorExpressionImpl attributeAccessorExpression = new AttributeAccessorExpressionImpl();
		return attributeAccessorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseIfStatement createElseIfStatement() {
		ElseIfStatementImpl elseIfStatement = new ElseIfStatementImpl();
		return elseIfStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignOperator createAssignOperatorFromString(EDataType eDataType, String initialValue) {
		AssignOperator result = AssignOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssignOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementDecrementOperator createIncrementDecrementOperatorFromString(EDataType eDataType, String initialValue) {
		IncrementDecrementOperator result = IncrementDecrementOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIncrementDecrementOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionSelectorKind createPositionSelectorKindFromString(EDataType eDataType, String initialValue) {
		PositionSelectorKind result = PositionSelectorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionSelectorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionlanguagePackage getActionlanguagePackage() {
		return (ActionlanguagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActionlanguagePackage getPackage() {
		return ActionlanguagePackage.eINSTANCE;
	}

} //ActionlanguageFactoryImpl
