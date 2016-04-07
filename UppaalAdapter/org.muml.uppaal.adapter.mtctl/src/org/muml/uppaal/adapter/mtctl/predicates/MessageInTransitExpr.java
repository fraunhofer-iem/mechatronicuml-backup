/**
 */
package org.muml.uppaal.adapter.mtctl.predicates;

import org.muml.uppaal.adapter.mtctl.comparables.MapExpr;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.predicates.MessageInTransitExpr#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage#getMessageInTransitExpr()
 * @model
 * @generated
 */
public interface MessageInTransitExpr extends DynamicPredicateExpr {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(MapExpr)
	 * @see org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage#getMessageInTransitExpr_Message()
	 * @model containment="true"
	 * @generated
	 */
	MapExpr getMessage();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.predicates.MessageInTransitExpr#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(MapExpr value);

} // MessageInTransitExpr
