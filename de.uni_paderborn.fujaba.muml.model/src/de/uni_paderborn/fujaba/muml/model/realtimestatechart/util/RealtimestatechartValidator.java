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
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Event;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EventKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Message;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Prioritizable;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RelativeDeadline;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEvent;
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
			case RealtimestatechartPackage.REALTIME_STATECHART:
				return validateRealtimeStatechart((RealtimeStatechart)value, diagnostics, context);
			case RealtimestatechartPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case RealtimestatechartPackage.TRANSITION_EVENT:
				return validateTransitionEvent((TransitionEvent)value, diagnostics, context);
			case RealtimestatechartPackage.STATE_EVENT:
				return validateStateEvent((StateEvent)value, diagnostics, context);
			case RealtimestatechartPackage.MESSAGE:
				return validateMessage((Message)value, diagnostics, context);
			case RealtimestatechartPackage.ENTRY_EVENT:
				return validateEntryEvent((EntryEvent)value, diagnostics, context);
			case RealtimestatechartPackage.EXIT_EVENT:
				return validateExitEvent((ExitEvent)value, diagnostics, context);
			case RealtimestatechartPackage.ENTRY_POINT:
				return validateEntryPoint((EntryPoint)value, diagnostics, context);
			case RealtimestatechartPackage.EXIT_POINT:
				return validateExitPoint((ExitPoint)value, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateState_OneInvariantPerClock(state, diagnostics, context);
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
	 * The cached validation expression for the OneInvariantPerClock constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__ONE_INVARIANT_PER_CLOCK__EEXPRESSION = "self.invariants->isUnique(clock)";

	/**
	 * Validates the OneInvariantPerClock constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_OneInvariantPerClock(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OneInvariantPerClock",
				 STATE__ONE_INVARIANT_PER_CLOCK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the OneInitialState constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_OneInitialState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "OneInitialState", getObjectLabel(state, context) },
						 new Object[] { state },
						 context));
			}
			return false;
		}
		return true;
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
	protected static final String STATE__INVALID_CLOCK_CONSTRAINT_OPERATOR__EEXPRESSION = "self.invariants->forAll(invariant | Set{core::expressions::common::ComparingOperator::LESS, core::expressions::common::ComparingOperator::LESS_OR_EQUAL }->includes(invariant.operator))";

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
		if (result || diagnostics != null) result &= validateTransition_LegalTransitionsOnly(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_TriggerMessageEventsMustNotHaveAnOwnedParameterBinding(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_ValidTriggerMessageEvents(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_ValidRaiseMessageEvents(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_ExitPointIncomingTransitionsNoSideEffectsOrDeadlines(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_ExitPointOutgoingTransitionsNoConditions(transition, diagnostics, context);
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
	 * The cached validation expression for the LegalTransitionsOnly constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__LEGAL_TRANSITIONS_ONLY__EEXPRESSION = "-- State A to State B within the same statechart\r\n" +
		"(self.source.oclIsKindOf(State) and self.target.oclIsKindOf(State) and self.source.oclAsType(State).statechart = self.target.oclAsType(State).statechart)\r\n" +
		"or\r\n" +
		"-- State A to EntryPoint of B, where A and B are in the same statechart\r\n" +
		"(self.source.oclIsKindOf(State) and self.target.oclIsKindOf(EntryPoint) and self.source.oclAsType(State).statechart = self.target.oclAsType(ExitPoint).state.statechart)\r\n" +
		"or\r\n" +
		"-- State A1 to ExitPoint of A2, where A2 is the direct parent state of A1\r\n" +
		"(self.source.oclIsKindOf(State) and self.target.oclIsKindOf(ExitPoint) and self.source.oclAsType(State).statechart.embeddingRegion.parentState = self.target.oclAsType(ExitPoint).state)\r\n" +
		"or\r\n" +
		"-- EntryPoint of A1 to State A2, where A1 is the direct parent state of A2\r\n" +
		"(self.source.oclIsKindOf(EntryPoint) and self.target.oclIsKindOf(State) and self.source.oclAsType(EntryPoint).state = self.target.oclAsType(State).statechart.embeddingRegion.parentState)\r\n" +
		"or\r\n" +
		"-- EntryPoint of A1 to EntryPoint of A2, where A1 is the direct parent state of A2\r\n" +
		"(self.source.oclIsKindOf(EntryPoint) and self.target.oclIsKindOf(EntryPoint) and self.source.oclAsType(EntryPoint).state = self.target.oclAsType(EntryPoint).state.statechart.embeddingRegion.parentState)\r\n" +
		"or\r\n" +
		"-- ExitPoint of A to State B, where A and B are in the same statechart\r\n" +
		"(self.source.oclIsKindOf(ExitPoint) and self.target.oclIsKindOf(State) and self.source.oclAsType(ExitPoint).state.statechart = self.target.oclAsType(State).statechart)\r\n" +
		"or\r\n" +
		"-- ExitPoint of A to EntryPoint of B, where A and B are in the same statechart\r\n" +
		"(self.source.oclIsKindOf(ExitPoint) and self.target.oclIsKindOf(EntryPoint) and self.source.oclAsType(ExitPoint).state.statechart = self.target.oclAsType(EntryPoint).state.statechart)\r\n" +
		"or\r\n" +
		"-- ExitPoint of A1 to ExitPoint of A2, where A2 is the direct parent state of A1\r\n" +
		"(self.source.oclIsKindOf(ExitPoint) and self.target.oclIsKindOf(ExitPoint) and self.source.oclAsType(ExitPoint).state.statechart.embeddingRegion.parentState = self.target.oclAsType(ExitPoint).state)";

	/**
	 * Validates the LegalTransitionsOnly constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_LegalTransitionsOnly(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "LegalTransitionsOnly",
				 TRANSITION__LEGAL_TRANSITIONS_ONLY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TriggerMessageEventsMustNotHaveAnOwnedParameterBinding constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__TRIGGER_MESSAGE_EVENTS_MUST_NOT_HAVE_AN_OWNED_PARAMETER_BINDING__EEXPRESSION = "not self.triggerMessageEvent.message.oclIsUndefined() implies\n" +
		"self.triggerMessageEvent.message.parameterBinding->isEmpty()";

	/**
	 * Validates the TriggerMessageEventsMustNotHaveAnOwnedParameterBinding constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_TriggerMessageEventsMustNotHaveAnOwnedParameterBinding(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "TriggerMessageEventsMustNotHaveAnOwnedParameterBinding",
				 TRANSITION__TRIGGER_MESSAGE_EVENTS_MUST_NOT_HAVE_AN_OWNED_PARAMETER_BINDING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidTriggerMessageEvents constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__VALID_TRIGGER_MESSAGE_EVENTS__EEXPRESSION = "let a : msgiface::MessageInterface =\r\n" +
		"(\r\n" +
		"\tif statechart.getPortOrRoleStatechart().behavioralElement.oclIsKindOf(component::DiscretePort) then\r\n" +
		"\t\tstatechart.getPortOrRoleStatechart().behavioralElement.oclAsType(component::DiscretePort).receiverMessageInterface\r\n" +
		"\telse\r\n" +
		"\t\tif statechart.getPortOrRoleStatechart().behavioralElement.oclIsKindOf(pattern::Role) then\r\n" +
		"\t\t\tstatechart.getPortOrRoleStatechart().behavioralElement.oclAsType(pattern::Role).receiverMessageInterface\r\n" +
		"\t\telse\r\n" +
		"\t\t\tnull\r\n" +
		"\t\tendif\r\n" +
		"\tendif\r\n" +
		") in\r\n" +
		"(not triggerMessageEvent.message.instanceOf.oclIsUndefined()) implies (not a.oclIsUndefined() and a.messageTypes->includes(triggerMessageEvent.message.instanceOf))";

	/**
	 * Validates the ValidTriggerMessageEvents constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_ValidTriggerMessageEvents(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidTriggerMessageEvents",
				 TRANSITION__VALID_TRIGGER_MESSAGE_EVENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidRaiseMessageEvents constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__VALID_RAISE_MESSAGE_EVENTS__EEXPRESSION = "let a : msgiface::MessageInterface =\r\n" +
		"(\r\n" +
		"\tif statechart.getPortOrRoleStatechart().behavioralElement.oclIsKindOf(component::DiscretePort) then\r\n" +
		"\t\tstatechart.getPortOrRoleStatechart().behavioralElement.oclAsType(component::DiscretePort).senderMessageInterface\r\n" +
		"\telse\r\n" +
		"\t\tif statechart.getPortOrRoleStatechart().behavioralElement.oclIsKindOf(pattern::Role) then\r\n" +
		"\t\t\tstatechart.getPortOrRoleStatechart().behavioralElement.oclAsType(pattern::Role).senderMessageInterface\r\n" +
		"\t\telse\r\n" +
		"\t\t\tnull\r\n" +
		"\t\tendif\r\n" +
		"\tendif\r\n" +
		") in\r\n" +
		"(not raiseMessageEvent.message.instanceOf.oclIsUndefined()) implies (not a.oclIsUndefined() and a.messageTypes->includes(raiseMessageEvent.message.instanceOf))";

	/**
	 * Validates the ValidRaiseMessageEvents constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_ValidRaiseMessageEvents(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidRaiseMessageEvents",
				 TRANSITION__VALID_RAISE_MESSAGE_EVENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ExitPointIncomingTransitionsNoSideEffectsOrDeadlines constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__EXIT_POINT_INCOMING_TRANSITIONS_NO_SIDE_EFFECTS_OR_DEADLINES__EEXPRESSION = "(not self.target.oclIsUndefined() and self.target.oclIsKindOf(realtimestatechart::ExitPoint))\r\n" +
		"\timplies (\r\n" +
		"\t\tself.clockResets->isEmpty()\r\n" +
		"\t\tand self.action.oclIsUndefined()\r\n" +
		"\t\tand self.absoluteDeadlines->isEmpty()\r\n" +
		"\t\tand self.relativeDeadline.oclIsUndefined()\r\n" +
		"\t)";

	/**
	 * Validates the ExitPointIncomingTransitionsNoSideEffectsOrDeadlines constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_ExitPointIncomingTransitionsNoSideEffectsOrDeadlines(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ExitPointIncomingTransitionsNoSideEffectsOrDeadlines",
				 TRANSITION__EXIT_POINT_INCOMING_TRANSITIONS_NO_SIDE_EFFECTS_OR_DEADLINES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ExitPointOutgoingTransitionsNoConditions constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__EXIT_POINT_OUTGOING_TRANSITIONS_NO_CONDITIONS__EEXPRESSION = "(not self.source.oclIsUndefined() and self.source.oclIsKindOf(realtimestatechart::ExitPoint))\r\n" +
		"\timplies (\r\n" +
		"\t\tself.triggerMessageEvent.oclIsUndefined()\r\n" +
		"\t\tand self.clockConstraints->isEmpty()\r\n" +
		"\t\tand self.guard.oclIsUndefined()\r\n" +
		"\t)";

	/**
	 * Validates the ExitPointOutgoingTransitionsNoConditions constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_ExitPointOutgoingTransitionsNoConditions(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ExitPointOutgoingTransitionsNoConditions",
				 TRANSITION__EXIT_POINT_OUTGOING_TRANSITIONS_NO_CONDITIONS__EEXPRESSION,
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
		if (!validate_NoCircularContainment(doEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(doEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(doEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(doEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(doEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(doEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(doEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(doEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(doEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateDoEvent_ValidLowerUpperPeriod(doEvent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ValidLowerUpperPeriod constraint of '<em>Do Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DO_EVENT__VALID_LOWER_UPPER_PERIOD__EEXPRESSION = "self.periodLower >= 1 and self.periodLower <= self.periodUpper";

	/**
	 * Validates the ValidLowerUpperPeriod constraint of '<em>Do Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoEvent_ValidLowerUpperPeriod(DoEvent doEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.DO_EVENT,
				 doEvent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ValidLowerUpperPeriod",
				 DO_EVENT__VALID_LOWER_UPPER_PERIOD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	public boolean validateRealtimeStatechart(RealtimeStatechart realtimeStatechart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(realtimeStatechart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(realtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(realtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(realtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(realtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(realtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(realtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(realtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(realtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validateRealtimeStatechart_UniqueNameOfStates(realtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validateRealtimeStatechart_MinOneState(realtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validateRealtimeStatechart_NoCycles(realtimeStatechart, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueNameOfStates constraint of '<em>Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REALTIME_STATECHART__UNIQUE_NAME_OF_STATES__EEXPRESSION = "self.vertices->select(oclIsTypeOf(State)).oclAsType(State)->isUnique(name)";

	/**
	 * Validates the UniqueNameOfStates constraint of '<em>Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealtimeStatechart_UniqueNameOfStates(RealtimeStatechart realtimeStatechart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.REALTIME_STATECHART,
				 realtimeStatechart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueNameOfStates",
				 REALTIME_STATECHART__UNIQUE_NAME_OF_STATES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the MinOneState constraint of '<em>Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REALTIME_STATECHART__MIN_ONE_STATE__EEXPRESSION = "self.vertices->select(oclIsTypeOf(State)).oclAsType(State)->notEmpty()";

	/**
	 * Validates the MinOneState constraint of '<em>Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealtimeStatechart_MinOneState(RealtimeStatechart realtimeStatechart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.REALTIME_STATECHART,
				 realtimeStatechart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "MinOneState",
				 REALTIME_STATECHART__MIN_ONE_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoCycles constraint of '<em>Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REALTIME_STATECHART__NO_CYCLES__EEXPRESSION = "-- If we are contained within a statechart...\n" +
		"(not self.embeddingRegion.parentState.statechart.oclIsUndefined())\n" +
		"\n" +
		"implies\n" +
		"\n" +
		"-- ... then we must not be a super statechart of it.\n" +
		"(not self.isSuperStatechartOf(self.embeddingRegion.parentState.statechart))";

	/**
	 * Validates the NoCycles constraint of '<em>Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealtimeStatechart_NoCycles(RealtimeStatechart realtimeStatechart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.REALTIME_STATECHART,
				 realtimeStatechart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoCycles",
				 REALTIME_STATECHART__NO_CYCLES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateEntryPoint_AtLeastOneIncomingTransition(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntryPoint_AtLeastOneOutgoingTransition(entryPoint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtLeastOneIncomingTransition constraint of '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTRY_POINT__AT_LEAST_ONE_INCOMING_TRANSITION__EEXPRESSION = "self.incomingTransitions ->size()>0";

	/**
	 * Validates the AtLeastOneIncomingTransition constraint of '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryPoint_AtLeastOneIncomingTransition(EntryPoint entryPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.ENTRY_POINT,
				 entryPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AtLeastOneIncomingTransition",
				 ENTRY_POINT__AT_LEAST_ONE_INCOMING_TRANSITION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AtLeastOneOutgoingTransition constraint of '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTRY_POINT__AT_LEAST_ONE_OUTGOING_TRANSITION__EEXPRESSION = "self.outgoingTransitions->size() > 0";

	/**
	 * Validates the AtLeastOneOutgoingTransition constraint of '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryPoint_AtLeastOneOutgoingTransition(EntryPoint entryPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.ENTRY_POINT,
				 entryPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AtLeastOneOutgoingTransition",
				 ENTRY_POINT__AT_LEAST_ONE_OUTGOING_TRANSITION__EEXPRESSION,
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
		if (result || diagnostics != null) result &= validateExitPoint_AtLeastOneIncomingTransitionPerRegion(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateExitPoint_OneOutgoingTransition(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateExitPoint_ExitPointsOnlyAtCompositeStates(exitPoint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtLeastOneIncomingTransitionPerRegion constraint of '<em>Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXIT_POINT__AT_LEAST_ONE_INCOMING_TRANSITION_PER_REGION__EEXPRESSION = "-- all regions of the parent state have at least one state that connects to the ExitPoint\r\n" +
		"self.state.regions->forAll(r | \r\n" +
		"\tr.statechart.states->exists(s |\r\n" +
		"\t\ts.outgoingTransitions->exists(t | t.target = self)\r\n" +
		"\t\tor\r\n" +
		"\t\ts.exitPoints.outgoingTransitions->exists(t | t.target = self)\r\n" +
		"\t)\r\n" +
		")";

	/**
	 * Validates the AtLeastOneIncomingTransitionPerRegion constraint of '<em>Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExitPoint_AtLeastOneIncomingTransitionPerRegion(ExitPoint exitPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.EXIT_POINT,
				 exitPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AtLeastOneIncomingTransitionPerRegion",
				 EXIT_POINT__AT_LEAST_ONE_INCOMING_TRANSITION_PER_REGION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OneOutgoingTransition constraint of '<em>Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXIT_POINT__ONE_OUTGOING_TRANSITION__EEXPRESSION = "self.outgoingTransitions->size() = 1";

	/**
	 * Validates the OneOutgoingTransition constraint of '<em>Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExitPoint_OneOutgoingTransition(ExitPoint exitPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.EXIT_POINT,
				 exitPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OneOutgoingTransition",
				 EXIT_POINT__ONE_OUTGOING_TRANSITION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ExitPointsOnlyAtCompositeStates constraint of '<em>Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXIT_POINT__EXIT_POINTS_ONLY_AT_COMPOSITE_STATES__EEXPRESSION = "not self.state.simple";

	/**
	 * Validates the ExitPointsOnlyAtCompositeStates constraint of '<em>Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExitPoint_ExitPointsOnlyAtCompositeStates(ExitPoint exitPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.EXIT_POINT,
				 exitPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ExitPointsOnlyAtCompositeStates",
				 EXIT_POINT__EXIT_POINTS_ONLY_AT_COMPOSITE_STATES__EEXPRESSION,
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
