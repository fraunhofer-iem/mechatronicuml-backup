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
package de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.impl;

import de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;

import de.uni_paderborn.fujaba.muml.behavior.impl.BehaviorPackageImpl;

import de.uni_paderborn.fujaba.muml.component.ComponentPackage;

import de.uni_paderborn.fujaba.muml.component.impl.ComponentPackageImpl;

import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;

import de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl;

import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;

import de.uni_paderborn.fujaba.muml.constraint.impl.ConstraintPackageImpl;

import de.uni_paderborn.fujaba.muml.instance.InstancePackage;

import de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl;

import de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage;

import de.uni_paderborn.fujaba.muml.msgtype.impl.MsgtypePackageImpl;

import de.uni_paderborn.fujaba.muml.pattern.PatternPackage;

import de.uni_paderborn.fujaba.muml.pattern.impl.PatternPackageImpl;

import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;

import de.uni_paderborn.fujaba.muml.protocol.impl.ProtocolPackageImpl;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;

import de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl;

import de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.Iterate;
import de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.LoadBalancing;
import de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.MultiReceive;
import de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.Multicast;
import de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema;
import de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.One_to_n_schemataFactory;
import de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.ReceivingOneToManyCommunicationSchema;
import de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.SendingOneToManyCommunicationSchema;
import de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.SingleReceive;
import de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.Unicast;

import de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.util.One_to_n_schemataValidator;

import de.uni_paderborn.fujaba.muml.types.TypesPackage;

import de.uni_paderborn.fujaba.muml.types.impl.TypesPackageImpl;

import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

