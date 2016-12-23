/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.activities;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EGenericType;
import org.muml.storydiagram.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Declares a variable representing an Exception that leads to firing a transition (ActivityEdge). Can only be applied to ActivityEdge whose guard is set to EXCEPTION.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.activities.ExceptionVariable#getActivityEdge <em>Activity Edge</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.ExceptionVariable#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.ExceptionVariable#getGenericExceptionTypes <em>Generic Exception Types</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.activities.ActivitiesPackage#getExceptionVariable()
 * @model
 * @generated
 */
public interface ExceptionVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Activity Edge</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.activities.ActivityEdge#getGuardExceptions <em>Guard Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the transition (activity edge) where the exception variable is declared.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Edge</em>' container reference.
	 * @see #setActivityEdge(ActivityEdge)
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getExceptionVariable_ActivityEdge()
	 * @see org.muml.storydiagram.activities.ActivityEdge#getGuardExceptions
	 * @model opposite="guardExceptions" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ActivityEdge getActivityEdge();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.activities.ExceptionVariable#getActivityEdge <em>Activity Edge</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Edge</em>' container reference.
	 * @see #getActivityEdge()
	 * @generated
	 */
	void setActivityEdge(ActivityEdge value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the name of the declared exception variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getExceptionVariable_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.activities.ExceptionVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Generic Exception Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Exception Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Exception Types</em>' reference list.
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getExceptionVariable_GenericExceptionTypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EGenericType> getGenericExceptionTypes();

} // ExceptionVariable
