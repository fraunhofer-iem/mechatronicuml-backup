/**
 */
package org.muml.core.expressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.core.expressions.ExpressionText#getGrammar <em>Grammar</em>}</li>
 *   <li>{@link org.muml.core.expressions.ExpressionText#getText <em>Text</em>}</li>
 *   <li>{@link org.muml.core.expressions.ExpressionText#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.core.expressions.ExpressionsPackage#getExpressionText()
 * @model
 * @generated
 */
public interface ExpressionText extends EObject {
	/**
	 * Returns the value of the '<em><b>Grammar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grammar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grammar</em>' attribute.
	 * @see #setGrammar(String)
	 * @see org.muml.core.expressions.ExpressionsPackage#getExpressionText_Grammar()
	 * @model
	 * @generated
	 */
	String getGrammar();

	/**
	 * Sets the value of the '{@link org.muml.core.expressions.ExpressionText#getGrammar <em>Grammar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grammar</em>' attribute.
	 * @see #getGrammar()
	 * @generated
	 */
	void setGrammar(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.muml.core.expressions.ExpressionsPackage#getExpressionText_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.muml.core.expressions.ExpressionText#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see org.muml.core.expressions.ExpressionsPackage#getExpressionText_Expression()
	 * @model containment="true" required="true" transient="true" changeable="false"
	 * @generated
	 */
	Expression getExpression();

} // ExpressionText
