/**
 */
package org.muml.pm.hardware.hwresourceinstance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The abstract class AtomicResourceInstance is the super class for all atomic resource instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.AtomicResourceInstance#getParentStructuredResourceInstance <em>Parent Structured Resource Instance</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getAtomicResourceInstance()
 * @model abstract="true"
 * @generated
 */
public interface AtomicResourceInstance extends ResourceInstance {
	/**
	 * Returns the value of the '<em><b>Parent Structured Resource Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance#getEmbeddedAtomicResourceInstances <em>Embedded Atomic Resource Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StructuredResourceInstance, this AtomicResourceInstance belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Structured Resource Instance</em>' container reference.
	 * @see #setParentStructuredResourceInstance(StructuredResourceInstance)
	 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getAtomicResourceInstance_ParentStructuredResourceInstance()
	 * @see org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance#getEmbeddedAtomicResourceInstances
	 * @model opposite="embeddedAtomicResourceInstances" required="true" transient="false"
	 * @generated
	 */
	StructuredResourceInstance getParentStructuredResourceInstance();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresourceinstance.AtomicResourceInstance#getParentStructuredResourceInstance <em>Parent Structured Resource Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structured Resource Instance</em>' container reference.
	 * @see #getParentStructuredResourceInstance()
	 * @generated
	 */
	void setParentStructuredResourceInstance(StructuredResourceInstance value);

} // AtomicResourceInstance
