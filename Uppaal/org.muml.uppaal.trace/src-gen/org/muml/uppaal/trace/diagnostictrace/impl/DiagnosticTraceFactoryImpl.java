/**
 */
package org.muml.uppaal.trace.diagnosticTrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.uppaal.trace.diagnosticTrace.ActionTransition;
import org.muml.uppaal.trace.diagnosticTrace.ChannelSynchronization;
import org.muml.uppaal.trace.diagnosticTrace.CompareOperator;
import org.muml.uppaal.trace.diagnosticTrace.DelayTransition;
import org.muml.uppaal.trace.diagnosticTrace.DiagnosticTraceFactory;
import org.muml.uppaal.trace.diagnosticTrace.DiagnosticTracePackage;
import org.muml.uppaal.trace.diagnosticTrace.EdgeActivity;
import org.muml.uppaal.trace.diagnosticTrace.LocationActivity;
import org.muml.uppaal.trace.diagnosticTrace.NamedElementReference;
import org.muml.uppaal.trace.diagnosticTrace.ProcessIdentifier;
import org.muml.uppaal.trace.diagnosticTrace.Result;
import org.muml.uppaal.trace.diagnosticTrace.SingleNamedElementReference;
import org.muml.uppaal.trace.diagnosticTrace.State;
import org.muml.uppaal.trace.diagnosticTrace.Synchronization;
import org.muml.uppaal.trace.diagnosticTrace.Trace;
import org.muml.uppaal.trace.diagnosticTrace.TraceItem;
import org.muml.uppaal.trace.diagnosticTrace.TraceRepository;
import org.muml.uppaal.trace.diagnosticTrace.Transition;
import org.muml.uppaal.trace.diagnosticTrace.VariableValue;
import org.muml.uppaal.trace.diagnostictrace.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagnosticTraceFactoryImpl extends EFactoryImpl implements org.muml.uppaal.trace.diagnostictrace.DiagnosticTraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static org.muml.uppaal.trace.diagnostictrace.DiagnosticTraceFactory init() {
		try {
			org.muml.uppaal.trace.diagnostictrace.DiagnosticTraceFactory theDiagnosticTraceFactory = (org.muml.uppaal.trace.diagnostictrace.DiagnosticTraceFactory)EPackage.Registry.INSTANCE.getEFactory(DiagnosticTracePackage.eNS_URI);
			if (theDiagnosticTraceFactory != null) {
				return theDiagnosticTraceFactory;
			}
		}
		catch (Exception exception) {
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
	public DiagnosticTraceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.TRACE_REPOSITORY: return createTraceRepository();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.TRACE: return createTrace();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.PROCESS_IDENTIFIER: return createProcessIdentifier();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.LOCATION_ACTIVITY: return createLocationActivity();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE: return createVariableValue();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.SINGLE_NAMED_ELEMENT_REFERENCE: return createSingleNamedElementReference();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE: return createNamedElementReference();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.TRACE_ITEM: return createTraceItem();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.STATE: return createState();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.EDGE_ACTIVITY: return createEdgeActivity();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.SYNCHRONIZATION: return createSynchronization();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.CHANNEL_SYNCHRONIZATION: return createChannelSynchronization();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.DELAY_TRANSITION: return createDelayTransition();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.ACTION_TRANSITION: return createActionTransition();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.TRANSITION: return createTransition();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.RESULT:
				return createResultFromString(eDataType, initialValue);
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.COMPARE_OPERATOR:
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.RESULT:
				return convertResultToString(eDataType, instanceValue);
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.COMPARE_OPERATOR:
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
	public org.muml.uppaal.trace.diagnostictrace.TraceRepository createTraceRepository() {
		TraceRepositoryImpl traceRepository = new TraceRepositoryImpl();
		return traceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.ProcessIdentifier createProcessIdentifier() {
		ProcessIdentifierImpl processIdentifier = new ProcessIdentifierImpl();
		return processIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.LocationActivity createLocationActivity() {
		LocationActivityImpl locationActivity = new LocationActivityImpl();
		return locationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.VariableValue createVariableValue() {
		VariableValueImpl variableValue = new VariableValueImpl();
		return variableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.SingleNamedElementReference createSingleNamedElementReference() {
		SingleNamedElementReferenceImpl singleNamedElementReference = new SingleNamedElementReferenceImpl();
		return singleNamedElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.NamedElementReference createNamedElementReference() {
		NamedElementReferenceImpl namedElementReference = new NamedElementReferenceImpl();
		return namedElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.TraceItem createTraceItem() {
		TraceItemImpl traceItem = new TraceItemImpl();
		return traceItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.EdgeActivity createEdgeActivity() {
		EdgeActivityImpl edgeActivity = new EdgeActivityImpl();
		return edgeActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.Synchronization createSynchronization() {
		SynchronizationImpl synchronization = new SynchronizationImpl();
		return synchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.ChannelSynchronization createChannelSynchronization() {
		ChannelSynchronizationImpl channelSynchronization = new ChannelSynchronizationImpl();
		return channelSynchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.DelayTransition createDelayTransition() {
		DelayTransitionImpl delayTransition = new DelayTransitionImpl();
		return delayTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.ActionTransition createActionTransition() {
		ActionTransitionImpl actionTransition = new ActionTransitionImpl();
		return actionTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.Result createResultFromString(EDataType eDataType, String initialValue) {
		org.muml.uppaal.trace.diagnostictrace.Result result = org.muml.uppaal.trace.diagnostictrace.Result.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.CompareOperator createCompareOperatorFromString(EDataType eDataType, String initialValue) {
		org.muml.uppaal.trace.diagnostictrace.CompareOperator result = org.muml.uppaal.trace.diagnostictrace.CompareOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompareOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage getDiagnosticTracePackage() {
		return (org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage getPackage() {
		return org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.eINSTANCE;
	}

} //DiagnosticTraceFactoryImpl
