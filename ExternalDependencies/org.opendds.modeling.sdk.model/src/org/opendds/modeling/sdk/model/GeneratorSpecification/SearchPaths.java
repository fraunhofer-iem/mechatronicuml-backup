/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Paths</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.SearchPaths#getSearchLocation <em>Search Location</em>}</li>
 * </ul>
 *
 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getSearchPaths()
 * @model
 * @generated
 */
public interface SearchPaths extends EObject {
	/**
	 * Returns the value of the '<em><b>Search Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.opendds.modeling.sdk.model.GeneratorSpecification.SearchLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Location</em>' containment reference list.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getSearchPaths_SearchLocation()
	 * @model containment="true"
	 * @generated
	 */
	EList<SearchLocation> getSearchLocation();

} // SearchPaths
