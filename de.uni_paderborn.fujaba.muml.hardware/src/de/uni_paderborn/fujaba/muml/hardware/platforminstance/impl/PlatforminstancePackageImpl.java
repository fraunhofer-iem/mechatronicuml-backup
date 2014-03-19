/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstance;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstanceFactory;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.types.TypesPackage;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatforminstancePackageImpl extends EPackageImpl implements PlatforminstancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwPlatformInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwPlatformInstanceConfigurationEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlatforminstancePackageImpl() {
		super(eNS_URI, PlatforminstanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PlatforminstancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlatforminstancePackage init() {
		if (isInited) return (PlatforminstancePackage)EPackage.Registry.INSTANCE.getEPackage(PlatforminstancePackage.eNS_URI);

		// Obtain or create and register package
		PlatforminstancePackageImpl thePlatforminstancePackage = (PlatforminstancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PlatforminstancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PlatforminstancePackageImpl());

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

		// Obtain or create and register interdependencies
		ResourcetypePackageImpl theResourcetypePackage = (ResourcetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI) instanceof ResourcetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI) : ResourcetypePackage.eINSTANCE);
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) : PlatformPackage.eINSTANCE);
		HwvaluetypePackageImpl theHwvaluetypePackage = (HwvaluetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI) instanceof HwvaluetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI) : HwvaluetypePackage.eINSTANCE);

		// Create package meta-data objects
		thePlatforminstancePackage.createPackageContents();
		theResourcetypePackage.createPackageContents();
		thePlatformPackage.createPackageContents();
		theHwvaluetypePackage.createPackageContents();

		// Initialize created meta-data
		thePlatforminstancePackage.initializePackageContents();
		theResourcetypePackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();
		theHwvaluetypePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePlatforminstancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlatforminstancePackage.eNS_URI, thePlatforminstancePackage);
		return thePlatforminstancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHWPlatformInstance() {
		return hwPlatformInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstance_HwplatformType() {
		return (EReference)hwPlatformInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstance_ResourceInstances() {
		return (EReference)hwPlatformInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstance_CommunicationResources() {
		return (EReference)hwPlatformInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstance_HwplatformInstances() {
		return (EReference)hwPlatformInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstance_DerivedBridges() {
		return (EReference)hwPlatformInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstance_DelegationPorts() {
		return (EReference)hwPlatformInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstance_Delegations() {
		return (EReference)hwPlatformInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHWPlatformInstanceConfiguration() {
		return hwPlatformInstanceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstanceConfiguration_HwplatformInstances() {
		return (EReference)hwPlatformInstanceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstanceConfiguration_CommunicationMedia() {
		return (EReference)hwPlatformInstanceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatforminstanceFactory getPlatforminstanceFactory() {
		return (PlatforminstanceFactory)getEFactoryInstance();
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
		hwPlatformInstanceEClass = createEClass(HW_PLATFORM_INSTANCE);
		createEReference(hwPlatformInstanceEClass, HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE);
		createEReference(hwPlatformInstanceEClass, HW_PLATFORM_INSTANCE__RESOURCE_INSTANCES);
		createEReference(hwPlatformInstanceEClass, HW_PLATFORM_INSTANCE__COMMUNICATION_RESOURCES);
		createEReference(hwPlatformInstanceEClass, HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES);
		createEReference(hwPlatformInstanceEClass, HW_PLATFORM_INSTANCE__DERIVED_BRIDGES);
		createEReference(hwPlatformInstanceEClass, HW_PLATFORM_INSTANCE__DELEGATION_PORTS);
		createEReference(hwPlatformInstanceEClass, HW_PLATFORM_INSTANCE__DELEGATIONS);

		hwPlatformInstanceConfigurationEClass = createEClass(HW_PLATFORM_INSTANCE_CONFIGURATION);
		createEReference(hwPlatformInstanceConfigurationEClass, HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES);
		createEReference(hwPlatformInstanceConfigurationEClass, HW_PLATFORM_INSTANCE_CONFIGURATION__COMMUNICATION_MEDIA);
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
		PlatformPackage thePlatformPackage = (PlatformPackage)EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hwPlatformInstanceEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		hwPlatformInstanceConfigurationEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		hwPlatformInstanceConfigurationEClass.getESuperTypes().add(theCorePackage.getCommentableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(hwPlatformInstanceEClass, HWPlatformInstance.class, "HWPlatformInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPlatformInstance_HwplatformType(), thePlatformPackage.getHWPlatform(), null, "hwplatformType", null, 1, 1, HWPlatformInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstance_ResourceInstances(), thePlatformPackage.getResourceInstance(), null, "resourceInstances", null, 0, -1, HWPlatformInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstance_CommunicationResources(), thePlatformPackage.getCommunicationResource(), null, "communicationResources", null, 0, -1, HWPlatformInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstance_HwplatformInstances(), this.getHWPlatformInstance(), null, "hwplatformInstances", null, 0, -1, HWPlatformInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstance_DerivedBridges(), thePlatformPackage.getBridge(), null, "derivedBridges", null, 0, -1, HWPlatformInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstance_DelegationPorts(), thePlatformPackage.getHWPortPart(), null, "delegationPorts", null, 0, -1, HWPlatformInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstance_Delegations(), thePlatformPackage.getDelegation(), null, "delegations", null, 0, -1, HWPlatformInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPlatformInstanceConfigurationEClass, HWPlatformInstanceConfiguration.class, "HWPlatformInstanceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPlatformInstanceConfiguration_HwplatformInstances(), this.getHWPlatformInstance(), null, "hwplatformInstances", null, 0, -1, HWPlatformInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstanceConfiguration_CommunicationMedia(), thePlatformPackage.getCommunicationMedia(), null, "communicationMedia", null, 0, -1, HWPlatformInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
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
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "This package contains all classes of the Platform Instance Viewpoint.\n"
		   });		
		addAnnotation
		  (hwPlatformInstanceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a hardware platform at instance level. "
		   });		
		addAnnotation
		  (getHWPlatformInstance_HwplatformType(), 
		   source, 
		   new String[] {
			 "documentation", "The HWPlatform type of which this instance is derived."
		   });		
		addAnnotation
		  (getHWPlatformInstance_ResourceInstances(), 
		   source, 
		   new String[] {
			 "documentation", "The ResourceInstances that belong to this HWPlatformInstance."
		   });		
		addAnnotation
		  (getHWPlatformInstance_CommunicationResources(), 
		   source, 
		   new String[] {
			 "documentation", "The CommunicationResources that belong to this HWPlatformInstance."
		   });		
		addAnnotation
		  (getHWPlatformInstance_HwplatformInstances(), 
		   source, 
		   new String[] {
			 "documentation", "The HWPlatformInstances that are embedded in this HWPlatformInstance."
		   });			
		addAnnotation
		  (getHWPlatformInstance_DerivedBridges(), 
		   source, 
		   new String[] {
			 "documentation", "The derived Bridges of this HWPlatformInstance. \nThe Bridges are used to connect different HWPlatformInstances via CommunicationMedia."
		   });		
		addAnnotation
		  (getHWPlatformInstance_DelegationPorts(), 
		   source, 
		   new String[] {
			 "documentation", "The delegation ports of this HWPlatformInstance. They are derived from the HWPlatform type."
		   });		
		addAnnotation
		  (getHWPlatformInstance_Delegations(), 
		   source, 
		   new String[] {
			 "documentation", "The delegations of this HWPlatformInstance. They are derived from is HWPlatform type."
		   });		
		addAnnotation
		  (hwPlatformInstanceConfigurationEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a HWPlatformInstanceConfiguration.\nA HWPlatformInstanceConfiguration consists of several HWPlatformInstances.\nThe HWPlatformInstances might be connected via different CommunicationMedia."
		   });		
		addAnnotation
		  (getHWPlatformInstanceConfiguration_HwplatformInstances(), 
		   source, 
		   new String[] {
			 "documentation", "The set of HWPlatformInstances of this HWPlatformInstanceConfiguration."
		   });		
		addAnnotation
		  (getHWPlatformInstanceConfiguration_CommunicationMedia(), 
		   source, 
		   new String[] {
			 "documentation", "The CommunicationMedia of this HWPlatformInstanceConfiguration. \nThe CommunicationMedia are used to connect different HWPlatformInstances via their Bridges or HWPortInstances."
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
		  (getHWPlatformInstance_DerivedBridges(), 
		   source, 
		   new String[] {
			 "derivation", "if (not self.hwplatformType.oclIsUndefined()) then\n\tself.communicationResources->select(c|c.oclIsTypeOf(platform::Bridge)).oclAsType(platform::Bridge)->asOrderedSet()\nelse\tOrderedSet {}\nendif"
		   });						
	}

} //PlatforminstancePackageImpl
