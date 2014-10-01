/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a bus. A bus is used to connect several BusPortInstances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusPart#getConnectedHWPortParts <em>Connected HW Port Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getBusPart()
 * @model
 * @generated
 */
public interface BusPart extends CommunicationMediaPart, ConnectorEndpoint {
	/**
	 * Returns the value of the '<em><b>Connected HW Port Parts</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connected BusPortInstances. 
	 *  They are derived from the reference connectedHWPortInstances of the super class CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected HW Port Parts</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getBusPart_ConnectedHWPortParts()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectors->select(c|c.oclIsKindOf(BusConnector))->collect(connectedHWPortParts)->asOrderedSet()'"
	 * @generated
	 */
	EList<HWPortPart> getConnectedHWPortParts();

} // BusPart
