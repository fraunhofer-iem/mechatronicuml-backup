/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initialized Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.InitializedStructure#getDefinedStructure <em>Defined Structure</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.InitializedStructure#getInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getInitializedStructure()
 * @model
 * @generated
 */
public interface InitializedStructure extends StructureSpecification, StructureElementDomain, InstanceSpecificSpecInit, Var2SpecInit, LocatedVarSpecInit {
	/**
	 * Returns the value of the '<em><b>Defined Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined Structure</em>' reference.
	 * @see #setDefinedStructure(StructureTypeDeclaration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getInitializedStructure_DefinedStructure()
	 * @model required="true"
	 * @generated
	 */
	StructureTypeDeclaration getDefinedStructure();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.InitializedStructure#getDefinedStructure <em>Defined Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined Structure</em>' reference.
	 * @see #getDefinedStructure()
	 * @generated
	 */
	void setDefinedStructure(StructureTypeDeclaration value);

	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(StructureInit)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getInitializedStructure_Init()
	 * @model containment="true"
	 * @generated
	 */
	StructureInit getInit();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.InitializedStructure#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(StructureInit value);

} // InitializedStructure
