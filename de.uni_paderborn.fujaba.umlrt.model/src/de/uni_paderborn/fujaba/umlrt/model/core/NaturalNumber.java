/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Natural Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents either a natural number or infinity.
 * TODO-SD: Do we really need that class?
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#getValue <em>Value</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#isInfinity <em>Infinity</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getNaturalNumber()
 * @model
 * @generated
 */
public interface NaturalNumber extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of this natural number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getNaturalNumber_Value()
	 * @model
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

	/**
	 * Returns the value of the '<em><b>Infinity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determins whether this natural number represents infinity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Infinity</em>' attribute.
	 * @see #setInfinity(boolean)
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getNaturalNumber_Infinity()
	 * @model
	 * @generated
	 */
	boolean isInfinity();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber#isInfinity <em>Infinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infinity</em>' attribute.
	 * @see #isInfinity()
	 * @generated
	 */
	void setInfinity(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dependend on whether this object represents a natural number or infinity an object of type "Long" or "Infinity" is returned.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EObject getValueAsObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set the value to infinity.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void setValue(Infinity o);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set the value to the value of the given parameter.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void setValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation yields the value of this natural number as a long value.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	long longValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation yields the value of this natural number in a string representation.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean equals(EObject o);

} // NaturalNumber
