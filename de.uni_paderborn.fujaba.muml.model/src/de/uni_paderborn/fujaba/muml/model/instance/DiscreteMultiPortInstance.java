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
 * <!-- begin-model-doc -->
 * This class represents a multi-port at instance level. For each multi-port of a
 * component, there exists exactly one multi-port instance in the respective component 
 * instance at all times. That instance references an instance of the statechart of the
 * multi-port as well as an instance of the adaptation behavior. The DiscreteMultiPortInstance
 * also references all sub-port instances of the multi-port instance. The DiscreteMultiPortInstance
 * has no visual representation in the concrete syntax. It is represented by its sub-roles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance#getSubPortInstances <em>Sub Port Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance#getGmfSubPortInstances <em>Gmf Sub Port Instances</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance#getMultiPortInstance <em>Multi Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Port Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all sub-port instances of the multi-port. The sub-port instances are
	 * represented by DiscreteSinglePortsInstances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Port Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDiscreteMultiPortInstance_SubPortInstances()
	 * @see de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance#getMultiPortInstance
	 * @model opposite="multiPortInstance"
	 * @generated
	 */
	EList<DiscreteSinglePortInstance> getSubPortInstances();

	/**
	 * Returns the value of the '<em><b>Gmf Sub Port Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference just derives the values of "subPortInstances" and specifies a containment. This containment reference is needed by the GMF tooling.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gmf Sub Port Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDiscreteMultiPortInstance_GmfSubPortInstances()
	 * @model containment="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.subPortInstances'"
	 * @generated
	 */
	EList<DiscreteSinglePortInstance> getGmfSubPortInstances();

} // DiscreteMultiPortInstance
