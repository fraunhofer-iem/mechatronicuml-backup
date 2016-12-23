/**
 */
package org.muml.cbs.dependencylanguage;

import org.muml.core.expressions.common.LogicOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This can be used to logically compose multiple events.
 * If an And composition is chosen it could require to introduce auxiliary elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.CompositionEvent#getLeftEvent <em>Left Event</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.CompositionEvent#getKind <em>Kind</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.CompositionEvent#getRightEvent <em>Right Event</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getCompositionEvent()
 * @model
 * @generated
 */
public interface CompositionEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Left Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Left Event</em>' containment reference.
	 * @see #setLeftEvent(Event)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getCompositionEvent_LeftEvent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Event getLeftEvent();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.CompositionEvent#getLeftEvent <em>Left Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Event</em>' containment reference.
	 * @see #getLeftEvent()
	 * @generated
	 */
	void setLeftEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.core.expressions.common.LogicOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.muml.core.expressions.common.LogicOperator
	 * @see #setKind(LogicOperator)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getCompositionEvent_Kind()
	 * @model required="true"
	 * @generated
	 */
	LogicOperator getKind();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.CompositionEvent#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.muml.core.expressions.common.LogicOperator
	 * @see #getKind()
	 * @generated
	 */
	void setKind(LogicOperator value);

	/**
	 * Returns the value of the '<em><b>Right Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right Event</em>' containment reference.
	 * @see #setRightEvent(Event)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getCompositionEvent_RightEvent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Event getRightEvent();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.CompositionEvent#getRightEvent <em>Right Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Event</em>' containment reference.
	 * @see #getRightEvent()
	 * @generated
	 */
	void setRightEvent(Event value);

} // CompositionEvent
