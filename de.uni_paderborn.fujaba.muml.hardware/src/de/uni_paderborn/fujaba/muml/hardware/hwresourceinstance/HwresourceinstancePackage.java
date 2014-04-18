/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance;

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
 * @see de.uni_padersvn: E155023: Can't set properties on born.fujaba.muml.hardware.hwresourceinstance.HwresourceinstanceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface HwresourceinstancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hwresourceinstance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/hardware/hwresourceinstance/1.0/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hwresourceinstance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwresourceinstancePackage eINSTANCE = de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ResourceInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getResourceInstance()
	 * @generated
	 */
	int RESOURCE_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__HWPORTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__RESOURCE_TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___PROVIDE_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___GET_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___PROVIDE_ANNOTATION__STRING = CorePackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.AtomicResourceInstanceImpl <em>Atomic Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.AtomicResourceInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getAtomicResourceInstance()
	 * @generated
	 */
	int ATOMIC_RESOURCE_INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE__ANNOTATION = RESOURCE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE__EXTENSION = RESOURCE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE__NAME = RESOURCE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE__HWPORTS = RESOURCE_INSTANCE__HWPORTS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE__RESOURCE_TYPE = RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Parent Structured Resource Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE = RESOURCE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE_FEATURE_COUNT = RESOURCE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___ECLASS = RESOURCE_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___EIS_PROXY = RESOURCE_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___ERESOURCE = RESOURCE_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___ECONTAINER = RESOURCE_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___ECONTAINING_FEATURE = RESOURCE_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___ECONTAINMENT_FEATURE = RESOURCE_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___ECONTENTS = RESOURCE_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___EALL_CONTENTS = RESOURCE_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___ECROSS_REFERENCES = RESOURCE_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE = RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = RESOURCE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = RESOURCE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___EUNSET__ESTRUCTURALFEATURE = RESOURCE_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___EINVOKE__EOPERATION_ELIST = RESOURCE_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS = RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___PROVIDE_EXTENSION__ECLASS = RESOURCE_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___GET_ANNOTATION__STRING = RESOURCE_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___PROVIDE_ANNOTATION__STRING = RESOURCE_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Atomic Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE_OPERATION_COUNT = RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ComputingResourceInstanceImpl <em>Computing Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ComputingResourceInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getComputingResourceInstance()
	 * @generated
	 */
	int COMPUTING_RESOURCE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE__ANNOTATION = ATOMIC_RESOURCE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE__EXTENSION = ATOMIC_RESOURCE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE__NAME = ATOMIC_RESOURCE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE__HWPORTS = ATOMIC_RESOURCE_INSTANCE__HWPORTS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE__RESOURCE_TYPE = ATOMIC_RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Parent Structured Resource Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE = ATOMIC_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE__FREQUENCY = ATOMIC_RESOURCE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Computing Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE_FEATURE_COUNT = ATOMIC_RESOURCE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___ECLASS = ATOMIC_RESOURCE_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___EIS_PROXY = ATOMIC_RESOURCE_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___ERESOURCE = ATOMIC_RESOURCE_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___ECONTAINER = ATOMIC_RESOURCE_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___ECONTAINING_FEATURE = ATOMIC_RESOURCE_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___ECONTAINMENT_FEATURE = ATOMIC_RESOURCE_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___ECONTENTS = ATOMIC_RESOURCE_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___EALL_CONTENTS = ATOMIC_RESOURCE_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___ECROSS_REFERENCES = ATOMIC_RESOURCE_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE = ATOMIC_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ATOMIC_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = ATOMIC_RESOURCE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = ATOMIC_RESOURCE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___EUNSET__ESTRUCTURALFEATURE = ATOMIC_RESOURCE_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___EINVOKE__EOPERATION_ELIST = ATOMIC_RESOURCE_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS = ATOMIC_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___PROVIDE_EXTENSION__ECLASS = ATOMIC_RESOURCE_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___GET_ANNOTATION__STRING = ATOMIC_RESOURCE_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___PROVIDE_ANNOTATION__STRING = ATOMIC_RESOURCE_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Computing Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE_OPERATION_COUNT = ATOMIC_RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.MemoryResourceInstanceImpl <em>Memory Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.MemoryResourceInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getMemoryResourceInstance()
	 * @generated
	 */
	int MEMORY_RESOURCE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE__ANNOTATION = ATOMIC_RESOURCE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE__EXTENSION = ATOMIC_RESOURCE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE__NAME = ATOMIC_RESOURCE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE__HWPORTS = ATOMIC_RESOURCE_INSTANCE__HWPORTS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE__RESOURCE_TYPE = ATOMIC_RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Parent Structured Resource Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE = ATOMIC_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE = ATOMIC_RESOURCE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE__THROUGHPUT = ATOMIC_RESOURCE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Memory Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE__MEMORY_TYPE = ATOMIC_RESOURCE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Memory Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE_FEATURE_COUNT = ATOMIC_RESOURCE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___ECLASS = ATOMIC_RESOURCE_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___EIS_PROXY = ATOMIC_RESOURCE_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___ERESOURCE = ATOMIC_RESOURCE_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___ECONTAINER = ATOMIC_RESOURCE_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___ECONTAINING_FEATURE = ATOMIC_RESOURCE_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___ECONTAINMENT_FEATURE = ATOMIC_RESOURCE_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___ECONTENTS = ATOMIC_RESOURCE_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___EALL_CONTENTS = ATOMIC_RESOURCE_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___ECROSS_REFERENCES = ATOMIC_RESOURCE_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE = ATOMIC_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ATOMIC_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = ATOMIC_RESOURCE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = ATOMIC_RESOURCE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___EUNSET__ESTRUCTURALFEATURE = ATOMIC_RESOURCE_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___EINVOKE__EOPERATION_ELIST = ATOMIC_RESOURCE_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS = ATOMIC_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___PROVIDE_EXTENSION__ECLASS = ATOMIC_RESOURCE_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___GET_ANNOTATION__STRING = ATOMIC_RESOURCE_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___PROVIDE_ANNOTATION__STRING = ATOMIC_RESOURCE_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Memory Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE_OPERATION_COUNT = ATOMIC_RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.DeviceInstanceImpl <em>Device Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.DeviceInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getDeviceInstance()
	 * @generated
	 */
	int DEVICE_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE__ANNOTATION = RESOURCE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE__EXTENSION = RESOURCE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE__NAME = RESOURCE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE__HWPORTS = RESOURCE_INSTANCE__HWPORTS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE__RESOURCE_TYPE = RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The number of structural features of the '<em>Device Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE_FEATURE_COUNT = RESOURCE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___ECLASS = RESOURCE_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___EIS_PROXY = RESOURCE_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___ERESOURCE = RESOURCE_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___ECONTAINER = RESOURCE_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___ECONTAINING_FEATURE = RESOURCE_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___ECONTAINMENT_FEATURE = RESOURCE_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___ECONTENTS = RESOURCE_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___EALL_CONTENTS = RESOURCE_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___ECROSS_REFERENCES = RESOURCE_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___EGET__ESTRUCTURALFEATURE = RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = RESOURCE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = RESOURCE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___EUNSET__ESTRUCTURALFEATURE = RESOURCE_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___EINVOKE__EOPERATION_ELIST = RESOURCE_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___GET_EXTENSION__ECLASS = RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___PROVIDE_EXTENSION__ECLASS = RESOURCE_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___GET_ANNOTATION__STRING = RESOURCE_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___PROVIDE_ANNOTATION__STRING = RESOURCE_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Device Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE_OPERATION_COUNT = RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.StorageMemoryInstanceImpl <em>Storage Memory Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.StorageMemoryInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getStorageMemoryInstance()
	 * @generated
	 */
	int STORAGE_MEMORY_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE__ANNOTATION = MEMORY_RESOURCE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE__EXTENSION = MEMORY_RESOURCE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE__NAME = MEMORY_RESOURCE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE__HWPORTS = MEMORY_RESOURCE_INSTANCE__HWPORTS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE__RESOURCE_TYPE = MEMORY_RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Parent Structured Resource Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE = MEMORY_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE__MEMORY_SIZE = MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE__THROUGHPUT = MEMORY_RESOURCE_INSTANCE__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Memory Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE__MEMORY_TYPE = MEMORY_RESOURCE_INSTANCE__MEMORY_TYPE;

	/**
	 * The number of structural features of the '<em>Storage Memory Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE_FEATURE_COUNT = MEMORY_RESOURCE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___ECLASS = MEMORY_RESOURCE_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___EIS_PROXY = MEMORY_RESOURCE_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___ERESOURCE = MEMORY_RESOURCE_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___ECONTAINER = MEMORY_RESOURCE_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___ECONTAINING_FEATURE = MEMORY_RESOURCE_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___ECONTAINMENT_FEATURE = MEMORY_RESOURCE_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___ECONTENTS = MEMORY_RESOURCE_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___EALL_CONTENTS = MEMORY_RESOURCE_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___ECROSS_REFERENCES = MEMORY_RESOURCE_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___EGET__ESTRUCTURALFEATURE = MEMORY_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = MEMORY_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = MEMORY_RESOURCE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = MEMORY_RESOURCE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___EUNSET__ESTRUCTURALFEATURE = MEMORY_RESOURCE_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___EINVOKE__EOPERATION_ELIST = MEMORY_RESOURCE_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___GET_EXTENSION__ECLASS = MEMORY_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___PROVIDE_EXTENSION__ECLASS = MEMORY_RESOURCE_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___GET_ANNOTATION__STRING = MEMORY_RESOURCE_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___PROVIDE_ANNOTATION__STRING = MEMORY_RESOURCE_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Storage Memory Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE_OPERATION_COUNT = MEMORY_RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ProcessingMemoryInstanceImpl <em>Processing Memory Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ProcessingMemoryInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getProcessingMemoryInstance()
	 * @generated
	 */
	int PROCESSING_MEMORY_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE__ANNOTATION = MEMORY_RESOURCE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE__EXTENSION = MEMORY_RESOURCE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE__NAME = MEMORY_RESOURCE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE__HWPORTS = MEMORY_RESOURCE_INSTANCE__HWPORTS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE__RESOURCE_TYPE = MEMORY_RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Parent Structured Resource Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE = MEMORY_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE__MEMORY_SIZE = MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE__THROUGHPUT = MEMORY_RESOURCE_INSTANCE__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Memory Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE__MEMORY_TYPE = MEMORY_RESOURCE_INSTANCE__MEMORY_TYPE;

	/**
	 * The number of structural features of the '<em>Processing Memory Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE_FEATURE_COUNT = MEMORY_RESOURCE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___ECLASS = MEMORY_RESOURCE_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___EIS_PROXY = MEMORY_RESOURCE_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___ERESOURCE = MEMORY_RESOURCE_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___ECONTAINER = MEMORY_RESOURCE_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___ECONTAINING_FEATURE = MEMORY_RESOURCE_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___ECONTAINMENT_FEATURE = MEMORY_RESOURCE_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___ECONTENTS = MEMORY_RESOURCE_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___EALL_CONTENTS = MEMORY_RESOURCE_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___ECROSS_REFERENCES = MEMORY_RESOURCE_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___EGET__ESTRUCTURALFEATURE = MEMORY_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = MEMORY_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = MEMORY_RESOURCE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = MEMORY_RESOURCE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___EUNSET__ESTRUCTURALFEATURE = MEMORY_RESOURCE_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___EINVOKE__EOPERATION_ELIST = MEMORY_RESOURCE_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___GET_EXTENSION__ECLASS = MEMORY_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___PROVIDE_EXTENSION__ECLASS = MEMORY_RESOURCE_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___GET_ANNOTATION__STRING = MEMORY_RESOURCE_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___PROVIDE_ANNOTATION__STRING = MEMORY_RESOURCE_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Processing Memory Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE_OPERATION_COUNT = MEMORY_RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.CacheInstanceImpl <em>Cache Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.CacheInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getCacheInstance()
	 * @generated
	 */
	int CACHE_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE__ANNOTATION = MEMORY_RESOURCE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE__EXTENSION = MEMORY_RESOURCE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE__NAME = MEMORY_RESOURCE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE__HWPORTS = MEMORY_RESOURCE_INSTANCE__HWPORTS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE__RESOURCE_TYPE = MEMORY_RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Parent Structured Resource Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE = MEMORY_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE__MEMORY_SIZE = MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE__THROUGHPUT = MEMORY_RESOURCE_INSTANCE__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Memory Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE__MEMORY_TYPE = MEMORY_RESOURCE_INSTANCE__MEMORY_TYPE;

	/**
	 * The number of structural features of the '<em>Cache Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE_FEATURE_COUNT = MEMORY_RESOURCE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___ECLASS = MEMORY_RESOURCE_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___EIS_PROXY = MEMORY_RESOURCE_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___ERESOURCE = MEMORY_RESOURCE_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___ECONTAINER = MEMORY_RESOURCE_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___ECONTAINING_FEATURE = MEMORY_RESOURCE_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___ECONTAINMENT_FEATURE = MEMORY_RESOURCE_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___ECONTENTS = MEMORY_RESOURCE_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___EALL_CONTENTS = MEMORY_RESOURCE_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___ECROSS_REFERENCES = MEMORY_RESOURCE_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___EGET__ESTRUCTURALFEATURE = MEMORY_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = MEMORY_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = MEMORY_RESOURCE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = MEMORY_RESOURCE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___EUNSET__ESTRUCTURALFEATURE = MEMORY_RESOURCE_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___EINVOKE__EOPERATION_ELIST = MEMORY_RESOURCE_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___GET_EXTENSION__ECLASS = MEMORY_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___PROVIDE_EXTENSION__ECLASS = MEMORY_RESOURCE_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___GET_ANNOTATION__STRING = MEMORY_RESOURCE_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___PROVIDE_ANNOTATION__STRING = MEMORY_RESOURCE_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Cache Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE_OPERATION_COUNT = MEMORY_RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ProgrammableLogicDeviceInstanceImpl <em>Programmable Logic Device Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ProgrammableLogicDeviceInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getProgrammableLogicDeviceInstance()
	 * @generated
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE__ANNOTATION = COMPUTING_RESOURCE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE__EXTENSION = COMPUTING_RESOURCE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE__NAME = COMPUTING_RESOURCE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE__HWPORTS = COMPUTING_RESOURCE_INSTANCE__HWPORTS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE__RESOURCE_TYPE = COMPUTING_RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Parent Structured Resource Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE = COMPUTING_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE__FREQUENCY = COMPUTING_RESOURCE_INSTANCE__FREQUENCY;

	/**
	 * The number of structural features of the '<em>Programmable Logic Device Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE_FEATURE_COUNT = COMPUTING_RESOURCE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___ECLASS = COMPUTING_RESOURCE_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___EIS_PROXY = COMPUTING_RESOURCE_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___ERESOURCE = COMPUTING_RESOURCE_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___ECONTAINER = COMPUTING_RESOURCE_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___ECONTAINING_FEATURE = COMPUTING_RESOURCE_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___ECONTAINMENT_FEATURE = COMPUTING_RESOURCE_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___ECONTENTS = COMPUTING_RESOURCE_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___EALL_CONTENTS = COMPUTING_RESOURCE_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___ECROSS_REFERENCES = COMPUTING_RESOURCE_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___EGET__ESTRUCTURALFEATURE = COMPUTING_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = COMPUTING_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = COMPUTING_RESOURCE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = COMPUTING_RESOURCE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___EUNSET__ESTRUCTURALFEATURE = COMPUTING_RESOURCE_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___EINVOKE__EOPERATION_ELIST = COMPUTING_RESOURCE_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___GET_EXTENSION__ECLASS = COMPUTING_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___PROVIDE_EXTENSION__ECLASS = COMPUTING_RESOURCE_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___GET_ANNOTATION__STRING = COMPUTING_RESOURCE_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___PROVIDE_ANNOTATION__STRING = COMPUTING_RESOURCE_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Programmable Logic Device Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE_OPERATION_COUNT = COMPUTING_RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ProcessorInstanceImpl <em>Processor Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ProcessorInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getProcessorInstance()
	 * @generated
	 */
	int PROCESSOR_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE__ANNOTATION = COMPUTING_RESOURCE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE__EXTENSION = COMPUTING_RESOURCE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE__NAME = COMPUTING_RESOURCE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE__HWPORTS = COMPUTING_RESOURCE_INSTANCE__HWPORTS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE__RESOURCE_TYPE = COMPUTING_RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Parent Structured Resource Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE = COMPUTING_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE__FREQUENCY = COMPUTING_RESOURCE_INSTANCE__FREQUENCY;

	/**
	 * The feature id for the '<em><b>MIPS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE__MIPS = COMPUTING_RESOURCE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CPI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE__CPI = COMPUTING_RESOURCE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Cache Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE__OWNED_CACHE_INSTANCE = COMPUTING_RESOURCE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Processor Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE_FEATURE_COUNT = COMPUTING_RESOURCE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___ECLASS = COMPUTING_RESOURCE_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___EIS_PROXY = COMPUTING_RESOURCE_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___ERESOURCE = COMPUTING_RESOURCE_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___ECONTAINER = COMPUTING_RESOURCE_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___ECONTAINING_FEATURE = COMPUTING_RESOURCE_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___ECONTAINMENT_FEATURE = COMPUTING_RESOURCE_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___ECONTENTS = COMPUTING_RESOURCE_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___EALL_CONTENTS = COMPUTING_RESOURCE_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___ECROSS_REFERENCES = COMPUTING_RESOURCE_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___EGET__ESTRUCTURALFEATURE = COMPUTING_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = COMPUTING_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = COMPUTING_RESOURCE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = COMPUTING_RESOURCE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___EUNSET__ESTRUCTURALFEATURE = COMPUTING_RESOURCE_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___EINVOKE__EOPERATION_ELIST = COMPUTING_RESOURCE_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___GET_EXTENSION__ECLASS = COMPUTING_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___PROVIDE_EXTENSION__ECLASS = COMPUTING_RESOURCE_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___GET_ANNOTATION__STRING = COMPUTING_RESOURCE_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___PROVIDE_ANNOTATION__STRING = COMPUTING_RESOURCE_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Processor Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE_OPERATION_COUNT = COMPUTING_RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.StructuredResourceInstanceImpl <em>Structured Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.StructuredResourceInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getStructuredResourceInstance()
	 * @generated
	 */
	int STRUCTURED_RESOURCE_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE__ANNOTATION = RESOURCE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE__EXTENSION = RESOURCE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE__NAME = RESOURCE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE__HWPORTS = RESOURCE_INSTANCE__HWPORTS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE__RESOURCE_TYPE = RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Embedded Atomic Resource Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES = RESOURCE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structured Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE_FEATURE_COUNT = RESOURCE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___ECLASS = RESOURCE_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___EIS_PROXY = RESOURCE_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___ERESOURCE = RESOURCE_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___ECONTAINER = RESOURCE_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___ECONTAINING_FEATURE = RESOURCE_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___ECONTAINMENT_FEATURE = RESOURCE_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___ECONTENTS = RESOURCE_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___EALL_CONTENTS = RESOURCE_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___ECROSS_REFERENCES = RESOURCE_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE = RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = RESOURCE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = RESOURCE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___EUNSET__ESTRUCTURALFEATURE = RESOURCE_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___EINVOKE__EOPERATION_ELIST = RESOURCE_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS = RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___PROVIDE_EXTENSION__ECLASS = RESOURCE_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___GET_ANNOTATION__STRING = RESOURCE_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___PROVIDE_ANNOTATION__STRING = RESOURCE_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Structured Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE_OPERATION_COUNT = RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.SensorInstanceImpl <em>Sensor Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.SensorInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getSensorInstance()
	 * @generated
	 */
	int SENSOR_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE__ANNOTATION = DEVICE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE__EXTENSION = DEVICE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE__NAME = DEVICE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE__HWPORTS = DEVICE_INSTANCE__HWPORTS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE__RESOURCE_TYPE = DEVICE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The number of structural features of the '<em>Sensor Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE_FEATURE_COUNT = DEVICE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___ECLASS = DEVICE_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___EIS_PROXY = DEVICE_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___ERESOURCE = DEVICE_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___ECONTAINER = DEVICE_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___ECONTAINING_FEATURE = DEVICE_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___ECONTAINMENT_FEATURE = DEVICE_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___ECONTENTS = DEVICE_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___EALL_CONTENTS = DEVICE_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___ECROSS_REFERENCES = DEVICE_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___EGET__ESTRUCTURALFEATURE = DEVICE_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = DEVICE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = DEVICE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = DEVICE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___EUNSET__ESTRUCTURALFEATURE = DEVICE_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___EINVOKE__EOPERATION_ELIST = DEVICE_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___GET_EXTENSION__ECLASS = DEVICE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___PROVIDE_EXTENSION__ECLASS = DEVICE_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___GET_ANNOTATION__STRING = DEVICE_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___PROVIDE_ANNOTATION__STRING = DEVICE_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Sensor Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE_OPERATION_COUNT = DEVICE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ActuatorInstanceImpl <em>Actuator Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ActuatorInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getActuatorInstance()
	 * @generated
	 */
	int ACTUATOR_INSTANCE = 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE__ANNOTATION = DEVICE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE__EXTENSION = DEVICE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE__NAME = DEVICE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE__HWPORTS = DEVICE_INSTANCE__HWPORTS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE__RESOURCE_TYPE = DEVICE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The number of structural features of the '<em>Actuator Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE_FEATURE_COUNT = DEVICE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___ECLASS = DEVICE_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___EIS_PROXY = DEVICE_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___ERESOURCE = DEVICE_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___ECONTAINER = DEVICE_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___ECONTAINING_FEATURE = DEVICE_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___ECONTAINMENT_FEATURE = DEVICE_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___ECONTENTS = DEVICE_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___EALL_CONTENTS = DEVICE_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___ECROSS_REFERENCES = DEVICE_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___EGET__ESTRUCTURALFEATURE = DEVICE_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = DEVICE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = DEVICE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = DEVICE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___EUNSET__ESTRUCTURALFEATURE = DEVICE_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___EINVOKE__EOPERATION_ELIST = DEVICE_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___GET_EXTENSION__ECLASS = DEVICE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___PROVIDE_EXTENSION__ECLASS = DEVICE_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___GET_ANNOTATION__STRING = DEVICE_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___PROVIDE_ANNOTATION__STRING = DEVICE_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Actuator Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE_OPERATION_COUNT = DEVICE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ResourceInstanceRepositoryImpl <em>Resource Instance Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ResourceInstanceRepositoryImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getResourceInstanceRepository()
	 * @generated
	 */
	int RESOURCE_INSTANCE_REPOSITORY = 13;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Resource Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Instance Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___ECLASS = CorePackage.COMMENTABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___EIS_PROXY = CorePackage.COMMENTABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___ERESOURCE = CorePackage.COMMENTABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___ECONTAINER = CorePackage.COMMENTABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___ECONTAINING_FEATURE = CorePackage.COMMENTABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___ECONTAINMENT_FEATURE = CorePackage.COMMENTABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___ECONTENTS = CorePackage.COMMENTABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___EALL_CONTENTS = CorePackage.COMMENTABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___ECROSS_REFERENCES = CorePackage.COMMENTABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___EGET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.COMMENTABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___EIS_SET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___EUNSET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___EINVOKE__EOPERATION_ELIST = CorePackage.COMMENTABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___PROVIDE_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___GET_ANNOTATION__STRING = CorePackage.COMMENTABLE_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___PROVIDE_ANNOTATION__STRING = CorePackage.COMMENTABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Resource Instance Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance
	 * @generated
	 */
	EClass getResourceInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance#getResourceType()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EReference getResourceInstance_ResourceType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ComputingResourceInstance <em>Computing Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Resource Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ComputingResourceInstance
	 * @generated
	 */
	EClass getComputingResourceInstance();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ComputingResourceInstance#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frequency</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ComputingResourceInstance#getFrequency()
	 * @see #getComputingResourceInstance()
	 * @generated
	 */
	EReference getComputingResourceInstance_Frequency();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.MemoryResourceInstance <em>Memory Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Resource Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.MemoryResourceInstance
	 * @generated
	 */
	EClass getMemoryResourceInstance();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.MemoryResourceInstance#getMemorySize <em>Memory Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memory Size</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.MemoryResourceInstance#getMemorySize()
	 * @see #getMemoryResourceInstance()
	 * @generated
	 */
	EReference getMemoryResourceInstance_MemorySize();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.MemoryResourceInstance#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throughput</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.MemoryResourceInstance#getThroughput()
	 * @see #getMemoryResourceInstance()
	 * @generated
	 */
	EReference getMemoryResourceInstance_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.MemoryResourceInstance#getMemoryType <em>Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.MemoryResourceInstance#getMemoryType()
	 * @see #getMemoryResourceInstance()
	 * @generated
	 */
	EAttribute getMemoryResourceInstance_MemoryType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.DeviceInstance <em>Device Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.DeviceInstance
	 * @generated
	 */
	EClass getDeviceInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StorageMemoryInstance <em>Storage Memory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Memory Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StorageMemoryInstance
	 * @generated
	 */
	EClass getStorageMemoryInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessingMemoryInstance <em>Processing Memory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Memory Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessingMemoryInstance
	 * @generated
	 */
	EClass getProcessingMemoryInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.CacheInstance <em>Cache Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.CacheInstance
	 * @generated
	 */
	EClass getCacheInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProgrammableLogicDeviceInstance <em>Programmable Logic Device Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programmable Logic Device Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProgrammableLogicDeviceInstance
	 * @generated
	 */
	EClass getProgrammableLogicDeviceInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance <em>Processor Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance
	 * @generated
	 */
	EClass getProcessorInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance#getMIPS <em>MIPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MIPS</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance#getMIPS()
	 * @see #getProcessorInstance()
	 * @generated
	 */
	EAttribute getProcessorInstance_MIPS();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance#getCPI <em>CPI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPI</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance#getCPI()
	 * @see #getProcessorInstance()
	 * @generated
	 */
	EAttribute getProcessorInstance_CPI();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance#getOwnedCacheInstance <em>Owned Cache Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Cache Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ProcessorInstance#getOwnedCacheInstance()
	 * @see #getProcessorInstance()
	 * @generated
	 */
	EReference getProcessorInstance_OwnedCacheInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.AtomicResourceInstance <em>Atomic Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Resource Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.AtomicResourceInstance
	 * @generated
	 */
	EClass getAtomicResourceInstance();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.AtomicResourceInstance#getParentStructuredResourceInstance <em>Parent Structured Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structured Resource Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.AtomicResourceInstance#getParentStructuredResourceInstance()
	 * @see #getAtomicResourceInstance()
	 * @generated
	 */
	EReference getAtomicResourceInstance_ParentStructuredResourceInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance <em>Structured Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Resource Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance
	 * @generated
	 */
	EClass getStructuredResourceInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance#getEmbeddedAtomicResourceInstances <em>Embedded Atomic Resource Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Atomic Resource Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance#getEmbeddedAtomicResourceInstances()
	 * @see #getStructuredResourceInstance()
	 * @generated
	 */
	EReference getStructuredResourceInstance_EmbeddedAtomicResourceInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.SensorInstance <em>Sensor Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.SensorInstance
	 * @generated
	 */
	EClass getSensorInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ActuatorInstance <em>Actuator Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ActuatorInstance
	 * @generated
	 */
	EClass getActuatorInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstanceRepository <em>Resource Instance Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Instance Repository</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstanceRepository
	 * @generated
	 */
	EClass getResourceInstanceRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstanceRepository#getResourceInstances <em>Resource Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstanceRepository#getResourceInstances()
	 * @see #getResourceInstanceRepository()
	 * @generated
	 */
	EReference getResourceInstanceRepository_ResourceInstances();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HwresourceinstanceFactory getHwresourceinstanceFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ResourceInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getResourceInstance()
		 * @generated
		 */
		EClass RESOURCE_INSTANCE = eINSTANCE.getResourceInstance();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INSTANCE__RESOURCE_TYPE = eINSTANCE.getResourceInstance_ResourceType();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ComputingResourceInstanceImpl <em>Computing Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ComputingResourceInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getComputingResourceInstance()
		 * @generated
		 */
		EClass COMPUTING_RESOURCE_INSTANCE = eINSTANCE.getComputingResourceInstance();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_RESOURCE_INSTANCE__FREQUENCY = eINSTANCE.getComputingResourceInstance_Frequency();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.MemoryResourceInstanceImpl <em>Memory Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.MemoryResourceInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getMemoryResourceInstance()
		 * @generated
		 */
		EClass MEMORY_RESOURCE_INSTANCE = eINSTANCE.getMemoryResourceInstance();

		/**
		 * The meta object literal for the '<em><b>Memory Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE = eINSTANCE.getMemoryResourceInstance_MemorySize();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_RESOURCE_INSTANCE__THROUGHPUT = eINSTANCE.getMemoryResourceInstance_Throughput();

		/**
		 * The meta object literal for the '<em><b>Memory Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_RESOURCE_INSTANCE__MEMORY_TYPE = eINSTANCE.getMemoryResourceInstance_MemoryType();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.DeviceInstanceImpl <em>Device Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.DeviceInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getDeviceInstance()
		 * @generated
		 */
		EClass DEVICE_INSTANCE = eINSTANCE.getDeviceInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.StorageMemoryInstanceImpl <em>Storage Memory Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.StorageMemoryInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getStorageMemoryInstance()
		 * @generated
		 */
		EClass STORAGE_MEMORY_INSTANCE = eINSTANCE.getStorageMemoryInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ProcessingMemoryInstanceImpl <em>Processing Memory Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ProcessingMemoryInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getProcessingMemoryInstance()
		 * @generated
		 */
		EClass PROCESSING_MEMORY_INSTANCE = eINSTANCE.getProcessingMemoryInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.CacheInstanceImpl <em>Cache Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.CacheInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getCacheInstance()
		 * @generated
		 */
		EClass CACHE_INSTANCE = eINSTANCE.getCacheInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ProgrammableLogicDeviceInstanceImpl <em>Programmable Logic Device Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ProgrammableLogicDeviceInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getProgrammableLogicDeviceInstance()
		 * @generated
		 */
		EClass PROGRAMMABLE_LOGIC_DEVICE_INSTANCE = eINSTANCE.getProgrammableLogicDeviceInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ProcessorInstanceImpl <em>Processor Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ProcessorInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getProcessorInstance()
		 * @generated
		 */
		EClass PROCESSOR_INSTANCE = eINSTANCE.getProcessorInstance();

		/**
		 * The meta object literal for the '<em><b>MIPS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_INSTANCE__MIPS = eINSTANCE.getProcessorInstance_MIPS();

		/**
		 * The meta object literal for the '<em><b>CPI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_INSTANCE__CPI = eINSTANCE.getProcessorInstance_CPI();

		/**
		 * The meta object literal for the '<em><b>Owned Cache Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR_INSTANCE__OWNED_CACHE_INSTANCE = eINSTANCE.getProcessorInstance_OwnedCacheInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.AtomicResourceInstanceImpl <em>Atomic Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.AtomicResourceInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getAtomicResourceInstance()
		 * @generated
		 */
		EClass ATOMIC_RESOURCE_INSTANCE = eINSTANCE.getAtomicResourceInstance();

		/**
		 * The meta object literal for the '<em><b>Parent Structured Resource Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE = eINSTANCE.getAtomicResourceInstance_ParentStructuredResourceInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.StructuredResourceInstanceImpl <em>Structured Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.StructuredResourceInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getStructuredResourceInstance()
		 * @generated
		 */
		EClass STRUCTURED_RESOURCE_INSTANCE = eINSTANCE.getStructuredResourceInstance();

		/**
		 * The meta object literal for the '<em><b>Embedded Atomic Resource Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES = eINSTANCE.getStructuredResourceInstance_EmbeddedAtomicResourceInstances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.SensorInstanceImpl <em>Sensor Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.SensorInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getSensorInstance()
		 * @generated
		 */
		EClass SENSOR_INSTANCE = eINSTANCE.getSensorInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ActuatorInstanceImpl <em>Actuator Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ActuatorInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getActuatorInstance()
		 * @generated
		 */
		EClass ACTUATOR_INSTANCE = eINSTANCE.getActuatorInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ResourceInstanceRepositoryImpl <em>Resource Instance Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.ResourceInstanceRepositoryImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getResourceInstanceRepository()
		 * @generated
		 */
		EClass RESOURCE_INSTANCE_REPOSITORY = eINSTANCE.getResourceInstanceRepository();

		/**
		 * The meta object literal for the '<em><b>Resource Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES = eINSTANCE.getResourceInstanceRepository_ResourceInstances();

	}

} //HwresourceinstancePackage
