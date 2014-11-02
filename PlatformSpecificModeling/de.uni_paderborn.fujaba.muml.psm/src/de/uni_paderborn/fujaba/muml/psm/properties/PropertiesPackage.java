/**
 */
package de.uni_paderborn.fujaba.muml.psm.properties;

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
 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesFactory
 * @model kind="package"
 * @generated
 */
public interface PropertiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "properties";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/psm/properties/0.4.0/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "properties";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropertiesPackage eINSTANCE = de.uni_paderborn.fujaba.muml.psm.properties.impl.PropertiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.psm.properties.impl.ComponentInstanceExecutionPropertiesImpl <em>Component Instance Execution Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.impl.ComponentInstanceExecutionPropertiesImpl
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.impl.PropertiesPackageImpl#getComponentInstanceExecutionProperties()
	 * @generated
	 */
	int COMPONENT_INSTANCE_EXECUTION_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_EXECUTION_PROPERTIES__COMPONENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Wcet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_EXECUTION_PROPERTIES__WCET = 1;

	/**
	 * The feature id for the '<em><b>Code Mem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_EXECUTION_PROPERTIES__CODE_MEM = 2;

	/**
	 * The feature id for the '<em><b>Ram Mem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_EXECUTION_PROPERTIES__RAM_MEM = 3;

	/**
	 * The number of structural features of the '<em>Component Instance Execution Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_EXECUTION_PROPERTIES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Component Instance Execution Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_EXECUTION_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.psm.properties.impl.WCETpairImpl <em>WCE Tpair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.impl.WCETpairImpl
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.impl.PropertiesPackageImpl#getWCETpair()
	 * @generated
	 */
	int WCE_TPAIR = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCE_TPAIR__AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCE_TPAIR__RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>WCE Tpair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCE_TPAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>WCE Tpair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCE_TPAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.psm.properties.impl.MemoryPairImpl <em>Memory Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.impl.MemoryPairImpl
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.impl.PropertiesPackageImpl#getMemoryPair()
	 * @generated
	 */
	int MEMORY_PAIR = 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PAIR__AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PAIR__RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Memory Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Memory Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PAIR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.psm.properties.ComponentInstanceExecutionProperties <em>Component Instance Execution Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance Execution Properties</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.ComponentInstanceExecutionProperties
	 * @generated
	 */
	EClass getComponentInstanceExecutionProperties();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.psm.properties.ComponentInstanceExecutionProperties#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.ComponentInstanceExecutionProperties#getComponentInstance()
	 * @see #getComponentInstanceExecutionProperties()
	 * @generated
	 */
	EReference getComponentInstanceExecutionProperties_ComponentInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.psm.properties.ComponentInstanceExecutionProperties#getWcet <em>Wcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wcet</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.ComponentInstanceExecutionProperties#getWcet()
	 * @see #getComponentInstanceExecutionProperties()
	 * @generated
	 */
	EReference getComponentInstanceExecutionProperties_Wcet();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.psm.properties.ComponentInstanceExecutionProperties#getCodeMem <em>Code Mem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Mem</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.ComponentInstanceExecutionProperties#getCodeMem()
	 * @see #getComponentInstanceExecutionProperties()
	 * @generated
	 */
	EReference getComponentInstanceExecutionProperties_CodeMem();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.psm.properties.ComponentInstanceExecutionProperties#getRamMem <em>Ram Mem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ram Mem</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.ComponentInstanceExecutionProperties#getRamMem()
	 * @see #getComponentInstanceExecutionProperties()
	 * @generated
	 */
	EReference getComponentInstanceExecutionProperties_RamMem();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.psm.properties.WCETpair <em>WCE Tpair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WCE Tpair</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.WCETpair
	 * @generated
	 */
	EClass getWCETpair();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.psm.properties.WCETpair#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amount</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.WCETpair#getAmount()
	 * @see #getWCETpair()
	 * @generated
	 */
	EReference getWCETpair_Amount();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.psm.properties.WCETpair#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.WCETpair#getResource()
	 * @see #getWCETpair()
	 * @generated
	 */
	EReference getWCETpair_Resource();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.psm.properties.MemoryPair <em>Memory Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Pair</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.MemoryPair
	 * @generated
	 */
	EClass getMemoryPair();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.psm.properties.MemoryPair#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amount</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.MemoryPair#getAmount()
	 * @see #getMemoryPair()
	 * @generated
	 */
	EReference getMemoryPair_Amount();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.psm.properties.MemoryPair#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.MemoryPair#getResource()
	 * @see #getMemoryPair()
	 * @generated
	 */
	EReference getMemoryPair_Resource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PropertiesFactory getPropertiesFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.psm.properties.impl.ComponentInstanceExecutionPropertiesImpl <em>Component Instance Execution Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.psm.properties.impl.ComponentInstanceExecutionPropertiesImpl
		 * @see de.uni_paderborn.fujaba.muml.psm.properties.impl.PropertiesPackageImpl#getComponentInstanceExecutionProperties()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE_EXECUTION_PROPERTIES = eINSTANCE.getComponentInstanceExecutionProperties();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_EXECUTION_PROPERTIES__COMPONENT_INSTANCE = eINSTANCE.getComponentInstanceExecutionProperties_ComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Wcet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_EXECUTION_PROPERTIES__WCET = eINSTANCE.getComponentInstanceExecutionProperties_Wcet();

		/**
		 * The meta object literal for the '<em><b>Code Mem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_EXECUTION_PROPERTIES__CODE_MEM = eINSTANCE.getComponentInstanceExecutionProperties_CodeMem();

		/**
		 * The meta object literal for the '<em><b>Ram Mem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_EXECUTION_PROPERTIES__RAM_MEM = eINSTANCE.getComponentInstanceExecutionProperties_RamMem();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.psm.properties.impl.WCETpairImpl <em>WCE Tpair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.psm.properties.impl.WCETpairImpl
		 * @see de.uni_paderborn.fujaba.muml.psm.properties.impl.PropertiesPackageImpl#getWCETpair()
		 * @generated
		 */
		EClass WCE_TPAIR = eINSTANCE.getWCETpair();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCE_TPAIR__AMOUNT = eINSTANCE.getWCETpair_Amount();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCE_TPAIR__RESOURCE = eINSTANCE.getWCETpair_Resource();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.psm.properties.impl.MemoryPairImpl <em>Memory Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.psm.properties.impl.MemoryPairImpl
		 * @see de.uni_paderborn.fujaba.muml.psm.properties.impl.PropertiesPackageImpl#getMemoryPair()
		 * @generated
		 */
		EClass MEMORY_PAIR = eINSTANCE.getMemoryPair();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_PAIR__AMOUNT = eINSTANCE.getMemoryPair_Amount();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_PAIR__RESOURCE = eINSTANCE.getMemoryPair_Resource();

	}

} //PropertiesPackage
