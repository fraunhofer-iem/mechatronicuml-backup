/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Multi Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance#getSubPortInstances <em>Sub Port Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance#getAdaptationBehaviorInstance <em>Adaptation Behavior Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDiscreteMultiPortInstance()
 * @model
 * @generated
 */
public interface DiscreteMultiPortInstance extends DiscretePortInstance {
	/**
	 * Returns the value of the '<em><b>Sub Port Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Port Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Port Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDiscreteMultiPortInstance_SubPortInstances()
	 * @model
	 * @generated
	 */
	EList<DiscreteSinglePortInstance> getSubPortInstances();

	/**
	 * Returns the value of the '<em><b>Adaptation Behavior Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \todosd{ocl: implement derived}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adaptation Behavior Instance</em>' reference.
	 * @see #setAdaptationBehaviorInstance(BehaviorInstance)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDiscreteMultiPortInstance_AdaptationBehaviorInstance()
	 * @model required="true" derived="true"
	 * @generated
	 */
	BehaviorInstance getAdaptationBehaviorInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance#getAdaptationBehaviorInstance <em>Adaptation Behavior Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adaptation Behavior Instance</em>' reference.
	 * @see #getAdaptationBehaviorInstance()
	 * @generated
	 */
	void setAdaptationBehaviorInstance(BehaviorInstance value);

} // DiscreteMultiPortInstance
