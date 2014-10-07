/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.RtscFactory
 * @model kind="package"
 * @generated
 */
public interface RtscPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rtsc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/reachabilityGraph/rtsc/0.4.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RtscPackage eINSTANCE = de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.RtscPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.ZoneGraphImpl <em>Zone Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.ZoneGraphImpl
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.RtscPackageImpl#getZoneGraph()
	 * @generated
	 */
	int ZONE_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH__ANNOTATION = ReachabilityGraphPackage.REACHABILITY_GRAPH__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH__EXTENSION = ReachabilityGraphPackage.REACHABILITY_GRAPH__EXTENSION;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH__STATES = ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH__TRANSITIONS = ReachabilityGraphPackage.REACHABILITY_GRAPH__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Start State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH__START_STATE = ReachabilityGraphPackage.REACHABILITY_GRAPH__START_STATE;

	/**
	 * The feature id for the '<em><b>States With Hash</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH__STATES_WITH_HASH = ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES_WITH_HASH;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH__CLOCKS = ReachabilityGraphPackage.REACHABILITY_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zone Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_FEATURE_COUNT = ReachabilityGraphPackage.REACHABILITY_GRAPH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.ZoneGraphStateImpl <em>Zone Graph State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.ZoneGraphStateImpl
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.RtscPackageImpl#getZoneGraphState()
	 * @generated
	 */
	int ZONE_GRAPH_STATE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_STATE__ANNOTATION = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_STATE__EXTENSION = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_STATE__HASH = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__HASH;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_STATE__INCOMING_TRANSITIONS = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_STATE__OUTGOING_TRANSITIONS = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Reachability Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_STATE__REACHABILITY_GRAPH = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__REACHABILITY_GRAPH;

	/**
	 * The feature id for the '<em><b>Path Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_STATE__PATH_DEPTH = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__PATH_DEPTH;

	/**
	 * The feature id for the '<em><b>Federation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_STATE__FEDERATION = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_STATE__LOCATIONS = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contained Toplevel Statechart Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_STATE__CONTAINED_TOPLEVEL_STATECHART_INSTANCES = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Zone Graph State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_STATE_FEATURE_COUNT = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.ZoneGraphTransitionImpl <em>Zone Graph Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.ZoneGraphTransitionImpl
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.RtscPackageImpl#getZoneGraphTransition()
	 * @generated
	 */
	int ZONE_GRAPH_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_TRANSITION__ANNOTATION = ReachabilityGraphPackage.ACTION_TRANSITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_TRANSITION__EXTENSION = ReachabilityGraphPackage.ACTION_TRANSITION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_TRANSITION__SOURCE = ReachabilityGraphPackage.ACTION_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_TRANSITION__TARGET = ReachabilityGraphPackage.ACTION_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Reachability Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_TRANSITION__REACHABILITY_GRAPH = ReachabilityGraphPackage.ACTION_TRANSITION__REACHABILITY_GRAPH;

	/**
	 * The feature id for the '<em><b>Fired RTSC Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_TRANSITION__FIRED_RTSC_TRANSITIONS = ReachabilityGraphPackage.ACTION_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zone Graph Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_GRAPH_TRANSITION_FEATURE_COUNT = ReachabilityGraphPackage.ACTION_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.DelayTransitionImpl <em>Delay Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.DelayTransitionImpl
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.RtscPackageImpl#getDelayTransition()
	 * @generated
	 */
	int DELAY_TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_TRANSITION__ANNOTATION = ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_TRANSITION__EXTENSION = ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_TRANSITION__SOURCE = ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_TRANSITION__TARGET = ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Reachability Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_TRANSITION__REACHABILITY_GRAPH = ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH;

	/**
	 * The number of structural features of the '<em>Delay Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_TRANSITION_FEATURE_COUNT = ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '<em>Federation Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.udbm.Federation
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.RtscPackageImpl#getFederationObject()
	 * @generated
	 */
	int FEDERATION_OBJECT = 4;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraph <em>Zone Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone Graph</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraph
	 * @generated
	 */
	EClass getZoneGraph();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraph#getClocks <em>Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clocks</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraph#getClocks()
	 * @see #getZoneGraph()
	 * @generated
	 */
	EReference getZoneGraph_Clocks();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphState <em>Zone Graph State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone Graph State</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphState
	 * @generated
	 */
	EClass getZoneGraphState();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphState#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphState#getLocations()
	 * @see #getZoneGraphState()
	 * @generated
	 */
	EReference getZoneGraphState_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphState#getContainedToplevelStatechartInstances <em>Contained Toplevel Statechart Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Toplevel Statechart Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphState#getContainedToplevelStatechartInstances()
	 * @see #getZoneGraphState()
	 * @generated
	 */
	EReference getZoneGraphState_ContainedToplevelStatechartInstances();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphState#getFederation <em>Federation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Federation</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphState#getFederation()
	 * @see #getZoneGraphState()
	 * @generated
	 */
	EAttribute getZoneGraphState_Federation();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphTransition <em>Zone Graph Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone Graph Transition</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphTransition
	 * @generated
	 */
	EClass getZoneGraphTransition();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphTransition#getFiredRTSCTransitions <em>Fired RTSC Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fired RTSC Transitions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphTransition#getFiredRTSCTransitions()
	 * @see #getZoneGraphTransition()
	 * @generated
	 */
	EReference getZoneGraphTransition_FiredRTSCTransitions();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.DelayTransition <em>Delay Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay Transition</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.DelayTransition
	 * @generated
	 */
	EClass getDelayTransition();

	/**
	 * Returns the meta object for data type '{@link de.uni_paderborn.fujaba.udbm.Federation <em>Federation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Federation Object</em>'.
	 * @see de.uni_paderborn.fujaba.udbm.Federation
	 * @model instanceClass="de.uni_paderborn.fujaba.udbm.Federation" serializeable="false"
	 * @generated
	 */
	EDataType getFederationObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RtscFactory getRtscFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.ZoneGraphImpl <em>Zone Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.ZoneGraphImpl
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.RtscPackageImpl#getZoneGraph()
		 * @generated
		 */
		EClass ZONE_GRAPH = eINSTANCE.getZoneGraph();

		/**
		 * The meta object literal for the '<em><b>Clocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_GRAPH__CLOCKS = eINSTANCE.getZoneGraph_Clocks();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.ZoneGraphStateImpl <em>Zone Graph State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.ZoneGraphStateImpl
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.RtscPackageImpl#getZoneGraphState()
		 * @generated
		 */
		EClass ZONE_GRAPH_STATE = eINSTANCE.getZoneGraphState();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_GRAPH_STATE__LOCATIONS = eINSTANCE.getZoneGraphState_Locations();

		/**
		 * The meta object literal for the '<em><b>Contained Toplevel Statechart Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_GRAPH_STATE__CONTAINED_TOPLEVEL_STATECHART_INSTANCES = eINSTANCE.getZoneGraphState_ContainedToplevelStatechartInstances();

		/**
		 * The meta object literal for the '<em><b>Federation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE_GRAPH_STATE__FEDERATION = eINSTANCE.getZoneGraphState_Federation();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.ZoneGraphTransitionImpl <em>Zone Graph Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.ZoneGraphTransitionImpl
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.RtscPackageImpl#getZoneGraphTransition()
		 * @generated
		 */
		EClass ZONE_GRAPH_TRANSITION = eINSTANCE.getZoneGraphTransition();

		/**
		 * The meta object literal for the '<em><b>Fired RTSC Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_GRAPH_TRANSITION__FIRED_RTSC_TRANSITIONS = eINSTANCE.getZoneGraphTransition_FiredRTSCTransitions();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.DelayTransitionImpl <em>Delay Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.DelayTransitionImpl
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.RtscPackageImpl#getDelayTransition()
		 * @generated
		 */
		EClass DELAY_TRANSITION = eINSTANCE.getDelayTransition();

		/**
		 * The meta object literal for the '<em>Federation Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.udbm.Federation
		 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.impl.RtscPackageImpl#getFederationObject()
		 * @generated
		 */
		EDataType FEDERATION_OBJECT = eINSTANCE.getFederationObject();

	}

} //RtscPackage
