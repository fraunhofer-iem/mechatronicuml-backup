/**
 */
package de.uni_paderborn.fujaba.properties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spinner Property Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.properties.SpinnerPropertyEditor#getDigits <em>Digits</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getSpinnerPropertyEditor()
 * @model
 * @generated
 */
public interface SpinnerPropertyEditor extends PropertyEditor {
	/**
	 * Returns the value of the '<em><b>Digits</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digits</em>' attribute.
	 * @see #setDigits(int)
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getSpinnerPropertyEditor_Digits()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getDigits();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.properties.SpinnerPropertyEditor#getDigits <em>Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digits</em>' attribute.
	 * @see #getDigits()
	 * @generated
	 */
	void setDigits(int value);

} // SpinnerPropertyEditor
