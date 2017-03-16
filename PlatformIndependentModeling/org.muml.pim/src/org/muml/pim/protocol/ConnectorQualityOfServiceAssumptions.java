/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.protocol;

import org.muml.core.CommentableElement;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Quality Of Service Assumptions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The list of quality of service assumptions for this connector. A developer defines these properties before modeling the role statecharts, because the statecharts depend on these assumptions. Software layers under the MechatronicUML layer respectively the hardware itself have to ensure that these assumptions are correct.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions#getMaxMessageDelay <em>Max Message Delay</em>}</li>
 *   <li>{@link org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions#isMessageLossPossible <em>Message Loss Possible</em>}</li>
 *   <li>{@link org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions#isPreserveMessageOrder <em>Preserve Message Order</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.protocol.ProtocolPackage#getConnectorQualityOfServiceAssumptions()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PreserveMessageOrderIsTrueWhenConnectorIsReliable'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL PreserveMessageOrderIsTrueWhenConnectorIsReliable='-- Attribute preserveMessageOrder must be true if the connector is reliable (i.e., if no message may be lost).\r\nself.messageLossPossible implies self.preserveMessageOrder'"
 * @generated
 */
public interface ConnectorQualityOfServiceAssumptions extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Max Message Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximal time a message needs from the sender to the receiver using this connector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Message Delay</em>' containment reference.
	 * @see #setMaxMessageDelay(TimeValue)
	 * @see org.muml.pim.protocol.ProtocolPackage#getConnectorQualityOfServiceAssumptions_MaxMessageDelay()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getMaxMessageDelay();

	/**
	 * Sets the value of the '{@link org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions#getMaxMessageDelay <em>Max Message Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Message Delay</em>' containment reference.
	 * @see #getMaxMessageDelay()
	 * @generated
	 */
	void setMaxMessageDelay(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Message Loss Possible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether messages that are sent using this connector may be lost during transport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Loss Possible</em>' attribute.
	 * @see #setMessageLossPossible(boolean)
	 * @see org.muml.pim.protocol.ProtocolPackage#getConnectorQualityOfServiceAssumptions_MessageLossPossible()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isMessageLossPossible();

	/**
	 * Sets the value of the '{@link org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions#isMessageLossPossible <em>Message Loss Possible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Loss Possible</em>' attribute.
	 * @see #isMessageLossPossible()
	 * @generated
	 */
	void setMessageLossPossible(boolean value);

	/**
	 * Returns the value of the '<em><b>Preserve Message Order</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preserve Message Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether the message order is preserved. This is achieved by dropping overtaken messages. The message order is always preserved if the connector is reliable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preserve Message Order</em>' attribute.
	 * @see #setPreserveMessageOrder(boolean)
	 * @see org.muml.pim.protocol.ProtocolPackage#getConnectorQualityOfServiceAssumptions_PreserveMessageOrder()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isPreserveMessageOrder();

	/**
	 * Sets the value of the '{@link org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions#isPreserveMessageOrder <em>Preserve Message Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preserve Message Order</em>' attribute.
	 * @see #isPreserveMessageOrder()
	 * @generated
	 */
	void setPreserveMessageOrder(boolean value);

} // ConnectorQualityOfServiceAssumptions
