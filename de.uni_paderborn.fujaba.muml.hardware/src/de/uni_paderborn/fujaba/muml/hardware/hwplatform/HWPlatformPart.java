/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart#getHwplatformType <em>Hwplatform Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart#getEmbeddedBridges <em>Embedded Bridges</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPlatformPart()
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
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPlatformPart_HwplatformType()
	 * @model required="true"
	 * @generated
	 */
	HWPlatform getHwplatformType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart#getHwplatformType <em>Hwplatform Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hwplatform Type</em>' reference.
	 * @see #getHwplatformType()
	 * @generated
	 */
	void setHwplatformType(HWPlatform value);

	/**
	 * Returns the value of the '<em><b>Embedded Bridges</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Bridges of this HWPlatform. 
	 * They are derived from the reference embeddedCommunicationResource of the hwplatformType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded Bridges</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPlatformPart_EmbeddedBridges()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if hwplatformType.oclIsUndefined() then\n\tOrderedSet { }\nelse\n\tself.hwplatformType.networkingHardwareParts->select(c| c.oclIsTypeOf(hwplatform::BridgePart)).oclAsType(hwplatform::BridgePart)->asOrderedSet()\nendif'"
	 * @generated
	 */
	EList<BridgePart> getEmbeddedBridges();

} // HWPlatformPart
