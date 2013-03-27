/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.properties;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Property Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fujaba.properties.GroupPropertySection#getNavigatedProperties <em>Navigated Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fujaba.properties.PropertiesPackage#getGroupPropertySection()
 * @model
 * @generated
 */
public interface GroupPropertySection extends PropertySection {
	/**
	 * Returns the value of the '<em><b>Navigated Properties</b></em>' reference list.
	 * The list contents are of type {@link de.fujaba.properties.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigated Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigated Properties</em>' reference list.
	 * @see de.fujaba.properties.PropertiesPackage#getGroupPropertySection_NavigatedProperties()
	 * @model
	 * @generated
	 */
	EList<Property> getNavigatedProperties();

} // GroupPropertySection
