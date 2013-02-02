/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.msgtype.MessageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The messages are exchanged between components in order to communicate
 * asynchronously. A message is typed over a message type and provides a 
 * binding of all parameters defined by the message type to concrete values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Message#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Message#getParameterBinding <em>Parameter Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the message type this message is typed over.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Of</em>' reference.
	 * @see #setInstanceOf(MessageType)
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getMessage_InstanceOf()
	 * @model required="true"
	 * @generated
	 */
	MessageType getInstanceOf();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Message#getInstanceOf <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of</em>' reference.
	 * @see #getInstanceOf()
	 * @generated
	 */
	void setInstanceOf(MessageType value);

	/**
	 * Returns the value of the '<em><b>Parameter Binding</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.behavior.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Binding</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getMessage_ParameterBinding()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameterBinding();

} // Message
