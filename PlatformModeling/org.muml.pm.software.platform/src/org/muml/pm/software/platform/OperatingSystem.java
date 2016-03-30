/**
 */
package org.muml.pm.software.platform;

import org.eclipse.emf.common.util.EList;
import org.muml.core.CommentableElement;
import org.muml.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a software plattform. It is the root element for describing a software plattform.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.pm.software.platform.OperatingSystem#getApirepositories <em>Apirepositories</em>}</li>
 *   <li>{@link org.muml.pm.software.platform.OperatingSystem#getEnumerationDataTypes <em>Enumeration Data Types</em>}</li>
 *   <li>{@link org.muml.pm.software.platform.OperatingSystem#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.pm.software.platform.SwplatformPackage#getOperatingSystem()
 * @model
 * @generated
 */
public interface OperatingSystem extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Apirepositories</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.software.platform.APIRepository}.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.software.platform.APIRepository#getSwPlatform <em>Sw Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A SWPlatform has an APIRepository. In this repository all api-commands of that platform are stored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Apirepositories</em>' containment reference list.
	 * @see org.muml.pm.software.platform.SwplatformPackage#getOperatingSystem_Apirepositories()
	 * @see org.muml.pm.software.platform.APIRepository#getSwPlatform
	 * @model opposite="swPlatform" containment="true"
	 * @generated
	 */
	EList<APIRepository> getApirepositories();

	/**
	 * Returns the value of the '<em><b>Enumeration Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.software.platform.EnumerationDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A SWPlatform can have several Enumerations. In this repository all api-commands of that platform are stored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumeration Data Types</em>' containment reference list.
	 * @see org.muml.pm.software.platform.SwplatformPackage#getOperatingSystem_EnumerationDataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationDataType> getEnumerationDataTypes();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.software.platform.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.muml.pm.software.platform.SwplatformPackage#getOperatingSystem_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

} // OperatingSystem
