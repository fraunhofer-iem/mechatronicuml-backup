/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.ComponentinstanceconfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentinstanceconfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentinstanceconfiguration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/uni_paderborn/fujaba/umlrt/componentinstanceconfiguration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componentinstanceconfiguration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentinstanceconfigurationPackage eINSTANCE = de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.impl.ComponentinstanceconfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.impl.ComponentInstanceConfigurationImpl <em>Component Instance Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.impl.ComponentInstanceConfigurationImpl
	 * @see de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.impl.ComponentinstanceconfigurationPackageImpl#getComponentInstanceConfiguration()
	 * @generated
	 */
	int COMPONENT_INSTANCE_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Component Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES = 0;

	/**
	 * The number of structural features of the '<em>Component Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.ComponentInstanceConfiguration <em>Component Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance Configuration</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.ComponentInstanceConfiguration
	 * @generated
	 */
	EClass getComponentInstanceConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.ComponentInstanceConfiguration#getComponentInstances <em>Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Instances</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.ComponentInstanceConfiguration#getComponentInstances()
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	EReference getComponentInstanceConfiguration_ComponentInstances();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentinstanceconfigurationFactory getComponentinstanceconfigurationFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.impl.ComponentInstanceConfigurationImpl <em>Component Instance Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.impl.ComponentInstanceConfigurationImpl
		 * @see de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.impl.ComponentinstanceconfigurationPackageImpl#getComponentInstanceConfiguration()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE_CONFIGURATION = eINSTANCE.getComponentInstanceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Component Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES = eINSTANCE.getComponentInstanceConfiguration_ComponentInstances();

	}

} //ComponentinstanceconfigurationPackage
