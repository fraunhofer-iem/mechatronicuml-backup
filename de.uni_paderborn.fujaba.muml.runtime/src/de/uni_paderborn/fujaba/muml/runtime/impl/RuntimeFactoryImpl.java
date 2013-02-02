/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.runtime.impl;

import de.uni_paderborn.fujaba.muml.runtime.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.runtime.MessageBuffer;
import de.uni_paderborn.fujaba.muml.runtime.MessageOnConnector;
import de.uni_paderborn.fujaba.muml.runtime.MultiRoleInstance;
import de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeAssemblyConnectorInstance;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeComponentInstance;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeDiscretePortInstance;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeFactory;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeMessage;
import de.uni_paderborn.fujaba.muml.runtime.RuntimePackage;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeParameter;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeRoleConnectorInstance;
import de.uni_paderborn.fujaba.muml.runtime.SingleRoleInstance;
import de.uni_paderborn.fujaba.muml.runtime.VariableBinding;

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
			RuntimeFactory theRuntimeFactory = (RuntimeFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.de/muml/model/runtime/0.3.14"); 
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
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE: return createRuntimeDiscretePortInstance();
			case RuntimePackage.MESSAGE_BUFFER: return createMessageBuffer();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE: return createRealtimeStatechartInstance();
			case RuntimePackage.RUNTIME_MESSAGE: return createRuntimeMessage();
			case RuntimePackage.RUNTIME_PARAMETER: return createRuntimeParameter();
			case RuntimePackage.VARIABLE_BINDING: return createVariableBinding();
			case RuntimePackage.SINGLE_ROLE_INSTANCE: return createSingleRoleInstance();
			case RuntimePackage.MULTI_ROLE_INSTANCE: return createMultiRoleInstance();
			case RuntimePackage.RUNTIME_ROLE_CONNECTOR_INSTANCE: return createRuntimeRoleConnectorInstance();
			case RuntimePackage.RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE: return createRuntimeAssemblyConnectorInstance();
			case RuntimePackage.MESSAGE_ON_CONNECTOR: return createMessageOnConnector();
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
	public RuntimeDiscretePortInstance createRuntimeDiscretePortInstance() {
		RuntimeDiscretePortInstanceImpl runtimeDiscretePortInstance = new RuntimeDiscretePortInstanceImpl();
		return runtimeDiscretePortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBuffer createMessageBuffer() {
		MessageBufferImpl messageBuffer = new MessageBufferImpl();
		return messageBuffer;
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
