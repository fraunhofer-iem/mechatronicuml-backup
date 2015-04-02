/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Var Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.OutputVarContainer#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.OutputVarContainer#isRetain <em>Retain</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getOutputVarContainer()
 * @model
 * @generated
 */
public interface OutputVarContainer extends IOVarDeclaration {
	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarInitDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getOutputVarContainer_Declarations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VarInitDeclaration> getDeclarations();

	/**
	 * Returns the value of the '<em><b>Retain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retain</em>' attribute.
	 * @see #setRetain(boolean)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getOutputVarContainer_Retain()
	 * @model
	 * @generated
	 */
	boolean isRetain();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.OutputVarContainer#isRetain <em>Retain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retain</em>' attribute.
	 * @see #isRetain()
	 * @generated
	 */
	void setRetain(boolean value);

} // OutputVarContainer
