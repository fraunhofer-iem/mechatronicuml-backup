/**
 */
package org.muml.reconfiguration.componentstorydiagram;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.pim.msgtype.MessageType;
import org.muml.reconfiguration.componentstorypattern.TriggerEmbeddedComponentExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Reconfiguration Message Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This expression enables to send a reconfiguration message to an embedded
 * component instance requiring the component instance to perform a reconfiguration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorydiagram.SendReconfigurationMessageExpression#getReconfigurationMessageType <em>Reconfiguration Message Type</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorydiagram.SendReconfigurationMessageExpression#getParameterBindings <em>Parameter Bindings</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage#getSendReconfigurationMessageExpression()
 * @model
 * @generated
 */
public interface SendReconfigurationMessageExpression extends TriggerEmbeddedComponentExpression {
	/**
	 * Returns the value of the '<em><b>Reconfiguration Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Message Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfiguration Message Type</em>' reference.
	 * @see #setReconfigurationMessageType(MessageType)
	 * @see org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage#getSendReconfigurationMessageExpression_ReconfigurationMessageType()
	 * @model
	 * @generated
	 */
	MessageType getReconfigurationMessageType();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorydiagram.SendReconfigurationMessageExpression#getReconfigurationMessageType <em>Reconfiguration Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Message Type</em>' reference.
	 * @see #getReconfigurationMessageType()
	 * @generated
	 */
	void setReconfigurationMessageType(MessageType value);

	/**
	 * Returns the value of the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.behavior.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Bindings</em>' containment reference list.
	 * @see org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage#getSendReconfigurationMessageExpression_ParameterBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameterBindings();

} // SendReconfigurationMessageExpression
