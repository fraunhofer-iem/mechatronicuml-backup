/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Specific Var Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarInit#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarInit#getProgramRef <em>Program Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getInstanceSpecificVarInit()
 * @model abstract="true"
 * @generated
 */
public interface InstanceSpecificVarInit extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Ref</em>' reference.
	 * @see #setResourceRef(ResourceDeclaration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getInstanceSpecificVarInit_ResourceRef()
	 * @model required="true"
	 * @generated
	 */
	ResourceDeclaration getResourceRef();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarInit#getResourceRef <em>Resource Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Ref</em>' reference.
	 * @see #getResourceRef()
	 * @generated
	 */
	void setResourceRef(ResourceDeclaration value);

	/**
	 * Returns the value of the '<em><b>Program Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Ref</em>' reference.
	 * @see #setProgramRef(ProgramConfiguration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getInstanceSpecificVarInit_ProgramRef()
	 * @model required="true"
	 * @generated
	 */
	ProgramConfiguration getProgramRef();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarInit#getProgramRef <em>Program Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Ref</em>' reference.
	 * @see #getProgramRef()
	 * @generated
	 */
	void setProgramRef(ProgramConfiguration value);

} // InstanceSpecificVarInit
