/**
 */
package org.muml.uppaal.trace.diagnosticTrace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.muml.uppaal.trace.diagnosticTrace.DiagnosticTraceFactory
 * @model kind="package"
 * @generated
 */
public interface DiagnosticTracePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "diagnosticTrace";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.muml.org/uppaal/trace/1.0.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "diagnosticTrace";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DiagnosticTracePackage eINSTANCE = org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl.init();

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.TraceRepositoryImpl <em>Trace Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.TraceRepositoryImpl
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getTraceRepository()
   * @generated
   */
  int TRACE_REPOSITORY = 0;

  /**
   * The feature id for the '<em><b>Traces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_REPOSITORY__TRACES = 0;

  /**
   * The number of structural features of the '<em>Trace Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_REPOSITORY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.TraceImpl <em>Trace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.TraceImpl
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getTrace()
   * @generated
   */
  int TRACE = 1;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE__PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE__LINE = 1;

  /**
   * The feature id for the '<em><b>Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE__RESULT = 2;

  /**
   * The feature id for the '<em><b>Trace Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE__TRACE_ITEMS = 3;

  /**
   * The number of structural features of the '<em>Trace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.ProcessIdentifierImpl <em>Process Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.ProcessIdentifierImpl
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getProcessIdentifier()
   * @generated
   */
  int PROCESS_IDENTIFIER = 2;

  /**
   * The feature id for the '<em><b>Template</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_IDENTIFIER__TEMPLATE = 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_IDENTIFIER__ARGUMENTS = 1;

  /**
   * The number of structural features of the '<em>Process Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_IDENTIFIER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.LocationActivityImpl <em>Location Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.LocationActivityImpl
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getLocationActivity()
   * @generated
   */
  int LOCATION_ACTIVITY = 3;

  /**
   * The feature id for the '<em><b>Process</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_ACTIVITY__PROCESS = 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_ACTIVITY__LOCATION = 1;

  /**
   * The number of structural features of the '<em>Location Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_ACTIVITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.VariableValueImpl <em>Variable Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.VariableValueImpl
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getVariableValue()
   * @generated
   */
  int VARIABLE_VALUE = 4;

  /**
   * The feature id for the '<em><b>First Named Element Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Second Named Element Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE = 1;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VALUE__OPERATOR = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VALUE__VALUE = 3;

  /**
   * The number of structural features of the '<em>Variable Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VALUE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.SingleNamedElementReferenceImpl <em>Single Named Element Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.SingleNamedElementReferenceImpl
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getSingleNamedElementReference()
   * @generated
   */
  int SINGLE_NAMED_ELEMENT_REFERENCE = 5;

  /**
   * The feature id for the '<em><b>Named Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Indexes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_NAMED_ELEMENT_REFERENCE__INDEXES = 1;

  /**
   * The number of structural features of the '<em>Single Named Element Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_NAMED_ELEMENT_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.NamedElementReferenceImpl <em>Named Element Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.NamedElementReferenceImpl
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getNamedElementReference()
   * @generated
   */
  int NAMED_ELEMENT_REFERENCE = 6;

  /**
   * The feature id for the '<em><b>Single Named Element Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Named Element Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE = 1;

  /**
   * The number of structural features of the '<em>Named Element Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.TraceItemImpl <em>Trace Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.TraceItemImpl
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getTraceItem()
   * @generated
   */
  int TRACE_ITEM = 7;

  /**
   * The number of structural features of the '<em>Trace Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACE_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.StateImpl
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getState()
   * @generated
   */
  int STATE = 8;

  /**
   * The feature id for the '<em><b>Location Activities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__LOCATION_ACTIVITIES = TRACE_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__VARIABLE_VALUES = TRACE_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = TRACE_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.EdgeActivityImpl <em>Edge Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.EdgeActivityImpl
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getEdgeActivity()
   * @generated
   */
  int EDGE_ACTIVITY = 9;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ACTIVITY__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ACTIVITY__TARGET = 1;

  /**
   * The feature id for the '<em><b>Details</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ACTIVITY__DETAILS = 2;

  /**
   * The number of structural features of the '<em>Edge Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ACTIVITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.SynchronizationImpl <em>Synchronization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.SynchronizationImpl
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getSynchronization()
   * @generated
   */
  int SYNCHRONIZATION = 10;

  /**
   * The number of structural features of the '<em>Synchronization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.ChannelSynchronizationImpl <em>Channel Synchronization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.ChannelSynchronizationImpl
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getChannelSynchronization()
   * @generated
   */
  int CHANNEL_SYNCHRONIZATION = 11;

  /**
   * The feature id for the '<em><b>Channel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_SYNCHRONIZATION__CHANNEL = SYNCHRONIZATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_SYNCHRONIZATION__KIND = SYNCHRONIZATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Channel Synchronization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_SYNCHRONIZATION_FEATURE_COUNT = SYNCHRONIZATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.TransitionImpl
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 14;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = TRACE_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.DelayTransitionImpl <em>Delay Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DelayTransitionImpl
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getDelayTransition()
   * @generated
   */
  int DELAY_TRANSITION = 12;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_TRANSITION__DURATION = TRANSITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Delay Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELAY_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.ActionTransitionImpl <em>Action Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.ActionTransitionImpl
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getActionTransition()
   * @generated
   */
  int ACTION_TRANSITION = 13;

  /**
   * The feature id for the '<em><b>Edge Activities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TRANSITION__EDGE_ACTIVITIES = TRANSITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.diagnosticTrace.Result <em>Result</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.diagnosticTrace.Result
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getResult()
   * @generated
   */
  int RESULT = 15;

  /**
   * The meta object id for the '{@link org.muml.uppaal.trace.diagnosticTrace.CompareOperator <em>Compare Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.muml.uppaal.trace.diagnosticTrace.CompareOperator
   * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getCompareOperator()
   * @generated
   */
  int COMPARE_OPERATOR = 16;


  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.diagnosticTrace.TraceRepository <em>Trace Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trace Repository</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.TraceRepository
   * @generated
   */
  EClass getTraceRepository();

  /**
   * Returns the meta object for the containment reference list '{@link org.muml.uppaal.trace.diagnosticTrace.TraceRepository#getTraces <em>Traces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Traces</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.TraceRepository#getTraces()
   * @see #getTraceRepository()
   * @generated
   */
  EReference getTraceRepository_Traces();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.diagnosticTrace.Trace <em>Trace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trace</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.Trace
   * @generated
   */
  EClass getTrace();

  /**
   * Returns the meta object for the attribute '{@link org.muml.uppaal.trace.diagnosticTrace.Trace#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.Trace#getProperty()
   * @see #getTrace()
   * @generated
   */
  EAttribute getTrace_Property();

  /**
   * Returns the meta object for the attribute '{@link org.muml.uppaal.trace.diagnosticTrace.Trace#getLine <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.Trace#getLine()
   * @see #getTrace()
   * @generated
   */
  EAttribute getTrace_Line();

  /**
   * Returns the meta object for the attribute '{@link org.muml.uppaal.trace.diagnosticTrace.Trace#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Result</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.Trace#getResult()
   * @see #getTrace()
   * @generated
   */
  EAttribute getTrace_Result();

  /**
   * Returns the meta object for the containment reference list '{@link org.muml.uppaal.trace.diagnosticTrace.Trace#getTraceItems <em>Trace Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trace Items</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.Trace#getTraceItems()
   * @see #getTrace()
   * @generated
   */
  EReference getTrace_TraceItems();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.diagnosticTrace.ProcessIdentifier <em>Process Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Identifier</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.ProcessIdentifier
   * @generated
   */
  EClass getProcessIdentifier();

  /**
   * Returns the meta object for the reference '{@link org.muml.uppaal.trace.diagnosticTrace.ProcessIdentifier#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Template</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.ProcessIdentifier#getTemplate()
   * @see #getProcessIdentifier()
   * @generated
   */
  EReference getProcessIdentifier_Template();

  /**
   * Returns the meta object for the attribute list '{@link org.muml.uppaal.trace.diagnosticTrace.ProcessIdentifier#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Arguments</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.ProcessIdentifier#getArguments()
   * @see #getProcessIdentifier()
   * @generated
   */
  EAttribute getProcessIdentifier_Arguments();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.diagnosticTrace.LocationActivity <em>Location Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location Activity</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.LocationActivity
   * @generated
   */
  EClass getLocationActivity();

  /**
   * Returns the meta object for the containment reference '{@link org.muml.uppaal.trace.diagnosticTrace.LocationActivity#getProcess <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Process</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.LocationActivity#getProcess()
   * @see #getLocationActivity()
   * @generated
   */
  EReference getLocationActivity_Process();

  /**
   * Returns the meta object for the reference '{@link org.muml.uppaal.trace.diagnosticTrace.LocationActivity#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Location</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.LocationActivity#getLocation()
   * @see #getLocationActivity()
   * @generated
   */
  EReference getLocationActivity_Location();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.diagnosticTrace.VariableValue <em>Variable Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Value</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.VariableValue
   * @generated
   */
  EClass getVariableValue();

  /**
   * Returns the meta object for the containment reference '{@link org.muml.uppaal.trace.diagnosticTrace.VariableValue#getFirstNamedElementReference <em>First Named Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First Named Element Reference</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.VariableValue#getFirstNamedElementReference()
   * @see #getVariableValue()
   * @generated
   */
  EReference getVariableValue_FirstNamedElementReference();

  /**
   * Returns the meta object for the containment reference '{@link org.muml.uppaal.trace.diagnosticTrace.VariableValue#getSecondNamedElementReference <em>Second Named Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second Named Element Reference</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.VariableValue#getSecondNamedElementReference()
   * @see #getVariableValue()
   * @generated
   */
  EReference getVariableValue_SecondNamedElementReference();

  /**
   * Returns the meta object for the attribute '{@link org.muml.uppaal.trace.diagnosticTrace.VariableValue#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.VariableValue#getOperator()
   * @see #getVariableValue()
   * @generated
   */
  EAttribute getVariableValue_Operator();

  /**
   * Returns the meta object for the attribute '{@link org.muml.uppaal.trace.diagnosticTrace.VariableValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.VariableValue#getValue()
   * @see #getVariableValue()
   * @generated
   */
  EAttribute getVariableValue_Value();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.diagnosticTrace.SingleNamedElementReference <em>Single Named Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Named Element Reference</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.SingleNamedElementReference
   * @generated
   */
  EClass getSingleNamedElementReference();

  /**
   * Returns the meta object for the reference '{@link org.muml.uppaal.trace.diagnosticTrace.SingleNamedElementReference#getNamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Named Element</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.SingleNamedElementReference#getNamedElement()
   * @see #getSingleNamedElementReference()
   * @generated
   */
  EReference getSingleNamedElementReference_NamedElement();

  /**
   * Returns the meta object for the attribute list '{@link org.muml.uppaal.trace.diagnosticTrace.SingleNamedElementReference#getIndexes <em>Indexes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Indexes</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.SingleNamedElementReference#getIndexes()
   * @see #getSingleNamedElementReference()
   * @generated
   */
  EAttribute getSingleNamedElementReference_Indexes();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.diagnosticTrace.NamedElementReference <em>Named Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element Reference</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.NamedElementReference
   * @generated
   */
  EClass getNamedElementReference();

  /**
   * Returns the meta object for the containment reference '{@link org.muml.uppaal.trace.diagnosticTrace.NamedElementReference#getSingleNamedElementReference <em>Single Named Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Single Named Element Reference</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.NamedElementReference#getSingleNamedElementReference()
   * @see #getNamedElementReference()
   * @generated
   */
  EReference getNamedElementReference_SingleNamedElementReference();

  /**
   * Returns the meta object for the containment reference '{@link org.muml.uppaal.trace.diagnosticTrace.NamedElementReference#getNamedElementReference <em>Named Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Named Element Reference</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.NamedElementReference#getNamedElementReference()
   * @see #getNamedElementReference()
   * @generated
   */
  EReference getNamedElementReference_NamedElementReference();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.diagnosticTrace.TraceItem <em>Trace Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trace Item</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.TraceItem
   * @generated
   */
  EClass getTraceItem();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.diagnosticTrace.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the containment reference list '{@link org.muml.uppaal.trace.diagnosticTrace.State#getLocationActivities <em>Location Activities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Location Activities</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.State#getLocationActivities()
   * @see #getState()
   * @generated
   */
  EReference getState_LocationActivities();

  /**
   * Returns the meta object for the containment reference list '{@link org.muml.uppaal.trace.diagnosticTrace.State#getVariableValues <em>Variable Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable Values</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.State#getVariableValues()
   * @see #getState()
   * @generated
   */
  EReference getState_VariableValues();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.diagnosticTrace.EdgeActivity <em>Edge Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge Activity</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.EdgeActivity
   * @generated
   */
  EClass getEdgeActivity();

  /**
   * Returns the meta object for the containment reference '{@link org.muml.uppaal.trace.diagnosticTrace.EdgeActivity#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.EdgeActivity#getSource()
   * @see #getEdgeActivity()
   * @generated
   */
  EReference getEdgeActivity_Source();

  /**
   * Returns the meta object for the containment reference '{@link org.muml.uppaal.trace.diagnosticTrace.EdgeActivity#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.EdgeActivity#getTarget()
   * @see #getEdgeActivity()
   * @generated
   */
  EReference getEdgeActivity_Target();

  /**
   * Returns the meta object for the attribute '{@link org.muml.uppaal.trace.diagnosticTrace.EdgeActivity#getDetails <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Details</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.EdgeActivity#getDetails()
   * @see #getEdgeActivity()
   * @generated
   */
  EAttribute getEdgeActivity_Details();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.diagnosticTrace.Synchronization <em>Synchronization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Synchronization</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.Synchronization
   * @generated
   */
  EClass getSynchronization();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.diagnosticTrace.ChannelSynchronization <em>Channel Synchronization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Channel Synchronization</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.ChannelSynchronization
   * @generated
   */
  EClass getChannelSynchronization();

  /**
   * Returns the meta object for the reference '{@link org.muml.uppaal.trace.diagnosticTrace.ChannelSynchronization#getChannel <em>Channel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Channel</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.ChannelSynchronization#getChannel()
   * @see #getChannelSynchronization()
   * @generated
   */
  EReference getChannelSynchronization_Channel();

  /**
   * Returns the meta object for the attribute '{@link org.muml.uppaal.trace.diagnosticTrace.ChannelSynchronization#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.ChannelSynchronization#getKind()
   * @see #getChannelSynchronization()
   * @generated
   */
  EAttribute getChannelSynchronization_Kind();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.diagnosticTrace.DelayTransition <em>Delay Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delay Transition</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.DelayTransition
   * @generated
   */
  EClass getDelayTransition();

  /**
   * Returns the meta object for the attribute '{@link org.muml.uppaal.trace.diagnosticTrace.DelayTransition#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.DelayTransition#getDuration()
   * @see #getDelayTransition()
   * @generated
   */
  EAttribute getDelayTransition_Duration();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.diagnosticTrace.ActionTransition <em>Action Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Transition</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.ActionTransition
   * @generated
   */
  EClass getActionTransition();

  /**
   * Returns the meta object for the containment reference list '{@link org.muml.uppaal.trace.diagnosticTrace.ActionTransition#getEdgeActivities <em>Edge Activities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edge Activities</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.ActionTransition#getEdgeActivities()
   * @see #getActionTransition()
   * @generated
   */
  EReference getActionTransition_EdgeActivities();

  /**
   * Returns the meta object for class '{@link org.muml.uppaal.trace.diagnosticTrace.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for enum '{@link org.muml.uppaal.trace.diagnosticTrace.Result <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Result</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.Result
   * @generated
   */
  EEnum getResult();

  /**
   * Returns the meta object for enum '{@link org.muml.uppaal.trace.diagnosticTrace.CompareOperator <em>Compare Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Compare Operator</em>'.
   * @see org.muml.uppaal.trace.diagnosticTrace.CompareOperator
   * @generated
   */
  EEnum getCompareOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DiagnosticTraceFactory getDiagnosticTraceFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.TraceRepositoryImpl <em>Trace Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.TraceRepositoryImpl
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getTraceRepository()
     * @generated
     */
    EClass TRACE_REPOSITORY = eINSTANCE.getTraceRepository();

    /**
     * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACE_REPOSITORY__TRACES = eINSTANCE.getTraceRepository_Traces();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.TraceImpl <em>Trace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.TraceImpl
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getTrace()
     * @generated
     */
    EClass TRACE = eINSTANCE.getTrace();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRACE__PROPERTY = eINSTANCE.getTrace_Property();

    /**
     * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRACE__LINE = eINSTANCE.getTrace_Line();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRACE__RESULT = eINSTANCE.getTrace_Result();

    /**
     * The meta object literal for the '<em><b>Trace Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACE__TRACE_ITEMS = eINSTANCE.getTrace_TraceItems();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.ProcessIdentifierImpl <em>Process Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.ProcessIdentifierImpl
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getProcessIdentifier()
     * @generated
     */
    EClass PROCESS_IDENTIFIER = eINSTANCE.getProcessIdentifier();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_IDENTIFIER__TEMPLATE = eINSTANCE.getProcessIdentifier_Template();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS_IDENTIFIER__ARGUMENTS = eINSTANCE.getProcessIdentifier_Arguments();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.LocationActivityImpl <em>Location Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.LocationActivityImpl
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getLocationActivity()
     * @generated
     */
    EClass LOCATION_ACTIVITY = eINSTANCE.getLocationActivity();

    /**
     * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCATION_ACTIVITY__PROCESS = eINSTANCE.getLocationActivity_Process();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCATION_ACTIVITY__LOCATION = eINSTANCE.getLocationActivity_Location();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.VariableValueImpl <em>Variable Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.VariableValueImpl
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getVariableValue()
     * @generated
     */
    EClass VARIABLE_VALUE = eINSTANCE.getVariableValue();

    /**
     * The meta object literal for the '<em><b>First Named Element Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE = eINSTANCE.getVariableValue_FirstNamedElementReference();

    /**
     * The meta object literal for the '<em><b>Second Named Element Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE = eINSTANCE.getVariableValue_SecondNamedElementReference();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_VALUE__OPERATOR = eINSTANCE.getVariableValue_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_VALUE__VALUE = eINSTANCE.getVariableValue_Value();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.SingleNamedElementReferenceImpl <em>Single Named Element Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.SingleNamedElementReferenceImpl
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getSingleNamedElementReference()
     * @generated
     */
    EClass SINGLE_NAMED_ELEMENT_REFERENCE = eINSTANCE.getSingleNamedElementReference();

    /**
     * The meta object literal for the '<em><b>Named Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT = eINSTANCE.getSingleNamedElementReference_NamedElement();

    /**
     * The meta object literal for the '<em><b>Indexes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINGLE_NAMED_ELEMENT_REFERENCE__INDEXES = eINSTANCE.getSingleNamedElementReference_Indexes();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.NamedElementReferenceImpl <em>Named Element Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.NamedElementReferenceImpl
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getNamedElementReference()
     * @generated
     */
    EClass NAMED_ELEMENT_REFERENCE = eINSTANCE.getNamedElementReference();

    /**
     * The meta object literal for the '<em><b>Single Named Element Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_ELEMENT_REFERENCE__SINGLE_NAMED_ELEMENT_REFERENCE = eINSTANCE.getNamedElementReference_SingleNamedElementReference();

    /**
     * The meta object literal for the '<em><b>Named Element Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_ELEMENT_REFERENCE__NAMED_ELEMENT_REFERENCE = eINSTANCE.getNamedElementReference_NamedElementReference();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.TraceItemImpl <em>Trace Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.TraceItemImpl
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getTraceItem()
     * @generated
     */
    EClass TRACE_ITEM = eINSTANCE.getTraceItem();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.StateImpl
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Location Activities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__LOCATION_ACTIVITIES = eINSTANCE.getState_LocationActivities();

    /**
     * The meta object literal for the '<em><b>Variable Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__VARIABLE_VALUES = eINSTANCE.getState_VariableValues();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.EdgeActivityImpl <em>Edge Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.EdgeActivityImpl
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getEdgeActivity()
     * @generated
     */
    EClass EDGE_ACTIVITY = eINSTANCE.getEdgeActivity();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_ACTIVITY__SOURCE = eINSTANCE.getEdgeActivity_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_ACTIVITY__TARGET = eINSTANCE.getEdgeActivity_Target();

    /**
     * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_ACTIVITY__DETAILS = eINSTANCE.getEdgeActivity_Details();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.SynchronizationImpl <em>Synchronization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.SynchronizationImpl
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getSynchronization()
     * @generated
     */
    EClass SYNCHRONIZATION = eINSTANCE.getSynchronization();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.ChannelSynchronizationImpl <em>Channel Synchronization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.ChannelSynchronizationImpl
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getChannelSynchronization()
     * @generated
     */
    EClass CHANNEL_SYNCHRONIZATION = eINSTANCE.getChannelSynchronization();

    /**
     * The meta object literal for the '<em><b>Channel</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANNEL_SYNCHRONIZATION__CHANNEL = eINSTANCE.getChannelSynchronization_Channel();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHANNEL_SYNCHRONIZATION__KIND = eINSTANCE.getChannelSynchronization_Kind();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.DelayTransitionImpl <em>Delay Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DelayTransitionImpl
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getDelayTransition()
     * @generated
     */
    EClass DELAY_TRANSITION = eINSTANCE.getDelayTransition();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELAY_TRANSITION__DURATION = eINSTANCE.getDelayTransition_Duration();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.ActionTransitionImpl <em>Action Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.ActionTransitionImpl
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getActionTransition()
     * @generated
     */
    EClass ACTION_TRANSITION = eINSTANCE.getActionTransition();

    /**
     * The meta object literal for the '<em><b>Edge Activities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_TRANSITION__EDGE_ACTIVITIES = eINSTANCE.getActionTransition_EdgeActivities();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.diagnosticTrace.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.TransitionImpl
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.diagnosticTrace.Result <em>Result</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.diagnosticTrace.Result
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getResult()
     * @generated
     */
    EEnum RESULT = eINSTANCE.getResult();

    /**
     * The meta object literal for the '{@link org.muml.uppaal.trace.diagnosticTrace.CompareOperator <em>Compare Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.muml.uppaal.trace.diagnosticTrace.CompareOperator
     * @see org.muml.uppaal.trace.diagnosticTrace.impl.DiagnosticTracePackageImpl#getCompareOperator()
     * @generated
     */
    EEnum COMPARE_OPERATOR = eINSTANCE.getCompareOperator();

  }

} //DiagnosticTracePackage
