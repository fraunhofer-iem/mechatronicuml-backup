/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime.impl;

import de.uni_paderborn.fujaba.muml.model.runtime.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
			RuntimeFactory theRuntimeFactory = (RuntimeFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.de/muml/model/runtime/0.2.0"); 
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
			case RuntimePackage.RUNTIME_PORT_INSTANCE: return createRuntimePortInstance();
			case RuntimePackage.RUNTIME_ROLE_INSTANCE: return createRuntimeRoleInstance();
			case RuntimePackage.MESSAGE_QUEUE: return createMessageQueue();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE: return createRealtimeStatechartInstance();
			case RuntimePackage.RUNTIME_MESSAGE: return createRuntimeMessage();
			case RuntimePackage.RUNTIME_PARAMETER: return createRuntimeParameter();
			case RuntimePackage.VARIABLE_BINDING: return createVariableBinding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public RuntimePortInstance createRuntimePortInstance() {
		RuntimePortInstanceImpl runtimePortInstance = new RuntimePortInstanceImpl();
		return runtimePortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeRoleInstance createRuntimeRoleInstance() {
		RuntimeRoleInstanceImpl runtimeRoleInstance = new RuntimeRoleInstanceImpl();
		return runtimeRoleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageQueue createMessageQueue() {
		MessageQueueImpl messageQueue = new MessageQueueImpl();
		return messageQueue;
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
