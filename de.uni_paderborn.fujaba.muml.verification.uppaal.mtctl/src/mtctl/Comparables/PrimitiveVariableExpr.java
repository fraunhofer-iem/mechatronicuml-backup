/**
 */
package mtctl.Comparables;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Variable Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A (runtime) variable with a "primitive" type (e.g., muml clock, integer, ...)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mtctl.Comparables.PrimitiveVariableExpr#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see mtctl.Comparables.ComparablesPackage#getPrimitiveVariableExpr()
 * @model
 * @generated
 */
public interface PrimitiveVariableExpr extends DynamicMapExpr {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' reference.
	 * @see #setVar(EObject)
	 * @see mtctl.Comparables.ComparablesPackage#getPrimitiveVariableExpr_Var()
	 * @model
	 * @generated
	 */
	EObject getVar();

	/**
	 * Sets the value of the '{@link mtctl.Comparables.PrimitiveVariableExpr#getVar <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(EObject value);

} // PrimitiveVariableExpr
