/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Execution</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution#getExecutionStartedTimeStamp <em>Execution Started Time Stamp</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution#getExecutionFinishedTimeStamp <em>Execution Finished Time Stamp</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution#getExecutionTimeMsec <em>Execution Time Msec</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution#getElements <em>Elements</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getExecution()
 * @model abstract="true"
 * @generated
 */
public interface Execution extends EObject
{
	/**
	 * Returns the value of the '<em><b>Execution Started Time Stamp</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Started Time Stamp</em>' attribute
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Started Time Stamp</em>' attribute.
	 * @see #setExecutionStartedTimeStamp(long)
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getExecution_ExecutionStartedTimeStamp()
	 * @model default="0" required="true"
	 * @generated
	 */
	long getExecutionStartedTimeStamp();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution#getExecutionStartedTimeStamp <em>Execution Started Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Started Time Stamp</em>' attribute.
	 * @see #getExecutionStartedTimeStamp()
	 * @generated
	 */
	void setExecutionStartedTimeStamp(long value);

	/**
	 * Returns the value of the '<em><b>Execution Finished Time Stamp</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Finished Time Stamp</em>' attribute
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Finished Time Stamp</em>' attribute.
	 * @see #setExecutionFinishedTimeStamp(long)
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getExecution_ExecutionFinishedTimeStamp()
	 * @model default="0" required="true"
	 * @generated
	 */
	long getExecutionFinishedTimeStamp();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution#getExecutionFinishedTimeStamp <em>Execution Finished Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Finished Time Stamp</em>' attribute.
	 * @see #getExecutionFinishedTimeStamp()
	 * @generated
	 */
	void setExecutionFinishedTimeStamp(long value);

	/**
	 * Returns the value of the '<em><b>Execution Time</b></em>' attribute. The
	 * default value is <code>"0"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc --> The execution time in
	 * nanoseconds. Convert this to other time units using the utility functions
	 * in TimeUnits.NANOTIME. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Execution Time</em>' attribute.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage#getExecution_ExecutionTime()
	 * @model default="0" transient="true" changeable="false" volatile="true"
	 *        derived="true"
	 * @generated
	 */
	long getExecutionTime();

	/**
	 * Returns the value of the '<em><b>Execution Time Msec</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Time Msec</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Time Msec</em>' attribute.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getExecution_ExecutionTimeMsec()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	long getExecutionTimeMsec();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.storydiagram.interpreter.core.executiontrace.Execution}.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getExecution_Elements()
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.Execution#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Execution> getElements();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Execution)
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getExecution_Container()
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.Execution#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	Execution getContainer();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.interpreter.core.executiontrace.Execution#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Execution value);

} // Execution
