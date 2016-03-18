/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ActionTransition;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone Graph Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphTransition#getFiredRTSCTransitions <em>Fired RTSC Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.RtscPackage#getZoneGraphTransition()
 * @model
 * @generated
 */
public interface ZoneGraphTransition extends ActionTransition {
	/**
	 * Returns the value of the '<em><b>Fired RTSC Transitions</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fired RTSC Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fired RTSC Transitions</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.RtscPackage#getZoneGraphTransition_FiredRTSCTransitions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Transition> getFiredRTSCTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSource().toString() + \" --> \" + this.getTarget().toString();'"
	 * @generated
	 */
	String toString();

} // ZoneGraphTransition
