/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.results;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Property;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.results.PropertyResult#getProperty <em>Property</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.results.PropertyResult#isFulfilled <em>Fulfilled</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.results.PropertyResult#getSubPropertyResults <em>Sub Property Results</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.results.ResultsPackage#getPropertyResult()
 * @model
 * @generated
 */
public interface PropertyResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.results.ResultsPackage#getPropertyResult_Property()
	 * @model
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.results.PropertyResult#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Fulfilled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulfilled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfilled</em>' attribute.
	 * @see #setFulfilled(boolean)
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.results.ResultsPackage#getPropertyResult_Fulfilled()
	 * @model default="false"
	 * @generated
	 */
	boolean isFulfilled();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.results.PropertyResult#isFulfilled <em>Fulfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fulfilled</em>' attribute.
	 * @see #isFulfilled()
	 * @generated
	 */
	void setFulfilled(boolean value);

	/**
	 * Returns the value of the '<em><b>Sub Property Results</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.verification.uppaal.results.PropertyResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Property Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Property Results</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.results.ResultsPackage#getPropertyResult_SubPropertyResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyResult> getSubPropertyResults();

} // PropertyResult
