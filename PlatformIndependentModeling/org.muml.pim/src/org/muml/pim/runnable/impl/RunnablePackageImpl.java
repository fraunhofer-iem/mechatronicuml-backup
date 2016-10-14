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
package org.muml.pim.runnable.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.muml.core.CorePackage;

import org.muml.pim.PimPackage;

import org.muml.pim.behavior.BehaviorPackage;

import org.muml.pim.behavior.impl.BehaviorPackageImpl;

import org.muml.pim.component.ComponentPackage;

import org.muml.pim.component.impl.ComponentPackageImpl;

import org.muml.pim.connector.ConnectorPackage;

import org.muml.pim.connector.impl.ConnectorPackageImpl;

import org.muml.pim.constraint.ConstraintPackage;

import org.muml.pim.constraint.impl.ConstraintPackageImpl;

import org.muml.pim.impl.PimPackageImpl;

import org.muml.pim.instance.InstancePackage;

import org.muml.pim.instance.impl.InstancePackageImpl;

import org.muml.pim.msgtype.MsgtypePackage;

import org.muml.pim.msgtype.impl.MsgtypePackageImpl;

import org.muml.pim.pattern.PatternPackage;

import org.muml.pim.pattern.impl.PatternPackageImpl;

import org.muml.pim.protocol.ProtocolPackage;

import org.muml.pim.protocol.impl.ProtocolPackageImpl;

import org.muml.pim.realtimestatechart.RealtimestatechartPackage;

import org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl;

import org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage;

import org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl;

import org.muml.pim.runnable.Label;
import org.muml.pim.runnable.LabelAccess;
import org.muml.pim.runnable.LabelAccessKind;
import org.muml.pim.runnable.RunnableFactory;
import org.muml.pim.runnable.RunnablePackage;

import org.muml.pim.types.TypesPackage;

import org.muml.pim.types.impl.TypesPackageImpl;

import org.muml.pim.valuetype.ValuetypePackage;

