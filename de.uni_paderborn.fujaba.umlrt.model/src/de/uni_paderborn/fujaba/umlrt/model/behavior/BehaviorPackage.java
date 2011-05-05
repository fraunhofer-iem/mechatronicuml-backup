/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.behavior;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;

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
	int PROTOCOL_STATECHART__ANNOTATION = CorePackage.ABSTRACT_REALTIME_STATECHART__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__EXTENSION = CorePackage.ABSTRACT_REALTIME_STATECHART__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__NAME = CorePackage.ABSTRACT_REALTIME_STATECHART__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__COMMENT = CorePackage.ABSTRACT_REALTIME_STATECHART__COMMENT;

	/**
	 * The feature id for the '<em><b>Event Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__EVENT_QUEUE_SIZE = CorePackage.ABSTRACT_REALTIME_STATECHART__EVENT_QUEUE_SIZE;

	/**
	 * The feature id for the '<em><b>Wcet Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__WCET_DOCUMENT = CorePackage.ABSTRACT_REALTIME_STATECHART__WCET_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__SECURITY_LEVEL = CorePackage.ABSTRACT_REALTIME_STATECHART__SECURITY_LEVEL;

	/**
	 * The feature id for the '<em><b>System Wcet Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__SYSTEM_WCET_MAP = CorePackage.ABSTRACT_REALTIME_STATECHART__SYSTEM_WCET_MAP;

	/**
	 * The feature id for the '<em><b>Utilisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__UTILISATION = CorePackage.ABSTRACT_REALTIME_STATECHART__UTILISATION;

	/**
	 * The feature id for the '<em><b>Schedule Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__SCHEDULE_DOCUMENT = CorePackage.ABSTRACT_REALTIME_STATECHART__SCHEDULE_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__TRANSITIONS = CorePackage.ABSTRACT_REALTIME_STATECHART__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__VERTICES = CorePackage.ABSTRACT_REALTIME_STATECHART__VERTICES;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__ECLASS = CorePackage.ABSTRACT_REALTIME_STATECHART__ECLASS;

	/**
	 * The feature id for the '<em><b>Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__BEHAVIORAL_ELEMENT = CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__EMBEDDED = CorePackage.ABSTRACT_REALTIME_STATECHART__EMBEDDED;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__CLOCKS = CorePackage.ABSTRACT_REALTIME_STATECHART__CLOCKS;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART__PORT = CorePackage.ABSTRACT_REALTIME_STATECHART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Protocol Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART_FEATURE_COUNT = CorePackage.ABSTRACT_REALTIME_STATECHART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ECLASS = CorePackage.ABSTRACT_REALTIME_STATECHART___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___EIS_PROXY = CorePackage.ABSTRACT_REALTIME_STATECHART___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ERESOURCE = CorePackage.ABSTRACT_REALTIME_STATECHART___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ECONTAINER = CorePackage.ABSTRACT_REALTIME_STATECHART___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ECONTAINING_FEATURE = CorePackage.ABSTRACT_REALTIME_STATECHART___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ECONTAINMENT_FEATURE = CorePackage.ABSTRACT_REALTIME_STATECHART___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ECONTENTS = CorePackage.ABSTRACT_REALTIME_STATECHART___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___EALL_CONTENTS = CorePackage.ABSTRACT_REALTIME_STATECHART___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ECROSS_REFERENCES = CorePackage.ABSTRACT_REALTIME_STATECHART___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___EGET__ESTRUCTURALFEATURE = CorePackage.ABSTRACT_REALTIME_STATECHART___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.ABSTRACT_REALTIME_STATECHART___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.ABSTRACT_REALTIME_STATECHART___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___EIS_SET__ESTRUCTURALFEATURE = CorePackage.ABSTRACT_REALTIME_STATECHART___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___EUNSET__ESTRUCTURALFEATURE = CorePackage.ABSTRACT_REALTIME_STATECHART___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___EINVOKE__EOPERATION_ELIST = CorePackage.ABSTRACT_REALTIME_STATECHART___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___GET_EXTENSION__ECLASS = CorePackage.ABSTRACT_REALTIME_STATECHART___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___PROVIDE_EXTENSION__ECLASS = CorePackage.ABSTRACT_REALTIME_STATECHART___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___GET_ANNOTATION__STRING = CorePackage.ABSTRACT_REALTIME_STATECHART___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___PROVIDE_ANNOTATION__STRING = CorePackage.ABSTRACT_REALTIME_STATECHART___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Highest Parent Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___GET_HIGHEST_PARENT_STATECHART = CorePackage.ABSTRACT_REALTIME_STATECHART___GET_HIGHEST_PARENT_STATECHART;

	/**
	 * The operation id for the '<em>Add All UML Realtime States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN = CorePackage.ABSTRACT_REALTIME_STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN;

	/**
	 * The operation id for the '<em>Add Complex UML Realtime States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET = CorePackage.ABSTRACT_REALTIME_STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET;

	/**
	 * The operation id for the '<em>Add All UML Realtime Transitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET = CorePackage.ABSTRACT_REALTIME_STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET;

	/**
	 * The operation id for the '<em>Iterator Of All UML Clocks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN = CorePackage.ABSTRACT_REALTIME_STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN;

	/**
	 * The operation id for the '<em>Add All UML Clocks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN = CorePackage.ABSTRACT_REALTIME_STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___TO_STRING = CorePackage.ABSTRACT_REALTIME_STATECHART___TO_STRING;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___CLONE = CorePackage.ABSTRACT_REALTIME_STATECHART___CLONE;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART___CLONE__ABSTRACTREALTIMESTATECHART = CorePackage.ABSTRACT_REALTIME_STATECHART_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Protocol Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATECHART_OPERATION_COUNT = CorePackage.ABSTRACT_REALTIME_STATECHART_OPERATION_COUNT + 1;


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
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.behavior.ProtocolStatechart#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.behavior.ProtocolStatechart#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart)
	 * @generated
	 */
	EOperation getProtocolStatechart__Clone__AbstractRealtimeStatechart();

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
		EOperation PROTOCOL_STATECHART___CLONE__ABSTRACTREALTIMESTATECHART = eINSTANCE.getProtocolStatechart__Clone__AbstractRealtimeStatechart();

	}

} //BehaviorPackage
