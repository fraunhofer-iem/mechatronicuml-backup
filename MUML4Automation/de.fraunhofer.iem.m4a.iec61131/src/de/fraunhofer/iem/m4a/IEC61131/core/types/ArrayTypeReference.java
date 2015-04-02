/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeReference#getArrayType <em>Array Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getArrayTypeReference()
 * @model
 * @generated
 */
public interface ArrayTypeReference extends ArraySpecification {
	/**
	 * Returns the value of the '<em><b>Array Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Type</em>' reference.
	 * @see #setArrayType(ArrayTypeDeclaration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getArrayTypeReference_ArrayType()
	 * @model required="true"
	 * @generated
	 */
	ArrayTypeDeclaration getArrayType();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeReference#getArrayType <em>Array Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Type</em>' reference.
	 * @see #getArrayType()
	 * @generated
	 */
	void setArrayType(ArrayTypeDeclaration value);

} // ArrayTypeReference
