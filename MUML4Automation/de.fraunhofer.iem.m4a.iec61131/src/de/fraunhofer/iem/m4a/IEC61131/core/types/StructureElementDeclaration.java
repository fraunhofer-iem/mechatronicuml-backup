/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Element Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDeclaration#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getStructureElementDeclaration()
 * @model
 * @generated
 */
public interface StructureElementDeclaration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(StructureElementDomain)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getStructureElementDeclaration_Domain()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StructureElementDomain getDomain();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDeclaration#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(StructureElementDomain value);

} // StructureElementDeclaration
