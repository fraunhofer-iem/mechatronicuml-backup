/**
 */
package org.muml.pm.hardware.hwresourceinstance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Memory Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents fast and volatile processing memory (i.e. SRAM).
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getProcessingMemoryInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CheckMemoryVolatile'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL CheckMemoryVolatile='-- The ResourceType must be of Kind volatile MemoryResource\nif self.resourceType.oclIsUndefined() then\r\nfalse\r\nelse\r\nself.resourceType.oclAsType(hwresource::MemoryResource).isVolatile=true\r\nendif\n\n'"
 * @generated
 */
public interface ProcessingMemoryInstance extends MemoryResourceInstance {
} // ProcessingMemoryInstance
