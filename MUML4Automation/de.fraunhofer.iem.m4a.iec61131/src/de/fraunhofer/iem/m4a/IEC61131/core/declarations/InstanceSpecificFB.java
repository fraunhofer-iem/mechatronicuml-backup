/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureInit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Specific FB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificFB#getInit <em>Init</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificFB#getFbInstanceRef <em>Fb Instance Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getInstanceSpecificFB()
 * @model
 * @generated
 */
public interface InstanceSpecificFB extends InstanceSpecificVarInit {
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
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getInstanceSpecificFB_Init()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StructureInit getInit();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificFB#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(StructureInit value);

	/**
	 * Returns the value of the '<em><b>Fb Instance Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fb Instance Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fb Instance Ref</em>' reference.
	 * @see #setFbInstanceRef(FBInstance)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getInstanceSpecificFB_FbInstanceRef()
	 * @model required="true"
	 * @generated
	 */
	FBInstance getFbInstanceRef();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificFB#getFbInstanceRef <em>Fb Instance Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fb Instance Ref</em>' reference.
	 * @see #getFbInstanceRef()
	 * @generated
	 */
	void setFbInstanceRef(FBInstance value);

} // InstanceSpecificFB
