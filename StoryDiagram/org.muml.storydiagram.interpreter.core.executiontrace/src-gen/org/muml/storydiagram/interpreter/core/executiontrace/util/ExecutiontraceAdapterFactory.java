/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.muml.storydiagram.interpreter.core.executiontrace.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage
 * @generated
 */
public class ExecutiontraceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExecutiontracePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutiontraceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExecutiontracePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutiontraceSwitch<Adapter> modelSwitch =
		new ExecutiontraceSwitch<Adapter>() {
			@Override
			public <KeyType, ValueType> Adapter caseMapEntry(Map.Entry<KeyType, ValueType> object) {
				return createMapEntryAdapter();
			}
			@Override
			public Adapter caseExecutionTrace(ExecutionTrace object) {
				return createExecutionTraceAdapter();
			}
			@Override
			public Adapter caseExecution(Execution object) {
				return createExecutionAdapter();
			}
			@Override
			public <ActivityType> Adapter caseActivityExecution(ActivityExecution<ActivityType> object) {
				return createActivityExecutionAdapter();
			}
			@Override
			public <ActivityNodeType> Adapter caseActivityNodeExecution(ActivityNodeExecution<ActivityNodeType> object) {
				return createActivityNodeExecutionAdapter();
			}
			@Override
			public <ActivityEdgeType> Adapter caseActivityEdgeTraversal(ActivityEdgeTraversal<ActivityEdgeType> object) {
				return createActivityEdgeTraversalAdapter();
			}
			@Override
			public <StoryPatternType> Adapter caseStoryPatternExecution(StoryPatternExecution<StoryPatternType> object) {
				return createStoryPatternExecutionAdapter();
			}
			@Override
			public <StoryPatternType> Adapter caseStoryPatternInitialization(StoryPatternInitialization<StoryPatternType> object) {
				return createStoryPatternInitializationAdapter();
			}
			@Override
			public <StoryPatternType> Adapter caseStoryPatternMatching(StoryPatternMatching<StoryPatternType> object) {
				return createStoryPatternMatchingAdapter();
			}
			@Override
			public <StoryPatternType> Adapter caseStoryPatternApplication(StoryPatternApplication<StoryPatternType> object) {
				return createStoryPatternApplicationAdapter();
			}
			@Override
			public <StoryPatternObjectType> Adapter caseStoryPatternObjectExecution(StoryPatternObjectExecution<StoryPatternObjectType> object) {
				return createStoryPatternObjectExecutionAdapter();
			}
			@Override
			public <StoryPatternObjectType> Adapter caseStoryPatternObjectBound(StoryPatternObjectBound<StoryPatternObjectType> object) {
				return createStoryPatternObjectBoundAdapter();
			}
			@Override
			public <StoryPatternObjectType> Adapter caseStoryPatternObjectNotBound(StoryPatternObjectNotBound<StoryPatternObjectType> object) {
				return createStoryPatternObjectNotBoundAdapter();
			}
			@Override
			public <StoryPatternObjectType> Adapter caseStoryPatternObjectBindingRevoked(StoryPatternObjectBindingRevoked<StoryPatternObjectType> object) {
				return createStoryPatternObjectBindingRevokedAdapter();
			}
			@Override
			public <StoryPatternLinkType, StoryPatternObjectType> Adapter caseStoryPatternLinkExecution(StoryPatternLinkExecution<StoryPatternLinkType, StoryPatternObjectType> object) {
				return createStoryPatternLinkExecutionAdapter();
			}
			@Override
			public <StoryPatternLinkType, StoryPatternObjectType> Adapter caseTraversingLink(TraversingLink<StoryPatternLinkType, StoryPatternObjectType> object) {
				return createTraversingLinkAdapter();
			}
			@Override
			public <StoryPatternLinkType, StoryPatternObjectType> Adapter caseLinkCheck(LinkCheck<StoryPatternLinkType, StoryPatternObjectType> object) {
				return createLinkCheckAdapter();
			}
			@Override
			public <StoryPatternLinkType, StoryPatternObjectType> Adapter caseLinkCheckSuccessful(LinkCheckSuccessful<StoryPatternLinkType, StoryPatternObjectType> object) {
				return createLinkCheckSuccessfulAdapter();
			}
			@Override
			public <StoryPatternLinkType, StoryPatternObjectType> Adapter caseLinkCheckFailed(LinkCheckFailed<StoryPatternLinkType, StoryPatternObjectType> object) {
				return createLinkCheckFailedAdapter();
			}
			@Override
			public <ExpressionType> Adapter caseExpressionEvaluation(ExpressionEvaluation<ExpressionType> object) {
				return createExpressionEvaluationAdapter();
			}
			@Override
			public <StoryPatternObjectType> Adapter caseInstanceObjectModification(InstanceObjectModification<StoryPatternObjectType> object) {
				return createInstanceObjectModificationAdapter();
			}
			@Override
			public <StoryPatternObjectType> Adapter caseInstanceObjectCreation(InstanceObjectCreation<StoryPatternObjectType> object) {
				return createInstanceObjectCreationAdapter();
			}
			@Override
			public <StoryPatternObjectType> Adapter caseInstanceObjectDeletion(InstanceObjectDeletion<StoryPatternObjectType> object) {
				return createInstanceObjectDeletionAdapter();
			}
			@Override
			public <StoryPatternLinkType, StoryPatternObjectType> Adapter caseInstanceLinkModification(InstanceLinkModification<StoryPatternLinkType, StoryPatternObjectType> object) {
				return createInstanceLinkModificationAdapter();
			}
			@Override
			public <StoryPatternLinkType, StoryPatternObjectType> Adapter caseInstanceLinkCreation(InstanceLinkCreation<StoryPatternLinkType, StoryPatternObjectType> object) {
				return createInstanceLinkCreationAdapter();
			}
			@Override
			public <StoryPatternLinkType, StoryPatternObjectType> Adapter caseInstanceLinkDeletion(InstanceLinkDeletion<StoryPatternLinkType, StoryPatternObjectType> object) {
				return createInstanceLinkDeletionAdapter();
			}
			@Override
			public <StoryPatternObjectType, FeatureType> Adapter caseAttributeValueSet(AttributeValueSet<StoryPatternObjectType, FeatureType> object) {
				return createAttributeValueSetAdapter();
			}
			@Override
			public <ClassifierType> Adapter caseVariableModification(VariableModification<ClassifierType> object) {
				return createVariableModificationAdapter();
			}
			@Override
			public <ClassifierType> Adapter caseVariableCreated(VariableCreated<ClassifierType> object) {
				return createVariableCreatedAdapter();
			}
			@Override
			public <ClassifierType> Adapter caseVariableDeleted(VariableDeleted<ClassifierType> object) {
				return createVariableDeletedAdapter();
			}
			@Override
			public <ClassifierType> Adapter caseVariableChanged(VariableChanged<ClassifierType> object) {
				return createVariableChangedAdapter();
			}
			@Override
			public <StoryPatternObjectType, ExpressionType> Adapter caseStoryPatternObjectConstraintEvaluation(StoryPatternObjectConstraintEvaluation<StoryPatternObjectType, ExpressionType> object) {
				return createStoryPatternObjectConstraintEvaluationAdapter();
			}
			@Override
			public <StoryPatternObjectType, ExpressionType> Adapter caseStoryPatternObjectConstraintHolds(StoryPatternObjectConstraintHolds<StoryPatternObjectType, ExpressionType> object) {
				return createStoryPatternObjectConstraintHoldsAdapter();
			}
			@Override
			public <StoryPatternObjectType, ExpressionType> Adapter caseStoryPatternObjectConstraintViolated(StoryPatternObjectConstraintViolated<StoryPatternObjectType, ExpressionType> object) {
				return createStoryPatternObjectConstraintViolatedAdapter();
			}
			@Override
			public <StoryPatternType, ExpressionType> Adapter caseStoryPatternConstraintEvaluation(StoryPatternConstraintEvaluation<StoryPatternType, ExpressionType> object) {
				return createStoryPatternConstraintEvaluationAdapter();
			}
			@Override
			public <StoryPatternType, ExpressionType> Adapter caseStoryPatternConstraintHolds(StoryPatternConstraintHolds<StoryPatternType, ExpressionType> object) {
				return createStoryPatternConstraintHoldsAdapter();
			}
			@Override
			public <StoryPatternType, ExpressionType> Adapter caseStoryPatternConstraintViolated(StoryPatternConstraintViolated<StoryPatternType, ExpressionType> object) {
				return createStoryPatternConstraintViolatedAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace <em>Execution Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace
	 * @generated
	 */
	public Adapter createExecutionTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.Execution
	 * @generated
	 */
	public Adapter createExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution <em>Activity Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution
	 * @generated
	 */
	public Adapter createActivityExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityNodeExecution <em>Activity Node Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ActivityNodeExecution
	 * @generated
	 */
	public Adapter createActivityNodeExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityEdgeTraversal <em>Activity Edge Traversal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ActivityEdgeTraversal
	 * @generated
	 */
	public Adapter createActivityEdgeTraversalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternExecution <em>Story Pattern Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternExecution
	 * @generated
	 */
	public Adapter createStoryPatternExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternInitialization <em>Story Pattern Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternInitialization
	 * @generated
	 */
	public Adapter createStoryPatternInitializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternMatching <em>Story Pattern Matching</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternMatching
	 * @generated
	 */
	public Adapter createStoryPatternMatchingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternApplication <em>Story Pattern Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternApplication
	 * @generated
	 */
	public Adapter createStoryPatternApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectExecution <em>Story Pattern Object Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectExecution
	 * @generated
	 */
	public Adapter createStoryPatternObjectExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBound <em>Story Pattern Object Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBound
	 * @generated
	 */
	public Adapter createStoryPatternObjectBoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectNotBound <em>Story Pattern Object Not Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectNotBound
	 * @generated
	 */
	public Adapter createStoryPatternObjectNotBoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBindingRevoked <em>Story Pattern Object Binding Revoked</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBindingRevoked
	 * @generated
	 */
	public Adapter createStoryPatternObjectBindingRevokedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternLinkExecution <em>Story Pattern Link Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternLinkExecution
	 * @generated
	 */
	public Adapter createStoryPatternLinkExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.TraversingLink <em>Traversing Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.TraversingLink
	 * @generated
	 */
	public Adapter createTraversingLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.LinkCheck <em>Link Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.LinkCheck
	 * @generated
	 */
	public Adapter createLinkCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.LinkCheckSuccessful <em>Link Check Successful</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.LinkCheckSuccessful
	 * @generated
	 */
	public Adapter createLinkCheckSuccessfulAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.LinkCheckFailed <em>Link Check Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.LinkCheckFailed
	 * @generated
	 */
	public Adapter createLinkCheckFailedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.ExpressionEvaluation <em>Expression Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExpressionEvaluation
	 * @generated
	 */
	public Adapter createExpressionEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectModification <em>Instance Object Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectModification
	 * @generated
	 */
	public Adapter createInstanceObjectModificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectCreation <em>Instance Object Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectCreation
	 * @generated
	 */
	public Adapter createInstanceObjectCreationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectDeletion <em>Instance Object Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectDeletion
	 * @generated
	 */
	public Adapter createInstanceObjectDeletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkModification <em>Instance Link Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkModification
	 * @generated
	 */
	public Adapter createInstanceLinkModificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkCreation <em>Instance Link Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkCreation
	 * @generated
	 */
	public Adapter createInstanceLinkCreationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkDeletion <em>Instance Link Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.InstanceLinkDeletion
	 * @generated
	 */
	public Adapter createInstanceLinkDeletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.AttributeValueSet <em>Attribute Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.AttributeValueSet
	 * @generated
	 */
	public Adapter createAttributeValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableModification <em>Variable Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.VariableModification
	 * @generated
	 */
	public Adapter createVariableModificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableCreated <em>Variable Created</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.VariableCreated
	 * @generated
	 */
	public Adapter createVariableCreatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableDeleted <em>Variable Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.VariableDeleted
	 * @generated
	 */
	public Adapter createVariableDeletedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableChanged <em>Variable Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.VariableChanged
	 * @generated
	 */
	public Adapter createVariableChangedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintEvaluation <em>Story Pattern Object Constraint Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintEvaluation
	 * @generated
	 */
	public Adapter createStoryPatternObjectConstraintEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintHolds <em>Story Pattern Object Constraint Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintHolds
	 * @generated
	 */
	public Adapter createStoryPatternObjectConstraintHoldsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintViolated <em>Story Pattern Object Constraint Violated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectConstraintViolated
	 * @generated
	 */
	public Adapter createStoryPatternObjectConstraintViolatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintEvaluation <em>Story Pattern Constraint Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintEvaluation
	 * @generated
	 */
	public Adapter createStoryPatternConstraintEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintHolds <em>Story Pattern Constraint Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintHolds
	 * @generated
	 */
	public Adapter createStoryPatternConstraintHoldsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintViolated <em>Story Pattern Constraint Violated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintViolated
	 * @generated
	 */
	public Adapter createStoryPatternConstraintViolatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ExecutiontraceAdapterFactory
