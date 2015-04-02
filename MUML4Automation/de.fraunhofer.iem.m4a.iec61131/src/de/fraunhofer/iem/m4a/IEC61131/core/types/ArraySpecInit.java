/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Spec Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecInit#getSpecification <em>Specification</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecInit#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getArraySpecInit()
 * @model
 * @generated
 */
public interface ArraySpecInit extends StructureElementDomain, InstanceSpecificSpecInit, Var2SpecInit, LocatedVarSpecInit {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(ArraySpecification)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getArraySpecInit_Specification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArraySpecification getSpecification();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecInit#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(ArraySpecification value);

	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialization</em>' containment reference.
	 * @see #setInitialization(ArrayInit)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getArraySpecInit_Initialization()
	 * @model containment="true"
	 * @generated
	 */
	ArrayInit getInitialization();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecInit#getInitialization <em>Initialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialization</em>' containment reference.
	 * @see #getInitialization()
	 * @generated
	 */
	void setInitialization(ArrayInit value);

} // ArraySpecInit
