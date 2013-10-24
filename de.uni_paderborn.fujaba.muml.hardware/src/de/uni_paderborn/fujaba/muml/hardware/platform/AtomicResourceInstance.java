/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;


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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance#getParentStructuredResourceInstance <em>Parent Structured Resource Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getAtomicResourceInstance()
 * @model abstract="true"
 * @generated
 */
public interface AtomicResourceInstance extends ResourceInstance {
	/**
	 * Returns the value of the '<em><b>Parent Structured Resource Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance#getEmbeddedAtomicResourceInstances <em>Embedded Atomic Resource Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StructuredResourceInstance, this AtomicResourceInstance belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Structured Resource Instance</em>' container reference.
	 * @see #setParentStructuredResourceInstance(StructuredResourceInstance)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getAtomicResourceInstance_ParentStructuredResourceInstance()
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance#getEmbeddedAtomicResourceInstances
	 * @model opposite="embeddedAtomicResourceInstances" required="true" transient="false"
	 * @generated
	 */
	StructuredResourceInstance getParentStructuredResourceInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance#getParentStructuredResourceInstance <em>Parent Structured Resource Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structured Resource Instance</em>' container reference.
	 * @see #getParentStructuredResourceInstance()
	 * @generated
	 */
	void setParentStructuredResourceInstance(StructuredResourceInstance value);

} // AtomicResourceInstance
