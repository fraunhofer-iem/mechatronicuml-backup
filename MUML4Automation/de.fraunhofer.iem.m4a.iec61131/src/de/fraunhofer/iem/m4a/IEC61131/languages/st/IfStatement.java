/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement#getElsif <em>Elsif</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement#getThen <em>Then</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends SelectionStatement {
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
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getIfStatement_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Elsif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elsif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elsif</em>' containment reference.
	 * @see #setElsif(IfStatement)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getIfStatement_Elsif()
	 * @model containment="true"
	 * @generated
	 */
	IfStatement getElsif();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement#getElsif <em>Elsif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elsif</em>' containment reference.
	 * @see #getElsif()
	 * @generated
	 */
	void setElsif(IfStatement value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(StatementList)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getIfStatement_Then()
	 * @model containment="true"
	 * @generated
	 */
	StatementList getThen();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(StatementList value);

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
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getIfStatement_Else()
	 * @model containment="true"
	 * @generated
	 */
	Else getElse();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.IfStatement#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Else value);

} // IfStatement
