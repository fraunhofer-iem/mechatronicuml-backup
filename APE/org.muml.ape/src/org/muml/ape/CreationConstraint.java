/**
 */
package org.muml.ape;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.ape.CreationConstraint#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @see org.muml.ape.PropertiesPackage#getCreationConstraint()
 * @model
 * @generated
 */
public interface CreationConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.ape.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see org.muml.ape.PropertiesPackage#getCreationConstraint_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getFilters();

} // CreationConstraint
