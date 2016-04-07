/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.stateflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.stateflow.Action#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.stateflow.StateflowPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends StateflowElement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.muml.simulink.stateflow.StateflowPackage#getAction_Expression()
	 * @model default="" required="true"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.muml.simulink.stateflow.Action#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // Action
