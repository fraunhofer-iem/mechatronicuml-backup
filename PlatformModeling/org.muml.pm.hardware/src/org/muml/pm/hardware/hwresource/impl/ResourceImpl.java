/**
 */
package org.muml.pm.hardware.hwresource.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.mumlcore.impl.NamedElementImpl;
import org.muml.pm.hardware.hwresource.CommunicationResource;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.ResourceImpl#getCommunicationResources <em>Communication Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceImpl extends NamedElementImpl implements Resource {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourcePackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationResource> getCommunicationResources() {
		if (communicationResources == null) {
			communicationResources = new EObjectContainmentWithInverseEList<CommunicationResource>(CommunicationResource.class, this, HwresourcePackage.RESOURCE__COMMUNICATION_RESOURCES, HwresourcePackage.COMMUNICATION_RESOURCE__PARENT_RESOURCE);
		}
		return communicationResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwresourcePackage.RESOURCE__COMMUNICATION_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommunicationResources()).basicAdd(otherEnd, msgs);
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
			case HwresourcePackage.RESOURCE__COMMUNICATION_RESOURCES:
				return ((InternalEList<?>)getCommunicationResources()).basicRemove(otherEnd, msgs);
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
			case HwresourcePackage.RESOURCE__COMMUNICATION_RESOURCES:
				return getCommunicationResources();
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
			case HwresourcePackage.RESOURCE__COMMUNICATION_RESOURCES:
				getCommunicationResources().clear();
				getCommunicationResources().addAll((Collection<? extends CommunicationResource>)newValue);
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
			case HwresourcePackage.RESOURCE__COMMUNICATION_RESOURCES:
				getCommunicationResources().clear();
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
			case HwresourcePackage.RESOURCE__COMMUNICATION_RESOURCES:
				return communicationResources != null && !communicationResources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl
