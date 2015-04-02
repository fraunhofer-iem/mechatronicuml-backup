/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.variables;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.ArrayVariable#getSubscriptedVariable <em>Subscripted Variable</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.ArrayVariable#getSubscript <em>Subscript</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage#getArrayVariable()
 * @model
 * @generated
 */
public interface ArrayVariable extends MultiElementVariable {
	/**
	 * Returns the value of the '<em><b>Subscripted Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscripted Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscripted Variable</em>' containment reference.
	 * @see #setSubscriptedVariable(SymbolicVariable)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage#getArrayVariable_SubscriptedVariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SymbolicVariable getSubscriptedVariable();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.ArrayVariable#getSubscriptedVariable <em>Subscripted Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscripted Variable</em>' containment reference.
	 * @see #getSubscriptedVariable()
	 * @generated
	 */
	void setSubscriptedVariable(SymbolicVariable value);

	/**
	 * Returns the value of the '<em><b>Subscript</b></em>' reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscript</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscript</em>' reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage#getArrayVariable_Subscript()
	 * @model required="true"
	 * @generated
	 */
	EList<Expression> getSubscript();

} // ArrayVariable
