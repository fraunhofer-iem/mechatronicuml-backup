/**
 */
package org.muml.cbs.dependencylanguage;

import org.muml.mumlcore.expressions.common.LogicOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This can be used to logically compose multiple conditions.
 * It is mostly required to shorten specifications, but also the OR composition is otherwise not possible.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.CompositionCondition#getLeftCondition <em>Left Condition</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.CompositionCondition#getKind <em>Kind</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.CompositionCondition#getRightCondition <em>Right Condition</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getCompositionCondition()
 * @model
 * @generated
 */
public interface CompositionCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Left Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Left Condition</em>' containment reference.
	 * @see #setLeftCondition(Condition)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getCompositionCondition_LeftCondition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getLeftCondition();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.CompositionCondition#getLeftCondition <em>Left Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Condition</em>' containment reference.
	 * @see #getLeftCondition()
	 * @generated
	 */
	void setLeftCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.mumlcore.expressions.common.LogicOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.muml.mumlcore.expressions.common.LogicOperator
	 * @see #setKind(LogicOperator)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getCompositionCondition_Kind()
	 * @model required="true"
	 * @generated
	 */
	LogicOperator getKind();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.CompositionCondition#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.muml.mumlcore.expressions.common.LogicOperator
	 * @see #getKind()
	 * @generated
	 */
	void setKind(LogicOperator value);

	/**
	 * Returns the value of the '<em><b>Right Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right Condition</em>' containment reference.
	 * @see #setRightCondition(Condition)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getCompositionCondition_RightCondition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getRightCondition();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.CompositionCondition#getRightCondition <em>Right Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Condition</em>' containment reference.
	 * @see #getRightCondition()
	 * @generated
	 */
	void setRightCondition(Condition value);

} // CompositionCondition
