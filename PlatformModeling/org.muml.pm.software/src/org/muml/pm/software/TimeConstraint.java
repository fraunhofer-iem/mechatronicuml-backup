/**
 */
package org.muml.pm.software;

import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a constraint in that way, that an API-command should only be called in a given time. E.g. It can be that the API-command doesn't return valid values, if the API-command is called to often within a time period.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.software.TimeConstraint#getSamplingTime <em>Sampling Time</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.software.SoftwarePackage#getTimeConstraint()
 * @model
 * @generated
 */
public interface TimeConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Sampling Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sampling time say how often one can call an API-command.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sampling Time</em>' containment reference.
	 * @see #setSamplingTime(TimeValue)
	 * @see org.muml.pm.software.SoftwarePackage#getTimeConstraint_SamplingTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getSamplingTime();

	/**
	 * Sets the value of the '{@link org.muml.pm.software.TimeConstraint#getSamplingTime <em>Sampling Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Time</em>' containment reference.
	 * @see #getSamplingTime()
	 * @generated
	 */
	void setSamplingTime(TimeValue value);

} // TimeConstraint
