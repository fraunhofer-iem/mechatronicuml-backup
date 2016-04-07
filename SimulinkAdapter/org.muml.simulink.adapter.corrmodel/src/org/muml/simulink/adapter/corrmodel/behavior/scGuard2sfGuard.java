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
 * A representation of the model object '<em><b>sc Guard2sf Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scGuard2sfGuard#getSfGuard <em>Sf Guard</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scGuard2sfGuard#getScAnnotation <em>Sc Annotation</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scGuard2sfGuard#getScDetails <em>Sc Details</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscGuard2sfGuard()
 * @model
 * @generated
 */
public interface scGuard2sfGuard extends AbstractContainerCorrespondenceNode {
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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscGuard2sfGuard_SfGuard()
	 * @model
	 * @generated
	 */
	Action getSfGuard();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scGuard2sfGuard#getSfGuard <em>Sf Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Guard</em>' reference.
	 * @see #getSfGuard()
	 * @generated
	 */
	void setSfGuard(Action value);

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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscGuard2sfGuard_ScAnnotation()
	 * @model
	 * @generated
	 */
	EAnnotation getScAnnotation();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scGuard2sfGuard#getScAnnotation <em>Sc Annotation</em>}' reference.
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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscGuard2sfGuard_ScDetails()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	Map.Entry<String, String> getScDetails();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scGuard2sfGuard#getScDetails <em>Sc Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Details</em>' reference.
	 * @see #getScDetails()
	 * @generated
	 */
	void setScDetails(Map.Entry<String, String> value);

} // scGuard2sfGuard
