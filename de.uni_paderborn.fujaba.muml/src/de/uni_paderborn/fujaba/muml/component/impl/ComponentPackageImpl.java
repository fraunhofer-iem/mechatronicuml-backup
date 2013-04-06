/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage;
import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.behavior.impl.BehaviorPackageImpl;
import de.uni_paderborn.fujaba.muml.component.AssemblyConnector;
import de.uni_paderborn.fujaba.muml.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.component.Component;
import de.uni_paderborn.fujaba.muml.component.ComponentFactory;
import de.uni_paderborn.fujaba.muml.component.ComponentKind;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.component.ContinuousPort;
import de.uni_paderborn.fujaba.muml.component.ContinuousPortDirectionKind;
import de.uni_paderborn.fujaba.muml.component.CoordinationProtocolOccurrence;
import de.uni_paderborn.fujaba.muml.component.DelegationConnector;
import de.uni_paderborn.fujaba.muml.component.DirectedTypedPort;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.component.HybridPort;
import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.component.PortConnector;
import de.uni_paderborn.fujaba.muml.component.PortDirectionKind;
import de.uni_paderborn.fujaba.muml.component.PortPart;
import de.uni_paderborn.fujaba.muml.component.StaticStructuredComponent;
import de.uni_paderborn.fujaba.muml.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.component.util.ComponentValidator;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.constraint.impl.ConstraintPackageImpl;
import de.uni_paderborn.fujaba.muml.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.deployment.impl.DeploymentPackageImpl;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.instance.impl.InstancePackageImpl;
import de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage;
import de.uni_paderborn.fujaba.muml.msgtype.impl.MsgtypePackageImpl;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.protocol.impl.ProtocolPackageImpl;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl;
import de.uni_paderborn.fujaba.muml.types.TypesPackage;
import de.uni_paderborn.fujaba.muml.types.impl.TypesPackageImpl;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;
import de.uni_paderborn.fujaba.muml.valuetype.impl.ValuetypePackageImpl;

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
	private EClass portPartEClass = null;

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
	private EEnum portDirectionKindEEnum = null;

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
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#eNS_URI
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
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		ProtocolPackageImpl theProtocolPackage = (ProtocolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) instanceof ProtocolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) : ProtocolPackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		MsgtypePackageImpl theMsgtypePackage = (MsgtypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) instanceof MsgtypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) : MsgtypePackage.eINSTANCE);
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ConnectorPackageImpl theConnectorPackage = (ConnectorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) instanceof ConnectorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) : ConnectorPackage.eINSTANCE);
		ValuetypePackageImpl theValuetypePackage = (ValuetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) instanceof ValuetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) : ValuetypePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);

		// Create package meta-data objects
		theComponentPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theProtocolPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theMsgtypePackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theConnectorPackage.createPackageContents();
		theValuetypePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();

		// Initialize created meta-data
		theComponentPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theProtocolPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theMsgtypePackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theConnectorPackage.initializePackageContents();
		theValuetypePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();

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
	public EAttribute getComponent_ComponentType() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
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
	public EClass getDiscretePort() {
		return discretePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePort_RefinedRole() {
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
	public EReference getDiscretePort_CoordinationProtocol() {
		return (EReference)discretePortEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getComponentPart_MultiPart() {
		return (EAttribute)componentPartEClass.getEStructuralFeatures().get(4);
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
		return (EReference)componentPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPart_PortParts() {
		return (EReference)componentPartEClass.getEStructuralFeatures().get(3);
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
	public EReference getStructuredComponent_EmbeddedComponentParts() {
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
	public EReference getStructuredComponent_CoordinationProtocolOccurences() {
		return (EReference)structuredComponentEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getDirectedTypedPort_Optional() {
		return (EAttribute)directedTypedPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTypedPort_InPort() {
		return (EAttribute)directedTypedPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortPart() {
		return portPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortPart_PortType() {
		return (EReference)portPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortPart_ComponentPart() {
		return (EReference)portPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortPart_CoordinationProtocolOccurence() {
		return (EReference)portPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortPart_RefinedRole() {
		return (EReference)portPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTypedPort_OutPort() {
		return (EAttribute)directedTypedPortEClass.getEStructuralFeatures().get(2);
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
	public EReference getAssemblyConnector_CoordinationProtocolOccurence() {
		return (EReference)assemblyConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyConnector_PortParts() {
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
	public EReference getDelegationConnector_PortPart() {
		return (EReference)delegationConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationConnector_Port() {
		return (EReference)delegationConnectorEClass.getEStructuralFeatures().get(1);
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
	public EReference getHybridPort_SamplingInterval() {
		return (EReference)hybridPortEClass.getEStructuralFeatures().get(0);
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
	public EReference getCoordinationProtocolOccurrence_PortParts() {
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
	public EEnum getPortDirectionKind() {
		return portDirectionKindEEnum;
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
		createEAttribute(componentEClass, COMPONENT__COMPONENT_TYPE);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__COMPONENT);
		createEReference(portEClass, PORT__PORT_CONNECTORS);

		continuousPortEClass = createEClass(CONTINUOUS_PORT);

		discretePortEClass = createEClass(DISCRETE_PORT);
		createEReference(discretePortEClass, DISCRETE_PORT__REFINED_ROLE);
		createEAttribute(discretePortEClass, DISCRETE_PORT__IS_DISCRETE_IN_PORT);
		createEAttribute(discretePortEClass, DISCRETE_PORT__IS_DISCRETE_OUT_PORT);
		createEAttribute(discretePortEClass, DISCRETE_PORT__IS_DISCRETE_IN_OUT_PORT);
		createEReference(discretePortEClass, DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER);
		createEAttribute(discretePortEClass, DISCRETE_PORT__MULTI_PORT);
		createEReference(discretePortEClass, DISCRETE_PORT__COORDINATION_PROTOCOL);

		componentPartEClass = createEClass(COMPONENT_PART);
		createEReference(componentPartEClass, COMPONENT_PART__COMPONENT_TYPE);
		createEReference(componentPartEClass, COMPONENT_PART__PARENT_COMPONENT);
		createEReference(componentPartEClass, COMPONENT_PART__CARDINALITY);
		createEReference(componentPartEClass, COMPONENT_PART__PORT_PARTS);
		createEAttribute(componentPartEClass, COMPONENT_PART__MULTI_PART);

		staticStructuredComponentEClass = createEClass(STATIC_STRUCTURED_COMPONENT);

		atomicComponentEClass = createEClass(ATOMIC_COMPONENT);

		assemblyConnectorEClass = createEClass(ASSEMBLY_CONNECTOR);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL_OCCURENCE);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__PORT_PARTS);

		delegationConnectorEClass = createEClass(DELEGATION_CONNECTOR);
		createEReference(delegationConnectorEClass, DELEGATION_CONNECTOR__PORT_PART);
		createEReference(delegationConnectorEClass, DELEGATION_CONNECTOR__PORT);

		portConnectorEClass = createEClass(PORT_CONNECTOR);
		createEReference(portConnectorEClass, PORT_CONNECTOR__PARENT_COMPONENT);

		hybridPortEClass = createEClass(HYBRID_PORT);
		createEReference(hybridPortEClass, HYBRID_PORT__SAMPLING_INTERVAL);

		structuredComponentEClass = createEClass(STRUCTURED_COMPONENT);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__EMBEDDED_COMPONENT_PARTS);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__CONNECTORS);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__ALL_STRUCTURED_COMPONENTS);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__ALL_ATOMIC_COMPONENTS);
		createEReference(structuredComponentEClass, STRUCTURED_COMPONENT__COORDINATION_PROTOCOL_OCCURENCES);

		coordinationProtocolOccurrenceEClass = createEClass(COORDINATION_PROTOCOL_OCCURRENCE);
		createEReference(coordinationProtocolOccurrenceEClass, COORDINATION_PROTOCOL_OCCURRENCE__COORDINATION_PROTOCOL);
		createEReference(coordinationProtocolOccurrenceEClass, COORDINATION_PROTOCOL_OCCURRENCE__PORT_PARTS);

		directedTypedPortEClass = createEClass(DIRECTED_TYPED_PORT);
		createEAttribute(directedTypedPortEClass, DIRECTED_TYPED_PORT__KIND);
		createEAttribute(directedTypedPortEClass, DIRECTED_TYPED_PORT__OPTIONAL);
		createEAttribute(directedTypedPortEClass, DIRECTED_TYPED_PORT__OUT_PORT);
		createEAttribute(directedTypedPortEClass, DIRECTED_TYPED_PORT__IN_PORT);

		portPartEClass = createEClass(PORT_PART);
		createEReference(portPartEClass, PORT_PART__PORT_TYPE);
		createEReference(portPartEClass, PORT_PART__COMPONENT_PART);
		createEReference(portPartEClass, PORT_PART__COORDINATION_PROTOCOL_OCCURENCE);
		createEReference(portPartEClass, PORT_PART__REFINED_ROLE);

		// Create enums
		componentKindEEnum = createEEnum(COMPONENT_KIND);
		portDirectionKindEEnum = createEEnum(PORT_DIRECTION_KIND);
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
		ConstraintPackage theConstraintPackage = (ConstraintPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI);
		ConnectorPackage theConnectorPackage = (ConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ProtocolPackage theProtocolPackage = (ProtocolPackage)EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		componentEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		componentEClass.getESuperTypes().add(theConstraintPackage.getConstrainableElement());
		portEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpoint());
		portEClass.getESuperTypes().add(theConstraintPackage.getConstrainableElement());
		portEClass.getESuperTypes().add(theTypesPackage.getDataType());
		continuousPortEClass.getESuperTypes().add(this.getDirectedTypedPort());
		discretePortEClass.getESuperTypes().add(this.getPort());
		discretePortEClass.getESuperTypes().add(theConnectorPackage.getDiscreteInteractionEndpoint());
		componentPartEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		componentPartEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		componentPartEClass.getESuperTypes().add(theTypesPackage.getDataType());
		staticStructuredComponentEClass.getESuperTypes().add(this.getStructuredComponent());
		atomicComponentEClass.getESuperTypes().add(this.getComponent());
		atomicComponentEClass.getESuperTypes().add(theBehaviorPackage.getBehavioralElement());
		assemblyConnectorEClass.getESuperTypes().add(this.getPortConnector());
		delegationConnectorEClass.getESuperTypes().add(this.getPortConnector());
		portConnectorEClass.getESuperTypes().add(theConnectorPackage.getConnector());
		hybridPortEClass.getESuperTypes().add(this.getDirectedTypedPort());
		structuredComponentEClass.getESuperTypes().add(this.getComponent());
		coordinationProtocolOccurrenceEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		directedTypedPortEClass.getESuperTypes().add(this.getPort());
		directedTypedPortEClass.getESuperTypes().add(theBehaviorPackage.getTypedNamedElement());
		portPartEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpoint());
		portPartEClass.getESuperTypes().add(theTypesPackage.getDataType());

		// Initialize classes and features; add operations and parameters
		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Ports(), this.getPort(), this.getPort_Component(), "ports", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_ComponentType(), this.getComponentKind(), "componentType", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Component(), this.getComponent(), this.getComponent_Ports(), "component", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_PortConnectors(), this.getPortConnector(), null, "portConnectors", null, 0, -1, Port.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(continuousPortEClass, ContinuousPort.class, "ContinuousPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discretePortEClass, DiscretePort.class, "DiscretePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscretePort_RefinedRole(), theProtocolPackage.getRole(), theProtocolPackage.getRole_Port(), "refinedRole", null, 0, 1, DiscretePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscretePort_IsDiscreteInPort(), ecorePackage.getEBoolean(), "isDiscreteInPort", "false", 0, 1, DiscretePort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscretePort_IsDiscreteOutPort(), ecorePackage.getEBoolean(), "isDiscreteOutPort", "false", 0, 1, DiscretePort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscretePort_IsDiscreteInOutPort(), ecorePackage.getEBoolean(), "isDiscreteInOutPort", "false", 0, 1, DiscretePort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDiscretePort_ReceiverMessageBuffer(), theProtocolPackage.getMessageBuffer(), null, "receiverMessageBuffer", null, 0, -1, DiscretePort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscretePort_MultiPort(), theEcorePackage.getEBoolean(), "multiPort", "", 0, 1, DiscretePort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDiscretePort_CoordinationProtocol(), theProtocolPackage.getCoordinationProtocol(), null, "coordinationProtocol", null, 0, 1, DiscretePort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentPartEClass, ComponentPart.class, "ComponentPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPart_ComponentType(), this.getComponent(), null, "componentType", null, 1, 1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_ParentComponent(), this.getStructuredComponent(), this.getStructuredComponent_EmbeddedComponentParts(), "parentComponent", null, 1, 1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_Cardinality(), theValuetypePackage.getCardinality(), null, "cardinality", null, 1, 1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPart_PortParts(), this.getPortPart(), this.getPortPart_ComponentPart(), "portParts", null, 0, -1, ComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentPart_MultiPart(), theEcorePackage.getEBoolean(), "multiPart", "", 0, 1, ComponentPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(staticStructuredComponentEClass, StaticStructuredComponent.class, "StaticStructuredComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atomicComponentEClass, AtomicComponent.class, "AtomicComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(atomicComponentEClass, theEcorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assemblyConnectorEClass, AssemblyConnector.class, "AssemblyConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyConnector_CoordinationProtocolOccurence(), this.getCoordinationProtocolOccurrence(), null, "coordinationProtocolOccurence", null, 0, 1, AssemblyConnector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyConnector_PortParts(), this.getPortPart(), null, "portParts", null, 2, 2, AssemblyConnector.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(delegationConnectorEClass, DelegationConnector.class, "DelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationConnector_PortPart(), this.getPortPart(), null, "portPart", null, 1, 1, DelegationConnector.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDelegationConnector_Port(), this.getPort(), null, "port", null, 1, 1, DelegationConnector.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(portConnectorEClass, PortConnector.class, "PortConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortConnector_ParentComponent(), this.getStructuredComponent(), this.getStructuredComponent_Connectors(), "parentComponent", null, 1, 1, PortConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hybridPortEClass, HybridPort.class, "HybridPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHybridPort_SamplingInterval(), theValuetypePackage.getTimeValue(), null, "samplingInterval", null, 1, 1, HybridPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredComponentEClass, StructuredComponent.class, "StructuredComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredComponent_EmbeddedComponentParts(), this.getComponentPart(), this.getComponentPart_ParentComponent(), "embeddedComponentParts", null, 1, -1, StructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredComponent_Connectors(), this.getPortConnector(), this.getPortConnector_ParentComponent(), "connectors", null, 0, -1, StructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredComponent_AllStructuredComponents(), this.getStructuredComponent(), null, "allStructuredComponents", null, 0, -1, StructuredComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredComponent_AllAtomicComponents(), this.getAtomicComponent(), null, "allAtomicComponents", null, 0, -1, StructuredComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredComponent_CoordinationProtocolOccurences(), this.getCoordinationProtocolOccurrence(), null, "coordinationProtocolOccurences", null, 0, -1, StructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(structuredComponentEClass, theEcorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(coordinationProtocolOccurrenceEClass, CoordinationProtocolOccurrence.class, "CoordinationProtocolOccurrence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationProtocolOccurrence_CoordinationProtocol(), theProtocolPackage.getCoordinationProtocol(), null, "coordinationProtocol", null, 1, 1, CoordinationProtocolOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationProtocolOccurrence_PortParts(), this.getPortPart(), this.getPortPart_CoordinationProtocolOccurence(), "portParts", null, 2, -1, CoordinationProtocolOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directedTypedPortEClass, DirectedTypedPort.class, "DirectedTypedPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirectedTypedPort_Kind(), this.getPortDirectionKind(), "kind", null, 1, 1, DirectedTypedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectedTypedPort_Optional(), theEcorePackage.getEBoolean(), "optional", "false", 0, 1, DirectedTypedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectedTypedPort_OutPort(), ecorePackage.getEBoolean(), "outPort", "false", 0, 1, DirectedTypedPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectedTypedPort_InPort(), ecorePackage.getEBoolean(), "inPort", "false", 0, 1, DirectedTypedPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(portPartEClass, PortPart.class, "PortPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortPart_PortType(), this.getPort(), null, "portType", null, 0, 1, PortPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortPart_ComponentPart(), this.getComponentPart(), this.getComponentPart_PortParts(), "componentPart", null, 1, 1, PortPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortPart_CoordinationProtocolOccurence(), this.getCoordinationProtocolOccurrence(), this.getCoordinationProtocolOccurrence_PortParts(), "coordinationProtocolOccurence", null, 0, 1, PortPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortPart_RefinedRole(), theProtocolPackage.getRole(), null, "refinedRole", null, 0, 1, PortPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(componentKindEEnum, ComponentKind.class, "ComponentKind");
		addEEnumLiteral(componentKindEEnum, ComponentKind.SOFTWARE_COMPONENT);
		addEEnumLiteral(componentKindEEnum, ComponentKind.CONTINUOUS_COMPONENT);
		addEEnumLiteral(componentKindEEnum, ComponentKind.HYBRID_COMPONENT);

		initEEnum(portDirectionKindEEnum, PortDirectionKind.class, "PortDirectionKind");
		addEEnumLiteral(portDirectionKindEEnum, PortDirectionKind.IN);
		addEEnumLiteral(portDirectionKindEEnum, PortDirectionKind.OUT);

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
		  (discretePortEClass, 
		   source, 
		   new String[] {
			 "constraints", "DiscretePortRequiresMessageTypes DiscretePortAndRoleSameMessageTypes DiscretePortRequiresBehavior DiscretePortAtStructuredComponentHasNoBehavior DiscretePortRequiresRole MultiPortMustRefineMultiRole"
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
			 "constraints", ""
		   });							
		addAnnotation
		  (delegationConnectorEClass, 
		   source, 
		   new String[] {
			 "constraints", ""
		   });																	
		addAnnotation
		  (structuredComponentEClass, 
		   source, 
		   new String[] {
			 "constraints", "StructuredComponentAllowsNoHybridPorts ValidComponentType NoCyclicComponentPartHierarchy DiscreteStructuredComponentValidParts HybridStructuredComponentValidParts DiscreteStructuredComponentValidPorts HybridStructuredComponentValidPorts ComponentPartsHaveUniqueName"
		   });												
		addAnnotation
		  (coordinationProtocolOccurrenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "OnlyDiscretePortParts"
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
			 "derivation", "self.connectors->select(c | c.oclIsKindOf(PortConnector)).oclAsType(PortConnector)->asOrderedSet()"
		   });					
		addAnnotation
		  (discretePortEClass, 
		   source, 
		   new String[] {
			 "DiscretePortRequiresMessageTypes", "self.senderMessageTypes->notEmpty() or self.receiverMessageTypes->notEmpty()",
			 "DiscretePortRequiresBehavior", "-- this also holds for a hybrid port, ports of structured components do not require a behavior\r\n(not self.component.oclIsUndefined() and self.component.oclIsTypeOf(component::AtomicComponent))\r\n\timplies not self.behavior.oclIsUndefined()",
			 "DiscretePortAtStructuredComponentHasNoBehavior", "(not self.component.oclIsUndefined() and self.component.oclIsTypeOf(component::StructuredComponent))\n\timplies self.behavior.oclIsUndefined()",
			 "DiscretePortRequiresRole", "self.oclIsTypeOf(component::DiscretePort) implies not self.refinedRole.oclIsUndefined()",
			 "DiscretePortAndRoleSameMessageTypes", "not self.refinedRole.oclIsUndefined() implies\r\n\t(self.senderMessageTypes = self.refinedRole.senderMessageTypes\r\n\t and\r\n\t self.receiverMessageTypes = self.refinedRole.receiverMessageTypes\r\n\t)",
			 "MultiPortMustRefineMultiRole", "if not (self.refinedRole.oclIsUndefined() and self.refinedRole.cardinality.oclIsUndefined() and self.refinedRole.cardinality.upperBound.oclIsUndefined()) then\r\n       self.multiPort implies self.refinedRole.multiRole\r\nelse\r\n\ttrue\r\nendif"
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
			 "derivation", "if not self.refinedRole.oclIsUndefined() then\r\nself.refinedRole.receiverMessageBuffer\r\nelse\r\nnull\r\nendif"
		   });				
		addAnnotation
		  (getDiscretePort_MultiPort(), 
		   source, 
		   new String[] {
			 "derivation", "if not (self.cardinality.oclIsUndefined()) then\r\n\t(self.cardinality.upperBound.value > 1) or self.cardinality.upperBound.infinity\r\nelse\r\n\tfalse\r\nendif\r\n\r\n"
		   });			
		addAnnotation
		  (getDiscretePort_CoordinationProtocol(), 
		   source, 
		   new String[] {
			 "derivation", "if refinedRole.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\trefinedRole.coordinationProtocol\r\nendif"
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
			 "NoSelfAssembliesForSinglePortsOfSingleParts", "(self.ports[0].cardinality.upperBound.value <= 1 and self.ports[0].cardinality.upperBound.value <= 1)\r\nimplies\r\nself.ports[0] <> self.ports[1]",
			 "ValidContinuousPortDirections", "not self.fromContinuousPort.oclIsUndefined() and not self.toContinuousPort.oclIsUndefined()\n\timplies\n\tself.fromContinuousPort.kind <> self.toContinuousPort.kind",
			 "AssemblyBetweenDiscretePortsRequiresCoordinationProtocol", "-- assembly between two discrete ports requires a coordination protocol\r\nif not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\r\n\tnot self.coordinationProtocol.oclIsUndefined()\r\nelse\r\n\ttrue\r\nendif",
			 "AssemblyBetweenDiscretePortsRequiresSameCoordinationProtocol", "if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n\t\tand\n\t\t-- both refinements must belong to the same coordination protocol\n\t\tself.fromDiscretePort.refines.coordinationProtocol = self.toDiscretePort.refines.coordinationProtocol\nelse\n\ttrue\nendif",
			 "AssemblyBetweenDiscretePortsRequiresDifferentRoles", "if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n\t\tand\n\t\t-- both ports should have different roles (unless the coordination protocol has only one role)\n\t\t(self.fromDiscretePort.refines.coordinationProtocol.roles->size() = 2 implies (self.fromDiscretePort.refines.name <> self.toDiscretePort.refines.name))\nelse\n\ttrue\nendif",
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
		  (getAssemblyConnector_CoordinationProtocolOccurence(), 
		   source, 
		   new String[] {
			 "derivation", "self.ports->first().coordinationProtocolOccurence"
		   });		
		addAnnotation
		  (getAssemblyConnector_PortParts(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpoints->select(c | c.oclIsKindOf(PortPart)).oclAsType(PortPart)->asOrderedSet()"
		   });				
		addAnnotation
		  (delegationConnectorEClass, 
		   source, 
		   new String[] {
			 "ValidContinuousPortDirections", "not self.fromContinuousPort.oclIsUndefined() and not self.toContinuousPort.oclIsUndefined()\n\timplies\n\tself.fromContinuousPort.kind = self.toContinuousPort.kind",
			 "DelegationBetweenContinuousPortsRequiresSameDataType", "not self.fromContinuousPort.oclIsUndefined() and not self.toContinuousPort.oclIsUndefined()\n\timplies\n\tself.fromContinuousPort.type = self.toContinuousPort.type",
			 "DelegationBetweenDiscretePortsRequiresSameCoordinationProtocol", "if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n\t\tand\n\t\t-- both refinements must belong to the same coordination protocol\n\t\tself.fromDiscretePort.refines.coordinationProtocol = self.toDiscretePort.refines.coordinationProtocol\nelse\n\ttrue\nendif",
			 "DelegationBetweenDiscretePortsRequiresSameRoles", "if not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined() then\n\tnot self.fromDiscretePort.refines.oclIsUndefined() and not self.toDiscretePort.refines.oclIsUndefined()\n\t\tand\n\t\t-- both ports should have the same roles\n\t\tself.fromDiscretePort.refines.name = self.toDiscretePort.refines.name\nelse\n\ttrue\nendif",
			 "DiscreteMultiPortDelegationRequiresMultiPortOrSinglePortAndMultiPart", "not self.fromDiscretePort.oclIsUndefined() and not self.toDiscretePort.oclIsUndefined()\nand self.fromPort.isMultiPort\n\timplies (\n\t\t-- the target port is a multi port\n\t\tself.toPort.isMultiPort\n\t\tor\n\t\t-- the target part is a multi part\n\t\tself.componentPart.isMultiPart\n\t)",
			 "ValidDiscreteInPortCombination", "not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInPort\n\t)",
			 "ValidDiscreteOutPortCombination", "not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteOutPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteOutPort\n\t)",
			 "ValidDiscreteInOutPortCombination", "not self.fromDiscretePort.oclIsUndefined() and self.fromDiscretePort.isDiscreteInOutPort\n\timplies (\n\t\tnot self.toDiscretePort.oclIsUndefined() and self.toDiscretePort.isDiscreteInOutPort\n\t)",
			 "ValidContinuousInPortCombination", "not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousInPort\r\n\timplies (\r\n\t\t(not self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort)\r\n\t\tor\r\n\t\t(not self.toHybridPort.oclIsUndefined() and self.toHybridPort.isHybridInPort)\r\n\t)",
			 "ValidContinuousOutPortCombination", "-- not self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousOutPort implies (not self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort) \r\n\r\nnot self.fromContinuousPort.oclIsUndefined() and self.fromContinuousPort.isContinuousOutPort\r\n\timplies (\r\n\t\t(not self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort)\r\n\t\tor\r\n\t\t(not self.toHybridPort.oclIsUndefined() and self.toHybridPort.isHybridOutPort)\r\n\t)",
			 "ValidHybridInPortCombination", "not self.fromHybridPort.oclIsUndefined() and self.fromHybridPort.isHybridInPort\r\n\timplies (\r\n\t\tnot self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousInPort\r\n\t)",
			 "ValidHybridOutPortCombination", "not self.fromHybridPort.oclIsUndefined() \r\nand \r\nself.fromHybridPort.isHybridOutPort \r\nimplies (not self.toContinuousPort.oclIsUndefined() and self.toContinuousPort.isContinuousOutPort) ",
			 "ValidPortDirections", "-- direction of two connected directed typed ports must be identical\r\nself.ports ->forAll(p1, p2 | p1.oclIsKindOf(DirectedTypedPort) and p2.oclIsKindOf(DirectedTypedPort) )"
		   });		
		addAnnotation
		  (getDelegationConnector_PortPart(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpoints->select(c | c.oclIsKindOf(PortPart)).oclAsType(PortPart) -> any(true)"
		   });		
		addAnnotation
		  (getDelegationConnector_Port(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpoints->select(c | c.oclIsKindOf(Port)).oclAsType(Port) -> any(true)"
		   });															
		addAnnotation
		  (structuredComponentEClass, 
		   source, 
		   new String[] {
			 "StructuredComponentAllowsNoHybridPorts", "-- A structured component allows no hybrid ports.\r\nself.ports->forAll(port | not port.oclIsTypeOf(component::HybridPort))",
			 "ValidComponentType", "self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\nor self.componentType = component::ComponentKind::HYBRID_COMPONENT",
			 "NoCyclicComponentPartHierarchy", "not self.allStructuredComponents->includes(self)",
			 "DiscreteStructuredComponentValidParts", "self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\nimplies\n\t-- collect all atomic components from parent parts and union them\n\t-- with own atomic components\n\tself.allAtomicComponents->union(\n\t\tself.embeddedParts->select(\n\t\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\n\t\t)->collect(componentType.oclAsType(component::AtomicComponent))->asOrderedSet()\n\t)->forAll(componentType = component::ComponentKind::SOFTWARE_COMPONENT)",
			 "HybridStructuredComponentValidParts", "self.componentType = component::ComponentKind::HYBRID_COMPONENT\nimplies\n\t-- collect all atomic components from parent parts and union them\n\t-- with own atomic components\n\tself.allAtomicComponents->union(\n\t\tself.embeddedParts->select(\n\t\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\n\t\t)->collect(componentType.oclAsType(component::AtomicComponent))->asOrderedSet()\n\t)->exists(componentType = component::ComponentKind::CONTINUOUS_COMPONENT)",
			 "DiscreteStructuredComponentValidPorts", "-- A structured software component may only have discrete ports\r\nself.componentType = component::ComponentKind::SOFTWARE_COMPONENT\r\n\timplies (\r\n\t\tself.ports->forAll(p | p.oclIsTypeOf(component::DiscretePort))\r\n\t)",
			 "HybridStructuredComponentValidPorts", "self.componentType = component::ComponentKind::HYBRID_COMPONENT\n\timplies (\n\t\tself.ports->forAll(p | p.oclIsTypeOf(component::DiscretePort) or p.oclIsTypeOf(component::ContinuousPort))\n\t)",
			 "ComponentPartsHaveUniqueName", "self.embeddedParts -> isUnique(name)"
		   });					
		addAnnotation
		  (getStructuredComponent_AllStructuredComponents(), 
		   source, 
		   new String[] {
			 "derivation", "self->closure(\n\tembeddedParts->select(\n\t\tcomponentType.oclIsTypeOf(StructuredComponent)\n\t).componentType.oclAsType(StructuredComponent)\n)"
		   });			
		addAnnotation
		  (getStructuredComponent_AllAtomicComponents(), 
		   source, 
		   new String[] {
			 "derivation", "self.allStructuredComponents->collect(\n\tembeddedParts->select(\n\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\n\t)->collect(componentType.oclAsType(component::AtomicComponent))\n)->asOrderedSet()"
		   });						
		addAnnotation
		  (coordinationProtocolOccurrenceEClass, 
		   source, 
		   new String[] {
			 "OnlyDiscretePortParts", "not self.portParts.oclIsUndefined()\r\nimplies\r\nself.portParts->forAll(isTypeOf(DiscretePort))"
		   });							
		addAnnotation
		  (getDirectedTypedPort_OutPort(), 
		   source, 
		   new String[] {
			 "derivation", "self.kind = component::PortDirectionKind::OUT"
		   });			
		addAnnotation
		  (getDirectedTypedPort_InPort(), 
		   source, 
		   new String[] {
			 "derivation", "self.kind = component::PortDirectionKind::IN"
		   });			
		addAnnotation
		  (getPortPart_RefinedRole(), 
		   source, 
		   new String[] {
			 "derivation", "self.portType.refinedRole"
		   });
	}

} //ComponentPackageImpl
