/**
 */
package org.muml.pm.hardware.hwplatforminstance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.CorePackage;
import org.muml.pim.connector.ConnectorPackage;

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
 * <!-- begin-model-doc -->
 * This package contains all classes of the Platform Instance Viewpoint.
 * 
 * <!-- end-model-doc -->
 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstanceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface HwplatforminstancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hwplatforminstance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/pm/hardware/hwplatforminstance/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hwplatforminstance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwplatforminstancePackage eINSTANCE = org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPlatformInstanceImpl <em>HW Platform Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatforminstance.impl.HWPlatformInstanceImpl
	 * @see org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getHWPlatformInstance()
	 * @generated
	 */
	int HW_PLATFORM_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Hwplatform Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delegation Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__DELEGATION_PORTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Embedded HPIC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__EMBEDDED_HPIC = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent HPIC</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__PARENT_HPIC = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>HW Platform Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>HW Platform Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPlatformInstanceConfigurationImpl <em>HW Platform Instance Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatforminstance.impl.HWPlatformInstanceConfigurationImpl
	 * @see org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getHWPlatformInstanceConfiguration()
	 * @generated
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__ANNOTATIONS = CorePackage.COMMENTABLE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Hwplatform Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Networking Hardware Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent HW Platform Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__PARENT_HW_PLATFORM_INSTANCE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Connector Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORK_CONNECTOR_INSTANCES = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>HW Platform Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>HW Platform Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPortInstanceImpl <em>HW Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatforminstance.impl.HWPortInstanceImpl
	 * @see org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getHWPortInstance()
	 * @generated
	 */
	int HW_PORT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__ANNOTATIONS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__EXTENSIONS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__NAME = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__COMMENT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__CONNECTOR_INSTANCES = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__TYPE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent Resource Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__COMMUNICATION_RESOURCE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__PROTOCOL = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__CARDINALITY = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multi HW Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__MULTI_HW_PORT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Port Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__PORT_KIND = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Connected Network Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__CONNECTED_NETWORK_CONNECTOR_INSTANCES = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Network Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__IS_NETWORK_INTERFACE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>HW Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE_FEATURE_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>HW Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE_OPERATION_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatforminstance.impl.NetworkingHardwareInstanceImpl <em>Networking Hardware Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatforminstance.impl.NetworkingHardwareInstanceImpl
	 * @see org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getNetworkingHardwareInstance()
	 * @generated
	 */
	int NETWORKING_HARDWARE_INSTANCE = 5;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatforminstance.impl.NetworkBridgeInstanceImpl <em>Network Bridge Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatforminstance.impl.NetworkBridgeInstanceImpl
	 * @see org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getNetworkBridgeInstance()
	 * @generated
	 */
	int NETWORK_BRIDGE_INSTANCE = 4;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatforminstance.impl.BusInstanceImpl <em>Bus Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatforminstance.impl.BusInstanceImpl
	 * @see org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getBusInstance()
	 * @generated
	 */
	int BUS_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__ANNOTATIONS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__EXTENSIONS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__NAME = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__COMMENT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__CONNECTOR_INSTANCES = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__TYPE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Connected HW Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__CONNECTED_HW_PORT_INSTANCES = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__BUS_TYPE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__PROTOCOL = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__BANDWIDTH = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bus Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE_FEATURE_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bus Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE_OPERATION_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE__ANNOTATIONS = CorePackage.EXTENDABLE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The number of structural features of the '<em>Networking Hardware Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Networking Hardware Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE_INSTANCE__ANNOTATIONS = NETWORKING_HARDWARE_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE_INSTANCE__EXTENSIONS = NETWORKING_HARDWARE_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE_INSTANCE__NAME = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE_INSTANCE__COMMENT = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE_INSTANCE__CONNECTOR_INSTANCES = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE_INSTANCE__TYPE = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connected Network Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE_INSTANCE__CONNECTED_NETWORK_CONNECTOR_INSTANCES = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Network Bridge Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE_INSTANCE__NETWORK_BRIDGE_TYPE = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Network Bridge Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE_INSTANCE_FEATURE_COUNT = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Network Bridge Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE_INSTANCE_OPERATION_COUNT = NETWORKING_HARDWARE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatforminstance.impl.DelegationHWPortInstanceImpl <em>Delegation HW Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatforminstance.impl.DelegationHWPortInstanceImpl
	 * @see org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getDelegationHWPortInstance()
	 * @generated
	 */
	int DELEGATION_HW_PORT_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE__ANNOTATIONS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE__EXTENSIONS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE__NAME = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE__COMMENT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE__CONNECTOR_INSTANCES = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE__TYPE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent HW Platform Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE__PARENT_HW_PLATFORM_INSTANCE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delegation HW Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE_FEATURE_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delegation HW Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE_OPERATION_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatforminstance.impl.NetworkConnectorInstanceImpl <em>Network Connector Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatforminstance.impl.NetworkConnectorInstanceImpl
	 * @see org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getNetworkConnectorInstance()
	 * @generated
	 */
	int NETWORK_CONNECTOR_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR_INSTANCE__ANNOTATIONS = ConnectorPackage.CONNECTOR_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR_INSTANCE__EXTENSIONS = ConnectorPackage.CONNECTOR_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR_INSTANCE__COMMENT = ConnectorPackage.CONNECTOR_INSTANCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR_INSTANCE__TYPE = ConnectorPackage.CONNECTOR_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Connector Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES = ConnectorPackage.CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Connected HW Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR_INSTANCE__CONNECTED_HW_PORT_INSTANCES = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR_INSTANCE__PROTOCOL = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR_INSTANCE__BANDWIDTH = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connector Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR_INSTANCE__CONNECTOR_KIND = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR_INSTANCE__NETWORK_CONNECTOR_TYPE = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Network Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR_INSTANCE_FEATURE_COUNT = ConnectorPackage.CONNECTOR_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Network Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR_INSTANCE_OPERATION_COUNT = ConnectorPackage.CONNECTOR_INSTANCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance <em>HW Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Platform Instance</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance
	 * @generated
	 */
	EClass getHWPlatformInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getHwplatformType <em>Hwplatform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hwplatform Type</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getHwplatformType()
	 * @see #getHWPlatformInstance()
	 * @generated
	 */
	EReference getHWPlatformInstance_HwplatformType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getDelegationPorts <em>Delegation Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegation Ports</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getDelegationPorts()
	 * @see #getHWPlatformInstance()
	 * @generated
	 */
	EReference getHWPlatformInstance_DelegationPorts();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getEmbeddedHPIC <em>Embedded HPIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Embedded HPIC</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getEmbeddedHPIC()
	 * @see #getHWPlatformInstance()
	 * @generated
	 */
	EReference getHWPlatformInstance_EmbeddedHPIC();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getParentHPIC <em>Parent HPIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent HPIC</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance#getParentHPIC()
	 * @see #getHWPlatformInstance()
	 * @generated
	 */
	EReference getHWPlatformInstance_ParentHPIC();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration <em>HW Platform Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Platform Instance Configuration</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration
	 * @generated
	 */
	EClass getHWPlatformInstanceConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getHwplatformInstances <em>Hwplatform Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hwplatform Instances</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getHwplatformInstances()
	 * @see #getHWPlatformInstanceConfiguration()
	 * @generated
	 */
	EReference getHWPlatformInstanceConfiguration_HwplatformInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getNetworkingHardwareInstances <em>Networking Hardware Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networking Hardware Instances</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getNetworkingHardwareInstances()
	 * @see #getHWPlatformInstanceConfiguration()
	 * @generated
	 */
	EReference getHWPlatformInstanceConfiguration_NetworkingHardwareInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getResources()
	 * @see #getHWPlatformInstanceConfiguration()
	 * @generated
	 */
	EReference getHWPlatformInstanceConfiguration_Resources();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getParentHWPlatformInstance <em>Parent HW Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent HW Platform Instance</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getParentHWPlatformInstance()
	 * @see #getHWPlatformInstanceConfiguration()
	 * @generated
	 */
	EReference getHWPlatformInstanceConfiguration_ParentHWPlatformInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getNetworkConnectorInstances <em>Network Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network Connector Instances</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getNetworkConnectorInstances()
	 * @see #getHWPlatformInstanceConfiguration()
	 * @generated
	 */
	EReference getHWPlatformInstanceConfiguration_NetworkConnectorInstances();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatforminstance.HWPortInstance <em>HW Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Port Instance</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPortInstance
	 * @generated
	 */
	EClass getHWPortInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pm.hardware.hwplatforminstance.HWPortInstance#getConnectedNetworkConnectorInstances <em>Connected Network Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Network Connector Instances</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPortInstance#getConnectedNetworkConnectorInstances()
	 * @see #getHWPortInstance()
	 * @generated
	 */
	EReference getHWPortInstance_ConnectedNetworkConnectorInstances();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwplatforminstance.HWPortInstance#isIsNetworkInterface <em>Is Network Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Network Interface</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.HWPortInstance#isIsNetworkInterface()
	 * @see #getHWPortInstance()
	 * @generated
	 */
	EAttribute getHWPortInstance_IsNetworkInterface();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatforminstance.BusInstance <em>Bus Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Instance</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.BusInstance
	 * @generated
	 */
	EClass getBusInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pm.hardware.hwplatforminstance.BusInstance#getConnectedHWPortInstances <em>Connected HW Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected HW Port Instances</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.BusInstance#getConnectedHWPortInstances()
	 * @see #getBusInstance()
	 * @generated
	 */
	EReference getBusInstance_ConnectedHWPortInstances();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.hardware.hwplatforminstance.BusInstance#getBusType <em>Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus Type</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.BusInstance#getBusType()
	 * @see #getBusInstance()
	 * @generated
	 */
	EReference getBusInstance_BusType();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.hardware.hwplatforminstance.BusInstance#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.BusInstance#getProtocol()
	 * @see #getBusInstance()
	 * @generated
	 */
	EReference getBusInstance_Protocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwplatforminstance.BusInstance#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bandwidth</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.BusInstance#getBandwidth()
	 * @see #getBusInstance()
	 * @generated
	 */
	EReference getBusInstance_Bandwidth();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatforminstance.NetworkBridgeInstance <em>Network Bridge Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Bridge Instance</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.NetworkBridgeInstance
	 * @generated
	 */
	EClass getNetworkBridgeInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pm.hardware.hwplatforminstance.NetworkBridgeInstance#getConnectedNetworkConnectorInstances <em>Connected Network Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Network Connector Instances</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.NetworkBridgeInstance#getConnectedNetworkConnectorInstances()
	 * @see #getNetworkBridgeInstance()
	 * @generated
	 */
	EReference getNetworkBridgeInstance_ConnectedNetworkConnectorInstances();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.hardware.hwplatforminstance.NetworkBridgeInstance#getNetworkBridgeType <em>Network Bridge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network Bridge Type</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.NetworkBridgeInstance#getNetworkBridgeType()
	 * @see #getNetworkBridgeInstance()
	 * @generated
	 */
	EReference getNetworkBridgeInstance_NetworkBridgeType();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatforminstance.NetworkingHardwareInstance <em>Networking Hardware Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networking Hardware Instance</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.NetworkingHardwareInstance
	 * @generated
	 */
	EClass getNetworkingHardwareInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance <em>Delegation HW Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation HW Port Instance</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance
	 * @generated
	 */
	EClass getDelegationHWPortInstance();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance#getParentHWPlatformInstance <em>Parent HW Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent HW Platform Instance</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance#getParentHWPlatformInstance()
	 * @see #getDelegationHWPortInstance()
	 * @generated
	 */
	EReference getDelegationHWPortInstance_ParentHWPlatformInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance <em>Network Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Connector Instance</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance
	 * @generated
	 */
	EClass getNetworkConnectorInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getConnectedHWPortInstances <em>Connected HW Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected HW Port Instances</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getConnectedHWPortInstances()
	 * @see #getNetworkConnectorInstance()
	 * @generated
	 */
	EReference getNetworkConnectorInstance_ConnectedHWPortInstances();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getProtocol()
	 * @see #getNetworkConnectorInstance()
	 * @generated
	 */
	EReference getNetworkConnectorInstance_Protocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bandwidth</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getBandwidth()
	 * @see #getNetworkConnectorInstance()
	 * @generated
	 */
	EReference getNetworkConnectorInstance_Bandwidth();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getConnectorKind <em>Connector Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Kind</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getConnectorKind()
	 * @see #getNetworkConnectorInstance()
	 * @generated
	 */
	EAttribute getNetworkConnectorInstance_ConnectorKind();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getNetworkConnectorType <em>Network Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network Connector Type</em>'.
	 * @see org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance#getNetworkConnectorType()
	 * @see #getNetworkConnectorInstance()
	 * @generated
	 */
	EReference getNetworkConnectorInstance_NetworkConnectorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HwplatforminstanceFactory getHwplatforminstanceFactory();

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
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPlatformInstanceImpl <em>HW Platform Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatforminstance.impl.HWPlatformInstanceImpl
		 * @see org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getHWPlatformInstance()
		 * @generated
		 */
		EClass HW_PLATFORM_INSTANCE = eINSTANCE.getHWPlatformInstance();

		/**
		 * The meta object literal for the '<em><b>Hwplatform Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE = eINSTANCE.getHWPlatformInstance_HwplatformType();

		/**
		 * The meta object literal for the '<em><b>Delegation Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE__DELEGATION_PORTS = eINSTANCE.getHWPlatformInstance_DelegationPorts();

		/**
		 * The meta object literal for the '<em><b>Embedded HPIC</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE__EMBEDDED_HPIC = eINSTANCE.getHWPlatformInstance_EmbeddedHPIC();

		/**
		 * The meta object literal for the '<em><b>Parent HPIC</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE__PARENT_HPIC = eINSTANCE.getHWPlatformInstance_ParentHPIC();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPlatformInstanceConfigurationImpl <em>HW Platform Instance Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatforminstance.impl.HWPlatformInstanceConfigurationImpl
		 * @see org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getHWPlatformInstanceConfiguration()
		 * @generated
		 */
		EClass HW_PLATFORM_INSTANCE_CONFIGURATION = eINSTANCE.getHWPlatformInstanceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Hwplatform Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES = eINSTANCE.getHWPlatformInstanceConfiguration_HwplatformInstances();

		/**
		 * The meta object literal for the '<em><b>Networking Hardware Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES = eINSTANCE.getHWPlatformInstanceConfiguration_NetworkingHardwareInstances();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES = eINSTANCE.getHWPlatformInstanceConfiguration_Resources();

		/**
		 * The meta object literal for the '<em><b>Parent HW Platform Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE_CONFIGURATION__PARENT_HW_PLATFORM_INSTANCE = eINSTANCE.getHWPlatformInstanceConfiguration_ParentHWPlatformInstance();

		/**
		 * The meta object literal for the '<em><b>Network Connector Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORK_CONNECTOR_INSTANCES = eINSTANCE.getHWPlatformInstanceConfiguration_NetworkConnectorInstances();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPortInstanceImpl <em>HW Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatforminstance.impl.HWPortInstanceImpl
		 * @see org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getHWPortInstance()
		 * @generated
		 */
		EClass HW_PORT_INSTANCE = eINSTANCE.getHWPortInstance();

		/**
		 * The meta object literal for the '<em><b>Connected Network Connector Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_INSTANCE__CONNECTED_NETWORK_CONNECTOR_INSTANCES = eINSTANCE.getHWPortInstance_ConnectedNetworkConnectorInstances();

		/**
		 * The meta object literal for the '<em><b>Is Network Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_PORT_INSTANCE__IS_NETWORK_INTERFACE = eINSTANCE.getHWPortInstance_IsNetworkInterface();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatforminstance.impl.BusInstanceImpl <em>Bus Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatforminstance.impl.BusInstanceImpl
		 * @see org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getBusInstance()
		 * @generated
		 */
		EClass BUS_INSTANCE = eINSTANCE.getBusInstance();

		/**
		 * The meta object literal for the '<em><b>Connected HW Port Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_INSTANCE__CONNECTED_HW_PORT_INSTANCES = eINSTANCE.getBusInstance_ConnectedHWPortInstances();

		/**
		 * The meta object literal for the '<em><b>Bus Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_INSTANCE__BUS_TYPE = eINSTANCE.getBusInstance_BusType();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_INSTANCE__PROTOCOL = eINSTANCE.getBusInstance_Protocol();

		/**
		 * The meta object literal for the '<em><b>Bandwidth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_INSTANCE__BANDWIDTH = eINSTANCE.getBusInstance_Bandwidth();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatforminstance.impl.NetworkBridgeInstanceImpl <em>Network Bridge Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatforminstance.impl.NetworkBridgeInstanceImpl
		 * @see org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getNetworkBridgeInstance()
		 * @generated
		 */
		EClass NETWORK_BRIDGE_INSTANCE = eINSTANCE.getNetworkBridgeInstance();

		/**
		 * The meta object literal for the '<em><b>Connected Network Connector Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_BRIDGE_INSTANCE__CONNECTED_NETWORK_CONNECTOR_INSTANCES = eINSTANCE.getNetworkBridgeInstance_ConnectedNetworkConnectorInstances();

		/**
		 * The meta object literal for the '<em><b>Network Bridge Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_BRIDGE_INSTANCE__NETWORK_BRIDGE_TYPE = eINSTANCE.getNetworkBridgeInstance_NetworkBridgeType();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatforminstance.impl.NetworkingHardwareInstanceImpl <em>Networking Hardware Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatforminstance.impl.NetworkingHardwareInstanceImpl
		 * @see org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getNetworkingHardwareInstance()
		 * @generated
		 */
		EClass NETWORKING_HARDWARE_INSTANCE = eINSTANCE.getNetworkingHardwareInstance();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatforminstance.impl.DelegationHWPortInstanceImpl <em>Delegation HW Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatforminstance.impl.DelegationHWPortInstanceImpl
		 * @see org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getDelegationHWPortInstance()
		 * @generated
		 */
		EClass DELEGATION_HW_PORT_INSTANCE = eINSTANCE.getDelegationHWPortInstance();

		/**
		 * The meta object literal for the '<em><b>Parent HW Platform Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_HW_PORT_INSTANCE__PARENT_HW_PLATFORM_INSTANCE = eINSTANCE.getDelegationHWPortInstance_ParentHWPlatformInstance();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatforminstance.impl.NetworkConnectorInstanceImpl <em>Network Connector Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatforminstance.impl.NetworkConnectorInstanceImpl
		 * @see org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getNetworkConnectorInstance()
		 * @generated
		 */
		EClass NETWORK_CONNECTOR_INSTANCE = eINSTANCE.getNetworkConnectorInstance();

		/**
		 * The meta object literal for the '<em><b>Connected HW Port Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONNECTOR_INSTANCE__CONNECTED_HW_PORT_INSTANCES = eINSTANCE.getNetworkConnectorInstance_ConnectedHWPortInstances();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONNECTOR_INSTANCE__PROTOCOL = eINSTANCE.getNetworkConnectorInstance_Protocol();

		/**
		 * The meta object literal for the '<em><b>Bandwidth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONNECTOR_INSTANCE__BANDWIDTH = eINSTANCE.getNetworkConnectorInstance_Bandwidth();

		/**
		 * The meta object literal for the '<em><b>Connector Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_CONNECTOR_INSTANCE__CONNECTOR_KIND = eINSTANCE.getNetworkConnectorInstance_ConnectorKind();

		/**
		 * The meta object literal for the '<em><b>Network Connector Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONNECTOR_INSTANCE__NETWORK_CONNECTOR_TYPE = eINSTANCE.getNetworkConnectorInstance_NetworkConnectorType();

	}

} //HwplatforminstancePackage
