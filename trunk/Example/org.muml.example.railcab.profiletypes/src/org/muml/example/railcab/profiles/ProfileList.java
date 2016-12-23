/**
 */
package org.muml.example.railcab.profiles;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.example.railcab.profiles.ProfileList#getProfiles <em>Profiles</em>}</li>
 * </ul>
 *
 * @see org.muml.example.railcab.profiles.ProfilesPackage#getProfileList()
 * @model
 * @generated
 */
public interface ProfileList extends EObject {
	/**
	 * Returns the value of the '<em><b>Profiles</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.example.railcab.profiles.Profile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profiles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profiles</em>' containment reference list.
	 * @see org.muml.example.railcab.profiles.ProfilesPackage#getProfileList_Profiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Profile> getProfiles();

} // ProfileList
