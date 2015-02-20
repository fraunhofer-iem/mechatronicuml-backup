/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.sdm.SDMReachabilityGraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gt Automaton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtAutomaton#getClockInstanceIdentifiers <em>Clock Instance Identifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtautomatonPackage#getGtAutomaton()
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
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtautomatonPackage#getGtAutomaton_ClockInstanceIdentifiers()
	 * @model
	 * @generated
	 */
	EList<String> getClockInstanceIdentifiers();
} // GtAutomaton
