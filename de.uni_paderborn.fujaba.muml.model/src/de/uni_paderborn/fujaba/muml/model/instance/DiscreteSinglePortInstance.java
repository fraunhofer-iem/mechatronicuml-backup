/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Single Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a discrete single port at instance level as well as a sub-port instance
 * of a multi-port instance. Each single port instance references its behavior instance.
 * When used as a sub-port instance, the instance references its role behavior instance. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance#getMultiPortInstance <em>Multi Port Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDiscreteSinglePortInstance()
 * @model
 * @generated
 */
public interface DiscreteSinglePortInstance extends DiscretePortInstance {

	/**
	 * Returns the value of the '<em><b>Multi Port Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance#getSubPortInstances <em>Sub Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Port Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Port Instance</em>' container reference.
	 * @see #setMultiPortInstance(DiscreteMultiPortInstance)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDiscreteSinglePortInstance_MultiPortInstance()
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance#getSubPortInstances
	 * @model opposite="subPortInstances" transient="false"
	 * @generated
	 */
	DiscreteMultiPortInstance getMultiPortInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance#getMultiPortInstance <em>Multi Port Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Port Instance</em>' container reference.
	 * @see #getMultiPortInstance()
	 * @generated
	 */
	void setMultiPortInstance(DiscreteMultiPortInstance value);
} // DiscreteSinglePortInstance
