/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ExecutorInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.InstanceFactory;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.InternalReconfigurationCommunicationPortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableAtomicComponentInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableStructuredComponentInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationExecutionPortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationMessagePortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationPortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceFactoryImpl extends EFactoryImpl implements InstanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstanceFactory init() {
		try {
			InstanceFactory theInstanceFactory = (InstanceFactory)EPackage.Registry.INSTANCE.getEFactory(InstancePackage.eNS_URI);
			if (theInstanceFactory != null) {
				return theInstanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InstanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceFactoryImpl() {
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
			case InstancePackage.RECONFIGURATION_PORT_INSTANCE: return createReconfigurationPortInstance();
			case InstancePackage.RECONFIGURATION_MESSAGE_PORT_INSTANCE: return createReconfigurationMessagePortInstance();
			case InstancePackage.RECONFIGURATION_EXECUTION_PORT_INSTANCE: return createReconfigurationExecutionPortInstance();
			case InstancePackage.INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE: return createInternalReconfigurationCommunicationPortInstance();
			case InstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE: return createRuleBasedReconfigurationControllerInstance();
			case InstancePackage.MANAGER_INSTANCE: return createManagerInstance();
			case InstancePackage.EXECUTOR_INSTANCE: return createExecutorInstance();
			case InstancePackage.RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE: return createReconfigurableAtomicComponentInstance();
			case InstancePackage.RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE: return createReconfigurableStructuredComponentInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationPortInstance createReconfigurationPortInstance() {
		ReconfigurationPortInstanceImpl reconfigurationPortInstance = new ReconfigurationPortInstanceImpl();
		return reconfigurationPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationMessagePortInstance createReconfigurationMessagePortInstance() {
		ReconfigurationMessagePortInstanceImpl reconfigurationMessagePortInstance = new ReconfigurationMessagePortInstanceImpl();
		return reconfigurationMessagePortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationExecutionPortInstance createReconfigurationExecutionPortInstance() {
		ReconfigurationExecutionPortInstanceImpl reconfigurationExecutionPortInstance = new ReconfigurationExecutionPortInstanceImpl();
		return reconfigurationExecutionPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalReconfigurationCommunicationPortInstance createInternalReconfigurationCommunicationPortInstance() {
		InternalReconfigurationCommunicationPortInstanceImpl internalReconfigurationCommunicationPortInstance = new InternalReconfigurationCommunicationPortInstanceImpl();
		return internalReconfigurationCommunicationPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleBasedReconfigurationControllerInstance createRuleBasedReconfigurationControllerInstance() {
		RuleBasedReconfigurationControllerInstanceImpl ruleBasedReconfigurationControllerInstance = new RuleBasedReconfigurationControllerInstanceImpl();
		return ruleBasedReconfigurationControllerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerInstance createManagerInstance() {
		ManagerInstanceImpl managerInstance = new ManagerInstanceImpl();
		return managerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutorInstance createExecutorInstance() {
		ExecutorInstanceImpl executorInstance = new ExecutorInstanceImpl();
		return executorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurableAtomicComponentInstance createReconfigurableAtomicComponentInstance() {
		ReconfigurableAtomicComponentInstanceImpl reconfigurableAtomicComponentInstance = new ReconfigurableAtomicComponentInstanceImpl();
		return reconfigurableAtomicComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurableStructuredComponentInstance createReconfigurableStructuredComponentInstance() {
		ReconfigurableStructuredComponentInstanceImpl reconfigurableStructuredComponentInstance = new ReconfigurableStructuredComponentInstanceImpl();
		return reconfigurableStructuredComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancePackage getInstancePackage() {
		return (InstancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InstancePackage getPackage() {
		return InstancePackage.eINSTANCE;
	}

} //InstanceFactoryImpl
