/**
 */
package org.muml.reconfiguration.reconfInstance;

import org.muml.pim.instance.StructuredComponentInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconfigurable Structured Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.reconfInstance.ReconfigurableStructuredComponentInstance#getControllerInstance <em>Controller Instance</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.reconfInstance.ReconfInstancePackage#getReconfigurableStructuredComponentInstance()
 * @model
 * @generated
 */
public interface ReconfigurableStructuredComponentInstance extends StructuredComponentInstance {
	/**
	 * Returns the value of the '<em><b>Controller Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Instance</em>' reference.
	 * @see #setControllerInstance(ControllerInstance)
	 * @see org.muml.reconfiguration.reconfInstance.ReconfInstancePackage#getReconfigurableStructuredComponentInstance_ControllerInstance()
	 * @model
	 * @generated
	 */
	ControllerInstance getControllerInstance();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.reconfInstance.ReconfigurableStructuredComponentInstance#getControllerInstance <em>Controller Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Instance</em>' reference.
	 * @see #getControllerInstance()
	 * @generated
	 */
	void setControllerInstance(ControllerInstance value);

} // ReconfigurableStructuredComponentInstance
