/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.core;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.NaturalNumber#getValue <em>Value</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.NaturalNumber#isInfinity <em>Infinity</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getNaturalNumber()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValueGreaterOrEqualZero'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ValueGreaterOrEqualZero='self.value >= 0'"
 * @generated
 */
public interface NaturalNumber extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of this natural number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getNaturalNumber_Value()
	 * @model default="1"
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.NaturalNumber#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

	/**
	 * Returns the value of the '<em><b>Infinity</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determins whether this natural number represents infinity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Infinity</em>' attribute.
	 * @see #setInfinity(boolean)
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getNaturalNumber_Infinity()
	 * @model default="false"
	 * @generated
	 */
	boolean isInfinity();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.NaturalNumber#isInfinity <em>Infinity</em>}' attribute.
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
