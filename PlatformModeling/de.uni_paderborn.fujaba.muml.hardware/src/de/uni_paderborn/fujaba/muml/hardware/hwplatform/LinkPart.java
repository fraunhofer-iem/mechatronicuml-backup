/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform;

import de.uni_paderborn.fujaba.muml.connector.Connector;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a link connection. A link can only be connected to two LinkPortInstances or to one LinkPortInstance and one Bridge.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart#getConnectedHWPortParts <em>Connected HW Port Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getLinkPart()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Only2Connections'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL Only2Connections='-- A link can only connect to Link Ports\nself.connectorEndpoints->size()<=2'"
 * @generated
 */
public interface LinkPart extends CommunicationMediaPart, Connector {
	/**
	 * Returns the value of the '<em><b>Connected HW Port Parts</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connected LinkPortInstances.
	 *  They are derived from the reference connectedHWPortInstances of the super class CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected HW Port Parts</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getLinkPart_ConnectedHWPortParts()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(e|e.oclIsKindOf(HWPortPart)).oclAsType(HWPortPart)->asOrderedSet()\n'"
	 * @generated
	 */
	EList<HWPortPart> getConnectedHWPortParts();

} // LinkPart
