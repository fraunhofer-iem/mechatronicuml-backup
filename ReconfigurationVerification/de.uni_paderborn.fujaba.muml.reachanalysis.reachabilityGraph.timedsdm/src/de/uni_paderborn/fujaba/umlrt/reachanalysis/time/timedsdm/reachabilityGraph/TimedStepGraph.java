/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.sdm.StepGraph;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstance;
import de.uni_paderborn.fujaba.udbm.Federation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Step Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A timed step graph is a state in the reachability graph for a reachability analysis on timed graph transformation systems. It combines the features of a timed state and a StepGraph.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.TimedStepGraph#getClockInstances <em>Clock Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.TimedStepGraph#getFederation <em>Federation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.ReachabilityGraphPackage#getTimedStepGraph()
 * @model
 * @generated
 */
public interface TimedStepGraph extends StepGraph {
	/**
	 * Returns the value of the '<em><b>Clock Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.ReachabilityGraphPackage#getTimedStepGraph_ClockInstances()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<ClockInstance> getClockInstances();

	/**
	 * Returns the value of the '<em><b>Federation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federation</em>' attribute.
	 * @see #setFederation(Federation)
	 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.ReachabilityGraphPackage#getTimedStepGraph_Federation()
	 * @model dataType="de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.FederationObject" transient="true"
	 * @generated
	 */
	Federation getFederation();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.TimedStepGraph#getFederation <em>Federation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federation</em>' attribute.
	 * @see #getFederation()
	 * @generated
	 */
	void setFederation(Federation value);

} // TimedStepGraph
