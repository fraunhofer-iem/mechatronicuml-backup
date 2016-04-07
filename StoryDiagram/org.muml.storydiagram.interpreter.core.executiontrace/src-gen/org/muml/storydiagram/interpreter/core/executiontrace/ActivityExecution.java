/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Activity Execution</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution#getInParameterValues <em>In Parameter Values</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution#getOutParameterValues <em>Out Parameter Values</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getActivityExecution()
 * @model
 * @generated
 */
public interface ActivityExecution<ActivityType> extends Execution
{
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Object)
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage#getActivityExecution_Activity()
	 * @model kind="reference"
	 * @generated
	 */
	ActivityType getActivity();

	/**
	 * Sets the value of the '
	 * {@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution#getActivity
	 * <em>Activity</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(ActivityType value);

	/**
	 * Returns the value of the '<em><b>In Parameter Values</b></em>' map.
	 * The key is of type {@link KeyType},
	 * and the value is of type {@link ValueType},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Parameter Values</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Parameter Values</em>' map.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getActivityExecution_InParameterValues()
	 * @model mapType="org.muml.storydiagram.interpreter.core.executiontrace.MapEntry<KeyType, ValueType>"
	 * @generated
	 */
	EMap<String, String> getInParameterValues();

	/**
	 * Returns the value of the '<em><b>Out Parameter Values</b></em>' map.
	 * The key is of type {@link KeyType},
	 * and the value is of type {@link ValueType},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Parameter Values</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Parameter Values</em>' map.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getActivityExecution_OutParameterValues()
	 * @model mapType="org.muml.storydiagram.interpreter.core.executiontrace.MapEntry<KeyType, ValueType>"
	 * @generated
	 */
	EMap<String, String> getOutParameterValues();

} // ActivityExecution
