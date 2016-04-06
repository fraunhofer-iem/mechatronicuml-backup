/**
 */
package org.muml.cbs.dependencylanguage;

import org.eclipse.emf.common.util.EList;
import org.muml.core.expressions.Expression;
import org.muml.pim.types.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Synchronization describes which Transitions should be coupled.
 * Each Transition can only be referenced once in this expression.
 * This could be check by constraints.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.Synchronization#getSendingEvents <em>Sending Events</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.Synchronization#getReceivingEvents <em>Receiving Events</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.Synchronization#getChannelName <em>Channel Name</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.Synchronization#getSelectorType <em>Selector Type</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.Synchronization#getGeneralSelectorExpression <em>General Selector Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getSynchronization()
 * @model
 * @generated
 */
public interface Synchronization extends Dependency {
	/**
	 * Returns the value of the '<em><b>Sending Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.cbs.dependencylanguage.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sending Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * They can be  SimpleEvents or  SynchronizationEvents.
	 * The second can only be used when a selectorType is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sending Events</em>' containment reference list.
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getSynchronization_SendingEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getSendingEvents();

	/**
	 * Returns the value of the '<em><b>Receiving Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.cbs.dependencylanguage.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiving Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * They can be  SimpleEvents or  SynchronizationEvents.
	 * The second can only be used when a selectorType is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiving Events</em>' containment reference list.
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getSynchronization_ReceivingEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getReceivingEvents();

	/**
	 * Returns the value of the '<em><b>Channel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name for a new SynchronizationChannel. If channel with same name already exists, it is used, instead of a new created SynchronizationChannel.
	 * If it is empty an unique name is generated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel Name</em>' attribute.
	 * @see #setChannelName(String)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getSynchronization_ChannelName()
	 * @model
	 * @generated
	 */
	String getChannelName();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.Synchronization#getChannelName <em>Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Name</em>' attribute.
	 * @see #getChannelName()
	 * @generated
	 */
	void setChannelName(String value);

	/**
	 * Returns the value of the '<em><b>Selector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is optional and allows to specify a channel which uses the chosen selectortype.
	 * If it is empty it is a simple channel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector Type</em>' reference.
	 * @see #setSelectorType(DataType)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getSynchronization_SelectorType()
	 * @model
	 * @generated
	 */
	DataType getSelectorType();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.Synchronization#getSelectorType <em>Selector Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector Type</em>' reference.
	 * @see #getSelectorType()
	 * @generated
	 */
	void setSelectorType(DataType value);

	/**
	 * Returns the value of the '<em><b>General Selector Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Selector Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This expression is used as default selector expression.
	 * Thereby, it can be used either SynchronizationEvent or any other SimpleEvent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General Selector Expression</em>' containment reference.
	 * @see #setGeneralSelectorExpression(Expression)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getSynchronization_GeneralSelectorExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getGeneralSelectorExpression();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.Synchronization#getGeneralSelectorExpression <em>General Selector Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Selector Expression</em>' containment reference.
	 * @see #getGeneralSelectorExpression()
	 * @generated
	 */
	void setGeneralSelectorExpression(Expression value);

} // Synchronization
