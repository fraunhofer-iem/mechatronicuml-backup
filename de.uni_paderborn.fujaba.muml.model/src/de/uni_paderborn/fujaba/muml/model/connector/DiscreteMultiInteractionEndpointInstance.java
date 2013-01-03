/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.connector;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Multi Interaction Endpoint Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.connector.DiscreteMultiInteractionEndpointInstance#getSubInteractionEndpointInstances <em>Sub Interaction Endpoint Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage#getDiscreteMultiInteractionEndpointInstance()
 * @model abstract="true"
 * @generated
 */
public interface DiscreteMultiInteractionEndpointInstance extends DiscreteInteractionEndpointInstance {
	/**
	 * Returns the value of the '<em><b>Sub Interaction Endpoint Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.connector.DiscreteSingleInteractionEndpointInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.connector.DiscreteSingleInteractionEndpointInstance#getMultiInteractionEndpointInstance <em>Multi Interaction Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all sub-interaction endpoint instances of the multi-interaction endpoint instance. The sub-interaction endpoint instances are
	 * represented by DiscreteSingleInteractionEndpointInstances. This reference may only be used if the corresponding 
	 * DiscreteInteractionEndpoint has an upper bound greater 1 in its cardinality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Interaction Endpoint Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage#getDiscreteMultiInteractionEndpointInstance_SubInteractionEndpointInstances()
	 * @see de.uni_paderborn.fujaba.muml.model.connector.DiscreteSingleInteractionEndpointInstance#getMultiInteractionEndpointInstance
	 * @model opposite="multiInteractionEndpointInstance"
	 * @generated
	 */
	EList<DiscreteSingleInteractionEndpointInstance> getSubInteractionEndpointInstances();

} // DiscreteMultiInteractionEndpointInstance
