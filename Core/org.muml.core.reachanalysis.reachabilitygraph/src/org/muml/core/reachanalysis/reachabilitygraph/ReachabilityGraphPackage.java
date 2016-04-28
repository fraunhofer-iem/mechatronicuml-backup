package org.muml.core.reachanalysis.reachabilitygraph;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.mumlcore.CorePackage;

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
 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphFactory
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
	String eNAME = "reachabilitygraph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/core/reachabilitygraph/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reachabilitygraph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReachabilityGraphPackage eINSTANCE = org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.core.reachanalysis.reachabilitygraph.impl.HashToStateListImpl <em>Hash To State List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.HashToStateListImpl
	 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphPackageImpl#getHashToStateList()
	 * @generated
	 */
	int HASH_TO_STATE_LIST = 0;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_TO_STATE_LIST__HASH = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_TO_STATE_LIST__STATES = 1;

	/**
	 * The number of structural features of the '<em>Hash To State List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_TO_STATE_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.muml.core.reachanalysis.reachabilitygraph.impl.HashToStateListMapEntryImpl <em>Hash To State List Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.HashToStateListMapEntryImpl
	 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphPackageImpl#getHashToStateListMapEntry()
	 * @generated
	 */
	int HASH_TO_STATE_LIST_MAP_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_TO_STATE_LIST_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_TO_STATE_LIST_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Hash To State List Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_TO_STATE_LIST_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphImpl <em>Reachability Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphImpl
	 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphPackageImpl#getReachabilityGraph()
	 * @generated
	 */
	int REACHABILITY_GRAPH = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH__STATES = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH__TRANSITIONS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH__START_STATE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>States With Hash</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH__STATES_WITH_HASH = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reachability Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphTransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphTransitionImpl
	 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphPackageImpl#getReachabilityGraphTransition()
	 * @generated
	 */
	int REACHABILITY_GRAPH_TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH_TRANSITION__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH_TRANSITION__SOURCE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH_TRANSITION__TARGET = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reachability Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH_TRANSITION_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ActionTransitionImpl <em>Action Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ActionTransitionImpl
	 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphPackageImpl#getActionTransition()
	 * @generated
	 */
	int ACTION_TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TRANSITION__EXTENSIONS = REACHABILITY_GRAPH_TRANSITION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TRANSITION__SOURCE = REACHABILITY_GRAPH_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TRANSITION__TARGET = REACHABILITY_GRAPH_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Reachability Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TRANSITION__REACHABILITY_GRAPH = REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH;

	/**
	 * The number of structural features of the '<em>Action Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TRANSITION_FEATURE_COUNT = REACHABILITY_GRAPH_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphStateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphStateImpl
	 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphPackageImpl#getReachabilityGraphState()
	 * @generated
	 */
	int REACHABILITY_GRAPH_STATE = 5;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH_STATE__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH_STATE__HASH = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH_STATE__INCOMING_TRANSITIONS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH_STATE__OUTGOING_TRANSITIONS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reachability Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH_STATE__REACHABILITY_GRAPH = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Path Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH_STATE__PATH_DEPTH = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABILITY_GRAPH_STATE_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.muml.core.reachanalysis.reachabilitygraph.HashToStateList <em>Hash To State List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash To State List</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.HashToStateList
	 * @generated
	 */
	EClass getHashToStateList();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.core.reachanalysis.reachabilitygraph.HashToStateList#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.HashToStateList#getHash()
	 * @see #getHashToStateList()
	 * @generated
	 */
	EAttribute getHashToStateList_Hash();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.core.reachanalysis.reachabilitygraph.HashToStateList#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.HashToStateList#getStates()
	 * @see #getHashToStateList()
	 * @generated
	 */
	EReference getHashToStateList_States();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Hash To State List Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash To State List Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.ELongObject"
	 *        valueType="org.muml.core.reachanalysis.reachabilitygraph.HashToStateList"
	 * @generated
	 */
	EClass getHashToStateListMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getHashToStateListMapEntry()
	 * @generated
	 */
	EAttribute getHashToStateListMapEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getHashToStateListMapEntry()
	 * @generated
	 */
	EReference getHashToStateListMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph <em>Reachability Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reachability Graph</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph
	 * @generated
	 */
	EClass getReachabilityGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph#getStates()
	 * @see #getReachabilityGraph()
	 * @generated
	 */
	EReference getReachabilityGraph_States();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph#getTransitions()
	 * @see #getReachabilityGraph()
	 * @generated
	 */
	EReference getReachabilityGraph_Transitions();

	/**
	 * Returns the meta object for the reference '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph#getStartState <em>Start State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start State</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph#getStartState()
	 * @see #getReachabilityGraph()
	 * @generated
	 */
	EReference getReachabilityGraph_StartState();

	/**
	 * Returns the meta object for the map '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph#getStatesWithHash <em>States With Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>States With Hash</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph#getStatesWithHash()
	 * @see #getReachabilityGraph()
	 * @generated
	 */
	EReference getReachabilityGraph_StatesWithHash();

	/**
	 * Returns the meta object for class '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition
	 * @generated
	 */
	EClass getReachabilityGraphTransition();

	/**
	 * Returns the meta object for the reference '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getSource()
	 * @see #getReachabilityGraphTransition()
	 * @generated
	 */
	EReference getReachabilityGraphTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getTarget()
	 * @see #getReachabilityGraphTransition()
	 * @generated
	 */
	EReference getReachabilityGraphTransition_Target();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getReachabilityGraph <em>Reachability Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reachability Graph</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getReachabilityGraph()
	 * @see #getReachabilityGraphTransition()
	 * @generated
	 */
	EReference getReachabilityGraphTransition_ReachabilityGraph();

	/**
	 * Returns the meta object for class '{@link org.muml.core.reachanalysis.reachabilitygraph.ActionTransition <em>Action Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Transition</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ActionTransition
	 * @generated
	 */
	EClass getActionTransition();

	/**
	 * Returns the meta object for class '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState
	 * @generated
	 */
	EClass getReachabilityGraphState();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getHash()
	 * @see #getReachabilityGraphState()
	 * @generated
	 */
	EAttribute getReachabilityGraphState_Hash();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getIncomingTransitions()
	 * @see #getReachabilityGraphState()
	 * @generated
	 */
	EReference getReachabilityGraphState_IncomingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getOutgoingTransitions()
	 * @see #getReachabilityGraphState()
	 * @generated
	 */
	EReference getReachabilityGraphState_OutgoingTransitions();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getReachabilityGraph <em>Reachability Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reachability Graph</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getReachabilityGraph()
	 * @see #getReachabilityGraphState()
	 * @generated
	 */
	EReference getReachabilityGraphState_ReachabilityGraph();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getPathDepth <em>Path Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Depth</em>'.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getPathDepth()
	 * @see #getReachabilityGraphState()
	 * @generated
	 */
	EAttribute getReachabilityGraphState_PathDepth();

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
		 * The meta object literal for the '{@link org.muml.core.reachanalysis.reachabilitygraph.impl.HashToStateListImpl <em>Hash To State List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.HashToStateListImpl
		 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphPackageImpl#getHashToStateList()
		 * @generated
		 */
		EClass HASH_TO_STATE_LIST = eINSTANCE.getHashToStateList();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH_TO_STATE_LIST__HASH = eINSTANCE.getHashToStateList_Hash();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HASH_TO_STATE_LIST__STATES = eINSTANCE.getHashToStateList_States();

		/**
		 * The meta object literal for the '{@link org.muml.core.reachanalysis.reachabilitygraph.impl.HashToStateListMapEntryImpl <em>Hash To State List Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.HashToStateListMapEntryImpl
		 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphPackageImpl#getHashToStateListMapEntry()
		 * @generated
		 */
		EClass HASH_TO_STATE_LIST_MAP_ENTRY = eINSTANCE.getHashToStateListMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH_TO_STATE_LIST_MAP_ENTRY__KEY = eINSTANCE.getHashToStateListMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HASH_TO_STATE_LIST_MAP_ENTRY__VALUE = eINSTANCE.getHashToStateListMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphImpl <em>Reachability Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphImpl
		 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphPackageImpl#getReachabilityGraph()
		 * @generated
		 */
		EClass REACHABILITY_GRAPH = eINSTANCE.getReachabilityGraph();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACHABILITY_GRAPH__STATES = eINSTANCE.getReachabilityGraph_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACHABILITY_GRAPH__TRANSITIONS = eINSTANCE.getReachabilityGraph_Transitions();

		/**
		 * The meta object literal for the '<em><b>Start State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACHABILITY_GRAPH__START_STATE = eINSTANCE.getReachabilityGraph_StartState();

		/**
		 * The meta object literal for the '<em><b>States With Hash</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACHABILITY_GRAPH__STATES_WITH_HASH = eINSTANCE.getReachabilityGraph_StatesWithHash();

		/**
		 * The meta object literal for the '{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphTransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphTransitionImpl
		 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphPackageImpl#getReachabilityGraphTransition()
		 * @generated
		 */
		EClass REACHABILITY_GRAPH_TRANSITION = eINSTANCE.getReachabilityGraphTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACHABILITY_GRAPH_TRANSITION__SOURCE = eINSTANCE.getReachabilityGraphTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACHABILITY_GRAPH_TRANSITION__TARGET = eINSTANCE.getReachabilityGraphTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Reachability Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH = eINSTANCE.getReachabilityGraphTransition_ReachabilityGraph();

		/**
		 * The meta object literal for the '{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ActionTransitionImpl <em>Action Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ActionTransitionImpl
		 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphPackageImpl#getActionTransition()
		 * @generated
		 */
		EClass ACTION_TRANSITION = eINSTANCE.getActionTransition();

		/**
		 * The meta object literal for the '{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphStateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphStateImpl
		 * @see org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphPackageImpl#getReachabilityGraphState()
		 * @generated
		 */
		EClass REACHABILITY_GRAPH_STATE = eINSTANCE.getReachabilityGraphState();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACHABILITY_GRAPH_STATE__HASH = eINSTANCE.getReachabilityGraphState_Hash();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACHABILITY_GRAPH_STATE__INCOMING_TRANSITIONS = eINSTANCE.getReachabilityGraphState_IncomingTransitions();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACHABILITY_GRAPH_STATE__OUTGOING_TRANSITIONS = eINSTANCE.getReachabilityGraphState_OutgoingTransitions();

		/**
		 * The meta object literal for the '<em><b>Reachability Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACHABILITY_GRAPH_STATE__REACHABILITY_GRAPH = eINSTANCE.getReachabilityGraphState_ReachabilityGraph();

		/**
		 * The meta object literal for the '<em><b>Path Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACHABILITY_GRAPH_STATE__PATH_DEPTH = eINSTANCE.getReachabilityGraphState_PathDepth();

	}

} //ReachabilityGraphPackage