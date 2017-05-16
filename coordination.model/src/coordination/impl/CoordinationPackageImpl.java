/**
 */
package coordination.impl;

import coordination.ConnectorQualityOfServiceAssumptions;
import coordination.CoordinationFactory;
import coordination.CoordinationPackage;
import coordination.CoordinationPattern;
import coordination.CoordinationProtocol;
import coordination.CoordinationSpecification;
import coordination.NamedElement;
import coordination.Role;
import coordination.RoleConnector;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import realtimestatechart.RealtimestatechartPackage;
import realtimestatechart.impl.RealtimestatechartPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinationPackageImpl extends EPackageImpl implements CoordinationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorQualityOfServiceAssumptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationProtocolEClass = null;

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
	 * @see coordination.CoordinationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CoordinationPackageImpl() {
		super(eNS_URI, CoordinationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CoordinationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CoordinationPackage init() {
		if (isInited) return (CoordinationPackage)EPackage.Registry.INSTANCE.getEPackage(CoordinationPackage.eNS_URI);

		// Obtain or create and register package
		CoordinationPackageImpl theCoordinationPackage = (CoordinationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CoordinationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CoordinationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);

		// Create package meta-data objects
		theCoordinationPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();

		// Initialize created meta-data
		theCoordinationPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCoordinationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CoordinationPackage.eNS_URI, theCoordinationPackage);
		return theCoordinationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinationSpecification() {
		return coordinationSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationSpecification_Roles() {
		return (EReference)coordinationSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationSpecification_RoleConnectors() {
		return (EReference)coordinationSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleConnector() {
		return roleConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleConnector_ConnectorQOSAssumptions() {
		return (EReference)roleConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleConnector_Source() {
		return (EReference)roleConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleConnector_Target() {
		return (EReference)roleConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorQualityOfServiceAssumptions() {
		return connectorQualityOfServiceAssumptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorQualityOfServiceAssumptions_MessageLossPossible() {
		return (EAttribute)connectorQualityOfServiceAssumptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorQualityOfServiceAssumptions_PreserveMessageOrder() {
		return (EAttribute)connectorQualityOfServiceAssumptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinationPattern() {
		return coordinationPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinationProtocol() {
		return coordinationProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationFactory getCoordinationFactory() {
		return (CoordinationFactory)getEFactoryInstance();
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
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		coordinationSpecificationEClass = createEClass(COORDINATION_SPECIFICATION);
		createEReference(coordinationSpecificationEClass, COORDINATION_SPECIFICATION__ROLES);
		createEReference(coordinationSpecificationEClass, COORDINATION_SPECIFICATION__ROLE_CONNECTORS);

		roleEClass = createEClass(ROLE);

		roleConnectorEClass = createEClass(ROLE_CONNECTOR);
		createEReference(roleConnectorEClass, ROLE_CONNECTOR__CONNECTOR_QOS_ASSUMPTIONS);
		createEReference(roleConnectorEClass, ROLE_CONNECTOR__SOURCE);
		createEReference(roleConnectorEClass, ROLE_CONNECTOR__TARGET);

		connectorQualityOfServiceAssumptionsEClass = createEClass(CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS);
		createEAttribute(connectorQualityOfServiceAssumptionsEClass, CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE);
		createEAttribute(connectorQualityOfServiceAssumptionsEClass, CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__PRESERVE_MESSAGE_ORDER);

		coordinationPatternEClass = createEClass(COORDINATION_PATTERN);

		coordinationProtocolEClass = createEClass(COORDINATION_PROTOCOL);
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
		RealtimestatechartPackage theRealtimestatechartPackage = (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		coordinationSpecificationEClass.getESuperTypes().add(this.getNamedElement());
		roleEClass.getESuperTypes().add(theRealtimestatechartPackage.getBehavioralElement());
		roleEClass.getESuperTypes().add(this.getNamedElement());
		coordinationPatternEClass.getESuperTypes().add(this.getCoordinationSpecification());
		coordinationProtocolEClass.getESuperTypes().add(this.getCoordinationSpecification());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinationSpecificationEClass, CoordinationSpecification.class, "CoordinationSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationSpecification_Roles(), this.getRole(), null, "roles", null, 0, -1, CoordinationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationSpecification_RoleConnectors(), this.getRoleConnector(), null, "roleConnectors", null, 0, -1, CoordinationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleConnectorEClass, RoleConnector.class, "RoleConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleConnector_ConnectorQOSAssumptions(), this.getConnectorQualityOfServiceAssumptions(), null, "connectorQOSAssumptions", null, 0, 1, RoleConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleConnector_Source(), this.getRole(), null, "source", null, 0, 1, RoleConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleConnector_Target(), this.getRole(), null, "target", null, 0, 1, RoleConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorQualityOfServiceAssumptionsEClass, ConnectorQualityOfServiceAssumptions.class, "ConnectorQualityOfServiceAssumptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectorQualityOfServiceAssumptions_MessageLossPossible(), ecorePackage.getEBoolean(), "messageLossPossible", null, 0, 1, ConnectorQualityOfServiceAssumptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorQualityOfServiceAssumptions_PreserveMessageOrder(), ecorePackage.getEBoolean(), "preserveMessageOrder", null, 0, 1, ConnectorQualityOfServiceAssumptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinationPatternEClass, CoordinationPattern.class, "CoordinationPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coordinationProtocolEClass, CoordinationProtocol.class, "CoordinationProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CoordinationPackageImpl
