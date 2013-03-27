/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.properties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Property Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fujaba.properties.TextPropertySection#isMultiLine <em>Multi Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fujaba.properties.PropertiesPackage#getTextPropertySection()
 * @model
 * @generated
 */
public interface TextPropertySection extends PropertySection {
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
	 * @see de.fujaba.properties.PropertiesPackage#getTextPropertySection_MultiLine()
	 * @model required="true"
	 * @generated
	 */
	boolean isMultiLine();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.TextPropertySection#isMultiLine <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Line</em>' attribute.
	 * @see #isMultiLine()
	 * @generated
	 */
	void setMultiLine(boolean value);

} // TextPropertySection
