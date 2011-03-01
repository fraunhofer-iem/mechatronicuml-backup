/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.storydriven.modeling.SDMPackage;

import org.storydriven.modeling.calls.CallsPackage;

import org.storydriven.modeling.expressions.ExpressionsPackage;

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
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartFactory
 * @model kind="package"
 * @generated
 */
public interface RealtimestatechartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "realtimestatechart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/uni_paderborn/fujaba/umlrt/model/realtimestatechart";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "realtimestatechart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RealtimestatechartPackage eINSTANCE = de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DeadlineImpl <em>Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DeadlineImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getDeadline()
	 * @generated
	 */
	int DEADLINE = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE__UPPER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE__LOWER_BOUND = 1;

	/**
	 * The number of structural features of the '<em>Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.AbsoluteDeadlineImpl <em>Absolute Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.AbsoluteDeadlineImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getAbsoluteDeadline()
	 * @generated
	 */
	int ABSOLUTE_DEADLINE = 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_DEADLINE__UPPER_BOUND = DEADLINE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_DEADLINE__LOWER_BOUND = DEADLINE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>UML Realtime Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_DEADLINE__UML_REALTIME_TRANSITION = DEADLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>UML Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_DEADLINE__UML_CLOCK = DEADLINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Absolute Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_DEADLINE_FEATURE_COUNT = DEADLINE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Absolute Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_DEADLINE_OPERATION_COUNT = DEADLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RelativeDeadlineImpl <em>Relative Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RelativeDeadlineImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getRelativeDeadline()
	 * @generated
	 */
	int RELATIVE_DEADLINE = 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_DEADLINE__UPPER_BOUND = DEADLINE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_DEADLINE__LOWER_BOUND = DEADLINE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>UML Realtime Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_DEADLINE__UML_REALTIME_TRANSITION = DEADLINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relative Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_DEADLINE_FEATURE_COUNT = DEADLINE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relative Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_DEADLINE_OPERATION_COUNT = DEADLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLClockImpl <em>UML Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLClockImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLClock()
	 * @generated
	 */
	int UML_CLOCK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLOCK__ID = 0;

	/**
	 * The feature id for the '<em><b>Absolute Deadlines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLOCK__ABSOLUTE_DEADLINES = 1;

	/**
	 * The feature id for the '<em><b>UML Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLOCK__UML_REALTIME_STATECHART = 2;

	/**
	 * The feature id for the '<em><b>Resets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLOCK__RESETS = 3;

	/**
	 * The number of structural features of the '<em>UML Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLOCK_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLOCK___TO_STRING = 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLOCK___CLONE__UMLREALTIMESTATECHART_UMLCLOCK = 1;

	/**
	 * The number of operations of the '<em>UML Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLOCK_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStateImpl <em>UML Realtime State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStateImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeState()
	 * @generated
	 */
	int UML_REALTIME_STATE = 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE__ANNOTATION = SDMPackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE__EXTENSION = SDMPackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE__NAME = SDMPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing UML Realtime Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE__OUTGOING_UML_REALTIME_TRANSITIONS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming UML Realtime Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE__INCOMING_UML_REALTIME_TRANSITIONS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>UML Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE__UML_REALTIME_STATECHART = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>UML Realtime State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___ECLASS = SDMPackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___EIS_PROXY = SDMPackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___ERESOURCE = SDMPackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___ECONTAINER = SDMPackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___ECONTAINING_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___ECONTAINMENT_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___ECONTENTS = SDMPackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___EALL_CONTENTS = SDMPackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___ECROSS_REFERENCES = SDMPackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___EGET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___EUNSET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___EINVOKE__EOPERATION_ELIST = SDMPackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___GET_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___PROVIDE_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___GET_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___PROVIDE_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Long Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___GET_LONG_NAME = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Root Realtime Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE___GET_ROOT_REALTIME_STATECHART = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Realtime State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATE_OPERATION_COUNT = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeComplexStateImpl <em>UML Realtime Complex State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeComplexStateImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeComplexState()
	 * @generated
	 */
	int UML_REALTIME_COMPLEX_STATE = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE__ANNOTATION = UML_REALTIME_STATE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE__EXTENSION = UML_REALTIME_STATE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE__NAME = UML_REALTIME_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing UML Realtime Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE__OUTGOING_UML_REALTIME_TRANSITIONS = UML_REALTIME_STATE__OUTGOING_UML_REALTIME_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming UML Realtime Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE__INCOMING_UML_REALTIME_TRANSITIONS = UML_REALTIME_STATE__INCOMING_UML_REALTIME_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>UML Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE__UML_REALTIME_STATECHART = UML_REALTIME_STATE__UML_REALTIME_STATECHART;

	/**
	 * The feature id for the '<em><b>UML Realtime Statecharts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE__UML_REALTIME_STATECHARTS = UML_REALTIME_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Do Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE__DO_ACTION = UML_REALTIME_STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exit Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE__EXIT_ACTION = UML_REALTIME_STATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entry Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE__ENTRY_ACTION = UML_REALTIME_STATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reconf Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE__RECONF_DIAGRAM = UML_REALTIME_STATE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Interfaced States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE__INTERFACED_STATES = UML_REALTIME_STATE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interface State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE__INTERFACE_STATE = UML_REALTIME_STATE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE__INVARIANTS = UML_REALTIME_STATE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Committed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE__COMMITTED = UML_REALTIME_STATE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE__CHANNELS = UML_REALTIME_STATE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>UML Realtime Complex State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE_FEATURE_COUNT = UML_REALTIME_STATE_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___ECLASS = UML_REALTIME_STATE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___EIS_PROXY = UML_REALTIME_STATE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___ERESOURCE = UML_REALTIME_STATE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___ECONTAINER = UML_REALTIME_STATE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___ECONTAINING_FEATURE = UML_REALTIME_STATE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___ECONTAINMENT_FEATURE = UML_REALTIME_STATE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___ECONTENTS = UML_REALTIME_STATE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___EALL_CONTENTS = UML_REALTIME_STATE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___ECROSS_REFERENCES = UML_REALTIME_STATE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___EGET__ESTRUCTURALFEATURE = UML_REALTIME_STATE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___EGET__ESTRUCTURALFEATURE_BOOLEAN = UML_REALTIME_STATE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___ESET__ESTRUCTURALFEATURE_OBJECT = UML_REALTIME_STATE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___EIS_SET__ESTRUCTURALFEATURE = UML_REALTIME_STATE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___EUNSET__ESTRUCTURALFEATURE = UML_REALTIME_STATE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___EINVOKE__EOPERATION_ELIST = UML_REALTIME_STATE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___GET_EXTENSION__ECLASS = UML_REALTIME_STATE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___PROVIDE_EXTENSION__ECLASS = UML_REALTIME_STATE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___GET_ANNOTATION__STRING = UML_REALTIME_STATE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___PROVIDE_ANNOTATION__STRING = UML_REALTIME_STATE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Long Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___GET_LONG_NAME = UML_REALTIME_STATE___GET_LONG_NAME;

	/**
	 * The operation id for the '<em>Get Root Realtime Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___GET_ROOT_REALTIME_STATECHART = UML_REALTIME_STATE___GET_ROOT_REALTIME_STATECHART;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE___CLONE__UMLREALTIMESTATECHART_UMLREALTIMECOMPLEXSTATE = UML_REALTIME_STATE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>UML Realtime Complex State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_COMPLEX_STATE_OPERATION_COUNT = UML_REALTIME_STATE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStatechartImpl <em>UML Realtime Statechart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStatechartImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeStatechart()
	 * @generated
	 */
	int UML_REALTIME_STATECHART = 13;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__ANNOTATION = SDMPackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__EXTENSION = SDMPackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__NAME = SDMPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__COMMENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__EVENT_QUEUE_SIZE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wcet Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__WCET_DOCUMENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__SECURITY_LEVEL = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>System Wcet Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__SYSTEM_WCET_MAP = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Utilisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__UTILISATION = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Schedule Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__SCHEDULE_DOCUMENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>UML Realtime Start State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__UML_REALTIME_START_STATE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>UML Complex Realtime State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__UML_COMPLEX_REALTIME_STATE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>UML Realtime Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__UML_REALTIME_TRANSITIONS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>UML Realtime States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__UML_REALTIME_STATES = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__ECLASS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>UML Interface Statechart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__UML_INTERFACE_STATECHART = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__BEHAVIORAL_ELEMENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Provided Msg IFace</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__PROVIDED_MSG_IFACE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Required Msg IFace</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__REQUIRED_MSG_IFACE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Is Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__IS_EMBEDDED = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>UML Clocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART__UML_CLOCKS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>UML Realtime Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___ECLASS = SDMPackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___EIS_PROXY = SDMPackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___ERESOURCE = SDMPackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___ECONTAINER = SDMPackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___ECONTAINING_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___ECONTAINMENT_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___ECONTENTS = SDMPackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___EALL_CONTENTS = SDMPackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___ECROSS_REFERENCES = SDMPackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___EGET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___EUNSET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___EINVOKE__EOPERATION_ELIST = SDMPackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___GET_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___PROVIDE_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___GET_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___PROVIDE_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Highest Parent Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___GET_HIGHEST_PARENT_STATECHART = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Iterator Of All Sub Realtime Statecharts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___ITERATOR_OF_ALL_SUB_REALTIME_STATECHARTS = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add All UML Realtime States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Complex UML Realtime States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add All UML Realtime Transitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Iterator Of All UML Clocks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Add All UML Clocks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___TO_STRING = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART___CLONE = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>UML Realtime Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STATECHART_OPERATION_COUNT = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLInterfaceStatechartImpl <em>UML Interface Statechart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLInterfaceStatechartImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLInterfaceStatechart()
	 * @generated
	 */
	int UML_INTERFACE_STATECHART = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__ANNOTATION = UML_REALTIME_STATECHART__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__EXTENSION = UML_REALTIME_STATECHART__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__NAME = UML_REALTIME_STATECHART__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__COMMENT = UML_REALTIME_STATECHART__COMMENT;

	/**
	 * The feature id for the '<em><b>Event Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__EVENT_QUEUE_SIZE = UML_REALTIME_STATECHART__EVENT_QUEUE_SIZE;

	/**
	 * The feature id for the '<em><b>Wcet Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__WCET_DOCUMENT = UML_REALTIME_STATECHART__WCET_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__SECURITY_LEVEL = UML_REALTIME_STATECHART__SECURITY_LEVEL;

	/**
	 * The feature id for the '<em><b>System Wcet Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__SYSTEM_WCET_MAP = UML_REALTIME_STATECHART__SYSTEM_WCET_MAP;

	/**
	 * The feature id for the '<em><b>Utilisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__UTILISATION = UML_REALTIME_STATECHART__UTILISATION;

	/**
	 * The feature id for the '<em><b>Schedule Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__SCHEDULE_DOCUMENT = UML_REALTIME_STATECHART__SCHEDULE_DOCUMENT;

	/**
	 * The feature id for the '<em><b>UML Realtime Start State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__UML_REALTIME_START_STATE = UML_REALTIME_STATECHART__UML_REALTIME_START_STATE;

	/**
	 * The feature id for the '<em><b>UML Complex Realtime State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__UML_COMPLEX_REALTIME_STATE = UML_REALTIME_STATECHART__UML_COMPLEX_REALTIME_STATE;

	/**
	 * The feature id for the '<em><b>UML Realtime Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__UML_REALTIME_TRANSITIONS = UML_REALTIME_STATECHART__UML_REALTIME_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>UML Realtime States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__UML_REALTIME_STATES = UML_REALTIME_STATECHART__UML_REALTIME_STATES;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__ECLASS = UML_REALTIME_STATECHART__ECLASS;

	/**
	 * The feature id for the '<em><b>UML Interface Statechart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__UML_INTERFACE_STATECHART = UML_REALTIME_STATECHART__UML_INTERFACE_STATECHART;

	/**
	 * The feature id for the '<em><b>Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__BEHAVIORAL_ELEMENT = UML_REALTIME_STATECHART__BEHAVIORAL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Provided Msg IFace</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__PROVIDED_MSG_IFACE = UML_REALTIME_STATECHART__PROVIDED_MSG_IFACE;

	/**
	 * The feature id for the '<em><b>Required Msg IFace</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__REQUIRED_MSG_IFACE = UML_REALTIME_STATECHART__REQUIRED_MSG_IFACE;

	/**
	 * The feature id for the '<em><b>Is Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__IS_EMBEDDED = UML_REALTIME_STATECHART__IS_EMBEDDED;

	/**
	 * The feature id for the '<em><b>UML Clocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__UML_CLOCKS = UML_REALTIME_STATECHART__UML_CLOCKS;

	/**
	 * The feature id for the '<em><b>UML Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__UML_REALTIME_STATECHART = UML_REALTIME_STATECHART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Interface Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART_FEATURE_COUNT = UML_REALTIME_STATECHART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ECLASS = UML_REALTIME_STATECHART___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___EIS_PROXY = UML_REALTIME_STATECHART___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ERESOURCE = UML_REALTIME_STATECHART___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ECONTAINER = UML_REALTIME_STATECHART___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ECONTAINING_FEATURE = UML_REALTIME_STATECHART___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ECONTAINMENT_FEATURE = UML_REALTIME_STATECHART___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ECONTENTS = UML_REALTIME_STATECHART___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___EALL_CONTENTS = UML_REALTIME_STATECHART___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ECROSS_REFERENCES = UML_REALTIME_STATECHART___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___EGET__ESTRUCTURALFEATURE = UML_REALTIME_STATECHART___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___EGET__ESTRUCTURALFEATURE_BOOLEAN = UML_REALTIME_STATECHART___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ESET__ESTRUCTURALFEATURE_OBJECT = UML_REALTIME_STATECHART___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___EIS_SET__ESTRUCTURALFEATURE = UML_REALTIME_STATECHART___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___EUNSET__ESTRUCTURALFEATURE = UML_REALTIME_STATECHART___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___EINVOKE__EOPERATION_ELIST = UML_REALTIME_STATECHART___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___GET_EXTENSION__ECLASS = UML_REALTIME_STATECHART___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___PROVIDE_EXTENSION__ECLASS = UML_REALTIME_STATECHART___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___GET_ANNOTATION__STRING = UML_REALTIME_STATECHART___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___PROVIDE_ANNOTATION__STRING = UML_REALTIME_STATECHART___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Highest Parent Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___GET_HIGHEST_PARENT_STATECHART = UML_REALTIME_STATECHART___GET_HIGHEST_PARENT_STATECHART;

	/**
	 * The operation id for the '<em>Iterator Of All Sub Realtime Statecharts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ITERATOR_OF_ALL_SUB_REALTIME_STATECHARTS = UML_REALTIME_STATECHART___ITERATOR_OF_ALL_SUB_REALTIME_STATECHARTS;

	/**
	 * The operation id for the '<em>Add All UML Realtime States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN = UML_REALTIME_STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN;

	/**
	 * The operation id for the '<em>Add Complex UML Realtime States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET = UML_REALTIME_STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET;

	/**
	 * The operation id for the '<em>Add All UML Realtime Transitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET = UML_REALTIME_STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET;

	/**
	 * The operation id for the '<em>Iterator Of All UML Clocks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN = UML_REALTIME_STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN;

	/**
	 * The operation id for the '<em>Add All UML Clocks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN = UML_REALTIME_STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___TO_STRING = UML_REALTIME_STATECHART___TO_STRING;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___CLONE = UML_REALTIME_STATECHART___CLONE;

	/**
	 * The number of operations of the '<em>UML Interface Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART_OPERATION_COUNT = UML_REALTIME_STATECHART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLInvariantAtomImpl <em>UML Invariant Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLInvariantAtomImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLInvariantAtom()
	 * @generated
	 */
	int UML_INVARIANT_ATOM = 6;

	/**
	 * The feature id for the '<em><b>UML Complex Realtime State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INVARIANT_ATOM__UML_COMPLEX_REALTIME_STATE = 0;

	/**
	 * The number of structural features of the '<em>UML Invariant Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INVARIANT_ATOM_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INVARIANT_ATOM___CLONE__UMLREALTIMESTATECHART_UMLINVARIANTATOM = 0;

	/**
	 * The number of operations of the '<em>UML Invariant Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INVARIANT_ATOM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeActionImpl <em>UML Realtime Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeActionImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeAction()
	 * @generated
	 */
	int UML_REALTIME_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION__TYPE = ExpressionsPackage.EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION__GENERIC_TYPE = ExpressionsPackage.EXPRESSION__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION__ID = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wcet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION__WCET = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blocking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION__BLOCKING = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>UML Realtime Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION__UML_REALTIME_TRANSITION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION__RESETS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>WCET Specified By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION__WCET_SPECIFIED_BY_USER = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>UML Realtime Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___ECLASS = ExpressionsPackage.EXPRESSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___EIS_PROXY = ExpressionsPackage.EXPRESSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___ERESOURCE = ExpressionsPackage.EXPRESSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___ECONTAINER = ExpressionsPackage.EXPRESSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___ECONTAINING_FEATURE = ExpressionsPackage.EXPRESSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___ECONTAINMENT_FEATURE = ExpressionsPackage.EXPRESSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___ECONTENTS = ExpressionsPackage.EXPRESSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___EALL_CONTENTS = ExpressionsPackage.EXPRESSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___ECROSS_REFERENCES = ExpressionsPackage.EXPRESSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___EGET__ESTRUCTURALFEATURE = ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = ExpressionsPackage.EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___EIS_SET__ESTRUCTURALFEATURE = ExpressionsPackage.EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___EUNSET__ESTRUCTURALFEATURE = ExpressionsPackage.EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___EINVOKE__EOPERATION_ELIST = ExpressionsPackage.EXPRESSION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___GET_EXTENSION__ECLASS = ExpressionsPackage.EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___PROVIDE_EXTENSION__ECLASS = ExpressionsPackage.EXPRESSION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___GET_ANNOTATION__STRING = ExpressionsPackage.EXPRESSION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___PROVIDE_ANNOTATION__STRING = ExpressionsPackage.EXPRESSION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION___CLONE__UMLREALTIMESTATECHART_UMLREALTIMEACTION = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>UML Realtime Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_ACTION_OPERATION_COUNT = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeEventImpl <em>UML Realtime Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeEventImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeEvent()
	 * @generated
	 */
	int UML_REALTIME_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT__ANNOTATION = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT__EXTENSION = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT__TYPE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT__GENERIC_TYPE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT__COMMENT = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT__OWNED_PARAMETER_BINDINGS = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT__CALLEE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__CALLEE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT__TARGET = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__TARGET;

	/**
	 * The feature id for the '<em><b>Opaque Callable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT__OPAQUE_CALLABLE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE;

	/**
	 * The feature id for the '<em><b>Triggered UML Realtime Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Raised UML Realtime Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT__INSTANCE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT__NAME = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Full Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT__FULL_EVENT_NAME = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>UML Realtime Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT_FEATURE_COUNT = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___ECLASS = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___EIS_PROXY = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___ERESOURCE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___ECONTAINER = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___ECONTAINING_FEATURE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___ECONTAINMENT_FEATURE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___ECONTENTS = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___EALL_CONTENTS = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___ECROSS_REFERENCES = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___EGET__ESTRUCTURALFEATURE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___ESET__ESTRUCTURALFEATURE_OBJECT = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___EIS_SET__ESTRUCTURALFEATURE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___EUNSET__ESTRUCTURALFEATURE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___EINVOKE__EOPERATION_ELIST = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___GET_EXTENSION__ECLASS = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___PROVIDE_EXTENSION__ECLASS = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___GET_ANNOTATION__STRING = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___PROVIDE_ANNOTATION__STRING = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___CLONE__UMLREALTIMESTATECHART_UMLREALTIMEEVENT = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT___TO_STRING = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Realtime Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_EVENT_OPERATION_COUNT = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeFadingFunctionImpl <em>UML Realtime Fading Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeFadingFunctionImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeFadingFunction()
	 * @generated
	 */
	int UML_REALTIME_FADING_FUNCTION = 9;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FADING_FUNCTION__FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>UML Realtime Transitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FADING_FUNCTION__UML_REALTIME_TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Min Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FADING_FUNCTION__MIN_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FADING_FUNCTION__MAX_DURATION = 3;

	/**
	 * The feature id for the '<em><b>Spline1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FADING_FUNCTION__SPLINE1 = 4;

	/**
	 * The feature id for the '<em><b>Spline2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FADING_FUNCTION__SPLINE2 = 5;

	/**
	 * The feature id for the '<em><b>Polynom Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FADING_FUNCTION__POLYNOM_DEGREE = 6;

	/**
	 * The feature id for the '<em><b>Ports By Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FADING_FUNCTION__PORTS_BY_COMPONENT_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Port Inst To Port Inst Map Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FADING_FUNCTION__PORT_INST_TO_PORT_INST_MAP_ENTRY = 8;

	/**
	 * The number of structural features of the '<em>UML Realtime Fading Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FADING_FUNCTION_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Get Breakpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FADING_FUNCTION___GET_BREAKPOINT = 0;

	/**
	 * The number of operations of the '<em>UML Realtime Fading Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FADING_FUNCTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeFlatSwitchingImpl <em>UML Realtime Flat Switching</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeFlatSwitchingImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeFlatSwitching()
	 * @generated
	 */
	int UML_REALTIME_FLAT_SWITCHING = 10;

	/**
	 * The feature id for the '<em><b>UML Realtime Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FLAT_SWITCHING__UML_REALTIME_TRANSITIONS = 0;

	/**
	 * The feature id for the '<em><b>Min Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FLAT_SWITCHING__MIN_DURATION = 1;

	/**
	 * The feature id for the '<em><b>Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FLAT_SWITCHING__MAX_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Spline1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FLAT_SWITCHING__SPLINE1 = 3;

	/**
	 * The feature id for the '<em><b>Spline2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FLAT_SWITCHING__SPLINE2 = 4;

	/**
	 * The feature id for the '<em><b>Polynom Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FLAT_SWITCHING__POLYNOM_DEGREE = 5;

	/**
	 * The feature id for the '<em><b>Port Inst To Port Inst Map Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FLAT_SWITCHING__PORT_INST_TO_PORT_INST_MAP_ENTRY = 6;

	/**
	 * The number of structural features of the '<em>UML Realtime Flat Switching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FLAT_SWITCHING_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get Breakpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FLAT_SWITCHING___GET_BREAKPOINT = 0;

	/**
	 * The number of operations of the '<em>UML Realtime Flat Switching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_FLAT_SWITCHING_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStartStateImpl <em>UML Realtime Start State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStartStateImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeStartState()
	 * @generated
	 */
	int UML_REALTIME_START_STATE = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE__ANNOTATION = UML_REALTIME_STATE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE__EXTENSION = UML_REALTIME_STATE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE__NAME = UML_REALTIME_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing UML Realtime Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE__OUTGOING_UML_REALTIME_TRANSITIONS = UML_REALTIME_STATE__OUTGOING_UML_REALTIME_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming UML Realtime Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE__INCOMING_UML_REALTIME_TRANSITIONS = UML_REALTIME_STATE__INCOMING_UML_REALTIME_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>UML Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE__UML_REALTIME_STATECHART = UML_REALTIME_STATE__UML_REALTIME_STATECHART;

	/**
	 * The feature id for the '<em><b>UML Realtime Start State Rev</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE__UML_REALTIME_START_STATE_REV = UML_REALTIME_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Realtime Start State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE_FEATURE_COUNT = UML_REALTIME_STATE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___ECLASS = UML_REALTIME_STATE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___EIS_PROXY = UML_REALTIME_STATE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___ERESOURCE = UML_REALTIME_STATE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___ECONTAINER = UML_REALTIME_STATE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___ECONTAINING_FEATURE = UML_REALTIME_STATE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___ECONTAINMENT_FEATURE = UML_REALTIME_STATE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___ECONTENTS = UML_REALTIME_STATE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___EALL_CONTENTS = UML_REALTIME_STATE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___ECROSS_REFERENCES = UML_REALTIME_STATE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___EGET__ESTRUCTURALFEATURE = UML_REALTIME_STATE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___EGET__ESTRUCTURALFEATURE_BOOLEAN = UML_REALTIME_STATE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___ESET__ESTRUCTURALFEATURE_OBJECT = UML_REALTIME_STATE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___EIS_SET__ESTRUCTURALFEATURE = UML_REALTIME_STATE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___EUNSET__ESTRUCTURALFEATURE = UML_REALTIME_STATE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___EINVOKE__EOPERATION_ELIST = UML_REALTIME_STATE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___GET_EXTENSION__ECLASS = UML_REALTIME_STATE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___PROVIDE_EXTENSION__ECLASS = UML_REALTIME_STATE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___GET_ANNOTATION__STRING = UML_REALTIME_STATE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___PROVIDE_ANNOTATION__STRING = UML_REALTIME_STATE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Long Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___GET_LONG_NAME = UML_REALTIME_STATE___GET_LONG_NAME;

	/**
	 * The operation id for the '<em>Get Root Realtime Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___GET_ROOT_REALTIME_STATECHART = UML_REALTIME_STATE___GET_ROOT_REALTIME_STATECHART;

	/**
	 * The operation id for the '<em>Get Next State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___GET_NEXT_STATE = UML_REALTIME_STATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE___CLONE__UMLREALTIMESTATECHART_UMLREALTIMESTARTSTATE = UML_REALTIME_STATE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Realtime Start State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_START_STATE_OPERATION_COUNT = UML_REALTIME_STATE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStopStateImpl <em>UML Realtime Stop State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStopStateImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeStopState()
	 * @generated
	 */
	int UML_REALTIME_STOP_STATE = 14;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE__ANNOTATION = UML_REALTIME_STATE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE__EXTENSION = UML_REALTIME_STATE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE__NAME = UML_REALTIME_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing UML Realtime Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE__OUTGOING_UML_REALTIME_TRANSITIONS = UML_REALTIME_STATE__OUTGOING_UML_REALTIME_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming UML Realtime Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE__INCOMING_UML_REALTIME_TRANSITIONS = UML_REALTIME_STATE__INCOMING_UML_REALTIME_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>UML Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE__UML_REALTIME_STATECHART = UML_REALTIME_STATE__UML_REALTIME_STATECHART;

	/**
	 * The number of structural features of the '<em>UML Realtime Stop State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE_FEATURE_COUNT = UML_REALTIME_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___ECLASS = UML_REALTIME_STATE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___EIS_PROXY = UML_REALTIME_STATE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___ERESOURCE = UML_REALTIME_STATE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___ECONTAINER = UML_REALTIME_STATE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___ECONTAINING_FEATURE = UML_REALTIME_STATE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___ECONTAINMENT_FEATURE = UML_REALTIME_STATE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___ECONTENTS = UML_REALTIME_STATE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___EALL_CONTENTS = UML_REALTIME_STATE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___ECROSS_REFERENCES = UML_REALTIME_STATE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___EGET__ESTRUCTURALFEATURE = UML_REALTIME_STATE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___EGET__ESTRUCTURALFEATURE_BOOLEAN = UML_REALTIME_STATE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___ESET__ESTRUCTURALFEATURE_OBJECT = UML_REALTIME_STATE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___EIS_SET__ESTRUCTURALFEATURE = UML_REALTIME_STATE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___EUNSET__ESTRUCTURALFEATURE = UML_REALTIME_STATE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___EINVOKE__EOPERATION_ELIST = UML_REALTIME_STATE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___GET_EXTENSION__ECLASS = UML_REALTIME_STATE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___PROVIDE_EXTENSION__ECLASS = UML_REALTIME_STATE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___GET_ANNOTATION__STRING = UML_REALTIME_STATE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___PROVIDE_ANNOTATION__STRING = UML_REALTIME_STATE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Long Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___GET_LONG_NAME = UML_REALTIME_STATE___GET_LONG_NAME;

	/**
	 * The operation id for the '<em>Get Root Realtime Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___GET_ROOT_REALTIME_STATECHART = UML_REALTIME_STATE___GET_ROOT_REALTIME_STATECHART;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE___CLONE__UMLREALTIMESTATECHART_UMLREALTIMESTOPSTATE = UML_REALTIME_STATE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>UML Realtime Stop State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_STOP_STATE_OPERATION_COUNT = UML_REALTIME_STATE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl <em>UML Realtime Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeTransition()
	 * @generated
	 */
	int UML_REALTIME_TRANSITION = 15;

	/**
	 * The feature id for the '<em><b>UML Realtime Transition Mapping Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__PRIORITY = 1;

	/**
	 * The feature id for the '<em><b>Send Synchronization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__SEND_SYNCHRONIZATION = 2;

	/**
	 * The feature id for the '<em><b>Receive Synchronization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__RECEIVE_SYNCHRONIZATION = 3;

	/**
	 * The feature id for the '<em><b>Side Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__SIDE_EFFECT = 4;

	/**
	 * The feature id for the '<em><b>Target UML Realtime State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__TARGET_UML_REALTIME_STATE = 5;

	/**
	 * The feature id for the '<em><b>Source UML Realtime State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__SOURCE_UML_REALTIME_STATE = 6;

	/**
	 * The feature id for the '<em><b>UML Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__UML_REALTIME_STATECHART = 7;

	/**
	 * The feature id for the '<em><b>Resets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__RESETS = 8;

	/**
	 * The feature id for the '<em><b>UML Realtime Flat Switching</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__UML_REALTIME_FLAT_SWITCHING = 9;

	/**
	 * The feature id for the '<em><b>UML Realtime Fading Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__UML_REALTIME_FADING_FUNCTION = 10;

	/**
	 * The feature id for the '<em><b>Trigger Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__TRIGGER_EVENTS = 11;

	/**
	 * The feature id for the '<em><b>Raised Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__RAISED_EVENTS = 12;

	/**
	 * The feature id for the '<em><b>Timeguard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__TIMEGUARD = 13;

	/**
	 * The feature id for the '<em><b>Absolute Deadlines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__ABSOLUTE_DEADLINES = 14;

	/**
	 * The feature id for the '<em><b>Relative Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__RELATIVE_DEADLINE = 15;

	/**
	 * The feature id for the '<em><b>Urgent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__URGENT = 16;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION__GUARD = 17;

	/**
	 * The number of structural features of the '<em>UML Realtime Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION_FEATURE_COUNT = 18;

	/**
	 * The operation id for the '<em>Has Clock In UML Clock Reset Atom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION___HAS_CLOCK_IN_UML_CLOCK_RESET_ATOM__UMLCLOCK = 0;

	/**
	 * The operation id for the '<em>Calculate Worst Case Deadline As Natural Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION___CALCULATE_WORST_CASE_DEADLINE_AS_NATURAL_NUMBER = 1;

	/**
	 * The operation id for the '<em>Get Default Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION___GET_DEFAULT_NAME = 2;

	/**
	 * The operation id for the '<em>Resets Clock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION___RESETS_CLOCK__UMLCLOCK = 3;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION___CLONE__UMLREALTIMESTATECHART_UMLREALTIMETRANSITION = 4;

	/**
	 * The number of operations of the '<em>UML Realtime Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_REALTIME_TRANSITION_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationChannelImpl <em>Synchronization Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationChannelImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronizationChannel()
	 * @generated
	 */
	int SYNCHRONIZATION_CHANNEL = 16;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__ANNOTATION = SDMPackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__EXTENSION = SDMPackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__NAME = SDMPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__COMMENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>UML Realtime Complex State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__UML_REALTIME_COMPLEX_STATE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Synchronization Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___ECLASS = SDMPackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___EIS_PROXY = SDMPackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___ERESOURCE = SDMPackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___ECONTAINER = SDMPackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___ECONTAINING_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___ECONTAINMENT_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___ECONTENTS = SDMPackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___EALL_CONTENTS = SDMPackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___ECROSS_REFERENCES = SDMPackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___EGET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___EUNSET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___EINVOKE__EOPERATION_ELIST = SDMPackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___GET_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___PROVIDE_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___GET_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___PROVIDE_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___CLONE__UMLREALTIMESTATECHART_SYNCHRONIZATIONCHANNEL = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Synchronization Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL_OPERATION_COUNT = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLTimeguardAtomImpl <em>UML Timeguard Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLTimeguardAtomImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLTimeguardAtom()
	 * @generated
	 */
	int UML_TIMEGUARD_ATOM = 17;

	/**
	 * The number of structural features of the '<em>UML Timeguard Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_TIMEGUARD_ATOM_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_TIMEGUARD_ATOM___CLONE__UMLREALTIMESTATECHART_UMLTIMEGUARDATOM = 0;

	/**
	 * The number of operations of the '<em>UML Timeguard Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_TIMEGUARD_ATOM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.HistoryStateImpl <em>History State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.HistoryStateImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getHistoryState()
	 * @generated
	 */
	int HISTORY_STATE = 18;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__ANNOTATION = UML_REALTIME_STATE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__EXTENSION = UML_REALTIME_STATE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__NAME = UML_REALTIME_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing UML Realtime Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__OUTGOING_UML_REALTIME_TRANSITIONS = UML_REALTIME_STATE__OUTGOING_UML_REALTIME_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming UML Realtime Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__INCOMING_UML_REALTIME_TRANSITIONS = UML_REALTIME_STATE__INCOMING_UML_REALTIME_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>UML Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__UML_REALTIME_STATECHART = UML_REALTIME_STATE__UML_REALTIME_STATECHART;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__KIND = UML_REALTIME_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>History State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE_FEATURE_COUNT = UML_REALTIME_STATE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___ECLASS = UML_REALTIME_STATE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___EIS_PROXY = UML_REALTIME_STATE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___ERESOURCE = UML_REALTIME_STATE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___ECONTAINER = UML_REALTIME_STATE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___ECONTAINING_FEATURE = UML_REALTIME_STATE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___ECONTAINMENT_FEATURE = UML_REALTIME_STATE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___ECONTENTS = UML_REALTIME_STATE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___EALL_CONTENTS = UML_REALTIME_STATE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___ECROSS_REFERENCES = UML_REALTIME_STATE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___EGET__ESTRUCTURALFEATURE = UML_REALTIME_STATE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___EGET__ESTRUCTURALFEATURE_BOOLEAN = UML_REALTIME_STATE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___ESET__ESTRUCTURALFEATURE_OBJECT = UML_REALTIME_STATE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___EIS_SET__ESTRUCTURALFEATURE = UML_REALTIME_STATE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___EUNSET__ESTRUCTURALFEATURE = UML_REALTIME_STATE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___EINVOKE__EOPERATION_ELIST = UML_REALTIME_STATE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___GET_EXTENSION__ECLASS = UML_REALTIME_STATE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___PROVIDE_EXTENSION__ECLASS = UML_REALTIME_STATE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___GET_ANNOTATION__STRING = UML_REALTIME_STATE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___PROVIDE_ANNOTATION__STRING = UML_REALTIME_STATE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Long Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___GET_LONG_NAME = UML_REALTIME_STATE___GET_LONG_NAME;

	/**
	 * The operation id for the '<em>Get Root Realtime Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___GET_ROOT_REALTIME_STATECHART = UML_REALTIME_STATE___GET_ROOT_REALTIME_STATECHART;

	/**
	 * The number of operations of the '<em>History State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE_OPERATION_COUNT = UML_REALTIME_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DoEventImpl <em>Do Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DoEventImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getDoEvent()
	 * @generated
	 */
	int DO_EVENT = 19;

	/**
	 * The feature id for the '<em><b>UML Realtime Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EVENT__UML_REALTIME_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Do Action Rev</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EVENT__DO_ACTION_REV = 1;

	/**
	 * The feature id for the '<em><b>Period Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EVENT__PERIOD_LOWER = 2;

	/**
	 * The feature id for the '<em><b>Period Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EVENT__PERIOD_UPPER = 3;

	/**
	 * The number of structural features of the '<em>Do Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Do Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.EntryOrExitEventImpl <em>Entry Or Exit Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.EntryOrExitEventImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryOrExitEvent()
	 * @generated
	 */
	int ENTRY_OR_EXIT_EVENT = 20;

	/**
	 * The feature id for the '<em><b>Resets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OR_EXIT_EVENT__RESETS = 0;

	/**
	 * The feature id for the '<em><b>Entry Action Rev</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OR_EXIT_EVENT__ENTRY_ACTION_REV = 1;

	/**
	 * The feature id for the '<em><b>Exit Action Rev</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OR_EXIT_EVENT__EXIT_ACTION_REV = 2;

	/**
	 * The feature id for the '<em><b>UML Realtime Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OR_EXIT_EVENT__UML_REALTIME_ACTION = 3;

	/**
	 * The number of structural features of the '<em>Entry Or Exit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OR_EXIT_EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Entry Or Exit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OR_EXIT_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationImpl <em>Synchronization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronization()
	 * @generated
	 */
	int SYNCHRONIZATION = 21;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__ANNOTATION = CallsPackage.INVOCATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__EXTENSION = CallsPackage.INVOCATION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__COMMENT = CallsPackage.INVOCATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__OWNED_PARAMETER_BINDINGS = CallsPackage.INVOCATION__OWNED_PARAMETER_BINDINGS;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__CALLEE = CallsPackage.INVOCATION__CALLEE;

	/**
	 * The feature id for the '<em><b>Send Sync Rev</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__SEND_SYNC_REV = CallsPackage.INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receive Sync Rev</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__RECEIVE_SYNC_REV = CallsPackage.INVOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_FEATURE_COUNT = CallsPackage.INVOCATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___ECLASS = CallsPackage.INVOCATION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___EIS_PROXY = CallsPackage.INVOCATION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___ERESOURCE = CallsPackage.INVOCATION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___ECONTAINER = CallsPackage.INVOCATION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___ECONTAINING_FEATURE = CallsPackage.INVOCATION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___ECONTAINMENT_FEATURE = CallsPackage.INVOCATION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___ECONTENTS = CallsPackage.INVOCATION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___EALL_CONTENTS = CallsPackage.INVOCATION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___ECROSS_REFERENCES = CallsPackage.INVOCATION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___EGET__ESTRUCTURALFEATURE = CallsPackage.INVOCATION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CallsPackage.INVOCATION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___ESET__ESTRUCTURALFEATURE_OBJECT = CallsPackage.INVOCATION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___EIS_SET__ESTRUCTURALFEATURE = CallsPackage.INVOCATION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___EUNSET__ESTRUCTURALFEATURE = CallsPackage.INVOCATION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___EINVOKE__EOPERATION_ELIST = CallsPackage.INVOCATION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___GET_EXTENSION__ECLASS = CallsPackage.INVOCATION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___PROVIDE_EXTENSION__ECLASS = CallsPackage.INVOCATION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___GET_ANNOTATION__STRING = CallsPackage.INVOCATION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___PROVIDE_ANNOTATION__STRING = CallsPackage.INVOCATION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_OPERATION_COUNT = CallsPackage.INVOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryKind <em>History Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryKind
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getHistoryKind()
	 * @generated
	 */
	int HISTORY_KIND = 22;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Deadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadline</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Deadline
	 * @generated
	 */
	EClass getDeadline();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Deadline#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Deadline#getUpperBound()
	 * @see #getDeadline()
	 * @generated
	 */
	EReference getDeadline_UpperBound();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Deadline#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Deadline#getLowerBound()
	 * @see #getDeadline()
	 * @generated
	 */
	EReference getDeadline_LowerBound();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline <em>Absolute Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Deadline</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline
	 * @generated
	 */
	EClass getAbsoluteDeadline();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline#getUMLRealtimeTransition <em>UML Realtime Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>UML Realtime Transition</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline#getUMLRealtimeTransition()
	 * @see #getAbsoluteDeadline()
	 * @generated
	 */
	EReference getAbsoluteDeadline_UMLRealtimeTransition();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline#getUMLClock <em>UML Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>UML Clock</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline#getUMLClock()
	 * @see #getAbsoluteDeadline()
	 * @generated
	 */
	EReference getAbsoluteDeadline_UMLClock();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline <em>Relative Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Deadline</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline
	 * @generated
	 */
	EClass getRelativeDeadline();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline#getUMLRealtimeTransition <em>UML Realtime Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>UML Realtime Transition</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline#getUMLRealtimeTransition()
	 * @see #getRelativeDeadline()
	 * @generated
	 */
	EReference getRelativeDeadline_UMLRealtimeTransition();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock <em>UML Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Clock</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock
	 * @generated
	 */
	EClass getUMLClock();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#getId()
	 * @see #getUMLClock()
	 * @generated
	 */
	EAttribute getUMLClock_Id();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#getAbsoluteDeadlines <em>Absolute Deadlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Absolute Deadlines</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#getAbsoluteDeadlines()
	 * @see #getUMLClock()
	 * @generated
	 */
	EReference getUMLClock_AbsoluteDeadlines();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>UML Realtime Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#getUMLRealtimeStatechart()
	 * @see #getUMLClock()
	 * @generated
	 */
	EReference getUMLClock_UMLRealtimeStatechart();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#getResets <em>Resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resets</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#getResets()
	 * @see #getUMLClock()
	 * @generated
	 */
	EReference getUMLClock_Resets();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#toString()
	 * @generated
	 */
	EOperation getUMLClock__ToString();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock)
	 * @generated
	 */
	EOperation getUMLClock__Clone__UMLRealtimeStatechart_UMLClock();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState <em>UML Realtime Complex State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Realtime Complex State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState
	 * @generated
	 */
	EClass getUMLRealtimeComplexState();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getUMLRealtimeStatecharts <em>UML Realtime Statecharts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>UML Realtime Statecharts</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getUMLRealtimeStatecharts()
	 * @see #getUMLRealtimeComplexState()
	 * @generated
	 */
	EReference getUMLRealtimeComplexState_UMLRealtimeStatecharts();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getDoAction <em>Do Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do Action</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getDoAction()
	 * @see #getUMLRealtimeComplexState()
	 * @generated
	 */
	EReference getUMLRealtimeComplexState_DoAction();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getExitAction <em>Exit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit Action</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getExitAction()
	 * @see #getUMLRealtimeComplexState()
	 * @generated
	 */
	EReference getUMLRealtimeComplexState_ExitAction();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getEntryAction <em>Entry Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Action</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getEntryAction()
	 * @see #getUMLRealtimeComplexState()
	 * @generated
	 */
	EReference getUMLRealtimeComplexState_EntryAction();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getReconfDiagram <em>Reconf Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reconf Diagram</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getReconfDiagram()
	 * @see #getUMLRealtimeComplexState()
	 * @generated
	 */
	EReference getUMLRealtimeComplexState_ReconfDiagram();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getInterfacedStates <em>Interfaced States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaced States</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getInterfacedStates()
	 * @see #getUMLRealtimeComplexState()
	 * @generated
	 */
	EReference getUMLRealtimeComplexState_InterfacedStates();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getInterfaceState <em>Interface State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getInterfaceState()
	 * @see #getUMLRealtimeComplexState()
	 * @generated
	 */
	EReference getUMLRealtimeComplexState_InterfaceState();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getInvariants <em>Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invariants</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getInvariants()
	 * @see #getUMLRealtimeComplexState()
	 * @generated
	 */
	EReference getUMLRealtimeComplexState_Invariants();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#isCommitted <em>Committed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Committed</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#isCommitted()
	 * @see #getUMLRealtimeComplexState()
	 * @generated
	 */
	EAttribute getUMLRealtimeComplexState_Committed();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Channels</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getChannels()
	 * @see #getUMLRealtimeComplexState()
	 * @generated
	 */
	EReference getUMLRealtimeComplexState_Channels();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState)
	 * @generated
	 */
	EOperation getUMLRealtimeComplexState__Clone__UMLRealtimeStatechart_UMLRealtimeComplexState();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInterfaceStatechart <em>UML Interface Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Interface Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInterfaceStatechart
	 * @generated
	 */
	EClass getUMLInterfaceStatechart();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInterfaceStatechart#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>UML Realtime Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInterfaceStatechart#getUMLRealtimeStatechart()
	 * @see #getUMLInterfaceStatechart()
	 * @generated
	 */
	EReference getUMLInterfaceStatechart_UMLRealtimeStatechart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInvariantAtom <em>UML Invariant Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Invariant Atom</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInvariantAtom
	 * @generated
	 */
	EClass getUMLInvariantAtom();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInvariantAtom#getUMLComplexRealtimeState <em>UML Complex Realtime State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UML Complex Realtime State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInvariantAtom#getUMLComplexRealtimeState()
	 * @see #getUMLInvariantAtom()
	 * @generated
	 */
	EReference getUMLInvariantAtom_UMLComplexRealtimeState();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInvariantAtom#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInvariantAtom) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInvariantAtom#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInvariantAtom)
	 * @generated
	 */
	EOperation getUMLInvariantAtom__Clone__UMLRealtimeStatechart_UMLInvariantAtom();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction <em>UML Realtime Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Realtime Action</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction
	 * @generated
	 */
	EClass getUMLRealtimeAction();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction#getId()
	 * @see #getUMLRealtimeAction()
	 * @generated
	 */
	EAttribute getUMLRealtimeAction_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction#getWcet <em>Wcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wcet</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction#getWcet()
	 * @see #getUMLRealtimeAction()
	 * @generated
	 */
	EAttribute getUMLRealtimeAction_Wcet();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction#getBlocking <em>Blocking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocking</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction#getBlocking()
	 * @see #getUMLRealtimeAction()
	 * @generated
	 */
	EAttribute getUMLRealtimeAction_Blocking();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction#getUMLRealtimeTransition <em>UML Realtime Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>UML Realtime Transition</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction#getUMLRealtimeTransition()
	 * @see #getUMLRealtimeAction()
	 * @generated
	 */
	EReference getUMLRealtimeAction_UMLRealtimeTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction#getResets <em>Resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resets</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction#getResets()
	 * @see #getUMLRealtimeAction()
	 * @generated
	 */
	EReference getUMLRealtimeAction_Resets();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction#isWCETSpecifiedByUser <em>WCET Specified By User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WCET Specified By User</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction#isWCETSpecifiedByUser()
	 * @see #getUMLRealtimeAction()
	 * @generated
	 */
	EAttribute getUMLRealtimeAction_WCETSpecifiedByUser();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction)
	 * @generated
	 */
	EOperation getUMLRealtimeAction__Clone__UMLRealtimeStatechart_UMLRealtimeAction();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent <em>UML Realtime Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Realtime Event</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent
	 * @generated
	 */
	EClass getUMLRealtimeEvent();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getTriggeredUMLRealtimeTransition <em>Triggered UML Realtime Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggered UML Realtime Transition</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getTriggeredUMLRealtimeTransition()
	 * @see #getUMLRealtimeEvent()
	 * @generated
	 */
	EReference getUMLRealtimeEvent_TriggeredUMLRealtimeTransition();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getRaisedUMLRealtimeTransition <em>Raised UML Realtime Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Raised UML Realtime Transition</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getRaisedUMLRealtimeTransition()
	 * @see #getUMLRealtimeEvent()
	 * @generated
	 */
	EReference getUMLRealtimeEvent_RaisedUMLRealtimeTransition();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getInstance()
	 * @see #getUMLRealtimeEvent()
	 * @generated
	 */
	EAttribute getUMLRealtimeEvent_Instance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getName()
	 * @see #getUMLRealtimeEvent()
	 * @generated
	 */
	EAttribute getUMLRealtimeEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getFullEventName <em>Full Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Event Name</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getFullEventName()
	 * @see #getUMLRealtimeEvent()
	 * @generated
	 */
	EAttribute getUMLRealtimeEvent_FullEventName();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent)
	 * @generated
	 */
	EOperation getUMLRealtimeEvent__Clone__UMLRealtimeStatechart_UMLRealtimeEvent();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#toString()
	 * @generated
	 */
	EOperation getUMLRealtimeEvent__ToString();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction <em>UML Realtime Fading Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Realtime Fading Function</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction
	 * @generated
	 */
	EClass getUMLRealtimeFadingFunction();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getFunction()
	 * @see #getUMLRealtimeFadingFunction()
	 * @generated
	 */
	EAttribute getUMLRealtimeFadingFunction_Function();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getUMLRealtimeTransitions <em>UML Realtime Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>UML Realtime Transitions</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getUMLRealtimeTransitions()
	 * @see #getUMLRealtimeFadingFunction()
	 * @generated
	 */
	EReference getUMLRealtimeFadingFunction_UMLRealtimeTransitions();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getMinDuration <em>Min Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Duration</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getMinDuration()
	 * @see #getUMLRealtimeFadingFunction()
	 * @generated
	 */
	EAttribute getUMLRealtimeFadingFunction_MinDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getMaxDuration <em>Max Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Duration</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getMaxDuration()
	 * @see #getUMLRealtimeFadingFunction()
	 * @generated
	 */
	EAttribute getUMLRealtimeFadingFunction_MaxDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getSpline1 <em>Spline1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spline1</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getSpline1()
	 * @see #getUMLRealtimeFadingFunction()
	 * @generated
	 */
	EAttribute getUMLRealtimeFadingFunction_Spline1();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getSpline2 <em>Spline2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spline2</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getSpline2()
	 * @see #getUMLRealtimeFadingFunction()
	 * @generated
	 */
	EAttribute getUMLRealtimeFadingFunction_Spline2();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getPolynomDegree <em>Polynom Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polynom Degree</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getPolynomDegree()
	 * @see #getUMLRealtimeFadingFunction()
	 * @generated
	 */
	EAttribute getUMLRealtimeFadingFunction_PolynomDegree();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getPortsByComponentInstance <em>Ports By Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ports By Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getPortsByComponentInstance()
	 * @see #getUMLRealtimeFadingFunction()
	 * @generated
	 */
	EReference getUMLRealtimeFadingFunction_PortsByComponentInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getPortInstToPortInstMapEntry <em>Port Inst To Port Inst Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Inst To Port Inst Map Entry</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getPortInstToPortInstMapEntry()
	 * @see #getUMLRealtimeFadingFunction()
	 * @generated
	 */
	EAttribute getUMLRealtimeFadingFunction_PortInstToPortInstMapEntry();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getBreakpoint() <em>Get Breakpoint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Breakpoint</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getBreakpoint()
	 * @generated
	 */
	EOperation getUMLRealtimeFadingFunction__GetBreakpoint();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching <em>UML Realtime Flat Switching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Realtime Flat Switching</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching
	 * @generated
	 */
	EClass getUMLRealtimeFlatSwitching();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching#getUMLRealtimeTransitions <em>UML Realtime Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>UML Realtime Transitions</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching#getUMLRealtimeTransitions()
	 * @see #getUMLRealtimeFlatSwitching()
	 * @generated
	 */
	EReference getUMLRealtimeFlatSwitching_UMLRealtimeTransitions();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching#getMinDuration <em>Min Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Duration</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching#getMinDuration()
	 * @see #getUMLRealtimeFlatSwitching()
	 * @generated
	 */
	EAttribute getUMLRealtimeFlatSwitching_MinDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching#getMaxDuration <em>Max Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Duration</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching#getMaxDuration()
	 * @see #getUMLRealtimeFlatSwitching()
	 * @generated
	 */
	EAttribute getUMLRealtimeFlatSwitching_MaxDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching#getSpline1 <em>Spline1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spline1</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching#getSpline1()
	 * @see #getUMLRealtimeFlatSwitching()
	 * @generated
	 */
	EAttribute getUMLRealtimeFlatSwitching_Spline1();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching#getSpline2 <em>Spline2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spline2</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching#getSpline2()
	 * @see #getUMLRealtimeFlatSwitching()
	 * @generated
	 */
	EAttribute getUMLRealtimeFlatSwitching_Spline2();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching#getPolynomDegree <em>Polynom Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polynom Degree</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching#getPolynomDegree()
	 * @see #getUMLRealtimeFlatSwitching()
	 * @generated
	 */
	EAttribute getUMLRealtimeFlatSwitching_PolynomDegree();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching#getPortInstToPortInstMapEntry <em>Port Inst To Port Inst Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Inst To Port Inst Map Entry</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching#getPortInstToPortInstMapEntry()
	 * @see #getUMLRealtimeFlatSwitching()
	 * @generated
	 */
	EAttribute getUMLRealtimeFlatSwitching_PortInstToPortInstMapEntry();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching#getBreakpoint() <em>Get Breakpoint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Breakpoint</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching#getBreakpoint()
	 * @generated
	 */
	EOperation getUMLRealtimeFlatSwitching__GetBreakpoint();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState <em>UML Realtime Start State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Realtime Start State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState
	 * @generated
	 */
	EClass getUMLRealtimeStartState();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState#getUMLRealtimeStartStateRev <em>UML Realtime Start State Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>UML Realtime Start State Rev</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState#getUMLRealtimeStartStateRev()
	 * @see #getUMLRealtimeStartState()
	 * @generated
	 */
	EReference getUMLRealtimeStartState_UMLRealtimeStartStateRev();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState#getNextState() <em>Get Next State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Next State</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState#getNextState()
	 * @generated
	 */
	EOperation getUMLRealtimeStartState__GetNextState();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState)
	 * @generated
	 */
	EOperation getUMLRealtimeStartState__Clone__UMLRealtimeStatechart_UMLRealtimeStartState();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState <em>UML Realtime State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Realtime State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState
	 * @generated
	 */
	EClass getUMLRealtimeState();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState#getOutgoingUMLRealtimeTransitions <em>Outgoing UML Realtime Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing UML Realtime Transitions</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState#getOutgoingUMLRealtimeTransitions()
	 * @see #getUMLRealtimeState()
	 * @generated
	 */
	EReference getUMLRealtimeState_OutgoingUMLRealtimeTransitions();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState#getIncomingUMLRealtimeTransitions <em>Incoming UML Realtime Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming UML Realtime Transitions</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState#getIncomingUMLRealtimeTransitions()
	 * @see #getUMLRealtimeState()
	 * @generated
	 */
	EReference getUMLRealtimeState_IncomingUMLRealtimeTransitions();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>UML Realtime Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState#getUMLRealtimeStatechart()
	 * @see #getUMLRealtimeState()
	 * @generated
	 */
	EReference getUMLRealtimeState_UMLRealtimeStatechart();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState#getLongName() <em>Get Long Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Long Name</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState#getLongName()
	 * @generated
	 */
	EOperation getUMLRealtimeState__GetLongName();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState#getRootRealtimeStatechart() <em>Get Root Realtime Statechart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Realtime Statechart</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState#getRootRealtimeStatechart()
	 * @generated
	 */
	EOperation getUMLRealtimeState__GetRootRealtimeStatechart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart <em>UML Realtime Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Realtime Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart
	 * @generated
	 */
	EClass getUMLRealtimeStatechart();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getEventQueueSize <em>Event Queue Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Queue Size</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getEventQueueSize()
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	EAttribute getUMLRealtimeStatechart_EventQueueSize();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getWcetDocument <em>Wcet Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wcet Document</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getWcetDocument()
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	EAttribute getUMLRealtimeStatechart_WcetDocument();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getSecurityLevel <em>Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Level</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getSecurityLevel()
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	EAttribute getUMLRealtimeStatechart_SecurityLevel();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getSystemWcetMap <em>System Wcet Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Wcet Map</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getSystemWcetMap()
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	EAttribute getUMLRealtimeStatechart_SystemWcetMap();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUtilisation <em>Utilisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilisation</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUtilisation()
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	EAttribute getUMLRealtimeStatechart_Utilisation();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getScheduleDocument <em>Schedule Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Document</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getScheduleDocument()
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	EAttribute getUMLRealtimeStatechart_ScheduleDocument();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLRealtimeStartState <em>UML Realtime Start State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UML Realtime Start State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLRealtimeStartState()
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	EReference getUMLRealtimeStatechart_UMLRealtimeStartState();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLComplexRealtimeState <em>UML Complex Realtime State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UML Complex Realtime State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLComplexRealtimeState()
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	EReference getUMLRealtimeStatechart_UMLComplexRealtimeState();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLRealtimeTransitions <em>UML Realtime Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UML Realtime Transitions</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLRealtimeTransitions()
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	EReference getUMLRealtimeStatechart_UMLRealtimeTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLRealtimeStates <em>UML Realtime States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UML Realtime States</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLRealtimeStates()
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	EReference getUMLRealtimeStatechart_UMLRealtimeStates();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EClass</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getEClass()
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	EReference getUMLRealtimeStatechart_EClass();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLInterfaceStatechart <em>UML Interface Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UML Interface Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLInterfaceStatechart()
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	EReference getUMLRealtimeStatechart_UMLInterfaceStatechart();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getBehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavioral Element</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getBehavioralElement()
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	EReference getUMLRealtimeStatechart_BehavioralElement();

	/**
	 * Returns the meta object for the map '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getProvidedMsgIFace <em>Provided Msg IFace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Provided Msg IFace</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getProvidedMsgIFace()
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	EReference getUMLRealtimeStatechart_ProvidedMsgIFace();

	/**
	 * Returns the meta object for the map '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getRequiredMsgIFace <em>Required Msg IFace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Required Msg IFace</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getRequiredMsgIFace()
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	EReference getUMLRealtimeStatechart_RequiredMsgIFace();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#isIsEmbedded <em>Is Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Embedded</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#isIsEmbedded()
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	EAttribute getUMLRealtimeStatechart_IsEmbedded();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLClocks <em>UML Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>UML Clocks</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLClocks()
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	EReference getUMLRealtimeStatechart_UMLClocks();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getHighestParentStatechart() <em>Get Highest Parent Statechart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Highest Parent Statechart</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getHighestParentStatechart()
	 * @generated
	 */
	EOperation getUMLRealtimeStatechart__GetHighestParentStatechart();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#iteratorOfAllSubRealtimeStatecharts() <em>Iterator Of All Sub Realtime Statecharts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Iterator Of All Sub Realtime Statecharts</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#iteratorOfAllSubRealtimeStatecharts()
	 * @generated
	 */
	EOperation getUMLRealtimeStatechart__IteratorOfAllSubRealtimeStatecharts();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#addAllUMLRealtimeStates(java.util.Set, boolean) <em>Add All UML Realtime States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add All UML Realtime States</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#addAllUMLRealtimeStates(java.util.Set, boolean)
	 * @generated
	 */
	EOperation getUMLRealtimeStatechart__AddAllUMLRealtimeStates__Set_boolean();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#addComplexUMLRealtimeStates(java.util.Set) <em>Add Complex UML Realtime States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Complex UML Realtime States</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#addComplexUMLRealtimeStates(java.util.Set)
	 * @generated
	 */
	EOperation getUMLRealtimeStatechart__AddComplexUMLRealtimeStates__Set();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#addAllUMLRealtimeTransitions(java.util.Set) <em>Add All UML Realtime Transitions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add All UML Realtime Transitions</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#addAllUMLRealtimeTransitions(java.util.Set)
	 * @generated
	 */
	EOperation getUMLRealtimeStatechart__AddAllUMLRealtimeTransitions__Set();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#iteratorOfAllUMLClocks(boolean) <em>Iterator Of All UML Clocks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Iterator Of All UML Clocks</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#iteratorOfAllUMLClocks(boolean)
	 * @generated
	 */
	EOperation getUMLRealtimeStatechart__IteratorOfAllUMLClocks__boolean();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#addAllUMLClocks(java.util.Set, boolean) <em>Add All UML Clocks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add All UML Clocks</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#addAllUMLClocks(java.util.Set, boolean)
	 * @generated
	 */
	EOperation getUMLRealtimeStatechart__AddAllUMLClocks__Set_boolean();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#toString()
	 * @generated
	 */
	EOperation getUMLRealtimeStatechart__ToString();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#clone()
	 * @generated
	 */
	EOperation getUMLRealtimeStatechart__Clone();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStopState <em>UML Realtime Stop State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Realtime Stop State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStopState
	 * @generated
	 */
	EClass getUMLRealtimeStopState();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStopState#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStopState) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStopState#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStopState)
	 * @generated
	 */
	EOperation getUMLRealtimeStopState__Clone__UMLRealtimeStatechart_UMLRealtimeStopState();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition <em>UML Realtime Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Realtime Transition</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition
	 * @generated
	 */
	EClass getUMLRealtimeTransition();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getUMLRealtimeTransitionMappingVector <em>UML Realtime Transition Mapping Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UML Realtime Transition Mapping Vector</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getUMLRealtimeTransitionMappingVector()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EAttribute getUMLRealtimeTransition_UMLRealtimeTransitionMappingVector();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getPriority()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EAttribute getUMLRealtimeTransition_Priority();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getSendSynchronization <em>Send Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Send Synchronization</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getSendSynchronization()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EReference getUMLRealtimeTransition_SendSynchronization();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getReceiveSynchronization <em>Receive Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receive Synchronization</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getReceiveSynchronization()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EReference getUMLRealtimeTransition_ReceiveSynchronization();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getSideEffect <em>Side Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Side Effect</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getSideEffect()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EReference getUMLRealtimeTransition_SideEffect();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getTargetUMLRealtimeState <em>Target UML Realtime State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target UML Realtime State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getTargetUMLRealtimeState()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EReference getUMLRealtimeTransition_TargetUMLRealtimeState();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getSourceUMLRealtimeState <em>Source UML Realtime State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source UML Realtime State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getSourceUMLRealtimeState()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EReference getUMLRealtimeTransition_SourceUMLRealtimeState();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>UML Realtime Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getUMLRealtimeStatechart()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EReference getUMLRealtimeTransition_UMLRealtimeStatechart();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getResets <em>Resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resets</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getResets()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EReference getUMLRealtimeTransition_Resets();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getUMLRealtimeFlatSwitching <em>UML Realtime Flat Switching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UML Realtime Flat Switching</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getUMLRealtimeFlatSwitching()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EReference getUMLRealtimeTransition_UMLRealtimeFlatSwitching();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getUMLRealtimeFadingFunction <em>UML Realtime Fading Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UML Realtime Fading Function</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getUMLRealtimeFadingFunction()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EReference getUMLRealtimeTransition_UMLRealtimeFadingFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getTriggerEvents <em>Trigger Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger Events</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getTriggerEvents()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EReference getUMLRealtimeTransition_TriggerEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getRaisedEvents <em>Raised Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Raised Events</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getRaisedEvents()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EReference getUMLRealtimeTransition_RaisedEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getTimeguard <em>Timeguard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timeguard</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getTimeguard()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EReference getUMLRealtimeTransition_Timeguard();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getAbsoluteDeadlines <em>Absolute Deadlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Absolute Deadlines</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getAbsoluteDeadlines()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EReference getUMLRealtimeTransition_AbsoluteDeadlines();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getRelativeDeadline <em>Relative Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relative Deadline</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getRelativeDeadline()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EReference getUMLRealtimeTransition_RelativeDeadline();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#isUrgent <em>Urgent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urgent</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#isUrgent()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EAttribute getUMLRealtimeTransition_Urgent();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getGuard()
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	EReference getUMLRealtimeTransition_Guard();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#hasClockInUMLClockResetAtom(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock) <em>Has Clock In UML Clock Reset Atom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Clock In UML Clock Reset Atom</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#hasClockInUMLClockResetAtom(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock)
	 * @generated
	 */
	EOperation getUMLRealtimeTransition__HasClockInUMLClockResetAtom__UMLClock();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#calculateWorstCaseDeadlineAsNaturalNumber() <em>Calculate Worst Case Deadline As Natural Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Worst Case Deadline As Natural Number</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#calculateWorstCaseDeadlineAsNaturalNumber()
	 * @generated
	 */
	EOperation getUMLRealtimeTransition__CalculateWorstCaseDeadlineAsNaturalNumber();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getDefaultName() <em>Get Default Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Name</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getDefaultName()
	 * @generated
	 */
	EOperation getUMLRealtimeTransition__GetDefaultName();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#resetsClock(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock) <em>Resets Clock</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resets Clock</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#resetsClock(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock)
	 * @generated
	 */
	EOperation getUMLRealtimeTransition__ResetsClock__UMLClock();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition)
	 * @generated
	 */
	EOperation getUMLRealtimeTransition__Clone__UMLRealtimeStatechart_UMLRealtimeTransition();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel <em>Synchronization Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization Channel</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel
	 * @generated
	 */
	EClass getSynchronizationChannel();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#getUMLRealtimeComplexState <em>UML Realtime Complex State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>UML Realtime Complex State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#getUMLRealtimeComplexState()
	 * @see #getSynchronizationChannel()
	 * @generated
	 */
	EReference getSynchronizationChannel_UMLRealtimeComplexState();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel)
	 * @generated
	 */
	EOperation getSynchronizationChannel__Clone__UMLRealtimeStatechart_SynchronizationChannel();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeguardAtom <em>UML Timeguard Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Timeguard Atom</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeguardAtom
	 * @generated
	 */
	EClass getUMLTimeguardAtom();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeguardAtom#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeguardAtom) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeguardAtom#clone(de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeguardAtom)
	 * @generated
	 */
	EOperation getUMLTimeguardAtom__Clone__UMLRealtimeStatechart_UMLTimeguardAtom();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryState <em>History State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryState
	 * @generated
	 */
	EClass getHistoryState();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryState#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryState#getKind()
	 * @see #getHistoryState()
	 * @generated
	 */
	EAttribute getHistoryState_Kind();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent <em>Do Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do Event</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent
	 * @generated
	 */
	EClass getDoEvent();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getUMLRealtimeAction <em>UML Realtime Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>UML Realtime Action</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getUMLRealtimeAction()
	 * @see #getDoEvent()
	 * @generated
	 */
	EReference getDoEvent_UMLRealtimeAction();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getDoActionRev <em>Do Action Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Do Action Rev</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getDoActionRev()
	 * @see #getDoEvent()
	 * @generated
	 */
	EReference getDoEvent_DoActionRev();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getPeriodLower <em>Period Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period Lower</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getPeriodLower()
	 * @see #getDoEvent()
	 * @generated
	 */
	EAttribute getDoEvent_PeriodLower();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getPeriodUpper <em>Period Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period Upper</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getPeriodUpper()
	 * @see #getDoEvent()
	 * @generated
	 */
	EAttribute getDoEvent_PeriodUpper();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent <em>Entry Or Exit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Or Exit Event</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent
	 * @generated
	 */
	EClass getEntryOrExitEvent();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getResets <em>Resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resets</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getResets()
	 * @see #getEntryOrExitEvent()
	 * @generated
	 */
	EReference getEntryOrExitEvent_Resets();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getEntryActionRev <em>Entry Action Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entry Action Rev</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getEntryActionRev()
	 * @see #getEntryOrExitEvent()
	 * @generated
	 */
	EReference getEntryOrExitEvent_EntryActionRev();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getExitActionRev <em>Exit Action Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Exit Action Rev</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getExitActionRev()
	 * @see #getEntryOrExitEvent()
	 * @generated
	 */
	EReference getEntryOrExitEvent_ExitActionRev();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getUMLRealtimeAction <em>UML Realtime Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>UML Realtime Action</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getUMLRealtimeAction()
	 * @see #getEntryOrExitEvent()
	 * @generated
	 */
	EReference getEntryOrExitEvent_UMLRealtimeAction();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization
	 * @generated
	 */
	EClass getSynchronization();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getSendSyncRev <em>Send Sync Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Send Sync Rev</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getSendSyncRev()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_SendSyncRev();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getReceiveSyncRev <em>Receive Sync Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receive Sync Rev</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getReceiveSyncRev()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_ReceiveSyncRev();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryKind <em>History Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>History Kind</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryKind
	 * @generated
	 */
	EEnum getHistoryKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RealtimestatechartFactory getRealtimestatechartFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DeadlineImpl <em>Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DeadlineImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getDeadline()
		 * @generated
		 */
		EClass DEADLINE = eINSTANCE.getDeadline();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEADLINE__UPPER_BOUND = eINSTANCE.getDeadline_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEADLINE__LOWER_BOUND = eINSTANCE.getDeadline_LowerBound();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.AbsoluteDeadlineImpl <em>Absolute Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.AbsoluteDeadlineImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getAbsoluteDeadline()
		 * @generated
		 */
		EClass ABSOLUTE_DEADLINE = eINSTANCE.getAbsoluteDeadline();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSOLUTE_DEADLINE__UML_REALTIME_TRANSITION = eINSTANCE.getAbsoluteDeadline_UMLRealtimeTransition();

		/**
		 * The meta object literal for the '<em><b>UML Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSOLUTE_DEADLINE__UML_CLOCK = eINSTANCE.getAbsoluteDeadline_UMLClock();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RelativeDeadlineImpl <em>Relative Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RelativeDeadlineImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getRelativeDeadline()
		 * @generated
		 */
		EClass RELATIVE_DEADLINE = eINSTANCE.getRelativeDeadline();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_DEADLINE__UML_REALTIME_TRANSITION = eINSTANCE.getRelativeDeadline_UMLRealtimeTransition();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLClockImpl <em>UML Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLClockImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLClock()
		 * @generated
		 */
		EClass UML_CLOCK = eINSTANCE.getUMLClock();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_CLOCK__ID = eINSTANCE.getUMLClock_Id();

		/**
		 * The meta object literal for the '<em><b>Absolute Deadlines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLOCK__ABSOLUTE_DEADLINES = eINSTANCE.getUMLClock_AbsoluteDeadlines();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Statechart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLOCK__UML_REALTIME_STATECHART = eINSTANCE.getUMLClock_UMLRealtimeStatechart();

		/**
		 * The meta object literal for the '<em><b>Resets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLOCK__RESETS = eINSTANCE.getUMLClock_Resets();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_CLOCK___TO_STRING = eINSTANCE.getUMLClock__ToString();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_CLOCK___CLONE__UMLREALTIMESTATECHART_UMLCLOCK = eINSTANCE.getUMLClock__Clone__UMLRealtimeStatechart_UMLClock();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeComplexStateImpl <em>UML Realtime Complex State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeComplexStateImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeComplexState()
		 * @generated
		 */
		EClass UML_REALTIME_COMPLEX_STATE = eINSTANCE.getUMLRealtimeComplexState();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Statecharts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_COMPLEX_STATE__UML_REALTIME_STATECHARTS = eINSTANCE.getUMLRealtimeComplexState_UMLRealtimeStatecharts();

		/**
		 * The meta object literal for the '<em><b>Do Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_COMPLEX_STATE__DO_ACTION = eINSTANCE.getUMLRealtimeComplexState_DoAction();

		/**
		 * The meta object literal for the '<em><b>Exit Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_COMPLEX_STATE__EXIT_ACTION = eINSTANCE.getUMLRealtimeComplexState_ExitAction();

		/**
		 * The meta object literal for the '<em><b>Entry Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_COMPLEX_STATE__ENTRY_ACTION = eINSTANCE.getUMLRealtimeComplexState_EntryAction();

		/**
		 * The meta object literal for the '<em><b>Reconf Diagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_COMPLEX_STATE__RECONF_DIAGRAM = eINSTANCE.getUMLRealtimeComplexState_ReconfDiagram();

		/**
		 * The meta object literal for the '<em><b>Interfaced States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_COMPLEX_STATE__INTERFACED_STATES = eINSTANCE.getUMLRealtimeComplexState_InterfacedStates();

		/**
		 * The meta object literal for the '<em><b>Interface State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_COMPLEX_STATE__INTERFACE_STATE = eINSTANCE.getUMLRealtimeComplexState_InterfaceState();

		/**
		 * The meta object literal for the '<em><b>Invariants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_COMPLEX_STATE__INVARIANTS = eINSTANCE.getUMLRealtimeComplexState_Invariants();

		/**
		 * The meta object literal for the '<em><b>Committed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_COMPLEX_STATE__COMMITTED = eINSTANCE.getUMLRealtimeComplexState_Committed();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_COMPLEX_STATE__CHANNELS = eINSTANCE.getUMLRealtimeComplexState_Channels();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_COMPLEX_STATE___CLONE__UMLREALTIMESTATECHART_UMLREALTIMECOMPLEXSTATE = eINSTANCE.getUMLRealtimeComplexState__Clone__UMLRealtimeStatechart_UMLRealtimeComplexState();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLInterfaceStatechartImpl <em>UML Interface Statechart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLInterfaceStatechartImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLInterfaceStatechart()
		 * @generated
		 */
		EClass UML_INTERFACE_STATECHART = eINSTANCE.getUMLInterfaceStatechart();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Statechart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_INTERFACE_STATECHART__UML_REALTIME_STATECHART = eINSTANCE.getUMLInterfaceStatechart_UMLRealtimeStatechart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLInvariantAtomImpl <em>UML Invariant Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLInvariantAtomImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLInvariantAtom()
		 * @generated
		 */
		EClass UML_INVARIANT_ATOM = eINSTANCE.getUMLInvariantAtom();

		/**
		 * The meta object literal for the '<em><b>UML Complex Realtime State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_INVARIANT_ATOM__UML_COMPLEX_REALTIME_STATE = eINSTANCE.getUMLInvariantAtom_UMLComplexRealtimeState();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_INVARIANT_ATOM___CLONE__UMLREALTIMESTATECHART_UMLINVARIANTATOM = eINSTANCE.getUMLInvariantAtom__Clone__UMLRealtimeStatechart_UMLInvariantAtom();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeActionImpl <em>UML Realtime Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeActionImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeAction()
		 * @generated
		 */
		EClass UML_REALTIME_ACTION = eINSTANCE.getUMLRealtimeAction();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_ACTION__ID = eINSTANCE.getUMLRealtimeAction_Id();

		/**
		 * The meta object literal for the '<em><b>Wcet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_ACTION__WCET = eINSTANCE.getUMLRealtimeAction_Wcet();

		/**
		 * The meta object literal for the '<em><b>Blocking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_ACTION__BLOCKING = eINSTANCE.getUMLRealtimeAction_Blocking();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_ACTION__UML_REALTIME_TRANSITION = eINSTANCE.getUMLRealtimeAction_UMLRealtimeTransition();

		/**
		 * The meta object literal for the '<em><b>Resets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_ACTION__RESETS = eINSTANCE.getUMLRealtimeAction_Resets();

		/**
		 * The meta object literal for the '<em><b>WCET Specified By User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_ACTION__WCET_SPECIFIED_BY_USER = eINSTANCE.getUMLRealtimeAction_WCETSpecifiedByUser();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_ACTION___CLONE__UMLREALTIMESTATECHART_UMLREALTIMEACTION = eINSTANCE.getUMLRealtimeAction__Clone__UMLRealtimeStatechart_UMLRealtimeAction();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeEventImpl <em>UML Realtime Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeEventImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeEvent()
		 * @generated
		 */
		EClass UML_REALTIME_EVENT = eINSTANCE.getUMLRealtimeEvent();

		/**
		 * The meta object literal for the '<em><b>Triggered UML Realtime Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION = eINSTANCE.getUMLRealtimeEvent_TriggeredUMLRealtimeTransition();

		/**
		 * The meta object literal for the '<em><b>Raised UML Realtime Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION = eINSTANCE.getUMLRealtimeEvent_RaisedUMLRealtimeTransition();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_EVENT__INSTANCE = eINSTANCE.getUMLRealtimeEvent_Instance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_EVENT__NAME = eINSTANCE.getUMLRealtimeEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Full Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_EVENT__FULL_EVENT_NAME = eINSTANCE.getUMLRealtimeEvent_FullEventName();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_EVENT___CLONE__UMLREALTIMESTATECHART_UMLREALTIMEEVENT = eINSTANCE.getUMLRealtimeEvent__Clone__UMLRealtimeStatechart_UMLRealtimeEvent();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_EVENT___TO_STRING = eINSTANCE.getUMLRealtimeEvent__ToString();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeFadingFunctionImpl <em>UML Realtime Fading Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeFadingFunctionImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeFadingFunction()
		 * @generated
		 */
		EClass UML_REALTIME_FADING_FUNCTION = eINSTANCE.getUMLRealtimeFadingFunction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_FADING_FUNCTION__FUNCTION = eINSTANCE.getUMLRealtimeFadingFunction_Function();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Transitions</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_FADING_FUNCTION__UML_REALTIME_TRANSITIONS = eINSTANCE.getUMLRealtimeFadingFunction_UMLRealtimeTransitions();

		/**
		 * The meta object literal for the '<em><b>Min Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_FADING_FUNCTION__MIN_DURATION = eINSTANCE.getUMLRealtimeFadingFunction_MinDuration();

		/**
		 * The meta object literal for the '<em><b>Max Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_FADING_FUNCTION__MAX_DURATION = eINSTANCE.getUMLRealtimeFadingFunction_MaxDuration();

		/**
		 * The meta object literal for the '<em><b>Spline1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_FADING_FUNCTION__SPLINE1 = eINSTANCE.getUMLRealtimeFadingFunction_Spline1();

		/**
		 * The meta object literal for the '<em><b>Spline2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_FADING_FUNCTION__SPLINE2 = eINSTANCE.getUMLRealtimeFadingFunction_Spline2();

		/**
		 * The meta object literal for the '<em><b>Polynom Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_FADING_FUNCTION__POLYNOM_DEGREE = eINSTANCE.getUMLRealtimeFadingFunction_PolynomDegree();

		/**
		 * The meta object literal for the '<em><b>Ports By Component Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_FADING_FUNCTION__PORTS_BY_COMPONENT_INSTANCE = eINSTANCE.getUMLRealtimeFadingFunction_PortsByComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Port Inst To Port Inst Map Entry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_FADING_FUNCTION__PORT_INST_TO_PORT_INST_MAP_ENTRY = eINSTANCE.getUMLRealtimeFadingFunction_PortInstToPortInstMapEntry();

		/**
		 * The meta object literal for the '<em><b>Get Breakpoint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_FADING_FUNCTION___GET_BREAKPOINT = eINSTANCE.getUMLRealtimeFadingFunction__GetBreakpoint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeFlatSwitchingImpl <em>UML Realtime Flat Switching</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeFlatSwitchingImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeFlatSwitching()
		 * @generated
		 */
		EClass UML_REALTIME_FLAT_SWITCHING = eINSTANCE.getUMLRealtimeFlatSwitching();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_FLAT_SWITCHING__UML_REALTIME_TRANSITIONS = eINSTANCE.getUMLRealtimeFlatSwitching_UMLRealtimeTransitions();

		/**
		 * The meta object literal for the '<em><b>Min Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_FLAT_SWITCHING__MIN_DURATION = eINSTANCE.getUMLRealtimeFlatSwitching_MinDuration();

		/**
		 * The meta object literal for the '<em><b>Max Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_FLAT_SWITCHING__MAX_DURATION = eINSTANCE.getUMLRealtimeFlatSwitching_MaxDuration();

		/**
		 * The meta object literal for the '<em><b>Spline1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_FLAT_SWITCHING__SPLINE1 = eINSTANCE.getUMLRealtimeFlatSwitching_Spline1();

		/**
		 * The meta object literal for the '<em><b>Spline2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_FLAT_SWITCHING__SPLINE2 = eINSTANCE.getUMLRealtimeFlatSwitching_Spline2();

		/**
		 * The meta object literal for the '<em><b>Polynom Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_FLAT_SWITCHING__POLYNOM_DEGREE = eINSTANCE.getUMLRealtimeFlatSwitching_PolynomDegree();

		/**
		 * The meta object literal for the '<em><b>Port Inst To Port Inst Map Entry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_FLAT_SWITCHING__PORT_INST_TO_PORT_INST_MAP_ENTRY = eINSTANCE.getUMLRealtimeFlatSwitching_PortInstToPortInstMapEntry();

		/**
		 * The meta object literal for the '<em><b>Get Breakpoint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_FLAT_SWITCHING___GET_BREAKPOINT = eINSTANCE.getUMLRealtimeFlatSwitching__GetBreakpoint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStartStateImpl <em>UML Realtime Start State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStartStateImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeStartState()
		 * @generated
		 */
		EClass UML_REALTIME_START_STATE = eINSTANCE.getUMLRealtimeStartState();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Start State Rev</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_START_STATE__UML_REALTIME_START_STATE_REV = eINSTANCE.getUMLRealtimeStartState_UMLRealtimeStartStateRev();

		/**
		 * The meta object literal for the '<em><b>Get Next State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_START_STATE___GET_NEXT_STATE = eINSTANCE.getUMLRealtimeStartState__GetNextState();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_START_STATE___CLONE__UMLREALTIMESTATECHART_UMLREALTIMESTARTSTATE = eINSTANCE.getUMLRealtimeStartState__Clone__UMLRealtimeStatechart_UMLRealtimeStartState();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStateImpl <em>UML Realtime State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStateImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeState()
		 * @generated
		 */
		EClass UML_REALTIME_STATE = eINSTANCE.getUMLRealtimeState();

		/**
		 * The meta object literal for the '<em><b>Outgoing UML Realtime Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_STATE__OUTGOING_UML_REALTIME_TRANSITIONS = eINSTANCE.getUMLRealtimeState_OutgoingUMLRealtimeTransitions();

		/**
		 * The meta object literal for the '<em><b>Incoming UML Realtime Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_STATE__INCOMING_UML_REALTIME_TRANSITIONS = eINSTANCE.getUMLRealtimeState_IncomingUMLRealtimeTransitions();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Statechart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_STATE__UML_REALTIME_STATECHART = eINSTANCE.getUMLRealtimeState_UMLRealtimeStatechart();

		/**
		 * The meta object literal for the '<em><b>Get Long Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_STATE___GET_LONG_NAME = eINSTANCE.getUMLRealtimeState__GetLongName();

		/**
		 * The meta object literal for the '<em><b>Get Root Realtime Statechart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_STATE___GET_ROOT_REALTIME_STATECHART = eINSTANCE.getUMLRealtimeState__GetRootRealtimeStatechart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStatechartImpl <em>UML Realtime Statechart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStatechartImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeStatechart()
		 * @generated
		 */
		EClass UML_REALTIME_STATECHART = eINSTANCE.getUMLRealtimeStatechart();

		/**
		 * The meta object literal for the '<em><b>Event Queue Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_STATECHART__EVENT_QUEUE_SIZE = eINSTANCE.getUMLRealtimeStatechart_EventQueueSize();

		/**
		 * The meta object literal for the '<em><b>Wcet Document</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_STATECHART__WCET_DOCUMENT = eINSTANCE.getUMLRealtimeStatechart_WcetDocument();

		/**
		 * The meta object literal for the '<em><b>Security Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_STATECHART__SECURITY_LEVEL = eINSTANCE.getUMLRealtimeStatechart_SecurityLevel();

		/**
		 * The meta object literal for the '<em><b>System Wcet Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_STATECHART__SYSTEM_WCET_MAP = eINSTANCE.getUMLRealtimeStatechart_SystemWcetMap();

		/**
		 * The meta object literal for the '<em><b>Utilisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_STATECHART__UTILISATION = eINSTANCE.getUMLRealtimeStatechart_Utilisation();

		/**
		 * The meta object literal for the '<em><b>Schedule Document</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_STATECHART__SCHEDULE_DOCUMENT = eINSTANCE.getUMLRealtimeStatechart_ScheduleDocument();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Start State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_STATECHART__UML_REALTIME_START_STATE = eINSTANCE.getUMLRealtimeStatechart_UMLRealtimeStartState();

		/**
		 * The meta object literal for the '<em><b>UML Complex Realtime State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_STATECHART__UML_COMPLEX_REALTIME_STATE = eINSTANCE.getUMLRealtimeStatechart_UMLComplexRealtimeState();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_STATECHART__UML_REALTIME_TRANSITIONS = eINSTANCE.getUMLRealtimeStatechart_UMLRealtimeTransitions();

		/**
		 * The meta object literal for the '<em><b>UML Realtime States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_STATECHART__UML_REALTIME_STATES = eINSTANCE.getUMLRealtimeStatechart_UMLRealtimeStates();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_STATECHART__ECLASS = eINSTANCE.getUMLRealtimeStatechart_EClass();

		/**
		 * The meta object literal for the '<em><b>UML Interface Statechart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_STATECHART__UML_INTERFACE_STATECHART = eINSTANCE.getUMLRealtimeStatechart_UMLInterfaceStatechart();

		/**
		 * The meta object literal for the '<em><b>Behavioral Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_STATECHART__BEHAVIORAL_ELEMENT = eINSTANCE.getUMLRealtimeStatechart_BehavioralElement();

		/**
		 * The meta object literal for the '<em><b>Provided Msg IFace</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_STATECHART__PROVIDED_MSG_IFACE = eINSTANCE.getUMLRealtimeStatechart_ProvidedMsgIFace();

		/**
		 * The meta object literal for the '<em><b>Required Msg IFace</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_STATECHART__REQUIRED_MSG_IFACE = eINSTANCE.getUMLRealtimeStatechart_RequiredMsgIFace();

		/**
		 * The meta object literal for the '<em><b>Is Embedded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_STATECHART__IS_EMBEDDED = eINSTANCE.getUMLRealtimeStatechart_IsEmbedded();

		/**
		 * The meta object literal for the '<em><b>UML Clocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_STATECHART__UML_CLOCKS = eINSTANCE.getUMLRealtimeStatechart_UMLClocks();

		/**
		 * The meta object literal for the '<em><b>Get Highest Parent Statechart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_STATECHART___GET_HIGHEST_PARENT_STATECHART = eINSTANCE.getUMLRealtimeStatechart__GetHighestParentStatechart();

		/**
		 * The meta object literal for the '<em><b>Iterator Of All Sub Realtime Statecharts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_STATECHART___ITERATOR_OF_ALL_SUB_REALTIME_STATECHARTS = eINSTANCE.getUMLRealtimeStatechart__IteratorOfAllSubRealtimeStatecharts();

		/**
		 * The meta object literal for the '<em><b>Add All UML Realtime States</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN = eINSTANCE.getUMLRealtimeStatechart__AddAllUMLRealtimeStates__Set_boolean();

		/**
		 * The meta object literal for the '<em><b>Add Complex UML Realtime States</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET = eINSTANCE.getUMLRealtimeStatechart__AddComplexUMLRealtimeStates__Set();

		/**
		 * The meta object literal for the '<em><b>Add All UML Realtime Transitions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET = eINSTANCE.getUMLRealtimeStatechart__AddAllUMLRealtimeTransitions__Set();

		/**
		 * The meta object literal for the '<em><b>Iterator Of All UML Clocks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN = eINSTANCE.getUMLRealtimeStatechart__IteratorOfAllUMLClocks__boolean();

		/**
		 * The meta object literal for the '<em><b>Add All UML Clocks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN = eINSTANCE.getUMLRealtimeStatechart__AddAllUMLClocks__Set_boolean();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_STATECHART___TO_STRING = eINSTANCE.getUMLRealtimeStatechart__ToString();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_STATECHART___CLONE = eINSTANCE.getUMLRealtimeStatechart__Clone();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStopStateImpl <em>UML Realtime Stop State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStopStateImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeStopState()
		 * @generated
		 */
		EClass UML_REALTIME_STOP_STATE = eINSTANCE.getUMLRealtimeStopState();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_STOP_STATE___CLONE__UMLREALTIMESTATECHART_UMLREALTIMESTOPSTATE = eINSTANCE.getUMLRealtimeStopState__Clone__UMLRealtimeStatechart_UMLRealtimeStopState();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl <em>UML Realtime Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLRealtimeTransition()
		 * @generated
		 */
		EClass UML_REALTIME_TRANSITION = eINSTANCE.getUMLRealtimeTransition();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Transition Mapping Vector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR = eINSTANCE.getUMLRealtimeTransition_UMLRealtimeTransitionMappingVector();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_TRANSITION__PRIORITY = eINSTANCE.getUMLRealtimeTransition_Priority();

		/**
		 * The meta object literal for the '<em><b>Send Synchronization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_TRANSITION__SEND_SYNCHRONIZATION = eINSTANCE.getUMLRealtimeTransition_SendSynchronization();

		/**
		 * The meta object literal for the '<em><b>Receive Synchronization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_TRANSITION__RECEIVE_SYNCHRONIZATION = eINSTANCE.getUMLRealtimeTransition_ReceiveSynchronization();

		/**
		 * The meta object literal for the '<em><b>Side Effect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_TRANSITION__SIDE_EFFECT = eINSTANCE.getUMLRealtimeTransition_SideEffect();

		/**
		 * The meta object literal for the '<em><b>Target UML Realtime State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_TRANSITION__TARGET_UML_REALTIME_STATE = eINSTANCE.getUMLRealtimeTransition_TargetUMLRealtimeState();

		/**
		 * The meta object literal for the '<em><b>Source UML Realtime State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_TRANSITION__SOURCE_UML_REALTIME_STATE = eINSTANCE.getUMLRealtimeTransition_SourceUMLRealtimeState();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Statechart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_TRANSITION__UML_REALTIME_STATECHART = eINSTANCE.getUMLRealtimeTransition_UMLRealtimeStatechart();

		/**
		 * The meta object literal for the '<em><b>Resets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_TRANSITION__RESETS = eINSTANCE.getUMLRealtimeTransition_Resets();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Flat Switching</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_TRANSITION__UML_REALTIME_FLAT_SWITCHING = eINSTANCE.getUMLRealtimeTransition_UMLRealtimeFlatSwitching();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Fading Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_TRANSITION__UML_REALTIME_FADING_FUNCTION = eINSTANCE.getUMLRealtimeTransition_UMLRealtimeFadingFunction();

		/**
		 * The meta object literal for the '<em><b>Trigger Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_TRANSITION__TRIGGER_EVENTS = eINSTANCE.getUMLRealtimeTransition_TriggerEvents();

		/**
		 * The meta object literal for the '<em><b>Raised Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_TRANSITION__RAISED_EVENTS = eINSTANCE.getUMLRealtimeTransition_RaisedEvents();

		/**
		 * The meta object literal for the '<em><b>Timeguard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_TRANSITION__TIMEGUARD = eINSTANCE.getUMLRealtimeTransition_Timeguard();

		/**
		 * The meta object literal for the '<em><b>Absolute Deadlines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_TRANSITION__ABSOLUTE_DEADLINES = eINSTANCE.getUMLRealtimeTransition_AbsoluteDeadlines();

		/**
		 * The meta object literal for the '<em><b>Relative Deadline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_TRANSITION__RELATIVE_DEADLINE = eINSTANCE.getUMLRealtimeTransition_RelativeDeadline();

		/**
		 * The meta object literal for the '<em><b>Urgent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_REALTIME_TRANSITION__URGENT = eINSTANCE.getUMLRealtimeTransition_Urgent();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_REALTIME_TRANSITION__GUARD = eINSTANCE.getUMLRealtimeTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Has Clock In UML Clock Reset Atom</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_TRANSITION___HAS_CLOCK_IN_UML_CLOCK_RESET_ATOM__UMLCLOCK = eINSTANCE.getUMLRealtimeTransition__HasClockInUMLClockResetAtom__UMLClock();

		/**
		 * The meta object literal for the '<em><b>Calculate Worst Case Deadline As Natural Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_TRANSITION___CALCULATE_WORST_CASE_DEADLINE_AS_NATURAL_NUMBER = eINSTANCE.getUMLRealtimeTransition__CalculateWorstCaseDeadlineAsNaturalNumber();

		/**
		 * The meta object literal for the '<em><b>Get Default Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_TRANSITION___GET_DEFAULT_NAME = eINSTANCE.getUMLRealtimeTransition__GetDefaultName();

		/**
		 * The meta object literal for the '<em><b>Resets Clock</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_TRANSITION___RESETS_CLOCK__UMLCLOCK = eINSTANCE.getUMLRealtimeTransition__ResetsClock__UMLClock();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_REALTIME_TRANSITION___CLONE__UMLREALTIMESTATECHART_UMLREALTIMETRANSITION = eINSTANCE.getUMLRealtimeTransition__Clone__UMLRealtimeStatechart_UMLRealtimeTransition();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationChannelImpl <em>Synchronization Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationChannelImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronizationChannel()
		 * @generated
		 */
		EClass SYNCHRONIZATION_CHANNEL = eINSTANCE.getSynchronizationChannel();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Complex State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION_CHANNEL__UML_REALTIME_COMPLEX_STATE = eINSTANCE.getSynchronizationChannel_UMLRealtimeComplexState();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYNCHRONIZATION_CHANNEL___CLONE__UMLREALTIMESTATECHART_SYNCHRONIZATIONCHANNEL = eINSTANCE.getSynchronizationChannel__Clone__UMLRealtimeStatechart_SynchronizationChannel();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLTimeguardAtomImpl <em>UML Timeguard Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLTimeguardAtomImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getUMLTimeguardAtom()
		 * @generated
		 */
		EClass UML_TIMEGUARD_ATOM = eINSTANCE.getUMLTimeguardAtom();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_TIMEGUARD_ATOM___CLONE__UMLREALTIMESTATECHART_UMLTIMEGUARDATOM = eINSTANCE.getUMLTimeguardAtom__Clone__UMLRealtimeStatechart_UMLTimeguardAtom();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.HistoryStateImpl <em>History State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.HistoryStateImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getHistoryState()
		 * @generated
		 */
		EClass HISTORY_STATE = eINSTANCE.getHistoryState();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORY_STATE__KIND = eINSTANCE.getHistoryState_Kind();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DoEventImpl <em>Do Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DoEventImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getDoEvent()
		 * @generated
		 */
		EClass DO_EVENT = eINSTANCE.getDoEvent();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_EVENT__UML_REALTIME_ACTION = eINSTANCE.getDoEvent_UMLRealtimeAction();

		/**
		 * The meta object literal for the '<em><b>Do Action Rev</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_EVENT__DO_ACTION_REV = eINSTANCE.getDoEvent_DoActionRev();

		/**
		 * The meta object literal for the '<em><b>Period Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DO_EVENT__PERIOD_LOWER = eINSTANCE.getDoEvent_PeriodLower();

		/**
		 * The meta object literal for the '<em><b>Period Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DO_EVENT__PERIOD_UPPER = eINSTANCE.getDoEvent_PeriodUpper();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.EntryOrExitEventImpl <em>Entry Or Exit Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.EntryOrExitEventImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryOrExitEvent()
		 * @generated
		 */
		EClass ENTRY_OR_EXIT_EVENT = eINSTANCE.getEntryOrExitEvent();

		/**
		 * The meta object literal for the '<em><b>Resets</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_OR_EXIT_EVENT__RESETS = eINSTANCE.getEntryOrExitEvent_Resets();

		/**
		 * The meta object literal for the '<em><b>Entry Action Rev</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_OR_EXIT_EVENT__ENTRY_ACTION_REV = eINSTANCE.getEntryOrExitEvent_EntryActionRev();

		/**
		 * The meta object literal for the '<em><b>Exit Action Rev</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_OR_EXIT_EVENT__EXIT_ACTION_REV = eINSTANCE.getEntryOrExitEvent_ExitActionRev();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_OR_EXIT_EVENT__UML_REALTIME_ACTION = eINSTANCE.getEntryOrExitEvent_UMLRealtimeAction();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationImpl <em>Synchronization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronization()
		 * @generated
		 */
		EClass SYNCHRONIZATION = eINSTANCE.getSynchronization();

		/**
		 * The meta object literal for the '<em><b>Send Sync Rev</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION__SEND_SYNC_REV = eINSTANCE.getSynchronization_SendSyncRev();

		/**
		 * The meta object literal for the '<em><b>Receive Sync Rev</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION__RECEIVE_SYNC_REV = eINSTANCE.getSynchronization_ReceiveSyncRev();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryKind <em>History Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryKind
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getHistoryKind()
		 * @generated
		 */
		EEnum HISTORY_KIND = eINSTANCE.getHistoryKind();

	}

} //RealtimestatechartPackage
