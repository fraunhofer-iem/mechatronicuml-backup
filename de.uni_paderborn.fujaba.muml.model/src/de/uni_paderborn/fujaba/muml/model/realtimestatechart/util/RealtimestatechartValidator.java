/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.util;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.*;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.AbsoluteDeadline;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousMessageEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Deadline;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Event;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EventKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Message;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Prioritizable;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RelativeDeadline;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryOrExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.TransitionEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage
 * @generated
 */
public class RealtimestatechartValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RealtimestatechartValidator INSTANCE = new RealtimestatechartValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.model.realtimestatechart";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimestatechartValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RealtimestatechartPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RealtimestatechartPackage.DEADLINE:
				return validateDeadline((Deadline)value, diagnostics, context);
			case RealtimestatechartPackage.ABSOLUTE_DEADLINE:
				return validateAbsoluteDeadline((AbsoluteDeadline)value, diagnostics, context);
			case RealtimestatechartPackage.RELATIVE_DEADLINE:
				return validateRelativeDeadline((RelativeDeadline)value, diagnostics, context);
			case RealtimestatechartPackage.CLOCK:
				return validateClock((Clock)value, diagnostics, context);
			case RealtimestatechartPackage.REGION:
				return validateRegion((Region)value, diagnostics, context);
			case RealtimestatechartPackage.STATE:
				return validateState((State)value, diagnostics, context);
			case RealtimestatechartPackage.VERTEX:
				return validateVertex((Vertex)value, diagnostics, context);
			case RealtimestatechartPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case RealtimestatechartPackage.CLOCK_CONSTRAINT:
				return validateClockConstraint((ClockConstraint)value, diagnostics, context);
			case RealtimestatechartPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT:
				return validateAsynchronousMessageEvent((AsynchronousMessageEvent)value, diagnostics, context);
			case RealtimestatechartPackage.DO_EVENT:
				return validateDoEvent((DoEvent)value, diagnostics, context);
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT:
				return validateEntryOrExitEvent((EntryOrExitEvent)value, diagnostics, context);
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL:
				return validateSynchronizationChannel((SynchronizationChannel)value, diagnostics, context);
			case RealtimestatechartPackage.SYNCHRONIZATION:
				return validateSynchronization((Synchronization)value, diagnostics, context);
			case RealtimestatechartPackage.PRIORITIZABLE:
				return validatePrioritizable((Prioritizable)value, diagnostics, context);
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART:
				return validateFujabaRealtimeStatechart((FujabaRealtimeStatechart)value, diagnostics, context);
			case RealtimestatechartPackage.ENTRY_OR_EXIT_POINT:
				return validateEntryOrExitPoint((EntryOrExitPoint)value, diagnostics, context);
			case RealtimestatechartPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case RealtimestatechartPackage.TRANSITION_EVENT:
				return validateTransitionEvent((TransitionEvent)value, diagnostics, context);
			case RealtimestatechartPackage.STATE_EVENT:
				return validateStateEvent((StateEvent)value, diagnostics, context);
			case RealtimestatechartPackage.MESSAGE:
				return validateMessage((Message)value, diagnostics, context);
			case RealtimestatechartPackage.STATE_ENTRY_OR_EXIT_POINT:
				return validateStateEntryOrExitPoint((StateEntryOrExitPoint)value, diagnostics, context);
			case RealtimestatechartPackage.ENTRY_EVENT:
				return validateEntryEvent((EntryEvent)value, diagnostics, context);
			case RealtimestatechartPackage.EXIT_EVENT:
				return validateExitEvent((ExitEvent)value, diagnostics, context);
			case RealtimestatechartPackage.ENTRY_POINT:
				return validateEntryPoint((EntryPoint)value, diagnostics, context);
			case RealtimestatechartPackage.EXIT_POINT:
				return validateExitPoint((ExitPoint)value, diagnostics, context);
			case RealtimestatechartPackage.STATE_ENTRY_POINT:
				return validateStateEntryPoint((StateEntryPoint)value, diagnostics, context);
			case RealtimestatechartPackage.STATE_EXIT_POINT:
				return validateStateExitPoint((StateExitPoint)value, diagnostics, context);
			case RealtimestatechartPackage.SYNCHRONIZATION_KIND:
				return validateSynchronizationKind((SynchronizationKind)value, diagnostics, context);
			case RealtimestatechartPackage.EVENT_KIND:
				return validateEventKind((EventKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeadline(Deadline deadline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deadline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbsoluteDeadline(AbsoluteDeadline absoluteDeadline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(absoluteDeadline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeDeadline(RelativeDeadline relativeDeadline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relativeDeadline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClock(Clock clock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion(Region region, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(region, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(state, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_OneInvarianPerClock(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_OneInitialState(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_NoOutgoingTransitionOfFinalState(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_NoRegionsOfFinalState(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_UniquePrioritiesOfOutgoingTransitions(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_UniquePrioritiesOfRegions(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_UniqueChannelNames(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_UniqueRegionNames(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_BoundOfInvariantGreaterOrEqualZero(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_InvalidClockConstraintOperator(state, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneInvarianPerClock constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__ONE_INVARIAN_PER_CLOCK__EEXPRESSION = "self.invariants->isUnique(clock)";

	/**
	 * Validates the OneInvarianPerClock constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_OneInvarianPerClock(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OneInvarianPerClock",
				 STATE__ONE_INVARIAN_PER_CLOCK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OneInitialState constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__ONE_INITIAL_STATE__EEXPRESSION = "self.statechart.vertices.oclAsType(State)->one(s|  s.initial)";

	/**
	 * Validates the OneInitialState constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_OneInitialState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OneInitialState",
				 STATE__ONE_INITIAL_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoOutgoingTransitionOfFinalState constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__NO_OUTGOING_TRANSITION_OF_FINAL_STATE__EEXPRESSION = "self.final implies self.outgoingTransitions->isEmpty()";

	/**
	 * Validates the NoOutgoingTransitionOfFinalState constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_NoOutgoingTransitionOfFinalState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoOutgoingTransitionOfFinalState",
				 STATE__NO_OUTGOING_TRANSITION_OF_FINAL_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoRegionsOfFinalState constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__NO_REGIONS_OF_FINAL_STATE__EEXPRESSION = "self.final implies self.regions->isEmpty()";

	/**
	 * Validates the NoRegionsOfFinalState constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_NoRegionsOfFinalState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoRegionsOfFinalState",
				 STATE__NO_REGIONS_OF_FINAL_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniquePrioritiesOfOutgoingTransitions constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__UNIQUE_PRIORITIES_OF_OUTGOING_TRANSITIONS__EEXPRESSION = "self.outgoingTransitions->isUnique(priority) ";

	/**
	 * Validates the UniquePrioritiesOfOutgoingTransitions constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_UniquePrioritiesOfOutgoingTransitions(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniquePrioritiesOfOutgoingTransitions",
				 STATE__UNIQUE_PRIORITIES_OF_OUTGOING_TRANSITIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniquePrioritiesOfRegions constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__UNIQUE_PRIORITIES_OF_REGIONS__EEXPRESSION = "self.regions->isUnique(priority)";

	/**
	 * Validates the UniquePrioritiesOfRegions constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_UniquePrioritiesOfRegions(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniquePrioritiesOfRegions",
				 STATE__UNIQUE_PRIORITIES_OF_REGIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueChannelNames constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__UNIQUE_CHANNEL_NAMES__EEXPRESSION = "self.channels->isUnique(name)";

	/**
	 * Validates the UniqueChannelNames constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_UniqueChannelNames(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueChannelNames",
				 STATE__UNIQUE_CHANNEL_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueRegionNames constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__UNIQUE_REGION_NAMES__EEXPRESSION = "self.regions->isUnique(name)";

	/**
	 * Validates the UniqueRegionNames constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_UniqueRegionNames(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueRegionNames",
				 STATE__UNIQUE_REGION_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the BoundOfInvariantGreaterOrEqualZero constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__BOUND_OF_INVARIANT_GREATER_OR_EQUAL_ZERO__EEXPRESSION = "self.invariants->forAll(bound.value >= 0)";

	/**
	 * Validates the BoundOfInvariantGreaterOrEqualZero constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_BoundOfInvariantGreaterOrEqualZero(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "BoundOfInvariantGreaterOrEqualZero",
				 STATE__BOUND_OF_INVARIANT_GREATER_OR_EQUAL_ZERO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvalidClockConstraintOperator constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__INVALID_CLOCK_CONSTRAINT_OPERATOR__EEXPRESSION = "self.invariants->forAll(invariant | Set{ modeling::expressions::ComparingOperator::LESS, modeling::expressions::ComparingOperator::LESS_OR_EQUAL }->includes(invariant.operator))";

	/**
	 * Validates the InvalidClockConstraintOperator constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_InvalidClockConstraintOperator(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "InvalidClockConstraintOperator",
				 STATE__INVALID_CLOCK_CONSTRAINT_OPERATOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVertex(Vertex vertex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vertex, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_SetTargetAndSource(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_NoCrossingOfRegionBorders(transition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SetTargetAndSource constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__SET_TARGET_AND_SOURCE__EEXPRESSION = "self.target->notEmpty() and self.source->notEmpty()";

	/**
	 * Validates the SetTargetAndSource constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_SetTargetAndSource(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SetTargetAndSource",
				 TRANSITION__SET_TARGET_AND_SOURCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoCrossingOfRegionBorders constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__NO_CROSSING_OF_REGION_BORDERS__EEXPRESSION = "self.source.statechart.embeddingRegion=self.target.statechart.embeddingRegion or\r\n" +
		"self.source.oclAsType(StateEntryPoint).statechart.embeddingRegion=\r\n" +
		"self.target.statechart.embeddingRegion.parentState.statechart.embeddingRegion  or \t\t\t\t\r\n" +
		"self.source.statechart.embeddingRegion.parentState.statechart.embeddingRegion=\r\n" +
		"self.target.oclAsType(StateExitPoint).statechart.embeddingRegion";

	/**
	 * Validates the NoCrossingOfRegionBorders constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_NoCrossingOfRegionBorders(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoCrossingOfRegionBorders",
				 TRANSITION__NO_CROSSING_OF_REGION_BORDERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockConstraint(ClockConstraint clockConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clockConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsynchronousMessageEvent(AsynchronousMessageEvent asynchronousMessageEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(asynchronousMessageEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoEvent(DoEvent doEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryOrExitEvent(EntryOrExitEvent entryOrExitEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryOrExitEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronizationChannel(SynchronizationChannel synchronizationChannel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synchronizationChannel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronization(Synchronization synchronization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synchronization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrioritizable(Prioritizable prioritizable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prioritizable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFujabaRealtimeStatechart(FujabaRealtimeStatechart fujabaRealtimeStatechart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fujabaRealtimeStatechart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fujabaRealtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fujabaRealtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fujabaRealtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fujabaRealtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fujabaRealtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fujabaRealtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fujabaRealtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fujabaRealtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validateFujabaRealtimeStatechart_UniqueNameOfStates(fujabaRealtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validateFujabaRealtimeStatechart_MinOneState(fujabaRealtimeStatechart, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueNameOfStates constraint of '<em>Fujaba Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FUJABA_REALTIME_STATECHART__UNIQUE_NAME_OF_STATES__EEXPRESSION = "self.vertices.oclAsType(State)->isUnique(name) ";

	/**
	 * Validates the UniqueNameOfStates constraint of '<em>Fujaba Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFujabaRealtimeStatechart_UniqueNameOfStates(FujabaRealtimeStatechart fujabaRealtimeStatechart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART,
				 fujabaRealtimeStatechart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueNameOfStates",
				 FUJABA_REALTIME_STATECHART__UNIQUE_NAME_OF_STATES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the MinOneState constraint of '<em>Fujaba Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FUJABA_REALTIME_STATECHART__MIN_ONE_STATE__EEXPRESSION = "self.vertices.oclAsType(State)->notEmpty()";

	/**
	 * Validates the MinOneState constraint of '<em>Fujaba Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFujabaRealtimeStatechart_MinOneState(FujabaRealtimeStatechart fujabaRealtimeStatechart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART,
				 fujabaRealtimeStatechart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "MinOneState",
				 FUJABA_REALTIME_STATECHART__MIN_ONE_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryOrExitPoint(EntryOrExitPoint entryOrExitPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryOrExitPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(event, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionEvent(TransitionEvent transitionEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitionEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateEvent(StateEvent stateEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stateEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(message, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateEntryOrExitPoint(StateEntryOrExitPoint stateEntryOrExitPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stateEntryOrExitPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryEvent(EntryEvent entryEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExitEvent(ExitEvent exitEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exitEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryPoint(EntryPoint entryPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entryPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntryPoint_OneOutgoingTransition(entryPoint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneOutgoingTransition constraint of '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTRY_POINT__ONE_OUTGOING_TRANSITION__EEXPRESSION = "self.outgoingTransitions->size() = 1";

	/**
	 * Validates the OneOutgoingTransition constraint of '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryPoint_OneOutgoingTransition(EntryPoint entryPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.ENTRY_POINT,
				 entryPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OneOutgoingTransition",
				 ENTRY_POINT__ONE_OUTGOING_TRANSITION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExitPoint(ExitPoint exitPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(exitPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateExitPoint_AtMostOneOutgoingTransition(exitPoint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtMostOneOutgoingTransition constraint of '<em>Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXIT_POINT__AT_MOST_ONE_OUTGOING_TRANSITION__EEXPRESSION = "self.outgoingTransitions->size() <= 1";

	/**
	 * Validates the AtMostOneOutgoingTransition constraint of '<em>Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExitPoint_AtMostOneOutgoingTransition(ExitPoint exitPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.EXIT_POINT,
				 exitPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AtMostOneOutgoingTransition",
				 EXIT_POINT__AT_MOST_ONE_OUTGOING_TRANSITION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateEntryPoint(StateEntryPoint stateEntryPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stateEntryPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stateEntryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateEntryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateEntryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stateEntryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateEntryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stateEntryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stateEntryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stateEntryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateEntryPoint_AtLeastOneIncomingTransition(stateEntryPoint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtLeastOneIncomingTransition constraint of '<em>State Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_ENTRY_POINT__AT_LEAST_ONE_INCOMING_TRANSITION__EEXPRESSION = "self.incomingTransitions ->size()>0";

	/**
	 * Validates the AtLeastOneIncomingTransition constraint of '<em>State Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateEntryPoint_AtLeastOneIncomingTransition(StateEntryPoint stateEntryPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.STATE_ENTRY_POINT,
				 stateEntryPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AtLeastOneIncomingTransition",
				 STATE_ENTRY_POINT__AT_LEAST_ONE_INCOMING_TRANSITION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateExitPoint(StateExitPoint stateExitPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stateExitPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stateExitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateExitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateExitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stateExitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateExitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stateExitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stateExitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stateExitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateExitPoint_OneOutgoingTransition(stateExitPoint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneOutgoingTransition constraint of '<em>State Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_EXIT_POINT__ONE_OUTGOING_TRANSITION__EEXPRESSION = "self.outgoingTransitions->size() = 1";

	/**
	 * Validates the OneOutgoingTransition constraint of '<em>State Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateExitPoint_OneOutgoingTransition(StateExitPoint stateExitPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.STATE_EXIT_POINT,
				 stateExitPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OneOutgoingTransition",
				 STATE_EXIT_POINT__ONE_OUTGOING_TRANSITION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronizationKind(SynchronizationKind synchronizationKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventKind(EventKind eventKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RealtimestatechartValidator
