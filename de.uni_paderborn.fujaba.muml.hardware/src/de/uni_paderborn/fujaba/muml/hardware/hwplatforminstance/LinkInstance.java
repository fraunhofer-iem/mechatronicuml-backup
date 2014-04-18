/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance;

import de.uni_paderborn.fujaba.muml.connector.ConnectorInstance;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a link connection. A link can only be connected to two LinkPortInstances or to one LinkPortInstance and one Bridge.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance#getConnectedHWPortInstances <em>Connected HW Port Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance#getLinkPart <em>Link Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getLinkInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Only2Connections'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL Only2Connections='self.connectorEndpointInstances->size()<=2'"
 * @generated
 */
public interface LinkInstance extends CommunicationMediaInstance, ConnectorInstance {
	/**
	 * Returns the value of the '<em><b>Connected HW Port Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connected LinkPortInstances.
	 *  They are derived from the reference connectedHWPortInstances of the super class CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected HW Port Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getLinkInstance_ConnectedHWPortInstances()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpointInstances->select(e|e.oclIsKindOf(HWPortInstance)).oclAsType(HWPortInstance)->asOrderedSet()\n'"
	 * @generated
	 */
	EList<HWPortInstance> getConnectedHWPortInstances();

	/**
	 * Returns the value of the '<em><b>Link Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Part</em>' reference.
	 * @see #setLinkPart(LinkPart)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getLinkInstance_LinkPart()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.type.oclIsUndefined()) then\n\tnull\nelse \n\tself.type.oclAsType(hwplatform::LinkPart)\nendif\n'"
	 * @generated
	 */
	LinkPart getLinkPart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance#getLinkPart <em>Link Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Part</em>' reference.
	 * @see #getLinkPart()
	 * @generated
	 */
	void setLinkPart(LinkPart value);

} // LinkInstance
