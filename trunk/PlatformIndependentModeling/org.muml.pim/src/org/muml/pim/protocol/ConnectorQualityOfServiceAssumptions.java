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
 *   <li>{@link org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions#getMinMessageDelay <em>Min Message Delay</em>}</li>
 *   <li>{@link org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions#getMaxMessageDelay <em>Max Message Delay</em>}</li>
 *   <li>{@link org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions#isMessageLossPossible <em>Message Loss Possible</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.protocol.ProtocolPackage#getConnectorQualityOfServiceAssumptions()
 * @model
 * @generated
 */
public interface ConnectorQualityOfServiceAssumptions extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Min Message Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimal time a message needs from the sender to the receiver using this connector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Message Delay</em>' containment reference.
	 * @see #setMinMessageDelay(TimeValue)
	 * @see org.muml.pim.protocol.ProtocolPackage#getConnectorQualityOfServiceAssumptions_MinMessageDelay()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getMinMessageDelay();

	/**
	 * Sets the value of the '{@link org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions#getMinMessageDelay <em>Min Message Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Message Delay</em>' containment reference.
	 * @see #getMinMessageDelay()
	 * @generated
	 */
	void setMinMessageDelay(TimeValue value);

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
	 * Defines if messages that are send using this connector may be lost during transport.
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

} // ConnectorQualityOfServiceAssumptions
