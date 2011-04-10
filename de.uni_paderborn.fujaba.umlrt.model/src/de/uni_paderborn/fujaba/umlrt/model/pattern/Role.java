/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.storydriven.modeling.NamedElement;

import de.uni_paderborn.fujaba.umlrt.model.component.Port;
import de.uni_paderborn.fujaba.umlrt.model.core.Cardinality;
import de.uni_paderborn.fujaba.umlrt.model.core.ConstrainableElement;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Statechart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a role of a coordination pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getChannel <em>Channel</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getPattern <em>Pattern</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getEClass <em>EClass</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getRequired <em>Required</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getProvided <em>Provided</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends NamedElement, ConstrainableElement {
	/**
	 * Returns the value of the '<em><b>Channel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The channel which connects this role with another role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel</em>' reference.
	 * @see #setChannel(RoleConnector)
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage#getRole_Channel()
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector#getSource
	 * @model opposite="source"
	 * @generated
	 */
	RoleConnector getChannel();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getChannel <em>Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' reference.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(RoleConnector value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination pattern this role belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern</em>' reference.
	 * @see #setPattern(CoordinationPattern)
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage#getRole_Pattern()
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	CoordinationPattern getPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getPattern <em>Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(CoordinationPattern value);

	/**
	 * Returns the value of the '<em><b>UML Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The realtime statechart describing the communication behavior of this role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UML Realtime Statechart</em>' reference.
	 * @see #setUMLRealtimeStatechart(Statechart)
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage#getRole_UMLRealtimeStatechart()
	 * @model
	 * @generated
	 */
	Statechart getUMLRealtimeStatechart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Realtime Statechart</em>' reference.
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	void setUMLRealtimeStatechart(Statechart value);

	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class of this port role storing attributes and methods local to the role. Attributes can be manipulated and methods can be invoked by the realtime statechart of this role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage#getRole_EClass()
	 * @model
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' reference.
	 * @see #setRequired(MessageInterface)
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage#getRole_Required()
	 * @model
	 * @generated
	 */
	MessageInterface getRequired();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getRequired <em>Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(MessageInterface value);

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' reference.
	 * @see #setProvided(MessageInterface)
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage#getRole_Provided()
	 * @model
	 * @generated
	 */
	MessageInterface getProvided();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getProvided <em>Provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided</em>' reference.
	 * @see #getProvided()
	 * @generated
	 */
	void setProvided(MessageInterface value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' reference.
	 * @see #setCardinality(Cardinality)
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage#getRole_Cardinality()
	 * @model required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.pattern.Role#getCardinality <em>Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.component.Port}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage#getRole_Port()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.Port#getRefines
	 * @model opposite="refines"
	 * @generated
	 */
	EList<Port> getPort();

} // Role
