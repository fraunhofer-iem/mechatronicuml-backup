/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This data type represents a primitive data type and refers to the PrimitiveDataType enumeration for specifying the concrete primitive type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.types.PrimitiveDataType#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.types.TypesPackage#getPrimitiveDataType()
 * @model
 * @generated
 */
public interface PrimitiveDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' attribute.
	 * The default value is <code>"VOID"</code>.
	 * The literals are from the enumeration {@link org.muml.pim.types.PrimitiveTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the primitive data type as defined by the PrimitiveDataType enumeration. It defines the actual type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primitive Type</em>' attribute.
	 * @see org.muml.pim.types.PrimitiveTypes
	 * @see #setPrimitiveType(PrimitiveTypes)
	 * @see org.muml.pim.types.TypesPackage#getPrimitiveDataType_PrimitiveType()
	 * @model default="VOID" required="true"
	 * @generated
	 */
	PrimitiveTypes getPrimitiveType();

	/**
	 * Sets the value of the '{@link org.muml.pim.types.PrimitiveDataType#getPrimitiveType <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' attribute.
	 * @see org.muml.pim.types.PrimitiveTypes
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(PrimitiveTypes value);

} // PrimitiveDataType
