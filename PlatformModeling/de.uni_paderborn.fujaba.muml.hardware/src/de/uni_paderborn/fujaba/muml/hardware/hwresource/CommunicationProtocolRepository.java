/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Protocol Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocolRepository#getCommunicationProtocols <em>Communication Protocols</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage#getCommunicationProtocolRepository()
 * @model
 * @generated
 */
public interface CommunicationProtocolRepository extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Communication Protocols</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Protocols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Protocols</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage#getCommunicationProtocolRepository_CommunicationProtocols()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationProtocol> getCommunicationProtocols();

} // CommunicationProtocolRepository
