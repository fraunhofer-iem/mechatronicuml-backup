/*
 * generated by Xtext
 */
grammar InternalOperatingSystemLanguage;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.muml.pm.software.oslanguage.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.muml.pm.software.oslanguage.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.muml.pm.software.oslanguage.xtext.services.OperatingSystemLanguageGrammarAccess;

}

@parser::members {

 	private OperatingSystemLanguageGrammarAccess grammarAccess;
 	
    public InternalOperatingSystemLanguageParser(TokenStream input, OperatingSystemLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "OperatingSystem";	
   	}
   	
   	@Override
   	protected OperatingSystemLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleOperatingSystem
entryRuleOperatingSystem returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOperatingSystemRule()); }
	 iv_ruleOperatingSystem=ruleOperatingSystem 
	 { $current=$iv_ruleOperatingSystem.current; } 
	 EOF 
;

// Rule OperatingSystem
ruleOperatingSystem returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getOperatingSystemAccess().getImportsImportParserRuleCall_0_0()); 
	    }
		lv_imports_0_0=ruleImport		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperatingSystemRule());
	        }
       		add(
       			$current, 
       			"imports",
        		lv_imports_0_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.Import");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_1='OperatingSystem:' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getOperatingSystemAccess().getOperatingSystemKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOperatingSystemAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperatingSystemRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getOperatingSystemAccess().getLeftCurlyBracketKeyword_3());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getOperatingSystemAccess().getApirepositoriesAPIRepositoryParserRuleCall_4_0_0()); 
	    }
		lv_apirepositories_4_0=ruleAPIRepository		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperatingSystemRule());
	        }
       		add(
       			$current, 
       			"apirepositories",
        		lv_apirepositories_4_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.APIRepository");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getOperatingSystemAccess().getEnumerationDataTypesEnumerationDataTypeParserRuleCall_4_1_0()); 
	    }
		lv_enumerationDataTypes_5_0=ruleEnumerationDataType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperatingSystemRule());
	        }
       		add(
       			$current, 
       			"enumerationDataTypes",
        		lv_enumerationDataTypes_5_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.EnumerationDataType");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getOperatingSystemAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	 iv_ruleImport=ruleImport 
	 { $current=$iv_ruleImport.current; } 
	 EOF 
;

// Rule Import
ruleImport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='import' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
    }
(
(
		lv_importURI_1_0=RULE_STRING
		{
			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImportRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"importURI",
        		lv_importURI_1_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
))
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleAPIRepository
entryRuleAPIRepository returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAPIRepositoryRule()); }
	 iv_ruleAPIRepository=ruleAPIRepository 
	 { $current=$iv_ruleAPIRepository.current; } 
	 EOF 
;

// Rule APIRepository
ruleAPIRepository returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Device_API_Calls:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAPIRepositoryAccess().getDevice_API_CallsKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAPIRepositoryAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAPIRepositoryRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAPIRepositoryAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAPIRepositoryAccess().getApiCommandsAPICommandParserRuleCall_3_0()); 
	    }
		lv_apiCommands_3_0=ruleAPICommand		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAPIRepositoryRule());
	        }
       		add(
       			$current, 
       			"apiCommands",
        		lv_apiCommands_3_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.APICommand");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAPIRepositoryAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleEnumerationDataType
entryRuleEnumerationDataType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEnumerationDataTypeRule()); }
	 iv_ruleEnumerationDataType=ruleEnumerationDataType 
	 { $current=$iv_ruleEnumerationDataType.current; } 
	 EOF 
;

// Rule EnumerationDataType
ruleEnumerationDataType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='enum:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEnumerationDataTypeAccess().getEnumKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEnumerationDataTypeAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnumerationDataTypeRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEnumerationDataTypeAccess().getLeftCurlyBracketKeyword_2());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getEnumerationDataTypeAccess().getEnumerationValuesEnumerationValueParserRuleCall_3_0_0()); 
	    }
		lv_enumerationValues_3_0=ruleEnumerationValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnumerationDataTypeRule());
	        }
       		add(
       			$current, 
       			"enumerationValues",
        		lv_enumerationValues_3_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.EnumerationValue");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEnumerationDataTypeAccess().getCommaKeyword_3_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEnumerationDataTypeAccess().getEnumerationValuesEnumerationValueParserRuleCall_3_1_1_0()); 
	    }
		lv_enumerationValues_5_0=ruleEnumerationValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnumerationDataTypeRule());
	        }
       		add(
       			$current, 
       			"enumerationValues",
        		lv_enumerationValues_5_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.EnumerationValue");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getEnumerationDataTypeAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleAPICommand
entryRuleAPICommand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAPICommandRule()); }
	 iv_ruleAPICommand=ruleAPICommand 
	 { $current=$iv_ruleAPICommand.current; } 
	 EOF 
;

