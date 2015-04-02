/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.DoubleByteCharacterString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Byte String Spec Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpecInit#getInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getDoubleByteStringSpecInit()
 * @model
 * @generated
 */
public interface DoubleByteStringSpecInit extends StringVarDecl, DoubleByteStringVar, LocatedVarSpecInit {
	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(DoubleByteCharacterString)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getDoubleByteStringSpecInit_Init()
	 * @model containment="true"
	 * @generated
	 */
	DoubleByteCharacterString getInit();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpecInit#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(DoubleByteCharacterString value);

} // DoubleByteStringSpecInit
