/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeDeclaration#getSpecInit <em>Spec Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSimpleTypeDeclaration()
 * @model
 * @generated
 */
public interface SimpleTypeDeclaration extends SingleElementTypeDeclaration {
	/**
	 * Returns the value of the '<em><b>Spec Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Init</em>' containment reference.
	 * @see #setSpecInit(SimpleSpecInit)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSimpleTypeDeclaration_SpecInit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SimpleSpecInit getSpecInit();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeDeclaration#getSpecInit <em>Spec Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Init</em>' containment reference.
	 * @see #getSpecInit()
	 * @generated
	 */
	void setSpecInit(SimpleSpecInit value);

} // SimpleTypeDeclaration
