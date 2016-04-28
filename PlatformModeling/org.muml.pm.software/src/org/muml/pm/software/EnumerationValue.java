/**
 */
package org.muml.pm.software;

import org.muml.mumlcore.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class defines a possible value for an enumeration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.software.EnumerationValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.muml.pm.software.EnumerationValue#getEnumerationDataType <em>Enumeration Data Type</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.software.SoftwarePackage#getEnumerationValue()
 * @model
 * @generated
 */
public interface EnumerationValue extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value-attribute of an EnumerationValue represents the value of the EnumerationValue. This value represents the value from the concrete platform. The string given here will be used in the exactly same way in the concrete platform.
	 * 
	 * For example if the platform defines an emumeration in the following way (C-example):
	 * MyEnum {
	 * MY_VALUE1;
	 * MY_VALUE2;
	 * }
	 * In this case it should hold for the value-attribute of one EnumerationValue: value = "MY_VALUE1"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.muml.pm.software.SoftwarePackage#getEnumerationValue_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.muml.pm.software.EnumerationValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Enumeration Data Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.software.EnumerationDataType#getEnumerationValues <em>Enumeration Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Enumeration, in which this value is contained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumeration Data Type</em>' container reference.
	 * @see #setEnumerationDataType(EnumerationDataType)
	 * @see org.muml.pm.software.SoftwarePackage#getEnumerationValue_EnumerationDataType()
	 * @see org.muml.pm.software.EnumerationDataType#getEnumerationValues
	 * @model opposite="enumerationValues" required="true" transient="false"
	 * @generated
	 */
	EnumerationDataType getEnumerationDataType();

	/**
	 * Sets the value of the '{@link org.muml.pm.software.EnumerationValue#getEnumerationDataType <em>Enumeration Data Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration Data Type</em>' container reference.
	 * @see #getEnumerationDataType()
	 * @generated
	 */
	void setEnumerationDataType(EnumerationDataType value);

} // EnumerationValue
