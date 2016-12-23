/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import java.util.Map;

import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.stateflow.Action;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Async Rec2sf Dequeue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfDequeue#getScDetailsDequeue <em>Sc Details Dequeue</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfDequeue#getScAction <em>Sc Action</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscAsyncRec2sfDequeue()
 * @model
 * @generated
 */
public interface scAsyncRec2sfDequeue extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sc Details Dequeue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Details Dequeue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Details Dequeue</em>' reference.
	 * @see #setScDetailsDequeue(Map.Entry)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscAsyncRec2sfDequeue_ScDetailsDequeue()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	Map.Entry<String, String> getScDetailsDequeue();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfDequeue#getScDetailsDequeue <em>Sc Details Dequeue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Details Dequeue</em>' reference.
	 * @see #getScDetailsDequeue()
	 * @generated
	 */
	void setScDetailsDequeue(Map.Entry<String, String> value);

	/**
	 * Returns the value of the '<em><b>Sc Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Action</em>' reference.
	 * @see #setScAction(Action)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscAsyncRec2sfDequeue_ScAction()
	 * @model
	 * @generated
	 */
	Action getScAction();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfDequeue#getScAction <em>Sc Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Action</em>' reference.
	 * @see #getScAction()
	 * @generated
	 */
	void setScAction(Action value);

} // scAsyncRec2sfDequeue
