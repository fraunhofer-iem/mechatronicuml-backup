/**
 */
package mtctl.BooleanLogic;

import mtctl.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imply Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mtctl.BooleanLogic.ImplyExpr#getLeftOpd <em>Left Opd</em>}</li>
 *   <li>{@link mtctl.BooleanLogic.ImplyExpr#getRightOpd <em>Right Opd</em>}</li>
 * </ul>
 * </p>
 *
 * @see mtctl.BooleanLogic.BooleanLogicPackage#getImplyExpr()
 * @model
 * @generated
 */
public interface ImplyExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Left Opd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Opd</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Opd</em>' containment reference.
	 * @see #setLeftOpd(Expression)
	 * @see mtctl.BooleanLogic.BooleanLogicPackage#getImplyExpr_LeftOpd()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeftOpd();

	/**
	 * Sets the value of the '{@link mtctl.BooleanLogic.ImplyExpr#getLeftOpd <em>Left Opd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Opd</em>' containment reference.
	 * @see #getLeftOpd()
	 * @generated
	 */
	void setLeftOpd(Expression value);

	/**
	 * Returns the value of the '<em><b>Right Opd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Opd</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Opd</em>' containment reference.
	 * @see #setRightOpd(Expression)
	 * @see mtctl.BooleanLogic.BooleanLogicPackage#getImplyExpr_RightOpd()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRightOpd();

	/**
	 * Sets the value of the '{@link mtctl.BooleanLogic.ImplyExpr#getRightOpd <em>Right Opd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Opd</em>' containment reference.
	 * @see #getRightOpd()
	 * @generated
	 */
	void setRightOpd(Expression value);

} // ImplyExpr
