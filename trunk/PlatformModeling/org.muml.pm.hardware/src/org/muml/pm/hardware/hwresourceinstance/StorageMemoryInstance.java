/**
 */
package org.muml.pm.hardware.hwresourceinstance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Memory Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an instance of non-volatile memory which is capable of storing data.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getStorageMemoryInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CheckMemoryNonVolatile'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL CheckMemoryNonVolatile='-- The ResourceType must be of Kind non-volatile MemoryResource\n-- The ResourceType must be of Kind volatile MemoryResource\nif self.resourceType.oclIsUndefined() then\r\nfalse\r\nelse\r\nself.resourceType.oclAsType(hwresource::MemoryResource).isVolatile=false\r\nendif\n\n'"
 * @generated
 */
public interface StorageMemoryInstance extends MemoryResourceInstance {
} // StorageMemoryInstance
