/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.RepeatStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.RepeatStatement#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getRepeatStatement()
 * @model
 * @generated
 */
public interface RepeatStatement extends IterationStatement {
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
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getRepeatStatement_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.RepeatStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Do</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do</em>' containment reference.
	 * @see #setDo(StatementList)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getRepeatStatement_Do()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StatementList getDo();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.RepeatStatement#getDo <em>Do</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do</em>' containment reference.
	 * @see #getDo()
	 * @generated
	 */
	void setDo(StatementList value);

} // RepeatStatement
