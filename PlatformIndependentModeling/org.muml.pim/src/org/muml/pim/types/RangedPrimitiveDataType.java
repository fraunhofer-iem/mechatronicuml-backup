/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.types;

import org.muml.pim.valuetype.Range;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranged Primitive Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type comprising a range of values from another primitive data type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.types.RangedPrimitiveDataType#getRangedType <em>Ranged Type</em>}</li>
 *   <li>{@link org.muml.pim.types.RangedPrimitiveDataType#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.types.TypesPackage#getRangedPrimitiveDataType()
 * @model
 * @generated
 */
public interface RangedPrimitiveDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Ranged Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranged Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The primitive data type that provides a superset of possible values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ranged Type</em>' reference.
	 * @see #setRangedType(PrimitiveDataType)
	 * @see org.muml.pim.types.TypesPackage#getRangedPrimitiveDataType_RangedType()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveDataType getRangedType();

	/**
	 * Sets the value of the '{@link org.muml.pim.types.RangedPrimitiveDataType#getRangedType <em>Ranged Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ranged Type</em>' reference.
	 * @see #getRangedType()
	 * @generated
	 */
	void setRangedType(PrimitiveDataType value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The range of values provided by this data type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Range)
	 * @see org.muml.pim.types.TypesPackage#getRangedPrimitiveDataType_Range()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link org.muml.pim.types.RangedPrimitiveDataType#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

} // RangedPrimitiveDataType
