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
package org.muml.uppaal.adapter.extension.verificationextension.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.pim.PimPackage;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.uppaal.adapter.extension.verificationextension.ClockBinding;
import org.muml.uppaal.adapter.extension.verificationextension.ClockBindingsExtension;
import org.muml.uppaal.adapter.extension.verificationextension.CommittedExtension;
import org.muml.uppaal.adapter.extension.verificationextension.ElementToVerifyExtension;
import org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionFactory;
import org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VerificationExtensionPackageImpl extends EPackageImpl implements VerificationExtensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass committedExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockBindingsExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementToVerifyExtensionEClass = null;

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
	 * @see org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VerificationExtensionPackageImpl() {
		super(eNS_URI, VerificationExtensionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VerificationExtensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VerificationExtensionPackage init() {
		if (isInited) return (VerificationExtensionPackage)EPackage.Registry.INSTANCE.getEPackage(VerificationExtensionPackage.eNS_URI);

		// Obtain or create and register package
		VerificationExtensionPackageImpl theVerificationExtensionPackage = (VerificationExtensionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VerificationExtensionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VerificationExtensionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PimPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVerificationExtensionPackage.createPackageContents();

		// Initialize created meta-data
		theVerificationExtensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVerificationExtensionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VerificationExtensionPackage.eNS_URI, theVerificationExtensionPackage);
		return theVerificationExtensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommittedExtension() {
		return committedExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockBindingsExtension() {
		return clockBindingsExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockBindingsExtension_ClockBindings() {
		return (EReference)clockBindingsExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockBinding() {
		return clockBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockBinding_Clock() {
		return (EReference)clockBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockBinding_Value() {
		return (EAttribute)clockBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementToVerifyExtension() {
		return elementToVerifyExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationExtensionFactory getVerificationExtensionFactory() {
		return (VerificationExtensionFactory)getEFactoryInstance();
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
		committedExtensionEClass = createEClass(COMMITTED_EXTENSION);

		clockBindingsExtensionEClass = createEClass(CLOCK_BINDINGS_EXTENSION);
		createEReference(clockBindingsExtensionEClass, CLOCK_BINDINGS_EXTENSION__CLOCK_BINDINGS);

		clockBindingEClass = createEClass(CLOCK_BINDING);
		createEReference(clockBindingEClass, CLOCK_BINDING__CLOCK);
		createEAttribute(clockBindingEClass, CLOCK_BINDING__VALUE);

		elementToVerifyExtensionEClass = createEClass(ELEMENT_TO_VERIFY_EXTENSION);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		RealtimestatechartPackage theRealtimestatechartPackage = (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		committedExtensionEClass.getESuperTypes().add(theCorePackage.getExtension());
		clockBindingsExtensionEClass.getESuperTypes().add(theCorePackage.getExtension());
		elementToVerifyExtensionEClass.getESuperTypes().add(theCorePackage.getExtension());

		// Initialize classes, features, and operations; add parameters
		initEClass(committedExtensionEClass, CommittedExtension.class, "CommittedExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clockBindingsExtensionEClass, ClockBindingsExtension.class, "ClockBindingsExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockBindingsExtension_ClockBindings(), this.getClockBinding(), null, "clockBindings", null, 0, -1, ClockBindingsExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockBindingEClass, ClockBinding.class, "ClockBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockBinding_Clock(), theRealtimestatechartPackage.getClock(), null, "clock", null, 1, 1, ClockBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClockBinding_Value(), ecorePackage.getEInt(), "value", null, 0, 1, ClockBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementToVerifyExtensionEClass, ElementToVerifyExtension.class, "ElementToVerifyExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //VerificationExtensionPackageImpl
