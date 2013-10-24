/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;


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
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getStorageMemoryInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CheckMemoryNonVolatile'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL CheckMemoryNonVolatile='self.resourceType.oclAsType(resourcetype::MemoryResource).isVolatile=false'"
 * @generated
 */
public interface StorageMemoryInstance extends MemoryResourceInstance {
} // StorageMemoryInstance
