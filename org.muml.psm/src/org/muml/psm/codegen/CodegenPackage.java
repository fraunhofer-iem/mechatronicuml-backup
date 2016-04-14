/**
 */
package org.muml.psm.codegen;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.pim.instance.InstancePackage;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;

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
 * This package contains all classes which are necessary for a CodeGeneration Model
 * <!-- end-model-doc -->
 * @see org.muml.psm.codegen.CodegenFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface CodegenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "codegen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/psm/codegen/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "codegen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodegenPackage eINSTANCE = org.muml.psm.codegen.impl.CodegenPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.psm.codegen.impl.RefinedAtomicComponentInstanceImpl <em>Refined Atomic Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.codegen.impl.RefinedAtomicComponentInstanceImpl
	 * @see org.muml.psm.codegen.impl.CodegenPackageImpl#getRefinedAtomicComponentInstance()
	 * @generated
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE__ANNOTATIONS = InstancePackage.ATOMIC_COMPONENT_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE__EXTENSIONS = InstancePackage.ATOMIC_COMPONENT_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE__NAME = InstancePackage.ATOMIC_COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE__COMPONENT_TYPE = InstancePackage.ATOMIC_COMPONENT_INSTANCE__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE__PORT_INSTANCES = InstancePackage.ATOMIC_COMPONENT_INSTANCE__PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE__COMPONENT_PART = InstancePackage.ATOMIC_COMPONENT_INSTANCE__COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Parent CIC</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE__PARENT_CIC = InstancePackage.ATOMIC_COMPONENT_INSTANCE__PARENT_CIC;

	/**
	 * The feature id for the '<em><b>Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE__TOP_LEVEL = InstancePackage.ATOMIC_COMPONENT_INSTANCE__TOP_LEVEL;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE__COMPONENT_INSTANCE = InstancePackage.ATOMIC_COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE__INIT_COMMANDS = InstancePackage.ATOMIC_COMPONENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE__GEN_PORT_INSTANCES = InstancePackage.ATOMIC_COMPONENT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allocated Resource Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE = InstancePackage.ATOMIC_COMPONENT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Refined Atomic Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE_FEATURE_COUNT = InstancePackage.ATOMIC_COMPONENT_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Refined Atomic Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE_OPERATION_COUNT = InstancePackage.ATOMIC_COMPONENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.codegen.impl.RefinedStructuredResourceInstanceImpl <em>Refined Structured Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.codegen.impl.RefinedStructuredResourceInstanceImpl
	 * @see org.muml.psm.codegen.impl.CodegenPackageImpl#getRefinedStructuredResourceInstance()
	 * @generated
	 */
	int REFINED_STRUCTURED_RESOURCE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_STRUCTURED_RESOURCE_INSTANCE__ANNOTATIONS = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_STRUCTURED_RESOURCE_INSTANCE__EXTENSIONS = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_STRUCTURED_RESOURCE_INSTANCE__NAME = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_STRUCTURED_RESOURCE_INSTANCE__HWPORTS = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__HWPORTS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_STRUCTURED_RESOURCE_INSTANCE__RESOURCE_TYPE = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Embedded Atomic Resource Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Allocated Atomic Component Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Refined Structured Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_STRUCTURED_RESOURCE_INSTANCE_FEATURE_COUNT = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Refined Structured Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_STRUCTURED_RESOURCE_INSTANCE_OPERATION_COUNT = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.codegen.impl.CodeGenAllocationImpl <em>Code Gen Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.codegen.impl.CodeGenAllocationImpl
	 * @see org.muml.psm.codegen.impl.CodegenPackageImpl#getCodeGenAllocation()
	 * @generated
	 */
	int CODE_GEN_ALLOCATION = 2;

	/**
	 * The feature id for the '<em><b>Hpic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_ALLOCATION__HPIC = 0;

	/**
	 * The feature id for the '<em><b>Cic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_ALLOCATION__CIC = 1;

	/**
	 * The number of structural features of the '<em>Code Gen Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_ALLOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Code Gen Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEN_ALLOCATION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.muml.psm.codegen.impl.GenComponentInstanceImpl <em>Gen Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.codegen.impl.GenComponentInstanceImpl
	 * @see org.muml.psm.codegen.impl.CodegenPackageImpl#getGenComponentInstance()
	 * @generated
	 */
	int GEN_COMPONENT_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPONENT_INSTANCE__COMPONENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Init Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPONENT_INSTANCE__INIT_COMMANDS = 1;

	/**
	 * The feature id for the '<em><b>Gen Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPONENT_INSTANCE__GEN_PORT_INSTANCES = 2;

	/**
	 * The number of structural features of the '<em>Gen Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPONENT_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Gen Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMPONENT_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.codegen.impl.GenPortInstanceImpl <em>Gen Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.codegen.impl.GenPortInstanceImpl
	 * @see org.muml.psm.codegen.impl.CodegenPackageImpl#getGenPortInstance()
	 * @generated
	 */
	int GEN_PORT_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Port Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PORT_INSTANCE__PORT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Sampling Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PORT_INSTANCE__SAMPLING_TIME = 1;

	/**
	 * The feature id for the '<em><b>Exec Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PORT_INSTANCE__EXEC_COMMAND = 2;

	/**
	 * The number of structural features of the '<em>Gen Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PORT_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Gen Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PORT_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.codegen.impl.GenECUImpl <em>Gen ECU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.codegen.impl.GenECUImpl
	 * @see org.muml.psm.codegen.impl.CodegenPackageImpl#getGenECU()
	 * @generated
	 */
	int GEN_ECU = 5;

	/**
	 * The feature id for the '<em><b>Ecu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ECU__ECU = 0;

	/**
	 * The feature id for the '<em><b>Allocated Gen Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ECU__ALLOCATED_GEN_TASKS = 1;

	/**
	 * The number of structural features of the '<em>Gen ECU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ECU_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gen ECU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ECU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.codegen.impl.GenTaskImpl <em>Gen Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.codegen.impl.GenTaskImpl
	 * @see org.muml.psm.codegen.impl.CodegenPackageImpl#getGenTask()
	 * @generated
	 */
	int GEN_TASK = 6;

	/**
	 * The feature id for the '<em><b>Gen Component Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TASK__GEN_COMPONENT_INSTANCES = 0;

	/**
	 * The number of structural features of the '<em>Gen Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TASK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gen Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.codegen.impl.GenSystemImpl <em>Gen System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.codegen.impl.GenSystemImpl
	 * @see org.muml.psm.codegen.impl.CodegenPackageImpl#getGenSystem()
	 * @generated
	 */
	int GEN_SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>Gen EC Us</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SYSTEM__GEN_EC_US = 0;

	/**
	 * The feature id for the '<em><b>Cic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SYSTEM__CIC = 1;

	/**
	 * The feature id for the '<em><b>Hpic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SYSTEM__HPIC = 2;

	/**
	 * The number of structural features of the '<em>Gen System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Gen System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SYSTEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.muml.psm.codegen.RefinedAtomicComponentInstance <em>Refined Atomic Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refined Atomic Component Instance</em>'.
	 * @see org.muml.psm.codegen.RefinedAtomicComponentInstance
	 * @generated
	 */
	EClass getRefinedAtomicComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.codegen.RefinedAtomicComponentInstance#getAllocatedResourceInstance <em>Allocated Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocated Resource Instance</em>'.
	 * @see org.muml.psm.codegen.RefinedAtomicComponentInstance#getAllocatedResourceInstance()
	 * @see #getRefinedAtomicComponentInstance()
	 * @generated
	 */
	EReference getRefinedAtomicComponentInstance_AllocatedResourceInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.codegen.RefinedStructuredResourceInstance <em>Refined Structured Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refined Structured Resource Instance</em>'.
	 * @see org.muml.psm.codegen.RefinedStructuredResourceInstance
	 * @generated
	 */
	EClass getRefinedStructuredResourceInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.psm.codegen.RefinedStructuredResourceInstance#getAllocatedAtomicComponentInstances <em>Allocated Atomic Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Atomic Component Instances</em>'.
	 * @see org.muml.psm.codegen.RefinedStructuredResourceInstance#getAllocatedAtomicComponentInstances()
	 * @see #getRefinedStructuredResourceInstance()
	 * @generated
	 */
	EReference getRefinedStructuredResourceInstance_AllocatedAtomicComponentInstances();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.codegen.CodeGenAllocation <em>Code Gen Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Gen Allocation</em>'.
	 * @see org.muml.psm.codegen.CodeGenAllocation
	 * @generated
	 */
	EClass getCodeGenAllocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.codegen.CodeGenAllocation#getHpic <em>Hpic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hpic</em>'.
	 * @see org.muml.psm.codegen.CodeGenAllocation#getHpic()
	 * @see #getCodeGenAllocation()
	 * @generated
	 */
	EReference getCodeGenAllocation_Hpic();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.codegen.CodeGenAllocation#getCic <em>Cic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cic</em>'.
	 * @see org.muml.psm.codegen.CodeGenAllocation#getCic()
	 * @see #getCodeGenAllocation()
	 * @generated
	 */
	EReference getCodeGenAllocation_Cic();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.codegen.GenComponentInstance <em>Gen Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Component Instance</em>'.
	 * @see org.muml.psm.codegen.GenComponentInstance
	 * @generated
	 */
	EClass getGenComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.codegen.GenComponentInstance#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance</em>'.
	 * @see org.muml.psm.codegen.GenComponentInstance#getComponentInstance()
	 * @see #getGenComponentInstance()
	 * @generated
	 */
	EReference getGenComponentInstance_ComponentInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.psm.codegen.GenComponentInstance#getInitCommands <em>Init Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Init Commands</em>'.
	 * @see org.muml.psm.codegen.GenComponentInstance#getInitCommands()
	 * @see #getGenComponentInstance()
	 * @generated
	 */
	EReference getGenComponentInstance_InitCommands();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.codegen.GenComponentInstance#getGenPortInstances <em>Gen Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Port Instances</em>'.
	 * @see org.muml.psm.codegen.GenComponentInstance#getGenPortInstances()
	 * @see #getGenComponentInstance()
	 * @generated
	 */
	EReference getGenComponentInstance_GenPortInstances();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.codegen.GenPortInstance <em>Gen Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Port Instance</em>'.
	 * @see org.muml.psm.codegen.GenPortInstance
	 * @generated
	 */
	EClass getGenPortInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.codegen.GenPortInstance#getPortInstance <em>Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Instance</em>'.
	 * @see org.muml.psm.codegen.GenPortInstance#getPortInstance()
	 * @see #getGenPortInstance()
	 * @generated
	 */
	EReference getGenPortInstance_PortInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.codegen.GenPortInstance#getSamplingTime <em>Sampling Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sampling Time</em>'.
	 * @see org.muml.psm.codegen.GenPortInstance#getSamplingTime()
	 * @see #getGenPortInstance()
	 * @generated
	 */
	EReference getGenPortInstance_SamplingTime();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.codegen.GenPortInstance#getExecCommand <em>Exec Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exec Command</em>'.
	 * @see org.muml.psm.codegen.GenPortInstance#getExecCommand()
	 * @see #getGenPortInstance()
	 * @generated
	 */
	EReference getGenPortInstance_ExecCommand();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.codegen.GenECU <em>Gen ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen ECU</em>'.
	 * @see org.muml.psm.codegen.GenECU
	 * @generated
	 */
	EClass getGenECU();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.codegen.GenECU#getEcu <em>Ecu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecu</em>'.
	 * @see org.muml.psm.codegen.GenECU#getEcu()
	 * @see #getGenECU()
	 * @generated
	 */
	EReference getGenECU_Ecu();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.codegen.GenECU#getAllocatedGenTasks <em>Allocated Gen Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocated Gen Tasks</em>'.
	 * @see org.muml.psm.codegen.GenECU#getAllocatedGenTasks()
	 * @see #getGenECU()
	 * @generated
	 */
	EReference getGenECU_AllocatedGenTasks();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.codegen.GenTask <em>Gen Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Task</em>'.
	 * @see org.muml.psm.codegen.GenTask
	 * @generated
	 */
	EClass getGenTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.codegen.GenTask#getGenComponentInstances <em>Gen Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Component Instances</em>'.
	 * @see org.muml.psm.codegen.GenTask#getGenComponentInstances()
	 * @see #getGenTask()
	 * @generated
	 */
	EReference getGenTask_GenComponentInstances();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.codegen.GenSystem <em>Gen System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen System</em>'.
	 * @see org.muml.psm.codegen.GenSystem
	 * @generated
	 */
	EClass getGenSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.codegen.GenSystem#getGenECUs <em>Gen EC Us</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen EC Us</em>'.
	 * @see org.muml.psm.codegen.GenSystem#getGenECUs()
	 * @see #getGenSystem()
	 * @generated
	 */
	EReference getGenSystem_GenECUs();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.codegen.GenSystem#getCic <em>Cic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cic</em>'.
	 * @see org.muml.psm.codegen.GenSystem#getCic()
	 * @see #getGenSystem()
	 * @generated
	 */
	EReference getGenSystem_Cic();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.codegen.GenSystem#getHpic <em>Hpic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hpic</em>'.
	 * @see org.muml.psm.codegen.GenSystem#getHpic()
	 * @see #getGenSystem()
	 * @generated
	 */
	EReference getGenSystem_Hpic();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodegenFactory getCodegenFactory();

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
		 * The meta object literal for the '{@link org.muml.psm.codegen.impl.RefinedAtomicComponentInstanceImpl <em>Refined Atomic Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.codegen.impl.RefinedAtomicComponentInstanceImpl
		 * @see org.muml.psm.codegen.impl.CodegenPackageImpl#getRefinedAtomicComponentInstance()
		 * @generated
		 */
		EClass REFINED_ATOMIC_COMPONENT_INSTANCE = eINSTANCE.getRefinedAtomicComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Allocated Resource Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE = eINSTANCE.getRefinedAtomicComponentInstance_AllocatedResourceInstance();

		/**
		 * The meta object literal for the '{@link org.muml.psm.codegen.impl.RefinedStructuredResourceInstanceImpl <em>Refined Structured Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.codegen.impl.RefinedStructuredResourceInstanceImpl
		 * @see org.muml.psm.codegen.impl.CodegenPackageImpl#getRefinedStructuredResourceInstance()
		 * @generated
		 */
		EClass REFINED_STRUCTURED_RESOURCE_INSTANCE = eINSTANCE.getRefinedStructuredResourceInstance();

		/**
		 * The meta object literal for the '<em><b>Allocated Atomic Component Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES = eINSTANCE.getRefinedStructuredResourceInstance_AllocatedAtomicComponentInstances();

		/**
		 * The meta object literal for the '{@link org.muml.psm.codegen.impl.CodeGenAllocationImpl <em>Code Gen Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.codegen.impl.CodeGenAllocationImpl
		 * @see org.muml.psm.codegen.impl.CodegenPackageImpl#getCodeGenAllocation()
		 * @generated
		 */
		EClass CODE_GEN_ALLOCATION = eINSTANCE.getCodeGenAllocation();

		/**
		 * The meta object literal for the '<em><b>Hpic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_GEN_ALLOCATION__HPIC = eINSTANCE.getCodeGenAllocation_Hpic();

		/**
		 * The meta object literal for the '<em><b>Cic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_GEN_ALLOCATION__CIC = eINSTANCE.getCodeGenAllocation_Cic();

		/**
		 * The meta object literal for the '{@link org.muml.psm.codegen.impl.GenComponentInstanceImpl <em>Gen Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.codegen.impl.GenComponentInstanceImpl
		 * @see org.muml.psm.codegen.impl.CodegenPackageImpl#getGenComponentInstance()
		 * @generated
		 */
		EClass GEN_COMPONENT_INSTANCE = eINSTANCE.getGenComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_COMPONENT_INSTANCE__COMPONENT_INSTANCE = eINSTANCE.getGenComponentInstance_ComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Init Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_COMPONENT_INSTANCE__INIT_COMMANDS = eINSTANCE.getGenComponentInstance_InitCommands();

		/**
		 * The meta object literal for the '<em><b>Gen Port Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_COMPONENT_INSTANCE__GEN_PORT_INSTANCES = eINSTANCE.getGenComponentInstance_GenPortInstances();

		/**
		 * The meta object literal for the '{@link org.muml.psm.codegen.impl.GenPortInstanceImpl <em>Gen Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.codegen.impl.GenPortInstanceImpl
		 * @see org.muml.psm.codegen.impl.CodegenPackageImpl#getGenPortInstance()
		 * @generated
		 */
		EClass GEN_PORT_INSTANCE = eINSTANCE.getGenPortInstance();

		/**
		 * The meta object literal for the '<em><b>Port Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PORT_INSTANCE__PORT_INSTANCE = eINSTANCE.getGenPortInstance_PortInstance();

		/**
		 * The meta object literal for the '<em><b>Sampling Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PORT_INSTANCE__SAMPLING_TIME = eINSTANCE.getGenPortInstance_SamplingTime();

		/**
		 * The meta object literal for the '<em><b>Exec Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PORT_INSTANCE__EXEC_COMMAND = eINSTANCE.getGenPortInstance_ExecCommand();

		/**
		 * The meta object literal for the '{@link org.muml.psm.codegen.impl.GenECUImpl <em>Gen ECU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.codegen.impl.GenECUImpl
		 * @see org.muml.psm.codegen.impl.CodegenPackageImpl#getGenECU()
		 * @generated
		 */
		EClass GEN_ECU = eINSTANCE.getGenECU();

		/**
		 * The meta object literal for the '<em><b>Ecu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ECU__ECU = eINSTANCE.getGenECU_Ecu();

		/**
		 * The meta object literal for the '<em><b>Allocated Gen Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ECU__ALLOCATED_GEN_TASKS = eINSTANCE.getGenECU_AllocatedGenTasks();

		/**
		 * The meta object literal for the '{@link org.muml.psm.codegen.impl.GenTaskImpl <em>Gen Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.codegen.impl.GenTaskImpl
		 * @see org.muml.psm.codegen.impl.CodegenPackageImpl#getGenTask()
		 * @generated
		 */
		EClass GEN_TASK = eINSTANCE.getGenTask();

		/**
		 * The meta object literal for the '<em><b>Gen Component Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_TASK__GEN_COMPONENT_INSTANCES = eINSTANCE.getGenTask_GenComponentInstances();

		/**
		 * The meta object literal for the '{@link org.muml.psm.codegen.impl.GenSystemImpl <em>Gen System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.codegen.impl.GenSystemImpl
		 * @see org.muml.psm.codegen.impl.CodegenPackageImpl#getGenSystem()
		 * @generated
		 */
		EClass GEN_SYSTEM = eINSTANCE.getGenSystem();

		/**
		 * The meta object literal for the '<em><b>Gen EC Us</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SYSTEM__GEN_EC_US = eINSTANCE.getGenSystem_GenECUs();

		/**
		 * The meta object literal for the '<em><b>Cic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SYSTEM__CIC = eINSTANCE.getGenSystem_Cic();

		/**
		 * The meta object literal for the '<em><b>Hpic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SYSTEM__HPIC = eINSTANCE.getGenSystem_Hpic();

	}

} //CodegenPackage
