/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * The package resourcetype contains all classes for modeling atomic and structured resource types in the Resource Type Viewpoint.
 * 
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ResourcetypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resourcetype";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/hardware/resourcetype/1.0/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resourcetype";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcetypePackage eINSTANCE = de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourceTypeImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__NAME = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__COMMENT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__HWPORTS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.AtomicResourceImpl <em>Atomic Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.AtomicResourceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getAtomicResource()
	 * @generated
	 */
	int ATOMIC_RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE__ANNOTATION = RESOURCE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE__EXTENSION = RESOURCE_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE__COMMENT = RESOURCE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE__HWPORTS = RESOURCE_TYPE__HWPORTS;

	/**
	 * The feature id for the '<em><b>Parent Structured Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RESOURCE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ComputingResourceImpl <em>Computing Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ComputingResourceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getComputingResource()
	 * @generated
	 */
	int COMPUTING_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__ANNOTATION = ATOMIC_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__EXTENSION = ATOMIC_RESOURCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__NAME = ATOMIC_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__COMMENT = ATOMIC_RESOURCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__HWPORTS = ATOMIC_RESOURCE__HWPORTS;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.MemoryResourceImpl <em>Memory Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.MemoryResourceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getMemoryResource()
	 * @generated
	 */
	int MEMORY_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__ANNOTATION = ATOMIC_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__EXTENSION = ATOMIC_RESOURCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__NAME = ATOMIC_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__COMMENT = ATOMIC_RESOURCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_RESOURCE__HWPORTS = ATOMIC_RESOURCE__HWPORTS;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.DeviceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ANNOTATION = RESOURCE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__EXTENSION = RESOURCE_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__COMMENT = RESOURCE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__HWPORTS = RESOURCE_TYPE__HWPORTS;

	/**
	 * The feature id for the '<em><b>Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEVICE_TYPE = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.CacheImpl <em>Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.CacheImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getCache()
	 * @generated
	 */
	int CACHE = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__ANNOTATION = MEMORY_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__EXTENSION = MEMORY_RESOURCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__NAME = MEMORY_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__COMMENT = MEMORY_RESOURCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__HWPORTS = MEMORY_RESOURCE__HWPORTS;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ProgrammableLogicDeviceImpl <em>Programmable Logic Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ProgrammableLogicDeviceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getProgrammableLogicDevice()
	 * @generated
	 */
	int PROGRAMMABLE_LOGIC_DEVICE = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE__ANNOTATION = COMPUTING_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE__EXTENSION = COMPUTING_RESOURCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE__NAME = COMPUTING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE__COMMENT = COMPUTING_RESOURCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMABLE_LOGIC_DEVICE__HWPORTS = COMPUTING_RESOURCE__HWPORTS;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ProcessorImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__ANNOTATION = COMPUTING_RESOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__EXTENSION = COMPUTING_RESOURCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = COMPUTING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__COMMENT = COMPUTING_RESOURCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__HWPORTS = COMPUTING_RESOURCE__HWPORTS;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.StructuredResourceImpl <em>Structured Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.StructuredResourceImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getStructuredResource()
	 * @generated
	 */
	int STRUCTURED_RESOURCE = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE__ANNOTATION = RESOURCE_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE__EXTENSION = RESOURCE_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE__NAME = RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE__COMMENT = RESOURCE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE__HWPORTS = RESOURCE_TYPE__HWPORTS;

	/**
	 * The feature id for the '<em><b>Embedded Atomic Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structured Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_RESOURCE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.HWPortImpl <em>HW Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.HWPortImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getHWPort()
	 * @generated
	 */
	int HW_PORT = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__PARENT_RESOURCE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__PORT_TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

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
	 * The number of structural features of the '<em>HW Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourceTypeRepositoryImpl <em>Resource Type Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourceTypeRepositoryImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getResourceTypeRepository()
	 * @generated
	 */
	int RESOURCE_TYPE_REPOSITORY = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_REPOSITORY__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_REPOSITORY__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_REPOSITORY__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Resource Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_REPOSITORY__RESOURCE_TYPES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_REPOSITORY__PROTOCOLS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Type Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_REPOSITORY_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.CommunicationProtocolImpl <em>Communication Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.CommunicationProtocolImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getCommunicationProtocol()
	 * @generated
	 */
	int COMMUNICATION_PROTOCOL = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

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
	 * The number of structural features of the '<em>Communication Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.BusProtocolImpl <em>Bus Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.BusProtocolImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getBusProtocol()
	 * @generated
	 */
	int BUS_PROTOCOL = 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PROTOCOL__ANNOTATION = COMMUNICATION_PROTOCOL__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_PROTOCOL__EXTENSION = COMMUNICATION_PROTOCOL__EXTENSION;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.LinkProtocolImpl <em>Link Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.LinkProtocolImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getLinkProtocol()
	 * @generated
	 */
	int LINK_PROTOCOL = 13;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROTOCOL__ANNOTATION = COMMUNICATION_PROTOCOL__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROTOCOL__EXTENSION = COMMUNICATION_PROTOCOL__EXTENSION;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.DeviceKind <em>Device Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.DeviceKind
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getDeviceKind()
	 * @generated
	 */
	int DEVICE_KIND = 14;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ProcessorArchitecture <em>Processor Architecture</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ProcessorArchitecture
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getProcessorArchitecture()
	 * @generated
	 */
	int PROCESSOR_ARCHITECTURE = 15;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryAccessKind <em>Memory Access Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryAccessKind
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getMemoryAccessKind()
	 * @generated
	 */
	int MEMORY_ACCESS_KIND = 16;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryKind <em>Memory Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryKind
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getMemoryKind()
	 * @generated
	 */
	int MEMORY_KIND = 17;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ReplacementPolicy <em>Replacement Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ReplacementPolicy
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getReplacementPolicy()
	 * @generated
	 */
	int REPLACEMENT_POLICY = 18;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.WritePolicy <em>Write Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.WritePolicy
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getWritePolicy()
	 * @generated
	 */
	int WRITE_POLICY = 19;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPortKind <em>HW Port Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPortKind
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getHWPortKind()
	 * @generated
	 */
	int HW_PORT_KIND = 20;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocolKind <em>Bus Protocol Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocolKind
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getBusProtocolKind()
	 * @generated
	 */
	int BUS_PROTOCOL_KIND = 21;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.LinkProtocolKind <em>Link Protocol Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.LinkProtocolKind
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getLinkProtocolKind()
	 * @generated
	 */
	int LINK_PROTOCOL_KIND = 22;

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType#getHwports <em>Hwports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hwports</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType#getHwports()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Hwports();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ComputingResource <em>Computing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Resource</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ComputingResource
	 * @generated
	 */
	EClass getComputingResource();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryResource <em>Memory Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Resource</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryResource
	 * @generated
	 */
	EClass getMemoryResource();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryResource#getMemoryAccess <em>Memory Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Access</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryResource#getMemoryAccess()
	 * @see #getMemoryResource()
	 * @generated
	 */
	EAttribute getMemoryResource_MemoryAccess();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryResource#isIsVolatile <em>Is Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Volatile</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryResource#isIsVolatile()
	 * @see #getMemoryResource()
	 * @generated
	 */
	EAttribute getMemoryResource_IsVolatile();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryResource#getMemoryType <em>Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryResource#getMemoryType()
	 * @see #getMemoryResource()
	 * @generated
	 */
	EAttribute getMemoryResource_MemoryType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Device#getDeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.Device#getDeviceType()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_DeviceType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache
	 * @generated
	 */
	EClass getCache();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getWritePolicy <em>Write Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Policy</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getWritePolicy()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_WritePolicy();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getReplacementPolicy <em>Replacement Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replacement Policy</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getReplacementPolicy()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_ReplacementPolicy();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getNbSets <em>Nb Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Sets</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getNbSets()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_NbSets();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getAssociativity <em>Associativity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associativity</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getAssociativity()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Associativity();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getUsedByProcessor <em>Used By Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used By Processor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache#getUsedByProcessor()
	 * @see #getCache()
	 * @generated
	 */
	EReference getCache_UsedByProcessor();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ProgrammableLogicDevice <em>Programmable Logic Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programmable Logic Device</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ProgrammableLogicDevice
	 * @generated
	 */
	EClass getProgrammableLogicDevice();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor#getOwnedCache <em>Owned Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Cache</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor#getOwnedCache()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_OwnedCache();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor#getArchitecture()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Architecture();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor#getNbCores <em>Nb Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb Cores</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor#getNbCores()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_NbCores();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor#getFamily()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Family();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor#getNbPipelineStages <em>Nb Pipeline Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb Pipeline Stages</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor#getNbPipelineStages()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_NbPipelineStages();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.AtomicResource <em>Atomic Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Resource</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.AtomicResource
	 * @generated
	 */
	EClass getAtomicResource();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.AtomicResource#getParentStructuredResource <em>Parent Structured Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structured Resource</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.AtomicResource#getParentStructuredResource()
	 * @see #getAtomicResource()
	 * @generated
	 */
	EReference getAtomicResource_ParentStructuredResource();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.StructuredResource <em>Structured Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Resource</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.StructuredResource
	 * @generated
	 */
	EClass getStructuredResource();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.StructuredResource#getEmbeddedAtomicResources <em>Embedded Atomic Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Atomic Resources</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.StructuredResource#getEmbeddedAtomicResources()
	 * @see #getStructuredResource()
	 * @generated
	 */
	EReference getStructuredResource_EmbeddedAtomicResources();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort <em>HW Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort
	 * @generated
	 */
	EClass getHWPort();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort#getParentResource <em>Parent Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Resource</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort#getParentResource()
	 * @see #getHWPort()
	 * @generated
	 */
	EReference getHWPort_ParentResource();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort#getPortType()
	 * @see #getHWPort()
	 * @generated
	 */
	EAttribute getHWPort_PortType();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort#getProtocol()
	 * @see #getHWPort()
	 * @generated
	 */
	EReference getHWPort_Protocol();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort#getCardinality()
	 * @see #getHWPort()
	 * @generated
	 */
	EReference getHWPort_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort#isMultiHWPort <em>Multi HW Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi HW Port</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort#isMultiHWPort()
	 * @see #getHWPort()
	 * @generated
	 */
	EAttribute getHWPort_MultiHWPort();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository <em>Resource Type Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type Repository</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository
	 * @generated
	 */
	EClass getResourceTypeRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository#getResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Types</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository#getResourceTypes()
	 * @see #getResourceTypeRepository()
	 * @generated
	 */
	EReference getResourceTypeRepository_ResourceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository#getProtocols()
	 * @see #getResourceTypeRepository()
	 * @generated
	 */
	EReference getResourceTypeRepository_Protocols();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol <em>Communication Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol
	 * @generated
	 */
	EClass getCommunicationProtocol();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol#isIsTimeTriggered <em>Is Time Triggered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Time Triggered</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol#isIsTimeTriggered()
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	EAttribute getCommunicationProtocol_IsTimeTriggered();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol#isIsEventTriggered <em>Is Event Triggered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Event Triggered</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol#isIsEventTriggered()
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	EAttribute getCommunicationProtocol_IsEventTriggered();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol#getFurtherInformation <em>Further Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Further Information</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol#getFurtherInformation()
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	EAttribute getCommunicationProtocol_FurtherInformation();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocol <em>Bus Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocol
	 * @generated
	 */
	EClass getBusProtocol();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocol#getBusProtocol <em>Bus Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocol#getBusProtocol()
	 * @see #getBusProtocol()
	 * @generated
	 */
	EAttribute getBusProtocol_BusProtocol();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.LinkProtocol <em>Link Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.LinkProtocol
	 * @generated
	 */
	EClass getLinkProtocol();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.LinkProtocol#getLinkProtocol <em>Link Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Protocol</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.LinkProtocol#getLinkProtocol()
	 * @see #getLinkProtocol()
	 * @generated
	 */
	EAttribute getLinkProtocol_LinkProtocol();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.DeviceKind <em>Device Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.DeviceKind
	 * @generated
	 */
	EEnum getDeviceKind();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ProcessorArchitecture <em>Processor Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processor Architecture</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ProcessorArchitecture
	 * @generated
	 */
	EEnum getProcessorArchitecture();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryAccessKind <em>Memory Access Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Memory Access Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryAccessKind
	 * @generated
	 */
	EEnum getMemoryAccessKind();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryKind <em>Memory Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Memory Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryKind
	 * @generated
	 */
	EEnum getMemoryKind();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ReplacementPolicy <em>Replacement Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Replacement Policy</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ReplacementPolicy
	 * @generated
	 */
	EEnum getReplacementPolicy();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.WritePolicy <em>Write Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Write Policy</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.WritePolicy
	 * @generated
	 */
	EEnum getWritePolicy();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPortKind <em>HW Port Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HW Port Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPortKind
	 * @generated
	 */
	EEnum getHWPortKind();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocolKind <em>Bus Protocol Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bus Protocol Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocolKind
	 * @generated
	 */
	EEnum getBusProtocolKind();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.LinkProtocolKind <em>Link Protocol Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Protocol Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.LinkProtocolKind
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
	ResourcetypeFactory getResourcetypeFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourceTypeImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getResourceType()
		 * @generated
		 */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '<em><b>Hwports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__HWPORTS = eINSTANCE.getResourceType_Hwports();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ComputingResourceImpl <em>Computing Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ComputingResourceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getComputingResource()
		 * @generated
		 */
		EClass COMPUTING_RESOURCE = eINSTANCE.getComputingResource();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.MemoryResourceImpl <em>Memory Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.MemoryResourceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getMemoryResource()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.DeviceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__DEVICE_TYPE = eINSTANCE.getDevice_DeviceType();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.CacheImpl <em>Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.CacheImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getCache()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ProgrammableLogicDeviceImpl <em>Programmable Logic Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ProgrammableLogicDeviceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getProgrammableLogicDevice()
		 * @generated
		 */
		EClass PROGRAMMABLE_LOGIC_DEVICE = eINSTANCE.getProgrammableLogicDevice();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ProcessorImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getProcessor()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.AtomicResourceImpl <em>Atomic Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.AtomicResourceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getAtomicResource()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.StructuredResourceImpl <em>Structured Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.StructuredResourceImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getStructuredResource()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.HWPortImpl <em>HW Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.HWPortImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getHWPort()
		 * @generated
		 */
		EClass HW_PORT = eINSTANCE.getHWPort();

		/**
		 * The meta object literal for the '<em><b>Parent Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT__PARENT_RESOURCE = eINSTANCE.getHWPort_ParentResource();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_PORT__PORT_TYPE = eINSTANCE.getHWPort_PortType();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourceTypeRepositoryImpl <em>Resource Type Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourceTypeRepositoryImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getResourceTypeRepository()
		 * @generated
		 */
		EClass RESOURCE_TYPE_REPOSITORY = eINSTANCE.getResourceTypeRepository();

		/**
		 * The meta object literal for the '<em><b>Resource Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE_REPOSITORY__RESOURCE_TYPES = eINSTANCE.getResourceTypeRepository_ResourceTypes();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE_REPOSITORY__PROTOCOLS = eINSTANCE.getResourceTypeRepository_Protocols();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.CommunicationProtocolImpl <em>Communication Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.CommunicationProtocolImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getCommunicationProtocol()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.BusProtocolImpl <em>Bus Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.BusProtocolImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getBusProtocol()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.LinkProtocolImpl <em>Link Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.LinkProtocolImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getLinkProtocol()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.DeviceKind <em>Device Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.DeviceKind
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getDeviceKind()
		 * @generated
		 */
		EEnum DEVICE_KIND = eINSTANCE.getDeviceKind();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ProcessorArchitecture <em>Processor Architecture</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ProcessorArchitecture
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getProcessorArchitecture()
		 * @generated
		 */
		EEnum PROCESSOR_ARCHITECTURE = eINSTANCE.getProcessorArchitecture();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryAccessKind <em>Memory Access Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryAccessKind
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getMemoryAccessKind()
		 * @generated
		 */
		EEnum MEMORY_ACCESS_KIND = eINSTANCE.getMemoryAccessKind();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryKind <em>Memory Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryKind
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getMemoryKind()
		 * @generated
		 */
		EEnum MEMORY_KIND = eINSTANCE.getMemoryKind();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.ReplacementPolicy <em>Replacement Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ReplacementPolicy
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getReplacementPolicy()
		 * @generated
		 */
		EEnum REPLACEMENT_POLICY = eINSTANCE.getReplacementPolicy();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.WritePolicy <em>Write Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.WritePolicy
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getWritePolicy()
		 * @generated
		 */
		EEnum WRITE_POLICY = eINSTANCE.getWritePolicy();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPortKind <em>HW Port Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPortKind
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getHWPortKind()
		 * @generated
		 */
		EEnum HW_PORT_KIND = eINSTANCE.getHWPortKind();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocolKind <em>Bus Protocol Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocolKind
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getBusProtocolKind()
		 * @generated
		 */
		EEnum BUS_PROTOCOL_KIND = eINSTANCE.getBusProtocolKind();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.LinkProtocolKind <em>Link Protocol Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.LinkProtocolKind
		 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl#getLinkProtocolKind()
		 * @generated
		 */
		EEnum LINK_PROTOCOL_KIND = eINSTANCE.getLinkProtocolKind();

	}

} //ResourcetypePackage
