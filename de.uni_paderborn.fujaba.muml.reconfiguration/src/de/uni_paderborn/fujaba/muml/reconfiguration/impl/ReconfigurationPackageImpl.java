/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.StorydiagramsPackage;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.Controller;
import de.uni_paderborn.fujaba.muml.reconfiguration.Executor;
import de.uni_paderborn.fujaba.muml.reconfiguration.ExecutorSpecificationEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.Manager;
import de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableComponent;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationController;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationFactory;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessageTypeEnum;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPort;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule;
import de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController;
import de.uni_paderborn.fujaba.muml.reconfiguration.Signature;
import de.uni_paderborn.fujaba.muml.reconfiguration.StructuralCondition;
import de.uni_paderborn.fujaba.muml.reconfiguration.expression.ExpressionPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ExpressionPackageImpl;
import de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructdatatypePackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.impl.StructdatatypePackageImpl;
import de.uni_paderborn.fujaba.muml.reconfiguration.util.ReconfigurationValidator;
import de.uni_paderborn.fujaba.muml.types.TypesPackage;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

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
	private EClass reconfigurationPortInterfaceEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationMessagePortInterfaceEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationExecutionPortInterfaceEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reconfigurationMessageTypeEnumEEnum = null;

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
	private EClass structuralConditionEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#eNS_URI
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
		StructdatatypePackageImpl theStructdatatypePackage = (StructdatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructdatatypePackage.eNS_URI) instanceof StructdatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructdatatypePackage.eNS_URI) : StructdatatypePackage.eINSTANCE);

		// Create package meta-data objects
		theReconfigurationPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theStructdatatypePackage.createPackageContents();

		// Initialize created meta-data
		theReconfigurationPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theStructdatatypePackage.initializePackageContents();

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
	public EReference getReconfigurableStructuredComponent_Controller() {
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
	public EReference getReconfigurableStructuredComponent_InitialConfiguration() {
		return (EReference)reconfigurableStructuredComponentEClass.getEStructuralFeatures().get(3);
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
	public EClass getReconfigurationPortInterfaceEntry() {
		return reconfigurationPortInterfaceEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationPortInterfaceEntry_Description() {
		return (EAttribute)reconfigurationPortInterfaceEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationPortInterfaceEntry_MessageType() {
		return (EReference)reconfigurationPortInterfaceEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationMessagePortInterfaceEntry() {
		return reconfigurationMessagePortInterfaceEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationMessagePortInterfaceEntry_ReconfigurationMessageType() {
		return (EAttribute)reconfigurationMessagePortInterfaceEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationMessagePortInterfaceEntry_ExpectedResponseTime() {
		return (EReference)reconfigurationMessagePortInterfaceEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationMessagePortInterfaceEntry_ReconfigurationMessagePort() {
		return (EReference)reconfigurationMessagePortInterfaceEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationExecutionPortInterfaceEntry() {
		return reconfigurationExecutionPortInterfaceEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationExecutionPortInterfaceEntry_TimeForDecision() {
		return (EReference)reconfigurationExecutionPortInterfaceEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationExecutionPortInterfaceEntry_TimeForExecution() {
		return (EReference)reconfigurationExecutionPortInterfaceEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationExecutionPortInterfaceEntry_ReconfigurationExecutionPort() {
		return (EReference)reconfigurationExecutionPortInterfaceEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignature() {
		return signatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_Parameters() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_ReturnParameters() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_ReconfigurationRule() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReconfigurationMessageTypeEnum() {
		return reconfigurationMessageTypeEnumEEnum;
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
	public EReference getManager_Ports() {
		return (EReference)managerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManager_ReconfigurationMessagePorts() {
		return (EReference)managerEClass.getEStructuralFeatures().get(3);
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
	public EReference getExecutor_Ports() {
		return (EReference)executorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutor_ReconfigurationExecutionPorts() {
		return (EReference)executorEClass.getEStructuralFeatures().get(3);
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
	public EReference getReconfigurationRule_ReconfiguredComponent() {
		return (EReference)reconfigurationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationRule_Wcet() {
		return (EReference)reconfigurationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationRule_Signature() {
		return (EReference)reconfigurationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationRule_Name() {
		return (EAttribute)reconfigurationRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralCondition() {
		return structuralConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralCondition_Parameters() {
		return (EReference)structuralConditionEClass.getEStructuralFeatures().get(0);
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
	public EReference getReconfigurationMessagePort_InterfaceEntries() {
		return (EReference)reconfigurationMessagePortEClass.getEStructuralFeatures().get(0);
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
	public EReference getReconfigurationExecutionPort_InterfaceEntries() {
		return (EReference)reconfigurationExecutionPortEClass.getEStructuralFeatures().get(0);
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
	public EReference getManagerSpecificationEntry_StructuralCondition() {
		return (EReference)managerSpecificationEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerSpecificationEntry_ReconfigurationRule() {
		return (EReference)managerSpecificationEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerSpecificationEntry_InvokePlanner() {
		return (EAttribute)managerSpecificationEntryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerSpecificationEntry_TimeForPlanning() {
		return (EReference)managerSpecificationEntryEClass.getEStructuralFeatures().get(7);
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
		createEReference(reconfigurableStructuredComponentEClass, RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLER);
		createEReference(reconfigurableStructuredComponentEClass, RECONFIGURABLE_STRUCTURED_COMPONENT__MANAGER);
		createEReference(reconfigurableStructuredComponentEClass, RECONFIGURABLE_STRUCTURED_COMPONENT__EXECUTOR);
		createEReference(reconfigurableStructuredComponentEClass, RECONFIGURABLE_STRUCTURED_COMPONENT__INITIAL_CONFIGURATION);

		reconfigurationPortEClass = createEClass(RECONFIGURATION_PORT);

		controllerEClass = createEClass(CONTROLLER);
		createEReference(controllerEClass, CONTROLLER__STRUCTURED_COMPONENT);

		managerEClass = createEClass(MANAGER);
		createEReference(managerEClass, MANAGER__SPECIFICATION_ENTRIES);
		createEReference(managerEClass, MANAGER__RECONFIGURATION_CONTROLLER);
		createEReference(managerEClass, MANAGER__PORTS);
		createEReference(managerEClass, MANAGER__RECONFIGURATION_MESSAGE_PORTS);

		executorEClass = createEClass(EXECUTOR);
		createEReference(executorEClass, EXECUTOR__SPECIFICATION_ENTRIES);
		createEReference(executorEClass, EXECUTOR__RECONFIGURATION_CONTROLLER);
		createEReference(executorEClass, EXECUTOR__PORTS);
		createEReference(executorEClass, EXECUTOR__RECONFIGURATION_EXECUTION_PORTS);

		reconfigurationRuleEClass = createEClass(RECONFIGURATION_RULE);
		createEReference(reconfigurationRuleEClass, RECONFIGURATION_RULE__RECONFIGURED_COMPONENT);
		createEReference(reconfigurationRuleEClass, RECONFIGURATION_RULE__WCET);
		createEReference(reconfigurationRuleEClass, RECONFIGURATION_RULE__SIGNATURE);
		createEAttribute(reconfigurationRuleEClass, RECONFIGURATION_RULE__NAME);

		structuralConditionEClass = createEClass(STRUCTURAL_CONDITION);
		createEReference(structuralConditionEClass, STRUCTURAL_CONDITION__PARAMETERS);

		reconfigurableComponentEClass = createEClass(RECONFIGURABLE_COMPONENT);

		reconfigurationMessagePortEClass = createEClass(RECONFIGURATION_MESSAGE_PORT);
		createEReference(reconfigurationMessagePortEClass, RECONFIGURATION_MESSAGE_PORT__INTERFACE_ENTRIES);

		reconfigurationExecutionPortEClass = createEClass(RECONFIGURATION_EXECUTION_PORT);
		createEReference(reconfigurationExecutionPortEClass, RECONFIGURATION_EXECUTION_PORT__INTERFACE_ENTRIES);

		executorSpecificationEntryEClass = createEClass(EXECUTOR_SPECIFICATION_ENTRY);
		createEReference(executorSpecificationEntryEClass, EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR);
		createEReference(executorSpecificationEntryEClass, EXECUTOR_SPECIFICATION_ENTRY__RECONFIGURATION_RULE);

		managerSpecificationEntryEClass = createEClass(MANAGER_SPECIFICATION_ENTRY);
		createEAttribute(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__TREAT);
		createEAttribute(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__PROPAGATE);
		createEReference(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__MANAGER);
		createEReference(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__MESSAGE_TYPE);
		createEReference(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__STRUCTURAL_CONDITION);
		createEReference(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__RECONFIGURATION_RULE);
		createEAttribute(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__INVOKE_PLANNER);
		createEReference(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__TIME_FOR_PLANNING);

		reconfigurationControllerEClass = createEClass(RECONFIGURATION_CONTROLLER);

		ruleBasedReconfigurationControllerEClass = createEClass(RULE_BASED_RECONFIGURATION_CONTROLLER);
		createEReference(ruleBasedReconfigurationControllerEClass, RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR);
		createEReference(ruleBasedReconfigurationControllerEClass, RULE_BASED_RECONFIGURATION_CONTROLLER__MANAGER);

		reconfigurationPortInterfaceEntryEClass = createEClass(RECONFIGURATION_PORT_INTERFACE_ENTRY);
		createEAttribute(reconfigurationPortInterfaceEntryEClass, RECONFIGURATION_PORT_INTERFACE_ENTRY__DESCRIPTION);
		createEReference(reconfigurationPortInterfaceEntryEClass, RECONFIGURATION_PORT_INTERFACE_ENTRY__MESSAGE_TYPE);

		reconfigurationMessagePortInterfaceEntryEClass = createEClass(RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY);
		createEAttribute(reconfigurationMessagePortInterfaceEntryEClass, RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_TYPE);
		createEReference(reconfigurationMessagePortInterfaceEntryEClass, RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME);
		createEReference(reconfigurationMessagePortInterfaceEntryEClass, RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_PORT);

		reconfigurationExecutionPortInterfaceEntryEClass = createEClass(RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY);
		createEReference(reconfigurationExecutionPortInterfaceEntryEClass, RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_DECISION);
		createEReference(reconfigurationExecutionPortInterfaceEntryEClass, RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_EXECUTION);
		createEReference(reconfigurationExecutionPortInterfaceEntryEClass, RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RECONFIGURATION_EXECUTION_PORT);

		signatureEClass = createEClass(SIGNATURE);
		createEReference(signatureEClass, SIGNATURE__PARAMETERS);
		createEReference(signatureEClass, SIGNATURE__RETURN_PARAMETERS);
		createEReference(signatureEClass, SIGNATURE__RECONFIGURATION_RULE);

		// Create enums
		reconfigurationMessageTypeEnumEEnum = createEEnum(RECONFIGURATION_MESSAGE_TYPE_ENUM);
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
		StructdatatypePackage theStructdatatypePackage = (StructdatatypePackage)EPackage.Registry.INSTANCE.getEPackage(StructdatatypePackage.eNS_URI);
		ComponentPackage theComponentPackage = (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		MsgtypePackage theMsgtypePackage = (MsgtypePackage)EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theExpressionPackage);
		getESubpackages().add(theStructdatatypePackage);

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
		managerEClass.getESuperTypes().add(theBehaviorPackage.getBehavioralElement());
		executorEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		executorEClass.getESuperTypes().add(theBehaviorPackage.getBehavioralElement());
		reconfigurationRuleEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		structuralConditionEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		structuralConditionEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		reconfigurableComponentEClass.getESuperTypes().add(theComponentPackage.getComponent());
		reconfigurationMessagePortEClass.getESuperTypes().add(this.getReconfigurationPort());
		reconfigurationExecutionPortEClass.getESuperTypes().add(this.getReconfigurationPort());
		executorSpecificationEntryEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		managerSpecificationEntryEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		reconfigurationControllerEClass.getESuperTypes().add(this.getController());
		ruleBasedReconfigurationControllerEClass.getESuperTypes().add(this.getReconfigurationController());
		reconfigurationPortInterfaceEntryEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		reconfigurationMessagePortInterfaceEntryEClass.getESuperTypes().add(this.getReconfigurationPortInterfaceEntry());
		reconfigurationExecutionPortInterfaceEntryEClass.getESuperTypes().add(this.getReconfigurationPortInterfaceEntry());
		signatureEClass.getESuperTypes().add(theCorePackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(reconfigurableStructuredComponentEClass, ReconfigurableStructuredComponent.class, "ReconfigurableStructuredComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurableStructuredComponent_Controller(), this.getController(), this.getController_StructuredComponent(), "controller", null, 0, 1, ReconfigurableStructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReconfigurableStructuredComponent_Manager(), this.getManager(), null, "manager", null, 0, 1, ReconfigurableStructuredComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurableStructuredComponent_Executor(), this.getExecutor(), null, "executor", null, 0, 1, ReconfigurableStructuredComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurableStructuredComponent_InitialConfiguration(), theInstancePackage.getComponentInstanceConfiguration(), null, "initialConfiguration", null, 0, 1, ReconfigurableStructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationPortEClass, ReconfigurationPort.class, "ReconfigurationPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllerEClass, Controller.class, "Controller", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getController_StructuredComponent(), this.getReconfigurableStructuredComponent(), this.getReconfigurableStructuredComponent_Controller(), "structuredComponent", null, 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managerEClass, Manager.class, "Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManager_SpecificationEntries(), this.getManagerSpecificationEntry(), this.getManagerSpecificationEntry_Manager(), "specificationEntries", null, 0, -1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_ReconfigurationController(), this.getRuleBasedReconfigurationController(), this.getRuleBasedReconfigurationController_Manager(), "reconfigurationController", null, 1, 1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_Ports(), theComponentPackage.getDiscretePort(), null, "ports", null, 0, -1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_ReconfigurationMessagePorts(), this.getReconfigurationMessagePort(), null, "reconfigurationMessagePorts", null, 0, -1, Manager.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(executorEClass, Executor.class, "Executor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutor_SpecificationEntries(), this.getExecutorSpecificationEntry(), this.getExecutorSpecificationEntry_Executor(), "specificationEntries", null, 1, -1, Executor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutor_ReconfigurationController(), this.getRuleBasedReconfigurationController(), this.getRuleBasedReconfigurationController_Executor(), "reconfigurationController", null, 1, 1, Executor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutor_Ports(), theComponentPackage.getDiscretePort(), null, "ports", null, 0, -1, Executor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutor_ReconfigurationExecutionPorts(), this.getReconfigurationExecutionPort(), null, "reconfigurationExecutionPorts", null, 0, -1, Executor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationRuleEClass, ReconfigurationRule.class, "ReconfigurationRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationRule_ReconfiguredComponent(), this.getReconfigurableComponent(), null, "reconfiguredComponent", null, 0, 1, ReconfigurationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationRule_Wcet(), theValuetypePackage.getTimeValue(), null, "wcet", null, 0, 1, ReconfigurationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationRule_Signature(), this.getSignature(), this.getSignature_ReconfigurationRule(), "signature", null, 1, 1, ReconfigurationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationRule_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ReconfigurationRule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(structuralConditionEClass, StructuralCondition.class, "StructuralCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuralCondition_Parameters(), theBehaviorPackage.getParameter(), null, "parameters", null, 0, -1, StructuralCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurableComponentEClass, ReconfigurableComponent.class, "ReconfigurableComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reconfigurationMessagePortEClass, ReconfigurationMessagePort.class, "ReconfigurationMessagePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationMessagePort_InterfaceEntries(), this.getReconfigurationMessagePortInterfaceEntry(), this.getReconfigurationMessagePortInterfaceEntry_ReconfigurationMessagePort(), "interfaceEntries", null, 0, -1, ReconfigurationMessagePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationExecutionPortEClass, ReconfigurationExecutionPort.class, "ReconfigurationExecutionPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationExecutionPort_InterfaceEntries(), this.getReconfigurationExecutionPortInterfaceEntry(), this.getReconfigurationExecutionPortInterfaceEntry_ReconfigurationExecutionPort(), "interfaceEntries", null, 0, -1, ReconfigurationExecutionPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executorSpecificationEntryEClass, ExecutorSpecificationEntry.class, "ExecutorSpecificationEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutorSpecificationEntry_Executor(), this.getExecutor(), this.getExecutor_SpecificationEntries(), "executor", null, 1, 1, ExecutorSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutorSpecificationEntry_ReconfigurationRule(), this.getReconfigurationRule(), null, "reconfigurationRule", null, 1, 1, ExecutorSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managerSpecificationEntryEClass, ManagerSpecificationEntry.class, "ManagerSpecificationEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManagerSpecificationEntry_Treat(), ecorePackage.getEBoolean(), "treat", "true", 0, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerSpecificationEntry_Propagate(), ecorePackage.getEBoolean(), "propagate", "false", 0, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerSpecificationEntry_Manager(), this.getManager(), this.getManager_SpecificationEntries(), "manager", null, 1, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerSpecificationEntry_MessageType(), theMsgtypePackage.getMessageType(), null, "messageType", null, 1, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerSpecificationEntry_StructuralCondition(), this.getStructuralCondition(), null, "structuralCondition", null, 0, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerSpecificationEntry_ReconfigurationRule(), this.getReconfigurationRule(), null, "reconfigurationRule", null, 0, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerSpecificationEntry_InvokePlanner(), theEcorePackage.getEBoolean(), "invokePlanner", null, 0, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerSpecificationEntry_TimeForPlanning(), theValuetypePackage.getTimeValue(), null, "timeForPlanning", null, 0, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationControllerEClass, ReconfigurationController.class, "ReconfigurationController", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ruleBasedReconfigurationControllerEClass, RuleBasedReconfigurationController.class, "RuleBasedReconfigurationController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleBasedReconfigurationController_Executor(), this.getExecutor(), this.getExecutor_ReconfigurationController(), "executor", null, 1, 1, RuleBasedReconfigurationController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleBasedReconfigurationController_Manager(), this.getManager(), this.getManager_ReconfigurationController(), "manager", null, 1, 1, RuleBasedReconfigurationController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationPortInterfaceEntryEClass, ReconfigurationPortInterfaceEntry.class, "ReconfigurationPortInterfaceEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReconfigurationPortInterfaceEntry_Description(), theEcorePackage.getEString(), "description", null, 0, 1, ReconfigurationPortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationPortInterfaceEntry_MessageType(), theMsgtypePackage.getMessageType(), null, "messageType", null, 1, 1, ReconfigurationPortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationMessagePortInterfaceEntryEClass, ReconfigurationMessagePortInterfaceEntry.class, "ReconfigurationMessagePortInterfaceEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReconfigurationMessagePortInterfaceEntry_ReconfigurationMessageType(), this.getReconfigurationMessageTypeEnum(), "reconfigurationMessageType", null, 0, 1, ReconfigurationMessagePortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationMessagePortInterfaceEntry_ExpectedResponseTime(), theValuetypePackage.getTimeValue(), null, "expectedResponseTime", null, 0, 1, ReconfigurationMessagePortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationMessagePortInterfaceEntry_ReconfigurationMessagePort(), this.getReconfigurationMessagePort(), this.getReconfigurationMessagePort_InterfaceEntries(), "reconfigurationMessagePort", null, 1, 1, ReconfigurationMessagePortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationExecutionPortInterfaceEntryEClass, ReconfigurationExecutionPortInterfaceEntry.class, "ReconfigurationExecutionPortInterfaceEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationExecutionPortInterfaceEntry_TimeForDecision(), theValuetypePackage.getTimeValue(), null, "timeForDecision", null, 1, 1, ReconfigurationExecutionPortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationExecutionPortInterfaceEntry_TimeForExecution(), theValuetypePackage.getTimeValue(), null, "timeForExecution", null, 1, 1, ReconfigurationExecutionPortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationExecutionPortInterfaceEntry_ReconfigurationExecutionPort(), this.getReconfigurationExecutionPort(), this.getReconfigurationExecutionPort_InterfaceEntries(), "reconfigurationExecutionPort", null, 1, 1, ReconfigurationExecutionPortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signatureEClass, Signature.class, "Signature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignature_Parameters(), theBehaviorPackage.getParameter(), null, "parameters", null, 0, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_ReturnParameters(), theBehaviorPackage.getParameter(), null, "returnParameters", null, 0, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_ReconfigurationRule(), this.getReconfigurationRule(), this.getReconfigurationRule_Signature(), "reconfigurationRule", null, 1, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(reconfigurationMessageTypeEnumEEnum, ReconfigurationMessageTypeEnum.class, "ReconfigurationMessageTypeEnum");
		addEEnumLiteral(reconfigurationMessageTypeEnumEEnum, ReconfigurationMessageTypeEnum.INFO);
		addEEnumLiteral(reconfigurationMessageTypeEnumEEnum, ReconfigurationMessageTypeEnum.REQUEST);

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
			 "derivation", "if self.controller.oclIsKindOf(RuleBasedReconfigurationController) then self.controller.oclAsType(RuleBasedReconfigurationController).manager else null endif"
		   });		
		addAnnotation
		  (getReconfigurableStructuredComponent_Executor(), 
		   source, 
		   new String[] {
			 "derivation", "if self.controller.oclIsKindOf(RuleBasedReconfigurationController) then self.controller.oclAsType(RuleBasedReconfigurationController).executor else null endif"
		   });					
		addAnnotation
		  (getManager_ReconfigurationMessagePorts(), 
		   source, 
		   new String[] {
			 "derivation", "self.ports -> select(p | p.oclIsTypeOf(ReconfigurationMessagePort))"
		   });			
		addAnnotation
		  (getExecutor_ReconfigurationExecutionPorts(), 
		   source, 
		   new String[] {
			 "derivation", "self.ports -> select(p | p.oclIsTypeOf(ReconfigurationExecutionPort))"
		   });			
		addAnnotation
		  (getReconfigurationRule_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if self.signature.oclIsUndefined() then null else self.signature.name endif"
		   });														
	}

} //ReconfigurationPackageImpl
