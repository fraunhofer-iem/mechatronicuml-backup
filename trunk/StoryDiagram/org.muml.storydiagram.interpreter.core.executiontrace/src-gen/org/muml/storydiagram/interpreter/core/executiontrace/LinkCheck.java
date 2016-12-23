/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Link Check</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.LinkCheck#getTargetObject <em>Target Object</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getLinkCheck()
 * @model abstract="true"
 * @generated
 */
public interface LinkCheck<StoryPatternLinkType, StoryPatternObjectType> extends
		StoryPatternLinkExecution<StoryPatternLinkType, StoryPatternObjectType>
{
	/**
	 * Returns the value of the '<em><b>Target Object</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target Object</em>' attribute.
	 * @see #setTargetObject(String)
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage#getLinkCheck_TargetObject()
	 * @model
	 * @generated
	 */
	String getTargetObject();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.interpreter.core.executiontrace.LinkCheck#getTargetObject <em>Target Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Target Object</em>' attribute.
	 * @see #getTargetObject()
	 * @generated
	 */
	void setTargetObject(String value);

} // LinkCheck
