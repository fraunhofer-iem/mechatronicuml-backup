/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.pattern;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ellipse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class only exists because of GMF problems to visualize the ellipse of a Real-Time Coordination Patterns.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.PatternEllipse#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getPatternEllipse()
 * @model
 * @generated
 */
public interface PatternEllipse extends EObject {
	/**
	 * Returns the value of the '<em><b>Coordination Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getPatternEllipse <em>Pattern Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A PatternEllipse has exactly one CoordinationPattern.
	 * This reference only exists because of GMF problems to visualize the ellipse of a Real-Time Coordination Patterns.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Pattern</em>' container reference.
	 * @see #setCoordinationPattern(CoordinationPattern)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getPatternEllipse_CoordinationPattern()
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getPatternEllipse
	 * @model opposite="patternEllipse" required="true" transient="false"
	 * @generated
	 */
	CoordinationPattern getCoordinationPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.PatternEllipse#getCoordinationPattern <em>Coordination Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Pattern</em>' container reference.
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	void setCoordinationPattern(CoordinationPattern value);

} // PatternEllipse
