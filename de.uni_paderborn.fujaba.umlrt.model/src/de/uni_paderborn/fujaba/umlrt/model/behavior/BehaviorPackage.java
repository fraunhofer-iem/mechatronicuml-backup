/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.behavior;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see de.uni_paderborn.fujaba.umlrt.model.behavior.BehaviorFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/uni_paderborn/fujaba/umlrt/model/behavior";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behavior";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorPackage eINSTANCE = de.uni_paderborn.fujaba.umlrt.model.behavior.impl.BehaviorPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.behavior.impl.ProtocolStatechartImpl <em>Protocol Statechart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.behavior.impl.ProtocolStatechartImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.behavior.impl.BehaviorPackageImpl#getProtocolStatechart()
	 * @generated
	 */
	int PROTOCOL_STATECHART = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__ANNOTATION = RealtimestatechartPackage.UML_REALTIME_STATECHART__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__EXTENSION = RealtimestatechartPackage.UML_REALTIME_STATECHART__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__NAME = RealtimestatechartPackage.UML_REALTIME_STATECHART__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__COMMENT = RealtimestatechartPackage.UML_REALTIME_STATECHART__COMMENT;

	/**
	 * The feature id for the '<em><b>Event Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__EVENT_QUEUE_SIZE = RealtimestatechartPackage.UML_REALTIME_STATECHART__EVENT_QUEUE_SIZE;

	/**
	 * The feature id for the '<em><b>Wcet Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__WCET_DOCUMENT = RealtimestatechartPackage.UML_REALTIME_STATECHART__WCET_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__SECURITY_LEVEL = RealtimestatechartPackage.UML_REALTIME_STATECHART__SECURITY_LEVEL;

	/**
	 * The feature id for the '<em><b>System Wcet Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__SYSTEM_WCET_MAP = RealtimestatechartPackage.UML_REALTIME_STATECHART__SYSTEM_WCET_MAP;

	/**
	 * The feature id for the '<em><b>Utilisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__UTILISATION = RealtimestatechartPackage.UML_REALTIME_STATECHART__UTILISATION;

	/**
	 * The feature id for the '<em><b>Schedule Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__SCHEDULE_DOCUMENT = RealtimestatechartPackage.UML_REALTIME_STATECHART__SCHEDULE_DOCUMENT;

	/**
	 * The feature id for the '<em><b>UML Realtime Start State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__UML_REALTIME_START_STATE = RealtimestatechartPackage.UML_REALTIME_STATECHART__UML_REALTIME_START_STATE;

	/**
	 * The feature id for the '<em><b>UML Complex Realtime State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__UML_COMPLEX_REALTIME_STATE = RealtimestatechartPackage.UML_REALTIME_STATECHART__UML_COMPLEX_REALTIME_STATE;

	/**
	 * The feature id for the '<em><b>UML Realtime Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__UML_REALTIME_TRANSITIONS = RealtimestatechartPackage.UML_REALTIME_STATECHART__UML_REALTIME_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>UML Realtime States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__UML_REALTIME_STATES = RealtimestatechartPackage.UML_REALTIME_STATECHART__UML_REALTIME_STATES;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__ECLASS = RealtimestatechartPackage.UML_REALTIME_STATECHART__ECLASS;

	/**
	 * The feature id for the '<em><b>UML Interface Statechart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__UML_INTERFACE_STATECHART = RealtimestatechartPackage.UML_REALTIME_STATECHART__UML_INTERFACE_STATECHART;

	/**
	 * The feature id for the '<em><b>Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__BEHAVIORAL_ELEMENT = RealtimestatechartPackage.UML_REALTIME_STATECHART__BEHAVIORAL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Provided Msg IFace</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__PROVIDED_MSG_IFACE = RealtimestatechartPackage.UML_REALTIME_STATECHART__PROVIDED_MSG_IFACE;

	/**
	 * The feature id for the '<em><b>Required Msg IFace</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__REQUIRED_MSG_IFACE = RealtimestatechartPackage.UML_REALTIME_STATECHART__REQUIRED_MSG_IFACE;

	/**
	 * The feature id for the '<em><b>Is Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__IS_EMBEDDED = RealtimestatechartPackage.UML_REALTIME_STATECHART__IS_EMBEDDED;

	/**
	 * The feature id for the '<em><b>UML Clocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__UML_CLOCKS = RealtimestatechartPackage.UML_REALTIME_STATECHART__UML_CLOCKS;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__PORT = RealtimestatechartPackage.UML_REALTIME_STATECHART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Protocol Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART_FEATURE_COUNT = RealtimestatechartPackage.UML_REALTIME_STATECHART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ECLASS = RealtimestatechartPackage.UML_REALTIME_STATECHART___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___EIS_PROXY = RealtimestatechartPackage.UML_REALTIME_STATECHART___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ERESOURCE = RealtimestatechartPackage.UML_REALTIME_STATECHART___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ECONTAINER = RealtimestatechartPackage.UML_REALTIME_STATECHART___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ECONTAINING_FEATURE = RealtimestatechartPackage.UML_REALTIME_STATECHART___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ECONTAINMENT_FEATURE = RealtimestatechartPackage.UML_REALTIME_STATECHART___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ECONTENTS = RealtimestatechartPackage.UML_REALTIME_STATECHART___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___EALL_CONTENTS = RealtimestatechartPackage.UML_REALTIME_STATECHART___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ECROSS_REFERENCES = RealtimestatechartPackage.UML_REALTIME_STATECHART___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___EGET__ESTRUCTURALFEATURE = RealtimestatechartPackage.UML_REALTIME_STATECHART___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___EGET__ESTRUCTURALFEATURE_BOOLEAN = RealtimestatechartPackage.UML_REALTIME_STATECHART___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ESET__ESTRUCTURALFEATURE_OBJECT = RealtimestatechartPackage.UML_REALTIME_STATECHART___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___EIS_SET__ESTRUCTURALFEATURE = RealtimestatechartPackage.UML_REALTIME_STATECHART___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___EUNSET__ESTRUCTURALFEATURE = RealtimestatechartPackage.UML_REALTIME_STATECHART___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___EINVOKE__EOPERATION_ELIST = RealtimestatechartPackage.UML_REALTIME_STATECHART___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___GET_EXTENSION__ECLASS = RealtimestatechartPackage.UML_REALTIME_STATECHART___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___PROVIDE_EXTENSION__ECLASS = RealtimestatechartPackage.UML_REALTIME_STATECHART___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___GET_ANNOTATION__STRING = RealtimestatechartPackage.UML_REALTIME_STATECHART___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___PROVIDE_ANNOTATION__STRING = RealtimestatechartPackage.UML_REALTIME_STATECHART___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Highest Parent Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___GET_HIGHEST_PARENT_STATECHART = RealtimestatechartPackage.UML_REALTIME_STATECHART___GET_HIGHEST_PARENT_STATECHART;

	/**
	 * The operation id for the '<em>Iterator Of All Sub Realtime Statecharts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ITERATOR_OF_ALL_SUB_REALTIME_STATECHARTS = RealtimestatechartPackage.UML_REALTIME_STATECHART___ITERATOR_OF_ALL_SUB_REALTIME_STATECHARTS;

	/**
	 * The operation id for the '<em>Add All UML Realtime States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN = RealtimestatechartPackage.UML_REALTIME_STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN;

	/**
	 * The operation id for the '<em>Add Complex UML Realtime States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET = RealtimestatechartPackage.UML_REALTIME_STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET;

	/**
	 * The operation id for the '<em>Add All UML Realtime Transitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET = RealtimestatechartPackage.UML_REALTIME_STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET;

	/**
	 * The operation id for the '<em>Iterator Of All UML Clocks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN = RealtimestatechartPackage.UML_REALTIME_STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN;

	/**
	 * The operation id for the '<em>Add All UML Clocks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN = RealtimestatechartPackage.UML_REALTIME_STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___TO_STRING = RealtimestatechartPackage.UML_REALTIME_STATECHART___TO_STRING;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___CLONE = RealtimestatechartPackage.UML_REALTIME_STATECHART___CLONE;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___CLONE__UMLREALTIMESTATECHART = RealtimestatechartPackage.UML_REALTIME_STATECHART_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Protocol Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART_OPERATION_COUNT = RealtimestatechartPackage.UML_REALTIME_STATECHART_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.behavior.ProtocolStatechart <em>Protocol Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.behavior.ProtocolStatechart
	 * @generated
	 */
	EClass getProtocolStatechart();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.behavior.ProtocolStatechart#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.behavior.ProtocolStatechart#getPort()
	 * @see #getProtocolStatechart()
	 * @generated
	 */
	EReference getProtocolStatechart_Port();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.behavior.ProtocolStatechart#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.behavior.ProtocolStatechart#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart)
	 * @generated
	 */
	EOperation getProtocolStatechart__Clone__UMLRealtimeStatechart();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviorFactory getBehaviorFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.behavior.impl.ProtocolStatechartImpl <em>Protocol Statechart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.behavior.impl.ProtocolStatechartImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.behavior.impl.BehaviorPackageImpl#getProtocolStatechart()
		 * @generated
		 */
		EClass PROTOCOL_STATECHART = eINSTANCE.getProtocolStatechart();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_STATECHART__PORT = eINSTANCE.getProtocolStatechart_Port();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROTOCOL_STATECHART___CLONE__UMLREALTIMESTATECHART = eINSTANCE.getProtocolStatechart__Clone__UMLRealtimeStatechart();

	}

} //BehaviorPackage
