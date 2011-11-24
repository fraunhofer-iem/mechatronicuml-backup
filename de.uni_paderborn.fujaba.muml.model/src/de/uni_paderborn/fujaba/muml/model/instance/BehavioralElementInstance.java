/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Element Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an abstract super class for all instances of behavioral elements. The 
 * behavioral element instance contains the instances of all its behaviors.
 * 
 * In case of a DiscreteMultiPortInstance, this reference contains the statechart
 * for the multi-role as well as the adaptation statechart. In case of a 
 * ComponentInstance, this reference contains the component statechart instance
 * as well as all synchronization statechart instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.BehavioralElementInstance#getBehavioralElementType <em>Behavioral Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getBehavioralElementInstance()
 * @model abstract="true"
 * @generated
 */
public interface BehavioralElementInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Behavioral Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BehavioralElement which is instantiated by this BehavioralElementInstance.
	 * There may be multiple instances for the same BehavioralElement in one model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavioral Element Type</em>' reference.
	 * @see #setBehavioralElementType(BehavioralElement)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getBehavioralElementInstance_BehavioralElementType()
	 * @model required="true"
	 * @generated
	 */
	BehavioralElement getBehavioralElementType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.BehavioralElementInstance#getBehavioralElementType <em>Behavioral Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavioral Element Type</em>' reference.
	 * @see #getBehavioralElementType()
	 * @generated
	 */
	void setBehavioralElementType(BehavioralElement value);

} // BehavioralElementInstance
