/**
 */
package mtctl.Comparables;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Const Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An integer constant
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mtctl.Comparables.ConstExpr#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see mtctl.Comparables.ComparablesPackage#getConstExpr()
 * @model
 * @generated
 */
public interface ConstExpr extends MapExpr {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constant value of the expression
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(int)
	 * @see mtctl.Comparables.ComparablesPackage#getConstExpr_Val()
	 * @model
	 * @generated
	 */
	int getVal();

	/**
	 * Sets the value of the '{@link mtctl.Comparables.ConstExpr#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(int value);

} // ConstExpr
