/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Embedded Matlab Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.EmbeddedMatlabFunction#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.SimulinkPackage#getEmbeddedMatlabFunction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints=''"
 * @generated
 */
public interface EmbeddedMatlabFunction extends Block {

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.muml.simulink.SimulinkPackage#getEmbeddedMatlabFunction_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.muml.simulink.EmbeddedMatlabFunction#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);
} // EmbeddedMatlabFunction
