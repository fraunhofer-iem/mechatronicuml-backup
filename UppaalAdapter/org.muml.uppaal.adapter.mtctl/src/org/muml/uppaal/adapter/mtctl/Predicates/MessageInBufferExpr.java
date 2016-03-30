/**
 */
package org.muml.uppaal.adapter.mtctl.Predicates;

import org.muml.uppaal.adapter.mtctl.Comparables.MapExpr;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message In Buffer Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Evaluates to true iff in the snapshot, there is a message of the specified type in one of the buffers of the specified role
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.Predicates.MessageInBufferExpr#getBuffer <em>Buffer</em>}</li>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.Predicates.MessageInBufferExpr#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.adapter.mtctl.Predicates.PredicatesPackage#getMessageInBufferExpr()
 * @model
 * @generated
 */
public interface MessageInBufferExpr extends DynamicPredicateExpr {
	/**
	 * Returns the value of the '<em><b>Buffer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer</em>' containment reference.
	 * @see #setBuffer(MapExpr)
	 * @see org.muml.uppaal.adapter.mtctl.Predicates.PredicatesPackage#getMessageInBufferExpr_Buffer()
	 * @model containment="true"
	 * @generated
	 */
	MapExpr getBuffer();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.Predicates.MessageInBufferExpr#getBuffer <em>Buffer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer</em>' containment reference.
	 * @see #getBuffer()
	 * @generated
	 */
	void setBuffer(MapExpr value);

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
	 * @see org.muml.uppaal.adapter.mtctl.Predicates.PredicatesPackage#getMessageInBufferExpr_Message()
	 * @model containment="true"
	 * @generated
	 */
	MapExpr getMessage();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.Predicates.MessageInBufferExpr#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(MapExpr value);

} // MessageInBufferExpr
