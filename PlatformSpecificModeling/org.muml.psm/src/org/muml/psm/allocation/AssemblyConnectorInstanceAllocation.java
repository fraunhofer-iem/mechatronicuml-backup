/**
 */
package org.muml.psm.allocation;

import org.eclipse.emf.ecore.EObject;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Connector Instance Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an allocation of exactly one AssemblyConnectorInstance
 * to at most one NetworkConnectorInstance. If the networkConnectorInstance reference
 * is null, the component instances that are connected via the assemblyConnectorInstance
 * reference are allocated to the same ECU (and communicate by local means).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.AssemblyConnectorInstanceAllocation#getAssemblyConnectorInstance <em>Assembly Connector Instance</em>}</li>
 *   <li>{@link org.muml.psm.allocation.AssemblyConnectorInstanceAllocation#getNetworkConnectorInstance <em>Network Connector Instance</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.AllocationPackage#getAssemblyConnectorInstanceAllocation()
 * @model
 * @generated
 */
public interface AssemblyConnectorInstanceAllocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Assembly Connector Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The assembly connector instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assembly Connector Instance</em>' reference.
	 * @see #setAssemblyConnectorInstance(AssemblyConnectorInstance)
	 * @see org.muml.psm.allocation.AllocationPackage#getAssemblyConnectorInstanceAllocation_AssemblyConnectorInstance()
	 * @model required="true"
	 * @generated
	 */
	AssemblyConnectorInstance getAssemblyConnectorInstance();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.AssemblyConnectorInstanceAllocation#getAssemblyConnectorInstance <em>Assembly Connector Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Connector Instance</em>' reference.
	 * @see #getAssemblyConnectorInstance()
	 * @generated
	 */
	void setAssemblyConnectorInstance(AssemblyConnectorInstance value);

	/**
	 * Returns the value of the '<em><b>Network Connector Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The network connector instance that is used by the assemblyConnector.connectorEndpointInstances
	 * to communicate with each other. If this reference is null, the assemblyConnector.connectorEndpointInstances
	 * communicate with each other by local means.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Connector Instance</em>' reference.
	 * @see #setNetworkConnectorInstance(NetworkConnectorInstance)
	 * @see org.muml.psm.allocation.AllocationPackage#getAssemblyConnectorInstanceAllocation_NetworkConnectorInstance()
	 * @model
	 * @generated
	 */
	NetworkConnectorInstance getNetworkConnectorInstance();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.AssemblyConnectorInstanceAllocation#getNetworkConnectorInstance <em>Network Connector Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Connector Instance</em>' reference.
	 * @see #getNetworkConnectorInstance()
	 * @generated
	 */
	void setNetworkConnectorInstance(NetworkConnectorInstance value);

} // AssemblyConnectorInstanceAllocation
