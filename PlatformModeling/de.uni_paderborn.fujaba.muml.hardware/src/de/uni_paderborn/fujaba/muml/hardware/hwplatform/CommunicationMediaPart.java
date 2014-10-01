/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationMedia;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Media Part</b></em>'.
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
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart#getCommunicationMedia <em>Communication Media</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart#getBandwidth <em>Bandwidth</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getCommunicationMediaPart()
 * @model abstract="true"
 * @generated
 */
public interface CommunicationMediaPart extends NetworkingHardwarePart {
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
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getCommunicationMediaPart_CommunicationMedia()
	 * @model required="true"
	 * @generated
	 */
	CommunicationMedia getCommunicationMedia();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart#getCommunicationMedia <em>Communication Media</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Media</em>' reference.
	 * @see #getCommunicationMedia()
	 * @generated
	 */
	void setCommunicationMedia(CommunicationMedia value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The protocol this CommunicationMedia uses to transmit data. A CommunicationMedia can only be connected to HWPortInstances that use the same protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see #setProtocol(CommunicationProtocol)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getCommunicationMediaPart_Protocol()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.communicationMedia.oclIsUndefined()) then\n\tnull\nelse \n\tself.communicationMedia.protocol\nendif'"
	 * @generated
	 */
	CommunicationProtocol getProtocol();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart#getProtocol <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(CommunicationProtocol value);

	/**
	 * Returns the value of the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bandwidth of this CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bandwidth</em>' containment reference.
	 * @see #setBandwidth(DataRate)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getCommunicationMediaPart_Bandwidth()
	 * @model containment="true" required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.communicationMedia.oclIsUndefined()) then\n\tnull\nelse \n\tself.communicationMedia.bandwidth\nendif'"
	 * @generated
	 */
	DataRate getBandwidth();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart#getBandwidth <em>Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth</em>' containment reference.
	 * @see #getBandwidth()
	 * @generated
	 */
	void setBandwidth(DataRate value);

} // CommunicationMediaPart
