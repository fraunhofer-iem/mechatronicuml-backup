/**
 */
package de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.impl;

import de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.ProfileStore;
import de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.ProfilesPackage;
import de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.RoleProfiles;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.impl.ProfileStoreImpl#getRoleProfiles <em>Role Profiles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileStoreImpl extends EObjectImpl implements ProfileStore {
	/**
	 * The cached value of the '{@link #getRoleProfiles() <em>Role Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleProfiles()
	 * @generated
	 * @ordered
	 */
	protected RoleProfiles roleProfiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.PROFILE_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleProfiles getRoleProfiles() {
		return roleProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleProfiles(RoleProfiles newRoleProfiles, NotificationChain msgs) {
		RoleProfiles oldRoleProfiles = roleProfiles;
		roleProfiles = newRoleProfiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.PROFILE_STORE__ROLE_PROFILES, oldRoleProfiles, newRoleProfiles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleProfiles(RoleProfiles newRoleProfiles) {
		if (newRoleProfiles != roleProfiles) {
			NotificationChain msgs = null;
			if (roleProfiles != null)
				msgs = ((InternalEObject)roleProfiles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.PROFILE_STORE__ROLE_PROFILES, null, msgs);
			if (newRoleProfiles != null)
				msgs = ((InternalEObject)newRoleProfiles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.PROFILE_STORE__ROLE_PROFILES, null, msgs);
			msgs = basicSetRoleProfiles(newRoleProfiles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.PROFILE_STORE__ROLE_PROFILES, newRoleProfiles, newRoleProfiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.PROFILE_STORE__ROLE_PROFILES:
				return basicSetRoleProfiles(null, msgs);
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
			case ProfilesPackage.PROFILE_STORE__ROLE_PROFILES:
				return getRoleProfiles();
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
			case ProfilesPackage.PROFILE_STORE__ROLE_PROFILES:
				setRoleProfiles((RoleProfiles)newValue);
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
			case ProfilesPackage.PROFILE_STORE__ROLE_PROFILES:
				setRoleProfiles((RoleProfiles)null);
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
			case ProfilesPackage.PROFILE_STORE__ROLE_PROFILES:
				return roleProfiles != null;
		}
		return super.eIsSet(featureID);
	}

} //ProfileStoreImpl
