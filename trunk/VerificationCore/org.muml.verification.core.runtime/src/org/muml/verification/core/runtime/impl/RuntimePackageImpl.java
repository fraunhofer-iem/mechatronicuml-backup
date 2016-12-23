/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.runtime.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.pim.PimPackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.types.TypesPackage;
import org.muml.verification.core.runtime.MessageOnConnector;
import org.muml.verification.core.runtime.MultiRoleInstance;
import org.muml.verification.core.runtime.RealtimeStatechartInstance;
import org.muml.verification.core.runtime.RoleInstance;
import org.muml.verification.core.runtime.RuntimeAssemblyConnectorInstance;
import org.muml.verification.core.runtime.RuntimeBehavioralElement;
import org.muml.verification.core.runtime.RuntimeComponentInstance;
import org.muml.verification.core.runtime.RuntimeConnectorInstance;
import org.muml.verification.core.runtime.RuntimeDiscreteInteractionEndpointInstance;
import org.muml.verification.core.runtime.RuntimeDiscreteMultiPortInstance;
import org.muml.verification.core.runtime.RuntimeDiscretePortInstance;
import org.muml.verification.core.runtime.RuntimeDiscreteSinglePortInstance;
import org.muml.verification.core.runtime.RuntimeFactory;
import org.muml.verification.core.runtime.RuntimeMessage;
import org.muml.verification.core.runtime.RuntimeMessageBuffer;
import org.muml.verification.core.runtime.RuntimePackage;
import org.muml.verification.core.runtime.RuntimeParameter;
import org.muml.verification.core.runtime.RuntimeRoleConnectorInstance;
import org.muml.verification.core.runtime.SingleRoleInstance;
import org.muml.verification.core.runtime.VariableBinding;
import org.muml.verification.core.runtime.util.RuntimeValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimePackageImpl extends EPackageImpl implements RuntimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeComponentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeDiscretePortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeMessageBufferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realtimeStatechartInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeBehavioralElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleRoleInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiRoleInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeRoleConnectorInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeConnectorInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeAssemblyConnectorInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageOnConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeDiscreteInteractionEndpointInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeDiscreteSinglePortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeDiscreteMultiPortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaObjectEDataType = null;

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
	 * @see org.muml.verification.core.runtime.RuntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RuntimePackageImpl() {
		super(eNS_URI, RuntimeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RuntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RuntimePackage init() {
		if (isInited) return (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Obtain or create and register package
		RuntimePackageImpl theRuntimePackage = (RuntimePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RuntimePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RuntimePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PimPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRuntimePackage.createPackageContents();

		// Initialize created meta-data
		theRuntimePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRuntimePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RuntimeValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRuntimePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RuntimePackage.eNS_URI, theRuntimePackage);
		return theRuntimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeComponentInstance() {
		return runtimeComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeDiscretePortInstance() {
		return runtimeDiscretePortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleInstance() {
		return roleInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleInstance_Role() {
		return (EReference)roleInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleInstance_Assembly() {
		return (EReference)roleInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeMessageBuffer() {
		return runtimeMessageBufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeMessageBuffer_Messages() {
		return (EReference)runtimeMessageBufferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeMessageBuffer_RuntimeBehavioralElement() {
		return (EReference)runtimeMessageBufferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeMessageBuffer_MessageBuffer() {
		return (EReference)runtimeMessageBufferEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealtimeStatechartInstance() {
		return realtimeStatechartInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_RuntimeBehavioralElement() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_InstanceOf() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_ActiveVertex() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_SubRealtimeStatechartInstances() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_ParentRealtimeStatechartInstance() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_VariableBindings() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_AllAvailableVariableBindings() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_NearestRuntimeBehavioralElement() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartInstance_ActiveTransition() {
		return (EReference)realtimeStatechartInstanceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeMessage() {
		return runtimeMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeMessage_Parameters() {
		return (EReference)runtimeMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeMessage_Type() {
		return (EReference)runtimeMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeParameter() {
		return runtimeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeParameter_Message() {
		return (EReference)runtimeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeParameter_Value() {
		return (EAttribute)runtimeParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeParameter_Parameter() {
		return (EReference)runtimeParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableBinding() {
		return variableBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableBinding_Variable() {
		return (EReference)variableBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableBinding_Value() {
		return (EAttribute)variableBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeBehavioralElement() {
		return runtimeBehavioralElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeBehavioralElement_StatechartInstance() {
		return (EReference)runtimeBehavioralElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeBehavioralElement_MessageBuffer() {
		return (EReference)runtimeBehavioralElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleRoleInstance() {
		return singleRoleInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiRoleInstance() {
		return multiRoleInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeRoleConnectorInstance() {
		return runtimeRoleConnectorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeConnectorInstance() {
		return runtimeConnectorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeConnectorInstance_TransientMessages() {
		return (EReference)runtimeConnectorInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeAssemblyConnectorInstance() {
		return runtimeAssemblyConnectorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageOnConnector() {
		return messageOnConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageOnConnector_Receiver() {
		return (EReference)messageOnConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageOnConnector_Message() {
		return (EReference)messageOnConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageOnConnector_RuntimeConnectorInstance() {
		return (EReference)messageOnConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeDiscreteInteractionEndpointInstance() {
		return runtimeDiscreteInteractionEndpointInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeDiscreteSinglePortInstance() {
		return runtimeDiscreteSinglePortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeDiscreteMultiPortInstance() {
		return runtimeDiscreteMultiPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaObject() {
		return javaObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeFactory getRuntimeFactory() {
		return (RuntimeFactory)getEFactoryInstance();
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
		runtimeComponentInstanceEClass = createEClass(RUNTIME_COMPONENT_INSTANCE);

		runtimeDiscretePortInstanceEClass = createEClass(RUNTIME_DISCRETE_PORT_INSTANCE);

		roleInstanceEClass = createEClass(ROLE_INSTANCE);
		createEReference(roleInstanceEClass, ROLE_INSTANCE__ROLE);
		createEReference(roleInstanceEClass, ROLE_INSTANCE__ASSEMBLY);

		runtimeMessageBufferEClass = createEClass(RUNTIME_MESSAGE_BUFFER);
		createEReference(runtimeMessageBufferEClass, RUNTIME_MESSAGE_BUFFER__MESSAGES);
		createEReference(runtimeMessageBufferEClass, RUNTIME_MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT);
		createEReference(runtimeMessageBufferEClass, RUNTIME_MESSAGE_BUFFER__MESSAGE_BUFFER);

		realtimeStatechartInstanceEClass = createEClass(REALTIME_STATECHART_INSTANCE);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__INSTANCE_OF);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__ACTIVE_VERTEX);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__PARENT_REALTIME_STATECHART_INSTANCE);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__VARIABLE_BINDINGS);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__ALL_AVAILABLE_VARIABLE_BINDINGS);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__NEAREST_RUNTIME_BEHAVIORAL_ELEMENT);
		createEReference(realtimeStatechartInstanceEClass, REALTIME_STATECHART_INSTANCE__ACTIVE_TRANSITION);

		runtimeMessageEClass = createEClass(RUNTIME_MESSAGE);
		createEReference(runtimeMessageEClass, RUNTIME_MESSAGE__PARAMETERS);
		createEReference(runtimeMessageEClass, RUNTIME_MESSAGE__TYPE);

		runtimeParameterEClass = createEClass(RUNTIME_PARAMETER);
		createEReference(runtimeParameterEClass, RUNTIME_PARAMETER__MESSAGE);
		createEAttribute(runtimeParameterEClass, RUNTIME_PARAMETER__VALUE);
		createEReference(runtimeParameterEClass, RUNTIME_PARAMETER__PARAMETER);

		variableBindingEClass = createEClass(VARIABLE_BINDING);
		createEReference(variableBindingEClass, VARIABLE_BINDING__VARIABLE);
		createEAttribute(variableBindingEClass, VARIABLE_BINDING__VALUE);

		runtimeBehavioralElementEClass = createEClass(RUNTIME_BEHAVIORAL_ELEMENT);
		createEReference(runtimeBehavioralElementEClass, RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE);
		createEReference(runtimeBehavioralElementEClass, RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER);

		singleRoleInstanceEClass = createEClass(SINGLE_ROLE_INSTANCE);

		multiRoleInstanceEClass = createEClass(MULTI_ROLE_INSTANCE);

		runtimeRoleConnectorInstanceEClass = createEClass(RUNTIME_ROLE_CONNECTOR_INSTANCE);

		runtimeConnectorInstanceEClass = createEClass(RUNTIME_CONNECTOR_INSTANCE);
		createEReference(runtimeConnectorInstanceEClass, RUNTIME_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES);

		runtimeAssemblyConnectorInstanceEClass = createEClass(RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE);

		messageOnConnectorEClass = createEClass(MESSAGE_ON_CONNECTOR);
		createEReference(messageOnConnectorEClass, MESSAGE_ON_CONNECTOR__RECEIVER);
		createEReference(messageOnConnectorEClass, MESSAGE_ON_CONNECTOR__MESSAGE);
		createEReference(messageOnConnectorEClass, MESSAGE_ON_CONNECTOR__RUNTIME_CONNECTOR_INSTANCE);

		runtimeDiscreteInteractionEndpointInstanceEClass = createEClass(RUNTIME_DISCRETE_INTERACTION_ENDPOINT_INSTANCE);

		runtimeDiscreteSinglePortInstanceEClass = createEClass(RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE);

		runtimeDiscreteMultiPortInstanceEClass = createEClass(RUNTIME_DISCRETE_MULTI_PORT_INSTANCE);

		// Create data types
		javaObjectEDataType = createEDataType(JAVA_OBJECT);
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
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		ProtocolPackage theProtocolPackage = (ProtocolPackage)EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ConnectorPackage theConnectorPackage = (ConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);
		RealtimestatechartPackage theRealtimestatechartPackage = (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);
		MsgtypePackage theMsgtypePackage = (MsgtypePackage)EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		runtimeComponentInstanceEClass.getESuperTypes().add(theInstancePackage.getComponentInstance());
		runtimeComponentInstanceEClass.getESuperTypes().add(this.getRuntimeBehavioralElement());
		runtimeDiscretePortInstanceEClass.getESuperTypes().add(theInstancePackage.getDiscretePortInstance());
		runtimeDiscretePortInstanceEClass.getESuperTypes().add(this.getRuntimeDiscreteInteractionEndpointInstance());
		roleInstanceEClass.getESuperTypes().add(this.getRuntimeDiscreteInteractionEndpointInstance());
		runtimeMessageBufferEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		realtimeStatechartInstanceEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		runtimeMessageEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		runtimeParameterEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		variableBindingEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		runtimeBehavioralElementEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		singleRoleInstanceEClass.getESuperTypes().add(this.getRoleInstance());
		singleRoleInstanceEClass.getESuperTypes().add(theConnectorPackage.getDiscreteSingleInteractionEndpointInstance());
		multiRoleInstanceEClass.getESuperTypes().add(this.getRoleInstance());
		multiRoleInstanceEClass.getESuperTypes().add(theConnectorPackage.getDiscreteMultiInteractionEndpointInstance());
		runtimeRoleConnectorInstanceEClass.getESuperTypes().add(this.getRuntimeConnectorInstance());
		runtimeConnectorInstanceEClass.getESuperTypes().add(theConnectorPackage.getConnectorInstance());
		runtimeAssemblyConnectorInstanceEClass.getESuperTypes().add(theInstancePackage.getAssemblyConnectorInstance());
		runtimeAssemblyConnectorInstanceEClass.getESuperTypes().add(this.getRuntimeConnectorInstance());
		messageOnConnectorEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		runtimeDiscreteInteractionEndpointInstanceEClass.getESuperTypes().add(this.getRuntimeBehavioralElement());
		runtimeDiscreteInteractionEndpointInstanceEClass.getESuperTypes().add(theConnectorPackage.getDiscreteInteractionEndpointInstance());
		runtimeDiscreteInteractionEndpointInstanceEClass.getESuperTypes().add(theTypesPackage.getDataType());
		runtimeDiscreteSinglePortInstanceEClass.getESuperTypes().add(this.getRuntimeDiscretePortInstance());
		runtimeDiscreteSinglePortInstanceEClass.getESuperTypes().add(theInstancePackage.getDiscreteSinglePortInstance());
		runtimeDiscreteMultiPortInstanceEClass.getESuperTypes().add(theInstancePackage.getDiscreteMultiPortInstance());
		runtimeDiscreteMultiPortInstanceEClass.getESuperTypes().add(this.getRuntimeDiscretePortInstance());

		// Initialize classes and features; add operations and parameters
		initEClass(runtimeComponentInstanceEClass, RuntimeComponentInstance.class, "RuntimeComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runtimeDiscretePortInstanceEClass, RuntimeDiscretePortInstance.class, "RuntimeDiscretePortInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleInstanceEClass, RoleInstance.class, "RoleInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleInstance_Role(), theProtocolPackage.getRole(), null, "role", null, 1, 1, RoleInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRoleInstance_Assembly(), this.getRuntimeRoleConnectorInstance(), null, "assembly", null, 0, 1, RoleInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(runtimeMessageBufferEClass, RuntimeMessageBuffer.class, "RuntimeMessageBuffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeMessageBuffer_Messages(), this.getRuntimeMessage(), null, "messages", null, 0, -1, RuntimeMessageBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeMessageBuffer_RuntimeBehavioralElement(), this.getRuntimeBehavioralElement(), this.getRuntimeBehavioralElement_MessageBuffer(), "runtimeBehavioralElement", null, 1, 1, RuntimeMessageBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeMessageBuffer_MessageBuffer(), theConnectorPackage.getMessageBuffer(), null, "messageBuffer", null, 1, 1, RuntimeMessageBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realtimeStatechartInstanceEClass, RealtimeStatechartInstance.class, "RealtimeStatechartInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealtimeStatechartInstance_RuntimeBehavioralElement(), this.getRuntimeBehavioralElement(), this.getRuntimeBehavioralElement_StatechartInstance(), "runtimeBehavioralElement", null, 0, 1, RealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartInstance_InstanceOf(), theRealtimestatechartPackage.getRealtimeStatechart(), null, "instanceOf", null, 0, 1, RealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartInstance_ActiveVertex(), theRealtimestatechartPackage.getVertex(), null, "activeVertex", null, 0, 1, RealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartInstance_SubRealtimeStatechartInstances(), this.getRealtimeStatechartInstance(), this.getRealtimeStatechartInstance_ParentRealtimeStatechartInstance(), "subRealtimeStatechartInstances", null, 0, -1, RealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartInstance_ParentRealtimeStatechartInstance(), this.getRealtimeStatechartInstance(), this.getRealtimeStatechartInstance_SubRealtimeStatechartInstances(), "parentRealtimeStatechartInstance", null, 0, 1, RealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartInstance_VariableBindings(), this.getVariableBinding(), null, "variableBindings", null, 0, -1, RealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartInstance_AllAvailableVariableBindings(), this.getVariableBinding(), null, "allAvailableVariableBindings", null, 0, -1, RealtimeStatechartInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartInstance_NearestRuntimeBehavioralElement(), this.getRuntimeBehavioralElement(), null, "nearestRuntimeBehavioralElement", null, 0, 1, RealtimeStatechartInstance.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartInstance_ActiveTransition(), theRealtimestatechartPackage.getTransition(), null, "activeTransition", null, 0, 1, RealtimeStatechartInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeMessageEClass, RuntimeMessage.class, "RuntimeMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeMessage_Parameters(), this.getRuntimeParameter(), this.getRuntimeParameter_Message(), "parameters", null, 0, -1, RuntimeMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeMessage_Type(), theMsgtypePackage.getMessageType(), null, "type", null, 0, 1, RuntimeMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeParameterEClass, RuntimeParameter.class, "RuntimeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeParameter_Message(), this.getRuntimeMessage(), this.getRuntimeMessage_Parameters(), "message", null, 1, 1, RuntimeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntimeParameter_Value(), this.getJavaObject(), "value", null, 0, 1, RuntimeParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeParameter_Parameter(), theBehaviorPackage.getParameter(), null, "parameter", null, 0, 1, RuntimeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableBindingEClass, VariableBinding.class, "VariableBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableBinding_Variable(), theBehaviorPackage.getVariable(), null, "variable", null, 1, 1, VariableBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableBinding_Value(), this.getJavaObject(), "value", null, 0, 1, VariableBinding.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeBehavioralElementEClass, RuntimeBehavioralElement.class, "RuntimeBehavioralElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeBehavioralElement_StatechartInstance(), this.getRealtimeStatechartInstance(), this.getRealtimeStatechartInstance_RuntimeBehavioralElement(), "statechartInstance", null, 0, 1, RuntimeBehavioralElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeBehavioralElement_MessageBuffer(), this.getRuntimeMessageBuffer(), this.getRuntimeMessageBuffer_RuntimeBehavioralElement(), "messageBuffer", null, 0, -1, RuntimeBehavioralElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleRoleInstanceEClass, SingleRoleInstance.class, "SingleRoleInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiRoleInstanceEClass, MultiRoleInstance.class, "MultiRoleInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runtimeRoleConnectorInstanceEClass, RuntimeRoleConnectorInstance.class, "RuntimeRoleConnectorInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runtimeConnectorInstanceEClass, RuntimeConnectorInstance.class, "RuntimeConnectorInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeConnectorInstance_TransientMessages(), this.getMessageOnConnector(), this.getMessageOnConnector_RuntimeConnectorInstance(), "transientMessages", null, 0, -1, RuntimeConnectorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeAssemblyConnectorInstanceEClass, RuntimeAssemblyConnectorInstance.class, "RuntimeAssemblyConnectorInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageOnConnectorEClass, MessageOnConnector.class, "MessageOnConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageOnConnector_Receiver(), this.getRuntimeBehavioralElement(), null, "receiver", null, 1, 1, MessageOnConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageOnConnector_Message(), this.getRuntimeMessage(), null, "message", null, 1, 1, MessageOnConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageOnConnector_RuntimeConnectorInstance(), this.getRuntimeConnectorInstance(), this.getRuntimeConnectorInstance_TransientMessages(), "runtimeConnectorInstance", null, 1, 1, MessageOnConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeDiscreteInteractionEndpointInstanceEClass, RuntimeDiscreteInteractionEndpointInstance.class, "RuntimeDiscreteInteractionEndpointInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runtimeDiscreteSinglePortInstanceEClass, RuntimeDiscreteSinglePortInstance.class, "RuntimeDiscreteSinglePortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runtimeDiscreteMultiPortInstanceEClass, RuntimeDiscreteMultiPortInstance.class, "RuntimeDiscreteMultiPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(javaObjectEDataType, Object.class, "JavaObject", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (runtimeBehavioralElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "ElementMustNotContainMessageBuffers"
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
		  (getRoleInstance_Role(), 
		   source, 
		   new String[] {
			 "derivation", "self.type.oclAsType(pim::protocol::Role)"
		   });	
		addAnnotation
		  (getRoleInstance_Assembly(), 
		   source, 
		   new String[] {
			 "derivation", "if not self.oclAsType(pim::connector::ConnectorEndpointInstance).connectorInstances->isEmpty() then\r\n\tself.oclAsType(pim::connector::ConnectorEndpointInstance).connectorInstances->first().oclAsType(RuntimeRoleConnectorInstance)\r\nelse\r\n\tnull\r\nendif"
		   });	
		addAnnotation
		  (realtimeStatechartInstanceEClass, 
		   source, 
		   new String[] {
			 "StateAndTransitionActive", "-- A Vertex and a Transition of one RTSC can not be active at the same time\r\nactiveVertex.oclIsUndefined() or activeTransition.oclIsUndefined()"
		   });	
		addAnnotation
		  (getRealtimeStatechartInstance_AllAvailableVariableBindings(), 
		   source, 
		   new String[] {
			 "derivation", "self -> closure(if parentRealtimeStatechartInstance.oclIsUndefined() then self else parentRealtimeStatechartInstance endif).variableBindings->asOrderedSet()"
		   });	
		addAnnotation
		  (getRealtimeStatechartInstance_NearestRuntimeBehavioralElement(), 
		   source, 
		   new String[] {
			 "derivation", "-- traverse to parent if no runtime behavioral element itself\r\nif self.runtimeBehavioralElement.oclIsUndefined() then\r\n\t-- guard against NPE\r\n\tif (self.parentRealtimeStatechartInstance.oclIsUndefined()) then\t\r\n\t\tnull\r\n\telse\r\n\t\tself.parentRealtimeStatechartInstance.nearestRuntimeBehavioralElement\r\n\tendif\r\nelse\r\n\tself.runtimeBehavioralElement\r\nendif"
		   });	
		addAnnotation
		  (runtimeBehavioralElementEClass, 
		   source, 
		   new String[] {
			 "ElementMustNotContainMessageBuffers", "if(self.oclIsTypeOf(RuntimeComponentInstance) or self.oclIsTypeOf(MultiRoleInstance) or self.oclIsTypeOf(RuntimeDiscreteMultiPortInstance))\r\nthen messageBuffer->size() = 0\r\nelse true\r\nendif"
		   });
	}

} //RuntimePackageImpl
