/**
 */
package mtctl.Predicates;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Exit Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mtctl.Predicates.StateExitExpr#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see mtctl.Predicates.PredicatesPackage#getStateExitExpr()
 * @model
 * @generated
 */
public interface StateExitExpr extends DynamicPredicateExpr {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(EObject)
	 * @see mtctl.Predicates.PredicatesPackage#getStateExitExpr_State()
	 * @model
	 * @generated
	 */
	EObject getState();

	/**
	 * Sets the value of the '{@link mtctl.Predicates.StateExitExpr#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(EObject value);

} // StateExitExpr
