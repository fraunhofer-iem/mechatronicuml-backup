/**
 */
package org.muml.cbs.dependencylanguage;

import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.msgtype.MessageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Can be resolved to a Set of Transitions, that uses the declared Message.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.MessageEvent#getKind <em>Kind</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.MessageEvent#getType <em>Type</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.MessageEvent#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getMessageEvent()
 * @model
 * @generated
 */
public interface MessageEvent extends SimpleEvent {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.cbs.dependencylanguage.MessageEventKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  see MessageEventKind
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.muml.cbs.dependencylanguage.MessageEventKind
	 * @see #setKind(MessageEventKind)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getMessageEvent_Kind()
	 * @model required="true"
	 * @generated
	 */
	MessageEventKind getKind();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.MessageEvent#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.muml.cbs.dependencylanguage.MessageEventKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MessageEventKind value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Message which is send or consumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(MessageType)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getMessageEvent_Type()
	 * @model required="true"
	 * @generated
	 */
	MessageType getType();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.MessageEvent#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MessageType value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Message Event can be optionally bound to one port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(DiscreteInteractionEndpoint)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getMessageEvent_Port()
	 * @model
	 * @generated
	 */
	DiscreteInteractionEndpoint getPort();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.MessageEvent#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(DiscreteInteractionEndpoint value);

} // MessageEvent
