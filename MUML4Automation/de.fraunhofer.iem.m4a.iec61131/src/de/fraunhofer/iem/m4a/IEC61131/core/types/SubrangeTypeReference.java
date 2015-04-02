/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subrange Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeReference#getSubrangeType <em>Subrange Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSubrangeTypeReference()
 * @model
 * @generated
 */
public interface SubrangeTypeReference extends SubrangeSpecification {
	/**
	 * Returns the value of the '<em><b>Subrange Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subrange Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subrange Type</em>' reference.
	 * @see #setSubrangeType(SubrangeTypeDeclaration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSubrangeTypeReference_SubrangeType()
	 * @model required="true"
	 * @generated
	 */
	SubrangeTypeDeclaration getSubrangeType();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeReference#getSubrangeType <em>Subrange Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subrange Type</em>' reference.
	 * @see #getSubrangeType()
	 * @generated
	 */
	void setSubrangeType(SubrangeTypeDeclaration value);

} // SubrangeTypeReference
