package de.uni_paderborn.uppaal.serializer;

import com.google.inject.Inject;
import de.uni_paderborn.uppaal.services.UppaalXMLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractUppaalXMLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected UppaalXMLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Edge_____ColorKeyword_16_0_5_2_0_EqualsSignKeyword_16_0_5_2_1_STRINGTerminalRuleCall_16_0_5_2_2___or___XKeyword_16_0_5_0_0_EqualsSignKeyword_16_0_5_0_1_STRINGTerminalRuleCall_16_0_5_0_2___or___YKeyword_16_0_5_1_0_EqualsSignKeyword_16_0_5_1_1_STRINGTerminalRuleCall_16_0_5_1_2____a;
	protected AbstractElementAlias match_Edge_____ColorKeyword_16_1_5_2_0_EqualsSignKeyword_16_1_5_2_1_STRINGTerminalRuleCall_16_1_5_2_2___or___XKeyword_16_1_5_0_0_EqualsSignKeyword_16_1_5_0_1_STRINGTerminalRuleCall_16_1_5_0_2___or___YKeyword_16_1_5_1_0_EqualsSignKeyword_16_1_5_1_1_STRINGTerminalRuleCall_16_1_5_1_2____a;
	protected AbstractElementAlias match_Edge_____ColorKeyword_16_2_5_2_0_EqualsSignKeyword_16_2_5_2_1_STRINGTerminalRuleCall_16_2_5_2_2___or___XKeyword_16_2_5_0_0_EqualsSignKeyword_16_2_5_0_1_STRINGTerminalRuleCall_16_2_5_0_2___or___YKeyword_16_2_5_1_0_EqualsSignKeyword_16_2_5_1_1_STRINGTerminalRuleCall_16_2_5_1_2____a;
	protected AbstractElementAlias match_Edge_____ColorKeyword_16_3_5_2_0_EqualsSignKeyword_16_3_5_2_1_STRINGTerminalRuleCall_16_3_5_2_2___or___XKeyword_16_3_5_0_0_EqualsSignKeyword_16_3_5_0_1_STRINGTerminalRuleCall_16_3_5_0_2___or___YKeyword_16_3_5_1_0_EqualsSignKeyword_16_3_5_1_1_STRINGTerminalRuleCall_16_3_5_1_2____a;
	protected AbstractElementAlias match_Edge_____ColorKeyword_16_4_5_2_0_EqualsSignKeyword_16_4_5_2_1_STRINGTerminalRuleCall_16_4_5_2_2___or___XKeyword_16_4_5_0_0_EqualsSignKeyword_16_4_5_0_1_STRINGTerminalRuleCall_16_4_5_0_2___or___YKeyword_16_4_5_1_0_EqualsSignKeyword_16_4_5_1_1_STRINGTerminalRuleCall_16_4_5_1_2____a;
	protected AbstractElementAlias match_Edge_____XKeyword_2_0_0_EqualsSignKeyword_2_0_1_STRINGTerminalRuleCall_2_0_2___or___YKeyword_2_1_0_EqualsSignKeyword_2_1_1_STRINGTerminalRuleCall_2_1_2____a;
	protected AbstractElementAlias match_Location_SolidusGreaterThanSignKeyword_3_0_or___GreaterThanSignKeyword_3_1_0_LessThanSignSolidusKeyword_3_1_4_LocationKeyword_3_1_5_GreaterThanSignKeyword_3_1_6__;
	protected AbstractElementAlias match_Location_____ColorKeyword_3_1_2_0_5_2_0_EqualsSignKeyword_3_1_2_0_5_2_1_STRINGTerminalRuleCall_3_1_2_0_5_2_2___or___XKeyword_3_1_2_0_5_0_0_EqualsSignKeyword_3_1_2_0_5_0_1_STRINGTerminalRuleCall_3_1_2_0_5_0_2___or___YKeyword_3_1_2_0_5_1_0_EqualsSignKeyword_3_1_2_0_5_1_1_STRINGTerminalRuleCall_3_1_2_0_5_1_2____a;
	protected AbstractElementAlias match_Location_____ColorKeyword_3_1_2_1_5_2_0_EqualsSignKeyword_3_1_2_1_5_2_1_STRINGTerminalRuleCall_3_1_2_1_5_2_2___or___XKeyword_3_1_2_1_5_0_0_EqualsSignKeyword_3_1_2_1_5_0_1_STRINGTerminalRuleCall_3_1_2_1_5_0_2___or___YKeyword_3_1_2_1_5_1_0_EqualsSignKeyword_3_1_2_1_5_1_1_STRINGTerminalRuleCall_3_1_2_1_5_1_2____a;
	protected AbstractElementAlias match_Location_____XKeyword_3_1_1_2_0_0_EqualsSignKeyword_3_1_1_2_0_1_STRINGTerminalRuleCall_3_1_1_2_0_2___or___YKeyword_3_1_1_2_1_0_EqualsSignKeyword_3_1_1_2_1_1_STRINGTerminalRuleCall_3_1_1_2_1_2____a;
	protected AbstractElementAlias match_NTA_XmlVersion10EncodingUtf8Keyword_0_0_or_XmlVersion10EncodingUtf8Keyword_0_1;
	protected AbstractElementAlias match_NTA___LessThanSignKeyword_5_0_ImportsKeyword_5_1_GreaterThanSignKeyword_5_2_ANY_TOKEN_BUT_XML_CLOSEParserRuleCall_5_3_a_LessThanSignSolidusKeyword_5_4_ImportsKeyword_5_5_GreaterThanSignKeyword_5_6__a;
	protected AbstractElementAlias match_NTA___LessThanSignKeyword_8_0_InstantiationKeyword_8_1_GreaterThanSignKeyword_8_2_ANY_TOKEN_BUT_XML_CLOSEParserRuleCall_8_3_a_LessThanSignSolidusKeyword_8_4_InstantiationKeyword_8_5_GreaterThanSignKeyword_8_6__q;
	protected AbstractElementAlias match_Template___LessThanSignKeyword_8_0_ParameterKeyword_8_1_GreaterThanSignKeyword_8_2_LessThanSignSolidusKeyword_8_4_ParameterKeyword_8_5_GreaterThanSignKeyword_8_6__q;
	protected AbstractElementAlias match_Template_____XKeyword_2_0_0_EqualsSignKeyword_2_0_1_STRINGTerminalRuleCall_2_0_2___or___YKeyword_2_1_0_EqualsSignKeyword_2_1_1_STRINGTerminalRuleCall_2_1_2____a;
	protected AbstractElementAlias match_TerminatingExpressions_LeftParenthesisKeyword_3_0_a;
	protected AbstractElementAlias match_TerminatingExpressions_LeftParenthesisKeyword_3_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (UppaalXMLGrammarAccess) access;
		match_Edge_____ColorKeyword_16_0_5_2_0_EqualsSignKeyword_16_0_5_2_1_STRINGTerminalRuleCall_16_0_5_2_2___or___XKeyword_16_0_5_0_0_EqualsSignKeyword_16_0_5_0_1_STRINGTerminalRuleCall_16_0_5_0_2___or___YKeyword_16_0_5_1_0_EqualsSignKeyword_16_0_5_1_1_STRINGTerminalRuleCall_16_0_5_1_2____a = new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getColorKeyword_16_0_5_2_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getEqualsSignKeyword_16_0_5_2_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getSTRINGTerminalRuleCall_16_0_5_2_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getXKeyword_16_0_5_0_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getEqualsSignKeyword_16_0_5_0_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getSTRINGTerminalRuleCall_16_0_5_0_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getYKeyword_16_0_5_1_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getEqualsSignKeyword_16_0_5_1_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getSTRINGTerminalRuleCall_16_0_5_1_2())));
		match_Edge_____ColorKeyword_16_1_5_2_0_EqualsSignKeyword_16_1_5_2_1_STRINGTerminalRuleCall_16_1_5_2_2___or___XKeyword_16_1_5_0_0_EqualsSignKeyword_16_1_5_0_1_STRINGTerminalRuleCall_16_1_5_0_2___or___YKeyword_16_1_5_1_0_EqualsSignKeyword_16_1_5_1_1_STRINGTerminalRuleCall_16_1_5_1_2____a = new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getColorKeyword_16_1_5_2_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getEqualsSignKeyword_16_1_5_2_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getSTRINGTerminalRuleCall_16_1_5_2_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getXKeyword_16_1_5_0_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getEqualsSignKeyword_16_1_5_0_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getSTRINGTerminalRuleCall_16_1_5_0_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getYKeyword_16_1_5_1_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getEqualsSignKeyword_16_1_5_1_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getSTRINGTerminalRuleCall_16_1_5_1_2())));
		match_Edge_____ColorKeyword_16_2_5_2_0_EqualsSignKeyword_16_2_5_2_1_STRINGTerminalRuleCall_16_2_5_2_2___or___XKeyword_16_2_5_0_0_EqualsSignKeyword_16_2_5_0_1_STRINGTerminalRuleCall_16_2_5_0_2___or___YKeyword_16_2_5_1_0_EqualsSignKeyword_16_2_5_1_1_STRINGTerminalRuleCall_16_2_5_1_2____a = new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getColorKeyword_16_2_5_2_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getEqualsSignKeyword_16_2_5_2_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getSTRINGTerminalRuleCall_16_2_5_2_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getXKeyword_16_2_5_0_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getEqualsSignKeyword_16_2_5_0_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getSTRINGTerminalRuleCall_16_2_5_0_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getYKeyword_16_2_5_1_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getEqualsSignKeyword_16_2_5_1_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getSTRINGTerminalRuleCall_16_2_5_1_2())));
		match_Edge_____ColorKeyword_16_3_5_2_0_EqualsSignKeyword_16_3_5_2_1_STRINGTerminalRuleCall_16_3_5_2_2___or___XKeyword_16_3_5_0_0_EqualsSignKeyword_16_3_5_0_1_STRINGTerminalRuleCall_16_3_5_0_2___or___YKeyword_16_3_5_1_0_EqualsSignKeyword_16_3_5_1_1_STRINGTerminalRuleCall_16_3_5_1_2____a = new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getColorKeyword_16_3_5_2_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getEqualsSignKeyword_16_3_5_2_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getSTRINGTerminalRuleCall_16_3_5_2_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getXKeyword_16_3_5_0_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getEqualsSignKeyword_16_3_5_0_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getSTRINGTerminalRuleCall_16_3_5_0_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getYKeyword_16_3_5_1_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getEqualsSignKeyword_16_3_5_1_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getSTRINGTerminalRuleCall_16_3_5_1_2())));
		match_Edge_____ColorKeyword_16_4_5_2_0_EqualsSignKeyword_16_4_5_2_1_STRINGTerminalRuleCall_16_4_5_2_2___or___XKeyword_16_4_5_0_0_EqualsSignKeyword_16_4_5_0_1_STRINGTerminalRuleCall_16_4_5_0_2___or___YKeyword_16_4_5_1_0_EqualsSignKeyword_16_4_5_1_1_STRINGTerminalRuleCall_16_4_5_1_2____a = new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getColorKeyword_16_4_5_2_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getEqualsSignKeyword_16_4_5_2_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getSTRINGTerminalRuleCall_16_4_5_2_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getXKeyword_16_4_5_0_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getEqualsSignKeyword_16_4_5_0_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getSTRINGTerminalRuleCall_16_4_5_0_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getYKeyword_16_4_5_1_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getEqualsSignKeyword_16_4_5_1_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getSTRINGTerminalRuleCall_16_4_5_1_2())));
		match_Edge_____XKeyword_2_0_0_EqualsSignKeyword_2_0_1_STRINGTerminalRuleCall_2_0_2___or___YKeyword_2_1_0_EqualsSignKeyword_2_1_1_STRINGTerminalRuleCall_2_1_2____a = new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getXKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getEqualsSignKeyword_2_0_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getSTRINGTerminalRuleCall_2_0_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEdgeAccess().getYKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getEqualsSignKeyword_2_1_1()), new TokenAlias(false, false, grammarAccess.getEdgeAccess().getSTRINGTerminalRuleCall_2_1_2())));
		match_Location_SolidusGreaterThanSignKeyword_3_0_or___GreaterThanSignKeyword_3_1_0_LessThanSignSolidusKeyword_3_1_4_LocationKeyword_3_1_5_GreaterThanSignKeyword_3_1_6__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLocationAccess().getGreaterThanSignKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getLessThanSignSolidusKeyword_3_1_4()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getLocationKeyword_3_1_5()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getGreaterThanSignKeyword_3_1_6())), new TokenAlias(false, false, grammarAccess.getLocationAccess().getSolidusGreaterThanSignKeyword_3_0()));
		match_Location_____ColorKeyword_3_1_2_0_5_2_0_EqualsSignKeyword_3_1_2_0_5_2_1_STRINGTerminalRuleCall_3_1_2_0_5_2_2___or___XKeyword_3_1_2_0_5_0_0_EqualsSignKeyword_3_1_2_0_5_0_1_STRINGTerminalRuleCall_3_1_2_0_5_0_2___or___YKeyword_3_1_2_0_5_1_0_EqualsSignKeyword_3_1_2_0_5_1_1_STRINGTerminalRuleCall_3_1_2_0_5_1_2____a = new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLocationAccess().getColorKeyword_3_1_2_0_5_2_0()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getEqualsSignKeyword_3_1_2_0_5_2_1()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getSTRINGTerminalRuleCall_3_1_2_0_5_2_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLocationAccess().getXKeyword_3_1_2_0_5_0_0()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getEqualsSignKeyword_3_1_2_0_5_0_1()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getSTRINGTerminalRuleCall_3_1_2_0_5_0_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLocationAccess().getYKeyword_3_1_2_0_5_1_0()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getEqualsSignKeyword_3_1_2_0_5_1_1()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getSTRINGTerminalRuleCall_3_1_2_0_5_1_2())));
		match_Location_____ColorKeyword_3_1_2_1_5_2_0_EqualsSignKeyword_3_1_2_1_5_2_1_STRINGTerminalRuleCall_3_1_2_1_5_2_2___or___XKeyword_3_1_2_1_5_0_0_EqualsSignKeyword_3_1_2_1_5_0_1_STRINGTerminalRuleCall_3_1_2_1_5_0_2___or___YKeyword_3_1_2_1_5_1_0_EqualsSignKeyword_3_1_2_1_5_1_1_STRINGTerminalRuleCall_3_1_2_1_5_1_2____a = new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLocationAccess().getColorKeyword_3_1_2_1_5_2_0()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getEqualsSignKeyword_3_1_2_1_5_2_1()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getSTRINGTerminalRuleCall_3_1_2_1_5_2_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLocationAccess().getXKeyword_3_1_2_1_5_0_0()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getEqualsSignKeyword_3_1_2_1_5_0_1()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getSTRINGTerminalRuleCall_3_1_2_1_5_0_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLocationAccess().getYKeyword_3_1_2_1_5_1_0()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getEqualsSignKeyword_3_1_2_1_5_1_1()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getSTRINGTerminalRuleCall_3_1_2_1_5_1_2())));
		match_Location_____XKeyword_3_1_1_2_0_0_EqualsSignKeyword_3_1_1_2_0_1_STRINGTerminalRuleCall_3_1_1_2_0_2___or___YKeyword_3_1_1_2_1_0_EqualsSignKeyword_3_1_1_2_1_1_STRINGTerminalRuleCall_3_1_1_2_1_2____a = new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLocationAccess().getXKeyword_3_1_1_2_0_0()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getEqualsSignKeyword_3_1_1_2_0_1()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getSTRINGTerminalRuleCall_3_1_1_2_0_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLocationAccess().getYKeyword_3_1_1_2_1_0()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getEqualsSignKeyword_3_1_1_2_1_1()), new TokenAlias(false, false, grammarAccess.getLocationAccess().getSTRINGTerminalRuleCall_3_1_1_2_1_2())));
		match_NTA_XmlVersion10EncodingUtf8Keyword_0_0_or_XmlVersion10EncodingUtf8Keyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNTAAccess().getXmlVersion10EncodingUtf8Keyword_0_0()), new TokenAlias(false, false, grammarAccess.getNTAAccess().getXmlVersion10EncodingUtf8Keyword_0_1()));
		match_NTA___LessThanSignKeyword_5_0_ImportsKeyword_5_1_GreaterThanSignKeyword_5_2_ANY_TOKEN_BUT_XML_CLOSEParserRuleCall_5_3_a_LessThanSignSolidusKeyword_5_4_ImportsKeyword_5_5_GreaterThanSignKeyword_5_6__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getNTAAccess().getLessThanSignKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getNTAAccess().getImportsKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getNTAAccess().getGreaterThanSignKeyword_5_2()), new TokenAlias(true, true, grammarAccess.getNTAAccess().getANY_TOKEN_BUT_XML_CLOSEParserRuleCall_5_3()), new TokenAlias(false, false, grammarAccess.getNTAAccess().getLessThanSignSolidusKeyword_5_4()), new TokenAlias(false, false, grammarAccess.getNTAAccess().getImportsKeyword_5_5()), new TokenAlias(false, false, grammarAccess.getNTAAccess().getGreaterThanSignKeyword_5_6()));
		match_NTA___LessThanSignKeyword_8_0_InstantiationKeyword_8_1_GreaterThanSignKeyword_8_2_ANY_TOKEN_BUT_XML_CLOSEParserRuleCall_8_3_a_LessThanSignSolidusKeyword_8_4_InstantiationKeyword_8_5_GreaterThanSignKeyword_8_6__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNTAAccess().getLessThanSignKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getNTAAccess().getInstantiationKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getNTAAccess().getGreaterThanSignKeyword_8_2()), new TokenAlias(true, true, grammarAccess.getNTAAccess().getANY_TOKEN_BUT_XML_CLOSEParserRuleCall_8_3()), new TokenAlias(false, false, grammarAccess.getNTAAccess().getLessThanSignSolidusKeyword_8_4()), new TokenAlias(false, false, grammarAccess.getNTAAccess().getInstantiationKeyword_8_5()), new TokenAlias(false, false, grammarAccess.getNTAAccess().getGreaterThanSignKeyword_8_6()));
		match_Template___LessThanSignKeyword_8_0_ParameterKeyword_8_1_GreaterThanSignKeyword_8_2_LessThanSignSolidusKeyword_8_4_ParameterKeyword_8_5_GreaterThanSignKeyword_8_6__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTemplateAccess().getLessThanSignKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getTemplateAccess().getParameterKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getTemplateAccess().getGreaterThanSignKeyword_8_2()), new TokenAlias(false, false, grammarAccess.getTemplateAccess().getLessThanSignSolidusKeyword_8_4()), new TokenAlias(false, false, grammarAccess.getTemplateAccess().getParameterKeyword_8_5()), new TokenAlias(false, false, grammarAccess.getTemplateAccess().getGreaterThanSignKeyword_8_6()));
		match_Template_____XKeyword_2_0_0_EqualsSignKeyword_2_0_1_STRINGTerminalRuleCall_2_0_2___or___YKeyword_2_1_0_EqualsSignKeyword_2_1_1_STRINGTerminalRuleCall_2_1_2____a = new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTemplateAccess().getXKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getTemplateAccess().getEqualsSignKeyword_2_0_1()), new TokenAlias(false, false, grammarAccess.getTemplateAccess().getSTRINGTerminalRuleCall_2_0_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTemplateAccess().getYKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getTemplateAccess().getEqualsSignKeyword_2_1_1()), new TokenAlias(false, false, grammarAccess.getTemplateAccess().getSTRINGTerminalRuleCall_2_1_2())));
		match_TerminatingExpressions_LeftParenthesisKeyword_3_0_a = new TokenAlias(true, true, grammarAccess.getTerminatingExpressionsAccess().getLeftParenthesisKeyword_3_0());
		match_TerminatingExpressions_LeftParenthesisKeyword_3_0_p = new TokenAlias(true, false, grammarAccess.getTerminatingExpressionsAccess().getLeftParenthesisKeyword_3_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getANY_TOKEN_BUT_XML_CLOSERule())
			return getANY_TOKEN_BUT_XML_CLOSEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ANY_TOKEN_BUT_XML_CLOSE:
	 * 	XML_KEYWORDS | XML_ATTRIBUTE_KEYWORDS | XML_STRUCTURE_KEYWORDS |
	 * 	UPPAAL_KEYWORDS | UPPAAL_STRUCTURE_KEYWORDS |
	 * 	STRING | ID | WS | ANY_OTHER | INT | SINGLE_LINE_COMMENT | MULTI_LINE_COMMENT
	 * ;
	 */
	protected String getANY_TOKEN_BUT_XML_CLOSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "imports";
	}
	
	/**
	 * terminal STRING:
	 * 	'"' ( '\\' . | !('\\'|'"') )* '"' |
	 * 	"'" ( '\\' . | !('\\'|"'") )* "'"
	 * ;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Edge_____ColorKeyword_16_0_5_2_0_EqualsSignKeyword_16_0_5_2_1_STRINGTerminalRuleCall_16_0_5_2_2___or___XKeyword_16_0_5_0_0_EqualsSignKeyword_16_0_5_0_1_STRINGTerminalRuleCall_16_0_5_0_2___or___YKeyword_16_0_5_1_0_EqualsSignKeyword_16_0_5_1_1_STRINGTerminalRuleCall_16_0_5_1_2____a.equals(syntax))
				emit_Edge_____ColorKeyword_16_0_5_2_0_EqualsSignKeyword_16_0_5_2_1_STRINGTerminalRuleCall_16_0_5_2_2___or___XKeyword_16_0_5_0_0_EqualsSignKeyword_16_0_5_0_1_STRINGTerminalRuleCall_16_0_5_0_2___or___YKeyword_16_0_5_1_0_EqualsSignKeyword_16_0_5_1_1_STRINGTerminalRuleCall_16_0_5_1_2____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Edge_____ColorKeyword_16_1_5_2_0_EqualsSignKeyword_16_1_5_2_1_STRINGTerminalRuleCall_16_1_5_2_2___or___XKeyword_16_1_5_0_0_EqualsSignKeyword_16_1_5_0_1_STRINGTerminalRuleCall_16_1_5_0_2___or___YKeyword_16_1_5_1_0_EqualsSignKeyword_16_1_5_1_1_STRINGTerminalRuleCall_16_1_5_1_2____a.equals(syntax))
				emit_Edge_____ColorKeyword_16_1_5_2_0_EqualsSignKeyword_16_1_5_2_1_STRINGTerminalRuleCall_16_1_5_2_2___or___XKeyword_16_1_5_0_0_EqualsSignKeyword_16_1_5_0_1_STRINGTerminalRuleCall_16_1_5_0_2___or___YKeyword_16_1_5_1_0_EqualsSignKeyword_16_1_5_1_1_STRINGTerminalRuleCall_16_1_5_1_2____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Edge_____ColorKeyword_16_2_5_2_0_EqualsSignKeyword_16_2_5_2_1_STRINGTerminalRuleCall_16_2_5_2_2___or___XKeyword_16_2_5_0_0_EqualsSignKeyword_16_2_5_0_1_STRINGTerminalRuleCall_16_2_5_0_2___or___YKeyword_16_2_5_1_0_EqualsSignKeyword_16_2_5_1_1_STRINGTerminalRuleCall_16_2_5_1_2____a.equals(syntax))
				emit_Edge_____ColorKeyword_16_2_5_2_0_EqualsSignKeyword_16_2_5_2_1_STRINGTerminalRuleCall_16_2_5_2_2___or___XKeyword_16_2_5_0_0_EqualsSignKeyword_16_2_5_0_1_STRINGTerminalRuleCall_16_2_5_0_2___or___YKeyword_16_2_5_1_0_EqualsSignKeyword_16_2_5_1_1_STRINGTerminalRuleCall_16_2_5_1_2____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Edge_____ColorKeyword_16_3_5_2_0_EqualsSignKeyword_16_3_5_2_1_STRINGTerminalRuleCall_16_3_5_2_2___or___XKeyword_16_3_5_0_0_EqualsSignKeyword_16_3_5_0_1_STRINGTerminalRuleCall_16_3_5_0_2___or___YKeyword_16_3_5_1_0_EqualsSignKeyword_16_3_5_1_1_STRINGTerminalRuleCall_16_3_5_1_2____a.equals(syntax))
				emit_Edge_____ColorKeyword_16_3_5_2_0_EqualsSignKeyword_16_3_5_2_1_STRINGTerminalRuleCall_16_3_5_2_2___or___XKeyword_16_3_5_0_0_EqualsSignKeyword_16_3_5_0_1_STRINGTerminalRuleCall_16_3_5_0_2___or___YKeyword_16_3_5_1_0_EqualsSignKeyword_16_3_5_1_1_STRINGTerminalRuleCall_16_3_5_1_2____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Edge_____ColorKeyword_16_4_5_2_0_EqualsSignKeyword_16_4_5_2_1_STRINGTerminalRuleCall_16_4_5_2_2___or___XKeyword_16_4_5_0_0_EqualsSignKeyword_16_4_5_0_1_STRINGTerminalRuleCall_16_4_5_0_2___or___YKeyword_16_4_5_1_0_EqualsSignKeyword_16_4_5_1_1_STRINGTerminalRuleCall_16_4_5_1_2____a.equals(syntax))
				emit_Edge_____ColorKeyword_16_4_5_2_0_EqualsSignKeyword_16_4_5_2_1_STRINGTerminalRuleCall_16_4_5_2_2___or___XKeyword_16_4_5_0_0_EqualsSignKeyword_16_4_5_0_1_STRINGTerminalRuleCall_16_4_5_0_2___or___YKeyword_16_4_5_1_0_EqualsSignKeyword_16_4_5_1_1_STRINGTerminalRuleCall_16_4_5_1_2____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Edge_____XKeyword_2_0_0_EqualsSignKeyword_2_0_1_STRINGTerminalRuleCall_2_0_2___or___YKeyword_2_1_0_EqualsSignKeyword_2_1_1_STRINGTerminalRuleCall_2_1_2____a.equals(syntax))
				emit_Edge_____XKeyword_2_0_0_EqualsSignKeyword_2_0_1_STRINGTerminalRuleCall_2_0_2___or___YKeyword_2_1_0_EqualsSignKeyword_2_1_1_STRINGTerminalRuleCall_2_1_2____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Location_SolidusGreaterThanSignKeyword_3_0_or___GreaterThanSignKeyword_3_1_0_LessThanSignSolidusKeyword_3_1_4_LocationKeyword_3_1_5_GreaterThanSignKeyword_3_1_6__.equals(syntax))
				emit_Location_SolidusGreaterThanSignKeyword_3_0_or___GreaterThanSignKeyword_3_1_0_LessThanSignSolidusKeyword_3_1_4_LocationKeyword_3_1_5_GreaterThanSignKeyword_3_1_6__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Location_____ColorKeyword_3_1_2_0_5_2_0_EqualsSignKeyword_3_1_2_0_5_2_1_STRINGTerminalRuleCall_3_1_2_0_5_2_2___or___XKeyword_3_1_2_0_5_0_0_EqualsSignKeyword_3_1_2_0_5_0_1_STRINGTerminalRuleCall_3_1_2_0_5_0_2___or___YKeyword_3_1_2_0_5_1_0_EqualsSignKeyword_3_1_2_0_5_1_1_STRINGTerminalRuleCall_3_1_2_0_5_1_2____a.equals(syntax))
				emit_Location_____ColorKeyword_3_1_2_0_5_2_0_EqualsSignKeyword_3_1_2_0_5_2_1_STRINGTerminalRuleCall_3_1_2_0_5_2_2___or___XKeyword_3_1_2_0_5_0_0_EqualsSignKeyword_3_1_2_0_5_0_1_STRINGTerminalRuleCall_3_1_2_0_5_0_2___or___YKeyword_3_1_2_0_5_1_0_EqualsSignKeyword_3_1_2_0_5_1_1_STRINGTerminalRuleCall_3_1_2_0_5_1_2____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Location_____ColorKeyword_3_1_2_1_5_2_0_EqualsSignKeyword_3_1_2_1_5_2_1_STRINGTerminalRuleCall_3_1_2_1_5_2_2___or___XKeyword_3_1_2_1_5_0_0_EqualsSignKeyword_3_1_2_1_5_0_1_STRINGTerminalRuleCall_3_1_2_1_5_0_2___or___YKeyword_3_1_2_1_5_1_0_EqualsSignKeyword_3_1_2_1_5_1_1_STRINGTerminalRuleCall_3_1_2_1_5_1_2____a.equals(syntax))
				emit_Location_____ColorKeyword_3_1_2_1_5_2_0_EqualsSignKeyword_3_1_2_1_5_2_1_STRINGTerminalRuleCall_3_1_2_1_5_2_2___or___XKeyword_3_1_2_1_5_0_0_EqualsSignKeyword_3_1_2_1_5_0_1_STRINGTerminalRuleCall_3_1_2_1_5_0_2___or___YKeyword_3_1_2_1_5_1_0_EqualsSignKeyword_3_1_2_1_5_1_1_STRINGTerminalRuleCall_3_1_2_1_5_1_2____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Location_____XKeyword_3_1_1_2_0_0_EqualsSignKeyword_3_1_1_2_0_1_STRINGTerminalRuleCall_3_1_1_2_0_2___or___YKeyword_3_1_1_2_1_0_EqualsSignKeyword_3_1_1_2_1_1_STRINGTerminalRuleCall_3_1_1_2_1_2____a.equals(syntax))
				emit_Location_____XKeyword_3_1_1_2_0_0_EqualsSignKeyword_3_1_1_2_0_1_STRINGTerminalRuleCall_3_1_1_2_0_2___or___YKeyword_3_1_1_2_1_0_EqualsSignKeyword_3_1_1_2_1_1_STRINGTerminalRuleCall_3_1_1_2_1_2____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NTA_XmlVersion10EncodingUtf8Keyword_0_0_or_XmlVersion10EncodingUtf8Keyword_0_1.equals(syntax))
				emit_NTA_XmlVersion10EncodingUtf8Keyword_0_0_or_XmlVersion10EncodingUtf8Keyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NTA___LessThanSignKeyword_5_0_ImportsKeyword_5_1_GreaterThanSignKeyword_5_2_ANY_TOKEN_BUT_XML_CLOSEParserRuleCall_5_3_a_LessThanSignSolidusKeyword_5_4_ImportsKeyword_5_5_GreaterThanSignKeyword_5_6__a.equals(syntax))
				emit_NTA___LessThanSignKeyword_5_0_ImportsKeyword_5_1_GreaterThanSignKeyword_5_2_ANY_TOKEN_BUT_XML_CLOSEParserRuleCall_5_3_a_LessThanSignSolidusKeyword_5_4_ImportsKeyword_5_5_GreaterThanSignKeyword_5_6__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NTA___LessThanSignKeyword_8_0_InstantiationKeyword_8_1_GreaterThanSignKeyword_8_2_ANY_TOKEN_BUT_XML_CLOSEParserRuleCall_8_3_a_LessThanSignSolidusKeyword_8_4_InstantiationKeyword_8_5_GreaterThanSignKeyword_8_6__q.equals(syntax))
				emit_NTA___LessThanSignKeyword_8_0_InstantiationKeyword_8_1_GreaterThanSignKeyword_8_2_ANY_TOKEN_BUT_XML_CLOSEParserRuleCall_8_3_a_LessThanSignSolidusKeyword_8_4_InstantiationKeyword_8_5_GreaterThanSignKeyword_8_6__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Template___LessThanSignKeyword_8_0_ParameterKeyword_8_1_GreaterThanSignKeyword_8_2_LessThanSignSolidusKeyword_8_4_ParameterKeyword_8_5_GreaterThanSignKeyword_8_6__q.equals(syntax))
				emit_Template___LessThanSignKeyword_8_0_ParameterKeyword_8_1_GreaterThanSignKeyword_8_2_LessThanSignSolidusKeyword_8_4_ParameterKeyword_8_5_GreaterThanSignKeyword_8_6__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Template_____XKeyword_2_0_0_EqualsSignKeyword_2_0_1_STRINGTerminalRuleCall_2_0_2___or___YKeyword_2_1_0_EqualsSignKeyword_2_1_1_STRINGTerminalRuleCall_2_1_2____a.equals(syntax))
				emit_Template_____XKeyword_2_0_0_EqualsSignKeyword_2_0_1_STRINGTerminalRuleCall_2_0_2___or___YKeyword_2_1_0_EqualsSignKeyword_2_1_1_STRINGTerminalRuleCall_2_1_2____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TerminatingExpressions_LeftParenthesisKeyword_3_0_a.equals(syntax))
				emit_TerminatingExpressions_LeftParenthesisKeyword_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TerminatingExpressions_LeftParenthesisKeyword_3_0_p.equals(syntax))
				emit_TerminatingExpressions_LeftParenthesisKeyword_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (('x' '=' STRING) | ('y' '=' STRING) | ('color' '=' STRING))*
	 */
	protected void emit_Edge_____ColorKeyword_16_0_5_2_0_EqualsSignKeyword_16_0_5_2_1_STRINGTerminalRuleCall_16_0_5_2_2___or___XKeyword_16_0_5_0_0_EqualsSignKeyword_16_0_5_0_1_STRINGTerminalRuleCall_16_0_5_0_2___or___YKeyword_16_0_5_1_0_EqualsSignKeyword_16_0_5_1_1_STRINGTerminalRuleCall_16_0_5_1_2____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('x' '=' STRING) | ('y' '=' STRING) | ('color' '=' STRING))*
	 */
	protected void emit_Edge_____ColorKeyword_16_1_5_2_0_EqualsSignKeyword_16_1_5_2_1_STRINGTerminalRuleCall_16_1_5_2_2___or___XKeyword_16_1_5_0_0_EqualsSignKeyword_16_1_5_0_1_STRINGTerminalRuleCall_16_1_5_0_2___or___YKeyword_16_1_5_1_0_EqualsSignKeyword_16_1_5_1_1_STRINGTerminalRuleCall_16_1_5_1_2____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('x' '=' STRING) | ('y' '=' STRING) | ('color' '=' STRING))*
	 */
	protected void emit_Edge_____ColorKeyword_16_2_5_2_0_EqualsSignKeyword_16_2_5_2_1_STRINGTerminalRuleCall_16_2_5_2_2___or___XKeyword_16_2_5_0_0_EqualsSignKeyword_16_2_5_0_1_STRINGTerminalRuleCall_16_2_5_0_2___or___YKeyword_16_2_5_1_0_EqualsSignKeyword_16_2_5_1_1_STRINGTerminalRuleCall_16_2_5_1_2____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('x' '=' STRING) | ('y' '=' STRING) | ('color' '=' STRING))*
	 */
	protected void emit_Edge_____ColorKeyword_16_3_5_2_0_EqualsSignKeyword_16_3_5_2_1_STRINGTerminalRuleCall_16_3_5_2_2___or___XKeyword_16_3_5_0_0_EqualsSignKeyword_16_3_5_0_1_STRINGTerminalRuleCall_16_3_5_0_2___or___YKeyword_16_3_5_1_0_EqualsSignKeyword_16_3_5_1_1_STRINGTerminalRuleCall_16_3_5_1_2____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('x' '=' STRING) | ('y' '=' STRING) | ('color' '=' STRING))*
	 */
	protected void emit_Edge_____ColorKeyword_16_4_5_2_0_EqualsSignKeyword_16_4_5_2_1_STRINGTerminalRuleCall_16_4_5_2_2___or___XKeyword_16_4_5_0_0_EqualsSignKeyword_16_4_5_0_1_STRINGTerminalRuleCall_16_4_5_0_2___or___YKeyword_16_4_5_1_0_EqualsSignKeyword_16_4_5_1_1_STRINGTerminalRuleCall_16_4_5_1_2____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('x' '=' STRING) | ('y' '=' STRING))*
	 */
	protected void emit_Edge_____XKeyword_2_0_0_EqualsSignKeyword_2_0_1_STRINGTerminalRuleCall_2_0_2___or___YKeyword_2_1_0_EqualsSignKeyword_2_1_1_STRINGTerminalRuleCall_2_1_2____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '/>' | ('>' '</' 'location' '>')
	 */
	protected void emit_Location_SolidusGreaterThanSignKeyword_3_0_or___GreaterThanSignKeyword_3_1_0_LessThanSignSolidusKeyword_3_1_4_LocationKeyword_3_1_5_GreaterThanSignKeyword_3_1_6__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('x' '=' STRING) | ('y' '=' STRING) | ('color' '=' STRING))*
	 */
	protected void emit_Location_____ColorKeyword_3_1_2_0_5_2_0_EqualsSignKeyword_3_1_2_0_5_2_1_STRINGTerminalRuleCall_3_1_2_0_5_2_2___or___XKeyword_3_1_2_0_5_0_0_EqualsSignKeyword_3_1_2_0_5_0_1_STRINGTerminalRuleCall_3_1_2_0_5_0_2___or___YKeyword_3_1_2_0_5_1_0_EqualsSignKeyword_3_1_2_0_5_1_1_STRINGTerminalRuleCall_3_1_2_0_5_1_2____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('x' '=' STRING) | ('y' '=' STRING) | ('color' '=' STRING))*
	 */
	protected void emit_Location_____ColorKeyword_3_1_2_1_5_2_0_EqualsSignKeyword_3_1_2_1_5_2_1_STRINGTerminalRuleCall_3_1_2_1_5_2_2___or___XKeyword_3_1_2_1_5_0_0_EqualsSignKeyword_3_1_2_1_5_0_1_STRINGTerminalRuleCall_3_1_2_1_5_0_2___or___YKeyword_3_1_2_1_5_1_0_EqualsSignKeyword_3_1_2_1_5_1_1_STRINGTerminalRuleCall_3_1_2_1_5_1_2____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('x' '=' STRING) | ('y' '=' STRING))*
	 */
	protected void emit_Location_____XKeyword_3_1_1_2_0_0_EqualsSignKeyword_3_1_1_2_0_1_STRINGTerminalRuleCall_3_1_1_2_0_2___or___YKeyword_3_1_1_2_1_0_EqualsSignKeyword_3_1_1_2_1_1_STRINGTerminalRuleCall_3_1_1_2_1_2____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '<?xml version="1.0" encoding="utf-8"?>' | '<?xml version='1.0' encoding='utf-8'?>'
	 */
	protected void emit_NTA_XmlVersion10EncodingUtf8Keyword_0_0_or_XmlVersion10EncodingUtf8Keyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     '<' 
	     'imports' 
	     '>' 
	     ANY_TOKEN_BUT_XML_CLOSE* 
	     '</' 
	     'imports' 
	     '>'
	 )*
	 */
	protected void emit_NTA___LessThanSignKeyword_5_0_ImportsKeyword_5_1_GreaterThanSignKeyword_5_2_ANY_TOKEN_BUT_XML_CLOSEParserRuleCall_5_3_a_LessThanSignSolidusKeyword_5_4_ImportsKeyword_5_5_GreaterThanSignKeyword_5_6__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     '<' 
	     'instantiation' 
	     '>' 
	     ANY_TOKEN_BUT_XML_CLOSE* 
	     '</' 
	     'instantiation' 
	     '>'
	 )?
	 */
	protected void emit_NTA___LessThanSignKeyword_8_0_InstantiationKeyword_8_1_GreaterThanSignKeyword_8_2_ANY_TOKEN_BUT_XML_CLOSEParserRuleCall_8_3_a_LessThanSignSolidusKeyword_8_4_InstantiationKeyword_8_5_GreaterThanSignKeyword_8_6__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     '<' 
	     'parameter' 
	     '>' 
	     '</' 
	     'parameter' 
	     '>'
	 )?
	 */
	protected void emit_Template___LessThanSignKeyword_8_0_ParameterKeyword_8_1_GreaterThanSignKeyword_8_2_LessThanSignSolidusKeyword_8_4_ParameterKeyword_8_5_GreaterThanSignKeyword_8_6__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('x' '=' STRING) | ('y' '=' STRING))*
	 */
	protected void emit_Template_____XKeyword_2_0_0_EqualsSignKeyword_2_0_1_STRINGTerminalRuleCall_2_0_2___or___YKeyword_2_1_0_EqualsSignKeyword_2_1_1_STRINGTerminalRuleCall_2_1_2____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_TerminatingExpressions_LeftParenthesisKeyword_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_TerminatingExpressions_LeftParenthesisKeyword_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
