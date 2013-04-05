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
 *   <li>{@link de.fujaba.properties.GroupPropertySection#getReferencedProperties <em>Referenced Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fujaba.properties.PropertiesPackage#getGroupPropertySection()
 * @model
 * @generated
 */
public interface GroupPropertySection extends PropertySection {
	/**
	 * Returns the value of the '<em><b>Referenced Properties</b></em>' containment reference list.
	 * The list contents are of type {@link de.fujaba.properties.PropertyReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Properties</em>' containment reference list.
	 * @see de.fujaba.properties.PropertiesPackage#getGroupPropertySection_ReferencedProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyReference> getReferencedProperties();

} // GroupPropertySection
