/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureDeclaration#getDeclElements <em>Decl Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getStructureDeclaration()
 * @model
 * @generated
 */
public interface StructureDeclaration extends StructureSpecification {
	/**
	 * Returns the value of the '<em><b>Decl Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decl Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decl Elements</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getStructureDeclaration_DeclElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StructureElementDeclaration> getDeclElements();

} // StructureDeclaration
