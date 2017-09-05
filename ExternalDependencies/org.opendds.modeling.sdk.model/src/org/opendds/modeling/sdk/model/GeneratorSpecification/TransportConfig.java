/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig#getName <em>Name</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig#getTransportRef <em>Transport Ref</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig#getPassive_connect_duration <em>Passive connect duration</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig#getSwap_bytes <em>Swap bytes</em>}</li>
 * </ul>
 *
 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTransportConfig()
 * @model
 * @generated
 */
public interface TransportConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTransportConfig_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transport Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Ref</em>' containment reference list.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTransportConfig_TransportRef()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransportRef> getTransportRef();

	/**
	 * Returns the value of the '<em><b>Passive connect duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passive connect duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passive connect duration</em>' containment reference.
	 * @see #setPassive_connect_duration(PassiveConnectDuration)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTransportConfig_Passive_connect_duration()
	 * @model containment="true"
	 * @generated
	 */
	PassiveConnectDuration getPassive_connect_duration();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig#getPassive_connect_duration <em>Passive connect duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passive connect duration</em>' containment reference.
	 * @see #getPassive_connect_duration()
	 * @generated
	 */
	void setPassive_connect_duration(PassiveConnectDuration value);

	/**
	 * Returns the value of the '<em><b>Swap bytes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swap bytes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swap bytes</em>' containment reference.
	 * @see #setSwap_bytes(SwapBytes)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTransportConfig_Swap_bytes()
	 * @model containment="true"
	 * @generated
	 */
	SwapBytes getSwap_bytes();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig#getSwap_bytes <em>Swap bytes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swap bytes</em>' containment reference.
	 * @see #getSwap_bytes()
	 * @generated
	 */
	void setSwap_bytes(SwapBytes value);

} // TransportConfig
