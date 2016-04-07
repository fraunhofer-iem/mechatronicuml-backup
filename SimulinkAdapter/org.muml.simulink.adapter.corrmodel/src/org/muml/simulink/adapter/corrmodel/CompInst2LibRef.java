/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel;

import org.muml.pim.instance.ComponentInstance;
import org.muml.simulink.LibraryReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Inst2 Lib Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.CompInst2LibRef#getCompInst <em>Comp Inst</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.CompInst2LibRef#getLibRef <em>Lib Ref</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getCompInst2LibRef()
 * @model
 * @generated
 */
public interface CompInst2LibRef extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Comp Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp Inst</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp Inst</em>' reference.
	 * @see #setCompInst(ComponentInstance)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getCompInst2LibRef_CompInst()
	 * @model
	 * @generated
	 */
	ComponentInstance getCompInst();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.CompInst2LibRef#getCompInst <em>Comp Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp Inst</em>' reference.
	 * @see #getCompInst()
	 * @generated
	 */
	void setCompInst(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Lib Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lib Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lib Ref</em>' reference.
	 * @see #setLibRef(LibraryReference)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getCompInst2LibRef_LibRef()
	 * @model
	 * @generated
	 */
	LibraryReference getLibRef();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.CompInst2LibRef#getLibRef <em>Lib Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lib Ref</em>' reference.
	 * @see #getLibRef()
	 * @generated
	 */
	void setLibRef(LibraryReference value);

} // CompInst2LibRef
