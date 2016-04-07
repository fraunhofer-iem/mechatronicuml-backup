/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zero Order Hold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.ZeroOrderHold#getSampleTime <em>Sample Time</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.SimulinkPackage#getZeroOrderHold()
 * @model
 * @generated
 */
public interface ZeroOrderHold extends Block {
	/**
	 * Returns the value of the '<em><b>Sample Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Time</em>' attribute.
	 * @see #setSampleTime(String)
	 * @see org.muml.simulink.SimulinkPackage#getZeroOrderHold_SampleTime()
	 * @model required="true"
	 * @generated
	 */
	String getSampleTime();

	/**
	 * Sets the value of the '{@link org.muml.simulink.ZeroOrderHold#getSampleTime <em>Sample Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Time</em>' attribute.
	 * @see #getSampleTime()
	 * @generated
	 */
	void setSampleTime(String value);

} // ZeroOrderHold
