/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.msglib.buffer;

import org.muml.simulink.stateflow.EmbeddedFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.msglib.buffer.BufferFunction#getBufferSize <em>Buffer Size</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.msglib.buffer.BufferPackage#getBufferFunction()
 * @model
 * @generated
 */
public interface BufferFunction extends EmbeddedFunction {
	/**
	 * Returns the value of the '<em><b>Buffer Size</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Size</em>' attribute.
	 * @see #setBufferSize(int)
	 * @see org.muml.simulink.msglib.buffer.BufferPackage#getBufferFunction_BufferSize()
	 * @model default="10" required="true"
	 * @generated
	 */
	int getBufferSize();

	/**
	 * Sets the value of the '{@link org.muml.simulink.msglib.buffer.BufferFunction#getBufferSize <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' attribute.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(int value);

} // BufferFunction
