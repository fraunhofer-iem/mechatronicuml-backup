/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement#getFrom <em>From</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement#getTo <em>To</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement#getBy <em>By</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getForStatement()
 * @model
 * @generated
 */
public interface ForStatement extends IterationStatement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(Expression)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getForStatement_From()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getFrom();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Expression value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(Expression)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getForStatement_To()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getTo();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Expression value);

	/**
	 * Returns the value of the '<em><b>By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By</em>' containment reference.
	 * @see #setBy(Expression)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getForStatement_By()
	 * @model containment="true"
	 * @generated
	 */
	Expression getBy();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement#getBy <em>By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By</em>' containment reference.
	 * @see #getBy()
	 * @generated
	 */
	void setBy(Expression value);

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
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getForStatement_Do()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StatementList getDo();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ForStatement#getDo <em>Do</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do</em>' containment reference.
	 * @see #getDo()
	 * @generated
	 */
	void setDo(StatementList value);

} // ForStatement
