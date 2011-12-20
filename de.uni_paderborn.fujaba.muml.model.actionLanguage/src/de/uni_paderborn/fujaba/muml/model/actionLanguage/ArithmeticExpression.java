/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents arithmetic expressions like a + 5 or a * 7.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ArithmeticExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getArithmeticExpression()
 * @model
 * @generated
 */
public interface ArithmeticExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ArithmeticOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the expression's arithmetic operator, e.g. +, -, *, /, or MODULO.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ArithmeticOperator
	 * @see #setOperator(ArithmeticOperator)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getArithmeticExpression_Operator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ArithmeticOperator getOperator();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ArithmeticExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ArithmeticOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ArithmeticOperator value);

} // ArithmeticExpression
