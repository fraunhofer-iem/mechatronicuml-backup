/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import de.uni_paderborn.fujaba.muml.model.core.Behavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an abstract super class for all instances of behaviors. In MechatronicUML,
 * we use instances of behaviors because, e.g., the behavior of a multi-port is 
 * instantiated multiple times. Then, all instances may specify an own assignment
 * of initial values to the attributes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.BehaviorInstance#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.BehaviorInstance#getBehavioralElementInstance <em>Behavioral Element Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.BehaviorInstance#getAttributeBindings <em>Attribute Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getBehaviorInstance()
 * @model abstract="true"
 * @generated
 */
public interface BehaviorInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behavior which is instantiated here. For each behavior, multiple instance
	 * may be created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getBehaviorInstance_Behavior()
	 * @model required="true"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.BehaviorInstance#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Behavioral Element Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.instance.BehavioralElementInstance#getBehaviorInstance <em>Behavior Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference points to the behavioral element instance that this behavior 
	 * instance belongs to. Each behavior instance belongs to exactly one behavioral
	 * element instance and defines its behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavioral Element Instance</em>' container reference.
	 * @see #setBehavioralElementInstance(BehavioralElementInstance)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getBehaviorInstance_BehavioralElementInstance()
	 * @see de.uni_paderborn.fujaba.muml.model.instance.BehavioralElementInstance#getBehaviorInstance
	 * @model opposite="behaviorInstance" required="true" transient="false"
	 * @generated
	 */
	BehavioralElementInstance getBehavioralElementInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.BehaviorInstance#getBehavioralElementInstance <em>Behavioral Element Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavioral Element Instance</em>' container reference.
	 * @see #getBehavioralElementInstance()
	 * @generated
	 */
	void setBehavioralElementInstance(BehavioralElementInstance value);

	/**
	 * Returns the value of the '<em><b>Attribute Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.AttributeBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attributes bindings define an assignment of initial values to the attributes
	 * of the behavior of this behavior instance. There may only be one attribute 
	 * binding for each attribute of the respective behavior, but there may be no 
	 * attribute binding for an attribute which is not contained in the behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Bindings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getBehaviorInstance_AttributeBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeBinding> getAttributeBindings();

} // BehaviorInstance
