/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.reconfigurationverification.timedstorydiagram.*;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstance;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceVariable;
import org.muml.reconfigurationverification.timedstorydiagram.InvariantStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.TimedActivityNode;
import org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem;
import org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.TimedStoryPattern;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage
 * @generated
 */
public class TimedstorydiagramValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TimedstorydiagramValidator INSTANCE = new TimedstorydiagramValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.reconfigurationverification.timedstorydiagram";

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
	public TimedstorydiagramValidator() {
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
	  return TimedstorydiagramPackage.eINSTANCE;
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
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM:
				return validateTimedGraphTransformationSystem((TimedGraphTransformationSystem)value, diagnostics, context);
			case TimedstorydiagramPackage.TIMED_STORY_DIAGRAM:
				return validateTimedStoryDiagram((TimedStoryDiagram)value, diagnostics, context);
			case TimedstorydiagramPackage.INVARIANT_STORY_DIAGRAM:
				return validateInvariantStoryDiagram((InvariantStoryDiagram)value, diagnostics, context);
			case TimedstorydiagramPackage.CLOCK_INSTANCE_STORY_DIAGRAM:
				return validateClockInstanceStoryDiagram((ClockInstanceStoryDiagram)value, diagnostics, context);
			case TimedstorydiagramPackage.CLOCK_INSTANCE:
				return validateClockInstance((ClockInstance)value, diagnostics, context);
			case TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT:
				return validateClockInstanceConstraint((ClockInstanceConstraint)value, diagnostics, context);
			case TimedstorydiagramPackage.CLOCK_INSTANCE_VARIABLE:
				return validateClockInstanceVariable((ClockInstanceVariable)value, diagnostics, context);
			case TimedstorydiagramPackage.TIMED_STORY_PATTERN:
				return validateTimedStoryPattern((TimedStoryPattern)value, diagnostics, context);
			case TimedstorydiagramPackage.TIMED_ACTIVITY_NODE:
				return validateTimedActivityNode((TimedActivityNode)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedGraphTransformationSystem(TimedGraphTransformationSystem timedGraphTransformationSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timedGraphTransformationSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedStoryDiagram(TimedStoryDiagram timedStoryDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timedStoryDiagram, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timedStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timedStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timedStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timedStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timedStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timedStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timedStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timedStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimedStoryDiagram_validDurations(timedStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimedStoryDiagram_OnlyContainsTimedActivityNodes(timedStoryDiagram, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validDurations constraint of '<em>Timed Story Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIMED_STORY_DIAGRAM__VALID_DURATIONS__EEXPRESSION = "self.minDuration >= 0 and self.minDuration <= self.maxDuration";

	/**
	 * Validates the validDurations constraint of '<em>Timed Story Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedStoryDiagram_validDurations(TimedStoryDiagram timedStoryDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TimedstorydiagramPackage.Literals.TIMED_STORY_DIAGRAM,
				 timedStoryDiagram,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "validDurations",
				 TIMED_STORY_DIAGRAM__VALID_DURATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OnlyContainsTimedActivityNodes constraint of '<em>Timed Story Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIMED_STORY_DIAGRAM__ONLY_CONTAINS_TIMED_ACTIVITY_NODES__EEXPRESSION = "-- A TimedStoryDiagram may only contain an initial node, a final node, TimedActivityNodes, StatementNodes, and ActivityCallNodes --\r\n" +
		"self.ownedActivityNode  -> select(v | v.oclIsTypeOf(timedstorydiagram::TimedActivityNode) or v.oclIsTypeOf(storydiagrams::activities::InitialNode) or v.oclIsTypeOf(storydiagrams::activities::ActivityFinalNode) or \r\n" +
		"v.oclIsTypeOf(storydiagrams::activities::ActivityCallNode) or v.oclIsTypeOf(storydiagrams::activities::JunctionNode) or v.oclIsTypeOf(storydiagrams::activities::StatementNode)) -> size() = self.ownedActivityNode -> size()";

	/**
	 * Validates the OnlyContainsTimedActivityNodes constraint of '<em>Timed Story Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedStoryDiagram_OnlyContainsTimedActivityNodes(TimedStoryDiagram timedStoryDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TimedstorydiagramPackage.Literals.TIMED_STORY_DIAGRAM,
				 timedStoryDiagram,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OnlyContainsTimedActivityNodes",
				 TIMED_STORY_DIAGRAM__ONLY_CONTAINS_TIMED_ACTIVITY_NODES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvariantStoryDiagram(InvariantStoryDiagram invariantStoryDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(invariantStoryDiagram, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(invariantStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(invariantStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(invariantStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(invariantStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(invariantStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(invariantStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(invariantStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(invariantStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvariantStoryDiagram_NoModificationInInvariantRule(invariantStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvariantStoryDiagram_OnlyContainsTimedActivityNodes(invariantStoryDiagram, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoModificationInInvariantRule constraint of '<em>Invariant Story Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INVARIANT_STORY_DIAGRAM__NO_MODIFICATION_IN_INVARIANT_RULE__EEXPRESSION = "-- In an InvariantStoryDiagram, all TimedActivityNodes need to be non-modifying--\r\n" +
		"self.ownedActivityNode -> forAll(v | v.oclIsTypeOf(timedstorydiagram::TimedActivityNode) implies (v.oclAsType(timedstorydiagram::TimedActivityNode).ownedRule.oclAsType(timedstorydiagram::TimedStoryPattern).nonModifyingStoryPattern = true))";

	/**
	 * Validates the NoModificationInInvariantRule constraint of '<em>Invariant Story Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvariantStoryDiagram_NoModificationInInvariantRule(InvariantStoryDiagram invariantStoryDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TimedstorydiagramPackage.Literals.INVARIANT_STORY_DIAGRAM,
				 invariantStoryDiagram,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoModificationInInvariantRule",
				 INVARIANT_STORY_DIAGRAM__NO_MODIFICATION_IN_INVARIANT_RULE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OnlyContainsTimedActivityNodes constraint of '<em>Invariant Story Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INVARIANT_STORY_DIAGRAM__ONLY_CONTAINS_TIMED_ACTIVITY_NODES__EEXPRESSION = "-- An InvariantStoryDiagram may only contain an initial node, a final node, and TimedActivityNodes --\r\n" +
		"self.ownedActivityNode  -> select(v | v.oclIsTypeOf(timedstorydiagram::TimedActivityNode) or v.oclIsTypeOf(storydiagrams::activities::InitialNode) or v.oclIsTypeOf(storydiagrams::activities::ActivityFinalNode)) -> size() = self.ownedActivityNode -> size()";

	/**
	 * Validates the OnlyContainsTimedActivityNodes constraint of '<em>Invariant Story Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvariantStoryDiagram_OnlyContainsTimedActivityNodes(InvariantStoryDiagram invariantStoryDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TimedstorydiagramPackage.Literals.INVARIANT_STORY_DIAGRAM,
				 invariantStoryDiagram,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OnlyContainsTimedActivityNodes",
				 INVARIANT_STORY_DIAGRAM__ONLY_CONTAINS_TIMED_ACTIVITY_NODES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockInstanceStoryDiagram(ClockInstanceStoryDiagram clockInstanceStoryDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clockInstanceStoryDiagram, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clockInstanceStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clockInstanceStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clockInstanceStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clockInstanceStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clockInstanceStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clockInstanceStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clockInstanceStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clockInstanceStoryDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validateClockInstanceStoryDiagram_OnlyContainsTimedActivityNodes(clockInstanceStoryDiagram, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyContainsTimedActivityNodes constraint of '<em>Clock Instance Story Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLOCK_INSTANCE_STORY_DIAGRAM__ONLY_CONTAINS_TIMED_ACTIVITY_NODES__EEXPRESSION = "-- A ClockInstanceStoryDiagram may only contain an initial node, a final node, and TimedActivityNodes --\r\n" +
		"self.ownedActivityNode  -> select(v | v.oclIsTypeOf(timedstorydiagram::TimedActivityNode) or v.oclIsTypeOf(storydiagrams::activities::InitialNode) or v.oclIsTypeOf(storydiagrams::activities::ActivityFinalNode)) -> size() = self.ownedActivityNode -> size()";

	/**
	 * Validates the OnlyContainsTimedActivityNodes constraint of '<em>Clock Instance Story Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockInstanceStoryDiagram_OnlyContainsTimedActivityNodes(ClockInstanceStoryDiagram clockInstanceStoryDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TimedstorydiagramPackage.Literals.CLOCK_INSTANCE_STORY_DIAGRAM,
				 clockInstanceStoryDiagram,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OnlyContainsTimedActivityNodes",
				 CLOCK_INSTANCE_STORY_DIAGRAM__ONLY_CONTAINS_TIMED_ACTIVITY_NODES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockInstance(ClockInstance clockInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clockInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockInstanceConstraint(ClockInstanceConstraint clockInstanceConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clockInstanceConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockInstanceVariable(ClockInstanceVariable clockInstanceVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clockInstanceVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clockInstanceVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clockInstanceVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clockInstanceVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clockInstanceVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clockInstanceVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clockInstanceVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clockInstanceVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clockInstanceVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateClockInstanceVariable_ClockInstanceVariableOnlyRefersToClockInstances(clockInstanceVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateClockInstanceVariable_SetNameUponCreationOfClockInstance(clockInstanceVariable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ClockInstanceVariableOnlyRefersToClockInstances constraint of '<em>Clock Instance Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLOCK_INSTANCE_VARIABLE__CLOCK_INSTANCE_VARIABLE_ONLY_REFERS_TO_CLOCK_INSTANCES__EEXPRESSION = "self.classifier = timedstorydiagram::ClockInstance";

	/**
	 * Validates the ClockInstanceVariableOnlyRefersToClockInstances constraint of '<em>Clock Instance Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockInstanceVariable_ClockInstanceVariableOnlyRefersToClockInstances(ClockInstanceVariable clockInstanceVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TimedstorydiagramPackage.Literals.CLOCK_INSTANCE_VARIABLE,
				 clockInstanceVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ClockInstanceVariableOnlyRefersToClockInstances",
				 CLOCK_INSTANCE_VARIABLE__CLOCK_INSTANCE_VARIABLE_ONLY_REFERS_TO_CLOCK_INSTANCES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SetNameUponCreationOfClockInstance constraint of '<em>Clock Instance Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLOCK_INSTANCE_VARIABLE__SET_NAME_UPON_CREATION_OF_CLOCK_INSTANCE__EEXPRESSION = "if self.bindingOperator = storydiagrams::patterns::BindingOperator::CREATE then (self.attributeAssignment -> size() >= 1 and self.attributeAssignment -> select(attribute.name = 'name') -> size() >= 1) else true endif";

	/**
	 * Validates the SetNameUponCreationOfClockInstance constraint of '<em>Clock Instance Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockInstanceVariable_SetNameUponCreationOfClockInstance(ClockInstanceVariable clockInstanceVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TimedstorydiagramPackage.Literals.CLOCK_INSTANCE_VARIABLE,
				 clockInstanceVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SetNameUponCreationOfClockInstance",
				 CLOCK_INSTANCE_VARIABLE__SET_NAME_UPON_CREATION_OF_CLOCK_INSTANCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedStoryPattern(TimedStoryPattern timedStoryPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timedStoryPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedActivityNode(TimedActivityNode timedActivityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timedActivityNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timedActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timedActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timedActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timedActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timedActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timedActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timedActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timedActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimedActivityNode_TimedActivityNodeMayOnlyContainTimedStoryPattern(timedActivityNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TimedActivityNodeMayOnlyContainTimedStoryPattern constraint of '<em>Timed Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIMED_ACTIVITY_NODE__TIMED_ACTIVITY_NODE_MAY_ONLY_CONTAIN_TIMED_STORY_PATTERN__EEXPRESSION = "self.ownedRule.oclIsKindOf(timedstorydiagram::TimedStoryPattern)";

	/**
	 * Validates the TimedActivityNodeMayOnlyContainTimedStoryPattern constraint of '<em>Timed Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedActivityNode_TimedActivityNodeMayOnlyContainTimedStoryPattern(TimedActivityNode timedActivityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TimedstorydiagramPackage.Literals.TIMED_ACTIVITY_NODE,
				 timedActivityNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "TimedActivityNodeMayOnlyContainTimedStoryPattern",
				 TIMED_ACTIVITY_NODE__TIMED_ACTIVITY_NODE_MAY_ONLY_CONTAIN_TIMED_STORY_PATTERN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //TimedstorydiagramValidator
