/**
 */
package org.muml.psm.allocation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance;
import org.muml.psm.allocation.AllocationPackage;
import org.muml.psm.allocation.AssemblyConnectorInstanceAllocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Connector Instance Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.impl.AssemblyConnectorInstanceAllocationImpl#getAssemblyConnectorInstance <em>Assembly Connector Instance</em>}</li>
 *   <li>{@link org.muml.psm.allocation.impl.AssemblyConnectorInstanceAllocationImpl#getNetworkConnectorInstance <em>Network Connector Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyConnectorInstanceAllocationImpl extends MinimalEObjectImpl.Container implements AssemblyConnectorInstanceAllocation {
	/**
	 * The cached value of the '{@link #getAssemblyConnectorInstance() <em>Assembly Connector Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyConnectorInstance()
	 * @generated
	 * @ordered
	 */
	protected AssemblyConnectorInstance assemblyConnectorInstance;

	/**
	 * The cached value of the '{@link #getNetworkConnectorInstance() <em>Network Connector Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkConnectorInstance()
	 * @generated
	 * @ordered
	 */
	protected NetworkConnectorInstance networkConnectorInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorInstanceAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationPackage.Literals.ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnectorInstance getAssemblyConnectorInstance() {
		if (assemblyConnectorInstance != null && assemblyConnectorInstance.eIsProxy()) {
			InternalEObject oldAssemblyConnectorInstance = (InternalEObject)assemblyConnectorInstance;
			assemblyConnectorInstance = (AssemblyConnectorInstance)eResolveProxy(oldAssemblyConnectorInstance);
			if (assemblyConnectorInstance != oldAssemblyConnectorInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationPackage.ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION__ASSEMBLY_CONNECTOR_INSTANCE, oldAssemblyConnectorInstance, assemblyConnectorInstance));
			}
		}
		return assemblyConnectorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnectorInstance basicGetAssemblyConnectorInstance() {
		return assemblyConnectorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyConnectorInstance(AssemblyConnectorInstance newAssemblyConnectorInstance) {
		AssemblyConnectorInstance oldAssemblyConnectorInstance = assemblyConnectorInstance;
		assemblyConnectorInstance = newAssemblyConnectorInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationPackage.ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION__ASSEMBLY_CONNECTOR_INSTANCE, oldAssemblyConnectorInstance, assemblyConnectorInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkConnectorInstance getNetworkConnectorInstance() {
		if (networkConnectorInstance != null && networkConnectorInstance.eIsProxy()) {
			InternalEObject oldNetworkConnectorInstance = (InternalEObject)networkConnectorInstance;
			networkConnectorInstance = (NetworkConnectorInstance)eResolveProxy(oldNetworkConnectorInstance);
			if (networkConnectorInstance != oldNetworkConnectorInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationPackage.ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION__NETWORK_CONNECTOR_INSTANCE, oldNetworkConnectorInstance, networkConnectorInstance));
			}
		}
		return networkConnectorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkConnectorInstance basicGetNetworkConnectorInstance() {
		return networkConnectorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkConnectorInstance(NetworkConnectorInstance newNetworkConnectorInstance) {
		NetworkConnectorInstance oldNetworkConnectorInstance = networkConnectorInstance;
		networkConnectorInstance = newNetworkConnectorInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationPackage.ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION__NETWORK_CONNECTOR_INSTANCE, oldNetworkConnectorInstance, networkConnectorInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AllocationPackage.ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION__ASSEMBLY_CONNECTOR_INSTANCE:
				if (resolve) return getAssemblyConnectorInstance();
				return basicGetAssemblyConnectorInstance();
			case AllocationPackage.ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION__NETWORK_CONNECTOR_INSTANCE:
				if (resolve) return getNetworkConnectorInstance();
				return basicGetNetworkConnectorInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AllocationPackage.ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION__ASSEMBLY_CONNECTOR_INSTANCE:
				setAssemblyConnectorInstance((AssemblyConnectorInstance)newValue);
				return;
			case AllocationPackage.ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION__NETWORK_CONNECTOR_INSTANCE:
				setNetworkConnectorInstance((NetworkConnectorInstance)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AllocationPackage.ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION__ASSEMBLY_CONNECTOR_INSTANCE:
				setAssemblyConnectorInstance((AssemblyConnectorInstance)null);
				return;
			case AllocationPackage.ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION__NETWORK_CONNECTOR_INSTANCE:
				setNetworkConnectorInstance((NetworkConnectorInstance)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AllocationPackage.ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION__ASSEMBLY_CONNECTOR_INSTANCE:
				return assemblyConnectorInstance != null;
			case AllocationPackage.ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION__NETWORK_CONNECTOR_INSTANCE:
				return networkConnectorInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyConnectorInstanceAllocationImpl
