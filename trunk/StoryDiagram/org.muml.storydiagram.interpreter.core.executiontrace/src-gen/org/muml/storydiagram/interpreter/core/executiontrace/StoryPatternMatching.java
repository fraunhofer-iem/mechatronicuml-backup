/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Story Pattern Matching</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternMatching#isSuccessful <em>Successful</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getStoryPatternMatching()
 * @model
 * @generated
 */
public interface StoryPatternMatching<StoryPatternType> extends StoryPatternExecution<StoryPatternType>
{
	/**
	 * Returns the value of the '<em><b>Successful</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successful</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Successful</em>' attribute.
	 * @see #setSuccessful(boolean)
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage#getStoryPatternMatching_Successful()
	 * @model
	 * @generated
	 */
	boolean isSuccessful();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternMatching#isSuccessful <em>Successful</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Successful</em>' attribute.
	 * @see #isSuccessful()
	 * @generated
	 */
	void setSuccessful(boolean value);

} // StoryPatternMatching
