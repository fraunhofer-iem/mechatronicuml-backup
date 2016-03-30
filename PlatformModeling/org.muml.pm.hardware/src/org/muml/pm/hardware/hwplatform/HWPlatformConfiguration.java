/**
 */
package org.muml.pm.hardware.hwplatform;

import org.eclipse.emf.common.util.EList;
import org.muml.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Platform Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a hardware platform configuration at type level.
 *  A hardware platform configuration consists of several HWPlatforms and ResourceInstanceRepositories that contain all ResourceInstances to build a HWPlatform.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatform.HWPlatformConfiguration#getHwplatforms <em>Hwplatforms</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getHWPlatformConfiguration()
 * @model
 * @generated
 */
public interface HWPlatformConfiguration extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Hwplatforms</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwplatform.HWPlatform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPlatforms that are contained in this HWPlatformConfiguration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwplatforms</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getHWPlatformConfiguration_Hwplatforms()
	 * @model containment="true"
	 * @generated
	 */
	EList<HWPlatform> getHwplatforms();

} // HWPlatformConfiguration
