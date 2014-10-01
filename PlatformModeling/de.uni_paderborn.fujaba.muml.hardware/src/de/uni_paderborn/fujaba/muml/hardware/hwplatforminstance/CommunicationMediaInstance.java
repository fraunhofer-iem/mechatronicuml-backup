/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationMedia;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Media Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class represents CommuniationMedia.
 * CommunicationMedia are used to connect HWPortInstances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance#getCommunicationMedia <em>Communication Media</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance#getCommunicationMediaPart <em>Communication Media Part</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance#getBandwidth <em>Bandwidth</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getCommunicationMediaInstance()
 * @model abstract="true"
 * @generated
 */
public interface CommunicationMediaInstance extends NetworkingHardwareInstance {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The protocol this CommunicationMedia uses to transmit data. A CommunicationMedia can only be connected to HWPortInstances that use the same protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see #setProtocol(CommunicationProtocol)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getCommunicationMediaInstance_Protocol()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.communicationMedia.oclIsUndefined()) then\n\tnull\nelse \n\tself.communicationMedia.protocol\nendif'"
	 * @generated
	 */
	CommunicationProtocol getProtocol();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance#getProtocol <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(CommunicationProtocol value);

	/**
	 * Returns the value of the '<em><b>Communication Media</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Media</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Media</em>' reference.
	 * @see #setCommunicationMedia(CommunicationMedia)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getCommunicationMediaInstance_CommunicationMedia()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.communicationMediaPart.oclIsUndefined()) then\n\tnull\nelse \n\tself.communicationMediaPart.communicationMedia\nendif'"
	 * @generated
	 */
	CommunicationMedia getCommunicationMedia();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance#getCommunicationMedia <em>Communication Media</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Media</em>' reference.
	 * @see #getCommunicationMedia()
	 * @generated
	 */
	void setCommunicationMedia(CommunicationMedia value);

	/**
	 * Returns the value of the '<em><b>Communication Media Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Media Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Media Part</em>' reference.
	 * @see #setCommunicationMediaPart(CommunicationMediaPart)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getCommunicationMediaInstance_CommunicationMediaPart()
	 * @model required="true"
	 * @generated
	 */
	CommunicationMediaPart getCommunicationMediaPart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance#getCommunicationMediaPart <em>Communication Media Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Media Part</em>' reference.
	 * @see #getCommunicationMediaPart()
	 * @generated
	 */
	void setCommunicationMediaPart(CommunicationMediaPart value);

	/**
	 * Returns the value of the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bandwidth of this CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bandwidth</em>' containment reference.
	 * @see #setBandwidth(DataRate)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getCommunicationMediaInstance_Bandwidth()
	 * @model containment="true" required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.communicationMedia.oclIsUndefined()) then\n\tnull\nelse \n\tself.communicationMedia.bandwidth\nendif'"
	 * @generated
	 */
	DataRate getBandwidth();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance#getBandwidth <em>Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth</em>' containment reference.
	 * @see #getBandwidth()
	 * @generated
	 */
	void setBandwidth(DataRate value);

} // CommunicationMediaInstance
