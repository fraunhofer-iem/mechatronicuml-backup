/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.hardware.platform.Bridge;
import de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.platform.Delegation;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Platform Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceImpl#getHwplatformType <em>Hwplatform Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceImpl#getResourceInstances <em>Resource Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceImpl#getCommunicationResources <em>Communication Resources</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceImpl#getHwplatformInstances <em>Hwplatform Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceImpl#getDerivedBridges <em>Derived Bridges</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceImpl#getDelegationPorts <em>Delegation Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.HWPlatformInstanceImpl#getDelegations <em>Delegations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HWPlatformInstanceImpl extends NamedElementImpl implements HWPlatformInstance {
	/**
	 * The cached value of the '{@link #getHwplatformType() <em>Hwplatform Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwplatformType()
	 * @generated
	 * @ordered
	 */
	protected HWPlatform hwplatformType;

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
	 * The cached value of the '{@link #getCommunicationResources() <em>Communication Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationResources()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationResource> communicationResources;

	/**
	 * The cached value of the '{@link #getHwplatformInstances() <em>Hwplatform Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwplatformInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<HWPlatformInstance> hwplatformInstances;

	/**
	 * The cached setting delegate for the '{@link #getDerivedBridges() <em>Derived Bridges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedBridges()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DERIVED_BRIDGES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE__DERIVED_BRIDGES).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getDelegationPorts() <em>Delegation Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<HWPortInstance> delegationPorts;

	/**
	 * The cached value of the '{@link #getDelegations() <em>Delegations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegations()
	 * @generated
	 * @ordered
	 */
	protected EList<Delegation> delegations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPlatformInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatforminstancePackage.Literals.HW_PLATFORM_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatform getHwplatformType() {
		if (hwplatformType != null && hwplatformType.eIsProxy()) {
			InternalEObject oldHwplatformType = (InternalEObject)hwplatformType;
			hwplatformType = (HWPlatform)eResolveProxy(oldHwplatformType);
			if (hwplatformType != oldHwplatformType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE, oldHwplatformType, hwplatformType));
			}
		}
		return hwplatformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatform basicGetHwplatformType() {
		return hwplatformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwplatformType(HWPlatform newHwplatformType) {
		HWPlatform oldHwplatformType = hwplatformType;
		hwplatformType = newHwplatformType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE, oldHwplatformType, hwplatformType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInstance> getResourceInstances() {
		if (resourceInstances == null) {
			resourceInstances = new EObjectContainmentEList<ResourceInstance>(ResourceInstance.class, this, PlatforminstancePackage.HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES);
		}
		return resourceInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationResource> getCommunicationResources() {
		if (communicationResources == null) {
			communicationResources = new EObjectContainmentEList<CommunicationResource>(CommunicationResource.class, this, PlatforminstancePackage.HW_PLATFORM_INSTANCE__COMMUNICATION_RESOURCES);
		}
		return communicationResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWPlatformInstance> getHwplatformInstances() {
		if (hwplatformInstances == null) {
			hwplatformInstances = new EObjectContainmentEList<HWPlatformInstance>(HWPlatformInstance.class, this, PlatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES);
		}
		return hwplatformInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Bridge> getDerivedBridges() {
		return (EList<Bridge>)DERIVED_BRIDGES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWPortInstance> getDelegationPorts() {
		if (delegationPorts == null) {
			delegationPorts = new EObjectContainmentEList<HWPortInstance>(HWPortInstance.class, this, PlatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS);
		}
		return delegationPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delegation> getDelegations() {
		if (delegations == null) {
			delegations = new EObjectContainmentEList<Delegation>(Delegation.class, this, PlatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATIONS);
		}
		return delegations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES:
				return ((InternalEList<?>)getResourceInstances()).basicRemove(otherEnd, msgs);
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__COMMUNICATION_RESOURCES:
				return ((InternalEList<?>)getCommunicationResources()).basicRemove(otherEnd, msgs);
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES:
				return ((InternalEList<?>)getHwplatformInstances()).basicRemove(otherEnd, msgs);
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__DERIVED_BRIDGES:
				return ((InternalEList<?>)getDerivedBridges()).basicRemove(otherEnd, msgs);
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
				return ((InternalEList<?>)getDelegationPorts()).basicRemove(otherEnd, msgs);
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATIONS:
				return ((InternalEList<?>)getDelegations()).basicRemove(otherEnd, msgs);
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
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE:
				if (resolve) return getHwplatformType();
				return basicGetHwplatformType();
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES:
				return getResourceInstances();
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__COMMUNICATION_RESOURCES:
				return getCommunicationResources();
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES:
				return getHwplatformInstances();
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__DERIVED_BRIDGES:
				return getDerivedBridges();
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
				return getDelegationPorts();
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATIONS:
				return getDelegations();
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
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE:
				setHwplatformType((HWPlatform)newValue);
				return;
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES:
				getResourceInstances().clear();
				getResourceInstances().addAll((Collection<? extends ResourceInstance>)newValue);
				return;
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__COMMUNICATION_RESOURCES:
				getCommunicationResources().clear();
				getCommunicationResources().addAll((Collection<? extends CommunicationResource>)newValue);
				return;
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES:
				getHwplatformInstances().clear();
				getHwplatformInstances().addAll((Collection<? extends HWPlatformInstance>)newValue);
				return;
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
				getDelegationPorts().clear();
				getDelegationPorts().addAll((Collection<? extends HWPortInstance>)newValue);
				return;
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATIONS:
				getDelegations().clear();
				getDelegations().addAll((Collection<? extends Delegation>)newValue);
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
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE:
				setHwplatformType((HWPlatform)null);
				return;
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES:
				getResourceInstances().clear();
				return;
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__COMMUNICATION_RESOURCES:
				getCommunicationResources().clear();
				return;
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES:
				getHwplatformInstances().clear();
				return;
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
				getDelegationPorts().clear();
				return;
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATIONS:
				getDelegations().clear();
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
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE:
				return hwplatformType != null;
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES:
				return resourceInstances != null && !resourceInstances.isEmpty();
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__COMMUNICATION_RESOURCES:
				return communicationResources != null && !communicationResources.isEmpty();
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES:
				return hwplatformInstances != null && !hwplatformInstances.isEmpty();
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__DERIVED_BRIDGES:
				return DERIVED_BRIDGES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
				return delegationPorts != null && !delegationPorts.isEmpty();
			case PlatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATIONS:
				return delegations != null && !delegations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HWPlatformInstanceImpl
