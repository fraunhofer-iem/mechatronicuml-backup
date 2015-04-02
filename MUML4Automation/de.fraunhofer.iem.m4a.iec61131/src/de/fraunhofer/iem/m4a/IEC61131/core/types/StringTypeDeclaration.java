/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.CharacterString;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.IntegerLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StringTypeDeclaration#getLength <em>Length</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StringTypeDeclaration#getValue <em>Value</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StringTypeDeclaration#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getStringTypeDeclaration()
 * @model
 * @generated
 */
public interface StringTypeDeclaration extends DataTypeDeclaration {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(IntegerLiteral)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getStringTypeDeclaration_Length()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntegerLiteral getLength();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StringTypeDeclaration#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(IntegerLiteral value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(CharacterString)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getStringTypeDeclaration_Value()
	 * @model containment="true"
	 * @generated
	 */
	CharacterString getValue();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StringTypeDeclaration#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CharacterString value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(ElementaryStringType)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getStringTypeDeclaration_Domain()
	 * @model required="true"
	 * @generated
	 */
	ElementaryStringType getDomain();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StringTypeDeclaration#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(ElementaryStringType value);

} // StringTypeDeclaration
