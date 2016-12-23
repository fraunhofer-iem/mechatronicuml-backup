/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.muml.pim.behavior.Operation;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.stateflow.EmbeddedFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Op2sf Emb Func</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc#getScOperation <em>Sc Operation</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc#getSfEmbFunc <em>Sf Emb Func</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc#getScAnnotation <em>Sc Annotation</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc#getScDetails <em>Sc Details</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscOp2sfEmbFunc()
 * @model
 * @generated
 */
public interface scOp2sfEmbFunc extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sc Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Operation</em>' reference.
	 * @see #setScOperation(Operation)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscOp2sfEmbFunc_ScOperation()
	 * @model
	 * @generated
	 */
	Operation getScOperation();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc#getScOperation <em>Sc Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Operation</em>' reference.
	 * @see #getScOperation()
	 * @generated
	 */
	void setScOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Sf Emb Func</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Emb Func</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Emb Func</em>' reference.
	 * @see #setSfEmbFunc(EmbeddedFunction)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscOp2sfEmbFunc_SfEmbFunc()
	 * @model
	 * @generated
	 */
	EmbeddedFunction getSfEmbFunc();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc#getSfEmbFunc <em>Sf Emb Func</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Emb Func</em>' reference.
	 * @see #getSfEmbFunc()
	 * @generated
	 */
	void setSfEmbFunc(EmbeddedFunction value);

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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscOp2sfEmbFunc_ScAnnotation()
	 * @model
	 * @generated
	 */
	EAnnotation getScAnnotation();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc#getScAnnotation <em>Sc Annotation</em>}' reference.
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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscOp2sfEmbFunc_ScDetails()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	Map.Entry<String, String> getScDetails();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc#getScDetails <em>Sc Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Details</em>' reference.
	 * @see #getScDetails()
	 * @generated
	 */
	void setScDetails(Map.Entry<String, String> value);

} // scOp2sfEmbFunc
