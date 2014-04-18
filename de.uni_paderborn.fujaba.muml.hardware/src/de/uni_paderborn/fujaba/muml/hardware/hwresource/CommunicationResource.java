/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource;

import de.uni_paderborn.fujaba.muml.valuetype.Cardinality;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents all resources which are able to transmit data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource#getPortKind <em>Port Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource#isMultiHWPort <em>Multi HW Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage#getCommunicationResource()
 * @model
 * @generated
 */
public interface CommunicationResource extends HWPort {
	/**
	 * Returns the value of the '<em><b>Port Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines if this HWPort is  a bus or a link port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind
	 * @see #setPortKind(HWPortKind)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage#getCommunicationResource_PortKind()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.protocol.oclIsUndefined()) then\n\tnull\nelse if (self.protocol.oclIsKindOf(hwresource::BusProtocol)) then\n\t\thwresource::HWPortKind::BUS\nelse\n\t\thwresource::HWPortKind::LINK\nendif endif'"
	 * @generated
	 */
	HWPortKind getPortKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource#getPortKind <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind
	 * @see #getPortKind()
	 * @generated
	 */
	void setPortKind(HWPortKind value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CommunicationProtocol this HWPort uses to transmit data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see #setProtocol(CommunicationProtocol)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage#getCommunicationResource_Protocol()
	 * @model required="true"
	 * @generated
	 */
	CommunicationProtocol getProtocol();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource#getProtocol <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(CommunicationProtocol value);

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
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage#getCommunicationResource_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource#getCardinality <em>Cardinality</em>}' containment reference.
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
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage#getCommunicationResource_MultiHWPort()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.cardinality.oclIsUndefined()) then false else self.cardinality.upperBound.value>1 endif\n'"
	 * @generated
	 */
	boolean isMultiHWPort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource#isMultiHWPort <em>Multi HW Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi HW Port</em>' attribute.
	 * @see #isMultiHWPort()
	 * @generated
	 */
	void setMultiHWPort(boolean value);

} // CommunicationResource
