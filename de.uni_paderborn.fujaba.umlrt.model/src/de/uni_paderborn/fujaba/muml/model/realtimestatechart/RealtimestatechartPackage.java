/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;

import de.uni_paderborn.fujaba.muml.model.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
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
	String eNS_URI = "http:///de/uni_paderborn/fujaba/muml/model/realtimestatechart";

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
	RealtimestatechartPackage eINSTANCE = de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.DeadlineImpl <em>Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.DeadlineImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getDeadline()
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.AbsoluteDeadlineImpl <em>Absolute Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.AbsoluteDeadlineImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getAbsoluteDeadline()
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
	 * The feature id for the '<em><b>Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_DEADLINE__TRANSITION = DEADLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_DEADLINE__CLOCK = DEADLINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Absolute Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_DEADLINE_FEATURE_COUNT = DEADLINE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RelativeDeadlineImpl <em>Relative Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RelativeDeadlineImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getRelativeDeadline()
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
	 * The feature id for the '<em><b>Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_DEADLINE__TRANSITION = DEADLINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relative Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_DEADLINE_FEATURE_COUNT = DEADLINE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ClockImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getClock()
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
	 * The feature id for the '<em><b>Absolute Deadlines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__ABSOLUTE_DEADLINES = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__STATECHART = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clock Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__CLOCK_CONSTRAINTS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.PrioritizableImpl <em>Prioritizable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.PrioritizableImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getPrioritizable()
	 * @generated
	 */
	int PRIORITIZABLE = 18;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RegionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__PRIORITY = PRIORITIZABLE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ANNOTATION = PRIORITIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__EXTENSION = PRIORITIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = PRIORITIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__STATECHART = PRIORITIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__PARENT_STATE = PRIORITIZABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = PRIORITIZABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.VertexImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 6;

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
	 * The feature id for the '<em><b>Statechart</b></em>' container reference.
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getState()
	 * @generated
	 */
	int STATE = 5;

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
	 * The feature id for the '<em><b>Statechart</b></em>' container reference.
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
	 * The feature id for the '<em><b>Invariants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INVARIANTS = VERTEX_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Committed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__COMMITTED = VERTEX_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CHANNELS = VERTEX_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INITIAL = VERTEX_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FINAL = VERTEX_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Derived Exit Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DERIVED_EXIT_POINTS = VERTEX_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Derived Entry Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DERIVED_ENTRY_POINTS = VERTEX_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Urgent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__URGENT = VERTEX_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 7;

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
	 * The feature id for the '<em><b>Send Synchronization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SEND_SYNCHRONIZATION = PRIORITIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Receive Synchronization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RECEIVE_SYNCHRONIZATION = PRIORITIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transition Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITION_ACTION = PRIORITIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = PRIORITIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = PRIORITIZABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__STATECHART = PRIORITIZABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Clock Resets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CLOCK_RESETS = PRIORITIZABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Trigger Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER_EVENTS = PRIORITIZABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Raised Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RAISED_EVENTS = PRIORITIZABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Clock Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CLOCK_CONSTRAINTS = PRIORITIZABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Absolute Deadlines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ABSOLUTE_DEADLINES = PRIORITIZABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Relative Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RELATIVE_DEADLINE = PRIORITIZABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Safety Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SAFETY_TRANSITION = PRIORITIZABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Urgent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__URGENT = PRIORITIZABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = PRIORITIZABLE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = PRIORITIZABLE_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ClockConstraintImpl <em>Clock Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ClockConstraintImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getClockConstraint()
	 * @generated
	 */
	int CLOCK_CONSTRAINT = 8;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.HistoryStateImpl <em>History State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.HistoryStateImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getHistoryState()
	 * @generated
	 */
	int HISTORY_STATE = 9;

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
	 * The feature id for the '<em><b>Statechart</b></em>' container reference.
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ActionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 10;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TRANSITION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>WCET Specified By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__WCET_SPECIFIED_BY_USER = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.AsynchronousEventImpl <em>Asynchronous Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.AsynchronousEventImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getAsynchronousEvent()
	 * @generated
	 */
	int ASYNCHRONOUS_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_EVENT__ANNOTATION = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_EVENT__EXTENSION = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_EVENT__TYPE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_EVENT__GENERIC_TYPE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__GENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_EVENT__COMMENT = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_EVENT__OWNED_PARAMETER_BINDINGS = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_EVENT__CALLEE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__CALLEE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_EVENT__TARGET = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__TARGET;

	/**
	 * The feature id for the '<em><b>Opaque Callable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_EVENT__OPAQUE_CALLABLE = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_EVENT__NAME = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Triggeredtransition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_EVENT__TRIGGEREDTRANSITION = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Raisedtransition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_EVENT__RAISEDTRANSITION = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Full Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_EVENT__FULL_EVENT_NAME = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Asynchronous Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_EVENT_FEATURE_COUNT = org.storydriven.modeling.calls.expressions.ExpressionsPackage.METHOD_CALL_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.DoActionImpl <em>Do Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.DoActionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getDoAction()
	 * @generated
	 */
	int DO_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_ACTION__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Do Action Rev</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_ACTION__DO_ACTION_REV = 1;

	/**
	 * The feature id for the '<em><b>Period Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_ACTION__PERIOD_LOWER = 2;

	/**
	 * The feature id for the '<em><b>Period Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_ACTION__PERIOD_UPPER = 3;

	/**
	 * The number of structural features of the '<em>Do Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_ACTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.EntryOrExitActionImpl <em>Entry Or Exit Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.EntryOrExitActionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryOrExitAction()
	 * @generated
	 */
	int ENTRY_OR_EXIT_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Clock Resets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OR_EXIT_ACTION__CLOCK_RESETS = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OR_EXIT_ACTION__ACTION = 1;

	/**
	 * The number of structural features of the '<em>Entry Or Exit Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OR_EXIT_ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.EntryActionImpl <em>Entry Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.EntryActionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryAction()
	 * @generated
	 */
	int ENTRY_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Clock Resets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION__CLOCK_RESETS = ENTRY_OR_EXIT_ACTION__CLOCK_RESETS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION__ACTION = ENTRY_OR_EXIT_ACTION__ACTION;

	/**
	 * The feature id for the '<em><b>Entry Action Rev</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION__ENTRY_ACTION_REV = ENTRY_OR_EXIT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTION_FEATURE_COUNT = ENTRY_OR_EXIT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ExitActionImpl <em>Exit Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ExitActionImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getExitAction()
	 * @generated
	 */
	int EXIT_ACTION = 15;

	/**
	 * The feature id for the '<em><b>Clock Resets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION__CLOCK_RESETS = ENTRY_OR_EXIT_ACTION__CLOCK_RESETS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION__ACTION = ENTRY_OR_EXIT_ACTION__ACTION;

	/**
	 * The feature id for the '<em><b>Exit Action Rev</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION__EXIT_ACTION_REV = ENTRY_OR_EXIT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exit Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_ACTION_FEATURE_COUNT = ENTRY_OR_EXIT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.SynchronizationChannelImpl <em>Synchronization Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.SynchronizationChannelImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronizationChannel()
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
	int SYNCHRONIZATION_CHANNEL__ANNOTATION = CallsPackage.CALLABLE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__EXTENSION = CallsPackage.CALLABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__COMMENT = CallsPackage.CALLABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__CONTAINED_PARAMETERS = CallsPackage.CALLABLE__CONTAINED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__NAME = CallsPackage.CALLABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__STATE = CallsPackage.CALLABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__ROLE = CallsPackage.CALLABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Synchronization Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL_FEATURE_COUNT = CallsPackage.CALLABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.SynchronizationImpl <em>Synchronization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.SynchronizationImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronization()
	 * @generated
	 */
	int SYNCHRONIZATION = 17;

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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl <em>Fujaba Realtime Statechart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getFujabaRealtimeStatechart()
	 * @generated
	 */
	int FUJABA_REALTIME_STATECHART = 19;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__ANNOTATION = CorePackage.ABSTRACT_REALTIME_STATECHART__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__EXTENSION = CorePackage.ABSTRACT_REALTIME_STATECHART__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__NAME = CorePackage.ABSTRACT_REALTIME_STATECHART__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__COMMENT = CorePackage.ABSTRACT_REALTIME_STATECHART__COMMENT;

	/**
	 * The feature id for the '<em><b>Wcet Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__WCET_DOCUMENT = CorePackage.ABSTRACT_REALTIME_STATECHART__WCET_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__SECURITY_LEVEL = CorePackage.ABSTRACT_REALTIME_STATECHART__SECURITY_LEVEL;

	/**
	 * The feature id for the '<em><b>System Wcet Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__SYSTEM_WCET_MAP = CorePackage.ABSTRACT_REALTIME_STATECHART__SYSTEM_WCET_MAP;

	/**
	 * The feature id for the '<em><b>Utilisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__UTILISATION = CorePackage.ABSTRACT_REALTIME_STATECHART__UTILISATION;

	/**
	 * The feature id for the '<em><b>Schedule Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__SCHEDULE_DOCUMENT = CorePackage.ABSTRACT_REALTIME_STATECHART__SCHEDULE_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__BEHAVIORAL_ELEMENT = CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__EMBEDDED = CorePackage.ABSTRACT_REALTIME_STATECHART__EMBEDDED;

	/**
	 * The feature id for the '<em><b>Embedding Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__EMBEDDING_REGION = CorePackage.ABSTRACT_REALTIME_STATECHART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__TRANSITIONS = CorePackage.ABSTRACT_REALTIME_STATECHART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__VERTICES = CorePackage.ABSTRACT_REALTIME_STATECHART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__ECLASS = CorePackage.ABSTRACT_REALTIME_STATECHART_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__CLOCKS = CorePackage.ABSTRACT_REALTIME_STATECHART_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Available Clocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART__AVAILABLE_CLOCKS = CorePackage.ABSTRACT_REALTIME_STATECHART_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Fujaba Realtime Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUJABA_REALTIME_STATECHART_FEATURE_COUNT = CorePackage.ABSTRACT_REALTIME_STATECHART_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.EntryPointImpl <em>Entry Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.EntryPointImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryPoint()
	 * @generated
	 */
	int ENTRY_POINT = 20;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__ANNOTATION = VERTEX__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__EXTENSION = VERTEX__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__OUTGOING_TRANSITIONS = VERTEX__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__INCOMING_TRANSITIONS = VERTEX__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__STATECHART = VERTEX__STATECHART;

	/**
	 * The number of structural features of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ExitPointImpl <em>Exit Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ExitPointImpl
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getExitPoint()
	 * @generated
	 */
	int EXIT_POINT = 21;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__ANNOTATION = VERTEX__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__EXTENSION = VERTEX__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__OUTGOING_TRANSITIONS = VERTEX__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__INCOMING_TRANSITIONS = VERTEX__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__STATECHART = VERTEX__STATECHART;

	/**
	 * The number of structural features of the '<em>Exit Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.HistoryKind <em>History Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.HistoryKind
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getHistoryKind()
	 * @generated
	 */
	int HISTORY_KIND = 22;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Deadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadline</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Deadline
	 * @generated
	 */
	EClass getDeadline();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Deadline#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Deadline#getUpperBound()
	 * @see #getDeadline()
	 * @generated
	 */
	EReference getDeadline_UpperBound();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Deadline#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Deadline#getLowerBound()
	 * @see #getDeadline()
	 * @generated
	 */
	EReference getDeadline_LowerBound();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AbsoluteDeadline <em>Absolute Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Deadline</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.AbsoluteDeadline
	 * @generated
	 */
	EClass getAbsoluteDeadline();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AbsoluteDeadline#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transition</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.AbsoluteDeadline#getTransition()
	 * @see #getAbsoluteDeadline()
	 * @generated
	 */
	EReference getAbsoluteDeadline_Transition();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AbsoluteDeadline#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.AbsoluteDeadline#getClock()
	 * @see #getAbsoluteDeadline()
	 * @generated
	 */
	EReference getAbsoluteDeadline_Clock();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RelativeDeadline <em>Relative Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Deadline</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RelativeDeadline
	 * @generated
	 */
	EClass getRelativeDeadline();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RelativeDeadline#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transition</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RelativeDeadline#getTransition()
	 * @see #getRelativeDeadline()
	 * @generated
	 */
	EReference getRelativeDeadline_Transition();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock#getAbsoluteDeadlines <em>Absolute Deadlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Absolute Deadlines</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock#getAbsoluteDeadlines()
	 * @see #getClock()
	 * @generated
	 */
	EReference getClock_AbsoluteDeadlines();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock#getStatechart()
	 * @see #getClock()
	 * @generated
	 */
	EReference getClock_Statechart();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock#getClockConstraints <em>Clock Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clock Constraints</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock#getClockConstraints()
	 * @see #getClock()
	 * @generated
	 */
	EReference getClock_ClockConstraints();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region#getStatechart()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Statechart();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent State</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region#getParentState()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_ParentState();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getRegions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Regions();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getDoAction <em>Do Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do Action</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getDoAction()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DoAction();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getExitAction <em>Exit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit Action</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getExitAction()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ExitAction();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getEntryAction <em>Entry Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Action</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getEntryAction()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EntryAction();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getInvariants <em>Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invariants</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getInvariants()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Invariants();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#isCommitted <em>Committed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Committed</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#isCommitted()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Committed();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getChannels()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Channels();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#isInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#isInitial()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Initial();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#isFinal()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Final();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getDerivedExitPoints <em>Derived Exit Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derived Exit Points</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getDerivedExitPoints()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DerivedExitPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getDerivedEntryPoints <em>Derived Entry Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derived Entry Points</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getDerivedEntryPoints()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DerivedEntryPoints();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#isUrgent <em>Urgent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urgent</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#isUrgent()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Urgent();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex#getOutgoingTransitions()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_OutgoingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex#getIncomingTransitions()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_IncomingTransitions();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex#getStatechart()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Statechart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getSendSynchronization <em>Send Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Send Synchronization</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getSendSynchronization()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_SendSynchronization();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getReceiveSynchronization <em>Receive Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive Synchronization</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getReceiveSynchronization()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ReceiveSynchronization();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getTransitionAction <em>Transition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition Action</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getTransitionAction()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TransitionAction();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getStatechart()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Statechart();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getClockResets <em>Clock Resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clock Resets</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getClockResets()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ClockResets();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getTriggerEvents <em>Trigger Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger Events</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getTriggerEvents()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TriggerEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getRaisedEvents <em>Raised Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Raised Events</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getRaisedEvents()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_RaisedEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getClockConstraints <em>Clock Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clock Constraints</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getClockConstraints()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ClockConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getAbsoluteDeadlines <em>Absolute Deadlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Absolute Deadlines</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getAbsoluteDeadlines()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_AbsoluteDeadlines();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getRelativeDeadline <em>Relative Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relative Deadline</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getRelativeDeadline()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_RelativeDeadline();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#isSafetyTransition <em>Safety Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safety Transition</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#isSafetyTransition()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_SafetyTransition();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#isUrgent <em>Urgent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urgent</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#isUrgent()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Urgent();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint <em>Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint
	 * @generated
	 */
	EClass getClockConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bound</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint#getBound()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EReference getClockConstraint_Bound();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint#getClock()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EReference getClockConstraint_Clock();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint#getOperator()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EAttribute getClockConstraint_Operator();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.HistoryState <em>History State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History State</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.HistoryState
	 * @generated
	 */
	EClass getHistoryState();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.HistoryState#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.HistoryState#getKind()
	 * @see #getHistoryState()
	 * @generated
	 */
	EAttribute getHistoryState_Kind();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action#getWcet <em>Wcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wcet</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action#getWcet()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Wcet();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action#getBlocking <em>Blocking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocking</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action#getBlocking()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Blocking();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transition</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action#getTransition()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Transition();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action#isWCETSpecifiedByUser <em>WCET Specified By User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WCET Specified By User</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action#isWCETSpecifiedByUser()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_WCETSpecifiedByUser();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent <em>Asynchronous Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asynchronous Event</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent
	 * @generated
	 */
	EClass getAsynchronousEvent();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent#getTriggeredtransition <em>Triggeredtransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Triggeredtransition</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent#getTriggeredtransition()
	 * @see #getAsynchronousEvent()
	 * @generated
	 */
	EReference getAsynchronousEvent_Triggeredtransition();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent#getRaisedtransition <em>Raisedtransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Raisedtransition</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent#getRaisedtransition()
	 * @see #getAsynchronousEvent()
	 * @generated
	 */
	EReference getAsynchronousEvent_Raisedtransition();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent#getFullEventName <em>Full Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Event Name</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent#getFullEventName()
	 * @see #getAsynchronousEvent()
	 * @generated
	 */
	EAttribute getAsynchronousEvent_FullEventName();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoAction <em>Do Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do Action</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoAction
	 * @generated
	 */
	EClass getDoAction();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoAction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoAction#getAction()
	 * @see #getDoAction()
	 * @generated
	 */
	EReference getDoAction_Action();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoAction#getDoActionRev <em>Do Action Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Do Action Rev</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoAction#getDoActionRev()
	 * @see #getDoAction()
	 * @generated
	 */
	EReference getDoAction_DoActionRev();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoAction#getPeriodLower <em>Period Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period Lower</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoAction#getPeriodLower()
	 * @see #getDoAction()
	 * @generated
	 */
	EAttribute getDoAction_PeriodLower();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoAction#getPeriodUpper <em>Period Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period Upper</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoAction#getPeriodUpper()
	 * @see #getDoAction()
	 * @generated
	 */
	EAttribute getDoAction_PeriodUpper();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitAction <em>Entry Or Exit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Or Exit Action</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitAction
	 * @generated
	 */
	EClass getEntryOrExitAction();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitAction#getClockResets <em>Clock Resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clock Resets</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitAction#getClockResets()
	 * @see #getEntryOrExitAction()
	 * @generated
	 */
	EReference getEntryOrExitAction_ClockResets();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitAction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitAction#getAction()
	 * @see #getEntryOrExitAction()
	 * @generated
	 */
	EReference getEntryOrExitAction_Action();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryAction <em>Entry Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Action</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryAction
	 * @generated
	 */
	EClass getEntryAction();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryAction#getEntryActionRev <em>Entry Action Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entry Action Rev</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryAction#getEntryActionRev()
	 * @see #getEntryAction()
	 * @generated
	 */
	EReference getEntryAction_EntryActionRev();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitAction <em>Exit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Action</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitAction
	 * @generated
	 */
	EClass getExitAction();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitAction#getExitActionRev <em>Exit Action Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Exit Action Rev</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitAction#getExitActionRev()
	 * @see #getExitAction()
	 * @generated
	 */
	EReference getExitAction_ExitActionRev();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel <em>Synchronization Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization Channel</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel
	 * @generated
	 */
	EClass getSynchronizationChannel();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel#getState()
	 * @see #getSynchronizationChannel()
	 * @generated
	 */
	EReference getSynchronizationChannel_State();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Role</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel#getRole()
	 * @see #getSynchronizationChannel()
	 * @generated
	 */
	EReference getSynchronizationChannel_Role();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization
	 * @generated
	 */
	EClass getSynchronization();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization#getSendSyncRev <em>Send Sync Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Send Sync Rev</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization#getSendSyncRev()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_SendSyncRev();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization#getReceiveSyncRev <em>Receive Sync Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Receive Sync Rev</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization#getReceiveSyncRev()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_ReceiveSyncRev();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Prioritizable <em>Prioritizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prioritizable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Prioritizable
	 * @generated
	 */
	EClass getPrioritizable();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Prioritizable#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Prioritizable#getPriority()
	 * @see #getPrioritizable()
	 * @generated
	 */
	EAttribute getPrioritizable_Priority();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart <em>Fujaba Realtime Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fujaba Realtime Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart
	 * @generated
	 */
	EClass getFujabaRealtimeStatechart();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart#getEmbeddingRegion <em>Embedding Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Embedding Region</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart#getEmbeddingRegion()
	 * @see #getFujabaRealtimeStatechart()
	 * @generated
	 */
	EReference getFujabaRealtimeStatechart_EmbeddingRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart#getTransitions()
	 * @see #getFujabaRealtimeStatechart()
	 * @generated
	 */
	EReference getFujabaRealtimeStatechart_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertices</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart#getVertices()
	 * @see #getFujabaRealtimeStatechart()
	 * @generated
	 */
	EReference getFujabaRealtimeStatechart_Vertices();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EClass</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart#getEClass()
	 * @see #getFujabaRealtimeStatechart()
	 * @generated
	 */
	EReference getFujabaRealtimeStatechart_EClass();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart#getClocks <em>Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clocks</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart#getClocks()
	 * @see #getFujabaRealtimeStatechart()
	 * @generated
	 */
	EReference getFujabaRealtimeStatechart_Clocks();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart#getAvailableClocks <em>Available Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Clocks</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart#getAvailableClocks()
	 * @see #getFujabaRealtimeStatechart()
	 * @generated
	 */
	EAttribute getFujabaRealtimeStatechart_AvailableClocks();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryPoint
	 * @generated
	 */
	EClass getEntryPoint();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitPoint <em>Exit Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Point</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitPoint
	 * @generated
	 */
	EClass getExitPoint();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.HistoryKind <em>History Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>History Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.HistoryKind
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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.DeadlineImpl <em>Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.DeadlineImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getDeadline()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.AbsoluteDeadlineImpl <em>Absolute Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.AbsoluteDeadlineImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getAbsoluteDeadline()
		 * @generated
		 */
		EClass ABSOLUTE_DEADLINE = eINSTANCE.getAbsoluteDeadline();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSOLUTE_DEADLINE__TRANSITION = eINSTANCE.getAbsoluteDeadline_Transition();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSOLUTE_DEADLINE__CLOCK = eINSTANCE.getAbsoluteDeadline_Clock();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RelativeDeadlineImpl <em>Relative Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RelativeDeadlineImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getRelativeDeadline()
		 * @generated
		 */
		EClass RELATIVE_DEADLINE = eINSTANCE.getRelativeDeadline();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_DEADLINE__TRANSITION = eINSTANCE.getRelativeDeadline_Transition();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ClockImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

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
		 * The meta object literal for the '<em><b>Clock Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK__CLOCK_CONSTRAINTS = eINSTANCE.getClock_ClockConstraints();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RegionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getRegion()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getState()
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
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__INITIAL = eINSTANCE.getState_Initial();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__FINAL = eINSTANCE.getState_Final();

		/**
		 * The meta object literal for the '<em><b>Derived Exit Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DERIVED_EXIT_POINTS = eINSTANCE.getState_DerivedExitPoints();

		/**
		 * The meta object literal for the '<em><b>Derived Entry Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DERIVED_ENTRY_POINTS = eINSTANCE.getState_DerivedEntryPoints();

		/**
		 * The meta object literal for the '<em><b>Urgent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__URGENT = eINSTANCE.getState_Urgent();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.VertexImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getVertex()
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
		 * The meta object literal for the '<em><b>Statechart</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__STATECHART = eINSTANCE.getVertex_Statechart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

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
		 * The meta object literal for the '<em><b>Transition Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRANSITION_ACTION = eINSTANCE.getTransition_TransitionAction();

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
		 * The meta object literal for the '<em><b>Statechart</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__STATECHART = eINSTANCE.getTransition_Statechart();

		/**
		 * The meta object literal for the '<em><b>Clock Resets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CLOCK_RESETS = eINSTANCE.getTransition_ClockResets();

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
		 * The meta object literal for the '<em><b>Clock Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CLOCK_CONSTRAINTS = eINSTANCE.getTransition_ClockConstraints();

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
		 * The meta object literal for the '<em><b>Safety Transition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__SAFETY_TRANSITION = eINSTANCE.getTransition_SafetyTransition();

		/**
		 * The meta object literal for the '<em><b>Urgent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__URGENT = eINSTANCE.getTransition_Urgent();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ClockConstraintImpl <em>Clock Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ClockConstraintImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getClockConstraint()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.HistoryStateImpl <em>History State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.HistoryStateImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getHistoryState()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ActionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

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
		 * The meta object literal for the '<em><b>Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__TRANSITION = eINSTANCE.getAction_Transition();

		/**
		 * The meta object literal for the '<em><b>WCET Specified By User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__WCET_SPECIFIED_BY_USER = eINSTANCE.getAction_WCETSpecifiedByUser();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.AsynchronousEventImpl <em>Asynchronous Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.AsynchronousEventImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getAsynchronousEvent()
		 * @generated
		 */
		EClass ASYNCHRONOUS_EVENT = eINSTANCE.getAsynchronousEvent();

		/**
		 * The meta object literal for the '<em><b>Triggeredtransition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASYNCHRONOUS_EVENT__TRIGGEREDTRANSITION = eINSTANCE.getAsynchronousEvent_Triggeredtransition();

		/**
		 * The meta object literal for the '<em><b>Raisedtransition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASYNCHRONOUS_EVENT__RAISEDTRANSITION = eINSTANCE.getAsynchronousEvent_Raisedtransition();

		/**
		 * The meta object literal for the '<em><b>Full Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYNCHRONOUS_EVENT__FULL_EVENT_NAME = eINSTANCE.getAsynchronousEvent_FullEventName();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.DoActionImpl <em>Do Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.DoActionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getDoAction()
		 * @generated
		 */
		EClass DO_ACTION = eINSTANCE.getDoAction();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_ACTION__ACTION = eINSTANCE.getDoAction_Action();

		/**
		 * The meta object literal for the '<em><b>Do Action Rev</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_ACTION__DO_ACTION_REV = eINSTANCE.getDoAction_DoActionRev();

		/**
		 * The meta object literal for the '<em><b>Period Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DO_ACTION__PERIOD_LOWER = eINSTANCE.getDoAction_PeriodLower();

		/**
		 * The meta object literal for the '<em><b>Period Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DO_ACTION__PERIOD_UPPER = eINSTANCE.getDoAction_PeriodUpper();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.EntryOrExitActionImpl <em>Entry Or Exit Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.EntryOrExitActionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryOrExitAction()
		 * @generated
		 */
		EClass ENTRY_OR_EXIT_ACTION = eINSTANCE.getEntryOrExitAction();

		/**
		 * The meta object literal for the '<em><b>Clock Resets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_OR_EXIT_ACTION__CLOCK_RESETS = eINSTANCE.getEntryOrExitAction_ClockResets();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_OR_EXIT_ACTION__ACTION = eINSTANCE.getEntryOrExitAction_Action();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.EntryActionImpl <em>Entry Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.EntryActionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryAction()
		 * @generated
		 */
		EClass ENTRY_ACTION = eINSTANCE.getEntryAction();

		/**
		 * The meta object literal for the '<em><b>Entry Action Rev</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_ACTION__ENTRY_ACTION_REV = eINSTANCE.getEntryAction_EntryActionRev();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ExitActionImpl <em>Exit Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ExitActionImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getExitAction()
		 * @generated
		 */
		EClass EXIT_ACTION = eINSTANCE.getExitAction();

		/**
		 * The meta object literal for the '<em><b>Exit Action Rev</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXIT_ACTION__EXIT_ACTION_REV = eINSTANCE.getExitAction_ExitActionRev();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.SynchronizationChannelImpl <em>Synchronization Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.SynchronizationChannelImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronizationChannel()
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
		 * The meta object literal for the '<em><b>Role</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION_CHANNEL__ROLE = eINSTANCE.getSynchronizationChannel_Role();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.SynchronizationImpl <em>Synchronization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.SynchronizationImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronization()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.PrioritizableImpl <em>Prioritizable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.PrioritizableImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getPrioritizable()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl <em>Fujaba Realtime Statechart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getFujabaRealtimeStatechart()
		 * @generated
		 */
		EClass FUJABA_REALTIME_STATECHART = eINSTANCE.getFujabaRealtimeStatechart();

		/**
		 * The meta object literal for the '<em><b>Embedding Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUJABA_REALTIME_STATECHART__EMBEDDING_REGION = eINSTANCE.getFujabaRealtimeStatechart_EmbeddingRegion();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUJABA_REALTIME_STATECHART__TRANSITIONS = eINSTANCE.getFujabaRealtimeStatechart_Transitions();

		/**
		 * The meta object literal for the '<em><b>Vertices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUJABA_REALTIME_STATECHART__VERTICES = eINSTANCE.getFujabaRealtimeStatechart_Vertices();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUJABA_REALTIME_STATECHART__ECLASS = eINSTANCE.getFujabaRealtimeStatechart_EClass();

		/**
		 * The meta object literal for the '<em><b>Clocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUJABA_REALTIME_STATECHART__CLOCKS = eINSTANCE.getFujabaRealtimeStatechart_Clocks();

		/**
		 * The meta object literal for the '<em><b>Available Clocks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUJABA_REALTIME_STATECHART__AVAILABLE_CLOCKS = eINSTANCE.getFujabaRealtimeStatechart_AvailableClocks();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.EntryPointImpl <em>Entry Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.EntryPointImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryPoint()
		 * @generated
		 */
		EClass ENTRY_POINT = eINSTANCE.getEntryPoint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ExitPointImpl <em>Exit Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ExitPointImpl
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getExitPoint()
		 * @generated
		 */
		EClass EXIT_POINT = eINSTANCE.getExitPoint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.HistoryKind <em>History Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.HistoryKind
		 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartPackageImpl#getHistoryKind()
		 * @generated
		 */
		EEnum HISTORY_KIND = eINSTANCE.getHistoryKind();

	}

} //RealtimestatechartPackage
