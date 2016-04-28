/**
 */
package org.muml.pm.hardware.hwresource;

import org.eclipse.emf.common.util.EList;
import org.muml.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class is the super class of all resource types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.Resource#getCommunicationResources <em>Communication Resources</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getResource()
 * @model abstract="true"
 * @generated
 */
public interface Resource extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Communication Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwresource.CommunicationResource}.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.hardware.hwresource.CommunicationResource#getParentResource <em>Parent Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPort of this ResourceType.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Resources</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getResource_CommunicationResources()
	 * @see org.muml.pm.hardware.hwresource.CommunicationResource#getParentResource
	 * @model opposite="parentResource" containment="true"
	 * @generated
	 */
	EList<CommunicationResource> getCommunicationResources();

} // Resource
