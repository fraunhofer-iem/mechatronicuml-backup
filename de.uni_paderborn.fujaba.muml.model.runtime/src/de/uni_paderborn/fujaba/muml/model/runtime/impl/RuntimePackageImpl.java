/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.storydriven.storydiagrams.activities.ActivitiesPackage;
import org.storydriven.storydiagrams.calls.CallsPackage;
import org.storydriven.storydiagrams.calls.expressions.CallsExpressionsPackage;
import org.storydriven.storydiagrams.patterns.PatternsPackage;
import org.storydriven.storydiagrams.templates.TemplatesPackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.runtime.MessageQueue;
import de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeComponentInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeFactory;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeMessage;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeParameter;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimePortInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.VariableBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimePackageImpl extends EPackageImpl implements RuntimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeComponentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimePortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeRoleInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageQueueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realtimeStatechartInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeBehavioralElementEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RuntimePackageImpl() {
		super(eNS_URI, RuntimeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RuntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RuntimePackage init() {
		if (isInited) return (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Obtain or create and register package
		RuntimePackageImpl theRuntimePackage = (RuntimePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RuntimePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RuntimePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ComponentPackage.eINSTANCE.eClass();
		ConstraintPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();
		RealtimestatechartPackage.eINSTANCE.eClass();
		MsgifacePackage.eINSTANCE.eClass();
		DeploymentPackage.eINSTANCE.eClass();
		CallsPackage.eINSTANCE.eClass();
		ActivitiesPackage.eINSTANCE.eClass();
		CallsExpressionsPackage.eINSTANCE.eClass();
		PatternsPackage.eINSTANCE.eClass();
		TemplatesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRuntimePackage.createPackageContents();

		// Initialize created meta-data
		theRuntimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRuntimePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RuntimePackage.eNS_URI, theRuntimePackage);
		return theRuntimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeComponentInstance() {
		return runtimeComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimePortInstance() {
		return runtimePortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeRoleInstance() {
		return runtimeRoleInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageQueue() {
		return messageQueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageQueue_Size() {
		return (EAttribute)messageQueueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageQueue_Messages() {
		return (EReference)messageQueueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageQueue_RuntimeBehavioralElement() {
		return (EReference)messageQueueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealtimeStatechartInstance() {
		return realtimeStatechartInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_RuntimeBehavioralElement() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_InstanceOf() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_States() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_Active() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_SubRealtimeStatechartInstances() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_VariableBindings() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeMessage() {
		return runtimeMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeMessage_Parameters() {
		return (EReference)runtimeMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeParameter() {
		return runtimeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeParameter_Message() {
		return (EReference)runtimeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeParameter_Value() {
		return (EReference)runtimeParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableBinding() {
		return variableBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableBinding_Attribute() {
		return (EReference)variableBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableBinding_Value() {
		return (EReference)variableBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeBehavioralElement() {
		return runtimeBehavioralElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeBehavioralElement_StatechartInstance() {
		return (EReference)runtimeBehavioralElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeBehavioralElement_MessageQueue() {
		return (EReference)runtimeBehavioralElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeFactory getRuntimeFactory() {
		return (RuntimeFactory)getEFactoryInstance();
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
		runtimeComponentInstanceEClass = createEClass(RUNTIME_COMPONENT_INSTANCE);

		runtimePortInstanceEClass = createEClass(RUNTIME_PORT_INSTANCE);

		runtimeRoleInstanceEClass = createEClass(RUNTIME_ROLE_INSTANCE);

		messageQueueEClass = createEClass(MESSAGE_QUEUE);
		createEAttribute(messageQueueEClass, MESSAGE_QUEUE__SIZE);
		createEReference(messageQueueEClass, MESSAGE_QUEUE__MESSAGES);
		createEReference(messageQueueEClass, MESSAGE_QUEUE__RUNTIME_BEHAVIORAL_ELEMENT);

		realtimeStatechartInstanceEClass = createEClass(REALTIME_STATECHART_INSTANCE);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__INSTANCE_OF);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__STATES);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__ACTIVE);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__VARIABLE_BINDINGS);

		runtimeMessageEClass = createEClass(RUNTIME_MESSAGE);
		createEReference(runtimeMessageEClass, RUNTIME_MESSAGE__PARAMETERS);

		runtimeParameterEClass = createEClass(RUNTIME_PARAMETER);
		createEReference(runtimeParameterEClass, RUNTIME_PARAMETER__MESSAGE);
		createEReference(runtimeParameterEClass, RUNTIME_PARAMETER__VALUE);

		variableBindingEClass = createEClass(VARIABLE_BINDING);
		createEReference(variableBindingEClass, VARIABLE_BINDING__ATTRIBUTE);
		createEReference(variableBindingEClass, VARIABLE_BINDING__VALUE);

		runtimeBehavioralElementEClass = createEClass(RUNTIME_BEHAVIORAL_ELEMENT);
		createEReference(runtimeBehavioralElementEClass, RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE);
		createEReference(runtimeBehavioralElementEClass, RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_QUEUE);
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
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
		org.storydriven.core.CorePackage theCorePackage_1 = (org.storydriven.core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(org.storydriven.core.CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		RealtimestatechartPackage theRealtimestatechartPackage = (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		runtimeComponentInstanceEClass.getESuperTypes().add(theInstancePackage.getComponentInstance());
		runtimeComponentInstanceEClass.getESuperTypes().add(this.getRuntimeBehavioralElement());
		runtimePortInstanceEClass.getESuperTypes().add(theInstancePackage.getPortInstance());
		runtimePortInstanceEClass.getESuperTypes().add(this.getRuntimeBehavioralElement());
		runtimeRoleInstanceEClass.getESuperTypes().add(thePatternPackage.getRole());
		runtimeRoleInstanceEClass.getESuperTypes().add(this.getRuntimeBehavioralElement());
		messageQueueEClass.getESuperTypes().add(theCorePackage_1.getExtendableElement());
		realtimeStatechartInstanceEClass.getESuperTypes().add(theCorePackage_1.getExtendableElement());
		runtimeMessageEClass.getESuperTypes().add(theCorePackage_1.getNamedElement());
		runtimeParameterEClass.getESuperTypes().add(theCorePackage_1.getNamedElement());
		variableBindingEClass.getESuperTypes().add(theCorePackage_1.getExtendableElement());

		// Initialize classes and features; add operations and parameters
		initEClass(runtimeComponentInstanceEClass, RuntimeComponentInstance.class, "RuntimeComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runtimePortInstanceEClass, RuntimePortInstance.class, "RuntimePortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runtimeRoleInstanceEClass, RuntimeRoleInstance.class, "RuntimeRoleInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageQueueEClass, MessageQueue.class, "MessageQueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageQueue_Size(), theEcorePackage.getEInt(), "size", null, 0, 1, MessageQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageQueue_Messages(), this.getRuntimeMessage(), null, "messages", null, 0, -1, MessageQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageQueue_RuntimeBehavioralElement(), this.getRuntimeBehavioralElement(), this.getRuntimeBehavioralElement_MessageQueue(), "runtimeBehavioralElement", null, 1, 1, MessageQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realtimeStatechartInstanceEClass, RealtimeStatechartInstance.class, "RealtimeStatechartInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealtimeStatechartInstance_RuntimeBehavioralElement(), this.getRuntimeBehavioralElement(), this.getRuntimeBehavioralElement_StatechartInstance(), "runtimeBehavioralElement", null, 0, 1, RealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartInstance_InstanceOf(), theRealtimestatechartPackage.getRealtimeStatechart(), null, "instanceOf", null, 1, 1, RealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartInstance_States(), theRealtimestatechartPackage.getState(), null, "states", null, 0, -1, RealtimeStatechartInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartInstance_Active(), theRealtimestatechartPackage.getState(), null, "active", null, 1, 1, RealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartInstance_SubRealtimeStatechartInstances(), this.getRealtimeStatechartInstance(), null, "subRealtimeStatechartInstances", null, 0, -1, RealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartInstance_VariableBindings(), this.getVariableBinding(), null, "variableBindings", null, 0, -1, RealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeMessageEClass, RuntimeMessage.class, "RuntimeMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeMessage_Parameters(), this.getRuntimeParameter(), this.getRuntimeParameter_Message(), "parameters", null, 0, -1, RuntimeMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeParameterEClass, RuntimeParameter.class, "RuntimeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeParameter_Message(), this.getRuntimeMessage(), this.getRuntimeMessage_Parameters(), "message", null, 1, 1, RuntimeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeParameter_Value(), theEcorePackage.getEObject(), null, "value", null, 1, 1, RuntimeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableBindingEClass, VariableBinding.class, "VariableBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableBinding_Attribute(), theCorePackage.getAttribute(), null, "attribute", null, 1, 1, VariableBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableBinding_Value(), theEcorePackage.getEObject(), null, "value", null, 1, 1, VariableBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeBehavioralElementEClass, RuntimeBehavioralElement.class, "RuntimeBehavioralElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeBehavioralElement_StatechartInstance(), this.getRealtimeStatechartInstance(), this.getRealtimeStatechartInstance_RuntimeBehavioralElement(), "statechartInstance", null, 0, 1, RuntimeBehavioralElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeBehavioralElement_MessageQueue(), this.getMessageQueue(), this.getMessageQueue_RuntimeBehavioralElement(), "messageQueue", null, 0, 1, RuntimeBehavioralElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RuntimePackageImpl
