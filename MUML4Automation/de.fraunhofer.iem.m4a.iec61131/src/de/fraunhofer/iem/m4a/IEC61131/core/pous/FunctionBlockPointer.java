/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.pous;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpecInit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Block Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockPointer#getFunctionBlockType <em>Function Block Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage#getFunctionBlockPointer()
 * @model
 * @generated
 */
public interface FunctionBlockPointer extends ExternalVarSpec, GlobalVarSpecInit {
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
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage#getFunctionBlockPointer_FunctionBlockType()
	 * @model
	 * @generated
	 */
	AbstractFunctionBlockDeclaration getFunctionBlockType();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockPointer#getFunctionBlockType <em>Function Block Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Block Type</em>' reference.
	 * @see #getFunctionBlockType()
	 * @generated
	 */
	void setFunctionBlockType(AbstractFunctionBlockDeclaration value);

} // FunctionBlockPointer
