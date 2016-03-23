/**
 */
package org.muml.example.railcab.profiles;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.example.railcab.profiles.ProfileStore#getRoleProfiles <em>Role Profiles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.example.railcab.profiles.ProfilesPackage#getProfileStore()
 * @model
 * @generated
 */
public interface ProfileStore extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Profiles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Profiles</em>' containment reference.
	 * @see #setRoleProfiles(RoleProfiles)
	 * @see org.muml.example.railcab.profiles.ProfilesPackage#getProfileStore_RoleProfiles()
	 * @model containment="true"
	 * @generated
	 */
	RoleProfiles getRoleProfiles();

	/**
	 * Sets the value of the '{@link org.muml.example.railcab.profiles.ProfileStore#getRoleProfiles <em>Role Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Profiles</em>' containment reference.
	 * @see #getRoleProfiles()
	 * @generated
	 */
	void setRoleProfiles(RoleProfiles value);

} // ProfileStore
