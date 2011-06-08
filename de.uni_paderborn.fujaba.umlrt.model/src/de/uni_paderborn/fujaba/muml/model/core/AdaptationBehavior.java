/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.core;

import de.uni_paderborn.fujaba.muml.model.component.DiscretePortSpecification;

import de.uni_paderborn.fujaba.muml.model.pattern.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptation Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The adaptation behavior is needed, if the role is a multi-role or the port is a multi-port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.AdaptationBehavior#getRole <em>Role</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.AdaptationBehavior#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getAdaptationBehavior()
 * @model
 * @generated
 */
public interface AdaptationBehavior extends BehavioralElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getAdaptationBehavior <em>Adaptation Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role this adaptation behavior is assigned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' container reference.
	 * @see #setRole(Role)
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getAdaptationBehavior_Role()
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#getAdaptationBehavior
	 * @model opposite="adaptationBehavior" transient="false"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.AdaptationBehavior#getRole <em>Role</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' container reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.DiscretePortSpecification#getAdaptationBehavior <em>Adaptation Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference.
	 * @see #setPort(DiscretePortSpecification)
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getAdaptationBehavior_Port()
	 * @see de.uni_paderborn.fujaba.muml.model.component.DiscretePortSpecification#getAdaptationBehavior
	 * @model opposite="adaptationBehavior" containment="true"
	 * @generated
	 */
	DiscretePortSpecification getPort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.core.AdaptationBehavior#getPort <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' containment reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(DiscretePortSpecification value);

} // AdaptationBehavior
