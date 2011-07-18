/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.pattern;

import org.eclipse.emf.common.util.EList;
import org.storydriven.modeling.NamedElement;

import de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A coordination protocol specifies the coordination between a certain number of communication members. The communication members are represented by roles. To specify which roles communicate whith each other they are connected by channels. The communication protocol used by the roles is specified by realtime statecharts. Each role has its own realtime statechart describing the roles communication behavior. Furthermore channels own a realtime statechart which enables specifying properties of certain real communication channels e.g. propagation delay or buffering of messages. Furthermore constraints can be assigned to coordination patterns. Constraints specify certain properties the coordination specified by the pattern has to fullfill.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getRoles <em>Roles</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getRole1 <em>Role1</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getRole2 <em>Role2</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getCoordinationPattern()
 * @model
 * @generated
 */
public interface CoordinationPattern extends NamedElement, ConstrainableElement {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.pattern.Role}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getCoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The roles belonging to this pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getCoordinationPattern_Roles()
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#getCoordinationPattern
	 * @model opposite="coordinationPattern" containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getCoordinationPattern <em>Coordination Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each coordination pattern has exactly one role connector.
	 * Cardinality is 1 because there exists no useful pattern wir more than two roles. If a useful pattern exists with more than 2 roles, than change cardinality to 1..*
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference.
	 * @see #setConnectors(RoleConnector)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getCoordinationPattern_Connectors()
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getCoordinationPattern
	 * @model opposite="coordinationPattern" containment="true" required="true"
	 * @generated
	 */
	RoleConnector getConnectors();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getConnectors <em>Connectors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectors</em>' containment reference.
	 * @see #getConnectors()
	 * @generated
	 */
	void setConnectors(RoleConnector value);

	/**
	 * Returns the value of the '<em><b>Role1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role1</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getCoordinationPattern_Role1()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if roles->isEmpty() then\r\n\tnull\r\nelse\r\n\troles->first()\r\nendif'"
	 * @generated
	 */
	Role getRole1();

	/**
	 * Returns the value of the '<em><b>Role2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role2</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getCoordinationPattern_Role2()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if roles->size() < 2 then\r\n\tnull\r\nelse\r\n\troles->last()\r\nendif'"
	 * @generated
	 */
	Role getRole2();

} // CoordinationPattern
