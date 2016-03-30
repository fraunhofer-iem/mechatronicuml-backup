/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.connector;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Single Interaction Endpoint Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single instance of a discrete interaction endpoint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getMultiInteractionEndpointInstance <em>Multi Interaction Endpoint Instance</em>}</li>
 *   <li>{@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getNext <em>Next</em>}</li>
 *   <li>{@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getFirst <em>First</em>}</li>
 *   <li>{@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getLast <em>Last</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteSingleInteractionEndpointInstance()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL StandaloneSingleEndpointInstanceRequiresSingleEndpointType='-- For a DiscreteSingleInteractionEndpointInstance the type has to be a single DiscreteInteractionEndpoint, too.\n(not self.type.oclIsUndefined() and self.multiInteractionEndpointInstance.oclIsUndefined() and self.type.oclIsKindOf(connector::DiscreteInteractionEndpoint)) implies (not self.type.oclAsType(connector::DiscreteInteractionEndpoint).multi)\n-- adann'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='StandaloneSingleEndpointInstanceRequiresSingleEndpointType'"
 * @generated
 */
public interface DiscreteSingleInteractionEndpointInstance extends DiscreteInteractionEndpointInstance {
	/**
	 * Returns the value of the '<em><b>Multi Interaction Endpoint Instance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance#getSubInteractionEndpointInstances <em>Sub Interaction Endpoint Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Interaction Endpoint Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this is an instance of a multi discrete interaction endpoint, refers to the corresponding multi instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Interaction Endpoint Instance</em>' reference.
	 * @see #setMultiInteractionEndpointInstance(DiscreteMultiInteractionEndpointInstance)
	 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteSingleInteractionEndpointInstance_MultiInteractionEndpointInstance()
	 * @see org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance#getSubInteractionEndpointInstances
	 * @model opposite="subInteractionEndpointInstances"
	 * @generated
	 */
	DiscreteMultiInteractionEndpointInstance getMultiInteractionEndpointInstance();

	/**
	 * Sets the value of the '{@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getMultiInteractionEndpointInstance <em>Multi Interaction Endpoint Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Interaction Endpoint Instance</em>' reference.
	 * @see #getMultiInteractionEndpointInstance()
	 * @generated
	 */
	void setMultiInteractionEndpointInstance(DiscreteMultiInteractionEndpointInstance value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this is an instance of a multi discrete interaction endpoint, refers to the next single instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(DiscreteSingleInteractionEndpointInstance)
	 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteSingleInteractionEndpointInstance_Next()
	 * @see org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	DiscreteSingleInteractionEndpointInstance getNext();

	/**
	 * Sets the value of the '{@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(DiscreteSingleInteractionEndpointInstance value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this is an instance of a multi discrete interaction endpoint, refers to the previous single instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(DiscreteSingleInteractionEndpointInstance)
	 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteSingleInteractionEndpointInstance_Previous()
	 * @see org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getNext
	 * @model opposite="next"
	 * @generated
	 */
	DiscreteSingleInteractionEndpointInstance getPrevious();

	/**
	 * Sets the value of the '{@link org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(DiscreteSingleInteractionEndpointInstance value);

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this DiscreteInteractionEndpointInstance is used as a subInteractionEndpointInstance of a DiscreteMultiInteractionEndpointInstance,
	 * then this derived reference allows to resolve the first subInteractionEndpointInstance directly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteSingleInteractionEndpointInstance_First()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.multiInteractionEndpointInstance.oclIsUndefined() then null else self.multiInteractionEndpointInstance.first endif'"
	 * @generated
	 */
	DiscreteSingleInteractionEndpointInstance getFirst();

	/**
	 * Returns the value of the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this DiscreteInteractionEndpointInstance is used as a subInteractionEndpointInstance of a DiscreteMultiInteractionEndpointInstance,
	 * then this derived reference allows to resolve the last subInteractionEndpointInstance directly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last</em>' reference.
	 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteSingleInteractionEndpointInstance_Last()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.multiInteractionEndpointInstance.oclIsUndefined() then null else self.multiInteractionEndpointInstance.last endif'"
	 * @generated
	 */
	DiscreteSingleInteractionEndpointInstance getLast();

} // DiscreteSingleInteractionEndpointInstance
