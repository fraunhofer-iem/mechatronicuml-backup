/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.AbstractFunctionBlockDeclaration;

import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureInit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FB Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance#getInit <em>Init</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance#getType <em>Type</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance#getFunctionBlockType <em>Function Block Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getFBInstance()
 * @model
 * @generated
 */
public interface FBInstance extends VarInitDeclaration, VarDeclarationOnly, NamedElement {
	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(StructureInit)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getFBInstance_Init()
	 * @model containment="true"
	 * @generated
	 */
	StructureInit getInit();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(StructureInit value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(AbstractFunctionBlockDeclaration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getFBInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	AbstractFunctionBlockDeclaration getType();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AbstractFunctionBlockDeclaration value);

	/**
	 * Returns the value of the '<em><b>Function Block Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Block Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Block Type</em>' reference.
	 * @see #setFunctionBlockType(AbstractFunctionBlockDeclaration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getFBInstance_FunctionBlockType()
	 * @model required="true"
	 * @generated
	 */
	AbstractFunctionBlockDeclaration getFunctionBlockType();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance#getFunctionBlockType <em>Function Block Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Block Type</em>' reference.
	 * @see #getFunctionBlockType()
	 * @generated
	 */
	void setFunctionBlockType(AbstractFunctionBlockDeclaration value);

} // FBInstance
