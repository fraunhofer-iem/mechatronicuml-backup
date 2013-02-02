/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;

import de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Protocol Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A coordination protocol (pattern) can occur within a structured component. It defines the communication behavior of an assembly connection that connects discrete ports with each other.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.CoordinationProtocolOccurrence#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.CoordinationProtocolOccurrence#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getCoordinationProtocolOccurrence()
 * @model
 * @generated
 */
public interface CoordinationProtocolOccurrence extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Coordination Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination protocol (pattern) of this PatternOccurence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol</em>' reference.
	 * @see #setCoordinationProtocol(CoordinationProtocol)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getCoordinationProtocolOccurrence_CoordinationProtocol()
	 * @model required="true"
	 * @generated
	 */
	CoordinationProtocol getCoordinationProtocol();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.CoordinationProtocolOccurrence#getCoordinationProtocol <em>Coordination Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Protocol</em>' reference.
	 * @see #getCoordinationProtocol()
	 * @generated
	 */
	void setCoordinationProtocol(CoordinationProtocol value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ports that take part in this protocol.
	 * 
	 * \todosd{I suggest to change this reference so that it references a DiscretePort.}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getCoordinationProtocolOccurrence_Ports()
	 * @model required="true"
	 * @generated
	 */
	EList<Port> getPorts();

} // CoordinationProtocolOccurrence
