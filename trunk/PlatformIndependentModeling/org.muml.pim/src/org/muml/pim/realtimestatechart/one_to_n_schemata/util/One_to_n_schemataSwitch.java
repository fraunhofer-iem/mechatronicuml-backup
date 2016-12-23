/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.realtimestatechart.one_to_n_schemata.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.pim.realtimestatechart.one_to_n_schemata.*;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate;
import org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing;
import org.muml.pim.realtimestatechart.one_to_n_schemata.MultiReceive;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Multicast;
import org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema;
import org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage;
import org.muml.pim.realtimestatechart.one_to_n_schemata.ReceivingOneToManyCommunicationSchema;
import org.muml.pim.realtimestatechart.one_to_n_schemata.SendingOneToManyCommunicationSchema;
import org.muml.pim.realtimestatechart.one_to_n_schemata.SingleReceive;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Unicast;

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
 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage
 * @generated
 */
public class One_to_n_schemataSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static One_to_n_schemataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public One_to_n_schemataSwitch() {
		if (modelPackage == null) {
			modelPackage = One_to_n_schemataPackage.eINSTANCE;
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
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA: {
				OneToManyCommunicationSchema oneToManyCommunicationSchema = (OneToManyCommunicationSchema)theEObject;
				T result = caseOneToManyCommunicationSchema(oneToManyCommunicationSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case One_to_n_schemataPackage.MULTICAST: {
				Multicast multicast = (Multicast)theEObject;
				T result = caseMulticast(multicast);
				if (result == null) result = caseSendingOneToManyCommunicationSchema(multicast);
				if (result == null) result = caseOneToManyCommunicationSchema(multicast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case One_to_n_schemataPackage.UNICAST: {
				Unicast unicast = (Unicast)theEObject;
				T result = caseUnicast(unicast);
				if (result == null) result = caseSendingOneToManyCommunicationSchema(unicast);
				if (result == null) result = caseOneToManyCommunicationSchema(unicast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case One_to_n_schemataPackage.ITERATE: {
				Iterate iterate = (Iterate)theEObject;
				T result = caseIterate(iterate);
				if (result == null) result = caseSendingOneToManyCommunicationSchema(iterate);
				if (result == null) result = caseOneToManyCommunicationSchema(iterate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case One_to_n_schemataPackage.LOAD_BALANCING: {
				LoadBalancing loadBalancing = (LoadBalancing)theEObject;
				T result = caseLoadBalancing(loadBalancing);
				if (result == null) result = caseSendingOneToManyCommunicationSchema(loadBalancing);
				if (result == null) result = caseOneToManyCommunicationSchema(loadBalancing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case One_to_n_schemataPackage.SINGLE_RECEIVE: {
				SingleReceive singleReceive = (SingleReceive)theEObject;
				T result = caseSingleReceive(singleReceive);
				if (result == null) result = caseReceivingOneToManyCommunicationSchema(singleReceive);
				if (result == null) result = caseOneToManyCommunicationSchema(singleReceive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case One_to_n_schemataPackage.MULTI_RECEIVE: {
				MultiReceive multiReceive = (MultiReceive)theEObject;
				T result = caseMultiReceive(multiReceive);
				if (result == null) result = caseReceivingOneToManyCommunicationSchema(multiReceive);
				if (result == null) result = caseOneToManyCommunicationSchema(multiReceive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case One_to_n_schemataPackage.RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA: {
				ReceivingOneToManyCommunicationSchema receivingOneToManyCommunicationSchema = (ReceivingOneToManyCommunicationSchema)theEObject;
				T result = caseReceivingOneToManyCommunicationSchema(receivingOneToManyCommunicationSchema);
				if (result == null) result = caseOneToManyCommunicationSchema(receivingOneToManyCommunicationSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case One_to_n_schemataPackage.SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA: {
				SendingOneToManyCommunicationSchema sendingOneToManyCommunicationSchema = (SendingOneToManyCommunicationSchema)theEObject;
				T result = caseSendingOneToManyCommunicationSchema(sendingOneToManyCommunicationSchema);
				if (result == null) result = caseOneToManyCommunicationSchema(sendingOneToManyCommunicationSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One To Many Communication Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One To Many Communication Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneToManyCommunicationSchema(OneToManyCommunicationSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multicast</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multicast</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMulticast(Multicast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unicast</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unicast</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnicast(Unicast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterate(Iterate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Balancing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Balancing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadBalancing(LoadBalancing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Receive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Receive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleReceive(SingleReceive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Receive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Receive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiReceive(MultiReceive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receiving One To Many Communication Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receiving One To Many Communication Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceivingOneToManyCommunicationSchema(ReceivingOneToManyCommunicationSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sending One To Many Communication Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sending One To Many Communication Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendingOneToManyCommunicationSchema(SendingOneToManyCommunicationSchema object) {
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

} //One_to_n_schemataSwitch
