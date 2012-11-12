/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.pattern.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.storydiagrams.StorydiagramsPackage;

import de.fujaba.modelinstance.ModelinstancePackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPackageImpl;
import de.uni_paderborn.fujaba.muml.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.model.constraint.impl.ConstraintPackageImpl;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.impl.CorePackageImpl;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentPackageImpl;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.impl.InstancePackageImpl;
import de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage;
import de.uni_paderborn.fujaba.muml.model.msgiface.impl.MsgifacePackageImpl;
import de.uni_paderborn.fujaba.muml.model.pattern.ConnectorQualityOfServiceAssumptions;
import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.model.pattern.DiscreteInteractionPoint;
import de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternFactory;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;
import de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector;
import de.uni_paderborn.fujaba.muml.model.pattern.util.PatternValidator;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternPackageImpl extends EPackageImpl implements PatternPackage {
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
	private EClass coordinationPatternEClass = null;

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
	private EClass messageBufferEClass = null;

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
	private EClass discreteInteractionPointEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatternPackageImpl() {
		super(eNS_URI, PatternFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PatternPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatternPackage init() {
		if (isInited) return (PatternPackage)EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI);

		// Obtain or create and register package
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatternPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelinstancePackage.eINSTANCE.eClass();
		StorydiagramsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		MsgifacePackageImpl theMsgifacePackage = (MsgifacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) instanceof MsgifacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI) : MsgifacePackage.eINSTANCE);
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);

		// Create package meta-data objects
		thePatternPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theMsgifacePackage.createPackageContents();
		theDeploymentPackage.createPackageContents();

		// Initialize created meta-data
		thePatternPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theMsgifacePackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePatternPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PatternValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePatternPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatternPackage.eNS_URI, thePatternPackage);
		return thePatternPackage;
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
	public EReference getRoleConnector_Source() {
		return (EReference)roleConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleConnector_Target() {
		return (EReference)roleConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleConnector_CoordinationPattern() {
		return (EReference)roleConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleConnector_ConnectorQualityOfServiceAssumptions() {
		return (EReference)roleConnectorEClass.getEStructuralFeatures().get(3);
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
	public EReference getCoordinationPattern_Roles() {
		return (EReference)coordinationPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationPattern_Connector() {
		return (EReference)coordinationPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationPattern_Pattern() {
		return (EReference)coordinationPatternEClass.getEStructuralFeatures().get(2);
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
	public EReference getRole_IncomingRoleConnector() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_RoleConnector() {
		return (EReference)roleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_IsMultiRole() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_ReceiverMessageBuffer() {
		return (EReference)roleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageBuffer() {
		return messageBufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageBuffer_BufferSize() {
		return (EReference)messageBufferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageBuffer_MessageType() {
		return (EReference)messageBufferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageBuffer_Role() {
		return (EReference)messageBufferEClass.getEStructuralFeatures().get(2);
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
	public EReference getConnectorQualityOfServiceAssumptions_MinMessageDelay() {
		return (EReference)connectorQualityOfServiceAssumptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorQualityOfServiceAssumptions_MaxMessageDelay() {
		return (EReference)connectorQualityOfServiceAssumptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorQualityOfServiceAssumptions_MessageLossPossible() {
		return (EAttribute)connectorQualityOfServiceAssumptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteInteractionPoint() {
		return discreteInteractionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteInteractionPoint_SenderMessageTypes() {
		return (EReference)discreteInteractionPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteInteractionPoint_ReceiverMessageTypes() {
		return (EReference)discreteInteractionPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteInteractionPoint_AdaptationBehavior() {
		return (EReference)discreteInteractionPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteInteractionPoint_RoleAndAdaptationBehavior() {
		return (EReference)discreteInteractionPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_CoordinationPattern() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Cardinality() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Port() {
		return (EReference)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_OutgoingRoleConnector() {
		return (EReference)roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternFactory getPatternFactory() {
		return (PatternFactory)getEFactoryInstance();
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
		roleConnectorEClass = createEClass(ROLE_CONNECTOR);
		createEReference(roleConnectorEClass, ROLE_CONNECTOR__SOURCE);
		createEReference(roleConnectorEClass, ROLE_CONNECTOR__TARGET);
		createEReference(roleConnectorEClass, ROLE_CONNECTOR__COORDINATION_PATTERN);
		createEReference(roleConnectorEClass, ROLE_CONNECTOR__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS);

		coordinationPatternEClass = createEClass(COORDINATION_PATTERN);
		createEReference(coordinationPatternEClass, COORDINATION_PATTERN__ROLES);
		createEReference(coordinationPatternEClass, COORDINATION_PATTERN__CONNECTOR);
		createEReference(coordinationPatternEClass, COORDINATION_PATTERN__PATTERN);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__INCOMING_ROLE_CONNECTOR);
		createEReference(roleEClass, ROLE__COORDINATION_PATTERN);
		createEReference(roleEClass, ROLE__CARDINALITY);
		createEReference(roleEClass, ROLE__PORT);
		createEReference(roleEClass, ROLE__OUTGOING_ROLE_CONNECTOR);
		createEReference(roleEClass, ROLE__ROLE_CONNECTOR);
		createEAttribute(roleEClass, ROLE__IS_MULTI_ROLE);
		createEReference(roleEClass, ROLE__RECEIVER_MESSAGE_BUFFER);

		messageBufferEClass = createEClass(MESSAGE_BUFFER);
		createEReference(messageBufferEClass, MESSAGE_BUFFER__BUFFER_SIZE);
		createEReference(messageBufferEClass, MESSAGE_BUFFER__MESSAGE_TYPE);
		createEReference(messageBufferEClass, MESSAGE_BUFFER__ROLE);

		connectorQualityOfServiceAssumptionsEClass = createEClass(CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS);
		createEReference(connectorQualityOfServiceAssumptionsEClass, CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MIN_MESSAGE_DELAY);
		createEReference(connectorQualityOfServiceAssumptionsEClass, CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY);
		createEAttribute(connectorQualityOfServiceAssumptionsEClass, CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE);

		discreteInteractionPointEClass = createEClass(DISCRETE_INTERACTION_POINT);
		createEReference(discreteInteractionPointEClass, DISCRETE_INTERACTION_POINT__SENDER_MESSAGE_TYPES);
		createEReference(discreteInteractionPointEClass, DISCRETE_INTERACTION_POINT__RECEIVER_MESSAGE_TYPES);
		createEReference(discreteInteractionPointEClass, DISCRETE_INTERACTION_POINT__ADAPTATION_BEHAVIOR);
		createEReference(discreteInteractionPointEClass, DISCRETE_INTERACTION_POINT__ROLE_AND_ADAPTATION_BEHAVIOR);
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
		org.storydriven.core.CorePackage theCorePackage_1 = (org.storydriven.core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(org.storydriven.core.CorePackage.eNS_URI);
		ComponentPackage theComponentPackage = (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		MsgifacePackage theMsgifacePackage = (MsgifacePackage)EPackage.Registry.INSTANCE.getEPackage(MsgifacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roleConnectorEClass.getESuperTypes().add(theCorePackage.getBehavioralElement());
		coordinationPatternEClass.getESuperTypes().add(theCorePackage_1.getNamedElement());
		coordinationPatternEClass.getESuperTypes().add(theCorePackage.getConstrainableElement());
		roleEClass.getESuperTypes().add(this.getDiscreteInteractionPoint());
		messageBufferEClass.getESuperTypes().add(theCorePackage_1.getNamedElement());
		messageBufferEClass.getESuperTypes().add(theCorePackage_1.getCommentableElement());
		connectorQualityOfServiceAssumptionsEClass.getESuperTypes().add(theCorePackage_1.getNamedElement());
		connectorQualityOfServiceAssumptionsEClass.getESuperTypes().add(theCorePackage_1.getCommentableElement());
		discreteInteractionPointEClass.getESuperTypes().add(theCorePackage.getBehavioralElement());
		discreteInteractionPointEClass.getESuperTypes().add(theCorePackage.getConstrainableElement());
		discreteInteractionPointEClass.getESuperTypes().add(theCorePackage_1.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(roleConnectorEClass, RoleConnector.class, "RoleConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleConnector_Source(), this.getRole(), this.getRole_OutgoingRoleConnector(), "source", null, 1, 1, RoleConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleConnector_Target(), this.getRole(), this.getRole_IncomingRoleConnector(), "target", null, 1, 1, RoleConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleConnector_CoordinationPattern(), this.getCoordinationPattern(), this.getCoordinationPattern_Connector(), "coordinationPattern", null, 1, 1, RoleConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleConnector_ConnectorQualityOfServiceAssumptions(), this.getConnectorQualityOfServiceAssumptions(), null, "connectorQualityOfServiceAssumptions", null, 1, 1, RoleConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinationPatternEClass, CoordinationPattern.class, "CoordinationPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationPattern_Roles(), this.getRole(), this.getRole_CoordinationPattern(), "roles", null, 1, 2, CoordinationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationPattern_Connector(), this.getRoleConnector(), this.getRoleConnector_CoordinationPattern(), "connector", null, 1, 1, CoordinationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationPattern_Pattern(), this.getCoordinationPattern(), null, "pattern", null, 0, 1, CoordinationPattern.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_IncomingRoleConnector(), this.getRoleConnector(), this.getRoleConnector_Target(), "incomingRoleConnector", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_CoordinationPattern(), this.getCoordinationPattern(), this.getCoordinationPattern_Roles(), "coordinationPattern", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Cardinality(), theCorePackage.getCardinality(), null, "cardinality", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Port(), theComponentPackage.getDiscretePort(), theComponentPackage.getDiscretePort_Refines(), "port", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_OutgoingRoleConnector(), this.getRoleConnector(), this.getRoleConnector_Source(), "outgoingRoleConnector", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_RoleConnector(), this.getRoleConnector(), null, "roleConnector", null, 0, 1, Role.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_IsMultiRole(), theEcorePackage.getEBoolean(), "isMultiRole", "", 0, 1, Role.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRole_ReceiverMessageBuffer(), this.getMessageBuffer(), this.getMessageBuffer_Role(), "receiverMessageBuffer", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageBufferEClass, MessageBuffer.class, "MessageBuffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageBuffer_BufferSize(), theCorePackage.getNaturalNumber(), null, "bufferSize", null, 1, 1, MessageBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageBuffer_MessageType(), theMsgifacePackage.getMessageType(), null, "messageType", null, 1, -1, MessageBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageBuffer_Role(), this.getRole(), this.getRole_ReceiverMessageBuffer(), "role", null, 1, 1, MessageBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorQualityOfServiceAssumptionsEClass, ConnectorQualityOfServiceAssumptions.class, "ConnectorQualityOfServiceAssumptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorQualityOfServiceAssumptions_MinMessageDelay(), theCorePackage.getNaturalNumber(), null, "minMessageDelay", null, 1, 1, ConnectorQualityOfServiceAssumptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorQualityOfServiceAssumptions_MaxMessageDelay(), theCorePackage.getNaturalNumber(), null, "maxMessageDelay", null, 1, 1, ConnectorQualityOfServiceAssumptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorQualityOfServiceAssumptions_MessageLossPossible(), theEcorePackage.getEBoolean(), "messageLossPossible", "false", 1, 1, ConnectorQualityOfServiceAssumptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discreteInteractionPointEClass, DiscreteInteractionPoint.class, "DiscreteInteractionPoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscreteInteractionPoint_SenderMessageTypes(), theMsgifacePackage.getMessageType(), null, "senderMessageTypes", null, 0, -1, DiscreteInteractionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscreteInteractionPoint_ReceiverMessageTypes(), theMsgifacePackage.getMessageType(), null, "receiverMessageTypes", null, 0, -1, DiscreteInteractionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscreteInteractionPoint_AdaptationBehavior(), theCorePackage.getBehavior(), null, "adaptationBehavior", null, 0, 1, DiscreteInteractionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscreteInteractionPoint_RoleAndAdaptationBehavior(), theCorePackage.getBehavior(), null, "roleAndAdaptationBehavior", null, 0, 1, DiscreteInteractionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (roleConnectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "OnlyRolesOfSameCoordinationPattern"
		   });								
		addAnnotation
		  (coordinationPatternEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueRoleNames CoordinationPatternNamesMustBeUnique"
		   });								
		addAnnotation
		  (roleEClass, 
		   source, 
		   new String[] {
			 "constraints", "MultiPortRequiresDefinedOrder RoleHasConnector RoleRequiresBehavior RoleRequiresInterface"
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
		  (roleConnectorEClass, 
		   source, 
		   new String[] {
			 "OnlyRolesOfSameCoordinationPattern", "(not source.oclIsUndefined() and not target.oclIsUndefined()) implies source.coordinationPattern = target.coordinationPattern"
		   });								
		addAnnotation
		  (coordinationPatternEClass, 
		   source, 
		   new String[] {
			 "UniqueRoleNames", "self.roles->isUnique(name)",
			 "CoordinationPatternNamesMustBeUnique", "CoordinationPattern.allInstances().name->count(self.name) = 1"
		   });				
		addAnnotation
		  (getCoordinationPattern_Pattern(), 
		   source, 
		   new String[] {
			 "derivation", "self"
		   });					
		addAnnotation
		  (roleEClass, 
		   source, 
		   new String[] {
			 "MultiPortRequiresDefinedOrder", "self.ordered implies (self.cardinality.upperBound.value > 1 or self.cardinality.upperBound.infinity)",
			 "OrderedRequiresIntegerOrderVariable", "self.ordered implies (self.orderVariable->notEmpty() implies self.orderVariable.eAttributeType =\'EInt\')",
			 "RoleHasConnector", "self.incomingRoleConnector->notEmpty() or self.outgoingRoleConnector->notEmpty()",
			 "RoleRequiresBehavior", "not self.behavior.oclIsUndefined()",
			 "RoleRequiresInterface", "not (self.senderMessageInterface.oclIsUndefined() and self.receiverMessageInterface.oclIsUndefined())"
		   });							
		addAnnotation
		  (getRole_RoleConnector(), 
		   source, 
		   new String[] {
			 "derivation", "if self.incomingConnector -> notEmpty() then\r\n\tself.incomingConnector\r\nelse\r\n\tself.outgoingConnector\r\nendif"
		   });			
		addAnnotation
		  (getRole_IsMultiRole(), 
		   source, 
		   new String[] {
			 "derivation", "if not (self.cardinality.oclIsUndefined()) then\r\n\t(self.cardinality.upperBound.value > 1) or self.cardinality.upperBound.infinity\r\nelse\r\n\tfalse\r\nendif"
		   });														
	}

} //PatternPackageImpl
