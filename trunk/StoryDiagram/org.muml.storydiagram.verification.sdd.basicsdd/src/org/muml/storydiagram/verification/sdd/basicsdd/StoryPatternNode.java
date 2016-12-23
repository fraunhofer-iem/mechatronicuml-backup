/**
 */
package org.muml.storydiagram.verification.sdd.basicsdd;

import org.muml.storydiagram.patterns.StoryPattern;
import org.muml.storydiagram.verification.sdd.PatternNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Story Pattern Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.verification.sdd.basicsdd.StoryPatternNode#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.verification.sdd.basicsdd.BasicSDDPackage#getStoryPatternNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noNegativeObjects noLinkModifications noNegativeLinks noObjectModifications'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL noNegativeObjects='(not pattern.oclIsUndefined()) implies pattern.variable->select(oclIsKindOf(storydiagrams::patterns::ObjectVariable)).oclAsType(storydiagrams::patterns::ObjectVariable)->forAll(oV | oV.bindingSemantics = storydiagrams::patterns::BindingSemantics::MANDATORY)' noLinkModifications='(not pattern.oclIsUndefined()) implies pattern.linkVariable->select(oclIsKindOf(storydiagrams::patterns::LinkVariable))->forAll(lV | lV.bindingOperator = storydiagrams::patterns::BindingOperator::CHECK_ONLY)' noNegativeLinks='(not pattern.oclIsUndefined()) implies pattern.linkVariable->select(oclIsKindOf(storydiagrams::patterns::LinkVariable))->forAll(bindingSemantics = storydiagrams::patterns::BindingSemantics::MANDATORY)' noObjectModifications='(not pattern.oclIsUndefined()) implies pattern.variable->select(oclIsKindOf(storydiagrams::patterns::ObjectVariable)).oclAsType(storydiagrams::patterns::ObjectVariable)->forAll(oV |oV.bindingOperator = storydiagrams::patterns::BindingOperator::CHECK_ONLY)'"
 * @generated
 */
public interface StoryPatternNode extends PatternNode {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(StoryPattern)
	 * @see org.muml.storydiagram.verification.sdd.basicsdd.BasicSDDPackage#getStoryPatternNode_Pattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StoryPattern getPattern();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.verification.sdd.basicsdd.StoryPatternNode#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(StoryPattern value);

} // StoryPatternNode
