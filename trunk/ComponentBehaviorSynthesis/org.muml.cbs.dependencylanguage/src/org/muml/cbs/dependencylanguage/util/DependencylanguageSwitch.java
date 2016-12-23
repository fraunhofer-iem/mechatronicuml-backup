/**
 */
package org.muml.cbs.dependencylanguage.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.cbs.dependencylanguage.*;
import org.muml.core.CommentableElement;
import org.muml.core.ExtendableElement;
import org.muml.core.Extension;
import org.muml.core.expressions.Expression;
import org.muml.pim.actionlanguage.Assignment;
import org.muml.pim.behavior.BehavioralElement;
import org.muml.pim.realtimestatechart.ClockConstraint;

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
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage
 * @generated
 */
public class DependencylanguageSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DependencylanguagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencylanguageSwitch() {
		if (modelPackage == null) {
			modelPackage = DependencylanguagePackage.eINSTANCE;
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
			case DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR: {
				SynthesizableBehavior synthesizableBehavior = (SynthesizableBehavior)theEObject;
				T result = caseSynthesizableBehavior(synthesizableBehavior);
				if (result == null) result = caseExtension(synthesizableBehavior);
				if (result == null) result = caseBehavioralElement(synthesizableBehavior);
				if (result == null) result = caseExtendableElement(synthesizableBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.DEPENDENCY_MODEL: {
				DependencyModel dependencyModel = (DependencyModel)theEObject;
				T result = caseDependencyModel(dependencyModel);
				if (result == null) result = caseCommentableElement(dependencyModel);
				if (result == null) result = caseExtendableElement(dependencyModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = caseCommentableElement(dependency);
				if (result == null) result = caseExtendableElement(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.SYNCHRONIZATION: {
				Synchronization synchronization = (Synchronization)theEObject;
				T result = caseSynchronization(synchronization);
				if (result == null) result = caseDependency(synchronization);
				if (result == null) result = caseCommentableElement(synchronization);
				if (result == null) result = caseExtendableElement(synchronization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.FORBIDDEN_STATE_COMBINATION: {
				ForbiddenStateCombination forbiddenStateCombination = (ForbiddenStateCombination)theEObject;
				T result = caseForbiddenStateCombination(forbiddenStateCombination);
				if (result == null) result = caseDependency(forbiddenStateCombination);
				if (result == null) result = caseCommentableElement(forbiddenStateCombination);
				if (result == null) result = caseExtendableElement(forbiddenStateCombination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.CLOCK_MERGE: {
				ClockMerge clockMerge = (ClockMerge)theEObject;
				T result = caseClockMerge(clockMerge);
				if (result == null) result = caseDependency(clockMerge);
				if (result == null) result = caseCommentableElement(clockMerge);
				if (result == null) result = caseExtendableElement(clockMerge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.DATA_MERGE: {
				DataMerge dataMerge = (DataMerge)theEObject;
				T result = caseDataMerge(dataMerge);
				if (result == null) result = caseDependency(dataMerge);
				if (result == null) result = caseCommentableElement(dataMerge);
				if (result == null) result = caseExtendableElement(dataMerge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.CONDITIONAL_DEPENDENCY: {
				ConditionalDependency conditionalDependency = (ConditionalDependency)theEObject;
				T result = caseConditionalDependency(conditionalDependency);
				if (result == null) result = caseDependency(conditionalDependency);
				if (result == null) result = caseCommentableElement(conditionalDependency);
				if (result == null) result = caseExtendableElement(conditionalDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.EFFECT: {
				Effect effect = (Effect)theEObject;
				T result = caseEffect(effect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.ENABLE_DISABLE_EFFECT: {
				EnableDisableEffect enableDisableEffect = (EnableDisableEffect)theEObject;
				T result = caseEnableDisableEffect(enableDisableEffect);
				if (result == null) result = caseEffect(enableDisableEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.CLOCK_RESET_EFFECT: {
				ClockResetEffect clockResetEffect = (ClockResetEffect)theEObject;
				T result = caseClockResetEffect(clockResetEffect);
				if (result == null) result = caseEffect(clockResetEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT: {
				DataAssignmentEffect dataAssignmentEffect = (DataAssignmentEffect)theEObject;
				T result = caseDataAssignmentEffect(dataAssignmentEffect);
				if (result == null) result = caseEffect(dataAssignmentEffect);
				if (result == null) result = caseAssignment(dataAssignmentEffect);
				if (result == null) result = caseExpression(dataAssignmentEffect);
				if (result == null) result = caseCommentableElement(dataAssignmentEffect);
				if (result == null) result = caseExtendableElement(dataAssignmentEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.BOUNDED_ACTIVE_STATE: {
				BoundedActiveState boundedActiveState = (BoundedActiveState)theEObject;
				T result = caseBoundedActiveState(boundedActiveState);
				if (result == null) result = caseDependency(boundedActiveState);
				if (result == null) result = caseCommentableElement(boundedActiveState);
				if (result == null) result = caseExtendableElement(boundedActiveState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.STATE_STATUS_CONDITION: {
				StateStatusCondition stateStatusCondition = (StateStatusCondition)theEObject;
				T result = caseStateStatusCondition(stateStatusCondition);
				if (result == null) result = caseCondition(stateStatusCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION: {
				EventConstrainedIntervalCondition eventConstrainedIntervalCondition = (EventConstrainedIntervalCondition)theEObject;
				T result = caseEventConstrainedIntervalCondition(eventConstrainedIntervalCondition);
				if (result == null) result = caseCondition(eventConstrainedIntervalCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.CLOCK_CONDITION: {
				ClockCondition clockCondition = (ClockCondition)theEObject;
				T result = caseClockCondition(clockCondition);
				if (result == null) result = caseCondition(clockCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.AUXILIARY_CLOCK_CONDITION: {
				AuxiliaryClockCondition auxiliaryClockCondition = (AuxiliaryClockCondition)theEObject;
				T result = caseAuxiliaryClockCondition(auxiliaryClockCondition);
				if (result == null) result = caseClockCondition(auxiliaryClockCondition);
				if (result == null) result = caseCondition(auxiliaryClockCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.HYBRID_CLOCK_CONDITION: {
				HybridClockCondition hybridClockCondition = (HybridClockCondition)theEObject;
				T result = caseHybridClockCondition(hybridClockCondition);
				if (result == null) result = caseClockCondition(hybridClockCondition);
				if (result == null) result = caseCondition(hybridClockCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.BASIC_CLOCK_CONDITION: {
				BasicClockCondition basicClockCondition = (BasicClockCondition)theEObject;
				T result = caseBasicClockCondition(basicClockCondition);
				if (result == null) result = caseClockConstraint(basicClockCondition);
				if (result == null) result = caseClockCondition(basicClockCondition);
				if (result == null) result = caseExtendableElement(basicClockCondition);
				if (result == null) result = caseCondition(basicClockCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.DATA_CONDITION: {
				DataCondition dataCondition = (DataCondition)theEObject;
				T result = caseDataCondition(dataCondition);
				if (result == null) result = caseCondition(dataCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.COMPOSITION_CONDITION: {
				CompositionCondition compositionCondition = (CompositionCondition)theEObject;
				T result = caseCompositionCondition(compositionCondition);
				if (result == null) result = caseCondition(compositionCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.SIMPLE_EVENT: {
				SimpleEvent simpleEvent = (SimpleEvent)theEObject;
				T result = caseSimpleEvent(simpleEvent);
				if (result == null) result = caseEvent(simpleEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.COMPOSITION_EVENT: {
				CompositionEvent compositionEvent = (CompositionEvent)theEObject;
				T result = caseCompositionEvent(compositionEvent);
				if (result == null) result = caseEvent(compositionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.COUNTED_EVENT: {
				CountedEvent countedEvent = (CountedEvent)theEObject;
				T result = caseCountedEvent(countedEvent);
				if (result == null) result = caseEvent(countedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.DELAYED_EVENT: {
				DelayedEvent delayedEvent = (DelayedEvent)theEObject;
				T result = caseDelayedEvent(delayedEvent);
				if (result == null) result = caseEvent(delayedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.SYNCHRONIZATION_EVENT: {
				SynchronizationEvent synchronizationEvent = (SynchronizationEvent)theEObject;
				T result = caseSynchronizationEvent(synchronizationEvent);
				if (result == null) result = caseEvent(synchronizationEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.TRANSITION_EVENT: {
				TransitionEvent transitionEvent = (TransitionEvent)theEObject;
				T result = caseTransitionEvent(transitionEvent);
				if (result == null) result = caseSimpleEvent(transitionEvent);
				if (result == null) result = caseEvent(transitionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.STATE_EVENT: {
				StateEvent stateEvent = (StateEvent)theEObject;
				T result = caseStateEvent(stateEvent);
				if (result == null) result = caseSimpleEvent(stateEvent);
				if (result == null) result = caseEvent(stateEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.STATE_COMBINATION_EVENT: {
				StateCombinationEvent stateCombinationEvent = (StateCombinationEvent)theEObject;
				T result = caseStateCombinationEvent(stateCombinationEvent);
				if (result == null) result = caseSimpleEvent(stateCombinationEvent);
				if (result == null) result = caseEvent(stateCombinationEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.MESSAGE_EVENT: {
				MessageEvent messageEvent = (MessageEvent)theEObject;
				T result = caseMessageEvent(messageEvent);
				if (result == null) result = caseSimpleEvent(messageEvent);
				if (result == null) result = caseEvent(messageEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DependencylanguagePackage.TRIGGER_MESSAGE: {
				TriggerMessage triggerMessage = (TriggerMessage)theEObject;
				T result = caseTriggerMessage(triggerMessage);
				if (result == null) result = caseDependency(triggerMessage);
				if (result == null) result = caseCommentableElement(triggerMessage);
				if (result == null) result = caseExtendableElement(triggerMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synthesizable Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synthesizable Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynthesizableBehavior(SynthesizableBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyModel(DependencyModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronization(Synchronization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forbidden State Combination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forbidden State Combination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForbiddenStateCombination(ForbiddenStateCombination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockMerge(ClockMerge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataMerge(DataMerge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalDependency(ConditionalDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffect(Effect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Disable Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Disable Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableDisableEffect(EnableDisableEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Reset Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Reset Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockResetEffect(ClockResetEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Assignment Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Assignment Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAssignmentEffect(DataAssignmentEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Active State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Active State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedActiveState(BoundedActiveState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Status Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Status Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateStatusCondition(StateStatusCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Constrained Interval Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Constrained Interval Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventConstrainedIntervalCondition(EventConstrainedIntervalCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockCondition(ClockCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auxiliary Clock Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auxiliary Clock Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuxiliaryClockCondition(AuxiliaryClockCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hybrid Clock Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hybrid Clock Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHybridClockCondition(HybridClockCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Clock Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Clock Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicClockCondition(BasicClockCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCondition(DataCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionCondition(CompositionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleEvent(SimpleEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionEvent(CompositionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counted Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counted Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountedEvent(CountedEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delayed Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delayed Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelayedEvent(DelayedEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizationEvent(SynchronizationEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionEvent(TransitionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateEvent(StateEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Combination Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Combination Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateCombinationEvent(StateCombinationEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageEvent(MessageEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerMessage(TriggerMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendableElement(ExtendableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioral Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioral Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioralElement(BehavioralElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentableElement(CommentableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockConstraint(ClockConstraint object) {
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

} //DependencylanguageSwitch
