/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Instance Object Modification</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectModification#getStoryPatternObject <em>Story Pattern Object</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectModification#getInstanceObject <em>Instance Object</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getInstanceObjectModification()
 * @model abstract="true"
 * @generated
 */
public interface InstanceObjectModification<StoryPatternObjectType> extends Execution
{
	/**
	 * Returns the value of the '<em><b>Story Pattern Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Story Pattern Object</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Story Pattern Object</em>' reference.
	 * @see #setStoryPatternObject(Object)
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getInstanceObjectModification_StoryPatternObject()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	StoryPatternObjectType getStoryPatternObject();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectModification#getStoryPatternObject <em>Story Pattern Object</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Story Pattern Object</em>' reference.
	 * @see #getStoryPatternObject()
	 * @generated
	 */
	void setStoryPatternObject(StoryPatternObjectType value);

	/**
	 * Returns the value of the '<em><b>Instance Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Object</em>' attribute.
	 * @see #setInstanceObject(String)
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getInstanceObjectModification_InstanceObject()
	 * @model required="true"
	 * @generated
	 */
	String getInstanceObject();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.interpreter.core.executiontrace.InstanceObjectModification#getInstanceObject <em>Instance Object</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Instance Object</em>' attribute.
	 * @see #getInstanceObject()
	 * @generated
	 */
	void setInstanceObject(String value);

} // InstanceObjectModification
