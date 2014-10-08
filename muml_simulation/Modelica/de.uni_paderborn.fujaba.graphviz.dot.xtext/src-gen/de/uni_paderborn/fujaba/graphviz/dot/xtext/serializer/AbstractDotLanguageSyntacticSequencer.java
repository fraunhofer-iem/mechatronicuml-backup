package de.uni_paderborn.fujaba.graphviz.dot.xtext.serializer;

import com.google.inject.Inject;
import de.uni_paderborn.fujaba.graphviz.dot.xtext.services.DotLanguageGrammarAccess;
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
public abstract class AbstractDotLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DotLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DotEdge_HyphenMinusGreaterThanSignKeyword_1_1_or_HyphenMinusHyphenMinusKeyword_1_0;
	protected AbstractElementAlias match_DotEdge_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_DotGraph_GraphKeyword_1_0_0_1_or_SubgraphKeyword_1_1_0;
	protected AbstractElementAlias match_DotGraph_SemicolonKeyword_3_0_5_q;
	protected AbstractElementAlias match_DotGraph_SemicolonKeyword_3_1_5_q;
	protected AbstractElementAlias match_DotGraph_SemicolonKeyword_3_2_5_q;
	protected AbstractElementAlias match_DotNode_SemicolonKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DotLanguageGrammarAccess) access;
		match_DotEdge_HyphenMinusGreaterThanSignKeyword_1_1_or_HyphenMinusHyphenMinusKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDotEdgeAccess().getHyphenMinusGreaterThanSignKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getDotEdgeAccess().getHyphenMinusHyphenMinusKeyword_1_0()));
		match_DotEdge_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getDotEdgeAccess().getSemicolonKeyword_4());
		match_DotGraph_GraphKeyword_1_0_0_1_or_SubgraphKeyword_1_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDotGraphAccess().getGraphKeyword_1_0_0_1()), new TokenAlias(false, false, grammarAccess.getDotGraphAccess().getSubgraphKeyword_1_1_0()));
		match_DotGraph_SemicolonKeyword_3_0_5_q = new TokenAlias(false, true, grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_0_5());
		match_DotGraph_SemicolonKeyword_3_1_5_q = new TokenAlias(false, true, grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_1_5());
		match_DotGraph_SemicolonKeyword_3_2_5_q = new TokenAlias(false, true, grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_2_5());
		match_DotNode_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getDotNodeAccess().getSemicolonKeyword_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_DotEdge_HyphenMinusGreaterThanSignKeyword_1_1_or_HyphenMinusHyphenMinusKeyword_1_0.equals(syntax))
				emit_DotEdge_HyphenMinusGreaterThanSignKeyword_1_1_or_HyphenMinusHyphenMinusKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DotEdge_SemicolonKeyword_4_q.equals(syntax))
				emit_DotEdge_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DotGraph_GraphKeyword_1_0_0_1_or_SubgraphKeyword_1_1_0.equals(syntax))
				emit_DotGraph_GraphKeyword_1_0_0_1_or_SubgraphKeyword_1_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DotGraph_SemicolonKeyword_3_0_5_q.equals(syntax))
				emit_DotGraph_SemicolonKeyword_3_0_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DotGraph_SemicolonKeyword_3_1_5_q.equals(syntax))
				emit_DotGraph_SemicolonKeyword_3_1_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DotGraph_SemicolonKeyword_3_2_5_q.equals(syntax))
				emit_DotGraph_SemicolonKeyword_3_2_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DotNode_SemicolonKeyword_2_q.equals(syntax))
				emit_DotNode_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '--' | '->'
	 */
	protected void emit_DotEdge_HyphenMinusGreaterThanSignKeyword_1_1_or_HyphenMinusHyphenMinusKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_DotEdge_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'subgraph' | 'graph'
	 */
	protected void emit_DotGraph_GraphKeyword_1_0_0_1_or_SubgraphKeyword_1_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_DotGraph_SemicolonKeyword_3_0_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_DotGraph_SemicolonKeyword_3_1_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_DotGraph_SemicolonKeyword_3_2_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_DotNode_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
