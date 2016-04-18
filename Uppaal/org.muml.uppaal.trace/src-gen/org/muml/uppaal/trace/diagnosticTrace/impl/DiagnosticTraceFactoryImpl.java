/**
 */
package org.muml.uppaal.trace.diagnosticTrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.muml.uppaal.trace.diagnosticTrace.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagnosticTraceFactoryImpl extends EFactoryImpl implements DiagnosticTraceFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DiagnosticTraceFactory init()
  {
    try
    {
      DiagnosticTraceFactory theDiagnosticTraceFactory = (DiagnosticTraceFactory)EPackage.Registry.INSTANCE.getEFactory(DiagnosticTracePackage.eNS_URI);
      if (theDiagnosticTraceFactory != null)
      {
        return theDiagnosticTraceFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DiagnosticTraceFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiagnosticTraceFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DiagnosticTracePackage.TRACE_REPOSITORY: return createTraceRepository();
      case DiagnosticTracePackage.TRACE: return createTrace();
      case DiagnosticTracePackage.PROCESS_IDENTIFIER: return createProcessIdentifier();
      case DiagnosticTracePackage.LOCATION_ACTIVITY: return createLocationActivity();
      case DiagnosticTracePackage.VARIABLE_VALUE: return createVariableValue();
      case DiagnosticTracePackage.SINGLE_NAMED_ELEMENT_REFERENCE: return createSingleNamedElementReference();
      case DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE: return createNamedElementReference();
      case DiagnosticTracePackage.TRACE_ITEM: return createTraceItem();
      case DiagnosticTracePackage.STATE: return createState();
      case DiagnosticTracePackage.EDGE_ACTIVITY: return createEdgeActivity();
      case DiagnosticTracePackage.SYNCHRONIZATION: return createSynchronization();
      case DiagnosticTracePackage.CHANNEL_SYNCHRONIZATION: return createChannelSynchronization();
      case DiagnosticTracePackage.DELAY_TRANSITION: return createDelayTransition();
      case DiagnosticTracePackage.ACTION_TRANSITION: return createActionTransition();
      case DiagnosticTracePackage.TRANSITION: return createTransition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DiagnosticTracePackage.RESULT:
        return createResultFromString(eDataType, initialValue);
      case DiagnosticTracePackage.COMPARE_OPERATOR:
        return createCompareOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DiagnosticTracePackage.RESULT:
        return convertResultToString(eDataType, instanceValue);
      case DiagnosticTracePackage.COMPARE_OPERATOR:
        return convertCompareOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraceRepository createTraceRepository()
  {
    TraceRepositoryImpl traceRepository = new TraceRepositoryImpl();
    return traceRepository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trace createTrace()
  {
    TraceImpl trace = new TraceImpl();
    return trace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessIdentifier createProcessIdentifier()
  {
    ProcessIdentifierImpl processIdentifier = new ProcessIdentifierImpl();
    return processIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationActivity createLocationActivity()
  {
    LocationActivityImpl locationActivity = new LocationActivityImpl();
    return locationActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableValue createVariableValue()
  {
    VariableValueImpl variableValue = new VariableValueImpl();
    return variableValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleNamedElementReference createSingleNamedElementReference()
  {
    SingleNamedElementReferenceImpl singleNamedElementReference = new SingleNamedElementReferenceImpl();
    return singleNamedElementReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElementReference createNamedElementReference()
  {
    NamedElementReferenceImpl namedElementReference = new NamedElementReferenceImpl();
    return namedElementReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraceItem createTraceItem()
  {
    TraceItemImpl traceItem = new TraceItemImpl();
    return traceItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EdgeActivity createEdgeActivity()
  {
    EdgeActivityImpl edgeActivity = new EdgeActivityImpl();
    return edgeActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Synchronization createSynchronization()
  {
    SynchronizationImpl synchronization = new SynchronizationImpl();
    return synchronization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChannelSynchronization createChannelSynchronization()
  {
    ChannelSynchronizationImpl channelSynchronization = new ChannelSynchronizationImpl();
    return channelSynchronization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DelayTransition createDelayTransition()
  {
    DelayTransitionImpl delayTransition = new DelayTransitionImpl();
    return delayTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionTransition createActionTransition()
  {
    ActionTransitionImpl actionTransition = new ActionTransitionImpl();
    return actionTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Result createResultFromString(EDataType eDataType, String initialValue)
  {
    Result result = Result.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertResultToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompareOperator createCompareOperatorFromString(EDataType eDataType, String initialValue)
  {
    CompareOperator result = CompareOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCompareOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiagnosticTracePackage getDiagnosticTracePackage()
  {
    return (DiagnosticTracePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DiagnosticTracePackage getPackage()
  {
    return DiagnosticTracePackage.eINSTANCE;
  }

} //DiagnosticTraceFactoryImpl
