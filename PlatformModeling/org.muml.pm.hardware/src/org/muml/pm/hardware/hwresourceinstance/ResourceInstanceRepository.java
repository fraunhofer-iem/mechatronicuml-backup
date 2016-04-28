/**
 */
package org.muml.pm.hardware.hwresourceinstance;

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.CommentableElement;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.ResourceInstanceRepository#getResourceInstances <em>Resource Instances</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getResourceInstanceRepository()
 * @model
 * @generated
 */
public interface ResourceInstanceRepository extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Resource Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwresourceinstance.ResourceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResourceInstances that are contained in this ResourceInstanceRepository. They are derived from a ResourceTypeRepository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Instances</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getResourceInstanceRepository_ResourceInstances()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceInstance> getResourceInstances();

} // ResourceInstanceRepository
