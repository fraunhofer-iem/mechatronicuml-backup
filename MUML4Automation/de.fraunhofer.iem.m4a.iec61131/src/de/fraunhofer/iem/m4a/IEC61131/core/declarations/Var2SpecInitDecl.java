/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var2 Spec Init Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInitDecl#getSpecInit <em>Spec Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getVar2SpecInitDecl()
 * @model
 * @generated
 */
public interface Var2SpecInitDecl extends NamedVariableDeclaration, VarInitDeclaration {
	/**
	 * Returns the value of the '<em><b>Spec Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Init</em>' containment reference.
	 * @see #setSpecInit(Var2SpecInit)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getVar2SpecInitDecl_SpecInit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Var2SpecInit getSpecInit();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInitDecl#getSpecInit <em>Spec Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Init</em>' containment reference.
	 * @see #getSpecInit()
	 * @generated
	 */
	void setSpecInit(Var2SpecInit value);

} // Var2SpecInitDecl
