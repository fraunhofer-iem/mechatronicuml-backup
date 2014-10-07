/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraph;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraph#getClocks <em>Clocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.RtscPackage#getZoneGraph()
 * @model
 * @generated
 */
public interface ZoneGraph extends ReachabilityGraph {
	/**
	 * Returns the value of the '<em><b>Clocks</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.realtimestatechart.Clock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clocks</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.RtscPackage#getZoneGraph_Clocks()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Clock> getClocks();

} // ZoneGraph
