/**
 */
package org.muml.cbs.dependencylanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage
 * @generated
 */
public interface DependencylanguageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DependencylanguageFactory eINSTANCE = org.muml.cbs.dependencylanguage.impl.DependencylanguageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Synthesizable Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synthesizable Behavior</em>'.
	 * @generated
	 */
	SynthesizableBehavior createSynthesizableBehavior();

	/**
	 * Returns a new object of class '<em>Dependency Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency Model</em>'.
	 * @generated
	 */
	DependencyModel createDependencyModel();

	/**
	 * Returns a new object of class '<em>Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronization</em>'.
	 * @generated
	 */
	Synchronization createSynchronization();

	/**
	 * Returns a new object of class '<em>Forbidden State Combination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forbidden State Combination</em>'.
	 * @generated
	 */
	ForbiddenStateCombination createForbiddenStateCombination();

	/**
	 * Returns a new object of class '<em>Clock Merge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Merge</em>'.
	 * @generated
	 */
	ClockMerge createClockMerge();

	/**
	 * Returns a new object of class '<em>Data Merge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Merge</em>'.
	 * @generated
	 */
	DataMerge createDataMerge();

	/**
	 * Returns a new object of class '<em>Conditional Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Dependency</em>'.
	 * @generated
	 */
	ConditionalDependency createConditionalDependency();

	/**
	 * Returns a new object of class '<em>Enable Disable Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enable Disable Effect</em>'.
	 * @generated
	 */
	EnableDisableEffect createEnableDisableEffect();

	/**
	 * Returns a new object of class '<em>Clock Reset Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Reset Effect</em>'.
	 * @generated
	 */
	ClockResetEffect createClockResetEffect();

	/**
	 * Returns a new object of class '<em>Data Assignment Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Assignment Effect</em>'.
	 * @generated
	 */
	DataAssignmentEffect createDataAssignmentEffect();

	/**
	 * Returns a new object of class '<em>Bounded Active State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bounded Active State</em>'.
	 * @generated
	 */
	BoundedActiveState createBoundedActiveState();

	/**
	 * Returns a new object of class '<em>State Status Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Status Condition</em>'.
	 * @generated
	 */
	StateStatusCondition createStateStatusCondition();

	/**
	 * Returns a new object of class '<em>Event Constrained Interval Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Constrained Interval Condition</em>'.
	 * @generated
	 */
	EventConstrainedIntervalCondition createEventConstrainedIntervalCondition();

	/**
	 * Returns a new object of class '<em>Clock Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Condition</em>'.
	 * @generated
	 */
	ClockCondition createClockCondition();

	/**
	 * Returns a new object of class '<em>Auxiliary Clock Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auxiliary Clock Condition</em>'.
	 * @generated
	 */
	AuxiliaryClockCondition createAuxiliaryClockCondition();

	/**
	 * Returns a new object of class '<em>Hybrid Clock Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hybrid Clock Condition</em>'.
	 * @generated
	 */
	HybridClockCondition createHybridClockCondition();

	/**
	 * Returns a new object of class '<em>Basic Clock Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Clock Condition</em>'.
	 * @generated
	 */
	BasicClockCondition createBasicClockCondition();

	/**
	 * Returns a new object of class '<em>Data Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Condition</em>'.
	 * @generated
	 */
	DataCondition createDataCondition();

	/**
	 * Returns a new object of class '<em>Composition Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Condition</em>'.
	 * @generated
	 */
	CompositionCondition createCompositionCondition();

	/**
	 * Returns a new object of class '<em>Composition Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Event</em>'.
	 * @generated
	 */
	CompositionEvent createCompositionEvent();

	/**
	 * Returns a new object of class '<em>Counted Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Counted Event</em>'.
	 * @generated
	 */
	CountedEvent createCountedEvent();

	/**
	 * Returns a new object of class '<em>Delayed Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delayed Event</em>'.
	 * @generated
	 */
	DelayedEvent createDelayedEvent();

	/**
	 * Returns a new object of class '<em>Synchronization Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronization Event</em>'.
	 * @generated
	 */
	SynchronizationEvent createSynchronizationEvent();

	/**
	 * Returns a new object of class '<em>Transition Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Event</em>'.
	 * @generated
	 */
	TransitionEvent createTransitionEvent();

	/**
	 * Returns a new object of class '<em>State Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Event</em>'.
	 * @generated
	 */
	StateEvent createStateEvent();

	/**
	 * Returns a new object of class '<em>State Combination Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Combination Event</em>'.
	 * @generated
	 */
	StateCombinationEvent createStateCombinationEvent();

	/**
	 * Returns a new object of class '<em>Message Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Event</em>'.
	 * @generated
	 */
	MessageEvent createMessageEvent();

	/**
	 * Returns a new object of class '<em>Trigger Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Message</em>'.
	 * @generated
	 */
	TriggerMessage createTriggerMessage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DependencylanguagePackage getDependencylanguagePackage();

} //DependencylanguageFactory
