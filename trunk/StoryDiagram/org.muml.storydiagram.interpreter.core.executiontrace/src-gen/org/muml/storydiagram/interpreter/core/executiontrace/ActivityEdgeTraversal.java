/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Activity Edge Traversal</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityEdgeTraversal#getActivityEdge <em>Activity Edge</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getActivityEdgeTraversal()
 * @model
 * @generated
 */
public interface ActivityEdgeTraversal<ActivityEdgeType> extends Execution
{
	/**
	 * Returns the value of the '<em><b>Activity Edge</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Edge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Activity Edge</em>' reference.
	 * @see #setActivityEdge(Object)
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage#getActivityEdgeTraversal_ActivityEdge()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	ActivityEdgeType getActivityEdge();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityEdgeTraversal#getActivityEdge <em>Activity Edge</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Activity Edge</em>' reference.
	 * @see #getActivityEdge()
	 * @generated
	 */
	void setActivityEdge(ActivityEdgeType value);

} // ActivityEdgeTraversal
