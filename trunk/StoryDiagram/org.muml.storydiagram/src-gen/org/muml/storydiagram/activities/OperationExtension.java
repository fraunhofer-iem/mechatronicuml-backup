/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.activities;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.muml.storydiagram.SDMExtension;
import org.muml.storydiagram.calls.Callable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OperationExtension is a stand-in for an EOperation in our model. It is necessary because we cannot change the type EOperation. Thus, OperationExtension points to an EOperation but adds the reference to an Activity that describes the operations behavior.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.activities.OperationExtension#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.OperationExtension#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.OperationExtension#getOwnedActivity <em>Owned Activity</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.activities.ActivitiesPackage#getOperationExtension()
 * @model
 * @generated
 */
public interface OperationExtension extends SDMExtension, Callable {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EOperation whose behavior is defined by the Activity. The property is derived because the actual value is determined by the utility class OperationsExtensionOperation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getOperationExtension_Operation()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.getModelBase() <> null and self.getModelBase().oclIsKindOf(ecore::EOperation)) then self.getModelBase().oclAsType(ecore::EOperation) else null endif'"
	 * @generated
	 */
	EOperation getOperation();

	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The return value of the referenced operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Value</em>' containment reference.
	 * @see #setReturnValue(EParameter)
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getOperationExtension_ReturnValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EParameter getReturnValue();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.activities.OperationExtension#getReturnValue <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' containment reference.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(EParameter value);

	/**
	 * Returns the value of the '<em><b>Owned Activity</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.activities.Activity#getOwningOperation <em>Owning Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Activity</em>' containment reference.
	 * @see #setOwnedActivity(Activity)
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getOperationExtension_OwnedActivity()
	 * @see org.muml.storydiagram.activities.Activity#getOwningOperation
	 * @model opposite="owningOperation" containment="true" ordered="false"
	 * @generated
	 */
	Activity getOwnedActivity();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.activities.OperationExtension#getOwnedActivity <em>Owned Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Activity</em>' containment reference.
	 * @see #getOwnedActivity()
	 * @generated
	 */
	void setOwnedActivity(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.oclAsType(calls::Callable).outParameter->size() <= 1'"
	 * @generated
	 */
	boolean NumberOfOutParams(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // OperationExtension
