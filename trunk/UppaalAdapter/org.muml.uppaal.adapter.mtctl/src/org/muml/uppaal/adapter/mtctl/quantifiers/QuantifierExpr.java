/**
 */
package org.muml.uppaal.adapter.mtctl.quantifiers;

import org.muml.uppaal.adapter.mtctl.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantifier Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.quantifiers.QuantifierExpr#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.quantifiers.QuantifierExpr#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.adapter.mtctl.quantifiers.QuantifiersPackage#getQuantifierExpr()
 * @model abstract="true"
 * @generated
 */
public interface QuantifierExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' containment reference.
	 * @see #setFormula(Expression)
	 * @see org.muml.uppaal.adapter.mtctl.quantifiers.QuantifiersPackage#getQuantifierExpr_Formula()
	 * @model containment="true"
	 * @generated
	 */
	Expression getFormula();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.quantifiers.QuantifierExpr#getFormula <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' containment reference.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(Expression value);

	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' containment reference.
	 * @see #setVar(BoundVariable)
	 * @see org.muml.uppaal.adapter.mtctl.quantifiers.QuantifiersPackage#getQuantifierExpr_Var()
	 * @model containment="true"
	 * @generated
	 */
	BoundVariable getVar();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.quantifiers.QuantifierExpr#getVar <em>Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' containment reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(BoundVariable value);

} // QuantifierExpr
