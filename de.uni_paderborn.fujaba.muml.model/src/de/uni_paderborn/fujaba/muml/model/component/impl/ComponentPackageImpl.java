/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.modeling.SDMPackage;

import de.fujaba.modelinstance.ModelinstancePackage;
import de.uni_paderborn.fujaba.muml.model.component.Assembly;
import de.uni_paderborn.fujaba.muml.model.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.model.component.BehavioralConnector;
import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.component.ComponentFactory;
import de.uni_paderborn.fujaba.muml.model.component.ComponentKind;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.ConnectorType;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPort;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind;
import de.uni_paderborn.fujaba.muml.model.component.Delegation;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.component.HybridPort;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.model.component.util.ComponentValidator;
import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl;
import de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage;
import de.uni_paderborn.fujaba.muml.model.msgiface.impl.MsgifacePackageImpl;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.impl.PatternPackageImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentPackageImpl extends EPackageImpl implements ComponentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discretePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioralConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hybridPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum continuousPortDirectionKindEEnum = null;

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
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentPackageImpl() {
		super(eNS_URI, ComponentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentPackage init() {
		if (isInited) return (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);

		// Obtain or create and register package
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelinstancePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		MsgifacePackageImpl theMsgifacePackage = (MsgifacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) instanceof MsgifacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) : MsgifacePackage.eINSTANCE);
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);

		// Create package meta-data objects
		theComponentPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theInstancePackage.createPackageContents();
		thePatternPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theMsgifacePackage.createPackageContents();
		theDeploymentPackage.createPackageContents();

		// Initialize created meta-data
		theComponentPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		thePatternPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theMsgifacePackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theComponentPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ComponentValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theComponentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentPackage.eNS_URI, theComponentPackage);
		return theComponentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Ports() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ReferencingComponentParts() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_ComponentType() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Component() {
		return (EReference)portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Connectors() {
		return (EReference)portEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuousPort() {
		return continuousPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinuousPort_Kind() {
		return (EAttribute)continuousPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContinuousPort_Type() {
		return (EReference)continuousPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscretePort() {
		return discretePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePort_Refines() {
		return (EReference)discretePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePort_SenderMessageInterface() {
		return (EReference)discretePortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePort_ReceiverMessageInterface() {
		return (EReference)discretePortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePort_AdaptationBehavior() {
		return (EReference)discretePortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePort_RoleAndAdaptationBehavior() {
		return (EReference)discretePortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Cardinality() {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_IncomingConnectors() {
		return (EReference)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_OutgoingConnectors() {
		return (EReference)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentPart() {
		return componentPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_ComponentType() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_ParentComponent() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_FromRev() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_ToRev() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_Delegation() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_PortsDerived() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_Cardinality() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredComponent() {
		return structuredComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredComponent_EmbeddedParts() {
		return (EReference)structuredComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredComponent_Connectors() {
		return (EReference)structuredComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicComponent() {
		return atomicComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorType() {
		return connectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_FromPort() {
		return (EReference)connectorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_ToPort() {
		return (EReference)connectorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_ParentComponent() {
		return (EReference)connectorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssembly() {
		return assemblyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssembly_To() {
		return (EReference)assemblyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssembly_From() {
		return (EReference)assemblyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssembly_CoordinationPattern() {
		return (EReference)assemblyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegation() {
		return delegationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegation_ComponentPart() {
		return (EReference)delegationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioralConnector() {
		return behavioralConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHybridPort() {
		return hybridPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentKind() {
		return componentKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContinuousPortDirectionKind() {
		return continuousPortDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentFactory getComponentFactory() {
		return (ComponentFactory)getEFactoryInstance();
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
		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__PORTS);
		createEReference(componentEClass, COMPONENT__REFERENCING_COMPONENT_PARTS);
		createEAttribute(componentEClass, COMPONENT__COMPONENT_TYPE);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__CARDINALITY);
		createEReference(portEClass, PORT__INCOMING_CONNECTORS);
		createEReference(portEClass, PORT__OUTGOING_CONNECTORS);
		createEReference(portEClass, PORT__COMPONENT);
		createEReference(portEClass, PORT__CONNECTORS);

		continuousPortEClass = createEClass(CONTINUOUS_PORT);
		createEAttribute(continuousPortEClass, CONTINUOUS_PORT__KIND);
		createEReference(continuousPortEClass, CONTINUOUS_PORT__TYPE);

		discretePortEClass = createEClass(DISCRETE_PORT);
		createEReference(discretePortEClass, DISCRETE_PORT__REFINES);
		createEReference(discretePortEClass, DISCRETE_PORT__SENDER_MESSAGE_INTERFACE);
		createEReference(discretePortEClass, DISCRETE_PORT__RECEIVER_MESSAGE_INTERFACE);
		createEReference(discretePortEClass, DISCRETE_PORT__ADAPTATION_BEHAVIOR);
		createEReference(discretePortEClass, DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR);

		componentPartEClass = createEClass(COMPONENT_PART);
		createEReference(componentPartEClass, COMPONENT_PART__COMPONENT_TYPE);
		createEReference(componentPartEClass, COMPONENT_PART__PARENT_COMPONENT);
		createEReference(componentPartEClass, COMPONENT_PART__FROM_REV);
		createEReference(componentPartEClass, COMPONENT_PART__TO_REV);
		createEReference(componentPartEClass, COMPONENT_PART__DELEGATION);
		createEReference(componentPartEClass, COMPONENT_PART__CARDINALITY);
		createEReference(componentPartEClass, COMPONENT_PART__PORTS_DERIVED);

		structuredComponentEClass = createEClass(STRUCTURED_COMPONENT);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__EMBEDDED_PARTS);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__CONNECTORS);

		atomicComponentEClass = createEClass(ATOMIC_COMPONENT);

		connectorTypeEClass = createEClass(CONNECTOR_TYPE);
		createEReference(connectorTypeEClass, CONNECTOR_TYPE__FROM_PORT);
		createEReference(connectorTypeEClass, CONNECTOR_TYPE__TO_PORT);
		createEReference(connectorTypeEClass, CONNECTOR_TYPE__PARENT_COMPONENT);

		assemblyEClass = createEClass(ASSEMBLY);
		createEReference(assemblyEClass, ASSEMBLY__TO);
		createEReference(assemblyEClass, ASSEMBLY__FROM);
		createEReference(assemblyEClass, ASSEMBLY__COORDINATION_PATTERN);

		delegationEClass = createEClass(DELEGATION);
		createEReference(delegationEClass, DELEGATION__COMPONENT_PART);

		behavioralConnectorEClass = createEClass(BEHAVIORAL_CONNECTOR);

		hybridPortEClass = createEClass(HYBRID_PORT);

		// Create enums
		componentKindEEnum = createEEnum(COMPONENT_KIND);
		continuousPortDirectionKindEEnum = createEEnum(CONTINUOUS_PORT_DIRECTION_KIND);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
		MsgifacePackage theMsgifacePackage = (MsgifacePackage)EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		componentEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
		componentEClass.getESuperTypes().add(theCorePackage.getConstrainableElement());
		portEClass.getESuperTypes().add(theSDMPackage.getNamedElement());
		portEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
		portEClass.getESuperTypes().add(theCorePackage.getConstrainableElement());
		continuousPortEClass.getESuperTypes().add(this.getPort());
		discretePortEClass.getESuperTypes().add(this.getPort());
		discretePortEClass.getESuperTypes().add(theCorePackage.getBehavioralElement());
		componentPartEClass.getESuperTypes().add(theSDMPackage.getCommentableElement());
		structuredComponentEClass.getESuperTypes().add(this.getComponent());
		atomicComponentEClass.getESuperTypes().add(this.getComponent());
		atomicComponentEClass.getESuperTypes().add(theCorePackage.getBehavioralElement());
		connectorTypeEClass.getESuperTypes().add(theSDMPackage.getExtendableElement());
		assemblyEClass.getESuperTypes().add(this.getBehavioralConnector());
		delegationEClass.getESuperTypes().add(this.getConnectorType());
		behavioralConnectorEClass.getESuperTypes().add(this.getConnectorType());
		behavioralConnectorEClass.getESuperTypes().add(theCorePackage.getBehavioralElement());
		hybridPortEClass.getESuperTypes().add(this.getDiscretePort());
		hybridPortEClass.getESuperTypes().add(this.getContinuousPort());

		// Initialize classes and features; add operations and parameters
		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Ports(), this.getPort(), this.getPort_Component(), "ports", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ReferencingComponentParts(), this.getComponentPart(), this.getComponentPart_ComponentType(), "referencingComponentParts", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_ComponentType(), this.getComponentKind(), "componentType", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Cardinality(), theCorePackage.getCardinality(), null, "cardinality", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_IncomingConnectors(), this.getConnectorType(), this.getConnectorType_ToPort(), "incomingConnectors", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_OutgoingConnectors(), this.getConnectorType(), this.getConnectorType_FromPort(), "outgoingConnectors", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Component(), this.getComponent(), this.getComponent_Ports(), "component", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Connectors(), this.getConnectorType(), null, "connectors", null, 0, -1, Port.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(continuousPortEClass, ContinuousPort.class, "ContinuousPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousPort_Kind(), this.getContinuousPortDirectionKind(), "kind", null, 1, 1, ContinuousPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContinuousPort_Type(), theEcorePackage.getEDataType(), null, "type", null, 1, 1, ContinuousPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discretePortEClass, DiscretePort.class, "DiscretePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscretePort_Refines(), thePatternPackage.getRole(), thePatternPackage.getRole_Port(), "refines", null, 0, 1, DiscretePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscretePort_SenderMessageInterface(), theMsgifacePackage.getMessageInterface(), null, "senderMessageInterface", null, 0, 1, DiscretePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscretePort_ReceiverMessageInterface(), theMsgifacePackage.getMessageInterface(), null, "receiverMessageInterface", null, 0, 1, DiscretePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscretePort_AdaptationBehavior(), theCorePackage.getBehavior(), null, "adaptationBehavior", null, 0, 1, DiscretePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscretePort_RoleAndAdaptationBehavior(), theCorePackage.getBehavior(), null, "roleAndAdaptationBehavior", null, 0, 1, DiscretePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentPartEClass, ComponentPart.class, "ComponentPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPart_ComponentType(), this.getComponent(), this.getComponent_ReferencingComponentParts(), "componentType", null, 1, 1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_ParentComponent(), this.getStructuredComponent(), this.getStructuredComponent_EmbeddedParts(), "parentComponent", null, 1, 1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_FromRev(), this.getAssembly(), this.getAssembly_From(), "fromRev", null, 0, -1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_ToRev(), this.getAssembly(), this.getAssembly_To(), "toRev", null, 0, -1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_Delegation(), this.getDelegation(), this.getDelegation_ComponentPart(), "delegation", null, 0, -1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_Cardinality(), theCorePackage.getCardinality(), null, "cardinality", null, 1, 1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_PortsDerived(), this.getPort(), null, "portsDerived", null, 0, -1, ComponentPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(structuredComponentEClass, StructuredComponent.class, "StructuredComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredComponent_EmbeddedParts(), this.getComponentPart(), this.getComponentPart_ParentComponent(), "embeddedParts", null, 1, -1, StructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredComponent_Connectors(), this.getConnectorType(), this.getConnectorType_ParentComponent(), "connectors", null, 0, -1, StructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicComponentEClass, AtomicComponent.class, "AtomicComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectorTypeEClass, ConnectorType.class, "ConnectorType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorType_FromPort(), this.getPort(), this.getPort_OutgoingConnectors(), "fromPort", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorType_ToPort(), this.getPort(), this.getPort_IncomingConnectors(), "toPort", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorType_ParentComponent(), this.getStructuredComponent(), this.getStructuredComponent_Connectors(), "parentComponent", null, 0, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyEClass, Assembly.class, "Assembly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssembly_To(), this.getComponentPart(), this.getComponentPart_ToRev(), "to", null, 1, 1, Assembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssembly_From(), this.getComponentPart(), this.getComponentPart_FromRev(), "from", null, 1, 1, Assembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssembly_CoordinationPattern(), thePatternPackage.getCoordinationPattern(), null, "coordinationPattern", null, 1, 1, Assembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationEClass, Delegation.class, "Delegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegation_ComponentPart(), this.getComponentPart(), this.getComponentPart_Delegation(), "componentPart", null, 1, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behavioralConnectorEClass, BehavioralConnector.class, "BehavioralConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hybridPortEClass, HybridPort.class, "HybridPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(componentKindEEnum, ComponentKind.class, "ComponentKind");
		addEEnumLiteral(componentKindEEnum, ComponentKind.SOFTWARE_COMPONENT);
		addEEnumLiteral(componentKindEEnum, ComponentKind.CONTINUOUS_COMPONENT);
		addEEnumLiteral(componentKindEEnum, ComponentKind.HYBRID_COMPONENT);

		initEEnum(continuousPortDirectionKindEEnum, ContinuousPortDirectionKind.class, "ContinuousPortDirectionKind");
		addEEnumLiteral(continuousPortDirectionKindEEnum, ContinuousPortDirectionKind.IN);
		addEEnumLiteral(continuousPortDirectionKindEEnum, ContinuousPortDirectionKind.OUT);

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
		  (componentEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniquePortNames SoftwareComponentHasOnlyDiscretePorts ContinuousComponentHasOnlyContinuousPorts HybridComponentHasOnlyHybridPorts"
		   });													
		addAnnotation
		  (continuousPortEClass, 
		   source, 
		   new String[] {
			 "constraints", "LowerBoundMustBeZeroOrOne UpperBoundMustBeOne"
		   });					
		addAnnotation
		  (discretePortEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtLeastOneMessageInterface DiscretePortRequiresBehavior"
		   });						
		addAnnotation
		  (componentPartEClass, 
		   source, 
		   new String[] {
			 "constraints", "CardinalityLowerBoundSet TypeNotEqualToParent CardinalityUpperBoundSet"
		   });													
		addAnnotation
		  (structuredComponentEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueComponentPartsWithinStructuredComponent"
		   });							
		addAnnotation
		  (atomicComponentEClass, 
		   source, 
		   new String[] {
			 "constraints", "SoftwareComponentRequiresBehavior"
		   });							
		addAnnotation
		  (assemblyEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidDiscretePortDiscretePortConnection NoSelfAssembliesForSinglePorts ValidContinuousPortDirections"
		   });														
		addAnnotation
		  (hybridPortEClass, 
		   source, 
		   new String[] {
			 "constraints", "LowerBoundMustBeZeroOrOne UpperBoundMustBeOne"
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
		  (componentEClass, 
		   source, 
		   new String[] {
			 "UniquePortNames", "self.ports->isUnique(name)",
			 "SoftwareComponentHasOnlyDiscretePorts", "-- use typeOf otherwise hybrid ports are also allowed\nself.componentType = component::ComponentKind::SOFTWARE_COMPONENT implies self.ports->forAll(port | port.oclIsTypeOf(component::DiscretePort))",
			 "ContinuousComponentHasOnlyContinuousPorts", "-- use typeOf otherwise hybrid ports are also allowed\nself.componentType = component::ComponentKind::CONTINUOUS_COMPONENT implies self.ports->forAll(port | port.oclIsTypeOf(component::ContinuousPort))",
			 "HybridComponentHasOnlyHybridPorts", "self.componentType = component::ComponentKind::HYBRID_COMPONENT implies self.ports->forAll(port | port.oclIsKindOf(component::HybridPort))"
		   });										
		addAnnotation
		  (getPort_Connectors(), 
		   source, 
		   new String[] {
			 "derivation", "self.incomingConnectors -> union(self.outgoingConnectors)"
		   });				
		addAnnotation
		  (continuousPortEClass, 
		   source, 
		   new String[] {
			 "LowerBoundMustBeZeroOrOne", "-- This Constraint is fulfilled, if no Cardinality exists.\n-- But that is okay, as then another Problem-Marker is shown,\n-- because Cardinality.lowerBound is 1..1\nself.cardinality.oclIsUndefined() or (\n\tif self.cardinality.lowerBound.oclIsUndefined() then\n\t\tfalse\n\telse\n\t\tself.cardinality.lowerBound.value = 0 or self.cardinality.lowerBound.value = 1\n\tendif\n)",
			 "UpperBoundMustBeOne", "-- This Constraint is fulfilled, if no Cardinality exists.\n-- But that is okay, as then another Problem-Marker is shown,\n-- because Cardinality.upperBound is 1..1\nself.cardinality.oclIsUndefined() or (\n\tif self.cardinality.upperBound.oclIsUndefined() then\n\t\tfalse\n\telse\n\t\tself.cardinality.upperBound.value = 1\n\tendif\n)"
		   });					
		addAnnotation
		  (discretePortEClass, 
		   source, 
		   new String[] {
			 "AtLeastOneMessageInterface", "self.oclIsTypeOf(component::DiscretePort) implies (not (self.senderMessageInterface.oclIsUndefined() and self.receiverMessageInterface.oclIsUndefined()))",
			 "DiscretePortRequiresBehavior", "-- clarify if this also holds for hybrid ports\nnot self.behavior.oclIsUndefined()"
		   });							
		addAnnotation
		  (componentPartEClass, 
		   source, 
		   new String[] {
			 "CardinalityLowerBoundSet", "self.cardinality.lowerBound->notEmpty()",
			 "TypeNotEqualToParent", "self.componentType <> self.parentComponent",
			 "CardinalityUpperBoundSet", "self.cardinality.upperBound->notEmpty()"
		   });								
		addAnnotation
		  (getComponentPart_PortsDerived(), 
		   source, 
		   new String[] {
			 "derivation", "if componentType.oclIsUndefined() then\r\n\tOrderedSet { }\r\nelse\r\n\tcomponentType.ports\r\nendif"
		   });					
		addAnnotation
		  (structuredComponentEClass, 
		   source, 
		   new String[] {
			 "UniqueComponentPartsWithinStructuredComponent", "self.embeddedParts->isUnique(p | p.componentType)"
		   });					
		addAnnotation
		  (atomicComponentEClass, 
		   source, 
		   new String[] {
			 "SoftwareComponentRequiresBehavior", "self.componentType = component::ComponentKind::SOFTWARE_COMPONENT implies (not self.behavior.oclIsUndefined())"
		   });									
		addAnnotation
		  (assemblyEClass, 
		   source, 
		   new String[] {
			 "ValidDiscretePortDiscretePortConnection", "if not self.fromPort.oclIsUndefined() and not self.toPort.oclIsUndefined() then\n    if self.fromPort.oclIsKindOf(component::DiscretePort) and self.toPort.oclIsKindOf(component::DiscretePort) then\n        -- check compatibility of message interfaces\n        let fromPort : component::DiscretePort = self.fromPort.oclAsType(component::DiscretePort) in\n        let toPort : component::DiscretePort = self.toPort.oclAsType(component::DiscretePort) in\n        fromPort.senderMessageInterface = toPort.receiverMessageInterface \n        and fromPort.receiverMessageInterface = toPort.senderMessageInterface\n        and (\n            -- check refines\n            if fromPort.refines.oclIsUndefined() xor toPort.refines.oclIsUndefined() then\n                -- only one port has a refinement\n                false\n            else\n                fromPort.refines.oclIsUndefined() \n                -- both ports have a refinement\n                or fromPort.refines.coordinationPattern = toPort.refines.coordinationPattern\n                -- this check is sufficient\n                and not fromPort.refines.coordinationPattern.oclIsUndefined()\n                and (\n                    if fromPort.refines.coordinationPattern.roles->size() = 2 then\n                        fromPort.refines.name <> toPort.refines.name\n                    else\n                        -- both ports have the same role and belong the same pattern\n                        true\n                    endif\n                )\n            endif\n        )\n    else\n        -- this case must be checked by other constraints\n        true\n    endif\nelse\n    false\nendif",
			 "NoSelfAssembliesForSinglePorts", "self.fromPort.cardinality.upperBound.value <= 1\r\nimplies\r\nself.fromPort <> self.toPort",
			 "ValidContinuousPortDirections", "not self.fromPort.oclIsUndefined() and self.fromPort.oclIsKindOf(component::ContinuousPort) and\nnot self.toPort.oclIsUndefined() and self.toPort.oclIsKindOf(component::ContinuousPort)\nimplies\nself.fromPort.oclAsType(component::ContinuousPort).kind <> self.toPort.oclAsType(component::ContinuousPort).kind"
		   });														
		addAnnotation
		  (hybridPortEClass, 
		   source, 
		   new String[] {
			 "LowerBoundMustBeZeroOrOne", "-- This Constraint is fulfilled, if no Cardinality exists.\n-- But that is okay, as then another Problem-Marker is shown,\n-- because Cardinality.lowerBound is 1..1\nself.cardinality.oclIsUndefined() or (\n\tif self.cardinality.lowerBound.oclIsUndefined() then\n\t\tfalse\n\telse\n\t\tself.cardinality.lowerBound.value = 0 or self.cardinality.lowerBound.value = 1\n\tendif\n)",
			 "UpperBoundMustBeOne", "-- This Constraint is fulfilled, if no Cardinality exists.\n-- But that is okay, as then another Problem-Marker is shown,\n-- because Cardinality.upperBound is 1..1\nself.cardinality.oclIsUndefined() or (\n\tif self.cardinality.upperBound.oclIsUndefined() then\n\t\tfalse\n\telse\n\t\tself.cardinality.upperBound.value = 1\n\tendif\n)"
		   });			
	}

} //ComponentPackageImpl
