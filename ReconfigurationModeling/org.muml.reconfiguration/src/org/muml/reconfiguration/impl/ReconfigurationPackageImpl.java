/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfiguration.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.core.expressions.ExpressionsPackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.constraint.ConstraintPackage;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.pattern.PatternPackage;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.types.TypesPackage;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.reconfiguration.Controller;
import org.muml.reconfiguration.ExecutionTimingSpecification;
import org.muml.reconfiguration.ExecutionTimingSpecificationSinglePhase;
import org.muml.reconfiguration.ExecutionTimingSpecificationThreePhase;
import org.muml.reconfiguration.Executor;
import org.muml.reconfiguration.ExecutorSpecificationEntry;
import org.muml.reconfiguration.FadingComponent;
import org.muml.reconfiguration.FadingFunction;
import org.muml.reconfiguration.HybridPortMapping;
import org.muml.reconfiguration.InternalReconfigurationCommunicationPort;
import org.muml.reconfiguration.Manager;
import org.muml.reconfiguration.ManagerSpecificationEntry;
import org.muml.reconfiguration.ReconfigurableAtomicComponent;
import org.muml.reconfiguration.ReconfigurableComponent;
import org.muml.reconfiguration.ReconfigurableStructuredComponent;
import org.muml.reconfiguration.ReconfigurationConstraint;
import org.muml.reconfiguration.ReconfigurationController;
import org.muml.reconfiguration.ReconfigurationExecutionPort;
import org.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry;
import org.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry;
import org.muml.reconfiguration.ReconfigurationFactory;
import org.muml.reconfiguration.ReconfigurationManagementSpecificationEntry;
import org.muml.reconfiguration.ReconfigurationMessagePort;
import org.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry;
import org.muml.reconfiguration.ReconfigurationMessageTypeEnum;
import org.muml.reconfiguration.ReconfigurationPackage;
import org.muml.reconfiguration.ReconfigurationPort;
import org.muml.reconfiguration.ReconfigurationPortAssemblyConnector;
import org.muml.reconfiguration.ReconfigurationPortDelegationConnector;
import org.muml.reconfiguration.ReconfigurationPortInterfaceEntry;
import org.muml.reconfiguration.ReconfigurationRule;
import org.muml.reconfiguration.RuleBasedReconfigurationController;
import org.muml.reconfiguration.Signature;
import org.muml.reconfiguration.StructuralCondition;
import org.muml.reconfiguration.expression.ExpressionPackage;
import org.muml.reconfiguration.expression.impl.ExpressionPackageImpl;
import org.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage;
import org.muml.reconfiguration.protocolinstantiation.impl.ProtocolinstantiationPackageImpl;
import org.muml.reconfiguration.reconfInstance.ReconfInstancePackage;
import org.muml.reconfiguration.reconfInstance.impl.ReconfInstancePackageImpl;
import org.muml.reconfiguration.structdatatype.StructdatatypePackage;
import org.muml.reconfiguration.structdatatype.impl.StructdatatypePackageImpl;
import org.muml.reconfiguration.util.ReconfigurationValidator;
import org.muml.storydiagram.StorydiagramsPackage;

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
	private EClass reconfigurableAtomicComponentEClass = null;

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
	private EClass executionTimingSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionTimingSpecificationSinglePhaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionTimingSpecificationThreePhaseEClass = null;

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
	private EClass internalReconfigurationCommunicationPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationPortAssemblyConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationPortDelegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fadingComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fadingFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hybridPortMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationExecutionSpecificationEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationManagementSpecificationEntryEClass = null;

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
	 * @see org.muml.reconfiguration.ReconfigurationPackage#eNS_URI
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
		TypesPackage.eINSTANCE.eClass();
		ConnectorPackage.eINSTANCE.eClass();
		ValuetypePackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();
		StorydiagramsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);
		StructdatatypePackageImpl theStructdatatypePackage = (StructdatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructdatatypePackage.eNS_URI) instanceof StructdatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructdatatypePackage.eNS_URI) : StructdatatypePackage.eINSTANCE);
		ProtocolinstantiationPackageImpl theProtocolinstantiationPackage = (ProtocolinstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProtocolinstantiationPackage.eNS_URI) instanceof ProtocolinstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProtocolinstantiationPackage.eNS_URI) : ProtocolinstantiationPackage.eINSTANCE);
		ReconfInstancePackageImpl theReconfInstancePackage = (ReconfInstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReconfInstancePackage.eNS_URI) instanceof ReconfInstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReconfInstancePackage.eNS_URI) : ReconfInstancePackage.eINSTANCE);

		// Create package meta-data objects
		theReconfigurationPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theStructdatatypePackage.createPackageContents();
		theProtocolinstantiationPackage.createPackageContents();
		theReconfInstancePackage.createPackageContents();

		// Initialize created meta-data
		theReconfigurationPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theStructdatatypePackage.initializePackageContents();
		theProtocolinstantiationPackage.initializePackageContents();
		theReconfInstancePackage.initializePackageContents();

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
	public EClass getReconfigurableAtomicComponent() {
		return reconfigurableAtomicComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurableAtomicComponent_ExecutionEntries() {
		return (EReference)reconfigurableAtomicComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurableAtomicComponent_ManagementEntries() {
		return (EReference)reconfigurableAtomicComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurableAtomicComponent_HybridPortMappings() {
		return (EReference)reconfigurableAtomicComponentEClass.getEStructuralFeatures().get(2);
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
	public EReference getReconfigurationExecutionPortInterfaceEntry_TimeForExecutionPhase() {
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
	public EReference getReconfigurationExecutionPortInterfaceEntry_MinimumCommitTime() {
		return (EReference)reconfigurationExecutionPortInterfaceEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationExecutionPortInterfaceEntry_ReturnValues() {
		return (EReference)reconfigurationExecutionPortInterfaceEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationExecutionPortInterfaceEntry_MinimumRetryTime() {
		return (EReference)reconfigurationExecutionPortInterfaceEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionTimingSpecification() {
		return executionTimingSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionTimingSpecificationSinglePhase() {
		return executionTimingSpecificationSinglePhaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionTimingSpecificationSinglePhase_TimeForExecution() {
		return (EReference)executionTimingSpecificationSinglePhaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionTimingSpecificationThreePhase() {
		return executionTimingSpecificationThreePhaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionTimingSpecificationThreePhase_TimeForSetup() {
		return (EReference)executionTimingSpecificationThreePhaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionTimingSpecificationThreePhase_TimeForFading() {
		return (EReference)executionTimingSpecificationThreePhaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionTimingSpecificationThreePhase_TimeForTeardown() {
		return (EReference)executionTimingSpecificationThreePhaseEClass.getEStructuralFeatures().get(2);
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
	public EClass getInternalReconfigurationCommunicationPort() {
		return internalReconfigurationCommunicationPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationPortAssemblyConnector() {
		return reconfigurationPortAssemblyConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationPortDelegationConnector() {
		return reconfigurationPortDelegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFadingComponent() {
		return fadingComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFadingComponent_FadingFunction() {
		return (EReference)fadingComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFadingFunction() {
		return fadingFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFadingFunction_FromPort() {
		return (EReference)fadingFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFadingFunction_ToPort() {
		return (EReference)fadingFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationConstraint() {
		return reconfigurationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHybridPortMapping() {
		return hybridPortMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridPortMapping_HybridPort() {
		return (EReference)hybridPortMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridPortMapping_Function() {
		return (EReference)hybridPortMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationExecutionSpecificationEntry() {
		return reconfigurationExecutionSpecificationEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationExecutionSpecificationEntry_Guards() {
		return (EReference)reconfigurationExecutionSpecificationEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationExecutionSpecificationEntry_Message() {
		return (EReference)reconfigurationExecutionSpecificationEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationExecutionSpecificationEntry_ReconfigurationRule() {
		return (EReference)reconfigurationExecutionSpecificationEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationExecutionSpecificationEntry_HybridPortMappings() {
		return (EReference)reconfigurationExecutionSpecificationEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationManagementSpecificationEntry() {
		return reconfigurationManagementSpecificationEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationManagementSpecificationEntry_Conditions() {
		return (EReference)reconfigurationManagementSpecificationEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationManagementSpecificationEntry_Message() {
		return (EReference)reconfigurationManagementSpecificationEntryEClass.getEStructuralFeatures().get(1);
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
	public EReference getReconfigurationRule_Signature() {
		return (EReference)reconfigurationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconfigurationRule_Name() {
		return (EAttribute)reconfigurationRuleEClass.getEStructuralFeatures().get(2);
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
	public EReference getStructuralCondition_ReconfigurableComponent() {
		return (EReference)structuralConditionEClass.getEStructuralFeatures().get(1);
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
	public EReference getExecutorSpecificationEntry_Wcet() {
		return (EReference)executorSpecificationEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutorSpecificationEntry_Id() {
		return (EAttribute)executorSpecificationEntryEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getManagerSpecificationEntry_Blockable() {
		return (EAttribute)managerSpecificationEntryEClass.getEStructuralFeatures().get(8);
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
		reconfigurableComponentEClass = createEClass(RECONFIGURABLE_COMPONENT);

		reconfigurableAtomicComponentEClass = createEClass(RECONFIGURABLE_ATOMIC_COMPONENT);
		createEReference(reconfigurableAtomicComponentEClass, RECONFIGURABLE_ATOMIC_COMPONENT__EXECUTION_ENTRIES);
		createEReference(reconfigurableAtomicComponentEClass, RECONFIGURABLE_ATOMIC_COMPONENT__MANAGEMENT_ENTRIES);
		createEReference(reconfigurableAtomicComponentEClass, RECONFIGURABLE_ATOMIC_COMPONENT__HYBRID_PORT_MAPPINGS);

		reconfigurableStructuredComponentEClass = createEClass(RECONFIGURABLE_STRUCTURED_COMPONENT);
		createEReference(reconfigurableStructuredComponentEClass, RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLER);
		createEReference(reconfigurableStructuredComponentEClass, RECONFIGURABLE_STRUCTURED_COMPONENT__MANAGER);
		createEReference(reconfigurableStructuredComponentEClass, RECONFIGURABLE_STRUCTURED_COMPONENT__EXECUTOR);
		createEReference(reconfigurableStructuredComponentEClass, RECONFIGURABLE_STRUCTURED_COMPONENT__INITIAL_CONFIGURATION);

		reconfigurationPortEClass = createEClass(RECONFIGURATION_PORT);

		reconfigurationPortInterfaceEntryEClass = createEClass(RECONFIGURATION_PORT_INTERFACE_ENTRY);
		createEAttribute(reconfigurationPortInterfaceEntryEClass, RECONFIGURATION_PORT_INTERFACE_ENTRY__DESCRIPTION);
		createEReference(reconfigurationPortInterfaceEntryEClass, RECONFIGURATION_PORT_INTERFACE_ENTRY__MESSAGE_TYPE);

		reconfigurationMessagePortEClass = createEClass(RECONFIGURATION_MESSAGE_PORT);
		createEReference(reconfigurationMessagePortEClass, RECONFIGURATION_MESSAGE_PORT__INTERFACE_ENTRIES);

		reconfigurationMessagePortInterfaceEntryEClass = createEClass(RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY);
		createEAttribute(reconfigurationMessagePortInterfaceEntryEClass, RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_TYPE);
		createEReference(reconfigurationMessagePortInterfaceEntryEClass, RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME);
		createEReference(reconfigurationMessagePortInterfaceEntryEClass, RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_PORT);

		reconfigurationExecutionPortEClass = createEClass(RECONFIGURATION_EXECUTION_PORT);
		createEReference(reconfigurationExecutionPortEClass, RECONFIGURATION_EXECUTION_PORT__INTERFACE_ENTRIES);

		reconfigurationExecutionPortInterfaceEntryEClass = createEClass(RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY);
		createEReference(reconfigurationExecutionPortInterfaceEntryEClass, RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_DECISION);
		createEReference(reconfigurationExecutionPortInterfaceEntryEClass, RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_EXECUTION_PHASE);
		createEReference(reconfigurationExecutionPortInterfaceEntryEClass, RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RECONFIGURATION_EXECUTION_PORT);
		createEReference(reconfigurationExecutionPortInterfaceEntryEClass, RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__MINIMUM_COMMIT_TIME);
		createEReference(reconfigurationExecutionPortInterfaceEntryEClass, RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RETURN_VALUES);
		createEReference(reconfigurationExecutionPortInterfaceEntryEClass, RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__MINIMUM_RETRY_TIME);

		executionTimingSpecificationEClass = createEClass(EXECUTION_TIMING_SPECIFICATION);

		executionTimingSpecificationSinglePhaseEClass = createEClass(EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE);
		createEReference(executionTimingSpecificationSinglePhaseEClass, EXECUTION_TIMING_SPECIFICATION_SINGLE_PHASE__TIME_FOR_EXECUTION);

		executionTimingSpecificationThreePhaseEClass = createEClass(EXECUTION_TIMING_SPECIFICATION_THREE_PHASE);
		createEReference(executionTimingSpecificationThreePhaseEClass, EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_SETUP);
		createEReference(executionTimingSpecificationThreePhaseEClass, EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_FADING);
		createEReference(executionTimingSpecificationThreePhaseEClass, EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_TEARDOWN);

		internalReconfigurationCommunicationPortEClass = createEClass(INTERNAL_RECONFIGURATION_COMMUNICATION_PORT);

		controllerEClass = createEClass(CONTROLLER);
		createEReference(controllerEClass, CONTROLLER__STRUCTURED_COMPONENT);

		reconfigurationControllerEClass = createEClass(RECONFIGURATION_CONTROLLER);

		ruleBasedReconfigurationControllerEClass = createEClass(RULE_BASED_RECONFIGURATION_CONTROLLER);
		createEReference(ruleBasedReconfigurationControllerEClass, RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR);
		createEReference(ruleBasedReconfigurationControllerEClass, RULE_BASED_RECONFIGURATION_CONTROLLER__MANAGER);

		managerEClass = createEClass(MANAGER);
		createEReference(managerEClass, MANAGER__SPECIFICATION_ENTRIES);
		createEReference(managerEClass, MANAGER__RECONFIGURATION_CONTROLLER);
		createEReference(managerEClass, MANAGER__PORTS);
		createEReference(managerEClass, MANAGER__RECONFIGURATION_MESSAGE_PORTS);

		managerSpecificationEntryEClass = createEClass(MANAGER_SPECIFICATION_ENTRY);
		createEAttribute(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__TREAT);
		createEAttribute(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__PROPAGATE);
		createEReference(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__MANAGER);
		createEReference(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__MESSAGE_TYPE);
		createEReference(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__STRUCTURAL_CONDITION);
		createEReference(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__RECONFIGURATION_RULE);
		createEAttribute(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__INVOKE_PLANNER);
		createEReference(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__TIME_FOR_PLANNING);
		createEAttribute(managerSpecificationEntryEClass, MANAGER_SPECIFICATION_ENTRY__BLOCKABLE);

		executorEClass = createEClass(EXECUTOR);
		createEReference(executorEClass, EXECUTOR__SPECIFICATION_ENTRIES);
		createEReference(executorEClass, EXECUTOR__RECONFIGURATION_CONTROLLER);
		createEReference(executorEClass, EXECUTOR__PORTS);
		createEReference(executorEClass, EXECUTOR__RECONFIGURATION_EXECUTION_PORTS);

		executorSpecificationEntryEClass = createEClass(EXECUTOR_SPECIFICATION_ENTRY);
		createEReference(executorSpecificationEntryEClass, EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR);
		createEReference(executorSpecificationEntryEClass, EXECUTOR_SPECIFICATION_ENTRY__RECONFIGURATION_RULE);
		createEReference(executorSpecificationEntryEClass, EXECUTOR_SPECIFICATION_ENTRY__WCET);
		createEAttribute(executorSpecificationEntryEClass, EXECUTOR_SPECIFICATION_ENTRY__ID);

		reconfigurationRuleEClass = createEClass(RECONFIGURATION_RULE);
		createEReference(reconfigurationRuleEClass, RECONFIGURATION_RULE__RECONFIGURED_COMPONENT);
		createEReference(reconfigurationRuleEClass, RECONFIGURATION_RULE__SIGNATURE);
		createEAttribute(reconfigurationRuleEClass, RECONFIGURATION_RULE__NAME);

		signatureEClass = createEClass(SIGNATURE);
		createEReference(signatureEClass, SIGNATURE__PARAMETERS);
		createEReference(signatureEClass, SIGNATURE__RETURN_PARAMETERS);
		createEReference(signatureEClass, SIGNATURE__RECONFIGURATION_RULE);

		structuralConditionEClass = createEClass(STRUCTURAL_CONDITION);
		createEReference(structuralConditionEClass, STRUCTURAL_CONDITION__PARAMETERS);
		createEReference(structuralConditionEClass, STRUCTURAL_CONDITION__RECONFIGURABLE_COMPONENT);

		reconfigurationPortAssemblyConnectorEClass = createEClass(RECONFIGURATION_PORT_ASSEMBLY_CONNECTOR);

		reconfigurationPortDelegationConnectorEClass = createEClass(RECONFIGURATION_PORT_DELEGATION_CONNECTOR);

		fadingComponentEClass = createEClass(FADING_COMPONENT);
		createEReference(fadingComponentEClass, FADING_COMPONENT__FADING_FUNCTION);

		fadingFunctionEClass = createEClass(FADING_FUNCTION);
		createEReference(fadingFunctionEClass, FADING_FUNCTION__FROM_PORT);
		createEReference(fadingFunctionEClass, FADING_FUNCTION__TO_PORT);

		reconfigurationConstraintEClass = createEClass(RECONFIGURATION_CONSTRAINT);

		hybridPortMappingEClass = createEClass(HYBRID_PORT_MAPPING);
		createEReference(hybridPortMappingEClass, HYBRID_PORT_MAPPING__HYBRID_PORT);
		createEReference(hybridPortMappingEClass, HYBRID_PORT_MAPPING__FUNCTION);

		reconfigurationExecutionSpecificationEntryEClass = createEClass(RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY);
		createEReference(reconfigurationExecutionSpecificationEntryEClass, RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__GUARDS);
		createEReference(reconfigurationExecutionSpecificationEntryEClass, RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__MESSAGE);
		createEReference(reconfigurationExecutionSpecificationEntryEClass, RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__RECONFIGURATION_RULE);
		createEReference(reconfigurationExecutionSpecificationEntryEClass, RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__HYBRID_PORT_MAPPINGS);

		reconfigurationManagementSpecificationEntryEClass = createEClass(RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY);
		createEReference(reconfigurationManagementSpecificationEntryEClass, RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__CONDITIONS);
		createEReference(reconfigurationManagementSpecificationEntryEClass, RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__MESSAGE);

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
		ProtocolinstantiationPackage theProtocolinstantiationPackage = (ProtocolinstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(ProtocolinstantiationPackage.eNS_URI);
		ReconfInstancePackage theReconfInstancePackage = (ReconfInstancePackage)EPackage.Registry.INSTANCE.getEPackage(ReconfInstancePackage.eNS_URI);
		ComponentPackage theComponentPackage = (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		ConnectorPackage theConnectorPackage = (ConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		MsgtypePackage theMsgtypePackage = (MsgtypePackage)EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		RealtimestatechartPackage theRealtimestatechartPackage = (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theExpressionPackage);
		getESubpackages().add(theStructdatatypePackage);
		getESubpackages().add(theProtocolinstantiationPackage);
		getESubpackages().add(theReconfInstancePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reconfigurableComponentEClass.getESuperTypes().add(theComponentPackage.getComponent());
		reconfigurableAtomicComponentEClass.getESuperTypes().add(theComponentPackage.getAtomicComponent());
		reconfigurableAtomicComponentEClass.getESuperTypes().add(this.getReconfigurableComponent());
		reconfigurableStructuredComponentEClass.getESuperTypes().add(theComponentPackage.getStructuredComponent());
		reconfigurableStructuredComponentEClass.getESuperTypes().add(this.getReconfigurableComponent());
		reconfigurationPortEClass.getESuperTypes().add(theComponentPackage.getPort());
		reconfigurationPortEClass.getESuperTypes().add(theConnectorPackage.getDiscreteInteractionEndpoint());
		reconfigurationPortInterfaceEntryEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		reconfigurationMessagePortEClass.getESuperTypes().add(this.getReconfigurationPort());
		reconfigurationMessagePortInterfaceEntryEClass.getESuperTypes().add(this.getReconfigurationPortInterfaceEntry());
		reconfigurationExecutionPortEClass.getESuperTypes().add(this.getReconfigurationPort());
		reconfigurationExecutionPortInterfaceEntryEClass.getESuperTypes().add(this.getReconfigurationPortInterfaceEntry());
		executionTimingSpecificationEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		executionTimingSpecificationSinglePhaseEClass.getESuperTypes().add(this.getExecutionTimingSpecification());
		executionTimingSpecificationThreePhaseEClass.getESuperTypes().add(this.getExecutionTimingSpecification());
		internalReconfigurationCommunicationPortEClass.getESuperTypes().add(this.getReconfigurationPort());
		controllerEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		controllerEClass.getESuperTypes().add(theBehaviorPackage.getBehavioralElement());
		controllerEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		reconfigurationControllerEClass.getESuperTypes().add(this.getController());
		ruleBasedReconfigurationControllerEClass.getESuperTypes().add(this.getReconfigurationController());
		managerEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		managerEClass.getESuperTypes().add(theBehaviorPackage.getBehavioralElement());
		managerSpecificationEntryEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		executorEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		executorEClass.getESuperTypes().add(theBehaviorPackage.getBehavioralElement());
		executorSpecificationEntryEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		reconfigurationRuleEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		signatureEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		structuralConditionEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		structuralConditionEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		reconfigurationPortAssemblyConnectorEClass.getESuperTypes().add(theComponentPackage.getPortConnector());
		reconfigurationPortDelegationConnectorEClass.getESuperTypes().add(theComponentPackage.getPortConnector());
		fadingComponentEClass.getESuperTypes().add(theComponentPackage.getAtomicComponent());
		fadingFunctionEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		fadingFunctionEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		reconfigurationExecutionSpecificationEntryEClass.getESuperTypes().add(theTypesPackage.getDataType());
		reconfigurationManagementSpecificationEntryEClass.getESuperTypes().add(theTypesPackage.getDataType());

		// Initialize classes, features, and operations; add parameters
		initEClass(reconfigurableComponentEClass, ReconfigurableComponent.class, "ReconfigurableComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reconfigurableAtomicComponentEClass, ReconfigurableAtomicComponent.class, "ReconfigurableAtomicComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurableAtomicComponent_ExecutionEntries(), this.getReconfigurationExecutionSpecificationEntry(), null, "executionEntries", null, 0, -1, ReconfigurableAtomicComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurableAtomicComponent_ManagementEntries(), this.getReconfigurationManagementSpecificationEntry(), null, "managementEntries", null, 0, -1, ReconfigurableAtomicComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurableAtomicComponent_HybridPortMappings(), this.getHybridPortMapping(), null, "hybridPortMappings", null, 0, -1, ReconfigurableAtomicComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurableStructuredComponentEClass, ReconfigurableStructuredComponent.class, "ReconfigurableStructuredComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurableStructuredComponent_Controller(), this.getController(), this.getController_StructuredComponent(), "controller", null, 0, 1, ReconfigurableStructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReconfigurableStructuredComponent_Manager(), this.getManager(), null, "manager", null, 0, 1, ReconfigurableStructuredComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurableStructuredComponent_Executor(), this.getExecutor(), null, "executor", null, 0, 1, ReconfigurableStructuredComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurableStructuredComponent_InitialConfiguration(), theInstancePackage.getComponentInstanceConfiguration(), null, "initialConfiguration", null, 0, 1, ReconfigurableStructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationPortEClass, ReconfigurationPort.class, "ReconfigurationPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reconfigurationPortInterfaceEntryEClass, ReconfigurationPortInterfaceEntry.class, "ReconfigurationPortInterfaceEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReconfigurationPortInterfaceEntry_Description(), theEcorePackage.getEString(), "description", null, 0, 1, ReconfigurationPortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationPortInterfaceEntry_MessageType(), theMsgtypePackage.getMessageType(), null, "messageType", null, 1, 1, ReconfigurationPortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationMessagePortEClass, ReconfigurationMessagePort.class, "ReconfigurationMessagePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationMessagePort_InterfaceEntries(), this.getReconfigurationMessagePortInterfaceEntry(), this.getReconfigurationMessagePortInterfaceEntry_ReconfigurationMessagePort(), "interfaceEntries", null, 0, -1, ReconfigurationMessagePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationMessagePortInterfaceEntryEClass, ReconfigurationMessagePortInterfaceEntry.class, "ReconfigurationMessagePortInterfaceEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReconfigurationMessagePortInterfaceEntry_ReconfigurationMessageType(), this.getReconfigurationMessageTypeEnum(), "reconfigurationMessageType", null, 0, 1, ReconfigurationMessagePortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationMessagePortInterfaceEntry_ExpectedResponseTime(), theValuetypePackage.getTimeValue(), null, "expectedResponseTime", null, 0, 1, ReconfigurationMessagePortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationMessagePortInterfaceEntry_ReconfigurationMessagePort(), this.getReconfigurationMessagePort(), this.getReconfigurationMessagePort_InterfaceEntries(), "reconfigurationMessagePort", null, 1, 1, ReconfigurationMessagePortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationExecutionPortEClass, ReconfigurationExecutionPort.class, "ReconfigurationExecutionPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationExecutionPort_InterfaceEntries(), this.getReconfigurationExecutionPortInterfaceEntry(), this.getReconfigurationExecutionPortInterfaceEntry_ReconfigurationExecutionPort(), "interfaceEntries", null, 0, -1, ReconfigurationExecutionPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationExecutionPortInterfaceEntryEClass, ReconfigurationExecutionPortInterfaceEntry.class, "ReconfigurationExecutionPortInterfaceEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationExecutionPortInterfaceEntry_TimeForDecision(), theValuetypePackage.getTimeValue(), null, "timeForDecision", null, 1, 1, ReconfigurationExecutionPortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationExecutionPortInterfaceEntry_TimeForExecutionPhase(), this.getExecutionTimingSpecification(), null, "timeForExecutionPhase", null, 1, 1, ReconfigurationExecutionPortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationExecutionPortInterfaceEntry_ReconfigurationExecutionPort(), this.getReconfigurationExecutionPort(), this.getReconfigurationExecutionPort_InterfaceEntries(), "reconfigurationExecutionPort", null, 1, 1, ReconfigurationExecutionPortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationExecutionPortInterfaceEntry_MinimumCommitTime(), theValuetypePackage.getTimeValue(), null, "minimumCommitTime", null, 1, 1, ReconfigurationExecutionPortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationExecutionPortInterfaceEntry_ReturnValues(), theBehaviorPackage.getParameter(), null, "returnValues", null, 0, -1, ReconfigurationExecutionPortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationExecutionPortInterfaceEntry_MinimumRetryTime(), theValuetypePackage.getTimeValue(), null, "minimumRetryTime", null, 0, 1, ReconfigurationExecutionPortInterfaceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionTimingSpecificationEClass, ExecutionTimingSpecification.class, "ExecutionTimingSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionTimingSpecificationSinglePhaseEClass, ExecutionTimingSpecificationSinglePhase.class, "ExecutionTimingSpecificationSinglePhase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionTimingSpecificationSinglePhase_TimeForExecution(), theValuetypePackage.getTimeValue(), null, "timeForExecution", null, 1, 1, ExecutionTimingSpecificationSinglePhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionTimingSpecificationThreePhaseEClass, ExecutionTimingSpecificationThreePhase.class, "ExecutionTimingSpecificationThreePhase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionTimingSpecificationThreePhase_TimeForSetup(), theValuetypePackage.getTimeValue(), null, "timeForSetup", null, 1, 1, ExecutionTimingSpecificationThreePhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionTimingSpecificationThreePhase_TimeForFading(), theValuetypePackage.getTimeValue(), null, "timeForFading", null, 1, 1, ExecutionTimingSpecificationThreePhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionTimingSpecificationThreePhase_TimeForTeardown(), theValuetypePackage.getTimeValue(), null, "timeForTeardown", null, 1, 1, ExecutionTimingSpecificationThreePhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalReconfigurationCommunicationPortEClass, InternalReconfigurationCommunicationPort.class, "InternalReconfigurationCommunicationPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllerEClass, Controller.class, "Controller", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getController_StructuredComponent(), this.getReconfigurableStructuredComponent(), this.getReconfigurableStructuredComponent_Controller(), "structuredComponent", null, 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationControllerEClass, ReconfigurationController.class, "ReconfigurationController", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ruleBasedReconfigurationControllerEClass, RuleBasedReconfigurationController.class, "RuleBasedReconfigurationController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleBasedReconfigurationController_Executor(), this.getExecutor(), this.getExecutor_ReconfigurationController(), "executor", null, 1, 1, RuleBasedReconfigurationController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleBasedReconfigurationController_Manager(), this.getManager(), this.getManager_ReconfigurationController(), "manager", null, 1, 1, RuleBasedReconfigurationController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managerEClass, Manager.class, "Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManager_SpecificationEntries(), this.getManagerSpecificationEntry(), this.getManagerSpecificationEntry_Manager(), "specificationEntries", null, 0, -1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_ReconfigurationController(), this.getRuleBasedReconfigurationController(), this.getRuleBasedReconfigurationController_Manager(), "reconfigurationController", null, 1, 1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_Ports(), this.getReconfigurationPort(), null, "ports", null, 0, -1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_ReconfigurationMessagePorts(), this.getReconfigurationMessagePort(), null, "reconfigurationMessagePorts", null, 0, -1, Manager.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(managerSpecificationEntryEClass, ManagerSpecificationEntry.class, "ManagerSpecificationEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManagerSpecificationEntry_Treat(), ecorePackage.getEBoolean(), "treat", "true", 0, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerSpecificationEntry_Propagate(), ecorePackage.getEBoolean(), "propagate", "false", 0, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerSpecificationEntry_Manager(), this.getManager(), this.getManager_SpecificationEntries(), "manager", null, 1, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerSpecificationEntry_MessageType(), theMsgtypePackage.getMessageType(), null, "messageType", null, 1, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerSpecificationEntry_StructuralCondition(), this.getStructuralCondition(), null, "structuralCondition", null, 0, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerSpecificationEntry_ReconfigurationRule(), this.getReconfigurationRule(), null, "reconfigurationRule", null, 0, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerSpecificationEntry_InvokePlanner(), theEcorePackage.getEBoolean(), "invokePlanner", null, 0, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerSpecificationEntry_TimeForPlanning(), theValuetypePackage.getTimeValue(), null, "timeForPlanning", null, 0, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerSpecificationEntry_Blockable(), ecorePackage.getEBoolean(), "blockable", "false", 1, 1, ManagerSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executorEClass, Executor.class, "Executor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutor_SpecificationEntries(), this.getExecutorSpecificationEntry(), this.getExecutorSpecificationEntry_Executor(), "specificationEntries", null, 1, -1, Executor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutor_ReconfigurationController(), this.getRuleBasedReconfigurationController(), this.getRuleBasedReconfigurationController_Executor(), "reconfigurationController", null, 1, 1, Executor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutor_Ports(), this.getReconfigurationPort(), null, "ports", null, 0, -1, Executor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutor_ReconfigurationExecutionPorts(), this.getReconfigurationExecutionPort(), null, "reconfigurationExecutionPorts", null, 0, -1, Executor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(executorSpecificationEntryEClass, ExecutorSpecificationEntry.class, "ExecutorSpecificationEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutorSpecificationEntry_Executor(), this.getExecutor(), this.getExecutor_SpecificationEntries(), "executor", null, 1, 1, ExecutorSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutorSpecificationEntry_ReconfigurationRule(), this.getReconfigurationRule(), null, "reconfigurationRule", null, 1, 1, ExecutorSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutorSpecificationEntry_Wcet(), theValuetypePackage.getTimeValue(), null, "wcet", null, 0, 1, ExecutorSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutorSpecificationEntry_Id(), ecorePackage.getEInt(), "id", "0", 1, 1, ExecutorSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationRuleEClass, ReconfigurationRule.class, "ReconfigurationRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationRule_ReconfiguredComponent(), this.getReconfigurableComponent(), null, "reconfiguredComponent", null, 1, 1, ReconfigurationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationRule_Signature(), this.getSignature(), this.getSignature_ReconfigurationRule(), "signature", null, 1, 1, ReconfigurationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconfigurationRule_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ReconfigurationRule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(signatureEClass, Signature.class, "Signature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignature_Parameters(), theBehaviorPackage.getParameter(), null, "parameters", null, 0, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_ReturnParameters(), theBehaviorPackage.getParameter(), null, "returnParameters", null, 0, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_ReconfigurationRule(), this.getReconfigurationRule(), this.getReconfigurationRule_Signature(), "reconfigurationRule", null, 1, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuralConditionEClass, StructuralCondition.class, "StructuralCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuralCondition_Parameters(), theBehaviorPackage.getParameter(), null, "parameters", null, 0, -1, StructuralCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuralCondition_ReconfigurableComponent(), this.getReconfigurableComponent(), null, "reconfigurableComponent", null, 1, 1, StructuralCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationPortAssemblyConnectorEClass, ReconfigurationPortAssemblyConnector.class, "ReconfigurationPortAssemblyConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reconfigurationPortDelegationConnectorEClass, ReconfigurationPortDelegationConnector.class, "ReconfigurationPortDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fadingComponentEClass, FadingComponent.class, "FadingComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFadingComponent_FadingFunction(), this.getFadingFunction(), null, "fadingFunction", null, 0, -1, FadingComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fadingFunctionEClass, FadingFunction.class, "FadingFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFadingFunction_FromPort(), theComponentPackage.getPort(), null, "fromPort", null, 1, 1, FadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFadingFunction_ToPort(), theComponentPackage.getPort(), null, "toPort", null, 1, 1, FadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationConstraintEClass, ReconfigurationConstraint.class, "ReconfigurationConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hybridPortMappingEClass, HybridPortMapping.class, "HybridPortMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHybridPortMapping_HybridPort(), theComponentPackage.getHybridPort(), null, "hybridPort", null, 1, 1, HybridPortMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHybridPortMapping_Function(), theExpressionsPackage.getExpression(), null, "function", null, 1, 1, HybridPortMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationExecutionSpecificationEntryEClass, ReconfigurationExecutionSpecificationEntry.class, "ReconfigurationExecutionSpecificationEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationExecutionSpecificationEntry_Guards(), this.getReconfigurationConstraint(), null, "guards", null, 0, -1, ReconfigurationExecutionSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationExecutionSpecificationEntry_Message(), theRealtimestatechartPackage.getMessage(), null, "message", null, 1, 1, ReconfigurationExecutionSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationExecutionSpecificationEntry_ReconfigurationRule(), this.getReconfigurationRule(), null, "reconfigurationRule", null, 1, 1, ReconfigurationExecutionSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationExecutionSpecificationEntry_HybridPortMappings(), this.getHybridPortMapping(), null, "hybridPortMappings", null, 0, -1, ReconfigurationExecutionSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationManagementSpecificationEntryEClass, ReconfigurationManagementSpecificationEntry.class, "ReconfigurationManagementSpecificationEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationManagementSpecificationEntry_Conditions(), this.getReconfigurationConstraint(), null, "conditions", null, 0, -1, ReconfigurationManagementSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationManagementSpecificationEntry_Message(), theRealtimestatechartPackage.getMessage(), null, "message", null, 1, 1, ReconfigurationManagementSpecificationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (reconfigurationPortEClass, 
		   source, 
		   new String[] {
			 "constraints", "ReconfigurationPortRequiresMessageTypes ReconfigurationPortAtStructuredComponentHasNoBehavior"
		   });	
		addAnnotation
		  (reconfigurationMessagePortInterfaceEntryEClass, 
		   source, 
		   new String[] {
			 "constraints", "RequestRequiresExpectedResponseTime"
		   });	
		addAnnotation
		  (managerEClass, 
		   source, 
		   new String[] {
			 "constraints", "ImplementMessagesOfChildren ImplementMessagesOfferedToParent TreatAndNotPropagateMessagesOfferedToParent PropagatedMessageMustAppearInRMPort"
		   });	
		addAnnotation
		  (managerSpecificationEntryEClass, 
		   source, 
		   new String[] {
			 "constraints", "NotTreatAndPropagate InvokePlannerOnlyForTreatedMessage TimeForPlanningRequiresToInvokePlanner OnlyBlockTreatedMessage"
		   });	
		addAnnotation
		  (executorSpecificationEntryEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueIDofSpecificationEntryInExecutor"
		   });	
		addAnnotation
		  (reconfigurationPortAssemblyConnectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "OnlyConnectReconfigurationPorts"
		   });	
		addAnnotation
		  (reconfigurationPortDelegationConnectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "OnlyConnectReconfigurationPorts"
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
		  (reconfigurationPortEClass, 
		   source, 
		   new String[] {
			 "ReconfigurationPortRequiresMessageTypes", "self.senderMessageTypes->notEmpty() or self.receiverMessageTypes->notEmpty()",
			 "ReconfigurationPortAtStructuredComponentHasNoBehavior", "(not self.component.oclIsUndefined() and self.component.oclIsTypeOf(muml::component::StructuredComponent))\r\n\timplies self.behavior.oclIsUndefined()"
		   });	
		addAnnotation
		  (reconfigurationMessagePortInterfaceEntryEClass, 
		   source, 
		   new String[] {
			 "RequestRequiresExpectedResponseTime", "self.reconfigurationMessageType = ReconfigurationMessageTypeEnum::REQUEST implies (not self.expectedResponseTime.oclIsUndefined())"
		   });	
		addAnnotation
		  (managerEClass, 
		   source, 
		   new String[] {
			 "ImplementMessagesOfChildren", "-- The manager specification needs to have entries for all reconfiguration messages that are sent by embedded components.\r\n(self.reconfigurationController.structuredComponent.embeddedComponentParts.componentType.ports -> \r\n\t\t\tselect(oclIsTypeOf(ReconfigurationMessagePort))).oclAsType(ReconfigurationMessagePort).interfaceEntries.messageType\r\n\t\t\t->forAll(mt : msgtype::MessageType | self.specificationEntries -> select(messageType = mt) -> size() > 0)",
			 "ImplementMessagesOfferedToParent", "-- The manager needs to contain ManagerSpecificationEntries for each reconfiguration message that is provided by the reconfiguration execution port.\r\n(self.reconfigurationController.structuredComponent.ports -> \r\n\t\t\tselect(oclIsTypeOf(ReconfigurationExecutionPort))).oclAsType(ReconfigurationExecutionPort).interfaceEntries.messageType\r\n\t\t\t->forAll(mt : msgtype::MessageType | self.specificationEntries -> select(messageType = mt) -> size() > 0)",
			 "TreatAndNotPropagateMessagesOfferedToParent", "-- All reconfiguration messages offered to the parent in the reconfiguration execution port need to be treated and not propagated in the manager specification.\r\nself.specificationEntries -> select(entry : ManagerSpecificationEntry | self.reconfigurationController.structuredComponent.ports\r\n\t-> select(oclIsTypeOf(ReconfigurationExecutionPort)).oclAsType(ReconfigurationExecutionPort).interfaceEntries \r\n\t-> select(messageType = entry.messageType) -> size() > 0) -> forAll(treat = true and propagate = false)",
			 "PropagatedMessageMustAppearInRMPort", "let\r\n\trmTypes : OrderedSet(msgtype::MessageType) = self.reconfigurationController.structuredComponent.ports -> any(oclIsKindOf(ReconfigurationMessagePort)).oclAsType(ReconfigurationMessagePort).interfaceEntries.messageType->asOrderedSet(), -- messages in RM Port\r\n\tpropTypes: OrderedSet(msgtype::MessageType) = self.specificationEntries -> select(propagate = true).messageType->asOrderedSet() -- message propagated in manager specification\r\nin\r\n\trmTypes->includesAll(propTypes) and propTypes->includesAll(rmTypes)"
		   });	
		addAnnotation
		  (getManager_ReconfigurationMessagePorts(), 
		   source, 
		   new String[] {
			 "derivation", "self.ports -> select(p | p.oclIsTypeOf(ReconfigurationMessagePort)).oclAsType(ReconfigurationMessagePort)"
		   });	
		addAnnotation
		  (managerSpecificationEntryEClass, 
		   source, 
		   new String[] {
			 "NotTreatAndPropagate", "not(self.treat and self.propagate)",
			 "InvokePlannerOnlyForTreatedMessage", "self.invokePlanner implies self.treat",
			 "TimeForPlanningRequiresToInvokePlanner", "(not self.timeForPlanning.oclIsUndefined()) implies self.invokePlanner",
			 "OnlyBlockTreatedMessage", "self.blockable implies self.treat"
		   });	
		addAnnotation
		  (getExecutor_ReconfigurationExecutionPorts(), 
		   source, 
		   new String[] {
			 "derivation", "(self.ports -> select(p | p.oclIsTypeOf(ReconfigurationExecutionPort))).oclAsType(ReconfigurationExecutionPort)"
		   });	
		addAnnotation
		  (executorSpecificationEntryEClass, 
		   source, 
		   new String[] {
			 "UniqueIDofSpecificationEntryInExecutor", "-- The ID of an ExecutorSpecificationEntry must be unique inside the executor\'s specification.\r\nself.executor.specificationEntries -> select(entry : ExecutorSpecificationEntry | entry.id = self.id) -> size() = 1"
		   });	
		addAnnotation
		  (getReconfigurationRule_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if self.signature.oclIsUndefined() then null else self.signature.name endif"
		   });	
		addAnnotation
		  (reconfigurationPortAssemblyConnectorEClass, 
		   source, 
		   new String[] {
			 "OnlyConnectReconfigurationPorts", "-- A reconfiguration Port Assembly may only connect reconfiguration ports or a port part typed by a reconfiguration port.\r\n(self.connectorEndpoints -> select(oclIsKindOf(ReconfigurationPort)) -> size() = 2) -- two reconfiguration ports\r\nor \r\n((self.connectorEndpoints -> select(oclIsKindOf(ReconfigurationPort)) -> size() = 1) and -- or one reconfiguration port and one port part\r\n(self.connectorEndpoints -> select(oclIsKindOf(muml::component::PortPart)) -> size() = 1) and \r\n(self.connectorEndpoints -> any(oclIsKindOf(muml::component::PortPart)).oclAsType(muml::component::PortPart).portType.oclIsKindOf(ReconfigurationPort))) -- that is typed over a reconfiguration port"
		   });	
		addAnnotation
		  (reconfigurationPortDelegationConnectorEClass, 
		   source, 
		   new String[] {
			 "OnlyConnectReconfigurationPorts", "-- A reconfiguration Port Delegation may only connect reconfiguration ports of structured component to reconfiguration ports of reconfiguration controller.\r\n(self.connectorEndpoints -> select(oclIsKindOf(ReconfigurationPort)) -> size() = 2)"
		   });
	}

} //ReconfigurationPackageImpl
