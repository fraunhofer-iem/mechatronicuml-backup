/**
 */
package mtctl.Predicates;

import org.eclipse.emf.ecore.EObject;

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
 * <ul>
 *   <li>{@link mtctl.Predicates.MessageInBufferExpr#getBuffer <em>Buffer</em>}</li>
 *   <li>{@link mtctl.Predicates.MessageInBufferExpr#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see mtctl.Predicates.PredicatesPackage#getMessageInBufferExpr()
 * @model
 * @generated
 */
public interface MessageInBufferExpr extends DynamicPredicateExpr {
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
	 * @see mtctl.Predicates.PredicatesPackage#getMessageInBufferExpr_Buffer()
	 * @model
	 * @generated
	 */
	EObject getBuffer();

	/**
	 * Sets the value of the '{@link mtctl.Predicates.MessageInBufferExpr#getBuffer <em>Buffer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer</em>' reference.
	 * @see #getBuffer()
	 * @generated
	 */
	void setBuffer(EObject value);

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
	 * @see mtctl.Predicates.PredicatesPackage#getMessageInBufferExpr_Message()
	 * @model
	 * @generated
	 */
	EObject getMessage();

	/**
	 * Sets the value of the '{@link mtctl.Predicates.MessageInBufferExpr#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(EObject value);

} // MessageInBufferExpr
