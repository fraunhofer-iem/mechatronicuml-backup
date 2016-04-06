/**
 */
package org.muml.graphviz.common;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class serves as a base class for all more specific graph
 * classes. It provides one containment for a graph's nodes and another
 * containment for a graph's edges.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.graphviz.common.Graph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.muml.graphviz.common.Graph#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @see org.muml.graphviz.common.CommonPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph<V extends Node, E extends Edge<V>> extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.muml.graphviz.common.CommonPackage#getGraph_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<V> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see org.muml.graphviz.common.CommonPackage#getGraph_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<E> getEdges();

} // Graph
