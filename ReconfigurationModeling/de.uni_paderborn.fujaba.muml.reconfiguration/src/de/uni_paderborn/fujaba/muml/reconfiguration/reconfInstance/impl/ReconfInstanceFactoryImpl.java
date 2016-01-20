/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ExecutorInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.InternalReconfigurationCommunicationPortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ManagerInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfInstanceFactory;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfInstancePackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurableAtomicComponentInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurableStructuredComponentInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationExecutionPortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationMessagePortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.ReconfigurationPortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.reconfInstance.RuleBasedReconfigurationControllerInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReconfInstanceFactoryImpl extends EFactoryImpl implements ReconfInstanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReconfInstanceFactory init() {
		try {
			ReconfInstanceFactory theReconfInstanceFactory = (ReconfInstanceFactory)EPackage.Registry.INSTANCE.getEFactory(ReconfInstancePackage.eNS_URI);
			if (theReconfInstanceFactory != null) {
				return theReconfInstanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReconfInstanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfInstanceFactoryImpl() {
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
			case ReconfInstancePackage.RECONFIGURATION_PORT_INSTANCE: return createReconfigurationPortInstance();
			case ReconfInstancePackage.RECONFIGURATION_MESSAGE_PORT_INSTANCE: return createReconfigurationMessagePortInstance();
			case ReconfInstancePackage.RECONFIGURATION_EXECUTION_PORT_INSTANCE: return createReconfigurationExecutionPortInstance();
			case ReconfInstancePackage.INTERNAL_RECONFIGURATION_COMMUNICATION_PORT_INSTANCE: return createInternalReconfigurationCommunicationPortInstance();
			case ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE: return createRuleBasedReconfigurationControllerInstance();
			case ReconfInstancePackage.MANAGER_INSTANCE: return createManagerInstance();
			case ReconfInstancePackage.EXECUTOR_INSTANCE: return createExecutorInstance();
			case ReconfInstancePackage.RECONFIGURABLE_ATOMIC_COMPONENT_INSTANCE: return createReconfigurableAtomicComponentInstance();
			case ReconfInstancePackage.RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE: return createReconfigurableStructuredComponentInstance();
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
	public ReconfInstancePackage getReconfInstancePackage() {
		return (ReconfInstancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReconfInstancePackage getPackage() {
		return ReconfInstancePackage.eINSTANCE;
	}

} //ReconfInstanceFactoryImpl
