/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import de.uni_paderborn.fujaba.common.validator.MumlValidator;
import de.uni_paderborn.fujaba.muml.realtimestatechart.AbsoluteDeadline;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Action;
import de.uni_paderborn.fujaba.muml.realtimestatechart.AsynchronousMessageEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Deadline;
import de.uni_paderborn.fujaba.muml.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.EntryEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.EntryOrExitEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.EntryPoint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Event;
import de.uni_paderborn.fujaba.muml.realtimestatechart.EventKind;
import de.uni_paderborn.fujaba.muml.realtimestatechart.ExitEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.ExitPoint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Message;
import de.uni_paderborn.fujaba.muml.realtimestatechart.PrioritizedElement;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RelativeDeadline;
import de.uni_paderborn.fujaba.muml.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.realtimestatechart.StateConnectionPoint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.StateEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationKind;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.realtimestatechart.TransitionEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage
 */
public class RealtimestatechartValidator extends MumlValidator {
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
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.realtimestatechart";

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
			case RealtimestatechartPackage.PRIORITIZED_ELEMENT:
				return validatePrioritizedElement((PrioritizedElement)value, diagnostics, context);
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
			case RealtimestatechartPackage.STATE_CONNECTION_POINT:
				return validateStateConnectionPoint((StateConnectionPoint)value, diagnostics, context);
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
		if (!validate_NoCircularContainment(region, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(region, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrioritizedElement_PriorityGreaterOrEqualOne(region, diagnostics, context);
		return result;
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
		if (result || diagnostics != null) result &= validateState_NoOutgoingTransitionOfFinalState(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_NoRegionsOfFinalState(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_UniquePrioritiesOfOutgoingTransitions(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_UniquePrioritiesOfRegions(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_UniqueChannelNames(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_UniqueRegionNames(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_InvalidClockConstraintOperator(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_UniqueStateConnectionPointNames(state, diagnostics, context);
		return result;
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
	protected static final String STATE__NO_REGIONS_OF_FINAL_STATE__EEXPRESSION = "self.final implies self.embeddedRegions->isEmpty()";

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
	protected static final String STATE__UNIQUE_PRIORITIES_OF_REGIONS__EEXPRESSION = "self.embeddedRegions->isUnique(priority)";

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
	protected static final String STATE__UNIQUE_REGION_NAMES__EEXPRESSION = "self.embeddedRegions->isUnique(name)";

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
	 * The cached validation expression for the UniqueStateConnectionPointNames constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__UNIQUE_STATE_CONNECTION_POINT_NAMES__EEXPRESSION = "-- State Connection Points of a composite state must have unique names.\r\n" +
		"self.connectionPoints->isUnique(name)";

	/**
	 * Validates the UniqueStateConnectionPointNames constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_UniqueStateConnectionPointNames(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueStateConnectionPointNames",
				 STATE__UNIQUE_STATE_CONNECTION_POINT_NAMES__EEXPRESSION,
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
		if (result || diagnostics != null) result &= validatePrioritizedElement_PriorityGreaterOrEqualOne(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_LegalTransitionsOnly(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_TriggerMessageEventsMustNotHaveAnOwnedParameterBinding(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_ValidTriggerMessageEvents(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_ValidRaiseMessageEvents(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_StateConnectionPointIncomingTransitionsNoSideEffectsOrDeadlines(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_StateConnectionPointOutgoingTransitionsNoConditions(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_StateConnectionPointOutgoingTransitionsMustBeUrgent(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_NoCombinationOfRelativeAndAbsoluteDeadlines(transition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the LegalTransitionsOnly constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__LEGAL_TRANSITIONS_ONLY__EEXPRESSION = "-- Only specific types of transitions are allowed\r\n" +
		"\r\n" +
		"if (self.source.oclIsUndefined() or self.target.oclIsUndefined()) then\r\n" +
		"true\r\n" +
		"else\r\n" +
		"-- State A1 to ExitPoint of A2, where A2 is the direct parent state of A1\r\n" +
		"(self.source.oclIsKindOf(State) and self.target.oclIsKindOf(ExitPoint) and self.target.oclAsType(ExitPoint).state.embeddedRegions.embeddedStatechart.states->includes(self.source.oclAsType(State)))\t\r\n" +
		"or\r\n" +
		"-- EntryPoint of A1 to State A2, where A1 is the direct parent state of A2\r\n" +
		"(self.source.oclIsKindOf(EntryPoint) and self.target.oclIsKindOf(State) and self.source.oclAsType(EntryPoint).state.embeddedRegions.embeddedStatechart.states->includes(self.target.oclAsType(State)))\t\r\n" +
		"or\r\n" +
		"-- EntryPoint of A1 to EntryPoint of A2, where A1 is the direct parent state of A2\r\n" +
		"(self.source.oclIsKindOf(EntryPoint) and self.target.oclIsKindOf(EntryPoint) and self.source.oclAsType(EntryPoint).state.embeddedRegions.embeddedStatechart.states->includes(self.target.oclAsType(EntryPoint).state))\r\n" +
		"or\r\n" +
		"-- ExitPoint of A1 to ExitPoint of A2, where A2 is the direct parent state of A1\r\n" +
		"(self.source.oclIsKindOf(ExitPoint) and self.target.oclIsKindOf(ExitPoint) and self.target.oclAsType(ExitPoint).state.embeddedRegions.embeddedStatechart.states->includes(self.source.oclAsType(ExitPoint).state))\r\n" +
		"\r\n" +
		"or \r\n" +
		"-- State A to State B within the same statechart\r\n" +
		"(self.source.oclIsKindOf(State) and self.target.oclIsKindOf(State) and self.source.oclAsType(State).parentStatechart = self.target.oclAsType(State).parentStatechart)\r\n" +
		"or\r\n" +
		"-- State A to EntryPoint of B, where A and B are in the same statechart\r\n" +
		"(self.source.oclIsKindOf(State) and self.target.oclIsKindOf(EntryPoint) and self.source.oclAsType(State).parentStatechart = self.target.oclAsType(EntryPoint).state.parentStatechart)\r\n" +
		"or\r\n" +
		"-- ExitPoint of A to EntryPoint of B, where A and B are in the same statechart\r\n" +
		"(self.source.oclIsKindOf(ExitPoint) and self.target.oclIsKindOf(EntryPoint) and self.source.oclAsType(ExitPoint).state.parentStatechart = self.target.oclAsType(EntryPoint).state.parentStatechart)\r\n" +
		"or\r\n" +
		"-- ExitPoint of A to State B, where A and B are in the same statechart\r\n" +
		"(self.source.oclIsKindOf(ExitPoint) and self.target.oclIsKindOf(State) and self.source.oclAsType(ExitPoint).state.parentStatechart = self.target.oclAsType(State).parentStatechart)\r\n" +
		"endif";

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
	protected static final String TRANSITION__TRIGGER_MESSAGE_EVENTS_MUST_NOT_HAVE_AN_OWNED_PARAMETER_BINDING__EEXPRESSION = "not self.triggerMessageEvent.message.oclIsUndefined() implies\r\n" +
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
	protected static final String TRANSITION__VALID_TRIGGER_MESSAGE_EVENTS__EEXPRESSION = "not triggerMessageEvent.message.instanceOf.oclIsUndefined() implies receiverMessageTypes->includes(triggerMessageEvent.message.instanceOf)";

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
	protected static final String TRANSITION__VALID_RAISE_MESSAGE_EVENTS__EEXPRESSION = "not raiseMessageEvent.message.instanceOf.oclIsUndefined() implies senderMessageTypes->includes(raiseMessageEvent.message.instanceOf)";

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
	 * The cached validation expression for the StateConnectionPointIncomingTransitionsNoSideEffectsOrDeadlines constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__STATE_CONNECTION_POINT_INCOMING_TRANSITIONS_NO_SIDE_EFFECTS_OR_DEADLINES__EEXPRESSION = "(not self.target.oclIsUndefined() and self.target.oclIsKindOf(realtimestatechart::StateConnectionPoint))\r\n" +
		"\timplies (\r\n" +
		"\t\tself.clockResets->isEmpty()\r\n" +
		"\t\tand self.action.oclIsUndefined()\r\n" +
		"\t\tand self.raiseMessageEvent.oclIsUndefined()\r\n" +
		"\t\tand self.absoluteDeadlines->isEmpty()\r\n" +
		"\t\tand self.relativeDeadline.oclIsUndefined()\r\n" +
		"\t)";

	/**
	 * Validates the StateConnectionPointIncomingTransitionsNoSideEffectsOrDeadlines constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_StateConnectionPointIncomingTransitionsNoSideEffectsOrDeadlines(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "StateConnectionPointIncomingTransitionsNoSideEffectsOrDeadlines",
				 TRANSITION__STATE_CONNECTION_POINT_INCOMING_TRANSITIONS_NO_SIDE_EFFECTS_OR_DEADLINES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the StateConnectionPointOutgoingTransitionsNoConditions constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__STATE_CONNECTION_POINT_OUTGOING_TRANSITIONS_NO_CONDITIONS__EEXPRESSION = "(not self.source.oclIsUndefined() and self.source.oclIsKindOf(realtimestatechart::StateConnectionPoint))\r\n" +
		"\timplies (\r\n" +
		"\t\tself.triggerMessageEvent.oclIsUndefined()\r\n" +
		"\t\tand self.clockConstraints->isEmpty()\r\n" +
		"\t\tand self.guard.oclIsUndefined()\r\n" +
		"\t\tand self.synchronization.oclIsUndefined()\r\n" +
		"\t)";

	/**
	 * Validates the StateConnectionPointOutgoingTransitionsNoConditions constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_StateConnectionPointOutgoingTransitionsNoConditions(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "StateConnectionPointOutgoingTransitionsNoConditions",
				 TRANSITION__STATE_CONNECTION_POINT_OUTGOING_TRANSITIONS_NO_CONDITIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the StateConnectionPointOutgoingTransitionsMustBeUrgent constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__STATE_CONNECTION_POINT_OUTGOING_TRANSITIONS_MUST_BE_URGENT__EEXPRESSION = "(not self.source.oclIsUndefined() and self.source.oclIsKindOf(realtimestatechart::StateConnectionPoint))\r\n" +
		"\timplies (\r\n" +
		"\t\tself.urgent\r\n" +
		"\t)";

	/**
	 * Validates the StateConnectionPointOutgoingTransitionsMustBeUrgent constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_StateConnectionPointOutgoingTransitionsMustBeUrgent(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "StateConnectionPointOutgoingTransitionsMustBeUrgent",
				 TRANSITION__STATE_CONNECTION_POINT_OUTGOING_TRANSITIONS_MUST_BE_URGENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoCombinationOfRelativeAndAbsoluteDeadlines constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__NO_COMBINATION_OF_RELATIVE_AND_ABSOLUTE_DEADLINES__EEXPRESSION = "(not self.relativeDeadline.oclIsUndefined()) implies (self.absoluteDeadlines->isEmpty())";

	/**
	 * Validates the NoCombinationOfRelativeAndAbsoluteDeadlines constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_NoCombinationOfRelativeAndAbsoluteDeadlines(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoCombinationOfRelativeAndAbsoluteDeadlines",
				 TRANSITION__NO_COMBINATION_OF_RELATIVE_AND_ABSOLUTE_DEADLINES__EEXPRESSION,
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
		if (!validate_NoCircularContainment(asynchronousMessageEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(asynchronousMessageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(asynchronousMessageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(asynchronousMessageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(asynchronousMessageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(asynchronousMessageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(asynchronousMessageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(asynchronousMessageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(asynchronousMessageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateAsynchronousMessageEvent_RaiseMessageEventImpliesParameterBinding(asynchronousMessageEvent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the RaiseMessageEventImpliesParameterBinding constraint of '<em>Asynchronous Message Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASYNCHRONOUS_MESSAGE_EVENT__RAISE_MESSAGE_EVENT_IMPLIES_PARAMETER_BINDING__EEXPRESSION = "-- for a raise message, all parameter needs a binding\n" +
		"let messageType : msgtype::MessageType = self.message.instanceOf in\n" +
		"(self.kind=EventKind::RAISE and not self.message.oclIsUndefined()) implies ( not messageType.oclIsUndefined() implies (messageType.parameters->forAll(p | self.message.parameterBinding.parameter->includes(p))))\n" +
		"-- author: adann";

	/**
	 * Validates the RaiseMessageEventImpliesParameterBinding constraint of '<em>Asynchronous Message Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsynchronousMessageEvent_RaiseMessageEventImpliesParameterBinding(AsynchronousMessageEvent asynchronousMessageEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT,
				 asynchronousMessageEvent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "RaiseMessageEventImpliesParameterBinding",
				 ASYNCHRONOUS_MESSAGE_EVENT__RAISE_MESSAGE_EVENT_IMPLIES_PARAMETER_BINDING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (!validate_NoCircularContainment(synchronization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(synchronization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(synchronization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(synchronization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(synchronization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(synchronization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(synchronization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(synchronization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(synchronization, diagnostics, context);
		if (result || diagnostics != null) result &= validateSynchronization_SelectorExpressionNecessary(synchronization, diagnostics, context);
		if (result || diagnostics != null) result &= validateSynchronization_SelectorExpressionForbidden(synchronization, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SelectorExpressionNecessary constraint of '<em>Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYNCHRONIZATION__SELECTOR_EXPRESSION_NECESSARY__EEXPRESSION = "-- Selected SynchronizationChannel requires this Synchronization to specify a selector expression.\n" +
		"not syncChannel.selectorType.oclIsUndefined() implies not selectorExpression.oclIsUndefined()";

	/**
	 * Validates the SelectorExpressionNecessary constraint of '<em>Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronization_SelectorExpressionNecessary(Synchronization synchronization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.SYNCHRONIZATION,
				 synchronization,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SelectorExpressionNecessary",
				 SYNCHRONIZATION__SELECTOR_EXPRESSION_NECESSARY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SelectorExpressionForbidden constraint of '<em>Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYNCHRONIZATION__SELECTOR_EXPRESSION_FORBIDDEN__EEXPRESSION = "-- Selected SynchronizationChannel forbids this Synchronization to specify a selector expression.\n" +
		"not syncChannel.oclIsUndefined() implies (syncChannel.selectorType.oclIsUndefined() implies selectorExpression.oclIsUndefined())";

	/**
	 * Validates the SelectorExpressionForbidden constraint of '<em>Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronization_SelectorExpressionForbidden(Synchronization synchronization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.SYNCHRONIZATION,
				 synchronization,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SelectorExpressionForbidden",
				 SYNCHRONIZATION__SELECTOR_EXPRESSION_FORBIDDEN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrioritizedElement(PrioritizedElement prioritizedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(prioritizedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(prioritizedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(prioritizedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(prioritizedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(prioritizedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(prioritizedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(prioritizedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(prioritizedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(prioritizedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrioritizedElement_PriorityGreaterOrEqualOne(prioritizedElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PriorityGreaterOrEqualOne constraint of '<em>Prioritized Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRIORITIZED_ELEMENT__PRIORITY_GREATER_OR_EQUAL_ONE__EEXPRESSION = "self.priority >= 1";

	/**
	 * Validates the PriorityGreaterOrEqualOne constraint of '<em>Prioritized Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrioritizedElement_PriorityGreaterOrEqualOne(PrioritizedElement prioritizedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.PRIORITIZED_ELEMENT,
				 prioritizedElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "PriorityGreaterOrEqualOne",
				 PRIORITIZED_ELEMENT__PRIORITY_GREATER_OR_EQUAL_ONE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateRealtimeStatechart_NoCycles(realtimeStatechart, diagnostics, context);
		if (result || diagnostics != null) result &= validateRealtimeStatechart_OneInitialState(realtimeStatechart, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueNameOfStates constraint of '<em>Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REALTIME_STATECHART__UNIQUE_NAME_OF_STATES__EEXPRESSION = "self.states->isUnique(name)";

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
	 * The cached validation expression for the NoCycles constraint of '<em>Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REALTIME_STATECHART__NO_CYCLES__EEXPRESSION = "-- If we are contained within a statechart...\r\n" +
		"(not self.parentRegion.parentState.parentStatechart.oclIsUndefined())\r\n" +
		"\r\n" +
		"implies\r\n" +
		"\r\n" +
		"-- ... then we must not be a super statechart of it.\r\n" +
		"(not self.isSuperStatechartOf(self.parentRegion.parentState.parentStatechart))";

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
	 * The cached validation expression for the OneInitialState constraint of '<em>Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REALTIME_STATECHART__ONE_INITIAL_STATE__EEXPRESSION = "self.states->select(s |  s.initial)->size() = 1";

	/**
	 * Validates the OneInitialState constraint of '<em>Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealtimeStatechart_OneInitialState(RealtimeStatechart realtimeStatechart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.REALTIME_STATECHART,
				 realtimeStatechart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OneInitialState",
				 REALTIME_STATECHART__ONE_INITIAL_STATE__EEXPRESSION,
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
	public boolean validateStateConnectionPoint(StateConnectionPoint stateConnectionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stateConnectionPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stateConnectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateConnectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateConnectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stateConnectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateConnectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stateConnectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stateConnectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stateConnectionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateConnectionPoint_ConnectionPointsOnlyAtCompositeStates(stateConnectionPoint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ConnectionPointsOnlyAtCompositeStates constraint of '<em>State Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_CONNECTION_POINT__CONNECTION_POINTS_ONLY_AT_COMPOSITE_STATES__EEXPRESSION = "not self.state.oclIsUndefined() implies not self.state.simple";

	/**
	 * Validates the ConnectionPointsOnlyAtCompositeStates constraint of '<em>State Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateConnectionPoint_ConnectionPointsOnlyAtCompositeStates(StateConnectionPoint stateConnectionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.STATE_CONNECTION_POINT,
				 stateConnectionPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ConnectionPointsOnlyAtCompositeStates",
				 STATE_CONNECTION_POINT__CONNECTION_POINTS_ONLY_AT_COMPOSITE_STATES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateStateConnectionPoint_ConnectionPointsOnlyAtCompositeStates(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntryPoint_AtLeastOneIncomingTransition(entryPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntryPoint_OneOutgoingTransitionPerRegion(entryPoint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtLeastOneIncomingTransition constraint of '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTRY_POINT__AT_LEAST_ONE_INCOMING_TRANSITION__EEXPRESSION = "self.incomingTransitions ->notEmpty()";

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
	 * The cached validation expression for the OneOutgoingTransitionPerRegion constraint of '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTRY_POINT__ONE_OUTGOING_TRANSITION_PER_REGION__EEXPRESSION = "-- all regions of the parent state must have exactly one vertex that the EntryPoint connects to\r\n" +
		"(not self.state.oclIsUndefined()) implies self.state.embeddedRegions->forAll(r |\r\n" +
		"\tself.outgoingTransitions->one(t |\r\n" +
		"\t\t(t.target.oclIsKindOf(State) and t.target.oclAsType(State).parentStatechart.parentRegion = r)\r\n" +
		"\t\tor\r\n" +
		"\t\t(t.target.oclIsKindOf(EntryPoint) and t.target.oclAsType(EntryPoint).state.parentStatechart.parentRegion = r)\r\n" +
		"\t)\r\n" +
		")";

	/**
	 * Validates the OneOutgoingTransitionPerRegion constraint of '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryPoint_OneOutgoingTransitionPerRegion(EntryPoint entryPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.ENTRY_POINT,
				 entryPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OneOutgoingTransitionPerRegion",
				 ENTRY_POINT__ONE_OUTGOING_TRANSITION_PER_REGION__EEXPRESSION,
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
		if (result || diagnostics != null) result &= validateStateConnectionPoint_ConnectionPointsOnlyAtCompositeStates(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateExitPoint_AtLeastOneIncomingTransitionPerRegion(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateExitPoint_OneOutgoingTransition(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateExitPoint_AtMostOneConnectingRegionWithSynchronizations(exitPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateExitPoint_AtMostOneConnectingRegionWithTriggerMessageEvents(exitPoint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtLeastOneIncomingTransitionPerRegion constraint of '<em>Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXIT_POINT__AT_LEAST_ONE_INCOMING_TRANSITION_PER_REGION__EEXPRESSION = "-- all regions of the parent state must have at least one vertex that connects to the ExitPoint\r\n" +
		"(not self.state.oclIsUndefined()) implies self.state.embeddedRegions->forAll(r |\r\n" +
		"\tself.incomingTransitions->exists(t |\r\n" +
		"\t\t(t.source.oclIsKindOf(State) and t.source.oclAsType(State).parentStatechart.parentRegion = r)\r\n" +
		"\t\tor\r\n" +
		"\t\t(t.source.oclIsKindOf(ExitPoint) and t.source.oclAsType(ExitPoint).state.parentStatechart.parentRegion = r)\r\n" +
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
	 * The cached validation expression for the AtMostOneConnectingRegionWithSynchronizations constraint of '<em>Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXIT_POINT__AT_MOST_ONE_CONNECTING_REGION_WITH_SYNCHRONIZATIONS__EEXPRESSION = "-- There must be at most one region with synchronizing transitions that connect (directly or indirectly) to the exit point\r\n" +
		"\r\n" +
		"let exitTransitions : Collection(Transition) = \r\n" +
		"\r\n" +
		"self.incomingTransitions->union(\r\n" +
		"   self.incomingTransitions->closure(t | \r\n" +
		"\tif t.source.oclIsKindOf(ExitPoint)\r\n" +
		"\tthen t.source.incomingTransitions\r\n" +
		"\telse Sequence{}\r\n" +
		"\tendif\r\n" +
		"   )\r\n" +
		")\r\n" +
		"\r\n" +
		"in exitTransitions->forAll(t1 : Transition, t2: Transition | (t1 <> t2 and (not t1.synchronization.oclIsUndefined()) and (not t2.synchronization.oclIsUndefined())) implies (t1.statechart = t2.statechart))";

	/**
	 * Validates the AtMostOneConnectingRegionWithSynchronizations constraint of '<em>Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExitPoint_AtMostOneConnectingRegionWithSynchronizations(ExitPoint exitPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.EXIT_POINT,
				 exitPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AtMostOneConnectingRegionWithSynchronizations",
				 EXIT_POINT__AT_MOST_ONE_CONNECTING_REGION_WITH_SYNCHRONIZATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AtMostOneConnectingRegionWithTriggerMessageEvents constraint of '<em>Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXIT_POINT__AT_MOST_ONE_CONNECTING_REGION_WITH_TRIGGER_MESSAGE_EVENTS__EEXPRESSION = "-- There must be at most one region with transitions that have a trigger message event and connect (directly or indirectly) to the exit point\r\n" +
		"\r\n" +
		"let exitTransitions : Collection(Transition) = \r\n" +
		"\r\n" +
		"self.incomingTransitions->union(\r\n" +
		"   self.incomingTransitions->closure(t | \r\n" +
		"\tif t.source.oclIsKindOf(ExitPoint)\r\n" +
		"\tthen t.source.incomingTransitions\r\n" +
		"\telse Sequence{}\r\n" +
		"\tendif\r\n" +
		"   )\r\n" +
		")\r\n" +
		"\r\n" +
		"in exitTransitions->forAll(t1 : Transition, t2: Transition | (t1 <> t2 and (not t1.triggerMessageEvent.oclIsUndefined()) and (not t2.triggerMessageEvent.oclIsUndefined())) implies (t1.statechart = t2.statechart))";

	/**
	 * Validates the AtMostOneConnectingRegionWithTriggerMessageEvents constraint of '<em>Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExitPoint_AtMostOneConnectingRegionWithTriggerMessageEvents(ExitPoint exitPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RealtimestatechartPackage.Literals.EXIT_POINT,
				 exitPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AtMostOneConnectingRegionWithTriggerMessageEvents",
				 EXIT_POINT__AT_MOST_ONE_CONNECTING_REGION_WITH_TRIGGER_MESSAGE_EVENTS__EEXPRESSION,
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
