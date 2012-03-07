/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ForLoop#getInitalizeExpression <em>Initalize Expression</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ForLoop#getCountingExpression <em>Counting Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getForLoop()
 * @model
 * @generated
 */
public interface ForLoop extends Loop {
	/**
	 * Returns the value of the '<em><b>Initalize Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initalize Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initalize Expression</em>' containment reference.
	 * @see #setInitalizeExpression(Assignment)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getForLoop_InitalizeExpression()
	 * @model containment="true"
	 * @generated
	 */
	Assignment getInitalizeExpression();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ForLoop#getInitalizeExpression <em>Initalize Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initalize Expression</em>' containment reference.
	 * @see #getInitalizeExpression()
	 * @generated
	 */
	void setInitalizeExpression(Assignment value);

	/**
	 * Returns the value of the '<em><b>Counting Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counting Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counting Expression</em>' containment reference.
	 * @see #setCountingExpression(Assignment)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getForLoop_CountingExpression()
	 * @model containment="true"
	 * @generated
	 */
	Assignment getCountingExpression();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.ForLoop#getCountingExpression <em>Counting Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counting Expression</em>' containment reference.
	 * @see #getCountingExpression()
	 * @generated
	 */
	void setCountingExpression(Assignment value);

} // ForLoop
