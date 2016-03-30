/**
 */
package org.muml.pm.hardware.hwresource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an AtomicResource that is capable of storing data. 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.MemoryResource#getMemoryAccess <em>Memory Access</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.MemoryResource#isIsVolatile <em>Is Volatile</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.MemoryResource#getMemoryType <em>Memory Type</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getMemoryResource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RAMimpliesRW ROMimpliesReadOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL RAMimpliesRW='-- A RAM implies R/W Access\nself.memoryType = MemoryKind::RAM implies self.memoryAccess=MemoryAccessKind::READ_WRITE' ROMimpliesReadOnly='-- A ROM implies Read-Only Access\nself.memoryType = MemoryKind::ROM implies self.memoryAccess = MemoryAccessKind::READ_ONLY'"
 * @generated
 */
public interface MemoryResource extends AtomicResource {
	/**
	 * Returns the value of the '<em><b>Memory Access</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.pm.hardware.hwresource.MemoryAccessKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies what kind of access is allowed for this MemoryResource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Access</em>' attribute.
	 * @see org.muml.pm.hardware.hwresource.MemoryAccessKind
	 * @see #setMemoryAccess(MemoryAccessKind)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getMemoryResource_MemoryAccess()
	 * @model
	 * @generated
	 */
	MemoryAccessKind getMemoryAccess();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.MemoryResource#getMemoryAccess <em>Memory Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Access</em>' attribute.
	 * @see org.muml.pm.hardware.hwresource.MemoryAccessKind
	 * @see #getMemoryAccess()
	 * @generated
	 */
	void setMemoryAccess(MemoryAccessKind value);

	/**
	 * Returns the value of the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies if this MemoryResource is volatile or non-volatile. 
	 * Non-volatile Memory (i.e. ROM) could be used to store the binary code.
	 * Volatile Memory (i.e SRAM) is used during execution of code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Volatile</em>' attribute.
	 * @see #setIsVolatile(boolean)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getMemoryResource_IsVolatile()
	 * @model
	 * @generated
	 */
	boolean isIsVolatile();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.MemoryResource#isIsVolatile <em>Is Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Volatile</em>' attribute.
	 * @see #isIsVolatile()
	 * @generated
	 */
	void setIsVolatile(boolean value);

	/**
	 * Returns the value of the '<em><b>Memory Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.pm.hardware.hwresource.MemoryKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of this MemoryResource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Type</em>' attribute.
	 * @see org.muml.pm.hardware.hwresource.MemoryKind
	 * @see #setMemoryType(MemoryKind)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getMemoryResource_MemoryType()
	 * @model
	 * @generated
	 */
	MemoryKind getMemoryType();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.MemoryResource#getMemoryType <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Type</em>' attribute.
	 * @see org.muml.pm.hardware.hwresource.MemoryKind
	 * @see #getMemoryType()
	 * @generated
	 */
	void setMemoryType(MemoryKind value);

} // MemoryResource
