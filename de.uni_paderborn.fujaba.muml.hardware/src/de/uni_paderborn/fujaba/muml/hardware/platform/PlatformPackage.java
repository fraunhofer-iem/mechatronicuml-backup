/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The package platform contains all classes of the Platform Type Viewpoint.
 * Hardware platforms are defined at the type level and may be instantiated in a HWPlatformInstanceConfiguration at the Platform Instance Viewpoint.
 * 
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface PlatformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "platform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/hardware/platform/1.0/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "platform";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatformPackage eINSTANCE = de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformConfigurationImpl <em>HW Platform Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformConfigurationImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getHWPlatformConfiguration()
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
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION__REPOSITORIES = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HW Platform Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_CONFIGURATION_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.ResourceInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getResourceInstance()
	 * @generated
	 */
	int RESOURCE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__NAME = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__RESOURCE_TYPE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hwport Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__HWPORT_INSTANCES = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.AtomicResourceInstanceImpl <em>Atomic Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.AtomicResourceInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getAtomicResourceInstance()
	 * @generated
	 */
	int ATOMIC_RESOURCE_INSTANCE = 10;

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
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE__RESOURCE_TYPE = RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Hwport Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_INSTANCE__HWPORT_INSTANCES = RESOURCE_INSTANCE__HWPORT_INSTANCES;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ComputingResourceInstanceImpl <em>Computing Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.ComputingResourceInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getComputingResourceInstance()
	 * @generated
	 */
	int COMPUTING_RESOURCE_INSTANCE = 2;

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
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE__RESOURCE_TYPE = ATOMIC_RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Hwport Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_INSTANCE__HWPORT_INSTANCES = ATOMIC_RESOURCE_INSTANCE__HWPORT_INSTANCES;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.MemoryResourceInstanceImpl <em>Memory Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.MemoryResourceInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getMemoryResourceInstance()
	 * @generated
	 */
	int MEMORY_RESOURCE_INSTANCE = 3;

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
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE__RESOURCE_TYPE = ATOMIC_RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Hwport Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_INSTANCE__HWPORT_INSTANCES = ATOMIC_RESOURCE_INSTANCE__HWPORT_INSTANCES;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.DeviceInstanceImpl <em>Device Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.DeviceInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getDeviceInstance()
	 * @generated
	 */
	int DEVICE_INSTANCE = 4;

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
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE__RESOURCE_TYPE = RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Hwport Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE__HWPORT_INSTANCES = RESOURCE_INSTANCE__HWPORT_INSTANCES;

	/**
	 * The number of structural features of the '<em>Device Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_INSTANCE_FEATURE_COUNT = RESOURCE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.StorageMemoryInstanceImpl <em>Storage Memory Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.StorageMemoryInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getStorageMemoryInstance()
	 * @generated
	 */
	int STORAGE_MEMORY_INSTANCE = 5;

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
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE__RESOURCE_TYPE = MEMORY_RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Hwport Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MEMORY_INSTANCE__HWPORT_INSTANCES = MEMORY_RESOURCE_INSTANCE__HWPORT_INSTANCES;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ProcessingMemoryInstanceImpl <em>Processing Memory Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.ProcessingMemoryInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getProcessingMemoryInstance()
	 * @generated
	 */
	int PROCESSING_MEMORY_INSTANCE = 6;

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
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE__RESOURCE_TYPE = MEMORY_RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Hwport Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_MEMORY_INSTANCE__HWPORT_INSTANCES = MEMORY_RESOURCE_INSTANCE__HWPORT_INSTANCES;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.CacheInstanceImpl <em>Cache Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.CacheInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getCacheInstance()
	 * @generated
	 */
	int CACHE_INSTANCE = 7;

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
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE__RESOURCE_TYPE = MEMORY_RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Hwport Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_INSTANCE__HWPORT_INSTANCES = MEMORY_RESOURCE_INSTANCE__HWPORT_INSTANCES;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ProgrammableLogicDeviceInstanceImpl <em>Programmable Logic Device Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.ProgrammableLogicDeviceInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getProgrammableLogicDeviceInstance()
	 * @generated
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE = 8;

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
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE__RESOURCE_TYPE = COMPUTING_RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Hwport Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_INSTANCE__HWPORT_INSTANCES = COMPUTING_RESOURCE_INSTANCE__HWPORT_INSTANCES;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ProcessorInstanceImpl <em>Processor Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.ProcessorInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getProcessorInstance()
	 * @generated
	 */
	int PROCESSOR_INSTANCE = 9;

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
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE__RESOURCE_TYPE = COMPUTING_RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Hwport Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INSTANCE__HWPORT_INSTANCES = COMPUTING_RESOURCE_INSTANCE__HWPORT_INSTANCES;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.StructuredResourceInstanceImpl <em>Structured Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.StructuredResourceInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getStructuredResourceInstance()
	 * @generated
	 */
	int STRUCTURED_RESOURCE_INSTANCE = 11;

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
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE__RESOURCE_TYPE = RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Hwport Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_INSTANCE__HWPORT_INSTANCES = RESOURCE_INSTANCE__HWPORT_INSTANCES;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.CommunicationResourceImpl <em>Communication Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.CommunicationResourceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getCommunicationResource()
	 * @generated
	 */
	int COMMUNICATION_RESOURCE = 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The number of structural features of the '<em>Communication Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.CommunicationMediaImpl <em>Communication Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.CommunicationMediaImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getCommunicationMedia()
	 * @generated
	 */
	int COMMUNICATION_MEDIA = 15;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__ANNOTATION = COMMUNICATION_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__EXTENSION = COMMUNICATION_RESOURCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__COMMENT = COMMUNICATION_RESOURCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Data Frame Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__DATA_FRAME_SIZE = COMMUNICATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__IS_SERIAL = COMMUNICATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__BANDWIDTH = COMMUNICATION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__PROTOCOL = COMMUNICATION_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connected HW Port Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__CONNECTED_HW_PORT_PARTS = COMMUNICATION_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connected Bridges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__CONNECTED_BRIDGES = COMMUNICATION_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Connected HW Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__CONNECTED_HW_PORT_INSTANCES = COMMUNICATION_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Communication Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_FEATURE_COUNT = COMMUNICATION_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.BusImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 13;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ANNOTATION = COMMUNICATION_MEDIA__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__EXTENSION = COMMUNICATION_MEDIA__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__COMMENT = COMMUNICATION_MEDIA__COMMENT;

	/**
	 * The feature id for the '<em><b>Data Frame Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__DATA_FRAME_SIZE = COMMUNICATION_MEDIA__DATA_FRAME_SIZE;

	/**
	 * The feature id for the '<em><b>Is Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__IS_SERIAL = COMMUNICATION_MEDIA__IS_SERIAL;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BANDWIDTH = COMMUNICATION_MEDIA__BANDWIDTH;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__PROTOCOL = COMMUNICATION_MEDIA__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Connected HW Port Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CONNECTED_HW_PORT_PARTS = COMMUNICATION_MEDIA__CONNECTED_HW_PORT_PARTS;

	/**
	 * The feature id for the '<em><b>Connected Bridges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CONNECTED_BRIDGES = COMMUNICATION_MEDIA__CONNECTED_BRIDGES;

	/**
	 * The feature id for the '<em><b>Connected HW Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CONNECTED_HW_PORT_INSTANCES = COMMUNICATION_MEDIA__CONNECTED_HW_PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Connected Bus Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CONNECTED_BUS_PORT_INSTANCES = COMMUNICATION_MEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = COMMUNICATION_MEDIA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.LinkImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 14;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ANNOTATION = COMMUNICATION_MEDIA__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__EXTENSION = COMMUNICATION_MEDIA__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__COMMENT = COMMUNICATION_MEDIA__COMMENT;

	/**
	 * The feature id for the '<em><b>Data Frame Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DATA_FRAME_SIZE = COMMUNICATION_MEDIA__DATA_FRAME_SIZE;

	/**
	 * The feature id for the '<em><b>Is Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__IS_SERIAL = COMMUNICATION_MEDIA__IS_SERIAL;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__BANDWIDTH = COMMUNICATION_MEDIA__BANDWIDTH;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__PROTOCOL = COMMUNICATION_MEDIA__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Connected HW Port Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CONNECTED_HW_PORT_PARTS = COMMUNICATION_MEDIA__CONNECTED_HW_PORT_PARTS;

	/**
	 * The feature id for the '<em><b>Connected Bridges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CONNECTED_BRIDGES = COMMUNICATION_MEDIA__CONNECTED_BRIDGES;

	/**
	 * The feature id for the '<em><b>Connected HW Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CONNECTED_HW_PORT_INSTANCES = COMMUNICATION_MEDIA__CONNECTED_HW_PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Connected Link Port Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CONNECTED_LINK_PORT_INSTANCES = COMMUNICATION_MEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = COMMUNICATION_MEDIA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformImpl <em>HW Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getHWPlatform()
	 * @generated
	 */
	int HW_PLATFORM = 16;

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
	 * The feature id for the '<em><b>Embedded Communication Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM__EMBEDDED_COMMUNICATION_RESOURCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delegation Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM__DELEGATION_PORTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delegations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM__DELEGATIONS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>HW Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPartImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getPlatformPart()
	 * @generated
	 */
	int PLATFORM_PART = 17;

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
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_PART_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformPartImpl <em>HW Platform Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformPartImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getHWPlatformPart()
	 * @generated
	 */
	int HW_PLATFORM_PART = 18;

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
	 * The feature id for the '<em><b>Hwplatform Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART__HWPLATFORM_TYPE = PLATFORM_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived Bridges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART__DERIVED_BRIDGES = PLATFORM_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delegation Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART__DELEGATION_PORTS = PLATFORM_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>HW Platform Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLATFORM_PART_FEATURE_COUNT = PLATFORM_PART_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.SensorInstanceImpl <em>Sensor Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.SensorInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getSensorInstance()
	 * @generated
	 */
	int SENSOR_INSTANCE = 19;

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
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE__RESOURCE_TYPE = DEVICE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Hwport Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE__HWPORT_INSTANCES = DEVICE_INSTANCE__HWPORT_INSTANCES;

	/**
	 * The number of structural features of the '<em>Sensor Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_INSTANCE_FEATURE_COUNT = DEVICE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ActuatorInstanceImpl <em>Actuator Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.ActuatorInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getActuatorInstance()
	 * @generated
	 */
	int ACTUATOR_INSTANCE = 20;

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
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE__RESOURCE_TYPE = DEVICE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Hwport Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE__HWPORT_INSTANCES = DEVICE_INSTANCE__HWPORT_INSTANCES;

	/**
	 * The number of structural features of the '<em>Actuator Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_INSTANCE_FEATURE_COUNT = DEVICE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.BridgeImpl <em>Bridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.BridgeImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getBridge()
	 * @generated
	 */
	int BRIDGE = 21;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__ANNOTATION = COMMUNICATION_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__EXTENSION = COMMUNICATION_RESOURCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__COMMENT = COMMUNICATION_RESOURCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Connected Communication Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__CONNECTED_COMMUNICATION_MEDIA = COMMUNICATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__DELAY = COMMUNICATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_FEATURE_COUNT = COMMUNICATION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortInstanceImpl <em>HW Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getHWPortInstance()
	 * @generated
	 */
	int HW_PORT_INSTANCE = 22;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Hwport Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__HWPORT_TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Resource Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Queuing Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__QUEUING_TIME = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__PROTOCOL = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connected Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__CONNECTED_MEDIA = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Payload Data Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__PAYLOAD_DATA_SIZE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Delegation Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__IS_DELEGATION_PORT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Delegation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE__DELEGATION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>HW Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_INSTANCE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.BusPortInstanceImpl <em>Bus Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.BusPortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getBusPortInstance()
	 * @generated
	 */
	int BUS_PORT_INSTANCE = 23;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PORT_INSTANCE__ANNOTATION = HW_PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PORT_INSTANCE__EXTENSION = HW_PORT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PORT_INSTANCE__NAME = HW_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Hwport Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PORT_INSTANCE__HWPORT_TYPE = HW_PORT_INSTANCE__HWPORT_TYPE;

	/**
	 * The feature id for the '<em><b>Parent Resource Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE = HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Queuing Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PORT_INSTANCE__QUEUING_TIME = HW_PORT_INSTANCE__QUEUING_TIME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PORT_INSTANCE__PROTOCOL = HW_PORT_INSTANCE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Connected Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PORT_INSTANCE__CONNECTED_MEDIA = HW_PORT_INSTANCE__CONNECTED_MEDIA;

	/**
	 * The feature id for the '<em><b>Payload Data Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PORT_INSTANCE__PAYLOAD_DATA_SIZE = HW_PORT_INSTANCE__PAYLOAD_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Is Delegation Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PORT_INSTANCE__IS_DELEGATION_PORT = HW_PORT_INSTANCE__IS_DELEGATION_PORT;

	/**
	 * The feature id for the '<em><b>Delegation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PORT_INSTANCE__DELEGATION = HW_PORT_INSTANCE__DELEGATION;

	/**
	 * The feature id for the '<em><b>Connected Bus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PORT_INSTANCE__CONNECTED_BUS = HW_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bus Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PORT_INSTANCE_FEATURE_COUNT = HW_PORT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.LinkPortInstanceImpl <em>Link Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.LinkPortInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getLinkPortInstance()
	 * @generated
	 */
	int LINK_PORT_INSTANCE = 24;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PORT_INSTANCE__ANNOTATION = HW_PORT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PORT_INSTANCE__EXTENSION = HW_PORT_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PORT_INSTANCE__NAME = HW_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Hwport Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PORT_INSTANCE__HWPORT_TYPE = HW_PORT_INSTANCE__HWPORT_TYPE;

	/**
	 * The feature id for the '<em><b>Parent Resource Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE = HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Queuing Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PORT_INSTANCE__QUEUING_TIME = HW_PORT_INSTANCE__QUEUING_TIME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PORT_INSTANCE__PROTOCOL = HW_PORT_INSTANCE__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Connected Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PORT_INSTANCE__CONNECTED_MEDIA = HW_PORT_INSTANCE__CONNECTED_MEDIA;

	/**
	 * The feature id for the '<em><b>Payload Data Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PORT_INSTANCE__PAYLOAD_DATA_SIZE = HW_PORT_INSTANCE__PAYLOAD_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Is Delegation Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PORT_INSTANCE__IS_DELEGATION_PORT = HW_PORT_INSTANCE__IS_DELEGATION_PORT;

	/**
	 * The feature id for the '<em><b>Delegation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PORT_INSTANCE__DELEGATION = HW_PORT_INSTANCE__DELEGATION;

	/**
	 * The feature id for the '<em><b>Connected Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PORT_INSTANCE__CONNECTED_LINK = HW_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PORT_INSTANCE_FEATURE_COUNT = HW_PORT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ResourceInstanceRepositoryImpl <em>Resource Instance Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.ResourceInstanceRepositoryImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getResourceInstanceRepository()
	 * @generated
	 */
	int RESOURCE_INSTANCE_REPOSITORY = 25;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ResourceInstancePartImpl <em>Resource Instance Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.ResourceInstancePartImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getResourceInstancePart()
	 * @generated
	 */
	int RESOURCE_INSTANCE_PART = 26;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_PART__ANNOTATION = PLATFORM_PART__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_PART__EXTENSION = PLATFORM_PART__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_PART__NAME = PLATFORM_PART__NAME;

	/**
	 * The feature id for the '<em><b>Parent HW Platform</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_PART__PARENT_HW_PLATFORM = PLATFORM_PART__PARENT_HW_PLATFORM;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_PART__CARDINALITY = PLATFORM_PART__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Resource Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_PART__RESOURCE_INSTANCE_TYPE = PLATFORM_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hwport Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_PART__HWPORT_PARTS = PLATFORM_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Instance Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_PART_FEATURE_COUNT = PLATFORM_PART_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.DelegationImpl <em>Delegation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.DelegationImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getDelegation()
	 * @generated
	 */
	int DELEGATION = 27;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__ANNOTATION = CorePackage.COMMENTABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__EXTENSION = CorePackage.COMMENTABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Hw Port Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__HW_PORT_INSTANCE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hw Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__HW_PORT_PART = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delegation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortPartImpl <em>HW Port Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortPartImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getHWPortPart()
	 * @generated
	 */
	int HW_PORT_PART = 28;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Hw Port Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__HW_PORT_INSTANCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connected Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__CONNECTED_MEDIA = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART__PROTOCOL = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>HW Port Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_PART_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformConfiguration <em>HW Platform Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Platform Configuration</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformConfiguration
	 * @generated
	 */
	EClass getHWPlatformConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformConfiguration#getHwplatforms <em>Hwplatforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hwplatforms</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformConfiguration#getHwplatforms()
	 * @see #getHWPlatformConfiguration()
	 * @generated
	 */
	EReference getHWPlatformConfiguration_Hwplatforms();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformConfiguration#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformConfiguration#getRepositories()
	 * @see #getHWPlatformConfiguration()
	 * @generated
	 */
	EReference getHWPlatformConfiguration_Repositories();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance
	 * @generated
	 */
	EClass getResourceInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance#getResourceType()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EReference getResourceInstance_ResourceType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance#getHwportInstances <em>Hwport Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hwport Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance#getHwportInstances()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EReference getResourceInstance_HwportInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ComputingResourceInstance <em>Computing Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Resource Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ComputingResourceInstance
	 * @generated
	 */
	EClass getComputingResourceInstance();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ComputingResourceInstance#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frequency</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ComputingResourceInstance#getFrequency()
	 * @see #getComputingResourceInstance()
	 * @generated
	 */
	EReference getComputingResourceInstance_Frequency();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance <em>Memory Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Resource Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance
	 * @generated
	 */
	EClass getMemoryResourceInstance();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance#getMemorySize <em>Memory Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memory Size</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance#getMemorySize()
	 * @see #getMemoryResourceInstance()
	 * @generated
	 */
	EReference getMemoryResourceInstance_MemorySize();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throughput</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance#getThroughput()
	 * @see #getMemoryResourceInstance()
	 * @generated
	 */
	EReference getMemoryResourceInstance_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance#getMemoryType <em>Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance#getMemoryType()
	 * @see #getMemoryResourceInstance()
	 * @generated
	 */
	EAttribute getMemoryResourceInstance_MemoryType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.DeviceInstance <em>Device Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.DeviceInstance
	 * @generated
	 */
	EClass getDeviceInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.StorageMemoryInstance <em>Storage Memory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Memory Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.StorageMemoryInstance
	 * @generated
	 */
	EClass getStorageMemoryInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ProcessingMemoryInstance <em>Processing Memory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Memory Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ProcessingMemoryInstance
	 * @generated
	 */
	EClass getProcessingMemoryInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CacheInstance <em>Cache Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.CacheInstance
	 * @generated
	 */
	EClass getCacheInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ProgrammableLogicDeviceInstance <em>Programmable Logic Device Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programmable Logic Device Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ProgrammableLogicDeviceInstance
	 * @generated
	 */
	EClass getProgrammableLogicDeviceInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance <em>Processor Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance
	 * @generated
	 */
	EClass getProcessorInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance#getMIPS <em>MIPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MIPS</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance#getMIPS()
	 * @see #getProcessorInstance()
	 * @generated
	 */
	EAttribute getProcessorInstance_MIPS();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance#getCPI <em>CPI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPI</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance#getCPI()
	 * @see #getProcessorInstance()
	 * @generated
	 */
	EAttribute getProcessorInstance_CPI();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance#getOwnedCacheInstance <em>Owned Cache Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Cache Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance#getOwnedCacheInstance()
	 * @see #getProcessorInstance()
	 * @generated
	 */
	EReference getProcessorInstance_OwnedCacheInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance <em>Atomic Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Resource Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance
	 * @generated
	 */
	EClass getAtomicResourceInstance();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance#getParentStructuredResourceInstance <em>Parent Structured Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structured Resource Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance#getParentStructuredResourceInstance()
	 * @see #getAtomicResourceInstance()
	 * @generated
	 */
	EReference getAtomicResourceInstance_ParentStructuredResourceInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance <em>Structured Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Resource Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance
	 * @generated
	 */
	EClass getStructuredResourceInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance#getEmbeddedAtomicResourceInstances <em>Embedded Atomic Resource Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Atomic Resource Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance#getEmbeddedAtomicResourceInstances()
	 * @see #getStructuredResourceInstance()
	 * @generated
	 */
	EReference getStructuredResourceInstance_EmbeddedAtomicResourceInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource <em>Communication Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Resource</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource
	 * @generated
	 */
	EClass getCommunicationResource();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Bus#getConnectedBusPortInstances <em>Connected Bus Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Bus Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.Bus#getConnectedBusPortInstances()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_ConnectedBusPortInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Link#getConnectedLinkPortInstances <em>Connected Link Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Link Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.Link#getConnectedLinkPortInstances()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_ConnectedLinkPortInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia <em>Communication Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Media</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia
	 * @generated
	 */
	EClass getCommunicationMedia();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getDataFrameSize <em>Data Frame Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Frame Size</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getDataFrameSize()
	 * @see #getCommunicationMedia()
	 * @generated
	 */
	EReference getCommunicationMedia_DataFrameSize();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#isIsSerial <em>Is Serial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Serial</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#isIsSerial()
	 * @see #getCommunicationMedia()
	 * @generated
	 */
	EAttribute getCommunicationMedia_IsSerial();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bandwidth</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getBandwidth()
	 * @see #getCommunicationMedia()
	 * @generated
	 */
	EReference getCommunicationMedia_Bandwidth();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getProtocol()
	 * @see #getCommunicationMedia()
	 * @generated
	 */
	EReference getCommunicationMedia_Protocol();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getConnectedHWPortParts <em>Connected HW Port Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected HW Port Parts</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getConnectedHWPortParts()
	 * @see #getCommunicationMedia()
	 * @generated
	 */
	EReference getCommunicationMedia_ConnectedHWPortParts();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getConnectedBridges <em>Connected Bridges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Bridges</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getConnectedBridges()
	 * @see #getCommunicationMedia()
	 * @generated
	 */
	EReference getCommunicationMedia_ConnectedBridges();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getConnectedHWPortInstances <em>Connected HW Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected HW Port Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getConnectedHWPortInstances()
	 * @see #getCommunicationMedia()
	 * @generated
	 */
	EReference getCommunicationMedia_ConnectedHWPortInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform <em>HW Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Platform</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform
	 * @generated
	 */
	EClass getHWPlatform();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform#getEmbeddedPlatformParts <em>Embedded Platform Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Platform Parts</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform#getEmbeddedPlatformParts()
	 * @see #getHWPlatform()
	 * @generated
	 */
	EReference getHWPlatform_EmbeddedPlatformParts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform#getEmbeddedCommunicationResources <em>Embedded Communication Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Communication Resources</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform#getEmbeddedCommunicationResources()
	 * @see #getHWPlatform()
	 * @generated
	 */
	EReference getHWPlatform_EmbeddedCommunicationResources();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform#getDelegationPorts <em>Delegation Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegation Ports</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform#getDelegationPorts()
	 * @see #getHWPlatform()
	 * @generated
	 */
	EReference getHWPlatform_DelegationPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform#getDelegations <em>Delegations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegations</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform#getDelegations()
	 * @see #getHWPlatform()
	 * @generated
	 */
	EReference getHWPlatform_Delegations();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart
	 * @generated
	 */
	EClass getPlatformPart();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart#getParentHWPlatform <em>Parent HW Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent HW Platform</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart#getParentHWPlatform()
	 * @see #getPlatformPart()
	 * @generated
	 */
	EReference getPlatformPart_ParentHWPlatform();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart#getCardinality()
	 * @see #getPlatformPart()
	 * @generated
	 */
	EReference getPlatformPart_Cardinality();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart <em>HW Platform Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Platform Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart
	 * @generated
	 */
	EClass getHWPlatformPart();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart#getHwplatformType <em>Hwplatform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hwplatform Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart#getHwplatformType()
	 * @see #getHWPlatformPart()
	 * @generated
	 */
	EReference getHWPlatformPart_HwplatformType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart#getDerivedBridges <em>Derived Bridges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derived Bridges</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart#getDerivedBridges()
	 * @see #getHWPlatformPart()
	 * @generated
	 */
	EReference getHWPlatformPart_DerivedBridges();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart#getDelegationPorts <em>Delegation Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegation Ports</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart#getDelegationPorts()
	 * @see #getHWPlatformPart()
	 * @generated
	 */
	EReference getHWPlatformPart_DelegationPorts();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.SensorInstance <em>Sensor Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.SensorInstance
	 * @generated
	 */
	EClass getSensorInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ActuatorInstance <em>Actuator Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ActuatorInstance
	 * @generated
	 */
	EClass getActuatorInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Bridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bridge</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.Bridge
	 * @generated
	 */
	EClass getBridge();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Bridge#getConnectedCommunicationMedia <em>Connected Communication Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Communication Media</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.Bridge#getConnectedCommunicationMedia()
	 * @see #getBridge()
	 * @generated
	 */
	EReference getBridge_ConnectedCommunicationMedia();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Bridge#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delay</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.Bridge#getDelay()
	 * @see #getBridge()
	 * @generated
	 */
	EReference getBridge_Delay();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance <em>HW Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance
	 * @generated
	 */
	EClass getHWPortInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getHwportType <em>Hwport Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hwport Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getHwportType()
	 * @see #getHWPortInstance()
	 * @generated
	 */
	EReference getHWPortInstance_HwportType();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getParentResourceInstance <em>Parent Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Resource Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getParentResourceInstance()
	 * @see #getHWPortInstance()
	 * @generated
	 */
	EReference getHWPortInstance_ParentResourceInstance();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getQueuingTime <em>Queuing Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Queuing Time</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getQueuingTime()
	 * @see #getHWPortInstance()
	 * @generated
	 */
	EReference getHWPortInstance_QueuingTime();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getProtocol()
	 * @see #getHWPortInstance()
	 * @generated
	 */
	EReference getHWPortInstance_Protocol();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getConnectedMedia <em>Connected Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Media</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getConnectedMedia()
	 * @see #getHWPortInstance()
	 * @generated
	 */
	EReference getHWPortInstance_ConnectedMedia();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getPayloadDataSize <em>Payload Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payload Data Size</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getPayloadDataSize()
	 * @see #getHWPortInstance()
	 * @generated
	 */
	EReference getHWPortInstance_PayloadDataSize();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#isIsDelegationPort <em>Is Delegation Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Delegation Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#isIsDelegationPort()
	 * @see #getHWPortInstance()
	 * @generated
	 */
	EAttribute getHWPortInstance_IsDelegationPort();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getDelegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegation</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getDelegation()
	 * @see #getHWPortInstance()
	 * @generated
	 */
	EReference getHWPortInstance_Delegation();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance <em>Bus Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance
	 * @generated
	 */
	EClass getBusPortInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance#getConnectedBus <em>Connected Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Bus</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance#getConnectedBus()
	 * @see #getBusPortInstance()
	 * @generated
	 */
	EReference getBusPortInstance_ConnectedBus();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance <em>Link Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance
	 * @generated
	 */
	EClass getLinkPortInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance#getConnectedLink <em>Connected Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Link</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance#getConnectedLink()
	 * @see #getLinkPortInstance()
	 * @generated
	 */
	EReference getLinkPortInstance_ConnectedLink();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository <em>Resource Instance Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Instance Repository</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository
	 * @generated
	 */
	EClass getResourceInstanceRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository#getResourceInstances <em>Resource Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository#getResourceInstances()
	 * @see #getResourceInstanceRepository()
	 * @generated
	 */
	EReference getResourceInstanceRepository_ResourceInstances();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart <em>Resource Instance Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Instance Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart
	 * @generated
	 */
	EClass getResourceInstancePart();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart#getResourceInstanceType <em>Resource Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Instance Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart#getResourceInstanceType()
	 * @see #getResourceInstancePart()
	 * @generated
	 */
	EReference getResourceInstancePart_ResourceInstanceType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart#getHwportParts <em>Hwport Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hwport Parts</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart#getHwportParts()
	 * @see #getResourceInstancePart()
	 * @generated
	 */
	EReference getResourceInstancePart_HwportParts();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Delegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.Delegation
	 * @generated
	 */
	EClass getDelegation();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Delegation#getHwPortInstance <em>Hw Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hw Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.Delegation#getHwPortInstance()
	 * @see #getDelegation()
	 * @generated
	 */
	EReference getDelegation_HwPortInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Delegation#getHwPortPart <em>Hw Port Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hw Port Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.Delegation#getHwPortPart()
	 * @see #getDelegation()
	 * @generated
	 */
	EReference getDelegation_HwPortPart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart <em>HW Port Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Port Part</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart
	 * @generated
	 */
	EClass getHWPortPart();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart#getHwPortInstance <em>Hw Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hw Port Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart#getHwPortInstance()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EReference getHWPortPart_HwPortInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart#getConnectedMedia <em>Connected Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Media</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart#getConnectedMedia()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EReference getHWPortPart_ConnectedMedia();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart#getProtocol()
	 * @see #getHWPortPart()
	 * @generated
	 */
	EReference getHWPortPart_Protocol();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlatformFactory getPlatformFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformConfigurationImpl <em>HW Platform Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformConfigurationImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getHWPlatformConfiguration()
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
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_CONFIGURATION__REPOSITORIES = eINSTANCE.getHWPlatformConfiguration_Repositories();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.ResourceInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getResourceInstance()
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
		 * The meta object literal for the '<em><b>Hwport Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INSTANCE__HWPORT_INSTANCES = eINSTANCE.getResourceInstance_HwportInstances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ComputingResourceInstanceImpl <em>Computing Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.ComputingResourceInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getComputingResourceInstance()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.MemoryResourceInstanceImpl <em>Memory Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.MemoryResourceInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getMemoryResourceInstance()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.DeviceInstanceImpl <em>Device Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.DeviceInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getDeviceInstance()
		 * @generated
		 */
		EClass DEVICE_INSTANCE = eINSTANCE.getDeviceInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.StorageMemoryInstanceImpl <em>Storage Memory Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.StorageMemoryInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getStorageMemoryInstance()
		 * @generated
		 */
		EClass STORAGE_MEMORY_INSTANCE = eINSTANCE.getStorageMemoryInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ProcessingMemoryInstanceImpl <em>Processing Memory Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.ProcessingMemoryInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getProcessingMemoryInstance()
		 * @generated
		 */
		EClass PROCESSING_MEMORY_INSTANCE = eINSTANCE.getProcessingMemoryInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.CacheInstanceImpl <em>Cache Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.CacheInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getCacheInstance()
		 * @generated
		 */
		EClass CACHE_INSTANCE = eINSTANCE.getCacheInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ProgrammableLogicDeviceInstanceImpl <em>Programmable Logic Device Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.ProgrammableLogicDeviceInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getProgrammableLogicDeviceInstance()
		 * @generated
		 */
		EClass PROGRAMMABLE_LOGIC_DEVICE_INSTANCE = eINSTANCE.getProgrammableLogicDeviceInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ProcessorInstanceImpl <em>Processor Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.ProcessorInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getProcessorInstance()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.AtomicResourceInstanceImpl <em>Atomic Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.AtomicResourceInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getAtomicResourceInstance()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.StructuredResourceInstanceImpl <em>Structured Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.StructuredResourceInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getStructuredResourceInstance()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.CommunicationResourceImpl <em>Communication Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.CommunicationResourceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getCommunicationResource()
		 * @generated
		 */
		EClass COMMUNICATION_RESOURCE = eINSTANCE.getCommunicationResource();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.BusImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '<em><b>Connected Bus Port Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__CONNECTED_BUS_PORT_INSTANCES = eINSTANCE.getBus_ConnectedBusPortInstances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.LinkImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Connected Link Port Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__CONNECTED_LINK_PORT_INSTANCES = eINSTANCE.getLink_ConnectedLinkPortInstances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.CommunicationMediaImpl <em>Communication Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.CommunicationMediaImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getCommunicationMedia()
		 * @generated
		 */
		EClass COMMUNICATION_MEDIA = eINSTANCE.getCommunicationMedia();

		/**
		 * The meta object literal for the '<em><b>Data Frame Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEDIA__DATA_FRAME_SIZE = eINSTANCE.getCommunicationMedia_DataFrameSize();

		/**
		 * The meta object literal for the '<em><b>Is Serial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_MEDIA__IS_SERIAL = eINSTANCE.getCommunicationMedia_IsSerial();

		/**
		 * The meta object literal for the '<em><b>Bandwidth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEDIA__BANDWIDTH = eINSTANCE.getCommunicationMedia_Bandwidth();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEDIA__PROTOCOL = eINSTANCE.getCommunicationMedia_Protocol();

		/**
		 * The meta object literal for the '<em><b>Connected HW Port Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEDIA__CONNECTED_HW_PORT_PARTS = eINSTANCE.getCommunicationMedia_ConnectedHWPortParts();

		/**
		 * The meta object literal for the '<em><b>Connected Bridges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEDIA__CONNECTED_BRIDGES = eINSTANCE.getCommunicationMedia_ConnectedBridges();

		/**
		 * The meta object literal for the '<em><b>Connected HW Port Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEDIA__CONNECTED_HW_PORT_INSTANCES = eINSTANCE.getCommunicationMedia_ConnectedHWPortInstances();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformImpl <em>HW Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getHWPlatform()
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
		 * The meta object literal for the '<em><b>Embedded Communication Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM__EMBEDDED_COMMUNICATION_RESOURCES = eINSTANCE.getHWPlatform_EmbeddedCommunicationResources();

		/**
		 * The meta object literal for the '<em><b>Delegation Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM__DELEGATION_PORTS = eINSTANCE.getHWPlatform_DelegationPorts();

		/**
		 * The meta object literal for the '<em><b>Delegations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM__DELEGATIONS = eINSTANCE.getHWPlatform_Delegations();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPartImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getPlatformPart()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformPartImpl <em>HW Platform Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformPartImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getHWPlatformPart()
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
		 * The meta object literal for the '<em><b>Derived Bridges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_PART__DERIVED_BRIDGES = eINSTANCE.getHWPlatformPart_DerivedBridges();

		/**
		 * The meta object literal for the '<em><b>Delegation Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLATFORM_PART__DELEGATION_PORTS = eINSTANCE.getHWPlatformPart_DelegationPorts();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.SensorInstanceImpl <em>Sensor Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.SensorInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getSensorInstance()
		 * @generated
		 */
		EClass SENSOR_INSTANCE = eINSTANCE.getSensorInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ActuatorInstanceImpl <em>Actuator Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.ActuatorInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getActuatorInstance()
		 * @generated
		 */
		EClass ACTUATOR_INSTANCE = eINSTANCE.getActuatorInstance();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.BridgeImpl <em>Bridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.BridgeImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getBridge()
		 * @generated
		 */
		EClass BRIDGE = eINSTANCE.getBridge();

		/**
		 * The meta object literal for the '<em><b>Connected Communication Media</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRIDGE__CONNECTED_COMMUNICATION_MEDIA = eINSTANCE.getBridge_ConnectedCommunicationMedia();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRIDGE__DELAY = eINSTANCE.getBridge_Delay();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortInstanceImpl <em>HW Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getHWPortInstance()
		 * @generated
		 */
		EClass HW_PORT_INSTANCE = eINSTANCE.getHWPortInstance();

		/**
		 * The meta object literal for the '<em><b>Hwport Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_INSTANCE__HWPORT_TYPE = eINSTANCE.getHWPortInstance_HwportType();

		/**
		 * The meta object literal for the '<em><b>Parent Resource Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE = eINSTANCE.getHWPortInstance_ParentResourceInstance();

		/**
		 * The meta object literal for the '<em><b>Queuing Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_INSTANCE__QUEUING_TIME = eINSTANCE.getHWPortInstance_QueuingTime();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_INSTANCE__PROTOCOL = eINSTANCE.getHWPortInstance_Protocol();

		/**
		 * The meta object literal for the '<em><b>Connected Media</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_INSTANCE__CONNECTED_MEDIA = eINSTANCE.getHWPortInstance_ConnectedMedia();

		/**
		 * The meta object literal for the '<em><b>Payload Data Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_INSTANCE__PAYLOAD_DATA_SIZE = eINSTANCE.getHWPortInstance_PayloadDataSize();

		/**
		 * The meta object literal for the '<em><b>Is Delegation Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_PORT_INSTANCE__IS_DELEGATION_PORT = eINSTANCE.getHWPortInstance_IsDelegationPort();

		/**
		 * The meta object literal for the '<em><b>Delegation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_INSTANCE__DELEGATION = eINSTANCE.getHWPortInstance_Delegation();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.BusPortInstanceImpl <em>Bus Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.BusPortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getBusPortInstance()
		 * @generated
		 */
		EClass BUS_PORT_INSTANCE = eINSTANCE.getBusPortInstance();

		/**
		 * The meta object literal for the '<em><b>Connected Bus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_PORT_INSTANCE__CONNECTED_BUS = eINSTANCE.getBusPortInstance_ConnectedBus();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.LinkPortInstanceImpl <em>Link Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.LinkPortInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getLinkPortInstance()
		 * @generated
		 */
		EClass LINK_PORT_INSTANCE = eINSTANCE.getLinkPortInstance();

		/**
		 * The meta object literal for the '<em><b>Connected Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_PORT_INSTANCE__CONNECTED_LINK = eINSTANCE.getLinkPortInstance_ConnectedLink();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ResourceInstanceRepositoryImpl <em>Resource Instance Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.ResourceInstanceRepositoryImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getResourceInstanceRepository()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.ResourceInstancePartImpl <em>Resource Instance Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.ResourceInstancePartImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getResourceInstancePart()
		 * @generated
		 */
		EClass RESOURCE_INSTANCE_PART = eINSTANCE.getResourceInstancePart();

		/**
		 * The meta object literal for the '<em><b>Resource Instance Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INSTANCE_PART__RESOURCE_INSTANCE_TYPE = eINSTANCE.getResourceInstancePart_ResourceInstanceType();

		/**
		 * The meta object literal for the '<em><b>Hwport Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INSTANCE_PART__HWPORT_PARTS = eINSTANCE.getResourceInstancePart_HwportParts();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.DelegationImpl <em>Delegation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.DelegationImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getDelegation()
		 * @generated
		 */
		EClass DELEGATION = eINSTANCE.getDelegation();

		/**
		 * The meta object literal for the '<em><b>Hw Port Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION__HW_PORT_INSTANCE = eINSTANCE.getDelegation_HwPortInstance();

		/**
		 * The meta object literal for the '<em><b>Hw Port Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION__HW_PORT_PART = eINSTANCE.getDelegation_HwPortPart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortPartImpl <em>HW Port Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPortPartImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl#getHWPortPart()
		 * @generated
		 */
		EClass HW_PORT_PART = eINSTANCE.getHWPortPart();

		/**
		 * The meta object literal for the '<em><b>Hw Port Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_PART__HW_PORT_INSTANCE = eINSTANCE.getHWPortPart_HwPortInstance();

		/**
		 * The meta object literal for the '<em><b>Connected Media</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_PART__CONNECTED_MEDIA = eINSTANCE.getHWPortPart_ConnectedMedia();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT_PART__PROTOCOL = eINSTANCE.getHWPortPart_Protocol();

	}

} //PlatformPackage
