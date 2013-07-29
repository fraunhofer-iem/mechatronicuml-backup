/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.psm.deployment.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink;
import de.uni_paderborn.fujaba.muml.psm.deployment.Deployment;
import de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentFactory;
import de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNode;
import de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNodeKind;
import de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePort;
import de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePortDirectionKind;
import de.uni_paderborn.fujaba.muml.psm.deployment.LinkQualityOfService;
import de.uni_paderborn.fujaba.muml.psm.deployment.util.DeploymentValidator;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.types.TypesPackage;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentPackageImpl extends EPackageImpl implements DeploymentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwarePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkQualityOfServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hardwareNodeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hardwarePortDirectionKindEEnum = null;

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
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeploymentPackageImpl() {
		super(eNS_URI, DeploymentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DeploymentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeploymentPackage init() {
		if (isInited) return (DeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI);

		// Obtain or create and register package
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DeploymentPackageImpl());

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

		// Create package meta-data objects
		theDeploymentPackage.createPackageContents();

		// Initialize created meta-data
		theDeploymentPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDeploymentPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DeploymentValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDeploymentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeploymentPackage.eNS_URI, theDeploymentPackage);
		return theDeploymentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_CommunicationLinks() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_HardwareNodes() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_ComponentInstanceConfiguration() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_QualityOfLinkServices() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareNode() {
		return hardwareNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareNode_Deployment() {
		return (EReference)hardwareNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareNode_HardwarePorts() {
		return (EReference)hardwareNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareNode_DeployedInstances() {
		return (EReference)hardwareNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareNode_HardwareNodeKind() {
		return (EAttribute)hardwareNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwarePort() {
		return hardwarePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwarePort_HardwareNode() {
		return (EReference)hardwarePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwarePort_DeployedPortInstance() {
		return (EReference)hardwarePortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePort_Kind() {
		return (EAttribute)hardwarePortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwarePort_CommunicationLinks() {
		return (EReference)hardwarePortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationLink() {
		return communicationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLink_Deployment() {
		return (EReference)communicationLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLink_QualityOfService() {
		return (EReference)communicationLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLink_DeployedAssemblyInstances() {
		return (EReference)communicationLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLink_HardwarePorts() {
		return (EReference)communicationLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkQualityOfService() {
		return linkQualityOfServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkQualityOfService_PacketDelayVariation() {
		return (EReference)linkQualityOfServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkQualityOfService_Latency() {
		return (EReference)linkQualityOfServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkQualityOfService_Deployment() {
		return (EReference)linkQualityOfServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHardwareNodeKind() {
		return hardwareNodeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHardwarePortDirectionKind() {
		return hardwarePortDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentFactory getDeploymentFactory() {
		return (DeploymentFactory)getEFactoryInstance();
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
		deploymentEClass = createEClass(DEPLOYMENT);
		createEReference(deploymentEClass, DEPLOYMENT__COMMUNICATION_LINKS);
		createEReference(deploymentEClass, DEPLOYMENT__HARDWARE_NODES);
		createEReference(deploymentEClass, DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION);
		createEReference(deploymentEClass, DEPLOYMENT__QUALITY_OF_LINK_SERVICES);

		hardwareNodeEClass = createEClass(HARDWARE_NODE);
		createEReference(hardwareNodeEClass, HARDWARE_NODE__DEPLOYMENT);
		createEReference(hardwareNodeEClass, HARDWARE_NODE__HARDWARE_PORTS);
		createEReference(hardwareNodeEClass, HARDWARE_NODE__DEPLOYED_INSTANCES);
		createEAttribute(hardwareNodeEClass, HARDWARE_NODE__HARDWARE_NODE_KIND);

		hardwarePortEClass = createEClass(HARDWARE_PORT);
		createEReference(hardwarePortEClass, HARDWARE_PORT__HARDWARE_NODE);
		createEReference(hardwarePortEClass, HARDWARE_PORT__DEPLOYED_PORT_INSTANCE);
		createEAttribute(hardwarePortEClass, HARDWARE_PORT__KIND);
		createEReference(hardwarePortEClass, HARDWARE_PORT__COMMUNICATION_LINKS);

		communicationLinkEClass = createEClass(COMMUNICATION_LINK);
		createEReference(communicationLinkEClass, COMMUNICATION_LINK__DEPLOYMENT);
		createEReference(communicationLinkEClass, COMMUNICATION_LINK__QUALITY_OF_SERVICE);
		createEReference(communicationLinkEClass, COMMUNICATION_LINK__DEPLOYED_ASSEMBLY_INSTANCES);
		createEReference(communicationLinkEClass, COMMUNICATION_LINK__HARDWARE_PORTS);

		linkQualityOfServiceEClass = createEClass(LINK_QUALITY_OF_SERVICE);
		createEReference(linkQualityOfServiceEClass, LINK_QUALITY_OF_SERVICE__PACKET_DELAY_VARIATION);
		createEReference(linkQualityOfServiceEClass, LINK_QUALITY_OF_SERVICE__LATENCY);
		createEReference(linkQualityOfServiceEClass, LINK_QUALITY_OF_SERVICE__DEPLOYMENT);

		// Create enums
		hardwareNodeKindEEnum = createEEnum(HARDWARE_NODE_KIND);
		hardwarePortDirectionKindEEnum = createEEnum(HARDWARE_PORT_DIRECTION_KIND);
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
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		ConnectorPackage theConnectorPackage = (ConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		deploymentEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		deploymentEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		hardwareNodeEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		hardwareNodeEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		hardwarePortEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		hardwarePortEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		hardwarePortEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpoint());
		communicationLinkEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		communicationLinkEClass.getESuperTypes().add(theConnectorPackage.getConnector());
		linkQualityOfServiceEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		linkQualityOfServiceEClass.getESuperTypes().add(theCorePackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployment_CommunicationLinks(), this.getCommunicationLink(), this.getCommunicationLink_Deployment(), "communicationLinks", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_HardwareNodes(), this.getHardwareNode(), this.getHardwareNode_Deployment(), "hardwareNodes", null, 1, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_ComponentInstanceConfiguration(), theInstancePackage.getComponentInstanceConfiguration(), null, "componentInstanceConfiguration", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_QualityOfLinkServices(), this.getLinkQualityOfService(), this.getLinkQualityOfService_Deployment(), "qualityOfLinkServices", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareNodeEClass, HardwareNode.class, "HardwareNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareNode_Deployment(), this.getDeployment(), this.getDeployment_HardwareNodes(), "deployment", null, 1, 1, HardwareNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareNode_HardwarePorts(), this.getHardwarePort(), this.getHardwarePort_HardwareNode(), "hardwarePorts", null, 0, -1, HardwareNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareNode_DeployedInstances(), theInstancePackage.getComponentInstance(), null, "deployedInstances", null, 0, -1, HardwareNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareNode_HardwareNodeKind(), this.getHardwareNodeKind(), "hardwareNodeKind", null, 0, 1, HardwareNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwarePortEClass, HardwarePort.class, "HardwarePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwarePort_HardwareNode(), this.getHardwareNode(), this.getHardwareNode_HardwarePorts(), "hardwareNode", null, 1, 1, HardwarePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwarePort_DeployedPortInstance(), theInstancePackage.getPortInstance(), null, "deployedPortInstance", null, 0, -1, HardwarePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwarePort_Kind(), this.getHardwarePortDirectionKind(), "kind", "", 0, 1, HardwarePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwarePort_CommunicationLinks(), this.getCommunicationLink(), null, "communicationLinks", null, 0, -1, HardwarePort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(communicationLinkEClass, CommunicationLink.class, "CommunicationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationLink_Deployment(), this.getDeployment(), this.getDeployment_CommunicationLinks(), "deployment", null, 1, 1, CommunicationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLink_QualityOfService(), this.getLinkQualityOfService(), null, "qualityOfService", null, 0, 1, CommunicationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLink_DeployedAssemblyInstances(), theInstancePackage.getAssemblyConnectorInstance(), null, "deployedAssemblyInstances", null, 0, -1, CommunicationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLink_HardwarePorts(), this.getHardwarePort(), null, "hardwarePorts", null, 0, -1, CommunicationLink.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(linkQualityOfServiceEClass, LinkQualityOfService.class, "LinkQualityOfService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkQualityOfService_PacketDelayVariation(), theValuetypePackage.getTimeValue(), null, "packetDelayVariation", null, 0, 1, LinkQualityOfService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkQualityOfService_Latency(), theValuetypePackage.getTimeValue(), null, "latency", null, 0, 1, LinkQualityOfService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkQualityOfService_Deployment(), this.getDeployment(), this.getDeployment_QualityOfLinkServices(), "deployment", null, 0, 1, LinkQualityOfService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(hardwareNodeKindEEnum, HardwareNodeKind.class, "HardwareNodeKind");
		addEEnumLiteral(hardwareNodeKindEEnum, HardwareNodeKind.COMPUTATIONAL_RESOURCE);
		addEEnumLiteral(hardwareNodeKindEEnum, HardwareNodeKind.SENSOR);
		addEEnumLiteral(hardwareNodeKindEEnum, HardwareNodeKind.ACTOR);
		addEEnumLiteral(hardwareNodeKindEEnum, HardwareNodeKind.COMMUNICATION);

		initEEnum(hardwarePortDirectionKindEEnum, HardwarePortDirectionKind.class, "HardwarePortDirectionKind");
		addEEnumLiteral(hardwarePortDirectionKindEEnum, HardwarePortDirectionKind.IN);
		addEEnumLiteral(hardwarePortDirectionKindEEnum, HardwarePortDirectionKind.OUT);
		addEEnumLiteral(hardwarePortDirectionKindEEnum, HardwarePortDirectionKind.IN_OUT);

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
		  (hardwareNodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoDeploymentOnActorOrSensor"
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
		  (hardwareNodeEClass, 
		   source, 
		   new String[] {
			 "NoDeploymentOnActorOrSensor", "(self.hardwareNodeKind <> deployment::HardwareNodeKind::COMPUTATIONAL_RESOURCE) implies self.deployedInstances->isEmpty()"
		   });													
		addAnnotation
		  (getHardwarePort_CommunicationLinks(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectors->select(c | c.oclIsTypeOf(CommunicationLink)).oclAsType(CommunicationLink)->asOrderedSet()"
		   });							
		addAnnotation
		  (getCommunicationLink_HardwarePorts(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpoints->select(c | c.oclIsTypeOf(HardwarePort)).oclAsType(HardwarePort)->asOrderedSet()"
		   });						
	}

} //DeploymentPackageImpl
