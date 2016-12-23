/**
 */
package org.muml.pm.hardware.hwresource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents all StructuredResource (i.e. ECUs, Server,etc.). A StructuredResource consists of several AtomicResources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.StructuredResource#getEmbeddedAtomicResources <em>Embedded Atomic Resources</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getStructuredResource()
 * @model
 * @generated
 */
public interface StructuredResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Embedded Atomic Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwresource.AtomicResource}.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.hardware.hwresource.AtomicResource#getParentStructuredResource <em>Parent Structured Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All AtomicResources which are contained in this StructuredResource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded Atomic Resources</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getStructuredResource_EmbeddedAtomicResources()
	 * @see org.muml.pm.hardware.hwresource.AtomicResource#getParentStructuredResource
	 * @model opposite="parentStructuredResource" containment="true" required="true"
	 * @generated
	 */
	EList<AtomicResource> getEmbeddedAtomicResources();

} // StructuredResource
