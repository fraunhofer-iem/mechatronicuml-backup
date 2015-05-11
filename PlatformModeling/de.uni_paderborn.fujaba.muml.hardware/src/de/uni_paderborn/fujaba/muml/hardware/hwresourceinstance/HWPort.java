/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationKind;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource;
import de.uni_paderborn.fujaba.muml.valuetype.Cardinality;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort#getParentResourceInstance <em>Parent Resource Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort#getCommunicationResource <em>Communication Resource</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort#isMultiHWPort <em>Multi HW Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort#getPortKind <em>Port Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage#getHWPort()
 * @model
 * @generated
 */
public interface HWPort extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parent Resource Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance#getHwports <em>Hwports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Resource Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Resource Instance</em>' container reference.
	 * @see #setParentResourceInstance(ResourceInstance)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage#getHWPort_ParentResourceInstance()
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance#getHwports
	 * @model opposite="hwports" transient="false"
	 * @generated
	 */
	ResourceInstance getParentResourceInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort#getParentResourceInstance <em>Parent Resource Instance</em>}' container reference.
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
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage#getHWPort_CommunicationResource()
	 * @model
	 * @generated
	 */
	CommunicationResource getCommunicationResource();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort#getCommunicationResource <em>Communication Resource</em>}' reference.
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
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage#getHWPort_Protocol()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if(self.communicationResource.oclIsUndefined()) then\n\tnull \nelse\n self.communicationResource.protocol\n endif'"
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
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage#getHWPort_Cardinality()
	 * @model containment="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if(self.communicationResource.oclIsUndefined()) then\n\t null\n\telse\n\t \tself.communicationResource.cardinality\n\t endif'"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort#getCardinality <em>Cardinality</em>}' containment reference.
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
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage#getHWPort_MultiHWPort()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.communicationResource.oclIsUndefined()) then\n\tfalse\nelse \n   self.communicationResource.multiHWPort\n  endif'"
	 * @generated
	 */
	boolean isMultiHWPort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort#isMultiHWPort <em>Multi HW Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi HW Port</em>' attribute.
	 * @see #isMultiHWPort()
	 * @generated
	 */
	void setMultiHWPort(boolean value);

	/**
	 * Returns the value of the '<em><b>Port Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines if this HWPort is  a bus or a link port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationKind
	 * @see #setPortKind(CommunicationKind)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage#getHWPort_PortKind()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.communicationResource.oclIsUndefined()) then\n\thwresource::CommunicationKind::DELEGATION\nelse \n   self.communicationResource.portKind\n endif'"
	 * @generated
	 */
	CommunicationKind getPortKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort#getPortKind <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationKind
	 * @see #getPortKind()
	 * @generated
	 */
	void setPortKind(CommunicationKind value);

} // HWPort
