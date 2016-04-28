/**
 */
package org.muml.pm.hardware.hwresource;

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.CommentableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a repository containing several resource types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.ResourceRepository#getResources <em>Resources</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.ResourceRepository#getProtocols <em>Protocols</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getResourceRepository()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueProtocolName='-- A Protocol must have an unique name\nself.protocols->isUnique(name)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueProtocolName'"
 * @generated
 */
public interface ResourceRepository extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwresource.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResourceTypes that are contained in this ResourceTypeRepository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getResourceRepository_Resources()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Protocols</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwresource.CommunicationProtocolRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CommunicationProtocols that belong to this ResourceTypeRepository.
	 * CommunicationProtocols are used to specify the protocol used by HWPort and CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocols</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getResourceRepository_Protocols()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CommunicationProtocolRepository> getProtocols();

} // ResourceRepository
