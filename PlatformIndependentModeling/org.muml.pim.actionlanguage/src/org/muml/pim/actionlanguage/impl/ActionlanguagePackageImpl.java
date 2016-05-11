/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.core.expressions.ExpressionsPackage;
import org.muml.pim.PimPackage;
import org.muml.pim.actionlanguage.ActionlanguageFactory;
import org.muml.pim.actionlanguage.ActionlanguagePackage;
import org.muml.pim.actionlanguage.ArrayIndexExpression;
import org.muml.pim.actionlanguage.ArrayInitializeExpression;
import org.muml.pim.actionlanguage.AssignOperator;
import org.muml.pim.actionlanguage.Assignment;
import org.muml.pim.actionlanguage.AttributeAccessorExpression;
import org.muml.pim.actionlanguage.Block;
import org.muml.pim.actionlanguage.DiscreteInteractionEndpointReference;
import org.muml.pim.actionlanguage.DoWhileLoop;
import org.muml.pim.actionlanguage.ElementAccessorExpression;
import org.muml.pim.actionlanguage.ElseIfStatement;
import org.muml.pim.actionlanguage.ForLoop;
import org.muml.pim.actionlanguage.IfStatement;
import org.muml.pim.actionlanguage.IncrementDecrementOperator;
import org.muml.pim.actionlanguage.LocalVariableDeclarationStatement;
import org.muml.pim.actionlanguage.Loop;
import org.muml.pim.actionlanguage.NondeterministicChoiceExpression;
import org.muml.pim.actionlanguage.OperationCall;
import org.muml.pim.actionlanguage.PositionSelector;
import org.muml.pim.actionlanguage.PositionSelectorKind;
import org.muml.pim.actionlanguage.ReturnStatement;
import org.muml.pim.actionlanguage.TimeValueExpression;
import org.muml.pim.actionlanguage.TriggerMessageExpression;
import org.muml.pim.actionlanguage.TypeCastExpression;
import org.muml.pim.actionlanguage.TypedNamedElementExpression;
import org.muml.pim.actionlanguage.WhileLoop;
import org.muml.pim.actionlanguage.util.ActionlanguageValidator;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.constraint.ConstraintPackage;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.pattern.PatternPackage;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.types.TypesPackage;
import org.muml.pim.valuetype.ValuetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionlanguagePackageImpl extends EPackageImpl implements ActionlanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doWhileLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerMessageExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteInteractionEndpointReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localVariableDeclarationStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedNamedElementExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInitializeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nondeterministicChoiceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeValueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeCastExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementAccessorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayIndexExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeAccessorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseIfStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assignOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum incrementDecrementOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionSelectorKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActionlanguagePackageImpl() {
		super(eNS_URI, ActionlanguageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ActionlanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActionlanguagePackage init() {
		if (isInited) return (ActionlanguagePackage)EPackage.Registry.INSTANCE.getEPackage(ActionlanguagePackage.eNS_URI);

		// Obtain or create and register package
		ActionlanguagePackageImpl theActionlanguagePackage = (ActionlanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActionlanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActionlanguagePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PimPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theActionlanguagePackage.createPackageContents();

		// Initialize created meta-data
		theActionlanguagePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theActionlanguagePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ActionlanguageValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theActionlanguagePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActionlanguagePackage.eNS_URI, theActionlanguagePackage);
		return theActionlanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Expressions() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_Block() {
		return (EReference)loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_LoopTest() {
		return (EReference)loopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileLoop() {
		return whileLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoWhileLoop() {
		return doWhileLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_AssignOperator() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Rhs_assignExpression() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_IncrementDecrementOperator() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Lhs_typedNamedElementExpression() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForLoop() {
		return forLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForLoop_InitializeExpression() {
		return (EReference)forLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForLoop_CountingExpression() {
		return (EReference)forLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStatement() {
		return ifStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_IfCondition() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_IfBlock() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_ElseBlock() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_ElseIfStatements() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationCall() {
		return operationCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationCall_Operation() {
		return (EReference)operationCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationCall_ParameterBinding() {
		return (EReference)operationCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnStatement() {
		return returnStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnStatement_Expression() {
		return (EReference)returnStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerMessageExpression() {
		return triggerMessageExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerMessageExpression_MessageType() {
		return (EReference)triggerMessageExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerMessageExpression_Parameter() {
		return (EReference)triggerMessageExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteInteractionEndpointReference() {
		return discreteInteractionEndpointReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteInteractionEndpointReference_TypedNamedElementExpression() {
		return (EReference)discreteInteractionEndpointReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteInteractionEndpointReference_Position() {
		return (EReference)discreteInteractionEndpointReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionSelector() {
		return positionSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionSelector_Kind() {
		return (EAttribute)positionSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionSelector_Successor() {
		return (EReference)positionSelectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalVariableDeclarationStatement() {
		return localVariableDeclarationStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalVariableDeclarationStatement_Variable() {
		return (EReference)localVariableDeclarationStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalVariableDeclarationStatement_AllSurroundingBlocks() {
		return (EReference)localVariableDeclarationStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedNamedElementExpression() {
		return typedNamedElementExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedNamedElementExpression_TypedNamedElement() {
		return (EReference)typedNamedElementExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedNamedElementExpression_ElementAccessors() {
		return (EReference)typedNamedElementExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInitializeExpression() {
		return arrayInitializeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayInitializeExpression_Expressions() {
		return (EReference)arrayInitializeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNondeterministicChoiceExpression() {
		return nondeterministicChoiceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNondeterministicChoiceExpression_Range() {
		return (EReference)nondeterministicChoiceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNondeterministicChoiceExpression_DataType() {
		return (EReference)nondeterministicChoiceExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeValueExpression() {
		return timeValueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeValueExpression_TimeValue() {
		return (EReference)timeValueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeCastExpression() {
		return typeCastExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeCastExpression_DataType() {
		return (EReference)typeCastExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeCastExpression_EnclosedExpression() {
		return (EReference)typeCastExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementAccessorExpression() {
		return elementAccessorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayIndexExpression() {
		return arrayIndexExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayIndexExpression_Index() {
		return (EReference)arrayIndexExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeAccessorExpression() {
		return attributeAccessorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAccessorExpression_Attribute() {
		return (EReference)attributeAccessorExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElseIfStatement() {
		return elseIfStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElseIfStatement_ElseIfCondition() {
		return (EReference)elseIfStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElseIfStatement_ElseIfBlock() {
		return (EReference)elseIfStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssignOperator() {
		return assignOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIncrementDecrementOperator() {
		return incrementDecrementOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPositionSelectorKind() {
		return positionSelectorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionlanguageFactory getActionlanguageFactory() {
		return (ActionlanguageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__EXPRESSIONS);

		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__BLOCK);
		createEReference(loopEClass, LOOP__LOOP_TEST);

		whileLoopEClass = createEClass(WHILE_LOOP);

		doWhileLoopEClass = createEClass(DO_WHILE_LOOP);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEAttribute(assignmentEClass, ASSIGNMENT__ASSIGN_OPERATOR);
		createEReference(assignmentEClass, ASSIGNMENT__RHS_ASSIGN_EXPRESSION);
		createEAttribute(assignmentEClass, ASSIGNMENT__INCREMENT_DECREMENT_OPERATOR);
		createEReference(assignmentEClass, ASSIGNMENT__LHS_TYPED_NAMED_ELEMENT_EXPRESSION);

		forLoopEClass = createEClass(FOR_LOOP);
		createEReference(forLoopEClass, FOR_LOOP__INITIALIZE_EXPRESSION);
		createEReference(forLoopEClass, FOR_LOOP__COUNTING_EXPRESSION);

		ifStatementEClass = createEClass(IF_STATEMENT);
		createEReference(ifStatementEClass, IF_STATEMENT__IF_CONDITION);
		createEReference(ifStatementEClass, IF_STATEMENT__IF_BLOCK);
		createEReference(ifStatementEClass, IF_STATEMENT__ELSE_BLOCK);
		createEReference(ifStatementEClass, IF_STATEMENT__ELSE_IF_STATEMENTS);

		operationCallEClass = createEClass(OPERATION_CALL);
		createEReference(operationCallEClass, OPERATION_CALL__OPERATION);
		createEReference(operationCallEClass, OPERATION_CALL__PARAMETER_BINDING);

		returnStatementEClass = createEClass(RETURN_STATEMENT);
		createEReference(returnStatementEClass, RETURN_STATEMENT__EXPRESSION);

		triggerMessageExpressionEClass = createEClass(TRIGGER_MESSAGE_EXPRESSION);
		createEReference(triggerMessageExpressionEClass, TRIGGER_MESSAGE_EXPRESSION__MESSAGE_TYPE);
		createEReference(triggerMessageExpressionEClass, TRIGGER_MESSAGE_EXPRESSION__PARAMETER);

		discreteInteractionEndpointReferenceEClass = createEClass(DISCRETE_INTERACTION_ENDPOINT_REFERENCE);
		createEReference(discreteInteractionEndpointReferenceEClass, DISCRETE_INTERACTION_ENDPOINT_REFERENCE__TYPED_NAMED_ELEMENT_EXPRESSION);
		createEReference(discreteInteractionEndpointReferenceEClass, DISCRETE_INTERACTION_ENDPOINT_REFERENCE__POSITION);

		positionSelectorEClass = createEClass(POSITION_SELECTOR);
		createEAttribute(positionSelectorEClass, POSITION_SELECTOR__KIND);
		createEReference(positionSelectorEClass, POSITION_SELECTOR__SUCCESSOR);

		localVariableDeclarationStatementEClass = createEClass(LOCAL_VARIABLE_DECLARATION_STATEMENT);
		createEReference(localVariableDeclarationStatementEClass, LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE);
		createEReference(localVariableDeclarationStatementEClass, LOCAL_VARIABLE_DECLARATION_STATEMENT__ALL_SURROUNDING_BLOCKS);

		typedNamedElementExpressionEClass = createEClass(TYPED_NAMED_ELEMENT_EXPRESSION);
		createEReference(typedNamedElementExpressionEClass, TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT);
		createEReference(typedNamedElementExpressionEClass, TYPED_NAMED_ELEMENT_EXPRESSION__ELEMENT_ACCESSORS);

		arrayInitializeExpressionEClass = createEClass(ARRAY_INITIALIZE_EXPRESSION);
		createEReference(arrayInitializeExpressionEClass, ARRAY_INITIALIZE_EXPRESSION__EXPRESSIONS);

		nondeterministicChoiceExpressionEClass = createEClass(NONDETERMINISTIC_CHOICE_EXPRESSION);
		createEReference(nondeterministicChoiceExpressionEClass, NONDETERMINISTIC_CHOICE_EXPRESSION__RANGE);
		createEReference(nondeterministicChoiceExpressionEClass, NONDETERMINISTIC_CHOICE_EXPRESSION__DATA_TYPE);

		timeValueExpressionEClass = createEClass(TIME_VALUE_EXPRESSION);
		createEReference(timeValueExpressionEClass, TIME_VALUE_EXPRESSION__TIME_VALUE);

		typeCastExpressionEClass = createEClass(TYPE_CAST_EXPRESSION);
		createEReference(typeCastExpressionEClass, TYPE_CAST_EXPRESSION__DATA_TYPE);
		createEReference(typeCastExpressionEClass, TYPE_CAST_EXPRESSION__ENCLOSED_EXPRESSION);

		elementAccessorExpressionEClass = createEClass(ELEMENT_ACCESSOR_EXPRESSION);

		arrayIndexExpressionEClass = createEClass(ARRAY_INDEX_EXPRESSION);
		createEReference(arrayIndexExpressionEClass, ARRAY_INDEX_EXPRESSION__INDEX);

		attributeAccessorExpressionEClass = createEClass(ATTRIBUTE_ACCESSOR_EXPRESSION);
		createEReference(attributeAccessorExpressionEClass, ATTRIBUTE_ACCESSOR_EXPRESSION__ATTRIBUTE);

		elseIfStatementEClass = createEClass(ELSE_IF_STATEMENT);
		createEReference(elseIfStatementEClass, ELSE_IF_STATEMENT__ELSE_IF_CONDITION);
		createEReference(elseIfStatementEClass, ELSE_IF_STATEMENT__ELSE_IF_BLOCK);

		// Create enums
		assignOperatorEEnum = createEEnum(ASSIGN_OPERATOR);
		incrementDecrementOperatorEEnum = createEEnum(INCREMENT_DECREMENT_OPERATOR);
		positionSelectorKindEEnum = createEEnum(POSITION_SELECTOR_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		MsgtypePackage theMsgtypePackage = (MsgtypePackage)EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		blockEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		loopEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		whileLoopEClass.getESuperTypes().add(this.getLoop());
		doWhileLoopEClass.getESuperTypes().add(this.getLoop());
		assignmentEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		forLoopEClass.getESuperTypes().add(this.getLoop());
		ifStatementEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		operationCallEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		returnStatementEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		triggerMessageExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		discreteInteractionEndpointReferenceEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		positionSelectorEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		localVariableDeclarationStatementEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		typedNamedElementExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		arrayInitializeExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		nondeterministicChoiceExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		timeValueExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		typeCastExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		elementAccessorExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		arrayIndexExpressionEClass.getESuperTypes().add(this.getElementAccessorExpression());
		attributeAccessorExpressionEClass.getESuperTypes().add(this.getElementAccessorExpression());
		elseIfStatementEClass.getESuperTypes().add(theCorePackage.getCommentableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Expressions(), theExpressionsPackage.getExpression(), null, "expressions", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopEClass, Loop.class, "Loop", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_Block(), this.getBlock(), null, "block", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_LoopTest(), theExpressionsPackage.getExpression(), null, "loopTest", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileLoopEClass, WhileLoop.class, "WhileLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(doWhileLoopEClass, DoWhileLoop.class, "DoWhileLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignment_AssignOperator(), this.getAssignOperator(), "assignOperator", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_Rhs_assignExpression(), theExpressionsPackage.getExpression(), null, "rhs_assignExpression", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignment_IncrementDecrementOperator(), this.getIncrementDecrementOperator(), "incrementDecrementOperator", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_Lhs_typedNamedElementExpression(), this.getTypedNamedElementExpression(), null, "lhs_typedNamedElementExpression", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forLoopEClass, ForLoop.class, "ForLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForLoop_InitializeExpression(), this.getAssignment(), null, "initializeExpression", null, 0, 1, ForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForLoop_CountingExpression(), this.getAssignment(), null, "countingExpression", null, 0, 1, ForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfStatement_IfCondition(), theExpressionsPackage.getExpression(), null, "ifCondition", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_IfBlock(), this.getBlock(), null, "ifBlock", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_ElseBlock(), this.getBlock(), null, "elseBlock", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_ElseIfStatements(), this.getElseIfStatement(), null, "elseIfStatements", null, 0, -1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationCallEClass, OperationCall.class, "OperationCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationCall_Operation(), theBehaviorPackage.getOperation(), null, "operation", null, 1, 1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationCall_ParameterBinding(), theBehaviorPackage.getParameterBinding(), null, "parameterBinding", null, 0, -1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnStatementEClass, ReturnStatement.class, "ReturnStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnStatement_Expression(), theExpressionsPackage.getExpression(), null, "expression", null, 0, 1, ReturnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerMessageExpressionEClass, TriggerMessageExpression.class, "TriggerMessageExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTriggerMessageExpression_MessageType(), theMsgtypePackage.getMessageType(), null, "messageType", null, 1, 1, TriggerMessageExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerMessageExpression_Parameter(), theBehaviorPackage.getParameter(), null, "parameter", null, 1, 1, TriggerMessageExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discreteInteractionEndpointReferenceEClass, DiscreteInteractionEndpointReference.class, "DiscreteInteractionEndpointReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscreteInteractionEndpointReference_TypedNamedElementExpression(), this.getTypedNamedElementExpression(), null, "typedNamedElementExpression", null, 0, 1, DiscreteInteractionEndpointReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscreteInteractionEndpointReference_Position(), this.getPositionSelector(), null, "position", null, 1, 1, DiscreteInteractionEndpointReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionSelectorEClass, PositionSelector.class, "PositionSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionSelector_Kind(), this.getPositionSelectorKind(), "kind", null, 0, 1, PositionSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionSelector_Successor(), this.getPositionSelector(), null, "successor", null, 0, 1, PositionSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localVariableDeclarationStatementEClass, LocalVariableDeclarationStatement.class, "LocalVariableDeclarationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalVariableDeclarationStatement_Variable(), theBehaviorPackage.getVariable(), null, "variable", null, 1, 1, LocalVariableDeclarationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalVariableDeclarationStatement_AllSurroundingBlocks(), this.getBlock(), null, "allSurroundingBlocks", null, 0, -1, LocalVariableDeclarationStatement.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(typedNamedElementExpressionEClass, TypedNamedElementExpression.class, "TypedNamedElementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedNamedElementExpression_TypedNamedElement(), theBehaviorPackage.getTypedNamedElement(), null, "typedNamedElement", null, 1, 1, TypedNamedElementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedNamedElementExpression_ElementAccessors(), this.getElementAccessorExpression(), null, "elementAccessors", null, 0, -1, TypedNamedElementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayInitializeExpressionEClass, ArrayInitializeExpression.class, "ArrayInitializeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayInitializeExpression_Expressions(), theExpressionsPackage.getExpression(), null, "expressions", null, 0, -1, ArrayInitializeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nondeterministicChoiceExpressionEClass, NondeterministicChoiceExpression.class, "NondeterministicChoiceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNondeterministicChoiceExpression_Range(), theValuetypePackage.getRange(), null, "range", null, 1, 1, NondeterministicChoiceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNondeterministicChoiceExpression_DataType(), theTypesPackage.getPrimitiveDataType(), null, "dataType", null, 1, 1, NondeterministicChoiceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeValueExpressionEClass, TimeValueExpression.class, "TimeValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeValueExpression_TimeValue(), theValuetypePackage.getTimeValue(), null, "timeValue", null, 1, 1, TimeValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeCastExpressionEClass, TypeCastExpression.class, "TypeCastExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeCastExpression_DataType(), theTypesPackage.getDataType(), null, "dataType", null, 0, 1, TypeCastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeCastExpression_EnclosedExpression(), theExpressionsPackage.getExpression(), null, "enclosedExpression", null, 1, 1, TypeCastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementAccessorExpressionEClass, ElementAccessorExpression.class, "ElementAccessorExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayIndexExpressionEClass, ArrayIndexExpression.class, "ArrayIndexExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayIndexExpression_Index(), theExpressionsPackage.getExpression(), null, "index", null, 1, 1, ArrayIndexExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeAccessorExpressionEClass, AttributeAccessorExpression.class, "AttributeAccessorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeAccessorExpression_Attribute(), theTypesPackage.getAttribute(), null, "attribute", null, 1, 1, AttributeAccessorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elseIfStatementEClass, ElseIfStatement.class, "ElseIfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElseIfStatement_ElseIfCondition(), theExpressionsPackage.getExpression(), null, "elseIfCondition", null, 1, 1, ElseIfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElseIfStatement_ElseIfBlock(), this.getBlock(), null, "elseIfBlock", null, 1, 1, ElseIfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(assignOperatorEEnum, AssignOperator.class, "AssignOperator");
		addEEnumLiteral(assignOperatorEEnum, AssignOperator.UNSET);
		addEEnumLiteral(assignOperatorEEnum, AssignOperator.ASSIGN);
		addEEnumLiteral(assignOperatorEEnum, AssignOperator.PLUS_EQUAL);
		addEEnumLiteral(assignOperatorEEnum, AssignOperator.MINUS_EQUAL);

		initEEnum(incrementDecrementOperatorEEnum, IncrementDecrementOperator.class, "IncrementDecrementOperator");
		addEEnumLiteral(incrementDecrementOperatorEEnum, IncrementDecrementOperator.UNSET);
		addEEnumLiteral(incrementDecrementOperatorEEnum, IncrementDecrementOperator.INCREMENT);
		addEEnumLiteral(incrementDecrementOperatorEEnum, IncrementDecrementOperator.DECREMENT);

		initEEnum(positionSelectorKindEEnum, PositionSelectorKind.class, "PositionSelectorKind");
		addEEnumLiteral(positionSelectorKindEEnum, PositionSelectorKind.SELF);
		addEEnumLiteral(positionSelectorKindEEnum, PositionSelectorKind.FIRST);
		addEEnumLiteral(positionSelectorKindEEnum, PositionSelectorKind.LAST);
		addEEnumLiteral(positionSelectorKindEEnum, PositionSelectorKind.PREV);
		addEEnumLiteral(positionSelectorKindEEnum, PositionSelectorKind.NEXT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (assignmentEClass, 
		   source, 
		   new String[] {
			 "constraints", ""
		   });	
		addAnnotation
		  (operationCallEClass, 
		   source, 
		   new String[] {
			 "constraints", "ParameterBindingForEveryParameter"
		   });	
		addAnnotation
		  (localVariableDeclarationStatementEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueName"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (assignmentEClass, 
		   source, 
		   new String[] {
			 "ValidLHS", "-- a hybrid in port is not allowed as a lhs of an assignment\nlet lhs : TypedNamedElementExpression = lhs_typedNamedElementExpression\nin\nif not lhs.oclIsUndefined() and lhs.typedNamedElement.oclIsKindOf(component::HybridPort) then\n\tlhs.typedNamedElement.oclAsType(component::HybridPort).outPort\nelse\n\ttrue\nendif"
		   });	
		addAnnotation
		  (operationCallEClass, 
		   source, 
		   new String[] {
			 "ParameterBindingForEveryParameter", "-- An OperationCall must bind exactly one value to every parameter\nnot operation.oclIsUndefined() implies \noperation.parameters->asBag() = parameterBinding.parameter->asBag()\n-- author: bingo, adann"
		   });	
		addAnnotation
		  (localVariableDeclarationStatementEClass, 
		   source, 
		   new String[] {
			 "UniqueName", "-- check if no variable with the same name was defined before\r\nself.allSurroundingBlocks->collect(\r\n\texpressions\r\n)->select(\r\n\toclIsKindOf(LocalVariableDeclarationStatement)\r\n)->collect(\r\n\toclAsType(LocalVariableDeclarationStatement)\r\n)->one(\r\n\tvariable.name = self.variable.name\r\n)"
		   });	
		addAnnotation
		  (getLocalVariableDeclarationStatement_AllSurroundingBlocks(), 
		   source, 
		   new String[] {
			 "derivation", "-- collect all blocks which surround this LocalVariableDeclarationStatement\nself.oclAsType(ecore::EObject).eContainer()->closure(c : ecore::EObject |\n\tif c.eContainer().oclIsKindOf(core::expressions::Expression) then\n\t\tc.eContainer()\n\telse\n\t\tc\n\tendif\n)->union(\n\tSet{self.oclAsType(ecore::EObject)}\n)->select(oclIsKindOf(Block))->collect(\n\toclAsType(Block)\n)->asOrderedSet()"
		   });
	}

} //ActionlanguagePackageImpl
