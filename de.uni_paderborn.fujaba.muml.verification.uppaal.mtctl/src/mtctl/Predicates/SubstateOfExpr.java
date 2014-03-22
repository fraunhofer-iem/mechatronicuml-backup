/**
 */
package mtctl.Predicates;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substate Of Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * True iff state is a substate of superstate
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mtctl.Predicates.SubstateOfExpr#getSuperstate <em>Superstate</em>}</li>
 *   <li>{@link mtctl.Predicates.SubstateOfExpr#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see mtctl.Predicates.PredicatesPackage#getSubstateOfExpr()
 * @model
 * @generated
 */
public interface SubstateOfExpr extends StaticPredicateExpr {
	/**
	 * Returns the value of the '<em><b>Superstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superstate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superstate</em>' reference.
	 * @see #setSuperstate(EObject)
	 * @see mtctl.Predicates.PredicatesPackage#getSubstateOfExpr_Superstate()
	 * @model
	 * @generated
	 */
	EObject getSuperstate();

	/**
	 * Sets the value of the '{@link mtctl.Predicates.SubstateOfExpr#getSuperstate <em>Superstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superstate</em>' reference.
	 * @see #getSuperstate()
	 * @generated
	 */
	void setSuperstate(EObject value);

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
	 * @see mtctl.Predicates.PredicatesPackage#getSubstateOfExpr_State()
	 * @model
	 * @generated
	 */
	EObject getState();

	/**
	 * Sets the value of the '{@link mtctl.Predicates.SubstateOfExpr#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(EObject value);

} // SubstateOfExpr
