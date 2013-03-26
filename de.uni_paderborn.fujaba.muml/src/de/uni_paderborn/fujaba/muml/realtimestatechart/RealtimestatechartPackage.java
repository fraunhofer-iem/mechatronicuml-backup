/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.CorePackage;

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
 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartFactory
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
	String eNS_URI = "http://www.fujaba.de/muml/realtimestatechart/0.3.18";

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
	RealtimestatechartPackage eINSTANCE = de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.DeadlineImpl <em>Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.DeadlineImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getDeadline()
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.AbsoluteDeadlineImpl <em>Absolute Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.AbsoluteDeadlineImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getAbsoluteDeadline()
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
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_DEADLINE__CLOCK = DEADLINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Absolute Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_DEADLINE_FEATURE_COUNT = DEADLINE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RelativeDeadlineImpl <em>Relative Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RelativeDeadlineImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getRelativeDeadline()
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
	 * The number of structural features of the '<em>Relative Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_DEADLINE_FEATURE_COUNT = DEADLINE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ClockImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getClock()
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
	int CLOCK__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__STATECHART = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RegionImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.VertexImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 6;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.StateImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getState()
	 * @generated
	 */
	int STATE = 5;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.TransitionImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 7;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ClockConstraintImpl <em>Clock Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ClockConstraintImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getClockConstraint()
	 * @generated
	 */
	int CLOCK_CONSTRAINT = 8;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ActionImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 9;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.AsynchronousMessageEventImpl <em>Asynchronous Message Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.AsynchronousMessageEventImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getAsynchronousMessageEvent()
	 * @generated
	 */
	int ASYNCHRONOUS_MESSAGE_EVENT = 10;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.EventImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 17;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.StateEventImpl <em>State Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.StateEventImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getStateEvent()
	 * @generated
	 */
	int STATE_EVENT = 19;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.DoEventImpl <em>Do Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.DoEventImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getDoEvent()
	 * @generated
	 */
	int DO_EVENT = 11;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.EntryOrExitEventImpl <em>Entry Or Exit Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.EntryOrExitEventImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryOrExitEvent()
	 * @generated
	 */
	int ENTRY_OR_EXIT_EVENT = 12;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.SynchronizationChannelImpl <em>Synchronization Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.SynchronizationChannelImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronizationChannel()
	 * @generated
	 */
	int SYNCHRONIZATION_CHANNEL = 13;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.SynchronizationImpl <em>Synchronization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.SynchronizationImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronization()
	 * @generated
	 */
	int SYNCHRONIZATION = 14;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.TransitionEventImpl <em>Transition Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.TransitionEventImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getTransitionEvent()
	 * @generated
	 */
	int TRANSITION_EVENT = 18;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.PrioritizedElementImpl <em>Prioritized Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.PrioritizedElementImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getPrioritizedElement()
	 * @generated
	 */
	int PRIORITIZED_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZED_ELEMENT__PRIORITY = 0;

	/**
	 * The number of structural features of the '<em>Prioritized Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__PRIORITY = PRIORITIZED_ELEMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ANNOTATION = PRIORITIZED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__EXTENSION = PRIORITIZED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__COMMENT = PRIORITIZED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Embedded Statechart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__EMBEDDED_STATECHART = PRIORITIZED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__PARENT_STATE = PRIORITIZED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Embeds History Statechart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__EMBEDS_HISTORY_STATECHART = PRIORITIZED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = PRIORITIZED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = PRIORITIZED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__OUTGOING_TRANSITIONS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__INCOMING_TRANSITIONS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Super Vertices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__ALL_SUPER_VERTICES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>All Super Vertices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ALL_SUPER_VERTICES = VERTEX__ALL_SUPER_VERTICES;

	/**
	 * The feature id for the '<em><b>Embedded Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EMBEDDED_REGIONS = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Do Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DO_EVENT = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exit Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXIT_EVENT = VERTEX_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entry Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENTRY_EVENT = VERTEX_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INVARIANTS = VERTEX_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INITIAL = VERTEX_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FINAL = VERTEX_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Urgent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__URGENT = VERTEX_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CHANNELS = VERTEX_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EVENTS = VERTEX_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Connection Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CONNECTION_POINTS = VERTEX_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SIMPLE = VERTEX_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Parent Statechart</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PARENT_STATECHART = VERTEX_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PRIORITY = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__COMMENT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synchronization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SYNCHRONIZATION = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__STATECHART = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Clock Resets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CLOCK_RESETS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trigger Message Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER_MESSAGE_EVENT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Raise Message Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RAISE_MESSAGE_EVENT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Clock Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CLOCK_CONSTRAINTS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Absolute Deadlines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ABSOLUTE_DEADLINES = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Relative Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RELATIVE_DEADLINE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Blockable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__BLOCKABLE = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENTS = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Urgent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__URGENT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RECEIVER_MESSAGE_TYPES = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SENDER_MESSAGE_TYPES = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 19;

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
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__EXPRESSIONS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__KIND = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT__KIND = EVENT__KIND;

	/**
	 * The number of structural features of the '<em>Transition Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_MESSAGE_EVENT__KIND = TRANSITION_EVENT__KIND;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE = TRANSITION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Asynchronous Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_MESSAGE_EVENT_FEATURE_COUNT = TRANSITION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT__KIND = EVENT__KIND;

	/**
	 * The number of structural features of the '<em>State Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EVENT__KIND = STATE_EVENT__KIND;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EVENT__ACTION = STATE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EVENT__PERIOD_LOWER = STATE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EVENT__PERIOD_UPPER = STATE_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Do Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EVENT_FEATURE_COUNT = STATE_EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OR_EXIT_EVENT__KIND = STATE_EVENT__KIND;

	/**
	 * The feature id for the '<em><b>Clock Resets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OR_EXIT_EVENT__CLOCK_RESETS = STATE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OR_EXIT_EVENT__ACTION = STATE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entry Or Exit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OR_EXIT_EVENT_FEATURE_COUNT = STATE_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__STATE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__SELECTOR_TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Synchronization Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Sync Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__SYNC_CHANNEL = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__KIND = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selector Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__SELECTOR_EXPRESSION = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimeStatechartImpl <em>Realtime Statechart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimeStatechartImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getRealtimeStatechart()
	 * @generated
	 */
	int REALTIME_STATECHART = 16;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__ANNOTATION = CorePackage.NAMED_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__EXTENSION = CorePackage.NAMED_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__BEHAVIORAL_ELEMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__OPERATIONS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__VARIABLES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__PARENT_REGION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__TRANSITIONS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__STATES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__CLOCKS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__HISTORY = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Flat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__FLAT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Available Clocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__AVAILABLE_CLOCKS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__EMBEDDED = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>All Available Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__ALL_AVAILABLE_VARIABLES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>All Available Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__ALL_AVAILABLE_OPERATIONS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Realtime Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.MessageImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 20;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ANNOTATION = CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__EXTENSION = CorePackage.EXTENDABLE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__INSTANCE_OF = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PARAMETER_BINDING = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.EntryEventImpl <em>Entry Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.EntryEventImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryEvent()
	 * @generated
	 */
	int ENTRY_EVENT = 21;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_EVENT__KIND = ENTRY_OR_EXIT_EVENT__KIND;

	/**
	 * The feature id for the '<em><b>Clock Resets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_EVENT__CLOCK_RESETS = ENTRY_OR_EXIT_EVENT__CLOCK_RESETS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_EVENT__ACTION = ENTRY_OR_EXIT_EVENT__ACTION;

	/**
	 * The number of structural features of the '<em>Entry Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_EVENT_FEATURE_COUNT = ENTRY_OR_EXIT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ExitEventImpl <em>Exit Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ExitEventImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getExitEvent()
	 * @generated
	 */
	int EXIT_EVENT = 22;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EVENT__KIND = ENTRY_OR_EXIT_EVENT__KIND;

	/**
	 * The feature id for the '<em><b>Clock Resets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EVENT__CLOCK_RESETS = ENTRY_OR_EXIT_EVENT__CLOCK_RESETS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EVENT__ACTION = ENTRY_OR_EXIT_EVENT__ACTION;

	/**
	 * The number of structural features of the '<em>Exit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EVENT_FEATURE_COUNT = ENTRY_OR_EXIT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.StateConnectionPointImpl <em>State Connection Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.StateConnectionPointImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getStateConnectionPoint()
	 * @generated
	 */
	int STATE_CONNECTION_POINT = 23;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT__ANNOTATION = VERTEX__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT__EXTENSION = VERTEX__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT__OUTGOING_TRANSITIONS = VERTEX__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT__INCOMING_TRANSITIONS = VERTEX__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>All Super Vertices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT__ALL_SUPER_VERTICES = VERTEX__ALL_SUPER_VERTICES;

	/**
	 * The feature id for the '<em><b>State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT__STATE = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.EntryPointImpl <em>Entry Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.EntryPointImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryPoint()
	 * @generated
	 */
	int ENTRY_POINT = 24;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__ANNOTATION = STATE_CONNECTION_POINT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__EXTENSION = STATE_CONNECTION_POINT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__NAME = STATE_CONNECTION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__OUTGOING_TRANSITIONS = STATE_CONNECTION_POINT__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__INCOMING_TRANSITIONS = STATE_CONNECTION_POINT__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>All Super Vertices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__ALL_SUPER_VERTICES = STATE_CONNECTION_POINT__ALL_SUPER_VERTICES;

	/**
	 * The feature id for the '<em><b>State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__STATE = STATE_CONNECTION_POINT__STATE;

	/**
	 * The number of structural features of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_FEATURE_COUNT = STATE_CONNECTION_POINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ExitPointImpl <em>Exit Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ExitPointImpl
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getExitPoint()
	 * @generated
	 */
	int EXIT_POINT = 25;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__ANNOTATION = STATE_CONNECTION_POINT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__EXTENSION = STATE_CONNECTION_POINT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__NAME = STATE_CONNECTION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__OUTGOING_TRANSITIONS = STATE_CONNECTION_POINT__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__INCOMING_TRANSITIONS = STATE_CONNECTION_POINT__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>All Super Vertices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__ALL_SUPER_VERTICES = STATE_CONNECTION_POINT__ALL_SUPER_VERTICES;

	/**
	 * The feature id for the '<em><b>State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__STATE = STATE_CONNECTION_POINT__STATE;

	/**
	 * The number of structural features of the '<em>Exit Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT_FEATURE_COUNT = STATE_CONNECTION_POINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationKind <em>Synchronization Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationKind
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronizationKind()
	 * @generated
	 */
	int SYNCHRONIZATION_KIND = 26;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.EventKind <em>Event Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.EventKind
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getEventKind()
	 * @generated
	 */
	int EVENT_KIND = 27;

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Deadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadline</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Deadline
	 * @generated
	 */
	EClass getDeadline();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Deadline#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Deadline#getUpperBound()
	 * @see #getDeadline()
	 * @generated
	 */
	EReference getDeadline_UpperBound();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Deadline#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Deadline#getLowerBound()
	 * @see #getDeadline()
	 * @generated
	 */
	EReference getDeadline_LowerBound();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.AbsoluteDeadline <em>Absolute Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Deadline</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.AbsoluteDeadline
	 * @generated
	 */
	EClass getAbsoluteDeadline();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.AbsoluteDeadline#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.AbsoluteDeadline#getClock()
	 * @see #getAbsoluteDeadline()
	 * @generated
	 */
	EReference getAbsoluteDeadline_Clock();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RelativeDeadline <em>Relative Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Deadline</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RelativeDeadline
	 * @generated
	 */
	EClass getRelativeDeadline();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Clock#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Clock#getStatechart()
	 * @see #getClock()
	 * @generated
	 */
	EReference getClock_Statechart();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Region#getEmbeddedStatechart <em>Embedded Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Embedded Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Region#getEmbeddedStatechart()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_EmbeddedStatechart();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Region#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent State</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Region#getParentState()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_ParentState();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Region#isEmbedsHistoryStatechart <em>Embeds History Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embeds History Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Region#isEmbedsHistoryStatechart()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_EmbedsHistoryStatechart();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Region#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Region#getName()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.State#getEmbeddedRegions <em>Embedded Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Regions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.State#getEmbeddedRegions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EmbeddedRegions();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.State#getDoEvent <em>Do Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do Event</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.State#getDoEvent()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DoEvent();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.State#getExitEvent <em>Exit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit Event</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.State#getExitEvent()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ExitEvent();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.State#getEntryEvent <em>Entry Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Event</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.State#getEntryEvent()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EntryEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.State#getInvariants <em>Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invariants</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.State#getInvariants()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Invariants();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.State#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.State#getChannels()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Channels();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.State#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.State#getEvents()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.State#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Points</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.State#getConnectionPoints()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ConnectionPoints();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.State#isSimple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.State#isSimple()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Simple();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.State#getParentStatechart <em>Parent Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.State#getParentStatechart()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ParentStatechart();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.State#isInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.State#isInitial()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Initial();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.State#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.State#isFinal()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Final();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.State#isUrgent <em>Urgent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urgent</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.State#isUrgent()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Urgent();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex#getOutgoingTransitions()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_OutgoingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex#getIncomingTransitions()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_IncomingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex#getAllSuperVertices <em>All Super Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Super Vertices</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex#getAllSuperVertices()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_AllSuperVertices();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getSynchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synchronization</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getSynchronization()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Synchronization();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getStatechart()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Statechart();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getClockResets <em>Clock Resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clock Resets</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getClockResets()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ClockResets();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getTriggerMessageEvent <em>Trigger Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger Message Event</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getTriggerMessageEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TriggerMessageEvent();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getRaiseMessageEvent <em>Raise Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Raise Message Event</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getRaiseMessageEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_RaiseMessageEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getClockConstraints <em>Clock Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clock Constraints</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getClockConstraints()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ClockConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getAbsoluteDeadlines <em>Absolute Deadlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Absolute Deadlines</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getAbsoluteDeadlines()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_AbsoluteDeadlines();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getRelativeDeadline <em>Relative Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relative Deadline</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getRelativeDeadline()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_RelativeDeadline();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#isBlockable <em>Blockable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blockable</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#isBlockable()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Blockable();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getEvents()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Events();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getAction()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Action();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#isUrgent <em>Urgent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urgent</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#isUrgent()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Urgent();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getReceiverMessageTypes <em>Receiver Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receiver Message Types</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getReceiverMessageTypes()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ReceiverMessageTypes();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getSenderMessageTypes <em>Sender Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sender Message Types</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getSenderMessageTypes()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_SenderMessageTypes();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.ClockConstraint <em>Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Constraint</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.ClockConstraint
	 * @generated
	 */
	EClass getClockConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.ClockConstraint#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bound</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.ClockConstraint#getBound()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EReference getClockConstraint_Bound();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.ClockConstraint#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.ClockConstraint#getClock()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EReference getClockConstraint_Clock();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.ClockConstraint#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.ClockConstraint#getOperator()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EAttribute getClockConstraint_Operator();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Action#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Action#getExpressions()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Expressions();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.AsynchronousMessageEvent <em>Asynchronous Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asynchronous Message Event</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.AsynchronousMessageEvent
	 * @generated
	 */
	EClass getAsynchronousMessageEvent();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.AsynchronousMessageEvent#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.AsynchronousMessageEvent#getMessage()
	 * @see #getAsynchronousMessageEvent()
	 * @generated
	 */
	EReference getAsynchronousMessageEvent_Message();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.DoEvent <em>Do Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do Event</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.DoEvent
	 * @generated
	 */
	EClass getDoEvent();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.DoEvent#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.DoEvent#getAction()
	 * @see #getDoEvent()
	 * @generated
	 */
	EReference getDoEvent_Action();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.DoEvent#getPeriodLower <em>Period Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period Lower</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.DoEvent#getPeriodLower()
	 * @see #getDoEvent()
	 * @generated
	 */
	EReference getDoEvent_PeriodLower();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.DoEvent#getPeriodUpper <em>Period Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period Upper</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.DoEvent#getPeriodUpper()
	 * @see #getDoEvent()
	 * @generated
	 */
	EReference getDoEvent_PeriodUpper();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.EntryOrExitEvent <em>Entry Or Exit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Or Exit Event</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.EntryOrExitEvent
	 * @generated
	 */
	EClass getEntryOrExitEvent();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.EntryOrExitEvent#getClockResets <em>Clock Resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clock Resets</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.EntryOrExitEvent#getClockResets()
	 * @see #getEntryOrExitEvent()
	 * @generated
	 */
	EReference getEntryOrExitEvent_ClockResets();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.EntryOrExitEvent#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.EntryOrExitEvent#getAction()
	 * @see #getEntryOrExitEvent()
	 * @generated
	 */
	EReference getEntryOrExitEvent_Action();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel <em>Synchronization Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization Channel</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel
	 * @generated
	 */
	EClass getSynchronizationChannel();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel#getState()
	 * @see #getSynchronizationChannel()
	 * @generated
	 */
	EReference getSynchronizationChannel_State();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel#getSelectorType <em>Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selector Type</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel#getSelectorType()
	 * @see #getSynchronizationChannel()
	 * @generated
	 */
	EReference getSynchronizationChannel_SelectorType();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization
	 * @generated
	 */
	EClass getSynchronization();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization#getSyncChannel <em>Sync Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sync Channel</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization#getSyncChannel()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_SyncChannel();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization#getKind()
	 * @see #getSynchronization()
	 * @generated
	 */
	EAttribute getSynchronization_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization#getSelectorExpression <em>Selector Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization#getSelectorExpression()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_SelectorExpression();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.PrioritizedElement <em>Prioritized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prioritized Element</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.PrioritizedElement
	 * @generated
	 */
	EClass getPrioritizedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.PrioritizedElement#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.PrioritizedElement#getPriority()
	 * @see #getPrioritizedElement()
	 * @generated
	 */
	EAttribute getPrioritizedElement_Priority();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart <em>Realtime Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realtime Statechart</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart
	 * @generated
	 */
	EClass getRealtimeStatechart();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getParentRegion <em>Parent Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Region</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getParentRegion()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_ParentRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getTransitions()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getStates()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_States();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getClocks <em>Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clocks</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getClocks()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_Clocks();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#isHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>History</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#isHistory()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EAttribute getRealtimeStatechart_History();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#isFlat <em>Flat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flat</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#isFlat()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EAttribute getRealtimeStatechart_Flat();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getAvailableClocks <em>Available Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Available Clocks</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getAvailableClocks()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_AvailableClocks();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#isEmbedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embedded</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#isEmbedded()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EAttribute getRealtimeStatechart_Embedded();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getAllAvailableVariables <em>All Available Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Available Variables</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getAllAvailableVariables()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_AllAvailableVariables();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getAllAvailableOperations <em>All Available Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Available Operations</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getAllAvailableOperations()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_AllAvailableOperations();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Event#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Event#getKind()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Kind();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.TransitionEvent <em>Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Event</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.TransitionEvent
	 * @generated
	 */
	EClass getTransitionEvent();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.StateEvent <em>State Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Event</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.StateEvent
	 * @generated
	 */
	EClass getStateEvent();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Message#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Message#getInstanceOf()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_InstanceOf();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Message#getParameterBinding <em>Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Binding</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Message#getParameterBinding()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_ParameterBinding();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.EntryEvent <em>Entry Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Event</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.EntryEvent
	 * @generated
	 */
	EClass getEntryEvent();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.ExitEvent <em>Exit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Event</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.ExitEvent
	 * @generated
	 */
	EClass getExitEvent();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.StateConnectionPoint <em>State Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Connection Point</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.StateConnectionPoint
	 * @generated
	 */
	EClass getStateConnectionPoint();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.StateConnectionPoint#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.StateConnectionPoint#getState()
	 * @see #getStateConnectionPoint()
	 * @generated
	 */
	EReference getStateConnectionPoint_State();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.EntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.EntryPoint
	 * @generated
	 */
	EClass getEntryPoint();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.ExitPoint <em>Exit Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Point</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.ExitPoint
	 * @generated
	 */
	EClass getExitPoint();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationKind <em>Synchronization Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Synchronization Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationKind
	 * @generated
	 */
	EEnum getSynchronizationKind();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.EventKind <em>Event Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Kind</em>'.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.EventKind
	 * @generated
	 */
	EEnum getEventKind();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.DeadlineImpl <em>Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.DeadlineImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getDeadline()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.AbsoluteDeadlineImpl <em>Absolute Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.AbsoluteDeadlineImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getAbsoluteDeadline()
		 * @generated
		 */
		EClass ABSOLUTE_DEADLINE = eINSTANCE.getAbsoluteDeadline();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSOLUTE_DEADLINE__CLOCK = eINSTANCE.getAbsoluteDeadline_Clock();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RelativeDeadlineImpl <em>Relative Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RelativeDeadlineImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getRelativeDeadline()
		 * @generated
		 */
		EClass RELATIVE_DEADLINE = eINSTANCE.getRelativeDeadline();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ClockImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

		/**
		 * The meta object literal for the '<em><b>Statechart</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK__STATECHART = eINSTANCE.getClock_Statechart();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RegionImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Embedded Statechart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__EMBEDDED_STATECHART = eINSTANCE.getRegion_EmbeddedStatechart();

		/**
		 * The meta object literal for the '<em><b>Parent State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__PARENT_STATE = eINSTANCE.getRegion_ParentState();

		/**
		 * The meta object literal for the '<em><b>Embeds History Statechart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__EMBEDS_HISTORY_STATECHART = eINSTANCE.getRegion_EmbedsHistoryStatechart();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__NAME = eINSTANCE.getRegion_Name();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.StateImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Embedded Regions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EMBEDDED_REGIONS = eINSTANCE.getState_EmbeddedRegions();

		/**
		 * The meta object literal for the '<em><b>Do Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DO_EVENT = eINSTANCE.getState_DoEvent();

		/**
		 * The meta object literal for the '<em><b>Exit Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXIT_EVENT = eINSTANCE.getState_ExitEvent();

		/**
		 * The meta object literal for the '<em><b>Entry Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENTRY_EVENT = eINSTANCE.getState_EntryEvent();

		/**
		 * The meta object literal for the '<em><b>Invariants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INVARIANTS = eINSTANCE.getState_Invariants();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CHANNELS = eINSTANCE.getState_Channels();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EVENTS = eINSTANCE.getState_Events();

		/**
		 * The meta object literal for the '<em><b>Connection Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CONNECTION_POINTS = eINSTANCE.getState_ConnectionPoints();

		/**
		 * The meta object literal for the '<em><b>Simple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__SIMPLE = eINSTANCE.getState_Simple();

		/**
		 * The meta object literal for the '<em><b>Parent Statechart</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PARENT_STATECHART = eINSTANCE.getState_ParentStatechart();

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
		 * The meta object literal for the '<em><b>Urgent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__URGENT = eINSTANCE.getState_Urgent();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.VertexImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getVertex()
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
		 * The meta object literal for the '<em><b>All Super Vertices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__ALL_SUPER_VERTICES = eINSTANCE.getVertex_AllSuperVertices();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.TransitionImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Synchronization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SYNCHRONIZATION = eINSTANCE.getTransition_Synchronization();

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
		 * The meta object literal for the '<em><b>Trigger Message Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGER_MESSAGE_EVENT = eINSTANCE.getTransition_TriggerMessageEvent();

		/**
		 * The meta object literal for the '<em><b>Raise Message Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__RAISE_MESSAGE_EVENT = eINSTANCE.getTransition_RaiseMessageEvent();

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
		 * The meta object literal for the '<em><b>Blockable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__BLOCKABLE = eINSTANCE.getTransition_Blockable();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EVENTS = eINSTANCE.getTransition_Events();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ACTION = eINSTANCE.getTransition_Action();

		/**
		 * The meta object literal for the '<em><b>Urgent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__URGENT = eINSTANCE.getTransition_Urgent();

		/**
		 * The meta object literal for the '<em><b>Receiver Message Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__RECEIVER_MESSAGE_TYPES = eINSTANCE.getTransition_ReceiverMessageTypes();

		/**
		 * The meta object literal for the '<em><b>Sender Message Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SENDER_MESSAGE_TYPES = eINSTANCE.getTransition_SenderMessageTypes();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ClockConstraintImpl <em>Clock Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ClockConstraintImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getClockConstraint()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ActionImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__EXPRESSIONS = eINSTANCE.getAction_Expressions();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.AsynchronousMessageEventImpl <em>Asynchronous Message Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.AsynchronousMessageEventImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getAsynchronousMessageEvent()
		 * @generated
		 */
		EClass ASYNCHRONOUS_MESSAGE_EVENT = eINSTANCE.getAsynchronousMessageEvent();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE = eINSTANCE.getAsynchronousMessageEvent_Message();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.DoEventImpl <em>Do Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.DoEventImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getDoEvent()
		 * @generated
		 */
		EClass DO_EVENT = eINSTANCE.getDoEvent();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_EVENT__ACTION = eINSTANCE.getDoEvent_Action();

		/**
		 * The meta object literal for the '<em><b>Period Lower</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_EVENT__PERIOD_LOWER = eINSTANCE.getDoEvent_PeriodLower();

		/**
		 * The meta object literal for the '<em><b>Period Upper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_EVENT__PERIOD_UPPER = eINSTANCE.getDoEvent_PeriodUpper();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.EntryOrExitEventImpl <em>Entry Or Exit Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.EntryOrExitEventImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryOrExitEvent()
		 * @generated
		 */
		EClass ENTRY_OR_EXIT_EVENT = eINSTANCE.getEntryOrExitEvent();

		/**
		 * The meta object literal for the '<em><b>Clock Resets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_OR_EXIT_EVENT__CLOCK_RESETS = eINSTANCE.getEntryOrExitEvent_ClockResets();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_OR_EXIT_EVENT__ACTION = eINSTANCE.getEntryOrExitEvent_Action();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.SynchronizationChannelImpl <em>Synchronization Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.SynchronizationChannelImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronizationChannel()
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
		 * The meta object literal for the '<em><b>Selector Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION_CHANNEL__SELECTOR_TYPE = eINSTANCE.getSynchronizationChannel_SelectorType();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.SynchronizationImpl <em>Synchronization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.SynchronizationImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronization()
		 * @generated
		 */
		EClass SYNCHRONIZATION = eINSTANCE.getSynchronization();

		/**
		 * The meta object literal for the '<em><b>Sync Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION__SYNC_CHANNEL = eINSTANCE.getSynchronization_SyncChannel();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONIZATION__KIND = eINSTANCE.getSynchronization_Kind();

		/**
		 * The meta object literal for the '<em><b>Selector Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION__SELECTOR_EXPRESSION = eINSTANCE.getSynchronization_SelectorExpression();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.PrioritizedElementImpl <em>Prioritized Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.PrioritizedElementImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getPrioritizedElement()
		 * @generated
		 */
		EClass PRIORITIZED_ELEMENT = eINSTANCE.getPrioritizedElement();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITIZED_ELEMENT__PRIORITY = eINSTANCE.getPrioritizedElement_Priority();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimeStatechartImpl <em>Realtime Statechart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimeStatechartImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getRealtimeStatechart()
		 * @generated
		 */
		EClass REALTIME_STATECHART = eINSTANCE.getRealtimeStatechart();

		/**
		 * The meta object literal for the '<em><b>Parent Region</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART__PARENT_REGION = eINSTANCE.getRealtimeStatechart_ParentRegion();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART__TRANSITIONS = eINSTANCE.getRealtimeStatechart_Transitions();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART__STATES = eINSTANCE.getRealtimeStatechart_States();

		/**
		 * The meta object literal for the '<em><b>Clocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART__CLOCKS = eINSTANCE.getRealtimeStatechart_Clocks();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIME_STATECHART__HISTORY = eINSTANCE.getRealtimeStatechart_History();

		/**
		 * The meta object literal for the '<em><b>Flat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIME_STATECHART__FLAT = eINSTANCE.getRealtimeStatechart_Flat();

		/**
		 * The meta object literal for the '<em><b>Available Clocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART__AVAILABLE_CLOCKS = eINSTANCE.getRealtimeStatechart_AvailableClocks();

		/**
		 * The meta object literal for the '<em><b>Embedded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIME_STATECHART__EMBEDDED = eINSTANCE.getRealtimeStatechart_Embedded();

		/**
		 * The meta object literal for the '<em><b>All Available Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART__ALL_AVAILABLE_VARIABLES = eINSTANCE.getRealtimeStatechart_AllAvailableVariables();

		/**
		 * The meta object literal for the '<em><b>All Available Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART__ALL_AVAILABLE_OPERATIONS = eINSTANCE.getRealtimeStatechart_AllAvailableOperations();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.EventImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__KIND = eINSTANCE.getEvent_Kind();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.TransitionEventImpl <em>Transition Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.TransitionEventImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getTransitionEvent()
		 * @generated
		 */
		EClass TRANSITION_EVENT = eINSTANCE.getTransitionEvent();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.StateEventImpl <em>State Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.StateEventImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getStateEvent()
		 * @generated
		 */
		EClass STATE_EVENT = eINSTANCE.getStateEvent();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.MessageImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__INSTANCE_OF = eINSTANCE.getMessage_InstanceOf();

		/**
		 * The meta object literal for the '<em><b>Parameter Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__PARAMETER_BINDING = eINSTANCE.getMessage_ParameterBinding();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.EntryEventImpl <em>Entry Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.EntryEventImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryEvent()
		 * @generated
		 */
		EClass ENTRY_EVENT = eINSTANCE.getEntryEvent();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ExitEventImpl <em>Exit Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ExitEventImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getExitEvent()
		 * @generated
		 */
		EClass EXIT_EVENT = eINSTANCE.getExitEvent();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.StateConnectionPointImpl <em>State Connection Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.StateConnectionPointImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getStateConnectionPoint()
		 * @generated
		 */
		EClass STATE_CONNECTION_POINT = eINSTANCE.getStateConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_CONNECTION_POINT__STATE = eINSTANCE.getStateConnectionPoint_State();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.EntryPointImpl <em>Entry Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.EntryPointImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryPoint()
		 * @generated
		 */
		EClass ENTRY_POINT = eINSTANCE.getEntryPoint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ExitPointImpl <em>Exit Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.ExitPointImpl
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getExitPoint()
		 * @generated
		 */
		EClass EXIT_POINT = eINSTANCE.getExitPoint();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationKind <em>Synchronization Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationKind
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronizationKind()
		 * @generated
		 */
		EEnum SYNCHRONIZATION_KIND = eINSTANCE.getSynchronizationKind();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.EventKind <em>Event Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.EventKind
		 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.impl.RealtimestatechartPackageImpl#getEventKind()
		 * @generated
		 */
		EEnum EVENT_KIND = eINSTANCE.getEventKind();

	}

} //RealtimestatechartPackage
