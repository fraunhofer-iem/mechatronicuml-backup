/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform;

import de.uni_paderborn.fujaba.muml.connector.Connector;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector#getConnectedBusPart <em>Connected Bus Part</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector#getConnectedHWPortParts <em>Connected HW Port Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getBusConnector()
 * @model
 * @generated
 */
public interface BusConnector extends Connector, NetworkingHardwarePart {
	/**
	 * Returns the value of the '<em><b>Connected Bus Part</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Bus Part</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Bus Part</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getBusConnector_ConnectedBusPart()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(e|e.oclIsKindOf(hwplatform::BusPart)).oclAsType(hwplatform::BusPart)->asOrderedSet()'"
	 * @generated
	 */
	EList<BusPart> getConnectedBusPart();

	/**
	 * Returns the value of the '<em><b>Connected HW Port Parts</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected HW Port Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected HW Port Parts</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getBusConnector_ConnectedHWPortParts()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(e|e.oclIsKindOf(hwplatform::HWPortPart)).oclAsType(hwplatform::HWPortPart)->asOrderedSet()'"
	 * @generated
	 */
	EList<HWPortPart> getConnectedHWPortParts();

} // BusConnector
