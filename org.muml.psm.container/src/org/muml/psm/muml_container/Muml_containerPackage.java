/**
 */
package org.muml.psm.muml_container;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.muml.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.muml.psm.muml_container.Muml_containerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface Muml_containerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "muml_container";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/psm/muml_container/0.5.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "muml_container";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Muml_containerPackage eINSTANCE = org.muml.psm.muml_container.impl.Muml_containerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.psm.muml_container.impl.ComponentContainerImpl <em>Component Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.muml_container.impl.ComponentContainerImpl
	 * @see org.muml.psm.muml_container.impl.Muml_containerPackageImpl#getComponentContainer()
	 * @generated
	 */
	int COMPONENT_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTAINER__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTAINER__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTAINER__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTAINER__COMPONENT_TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Instance Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTAINER__COMPONENT_INSTANCE_CONFIGURATIONS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ecu Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTAINER__ECU_CONFIGURATION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTAINER__COMPONENT_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTAINER_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTAINER___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Component Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTAINER_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.muml_container.impl.ContainerComponentInstanceConfigurationImpl <em>Container Component Instance Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.muml_container.impl.ContainerComponentInstanceConfigurationImpl
	 * @see org.muml.psm.muml_container.impl.Muml_containerPackageImpl#getContainerComponentInstanceConfiguration()
	 * @generated
	 */
	int CONTAINER_COMPONENT_INSTANCE_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Port Instance Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__PORT_INSTANCE_CONFIGURATIONS = 1;

	/**
	 * The number of structural features of the '<em>Container Component Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPONENT_INSTANCE_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Container Component Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPONENT_INSTANCE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.muml_container.impl.PortInstanceConfigurationImpl <em>Port Instance Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.muml_container.impl.PortInstanceConfigurationImpl
	 * @see org.muml.psm.muml_container.impl.Muml_containerPackageImpl#getPortInstanceConfiguration()
	 * @generated
	 */
	int PORT_INSTANCE_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Port Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Hwport Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION__HWPORT_INSTANCE = 1;

	/**
	 * The number of structural features of the '<em>Port Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_LocalImpl <em>Port Instance Configuration Local</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.muml_container.impl.PortInstanceConfiguration_LocalImpl
	 * @see org.muml.psm.muml_container.impl.Muml_containerPackageImpl#getPortInstanceConfiguration_Local()
	 * @generated
	 */
	int PORT_INSTANCE_CONFIGURATION_LOCAL = 3;

	/**
	 * The feature id for the '<em><b>Port Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION_LOCAL__PORT_INSTANCE = PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Hwport Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION_LOCAL__HWPORT_INSTANCE = PORT_INSTANCE_CONFIGURATION__HWPORT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Own ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION_LOCAL__OWN_ID = PORT_INSTANCE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Writers ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION_LOCAL__WRITERS_ID = PORT_INSTANCE_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Instance Configuration Local</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION_LOCAL_FEATURE_COUNT = PORT_INSTANCE_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Port Instance Configuration Local</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION_LOCAL_OPERATION_COUNT = PORT_INSTANCE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_DDSImpl <em>Port Instance Configuration DDS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.muml_container.impl.PortInstanceConfiguration_DDSImpl
	 * @see org.muml.psm.muml_container.impl.Muml_containerPackageImpl#getPortInstanceConfiguration_DDS()
	 * @generated
	 */
	int PORT_INSTANCE_CONFIGURATION_DDS = 4;

	/**
	 * The feature id for the '<em><b>Port Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION_DDS__PORT_INSTANCE = PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Hwport Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION_DDS__HWPORT_INSTANCE = PORT_INSTANCE_CONFIGURATION__HWPORT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Domain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_ID = PORT_INSTANCE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Partition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION_DDS__PARTITION_ID = PORT_INSTANCE_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION_DDS__PUBLISHER = PORT_INSTANCE_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subscriber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION_DDS__SUBSCRIBER = PORT_INSTANCE_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Domain Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_PARTICIPANT = PORT_INSTANCE_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Port Instance Configuration DDS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION_DDS_FEATURE_COUNT = PORT_INSTANCE_CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Port Instance Configuration DDS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_CONFIGURATION_DDS_OPERATION_COUNT = PORT_INSTANCE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.muml_container.impl.ECUConfigurationImpl <em>ECU Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.muml_container.impl.ECUConfigurationImpl
	 * @see org.muml.psm.muml_container.impl.Muml_containerPackageImpl#getECUConfiguration()
	 * @generated
	 */
	int ECU_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_CONFIGURATION__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_CONFIGURATION__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_CONFIGURATION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Structured Resource Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_CONFIGURATION__STRUCTURED_RESOURCE_INSTANCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_CONFIGURATION__COMPONENT_CONTAINERS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ECU Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_CONFIGURATION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_CONFIGURATION___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>ECU Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_CONFIGURATION_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.muml_container.impl.MultiPortInstanceConfigurationImpl <em>Multi Port Instance Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.muml_container.impl.MultiPortInstanceConfigurationImpl
	 * @see org.muml.psm.muml_container.impl.Muml_containerPackageImpl#getMultiPortInstanceConfiguration()
	 * @generated
	 */
	int MULTI_PORT_INSTANCE_CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>Port Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE = PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Hwport Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_INSTANCE_CONFIGURATION__HWPORT_INSTANCE = PORT_INSTANCE_CONFIGURATION__HWPORT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Port Instance Configurations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE_CONFIGURATIONS = PORT_INSTANCE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Port Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_INSTANCE_CONFIGURATION_FEATURE_COUNT = PORT_INSTANCE_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Port Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_INSTANCE_CONFIGURATION_OPERATION_COUNT = PORT_INSTANCE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.muml_container.impl.SystemConfigurationImpl <em>System Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.muml_container.impl.SystemConfigurationImpl
	 * @see org.muml.psm.muml_container.impl.Muml_containerPackageImpl#getSystemConfiguration()
	 * @generated
	 */
	int SYSTEM_CONFIGURATION = 7;

	/**
	 * The feature id for the '<em><b>System Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION__SYSTEM_ALLOCATION = 0;

	/**
	 * The feature id for the '<em><b>Ecu Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION__ECU_CONFIGURATIONS = 1;

	/**
	 * The number of structural features of the '<em>System Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.muml.psm.muml_container.ComponentContainer <em>Component Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Container</em>'.
	 * @see org.muml.psm.muml_container.ComponentContainer
	 * @generated
	 */
	EClass getComponentContainer();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.muml_container.ComponentContainer#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see org.muml.psm.muml_container.ComponentContainer#getComponentType()
	 * @see #getComponentContainer()
	 * @generated
	 */
	EReference getComponentContainer_ComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.muml_container.ComponentContainer#getComponentInstanceConfigurations <em>Component Instance Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Instance Configurations</em>'.
	 * @see org.muml.psm.muml_container.ComponentContainer#getComponentInstanceConfigurations()
	 * @see #getComponentContainer()
	 * @generated
	 */
	EReference getComponentContainer_ComponentInstanceConfigurations();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.psm.muml_container.ComponentContainer#getEcuConfiguration <em>Ecu Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ecu Configuration</em>'.
	 * @see org.muml.psm.muml_container.ComponentContainer#getEcuConfiguration()
	 * @see #getComponentContainer()
	 * @generated
	 */
	EReference getComponentContainer_EcuConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.psm.muml_container.ComponentContainer#getComponentInstances <em>Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component Instances</em>'.
	 * @see org.muml.psm.muml_container.ComponentContainer#getComponentInstances()
	 * @see #getComponentContainer()
	 * @generated
	 */
	EReference getComponentContainer_ComponentInstances();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.muml_container.ContainerComponentInstanceConfiguration <em>Container Component Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Component Instance Configuration</em>'.
	 * @see org.muml.psm.muml_container.ContainerComponentInstanceConfiguration
	 * @generated
	 */
	EClass getContainerComponentInstanceConfiguration();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.muml_container.ContainerComponentInstanceConfiguration#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance</em>'.
	 * @see org.muml.psm.muml_container.ContainerComponentInstanceConfiguration#getComponentInstance()
	 * @see #getContainerComponentInstanceConfiguration()
	 * @generated
	 */
	EReference getContainerComponentInstanceConfiguration_ComponentInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.muml_container.ContainerComponentInstanceConfiguration#getPortInstanceConfigurations <em>Port Instance Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Instance Configurations</em>'.
	 * @see org.muml.psm.muml_container.ContainerComponentInstanceConfiguration#getPortInstanceConfigurations()
	 * @see #getContainerComponentInstanceConfiguration()
	 * @generated
	 */
	EReference getContainerComponentInstanceConfiguration_PortInstanceConfigurations();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.muml_container.PortInstanceConfiguration <em>Port Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Instance Configuration</em>'.
	 * @see org.muml.psm.muml_container.PortInstanceConfiguration
	 * @generated
	 */
	EClass getPortInstanceConfiguration();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.muml_container.PortInstanceConfiguration#getPortInstance <em>Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Instance</em>'.
	 * @see org.muml.psm.muml_container.PortInstanceConfiguration#getPortInstance()
	 * @see #getPortInstanceConfiguration()
	 * @generated
	 */
	EReference getPortInstanceConfiguration_PortInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.muml_container.PortInstanceConfiguration#getHwportInstance <em>Hwport Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hwport Instance</em>'.
	 * @see org.muml.psm.muml_container.PortInstanceConfiguration#getHwportInstance()
	 * @see #getPortInstanceConfiguration()
	 * @generated
	 */
	EReference getPortInstanceConfiguration_HwportInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.muml_container.PortInstanceConfiguration_Local <em>Port Instance Configuration Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Instance Configuration Local</em>'.
	 * @see org.muml.psm.muml_container.PortInstanceConfiguration_Local
	 * @generated
	 */
	EClass getPortInstanceConfiguration_Local();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.muml_container.PortInstanceConfiguration_Local#getOwnID <em>Own ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Own ID</em>'.
	 * @see org.muml.psm.muml_container.PortInstanceConfiguration_Local#getOwnID()
	 * @see #getPortInstanceConfiguration_Local()
	 * @generated
	 */
	EAttribute getPortInstanceConfiguration_Local_OwnID();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.muml_container.PortInstanceConfiguration_Local#getWritersID <em>Writers ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writers ID</em>'.
	 * @see org.muml.psm.muml_container.PortInstanceConfiguration_Local#getWritersID()
	 * @see #getPortInstanceConfiguration_Local()
	 * @generated
	 */
	EAttribute getPortInstanceConfiguration_Local_WritersID();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS <em>Port Instance Configuration DDS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Instance Configuration DDS</em>'.
	 * @see org.muml.psm.muml_container.PortInstanceConfiguration_DDS
	 * @generated
	 */
	EClass getPortInstanceConfiguration_DDS();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getDomainID <em>Domain ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain ID</em>'.
	 * @see org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getDomainID()
	 * @see #getPortInstanceConfiguration_DDS()
	 * @generated
	 */
	EAttribute getPortInstanceConfiguration_DDS_DomainID();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getPartitionID <em>Partition ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partition ID</em>'.
	 * @see org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getPartitionID()
	 * @see #getPortInstanceConfiguration_DDS()
	 * @generated
	 */
	EAttribute getPortInstanceConfiguration_DDS_PartitionID();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publisher</em>'.
	 * @see org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getPublisher()
	 * @see #getPortInstanceConfiguration_DDS()
	 * @generated
	 */
	EReference getPortInstanceConfiguration_DDS_Publisher();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getSubscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscriber</em>'.
	 * @see org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getSubscriber()
	 * @see #getPortInstanceConfiguration_DDS()
	 * @generated
	 */
	EReference getPortInstanceConfiguration_DDS_Subscriber();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getDomainParticipant <em>Domain Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Participant</em>'.
	 * @see org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getDomainParticipant()
	 * @see #getPortInstanceConfiguration_DDS()
	 * @generated
	 */
	EReference getPortInstanceConfiguration_DDS_DomainParticipant();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.muml_container.ECUConfiguration <em>ECU Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECU Configuration</em>'.
	 * @see org.muml.psm.muml_container.ECUConfiguration
	 * @generated
	 */
	EClass getECUConfiguration();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.muml_container.ECUConfiguration#getStructuredResourceInstance <em>Structured Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structured Resource Instance</em>'.
	 * @see org.muml.psm.muml_container.ECUConfiguration#getStructuredResourceInstance()
	 * @see #getECUConfiguration()
	 * @generated
	 */
	EReference getECUConfiguration_StructuredResourceInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.muml_container.ECUConfiguration#getComponentContainers <em>Component Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Containers</em>'.
	 * @see org.muml.psm.muml_container.ECUConfiguration#getComponentContainers()
	 * @see #getECUConfiguration()
	 * @generated
	 */
	EReference getECUConfiguration_ComponentContainers();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.muml_container.MultiPortInstanceConfiguration <em>Multi Port Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Port Instance Configuration</em>'.
	 * @see org.muml.psm.muml_container.MultiPortInstanceConfiguration
	 * @generated
	 */
	EClass getMultiPortInstanceConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.psm.muml_container.MultiPortInstanceConfiguration#getPortInstanceConfigurations <em>Port Instance Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Instance Configurations</em>'.
	 * @see org.muml.psm.muml_container.MultiPortInstanceConfiguration#getPortInstanceConfigurations()
	 * @see #getMultiPortInstanceConfiguration()
	 * @generated
	 */
	EReference getMultiPortInstanceConfiguration_PortInstanceConfigurations();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.muml_container.SystemConfiguration <em>System Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Configuration</em>'.
	 * @see org.muml.psm.muml_container.SystemConfiguration
	 * @generated
	 */
	EClass getSystemConfiguration();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.muml_container.SystemConfiguration#getSystemAllocation <em>System Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Allocation</em>'.
	 * @see org.muml.psm.muml_container.SystemConfiguration#getSystemAllocation()
	 * @see #getSystemConfiguration()
	 * @generated
	 */
	EReference getSystemConfiguration_SystemAllocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.muml_container.SystemConfiguration#getEcuConfigurations <em>Ecu Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ecu Configurations</em>'.
	 * @see org.muml.psm.muml_container.SystemConfiguration#getEcuConfigurations()
	 * @see #getSystemConfiguration()
	 * @generated
	 */
	EReference getSystemConfiguration_EcuConfigurations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Muml_containerFactory getMuml_containerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.psm.muml_container.impl.ComponentContainerImpl <em>Component Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.muml_container.impl.ComponentContainerImpl
		 * @see org.muml.psm.muml_container.impl.Muml_containerPackageImpl#getComponentContainer()
		 * @generated
		 */
		EClass COMPONENT_CONTAINER = eINSTANCE.getComponentContainer();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CONTAINER__COMPONENT_TYPE = eINSTANCE.getComponentContainer_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Component Instance Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CONTAINER__COMPONENT_INSTANCE_CONFIGURATIONS = eINSTANCE.getComponentContainer_ComponentInstanceConfigurations();

		/**
		 * The meta object literal for the '<em><b>Ecu Configuration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CONTAINER__ECU_CONFIGURATION = eINSTANCE.getComponentContainer_EcuConfiguration();

		/**
		 * The meta object literal for the '<em><b>Component Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CONTAINER__COMPONENT_INSTANCES = eINSTANCE.getComponentContainer_ComponentInstances();

		/**
		 * The meta object literal for the '{@link org.muml.psm.muml_container.impl.ContainerComponentInstanceConfigurationImpl <em>Container Component Instance Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.muml_container.impl.ContainerComponentInstanceConfigurationImpl
		 * @see org.muml.psm.muml_container.impl.Muml_containerPackageImpl#getContainerComponentInstanceConfiguration()
		 * @generated
		 */
		EClass CONTAINER_COMPONENT_INSTANCE_CONFIGURATION = eINSTANCE.getContainerComponentInstanceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCE = eINSTANCE.getContainerComponentInstanceConfiguration_ComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Port Instance Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_COMPONENT_INSTANCE_CONFIGURATION__PORT_INSTANCE_CONFIGURATIONS = eINSTANCE.getContainerComponentInstanceConfiguration_PortInstanceConfigurations();

		/**
		 * The meta object literal for the '{@link org.muml.psm.muml_container.impl.PortInstanceConfigurationImpl <em>Port Instance Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.muml_container.impl.PortInstanceConfigurationImpl
		 * @see org.muml.psm.muml_container.impl.Muml_containerPackageImpl#getPortInstanceConfiguration()
		 * @generated
		 */
		EClass PORT_INSTANCE_CONFIGURATION = eINSTANCE.getPortInstanceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Port Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE = eINSTANCE.getPortInstanceConfiguration_PortInstance();

		/**
		 * The meta object literal for the '<em><b>Hwport Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE_CONFIGURATION__HWPORT_INSTANCE = eINSTANCE.getPortInstanceConfiguration_HwportInstance();

		/**
		 * The meta object literal for the '{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_LocalImpl <em>Port Instance Configuration Local</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.muml_container.impl.PortInstanceConfiguration_LocalImpl
		 * @see org.muml.psm.muml_container.impl.Muml_containerPackageImpl#getPortInstanceConfiguration_Local()
		 * @generated
		 */
		EClass PORT_INSTANCE_CONFIGURATION_LOCAL = eINSTANCE.getPortInstanceConfiguration_Local();

		/**
		 * The meta object literal for the '<em><b>Own ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_INSTANCE_CONFIGURATION_LOCAL__OWN_ID = eINSTANCE.getPortInstanceConfiguration_Local_OwnID();

		/**
		 * The meta object literal for the '<em><b>Writers ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_INSTANCE_CONFIGURATION_LOCAL__WRITERS_ID = eINSTANCE.getPortInstanceConfiguration_Local_WritersID();

		/**
		 * The meta object literal for the '{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_DDSImpl <em>Port Instance Configuration DDS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.muml_container.impl.PortInstanceConfiguration_DDSImpl
		 * @see org.muml.psm.muml_container.impl.Muml_containerPackageImpl#getPortInstanceConfiguration_DDS()
		 * @generated
		 */
		EClass PORT_INSTANCE_CONFIGURATION_DDS = eINSTANCE.getPortInstanceConfiguration_DDS();

		/**
		 * The meta object literal for the '<em><b>Domain ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_ID = eINSTANCE.getPortInstanceConfiguration_DDS_DomainID();

		/**
		 * The meta object literal for the '<em><b>Partition ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_INSTANCE_CONFIGURATION_DDS__PARTITION_ID = eINSTANCE.getPortInstanceConfiguration_DDS_PartitionID();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE_CONFIGURATION_DDS__PUBLISHER = eINSTANCE.getPortInstanceConfiguration_DDS_Publisher();

		/**
		 * The meta object literal for the '<em><b>Subscriber</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE_CONFIGURATION_DDS__SUBSCRIBER = eINSTANCE.getPortInstanceConfiguration_DDS_Subscriber();

		/**
		 * The meta object literal for the '<em><b>Domain Participant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_PARTICIPANT = eINSTANCE.getPortInstanceConfiguration_DDS_DomainParticipant();

		/**
		 * The meta object literal for the '{@link org.muml.psm.muml_container.impl.ECUConfigurationImpl <em>ECU Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.muml_container.impl.ECUConfigurationImpl
		 * @see org.muml.psm.muml_container.impl.Muml_containerPackageImpl#getECUConfiguration()
		 * @generated
		 */
		EClass ECU_CONFIGURATION = eINSTANCE.getECUConfiguration();

		/**
		 * The meta object literal for the '<em><b>Structured Resource Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU_CONFIGURATION__STRUCTURED_RESOURCE_INSTANCE = eINSTANCE.getECUConfiguration_StructuredResourceInstance();

		/**
		 * The meta object literal for the '<em><b>Component Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU_CONFIGURATION__COMPONENT_CONTAINERS = eINSTANCE.getECUConfiguration_ComponentContainers();

		/**
		 * The meta object literal for the '{@link org.muml.psm.muml_container.impl.MultiPortInstanceConfigurationImpl <em>Multi Port Instance Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.muml_container.impl.MultiPortInstanceConfigurationImpl
		 * @see org.muml.psm.muml_container.impl.Muml_containerPackageImpl#getMultiPortInstanceConfiguration()
		 * @generated
		 */
		EClass MULTI_PORT_INSTANCE_CONFIGURATION = eINSTANCE.getMultiPortInstanceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Port Instance Configurations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PORT_INSTANCE_CONFIGURATION__PORT_INSTANCE_CONFIGURATIONS = eINSTANCE.getMultiPortInstanceConfiguration_PortInstanceConfigurations();

		/**
		 * The meta object literal for the '{@link org.muml.psm.muml_container.impl.SystemConfigurationImpl <em>System Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.muml_container.impl.SystemConfigurationImpl
		 * @see org.muml.psm.muml_container.impl.Muml_containerPackageImpl#getSystemConfiguration()
		 * @generated
		 */
		EClass SYSTEM_CONFIGURATION = eINSTANCE.getSystemConfiguration();

		/**
		 * The meta object literal for the '<em><b>System Allocation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONFIGURATION__SYSTEM_ALLOCATION = eINSTANCE.getSystemConfiguration_SystemAllocation();

		/**
		 * The meta object literal for the '<em><b>Ecu Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONFIGURATION__ECU_CONFIGURATIONS = eINSTANCE.getSystemConfiguration_EcuConfigurations();

	}

} //Muml_containerPackage
