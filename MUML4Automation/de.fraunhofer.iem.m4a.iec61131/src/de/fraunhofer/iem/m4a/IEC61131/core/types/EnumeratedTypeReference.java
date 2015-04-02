/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeReference#getEnumeratedType <em>Enumerated Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getEnumeratedTypeReference()
 * @model
 * @generated
 */
public interface EnumeratedTypeReference extends EnumeratedSpecification {
	/**
	 * Returns the value of the '<em><b>Enumerated Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerated Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerated Type</em>' reference.
	 * @see #setEnumeratedType(EnumeratedTypeDeclaration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getEnumeratedTypeReference_EnumeratedType()
	 * @model required="true"
	 * @generated
	 */
	EnumeratedTypeDeclaration getEnumeratedType();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeReference#getEnumeratedType <em>Enumerated Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumerated Type</em>' reference.
	 * @see #getEnumeratedType()
	 * @generated
	 */
	void setEnumeratedType(EnumeratedTypeDeclaration value);

} // EnumeratedTypeReference
