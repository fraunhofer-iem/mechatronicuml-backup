/**
 */
package org.muml.uppaal.adapter.mtctl.booleanlogic;

import org.muml.uppaal.adapter.mtctl.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.booleanlogic.NotExpr#getOpd <em>Opd</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.adapter.mtctl.booleanlogic.BooleanlogicPackage#getNotExpr()
 * @model
 * @generated
 */
public interface NotExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Opd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opd</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opd</em>' containment reference.
	 * @see #setOpd(Expression)
	 * @see org.muml.uppaal.adapter.mtctl.booleanlogic.BooleanlogicPackage#getNotExpr_Opd()
	 * @model containment="true"
	 * @generated
	 */
	Expression getOpd();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.booleanlogic.NotExpr#getOpd <em>Opd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opd</em>' containment reference.
	 * @see #getOpd()
	 * @generated
	 */
	void setOpd(Expression value);

} // NotExpr
