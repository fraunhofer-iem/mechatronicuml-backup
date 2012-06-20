/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.impl;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.*;

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
public class ReconfigurationFactoryImpl extends EFactoryImpl implements ReconfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReconfigurationFactory init() {
		try {
			ReconfigurationFactory theReconfigurationFactory = (ReconfigurationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.fujaba.de/muml/reconfiguration/0.3.0"); 
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
			case ReconfigurationPackage.PART_DATA_TYPE: return createPartDataType();
			case ReconfigurationPackage.PORT_DATA_TYPE: return createPortDataType();
			case ReconfigurationPackage.STATECHART_IMPLEMENTATION: return createStatechartImplementation();
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT: return createReconfigurationMessagePort();
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT: return createReconfigurationExecutionPort();
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY: return createExecutorSpecificationEntry();
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY: return createManagerSpecificationEntry();
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_TYPE: return createReconfigurationMessageType();
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_ENTRY: return createReconfigurationMessagePortEntry();
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
	public PartDataType createPartDataType() {
		PartDataTypeImpl partDataType = new PartDataTypeImpl();
		return partDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDataType createPortDataType() {
		PortDataTypeImpl portDataType = new PortDataTypeImpl();
		return portDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatechartImplementation createStatechartImplementation() {
		StatechartImplementationImpl statechartImplementation = new StatechartImplementationImpl();
		return statechartImplementation;
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
	public ReconfigurationMessageType createReconfigurationMessageType() {
		ReconfigurationMessageTypeImpl reconfigurationMessageType = new ReconfigurationMessageTypeImpl();
		return reconfigurationMessageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationMessagePortEntry createReconfigurationMessagePortEntry() {
		ReconfigurationMessagePortEntryImpl reconfigurationMessagePortEntry = new ReconfigurationMessagePortEntryImpl();
		return reconfigurationMessagePortEntry;
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
