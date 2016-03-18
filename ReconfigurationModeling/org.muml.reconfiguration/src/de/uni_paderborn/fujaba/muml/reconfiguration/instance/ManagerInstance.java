/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.instance;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.reconfiguration.Manager;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance#getManager <em>Manager</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance#getReconfigurationControllerInstance <em>Reconfiguration Controller Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance#getPortInstances <em>Port Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.InstancePackage#getManagerInstance()
 * @model
 * @generated
 */
public interface ManagerInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(Manager)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.InstancePackage#getManagerInstance_Manager()
	 * @model required="true"
	 * @generated
	 */
	Manager getManager();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Manager value);

	/**
	 * Returns the value of the '<em><b>Reconfiguration Controller Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance#getManagerInstance <em>Manager Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Controller Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfiguration Controller Instance</em>' container reference.
	 * @see #setReconfigurationControllerInstance(RuleBasedReconfigurationControllerInstance)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.InstancePackage#getManagerInstance_ReconfigurationControllerInstance()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance#getManagerInstance
	 * @model opposite="managerInstance" transient="false"
	 * @generated
	 */
	RuleBasedReconfigurationControllerInstance getReconfigurationControllerInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance#getReconfigurationControllerInstance <em>Reconfiguration Controller Instance</em>}' container reference.
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
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.instance.InstancePackage#getManagerInstance_PortInstances()
	 * @model
	 * @generated
	 */
	EList<ReconfigurationPortInstance> getPortInstances();

} // ManagerInstance
