/**
 */
package org.muml.psm.allocation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.mumlcore.impl.ExtendableElementImpl;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.psm.allocation.Allocation;
import org.muml.psm.allocation.AllocationPackage;
import org.muml.psm.allocation.AssemblyConnectorInstanceAllocation;
import org.muml.psm.allocation.SystemAllocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.impl.SystemAllocationImpl#getAllocations <em>Allocations</em>}</li>
 *   <li>{@link org.muml.psm.allocation.impl.SystemAllocationImpl#getCic <em>Cic</em>}</li>
 *   <li>{@link org.muml.psm.allocation.impl.SystemAllocationImpl#getHpic <em>Hpic</em>}</li>
 *   <li>{@link org.muml.psm.allocation.impl.SystemAllocationImpl#getAssemblyConnectorInstanceAllocations <em>Assembly Connector Instance Allocations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemAllocationImpl extends ExtendableElementImpl implements SystemAllocation {
	/**
	 * The cached value of the '{@link #getAllocations() <em>Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Allocation> allocations;

	/**
	 * The cached value of the '{@link #getCic() <em>Cic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCic()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstanceConfiguration cic;
	/**
	 * The cached value of the '{@link #getHpic() <em>Hpic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHpic()
	 * @generated
	 * @ordered
	 */
	protected HWPlatformInstanceConfiguration hpic;

	/**
	 * The cached value of the '{@link #getAssemblyConnectorInstanceAllocations() <em>Assembly Connector Instance Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyConnectorInstanceAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyConnectorInstanceAllocation> assemblyConnectorInstanceAllocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationPackage.Literals.SYSTEM_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Allocation> getAllocations() {
		if (allocations == null) {
			allocations = new EObjectContainmentEList<Allocation>(Allocation.class, this, AllocationPackage.SYSTEM_ALLOCATION__ALLOCATIONS);
		}
		return allocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration getCic() {
		if (cic != null && cic.eIsProxy()) {
			InternalEObject oldCic = (InternalEObject)cic;
			cic = (ComponentInstanceConfiguration)eResolveProxy(oldCic);
			if (cic != oldCic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationPackage.SYSTEM_ALLOCATION__CIC, oldCic, cic));
			}
		}
		return cic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration basicGetCic() {
		return cic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCic(ComponentInstanceConfiguration newCic) {
		ComponentInstanceConfiguration oldCic = cic;
		cic = newCic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationPackage.SYSTEM_ALLOCATION__CIC, oldCic, cic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformInstanceConfiguration getHpic() {
		if (hpic != null && hpic.eIsProxy()) {
			InternalEObject oldHpic = (InternalEObject)hpic;
			hpic = (HWPlatformInstanceConfiguration)eResolveProxy(oldHpic);
			if (hpic != oldHpic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationPackage.SYSTEM_ALLOCATION__HPIC, oldHpic, hpic));
			}
		}
		return hpic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformInstanceConfiguration basicGetHpic() {
		return hpic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHpic(HWPlatformInstanceConfiguration newHpic) {
		HWPlatformInstanceConfiguration oldHpic = hpic;
		hpic = newHpic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationPackage.SYSTEM_ALLOCATION__HPIC, oldHpic, hpic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyConnectorInstanceAllocation> getAssemblyConnectorInstanceAllocations() {
		if (assemblyConnectorInstanceAllocations == null) {
			assemblyConnectorInstanceAllocations = new EObjectContainmentEList<AssemblyConnectorInstanceAllocation>(AssemblyConnectorInstanceAllocation.class, this, AllocationPackage.SYSTEM_ALLOCATION__ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATIONS);
		}
		return assemblyConnectorInstanceAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocationPackage.SYSTEM_ALLOCATION__ALLOCATIONS:
				return ((InternalEList<?>)getAllocations()).basicRemove(otherEnd, msgs);
			case AllocationPackage.SYSTEM_ALLOCATION__ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATIONS:
				return ((InternalEList<?>)getAssemblyConnectorInstanceAllocations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AllocationPackage.SYSTEM_ALLOCATION__ALLOCATIONS:
				return getAllocations();
			case AllocationPackage.SYSTEM_ALLOCATION__CIC:
				if (resolve) return getCic();
				return basicGetCic();
			case AllocationPackage.SYSTEM_ALLOCATION__HPIC:
				if (resolve) return getHpic();
				return basicGetHpic();
			case AllocationPackage.SYSTEM_ALLOCATION__ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATIONS:
				return getAssemblyConnectorInstanceAllocations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AllocationPackage.SYSTEM_ALLOCATION__ALLOCATIONS:
				getAllocations().clear();
				getAllocations().addAll((Collection<? extends Allocation>)newValue);
				return;
			case AllocationPackage.SYSTEM_ALLOCATION__CIC:
				setCic((ComponentInstanceConfiguration)newValue);
				return;
			case AllocationPackage.SYSTEM_ALLOCATION__HPIC:
				setHpic((HWPlatformInstanceConfiguration)newValue);
				return;
			case AllocationPackage.SYSTEM_ALLOCATION__ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATIONS:
				getAssemblyConnectorInstanceAllocations().clear();
				getAssemblyConnectorInstanceAllocations().addAll((Collection<? extends AssemblyConnectorInstanceAllocation>)newValue);
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
			case AllocationPackage.SYSTEM_ALLOCATION__ALLOCATIONS:
				getAllocations().clear();
				return;
			case AllocationPackage.SYSTEM_ALLOCATION__CIC:
				setCic((ComponentInstanceConfiguration)null);
				return;
			case AllocationPackage.SYSTEM_ALLOCATION__HPIC:
				setHpic((HWPlatformInstanceConfiguration)null);
				return;
			case AllocationPackage.SYSTEM_ALLOCATION__ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATIONS:
				getAssemblyConnectorInstanceAllocations().clear();
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
			case AllocationPackage.SYSTEM_ALLOCATION__ALLOCATIONS:
				return allocations != null && !allocations.isEmpty();
			case AllocationPackage.SYSTEM_ALLOCATION__CIC:
				return cic != null;
			case AllocationPackage.SYSTEM_ALLOCATION__HPIC:
				return hpic != null;
			case AllocationPackage.SYSTEM_ALLOCATION__ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATIONS:
				return assemblyConnectorInstanceAllocations != null && !assemblyConnectorInstanceAllocations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemAllocationImpl
