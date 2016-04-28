/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.core.reachanalysis.reachabilitygraph;

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One state of the ReachabilityGraph. A state represents one run-time state of a
 * system under investigation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getHash <em>Hash</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getReachabilityGraph <em>Reachability Graph</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getPathDepth <em>Path Depth</em>}</li>
 * </ul>
 *
 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getReachabilityGraphState()
 * @model abstract="true"
 * @generated
 */
public interface ReachabilityGraphState extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Hash</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stores the hash value that has been computed for this state. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hash</em>' attribute.
	 * @see #setHash(long)
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getReachabilityGraphState_Hash()
	 * @model default="1"
	 * @generated
	 */
	long getHash();

	/**
	 * Sets the value of the '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getHash <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash</em>' attribute.
	 * @see #getHash()
	 * @generated
	 */
	void setHash(long value);

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition}.
	 * It is bidirectional and its opposite is '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All transitions leading to this state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getReachabilityGraphState_IncomingTransitions()
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ReachabilityGraphTransition> getIncomingTransitions();

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition}.
	 * It is bidirectional and its opposite is '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All transitions originating from this state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getReachabilityGraphState_OutgoingTransitions()
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ReachabilityGraphTransition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Reachability Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ReachabilityGraph this state is contained in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reachability Graph</em>' container reference.
	 * @see #setReachabilityGraph(ReachabilityGraph)
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getReachabilityGraphState_ReachabilityGraph()
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph#getStates
	 * @model opposite="states" transient="false"
	 * @generated
	 */
	ReachabilityGraph getReachabilityGraph();

	/**
	 * Sets the value of the '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getReachabilityGraph <em>Reachability Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reachability Graph</em>' container reference.
	 * @see #getReachabilityGraph()
	 * @generated
	 */
	void setReachabilityGraph(ReachabilityGraph value);

	/**
	 * Returns the value of the '<em><b>Path Depth</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Encodes the length of the path from the root node of the reachability graph to this state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Depth</em>' attribute.
	 * @see #setPathDepth(int)
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getReachabilityGraphState_PathDepth()
	 * @model default="0"
	 * @generated
	 */
	int getPathDepth();

	/**
	 * Sets the value of the '{@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState#getPathDepth <em>Path Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Depth</em>' attribute.
	 * @see #getPathDepth()
	 * @generated
	 */
	void setPathDepth(int value);

} // ReachabilityGraphState
