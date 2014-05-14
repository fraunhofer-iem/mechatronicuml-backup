/**
 */
package de.uni_paderborn.fujaba.properties;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.properties.CreationConstraint#getFilters <em>Filters</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getCreationConstraint()
 * @model
 * @generated
 */
public interface CreationConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Filters</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.properties.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' reference list.
	 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getCreationConstraint_Filters()
	 * @model
	 * @generated
	 */
	EList<Filter> getFilters();

} // CreationConstraint
