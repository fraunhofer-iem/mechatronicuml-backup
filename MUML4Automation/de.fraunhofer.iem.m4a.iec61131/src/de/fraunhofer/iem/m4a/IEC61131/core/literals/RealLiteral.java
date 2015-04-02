/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.literals;

import de.fraunhofer.iem.m4a.IEC61131.core.types.RealType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.RealLiteral#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage#getRealLiteral()
 * @model
 * @generated
 */
public interface RealLiteral extends NumericLiteral {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' reference.
	 * @see #setTypeName(RealType)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage#getRealLiteral_TypeName()
	 * @model
	 * @generated
	 */
	RealType getTypeName();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.RealLiteral#getTypeName <em>Type Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' reference.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(RealType value);

} // RealLiteral
