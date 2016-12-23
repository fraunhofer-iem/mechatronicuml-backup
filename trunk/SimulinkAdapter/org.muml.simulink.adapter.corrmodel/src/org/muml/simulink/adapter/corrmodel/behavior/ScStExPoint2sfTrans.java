/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import org.muml.pim.realtimestatechart.ExitPoint;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.stateflow.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sc St Ex Point2sf Trans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans#getSfTrans <em>Sf Trans</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans#getScOutTrans <em>Sc Out Trans</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans#getScInTrans <em>Sc In Trans</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans#getScStExPoint <em>Sc St Ex Point</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScStExPoint2sfTrans()
 * @model
 * @generated
 */
public interface ScStExPoint2sfTrans extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sf Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Trans</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Trans</em>' reference.
	 * @see #setSfTrans(Transition)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScStExPoint2sfTrans_SfTrans()
	 * @model
	 * @generated
	 */
	Transition getSfTrans();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans#getSfTrans <em>Sf Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Trans</em>' reference.
	 * @see #getSfTrans()
	 * @generated
	 */
	void setSfTrans(Transition value);

	/**
	 * Returns the value of the '<em><b>Sc Out Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Out Trans</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Out Trans</em>' reference.
	 * @see #setScOutTrans(org.muml.pim.realtimestatechart.Transition)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScStExPoint2sfTrans_ScOutTrans()
	 * @model
	 * @generated
	 */
	org.muml.pim.realtimestatechart.Transition getScOutTrans();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans#getScOutTrans <em>Sc Out Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Out Trans</em>' reference.
	 * @see #getScOutTrans()
	 * @generated
	 */
	void setScOutTrans(org.muml.pim.realtimestatechart.Transition value);

	/**
	 * Returns the value of the '<em><b>Sc In Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc In Trans</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc In Trans</em>' reference.
	 * @see #setScInTrans(org.muml.pim.realtimestatechart.Transition)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScStExPoint2sfTrans_ScInTrans()
	 * @model
	 * @generated
	 */
	org.muml.pim.realtimestatechart.Transition getScInTrans();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans#getScInTrans <em>Sc In Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc In Trans</em>' reference.
	 * @see #getScInTrans()
	 * @generated
	 */
	void setScInTrans(org.muml.pim.realtimestatechart.Transition value);

	/**
	 * Returns the value of the '<em><b>Sc St Ex Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc St Ex Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc St Ex Point</em>' reference.
	 * @see #setScStExPoint(ExitPoint)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScStExPoint2sfTrans_ScStExPoint()
	 * @model
	 * @generated
	 */
	ExitPoint getScStExPoint();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScStExPoint2sfTrans#getScStExPoint <em>Sc St Ex Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc St Ex Point</em>' reference.
	 * @see #getScStExPoint()
	 * @generated
	 */
	void setScStExPoint(ExitPoint value);

} // ScStExPoint2sfTrans
