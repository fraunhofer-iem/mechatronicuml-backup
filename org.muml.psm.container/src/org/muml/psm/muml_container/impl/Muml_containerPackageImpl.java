/**
 */
package org.muml.psm.muml_container.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.muml.pim.component.ComponentPackage;

import org.muml.pim.instance.InstancePackage;

import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;

import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;

import org.muml.psm.PsmPackage;

import org.muml.psm.allocation.AllocationPackage;

import org.muml.psm.muml_container.ComponentContainer;
import org.muml.psm.muml_container.ContainerComponentInstanceConfiguration;
import org.muml.psm.muml_container.DeploymentConfiguration;
import org.muml.psm.muml_container.ECUConfiguration;
import org.muml.psm.muml_container.MultiPortInstanceConfiguration;
import org.muml.psm.muml_container.Muml_containerFactory;
import org.muml.psm.muml_container.Muml_containerPackage;
import org.muml.psm.muml_container.PortInstanceConfiguration;
import org.muml.psm.muml_container.PortInstanceConfiguration_DDS;
import org.muml.psm.muml_container.PortInstanceConfiguration_Local;
import org.opendds.modeling.model.application.ApplicationPackage;

import org.opendds.modeling.model.core.CorePackage;

import org.opendds.modeling.model.dcps.DCPSPackage;

import org.opendds.modeling.model.domain.DomainPackage;

import org.opendds.modeling.model.enumerations.EnumerationsPackage;

import org.opendds.modeling.model.opendds.OpenDDSPackage;

import org.opendds.modeling.model.qos.QoSPackage;

import org.opendds.modeling.model.topics.TopicsPackage;

