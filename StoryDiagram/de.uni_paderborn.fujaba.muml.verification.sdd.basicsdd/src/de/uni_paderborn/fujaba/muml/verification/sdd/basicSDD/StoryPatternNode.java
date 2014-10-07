/**
 */
package de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD;

import de.uni_paderborn.fujaba.muml.verification.sdd.PatternNode;

import org.storydriven.storydiagrams.patterns.StoryPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Story Pattern Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.StoryPatternNode#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.BasicSDDPackage#getStoryPatternNode()
 * @model
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
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.BasicSDDPackage#getStoryPatternNode_Pattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StoryPattern getPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.StoryPatternNode#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(StoryPattern value);

} // StoryPatternNode
