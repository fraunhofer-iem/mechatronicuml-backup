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
 * A representation of the model object '<em><b>sc Sync Send2sf Sync Send</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend#getSfGuard <em>Sf Guard</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend#getSfAssignment <em>Sf Assignment</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend#getScTransAnnotation <em>Sc Trans Annotation</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend#getScAnnDetails <em>Sc Ann Details</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscSyncSend2sfSyncSend()
 * @model
 * @generated
 */
public interface scSyncSend2sfSyncSend extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sf Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Guard</em>' reference.
	 * @see #setSfGuard(Action)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscSyncSend2sfSyncSend_SfGuard()
	 * @model
	 * @generated
	 */
	Action getSfGuard();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend#getSfGuard <em>Sf Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Guard</em>' reference.
	 * @see #getSfGuard()
	 * @generated
	 */
	void setSfGuard(Action value);

	/**
	 * Returns the value of the '<em><b>Sf Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Assignment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Assignment</em>' reference.
	 * @see #setSfAssignment(Action)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscSyncSend2sfSyncSend_SfAssignment()
	 * @model
	 * @generated
	 */
	Action getSfAssignment();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend#getSfAssignment <em>Sf Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Assignment</em>' reference.
	 * @see #getSfAssignment()
	 * @generated
	 */
	void setSfAssignment(Action value);

	/**
	 * Returns the value of the '<em><b>Sc Trans Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Trans Annotation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Trans Annotation</em>' reference.
	 * @see #setScTransAnnotation(EAnnotation)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscSyncSend2sfSyncSend_ScTransAnnotation()
	 * @model
	 * @generated
	 */
	EAnnotation getScTransAnnotation();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend#getScTransAnnotation <em>Sc Trans Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Trans Annotation</em>' reference.
	 * @see #getScTransAnnotation()
	 * @generated
	 */
	void setScTransAnnotation(EAnnotation value);

	/**
	 * Returns the value of the '<em><b>Sc Ann Details</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Ann Details</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Ann Details</em>' reference.
	 * @see #setScAnnDetails(Map.Entry)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscSyncSend2sfSyncSend_ScAnnDetails()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	Map.Entry<String, String> getScAnnDetails();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend#getScAnnDetails <em>Sc Ann Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Ann Details</em>' reference.
	 * @see #getScAnnDetails()
	 * @generated
	 */
	void setScAnnDetails(Map.Entry<String, String> value);

} // scSyncSend2sfSyncSend
