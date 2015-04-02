/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInit;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.SignedInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subrange Spec Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecInit#getValue <em>Value</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecInit#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSubrangeSpecInit()
 * @model
 * @generated
 */
public interface SubrangeSpecInit extends StructureElementDomain, InstanceSpecificSpecInit, Var1SpecInit {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(SignedInteger)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSubrangeSpecInit_Value()
	 * @model containment="true"
	 * @generated
	 */
	SignedInteger getValue();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecInit#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SignedInteger value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(SubrangeSpecification)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSubrangeSpecInit_Specification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SubrangeSpecification getSpecification();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecInit#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(SubrangeSpecification value);

} // SubrangeSpecInit
