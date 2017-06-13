/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.CorePackage;

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
 * <!-- begin-model-doc -->
 * This package provides modeling support for Real-Time Statecharts as a combination of UML state machines and timed automata.
 * <!-- end-model-doc -->
 * @see org.muml.pim.realtimestatechart.RealtimestatechartFactory
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
	String eNS_URI = "http://www.muml.org/pim/realtimestatechart/1.0.0";

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
	RealtimestatechartPackage eINSTANCE = org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.DeadlineImpl <em>Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.DeadlineImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getDeadline()
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
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.AbsoluteDeadlineImpl <em>Absolute Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.AbsoluteDeadlineImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getAbsoluteDeadline()
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
	 * The number of operations of the '<em>Absolute Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_DEADLINE_OPERATION_COUNT = DEADLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.RelativeDeadlineImpl <em>Relative Deadline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.RelativeDeadlineImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getRelativeDeadline()
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
	 * The number of operations of the '<em>Relative Deadline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_DEADLINE_OPERATION_COUNT = DEADLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.ClockImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.RegionImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 4;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.VertexImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 6;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.StateImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getState()
	 * @generated
	 */
	int STATE = 5;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.TransitionImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 7;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.ClockConstraintImpl <em>Clock Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.ClockConstraintImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getClockConstraint()
	 * @generated
	 */
	int CLOCK_CONSTRAINT = 8;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.ActionImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 9;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.AsynchronousMessageEventImpl <em>Asynchronous Message Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.AsynchronousMessageEventImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getAsynchronousMessageEvent()
	 * @generated
	 */
	int ASYNCHRONOUS_MESSAGE_EVENT = 10;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.EventImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 16;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.StateEventImpl <em>State Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.StateEventImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getStateEvent()
	 * @generated
	 */
	int STATE_EVENT = 18;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.DoEventImpl <em>Do Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.DoEventImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getDoEvent()
	 * @generated
	 */
	int DO_EVENT = 11;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.EntryOrExitEventImpl <em>Entry Or Exit Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.EntryOrExitEventImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryOrExitEvent()
	 * @generated
	 */
	int ENTRY_OR_EXIT_EVENT = 12;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.SynchronizationChannelImpl <em>Synchronization Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.SynchronizationChannelImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronizationChannel()
	 * @generated
	 */
	int SYNCHRONIZATION_CHANNEL = 13;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.SynchronizationImpl <em>Synchronization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.SynchronizationImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronization()
	 * @generated
	 */
	int SYNCHRONIZATION = 14;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.TransitionEventImpl <em>Transition Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.TransitionEventImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getTransitionEvent()
	 * @generated
	 */
	int TRANSITION_EVENT = 17;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Embedded Statechart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__EMBEDDED_STATECHART = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__PARENT_STATE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___ECLASS = CorePackage.COMMENTABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___EIS_PROXY = CorePackage.COMMENTABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___ERESOURCE = CorePackage.COMMENTABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___ECONTAINER = CorePackage.COMMENTABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___ECONTAINING_FEATURE = CorePackage.COMMENTABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___ECONTAINMENT_FEATURE = CorePackage.COMMENTABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___ECONTENTS = CorePackage.COMMENTABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___EALL_CONTENTS = CorePackage.COMMENTABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___ECROSS_REFERENCES = CorePackage.COMMENTABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___EGET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.COMMENTABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___EIS_SET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___EUNSET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___EINVOKE__EOPERATION_ELIST = CorePackage.COMMENTABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__OUTGOING_TRANSITIONS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__INCOMING_TRANSITIONS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Super Vertices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__ALL_SUPER_VERTICES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Is Super Vertex Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___IS_SUPER_VERTEX_OF__VERTEX = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Unique Transition Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___GET_UNIQUE_TRANSITION_PRIORITY__INT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Outgoing Transition Of Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___HAS_OUTGOING_TRANSITION_OF_PRIORITY__INT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXTENSIONS = VERTEX__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__COMMENT = VERTEX__COMMENT;

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
	 * The feature id for the '<em><b>All Available Channels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ALL_AVAILABLE_CHANNELS = VERTEX_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 14;

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
	 * The operation id for the '<em>Is Super Vertex Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_SUPER_VERTEX_OF__VERTEX = VERTEX___IS_SUPER_VERTEX_OF__VERTEX;

	/**
	 * The operation id for the '<em>Get Unique Transition Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___GET_UNIQUE_TRANSITION_PRIORITY__INT = VERTEX___GET_UNIQUE_TRANSITION_PRIORITY__INT;

	/**
	 * The operation id for the '<em>Has Outgoing Transition Of Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___HAS_OUTGOING_TRANSITION_OF_PRIORITY__INT = VERTEX___HAS_OUTGOING_TRANSITION_OF_PRIORITY__INT;

	/**
	 * The operation id for the '<em>Get Unique Region Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___GET_UNIQUE_REGION_PRIORITY__INT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Region Of Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___HAS_REGION_OF_PRIORITY__INT = VERTEX_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EXTENSIONS = CorePackage.COMMENTABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__COMMENT = CorePackage.COMMENTABLE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Synchronization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SYNCHRONIZATION = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__STATECHART = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Clock Resets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CLOCK_RESETS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Trigger Message Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER_MESSAGE_EVENT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Raise Message Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RAISE_MESSAGE_EVENT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Clock Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CLOCK_CONSTRAINTS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Absolute Deadlines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ABSOLUTE_DEADLINES = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Relative Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RELATIVE_DEADLINE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Blockable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__BLOCKABLE = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENTS = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Urgent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__URGENT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Receiver Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RECEIVER_MESSAGE_TYPES = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sender Message Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SENDER_MESSAGE_TYPES = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = CorePackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ECLASS = CorePackage.COMMENTABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___EIS_PROXY = CorePackage.COMMENTABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ERESOURCE = CorePackage.COMMENTABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ECONTAINER = CorePackage.COMMENTABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ECONTAINING_FEATURE = CorePackage.COMMENTABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ECONTAINMENT_FEATURE = CorePackage.COMMENTABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ECONTENTS = CorePackage.COMMENTABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___EALL_CONTENTS = CorePackage.COMMENTABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ECROSS_REFERENCES = CorePackage.COMMENTABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___EGET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.COMMENTABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___EIS_SET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___EUNSET__ESTRUCTURALFEATURE = CorePackage.COMMENTABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___EINVOKE__EOPERATION_ELIST = CorePackage.COMMENTABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___GET_EXTENSION__ECLASS = CorePackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = CorePackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT__BOUND = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT__CLOCK = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT__OPERATOR = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT_FEATURE_COUNT = CorePackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT___ECLASS = CorePackage.EXTENDABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT___EIS_PROXY = CorePackage.EXTENDABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT___ERESOURCE = CorePackage.EXTENDABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT___ECONTAINER = CorePackage.EXTENDABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT___ECONTAINING_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT___ECONTAINMENT_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT___ECONTENTS = CorePackage.EXTENDABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT___EALL_CONTENTS = CorePackage.EXTENDABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT___ECROSS_REFERENCES = CorePackage.EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT___EGET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT___EUNSET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT___EINVOKE__EOPERATION_ELIST = CorePackage.EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

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
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

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
	 * The number of operations of the '<em>Transition Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>One To Many Communication Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA = TRANSITION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Asynchronous Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_MESSAGE_EVENT_FEATURE_COUNT = TRANSITION_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Asynchronous Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_MESSAGE_EVENT_OPERATION_COUNT = TRANSITION_EVENT_OPERATION_COUNT + 0;

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
	 * The number of operations of the '<em>State Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EVENT__PERIOD = STATE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Do Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EVENT_FEATURE_COUNT = STATE_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Do Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EVENT_OPERATION_COUNT = STATE_EVENT_OPERATION_COUNT + 0;

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
	 * The number of operations of the '<em>Entry Or Exit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OR_EXIT_EVENT_OPERATION_COUNT = STATE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Synchronization Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CHANNEL_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___ECLASS = CorePackage.EXTENDABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___EIS_PROXY = CorePackage.EXTENDABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___ERESOURCE = CorePackage.EXTENDABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___ECONTAINER = CorePackage.EXTENDABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___ECONTAINING_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___ECONTAINMENT_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___ECONTENTS = CorePackage.EXTENDABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___EALL_CONTENTS = CorePackage.EXTENDABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___ECROSS_REFERENCES = CorePackage.EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___EGET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___EIS_SET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___EUNSET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___EINVOKE__EOPERATION_ELIST = CorePackage.EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl <em>Realtime Statechart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getRealtimeStatechart()
	 * @generated
	 */
	int REALTIME_STATECHART = 15;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

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
	 * The feature id for the '<em><b>Flat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__FLAT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Available Clocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__AVAILABLE_CLOCKS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__EMBEDDED = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>All Available Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__ALL_AVAILABLE_VARIABLES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>All Available Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__ALL_AVAILABLE_OPERATIONS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Used Operation Repositories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__USED_OPERATION_REPOSITORIES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Uses One To Many Communication Schemata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__USES_ONE_TO_MANY_COMMUNICATION_SCHEMATA = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Sub Role Specific Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__SUB_ROLE_SPECIFIC_VARIABLES = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sub Role Specific Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__SUB_ROLE_SPECIFIC_CLOCKS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Sub Role Specific Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART__SUB_ROLE_SPECIFIC_OPERATIONS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Realtime Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___ECLASS = CorePackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___EIS_PROXY = CorePackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___ERESOURCE = CorePackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___ECONTAINER = CorePackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___ECONTAINING_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___ECONTAINMENT_FEATURE = CorePackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___ECONTENTS = CorePackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___EALL_CONTENTS = CorePackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___ECROSS_REFERENCES = CorePackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___EGET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___EIS_SET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___EUNSET__ESTRUCTURALFEATURE = CorePackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___EINVOKE__EOPERATION_ELIST = CorePackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Is Super Statechart Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___IS_SUPER_STATECHART_OF__REALTIMESTATECHART = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Highest Parent Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___GET_HIGHEST_PARENT_STATECHART = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Port Or Role Statechart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART___GET_PORT_OR_ROLE_STATECHART = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Realtime Statechart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.MessageImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 19;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__EXTENSIONS = CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___ECLASS = CorePackage.EXTENDABLE_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___EIS_PROXY = CorePackage.EXTENDABLE_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___ERESOURCE = CorePackage.EXTENDABLE_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___ECONTAINER = CorePackage.EXTENDABLE_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___ECONTAINING_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___ECONTAINMENT_FEATURE = CorePackage.EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___ECONTENTS = CorePackage.EXTENDABLE_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___EALL_CONTENTS = CorePackage.EXTENDABLE_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___ECROSS_REFERENCES = CorePackage.EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___EGET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CorePackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___ESET__ESTRUCTURALFEATURE_OBJECT = CorePackage.EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___EIS_SET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___EUNSET__ESTRUCTURALFEATURE = CorePackage.EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___EINVOKE__EOPERATION_ELIST = CorePackage.EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_EXTENSION__ECLASS = CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = CorePackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.EntryEventImpl <em>Entry Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.EntryEventImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryEvent()
	 * @generated
	 */
	int ENTRY_EVENT = 20;

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
	 * The number of operations of the '<em>Entry Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_EVENT_OPERATION_COUNT = ENTRY_OR_EXIT_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.ExitEventImpl <em>Exit Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.ExitEventImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getExitEvent()
	 * @generated
	 */
	int EXIT_EVENT = 21;

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
	 * The number of operations of the '<em>Exit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_EVENT_OPERATION_COUNT = ENTRY_OR_EXIT_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.StateConnectionPointImpl <em>State Connection Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.StateConnectionPointImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getStateConnectionPoint()
	 * @generated
	 */
	int STATE_CONNECTION_POINT = 22;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT__EXTENSIONS = VERTEX__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT__COMMENT = VERTEX__COMMENT;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___ECLASS = VERTEX___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___EIS_PROXY = VERTEX___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___ERESOURCE = VERTEX___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___ECONTAINER = VERTEX___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___ECONTAINING_FEATURE = VERTEX___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___ECONTAINMENT_FEATURE = VERTEX___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___ECONTENTS = VERTEX___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___EALL_CONTENTS = VERTEX___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___ECROSS_REFERENCES = VERTEX___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___EGET__ESTRUCTURALFEATURE = VERTEX___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = VERTEX___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___ESET__ESTRUCTURALFEATURE_OBJECT = VERTEX___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___EIS_SET__ESTRUCTURALFEATURE = VERTEX___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___EUNSET__ESTRUCTURALFEATURE = VERTEX___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___EINVOKE__EOPERATION_ELIST = VERTEX___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___GET_EXTENSION__ECLASS = VERTEX___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Is Super Vertex Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___IS_SUPER_VERTEX_OF__VERTEX = VERTEX___IS_SUPER_VERTEX_OF__VERTEX;

	/**
	 * The operation id for the '<em>Get Unique Transition Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___GET_UNIQUE_TRANSITION_PRIORITY__INT = VERTEX___GET_UNIQUE_TRANSITION_PRIORITY__INT;

	/**
	 * The operation id for the '<em>Has Outgoing Transition Of Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT___HAS_OUTGOING_TRANSITION_OF_PRIORITY__INT = VERTEX___HAS_OUTGOING_TRANSITION_OF_PRIORITY__INT;

	/**
	 * The number of operations of the '<em>State Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONNECTION_POINT_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.EntryPointImpl <em>Entry Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.EntryPointImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryPoint()
	 * @generated
	 */
	int ENTRY_POINT = 23;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__EXTENSIONS = STATE_CONNECTION_POINT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__NAME = STATE_CONNECTION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__COMMENT = STATE_CONNECTION_POINT__COMMENT;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___ECLASS = STATE_CONNECTION_POINT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___EIS_PROXY = STATE_CONNECTION_POINT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___ERESOURCE = STATE_CONNECTION_POINT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___ECONTAINER = STATE_CONNECTION_POINT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___ECONTAINING_FEATURE = STATE_CONNECTION_POINT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___ECONTAINMENT_FEATURE = STATE_CONNECTION_POINT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___ECONTENTS = STATE_CONNECTION_POINT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___EALL_CONTENTS = STATE_CONNECTION_POINT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___ECROSS_REFERENCES = STATE_CONNECTION_POINT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___EGET__ESTRUCTURALFEATURE = STATE_CONNECTION_POINT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = STATE_CONNECTION_POINT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___ESET__ESTRUCTURALFEATURE_OBJECT = STATE_CONNECTION_POINT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___EIS_SET__ESTRUCTURALFEATURE = STATE_CONNECTION_POINT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___EUNSET__ESTRUCTURALFEATURE = STATE_CONNECTION_POINT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___EINVOKE__EOPERATION_ELIST = STATE_CONNECTION_POINT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___GET_EXTENSION__ECLASS = STATE_CONNECTION_POINT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Is Super Vertex Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___IS_SUPER_VERTEX_OF__VERTEX = STATE_CONNECTION_POINT___IS_SUPER_VERTEX_OF__VERTEX;

	/**
	 * The operation id for the '<em>Get Unique Transition Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___GET_UNIQUE_TRANSITION_PRIORITY__INT = STATE_CONNECTION_POINT___GET_UNIQUE_TRANSITION_PRIORITY__INT;

	/**
	 * The operation id for the '<em>Has Outgoing Transition Of Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT___HAS_OUTGOING_TRANSITION_OF_PRIORITY__INT = STATE_CONNECTION_POINT___HAS_OUTGOING_TRANSITION_OF_PRIORITY__INT;

	/**
	 * The number of operations of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_OPERATION_COUNT = STATE_CONNECTION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.impl.ExitPointImpl <em>Exit Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.impl.ExitPointImpl
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getExitPoint()
	 * @generated
	 */
	int EXIT_POINT = 24;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__EXTENSIONS = STATE_CONNECTION_POINT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__NAME = STATE_CONNECTION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT__COMMENT = STATE_CONNECTION_POINT__COMMENT;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___ECLASS = STATE_CONNECTION_POINT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___EIS_PROXY = STATE_CONNECTION_POINT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___ERESOURCE = STATE_CONNECTION_POINT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___ECONTAINER = STATE_CONNECTION_POINT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___ECONTAINING_FEATURE = STATE_CONNECTION_POINT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___ECONTAINMENT_FEATURE = STATE_CONNECTION_POINT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___ECONTENTS = STATE_CONNECTION_POINT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___EALL_CONTENTS = STATE_CONNECTION_POINT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___ECROSS_REFERENCES = STATE_CONNECTION_POINT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___EGET__ESTRUCTURALFEATURE = STATE_CONNECTION_POINT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = STATE_CONNECTION_POINT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___ESET__ESTRUCTURALFEATURE_OBJECT = STATE_CONNECTION_POINT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___EIS_SET__ESTRUCTURALFEATURE = STATE_CONNECTION_POINT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___EUNSET__ESTRUCTURALFEATURE = STATE_CONNECTION_POINT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___EINVOKE__EOPERATION_ELIST = STATE_CONNECTION_POINT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___GET_EXTENSION__ECLASS = STATE_CONNECTION_POINT___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Is Super Vertex Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___IS_SUPER_VERTEX_OF__VERTEX = STATE_CONNECTION_POINT___IS_SUPER_VERTEX_OF__VERTEX;

	/**
	 * The operation id for the '<em>Get Unique Transition Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___GET_UNIQUE_TRANSITION_PRIORITY__INT = STATE_CONNECTION_POINT___GET_UNIQUE_TRANSITION_PRIORITY__INT;

	/**
	 * The operation id for the '<em>Has Outgoing Transition Of Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT___HAS_OUTGOING_TRANSITION_OF_PRIORITY__INT = STATE_CONNECTION_POINT___HAS_OUTGOING_TRANSITION_OF_PRIORITY__INT;

	/**
	 * The number of operations of the '<em>Exit Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_POINT_OPERATION_COUNT = STATE_CONNECTION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.SynchronizationKind <em>Synchronization Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.SynchronizationKind
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronizationKind()
	 * @generated
	 */
	int SYNCHRONIZATION_KIND = 25;

	/**
	 * The meta object id for the '{@link org.muml.pim.realtimestatechart.EventKind <em>Event Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pim.realtimestatechart.EventKind
	 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getEventKind()
	 * @generated
	 */
	int EVENT_KIND = 26;

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.Deadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadline</em>'.
	 * @see org.muml.pim.realtimestatechart.Deadline
	 * @generated
	 */
	EClass getDeadline();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.Deadline#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see org.muml.pim.realtimestatechart.Deadline#getUpperBound()
	 * @see #getDeadline()
	 * @generated
	 */
	EReference getDeadline_UpperBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.Deadline#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see org.muml.pim.realtimestatechart.Deadline#getLowerBound()
	 * @see #getDeadline()
	 * @generated
	 */
	EReference getDeadline_LowerBound();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.AbsoluteDeadline <em>Absolute Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Deadline</em>'.
	 * @see org.muml.pim.realtimestatechart.AbsoluteDeadline
	 * @generated
	 */
	EClass getAbsoluteDeadline();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.realtimestatechart.AbsoluteDeadline#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see org.muml.pim.realtimestatechart.AbsoluteDeadline#getClock()
	 * @see #getAbsoluteDeadline()
	 * @generated
	 */
	EReference getAbsoluteDeadline_Clock();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.RelativeDeadline <em>Relative Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Deadline</em>'.
	 * @see org.muml.pim.realtimestatechart.RelativeDeadline
	 * @generated
	 */
	EClass getRelativeDeadline();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see org.muml.pim.realtimestatechart.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.realtimestatechart.Clock#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statechart</em>'.
	 * @see org.muml.pim.realtimestatechart.Clock#getStatechart()
	 * @see #getClock()
	 * @generated
	 */
	EReference getClock_Statechart();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see org.muml.pim.realtimestatechart.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.Region#getEmbeddedStatechart <em>Embedded Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Embedded Statechart</em>'.
	 * @see org.muml.pim.realtimestatechart.Region#getEmbeddedStatechart()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_EmbeddedStatechart();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.realtimestatechart.Region#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent State</em>'.
	 * @see org.muml.pim.realtimestatechart.Region#getParentState()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_ParentState();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.realtimestatechart.Region#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.muml.pim.realtimestatechart.Region#getName()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Name();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.muml.pim.realtimestatechart.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.realtimestatechart.State#getEmbeddedRegions <em>Embedded Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Regions</em>'.
	 * @see org.muml.pim.realtimestatechart.State#getEmbeddedRegions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EmbeddedRegions();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.State#getDoEvent <em>Do Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do Event</em>'.
	 * @see org.muml.pim.realtimestatechart.State#getDoEvent()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DoEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.State#getExitEvent <em>Exit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit Event</em>'.
	 * @see org.muml.pim.realtimestatechart.State#getExitEvent()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ExitEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.State#getEntryEvent <em>Entry Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Event</em>'.
	 * @see org.muml.pim.realtimestatechart.State#getEntryEvent()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EntryEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.realtimestatechart.State#getInvariants <em>Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invariants</em>'.
	 * @see org.muml.pim.realtimestatechart.State#getInvariants()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Invariants();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.realtimestatechart.State#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see org.muml.pim.realtimestatechart.State#getChannels()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Channels();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.realtimestatechart.State#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see org.muml.pim.realtimestatechart.State#getEvents()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.realtimestatechart.State#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Points</em>'.
	 * @see org.muml.pim.realtimestatechart.State#getConnectionPoints()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ConnectionPoints();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.realtimestatechart.State#isSimple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple</em>'.
	 * @see org.muml.pim.realtimestatechart.State#isSimple()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Simple();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.realtimestatechart.State#getParentStatechart <em>Parent Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Statechart</em>'.
	 * @see org.muml.pim.realtimestatechart.State#getParentStatechart()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ParentStatechart();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.realtimestatechart.State#getAllAvailableChannels <em>All Available Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Available Channels</em>'.
	 * @see org.muml.pim.realtimestatechart.State#getAllAvailableChannels()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_AllAvailableChannels();

	/**
	 * Returns the meta object for the '{@link org.muml.pim.realtimestatechart.State#getUniqueRegionPriority(int) <em>Get Unique Region Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unique Region Priority</em>' operation.
	 * @see org.muml.pim.realtimestatechart.State#getUniqueRegionPriority(int)
	 * @generated
	 */
	EOperation getState__GetUniqueRegionPriority__int();

	/**
	 * Returns the meta object for the '{@link org.muml.pim.realtimestatechart.State#hasRegionOfPriority(int) <em>Has Region Of Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Region Of Priority</em>' operation.
	 * @see org.muml.pim.realtimestatechart.State#hasRegionOfPriority(int)
	 * @generated
	 */
	EOperation getState__HasRegionOfPriority__int();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.realtimestatechart.State#isInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see org.muml.pim.realtimestatechart.State#isInitial()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Initial();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.realtimestatechart.State#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.muml.pim.realtimestatechart.State#isFinal()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Final();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.realtimestatechart.State#isUrgent <em>Urgent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urgent</em>'.
	 * @see org.muml.pim.realtimestatechart.State#isUrgent()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Urgent();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see org.muml.pim.realtimestatechart.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.realtimestatechart.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see org.muml.pim.realtimestatechart.Vertex#getOutgoingTransitions()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_OutgoingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.realtimestatechart.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see org.muml.pim.realtimestatechart.Vertex#getIncomingTransitions()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_IncomingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.realtimestatechart.Vertex#getAllSuperVertices <em>All Super Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Super Vertices</em>'.
	 * @see org.muml.pim.realtimestatechart.Vertex#getAllSuperVertices()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_AllSuperVertices();

	/**
	 * Returns the meta object for the '{@link org.muml.pim.realtimestatechart.Vertex#isSuperVertexOf(org.muml.pim.realtimestatechart.Vertex) <em>Is Super Vertex Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Super Vertex Of</em>' operation.
	 * @see org.muml.pim.realtimestatechart.Vertex#isSuperVertexOf(org.muml.pim.realtimestatechart.Vertex)
	 * @generated
	 */
	EOperation getVertex__IsSuperVertexOf__Vertex();

	/**
	 * Returns the meta object for the '{@link org.muml.pim.realtimestatechart.Vertex#getUniqueTransitionPriority(int) <em>Get Unique Transition Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unique Transition Priority</em>' operation.
	 * @see org.muml.pim.realtimestatechart.Vertex#getUniqueTransitionPriority(int)
	 * @generated
	 */
	EOperation getVertex__GetUniqueTransitionPriority__int();

	/**
	 * Returns the meta object for the '{@link org.muml.pim.realtimestatechart.Vertex#hasOutgoingTransitionOfPriority(int) <em>Has Outgoing Transition Of Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Outgoing Transition Of Priority</em>' operation.
	 * @see org.muml.pim.realtimestatechart.Vertex#hasOutgoingTransitionOfPriority(int)
	 * @generated
	 */
	EOperation getVertex__HasOutgoingTransitionOfPriority__int();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.Transition#getSynchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synchronization</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition#getSynchronization()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Synchronization();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.realtimestatechart.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.realtimestatechart.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.realtimestatechart.Transition#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statechart</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition#getStatechart()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Statechart();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.realtimestatechart.Transition#getClockResets <em>Clock Resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clock Resets</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition#getClockResets()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ClockResets();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.realtimestatechart.Transition#getTriggerMessageEvent <em>Trigger Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger Message Event</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition#getTriggerMessageEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TriggerMessageEvent();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.realtimestatechart.Transition#getRaiseMessageEvent <em>Raise Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Raise Message Event</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition#getRaiseMessageEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_RaiseMessageEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.realtimestatechart.Transition#getClockConstraints <em>Clock Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clock Constraints</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition#getClockConstraints()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ClockConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.realtimestatechart.Transition#getAbsoluteDeadlines <em>Absolute Deadlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Absolute Deadlines</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition#getAbsoluteDeadlines()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_AbsoluteDeadlines();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.Transition#getRelativeDeadline <em>Relative Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relative Deadline</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition#getRelativeDeadline()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_RelativeDeadline();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.realtimestatechart.Transition#isBlockable <em>Blockable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blockable</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition#isBlockable()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Blockable();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.realtimestatechart.Transition#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition#getEvents()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Events();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition#getAction()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.realtimestatechart.Transition#isUrgent <em>Urgent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urgent</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition#isUrgent()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Urgent();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.realtimestatechart.Transition#getReceiverMessageTypes <em>Receiver Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receiver Message Types</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition#getReceiverMessageTypes()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ReceiverMessageTypes();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.realtimestatechart.Transition#getSenderMessageTypes <em>Sender Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sender Message Types</em>'.
	 * @see org.muml.pim.realtimestatechart.Transition#getSenderMessageTypes()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_SenderMessageTypes();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.ClockConstraint <em>Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Constraint</em>'.
	 * @see org.muml.pim.realtimestatechart.ClockConstraint
	 * @generated
	 */
	EClass getClockConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.ClockConstraint#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bound</em>'.
	 * @see org.muml.pim.realtimestatechart.ClockConstraint#getBound()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EReference getClockConstraint_Bound();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.realtimestatechart.ClockConstraint#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see org.muml.pim.realtimestatechart.ClockConstraint#getClock()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EReference getClockConstraint_Clock();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.realtimestatechart.ClockConstraint#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.muml.pim.realtimestatechart.ClockConstraint#getOperator()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EAttribute getClockConstraint_Operator();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.muml.pim.realtimestatechart.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.realtimestatechart.Action#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org.muml.pim.realtimestatechart.Action#getExpressions()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Expressions();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.AsynchronousMessageEvent <em>Asynchronous Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asynchronous Message Event</em>'.
	 * @see org.muml.pim.realtimestatechart.AsynchronousMessageEvent
	 * @generated
	 */
	EClass getAsynchronousMessageEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.AsynchronousMessageEvent#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see org.muml.pim.realtimestatechart.AsynchronousMessageEvent#getMessage()
	 * @see #getAsynchronousMessageEvent()
	 * @generated
	 */
	EReference getAsynchronousMessageEvent_Message();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.AsynchronousMessageEvent#getOneToManyCommunicationSchema <em>One To Many Communication Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>One To Many Communication Schema</em>'.
	 * @see org.muml.pim.realtimestatechart.AsynchronousMessageEvent#getOneToManyCommunicationSchema()
	 * @see #getAsynchronousMessageEvent()
	 * @generated
	 */
	EReference getAsynchronousMessageEvent_OneToManyCommunicationSchema();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.DoEvent <em>Do Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do Event</em>'.
	 * @see org.muml.pim.realtimestatechart.DoEvent
	 * @generated
	 */
	EClass getDoEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.DoEvent#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.muml.pim.realtimestatechart.DoEvent#getAction()
	 * @see #getDoEvent()
	 * @generated
	 */
	EReference getDoEvent_Action();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.DoEvent#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.muml.pim.realtimestatechart.DoEvent#getPeriod()
	 * @see #getDoEvent()
	 * @generated
	 */
	EReference getDoEvent_Period();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.EntryOrExitEvent <em>Entry Or Exit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Or Exit Event</em>'.
	 * @see org.muml.pim.realtimestatechart.EntryOrExitEvent
	 * @generated
	 */
	EClass getEntryOrExitEvent();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.realtimestatechart.EntryOrExitEvent#getClockResets <em>Clock Resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clock Resets</em>'.
	 * @see org.muml.pim.realtimestatechart.EntryOrExitEvent#getClockResets()
	 * @see #getEntryOrExitEvent()
	 * @generated
	 */
	EReference getEntryOrExitEvent_ClockResets();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.EntryOrExitEvent#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.muml.pim.realtimestatechart.EntryOrExitEvent#getAction()
	 * @see #getEntryOrExitEvent()
	 * @generated
	 */
	EReference getEntryOrExitEvent_Action();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.SynchronizationChannel <em>Synchronization Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization Channel</em>'.
	 * @see org.muml.pim.realtimestatechart.SynchronizationChannel
	 * @generated
	 */
	EClass getSynchronizationChannel();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.realtimestatechart.SynchronizationChannel#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State</em>'.
	 * @see org.muml.pim.realtimestatechart.SynchronizationChannel#getState()
	 * @see #getSynchronizationChannel()
	 * @generated
	 */
	EReference getSynchronizationChannel_State();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.realtimestatechart.SynchronizationChannel#getSelectorType <em>Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selector Type</em>'.
	 * @see org.muml.pim.realtimestatechart.SynchronizationChannel#getSelectorType()
	 * @see #getSynchronizationChannel()
	 * @generated
	 */
	EReference getSynchronizationChannel_SelectorType();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization</em>'.
	 * @see org.muml.pim.realtimestatechart.Synchronization
	 * @generated
	 */
	EClass getSynchronization();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.realtimestatechart.Synchronization#getSyncChannel <em>Sync Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sync Channel</em>'.
	 * @see org.muml.pim.realtimestatechart.Synchronization#getSyncChannel()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_SyncChannel();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.realtimestatechart.Synchronization#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.muml.pim.realtimestatechart.Synchronization#getKind()
	 * @see #getSynchronization()
	 * @generated
	 */
	EAttribute getSynchronization_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.pim.realtimestatechart.Synchronization#getSelectorExpression <em>Selector Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector Expression</em>'.
	 * @see org.muml.pim.realtimestatechart.Synchronization#getSelectorExpression()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_SelectorExpression();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.RealtimeStatechart <em>Realtime Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realtime Statechart</em>'.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart
	 * @generated
	 */
	EClass getRealtimeStatechart();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#getParentRegion <em>Parent Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Region</em>'.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#getParentRegion()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_ParentRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#getTransitions()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#getStates()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_States();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#getClocks <em>Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clocks</em>'.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#getClocks()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_Clocks();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#isFlat <em>Flat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flat</em>'.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#isFlat()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EAttribute getRealtimeStatechart_Flat();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#getAvailableClocks <em>Available Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Available Clocks</em>'.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#getAvailableClocks()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_AvailableClocks();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#isEmbedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embedded</em>'.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#isEmbedded()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EAttribute getRealtimeStatechart_Embedded();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#getAllAvailableVariables <em>All Available Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Available Variables</em>'.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#getAllAvailableVariables()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_AllAvailableVariables();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#getAllAvailableOperations <em>All Available Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Available Operations</em>'.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#getAllAvailableOperations()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_AllAvailableOperations();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#getUsedOperationRepositories <em>Used Operation Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Operation Repositories</em>'.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#getUsedOperationRepositories()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_UsedOperationRepositories();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#isUsesOneToManyCommunicationSchemata <em>Uses One To Many Communication Schemata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uses One To Many Communication Schemata</em>'.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#isUsesOneToManyCommunicationSchemata()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EAttribute getRealtimeStatechart_UsesOneToManyCommunicationSchemata();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#getSubRoleSpecificVariables <em>Sub Role Specific Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Role Specific Variables</em>'.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#getSubRoleSpecificVariables()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_SubRoleSpecificVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#getSubRoleSpecificClocks <em>Sub Role Specific Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Role Specific Clocks</em>'.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#getSubRoleSpecificClocks()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_SubRoleSpecificClocks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#getSubRoleSpecificOperations <em>Sub Role Specific Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Role Specific Operations</em>'.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#getSubRoleSpecificOperations()
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	EReference getRealtimeStatechart_SubRoleSpecificOperations();

	/**
	 * Returns the meta object for the '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#isSuperStatechartOf(org.muml.pim.realtimestatechart.RealtimeStatechart) <em>Is Super Statechart Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Super Statechart Of</em>' operation.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#isSuperStatechartOf(org.muml.pim.realtimestatechart.RealtimeStatechart)
	 * @generated
	 */
	EOperation getRealtimeStatechart__IsSuperStatechartOf__RealtimeStatechart();

	/**
	 * Returns the meta object for the '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#getHighestParentStatechart() <em>Get Highest Parent Statechart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Highest Parent Statechart</em>' operation.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#getHighestParentStatechart()
	 * @generated
	 */
	EOperation getRealtimeStatechart__GetHighestParentStatechart();

	/**
	 * Returns the meta object for the '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#getPortOrRoleStatechart() <em>Get Port Or Role Statechart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Port Or Role Statechart</em>' operation.
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#getPortOrRoleStatechart()
	 * @generated
	 */
	EOperation getRealtimeStatechart__GetPortOrRoleStatechart();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.muml.pim.realtimestatechart.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.pim.realtimestatechart.Event#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.muml.pim.realtimestatechart.Event#getKind()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Kind();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.TransitionEvent <em>Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Event</em>'.
	 * @see org.muml.pim.realtimestatechart.TransitionEvent
	 * @generated
	 */
	EClass getTransitionEvent();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.StateEvent <em>State Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Event</em>'.
	 * @see org.muml.pim.realtimestatechart.StateEvent
	 * @generated
	 */
	EClass getStateEvent();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.muml.pim.realtimestatechart.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference '{@link org.muml.pim.realtimestatechart.Message#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of</em>'.
	 * @see org.muml.pim.realtimestatechart.Message#getInstanceOf()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_InstanceOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.pim.realtimestatechart.Message#getParameterBinding <em>Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Binding</em>'.
	 * @see org.muml.pim.realtimestatechart.Message#getParameterBinding()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_ParameterBinding();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.EntryEvent <em>Entry Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Event</em>'.
	 * @see org.muml.pim.realtimestatechart.EntryEvent
	 * @generated
	 */
	EClass getEntryEvent();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.ExitEvent <em>Exit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Event</em>'.
	 * @see org.muml.pim.realtimestatechart.ExitEvent
	 * @generated
	 */
	EClass getExitEvent();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.StateConnectionPoint <em>State Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Connection Point</em>'.
	 * @see org.muml.pim.realtimestatechart.StateConnectionPoint
	 * @generated
	 */
	EClass getStateConnectionPoint();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.pim.realtimestatechart.StateConnectionPoint#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State</em>'.
	 * @see org.muml.pim.realtimestatechart.StateConnectionPoint#getState()
	 * @see #getStateConnectionPoint()
	 * @generated
	 */
	EReference getStateConnectionPoint_State();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.EntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point</em>'.
	 * @see org.muml.pim.realtimestatechart.EntryPoint
	 * @generated
	 */
	EClass getEntryPoint();

	/**
	 * Returns the meta object for class '{@link org.muml.pim.realtimestatechart.ExitPoint <em>Exit Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Point</em>'.
	 * @see org.muml.pim.realtimestatechart.ExitPoint
	 * @generated
	 */
	EClass getExitPoint();

	/**
	 * Returns the meta object for enum '{@link org.muml.pim.realtimestatechart.SynchronizationKind <em>Synchronization Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Synchronization Kind</em>'.
	 * @see org.muml.pim.realtimestatechart.SynchronizationKind
	 * @generated
	 */
	EEnum getSynchronizationKind();

	/**
	 * Returns the meta object for enum '{@link org.muml.pim.realtimestatechart.EventKind <em>Event Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Kind</em>'.
	 * @see org.muml.pim.realtimestatechart.EventKind
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
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.DeadlineImpl <em>Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.DeadlineImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getDeadline()
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
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.AbsoluteDeadlineImpl <em>Absolute Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.AbsoluteDeadlineImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getAbsoluteDeadline()
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
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.RelativeDeadlineImpl <em>Relative Deadline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.RelativeDeadlineImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getRelativeDeadline()
		 * @generated
		 */
		EClass RELATIVE_DEADLINE = eINSTANCE.getRelativeDeadline();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.ClockImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getClock()
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
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.RegionImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getRegion()
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__NAME = eINSTANCE.getRegion_Name();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.StateImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getState()
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
		 * The meta object literal for the '<em><b>All Available Channels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ALL_AVAILABLE_CHANNELS = eINSTANCE.getState_AllAvailableChannels();

		/**
		 * The meta object literal for the '<em><b>Get Unique Region Priority</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___GET_UNIQUE_REGION_PRIORITY__INT = eINSTANCE.getState__GetUniqueRegionPriority__int();

		/**
		 * The meta object literal for the '<em><b>Has Region Of Priority</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___HAS_REGION_OF_PRIORITY__INT = eINSTANCE.getState__HasRegionOfPriority__int();

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
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.VertexImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getVertex()
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
		 * The meta object literal for the '<em><b>Is Super Vertex Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERTEX___IS_SUPER_VERTEX_OF__VERTEX = eINSTANCE.getVertex__IsSuperVertexOf__Vertex();

		/**
		 * The meta object literal for the '<em><b>Get Unique Transition Priority</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERTEX___GET_UNIQUE_TRANSITION_PRIORITY__INT = eINSTANCE.getVertex__GetUniqueTransitionPriority__int();

		/**
		 * The meta object literal for the '<em><b>Has Outgoing Transition Of Priority</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERTEX___HAS_OUTGOING_TRANSITION_OF_PRIORITY__INT = eINSTANCE.getVertex__HasOutgoingTransitionOfPriority__int();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.TransitionImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getTransition()
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
		 * The meta object literal for the '<em><b>Statechart</b></em>' reference feature.
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
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.ClockConstraintImpl <em>Clock Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.ClockConstraintImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getClockConstraint()
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
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.ActionImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getAction()
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
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.AsynchronousMessageEventImpl <em>Asynchronous Message Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.AsynchronousMessageEventImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getAsynchronousMessageEvent()
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
		 * The meta object literal for the '<em><b>One To Many Communication Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA = eINSTANCE.getAsynchronousMessageEvent_OneToManyCommunicationSchema();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.DoEventImpl <em>Do Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.DoEventImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getDoEvent()
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
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_EVENT__PERIOD = eINSTANCE.getDoEvent_Period();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.EntryOrExitEventImpl <em>Entry Or Exit Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.EntryOrExitEventImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryOrExitEvent()
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
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.SynchronizationChannelImpl <em>Synchronization Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.SynchronizationChannelImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronizationChannel()
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
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.SynchronizationImpl <em>Synchronization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.SynchronizationImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronization()
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
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl <em>Realtime Statechart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getRealtimeStatechart()
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
		 * The meta object literal for the '<em><b>Used Operation Repositories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART__USED_OPERATION_REPOSITORIES = eINSTANCE.getRealtimeStatechart_UsedOperationRepositories();

		/**
		 * The meta object literal for the '<em><b>Uses One To Many Communication Schemata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALTIME_STATECHART__USES_ONE_TO_MANY_COMMUNICATION_SCHEMATA = eINSTANCE.getRealtimeStatechart_UsesOneToManyCommunicationSchemata();

		/**
		 * The meta object literal for the '<em><b>Sub Role Specific Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART__SUB_ROLE_SPECIFIC_VARIABLES = eINSTANCE.getRealtimeStatechart_SubRoleSpecificVariables();

		/**
		 * The meta object literal for the '<em><b>Sub Role Specific Clocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART__SUB_ROLE_SPECIFIC_CLOCKS = eINSTANCE.getRealtimeStatechart_SubRoleSpecificClocks();

		/**
		 * The meta object literal for the '<em><b>Sub Role Specific Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART__SUB_ROLE_SPECIFIC_OPERATIONS = eINSTANCE.getRealtimeStatechart_SubRoleSpecificOperations();

		/**
		 * The meta object literal for the '<em><b>Is Super Statechart Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REALTIME_STATECHART___IS_SUPER_STATECHART_OF__REALTIMESTATECHART = eINSTANCE.getRealtimeStatechart__IsSuperStatechartOf__RealtimeStatechart();

		/**
		 * The meta object literal for the '<em><b>Get Highest Parent Statechart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REALTIME_STATECHART___GET_HIGHEST_PARENT_STATECHART = eINSTANCE.getRealtimeStatechart__GetHighestParentStatechart();

		/**
		 * The meta object literal for the '<em><b>Get Port Or Role Statechart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REALTIME_STATECHART___GET_PORT_OR_ROLE_STATECHART = eINSTANCE.getRealtimeStatechart__GetPortOrRoleStatechart();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.EventImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getEvent()
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
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.TransitionEventImpl <em>Transition Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.TransitionEventImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getTransitionEvent()
		 * @generated
		 */
		EClass TRANSITION_EVENT = eINSTANCE.getTransitionEvent();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.StateEventImpl <em>State Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.StateEventImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getStateEvent()
		 * @generated
		 */
		EClass STATE_EVENT = eINSTANCE.getStateEvent();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.MessageImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getMessage()
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
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.EntryEventImpl <em>Entry Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.EntryEventImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryEvent()
		 * @generated
		 */
		EClass ENTRY_EVENT = eINSTANCE.getEntryEvent();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.ExitEventImpl <em>Exit Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.ExitEventImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getExitEvent()
		 * @generated
		 */
		EClass EXIT_EVENT = eINSTANCE.getExitEvent();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.StateConnectionPointImpl <em>State Connection Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.StateConnectionPointImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getStateConnectionPoint()
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
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.EntryPointImpl <em>Entry Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.EntryPointImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getEntryPoint()
		 * @generated
		 */
		EClass ENTRY_POINT = eINSTANCE.getEntryPoint();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.impl.ExitPointImpl <em>Exit Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.impl.ExitPointImpl
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getExitPoint()
		 * @generated
		 */
		EClass EXIT_POINT = eINSTANCE.getExitPoint();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.SynchronizationKind <em>Synchronization Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.SynchronizationKind
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getSynchronizationKind()
		 * @generated
		 */
		EEnum SYNCHRONIZATION_KIND = eINSTANCE.getSynchronizationKind();

		/**
		 * The meta object literal for the '{@link org.muml.pim.realtimestatechart.EventKind <em>Event Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.pim.realtimestatechart.EventKind
		 * @see org.muml.pim.realtimestatechart.impl.RealtimestatechartPackageImpl#getEventKind()
		 * @generated
		 */
		EEnum EVENT_KIND = eINSTANCE.getEventKind();

	}

} //RealtimestatechartPackage
