/**
 */
package de.uni_paderborn.fujaba.properties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Property Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.properties.CustomPropertyEditor#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getCustomPropertyEditor()
 * @model
 * @generated
 */
public interface CustomPropertyEditor extends PropertyEditor {
	/**
	 * Returns the value of the '<em><b>Fully Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fully Qualified Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fully Qualified Class Name</em>' attribute.
	 * @see #setFullyQualifiedClassName(String)
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getCustomPropertyEditor_FullyQualifiedClassName()
	 * @model required="true"
	 * @generated
	 */
	String getFullyQualifiedClassName();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.properties.CustomPropertyEditor#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fully Qualified Class Name</em>' attribute.
	 * @see #getFullyQualifiedClassName()
	 * @generated
	 */
	void setFullyQualifiedClassName(String value);

} // CustomPropertyEditor
