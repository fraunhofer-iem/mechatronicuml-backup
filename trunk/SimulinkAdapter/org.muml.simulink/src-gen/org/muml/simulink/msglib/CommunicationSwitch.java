/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.msglib;

import org.muml.simulink.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.msglib.CommunicationSwitch#getDebug <em>Debug</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.msglib.MsglibPackage#getCommunicationSwitch()
 * @model
 * @generated
 */
public interface CommunicationSwitch extends Block {

	/**
	 * Returns the value of the '<em><b>Debug</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debug</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debug</em>' attribute.
	 * @see #setDebug(int)
	 * @see org.muml.simulink.msglib.MsglibPackage#getCommunicationSwitch_Debug()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getDebug();

	/**
	 * Sets the value of the '{@link org.muml.simulink.msglib.CommunicationSwitch#getDebug <em>Debug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debug</em>' attribute.
	 * @see #getDebug()
	 * @generated
	 */
	void setDebug(int value);
} // CommunicationSwitch
