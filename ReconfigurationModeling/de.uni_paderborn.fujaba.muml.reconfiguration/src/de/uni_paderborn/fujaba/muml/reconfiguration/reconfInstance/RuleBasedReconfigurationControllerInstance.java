/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Based Reconfiguration Controller Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.RuleBasedReconfigurationControllerInstance#getManagerInstance <em>Manager Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.RuleBasedReconfigurationControllerInstance#getExecutorInstance <em>Executor Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfInstancePackage#getRuleBasedReconfigurationControllerInstance()
 * @model
 * @generated
 */
public interface RuleBasedReconfigurationControllerInstance extends ReconfigurationControllerInstance {
	/**
	 * Returns the value of the '<em><b>Manager Instance</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ManagerInstance#getReconfigurationControllerInstance <em>Reconfiguration Controller Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager Instance</em>' containment reference.
	 * @see #setManagerInstance(ManagerInstance)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfInstancePackage#getRuleBasedReconfigurationControllerInstance_ManagerInstance()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ManagerInstance#getReconfigurationControllerInstance
	 * @model opposite="reconfigurationControllerInstance" containment="true" required="true"
	 * @generated
	 */
	ManagerInstance getManagerInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.RuleBasedReconfigurationControllerInstance#getManagerInstance <em>Manager Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager Instance</em>' containment reference.
	 * @see #getManagerInstance()
	 * @generated
	 */
	void setManagerInstance(ManagerInstance value);

	/**
	 * Returns the value of the '<em><b>Executor Instance</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ExecutorInstance#getReconfigurationControllerInstance <em>Reconfiguration Controller Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor Instance</em>' containment reference.
	 * @see #setExecutorInstance(ExecutorInstance)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfInstancePackage#getRuleBasedReconfigurationControllerInstance_ExecutorInstance()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ExecutorInstance#getReconfigurationControllerInstance
	 * @model opposite="reconfigurationControllerInstance" containment="true" required="true"
	 * @generated
	 */
	ExecutorInstance getExecutorInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.RuleBasedReconfigurationControllerInstance#getExecutorInstance <em>Executor Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor Instance</em>' containment reference.
	 * @see #getExecutorInstance()
	 * @generated
	 */
	void setExecutorInstance(ExecutorInstance value);

} // RuleBasedReconfigurationControllerInstance
