/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a link connection. A link can only be connected to two LinkPortInstances or to one LinkPortInstance and one Bridge.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.Link#getConnectedLinkPortInstances <em>Connected Link Port Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getLink()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Only2Connections LinkProtocol'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL Only2Connections='self.connectedHWPortParts->size()+self.connectedBridges->size()<=2' LinkProtocol='self.protocol.oclIsTypeOf(resourcetype::LinkProtocol)'"
 * @generated
 */
public interface Link extends CommunicationMedia {
	/**
	 * Returns the value of the '<em><b>Connected Link Port Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connected LinkPortInstances.
	 *  They are derived from the reference connectedHWPortInstances of the super class CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Link Port Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getLink_ConnectedLinkPortInstances()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectedHWPortParts->select(p|p.oclAsType(platform::HWPortPart).hwPortInstance.oclIsTypeOf(platform::LinkPortInstance))->asOrderedSet()'"
	 * @generated
	 */
	EList<HWPortPart> getConnectedLinkPortInstances();

} // Link
