/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.impl;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;

import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;

import de.uni_paderborn.fujaba.muml.model.core.CorePackage;

import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;

import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;

import de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage;

import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.Executor;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.PartDataType;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.PortDataType;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationController;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationFactory;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPort;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
	private EClass reconfigurationPortEClass = null;

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
	private EClass partDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portDataTypeEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#eNS_URI
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
		CorePackage.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();
		RealtimestatechartPackage.eINSTANCE.eClass();
		MsgifacePackage.eINSTANCE.eClass();
		DeploymentPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theReconfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theReconfigurationPackage.initializePackageContents();

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
	public EReference getReconfigurableStructuredComponent_Controllers() {
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
	public EClass getReconfigurationPort() {
		return reconfigurationPortEClass;
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
	public EReference getReconfigurationController_StructuredComponent() {
		return (EReference)reconfigurationControllerEClass.getEStructuralFeatures().get(0);
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
	public EClass getExecutor() {
		return executorEClass;
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
	public EReference getReconfigurationRule_Parameters() {
		return (EReference)reconfigurationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationRule_ReturnParameters() {
		return (EReference)reconfigurationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartDataType() {
		return partDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartDataType_ComponentPart() {
		return (EReference)partDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortDataType() {
		return portDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortDataType_Port() {
		return (EReference)portDataTypeEClass.getEStructuralFeatures().get(0);
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
		reconfigurableStructuredComponentEClass = createEClass(RECONFIGURABLE_STRUCTURED_COMPONENT);
		createEReference(reconfigurableStructuredComponentEClass, RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLERS);
		createEReference(reconfigurableStructuredComponentEClass, RECONFIGURABLE_STRUCTURED_COMPONENT__MANAGER);
		createEReference(reconfigurableStructuredComponentEClass, RECONFIGURABLE_STRUCTURED_COMPONENT__EXECUTOR);

		reconfigurationPortEClass = createEClass(RECONFIGURATION_PORT);

		reconfigurationControllerEClass = createEClass(RECONFIGURATION_CONTROLLER);
		createEReference(reconfigurationControllerEClass, RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT);

		managerEClass = createEClass(MANAGER);

		executorEClass = createEClass(EXECUTOR);

		reconfigurationRuleEClass = createEClass(RECONFIGURATION_RULE);
		createEReference(reconfigurationRuleEClass, RECONFIGURATION_RULE__PARAMETERS);
		createEReference(reconfigurationRuleEClass, RECONFIGURATION_RULE__RETURN_PARAMETERS);

		partDataTypeEClass = createEClass(PART_DATA_TYPE);
		createEReference(partDataTypeEClass, PART_DATA_TYPE__COMPONENT_PART);

		portDataTypeEClass = createEClass(PORT_DATA_TYPE);
		createEReference(portDataTypeEClass, PORT_DATA_TYPE__PORT);
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
		ComponentPackage theComponentPackage = (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);
		org.storydriven.core.CorePackage theCorePackage_1 = (org.storydriven.core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(org.storydriven.core.CorePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reconfigurableStructuredComponentEClass.getESuperTypes().add(theComponentPackage.getStructuredComponent());
		reconfigurationPortEClass.getESuperTypes().add(theComponentPackage.getPort());
		reconfigurationControllerEClass.getESuperTypes().add(theCorePackage_1.getNamedElement());
		reconfigurationControllerEClass.getESuperTypes().add(theCorePackage_1.getCommentableElement());
		managerEClass.getESuperTypes().add(this.getReconfigurationController());
		executorEClass.getESuperTypes().add(this.getReconfigurationController());
		reconfigurationRuleEClass.getESuperTypes().add(theCorePackage_1.getNamedElement());
		reconfigurationRuleEClass.getESuperTypes().add(theCorePackage_1.getCommentableElement());
		partDataTypeEClass.getESuperTypes().add(theCorePackage.getDataType());
		portDataTypeEClass.getESuperTypes().add(theCorePackage.getDataType());

		// Initialize classes and features; add operations and parameters
		initEClass(reconfigurableStructuredComponentEClass, ReconfigurableStructuredComponent.class, "ReconfigurableStructuredComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurableStructuredComponent_Controllers(), this.getReconfigurationController(), this.getReconfigurationController_StructuredComponent(), "controllers", null, 0, -1, ReconfigurableStructuredComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReconfigurableStructuredComponent_Manager(), this.getManager(), null, "manager", null, 0, 1, ReconfigurableStructuredComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurableStructuredComponent_Executor(), this.getExecutor(), null, "executor", null, 0, 1, ReconfigurableStructuredComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationPortEClass, ReconfigurationPort.class, "ReconfigurationPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reconfigurationControllerEClass, ReconfigurationController.class, "ReconfigurationController", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationController_StructuredComponent(), this.getReconfigurableStructuredComponent(), this.getReconfigurableStructuredComponent_Controllers(), "structuredComponent", null, 1, 1, ReconfigurationController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managerEClass, Manager.class, "Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executorEClass, Executor.class, "Executor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reconfigurationRuleEClass, ReconfigurationRule.class, "ReconfigurationRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationRule_Parameters(), theCorePackage.getParameter(), null, "parameters", null, 0, -1, ReconfigurationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationRule_ReturnParameters(), theCorePackage.getParameter(), null, "returnParameters", null, 0, -1, ReconfigurationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partDataTypeEClass, PartDataType.class, "PartDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartDataType_ComponentPart(), theComponentPackage.getComponentPart(), null, "componentPart", null, 1, 1, PartDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portDataTypeEClass, PortDataType.class, "PortDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortDataType_Port(), theComponentPackage.getPort(), null, "port", null, 1, 1, PortDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getReconfigurableStructuredComponent_Manager(), 
		   source, 
		   new String[] {
			 "derivation", "self.controllers -> select(m | m.oclIsKindOf(Manager)) ->any(true)"
		   });		
		addAnnotation
		  (getReconfigurableStructuredComponent_Executor(), 
		   source, 
		   new String[] {
			 "derivation", "self.controllers -> select(m | m.oclIsKindOf(Executor)) ->any(true)"
		   });					
	}

} //ReconfigurationPackageImpl
