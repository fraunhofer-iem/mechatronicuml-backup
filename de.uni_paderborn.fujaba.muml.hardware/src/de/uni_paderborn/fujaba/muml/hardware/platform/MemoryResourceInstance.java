/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class is the super class for all memory instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance#getMemoryType <em>Memory Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getMemoryResourceInstance()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CheckResourceType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL CheckResourceType='self.resourceType.oclIsKindOf(resourcetype::MemoryResource)'"
 * @generated
 */
public interface MemoryResourceInstance extends AtomicResourceInstance {
	/**
	 * Returns the value of the '<em><b>Memory Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total size of  memory this instances provides.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Size</em>' containment reference.
	 * @see #setMemorySize(DataSize)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getMemoryResourceInstance_MemorySize()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataSize getMemorySize();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance#getMemorySize <em>Memory Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Size</em>' containment reference.
	 * @see #getMemorySize()
	 * @generated
	 */
	void setMemorySize(DataSize value);

	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum speed at which the memory can be read.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Throughput</em>' containment reference.
	 * @see #setThroughput(DataRate)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getMemoryResourceInstance_Throughput()
	 * @model containment="true"
	 * @generated
	 */
	DataRate getThroughput();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance#getThroughput <em>Throughput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' containment reference.
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(DataRate value);

	/**
	 * Returns the value of the '<em><b>Memory Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of this MemoryInstance. It is derived from its resourceType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryKind
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getMemoryResourceInstance_MemoryType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.resourceType.oclAsType(resourcetype::MemoryResource).memoryType'"
	 * @generated
	 */
	MemoryKind getMemoryType();

} // MemoryResourceInstance
