/**
 */
package org.muml.example.railcab.profiles.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.muml.example.railcab.profiles.Profile;
import org.muml.example.railcab.profiles.ProfilesPackage;
import org.muml.example.railcab.profiles.RoleProfiles;
import org.muml.verification.core.runtime.RuntimeDiscreteInteractionEndpointInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Profiles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.example.railcab.profiles.impl.RoleProfilesImpl#getAllProfiles <em>All Profiles</em>}</li>
 *   <li>{@link org.muml.example.railcab.profiles.impl.RoleProfilesImpl#getCurrentProfile <em>Current Profile</em>}</li>
 *   <li>{@link org.muml.example.railcab.profiles.impl.RoleProfilesImpl#getRoleInstance <em>Role Instance</em>}</li>
 *   <li>{@link org.muml.example.railcab.profiles.impl.RoleProfilesImpl#getSecondInstance <em>Second Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleProfilesImpl extends MinimalEObjectImpl.Container implements RoleProfiles {
	/**
	 * The cached value of the '{@link #getAllProfiles() <em>All Profiles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Profile> allProfiles;

	/**
	 * The cached value of the '{@link #getCurrentProfile() <em>Current Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentProfile()
	 * @generated
	 * @ordered
	 */
	protected Profile currentProfile;

	/**
	 * The cached value of the '{@link #getRoleInstance() <em>Role Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleInstance()
	 * @generated
	 * @ordered
	 */
	protected RuntimeDiscreteInteractionEndpointInstance roleInstance;

	/**
	 * The cached value of the '{@link #getSecondInstance() <em>Second Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondInstance()
	 * @generated
	 * @ordered
	 */
	protected RuntimeDiscreteInteractionEndpointInstance secondInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleProfilesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.ROLE_PROFILES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Profile> getAllProfiles() {
		if (allProfiles == null) {
			allProfiles = new EObjectResolvingEList<Profile>(Profile.class, this, ProfilesPackage.ROLE_PROFILES__ALL_PROFILES);
		}
		return allProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getCurrentProfile() {
		if (currentProfile != null && currentProfile.eIsProxy()) {
			InternalEObject oldCurrentProfile = (InternalEObject)currentProfile;
			currentProfile = (Profile)eResolveProxy(oldCurrentProfile);
			if (currentProfile != oldCurrentProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilesPackage.ROLE_PROFILES__CURRENT_PROFILE, oldCurrentProfile, currentProfile));
			}
		}
		return currentProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile basicGetCurrentProfile() {
		return currentProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentProfile(Profile newCurrentProfile) {
		Profile oldCurrentProfile = currentProfile;
		currentProfile = newCurrentProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.ROLE_PROFILES__CURRENT_PROFILE, oldCurrentProfile, currentProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeDiscreteInteractionEndpointInstance getRoleInstance() {
		if (roleInstance != null && roleInstance.eIsProxy()) {
			InternalEObject oldRoleInstance = (InternalEObject)roleInstance;
			roleInstance = (RuntimeDiscreteInteractionEndpointInstance)eResolveProxy(oldRoleInstance);
			if (roleInstance != oldRoleInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilesPackage.ROLE_PROFILES__ROLE_INSTANCE, oldRoleInstance, roleInstance));
			}
		}
		return roleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeDiscreteInteractionEndpointInstance basicGetRoleInstance() {
		return roleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleInstance(RuntimeDiscreteInteractionEndpointInstance newRoleInstance) {
		RuntimeDiscreteInteractionEndpointInstance oldRoleInstance = roleInstance;
		roleInstance = newRoleInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.ROLE_PROFILES__ROLE_INSTANCE, oldRoleInstance, roleInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeDiscreteInteractionEndpointInstance getSecondInstance() {
		if (secondInstance != null && secondInstance.eIsProxy()) {
			InternalEObject oldSecondInstance = (InternalEObject)secondInstance;
			secondInstance = (RuntimeDiscreteInteractionEndpointInstance)eResolveProxy(oldSecondInstance);
			if (secondInstance != oldSecondInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilesPackage.ROLE_PROFILES__SECOND_INSTANCE, oldSecondInstance, secondInstance));
			}
		}
		return secondInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeDiscreteInteractionEndpointInstance basicGetSecondInstance() {
		return secondInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondInstance(RuntimeDiscreteInteractionEndpointInstance newSecondInstance) {
		RuntimeDiscreteInteractionEndpointInstance oldSecondInstance = secondInstance;
		secondInstance = newSecondInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.ROLE_PROFILES__SECOND_INSTANCE, oldSecondInstance, secondInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilesPackage.ROLE_PROFILES__ALL_PROFILES:
				return getAllProfiles();
			case ProfilesPackage.ROLE_PROFILES__CURRENT_PROFILE:
				if (resolve) return getCurrentProfile();
				return basicGetCurrentProfile();
			case ProfilesPackage.ROLE_PROFILES__ROLE_INSTANCE:
				if (resolve) return getRoleInstance();
				return basicGetRoleInstance();
			case ProfilesPackage.ROLE_PROFILES__SECOND_INSTANCE:
				if (resolve) return getSecondInstance();
				return basicGetSecondInstance();
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
			case ProfilesPackage.ROLE_PROFILES__ALL_PROFILES:
				getAllProfiles().clear();
				getAllProfiles().addAll((Collection<? extends Profile>)newValue);
				return;
			case ProfilesPackage.ROLE_PROFILES__CURRENT_PROFILE:
				setCurrentProfile((Profile)newValue);
				return;
			case ProfilesPackage.ROLE_PROFILES__ROLE_INSTANCE:
				setRoleInstance((RuntimeDiscreteInteractionEndpointInstance)newValue);
				return;
			case ProfilesPackage.ROLE_PROFILES__SECOND_INSTANCE:
				setSecondInstance((RuntimeDiscreteInteractionEndpointInstance)newValue);
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
			case ProfilesPackage.ROLE_PROFILES__ALL_PROFILES:
				getAllProfiles().clear();
				return;
			case ProfilesPackage.ROLE_PROFILES__CURRENT_PROFILE:
				setCurrentProfile((Profile)null);
				return;
			case ProfilesPackage.ROLE_PROFILES__ROLE_INSTANCE:
				setRoleInstance((RuntimeDiscreteInteractionEndpointInstance)null);
				return;
			case ProfilesPackage.ROLE_PROFILES__SECOND_INSTANCE:
				setSecondInstance((RuntimeDiscreteInteractionEndpointInstance)null);
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
			case ProfilesPackage.ROLE_PROFILES__ALL_PROFILES:
				return allProfiles != null && !allProfiles.isEmpty();
			case ProfilesPackage.ROLE_PROFILES__CURRENT_PROFILE:
				return currentProfile != null;
			case ProfilesPackage.ROLE_PROFILES__ROLE_INSTANCE:
				return roleInstance != null;
			case ProfilesPackage.ROLE_PROFILES__SECOND_INSTANCE:
				return secondInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleProfilesImpl
