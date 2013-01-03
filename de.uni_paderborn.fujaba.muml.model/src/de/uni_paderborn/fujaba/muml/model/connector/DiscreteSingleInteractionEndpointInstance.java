/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.connector;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Single Interaction Endpoint Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.connector.DiscreteSingleInteractionEndpointInstance#getMultiInteractionEndpointInstance <em>Multi Interaction Endpoint Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage#getDiscreteSingleInteractionEndpointInstance()
 * @model abstract="true"
 * @generated
 */
public interface DiscreteSingleInteractionEndpointInstance extends DiscreteInteractionEndpointInstance {
	/**
	 * Returns the value of the '<em><b>Multi Interaction Endpoint Instance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.connector.DiscreteMultiInteractionEndpointInstance#getSubInteractionEndpointInstances <em>Sub Interaction Endpoint Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Interaction Endpoint Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Interaction Endpoint Instance</em>' reference.
	 * @see #setMultiInteractionEndpointInstance(DiscreteMultiInteractionEndpointInstance)
	 * @see de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage#getDiscreteSingleInteractionEndpointInstance_MultiInteractionEndpointInstance()
	 * @see de.uni_paderborn.fujaba.muml.model.connector.DiscreteMultiInteractionEndpointInstance#getSubInteractionEndpointInstances
	 * @model opposite="subInteractionEndpointInstances"
	 * @generated
	 */
	DiscreteMultiInteractionEndpointInstance getMultiInteractionEndpointInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.connector.DiscreteSingleInteractionEndpointInstance#getMultiInteractionEndpointInstance <em>Multi Interaction Endpoint Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Interaction Endpoint Instance</em>' reference.
	 * @see #getMultiInteractionEndpointInstance()
	 * @generated
	 */
	void setMultiInteractionEndpointInstance(DiscreteMultiInteractionEndpointInstance value);

} // DiscreteSingleInteractionEndpointInstance
