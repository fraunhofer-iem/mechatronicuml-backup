/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationMedia;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.ResourceRepository;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.core.impl.CommentableElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.ResourceRepositoryImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.ResourceRepositoryImpl#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.ResourceRepositoryImpl#getCommunicationMedia <em>Communication Media</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceRepositoryImpl extends CommentableElementImpl implements ResourceRepository {
	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The cached value of the '{@link #getProtocols() <em>Protocols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationProtocol> protocols;

	/**
	 * The cached value of the '{@link #getCommunicationMedia() <em>Communication Media</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMedia()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationMedia> communicationMedia;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourcePackage.Literals.RESOURCE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<Resource>(Resource.class, this, HwresourcePackage.RESOURCE_REPOSITORY__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationProtocol> getProtocols() {
		if (protocols == null) {
			protocols = new EObjectContainmentEList<CommunicationProtocol>(CommunicationProtocol.class, this, HwresourcePackage.RESOURCE_REPOSITORY__PROTOCOLS);
		}
		return protocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationMedia> getCommunicationMedia() {
		if (communicationMedia == null) {
			communicationMedia = new EObjectContainmentEList<CommunicationMedia>(CommunicationMedia.class, this, HwresourcePackage.RESOURCE_REPOSITORY__COMMUNICATION_MEDIA);
		}
		return communicationMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwresourcePackage.RESOURCE_REPOSITORY__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case HwresourcePackage.RESOURCE_REPOSITORY__PROTOCOLS:
				return ((InternalEList<?>)getProtocols()).basicRemove(otherEnd, msgs);
			case HwresourcePackage.RESOURCE_REPOSITORY__COMMUNICATION_MEDIA:
				return ((InternalEList<?>)getCommunicationMedia()).basicRemove(otherEnd, msgs);
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
			case HwresourcePackage.RESOURCE_REPOSITORY__RESOURCES:
				return getResources();
			case HwresourcePackage.RESOURCE_REPOSITORY__PROTOCOLS:
				return getProtocols();
			case HwresourcePackage.RESOURCE_REPOSITORY__COMMUNICATION_MEDIA:
				return getCommunicationMedia();
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
			case HwresourcePackage.RESOURCE_REPOSITORY__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case HwresourcePackage.RESOURCE_REPOSITORY__PROTOCOLS:
				getProtocols().clear();
				getProtocols().addAll((Collection<? extends CommunicationProtocol>)newValue);
				return;
			case HwresourcePackage.RESOURCE_REPOSITORY__COMMUNICATION_MEDIA:
				getCommunicationMedia().clear();
				getCommunicationMedia().addAll((Collection<? extends CommunicationMedia>)newValue);
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
			case HwresourcePackage.RESOURCE_REPOSITORY__RESOURCES:
				getResources().clear();
				return;
			case HwresourcePackage.RESOURCE_REPOSITORY__PROTOCOLS:
				getProtocols().clear();
				return;
			case HwresourcePackage.RESOURCE_REPOSITORY__COMMUNICATION_MEDIA:
				getCommunicationMedia().clear();
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
			case HwresourcePackage.RESOURCE_REPOSITORY__RESOURCES:
				return resources != null && !resources.isEmpty();
			case HwresourcePackage.RESOURCE_REPOSITORY__PROTOCOLS:
				return protocols != null && !protocols.isEmpty();
			case HwresourcePackage.RESOURCE_REPOSITORY__COMMUNICATION_MEDIA:
				return communicationMedia != null && !communicationMedia.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceRepositoryImpl
