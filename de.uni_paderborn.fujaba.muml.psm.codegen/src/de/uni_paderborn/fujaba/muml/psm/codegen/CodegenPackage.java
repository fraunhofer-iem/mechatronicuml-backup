/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenFactory
 * @model kind="package"
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
	String eNS_URI = "http://www.fujaba.de/muml/psm/codegen/0.1.0";

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
	CodegenPackage eINSTANCE = de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodegenPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.psm.codegen.impl.RefinedAtomicComponentInstanceImpl <em>Refined Atomic Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.impl.RefinedAtomicComponentInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodegenPackageImpl#getRefinedAtomicComponentInstance()
	 * @generated
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE__ANNOTATION = InstancePackage.ATOMIC_COMPONENT_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE__EXTENSION = InstancePackage.ATOMIC_COMPONENT_INSTANCE__EXTENSION;

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
	 * The feature id for the '<em><b>Allocated Resource Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE = InstancePackage.ATOMIC_COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Refined Atomic Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE_FEATURE_COUNT = InstancePackage.ATOMIC_COMPONENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___ECLASS = InstancePackage.ATOMIC_COMPONENT_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___EIS_PROXY = InstancePackage.ATOMIC_COMPONENT_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___ERESOURCE = InstancePackage.ATOMIC_COMPONENT_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___ECONTAINER = InstancePackage.ATOMIC_COMPONENT_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___ECONTAINING_FEATURE = InstancePackage.ATOMIC_COMPONENT_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___ECONTAINMENT_FEATURE = InstancePackage.ATOMIC_COMPONENT_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___ECONTENTS = InstancePackage.ATOMIC_COMPONENT_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___EALL_CONTENTS = InstancePackage.ATOMIC_COMPONENT_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___ECROSS_REFERENCES = InstancePackage.ATOMIC_COMPONENT_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE = InstancePackage.ATOMIC_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = InstancePackage.ATOMIC_COMPONENT_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = InstancePackage.ATOMIC_COMPONENT_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = InstancePackage.ATOMIC_COMPONENT_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___EUNSET__ESTRUCTURALFEATURE = InstancePackage.ATOMIC_COMPONENT_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___EINVOKE__EOPERATION_ELIST = InstancePackage.ATOMIC_COMPONENT_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___GET_EXTENSION__ECLASS = InstancePackage.ATOMIC_COMPONENT_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___PROVIDE_EXTENSION__ECLASS = InstancePackage.ATOMIC_COMPONENT_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___GET_ANNOTATION__STRING = InstancePackage.ATOMIC_COMPONENT_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE___PROVIDE_ANNOTATION__STRING = InstancePackage.ATOMIC_COMPONENT_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Refined Atomic Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ATOMIC_COMPONENT_INSTANCE_OPERATION_COUNT = InstancePackage.ATOMIC_COMPONENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.psm.codegen.impl.RefindedStructuredResourceInstanceImpl <em>Refinded Structured Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.impl.RefindedStructuredResourceInstanceImpl
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodegenPackageImpl#getRefindedStructuredResourceInstance()
	 * @generated
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE__ANNOTATION = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE__EXTENSION = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE__NAME = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE__RESOURCE_TYPE = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Hwports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE__HWPORTS = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__HWPORTS;

	/**
	 * The feature id for the '<em><b>Embedded Atomic Resource Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Allocated Atomic Component Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocated Structured Resource Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_STRUCTURED_RESOURCE_INSTANCE = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Refinded Structured Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE_FEATURE_COUNT = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___ECLASS = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___EIS_PROXY = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___ERESOURCE = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___ECONTAINER = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___ECONTAINING_FEATURE = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___ECONTAINMENT_FEATURE = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___ECONTENTS = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___EALL_CONTENTS = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___ECROSS_REFERENCES = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___EUNSET__ESTRUCTURALFEATURE = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___EINVOKE__EOPERATION_ELIST = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___PROVIDE_EXTENSION__ECLASS = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___GET_ANNOTATION__STRING = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE___PROVIDE_ANNOTATION__STRING = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Refinded Structured Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINDED_STRUCTURED_RESOURCE_INSTANCE_OPERATION_COUNT = HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodGenAllocationImpl <em>Cod Gen Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodGenAllocationImpl
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodegenPackageImpl#getCodGenAllocation()
	 * @generated
	 */
	int COD_GEN_ALLOCATION = 2;

	/**
	 * The feature id for the '<em><b>Hpic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COD_GEN_ALLOCATION__HPIC = 0;

	/**
	 * The feature id for the '<em><b>Cic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COD_GEN_ALLOCATION__CIC = 1;

	/**
	 * The number of structural features of the '<em>Cod Gen Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COD_GEN_ALLOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cod Gen Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COD_GEN_ALLOCATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.psm.codegen.RefinedAtomicComponentInstance <em>Refined Atomic Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refined Atomic Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.RefinedAtomicComponentInstance
	 * @generated
	 */
	EClass getRefinedAtomicComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.psm.codegen.RefinedAtomicComponentInstance#getAllocatedResourceInstance <em>Allocated Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocated Resource Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.RefinedAtomicComponentInstance#getAllocatedResourceInstance()
	 * @see #getRefinedAtomicComponentInstance()
	 * @generated
	 */
	EReference getRefinedAtomicComponentInstance_AllocatedResourceInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.psm.codegen.RefindedStructuredResourceInstance <em>Refinded Structured Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinded Structured Resource Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.RefindedStructuredResourceInstance
	 * @generated
	 */
	EClass getRefindedStructuredResourceInstance();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.psm.codegen.RefindedStructuredResourceInstance#getAllocatedAtomicComponentInstances <em>Allocated Atomic Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Atomic Component Instances</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.RefindedStructuredResourceInstance#getAllocatedAtomicComponentInstances()
	 * @see #getRefindedStructuredResourceInstance()
	 * @generated
	 */
	EReference getRefindedStructuredResourceInstance_AllocatedAtomicComponentInstances();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.psm.codegen.RefindedStructuredResourceInstance#getAllocatedStructuredResourceInstance <em>Allocated Structured Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocated Structured Resource Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.RefindedStructuredResourceInstance#getAllocatedStructuredResourceInstance()
	 * @see #getRefindedStructuredResourceInstance()
	 * @generated
	 */
	EReference getRefindedStructuredResourceInstance_AllocatedStructuredResourceInstance();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.psm.codegen.CodGenAllocation <em>Cod Gen Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cod Gen Allocation</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodGenAllocation
	 * @generated
	 */
	EClass getCodGenAllocation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.psm.codegen.CodGenAllocation#getHpic <em>Hpic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hpic</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodGenAllocation#getHpic()
	 * @see #getCodGenAllocation()
	 * @generated
	 */
	EReference getCodGenAllocation_Hpic();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.psm.codegen.CodGenAllocation#getCic <em>Cic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cic</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodGenAllocation#getCic()
	 * @see #getCodGenAllocation()
	 * @generated
	 */
	EReference getCodGenAllocation_Cic();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.psm.codegen.impl.RefinedAtomicComponentInstanceImpl <em>Refined Atomic Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.psm.codegen.impl.RefinedAtomicComponentInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodegenPackageImpl#getRefinedAtomicComponentInstance()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.psm.codegen.impl.RefindedStructuredResourceInstanceImpl <em>Refinded Structured Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.psm.codegen.impl.RefindedStructuredResourceInstanceImpl
		 * @see de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodegenPackageImpl#getRefindedStructuredResourceInstance()
		 * @generated
		 */
		EClass REFINDED_STRUCTURED_RESOURCE_INSTANCE = eINSTANCE.getRefindedStructuredResourceInstance();
		/**
		 * The meta object literal for the '<em><b>Allocated Atomic Component Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES = eINSTANCE.getRefindedStructuredResourceInstance_AllocatedAtomicComponentInstances();
		/**
		 * The meta object literal for the '<em><b>Allocated Structured Resource Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_STRUCTURED_RESOURCE_INSTANCE = eINSTANCE.getRefindedStructuredResourceInstance_AllocatedStructuredResourceInstance();
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodGenAllocationImpl <em>Cod Gen Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodGenAllocationImpl
		 * @see de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodegenPackageImpl#getCodGenAllocation()
		 * @generated
		 */
		EClass COD_GEN_ALLOCATION = eINSTANCE.getCodGenAllocation();
		/**
		 * The meta object literal for the '<em><b>Hpic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COD_GEN_ALLOCATION__HPIC = eINSTANCE.getCodGenAllocation_Hpic();
		/**
		 * The meta object literal for the '<em><b>Cic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COD_GEN_ALLOCATION__CIC = eINSTANCE.getCodGenAllocation_Cic();

	}

} //CodegenPackage
