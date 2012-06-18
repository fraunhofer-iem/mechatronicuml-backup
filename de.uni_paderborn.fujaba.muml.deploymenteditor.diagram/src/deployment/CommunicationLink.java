/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package deployment;

import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link deployment.CommunicationLink#getHardwarePort <em>Hardware Port</em>}</li>
 *   <li>{@link deployment.CommunicationLink#getComponentInstancePort <em>Component Instance Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment.DeploymentPackage#getCommunicationLink()
 * @model
 * @generated
 */
public interface CommunicationLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Hardware Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Port</em>' reference.
	 * @see #setHardwarePort(HardwarePort)
	 * @see deployment.DeploymentPackage#getCommunicationLink_HardwarePort()
	 * @model required="true"
	 * @generated
	 */
	HardwarePort getHardwarePort();

	/**
	 * Sets the value of the '{@link deployment.CommunicationLink#getHardwarePort <em>Hardware Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Port</em>' reference.
	 * @see #getHardwarePort()
	 * @generated
	 */
	void setHardwarePort(HardwarePort value);

	/**
	 * Returns the value of the '<em><b>Component Instance Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance Port</em>' reference.
	 * @see #setComponentInstancePort(PortInstance)
	 * @see deployment.DeploymentPackage#getCommunicationLink_ComponentInstancePort()
	 * @model required="true"
	 * @generated
	 */
	PortInstance getComponentInstancePort();

	/**
	 * Sets the value of the '{@link deployment.CommunicationLink#getComponentInstancePort <em>Component Instance Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance Port</em>' reference.
	 * @see #getComponentInstancePort()
	 * @generated
	 */
	void setComponentInstancePort(PortInstance value);

} // CommunicationLink
