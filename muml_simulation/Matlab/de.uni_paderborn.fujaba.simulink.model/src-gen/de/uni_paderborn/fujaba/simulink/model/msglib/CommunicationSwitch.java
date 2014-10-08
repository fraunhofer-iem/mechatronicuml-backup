/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model.msglib;

import de.uni_paderborn.fujaba.simulink.model.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.msglib.CommunicationSwitch#getDebug <em>Debug</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.simulink.model.msglib.MsglibPackage#getCommunicationSwitch()
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
	 * @see de.uni_paderborn.fujaba.simulink.model.msglib.MsglibPackage#getCommunicationSwitch_Debug()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getDebug();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.simulink.model.msglib.CommunicationSwitch#getDebug <em>Debug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debug</em>' attribute.
	 * @see #getDebug()
	 * @generated
	 */
	void setDebug(int value);
} // CommunicationSwitch
