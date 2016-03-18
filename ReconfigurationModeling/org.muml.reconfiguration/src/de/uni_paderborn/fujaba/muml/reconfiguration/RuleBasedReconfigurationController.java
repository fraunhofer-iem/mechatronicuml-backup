/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Based Reconfiguration Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RuleBasedReconfigurationController uses a declarative approach for 
 * defining the reconfiguration behavior. It consists of a manager and an executor.
 * The manager decides when to execute which reconfiguration while the executor
 * executes reconfiguration with respect to hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController#getExecutor <em>Executor</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController#getManager <em>Manager</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getRuleBasedReconfigurationController()
 * @model
 * @generated
 */
public interface RuleBasedReconfigurationController extends ReconfigurationController {
	/**
	 * Returns the value of the '<em><b>Executor</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Executor#getReconfigurationController <em>Reconfiguration Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The executor of this RuleBasedReconfigurationController that is responsible
	 * for executing reconfigurations with respect to hierarchy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executor</em>' containment reference.
	 * @see #setExecutor(Executor)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getRuleBasedReconfigurationController_Executor()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.Executor#getReconfigurationController
	 * @model opposite="reconfigurationController" containment="true" required="true"
	 * @generated
	 */
	Executor getExecutor();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController#getExecutor <em>Executor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor</em>' containment reference.
	 * @see #getExecutor()
	 * @generated
	 */
	void setExecutor(Executor value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getReconfigurationController <em>Reconfiguration Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The manager of this RuleBasedReconfigurationController that is used for 
	 * deciding when to execute which reconfiguration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manager</em>' containment reference.
	 * @see #setManager(Manager)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getRuleBasedReconfigurationController_Manager()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getReconfigurationController
	 * @model opposite="reconfigurationController" containment="true" required="true"
	 * @generated
	 */
	Manager getManager();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController#getManager <em>Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' containment reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Manager value);

} // RuleBasedReconfigurationController
