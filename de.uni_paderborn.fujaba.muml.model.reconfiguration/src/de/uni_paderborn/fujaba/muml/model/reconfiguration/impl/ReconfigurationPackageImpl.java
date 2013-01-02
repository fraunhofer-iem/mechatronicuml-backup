/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.StorydiagramsPackage;

import de.uni_paderborn.fujaba.muml.model.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.msgtype.MsgtypePackage;
import de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.Controller;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.Executor;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ExternalReconfigurationExecutionPort;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.InternalReconfigurationExecutionPort;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableComponent;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationCondition;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationController;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationExecutionPort;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationFactory;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessagePort;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPort;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.RuleBasedReconfigurationController;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.expression.ExpressionPackage;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.expression.impl.ExpressionPackageImpl;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.util.ReconfigurationValidator;
import de.uni_paderborn.fujaba.muml.model.types.TypesPackage;
import de.uni_paderborn.fujaba.muml.model.valuetype.ValuetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReconfigurationPackageImpl extends EPackageImpl implements ReconfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurableStructuredComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleBasedReconfigurationControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalReconfigurationExecutionPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalReconfigurationExecutionPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurableComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationMessagePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationExecutionPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executorSpecificationEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerSpecificationEntryEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReconfigurationPackageImpl() {
		super(eNS_URI, ReconfigurationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReconfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReconfigurationPackage init() {
		if (isInited) return (ReconfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI);

		// Obtain or create and register package
		ReconfigurationPackageImpl theReconfigurationPackage = (ReconfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReconfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReconfigurationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ComponentPackage.eINSTANCE.eClass();
		ConstraintPackage.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();
		ProtocolPackage.eINSTANCE.eClass();
		RealtimestatechartPackage.eINSTANCE.eClass();
		MsgtypePackage.eINSTANCE.eClass();
		DeploymentPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		ConnectorPackage.eINSTANCE.eClass();
		ValuetypePackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();
		StorydiagramsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);

		// Create package meta-data objects
		theReconfigurationPackage.createPackageContents();
		theExpressionPackage.createPackageContents();

		// Initialize created meta-data
		theReconfigurationPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theReconfigurationPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ReconfigurationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theReconfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReconfigurationPackage.eNS_URI, theReconfigurationPackage);
		return theReconfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurableStructuredComponent() {
		return reconfigurableStructuredComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurableStructuredComponent_Controllers() {
		return (EReference)reconfigurableStructuredComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurableStructuredComponent_Manager() {
		return (EReference)reconfigurableStructuredComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurableStructuredComponent_Executor() {
		return (EReference)reconfigurableStructuredComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationPort() {
		return reconfigurationPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_StructuredComponent() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationController() {
		return reconfigurationControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleBasedReconfigurationController() {
		return ruleBasedReconfigurationControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleBasedReconfigurationController_Executor() {
		return (EReference)ruleBasedReconfigurationControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleBasedReconfigurationController_Manager() {
		return (EReference)ruleBasedReconfigurationControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalReconfigurationExecutionPort() {
		return externalReconfigurationExecutionPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalReconfigurationExecutionPort_SpecificationEntries() {
		return (EReference)externalReconfigurationExecutionPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalReconfigurationExecutionPort() {
		return internalReconfigurationExecutionPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManager() {
		return managerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManager_SpecificationEntries() {
		return (EReference)managerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManager_ReconfigurationController() {
		return (EReference)managerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutor() {
		return executorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutor_SpecificationEntries() {
		return (EReference)executorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutor_ReconfigurationController() {
		return (EReference)executorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationRule() {
		return reconfigurationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationRule_Parameters() {
		return (EReference)reconfigurationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationRule_ReturnParameters() {
		return (EReference)reconfigurationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationRule_ReconfiguredComponent() {
		return (EReference)reconfigurationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationCondition() {
		return reconfigurationConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationCondition_Parameters() {
		return (EReference)reconfigurationConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurableComponent() {
		return reconfigurableComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationMessagePort() {
		return reconfigurationMessagePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationExecutionPort() {
		return reconfigurationExecutionPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutorSpecificationEntry() {
		return executorSpecificationEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutorSpecificationEntry_Executor() {
		return (EReference)executorSpecificationEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutorSpecificationEntry_ReconfigurationRule() {
		return (EReference)executorSpecificationEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutorSpecificationEntry_ExternallyVisible() {
		return (EAttribute)executorSpecificationEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutorSpecificationEntry_TimeToFailure() {
		return (EAttribute)executorSpecificationEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutorSpecificationEntry_TimeToSuccess() {
		return (EAttribute)executorSpecificationEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagerSpecificationEntry() {
		return managerSpecificationEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerSpecificationEntry_Treat() {
		return (EAttribute)managerSpecificationEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerSpecificationEntry_Propagate() {
		return (EAttribute)managerSpecificationEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerSpecificationEntry_Manager() {
		return (EReference)managerSpecificationEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerSpecificationEntry_MessageType() {
		return (EReference)managerSpecificationEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerSpecificationEntry_Guard() {
		return (EReference)managerSpecificationEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationFactory getReconfigurationFactory() {
		return (ReconfigurationFactory)getEFactoryInstance();
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
		reconfigurableStructuredComponentEClass = createEClass(RECONFIGURABLE_STRUCTURED_COMPONENT);
		createEReference(reconfigurableStructuredComponentEClass, RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLERS);
		createEReference(reconfigurableStructuredComponentEClass, RECONFIGURABLE_STRUCTURED_COMPONENT__MANAGER);
		createEReference(reconfigurableStructuredComponentEClass, RECONFIGURABLE_STRUCTURED_COMPONENT__EXECUTOR);

		reconfigurationPortEClass = createEClass(RECONFIGURATION_PORT);

		controllerEClass = createEClass(CONTROLLER);
		createEReference(controllerEClass, CONTROLLER__STRUCTURED_COMPONENT);

		managerEClass = createEClass(MANAGER);
		createEReference(managerEClass, MANAGER__SPECIFICATION_ENTRIES);
		createEReference(managerEClass, MANAGER__RECONFIGURATION_CONTROLLER);

		executorEClass = createEClass(EXECUTOR);
		createEReference(executorEClass, EXECUTOR__SPECIFICATION_ENTRIES);
		createEReference(executorEClass, EXECUTOR__RECONFIGURATION_CONTROLLER);

		reconfigurationRuleEClass = createEClass(RECONFIGURATION_RULE);
		createEReference(reconfigurationRuleEClass, RECONFIGURATION_RULE__PARAMETERS);
		createEReference(reconfigurationRuleEClass, RECONFIGURATION_RULE__RETURN_PARAMETERS);
		createEReference(reconfigurationRuleEClass, RECONFIGURATION_RULE__RECONFIGURED_COMPONENT);

		reconfigurationConditionEClass = createEClass(RECONFIGURATION_CONDITION);
		createEReference(reconfigurationConditionEClass, RECONFIGURATION_CONDITION__PARAMETERS);

		reconfigurableComponentEClass = createEClass(RECONFIGURABLE_COMPONENT);

		reconfigurationMessagePortEClass = createEClass(RECONFIGURATION_MESSAGE_PORT);

		reconfigurationExecutionPortEClass = createEClass(RECONFIGURATION_EXECUTION_PORT);

		executorSpecificationEntryEClass = createEClass(EXECUTOR_SPECIFICATION_ENTRY);
		createEReference(executorSpecificationEntryEClass, EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR);
		createEReference(executorSpecificationEntryEClass, EXECUTOR_SPECIFICATION_ENTRY__RECONFIGURATION_RULE);
		createEAttribute(executorSpecificationEntryEClass, EXECUTOR_SPECIFICATION_ENTRY__EXTERNALLY_VISIBLE);
		createEAttribute(executorSpecificationEntryEClass, EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_FAILURE);
		createEAttribute(executorSpecificationEntryEClass, EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_SUCCESS);

		managerSpecificationEntryEClass = createEClass(MANAGER_SPECIFICATION_ENTRY);
		createEAttribute(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__TREAT);
		createEAttribute(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__PROPAGATE);
		createEReference(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__MANAGER);
		createEReference(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__MESSAGE_TYPE);
		createEReference(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__GUARD);

		reconfigurationControllerEClass = createEClass(RECONFIGURATION_CONTROLLER);

		ruleBasedReconfigurationControllerEClass = createEClass(RULE_BASED_RECONFIGURATION_CONTROLLER);
		createEReference(ruleBasedReconfigurationControllerEClass, RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR);
		createEReference(ruleBasedReconfigurationControllerEClass, RULE_BASED_RECONFIGURATION_CONTROLLER__MANAGER);

		externalReconfigurationExecutionPortEClass = createEClass(EXTERNAL_RECONFIGURATION_EXECUTION_PORT);
		createEReference(externalReconfigurationExecutionPortEClass, EXTERNAL_RECONFIGURATION_EXECUTION_PORT__SPECIFICATION_ENTRIES);

		internalReconfigurationExecutionPortEClass = createEClass(INTERNAL_RECONFIGURATION_EXECUTION_PORT);
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
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
		ComponentPackage theComponentPackage = (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		MsgtypePackage theMsgtypePackage = (MsgtypePackage)EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theExpressionPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reconfigurableStructuredComponentEClass.getESuperTypes().add(theComponentPackage.getStructuredComponent());
		reconfigurableStructuredComponentEClass.getESuperTypes().add(this.getReconfigurableComponent());
		reconfigurationPortEClass.getESuperTypes().add(theComponentPackage.getDiscretePort());
		controllerEClass.getESuperTypes().add(theBehaviorPackage.getBehavioralElement());
		controllerEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		controllerEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		managerEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		executorEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		reconfigurationRuleEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		reconfigurationRuleEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		reconfigurationConditionEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		reconfigurationConditionEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		reconfigurationMessagePortEClass.getESuperTypes().add(this.getReconfigurationPort());
		reconfigurationExecutionPortEClass.getESuperTypes().add(this.getReconfigurationPort());
		executorSpecificationEntryEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		managerSpecificationEntryEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		reconfigurationControllerEClass.getESuperTypes().add(this.getController());
		ruleBasedReconfigurationControllerEClass.getESuperTypes().add(this.getReconfigurationController());
		externalReconfigurationExecutionPortEClass.getESuperTypes().add(this.getReconfigurationExecutionPort());
		internalReconfigurationExecutionPortEClass.getESuperTypes().add(this.getReconfigurationExecutionPort());

		// Initialize classes and features; add operations and parameters
		initEClass(reconfigurableStructuredComponentEClass, ReconfigurableStructuredComponent.class, "ReconfigurableStructuredComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurableStructuredComponent_Controllers(), this.getController(), this.getController_StructuredComponent(), "controllers", null, 0, -1, ReconfigurableStructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReconfigurableStructuredComponent_Manager(), this.getManager(), null, "manager", null, 0, 1, ReconfigurableStructuredComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurableStructuredComponent_Executor(), this.getExecutor(), null, "executor", null, 0, 1, ReconfigurableStructuredComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationPortEClass, ReconfigurationPort.class, "ReconfigurationPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllerEClass, Controller.class, "Controller", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getController_StructuredComponent(), this.getReconfigurableStructuredComponent(), this.getReconfigurableStructuredComponent_Controllers(), "structuredComponent", null, 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managerEClass, Manager.class, "Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManager_SpecificationEntries(), this.getManagerSpecificationEntry(), this.getManagerSpecificationEntry_Manager(), "specificationEntries", null, 0, -1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_ReconfigurationController(), this.getRuleBasedReconfigurationController(), this.getRuleBasedReconfigurationController_Manager(), "reconfigurationController", null, 1, 1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executorEClass, Executor.class, "Executor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutor_SpecificationEntries(), this.getExecutorSpecificationEntry(), this.getExecutorSpecificationEntry_Executor(), "specificationEntries", null, 1, -1, Executor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutor_ReconfigurationController(), this.getRuleBasedReconfigurationController(), this.getRuleBasedReconfigurationController_Executor(), "reconfigurationController", null, 1, 1, Executor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationRuleEClass, ReconfigurationRule.class, "ReconfigurationRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationRule_Parameters(), theBehaviorPackage.getParameter(), null, "parameters", null, 0, -1, ReconfigurationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationRule_ReturnParameters(), theBehaviorPackage.getParameter(), null, "returnParameters", null, 0, -1, ReconfigurationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationRule_ReconfiguredComponent(), this.getReconfigurableComponent(), null, "reconfiguredComponent", null, 0, 1, ReconfigurationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationConditionEClass, ReconfigurationCondition.class, "ReconfigurationCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationCondition_Parameters(), theBehaviorPackage.getParameter(), null, "parameters", null, 0, -1, ReconfigurationCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurableComponentEClass, ReconfigurableComponent.class, "ReconfigurableComponent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reconfigurationMessagePortEClass, ReconfigurationMessagePort.class, "ReconfigurationMessagePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reconfigurationExecutionPortEClass, ReconfigurationExecutionPort.class, "ReconfigurationExecutionPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executorSpecificationEntryEClass, ExecutorSpecificationEntry.class, "ExecutorSpecificationEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutorSpecificationEntry_Executor(), this.getExecutor(), this.getExecutor_SpecificationEntries(), "executor", null, 1, 1, ExecutorSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutorSpecificationEntry_ReconfigurationRule(), this.getReconfigurationRule(), null, "reconfigurationRule", null, 1, 1, ExecutorSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutorSpecificationEntry_ExternallyVisible(), theEcorePackage.getEBoolean(), "externallyVisible", "true", 0, 1, ExecutorSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutorSpecificationEntry_TimeToFailure(), ecorePackage.getEInt(), "timeToFailure", "0", 0, 1, ExecutorSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutorSpecificationEntry_TimeToSuccess(), ecorePackage.getEInt(), "timeToSuccess", "0", 0, 1, ExecutorSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managerSpecificationEntryEClass, ManagerSpecificationEntry.class, "ManagerSpecificationEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManagerSpecificationEntry_Treat(), ecorePackage.getEBoolean(), "treat", "true", 0, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerSpecificationEntry_Propagate(), ecorePackage.getEBoolean(), "propagate", "false", 0, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerSpecificationEntry_Manager(), this.getManager(), this.getManager_SpecificationEntries(), "manager", null, 1, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerSpecificationEntry_MessageType(), theMsgtypePackage.getMessageType(), null, "messageType", null, 1, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerSpecificationEntry_Guard(), this.getReconfigurationCondition(), null, "guard", null, 0, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationControllerEClass, ReconfigurationController.class, "ReconfigurationController", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ruleBasedReconfigurationControllerEClass, RuleBasedReconfigurationController.class, "RuleBasedReconfigurationController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleBasedReconfigurationController_Executor(), this.getExecutor(), this.getExecutor_ReconfigurationController(), "executor", null, 1, 1, RuleBasedReconfigurationController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleBasedReconfigurationController_Manager(), this.getManager(), this.getManager_ReconfigurationController(), "manager", null, 1, 1, RuleBasedReconfigurationController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalReconfigurationExecutionPortEClass, ExternalReconfigurationExecutionPort.class, "ExternalReconfigurationExecutionPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalReconfigurationExecutionPort_SpecificationEntries(), this.getExecutorSpecificationEntry(), null, "specificationEntries", null, 1, -1, ExternalReconfigurationExecutionPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(internalReconfigurationExecutionPortEClass, InternalReconfigurationExecutionPort.class, "InternalReconfigurationExecutionPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

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
		  (executorSpecificationEntryEClass, 
		   source, 
		   new String[] {
			 "constraints", "TimeToFailureLessOrEqualToTimeToSuccess"
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
		  (getReconfigurableStructuredComponent_Manager(), 
		   source, 
		   new String[] {
			 "derivation", "self.controllers -> select(m | m.oclIsKindOf(Manager)) ->any(true)"
		   });		
		addAnnotation
		  (getReconfigurableStructuredComponent_Executor(), 
		   source, 
		   new String[] {
			 "derivation", "self.controllers -> select(m | m.oclIsKindOf(Executor)) ->any(true)"
		   });							
		addAnnotation
		  (executorSpecificationEntryEClass, 
		   source, 
		   new String[] {
			 "TimeToFailureLessOrEqualToTimeToSuccess", "self.timeToFailure <= self.timeToSuccess"
		   });		
		addAnnotation
		  (getExternalReconfigurationExecutionPort_SpecificationEntries(), 
		   source, 
		   new String[] {
			 "derivation", "((((self.component.oclAsType(ReconfigurableStructuredComponent)).controllers -> select(m | m.oclIsKindOf(RuleBasedReconfigurationController))) -> any(true)).oclAsType(RuleBasedReconfigurationController)).executor.specificationEntries -> select(externallyVisible)"
		   });
	}

} //ReconfigurationPackageImpl
