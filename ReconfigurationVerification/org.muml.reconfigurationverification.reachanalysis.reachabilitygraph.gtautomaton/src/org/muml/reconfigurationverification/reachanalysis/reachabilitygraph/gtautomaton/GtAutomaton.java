/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton;

import org.eclipse.emf.common.util.EList;

import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gt Automaton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomaton#getClockInstanceIdentifiers <em>Clock Instance Identifiers</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#getGtAutomaton()
 * @model
 * @generated
 */
public interface GtAutomaton extends SDMReachabilityGraph {
	/**
	 * Returns the value of the '<em><b>Clock Instance Identifiers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Instance Identifiers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Instance Identifiers</em>' attribute list.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#getGtAutomaton_ClockInstanceIdentifiers()
	 * @model
	 * @generated
	 */
	EList<String> getClockInstanceIdentifiers();

} // GtAutomaton
