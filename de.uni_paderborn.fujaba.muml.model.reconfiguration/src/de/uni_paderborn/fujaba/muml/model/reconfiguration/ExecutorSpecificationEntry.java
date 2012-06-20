/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executor Specification Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getExecutor <em>Executor</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getReconfigurationRule <em>Reconfiguration Rule</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#isExternallyVisible <em>Externally Visible</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getTimeToFailure <em>Time To Failure</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getTimeToSuccess <em>Time To Success</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getExecutorSpecificationEntry()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TimeToFailureLessOrEqualToTimeToSuccess'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL TimeToFailureLessOrEqualToTimeToSuccess='self.timeToFailure <= self.timeToSuccess'"
 * @generated
 */
public interface ExecutorSpecificationEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Executor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.Executor#getSpecificationEntries <em>Specification Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor</em>' container reference.
	 * @see #setExecutor(Executor)
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getExecutorSpecificationEntry_Executor()
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.Executor#getSpecificationEntries
	 * @model opposite="specificationEntries" required="true" transient="false"
	 * @generated
	 */
	Executor getExecutor();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getExecutor <em>Executor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor</em>' container reference.
	 * @see #getExecutor()
	 * @generated
	 */
	void setExecutor(Executor value);

	/**
	 * Returns the value of the '<em><b>Reconfiguration Rule</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Rule</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfiguration Rule</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getExecutorSpecificationEntry_ReconfigurationRule()
	 * @model
	 * @generated
	 */
	EList<ReconfigurationRule> getReconfigurationRule();

	/**
	 * Returns the value of the '<em><b>Externally Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externally Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externally Visible</em>' attribute.
	 * @see #setExternallyVisible(boolean)
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getExecutorSpecificationEntry_ExternallyVisible()
	 * @model default="true"
	 * @generated
	 */
	boolean isExternallyVisible();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#isExternallyVisible <em>Externally Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externally Visible</em>' attribute.
	 * @see #isExternallyVisible()
	 * @generated
	 */
	void setExternallyVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Time To Failure</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time To Failure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time To Failure</em>' attribute.
	 * @see #setTimeToFailure(int)
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getExecutorSpecificationEntry_TimeToFailure()
	 * @model default="0"
	 * @generated
	 */
	int getTimeToFailure();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getTimeToFailure <em>Time To Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time To Failure</em>' attribute.
	 * @see #getTimeToFailure()
	 * @generated
	 */
	void setTimeToFailure(int value);

	/**
	 * Returns the value of the '<em><b>Time To Success</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time To Success</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time To Success</em>' attribute.
	 * @see #setTimeToSuccess(int)
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getExecutorSpecificationEntry_TimeToSuccess()
	 * @model default="0"
	 * @generated
	 */
	int getTimeToSuccess();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry#getTimeToSuccess <em>Time To Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time To Success</em>' attribute.
	 * @see #getTimeToSuccess()
	 * @generated
	 */
	void setTimeToSuccess(int value);

} // ExecutorSpecificationEntry
