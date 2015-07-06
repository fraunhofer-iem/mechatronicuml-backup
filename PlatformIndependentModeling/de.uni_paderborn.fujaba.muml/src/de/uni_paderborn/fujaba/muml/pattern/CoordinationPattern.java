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
package de.uni_paderborn.fujaba.muml.pattern;

import de.uni_paderborn.fujaba.muml.behavior.Parameter;

import de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * \todosd{document!}
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern#getDescriptionAspects <em>Description Aspects</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern#getLegalConfigurations <em>Legal Configurations</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern#getPatternParameters <em>Pattern Parameters</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern#getCombineablePatterns <em>Combineable Patterns</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern#getAlternativePatterns <em>Alternative Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.pattern.PatternPackage#getCoordinationPattern()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniquePatternNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniquePatternNames='-- A name of a CoordinationPattern must be unique.\r\nCoordinationPattern.allInstances()->isUnique(name)'"
 * @generated
 */
public interface CoordinationPattern extends AbstractCoordinationSpecification {
	/**
	 * Returns the value of the '<em><b>Description Aspects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \todosd{document!}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description Aspects</em>' containment reference.
	 * @see #setDescriptionAspects(PlainTextualDescriptionAspects)
	 * @see de.uni_paderborn.fujaba.muml.pattern.PatternPackage#getCoordinationPattern_DescriptionAspects()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PlainTextualDescriptionAspects getDescriptionAspects();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern#getDescriptionAspects <em>Description Aspects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Aspects</em>' containment reference.
	 * @see #getDescriptionAspects()
	 * @generated
	 */
	void setDescriptionAspects(PlainTextualDescriptionAspects value);

	/**
	 * Returns the value of the '<em><b>Legal Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.pattern.LegalConfiguration}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.pattern.LegalConfiguration#getCoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \todosd{document!}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legal Configurations</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.pattern.PatternPackage#getCoordinationPattern_LegalConfigurations()
	 * @see de.uni_paderborn.fujaba.muml.pattern.LegalConfiguration#getCoordinationPattern
	 * @model opposite="coordinationPattern" containment="true"
	 * @generated
	 */
	EList<LegalConfiguration> getLegalConfigurations();

	/**
	 * Returns the value of the '<em><b>Pattern Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.behavior.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \todosd{document!}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Parameters</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.pattern.PatternPackage#getCoordinationPattern_PatternParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getPatternParameters();

	/**
	 * Returns the value of the '<em><b>Combineable Patterns</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \todosd{document!}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combineable Patterns</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.pattern.PatternPackage#getCoordinationPattern_CombineablePatterns()
	 * @model
	 * @generated
	 */
	EList<CoordinationPattern> getCombineablePatterns();

	/**
	 * Returns the value of the '<em><b>Alternative Patterns</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \todosd{document!}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternative Patterns</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.pattern.PatternPackage#getCoordinationPattern_AlternativePatterns()
	 * @model
	 * @generated
	 */
	EList<CoordinationPattern> getAlternativePatterns();

} // CoordinationPattern
