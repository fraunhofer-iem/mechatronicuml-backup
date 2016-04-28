/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage;

import org.eclipse.emf.common.util.EList;
import org.muml.core.expressions.Expression;
import org.muml.pim.behavior.Operation;
import org.muml.pim.behavior.ParameterBinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Operation calls are used to call an operation with concrete parameter bindings. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.OperationCall#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.OperationCall#getParameterBinding <em>Parameter Binding</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getOperationCall()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ParameterBindingForEveryParameter'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ParameterBindingForEveryParameter='-- An OperationCall must bind exactly one value to every parameter\nnot operation.oclIsUndefined() implies \noperation.parameters->asBag() = parameterBinding.parameter->asBag()\n-- author: bingo, adann'"
 * @generated
 */
public interface OperationCall extends Expression {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operation which belongs to an operation call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getOperationCall_Operation()
	 * @model required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.OperationCall#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Parameter Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.behavior.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter bindings which belongs to an operation call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Binding</em>' containment reference list.
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getOperationCall_ParameterBinding()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameterBinding();

} // OperationCall
