/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage;
import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.behavior.impl.BehaviorPackageImpl;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.impl.ComponentPackageImpl;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.connector.impl.ConnectorPackageImpl;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.constraint.impl.ConstraintPackageImpl;


import de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance;
import de.uni_paderborn.fujaba.muml.instance.AtomicComponentInstance;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.instance.ContinuousPortInstance;
import de.uni_paderborn.fujaba.muml.instance.CoordinationProtocolInstance;
import de.uni_paderborn.fujaba.muml.instance.DelegationConnectorInstance;
import de.uni_paderborn.fujaba.muml.instance.DiscreteMultiPortInstance;
import de.uni_paderborn.fujaba.muml.instance.DiscretePortInstance;
import de.uni_paderborn.fujaba.muml.instance.DiscreteSinglePortInstance;
import de.uni_paderborn.fujaba.muml.instance.HybridPortInstance;
import de.uni_paderborn.fujaba.muml.instance.InstanceFactory;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.instance.PortConnectorInstance;
import de.uni_paderborn.fujaba.muml.instance.PortInstance;
import de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance;
import de.uni_paderborn.fujaba.muml.instance.util.InstanceValidator;
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
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#eNS_URI
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
		ProtocolPackageImpl theProtocolPackage = (ProtocolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) instanceof ProtocolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) : ProtocolPackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		MsgtypePackageImpl theMsgtypePackage = (MsgtypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) instanceof MsgtypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) : MsgtypePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ConnectorPackageImpl theConnectorPackage = (ConnectorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) instanceof ConnectorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI) : ConnectorPackage.eINSTANCE);
		ValuetypePackageImpl theValuetypePackage = (ValuetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) instanceof ValuetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) : ValuetypePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);

		// Create package meta-data objects
		theInstancePackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theProtocolPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theMsgtypePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theConnectorPackage.createPackageContents();
		theValuetypePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();

		// Initialize created meta-data
		theInstancePackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theProtocolPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theMsgtypePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theConnectorPackage.initializePackageContents();
		theValuetypePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();

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
	public EReference getCoordinationProtocolInstance_CoordinationProtocolOccurrence() {
		return (EReference)coordinationProtocolInstanceEClass.getEStructuralFeatures().get(1);
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

		portConnectorInstanceEClass = createEClass(PORT_CONNECTOR_INSTANCE);
		createEReference(portConnectorInstanceEClass, PORT_CONNECTOR_INSTANCE__PORT_CONNECTOR_TYPE);
		createEReference(portConnectorInstanceEClass, PORT_CONNECTOR_INSTANCE__PORT_INSTANCES);

		portInstanceEClass = createEClass(PORT_INSTANCE);
		createEReference(portInstanceEClass, PORT_INSTANCE__PORT_TYPE);
		createEReference(portInstanceEClass, PORT_INSTANCE__COMPONENT_INSTANCE);
		createEReference(portInstanceEClass, PORT_INSTANCE__PORT_CONNECTOR_INSTANCES);
		createEReference(portInstanceEClass, PORT_INSTANCE__PORT_PART);

		assemblyConnectorInstanceEClass = createEClass(ASSEMBLY_CONNECTOR_INSTANCE);
		createEReference(assemblyConnectorInstanceEClass, ASSEMBLY_CONNECTOR_INSTANCE__ASSEMBLY_CONNECTOR_TYPE);

		delegationConnectorInstanceEClass = createEClass(DELEGATION_CONNECTOR_INSTANCE);
		createEReference(delegationConnectorInstanceEClass, DELEGATION_CONNECTOR_INSTANCE__DELEGATION_CONNECTOR_TYPE);

		componentInstanceConfigurationEClass = createEClass(COMPONENT_INSTANCE_CONFIGURATION);
		createEReference(componentInstanceConfigurationEClass, COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES);
		createEReference(componentInstanceConfigurationEClass, COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES);
		createEReference(componentInstanceConfigurationEClass, COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES);

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
		createEReference(coordinationProtocolInstanceEClass, COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_OCCURRENCE);

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
		ConnectorPackage theConnectorPackage = (ConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);
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

		initEClass(portConnectorInstanceEClass, PortConnectorInstance.class, "PortConnectorInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortConnectorInstance_PortConnectorType(), theComponentPackage.getPortConnector(), null, "portConnectorType", null, 0, 1, PortConnectorInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPortConnectorInstance_PortInstances(), this.getPortInstance(), null, "portInstances", null, 0, -1, PortConnectorInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(portInstanceEClass, PortInstance.class, "PortInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortInstance_PortType(), theComponentPackage.getPort(), null, "portType", null, 1, 1, PortInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstance_ComponentInstance(), this.getComponentInstance(), this.getComponentInstance_PortInstances(), "componentInstance", null, 0, 1, PortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstance_PortConnectorInstances(), this.getPortConnectorInstance(), null, "portConnectorInstances", null, 0, -1, PortInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstance_PortPart(), theComponentPackage.getPortPart(), null, "portPart", null, 0, 1, PortInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(assemblyConnectorInstanceEClass, AssemblyConnectorInstance.class, "AssemblyConnectorInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyConnectorInstance_AssemblyConnectorType(), theComponentPackage.getAssemblyConnector(), null, "assemblyConnectorType", null, 0, 1, AssemblyConnectorInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(delegationConnectorInstanceEClass, DelegationConnectorInstance.class, "DelegationConnectorInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationConnectorInstance_DelegationConnectorType(), theComponentPackage.getDelegationConnector(), null, "delegationConnectorType", null, 1, 1, DelegationConnectorInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentInstanceConfigurationEClass, ComponentInstanceConfiguration.class, "ComponentInstanceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstanceConfiguration_ComponentInstances(), this.getComponentInstance(), null, "componentInstances", null, 0, -1, ComponentInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstanceConfiguration_PortConnectorInstances(), this.getPortConnectorInstance(), null, "portConnectorInstances", null, 0, -1, ComponentInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstanceConfiguration_ParentPortInstances(), this.getPortInstance(), null, "parentPortInstances", null, 0, -1, ComponentInstanceConfiguration.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		initEReference(getCoordinationProtocolInstance_CoordinationProtocolOccurrence(), theComponentPackage.getCoordinationProtocolOccurrence(), null, "coordinationProtocolOccurrence", null, 1, 1, CoordinationProtocolInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredComponentInstanceEClass, StructuredComponentInstance.class, "StructuredComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredComponentInstance_EmbeddedCIC(), this.getComponentInstanceConfiguration(), null, "embeddedCIC", null, 1, 1, StructuredComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicComponentInstanceEClass, AtomicComponentInstance.class, "AtomicComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (portInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "PortInstanceMustReferencePortType"
		   });												
		addAnnotation
		  (delegationConnectorInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", ""
		   });							
		addAnnotation
		  (componentInstanceConfigurationEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueComponentInstanceNames"
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
			 "PortInstanceMustReferencePortType", "-- The type of a port instance must be a port type\r\nif (not self.type->oclIsUndefined()) then\r\nself.type.oclIsKindOf(component::Port)\r\nelse\r\nfalse\r\nendif"
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
		  (getAssemblyConnectorInstance_AssemblyConnectorType(), 
		   source, 
		   new String[] {
			 "derivation", "self.type.oclAsType(component::AssemblyConnector)"
		   });				
		addAnnotation
		  (delegationConnectorInstanceEClass, 
		   source, 
		   new String[] {
			 "OneDelegationInstancePerPortInstance", "-- FIXME\r\nnot self.source.oclIsUndefined() implies self.source.outgoingConnectorInstances->select(x | x.oclIsKindOf(DelegationInstance))->size() = 1"
		   });			
		addAnnotation
		  (getDelegationConnectorInstance_DelegationConnectorType(), 
		   source, 
		   new String[] {
			 "derivation", "self.type.oclAsType(component::DelegationConnector)"
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
			 "derivation", "if (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(ComponentInstance)) then\n\tself.oclAsType(ecore::EObject).eContainer().oclAsType(ComponentInstance).portInstances\nelse\n\tOrderedSet {}\nendif"
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
			 "derivation", "if self.refinedRole.oclIsUndefined() then\r\n\tOrderedSet { }\r\nelse\r\n\tself.refinedRole.receiverMessageBuffer\r\nendif"
		   });			
		addAnnotation
		  (getDiscretePortInstance_RefinedRole(), 
		   source, 
		   new String[] {
			 "derivation", "if not self.portType.oclIsUndefined() and self.portType.oclIsKindOf(component::DiscretePort) then\r\n\tself.portType.oclAsType(component::DiscretePort).refinedRole\r\nelse\r\n\tnull\r\nendif"
		   });						
		addAnnotation
		  (getDiscreteMultiPortInstance_GmfSubPortInstances(), 
		   source, 
		   new String[] {
			 "derivation", "self.subInteractionEndpointInstances"
		   });						
	}

} //InstancePackageImpl
