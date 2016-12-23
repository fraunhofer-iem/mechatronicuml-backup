/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm;

import org.eclipse.emf.common.util.EList;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstance;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;
import org.muml.udbm.Federation;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.TimedStepGraph#getClockInstances <em>Clock Instances</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.TimedStepGraph#getFederation <em>Federation</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.TimedsdmPackage#getTimedStepGraph()
 * @model
 * @generated
 */
public interface TimedStepGraph extends StepGraph {
	/**
	 * Returns the value of the '<em><b>Clock Instances</b></em>' reference list.
	 * The list contents are of type {@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Instances</em>' reference list.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.TimedsdmPackage#getTimedStepGraph_ClockInstances()
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
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.TimedsdmPackage#getTimedStepGraph_Federation()
	 * @model dataType="org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.FederationObject" transient="true"
	 * @generated
	 */
	Federation getFederation();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.TimedStepGraph#getFederation <em>Federation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federation</em>' attribute.
	 * @see #getFederation()
	 * @generated
	 */
	void setFederation(Federation value);

} // TimedStepGraph
