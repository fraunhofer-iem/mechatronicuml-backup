/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage;

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
 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonFactory
 * @model kind="package"
 * @generated
 */
public interface GtautomatonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gtautomaton";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/reconfigurationverification/reachanalysis/reachabilitygraph/gtautomaton/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gtautomaton";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GtautomatonPackage eINSTANCE = org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtStepGraphImpl <em>Gt Step Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtStepGraphImpl
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonPackageImpl#getGtStepGraph()
	 * @generated
	 */
	int GT_STEP_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_STEP_GRAPH__EXTENSIONS = SdmPackage.STEP_GRAPH__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_STEP_GRAPH__HASH = SdmPackage.STEP_GRAPH__HASH;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_STEP_GRAPH__INCOMING_TRANSITIONS = SdmPackage.STEP_GRAPH__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_STEP_GRAPH__OUTGOING_TRANSITIONS = SdmPackage.STEP_GRAPH__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Reachability Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_STEP_GRAPH__REACHABILITY_GRAPH = SdmPackage.STEP_GRAPH__REACHABILITY_GRAPH;

	/**
	 * The feature id for the '<em><b>Path Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_STEP_GRAPH__PATH_DEPTH = SdmPackage.STEP_GRAPH__PATH_DEPTH;

	/**
	 * The feature id for the '<em><b>Changeable Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_STEP_GRAPH__CHANGEABLE_NODES = SdmPackage.STEP_GRAPH__CHANGEABLE_NODES;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_STEP_GRAPH__CONTAINS = SdmPackage.STEP_GRAPH__CONTAINS;

	/**
	 * The feature id for the '<em><b>Unchangeable Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_STEP_GRAPH__UNCHANGEABLE_NODES = SdmPackage.STEP_GRAPH__UNCHANGEABLE_NODES;

	/**
	 * The feature id for the '<em><b>Contained Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_STEP_GRAPH__CONTAINED_NODES = SdmPackage.STEP_GRAPH__CONTAINED_NODES;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_STEP_GRAPH__INVARIANT = SdmPackage.STEP_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_STEP_GRAPH__OBJECT_IDENTIFIER = SdmPackage.STEP_GRAPH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clock Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_STEP_GRAPH__CLOCK_INSTANCES = SdmPackage.STEP_GRAPH_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gt Step Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_STEP_GRAPH_FEATURE_COUNT = SdmPackage.STEP_GRAPH_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.ObjectIdentifierImpl <em>Object Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.ObjectIdentifierImpl
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonPackageImpl#getObjectIdentifier()
	 * @generated
	 */
	int OBJECT_IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Identifier To EObject</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_IDENTIFIER__IDENTIFIER_TO_EOBJECT = 0;

	/**
	 * The feature id for the '<em><b>EObject To Identifier</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_IDENTIFIER__EOBJECT_TO_IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Free Clock Instance Identifiers</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_IDENTIFIER__FREE_CLOCK_INSTANCE_IDENTIFIERS = 2;

	/**
	 * The number of structural features of the '<em>Object Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_IDENTIFIER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.EObjectToIdentifierImpl <em>EObject To Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.EObjectToIdentifierImpl
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonPackageImpl#getEObjectToIdentifier()
	 * @generated
	 */
	int EOBJECT_TO_IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TO_IDENTIFIER__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TO_IDENTIFIER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EObject To Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TO_IDENTIFIER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.IdentifierToEObjectImpl <em>Identifier To EObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.IdentifierToEObjectImpl
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonPackageImpl#getIdentifierToEObject()
	 * @generated
	 */
	int IDENTIFIER_TO_EOBJECT = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_TO_EOBJECT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_TO_EOBJECT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Identifier To EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_TO_EOBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonTransitionImpl <em>Gt Automaton Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonTransitionImpl
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonPackageImpl#getGtAutomatonTransition()
	 * @generated
	 */
	int GT_AUTOMATON_TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON_TRANSITION__EXTENSIONS = SdmPackage.SDM_TRANSITION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON_TRANSITION__SOURCE = SdmPackage.SDM_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON_TRANSITION__TARGET = SdmPackage.SDM_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Reachability Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON_TRANSITION__REACHABILITY_GRAPH = SdmPackage.SDM_TRANSITION__REACHABILITY_GRAPH;

	/**
	 * The feature id for the '<em><b>Index</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON_TRANSITION__INDEX = SdmPackage.SDM_TRANSITION__INDEX;

	/**
	 * The feature id for the '<em><b>Applied Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON_TRANSITION__APPLIED_ACTIVITY = SdmPackage.SDM_TRANSITION__APPLIED_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Matching</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON_TRANSITION__MATCHING = SdmPackage.SDM_TRANSITION__MATCHING;

	/**
	 * The feature id for the '<em><b>Time Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON_TRANSITION__TIME_GUARDS = SdmPackage.SDM_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clock Resets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON_TRANSITION__CLOCK_RESETS = SdmPackage.SDM_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gt Automaton Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON_TRANSITION_FEATURE_COUNT = SdmPackage.SDM_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonClockConstraintImpl <em>Gt Automaton Clock Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonClockConstraintImpl
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonPackageImpl#getGtAutomatonClockConstraint()
	 * @generated
	 */
	int GT_AUTOMATON_CLOCK_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Clock Instance Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON_CLOCK_CONSTRAINT__CLOCK_INSTANCE_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON_CLOCK_CONSTRAINT__OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON_CLOCK_CONSTRAINT__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Gt Automaton Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON_CLOCK_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonImpl <em>Gt Automaton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonImpl
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonPackageImpl#getGtAutomaton()
	 * @generated
	 */
	int GT_AUTOMATON = 6;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON__EXTENSIONS = SdmPackage.SDM_REACHABILITY_GRAPH__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON__STATES = SdmPackage.SDM_REACHABILITY_GRAPH__STATES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON__TRANSITIONS = SdmPackage.SDM_REACHABILITY_GRAPH__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Start State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON__START_STATE = SdmPackage.SDM_REACHABILITY_GRAPH__START_STATE;

	/**
	 * The feature id for the '<em><b>States With Hash</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON__STATES_WITH_HASH = SdmPackage.SDM_REACHABILITY_GRAPH__STATES_WITH_HASH;

	/**
	 * The feature id for the '<em><b>Unchangeable Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON__UNCHANGEABLE_NODES = SdmPackage.SDM_REACHABILITY_GRAPH__UNCHANGEABLE_NODES;

	/**
	 * The feature id for the '<em><b>Contained Unchangeable Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON__CONTAINED_UNCHANGEABLE_NODES = SdmPackage.SDM_REACHABILITY_GRAPH__CONTAINED_UNCHANGEABLE_NODES;

	/**
	 * The feature id for the '<em><b>Clock Instance Identifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON__CLOCK_INSTANCE_IDENTIFIERS = SdmPackage.SDM_REACHABILITY_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gt Automaton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_AUTOMATON_FEATURE_COUNT = SdmPackage.SDM_REACHABILITY_GRAPH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.ClockInstanceStoryDiagramToIdentifierImpl <em>Clock Instance Story Diagram To Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.ClockInstanceStoryDiagramToIdentifierImpl
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonPackageImpl#getClockInstanceStoryDiagramToIdentifier()
	 * @generated
	 */
	int CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Clock Instance Story Diagram To Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph <em>Gt Step Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gt Step Graph</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph
	 * @generated
	 */
	EClass getGtStepGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph#getInvariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invariant</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph#getInvariant()
	 * @see #getGtStepGraph()
	 * @generated
	 */
	EReference getGtStepGraph_Invariant();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph#getObjectIdentifier <em>Object Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Identifier</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph#getObjectIdentifier()
	 * @see #getGtStepGraph()
	 * @generated
	 */
	EReference getGtStepGraph_ObjectIdentifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph#getClockInstances <em>Clock Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clock Instances</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph#getClockInstances()
	 * @see #getGtStepGraph()
	 * @generated
	 */
	EReference getGtStepGraph_ClockInstances();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier <em>Object Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Identifier</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier
	 * @generated
	 */
	EClass getObjectIdentifier();

	/**
	 * Returns the meta object for the map '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier#getIdentifierToEObject <em>Identifier To EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Identifier To EObject</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier#getIdentifierToEObject()
	 * @see #getObjectIdentifier()
	 * @generated
	 */
	EReference getObjectIdentifier_IdentifierToEObject();

	/**
	 * Returns the meta object for the map '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier#getEObjectToIdentifier <em>EObject To Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>EObject To Identifier</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier#getEObjectToIdentifier()
	 * @see #getObjectIdentifier()
	 * @generated
	 */
	EReference getObjectIdentifier_EObjectToIdentifier();

	/**
	 * Returns the meta object for the map '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier#getFreeClockInstanceIdentifiers <em>Free Clock Instance Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Free Clock Instance Identifiers</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier#getFreeClockInstanceIdentifiers()
	 * @see #getObjectIdentifier()
	 * @generated
	 */
	EReference getObjectIdentifier_FreeClockInstanceIdentifiers();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EObject To Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject To Identifier</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.ecore.EObject"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getEObjectToIdentifier();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEObjectToIdentifier()
	 * @generated
	 */
	EReference getEObjectToIdentifier_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEObjectToIdentifier()
	 * @generated
	 */
	EAttribute getEObjectToIdentifier_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Identifier To EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier To EObject</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	EClass getIdentifierToEObject();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIdentifierToEObject()
	 * @generated
	 */
	EAttribute getIdentifierToEObject_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIdentifierToEObject()
	 * @generated
	 */
	EReference getIdentifierToEObject_Value();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonTransition <em>Gt Automaton Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gt Automaton Transition</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonTransition
	 * @generated
	 */
	EClass getGtAutomatonTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonTransition#getTimeGuards <em>Time Guards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Guards</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonTransition#getTimeGuards()
	 * @see #getGtAutomatonTransition()
	 * @generated
	 */
	EReference getGtAutomatonTransition_TimeGuards();

	/**
	 * Returns the meta object for the attribute list '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonTransition#getClockResets <em>Clock Resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Clock Resets</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonTransition#getClockResets()
	 * @see #getGtAutomatonTransition()
	 * @generated
	 */
	EAttribute getGtAutomatonTransition_ClockResets();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint <em>Gt Automaton Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gt Automaton Clock Constraint</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint
	 * @generated
	 */
	EClass getGtAutomatonClockConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint#getClockInstanceIdentifier <em>Clock Instance Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock Instance Identifier</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint#getClockInstanceIdentifier()
	 * @see #getGtAutomatonClockConstraint()
	 * @generated
	 */
	EAttribute getGtAutomatonClockConstraint_ClockInstanceIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint#getOperator()
	 * @see #getGtAutomatonClockConstraint()
	 * @generated
	 */
	EAttribute getGtAutomatonClockConstraint_Operator();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint#getValue()
	 * @see #getGtAutomatonClockConstraint()
	 * @generated
	 */
	EAttribute getGtAutomatonClockConstraint_Value();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomaton <em>Gt Automaton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gt Automaton</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomaton
	 * @generated
	 */
	EClass getGtAutomaton();

	/**
	 * Returns the meta object for the attribute list '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomaton#getClockInstanceIdentifiers <em>Clock Instance Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Clock Instance Identifiers</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomaton#getClockInstanceIdentifiers()
	 * @see #getGtAutomaton()
	 * @generated
	 */
	EAttribute getGtAutomaton_ClockInstanceIdentifiers();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Clock Instance Story Diagram To Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Instance Story Diagram To Identifier</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceStoryDiagram"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueMany="true"
	 * @generated
	 */
	EClass getClockInstanceStoryDiagramToIdentifier();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getClockInstanceStoryDiagramToIdentifier()
	 * @generated
	 */
	EReference getClockInstanceStoryDiagramToIdentifier_Key();

	/**
	 * Returns the meta object for the attribute list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getClockInstanceStoryDiagramToIdentifier()
	 * @generated
	 */
	EAttribute getClockInstanceStoryDiagramToIdentifier_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GtautomatonFactory getGtautomatonFactory();

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
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtStepGraphImpl <em>Gt Step Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtStepGraphImpl
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonPackageImpl#getGtStepGraph()
		 * @generated
		 */
		EClass GT_STEP_GRAPH = eINSTANCE.getGtStepGraph();

		/**
		 * The meta object literal for the '<em><b>Invariant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GT_STEP_GRAPH__INVARIANT = eINSTANCE.getGtStepGraph_Invariant();

		/**
		 * The meta object literal for the '<em><b>Object Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GT_STEP_GRAPH__OBJECT_IDENTIFIER = eINSTANCE.getGtStepGraph_ObjectIdentifier();

		/**
		 * The meta object literal for the '<em><b>Clock Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GT_STEP_GRAPH__CLOCK_INSTANCES = eINSTANCE.getGtStepGraph_ClockInstances();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.ObjectIdentifierImpl <em>Object Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.ObjectIdentifierImpl
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonPackageImpl#getObjectIdentifier()
		 * @generated
		 */
		EClass OBJECT_IDENTIFIER = eINSTANCE.getObjectIdentifier();

		/**
		 * The meta object literal for the '<em><b>Identifier To EObject</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_IDENTIFIER__IDENTIFIER_TO_EOBJECT = eINSTANCE.getObjectIdentifier_IdentifierToEObject();

		/**
		 * The meta object literal for the '<em><b>EObject To Identifier</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_IDENTIFIER__EOBJECT_TO_IDENTIFIER = eINSTANCE.getObjectIdentifier_EObjectToIdentifier();

		/**
		 * The meta object literal for the '<em><b>Free Clock Instance Identifiers</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_IDENTIFIER__FREE_CLOCK_INSTANCE_IDENTIFIERS = eINSTANCE.getObjectIdentifier_FreeClockInstanceIdentifiers();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.EObjectToIdentifierImpl <em>EObject To Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.EObjectToIdentifierImpl
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonPackageImpl#getEObjectToIdentifier()
		 * @generated
		 */
		EClass EOBJECT_TO_IDENTIFIER = eINSTANCE.getEObjectToIdentifier();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOBJECT_TO_IDENTIFIER__KEY = eINSTANCE.getEObjectToIdentifier_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOBJECT_TO_IDENTIFIER__VALUE = eINSTANCE.getEObjectToIdentifier_Value();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.IdentifierToEObjectImpl <em>Identifier To EObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.IdentifierToEObjectImpl
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonPackageImpl#getIdentifierToEObject()
		 * @generated
		 */
		EClass IDENTIFIER_TO_EOBJECT = eINSTANCE.getIdentifierToEObject();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER_TO_EOBJECT__KEY = eINSTANCE.getIdentifierToEObject_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER_TO_EOBJECT__VALUE = eINSTANCE.getIdentifierToEObject_Value();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonTransitionImpl <em>Gt Automaton Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonTransitionImpl
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonPackageImpl#getGtAutomatonTransition()
		 * @generated
		 */
		EClass GT_AUTOMATON_TRANSITION = eINSTANCE.getGtAutomatonTransition();

		/**
		 * The meta object literal for the '<em><b>Time Guards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GT_AUTOMATON_TRANSITION__TIME_GUARDS = eINSTANCE.getGtAutomatonTransition_TimeGuards();

		/**
		 * The meta object literal for the '<em><b>Clock Resets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GT_AUTOMATON_TRANSITION__CLOCK_RESETS = eINSTANCE.getGtAutomatonTransition_ClockResets();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonClockConstraintImpl <em>Gt Automaton Clock Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonClockConstraintImpl
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonPackageImpl#getGtAutomatonClockConstraint()
		 * @generated
		 */
		EClass GT_AUTOMATON_CLOCK_CONSTRAINT = eINSTANCE.getGtAutomatonClockConstraint();

		/**
		 * The meta object literal for the '<em><b>Clock Instance Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GT_AUTOMATON_CLOCK_CONSTRAINT__CLOCK_INSTANCE_IDENTIFIER = eINSTANCE.getGtAutomatonClockConstraint_ClockInstanceIdentifier();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GT_AUTOMATON_CLOCK_CONSTRAINT__OPERATOR = eINSTANCE.getGtAutomatonClockConstraint_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GT_AUTOMATON_CLOCK_CONSTRAINT__VALUE = eINSTANCE.getGtAutomatonClockConstraint_Value();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonImpl <em>Gt Automaton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonImpl
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonPackageImpl#getGtAutomaton()
		 * @generated
		 */
		EClass GT_AUTOMATON = eINSTANCE.getGtAutomaton();

		/**
		 * The meta object literal for the '<em><b>Clock Instance Identifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GT_AUTOMATON__CLOCK_INSTANCE_IDENTIFIERS = eINSTANCE.getGtAutomaton_ClockInstanceIdentifiers();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.ClockInstanceStoryDiagramToIdentifierImpl <em>Clock Instance Story Diagram To Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.ClockInstanceStoryDiagramToIdentifierImpl
		 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonPackageImpl#getClockInstanceStoryDiagramToIdentifier()
		 * @generated
		 */
		EClass CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER = eINSTANCE.getClockInstanceStoryDiagramToIdentifier();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER__KEY = eINSTANCE.getClockInstanceStoryDiagramToIdentifier_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER__VALUE = eINSTANCE.getClockInstanceStoryDiagramToIdentifier_Value();

	}

} //GtautomatonPackage
