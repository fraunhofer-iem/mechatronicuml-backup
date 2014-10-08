package de.uni_paderborn.fujaba.graphviz.xtext.serializer;

import com.google.inject.Inject;
import de.uni_paderborn.fujaba.graphviz.xtext.services.PlainGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractPlainSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PlainGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Edge___IdentifierParserRuleCall_5_0_NumberParserRuleCall_5_1_NumberParserRuleCall_5_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PlainGrammarAccess) access;
		match_Edge___IdentifierParserRuleCall_5_0_NumberParserRuleCall_5_1_NumberParserRuleCall_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getIdentifierParserRuleCall_5_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getNumberParserRuleCall_5_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getNumberParserRuleCall_5_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIdentifierRule())
			return getIdentifierToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNumberRule())
			return getNumberToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * Identifier returns ecore::EString:
	 * 	ID | STRING
	 * ;
	 */
	protected String getIdentifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * Number returns ecore::EDouble:
	 * 	DOUBLE | INT
	 * ;
	 */
	protected String getNumberToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Edge___IdentifierParserRuleCall_5_0_NumberParserRuleCall_5_1_NumberParserRuleCall_5_2__q.equals(syntax))
				emit_Edge___IdentifierParserRuleCall_5_0_NumberParserRuleCall_5_1_NumberParserRuleCall_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (Identifier Number Number)?
	 */
	protected void emit_Edge___IdentifierParserRuleCall_5_0_NumberParserRuleCall_5_1_NumberParserRuleCall_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
