/**
 */
package org.muml.pm.hardware.hwplatform;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.mumlcore.CorePackage;
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
 * The package platform contains all classes of the Platform Type Viewpoint.
 * Hardware platforms are defined at the type level and may be instantiated in a HWPlatformInstanceConfiguration at the Platform Instance Viewpoint.
 * 
 * <!-- end-model-doc -->
 * @see org.muml.pm.hardware.hwplatform.HwplatformFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface HwplatformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hwplatform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/pm/hardware/hwplatform/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hwplatform";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwplatformPackage eINSTANCE = org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatform.impl.HWPlatformImpl <em>HW Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatform.impl.HWPlatformImpl
	 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getHWPlatform()
	 * @generated
	 */
	int HW_PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Embedded Platform Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM__EMBEDDED_PLATFORM_PARTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Networking Hardware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM__NETWORKING_HARDWARE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delegation Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM__DELEGATION_PORTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Network Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM__NETWORK_CONNECTORS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>HW Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>HW Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatform.impl.PlatformPartImpl <em>Platform Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatform.impl.PlatformPartImpl
	 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getPlatformPart()
	 * @generated
	 */
	int PLATFORM_PART = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent HW Platform</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART__PARENT_HW_PLATFORM = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART__CARDINALITY = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hw Port Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART__HW_PORT_PARTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Platform Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Platform Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatform.impl.HWPlatformPartImpl <em>HW Platform Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatform.impl.HWPlatformPartImpl
	 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getHWPlatformPart()
	 * @generated
	 */
	int HW_PLATFORM_PART = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART__EXTENSIONS = PLATFORM_PART__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART__NAME = PLATFORM_PART__NAME;

	/**
	 * The feature id for the '<em><b>Parent HW Platform</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART__PARENT_HW_PLATFORM = PLATFORM_PART__PARENT_HW_PLATFORM;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART__CARDINALITY = PLATFORM_PART__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Hw Port Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART__HW_PORT_PARTS = PLATFORM_PART__HW_PORT_PARTS;

	/**
	 * The feature id for the '<em><b>Hwplatform Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART__HWPLATFORM_TYPE = PLATFORM_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Embedded Bridges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART__EMBEDDED_BRIDGES = PLATFORM_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HW Platform Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART_FEATURE_COUNT = PLATFORM_PART_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___GET_EXTENSION__ECLASS = PLATFORM_PART___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>HW Platform Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART_OPERATION_COUNT = PLATFORM_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatform.impl.ResourcePartImpl <em>Resource Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatform.impl.ResourcePartImpl
	 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getResourcePart()
	 * @generated
	 */
	int RESOURCE_PART = 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART__EXTENSIONS = PLATFORM_PART__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART__NAME = PLATFORM_PART__NAME;

	/**
	 * The feature id for the '<em><b>Parent HW Platform</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART__PARENT_HW_PLATFORM = PLATFORM_PART__PARENT_HW_PLATFORM;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART__CARDINALITY = PLATFORM_PART__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Hw Port Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART__HW_PORT_PARTS = PLATFORM_PART__HW_PORT_PARTS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART__RESOURCE_TYPE = PLATFORM_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART_FEATURE_COUNT = PLATFORM_PART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___GET_EXTENSION__ECLASS = PLATFORM_PART___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Resource Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART_OPERATION_COUNT = PLATFORM_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatform.impl.DelegationHWPortImpl <em>Delegation HW Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatform.impl.DelegationHWPortImpl
	 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getDelegationHWPort()
	 * @generated
	 */
	int DELEGATION_HW_PORT = 4;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT__EXTENSIONS = ConnectorPackage.CONNECTOR_ENDPOINT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT__COMMENT = ConnectorPackage.CONNECTOR_ENDPOINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT__CONNECTORS = ConnectorPackage.CONNECTOR_ENDPOINT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT__NAME = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Resource Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT__PARENT_RESOURCE_INSTANCE = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Communication Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT__COMMUNICATION_RESOURCE = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT__PROTOCOL = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT__CARDINALITY = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Multi HW Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT__MULTI_HW_PORT = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Port Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT__PORT_KIND = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Delegation HW Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_FEATURE_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Delegation HW Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_OPERATION_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatform.impl.HWPortPartImpl <em>HW Port Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatform.impl.HWPortPartImpl
	 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getHWPortPart()
	 * @generated
	 */
	int HW_PORT_PART = 5;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__EXTENSIONS = ConnectorPackage.CONNECTOR_ENDPOINT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__COMMENT = ConnectorPackage.CONNECTOR_ENDPOINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__CONNECTORS = ConnectorPackage.CONNECTOR_ENDPOINT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Connected Network Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__CONNECTED_NETWORK_CONNECTOR = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Queuing Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__QUEUING_TIME = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Payload Data Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__PAYLOAD_DATA_SIZE = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Platform Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__PARENT_PLATFORM_PART = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hwport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__HWPORT = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>HW Port Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART_FEATURE_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>HW Port Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART_OPERATION_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatform.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatform.impl.BusImpl
	 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 6;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__EXTENSIONS = ConnectorPackage.CONNECTOR_ENDPOINT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__COMMENT = ConnectorPackage.CONNECTOR_ENDPOINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CONNECTORS = ConnectorPackage.CONNECTOR_ENDPOINT__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Connected HW Port Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CONNECTED_HW_PORT_PARTS = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__PROTOCOL = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BANDWIDTH = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatform.impl.NetworkingHardwareImpl <em>Networking Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatform.impl.NetworkingHardwareImpl
	 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getNetworkingHardware()
	 * @generated
	 */
	int NETWORKING_HARDWARE = 8;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The number of structural features of the '<em>Networking Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Networking Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatform.impl.NetworkBridgeImpl <em>Network Bridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatform.impl.NetworkBridgeImpl
	 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getNetworkBridge()
	 * @generated
	 */
	int NETWORK_BRIDGE = 7;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE__EXTENSIONS = NETWORKING_HARDWARE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE__COMMENT = NETWORKING_HARDWARE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE__CONNECTORS = NETWORKING_HARDWARE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connected Network Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE__CONNECTED_NETWORK_CONNECTOR = NETWORKING_HARDWARE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE__DELAY = NETWORKING_HARDWARE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Network Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE_FEATURE_COUNT = NETWORKING_HARDWARE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___GET_EXTENSION__ECLASS = NETWORKING_HARDWARE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Network Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE_OPERATION_COUNT = NETWORKING_HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwplatform.impl.NetworkConnectorImpl <em>Network Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatform.impl.NetworkConnectorImpl
	 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getNetworkConnector()
	 * @generated
	 */
	int NETWORK_CONNECTOR = 9;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR__EXTENSIONS = ConnectorPackage.CONNECTOR__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR__COMMENT = ConnectorPackage.CONNECTOR__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR__CONNECTOR_ENDPOINTS = ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Self Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR__SELF_CONNECTOR = ConnectorPackage.CONNECTOR__SELF_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR__PROTOCOL = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR__BANDWIDTH = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hwport Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR__HWPORT_PARTS = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connector Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR__CONNECTOR_KIND = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Delegation HW Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR__DELEGATION_HW_PORTS = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Network Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR_FEATURE_COUNT = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Network Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR_OPERATION_COUNT = ConnectorPackage.CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatform.HWPlatform <em>HW Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Platform</em>'.
	 * @see org.muml.pm.hardware.hwplatform.HWPlatform
	 * @generated
	 */
	EClass getHWPlatform();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwplatform.HWPlatform#getEmbeddedPlatformParts <em>Embedded Platform Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Platform Parts</em>'.
	 * @see org.muml.pm.hardware.hwplatform.HWPlatform#getEmbeddedPlatformParts()
	 * @see #getHWPlatform()
	 * @generated
	 */
	EReference getHWPlatform_EmbeddedPlatformParts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwplatform.HWPlatform#getNetworkingHardware <em>Networking Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networking Hardware</em>'.
	 * @see org.muml.pm.hardware.hwplatform.HWPlatform#getNetworkingHardware()
	 * @see #getHWPlatform()
	 * @generated
	 */
	EReference getHWPlatform_NetworkingHardware();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwplatform.HWPlatform#getDelegationPorts <em>Delegation Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegation Ports</em>'.
	 * @see org.muml.pm.hardware.hwplatform.HWPlatform#getDelegationPorts()
	 * @see #getHWPlatform()
	 * @generated
	 */
	EReference getHWPlatform_DelegationPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwplatform.HWPlatform#getNetworkConnectors <em>Network Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network Connectors</em>'.
	 * @see org.muml.pm.hardware.hwplatform.HWPlatform#getNetworkConnectors()
	 * @see #getHWPlatform()
	 * @generated
	 */
	EReference getHWPlatform_NetworkConnectors();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatform.PlatformPart <em>Platform Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Part</em>'.
	 * @see org.muml.pm.hardware.hwplatform.PlatformPart
	 * @generated
	 */
	EClass getPlatformPart();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pm.hardware.hwplatform.PlatformPart#getParentHWPlatform <em>Parent HW Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent HW Platform</em>'.
	 * @see org.muml.pm.hardware.hwplatform.PlatformPart#getParentHWPlatform()
	 * @see #getPlatformPart()
	 * @generated
	 */
	EReference getPlatformPart_ParentHWPlatform();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwplatform.PlatformPart#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see org.muml.pm.hardware.hwplatform.PlatformPart#getCardinality()
	 * @see #getPlatformPart()
	 * @generated
	 */
	EReference getPlatformPart_Cardinality();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwplatform.PlatformPart#getHwPortParts <em>Hw Port Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hw Port Parts</em>'.
	 * @see org.muml.pm.hardware.hwplatform.PlatformPart#getHwPortParts()
	 * @see #getPlatformPart()
	 * @generated
	 */
	EReference getPlatformPart_HwPortParts();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatform.HWPlatformPart <em>HW Platform Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Platform Part</em>'.
	 * @see org.muml.pm.hardware.hwplatform.HWPlatformPart
	 * @generated
	 */
	EClass getHWPlatformPart();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.hardware.hwplatform.HWPlatformPart#getHwplatformType <em>Hwplatform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hwplatform Type</em>'.
	 * @see org.muml.pm.hardware.hwplatform.HWPlatformPart#getHwplatformType()
	 * @see #getHWPlatformPart()
	 * @generated
	 */
	EReference getHWPlatformPart_HwplatformType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwplatform.HWPlatformPart#getEmbeddedBridges <em>Embedded Bridges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Bridges</em>'.
	 * @see org.muml.pm.hardware.hwplatform.HWPlatformPart#getEmbeddedBridges()
	 * @see #getHWPlatformPart()
	 * @generated
	 */
	EReference getHWPlatformPart_EmbeddedBridges();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatform.ResourcePart <em>Resource Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Part</em>'.
	 * @see org.muml.pm.hardware.hwplatform.ResourcePart
	 * @generated
	 */
	EClass getResourcePart();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.hardware.hwplatform.ResourcePart#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Type</em>'.
	 * @see org.muml.pm.hardware.hwplatform.ResourcePart#getResourceType()
	 * @see #getResourcePart()
	 * @generated
	 */
	EReference getResourcePart_ResourceType();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatform.DelegationHWPort <em>Delegation HW Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation HW Port</em>'.
	 * @see org.muml.pm.hardware.hwplatform.DelegationHWPort
	 * @generated
	 */
	EClass getDelegationHWPort();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatform.HWPortPart <em>HW Port Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Port Part</em>'.
	 * @see org.muml.pm.hardware.hwplatform.HWPortPart
	 * @generated
	 */
	EClass getHWPortPart();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pm.hardware.hwplatform.HWPortPart#getConnectedNetworkConnector <em>Connected Network Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Network Connector</em>'.
	 * @see org.muml.pm.hardware.hwplatform.HWPortPart#getConnectedNetworkConnector()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EReference getHWPortPart_ConnectedNetworkConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwplatform.HWPortPart#getQueuingTime <em>Queuing Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Queuing Time</em>'.
	 * @see org.muml.pm.hardware.hwplatform.HWPortPart#getQueuingTime()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EReference getHWPortPart_QueuingTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwplatform.HWPortPart#getPayloadDataSize <em>Payload Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payload Data Size</em>'.
	 * @see org.muml.pm.hardware.hwplatform.HWPortPart#getPayloadDataSize()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EReference getHWPortPart_PayloadDataSize();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pm.hardware.hwplatform.HWPortPart#getParentPlatformPart <em>Parent Platform Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Platform Part</em>'.
	 * @see org.muml.pm.hardware.hwplatform.HWPortPart#getParentPlatformPart()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EReference getHWPortPart_ParentPlatformPart();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.hardware.hwplatform.HWPortPart#getHwport <em>Hwport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hwport</em>'.
	 * @see org.muml.pm.hardware.hwplatform.HWPortPart#getHwport()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EReference getHWPortPart_Hwport();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatform.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see org.muml.pm.hardware.hwplatform.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pm.hardware.hwplatform.Bus#getConnectedHWPortParts <em>Connected HW Port Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected HW Port Parts</em>'.
	 * @see org.muml.pm.hardware.hwplatform.Bus#getConnectedHWPortParts()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_ConnectedHWPortParts();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.hardware.hwplatform.Bus#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see org.muml.pm.hardware.hwplatform.Bus#getProtocol()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Protocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwplatform.Bus#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bandwidth</em>'.
	 * @see org.muml.pm.hardware.hwplatform.Bus#getBandwidth()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Bandwidth();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatform.NetworkBridge <em>Network Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Bridge</em>'.
	 * @see org.muml.pm.hardware.hwplatform.NetworkBridge
	 * @generated
	 */
	EClass getNetworkBridge();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pm.hardware.hwplatform.NetworkBridge#getConnectedNetworkConnector <em>Connected Network Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Network Connector</em>'.
	 * @see org.muml.pm.hardware.hwplatform.NetworkBridge#getConnectedNetworkConnector()
	 * @see #getNetworkBridge()
	 * @generated
	 */
	EReference getNetworkBridge_ConnectedNetworkConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwplatform.NetworkBridge#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delay</em>'.
	 * @see org.muml.pm.hardware.hwplatform.NetworkBridge#getDelay()
	 * @see #getNetworkBridge()
	 * @generated
	 */
	EReference getNetworkBridge_Delay();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatform.NetworkingHardware <em>Networking Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networking Hardware</em>'.
	 * @see org.muml.pm.hardware.hwplatform.NetworkingHardware
	 * @generated
	 */
	EClass getNetworkingHardware();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwplatform.NetworkConnector <em>Network Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Connector</em>'.
	 * @see org.muml.pm.hardware.hwplatform.NetworkConnector
	 * @generated
	 */
	EClass getNetworkConnector();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.hardware.hwplatform.NetworkConnector#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see org.muml.pm.hardware.hwplatform.NetworkConnector#getProtocol()
	 * @see #getNetworkConnector()
	 * @generated
	 */
	EReference getNetworkConnector_Protocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwplatform.NetworkConnector#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bandwidth</em>'.
	 * @see org.muml.pm.hardware.hwplatform.NetworkConnector#getBandwidth()
	 * @see #getNetworkConnector()
	 * @generated
	 */
	EReference getNetworkConnector_Bandwidth();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pm.hardware.hwplatform.NetworkConnector#getHwportParts <em>Hwport Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hwport Parts</em>'.
	 * @see org.muml.pm.hardware.hwplatform.NetworkConnector#getHwportParts()
	 * @see #getNetworkConnector()
	 * @generated
	 */
	EReference getNetworkConnector_HwportParts();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwplatform.NetworkConnector#getConnectorKind <em>Connector Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Kind</em>'.
	 * @see org.muml.pm.hardware.hwplatform.NetworkConnector#getConnectorKind()
	 * @see #getNetworkConnector()
	 * @generated
	 */
	EAttribute getNetworkConnector_ConnectorKind();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pm.hardware.hwplatform.NetworkConnector#getDelegationHWPorts <em>Delegation HW Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegation HW Ports</em>'.
	 * @see org.muml.pm.hardware.hwplatform.NetworkConnector#getDelegationHWPorts()
	 * @see #getNetworkConnector()
	 * @generated
	 */
	EReference getNetworkConnector_DelegationHWPorts();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HwplatformFactory getHwplatformFactory();

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
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatform.impl.HWPlatformImpl <em>HW Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatform.impl.HWPlatformImpl
		 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getHWPlatform()
		 * @generated
		 */
		EClass HW_PLATFORM = eINSTANCE.getHWPlatform();

		/**
		 * The meta object literal for the '<em><b>Embedded Platform Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM__EMBEDDED_PLATFORM_PARTS = eINSTANCE.getHWPlatform_EmbeddedPlatformParts();

		/**
		 * The meta object literal for the '<em><b>Networking Hardware</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM__NETWORKING_HARDWARE = eINSTANCE.getHWPlatform_NetworkingHardware();

		/**
		 * The meta object literal for the '<em><b>Delegation Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM__DELEGATION_PORTS = eINSTANCE.getHWPlatform_DelegationPorts();

		/**
		 * The meta object literal for the '<em><b>Network Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM__NETWORK_CONNECTORS = eINSTANCE.getHWPlatform_NetworkConnectors();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatform.impl.PlatformPartImpl <em>Platform Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatform.impl.PlatformPartImpl
		 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getPlatformPart()
		 * @generated
		 */
		EClass PLATFORM_PART = eINSTANCE.getPlatformPart();

		/**
		 * The meta object literal for the '<em><b>Parent HW Platform</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_PART__PARENT_HW_PLATFORM = eINSTANCE.getPlatformPart_ParentHWPlatform();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_PART__CARDINALITY = eINSTANCE.getPlatformPart_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Hw Port Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_PART__HW_PORT_PARTS = eINSTANCE.getPlatformPart_HwPortParts();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatform.impl.HWPlatformPartImpl <em>HW Platform Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatform.impl.HWPlatformPartImpl
		 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getHWPlatformPart()
		 * @generated
		 */
		EClass HW_PLATFORM_PART = eINSTANCE.getHWPlatformPart();

		/**
		 * The meta object literal for the '<em><b>Hwplatform Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_PART__HWPLATFORM_TYPE = eINSTANCE.getHWPlatformPart_HwplatformType();

		/**
		 * The meta object literal for the '<em><b>Embedded Bridges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_PART__EMBEDDED_BRIDGES = eINSTANCE.getHWPlatformPart_EmbeddedBridges();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatform.impl.ResourcePartImpl <em>Resource Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatform.impl.ResourcePartImpl
		 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getResourcePart()
		 * @generated
		 */
		EClass RESOURCE_PART = eINSTANCE.getResourcePart();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PART__RESOURCE_TYPE = eINSTANCE.getResourcePart_ResourceType();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatform.impl.DelegationHWPortImpl <em>Delegation HW Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatform.impl.DelegationHWPortImpl
		 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getDelegationHWPort()
		 * @generated
		 */
		EClass DELEGATION_HW_PORT = eINSTANCE.getDelegationHWPort();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatform.impl.HWPortPartImpl <em>HW Port Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatform.impl.HWPortPartImpl
		 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getHWPortPart()
		 * @generated
		 */
		EClass HW_PORT_PART = eINSTANCE.getHWPortPart();

		/**
		 * The meta object literal for the '<em><b>Connected Network Connector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_PART__CONNECTED_NETWORK_CONNECTOR = eINSTANCE.getHWPortPart_ConnectedNetworkConnector();

		/**
		 * The meta object literal for the '<em><b>Queuing Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_PART__QUEUING_TIME = eINSTANCE.getHWPortPart_QueuingTime();

		/**
		 * The meta object literal for the '<em><b>Payload Data Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_PART__PAYLOAD_DATA_SIZE = eINSTANCE.getHWPortPart_PayloadDataSize();

		/**
		 * The meta object literal for the '<em><b>Parent Platform Part</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_PART__PARENT_PLATFORM_PART = eINSTANCE.getHWPortPart_ParentPlatformPart();

		/**
		 * The meta object literal for the '<em><b>Hwport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_PART__HWPORT = eINSTANCE.getHWPortPart_Hwport();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatform.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatform.impl.BusImpl
		 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '<em><b>Connected HW Port Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__CONNECTED_HW_PORT_PARTS = eINSTANCE.getBus_ConnectedHWPortParts();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__PROTOCOL = eINSTANCE.getBus_Protocol();

		/**
		 * The meta object literal for the '<em><b>Bandwidth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__BANDWIDTH = eINSTANCE.getBus_Bandwidth();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatform.impl.NetworkBridgeImpl <em>Network Bridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatform.impl.NetworkBridgeImpl
		 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getNetworkBridge()
		 * @generated
		 */
		EClass NETWORK_BRIDGE = eINSTANCE.getNetworkBridge();

		/**
		 * The meta object literal for the '<em><b>Connected Network Connector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_BRIDGE__CONNECTED_NETWORK_CONNECTOR = eINSTANCE.getNetworkBridge_ConnectedNetworkConnector();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_BRIDGE__DELAY = eINSTANCE.getNetworkBridge_Delay();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatform.impl.NetworkingHardwareImpl <em>Networking Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatform.impl.NetworkingHardwareImpl
		 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getNetworkingHardware()
		 * @generated
		 */
		EClass NETWORKING_HARDWARE = eINSTANCE.getNetworkingHardware();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwplatform.impl.NetworkConnectorImpl <em>Network Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwplatform.impl.NetworkConnectorImpl
		 * @see org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl#getNetworkConnector()
		 * @generated
		 */
		EClass NETWORK_CONNECTOR = eINSTANCE.getNetworkConnector();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONNECTOR__PROTOCOL = eINSTANCE.getNetworkConnector_Protocol();

		/**
		 * The meta object literal for the '<em><b>Bandwidth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONNECTOR__BANDWIDTH = eINSTANCE.getNetworkConnector_Bandwidth();

		/**
		 * The meta object literal for the '<em><b>Hwport Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONNECTOR__HWPORT_PARTS = eINSTANCE.getNetworkConnector_HwportParts();

		/**
		 * The meta object literal for the '<em><b>Connector Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_CONNECTOR__CONNECTOR_KIND = eINSTANCE.getNetworkConnector_ConnectorKind();

		/**
		 * The meta object literal for the '<em><b>Delegation HW Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONNECTOR__DELEGATION_HW_PORTS = eINSTANCE.getNetworkConnector_DelegationHWPorts();

	}

} //HwplatformPackage
