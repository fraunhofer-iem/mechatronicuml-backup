/**
 */
package mtctl.Quantifiers;

import mtctl.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Quantifier Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mtctl.Quantifiers.TemporalQuantifierExpr#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see mtctl.Quantifiers.QuantifiersPackage#getTemporalQuantifierExpr()
 * @model abstract="true"
 * @generated
 */
public interface TemporalQuantifierExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see mtctl.Quantifiers.QuantifiersPackage#getTemporalQuantifierExpr_Expr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link mtctl.Quantifiers.TemporalQuantifierExpr#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // TemporalQuantifierExpr