import org.muml.pim.valuetype.impl.ValuetypePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RunnablePackageImpl extends EPackageImpl implements RunnablePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum labelAccessKindEEnum = null;

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
	 * @see org.muml.pim.runnable.RunnablePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RunnablePackageImpl() {
		super(eNS_URI, RunnableFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RunnablePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RunnablePackage init() {
		if (isInited) return (RunnablePackage)EPackage.Registry.INSTANCE.getEPackage(RunnablePackage.eNS_URI);

		// Obtain or create and register package
		RunnablePackageImpl theRunnablePackage = (RunnablePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RunnablePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RunnablePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PimPackageImpl thePimPackage = (PimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PimPackage.eNS_URI) instanceof PimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PimPackage.eNS_URI) : PimPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		ProtocolPackageImpl theProtocolPackage = (ProtocolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) instanceof ProtocolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) : ProtocolPackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		One_to_n_schemataPackageImpl theOne_to_n_schemataPackage = (One_to_n_schemataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(One_to_n_schemataPackage.eNS_URI) instanceof One_to_n_schemataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(One_to_n_schemataPackage.eNS_URI) : One_to_n_schemataPackage.eINSTANCE);
		MsgtypePackageImpl theMsgtypePackage = (MsgtypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) instanceof MsgtypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) : MsgtypePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ConnectorPackageImpl theConnectorPackage = (ConnectorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) instanceof ConnectorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) : ConnectorPackage.eINSTANCE);
		ValuetypePackageImpl theValuetypePackage = (ValuetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) instanceof ValuetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) : ValuetypePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);

		// Create package meta-data objects
		theRunnablePackage.createPackageContents();
		thePimPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theProtocolPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theOne_to_n_schemataPackage.createPackageContents();
		theMsgtypePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theConnectorPackage.createPackageContents();
		theValuetypePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		thePatternPackage.createPackageContents();

		// Initialize created meta-data
		theRunnablePackage.initializePackageContents();
		thePimPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theProtocolPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theOne_to_n_schemataPackage.initializePackageContents();
		theMsgtypePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theConnectorPackage.initializePackageContents();
		theValuetypePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		thePatternPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRunnablePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RunnablePackage.eNS_URI, theRunnablePackage);
		return theRunnablePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnable() {
		return runnableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnable_ComponentInstance() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnable_PortInstance() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnable_Period() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnable_LabelAccesses() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnable_Deadline() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabel_ComponentInstance() {
		return (EReference)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabel_ComponentStatechart() {
		return (EReference)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_IsConstant() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelAccess() {
		return labelAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelAccess_AccessKind() {
		return (EAttribute)labelAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelAccess_AccessLabel() {
		return (EReference)labelAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelAccess_AccessingRunnable() {
		return (EReference)labelAccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLabelAccessKind() {
		return labelAccessKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableFactory getRunnableFactory() {
		return (RunnableFactory)getEFactoryInstance();
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
		runnableEClass = createEClass(RUNNABLE);
		createEReference(runnableEClass, RUNNABLE__COMPONENT_INSTANCE);
		createEReference(runnableEClass, RUNNABLE__PORT_INSTANCE);
		createEReference(runnableEClass, RUNNABLE__PERIOD);
		createEReference(runnableEClass, RUNNABLE__LABEL_ACCESSES);
		createEReference(runnableEClass, RUNNABLE__DEADLINE);

		labelEClass = createEClass(LABEL);
		createEReference(labelEClass, LABEL__COMPONENT_INSTANCE);
		createEReference(labelEClass, LABEL__COMPONENT_STATECHART);
		createEAttribute(labelEClass, LABEL__IS_CONSTANT);

		labelAccessEClass = createEClass(LABEL_ACCESS);
		createEAttribute(labelAccessEClass, LABEL_ACCESS__ACCESS_KIND);
		createEReference(labelAccessEClass, LABEL_ACCESS__ACCESS_LABEL);
		createEReference(labelAccessEClass, LABEL_ACCESS__ACCESSING_RUNNABLE);

		// Create enums
		labelAccessKindEEnum = createEEnum(LABEL_ACCESS_KIND);
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
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);
		RealtimestatechartPackage theRealtimestatechartPackage = (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		runnableEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		labelEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		labelAccessEClass.getESuperTypes().add(theCorePackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(runnableEClass, org.muml.pim.runnable.Runnable.class, "Runnable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnable_ComponentInstance(), theInstancePackage.getComponentInstance(), theInstancePackage.getComponentInstance_Runnables(), "componentInstance", null, 1, 1, org.muml.pim.runnable.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnable_PortInstance(), theInstancePackage.getPortInstance(), theInstancePackage.getPortInstance_Runnable(), "portInstance", null, 0, -1, org.muml.pim.runnable.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnable_Period(), theValuetypePackage.getTimeValue(), null, "period", null, 1, 1, org.muml.pim.runnable.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnable_LabelAccesses(), this.getLabelAccess(), this.getLabelAccess_AccessingRunnable(), "labelAccesses", null, 0, -1, org.muml.pim.runnable.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnable_Deadline(), theValuetypePackage.getTimeValue(), null, "deadline", null, 0, 1, org.muml.pim.runnable.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabel_ComponentInstance(), theInstancePackage.getComponentInstance(), theInstancePackage.getComponentInstance_Labels(), "componentInstance", null, 1, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabel_ComponentStatechart(), theRealtimestatechartPackage.getRealtimeStatechart(), null, "componentStatechart", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_IsConstant(), ecorePackage.getEBoolean(), "isConstant", "false", 1, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelAccessEClass, LabelAccess.class, "LabelAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelAccess_AccessKind(), this.getLabelAccessKind(), "accessKind", null, 1, 1, LabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelAccess_AccessLabel(), this.getLabel(), null, "accessLabel", null, 1, 1, LabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelAccess_AccessingRunnable(), this.getRunnable(), this.getRunnable_LabelAccesses(), "accessingRunnable", null, 1, 1, LabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(labelAccessKindEEnum, LabelAccessKind.class, "LabelAccessKind");
		addEEnumLiteral(labelAccessKindEEnum, LabelAccessKind.READACCESS);
		addEEnumLiteral(labelAccessKindEEnum, LabelAccessKind.WRITEACCESS);
	}

} //RunnablePackageImpl
