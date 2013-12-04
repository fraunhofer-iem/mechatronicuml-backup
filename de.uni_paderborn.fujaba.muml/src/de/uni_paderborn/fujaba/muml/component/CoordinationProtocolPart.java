/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;

import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Protocol Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A coordination protocol (pattern) can occur within a structured component. It defines the communication behavior of an assembly connection that connects discrete ports with each other.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.CoordinationProtocolPart#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.CoordinationProtocolPart#getPortParts <em>Port Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getCoordinationProtocolPart()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyDiscretePortParts'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OnlyDiscretePortParts='not self.portParts->oclIsUndefined()\r\nimplies\r\nself.portParts->forAll(p : PortPart | p.portType.oclIsKindOf(DiscretePort))'"
 * @generated
 */
public interface CoordinationProtocolPart extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Coordination Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination protocol (pattern) of this CoordinationProtocolOccurence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol</em>' reference.
	 * @see #setCoordinationProtocol(CoordinationProtocol)
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getCoordinationProtocolPart_CoordinationProtocol()
	 * @model required="true"
	 * @generated
	 */
	CoordinationProtocol getCoordinationProtocol();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.component.CoordinationProtocolPart#getCoordinationProtocol <em>Coordination Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Protocol</em>' reference.
	 * @see #getCoordinationProtocol()
	 * @generated
	 */
	void setCoordinationProtocol(CoordinationProtocol value);

	/**
	 * Returns the value of the '<em><b>Port Parts</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.component.PortPart}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.component.PortPart#getCoordinationProtocolPart <em>Coordination Protocol Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The discrete port parts that take part in this protocol occurence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Parts</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getCoordinationProtocolPart_PortParts()
	 * @see de.uni_paderborn.fujaba.muml.component.PortPart#getCoordinationProtocolPart
	 * @model opposite="coordinationProtocolPart" lower="2"
	 * @generated
	 */
	EList<PortPart> getPortParts();

} // CoordinationProtocolPart
