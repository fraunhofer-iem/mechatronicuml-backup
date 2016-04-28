/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.core.reachanalysis.reachabilitygraph.ActionTransition;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;
import org.muml.mumlcore.ExtendableElement;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.*;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.GraphTransformationSystem;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SuccessorStepGraphs;

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
 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage
 * @generated
 */
public class SdmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SdmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdmSwitch() {
		if (modelPackage == null) {
			modelPackage = SdmPackage.eINSTANCE;
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
			case SdmPackage.STEP_GRAPH: {
				StepGraph stepGraph = (StepGraph)theEObject;
				T result = caseStepGraph(stepGraph);
				if (result == null) result = caseReachabilityGraphState(stepGraph);
				if (result == null) result = caseExtendableElement(stepGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdmPackage.SDM_TRANSITION: {
				SDMTransition sdmTransition = (SDMTransition)theEObject;
				T result = caseSDMTransition(sdmTransition);
				if (result == null) result = caseActionTransition(sdmTransition);
				if (result == null) result = caseReachabilityGraphTransition(sdmTransition);
				if (result == null) result = caseExtendableElement(sdmTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdmPackage.INDEX_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<EObject, EObject> indexEntry = (Map.Entry<EObject, EObject>)theEObject;
				T result = caseIndexEntry(indexEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdmPackage.SUCCESSOR_STEP_GRAPHS: {
				SuccessorStepGraphs successorStepGraphs = (SuccessorStepGraphs)theEObject;
				T result = caseSuccessorStepGraphs(successorStepGraphs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdmPackage.GRAPH_TRANSFORMATION_SYSTEM: {
				GraphTransformationSystem graphTransformationSystem = (GraphTransformationSystem)theEObject;
				T result = caseGraphTransformationSystem(graphTransformationSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdmPackage.SDM_REACHABILITY_GRAPH: {
				SDMReachabilityGraph sdmReachabilityGraph = (SDMReachabilityGraph)theEObject;
				T result = caseSDMReachabilityGraph(sdmReachabilityGraph);
				if (result == null) result = caseReachabilityGraph(sdmReachabilityGraph);
				if (result == null) result = caseExtendableElement(sdmReachabilityGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdmPackage.MATCHING_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, EObject> matchingEntry = (Map.Entry<String, EObject>)theEObject;
				T result = caseMatchingEntry(matchingEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Index Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexEntry(Map.Entry<EObject, EObject> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Successor Step Graphs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Successor Step Graphs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccessorStepGraphs(SuccessorStepGraphs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Transformation System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Transformation System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphTransformationSystem(GraphTransformationSystem object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Matching Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matching Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchingEntry(Map.Entry<String, EObject> object) {
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

} //SdmSwitch