// Rule APICommand
ruleAPICommand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAPICommandRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getAPICommandAccess().getReturnDataTypeDataTypeCrossReference_0_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAPICommandAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAPICommandRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAPICommandAccess().getLeftParenthesisKeyword_2());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getAPICommandAccess().getParametersParameterParserRuleCall_3_0_0()); 
	    }
		lv_parameters_3_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAPICommandRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_3_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAPICommandAccess().getCommaKeyword_3_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAPICommandAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
	    }
		lv_parameters_5_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAPICommandRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_5_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getAPICommandAccess().getRightParenthesisKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAPICommandAccess().getConstraintsTimeConstraintParserRuleCall_5_0()); 
	    }
		lv_constraints_7_0=ruleTimeConstraint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAPICommandRule());
	        }
       		add(
       			$current, 
       			"constraints",
        		lv_constraints_7_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.TimeConstraint");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getAPICommandAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	 iv_ruleParameter=ruleParameter 
	 { $current=$iv_ruleParameter.current; } 
	 EOF 
;

// Rule Parameter
ruleParameter returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameterRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getParameterAccess().getDataTypeDataTypeCrossReference_0_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleEnumerationValue
entryRuleEnumerationValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEnumerationValueRule()); }
	 iv_ruleEnumerationValue=ruleEnumerationValue 
	 { $current=$iv_ruleEnumerationValue.current; } 
	 EOF 
;

// Rule EnumerationValue
ruleEnumerationValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getEnumerationValueAccess().getValueEStringParserRuleCall_0()); 
	    }
		lv_value_0_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnumerationValueRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleTimeConstraint
entryRuleTimeConstraint returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTimeConstraintRule()); }
	 iv_ruleTimeConstraint=ruleTimeConstraint 
	 { $current=$iv_ruleTimeConstraint.current; } 
	 EOF 
;

// Rule TimeConstraint
ruleTimeConstraint returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='[' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTimeConstraintAccess().getLeftSquareBracketKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTimeConstraintAccess().getSamplingTimeTimeValueParserRuleCall_1_0()); 
	    }
		lv_samplingTime_1_0=ruleTimeValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTimeConstraintRule());
	        }
       		set(
       			$current, 
       			"samplingTime",
        		lv_samplingTime_1_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.TimeValue");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=']' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTimeConstraintAccess().getRightSquareBracketKeyword_2());
    }
)
;





// Entry rule entryRuleTimeValue
entryRuleTimeValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTimeValueRule()); }
	 iv_ruleTimeValue=ruleTimeValue 
	 { $current=$iv_ruleTimeValue.current; } 
	 EOF 
;

// Rule TimeValue
ruleTimeValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getTimeValueAccess().getValueLiteralExpressionParserRuleCall_0_0()); 
	    }
		lv_value_0_0=ruleLiteralExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTimeValueRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.LiteralExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getTimeValueAccess().getUnitTimeUnitExprParserRuleCall_1_0()); 
	    }
		lv_unit_1_0=ruleTimeUnitExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTimeValueRule());
	        }
       		set(
       			$current, 
       			"unit",
        		lv_unit_1_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.TimeUnitExpr");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleTimeUnitExpr
entryRuleTimeUnitExpr returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getTimeUnitExprRule()); } 
	 iv_ruleTimeUnitExpr=ruleTimeUnitExpr 
	 { $current=$iv_ruleTimeUnitExpr.current.getText(); }  
	 EOF 
;

// Rule TimeUnitExpr
ruleTimeUnitExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='DAYS' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getDAYSKeyword_0()); 
    }

    |
	kw='HOURS' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getHOURSKeyword_1()); 
    }

    |
	kw='MILLISECONDS' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getMILLISECONDSKeyword_2()); 
    }

    |
	kw='MINUTES' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getMINUTESKeyword_3()); 
    }

    |
	kw='SECONDS' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getSECONDSKeyword_4()); 
    }

    |
	kw='MICROSECONDS' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getMICROSECONDSKeyword_5()); 
    }

    |
	kw='NANOSECONDS' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getNANOSECONDSKeyword_6()); 
    }
)
    ;





// Entry rule entryRuleLiteralExpression
entryRuleLiteralExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLiteralExpressionRule()); }
	 iv_ruleLiteralExpression=ruleLiteralExpression 
	 { $current=$iv_ruleLiteralExpression.current; } 
	 EOF 
;

// Rule LiteralExpression
ruleLiteralExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getLiteralExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruleLiteral		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLiteralExpressionRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"org.muml.pm.software.oslanguage.xtext.OperatingSystemLanguage.Literal");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleLiteral
entryRuleLiteral returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getLiteralRule()); } 
	 iv_ruleLiteral=ruleLiteral 
	 { $current=$iv_ruleLiteral.current.getText(); }  
	 EOF 
;

// Rule Literal
ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_NUMBER_0=RULE_NUMBER    {
		$current.merge(this_NUMBER_0);
    }

    { 
    newLeafNode(this_NUMBER_0, grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0()); 
    }

    |    this_BOOLEAN_1=RULE_BOOLEAN    {
		$current.merge(this_BOOLEAN_1);
    }

    { 
    newLeafNode(this_BOOLEAN_1, grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_1()); 
    }

    |    this_INT_2=RULE_INT    {
		$current.merge(this_INT_2);
    }

    { 
    newLeafNode(this_INT_2, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 
    }

    |
	kw='null' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLiteralAccess().getNullKeyword_3()); 
    }
)
    ;





RULE_NUMBER : RULE_INT '.' RULE_INT;

RULE_BOOLEAN : ('true'|'false');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


