/**
 */
package org.muml.cbs.dependencylanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.TriggerMessage#getEffects <em>Effects</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.TriggerMessage#getMessageEvent <em>Message Event</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getTriggerMessage()
 * @model
 * @generated
 */
public interface TriggerMessage extends Dependency {
	/**
	 * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.cbs.dependencylanguage.Effect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effects</em>' containment reference list.
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getTriggerMessage_Effects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Effect> getEffects();

	/**
	 * Returns the value of the '<em><b>Message Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Event</em>' containment reference.
	 * @see #setMessageEvent(MessageEvent)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getTriggerMessage_MessageEvent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MessageEvent getMessageEvent();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.TriggerMessage#getMessageEvent <em>Message Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Event</em>' containment reference.
	 * @see #getMessageEvent()
	 * @generated
	 */
	void setMessageEvent(MessageEvent value);

} // TriggerMessage
