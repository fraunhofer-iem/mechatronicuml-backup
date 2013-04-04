/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.properties;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fujaba.properties.PropertySection#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fujaba.properties.PropertiesPackage#getPropertySection()
 * @model abstract="true"
 * @generated
 */
public interface PropertySection extends EObject {

	/**
	 * Returns the value of the '<em><b>Property</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fujaba.properties.Property#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' container reference.
	 * @see #setProperty(Property)
	 * @see de.fujaba.properties.PropertiesPackage#getPropertySection_Property()
	 * @see de.fujaba.properties.Property#getSection
	 * @model opposite="section" required="true" transient="false"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link de.fujaba.properties.PropertySection#getProperty <em>Property</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' container reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);
} // PropertySection
