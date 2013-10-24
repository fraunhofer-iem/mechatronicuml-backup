/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype;

import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class represents the CommunicationProtocol used by the HWPorts and CommunicationMedia.
 * It is used to match Ports and CommunicationMedia.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol#isIsTimeTriggered <em>Is Time Triggered</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol#isIsEventTriggered <em>Is Event Triggered</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol#getFurtherInformation <em>Further Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#getCommunicationProtocol()
 * @model abstract="true"
 * @generated
 */
public interface CommunicationProtocol extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Time Triggered</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Time Triggered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines if the protocol is time triggered. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Time Triggered</em>' attribute.
	 * @see #setIsTimeTriggered(boolean)
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#getCommunicationProtocol_IsTimeTriggered()
	 * @model default="" required="true"
	 * @generated
	 */
	boolean isIsTimeTriggered();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol#isIsTimeTriggered <em>Is Time Triggered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Time Triggered</em>' attribute.
	 * @see #isIsTimeTriggered()
	 * @generated
	 */
	void setIsTimeTriggered(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Event Triggered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Event Triggered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines if this protocol is event triggered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Event Triggered</em>' attribute.
	 * @see #setIsEventTriggered(boolean)
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#getCommunicationProtocol_IsEventTriggered()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsEventTriggered();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol#isIsEventTriggered <em>Is Event Triggered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Event Triggered</em>' attribute.
	 * @see #isIsEventTriggered()
	 * @generated
	 */
	void setIsEventTriggered(boolean value);

	/**
	 * Returns the value of the '<em><b>Further Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Further information for this protocol (i.e. Version, or another Protocol).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Further Information</em>' attribute.
	 * @see #setFurtherInformation(String)
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#getCommunicationProtocol_FurtherInformation()
	 * @model
	 * @generated
	 */
	String getFurtherInformation();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol#getFurtherInformation <em>Further Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Further Information</em>' attribute.
	 * @see #getFurtherInformation()
	 * @generated
	 */
	void setFurtherInformation(String value);

} // CommunicationProtocol
