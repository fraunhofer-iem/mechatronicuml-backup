/**
 */
package org.muml.pm.hardware.hwresource;

import org.eclipse.emf.common.util.EList;
import org.muml.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Protocol Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a repository containing several CommunicationProtocol which are used in the hardware models.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.CommunicationProtocolRepository#getCommunicationProtocols <em>Communication Protocols</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getCommunicationProtocolRepository()
 * @model
 * @generated
 */
public interface CommunicationProtocolRepository extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Communication Protocols</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwresource.CommunicationProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Protocols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contained CommunicationProtocols.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Protocols</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getCommunicationProtocolRepository_CommunicationProtocols()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationProtocol> getCommunicationProtocols();

} // CommunicationProtocolRepository
