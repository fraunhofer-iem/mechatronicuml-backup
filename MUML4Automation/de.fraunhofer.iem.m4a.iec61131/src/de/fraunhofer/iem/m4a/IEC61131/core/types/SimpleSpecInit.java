/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInit;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.Constant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Spec Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecInit#getSpecification <em>Specification</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecInit#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSimpleSpecInit()
 * @model
 * @generated
 */
public interface SimpleSpecInit extends StructureElementDomain, InstanceSpecificSpecInit, Var1SpecInit {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(SimpleSpecification)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSimpleSpecInit_Specification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SimpleSpecification getSpecification();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecInit#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(SimpleSpecification value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Constant)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSimpleSpecInit_Value()
	 * @model containment="true"
	 * @generated
	 */
	Constant getValue();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecInit#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Constant value);

} // SimpleSpecInit
