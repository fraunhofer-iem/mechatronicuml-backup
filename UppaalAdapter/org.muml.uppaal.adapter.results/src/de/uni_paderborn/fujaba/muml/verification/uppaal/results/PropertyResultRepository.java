/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.results;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Result Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.results.PropertyResultRepository#getResults <em>Results</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.results.ResultsPackage#getPropertyResultRepository()
 * @model
 * @generated
 */
public interface PropertyResultRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.verification.uppaal.results.PropertyResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.results.ResultsPackage#getPropertyResultRepository_Results()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyResult> getResults();

} // PropertyResultRepository
