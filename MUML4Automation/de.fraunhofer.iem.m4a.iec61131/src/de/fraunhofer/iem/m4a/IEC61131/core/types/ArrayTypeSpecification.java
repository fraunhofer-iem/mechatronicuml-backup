/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeSpecification#getRanges <em>Ranges</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeSpecification#getOfType <em>Of Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getArrayTypeSpecification()
 * @model
 * @generated
 */
public interface ArrayTypeSpecification extends ArraySpecification {
	/**
	 * Returns the value of the '<em><b>Ranges</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.types.Subrange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranges</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getArrayTypeSpecification_Ranges()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Subrange> getRanges();

	/**
	 * Returns the value of the '<em><b>Of Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of Type</em>' reference.
	 * @see #setOfType(NonGenericType)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getArrayTypeSpecification_OfType()
	 * @model required="true"
	 * @generated
	 */
	NonGenericType getOfType();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeSpecification#getOfType <em>Of Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of Type</em>' reference.
	 * @see #getOfType()
	 * @generated
	 */
	void setOfType(NonGenericType value);

} // ArrayTypeSpecification
