/**
 */
package org.muml.example.railcab.profiles;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.example.railcab.profiles.ProfileIterator#getProfilesToDo <em>Profiles To Do</em>}</li>
 * </ul>
 *
 * @see org.muml.example.railcab.profiles.ProfilesPackage#getProfileIterator()
 * @model
 * @generated
 */
public interface ProfileIterator extends EObject {
	/**
	 * Returns the value of the '<em><b>Profiles To Do</b></em>' reference list.
	 * The list contents are of type {@link org.muml.example.railcab.profiles.Profile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profiles To Do</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profiles To Do</em>' reference list.
	 * @see org.muml.example.railcab.profiles.ProfilesPackage#getProfileIterator_ProfilesToDo()
	 * @model
	 * @generated
	 */
	EList<Profile> getProfilesToDo();

} // ProfileIterator
