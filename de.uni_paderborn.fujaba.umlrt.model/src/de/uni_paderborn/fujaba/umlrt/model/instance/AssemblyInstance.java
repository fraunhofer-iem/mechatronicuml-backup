/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.instance;

import de.uni_paderborn.fujaba.umlrt.model.component.Assembly;

import de.uni_paderborn.fujaba.umlrt.model.pattern.CoordinationPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance#getAssemblyType <em>Assembly Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getAssemblyInstance()
 * @model
 * @generated
 */
public interface AssemblyInstance extends ConnectorInstance {
	/**
	 * Returns the value of the '<em><b>Assembly Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Type</em>' reference.
	 * @see #setAssemblyType(Assembly)
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getAssemblyInstance_AssemblyType()
	 * @model required="true"
	 * @generated
	 */
	Assembly getAssemblyType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance#getAssemblyType <em>Assembly Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Type</em>' reference.
	 * @see #getAssemblyType()
	 * @generated
	 */
	void setAssemblyType(Assembly value);

	/**
	 * Returns the value of the '<em><b>Coordination Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordination Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordination Pattern</em>' reference.
	 * @see #setCoordinationPattern(CoordinationPattern)
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getAssemblyInstance_CoordinationPattern()
	 * @model required="true"
	 * @generated
	 */
	CoordinationPattern getCoordinationPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.AssemblyInstance#getCoordinationPattern <em>Coordination Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Pattern</em>' reference.
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	void setCoordinationPattern(CoordinationPattern value);

} // AssemblyInstance
