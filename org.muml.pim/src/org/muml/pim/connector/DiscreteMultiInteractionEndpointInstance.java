/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.connector;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Multi Interaction Endpoint Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A discrete interaction endpoint instance that comprises multiple single sub-instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance#getSubInteractionEndpointInstances <em>Sub Interaction Endpoint Instances</em>}</li>
 *   <li>{@link org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance#getFirst <em>First</em>}</li>
 *   <li>{@link org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance#getLast <em>Last</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteMultiInteractionEndpointInstance()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL TypeIsMultiDiscreteInteractionEndpoint='-- For a DiscreteMultiInteractionEndpointInstance the type has to be a multi DiscreteInteractionEndpoint, too.\r\n(not self.type.oclIsUndefined() and self.type.oclIsKindOf(connector::DiscreteInteractionEndpoint)) implies (self.type.oclAsType(connector::DiscreteInteractionEndpoint).multi)\r\n-- adann' NumberOfsubEndpointsCorrespondsToLowerBound='-- The number of subInteractionEndpointInstances is too low with respect to the cardinality\r\nlet discreteEndpoint : connector::DiscreteInteractionEndpoint= if (self.type.oclIsUndefined() or (not self.type.oclIsKindOf(connector::DiscreteInteractionEndpoint))) then null else self.type.oclAsType(connector::DiscreteInteractionEndpoint) endif in\r\nlet lowerBoundOfsubInteractionEndpointInstance : Integer = if ( discreteEndpoint.oclIsUndefined() or discreteEndpoint.cardinality.lowerBound.infinity) then -1 else discreteEndpoint.cardinality.lowerBound.value endif in\r\nif (lowerBoundOfsubInteractionEndpointInstance <>-1) then self.subInteractionEndpointInstances->size()>=lowerBoundOfsubInteractionEndpointInstance else true endif\r\n-- adann ticket:937' NumberOfsubEndpointsCorrespondsToUpperBound='-- The number of subInteractionEndpointInstances is too high with respect to the cardinality\r\nlet discreteEndpoint : connector::DiscreteInteractionEndpoint= if (self.type.oclIsUndefined() or (not self.type.oclIsKindOf(connector::DiscreteInteractionEndpoint))) then null else self.type.oclAsType(connector::DiscreteInteractionEndpoint) endif in\r\nlet upperBoundOfsubInteractionEndpointInstance : Integer = if ( discreteEndpoint.oclIsUndefined() or discreteEndpoint.cardinality.upperBound.infinity) then -1 else discreteEndpoint.cardinality.upperBound.value endif in\r\nif (upperBoundOfsubInteractionEndpointInstance <>-1) then self.subInteractionEndpointInstances->size()<=upperBoundOfsubInteractionEndpointInstance else true endif\r\n-- adann  ticket:937'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TypeIsMultiDiscreteInteractionEndpoint NumberOfsubEndpointsCorrespondsToLowerBound NumberOfsubEndpointsCorrespondsToUpperBound'"
 * @generated
 */
public interface DiscreteMultiInteractionEndpointInstance extends DiscreteInteractionEndpointInstance {
	/**
	 * Returns the value of the '<em><b>Sub Interaction Endpoint Instances</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance}.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getMultiInteractionEndpointInstance <em>Multi Interaction Endpoint Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all sub-interaction endpoint instances of the multi-interaction endpoint instance. The sub-interaction endpoint instances are
	 * represented by DiscreteSingleInteractionEndpointInstances. This reference may only be used if the corresponding 
	 * DiscreteInteractionEndpoint has an upper bound greater 1 in its cardinality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Interaction Endpoint Instances</em>' reference list.
	 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteMultiInteractionEndpointInstance_SubInteractionEndpointInstances()
	 * @see org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getMultiInteractionEndpointInstance
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
	 * <!-- begin-model-doc -->
	 * Refers to the first single instance of the corresponding multi discrete interaction endpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(DiscreteSingleInteractionEndpointInstance)
	 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteMultiInteractionEndpointInstance_First()
	 * @model
	 * @generated
	 */
	DiscreteSingleInteractionEndpointInstance getFirst();

	/**
	 * Sets the value of the '{@link org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance#getFirst <em>First</em>}' reference.
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
	 * <!-- begin-model-doc -->
	 * Refers to the last single instance of the corresponding multi discrete interaction endpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last</em>' reference.
	 * @see #setLast(DiscreteSingleInteractionEndpointInstance)
	 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteMultiInteractionEndpointInstance_Last()
	 * @model
	 * @generated
	 */
	DiscreteSingleInteractionEndpointInstance getLast();

	/**
	 * Sets the value of the '{@link org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance#getLast <em>Last</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last</em>' reference.
	 * @see #getLast()
	 * @generated
	 */
	void setLast(DiscreteSingleInteractionEndpointInstance value);

} // DiscreteMultiInteractionEndpointInstance
