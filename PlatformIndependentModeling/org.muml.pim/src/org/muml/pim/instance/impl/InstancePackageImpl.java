/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.core.modelinstance.ModelinstancePackage;
import org.muml.pim.PimPackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.impl.BehaviorPackageImpl;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.impl.ComponentPackageImpl;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.impl.ConnectorPackageImpl;
import org.muml.pim.constraint.ConstraintPackage;
import org.muml.pim.constraint.impl.ConstraintPackageImpl;
import org.muml.pim.impl.PimPackageImpl;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.pim.instance.AtomicComponentInstance;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.ContinuousPortInstance;
import org.muml.pim.instance.CoordinationProtocolInstance;
import org.muml.pim.instance.DelegationConnectorInstance;
import org.muml.pim.instance.DiscreteMultiPortInstance;
import org.muml.pim.instance.DiscretePortInstance;
import org.muml.pim.instance.DiscreteSinglePortInstance;
import org.muml.pim.instance.HybridPortInstance;
import org.muml.pim.instance.InstanceFactory;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.instance.PortConnectorInstance;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.instance.StructuredComponentInstance;
import org.muml.pim.instance.util.InstanceValidator;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.msgtype.impl.MsgtypePackageImpl;
import org.muml.pim.pattern.PatternPackage;
import org.muml.pim.pattern.impl.PatternPackageImpl;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.protocol.impl.ProtocolPackageImpl;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl;
import org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage;
import org.muml.pim.realtimestatechart.one_to_n_schemata.impl.One_to_n_schemataPackageImpl;
import org.muml.pim.runnable.RunnablePackage;
import org.muml.pim.runnable.impl.RunnablePackageImpl;
import org.muml.pim.types.TypesPackage;
import org.muml.pim.types.impl.TypesPackageImpl;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.pim.valuetype.impl.ValuetypePackageImpl;

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
	private EClass portConnectorInstanceEClass = null;

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
	private EClass assemblyConnectorInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationConnectorInstanceEClass = null;

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
	private EClass coordinationProtocolInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredComponentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicComponentInstanceEClass = null;

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
	 * @see org.muml.pim.instance.InstancePackage#eNS_URI
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
		CorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PimPackageImpl thePimPackage = (PimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PimPackage.eNS_URI) instanceof PimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PimPackage.eNS_URI) : PimPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		ProtocolPackageImpl theProtocolPackage = (ProtocolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) instanceof ProtocolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) : ProtocolPackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		One_to_n_schemataPackageImpl theOne_to_n_schemataPackage = (One_to_n_schemataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(One_to_n_schemataPackage.eNS_URI) instanceof One_to_n_schemataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(One_to_n_schemataPackage.eNS_URI) : One_to_n_schemataPackage.eINSTANCE);
		MsgtypePackageImpl theMsgtypePackage = (MsgtypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) instanceof MsgtypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) : MsgtypePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ConnectorPackageImpl theConnectorPackage = (ConnectorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) instanceof ConnectorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) : ConnectorPackage.eINSTANCE);
		ValuetypePackageImpl theValuetypePackage = (ValuetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) instanceof ValuetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) : ValuetypePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
		RunnablePackageImpl theRunnablePackage = (RunnablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RunnablePackage.eNS_URI) instanceof RunnablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RunnablePackage.eNS_URI) : RunnablePackage.eINSTANCE);

		// Create package meta-data objects
		theInstancePackage.createPackageContents();
		thePimPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theProtocolPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theOne_to_n_schemataPackage.createPackageContents();
		theMsgtypePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theConnectorPackage.createPackageContents();
		theValuetypePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		thePatternPackage.createPackageContents();
		theRunnablePackage.createPackageContents();

		// Initialize created meta-data
		theInstancePackage.initializePackageContents();
		thePimPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theProtocolPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theOne_to_n_schemataPackage.initializePackageContents();
		theMsgtypePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theConnectorPackage.initializePackageContents();
		theValuetypePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		thePatternPackage.initializePackageContents();
		theRunnablePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theInstancePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return InstanceValidator.INSTANCE;
				 }
			 });

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
	public EReference getComponentInstance_PortInstances() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_ComponentPart() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_ParentCIC() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInstance_TopLevel() {
		return (EAttribute)componentInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Runnables() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Labels() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortConnectorInstance() {
		return portConnectorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortConnectorInstance_PortConnectorType() {
		return (EReference)portConnectorInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortConnectorInstance_PortInstances() {
		return (EReference)portConnectorInstanceEClass.getEStructuralFeatures().get(1);
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
	public EReference getPortInstance_PortConnectorInstances() {
		return (EReference)portInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstance_PortPart() {
		return (EReference)portInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstance_Runnable() {
		return (EReference)portInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyConnectorInstance() {
		return assemblyConnectorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyConnectorInstance_AssemblyConnectorType() {
		return (EReference)assemblyConnectorInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegationConnectorInstance() {
		return delegationConnectorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationConnectorInstance_DelegationConnectorType() {
		return (EReference)delegationConnectorInstanceEClass.getEStructuralFeatures().get(0);
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
	public EReference getComponentInstanceConfiguration_PortConnectorInstances() {
		return (EReference)componentInstanceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstanceConfiguration_ParentPortInstances() {
		return (EReference)componentInstanceConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstanceConfiguration_ParentStructuredComponentInstance() {
		return (EReference)componentInstanceConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstanceConfiguration_CoordinationProtocolInstances() {
		return (EReference)componentInstanceConfigurationEClass.getEStructuralFeatures().get(4);
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
	public EReference getDiscretePortInstance_ReceiverMessageTypes() {
		return (EReference)discretePortInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePortInstance_SenderMessageTypes() {
		return (EReference)discretePortInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePortInstance_ReceiverMessageBuffer() {
		return (EReference)discretePortInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscretePortInstance_RefinedRole() {
		return (EReference)discretePortInstanceEClass.getEStructuralFeatures().get(3);
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
	public EClass getDiscreteMultiPortInstance() {
		return discreteMultiPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteMultiPortInstance_GmfSubPortInstances() {
		return (EReference)discreteMultiPortInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinationProtocolInstance() {
		return coordinationProtocolInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationProtocolInstance_PortInstances() {
		return (EReference)coordinationProtocolInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationProtocolInstance_CoordinationProtocolPart() {
		return (EReference)coordinationProtocolInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationProtocolInstance_CoordinationProtocol() {
		return (EReference)coordinationProtocolInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredComponentInstance() {
		return structuredComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredComponentInstance_EmbeddedCIC() {
		return (EReference)structuredComponentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicComponentInstance() {
		return atomicComponentInstanceEClass;
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
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__PORT_INSTANCES);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__COMPONENT_PART);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__PARENT_CIC);
		createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__TOP_LEVEL);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__RUNNABLES);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__LABELS);

		portConnectorInstanceEClass = createEClass(PORT_CONNECTOR_INSTANCE);
		createEReference(portConnectorInstanceEClass, PORT_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE);
		createEReference(portConnectorInstanceEClass, PORT_CONNECTOR_INSTANCE__PORT_INSTANCES);

		portInstanceEClass = createEClass(PORT_INSTANCE);
		createEReference(portInstanceEClass, PORT_INSTANCE__PORT_TYPE);
		createEReference(portInstanceEClass, PORT_INSTANCE__COMPONENT_INSTANCE);
		createEReference(portInstanceEClass, PORT_INSTANCE__PORT_CONNECTOR_INSTANCES);
		createEReference(portInstanceEClass, PORT_INSTANCE__PORT_PART);
		createEReference(portInstanceEClass, PORT_INSTANCE__RUNNABLE);

		assemblyConnectorInstanceEClass = createEClass(ASSEMBLY_CONNECTOR_INSTANCE);
		createEReference(assemblyConnectorInstanceEClass, ASSEMBLY_CONNECTOR_INSTANCE__ASSEMBLY_CONNECTOR_TYPE);

		delegationConnectorInstanceEClass = createEClass(DELEGATION_CONNECTOR_INSTANCE);
		createEReference(delegationConnectorInstanceEClass, DELEGATION_CONNECTOR_INSTANCE__DELEGATION_CONNECTOR_TYPE);

		componentInstanceConfigurationEClass = createEClass(COMPONENT_INSTANCE_CONFIGURATION);
		createEReference(componentInstanceConfigurationEClass, COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES);
		createEReference(componentInstanceConfigurationEClass, COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES);
		createEReference(componentInstanceConfigurationEClass, COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES);
		createEReference(componentInstanceConfigurationEClass, COMPONENT_INSTANCE_CONFIGURATION__PARENT_STRUCTURED_COMPONENT_INSTANCE);
		createEReference(componentInstanceConfigurationEClass, COMPONENT_INSTANCE_CONFIGURATION__COORDINATION_PROTOCOL_INSTANCES);

		continuousPortInstanceEClass = createEClass(CONTINUOUS_PORT_INSTANCE);

		hybridPortInstanceEClass = createEClass(HYBRID_PORT_INSTANCE);

		discretePortInstanceEClass = createEClass(DISCRETE_PORT_INSTANCE);
		createEReference(discretePortInstanceEClass, DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_TYPES);
		createEReference(discretePortInstanceEClass, DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_TYPES);
		createEReference(discretePortInstanceEClass, DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_BUFFER);
		createEReference(discretePortInstanceEClass, DISCRETE_PORT_INSTANCE__REFINED_ROLE);

		discreteSinglePortInstanceEClass = createEClass(DISCRETE_SINGLE_PORT_INSTANCE);

		discreteMultiPortInstanceEClass = createEClass(DISCRETE_MULTI_PORT_INSTANCE);
		createEReference(discreteMultiPortInstanceEClass, DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES);

		coordinationProtocolInstanceEClass = createEClass(COORDINATION_PROTOCOL_INSTANCE);
		createEReference(coordinationProtocolInstanceEClass, COORDINATION_PROTOCOL_INSTANCE__PORT_INSTANCES);
		createEReference(coordinationProtocolInstanceEClass, COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_PART);
		createEReference(coordinationProtocolInstanceEClass, COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL);

		structuredComponentInstanceEClass = createEClass(STRUCTURED_COMPONENT_INSTANCE);
		createEReference(structuredComponentInstanceEClass, STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC);

		atomicComponentInstanceEClass = createEClass(ATOMIC_COMPONENT_INSTANCE);
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
		ComponentPackage theComponentPackage = (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);
		RunnablePackage theRunnablePackage = (RunnablePackage)EPackage.Registry.INSTANCE.getEPackage(RunnablePackage.eNS_URI);
		ConnectorPackage theConnectorPackage = (ConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);
		ConstraintPackage theConstraintPackage = (ConstraintPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI);
		MsgtypePackage theMsgtypePackage = (MsgtypePackage)EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI);
		ProtocolPackage theProtocolPackage = (ProtocolPackage)EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentInstanceEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		portConnectorInstanceEClass.getESuperTypes().add(theConnectorPackage.getConnectorInstance());
		portInstanceEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpointInstance());
		assemblyConnectorInstanceEClass.getESuperTypes().add(this.getPortConnectorInstance());
		delegationConnectorInstanceEClass.getESuperTypes().add(this.getPortConnectorInstance());
		componentInstanceConfigurationEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		componentInstanceConfigurationEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		componentInstanceConfigurationEClass.getESuperTypes().add(theConstraintPackage.getVerifiableElement());
		continuousPortInstanceEClass.getESuperTypes().add(this.getPortInstance());
		hybridPortInstanceEClass.getESuperTypes().add(this.getPortInstance());
		discretePortInstanceEClass.getESuperTypes().add(this.getPortInstance());
		discretePortInstanceEClass.getESuperTypes().add(theConnectorPackage.getDiscreteInteractionEndpointInstance());
		discreteSinglePortInstanceEClass.getESuperTypes().add(this.getDiscretePortInstance());
		discreteSinglePortInstanceEClass.getESuperTypes().add(theConnectorPackage.getDiscreteSingleInteractionEndpointInstance());
		discreteMultiPortInstanceEClass.getESuperTypes().add(this.getDiscretePortInstance());
		discreteMultiPortInstanceEClass.getESuperTypes().add(theConnectorPackage.getDiscreteMultiInteractionEndpointInstance());
		coordinationProtocolInstanceEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		structuredComponentInstanceEClass.getESuperTypes().add(this.getComponentInstance());
		atomicComponentInstanceEClass.getESuperTypes().add(this.getComponentInstance());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentInstanceEClass, ComponentInstance.class, "ComponentInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstance_ComponentType(), theComponentPackage.getComponent(), null, "componentType", null, 1, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_PortInstances(), this.getPortInstance(), this.getPortInstance_ComponentInstance(), "portInstances", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_ComponentPart(), theComponentPackage.getComponentPart(), null, "componentPart", null, 0, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_ParentCIC(), this.getComponentInstanceConfiguration(), this.getComponentInstanceConfiguration_ComponentInstances(), "parentCIC", null, 1, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInstance_TopLevel(), ecorePackage.getEBoolean(), "topLevel", "true", 0, 1, ComponentInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Runnables(), theRunnablePackage.getRunnable(), theRunnablePackage.getRunnable_ComponentInstance(), "runnables", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Labels(), theRunnablePackage.getLabel(), theRunnablePackage.getLabel_ComponentInstance(), "labels", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portConnectorInstanceEClass, PortConnectorInstance.class, "PortConnectorInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortConnectorInstance_PortConnectorType(), theComponentPackage.getPortConnector(), null, "portConnectorType", null, 0, 1, PortConnectorInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPortConnectorInstance_PortInstances(), this.getPortInstance(), null, "portInstances", null, 2, 2, PortConnectorInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(portInstanceEClass, PortInstance.class, "PortInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortInstance_PortType(), theComponentPackage.getPort(), null, "portType", null, 1, 1, PortInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstance_ComponentInstance(), this.getComponentInstance(), this.getComponentInstance_PortInstances(), "componentInstance", null, 0, 1, PortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstance_PortConnectorInstances(), this.getPortConnectorInstance(), null, "portConnectorInstances", null, 0, -1, PortInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstance_PortPart(), theComponentPackage.getPortPart(), null, "portPart", null, 0, 1, PortInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstance_Runnable(), theRunnablePackage.getRunnable(), theRunnablePackage.getRunnable_PortInstance(), "runnable", null, 0, -1, PortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyConnectorInstanceEClass, AssemblyConnectorInstance.class, "AssemblyConnectorInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyConnectorInstance_AssemblyConnectorType(), theComponentPackage.getAssemblyConnector(), null, "assemblyConnectorType", null, 0, 1, AssemblyConnectorInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(delegationConnectorInstanceEClass, DelegationConnectorInstance.class, "DelegationConnectorInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationConnectorInstance_DelegationConnectorType(), theComponentPackage.getDelegationConnector(), null, "delegationConnectorType", null, 1, 1, DelegationConnectorInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentInstanceConfigurationEClass, ComponentInstanceConfiguration.class, "ComponentInstanceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstanceConfiguration_ComponentInstances(), this.getComponentInstance(), this.getComponentInstance_ParentCIC(), "componentInstances", null, 0, -1, ComponentInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstanceConfiguration_PortConnectorInstances(), this.getPortConnectorInstance(), null, "portConnectorInstances", null, 0, -1, ComponentInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstanceConfiguration_ParentPortInstances(), this.getPortInstance(), null, "parentPortInstances", null, 0, -1, ComponentInstanceConfiguration.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstanceConfiguration_ParentStructuredComponentInstance(), this.getStructuredComponentInstance(), this.getStructuredComponentInstance_EmbeddedCIC(), "parentStructuredComponentInstance", null, 0, 1, ComponentInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstanceConfiguration_CoordinationProtocolInstances(), this.getCoordinationProtocolInstance(), null, "coordinationProtocolInstances", null, 0, -1, ComponentInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(continuousPortInstanceEClass, ContinuousPortInstance.class, "ContinuousPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hybridPortInstanceEClass, HybridPortInstance.class, "HybridPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discretePortInstanceEClass, DiscretePortInstance.class, "DiscretePortInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscretePortInstance_ReceiverMessageTypes(), theMsgtypePackage.getMessageType(), null, "receiverMessageTypes", null, 0, -1, DiscretePortInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDiscretePortInstance_SenderMessageTypes(), theMsgtypePackage.getMessageType(), null, "senderMessageTypes", null, 0, -1, DiscretePortInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDiscretePortInstance_ReceiverMessageBuffer(), theConnectorPackage.getMessageBuffer(), null, "receiverMessageBuffer", null, 0, -1, DiscretePortInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDiscretePortInstance_RefinedRole(), theProtocolPackage.getRole(), null, "refinedRole", null, 0, 1, DiscretePortInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(discreteSinglePortInstanceEClass, DiscreteSinglePortInstance.class, "DiscreteSinglePortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discreteMultiPortInstanceEClass, DiscreteMultiPortInstance.class, "DiscreteMultiPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscreteMultiPortInstance_GmfSubPortInstances(), theConnectorPackage.getDiscreteSingleInteractionEndpointInstance(), null, "gmfSubPortInstances", null, 0, -1, DiscreteMultiPortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(coordinationProtocolInstanceEClass, CoordinationProtocolInstance.class, "CoordinationProtocolInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationProtocolInstance_PortInstances(), this.getPortInstance(), null, "portInstances", null, 1, -1, CoordinationProtocolInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationProtocolInstance_CoordinationProtocolPart(), theComponentPackage.getCoordinationProtocolPart(), null, "coordinationProtocolPart", null, 0, 1, CoordinationProtocolInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationProtocolInstance_CoordinationProtocol(), theProtocolPackage.getCoordinationProtocol(), null, "coordinationProtocol", null, 1, 1, CoordinationProtocolInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredComponentInstanceEClass, StructuredComponentInstance.class, "StructuredComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredComponentInstance_EmbeddedCIC(), this.getComponentInstanceConfiguration(), this.getComponentInstanceConfiguration_ParentStructuredComponentInstance(), "embeddedCIC", null, 1, 1, StructuredComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicComponentInstanceEClass, AtomicComponentInstance.class, "AtomicComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http://www.muml.org/emf/OCLFilter
		createOCLFilterAnnotations();
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
		  (componentInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "AllPortsAreInitialized"
		   });	
		addAnnotation
		  (portConnectorInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidPortConnectorInstance"
		   });	
		addAnnotation
		  (portInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "PortInstanceMustReferencePortType PortInstanceMustDelegateToEmbeddedCIC"
		   });	
		addAnnotation
		  (assemblyConnectorInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "AssemblyConnectorInstanceNeedsTypeIfNotTopLevel"
		   });	
		addAnnotation
		  (delegationConnectorInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "DelegateToEmbeddedCIC"
		   });	
		addAnnotation
		  (componentInstanceConfigurationEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueComponentInstanceNames"
		   });	
		addAnnotation
		  (continuousPortInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "PortTypeIsKindOfContinuousPort"
		   });	
		addAnnotation
		  (hybridPortInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "PortTypeIsKindOfHybridPort"
		   });	
		addAnnotation
		  (discretePortInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "PortTypeIsKindOfDiscretePort"
		   });	
		addAnnotation
		  (discreteSinglePortInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "PortInstanceNotMultipleAssemblyConnectorInstances PortInstanceNotMultipleDelegationConnectorInstances PortInstanceNeedsDelegationToParentOrAssembly"
		   });	
		addAnnotation
		  (structuredComponentInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "NumberOfembeddedComponentInstancesCorrespondsToLowerBound NumberOfembeddedComponentInstancesCorrespondsToUpperBound"
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
		  (componentInstanceEClass, 
		   source, 
		   new String[] {
			 "AllPortsAreInitialized", "-- All Ports with a lowerBound>0 must be initialized\nlet discretePorts : Set(component::Port) = if (self.componentType.oclIsUndefined()) then OrderedSet {} else self.componentType.ports->select(port|port.oclIsKindOf(connector::DiscreteInteractionEndpoint)).oclAsType(component::Port)->asOrderedSet() endif in\nlet nonDiscretePorts : Set(component::Port) = if (self.componentType.oclIsUndefined()) then OrderedSet {} else self.componentType.ports->select(port| port.oclIsKindOf(component::DirectedTypedPort)) endif in\nlet portsWhichShallBeInitialized : Set(component::Port) = nonDiscretePorts -> select(port | not(port.oclAsType(component::DirectedTypedPort).optional))->union(discretePorts->select(discretePort| discretePort.oclAsType(connector::DiscreteInteractionEndpoint).cardinality.lowerBound.value > 0 or discretePort.oclAsType(connector::DiscreteInteractionEndpoint).cardinality.lowerBound.infinity)) in\nportsWhichShallBeInitialized -> forAll(port | self.portInstances -> exists(portInstance | portInstance.type = port))\n-- adann,chris227"
		   });	
		addAnnotation
		  (getComponentInstance_TopLevel(), 
		   source, 
		   new String[] {
			 "derivation", "self.parentCIC.parentStructuredComponentInstance.oclIsUndefined()"
		   });	
		addAnnotation
		  (portConnectorInstanceEClass, 
		   source, 
		   new String[] {
			 "ValidPortConnectorInstance", "-- The connected PortInstances do not correspond to the selected PortConnectorType\nlet directPortTypes : Set(component::Port) = if(not self.type.oclIsUndefined()) then self.type.connectorEndpoints->select(endPoint|endPoint.oclIsKindOf(component::Port)).oclAsType(component::Port)->asOrderedSet() else OrderedSet{} endif in\nlet portTypesFromPortParts : Set(component::Port) = if(not self.type.oclIsUndefined()) then self.type.connectorEndpoints->select(endPoint | endPoint.oclIsKindOf(component::PortPart)).oclAsType(component::PortPart)->collect(portType)->asOrderedSet() else OrderedSet{} endif  in\nlet allPortTypes : Set(component::Port) = directPortTypes->union(portTypesFromPortParts)->asOrderedSet() in\nif (self.type.oclIsUndefined() or self.connectorEndpointInstances->isEmpty()) then \n\ttrue\nelse\n\tallPortTypes->symmetricDifference(self.connectorEndpointInstances.type.oclAsType(component::Port)->asSet())->isEmpty()\nendif\n-- adann\r\n"
		   });	
		addAnnotation
		  (getPortConnectorInstance_PortConnectorType(), 
		   source, 
		   new String[] {
			 "derivation", "self.type.oclAsType(component::PortConnector)"
		   });	
		addAnnotation
		  (getPortConnectorInstance_PortInstances(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpointInstances->select(c | c.oclIsKindOf(PortInstance)).oclAsType(PortInstance)->asOrderedSet()"
		   });	
		addAnnotation
		  (portInstanceEClass, 
		   source, 
		   new String[] {
			 "PortInstanceMustReferencePortType", "-- The type of a port instance must be a port type\r\nif (not self.type->oclIsUndefined()) then\r\nself.type.oclIsKindOf(component::Port)\r\nelse\r\nfalse\r\nendif",
			 "PortInstanceMustDelegateToEmbeddedCIC", "-- PortInstance at Structured Component must delegate to embedded CIC\r\n(componentInstance.oclIsKindOf(StructuredComponentInstance) and not self.oclIsKindOf(connector::DiscreteMultiInteractionEndpointInstance) and ( self.oclIsKindOf(HybridPortInstance) or self.oclIsKindOf(DiscretePortInstance) or self.oclIsKindOf(ContinuousPortInstance))) \r\nimplies not portConnectorInstances->select(ci | ci.oclIsKindOf(DelegationConnectorInstance) and \r\n\tcomponentInstance.oclAsType(StructuredComponentInstance).embeddedCIC.componentInstances->includes(ci.oclAsType(DelegationConnectorInstance).portInstances->any(pi | pi <> self).componentInstance)\r\n)->isEmpty()\r\n-- sthiele2: Check only HybridPortInstance, DiscretePortInstance, ContinousPortInstance "
		   });	
		addAnnotation
		  (getPortInstance_PortType(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.type.oclIsKindOf(component::Port))\r\nthen\r\nself.type.oclAsType(component::Port)\r\nelse\r\nnull\r\nendif"
		   });	
		addAnnotation
		  (getPortInstance_PortConnectorInstances(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorInstances->select(i | i.oclIsKindOf(PortConnectorInstance)).oclAsType(PortConnectorInstance)->asOrderedSet()"
		   });	
		addAnnotation
		  (getPortInstance_PortPart(), 
		   source, 
		   new String[] {
			 "derivation", "componentInstance.componentPart.portParts->any(portPart | portPart.portType = self.type)"
		   });	
		addAnnotation
		  (assemblyConnectorInstanceEClass, 
		   source, 
		   new String[] {
			 "AssemblyConnectorInstanceNeedsTypeIfNotTopLevel", "-- Assembly Connector Instance needs type, if not top-level\r\nportInstances.componentInstance->exists(not parentCIC.parentStructuredComponentInstance.oclIsUndefined()) implies not assemblyConnectorType.oclIsUndefined()\r\n"
		   });	
		addAnnotation
		  (getAssemblyConnectorInstance_AssemblyConnectorType(), 
		   source, 
		   new String[] {
			 "derivation", "if  type.oclIsKindOf(component::AssemblyConnector) then\r\n\ttype.oclAsType(component::AssemblyConnector)\r\nelse\r\n\tnull\r\nendif"
		   });	
		addAnnotation
		  (delegationConnectorInstanceEClass, 
		   source, 
		   new String[] {
			 "DelegateToEmbeddedCIC", "-- Delegation Connector Instance must delegate to embedded Component Instance Configuration\nself.portInstances->exists(a, b | b.componentInstance.parentCIC.parentStructuredComponentInstance = a.componentInstance)"
		   });	
		addAnnotation
		  (getDelegationConnectorInstance_DelegationConnectorType(), 
		   source, 
		   new String[] {
			 "derivation", "if  type.oclIsKindOf(component::DelegationConnector) then\r\n\ttype.oclAsType(component::DelegationConnector)\r\nelse\r\n\tnull\r\nendif\r\n"
		   });	
		addAnnotation
		  (componentInstanceConfigurationEClass, 
		   source, 
		   new String[] {
			 "UniqueComponentInstanceNames", "--  Component instances of a component instance configuration must have unique names on top level.\r\nself.componentInstances->isUnique(name)"
		   });	
		addAnnotation
		  (getComponentInstanceConfiguration_ParentPortInstances(), 
		   source, 
		   new String[] {
			 "derivation", "if self.parentStructuredComponentInstance.oclIsUndefined()\r\nthen OrderedSet {}\r\nelse self.parentStructuredComponentInstance.portInstances\r\nendif"
		   });	
		addAnnotation
		  (continuousPortInstanceEClass, 
		   source, 
		   new String[] {
			 "PortTypeIsKindOfContinuousPort", "-- The port type of a ContinuousPortInstance has to be of kind ContinuousPort\n(not self.portType.oclIsUndefined()) implies self.portType.oclIsKindOf(component::ContinuousPort)\n-- adann"
		   });	
		addAnnotation
		  (hybridPortInstanceEClass, 
		   source, 
		   new String[] {
			 "PortTypeIsKindOfHybridPort", "-- The port type of a HybridPortInstance has to be of kind HybridPort\n(not self.portType.oclIsUndefined()) implies self.portType.oclIsKindOf(component::HybridPort)\n-- adann"
		   });	
		addAnnotation
		  (discretePortInstanceEClass, 
		   source, 
		   new String[] {
			 "PortTypeIsKindOfDiscretePort", "-- The port type of a DiscretePortInstance has to be of kind DiscretePort\n(not self.portType.oclIsUndefined()) implies self.portType.oclIsKindOf(component::DiscretePort)"
		   });	
		addAnnotation
		  (getDiscretePortInstance_ReceiverMessageTypes(), 
		   source, 
		   new String[] {
			 "derivation", "if portType.oclIsUndefined() or not portType.oclIsKindOf(component::DiscretePort) then\r\n\tOrderedSet { }\r\nelse\r\n\tportType.oclAsType(component::DiscretePort).receiverMessageTypes\r\nendif"
		   });	
		addAnnotation
		  (getDiscretePortInstance_SenderMessageTypes(), 
		   source, 
		   new String[] {
			 "derivation", "if portType.oclIsUndefined() or not portType.oclIsKindOf(component::DiscretePort) then\r\n\tOrderedSet { }\r\nelse\r\n\tportType.oclAsType(component::DiscretePort).senderMessageTypes\r\nendif"
		   });	
		addAnnotation
		  (getDiscretePortInstance_ReceiverMessageBuffer(), 
		   source, 
		   new String[] {
			 "derivation", "if (not self.portType.oclIsUndefined()) and self.portType.oclIsKindOf(component::DiscretePort) then\n\tself.portType.oclAsType(component::DiscretePort).receiverMessageBuffer\nelse\n\tOrderedSet { }\nendif"
		   });	
		addAnnotation
		  (getDiscretePortInstance_RefinedRole(), 
		   source, 
		   new String[] {
			 "derivation", "if not self.portType.oclIsUndefined() and self.portType.oclIsKindOf(component::DiscretePort) then\r\n\tself.portType.oclAsType(component::DiscretePort).refinedRole\r\nelse\r\n\tnull\r\nendif"
		   });	
		addAnnotation
		  (discreteSinglePortInstanceEClass, 
		   source, 
		   new String[] {
			 "PortInstanceNotMultipleAssemblyConnectorInstances", "-- PortInstance must have not have mulltiple Assembly Connector Instances assigned.\nportConnectorInstances->select(\n\tci | ci.oclIsKindOf(AssemblyConnectorInstance)\n)->size() <= 1",
			 "PortInstanceNotMultipleDelegationConnectorInstances", "-- PortInstance must have not have multiple Delegation Connector Instances per directiond assigned.\r\nlet delegationInstances : Set(instance::DelegationConnectorInstance) = portConnectorInstances->select(oclIsKindOf(instance::DelegationConnectorInstance)).oclAsType(instance::DelegationConnectorInstance)->asSet() in\r\nlet incoming : Set(instance::DelegationConnectorInstance) = delegationInstances->select(di | di.portInstances->forAll(pi |pi = self or pi.componentInstance->closure(p | if p.oclIsKindOf(instance::StructuredComponentInstance) then p.oclAsType(instance::StructuredComponentInstance).embeddedCIC.componentInstances else OrderedSet { p } endif)->includes(self.componentInstance))) in\r\nlet outgoing : Set(instance::DelegationConnectorInstance) = delegationInstances->select(di | di.portInstances->forAll(pi |pi = self or self.componentInstance->closure(p | if p.oclIsKindOf(instance::StructuredComponentInstance) then p.oclAsType(instance::StructuredComponentInstance).embeddedCIC.componentInstances else OrderedSet { p } endif)->includes(pi.componentInstance))) in\r\nincoming->size() <= 1 and outgoing->size() <= 1",
			 "PortInstanceNeedsDelegationToParentOrAssembly", "-- PortInstance needs a Delegation Connector Instance to the parent component\'s port or an Assembly Connector Instance to a port within this CIC.\r\n\r\nif(self.componentInstance.oclIsInvalid() or self.componentInstance = null) then true else (not self.componentInstance.topLevel) implies (\r\nnot portConnectorInstances->select(\r\n\tci | ci.oclIsKindOf(DelegationConnectorInstance)\r\n\tand ci.oclAsType(DelegationConnectorInstance).portInstances->any(pi | pi <> self).componentInstance.oclIsKindOf(StructuredComponentInstance)\r\n\tand ci.oclAsType(DelegationConnectorInstance).portInstances->any(pi | pi <> self).componentInstance.oclAsType(StructuredComponentInstance).embeddedCIC.componentInstances->includes(componentInstance)\r\n)->isEmpty() or\r\nnot portConnectorInstances->select(\r\n\tci | ci.oclIsKindOf(AssemblyConnectorInstance)\r\n)->isEmpty()\r\n)\r\nendif\r\n"
		   });	
		addAnnotation
		  (getDiscreteMultiPortInstance_GmfSubPortInstances(), 
		   source, 
		   new String[] {
			 "derivation", "self.subInteractionEndpointInstances"
		   });	
		addAnnotation
		  (structuredComponentInstanceEClass, 
		   source, 
		   new String[] {
			 "NumberOfembeddedComponentInstancesCorrespondsToLowerBound", " -- Not all ComponentParts with a lowerBound > 0 are initialized\nlet componentParts : Set(component::ComponentPart) = if (not self.componentType.oclIsUndefined() and self.componentType.oclIsKindOf(component::StructuredComponent)) then self.componentType.oclAsType(component::StructuredComponent).embeddedComponentParts else OrderedSet{} endif in\n let componentInstances : Set(ComponentInstance) = if (not self.embeddedCIC.oclIsUndefined())  then self.embeddedCIC.componentInstances else OrderedSet{} endif in\ncomponentParts->forAll(part| if (not part.cardinality.lowerBound.infinity) then componentInstances->select(ci | ci.componentPart = part)->size()>=part.cardinality.lowerBound.value else true endif)\n-- adann",
			 "NumberOfembeddedComponentInstancesCorrespondsToUpperBound", " -- The number of initialized ComponentInstances does not corresponds to the specified upperBound\nlet componentParts : Set(component::ComponentPart) = if (not self.componentType.oclIsUndefined() and self.componentType.oclIsKindOf(component::StructuredComponent)) then self.componentType.oclAsType(component::StructuredComponent).embeddedComponentParts else OrderedSet{} endif in\nlet componentInstances : Set(ComponentInstance) = if (not self.embeddedCIC.oclIsUndefined())  then self.embeddedCIC.componentInstances else OrderedSet{} endif in\ncomponentParts->forAll(part| if (not part.cardinality.upperBound.infinity) then componentInstances->select(ci | ci.componentPart = part)->size()<=part.cardinality.upperBound.value else true endif)\n-- adann ticket:937"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.muml.org/emf/OCLFilter</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLFilterAnnotations() {
		String source = "http://www.muml.org/emf/OCLFilter";	
		addAnnotation
		  (getComponentInstance_ComponentType(), 
		   source, 
		   new String[] {
			 "filter", "(\nif self.parentCIC.parentStructuredComponentInstance.oclIsUndefined() then\n\tcomponent::Component::allInstances()\nelse\n\tself.parentCIC.parentStructuredComponentInstance.componentType.oclAsType(component::StructuredComponent).embeddedComponentParts.componentType\nendif\n)->select(x | (self.oclIsKindOf(AtomicComponentInstance) and x.oclIsKindOf(component::AtomicComponent)) or (self.oclIsKindOf(StructuredComponentInstance) and x.oclIsKindOf(component::StructuredComponent)))"
		   });	
		addAnnotation
		  (getComponentInstance_ComponentPart(), 
		   source, 
		   new String[] {
			 "filter", "self.parentCIC.parentStructuredComponentInstance.componentType.oclAsType(component::StructuredComponent).embeddedComponentParts"
		   });	
		addAnnotation
		  (portConnectorInstanceEClass, 
		   source, 
		   new String[] {
			 "filter", "let types : Set(connector::ConnectorEndpoint) = self.portInstances->collect(pi | if (pi.portPart.oclIsUndefined()) then pi.type else pi.portPart endif).oclAsType(connector::ConnectorEndpoint)->asSet()\nin types.connectors->select(c | c.connectorEndpoints->asSet() = types)->asSet()",
			 "feature", "type"
		   });
	}

} //InstancePackageImpl
