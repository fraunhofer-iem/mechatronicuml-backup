/**
 */
package org.muml.pm.hardware.hwresource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.core.common.adapter.DerivedAttributeAdapter;
import org.muml.mumlcore.impl.NamedElementImpl;
import org.muml.pim.valuetype.Cardinality;
import org.muml.pm.hardware.hwresource.CommunicationKind;
import org.muml.pm.hardware.hwresource.CommunicationProtocol;
import org.muml.pm.hardware.hwresource.CommunicationResource;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CommunicationResourceImpl#getPortKind <em>Port Kind</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CommunicationResourceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CommunicationResourceImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CommunicationResourceImpl#isMultiHWPort <em>Multi HW Port</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CommunicationResourceImpl#getParentResource <em>Parent Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationResourceImpl extends NamedElementImpl implements CommunicationResource {
	/**
	 * The cached setting delegate for the '{@link #getPortKind() <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortKind()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PORT_KIND__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwresourcePackage.Literals.COMMUNICATION_RESOURCE__PORT_KIND).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected CommunicationProtocol protocol;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality;

	/**
	 * The cached setting delegate for the '{@link #isMultiHWPort() <em>Multi HW Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiHWPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MULTI_HW_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwresourcePackage.Literals.COMMUNICATION_RESOURCE__MULTI_HW_PORT).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected CommunicationResourceImpl() {
		super();
		DerivedAttributeAdapter adapter = new DerivedAttributeAdapter(this, HwresourcePackage.Literals.COMMUNICATION_RESOURCE__PORT_KIND);
		adapter.addLocalDependency(HwresourcePackage.Literals.COMMUNICATION_RESOURCE__PROTOCOL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourcePackage.Literals.COMMUNICATION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationKind getPortKind() {
		return (CommunicationKind)PORT_KIND__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortKind(CommunicationKind newPortKind) {
		PORT_KIND__ESETTING_DELEGATE.dynamicSet(this, null, 0, newPortKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationProtocol getProtocol() {
		if (protocol != null && protocol.eIsProxy()) {
			InternalEObject oldProtocol = (InternalEObject)protocol;
			protocol = (CommunicationProtocol)eResolveProxy(oldProtocol);
			if (protocol != oldProtocol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwresourcePackage.COMMUNICATION_RESOURCE__PROTOCOL, oldProtocol, protocol));
			}
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationProtocol basicGetProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(CommunicationProtocol newProtocol) {
		CommunicationProtocol oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_RESOURCE__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY, oldCardinality, newCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		if (newCardinality != cardinality) {
			NotificationChain msgs = null;
			if (cardinality != null)
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY, newCardinality, newCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiHWPort() {
		return (Boolean)MULTI_HW_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiHWPort(boolean newMultiHWPort) {
		MULTI_HW_PORT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newMultiHWPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getParentResource() {
		if (eContainerFeatureID() != HwresourcePackage.COMMUNICATION_RESOURCE__PARENT_RESOURCE) return null;
		return (Resource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentResource(Resource newParentResource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentResource, HwresourcePackage.COMMUNICATION_RESOURCE__PARENT_RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentResource(Resource newParentResource) {
		if (newParentResource != eInternalContainer() || (eContainerFeatureID() != HwresourcePackage.COMMUNICATION_RESOURCE__PARENT_RESOURCE && newParentResource != null)) {
			if (EcoreUtil.isAncestor(this, newParentResource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentResource != null)
				msgs = ((InternalEObject)newParentResource).eInverseAdd(this, HwresourcePackage.RESOURCE__COMMUNICATION_RESOURCES, Resource.class, msgs);
			msgs = basicSetParentResource(newParentResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.COMMUNICATION_RESOURCE__PARENT_RESOURCE, newParentResource, newParentResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwresourcePackage.COMMUNICATION_RESOURCE__PARENT_RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentResource((Resource)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case HwresourcePackage.COMMUNICATION_RESOURCE__PARENT_RESOURCE:
				return basicSetParentResource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case HwresourcePackage.COMMUNICATION_RESOURCE__PARENT_RESOURCE:
				return eInternalContainer().eInverseRemove(this, HwresourcePackage.RESOURCE__COMMUNICATION_RESOURCES, Resource.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwresourcePackage.COMMUNICATION_RESOURCE__PORT_KIND:
				return getPortKind();
			case HwresourcePackage.COMMUNICATION_RESOURCE__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY:
				return getCardinality();
			case HwresourcePackage.COMMUNICATION_RESOURCE__MULTI_HW_PORT:
				return isMultiHWPort();
			case HwresourcePackage.COMMUNICATION_RESOURCE__PARENT_RESOURCE:
				return getParentResource();
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
			case HwresourcePackage.COMMUNICATION_RESOURCE__PORT_KIND:
				setPortKind((CommunicationKind)newValue);
				return;
			case HwresourcePackage.COMMUNICATION_RESOURCE__PROTOCOL:
				setProtocol((CommunicationProtocol)newValue);
				return;
			case HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case HwresourcePackage.COMMUNICATION_RESOURCE__MULTI_HW_PORT:
				setMultiHWPort((Boolean)newValue);
				return;
			case HwresourcePackage.COMMUNICATION_RESOURCE__PARENT_RESOURCE:
				setParentResource((Resource)newValue);
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
			case HwresourcePackage.COMMUNICATION_RESOURCE__PORT_KIND:
				PORT_KIND__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case HwresourcePackage.COMMUNICATION_RESOURCE__PROTOCOL:
				setProtocol((CommunicationProtocol)null);
				return;
			case HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case HwresourcePackage.COMMUNICATION_RESOURCE__MULTI_HW_PORT:
				MULTI_HW_PORT__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case HwresourcePackage.COMMUNICATION_RESOURCE__PARENT_RESOURCE:
				setParentResource((Resource)null);
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
			case HwresourcePackage.COMMUNICATION_RESOURCE__PORT_KIND:
				return PORT_KIND__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwresourcePackage.COMMUNICATION_RESOURCE__PROTOCOL:
				return protocol != null;
			case HwresourcePackage.COMMUNICATION_RESOURCE__CARDINALITY:
				return cardinality != null;
			case HwresourcePackage.COMMUNICATION_RESOURCE__MULTI_HW_PORT:
				return MULTI_HW_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwresourcePackage.COMMUNICATION_RESOURCE__PARENT_RESOURCE:
				return getParentResource() != null;
		}
		return super.eIsSet(featureID);
	}

} //CommunicationResourceImpl
