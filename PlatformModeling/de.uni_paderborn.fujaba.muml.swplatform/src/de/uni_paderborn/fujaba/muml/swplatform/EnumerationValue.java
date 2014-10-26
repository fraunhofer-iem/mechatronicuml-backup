/**
 */
package de.uni_paderborn.fujaba.muml.swplatform;

import org.storydriven.core.ExtendableElement;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.swplatform.EnumerationValue#getValue <em>Value</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.swplatform.EnumerationValue#getEnumerationDataType <em>Enumeration Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.swplatform.SwplatformPackage#getEnumerationValue()
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
	 * @see de.uni_paderborn.fujaba.muml.swplatform.SwplatformPackage#getEnumerationValue_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.swplatform.EnumerationValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Enumeration Data Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.swplatform.EnumerationDataType#getEnumerationValues <em>Enumeration Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Enumeration, in which this value is contained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumeration Data Type</em>' container reference.
	 * @see #setEnumerationDataType(EnumerationDataType)
	 * @see de.uni_paderborn.fujaba.muml.swplatform.SwplatformPackage#getEnumerationValue_EnumerationDataType()
	 * @see de.uni_paderborn.fujaba.muml.swplatform.EnumerationDataType#getEnumerationValues
	 * @model opposite="enumerationValues" required="true" transient="false"
	 * @generated
	 */
	EnumerationDataType getEnumerationDataType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.swplatform.EnumerationValue#getEnumerationDataType <em>Enumeration Data Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration Data Type</em>' container reference.
	 * @see #getEnumerationDataType()
	 * @generated
	 */
	void setEnumerationDataType(EnumerationDataType value);

} // EnumerationValue
