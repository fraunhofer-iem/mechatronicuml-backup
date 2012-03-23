/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage;

import de.uni_paderborn.fujaba.muml.model.core.Operation;
import de.uni_paderborn.fujaba.muml.model.core.ParameterBinding;

import org.eclipse.emf.common.util.EList;

import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.OperationCall#getOperation <em>Operation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.OperationCall#getParameterBinding <em>Parameter Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getOperationCall()
 * @model
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
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getOperationCall_Operation()
	 * @model required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.OperationCall#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Parameter Binding</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.core.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Binding</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getOperationCall_ParameterBinding()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameterBinding();

} // OperationCall
