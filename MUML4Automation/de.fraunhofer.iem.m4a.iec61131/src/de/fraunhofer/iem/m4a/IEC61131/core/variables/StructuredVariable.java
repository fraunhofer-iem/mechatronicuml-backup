/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.variables;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.StructuredVariable#getRecordVariable <em>Record Variable</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.StructuredVariable#getFieldSelector <em>Field Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage#getStructuredVariable()
 * @model
 * @generated
 */
public interface StructuredVariable extends MultiElementVariable {
	/**
	 * Returns the value of the '<em><b>Record Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Variable</em>' containment reference.
	 * @see #setRecordVariable(SymbolicVariable)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage#getStructuredVariable_RecordVariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SymbolicVariable getRecordVariable();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.StructuredVariable#getRecordVariable <em>Record Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Variable</em>' containment reference.
	 * @see #getRecordVariable()
	 * @generated
	 */
	void setRecordVariable(SymbolicVariable value);

	/**
	 * Returns the value of the '<em><b>Field Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Selector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Selector</em>' containment reference.
	 * @see #setFieldSelector(FieldSelector)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage#getStructuredVariable_FieldSelector()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FieldSelector getFieldSelector();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.StructuredVariable#getFieldSelector <em>Field Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Selector</em>' containment reference.
	 * @see #getFieldSelector()
	 * @generated
	 */
	void setFieldSelector(FieldSelector value);

} // StructuredVariable
