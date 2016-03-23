/**
 */
package org.muml.ape;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.ape.PropertyEditor#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see org.muml.ape.PropertiesPackage#getPropertyEditor()
 * @model abstract="true"
 * @generated
 */
public interface PropertyEditor extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.ape.Property#getEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' container reference.
	 * @see #setProperty(Property)
	 * @see org.muml.ape.PropertiesPackage#getPropertyEditor_Property()
	 * @see org.muml.ape.Property#getEditor
	 * @model opposite="editor" required="true" transient="false"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link org.muml.ape.PropertyEditor#getProperty <em>Property</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' container reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

} // PropertyEditor
