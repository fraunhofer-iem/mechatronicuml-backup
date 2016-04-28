/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.core.reachanalysis.reachabilitygraph.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.core.reachanalysis.reachabilitygraph.*;
import org.muml.core.reachanalysis.reachabilitygraph.ActionTransition;
import org.muml.core.reachanalysis.reachabilitygraph.HashToStateList;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;
import org.muml.mumlcore.ExtendableElement;

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
 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage
 * @generated
 */
public class ReachabilityGraphSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReachabilityGraphPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReachabilityGraphSwitch() {
		if (modelPackage == null) {
			modelPackage = ReachabilityGraphPackage.eINSTANCE;
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
			case ReachabilityGraphPackage.HASH_TO_STATE_LIST: {
				HashToStateList hashToStateList = (HashToStateList)theEObject;
				T result = caseHashToStateList(hashToStateList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReachabilityGraphPackage.HASH_TO_STATE_LIST_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<Long, HashToStateList> hashToStateListMapEntry = (Map.Entry<Long, HashToStateList>)theEObject;
				T result = caseHashToStateListMapEntry(hashToStateListMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReachabilityGraphPackage.REACHABILITY_GRAPH: {
				ReachabilityGraph reachabilityGraph = (ReachabilityGraph)theEObject;
				T result = caseReachabilityGraph(reachabilityGraph);
				if (result == null) result = caseExtendableElement(reachabilityGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION: {
				ReachabilityGraphTransition reachabilityGraphTransition = (ReachabilityGraphTransition)theEObject;
				T result = caseReachabilityGraphTransition(reachabilityGraphTransition);
				if (result == null) result = caseExtendableElement(reachabilityGraphTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReachabilityGraphPackage.ACTION_TRANSITION: {
				ActionTransition actionTransition = (ActionTransition)theEObject;
				T result = caseActionTransition(actionTransition);
				if (result == null) result = caseReachabilityGraphTransition(actionTransition);
				if (result == null) result = caseExtendableElement(actionTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE: {
				ReachabilityGraphState reachabilityGraphState = (ReachabilityGraphState)theEObject;
				T result = caseReachabilityGraphState(reachabilityGraphState);
				if (result == null) result = caseExtendableElement(reachabilityGraphState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hash To State List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hash To State List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHashToStateList(HashToStateList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hash To State List Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hash To State List Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHashToStateListMapEntry(Map.Entry<Long, HashToStateList> object) {
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

} //ReachabilityGraphSwitch
