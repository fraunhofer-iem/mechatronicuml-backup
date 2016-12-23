/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.pattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Pattern Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a variant of a Real-Time Coordination Pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.pattern.CoordinationPatternVariant#getOriginalPattern <em>Original Pattern</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.pattern.PatternPackage#getCoordinationPatternVariant()
 * @model
 * @generated
 */
public interface CoordinationPatternVariant extends AbstractCoordinationPattern {
	/**
	 * Returns the value of the '<em><b>Original Pattern</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.pattern.CoordinationPattern#getPatternVariants <em>Pattern Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The original pattern of this variant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Pattern</em>' reference.
	 * @see #setOriginalPattern(CoordinationPattern)
	 * @see org.muml.pim.pattern.PatternPackage#getCoordinationPatternVariant_OriginalPattern()
	 * @see org.muml.pim.pattern.CoordinationPattern#getPatternVariants
	 * @model opposite="patternVariants" required="true"
	 * @generated
	 */
	CoordinationPattern getOriginalPattern();

	/**
	 * Sets the value of the '{@link org.muml.pim.pattern.CoordinationPatternVariant#getOriginalPattern <em>Original Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Pattern</em>' reference.
	 * @see #getOriginalPattern()
	 * @generated
	 */
	void setOriginalPattern(CoordinationPattern value);

} // CoordinationPatternVariant
