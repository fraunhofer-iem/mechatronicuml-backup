/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.instance;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.reconfiguration.Executor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executor Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ExecutorInstance#getExecutor <em>Executor</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ExecutorInstance#getReconfigurationControllerInstance <em>Reconfiguration Controller Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ExecutorInstance#getPortInstances <em>Port Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.InstancePackage#getExecutorInstance()
 * @model
 * @generated
 */
public interface ExecutorInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor</em>' reference.
	 * @see #setExecutor(Executor)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.InstancePackage#getExecutorInstance_Executor()
	 * @model required="true"
	 * @generated
	 */
	Executor getExecutor();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ExecutorInstance#getExecutor <em>Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor</em>' reference.
	 * @see #getExecutor()
	 * @generated
	 */
	void setExecutor(Executor value);

	/**
	 * Returns the value of the '<em><b>Reconfiguration Controller Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance#getExecutorInstance <em>Executor Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Controller Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfiguration Controller Instance</em>' container reference.
	 * @see #setReconfigurationControllerInstance(RuleBasedReconfigurationControllerInstance)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.InstancePackage#getExecutorInstance_ReconfigurationControllerInstance()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance#getExecutorInstance
	 * @model opposite="executorInstance" transient="false"
	 * @generated
	 */
	RuleBasedReconfigurationControllerInstance getReconfigurationControllerInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ExecutorInstance#getReconfigurationControllerInstance <em>Reconfiguration Controller Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Controller Instance</em>' container reference.
	 * @see #getReconfigurationControllerInstance()
	 * @generated
	 */
	void setReconfigurationControllerInstance(RuleBasedReconfigurationControllerInstance value);

	/**
	 * Returns the value of the '<em><b>Port Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationPortInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.InstancePackage#getExecutorInstance_PortInstances()
	 * @model
	 * @generated
	 */
	EList<ReconfigurationPortInstance> getPortInstances();

} // ExecutorInstance
