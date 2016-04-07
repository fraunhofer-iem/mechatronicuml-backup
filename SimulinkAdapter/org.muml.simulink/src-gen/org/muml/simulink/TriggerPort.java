/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.TriggerPort#getTriggerInput <em>Trigger Input</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.SimulinkPackage#getTriggerPort()
 * @model
 * @generated
 */
public interface TriggerPort extends InPortBlock {
	/**
	 * Returns the value of the '<em><b>Trigger Input</b></em>' attribute.
	 * The default value is <code>"rising"</code>.
	 * The literals are from the enumeration {@link org.muml.simulink.TriggerEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Input</em>' attribute.
	 * @see org.muml.simulink.TriggerEvent
	 * @see #setTriggerInput(TriggerEvent)
	 * @see org.muml.simulink.SimulinkPackage#getTriggerPort_TriggerInput()
	 * @model default="rising" required="true"
	 * @generated
	 */
	TriggerEvent getTriggerInput();

	/**
	 * Sets the value of the '{@link org.muml.simulink.TriggerPort#getTriggerInput <em>Trigger Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Input</em>' attribute.
	 * @see org.muml.simulink.TriggerEvent
	 * @see #getTriggerInput()
	 * @generated
	 */
	void setTriggerInput(TriggerEvent value);

} // TriggerPort
