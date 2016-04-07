/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.stateflow.Action;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Send Para Bind2sf Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction#getSfParaBAction <em>Sf Para BAction</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction#getScAnnotation <em>Sc Annotation</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction#getScDetails <em>Sc Details</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscSendParaBind2sfAction()
 * @model
 * @generated
 */
public interface scSendParaBind2sfAction extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sf Para BAction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Para BAction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Para BAction</em>' reference.
	 * @see #setSfParaBAction(Action)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscSendParaBind2sfAction_SfParaBAction()
	 * @model
	 * @generated
	 */
	Action getSfParaBAction();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction#getSfParaBAction <em>Sf Para BAction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Para BAction</em>' reference.
	 * @see #getSfParaBAction()
	 * @generated
	 */
	void setSfParaBAction(Action value);

	/**
	 * Returns the value of the '<em><b>Sc Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Annotation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Annotation</em>' reference.
	 * @see #setScAnnotation(EAnnotation)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscSendParaBind2sfAction_ScAnnotation()
	 * @model
	 * @generated
	 */
	EAnnotation getScAnnotation();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction#getScAnnotation <em>Sc Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Annotation</em>' reference.
	 * @see #getScAnnotation()
	 * @generated
	 */
	void setScAnnotation(EAnnotation value);

	/**
	 * Returns the value of the '<em><b>Sc Details</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Details</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Details</em>' reference.
	 * @see #setScDetails(Map.Entry)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscSendParaBind2sfAction_ScDetails()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	Map.Entry<String, String> getScDetails();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction#getScDetails <em>Sc Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Details</em>' reference.
	 * @see #getScDetails()
	 * @generated
	 */
	void setScDetails(Map.Entry<String, String> value);

} // scSendParaBind2sfAction
