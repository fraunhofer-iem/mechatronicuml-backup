/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Story Pattern Constraint Evaluation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintEvaluation#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getStoryPatternConstraintEvaluation()
 * @model abstract="true"
 * @generated
 */
public interface StoryPatternConstraintEvaluation<StoryPatternType, ExpressionType> extends StoryPatternExecution<StoryPatternType>
{
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Constraint</em>' reference.
	 * @see #setConstraint(Object)
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage#getStoryPatternConstraintEvaluation_Constraint()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	ExpressionType getConstraint();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternConstraintEvaluation#getConstraint <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(ExpressionType value);

} // StoryPatternConstraintEvaluation
