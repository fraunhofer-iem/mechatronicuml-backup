/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeDeclaration#getSpecInit <em>Spec Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getEnumeratedTypeDeclaration()
 * @model
 * @generated
 */
public interface EnumeratedTypeDeclaration extends SingleElementTypeDeclaration {
	/**
	 * Returns the value of the '<em><b>Spec Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Init</em>' containment reference.
	 * @see #setSpecInit(EnumeratedSpecInit)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getEnumeratedTypeDeclaration_SpecInit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EnumeratedSpecInit getSpecInit();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeDeclaration#getSpecInit <em>Spec Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Init</em>' containment reference.
	 * @see #getSpecInit()
	 * @generated
	 */
	void setSpecInit(EnumeratedSpecInit value);

} // EnumeratedTypeDeclaration
