/**
 */
package de.uni_paderborn.fujaba.muml.dependencylanguage;

import org.storydriven.core.expressions.common.ComparingOperator;

import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auxiliary Clock Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This specifies a time dependency to an events last occurence.
 * It leads to an introduction of an auxiliary clock.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.dependencylanguage.AuxiliaryClockCondition#getEvent <em>Event</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.dependencylanguage.AuxiliaryClockCondition#getBound <em>Bound</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.dependencylanguage.AuxiliaryClockCondition#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getAuxiliaryClockCondition()
 * @model
 * @generated
 */
public interface AuxiliaryClockCondition extends ClockCondition {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(Event)
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getAuxiliaryClockCondition_Event()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.dependencylanguage.AuxiliaryClockCondition#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

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
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getAuxiliaryClockCondition_Bound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getBound();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.dependencylanguage.AuxiliaryClockCondition#getBound <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' containment reference.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.storydriven.core.expressions.common.ComparingOperator}.
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
	 * @see org.storydriven.core.expressions.common.ComparingOperator
	 * @see #setOperator(ComparingOperator)
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getAuxiliaryClockCondition_Operator()
	 * @model required="true"
	 * @generated
	 */
	ComparingOperator getOperator();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.dependencylanguage.AuxiliaryClockCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.storydriven.core.expressions.common.ComparingOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparingOperator value);

} // AuxiliaryClockCondition
