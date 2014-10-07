/**
 */
package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd;

import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern;

import de.uni_paderborn.fujaba.muml.verification.sdd.PatternNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Story Pattern Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryPatternNode#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage#getComponentStoryPatternNode()
 * @model
 * @generated
 */
public interface ComponentStoryPatternNode extends PatternNode {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(ComponentStoryPattern)
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage#getComponentStoryPatternNode_Pattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentStoryPattern getPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryPatternNode#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(ComponentStoryPattern value);

} // ComponentStoryPatternNode
