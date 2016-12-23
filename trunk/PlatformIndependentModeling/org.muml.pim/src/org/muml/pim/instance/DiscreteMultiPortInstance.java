/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance;
import org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.instance.DiscreteMultiPortInstance#getGmfSubPortInstances <em>Gmf Sub Port Instances</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.instance.InstancePackage#getDiscreteMultiPortInstance()
 * @model
 * @generated
 */
public interface DiscreteMultiPortInstance extends DiscretePortInstance, DiscreteMultiInteractionEndpointInstance {
	/**
	 * Returns the value of the '<em><b>Gmf Sub Port Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference just derives the values of "subPortInstances" and specifies a containment. This containment reference is needed by the GMF tooling.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gmf Sub Port Instances</em>' containment reference list.
	 * @see org.muml.pim.instance.InstancePackage#getDiscreteMultiPortInstance_GmfSubPortInstances()
	 * @model containment="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.subInteractionEndpointInstances'"
	 * @generated
	 */
	EList<DiscreteSingleInteractionEndpointInstance> getGmfSubPortInstances();

} // DiscreteMultiPortInstance
