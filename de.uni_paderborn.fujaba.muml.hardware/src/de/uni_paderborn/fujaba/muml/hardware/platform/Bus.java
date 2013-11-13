/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a bus. A bus is used to connect several BusPortInstances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.Bus#getConnectedBusPortInstances <em>Connected Bus Port Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getBus()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='BusProtocol'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL BusProtocol='self.protocol.oclIsTypeOf(resourcetype::BusProtocol)'"
 * @generated
 */
public interface Bus extends CommunicationMedia {
	/**
	 * Returns the value of the '<em><b>Connected Bus Port Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connected BusPortInstances. 
	 *  They are derived from the reference connectedHWPortInstances of the super class CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Bus Port Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getBus_ConnectedBusPortInstances()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectedHWPortParts->select(p|p.oclAsType(platform::HWPortPart).hwPortInstance.oclIsTypeOf(platform::BusPortInstance))->asOrderedSet()\n'"
	 * @generated
	 */
	EList<HWPortPart> getConnectedBusPortInstances();

} // Bus
