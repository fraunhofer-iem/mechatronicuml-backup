/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unsigned Integer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.UnsignedIntegerType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getUnsignedIntegerType()
 * @model
 * @generated
 */
public interface UnsignedIntegerType extends IntegerType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link de.fraunhofer.iem.m4a.IEC61131.core.types.EUnsignedIntegerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EUnsignedIntegerType
	 * @see #setName(EUnsignedIntegerType)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getUnsignedIntegerType_Name()
	 * @model required="true"
	 * @generated
	 */
	EUnsignedIntegerType getName();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.UnsignedIntegerType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EUnsignedIntegerType
	 * @see #getName()
	 * @generated
	 */
	void setName(EUnsignedIntegerType value);

} // UnsignedIntegerType
