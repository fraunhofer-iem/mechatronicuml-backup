/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Instance Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a ResourceInstanceRepository. 
 * A ResourceInstanceRepository contains all ResourceInstances to build a HWPlatform. The ResourceInstances are derived from a ResourceTypeRepository.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository#getResourceInstances <em>Resource Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository#getResourceTypeRepository <em>Resource Type Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getResourceInstanceRepository()
 * @model
 * @generated
 */
public interface ResourceInstanceRepository extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Resource Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResourceInstances that are contained in this ResourceInstanceRepository. They are derived from a ResourceTypeRepository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getResourceInstanceRepository_ResourceInstances()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceInstance> getResourceInstances();

	/**
	 * Returns the value of the '<em><b>Resource Type Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Type Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResourceTypeRepository which contains the ResourceTypes that are instantiated in this ResourceInstanceRepository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type Repository</em>' reference.
	 * @see #setResourceTypeRepository(ResourceTypeRepository)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getResourceInstanceRepository_ResourceTypeRepository()
	 * @model required="true"
	 * @generated
	 */
	ResourceTypeRepository getResourceTypeRepository();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository#getResourceTypeRepository <em>Resource Type Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type Repository</em>' reference.
	 * @see #getResourceTypeRepository()
	 * @generated
	 */
	void setResourceTypeRepository(ResourceTypeRepository value);

} // ResourceInstanceRepository
