/**
 */
package org.muml.cbs.dependencylanguage;

import org.muml.mumlcore.expressions.common.ComparingOperator;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hybrid Clock Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a abreviation of a AuxiliaryClockCondition and a Condtion (mainly for StateStatusConditions).
 * For example:
 * HybridClockCondition(condition:= state 1 active ,  operation:= < , bound:= 5s )
 * <=>
 * AuxiliaryClockCondition(event:= entering state 1,  operation:= < , bound:= 5s ) and StateStatusCondition(states:= state 1 , kind:= active)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.HybridClockCondition#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.HybridClockCondition#getBound <em>Bound</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.HybridClockCondition#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getHybridClockCondition()
 * @model
 * @generated
 */
public interface HybridClockCondition extends ClockCondition {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getHybridClockCondition_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.HybridClockCondition#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bound</em>' containment reference.
	 * @see #setBound(TimeValue)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getHybridClockCondition_Bound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getBound();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.HybridClockCondition#getBound <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' containment reference.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.mumlcore.expressions.common.ComparingOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.muml.mumlcore.expressions.common.ComparingOperator
	 * @see #setOperator(ComparingOperator)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getHybridClockCondition_Operator()
	 * @model required="true"
	 * @generated
	 */
	ComparingOperator getOperator();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.HybridClockCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.muml.mumlcore.expressions.common.ComparingOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparingOperator value);

} // HybridClockCondition
