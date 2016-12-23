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
package org.muml.pim.realtimestatechart.one_to_n_schemata.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.pim.realtimestatechart.one_to_n_schemata.*;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate;
import org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing;
import org.muml.pim.realtimestatechart.one_to_n_schemata.MultiReceive;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Multicast;
import org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataFactory;
import org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage;
import org.muml.pim.realtimestatechart.one_to_n_schemata.SingleReceive;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Unicast;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class One_to_n_schemataFactoryImpl extends EFactoryImpl implements One_to_n_schemataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static One_to_n_schemataFactory init() {
		try {
			One_to_n_schemataFactory theOne_to_n_schemataFactory = (One_to_n_schemataFactory)EPackage.Registry.INSTANCE.getEFactory(One_to_n_schemataPackage.eNS_URI);
			if (theOne_to_n_schemataFactory != null) {
				return theOne_to_n_schemataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new One_to_n_schemataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public One_to_n_schemataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case One_to_n_schemataPackage.MULTICAST: return createMulticast();
			case One_to_n_schemataPackage.UNICAST: return createUnicast();
			case One_to_n_schemataPackage.ITERATE: return createIterate();
			case One_to_n_schemataPackage.LOAD_BALANCING: return createLoadBalancing();
			case One_to_n_schemataPackage.SINGLE_RECEIVE: return createSingleReceive();
			case One_to_n_schemataPackage.MULTI_RECEIVE: return createMultiReceive();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multicast createMulticast() {
		MulticastImpl multicast = new MulticastImpl();
		return multicast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unicast createUnicast() {
		UnicastImpl unicast = new UnicastImpl();
		return unicast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterate createIterate() {
		IterateImpl iterate = new IterateImpl();
		return iterate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancing createLoadBalancing() {
		LoadBalancingImpl loadBalancing = new LoadBalancingImpl();
		return loadBalancing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleReceive createSingleReceive() {
		SingleReceiveImpl singleReceive = new SingleReceiveImpl();
		return singleReceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiReceive createMultiReceive() {
		MultiReceiveImpl multiReceive = new MultiReceiveImpl();
		return multiReceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public One_to_n_schemataPackage getOne_to_n_schemataPackage() {
		return (One_to_n_schemataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static One_to_n_schemataPackage getPackage() {
		return One_to_n_schemataPackage.eINSTANCE;
	}

} //One_to_n_schemataFactoryImpl
