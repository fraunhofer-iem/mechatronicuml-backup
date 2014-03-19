/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance#getEmbeddedAtomicResourceInstances <em>Embedded Atomic Resource Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getStructuredResourceInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CheckResourceType AllAtomicResourceTypesAreInitialized AllHWPortsAreInitialized'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AllAtomicResourceTypesAreInitialized='if(self.resourceType.oclIsUndefined()) then\n\ttrue\nelse \n\tself.resourceType.oclAsType(resourcetype::StructuredResource).embeddedAtomicResources->forAll(atomicResourceType | self.embeddedAtomicResourceInstances->exists(atomicResourceInstance | atomicResourceInstance.oclAsType(platform::AtomicResourceInstance).resourceType = atomicResourceType))\nendif' CheckResourceType='self.resourceType.oclIsKindOf(resourcetype::StructuredResource)' AllHWPortsAreInitialized='let hardwareports:Set(resourcetype::HWPort) = self.resourceType.oclAsType(resourcetype::StructuredResource).hwports in\nlet hardwareportinstances:Set(platform::HWPortInstance) = self.hwportInstances in\n if (self.resourceType.oclIsUndefined()) then\n\ttrue\nelse\nhardwareports->select(port|port.oclAsType(resourcetype::HWPort).cardinality.lowerBound.value>=1)->forAll(hwport | self.hwportInstances->exists(hwportInstance | hwportInstance.oclAsType(platform::HWPortInstance).hwportType = hwport))\nendif'"
 * @generated
 */
public interface StructuredResourceInstance extends ResourceInstance {
	/**
	 * Returns the value of the '<em><b>Embedded Atomic Resource Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance#getParentStructuredResourceInstance <em>Parent Structured Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AtomicResourceInstances which are contained in this StructuredResourceInstance.
	 * The AtomicResourceInstances are determined by the AtomicResources which are embedded in the StructuredResource type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded Atomic Resource Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getStructuredResourceInstance_EmbeddedAtomicResourceInstances()
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance#getParentStructuredResourceInstance
	 * @model opposite="parentStructuredResourceInstance" containment="true" required="true"
	 * @generated
	 */
	EList<AtomicResourceInstance> getEmbeddedAtomicResourceInstances();

} // StructuredResourceInstance
