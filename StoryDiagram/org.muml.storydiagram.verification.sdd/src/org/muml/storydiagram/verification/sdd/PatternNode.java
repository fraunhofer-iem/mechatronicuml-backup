/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.verification.sdd;

import org.muml.mumlcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.verification.sdd.PatternNode#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.verification.sdd.SDDPackage#getPatternNode()
 * @model abstract="true"
 * @generated
 */
public interface PatternNode extends Node, NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.storydiagram.verification.sdd.PatternNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.muml.storydiagram.verification.sdd.PatternNodeType
	 * @see #setType(PatternNodeType)
	 * @see org.muml.storydiagram.verification.sdd.SDDPackage#getPatternNode_Type()
	 * @model required="true"
	 * @generated
	 */
	PatternNodeType getType();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.verification.sdd.PatternNode#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.muml.storydiagram.verification.sdd.PatternNodeType
	 * @see #getType()
	 * @generated
	 */
	void setType(PatternNodeType value);

} // PatternNode
