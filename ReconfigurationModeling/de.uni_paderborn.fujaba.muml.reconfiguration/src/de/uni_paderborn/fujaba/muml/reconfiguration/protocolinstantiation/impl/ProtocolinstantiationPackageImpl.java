/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.StorydiagramsPackage;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.expression.ExpressionPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ExpressionPackageImpl;
import de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPackageImpl;
import de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPort;
import de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPortKind;
import de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPortSpecification;
import de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.DiscoveryPortSpecification;
import de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolInstantiationPortSpecification;
import de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationFactory;
import de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructdatatypePackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.impl.StructdatatypePackageImpl;
import de.uni_paderborn.fujaba.muml.types.TypesPackage;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtocolinstantiationPackageImpl extends EPackageImpl implements ProtocolinstantiationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass broadcastPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass broadcastPortSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolInstantiationPortSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discoveryPortSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum broadcastPortKindEEnum = null;

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
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProtocolinstantiationPackageImpl() {
		super(eNS_URI, ProtocolinstantiationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProtocolinstantiationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProtocolinstantiationPackage init() {
		if (isInited) return (ProtocolinstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(ProtocolinstantiationPackage.eNS_URI);

		// Obtain or create and register package
		ProtocolinstantiationPackageImpl theProtocolinstantiationPackage = (ProtocolinstantiationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProtocolinstantiationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProtocolinstantiationPackageImpl());

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
		StorydiagramsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ReconfigurationPackageImpl theReconfigurationPackage = (ReconfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI) instanceof ReconfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI) : ReconfigurationPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);
		StructdatatypePackageImpl theStructdatatypePackage = (StructdatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructdatatypePackage.eNS_URI) instanceof StructdatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructdatatypePackage.eNS_URI) : StructdatatypePackage.eINSTANCE);

		// Create package meta-data objects
		theProtocolinstantiationPackage.createPackageContents();
		theReconfigurationPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theStructdatatypePackage.createPackageContents();

		// Initialize created meta-data
		theProtocolinstantiationPackage.initializePackageContents();
		theReconfigurationPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theStructdatatypePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProtocolinstantiationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProtocolinstantiationPackage.eNS_URI, theProtocolinstantiationPackage);
		return theProtocolinstantiationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroadcastPort() {
		return broadcastPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroadcastPort_Specification() {
		return (EReference)broadcastPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBroadcastPort_Kind() {
		return (EAttribute)broadcastPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroadcastPortSpecification() {
		return broadcastPortSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolInstantiationPortSpecification() {
		return protocolInstantiationPortSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscoveryPortSpecification() {
		return discoveryPortSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBroadcastPortKind() {
		return broadcastPortKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolinstantiationFactory getProtocolinstantiationFactory() {
		return (ProtocolinstantiationFactory)getEFactoryInstance();
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
		broadcastPortEClass = createEClass(BROADCAST_PORT);
		createEReference(broadcastPortEClass, BROADCAST_PORT__SPECIFICATION);
		createEAttribute(broadcastPortEClass, BROADCAST_PORT__KIND);

		broadcastPortSpecificationEClass = createEClass(BROADCAST_PORT_SPECIFICATION);

		protocolInstantiationPortSpecificationEClass = createEClass(PROTOCOL_INSTANTIATION_PORT_SPECIFICATION);

		discoveryPortSpecificationEClass = createEClass(DISCOVERY_PORT_SPECIFICATION);

		// Create enums
		broadcastPortKindEEnum = createEEnum(BROADCAST_PORT_KIND);
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
		ConnectorPackage theConnectorPackage = (ConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		broadcastPortEClass.getESuperTypes().add(theComponentPackage.getPort());
		broadcastPortEClass.getESuperTypes().add(theConnectorPackage.getDiscreteInteractionEndpoint());
		broadcastPortSpecificationEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		protocolInstantiationPortSpecificationEClass.getESuperTypes().add(this.getBroadcastPortSpecification());
		discoveryPortSpecificationEClass.getESuperTypes().add(this.getBroadcastPortSpecification());

		// Initialize classes, features, and operations; add parameters
		initEClass(broadcastPortEClass, BroadcastPort.class, "BroadcastPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBroadcastPort_Specification(), this.getBroadcastPortSpecification(), null, "specification", null, 1, 1, BroadcastPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBroadcastPort_Kind(), this.getBroadcastPortKind(), "kind", "DISCOVERY", 1, 1, BroadcastPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(broadcastPortSpecificationEClass, BroadcastPortSpecification.class, "BroadcastPortSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protocolInstantiationPortSpecificationEClass, ProtocolInstantiationPortSpecification.class, "ProtocolInstantiationPortSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discoveryPortSpecificationEClass, DiscoveryPortSpecification.class, "DiscoveryPortSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(broadcastPortKindEEnum, BroadcastPortKind.class, "BroadcastPortKind");
		addEEnumLiteral(broadcastPortKindEEnum, BroadcastPortKind.DISCOVERY);
		addEEnumLiteral(broadcastPortKindEEnum, BroadcastPortKind.PROTOCOL_INSTANTIATION);

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

} //ProtocolinstantiationPackageImpl
