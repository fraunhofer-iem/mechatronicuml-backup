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
package org.muml.pim.realtimestatechart.one_to_n_schemata;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage
 * @generated
 */
public interface One_to_n_schemataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	One_to_n_schemataFactory eINSTANCE = org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Multicast</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multicast</em>'.
	 * @generated
	 */
	Multicast createMulticast();

	/**
	 * Returns a new object of class '<em>Unicast</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unicast</em>'.
	 * @generated
	 */
	Unicast createUnicast();

	/**
	 * Returns a new object of class '<em>Iterate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterate</em>'.
	 * @generated
	 */
	Iterate createIterate();

	/**
	 * Returns a new object of class '<em>Load Balancing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Balancing</em>'.
	 * @generated
	 */
	LoadBalancing createLoadBalancing();

	/**
	 * Returns a new object of class '<em>Single Receive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Receive</em>'.
	 * @generated
	 */
	SingleReceive createSingleReceive();

	/**
	 * Returns a new object of class '<em>Multi Receive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Receive</em>'.
	 * @generated
	 */
	MultiReceive createMultiReceive();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	One_to_n_schemataPackage getOne_to_n_schemataPackage();

} //One_to_n_schemataFactory