import org.opendds.modeling.model.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Muml_containerPackageImpl extends EPackageImpl implements Muml_containerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerComponentInstanceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portInstanceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portInstanceConfiguration_LocalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portInstanceConfiguration_DDSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecuConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiPortInstanceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentConfigurationEClass = null;

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
	 * @see org.muml.psm.muml_container.Muml_containerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Muml_containerPackageImpl() {
		super(eNS_URI, Muml_containerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Muml_containerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Muml_containerPackage init() {
		if (isInited) return (Muml_containerPackage)EPackage.Registry.INSTANCE.getEPackage(Muml_containerPackage.eNS_URI);

		// Obtain or create and register package
		Muml_containerPackageImpl theMuml_containerPackage = (Muml_containerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Muml_containerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Muml_containerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OpenDDSPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		DomainPackage.eINSTANCE.eClass();
		QoSPackage.eINSTANCE.eClass();
		TopicsPackage.eINSTANCE.eClass();
		DCPSPackage.eINSTANCE.eClass();
		ApplicationPackage.eINSTANCE.eClass();
		EnumerationsPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		PsmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMuml_containerPackage.createPackageContents();

		// Initialize created meta-data
		theMuml_containerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMuml_containerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Muml_containerPackage.eNS_URI, theMuml_containerPackage);
		return theMuml_containerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentContainer() {
		return componentContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentContainer_ComponentType() {
		return (EReference)componentContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentContainer_ComponentInstanceConfigurations() {
		return (EReference)componentContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentContainer_EcuConfiguration() {
		return (EReference)componentContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentContainer_ComponentInstances() {
		return (EReference)componentContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerComponentInstanceConfiguration() {
		return containerComponentInstanceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerComponentInstanceConfiguration_ComponentInstance() {
		return (EReference)containerComponentInstanceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerComponentInstanceConfiguration_PortInstanceConfigurations() {
		return (EReference)containerComponentInstanceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortInstanceConfiguration() {
		return portInstanceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstanceConfiguration_PortInstance() {
		return (EReference)portInstanceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstanceConfiguration_HwportInstance() {
		return (EReference)portInstanceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortInstanceConfiguration_Local() {
		return portInstanceConfiguration_LocalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortInstanceConfiguration_Local_OwnID() {
		return (EAttribute)portInstanceConfiguration_LocalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortInstanceConfiguration_Local_WritersID() {
		return (EAttribute)portInstanceConfiguration_LocalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortInstanceConfiguration_DDS() {
		return portInstanceConfiguration_DDSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortInstanceConfiguration_DDS_DomainID() {
		return (EAttribute)portInstanceConfiguration_DDSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortInstanceConfiguration_DDS_PartitionID() {
		return (EAttribute)portInstanceConfiguration_DDSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstanceConfiguration_DDS_Publisher() {
		return (EReference)portInstanceConfiguration_DDSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstanceConfiguration_DDS_Subscriber() {
		return (EReference)portInstanceConfiguration_DDSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstanceConfiguration_DDS_DomainParticipant() {
		return (EReference)portInstanceConfiguration_DDSEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECUConfiguration() {
		return ecuConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECUConfiguration_StructuredResourceInstance() {
		return (EReference)ecuConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECUConfiguration_ComponentContainers() {
		return (EReference)ecuConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiPortInstanceConfiguration() {
		return multiPortInstanceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiPortInstanceConfiguration_PortInstanceConfigurations() {
		return (EReference)multiPortInstanceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentConfiguration() {
		return deploymentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentConfiguration_SystemAllocation() {
		return (EReference)deploymentConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentConfiguration_EcuConfigurations() {
		return (EReference)deploymentConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Muml_containerFactory getMuml_containerFactory() {
		return (Muml_containerFactory)getEFactoryInstance();
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
		componentContainerEClass = createEClass(COMPONENT_CONTAINER);
		createEReference(componentContainerEClass, COMPONENT_CONTAINER__COMPONENT_TYPE);
		createEReference(componentContainerEClass, COMPONENT_CONTAINER__COMPONENT_INSTANCE_CONFIGURATIONS);
		createEReference(componentContainerEClass, COMPONENT_CONTAINER__ECU_CONFIGURATION);
		createEReference(componentContainerEClass, COMPONENT_CONTAINER__COMPONENT_INSTANCES);

		containerComponentInstanceConfigurationEClass = createEClass(CONTAINER_COMPONENT_INSTANCE_CONFIGURATION);
		createEReference(containerComponentInstanceConfigurationEClass, CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCE);
		createEReference(containerComponentInstanceConfigurationEClass, CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__PORT_INSTANCE_CONFIGURATIONS);

		portInstanceConfigurationEClass = createEClass(PORT_INSTANCE_CONFIGURATION);
		createEReference(portInstanceConfigurationEClass, PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE);
		createEReference(portInstanceConfigurationEClass, PORT_INSTANCE_CONFIGURATION__HWPORT_INSTANCE);

		portInstanceConfiguration_LocalEClass = createEClass(PORT_INSTANCE_CONFIGURATION_LOCAL);
		createEAttribute(portInstanceConfiguration_LocalEClass, PORT_INSTANCE_CONFIGURATION_LOCAL__OWN_ID);
		createEAttribute(portInstanceConfiguration_LocalEClass, PORT_INSTANCE_CONFIGURATION_LOCAL__WRITERS_ID);

		portInstanceConfiguration_DDSEClass = createEClass(PORT_INSTANCE_CONFIGURATION_DDS);
		createEAttribute(portInstanceConfiguration_DDSEClass, PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_ID);
		createEAttribute(portInstanceConfiguration_DDSEClass, PORT_INSTANCE_CONFIGURATION_DDS__PARTITION_ID);
		createEReference(portInstanceConfiguration_DDSEClass, PORT_INSTANCE_CONFIGURATION_DDS__PUBLISHER);
		createEReference(portInstanceConfiguration_DDSEClass, PORT_INSTANCE_CONFIGURATION_DDS__SUBSCRIBER);
		createEReference(portInstanceConfiguration_DDSEClass, PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_PARTICIPANT);

		ecuConfigurationEClass = createEClass(ECU_CONFIGURATION);
		createEReference(ecuConfigurationEClass, ECU_CONFIGURATION__STRUCTURED_RESOURCE_INSTANCE);
		createEReference(ecuConfigurationEClass, ECU_CONFIGURATION__COMPONENT_CONTAINERS);

		multiPortInstanceConfigurationEClass = createEClass(MULTI_PORT_INSTANCE_CONFIGURATION);
		createEReference(multiPortInstanceConfigurationEClass, MULTI_PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE_CONFIGURATIONS);

		deploymentConfigurationEClass = createEClass(DEPLOYMENT_CONFIGURATION);
		createEReference(deploymentConfigurationEClass, DEPLOYMENT_CONFIGURATION__SYSTEM_ALLOCATION);
		createEReference(deploymentConfigurationEClass, DEPLOYMENT_CONFIGURATION__ECU_CONFIGURATIONS);
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
		org.muml.core.CorePackage theCorePackage_1 = (org.muml.core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(org.muml.core.CorePackage.eNS_URI);
		ComponentPackage theComponentPackage = (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		HwplatforminstancePackage theHwplatforminstancePackage = (HwplatforminstancePackage)EPackage.Registry.INSTANCE.getEPackage(HwplatforminstancePackage.eNS_URI);
		DCPSPackage theDCPSPackage = (DCPSPackage)EPackage.Registry.INSTANCE.getEPackage(DCPSPackage.eNS_URI);
		HwresourceinstancePackage theHwresourceinstancePackage = (HwresourceinstancePackage)EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI);
		AllocationPackage theAllocationPackage = (AllocationPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentContainerEClass.getESuperTypes().add(theCorePackage_1.getNamedElement());
		portInstanceConfiguration_LocalEClass.getESuperTypes().add(this.getPortInstanceConfiguration());
		portInstanceConfiguration_DDSEClass.getESuperTypes().add(this.getPortInstanceConfiguration());
		ecuConfigurationEClass.getESuperTypes().add(theCorePackage_1.getNamedElement());
		multiPortInstanceConfigurationEClass.getESuperTypes().add(this.getPortInstanceConfiguration());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentContainerEClass, ComponentContainer.class, "ComponentContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentContainer_ComponentType(), theComponentPackage.getComponent(), null, "componentType", null, 0, 1, ComponentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentContainer_ComponentInstanceConfigurations(), this.getContainerComponentInstanceConfiguration(), null, "componentInstanceConfigurations", null, 0, -1, ComponentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentContainer_EcuConfiguration(), this.getECUConfiguration(), this.getECUConfiguration_ComponentContainers(), "ecuConfiguration", null, 0, 1, ComponentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentContainer_ComponentInstances(), theInstancePackage.getComponentInstance(), null, "componentInstances", null, 0, -1, ComponentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(containerComponentInstanceConfigurationEClass, ContainerComponentInstanceConfiguration.class, "ContainerComponentInstanceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerComponentInstanceConfiguration_ComponentInstance(), theInstancePackage.getComponentInstance(), null, "componentInstance", null, 0, 1, ContainerComponentInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerComponentInstanceConfiguration_PortInstanceConfigurations(), this.getPortInstanceConfiguration(), null, "portInstanceConfigurations", null, 0, -1, ContainerComponentInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(portInstanceConfigurationEClass, PortInstanceConfiguration.class, "PortInstanceConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortInstanceConfiguration_PortInstance(), theInstancePackage.getPortInstance(), null, "portInstance", null, 0, 1, PortInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstanceConfiguration_HwportInstance(), theHwplatforminstancePackage.getHWPortInstance(), null, "hwportInstance", null, 0, 1, PortInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portInstanceConfiguration_LocalEClass, PortInstanceConfiguration_Local.class, "PortInstanceConfiguration_Local", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortInstanceConfiguration_Local_OwnID(), ecorePackage.getEShort(), "ownID", null, 0, 1, PortInstanceConfiguration_Local.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortInstanceConfiguration_Local_WritersID(), ecorePackage.getEShort(), "writersID", null, 0, 1, PortInstanceConfiguration_Local.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portInstanceConfiguration_DDSEClass, PortInstanceConfiguration_DDS.class, "PortInstanceConfiguration_DDS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortInstanceConfiguration_DDS_DomainID(), ecorePackage.getEInt(), "domainID", null, 0, 1, PortInstanceConfiguration_DDS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortInstanceConfiguration_DDS_PartitionID(), ecorePackage.getEInt(), "partitionID", null, 0, 1, PortInstanceConfiguration_DDS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstanceConfiguration_DDS_Publisher(), theDCPSPackage.getPublisher(), null, "publisher", null, 0, 1, PortInstanceConfiguration_DDS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstanceConfiguration_DDS_Subscriber(), theDCPSPackage.getSubscriber(), null, "subscriber", null, 0, 1, PortInstanceConfiguration_DDS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstanceConfiguration_DDS_DomainParticipant(), theDCPSPackage.getDomainParticipant(), null, "domainParticipant", null, 0, 1, PortInstanceConfiguration_DDS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecuConfigurationEClass, ECUConfiguration.class, "ECUConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECUConfiguration_StructuredResourceInstance(), theHwresourceinstancePackage.getStructuredResourceInstance(), null, "structuredResourceInstance", null, 0, 1, ECUConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECUConfiguration_ComponentContainers(), this.getComponentContainer(), this.getComponentContainer_EcuConfiguration(), "componentContainers", null, 0, -1, ECUConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(multiPortInstanceConfigurationEClass, MultiPortInstanceConfiguration.class, "MultiPortInstanceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiPortInstanceConfiguration_PortInstanceConfigurations(), this.getPortInstanceConfiguration(), null, "portInstanceConfigurations", null, 0, -1, MultiPortInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentConfigurationEClass, DeploymentConfiguration.class, "DeploymentConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentConfiguration_SystemAllocation(), theAllocationPackage.getSystemAllocation(), null, "systemAllocation", null, 0, 1, DeploymentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeploymentConfiguration_EcuConfigurations(), this.getECUConfiguration(), null, "ecuConfigurations", null, 0, -1, DeploymentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

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

} //Muml_containerPackageImpl
