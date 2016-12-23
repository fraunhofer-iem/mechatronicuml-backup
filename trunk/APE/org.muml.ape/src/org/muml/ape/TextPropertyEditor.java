/**
 */
package org.muml.ape;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Property Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.ape.TextPropertyEditor#isMultiLine <em>Multi Line</em>}</li>
 * </ul>
 *
 * @see org.muml.ape.PropertiesPackage#getTextPropertyEditor()
 * @model
 * @generated
 */
public interface TextPropertyEditor extends PropertyEditor {
	/**
	 * Returns the value of the '<em><b>Multi Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Line</em>' attribute.
	 * @see #setMultiLine(boolean)
	 * @see org.muml.ape.PropertiesPackage#getTextPropertyEditor_MultiLine()
	 * @model required="true"
	 * @generated
	 */
	boolean isMultiLine();

	/**
	 * Sets the value of the '{@link org.muml.ape.TextPropertyEditor#isMultiLine <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Line</em>' attribute.
	 * @see #isMultiLine()
	 * @generated
	 */
	void setMultiLine(boolean value);

} // TextPropertyEditor