import de.uni_paderborn.fujaba.muml.valuetype.impl.ValuetypePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.storydriven.core.expressions.ExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class One_to_n_schemataPackageImpl extends EPackageImpl implements One_to_n_schemataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneToManyCommunicationSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multicastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unicastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadBalancingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleReceiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiReceiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receivingOneToManyCommunicationSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendingOneToManyCommunicationSchemaEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private One_to_n_schemataPackageImpl() {
		super(eNS_URI, One_to_n_schemataFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link One_to_n_schemataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static One_to_n_schemataPackage init() {
		if (isInited) return (One_to_n_schemataPackage)EPackage.Registry.INSTANCE.getEPackage(One_to_n_schemataPackage.eNS_URI);

		// Obtain or create and register package
		One_to_n_schemataPackageImpl theOne_to_n_schemataPackage = (One_to_n_schemataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof One_to_n_schemataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new One_to_n_schemataPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelinstancePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		ProtocolPackageImpl theProtocolPackage = (ProtocolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) instanceof ProtocolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) : ProtocolPackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		MsgtypePackageImpl theMsgtypePackage = (MsgtypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) instanceof MsgtypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) : MsgtypePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ConnectorPackageImpl theConnectorPackage = (ConnectorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) instanceof ConnectorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) : ConnectorPackage.eINSTANCE);
		ValuetypePackageImpl theValuetypePackage = (ValuetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) instanceof ValuetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) : ValuetypePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);

		// Create package meta-data objects
		theOne_to_n_schemataPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theProtocolPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theMsgtypePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theConnectorPackage.createPackageContents();
		theValuetypePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		thePatternPackage.createPackageContents();

		// Initialize created meta-data
		theOne_to_n_schemataPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theProtocolPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theMsgtypePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theConnectorPackage.initializePackageContents();
		theValuetypePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		thePatternPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOne_to_n_schemataPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return One_to_n_schemataValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOne_to_n_schemataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(One_to_n_schemataPackage.eNS_URI, theOne_to_n_schemataPackage);
		return theOne_to_n_schemataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneToManyCommunicationSchema() {
		return oneToManyCommunicationSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneToManyCommunicationSchema_Condition() {
		return (EReference)oneToManyCommunicationSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneToManyCommunicationSchema_AsynchronousMessageEvent() {
		return (EReference)oneToManyCommunicationSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneToManyCommunicationSchema_Action() {
		return (EReference)oneToManyCommunicationSchemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMulticast() {
		return multicastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnicast() {
		return unicastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterate() {
		return iterateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIterate_TerminationCondition() {
		return (EReference)iterateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIterate_Delay() {
		return (EReference)iterateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterate_StartFromFirst() {
		return (EAttribute)iterateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadBalancing() {
		return loadBalancingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadBalancing_ResponseMessage() {
		return (EReference)loadBalancingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadBalancing_MaxWorkingTime() {
		return (EReference)loadBalancingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadBalancing_OnResponseAction() {
		return (EReference)loadBalancingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleReceive() {
		return singleReceiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiReceive() {
		return multiReceiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiReceive_FailureAction() {
		return (EReference)multiReceiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceivingOneToManyCommunicationSchema() {
		return receivingOneToManyCommunicationSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendingOneToManyCommunicationSchema() {
		return sendingOneToManyCommunicationSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public One_to_n_schemataFactory getOne_to_n_schemataFactory() {
		return (One_to_n_schemataFactory)getEFactoryInstance();
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
		oneToManyCommunicationSchemaEClass = createEClass(ONE_TO_MANY_COMMUNICATION_SCHEMA);
		createEReference(oneToManyCommunicationSchemaEClass, ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION);
		createEReference(oneToManyCommunicationSchemaEClass, ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT);
		createEReference(oneToManyCommunicationSchemaEClass, ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION);

		multicastEClass = createEClass(MULTICAST);

		unicastEClass = createEClass(UNICAST);

		iterateEClass = createEClass(ITERATE);
		createEReference(iterateEClass, ITERATE__TERMINATION_CONDITION);
		createEReference(iterateEClass, ITERATE__DELAY);
		createEAttribute(iterateEClass, ITERATE__START_FROM_FIRST);

		loadBalancingEClass = createEClass(LOAD_BALANCING);
		createEReference(loadBalancingEClass, LOAD_BALANCING__RESPONSE_MESSAGE);
		createEReference(loadBalancingEClass, LOAD_BALANCING__MAX_WORKING_TIME);
		createEReference(loadBalancingEClass, LOAD_BALANCING__ON_RESPONSE_ACTION);

		singleReceiveEClass = createEClass(SINGLE_RECEIVE);

		multiReceiveEClass = createEClass(MULTI_RECEIVE);
		createEReference(multiReceiveEClass, MULTI_RECEIVE__FAILURE_ACTION);

		receivingOneToManyCommunicationSchemaEClass = createEClass(RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA);

		sendingOneToManyCommunicationSchemaEClass = createEClass(SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA);
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
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		RealtimestatechartPackage theRealtimestatechartPackage = (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);
		MsgtypePackage theMsgtypePackage = (MsgtypePackage)EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		multicastEClass.getESuperTypes().add(this.getSendingOneToManyCommunicationSchema());
		unicastEClass.getESuperTypes().add(this.getSendingOneToManyCommunicationSchema());
		iterateEClass.getESuperTypes().add(this.getSendingOneToManyCommunicationSchema());
		loadBalancingEClass.getESuperTypes().add(this.getSendingOneToManyCommunicationSchema());
		singleReceiveEClass.getESuperTypes().add(this.getReceivingOneToManyCommunicationSchema());
		multiReceiveEClass.getESuperTypes().add(this.getReceivingOneToManyCommunicationSchema());
		receivingOneToManyCommunicationSchemaEClass.getESuperTypes().add(this.getOneToManyCommunicationSchema());
		sendingOneToManyCommunicationSchemaEClass.getESuperTypes().add(this.getOneToManyCommunicationSchema());

		// Initialize classes, features, and operations; add parameters
		initEClass(oneToManyCommunicationSchemaEClass, OneToManyCommunicationSchema.class, "OneToManyCommunicationSchema", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOneToManyCommunicationSchema_Condition(), theExpressionsPackage.getExpression(), null, "condition", null, 0, 1, OneToManyCommunicationSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneToManyCommunicationSchema_AsynchronousMessageEvent(), theRealtimestatechartPackage.getAsynchronousMessageEvent(), theRealtimestatechartPackage.getAsynchronousMessageEvent_OneToManyCommunicationSchema(), "asynchronousMessageEvent", null, 1, 1, OneToManyCommunicationSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneToManyCommunicationSchema_Action(), theRealtimestatechartPackage.getAction(), null, "action", null, 0, 1, OneToManyCommunicationSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multicastEClass, Multicast.class, "Multicast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unicastEClass, Unicast.class, "Unicast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iterateEClass, Iterate.class, "Iterate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIterate_TerminationCondition(), theExpressionsPackage.getExpression(), null, "terminationCondition", null, 0, 1, Iterate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIterate_Delay(), theValuetypePackage.getTimeValue(), null, "delay", null, 0, 1, Iterate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterate_StartFromFirst(), ecorePackage.getEBoolean(), "startFromFirst", "true", 0, 1, Iterate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadBalancingEClass, LoadBalancing.class, "LoadBalancing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoadBalancing_ResponseMessage(), theMsgtypePackage.getMessageType(), null, "responseMessage", null, 0, 1, LoadBalancing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoadBalancing_MaxWorkingTime(), theValuetypePackage.getTimeValue(), null, "maxWorkingTime", null, 0, 1, LoadBalancing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoadBalancing_OnResponseAction(), theRealtimestatechartPackage.getAction(), null, "onResponseAction", null, 0, 1, LoadBalancing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleReceiveEClass, SingleReceive.class, "SingleReceive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiReceiveEClass, MultiReceive.class, "MultiReceive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiReceive_FailureAction(), theRealtimestatechartPackage.getAction(), null, "failureAction", null, 0, 1, MultiReceive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receivingOneToManyCommunicationSchemaEClass, ReceivingOneToManyCommunicationSchema.class, "ReceivingOneToManyCommunicationSchema", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sendingOneToManyCommunicationSchemaEClass, SendingOneToManyCommunicationSchema.class, "SendingOneToManyCommunicationSchema", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (loadBalancingEClass, 
		   source, 
		   new String[] {
			 "constraints", "LoadbalancingEitherHasResponseMessageOrWcet ResponseMessageOrWcetOfCommunicationSchemaLoadbalancingMustBeSet ResponseActionCanOnlyBeSetIfResponseMessageIsUsed"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (loadBalancingEClass, 
		   source, 
		   new String[] {
			 "ResponseMessageOrWcetOfCommunicationSchemaLoadbalancingMustBeSet", "-- LoadBalancing must define the responseMessage or the maxWorkingTime\r\nnot self.responseMessage.oclIsUndefined() or not self.maxWorkingTime.oclIsUndefined()",
			 "LoadbalancingEitherHasResponseMessageOrWcet", "-- responseMessage and maxWorkingTime exclude each other\r\nif not self.responseMessage.oclIsUndefined() and not self.maxWorkingTime.oclIsUndefined() then\r\n\tfalse\r\nelse\r\n\ttrue\r\nendif",
			 "ResponseActionCanOnlyBeSetIfResponseMessageIsUsed", "-- if onResponseAction is set, the responseMessage must be set, too.\r\n(not onResponseAction.oclIsUndefined()) implies (not responseMessage.oclIsUndefined())"
		   });
	}

} //One_to_n_schemataPackageImpl
