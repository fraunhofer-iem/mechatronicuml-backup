/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.timedstorydiagram;

import org.storydriven.storydiagrams.patterns.StoryPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Story Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedStoryPattern#isNonModifyingStoryPattern <em>Non Modifying Story Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedstorydiagramPackage#getTimedStoryPattern()
 * @model
 * @generated
 */
public interface TimedStoryPattern extends StoryPattern {

	/**
	 * Returns the value of the '<em><b>Non Modifying Story Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Modifying Story Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Modifying Story Pattern</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedstorydiagramPackage#getTimedStoryPattern_NonModifyingStoryPattern()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='-- Checks that all ObjectVariables and LinkVariables are check only and that no ObjectVariable has an AttributeAssignment--\r\nself.variable -> forAll(v | v.oclIsTypeOf(storydiagrams::patterns::ObjectVariable) implies (v.oclAsType(storydiagrams::patterns::ObjectVariable).bindingOperator = storydiagrams::patterns::BindingOperator::CHECK_ONLY and v.oclAsType(storydiagrams::patterns::ObjectVariable).attributeAssignment -> size() = 0)) and\r\nself.linkVariable -> forAll(bindingOperator = storydiagrams::patterns::BindingOperator::CHECK_ONLY)'"
	 * @generated
	 */
	boolean isNonModifyingStoryPattern();
} // TimedStoryPattern
