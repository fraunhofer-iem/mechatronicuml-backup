/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.variables;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSink;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSource;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.IntegerLiteral;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.DirectVariable#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage#getDirectVariable()
 * @model
 * @generated
 */
public interface DirectVariable extends NonGlobalVariable, DataSource, DataSink, ProgDataSource, AccessDeclaration {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.literals.IntegerLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage#getDirectVariable_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IntegerLiteral> getValue();

} // DirectVariable
