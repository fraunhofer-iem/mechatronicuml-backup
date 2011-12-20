/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage;

import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents any expression in a textual language embedded into Story Diagrams, e.g. OCL or Java .
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TextualExpression#getExpressionText <em>Expression Text</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TextualExpression#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TextualExpression#getLanguageVersion <em>Language Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getTextualExpression()
 * @model
 * @generated
 */
public interface TextualExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds the expression, e.g. in OCL or Java.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression Text</em>' attribute.
	 * @see #setExpressionText(String)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getTextualExpression_ExpressionText()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getExpressionText();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TextualExpression#getExpressionText <em>Expression Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Text</em>' attribute.
	 * @see #getExpressionText()
	 * @generated
	 */
	void setExpressionText(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String representation of the used language which has to be unique. Examples are OCL and Java.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getTextualExpression_Language()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TextualExpression#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Language Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String representation of the used language's version. The format is <Major>.<Minor>[.<Revision>[.<Build>]]
	 * Examples: 1.4 or 3.0.1 or 1.0.2.20101208.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language Version</em>' attribute.
	 * @see #setLanguageVersion(String)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getTextualExpression_LanguageVersion()
	 * @model ordered="false"
	 * @generated
	 */
	String getLanguageVersion();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TextualExpression#getLanguageVersion <em>Language Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Version</em>' attribute.
	 * @see #getLanguageVersion()
	 * @generated
	 */
	void setLanguageVersion(String value);

} // TextualExpression
