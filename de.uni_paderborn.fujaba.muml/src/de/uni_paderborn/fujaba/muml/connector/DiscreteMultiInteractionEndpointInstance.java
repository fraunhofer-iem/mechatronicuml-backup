/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.connector;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Multi Interaction Endpoint Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance#getSubInteractionEndpointInstances <em>Sub Interaction Endpoint Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance#getFirst <em>First</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance#getLast <em>Last</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getDiscreteMultiInteractionEndpointInstance()
 * @model abstract="true"
 * @generated
 */
public interface DiscreteMultiInteractionEndpointInstance extends DiscreteInteractionEndpointInstance {
	/**
	 * Returns the value of the '<em><b>Sub Interaction Endpoint Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getMultiInteractionEndpointInstance <em>Multi Interaction Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all sub-interaction endpoint instances of the multi-interaction endpoint instance. The sub-interaction endpoint instances are
	 * represented by DiscreteSingleInteractionEndpointInstances. This reference may only be used if the corresponding 
	 * DiscreteInteractionEndpoint has an upper bound greater 1 in its cardinality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Interaction Endpoint Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getDiscreteMultiInteractionEndpointInstance_SubInteractionEndpointInstances()
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getMultiInteractionEndpointInstance
	 * @model opposite="multiInteractionEndpointInstance"
	 * @generated
	 */
	EList<DiscreteSingleInteractionEndpointInstance> getSubInteractionEndpointInstances();

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(DiscreteSingleInteractionEndpointInstance)
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getDiscreteMultiInteractionEndpointInstance_First()
	 * @model
	 * @generated
	 */
	DiscreteSingleInteractionEndpointInstance getFirst();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(DiscreteSingleInteractionEndpointInstance value);

	/**
	 * Returns the value of the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last</em>' reference.
	 * @see #setLast(DiscreteSingleInteractionEndpointInstance)
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getDiscreteMultiInteractionEndpointInstance_Last()
	 * @model
	 * @generated
	 */
	DiscreteSingleInteractionEndpointInstance getLast();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance#getLast <em>Last</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last</em>' reference.
	 * @see #getLast()
	 * @generated
	 */
	void setLast(DiscreteSingleInteractionEndpointInstance value);

} // DiscreteMultiInteractionEndpointInstance
