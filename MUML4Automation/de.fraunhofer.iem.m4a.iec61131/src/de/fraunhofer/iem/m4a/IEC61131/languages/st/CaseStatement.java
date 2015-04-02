/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement#getElse <em>Else</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement#getCaseElements <em>Case Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getCaseStatement()
 * @model
 * @generated
 */
public interface CaseStatement extends SelectionStatement {
	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(Else)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getCaseStatement_Else()
	 * @model containment="true"
	 * @generated
	 */
	Else getElse();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Else value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getCaseStatement_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Case Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Elements</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getCaseStatement_CaseElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CaseElement> getCaseElements();

} // CaseStatement
