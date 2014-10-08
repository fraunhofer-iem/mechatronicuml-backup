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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Async Rec2sf Dequeue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.scAsyncRec2sfDequeue#getScDetailsDequeue <em>Sc Details Dequeue</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scAsyncRec2sfDequeue#getScAction <em>Sc Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscAsyncRec2sfDequeue()
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscAsyncRec2sfDequeue_ScDetailsDequeue()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	Map.Entry<String, String> getScDetailsDequeue();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scAsyncRec2sfDequeue#getScDetailsDequeue <em>Sc Details Dequeue</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscAsyncRec2sfDequeue_ScAction()
	 * @model
	 * @generated
	 */
	Action getScAction();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scAsyncRec2sfDequeue#getScAction <em>Sc Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Action</em>' reference.
	 * @see #getScAction()
	 * @generated
	 */
	void setScAction(Action value);

} // scAsyncRec2sfDequeue
