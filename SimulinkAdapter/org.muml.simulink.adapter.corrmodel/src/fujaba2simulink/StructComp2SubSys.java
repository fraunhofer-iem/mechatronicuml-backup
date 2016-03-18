/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink;

import de.uni_paderborn.fujaba.muml.component.Component;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;
import de.uni_paderborn.fujaba.simulink.model.LibraryReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Comp2 Sub Sys</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.StructComp2SubSys#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link fujaba2simulink.StructComp2SubSys#getLibraryReference <em>Library Reference</em>}</li>
 *   <li>{@link fujaba2simulink.StructComp2SubSys#getComp <em>Comp</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.Fujaba2simulinkPackage#getStructComp2SubSys()
 * @model
 * @generated
 */
public interface StructComp2SubSys extends AbstractContainerCorrespondenceNode, CompInstConfig2SubSys {
	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance</em>' reference.
	 * @see #setComponentInstance(ComponentInstance)
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getStructComp2SubSys_ComponentInstance()
	 * @model
	 * @generated
	 */
	ComponentInstance getComponentInstance();

	/**
	 * Sets the value of the '{@link fujaba2simulink.StructComp2SubSys#getComponentInstance <em>Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance</em>' reference.
	 * @see #getComponentInstance()
	 * @generated
	 */
	void setComponentInstance(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Library Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Reference</em>' reference.
	 * @see #setLibraryReference(LibraryReference)
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getStructComp2SubSys_LibraryReference()
	 * @model
	 * @generated
	 */
	LibraryReference getLibraryReference();

	/**
	 * Sets the value of the '{@link fujaba2simulink.StructComp2SubSys#getLibraryReference <em>Library Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Reference</em>' reference.
	 * @see #getLibraryReference()
	 * @generated
	 */
	void setLibraryReference(LibraryReference value);

	/**
	 * Returns the value of the '<em><b>Comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp</em>' reference.
	 * @see #setComp(Component)
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getStructComp2SubSys_Comp()
	 * @model
	 * @generated
	 */
	Component getComp();

	/**
	 * Sets the value of the '{@link fujaba2simulink.StructComp2SubSys#getComp <em>Comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp</em>' reference.
	 * @see #getComp()
	 * @generated
	 */
	void setComp(Component value);

} // StructComp2SubSys
