/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.stateflow;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Embedded Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.stateflow.EmbeddedFunction#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.EmbeddedFunction#getCode <em>Code</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.EmbeddedFunction#getInput <em>Input</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.EmbeddedFunction#getOutput <em>Output</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.EmbeddedFunction#getLocal <em>Local</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.EmbeddedFunction#getConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.stateflow.StateflowPackage#getEmbeddedFunction()
 * @model
 * @generated
 */
public interface EmbeddedFunction extends StateflowElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.muml.simulink.stateflow.StateflowPackage#getEmbeddedFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.muml.simulink.stateflow.EmbeddedFunction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.muml.simulink.stateflow.StateflowPackage#getEmbeddedFunction_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.muml.simulink.stateflow.EmbeddedFunction#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.stateflow.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see org.muml.simulink.stateflow.StateflowPackage#getEmbeddedFunction_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.stateflow.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see org.muml.simulink.stateflow.StateflowPackage#getEmbeddedFunction_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getOutput();

	/**
	 * Returns the value of the '<em><b>Local</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.stateflow.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' containment reference list.
	 * @see org.muml.simulink.stateflow.StateflowPackage#getEmbeddedFunction_Local()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getLocal();

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.stateflow.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference list.
	 * @see org.muml.simulink.stateflow.StateflowPackage#getEmbeddedFunction_Constant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getConstant();

} // EmbeddedFunction
