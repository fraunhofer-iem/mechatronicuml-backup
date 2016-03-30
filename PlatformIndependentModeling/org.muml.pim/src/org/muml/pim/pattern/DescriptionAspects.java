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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description Aspects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Real-Time Coordination Pattern contains a set a descriptions aspects.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.pattern.DescriptionAspects#getOverview <em>Overview</em>}</li>
 *   <li>{@link org.muml.pim.pattern.DescriptionAspects#getContext <em>Context</em>}</li>
 *   <li>{@link org.muml.pim.pattern.DescriptionAspects#getProblem <em>Problem</em>}</li>
 *   <li>{@link org.muml.pim.pattern.DescriptionAspects#getSolution <em>Solution</em>}</li>
 *   <li>{@link org.muml.pim.pattern.DescriptionAspects#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.muml.pim.pattern.DescriptionAspects#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.muml.pim.pattern.DescriptionAspects#getExamples <em>Examples</em>}</li>
 *   <li>{@link org.muml.pim.pattern.DescriptionAspects#getConsequences <em>Consequences</em>}</li>
 *   <li>{@link org.muml.pim.pattern.DescriptionAspects#getCombineability <em>Combineability</em>}</li>
 *   <li>{@link org.muml.pim.pattern.DescriptionAspects#getVariants <em>Variants</em>}</li>
 *   <li>{@link org.muml.pim.pattern.DescriptionAspects#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link org.muml.pim.pattern.DescriptionAspects#getVerification_properties <em>Verification properties</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.pattern.PatternPackage#getDescriptionAspects()
 * @model
 * @generated
 */
public interface DescriptionAspects extends EObject {
	/**
	 * Returns the value of the '<em><b>Overview</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the overview of the pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overview</em>' attribute.
	 * @see #setOverview(String)
	 * @see org.muml.pim.pattern.PatternPackage#getDescriptionAspects_Overview()
	 * @model required="true"
	 * @generated
	 */
	String getOverview();

	/**
	 * Sets the value of the '{@link org.muml.pim.pattern.DescriptionAspects#getOverview <em>Overview</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overview</em>' attribute.
	 * @see #getOverview()
	 * @generated
	 */
	void setOverview(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the context of the pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see org.muml.pim.pattern.PatternPackage#getDescriptionAspects_Context()
	 * @model required="true"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link org.muml.pim.pattern.DescriptionAspects#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Problem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the problem of the pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Problem</em>' attribute.
	 * @see #setProblem(String)
	 * @see org.muml.pim.pattern.PatternPackage#getDescriptionAspects_Problem()
	 * @model required="true"
	 * @generated
	 */
	String getProblem();

	/**
	 * Sets the value of the '{@link org.muml.pim.pattern.DescriptionAspects#getProblem <em>Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem</em>' attribute.
	 * @see #getProblem()
	 * @generated
	 */
	void setProblem(String value);

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the solution of the pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solution</em>' attribute.
	 * @see #setSolution(String)
	 * @see org.muml.pim.pattern.PatternPackage#getDescriptionAspects_Solution()
	 * @model required="true"
	 * @generated
	 */
	String getSolution();

	/**
	 * Sets the value of the '{@link org.muml.pim.pattern.DescriptionAspects#getSolution <em>Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' attribute.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(String value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the structure of the pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structure</em>' attribute.
	 * @see #setStructure(String)
	 * @see org.muml.pim.pattern.PatternPackage#getDescriptionAspects_Structure()
	 * @model required="true"
	 * @generated
	 */
	String getStructure();

	/**
	 * Sets the value of the '{@link org.muml.pim.pattern.DescriptionAspects#getStructure <em>Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' attribute.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(String value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the behavior of the pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' attribute.
	 * @see #setBehavior(String)
	 * @see org.muml.pim.pattern.PatternPackage#getDescriptionAspects_Behavior()
	 * @model required="true"
	 * @generated
	 */
	String getBehavior();

	/**
	 * Sets the value of the '{@link org.muml.pim.pattern.DescriptionAspects#getBehavior <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' attribute.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(String value);

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the examples of the pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Examples</em>' attribute.
	 * @see #setExamples(String)
	 * @see org.muml.pim.pattern.PatternPackage#getDescriptionAspects_Examples()
	 * @model required="true"
	 * @generated
	 */
	String getExamples();

	/**
	 * Sets the value of the '{@link org.muml.pim.pattern.DescriptionAspects#getExamples <em>Examples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Examples</em>' attribute.
	 * @see #getExamples()
	 * @generated
	 */
	void setExamples(String value);

	/**
	 * Returns the value of the '<em><b>Consequences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the consequences of the pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consequences</em>' attribute.
	 * @see #setConsequences(String)
	 * @see org.muml.pim.pattern.PatternPackage#getDescriptionAspects_Consequences()
	 * @model required="true"
	 * @generated
	 */
	String getConsequences();

	/**
	 * Sets the value of the '{@link org.muml.pim.pattern.DescriptionAspects#getConsequences <em>Consequences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequences</em>' attribute.
	 * @see #getConsequences()
	 * @generated
	 */
	void setConsequences(String value);

	/**
	 * Returns the value of the '<em><b>Combineability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the combineability of the pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combineability</em>' attribute.
	 * @see #setCombineability(String)
	 * @see org.muml.pim.pattern.PatternPackage#getDescriptionAspects_Combineability()
	 * @model required="true"
	 * @generated
	 */
	String getCombineability();

	/**
	 * Sets the value of the '{@link org.muml.pim.pattern.DescriptionAspects#getCombineability <em>Combineability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combineability</em>' attribute.
	 * @see #getCombineability()
	 * @generated
	 */
	void setCombineability(String value);

	/**
	 * Returns the value of the '<em><b>Variants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the variants of the pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variants</em>' attribute.
	 * @see #setVariants(String)
	 * @see org.muml.pim.pattern.PatternPackage#getDescriptionAspects_Variants()
	 * @model required="true"
	 * @generated
	 */
	String getVariants();

	/**
	 * Sets the value of the '{@link org.muml.pim.pattern.DescriptionAspects#getVariants <em>Variants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variants</em>' attribute.
	 * @see #getVariants()
	 * @generated
	 */
	void setVariants(String value);

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the alternatives of the pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternatives</em>' attribute.
	 * @see #setAlternatives(String)
	 * @see org.muml.pim.pattern.PatternPackage#getDescriptionAspects_Alternatives()
	 * @model required="true"
	 * @generated
	 */
	String getAlternatives();

	/**
	 * Sets the value of the '{@link org.muml.pim.pattern.DescriptionAspects#getAlternatives <em>Alternatives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternatives</em>' attribute.
	 * @see #getAlternatives()
	 * @generated
	 */
	void setAlternatives(String value);

	/**
	 * Returns the value of the '<em><b>Verification properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the verification properties of the pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verification properties</em>' attribute.
	 * @see #setVerification_properties(String)
	 * @see org.muml.pim.pattern.PatternPackage#getDescriptionAspects_Verification_properties()
	 * @model required="true"
	 * @generated
	 */
	String getVerification_properties();

	/**
	 * Sets the value of the '{@link org.muml.pim.pattern.DescriptionAspects#getVerification_properties <em>Verification properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification properties</em>' attribute.
	 * @see #getVerification_properties()
	 * @generated
	 */
	void setVerification_properties(String value);

} // DescriptionAspects
