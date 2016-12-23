/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The for loop statement firstly initialize a loop variable by the initialize expression and assigning on each loop run afterwards a loop variable by the counting expression to successive values of a sequence.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.ForLoop#getInitializeExpression <em>Initialize Expression</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.ForLoop#getCountingExpression <em>Counting Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getForLoop()
 * @model
 * @generated
 */
public interface ForLoop extends Loop {
	/**
	 * Returns the value of the '<em><b>Initialize Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initialize a loop variable by the initialize expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialize Expression</em>' containment reference.
	 * @see #setInitializeExpression(Assignment)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getForLoop_InitializeExpression()
	 * @model containment="true"
	 * @generated
	 */
	Assignment getInitializeExpression();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.ForLoop#getInitializeExpression <em>Initialize Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialize Expression</em>' containment reference.
	 * @see #getInitializeExpression()
	 * @generated
	 */
	void setInitializeExpression(Assignment value);

	/**
	 * Returns the value of the '<em><b>Counting Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counting Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assigning on each loop run afterwards a loop variable by the counting expression to successive values of a sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Counting Expression</em>' containment reference.
	 * @see #setCountingExpression(Assignment)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getForLoop_CountingExpression()
	 * @model containment="true"
	 * @generated
	 */
	Assignment getCountingExpression();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.ForLoop#getCountingExpression <em>Counting Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counting Expression</em>' containment reference.
	 * @see #getCountingExpression()
	 * @generated
	 */
	void setCountingExpression(Assignment value);

} // ForLoop
