/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;
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
	 * The feature id for the '<em><b>UML Realtime Transition</b></em>' container reference.
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ClockImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__ANNOTATION = SDMPackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__EXTENSION = SDMPackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__NAME = SDMPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__ID = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Absolute Deadlines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__ABSOLUTE_DEADLINES = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__STATECHART = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__RESETS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Clock Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__CLOCK_CONSTRAINTS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ECLASS = SDMPackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___EIS_PROXY = SDMPackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ERESOURCE = SDMPackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ECONTAINER = SDMPackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ECONTAINING_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ECONTAINMENT_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ECONTENTS = SDMPackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___EALL_CONTENTS = SDMPackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ECROSS_REFERENCES = SDMPackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___EGET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___EUNSET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___EINVOKE__EOPERATION_ELIST = SDMPackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___GET_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___PROVIDE_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___GET_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___PROVIDE_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___TO_STRING = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___CLONE__ABSTRACTSTATECHART_CLOCK = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_OPERATION_COUNT = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.VertexImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__ANNOTATION = SDMPackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__EXTENSION = SDMPackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NAME = SDMPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__OUTGOING_TRANSITIONS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__INCOMING_TRANSITIONS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__STATECHART = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ECLASS = SDMPackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___EIS_PROXY = SDMPackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ERESOURCE = SDMPackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ECONTAINER = SDMPackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ECONTAINING_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ECONTAINMENT_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ECONTENTS = SDMPackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___EALL_CONTENTS = SDMPackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ECROSS_REFERENCES = SDMPackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___EGET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___EUNSET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___EINVOKE__EOPERATION_ELIST = SDMPackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___GET_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___PROVIDE_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___GET_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___PROVIDE_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Long Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___GET_LONG_NAME = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Root Realtime Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___GET_ROOT_REALTIME_STATECHART = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_OPERATION_COUNT = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.StateImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getState()
	 * @generated
	 */
	int STATE = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ANNOTATION = VERTEX__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXTENSION = VERTEX__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITIONS = VERTEX__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITIONS = VERTEX__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATECHART = VERTEX__STATECHART;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REGIONS = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Do Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DO_ACTION = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exit Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXIT_ACTION = VERTEX_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entry Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENTRY_ACTION = VERTEX_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reconf Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__RECONF_DIAGRAM = VERTEX_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Interfaced States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INTERFACED_STATES = VERTEX_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interface State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INTERFACE_STATE = VERTEX_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INVARIANTS = VERTEX_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Committed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__COMMITTED = VERTEX_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CHANNELS = VERTEX_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ECLASS = VERTEX___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___EIS_PROXY = VERTEX___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ERESOURCE = VERTEX___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ECONTAINER = VERTEX___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ECONTAINING_FEATURE = VERTEX___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ECONTAINMENT_FEATURE = VERTEX___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ECONTENTS = VERTEX___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___EALL_CONTENTS = VERTEX___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ECROSS_REFERENCES = VERTEX___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___EGET__ESTRUCTURALFEATURE = VERTEX___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___EGET__ESTRUCTURALFEATURE_BOOLEAN = VERTEX___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ESET__ESTRUCTURALFEATURE_OBJECT = VERTEX___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___EIS_SET__ESTRUCTURALFEATURE = VERTEX___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___EUNSET__ESTRUCTURALFEATURE = VERTEX___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___EINVOKE__EOPERATION_ELIST = VERTEX___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___GET_EXTENSION__ECLASS = VERTEX___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___PROVIDE_EXTENSION__ECLASS = VERTEX___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___GET_ANNOTATION__STRING = VERTEX___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___PROVIDE_ANNOTATION__STRING = VERTEX___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Long Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___GET_LONG_NAME = VERTEX___GET_LONG_NAME;

	/**
	 * The operation id for the '<em>Get Root Realtime Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___GET_ROOT_REALTIME_STATECHART = VERTEX___GET_ROOT_REALTIME_STATECHART;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___CLONE__ABSTRACTSTATECHART_STATE = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 1;

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
	int UML_INTERFACE_STATECHART__ANNOTATION = CorePackage.ABSTRACT_STATECHART__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__EXTENSION = CorePackage.ABSTRACT_STATECHART__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__NAME = CorePackage.ABSTRACT_STATECHART__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__COMMENT = CorePackage.ABSTRACT_STATECHART__COMMENT;

	/**
	 * The feature id for the '<em><b>Event Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__EVENT_QUEUE_SIZE = CorePackage.ABSTRACT_STATECHART__EVENT_QUEUE_SIZE;

	/**
	 * The feature id for the '<em><b>Wcet Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__WCET_DOCUMENT = CorePackage.ABSTRACT_STATECHART__WCET_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__SECURITY_LEVEL = CorePackage.ABSTRACT_STATECHART__SECURITY_LEVEL;

	/**
	 * The feature id for the '<em><b>System Wcet Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__SYSTEM_WCET_MAP = CorePackage.ABSTRACT_STATECHART__SYSTEM_WCET_MAP;

	/**
	 * The feature id for the '<em><b>Utilisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__UTILISATION = CorePackage.ABSTRACT_STATECHART__UTILISATION;

	/**
	 * The feature id for the '<em><b>Schedule Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__SCHEDULE_DOCUMENT = CorePackage.ABSTRACT_STATECHART__SCHEDULE_DOCUMENT;

	/**
	 * The feature id for the '<em><b>UML Realtime Start State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__UML_REALTIME_START_STATE = CorePackage.ABSTRACT_STATECHART__UML_REALTIME_START_STATE;

	/**
	 * The feature id for the '<em><b>UML Complex Realtime State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__UML_COMPLEX_REALTIME_STATE = CorePackage.ABSTRACT_STATECHART__UML_COMPLEX_REALTIME_STATE;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__TRANSITIONS = CorePackage.ABSTRACT_STATECHART__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__VERTICES = CorePackage.ABSTRACT_STATECHART__VERTICES;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__ECLASS = CorePackage.ABSTRACT_STATECHART__ECLASS;

	/**
	 * The feature id for the '<em><b>UML Interface Statechart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__UML_INTERFACE_STATECHART = CorePackage.ABSTRACT_STATECHART__UML_INTERFACE_STATECHART;

	/**
	 * The feature id for the '<em><b>Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__BEHAVIORAL_ELEMENT = CorePackage.ABSTRACT_STATECHART__BEHAVIORAL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Provided Msg IFace</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__PROVIDED_MSG_IFACE = CorePackage.ABSTRACT_STATECHART__PROVIDED_MSG_IFACE;

	/**
	 * The feature id for the '<em><b>Required Msg IFace</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__REQUIRED_MSG_IFACE = CorePackage.ABSTRACT_STATECHART__REQUIRED_MSG_IFACE;

	/**
	 * The feature id for the '<em><b>Is Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__IS_EMBEDDED = CorePackage.ABSTRACT_STATECHART__IS_EMBEDDED;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__CLOCKS = CorePackage.ABSTRACT_STATECHART__CLOCKS;

	/**
	 * The feature id for the '<em><b>Embedding Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__EMBEDDING_REGION = CorePackage.ABSTRACT_STATECHART__EMBEDDING_REGION;

	/**
	 * The feature id for the '<em><b>UML Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART__UML_REALTIME_STATECHART = CorePackage.ABSTRACT_STATECHART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Interface Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART_FEATURE_COUNT = CorePackage.ABSTRACT_STATECHART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ECLASS = CorePackage.ABSTRACT_STATECHART___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___EIS_PROXY = CorePackage.ABSTRACT_STATECHART___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ERESOURCE = CorePackage.ABSTRACT_STATECHART___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ECONTAINER = CorePackage.ABSTRACT_STATECHART___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ECONTAINING_FEATURE = CorePackage.ABSTRACT_STATECHART___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ECONTAINMENT_FEATURE = CorePackage.ABSTRACT_STATECHART___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ECONTENTS = CorePackage.ABSTRACT_STATECHART___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___EALL_CONTENTS = CorePackage.ABSTRACT_STATECHART___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ECROSS_REFERENCES = CorePackage.ABSTRACT_STATECHART___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___EGET__ESTRUCTURALFEATURE = CorePackage.ABSTRACT_STATECHART___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.ABSTRACT_STATECHART___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.ABSTRACT_STATECHART___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___EIS_SET__ESTRUCTURALFEATURE = CorePackage.ABSTRACT_STATECHART___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___EUNSET__ESTRUCTURALFEATURE = CorePackage.ABSTRACT_STATECHART___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___EINVOKE__EOPERATION_ELIST = CorePackage.ABSTRACT_STATECHART___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___GET_EXTENSION__ECLASS = CorePackage.ABSTRACT_STATECHART___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___PROVIDE_EXTENSION__ECLASS = CorePackage.ABSTRACT_STATECHART___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___GET_ANNOTATION__STRING = CorePackage.ABSTRACT_STATECHART___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___PROVIDE_ANNOTATION__STRING = CorePackage.ABSTRACT_STATECHART___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Highest Parent Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___GET_HIGHEST_PARENT_STATECHART = CorePackage.ABSTRACT_STATECHART___GET_HIGHEST_PARENT_STATECHART;

	/**
	 * The operation id for the '<em>Add All UML Realtime States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN = CorePackage.ABSTRACT_STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN;

	/**
	 * The operation id for the '<em>Add Complex UML Realtime States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET = CorePackage.ABSTRACT_STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET;

	/**
	 * The operation id for the '<em>Add All UML Realtime Transitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET = CorePackage.ABSTRACT_STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET;

	/**
	 * The operation id for the '<em>Iterator Of All UML Clocks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN = CorePackage.ABSTRACT_STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN;

	/**
	 * The operation id for the '<em>Add All UML Clocks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN = CorePackage.ABSTRACT_STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___TO_STRING = CorePackage.ABSTRACT_STATECHART___TO_STRING;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART___CLONE = CorePackage.ABSTRACT_STATECHART___CLONE;

	/**
	 * The number of operations of the '<em>UML Interface Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERFACE_STATECHART_OPERATION_COUNT = CorePackage.ABSTRACT_STATECHART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ActionImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE = ExpressionsPackage.EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__GENERIC_TYPE = ExpressionsPackage.EXPRESSION__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wcet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__WCET = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blocking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__BLOCKING = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>UML Realtime Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__UML_REALTIME_TRANSITION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RESETS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>WCET Specified By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__WCET_SPECIFIED_BY_USER = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ECLASS = ExpressionsPackage.EXPRESSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___EIS_PROXY = ExpressionsPackage.EXPRESSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ERESOURCE = ExpressionsPackage.EXPRESSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ECONTAINER = ExpressionsPackage.EXPRESSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ECONTAINING_FEATURE = ExpressionsPackage.EXPRESSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ECONTAINMENT_FEATURE = ExpressionsPackage.EXPRESSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ECONTENTS = ExpressionsPackage.EXPRESSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___EALL_CONTENTS = ExpressionsPackage.EXPRESSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ECROSS_REFERENCES = ExpressionsPackage.EXPRESSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___EGET__ESTRUCTURALFEATURE = ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = ExpressionsPackage.EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___EIS_SET__ESTRUCTURALFEATURE = ExpressionsPackage.EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___EUNSET__ESTRUCTURALFEATURE = ExpressionsPackage.EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___EINVOKE__EOPERATION_ELIST = ExpressionsPackage.EXPRESSION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___GET_EXTENSION__ECLASS = ExpressionsPackage.EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___PROVIDE_EXTENSION__ECLASS = ExpressionsPackage.EXPRESSION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___GET_ANNOTATION__STRING = ExpressionsPackage.EXPRESSION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___PROVIDE_ANNOTATION__STRING = ExpressionsPackage.EXPRESSION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___CLONE__ABSTRACTSTATECHART_ACTION = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimeEventImpl <em>Realtime Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimeEventImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getRealtimeEvent()
	 * @generated
	 */
	int REALTIME_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT__ANNOTATION = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT__EXTENSION = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT__TYPE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT__GENERIC_TYPE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT__COMMENT = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT__OWNED_PARAMETER_BINDINGS = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT__CALLEE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__CALLEE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT__TARGET = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__TARGET;

	/**
	 * The feature id for the '<em><b>Opaque Callable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT__OPAQUE_CALLABLE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE;

	/**
	 * The feature id for the '<em><b>Triggered UML Realtime Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Raised UML Realtime Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT__INSTANCE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT__NAME = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Full Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT__FULL_EVENT_NAME = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Realtime Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT_FEATURE_COUNT = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___ECLASS = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___EIS_PROXY = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___ERESOURCE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___ECONTAINER = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___ECONTAINING_FEATURE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___ECONTAINMENT_FEATURE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___ECONTENTS = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___EALL_CONTENTS = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___ECROSS_REFERENCES = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___EGET__ESTRUCTURALFEATURE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___ESET__ESTRUCTURALFEATURE_OBJECT = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___EIS_SET__ESTRUCTURALFEATURE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___EUNSET__ESTRUCTURALFEATURE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___EINVOKE__EOPERATION_ELIST = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___GET_EXTENSION__ECLASS = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___PROVIDE_EXTENSION__ECLASS = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___GET_ANNOTATION__STRING = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___PROVIDE_ANNOTATION__STRING = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___CLONE__ABSTRACTSTATECHART_REALTIMEEVENT = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT___TO_STRING = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Realtime Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_EVENT_OPERATION_COUNT = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FadingFunctionImpl <em>Fading Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FadingFunctionImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getFadingFunction()
	 * @generated
	 */
	int FADING_FUNCTION = 8;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION__FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>UML Realtime Transitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION__UML_REALTIME_TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Min Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION__MIN_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION__MAX_DURATION = 3;

	/**
	 * The feature id for the '<em><b>Spline1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION__SPLINE1 = 4;

	/**
	 * The feature id for the '<em><b>Spline2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION__SPLINE2 = 5;

	/**
	 * The feature id for the '<em><b>Polynom Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION__POLYNOM_DEGREE = 6;

	/**
	 * The feature id for the '<em><b>Ports By Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION__PORTS_BY_COMPONENT_INSTANCE = 7;

	/**
	 * The number of structural features of the '<em>Fading Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Get Breakpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION___GET_BREAKPOINT = 0;

	/**
	 * The number of operations of the '<em>Fading Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADING_FUNCTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FlatSwitchingImpl <em>Flat Switching</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FlatSwitchingImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getFlatSwitching()
	 * @generated
	 */
	int FLAT_SWITCHING = 9;

	/**
	 * The feature id for the '<em><b>UML Realtime Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_SWITCHING__UML_REALTIME_TRANSITIONS = 0;

	/**
	 * The feature id for the '<em><b>Min Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_SWITCHING__MIN_DURATION = 1;

	/**
	 * The feature id for the '<em><b>Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_SWITCHING__MAX_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Spline1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_SWITCHING__SPLINE1 = 3;

	/**
	 * The feature id for the '<em><b>Spline2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_SWITCHING__SPLINE2 = 4;

	/**
	 * The feature id for the '<em><b>Polynom Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_SWITCHING__POLYNOM_DEGREE = 5;

	/**
	 * The feature id for the '<em><b>Port Inst To Port Inst Map Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_SWITCHING__PORT_INST_TO_PORT_INST_MAP_ENTRY = 6;

	/**
	 * The number of structural features of the '<em>Flat Switching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_SWITCHING_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get Breakpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_SWITCHING___GET_BREAKPOINT = 0;

	/**
	 * The number of operations of the '<em>Flat Switching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_SWITCHING_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.InitialStateImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ANNOTATION = VERTEX__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__EXTENSION = VERTEX__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__OUTGOING_TRANSITIONS = VERTEX__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__INCOMING_TRANSITIONS = VERTEX__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__STATECHART = VERTEX__STATECHART;

	/**
	 * The feature id for the '<em><b>UML Realtime Start State Rev</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__UML_REALTIME_START_STATE_REV = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___ECLASS = VERTEX___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___EIS_PROXY = VERTEX___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___ERESOURCE = VERTEX___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___ECONTAINER = VERTEX___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___ECONTAINING_FEATURE = VERTEX___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___ECONTAINMENT_FEATURE = VERTEX___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___ECONTENTS = VERTEX___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___EALL_CONTENTS = VERTEX___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___ECROSS_REFERENCES = VERTEX___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___EGET__ESTRUCTURALFEATURE = VERTEX___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___EGET__ESTRUCTURALFEATURE_BOOLEAN = VERTEX___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___ESET__ESTRUCTURALFEATURE_OBJECT = VERTEX___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___EIS_SET__ESTRUCTURALFEATURE = VERTEX___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___EUNSET__ESTRUCTURALFEATURE = VERTEX___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___EINVOKE__EOPERATION_ELIST = VERTEX___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___GET_EXTENSION__ECLASS = VERTEX___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___PROVIDE_EXTENSION__ECLASS = VERTEX___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___GET_ANNOTATION__STRING = VERTEX___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___PROVIDE_ANNOTATION__STRING = VERTEX___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Long Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___GET_LONG_NAME = VERTEX___GET_LONG_NAME;

	/**
	 * The operation id for the '<em>Get Root Realtime Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___GET_ROOT_REALTIME_STATECHART = VERTEX___GET_ROOT_REALTIME_STATECHART;

	/**
	 * The operation id for the '<em>Get Next State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___GET_NEXT_STATE = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE___CLONE__ABSTRACTSTATECHART_INITIALSTATE = VERTEX_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FinalStateImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ANNOTATION = VERTEX__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__EXTENSION = VERTEX__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OUTGOING_TRANSITIONS = VERTEX__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__INCOMING_TRANSITIONS = VERTEX__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__STATECHART = VERTEX__STATECHART;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___ECLASS = VERTEX___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___EIS_PROXY = VERTEX___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___ERESOURCE = VERTEX___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___ECONTAINER = VERTEX___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___ECONTAINING_FEATURE = VERTEX___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___ECONTAINMENT_FEATURE = VERTEX___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___ECONTENTS = VERTEX___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___EALL_CONTENTS = VERTEX___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___ECROSS_REFERENCES = VERTEX___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___EGET__ESTRUCTURALFEATURE = VERTEX___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___EGET__ESTRUCTURALFEATURE_BOOLEAN = VERTEX___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___ESET__ESTRUCTURALFEATURE_OBJECT = VERTEX___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___EIS_SET__ESTRUCTURALFEATURE = VERTEX___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___EUNSET__ESTRUCTURALFEATURE = VERTEX___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___EINVOKE__EOPERATION_ELIST = VERTEX___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___GET_EXTENSION__ECLASS = VERTEX___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___PROVIDE_EXTENSION__ECLASS = VERTEX___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___GET_ANNOTATION__STRING = VERTEX___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___PROVIDE_ANNOTATION__STRING = VERTEX___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Long Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___GET_LONG_NAME = VERTEX___GET_LONG_NAME;

	/**
	 * The operation id for the '<em>Get Root Realtime Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___GET_ROOT_REALTIME_STATECHART = VERTEX___GET_ROOT_REALTIME_STATECHART;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___CLONE__ABSTRACTSTATECHART_FINALSTATE = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.PrioritizableImpl <em>Prioritizable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.PrioritizableImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getPrioritizable()
	 * @generated
	 */
	int PRIORITIZABLE = 20;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZABLE__PRIORITY = 0;

	/**
	 * The number of structural features of the '<em>Prioritizable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Prioritizable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 13;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PRIORITY = PRIORITIZABLE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ANNOTATION = PRIORITIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EXTENSION = PRIORITIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>UML Realtime Transition Mapping Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR = PRIORITIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Send Synchronization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SEND_SYNCHRONIZATION = PRIORITIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Receive Synchronization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RECEIVE_SYNCHRONIZATION = PRIORITIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Side Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SIDE_EFFECT = PRIORITIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = PRIORITIZABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = PRIORITIZABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__STATECHART = PRIORITIZABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Resets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RESETS = PRIORITIZABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>UML Realtime Flat Switching</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__UML_REALTIME_FLAT_SWITCHING = PRIORITIZABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>UML Realtime Fading Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__UML_REALTIME_FADING_FUNCTION = PRIORITIZABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Trigger Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER_EVENTS = PRIORITIZABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Raised Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RAISED_EVENTS = PRIORITIZABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Timeguard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TIMEGUARD = PRIORITIZABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Absolute Deadlines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ABSOLUTE_DEADLINES = PRIORITIZABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Relative Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RELATIVE_DEADLINE = PRIORITIZABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Urgent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__URGENT = PRIORITIZABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = PRIORITIZABLE_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = PRIORITIZABLE_FEATURE_COUNT + 19;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ECLASS = PRIORITIZABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___EIS_PROXY = PRIORITIZABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ERESOURCE = PRIORITIZABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ECONTAINER = PRIORITIZABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ECONTAINING_FEATURE = PRIORITIZABLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ECONTAINMENT_FEATURE = PRIORITIZABLE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ECONTENTS = PRIORITIZABLE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___EALL_CONTENTS = PRIORITIZABLE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ECROSS_REFERENCES = PRIORITIZABLE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___EGET__ESTRUCTURALFEATURE = PRIORITIZABLE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___EGET__ESTRUCTURALFEATURE_BOOLEAN = PRIORITIZABLE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ESET__ESTRUCTURALFEATURE_OBJECT = PRIORITIZABLE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___EIS_SET__ESTRUCTURALFEATURE = PRIORITIZABLE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___EUNSET__ESTRUCTURALFEATURE = PRIORITIZABLE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___EINVOKE__EOPERATION_ELIST = PRIORITIZABLE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___GET_EXTENSION__ECLASS = PRIORITIZABLE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___PROVIDE_EXTENSION__ECLASS = PRIORITIZABLE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___GET_ANNOTATION__STRING = PRIORITIZABLE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___PROVIDE_ANNOTATION__STRING = PRIORITIZABLE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Calculate Worst Case Deadline As Natural Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___CALCULATE_WORST_CASE_DEADLINE_AS_NATURAL_NUMBER = PRIORITIZABLE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Default Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___GET_DEFAULT_NAME = PRIORITIZABLE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___CLONE__ABSTRACTSTATECHART_TRANSITION = PRIORITIZABLE_OPERATION_COUNT + 21;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = PRIORITIZABLE_OPERATION_COUNT + 22;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationChannelImpl <em>Synchronization Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.SynchronizationChannelImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronizationChannel()
	 * @generated
	 */
	int SYNCHRONIZATION_CHANNEL = 14;

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
	 * The feature id for the '<em><b>State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__STATE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

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
	int SYNCHRONIZATION_CHANNEL___CLONE__ABSTRACTSTATECHART_SYNCHRONIZATIONCHANNEL = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Synchronization Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL_OPERATION_COUNT = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ClockConstraintImpl <em>Clock Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ClockConstraintImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getClockConstraint()
	 * @generated
	 */
	int CLOCK_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT__BOUND = 0;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT__CLOCK = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT__OPERATOR = 2;

	/**
	 * The number of structural features of the '<em>Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT___CLONE__ABSTRACTSTATECHART_CLOCKCONSTRAINT = 0;

	/**
	 * The number of operations of the '<em>Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.HistoryStateImpl <em>History State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.HistoryStateImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getHistoryState()
	 * @generated
	 */
	int HISTORY_STATE = 16;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__ANNOTATION = VERTEX__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__EXTENSION = VERTEX__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__OUTGOING_TRANSITIONS = VERTEX__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__INCOMING_TRANSITIONS = VERTEX__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__STATECHART = VERTEX__STATECHART;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE__KIND = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>History State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___ECLASS = VERTEX___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___EIS_PROXY = VERTEX___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___ERESOURCE = VERTEX___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___ECONTAINER = VERTEX___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___ECONTAINING_FEATURE = VERTEX___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___ECONTAINMENT_FEATURE = VERTEX___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___ECONTENTS = VERTEX___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___EALL_CONTENTS = VERTEX___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___ECROSS_REFERENCES = VERTEX___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___EGET__ESTRUCTURALFEATURE = VERTEX___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___EGET__ESTRUCTURALFEATURE_BOOLEAN = VERTEX___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___ESET__ESTRUCTURALFEATURE_OBJECT = VERTEX___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___EIS_SET__ESTRUCTURALFEATURE = VERTEX___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___EUNSET__ESTRUCTURALFEATURE = VERTEX___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___EINVOKE__EOPERATION_ELIST = VERTEX___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___GET_EXTENSION__ECLASS = VERTEX___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___PROVIDE_EXTENSION__ECLASS = VERTEX___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___GET_ANNOTATION__STRING = VERTEX___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___PROVIDE_ANNOTATION__STRING = VERTEX___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Long Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___GET_LONG_NAME = VERTEX___GET_LONG_NAME;

	/**
	 * The operation id for the '<em>Get Root Realtime Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE___GET_ROOT_REALTIME_STATECHART = VERTEX___GET_ROOT_REALTIME_STATECHART;

	/**
	 * The number of operations of the '<em>History State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_STATE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DoEventImpl <em>Do Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.DoEventImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getDoEvent()
	 * @generated
	 */
	int DO_EVENT = 17;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EVENT__ACTION = 0;

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
	int ENTRY_OR_EXIT_EVENT = 18;

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
	int SYNCHRONIZATION = 19;

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
	 * The feature id for the '<em><b>Send Sync Rev</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__SEND_SYNC_REV = CallsPackage.INVOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receive Sync Rev</b></em>' container reference.
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RegionImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 21;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__PRIORITY = PRIORITIZABLE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__STATECHART = PRIORITIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__PARENT_STATE = PRIORITIZABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = PRIORITIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = PRIORITIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl <em>Fujaba Realtime Statechart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getFujabaRealtimeStatechart()
	 * @generated
	 */
	int FUJABA_REALTIME_STATECHART = 22;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__ANNOTATION = CorePackage.ABSTRACT_STATECHART__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__EXTENSION = CorePackage.ABSTRACT_STATECHART__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__NAME = CorePackage.ABSTRACT_STATECHART__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__COMMENT = CorePackage.ABSTRACT_STATECHART__COMMENT;

	/**
	 * The feature id for the '<em><b>Event Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__EVENT_QUEUE_SIZE = CorePackage.ABSTRACT_STATECHART__EVENT_QUEUE_SIZE;

	/**
	 * The feature id for the '<em><b>Wcet Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__WCET_DOCUMENT = CorePackage.ABSTRACT_STATECHART__WCET_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__SECURITY_LEVEL = CorePackage.ABSTRACT_STATECHART__SECURITY_LEVEL;

	/**
	 * The feature id for the '<em><b>System Wcet Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__SYSTEM_WCET_MAP = CorePackage.ABSTRACT_STATECHART__SYSTEM_WCET_MAP;

	/**
	 * The feature id for the '<em><b>Utilisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__UTILISATION = CorePackage.ABSTRACT_STATECHART__UTILISATION;

	/**
	 * The feature id for the '<em><b>Schedule Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__SCHEDULE_DOCUMENT = CorePackage.ABSTRACT_STATECHART__SCHEDULE_DOCUMENT;

	/**
	 * The feature id for the '<em><b>UML Realtime Start State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__UML_REALTIME_START_STATE = CorePackage.ABSTRACT_STATECHART__UML_REALTIME_START_STATE;

	/**
	 * The feature id for the '<em><b>UML Complex Realtime State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__UML_COMPLEX_REALTIME_STATE = CorePackage.ABSTRACT_STATECHART__UML_COMPLEX_REALTIME_STATE;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__TRANSITIONS = CorePackage.ABSTRACT_STATECHART__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__VERTICES = CorePackage.ABSTRACT_STATECHART__VERTICES;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__ECLASS = CorePackage.ABSTRACT_STATECHART__ECLASS;

	/**
	 * The feature id for the '<em><b>UML Interface Statechart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__UML_INTERFACE_STATECHART = CorePackage.ABSTRACT_STATECHART__UML_INTERFACE_STATECHART;

	/**
	 * The feature id for the '<em><b>Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__BEHAVIORAL_ELEMENT = CorePackage.ABSTRACT_STATECHART__BEHAVIORAL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Provided Msg IFace</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__PROVIDED_MSG_IFACE = CorePackage.ABSTRACT_STATECHART__PROVIDED_MSG_IFACE;

	/**
	 * The feature id for the '<em><b>Required Msg IFace</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__REQUIRED_MSG_IFACE = CorePackage.ABSTRACT_STATECHART__REQUIRED_MSG_IFACE;

	/**
	 * The feature id for the '<em><b>Is Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__IS_EMBEDDED = CorePackage.ABSTRACT_STATECHART__IS_EMBEDDED;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__CLOCKS = CorePackage.ABSTRACT_STATECHART__CLOCKS;

	/**
	 * The feature id for the '<em><b>Embedding Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__EMBEDDING_REGION = CorePackage.ABSTRACT_STATECHART__EMBEDDING_REGION;

	/**
	 * The number of structural features of the '<em>Fujaba Realtime Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART_FEATURE_COUNT = CorePackage.ABSTRACT_STATECHART_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___ECLASS = CorePackage.ABSTRACT_STATECHART___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___EIS_PROXY = CorePackage.ABSTRACT_STATECHART___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___ERESOURCE = CorePackage.ABSTRACT_STATECHART___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___ECONTAINER = CorePackage.ABSTRACT_STATECHART___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___ECONTAINING_FEATURE = CorePackage.ABSTRACT_STATECHART___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___ECONTAINMENT_FEATURE = CorePackage.ABSTRACT_STATECHART___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___ECONTENTS = CorePackage.ABSTRACT_STATECHART___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___EALL_CONTENTS = CorePackage.ABSTRACT_STATECHART___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___ECROSS_REFERENCES = CorePackage.ABSTRACT_STATECHART___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___EGET__ESTRUCTURALFEATURE = CorePackage.ABSTRACT_STATECHART___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.ABSTRACT_STATECHART___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.ABSTRACT_STATECHART___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___EIS_SET__ESTRUCTURALFEATURE = CorePackage.ABSTRACT_STATECHART___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___EUNSET__ESTRUCTURALFEATURE = CorePackage.ABSTRACT_STATECHART___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___EINVOKE__EOPERATION_ELIST = CorePackage.ABSTRACT_STATECHART___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___GET_EXTENSION__ECLASS = CorePackage.ABSTRACT_STATECHART___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___PROVIDE_EXTENSION__ECLASS = CorePackage.ABSTRACT_STATECHART___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___GET_ANNOTATION__STRING = CorePackage.ABSTRACT_STATECHART___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___PROVIDE_ANNOTATION__STRING = CorePackage.ABSTRACT_STATECHART___PROVIDE_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Highest Parent Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___GET_HIGHEST_PARENT_STATECHART = CorePackage.ABSTRACT_STATECHART___GET_HIGHEST_PARENT_STATECHART;

	/**
	 * The operation id for the '<em>Add All UML Realtime States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN = CorePackage.ABSTRACT_STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN;

	/**
	 * The operation id for the '<em>Add Complex UML Realtime States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET = CorePackage.ABSTRACT_STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET;

	/**
	 * The operation id for the '<em>Add All UML Realtime Transitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET = CorePackage.ABSTRACT_STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET;

	/**
	 * The operation id for the '<em>Iterator Of All UML Clocks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN = CorePackage.ABSTRACT_STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN;

	/**
	 * The operation id for the '<em>Add All UML Clocks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN = CorePackage.ABSTRACT_STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___TO_STRING = CorePackage.ABSTRACT_STATECHART___TO_STRING;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART___CLONE = CorePackage.ABSTRACT_STATECHART___CLONE;

	/**
	 * The number of operations of the '<em>Fujaba Realtime Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART_OPERATION_COUNT = CorePackage.ABSTRACT_STATECHART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryKind <em>History Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.HistoryKind
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getHistoryKind()
	 * @generated
	 */
	int HISTORY_KIND = 23;


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
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline#getUMLRealtimeTransition <em>UML Realtime Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>UML Realtime Transition</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline#getUMLRealtimeTransition()
	 * @see #getRelativeDeadline()
	 * @generated
	 */
	EReference getRelativeDeadline_UMLRealtimeTransition();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#getId()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Id();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#getAbsoluteDeadlines <em>Absolute Deadlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Absolute Deadlines</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#getAbsoluteDeadlines()
	 * @see #getClock()
	 * @generated
	 */
	EReference getClock_AbsoluteDeadlines();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#getStatechart()
	 * @see #getClock()
	 * @generated
	 */
	EReference getClock_Statechart();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#getResets <em>Resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resets</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#getResets()
	 * @see #getClock()
	 * @generated
	 */
	EReference getClock_Resets();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#getClockConstraints <em>Clock Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clock Constraints</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#getClockConstraints()
	 * @see #getClock()
	 * @generated
	 */
	EReference getClock_ClockConstraints();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#toString()
	 * @generated
	 */
	EOperation getClock__ToString();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock)
	 * @generated
	 */
	EOperation getClock__Clone__AbstractStatechart_Clock();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regions</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getRegions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Regions();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getDoAction <em>Do Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do Action</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getDoAction()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DoAction();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getExitAction <em>Exit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit Action</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getExitAction()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ExitAction();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getEntryAction <em>Entry Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Action</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getEntryAction()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EntryAction();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getReconfDiagram <em>Reconf Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reconf Diagram</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getReconfDiagram()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ReconfDiagram();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getInterfacedStates <em>Interfaced States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaced States</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getInterfacedStates()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_InterfacedStates();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getInterfaceState <em>Interface State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getInterfaceState()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_InterfaceState();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getInvariants <em>Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invariants</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getInvariants()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Invariants();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#isCommitted <em>Committed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Committed</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#isCommitted()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Committed();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getChannels()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Channels();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State)
	 * @generated
	 */
	EOperation getState__Clone__AbstractStatechart_State();

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
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getId()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getWcet <em>Wcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wcet</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getWcet()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Wcet();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getBlocking <em>Blocking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocking</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getBlocking()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Blocking();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getUMLRealtimeTransition <em>UML Realtime Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>UML Realtime Transition</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getUMLRealtimeTransition()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_UMLRealtimeTransition();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getResets <em>Resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resets</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getResets()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Resets();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#isWCETSpecifiedByUser <em>WCET Specified By User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WCET Specified By User</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#isWCETSpecifiedByUser()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_WCETSpecifiedByUser();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action)
	 * @generated
	 */
	EOperation getAction__Clone__AbstractStatechart_Action();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent <em>Realtime Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realtime Event</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent
	 * @generated
	 */
	EClass getRealtimeEvent();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getTriggeredUMLRealtimeTransition <em>Triggered UML Realtime Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggered UML Realtime Transition</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getTriggeredUMLRealtimeTransition()
	 * @see #getRealtimeEvent()
	 * @generated
	 */
	EReference getRealtimeEvent_TriggeredUMLRealtimeTransition();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getRaisedUMLRealtimeTransition <em>Raised UML Realtime Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Raised UML Realtime Transition</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getRaisedUMLRealtimeTransition()
	 * @see #getRealtimeEvent()
	 * @generated
	 */
	EReference getRealtimeEvent_RaisedUMLRealtimeTransition();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getInstance()
	 * @see #getRealtimeEvent()
	 * @generated
	 */
	EAttribute getRealtimeEvent_Instance();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getName()
	 * @see #getRealtimeEvent()
	 * @generated
	 */
	EAttribute getRealtimeEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getFullEventName <em>Full Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Event Name</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getFullEventName()
	 * @see #getRealtimeEvent()
	 * @generated
	 */
	EAttribute getRealtimeEvent_FullEventName();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent)
	 * @generated
	 */
	EOperation getRealtimeEvent__Clone__AbstractStatechart_RealtimeEvent();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#toString()
	 * @generated
	 */
	EOperation getRealtimeEvent__ToString();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction <em>Fading Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fading Function</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction
	 * @generated
	 */
	EClass getFadingFunction();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getFunction()
	 * @see #getFadingFunction()
	 * @generated
	 */
	EAttribute getFadingFunction_Function();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getUMLRealtimeTransitions <em>UML Realtime Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>UML Realtime Transitions</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getUMLRealtimeTransitions()
	 * @see #getFadingFunction()
	 * @generated
	 */
	EReference getFadingFunction_UMLRealtimeTransitions();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getMinDuration <em>Min Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Duration</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getMinDuration()
	 * @see #getFadingFunction()
	 * @generated
	 */
	EAttribute getFadingFunction_MinDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getMaxDuration <em>Max Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Duration</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getMaxDuration()
	 * @see #getFadingFunction()
	 * @generated
	 */
	EAttribute getFadingFunction_MaxDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getSpline1 <em>Spline1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spline1</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getSpline1()
	 * @see #getFadingFunction()
	 * @generated
	 */
	EAttribute getFadingFunction_Spline1();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getSpline2 <em>Spline2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spline2</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getSpline2()
	 * @see #getFadingFunction()
	 * @generated
	 */
	EAttribute getFadingFunction_Spline2();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getPolynomDegree <em>Polynom Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polynom Degree</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getPolynomDegree()
	 * @see #getFadingFunction()
	 * @generated
	 */
	EAttribute getFadingFunction_PolynomDegree();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getPortsByComponentInstance <em>Ports By Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ports By Component Instance</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getPortsByComponentInstance()
	 * @see #getFadingFunction()
	 * @generated
	 */
	EReference getFadingFunction_PortsByComponentInstance();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getBreakpoint() <em>Get Breakpoint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Breakpoint</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction#getBreakpoint()
	 * @generated
	 */
	EOperation getFadingFunction__GetBreakpoint();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching <em>Flat Switching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flat Switching</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching
	 * @generated
	 */
	EClass getFlatSwitching();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getUMLRealtimeTransitions <em>UML Realtime Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>UML Realtime Transitions</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getUMLRealtimeTransitions()
	 * @see #getFlatSwitching()
	 * @generated
	 */
	EReference getFlatSwitching_UMLRealtimeTransitions();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getMinDuration <em>Min Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Duration</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getMinDuration()
	 * @see #getFlatSwitching()
	 * @generated
	 */
	EAttribute getFlatSwitching_MinDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getMaxDuration <em>Max Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Duration</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getMaxDuration()
	 * @see #getFlatSwitching()
	 * @generated
	 */
	EAttribute getFlatSwitching_MaxDuration();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getSpline1 <em>Spline1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spline1</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getSpline1()
	 * @see #getFlatSwitching()
	 * @generated
	 */
	EAttribute getFlatSwitching_Spline1();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getSpline2 <em>Spline2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spline2</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getSpline2()
	 * @see #getFlatSwitching()
	 * @generated
	 */
	EAttribute getFlatSwitching_Spline2();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getPolynomDegree <em>Polynom Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polynom Degree</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getPolynomDegree()
	 * @see #getFlatSwitching()
	 * @generated
	 */
	EAttribute getFlatSwitching_PolynomDegree();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getPortInstToPortInstMapEntry <em>Port Inst To Port Inst Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Inst To Port Inst Map Entry</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getPortInstToPortInstMapEntry()
	 * @see #getFlatSwitching()
	 * @generated
	 */
	EAttribute getFlatSwitching_PortInstToPortInstMapEntry();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getBreakpoint() <em>Get Breakpoint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Breakpoint</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching#getBreakpoint()
	 * @generated
	 */
	EOperation getFlatSwitching__GetBreakpoint();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState#getUMLRealtimeStartStateRev <em>UML Realtime Start State Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>UML Realtime Start State Rev</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState#getUMLRealtimeStartStateRev()
	 * @see #getInitialState()
	 * @generated
	 */
	EReference getInitialState_UMLRealtimeStartStateRev();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState#getNextState() <em>Get Next State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Next State</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState#getNextState()
	 * @generated
	 */
	EOperation getInitialState__GetNextState();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState)
	 * @generated
	 */
	EOperation getInitialState__Clone__AbstractStatechart_InitialState();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getOutgoingTransitions()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_OutgoingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getIncomingTransitions()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_IncomingTransitions();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getStatechart()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Statechart();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getLongName() <em>Get Long Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Long Name</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getLongName()
	 * @generated
	 */
	EOperation getVertex__GetLongName();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getRootRealtimeStatechart() <em>Get Root Realtime Statechart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Realtime Statechart</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex#getRootRealtimeStatechart()
	 * @generated
	 */
	EOperation getVertex__GetRootRealtimeStatechart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FinalState#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FinalState) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FinalState#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FinalState)
	 * @generated
	 */
	EOperation getFinalState__Clone__AbstractStatechart_FinalState();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getUMLRealtimeTransitionMappingVector <em>UML Realtime Transition Mapping Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UML Realtime Transition Mapping Vector</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getUMLRealtimeTransitionMappingVector()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_UMLRealtimeTransitionMappingVector();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSendSynchronization <em>Send Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Send Synchronization</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSendSynchronization()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_SendSynchronization();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getReceiveSynchronization <em>Receive Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive Synchronization</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getReceiveSynchronization()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ReceiveSynchronization();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSideEffect <em>Side Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Side Effect</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSideEffect()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_SideEffect();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getStatechart()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Statechart();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getResets <em>Resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resets</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getResets()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Resets();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getUMLRealtimeFlatSwitching <em>UML Realtime Flat Switching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UML Realtime Flat Switching</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getUMLRealtimeFlatSwitching()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_UMLRealtimeFlatSwitching();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getUMLRealtimeFadingFunction <em>UML Realtime Fading Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UML Realtime Fading Function</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getUMLRealtimeFadingFunction()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_UMLRealtimeFadingFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getTriggerEvents <em>Trigger Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger Events</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getTriggerEvents()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TriggerEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getRaisedEvents <em>Raised Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Raised Events</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getRaisedEvents()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_RaisedEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getTimeguard <em>Timeguard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timeguard</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getTimeguard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Timeguard();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getAbsoluteDeadlines <em>Absolute Deadlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Absolute Deadlines</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getAbsoluteDeadlines()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_AbsoluteDeadlines();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getRelativeDeadline <em>Relative Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relative Deadline</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getRelativeDeadline()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_RelativeDeadline();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#isUrgent <em>Urgent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urgent</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#isUrgent()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Urgent();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#calculateWorstCaseDeadlineAsNaturalNumber() <em>Calculate Worst Case Deadline As Natural Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Worst Case Deadline As Natural Number</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#calculateWorstCaseDeadlineAsNaturalNumber()
	 * @generated
	 */
	EOperation getTransition__CalculateWorstCaseDeadlineAsNaturalNumber();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getDefaultName() <em>Get Default Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Name</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getDefaultName()
	 * @generated
	 */
	EOperation getTransition__GetDefaultName();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition)
	 * @generated
	 */
	EOperation getTransition__Clone__AbstractStatechart_Transition();

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
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#getState()
	 * @see #getSynchronizationChannel()
	 * @generated
	 */
	EReference getSynchronizationChannel_State();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel)
	 * @generated
	 */
	EOperation getSynchronizationChannel__Clone__AbstractStatechart_SynchronizationChannel();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint <em>Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint
	 * @generated
	 */
	EClass getClockConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bound</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#getBound()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EReference getClockConstraint_Bound();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#getClock()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EReference getClockConstraint_Clock();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#getOperator()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EAttribute getClockConstraint_Operator();

	/**
	 * Returns the meta object for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint#clone(de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart, de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint)
	 * @generated
	 */
	EOperation getClockConstraint__Clone__AbstractStatechart_ClockConstraint();

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
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getAction()
	 * @see #getDoEvent()
	 * @generated
	 */
	EReference getDoEvent_Action();

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
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getSendSyncRev <em>Send Sync Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Send Sync Rev</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getSendSyncRev()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_SendSyncRev();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getReceiveSyncRev <em>Receive Sync Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Receive Sync Rev</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getReceiveSyncRev()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_ReceiveSyncRev();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Prioritizable <em>Prioritizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prioritizable</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Prioritizable
	 * @generated
	 */
	EClass getPrioritizable();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Prioritizable#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Prioritizable#getPriority()
	 * @see #getPrioritizable()
	 * @generated
	 */
	EAttribute getPrioritizable_Priority();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region#getStatechart()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Statechart();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent State</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region#getParentState()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_ParentState();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FujabaRealtimeStatechart <em>Fujaba Realtime Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fujaba Realtime Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FujabaRealtimeStatechart
	 * @generated
	 */
	EClass getFujabaRealtimeStatechart();

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
		 * The meta object literal for the '<em><b>UML Realtime Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_DEADLINE__UML_REALTIME_TRANSITION = eINSTANCE.getRelativeDeadline_UMLRealtimeTransition();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ClockImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__ID = eINSTANCE.getClock_Id();

		/**
		 * The meta object literal for the '<em><b>Absolute Deadlines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK__ABSOLUTE_DEADLINES = eINSTANCE.getClock_AbsoluteDeadlines();

		/**
		 * The meta object literal for the '<em><b>Statechart</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK__STATECHART = eINSTANCE.getClock_Statechart();

		/**
		 * The meta object literal for the '<em><b>Resets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK__RESETS = eINSTANCE.getClock_Resets();

		/**
		 * The meta object literal for the '<em><b>Clock Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK__CLOCK_CONSTRAINTS = eINSTANCE.getClock_ClockConstraints();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOCK___TO_STRING = eINSTANCE.getClock__ToString();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOCK___CLONE__ABSTRACTSTATECHART_CLOCK = eINSTANCE.getClock__Clone__AbstractStatechart_Clock();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.StateImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__REGIONS = eINSTANCE.getState_Regions();

		/**
		 * The meta object literal for the '<em><b>Do Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DO_ACTION = eINSTANCE.getState_DoAction();

		/**
		 * The meta object literal for the '<em><b>Exit Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXIT_ACTION = eINSTANCE.getState_ExitAction();

		/**
		 * The meta object literal for the '<em><b>Entry Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENTRY_ACTION = eINSTANCE.getState_EntryAction();

		/**
		 * The meta object literal for the '<em><b>Reconf Diagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__RECONF_DIAGRAM = eINSTANCE.getState_ReconfDiagram();

		/**
		 * The meta object literal for the '<em><b>Interfaced States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INTERFACED_STATES = eINSTANCE.getState_InterfacedStates();

		/**
		 * The meta object literal for the '<em><b>Interface State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INTERFACE_STATE = eINSTANCE.getState_InterfaceState();

		/**
		 * The meta object literal for the '<em><b>Invariants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INVARIANTS = eINSTANCE.getState_Invariants();

		/**
		 * The meta object literal for the '<em><b>Committed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__COMMITTED = eINSTANCE.getState_Committed();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CHANNELS = eINSTANCE.getState_Channels();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___CLONE__ABSTRACTSTATECHART_STATE = eINSTANCE.getState__Clone__AbstractStatechart_State();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ActionImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ID = eINSTANCE.getAction_Id();

		/**
		 * The meta object literal for the '<em><b>Wcet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__WCET = eINSTANCE.getAction_Wcet();

		/**
		 * The meta object literal for the '<em><b>Blocking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__BLOCKING = eINSTANCE.getAction_Blocking();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__UML_REALTIME_TRANSITION = eINSTANCE.getAction_UMLRealtimeTransition();

		/**
		 * The meta object literal for the '<em><b>Resets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__RESETS = eINSTANCE.getAction_Resets();

		/**
		 * The meta object literal for the '<em><b>WCET Specified By User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__WCET_SPECIFIED_BY_USER = eINSTANCE.getAction_WCETSpecifiedByUser();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___CLONE__ABSTRACTSTATECHART_ACTION = eINSTANCE.getAction__Clone__AbstractStatechart_Action();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimeEventImpl <em>Realtime Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimeEventImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getRealtimeEvent()
		 * @generated
		 */
		EClass REALTIME_EVENT = eINSTANCE.getRealtimeEvent();

		/**
		 * The meta object literal for the '<em><b>Triggered UML Realtime Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION = eINSTANCE.getRealtimeEvent_TriggeredUMLRealtimeTransition();

		/**
		 * The meta object literal for the '<em><b>Raised UML Realtime Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION = eINSTANCE.getRealtimeEvent_RaisedUMLRealtimeTransition();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIME_EVENT__INSTANCE = eINSTANCE.getRealtimeEvent_Instance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIME_EVENT__NAME = eINSTANCE.getRealtimeEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Full Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIME_EVENT__FULL_EVENT_NAME = eINSTANCE.getRealtimeEvent_FullEventName();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REALTIME_EVENT___CLONE__ABSTRACTSTATECHART_REALTIMEEVENT = eINSTANCE.getRealtimeEvent__Clone__AbstractStatechart_RealtimeEvent();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REALTIME_EVENT___TO_STRING = eINSTANCE.getRealtimeEvent__ToString();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FadingFunctionImpl <em>Fading Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FadingFunctionImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getFadingFunction()
		 * @generated
		 */
		EClass FADING_FUNCTION = eINSTANCE.getFadingFunction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FADING_FUNCTION__FUNCTION = eINSTANCE.getFadingFunction_Function();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Transitions</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FADING_FUNCTION__UML_REALTIME_TRANSITIONS = eINSTANCE.getFadingFunction_UMLRealtimeTransitions();

		/**
		 * The meta object literal for the '<em><b>Min Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FADING_FUNCTION__MIN_DURATION = eINSTANCE.getFadingFunction_MinDuration();

		/**
		 * The meta object literal for the '<em><b>Max Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FADING_FUNCTION__MAX_DURATION = eINSTANCE.getFadingFunction_MaxDuration();

		/**
		 * The meta object literal for the '<em><b>Spline1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FADING_FUNCTION__SPLINE1 = eINSTANCE.getFadingFunction_Spline1();

		/**
		 * The meta object literal for the '<em><b>Spline2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FADING_FUNCTION__SPLINE2 = eINSTANCE.getFadingFunction_Spline2();

		/**
		 * The meta object literal for the '<em><b>Polynom Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FADING_FUNCTION__POLYNOM_DEGREE = eINSTANCE.getFadingFunction_PolynomDegree();

		/**
		 * The meta object literal for the '<em><b>Ports By Component Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FADING_FUNCTION__PORTS_BY_COMPONENT_INSTANCE = eINSTANCE.getFadingFunction_PortsByComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Get Breakpoint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FADING_FUNCTION___GET_BREAKPOINT = eINSTANCE.getFadingFunction__GetBreakpoint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FlatSwitchingImpl <em>Flat Switching</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FlatSwitchingImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getFlatSwitching()
		 * @generated
		 */
		EClass FLAT_SWITCHING = eINSTANCE.getFlatSwitching();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLAT_SWITCHING__UML_REALTIME_TRANSITIONS = eINSTANCE.getFlatSwitching_UMLRealtimeTransitions();

		/**
		 * The meta object literal for the '<em><b>Min Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_SWITCHING__MIN_DURATION = eINSTANCE.getFlatSwitching_MinDuration();

		/**
		 * The meta object literal for the '<em><b>Max Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_SWITCHING__MAX_DURATION = eINSTANCE.getFlatSwitching_MaxDuration();

		/**
		 * The meta object literal for the '<em><b>Spline1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_SWITCHING__SPLINE1 = eINSTANCE.getFlatSwitching_Spline1();

		/**
		 * The meta object literal for the '<em><b>Spline2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_SWITCHING__SPLINE2 = eINSTANCE.getFlatSwitching_Spline2();

		/**
		 * The meta object literal for the '<em><b>Polynom Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_SWITCHING__POLYNOM_DEGREE = eINSTANCE.getFlatSwitching_PolynomDegree();

		/**
		 * The meta object literal for the '<em><b>Port Inst To Port Inst Map Entry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_SWITCHING__PORT_INST_TO_PORT_INST_MAP_ENTRY = eINSTANCE.getFlatSwitching_PortInstToPortInstMapEntry();

		/**
		 * The meta object literal for the '<em><b>Get Breakpoint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FLAT_SWITCHING___GET_BREAKPOINT = eINSTANCE.getFlatSwitching__GetBreakpoint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.InitialStateImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Start State Rev</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_STATE__UML_REALTIME_START_STATE_REV = eINSTANCE.getInitialState_UMLRealtimeStartStateRev();

		/**
		 * The meta object literal for the '<em><b>Get Next State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INITIAL_STATE___GET_NEXT_STATE = eINSTANCE.getInitialState__GetNextState();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INITIAL_STATE___CLONE__ABSTRACTSTATECHART_INITIALSTATE = eINSTANCE.getInitialState__Clone__AbstractStatechart_InitialState();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.VertexImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__OUTGOING_TRANSITIONS = eINSTANCE.getVertex_OutgoingTransitions();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__INCOMING_TRANSITIONS = eINSTANCE.getVertex_IncomingTransitions();

		/**
		 * The meta object literal for the '<em><b>Statechart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__STATECHART = eINSTANCE.getVertex_Statechart();

		/**
		 * The meta object literal for the '<em><b>Get Long Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERTEX___GET_LONG_NAME = eINSTANCE.getVertex__GetLongName();

		/**
		 * The meta object literal for the '<em><b>Get Root Realtime Statechart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERTEX___GET_ROOT_REALTIME_STATECHART = eINSTANCE.getVertex__GetRootRealtimeStatechart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FinalStateImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FINAL_STATE___CLONE__ABSTRACTSTATECHART_FINALSTATE = eINSTANCE.getFinalState__Clone__AbstractStatechart_FinalState();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Transition Mapping Vector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR = eINSTANCE.getTransition_UMLRealtimeTransitionMappingVector();

		/**
		 * The meta object literal for the '<em><b>Send Synchronization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SEND_SYNCHRONIZATION = eINSTANCE.getTransition_SendSynchronization();

		/**
		 * The meta object literal for the '<em><b>Receive Synchronization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__RECEIVE_SYNCHRONIZATION = eINSTANCE.getTransition_ReceiveSynchronization();

		/**
		 * The meta object literal for the '<em><b>Side Effect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SIDE_EFFECT = eINSTANCE.getTransition_SideEffect();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Statechart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__STATECHART = eINSTANCE.getTransition_Statechart();

		/**
		 * The meta object literal for the '<em><b>Resets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__RESETS = eINSTANCE.getTransition_Resets();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Flat Switching</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__UML_REALTIME_FLAT_SWITCHING = eINSTANCE.getTransition_UMLRealtimeFlatSwitching();

		/**
		 * The meta object literal for the '<em><b>UML Realtime Fading Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__UML_REALTIME_FADING_FUNCTION = eINSTANCE.getTransition_UMLRealtimeFadingFunction();

		/**
		 * The meta object literal for the '<em><b>Trigger Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGER_EVENTS = eINSTANCE.getTransition_TriggerEvents();

		/**
		 * The meta object literal for the '<em><b>Raised Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__RAISED_EVENTS = eINSTANCE.getTransition_RaisedEvents();

		/**
		 * The meta object literal for the '<em><b>Timeguard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TIMEGUARD = eINSTANCE.getTransition_Timeguard();

		/**
		 * The meta object literal for the '<em><b>Absolute Deadlines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ABSOLUTE_DEADLINES = eINSTANCE.getTransition_AbsoluteDeadlines();

		/**
		 * The meta object literal for the '<em><b>Relative Deadline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__RELATIVE_DEADLINE = eINSTANCE.getTransition_RelativeDeadline();

		/**
		 * The meta object literal for the '<em><b>Urgent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__URGENT = eINSTANCE.getTransition_Urgent();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Calculate Worst Case Deadline As Natural Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___CALCULATE_WORST_CASE_DEADLINE_AS_NATURAL_NUMBER = eINSTANCE.getTransition__CalculateWorstCaseDeadlineAsNaturalNumber();

		/**
		 * The meta object literal for the '<em><b>Get Default Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___GET_DEFAULT_NAME = eINSTANCE.getTransition__GetDefaultName();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___CLONE__ABSTRACTSTATECHART_TRANSITION = eINSTANCE.getTransition__Clone__AbstractStatechart_Transition();

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
		 * The meta object literal for the '<em><b>State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION_CHANNEL__STATE = eINSTANCE.getSynchronizationChannel_State();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYNCHRONIZATION_CHANNEL___CLONE__ABSTRACTSTATECHART_SYNCHRONIZATIONCHANNEL = eINSTANCE.getSynchronizationChannel__Clone__AbstractStatechart_SynchronizationChannel();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ClockConstraintImpl <em>Clock Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.ClockConstraintImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getClockConstraint()
		 * @generated
		 */
		EClass CLOCK_CONSTRAINT = eINSTANCE.getClockConstraint();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_CONSTRAINT__BOUND = eINSTANCE.getClockConstraint_Bound();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_CONSTRAINT__CLOCK = eINSTANCE.getClockConstraint_Clock();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK_CONSTRAINT__OPERATOR = eINSTANCE.getClockConstraint_Operator();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOCK_CONSTRAINT___CLONE__ABSTRACTSTATECHART_CLOCKCONSTRAINT = eINSTANCE.getClockConstraint__Clone__AbstractStatechart_ClockConstraint();

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
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_EVENT__ACTION = eINSTANCE.getDoEvent_Action();

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
		 * The meta object literal for the '<em><b>Send Sync Rev</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION__SEND_SYNC_REV = eINSTANCE.getSynchronization_SendSyncRev();

		/**
		 * The meta object literal for the '<em><b>Receive Sync Rev</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION__RECEIVE_SYNC_REV = eINSTANCE.getSynchronization_ReceiveSyncRev();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.PrioritizableImpl <em>Prioritizable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.PrioritizableImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getPrioritizable()
		 * @generated
		 */
		EClass PRIORITIZABLE = eINSTANCE.getPrioritizable();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITIZABLE__PRIORITY = eINSTANCE.getPrioritizable_Priority();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RegionImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Statechart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__STATECHART = eINSTANCE.getRegion_Statechart();

		/**
		 * The meta object literal for the '<em><b>Parent State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__PARENT_STATE = eINSTANCE.getRegion_ParentState();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl <em>Fujaba Realtime Statechart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl
		 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getFujabaRealtimeStatechart()
		 * @generated
		 */
		EClass FUJABA_REALTIME_STATECHART = eINSTANCE.getFujabaRealtimeStatechart();

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
