/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeReference#getSimpleType <em>Simple Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSimpleTypeReference()
 * @model
 * @generated
 */
public interface SimpleTypeReference extends SimpleSpecification {
	/**
	 * Returns the value of the '<em><b>Simple Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Type</em>' reference.
	 * @see #setSimpleType(SimpleTypeDeclaration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSimpleTypeReference_SimpleType()
	 * @model required="true"
	 * @generated
	 */
	SimpleTypeDeclaration getSimpleType();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeReference#getSimpleType <em>Simple Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Type</em>' reference.
	 * @see #getSimpleType()
	 * @generated
	 */
	void setSimpleType(SimpleTypeDeclaration value);

} // SimpleTypeReference
