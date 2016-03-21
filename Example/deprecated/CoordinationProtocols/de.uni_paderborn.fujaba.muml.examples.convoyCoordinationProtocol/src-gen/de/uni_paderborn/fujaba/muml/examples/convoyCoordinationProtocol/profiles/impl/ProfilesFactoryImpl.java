/**
 */
package de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.impl;

import de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfilesFactoryImpl extends EFactoryImpl implements ProfilesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProfilesFactory init() {
		try {
			ProfilesFactory theProfilesFactory = (ProfilesFactory)EPackage.Registry.INSTANCE.getEFactory(ProfilesPackage.eNS_URI);
			if (theProfilesFactory != null) {
				return theProfilesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProfilesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProfilesPackage.PROFILE: return createProfile();
			case ProfilesPackage.PROFILE_LIST: return createProfileList();
			case ProfilesPackage.PROFILE_ITERATOR: return createProfileIterator();
			case ProfilesPackage.PROFILE_STORE: return createProfileStore();
			case ProfilesPackage.ROLE_PROFILES: return createRoleProfiles();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile createProfile() {
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileList createProfileList() {
		ProfileListImpl profileList = new ProfileListImpl();
		return profileList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileIterator createProfileIterator() {
		ProfileIteratorImpl profileIterator = new ProfileIteratorImpl();
		return profileIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileStore createProfileStore() {
		ProfileStoreImpl profileStore = new ProfileStoreImpl();
		return profileStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleProfiles createRoleProfiles() {
		RoleProfilesImpl roleProfiles = new RoleProfilesImpl();
		return roleProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilesPackage getProfilesPackage() {
		return (ProfilesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProfilesPackage getPackage() {
		return ProfilesPackage.eINSTANCE;
	}

} //ProfilesFactoryImpl
