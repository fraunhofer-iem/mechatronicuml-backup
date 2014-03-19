/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platforminstance;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.hardware.platform.Bridge;
import de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.platform.Delegation;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Platform Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a hardware platform at instance level. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getHwplatformType <em>Hwplatform Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getResourceInstances <em>Resource Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getCommunicationResources <em>Communication Resources</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getHwplatformInstances <em>Hwplatform Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getDerivedBridges <em>Derived Bridges</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getDelegationPorts <em>Delegation Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getDelegations <em>Delegations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage#getHWPlatformInstance()
 * @model
 * @generated
 */
public interface HWPlatformInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Hwplatform Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPlatform type of which this instance is derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwplatform Type</em>' reference.
	 * @see #setHwplatformType(HWPlatform)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage#getHWPlatformInstance_HwplatformType()
	 * @model required="true"
	 * @generated
	 */
	HWPlatform getHwplatformType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance#getHwplatformType <em>Hwplatform Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hwplatform Type</em>' reference.
	 * @see #getHwplatformType()
	 * @generated
	 */
	void setHwplatformType(HWPlatform value);

	/**
	 * Returns the value of the '<em><b>Resource Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResourceInstances that belong to this HWPlatformInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage#getHWPlatformInstance_ResourceInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceInstance> getResourceInstances();

	/**
	 * Returns the value of the '<em><b>Communication Resources</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CommunicationResources that belong to this HWPlatformInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Resources</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage#getHWPlatformInstance_CommunicationResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationResource> getCommunicationResources();

	/**
	 * Returns the value of the '<em><b>Hwplatform Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPlatformInstances that are embedded in this HWPlatformInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwplatform Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage#getHWPlatformInstance_HwplatformInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<HWPlatformInstance> getHwplatformInstances();

	/**
	 * Returns the value of the '<em><b>Derived Bridges</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.Bridge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derived Bridges of this HWPlatformInstance. 
	 * The Bridges are used to connect different HWPlatformInstances via CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived Bridges</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage#getHWPlatformInstance_DerivedBridges()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (not self.hwplatformType.oclIsUndefined()) then\n\tself.communicationResources->select(c|c.oclIsTypeOf(platform::Bridge)).oclAsType(platform::Bridge)->asOrderedSet()\nelse\tOrderedSet {}\nendif'"
	 * @generated
	 */
	EList<Bridge> getDerivedBridges();

	/**
	 * Returns the value of the '<em><b>Delegation Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The delegation ports of this HWPlatformInstance. They are derived from the HWPlatform type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegation Ports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage#getHWPlatformInstance_DelegationPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<HWPortPart> getDelegationPorts();

	/**
	 * Returns the value of the '<em><b>Delegations</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.Delegation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The delegations of this HWPlatformInstance. They are derived from is HWPlatform type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegations</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage#getHWPlatformInstance_Delegations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Delegation> getDelegations();

} // HWPlatformInstance
