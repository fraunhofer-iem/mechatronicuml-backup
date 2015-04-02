/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var1 Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Decl#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getVar1Decl()
 * @model abstract="true"
 * @generated
 */
public interface Var1Decl extends TempVarDeclaration, NamedVariableDeclaration {

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(Var1Specification)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getVar1Decl_Specification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Var1Specification getSpecification();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1Decl#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Var1Specification value);
} // Var1Decl
