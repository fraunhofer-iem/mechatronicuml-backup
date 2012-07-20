/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import de.uni_paderborn.fujaba.muml.model.component.Assembly;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an assembly connector at instance level.
 * 
 * \todosd{Why does the AssemblyInstance has a lower and upper bound for the propagation delay and the Assembly not?}
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance#getAssemblyType <em>Assembly Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance#getPropagationDelayLowerBound <em>Propagation Delay Lower Bound</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance#getPropagationDelayUpperBound <em>Propagation Delay Upper Bound</em>}</li>
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
	 * @model changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='connectorType.oclAsType(component::Assembly)'"
	 * @generated
	 */
	Assembly getAssemblyType();

	/**
	 * Returns the value of the '<em><b>Propagation Delay Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagation Delay Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower bound of the propagation delay of this assembly instance. 
	 * The propagation delay defines how long a message needs from its sender to
	 * its receiver port instance.
	 * 
	 * \todosd{I suggest to change the type from EInt to NaturalNumber.}
	 * \todosd{Is propagation delay the correct term? MUML-Spec 0.2 on page 15 also name it like this, but message delay would also be a good name.}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Propagation Delay Lower Bound</em>' attribute.
	 * @see #setPropagationDelayLowerBound(int)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getAssemblyInstance_PropagationDelayLowerBound()
	 * @model default="0"
	 * @generated
	 */
	int getPropagationDelayLowerBound();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance#getPropagationDelayLowerBound <em>Propagation Delay Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagation Delay Lower Bound</em>' attribute.
	 * @see #getPropagationDelayLowerBound()
	 * @generated
	 */
	void setPropagationDelayLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Propagation Delay Upper Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagation Delay Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper bound of the propagation delay of this assembly instance. 
	 * The propagation delay defines how long a message needs from its sender to
	 * its receiver port instance.
	 * 
	 * \todosd{I suggest to change the type from EInt to NaturalNumber.}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Propagation Delay Upper Bound</em>' attribute.
	 * @see #setPropagationDelayUpperBound(int)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getAssemblyInstance_PropagationDelayUpperBound()
	 * @model default="0"
	 * @generated
	 */
	int getPropagationDelayUpperBound();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance#getPropagationDelayUpperBound <em>Propagation Delay Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagation Delay Upper Bound</em>' attribute.
	 * @see #getPropagationDelayUpperBound()
	 * @generated
	 */
	void setPropagationDelayUpperBound(int value);

} // AssemblyInstance
