/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.verification.sdd;

import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.sdd.PatternNode#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage#getPatternNode()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noNegativeObjects noLinkModifications noNegativeLinks noObjectModifications'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL noNegativeObjects='(not pattern.oclIsUndefined()) implies pattern.variable->select(oclIsKindOf(sdmp::ObjectVariable)).oclAsType(sdmp::ObjectVariable)->forAll(bindingSemantics = sdmp::BindingSemantics::MANDATORY)' noLinkModifications='(not pattern.oclIsUndefined()) implies pattern.linkVariable->select(oclIsKindOf(sdmp::LinkVariable))->forAll(bindingOperator = sdmp::BindingOperator::CHECK_ONLY)' noNegativeLinks='(not pattern.oclIsUndefined()) implies pattern.linkVariable->select(oclIsKindOf(sdmp::LinkVariable))->forAll(bindingSemantics = sdmp::BindingSemantics::MANDATORY)' noObjectModifications='(not pattern.oclIsUndefined()) implies pattern.variable->select(oclIsKindOf(sdmp::ObjectVariable)).oclAsType(sdmp::ObjectVariable)->forAll(bindingOperator = sdmp::BindingOperator::CHECK_ONLY)'"
 * @generated
 */
public interface PatternNode extends Node, NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.verification.sdd.PatternNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.PatternNodeType
	 * @see #setType(PatternNodeType)
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage#getPatternNode_Type()
	 * @model required="true"
	 * @generated
	 */
	PatternNodeType getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.sdd.PatternNode#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.PatternNodeType
	 * @see #getType()
	 * @generated
	 */
	void setType(PatternNodeType value);

} // PatternNode
