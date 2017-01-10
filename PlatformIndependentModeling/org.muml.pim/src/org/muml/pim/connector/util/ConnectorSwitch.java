/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.connector.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.core.CommentableElement;
import org.muml.core.ExtendableElement;
import org.muml.core.NamedElement;
import org.muml.pim.behavior.BehavioralElement;
import org.muml.pim.connector.Connector;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pim.connector.ConnectorInstance;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.connector.DiscreteInteractionEndpointInstance;
import org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance;
import org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance;
import org.muml.pim.connector.MessageBuffer;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.muml.pim.connector.ConnectorPackage
 * @generated
 */
public class ConnectorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConnectorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorSwitch() {
		if (modelPackage == null) {
			modelPackage = ConnectorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConnectorPackage.CONNECTOR_ENDPOINT: {
				ConnectorEndpoint connectorEndpoint = (ConnectorEndpoint)theEObject;
				T result = caseConnectorEndpoint(connectorEndpoint);
				if (result == null) result = caseCommentableElement(connectorEndpoint);
				if (result == null) result = caseExtendableElement(connectorEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConnectorPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseCommentableElement(connector);
				if (result == null) result = caseExtendableElement(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE: {
				ConnectorEndpointInstance connectorEndpointInstance = (ConnectorEndpointInstance)theEObject;
				T result = caseConnectorEndpointInstance(connectorEndpointInstance);
				if (result == null) result = caseNamedElement(connectorEndpointInstance);
				if (result == null) result = caseCommentableElement(connectorEndpointInstance);
				if (result == null) result = caseExtendableElement(connectorEndpointInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConnectorPackage.CONNECTOR_INSTANCE: {
				ConnectorInstance connectorInstance = (ConnectorInstance)theEObject;
				T result = caseConnectorInstance(connectorInstance);
				if (result == null) result = caseCommentableElement(connectorInstance);
				if (result == null) result = caseExtendableElement(connectorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT: {
				DiscreteInteractionEndpoint discreteInteractionEndpoint = (DiscreteInteractionEndpoint)theEObject;
				T result = caseDiscreteInteractionEndpoint(discreteInteractionEndpoint);
				if (result == null) result = caseConnectorEndpoint(discreteInteractionEndpoint);
				if (result == null) result = caseBehavioralElement(discreteInteractionEndpoint);
				if (result == null) result = caseNamedElement(discreteInteractionEndpoint);
				if (result == null) result = caseCommentableElement(discreteInteractionEndpoint);
				if (result == null) result = caseExtendableElement(discreteInteractionEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT_INSTANCE: {
				DiscreteInteractionEndpointInstance discreteInteractionEndpointInstance = (DiscreteInteractionEndpointInstance)theEObject;
				T result = caseDiscreteInteractionEndpointInstance(discreteInteractionEndpointInstance);
				if (result == null) result = caseConnectorEndpointInstance(discreteInteractionEndpointInstance);
				if (result == null) result = caseNamedElement(discreteInteractionEndpointInstance);
				if (result == null) result = caseCommentableElement(discreteInteractionEndpointInstance);
				if (result == null) result = caseExtendableElement(discreteInteractionEndpointInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE: {
				DiscreteSingleInteractionEndpointInstance discreteSingleInteractionEndpointInstance = (DiscreteSingleInteractionEndpointInstance)theEObject;
				T result = caseDiscreteSingleInteractionEndpointInstance(discreteSingleInteractionEndpointInstance);
				if (result == null) result = caseDiscreteInteractionEndpointInstance(discreteSingleInteractionEndpointInstance);
				if (result == null) result = caseConnectorEndpointInstance(discreteSingleInteractionEndpointInstance);
				if (result == null) result = caseNamedElement(discreteSingleInteractionEndpointInstance);
				if (result == null) result = caseCommentableElement(discreteSingleInteractionEndpointInstance);
				if (result == null) result = caseExtendableElement(discreteSingleInteractionEndpointInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConnectorPackage.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE: {
				DiscreteMultiInteractionEndpointInstance discreteMultiInteractionEndpointInstance = (DiscreteMultiInteractionEndpointInstance)theEObject;
				T result = caseDiscreteMultiInteractionEndpointInstance(discreteMultiInteractionEndpointInstance);
				if (result == null) result = caseDiscreteInteractionEndpointInstance(discreteMultiInteractionEndpointInstance);
				if (result == null) result = caseConnectorEndpointInstance(discreteMultiInteractionEndpointInstance);
				if (result == null) result = caseNamedElement(discreteMultiInteractionEndpointInstance);
				if (result == null) result = caseCommentableElement(discreteMultiInteractionEndpointInstance);
				if (result == null) result = caseExtendableElement(discreteMultiInteractionEndpointInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConnectorPackage.MESSAGE_BUFFER: {
				MessageBuffer messageBuffer = (MessageBuffer)theEObject;
				T result = caseMessageBuffer(messageBuffer);
				if (result == null) result = caseNamedElement(messageBuffer);
				if (result == null) result = caseCommentableElement(messageBuffer);
				if (result == null) result = caseExtendableElement(messageBuffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorEndpoint(ConnectorEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorEndpointInstance(ConnectorEndpointInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorInstance(ConnectorInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Interaction Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Interaction Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteInteractionEndpoint(DiscreteInteractionEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Interaction Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Interaction Endpoint Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteInteractionEndpointInstance(DiscreteInteractionEndpointInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Single Interaction Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Single Interaction Endpoint Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteSingleInteractionEndpointInstance(DiscreteSingleInteractionEndpointInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Multi Interaction Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Multi Interaction Endpoint Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteMultiInteractionEndpointInstance(DiscreteMultiInteractionEndpointInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Buffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageBuffer(MessageBuffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendableElement(ExtendableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentableElement(CommentableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioral Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioral Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioralElement(BehavioralElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ConnectorSwitch
