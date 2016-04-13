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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage
 * @generated
 */
public class One_to_n_schemataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static One_to_n_schemataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public One_to_n_schemataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = One_to_n_schemataPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected One_to_n_schemataSwitch<Adapter> modelSwitch =
		new One_to_n_schemataSwitch<Adapter>() {
			@Override
			public Adapter caseOneToManyCommunicationSchema(OneToManyCommunicationSchema object) {
				return createOneToManyCommunicationSchemaAdapter();
			}
			@Override
			public Adapter caseMulticast(Multicast object) {
				return createMulticastAdapter();
			}
			@Override
			public Adapter caseUnicast(Unicast object) {
				return createUnicastAdapter();
			}
			@Override
			public Adapter caseIterate(Iterate object) {
				return createIterateAdapter();
			}
			@Override
			public Adapter caseLoadBalancing(LoadBalancing object) {
				return createLoadBalancingAdapter();
			}
			@Override
			public Adapter caseSingleReceive(SingleReceive object) {
				return createSingleReceiveAdapter();
			}
			@Override
			public Adapter caseMultiReceive(MultiReceive object) {
				return createMultiReceiveAdapter();
			}
			@Override
			public Adapter caseReceivingOneToManyCommunicationSchema(ReceivingOneToManyCommunicationSchema object) {
				return createReceivingOneToManyCommunicationSchemaAdapter();
			}
			@Override
			public Adapter caseSendingOneToManyCommunicationSchema(SendingOneToManyCommunicationSchema object) {
				return createSendingOneToManyCommunicationSchemaAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema <em>One To Many Communication Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema
	 * @generated
	 */
	public Adapter createOneToManyCommunicationSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.Multicast <em>Multicast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.Multicast
	 * @generated
	 */
	public Adapter createMulticastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.Unicast <em>Unicast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.Unicast
	 * @generated
	 */
	public Adapter createUnicastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate <em>Iterate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate
	 * @generated
	 */
	public Adapter createIterateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing <em>Load Balancing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing
	 * @generated
	 */
	public Adapter createLoadBalancingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.SingleReceive <em>Single Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.SingleReceive
	 * @generated
	 */
	public Adapter createSingleReceiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.MultiReceive <em>Multi Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.MultiReceive
	 * @generated
	 */
	public Adapter createMultiReceiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.ReceivingOneToManyCommunicationSchema <em>Receiving One To Many Communication Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.ReceivingOneToManyCommunicationSchema
	 * @generated
	 */
	public Adapter createReceivingOneToManyCommunicationSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.SendingOneToManyCommunicationSchema <em>Sending One To Many Communication Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.SendingOneToManyCommunicationSchema
	 * @generated
	 */
	public Adapter createSendingOneToManyCommunicationSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //One_to_n_schemataAdapterFactory
