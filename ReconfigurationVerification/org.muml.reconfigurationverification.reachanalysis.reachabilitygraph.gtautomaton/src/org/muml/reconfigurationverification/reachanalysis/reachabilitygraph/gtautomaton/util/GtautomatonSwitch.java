/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.util;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.muml.core.reachanalysis.reachabilitygraph.ActionTransition;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;
import org.muml.mumlcore.ExtendableElement;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.*;

import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceStoryDiagram;

import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;

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
 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage
 * @generated
 */
public class GtautomatonSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GtautomatonPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtautomatonSwitch() {
		if (modelPackage == null) {
			modelPackage = GtautomatonPackage.eINSTANCE;
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
			case GtautomatonPackage.GT_STEP_GRAPH: {
				GtStepGraph gtStepGraph = (GtStepGraph)theEObject;
				T result = caseGtStepGraph(gtStepGraph);
				if (result == null) result = caseStepGraph(gtStepGraph);
				if (result == null) result = caseReachabilityGraphState(gtStepGraph);
				if (result == null) result = caseExtendableElement(gtStepGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtautomatonPackage.OBJECT_IDENTIFIER: {
				ObjectIdentifier objectIdentifier = (ObjectIdentifier)theEObject;
				T result = caseObjectIdentifier(objectIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtautomatonPackage.EOBJECT_TO_IDENTIFIER: {
				@SuppressWarnings("unchecked") Map.Entry<EObject, String> eObjectToIdentifier = (Map.Entry<EObject, String>)theEObject;
				T result = caseEObjectToIdentifier(eObjectToIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtautomatonPackage.IDENTIFIER_TO_EOBJECT: {
				@SuppressWarnings("unchecked") Map.Entry<String, EObject> identifierToEObject = (Map.Entry<String, EObject>)theEObject;
				T result = caseIdentifierToEObject(identifierToEObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtautomatonPackage.GT_AUTOMATON_TRANSITION: {
				GtAutomatonTransition gtAutomatonTransition = (GtAutomatonTransition)theEObject;
				T result = caseGtAutomatonTransition(gtAutomatonTransition);
				if (result == null) result = caseSDMTransition(gtAutomatonTransition);
				if (result == null) result = caseActionTransition(gtAutomatonTransition);
				if (result == null) result = caseReachabilityGraphTransition(gtAutomatonTransition);
				if (result == null) result = caseExtendableElement(gtAutomatonTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtautomatonPackage.GT_AUTOMATON_CLOCK_CONSTRAINT: {
				GtAutomatonClockConstraint gtAutomatonClockConstraint = (GtAutomatonClockConstraint)theEObject;
				T result = caseGtAutomatonClockConstraint(gtAutomatonClockConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtautomatonPackage.GT_AUTOMATON: {
				GtAutomaton gtAutomaton = (GtAutomaton)theEObject;
				T result = caseGtAutomaton(gtAutomaton);
				if (result == null) result = caseSDMReachabilityGraph(gtAutomaton);
				if (result == null) result = caseReachabilityGraph(gtAutomaton);
				if (result == null) result = caseExtendableElement(gtAutomaton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtautomatonPackage.CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER: {
				@SuppressWarnings("unchecked") Map.Entry<ClockInstanceStoryDiagram, EList<String>> clockInstanceStoryDiagramToIdentifier = (Map.Entry<ClockInstanceStoryDiagram, EList<String>>)theEObject;
				T result = caseClockInstanceStoryDiagramToIdentifier(clockInstanceStoryDiagramToIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gt Step Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gt Step Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGtStepGraph(GtStepGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectIdentifier(ObjectIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject To Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject To Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEObjectToIdentifier(Map.Entry<EObject, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier To EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier To EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierToEObject(Map.Entry<String, EObject> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gt Automaton Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gt Automaton Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGtAutomatonTransition(GtAutomatonTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gt Automaton Clock Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gt Automaton Clock Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGtAutomatonClockConstraint(GtAutomatonClockConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gt Automaton</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gt Automaton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGtAutomaton(GtAutomaton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Instance Story Diagram To Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Instance Story Diagram To Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockInstanceStoryDiagramToIdentifier(Map.Entry<ClockInstanceStoryDiagram, EList<String>> object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReachabilityGraphState(ReachabilityGraphState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepGraph(StepGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReachabilityGraphTransition(ReachabilityGraphTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionTransition(ActionTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDM Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDM Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDMTransition(SDMTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reachability Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reachability Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReachabilityGraph(ReachabilityGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDM Reachability Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDM Reachability Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDMReachabilityGraph(SDMReachabilityGraph object) {
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

} //GtautomatonSwitch
