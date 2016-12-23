/**
 */
package org.muml.cbs.dependencylanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enable Disable Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * It restricts its event that the event can only occur if the condition is met.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.EnableDisableEffect#getEvent <em>Event</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.EnableDisableEffect#isIsEnable <em>Is Enable</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getEnableDisableEffect()
 * @model
 * @generated
 */
public interface EnableDisableEffect extends Effect {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transition or EntryOrExitEvent that shall be restricted (see Event).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(Event)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getEnableDisableEffect_Event()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.EnableDisableEffect#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Is Enable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Enable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It is used to invert the 
	 * If it is false the Expression is invertingly applied as the restriction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Enable</em>' attribute.
	 * @see #setIsEnable(boolean)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getEnableDisableEffect_IsEnable()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsEnable();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.EnableDisableEffect#isIsEnable <em>Is Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Enable</em>' attribute.
	 * @see #isIsEnable()
	 * @generated
	 */
	void setIsEnable(boolean value);

} // EnableDisableEffect
