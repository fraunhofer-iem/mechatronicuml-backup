/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.actionlanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.expressions.ExpressionsPackage;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.actionlanguage.ActionLanguageFactory;
import de.uni_paderborn.fujaba.muml.actionlanguage.ActionLanguagePackage;
import de.uni_paderborn.fujaba.muml.actionlanguage.AssignOperator;
import de.uni_paderborn.fujaba.muml.actionlanguage.Assignment;
import de.uni_paderborn.fujaba.muml.actionlanguage.Block;
import de.uni_paderborn.fujaba.muml.actionlanguage.DiscreteInteractionEndpointReference;
import de.uni_paderborn.fujaba.muml.actionlanguage.DoWhileLoop;
import de.uni_paderborn.fujaba.muml.actionlanguage.ForLoop;
import de.uni_paderborn.fujaba.muml.actionlanguage.IfStatement;
import de.uni_paderborn.fujaba.muml.actionlanguage.IncrementDecrementOperator;
import de.uni_paderborn.fujaba.muml.actionlanguage.LocalVariableDeclarationStatement;
import de.uni_paderborn.fujaba.muml.actionlanguage.Loop;
import de.uni_paderborn.fujaba.muml.actionlanguage.OperationCall;
import de.uni_paderborn.fujaba.muml.actionlanguage.PositionSelector;
import de.uni_paderborn.fujaba.muml.actionlanguage.PositionSelectorKind;
import de.uni_paderborn.fujaba.muml.actionlanguage.ReturnStatement;
import de.uni_paderborn.fujaba.muml.actionlanguage.TriggerMessageExpression;
import de.uni_paderborn.fujaba.muml.actionlanguage.TypedNamedElementExpression;
import de.uni_paderborn.fujaba.muml.actionlanguage.WhileLoop;
import de.uni_paderborn.fujaba.muml.actionlanguage.util.ActionLanguageValidator;
import de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.types.TypesPackage;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionLanguagePackageImpl extends EPackageImpl implements ActionLanguagePackage {
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
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionLanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActionLanguagePackageImpl() {
		super(eNS_URI, ActionLanguageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActionLanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActionLanguagePackage init() {
		if (isInited) return (ActionLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(ActionLanguagePackage.eNS_URI);

		// Obtain or create and register package
		ActionLanguagePackageImpl theActionLanguagePackage = (ActionLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActionLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActionLanguagePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ComponentPackage.eINSTANCE.eClass();
		ConstraintPackage.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();
		ProtocolPackage.eINSTANCE.eClass();
		RealtimestatechartPackage.eINSTANCE.eClass();
		MsgtypePackage.eINSTANCE.eClass();
		DeploymentPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		ConnectorPackage.eINSTANCE.eClass();
		ValuetypePackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theActionLanguagePackage.createPackageContents();

		// Initialize created meta-data
		theActionLanguagePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theActionLanguagePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ActionLanguageValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theActionLanguagePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActionLanguagePackage.eNS_URI, theActionLanguagePackage);
		return theActionLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Expressions() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoop_Block() {
		return (EReference)loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoop_LoopTest() {
		return (EReference)loopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhileLoop() {
		return whileLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoWhileLoop() {
		return doWhileLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	@Override
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
	@Override
	public EReference getForLoop_CountingExpression() {
		return (EReference)forLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIfStatement() {
		return ifStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfStatement_IfCondition() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfStatement_IfBlock() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfStatement_ElseIfConditions() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfStatement_ElseIfBlocks() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfStatement_ElseBlock() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationCall() {
		return operationCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationCall_Operation() {
		return (EReference)operationCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	public EReference getLocalVariableDeclarationStatement_InitializeExpression() {
		return (EReference)localVariableDeclarationStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalVariableDeclarationStatement_AllSurroundingBlocks() {
		return (EReference)localVariableDeclarationStatementEClass.getEStructuralFeatures().get(2);
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
	public EReference getTypedNamedElementExpression_Indices() {
		return (EReference)typedNamedElementExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAssignOperator() {
		return assignOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public ActionLanguageFactory getActionLanguageFactory() {
		return (ActionLanguageFactory)getEFactoryInstance();
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
		createEReference(ifStatementEClass, IF_STATEMENT__ELSE_IF_CONDITIONS);
		createEReference(ifStatementEClass, IF_STATEMENT__ELSE_IF_BLOCKS);
		createEReference(ifStatementEClass, IF_STATEMENT__ELSE_BLOCK);

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
		createEReference(localVariableDeclarationStatementEClass, LOCAL_VARIABLE_DECLARATION_STATEMENT__INITIALIZE_EXPRESSION);
		createEReference(localVariableDeclarationStatementEClass, LOCAL_VARIABLE_DECLARATION_STATEMENT__ALL_SURROUNDING_BLOCKS);

		typedNamedElementExpressionEClass = createEClass(TYPED_NAMED_ELEMENT_EXPRESSION);
		createEReference(typedNamedElementExpressionEClass, TYPED_NAMED_ELEMENT_EXPRESSION__TYPED_NAMED_ELEMENT);
		createEReference(typedNamedElementExpressionEClass, TYPED_NAMED_ELEMENT_EXPRESSION__INDICES);

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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		blockEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		loopEClass.getESuperTypes().add(this.getBlock());
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

		// Initialize classes and features; add operations and parameters
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
		initEReference(getIfStatement_ElseIfConditions(), theExpressionsPackage.getExpression(), null, "elseIfConditions", null, 0, -1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_ElseIfBlocks(), this.getBlock(), null, "elseIfBlocks", null, 0, -1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_ElseBlock(), this.getBlock(), null, "elseBlock", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getLocalVariableDeclarationStatement_InitializeExpression(), theExpressionsPackage.getExpression(), null, "initializeExpression", null, 0, 1, LocalVariableDeclarationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalVariableDeclarationStatement_AllSurroundingBlocks(), this.getBlock(), null, "allSurroundingBlocks", null, 0, -1, LocalVariableDeclarationStatement.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(typedNamedElementExpressionEClass, TypedNamedElementExpression.class, "TypedNamedElementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedNamedElementExpression_TypedNamedElement(), theBehaviorPackage.getTypedNamedElement(), null, "typedNamedElement", null, 0, 1, TypedNamedElementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedNamedElementExpression_Indices(), theExpressionsPackage.getExpression(), null, "indices", null, 0, -1, TypedNamedElementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(assignOperatorEEnum, AssignOperator.class, "AssignOperator");
		addEEnumLiteral(assignOperatorEEnum, AssignOperator.UNSET);
		addEEnumLiteral(assignOperatorEEnum, AssignOperator.ASSIGN);
		addEEnumLiteral(assignOperatorEEnum, AssignOperator.PLUS_EQUAL);
		addEEnumLiteral(assignOperatorEEnum, AssignOperator.EQUAL_PLUS);
		addEEnumLiteral(assignOperatorEEnum, AssignOperator.MINUS_EQUAL);
		addEEnumLiteral(assignOperatorEEnum, AssignOperator.EQUAL_MINUS);

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
		// http://www.eclipse.org/edapt
		createEdaptAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/edapt</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdaptAnnotations() {
		String source = "http://www.eclipse.org/edapt";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "historyURI", "../../de.uni_paderborn.fujaba.muml.model/model/muml.history"
		   });																																	
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
		  (localVariableDeclarationStatementEClass, 
		   source, 
		   new String[] {
			 "UniqueName", "-- check if no variable with the same name was defined before\nself.allSurroundingBlocks->collect(\n\texpressions\n)->select(\n\toclIsKindOf(LocalVariableDeclarationStatement)\n)->collect(\n\toclAsType(LocalVariableDeclarationStatement)\n)->select(\n\tvariable.name = self.variable.name\n)->isUnique(variable.name)"
		   });		
		addAnnotation
		  (getLocalVariableDeclarationStatement_AllSurroundingBlocks(), 
		   source, 
		   new String[] {
			 "derivation", "-- collect all blocks which surround this LocalVariableDeclarationStatement\nself.eContainer()->closure(c : ecore::EObject |\n\tif c.eContainer().oclIsKindOf(core::expressions::Expression) then\n\t\tc.eContainer()\n\telse\n\t\tc\n\tendif\n)->union(\n\tSet{eContainer()}\n)->select(oclIsKindOf(Block))->collect(\n\toclAsType(Block)\n)->asOrderedSet()"
		   });		
	}

} //ActionLanguagePackageImpl
