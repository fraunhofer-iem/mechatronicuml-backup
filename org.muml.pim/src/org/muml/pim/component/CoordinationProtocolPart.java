/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component;

import org.eclipse.emf.common.util.EList;
import org.muml.core.CommentableElement;
import org.muml.pim.protocol.CoordinationProtocol;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.component.CoordinationProtocolPart#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 *   <li>{@link org.muml.pim.component.CoordinationProtocolPart#getPortParts <em>Port Parts</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.component.ComponentPackage#getCoordinationProtocolPart()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyDiscretePortParts'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OnlyDiscretePortParts='-- Coordination Protocol Part must only have discrete Port Parts\r\nnot self.portParts-&gt;oclIsUndefined()\r\nimplies\r\nself.portParts-&gt;forAll(p : PortPart | p.portType.oclIsKindOf(DiscretePort))'"
 * @generated
 */
public interface CoordinationProtocolPart extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Coordination Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination protocol (pattern) of this CoordinationProtocolPart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol</em>' reference.
	 * @see #setCoordinationProtocol(CoordinationProtocol)
	 * @see org.muml.pim.component.ComponentPackage#getCoordinationProtocolPart_CoordinationProtocol()
	 * @model required="true"
	 * @generated
	 */
	CoordinationProtocol getCoordinationProtocol();

	/**
	 * Sets the value of the '{@link org.muml.pim.component.CoordinationProtocolPart#getCoordinationProtocol <em>Coordination Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Protocol</em>' reference.
	 * @see #getCoordinationProtocol()
	 * @generated
	 */
	void setCoordinationProtocol(CoordinationProtocol value);

	/**
	 * Returns the value of the '<em><b>Port Parts</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.component.PortPart}.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.component.PortPart#getCoordinationProtocolPart <em>Coordination Protocol Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The discrete port parts that take part in this protocol part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Parts</em>' reference list.
	 * @see org.muml.pim.component.ComponentPackage#getCoordinationProtocolPart_PortParts()
	 * @see org.muml.pim.component.PortPart#getCoordinationProtocolPart
	 * @model opposite="coordinationProtocolPart" lower="2"
	 * @generated
	 */
	EList<PortPart> getPortParts();

} // CoordinationProtocolPart
