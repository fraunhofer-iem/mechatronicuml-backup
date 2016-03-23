/**
 */
package org.muml.cbs.dependencylanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.cbs.dependencylanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencylanguageFactoryImpl extends EFactoryImpl implements DependencylanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DependencylanguageFactory init() {
		try {
			DependencylanguageFactory theDependencylanguageFactory = (DependencylanguageFactory)EPackage.Registry.INSTANCE.getEFactory(DependencylanguagePackage.eNS_URI);
			if (theDependencylanguageFactory != null) {
				return theDependencylanguageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DependencylanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencylanguageFactoryImpl() {
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
			case DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR: return createSynthesizableBehavior();
			case DependencylanguagePackage.DEPENDENCY_MODEL: return createDependencyModel();
			case DependencylanguagePackage.SYNCHRONIZATION: return createSynchronization();
			case DependencylanguagePackage.FORBIDDEN_STATE_COMBINATION: return createForbiddenStateCombination();
			case DependencylanguagePackage.CLOCK_MERGE: return createClockMerge();
			case DependencylanguagePackage.DATA_MERGE: return createDataMerge();
			case DependencylanguagePackage.CONDITIONAL_DEPENDENCY: return createConditionalDependency();
			case DependencylanguagePackage.ENABLE_DISABLE_EFFECT: return createEnableDisableEffect();
			case DependencylanguagePackage.CLOCK_RESET_EFFECT: return createClockResetEffect();
			case DependencylanguagePackage.DATA_ASSIGNMENT_EFFECT: return createDataAssignmentEffect();
			case DependencylanguagePackage.BOUNDED_ACTIVE_STATE: return createBoundedActiveState();
			case DependencylanguagePackage.STATE_STATUS_CONDITION: return createStateStatusCondition();
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION: return createEventConstrainedIntervalCondition();
			case DependencylanguagePackage.CLOCK_CONDITION: return createClockCondition();
			case DependencylanguagePackage.AUXILIARY_CLOCK_CONDITION: return createAuxiliaryClockCondition();
			case DependencylanguagePackage.HYBRID_CLOCK_CONDITION: return createHybridClockCondition();
			case DependencylanguagePackage.BASIC_CLOCK_CONDITION: return createBasicClockCondition();
			case DependencylanguagePackage.DATA_CONDITION: return createDataCondition();
			case DependencylanguagePackage.COMPOSITION_CONDITION: return createCompositionCondition();
			case DependencylanguagePackage.COMPOSITION_EVENT: return createCompositionEvent();
			case DependencylanguagePackage.COUNTED_EVENT: return createCountedEvent();
			case DependencylanguagePackage.DELAYED_EVENT: return createDelayedEvent();
			case DependencylanguagePackage.SYNCHRONIZATION_EVENT: return createSynchronizationEvent();
			case DependencylanguagePackage.TRANSITION_EVENT: return createTransitionEvent();
			case DependencylanguagePackage.STATE_EVENT: return createStateEvent();
			case DependencylanguagePackage.STATE_COMBINATION_EVENT: return createStateCombinationEvent();
			case DependencylanguagePackage.MESSAGE_EVENT: return createMessageEvent();
			case DependencylanguagePackage.TRIGGER_MESSAGE: return createTriggerMessage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DependencylanguagePackage.ASSIGNMENT_DIRECTION:
				return createAssignmentDirectionFromString(eDataType, initialValue);
			case DependencylanguagePackage.STATE_STATUS_KIND:
				return createStateStatusKindFromString(eDataType, initialValue);
			case DependencylanguagePackage.STATE_EVENT_KIND:
				return createStateEventKindFromString(eDataType, initialValue);
			case DependencylanguagePackage.MESSAGE_EVENT_KIND:
				return createMessageEventKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DependencylanguagePackage.ASSIGNMENT_DIRECTION:
				return convertAssignmentDirectionToString(eDataType, instanceValue);
			case DependencylanguagePackage.STATE_STATUS_KIND:
				return convertStateStatusKindToString(eDataType, instanceValue);
			case DependencylanguagePackage.STATE_EVENT_KIND:
				return convertStateEventKindToString(eDataType, instanceValue);
			case DependencylanguagePackage.MESSAGE_EVENT_KIND:
				return convertMessageEventKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynthesizableBehavior createSynthesizableBehavior() {
		SynthesizableBehaviorImpl synthesizableBehavior = new SynthesizableBehaviorImpl();
		return synthesizableBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyModel createDependencyModel() {
		DependencyModelImpl dependencyModel = new DependencyModelImpl();
		return dependencyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization createSynchronization() {
		SynchronizationImpl synchronization = new SynchronizationImpl();
		return synchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForbiddenStateCombination createForbiddenStateCombination() {
		ForbiddenStateCombinationImpl forbiddenStateCombination = new ForbiddenStateCombinationImpl();
		return forbiddenStateCombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockMerge createClockMerge() {
		ClockMergeImpl clockMerge = new ClockMergeImpl();
		return clockMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMerge createDataMerge() {
		DataMergeImpl dataMerge = new DataMergeImpl();
		return dataMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDependency createConditionalDependency() {
		ConditionalDependencyImpl conditionalDependency = new ConditionalDependencyImpl();
		return conditionalDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableDisableEffect createEnableDisableEffect() {
		EnableDisableEffectImpl enableDisableEffect = new EnableDisableEffectImpl();
		return enableDisableEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockResetEffect createClockResetEffect() {
		ClockResetEffectImpl clockResetEffect = new ClockResetEffectImpl();
		return clockResetEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAssignmentEffect createDataAssignmentEffect() {
		DataAssignmentEffectImpl dataAssignmentEffect = new DataAssignmentEffectImpl();
		return dataAssignmentEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedActiveState createBoundedActiveState() {
		BoundedActiveStateImpl boundedActiveState = new BoundedActiveStateImpl();
		return boundedActiveState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateStatusCondition createStateStatusCondition() {
		StateStatusConditionImpl stateStatusCondition = new StateStatusConditionImpl();
		return stateStatusCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventConstrainedIntervalCondition createEventConstrainedIntervalCondition() {
		EventConstrainedIntervalConditionImpl eventConstrainedIntervalCondition = new EventConstrainedIntervalConditionImpl();
		return eventConstrainedIntervalCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockCondition createClockCondition() {
		ClockConditionImpl clockCondition = new ClockConditionImpl();
		return clockCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryClockCondition createAuxiliaryClockCondition() {
		AuxiliaryClockConditionImpl auxiliaryClockCondition = new AuxiliaryClockConditionImpl();
		return auxiliaryClockCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridClockCondition createHybridClockCondition() {
		HybridClockConditionImpl hybridClockCondition = new HybridClockConditionImpl();
		return hybridClockCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicClockCondition createBasicClockCondition() {
		BasicClockConditionImpl basicClockCondition = new BasicClockConditionImpl();
		return basicClockCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCondition createDataCondition() {
		DataConditionImpl dataCondition = new DataConditionImpl();
		return dataCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionCondition createCompositionCondition() {
		CompositionConditionImpl compositionCondition = new CompositionConditionImpl();
		return compositionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionEvent createCompositionEvent() {
		CompositionEventImpl compositionEvent = new CompositionEventImpl();
		return compositionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountedEvent createCountedEvent() {
		CountedEventImpl countedEvent = new CountedEventImpl();
		return countedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayedEvent createDelayedEvent() {
		DelayedEventImpl delayedEvent = new DelayedEventImpl();
		return delayedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationEvent createSynchronizationEvent() {
		SynchronizationEventImpl synchronizationEvent = new SynchronizationEventImpl();
		return synchronizationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionEvent createTransitionEvent() {
		TransitionEventImpl transitionEvent = new TransitionEventImpl();
		return transitionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateEvent createStateEvent() {
		StateEventImpl stateEvent = new StateEventImpl();
		return stateEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateCombinationEvent createStateCombinationEvent() {
		StateCombinationEventImpl stateCombinationEvent = new StateCombinationEventImpl();
		return stateCombinationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEvent createMessageEvent() {
		MessageEventImpl messageEvent = new MessageEventImpl();
		return messageEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerMessage createTriggerMessage() {
		TriggerMessageImpl triggerMessage = new TriggerMessageImpl();
		return triggerMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentDirection createAssignmentDirectionFromString(EDataType eDataType, String initialValue) {
		AssignmentDirection result = AssignmentDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssignmentDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateStatusKind createStateStatusKindFromString(EDataType eDataType, String initialValue) {
		StateStatusKind result = StateStatusKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateStatusKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateEventKind createStateEventKindFromString(EDataType eDataType, String initialValue) {
		StateEventKind result = StateEventKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateEventKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEventKind createMessageEventKindFromString(EDataType eDataType, String initialValue) {
		MessageEventKind result = MessageEventKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageEventKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencylanguagePackage getDependencylanguagePackage() {
		return (DependencylanguagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DependencylanguagePackage getPackage() {
		return DependencylanguagePackage.eINSTANCE;
	}

} //DependencylanguageFactoryImpl
