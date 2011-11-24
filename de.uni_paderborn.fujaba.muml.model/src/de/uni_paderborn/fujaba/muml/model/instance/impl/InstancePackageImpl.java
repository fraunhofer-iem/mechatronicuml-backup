/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.expressions.ExpressionsPackage;

import de.fujaba.modelinstance.ModelinstancePackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl;
import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl;
import de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance;
import de.uni_paderborn.fujaba.muml.model.instance.AttributeBinding;
import de.uni_paderborn.fujaba.muml.model.instance.BehaviorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.BehavioralElementInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ContinuousPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance;
import de.uni_paderborn.fujaba.muml.model.instance.HardwarePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.HybridPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstanceFactory;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;
import de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage;
import de.uni_paderborn.fujaba.muml.model.msgiface.impl.MsgifacePackageImpl;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.impl.PatternPackageImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.HelperPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.helper.impl.HelperPackageImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstancePackageImpl extends EPackageImpl implements InstancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwarePortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousPortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hybridPortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discretePortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteSinglePortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteMultiPortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fujabaRealtimeStatechartInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioralElementInstanceEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InstancePackageImpl() {
		super(eNS_URI, InstanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InstancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InstancePackage init() {
		if (isInited) return (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);

		// Obtain or create and register package
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InstancePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelinstancePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		HelperPackageImpl theHelperPackage = (HelperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) instanceof HelperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) : HelperPackage.eINSTANCE);
		MsgifacePackageImpl theMsgifacePackage = (MsgifacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) instanceof MsgifacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) : MsgifacePackage.eINSTANCE);
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);

		// Create package meta-data objects
		theInstancePackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theCorePackage.createPackageContents();
		thePatternPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theHelperPackage.createPackageContents();
		theMsgifacePackage.createPackageContents();
		theDeploymentPackage.createPackageContents();

		// Initialize created meta-data
		theInstancePackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		thePatternPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theHelperPackage.initializePackageContents();
		theMsgifacePackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInstancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InstancePackage.eNS_URI, theInstancePackage);
		return theInstancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstance() {
		return componentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_ComponentType() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_EmbeddedCIC() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_PortInstances() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorInstance() {
		return connectorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorInstance_Source() {
		return (EReference)connectorInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorInstance_Target() {
		return (EReference)connectorInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorInstance_ConnectorType() {
		return (EReference)connectorInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortInstance() {
		return portInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstance_PortType() {
		return (EReference)portInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstance_ComponentInstance() {
		return (EReference)portInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstance_IncomingConnectorInstances() {
		return (EReference)portInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstance_OutgoingConnectorInstances() {
		return (EReference)portInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstance_ConnectorInstances() {
		return (EReference)portInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyInstance() {
		return assemblyInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyInstance_AssemblyType() {
		return (EReference)assemblyInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyInstance_CoordinationPattern() {
		return (EReference)assemblyInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegationInstance() {
		return delegationInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationInstance_DelegationType() {
		return (EReference)delegationInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstanceConfiguration() {
		return componentInstanceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstanceConfiguration_ComponentInstances() {
		return (EReference)componentInstanceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstanceConfiguration_ConnectorInstances() {
		return (EReference)componentInstanceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstanceConfiguration_ParentPortInstancesDerived() {
		return (EReference)componentInstanceConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwarePortInstance() {
		return hardwarePortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuousPortInstance() {
		return continuousPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHybridPortInstance() {
		return hybridPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscretePortInstance() {
		return discretePortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePortInstance_ReceiverMessageInterface() {
		return (EReference)discretePortInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePortInstance_SenderMessageInterface() {
		return (EReference)discretePortInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteSinglePortInstance() {
		return discreteSinglePortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteSinglePortInstance_MultiPortInstance() {
		return (EReference)discreteSinglePortInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteMultiPortInstance() {
		return discreteMultiPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteMultiPortInstance_SubPortInstances() {
		return (EReference)discreteMultiPortInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteMultiPortInstance_AdaptationBehaviorInstance() {
		return (EReference)discreteMultiPortInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorInstance() {
		return behaviorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorInstance_Behavior() {
		return (EReference)behaviorInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorInstance_BehavioralElementInstance() {
		return (EReference)behaviorInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFujabaRealtimeStatechartInstance() {
		return fujabaRealtimeStatechartInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFujabaRealtimeStatechartInstance_Statechart() {
		return (EReference)fujabaRealtimeStatechartInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFujabaRealtimeStatechartInstance_EmbeddedSubStatecharts() {
		return (EReference)fujabaRealtimeStatechartInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFujabaRealtimeStatechartInstance_ReferencedSubStatecharts() {
		return (EReference)fujabaRealtimeStatechartInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFujabaRealtimeStatechartInstance_AllSubStatecharts() {
		return (EReference)fujabaRealtimeStatechartInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFujabaRealtimeStatechartInstance_ParentStatechart() {
		return (EReference)fujabaRealtimeStatechartInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioralElementInstance() {
		return behavioralElementInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralElementInstance_BehaviorInstance() {
		return (EReference)behavioralElementInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralElementInstance_BehavioralElementType() {
		return (EReference)behavioralElementInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceFactory getInstanceFactory() {
		return (InstanceFactory)getEFactoryInstance();
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
		componentInstanceEClass = createEClass(COMPONENT_INSTANCE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__COMPONENT_TYPE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__EMBEDDED_CIC);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__PORT_INSTANCES);

		connectorInstanceEClass = createEClass(CONNECTOR_INSTANCE);
		createEReference(connectorInstanceEClass, CONNECTOR_INSTANCE__SOURCE);
		createEReference(connectorInstanceEClass, CONNECTOR_INSTANCE__TARGET);
		createEReference(connectorInstanceEClass, CONNECTOR_INSTANCE__CONNECTOR_TYPE);

		portInstanceEClass = createEClass(PORT_INSTANCE);
		createEReference(portInstanceEClass, PORT_INSTANCE__PORT_TYPE);
		createEReference(portInstanceEClass, PORT_INSTANCE__COMPONENT_INSTANCE);
		createEReference(portInstanceEClass, PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES);
		createEReference(portInstanceEClass, PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES);
		createEReference(portInstanceEClass, PORT_INSTANCE__CONNECTOR_INSTANCES);

		assemblyInstanceEClass = createEClass(ASSEMBLY_INSTANCE);
		createEReference(assemblyInstanceEClass, ASSEMBLY_INSTANCE__ASSEMBLY_TYPE);
		createEReference(assemblyInstanceEClass, ASSEMBLY_INSTANCE__COORDINATION_PATTERN);

		delegationInstanceEClass = createEClass(DELEGATION_INSTANCE);
		createEReference(delegationInstanceEClass, DELEGATION_INSTANCE__DELEGATION_TYPE);

		componentInstanceConfigurationEClass = createEClass(COMPONENT_INSTANCE_CONFIGURATION);
		createEReference(componentInstanceConfigurationEClass, COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES);
		createEReference(componentInstanceConfigurationEClass, COMPONENT_INSTANCE_CONFIGURATION__CONNECTOR_INSTANCES);
		createEReference(componentInstanceConfigurationEClass, COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES_DERIVED);

		hardwarePortInstanceEClass = createEClass(HARDWARE_PORT_INSTANCE);

		continuousPortInstanceEClass = createEClass(CONTINUOUS_PORT_INSTANCE);

		hybridPortInstanceEClass = createEClass(HYBRID_PORT_INSTANCE);

		discretePortInstanceEClass = createEClass(DISCRETE_PORT_INSTANCE);
		createEReference(discretePortInstanceEClass, DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_INTERFACE);
		createEReference(discretePortInstanceEClass, DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_INTERFACE);

		discreteSinglePortInstanceEClass = createEClass(DISCRETE_SINGLE_PORT_INSTANCE);
		createEReference(discreteSinglePortInstanceEClass, DISCRETE_SINGLE_PORT_INSTANCE__MULTI_PORT_INSTANCE);

		discreteMultiPortInstanceEClass = createEClass(DISCRETE_MULTI_PORT_INSTANCE);
		createEReference(discreteMultiPortInstanceEClass, DISCRETE_MULTI_PORT_INSTANCE__SUB_PORT_INSTANCES);
		createEReference(discreteMultiPortInstanceEClass, DISCRETE_MULTI_PORT_INSTANCE__ADAPTATION_BEHAVIOR_INSTANCE);

		behaviorInstanceEClass = createEClass(BEHAVIOR_INSTANCE);
		createEReference(behaviorInstanceEClass, BEHAVIOR_INSTANCE__BEHAVIOR);
		createEReference(behaviorInstanceEClass, BEHAVIOR_INSTANCE__BEHAVIORAL_ELEMENT_INSTANCE);

		fujabaRealtimeStatechartInstanceEClass = createEClass(FUJABA_REALTIME_STATECHART_INSTANCE);
		createEReference(fujabaRealtimeStatechartInstanceEClass, FUJABA_REALTIME_STATECHART_INSTANCE__STATECHART);
		createEReference(fujabaRealtimeStatechartInstanceEClass, FUJABA_REALTIME_STATECHART_INSTANCE__EMBEDDED_SUB_STATECHARTS);
		createEReference(fujabaRealtimeStatechartInstanceEClass, FUJABA_REALTIME_STATECHART_INSTANCE__REFERENCED_SUB_STATECHARTS);
		createEReference(fujabaRealtimeStatechartInstanceEClass, FUJABA_REALTIME_STATECHART_INSTANCE__ALL_SUB_STATECHARTS);
		createEReference(fujabaRealtimeStatechartInstanceEClass, FUJABA_REALTIME_STATECHART_INSTANCE__PARENT_STATECHART);

		behavioralElementInstanceEClass = createEClass(BEHAVIORAL_ELEMENT_INSTANCE);
		createEReference(behavioralElementInstanceEClass, BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIOR_INSTANCE);
		createEReference(behavioralElementInstanceEClass, BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE);
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
		SDMPackage theSDMPackage = (SDMPackage)EPackage.Registry.INSTANCE.getEPackage(SDMPackage.eNS_URI);
		ComponentPackage theComponentPackage = (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);
		PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
		MsgifacePackage theMsgifacePackage = (MsgifacePackage)EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		RealtimestatechartPackage theRealtimestatechartPackage = (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentInstanceEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		componentInstanceEClass.getESuperTypes().add(this.getBehavioralElementInstance());
		connectorInstanceEClass.getESuperTypes().add(theSDMPackage.getExtendableElement());
		connectorInstanceEClass.getESuperTypes().add(this.getBehavioralElementInstance());
		portInstanceEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		portInstanceEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
		portInstanceEClass.getESuperTypes().add(this.getBehavioralElementInstance());
		assemblyInstanceEClass.getESuperTypes().add(this.getConnectorInstance());
		delegationInstanceEClass.getESuperTypes().add(this.getConnectorInstance());
		componentInstanceConfigurationEClass.getESuperTypes().add(theSDMPackage.getExtendableElement());
		hardwarePortInstanceEClass.getESuperTypes().add(this.getPortInstance());
		continuousPortInstanceEClass.getESuperTypes().add(this.getPortInstance());
		hybridPortInstanceEClass.getESuperTypes().add(this.getDiscretePortInstance());
		hybridPortInstanceEClass.getESuperTypes().add(this.getContinuousPortInstance());
		discretePortInstanceEClass.getESuperTypes().add(this.getPortInstance());
		discreteSinglePortInstanceEClass.getESuperTypes().add(this.getDiscretePortInstance());
		discreteMultiPortInstanceEClass.getESuperTypes().add(this.getDiscretePortInstance());
		fujabaRealtimeStatechartInstanceEClass.getESuperTypes().add(this.getBehaviorInstance());

		// Initialize classes and features; add operations and parameters
		initEClass(componentInstanceEClass, ComponentInstance.class, "ComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstance_ComponentType(), theComponentPackage.getComponent(), null, "componentType", null, 1, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_EmbeddedCIC(), this.getComponentInstanceConfiguration(), null, "embeddedCIC", null, 0, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_PortInstances(), this.getPortInstance(), this.getPortInstance_ComponentInstance(), "portInstances", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorInstanceEClass, ConnectorInstance.class, "ConnectorInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorInstance_Source(), this.getPortInstance(), this.getPortInstance_OutgoingConnectorInstances(), "source", null, 1, 1, ConnectorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorInstance_Target(), this.getPortInstance(), this.getPortInstance_IncomingConnectorInstances(), "target", null, 1, 1, ConnectorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorInstance_ConnectorType(), theComponentPackage.getConnectorType(), null, "connectorType", null, 0, 1, ConnectorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portInstanceEClass, PortInstance.class, "PortInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortInstance_PortType(), theComponentPackage.getPort(), null, "portType", null, 1, 1, PortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstance_ComponentInstance(), this.getComponentInstance(), this.getComponentInstance_PortInstances(), "componentInstance", null, 0, 1, PortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstance_IncomingConnectorInstances(), this.getConnectorInstance(), this.getConnectorInstance_Target(), "incomingConnectorInstances", null, 0, -1, PortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstance_OutgoingConnectorInstances(), this.getConnectorInstance(), this.getConnectorInstance_Source(), "outgoingConnectorInstances", null, 0, -1, PortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstance_ConnectorInstances(), this.getConnectorInstance(), null, "connectorInstances", null, 0, -1, PortInstance.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(assemblyInstanceEClass, AssemblyInstance.class, "AssemblyInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyInstance_AssemblyType(), theComponentPackage.getAssembly(), null, "assemblyType", null, 0, 1, AssemblyInstance.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyInstance_CoordinationPattern(), thePatternPackage.getCoordinationPattern(), null, "coordinationPattern", null, 1, 1, AssemblyInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationInstanceEClass, DelegationInstance.class, "DelegationInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationInstance_DelegationType(), theComponentPackage.getDelegation(), null, "delegationType", null, 0, 1, DelegationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentInstanceConfigurationEClass, ComponentInstanceConfiguration.class, "ComponentInstanceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstanceConfiguration_ComponentInstances(), this.getComponentInstance(), null, "componentInstances", null, 0, -1, ComponentInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstanceConfiguration_ConnectorInstances(), this.getConnectorInstance(), null, "connectorInstances", null, 0, -1, ComponentInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstanceConfiguration_ParentPortInstancesDerived(), this.getPortInstance(), null, "parentPortInstancesDerived", null, 0, -1, ComponentInstanceConfiguration.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(componentInstanceConfigurationEClass, this.getPortInstance(), "getParentPortInstances", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(hardwarePortInstanceEClass, HardwarePortInstance.class, "HardwarePortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuousPortInstanceEClass, ContinuousPortInstance.class, "ContinuousPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hybridPortInstanceEClass, HybridPortInstance.class, "HybridPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discretePortInstanceEClass, DiscretePortInstance.class, "DiscretePortInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscretePortInstance_ReceiverMessageInterface(), theMsgifacePackage.getMessageInterface(), null, "receiverMessageInterface", null, 0, 1, DiscretePortInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDiscretePortInstance_SenderMessageInterface(), theMsgifacePackage.getMessageInterface(), null, "senderMessageInterface", null, 0, 1, DiscretePortInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(discreteSinglePortInstanceEClass, DiscreteSinglePortInstance.class, "DiscreteSinglePortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscreteSinglePortInstance_MultiPortInstance(), this.getDiscreteMultiPortInstance(), this.getDiscreteMultiPortInstance_SubPortInstances(), "multiPortInstance", null, 0, 1, DiscreteSinglePortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discreteMultiPortInstanceEClass, DiscreteMultiPortInstance.class, "DiscreteMultiPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscreteMultiPortInstance_SubPortInstances(), this.getDiscreteSinglePortInstance(), this.getDiscreteSinglePortInstance_MultiPortInstance(), "subPortInstances", null, 0, -1, DiscreteMultiPortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscreteMultiPortInstance_AdaptationBehaviorInstance(), this.getBehaviorInstance(), null, "adaptationBehaviorInstance", null, 1, 1, DiscreteMultiPortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(behaviorInstanceEClass, BehaviorInstance.class, "BehaviorInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorInstance_Behavior(), theCorePackage.getBehavior(), null, "behavior", null, 1, 1, BehaviorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorInstance_BehavioralElementInstance(), this.getBehavioralElementInstance(), this.getBehavioralElementInstance_BehaviorInstance(), "behavioralElementInstance", null, 1, 1, BehaviorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fujabaRealtimeStatechartInstanceEClass, FujabaRealtimeStatechartInstance.class, "FujabaRealtimeStatechartInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFujabaRealtimeStatechartInstance_Statechart(), theRealtimestatechartPackage.getFujabaRealtimeStatechart(), null, "statechart", null, 1, 1, FujabaRealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFujabaRealtimeStatechartInstance_EmbeddedSubStatecharts(), this.getFujabaRealtimeStatechartInstance(), this.getFujabaRealtimeStatechartInstance_ParentStatechart(), "embeddedSubStatecharts", null, 0, -1, FujabaRealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFujabaRealtimeStatechartInstance_ReferencedSubStatecharts(), this.getFujabaRealtimeStatechartInstance(), null, "referencedSubStatecharts", null, 0, -1, FujabaRealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFujabaRealtimeStatechartInstance_AllSubStatecharts(), this.getFujabaRealtimeStatechartInstance(), null, "allSubStatecharts", null, 0, -1, FujabaRealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFujabaRealtimeStatechartInstance_ParentStatechart(), this.getFujabaRealtimeStatechartInstance(), this.getFujabaRealtimeStatechartInstance_EmbeddedSubStatecharts(), "parentStatechart", null, 1, 1, FujabaRealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behavioralElementInstanceEClass, BehavioralElementInstance.class, "BehavioralElementInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavioralElementInstance_BehaviorInstance(), this.getBehaviorInstance(), this.getBehaviorInstance_BehavioralElementInstance(), "behaviorInstance", null, 0, -1, BehavioralElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavioralElementInstance_BehavioralElementType(), theCorePackage.getBehavioralElement(), null, "behavioralElementType", null, 1, 1, BehavioralElementInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getPortInstance_ConnectorInstances(), 
		   source, 
		   new String[] {
			 "derivation", "self.incomingConnectorInstances -> union(self.outgoingConnectorInstances )"
		   });				
		addAnnotation
		  (getAssemblyInstance_AssemblyType(), 
		   source, 
		   new String[] {
			 "derivation", "connectorType.oclAsType(component::Assembly)"
		   });					
		addAnnotation
		  (getDelegationInstance_DelegationType(), 
		   source, 
		   new String[] {
			 "derivation", "connectorType.oclAsType(component::Delegation)"
		   });						
		addAnnotation
		  (getComponentInstanceConfiguration_ParentPortInstancesDerived(), 
		   source, 
		   new String[] {
			 "derivation", "getParentPortInstances()\r\n"
		   });							
		addAnnotation
		  (getDiscretePortInstance_ReceiverMessageInterface(), 
		   source, 
		   new String[] {
			 "derivation", "if portType.oclIsUndefined() or not portType.oclIsKindOf(component::DiscretePort) then\n\tnull\nelse\n\tportType.oclAsType(component::DiscretePort).receiverMessageInterface\nendif"
		   });			
		addAnnotation
		  (getDiscretePortInstance_SenderMessageInterface(), 
		   source, 
		   new String[] {
			 "derivation", "if portType.oclIsUndefined() or not portType.oclIsKindOf(component::DiscretePort) then\n\tnull\nelse\n\tportType.oclAsType(component::DiscretePort).senderMessageInterface\nendif"
		   });															
		addAnnotation
		  (getFujabaRealtimeStatechartInstance_AllSubStatecharts(), 
		   source, 
		   new String[] {
			 "derivation", "embeddedSubStatecharts -> union(referencedSubStatecharts)"
		   });				
	}

} //InstancePackageImpl
