/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.verification.sdd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.verification.sdd.Edge#getSourceNode <em>Source Node</em>}</li>
 *   <li>{@link org.muml.storydiagram.verification.sdd.Edge#getTargetNode <em>Target Node</em>}</li>
 *   <li>{@link org.muml.storydiagram.verification.sdd.Edge#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.verification.sdd.SDDPackage#getEdge()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noSelfEdge'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL noSelfEdge='sourceNode <> targetNode'"
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.verification.sdd.Node#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Node</em>' reference.
	 * @see #setSourceNode(Node)
	 * @see org.muml.storydiagram.verification.sdd.SDDPackage#getEdge_SourceNode()
	 * @see org.muml.storydiagram.verification.sdd.Node#getOutgoingEdges
	 * @model opposite="outgoingEdges" required="true"
	 * @generated
	 */
	Node getSourceNode();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.verification.sdd.Edge#getSourceNode <em>Source Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Node</em>' reference.
	 * @see #getSourceNode()
	 * @generated
	 */
	void setSourceNode(Node value);

	/**
	 * Returns the value of the '<em><b>Target Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.verification.sdd.Node#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Node</em>' reference.
	 * @see #setTargetNode(Node)
	 * @see org.muml.storydiagram.verification.sdd.SDDPackage#getEdge_TargetNode()
	 * @see org.muml.storydiagram.verification.sdd.Node#getIncomingEdges
	 * @model opposite="incomingEdges" required="true"
	 * @generated
	 */
	Node getTargetNode();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.verification.sdd.Edge#getTargetNode <em>Target Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Node</em>' reference.
	 * @see #getTargetNode()
	 * @generated
	 */
	void setTargetNode(Node value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.storydiagram.verification.sdd.EdgeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.muml.storydiagram.verification.sdd.EdgeType
	 * @see #setType(EdgeType)
	 * @see org.muml.storydiagram.verification.sdd.SDDPackage#getEdge_Type()
	 * @model required="true"
	 * @generated
	 */
	EdgeType getType();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.verification.sdd.Edge#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.muml.storydiagram.verification.sdd.EdgeType
	 * @see #getType()
	 * @generated
	 */
	void setType(EdgeType value);

} // Edge
