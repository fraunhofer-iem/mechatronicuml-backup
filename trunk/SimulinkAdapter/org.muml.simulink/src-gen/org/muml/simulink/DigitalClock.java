/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.DigitalClock#getSampleTime <em>Sample Time</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.SimulinkPackage#getDigitalClock()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='digitalClockNeedsExactlyOneOutport'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL digitalClockNeedsExactlyOneOutport='self.outPorts->size() = 1'"
 * @generated
 */
public interface DigitalClock extends Block {
	/**
	 * Returns the value of the '<em><b>Sample Time</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Time</em>' attribute.
	 * @see #setSampleTime(double)
	 * @see org.muml.simulink.SimulinkPackage#getDigitalClock_SampleTime()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	double getSampleTime();

	/**
	 * Sets the value of the '{@link org.muml.simulink.DigitalClock#getSampleTime <em>Sample Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Time</em>' attribute.
	 * @see #getSampleTime()
	 * @generated
	 */
	void setSampleTime(double value);

} // DigitalClock
