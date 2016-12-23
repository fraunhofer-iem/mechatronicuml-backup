/**
 */
package org.muml.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for an Extension that can be defined for an object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.core.Extension#getExtendableBase <em>Extendable Base</em>}</li>
 * </ul>
 *
 * @see org.muml.core.CorePackage#getExtension()
 * @model abstract="true"
 * @generated
 */
public interface Extension extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Extendable Base</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.core.ExtendableElement#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The extendable element that is extended by this extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extendable Base</em>' container reference.
	 * @see #setExtendableBase(ExtendableElement)
	 * @see org.muml.core.CorePackage#getExtension_ExtendableBase()
	 * @see org.muml.core.ExtendableElement#getExtensions
	 * @model opposite="extensions" transient="false" ordered="false"
	 * @generated
	 */
	ExtendableElement getExtendableBase();

	/**
	 * Sets the value of the '{@link org.muml.core.Extension#getExtendableBase <em>Extendable Base</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extendable Base</em>' container reference.
	 * @see #getExtendableBase()
	 * @generated
	 */
	void setExtendableBase(ExtendableElement value);

} // Extension
