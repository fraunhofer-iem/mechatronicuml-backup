/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Port Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a hardware port of a PlatformPart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart#getHwPortInstance <em>Hw Port Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart#getConnectedMedia <em>Connected Media</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPortPart()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SameProtocol BusPort2Bus LinkPort2Link'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SameProtocol='if (self.connectedMedia->size()>0) then\n\tself.connectedMedia->first().protocol=self.protocol\nelse true\nendif' BusPort2Bus='if (self.hwPortInstance.oclIsTypeOf(platform::BusPortInstance) and  self.connectedMedia->size()>0) then\n\tself.connectedMedia->first().oclIsTypeOf(platform::Bus)\nelse true\n\nendif' LinkPort2Link='if (self.hwPortInstance.oclIsTypeOf(platform::LinkPortInstance) and  self.connectedMedia->size()>0) then\n\tself.connectedMedia->first().oclIsTypeOf(platform::Link)\nelse true\nendif'"
 * @generated
 */
public interface HWPortPart extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Hw Port Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hw Port Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPortInstance from which this HWPortPart is derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hw Port Instance</em>' reference.
	 * @see #setHwPortInstance(HWPortInstance)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPortPart_HwPortInstance()
	 * @model required="true"
	 * @generated
	 */
	HWPortInstance getHwPortInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart#getHwPortInstance <em>Hw Port Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hw Port Instance</em>' reference.
	 * @see #getHwPortInstance()
	 * @generated
	 */
	void setHwPortInstance(HWPortInstance value);

	/**
	 * Returns the value of the '<em><b>Connected Media</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getConnectedHWPortParts <em>Connected HW Port Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Media</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The communication media to which this HWPortPart is connected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Media</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPortPart_ConnectedMedia()
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getConnectedHWPortParts
	 * @model opposite="connectedHWPortParts"
	 * @generated
	 */
	EList<CommunicationMedia> getConnectedMedia();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The used protocol of this HWPortInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPortPart_Protocol()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if(self.hwPortInstance.oclIsUndefined()) then\n\tnull \nelse\n self.hwPortInstance.protocol\n endif\n '"
	 * @generated
	 */
	CommunicationProtocol getProtocol();

} // HWPortPart
