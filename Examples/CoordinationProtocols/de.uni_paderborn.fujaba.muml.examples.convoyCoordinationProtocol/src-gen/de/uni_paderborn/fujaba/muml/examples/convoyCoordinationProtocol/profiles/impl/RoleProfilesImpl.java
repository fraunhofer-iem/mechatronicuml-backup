/**
 */
package de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.impl;

import de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.Profile;
import de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.ProfilesPackage;
import de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.RoleProfiles;

import de.uni_paderborn.fujaba.muml.runtime.RuntimeDiscreteInteractionEndpointInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Profiles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.impl.RoleProfilesImpl#getAllProfiles <em>All Profiles</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.impl.RoleProfilesImpl#getCurrentProfile <em>Current Profile</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.impl.RoleProfilesImpl#getRoleInstance <em>Role Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleProfilesImpl extends EObjectImpl implements RoleProfiles {
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
		}
		return super.eIsSet(featureID);
	}

} //RoleProfilesImpl
