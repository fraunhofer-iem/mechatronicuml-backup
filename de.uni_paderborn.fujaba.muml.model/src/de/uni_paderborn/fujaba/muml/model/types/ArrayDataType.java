/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.types;

import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This data type represents an array data type and specifies the maximum cardinality of inner data types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.types.ArrayDataType#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.types.ArrayDataType#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.types.TypesPackage#getArrayDataType()
 * @model
 * @generated
 */
public interface ArrayDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference points to the definition of the data type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see de.uni_paderborn.fujaba.muml.model.types.TypesPackage#getArrayDataType_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.types.ArrayDataType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(NaturalNumber)
	 * @see de.uni_paderborn.fujaba.muml.model.types.TypesPackage#getArrayDataType_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NaturalNumber getCardinality();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.types.ArrayDataType#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(NaturalNumber value);

} // ArrayDataType
