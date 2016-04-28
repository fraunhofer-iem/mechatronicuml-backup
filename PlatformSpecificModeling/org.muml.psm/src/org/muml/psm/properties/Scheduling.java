/**
 */
package org.muml.psm.properties;

import org.muml.mumlcore.Extension;
import org.muml.pim.valuetype.NaturalNumber;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.properties.Scheduling#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link org.muml.psm.properties.Scheduling#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.muml.psm.properties.Scheduling#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.properties.PropertiesPackage#getScheduling()
 * @model
 * @generated
 */
public interface Scheduling extends Extension {
	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' containment reference.
	 * @see #setDeadline(TimeValue)
	 * @see org.muml.psm.properties.PropertiesPackage#getScheduling_Deadline()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getDeadline();

	/**
	 * Sets the value of the '{@link org.muml.psm.properties.Scheduling#getDeadline <em>Deadline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' containment reference.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(TimeValue)
	 * @see org.muml.psm.properties.PropertiesPackage#getScheduling_Period()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getPeriod();

	/**
	 * Sets the value of the '{@link org.muml.psm.properties.Scheduling#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(NaturalNumber)
	 * @see org.muml.psm.properties.PropertiesPackage#getScheduling_Priority()
	 * @model containment="true"
	 * @generated
	 */
	NaturalNumber getPriority();

	/**
	 * Sets the value of the '{@link org.muml.psm.properties.Scheduling#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(NaturalNumber value);

} // Scheduling
