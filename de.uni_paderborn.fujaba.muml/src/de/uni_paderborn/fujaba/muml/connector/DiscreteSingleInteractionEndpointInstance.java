/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.connector;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Single Interaction Endpoint Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getMultiInteractionEndpointInstance <em>Multi Interaction Endpoint Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getNext <em>Next</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getPrevious <em>Previous</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getDiscreteSingleInteractionEndpointInstance()
 * @model abstract="true"
 * @generated
 */
public interface DiscreteSingleInteractionEndpointInstance extends DiscreteInteractionEndpointInstance {
	/**
	 * Returns the value of the '<em><b>Multi Interaction Endpoint Instance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance#getSubInteractionEndpointInstances <em>Sub Interaction Endpoint Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Interaction Endpoint Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Interaction Endpoint Instance</em>' reference.
	 * @see #setMultiInteractionEndpointInstance(DiscreteMultiInteractionEndpointInstance)
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getDiscreteSingleInteractionEndpointInstance_MultiInteractionEndpointInstance()
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance#getSubInteractionEndpointInstances
	 * @model opposite="subInteractionEndpointInstances"
	 * @generated
	 */
	DiscreteMultiInteractionEndpointInstance getMultiInteractionEndpointInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getMultiInteractionEndpointInstance <em>Multi Interaction Endpoint Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Interaction Endpoint Instance</em>' reference.
	 * @see #getMultiInteractionEndpointInstance()
	 * @generated
	 */
	void setMultiInteractionEndpointInstance(DiscreteMultiInteractionEndpointInstance value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(DiscreteSingleInteractionEndpointInstance)
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getDiscreteSingleInteractionEndpointInstance_Next()
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	DiscreteSingleInteractionEndpointInstance getNext();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(DiscreteSingleInteractionEndpointInstance value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(DiscreteSingleInteractionEndpointInstance)
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getDiscreteSingleInteractionEndpointInstance_Previous()
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getNext
	 * @model opposite="next"
	 * @generated
	 */
	DiscreteSingleInteractionEndpointInstance getPrevious();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(DiscreteSingleInteractionEndpointInstance value);

} // DiscreteSingleInteractionEndpointInstance
