/**
 */
package org.muml.storydiagram.verification.sdd;

import org.eclipse.emf.common.util.EList;
import org.muml.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Story Decision Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.verification.sdd.AbstractStoryDecisionDiagram#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.muml.storydiagram.verification.sdd.AbstractStoryDecisionDiagram#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.verification.sdd.SDDPackage#getAbstractStoryDecisionDiagram()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oneRootNode'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL oneRootNode='nodes->size()>0 implies nodes->select(e|e.incomingEdges->size()=0)->size()=1'"
 * @generated
 */
public interface AbstractStoryDecisionDiagram extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.storydiagram.verification.sdd.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.muml.storydiagram.verification.sdd.SDDPackage#getAbstractStoryDecisionDiagram_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.storydiagram.verification.sdd.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see org.muml.storydiagram.verification.sdd.SDDPackage#getAbstractStoryDecisionDiagram_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

} // AbstractStoryDecisionDiagram
