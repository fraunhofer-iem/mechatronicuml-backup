/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.instance.DelegationConnectorInstance;
import org.muml.simulink.Line;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Del2 Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Del2Line#getDelegationInstance <em>Delegation Instance</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Del2Line#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getDel2Line()
 * @model
 * @generated
 */
public interface Del2Line extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Delegation Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Instance</em>' reference.
	 * @see #setDelegationInstance(DelegationConnectorInstance)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getDel2Line_DelegationInstance()
	 * @model
	 * @generated
	 */
	DelegationConnectorInstance getDelegationInstance();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Del2Line#getDelegationInstance <em>Delegation Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegation Instance</em>' reference.
	 * @see #getDelegationInstance()
	 * @generated
	 */
	void setDelegationInstance(DelegationConnectorInstance value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' reference list.
	 * The list contents are of type {@link org.muml.simulink.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' reference list.
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getDel2Line_Line()
	 * @model
	 * @generated
	 */
	EList<Line> getLine();

} // Del2Line
