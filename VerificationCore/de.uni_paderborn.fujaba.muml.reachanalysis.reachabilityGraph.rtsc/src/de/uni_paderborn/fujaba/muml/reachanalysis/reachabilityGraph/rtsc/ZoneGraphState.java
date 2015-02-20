/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState;
import de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance;
import de.uni_paderborn.fujaba.udbm.Federation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone Graph State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphState#getFederation <em>Federation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphState#getLocations <em>Locations</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphState#getContainedToplevelStatechartInstances <em>Contained Toplevel Statechart Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.RtscPackage#getZoneGraphState()
 * @model
 * @generated
 */
public interface ZoneGraphState extends ReachabilityGraphState {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to all Real-Time Statechart instances considered by this zone graph state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.RtscPackage#getZoneGraphState_Locations()
	 * @model
	 * @generated
	 */
	EList<RealtimeStatechartInstance> getLocations();

	/**
	 * Returns the value of the '<em><b>Contained Toplevel Statechart Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the top-level Real-Time Statechart instances considered by this zone graph state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Toplevel Statechart Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.RtscPackage#getZoneGraphState_ContainedToplevelStatechartInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<RealtimeStatechartInstance> getContainedToplevelStatechartInstances();

	/**
	 * Returns the value of the '<em><b>Federation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federation</em>' attribute.
	 * @see #setFederation(Federation)
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.RtscPackage#getZoneGraphState_Federation()
	 * @model dataType="de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.FederationObject" transient="true"
	 * @generated
	 */
	Federation getFederation();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphState#getFederation <em>Federation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federation</em>' attribute.
	 * @see #getFederation()
	 * @generated
	 */
	void setFederation(Federation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Vector<String> locationNames = new Vector<String>();\r\nfor (RealtimeStatechartInstance location : locations) {\r\n\tlocationNames.add(location.getInstanceOf().getName());\r\n}\r\n\r\nString[] locationNamesArray = locationNames.toArray(new String[0]);\r\nArrays.sort(locationNamesArray);\r\n\r\nlocationNames = new Vector<String>();\r\n\r\nfor (String name : locationNamesArray) {\r\n\tlocationNames.add(name);\r\n}\r\n\r\nreturn \"[zone locations:\" + locationNames.toString() + \"; federation:\"\r\n\t+ federation.toString() + \"]\";\r\n'"
	 * @generated
	 */
	String toString();

} // ZoneGraphState
