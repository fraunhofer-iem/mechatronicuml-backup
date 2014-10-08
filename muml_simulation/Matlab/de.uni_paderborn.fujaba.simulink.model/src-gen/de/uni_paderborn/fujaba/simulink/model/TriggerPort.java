/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.TriggerPort#getTriggerInput <em>Trigger Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getTriggerPort()
 * @model
 * @generated
 */
public interface TriggerPort extends InPortBlock {
	/**
	 * Returns the value of the '<em><b>Trigger Input</b></em>' attribute.
	 * The default value is <code>"rising"</code>.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.simulink.model.TriggerEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Input</em>' attribute.
	 * @see de.uni_paderborn.fujaba.simulink.model.TriggerEvent
	 * @see #setTriggerInput(TriggerEvent)
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getTriggerPort_TriggerInput()
	 * @model default="rising" required="true"
	 * @generated
	 */
	TriggerEvent getTriggerInput();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.simulink.model.TriggerPort#getTriggerInput <em>Trigger Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Input</em>' attribute.
	 * @see de.uni_paderborn.fujaba.simulink.model.TriggerEvent
	 * @see #getTriggerInput()
	 * @generated
	 */
	void setTriggerInput(TriggerEvent value);

} // TriggerPort
