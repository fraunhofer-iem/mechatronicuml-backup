/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance;

import de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance;


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
 *
 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getDiscreteSinglePortInstance()
 * @model
 * @generated
 */
public interface DiscreteSinglePortInstance extends DiscretePortInstance, DiscreteSingleInteractionEndpointInstance {
} // DiscreteSinglePortInstance
