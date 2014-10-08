/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import de.uni_paderborn.fujaba.muml.realtimestatechart.EntryPoint;
import de.uni_paderborn.fujaba.simulink.model.stateflow.Transition;
import fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sc St En Point2sf Trans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.ScStEnPoint2sfTrans#getSfTrans <em>Sf Trans</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScStEnPoint2sfTrans#getScInTrans <em>Sc In Trans</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScStEnPoint2sfTrans#getScOutTrans <em>Sc Out Trans</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScStEnPoint2sfTrans#getScStateEntryP <em>Sc State Entry P</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScStEnPoint2sfTrans()
 * @model
 * @generated
 */
public interface ScStEnPoint2sfTrans extends AbstractContainerCorrespondenceNode {
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScStEnPoint2sfTrans_SfTrans()
	 * @model
	 * @generated
	 */
	Transition getSfTrans();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScStEnPoint2sfTrans#getSfTrans <em>Sf Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Trans</em>' reference.
	 * @see #getSfTrans()
	 * @generated
	 */
	void setSfTrans(Transition value);

	/**
	 * Returns the value of the '<em><b>Sc In Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc In Trans</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc In Trans</em>' reference.
	 * @see #setScInTrans(de.uni_paderborn.fujaba.muml.realtimestatechart.Transition)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScStEnPoint2sfTrans_ScInTrans()
	 * @model
	 * @generated
	 */
	de.uni_paderborn.fujaba.muml.realtimestatechart.Transition getScInTrans();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScStEnPoint2sfTrans#getScInTrans <em>Sc In Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc In Trans</em>' reference.
	 * @see #getScInTrans()
	 * @generated
	 */
	void setScInTrans(de.uni_paderborn.fujaba.muml.realtimestatechart.Transition value);

	/**
	 * Returns the value of the '<em><b>Sc Out Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Out Trans</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Out Trans</em>' reference.
	 * @see #setScOutTrans(de.uni_paderborn.fujaba.muml.realtimestatechart.Transition)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScStEnPoint2sfTrans_ScOutTrans()
	 * @model
	 * @generated
	 */
	de.uni_paderborn.fujaba.muml.realtimestatechart.Transition getScOutTrans();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScStEnPoint2sfTrans#getScOutTrans <em>Sc Out Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Out Trans</em>' reference.
	 * @see #getScOutTrans()
	 * @generated
	 */
	void setScOutTrans(de.uni_paderborn.fujaba.muml.realtimestatechart.Transition value);

	/**
	 * Returns the value of the '<em><b>Sc State Entry P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc State Entry P</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc State Entry P</em>' reference.
	 * @see #setScStateEntryP(EntryPoint)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScStEnPoint2sfTrans_ScStateEntryP()
	 * @model
	 * @generated
	 */
	EntryPoint getScStateEntryP();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScStEnPoint2sfTrans#getScStateEntryP <em>Sc State Entry P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc State Entry P</em>' reference.
	 * @see #getScStateEntryP()
	 * @generated
	 */
	void setScStateEntryP(EntryPoint value);

} // ScStEnPoint2sfTrans
