/**
 */
package org.muml.uppaal.trace.diagnostictrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.uppaal.trace.diagnostictrace.ActionTransition;
import org.muml.uppaal.trace.diagnostictrace.ChannelSynchronization;
import org.muml.uppaal.trace.diagnostictrace.CompareOperator;
import org.muml.uppaal.trace.diagnostictrace.DelayTransition;
import org.muml.uppaal.trace.diagnostictrace.DiagnostictraceFactory;
import org.muml.uppaal.trace.diagnostictrace.DiagnostictracePackage;
import org.muml.uppaal.trace.diagnostictrace.EdgeActivity;
import org.muml.uppaal.trace.diagnostictrace.LocationActivity;
import org.muml.uppaal.trace.diagnostictrace.NamedElementReference;
import org.muml.uppaal.trace.diagnostictrace.ProcessIdentifier;
import org.muml.uppaal.trace.diagnostictrace.Result;
import org.muml.uppaal.trace.diagnostictrace.SingleNamedElementReference;
import org.muml.uppaal.trace.diagnostictrace.State;
import org.muml.uppaal.trace.diagnostictrace.Synchronization;
import org.muml.uppaal.trace.diagnostictrace.Trace;
import org.muml.uppaal.trace.diagnostictrace.TraceItem;
import org.muml.uppaal.trace.diagnostictrace.TraceRepository;
import org.muml.uppaal.trace.diagnostictrace.Transition;
import org.muml.uppaal.trace.diagnostictrace.VariableValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagnostictraceFactoryImpl extends EFactoryImpl implements DiagnostictraceFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static DiagnostictraceFactory init()
  {
		try {
			DiagnostictraceFactory theDiagnostictraceFactory = (DiagnostictraceFactory)EPackage.Registry.INSTANCE.getEFactory(DiagnostictracePackage.eNS_URI);
			if (theDiagnostictraceFactory != null) {
				return theDiagnostictraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiagnostictraceFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DiagnostictraceFactoryImpl()
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
		switch (eClass.getClassifierID()) {
			case DiagnostictracePackage.TRACE_REPOSITORY: return createTraceRepository();
			case DiagnostictracePackage.TRACE: return createTrace();
			case DiagnostictracePackage.PROCESS_IDENTIFIER: return createProcessIdentifier();
			case DiagnostictracePackage.LOCATION_ACTIVITY: return createLocationActivity();
			case DiagnostictracePackage.VARIABLE_VALUE: return createVariableValue();
			case DiagnostictracePackage.SINGLE_NAMED_ELEMENT_REFERENCE: return createSingleNamedElementReference();
			case DiagnostictracePackage.NAMED_ELEMENT_REFERENCE: return createNamedElementReference();
			case DiagnostictracePackage.TRACE_ITEM: return createTraceItem();
			case DiagnostictracePackage.STATE: return createState();
			case DiagnostictracePackage.EDGE_ACTIVITY: return createEdgeActivity();
			case DiagnostictracePackage.SYNCHRONIZATION: return createSynchronization();
			case DiagnostictracePackage.CHANNEL_SYNCHRONIZATION: return createChannelSynchronization();
			case DiagnostictracePackage.DELAY_TRANSITION: return createDelayTransition();
			case DiagnostictracePackage.ACTION_TRANSITION: return createActionTransition();
			case DiagnostictracePackage.TRANSITION: return createTransition();
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
		switch (eDataType.getClassifierID()) {
			case DiagnostictracePackage.RESULT:
				return createResultFromString(eDataType, initialValue);
			case DiagnostictracePackage.COMPARE_OPERATOR:
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
		switch (eDataType.getClassifierID()) {
			case DiagnostictracePackage.RESULT:
				return convertResultToString(eDataType, instanceValue);
			case DiagnostictracePackage.COMPARE_OPERATOR:
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
  public DiagnostictracePackage getDiagnostictracePackage()
  {
		return (DiagnostictracePackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static DiagnostictracePackage getPackage()
  {
		return DiagnostictracePackage.eINSTANCE;
	}

} //DiagnostictraceFactoryImpl
