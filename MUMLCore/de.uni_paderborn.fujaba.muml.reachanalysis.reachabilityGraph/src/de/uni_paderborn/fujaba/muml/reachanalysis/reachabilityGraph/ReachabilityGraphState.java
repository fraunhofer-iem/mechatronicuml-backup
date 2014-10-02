/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.ExtendableElement;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState#getHash <em>Hash</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState#getReachabilityGraph <em>Reachability Graph</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState#getPathDepth <em>Path Depth</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getReachabilityGraphState()
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
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getReachabilityGraphState_Hash()
	 * @model default="1"
	 * @generated
	 */
	long getHash();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState#getHash <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash</em>' attribute.
	 * @see #getHash()
	 * @generated
	 */
	void setHash(long value);

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All transitions leading to this state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getReachabilityGraphState_IncomingTransitions()
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ReachabilityGraphTransition> getIncomingTransitions();

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All transitions originating from this state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getReachabilityGraphState_OutgoingTransitions()
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphTransition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ReachabilityGraphTransition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Reachability Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraph#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ReachabilityGraph this state is contained in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reachability Graph</em>' container reference.
	 * @see #setReachabilityGraph(ReachabilityGraph)
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getReachabilityGraphState_ReachabilityGraph()
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraph#getStates
	 * @model opposite="states" transient="false"
	 * @generated
	 */
	ReachabilityGraph getReachabilityGraph();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState#getReachabilityGraph <em>Reachability Graph</em>}' container reference.
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
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getReachabilityGraphState_PathDepth()
	 * @model default="0"
	 * @generated
	 */
	int getPathDepth();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState#getPathDepth <em>Path Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Depth</em>' attribute.
	 * @see #getPathDepth()
	 * @generated
	 */
	void setPathDepth(int value);

} // ReachabilityGraphState
