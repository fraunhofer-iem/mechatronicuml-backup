/**
 */
package org.muml.emm.release;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.emm.release.ReleaseSet#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.emm.release.ReleaseSet#getReleases <em>Releases</em>}</li>
 * </ul>
 *
 * @see org.muml.emm.release.ReleasePackage#getReleaseSet()
 * @model
 * @generated
 */
public interface ReleaseSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.muml.emm.release.ReleasePackage#getReleaseSet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.muml.emm.release.ReleaseSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Releases</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.emm.release.Release}.
	 * It is bidirectional and its opposite is '{@link org.muml.emm.release.Release#getReleaseSet <em>Release Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Releases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Releases</em>' containment reference list.
	 * @see org.muml.emm.release.ReleasePackage#getReleaseSet_Releases()
	 * @see org.muml.emm.release.Release#getReleaseSet
	 * @model opposite="releaseSet" containment="true"
	 * @generated
	 */
	EList<Release> getReleases();

} // ReleaseSet
