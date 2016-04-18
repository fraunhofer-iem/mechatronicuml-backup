package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage;

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
 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmFactory
 * @model kind="package"
 * @generated
 */
public interface SdmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sdm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/storydiagram.reachanalysis.reachabilitygraph/sdm/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reachabilitygraphsdm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SdmPackage eINSTANCE = org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SdmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.StepGraphImpl <em>Step Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.StepGraphImpl
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SdmPackageImpl#getStepGraph()
	 * @generated
	 */
	int STEP_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_GRAPH__EXTENSIONS = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_GRAPH__HASH = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__HASH;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_GRAPH__INCOMING_TRANSITIONS = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_GRAPH__OUTGOING_TRANSITIONS = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Reachability Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_GRAPH__REACHABILITY_GRAPH = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__REACHABILITY_GRAPH;

	/**
	 * The feature id for the '<em><b>Path Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_GRAPH__PATH_DEPTH = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__PATH_DEPTH;

	/**
	 * The feature id for the '<em><b>Changeable Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_GRAPH__CHANGEABLE_NODES = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_GRAPH__CONTAINS = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unchangeable Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_GRAPH__UNCHANGEABLE_NODES = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contained Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_GRAPH__CONTAINED_NODES = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Step Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_GRAPH_FEATURE_COUNT = ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SDMTransitionImpl <em>SDM Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SDMTransitionImpl
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SdmPackageImpl#getSDMTransition()
	 * @generated
	 */
	int SDM_TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_TRANSITION__EXTENSIONS = ReachabilityGraphPackage.ACTION_TRANSITION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_TRANSITION__SOURCE = ReachabilityGraphPackage.ACTION_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_TRANSITION__TARGET = ReachabilityGraphPackage.ACTION_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Reachability Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_TRANSITION__REACHABILITY_GRAPH = ReachabilityGraphPackage.ACTION_TRANSITION__REACHABILITY_GRAPH;

	/**
	 * The feature id for the '<em><b>Index</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_TRANSITION__INDEX = ReachabilityGraphPackage.ACTION_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applied Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_TRANSITION__APPLIED_ACTIVITY = ReachabilityGraphPackage.ACTION_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Matching</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_TRANSITION__MATCHING = ReachabilityGraphPackage.ACTION_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SDM Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_TRANSITION_FEATURE_COUNT = ReachabilityGraphPackage.ACTION_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.IndexEntryImpl <em>Index Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.IndexEntryImpl
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SdmPackageImpl#getIndexEntry()
	 * @generated
	 */
	int INDEX_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Index Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SuccessorStepGraphsImpl <em>Successor Step Graphs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SuccessorStepGraphsImpl
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SdmPackageImpl#getSuccessorStepGraphs()
	 * @generated
	 */
	int SUCCESSOR_STEP_GRAPHS = 3;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR_STEP_GRAPHS__SUCCESSORS = 0;

	/**
	 * The number of structural features of the '<em>Successor Step Graphs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR_STEP_GRAPHS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.GraphTransformationSystemImpl <em>Graph Transformation System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.GraphTransformationSystemImpl
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SdmPackageImpl#getGraphTransformationSystem()
	 * @generated
	 */
	int GRAPH_TRANSFORMATION_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_TRANSFORMATION_SYSTEM__ACTIVITIES = 0;

	/**
	 * The feature id for the '<em><b>Unchangeable Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_TRANSFORMATION_SYSTEM__UNCHANGEABLE_NODES = 1;

	/**
	 * The number of structural features of the '<em>Graph Transformation System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_TRANSFORMATION_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SDMReachabilityGraphImpl <em>SDM Reachability Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SDMReachabilityGraphImpl
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SdmPackageImpl#getSDMReachabilityGraph()
	 * @generated
	 */
	int SDM_REACHABILITY_GRAPH = 5;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_REACHABILITY_GRAPH__EXTENSIONS = ReachabilityGraphPackage.REACHABILITY_GRAPH__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_REACHABILITY_GRAPH__STATES = ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_REACHABILITY_GRAPH__TRANSITIONS = ReachabilityGraphPackage.REACHABILITY_GRAPH__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Start State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_REACHABILITY_GRAPH__START_STATE = ReachabilityGraphPackage.REACHABILITY_GRAPH__START_STATE;

	/**
	 * The feature id for the '<em><b>States With Hash</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_REACHABILITY_GRAPH__STATES_WITH_HASH = ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES_WITH_HASH;

	/**
	 * The feature id for the '<em><b>Unchangeable Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_REACHABILITY_GRAPH__UNCHANGEABLE_NODES = ReachabilityGraphPackage.REACHABILITY_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained Unchangeable Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_REACHABILITY_GRAPH__CONTAINED_UNCHANGEABLE_NODES = ReachabilityGraphPackage.REACHABILITY_GRAPH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SDM Reachability Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_REACHABILITY_GRAPH_FEATURE_COUNT = ReachabilityGraphPackage.REACHABILITY_GRAPH_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.MatchingEntryImpl <em>Matching Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.MatchingEntryImpl
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SdmPackageImpl#getMatchingEntry()
	 * @generated
	 */
	int MATCHING_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Matching Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_ENTRY_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph <em>Step Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Graph</em>'.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph
	 * @generated
	 */
	EClass getStepGraph();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph#getChangeableNodes <em>Changeable Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changeable Nodes</em>'.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph#getChangeableNodes()
	 * @see #getStepGraph()
	 * @generated
	 */
	EReference getStepGraph_ChangeableNodes();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph#getContains()
	 * @see #getStepGraph()
	 * @generated
	 */
	EReference getStepGraph_Contains();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph#getUnchangeableNodes <em>Unchangeable Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unchangeable Nodes</em>'.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph#getUnchangeableNodes()
	 * @see #getStepGraph()
	 * @generated
	 */
	EReference getStepGraph_UnchangeableNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph#getContainedNodes <em>Contained Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Nodes</em>'.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph#getContainedNodes()
	 * @see #getStepGraph()
	 * @generated
	 */
	EReference getStepGraph_ContainedNodes();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition <em>SDM Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDM Transition</em>'.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition
	 * @generated
	 */
	EClass getSDMTransition();

	/**
	 * Returns the meta object for the map '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Index</em>'.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition#getIndex()
	 * @see #getSDMTransition()
	 * @generated
	 */
	EReference getSDMTransition_Index();

	/**
	 * Returns the meta object for the reference '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition#getAppliedActivity <em>Applied Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applied Activity</em>'.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition#getAppliedActivity()
	 * @see #getSDMTransition()
	 * @generated
	 */
	EReference getSDMTransition_AppliedActivity();

	/**
	 * Returns the meta object for the map '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition#getMatching <em>Matching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Matching</em>'.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition#getMatching()
	 * @see #getSDMTransition()
	 * @generated
	 */
	EReference getSDMTransition_Matching();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Index Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.ecore.EObject"
	 *        valueType="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	EClass getIndexEntry();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIndexEntry()
	 * @generated
	 */
	EReference getIndexEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIndexEntry()
	 * @generated
	 */
	EReference getIndexEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SuccessorStepGraphs <em>Successor Step Graphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Successor Step Graphs</em>'.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SuccessorStepGraphs
	 * @generated
	 */
	EClass getSuccessorStepGraphs();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SuccessorStepGraphs#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SuccessorStepGraphs#getSuccessors()
	 * @see #getSuccessorStepGraphs()
	 * @generated
	 */
	EReference getSuccessorStepGraphs_Successors();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.GraphTransformationSystem <em>Graph Transformation System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Transformation System</em>'.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.GraphTransformationSystem
	 * @generated
	 */
	EClass getGraphTransformationSystem();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.GraphTransformationSystem#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activities</em>'.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.GraphTransformationSystem#getActivities()
	 * @see #getGraphTransformationSystem()
	 * @generated
	 */
	EReference getGraphTransformationSystem_Activities();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.GraphTransformationSystem#getUnchangeableNodes <em>Unchangeable Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unchangeable Nodes</em>'.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.GraphTransformationSystem#getUnchangeableNodes()
	 * @see #getGraphTransformationSystem()
	 * @generated
	 */
	EReference getGraphTransformationSystem_UnchangeableNodes();

	/**
	 * Returns the meta object for class '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph <em>SDM Reachability Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDM Reachability Graph</em>'.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph
	 * @generated
	 */
	EClass getSDMReachabilityGraph();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph#getUnchangeableNodes <em>Unchangeable Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unchangeable Nodes</em>'.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph#getUnchangeableNodes()
	 * @see #getSDMReachabilityGraph()
	 * @generated
	 */
	EReference getSDMReachabilityGraph_UnchangeableNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph#getContainedUnchangeableNodes <em>Contained Unchangeable Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Unchangeable Nodes</em>'.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph#getContainedUnchangeableNodes()
	 * @see #getSDMReachabilityGraph()
	 * @generated
	 */
	EReference getSDMReachabilityGraph_ContainedUnchangeableNodes();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Matching Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matching Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	EClass getMatchingEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMatchingEntry()
	 * @generated
	 */
	EAttribute getMatchingEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMatchingEntry()
	 * @generated
	 */
	EReference getMatchingEntry_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SdmFactory getSdmFactory();

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
		 * The meta object literal for the '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.StepGraphImpl <em>Step Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.StepGraphImpl
		 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SdmPackageImpl#getStepGraph()
		 * @generated
		 */
		EClass STEP_GRAPH = eINSTANCE.getStepGraph();

		/**
		 * The meta object literal for the '<em><b>Changeable Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_GRAPH__CHANGEABLE_NODES = eINSTANCE.getStepGraph_ChangeableNodes();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_GRAPH__CONTAINS = eINSTANCE.getStepGraph_Contains();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_GRAPH__UNCHANGEABLE_NODES = eINSTANCE.getStepGraph_UnchangeableNodes();

		/**
		 * The meta object literal for the '<em><b>Contained Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_GRAPH__CONTAINED_NODES = eINSTANCE.getStepGraph_ContainedNodes();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SDMTransitionImpl <em>SDM Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SDMTransitionImpl
		 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SdmPackageImpl#getSDMTransition()
		 * @generated
		 */
		EClass SDM_TRANSITION = eINSTANCE.getSDMTransition();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDM_TRANSITION__INDEX = eINSTANCE.getSDMTransition_Index();

		/**
		 * The meta object literal for the '<em><b>Applied Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDM_TRANSITION__APPLIED_ACTIVITY = eINSTANCE.getSDMTransition_AppliedActivity();

		/**
		 * The meta object literal for the '<em><b>Matching</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDM_TRANSITION__MATCHING = eINSTANCE.getSDMTransition_Matching();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.IndexEntryImpl <em>Index Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.IndexEntryImpl
		 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SdmPackageImpl#getIndexEntry()
		 * @generated
		 */
		EClass INDEX_ENTRY = eINSTANCE.getIndexEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_ENTRY__KEY = eINSTANCE.getIndexEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_ENTRY__VALUE = eINSTANCE.getIndexEntry_Value();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SuccessorStepGraphsImpl <em>Successor Step Graphs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SuccessorStepGraphsImpl
		 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SdmPackageImpl#getSuccessorStepGraphs()
		 * @generated
		 */
		EClass SUCCESSOR_STEP_GRAPHS = eINSTANCE.getSuccessorStepGraphs();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCCESSOR_STEP_GRAPHS__SUCCESSORS = eINSTANCE.getSuccessorStepGraphs_Successors();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.GraphTransformationSystemImpl <em>Graph Transformation System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.GraphTransformationSystemImpl
		 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SdmPackageImpl#getGraphTransformationSystem()
		 * @generated
		 */
		EClass GRAPH_TRANSFORMATION_SYSTEM = eINSTANCE.getGraphTransformationSystem();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_TRANSFORMATION_SYSTEM__ACTIVITIES = eINSTANCE.getGraphTransformationSystem_Activities();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_TRANSFORMATION_SYSTEM__UNCHANGEABLE_NODES = eINSTANCE.getGraphTransformationSystem_UnchangeableNodes();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SDMReachabilityGraphImpl <em>SDM Reachability Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SDMReachabilityGraphImpl
		 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SdmPackageImpl#getSDMReachabilityGraph()
		 * @generated
		 */
		EClass SDM_REACHABILITY_GRAPH = eINSTANCE.getSDMReachabilityGraph();

		/**
		 * The meta object literal for the '<em><b>Unchangeable Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDM_REACHABILITY_GRAPH__UNCHANGEABLE_NODES = eINSTANCE.getSDMReachabilityGraph_UnchangeableNodes();

		/**
		 * The meta object literal for the '<em><b>Contained Unchangeable Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDM_REACHABILITY_GRAPH__CONTAINED_UNCHANGEABLE_NODES = eINSTANCE.getSDMReachabilityGraph_ContainedUnchangeableNodes();

		/**
		 * The meta object literal for the '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.MatchingEntryImpl <em>Matching Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.MatchingEntryImpl
		 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SdmPackageImpl#getMatchingEntry()
		 * @generated
		 */
		EClass MATCHING_ENTRY = eINSTANCE.getMatchingEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCHING_ENTRY__KEY = eINSTANCE.getMatchingEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHING_ENTRY__VALUE = eINSTANCE.getMatchingEntry_Value();

	}

} //SdmPackage