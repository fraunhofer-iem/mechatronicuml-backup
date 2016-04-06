/**
 */
package org.muml.graphviz.common;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class serves as a base class for all more specific edge
 * classes. An edge provides references to its source and target node.
 * If the graph is undirected source and target have no special meaning
 * and just provide the references to the endpoints (XXX: this could also
 * be modeled differently (2-element set and if the graph is directed source
 * and target can be derived from this set).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.graphviz.common.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link org.muml.graphviz.common.Edge#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.muml.graphviz.common.CommonPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge<V extends Node> extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see org.muml.graphviz.common.CommonPackage#getEdge_Source()
	 * @model required="true"
	 * @generated
	 */
	V getSource();

	/**
	 * Sets the value of the '{@link org.muml.graphviz.common.Edge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(V value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see org.muml.graphviz.common.CommonPackage#getEdge_Target()
	 * @model required="true"
	 * @generated
	 */
	V getTarget();

	/**
	 * Sets the value of the '{@link org.muml.graphviz.common.Edge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(V value);

} // Edge
