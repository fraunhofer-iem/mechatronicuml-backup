/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform;

import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;

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
 * The package platform contains all classes of the Platform Type Viewpoint.
 * Hardware platforms are defined at the type level and may be instantiated in a HWPlatformInstanceConfiguration at the Platform Instance Viewpoint.
 * 
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformFactory
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
	String eNS_URI = "http://www.fujaba.de/muml/hardware/hwplatform/1.0/";

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
	HwplatformPackage eINSTANCE = de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformImpl <em>HW Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getHWPlatform()
	 * @generated
	 */
	int HW_PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>HW Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.PlatformPartImpl <em>Platform Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.PlatformPartImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getPlatformPart()
	 * @generated
	 */
	int PLATFORM_PART = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Platform Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformPartImpl <em>HW Platform Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformPartImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getHWPlatformPart()
	 * @generated
	 */
	int HW_PLATFORM_PART = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART__ANNOTATION = PLATFORM_PART__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART__EXTENSION = PLATFORM_PART__EXTENSION;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___ECLASS = PLATFORM_PART___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___EIS_PROXY = PLATFORM_PART___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___ERESOURCE = PLATFORM_PART___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___ECONTAINER = PLATFORM_PART___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___ECONTAINING_FEATURE = PLATFORM_PART___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___ECONTAINMENT_FEATURE = PLATFORM_PART___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___ECONTENTS = PLATFORM_PART___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___EALL_CONTENTS = PLATFORM_PART___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___ECROSS_REFERENCES = PLATFORM_PART___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___EGET__ESTRUCTURALFEATURE = PLATFORM_PART___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___EGET__ESTRUCTURALFEATURE_BOOLEAN = PLATFORM_PART___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___ESET__ESTRUCTURALFEATURE_OBJECT = PLATFORM_PART___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___EIS_SET__ESTRUCTURALFEATURE = PLATFORM_PART___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___EUNSET__ESTRUCTURALFEATURE = PLATFORM_PART___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___EINVOKE__EOPERATION_ELIST = PLATFORM_PART___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___GET_EXTENSION__ECLASS = PLATFORM_PART___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___PROVIDE_EXTENSION__ECLASS = PLATFORM_PART___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___GET_ANNOTATION__STRING = PLATFORM_PART___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART___PROVIDE_ANNOTATION__STRING = PLATFORM_PART___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>HW Platform Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART_OPERATION_COUNT = PLATFORM_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.ResourcePartImpl <em>Resource Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.ResourcePartImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getResourcePart()
	 * @generated
	 */
	int RESOURCE_PART = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART__ANNOTATION = PLATFORM_PART__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART__EXTENSION = PLATFORM_PART__EXTENSION;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___ECLASS = PLATFORM_PART___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___EIS_PROXY = PLATFORM_PART___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___ERESOURCE = PLATFORM_PART___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___ECONTAINER = PLATFORM_PART___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___ECONTAINING_FEATURE = PLATFORM_PART___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___ECONTAINMENT_FEATURE = PLATFORM_PART___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___ECONTENTS = PLATFORM_PART___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___EALL_CONTENTS = PLATFORM_PART___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___ECROSS_REFERENCES = PLATFORM_PART___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___EGET__ESTRUCTURALFEATURE = PLATFORM_PART___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___EGET__ESTRUCTURALFEATURE_BOOLEAN = PLATFORM_PART___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___ESET__ESTRUCTURALFEATURE_OBJECT = PLATFORM_PART___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___EIS_SET__ESTRUCTURALFEATURE = PLATFORM_PART___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___EUNSET__ESTRUCTURALFEATURE = PLATFORM_PART___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___EINVOKE__EOPERATION_ELIST = PLATFORM_PART___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___GET_EXTENSION__ECLASS = PLATFORM_PART___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___PROVIDE_EXTENSION__ECLASS = PLATFORM_PART___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___GET_ANNOTATION__STRING = PLATFORM_PART___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART___PROVIDE_ANNOTATION__STRING = PLATFORM_PART___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Resource Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PART_OPERATION_COUNT = PLATFORM_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationHWPortImpl <em>Delegation HW Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationHWPortImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getDelegationHWPort()
	 * @generated
	 */
	int DELEGATION_HW_PORT = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT__ANNOTATION = ConnectorPackage.CONNECTOR_ENDPOINT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT__EXTENSION = ConnectorPackage.CONNECTOR_ENDPOINT__EXTENSION;

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
	 * The number of structural features of the '<em>Delegation HW Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_FEATURE_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___EIS_PROXY = ConnectorPackage.CONNECTOR_ENDPOINT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___ERESOURCE = ConnectorPackage.CONNECTOR_ENDPOINT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___ECONTAINER = ConnectorPackage.CONNECTOR_ENDPOINT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___ECONTAINING_FEATURE = ConnectorPackage.CONNECTOR_ENDPOINT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___ECONTAINMENT_FEATURE = ConnectorPackage.CONNECTOR_ENDPOINT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___ECONTENTS = ConnectorPackage.CONNECTOR_ENDPOINT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___EALL_CONTENTS = ConnectorPackage.CONNECTOR_ENDPOINT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___ECROSS_REFERENCES = ConnectorPackage.CONNECTOR_ENDPOINT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___EGET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_ENDPOINT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___EGET__ESTRUCTURALFEATURE_BOOLEAN = ConnectorPackage.CONNECTOR_ENDPOINT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___ESET__ESTRUCTURALFEATURE_OBJECT = ConnectorPackage.CONNECTOR_ENDPOINT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___EIS_SET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_ENDPOINT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___EUNSET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_ENDPOINT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___EINVOKE__EOPERATION_ELIST = ConnectorPackage.CONNECTOR_ENDPOINT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___PROVIDE_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___GET_ANNOTATION__STRING = ConnectorPackage.CONNECTOR_ENDPOINT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT___PROVIDE_ANNOTATION__STRING = ConnectorPackage.CONNECTOR_ENDPOINT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Delegation HW Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_OPERATION_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPortPartImpl <em>HW Port Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPortPartImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getHWPortPart()
	 * @generated
	 */
	int HW_PORT_PART = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__ANNOTATION = ConnectorPackage.CONNECTOR_ENDPOINT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__EXTENSION = ConnectorPackage.CONNECTOR_ENDPOINT__EXTENSION;

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
	 * The feature id for the '<em><b>Communication Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__COMMUNICATION_RESOURCE = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connected Network Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__CONNECTED_NETWORK_CONNECTOR = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__PROTOCOL = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__CARDINALITY = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multi HW Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__MULTI_HW_PORT = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Port Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__PORT_KIND = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Queuing Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__QUEUING_TIME = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Payload Data Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__PAYLOAD_DATA_SIZE = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Resource Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__PARENT_RESOURCE_PART = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>HW Port Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART_FEATURE_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___EIS_PROXY = ConnectorPackage.CONNECTOR_ENDPOINT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___ERESOURCE = ConnectorPackage.CONNECTOR_ENDPOINT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___ECONTAINER = ConnectorPackage.CONNECTOR_ENDPOINT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___ECONTAINING_FEATURE = ConnectorPackage.CONNECTOR_ENDPOINT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___ECONTAINMENT_FEATURE = ConnectorPackage.CONNECTOR_ENDPOINT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___ECONTENTS = ConnectorPackage.CONNECTOR_ENDPOINT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___EALL_CONTENTS = ConnectorPackage.CONNECTOR_ENDPOINT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___ECROSS_REFERENCES = ConnectorPackage.CONNECTOR_ENDPOINT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___EGET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_ENDPOINT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___EGET__ESTRUCTURALFEATURE_BOOLEAN = ConnectorPackage.CONNECTOR_ENDPOINT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___ESET__ESTRUCTURALFEATURE_OBJECT = ConnectorPackage.CONNECTOR_ENDPOINT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___EIS_SET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_ENDPOINT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___EUNSET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_ENDPOINT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___EINVOKE__EOPERATION_ELIST = ConnectorPackage.CONNECTOR_ENDPOINT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___PROVIDE_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___GET_ANNOTATION__STRING = ConnectorPackage.CONNECTOR_ENDPOINT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART___PROVIDE_ANNOTATION__STRING = ConnectorPackage.CONNECTOR_ENDPOINT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>HW Port Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART_OPERATION_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BusImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ANNOTATION = ConnectorPackage.CONNECTOR_ENDPOINT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__EXTENSION = ConnectorPackage.CONNECTOR_ENDPOINT__EXTENSION;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___EIS_PROXY = ConnectorPackage.CONNECTOR_ENDPOINT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___ERESOURCE = ConnectorPackage.CONNECTOR_ENDPOINT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___ECONTAINER = ConnectorPackage.CONNECTOR_ENDPOINT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___ECONTAINING_FEATURE = ConnectorPackage.CONNECTOR_ENDPOINT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___ECONTAINMENT_FEATURE = ConnectorPackage.CONNECTOR_ENDPOINT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___ECONTENTS = ConnectorPackage.CONNECTOR_ENDPOINT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___EALL_CONTENTS = ConnectorPackage.CONNECTOR_ENDPOINT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___ECROSS_REFERENCES = ConnectorPackage.CONNECTOR_ENDPOINT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___EGET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_ENDPOINT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___EGET__ESTRUCTURALFEATURE_BOOLEAN = ConnectorPackage.CONNECTOR_ENDPOINT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___ESET__ESTRUCTURALFEATURE_OBJECT = ConnectorPackage.CONNECTOR_ENDPOINT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___EIS_SET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_ENDPOINT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___EUNSET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR_ENDPOINT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___EINVOKE__EOPERATION_ELIST = ConnectorPackage.CONNECTOR_ENDPOINT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___PROVIDE_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR_ENDPOINT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___GET_ANNOTATION__STRING = ConnectorPackage.CONNECTOR_ENDPOINT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___PROVIDE_ANNOTATION__STRING = ConnectorPackage.CONNECTOR_ENDPOINT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.NetworkingHardwareImpl <em>Networking Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.NetworkingHardwareImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getNetworkingHardware()
	 * @generated
	 */
	int NETWORKING_HARDWARE = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The number of structural features of the '<em>Networking Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___ECLASS = CorePackage.EXTENDABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___EIS_PROXY = CorePackage.EXTENDABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___ERESOURCE = CorePackage.EXTENDABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___ECONTAINER = CorePackage.EXTENDABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___ECONTAINING_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___ECONTAINMENT_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___ECONTENTS = CorePackage.EXTENDABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___EALL_CONTENTS = CorePackage.EXTENDABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___ECROSS_REFERENCES = CorePackage.EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___EGET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___EIS_SET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___EUNSET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___EINVOKE__EOPERATION_ELIST = CorePackage.EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___PROVIDE_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___GET_ANNOTATION__STRING = CorePackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE___PROVIDE_ANNOTATION__STRING = CorePackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Networking Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.NetworkBridgeImpl <em>Network Bridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.NetworkBridgeImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getNetworkBridge()
	 * @generated
	 */
	int NETWORK_BRIDGE = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE__ANNOTATION = NETWORKING_HARDWARE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE__EXTENSION = NETWORKING_HARDWARE__EXTENSION;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___ECLASS = NETWORKING_HARDWARE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___EIS_PROXY = NETWORKING_HARDWARE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___ERESOURCE = NETWORKING_HARDWARE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___ECONTAINER = NETWORKING_HARDWARE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___ECONTAINING_FEATURE = NETWORKING_HARDWARE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___ECONTAINMENT_FEATURE = NETWORKING_HARDWARE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___ECONTENTS = NETWORKING_HARDWARE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___EALL_CONTENTS = NETWORKING_HARDWARE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___ECROSS_REFERENCES = NETWORKING_HARDWARE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___EGET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___EGET__ESTRUCTURALFEATURE_BOOLEAN = NETWORKING_HARDWARE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___ESET__ESTRUCTURALFEATURE_OBJECT = NETWORKING_HARDWARE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___EIS_SET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___EUNSET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___EINVOKE__EOPERATION_ELIST = NETWORKING_HARDWARE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___GET_EXTENSION__ECLASS = NETWORKING_HARDWARE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___PROVIDE_EXTENSION__ECLASS = NETWORKING_HARDWARE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___GET_ANNOTATION__STRING = NETWORKING_HARDWARE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE___PROVIDE_ANNOTATION__STRING = NETWORKING_HARDWARE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Network Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_BRIDGE_OPERATION_COUNT = NETWORKING_HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.NetworkConnectorImpl <em>Network Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.NetworkConnectorImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getNetworkConnector()
	 * @generated
	 */
	int NETWORK_CONNECTOR = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR__ANNOTATION = ConnectorPackage.CONNECTOR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR__EXTENSION = ConnectorPackage.CONNECTOR__EXTENSION;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___ECLASS = ConnectorPackage.CONNECTOR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___EIS_PROXY = ConnectorPackage.CONNECTOR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___ERESOURCE = ConnectorPackage.CONNECTOR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___ECONTAINER = ConnectorPackage.CONNECTOR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___ECONTAINING_FEATURE = ConnectorPackage.CONNECTOR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___ECONTAINMENT_FEATURE = ConnectorPackage.CONNECTOR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___ECONTENTS = ConnectorPackage.CONNECTOR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___EALL_CONTENTS = ConnectorPackage.CONNECTOR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___ECROSS_REFERENCES = ConnectorPackage.CONNECTOR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___EGET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___EGET__ESTRUCTURALFEATURE_BOOLEAN = ConnectorPackage.CONNECTOR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___ESET__ESTRUCTURALFEATURE_OBJECT = ConnectorPackage.CONNECTOR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___EIS_SET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___EUNSET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___EINVOKE__EOPERATION_ELIST = ConnectorPackage.CONNECTOR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___PROVIDE_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___GET_ANNOTATION__STRING = ConnectorPackage.CONNECTOR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR___PROVIDE_ANNOTATION__STRING = ConnectorPackage.CONNECTOR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Network Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTOR_OPERATION_COUNT = ConnectorPackage.CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform <em>HW Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Platform</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform
	 * @generated
	 */
	EClass getHWPlatform();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform#getEmbeddedPlatformParts <em>Embedded Platform Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Platform Parts</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform#getEmbeddedPlatformParts()
	 * @see #getHWPlatform()
	 * @generated
	 */
	EReference getHWPlatform_EmbeddedPlatformParts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform#getNetworkingHardware <em>Networking Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networking Hardware</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform#getNetworkingHardware()
	 * @see #getHWPlatform()
	 * @generated
	 */
	EReference getHWPlatform_NetworkingHardware();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform#getDelegationPorts <em>Delegation Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegation Ports</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform#getDelegationPorts()
	 * @see #getHWPlatform()
	 * @generated
	 */
	EReference getHWPlatform_DelegationPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform#getNetworkConnectors <em>Network Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network Connectors</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform#getNetworkConnectors()
	 * @see #getHWPlatform()
	 * @generated
	 */
	EReference getHWPlatform_NetworkConnectors();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart <em>Platform Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart
	 * @generated
	 */
	EClass getPlatformPart();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart#getParentHWPlatform <em>Parent HW Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent HW Platform</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart#getParentHWPlatform()
	 * @see #getPlatformPart()
	 * @generated
	 */
	EReference getPlatformPart_ParentHWPlatform();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart#getCardinality()
	 * @see #getPlatformPart()
	 * @generated
	 */
	EReference getPlatformPart_Cardinality();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart#getHwPortParts <em>Hw Port Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hw Port Parts</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart#getHwPortParts()
	 * @see #getPlatformPart()
	 * @generated
	 */
	EReference getPlatformPart_HwPortParts();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart <em>HW Platform Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Platform Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart
	 * @generated
	 */
	EClass getHWPlatformPart();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart#getHwplatformType <em>Hwplatform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hwplatform Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart#getHwplatformType()
	 * @see #getHWPlatformPart()
	 * @generated
	 */
	EReference getHWPlatformPart_HwplatformType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart#getEmbeddedBridges <em>Embedded Bridges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Bridges</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart#getEmbeddedBridges()
	 * @see #getHWPlatformPart()
	 * @generated
	 */
	EReference getHWPlatformPart_EmbeddedBridges();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.ResourcePart <em>Resource Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.ResourcePart
	 * @generated
	 */
	EClass getResourcePart();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.ResourcePart#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.ResourcePart#getResourceType()
	 * @see #getResourcePart()
	 * @generated
	 */
	EReference getResourcePart_ResourceType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort <em>Delegation HW Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation HW Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort
	 * @generated
	 */
	EClass getDelegationHWPort();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart <em>HW Port Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Port Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart
	 * @generated
	 */
	EClass getHWPortPart();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getCommunicationResource <em>Communication Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Resource</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getCommunicationResource()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EReference getHWPortPart_CommunicationResource();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getConnectedNetworkConnector <em>Connected Network Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Network Connector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getConnectedNetworkConnector()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EReference getHWPortPart_ConnectedNetworkConnector();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getProtocol()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EReference getHWPortPart_Protocol();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getCardinality()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EReference getHWPortPart_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#isMultiHWPort <em>Multi HW Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi HW Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#isMultiHWPort()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EAttribute getHWPortPart_MultiHWPort();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getPortKind <em>Port Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getPortKind()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EAttribute getHWPortPart_PortKind();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getQueuingTime <em>Queuing Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Queuing Time</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getQueuingTime()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EReference getHWPortPart_QueuingTime();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getPayloadDataSize <em>Payload Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payload Data Size</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getPayloadDataSize()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EReference getHWPortPart_PayloadDataSize();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getParentResourcePart <em>Parent Resource Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Resource Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getParentResourcePart()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EReference getHWPortPart_ParentResourcePart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.Bus#getConnectedHWPortParts <em>Connected HW Port Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected HW Port Parts</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.Bus#getConnectedHWPortParts()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_ConnectedHWPortParts();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.Bus#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.Bus#getProtocol()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Protocol();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.Bus#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bandwidth</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.Bus#getBandwidth()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Bandwidth();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkBridge <em>Network Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Bridge</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkBridge
	 * @generated
	 */
	EClass getNetworkBridge();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkBridge#getConnectedNetworkConnector <em>Connected Network Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Network Connector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkBridge#getConnectedNetworkConnector()
	 * @see #getNetworkBridge()
	 * @generated
	 */
	EReference getNetworkBridge_ConnectedNetworkConnector();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkBridge#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delay</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkBridge#getDelay()
	 * @see #getNetworkBridge()
	 * @generated
	 */
	EReference getNetworkBridge_Delay();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkingHardware <em>Networking Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networking Hardware</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkingHardware
	 * @generated
	 */
	EClass getNetworkingHardware();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector <em>Network Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Connector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector
	 * @generated
	 */
	EClass getNetworkConnector();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector#getProtocol()
	 * @see #getNetworkConnector()
	 * @generated
	 */
	EReference getNetworkConnector_Protocol();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bandwidth</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector#getBandwidth()
	 * @see #getNetworkConnector()
	 * @generated
	 */
	EReference getNetworkConnector_Bandwidth();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector#getHwportParts <em>Hwport Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hwport Parts</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector#getHwportParts()
	 * @see #getNetworkConnector()
	 * @generated
	 */
	EReference getNetworkConnector_HwportParts();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector#getConnectorKind <em>Connector Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector#getConnectorKind()
	 * @see #getNetworkConnector()
	 * @generated
	 */
	EAttribute getNetworkConnector_ConnectorKind();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector#getDelegationHWPorts <em>Delegation HW Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegation HW Ports</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector#getDelegationHWPorts()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformImpl <em>HW Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getHWPlatform()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.PlatformPartImpl <em>Platform Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.PlatformPartImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getPlatformPart()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformPartImpl <em>HW Platform Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformPartImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getHWPlatformPart()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.ResourcePartImpl <em>Resource Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.ResourcePartImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getResourcePart()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationHWPortImpl <em>Delegation HW Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationHWPortImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getDelegationHWPort()
		 * @generated
		 */
		EClass DELEGATION_HW_PORT = eINSTANCE.getDelegationHWPort();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPortPartImpl <em>HW Port Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPortPartImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getHWPortPart()
		 * @generated
		 */
		EClass HW_PORT_PART = eINSTANCE.getHWPortPart();

		/**
		 * The meta object literal for the '<em><b>Communication Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_PART__COMMUNICATION_RESOURCE = eINSTANCE.getHWPortPart_CommunicationResource();

		/**
		 * The meta object literal for the '<em><b>Connected Network Connector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_PART__CONNECTED_NETWORK_CONNECTOR = eINSTANCE.getHWPortPart_ConnectedNetworkConnector();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_PART__PROTOCOL = eINSTANCE.getHWPortPart_Protocol();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_PART__CARDINALITY = eINSTANCE.getHWPortPart_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Multi HW Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_PORT_PART__MULTI_HW_PORT = eINSTANCE.getHWPortPart_MultiHWPort();

		/**
		 * The meta object literal for the '<em><b>Port Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_PORT_PART__PORT_KIND = eINSTANCE.getHWPortPart_PortKind();

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
		 * The meta object literal for the '<em><b>Parent Resource Part</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_PART__PARENT_RESOURCE_PART = eINSTANCE.getHWPortPart_ParentResourcePart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BusImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getBus()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.NetworkBridgeImpl <em>Network Bridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.NetworkBridgeImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getNetworkBridge()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.NetworkingHardwareImpl <em>Networking Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.NetworkingHardwareImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getNetworkingHardware()
		 * @generated
		 */
		EClass NETWORKING_HARDWARE = eINSTANCE.getNetworkingHardware();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.NetworkConnectorImpl <em>Network Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.NetworkConnectorImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getNetworkConnector()
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
