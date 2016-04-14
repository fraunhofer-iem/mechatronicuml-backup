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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.pim.instance.InstancePackage;
import org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CICZoneGraphState;
import org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CicFactory;
import org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CicPackage;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CicPackageImpl extends EPackageImpl implements CicPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cicZoneGraphStateEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CicPackageImpl() {
		super(eNS_URI, CicFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CicPackage init() {
		if (isInited) return (CicPackage)EPackage.Registry.INSTANCE.getEPackage(CicPackage.eNS_URI);

		// Obtain or create and register package
		CicPackageImpl theCicPackage = (CicPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CicPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CicPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RtscPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCicPackage.createPackageContents();

		// Initialize created meta-data
		theCicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCicPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CicPackage.eNS_URI, theCicPackage);
		return theCicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCICZoneGraphState() {
		return cicZoneGraphStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCICZoneGraphState_Cic() {
		return (EReference)cicZoneGraphStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CicFactory getCicFactory() {
		return (CicFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cicZoneGraphStateEClass = createEClass(CIC_ZONE_GRAPH_STATE);
		createEReference(cicZoneGraphStateEClass, CIC_ZONE_GRAPH_STATE__CIC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RtscPackage theRtscPackage = (RtscPackage)EPackage.Registry.INSTANCE.getEPackage(RtscPackage.eNS_URI);
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cicZoneGraphStateEClass.getESuperTypes().add(theRtscPackage.getZoneGraphState());

		// Initialize classes and features; add operations and parameters
		initEClass(cicZoneGraphStateEClass, CICZoneGraphState.class, "CICZoneGraphState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCICZoneGraphState_Cic(), theInstancePackage.getComponentInstanceConfiguration(), null, "cic", null, 1, 1, CICZoneGraphState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CicPackageImpl
