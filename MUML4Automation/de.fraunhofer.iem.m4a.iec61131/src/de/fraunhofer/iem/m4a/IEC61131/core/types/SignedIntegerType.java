/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signed Integer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SignedIntegerType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSignedIntegerType()
 * @model
 * @generated
 */
public interface SignedIntegerType extends IntegerType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link de.fraunhofer.iem.m4a.IEC61131.core.types.ESignedIntegerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ESignedIntegerType
	 * @see #setName(ESignedIntegerType)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSignedIntegerType_Name()
	 * @model required="true"
	 * @generated
	 */
	ESignedIntegerType getName();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SignedIntegerType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ESignedIntegerType
	 * @see #getName()
	 * @generated
	 */
	void setName(ESignedIntegerType value);

} // SignedIntegerType
