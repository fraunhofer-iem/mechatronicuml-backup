/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.muml.storydiagram.interpreter.core.executiontrace.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage
 * @generated
 */
public class ExecutiontraceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExecutiontracePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutiontraceSwitch() {
		if (modelPackage == null) {
			modelPackage = ExecutiontracePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExecutiontracePackage.MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<?, ?> mapEntry = (Map.Entry<?, ?>)theEObject;
				T result = caseMapEntry(mapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.EXECUTION_TRACE: {
				ExecutionTrace executionTrace = (ExecutionTrace)theEObject;
				T result = caseExecutionTrace(executionTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.EXECUTION: {
				Execution execution = (Execution)theEObject;
				T result = caseExecution(execution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.ACTIVITY_EXECUTION: {
				ActivityExecution<?> activityExecution = (ActivityExecution<?>)theEObject;
				T result = caseActivityExecution(activityExecution);
				if (result == null) result = caseExecution(activityExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.ACTIVITY_NODE_EXECUTION: {
				ActivityNodeExecution<?> activityNodeExecution = (ActivityNodeExecution<?>)theEObject;
				T result = caseActivityNodeExecution(activityNodeExecution);
				if (result == null) result = caseExecution(activityNodeExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.ACTIVITY_EDGE_TRAVERSAL: {
				ActivityEdgeTraversal<?> activityEdgeTraversal = (ActivityEdgeTraversal<?>)theEObject;
				T result = caseActivityEdgeTraversal(activityEdgeTraversal);
				if (result == null) result = caseExecution(activityEdgeTraversal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.STORY_PATTERN_EXECUTION: {
				StoryPatternExecution<?> storyPatternExecution = (StoryPatternExecution<?>)theEObject;
				T result = caseStoryPatternExecution(storyPatternExecution);
				if (result == null) result = caseExecution(storyPatternExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.STORY_PATTERN_INITIALIZATION: {
				StoryPatternInitialization<?> storyPatternInitialization = (StoryPatternInitialization<?>)theEObject;
				T result = caseStoryPatternInitialization(storyPatternInitialization);
				if (result == null) result = caseStoryPatternExecution(storyPatternInitialization);
				if (result == null) result = caseExecution(storyPatternInitialization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.STORY_PATTERN_MATCHING: {
				StoryPatternMatching<?> storyPatternMatching = (StoryPatternMatching<?>)theEObject;
				T result = caseStoryPatternMatching(storyPatternMatching);
				if (result == null) result = caseStoryPatternExecution(storyPatternMatching);
				if (result == null) result = caseExecution(storyPatternMatching);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.STORY_PATTERN_APPLICATION: {
				StoryPatternApplication<?> storyPatternApplication = (StoryPatternApplication<?>)theEObject;
				T result = caseStoryPatternApplication(storyPatternApplication);
				if (result == null) result = caseStoryPatternExecution(storyPatternApplication);
				if (result == null) result = caseExecution(storyPatternApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_EXECUTION: {
				StoryPatternObjectExecution<?> storyPatternObjectExecution = (StoryPatternObjectExecution<?>)theEObject;
				T result = caseStoryPatternObjectExecution(storyPatternObjectExecution);
				if (result == null) result = caseExecution(storyPatternObjectExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_BOUND: {
				StoryPatternObjectBound<?> storyPatternObjectBound = (StoryPatternObjectBound<?>)theEObject;
				T result = caseStoryPatternObjectBound(storyPatternObjectBound);
				if (result == null) result = caseStoryPatternObjectExecution(storyPatternObjectBound);
				if (result == null) result = caseExecution(storyPatternObjectBound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_NOT_BOUND: {
				StoryPatternObjectNotBound<?> storyPatternObjectNotBound = (StoryPatternObjectNotBound<?>)theEObject;
				T result = caseStoryPatternObjectNotBound(storyPatternObjectNotBound);
				if (result == null) result = caseStoryPatternObjectExecution(storyPatternObjectNotBound);
				if (result == null) result = caseExecution(storyPatternObjectNotBound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_BINDING_REVOKED: {
				StoryPatternObjectBindingRevoked<?> storyPatternObjectBindingRevoked = (StoryPatternObjectBindingRevoked<?>)theEObject;
				T result = caseStoryPatternObjectBindingRevoked(storyPatternObjectBindingRevoked);
				if (result == null) result = caseStoryPatternObjectExecution(storyPatternObjectBindingRevoked);
				if (result == null) result = caseExecution(storyPatternObjectBindingRevoked);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.STORY_PATTERN_LINK_EXECUTION: {
				StoryPatternLinkExecution<?, ?> storyPatternLinkExecution = (StoryPatternLinkExecution<?, ?>)theEObject;
				T result = caseStoryPatternLinkExecution(storyPatternLinkExecution);
				if (result == null) result = caseExecution(storyPatternLinkExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.TRAVERSING_LINK: {
				TraversingLink<?, ?> traversingLink = (TraversingLink<?, ?>)theEObject;
				T result = caseTraversingLink(traversingLink);
				if (result == null) result = caseStoryPatternLinkExecution(traversingLink);
				if (result == null) result = caseExecution(traversingLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.LINK_CHECK: {
				LinkCheck<?, ?> linkCheck = (LinkCheck<?, ?>)theEObject;
				T result = caseLinkCheck(linkCheck);
				if (result == null) result = caseStoryPatternLinkExecution(linkCheck);
				if (result == null) result = caseExecution(linkCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.LINK_CHECK_SUCCESSFUL: {
				LinkCheckSuccessful<?, ?> linkCheckSuccessful = (LinkCheckSuccessful<?, ?>)theEObject;
				T result = caseLinkCheckSuccessful(linkCheckSuccessful);
				if (result == null) result = caseLinkCheck(linkCheckSuccessful);
				if (result == null) result = caseStoryPatternLinkExecution(linkCheckSuccessful);
				if (result == null) result = caseExecution(linkCheckSuccessful);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.LINK_CHECK_FAILED: {
				LinkCheckFailed<?, ?> linkCheckFailed = (LinkCheckFailed<?, ?>)theEObject;
				T result = caseLinkCheckFailed(linkCheckFailed);
				if (result == null) result = caseLinkCheck(linkCheckFailed);
				if (result == null) result = caseStoryPatternLinkExecution(linkCheckFailed);
				if (result == null) result = caseExecution(linkCheckFailed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.EXPRESSION_EVALUATION: {
				ExpressionEvaluation<?> expressionEvaluation = (ExpressionEvaluation<?>)theEObject;
				T result = caseExpressionEvaluation(expressionEvaluation);
				if (result == null) result = caseExecution(expressionEvaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.INSTANCE_OBJECT_MODIFICATION: {
				InstanceObjectModification<?> instanceObjectModification = (InstanceObjectModification<?>)theEObject;
				T result = caseInstanceObjectModification(instanceObjectModification);
				if (result == null) result = caseExecution(instanceObjectModification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.INSTANCE_OBJECT_CREATION: {
				InstanceObjectCreation<?> instanceObjectCreation = (InstanceObjectCreation<?>)theEObject;
				T result = caseInstanceObjectCreation(instanceObjectCreation);
				if (result == null) result = caseInstanceObjectModification(instanceObjectCreation);
				if (result == null) result = caseExecution(instanceObjectCreation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.INSTANCE_OBJECT_DELETION: {
				InstanceObjectDeletion<?> instanceObjectDeletion = (InstanceObjectDeletion<?>)theEObject;
				T result = caseInstanceObjectDeletion(instanceObjectDeletion);
				if (result == null) result = caseInstanceObjectModification(instanceObjectDeletion);
				if (result == null) result = caseExecution(instanceObjectDeletion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.INSTANCE_LINK_MODIFICATION: {
				InstanceLinkModification<?, ?> instanceLinkModification = (InstanceLinkModification<?, ?>)theEObject;
				T result = caseInstanceLinkModification(instanceLinkModification);
				if (result == null) result = caseExecution(instanceLinkModification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.INSTANCE_LINK_CREATION: {
				InstanceLinkCreation<?, ?> instanceLinkCreation = (InstanceLinkCreation<?, ?>)theEObject;
				T result = caseInstanceLinkCreation(instanceLinkCreation);
				if (result == null) result = caseInstanceLinkModification(instanceLinkCreation);
				if (result == null) result = caseExecution(instanceLinkCreation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.INSTANCE_LINK_DELETION: {
				InstanceLinkDeletion<?, ?> instanceLinkDeletion = (InstanceLinkDeletion<?, ?>)theEObject;
				T result = caseInstanceLinkDeletion(instanceLinkDeletion);
				if (result == null) result = caseInstanceLinkModification(instanceLinkDeletion);
				if (result == null) result = caseExecution(instanceLinkDeletion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.ATTRIBUTE_VALUE_SET: {
				AttributeValueSet<?, ?> attributeValueSet = (AttributeValueSet<?, ?>)theEObject;
				T result = caseAttributeValueSet(attributeValueSet);
				if (result == null) result = caseExecution(attributeValueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.VARIABLE_MODIFICATION: {
				VariableModification<?> variableModification = (VariableModification<?>)theEObject;
				T result = caseVariableModification(variableModification);
				if (result == null) result = caseExecution(variableModification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.VARIABLE_CREATED: {
				VariableCreated<?> variableCreated = (VariableCreated<?>)theEObject;
				T result = caseVariableCreated(variableCreated);
				if (result == null) result = caseVariableModification(variableCreated);
				if (result == null) result = caseExecution(variableCreated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.VARIABLE_DELETED: {
				VariableDeleted<?> variableDeleted = (VariableDeleted<?>)theEObject;
				T result = caseVariableDeleted(variableDeleted);
				if (result == null) result = caseVariableModification(variableDeleted);
				if (result == null) result = caseExecution(variableDeleted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.VARIABLE_CHANGED: {
				VariableChanged<?> variableChanged = (VariableChanged<?>)theEObject;
				T result = caseVariableChanged(variableChanged);
				if (result == null) result = caseVariableModification(variableChanged);
				if (result == null) result = caseExecution(variableChanged);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_EVALUATION: {
				StoryPatternObjectConstraintEvaluation<?, ?> storyPatternObjectConstraintEvaluation = (StoryPatternObjectConstraintEvaluation<?, ?>)theEObject;
				T result = caseStoryPatternObjectConstraintEvaluation(storyPatternObjectConstraintEvaluation);
				if (result == null) result = caseStoryPatternObjectExecution(storyPatternObjectConstraintEvaluation);
				if (result == null) result = caseExecution(storyPatternObjectConstraintEvaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_HOLDS: {
				StoryPatternObjectConstraintHolds<?, ?> storyPatternObjectConstraintHolds = (StoryPatternObjectConstraintHolds<?, ?>)theEObject;
				T result = caseStoryPatternObjectConstraintHolds(storyPatternObjectConstraintHolds);
				if (result == null) result = caseStoryPatternObjectConstraintEvaluation(storyPatternObjectConstraintHolds);
				if (result == null) result = caseStoryPatternObjectExecution(storyPatternObjectConstraintHolds);
				if (result == null) result = caseExecution(storyPatternObjectConstraintHolds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.STORY_PATTERN_OBJECT_CONSTRAINT_VIOLATED: {
				StoryPatternObjectConstraintViolated<?, ?> storyPatternObjectConstraintViolated = (StoryPatternObjectConstraintViolated<?, ?>)theEObject;
				T result = caseStoryPatternObjectConstraintViolated(storyPatternObjectConstraintViolated);
				if (result == null) result = caseStoryPatternObjectConstraintEvaluation(storyPatternObjectConstraintViolated);
				if (result == null) result = caseStoryPatternObjectExecution(storyPatternObjectConstraintViolated);
				if (result == null) result = caseExecution(storyPatternObjectConstraintViolated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.STORY_PATTERN_CONSTRAINT_EVALUATION: {
				StoryPatternConstraintEvaluation<?, ?> storyPatternConstraintEvaluation = (StoryPatternConstraintEvaluation<?, ?>)theEObject;
				T result = caseStoryPatternConstraintEvaluation(storyPatternConstraintEvaluation);
				if (result == null) result = caseStoryPatternExecution(storyPatternConstraintEvaluation);
				if (result == null) result = caseExecution(storyPatternConstraintEvaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.STORY_PATTERN_CONSTRAINT_HOLDS: {
				StoryPatternConstraintHolds<?, ?> storyPatternConstraintHolds = (StoryPatternConstraintHolds<?, ?>)theEObject;
				T result = caseStoryPatternConstraintHolds(storyPatternConstraintHolds);
				if (result == null) result = caseStoryPatternConstraintEvaluation(storyPatternConstraintHolds);
				if (result == null) result = caseStoryPatternExecution(storyPatternConstraintHolds);
				if (result == null) result = caseExecution(storyPatternConstraintHolds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutiontracePackage.STORY_PATTERN_CONSTRAINT_VIOLATED: {
				StoryPatternConstraintViolated<?, ?> storyPatternConstraintViolated = (StoryPatternConstraintViolated<?, ?>)theEObject;
				T result = caseStoryPatternConstraintViolated(storyPatternConstraintViolated);
				if (result == null) result = caseStoryPatternConstraintEvaluation(storyPatternConstraintViolated);
				if (result == null) result = caseStoryPatternExecution(storyPatternConstraintViolated);
				if (result == null) result = caseExecution(storyPatternConstraintViolated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <KeyType, ValueType> T caseMapEntry(Map.Entry<KeyType, ValueType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionTrace(ExecutionTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecution(Execution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ActivityType> T caseActivityExecution(ActivityExecution<ActivityType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ActivityNodeType> T caseActivityNodeExecution(ActivityNodeExecution<ActivityNodeType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge Traversal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge Traversal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ActivityEdgeType> T caseActivityEdgeTraversal(ActivityEdgeTraversal<ActivityEdgeType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Pattern Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Pattern Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternType> T caseStoryPatternExecution(StoryPatternExecution<StoryPatternType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Pattern Initialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Pattern Initialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternType> T caseStoryPatternInitialization(StoryPatternInitialization<StoryPatternType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Pattern Matching</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Pattern Matching</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternType> T caseStoryPatternMatching(StoryPatternMatching<StoryPatternType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Pattern Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Pattern Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternType> T caseStoryPatternApplication(StoryPatternApplication<StoryPatternType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Pattern Object Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Pattern Object Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType> T caseStoryPatternObjectExecution(StoryPatternObjectExecution<StoryPatternObjectType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Pattern Object Bound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Pattern Object Bound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType> T caseStoryPatternObjectBound(StoryPatternObjectBound<StoryPatternObjectType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Pattern Object Not Bound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Pattern Object Not Bound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType> T caseStoryPatternObjectNotBound(StoryPatternObjectNotBound<StoryPatternObjectType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Pattern Object Binding Revoked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Pattern Object Binding Revoked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType> T caseStoryPatternObjectBindingRevoked(StoryPatternObjectBindingRevoked<StoryPatternObjectType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Pattern Link Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Pattern Link Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> T caseStoryPatternLinkExecution(StoryPatternLinkExecution<StoryPatternLinkType, StoryPatternObjectType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traversing Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traversing Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> T caseTraversingLink(TraversingLink<StoryPatternLinkType, StoryPatternObjectType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> T caseLinkCheck(LinkCheck<StoryPatternLinkType, StoryPatternObjectType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Check Successful</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Check Successful</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> T caseLinkCheckSuccessful(LinkCheckSuccessful<StoryPatternLinkType, StoryPatternObjectType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Check Failed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Check Failed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> T caseLinkCheckFailed(LinkCheckFailed<StoryPatternLinkType, StoryPatternObjectType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ExpressionType> T caseExpressionEvaluation(ExpressionEvaluation<ExpressionType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Object Modification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Object Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType> T caseInstanceObjectModification(InstanceObjectModification<StoryPatternObjectType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Object Creation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Object Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType> T caseInstanceObjectCreation(InstanceObjectCreation<StoryPatternObjectType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Object Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Object Deletion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType> T caseInstanceObjectDeletion(InstanceObjectDeletion<StoryPatternObjectType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Link Modification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Link Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> T caseInstanceLinkModification(InstanceLinkModification<StoryPatternLinkType, StoryPatternObjectType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Link Creation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Link Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> T caseInstanceLinkCreation(InstanceLinkCreation<StoryPatternLinkType, StoryPatternObjectType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Link Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Link Deletion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternLinkType, StoryPatternObjectType> T caseInstanceLinkDeletion(InstanceLinkDeletion<StoryPatternLinkType, StoryPatternObjectType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType, FeatureType> T caseAttributeValueSet(AttributeValueSet<StoryPatternObjectType, FeatureType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Modification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ClassifierType> T caseVariableModification(VariableModification<ClassifierType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Created</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Created</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ClassifierType> T caseVariableCreated(VariableCreated<ClassifierType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Deleted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Deleted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ClassifierType> T caseVariableDeleted(VariableDeleted<ClassifierType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Changed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Changed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ClassifierType> T caseVariableChanged(VariableChanged<ClassifierType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Pattern Object Constraint Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Pattern Object Constraint Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType, ExpressionType> T caseStoryPatternObjectConstraintEvaluation(StoryPatternObjectConstraintEvaluation<StoryPatternObjectType, ExpressionType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Pattern Object Constraint Holds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Pattern Object Constraint Holds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType, ExpressionType> T caseStoryPatternObjectConstraintHolds(StoryPatternObjectConstraintHolds<StoryPatternObjectType, ExpressionType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Pattern Object Constraint Violated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Pattern Object Constraint Violated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternObjectType, ExpressionType> T caseStoryPatternObjectConstraintViolated(StoryPatternObjectConstraintViolated<StoryPatternObjectType, ExpressionType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Pattern Constraint Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Pattern Constraint Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternType, ExpressionType> T caseStoryPatternConstraintEvaluation(StoryPatternConstraintEvaluation<StoryPatternType, ExpressionType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Pattern Constraint Holds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Pattern Constraint Holds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternType, ExpressionType> T caseStoryPatternConstraintHolds(StoryPatternConstraintHolds<StoryPatternType, ExpressionType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Story Pattern Constraint Violated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Story Pattern Constraint Violated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StoryPatternType, ExpressionType> T caseStoryPatternConstraintViolated(StoryPatternConstraintViolated<StoryPatternType, ExpressionType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExecutiontraceSwitch
