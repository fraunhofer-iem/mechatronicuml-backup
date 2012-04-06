/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.PatternOccurrence#getPattern <em>Pattern</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.PatternOccurrence#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getPatternOccurrence()
 * @model
 * @generated
 */
public interface PatternOccurrence extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' reference.
	 * @see #setPattern(CoordinationPattern)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getPatternOccurrence_Pattern()
	 * @model required="true"
	 * @generated
	 */
	CoordinationPattern getPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.PatternOccurrence#getPattern <em>Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(CoordinationPattern value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getPatternOccurrence_Ports()
	 * @model required="true"
	 * @generated
	 */
	EList<Port> getPorts();

} // PatternOccurrence
