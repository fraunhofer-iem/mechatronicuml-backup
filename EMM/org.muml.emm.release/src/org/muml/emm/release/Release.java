/**
 */
package org.muml.emm.release;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.emm.release.Release#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.emm.release.Release#getReleaseSet <em>Release Set</em>}</li>
 * </ul>
 *
 * @see org.muml.emm.release.ReleasePackage#getRelease()
 * @model
 * @generated
 */
public interface Release extends EObject {
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
	 * @see org.muml.emm.release.ReleasePackage#getRelease_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.muml.emm.release.Release#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Release Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.emm.release.ReleaseSet#getReleases <em>Releases</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Set</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Set</em>' container reference.
	 * @see #setReleaseSet(ReleaseSet)
	 * @see org.muml.emm.release.ReleasePackage#getRelease_ReleaseSet()
	 * @see org.muml.emm.release.ReleaseSet#getReleases
	 * @model opposite="releases" required="true" transient="false"
	 * @generated
	 */
	ReleaseSet getReleaseSet();

	/**
	 * Sets the value of the '{@link org.muml.emm.release.Release#getReleaseSet <em>Release Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Set</em>' container reference.
	 * @see #getReleaseSet()
	 * @generated
	 */
	void setReleaseSet(ReleaseSet value);

} // Release
