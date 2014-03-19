/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platforminstance;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Platform Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a HWPlatformInstanceConfiguration.
 * A HWPlatformInstanceConfiguration consists of several HWPlatformInstances.
 * The HWPlatformInstances might be connected via different CommunicationMedia.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstanceConfiguration#getHwplatformInstances <em>Hwplatform Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstanceConfiguration#getCommunicationMedia <em>Communication Media</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage#getHWPlatformInstanceConfiguration()
 * @model
 * @generated
 */
public interface HWPlatformInstanceConfiguration extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Hwplatform Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of HWPlatformInstances of this HWPlatformInstanceConfiguration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwplatform Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage#getHWPlatformInstanceConfiguration_HwplatformInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<HWPlatformInstance> getHwplatformInstances();

	/**
	 * Returns the value of the '<em><b>Communication Media</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CommunicationMedia of this HWPlatformInstanceConfiguration. 
	 * The CommunicationMedia are used to connect different HWPlatformInstances via their Bridges or HWPortInstances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Media</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage#getHWPlatformInstanceConfiguration_CommunicationMedia()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationMedia> getCommunicationMedia();

} // HWPlatformInstanceConfiguration
