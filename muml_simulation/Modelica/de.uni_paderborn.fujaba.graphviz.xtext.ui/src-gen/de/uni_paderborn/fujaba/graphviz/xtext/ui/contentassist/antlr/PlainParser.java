/*
* generated by Xtext
*/
package de.uni_paderborn.fujaba.graphviz.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.uni_paderborn.fujaba.graphviz.xtext.services.PlainGrammarAccess;

public class PlainParser extends AbstractContentAssistParser {
	
	@Inject
	private PlainGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.uni_paderborn.fujaba.graphviz.xtext.ui.contentassist.antlr.internal.InternalPlainParser createParser() {
		de.uni_paderborn.fujaba.graphviz.xtext.ui.contentassist.antlr.internal.InternalPlainParser result = new de.uni_paderborn.fujaba.graphviz.xtext.ui.contentassist.antlr.internal.InternalPlainParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getNumberAccess().getAlternatives(), "rule__Number__Alternatives");
					put(grammarAccess.getIdentifierAccess().getAlternatives(), "rule__Identifier__Alternatives");
					put(grammarAccess.getGraphAccess().getGroup(), "rule__Graph__Group__0");
					put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
					put(grammarAccess.getEdgeAccess().getGroup(), "rule__Edge__Group__0");
					put(grammarAccess.getEdgeAccess().getGroup_5(), "rule__Edge__Group_5__0");
					put(grammarAccess.getPointAccess().getGroup(), "rule__Point__Group__0");
					put(grammarAccess.getGraphAccess().getScaleAssignment_1(), "rule__Graph__ScaleAssignment_1");
					put(grammarAccess.getGraphAccess().getWidthAssignment_2(), "rule__Graph__WidthAssignment_2");
					put(grammarAccess.getGraphAccess().getHeightAssignment_3(), "rule__Graph__HeightAssignment_3");
					put(grammarAccess.getGraphAccess().getNodesAssignment_4(), "rule__Graph__NodesAssignment_4");
					put(grammarAccess.getGraphAccess().getEdgesAssignment_5(), "rule__Graph__EdgesAssignment_5");
					put(grammarAccess.getNodeAccess().getNameAssignment_1(), "rule__Node__NameAssignment_1");
					put(grammarAccess.getNodeAccess().getPositionAssignment_2(), "rule__Node__PositionAssignment_2");
					put(grammarAccess.getNodeAccess().getWidthAssignment_3(), "rule__Node__WidthAssignment_3");
					put(grammarAccess.getNodeAccess().getHeightAssignment_4(), "rule__Node__HeightAssignment_4");
					put(grammarAccess.getEdgeAccess().getSourceAssignment_1(), "rule__Edge__SourceAssignment_1");
					put(grammarAccess.getEdgeAccess().getTargetAssignment_2(), "rule__Edge__TargetAssignment_2");
					put(grammarAccess.getEdgeAccess().getSplinePointsAssignment_4(), "rule__Edge__SplinePointsAssignment_4");
					put(grammarAccess.getPointAccess().getXAssignment_0(), "rule__Point__XAssignment_0");
					put(grammarAccess.getPointAccess().getYAssignment_1(), "rule__Point__YAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.uni_paderborn.fujaba.graphviz.xtext.ui.contentassist.antlr.internal.InternalPlainParser typedParser = (de.uni_paderborn.fujaba.graphviz.xtext.ui.contentassist.antlr.internal.InternalPlainParser) parser;
			typedParser.entryRuleGraph();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PlainGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PlainGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
