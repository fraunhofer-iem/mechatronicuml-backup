/**
 */
package de.uni_paderborn.uppaal.declarations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A parameter of a function or template.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.uppaal.declarations.Parameter#getCallType <em>Call Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.uppaal.declarations.DeclarationsPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Variable {
	/**
	 * Returns the value of the '<em><b>Call Type</b></em>' attribute.
	 * The default value is <code>"CALL_BY_VALUE"</code>.
	 * The literals are from the enumeration {@link de.uni_paderborn.uppaal.declarations.CallType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether call-by-value or call-by-reference semantics should be applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Call Type</em>' attribute.
	 * @see de.uni_paderborn.uppaal.declarations.CallType
	 * @see #setCallType(CallType)
	 * @see de.uni_paderborn.uppaal.declarations.DeclarationsPackage#getParameter_CallType()
	 * @model default="CALL_BY_VALUE"
	 * @generated
	 */
	CallType getCallType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.uppaal.declarations.Parameter#getCallType <em>Call Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Type</em>' attribute.
	 * @see de.uni_paderborn.uppaal.declarations.CallType
	 * @see #getCallType()
	 * @generated
	 */
	void setCallType(CallType value);

} // Parameter
