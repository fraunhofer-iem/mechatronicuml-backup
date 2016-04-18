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
package org.muml.verification.core.reachanalysis.reachabilitygraph.cic.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.verification.core.reachanalysis.reachabilitygraph.cic.*;
import org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CICZoneGraphState;
import org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CicFactory;
import org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CicFactoryImpl extends EFactoryImpl implements CicFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CicFactory init() {
		try {
			CicFactory theCicFactory = (CicFactory)EPackage.Registry.INSTANCE.getEFactory(CicPackage.eNS_URI);
			if (theCicFactory != null) {
				return theCicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CicFactoryImpl() {
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
			case CicPackage.CIC_ZONE_GRAPH_STATE: return createCICZoneGraphState();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CICZoneGraphState createCICZoneGraphState() {
		CICZoneGraphStateImpl cicZoneGraphState = new CICZoneGraphStateImpl();
		return cicZoneGraphState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CicPackage getCicPackage() {
		return (CicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CicPackage getPackage() {
		return CicPackage.eINSTANCE;
	}

} //CicFactoryImpl
