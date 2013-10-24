/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Platform Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a HWPlatformPart. 
 * HWPlatformParts are used to specify the structure of a HWPlatform. 
 * A HWPlatformPart is embedded in a HWPlatform and it is typed over a HWPlatform.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart#getHwplatformType <em>Hwplatform Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart#getDerivedBridges <em>Derived Bridges</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart#getDelegationPorts <em>Delegation Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPlatformPart()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoLoop'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoLoop='self.hwplatformType<>self.parentHWPlatform'"
 * @generated
 */
public interface HWPlatformPart extends PlatformPart {
	/**
	 * Returns the value of the '<em><b>Hwplatform Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPlatform type of this HWPlatformPart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwplatform Type</em>' reference.
	 * @see #setHwplatformType(HWPlatform)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPlatformPart_HwplatformType()
	 * @model required="true"
	 * @generated
	 */
	HWPlatform getHwplatformType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart#getHwplatformType <em>Hwplatform Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hwplatform Type</em>' reference.
	 * @see #getHwplatformType()
	 * @generated
	 */
	void setHwplatformType(HWPlatform value);

	/**
	 * Returns the value of the '<em><b>Derived Bridges</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.Bridge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Bridges of this HWPlatform. 
	 * They are derived from the reference embeddedCommunicationResource of the hwplatformType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived Bridges</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPlatformPart_DerivedBridges()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if hwplatformType.oclIsUndefined() then\r\n\tOrderedSet { }\r\nelse\r\n\tself.hwplatformType.embeddedCommunicationResources->select(c| c.oclIsTypeOf(platform::Bridge)).oclAsType(platform::Bridge)->asOrderedSet()\nendif'"
	 * @generated
	 */
	EList<Bridge> getDerivedBridges();

	/**
	 * Returns the value of the '<em><b>Delegation Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Ports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPlatformPart_DelegationPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<HWPortPart> getDelegationPorts();

} // HWPlatformPart
