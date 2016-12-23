/**
 */
package org.muml.uppaal.adapter.mtctl.comparables;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buffer Msg Count Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Evaluates to the current number of elements in the buffer
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.comparables.BufferMsgCountExpr#getBuffer <em>Buffer</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.adapter.mtctl.comparables.ComparablesPackage#getBufferMsgCountExpr()
 * @model
 * @generated
 */
public interface BufferMsgCountExpr extends MapExpr {
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
	 * @see org.muml.uppaal.adapter.mtctl.comparables.ComparablesPackage#getBufferMsgCountExpr_Buffer()
	 * @model containment="true"
	 * @generated
	 */
	MapExpr getBuffer();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.comparables.BufferMsgCountExpr#getBuffer <em>Buffer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer</em>' containment reference.
	 * @see #getBuffer()
	 * @generated
	 */
	void setBuffer(MapExpr value);

} // BufferMsgCountExpr
