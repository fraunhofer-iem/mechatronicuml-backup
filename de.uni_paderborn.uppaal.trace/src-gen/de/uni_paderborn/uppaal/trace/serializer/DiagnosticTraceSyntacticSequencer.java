package de.uni_paderborn.uppaal.trace.serializer;

import com.google.inject.Inject;
import de.uni_paderborn.uppaal.trace.services.DiagnosticTraceGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DiagnosticTraceSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DiagnosticTraceGrammarAccess grammarAccess;
	protected AbstractElementAlias match_State_ColonKeyword_1_q;
	protected AbstractElementAlias match_State_CommaKeyword_5_1_0_q;
	protected AbstractElementAlias match_TraceRepository_CannotReuseStateSpaceWhenTraceLengthOptimisationIsUsedKeyword_0_q;
	protected AbstractElementAlias match_Trace_ShowingCounterExampleKeyword_5_0_0_or_ShowingExampleTraceKeyword_5_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DiagnosticTraceGrammarAccess) access;
		match_State_ColonKeyword_1_q = new TokenAlias(false, true, grammarAccess.getStateAccess().getColonKeyword_1());
		match_State_CommaKeyword_5_1_0_q = new TokenAlias(false, true, grammarAccess.getStateAccess().getCommaKeyword_5_1_0());
		match_TraceRepository_CannotReuseStateSpaceWhenTraceLengthOptimisationIsUsedKeyword_0_q = new TokenAlias(false, true, grammarAccess.getTraceRepositoryAccess().getCannotReuseStateSpaceWhenTraceLengthOptimisationIsUsedKeyword_0());
		match_Trace_ShowingCounterExampleKeyword_5_0_0_or_ShowingExampleTraceKeyword_5_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTraceAccess().getShowingCounterExampleKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getTraceAccess().getShowingExampleTraceKeyword_5_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getTauSynchronizationRule())
			return getTauSynchronizationToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * TauSynchronization:
	 * 	'tau'
	 * ;
	 */
	protected String getTauSynchronizationToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "tau";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_State_ColonKeyword_1_q.equals(syntax))
				emit_State_ColonKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_State_CommaKeyword_5_1_0_q.equals(syntax))
				emit_State_CommaKeyword_5_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TraceRepository_CannotReuseStateSpaceWhenTraceLengthOptimisationIsUsedKeyword_0_q.equals(syntax))
				emit_TraceRepository_CannotReuseStateSpaceWhenTraceLengthOptimisationIsUsedKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Trace_ShowingCounterExampleKeyword_5_0_0_or_ShowingExampleTraceKeyword_5_0_1.equals(syntax))
				emit_Trace_ShowingCounterExampleKeyword_5_0_0_or_ShowingExampleTraceKeyword_5_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ':'?
	 */
	protected void emit_State_ColonKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_State_CommaKeyword_5_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Cannot reuse state space when trace length optimisation is used.'?
	 */
	protected void emit_TraceRepository_CannotReuseStateSpaceWhenTraceLengthOptimisationIsUsedKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Showing example trace.' | 'Showing counter example.'
	 */
	protected void emit_Trace_ShowingCounterExampleKeyword_5_0_0_or_ShowingExampleTraceKeyword_5_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
