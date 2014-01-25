/**
 */
package de.uni_paderborn.fujaba.muml.componentstorydiagram;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.componentstorypattern.TriggerEmbeddedComponentExpression;
import de.uni_paderborn.fujaba.muml.msgtype.MessageType;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.SendReconfigurationMessageExpression#getReconfigurationMessageType <em>Reconfiguration Message Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.SendReconfigurationMessageExpression#getParameterBindings <em>Parameter Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage#getSendReconfigurationMessageExpression()
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
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage#getSendReconfigurationMessageExpression_ReconfigurationMessageType()
	 * @model
	 * @generated
	 */
	MessageType getReconfigurationMessageType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.SendReconfigurationMessageExpression#getReconfigurationMessageType <em>Reconfiguration Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Message Type</em>' reference.
	 * @see #getReconfigurationMessageType()
	 * @generated
	 */
	void setReconfigurationMessageType(MessageType value);

	/**
	 * Returns the value of the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.behavior.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Bindings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage#getSendReconfigurationMessageExpression_ParameterBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameterBindings();

} // SendReconfigurationMessageExpression
