/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package org.muml.pm.hardware.hwresourceinstance;

import org.muml.mumlcore.NamedElement;
import org.muml.pim.valuetype.Cardinality;
import org.muml.pm.hardware.hwresource.CommunicationKind;
import org.muml.pm.hardware.hwresource.CommunicationProtocol;
import org.muml.pm.hardware.hwresource.CommunicationResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a hardware port of a resource instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.HWPort#getParentResourceInstance <em>Parent Resource Instance</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.HWPort#getCommunicationResource <em>Communication Resource</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.HWPort#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.HWPort#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.HWPort#isMultiHWPort <em>Multi HW Port</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.HWPort#getPortKind <em>Port Kind</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getHWPort()
 * @model
 * @generated
 */
public interface HWPort extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parent Resource Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.hardware.hwresourceinstance.ResourceInstance#getHwports <em>Hwports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Resource Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResourceInstance this hardware port belongs to.
	 * Theoretically the bound shall be 1..1. However this would prevent the reuse of this class in the platform and platforminstance model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Resource Instance</em>' container reference.
	 * @see #setParentResourceInstance(ResourceInstance)
	 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getHWPort_ParentResourceInstance()
	 * @see org.muml.pm.hardware.hwresourceinstance.ResourceInstance#getHwports
	 * @model opposite="hwports" transient="false"
	 * @generated
	 */
	ResourceInstance getParentResourceInstance();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresourceinstance.HWPort#getParentResourceInstance <em>Parent Resource Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Resource Instance</em>' container reference.
	 * @see #getParentResourceInstance()
	 * @generated
	 */
	void setParentResourceInstance(ResourceInstance value);

	/**
	 * Returns the value of the '<em><b>Communication Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Resource</em>' reference.
	 * @see #setCommunicationResource(CommunicationResource)
	 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getHWPort_CommunicationResource()
	 * @model
	 * @generated
	 */
	CommunicationResource getCommunicationResource();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresourceinstance.HWPort#getCommunicationResource <em>Communication Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Resource</em>' reference.
	 * @see #getCommunicationResource()
	 * @generated
	 */
	void setCommunicationResource(CommunicationResource value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The used protocol of this HWPortInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getHWPort_Protocol()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if(self.communicationResource.oclIsUndefined()) then\n\tif self.oclIsKindOf(hwplatform::DelegationHWPort) then\n   \t\t let endpoints : Set(connector::ConnectorEndpoint) = self.oclAsType(connector::ConnectorEndpoint)->closure(c| c.oclAsType(connector::ConnectorEndpoint).connectors.connectorEndpoints)->asOrderedSet() in\n   \t\t let buses : Bag (hwplatform::Bus) = endpoints->select(e|e.oclIsKindOf(hwplatform::Bus) and not e.oclAsType(hwplatform::Bus).protocol.oclIsUndefined()).oclAsType(hwplatform::Bus) in\n   \t\t let ports : Bag (hwplatform::HWPortPart) = endpoints->select(e|e.oclIsKindOf(hwplatform::HWPortPart) and not e.oclAsType(hwplatform::HWPortPart).hwport.protocol.oclIsUndefined()).oclAsType(hwplatform::HWPortPart) in\n  \t\tlet usedprotocols : Bag(hwresource::CommunicationProtocol) = buses.protocol->union(ports.hwport.protocol) in\n  \t\tusedprotocols->any(true)\n \telse null\n\tendif\nelse\n \tself.communicationResource.protocol\n endif'"
	 * @generated
	 */
	CommunicationProtocol getProtocol();

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cardinality of this HWPort.
	 * It determines the number of allowed hardware port instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getHWPort_Cardinality()
	 * @model containment="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if(self.communicationResource.oclIsUndefined()) then\n\t null\n\telse\n\t \tself.communicationResource.cardinality\n\t endif'"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresourceinstance.HWPort#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Multi HW Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute indicates whether this HWPort is a multi port or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi HW Port</em>' attribute.
	 * @see #setMultiHWPort(boolean)
	 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getHWPort_MultiHWPort()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.communicationResource.oclIsUndefined()) then\n\tfalse\nelse \n   self.communicationResource.multiHWPort\n  endif'"
	 * @generated
	 */
	boolean isMultiHWPort();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresourceinstance.HWPort#isMultiHWPort <em>Multi HW Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi HW Port</em>' attribute.
	 * @see #isMultiHWPort()
	 * @generated
	 */
	void setMultiHWPort(boolean value);

	/**
	 * Returns the value of the '<em><b>Port Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.pm.hardware.hwresource.CommunicationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines if this HWPort is  a bus or a link port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Kind</em>' attribute.
	 * @see org.muml.pm.hardware.hwresource.CommunicationKind
	 * @see #setPortKind(CommunicationKind)
	 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getHWPort_PortKind()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.communicationResource.oclIsUndefined()) then\n\thwresource::CommunicationKind::DELEGATION\nelse \n   self.communicationResource.portKind\n endif'"
	 * @generated
	 */
	CommunicationKind getPortKind();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresourceinstance.HWPort#getPortKind <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Kind</em>' attribute.
	 * @see org.muml.pm.hardware.hwresource.CommunicationKind
	 * @see #getPortKind()
	 * @generated
	 */
	void setPortKind(CommunicationKind value);

} // HWPort
