/**
 */
package de.uni_paderborn.fujaba.muml.psm.cicmapping;

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
 * <!-- begin-model-doc -->
 * Describes the Mapping of continous component instances to sensors and actuators.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.CicmappingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface CicmappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cicmapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/psm/cic,apping/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cicmapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CicmappingPackage eINSTANCE = de.uni_paderborn.fujaba.muml.psm.cicmapping.impl.CicmappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.psm.cicmapping.impl.CICSystemMappingImpl <em>CIC System Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.impl.CICSystemMappingImpl
	 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.impl.CicmappingPackageImpl#getCICSystemMapping()
	 * @generated
	 */
	int CIC_SYSTEM_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_SYSTEM_MAPPING__MAPPINGS = 0;

	/**
	 * The number of structural features of the '<em>CIC System Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_SYSTEM_MAPPING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CIC System Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_SYSTEM_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.psm.cicmapping.impl.CICMappingImpl <em>CIC Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.impl.CICMappingImpl
	 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.impl.CicmappingPackageImpl#getCICMapping()
	 * @generated
	 */
	int CIC_MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Cic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_MAPPING__CIC = 0;

	/**
	 * The feature id for the '<em><b>Device Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_MAPPING__DEVICE_INSTANCE = 1;

	/**
	 * The number of structural features of the '<em>CIC Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CIC Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIC_MAPPING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.psm.cicmapping.CICSystemMapping <em>CIC System Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CIC System Mapping</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.CICSystemMapping
	 * @generated
	 */
	EClass getCICSystemMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.psm.cicmapping.CICSystemMapping#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.CICSystemMapping#getMappings()
	 * @see #getCICSystemMapping()
	 * @generated
	 */
	EReference getCICSystemMapping_Mappings();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.psm.cicmapping.CICMapping <em>CIC Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CIC Mapping</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.CICMapping
	 * @generated
	 */
	EClass getCICMapping();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.psm.cicmapping.CICMapping#getCic <em>Cic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cic</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.CICMapping#getCic()
	 * @see #getCICMapping()
	 * @generated
	 */
	EReference getCICMapping_Cic();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.psm.cicmapping.CICMapping#getDeviceInstance <em>Device Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device Instance</em>'.
	 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.CICMapping#getDeviceInstance()
	 * @see #getCICMapping()
	 * @generated
	 */
	EReference getCICMapping_DeviceInstance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CicmappingFactory getCicmappingFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.psm.cicmapping.impl.CICSystemMappingImpl <em>CIC System Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.impl.CICSystemMappingImpl
		 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.impl.CicmappingPackageImpl#getCICSystemMapping()
		 * @generated
		 */
		EClass CIC_SYSTEM_MAPPING = eINSTANCE.getCICSystemMapping();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIC_SYSTEM_MAPPING__MAPPINGS = eINSTANCE.getCICSystemMapping_Mappings();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.psm.cicmapping.impl.CICMappingImpl <em>CIC Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.impl.CICMappingImpl
		 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.impl.CicmappingPackageImpl#getCICMapping()
		 * @generated
		 */
		EClass CIC_MAPPING = eINSTANCE.getCICMapping();

		/**
		 * The meta object literal for the '<em><b>Cic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIC_MAPPING__CIC = eINSTANCE.getCICMapping_Cic();

		/**
		 * The meta object literal for the '<em><b>Device Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIC_MAPPING__DEVICE_INSTANCE = eINSTANCE.getCICMapping_DeviceInstance();

	}

} //CicmappingPackage
