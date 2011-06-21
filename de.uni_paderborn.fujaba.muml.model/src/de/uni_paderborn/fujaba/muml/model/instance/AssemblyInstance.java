/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import de.uni_paderborn.fujaba.muml.model.component.Assembly;

import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an assembly connector at instance level.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance#getAssemblyType <em>Assembly Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getAssemblyInstance()
 * @model
 * @generated
 */
public interface AssemblyInstance extends ConnectorInstance {
	/**
	 * Returns the value of the '<em><b>Assembly Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The assembly that this assembly instance is built from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assembly Type</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getAssemblyInstance_AssemblyType()
	 * @model required="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='connectorType.oclAsType(component::Assembly)'"
	 * @generated
	 */
	Assembly getAssemblyType();

	/**
	 * Returns the value of the '<em><b>Coordination Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination pattern that defines the protocol of this assembly instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Pattern</em>' reference.
	 * @see #setCoordinationPattern(CoordinationPattern)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getAssemblyInstance_CoordinationPattern()
	 * @model required="true"
	 * @generated
	 */
	CoordinationPattern getCoordinationPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance#getCoordinationPattern <em>Coordination Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Pattern</em>' reference.
	 * @see #getCoordinationPattern()
	 * @generated
	 */
	void setCoordinationPattern(CoordinationPattern value);

} // AssemblyInstance
