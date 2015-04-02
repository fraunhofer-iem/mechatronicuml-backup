/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarSpec;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureTypeDeclaration#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getStructureTypeDeclaration()
 * @model
 * @generated
 */
public interface StructureTypeDeclaration extends DataTypeDeclaration, VarSpec {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(StructureSpecification)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getStructureTypeDeclaration_Specification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StructureSpecification getSpecification();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureTypeDeclaration#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(StructureSpecification value);

} // StructureTypeDeclaration
