/*
 * generated by Xtext
 */
package org.muml.graphviz.dot.xtext.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class DotLanguageGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class DotGraphElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.muml.graphviz.dot.xtext.DotLanguage.DotGraph");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDotGraphAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Alternatives cAlternatives_1_0_0 = (Alternatives)cGroup_1_0.eContents().get(0);
		private final Assignment cDirectedGraphAssignment_1_0_0_0 = (Assignment)cAlternatives_1_0_0.eContents().get(0);
		private final Keyword cDirectedGraphDigraphKeyword_1_0_0_0_0 = (Keyword)cDirectedGraphAssignment_1_0_0_0.eContents().get(0);
		private final Keyword cGraphKeyword_1_0_0_1 = (Keyword)cAlternatives_1_0_0.eContents().get(1);
		private final Assignment cIdAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cIdDotIDParserRuleCall_1_0_1_0 = (RuleCall)cIdAssignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cSubgraphKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cIdAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cIdDotIDParserRuleCall_1_1_1_0 = (RuleCall)cIdAssignment_1_1_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cGraphKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cGraphSettingsAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final RuleCall cGraphSettingsSettingParserRuleCall_3_0_2_0 = (RuleCall)cGraphSettingsAssignment_3_0_2.eContents().get(0);
		private final Group cGroup_3_0_3 = (Group)cGroup_3_0.eContents().get(3);
		private final Keyword cCommaKeyword_3_0_3_0 = (Keyword)cGroup_3_0_3.eContents().get(0);
		private final Assignment cGraphSettingsAssignment_3_0_3_1 = (Assignment)cGroup_3_0_3.eContents().get(1);
		private final RuleCall cGraphSettingsSettingParserRuleCall_3_0_3_1_0 = (RuleCall)cGraphSettingsAssignment_3_0_3_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3_0_4 = (Keyword)cGroup_3_0.eContents().get(4);
		private final Keyword cSemicolonKeyword_3_0_5 = (Keyword)cGroup_3_0.eContents().get(5);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cNodeKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cNodeSettingsAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final RuleCall cNodeSettingsSettingParserRuleCall_3_1_2_0 = (RuleCall)cNodeSettingsAssignment_3_1_2.eContents().get(0);
		private final Group cGroup_3_1_3 = (Group)cGroup_3_1.eContents().get(3);
		private final Keyword cCommaKeyword_3_1_3_0 = (Keyword)cGroup_3_1_3.eContents().get(0);
		private final Assignment cNodeSettingsAssignment_3_1_3_1 = (Assignment)cGroup_3_1_3.eContents().get(1);
		private final RuleCall cNodeSettingsSettingParserRuleCall_3_1_3_1_0 = (RuleCall)cNodeSettingsAssignment_3_1_3_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3_1_4 = (Keyword)cGroup_3_1.eContents().get(4);
		private final Keyword cSemicolonKeyword_3_1_5 = (Keyword)cGroup_3_1.eContents().get(5);
		private final Group cGroup_3_2 = (Group)cAlternatives_3.eContents().get(2);
		private final Keyword cEdgeKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Assignment cEdgeSettingsAssignment_3_2_2 = (Assignment)cGroup_3_2.eContents().get(2);
		private final RuleCall cEdgeSettingsSettingParserRuleCall_3_2_2_0 = (RuleCall)cEdgeSettingsAssignment_3_2_2.eContents().get(0);
		private final Group cGroup_3_2_3 = (Group)cGroup_3_2.eContents().get(3);
		private final Keyword cCommaKeyword_3_2_3_0 = (Keyword)cGroup_3_2_3.eContents().get(0);
		private final Assignment cEdgeSettingsAssignment_3_2_3_1 = (Assignment)cGroup_3_2_3.eContents().get(1);
		private final RuleCall cEdgeSettingsSettingParserRuleCall_3_2_3_1_0 = (RuleCall)cEdgeSettingsAssignment_3_2_3_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3_2_4 = (Keyword)cGroup_3_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_3_2_5 = (Keyword)cGroup_3_2.eContents().get(5);
		private final Assignment cSubgraphsAssignment_3_3 = (Assignment)cAlternatives_3.eContents().get(3);
		private final RuleCall cSubgraphsDotGraphParserRuleCall_3_3_0 = (RuleCall)cSubgraphsAssignment_3_3.eContents().get(0);
		private final Assignment cNodesAssignment_3_4 = (Assignment)cAlternatives_3.eContents().get(4);
		private final RuleCall cNodesDotNodeParserRuleCall_3_4_0 = (RuleCall)cNodesAssignment_3_4.eContents().get(0);
		private final Assignment cEdgesAssignment_3_5 = (Assignment)cAlternatives_3.eContents().get(5);
		private final RuleCall cEdgesDotEdgeParserRuleCall_3_5_0 = (RuleCall)cEdgesAssignment_3_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		////import "http://www.muml.org/core/1.0.0" as core
		////import "platform:/resource/de.uni_paderborn.fujaba.graphviz/model/graphviz.ecore#//dot" as dot
		////import "platform:/resource/de.uni_paderborn.fujaba.graphviz/model/graphviz.ecore#//common" as common
		//DotGraph dot::DotGraph:
		//	{dot::DotGraph} ((directedGraph?='digraph' | 'graph') id=DotID?
		//	| 'subgraph' id=DotID?)
		//	'{' ('graph' '[' graphSettings+=Setting (',' graphSettings+=Setting)* ']' ';'? | 'node' '[' nodeSettings+=Setting (','
		//	nodeSettings+=Setting)* ']' ';'? | 'edge' '[' edgeSettings+=Setting (',' edgeSettings+=Setting)* ']' ';'? |
		//	subgraphs+=DotGraph | nodes+=DotNode | edges+=DotEdge)*
		//	'}'
		@Override public ParserRule getRule() { return rule; }

		//{dot::DotGraph} ((directedGraph?='digraph' | 'graph') id=DotID? | 'subgraph' id=DotID?) '{' ('graph' '['
		//graphSettings+=Setting (',' graphSettings+=Setting)* ']' ';'? | 'node' '[' nodeSettings+=Setting (','
		//nodeSettings+=Setting)* ']' ';'? | 'edge' '[' edgeSettings+=Setting (',' edgeSettings+=Setting)* ']' ';'? |
		//subgraphs+=DotGraph | nodes+=DotNode | edges+=DotEdge)* '}'
		public Group getGroup() { return cGroup; }

		//{dot::DotGraph}
		public Action getDotGraphAction_0() { return cDotGraphAction_0; }

		//((directedGraph?='digraph' | 'graph') id=DotID? | 'subgraph' id=DotID?)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//(directedGraph?='digraph' | 'graph') id=DotID?
		public Group getGroup_1_0() { return cGroup_1_0; }

		//(directedGraph?='digraph' | 'graph')
		public Alternatives getAlternatives_1_0_0() { return cAlternatives_1_0_0; }

		//directedGraph?='digraph'
		public Assignment getDirectedGraphAssignment_1_0_0_0() { return cDirectedGraphAssignment_1_0_0_0; }

		//'digraph'
		public Keyword getDirectedGraphDigraphKeyword_1_0_0_0_0() { return cDirectedGraphDigraphKeyword_1_0_0_0_0; }

		//'graph'
		public Keyword getGraphKeyword_1_0_0_1() { return cGraphKeyword_1_0_0_1; }

		//id=DotID?
		public Assignment getIdAssignment_1_0_1() { return cIdAssignment_1_0_1; }

		//DotID
		public RuleCall getIdDotIDParserRuleCall_1_0_1_0() { return cIdDotIDParserRuleCall_1_0_1_0; }

		//'subgraph' id=DotID?
		public Group getGroup_1_1() { return cGroup_1_1; }

		//'subgraph'
		public Keyword getSubgraphKeyword_1_1_0() { return cSubgraphKeyword_1_1_0; }

		//id=DotID?
		public Assignment getIdAssignment_1_1_1() { return cIdAssignment_1_1_1; }

		//DotID
		public RuleCall getIdDotIDParserRuleCall_1_1_1_0() { return cIdDotIDParserRuleCall_1_1_1_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//('graph' '[' graphSettings+=Setting (',' graphSettings+=Setting)* ']' ';'? | 'node' '[' nodeSettings+=Setting (','
		//nodeSettings+=Setting)* ']' ';'? | 'edge' '[' edgeSettings+=Setting (',' edgeSettings+=Setting)* ']' ';'? |
		//subgraphs+=DotGraph | nodes+=DotNode | edges+=DotEdge)*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//'graph' '[' graphSettings+=Setting (',' graphSettings+=Setting)* ']' ';'?
		public Group getGroup_3_0() { return cGroup_3_0; }

		//'graph'
		public Keyword getGraphKeyword_3_0_0() { return cGraphKeyword_3_0_0; }

		//'['
		public Keyword getLeftSquareBracketKeyword_3_0_1() { return cLeftSquareBracketKeyword_3_0_1; }

		//graphSettings+=Setting
		public Assignment getGraphSettingsAssignment_3_0_2() { return cGraphSettingsAssignment_3_0_2; }

		//Setting
		public RuleCall getGraphSettingsSettingParserRuleCall_3_0_2_0() { return cGraphSettingsSettingParserRuleCall_3_0_2_0; }

		//(',' graphSettings+=Setting)*
		public Group getGroup_3_0_3() { return cGroup_3_0_3; }

		//','
		public Keyword getCommaKeyword_3_0_3_0() { return cCommaKeyword_3_0_3_0; }

		//graphSettings+=Setting
		public Assignment getGraphSettingsAssignment_3_0_3_1() { return cGraphSettingsAssignment_3_0_3_1; }

		//Setting
		public RuleCall getGraphSettingsSettingParserRuleCall_3_0_3_1_0() { return cGraphSettingsSettingParserRuleCall_3_0_3_1_0; }

		//']'
		public Keyword getRightSquareBracketKeyword_3_0_4() { return cRightSquareBracketKeyword_3_0_4; }

		//';'?
		public Keyword getSemicolonKeyword_3_0_5() { return cSemicolonKeyword_3_0_5; }

		//'node' '[' nodeSettings+=Setting (',' nodeSettings+=Setting)* ']' ';'?
		public Group getGroup_3_1() { return cGroup_3_1; }

		//'node'
		public Keyword getNodeKeyword_3_1_0() { return cNodeKeyword_3_1_0; }

		//'['
		public Keyword getLeftSquareBracketKeyword_3_1_1() { return cLeftSquareBracketKeyword_3_1_1; }

		//nodeSettings+=Setting
		public Assignment getNodeSettingsAssignment_3_1_2() { return cNodeSettingsAssignment_3_1_2; }

		//Setting
		public RuleCall getNodeSettingsSettingParserRuleCall_3_1_2_0() { return cNodeSettingsSettingParserRuleCall_3_1_2_0; }

		//(',' nodeSettings+=Setting)*
		public Group getGroup_3_1_3() { return cGroup_3_1_3; }

		//','
		public Keyword getCommaKeyword_3_1_3_0() { return cCommaKeyword_3_1_3_0; }

		//nodeSettings+=Setting
		public Assignment getNodeSettingsAssignment_3_1_3_1() { return cNodeSettingsAssignment_3_1_3_1; }

		//Setting
		public RuleCall getNodeSettingsSettingParserRuleCall_3_1_3_1_0() { return cNodeSettingsSettingParserRuleCall_3_1_3_1_0; }

		//']'
		public Keyword getRightSquareBracketKeyword_3_1_4() { return cRightSquareBracketKeyword_3_1_4; }

		//';'?
		public Keyword getSemicolonKeyword_3_1_5() { return cSemicolonKeyword_3_1_5; }

		//'edge' '[' edgeSettings+=Setting (',' edgeSettings+=Setting)* ']' ';'?
		public Group getGroup_3_2() { return cGroup_3_2; }

		//'edge'
		public Keyword getEdgeKeyword_3_2_0() { return cEdgeKeyword_3_2_0; }

		//'['
		public Keyword getLeftSquareBracketKeyword_3_2_1() { return cLeftSquareBracketKeyword_3_2_1; }

		//edgeSettings+=Setting
		public Assignment getEdgeSettingsAssignment_3_2_2() { return cEdgeSettingsAssignment_3_2_2; }

		//Setting
		public RuleCall getEdgeSettingsSettingParserRuleCall_3_2_2_0() { return cEdgeSettingsSettingParserRuleCall_3_2_2_0; }

		//(',' edgeSettings+=Setting)*
		public Group getGroup_3_2_3() { return cGroup_3_2_3; }

		//','
		public Keyword getCommaKeyword_3_2_3_0() { return cCommaKeyword_3_2_3_0; }

		//edgeSettings+=Setting
		public Assignment getEdgeSettingsAssignment_3_2_3_1() { return cEdgeSettingsAssignment_3_2_3_1; }

		//Setting
		public RuleCall getEdgeSettingsSettingParserRuleCall_3_2_3_1_0() { return cEdgeSettingsSettingParserRuleCall_3_2_3_1_0; }

		//']'
		public Keyword getRightSquareBracketKeyword_3_2_4() { return cRightSquareBracketKeyword_3_2_4; }

		//';'?
		public Keyword getSemicolonKeyword_3_2_5() { return cSemicolonKeyword_3_2_5; }

		//subgraphs+=DotGraph
		public Assignment getSubgraphsAssignment_3_3() { return cSubgraphsAssignment_3_3; }

		//DotGraph
		public RuleCall getSubgraphsDotGraphParserRuleCall_3_3_0() { return cSubgraphsDotGraphParserRuleCall_3_3_0; }

		//nodes+=DotNode
		public Assignment getNodesAssignment_3_4() { return cNodesAssignment_3_4; }

		//DotNode
		public RuleCall getNodesDotNodeParserRuleCall_3_4_0() { return cNodesDotNodeParserRuleCall_3_4_0; }

		//edges+=DotEdge
		public Assignment getEdgesAssignment_3_5() { return cEdgesAssignment_3_5; }

		//DotEdge
		public RuleCall getEdgesDotEdgeParserRuleCall_3_5_0() { return cEdgesDotEdgeParserRuleCall_3_5_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class DotNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.muml.graphviz.dot.xtext.DotLanguage.DotNode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameDotIDParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSettingsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSettingsSettingParserRuleCall_1_1_0 = (RuleCall)cSettingsAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cSettingsAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cSettingsSettingParserRuleCall_1_2_1_0 = (RuleCall)cSettingsAssignment_1_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DotNode dot::DotNode:
		//	name=DotID ('[' settings+=Setting (',' settings+=Setting)* ']')? ';'?
		@Override public ParserRule getRule() { return rule; }

		//name=DotID ('[' settings+=Setting (',' settings+=Setting)* ']')? ';'?
		public Group getGroup() { return cGroup; }

		//name=DotID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//DotID
		public RuleCall getNameDotIDParserRuleCall_0_0() { return cNameDotIDParserRuleCall_0_0; }

		//('[' settings+=Setting (',' settings+=Setting)* ']')?
		public Group getGroup_1() { return cGroup_1; }

		//'['
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }

		//settings+=Setting
		public Assignment getSettingsAssignment_1_1() { return cSettingsAssignment_1_1; }

		//Setting
		public RuleCall getSettingsSettingParserRuleCall_1_1_0() { return cSettingsSettingParserRuleCall_1_1_0; }

		//(',' settings+=Setting)*
		public Group getGroup_1_2() { return cGroup_1_2; }

		//','
		public Keyword getCommaKeyword_1_2_0() { return cCommaKeyword_1_2_0; }

		//settings+=Setting
		public Assignment getSettingsAssignment_1_2_1() { return cSettingsAssignment_1_2_1; }

		//Setting
		public RuleCall getSettingsSettingParserRuleCall_1_2_1_0() { return cSettingsSettingParserRuleCall_1_2_1_0; }

		//']'
		public Keyword getRightSquareBracketKeyword_1_3() { return cRightSquareBracketKeyword_1_3; }

		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class DotEdgeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.muml.graphviz.dot.xtext.DotLanguage.DotEdge");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDirectedDotEdgeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cUndirectedDotEdgeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DotEdge dot::DotEdge:
		//	DirectedDotEdge | UndirectedDotEdge
		@Override public ParserRule getRule() { return rule; }

		//DirectedDotEdge | UndirectedDotEdge
		public Alternatives getAlternatives() { return cAlternatives; }

		//DirectedDotEdge
		public RuleCall getDirectedDotEdgeParserRuleCall_0() { return cDirectedDotEdgeParserRuleCall_0; }

		//UndirectedDotEdge
		public RuleCall getUndirectedDotEdgeParserRuleCall_1() { return cUndirectedDotEdgeParserRuleCall_1; }
	}

	public class DirectedDotEdgeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.muml.graphviz.dot.xtext.DotLanguage.DirectedDotEdge");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSourceAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cSourceDotNodeCrossReference_0_0 = (CrossReference)cSourceAssignment_0.eContents().get(0);
		private final RuleCall cSourceDotNodeDotIDParserRuleCall_0_0_1 = (RuleCall)cSourceDotNodeCrossReference_0_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTargetAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTargetDotNodeCrossReference_2_0 = (CrossReference)cTargetAssignment_2.eContents().get(0);
		private final RuleCall cTargetDotNodeDotIDParserRuleCall_2_0_1 = (RuleCall)cTargetDotNodeCrossReference_2_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftSquareBracketKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cSettingsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cSettingsSettingParserRuleCall_3_1_0 = (RuleCall)cSettingsAssignment_3_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cSettingsAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cSettingsSettingParserRuleCall_3_2_1_0 = (RuleCall)cSettingsAssignment_3_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DirectedDotEdge dot::DirectedDotEdge:
		//	source=[dot::DotNode|DotID] '->' target=[dot::DotNode|DotID] ('[' settings+=Setting (',' settings+=Setting)* ']')?
		//	';'?
		@Override public ParserRule getRule() { return rule; }

		//source=[dot::DotNode|DotID] '->' target=[dot::DotNode|DotID] ('[' settings+=Setting (',' settings+=Setting)* ']')? ';'?
		public Group getGroup() { return cGroup; }

		//source=[dot::DotNode|DotID]
		public Assignment getSourceAssignment_0() { return cSourceAssignment_0; }

		//[dot::DotNode|DotID]
		public CrossReference getSourceDotNodeCrossReference_0_0() { return cSourceDotNodeCrossReference_0_0; }

		//DotID
		public RuleCall getSourceDotNodeDotIDParserRuleCall_0_0_1() { return cSourceDotNodeDotIDParserRuleCall_0_0_1; }

		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_1() { return cHyphenMinusGreaterThanSignKeyword_1; }

		//target=[dot::DotNode|DotID]
		public Assignment getTargetAssignment_2() { return cTargetAssignment_2; }

		//[dot::DotNode|DotID]
		public CrossReference getTargetDotNodeCrossReference_2_0() { return cTargetDotNodeCrossReference_2_0; }

		//DotID
		public RuleCall getTargetDotNodeDotIDParserRuleCall_2_0_1() { return cTargetDotNodeDotIDParserRuleCall_2_0_1; }

		//('[' settings+=Setting (',' settings+=Setting)* ']')?
		public Group getGroup_3() { return cGroup_3; }

		//'['
		public Keyword getLeftSquareBracketKeyword_3_0() { return cLeftSquareBracketKeyword_3_0; }

		//settings+=Setting
		public Assignment getSettingsAssignment_3_1() { return cSettingsAssignment_3_1; }

		//Setting
		public RuleCall getSettingsSettingParserRuleCall_3_1_0() { return cSettingsSettingParserRuleCall_3_1_0; }

		//(',' settings+=Setting)*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//','
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//settings+=Setting
		public Assignment getSettingsAssignment_3_2_1() { return cSettingsAssignment_3_2_1; }

		//Setting
		public RuleCall getSettingsSettingParserRuleCall_3_2_1_0() { return cSettingsSettingParserRuleCall_3_2_1_0; }

		//']'
		public Keyword getRightSquareBracketKeyword_3_3() { return cRightSquareBracketKeyword_3_3; }

		//';'?
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class UndirectedDotEdgeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.muml.graphviz.dot.xtext.DotLanguage.UndirectedDotEdge");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSourceAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cSourceDotNodeCrossReference_0_0 = (CrossReference)cSourceAssignment_0.eContents().get(0);
		private final RuleCall cSourceDotNodeDotIDParserRuleCall_0_0_1 = (RuleCall)cSourceDotNodeCrossReference_0_0.eContents().get(1);
		private final Keyword cHyphenMinusHyphenMinusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTargetAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTargetDotNodeCrossReference_2_0 = (CrossReference)cTargetAssignment_2.eContents().get(0);
		private final RuleCall cTargetDotNodeDotIDParserRuleCall_2_0_1 = (RuleCall)cTargetDotNodeCrossReference_2_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftSquareBracketKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cSettingsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cSettingsSettingParserRuleCall_3_1_0 = (RuleCall)cSettingsAssignment_3_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cSettingsAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cSettingsSettingParserRuleCall_3_2_1_0 = (RuleCall)cSettingsAssignment_3_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//UndirectedDotEdge dot::UndirectedDotEdge:
		//	source=[dot::DotNode|DotID] '--' target=[dot::DotNode|DotID] ('[' settings+=Setting (',' settings+=Setting)* ']')?
		//	';'?
		@Override public ParserRule getRule() { return rule; }

		//source=[dot::DotNode|DotID] '--' target=[dot::DotNode|DotID] ('[' settings+=Setting (',' settings+=Setting)* ']')? ';'?
		public Group getGroup() { return cGroup; }

		//source=[dot::DotNode|DotID]
		public Assignment getSourceAssignment_0() { return cSourceAssignment_0; }

		//[dot::DotNode|DotID]
		public CrossReference getSourceDotNodeCrossReference_0_0() { return cSourceDotNodeCrossReference_0_0; }

		//DotID
		public RuleCall getSourceDotNodeDotIDParserRuleCall_0_0_1() { return cSourceDotNodeDotIDParserRuleCall_0_0_1; }

		//'--'
		public Keyword getHyphenMinusHyphenMinusKeyword_1() { return cHyphenMinusHyphenMinusKeyword_1; }

		//target=[dot::DotNode|DotID]
		public Assignment getTargetAssignment_2() { return cTargetAssignment_2; }

		//[dot::DotNode|DotID]
		public CrossReference getTargetDotNodeCrossReference_2_0() { return cTargetDotNodeCrossReference_2_0; }

		//DotID
		public RuleCall getTargetDotNodeDotIDParserRuleCall_2_0_1() { return cTargetDotNodeDotIDParserRuleCall_2_0_1; }

		//('[' settings+=Setting (',' settings+=Setting)* ']')?
		public Group getGroup_3() { return cGroup_3; }

		//'['
		public Keyword getLeftSquareBracketKeyword_3_0() { return cLeftSquareBracketKeyword_3_0; }

		//settings+=Setting
		public Assignment getSettingsAssignment_3_1() { return cSettingsAssignment_3_1; }

		//Setting
		public RuleCall getSettingsSettingParserRuleCall_3_1_0() { return cSettingsSettingParserRuleCall_3_1_0; }

		//(',' settings+=Setting)*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//','
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//settings+=Setting
		public Assignment getSettingsAssignment_3_2_1() { return cSettingsAssignment_3_2_1; }

		//Setting
		public RuleCall getSettingsSettingParserRuleCall_3_2_1_0() { return cSettingsSettingParserRuleCall_3_2_1_0; }

		//']'
		public Keyword getRightSquareBracketKeyword_3_3() { return cRightSquareBracketKeyword_3_3; }

		//';'?
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class SettingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.muml.graphviz.dot.xtext.DotLanguage.Setting");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAttributeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAttributeDotIDParserRuleCall_0_0 = (RuleCall)cAttributeAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueDotIDParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Setting dot::Setting:
		//	attribute=DotID '=' value=DotID
		@Override public ParserRule getRule() { return rule; }

		//attribute=DotID '=' value=DotID
		public Group getGroup() { return cGroup; }

		//attribute=DotID
		public Assignment getAttributeAssignment_0() { return cAttributeAssignment_0; }

		//DotID
		public RuleCall getAttributeDotIDParserRuleCall_0_0() { return cAttributeDotIDParserRuleCall_0_0; }

		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//value=DotID
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//DotID
		public RuleCall getValueDotIDParserRuleCall_2_0() { return cValueDotIDParserRuleCall_2_0; }
	}

	public class DotIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.muml.graphviz.dot.xtext.DotLanguage.DotID");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDOTSTRINGTERMTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNUMPREFIXEDIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cNumberParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cIDTerminalRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//DotID:
		//	DOTSTRINGTERM | NUMPREFIXEDID | Number | ID // Number is a bit too coarse, but well...
		//;
		@Override public ParserRule getRule() { return rule; }

		//// TODO: implement correct id rules from the graphviz spec
		//// (for instance, quotes can also be escaped using \" ...)
		//DOTSTRINGTERM | NUMPREFIXEDID | Number | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//// TODO: implement correct id rules from the graphviz spec
		//// (for instance, quotes can also be escaped using \" ...)
		//DOTSTRINGTERM
		public RuleCall getDOTSTRINGTERMTerminalRuleCall_0() { return cDOTSTRINGTERMTerminalRuleCall_0; }

		//NUMPREFIXEDID
		public RuleCall getNUMPREFIXEDIDTerminalRuleCall_1() { return cNUMPREFIXEDIDTerminalRuleCall_1; }

		//Number
		public RuleCall getNumberParserRuleCall_2() { return cNumberParserRuleCall_2; }

		//ID
		public RuleCall getIDTerminalRuleCall_3() { return cIDTerminalRuleCall_3; }
	}

	public class NumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.muml.graphviz.dot.xtext.DotLanguage.Number");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cDOUBLETerminalRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		
		//Number ecore::EDouble:
		//	'-'? (DOUBLE | INT)
		@Override public ParserRule getRule() { return rule; }

		//'-'? (DOUBLE | INT)
		public Group getGroup() { return cGroup; }

		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }

		//(DOUBLE | INT)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//DOUBLE
		public RuleCall getDOUBLETerminalRuleCall_1_0() { return cDOUBLETerminalRuleCall_1_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_1_1() { return cINTTerminalRuleCall_1_1; }
	}
	
	
	private final DotGraphElements pDotGraph;
	private final DotNodeElements pDotNode;
	private final DotEdgeElements pDotEdge;
	private final DirectedDotEdgeElements pDirectedDotEdge;
	private final UndirectedDotEdgeElements pUndirectedDotEdge;
	private final SettingElements pSetting;
	private final DotIDElements pDotID;
	private final TerminalRule tNUMPREFIXEDID;
	private final TerminalRule tDOTSTRINGTERM;
	private final NumberElements pNumber;
	private final TerminalRule tDOUBLE;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DotLanguageGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDotGraph = new DotGraphElements();
		this.pDotNode = new DotNodeElements();
		this.pDotEdge = new DotEdgeElements();
		this.pDirectedDotEdge = new DirectedDotEdgeElements();
		this.pUndirectedDotEdge = new UndirectedDotEdgeElements();
		this.pSetting = new SettingElements();
		this.pDotID = new DotIDElements();
		this.tNUMPREFIXEDID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.muml.graphviz.dot.xtext.DotLanguage.NUMPREFIXEDID");
		this.tDOTSTRINGTERM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.muml.graphviz.dot.xtext.DotLanguage.DOTSTRINGTERM");
		this.pNumber = new NumberElements();
		this.tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.muml.graphviz.dot.xtext.DotLanguage.DOUBLE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.muml.graphviz.dot.xtext.DotLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	////import "http://www.muml.org/core/1.0.0" as core
	////import "platform:/resource/de.uni_paderborn.fujaba.graphviz/model/graphviz.ecore#//dot" as dot
	////import "platform:/resource/de.uni_paderborn.fujaba.graphviz/model/graphviz.ecore#//common" as common
	//DotGraph dot::DotGraph:
	//	{dot::DotGraph} ((directedGraph?='digraph' | 'graph') id=DotID?
	//	| 'subgraph' id=DotID?)
	//	'{' ('graph' '[' graphSettings+=Setting (',' graphSettings+=Setting)* ']' ';'? | 'node' '[' nodeSettings+=Setting (','
	//	nodeSettings+=Setting)* ']' ';'? | 'edge' '[' edgeSettings+=Setting (',' edgeSettings+=Setting)* ']' ';'? |
	//	subgraphs+=DotGraph | nodes+=DotNode | edges+=DotEdge)*
	//	'}'
	public DotGraphElements getDotGraphAccess() {
		return pDotGraph;
	}
	
	public ParserRule getDotGraphRule() {
		return getDotGraphAccess().getRule();
	}

	//DotNode dot::DotNode:
	//	name=DotID ('[' settings+=Setting (',' settings+=Setting)* ']')? ';'?
	public DotNodeElements getDotNodeAccess() {
		return pDotNode;
	}
	
	public ParserRule getDotNodeRule() {
		return getDotNodeAccess().getRule();
	}

	//DotEdge dot::DotEdge:
	//	DirectedDotEdge | UndirectedDotEdge
	public DotEdgeElements getDotEdgeAccess() {
		return pDotEdge;
	}
	
	public ParserRule getDotEdgeRule() {
		return getDotEdgeAccess().getRule();
	}

	//DirectedDotEdge dot::DirectedDotEdge:
	//	source=[dot::DotNode|DotID] '->' target=[dot::DotNode|DotID] ('[' settings+=Setting (',' settings+=Setting)* ']')?
	//	';'?
	public DirectedDotEdgeElements getDirectedDotEdgeAccess() {
		return pDirectedDotEdge;
	}
	
	public ParserRule getDirectedDotEdgeRule() {
		return getDirectedDotEdgeAccess().getRule();
	}

	//UndirectedDotEdge dot::UndirectedDotEdge:
	//	source=[dot::DotNode|DotID] '--' target=[dot::DotNode|DotID] ('[' settings+=Setting (',' settings+=Setting)* ']')?
	//	';'?
	public UndirectedDotEdgeElements getUndirectedDotEdgeAccess() {
		return pUndirectedDotEdge;
	}
	
	public ParserRule getUndirectedDotEdgeRule() {
		return getUndirectedDotEdgeAccess().getRule();
	}

	//Setting dot::Setting:
	//	attribute=DotID '=' value=DotID
	public SettingElements getSettingAccess() {
		return pSetting;
	}
	
	public ParserRule getSettingRule() {
		return getSettingAccess().getRule();
	}

	//DotID:
	//	DOTSTRINGTERM | NUMPREFIXEDID | Number | ID // Number is a bit too coarse, but well...
	//;
	public DotIDElements getDotIDAccess() {
		return pDotID;
	}
	
	public ParserRule getDotIDRule() {
		return getDotIDAccess().getRule();
	}

	//terminal NUMPREFIXEDID:
	//	INT ID;
	public TerminalRule getNUMPREFIXEDIDRule() {
		return tNUMPREFIXEDID;
	} 

	//terminal DOTSTRINGTERM:
	//	'"' !'"'* '"';
	public TerminalRule getDOTSTRINGTERMRule() {
		return tDOTSTRINGTERM;
	} 

	//Number ecore::EDouble:
	//	'-'? (DOUBLE | INT)
	public NumberElements getNumberAccess() {
		return pNumber;
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}

	//terminal DOUBLE returns ecore::EDouble:
	//	INT+ '.' INT+;
	public TerminalRule getDOUBLERule() {
		return tDOUBLE;
	} 

	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
