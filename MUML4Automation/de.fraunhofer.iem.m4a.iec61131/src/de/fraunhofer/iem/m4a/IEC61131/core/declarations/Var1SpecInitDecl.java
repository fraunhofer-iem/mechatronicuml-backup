/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var1 Spec Init Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInitDecl#getSpecInit <em>Spec Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getVar1SpecInitDecl()
 * @model
 * @generated
 */
public interface Var1SpecInitDecl extends NamedVariableDeclaration, LocatedVarSpecInit {
	/**
	 * Returns the value of the '<em><b>Spec Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Init</em>' containment reference.
	 * @see #setSpecInit(Var1SpecInit)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getVar1SpecInitDecl_SpecInit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Var1SpecInit getSpecInit();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInitDecl#getSpecInit <em>Spec Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Init</em>' containment reference.
	 * @see #getSpecInit()
	 * @generated
	 */
	void setSpecInit(Var1SpecInit value);

} // Var1SpecInitDecl
