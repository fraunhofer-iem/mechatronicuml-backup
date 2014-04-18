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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformConfigurationImpl <em>HW Platform Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformConfigurationImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getHWPlatformConfiguration()
	 * @generated
	 */
	int HW_PLATFORM_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Hwplatforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION__HWPLATFORMS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HW Platform Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___ECLASS = CorePackage.EXTENDABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___EIS_PROXY = CorePackage.EXTENDABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___ERESOURCE = CorePackage.EXTENDABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___ECONTAINER = CorePackage.EXTENDABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___ECONTAINING_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___ECONTAINMENT_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___ECONTENTS = CorePackage.EXTENDABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___EALL_CONTENTS = CorePackage.EXTENDABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___ECROSS_REFERENCES = CorePackage.EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___EGET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___EIS_SET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___EUNSET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___EINVOKE__EOPERATION_ELIST = CorePackage.EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___PROVIDE_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___GET_ANNOTATION__STRING = CorePackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION___PROVIDE_ANNOTATION__STRING = CorePackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>HW Platform Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformImpl <em>HW Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getHWPlatform()
	 * @generated
	 */
	int HW_PLATFORM = 1;

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
	 * The feature id for the '<em><b>Networking Hardware Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM__NETWORKING_HARDWARE_PARTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delegation Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM__DELEGATION_PORTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>HW Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

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
	int PLATFORM_PART = 2;

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
	int HW_PLATFORM_PART = 3;

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
	int RESOURCE_PART = 4;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.NetworkingHardwarePartImpl <em>Networking Hardware Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.NetworkingHardwarePartImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getNetworkingHardwarePart()
	 * @generated
	 */
	int NETWORKING_HARDWARE_PART = 13;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The number of structural features of the '<em>Networking Hardware Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___ECLASS = CorePackage.EXTENDABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___EIS_PROXY = CorePackage.EXTENDABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___ERESOURCE = CorePackage.EXTENDABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___ECONTAINER = CorePackage.EXTENDABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___ECONTAINING_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___ECONTAINMENT_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___ECONTENTS = CorePackage.EXTENDABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___EALL_CONTENTS = CorePackage.EXTENDABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___ECROSS_REFERENCES = CorePackage.EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___EGET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___EIS_SET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___EUNSET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___EINVOKE__EOPERATION_ELIST = CorePackage.EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___PROVIDE_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___GET_ANNOTATION__STRING = CorePackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART___PROVIDE_ANNOTATION__STRING = CorePackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Networking Hardware Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKING_HARDWARE_PART_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationImpl <em>Delegation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getDelegation()
	 * @generated
	 */
	int DELEGATION = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__ANNOTATION = NETWORKING_HARDWARE_PART__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__EXTENSION = NETWORKING_HARDWARE_PART__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__COMMENT = NETWORKING_HARDWARE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__CONNECTOR_ENDPOINTS = NETWORKING_HARDWARE_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Self Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__SELF_CONNECTOR = NETWORKING_HARDWARE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Delegation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_FEATURE_COUNT = NETWORKING_HARDWARE_PART_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___ECLASS = NETWORKING_HARDWARE_PART___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___EIS_PROXY = NETWORKING_HARDWARE_PART___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___ERESOURCE = NETWORKING_HARDWARE_PART___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___ECONTAINER = NETWORKING_HARDWARE_PART___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___ECONTAINING_FEATURE = NETWORKING_HARDWARE_PART___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___ECONTAINMENT_FEATURE = NETWORKING_HARDWARE_PART___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___ECONTENTS = NETWORKING_HARDWARE_PART___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___EALL_CONTENTS = NETWORKING_HARDWARE_PART___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___ECROSS_REFERENCES = NETWORKING_HARDWARE_PART___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___EGET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_PART___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = NETWORKING_HARDWARE_PART___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___ESET__ESTRUCTURALFEATURE_OBJECT = NETWORKING_HARDWARE_PART___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___EIS_SET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_PART___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___EUNSET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_PART___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___EINVOKE__EOPERATION_ELIST = NETWORKING_HARDWARE_PART___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___GET_EXTENSION__ECLASS = NETWORKING_HARDWARE_PART___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___PROVIDE_EXTENSION__ECLASS = NETWORKING_HARDWARE_PART___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___GET_ANNOTATION__STRING = NETWORKING_HARDWARE_PART___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___PROVIDE_ANNOTATION__STRING = NETWORKING_HARDWARE_PART___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Delegation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_OPERATION_COUNT = NETWORKING_HARDWARE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationHWPortImpl <em>Delegation HW Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationHWPortImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getDelegationHWPort()
	 * @generated
	 */
	int DELEGATION_HW_PORT = 6;

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
	 * The feature id for the '<em><b>Parent HW Platform</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT__PARENT_HW_PLATFORM = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delegation HW Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_HW_PORT_FEATURE_COUNT = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 1;

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
	int HW_PORT_PART = 7;

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
	 * The feature id for the '<em><b>Connected Media Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__CONNECTED_MEDIA_PART = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Parent Platform Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__PARENT_PLATFORM_PART = ConnectorPackage.CONNECTOR_ENDPOINT_FEATURE_COUNT + 8;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BusConnectorImpl <em>Bus Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BusConnectorImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getBusConnector()
	 * @generated
	 */
	int BUS_CONNECTOR = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR__ANNOTATION = ConnectorPackage.CONNECTOR__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR__EXTENSION = ConnectorPackage.CONNECTOR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR__COMMENT = ConnectorPackage.CONNECTOR__COMMENT;

	/**
	 * The feature id for the '<em><b>Connector Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR__CONNECTOR_ENDPOINTS = ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Self Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR__SELF_CONNECTOR = ConnectorPackage.CONNECTOR__SELF_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Connected Bus Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR__CONNECTED_BUS_PART = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connected HW Port Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR__CONNECTED_HW_PORT_PARTS = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bus Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_FEATURE_COUNT = ConnectorPackage.CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___ECLASS = ConnectorPackage.CONNECTOR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___EIS_PROXY = ConnectorPackage.CONNECTOR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___ERESOURCE = ConnectorPackage.CONNECTOR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___ECONTAINER = ConnectorPackage.CONNECTOR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___ECONTAINING_FEATURE = ConnectorPackage.CONNECTOR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___ECONTAINMENT_FEATURE = ConnectorPackage.CONNECTOR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___ECONTENTS = ConnectorPackage.CONNECTOR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___EALL_CONTENTS = ConnectorPackage.CONNECTOR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___ECROSS_REFERENCES = ConnectorPackage.CONNECTOR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___EGET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___EGET__ESTRUCTURALFEATURE_BOOLEAN = ConnectorPackage.CONNECTOR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___ESET__ESTRUCTURALFEATURE_OBJECT = ConnectorPackage.CONNECTOR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___EIS_SET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___EUNSET__ESTRUCTURALFEATURE = ConnectorPackage.CONNECTOR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___EINVOKE__EOPERATION_ELIST = ConnectorPackage.CONNECTOR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___GET_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___PROVIDE_EXTENSION__ECLASS = ConnectorPackage.CONNECTOR___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___GET_ANNOTATION__STRING = ConnectorPackage.CONNECTOR___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR___PROVIDE_ANNOTATION__STRING = ConnectorPackage.CONNECTOR___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Bus Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTOR_OPERATION_COUNT = ConnectorPackage.CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.CommunicationMediaPartImpl <em>Communication Media Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.CommunicationMediaPartImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getCommunicationMediaPart()
	 * @generated
	 */
	int COMMUNICATION_MEDIA_PART = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART__ANNOTATION = NETWORKING_HARDWARE_PART__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART__EXTENSION = NETWORKING_HARDWARE_PART__EXTENSION;

	/**
	 * The feature id for the '<em><b>Communication Media</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART__COMMUNICATION_MEDIA = NETWORKING_HARDWARE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART__PROTOCOL = NETWORKING_HARDWARE_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART__BANDWIDTH = NETWORKING_HARDWARE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Communication Media Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART_FEATURE_COUNT = NETWORKING_HARDWARE_PART_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___ECLASS = NETWORKING_HARDWARE_PART___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___EIS_PROXY = NETWORKING_HARDWARE_PART___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___ERESOURCE = NETWORKING_HARDWARE_PART___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___ECONTAINER = NETWORKING_HARDWARE_PART___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___ECONTAINING_FEATURE = NETWORKING_HARDWARE_PART___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___ECONTAINMENT_FEATURE = NETWORKING_HARDWARE_PART___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___ECONTENTS = NETWORKING_HARDWARE_PART___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___EALL_CONTENTS = NETWORKING_HARDWARE_PART___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___ECROSS_REFERENCES = NETWORKING_HARDWARE_PART___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___EGET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_PART___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___EGET__ESTRUCTURALFEATURE_BOOLEAN = NETWORKING_HARDWARE_PART___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___ESET__ESTRUCTURALFEATURE_OBJECT = NETWORKING_HARDWARE_PART___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___EIS_SET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_PART___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___EUNSET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_PART___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___EINVOKE__EOPERATION_ELIST = NETWORKING_HARDWARE_PART___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___GET_EXTENSION__ECLASS = NETWORKING_HARDWARE_PART___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___PROVIDE_EXTENSION__ECLASS = NETWORKING_HARDWARE_PART___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___GET_ANNOTATION__STRING = NETWORKING_HARDWARE_PART___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART___PROVIDE_ANNOTATION__STRING = NETWORKING_HARDWARE_PART___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Communication Media Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_PART_OPERATION_COUNT = NETWORKING_HARDWARE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BusPartImpl <em>Bus Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BusPartImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getBusPart()
	 * @generated
	 */
	int BUS_PART = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART__ANNOTATION = COMMUNICATION_MEDIA_PART__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART__EXTENSION = COMMUNICATION_MEDIA_PART__EXTENSION;

	/**
	 * The feature id for the '<em><b>Communication Media</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART__COMMUNICATION_MEDIA = COMMUNICATION_MEDIA_PART__COMMUNICATION_MEDIA;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART__PROTOCOL = COMMUNICATION_MEDIA_PART__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART__BANDWIDTH = COMMUNICATION_MEDIA_PART__BANDWIDTH;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART__COMMENT = COMMUNICATION_MEDIA_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART__CONNECTORS = COMMUNICATION_MEDIA_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connected HW Port Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART__CONNECTED_HW_PORT_PARTS = COMMUNICATION_MEDIA_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bus Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART_FEATURE_COUNT = COMMUNICATION_MEDIA_PART_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___ECLASS = COMMUNICATION_MEDIA_PART___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___EIS_PROXY = COMMUNICATION_MEDIA_PART___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___ERESOURCE = COMMUNICATION_MEDIA_PART___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___ECONTAINER = COMMUNICATION_MEDIA_PART___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___ECONTAINING_FEATURE = COMMUNICATION_MEDIA_PART___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___ECONTAINMENT_FEATURE = COMMUNICATION_MEDIA_PART___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___ECONTENTS = COMMUNICATION_MEDIA_PART___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___EALL_CONTENTS = COMMUNICATION_MEDIA_PART___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___ECROSS_REFERENCES = COMMUNICATION_MEDIA_PART___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___EGET__ESTRUCTURALFEATURE = COMMUNICATION_MEDIA_PART___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___EGET__ESTRUCTURALFEATURE_BOOLEAN = COMMUNICATION_MEDIA_PART___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___ESET__ESTRUCTURALFEATURE_OBJECT = COMMUNICATION_MEDIA_PART___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___EIS_SET__ESTRUCTURALFEATURE = COMMUNICATION_MEDIA_PART___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___EUNSET__ESTRUCTURALFEATURE = COMMUNICATION_MEDIA_PART___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___EINVOKE__EOPERATION_ELIST = COMMUNICATION_MEDIA_PART___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___GET_EXTENSION__ECLASS = COMMUNICATION_MEDIA_PART___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___PROVIDE_EXTENSION__ECLASS = COMMUNICATION_MEDIA_PART___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___GET_ANNOTATION__STRING = COMMUNICATION_MEDIA_PART___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART___PROVIDE_ANNOTATION__STRING = COMMUNICATION_MEDIA_PART___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Bus Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PART_OPERATION_COUNT = COMMUNICATION_MEDIA_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.LinkPartImpl <em>Link Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.LinkPartImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getLinkPart()
	 * @generated
	 */
	int LINK_PART = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART__ANNOTATION = COMMUNICATION_MEDIA_PART__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART__EXTENSION = COMMUNICATION_MEDIA_PART__EXTENSION;

	/**
	 * The feature id for the '<em><b>Communication Media</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART__COMMUNICATION_MEDIA = COMMUNICATION_MEDIA_PART__COMMUNICATION_MEDIA;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART__PROTOCOL = COMMUNICATION_MEDIA_PART__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART__BANDWIDTH = COMMUNICATION_MEDIA_PART__BANDWIDTH;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART__COMMENT = COMMUNICATION_MEDIA_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART__CONNECTOR_ENDPOINTS = COMMUNICATION_MEDIA_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Self Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART__SELF_CONNECTOR = COMMUNICATION_MEDIA_PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connected HW Port Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART__CONNECTED_HW_PORT_PARTS = COMMUNICATION_MEDIA_PART_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Link Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART_FEATURE_COUNT = COMMUNICATION_MEDIA_PART_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___ECLASS = COMMUNICATION_MEDIA_PART___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___EIS_PROXY = COMMUNICATION_MEDIA_PART___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___ERESOURCE = COMMUNICATION_MEDIA_PART___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___ECONTAINER = COMMUNICATION_MEDIA_PART___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___ECONTAINING_FEATURE = COMMUNICATION_MEDIA_PART___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___ECONTAINMENT_FEATURE = COMMUNICATION_MEDIA_PART___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___ECONTENTS = COMMUNICATION_MEDIA_PART___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___EALL_CONTENTS = COMMUNICATION_MEDIA_PART___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___ECROSS_REFERENCES = COMMUNICATION_MEDIA_PART___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___EGET__ESTRUCTURALFEATURE = COMMUNICATION_MEDIA_PART___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___EGET__ESTRUCTURALFEATURE_BOOLEAN = COMMUNICATION_MEDIA_PART___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___ESET__ESTRUCTURALFEATURE_OBJECT = COMMUNICATION_MEDIA_PART___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___EIS_SET__ESTRUCTURALFEATURE = COMMUNICATION_MEDIA_PART___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___EUNSET__ESTRUCTURALFEATURE = COMMUNICATION_MEDIA_PART___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___EINVOKE__EOPERATION_ELIST = COMMUNICATION_MEDIA_PART___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___GET_EXTENSION__ECLASS = COMMUNICATION_MEDIA_PART___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___PROVIDE_EXTENSION__ECLASS = COMMUNICATION_MEDIA_PART___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___GET_ANNOTATION__STRING = COMMUNICATION_MEDIA_PART___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART___PROVIDE_ANNOTATION__STRING = COMMUNICATION_MEDIA_PART___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Link Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PART_OPERATION_COUNT = COMMUNICATION_MEDIA_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BridgePartImpl <em>Bridge Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BridgePartImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getBridgePart()
	 * @generated
	 */
	int BRIDGE_PART = 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART__ANNOTATION = NETWORKING_HARDWARE_PART__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART__EXTENSION = NETWORKING_HARDWARE_PART__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART__COMMENT = NETWORKING_HARDWARE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART__CONNECTORS = NETWORKING_HARDWARE_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connected Communication Media Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART__CONNECTED_COMMUNICATION_MEDIA_PART = NETWORKING_HARDWARE_PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART__DELAY = NETWORKING_HARDWARE_PART_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bridge Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART_FEATURE_COUNT = NETWORKING_HARDWARE_PART_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___ECLASS = NETWORKING_HARDWARE_PART___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___EIS_PROXY = NETWORKING_HARDWARE_PART___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___ERESOURCE = NETWORKING_HARDWARE_PART___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___ECONTAINER = NETWORKING_HARDWARE_PART___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___ECONTAINING_FEATURE = NETWORKING_HARDWARE_PART___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___ECONTAINMENT_FEATURE = NETWORKING_HARDWARE_PART___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___ECONTENTS = NETWORKING_HARDWARE_PART___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___EALL_CONTENTS = NETWORKING_HARDWARE_PART___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___ECROSS_REFERENCES = NETWORKING_HARDWARE_PART___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___EGET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_PART___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___EGET__ESTRUCTURALFEATURE_BOOLEAN = NETWORKING_HARDWARE_PART___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___ESET__ESTRUCTURALFEATURE_OBJECT = NETWORKING_HARDWARE_PART___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___EIS_SET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_PART___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___EUNSET__ESTRUCTURALFEATURE = NETWORKING_HARDWARE_PART___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___EINVOKE__EOPERATION_ELIST = NETWORKING_HARDWARE_PART___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___GET_EXTENSION__ECLASS = NETWORKING_HARDWARE_PART___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___PROVIDE_EXTENSION__ECLASS = NETWORKING_HARDWARE_PART___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___GET_ANNOTATION__STRING = NETWORKING_HARDWARE_PART___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART___PROVIDE_ANNOTATION__STRING = NETWORKING_HARDWARE_PART___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Bridge Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_PART_OPERATION_COUNT = NETWORKING_HARDWARE_PART_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformConfiguration <em>HW Platform Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Platform Configuration</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformConfiguration
	 * @generated
	 */
	EClass getHWPlatformConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformConfiguration#getHwplatforms <em>Hwplatforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hwplatforms</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformConfiguration#getHwplatforms()
	 * @see #getHWPlatformConfiguration()
	 * @generated
	 */
	EReference getHWPlatformConfiguration_Hwplatforms();

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
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform#getNetworkingHardwareParts <em>Networking Hardware Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networking Hardware Parts</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform#getNetworkingHardwareParts()
	 * @see #getHWPlatform()
	 * @generated
	 */
	EReference getHWPlatform_NetworkingHardwareParts();

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
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.Delegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.Delegation
	 * @generated
	 */
	EClass getDelegation();

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
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort#getParentHWPlatform <em>Parent HW Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent HW Platform</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort#getParentHWPlatform()
	 * @see #getDelegationHWPort()
	 * @generated
	 */
	EReference getDelegationHWPort_ParentHWPlatform();

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
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getConnectedMediaPart <em>Connected Media Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Media Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getConnectedMediaPart()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EReference getHWPortPart_ConnectedMediaPart();

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
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getParentPlatformPart <em>Parent Platform Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Platform Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getParentPlatformPart()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EReference getHWPortPart_ParentPlatformPart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector <em>Bus Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Connector</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector
	 * @generated
	 */
	EClass getBusConnector();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector#getConnectedBusPart <em>Connected Bus Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Bus Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector#getConnectedBusPart()
	 * @see #getBusConnector()
	 * @generated
	 */
	EReference getBusConnector_ConnectedBusPart();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector#getConnectedHWPortParts <em>Connected HW Port Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected HW Port Parts</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector#getConnectedHWPortParts()
	 * @see #getBusConnector()
	 * @generated
	 */
	EReference getBusConnector_ConnectedHWPortParts();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusPart <em>Bus Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusPart
	 * @generated
	 */
	EClass getBusPart();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusPart#getConnectedHWPortParts <em>Connected HW Port Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected HW Port Parts</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusPart#getConnectedHWPortParts()
	 * @see #getBusPart()
	 * @generated
	 */
	EReference getBusPart_ConnectedHWPortParts();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart <em>Link Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart
	 * @generated
	 */
	EClass getLinkPart();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart#getConnectedHWPortParts <em>Connected HW Port Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected HW Port Parts</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart#getConnectedHWPortParts()
	 * @see #getLinkPart()
	 * @generated
	 */
	EReference getLinkPart_ConnectedHWPortParts();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart <em>Communication Media Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Media Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart
	 * @generated
	 */
	EClass getCommunicationMediaPart();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart#getCommunicationMedia <em>Communication Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Media</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart#getCommunicationMedia()
	 * @see #getCommunicationMediaPart()
	 * @generated
	 */
	EReference getCommunicationMediaPart_CommunicationMedia();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart#getProtocol()
	 * @see #getCommunicationMediaPart()
	 * @generated
	 */
	EReference getCommunicationMediaPart_Protocol();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bandwidth</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart#getBandwidth()
	 * @see #getCommunicationMediaPart()
	 * @generated
	 */
	EReference getCommunicationMediaPart_Bandwidth();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart <em>Bridge Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bridge Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart
	 * @generated
	 */
	EClass getBridgePart();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart#getConnectedCommunicationMediaPart <em>Connected Communication Media Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Communication Media Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart#getConnectedCommunicationMediaPart()
	 * @see #getBridgePart()
	 * @generated
	 */
	EReference getBridgePart_ConnectedCommunicationMediaPart();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delay</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart#getDelay()
	 * @see #getBridgePart()
	 * @generated
	 */
	EReference getBridgePart_Delay();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkingHardwarePart <em>Networking Hardware Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networking Hardware Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkingHardwarePart
	 * @generated
	 */
	EClass getNetworkingHardwarePart();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformConfigurationImpl <em>HW Platform Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HWPlatformConfigurationImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getHWPlatformConfiguration()
		 * @generated
		 */
		EClass HW_PLATFORM_CONFIGURATION = eINSTANCE.getHWPlatformConfiguration();

		/**
		 * The meta object literal for the '<em><b>Hwplatforms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_CONFIGURATION__HWPLATFORMS = eINSTANCE.getHWPlatformConfiguration_Hwplatforms();

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
		 * The meta object literal for the '<em><b>Networking Hardware Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM__NETWORKING_HARDWARE_PARTS = eINSTANCE.getHWPlatform_NetworkingHardwareParts();

		/**
		 * The meta object literal for the '<em><b>Delegation Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM__DELEGATION_PORTS = eINSTANCE.getHWPlatform_DelegationPorts();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationImpl <em>Delegation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.DelegationImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getDelegation()
		 * @generated
		 */
		EClass DELEGATION = eINSTANCE.getDelegation();

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
		 * The meta object literal for the '<em><b>Parent HW Platform</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_HW_PORT__PARENT_HW_PLATFORM = eINSTANCE.getDelegationHWPort_ParentHWPlatform();

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
		 * The meta object literal for the '<em><b>Connected Media Part</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_PART__CONNECTED_MEDIA_PART = eINSTANCE.getHWPortPart_ConnectedMediaPart();

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
		 * The meta object literal for the '<em><b>Parent Platform Part</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_PART__PARENT_PLATFORM_PART = eINSTANCE.getHWPortPart_ParentPlatformPart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BusConnectorImpl <em>Bus Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BusConnectorImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getBusConnector()
		 * @generated
		 */
		EClass BUS_CONNECTOR = eINSTANCE.getBusConnector();

		/**
		 * The meta object literal for the '<em><b>Connected Bus Part</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_CONNECTOR__CONNECTED_BUS_PART = eINSTANCE.getBusConnector_ConnectedBusPart();

		/**
		 * The meta object literal for the '<em><b>Connected HW Port Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_CONNECTOR__CONNECTED_HW_PORT_PARTS = eINSTANCE.getBusConnector_ConnectedHWPortParts();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BusPartImpl <em>Bus Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BusPartImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getBusPart()
		 * @generated
		 */
		EClass BUS_PART = eINSTANCE.getBusPart();

		/**
		 * The meta object literal for the '<em><b>Connected HW Port Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_PART__CONNECTED_HW_PORT_PARTS = eINSTANCE.getBusPart_ConnectedHWPortParts();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.LinkPartImpl <em>Link Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.LinkPartImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getLinkPart()
		 * @generated
		 */
		EClass LINK_PART = eINSTANCE.getLinkPart();

		/**
		 * The meta object literal for the '<em><b>Connected HW Port Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_PART__CONNECTED_HW_PORT_PARTS = eINSTANCE.getLinkPart_ConnectedHWPortParts();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.CommunicationMediaPartImpl <em>Communication Media Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.CommunicationMediaPartImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getCommunicationMediaPart()
		 * @generated
		 */
		EClass COMMUNICATION_MEDIA_PART = eINSTANCE.getCommunicationMediaPart();

		/**
		 * The meta object literal for the '<em><b>Communication Media</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEDIA_PART__COMMUNICATION_MEDIA = eINSTANCE.getCommunicationMediaPart_CommunicationMedia();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEDIA_PART__PROTOCOL = eINSTANCE.getCommunicationMediaPart_Protocol();

		/**
		 * The meta object literal for the '<em><b>Bandwidth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEDIA_PART__BANDWIDTH = eINSTANCE.getCommunicationMediaPart_Bandwidth();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BridgePartImpl <em>Bridge Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BridgePartImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getBridgePart()
		 * @generated
		 */
		EClass BRIDGE_PART = eINSTANCE.getBridgePart();

		/**
		 * The meta object literal for the '<em><b>Connected Communication Media Part</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRIDGE_PART__CONNECTED_COMMUNICATION_MEDIA_PART = eINSTANCE.getBridgePart_ConnectedCommunicationMediaPart();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRIDGE_PART__DELAY = eINSTANCE.getBridgePart_Delay();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.NetworkingHardwarePartImpl <em>Networking Hardware Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.NetworkingHardwarePartImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl#getNetworkingHardwarePart()
		 * @generated
		 */
		EClass NETWORKING_HARDWARE_PART = eINSTANCE.getNetworkingHardwarePart();

	}

} //HwplatformPackage
