/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Execution Trace</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace#getExecutions <em>Executions</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace#getDescription <em>Description</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace#getTotalExecutionTime <em>Total Execution Time</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace#getTotalExecutionTimeMsec <em>Total Execution Time Msec</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getExecutionTrace()
 * @model
 * @generated
 */
public interface ExecutionTrace extends EObject
{
	/**
	 * Returns the value of the '<em><b>Executions</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.muml.storydiagram.interpreter.core.executiontrace.Execution}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executions</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Executions</em>' containment reference
	 *         list.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage#getExecutionTrace_Executions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Execution> getExecutions();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage#getExecutionTrace_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTrace#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Total Execution Time</b></em>'
	 * attribute. The default value is <code>"0"</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc --> The sum of the execution
	 * times of all contained executions in nanoseconds. Convert this to other
	 * time units using the utility functions in TimeUnits.NANOTIME. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Total Execution Time</em>' attribute.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage#getExecutionTrace_TotalExecutionTime()
	 * @model default="0" transient="true" changeable="false" volatile="true"
	 *        derived="true"
	 * @generated
	 */
	long getTotalExecutionTime();

	/**
	 * Returns the value of the '<em><b>Total Execution Time Msec</b></em>'
	 * attribute. The default value is <code>"0"</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc --> The sum of the execution
	 * times of all contained executions in nanoseconds. Convert this to other
	 * time units using the utility functions in TimeUnits.NANOTIME. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Total Execution Time Msec</em>' attribute.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage#getExecutionTrace_TotalExecutionTimeMsec()
	 * @model default="0" transient="true" changeable="false" volatile="true"
	 *        derived="true"
	 * @generated
	 */
	long getTotalExecutionTimeMsec();

} // ExecutionTrace
