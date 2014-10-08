/**
 */
package de.uni_paderborn.fujaba.modelica.m2t.transform;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.TransformFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface TransformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "transform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/modelica/m2t/transform/0.4.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "transform";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransformPackage eINSTANCE = de.uni_paderborn.fujaba.modelica.m2t.transform.impl.TransformPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.impl.MapImpl
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.impl.TransformPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.impl.RootImpl
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.impl.TransformPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 1;

	/**
	 * The feature id for the '<em><b>Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__MAPS = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.impl.EntryImpl
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.impl.TransformPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.impl.RegionInstanceImpl <em>Region Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.impl.RegionInstanceImpl
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.impl.TransformPackageImpl#getRegionInstance()
	 * @generated
	 */
	int REGION_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_INSTANCE__ANNOTATION = RealtimestatechartPackage.REGION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_INSTANCE__EXTENSION = RealtimestatechartPackage.REGION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_INSTANCE__COMMENT = RealtimestatechartPackage.REGION__COMMENT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_INSTANCE__PRIORITY = RealtimestatechartPackage.REGION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Embedded Statechart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_INSTANCE__EMBEDDED_STATECHART = RealtimestatechartPackage.REGION__EMBEDDED_STATECHART;

	/**
	 * The feature id for the '<em><b>Parent State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_INSTANCE__PARENT_STATE = RealtimestatechartPackage.REGION__PARENT_STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_INSTANCE__NAME = RealtimestatechartPackage.REGION__NAME;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_INSTANCE__INSTANCE_OF = RealtimestatechartPackage.REGION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Embeds Single Port Statechart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_INSTANCE__EMBEDS_SINGLE_PORT_STATECHART = RealtimestatechartPackage.REGION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Embeds Multi Port Statechart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_INSTANCE__EMBEDS_MULTI_PORT_STATECHART = RealtimestatechartPackage.REGION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Region Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_INSTANCE_FEATURE_COUNT = RealtimestatechartPackage.REGION_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.Map#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.Map#getEntries()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Entries();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.Root#getMaps <em>Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Maps</em>'.
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.Root#getMaps()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Maps();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.Entry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.Entry#getKey()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.Entry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.Entry#getValue()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Value();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.RegionInstance <em>Region Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region Instance</em>'.
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.RegionInstance
	 * @generated
	 */
	EClass getRegionInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.RegionInstance#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of</em>'.
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.RegionInstance#getInstanceOf()
	 * @see #getRegionInstance()
	 * @generated
	 */
	EReference getRegionInstance_InstanceOf();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.RegionInstance#isEmbedsSinglePortStatechart <em>Embeds Single Port Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embeds Single Port Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.RegionInstance#isEmbedsSinglePortStatechart()
	 * @see #getRegionInstance()
	 * @generated
	 */
	EAttribute getRegionInstance_EmbedsSinglePortStatechart();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.RegionInstance#isEmbedsMultiPortStatechart <em>Embeds Multi Port Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embeds Multi Port Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.RegionInstance#isEmbedsMultiPortStatechart()
	 * @see #getRegionInstance()
	 * @generated
	 */
	EAttribute getRegionInstance_EmbedsMultiPortStatechart();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransformFactory getTransformFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.impl.MapImpl
		 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.impl.TransformPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__ENTRIES = eINSTANCE.getMap_Entries();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.impl.RootImpl
		 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.impl.TransformPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Maps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__MAPS = eINSTANCE.getRoot_Maps();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.impl.EntryImpl
		 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.impl.TransformPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__KEY = eINSTANCE.getEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__VALUE = eINSTANCE.getEntry_Value();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.modelica.m2t.transform.impl.RegionInstanceImpl <em>Region Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.impl.RegionInstanceImpl
		 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.impl.TransformPackageImpl#getRegionInstance()
		 * @generated
		 */
		EClass REGION_INSTANCE = eINSTANCE.getRegionInstance();

		/**
		 * The meta object literal for the '<em><b>Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION_INSTANCE__INSTANCE_OF = eINSTANCE.getRegionInstance_InstanceOf();

		/**
		 * The meta object literal for the '<em><b>Embeds Single Port Statechart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_INSTANCE__EMBEDS_SINGLE_PORT_STATECHART = eINSTANCE.getRegionInstance_EmbedsSinglePortStatechart();

		/**
		 * The meta object literal for the '<em><b>Embeds Multi Port Statechart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_INSTANCE__EMBEDS_MULTI_PORT_STATECHART = eINSTANCE.getRegionInstance_EmbedsMultiPortStatechart();

	}

} //TransformPackage
