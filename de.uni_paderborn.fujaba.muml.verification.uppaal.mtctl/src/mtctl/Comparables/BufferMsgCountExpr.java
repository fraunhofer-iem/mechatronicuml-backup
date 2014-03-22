/**
 */
package mtctl.Comparables;

import org.eclipse.emf.ecore.EObject;

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
 * <ul>
 *   <li>{@link mtctl.Comparables.BufferMsgCountExpr#getBuffer <em>Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @see mtctl.Comparables.ComparablesPackage#getBufferMsgCountExpr()
 * @model
 * @generated
 */
public interface BufferMsgCountExpr extends DynamicMapExpr {
	/**
	 * Returns the value of the '<em><b>Buffer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer</em>' reference.
	 * @see #setBuffer(EObject)
	 * @see mtctl.Comparables.ComparablesPackage#getBufferMsgCountExpr_Buffer()
	 * @model
	 * @generated
	 */
	EObject getBuffer();

	/**
	 * Sets the value of the '{@link mtctl.Comparables.BufferMsgCountExpr#getBuffer <em>Buffer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer</em>' reference.
	 * @see #getBuffer()
	 * @generated
	 */
	void setBuffer(EObject value);

} // BufferMsgCountExpr
