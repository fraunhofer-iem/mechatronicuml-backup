/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.pattern;

import de.uni_paderborn.fujaba.muml.model.component.BehavioralConnector;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRoleConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyRolesOfSameCoordinationPattern'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OnlyRolesOfSameCoordinationPattern='(not source.oclIsUndefined() and not target.oclIsUndefined()) implies source.coordinationPattern = target.coordinationPattern'"
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRoleConnector_Bidirectional()
	 * @model
	 * @generated
	 */
	boolean isBidirectional();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#isBidirectional <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bidirectional</em>' attribute.
	 * @see #isBidirectional()
	 * @generated
	 */
	void setBidirectional(boolean value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getRoleConnector <em>Role Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The roles connected by this channel. At the moment an arbitrary number of roles are allow. This probably should be discussed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Role)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRoleConnector_Source()
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#getRoleConnector
	 * @model opposite="roleConnector" required="true"
	 * @generated
	 */
	Role getSource();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getSource <em>Source</em>}' reference.
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRoleConnector_Target()
	 * @model required="true"
	 * @generated
	 */
	Role getTarget();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Role value);

	/**
	 * Returns the value of the '<em><b>Coordination Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination pattern this role connector is part of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Pattern</em>' container reference.
	 * @see #setCoordinationPattern(CoordinationPattern)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getRoleConnector_CoordinationPattern()
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern#getConnector
	 * @model opposite="connector" required="true" transient="false"
	 * @generated
	 */
	CoordinationPattern getCoordinationPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector#getCoordinationPattern <em>Coordination Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Pattern</em>' container reference.
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	void setCoordinationPattern(CoordinationPattern value);

} // RoleConnector
