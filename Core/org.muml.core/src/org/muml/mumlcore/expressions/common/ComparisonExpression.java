/**
 */
package org.muml.mumlcore.expressions.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents comparing expressions like a < 5 or a >= 7.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.mumlcore.expressions.common.ComparisonExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.muml.mumlcore.expressions.common.CommonExpressionsPackage#getComparisonExpression()
 * @model
 * @generated
 */
public interface ComparisonExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.mumlcore.expressions.common.ComparingOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the expression's comparing operator, e.g. <, >=, !=.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.muml.mumlcore.expressions.common.ComparingOperator
	 * @see #setOperator(ComparingOperator)
	 * @see org.muml.mumlcore.expressions.common.CommonExpressionsPackage#getComparisonExpression_Operator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComparingOperator getOperator();

	/**
	 * Sets the value of the '{@link org.muml.mumlcore.expressions.common.ComparisonExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.muml.mumlcore.expressions.common.ComparingOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparingOperator value);

} // ComparisonExpression
