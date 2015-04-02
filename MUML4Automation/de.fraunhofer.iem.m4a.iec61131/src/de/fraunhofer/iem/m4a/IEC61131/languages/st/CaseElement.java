/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseElement#getCaseList <em>Case List</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseElement#getStatementList <em>Statement List</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getCaseElement()
 * @model
 * @generated
 */
public interface CaseElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Case List</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseListElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case List</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getCaseElement_CaseList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CaseListElement> getCaseList();

	/**
	 * Returns the value of the '<em><b>Statement List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement List</em>' containment reference.
	 * @see #setStatementList(StatementList)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getCaseElement_StatementList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StatementList getStatementList();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseElement#getStatementList <em>Statement List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement List</em>' containment reference.
	 * @see #getStatementList()
	 * @generated
	 */
	void setStatementList(StatementList value);

} // CaseElement
