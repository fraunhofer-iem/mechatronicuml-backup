/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.SingleByteCharacterString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Byte String Spec Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpecInit#getInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getSingleByteStringSpecInit()
 * @model
 * @generated
 */
public interface SingleByteStringSpecInit extends SingleByteStringVar, StringVarDecl, LocatedVarSpecInit {
	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(SingleByteCharacterString)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getSingleByteStringSpecInit_Init()
	 * @model containment="true"
	 * @generated
	 */
	SingleByteCharacterString getInit();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SingleByteStringSpecInit#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(SingleByteCharacterString value);

} // SingleByteStringSpecInit
