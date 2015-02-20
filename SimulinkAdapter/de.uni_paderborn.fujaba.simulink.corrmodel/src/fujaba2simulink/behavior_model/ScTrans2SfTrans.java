/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;
import fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sc Trans2 Sf Trans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.ScTrans2SfTrans#getScTrans <em>Sc Trans</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScTrans2SfTrans#getSfTrans <em>Sf Trans</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScTrans2SfTrans#getScReg <em>Sc Reg</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScTrans2SfTrans()
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScTrans2SfTrans_ScTrans()
	 * @model
	 * @generated
	 */
	Transition getScTrans();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScTrans2SfTrans#getScTrans <em>Sc Trans</em>}' reference.
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
	 * @see #setSfTrans(de.uni_paderborn.fujaba.simulink.model.stateflow.Transition)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScTrans2SfTrans_SfTrans()
	 * @model
	 * @generated
	 */
	de.uni_paderborn.fujaba.simulink.model.stateflow.Transition getSfTrans();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScTrans2SfTrans#getSfTrans <em>Sf Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Trans</em>' reference.
	 * @see #getSfTrans()
	 * @generated
	 */
	void setSfTrans(de.uni_paderborn.fujaba.simulink.model.stateflow.Transition value);

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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScTrans2SfTrans_ScReg()
	 * @model
	 * @generated
	 */
	Region getScReg();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScTrans2SfTrans#getScReg <em>Sc Reg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Reg</em>' reference.
	 * @see #getScReg()
	 * @generated
	 */
	void setScReg(Region value);

} // ScTrans2SfTrans
