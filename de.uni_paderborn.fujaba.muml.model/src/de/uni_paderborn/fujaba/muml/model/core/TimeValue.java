/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.core;

import java.util.concurrent.TimeUnit;

import org.storydriven.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.TimeValue#getValue <em>Value</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.TimeValue#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getTimeValue()
 * @model
 * @generated
 */
public interface TimeValue extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(NaturalNumber)
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getTimeValue_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NaturalNumber getValue();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.TimeValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(NaturalNumber value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(TimeUnit)
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getTimeValue_Unit()
	 * @model unsettable="true" dataType="de.uni_paderborn.fujaba.muml.model.core.TimeUnit"
	 * @generated
	 */
	TimeUnit getUnit();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.TimeValue#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnit value);

	/**
	 * Unsets the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.TimeValue#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(TimeUnit)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.TimeValue#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(TimeUnit)
	 * @generated
	 */
	boolean isSetUnit();

} // TimeValue
