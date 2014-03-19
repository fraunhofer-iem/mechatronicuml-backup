/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a bridge or a gateway. Bridges are used to connect two or more CommunicationMedia.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.Bridge#getConnectedCommunicationMedia <em>Connected Communication Media</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.Bridge#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getBridge()
 * @model
 * @generated
 */
public interface Bridge extends CommunicationResource {
	/**
	 * Returns the value of the '<em><b>Connected Communication Media</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getConnectedBridges <em>Connected Bridges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CommunicationMedia which are connected to this Bridge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Communication Media</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getBridge_ConnectedCommunicationMedia()
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getConnectedBridges
	 * @model opposite="connectedBridges" lower="2"
	 * @generated
	 */
	EList<CommunicationMedia> getConnectedCommunicationMedia();

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time variation this Bridge needs to transmit data between different CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay</em>' containment reference.
	 * @see #setDelay(TimeInterval)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getBridge_Delay()
	 * @model containment="true"
	 * @generated
	 */
	TimeInterval getDelay();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Bridge#getDelay <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' containment reference.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(TimeInterval value);

} // Bridge
