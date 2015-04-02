/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.DirectVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.NamedVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Specific Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable#getVariableRef <em>Variable Ref</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable#getLocation <em>Location</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable#getSpecinit <em>Specinit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getInstanceSpecificVariable()
 * @model abstract="true"
 * @generated
 */
public interface InstanceSpecificVariable extends InstanceSpecificVarInit {
	/**
	 * Returns the value of the '<em><b>Variable Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Ref</em>' reference.
	 * @see #setVariableRef(NamedVariable)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getInstanceSpecificVariable_VariableRef()
	 * @model required="true"
	 * @generated
	 */
	NamedVariable getVariableRef();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable#getVariableRef <em>Variable Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Ref</em>' reference.
	 * @see #getVariableRef()
	 * @generated
	 */
	void setVariableRef(NamedVariable value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(DirectVariable)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getInstanceSpecificVariable_Location()
	 * @model containment="true"
	 * @generated
	 */
	DirectVariable getLocation();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(DirectVariable value);

	/**
	 * Returns the value of the '<em><b>Specinit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specinit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specinit</em>' containment reference.
	 * @see #setSpecinit(InstanceSpecificSpecInit)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getInstanceSpecificVariable_Specinit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InstanceSpecificSpecInit getSpecinit();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVariable#getSpecinit <em>Specinit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specinit</em>' containment reference.
	 * @see #getSpecinit()
	 * @generated
	 */
	void setSpecinit(InstanceSpecificSpecInit value);

} // InstanceSpecificVariable
