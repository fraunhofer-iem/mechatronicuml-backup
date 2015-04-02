/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var1SpecInit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated Spec Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecInit#getSpecification <em>Specification</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecInit#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getEnumeratedSpecInit()
 * @model
 * @generated
 */
public interface EnumeratedSpecInit extends StructureElementDomain, InstanceSpecificSpecInit, Var1SpecInit {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(EnumeratedSpecification)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getEnumeratedSpecInit_Specification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EnumeratedSpecification getSpecification();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecInit#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(EnumeratedSpecification value);

	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialization</em>' reference.
	 * @see #setInitialization(EnumeratedValue)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getEnumeratedSpecInit_Initialization()
	 * @model
	 * @generated
	 */
	EnumeratedValue getInitialization();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecInit#getInitialization <em>Initialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialization</em>' reference.
	 * @see #getInitialization()
	 * @generated
	 */
	void setInitialization(EnumeratedValue value);

} // EnumeratedSpecInit
