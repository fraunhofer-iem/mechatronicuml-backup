/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents all StructuredResource (i.e. ECUs, Server,etc.). A StructuredResource consists of several AtomicResources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.StructuredResource#getEmbeddedAtomicResources <em>Embedded Atomic Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#getStructuredResource()
 * @model
 * @generated
 */
public interface StructuredResource extends ResourceType {
	/**
	 * Returns the value of the '<em><b>Embedded Atomic Resources</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.AtomicResource}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.AtomicResource#getParentStructuredResource <em>Parent Structured Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All AtomicResources which are contained in this StructuredResource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded Atomic Resources</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#getStructuredResource_EmbeddedAtomicResources()
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.AtomicResource#getParentStructuredResource
	 * @model opposite="parentStructuredResource" containment="true" required="true"
	 * @generated
	 */
	EList<AtomicResource> getEmbeddedAtomicResources();

} // StructuredResource
