/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model.msglib.buffer;

import de.uni_paderborn.fujaba.simulink.model.stateflow.EmbeddedFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.msglib.buffer.BufferFunction#getBufferSize <em>Buffer Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.simulink.model.msglib.buffer.BufferPackage#getBufferFunction()
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
	 * @see de.uni_paderborn.fujaba.simulink.model.msglib.buffer.BufferPackage#getBufferFunction_BufferSize()
	 * @model default="10" required="true"
	 * @generated
	 */
	int getBufferSize();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.simulink.model.msglib.buffer.BufferFunction#getBufferSize <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' attribute.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(int value);

} // BufferFunction
