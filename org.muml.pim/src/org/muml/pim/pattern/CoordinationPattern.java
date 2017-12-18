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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Real-Time Coordination Pattern defines a formal design pattern for a Real-Time Coordination Pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.pattern.CoordinationPattern#getCombineablePatterns <em>Combineable Patterns</em>}</li>
 *   <li>{@link org.muml.pim.pattern.CoordinationPattern#getAlternativePatterns <em>Alternative Patterns</em>}</li>
 *   <li>{@link org.muml.pim.pattern.CoordinationPattern#getDescriptionAspects <em>Description Aspects</em>}</li>
 *   <li>{@link org.muml.pim.pattern.CoordinationPattern#getPatternVariants <em>Pattern Variants</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.pattern.PatternPackage#getCoordinationPattern()
 * @model
 * @generated
 */
public interface CoordinationPattern extends AbstractCoordinationPattern {
	/**
	 * Returns the value of the '<em><b>Description Aspects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description aspects of this pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description Aspects</em>' containment reference.
	 * @see #setDescriptionAspects(DescriptionAspects)
	 * @see org.muml.pim.pattern.PatternPackage#getCoordinationPattern_DescriptionAspects()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DescriptionAspects getDescriptionAspects();

	/**
	 * Sets the value of the '{@link org.muml.pim.pattern.CoordinationPattern#getDescriptionAspects <em>Description Aspects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Aspects</em>' containment reference.
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	void setDescriptionAspects(DescriptionAspects value);

	/**
	 * Returns the value of the '<em><b>Pattern Variants</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.pattern.CoordinationPatternVariant}.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.pattern.CoordinationPatternVariant#getOriginalPattern <em>Original Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Variants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The variants of this pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Variants</em>' reference list.
	 * @see org.muml.pim.pattern.PatternPackage#getCoordinationPattern_PatternVariants()
	 * @see org.muml.pim.pattern.CoordinationPatternVariant#getOriginalPattern
	 * @model opposite="originalPattern"
	 * @generated
	 */
	EList<CoordinationPatternVariant> getPatternVariants();

	/**
	 * Returns the value of the '<em><b>Combineable Patterns</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.pattern.CoordinationPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The combineable patterns of this pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combineable Patterns</em>' reference list.
	 * @see org.muml.pim.pattern.PatternPackage#getCoordinationPattern_CombineablePatterns()
	 * @model annotation="http://www.muml.org/emf/OCLFilter filter='pattern::CoordinationPattern::allInstances()-&gt;select(p| not (p = self))'"
	 * @generated
	 */
	EList<CoordinationPattern> getCombineablePatterns();

	/**
	 * Returns the value of the '<em><b>Alternative Patterns</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.pattern.CoordinationPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The alternative patterns of this pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternative Patterns</em>' reference list.
	 * @see org.muml.pim.pattern.PatternPackage#getCoordinationPattern_AlternativePatterns()
	 * @model annotation="http://www.muml.org/emf/OCLFilter filter='pattern::CoordinationPattern::allInstances()-&gt;select(p| not (p = self))'"
	 * @generated
	 */
	EList<CoordinationPattern> getAlternativePatterns();

} // CoordinationPattern
