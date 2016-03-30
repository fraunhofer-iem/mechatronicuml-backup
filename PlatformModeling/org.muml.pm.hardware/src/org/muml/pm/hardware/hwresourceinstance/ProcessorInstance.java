/**
 */
package org.muml.pm.hardware.hwresourceinstance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A processor at instance level.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.ProcessorInstance#getMIPS <em>MIPS</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.ProcessorInstance#getCPI <em>CPI</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.ProcessorInstance#getOwnedCacheInstance <em>Owned Cache Instance</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getProcessorInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CheckResourceType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL CheckResourceType='-- ResourceType must be of Kind Processor\nself.resourceType.oclIsKindOf(hwresource::Processor)'"
 * @generated
 */
public interface ProcessorInstance extends ComputingResourceInstance {
	/**
	 * Returns the value of the '<em><b>MIPS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MIPS-Rate (Million instructions per second) of this ProcessorInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MIPS</em>' attribute.
	 * @see #setMIPS(float)
	 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getProcessorInstance_MIPS()
	 * @model
	 * @generated
	 */
	float getMIPS();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresourceinstance.ProcessorInstance#getMIPS <em>MIPS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MIPS</em>' attribute.
	 * @see #getMIPS()
	 * @generated
	 */
	void setMIPS(float value);

	/**
	 * Returns the value of the '<em><b>CPI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The average count of cycles per instruction (CPI) of this ProcessorInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CPI</em>' attribute.
	 * @see #setCPI(float)
	 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getProcessorInstance_CPI()
	 * @model
	 * @generated
	 */
	float getCPI();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresourceinstance.ProcessorInstance#getCPI <em>CPI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPI</em>' attribute.
	 * @see #getCPI()
	 * @generated
	 */
	void setCPI(float value);

	/**
	 * Returns the value of the '<em><b>Owned Cache Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CacheInstance this ProcessorInstance uses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Cache Instance</em>' reference.
	 * @see #setOwnedCacheInstance(CacheInstance)
	 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getProcessorInstance_OwnedCacheInstance()
	 * @model
	 * @generated
	 */
	CacheInstance getOwnedCacheInstance();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresourceinstance.ProcessorInstance#getOwnedCacheInstance <em>Owned Cache Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Cache Instance</em>' reference.
	 * @see #getOwnedCacheInstance()
	 * @generated
	 */
	void setOwnedCacheInstance(CacheInstance value);

} // ProcessorInstance
