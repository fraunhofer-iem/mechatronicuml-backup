/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph;

import org.storydriven.core.ExtendableElement;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition#getReachabilityGraph <em>Reachability Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getReachabilityGraphTransition()
 * @model abstract="true"
 * @generated
 */
public interface ReachabilityGraphTransition extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source state of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ReachabilityGraphState)
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getReachabilityGraphTransition_Source()
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState#getOutgoingTransitions
	 * @model opposite="outgoingTransitions"
	 * @generated
	 */
	ReachabilityGraphState getSource();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ReachabilityGraphState value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target state of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ReachabilityGraphState)
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getReachabilityGraphTransition_Target()
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState#getIncomingTransitions
	 * @model opposite="incomingTransitions"
	 * @generated
	 */
	ReachabilityGraphState getTarget();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ReachabilityGraphState value);

	/**
	 * Returns the value of the '<em><b>Reachability Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraph#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ReachabilityGraph in which this transition is contained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reachability Graph</em>' container reference.
	 * @see #setReachabilityGraph(ReachabilityGraph)
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getReachabilityGraphTransition_ReachabilityGraph()
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraph#getTransitions
	 * @model opposite="transitions" transient="false"
	 * @generated
	 */
	ReachabilityGraph getReachabilityGraph();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition#getReachabilityGraph <em>Reachability Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reachability Graph</em>' container reference.
	 * @see #getReachabilityGraph()
	 * @generated
	 */
	void setReachabilityGraph(ReachabilityGraph value);

} // ReachabilityGraphTransition
