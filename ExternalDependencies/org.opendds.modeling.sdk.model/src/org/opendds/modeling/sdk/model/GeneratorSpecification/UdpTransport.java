/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Udp Transport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.UdpTransport#getLocal_address_str <em>Local address str</em>}</li>
 * </ul>
 *
 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getUdpTransport()
 * @model
 * @generated
 */
public interface UdpTransport extends TransportInst {
	/**
	 * Returns the value of the '<em><b>Local address str</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local address str</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local address str</em>' containment reference.
	 * @see #setLocal_address_str(LocalAddressString)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getUdpTransport_Local_address_str()
	 * @model containment="true"
	 * @generated
	 */
	LocalAddressString getLocal_address_str();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.UdpTransport#getLocal_address_str <em>Local address str</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local address str</em>' containment reference.
	 * @see #getLocal_address_str()
	 * @generated
	 */
	void setLocal_address_str(LocalAddressString value);

} // UdpTransport
