/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.reconfiguration.*;

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
			ReconfigurationFactory theReconfigurationFactory = (ReconfigurationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.de/muml/reconfiguration/0.3.8"); 
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
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT: return createReconfigurationExecutionPort();
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY: return createExecutorSpecificationEntry();
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY: return createManagerSpecificationEntry();
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER: return createRuleBasedReconfigurationController();
			case ReconfigurationPackage.RECONFIGURATION_PORT_INTERFACE_ENTRY: return createReconfigurationPortInterfaceEntry();
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY: return createReconfigurationMessagePortInterfaceEntry();
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY: return createReconfigurationExecutionPortInterfaceEntry();
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_KIND:
				return createReconfigurationMessageKindFromString(eDataType, initialValue);
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_KIND:
				return convertReconfigurationMessageKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public ReconfigurationExecutionPort createReconfigurationExecutionPort() {
		ReconfigurationExecutionPortImpl reconfigurationExecutionPort = new ReconfigurationExecutionPortImpl();
		return reconfigurationExecutionPort;
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
	public ReconfigurationPortInterfaceEntry createReconfigurationPortInterfaceEntry() {
		ReconfigurationPortInterfaceEntryImpl reconfigurationPortInterfaceEntry = new ReconfigurationPortInterfaceEntryImpl();
		return reconfigurationPortInterfaceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationMessagePortInterfaceEntry createReconfigurationMessagePortInterfaceEntry() {
		ReconfigurationMessagePortInterfaceEntryImpl reconfigurationMessagePortInterfaceEntry = new ReconfigurationMessagePortInterfaceEntryImpl();
		return reconfigurationMessagePortInterfaceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationExecutionPortInterfaceEntry createReconfigurationExecutionPortInterfaceEntry() {
		ReconfigurationExecutionPortInterfaceEntryImpl reconfigurationExecutionPortInterfaceEntry = new ReconfigurationExecutionPortInterfaceEntryImpl();
		return reconfigurationExecutionPortInterfaceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationMessageKind createReconfigurationMessageKindFromString(EDataType eDataType, String initialValue) {
		ReconfigurationMessageKind result = ReconfigurationMessageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReconfigurationMessageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
