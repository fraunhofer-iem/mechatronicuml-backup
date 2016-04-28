/**
 */
package org.muml.reconfiguration.reconfInstance;

import org.eclipse.emf.common.util.EList;
import org.muml.core.NamedElement;
import org.muml.reconfiguration.Manager;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.reconfInstance.ManagerInstance#getManager <em>Manager</em>}</li>
 *   <li>{@link org.muml.reconfiguration.reconfInstance.ManagerInstance#getReconfigurationControllerInstance <em>Reconfiguration Controller Instance</em>}</li>
 *   <li>{@link org.muml.reconfiguration.reconfInstance.ManagerInstance#getPortInstances <em>Port Instances</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.reconfInstance.ReconfInstancePackage#getManagerInstance()
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
	 * @see org.muml.reconfiguration.reconfInstance.ReconfInstancePackage#getManagerInstance_Manager()
	 * @model required="true"
	 * @generated
	 */
	Manager getManager();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.reconfInstance.ManagerInstance#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Manager value);

	/**
	 * Returns the value of the '<em><b>Reconfiguration Controller Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.reconfiguration.reconfInstance.RuleBasedReconfigurationControllerInstance#getManagerInstance <em>Manager Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Controller Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfiguration Controller Instance</em>' container reference.
	 * @see #setReconfigurationControllerInstance(RuleBasedReconfigurationControllerInstance)
	 * @see org.muml.reconfiguration.reconfInstance.ReconfInstancePackage#getManagerInstance_ReconfigurationControllerInstance()
	 * @see org.muml.reconfiguration.reconfInstance.RuleBasedReconfigurationControllerInstance#getManagerInstance
	 * @model opposite="managerInstance" transient="false"
	 * @generated
	 */
	RuleBasedReconfigurationControllerInstance getReconfigurationControllerInstance();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.reconfInstance.ManagerInstance#getReconfigurationControllerInstance <em>Reconfiguration Controller Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Controller Instance</em>' container reference.
	 * @see #getReconfigurationControllerInstance()
	 * @generated
	 */
	void setReconfigurationControllerInstance(RuleBasedReconfigurationControllerInstance value);

	/**
	 * Returns the value of the '<em><b>Port Instances</b></em>' reference list.
	 * The list contents are of type {@link org.muml.reconfiguration.reconfInstance.ReconfigurationPortInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Instances</em>' reference list.
	 * @see org.muml.reconfiguration.reconfInstance.ReconfInstancePackage#getManagerInstance_PortInstances()
	 * @model
	 * @generated
	 */
	EList<ReconfigurationPortInstance> getPortInstances();

} // ManagerInstance
