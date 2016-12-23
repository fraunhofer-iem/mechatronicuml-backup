/**
 */
package org.muml.pm.hardware.hwresourceinstance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a structured resource at instance level.
 * A StructuredResourceInstance is  derived from its resourcetype.
 * The embedded AtomicResourceInstances of this StructuredResourceInstance are derived from its type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance#getEmbeddedAtomicResourceInstances <em>Embedded Atomic Resource Instances</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getStructuredResourceInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CheckResourceType AllAtomicResourceTypesAreInitialized UniquePortNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AllAtomicResourceTypesAreInitialized='-- All Atomic Resources must be initialized\nif(self.resourceType.oclIsUndefined()) then\n\ttrue\nelse \n\tself.resourceType.oclAsType(hwresource::StructuredResource).embeddedAtomicResources->forAll(atomicResourceType | self.embeddedAtomicResourceInstances->exists(atomicResourceInstance | atomicResourceInstance.oclAsType(hwresourceinstance::AtomicResourceInstance).resourceType = atomicResourceType))\nendif' CheckResourceType='-- ResourceType must be of Kind StructuredResource\nself.resourceType.oclIsKindOf(hwresource::StructuredResource)' UniquePortNames='-- The Ports must have an unique name\nself.hwports->isUnique(name)'"
 * @generated
 */
public interface StructuredResourceInstance extends ResourceInstance {
	/**
	 * Returns the value of the '<em><b>Embedded Atomic Resource Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwresourceinstance.AtomicResourceInstance}.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.hardware.hwresourceinstance.AtomicResourceInstance#getParentStructuredResourceInstance <em>Parent Structured Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AtomicResourceInstances which are contained in this StructuredResourceInstance.
	 * The AtomicResourceInstances are determined by the AtomicResources which are embedded in the StructuredResource type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded Atomic Resource Instances</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getStructuredResourceInstance_EmbeddedAtomicResourceInstances()
	 * @see org.muml.pm.hardware.hwresourceinstance.AtomicResourceInstance#getParentStructuredResourceInstance
	 * @model opposite="parentStructuredResourceInstance" containment="true" required="true"
	 * @generated
	 */
	EList<AtomicResourceInstance> getEmbeddedAtomicResourceInstances();

} // StructuredResourceInstance
