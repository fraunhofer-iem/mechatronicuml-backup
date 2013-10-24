/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;


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
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getProcessingMemoryInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CheckMemoryVolatile'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL CheckMemoryVolatile='self.resourceType.oclAsType(resourcetype::MemoryResource).isVolatile=true\n'"
 * @generated
 */
public interface ProcessingMemoryInstance extends MemoryResourceInstance {
} // ProcessingMemoryInstance
