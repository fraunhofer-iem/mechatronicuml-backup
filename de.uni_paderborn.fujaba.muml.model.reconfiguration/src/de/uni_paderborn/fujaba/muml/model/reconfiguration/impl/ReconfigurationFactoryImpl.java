/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.Executor;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ExternalReconfigurationExecutionPort;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.InternalReconfigurationExecutionPort;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationFactory;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessagePort;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.RuleBasedReconfigurationController;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReconfigurationFactoryImpl extends EFactoryImpl implements ReconfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReconfigurationFactory init() {
		try {
			ReconfigurationFactory theReconfigurationFactory = (ReconfigurationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.de/muml/reconfiguration/0.3.7"); 
			if (theReconfigurationFactory != null) {
				return theReconfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReconfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationFactoryImpl() {
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
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT: return createReconfigurableStructuredComponent();
			case ReconfigurationPackage.MANAGER: return createManager();
			case ReconfigurationPackage.EXECUTOR: return createExecutor();
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT: return createReconfigurationMessagePort();
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY: return createExecutorSpecificationEntry();
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY: return createManagerSpecificationEntry();
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER: return createRuleBasedReconfigurationController();
			case ReconfigurationPackage.EXTERNAL_RECONFIGURATION_EXECUTION_PORT: return createExternalReconfigurationExecutionPort();
			case ReconfigurationPackage.INTERNAL_RECONFIGURATION_EXECUTION_PORT: return createInternalReconfigurationExecutionPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurableStructuredComponent createReconfigurableStructuredComponent() {
		ReconfigurableStructuredComponentImpl reconfigurableStructuredComponent = new ReconfigurableStructuredComponentImpl();
		return reconfigurableStructuredComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager createManager() {
		ManagerImpl manager = new ManagerImpl();
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor createExecutor() {
		ExecutorImpl executor = new ExecutorImpl();
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationMessagePort createReconfigurationMessagePort() {
		ReconfigurationMessagePortImpl reconfigurationMessagePort = new ReconfigurationMessagePortImpl();
		return reconfigurationMessagePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutorSpecificationEntry createExecutorSpecificationEntry() {
		ExecutorSpecificationEntryImpl executorSpecificationEntry = new ExecutorSpecificationEntryImpl();
		return executorSpecificationEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerSpecificationEntry createManagerSpecificationEntry() {
		ManagerSpecificationEntryImpl managerSpecificationEntry = new ManagerSpecificationEntryImpl();
		return managerSpecificationEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleBasedReconfigurationController createRuleBasedReconfigurationController() {
		RuleBasedReconfigurationControllerImpl ruleBasedReconfigurationController = new RuleBasedReconfigurationControllerImpl();
		return ruleBasedReconfigurationController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReconfigurationExecutionPort createExternalReconfigurationExecutionPort() {
		ExternalReconfigurationExecutionPortImpl externalReconfigurationExecutionPort = new ExternalReconfigurationExecutionPortImpl();
		return externalReconfigurationExecutionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalReconfigurationExecutionPort createInternalReconfigurationExecutionPort() {
		InternalReconfigurationExecutionPortImpl internalReconfigurationExecutionPort = new InternalReconfigurationExecutionPortImpl();
		return internalReconfigurationExecutionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationPackage getReconfigurationPackage() {
		return (ReconfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReconfigurationPackage getPackage() {
		return ReconfigurationPackage.eINSTANCE;
	}

} //ReconfigurationFactoryImpl
