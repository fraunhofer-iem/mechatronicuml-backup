/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;

import de.uni_paderborn.fujaba.muml.realtimestatechart.AsynchronousMessageEvent;
import de.uni_paderborn.fujaba.simulink.model.stateflow.Action;
import fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Async Rec2sf Async Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.scAsyncRec2sfAsyncGuard#getGuardAnnotation <em>Guard Annotation</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scAsyncRec2sfAsyncGuard#getEAnnotation <em>EAnnotation</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scAsyncRec2sfAsyncGuard#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scAsyncRec2sfAsyncGuard#getAsyncRecGuard <em>Async Rec Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscAsyncRec2sfAsyncGuard()
 * @model
 * @generated
 */
public interface scAsyncRec2sfAsyncGuard extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Guard Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Annotation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Annotation</em>' reference.
	 * @see #setGuardAnnotation(Map.Entry)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscAsyncRec2sfAsyncGuard_GuardAnnotation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	Map.Entry<String, String> getGuardAnnotation();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scAsyncRec2sfAsyncGuard#getGuardAnnotation <em>Guard Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Annotation</em>' reference.
	 * @see #getGuardAnnotation()
	 * @generated
	 */
	void setGuardAnnotation(Map.Entry<String, String> value);

	/**
	 * Returns the value of the '<em><b>EAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAnnotation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAnnotation</em>' reference.
	 * @see #setEAnnotation(EAnnotation)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscAsyncRec2sfAsyncGuard_EAnnotation()
	 * @model
	 * @generated
	 */
	EAnnotation getEAnnotation();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scAsyncRec2sfAsyncGuard#getEAnnotation <em>EAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAnnotation</em>' reference.
	 * @see #getEAnnotation()
	 * @generated
	 */
	void setEAnnotation(EAnnotation value);

	/**
	 * Returns the value of the '<em><b>Asynchronous Message Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asynchronous Message Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asynchronous Message Event</em>' reference.
	 * @see #setAsynchronousMessageEvent(AsynchronousMessageEvent)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscAsyncRec2sfAsyncGuard_AsynchronousMessageEvent()
	 * @model
	 * @generated
	 */
	AsynchronousMessageEvent getAsynchronousMessageEvent();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scAsyncRec2sfAsyncGuard#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asynchronous Message Event</em>' reference.
	 * @see #getAsynchronousMessageEvent()
	 * @generated
	 */
	void setAsynchronousMessageEvent(AsynchronousMessageEvent value);

	/**
	 * Returns the value of the '<em><b>Async Rec Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Async Rec Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Async Rec Guard</em>' reference.
	 * @see #setAsyncRecGuard(Action)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscAsyncRec2sfAsyncGuard_AsyncRecGuard()
	 * @model
	 * @generated
	 */
	Action getAsyncRecGuard();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scAsyncRec2sfAsyncGuard#getAsyncRecGuard <em>Async Rec Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Async Rec Guard</em>' reference.
	 * @see #getAsyncRecGuard()
	 * @generated
	 */
	void setAsyncRecGuard(Action value);

} // scAsyncRec2sfAsyncGuard
