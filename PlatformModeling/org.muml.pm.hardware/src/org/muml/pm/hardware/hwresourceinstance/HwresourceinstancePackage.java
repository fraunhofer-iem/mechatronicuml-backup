/**
 */
package org.muml.pm.hardware.hwresourceinstance;

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
 * <!-- begin-model-doc -->
 * The package platform contains all classes of the Platform Type Viewpoint.
 * Hardware platforms are defined at the type level and may be instantiated in a HWPlatformInstanceConfiguration at the Platform Instance Viewpoint.
 * 
 * <!-- end-model-doc -->
 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstanceFactory
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
	String eNS_URI = "http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0";

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
	HwresourceinstancePackage eINSTANCE = org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.ResourceInstanceImpl
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getResourceInstance()
	 * @generated
	 */
	int RESOURCE_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.AtomicResourceInstanceImpl <em>Atomic Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.AtomicResourceInstanceImpl
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getAtomicResourceInstance()
	 * @generated
	 */
	int ATOMIC_RESOURCE_INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE__ANNOTATIONS = RESOURCE_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE__EXTENSIONS = RESOURCE_INSTANCE__EXTENSIONS;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS = RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Atomic Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE_OPERATION_COUNT = RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.ComputingResourceInstanceImpl <em>Computing Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.ComputingResourceInstanceImpl
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getComputingResourceInstance()
	 * @generated
	 */
	int COMPUTING_RESOURCE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE__ANNOTATIONS = ATOMIC_RESOURCE_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE__EXTENSIONS = ATOMIC_RESOURCE_INSTANCE__EXTENSIONS;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS = ATOMIC_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Computing Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE_OPERATION_COUNT = ATOMIC_RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.MemoryResourceInstanceImpl <em>Memory Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.MemoryResourceInstanceImpl
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getMemoryResourceInstance()
	 * @generated
	 */
	int MEMORY_RESOURCE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE__ANNOTATIONS = ATOMIC_RESOURCE_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE__EXTENSIONS = ATOMIC_RESOURCE_INSTANCE__EXTENSIONS;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS = ATOMIC_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Memory Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE_OPERATION_COUNT = ATOMIC_RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.DeviceInstanceImpl <em>Device Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.DeviceInstanceImpl
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getDeviceInstance()
	 * @generated
	 */
	int DEVICE_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE__ANNOTATIONS = RESOURCE_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE__EXTENSIONS = RESOURCE_INSTANCE__EXTENSIONS;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE___GET_EXTENSION__ECLASS = RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Device Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE_OPERATION_COUNT = RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.StorageMemoryInstanceImpl <em>Storage Memory Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.StorageMemoryInstanceImpl
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getStorageMemoryInstance()
	 * @generated
	 */
	int STORAGE_MEMORY_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE__ANNOTATIONS = MEMORY_RESOURCE_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE__EXTENSIONS = MEMORY_RESOURCE_INSTANCE__EXTENSIONS;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE___GET_EXTENSION__ECLASS = MEMORY_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Storage Memory Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE_OPERATION_COUNT = MEMORY_RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.ProcessingMemoryInstanceImpl <em>Processing Memory Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.ProcessingMemoryInstanceImpl
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getProcessingMemoryInstance()
	 * @generated
	 */
	int PROCESSING_MEMORY_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE__ANNOTATIONS = MEMORY_RESOURCE_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE__EXTENSIONS = MEMORY_RESOURCE_INSTANCE__EXTENSIONS;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE___GET_EXTENSION__ECLASS = MEMORY_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Processing Memory Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE_OPERATION_COUNT = MEMORY_RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.CacheInstanceImpl <em>Cache Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.CacheInstanceImpl
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getCacheInstance()
	 * @generated
	 */
	int CACHE_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE__ANNOTATIONS = MEMORY_RESOURCE_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE__EXTENSIONS = MEMORY_RESOURCE_INSTANCE__EXTENSIONS;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE___GET_EXTENSION__ECLASS = MEMORY_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Cache Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE_OPERATION_COUNT = MEMORY_RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.ProgrammableLogicDeviceInstanceImpl <em>Programmable Logic Device Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.ProgrammableLogicDeviceInstanceImpl
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getProgrammableLogicDeviceInstance()
	 * @generated
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE__ANNOTATIONS = COMPUTING_RESOURCE_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE__EXTENSIONS = COMPUTING_RESOURCE_INSTANCE__EXTENSIONS;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE___GET_EXTENSION__ECLASS = COMPUTING_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Programmable Logic Device Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE_OPERATION_COUNT = COMPUTING_RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.ProcessorInstanceImpl <em>Processor Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.ProcessorInstanceImpl
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getProcessorInstance()
	 * @generated
	 */
	int PROCESSOR_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE__ANNOTATIONS = COMPUTING_RESOURCE_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE__EXTENSIONS = COMPUTING_RESOURCE_INSTANCE__EXTENSIONS;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE___GET_EXTENSION__ECLASS = COMPUTING_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Processor Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE_OPERATION_COUNT = COMPUTING_RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.StructuredResourceInstanceImpl <em>Structured Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.StructuredResourceInstanceImpl
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getStructuredResourceInstance()
	 * @generated
	 */
	int STRUCTURED_RESOURCE_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE__ANNOTATIONS = RESOURCE_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE__EXTENSIONS = RESOURCE_INSTANCE__EXTENSIONS;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS = RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Structured Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE_OPERATION_COUNT = RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.SensorInstanceImpl <em>Sensor Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.SensorInstanceImpl
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getSensorInstance()
	 * @generated
	 */
	int SENSOR_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE__ANNOTATIONS = DEVICE_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE__EXTENSIONS = DEVICE_INSTANCE__EXTENSIONS;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE___GET_EXTENSION__ECLASS = DEVICE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Sensor Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE_OPERATION_COUNT = DEVICE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.ActuatorInstanceImpl <em>Actuator Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.ActuatorInstanceImpl
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getActuatorInstance()
	 * @generated
	 */
	int ACTUATOR_INSTANCE = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE__ANNOTATIONS = DEVICE_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE__EXTENSIONS = DEVICE_INSTANCE__EXTENSIONS;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE___GET_EXTENSION__ECLASS = DEVICE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Actuator Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE_OPERATION_COUNT = DEVICE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.ResourceInstanceRepositoryImpl <em>Resource Instance Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.ResourceInstanceRepositoryImpl
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getResourceInstanceRepository()
	 * @generated
	 */
	int RESOURCE_INSTANCE_REPOSITORY = 13;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY__ANNOTATIONS = CorePackage.COMMENTABLE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Resource Instance Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_REPOSITORY_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.HWPortImpl <em>HW Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.HWPortImpl
	 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getHWPort()
	 * @generated
	 */
	int HW_PORT = 14;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Resource Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__PARENT_RESOURCE_INSTANCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__COMMUNICATION_RESOURCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__PROTOCOL = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__CARDINALITY = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multi HW Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__MULTI_HW_PORT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Port Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__PORT_KIND = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>HW Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>HW Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresourceinstance.ResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Instance</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.ResourceInstance
	 * @generated
	 */
	EClass getResourceInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.hardware.hwresourceinstance.ResourceInstance#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Type</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.ResourceInstance#getResourceType()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EReference getResourceInstance_ResourceType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwresourceinstance.ResourceInstance#getHwports <em>Hwports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hwports</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.ResourceInstance#getHwports()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EReference getResourceInstance_Hwports();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresourceinstance.ComputingResourceInstance <em>Computing Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Resource Instance</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.ComputingResourceInstance
	 * @generated
	 */
	EClass getComputingResourceInstance();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwresourceinstance.ComputingResourceInstance#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frequency</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.ComputingResourceInstance#getFrequency()
	 * @see #getComputingResourceInstance()
	 * @generated
	 */
	EReference getComputingResourceInstance_Frequency();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresourceinstance.MemoryResourceInstance <em>Memory Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Resource Instance</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.MemoryResourceInstance
	 * @generated
	 */
	EClass getMemoryResourceInstance();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwresourceinstance.MemoryResourceInstance#getMemorySize <em>Memory Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memory Size</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.MemoryResourceInstance#getMemorySize()
	 * @see #getMemoryResourceInstance()
	 * @generated
	 */
	EReference getMemoryResourceInstance_MemorySize();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwresourceinstance.MemoryResourceInstance#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throughput</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.MemoryResourceInstance#getThroughput()
	 * @see #getMemoryResourceInstance()
	 * @generated
	 */
	EReference getMemoryResourceInstance_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresourceinstance.MemoryResourceInstance#getMemoryType <em>Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Type</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.MemoryResourceInstance#getMemoryType()
	 * @see #getMemoryResourceInstance()
	 * @generated
	 */
	EAttribute getMemoryResourceInstance_MemoryType();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresourceinstance.DeviceInstance <em>Device Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Instance</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.DeviceInstance
	 * @generated
	 */
	EClass getDeviceInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresourceinstance.StorageMemoryInstance <em>Storage Memory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Memory Instance</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.StorageMemoryInstance
	 * @generated
	 */
	EClass getStorageMemoryInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresourceinstance.ProcessingMemoryInstance <em>Processing Memory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Memory Instance</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.ProcessingMemoryInstance
	 * @generated
	 */
	EClass getProcessingMemoryInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresourceinstance.CacheInstance <em>Cache Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache Instance</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.CacheInstance
	 * @generated
	 */
	EClass getCacheInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresourceinstance.ProgrammableLogicDeviceInstance <em>Programmable Logic Device Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programmable Logic Device Instance</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.ProgrammableLogicDeviceInstance
	 * @generated
	 */
	EClass getProgrammableLogicDeviceInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresourceinstance.ProcessorInstance <em>Processor Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor Instance</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.ProcessorInstance
	 * @generated
	 */
	EClass getProcessorInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresourceinstance.ProcessorInstance#getMIPS <em>MIPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MIPS</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.ProcessorInstance#getMIPS()
	 * @see #getProcessorInstance()
	 * @generated
	 */
	EAttribute getProcessorInstance_MIPS();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresourceinstance.ProcessorInstance#getCPI <em>CPI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPI</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.ProcessorInstance#getCPI()
	 * @see #getProcessorInstance()
	 * @generated
	 */
	EAttribute getProcessorInstance_CPI();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.hardware.hwresourceinstance.ProcessorInstance#getOwnedCacheInstance <em>Owned Cache Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Cache Instance</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.ProcessorInstance#getOwnedCacheInstance()
	 * @see #getProcessorInstance()
	 * @generated
	 */
	EReference getProcessorInstance_OwnedCacheInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresourceinstance.AtomicResourceInstance <em>Atomic Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Resource Instance</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.AtomicResourceInstance
	 * @generated
	 */
	EClass getAtomicResourceInstance();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pm.hardware.hwresourceinstance.AtomicResourceInstance#getParentStructuredResourceInstance <em>Parent Structured Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structured Resource Instance</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.AtomicResourceInstance#getParentStructuredResourceInstance()
	 * @see #getAtomicResourceInstance()
	 * @generated
	 */
	EReference getAtomicResourceInstance_ParentStructuredResourceInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance <em>Structured Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Resource Instance</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance
	 * @generated
	 */
	EClass getStructuredResourceInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance#getEmbeddedAtomicResourceInstances <em>Embedded Atomic Resource Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Atomic Resource Instances</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance#getEmbeddedAtomicResourceInstances()
	 * @see #getStructuredResourceInstance()
	 * @generated
	 */
	EReference getStructuredResourceInstance_EmbeddedAtomicResourceInstances();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresourceinstance.SensorInstance <em>Sensor Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Instance</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.SensorInstance
	 * @generated
	 */
	EClass getSensorInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresourceinstance.ActuatorInstance <em>Actuator Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Instance</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.ActuatorInstance
	 * @generated
	 */
	EClass getActuatorInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresourceinstance.ResourceInstanceRepository <em>Resource Instance Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Instance Repository</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.ResourceInstanceRepository
	 * @generated
	 */
	EClass getResourceInstanceRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwresourceinstance.ResourceInstanceRepository#getResourceInstances <em>Resource Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Instances</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.ResourceInstanceRepository#getResourceInstances()
	 * @see #getResourceInstanceRepository()
	 * @generated
	 */
	EReference getResourceInstanceRepository_ResourceInstances();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresourceinstance.HWPort <em>HW Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Port</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.HWPort
	 * @generated
	 */
	EClass getHWPort();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pm.hardware.hwresourceinstance.HWPort#getParentResourceInstance <em>Parent Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Resource Instance</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.HWPort#getParentResourceInstance()
	 * @see #getHWPort()
	 * @generated
	 */
	EReference getHWPort_ParentResourceInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.hardware.hwresourceinstance.HWPort#getCommunicationResource <em>Communication Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Resource</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.HWPort#getCommunicationResource()
	 * @see #getHWPort()
	 * @generated
	 */
	EReference getHWPort_CommunicationResource();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.hardware.hwresourceinstance.HWPort#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.HWPort#getProtocol()
	 * @see #getHWPort()
	 * @generated
	 */
	EReference getHWPort_Protocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwresourceinstance.HWPort#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.HWPort#getCardinality()
	 * @see #getHWPort()
	 * @generated
	 */
	EReference getHWPort_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresourceinstance.HWPort#isMultiHWPort <em>Multi HW Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi HW Port</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.HWPort#isMultiHWPort()
	 * @see #getHWPort()
	 * @generated
	 */
	EAttribute getHWPort_MultiHWPort();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresourceinstance.HWPort#getPortKind <em>Port Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Kind</em>'.
	 * @see org.muml.pm.hardware.hwresourceinstance.HWPort#getPortKind()
	 * @see #getHWPort()
	 * @generated
	 */
	EAttribute getHWPort_PortKind();

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
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.ResourceInstanceImpl
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getResourceInstance()
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
		 * The meta object literal for the '<em><b>Hwports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INSTANCE__HWPORTS = eINSTANCE.getResourceInstance_Hwports();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.ComputingResourceInstanceImpl <em>Computing Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.ComputingResourceInstanceImpl
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getComputingResourceInstance()
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
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.MemoryResourceInstanceImpl <em>Memory Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.MemoryResourceInstanceImpl
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getMemoryResourceInstance()
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
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.DeviceInstanceImpl <em>Device Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.DeviceInstanceImpl
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getDeviceInstance()
		 * @generated
		 */
		EClass DEVICE_INSTANCE = eINSTANCE.getDeviceInstance();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.StorageMemoryInstanceImpl <em>Storage Memory Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.StorageMemoryInstanceImpl
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getStorageMemoryInstance()
		 * @generated
		 */
		EClass STORAGE_MEMORY_INSTANCE = eINSTANCE.getStorageMemoryInstance();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.ProcessingMemoryInstanceImpl <em>Processing Memory Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.ProcessingMemoryInstanceImpl
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getProcessingMemoryInstance()
		 * @generated
		 */
		EClass PROCESSING_MEMORY_INSTANCE = eINSTANCE.getProcessingMemoryInstance();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.CacheInstanceImpl <em>Cache Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.CacheInstanceImpl
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getCacheInstance()
		 * @generated
		 */
		EClass CACHE_INSTANCE = eINSTANCE.getCacheInstance();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.ProgrammableLogicDeviceInstanceImpl <em>Programmable Logic Device Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.ProgrammableLogicDeviceInstanceImpl
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getProgrammableLogicDeviceInstance()
		 * @generated
		 */
		EClass PROGRAMMABLE_LOGIC_DEVICE_INSTANCE = eINSTANCE.getProgrammableLogicDeviceInstance();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.ProcessorInstanceImpl <em>Processor Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.ProcessorInstanceImpl
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getProcessorInstance()
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
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.AtomicResourceInstanceImpl <em>Atomic Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.AtomicResourceInstanceImpl
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getAtomicResourceInstance()
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
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.StructuredResourceInstanceImpl <em>Structured Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.StructuredResourceInstanceImpl
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getStructuredResourceInstance()
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
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.SensorInstanceImpl <em>Sensor Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.SensorInstanceImpl
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getSensorInstance()
		 * @generated
		 */
		EClass SENSOR_INSTANCE = eINSTANCE.getSensorInstance();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.ActuatorInstanceImpl <em>Actuator Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.ActuatorInstanceImpl
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getActuatorInstance()
		 * @generated
		 */
		EClass ACTUATOR_INSTANCE = eINSTANCE.getActuatorInstance();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.ResourceInstanceRepositoryImpl <em>Resource Instance Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.ResourceInstanceRepositoryImpl
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getResourceInstanceRepository()
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

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresourceinstance.impl.HWPortImpl <em>HW Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.HWPortImpl
		 * @see org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl#getHWPort()
		 * @generated
		 */
		EClass HW_PORT = eINSTANCE.getHWPort();

		/**
		 * The meta object literal for the '<em><b>Parent Resource Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT__PARENT_RESOURCE_INSTANCE = eINSTANCE.getHWPort_ParentResourceInstance();

		/**
		 * The meta object literal for the '<em><b>Communication Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT__COMMUNICATION_RESOURCE = eINSTANCE.getHWPort_CommunicationResource();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT__PROTOCOL = eINSTANCE.getHWPort_Protocol();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT__CARDINALITY = eINSTANCE.getHWPort_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Multi HW Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_PORT__MULTI_HW_PORT = eINSTANCE.getHWPort_MultiHWPort();

		/**
		 * The meta object literal for the '<em><b>Port Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_PORT__PORT_KIND = eINSTANCE.getHWPort_PortKind();

	}

} //HwresourceinstancePackage
