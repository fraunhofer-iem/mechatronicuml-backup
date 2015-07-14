/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EG Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.EGExpr#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersPackage#getEGExpr()
 * @model
 * @generated
 */
public interface EGExpr extends TemporalQuantifierExpr {

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
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersPackage#getEGExpr_Expr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.EGExpr#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);
} // EGExpr
