package de.uni_paderborn.uppaal.trace.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.ActionTransition;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.ChannelSynchronization;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.DelayTransition;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.DiagnosticTracePackage;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.EdgeActivity;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.LocationActivity;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.NamedElementReference;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.ProcessIdentifier;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.SingleNamedElementReference;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.State;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.Synchronization;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.Trace;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.TraceRepository;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.VariableValue;
import de.uni_paderborn.uppaal.trace.services.DiagnosticTraceGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DiagnosticTraceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DiagnosticTraceGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DiagnosticTracePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DiagnosticTracePackage.ACTION_TRANSITION:
				if(context == grammarAccess.getActionTransitionRule() ||
				   context == grammarAccess.getTraceItemRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_ActionTransition(context, (ActionTransition) semanticObject); 
					return; 
				}
				else break;
			case DiagnosticTracePackage.CHANNEL_SYNCHRONIZATION:
				if(context == grammarAccess.getChannelSynchronizationRule() ||
				   context == grammarAccess.getSynchronizationRule()) {
					sequence_ChannelSynchronization(context, (ChannelSynchronization) semanticObject); 
					return; 
				}
				else break;
			case DiagnosticTracePackage.DELAY_TRANSITION:
				if(context == grammarAccess.getDelayTransitionRule() ||
				   context == grammarAccess.getTraceItemRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_DelayTransition(context, (DelayTransition) semanticObject); 
					return; 
				}
				else break;
			case DiagnosticTracePackage.EDGE_ACTIVITY:
				if(context == grammarAccess.getEdgeActivityRule()) {
					sequence_EdgeActivity(context, (EdgeActivity) semanticObject); 
					return; 
				}
				else break;
			case DiagnosticTracePackage.LOCATION_ACTIVITY:
				if(context == grammarAccess.getLocationActivityRule()) {
					sequence_LocationActivity(context, (LocationActivity) semanticObject); 
					return; 
				}
				else break;
			case DiagnosticTracePackage.NAMED_ELEMENT_REFERENCE:
				if(context == grammarAccess.getNamedElementReferenceRule()) {
					sequence_NamedElementReference(context, (NamedElementReference) semanticObject); 
					return; 
				}
				else break;
			case DiagnosticTracePackage.PROCESS_IDENTIFIER:
				if(context == grammarAccess.getProcessIdentifierRule()) {
					sequence_ProcessIdentifier(context, (ProcessIdentifier) semanticObject); 
					return; 
				}
				else break;
			case DiagnosticTracePackage.SINGLE_NAMED_ELEMENT_REFERENCE:
				if(context == grammarAccess.getSingleNamedElementReferenceRule()) {
					sequence_SingleNamedElementReference(context, (SingleNamedElementReference) semanticObject); 
					return; 
				}
				else break;
			case DiagnosticTracePackage.STATE:
				if(context == grammarAccess.getStateRule() ||
				   context == grammarAccess.getTraceItemRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case DiagnosticTracePackage.SYNCHRONIZATION:
				if(context == grammarAccess.getSynchronizationRule()) {
					sequence_Synchronization(context, (Synchronization) semanticObject); 
					return; 
				}
				else break;
			case DiagnosticTracePackage.TRACE:
				if(context == grammarAccess.getTraceRule()) {
					sequence_Trace(context, (Trace) semanticObject); 
					return; 
				}
				else break;
			case DiagnosticTracePackage.TRACE_REPOSITORY:
				if(context == grammarAccess.getTraceRepositoryRule()) {
					sequence_TraceRepository(context, (TraceRepository) semanticObject); 
					return; 
				}
				else break;
			case DiagnosticTracePackage.VARIABLE_VALUE:
				if(context == grammarAccess.getVariableValueRule()) {
					sequence_VariableValue(context, (VariableValue) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     edgeActivities+=EdgeActivity+
	 */
	protected void sequence_ActionTransition(EObject context, ActionTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (channel=[Variable|ID] kind=SynchronizationKind)
	 */
	protected void sequence_ChannelSynchronization(EObject context, ChannelSynchronization semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagnosticTracePackage.Literals.CHANNEL_SYNCHRONIZATION__CHANNEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagnosticTracePackage.Literals.CHANNEL_SYNCHRONIZATION__CHANNEL));
			if(transientValues.isValueTransient(semanticObject, DiagnosticTracePackage.Literals.CHANNEL_SYNCHRONIZATION__KIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagnosticTracePackage.Literals.CHANNEL_SYNCHRONIZATION__KIND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getChannelSynchronizationAccess().getChannelVariableIDTerminalRuleCall_0_0_1(), semanticObject.getChannel());
		feeder.accept(grammarAccess.getChannelSynchronizationAccess().getKindSynchronizationKindEnumRuleCall_1_0(), semanticObject.getKind());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     duration=INT
	 */
	protected void sequence_DelayTransition(EObject context, DelayTransition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagnosticTracePackage.Literals.DELAY_TRANSITION__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagnosticTracePackage.Literals.DELAY_TRANSITION__DURATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDelayTransitionAccess().getDurationINTTerminalRuleCall_1_0(), semanticObject.getDuration());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (source=LocationActivity target=LocationActivity details=EDGE)
	 */
	protected void sequence_EdgeActivity(EObject context, EdgeActivity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagnosticTracePackage.Literals.EDGE_ACTIVITY__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagnosticTracePackage.Literals.EDGE_ACTIVITY__SOURCE));
			if(transientValues.isValueTransient(semanticObject, DiagnosticTracePackage.Literals.EDGE_ACTIVITY__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagnosticTracePackage.Literals.EDGE_ACTIVITY__TARGET));
			if(transientValues.isValueTransient(semanticObject, DiagnosticTracePackage.Literals.EDGE_ACTIVITY__DETAILS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagnosticTracePackage.Literals.EDGE_ACTIVITY__DETAILS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEdgeActivityAccess().getSourceLocationActivityParserRuleCall_0_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getEdgeActivityAccess().getTargetLocationActivityParserRuleCall_2_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getEdgeActivityAccess().getDetailsEDGETerminalRuleCall_3_0(), semanticObject.getDetails());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (process=ProcessIdentifier location=[Location|ID])
	 */
	protected void sequence_LocationActivity(EObject context, LocationActivity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagnosticTracePackage.Literals.LOCATION_ACTIVITY__PROCESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagnosticTracePackage.Literals.LOCATION_ACTIVITY__PROCESS));
			if(transientValues.isValueTransient(semanticObject, DiagnosticTracePackage.Literals.LOCATION_ACTIVITY__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagnosticTracePackage.Literals.LOCATION_ACTIVITY__LOCATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocationActivityAccess().getProcessProcessIdentifierParserRuleCall_0_0(), semanticObject.getProcess());
		feeder.accept(grammarAccess.getLocationActivityAccess().getLocationLocationIDTerminalRuleCall_2_0_1(), semanticObject.getLocation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (singleNamedElementReference=SingleNamedElementReference namedElementReference=NamedElementReference?)
	 */
	protected void sequence_NamedElementReference(EObject context, NamedElementReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (template=[AbstractTemplate|ID] (arguments+=INT arguments+=INT*)?)
	 */
	protected void sequence_ProcessIdentifier(EObject context, ProcessIdentifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (namedElement=[NamedElement|ID] indexes+=INT*)
	 */
	protected void sequence_SingleNamedElementReference(EObject context, SingleNamedElementReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (locationActivities+=LocationActivity+ (variableValues+=VariableValue variableValues+=VariableValue*)?)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Synchronization}
	 */
	protected void sequence_Synchronization(EObject context, Synchronization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     traces+=Trace*
	 */
	protected void sequence_TraceRepository(EObject context, TraceRepository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property=INT line=INT result=Result traceItems+=TraceItem*)
	 */
	protected void sequence_Trace(EObject context, Trace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (firstNamedElementReference=NamedElementReference secondNamedElementReference=NamedElementReference? operator=CompareOperator value=INT)
	 */
	protected void sequence_VariableValue(EObject context, VariableValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
