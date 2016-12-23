/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc;

import org.eclipse.emf.common.util.EList;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.pim.realtimestatechart.Clock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraph#getClocks <em>Clocks</em>}</li>
 * </ul>
 *
 * @see org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscPackage#getZoneGraph()
 * @model
 * @generated
 */
public interface ZoneGraph extends ReachabilityGraph {
	/**
	 * Returns the value of the '<em><b>Clocks</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.realtimestatechart.Clock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clocks</em>' reference list.
	 * @see org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscPackage#getZoneGraph_Clocks()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Clock> getClocks();

} // ZoneGraph
