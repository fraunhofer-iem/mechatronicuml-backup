/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Instance Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ResourceInstanceRepositoryImpl#getResourceInstances <em>Resource Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ResourceInstanceRepositoryImpl#getResourceTypeRepository <em>Resource Type Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceInstanceRepositoryImpl extends NamedElementImpl implements ResourceInstanceRepository {
	/**
	 * The cached value of the '{@link #getResourceInstances() <em>Resource Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceInstance> resourceInstances;

	/**
	 * The cached value of the '{@link #getResourceTypeRepository() <em>Resource Type Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTypeRepository()
	 * @generated
	 * @ordered
	 */
	protected ResourceTypeRepository resourceTypeRepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInstanceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.RESOURCE_INSTANCE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInstance> getResourceInstances() {
		if (resourceInstances == null) {
			resourceInstances = new EObjectContainmentEList<ResourceInstance>(ResourceInstance.class, this, PlatformPackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES);
		}
		return resourceInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeRepository getResourceTypeRepository() {
		if (resourceTypeRepository != null && resourceTypeRepository.eIsProxy()) {
			InternalEObject oldResourceTypeRepository = (InternalEObject)resourceTypeRepository;
			resourceTypeRepository = (ResourceTypeRepository)eResolveProxy(oldResourceTypeRepository);
			if (resourceTypeRepository != oldResourceTypeRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_TYPE_REPOSITORY, oldResourceTypeRepository, resourceTypeRepository));
			}
		}
		return resourceTypeRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeRepository basicGetResourceTypeRepository() {
		return resourceTypeRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceTypeRepository(ResourceTypeRepository newResourceTypeRepository) {
		ResourceTypeRepository oldResourceTypeRepository = resourceTypeRepository;
		resourceTypeRepository = newResourceTypeRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_TYPE_REPOSITORY, oldResourceTypeRepository, resourceTypeRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES:
				return ((InternalEList<?>)getResourceInstances()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES:
				return getResourceInstances();
			case PlatformPackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_TYPE_REPOSITORY:
				if (resolve) return getResourceTypeRepository();
				return basicGetResourceTypeRepository();
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
			case PlatformPackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES:
				getResourceInstances().clear();
				getResourceInstances().addAll((Collection<? extends ResourceInstance>)newValue);
				return;
			case PlatformPackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_TYPE_REPOSITORY:
				setResourceTypeRepository((ResourceTypeRepository)newValue);
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
			case PlatformPackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES:
				getResourceInstances().clear();
				return;
			case PlatformPackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_TYPE_REPOSITORY:
				setResourceTypeRepository((ResourceTypeRepository)null);
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
			case PlatformPackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES:
				return resourceInstances != null && !resourceInstances.isEmpty();
			case PlatformPackage.RESOURCE_INSTANCE_REPOSITORY__RESOURCE_TYPE_REPOSITORY:
				return resourceTypeRepository != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceInstanceRepositoryImpl
