/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.pattern;

import de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement;

import org.eclipse.emf.common.util.EList;

import org.storydriven.modeling.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a coordination pattern. A coordination pattern specifies the coordination between a certain number of communication members. The communication members are represented by roles. To specify which roles communicate whith each other they are connected by channels. The communication protocol used by the roles is specified by realtime statecharts. Each role has its own realtime statechart describing the roles communication behavior. Furthermore channels own a realtime statechart which enables specifying properties of certain real communication channels e.g. propagation delay or buffering of messages. Furthermore constraints can be assigned to coordination patterns. Constraints specify certain properties the coordination specified by the pattern has to fullfill.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern#getRoles <em>Roles</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern#getConnectors <em>Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage#getCoordinationPattern()
 * @model
 * @generated
 */
public interface CoordinationPattern extends NamedElement, ConstrainableElement {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The roles belonging to this pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage#getCoordinationPattern_Roles()
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getPattern
	 * @model opposite="pattern"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage#getCoordinationPattern_Connectors()
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector#getPattern
	 * @model opposite="pattern"
	 * @generated
	 */
	EList<RoleConnector> getConnectors();

} // CoordinationPattern
