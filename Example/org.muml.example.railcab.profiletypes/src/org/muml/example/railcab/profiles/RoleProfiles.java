/**
 */
package org.muml.example.railcab.profiles;

import de.uni_paderborn.fujaba.muml.runtime.RuntimeDiscreteInteractionEndpointInstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Profiles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.example.railcab.profiles.RoleProfiles#getAllProfiles <em>All Profiles</em>}</li>
 *   <li>{@link org.muml.example.railcab.profiles.RoleProfiles#getCurrentProfile <em>Current Profile</em>}</li>
 *   <li>{@link org.muml.example.railcab.profiles.RoleProfiles#getRoleInstance <em>Role Instance</em>}</li>
 *   <li>{@link org.muml.example.railcab.profiles.RoleProfiles#getSecondInstance <em>Second Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.example.railcab.profiles.ProfilesPackage#getRoleProfiles()
 * @model
 * @generated
 */
public interface RoleProfiles extends EObject {
	/**
	 * Returns the value of the '<em><b>All Profiles</b></em>' reference list.
	 * The list contents are of type {@link org.muml.example.railcab.profiles.Profile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Profiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Profiles</em>' reference list.
	 * @see org.muml.example.railcab.profiles.ProfilesPackage#getRoleProfiles_AllProfiles()
	 * @model
	 * @generated
	 */
	EList<Profile> getAllProfiles();

	/**
	 * Returns the value of the '<em><b>Current Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Profile</em>' reference.
	 * @see #setCurrentProfile(Profile)
	 * @see org.muml.example.railcab.profiles.ProfilesPackage#getRoleProfiles_CurrentProfile()
	 * @model
	 * @generated
	 */
	Profile getCurrentProfile();

	/**
	 * Sets the value of the '{@link org.muml.example.railcab.profiles.RoleProfiles#getCurrentProfile <em>Current Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Profile</em>' reference.
	 * @see #getCurrentProfile()
	 * @generated
	 */
	void setCurrentProfile(Profile value);

	/**
	 * Returns the value of the '<em><b>Role Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Instance</em>' reference.
	 * @see #setRoleInstance(RuntimeDiscreteInteractionEndpointInstance)
	 * @see org.muml.example.railcab.profiles.ProfilesPackage#getRoleProfiles_RoleInstance()
	 * @model
	 * @generated
	 */
	RuntimeDiscreteInteractionEndpointInstance getRoleInstance();

	/**
	 * Sets the value of the '{@link org.muml.example.railcab.profiles.RoleProfiles#getRoleInstance <em>Role Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Instance</em>' reference.
	 * @see #getRoleInstance()
	 * @generated
	 */
	void setRoleInstance(RuntimeDiscreteInteractionEndpointInstance value);

	/**
	 * Returns the value of the '<em><b>Second Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Instance</em>' reference.
	 * @see #setSecondInstance(RuntimeDiscreteInteractionEndpointInstance)
	 * @see org.muml.example.railcab.profiles.ProfilesPackage#getRoleProfiles_SecondInstance()
	 * @model
	 * @generated
	 */
	RuntimeDiscreteInteractionEndpointInstance getSecondInstance();

	/**
	 * Sets the value of the '{@link org.muml.example.railcab.profiles.RoleProfiles#getSecondInstance <em>Second Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Instance</em>' reference.
	 * @see #getSecondInstance()
	 * @generated
	 */
	void setSecondInstance(RuntimeDiscreteInteractionEndpointInstance value);

} // RoleProfiles
