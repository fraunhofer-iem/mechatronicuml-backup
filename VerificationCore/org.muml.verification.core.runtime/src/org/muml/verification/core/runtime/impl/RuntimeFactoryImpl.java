/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.runtime.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.verification.core.runtime.MessageOnConnector;
import org.muml.verification.core.runtime.MultiRoleInstance;
import org.muml.verification.core.runtime.RealtimeStatechartInstance;
import org.muml.verification.core.runtime.RuntimeAssemblyConnectorInstance;
import org.muml.verification.core.runtime.RuntimeComponentInstance;
import org.muml.verification.core.runtime.RuntimeDiscreteMultiPortInstance;
import org.muml.verification.core.runtime.RuntimeDiscreteSinglePortInstance;
import org.muml.verification.core.runtime.RuntimeFactory;
import org.muml.verification.core.runtime.RuntimeMessage;
import org.muml.verification.core.runtime.RuntimeMessageBuffer;
import org.muml.verification.core.runtime.RuntimePackage;
import org.muml.verification.core.runtime.RuntimeParameter;
import org.muml.verification.core.runtime.RuntimeRoleConnectorInstance;
import org.muml.verification.core.runtime.SingleRoleInstance;
import org.muml.verification.core.runtime.VariableBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeFactoryImpl extends EFactoryImpl implements RuntimeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RuntimeFactory init() {
		try {
			RuntimeFactory theRuntimeFactory = (RuntimeFactory)EPackage.Registry.INSTANCE.getEFactory(RuntimePackage.eNS_URI);
			if (theRuntimeFactory != null) {
				return theRuntimeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RuntimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RuntimePackage.RUNTIME_COMPONENT_INSTANCE: return createRuntimeComponentInstance();
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER: return createRuntimeMessageBuffer();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE: return createRealtimeStatechartInstance();
			case RuntimePackage.RUNTIME_MESSAGE: return createRuntimeMessage();
			case RuntimePackage.RUNTIME_PARAMETER: return createRuntimeParameter();
			case RuntimePackage.VARIABLE_BINDING: return createVariableBinding();
			case RuntimePackage.SINGLE_ROLE_INSTANCE: return createSingleRoleInstance();
			case RuntimePackage.MULTI_ROLE_INSTANCE: return createMultiRoleInstance();
			case RuntimePackage.RUNTIME_ROLE_CONNECTOR_INSTANCE: return createRuntimeRoleConnectorInstance();
			case RuntimePackage.RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE: return createRuntimeAssemblyConnectorInstance();
			case RuntimePackage.MESSAGE_ON_CONNECTOR: return createMessageOnConnector();
			case RuntimePackage.RUNTIME_DISCRETE_SINGLE_PORT_INSTANCE: return createRuntimeDiscreteSinglePortInstance();
			case RuntimePackage.RUNTIME_DISCRETE_MULTI_PORT_INSTANCE: return createRuntimeDiscreteMultiPortInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeComponentInstance createRuntimeComponentInstance() {
		RuntimeComponentInstanceImpl runtimeComponentInstance = new RuntimeComponentInstanceImpl();
		return runtimeComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeMessageBuffer createRuntimeMessageBuffer() {
		RuntimeMessageBufferImpl runtimeMessageBuffer = new RuntimeMessageBufferImpl();
		return runtimeMessageBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechartInstance createRealtimeStatechartInstance() {
		RealtimeStatechartInstanceImpl realtimeStatechartInstance = new RealtimeStatechartInstanceImpl();
		return realtimeStatechartInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeMessage createRuntimeMessage() {
		RuntimeMessageImpl runtimeMessage = new RuntimeMessageImpl();
		return runtimeMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeParameter createRuntimeParameter() {
		RuntimeParameterImpl runtimeParameter = new RuntimeParameterImpl();
		return runtimeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableBinding createVariableBinding() {
		VariableBindingImpl variableBinding = new VariableBindingImpl();
		return variableBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleRoleInstance createSingleRoleInstance() {
		SingleRoleInstanceImpl singleRoleInstance = new SingleRoleInstanceImpl();
		return singleRoleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiRoleInstance createMultiRoleInstance() {
		MultiRoleInstanceImpl multiRoleInstance = new MultiRoleInstanceImpl();
		return multiRoleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeRoleConnectorInstance createRuntimeRoleConnectorInstance() {
		RuntimeRoleConnectorInstanceImpl runtimeRoleConnectorInstance = new RuntimeRoleConnectorInstanceImpl();
		return runtimeRoleConnectorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeAssemblyConnectorInstance createRuntimeAssemblyConnectorInstance() {
		RuntimeAssemblyConnectorInstanceImpl runtimeAssemblyConnectorInstance = new RuntimeAssemblyConnectorInstanceImpl();
		return runtimeAssemblyConnectorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOnConnector createMessageOnConnector() {
		MessageOnConnectorImpl messageOnConnector = new MessageOnConnectorImpl();
		return messageOnConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeDiscreteSinglePortInstance createRuntimeDiscreteSinglePortInstance() {
		RuntimeDiscreteSinglePortInstanceImpl runtimeDiscreteSinglePortInstance = new RuntimeDiscreteSinglePortInstanceImpl();
		return runtimeDiscreteSinglePortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeDiscreteMultiPortInstance createRuntimeDiscreteMultiPortInstance() {
		RuntimeDiscreteMultiPortInstanceImpl runtimeDiscreteMultiPortInstance = new RuntimeDiscreteMultiPortInstanceImpl();
		return runtimeDiscreteMultiPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimePackage getRuntimePackage() {
		return (RuntimePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RuntimePackage getPackage() {
		return RuntimePackage.eINSTANCE;
	}

} //RuntimeFactoryImpl
