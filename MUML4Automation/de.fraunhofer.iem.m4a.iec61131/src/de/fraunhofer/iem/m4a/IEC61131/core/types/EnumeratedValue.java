/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseListElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValue#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getEnumeratedValue()
 * @model
 * @generated
 */
public interface EnumeratedValue extends NamedElement, StructureElementValue, ProgDataSource, CaseListElement {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference.
	 * @see #setScope(EnumeratedTypeDeclaration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getEnumeratedValue_Scope()
	 * @model
	 * @generated
	 */
	EnumeratedTypeDeclaration getScope();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValue#getScope <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(EnumeratedTypeDeclaration value);

} // EnumeratedValue
