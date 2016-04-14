/**
 */
package org.muml.pm.hardware.hwresource;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.muml.pm.hardware.hwresource.HwresourceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface HwresourcePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hwresource";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/pm/hardware/hwresource/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hwresource";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwresourcePackage eINSTANCE = org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.impl.ResourceImpl
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Communication Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__COMMUNICATION_RESOURCES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.impl.AtomicResourceImpl <em>Atomic Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.impl.AtomicResourceImpl
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getAtomicResource()
	 * @generated
	 */
	int ATOMIC_RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE__ANNOTATIONS = RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE__EXTENSIONS = RESOURCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Communication Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE__COMMUNICATION_RESOURCES = RESOURCE__COMMUNICATION_RESOURCES;

	/**
	 * The feature id for the '<em><b>Parent Structured Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE___GET_EXTENSION__ECLASS = RESOURCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Atomic Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.impl.ComputingResourceImpl <em>Computing Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.impl.ComputingResourceImpl
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getComputingResource()
	 * @generated
	 */
	int COMPUTING_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__ANNOTATIONS = ATOMIC_RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__EXTENSIONS = ATOMIC_RESOURCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__NAME = ATOMIC_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Communication Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__COMMUNICATION_RESOURCES = ATOMIC_RESOURCE__COMMUNICATION_RESOURCES;

	/**
	 * The feature id for the '<em><b>Parent Structured Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__PARENT_STRUCTURED_RESOURCE = ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE;

	/**
	 * The number of structural features of the '<em>Computing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_FEATURE_COUNT = ATOMIC_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE___GET_EXTENSION__ECLASS = ATOMIC_RESOURCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Computing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_OPERATION_COUNT = ATOMIC_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.impl.MemoryResourceImpl <em>Memory Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.impl.MemoryResourceImpl
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getMemoryResource()
	 * @generated
	 */
	int MEMORY_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__ANNOTATIONS = ATOMIC_RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__EXTENSIONS = ATOMIC_RESOURCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__NAME = ATOMIC_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Communication Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__COMMUNICATION_RESOURCES = ATOMIC_RESOURCE__COMMUNICATION_RESOURCES;

	/**
	 * The feature id for the '<em><b>Parent Structured Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__PARENT_STRUCTURED_RESOURCE = ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Memory Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__MEMORY_ACCESS = ATOMIC_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__IS_VOLATILE = ATOMIC_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Memory Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__MEMORY_TYPE = ATOMIC_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Memory Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_FEATURE_COUNT = ATOMIC_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE___GET_EXTENSION__ECLASS = ATOMIC_RESOURCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Memory Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE_OPERATION_COUNT = ATOMIC_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.impl.DeviceImpl
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ANNOTATIONS = RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__EXTENSIONS = RESOURCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Communication Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__COMMUNICATION_RESOURCES = RESOURCE__COMMUNICATION_RESOURCES;

	/**
	 * The feature id for the '<em><b>Device Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEVICE_KIND = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_EXTENSION__ECLASS = RESOURCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.impl.CacheImpl <em>Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.impl.CacheImpl
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getCache()
	 * @generated
	 */
	int CACHE = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__ANNOTATIONS = MEMORY_RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__EXTENSIONS = MEMORY_RESOURCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__NAME = MEMORY_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Communication Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__COMMUNICATION_RESOURCES = MEMORY_RESOURCE__COMMUNICATION_RESOURCES;

	/**
	 * The feature id for the '<em><b>Parent Structured Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__PARENT_STRUCTURED_RESOURCE = MEMORY_RESOURCE__PARENT_STRUCTURED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Memory Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__MEMORY_ACCESS = MEMORY_RESOURCE__MEMORY_ACCESS;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__IS_VOLATILE = MEMORY_RESOURCE__IS_VOLATILE;

	/**
	 * The feature id for the '<em><b>Memory Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__MEMORY_TYPE = MEMORY_RESOURCE__MEMORY_TYPE;

	/**
	 * The feature id for the '<em><b>Write Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__WRITE_POLICY = MEMORY_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Replacement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__REPLACEMENT_POLICY = MEMORY_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nb Sets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__NB_SETS = MEMORY_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Associativity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__ASSOCIATIVITY = MEMORY_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Used By Processor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__USED_BY_PROCESSOR = MEMORY_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_FEATURE_COUNT = MEMORY_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE___GET_EXTENSION__ECLASS = MEMORY_RESOURCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_OPERATION_COUNT = MEMORY_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.impl.ProgrammableLogicDeviceImpl <em>Programmable Logic Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.impl.ProgrammableLogicDeviceImpl
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getProgrammableLogicDevice()
	 * @generated
	 */
	int PROGRAMMABLE_LOGIC_DEVICE = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE__ANNOTATIONS = COMPUTING_RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE__EXTENSIONS = COMPUTING_RESOURCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE__NAME = COMPUTING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Communication Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE__COMMUNICATION_RESOURCES = COMPUTING_RESOURCE__COMMUNICATION_RESOURCES;

	/**
	 * The feature id for the '<em><b>Parent Structured Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE__PARENT_STRUCTURED_RESOURCE = COMPUTING_RESOURCE__PARENT_STRUCTURED_RESOURCE;

	/**
	 * The number of structural features of the '<em>Programmable Logic Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_FEATURE_COUNT = COMPUTING_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE___GET_EXTENSION__ECLASS = COMPUTING_RESOURCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Programmable Logic Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE_OPERATION_COUNT = COMPUTING_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.impl.ProcessorImpl
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__ANNOTATIONS = COMPUTING_RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__EXTENSIONS = COMPUTING_RESOURCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = COMPUTING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Communication Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__COMMUNICATION_RESOURCES = COMPUTING_RESOURCE__COMMUNICATION_RESOURCES;

	/**
	 * The feature id for the '<em><b>Parent Structured Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PARENT_STRUCTURED_RESOURCE = COMPUTING_RESOURCE__PARENT_STRUCTURED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Owned Cache</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__OWNED_CACHE = COMPUTING_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__ARCHITECTURE = COMPUTING_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nb Cores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NB_CORES = COMPUTING_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__FAMILY = COMPUTING_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nb Pipeline Stages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NB_PIPELINE_STAGES = COMPUTING_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = COMPUTING_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR___GET_EXTENSION__ECLASS = COMPUTING_RESOURCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = COMPUTING_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.impl.StructuredResourceImpl <em>Structured Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.impl.StructuredResourceImpl
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getStructuredResource()
	 * @generated
	 */
	int STRUCTURED_RESOURCE = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE__ANNOTATIONS = RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE__EXTENSIONS = RESOURCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Communication Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE__COMMUNICATION_RESOURCES = RESOURCE__COMMUNICATION_RESOURCES;

	/**
	 * The feature id for the '<em><b>Embedded Atomic Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structured Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE___GET_EXTENSION__ECLASS = RESOURCE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Structured Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.impl.ResourceRepositoryImpl <em>Resource Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.impl.ResourceRepositoryImpl
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getResourceRepository()
	 * @generated
	 */
	int RESOURCE_REPOSITORY = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPOSITORY__ANNOTATIONS = CorePackage.COMMENTABLE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPOSITORY__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPOSITORY__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPOSITORY__RESOURCES = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPOSITORY__PROTOCOLS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPOSITORY_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPOSITORY___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Resource Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPOSITORY_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.impl.CommunicationProtocolRepositoryImpl <em>Communication Protocol Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.impl.CommunicationProtocolRepositoryImpl
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getCommunicationProtocolRepository()
	 * @generated
	 */
	int COMMUNICATION_PROTOCOL_REPOSITORY = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL_REPOSITORY__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL_REPOSITORY__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL_REPOSITORY__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Communication Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL_REPOSITORY__COMMUNICATION_PROTOCOLS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Communication Protocol Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL_REPOSITORY_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL_REPOSITORY___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Communication Protocol Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL_REPOSITORY_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.impl.CommunicationProtocolImpl <em>Communication Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.impl.CommunicationProtocolImpl
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getCommunicationProtocol()
	 * @generated
	 */
	int COMMUNICATION_PROTOCOL = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Time Triggered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__IS_TIME_TRIGGERED = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Event Triggered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__IS_EVENT_TRIGGERED = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Further Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__FURTHER_INFORMATION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Networking Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__IS_NETWORKING_PROTOCOL = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Frame Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__DATA_FRAME_SIZE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__BANDWIDTH = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__IS_SERIAL = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Communication Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Communication Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.impl.BusProtocolImpl <em>Bus Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.impl.BusProtocolImpl
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getBusProtocol()
	 * @generated
	 */
	int BUS_PROTOCOL = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PROTOCOL__ANNOTATIONS = COMMUNICATION_PROTOCOL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PROTOCOL__EXTENSIONS = COMMUNICATION_PROTOCOL__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PROTOCOL__NAME = COMMUNICATION_PROTOCOL__NAME;

	/**
	 * The feature id for the '<em><b>Is Time Triggered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PROTOCOL__IS_TIME_TRIGGERED = COMMUNICATION_PROTOCOL__IS_TIME_TRIGGERED;

	/**
	 * The feature id for the '<em><b>Is Event Triggered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PROTOCOL__IS_EVENT_TRIGGERED = COMMUNICATION_PROTOCOL__IS_EVENT_TRIGGERED;

	/**
	 * The feature id for the '<em><b>Further Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PROTOCOL__FURTHER_INFORMATION = COMMUNICATION_PROTOCOL__FURTHER_INFORMATION;

	/**
	 * The feature id for the '<em><b>Is Networking Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PROTOCOL__IS_NETWORKING_PROTOCOL = COMMUNICATION_PROTOCOL__IS_NETWORKING_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Data Frame Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PROTOCOL__DATA_FRAME_SIZE = COMMUNICATION_PROTOCOL__DATA_FRAME_SIZE;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PROTOCOL__BANDWIDTH = COMMUNICATION_PROTOCOL__BANDWIDTH;

	/**
	 * The feature id for the '<em><b>Is Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PROTOCOL__IS_SERIAL = COMMUNICATION_PROTOCOL__IS_SERIAL;

	/**
	 * The feature id for the '<em><b>Bus Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PROTOCOL__BUS_PROTOCOL = COMMUNICATION_PROTOCOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bus Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PROTOCOL_FEATURE_COUNT = COMMUNICATION_PROTOCOL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PROTOCOL___GET_EXTENSION__ECLASS = COMMUNICATION_PROTOCOL___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PROTOCOL___TO_STRING = COMMUNICATION_PROTOCOL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bus Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PROTOCOL_OPERATION_COUNT = COMMUNICATION_PROTOCOL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.impl.LinkProtocolImpl <em>Link Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.impl.LinkProtocolImpl
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getLinkProtocol()
	 * @generated
	 */
	int LINK_PROTOCOL = 13;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROTOCOL__ANNOTATIONS = COMMUNICATION_PROTOCOL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROTOCOL__EXTENSIONS = COMMUNICATION_PROTOCOL__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROTOCOL__NAME = COMMUNICATION_PROTOCOL__NAME;

	/**
	 * The feature id for the '<em><b>Is Time Triggered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROTOCOL__IS_TIME_TRIGGERED = COMMUNICATION_PROTOCOL__IS_TIME_TRIGGERED;

	/**
	 * The feature id for the '<em><b>Is Event Triggered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROTOCOL__IS_EVENT_TRIGGERED = COMMUNICATION_PROTOCOL__IS_EVENT_TRIGGERED;

	/**
	 * The feature id for the '<em><b>Further Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROTOCOL__FURTHER_INFORMATION = COMMUNICATION_PROTOCOL__FURTHER_INFORMATION;

	/**
	 * The feature id for the '<em><b>Is Networking Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROTOCOL__IS_NETWORKING_PROTOCOL = COMMUNICATION_PROTOCOL__IS_NETWORKING_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Data Frame Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROTOCOL__DATA_FRAME_SIZE = COMMUNICATION_PROTOCOL__DATA_FRAME_SIZE;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROTOCOL__BANDWIDTH = COMMUNICATION_PROTOCOL__BANDWIDTH;

	/**
	 * The feature id for the '<em><b>Is Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROTOCOL__IS_SERIAL = COMMUNICATION_PROTOCOL__IS_SERIAL;

	/**
	 * The feature id for the '<em><b>Link Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROTOCOL__LINK_PROTOCOL = COMMUNICATION_PROTOCOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROTOCOL_FEATURE_COUNT = COMMUNICATION_PROTOCOL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROTOCOL___GET_EXTENSION__ECLASS = COMMUNICATION_PROTOCOL___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROTOCOL___TO_STRING = COMMUNICATION_PROTOCOL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROTOCOL_OPERATION_COUNT = COMMUNICATION_PROTOCOL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.impl.CommunicationResourceImpl <em>Communication Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.impl.CommunicationResourceImpl
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getCommunicationResource()
	 * @generated
	 */
	int COMMUNICATION_RESOURCE = 14;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Port Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__PORT_KIND = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__PROTOCOL = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__CARDINALITY = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multi HW Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__MULTI_HW_PORT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE__PARENT_RESOURCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Communication Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Communication Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_RESOURCE_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.DeviceKind <em>Device Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.DeviceKind
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getDeviceKind()
	 * @generated
	 */
	int DEVICE_KIND = 15;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.ProcessorArchitecture <em>Processor Architecture</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.ProcessorArchitecture
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getProcessorArchitecture()
	 * @generated
	 */
	int PROCESSOR_ARCHITECTURE = 16;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.MemoryAccessKind <em>Memory Access Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.MemoryAccessKind
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getMemoryAccessKind()
	 * @generated
	 */
	int MEMORY_ACCESS_KIND = 17;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.MemoryKind <em>Memory Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.MemoryKind
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getMemoryKind()
	 * @generated
	 */
	int MEMORY_KIND = 18;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.ReplacementPolicy <em>Replacement Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.ReplacementPolicy
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getReplacementPolicy()
	 * @generated
	 */
	int REPLACEMENT_POLICY = 19;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.WritePolicy <em>Write Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.WritePolicy
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getWritePolicy()
	 * @generated
	 */
	int WRITE_POLICY = 20;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.CommunicationKind <em>Communication Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.CommunicationKind
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getCommunicationKind()
	 * @generated
	 */
	int COMMUNICATION_KIND = 21;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.BusProtocolKind <em>Bus Protocol Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.BusProtocolKind
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getBusProtocolKind()
	 * @generated
	 */
	int BUS_PROTOCOL_KIND = 22;

	/**
	 * The meta object id for the '{@link org.muml.pm.hardware.hwresource.LinkProtocolKind <em>Link Protocol Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwresource.LinkProtocolKind
	 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getLinkProtocolKind()
	 * @generated
	 */
	int LINK_PROTOCOL_KIND = 23;


	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresource.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.muml.pm.hardware.hwresource.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwresource.Resource#getCommunicationResources <em>Communication Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Resources</em>'.
	 * @see org.muml.pm.hardware.hwresource.Resource#getCommunicationResources()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_CommunicationResources();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresource.ComputingResource <em>Computing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Resource</em>'.
	 * @see org.muml.pm.hardware.hwresource.ComputingResource
	 * @generated
	 */
	EClass getComputingResource();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresource.MemoryResource <em>Memory Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Resource</em>'.
	 * @see org.muml.pm.hardware.hwresource.MemoryResource
	 * @generated
	 */
	EClass getMemoryResource();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.MemoryResource#getMemoryAccess <em>Memory Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Access</em>'.
	 * @see org.muml.pm.hardware.hwresource.MemoryResource#getMemoryAccess()
	 * @see #getMemoryResource()
	 * @generated
	 */
	EAttribute getMemoryResource_MemoryAccess();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.MemoryResource#isIsVolatile <em>Is Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Volatile</em>'.
	 * @see org.muml.pm.hardware.hwresource.MemoryResource#isIsVolatile()
	 * @see #getMemoryResource()
	 * @generated
	 */
	EAttribute getMemoryResource_IsVolatile();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.MemoryResource#getMemoryType <em>Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Type</em>'.
	 * @see org.muml.pm.hardware.hwresource.MemoryResource#getMemoryType()
	 * @see #getMemoryResource()
	 * @generated
	 */
	EAttribute getMemoryResource_MemoryType();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresource.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see org.muml.pm.hardware.hwresource.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.Device#getDeviceKind <em>Device Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Kind</em>'.
	 * @see org.muml.pm.hardware.hwresource.Device#getDeviceKind()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_DeviceKind();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresource.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache</em>'.
	 * @see org.muml.pm.hardware.hwresource.Cache
	 * @generated
	 */
	EClass getCache();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.Cache#getWritePolicy <em>Write Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Policy</em>'.
	 * @see org.muml.pm.hardware.hwresource.Cache#getWritePolicy()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_WritePolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.Cache#getReplacementPolicy <em>Replacement Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replacement Policy</em>'.
	 * @see org.muml.pm.hardware.hwresource.Cache#getReplacementPolicy()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_ReplacementPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.Cache#getNbSets <em>Nb Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Sets</em>'.
	 * @see org.muml.pm.hardware.hwresource.Cache#getNbSets()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_NbSets();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.Cache#getAssociativity <em>Associativity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associativity</em>'.
	 * @see org.muml.pm.hardware.hwresource.Cache#getAssociativity()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Associativity();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pm.hardware.hwresource.Cache#getUsedByProcessor <em>Used By Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used By Processor</em>'.
	 * @see org.muml.pm.hardware.hwresource.Cache#getUsedByProcessor()
	 * @see #getCache()
	 * @generated
	 */
	EReference getCache_UsedByProcessor();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresource.ProgrammableLogicDevice <em>Programmable Logic Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programmable Logic Device</em>'.
	 * @see org.muml.pm.hardware.hwresource.ProgrammableLogicDevice
	 * @generated
	 */
	EClass getProgrammableLogicDevice();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresource.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see org.muml.pm.hardware.hwresource.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.hardware.hwresource.Processor#getOwnedCache <em>Owned Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Cache</em>'.
	 * @see org.muml.pm.hardware.hwresource.Processor#getOwnedCache()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_OwnedCache();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.Processor#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see org.muml.pm.hardware.hwresource.Processor#getArchitecture()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Architecture();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwresource.Processor#getNbCores <em>Nb Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb Cores</em>'.
	 * @see org.muml.pm.hardware.hwresource.Processor#getNbCores()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_NbCores();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.Processor#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see org.muml.pm.hardware.hwresource.Processor#getFamily()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Family();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwresource.Processor#getNbPipelineStages <em>Nb Pipeline Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb Pipeline Stages</em>'.
	 * @see org.muml.pm.hardware.hwresource.Processor#getNbPipelineStages()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_NbPipelineStages();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresource.AtomicResource <em>Atomic Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Resource</em>'.
	 * @see org.muml.pm.hardware.hwresource.AtomicResource
	 * @generated
	 */
	EClass getAtomicResource();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pm.hardware.hwresource.AtomicResource#getParentStructuredResource <em>Parent Structured Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structured Resource</em>'.
	 * @see org.muml.pm.hardware.hwresource.AtomicResource#getParentStructuredResource()
	 * @see #getAtomicResource()
	 * @generated
	 */
	EReference getAtomicResource_ParentStructuredResource();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresource.StructuredResource <em>Structured Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Resource</em>'.
	 * @see org.muml.pm.hardware.hwresource.StructuredResource
	 * @generated
	 */
	EClass getStructuredResource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwresource.StructuredResource#getEmbeddedAtomicResources <em>Embedded Atomic Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Atomic Resources</em>'.
	 * @see org.muml.pm.hardware.hwresource.StructuredResource#getEmbeddedAtomicResources()
	 * @see #getStructuredResource()
	 * @generated
	 */
	EReference getStructuredResource_EmbeddedAtomicResources();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresource.ResourceRepository <em>Resource Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Repository</em>'.
	 * @see org.muml.pm.hardware.hwresource.ResourceRepository
	 * @generated
	 */
	EClass getResourceRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwresource.ResourceRepository#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.muml.pm.hardware.hwresource.ResourceRepository#getResources()
	 * @see #getResourceRepository()
	 * @generated
	 */
	EReference getResourceRepository_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwresource.ResourceRepository#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see org.muml.pm.hardware.hwresource.ResourceRepository#getProtocols()
	 * @see #getResourceRepository()
	 * @generated
	 */
	EReference getResourceRepository_Protocols();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresource.CommunicationProtocolRepository <em>Communication Protocol Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Protocol Repository</em>'.
	 * @see org.muml.pm.hardware.hwresource.CommunicationProtocolRepository
	 * @generated
	 */
	EClass getCommunicationProtocolRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pm.hardware.hwresource.CommunicationProtocolRepository#getCommunicationProtocols <em>Communication Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Protocols</em>'.
	 * @see org.muml.pm.hardware.hwresource.CommunicationProtocolRepository#getCommunicationProtocols()
	 * @see #getCommunicationProtocolRepository()
	 * @generated
	 */
	EReference getCommunicationProtocolRepository_CommunicationProtocols();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresource.CommunicationProtocol <em>Communication Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Protocol</em>'.
	 * @see org.muml.pm.hardware.hwresource.CommunicationProtocol
	 * @generated
	 */
	EClass getCommunicationProtocol();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#isIsTimeTriggered <em>Is Time Triggered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Time Triggered</em>'.
	 * @see org.muml.pm.hardware.hwresource.CommunicationProtocol#isIsTimeTriggered()
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	EAttribute getCommunicationProtocol_IsTimeTriggered();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#isIsEventTriggered <em>Is Event Triggered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Event Triggered</em>'.
	 * @see org.muml.pm.hardware.hwresource.CommunicationProtocol#isIsEventTriggered()
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	EAttribute getCommunicationProtocol_IsEventTriggered();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#getFurtherInformation <em>Further Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Further Information</em>'.
	 * @see org.muml.pm.hardware.hwresource.CommunicationProtocol#getFurtherInformation()
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	EAttribute getCommunicationProtocol_FurtherInformation();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#isIsNetworkingProtocol <em>Is Networking Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Networking Protocol</em>'.
	 * @see org.muml.pm.hardware.hwresource.CommunicationProtocol#isIsNetworkingProtocol()
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	EAttribute getCommunicationProtocol_IsNetworkingProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#getDataFrameSize <em>Data Frame Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Frame Size</em>'.
	 * @see org.muml.pm.hardware.hwresource.CommunicationProtocol#getDataFrameSize()
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	EReference getCommunicationProtocol_DataFrameSize();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bandwidth</em>'.
	 * @see org.muml.pm.hardware.hwresource.CommunicationProtocol#getBandwidth()
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	EReference getCommunicationProtocol_Bandwidth();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#isIsSerial <em>Is Serial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Serial</em>'.
	 * @see org.muml.pm.hardware.hwresource.CommunicationProtocol#isIsSerial()
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	EAttribute getCommunicationProtocol_IsSerial();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresource.BusProtocol <em>Bus Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Protocol</em>'.
	 * @see org.muml.pm.hardware.hwresource.BusProtocol
	 * @generated
	 */
	EClass getBusProtocol();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.BusProtocol#getBusProtocol <em>Bus Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Protocol</em>'.
	 * @see org.muml.pm.hardware.hwresource.BusProtocol#getBusProtocol()
	 * @see #getBusProtocol()
	 * @generated
	 */
	EAttribute getBusProtocol_BusProtocol();

	/**
	 * Returns the meta object for the '{@link org.muml.pm.hardware.hwresource.BusProtocol#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.muml.pm.hardware.hwresource.BusProtocol#toString()
	 * @generated
	 */
	EOperation getBusProtocol__ToString();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresource.LinkProtocol <em>Link Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Protocol</em>'.
	 * @see org.muml.pm.hardware.hwresource.LinkProtocol
	 * @generated
	 */
	EClass getLinkProtocol();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.LinkProtocol#getLinkProtocol <em>Link Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Protocol</em>'.
	 * @see org.muml.pm.hardware.hwresource.LinkProtocol#getLinkProtocol()
	 * @see #getLinkProtocol()
	 * @generated
	 */
	EAttribute getLinkProtocol_LinkProtocol();

	/**
	 * Returns the meta object for the '{@link org.muml.pm.hardware.hwresource.LinkProtocol#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.muml.pm.hardware.hwresource.LinkProtocol#toString()
	 * @generated
	 */
	EOperation getLinkProtocol__ToString();

	/**
	 * Returns the meta object for class '{@link org.muml.pm.hardware.hwresource.CommunicationResource <em>Communication Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Resource</em>'.
	 * @see org.muml.pm.hardware.hwresource.CommunicationResource
	 * @generated
	 */
	EClass getCommunicationResource();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.CommunicationResource#getPortKind <em>Port Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Kind</em>'.
	 * @see org.muml.pm.hardware.hwresource.CommunicationResource#getPortKind()
	 * @see #getCommunicationResource()
	 * @generated
	 */
	EAttribute getCommunicationResource_PortKind();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pm.hardware.hwresource.CommunicationResource#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see org.muml.pm.hardware.hwresource.CommunicationResource#getProtocol()
	 * @see #getCommunicationResource()
	 * @generated
	 */
	EReference getCommunicationResource_Protocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pm.hardware.hwresource.CommunicationResource#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see org.muml.pm.hardware.hwresource.CommunicationResource#getCardinality()
	 * @see #getCommunicationResource()
	 * @generated
	 */
	EReference getCommunicationResource_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pm.hardware.hwresource.CommunicationResource#isMultiHWPort <em>Multi HW Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi HW Port</em>'.
	 * @see org.muml.pm.hardware.hwresource.CommunicationResource#isMultiHWPort()
	 * @see #getCommunicationResource()
	 * @generated
	 */
	EAttribute getCommunicationResource_MultiHWPort();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pm.hardware.hwresource.CommunicationResource#getParentResource <em>Parent Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Resource</em>'.
	 * @see org.muml.pm.hardware.hwresource.CommunicationResource#getParentResource()
	 * @see #getCommunicationResource()
	 * @generated
	 */
	EReference getCommunicationResource_ParentResource();

	/**
	 * Returns the meta object for enum '{@link org.muml.pm.hardware.hwresource.DeviceKind <em>Device Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Kind</em>'.
	 * @see org.muml.pm.hardware.hwresource.DeviceKind
	 * @generated
	 */
	EEnum getDeviceKind();

	/**
	 * Returns the meta object for enum '{@link org.muml.pm.hardware.hwresource.ProcessorArchitecture <em>Processor Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processor Architecture</em>'.
	 * @see org.muml.pm.hardware.hwresource.ProcessorArchitecture
	 * @generated
	 */
	EEnum getProcessorArchitecture();

	/**
	 * Returns the meta object for enum '{@link org.muml.pm.hardware.hwresource.MemoryAccessKind <em>Memory Access Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Memory Access Kind</em>'.
	 * @see org.muml.pm.hardware.hwresource.MemoryAccessKind
	 * @generated
	 */
	EEnum getMemoryAccessKind();

	/**
	 * Returns the meta object for enum '{@link org.muml.pm.hardware.hwresource.MemoryKind <em>Memory Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Memory Kind</em>'.
	 * @see org.muml.pm.hardware.hwresource.MemoryKind
	 * @generated
	 */
	EEnum getMemoryKind();

	/**
	 * Returns the meta object for enum '{@link org.muml.pm.hardware.hwresource.ReplacementPolicy <em>Replacement Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Replacement Policy</em>'.
	 * @see org.muml.pm.hardware.hwresource.ReplacementPolicy
	 * @generated
	 */
	EEnum getReplacementPolicy();

	/**
	 * Returns the meta object for enum '{@link org.muml.pm.hardware.hwresource.WritePolicy <em>Write Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Write Policy</em>'.
	 * @see org.muml.pm.hardware.hwresource.WritePolicy
	 * @generated
	 */
	EEnum getWritePolicy();

	/**
	 * Returns the meta object for enum '{@link org.muml.pm.hardware.hwresource.CommunicationKind <em>Communication Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Kind</em>'.
	 * @see org.muml.pm.hardware.hwresource.CommunicationKind
	 * @generated
	 */
	EEnum getCommunicationKind();

	/**
	 * Returns the meta object for enum '{@link org.muml.pm.hardware.hwresource.BusProtocolKind <em>Bus Protocol Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bus Protocol Kind</em>'.
	 * @see org.muml.pm.hardware.hwresource.BusProtocolKind
	 * @generated
	 */
	EEnum getBusProtocolKind();

	/**
	 * Returns the meta object for enum '{@link org.muml.pm.hardware.hwresource.LinkProtocolKind <em>Link Protocol Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Protocol Kind</em>'.
	 * @see org.muml.pm.hardware.hwresource.LinkProtocolKind
	 * @generated
	 */
	EEnum getLinkProtocolKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HwresourceFactory getHwresourceFactory();

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
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.impl.ResourceImpl
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Communication Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__COMMUNICATION_RESOURCES = eINSTANCE.getResource_CommunicationResources();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.impl.ComputingResourceImpl <em>Computing Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.impl.ComputingResourceImpl
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getComputingResource()
		 * @generated
		 */
		EClass COMPUTING_RESOURCE = eINSTANCE.getComputingResource();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.impl.MemoryResourceImpl <em>Memory Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.impl.MemoryResourceImpl
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getMemoryResource()
		 * @generated
		 */
		EClass MEMORY_RESOURCE = eINSTANCE.getMemoryResource();

		/**
		 * The meta object literal for the '<em><b>Memory Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_RESOURCE__MEMORY_ACCESS = eINSTANCE.getMemoryResource_MemoryAccess();

		/**
		 * The meta object literal for the '<em><b>Is Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_RESOURCE__IS_VOLATILE = eINSTANCE.getMemoryResource_IsVolatile();

		/**
		 * The meta object literal for the '<em><b>Memory Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_RESOURCE__MEMORY_TYPE = eINSTANCE.getMemoryResource_MemoryType();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.impl.DeviceImpl
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Device Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__DEVICE_KIND = eINSTANCE.getDevice_DeviceKind();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.impl.CacheImpl <em>Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.impl.CacheImpl
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getCache()
		 * @generated
		 */
		EClass CACHE = eINSTANCE.getCache();

		/**
		 * The meta object literal for the '<em><b>Write Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__WRITE_POLICY = eINSTANCE.getCache_WritePolicy();

		/**
		 * The meta object literal for the '<em><b>Replacement Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__REPLACEMENT_POLICY = eINSTANCE.getCache_ReplacementPolicy();

		/**
		 * The meta object literal for the '<em><b>Nb Sets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__NB_SETS = eINSTANCE.getCache_NbSets();

		/**
		 * The meta object literal for the '<em><b>Associativity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__ASSOCIATIVITY = eINSTANCE.getCache_Associativity();

		/**
		 * The meta object literal for the '<em><b>Used By Processor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE__USED_BY_PROCESSOR = eINSTANCE.getCache_UsedByProcessor();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.impl.ProgrammableLogicDeviceImpl <em>Programmable Logic Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.impl.ProgrammableLogicDeviceImpl
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getProgrammableLogicDevice()
		 * @generated
		 */
		EClass PROGRAMMABLE_LOGIC_DEVICE = eINSTANCE.getProgrammableLogicDevice();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.impl.ProcessorImpl
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Owned Cache</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__OWNED_CACHE = eINSTANCE.getProcessor_OwnedCache();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__ARCHITECTURE = eINSTANCE.getProcessor_Architecture();

		/**
		 * The meta object literal for the '<em><b>Nb Cores</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__NB_CORES = eINSTANCE.getProcessor_NbCores();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__FAMILY = eINSTANCE.getProcessor_Family();

		/**
		 * The meta object literal for the '<em><b>Nb Pipeline Stages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__NB_PIPELINE_STAGES = eINSTANCE.getProcessor_NbPipelineStages();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.impl.AtomicResourceImpl <em>Atomic Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.impl.AtomicResourceImpl
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getAtomicResource()
		 * @generated
		 */
		EClass ATOMIC_RESOURCE = eINSTANCE.getAtomicResource();

		/**
		 * The meta object literal for the '<em><b>Parent Structured Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE = eINSTANCE.getAtomicResource_ParentStructuredResource();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.impl.StructuredResourceImpl <em>Structured Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.impl.StructuredResourceImpl
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getStructuredResource()
		 * @generated
		 */
		EClass STRUCTURED_RESOURCE = eINSTANCE.getStructuredResource();

		/**
		 * The meta object literal for the '<em><b>Embedded Atomic Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES = eINSTANCE.getStructuredResource_EmbeddedAtomicResources();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.impl.ResourceRepositoryImpl <em>Resource Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.impl.ResourceRepositoryImpl
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getResourceRepository()
		 * @generated
		 */
		EClass RESOURCE_REPOSITORY = eINSTANCE.getResourceRepository();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REPOSITORY__RESOURCES = eINSTANCE.getResourceRepository_Resources();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REPOSITORY__PROTOCOLS = eINSTANCE.getResourceRepository_Protocols();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.impl.CommunicationProtocolRepositoryImpl <em>Communication Protocol Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.impl.CommunicationProtocolRepositoryImpl
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getCommunicationProtocolRepository()
		 * @generated
		 */
		EClass COMMUNICATION_PROTOCOL_REPOSITORY = eINSTANCE.getCommunicationProtocolRepository();

		/**
		 * The meta object literal for the '<em><b>Communication Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_PROTOCOL_REPOSITORY__COMMUNICATION_PROTOCOLS = eINSTANCE.getCommunicationProtocolRepository_CommunicationProtocols();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.impl.CommunicationProtocolImpl <em>Communication Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.impl.CommunicationProtocolImpl
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getCommunicationProtocol()
		 * @generated
		 */
		EClass COMMUNICATION_PROTOCOL = eINSTANCE.getCommunicationProtocol();

		/**
		 * The meta object literal for the '<em><b>Is Time Triggered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_PROTOCOL__IS_TIME_TRIGGERED = eINSTANCE.getCommunicationProtocol_IsTimeTriggered();

		/**
		 * The meta object literal for the '<em><b>Is Event Triggered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_PROTOCOL__IS_EVENT_TRIGGERED = eINSTANCE.getCommunicationProtocol_IsEventTriggered();

		/**
		 * The meta object literal for the '<em><b>Further Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_PROTOCOL__FURTHER_INFORMATION = eINSTANCE.getCommunicationProtocol_FurtherInformation();

		/**
		 * The meta object literal for the '<em><b>Is Networking Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_PROTOCOL__IS_NETWORKING_PROTOCOL = eINSTANCE.getCommunicationProtocol_IsNetworkingProtocol();

		/**
		 * The meta object literal for the '<em><b>Data Frame Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_PROTOCOL__DATA_FRAME_SIZE = eINSTANCE.getCommunicationProtocol_DataFrameSize();

		/**
		 * The meta object literal for the '<em><b>Bandwidth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_PROTOCOL__BANDWIDTH = eINSTANCE.getCommunicationProtocol_Bandwidth();

		/**
		 * The meta object literal for the '<em><b>Is Serial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_PROTOCOL__IS_SERIAL = eINSTANCE.getCommunicationProtocol_IsSerial();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.impl.BusProtocolImpl <em>Bus Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.impl.BusProtocolImpl
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getBusProtocol()
		 * @generated
		 */
		EClass BUS_PROTOCOL = eINSTANCE.getBusProtocol();

		/**
		 * The meta object literal for the '<em><b>Bus Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS_PROTOCOL__BUS_PROTOCOL = eINSTANCE.getBusProtocol_BusProtocol();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUS_PROTOCOL___TO_STRING = eINSTANCE.getBusProtocol__ToString();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.impl.LinkProtocolImpl <em>Link Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.impl.LinkProtocolImpl
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getLinkProtocol()
		 * @generated
		 */
		EClass LINK_PROTOCOL = eINSTANCE.getLinkProtocol();

		/**
		 * The meta object literal for the '<em><b>Link Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_PROTOCOL__LINK_PROTOCOL = eINSTANCE.getLinkProtocol_LinkProtocol();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINK_PROTOCOL___TO_STRING = eINSTANCE.getLinkProtocol__ToString();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.impl.CommunicationResourceImpl <em>Communication Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.impl.CommunicationResourceImpl
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getCommunicationResource()
		 * @generated
		 */
		EClass COMMUNICATION_RESOURCE = eINSTANCE.getCommunicationResource();

		/**
		 * The meta object literal for the '<em><b>Port Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_RESOURCE__PORT_KIND = eINSTANCE.getCommunicationResource_PortKind();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_RESOURCE__PROTOCOL = eINSTANCE.getCommunicationResource_Protocol();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_RESOURCE__CARDINALITY = eINSTANCE.getCommunicationResource_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Multi HW Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_RESOURCE__MULTI_HW_PORT = eINSTANCE.getCommunicationResource_MultiHWPort();

		/**
		 * The meta object literal for the '<em><b>Parent Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_RESOURCE__PARENT_RESOURCE = eINSTANCE.getCommunicationResource_ParentResource();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.DeviceKind <em>Device Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.DeviceKind
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getDeviceKind()
		 * @generated
		 */
		EEnum DEVICE_KIND = eINSTANCE.getDeviceKind();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.ProcessorArchitecture <em>Processor Architecture</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.ProcessorArchitecture
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getProcessorArchitecture()
		 * @generated
		 */
		EEnum PROCESSOR_ARCHITECTURE = eINSTANCE.getProcessorArchitecture();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.MemoryAccessKind <em>Memory Access Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.MemoryAccessKind
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getMemoryAccessKind()
		 * @generated
		 */
		EEnum MEMORY_ACCESS_KIND = eINSTANCE.getMemoryAccessKind();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.MemoryKind <em>Memory Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.MemoryKind
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getMemoryKind()
		 * @generated
		 */
		EEnum MEMORY_KIND = eINSTANCE.getMemoryKind();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.ReplacementPolicy <em>Replacement Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.ReplacementPolicy
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getReplacementPolicy()
		 * @generated
		 */
		EEnum REPLACEMENT_POLICY = eINSTANCE.getReplacementPolicy();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.WritePolicy <em>Write Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.WritePolicy
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getWritePolicy()
		 * @generated
		 */
		EEnum WRITE_POLICY = eINSTANCE.getWritePolicy();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.CommunicationKind <em>Communication Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.CommunicationKind
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getCommunicationKind()
		 * @generated
		 */
		EEnum COMMUNICATION_KIND = eINSTANCE.getCommunicationKind();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.BusProtocolKind <em>Bus Protocol Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.BusProtocolKind
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getBusProtocolKind()
		 * @generated
		 */
		EEnum BUS_PROTOCOL_KIND = eINSTANCE.getBusProtocolKind();

		/**
		 * The meta object literal for the '{@link org.muml.pm.hardware.hwresource.LinkProtocolKind <em>Link Protocol Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pm.hardware.hwresource.LinkProtocolKind
		 * @see org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl#getLinkProtocolKind()
		 * @generated
		 */
		EEnum LINK_PROTOCOL_KIND = eINSTANCE.getLinkProtocolKind();

	}

} //HwresourcePackage
