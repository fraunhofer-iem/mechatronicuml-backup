/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Var Declaration Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclarationContainer#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclarationContainer#getGlobalAttribute <em>Global Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getGlobalVarDeclarationContainer()
 * @model
 * @generated
 */
public interface GlobalVarDeclarationContainer extends ConfigurationVariableDeclaration, ResourceVariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getGlobalVarDeclarationContainer_Declarations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GlobalVarDeclaration> getDeclarations();

	/**
	 * Returns the value of the '<em><b>Global Attribute</b></em>' attribute.
	 * The literals are from the enumeration {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Attribute</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalAttribute
	 * @see #setGlobalAttribute(GlobalAttribute)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getGlobalVarDeclarationContainer_GlobalAttribute()
	 * @model
	 * @generated
	 */
	GlobalAttribute getGlobalAttribute();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclarationContainer#getGlobalAttribute <em>Global Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Attribute</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalAttribute
	 * @see #getGlobalAttribute()
	 * @generated
	 */
	void setGlobalAttribute(GlobalAttribute value);

} // GlobalVarDeclarationContainer
