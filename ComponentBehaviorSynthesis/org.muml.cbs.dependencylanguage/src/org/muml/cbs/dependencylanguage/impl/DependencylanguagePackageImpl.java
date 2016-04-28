/**
 */
package org.muml.cbs.dependencylanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.cbs.dependencylanguage.AssignmentDirection;
import org.muml.cbs.dependencylanguage.AuxiliaryClockCondition;
import org.muml.cbs.dependencylanguage.BasicClockCondition;
import org.muml.cbs.dependencylanguage.BoundedActiveState;
import org.muml.cbs.dependencylanguage.ClockCondition;
import org.muml.cbs.dependencylanguage.ClockMerge;
import org.muml.cbs.dependencylanguage.ClockResetEffect;
import org.muml.cbs.dependencylanguage.CompositionCondition;
import org.muml.cbs.dependencylanguage.CompositionEvent;
import org.muml.cbs.dependencylanguage.Condition;
import org.muml.cbs.dependencylanguage.ConditionalDependency;
import org.muml.cbs.dependencylanguage.CountedEvent;
import org.muml.cbs.dependencylanguage.DataAssignmentEffect;
import org.muml.cbs.dependencylanguage.DataCondition;
import org.muml.cbs.dependencylanguage.DataMerge;
import org.muml.cbs.dependencylanguage.DelayedEvent;
import org.muml.cbs.dependencylanguage.Dependency;
import org.muml.cbs.dependencylanguage.DependencyModel;
import org.muml.cbs.dependencylanguage.DependencylanguageFactory;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;
import org.muml.cbs.dependencylanguage.Effect;
import org.muml.cbs.dependencylanguage.EnableDisableEffect;
import org.muml.cbs.dependencylanguage.Event;
import org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition;
import org.muml.cbs.dependencylanguage.ForbiddenStateCombination;
import org.muml.cbs.dependencylanguage.HybridClockCondition;
import org.muml.cbs.dependencylanguage.MessageEvent;
import org.muml.cbs.dependencylanguage.MessageEventKind;
import org.muml.cbs.dependencylanguage.SimpleEvent;
import org.muml.cbs.dependencylanguage.StateCombinationEvent;
import org.muml.cbs.dependencylanguage.StateEvent;
import org.muml.cbs.dependencylanguage.StateEventKind;
import org.muml.cbs.dependencylanguage.StateStatusCondition;
import org.muml.cbs.dependencylanguage.StateStatusKind;
import org.muml.cbs.dependencylanguage.Synchronization;
import org.muml.cbs.dependencylanguage.SynchronizationEvent;
import org.muml.cbs.dependencylanguage.SynthesizableBehavior;
import org.muml.cbs.dependencylanguage.TransitionEvent;
import org.muml.cbs.dependencylanguage.TriggerMessage;
import org.muml.mumlcore.CorePackage;
import org.muml.mumlcore.expressions.ExpressionsPackage;
import org.muml.mumlcore.expressions.common.CommonExpressionsPackage;
import org.muml.pim.actionlanguage.ActionlanguagePackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.types.TypesPackage;
import org.muml.pim.valuetype.ValuetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencylanguagePackageImpl extends EPackageImpl implements DependencylanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synthesizableBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forbiddenStateCombinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockMergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableDisableEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockResetEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAssignmentEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedActiveStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateStatusConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventConstrainedIntervalConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auxiliaryClockConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hybridClockConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicClockConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countedEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayedEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateCombinationEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assignmentDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateStatusKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEventKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageEventKindEEnum = null;

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
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DependencylanguagePackageImpl() {
		super(eNS_URI, DependencylanguageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DependencylanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DependencylanguagePackage init() {
		if (isInited) return (DependencylanguagePackage)EPackage.Registry.INSTANCE.getEPackage(DependencylanguagePackage.eNS_URI);

		// Obtain or create and register package
		DependencylanguagePackageImpl theDependencylanguagePackage = (DependencylanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DependencylanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DependencylanguagePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActionlanguagePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDependencylanguagePackage.createPackageContents();

		// Initialize created meta-data
		theDependencylanguagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDependencylanguagePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DependencylanguagePackage.eNS_URI, theDependencylanguagePackage);
		return theDependencylanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynthesizableBehavior() {
		return synthesizableBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynthesizableBehavior_DependencyModel() {
		return (EReference)synthesizableBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynthesizableBehavior_Name() {
		return (EAttribute)synthesizableBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencyModel() {
		return dependencyModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependencyModel_Dependencies() {
		return (EReference)dependencyModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronization() {
		return synchronizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronization_SendingEvents() {
		return (EReference)synchronizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronization_ReceivingEvents() {
		return (EReference)synchronizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronization_ChannelName() {
		return (EAttribute)synchronizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronization_SelectorType() {
		return (EReference)synchronizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronization_GeneralSelectorExpression() {
		return (EReference)synchronizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForbiddenStateCombination() {
		return forbiddenStateCombinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForbiddenStateCombination_States() {
		return (EReference)forbiddenStateCombinationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockMerge() {
		return clockMergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockMerge_Clocks() {
		return (EReference)clockMergeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockMerge_ClockName() {
		return (EAttribute)clockMergeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMerge() {
		return dataMergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMerge_Variables() {
		return (EReference)dataMergeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMerge_VariableName() {
		return (EAttribute)dataMergeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMerge_Port() {
		return (EReference)dataMergeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalDependency() {
		return conditionalDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalDependency_Event() {
		return (EReference)conditionalDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalDependency_Condition() {
		return (EReference)conditionalDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalDependency_Effects() {
		return (EReference)conditionalDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffect() {
		return effectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnableDisableEffect() {
		return enableDisableEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnableDisableEffect_Event() {
		return (EReference)enableDisableEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableDisableEffect_IsEnable() {
		return (EAttribute)enableDisableEffectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockResetEffect() {
		return clockResetEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockResetEffect_Clocks() {
		return (EReference)clockResetEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAssignmentEffect() {
		return dataAssignmentEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAssignmentEffect_Direction() {
		return (EAttribute)dataAssignmentEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundedActiveState() {
		return boundedActiveStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundedActiveState_States() {
		return (EReference)boundedActiveStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundedActiveState_Constraint() {
		return (EReference)boundedActiveStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateStatusCondition() {
		return stateStatusConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateStatusCondition_States() {
		return (EReference)stateStatusConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateStatusCondition_Kind() {
		return (EAttribute)stateStatusConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventConstrainedIntervalCondition() {
		return eventConstrainedIntervalConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventConstrainedIntervalCondition_FromEvent() {
		return (EReference)eventConstrainedIntervalConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventConstrainedIntervalCondition_InitialEnabled() {
		return (EAttribute)eventConstrainedIntervalConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventConstrainedIntervalCondition_UntilEvent() {
		return (EReference)eventConstrainedIntervalConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventConstrainedIntervalCondition_EnabledInfite() {
		return (EAttribute)eventConstrainedIntervalConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockCondition() {
		return clockConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuxiliaryClockCondition() {
		return auxiliaryClockConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryClockCondition_Event() {
		return (EReference)auxiliaryClockConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryClockCondition_Bound() {
		return (EReference)auxiliaryClockConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliaryClockCondition_Operator() {
		return (EAttribute)auxiliaryClockConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHybridClockCondition() {
		return hybridClockConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridClockCondition_Condition() {
		return (EReference)hybridClockConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridClockCondition_Bound() {
		return (EReference)hybridClockConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHybridClockCondition_Operator() {
		return (EAttribute)hybridClockConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicClockCondition() {
		return basicClockConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCondition() {
		return dataConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCondition_Expression() {
		return (EReference)dataConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionCondition() {
		return compositionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionCondition_LeftCondition() {
		return (EReference)compositionConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositionCondition_Kind() {
		return (EAttribute)compositionConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionCondition_RightCondition() {
		return (EReference)compositionConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleEvent() {
		return simpleEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionEvent() {
		return compositionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionEvent_LeftEvent() {
		return (EReference)compositionEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositionEvent_Kind() {
		return (EAttribute)compositionEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionEvent_RightEvent() {
		return (EReference)compositionEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountedEvent() {
		return countedEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountedEvent_Event() {
		return (EReference)countedEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountedEvent_Counter() {
		return (EAttribute)countedEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelayedEvent() {
		return delayedEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelayedEvent_Delay() {
		return (EReference)delayedEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelayedEvent_Event() {
		return (EReference)delayedEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizationEvent() {
		return synchronizationEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizationEvent_SelectorExpression() {
		return (EReference)synchronizationEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizationEvent_Event() {
		return (EReference)synchronizationEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionEvent() {
		return transitionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionEvent_Transition() {
		return (EReference)transitionEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateEvent() {
		return stateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateEvent_State() {
		return (EReference)stateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateEvent_Kind() {
		return (EAttribute)stateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateCombinationEvent() {
		return stateCombinationEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateCombinationEvent_States() {
		return (EReference)stateCombinationEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateCombinationEvent_Kind() {
		return (EAttribute)stateCombinationEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageEvent() {
		return messageEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageEvent_Kind() {
		return (EAttribute)messageEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageEvent_Type() {
		return (EReference)messageEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageEvent_Port() {
		return (EReference)messageEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerMessage() {
		return triggerMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerMessage_Effects() {
		return (EReference)triggerMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerMessage_MessageEvent() {
		return (EReference)triggerMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssignmentDirection() {
		return assignmentDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStateStatusKind() {
		return stateStatusKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStateEventKind() {
		return stateEventKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageEventKind() {
		return messageEventKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencylanguageFactory getDependencylanguageFactory() {
		return (DependencylanguageFactory)getEFactoryInstance();
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
		synthesizableBehaviorEClass = createEClass(SYNTHESIZABLE_BEHAVIOR);
		createEReference(synthesizableBehaviorEClass, SYNTHESIZABLE_BEHAVIOR__DEPENDENCY_MODEL);
		createEAttribute(synthesizableBehaviorEClass, SYNTHESIZABLE_BEHAVIOR__NAME);

		dependencyModelEClass = createEClass(DEPENDENCY_MODEL);
		createEReference(dependencyModelEClass, DEPENDENCY_MODEL__DEPENDENCIES);

		dependencyEClass = createEClass(DEPENDENCY);

		synchronizationEClass = createEClass(SYNCHRONIZATION);
		createEReference(synchronizationEClass, SYNCHRONIZATION__SENDING_EVENTS);
		createEReference(synchronizationEClass, SYNCHRONIZATION__RECEIVING_EVENTS);
		createEAttribute(synchronizationEClass, SYNCHRONIZATION__CHANNEL_NAME);
		createEReference(synchronizationEClass, SYNCHRONIZATION__SELECTOR_TYPE);
		createEReference(synchronizationEClass, SYNCHRONIZATION__GENERAL_SELECTOR_EXPRESSION);

		forbiddenStateCombinationEClass = createEClass(FORBIDDEN_STATE_COMBINATION);
		createEReference(forbiddenStateCombinationEClass, FORBIDDEN_STATE_COMBINATION__STATES);

		clockMergeEClass = createEClass(CLOCK_MERGE);
		createEReference(clockMergeEClass, CLOCK_MERGE__CLOCKS);
		createEAttribute(clockMergeEClass, CLOCK_MERGE__CLOCK_NAME);

		dataMergeEClass = createEClass(DATA_MERGE);
		createEReference(dataMergeEClass, DATA_MERGE__VARIABLES);
		createEAttribute(dataMergeEClass, DATA_MERGE__VARIABLE_NAME);
		createEReference(dataMergeEClass, DATA_MERGE__PORT);

		conditionalDependencyEClass = createEClass(CONDITIONAL_DEPENDENCY);
		createEReference(conditionalDependencyEClass, CONDITIONAL_DEPENDENCY__EVENT);
		createEReference(conditionalDependencyEClass, CONDITIONAL_DEPENDENCY__CONDITION);
		createEReference(conditionalDependencyEClass, CONDITIONAL_DEPENDENCY__EFFECTS);

		effectEClass = createEClass(EFFECT);

		enableDisableEffectEClass = createEClass(ENABLE_DISABLE_EFFECT);
		createEReference(enableDisableEffectEClass, ENABLE_DISABLE_EFFECT__EVENT);
		createEAttribute(enableDisableEffectEClass, ENABLE_DISABLE_EFFECT__IS_ENABLE);

		clockResetEffectEClass = createEClass(CLOCK_RESET_EFFECT);
		createEReference(clockResetEffectEClass, CLOCK_RESET_EFFECT__CLOCKS);

		dataAssignmentEffectEClass = createEClass(DATA_ASSIGNMENT_EFFECT);
		createEAttribute(dataAssignmentEffectEClass, DATA_ASSIGNMENT_EFFECT__DIRECTION);

		boundedActiveStateEClass = createEClass(BOUNDED_ACTIVE_STATE);
		createEReference(boundedActiveStateEClass, BOUNDED_ACTIVE_STATE__STATES);
		createEReference(boundedActiveStateEClass, BOUNDED_ACTIVE_STATE__CONSTRAINT);

		conditionEClass = createEClass(CONDITION);

		stateStatusConditionEClass = createEClass(STATE_STATUS_CONDITION);
		createEReference(stateStatusConditionEClass, STATE_STATUS_CONDITION__STATES);
		createEAttribute(stateStatusConditionEClass, STATE_STATUS_CONDITION__KIND);

		eventConstrainedIntervalConditionEClass = createEClass(EVENT_CONSTRAINED_INTERVAL_CONDITION);
		createEReference(eventConstrainedIntervalConditionEClass, EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT);
		createEAttribute(eventConstrainedIntervalConditionEClass, EVENT_CONSTRAINED_INTERVAL_CONDITION__INITIAL_ENABLED);
		createEReference(eventConstrainedIntervalConditionEClass, EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT);
		createEAttribute(eventConstrainedIntervalConditionEClass, EVENT_CONSTRAINED_INTERVAL_CONDITION__ENABLED_INFITE);

		clockConditionEClass = createEClass(CLOCK_CONDITION);

		auxiliaryClockConditionEClass = createEClass(AUXILIARY_CLOCK_CONDITION);
		createEReference(auxiliaryClockConditionEClass, AUXILIARY_CLOCK_CONDITION__EVENT);
		createEReference(auxiliaryClockConditionEClass, AUXILIARY_CLOCK_CONDITION__BOUND);
		createEAttribute(auxiliaryClockConditionEClass, AUXILIARY_CLOCK_CONDITION__OPERATOR);

		hybridClockConditionEClass = createEClass(HYBRID_CLOCK_CONDITION);
		createEReference(hybridClockConditionEClass, HYBRID_CLOCK_CONDITION__CONDITION);
		createEReference(hybridClockConditionEClass, HYBRID_CLOCK_CONDITION__BOUND);
		createEAttribute(hybridClockConditionEClass, HYBRID_CLOCK_CONDITION__OPERATOR);

		basicClockConditionEClass = createEClass(BASIC_CLOCK_CONDITION);

		dataConditionEClass = createEClass(DATA_CONDITION);
		createEReference(dataConditionEClass, DATA_CONDITION__EXPRESSION);

		compositionConditionEClass = createEClass(COMPOSITION_CONDITION);
		createEReference(compositionConditionEClass, COMPOSITION_CONDITION__LEFT_CONDITION);
		createEAttribute(compositionConditionEClass, COMPOSITION_CONDITION__KIND);
		createEReference(compositionConditionEClass, COMPOSITION_CONDITION__RIGHT_CONDITION);

		eventEClass = createEClass(EVENT);

		simpleEventEClass = createEClass(SIMPLE_EVENT);

		compositionEventEClass = createEClass(COMPOSITION_EVENT);
		createEReference(compositionEventEClass, COMPOSITION_EVENT__LEFT_EVENT);
		createEAttribute(compositionEventEClass, COMPOSITION_EVENT__KIND);
		createEReference(compositionEventEClass, COMPOSITION_EVENT__RIGHT_EVENT);

		countedEventEClass = createEClass(COUNTED_EVENT);
		createEReference(countedEventEClass, COUNTED_EVENT__EVENT);
		createEAttribute(countedEventEClass, COUNTED_EVENT__COUNTER);

		delayedEventEClass = createEClass(DELAYED_EVENT);
		createEReference(delayedEventEClass, DELAYED_EVENT__DELAY);
		createEReference(delayedEventEClass, DELAYED_EVENT__EVENT);

		synchronizationEventEClass = createEClass(SYNCHRONIZATION_EVENT);
		createEReference(synchronizationEventEClass, SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION);
		createEReference(synchronizationEventEClass, SYNCHRONIZATION_EVENT__EVENT);

		transitionEventEClass = createEClass(TRANSITION_EVENT);
		createEReference(transitionEventEClass, TRANSITION_EVENT__TRANSITION);

		stateEventEClass = createEClass(STATE_EVENT);
		createEReference(stateEventEClass, STATE_EVENT__STATE);
		createEAttribute(stateEventEClass, STATE_EVENT__KIND);

		stateCombinationEventEClass = createEClass(STATE_COMBINATION_EVENT);
		createEReference(stateCombinationEventEClass, STATE_COMBINATION_EVENT__STATES);
		createEAttribute(stateCombinationEventEClass, STATE_COMBINATION_EVENT__KIND);

		messageEventEClass = createEClass(MESSAGE_EVENT);
		createEAttribute(messageEventEClass, MESSAGE_EVENT__KIND);
		createEReference(messageEventEClass, MESSAGE_EVENT__TYPE);
		createEReference(messageEventEClass, MESSAGE_EVENT__PORT);

		triggerMessageEClass = createEClass(TRIGGER_MESSAGE);
		createEReference(triggerMessageEClass, TRIGGER_MESSAGE__EFFECTS);
		createEReference(triggerMessageEClass, TRIGGER_MESSAGE__MESSAGE_EVENT);

		// Create enums
		assignmentDirectionEEnum = createEEnum(ASSIGNMENT_DIRECTION);
		stateStatusKindEEnum = createEEnum(STATE_STATUS_KIND);
		stateEventKindEEnum = createEEnum(STATE_EVENT_KIND);
		messageEventKindEEnum = createEEnum(MESSAGE_EVENT_KIND);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		RealtimestatechartPackage theRealtimestatechartPackage = (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);
		ComponentPackage theComponentPackage = (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);
		ActionlanguagePackage theActionlanguagePackage = (ActionlanguagePackage)EPackage.Registry.INSTANCE.getEPackage(ActionlanguagePackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);
		CommonExpressionsPackage theCommonExpressionsPackage = (CommonExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonExpressionsPackage.eNS_URI);
		MsgtypePackage theMsgtypePackage = (MsgtypePackage)EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI);
		ConnectorPackage theConnectorPackage = (ConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		synthesizableBehaviorEClass.getESuperTypes().add(theCorePackage.getExtension());
		synthesizableBehaviorEClass.getESuperTypes().add(theBehaviorPackage.getBehavioralElement());
		dependencyModelEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		dependencyEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		synchronizationEClass.getESuperTypes().add(this.getDependency());
		forbiddenStateCombinationEClass.getESuperTypes().add(this.getDependency());
		clockMergeEClass.getESuperTypes().add(this.getDependency());
		dataMergeEClass.getESuperTypes().add(this.getDependency());
		conditionalDependencyEClass.getESuperTypes().add(this.getDependency());
		effectEClass.getESuperTypes().add(ecorePackage.getEObject());
		enableDisableEffectEClass.getESuperTypes().add(this.getEffect());
		clockResetEffectEClass.getESuperTypes().add(this.getEffect());
		dataAssignmentEffectEClass.getESuperTypes().add(this.getEffect());
		dataAssignmentEffectEClass.getESuperTypes().add(theActionlanguagePackage.getAssignment());
		boundedActiveStateEClass.getESuperTypes().add(this.getDependency());
		conditionEClass.getESuperTypes().add(ecorePackage.getEObject());
		stateStatusConditionEClass.getESuperTypes().add(this.getCondition());
		eventConstrainedIntervalConditionEClass.getESuperTypes().add(this.getCondition());
		clockConditionEClass.getESuperTypes().add(this.getCondition());
		auxiliaryClockConditionEClass.getESuperTypes().add(this.getClockCondition());
		hybridClockConditionEClass.getESuperTypes().add(this.getClockCondition());
		basicClockConditionEClass.getESuperTypes().add(theRealtimestatechartPackage.getClockConstraint());
		basicClockConditionEClass.getESuperTypes().add(this.getClockCondition());
		dataConditionEClass.getESuperTypes().add(this.getCondition());
		compositionConditionEClass.getESuperTypes().add(this.getCondition());
		eventEClass.getESuperTypes().add(ecorePackage.getEObject());
		simpleEventEClass.getESuperTypes().add(this.getEvent());
		compositionEventEClass.getESuperTypes().add(this.getEvent());
		countedEventEClass.getESuperTypes().add(this.getEvent());
		delayedEventEClass.getESuperTypes().add(this.getEvent());
		synchronizationEventEClass.getESuperTypes().add(this.getEvent());
		transitionEventEClass.getESuperTypes().add(this.getSimpleEvent());
		stateEventEClass.getESuperTypes().add(this.getSimpleEvent());
		stateCombinationEventEClass.getESuperTypes().add(this.getSimpleEvent());
		messageEventEClass.getESuperTypes().add(this.getSimpleEvent());
		triggerMessageEClass.getESuperTypes().add(this.getDependency());

		// Initialize classes, features, and operations; add parameters
		initEClass(synthesizableBehaviorEClass, SynthesizableBehavior.class, "SynthesizableBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynthesizableBehavior_DependencyModel(), this.getDependencyModel(), null, "dependencyModel", null, 0, 1, SynthesizableBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynthesizableBehavior_Name(), ecorePackage.getEString(), "name", null, 0, 1, SynthesizableBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dependencyModelEClass, DependencyModel.class, "DependencyModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependencyModel_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, DependencyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(synchronizationEClass, Synchronization.class, "Synchronization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronization_SendingEvents(), this.getEvent(), null, "sendingEvents", null, 0, -1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchronization_ReceivingEvents(), this.getEvent(), null, "receivingEvents", null, 0, -1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchronization_ChannelName(), ecorePackage.getEString(), "channelName", null, 0, 1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchronization_SelectorType(), theTypesPackage.getDataType(), null, "selectorType", null, 0, 1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchronization_GeneralSelectorExpression(), theExpressionsPackage.getExpression(), null, "generalSelectorExpression", null, 0, 1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forbiddenStateCombinationEClass, ForbiddenStateCombination.class, "ForbiddenStateCombination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForbiddenStateCombination_States(), theRealtimestatechartPackage.getState(), null, "states", null, 2, -1, ForbiddenStateCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockMergeEClass, ClockMerge.class, "ClockMerge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockMerge_Clocks(), theRealtimestatechartPackage.getClock(), null, "clocks", null, 2, -1, ClockMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClockMerge_ClockName(), ecorePackage.getEString(), "clockName", null, 0, 1, ClockMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataMergeEClass, DataMerge.class, "DataMerge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataMerge_Variables(), theBehaviorPackage.getVariable(), null, "variables", null, 1, -1, DataMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataMerge_VariableName(), ecorePackage.getEString(), "variableName", "", 0, 1, DataMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataMerge_Port(), theComponentPackage.getHybridPort(), null, "port", null, 0, 1, DataMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalDependencyEClass, ConditionalDependency.class, "ConditionalDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalDependency_Event(), this.getEvent(), null, "event", null, 0, 1, ConditionalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalDependency_Condition(), this.getCondition(), null, "condition", null, 0, 1, ConditionalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalDependency_Effects(), this.getEffect(), null, "effects", null, 0, -1, ConditionalDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(effectEClass, Effect.class, "Effect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enableDisableEffectEClass, EnableDisableEffect.class, "EnableDisableEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnableDisableEffect_Event(), this.getEvent(), null, "event", null, 1, 1, EnableDisableEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnableDisableEffect_IsEnable(), ecorePackage.getEBoolean(), "isEnable", "false", 0, 1, EnableDisableEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockResetEffectEClass, ClockResetEffect.class, "ClockResetEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockResetEffect_Clocks(), theRealtimestatechartPackage.getClock(), null, "clocks", null, 1, -1, ClockResetEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAssignmentEffectEClass, DataAssignmentEffect.class, "DataAssignmentEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAssignmentEffect_Direction(), this.getAssignmentDirection(), "direction", null, 1, 1, DataAssignmentEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(boundedActiveStateEClass, BoundedActiveState.class, "BoundedActiveState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoundedActiveState_States(), theRealtimestatechartPackage.getState(), null, "states", null, 1, -1, BoundedActiveState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoundedActiveState_Constraint(), this.getClockCondition(), null, "constraint", null, 1, 1, BoundedActiveState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateStatusConditionEClass, StateStatusCondition.class, "StateStatusCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateStatusCondition_States(), theRealtimestatechartPackage.getState(), null, "states", null, 1, -1, StateStatusCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateStatusCondition_Kind(), this.getStateStatusKind(), "kind", null, 1, 1, StateStatusCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventConstrainedIntervalConditionEClass, EventConstrainedIntervalCondition.class, "EventConstrainedIntervalCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventConstrainedIntervalCondition_FromEvent(), this.getEvent(), null, "fromEvent", null, 0, 1, EventConstrainedIntervalCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventConstrainedIntervalCondition_InitialEnabled(), ecorePackage.getEBoolean(), "initialEnabled", "false", 1, 1, EventConstrainedIntervalCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventConstrainedIntervalCondition_UntilEvent(), this.getEvent(), null, "untilEvent", null, 0, 1, EventConstrainedIntervalCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventConstrainedIntervalCondition_EnabledInfite(), ecorePackage.getEBoolean(), "enabledInfite", "false", 1, 1, EventConstrainedIntervalCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockConditionEClass, ClockCondition.class, "ClockCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(auxiliaryClockConditionEClass, AuxiliaryClockCondition.class, "AuxiliaryClockCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuxiliaryClockCondition_Event(), this.getEvent(), null, "event", null, 1, 1, AuxiliaryClockCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuxiliaryClockCondition_Bound(), theValuetypePackage.getTimeValue(), null, "bound", null, 1, 1, AuxiliaryClockCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuxiliaryClockCondition_Operator(), theCommonExpressionsPackage.getComparingOperator(), "operator", null, 1, 1, AuxiliaryClockCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hybridClockConditionEClass, HybridClockCondition.class, "HybridClockCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHybridClockCondition_Condition(), this.getCondition(), null, "condition", null, 1, 1, HybridClockCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHybridClockCondition_Bound(), theValuetypePackage.getTimeValue(), null, "bound", null, 1, 1, HybridClockCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHybridClockCondition_Operator(), theCommonExpressionsPackage.getComparingOperator(), "operator", null, 1, 1, HybridClockCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicClockConditionEClass, BasicClockCondition.class, "BasicClockCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataConditionEClass, DataCondition.class, "DataCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataCondition_Expression(), theExpressionsPackage.getExpression(), null, "expression", null, 1, 1, DataCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionConditionEClass, CompositionCondition.class, "CompositionCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositionCondition_LeftCondition(), this.getCondition(), null, "leftCondition", null, 0, 1, CompositionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositionCondition_Kind(), theCommonExpressionsPackage.getLogicOperator(), "kind", null, 1, 1, CompositionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositionCondition_RightCondition(), this.getCondition(), null, "rightCondition", null, 0, 1, CompositionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleEventEClass, SimpleEvent.class, "SimpleEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositionEventEClass, CompositionEvent.class, "CompositionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositionEvent_LeftEvent(), this.getEvent(), null, "leftEvent", null, 1, 1, CompositionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositionEvent_Kind(), theCommonExpressionsPackage.getLogicOperator(), "kind", null, 1, 1, CompositionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositionEvent_RightEvent(), this.getEvent(), null, "rightEvent", null, 1, 1, CompositionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countedEventEClass, CountedEvent.class, "CountedEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCountedEvent_Event(), this.getEvent(), null, "event", null, 1, 1, CountedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountedEvent_Counter(), ecorePackage.getEInt(), "counter", null, 0, 1, CountedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delayedEventEClass, DelayedEvent.class, "DelayedEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelayedEvent_Delay(), theValuetypePackage.getTimeValue(), null, "delay", null, 1, 1, DelayedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelayedEvent_Event(), this.getEvent(), null, "event", null, 1, 1, DelayedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronizationEventEClass, SynchronizationEvent.class, "SynchronizationEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronizationEvent_SelectorExpression(), theExpressionsPackage.getExpression(), null, "selectorExpression", null, 0, 1, SynchronizationEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchronizationEvent_Event(), this.getEvent(), null, "event", null, 1, 1, SynchronizationEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEventEClass, TransitionEvent.class, "TransitionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionEvent_Transition(), theRealtimestatechartPackage.getTransition(), null, "transition", null, 1, 1, TransitionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEventEClass, StateEvent.class, "StateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateEvent_State(), theRealtimestatechartPackage.getState(), null, "state", null, 1, 1, StateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateEvent_Kind(), this.getStateEventKind(), "kind", null, 1, 1, StateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateCombinationEventEClass, StateCombinationEvent.class, "StateCombinationEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateCombinationEvent_States(), theRealtimestatechartPackage.getState(), null, "states", null, 2, -1, StateCombinationEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateCombinationEvent_Kind(), this.getStateEventKind(), "kind", null, 1, 1, StateCombinationEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEventEClass, MessageEvent.class, "MessageEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageEvent_Kind(), this.getMessageEventKind(), "kind", null, 1, 1, MessageEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageEvent_Type(), theMsgtypePackage.getMessageType(), null, "type", null, 1, 1, MessageEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageEvent_Port(), theConnectorPackage.getDiscreteInteractionEndpoint(), null, "port", null, 0, 1, MessageEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerMessageEClass, TriggerMessage.class, "TriggerMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTriggerMessage_Effects(), this.getEffect(), null, "effects", null, 0, -1, TriggerMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerMessage_MessageEvent(), this.getMessageEvent(), null, "messageEvent", null, 1, 1, TriggerMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(assignmentDirectionEEnum, AssignmentDirection.class, "AssignmentDirection");
		addEEnumLiteral(assignmentDirectionEEnum, AssignmentDirection.PUSH);
		addEEnumLiteral(assignmentDirectionEEnum, AssignmentDirection.PULL);

		initEEnum(stateStatusKindEEnum, StateStatusKind.class, "StateStatusKind");
		addEEnumLiteral(stateStatusKindEEnum, StateStatusKind.UNDEFIEND);
		addEEnumLiteral(stateStatusKindEEnum, StateStatusKind.ACTIVE);
		addEEnumLiteral(stateStatusKindEEnum, StateStatusKind.INACTIVE);

		initEEnum(stateEventKindEEnum, StateEventKind.class, "StateEventKind");
		addEEnumLiteral(stateEventKindEEnum, StateEventKind.UNDEFIEND);
		addEEnumLiteral(stateEventKindEEnum, StateEventKind.ENTRY);
		addEEnumLiteral(stateEventKindEEnum, StateEventKind.EXIT);

		initEEnum(messageEventKindEEnum, MessageEventKind.class, "MessageEventKind");
		addEEnumLiteral(messageEventKindEEnum, MessageEventKind.UNDEFIEND);
		addEEnumLiteral(messageEventKindEEnum, MessageEventKind.CONSUMING);
		addEEnumLiteral(messageEventKindEEnum, MessageEventKind.SENDING);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "actionlanguage", "/resource/org.muml.pim.actionlanguage/model/actionlanguage.ecore#/",
			 "core", "/resource/org.muml.core/model/core.ecore#/",
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore#/",
			 "behavior", "/resource/org.muml.pim/model/pim.ecore#//behavior",
			 "component", "/resource/org.muml.pim/model/pim.ecore#//component",
			 "expr", "/resource/org.muml.core/model/core.ecore#//expressions",
			 "realtimestatechart", "/resource/org.muml.pim/model/pim.ecore#//realtimestatechart",
			 "valueType", "/resource/org.muml.pim/model/pim.ecore#//valuetype",
			 "sdcec", "/resource/org.muml.core/model/core.ecore#//expressions/common"
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
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
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
		  (getSynthesizableBehavior_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if(not self.base.oclIsUndefined() and self.base.oclIsKindOf(component::AtomicComponent))\nthen (self.base).oclAsType(component::AtomicComponent).name.concat(\'-synth\')\nelse\nnull endif"
		   });
	}

} //DependencylanguagePackageImpl
