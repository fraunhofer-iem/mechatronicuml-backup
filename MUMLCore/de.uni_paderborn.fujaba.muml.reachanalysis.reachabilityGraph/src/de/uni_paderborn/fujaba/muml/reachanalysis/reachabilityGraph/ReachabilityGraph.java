/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.storydriven.core.ExtendableElement;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraph#getStates <em>States</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraph#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraph#getStartState <em>Start State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraph#getStatesWithHash <em>States With Hash</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getReachabilityGraph()
 * @model
 * @generated
 */
public interface ReachabilityGraph extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState#getReachabilityGraph <em>Reachability Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of all states being contained in this ReachabilityGraph.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getReachabilityGraph_States()
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState#getReachabilityGraph
	 * @model opposite="reachabilityGraph" containment="true"
	 * @generated
	 */
	EList<ReachabilityGraphState> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition#getReachabilityGraph <em>Reachability Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All transitions that are contained in this ReachabilityGraph.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getReachabilityGraph_Transitions()
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition#getReachabilityGraph
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
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getReachabilityGraph_StartState()
	 * @model
	 * @generated
	 */
	ReachabilityGraphState getStartState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraph#getStartState <em>Start State</em>}' reference.
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
	 * and the value is of type {@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.HashToStateList},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A hashmap that maps a hash value to a list of all states having that hash value.
	 * This data structure is used to identify states that are potentially equal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>States With Hash</em>' map.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getReachabilityGraph_StatesWithHash()
	 * @model mapType="de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.HashToStateListMapEntry<org.eclipse.emf.ecore.ELongObject, de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.HashToStateList>" transient="true"
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
