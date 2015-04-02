/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockBody;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBody;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.StatementList#getStatments <em>Statments</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getStatementList()
 * @model
 * @generated
 */
public interface StatementList extends FunctionBody, FunctionBlockBody {
	/**
	 * Returns the value of the '<em><b>Statments</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statments</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getStatementList_Statments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Statement> getStatments();

} // StatementList
