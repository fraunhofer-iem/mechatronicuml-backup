/**
 */
package org.muml.reconfiguration.reconfInstance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.pim.PimPackage;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.instance.InstancePackage;
import org.muml.reconfiguration.ReconfigurationPackage;
import org.muml.reconfiguration.expression.ExpressionPackage;
import org.muml.reconfiguration.expression.impl.ExpressionPackageImpl;
import org.muml.reconfiguration.impl.ReconfigurationPackageImpl;
import org.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage;
import org.muml.reconfiguration.protocolinstantiation.impl.ProtocolinstantiationPackageImpl;
import org.muml.reconfiguration.reconfInstance.ControllerInstance;
import org.muml.reconfiguration.reconfInstance.ExecutorInstance;
import org.muml.reconfiguration.reconfInstance.InternalReconfigurationCommunicationPortInstance;
import org.muml.reconfiguration.reconfInstance.ManagerInstance;
import org.muml.reconfiguration.reconfInstance.ReconfInstanceFactory;
import org.muml.reconfiguration.reconfInstance.ReconfInstancePackage;
import org.muml.reconfiguration.reconfInstance.ReconfigurableAtomicComponentInstance;
import org.muml.reconfiguration.reconfInstance.ReconfigurableComponentInstance;
import org.muml.reconfiguration.reconfInstance.ReconfigurableStructuredComponentInstance;
import org.muml.reconfiguration.reconfInstance.ReconfigurationControllerInstance;
import org.muml.reconfiguration.reconfInstance.ReconfigurationExecutionPortInstance;
import org.muml.reconfiguration.reconfInstance.ReconfigurationMessagePortInstance;
import org.muml.reconfiguration.reconfInstance.ReconfigurationPortInstance;
import org.muml.reconfiguration.reconfInstance.RuleBasedReconfigurationControllerInstance;
import org.muml.reconfiguration.structdatatype.StructdatatypePackage;
import org.muml.reconfiguration.structdatatype.impl.StructdatatypePackageImpl;
import org.muml.storydiagram.StorydiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReconfInstancePackageImpl extends EPackageImpl implements ReconfInstancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurableComponentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationPortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationMessagePortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationExecutionPortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalReconfigurationCommunicationPortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationControllerInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleBasedReconfigurationControllerInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executorInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurableAtomicComponentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurableStructuredComponentInstanceEClass = null;

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
	 * @see org.muml.reconfiguration.reconfInstance.ReconfInstancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReconfInstancePackageImpl() {
		super(eNS_URI, ReconfInstanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReconfInstancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReconfInstancePackage init() {
		if (isInited) return (ReconfInstancePackage)EPackage.Registry.INSTANCE.getEPackage(ReconfInstancePackage.eNS_URI);

		// Obtain or create and register package
		ReconfInstancePackageImpl theReconfInstancePackage = (ReconfInstancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReconfInstancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReconfInstancePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PimPackage.eINSTANCE.eClass();
		StorydiagramPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ReconfigurationPackageImpl theReconfigurationPackage = (ReconfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI) instanceof ReconfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI) : ReconfigurationPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);
		StructdatatypePackageImpl theStructdatatypePackage = (StructdatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructdatatypePackage.eNS_URI) instanceof StructdatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructdatatypePackage.eNS_URI) : StructdatatypePackage.eINSTANCE);
		ProtocolinstantiationPackageImpl theProtocolinstantiationPackage = (ProtocolinstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProtocolinstantiationPackage.eNS_URI) instanceof ProtocolinstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProtocolinstantiationPackage.eNS_URI) : ProtocolinstantiationPackage.eINSTANCE);

		// Create package meta-data objects
		theReconfInstancePackage.createPackageContents();
		theReconfigurationPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theStructdatatypePackage.createPackageContents();
		theProtocolinstantiationPackage.createPackageContents();

		// Initialize created meta-data
		theReconfInstancePackage.initializePackageContents();
		theReconfigurationPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theStructdatatypePackage.initializePackageContents();
		theProtocolinstantiationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReconfInstancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReconfInstancePackage.eNS_URI, theReconfInstancePackage);
		return theReconfInstancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurableComponentInstance() {
		return reconfigurableComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationPortInstance() {
		return reconfigurationPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationMessagePortInstance() {
		return reconfigurationMessagePortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationExecutionPortInstance() {
		return reconfigurationExecutionPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalReconfigurationCommunicationPortInstance() {
		return internalReconfigurationCommunicationPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationControllerInstance() {
		return reconfigurationControllerInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerInstance() {
		return controllerInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleBasedReconfigurationControllerInstance() {
		return ruleBasedReconfigurationControllerInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleBasedReconfigurationControllerInstance_ManagerInstance() {
		return (EReference)ruleBasedReconfigurationControllerInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleBasedReconfigurationControllerInstance_ExecutorInstance() {
		return (EReference)ruleBasedReconfigurationControllerInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagerInstance() {
		return managerInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerInstance_Manager() {
		return (EReference)managerInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerInstance_ReconfigurationControllerInstance() {
		return (EReference)managerInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerInstance_PortInstances() {
		return (EReference)managerInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutorInstance() {
		return executorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutorInstance_Executor() {
		return (EReference)executorInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutorInstance_ReconfigurationControllerInstance() {
		return (EReference)executorInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutorInstance_PortInstances() {
		return (EReference)executorInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurableAtomicComponentInstance() {
		return reconfigurableAtomicComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurableStructuredComponentInstance() {
		return reconfigurableStructuredComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurableStructuredComponentInstance_ControllerInstance() {
		return (EReference)reconfigurableStructuredComponentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfInstanceFactory getReconfInstanceFactory() {
		return (ReconfInstanceFactory)getEFactoryInstance();
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
		reconfigurableComponentInstanceEClass = createEClass(RECONFIGURABLE_COMPONENT_INSTANCE);

		reconfigurationPortInstanceEClass = createEClass(RECONFIGURATION_PORT_INSTANCE);

		reconfigurationMessagePortInstanceEClass = createEClass(RECONFIGURATION_MESSAGE_PORT_INSTANCE);

		reconfigurationExecutionPortInstanceEClass = createEClass(RECONFIGURATION_EXECUTION_PORT_INSTANCE);

		internalReconfigurationCommunicationPortInstanceEClass = createEClass(INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE);

		reconfigurationControllerInstanceEClass = createEClass(RECONFIGURATION_CONTROLLER_INSTANCE);

		controllerInstanceEClass = createEClass(CONTROLLER_INSTANCE);

		ruleBasedReconfigurationControllerInstanceEClass = createEClass(RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE);
		createEReference(ruleBasedReconfigurationControllerInstanceEClass, RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__MANAGER_INSTANCE);
		createEReference(ruleBasedReconfigurationControllerInstanceEClass, RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__EXECUTOR_INSTANCE);

		managerInstanceEClass = createEClass(MANAGER_INSTANCE);
		createEReference(managerInstanceEClass, MANAGER_INSTANCE__MANAGER);
		createEReference(managerInstanceEClass, MANAGER_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE);
		createEReference(managerInstanceEClass, MANAGER_INSTANCE__PORT_INSTANCES);

		executorInstanceEClass = createEClass(EXECUTOR_INSTANCE);
		createEReference(executorInstanceEClass, EXECUTOR_INSTANCE__EXECUTOR);
		createEReference(executorInstanceEClass, EXECUTOR_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE);
		createEReference(executorInstanceEClass, EXECUTOR_INSTANCE__PORT_INSTANCES);

		reconfigurableAtomicComponentInstanceEClass = createEClass(RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE);

		reconfigurableStructuredComponentInstanceEClass = createEClass(RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE);
		createEReference(reconfigurableStructuredComponentInstanceEClass, RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__CONTROLLER_INSTANCE);
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
		ConnectorPackage theConnectorPackage = (ConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ReconfigurationPackage theReconfigurationPackage = (ReconfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reconfigurableComponentInstanceEClass.getESuperTypes().add(theInstancePackage.getComponentInstance());
		reconfigurationPortInstanceEClass.getESuperTypes().add(theInstancePackage.getPortInstance());
		reconfigurationPortInstanceEClass.getESuperTypes().add(theConnectorPackage.getDiscreteInteractionEndpointInstance());
		reconfigurationMessagePortInstanceEClass.getESuperTypes().add(this.getReconfigurationPortInstance());
		reconfigurationExecutionPortInstanceEClass.getESuperTypes().add(this.getReconfigurationPortInstance());
		internalReconfigurationCommunicationPortInstanceEClass.getESuperTypes().add(this.getReconfigurationPortInstance());
		reconfigurationControllerInstanceEClass.getESuperTypes().add(this.getControllerInstance());
		controllerInstanceEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		ruleBasedReconfigurationControllerInstanceEClass.getESuperTypes().add(this.getReconfigurationControllerInstance());
		managerInstanceEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		executorInstanceEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		reconfigurableAtomicComponentInstanceEClass.getESuperTypes().add(theInstancePackage.getAtomicComponentInstance());
		reconfigurableStructuredComponentInstanceEClass.getESuperTypes().add(theInstancePackage.getStructuredComponentInstance());

		// Initialize classes, features, and operations; add parameters
		initEClass(reconfigurableComponentInstanceEClass, ReconfigurableComponentInstance.class, "ReconfigurableComponentInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reconfigurationPortInstanceEClass, ReconfigurationPortInstance.class, "ReconfigurationPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reconfigurationMessagePortInstanceEClass, ReconfigurationMessagePortInstance.class, "ReconfigurationMessagePortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reconfigurationExecutionPortInstanceEClass, ReconfigurationExecutionPortInstance.class, "ReconfigurationExecutionPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(internalReconfigurationCommunicationPortInstanceEClass, InternalReconfigurationCommunicationPortInstance.class, "InternalReconfigurationCommunicationPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reconfigurationControllerInstanceEClass, ReconfigurationControllerInstance.class, "ReconfigurationControllerInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllerInstanceEClass, ControllerInstance.class, "ControllerInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ruleBasedReconfigurationControllerInstanceEClass, RuleBasedReconfigurationControllerInstance.class, "RuleBasedReconfigurationControllerInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleBasedReconfigurationControllerInstance_ManagerInstance(), this.getManagerInstance(), this.getManagerInstance_ReconfigurationControllerInstance(), "managerInstance", null, 1, 1, RuleBasedReconfigurationControllerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleBasedReconfigurationControllerInstance_ExecutorInstance(), this.getExecutorInstance(), this.getExecutorInstance_ReconfigurationControllerInstance(), "executorInstance", null, 1, 1, RuleBasedReconfigurationControllerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managerInstanceEClass, ManagerInstance.class, "ManagerInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManagerInstance_Manager(), theReconfigurationPackage.getManager(), null, "manager", null, 1, 1, ManagerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerInstance_ReconfigurationControllerInstance(), this.getRuleBasedReconfigurationControllerInstance(), this.getRuleBasedReconfigurationControllerInstance_ManagerInstance(), "reconfigurationControllerInstance", null, 0, 1, ManagerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerInstance_PortInstances(), this.getReconfigurationPortInstance(), null, "portInstances", null, 0, -1, ManagerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executorInstanceEClass, ExecutorInstance.class, "ExecutorInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutorInstance_Executor(), theReconfigurationPackage.getExecutor(), null, "executor", null, 1, 1, ExecutorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutorInstance_ReconfigurationControllerInstance(), this.getRuleBasedReconfigurationControllerInstance(), this.getRuleBasedReconfigurationControllerInstance_ExecutorInstance(), "reconfigurationControllerInstance", null, 0, 1, ExecutorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutorInstance_PortInstances(), this.getReconfigurationPortInstance(), null, "portInstances", null, 0, -1, ExecutorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurableAtomicComponentInstanceEClass, ReconfigurableAtomicComponentInstance.class, "ReconfigurableAtomicComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reconfigurableStructuredComponentInstanceEClass, ReconfigurableStructuredComponentInstance.class, "ReconfigurableStructuredComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurableStructuredComponentInstance_ControllerInstance(), this.getControllerInstance(), null, "controllerInstance", null, 0, 1, ReconfigurableStructuredComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
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
	}

} //ReconfInstancePackageImpl
