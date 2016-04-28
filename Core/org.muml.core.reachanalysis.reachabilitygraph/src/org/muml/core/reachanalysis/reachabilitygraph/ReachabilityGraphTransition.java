/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.core.reachanalysis.reachabilitygraph;

import org.muml.mumlcore.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One transition of the ReachabilityGraph, connects two states of the graph.
 * This class is intended to be subclassed if the transition has to carry additional
 * information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getSource <em>Source</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getReachabilityGraph <em>Reachability Graph</em>}</li>
 * </ul>
 *
 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getReachabilityGraphTransition()
 * @model abstract="true"
 * @generated
 */
public interface ReachabilityGraphTransition extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source state of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ReachabilityGraphState)
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getReachabilityGraphTransition_Source()
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getOutgoingTransitions
	 * @model opposite="outgoingTransitions"
	 * @generated
	 */
	ReachabilityGraphState getSource();

	/**
	 * Sets the value of the '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ReachabilityGraphState value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target state of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ReachabilityGraphState)
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getReachabilityGraphTransition_Target()
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getIncomingTransitions
	 * @model opposite="incomingTransitions"
	 * @generated
	 */
	ReachabilityGraphState getTarget();

	/**
	 * Sets the value of the '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ReachabilityGraphState value);

	/**
	 * Returns the value of the '<em><b>Reachability Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ReachabilityGraph in which this transition is contained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reachability Graph</em>' container reference.
	 * @see #setReachabilityGraph(ReachabilityGraph)
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getReachabilityGraphTransition_ReachabilityGraph()
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph#getTransitions
	 * @model opposite="transitions" transient="false"
	 * @generated
	 */
	ReachabilityGraph getReachabilityGraph();

	/**
	 * Sets the value of the '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getReachabilityGraph <em>Reachability Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reachability Graph</em>' container reference.
	 * @see #getReachabilityGraph()
	 * @generated
	 */
	void setReachabilityGraph(ReachabilityGraph value);

} // ReachabilityGraphTransition
