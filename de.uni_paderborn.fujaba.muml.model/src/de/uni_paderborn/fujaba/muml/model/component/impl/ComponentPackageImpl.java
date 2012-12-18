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

import de.fujaba.modelinstance.ModelinstancePackage;
import de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector;
import de.uni_paderborn.fujaba.muml.model.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.component.ComponentFactory;
import de.uni_paderborn.fujaba.muml.model.component.ComponentKind;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPort;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind;
import de.uni_paderborn.fujaba.muml.model.component.CoordinationProtocolOccurrence;
import de.uni_paderborn.fujaba.muml.model.component.DelegationConnector;
import de.uni_paderborn.fujaba.muml.model.component.DirectedTypedPort;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.component.HybridPort;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.PortConnector;
import de.uni_paderborn.fujaba.muml.model.component.StaticStructuredComponent;
import de.uni_paderborn.fujaba.muml.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.model.component.util.ComponentValidator;
import de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.model.connector.impl.ConnectorPackageImpl;
import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl;
import de.uni_paderborn.fujaba.muml.model.msgtype.MsgtypePackage;
import de.uni_paderborn.fujaba.muml.model.msgtype.impl.MsgtypePackageImpl;
import de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.model.protocol.impl.ProtocolPackageImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl;
import de.uni_paderborn.fujaba.muml.model.types.TypesPackage;
import de.uni_paderborn.fujaba.muml.model.types.impl.TypesPackageImpl;

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
	private EClass staticStructuredComponentEClass = null;

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
	private EClass directedTypedPortEClass = null;

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
	private EClass portConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationConnectorEClass = null;

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
	private EClass coordinationProtocolOccurrenceEClass = null;

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
		ProtocolPackageImpl theProtocolPackage = (ProtocolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) instanceof ProtocolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) : ProtocolPackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		MsgtypePackageImpl theMsgtypePackage = (MsgtypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) instanceof MsgtypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) : MsgtypePackage.eINSTANCE);
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ConnectorPackageImpl theConnectorPackage = (ConnectorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) instanceof ConnectorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) : ConnectorPackage.eINSTANCE);

		// Create package meta-data objects
		theComponentPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theProtocolPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theMsgtypePackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theConnectorPackage.createPackageContents();

		// Initialize created meta-data
		theComponentPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theProtocolPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theMsgtypePackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theConnectorPackage.initializePackageContents();

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
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_PortConnectors() {
		return (EReference)portEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getContinuousPort_IsContinuousInPort() {
		return (EAttribute)continuousPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinuousPort_IsContinuousOutPort() {
		return (EAttribute)continuousPortEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDiscretePort_IsDiscreteInPort() {
		return (EAttribute)discretePortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscretePort_IsDiscreteOutPort() {
		return (EAttribute)discretePortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscretePort_IsDiscreteInOutPort() {
		return (EAttribute)discretePortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePort_ReceiverMessageBuffer() {
		return (EReference)discretePortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscretePort_MultiPort() {
		return (EAttribute)discretePortEClass.getEStructuralFeatures().get(5);
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
	public EReference getComponentPart_AssemblyConnectors() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_DelegationConnectors() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_PortsDerived() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentPart_MultiPart() {
		return (EAttribute)componentPartEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticStructuredComponent() {
		return staticStructuredComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_Cardinality() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(4);
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
	public EReference getStructuredComponent_AllStructuredComponents() {
		return (EReference)structuredComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredComponent_AllAtomicComponents() {
		return (EReference)structuredComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedTypedPort() {
		return directedTypedPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTypedPort_Kind() {
		return (EAttribute)directedTypedPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedTypedPort_Type() {
		return (EReference)directedTypedPortEClass.getEStructuralFeatures().get(1);
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
	public EClass getPortConnector() {
		return portConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortConnector_ParentComponent() {
		return (EReference)portConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyConnector() {
		return assemblyConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyConnector_CoordinationProtocol() {
		return (EReference)assemblyConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyConnector_ComponentParts() {
		return (EReference)assemblyConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegationConnector() {
		return delegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationConnector_ComponentPart() {
		return (EReference)delegationConnectorEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getHybridPort_IsHybridInPort() {
		return (EAttribute)hybridPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHybridPort_IsHybridOutPort() {
		return (EAttribute)hybridPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridPort_SamplingInterval() {
		return (EReference)hybridPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinationProtocolOccurrence() {
		return coordinationProtocolOccurrenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationProtocolOccurrence_CoordinationProtocol() {
		return (EReference)coordinationProtocolOccurrenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationProtocolOccurrence_Ports() {
		return (EReference)coordinationProtocolOccurrenceEClass.getEStructuralFeatures().get(1);
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
		createEReference(portEClass, PORT__COMPONENT);
		createEReference(portEClass, PORT__PORT_CONNECTORS);

		continuousPortEClass = createEClass(CONTINUOUS_PORT);
		createEAttribute(continuousPortEClass, CONTINUOUS_PORT__IS_CONTINUOUS_IN_PORT);
		createEAttribute(continuousPortEClass, CONTINUOUS_PORT__IS_CONTINUOUS_OUT_PORT);

		discretePortEClass = createEClass(DISCRETE_PORT);
		createEReference(discretePortEClass, DISCRETE_PORT__REFINES);
		createEAttribute(discretePortEClass, DISCRETE_PORT__IS_DISCRETE_IN_PORT);
		createEAttribute(discretePortEClass, DISCRETE_PORT__IS_DISCRETE_OUT_PORT);
		createEAttribute(discretePortEClass, DISCRETE_PORT__IS_DISCRETE_IN_OUT_PORT);
		createEReference(discretePortEClass, DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER);
		createEAttribute(discretePortEClass, DISCRETE_PORT__MULTI_PORT);

		componentPartEClass = createEClass(COMPONENT_PART);
		createEReference(componentPartEClass, COMPONENT_PART__COMPONENT_TYPE);
		createEReference(componentPartEClass, COMPONENT_PART__PARENT_COMPONENT);
		createEReference(componentPartEClass, COMPONENT_PART__ASSEMBLY_CONNECTORS);
		createEReference(componentPartEClass, COMPONENT_PART__DELEGATION_CONNECTORS);
		createEReference(componentPartEClass, COMPONENT_PART__CARDINALITY);
		createEReference(componentPartEClass, COMPONENT_PART__PORTS_DERIVED);
		createEAttribute(componentPartEClass, COMPONENT_PART__MULTI_PART);

		staticStructuredComponentEClass = createEClass(STATIC_STRUCTURED_COMPONENT);

		atomicComponentEClass = createEClass(ATOMIC_COMPONENT);

		portConnectorEClass = createEClass(PORT_CONNECTOR);
		createEReference(portConnectorEClass, PORT_CONNECTOR__PARENT_COMPONENT);

		assemblyConnectorEClass = createEClass(ASSEMBLY_CONNECTOR);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__COMPONENT_PARTS);

		delegationConnectorEClass = createEClass(DELEGATION_CONNECTOR);
		createEReference(delegationConnectorEClass, DELEGATION_CONNECTOR__COMPONENT_PART);

		hybridPortEClass = createEClass(HYBRID_PORT);
		createEAttribute(hybridPortEClass, HYBRID_PORT__IS_HYBRID_IN_PORT);
		createEAttribute(hybridPortEClass, HYBRID_PORT__IS_HYBRID_OUT_PORT);
		createEReference(hybridPortEClass, HYBRID_PORT__SAMPLING_INTERVAL);

		coordinationProtocolOccurrenceEClass = createEClass(COORDINATION_PROTOCOL_OCCURRENCE);
		createEReference(coordinationProtocolOccurrenceEClass, COORDINATION_PROTOCOL_OCCURRENCE__COORDINATION_PROTOCOL);
		createEReference(coordinationProtocolOccurrenceEClass, COORDINATION_PROTOCOL_OCCURRENCE__PORTS);

		structuredComponentEClass = createEClass(STRUCTURED_COMPONENT);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__EMBEDDED_PARTS);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__CONNECTORS);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS);

		directedTypedPortEClass = createEClass(DIRECTED_TYPED_PORT);
		createEAttribute(directedTypedPortEClass, DIRECTED_TYPED_PORT__KIND);
		createEReference(directedTypedPortEClass, DIRECTED_TYPED_PORT__TYPE);

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
		org.storydriven.core.CorePackage theCorePackage_1 = (org.storydriven.core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(org.storydriven.core.CorePackage.eNS_URI);
		ConstraintPackage theConstraintPackage = (ConstraintPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI);
		ConnectorPackage theConnectorPackage = (ConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ProtocolPackage theProtocolPackage = (ProtocolPackage)EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentEClass.getESuperTypes().add(theCorePackage_1.getNamedElement());
		componentEClass.getESuperTypes().add(theCorePackage_1.getCommentableElement());
		componentEClass.getESuperTypes().add(theConstraintPackage.getConstrainableElement());
		portEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpoint());
		portEClass.getESuperTypes().add(theConstraintPackage.getConstrainableElement());
		portEClass.getESuperTypes().add(theTypesPackage.getDataType());
		continuousPortEClass.getESuperTypes().add(this.getDirectedTypedPort());
		discretePortEClass.getESuperTypes().add(this.getPort());
		discretePortEClass.getESuperTypes().add(theConnectorPackage.getDiscreteInteractionEndpoint());
		componentPartEClass.getESuperTypes().add(theCorePackage_1.getCommentableElement());
		componentPartEClass.getESuperTypes().add(theCorePackage_1.getNamedElement());
		componentPartEClass.getESuperTypes().add(theTypesPackage.getDataType());
		staticStructuredComponentEClass.getESuperTypes().add(this.getStructuredComponent());
		atomicComponentEClass.getESuperTypes().add(this.getComponent());
		atomicComponentEClass.getESuperTypes().add(theCorePackage.getBehavioralElement());
		portConnectorEClass.getESuperTypes().add(theConnectorPackage.getConnector());
		assemblyConnectorEClass.getESuperTypes().add(this.getPortConnector());
		delegationConnectorEClass.getESuperTypes().add(this.getPortConnector());
		hybridPortEClass.getESuperTypes().add(this.getDirectedTypedPort());
		coordinationProtocolOccurrenceEClass.getESuperTypes().add(theCorePackage_1.getCommentableElement());
		structuredComponentEClass.getESuperTypes().add(this.getComponent());
		directedTypedPortEClass.getESuperTypes().add(this.getPort());

		// Initialize classes and features; add operations and parameters
		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Ports(), this.getPort(), this.getPort_Component(), "ports", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ReferencingComponentParts(), this.getComponentPart(), this.getComponentPart_ComponentType(), "referencingComponentParts", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_ComponentType(), this.getComponentKind(), "componentType", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Component(), this.getComponent(), this.getComponent_Ports(), "component", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_PortConnectors(), this.getPortConnector(), null, "portConnectors", null, 0, -1, Port.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(continuousPortEClass, ContinuousPort.class, "ContinuousPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousPort_IsContinuousInPort(), ecorePackage.getEBoolean(), "isContinuousInPort", "false", 0, 1, ContinuousPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getContinuousPort_IsContinuousOutPort(), ecorePackage.getEBoolean(), "isContinuousOutPort", "false", 0, 1, ContinuousPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(discretePortEClass, DiscretePort.class, "DiscretePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscretePort_Refines(), theProtocolPackage.getRole(), theProtocolPackage.getRole_Port(), "refines", null, 0, 1, DiscretePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscretePort_IsDiscreteInPort(), ecorePackage.getEBoolean(), "isDiscreteInPort", "false", 0, 1, DiscretePort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscretePort_IsDiscreteOutPort(), ecorePackage.getEBoolean(), "isDiscreteOutPort", "false", 0, 1, DiscretePort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscretePort_IsDiscreteInOutPort(), ecorePackage.getEBoolean(), "isDiscreteInOutPort", "false", 0, 1, DiscretePort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDiscretePort_ReceiverMessageBuffer(), theProtocolPackage.getMessageBuffer(), null, "receiverMessageBuffer", null, 0, -1, DiscretePort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscretePort_MultiPort(), theEcorePackage.getEBoolean(), "multiPort", "", 0, 1, DiscretePort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentPartEClass, ComponentPart.class, "ComponentPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPart_ComponentType(), this.getComponent(), this.getComponent_ReferencingComponentParts(), "componentType", null, 1, 1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_ParentComponent(), this.getStructuredComponent(), this.getStructuredComponent_EmbeddedParts(), "parentComponent", null, 1, 1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_AssemblyConnectors(), this.getAssemblyConnector(), null, "assemblyConnectors", null, 0, -1, ComponentPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_DelegationConnectors(), this.getDelegationConnector(), null, "delegationConnectors", null, 0, -1, ComponentPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_Cardinality(), theCorePackage.getCardinality(), null, "cardinality", null, 1, 1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_PortsDerived(), this.getPort(), null, "portsDerived", null, 0, -1, ComponentPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentPart_MultiPart(), theEcorePackage.getEBoolean(), "multiPart", "", 0, 1, ComponentPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(staticStructuredComponentEClass, StaticStructuredComponent.class, "StaticStructuredComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atomicComponentEClass, AtomicComponent.class, "AtomicComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portConnectorEClass, PortConnector.class, "PortConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortConnector_ParentComponent(), this.getStructuredComponent(), this.getStructuredComponent_Connectors(), "parentComponent", null, 0, 1, PortConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyConnectorEClass, AssemblyConnector.class, "AssemblyConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyConnector_CoordinationProtocol(), theProtocolPackage.getCoordinationProtocol(), null, "coordinationProtocol", null, 0, 1, AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyConnector_ComponentParts(), this.getComponentPart(), null, "componentParts", null, 2, 2, AssemblyConnector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(delegationConnectorEClass, DelegationConnector.class, "DelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationConnector_ComponentPart(), this.getComponentPart(), null, "componentPart", null, 1, 1, DelegationConnector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(hybridPortEClass, HybridPort.class, "HybridPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHybridPort_IsHybridInPort(), ecorePackage.getEBoolean(), "isHybridInPort", "false", 0, 1, HybridPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getHybridPort_IsHybridOutPort(), ecorePackage.getEBoolean(), "isHybridOutPort", "false", 0, 1, HybridPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHybridPort_SamplingInterval(), theCorePackage.getTimeValue(), null, "samplingInterval", null, 1, 1, HybridPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinationProtocolOccurrenceEClass, CoordinationProtocolOccurrence.class, "CoordinationProtocolOccurrence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationProtocolOccurrence_CoordinationProtocol(), theProtocolPackage.getCoordinationProtocol(), null, "coordinationProtocol", null, 1, 1, CoordinationProtocolOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationProtocolOccurrence_Ports(), this.getPort(), null, "ports", null, 1, -1, CoordinationProtocolOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredComponentEClass, StructuredComponent.class, "StructuredComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredComponent_EmbeddedParts(), this.getComponentPart(), this.getComponentPart_ParentComponent(), "embeddedParts", null, 1, -1, StructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredComponent_Connectors(), this.getPortConnector(), this.getPortConnector_ParentComponent(), "connectors", null, 0, -1, StructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredComponent_AllStructuredComponents(), this.getStructuredComponent(), null, "allStructuredComponents", null, 0, -1, StructuredComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredComponent_AllAtomicComponents(), this.getAtomicComponent(), null, "allAtomicComponents", null, 0, -1, StructuredComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(directedTypedPortEClass, DirectedTypedPort.class, "DirectedTypedPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirectedTypedPort_Kind(), this.getContinuousPortDirectionKind(), "kind", null, 1, 1, DirectedTypedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDirectedTypedPort_Type(), theTypesPackage.getDataType(), null, "type", null, 1, 1, DirectedTypedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "constraints", "UniquePortNames"
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
			 "constraints", "AtLeastOneMessageInterface DiscretePortRequiresBehavior DiscretePortAtStructuredComponentHasNoBehavior DiscretePortRequiresRole DiscretePortAndRoleSameMessageInterface MultiPortMustRefineMultiRole"
		   });														
		addAnnotation
		  (componentPartEClass, 
		   source, 
		   new String[] {
			 "constraints", "CardinalityLowerBoundSet TypeNotEqualToParent CardinalityUpperBoundSet"
		   });																
		addAnnotation
		  (atomicComponentEClass, 
		   source, 
		   new String[] {
			 "constraints", "SoftwareComponentRequiresBehavior ValidComponentType SoftwareComponentValidPorts ContinuousComponentValidPorts AtomicComponentsNamesMustBeUnique"
		   });					
		addAnnotation
		  (assemblyConnectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoSelfAssembliesForSinglePortsOfSingleParts ValidContinuousPortDirections AssemblyBetweenDiscretePortsRequiresCoordinationPattern AssemblyBetweenDiscretePortsRequiresSameCoordinationPattern AssemblyBetweenDiscretePortsRequiresDifferentRoles AssemblyBetweenDiscretePortsSameMessageInterfaces ValidDiscreteInPortCombination ValidDiscreteOutPortCombination ValidDiscreteInOutPortCombination ValidContinuousInPortCombination ValidContinuousOutPortCombination ValidHybridInPortCombination ValidHybridOutPortCombination"
		   });					
		addAnnotation
		  (delegationConnectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidContinuousPortDirections DelegationBetweenContinuousPortsRequiresSameDataType DelegationBetweenDiscretePortsRequiresSameCoordinationPattern DelegationBetweenDiscretePortsRequiresSameRoles DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart ValidDiscreteInPortCombination ValidDiscreteOutPortCombination ValidDiscreteInOutPortCombination ValidContinuousInPortCombination ValidContinuousOutPortCombination ValidHybridInPortCombination ValidHybridOutPortCombination"
		   });																					
		addAnnotation
		  (structuredComponentEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueComponentPartsWithinStructuredComponent StructuredComponentNoHybridPort ValidComponentType NoCyclicComponentPartHierarchy DiscreteStructuredComponentValidParts HybridStructuredComponentValidParts DiscreteStructuredComponentValidPorts HybridStructuredComponentValidPorts ComponentPartsHaveUniqueName"
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
			 "UniquePortNames", "self.ports->isUnique(name)"
		   });							
		addAnnotation
		  (getPort_PortConnectors(), 
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
		  (getContinuousPort_IsContinuousInPort(), 
		   source, 
		   new String[] {
			 "derivation", "self.kind = component::ContinuousPortDirectionKind::IN"
		   });			
		addAnnotation
		  (getContinuousPort_IsContinuousOutPort(), 
		   source, 
		   new String[] {
			 "derivation", "self.kind = component::ContinuousPortDirectionKind::OUT"
		   });				
		addAnnotation
		  (discretePortEClass, 
		   source, 
		   new String[] {
			 "AtLeastOneMessageInterface", "self.oclIsTypeOf(component::DiscretePort) implies (not (self.senderMessageInterface.oclIsUndefined() and self.receiverMessageInterface.oclIsUndefined()))",
			 "DiscretePortRequiresBehavior", "-- this also holds for a hybrid port, ports of structured components do not require a behavior\r\n(not self.component.oclIsUndefined() and self.component.oclIsTypeOf(component::AtomicComponent))\r\n\timplies not self.behavior.oclIsUndefined()",
			 "DiscretePortAtStructuredComponentHasNoBehavior", "(not self.component.oclIsUndefined() and self.component.oclIsTypeOf(component::StructuredComponent))\n\timplies self.behavior.oclIsUndefined()",
			 "DiscretePortRequiresRole", "self.oclIsTypeOf(component::DiscretePort) implies not self.refines.oclIsUndefined()",
			 "DiscretePortAndRoleSameMessageInterface", "not self.refines.oclIsUndefined() implies\n\t(self.senderMessageInterface = self.refines.senderMessageInterface\n\t and\n\t self.receiverMessageInterface = self.refines.receiverMessageInterface\n\t)",
			 "MultiPortMustRefineMultiRole", "if not (self.refines.oclIsUndefined() and self.refines.cardinality.oclIsUndefined() and self.refines.cardinality.upperBound.oclIsUndefined()) then\r\n       self.isMultiPort implies self.refines.isMultiRole\r\nelse\r\n\ttrue\r\nendif"
		   });				
		addAnnotation
		  (getDiscretePort_IsDiscreteInPort(), 
		   source, 
		   new String[] {
			 "derivation", "self.receiverMessageTypes ->size() >= 1 and self.senderMessageTypes ->size() = 0"
		   });			
		addAnnotation
		  (getDiscretePort_IsDiscreteOutPort(), 
		   source, 
		   new String[] {
			 "derivation", "self.receiverMessageTypes ->size() = 0 and self.senderMessageTypes ->size() >= 1"
		   });			
		addAnnotation
		  (getDiscretePort_IsDiscreteInOutPort(), 
		   source, 
		   new String[] {
			 "derivation", "self.receiverMessageTypes ->size() >= 1 and self.senderMessageTypes ->size() >= 1"
		   });		
		addAnnotation
		  (getDiscretePort_ReceiverMessageBuffer(), 
		   source, 
		   new String[] {
			 "derivation", "self.refines.receiverMessageBuffer"
		   });				
		addAnnotation
		  (getDiscretePort_MultiPort(), 
		   source, 
		   new String[] {
			 "derivation", "if not (self.cardinality.oclIsUndefined()) then\r\n\t(self.cardinality.upperBound.value > 1) or self.cardinality.upperBound.infinity\r\nelse\r\n\tfalse\r\nendif\r\n\r\n"
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
		  (getComponentPart_MultiPart(), 
		   source, 
		   new String[] {
			 "derivation", "self.cardinality.upperBound.value > 1 or self.cardinality.upperBound.infinity"
		   });				
		addAnnotation
		  (atomicComponentEClass, 
		   source, 
		   new String[] {
			 "SoftwareComponentRequiresBehavior", "self.componentType = component::ComponentKind::SOFTWARE_COMPONENT implies (not self.behavior.oclIsUndefined())",
			 "ValidComponentType", "self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\nor self.componentType = component::ComponentKind::CONTINUOUS_COMPONENT",
			 "SoftwareComponentValidPorts", "self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\n\timplies (\n\t\tself.ports->forAll(p | p.oclIsTypeOf(component::DiscretePort) or p.oclIsTypeOf(component::HybridPort))\n\t)",
			 "ContinuousComponentValidPorts", "self.componentType = component::ComponentKind::CONTINUOUS_COMPONENT\n\timplies (\n\t\tself.ports->forAll(p | p.oclIsTypeOf(component::ContinuousPort))\n\t)",
			 "AtomicComponentsNamesMustBeUnique", "AtomicComponent.allInstances().name->count(self.name) = 1"
		   });							
		addAnnotation
		  (assemblyConnectorEClass, 
		   source, 
		   new String[] {
			 "NoSelfAssembliesForSinglePortsOfSingleParts", "(self.fromPort.cardinality.upperBound.value <= 1 and self.from.cardinality.upperBound.value <= 1)\r\nimplies\r\nself.fromPort <> self.toPort",
			 "ValidContinuousPortDirections", "not self.fromContinuousPort.oclIsUndefined() and not self.toContinuousPort.oclIsUndefined()\n\timplies\n\tself.fromContinuousPort.kind <> self.toContinuousPort.kind",
			 "AssemblyBetweenDiscretePortsRequiresCoordinationPattern", "if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\t-- assembly between two discrete ports requires a coordination pattern\n\tnot self.coordinationPattern.oclIsUndefined()\nelse\n\ttrue\nendif",
			 "AssemblyBetweenDiscretePortsRequiresSameCoordinationPattern", "if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n\t\tand\n\t\t-- both refinements must belong to the same pattern\n\t\tself.fromDiscretePort.refines.coordinationPattern = self.toDiscretePort.refines.coordinationPattern\nelse\n\ttrue\nendif",
			 "AssemblyBetweenDiscretePortsRequiresDifferentRoles", "if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n\t\tand\n\t\t-- both ports should have different roles (unless the pattern has only one role)\n\t\t(self.fromDiscretePort.refines.coordinationPattern.roles->size() = 2 implies (self.fromDiscretePort.refines.name <> self.toDiscretePort.refines.name))\nelse\n\ttrue\nendif",
			 "AssemblyBetweenDiscretePortsSameMessageInterfaces", "if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\t-- message interfaces must be compatible\n\tself.fromDiscretePort.senderMessageInterface = self.toDiscretePort.receiverMessageInterface\n\tand\n\tself.fromDiscretePort.receiverMessageInterface = self.toDiscretePort.senderMessageInterface\nelse\n\ttrue\nendif",
			 "ValidDiscreteInPortCombination", "not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteOutPort\n\t)",
			 "ValidDiscreteOutPortCombination", "not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteOutPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInPort\n\t)",
			 "ValidDiscreteInOutPortCombination", "not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInOutPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInOutPort\n\t)",
			 "ValidContinuousInPortCombination", "not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousInPort\n\timplies (\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort\n\t\tor\n\t\tnot self.toHybridPort.oclIsUndefined() and self.toHybridPort.isHybridOutPort\n\t)",
			 "ValidContinuousOutPortCombination", "not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousOutPort\n\timplies (\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort\n\t\tor\n\t\tnot self.toHybridPort.oclIsUndefined() and self.toHybridPort.isHybridInPort\n\t)",
			 "ValidHybridInPortCombination", "not self.fromHybridPort.oclIsUndefined() and self.fromHybridPort.isHybridInPort\n\timplies (\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort\n\t)",
			 "ValidHybridOutPortCombination", "not self.fromHybridPort.oclIsUndefined() and self.fromHybridPort.isHybridOutPort\n\timplies (\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort\n\t)"
		   });					
		addAnnotation
		  (delegationConnectorEClass, 
		   source, 
		   new String[] {
			 "ValidContinuousPortDirections", "not self.fromContinuousPort.oclIsUndefined() and not self.toContinuousPort.oclIsUndefined()\n\timplies\n\tself.fromContinuousPort.kind = self.toContinuousPort.kind",
			 "DelegationBetweenContinuousPortsRequiresSameDataType", "not self.fromContinuousPort.oclIsUndefined() and not self.toContinuousPort.oclIsUndefined()\n\timplies\n\tself.fromContinuousPort.type = self.toContinuousPort.type",
			 "DelegationBetweenDiscretePortsRequiresSameCoordinationPattern", "if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n\t\tand\n\t\t-- both refinements must belong to the same pattern\n\t\tself.fromDiscretePort.refines.coordinationPattern = self.toDiscretePort.refines.coordinationPattern\nelse\n\ttrue\nendif",
			 "DelegationBetweenDiscretePortsRequiresSameRoles", "if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n\t\tand\n\t\t-- both ports should have the same roles\n\t\tself.fromDiscretePort.refines.name = self.toDiscretePort.refines.name\nelse\n\ttrue\nendif",
			 "DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart", "not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined()\nand self.fromPort.isMultiPort\n\timplies (\n\t\t-- the target port is a multi port\n\t\tself.toPort.isMultiPort\n\t\tor\n\t\t-- the target part is a multi part\n\t\tself.componentPart.isMultiPart\n\t)",
			 "ValidDiscreteInPortCombination", "not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInPort\n\t)",
			 "ValidDiscreteOutPortCombination", "not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteOutPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteOutPort\n\t)",
			 "ValidDiscreteInOutPortCombination", "not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInOutPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInOutPort\n\t)",
			 "ValidContinuousInPortCombination", "not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousInPort\r\n\timplies (\r\n\t\t(not self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort)\r\n\t\tor\r\n\t\t(not self.toHybridPort.oclIsUndefined() and self.toHybridPort.isHybridInPort)\r\n\t)",
			 "ValidContinuousOutPortCombination", "-- not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousOutPort implies (not self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort) \r\n\r\nnot self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousOutPort\r\n\timplies (\r\n\t\t(not self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort)\r\n\t\tor\r\n\t\t(not self.toHybridPort.oclIsUndefined() and self.toHybridPort.isHybridOutPort)\r\n\t)",
			 "ValidHybridInPortCombination", "not self.fromHybridPort.oclIsUndefined() and self.fromHybridPort.isHybridInPort\r\n\timplies (\r\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort\r\n\t)",
			 "ValidHybridOutPortCombination", "not self.fromHybridPort.oclIsUndefined() \r\nand \r\nself.fromHybridPort.isHybridOutPort \r\nimplies (not self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort) "
		   });									
		addAnnotation
		  (getHybridPort_IsHybridInPort(), 
		   source, 
		   new String[] {
			 "derivation", "-- derive from superclass ContinuousPort\r\nself.isContinuousInPort"
		   });			
		addAnnotation
		  (getHybridPort_IsHybridOutPort(), 
		   source, 
		   new String[] {
			 "derivation", "-- derive from superclass ContinuousPort\r\nself.isContinuousOutPort"
		   });											
		addAnnotation
		  (structuredComponentEClass, 
		   source, 
		   new String[] {
			 "StructuredComponentNoHybridPort", "self.ports->forAll(port | not port.oclIsTypeOf(component::HybridPort))",
			 "ValidComponentType", "self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\nor self.componentType = component::ComponentKind::HYBRID_COMPONENT",
			 "NoCyclicComponentPartHierarchy", "not self.allStructuredComponents->includes(self)",
			 "DiscreteStructuredComponentValidParts", "self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\nimplies\n\t-- collect all atomic components from parent parts and union them\n\t-- with own atomic components\n\tself.allAtomicComponents->union(\n\t\tself.embeddedParts->select(\n\t\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\n\t\t)->collect(componentType.oclAsType(component::AtomicComponent))->asOrderedSet()\n\t)->forAll(componentType = component::ComponentKind::SOFTWARE_COMPONENT)",
			 "HybridStructuredComponentValidParts", "self.componentType = component::ComponentKind::HYBRID_COMPONENT\nimplies\n\t-- collect all atomic components from parent parts and union them\n\t-- with own atomic components\n\tself.allAtomicComponents->union(\n\t\tself.embeddedParts->select(\n\t\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\n\t\t)->collect(componentType.oclAsType(component::AtomicComponent))->asOrderedSet()\n\t)->exists(componentType = component::ComponentKind::CONTINUOUS_COMPONENT)",
			 "DiscreteStructuredComponentValidPorts", "self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\n\timplies (\n\t\tself.ports->forAll(p | p.oclIsTypeOf(component::DiscretePort))\n\t)",
			 "HybridStructuredComponentValidPorts", "self.componentType = component::ComponentKind::HYBRID_COMPONENT\n\timplies (\n\t\tself.ports->forAll(p | p.oclIsTypeOf(component::DiscretePort) or p.oclIsTypeOf(component::ContinuousPort))\n\t)",
			 "ComponentPartsHaveUniqueName", "self.embeddedParts -> isUnique(name)"
		   });				
		addAnnotation
		  (getStructuredComponent_AllStructuredComponents(), 
		   source, 
		   new String[] {
			 "derivation", "self->closure(\n\tembeddedParts->select(\n\t\tcomponentType.oclIsTypeOf(component::StructuredComponent)\n\t)->collect(componentType.oclAsType(component::StructuredComponent))\n)"
		   });			
		addAnnotation
		  (getStructuredComponent_AllAtomicComponents(), 
		   source, 
		   new String[] {
			 "derivation", "self.allStructuredComponents->collect(\n\tembeddedParts->select(\n\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\n\t)->collect(componentType.oclAsType(component::AtomicComponent))\n)->asOrderedSet()"
		   });			
	}

} //ComponentPackageImpl
