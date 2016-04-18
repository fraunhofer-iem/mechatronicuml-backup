/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.activities.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.core.expressions.ExpressionsPackage;
import org.muml.storydiagram.StorydiagramPackage;
import org.muml.storydiagram.activities.ActivitiesFactory;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityCallNode;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityFinalNode;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.EdgeGuard;
import org.muml.storydiagram.activities.ExceptionVariable;
import org.muml.storydiagram.activities.FlowFinalNode;
import org.muml.storydiagram.activities.InitialNode;
import org.muml.storydiagram.activities.JunctionNode;
import org.muml.storydiagram.activities.MatchingStoryNode;
import org.muml.storydiagram.activities.ModifyingStoryNode;
import org.muml.storydiagram.activities.OperationExtension;
import org.muml.storydiagram.activities.StatementNode;
import org.muml.storydiagram.activities.StoryNode;
import org.muml.storydiagram.activities.StructuredNode;
import org.muml.storydiagram.activities.expressions.ActivitiesExpressionsPackage;
import org.muml.storydiagram.activities.expressions.impl.ActivitiesExpressionsPackageImpl;
import org.muml.storydiagram.activities.util.ActivitiesValidator;
import org.muml.storydiagram.calls.CallsPackage;
import org.muml.storydiagram.calls.expressions.CallsExpressionsPackage;
import org.muml.storydiagram.calls.expressions.impl.CallsExpressionsPackageImpl;
import org.muml.storydiagram.calls.impl.CallsPackageImpl;
import org.muml.storydiagram.impl.StorydiagramPackageImpl;
import org.muml.storydiagram.patterns.PatternsPackage;
import org.muml.storydiagram.patterns.expressions.PatternsExpressionsPackage;
import org.muml.storydiagram.patterns.expressions.impl.PatternsExpressionsPackageImpl;
import org.muml.storydiagram.patterns.impl.PatternsPackageImpl;
import org.muml.storydiagram.templates.TemplatesPackage;
import org.muml.storydiagram.templates.impl.TemplatesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivitiesPackageImpl extends EPackageImpl implements
		ActivitiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchingStoryNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass junctionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityCallNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyingStoryNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum edgeGuardEEnum = null;

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
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivitiesPackageImpl() {
		super(eNS_URI, ActivitiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActivitiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActivitiesPackage init() {
		if (isInited) return (ActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);

		// Obtain or create and register package
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActivitiesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StorydiagramPackageImpl theStorydiagramPackage = (StorydiagramPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StorydiagramPackage.eNS_URI) instanceof StorydiagramPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StorydiagramPackage.eNS_URI) : StorydiagramPackage.eINSTANCE);
		ActivitiesExpressionsPackageImpl theActivitiesExpressionsPackage = (ActivitiesExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesExpressionsPackage.eNS_URI) instanceof ActivitiesExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesExpressionsPackage.eNS_URI) : ActivitiesExpressionsPackage.eINSTANCE);
		CallsPackageImpl theCallsPackage = (CallsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI) instanceof CallsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI) : CallsPackage.eINSTANCE);
		CallsExpressionsPackageImpl theCallsExpressionsPackage = (CallsExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CallsExpressionsPackage.eNS_URI) instanceof CallsExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CallsExpressionsPackage.eNS_URI) : CallsExpressionsPackage.eINSTANCE);
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
		PatternsExpressionsPackageImpl thePatternsExpressionsPackage = (PatternsExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsExpressionsPackage.eNS_URI) instanceof PatternsExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsExpressionsPackage.eNS_URI) : PatternsExpressionsPackage.eINSTANCE);
		TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) : TemplatesPackage.eINSTANCE);

		// Create package meta-data objects
		theActivitiesPackage.createPackageContents();
		theStorydiagramPackage.createPackageContents();
		theActivitiesExpressionsPackage.createPackageContents();
		theCallsPackage.createPackageContents();
		theCallsExpressionsPackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		thePatternsExpressionsPackage.createPackageContents();
		theTemplatesPackage.createPackageContents();

		// Initialize created meta-data
		theActivitiesPackage.initializePackageContents();
		theStorydiagramPackage.initializePackageContents();
		theActivitiesExpressionsPackage.initializePackageContents();
		theCallsPackage.initializePackageContents();
		theCallsExpressionsPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		thePatternsExpressionsPackage.initializePackageContents();
		theTemplatesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theActivitiesPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ActivitiesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theActivitiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivitiesPackage.eNS_URI, theActivitiesPackage);
		return theActivitiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionVariable() {
		return exceptionVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionVariable_ActivityEdge() {
		return (EReference)exceptionVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionVariable_Name() {
		return (EAttribute)exceptionVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionVariable_GenericExceptionTypes() {
		return (EReference)exceptionVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge() {
		return activityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Target() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Source() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_OwningActivity() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityEdge_Guard() {
		return (EAttribute)activityEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_GuardExpression() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_GuardExceptions() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode() {
		return activityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Outgoings() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_OwningActivity() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_OwningActivityNode() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Incomings() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_OwningOperation() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_OwnedActivityEdges() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Precondition() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_OwnedActivityNodes() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Annotations() {
		return (EReference)activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationExtension() {
		return operationExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationExtension_Operation() {
		return (EReference)operationExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationExtension_ReturnValue() {
		return (EReference)operationExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationExtension_OwnedActivity() {
		return (EReference)operationExtensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperationExtension__NumberOfOutParams__DiagnosticChain_Map() {
		return operationExtensionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchingStoryNode() {
		return matchingStoryNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchingStoryNode_OwnedPattern() {
		return (EReference)matchingStoryNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryNode() {
		return storyNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoryNode_ForEach() {
		return (EAttribute)storyNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryNode_StoryPattern() {
		return (EReference)storyNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredNode() {
		return structuredNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredNode_OwnedActivityNodes() {
		return (EReference)structuredNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJunctionNode() {
		return junctionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNode() {
		return initialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementNode() {
		return statementNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatementNode_StatementExpression() {
		return (EReference)statementNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNode() {
		return activityFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityFinalNode_ReturnValue() {
		return (EReference)activityFinalNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityFinalNode_ReturnValues() {
		return (EReference)activityFinalNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityFinalNode_Success() {
		return (EAttribute)activityFinalNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityCallNode() {
		return activityCallNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityCallNode_CalledActivities() {
		return (EReference)activityCallNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyingStoryNode() {
		return modifyingStoryNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifyingStoryNode_OwnedRule() {
		return (EReference)modifyingStoryNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNode() {
		return flowFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEdgeGuard() {
		return edgeGuardEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitiesFactory getActivitiesFactory() {
		return (ActivitiesFactory)getEFactoryInstance();
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
		exceptionVariableEClass = createEClass(EXCEPTION_VARIABLE);
		createEReference(exceptionVariableEClass, EXCEPTION_VARIABLE__ACTIVITY_EDGE);
		createEAttribute(exceptionVariableEClass, EXCEPTION_VARIABLE__NAME);
		createEReference(exceptionVariableEClass, EXCEPTION_VARIABLE__GENERIC_EXCEPTION_TYPES);

		activityEdgeEClass = createEClass(ACTIVITY_EDGE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__TARGET);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__SOURCE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__OWNING_ACTIVITY);
		createEAttribute(activityEdgeEClass, ACTIVITY_EDGE__GUARD);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__GUARD_EXPRESSION);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__GUARD_EXCEPTIONS);

		activityNodeEClass = createEClass(ACTIVITY_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__OUTGOINGS);
		createEReference(activityNodeEClass, ACTIVITY_NODE__OWNING_ACTIVITY);
		createEReference(activityNodeEClass, ACTIVITY_NODE__OWNING_ACTIVITY_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__INCOMINGS);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__OWNING_OPERATION);
		createEReference(activityEClass, ACTIVITY__OWNED_ACTIVITY_EDGES);
		createEReference(activityEClass, ACTIVITY__PRECONDITION);
		createEReference(activityEClass, ACTIVITY__OWNED_ACTIVITY_NODES);
		createEReference(activityEClass, ACTIVITY__ANNOTATIONS);

		operationExtensionEClass = createEClass(OPERATION_EXTENSION);
		createEReference(operationExtensionEClass, OPERATION_EXTENSION__OPERATION);
		createEReference(operationExtensionEClass, OPERATION_EXTENSION__RETURN_VALUE);
		createEReference(operationExtensionEClass, OPERATION_EXTENSION__OWNED_ACTIVITY);
		createEOperation(operationExtensionEClass, OPERATION_EXTENSION___NUMBER_OF_OUT_PARAMS__DIAGNOSTICCHAIN_MAP);

		matchingStoryNodeEClass = createEClass(MATCHING_STORY_NODE);
		createEReference(matchingStoryNodeEClass, MATCHING_STORY_NODE__OWNED_PATTERN);

		storyNodeEClass = createEClass(STORY_NODE);
		createEAttribute(storyNodeEClass, STORY_NODE__FOR_EACH);
		createEReference(storyNodeEClass, STORY_NODE__STORY_PATTERN);

		structuredNodeEClass = createEClass(STRUCTURED_NODE);
		createEReference(structuredNodeEClass, STRUCTURED_NODE__OWNED_ACTIVITY_NODES);

		junctionNodeEClass = createEClass(JUNCTION_NODE);

		initialNodeEClass = createEClass(INITIAL_NODE);

		statementNodeEClass = createEClass(STATEMENT_NODE);
		createEReference(statementNodeEClass, STATEMENT_NODE__STATEMENT_EXPRESSION);

		activityFinalNodeEClass = createEClass(ACTIVITY_FINAL_NODE);
		createEReference(activityFinalNodeEClass, ACTIVITY_FINAL_NODE__RETURN_VALUE);
		createEReference(activityFinalNodeEClass, ACTIVITY_FINAL_NODE__RETURN_VALUES);
		createEAttribute(activityFinalNodeEClass, ACTIVITY_FINAL_NODE__SUCCESS);

		activityCallNodeEClass = createEClass(ACTIVITY_CALL_NODE);
		createEReference(activityCallNodeEClass, ACTIVITY_CALL_NODE__CALLED_ACTIVITIES);

		modifyingStoryNodeEClass = createEClass(MODIFYING_STORY_NODE);
		createEReference(modifyingStoryNodeEClass, MODIFYING_STORY_NODE__OWNED_RULE);

		flowFinalNodeEClass = createEClass(FLOW_FINAL_NODE);

		// Create enums
		edgeGuardEEnum = createEEnum(EDGE_GUARD);
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
		ActivitiesExpressionsPackage theActivitiesExpressionsPackage = (ActivitiesExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesExpressionsPackage.eNS_URI);
		StorydiagramPackage theStorydiagramPackage = (StorydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(StorydiagramPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		CallsPackage theCallsPackage = (CallsPackage)EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI);
		PatternsPackage thePatternsPackage = (PatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theActivitiesExpressionsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		exceptionVariableEClass.getESuperTypes().add(theStorydiagramPackage.getVariable());
		activityEdgeEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		activityNodeEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		activityNodeEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		activityEClass.getESuperTypes().add(theCallsPackage.getCallable());
		activityEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		operationExtensionEClass.getESuperTypes().add(theStorydiagramPackage.getSDMExtension());
		operationExtensionEClass.getESuperTypes().add(theCallsPackage.getCallable());
		matchingStoryNodeEClass.getESuperTypes().add(this.getStoryNode());
		storyNodeEClass.getESuperTypes().add(this.getActivityNode());
		structuredNodeEClass.getESuperTypes().add(this.getActivityNode());
		junctionNodeEClass.getESuperTypes().add(this.getActivityNode());
		initialNodeEClass.getESuperTypes().add(this.getActivityNode());
		statementNodeEClass.getESuperTypes().add(this.getActivityNode());
		activityFinalNodeEClass.getESuperTypes().add(this.getActivityNode());
		activityCallNodeEClass.getESuperTypes().add(this.getActivityNode());
		activityCallNodeEClass.getESuperTypes().add(theCallsPackage.getInvocation());
		modifyingStoryNodeEClass.getESuperTypes().add(this.getStoryNode());
		flowFinalNodeEClass.getESuperTypes().add(this.getActivityFinalNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(exceptionVariableEClass, ExceptionVariable.class, "ExceptionVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExceptionVariable_ActivityEdge(), this.getActivityEdge(), this.getActivityEdge_GuardExceptions(), "activityEdge", null, 1, 1, ExceptionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExceptionVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExceptionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExceptionVariable_GenericExceptionTypes(), theEcorePackage.getEGenericType(), null, "genericExceptionTypes", null, 0, -1, ExceptionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(activityEdgeEClass, ActivityEdge.class, "ActivityEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdge_Target(), this.getActivityNode(), this.getActivityNode_Incomings(), "target", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_Source(), this.getActivityNode(), this.getActivityNode_Outgoings(), "source", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_OwningActivity(), this.getActivity(), this.getActivity_OwnedActivityEdges(), "owningActivity", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActivityEdge_Guard(), this.getEdgeGuard(), "guard", "NONE", 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_GuardExpression(), theExpressionsPackage.getExpression(), null, "guardExpression", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_GuardExceptions(), this.getExceptionVariable(), this.getExceptionVariable_ActivityEdge(), "guardExceptions", null, 0, -1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityNodeEClass, ActivityNode.class, "ActivityNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_Outgoings(), this.getActivityEdge(), this.getActivityEdge_Source(), "outgoings", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_OwningActivity(), this.getActivity(), this.getActivity_OwnedActivityNodes(), "owningActivity", null, 0, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_OwningActivityNode(), this.getStructuredNode(), this.getStructuredNode_OwnedActivityNodes(), "owningActivityNode", null, 0, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_Incomings(), this.getActivityEdge(), this.getActivityEdge_Target(), "incomings", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_OwningOperation(), this.getOperationExtension(), this.getOperationExtension_OwnedActivity(), "owningOperation", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_OwnedActivityEdges(), this.getActivityEdge(), this.getActivityEdge_OwningActivity(), "ownedActivityEdges", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Precondition(), this.getMatchingStoryNode(), null, "precondition", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_OwnedActivityNodes(), this.getActivityNode(), this.getActivityNode_OwningActivity(), "ownedActivityNodes", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_Annotations(), theEcorePackage.getEAnnotation(), null, "annotations", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationExtensionEClass, OperationExtension.class, "OperationExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationExtension_Operation(), theEcorePackage.getEOperation(), null, "operation", null, 0, 1, OperationExtension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getOperationExtension_ReturnValue(), theEcorePackage.getEParameter(), null, "returnValue", null, 0, 1, OperationExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperationExtension_OwnedActivity(), this.getActivity(), this.getActivity_OwningOperation(), "ownedActivity", null, 0, 1, OperationExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getOperationExtension__NumberOfOutParams__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NumberOfOutParams", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(matchingStoryNodeEClass, MatchingStoryNode.class, "MatchingStoryNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatchingStoryNode_OwnedPattern(), thePatternsPackage.getMatchingPattern(), null, "ownedPattern", null, 1, 1, MatchingStoryNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(storyNodeEClass, StoryNode.class, "StoryNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStoryNode_ForEach(), ecorePackage.getEBoolean(), "forEach", null, 1, 1, StoryNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStoryNode_StoryPattern(), thePatternsPackage.getStoryPattern(), null, "storyPattern", null, 1, 1, StoryNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(structuredNodeEClass, StructuredNode.class, "StructuredNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredNode_OwnedActivityNodes(), this.getActivityNode(), this.getActivityNode_OwningActivityNode(), "ownedActivityNodes", null, 0, -1, StructuredNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(junctionNodeEClass, JunctionNode.class, "JunctionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initialNodeEClass, InitialNode.class, "InitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementNodeEClass, StatementNode.class, "StatementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatementNode_StatementExpression(), theExpressionsPackage.getExpression(), null, "statementExpression", null, 1, 1, StatementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(activityFinalNodeEClass, ActivityFinalNode.class, "ActivityFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityFinalNode_ReturnValue(), theExpressionsPackage.getExpression(), null, "returnValue", null, 0, 1, ActivityFinalNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityFinalNode_ReturnValues(), theExpressionsPackage.getExpression(), null, "returnValues", null, 0, -1, ActivityFinalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActivityFinalNode_Success(), ecorePackage.getEBoolean(), "success", "true", 1, 1, ActivityFinalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(activityCallNodeEClass, ActivityCallNode.class, "ActivityCallNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityCallNode_CalledActivities(), this.getActivity(), null, "calledActivities", null, 1, -1, ActivityCallNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifyingStoryNodeEClass, ModifyingStoryNode.class, "ModifyingStoryNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifyingStoryNode_OwnedRule(), thePatternsPackage.getStoryPattern(), null, "ownedRule", null, 1, 1, ModifyingStoryNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(flowFinalNodeEClass, FlowFinalNode.class, "FlowFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(edgeGuardEEnum, EdgeGuard.class, "EdgeGuard");
		addEEnumLiteral(edgeGuardEEnum, EdgeGuard.NONE);
		addEEnumLiteral(edgeGuardEEnum, EdgeGuard.SUCCESS);
		addEEnumLiteral(edgeGuardEEnum, EdgeGuard.FAILURE);
		addEEnumLiteral(edgeGuardEEnum, EdgeGuard.EACH_TIME);
		addEEnumLiteral(edgeGuardEEnum, EdgeGuard.END);
		addEEnumLiteral(edgeGuardEEnum, EdgeGuard.ELSE);
		addEEnumLiteral(edgeGuardEEnum, EdgeGuard.BOOL);
		addEEnumLiteral(edgeGuardEEnum, EdgeGuard.EXCEPTION);
		addEEnumLiteral(edgeGuardEEnum, EdgeGuard.FINALLY);

		// Create annotations
		// http://www.eclipse.org/uml2/1.1.0/GenModel
		createGenModel_1Annotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// subsets
		createSubsetsAnnotations();
		// union
		createUnionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModel_1Annotations() {
		String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";	
		addAnnotation
		  (getOperationExtension__NumberOfOutParams__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.oclAsType(calls::Callable).outParameter->size() <= 1"
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
		  (getOperationExtension_Operation(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.getModelBase() <> null and self.getModelBase().oclIsKindOf(ecore::EOperation)) then self.getModelBase().oclAsType(ecore::EOperation) else null endif"
		   });
	}

	/**
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets";	
		addAnnotation
		  (getMatchingStoryNode_OwnedPattern(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(StorydiagramPackage.eNS_URI).appendFragment("//activities/StoryNode/storyPattern")
		   });	
		addAnnotation
		  (getModifyingStoryNode_OwnedRule(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(StorydiagramPackage.eNS_URI).appendFragment("//activities/StoryNode/storyPattern")
		   });
	}

	/**
	 * Initializes the annotations for <b>union</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUnionAnnotations() {
		String source = "union";	
		addAnnotation
		  (getStoryNode_StoryPattern(), 
		   source, 
		   new String[] {
		   });
	}

} //ActivitiesPackageImpl
