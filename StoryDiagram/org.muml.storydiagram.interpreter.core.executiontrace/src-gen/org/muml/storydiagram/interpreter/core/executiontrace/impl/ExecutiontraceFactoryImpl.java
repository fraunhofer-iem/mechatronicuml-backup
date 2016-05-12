/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.muml.storydiagram.interpreter.core.executiontrace.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutiontraceFactoryImpl extends EFactoryImpl implements ExecutiontraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExecutiontraceFactory init() {
		try {
			ExecutiontraceFactory theExecutiontraceFactory = (ExecutiontraceFactory)EPackage.Registry.INSTANCE.getEFactory(ExecutiontracePackage.eNS_URI);
			if (theExecutiontraceFactory != null) {
				return theExecutiontraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExecutiontraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutiontraceFactoryImpl() {
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
			case ExecutiontracePackage.MAP_ENTRY: return (EObject)createMapEntry();
			case ExecutiontracePackage.EXECUTION_TRACE: return createExecutionTrace();
			case ExecutiontracePackage.ACTIVITY_EXECUTION: return createActivityExecution();
			case ExecutiontracePackage.ACTIVITY_NODE_EXECUTION: return createActivityNodeExecution();
			case ExecutiontracePackage.ACTIVITY_EDGE_TRAVERSAL: return createActivityEdgeTraversal();
			case ExecutiontracePackage.STORY_PATTERN_INITIALIZATION: return createStoryPatternInitialization();
			case ExecutiontracePackage.STORY_PATTERN_MATCHING: return createStoryPatternMatching();
			case ExecutiontracePackage.STORY_PATTERN_APPLICATION: return createStoryPatternApplication();
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_BOUND: return createStoryPatternObjectBound();
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_NOT_BOUND: return createStoryPatternObjectNotBound();
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_BINDING_REVOKED: return createStoryPatternObjectBindingRevoked();
			case ExecutiontracePackage.TRAVERSING_LINK: return createTraversingLink();
			case ExecutiontracePackage.LINK_CHECK_SUCCESSFUL: return createLinkCheckSuccessful();
			case ExecutiontracePackage.LINK_CHECK_FAILED: return createLinkCheckFailed();
			case ExecutiontracePackage.EXPRESSION_EVALUATION: return createExpressionEvaluation();
			case ExecutiontracePackage.INSTANCE_OBJECT_CREATION: return createInstanceObjectCreation();
			case ExecutiontracePackage.INSTANCE_OBJECT_DELETION: return createInstanceObjectDeletion();
			case ExecutiontracePackage.INSTANCE_LINK_CREATION: return createInstanceLinkCreation();
			case ExecutiontracePackage.INSTANCE_LINK_DELETION: return createInstanceLinkDeletion();
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET: return createAttributeValueSet();
			case ExecutiontracePackage.VARIABLE_CREATED: return createVariableCreated();
			case ExecutiontracePackage.VARIABLE_DELETED: return createVariableDeleted();
			case ExecutiontracePackage.VARIABLE_CHANGED: return createVariableChanged();
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS: return createStoryPatternObjectConstraintHolds();
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED: return createStoryPatternObjectConstraintViolated();
			case ExecutiontracePackage.STORY_PATTERN_CONSTRAINT_HOLDS: return createStoryPatternConstraintHolds();
			case ExecutiontracePackage.STORY_PATTERN_CONSTRAINT_VIOLATED: return createStoryPatternConstraintViolated();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <KeyType, ValueType> Map.Entry<KeyType, ValueType> createMapEntry() {
		MapEntryImpl<KeyType, ValueType> mapEntry = new MapEntryImpl<KeyType, ValueType>();
		return mapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionTrace createExecutionTrace() {
		ExecutionTraceImpl executionTrace = new ExecutionTraceImpl();
		return executionTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <ActivityType> ActivityExecution<ActivityType> createActivityExecution() {
		ActivityExecutionImpl<ActivityType> activityExecution = new ActivityExecutionImpl<ActivityType>();
		return activityExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <ActivityNodeType> ActivityNodeExecution<ActivityNodeType> createActivityNodeExecution() {
		ActivityNodeExecutionImpl<ActivityNodeType> activityNodeExecution = new ActivityNodeExecutionImpl<ActivityNodeType>();
		return activityNodeExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <ActivityEdgeType> ActivityEdgeTraversal<ActivityEdgeType> createActivityEdgeTraversal() {
		ActivityEdgeTraversalImpl<ActivityEdgeType> activityEdgeTraversal = new ActivityEdgeTraversalImpl<ActivityEdgeType>();
		return activityEdgeTraversal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternType> StoryPatternInitialization<StoryPatternType> createStoryPatternInitialization() {
		StoryPatternInitializationImpl<StoryPatternType> storyPatternInitialization = new StoryPatternInitializationImpl<StoryPatternType>();
		return storyPatternInitialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternType> StoryPatternMatching<StoryPatternType> createStoryPatternMatching() {
		StoryPatternMatchingImpl<StoryPatternType> storyPatternMatching = new StoryPatternMatchingImpl<StoryPatternType>();
		return storyPatternMatching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternType> StoryPatternApplication<StoryPatternType> createStoryPatternApplication() {
		StoryPatternApplicationImpl<StoryPatternType> storyPatternApplication = new StoryPatternApplicationImpl<StoryPatternType>();
		return storyPatternApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternObjectType> StoryPatternObjectBound<StoryPatternObjectType> createStoryPatternObjectBound() {
		StoryPatternObjectBoundImpl<StoryPatternObjectType> storyPatternObjectBound = new StoryPatternObjectBoundImpl<StoryPatternObjectType>();
		return storyPatternObjectBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternObjectType> StoryPatternObjectNotBound<StoryPatternObjectType> createStoryPatternObjectNotBound() {
		StoryPatternObjectNotBoundImpl<StoryPatternObjectType> storyPatternObjectNotBound = new StoryPatternObjectNotBoundImpl<StoryPatternObjectType>();
		return storyPatternObjectNotBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternObjectType> StoryPatternObjectBindingRevoked<StoryPatternObjectType> createStoryPatternObjectBindingRevoked() {
		StoryPatternObjectBindingRevokedImpl<StoryPatternObjectType> storyPatternObjectBindingRevoked = new StoryPatternObjectBindingRevokedImpl<StoryPatternObjectType>();
		return storyPatternObjectBindingRevoked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> TraversingLink<StoryPatternLinkType, StoryPatternObjectType> createTraversingLink() {
		TraversingLinkImpl<StoryPatternLinkType, StoryPatternObjectType> traversingLink = new TraversingLinkImpl<StoryPatternLinkType, StoryPatternObjectType>();
		return traversingLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> LinkCheckSuccessful<StoryPatternLinkType, StoryPatternObjectType> createLinkCheckSuccessful() {
		LinkCheckSuccessfulImpl<StoryPatternLinkType, StoryPatternObjectType> linkCheckSuccessful = new LinkCheckSuccessfulImpl<StoryPatternLinkType, StoryPatternObjectType>();
		return linkCheckSuccessful;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> LinkCheckFailed<StoryPatternLinkType, StoryPatternObjectType> createLinkCheckFailed() {
		LinkCheckFailedImpl<StoryPatternLinkType, StoryPatternObjectType> linkCheckFailed = new LinkCheckFailedImpl<StoryPatternLinkType, StoryPatternObjectType>();
		return linkCheckFailed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <ExpressionType> ExpressionEvaluation<ExpressionType> createExpressionEvaluation() {
		ExpressionEvaluationImpl<ExpressionType> expressionEvaluation = new ExpressionEvaluationImpl<ExpressionType>();
		return expressionEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternObjectType> InstanceObjectCreation<StoryPatternObjectType> createInstanceObjectCreation() {
		InstanceObjectCreationImpl<StoryPatternObjectType> instanceObjectCreation = new InstanceObjectCreationImpl<StoryPatternObjectType>();
		return instanceObjectCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternObjectType> InstanceObjectDeletion<StoryPatternObjectType> createInstanceObjectDeletion() {
		InstanceObjectDeletionImpl<StoryPatternObjectType> instanceObjectDeletion = new InstanceObjectDeletionImpl<StoryPatternObjectType>();
		return instanceObjectDeletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> InstanceLinkCreation<StoryPatternLinkType, StoryPatternObjectType> createInstanceLinkCreation() {
		InstanceLinkCreationImpl<StoryPatternLinkType, StoryPatternObjectType> instanceLinkCreation = new InstanceLinkCreationImpl<StoryPatternLinkType, StoryPatternObjectType>();
		return instanceLinkCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> InstanceLinkDeletion<StoryPatternLinkType, StoryPatternObjectType> createInstanceLinkDeletion() {
		InstanceLinkDeletionImpl<StoryPatternLinkType, StoryPatternObjectType> instanceLinkDeletion = new InstanceLinkDeletionImpl<StoryPatternLinkType, StoryPatternObjectType>();
		return instanceLinkDeletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternObjectType, FeatureType> AttributeValueSet<StoryPatternObjectType, FeatureType> createAttributeValueSet() {
		AttributeValueSetImpl<StoryPatternObjectType, FeatureType> attributeValueSet = new AttributeValueSetImpl<StoryPatternObjectType, FeatureType>();
		return attributeValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <ClassifierType> VariableCreated<ClassifierType> createVariableCreated() {
		VariableCreatedImpl<ClassifierType> variableCreated = new VariableCreatedImpl<ClassifierType>();
		return variableCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <ClassifierType> VariableDeleted<ClassifierType> createVariableDeleted() {
		VariableDeletedImpl<ClassifierType> variableDeleted = new VariableDeletedImpl<ClassifierType>();
		return variableDeleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <ClassifierType> VariableChanged<ClassifierType> createVariableChanged() {
		VariableChangedImpl<ClassifierType> variableChanged = new VariableChangedImpl<ClassifierType>();
		return variableChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternObjectType, ExpressionType> StoryPatternObjectConstraintHolds<StoryPatternObjectType, ExpressionType> createStoryPatternObjectConstraintHolds() {
		StoryPatternObjectConstraintHoldsImpl<StoryPatternObjectType, ExpressionType> storyPatternObjectConstraintHolds = new StoryPatternObjectConstraintHoldsImpl<StoryPatternObjectType, ExpressionType>();
		return storyPatternObjectConstraintHolds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternObjectType, ExpressionType> StoryPatternObjectConstraintViolated<StoryPatternObjectType, ExpressionType> createStoryPatternObjectConstraintViolated() {
		StoryPatternObjectConstraintViolatedImpl<StoryPatternObjectType, ExpressionType> storyPatternObjectConstraintViolated = new StoryPatternObjectConstraintViolatedImpl<StoryPatternObjectType, ExpressionType>();
		return storyPatternObjectConstraintViolated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternType, ExpressionType> StoryPatternConstraintHolds<StoryPatternType, ExpressionType> createStoryPatternConstraintHolds() {
		StoryPatternConstraintHoldsImpl<StoryPatternType, ExpressionType> storyPatternConstraintHolds = new StoryPatternConstraintHoldsImpl<StoryPatternType, ExpressionType>();
		return storyPatternConstraintHolds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <StoryPatternType, ExpressionType> StoryPatternConstraintViolated<StoryPatternType, ExpressionType> createStoryPatternConstraintViolated() {
		StoryPatternConstraintViolatedImpl<StoryPatternType, ExpressionType> storyPatternConstraintViolated = new StoryPatternConstraintViolatedImpl<StoryPatternType, ExpressionType>();
		return storyPatternConstraintViolated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutiontracePackage getExecutiontracePackage() {
		return (ExecutiontracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExecutiontracePackage getPackage() {
		return ExecutiontracePackage.eINSTANCE;
	}

} //ExecutiontraceFactoryImpl
