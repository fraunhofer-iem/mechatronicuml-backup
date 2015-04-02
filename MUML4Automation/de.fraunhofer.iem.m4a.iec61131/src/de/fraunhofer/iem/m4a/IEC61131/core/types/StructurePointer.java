/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ArrayStructVarSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.SharedVarSpec;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructurePointer#getStructureType <em>Structure Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getStructurePointer()
 * @model
 * @generated
 */
public interface StructurePointer extends SharedVarSpec, ArrayStructVarSpec {
	/**
	 * Returns the value of the '<em><b>Structure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Type</em>' reference.
	 * @see #setStructureType(StructureTypeDeclaration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getStructurePointer_StructureType()
	 * @model required="true"
	 * @generated
	 */
	StructureTypeDeclaration getStructureType();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructurePointer#getStructureType <em>Structure Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Type</em>' reference.
	 * @see #getStructureType()
	 * @generated
	 */
	void setStructureType(StructureTypeDeclaration value);

} // StructurePointer
