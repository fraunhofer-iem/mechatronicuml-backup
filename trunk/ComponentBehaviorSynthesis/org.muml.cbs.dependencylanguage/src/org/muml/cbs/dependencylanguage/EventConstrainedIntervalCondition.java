/**
 */
package org.muml.cbs.dependencylanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Constrained Interval Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This condition specifies an interval in relation to two Events.
 * initialEnabled and enabledInfinite should not be used, because it would be the same as writing true as Condition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition#getFromEvent <em>From Event</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition#isInitialEnabled <em>Initial Enabled</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition#getUntilEvent <em>Until Event</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition#isEnabledInfite <em>Enabled Infite</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getEventConstrainedIntervalCondition()
 * @model
 * @generated
 */
public interface EventConstrainedIntervalCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>From Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this event occurs, the condition evaluation is changed to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Event</em>' containment reference.
	 * @see #setFromEvent(Event)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getEventConstrainedIntervalCondition_FromEvent()
	 * @model containment="true"
	 * @generated
	 */
	Event getFromEvent();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition#getFromEvent <em>From Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Event</em>' containment reference.
	 * @see #getFromEvent()
	 * @generated
	 */
	void setFromEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Initial Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When it is true, the evaluation after initialization true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Enabled</em>' attribute.
	 * @see #setInitialEnabled(boolean)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getEventConstrainedIntervalCondition_InitialEnabled()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isInitialEnabled();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition#isInitialEnabled <em>Initial Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Enabled</em>' attribute.
	 * @see #isInitialEnabled()
	 * @generated
	 */
	void setInitialEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Until Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this event occurs, the condition evaluation is changed to false
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Until Event</em>' containment reference.
	 * @see #setUntilEvent(Event)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getEventConstrainedIntervalCondition_UntilEvent()
	 * @model containment="true"
	 * @generated
	 */
	Event getUntilEvent();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition#getUntilEvent <em>Until Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Event</em>' containment reference.
	 * @see #getUntilEvent()
	 * @generated
	 */
	void setUntilEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Enabled Infite</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled Infite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When it is true, the evaluation never changes after it is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled Infite</em>' attribute.
	 * @see #setEnabledInfite(boolean)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getEventConstrainedIntervalCondition_EnabledInfite()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isEnabledInfite();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition#isEnabledInfite <em>Enabled Infite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled Infite</em>' attribute.
	 * @see #isEnabledInfite()
	 * @generated
	 */
	void setEnabledInfite(boolean value);

} // EventConstrainedIntervalCondition
