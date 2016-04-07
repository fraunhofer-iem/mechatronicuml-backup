/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Variable Modification</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableModification#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableModification#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableModification#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage#getVariableModification()
 * @model abstract="true"
 * @generated
 */
public interface VariableModification<ClassifierType> extends Execution
{
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage#getVariableModification_VariableName()
	 * @model required="true"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableModification#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see #setClassifier(Object)
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage#getVariableModification_Classifier()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	ClassifierType getClassifier();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableModification#getClassifier <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(ClassifierType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.muml.storydiagram.interpreter.core.executiontrace.ExecutionTracePackage#getVariableModification_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.interpreter.core.executiontrace.VariableModification#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // VariableModification
