/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sc Trans2 Sf Trans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScTrans2SfTrans#getScTrans <em>Sc Trans</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScTrans2SfTrans#getSfTrans <em>Sf Trans</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScTrans2SfTrans#getScReg <em>Sc Reg</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScTrans2SfTrans()
 * @model
 * @generated
 */
public interface ScTrans2SfTrans extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sc Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Trans</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Trans</em>' reference.
	 * @see #setScTrans(Transition)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScTrans2SfTrans_ScTrans()
	 * @model
	 * @generated
	 */
	Transition getScTrans();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScTrans2SfTrans#getScTrans <em>Sc Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Trans</em>' reference.
	 * @see #getScTrans()
	 * @generated
	 */
	void setScTrans(Transition value);

	/**
	 * Returns the value of the '<em><b>Sf Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Trans</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Trans</em>' reference.
	 * @see #setSfTrans(org.muml.simulink.stateflow.Transition)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScTrans2SfTrans_SfTrans()
	 * @model
	 * @generated
	 */
	org.muml.simulink.stateflow.Transition getSfTrans();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScTrans2SfTrans#getSfTrans <em>Sf Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Trans</em>' reference.
	 * @see #getSfTrans()
	 * @generated
	 */
	void setSfTrans(org.muml.simulink.stateflow.Transition value);

	/**
	 * Returns the value of the '<em><b>Sc Reg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Reg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Reg</em>' reference.
	 * @see #setScReg(Region)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScTrans2SfTrans_ScReg()
	 * @model
	 * @generated
	 */
	Region getScReg();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScTrans2SfTrans#getScReg <em>Sc Reg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Reg</em>' reference.
	 * @see #getScReg()
	 * @generated
	 */
	void setScReg(Region value);

} // ScTrans2SfTrans
