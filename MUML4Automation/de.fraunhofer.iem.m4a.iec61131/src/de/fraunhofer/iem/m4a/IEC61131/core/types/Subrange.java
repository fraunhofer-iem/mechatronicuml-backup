/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.SignedInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subrange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.Subrange#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.Subrange#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSubrange()
 * @model
 * @generated
 */
public interface Subrange extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(SignedInteger)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSubrange_LowerBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignedInteger getLowerBound();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.Subrange#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(SignedInteger value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(SignedInteger)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSubrange_UpperBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignedInteger getUpperBound();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.Subrange#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(SignedInteger value);

} // Subrange
