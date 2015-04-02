/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.pous;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.IOVarDeclaration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blackbox Function Block Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class allows only var declarations for in, out and inout variables. Enables Blackbox functionality
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.BlackboxFunctionBlockDeclaration#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage#getBlackboxFunctionBlockDeclaration()
 * @model
 * @generated
 */
public interface BlackboxFunctionBlockDeclaration extends AbstractFunctionBlockDeclaration {
	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IOVarDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage#getBlackboxFunctionBlockDeclaration_Declarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<IOVarDeclaration> getDeclarations();

} // BlackboxFunctionBlockDeclaration
