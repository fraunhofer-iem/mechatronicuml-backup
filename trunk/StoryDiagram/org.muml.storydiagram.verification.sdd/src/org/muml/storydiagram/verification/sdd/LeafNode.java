/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.verification.sdd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.verification.sdd.LeafNode#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.verification.sdd.SDDPackage#getLeafNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noOutgoingEdge'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL noOutgoingEdge='outgoingEdges->size()=0'"
 * @generated
 */
public interface LeafNode extends Node {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see org.muml.storydiagram.verification.sdd.SDDPackage#getLeafNode_Value()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.verification.sdd.LeafNode#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // LeafNode
