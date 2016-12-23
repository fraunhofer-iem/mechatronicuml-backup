/**
 */
package org.muml.pm.software;

import org.eclipse.emf.common.util.EList;

import org.muml.core.CommentableElement;
import org.muml.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This repository is used to declare API-commands.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.software.APIRepository#getApiCommands <em>Api Commands</em>}</li>
 *   <li>{@link org.muml.pm.software.APIRepository#getSwPlatform <em>Sw Platform</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.software.SoftwarePackage#getAPIRepository()
 * @model
 * @generated
 */
public interface APIRepository extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Api Commands</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.software.APICommand}.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.software.APICommand#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An APIRepository can have several api-commands.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Commands</em>' containment reference list.
	 * @see org.muml.pm.software.SoftwarePackage#getAPIRepository_ApiCommands()
	 * @see org.muml.pm.software.APICommand#getRepository
	 * @model opposite="repository" containment="true" required="true"
	 * @generated
	 */
	EList<APICommand> getApiCommands();

	/**
	 * Returns the value of the '<em><b>Sw Platform</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.software.OperatingSystem#getApirepositories <em>Apirepositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The platform to which this repository belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sw Platform</em>' container reference.
	 * @see #setSwPlatform(OperatingSystem)
	 * @see org.muml.pm.software.SoftwarePackage#getAPIRepository_SwPlatform()
	 * @see org.muml.pm.software.OperatingSystem#getApirepositories
	 * @model opposite="apirepositories" required="true" transient="false"
	 * @generated
	 */
	OperatingSystem getSwPlatform();

	/**
	 * Sets the value of the '{@link org.muml.pm.software.APIRepository#getSwPlatform <em>Sw Platform</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Platform</em>' container reference.
	 * @see #getSwPlatform()
	 * @generated
	 */
	void setSwPlatform(OperatingSystem value);

} // APIRepository
