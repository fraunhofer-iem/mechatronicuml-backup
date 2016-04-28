/**
 */
package org.muml.psm.allocation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.mumlcore.CorePackage;

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
 * This package provides the model elements to allocate a ComponentInstanceConfiguration to a HarwarePlatformInstanceConfiguration.
 * <!-- end-model-doc -->
 * @see org.muml.psm.allocation.AllocationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface AllocationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "allocation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/psm/allocation/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "allocation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AllocationPackage eINSTANCE = org.muml.psm.allocation.impl.AllocationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.impl.SystemAllocationImpl <em>System Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.impl.SystemAllocationImpl
	 * @see org.muml.psm.allocation.impl.AllocationPackageImpl#getSystemAllocation()
	 * @generated
	 */
	int SYSTEM_ALLOCATION = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ALLOCATION__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ALLOCATION__ALLOCATIONS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ALLOCATION__CIC = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hpic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ALLOCATION__HPIC = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assembly Connector Instance Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ALLOCATION__ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATIONS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>System Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ALLOCATION_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ALLOCATION___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>System Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ALLOCATION_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.impl.AllocationImpl <em>Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.impl.AllocationImpl
	 * @see org.muml.psm.allocation.impl.AllocationPackageImpl#getAllocation()
	 * @generated
	 */
	int ALLOCATION = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__COMPONENT_INSTANCE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__RESOURCE_INSTANCE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.muml.psm.allocation.impl.AssemblyConnectorInstanceAllocationImpl <em>Assembly Connector Instance Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.allocation.impl.AssemblyConnectorInstanceAllocationImpl
	 * @see org.muml.psm.allocation.impl.AllocationPackageImpl#getAssemblyConnectorInstanceAllocation()
	 * @generated
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION = 2;

	/**
	 * The feature id for the '<em><b>Assembly Connector Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION__ASSEMBLY_CONNECTOR_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Network Connector Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION__NETWORK_CONNECTOR_INSTANCE = 1;

	/**
	 * The number of structural features of the '<em>Assembly Connector Instance Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Assembly Connector Instance Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.SystemAllocation <em>System Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Allocation</em>'.
	 * @see org.muml.psm.allocation.SystemAllocation
	 * @generated
	 */
	EClass getSystemAllocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.allocation.SystemAllocation#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocations</em>'.
	 * @see org.muml.psm.allocation.SystemAllocation#getAllocations()
	 * @see #getSystemAllocation()
	 * @generated
	 */
	EReference getSystemAllocation_Allocations();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.allocation.SystemAllocation#getCic <em>Cic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cic</em>'.
	 * @see org.muml.psm.allocation.SystemAllocation#getCic()
	 * @see #getSystemAllocation()
	 * @generated
	 */
	EReference getSystemAllocation_Cic();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.allocation.SystemAllocation#getHpic <em>Hpic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hpic</em>'.
	 * @see org.muml.psm.allocation.SystemAllocation#getHpic()
	 * @see #getSystemAllocation()
	 * @generated
	 */
	EReference getSystemAllocation_Hpic();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.psm.allocation.SystemAllocation#getAssemblyConnectorInstanceAllocations <em>Assembly Connector Instance Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assembly Connector Instance Allocations</em>'.
	 * @see org.muml.psm.allocation.SystemAllocation#getAssemblyConnectorInstanceAllocations()
	 * @see #getSystemAllocation()
	 * @generated
	 */
	EReference getSystemAllocation_AssemblyConnectorInstanceAllocations();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation</em>'.
	 * @see org.muml.psm.allocation.Allocation
	 * @generated
	 */
	EClass getAllocation();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.allocation.Allocation#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance</em>'.
	 * @see org.muml.psm.allocation.Allocation#getComponentInstance()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_ComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.allocation.Allocation#getResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Instance</em>'.
	 * @see org.muml.psm.allocation.Allocation#getResourceInstance()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_ResourceInstance();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.allocation.AssemblyConnectorInstanceAllocation <em>Assembly Connector Instance Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Connector Instance Allocation</em>'.
	 * @see org.muml.psm.allocation.AssemblyConnectorInstanceAllocation
	 * @generated
	 */
	EClass getAssemblyConnectorInstanceAllocation();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.allocation.AssemblyConnectorInstanceAllocation#getAssemblyConnectorInstance <em>Assembly Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Connector Instance</em>'.
	 * @see org.muml.psm.allocation.AssemblyConnectorInstanceAllocation#getAssemblyConnectorInstance()
	 * @see #getAssemblyConnectorInstanceAllocation()
	 * @generated
	 */
	EReference getAssemblyConnectorInstanceAllocation_AssemblyConnectorInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.allocation.AssemblyConnectorInstanceAllocation#getNetworkConnectorInstance <em>Network Connector Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network Connector Instance</em>'.
	 * @see org.muml.psm.allocation.AssemblyConnectorInstanceAllocation#getNetworkConnectorInstance()
	 * @see #getAssemblyConnectorInstanceAllocation()
	 * @generated
	 */
	EReference getAssemblyConnectorInstanceAllocation_NetworkConnectorInstance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AllocationFactory getAllocationFactory();

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
		 * The meta object literal for the '{@link org.muml.psm.allocation.impl.SystemAllocationImpl <em>System Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.impl.SystemAllocationImpl
		 * @see org.muml.psm.allocation.impl.AllocationPackageImpl#getSystemAllocation()
		 * @generated
		 */
		EClass SYSTEM_ALLOCATION = eINSTANCE.getSystemAllocation();

		/**
		 * The meta object literal for the '<em><b>Allocations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ALLOCATION__ALLOCATIONS = eINSTANCE.getSystemAllocation_Allocations();

		/**
		 * The meta object literal for the '<em><b>Cic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ALLOCATION__CIC = eINSTANCE.getSystemAllocation_Cic();

		/**
		 * The meta object literal for the '<em><b>Hpic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ALLOCATION__HPIC = eINSTANCE.getSystemAllocation_Hpic();

		/**
		 * The meta object literal for the '<em><b>Assembly Connector Instance Allocations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ALLOCATION__ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATIONS = eINSTANCE.getSystemAllocation_AssemblyConnectorInstanceAllocations();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.impl.AllocationImpl <em>Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.impl.AllocationImpl
		 * @see org.muml.psm.allocation.impl.AllocationPackageImpl#getAllocation()
		 * @generated
		 */
		EClass ALLOCATION = eINSTANCE.getAllocation();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__COMPONENT_INSTANCE = eINSTANCE.getAllocation_ComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Resource Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__RESOURCE_INSTANCE = eINSTANCE.getAllocation_ResourceInstance();

		/**
		 * The meta object literal for the '{@link org.muml.psm.allocation.impl.AssemblyConnectorInstanceAllocationImpl <em>Assembly Connector Instance Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.allocation.impl.AssemblyConnectorInstanceAllocationImpl
		 * @see org.muml.psm.allocation.impl.AllocationPackageImpl#getAssemblyConnectorInstanceAllocation()
		 * @generated
		 */
		EClass ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION = eINSTANCE.getAssemblyConnectorInstanceAllocation();

		/**
		 * The meta object literal for the '<em><b>Assembly Connector Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION__ASSEMBLY_CONNECTOR_INSTANCE = eINSTANCE.getAssemblyConnectorInstanceAllocation_AssemblyConnectorInstance();

		/**
		 * The meta object literal for the '<em><b>Network Connector Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR_INSTANCE_ALLOCATION__NETWORK_CONNECTOR_INSTANCE = eINSTANCE.getAssemblyConnectorInstanceAllocation_NetworkConnectorInstance();

	}

} //AllocationPackage
