/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.IntegerLiteral;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration#getSingle <em>Single</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration#getInterval <em>Interval</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getTaskConfiguration()
 * @model
 * @generated
 */
public interface TaskConfiguration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single</em>' containment reference.
	 * @see #setSingle(DataSource)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getTaskConfiguration_Single()
	 * @model containment="true"
	 * @generated
	 */
	DataSource getSingle();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration#getSingle <em>Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single</em>' containment reference.
	 * @see #getSingle()
	 * @generated
	 */
	void setSingle(DataSource value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' containment reference.
	 * @see #setInterval(DataSource)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getTaskConfiguration_Interval()
	 * @model containment="true"
	 * @generated
	 */
	DataSource getInterval();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration#getInterval <em>Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' containment reference.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(DataSource value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(IntegerLiteral)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getTaskConfiguration_Priority()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntegerLiteral getPriority();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(IntegerLiteral value);

} // TaskConfiguration
