/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.realtimeStatechart;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechartFactory
 * @model kind="package"
 * @generated
 */
public interface RealtimeStatechartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "realtimeStatechart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uni_paderborn/fujaba/umlrt/realtimeStatechart";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "realtimeStatechart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RealtimeStatechartPackage eINSTANCE = de.uni_paderborn.fujaba.umlrt.realtimeStatechart.impl.RealtimeStatechartPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.realtimeStatechart.impl.RealtimeStatechartImpl <em>Realtime Statechart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.realtimeStatechart.impl.RealtimeStatechartImpl
	 * @see de.uni_paderborn.fujaba.umlrt.realtimeStatechart.impl.RealtimeStatechartPackageImpl#getRealtimeStatechart()
	 * @generated
	 */
	int REALTIME_STATECHART = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__ANNOTATION = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__EXTENSION = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__NAME = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__COMMENT = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__COMMENT;

	/**
	 * The feature id for the '<em><b>Wcet Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__WCET_DOCUMENT = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__WCET_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__SECURITY_LEVEL = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__SECURITY_LEVEL;

	/**
	 * The feature id for the '<em><b>System Wcet Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__SYSTEM_WCET_MAP = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__SYSTEM_WCET_MAP;

	/**
	 * The feature id for the '<em><b>Utilisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__UTILISATION = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__UTILISATION;

	/**
	 * The feature id for the '<em><b>Schedule Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__SCHEDULE_DOCUMENT = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__SCHEDULE_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__TRANSITIONS = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__VERTICES = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__VERTICES;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__ECLASS = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__ECLASS;

	/**
	 * The feature id for the '<em><b>Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__BEHAVIORAL_ELEMENT = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__BEHAVIORAL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__EMBEDDED = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDED;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__CLOCKS = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__CLOCKS;

	/**
	 * The feature id for the '<em><b>Available Clocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__AVAILABLE_CLOCKS = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__AVAILABLE_CLOCKS;

	/**
	 * The feature id for the '<em><b>Embedding Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__EMBEDDING_REGION = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__DATA_TYPES = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__DATA_TYPES;

	/**
	 * The number of structural features of the '<em>Realtime Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_FEATURE_COUNT = RealtimestatechartPackage.FUJABA_REALTIME_STATECHART_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart <em>Realtime Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realtime Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart
	 * @generated
	 */
	EClass getRealtimeStatechart();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RealtimeStatechartFactory getRealtimeStatechartFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.realtimeStatechart.impl.RealtimeStatechartImpl <em>Realtime Statechart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.realtimeStatechart.impl.RealtimeStatechartImpl
		 * @see de.uni_paderborn.fujaba.umlrt.realtimeStatechart.impl.RealtimeStatechartPackageImpl#getRealtimeStatechart()
		 * @generated
		 */
		EClass REALTIME_STATECHART = eINSTANCE.getRealtimeStatechart();

	}

} //RealtimeStatechartPackage
