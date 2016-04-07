/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Story Pattern Object Binding Revoked</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBindingRevoked#getPreviousValue <em>Previous Value</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getStoryPatternObjectBindingRevoked()
 * @model
 * @generated
 */
public interface StoryPatternObjectBindingRevoked<StoryPatternObjectType> extends StoryPatternObjectExecution<StoryPatternObjectType>
{
	/**
	 * Returns the value of the '<em><b>Previous Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Previous Value</em>' attribute.
	 * @see #setPreviousValue(String)
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage#getStoryPatternObjectBindingRevoked_PreviousValue()
	 * @model required="true"
	 * @generated
	 */
	String getPreviousValue();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.interpreter.core.executiontrace.StoryPatternObjectBindingRevoked#getPreviousValue <em>Previous Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Previous Value</em>' attribute.
	 * @see #getPreviousValue()
	 * @generated
	 */
	void setPreviousValue(String value);

} // StoryPatternObjectBindingRevoked
