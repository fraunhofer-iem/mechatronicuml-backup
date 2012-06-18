/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package deployment;

import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment.HardwareNode#getHardwarePorts <em>Hardware Ports</em>}</li>
 *   <li>{@link deployment.HardwareNode#getComponentInstanceOfNode <em>Component Instance Of Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment.DeploymentPackage#getHardwareNode()
 * @model
 * @generated
 */
public interface HardwareNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Hardware Ports</b></em>' containment reference list.
	 * The list contents are of type {@link deployment.HardwarePort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Ports</em>' containment reference list.
	 * @see deployment.DeploymentPackage#getHardwareNode_HardwarePorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<HardwarePort> getHardwarePorts();

	/**
	 * Returns the value of the '<em><b>Component Instance Of Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance Of Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance Of Node</em>' reference.
	 * @see #setComponentInstanceOfNode(ComponentInstance)
	 * @see deployment.DeploymentPackage#getHardwareNode_ComponentInstanceOfNode()
	 * @model
	 * @generated
	 */
	ComponentInstance getComponentInstanceOfNode();

	/**
	 * Sets the value of the '{@link deployment.HardwareNode#getComponentInstanceOfNode <em>Component Instance Of Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance Of Node</em>' reference.
	 * @see #getComponentInstanceOfNode()
	 * @generated
	 */
	void setComponentInstanceOfNode(ComponentInstance value);

} // HardwareNode
