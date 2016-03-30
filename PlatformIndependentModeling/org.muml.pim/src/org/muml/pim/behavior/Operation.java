/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.behavior;

import org.eclipse.emf.common.util.EList;
import org.muml.core.CommentableElement;
import org.muml.core.NamedElement;
import org.muml.core.expressions.Expression;
import org.muml.pim.types.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An operation specifies a behavior that can be called with a list of concrete parameters and may return a return value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.behavior.Operation#getImplementations <em>Implementations</em>}</li>
 *   <li>{@link org.muml.pim.behavior.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.muml.pim.behavior.Operation#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.behavior.BehaviorPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the return value of this operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(DataType)
	 * @see org.muml.pim.behavior.BehaviorPackage#getOperation_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	DataType getReturnType();

	/**
	 * Sets the value of the '{@link org.muml.pim.behavior.Operation#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(DataType value);

	/**
	 * Returns the value of the '<em><b>Implementations</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.core.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The implementation for this operation. MechatronicUML supports the annotation of multiple implementations for an operation to support different target languages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementations</em>' containment reference list.
	 * @see org.muml.pim.behavior.BehaviorPackage#getOperation_Implementations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getImplementations();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.behavior.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered parameters of the operation. They define the values that need to be
	 * passed upon calling the operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.muml.pim.behavior.BehaviorPackage#getOperation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Operation
