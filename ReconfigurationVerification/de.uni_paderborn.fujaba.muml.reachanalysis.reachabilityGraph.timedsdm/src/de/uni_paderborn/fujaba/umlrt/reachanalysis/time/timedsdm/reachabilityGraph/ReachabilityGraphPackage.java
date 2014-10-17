/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.sdm.SdmPackage;

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
 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.ReachabilityGraphFactory
 * @model kind="package"
 * @generated
 */
public interface ReachabilityGraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reachabilityGraph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de/uni_paderborn/fujaba/umlrt/reachanalysis/time/timedsdm/reachabilityGraph";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reachabilityGraph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReachabilityGraphPackage eINSTANCE = de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.ReachabilityGraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.TimedStepGraphImpl <em>Timed Step Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.TimedStepGraphImpl
	 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.ReachabilityGraphPackageImpl#getTimedStepGraph()
	 * @generated
	 */
	int TIMED_STEP_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STEP_GRAPH__ANNOTATION = SdmPackage.STEP_GRAPH__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STEP_GRAPH__EXTENSION = SdmPackage.STEP_GRAPH__EXTENSION;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STEP_GRAPH__HASH = SdmPackage.STEP_GRAPH__HASH;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STEP_GRAPH__INCOMING_TRANSITIONS = SdmPackage.STEP_GRAPH__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STEP_GRAPH__OUTGOING_TRANSITIONS = SdmPackage.STEP_GRAPH__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Reachability Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STEP_GRAPH__REACHABILITY_GRAPH = SdmPackage.STEP_GRAPH__REACHABILITY_GRAPH;

	/**
	 * The feature id for the '<em><b>Path Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STEP_GRAPH__PATH_DEPTH = SdmPackage.STEP_GRAPH__PATH_DEPTH;

	/**
	 * The feature id for the '<em><b>Changeable Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STEP_GRAPH__CHANGEABLE_NODES = SdmPackage.STEP_GRAPH__CHANGEABLE_NODES;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STEP_GRAPH__CONTAINS = SdmPackage.STEP_GRAPH__CONTAINS;

	/**
	 * The feature id for the '<em><b>Unchangeable Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STEP_GRAPH__UNCHANGEABLE_NODES = SdmPackage.STEP_GRAPH__UNCHANGEABLE_NODES;

	/**
	 * The feature id for the '<em><b>Contained Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STEP_GRAPH__CONTAINED_NODES = SdmPackage.STEP_GRAPH__CONTAINED_NODES;

	/**
	 * The feature id for the '<em><b>Clock Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STEP_GRAPH__CLOCK_INSTANCES = SdmPackage.STEP_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Federation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STEP_GRAPH__FEDERATION = SdmPackage.STEP_GRAPH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timed Step Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STEP_GRAPH_FEATURE_COUNT = SdmPackage.STEP_GRAPH_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.TimedGTSDelayTransitionImpl <em>Timed GTS Delay Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.TimedGTSDelayTransitionImpl
	 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.ReachabilityGraphPackageImpl#getTimedGTSDelayTransition()
	 * @generated
	 */
	int TIMED_GTS_DELAY_TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_GTS_DELAY_TRANSITION__ANNOTATION = de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_GTS_DELAY_TRANSITION__EXTENSION = de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_GTS_DELAY_TRANSITION__SOURCE = de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_GTS_DELAY_TRANSITION__TARGET = de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Reachability Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_GTS_DELAY_TRANSITION__REACHABILITY_GRAPH = de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH;

	/**
	 * The number of structural features of the '<em>Timed GTS Delay Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_GTS_DELAY_TRANSITION_FEATURE_COUNT = de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '<em>Federation Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.udbm.Federation
	 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.ReachabilityGraphPackageImpl#getFederationObject()
	 * @generated
	 */
	int FEDERATION_OBJECT = 2;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.TimedStepGraph <em>Timed Step Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Step Graph</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.TimedStepGraph
	 * @generated
	 */
	EClass getTimedStepGraph();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.TimedStepGraph#getClockInstances <em>Clock Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clock Instances</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.TimedStepGraph#getClockInstances()
	 * @see #getTimedStepGraph()
	 * @generated
	 */
	EReference getTimedStepGraph_ClockInstances();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.TimedStepGraph#getFederation <em>Federation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Federation</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.TimedStepGraph#getFederation()
	 * @see #getTimedStepGraph()
	 * @generated
	 */
	EAttribute getTimedStepGraph_Federation();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.TimedGTSDelayTransition <em>Timed GTS Delay Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed GTS Delay Transition</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.TimedGTSDelayTransition
	 * @generated
	 */
	EClass getTimedGTSDelayTransition();

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
	ReachabilityGraphFactory getReachabilityGraphFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.TimedStepGraphImpl <em>Timed Step Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.TimedStepGraphImpl
		 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.ReachabilityGraphPackageImpl#getTimedStepGraph()
		 * @generated
		 */
		EClass TIMED_STEP_GRAPH = eINSTANCE.getTimedStepGraph();

		/**
		 * The meta object literal for the '<em><b>Clock Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_STEP_GRAPH__CLOCK_INSTANCES = eINSTANCE.getTimedStepGraph_ClockInstances();

		/**
		 * The meta object literal for the '<em><b>Federation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_STEP_GRAPH__FEDERATION = eINSTANCE.getTimedStepGraph_Federation();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.TimedGTSDelayTransitionImpl <em>Timed GTS Delay Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.TimedGTSDelayTransitionImpl
		 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.ReachabilityGraphPackageImpl#getTimedGTSDelayTransition()
		 * @generated
		 */
		EClass TIMED_GTS_DELAY_TRANSITION = eINSTANCE.getTimedGTSDelayTransition();

		/**
		 * The meta object literal for the '<em>Federation Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.udbm.Federation
		 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.ReachabilityGraphPackageImpl#getFederationObject()
		 * @generated
		 */
		EDataType FEDERATION_OBJECT = eINSTANCE.getFederationObject();

	}

} //ReachabilityGraphPackage
