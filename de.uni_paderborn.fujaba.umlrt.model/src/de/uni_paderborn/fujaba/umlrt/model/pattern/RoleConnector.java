/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.pattern;

import de.uni_paderborn.fujaba.umlrt.model.component.BehavioralConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a communication channel connecting two roles of a coordination pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage#getRoleConnector()
 * @model
 * @generated
 */
public interface RoleConnector extends BehavioralConnector {
	/**
	 * Returns the value of the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute stores the direction of the channel. The direction can either be uni- or bi-direcational. This attribute should probably be renamed to bidirectional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bidirectional</em>' attribute.
	 * @see #setBidirectional(boolean)
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage#getRoleConnector_Bidirectional()
	 * @model
	 * @generated
	 */
	boolean isBidirectional();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector#isBidirectional <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bidirectional</em>' attribute.
	 * @see #isBidirectional()
	 * @generated
	 */
	void setBidirectional(boolean value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The roles connected by this channel. At the moment an arbitrary number of roles are allow. This probably should be discussed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Role)
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage#getRoleConnector_Source()
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getChannel
	 * @model opposite="channel" required="true"
	 * @generated
	 */
	Role getSource();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Role value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The roles connected by this channel. At the moment an arbitrary number of roles are allow. This probably should be discussed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Role)
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage#getRoleConnector_Target()
	 * @model required="true"
	 * @generated
	 */
	Role getTarget();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Role value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' reference.
	 * @see #setPattern(CoordinationPattern)
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage#getRoleConnector_Pattern()
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern#getConnectors
	 * @model opposite="connectors"
	 * @generated
	 */
	CoordinationPattern getPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector#getPattern <em>Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(CoordinationPattern value);

} // RoleConnector
