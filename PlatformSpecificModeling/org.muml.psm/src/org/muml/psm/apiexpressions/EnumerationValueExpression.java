/**
 */
package org.muml.psm.apiexpressions;

import org.muml.core.expressions.Expression;
import org.muml.pm.software.EnumerationValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Value Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an EnumerationValue at runtime. At runtime the Enumeration is bound to one of its possible values. This means, that a concrete EnumerationValue will be mapped to the Enumeration from the swplatform-package.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.apiexpressions.EnumerationValueExpression#getEnumValue <em>Enum Value</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.apiexpressions.ApiexpressionsPackage#getEnumerationValueExpression()
 * @model
 * @generated
 */
public interface EnumerationValueExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Enum Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EnumerationValue to which this expression belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enum Value</em>' reference.
	 * @see #setEnumValue(EnumerationValue)
	 * @see org.muml.psm.apiexpressions.ApiexpressionsPackage#getEnumerationValueExpression_EnumValue()
	 * @model required="true"
	 * @generated
	 */
	EnumerationValue getEnumValue();

	/**
	 * Sets the value of the '{@link org.muml.psm.apiexpressions.EnumerationValueExpression#getEnumValue <em>Enum Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Value</em>' reference.
	 * @see #getEnumValue()
	 * @generated
	 */
	void setEnumValue(EnumerationValue value);

} // EnumerationValueExpression
