/**
 */
package org.muml.pm.hardware.hwplatform;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatform.HWPlatformPart#getHwplatformType <em>Hwplatform Type</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.HWPlatformPart#getEmbeddedBridges <em>Embedded Bridges</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getHWPlatformPart()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoLoop'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoLoop='-- HWPlatformPart must NOT have the same type as its parent HWPlatform\nself.hwplatformType<>self.parentHWPlatform'"
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
	 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getHWPlatformPart_HwplatformType()
	 * @model required="true"
	 * @generated
	 */
	HWPlatform getHwplatformType();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatform.HWPlatformPart#getHwplatformType <em>Hwplatform Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hwplatform Type</em>' reference.
	 * @see #getHwplatformType()
	 * @generated
	 */
	void setHwplatformType(HWPlatform value);

	/**
	 * Returns the value of the '<em><b>Embedded Bridges</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwplatform.NetworkBridge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Bridges of this HWPlatform. 
	 * They are derived from the reference embeddedCommunicationResource of the hwplatformType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded Bridges</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getHWPlatformPart_EmbeddedBridges()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if hwplatformType.oclIsUndefined() then\r\n\tOrderedSet { }\r\nelse\r\n\tself.hwplatformType.networkingHardware->select(c| c.oclIsTypeOf(hwplatform::NetworkBridge)).oclAsType(hwplatform::NetworkBridge)->asOrderedSet()\r\nendif'"
	 * @generated
	 */
	EList<NetworkBridge> getEmbeddedBridges();

} // HWPlatformPart
