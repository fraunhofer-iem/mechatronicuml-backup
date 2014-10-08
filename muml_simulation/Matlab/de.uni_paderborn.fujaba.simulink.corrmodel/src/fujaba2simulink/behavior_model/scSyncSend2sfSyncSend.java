/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import de.uni_paderborn.fujaba.simulink.model.stateflow.Action;

import fujaba2simulink.AbstractContainerCorrespondenceNode;

import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Sync Send2sf Sync Send</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.scSyncSend2sfSyncSend#getSfGuard <em>Sf Guard</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scSyncSend2sfSyncSend#getSfAssignment <em>Sf Assignment</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scSyncSend2sfSyncSend#getScTransAnnotation <em>Sc Trans Annotation</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scSyncSend2sfSyncSend#getScAnnDetails <em>Sc Ann Details</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscSyncSend2sfSyncSend()
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscSyncSend2sfSyncSend_SfGuard()
	 * @model
	 * @generated
	 */
	Action getSfGuard();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scSyncSend2sfSyncSend#getSfGuard <em>Sf Guard</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscSyncSend2sfSyncSend_SfAssignment()
	 * @model
	 * @generated
	 */
	Action getSfAssignment();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scSyncSend2sfSyncSend#getSfAssignment <em>Sf Assignment</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscSyncSend2sfSyncSend_ScTransAnnotation()
	 * @model
	 * @generated
	 */
	EAnnotation getScTransAnnotation();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scSyncSend2sfSyncSend#getScTransAnnotation <em>Sc Trans Annotation</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscSyncSend2sfSyncSend_ScAnnDetails()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	Map.Entry<String, String> getScAnnDetails();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scSyncSend2sfSyncSend#getScAnnDetails <em>Sc Ann Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Ann Details</em>' reference.
	 * @see #getScAnnDetails()
	 * @generated
	 */
	void setScAnnDetails(Map.Entry<String, String> value);

} // scSyncSend2sfSyncSend
