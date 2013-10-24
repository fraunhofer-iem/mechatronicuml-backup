/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a hardware platform at the type level. 
 * A HWPlatform consists of several embedded PlatformParts and several CommunicationResources to connect the embedded PlatformParts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform#getEmbeddedPlatformParts <em>Embedded Platform Parts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform#getEmbeddedCommunicationResources <em>Embedded Communication Resources</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform#getDelegationPorts <em>Delegation Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform#getDelegations <em>Delegations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPlatform()
 * @model
 * @generated
 */
public interface HWPlatform extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Embedded Platform Parts</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart#getParentHWPlatform <em>Parent HW Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PlatformParts which are embedded in this HWPlatform. 
	 * A PlatformPart is either a  HWPlatformPart or a ResourceInstancePart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded Platform Parts</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPlatform_EmbeddedPlatformParts()
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart#getParentHWPlatform
	 * @model opposite="parentHWPlatform" containment="true" required="true"
	 * @generated
	 */
	EList<PlatformPart> getEmbeddedPlatformParts();

	/**
	 * Returns the value of the '<em><b>Embedded Communication Resources</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CommunicationResources this HWPlatform contains.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded Communication Resources</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPlatform_EmbeddedCommunicationResources()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CommunicationResource> getEmbeddedCommunicationResources();

	/**
	 * Returns the value of the '<em><b>Delegation Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPortInstances of this HWPlatform that are used as delegation ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegation Ports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPlatform_DelegationPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<HWPortInstance> getDelegationPorts();

	/**
	 * Returns the value of the '<em><b>Delegations</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.Delegation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port delegations which are used in the HWPlatform.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegations</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPlatform_Delegations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Delegation> getDelegations();

} // HWPlatform
