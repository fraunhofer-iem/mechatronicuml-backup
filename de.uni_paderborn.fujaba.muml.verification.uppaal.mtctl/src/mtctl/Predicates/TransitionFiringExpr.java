/**
 */
package mtctl.Predicates;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Firing Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * True iff the specified transition is currently firing in the snapshot
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mtctl.Predicates.TransitionFiringExpr#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see mtctl.Predicates.PredicatesPackage#getTransitionFiringExpr()
 * @model
 * @generated
 */
public interface TransitionFiringExpr extends DynamicPredicateExpr {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(EObject)
	 * @see mtctl.Predicates.PredicatesPackage#getTransitionFiringExpr_Transition()
	 * @model
	 * @generated
	 */
	EObject getTransition();

	/**
	 * Sets the value of the '{@link mtctl.Predicates.TransitionFiringExpr#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(EObject value);

} // TransitionFiringExpr
