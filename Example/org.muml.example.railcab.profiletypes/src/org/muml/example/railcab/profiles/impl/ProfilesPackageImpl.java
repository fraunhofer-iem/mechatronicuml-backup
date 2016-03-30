/**
 */
package org.muml.example.railcab.profiles.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.example.railcab.profiles.Profile;
import org.muml.example.railcab.profiles.ProfileIterator;
import org.muml.example.railcab.profiles.ProfileList;
import org.muml.example.railcab.profiles.ProfileStore;
import org.muml.example.railcab.profiles.ProfilesFactory;
import org.muml.example.railcab.profiles.ProfilesPackage;
import org.muml.example.railcab.profiles.RoleProfiles;
import org.muml.verification.core.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfilesPackageImpl extends EPackageImpl implements ProfilesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleProfilesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.muml.example.railcab.profiles.ProfilesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProfilesPackageImpl() {
		super(eNS_URI, ProfilesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ProfilesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProfilesPackage init() {
		if (isInited) return (ProfilesPackage)EPackage.Registry.INSTANCE.getEPackage(ProfilesPackage.eNS_URI);

		// Obtain or create and register package
		ProfilesPackageImpl theProfilesPackage = (ProfilesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProfilesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProfilesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RuntimePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theProfilesPackage.createPackageContents();

		// Initialize created meta-data
		theProfilesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProfilesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProfilesPackage.eNS_URI, theProfilesPackage);
		return theProfilesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfile() {
		return profileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfileList() {
		return profileListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileList_Profiles() {
		return (EReference)profileListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfileIterator() {
		return profileIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileIterator_ProfilesToDo() {
		return (EReference)profileIteratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfileStore() {
		return profileStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileStore_RoleProfiles() {
		return (EReference)profileStoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleProfiles() {
		return roleProfilesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleProfiles_AllProfiles() {
		return (EReference)roleProfilesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleProfiles_CurrentProfile() {
		return (EReference)roleProfilesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleProfiles_RoleInstance() {
		return (EReference)roleProfilesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleProfiles_SecondInstance() {
		return (EReference)roleProfilesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilesFactory getProfilesFactory() {
		return (ProfilesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		profileEClass = createEClass(PROFILE);

		profileListEClass = createEClass(PROFILE_LIST);
		createEReference(profileListEClass, PROFILE_LIST__PROFILES);

		profileIteratorEClass = createEClass(PROFILE_ITERATOR);
		createEReference(profileIteratorEClass, PROFILE_ITERATOR__PROFILES_TO_DO);

		profileStoreEClass = createEClass(PROFILE_STORE);
		createEReference(profileStoreEClass, PROFILE_STORE__ROLE_PROFILES);

		roleProfilesEClass = createEClass(ROLE_PROFILES);
		createEReference(roleProfilesEClass, ROLE_PROFILES__ALL_PROFILES);
		createEReference(roleProfilesEClass, ROLE_PROFILES__CURRENT_PROFILE);
		createEReference(roleProfilesEClass, ROLE_PROFILES__ROLE_INSTANCE);
		createEReference(roleProfilesEClass, ROLE_PROFILES__SECOND_INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(profileEClass, Profile.class, "Profile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(profileListEClass, ProfileList.class, "ProfileList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfileList_Profiles(), this.getProfile(), null, "profiles", null, 0, -1, ProfileList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(profileIteratorEClass, ProfileIterator.class, "ProfileIterator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfileIterator_ProfilesToDo(), this.getProfile(), null, "profilesToDo", null, 0, -1, ProfileIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(profileStoreEClass, ProfileStore.class, "ProfileStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfileStore_RoleProfiles(), this.getRoleProfiles(), null, "roleProfiles", null, 0, 1, ProfileStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleProfilesEClass, RoleProfiles.class, "RoleProfiles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleProfiles_AllProfiles(), this.getProfile(), null, "allProfiles", null, 0, -1, RoleProfiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleProfiles_CurrentProfile(), this.getProfile(), null, "currentProfile", null, 0, 1, RoleProfiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleProfiles_RoleInstance(), theRuntimePackage.getRuntimeDiscreteInteractionEndpointInstance(), null, "roleInstance", null, 0, 1, RoleProfiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleProfiles_SecondInstance(), theRuntimePackage.getRuntimeDiscreteInteractionEndpointInstance(), null, "secondInstance", null, 0, 1, RoleProfiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ProfilesPackageImpl
