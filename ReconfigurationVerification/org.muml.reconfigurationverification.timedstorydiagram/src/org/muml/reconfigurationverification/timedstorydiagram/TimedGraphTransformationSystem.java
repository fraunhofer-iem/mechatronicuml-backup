/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.muml.core.NamedElement;
import org.muml.storydiagram.activities.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Graph Transformation System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A timed graph transformation system consists of a set of timed graph 
 * transformation rules, a set of invariant rules, a set of clock instance rules, and
 * a set of object that constitute the initial graph.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem#getRules <em>Rules</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem#getClockInstanceRules <em>Clock Instance Rules</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem#getInitialGraphObjects <em>Initial Graph Objects</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem#getUnchangeableNodes <em>Unchangeable Nodes</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem#getHelperStoryDiagrams <em>Helper Story Diagrams</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem#getTypeGraphObjects <em>Type Graph Objects</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getTimedGraphTransformationSystem()
 * @model
 * @generated
 */
public interface TimedGraphTransformationSystem extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the timed story diagram rules of the timed graph transformation system.
	 * They define how the timed graph may be changed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getTimedGraphTransformationSystem_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimedStoryDiagram> getRules();

	/**
	 * Returns the value of the '<em><b>Invariants</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfigurationverification.timedstorydiagram.InvariantStoryDiagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the invariant rules of the timed graph transformation system.
	 * They define how long a particular subgraph may be contained in the timed graph.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invariants</em>' containment reference list.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getTimedGraphTransformationSystem_Invariants()
	 * @model containment="true"
	 * @generated
	 */
	EList<InvariantStoryDiagram> getInvariants();

	/**
	 * Returns the value of the '<em><b>Clock Instance Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceStoryDiagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Instance Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the clock instance rules of the timed graph transformation system.
	 * They add clock instances to the timed graph.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Instance Rules</em>' containment reference list.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getTimedGraphTransformationSystem_ClockInstanceRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClockInstanceStoryDiagram> getClockInstanceRules();

	/**
	 * Returns the value of the '<em><b>Initial Graph Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The objects constituting the initial graph of this timed graph transformation system.
	 * This reference only contains those objects that are not contained elsewhere. 
	 * All objects recursively contained in those objects are considered to be part of
	 * the initial graph as well.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Graph Objects</em>' containment reference list.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getTimedGraphTransformationSystem_InitialGraphObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getInitialGraphObjects();

	/**
	 * Returns the value of the '<em><b>Unchangeable Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unchangeable Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unchangeable Nodes</em>' reference list.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getTimedGraphTransformationSystem_UnchangeableNodes()
	 * @model
	 * @generated
	 */
	EList<EClass> getUnchangeableNodes();

	/**
	 * Returns the value of the '<em><b>Helper Story Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.storydiagram.activities.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a set of helper story diagrams that are called by activity call nodes from
	 * the timed graph transformation rules. The story diagrams contained in this 
	 * reference are not intended to be executed directly on the timed graph, but only
	 * after being invoked by a rule. This reference only contains those helper
	 * story diagrams that are not contained in other resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Helper Story Diagrams</em>' containment reference list.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getTimedGraphTransformationSystem_HelperStoryDiagrams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getHelperStoryDiagrams();

	/**
	 * Returns the value of the '<em><b>Type Graph Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The objects constituting the type graph of this timed graph transformation system.
	 * This reference only contains those objects that are not contained elsewhere. 
	 * All objects recursively contained in those objects are considered to be part of
	 * the type graph as well.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Graph Objects</em>' containment reference list.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getTimedGraphTransformationSystem_TypeGraphObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getTypeGraphObjects();

} // TimedGraphTransformationSystem
