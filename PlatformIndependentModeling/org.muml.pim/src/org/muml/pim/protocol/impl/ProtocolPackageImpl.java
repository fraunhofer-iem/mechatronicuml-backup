/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.protocol.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
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
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.instance.impl.InstancePackageImpl;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.msgtype.impl.MsgtypePackageImpl;
import org.muml.pim.pattern.PatternPackage;
import org.muml.pim.pattern.impl.PatternPackageImpl;
import org.muml.pim.protocol.AbstractCoordinationSpecification;
import org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.pim.protocol.ProtocolFactory;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.protocol.Role;
import org.muml.pim.protocol.RoleConnector;
import org.muml.pim.protocol.util.ProtocolValidator;
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
public class ProtocolPackageImpl extends EPackageImpl implements ProtocolPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCoordinationSpecificationEClass = null;

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
	private EClass coordinationProtocolEClass = null;

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
	private EClass connectorQualityOfServiceAssumptionsEClass = null;

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
	 * @see org.muml.pim.protocol.ProtocolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProtocolPackageImpl() {
		super(eNS_URI, ProtocolFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProtocolPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProtocolPackage init() {
		if (isInited) return (ProtocolPackage)EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI);

		// Obtain or create and register package
		ProtocolPackageImpl theProtocolPackage = (ProtocolPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProtocolPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProtocolPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PimPackageImpl thePimPackage = (PimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PimPackage.eNS_URI) instanceof PimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PimPackage.eNS_URI) : PimPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
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
		theProtocolPackage.createPackageContents();
		thePimPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theInstancePackage.createPackageContents();
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
		theProtocolPackage.initializePackageContents();
		thePimPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
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
			(theProtocolPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ProtocolValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theProtocolPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProtocolPackage.eNS_URI, theProtocolPackage);
		return theProtocolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCoordinationSpecification() {
		return abstractCoordinationSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCoordinationSpecification_Roles() {
		return (EReference)abstractCoordinationSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCoordinationSpecification_RoleConnector() {
		return (EReference)abstractCoordinationSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCoordinationSpecification_GmfAbstractCoordinationSpecification() {
		return (EReference)abstractCoordinationSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCoordinationSpecification_GmfMessageBuffers() {
		return (EReference)abstractCoordinationSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCoordinationSpecification_GmfConnectorQualityOfServiceAssumptions() {
		return (EReference)abstractCoordinationSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCoordinationSpecification_AdaptedFromPattern() {
		return (EReference)abstractCoordinationSpecificationEClass.getEStructuralFeatures().get(5);
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
	public EReference getRoleConnector_CoordinationProtocol() {
		return (EReference)roleConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleConnector_ConnectorQualityOfServiceAssumptions() {
		return (EReference)roleConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleConnector_Roles() {
		return (EReference)roleConnectorEClass.getEStructuralFeatures().get(2);
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
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_CoordinationProtocol() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_RoleConnector() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_MultiRole() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(2);
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
	public EReference getConnectorQualityOfServiceAssumptions_MaxMessageDelay() {
		return (EReference)connectorQualityOfServiceAssumptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorQualityOfServiceAssumptions_MessageLossPossible() {
		return (EAttribute)connectorQualityOfServiceAssumptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorQualityOfServiceAssumptions_PreserveMessageOrder() {
		return (EAttribute)connectorQualityOfServiceAssumptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolFactory getProtocolFactory() {
		return (ProtocolFactory)getEFactoryInstance();
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
		abstractCoordinationSpecificationEClass = createEClass(ABSTRACT_COORDINATION_SPECIFICATION);
		createEReference(abstractCoordinationSpecificationEClass, ABSTRACT_COORDINATION_SPECIFICATION__ROLES);
		createEReference(abstractCoordinationSpecificationEClass, ABSTRACT_COORDINATION_SPECIFICATION__ROLE_CONNECTOR);
		createEReference(abstractCoordinationSpecificationEClass, ABSTRACT_COORDINATION_SPECIFICATION__GMF_ABSTRACT_COORDINATION_SPECIFICATION);
		createEReference(abstractCoordinationSpecificationEClass, ABSTRACT_COORDINATION_SPECIFICATION__GMF_MESSAGE_BUFFERS);
		createEReference(abstractCoordinationSpecificationEClass, ABSTRACT_COORDINATION_SPECIFICATION__GMF_CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS);
		createEReference(abstractCoordinationSpecificationEClass, ABSTRACT_COORDINATION_SPECIFICATION__ADAPTED_FROM_PATTERN);

		coordinationProtocolEClass = createEClass(COORDINATION_PROTOCOL);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__COORDINATION_PROTOCOL);
		createEReference(roleEClass, ROLE__ROLE_CONNECTOR);
		createEAttribute(roleEClass, ROLE__MULTI_ROLE);

		roleConnectorEClass = createEClass(ROLE_CONNECTOR);
		createEReference(roleConnectorEClass, ROLE_CONNECTOR__COORDINATION_PROTOCOL);
		createEReference(roleConnectorEClass, ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS);
		createEReference(roleConnectorEClass, ROLE_CONNECTOR__ROLES);

		connectorQualityOfServiceAssumptionsEClass = createEClass(CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS);
		createEReference(connectorQualityOfServiceAssumptionsEClass, CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY);
		createEAttribute(connectorQualityOfServiceAssumptionsEClass, CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE);
		createEAttribute(connectorQualityOfServiceAssumptionsEClass, CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__PRESERVE_MESSAGE_ORDER);
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
		PatternPackage thePatternPackage = (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractCoordinationSpecificationEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		abstractCoordinationSpecificationEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		abstractCoordinationSpecificationEClass.getESuperTypes().add(theConstraintPackage.getVerifiableElement());
		coordinationProtocolEClass.getESuperTypes().add(this.getAbstractCoordinationSpecification());
		roleEClass.getESuperTypes().add(theConnectorPackage.getDiscreteInteractionEndpoint());
		roleEClass.getESuperTypes().add(theTypesPackage.getDataType());
		roleConnectorEClass.getESuperTypes().add(theConnectorPackage.getConnector());
		connectorQualityOfServiceAssumptionsEClass.getESuperTypes().add(theCorePackage.getCommentableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractCoordinationSpecificationEClass, AbstractCoordinationSpecification.class, "AbstractCoordinationSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractCoordinationSpecification_Roles(), this.getRole(), this.getRole_CoordinationProtocol(), "roles", null, 1, 2, AbstractCoordinationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractCoordinationSpecification_RoleConnector(), this.getRoleConnector(), this.getRoleConnector_CoordinationProtocol(), "roleConnector", null, 1, 1, AbstractCoordinationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractCoordinationSpecification_GmfAbstractCoordinationSpecification(), this.getAbstractCoordinationSpecification(), null, "gmfAbstractCoordinationSpecification", null, 0, 1, AbstractCoordinationSpecification.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractCoordinationSpecification_GmfMessageBuffers(), theConnectorPackage.getMessageBuffer(), null, "gmfMessageBuffers", null, 0, -1, AbstractCoordinationSpecification.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractCoordinationSpecification_GmfConnectorQualityOfServiceAssumptions(), this.getConnectorQualityOfServiceAssumptions(), null, "gmfConnectorQualityOfServiceAssumptions", null, 0, 1, AbstractCoordinationSpecification.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractCoordinationSpecification_AdaptedFromPattern(), thePatternPackage.getAbstractCoordinationPattern(), null, "adaptedFromPattern", null, 0, -1, AbstractCoordinationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinationProtocolEClass, CoordinationProtocol.class, "CoordinationProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_CoordinationProtocol(), this.getAbstractCoordinationSpecification(), this.getAbstractCoordinationSpecification_Roles(), "coordinationProtocol", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_RoleConnector(), this.getRoleConnector(), this.getRoleConnector_Roles(), "roleConnector", null, 1, 1, Role.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_MultiRole(), ecorePackage.getEBoolean(), "multiRole", "false", 1, 1, Role.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(roleConnectorEClass, RoleConnector.class, "RoleConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleConnector_CoordinationProtocol(), this.getAbstractCoordinationSpecification(), this.getAbstractCoordinationSpecification_RoleConnector(), "coordinationProtocol", null, 1, 1, RoleConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleConnector_ConnectorQualityOfServiceAssumptions(), this.getConnectorQualityOfServiceAssumptions(), null, "connectorQualityOfServiceAssumptions", null, 1, 1, RoleConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleConnector_Roles(), this.getRole(), this.getRole_RoleConnector(), "roles", null, 2, 2, RoleConnector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(connectorQualityOfServiceAssumptionsEClass, ConnectorQualityOfServiceAssumptions.class, "ConnectorQualityOfServiceAssumptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorQualityOfServiceAssumptions_MaxMessageDelay(), theValuetypePackage.getTimeValue(), null, "maxMessageDelay", null, 1, 1, ConnectorQualityOfServiceAssumptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorQualityOfServiceAssumptions_MessageLossPossible(), ecorePackage.getEBoolean(), "messageLossPossible", "false", 1, 1, ConnectorQualityOfServiceAssumptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorQualityOfServiceAssumptions_PreserveMessageOrder(), ecorePackage.getEBoolean(), "preserveMessageOrder", "true", 1, 1, ConnectorQualityOfServiceAssumptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (abstractCoordinationSpecificationEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueRoleNames RoleMessageTypesMustBeCompatible SingleRoleImpliesMultiRole"
		   });	
		addAnnotation
		  (coordinationProtocolEClass, 
		   source, 
		   new String[] {
			 "constraints", "CoordinationProtocolNamesMustBeUnique"
		   });	
		addAnnotation
		  (roleEClass, 
		   source, 
		   new String[] {
			 "constraints", "RoleRequiresBehavior RoleRequiresMessageTypes MultiRoleRequiresSubroleBehaviorAndCoordinatorBehavior"
		   });	
		addAnnotation
		  (roleConnectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "OnlyRolesOfSameCoordinationProtocol"
		   });	
		addAnnotation
		  (connectorQualityOfServiceAssumptionsEClass, 
		   source, 
		   new String[] {
			 "constraints", "PreserveMessageOrderIsTrueWhenConnectorIsReliable"
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
		  (abstractCoordinationSpecificationEClass, 
		   source, 
		   new String[] {
			 "UniqueRoleNames", "-- Names of roles must be unique\nself.roles->isUnique(name)",
			 "RoleMessageTypesMustBeCompatible", "-- Every Role must have the senderMessageTypes of all other Roles set as receiverMessageTypes\r\nself.roles->forAll(role1 : Role, role2 : Role |\r\n   role1 <> role2\r\n   implies\r\n   role1.senderMessageTypes->asSet() = role2.receiverMessageTypes->asSet()\r\n)",
			 "SingleRoleImpliesMultiRole", "-- Only one role exists, so it must be a Multi Role.\r\nself.roles->size() = 1 implies self.roles->any(true).multiRole"
		   });	
		addAnnotation
		  (getAbstractCoordinationSpecification_GmfAbstractCoordinationSpecification(), 
		   source, 
		   new String[] {
			 "derivation", "self"
		   });	
		addAnnotation
		  (getAbstractCoordinationSpecification_GmfMessageBuffers(), 
		   source, 
		   new String[] {
			 "derivation", "roles->collect(receiverMessageBuffer)->asOrderedSet()"
		   });	
		addAnnotation
		  (getAbstractCoordinationSpecification_GmfConnectorQualityOfServiceAssumptions(), 
		   source, 
		   new String[] {
			 "derivation", "if self.roleConnector.connectorQualityOfServiceAssumptions.oclIsInvalid() then\r\n\tnull\r\nelse\r\n\tself.roleConnector.connectorQualityOfServiceAssumptions\r\nendif"
		   });	
		addAnnotation
		  (coordinationProtocolEClass, 
		   source, 
		   new String[] {
			 "CoordinationProtocolNamesMustBeUnique", "-- Coordination Protocols must have unique names\r\nCoordinationProtocol.allInstances()->isUnique(name)"
		   });	
		addAnnotation
		  (roleEClass, 
		   source, 
		   new String[] {
			 "RoleRequiresBehavior", "-- Role requires behavior\nnot self.behavior.oclIsUndefined()",
			 "RoleRequiresMessageTypes", "-- Role requires message types to be set\nself.senderMessageTypes->notEmpty() or self.receiverMessageTypes->notEmpty()",
			 "MultiRoleRequiresSubroleBehaviorAndCoordinatorBehavior", "-- A multiport requires that either all messages in the RTSCs use one-to-many communication schemata or that the references coordinatorBehavior and subroleBehavior are set.\r\n(not self.behavior.oclAsType(realtimestatechart::RealtimeStatechart).usesOneToManyCommunicationSchemata implies self.multiRole = not self.coordinatorBehavior.oclIsUndefined())\r\nand self.coordinatorBehavior.oclIsUndefined() = self.subroleBehavior.oclIsUndefined()"
		   });
		addAnnotation
		  (roleEClass, 
		   new boolean[] { true },
		   "http://www.eclipse.org/emf/2002/GenModel",
		   new String[] {
			 "documentation", "This class represents a role of a coordination protocol. "
		   });	
		addAnnotation
		  (getRole_RoleConnector(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectors->any(c | c.oclIsKindOf(RoleConnector)).oclAsType(RoleConnector)"
		   });	
		addAnnotation
		  (getRole_MultiRole(), 
		   source, 
		   new String[] {
			 "derivation", "self.multi"
		   });	
		addAnnotation
		  (roleConnectorEClass, 
		   source, 
		   new String[] {
			 "OnlyRolesOfSameCoordinationProtocol", "-- Role connector must not connect roles at different coordination protocols\r\nif self.coordinationProtocol.roles->oclIsUndefined() then \r\ntrue\r\nelse\r\nself.coordinationProtocol.roles = self.roles\r\nendif"
		   });	
		addAnnotation
		  (getRoleConnector_Roles(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpoints->select(e | e.oclIsKindOf(Role)).oclAsType(Role)->asOrderedSet()"
		   });	
		addAnnotation
		  (connectorQualityOfServiceAssumptionsEClass, 
		   source, 
		   new String[] {
			 "PreserveMessageOrderIsTrueWhenConnectorIsReliable", "-- Attribute preserveMessageOrder must be true of the connector is reliable (i.e., if no message may be lost).\r\nself.messageLossPossible implies self.preserveMessageOrder"
		   });
		addAnnotation
		  (connectorQualityOfServiceAssumptionsEClass, 
		   new boolean[] { true },
		   "http://www.eclipse.org/emf/2002/GenModel",
		   new String[] {
			 "documentation", "This class represents a role of a coordination protocol. "
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
		  (getAbstractCoordinationSpecification_AdaptedFromPattern(), 
		   source, 
		   new String[] {
			 "filter", "pattern::CoordinationPattern::allInstances()->select(p| not (p = self))"
		   });
	}

} //ProtocolPackageImpl
