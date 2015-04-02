/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.SymbolicVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Output Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramOutputReference#getRefernce <em>Refernce</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getProgramOutputReference()
 * @model
 * @generated
 */
public interface ProgramOutputReference extends DataSource {
	/**
	 * Returns the value of the '<em><b>Refernce</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refernce</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refernce</em>' reference.
	 * @see #setRefernce(SymbolicVariable)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getProgramOutputReference_Refernce()
	 * @model required="true"
	 * @generated
	 */
	SymbolicVariable getRefernce();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramOutputReference#getRefernce <em>Refernce</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refernce</em>' reference.
	 * @see #getRefernce()
	 * @generated
	 */
	void setRefernce(SymbolicVariable value);

} // ProgramOutputReference
