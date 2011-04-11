/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component;

import de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.umlrt.model.pattern.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Port Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a concrete port specification which provides the discrete functionality of a port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification#getRefines <em>Refines</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getDiscretePortSpecification()
 * @model
 * @generated
 */
public interface DiscretePortSpecification extends PortSpecification, BehavioralElement {

	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port role this port is a realization of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refines</em>' reference.
	 * @see #setRefines(Role)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getDiscretePortSpecification_Refines()
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getPort
	 * @model opposite="port"
	 * @generated
	 */
	Role getRefines();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification#getRefines <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' reference.
	 * @see #getRefines()
	 * @generated
	 */
	void setRefines(Role value);
} // DiscretePortSpecification
