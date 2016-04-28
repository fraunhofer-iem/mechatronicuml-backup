/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.core.reachanalysis.reachabilitygraph;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.muml.mumlcore.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reachability Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Reachability Graph represents the reachable system behavior which is 
 * explored by the reachability analysis. For timed reachability analyses, it is 
 * equivalent to the zone graph. In the literature, it is refered as the Timed Graph
 * Transition System or Labeled Transition System.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph#getStates <em>States</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph#getStartState <em>Start State</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph#getStatesWithHash <em>States With Hash</em>}</li>
 * </ul>
 *
 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getReachabilityGraph()
 * @model
 * @generated
 */
public interface ReachabilityGraph extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState}.
	 * It is bidirectional and its opposite is '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getReachabilityGraph <em>Reachability Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of all states being contained in this ReachabilityGraph.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getReachabilityGraph_States()
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getReachabilityGraph
	 * @model opposite="reachabilityGraph" containment="true"
	 * @generated
	 */
	EList<ReachabilityGraphState> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition}.
	 * It is bidirectional and its opposite is '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getReachabilityGraph <em>Reachability Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All transitions that are contained in this ReachabilityGraph.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getReachabilityGraph_Transitions()
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getReachabilityGraph
	 * @model opposite="reachabilityGraph" containment="true"
	 * @generated
	 */
	EList<ReachabilityGraphTransition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Start State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique start state of this ReachabilityGraph. All other states in the 
	 * Reachability Graph can be reached from this state by traversing the transitions
	 * of the ReachabilityGraph.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start State</em>' reference.
	 * @see #setStartState(ReachabilityGraphState)
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getReachabilityGraph_StartState()
	 * @model
	 * @generated
	 */
	ReachabilityGraphState getStartState();

	/**
	 * Sets the value of the '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph#getStartState <em>Start State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start State</em>' reference.
	 * @see #getStartState()
	 * @generated
	 */
	void setStartState(ReachabilityGraphState value);

	/**
	 * Returns the value of the '<em><b>States With Hash</b></em>' map.
	 * The key is of type {@link java.lang.Long},
	 * and the value is of type {@link org.muml.core.reachanalysis.reachabilitygraph.HashToStateList},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A hashmap that maps a hash value to a list of all states having that hash value.
	 * This data structure is used to identify states that are potentially equal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>States With Hash</em>' map.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getReachabilityGraph_StatesWithHash()
	 * @model mapType="org.muml.core.reachanalysis.reachabilitygraph.HashToStateListMapEntry<org.eclipse.emf.ecore.ELongObject, org.muml.core.reachanalysis.reachabilitygraph.HashToStateList>" transient="true"
	 * @generated
	 */
	EMap<Long, HashToStateList> getStatesWithHash();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Helper function that adds the state given as a parameter to the Map that maps the hash
	 * value of a state to the state.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Long hashValue = state.getHash();\r\n\r\n//check if entry for that hash exists\r\nHashToStateList list = this.getStatesWithHash().get(hashValue);\r\n\t\t\r\n//create new list and add it to the map\r\nif (list == null){\r\n\tlist = ReachabilityGraphFactory.eINSTANCE.createHashToStateList();\r\n\tlist.setHash(hashValue);\r\n\tlist.getStates().add(state);\r\n\tthis.getStatesWithHash().put(hashValue, list);\r\n}\r\n\t\t\r\n//add state to list\r\nlist.getStates().add(state);'"
	 * @generated
	 */
	void addToStatesMap(ReachabilityGraphState state);

} // ReachabilityGraph
