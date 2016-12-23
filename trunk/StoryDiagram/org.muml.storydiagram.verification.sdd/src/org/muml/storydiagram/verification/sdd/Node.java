/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.verification.sdd;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.verification.sdd.Node#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link org.muml.storydiagram.verification.sdd.Node#getIncomingEdges <em>Incoming Edges</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.verification.sdd.SDDPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing Edges</b></em>' reference list.
	 * The list contents are of type {@link org.muml.storydiagram.verification.sdd.Edge}.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.verification.sdd.Edge#getSourceNode <em>Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edges</em>' reference list.
	 * @see org.muml.storydiagram.verification.sdd.SDDPackage#getNode_OutgoingEdges()
	 * @see org.muml.storydiagram.verification.sdd.Edge#getSourceNode
	 * @model opposite="sourceNode"
	 * @generated
	 */
	EList<Edge> getOutgoingEdges();

	/**
	 * Returns the value of the '<em><b>Incoming Edges</b></em>' reference list.
	 * The list contents are of type {@link org.muml.storydiagram.verification.sdd.Edge}.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.verification.sdd.Edge#getTargetNode <em>Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Edges</em>' reference list.
	 * @see org.muml.storydiagram.verification.sdd.SDDPackage#getNode_IncomingEdges()
	 * @see org.muml.storydiagram.verification.sdd.Edge#getTargetNode
	 * @model opposite="targetNode"
	 * @generated
	 */
	EList<Edge> getIncomingEdges();

} // Node
