/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.connector.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.pim.PimPackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.impl.BehaviorPackageImpl;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.impl.ComponentPackageImpl;
import org.muml.pim.connector.BufferOverflowAvoidanceStrategy;
import org.muml.pim.connector.Connector;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pim.connector.ConnectorFactory;
import org.muml.pim.connector.ConnectorInstance;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.connector.DiscreteInteractionEndpointInstance;
import org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance;
import org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance;
import org.muml.pim.connector.MessageBuffer;
import org.muml.pim.connector.util.ConnectorValidator;
import org.muml.pim.constraint.ConstraintPackage;
import org.muml.pim.constraint.impl.ConstraintPackageImpl;
import org.muml.pim.impl.PimPackageImpl;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.instance.impl.InstancePackageImpl;
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
public class ConnectorPackageImpl extends EPackageImpl implements ConnectorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEndpointInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteInteractionEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteInteractionEndpointInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteSingleInteractionEndpointInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteMultiInteractionEndpointInstanceEClass = null;

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
	private EEnum bufferOverflowAvoidanceStrategyEEnum = null;

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
	 * @see org.muml.pim.connector.ConnectorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConnectorPackageImpl() {
		super(eNS_URI, ConnectorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConnectorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConnectorPackage init() {
		if (isInited) return (ConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);

		// Obtain or create and register package
		ConnectorPackageImpl theConnectorPackage = (ConnectorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConnectorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConnectorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PimPackageImpl thePimPackage = (PimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PimPackage.eNS_URI) instanceof PimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PimPackage.eNS_URI) : PimPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		ProtocolPackageImpl theProtocolPackage = (ProtocolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) instanceof ProtocolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI) : ProtocolPackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		One_to_n_schemataPackageImpl theOne_to_n_schemataPackage = (One_to_n_schemataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(One_to_n_schemataPackage.eNS_URI) instanceof One_to_n_schemataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(One_to_n_schemataPackage.eNS_URI) : One_to_n_schemataPackage.eINSTANCE);
		MsgtypePackageImpl theMsgtypePackage = (MsgtypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) instanceof MsgtypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI) : MsgtypePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ValuetypePackageImpl theValuetypePackage = (ValuetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) instanceof ValuetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI) : ValuetypePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
		PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
		RunnablePackageImpl theRunnablePackage = (RunnablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RunnablePackage.eNS_URI) instanceof RunnablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RunnablePackage.eNS_URI) : RunnablePackage.eINSTANCE);

		// Create package meta-data objects
		theConnectorPackage.createPackageContents();
		thePimPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theProtocolPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theOne_to_n_schemataPackage.createPackageContents();
		theMsgtypePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theValuetypePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		thePatternPackage.createPackageContents();
		theRunnablePackage.createPackageContents();

		// Initialize created meta-data
		theConnectorPackage.initializePackageContents();
		thePimPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theProtocolPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theOne_to_n_schemataPackage.initializePackageContents();
		theMsgtypePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theValuetypePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		thePatternPackage.initializePackageContents();
		theRunnablePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theConnectorPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ConnectorValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theConnectorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConnectorPackage.eNS_URI, theConnectorPackage);
		return theConnectorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorEndpoint() {
		return connectorEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorEndpoint_Connectors() {
		return (EReference)connectorEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_ConnectorEndpoints() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SelfConnector() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorEndpointInstance() {
		return connectorEndpointInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorEndpointInstance_ConnectorInstances() {
		return (EReference)connectorEndpointInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorEndpointInstance_Type() {
		return (EReference)connectorEndpointInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorInstance() {
		return connectorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorInstance_Type() {
		return (EReference)connectorInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorInstance_ConnectorEndpointInstances() {
		return (EReference)connectorInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteInteractionEndpoint() {
		return discreteInteractionEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteInteractionEndpoint_SenderMessageTypes() {
		return (EReference)discreteInteractionEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteInteractionEndpoint_ReceiverMessageTypes() {
		return (EReference)discreteInteractionEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteInteractionEndpoint_CoordinatorBehavior() {
		return (EReference)discreteInteractionEndpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteInteractionEndpoint_SubroleBehavior() {
		return (EReference)discreteInteractionEndpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteInteractionEndpoint_Cardinality() {
		return (EReference)discreteInteractionEndpointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteInteractionEndpoint_ReceiverMessageBuffer() {
		return (EReference)discreteInteractionEndpointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteInteractionEndpoint_Multi() {
		return (EAttribute)discreteInteractionEndpointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteInteractionEndpointInstance() {
		return discreteInteractionEndpointInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteSingleInteractionEndpointInstance() {
		return discreteSingleInteractionEndpointInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteSingleInteractionEndpointInstance_MultiInteractionEndpointInstance() {
		return (EReference)discreteSingleInteractionEndpointInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteSingleInteractionEndpointInstance_Next() {
		return (EReference)discreteSingleInteractionEndpointInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteSingleInteractionEndpointInstance_Previous() {
		return (EReference)discreteSingleInteractionEndpointInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteSingleInteractionEndpointInstance_First() {
		return (EReference)discreteSingleInteractionEndpointInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteSingleInteractionEndpointInstance_Last() {
		return (EReference)discreteSingleInteractionEndpointInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteMultiInteractionEndpointInstance() {
		return discreteMultiInteractionEndpointInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteMultiInteractionEndpointInstance_SubInteractionEndpointInstances() {
		return (EReference)discreteMultiInteractionEndpointInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteMultiInteractionEndpointInstance_First() {
		return (EReference)discreteMultiInteractionEndpointInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteMultiInteractionEndpointInstance_Last() {
		return (EReference)discreteMultiInteractionEndpointInstanceEClass.getEStructuralFeatures().get(2);
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
	public EReference getMessageBuffer_DiscreteInteractionEndpoint() {
		return (EReference)messageBufferEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageBuffer_BufferOverflowAvoidanceStrategy() {
		return (EAttribute)messageBufferEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageBuffer_GmfMessageTypes() {
		return (EReference)messageBufferEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBufferOverflowAvoidanceStrategy() {
		return bufferOverflowAvoidanceStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorFactory getConnectorFactory() {
		return (ConnectorFactory)getEFactoryInstance();
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
		connectorEndpointEClass = createEClass(CONNECTOR_ENDPOINT);
		createEReference(connectorEndpointEClass, CONNECTOR_ENDPOINT__CONNECTORS);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__CONNECTOR_ENDPOINTS);
		createEAttribute(connectorEClass, CONNECTOR__SELF_CONNECTOR);

		connectorEndpointInstanceEClass = createEClass(CONNECTOR_ENDPOINT_INSTANCE);
		createEReference(connectorEndpointInstanceEClass, CONNECTOR_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES);
		createEReference(connectorEndpointInstanceEClass, CONNECTOR_ENDPOINT_INSTANCE__TYPE);

		connectorInstanceEClass = createEClass(CONNECTOR_INSTANCE);
		createEReference(connectorInstanceEClass, CONNECTOR_INSTANCE__TYPE);
		createEReference(connectorInstanceEClass, CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES);

		discreteInteractionEndpointEClass = createEClass(DISCRETE_INTERACTION_ENDPOINT);
		createEReference(discreteInteractionEndpointEClass, DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES);
		createEReference(discreteInteractionEndpointEClass, DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES);
		createEReference(discreteInteractionEndpointEClass, DISCRETE_INTERACTION_ENDPOINT__COORDINATOR_BEHAVIOR);
		createEReference(discreteInteractionEndpointEClass, DISCRETE_INTERACTION_ENDPOINT__SUBROLE_BEHAVIOR);
		createEReference(discreteInteractionEndpointEClass, DISCRETE_INTERACTION_ENDPOINT__CARDINALITY);
		createEReference(discreteInteractionEndpointEClass, DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER);
		createEAttribute(discreteInteractionEndpointEClass, DISCRETE_INTERACTION_ENDPOINT__MULTI);

		discreteInteractionEndpointInstanceEClass = createEClass(DISCRETE_INTERACTION_ENDPOINT_INSTANCE);

		discreteSingleInteractionEndpointInstanceEClass = createEClass(DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE);
		createEReference(discreteSingleInteractionEndpointInstanceEClass, DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE);
		createEReference(discreteSingleInteractionEndpointInstanceEClass, DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__NEXT);
		createEReference(discreteSingleInteractionEndpointInstanceEClass, DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__PREVIOUS);
		createEReference(discreteSingleInteractionEndpointInstanceEClass, DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__FIRST);
		createEReference(discreteSingleInteractionEndpointInstanceEClass, DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__LAST);

		discreteMultiInteractionEndpointInstanceEClass = createEClass(DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE);
		createEReference(discreteMultiInteractionEndpointInstanceEClass, DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES);
		createEReference(discreteMultiInteractionEndpointInstanceEClass, DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__FIRST);
		createEReference(discreteMultiInteractionEndpointInstanceEClass, DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__LAST);

		messageBufferEClass = createEClass(MESSAGE_BUFFER);
		createEReference(messageBufferEClass, MESSAGE_BUFFER__BUFFER_SIZE);
		createEReference(messageBufferEClass, MESSAGE_BUFFER__MESSAGE_TYPE);
		createEReference(messageBufferEClass, MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT);
		createEAttribute(messageBufferEClass, MESSAGE_BUFFER__BUFFER_OVERFLOW_AVOIDANCE_STRATEGY);
		createEReference(messageBufferEClass, MESSAGE_BUFFER__GMF_MESSAGE_TYPES);

		// Create enums
		bufferOverflowAvoidanceStrategyEEnum = createEEnum(BUFFER_OVERFLOW_AVOIDANCE_STRATEGY);
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
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		MsgtypePackage theMsgtypePackage = (MsgtypePackage)EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		connectorEndpointEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		connectorEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		connectorEndpointInstanceEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		connectorEndpointInstanceEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		connectorInstanceEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		discreteInteractionEndpointEClass.getESuperTypes().add(this.getConnectorEndpoint());
		discreteInteractionEndpointEClass.getESuperTypes().add(theBehaviorPackage.getBehavioralElement());
		discreteInteractionEndpointEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		discreteInteractionEndpointInstanceEClass.getESuperTypes().add(this.getConnectorEndpointInstance());
		discreteSingleInteractionEndpointInstanceEClass.getESuperTypes().add(this.getDiscreteInteractionEndpointInstance());
		discreteMultiInteractionEndpointInstanceEClass.getESuperTypes().add(this.getDiscreteInteractionEndpointInstance());
		messageBufferEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		messageBufferEClass.getESuperTypes().add(theCorePackage.getCommentableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(connectorEndpointEClass, ConnectorEndpoint.class, "ConnectorEndpoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorEndpoint_Connectors(), this.getConnector(), this.getConnector_ConnectorEndpoints(), "connectors", null, 0, -1, ConnectorEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_ConnectorEndpoints(), this.getConnectorEndpoint(), this.getConnectorEndpoint_Connectors(), "connectorEndpoints", null, 1, 2, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SelfConnector(), ecorePackage.getEBoolean(), "selfConnector", null, 1, 1, Connector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(connectorEndpointInstanceEClass, ConnectorEndpointInstance.class, "ConnectorEndpointInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorEndpointInstance_ConnectorInstances(), this.getConnectorInstance(), this.getConnectorInstance_ConnectorEndpointInstances(), "connectorInstances", null, 0, -1, ConnectorEndpointInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorEndpointInstance_Type(), this.getConnectorEndpoint(), null, "type", null, 1, 1, ConnectorEndpointInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorInstanceEClass, ConnectorInstance.class, "ConnectorInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorInstance_Type(), this.getConnector(), null, "type", null, 0, 1, ConnectorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorInstance_ConnectorEndpointInstances(), this.getConnectorEndpointInstance(), this.getConnectorEndpointInstance_ConnectorInstances(), "connectorEndpointInstances", null, 2, 2, ConnectorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discreteInteractionEndpointEClass, DiscreteInteractionEndpoint.class, "DiscreteInteractionEndpoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscreteInteractionEndpoint_SenderMessageTypes(), theMsgtypePackage.getMessageType(), null, "senderMessageTypes", null, 0, -1, DiscreteInteractionEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscreteInteractionEndpoint_ReceiverMessageTypes(), theMsgtypePackage.getMessageType(), null, "receiverMessageTypes", null, 0, -1, DiscreteInteractionEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscreteInteractionEndpoint_CoordinatorBehavior(), theBehaviorPackage.getBehavior(), null, "coordinatorBehavior", null, 0, 1, DiscreteInteractionEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscreteInteractionEndpoint_SubroleBehavior(), theBehaviorPackage.getBehavior(), null, "subroleBehavior", null, 0, 1, DiscreteInteractionEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscreteInteractionEndpoint_Cardinality(), theValuetypePackage.getCardinality(), null, "cardinality", null, 1, 1, DiscreteInteractionEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscreteInteractionEndpoint_ReceiverMessageBuffer(), this.getMessageBuffer(), this.getMessageBuffer_DiscreteInteractionEndpoint(), "receiverMessageBuffer", null, 0, -1, DiscreteInteractionEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteInteractionEndpoint_Multi(), ecorePackage.getEBoolean(), "multi", "false", 1, 1, DiscreteInteractionEndpoint.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(discreteInteractionEndpointInstanceEClass, DiscreteInteractionEndpointInstance.class, "DiscreteInteractionEndpointInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discreteSingleInteractionEndpointInstanceEClass, DiscreteSingleInteractionEndpointInstance.class, "DiscreteSingleInteractionEndpointInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscreteSingleInteractionEndpointInstance_MultiInteractionEndpointInstance(), this.getDiscreteMultiInteractionEndpointInstance(), this.getDiscreteMultiInteractionEndpointInstance_SubInteractionEndpointInstances(), "multiInteractionEndpointInstance", null, 0, 1, DiscreteSingleInteractionEndpointInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscreteSingleInteractionEndpointInstance_Next(), this.getDiscreteSingleInteractionEndpointInstance(), this.getDiscreteSingleInteractionEndpointInstance_Previous(), "next", null, 0, 1, DiscreteSingleInteractionEndpointInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscreteSingleInteractionEndpointInstance_Previous(), this.getDiscreteSingleInteractionEndpointInstance(), this.getDiscreteSingleInteractionEndpointInstance_Next(), "previous", null, 0, 1, DiscreteSingleInteractionEndpointInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscreteSingleInteractionEndpointInstance_First(), this.getDiscreteSingleInteractionEndpointInstance(), null, "first", null, 0, 1, DiscreteSingleInteractionEndpointInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDiscreteSingleInteractionEndpointInstance_Last(), this.getDiscreteSingleInteractionEndpointInstance(), null, "last", null, 0, 1, DiscreteSingleInteractionEndpointInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(discreteMultiInteractionEndpointInstanceEClass, DiscreteMultiInteractionEndpointInstance.class, "DiscreteMultiInteractionEndpointInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscreteMultiInteractionEndpointInstance_SubInteractionEndpointInstances(), this.getDiscreteSingleInteractionEndpointInstance(), this.getDiscreteSingleInteractionEndpointInstance_MultiInteractionEndpointInstance(), "subInteractionEndpointInstances", null, 0, -1, DiscreteMultiInteractionEndpointInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscreteMultiInteractionEndpointInstance_First(), this.getDiscreteSingleInteractionEndpointInstance(), null, "first", null, 0, 1, DiscreteMultiInteractionEndpointInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscreteMultiInteractionEndpointInstance_Last(), this.getDiscreteSingleInteractionEndpointInstance(), null, "last", null, 0, 1, DiscreteMultiInteractionEndpointInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageBufferEClass, MessageBuffer.class, "MessageBuffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageBuffer_BufferSize(), theValuetypePackage.getNaturalNumber(), null, "bufferSize", null, 1, 1, MessageBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageBuffer_MessageType(), theMsgtypePackage.getMessageType(), null, "messageType", null, 1, -1, MessageBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageBuffer_DiscreteInteractionEndpoint(), this.getDiscreteInteractionEndpoint(), this.getDiscreteInteractionEndpoint_ReceiverMessageBuffer(), "discreteInteractionEndpoint", null, 0, 1, MessageBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageBuffer_BufferOverflowAvoidanceStrategy(), this.getBufferOverflowAvoidanceStrategy(), "bufferOverflowAvoidanceStrategy", "discard incoming message", 1, 1, MessageBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageBuffer_GmfMessageTypes(), theMsgtypePackage.getMessageType(), null, "gmfMessageTypes", null, 1, -1, MessageBuffer.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bufferOverflowAvoidanceStrategyEEnum, BufferOverflowAvoidanceStrategy.class, "BufferOverflowAvoidanceStrategy");
		addEEnumLiteral(bufferOverflowAvoidanceStrategyEEnum, BufferOverflowAvoidanceStrategy.DISCARD_INCOMING_MESSAGE);
		addEEnumLiteral(bufferOverflowAvoidanceStrategyEEnum, BufferOverflowAvoidanceStrategy.DISCARD_OLDEST_MESSAGE_IN_BUFFER);
		addEEnumLiteral(bufferOverflowAvoidanceStrategyEEnum, BufferOverflowAvoidanceStrategy.NEVER_HAPPENS);

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
		  (discreteInteractionEndpointEClass, 
		   source, 
		   new String[] {
			 "constraints", "ReceivingInteractionEndpointRequiresMessageBuffer ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer SetEitherSubRoleAndCoordinatorBehaviorOrNone"
		   });	
		addAnnotation
		  (discreteSingleInteractionEndpointInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "StandaloneSingleEndpointInstanceRequiresSingleEndpointType"
		   });	
		addAnnotation
		  (discreteMultiInteractionEndpointInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "TypeIsMultiDiscreteInteractionEndpoint NumberOfsubEndpointsCorrespondsToLowerBound NumberOfsubEndpointsCorrespondsToUpperBound"
		   });	
		addAnnotation
		  (messageBufferEClass, 
		   source, 
		   new String[] {
			 "constraints", "DiscreteInteractionEndpointMustBeSet"
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
		  (getConnector_SelfConnector(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpoints->size() = 1\r\n-- author: bingo, cgerking, see MUML #872"
		   });	
		addAnnotation
		  (discreteInteractionEndpointEClass, 
		   source, 
		   new String[] {
			 "ReceivingInteractionEndpointRequiresMessageBuffer", "-- All receiver message types must be assigned to one receiver message buffer.\r\nself.receiverMessageTypes->notEmpty() \r\nimplies \r\nself.receiverMessageBuffer->notEmpty()",
			 "ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer", "-- Each receiver message type should be assigned to exactly one buffer.\r\nself.receiverMessageTypes->forAll(type | self.receiverMessageBuffer->one(messageType->includes(type)))",
			 "SetEitherSubRoleAndCoordinatorBehaviorOrNone", "-- Set either the subroleBehavior and the coordinatorBehavior or none of them.\r\n(not self.coordinatorBehavior.oclIsUndefined() and not  self.subroleBehavior.oclIsUndefined()) xor (self.coordinatorBehavior.oclIsUndefined() and self.subroleBehavior.oclIsUndefined())"
		   });	
		addAnnotation
		  (getDiscreteInteractionEndpoint_Multi(), 
		   source, 
		   new String[] {
			 "derivation", "if not (self.cardinality.oclIsUndefined()) then\r\n\t(self.cardinality.upperBound.value > 1) or self.cardinality.upperBound.infinity\r\nelse\r\n\tfalse\r\nendif\r\n\r\n"
		   });	
		addAnnotation
		  (discreteSingleInteractionEndpointInstanceEClass, 
		   source, 
		   new String[] {
			 "StandaloneSingleEndpointInstanceRequiresSingleEndpointType", "-- For a DiscreteSingleInteractionEndpointInstance the type has to be a single DiscreteInteractionEndpoint, too.\n(not self.type.oclIsUndefined() and self.multiInteractionEndpointInstance.oclIsUndefined() and self.type.oclIsKindOf(connector::DiscreteInteractionEndpoint)) implies (not self.type.oclAsType(connector::DiscreteInteractionEndpoint).multi)\n-- adann"
		   });	
		addAnnotation
		  (getDiscreteSingleInteractionEndpointInstance_First(), 
		   source, 
		   new String[] {
			 "derivation", "if self.multiInteractionEndpointInstance.oclIsUndefined() then null else self.multiInteractionEndpointInstance.first endif"
		   });	
		addAnnotation
		  (getDiscreteSingleInteractionEndpointInstance_Last(), 
		   source, 
		   new String[] {
			 "derivation", "if self.multiInteractionEndpointInstance.oclIsUndefined() then null else self.multiInteractionEndpointInstance.last endif"
		   });	
		addAnnotation
		  (discreteMultiInteractionEndpointInstanceEClass, 
		   source, 
		   new String[] {
			 "TypeIsMultiDiscreteInteractionEndpoint", "-- For a DiscreteMultiInteractionEndpointInstance the type has to be a multi DiscreteInteractionEndpoint, too.\r\n(not self.type.oclIsUndefined() and self.type.oclIsKindOf(connector::DiscreteInteractionEndpoint)) implies (self.type.oclAsType(connector::DiscreteInteractionEndpoint).multi)\r\n-- adann",
			 "NumberOfsubEndpointsCorrespondsToLowerBound", "-- The number of subInteractionEndpointInstances is too low with respect to the cardinality\r\nlet discreteEndpoint : connector::DiscreteInteractionEndpoint= if (self.type.oclIsUndefined() or (not self.type.oclIsKindOf(connector::DiscreteInteractionEndpoint))) then null else self.type.oclAsType(connector::DiscreteInteractionEndpoint) endif in\r\nlet lowerBoundOfsubInteractionEndpointInstance : Integer = if ( discreteEndpoint.oclIsUndefined() or discreteEndpoint.cardinality.lowerBound.infinity) then -1 else discreteEndpoint.cardinality.lowerBound.value endif in\r\nif (lowerBoundOfsubInteractionEndpointInstance <>-1) then self.subInteractionEndpointInstances->size()>=lowerBoundOfsubInteractionEndpointInstance else true endif\r\n-- adann ticket:937",
			 "NumberOfsubEndpointsCorrespondsToUpperBound", "-- The number of subInteractionEndpointInstances is too high with respect to the cardinality\r\nlet discreteEndpoint : connector::DiscreteInteractionEndpoint= if (self.type.oclIsUndefined() or (not self.type.oclIsKindOf(connector::DiscreteInteractionEndpoint))) then null else self.type.oclAsType(connector::DiscreteInteractionEndpoint) endif in\r\nlet upperBoundOfsubInteractionEndpointInstance : Integer = if ( discreteEndpoint.oclIsUndefined() or discreteEndpoint.cardinality.upperBound.infinity) then -1 else discreteEndpoint.cardinality.upperBound.value endif in\r\nif (upperBoundOfsubInteractionEndpointInstance <>-1) then self.subInteractionEndpointInstances->size()<=upperBoundOfsubInteractionEndpointInstance else true endif\r\n-- adann  ticket:937"
		   });	
		addAnnotation
		  (messageBufferEClass, 
		   source, 
		   new String[] {
			 "DiscreteInteractionEndpointMustBeSet", "-- A MessageBuffer must  refer to a DiscreteInteractionEndpoint.\r\nnot self.discreteInteractionEndpoint.oclIsInvalid()"
		   });	
		addAnnotation
		  (getMessageBuffer_GmfMessageTypes(), 
		   source, 
		   new String[] {
			 "derivation", "self.messageType"
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
		  (getDiscreteInteractionEndpoint_CoordinatorBehavior(), 
		   source, 
		   new String[] {
			 "filter", "if(self.behavior.oclIsTypeOf(realtimestatechart::RealtimeStatechart)) then self.behavior.oclAsType(realtimestatechart::RealtimeStatechart)->closure(rtsc| rtsc.states->select(s: realtimestatechart::State|  not s.simple).embeddedStatecharts) else behavior::Behavior.allInstances() endif"
		   });	
		addAnnotation
		  (getDiscreteInteractionEndpoint_SubroleBehavior(), 
		   source, 
		   new String[] {
			 "filter", "if(self.behavior.oclIsTypeOf(realtimestatechart::RealtimeStatechart)) then self.behavior.oclAsType(realtimestatechart::RealtimeStatechart)->closure(rtsc| rtsc.states->select(s: realtimestatechart::State|  not s.simple).embeddedStatecharts ) else behavior::Behavior.allInstances() endif"
		   });
	}

} //ConnectorPackageImpl
