/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.muml.storydiagram.interpreter.core.executiontrace.ActivityEdgeTraversal;
import org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution;
import org.muml.storydiagram.interpreter.core.executiontrace.ActivityNodeExecution;
import org.muml.storydiagram.interpreter.core.executiontrace.AttributeValueSet;
import org.muml.storydiagram.interpreter.core.executiontrace.Execution;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontraceFactory;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;
import org.muml.storydiagram.interpreter.core.executiontrace.ExpressionEvaluation;
import org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkCreation;
import org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkDeletion;
import org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkModification;
import org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectCreation;
import org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectDeletion;
import org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectModification;
import org.muml.storydiagram.interpreter.core.executiontrace.LinkCheck;
import org.muml.storydiagram.interpreter.core.executiontrace.LinkCheckFailed;
import org.muml.storydiagram.interpreter.core.executiontrace.LinkCheckSuccessful;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternApplication;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintEvaluation;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintHolds;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintViolated;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternExecution;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternInitialization;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternLinkExecution;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternMatching;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBindingRevoked;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBound;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintEvaluation;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintHolds;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintViolated;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectExecution;
import org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectNotBound;
import org.muml.storydiagram.interpreter.core.executiontrace.TraversingLink;
import org.muml.storydiagram.interpreter.core.executiontrace.VariableChanged;
import org.muml.storydiagram.interpreter.core.executiontrace.VariableCreated;
import org.muml.storydiagram.interpreter.core.executiontrace.VariableDeleted;
import org.muml.storydiagram.interpreter.core.executiontrace.VariableModification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutiontracePackageImpl extends EPackageImpl implements ExecutiontracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeTraversalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternInitializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternMatchingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternObjectExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternObjectBoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternObjectNotBoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternObjectBindingRevokedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternLinkExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traversingLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkCheckSuccessfulEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkCheckFailedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceObjectModificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceObjectCreationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceObjectDeletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceLinkModificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceLinkCreationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceLinkDeletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableModificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableCreatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeletedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableChangedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternObjectConstraintEvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternObjectConstraintHoldsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternObjectConstraintViolatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternConstraintEvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternConstraintHoldsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternConstraintViolatedEClass = null;

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
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExecutiontracePackageImpl() {
		super(eNS_URI, ExecutiontraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExecutiontracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExecutiontracePackage init() {
		if (isInited) return (ExecutiontracePackage)EPackage.Registry.INSTANCE.getEPackage(ExecutiontracePackage.eNS_URI);

		// Obtain or create and register package
		ExecutiontracePackageImpl theExecutiontracePackage = (ExecutiontracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExecutiontracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExecutiontracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExecutiontracePackage.createPackageContents();

		// Initialize created meta-data
		theExecutiontracePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExecutiontracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExecutiontracePackage.eNS_URI, theExecutiontracePackage);
		return theExecutiontracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapEntry() {
		return mapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapEntry_Key() {
		return (EAttribute)mapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapEntry_Value() {
		return (EAttribute)mapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionTrace() {
		return executionTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionTrace_Executions() {
		return (EReference)executionTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionTrace_Description() {
		return (EAttribute)executionTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionTrace_TotalExecutionTime() {
		return (EAttribute)executionTraceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionTrace_TotalExecutionTimeMsec() {
		return (EAttribute)executionTraceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecution() {
		return executionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_ExecutionStartedTimeStamp() {
		return (EAttribute)executionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_ExecutionFinishedTimeStamp() {
		return (EAttribute)executionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_ExecutionTime() {
		return (EAttribute)executionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_ExecutionTimeMsec() {
		return (EAttribute)executionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_Elements() {
		return (EReference)executionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_Container() {
		return (EReference)executionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityExecution() {
		return activityExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExecution_Activity() {
		return (EReference)activityExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExecution_InParameterValues() {
		return (EReference)activityExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExecution_OutParameterValues() {
		return (EReference)activityExecutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNodeExecution() {
		return activityNodeExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNodeExecution_ActivityNode() {
		return (EReference)activityNodeExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdgeTraversal() {
		return activityEdgeTraversalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdgeTraversal_ActivityEdge() {
		return (EReference)activityEdgeTraversalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPatternExecution() {
		return storyPatternExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPatternExecution_StoryPattern() {
		return (EReference)storyPatternExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPatternInitialization() {
		return storyPatternInitializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPatternMatching() {
		return storyPatternMatchingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoryPatternMatching_Successful() {
		return (EAttribute)storyPatternMatchingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPatternApplication() {
		return storyPatternApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPatternObjectExecution() {
		return storyPatternObjectExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPatternObjectExecution_StoryPatternObject() {
		return (EReference)storyPatternObjectExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPatternObjectBound() {
		return storyPatternObjectBoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoryPatternObjectBound_Value() {
		return (EAttribute)storyPatternObjectBoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPatternObjectNotBound() {
		return storyPatternObjectNotBoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPatternObjectBindingRevoked() {
		return storyPatternObjectBindingRevokedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoryPatternObjectBindingRevoked_PreviousValue() {
		return (EAttribute)storyPatternObjectBindingRevokedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPatternLinkExecution() {
		return storyPatternLinkExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPatternLinkExecution_StoryPatternLink() {
		return (EReference)storyPatternLinkExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPatternLinkExecution_SourceStoryPatternObject() {
		return (EReference)storyPatternLinkExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPatternLinkExecution_TargetStoryPatternObject() {
		return (EReference)storyPatternLinkExecutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoryPatternLinkExecution_SourceObject() {
		return (EAttribute)storyPatternLinkExecutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraversingLink() {
		return traversingLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkCheck() {
		return linkCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkCheck_TargetObject() {
		return (EAttribute)linkCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkCheckSuccessful() {
		return linkCheckSuccessfulEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkCheckFailed() {
		return linkCheckFailedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionEvaluation() {
		return expressionEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionEvaluation_Expression() {
		return (EReference)expressionEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionEvaluation_Result() {
		return (EAttribute)expressionEvaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceObjectModification() {
		return instanceObjectModificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceObjectModification_StoryPatternObject() {
		return (EReference)instanceObjectModificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceObjectModification_InstanceObject() {
		return (EAttribute)instanceObjectModificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceObjectCreation() {
		return instanceObjectCreationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceObjectDeletion() {
		return instanceObjectDeletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceLinkModification() {
		return instanceLinkModificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceLinkModification_StoryPatternLink() {
		return (EReference)instanceLinkModificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceLinkModification_SourceStoryPatternObject() {
		return (EReference)instanceLinkModificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceLinkModification_TargetStoryPatternObject() {
		return (EReference)instanceLinkModificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceLinkModification_SourceInstanceObject() {
		return (EAttribute)instanceLinkModificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceLinkModification_TargetInstanceObject() {
		return (EAttribute)instanceLinkModificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceLinkCreation() {
		return instanceLinkCreationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceLinkDeletion() {
		return instanceLinkDeletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueSet() {
		return attributeValueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueSet_StoryPatternObject() {
		return (EReference)attributeValueSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueSet_Feature() {
		return (EReference)attributeValueSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValueSet_InstanceObject() {
		return (EAttribute)attributeValueSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValueSet_NewValue() {
		return (EAttribute)attributeValueSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableModification() {
		return variableModificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableModification_VariableName() {
		return (EAttribute)variableModificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableModification_Classifier() {
		return (EReference)variableModificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableModification_Value() {
		return (EAttribute)variableModificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableCreated() {
		return variableCreatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeleted() {
		return variableDeletedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableChanged() {
		return variableChangedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableChanged_OldValue() {
		return (EAttribute)variableChangedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPatternObjectConstraintEvaluation() {
		return storyPatternObjectConstraintEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPatternObjectConstraintEvaluation_Constraint() {
		return (EReference)storyPatternObjectConstraintEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPatternObjectConstraintHolds() {
		return storyPatternObjectConstraintHoldsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPatternObjectConstraintViolated() {
		return storyPatternObjectConstraintViolatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPatternConstraintEvaluation() {
		return storyPatternConstraintEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPatternConstraintEvaluation_Constraint() {
		return (EReference)storyPatternConstraintEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPatternConstraintHolds() {
		return storyPatternConstraintHoldsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPatternConstraintViolated() {
		return storyPatternConstraintViolatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutiontraceFactory getExecutiontraceFactory() {
		return (ExecutiontraceFactory)getEFactoryInstance();
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
		mapEntryEClass = createEClass(MAP_ENTRY);
		createEAttribute(mapEntryEClass, MAP_ENTRY__KEY);
		createEAttribute(mapEntryEClass, MAP_ENTRY__VALUE);

		executionTraceEClass = createEClass(EXECUTION_TRACE);
		createEReference(executionTraceEClass, EXECUTION_TRACE__EXECUTIONS);
		createEAttribute(executionTraceEClass, EXECUTION_TRACE__DESCRIPTION);
		createEAttribute(executionTraceEClass, EXECUTION_TRACE__TOTAL_EXECUTION_TIME);
		createEAttribute(executionTraceEClass, EXECUTION_TRACE__TOTAL_EXECUTION_TIME_MSEC);

		executionEClass = createEClass(EXECUTION);
		createEAttribute(executionEClass, EXECUTION__EXECUTION_STARTED_TIME_STAMP);
		createEAttribute(executionEClass, EXECUTION__EXECUTION_FINISHED_TIME_STAMP);
		createEAttribute(executionEClass, EXECUTION__EXECUTION_TIME);
		createEAttribute(executionEClass, EXECUTION__EXECUTION_TIME_MSEC);
		createEReference(executionEClass, EXECUTION__ELEMENTS);
		createEReference(executionEClass, EXECUTION__CONTAINER);

		activityExecutionEClass = createEClass(ACTIVITY_EXECUTION);
		createEReference(activityExecutionEClass, ACTIVITY_EXECUTION__ACTIVITY);
		createEReference(activityExecutionEClass, ACTIVITY_EXECUTION__IN_PARAMETER_VALUES);
		createEReference(activityExecutionEClass, ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES);

		activityNodeExecutionEClass = createEClass(ACTIVITY_NODE_EXECUTION);
		createEReference(activityNodeExecutionEClass, ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE);

		activityEdgeTraversalEClass = createEClass(ACTIVITY_EDGE_TRAVERSAL);
		createEReference(activityEdgeTraversalEClass, ACTIVITY_EDGE_TRAVERSAL__ACTIVITY_EDGE);

		storyPatternExecutionEClass = createEClass(STORY_PATTERN_EXECUTION);
		createEReference(storyPatternExecutionEClass, STORY_PATTERN_EXECUTION__STORY_PATTERN);

		storyPatternInitializationEClass = createEClass(STORY_PATTERN_INITIALIZATION);

		storyPatternMatchingEClass = createEClass(STORY_PATTERN_MATCHING);
		createEAttribute(storyPatternMatchingEClass, STORY_PATTERN_MATCHING__SUCCESSFUL);

		storyPatternApplicationEClass = createEClass(STORY_PATTERN_APPLICATION);

		storyPatternObjectExecutionEClass = createEClass(STORY_PATTERN_OBJECT_EXECUTION);
		createEReference(storyPatternObjectExecutionEClass, STORY_PATTERN_OBJECT_EXECUTION__STORY_PATTERN_OBJECT);

		storyPatternObjectBoundEClass = createEClass(STORY_PATTERN_OBJECT_BOUND);
		createEAttribute(storyPatternObjectBoundEClass, STORY_PATTERN_OBJECT_BOUND__VALUE);

		storyPatternObjectNotBoundEClass = createEClass(STORY_PATTERN_OBJECT_NOT_BOUND);

		storyPatternObjectBindingRevokedEClass = createEClass(STORY_PATTERN_OBJECT_BINDING_REVOKED);
		createEAttribute(storyPatternObjectBindingRevokedEClass, STORY_PATTERN_OBJECT_BINDING_REVOKED__PREVIOUS_VALUE);

		storyPatternLinkExecutionEClass = createEClass(STORY_PATTERN_LINK_EXECUTION);
		createEReference(storyPatternLinkExecutionEClass, STORY_PATTERN_LINK_EXECUTION__STORY_PATTERN_LINK);
		createEReference(storyPatternLinkExecutionEClass, STORY_PATTERN_LINK_EXECUTION__SOURCE_STORY_PATTERN_OBJECT);
		createEReference(storyPatternLinkExecutionEClass, STORY_PATTERN_LINK_EXECUTION__TARGET_STORY_PATTERN_OBJECT);
		createEAttribute(storyPatternLinkExecutionEClass, STORY_PATTERN_LINK_EXECUTION__SOURCE_OBJECT);

		traversingLinkEClass = createEClass(TRAVERSING_LINK);

		linkCheckEClass = createEClass(LINK_CHECK);
		createEAttribute(linkCheckEClass, LINK_CHECK__TARGET_OBJECT);

		linkCheckSuccessfulEClass = createEClass(LINK_CHECK_SUCCESSFUL);

		linkCheckFailedEClass = createEClass(LINK_CHECK_FAILED);

		expressionEvaluationEClass = createEClass(EXPRESSION_EVALUATION);
		createEReference(expressionEvaluationEClass, EXPRESSION_EVALUATION__EXPRESSION);
		createEAttribute(expressionEvaluationEClass, EXPRESSION_EVALUATION__RESULT);

		instanceObjectModificationEClass = createEClass(INSTANCE_OBJECT_MODIFICATION);
		createEReference(instanceObjectModificationEClass, INSTANCE_OBJECT_MODIFICATION__STORY_PATTERN_OBJECT);
		createEAttribute(instanceObjectModificationEClass, INSTANCE_OBJECT_MODIFICATION__INSTANCE_OBJECT);

		instanceObjectCreationEClass = createEClass(INSTANCE_OBJECT_CREATION);

		instanceObjectDeletionEClass = createEClass(INSTANCE_OBJECT_DELETION);

		instanceLinkModificationEClass = createEClass(INSTANCE_LINK_MODIFICATION);
		createEReference(instanceLinkModificationEClass, INSTANCE_LINK_MODIFICATION__STORY_PATTERN_LINK);
		createEReference(instanceLinkModificationEClass, INSTANCE_LINK_MODIFICATION__SOURCE_STORY_PATTERN_OBJECT);
		createEReference(instanceLinkModificationEClass, INSTANCE_LINK_MODIFICATION__TARGET_STORY_PATTERN_OBJECT);
		createEAttribute(instanceLinkModificationEClass, INSTANCE_LINK_MODIFICATION__SOURCE_INSTANCE_OBJECT);
		createEAttribute(instanceLinkModificationEClass, INSTANCE_LINK_MODIFICATION__TARGET_INSTANCE_OBJECT);

		instanceLinkCreationEClass = createEClass(INSTANCE_LINK_CREATION);

		instanceLinkDeletionEClass = createEClass(INSTANCE_LINK_DELETION);

		attributeValueSetEClass = createEClass(ATTRIBUTE_VALUE_SET);
		createEReference(attributeValueSetEClass, ATTRIBUTE_VALUE_SET__STORY_PATTERN_OBJECT);
		createEReference(attributeValueSetEClass, ATTRIBUTE_VALUE_SET__FEATURE);
		createEAttribute(attributeValueSetEClass, ATTRIBUTE_VALUE_SET__INSTANCE_OBJECT);
		createEAttribute(attributeValueSetEClass, ATTRIBUTE_VALUE_SET__NEW_VALUE);

		variableModificationEClass = createEClass(VARIABLE_MODIFICATION);
		createEAttribute(variableModificationEClass, VARIABLE_MODIFICATION__VARIABLE_NAME);
		createEReference(variableModificationEClass, VARIABLE_MODIFICATION__CLASSIFIER);
		createEAttribute(variableModificationEClass, VARIABLE_MODIFICATION__VALUE);

		variableCreatedEClass = createEClass(VARIABLE_CREATED);

		variableDeletedEClass = createEClass(VARIABLE_DELETED);

		variableChangedEClass = createEClass(VARIABLE_CHANGED);
		createEAttribute(variableChangedEClass, VARIABLE_CHANGED__OLD_VALUE);

		storyPatternObjectConstraintEvaluationEClass = createEClass(STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION);
		createEReference(storyPatternObjectConstraintEvaluationEClass, STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION__CONSTRAINT);

		storyPatternObjectConstraintHoldsEClass = createEClass(STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS);

		storyPatternObjectConstraintViolatedEClass = createEClass(STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED);

		storyPatternConstraintEvaluationEClass = createEClass(STORY_PATTERN_CONSTRAINT_EVALUATION);
		createEReference(storyPatternConstraintEvaluationEClass, STORY_PATTERN_CONSTRAINT_EVALUATION__CONSTRAINT);

		storyPatternConstraintHoldsEClass = createEClass(STORY_PATTERN_CONSTRAINT_HOLDS);

		storyPatternConstraintViolatedEClass = createEClass(STORY_PATTERN_CONSTRAINT_VIOLATED);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter mapEntryEClass_KeyType = addETypeParameter(mapEntryEClass, "KeyType");
		ETypeParameter mapEntryEClass_ValueType = addETypeParameter(mapEntryEClass, "ValueType");
		ETypeParameter activityExecutionEClass_ActivityType = addETypeParameter(activityExecutionEClass, "ActivityType");
		ETypeParameter activityNodeExecutionEClass_ActivityNodeType = addETypeParameter(activityNodeExecutionEClass, "ActivityNodeType");
		ETypeParameter activityEdgeTraversalEClass_ActivityEdgeType = addETypeParameter(activityEdgeTraversalEClass, "ActivityEdgeType");
		ETypeParameter storyPatternExecutionEClass_StoryPatternType = addETypeParameter(storyPatternExecutionEClass, "StoryPatternType");
		ETypeParameter storyPatternInitializationEClass_StoryPatternType = addETypeParameter(storyPatternInitializationEClass, "StoryPatternType");
		ETypeParameter storyPatternMatchingEClass_StoryPatternType = addETypeParameter(storyPatternMatchingEClass, "StoryPatternType");
		ETypeParameter storyPatternApplicationEClass_StoryPatternType = addETypeParameter(storyPatternApplicationEClass, "StoryPatternType");
		ETypeParameter storyPatternObjectExecutionEClass_StoryPatternObjectType = addETypeParameter(storyPatternObjectExecutionEClass, "StoryPatternObjectType");
		ETypeParameter storyPatternObjectBoundEClass_StoryPatternObjectType = addETypeParameter(storyPatternObjectBoundEClass, "StoryPatternObjectType");
		ETypeParameter storyPatternObjectNotBoundEClass_StoryPatternObjectType = addETypeParameter(storyPatternObjectNotBoundEClass, "StoryPatternObjectType");
		ETypeParameter storyPatternObjectBindingRevokedEClass_StoryPatternObjectType = addETypeParameter(storyPatternObjectBindingRevokedEClass, "StoryPatternObjectType");
		ETypeParameter storyPatternLinkExecutionEClass_StoryPatternLinkType = addETypeParameter(storyPatternLinkExecutionEClass, "StoryPatternLinkType");
		ETypeParameter storyPatternLinkExecutionEClass_StoryPatternObjectType = addETypeParameter(storyPatternLinkExecutionEClass, "StoryPatternObjectType");
		ETypeParameter traversingLinkEClass_StoryPatternLinkType = addETypeParameter(traversingLinkEClass, "StoryPatternLinkType");
		ETypeParameter traversingLinkEClass_StoryPatternObjectType = addETypeParameter(traversingLinkEClass, "StoryPatternObjectType");
		ETypeParameter linkCheckEClass_StoryPatternLinkType = addETypeParameter(linkCheckEClass, "StoryPatternLinkType");
		ETypeParameter linkCheckEClass_StoryPatternObjectType = addETypeParameter(linkCheckEClass, "StoryPatternObjectType");
		ETypeParameter linkCheckSuccessfulEClass_StoryPatternLinkType = addETypeParameter(linkCheckSuccessfulEClass, "StoryPatternLinkType");
		ETypeParameter linkCheckSuccessfulEClass_StoryPatternObjectType = addETypeParameter(linkCheckSuccessfulEClass, "StoryPatternObjectType");
		ETypeParameter linkCheckFailedEClass_StoryPatternLinkType = addETypeParameter(linkCheckFailedEClass, "StoryPatternLinkType");
		ETypeParameter linkCheckFailedEClass_StoryPatternObjectType = addETypeParameter(linkCheckFailedEClass, "StoryPatternObjectType");
		ETypeParameter expressionEvaluationEClass_ExpressionType = addETypeParameter(expressionEvaluationEClass, "ExpressionType");
		ETypeParameter instanceObjectModificationEClass_StoryPatternObjectType = addETypeParameter(instanceObjectModificationEClass, "StoryPatternObjectType");
		ETypeParameter instanceObjectCreationEClass_StoryPatternObjectType = addETypeParameter(instanceObjectCreationEClass, "StoryPatternObjectType");
		ETypeParameter instanceObjectDeletionEClass_StoryPatternObjectType = addETypeParameter(instanceObjectDeletionEClass, "StoryPatternObjectType");
		ETypeParameter instanceLinkModificationEClass_StoryPatternLinkType = addETypeParameter(instanceLinkModificationEClass, "StoryPatternLinkType");
		ETypeParameter instanceLinkModificationEClass_StoryPatternObjectType = addETypeParameter(instanceLinkModificationEClass, "StoryPatternObjectType");
		ETypeParameter instanceLinkCreationEClass_StoryPatternLinkType = addETypeParameter(instanceLinkCreationEClass, "StoryPatternLinkType");
		ETypeParameter instanceLinkCreationEClass_StoryPatternObjectType = addETypeParameter(instanceLinkCreationEClass, "StoryPatternObjectType");
		ETypeParameter instanceLinkDeletionEClass_StoryPatternLinkType = addETypeParameter(instanceLinkDeletionEClass, "StoryPatternLinkType");
		ETypeParameter instanceLinkDeletionEClass_StoryPatternObjectType = addETypeParameter(instanceLinkDeletionEClass, "StoryPatternObjectType");
		ETypeParameter attributeValueSetEClass_StoryPatternObjectType = addETypeParameter(attributeValueSetEClass, "StoryPatternObjectType");
		ETypeParameter attributeValueSetEClass_FeatureType = addETypeParameter(attributeValueSetEClass, "FeatureType");
		ETypeParameter variableModificationEClass_ClassifierType = addETypeParameter(variableModificationEClass, "ClassifierType");
		ETypeParameter variableCreatedEClass_ClassifierType = addETypeParameter(variableCreatedEClass, "ClassifierType");
		ETypeParameter variableDeletedEClass_ClassifierType = addETypeParameter(variableDeletedEClass, "ClassifierType");
		ETypeParameter variableChangedEClass_ClassifierType = addETypeParameter(variableChangedEClass, "ClassifierType");
		ETypeParameter storyPatternObjectConstraintEvaluationEClass_StoryPatternObjectType = addETypeParameter(storyPatternObjectConstraintEvaluationEClass, "StoryPatternObjectType");
		ETypeParameter storyPatternObjectConstraintEvaluationEClass_ExpressionType = addETypeParameter(storyPatternObjectConstraintEvaluationEClass, "ExpressionType");
		ETypeParameter storyPatternObjectConstraintHoldsEClass_StoryPatternObjectType = addETypeParameter(storyPatternObjectConstraintHoldsEClass, "StoryPatternObjectType");
		ETypeParameter storyPatternObjectConstraintHoldsEClass_ExpressionType = addETypeParameter(storyPatternObjectConstraintHoldsEClass, "ExpressionType");
		ETypeParameter storyPatternObjectConstraintViolatedEClass_StoryPatternObjectType = addETypeParameter(storyPatternObjectConstraintViolatedEClass, "StoryPatternObjectType");
		ETypeParameter storyPatternObjectConstraintViolatedEClass_ExpressionType = addETypeParameter(storyPatternObjectConstraintViolatedEClass, "ExpressionType");
		ETypeParameter storyPatternConstraintEvaluationEClass_StoryPatternType = addETypeParameter(storyPatternConstraintEvaluationEClass, "StoryPatternType");
		ETypeParameter storyPatternConstraintEvaluationEClass_ExpressionType = addETypeParameter(storyPatternConstraintEvaluationEClass, "ExpressionType");
		ETypeParameter storyPatternConstraintHoldsEClass_StoryPatternType = addETypeParameter(storyPatternConstraintHoldsEClass, "StoryPatternType");
		ETypeParameter storyPatternConstraintHoldsEClass_ExpressionType = addETypeParameter(storyPatternConstraintHoldsEClass, "ExpressionType");
		ETypeParameter storyPatternConstraintViolatedEClass_StoryPatternType = addETypeParameter(storyPatternConstraintViolatedEClass, "StoryPatternType");
		ETypeParameter storyPatternConstraintViolatedEClass_ExpressionType = addETypeParameter(storyPatternConstraintViolatedEClass, "ExpressionType");

		// Set bounds for type parameters

		// Add supertypes to classes
		activityExecutionEClass.getESuperTypes().add(this.getExecution());
		activityNodeExecutionEClass.getESuperTypes().add(this.getExecution());
		activityEdgeTraversalEClass.getESuperTypes().add(this.getExecution());
		storyPatternExecutionEClass.getESuperTypes().add(this.getExecution());
		EGenericType g1 = createEGenericType(this.getStoryPatternExecution());
		EGenericType g2 = createEGenericType(storyPatternInitializationEClass_StoryPatternType);
		g1.getETypeArguments().add(g2);
		storyPatternInitializationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStoryPatternExecution());
		g2 = createEGenericType(storyPatternMatchingEClass_StoryPatternType);
		g1.getETypeArguments().add(g2);
		storyPatternMatchingEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStoryPatternExecution());
		g2 = createEGenericType(storyPatternApplicationEClass_StoryPatternType);
		g1.getETypeArguments().add(g2);
		storyPatternApplicationEClass.getEGenericSuperTypes().add(g1);
		storyPatternObjectExecutionEClass.getESuperTypes().add(this.getExecution());
		g1 = createEGenericType(this.getStoryPatternObjectExecution());
		g2 = createEGenericType(storyPatternObjectBoundEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		storyPatternObjectBoundEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStoryPatternObjectExecution());
		g2 = createEGenericType(storyPatternObjectNotBoundEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		storyPatternObjectNotBoundEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStoryPatternObjectExecution());
		g2 = createEGenericType(storyPatternObjectBindingRevokedEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		storyPatternObjectBindingRevokedEClass.getEGenericSuperTypes().add(g1);
		storyPatternLinkExecutionEClass.getESuperTypes().add(this.getExecution());
		g1 = createEGenericType(this.getStoryPatternLinkExecution());
		g2 = createEGenericType(traversingLinkEClass_StoryPatternLinkType);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(traversingLinkEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		traversingLinkEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStoryPatternLinkExecution());
		g2 = createEGenericType(linkCheckEClass_StoryPatternLinkType);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(linkCheckEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		linkCheckEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getLinkCheck());
		g2 = createEGenericType(linkCheckSuccessfulEClass_StoryPatternLinkType);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(linkCheckSuccessfulEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		linkCheckSuccessfulEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getLinkCheck());
		g2 = createEGenericType(linkCheckFailedEClass_StoryPatternLinkType);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(linkCheckFailedEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		linkCheckFailedEClass.getEGenericSuperTypes().add(g1);
		expressionEvaluationEClass.getESuperTypes().add(this.getExecution());
		instanceObjectModificationEClass.getESuperTypes().add(this.getExecution());
		g1 = createEGenericType(this.getInstanceObjectModification());
		g2 = createEGenericType(instanceObjectCreationEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		instanceObjectCreationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getInstanceObjectModification());
		g2 = createEGenericType(instanceObjectDeletionEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		instanceObjectDeletionEClass.getEGenericSuperTypes().add(g1);
		instanceLinkModificationEClass.getESuperTypes().add(this.getExecution());
		g1 = createEGenericType(this.getInstanceLinkModification());
		g2 = createEGenericType(instanceLinkCreationEClass_StoryPatternLinkType);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(instanceLinkCreationEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		instanceLinkCreationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getInstanceLinkModification());
		g2 = createEGenericType(instanceLinkDeletionEClass_StoryPatternLinkType);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(instanceLinkDeletionEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		instanceLinkDeletionEClass.getEGenericSuperTypes().add(g1);
		attributeValueSetEClass.getESuperTypes().add(this.getExecution());
		variableModificationEClass.getESuperTypes().add(this.getExecution());
		g1 = createEGenericType(this.getVariableModification());
		g2 = createEGenericType(variableCreatedEClass_ClassifierType);
		g1.getETypeArguments().add(g2);
		variableCreatedEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVariableModification());
		g2 = createEGenericType(variableDeletedEClass_ClassifierType);
		g1.getETypeArguments().add(g2);
		variableDeletedEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVariableModification());
		g2 = createEGenericType(variableChangedEClass_ClassifierType);
		g1.getETypeArguments().add(g2);
		variableChangedEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStoryPatternObjectExecution());
		g2 = createEGenericType(storyPatternObjectConstraintEvaluationEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		storyPatternObjectConstraintEvaluationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStoryPatternObjectConstraintEvaluation());
		g2 = createEGenericType(storyPatternObjectConstraintHoldsEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(storyPatternObjectConstraintHoldsEClass_ExpressionType);
		g1.getETypeArguments().add(g2);
		storyPatternObjectConstraintHoldsEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStoryPatternObjectConstraintEvaluation());
		g2 = createEGenericType(storyPatternObjectConstraintViolatedEClass_StoryPatternObjectType);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(storyPatternObjectConstraintViolatedEClass_ExpressionType);
		g1.getETypeArguments().add(g2);
		storyPatternObjectConstraintViolatedEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStoryPatternExecution());
		g2 = createEGenericType(storyPatternConstraintEvaluationEClass_StoryPatternType);
		g1.getETypeArguments().add(g2);
		storyPatternConstraintEvaluationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStoryPatternConstraintEvaluation());
		g2 = createEGenericType(storyPatternConstraintHoldsEClass_StoryPatternType);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(storyPatternConstraintHoldsEClass_ExpressionType);
		g1.getETypeArguments().add(g2);
		storyPatternConstraintHoldsEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStoryPatternConstraintEvaluation());
		g2 = createEGenericType(storyPatternConstraintViolatedEClass_StoryPatternType);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(storyPatternConstraintViolatedEClass_ExpressionType);
		g1.getETypeArguments().add(g2);
		storyPatternConstraintViolatedEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(mapEntryEClass, Map.Entry.class, "MapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(mapEntryEClass_KeyType);
		initEAttribute(getMapEntry_Key(), g1, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(mapEntryEClass_ValueType);
		initEAttribute(getMapEntry_Value(), g1, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionTraceEClass, ExecutionTrace.class, "ExecutionTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionTrace_Executions(), this.getExecution(), null, "executions", null, 0, -1, ExecutionTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionTrace_Description(), theEcorePackage.getEString(), "description", null, 0, 1, ExecutionTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionTrace_TotalExecutionTime(), theEcorePackage.getELong(), "totalExecutionTime", "0", 0, 1, ExecutionTrace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionTrace_TotalExecutionTimeMsec(), theEcorePackage.getELong(), "totalExecutionTimeMsec", "0", 0, 1, ExecutionTrace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(executionEClass, Execution.class, "Execution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecution_ExecutionStartedTimeStamp(), theEcorePackage.getELong(), "executionStartedTimeStamp", "0", 1, 1, Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_ExecutionFinishedTimeStamp(), theEcorePackage.getELong(), "executionFinishedTimeStamp", "0", 1, 1, Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_ExecutionTime(), theEcorePackage.getELong(), "executionTime", "0", 0, 1, Execution.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_ExecutionTimeMsec(), theEcorePackage.getELong(), "executionTimeMsec", "0", 0, 1, Execution.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExecution_Elements(), this.getExecution(), this.getExecution_Container(), "elements", null, 0, -1, Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecution_Container(), this.getExecution(), this.getExecution_Elements(), "container", null, 0, 1, Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityExecutionEClass, ActivityExecution.class, "ActivityExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(activityExecutionEClass_ActivityType);
		initEReference(getActivityExecution_Activity(), g1, null, "activity", null, 0, 1, ActivityExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getMapEntry());
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEReference(getActivityExecution_InParameterValues(), g1, null, "inParameterValues", null, 0, -1, ActivityExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getMapEntry());
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEReference(getActivityExecution_OutParameterValues(), g1, null, "outParameterValues", null, 0, -1, ActivityExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityNodeExecutionEClass, ActivityNodeExecution.class, "ActivityNodeExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(activityNodeExecutionEClass_ActivityNodeType);
		initEReference(getActivityNodeExecution_ActivityNode(), g1, null, "activityNode", null, 1, 1, ActivityNodeExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEdgeTraversalEClass, ActivityEdgeTraversal.class, "ActivityEdgeTraversal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(activityEdgeTraversalEClass_ActivityEdgeType);
		initEReference(getActivityEdgeTraversal_ActivityEdge(), g1, null, "activityEdge", null, 1, 1, ActivityEdgeTraversal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storyPatternExecutionEClass, StoryPatternExecution.class, "StoryPatternExecution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(storyPatternExecutionEClass_StoryPatternType);
		initEReference(getStoryPatternExecution_StoryPattern(), g1, null, "storyPattern", null, 1, 1, StoryPatternExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storyPatternInitializationEClass, StoryPatternInitialization.class, "StoryPatternInitialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storyPatternMatchingEClass, StoryPatternMatching.class, "StoryPatternMatching", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStoryPatternMatching_Successful(), theEcorePackage.getEBoolean(), "successful", null, 0, 1, StoryPatternMatching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storyPatternApplicationEClass, StoryPatternApplication.class, "StoryPatternApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storyPatternObjectExecutionEClass, StoryPatternObjectExecution.class, "StoryPatternObjectExecution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(storyPatternObjectExecutionEClass_StoryPatternObjectType);
		initEReference(getStoryPatternObjectExecution_StoryPatternObject(), g1, null, "storyPatternObject", null, 1, 1, StoryPatternObjectExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storyPatternObjectBoundEClass, StoryPatternObjectBound.class, "StoryPatternObjectBound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStoryPatternObjectBound_Value(), theEcorePackage.getEString(), "value", null, 1, 1, StoryPatternObjectBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storyPatternObjectNotBoundEClass, StoryPatternObjectNotBound.class, "StoryPatternObjectNotBound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storyPatternObjectBindingRevokedEClass, StoryPatternObjectBindingRevoked.class, "StoryPatternObjectBindingRevoked", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStoryPatternObjectBindingRevoked_PreviousValue(), theEcorePackage.getEString(), "previousValue", null, 1, 1, StoryPatternObjectBindingRevoked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storyPatternLinkExecutionEClass, StoryPatternLinkExecution.class, "StoryPatternLinkExecution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(storyPatternLinkExecutionEClass_StoryPatternLinkType);
		initEReference(getStoryPatternLinkExecution_StoryPatternLink(), g1, null, "storyPatternLink", null, 1, 1, StoryPatternLinkExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(storyPatternLinkExecutionEClass_StoryPatternObjectType);
		initEReference(getStoryPatternLinkExecution_SourceStoryPatternObject(), g1, null, "sourceStoryPatternObject", null, 1, 1, StoryPatternLinkExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(storyPatternLinkExecutionEClass_StoryPatternObjectType);
		initEReference(getStoryPatternLinkExecution_TargetStoryPatternObject(), g1, null, "targetStoryPatternObject", null, 1, 1, StoryPatternLinkExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoryPatternLinkExecution_SourceObject(), theEcorePackage.getEString(), "sourceObject", null, 1, 1, StoryPatternLinkExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traversingLinkEClass, TraversingLink.class, "TraversingLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkCheckEClass, LinkCheck.class, "LinkCheck", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkCheck_TargetObject(), theEcorePackage.getEString(), "targetObject", null, 0, 1, LinkCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkCheckSuccessfulEClass, LinkCheckSuccessful.class, "LinkCheckSuccessful", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkCheckFailedEClass, LinkCheckFailed.class, "LinkCheckFailed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEvaluationEClass, ExpressionEvaluation.class, "ExpressionEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(expressionEvaluationEClass_ExpressionType);
		initEReference(getExpressionEvaluation_Expression(), g1, null, "expression", null, 0, 1, ExpressionEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpressionEvaluation_Result(), theEcorePackage.getEString(), "result", null, 1, 1, ExpressionEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceObjectModificationEClass, InstanceObjectModification.class, "InstanceObjectModification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(instanceObjectModificationEClass_StoryPatternObjectType);
		initEReference(getInstanceObjectModification_StoryPatternObject(), g1, null, "storyPatternObject", null, 1, 1, InstanceObjectModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceObjectModification_InstanceObject(), theEcorePackage.getEString(), "instanceObject", null, 1, 1, InstanceObjectModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceObjectCreationEClass, InstanceObjectCreation.class, "InstanceObjectCreation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceObjectDeletionEClass, InstanceObjectDeletion.class, "InstanceObjectDeletion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceLinkModificationEClass, InstanceLinkModification.class, "InstanceLinkModification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(instanceLinkModificationEClass_StoryPatternLinkType);
		initEReference(getInstanceLinkModification_StoryPatternLink(), g1, null, "storyPatternLink", null, 0, 1, InstanceLinkModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(instanceLinkModificationEClass_StoryPatternObjectType);
		initEReference(getInstanceLinkModification_SourceStoryPatternObject(), g1, null, "sourceStoryPatternObject", null, 1, 1, InstanceLinkModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(instanceLinkModificationEClass_StoryPatternObjectType);
		initEReference(getInstanceLinkModification_TargetStoryPatternObject(), g1, null, "targetStoryPatternObject", null, 1, 1, InstanceLinkModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceLinkModification_SourceInstanceObject(), theEcorePackage.getEString(), "sourceInstanceObject", null, 1, 1, InstanceLinkModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceLinkModification_TargetInstanceObject(), theEcorePackage.getEString(), "targetInstanceObject", null, 1, 1, InstanceLinkModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceLinkCreationEClass, InstanceLinkCreation.class, "InstanceLinkCreation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceLinkDeletionEClass, InstanceLinkDeletion.class, "InstanceLinkDeletion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeValueSetEClass, AttributeValueSet.class, "AttributeValueSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(attributeValueSetEClass_StoryPatternObjectType);
		initEReference(getAttributeValueSet_StoryPatternObject(), g1, null, "storyPatternObject", null, 1, 1, AttributeValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(attributeValueSetEClass_FeatureType);
		initEReference(getAttributeValueSet_Feature(), g1, null, "feature", null, 1, 1, AttributeValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeValueSet_InstanceObject(), theEcorePackage.getEString(), "instanceObject", null, 1, 1, AttributeValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeValueSet_NewValue(), theEcorePackage.getEString(), "newValue", null, 1, 1, AttributeValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableModificationEClass, VariableModification.class, "VariableModification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableModification_VariableName(), theEcorePackage.getEString(), "variableName", null, 1, 1, VariableModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(variableModificationEClass_ClassifierType);
		initEReference(getVariableModification_Classifier(), g1, null, "classifier", null, 1, 1, VariableModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableModification_Value(), theEcorePackage.getEString(), "value", null, 1, 1, VariableModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableCreatedEClass, VariableCreated.class, "VariableCreated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableDeletedEClass, VariableDeleted.class, "VariableDeleted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableChangedEClass, VariableChanged.class, "VariableChanged", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableChanged_OldValue(), theEcorePackage.getEString(), "oldValue", null, 1, 1, VariableChanged.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storyPatternObjectConstraintEvaluationEClass, StoryPatternObjectConstraintEvaluation.class, "StoryPatternObjectConstraintEvaluation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(storyPatternObjectConstraintEvaluationEClass_ExpressionType);
		initEReference(getStoryPatternObjectConstraintEvaluation_Constraint(), g1, null, "constraint", null, 1, 1, StoryPatternObjectConstraintEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storyPatternObjectConstraintHoldsEClass, StoryPatternObjectConstraintHolds.class, "StoryPatternObjectConstraintHolds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storyPatternObjectConstraintViolatedEClass, StoryPatternObjectConstraintViolated.class, "StoryPatternObjectConstraintViolated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storyPatternConstraintEvaluationEClass, StoryPatternConstraintEvaluation.class, "StoryPatternConstraintEvaluation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(storyPatternConstraintEvaluationEClass_ExpressionType);
		initEReference(getStoryPatternConstraintEvaluation_Constraint(), g1, null, "constraint", null, 1, 1, StoryPatternConstraintEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storyPatternConstraintHoldsEClass, StoryPatternConstraintHolds.class, "StoryPatternConstraintHolds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storyPatternConstraintViolatedEClass, StoryPatternConstraintViolated.class, "StoryPatternConstraintViolated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ExecutiontracePackageImpl
