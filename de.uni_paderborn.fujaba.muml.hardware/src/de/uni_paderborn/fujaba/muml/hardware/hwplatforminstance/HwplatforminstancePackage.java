/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance;

import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.storydriven.core.CorePackage;

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
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstanceFactory
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
	String eNS_URI = "http://www.fujaba.de/muml/hardware/hwplatforminstance/1.0/";

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
	HwplatforminstancePackage eINSTANCE = de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPlatformInstanceImpl <em>HW Platform Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPlatformInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getHWPlatformInstance()
	 * @generated
	 */
	int HW_PLATFORM_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

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
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__RESOURCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Networking Hardware Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__NETWORKING_HARDWARE_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hwplatform Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Delegation Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE__DELEGATION_PORTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>HW Platform Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>HW Platform Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPlatformInstanceConfigurationImpl <em>HW Platform Instance Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPlatformInstanceConfigurationImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getHWPlatformInstanceConfiguration()
	 * @generated
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Hwplatform Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Networking Hardware Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HW Platform Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>HW Platform Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_INSTANCE_CONFIGURATION_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPortInstanceImpl <em>HW Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getHWPortInstance()
	 * @generated
	 */
	int HW_PORT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__ANNOTATION = HwresourcePackage.HW_PORT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__EXTENSION = HwresourcePackage.HW_PORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__NAME = HwresourcePackage.HW_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__PARENT_RESOURCE = HwresourcePackage.HW_PORT__PARENT_RESOURCE;

	/**
	 * The feature id for the '<em><b>Parent Resource Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE = HwresourcePackage.HW_PORT__PARENT_RESOURCE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__COMMENT = HwresourcePackage.HW_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__CONNECTOR_INSTANCES = HwresourcePackage.HW_PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__TYPE = HwresourcePackage.HW_PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hw Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__HW_PORT_TYPE = HwresourcePackage.HW_PORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connected Media Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__CONNECTED_MEDIA_INSTANCES = HwresourcePackage.HW_PORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__PROTOCOL = HwresourcePackage.HW_PORT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Port Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__PORT_KIND = HwresourcePackage.HW_PORT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>HW Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE_FEATURE_COUNT = HwresourcePackage.HW_PORT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___ECLASS = HwresourcePackage.HW_PORT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___EIS_PROXY = HwresourcePackage.HW_PORT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___ERESOURCE = HwresourcePackage.HW_PORT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___ECONTAINER = HwresourcePackage.HW_PORT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___ECONTAINING_FEATURE = HwresourcePackage.HW_PORT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___ECONTAINMENT_FEATURE = HwresourcePackage.HW_PORT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___ECONTENTS = HwresourcePackage.HW_PORT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___EALL_CONTENTS = HwresourcePackage.HW_PORT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___ECROSS_REFERENCES = HwresourcePackage.HW_PORT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE = HwresourcePackage.HW_PORT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = HwresourcePackage.HW_PORT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = HwresourcePackage.HW_PORT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = HwresourcePackage.HW_PORT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = HwresourcePackage.HW_PORT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST = HwresourcePackage.HW_PORT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___GET_EXTENSION__ECLASS = HwresourcePackage.HW_PORT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS = HwresourcePackage.HW_PORT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___GET_ANNOTATION__STRING = HwresourcePackage.HW_PORT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING = HwresourcePackage.HW_PORT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>HW Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE_OPERATION_COUNT = HwresourcePackage.HW_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.NetworkingHardwareInstanceImpl <em>Networking Hardware Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.NetworkingHardwareInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getNetworkingHardwareInstance()
	 * @generated
	 */
	int NETWORKING_HARDWARE_INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The number of structural features of the '<em>Networking Hardware Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___ECLASS = CorePackage.EXTENDABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___EIS_PROXY = CorePackage.EXTENDABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___ERESOURCE = CorePackage.EXTENDABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___ECONTAINER = CorePackage.EXTENDABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___ECONTAINING_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___ECONTAINMENT_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___ECONTENTS = CorePackage.EXTENDABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___EALL_CONTENTS = CorePackage.EXTENDABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___ECROSS_REFERENCES = CorePackage.EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___EGET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___EUNSET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___EINVOKE__EOPERATION_ELIST = CorePackage.EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___PROVIDE_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___GET_ANNOTATION__STRING = CorePackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE___PROVIDE_ANNOTATION__STRING = CorePackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Networking Hardware Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_INSTANCE_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.DelegationInstanceImpl <em>Delegation Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.DelegationInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getDelegationInstance()
	 * @generated
	 */
	int DELEGATION_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__ANNOTATION = NETWORKING_HARDWARE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__EXTENSION = NETWORKING_HARDWARE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__COMMENT = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__TYPE = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connector Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Delegation Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE_FEATURE_COUNT = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___ECLASS = NETWORKING_HARDWARE_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___EIS_PROXY = NETWORKING_HARDWARE_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___ERESOURCE = NETWORKING_HARDWARE_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___ECONTAINER = NETWORKING_HARDWARE_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___ECONTAINING_FEATURE = NETWORKING_HARDWARE_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___ECONTAINMENT_FEATURE = NETWORKING_HARDWARE_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___ECONTENTS = NETWORKING_HARDWARE_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___EALL_CONTENTS = NETWORKING_HARDWARE_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___ECROSS_REFERENCES = NETWORKING_HARDWARE_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___EGET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = NETWORKING_HARDWARE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = NETWORKING_HARDWARE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___EUNSET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___EINVOKE__EOPERATION_ELIST = NETWORKING_HARDWARE_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___GET_EXTENSION__ECLASS = NETWORKING_HARDWARE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___PROVIDE_EXTENSION__ECLASS = NETWORKING_HARDWARE_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___GET_ANNOTATION__STRING = NETWORKING_HARDWARE_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE___PROVIDE_ANNOTATION__STRING = NETWORKING_HARDWARE_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Delegation Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_INSTANCE_OPERATION_COUNT = NETWORKING_HARDWARE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BusConnectorInstanceImpl <em>Bus Connector Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BusConnectorInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getBusConnectorInstance()
	 * @generated
	 */
	int BUS_CONNECTOR_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE__ANNOTATION = NETWORKING_HARDWARE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE__EXTENSION = NETWORKING_HARDWARE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE__COMMENT = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE__TYPE = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connector Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connected Bus Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE__CONNECTED_BUS_INSTANCE = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connected HW Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE__CONNECTED_HW_PORT_INSTANCES = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Bus Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE_FEATURE_COUNT = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___ECLASS = NETWORKING_HARDWARE_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___EIS_PROXY = NETWORKING_HARDWARE_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___ERESOURCE = NETWORKING_HARDWARE_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___ECONTAINER = NETWORKING_HARDWARE_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___ECONTAINING_FEATURE = NETWORKING_HARDWARE_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___ECONTAINMENT_FEATURE = NETWORKING_HARDWARE_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___ECONTENTS = NETWORKING_HARDWARE_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___EALL_CONTENTS = NETWORKING_HARDWARE_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___ECROSS_REFERENCES = NETWORKING_HARDWARE_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = NETWORKING_HARDWARE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = NETWORKING_HARDWARE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___EUNSET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___EINVOKE__EOPERATION_ELIST = NETWORKING_HARDWARE_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS = NETWORKING_HARDWARE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___PROVIDE_EXTENSION__ECLASS = NETWORKING_HARDWARE_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___GET_ANNOTATION__STRING = NETWORKING_HARDWARE_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE___PROVIDE_ANNOTATION__STRING = NETWORKING_HARDWARE_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Bus Connector Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_INSTANCE_OPERATION_COUNT = NETWORKING_HARDWARE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.CommunicationMediaInstanceImpl <em>Communication Media Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.CommunicationMediaInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getCommunicationMediaInstance()
	 * @generated
	 */
	int COMMUNICATION_MEDIA_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE__ANNOTATION = NETWORKING_HARDWARE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE__EXTENSION = NETWORKING_HARDWARE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE__PROTOCOL = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication Media</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Communication Media Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA_PART = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE__BANDWIDTH = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Communication Media Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE_FEATURE_COUNT = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___ECLASS = NETWORKING_HARDWARE_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___EIS_PROXY = NETWORKING_HARDWARE_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___ERESOURCE = NETWORKING_HARDWARE_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___ECONTAINER = NETWORKING_HARDWARE_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___ECONTAINING_FEATURE = NETWORKING_HARDWARE_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___ECONTAINMENT_FEATURE = NETWORKING_HARDWARE_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___ECONTENTS = NETWORKING_HARDWARE_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___EALL_CONTENTS = NETWORKING_HARDWARE_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___ECROSS_REFERENCES = NETWORKING_HARDWARE_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___EGET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = NETWORKING_HARDWARE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = NETWORKING_HARDWARE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___EUNSET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___EINVOKE__EOPERATION_ELIST = NETWORKING_HARDWARE_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___GET_EXTENSION__ECLASS = NETWORKING_HARDWARE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___PROVIDE_EXTENSION__ECLASS = NETWORKING_HARDWARE_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___GET_ANNOTATION__STRING = NETWORKING_HARDWARE_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE___PROVIDE_ANNOTATION__STRING = NETWORKING_HARDWARE_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Communication Media Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_INSTANCE_OPERATION_COUNT = NETWORKING_HARDWARE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BusInstanceImpl <em>Bus Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BusInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getBusInstance()
	 * @generated
	 */
	int BUS_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__ANNOTATION = COMMUNICATION_MEDIA_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__EXTENSION = COMMUNICATION_MEDIA_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__PROTOCOL = COMMUNICATION_MEDIA_INSTANCE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Communication Media</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__COMMUNICATION_MEDIA = COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA;

	/**
	 * The feature id for the '<em><b>Communication Media Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__COMMUNICATION_MEDIA_PART = COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA_PART;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__BANDWIDTH = COMMUNICATION_MEDIA_INSTANCE__BANDWIDTH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__NAME = COMMUNICATION_MEDIA_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__COMMENT = COMMUNICATION_MEDIA_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__CONNECTOR_INSTANCES = COMMUNICATION_MEDIA_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__TYPE = COMMUNICATION_MEDIA_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connected HW Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__CONNECTED_HW_PORT_INSTANCES = COMMUNICATION_MEDIA_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bus Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__BUS_PART = COMMUNICATION_MEDIA_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Bus Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE_FEATURE_COUNT = COMMUNICATION_MEDIA_INSTANCE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___ECLASS = COMMUNICATION_MEDIA_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___EIS_PROXY = COMMUNICATION_MEDIA_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___ERESOURCE = COMMUNICATION_MEDIA_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___ECONTAINER = COMMUNICATION_MEDIA_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___ECONTAINING_FEATURE = COMMUNICATION_MEDIA_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___ECONTAINMENT_FEATURE = COMMUNICATION_MEDIA_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___ECONTENTS = COMMUNICATION_MEDIA_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___EALL_CONTENTS = COMMUNICATION_MEDIA_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___ECROSS_REFERENCES = COMMUNICATION_MEDIA_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___EGET__ESTRUCTURALFEATURE = COMMUNICATION_MEDIA_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = COMMUNICATION_MEDIA_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = COMMUNICATION_MEDIA_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = COMMUNICATION_MEDIA_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___EUNSET__ESTRUCTURALFEATURE = COMMUNICATION_MEDIA_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___EINVOKE__EOPERATION_ELIST = COMMUNICATION_MEDIA_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___GET_EXTENSION__ECLASS = COMMUNICATION_MEDIA_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___PROVIDE_EXTENSION__ECLASS = COMMUNICATION_MEDIA_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___GET_ANNOTATION__STRING = COMMUNICATION_MEDIA_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE___PROVIDE_ANNOTATION__STRING = COMMUNICATION_MEDIA_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Bus Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE_OPERATION_COUNT = COMMUNICATION_MEDIA_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.LinkInstanceImpl <em>Link Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.LinkInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getLinkInstance()
	 * @generated
	 */
	int LINK_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__ANNOTATION = COMMUNICATION_MEDIA_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__EXTENSION = COMMUNICATION_MEDIA_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__PROTOCOL = COMMUNICATION_MEDIA_INSTANCE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Communication Media</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__COMMUNICATION_MEDIA = COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA;

	/**
	 * The feature id for the '<em><b>Communication Media Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__COMMUNICATION_MEDIA_PART = COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA_PART;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__BANDWIDTH = COMMUNICATION_MEDIA_INSTANCE__BANDWIDTH;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__COMMENT = COMMUNICATION_MEDIA_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__TYPE = COMMUNICATION_MEDIA_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connector Endpoint Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES = COMMUNICATION_MEDIA_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connected HW Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__CONNECTED_HW_PORT_INSTANCES = COMMUNICATION_MEDIA_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Link Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__LINK_PART = COMMUNICATION_MEDIA_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Link Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE_FEATURE_COUNT = COMMUNICATION_MEDIA_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___ECLASS = COMMUNICATION_MEDIA_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___EIS_PROXY = COMMUNICATION_MEDIA_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___ERESOURCE = COMMUNICATION_MEDIA_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___ECONTAINER = COMMUNICATION_MEDIA_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___ECONTAINING_FEATURE = COMMUNICATION_MEDIA_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___ECONTAINMENT_FEATURE = COMMUNICATION_MEDIA_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___ECONTENTS = COMMUNICATION_MEDIA_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___EALL_CONTENTS = COMMUNICATION_MEDIA_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___ECROSS_REFERENCES = COMMUNICATION_MEDIA_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___EGET__ESTRUCTURALFEATURE = COMMUNICATION_MEDIA_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = COMMUNICATION_MEDIA_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = COMMUNICATION_MEDIA_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = COMMUNICATION_MEDIA_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___EUNSET__ESTRUCTURALFEATURE = COMMUNICATION_MEDIA_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___EINVOKE__EOPERATION_ELIST = COMMUNICATION_MEDIA_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___GET_EXTENSION__ECLASS = COMMUNICATION_MEDIA_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___PROVIDE_EXTENSION__ECLASS = COMMUNICATION_MEDIA_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___GET_ANNOTATION__STRING = COMMUNICATION_MEDIA_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE___PROVIDE_ANNOTATION__STRING = COMMUNICATION_MEDIA_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Link Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE_OPERATION_COUNT = COMMUNICATION_MEDIA_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BridgeInstanceImpl <em>Bridge Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BridgeInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getBridgeInstance()
	 * @generated
	 */
	int BRIDGE_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE__ANNOTATION = NETWORKING_HARDWARE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE__EXTENSION = NETWORKING_HARDWARE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE__NAME = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE__COMMENT = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connector Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE__CONNECTOR_INSTANCES = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE__TYPE = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connected Communication Media Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE__CONNECTED_COMMUNICATION_MEDIA_INSTANCE = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Bridge Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE_FEATURE_COUNT = NETWORKING_HARDWARE_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___ECLASS = NETWORKING_HARDWARE_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___EIS_PROXY = NETWORKING_HARDWARE_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___ERESOURCE = NETWORKING_HARDWARE_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___ECONTAINER = NETWORKING_HARDWARE_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___ECONTAINING_FEATURE = NETWORKING_HARDWARE_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___ECONTAINMENT_FEATURE = NETWORKING_HARDWARE_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___ECONTENTS = NETWORKING_HARDWARE_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___EALL_CONTENTS = NETWORKING_HARDWARE_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___ECROSS_REFERENCES = NETWORKING_HARDWARE_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___EGET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = NETWORKING_HARDWARE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = NETWORKING_HARDWARE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___EUNSET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___EINVOKE__EOPERATION_ELIST = NETWORKING_HARDWARE_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___GET_EXTENSION__ECLASS = NETWORKING_HARDWARE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___PROVIDE_EXTENSION__ECLASS = NETWORKING_HARDWARE_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___GET_ANNOTATION__STRING = NETWORKING_HARDWARE_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE___PROVIDE_ANNOTATION__STRING = NETWORKING_HARDWARE_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Bridge Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_INSTANCE_OPERATION_COUNT = NETWORKING_HARDWARE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.DelegationHWPortInstanceImpl <em>Delegation HW Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.DelegationHWPortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getDelegationHWPortInstance()
	 * @generated
	 */
	int DELEGATION_HW_PORT_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE__ANNOTATION = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE__EXTENSION = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__EXTENSION;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___EIS_PROXY = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___ERESOURCE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___ECONTAINER = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___ECONTAINING_FEATURE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___ECONTAINMENT_FEATURE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___ECONTENTS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___EALL_CONTENTS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___ECROSS_REFERENCES = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___EINVOKE__EOPERATION_ELIST = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___PROVIDE_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___GET_ANNOTATION__STRING = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE___PROVIDE_ANNOTATION__STRING = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Delegation HW Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_INSTANCE_OPERATION_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance <em>HW Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Platform Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance
	 * @generated
	 */
	EClass getHWPlatformInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getHwplatformType <em>Hwplatform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hwplatform Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getHwplatformType()
	 * @see #getHWPlatformInstance()
	 * @generated
	 */
	EReference getHWPlatformInstance_HwplatformType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getResources()
	 * @see #getHWPlatformInstance()
	 * @generated
	 */
	EReference getHWPlatformInstance_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getNetworkingHardwareInstances <em>Networking Hardware Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networking Hardware Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getNetworkingHardwareInstances()
	 * @see #getHWPlatformInstance()
	 * @generated
	 */
	EReference getHWPlatformInstance_NetworkingHardwareInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getHwplatformInstances <em>Hwplatform Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hwplatform Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getHwplatformInstances()
	 * @see #getHWPlatformInstance()
	 * @generated
	 */
	EReference getHWPlatformInstance_HwplatformInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getDelegationPorts <em>Delegation Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegation Ports</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance#getDelegationPorts()
	 * @see #getHWPlatformInstance()
	 * @generated
	 */
	EReference getHWPlatformInstance_DelegationPorts();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration <em>HW Platform Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Platform Instance Configuration</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration
	 * @generated
	 */
	EClass getHWPlatformInstanceConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getHwplatformInstances <em>Hwplatform Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hwplatform Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getHwplatformInstances()
	 * @see #getHWPlatformInstanceConfiguration()
	 * @generated
	 */
	EReference getHWPlatformInstanceConfiguration_HwplatformInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getNetworkingHardwareInstances <em>Networking Hardware Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networking Hardware Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration#getNetworkingHardwareInstances()
	 * @see #getHWPlatformInstanceConfiguration()
	 * @generated
	 */
	EReference getHWPlatformInstanceConfiguration_NetworkingHardwareInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance <em>HW Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance
	 * @generated
	 */
	EClass getHWPortInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getHwPortType <em>Hw Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hw Port Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getHwPortType()
	 * @see #getHWPortInstance()
	 * @generated
	 */
	EReference getHWPortInstance_HwPortType();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getConnectedMediaInstances <em>Connected Media Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Media Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getConnectedMediaInstances()
	 * @see #getHWPortInstance()
	 * @generated
	 */
	EReference getHWPortInstance_ConnectedMediaInstances();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getProtocol()
	 * @see #getHWPortInstance()
	 * @generated
	 */
	EReference getHWPortInstance_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getPortKind <em>Port Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getPortKind()
	 * @see #getHWPortInstance()
	 * @generated
	 */
	EAttribute getHWPortInstance_PortKind();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationInstance <em>Delegation Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationInstance
	 * @generated
	 */
	EClass getDelegationInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance <em>Bus Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Connector Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance
	 * @generated
	 */
	EClass getBusConnectorInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance#getConnectedBusInstance <em>Connected Bus Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Bus Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance#getConnectedBusInstance()
	 * @see #getBusConnectorInstance()
	 * @generated
	 */
	EReference getBusConnectorInstance_ConnectedBusInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance#getConnectedHWPortInstances <em>Connected HW Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected HW Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance#getConnectedHWPortInstances()
	 * @see #getBusConnectorInstance()
	 * @generated
	 */
	EReference getBusConnectorInstance_ConnectedHWPortInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance <em>Bus Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance
	 * @generated
	 */
	EClass getBusInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance#getConnectedHWPortInstances <em>Connected HW Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected HW Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance#getConnectedHWPortInstances()
	 * @see #getBusInstance()
	 * @generated
	 */
	EReference getBusInstance_ConnectedHWPortInstances();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance#getBusPart <em>Bus Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance#getBusPart()
	 * @see #getBusInstance()
	 * @generated
	 */
	EReference getBusInstance_BusPart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance <em>Link Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance
	 * @generated
	 */
	EClass getLinkInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance#getConnectedHWPortInstances <em>Connected HW Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected HW Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance#getConnectedHWPortInstances()
	 * @see #getLinkInstance()
	 * @generated
	 */
	EReference getLinkInstance_ConnectedHWPortInstances();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance#getLinkPart <em>Link Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance#getLinkPart()
	 * @see #getLinkInstance()
	 * @generated
	 */
	EReference getLinkInstance_LinkPart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance <em>Communication Media Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Media Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance
	 * @generated
	 */
	EClass getCommunicationMediaInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance#getProtocol()
	 * @see #getCommunicationMediaInstance()
	 * @generated
	 */
	EReference getCommunicationMediaInstance_Protocol();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance#getCommunicationMedia <em>Communication Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Media</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance#getCommunicationMedia()
	 * @see #getCommunicationMediaInstance()
	 * @generated
	 */
	EReference getCommunicationMediaInstance_CommunicationMedia();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance#getCommunicationMediaPart <em>Communication Media Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Media Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance#getCommunicationMediaPart()
	 * @see #getCommunicationMediaInstance()
	 * @generated
	 */
	EReference getCommunicationMediaInstance_CommunicationMediaPart();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bandwidth</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance#getBandwidth()
	 * @see #getCommunicationMediaInstance()
	 * @generated
	 */
	EReference getCommunicationMediaInstance_Bandwidth();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BridgeInstance <em>Bridge Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bridge Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BridgeInstance
	 * @generated
	 */
	EClass getBridgeInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BridgeInstance#getConnectedCommunicationMediaInstance <em>Connected Communication Media Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Communication Media Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BridgeInstance#getConnectedCommunicationMediaInstance()
	 * @see #getBridgeInstance()
	 * @generated
	 */
	EReference getBridgeInstance_ConnectedCommunicationMediaInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.NetworkingHardwareInstance <em>Networking Hardware Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networking Hardware Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.NetworkingHardwareInstance
	 * @generated
	 */
	EClass getNetworkingHardwareInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance <em>Delegation HW Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation HW Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance
	 * @generated
	 */
	EClass getDelegationHWPortInstance();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance#getParentHWPlatformInstance <em>Parent HW Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent HW Platform Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance#getParentHWPlatformInstance()
	 * @see #getDelegationHWPortInstance()
	 * @generated
	 */
	EReference getDelegationHWPortInstance_ParentHWPlatformInstance();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPlatformInstanceImpl <em>HW Platform Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPlatformInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getHWPlatformInstance()
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
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE__RESOURCES = eINSTANCE.getHWPlatformInstance_Resources();

		/**
		 * The meta object literal for the '<em><b>Networking Hardware Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE__NETWORKING_HARDWARE_INSTANCES = eINSTANCE.getHWPlatformInstance_NetworkingHardwareInstances();

		/**
		 * The meta object literal for the '<em><b>Hwplatform Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES = eINSTANCE.getHWPlatformInstance_HwplatformInstances();

		/**
		 * The meta object literal for the '<em><b>Delegation Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_INSTANCE__DELEGATION_PORTS = eINSTANCE.getHWPlatformInstance_DelegationPorts();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPlatformInstanceConfigurationImpl <em>HW Platform Instance Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPlatformInstanceConfigurationImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getHWPlatformInstanceConfiguration()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPortInstanceImpl <em>HW Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getHWPortInstance()
		 * @generated
		 */
		EClass HW_PORT_INSTANCE = eINSTANCE.getHWPortInstance();

		/**
		 * The meta object literal for the '<em><b>Hw Port Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_INSTANCE__HW_PORT_TYPE = eINSTANCE.getHWPortInstance_HwPortType();

		/**
		 * The meta object literal for the '<em><b>Connected Media Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_INSTANCE__CONNECTED_MEDIA_INSTANCES = eINSTANCE.getHWPortInstance_ConnectedMediaInstances();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_INSTANCE__PROTOCOL = eINSTANCE.getHWPortInstance_Protocol();

		/**
		 * The meta object literal for the '<em><b>Port Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_PORT_INSTANCE__PORT_KIND = eINSTANCE.getHWPortInstance_PortKind();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.DelegationInstanceImpl <em>Delegation Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.DelegationInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getDelegationInstance()
		 * @generated
		 */
		EClass DELEGATION_INSTANCE = eINSTANCE.getDelegationInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BusConnectorInstanceImpl <em>Bus Connector Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BusConnectorInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getBusConnectorInstance()
		 * @generated
		 */
		EClass BUS_CONNECTOR_INSTANCE = eINSTANCE.getBusConnectorInstance();

		/**
		 * The meta object literal for the '<em><b>Connected Bus Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_CONNECTOR_INSTANCE__CONNECTED_BUS_INSTANCE = eINSTANCE.getBusConnectorInstance_ConnectedBusInstance();

		/**
		 * The meta object literal for the '<em><b>Connected HW Port Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_CONNECTOR_INSTANCE__CONNECTED_HW_PORT_INSTANCES = eINSTANCE.getBusConnectorInstance_ConnectedHWPortInstances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BusInstanceImpl <em>Bus Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BusInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getBusInstance()
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
		 * The meta object literal for the '<em><b>Bus Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_INSTANCE__BUS_PART = eINSTANCE.getBusInstance_BusPart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.LinkInstanceImpl <em>Link Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.LinkInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getLinkInstance()
		 * @generated
		 */
		EClass LINK_INSTANCE = eINSTANCE.getLinkInstance();

		/**
		 * The meta object literal for the '<em><b>Connected HW Port Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_INSTANCE__CONNECTED_HW_PORT_INSTANCES = eINSTANCE.getLinkInstance_ConnectedHWPortInstances();

		/**
		 * The meta object literal for the '<em><b>Link Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_INSTANCE__LINK_PART = eINSTANCE.getLinkInstance_LinkPart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.CommunicationMediaInstanceImpl <em>Communication Media Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.CommunicationMediaInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getCommunicationMediaInstance()
		 * @generated
		 */
		EClass COMMUNICATION_MEDIA_INSTANCE = eINSTANCE.getCommunicationMediaInstance();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEDIA_INSTANCE__PROTOCOL = eINSTANCE.getCommunicationMediaInstance_Protocol();

		/**
		 * The meta object literal for the '<em><b>Communication Media</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA = eINSTANCE.getCommunicationMediaInstance_CommunicationMedia();

		/**
		 * The meta object literal for the '<em><b>Communication Media Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA_PART = eINSTANCE.getCommunicationMediaInstance_CommunicationMediaPart();

		/**
		 * The meta object literal for the '<em><b>Bandwidth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEDIA_INSTANCE__BANDWIDTH = eINSTANCE.getCommunicationMediaInstance_Bandwidth();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BridgeInstanceImpl <em>Bridge Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BridgeInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getBridgeInstance()
		 * @generated
		 */
		EClass BRIDGE_INSTANCE = eINSTANCE.getBridgeInstance();

		/**
		 * The meta object literal for the '<em><b>Connected Communication Media Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRIDGE_INSTANCE__CONNECTED_COMMUNICATION_MEDIA_INSTANCE = eINSTANCE.getBridgeInstance_ConnectedCommunicationMediaInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.NetworkingHardwareInstanceImpl <em>Networking Hardware Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.NetworkingHardwareInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getNetworkingHardwareInstance()
		 * @generated
		 */
		EClass NETWORKING_HARDWARE_INSTANCE = eINSTANCE.getNetworkingHardwareInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.DelegationHWPortInstanceImpl <em>Delegation HW Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.DelegationHWPortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl#getDelegationHWPortInstance()
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

	}

} //HwplatforminstancePackage
