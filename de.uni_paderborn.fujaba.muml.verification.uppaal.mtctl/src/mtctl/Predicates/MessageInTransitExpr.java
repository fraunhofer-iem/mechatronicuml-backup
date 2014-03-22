/**
 */
package mtctl.Predicates;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message In Transit Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Evaluates to true iff a message of the specified type is currently being sent but has not arrived yet
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mtctl.Predicates.MessageInTransitExpr#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see mtctl.Predicates.PredicatesPackage#getMessageInTransitExpr()
 * @model
 * @generated
 */
public interface MessageInTransitExpr extends DynamicPredicateExpr {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(EObject)
	 * @see mtctl.Predicates.PredicatesPackage#getMessageInTransitExpr_Message()
	 * @model
	 * @generated
	 */
	EObject getMessage();

	/**
	 * Sets the value of the '{@link mtctl.Predicates.MessageInTransitExpr#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(EObject value);

} // MessageInTransitExpr
