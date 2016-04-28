/**
 */
package org.muml.cbs.dependencylanguage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.muml.cbs.dependencylanguage.*;
import org.muml.mumlcore.CommentableElement;
import org.muml.mumlcore.ExtendableElement;
import org.muml.mumlcore.Extension;
import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.actionlanguage.Assignment;
import org.muml.pim.behavior.BehavioralElement;
import org.muml.pim.realtimestatechart.ClockConstraint;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage
 * @generated
 */
public class DependencylanguageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DependencylanguagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencylanguageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DependencylanguagePackage.eINSTANCE;
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
	protected DependencylanguageSwitch<Adapter> modelSwitch =
		new DependencylanguageSwitch<Adapter>() {
			@Override
			public Adapter caseSynthesizableBehavior(SynthesizableBehavior object) {
				return createSynthesizableBehaviorAdapter();
			}
			@Override
			public Adapter caseDependencyModel(DependencyModel object) {
				return createDependencyModelAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseSynchronization(Synchronization object) {
				return createSynchronizationAdapter();
			}
			@Override
			public Adapter caseForbiddenStateCombination(ForbiddenStateCombination object) {
				return createForbiddenStateCombinationAdapter();
			}
			@Override
			public Adapter caseClockMerge(ClockMerge object) {
				return createClockMergeAdapter();
			}
			@Override
			public Adapter caseDataMerge(DataMerge object) {
				return createDataMergeAdapter();
			}
			@Override
			public Adapter caseConditionalDependency(ConditionalDependency object) {
				return createConditionalDependencyAdapter();
			}
			@Override
			public Adapter caseEffect(Effect object) {
				return createEffectAdapter();
			}
			@Override
			public Adapter caseEnableDisableEffect(EnableDisableEffect object) {
				return createEnableDisableEffectAdapter();
			}
			@Override
			public Adapter caseClockResetEffect(ClockResetEffect object) {
				return createClockResetEffectAdapter();
			}
			@Override
			public Adapter caseDataAssignmentEffect(DataAssignmentEffect object) {
				return createDataAssignmentEffectAdapter();
			}
			@Override
			public Adapter caseBoundedActiveState(BoundedActiveState object) {
				return createBoundedActiveStateAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseStateStatusCondition(StateStatusCondition object) {
				return createStateStatusConditionAdapter();
			}
			@Override
			public Adapter caseEventConstrainedIntervalCondition(EventConstrainedIntervalCondition object) {
				return createEventConstrainedIntervalConditionAdapter();
			}
			@Override
			public Adapter caseClockCondition(ClockCondition object) {
				return createClockConditionAdapter();
			}
			@Override
			public Adapter caseAuxiliaryClockCondition(AuxiliaryClockCondition object) {
				return createAuxiliaryClockConditionAdapter();
			}
			@Override
			public Adapter caseHybridClockCondition(HybridClockCondition object) {
				return createHybridClockConditionAdapter();
			}
			@Override
			public Adapter caseBasicClockCondition(BasicClockCondition object) {
				return createBasicClockConditionAdapter();
			}
			@Override
			public Adapter caseDataCondition(DataCondition object) {
				return createDataConditionAdapter();
			}
			@Override
			public Adapter caseCompositionCondition(CompositionCondition object) {
				return createCompositionConditionAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseSimpleEvent(SimpleEvent object) {
				return createSimpleEventAdapter();
			}
			@Override
			public Adapter caseCompositionEvent(CompositionEvent object) {
				return createCompositionEventAdapter();
			}
			@Override
			public Adapter caseCountedEvent(CountedEvent object) {
				return createCountedEventAdapter();
			}
			@Override
			public Adapter caseDelayedEvent(DelayedEvent object) {
				return createDelayedEventAdapter();
			}
			@Override
			public Adapter caseSynchronizationEvent(SynchronizationEvent object) {
				return createSynchronizationEventAdapter();
			}
			@Override
			public Adapter caseTransitionEvent(TransitionEvent object) {
				return createTransitionEventAdapter();
			}
			@Override
			public Adapter caseStateEvent(StateEvent object) {
				return createStateEventAdapter();
			}
			@Override
			public Adapter caseStateCombinationEvent(StateCombinationEvent object) {
				return createStateCombinationEventAdapter();
			}
			@Override
			public Adapter caseMessageEvent(MessageEvent object) {
				return createMessageEventAdapter();
			}
			@Override
			public Adapter caseTriggerMessage(TriggerMessage object) {
				return createTriggerMessageAdapter();
			}
			@Override
			public Adapter caseExtendableElement(ExtendableElement object) {
				return createExtendableElementAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseBehavioralElement(BehavioralElement object) {
				return createBehavioralElementAdapter();
			}
			@Override
			public Adapter caseCommentableElement(CommentableElement object) {
				return createCommentableElementAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			@Override
			public Adapter caseClockConstraint(ClockConstraint object) {
				return createClockConstraintAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.SynthesizableBehavior <em>Synthesizable Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.SynthesizableBehavior
	 * @generated
	 */
	public Adapter createSynthesizableBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.DependencyModel <em>Dependency Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.DependencyModel
	 * @generated
	 */
	public Adapter createDependencyModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.Synchronization
	 * @generated
	 */
	public Adapter createSynchronizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.ForbiddenStateCombination <em>Forbidden State Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.ForbiddenStateCombination
	 * @generated
	 */
	public Adapter createForbiddenStateCombinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.ClockMerge <em>Clock Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.ClockMerge
	 * @generated
	 */
	public Adapter createClockMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.DataMerge <em>Data Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.DataMerge
	 * @generated
	 */
	public Adapter createDataMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.ConditionalDependency <em>Conditional Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.ConditionalDependency
	 * @generated
	 */
	public Adapter createConditionalDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.Effect
	 * @generated
	 */
	public Adapter createEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.EnableDisableEffect <em>Enable Disable Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.EnableDisableEffect
	 * @generated
	 */
	public Adapter createEnableDisableEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.ClockResetEffect <em>Clock Reset Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.ClockResetEffect
	 * @generated
	 */
	public Adapter createClockResetEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.DataAssignmentEffect <em>Data Assignment Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.DataAssignmentEffect
	 * @generated
	 */
	public Adapter createDataAssignmentEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.BoundedActiveState <em>Bounded Active State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.BoundedActiveState
	 * @generated
	 */
	public Adapter createBoundedActiveStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.StateStatusCondition <em>State Status Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.StateStatusCondition
	 * @generated
	 */
	public Adapter createStateStatusConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition <em>Event Constrained Interval Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition
	 * @generated
	 */
	public Adapter createEventConstrainedIntervalConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.ClockCondition <em>Clock Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.ClockCondition
	 * @generated
	 */
	public Adapter createClockConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.AuxiliaryClockCondition <em>Auxiliary Clock Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.AuxiliaryClockCondition
	 * @generated
	 */
	public Adapter createAuxiliaryClockConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.HybridClockCondition <em>Hybrid Clock Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.HybridClockCondition
	 * @generated
	 */
	public Adapter createHybridClockConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.BasicClockCondition <em>Basic Clock Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.BasicClockCondition
	 * @generated
	 */
	public Adapter createBasicClockConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.DataCondition <em>Data Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.DataCondition
	 * @generated
	 */
	public Adapter createDataConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.CompositionCondition <em>Composition Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.CompositionCondition
	 * @generated
	 */
	public Adapter createCompositionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.SimpleEvent <em>Simple Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.SimpleEvent
	 * @generated
	 */
	public Adapter createSimpleEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.CompositionEvent <em>Composition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.CompositionEvent
	 * @generated
	 */
	public Adapter createCompositionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.CountedEvent <em>Counted Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.CountedEvent
	 * @generated
	 */
	public Adapter createCountedEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.DelayedEvent <em>Delayed Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.DelayedEvent
	 * @generated
	 */
	public Adapter createDelayedEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.SynchronizationEvent <em>Synchronization Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.SynchronizationEvent
	 * @generated
	 */
	public Adapter createSynchronizationEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.TransitionEvent <em>Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.TransitionEvent
	 * @generated
	 */
	public Adapter createTransitionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.StateEvent <em>State Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.StateEvent
	 * @generated
	 */
	public Adapter createStateEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.StateCombinationEvent <em>State Combination Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.StateCombinationEvent
	 * @generated
	 */
	public Adapter createStateCombinationEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.MessageEvent <em>Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.MessageEvent
	 * @generated
	 */
	public Adapter createMessageEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.cbs.dependencylanguage.TriggerMessage <em>Trigger Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.cbs.dependencylanguage.TriggerMessage
	 * @generated
	 */
	public Adapter createTriggerMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.mumlcore.ExtendableElement <em>Extendable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.mumlcore.ExtendableElement
	 * @generated
	 */
	public Adapter createExtendableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.mumlcore.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.mumlcore.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.behavior.BehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.behavior.BehavioralElement
	 * @generated
	 */
	public Adapter createBehavioralElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.mumlcore.CommentableElement <em>Commentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.mumlcore.CommentableElement
	 * @generated
	 */
	public Adapter createCommentableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.mumlcore.expressions.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.mumlcore.expressions.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.actionlanguage.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.actionlanguage.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.realtimestatechart.ClockConstraint <em>Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.realtimestatechart.ClockConstraint
	 * @generated
	 */
	public Adapter createClockConstraintAdapter() {
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

} //DependencylanguageAdapterFactory
