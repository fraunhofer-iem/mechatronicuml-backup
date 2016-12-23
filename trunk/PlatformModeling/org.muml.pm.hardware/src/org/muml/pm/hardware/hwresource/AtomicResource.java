/**
 */
package org.muml.pm.hardware.hwresource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class is the super class of all atomic resource types.
 * AtomicResources  can not be further sub-divided.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.AtomicResource#getParentStructuredResource <em>Parent Structured Resource</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getAtomicResource()
 * @model abstract="true"
 * @generated
 */
public interface AtomicResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Parent Structured Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.hardware.hwresource.StructuredResource#getEmbeddedAtomicResources <em>Embedded Atomic Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StructuredResource, this AtomicResource belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Structured Resource</em>' container reference.
	 * @see #setParentStructuredResource(StructuredResource)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getAtomicResource_ParentStructuredResource()
	 * @see org.muml.pm.hardware.hwresource.StructuredResource#getEmbeddedAtomicResources
	 * @model opposite="embeddedAtomicResources" required="true" transient="false"
	 * @generated
	 */
	StructuredResource getParentStructuredResource();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.AtomicResource#getParentStructuredResource <em>Parent Structured Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structured Resource</em>' container reference.
	 * @see #getParentStructuredResource()
	 * @generated
	 */
	void setParentStructuredResource(StructuredResource value);

} // AtomicResource
