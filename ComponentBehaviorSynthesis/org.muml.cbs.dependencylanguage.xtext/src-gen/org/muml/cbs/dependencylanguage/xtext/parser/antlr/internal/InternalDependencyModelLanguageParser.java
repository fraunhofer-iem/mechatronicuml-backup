package org.muml.cbs.dependencylanguage.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.muml.cbs.dependencylanguage.xtext.services.DependencyModelLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDependencyModelLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_NUMBER", "RULE_BOOLEAN", "RULE_MAXKEYWORD", "RULE_WS", "RULE_ANY_OTHER", "';'", "'synchronize'", "','", "'with'", "'using'", "'['", "']'", "'of type'", "'forbid state combination'", "'bound states'", "'by'", "'on'", "'{'", "'}'", "'if'", "'enable'", "'disable'", "'assign'", "'reset clocks'", "'and'", "'merge variable'", "'into variable'", "'merge variables'", "'into hybridport'", "'merge clocks'", "'into'", "'.'", "'transition'", "'combination'", "'('", "')'", "'when counted'", "'times'", "'delayed by'", "'state combination'", "'between'", "'INIT'", "'INFINITE'", "'clock'", "'-'", "'null'", "'for'", "'while'", "'do'", "');'", "'else'", "'elseif'", "'return'", "':='", "'const'", "'<'", "'>'", "'DAYS'", "'HOURS'", "'MILLISECONDS'", "'MINUTES'", "'SECONDS'", "'MICROSECONDS'", "'NANOSECONDS'", "'->'", "'or'", "'=='", "'<>'", "'<='", "'>='", "'since exactly'", "'strictly short than'", "'shorter than'", "'strictly longer than'", "'longer than'", "'entering state'", "'leaving state'", "'is active'", "'is inactive'", "'consuming'", "'sending'", "'++'", "'--'", "'+='", "'-='", "'||'", "'&&'", "'+'", "'*'", "'/'", "'%'", "'not'", "'self'", "'first'", "'last'", "'prev'", "'next'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_INT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=4;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int RULE_MAXKEYWORD=11;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_NUMBER=9;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalDependencyModelLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDependencyModelLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDependencyModelLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDependencyModelLanguage.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private DependencyModelLanguageGrammarAccess grammarAccess;
     	
        public InternalDependencyModelLanguageParser(TokenStream input, DependencyModelLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DependencyModel";	
       	}
       	
       	@Override
       	protected DependencyModelLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDependencyModel"
    // InternalDependencyModelLanguage.g:74:1: entryRuleDependencyModel returns [EObject current=null] : iv_ruleDependencyModel= ruleDependencyModel EOF ;
    public final EObject entryRuleDependencyModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyModel = null;


        try {
            // InternalDependencyModelLanguage.g:75:2: (iv_ruleDependencyModel= ruleDependencyModel EOF )
            // InternalDependencyModelLanguage.g:76:2: iv_ruleDependencyModel= ruleDependencyModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDependencyModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDependencyModel=ruleDependencyModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDependencyModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependencyModel"


    // $ANTLR start "ruleDependencyModel"
    // InternalDependencyModelLanguage.g:83:1: ruleDependencyModel returns [EObject current=null] : ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( ( (lv_dependencies_2_0= ruleDependency ) ) ( (lv_dependencies_3_0= ruleDependency ) )* )? ) ;
    public final EObject ruleDependencyModel() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_1=null;
        Token lv_comment_1_2=null;
        EObject lv_dependencies_2_0 = null;

        EObject lv_dependencies_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:86:28: ( ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( ( (lv_dependencies_2_0= ruleDependency ) ) ( (lv_dependencies_3_0= ruleDependency ) )* )? ) )
            // InternalDependencyModelLanguage.g:87:1: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( ( (lv_dependencies_2_0= ruleDependency ) ) ( (lv_dependencies_3_0= ruleDependency ) )* )? )
            {
            // InternalDependencyModelLanguage.g:87:1: ( () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( ( (lv_dependencies_2_0= ruleDependency ) ) ( (lv_dependencies_3_0= ruleDependency ) )* )? )
            // InternalDependencyModelLanguage.g:87:2: () ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )? ( ( (lv_dependencies_2_0= ruleDependency ) ) ( (lv_dependencies_3_0= ruleDependency ) )* )?
            {
            // InternalDependencyModelLanguage.g:87:2: ()
            // InternalDependencyModelLanguage.g:88:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDependencyModelAccess().getDependencyModelAction_0(),
                          current);
                  
            }

            }

            // InternalDependencyModelLanguage.g:96:2: ( ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ML_COMMENT && LA2_0<=RULE_SL_COMMENT)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDependencyModelLanguage.g:97:1: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    {
                    // InternalDependencyModelLanguage.g:97:1: ( (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT ) )
                    // InternalDependencyModelLanguage.g:98:1: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    {
                    // InternalDependencyModelLanguage.g:98:1: (lv_comment_1_1= RULE_ML_COMMENT | lv_comment_1_2= RULE_SL_COMMENT )
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==RULE_ML_COMMENT) ) {
                        alt1=1;
                    }
                    else if ( (LA1_0==RULE_SL_COMMENT) ) {
                        alt1=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalDependencyModelLanguage.g:99:3: lv_comment_1_1= RULE_ML_COMMENT
                            {
                            lv_comment_1_1=(Token)match(input,RULE_ML_COMMENT,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_comment_1_1, grammarAccess.getDependencyModelAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getDependencyModelRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"comment",
                                      		lv_comment_1_1, 
                                      		"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalDependencyModelLanguage.g:114:8: lv_comment_1_2= RULE_SL_COMMENT
                            {
                            lv_comment_1_2=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_comment_1_2, grammarAccess.getDependencyModelAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getDependencyModelRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"comment",
                                      		lv_comment_1_2, 
                                      		"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalDependencyModelLanguage.g:132:3: ( ( (lv_dependencies_2_0= ruleDependency ) ) ( (lv_dependencies_3_0= ruleDependency ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15||(LA4_0>=22 && LA4_0<=23)||LA4_0==25||LA4_0==28||LA4_0==34||LA4_0==36||LA4_0==38) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDependencyModelLanguage.g:132:4: ( (lv_dependencies_2_0= ruleDependency ) ) ( (lv_dependencies_3_0= ruleDependency ) )*
                    {
                    // InternalDependencyModelLanguage.g:132:4: ( (lv_dependencies_2_0= ruleDependency ) )
                    // InternalDependencyModelLanguage.g:133:1: (lv_dependencies_2_0= ruleDependency )
                    {
                    // InternalDependencyModelLanguage.g:133:1: (lv_dependencies_2_0= ruleDependency )
                    // InternalDependencyModelLanguage.g:134:3: lv_dependencies_2_0= ruleDependency
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDependencyModelAccess().getDependenciesDependencyParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_3);
                    lv_dependencies_2_0=ruleDependency();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDependencyModelRule());
                      	        }
                             		add(
                             			current, 
                             			"dependencies",
                              		lv_dependencies_2_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.Dependency");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:150:2: ( (lv_dependencies_3_0= ruleDependency ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15||(LA3_0>=22 && LA3_0<=23)||LA3_0==25||LA3_0==28||LA3_0==34||LA3_0==36||LA3_0==38) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDependencyModelLanguage.g:151:1: (lv_dependencies_3_0= ruleDependency )
                    	    {
                    	    // InternalDependencyModelLanguage.g:151:1: (lv_dependencies_3_0= ruleDependency )
                    	    // InternalDependencyModelLanguage.g:152:3: lv_dependencies_3_0= ruleDependency
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDependencyModelAccess().getDependenciesDependencyParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_3);
                    	    lv_dependencies_3_0=ruleDependency();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDependencyModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"dependencies",
                    	              		lv_dependencies_3_0, 
                    	              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.Dependency");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependencyModel"


    // $ANTLR start "entryRuleDependency"
    // InternalDependencyModelLanguage.g:176:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalDependencyModelLanguage.g:177:2: (iv_ruleDependency= ruleDependency EOF )
            // InternalDependencyModelLanguage.g:178:2: iv_ruleDependency= ruleDependency EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDependencyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDependency; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalDependencyModelLanguage.g:185:1: ruleDependency returns [EObject current=null] : ( ( (this_Synchronization_0= ruleSynchronization otherlv_1= ';' ) | (this_ForbiddenStateCombination_2= ruleForbiddenStateCombination otherlv_3= ';' ) | this_ConditionalDependency_4= ruleConditionalDependency | this_TriggerMessage_5= ruleTriggerMessage | (this_BoundedActiveState_6= ruleBoundedActiveState otherlv_7= ';' ) | (this_DataMerge_8= ruleDataMerge otherlv_9= ';' ) | (this_ClockMerge_10= ruleClockMerge otherlv_11= ';' ) ) ( ( (lv_comment_12_1= RULE_ML_COMMENT | lv_comment_12_2= RULE_SL_COMMENT ) ) )? ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_comment_12_1=null;
        Token lv_comment_12_2=null;
        EObject this_Synchronization_0 = null;

        EObject this_ForbiddenStateCombination_2 = null;

        EObject this_ConditionalDependency_4 = null;

        EObject this_TriggerMessage_5 = null;

        EObject this_BoundedActiveState_6 = null;

        EObject this_DataMerge_8 = null;

        EObject this_ClockMerge_10 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:188:28: ( ( ( (this_Synchronization_0= ruleSynchronization otherlv_1= ';' ) | (this_ForbiddenStateCombination_2= ruleForbiddenStateCombination otherlv_3= ';' ) | this_ConditionalDependency_4= ruleConditionalDependency | this_TriggerMessage_5= ruleTriggerMessage | (this_BoundedActiveState_6= ruleBoundedActiveState otherlv_7= ';' ) | (this_DataMerge_8= ruleDataMerge otherlv_9= ';' ) | (this_ClockMerge_10= ruleClockMerge otherlv_11= ';' ) ) ( ( (lv_comment_12_1= RULE_ML_COMMENT | lv_comment_12_2= RULE_SL_COMMENT ) ) )? ) )
            // InternalDependencyModelLanguage.g:189:1: ( ( (this_Synchronization_0= ruleSynchronization otherlv_1= ';' ) | (this_ForbiddenStateCombination_2= ruleForbiddenStateCombination otherlv_3= ';' ) | this_ConditionalDependency_4= ruleConditionalDependency | this_TriggerMessage_5= ruleTriggerMessage | (this_BoundedActiveState_6= ruleBoundedActiveState otherlv_7= ';' ) | (this_DataMerge_8= ruleDataMerge otherlv_9= ';' ) | (this_ClockMerge_10= ruleClockMerge otherlv_11= ';' ) ) ( ( (lv_comment_12_1= RULE_ML_COMMENT | lv_comment_12_2= RULE_SL_COMMENT ) ) )? )
            {
            // InternalDependencyModelLanguage.g:189:1: ( ( (this_Synchronization_0= ruleSynchronization otherlv_1= ';' ) | (this_ForbiddenStateCombination_2= ruleForbiddenStateCombination otherlv_3= ';' ) | this_ConditionalDependency_4= ruleConditionalDependency | this_TriggerMessage_5= ruleTriggerMessage | (this_BoundedActiveState_6= ruleBoundedActiveState otherlv_7= ';' ) | (this_DataMerge_8= ruleDataMerge otherlv_9= ';' ) | (this_ClockMerge_10= ruleClockMerge otherlv_11= ';' ) ) ( ( (lv_comment_12_1= RULE_ML_COMMENT | lv_comment_12_2= RULE_SL_COMMENT ) ) )? )
            // InternalDependencyModelLanguage.g:189:2: ( (this_Synchronization_0= ruleSynchronization otherlv_1= ';' ) | (this_ForbiddenStateCombination_2= ruleForbiddenStateCombination otherlv_3= ';' ) | this_ConditionalDependency_4= ruleConditionalDependency | this_TriggerMessage_5= ruleTriggerMessage | (this_BoundedActiveState_6= ruleBoundedActiveState otherlv_7= ';' ) | (this_DataMerge_8= ruleDataMerge otherlv_9= ';' ) | (this_ClockMerge_10= ruleClockMerge otherlv_11= ';' ) ) ( ( (lv_comment_12_1= RULE_ML_COMMENT | lv_comment_12_2= RULE_SL_COMMENT ) ) )?
            {
            // InternalDependencyModelLanguage.g:189:2: ( (this_Synchronization_0= ruleSynchronization otherlv_1= ';' ) | (this_ForbiddenStateCombination_2= ruleForbiddenStateCombination otherlv_3= ';' ) | this_ConditionalDependency_4= ruleConditionalDependency | this_TriggerMessage_5= ruleTriggerMessage | (this_BoundedActiveState_6= ruleBoundedActiveState otherlv_7= ';' ) | (this_DataMerge_8= ruleDataMerge otherlv_9= ';' ) | (this_ClockMerge_10= ruleClockMerge otherlv_11= ';' ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            case 23:
                {
                alt5=5;
                }
                break;
            case 34:
            case 36:
                {
                alt5=6;
                }
                break;
            case 38:
                {
                alt5=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDependencyModelLanguage.g:189:3: (this_Synchronization_0= ruleSynchronization otherlv_1= ';' )
                    {
                    // InternalDependencyModelLanguage.g:189:3: (this_Synchronization_0= ruleSynchronization otherlv_1= ';' )
                    // InternalDependencyModelLanguage.g:190:2: this_Synchronization_0= ruleSynchronization otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDependencyAccess().getSynchronizationParserRuleCall_0_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    this_Synchronization_0=ruleSynchronization();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Synchronization_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getSemicolonKeyword_0_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:206:6: (this_ForbiddenStateCombination_2= ruleForbiddenStateCombination otherlv_3= ';' )
                    {
                    // InternalDependencyModelLanguage.g:206:6: (this_ForbiddenStateCombination_2= ruleForbiddenStateCombination otherlv_3= ';' )
                    // InternalDependencyModelLanguage.g:207:2: this_ForbiddenStateCombination_2= ruleForbiddenStateCombination otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDependencyAccess().getForbiddenStateCombinationParserRuleCall_0_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    this_ForbiddenStateCombination_2=ruleForbiddenStateCombination();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ForbiddenStateCombination_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDependencyAccess().getSemicolonKeyword_0_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:224:2: this_ConditionalDependency_4= ruleConditionalDependency
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDependencyAccess().getConditionalDependencyParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    this_ConditionalDependency_4=ruleConditionalDependency();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConditionalDependency_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalDependencyModelLanguage.g:237:2: this_TriggerMessage_5= ruleTriggerMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDependencyAccess().getTriggerMessageParserRuleCall_0_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    this_TriggerMessage_5=ruleTriggerMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TriggerMessage_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalDependencyModelLanguage.g:249:6: (this_BoundedActiveState_6= ruleBoundedActiveState otherlv_7= ';' )
                    {
                    // InternalDependencyModelLanguage.g:249:6: (this_BoundedActiveState_6= ruleBoundedActiveState otherlv_7= ';' )
                    // InternalDependencyModelLanguage.g:250:2: this_BoundedActiveState_6= ruleBoundedActiveState otherlv_7= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDependencyAccess().getBoundedActiveStateParserRuleCall_0_4_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    this_BoundedActiveState_6=ruleBoundedActiveState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoundedActiveState_6; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDependencyAccess().getSemicolonKeyword_0_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDependencyModelLanguage.g:266:6: (this_DataMerge_8= ruleDataMerge otherlv_9= ';' )
                    {
                    // InternalDependencyModelLanguage.g:266:6: (this_DataMerge_8= ruleDataMerge otherlv_9= ';' )
                    // InternalDependencyModelLanguage.g:267:2: this_DataMerge_8= ruleDataMerge otherlv_9= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDependencyAccess().getDataMergeParserRuleCall_0_5_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    this_DataMerge_8=ruleDataMerge();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataMerge_8; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getDependencyAccess().getSemicolonKeyword_0_5_1());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDependencyModelLanguage.g:283:6: (this_ClockMerge_10= ruleClockMerge otherlv_11= ';' )
                    {
                    // InternalDependencyModelLanguage.g:283:6: (this_ClockMerge_10= ruleClockMerge otherlv_11= ';' )
                    // InternalDependencyModelLanguage.g:284:2: this_ClockMerge_10= ruleClockMerge otherlv_11= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDependencyAccess().getClockMergeParserRuleCall_0_6_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    this_ClockMerge_10=ruleClockMerge();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClockMerge_10; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getDependencyAccess().getSemicolonKeyword_0_6_1());
                          
                    }

                    }


                    }
                    break;

            }

            // InternalDependencyModelLanguage.g:299:3: ( ( (lv_comment_12_1= RULE_ML_COMMENT | lv_comment_12_2= RULE_SL_COMMENT ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ML_COMMENT && LA7_0<=RULE_SL_COMMENT)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDependencyModelLanguage.g:300:1: ( (lv_comment_12_1= RULE_ML_COMMENT | lv_comment_12_2= RULE_SL_COMMENT ) )
                    {
                    // InternalDependencyModelLanguage.g:300:1: ( (lv_comment_12_1= RULE_ML_COMMENT | lv_comment_12_2= RULE_SL_COMMENT ) )
                    // InternalDependencyModelLanguage.g:301:1: (lv_comment_12_1= RULE_ML_COMMENT | lv_comment_12_2= RULE_SL_COMMENT )
                    {
                    // InternalDependencyModelLanguage.g:301:1: (lv_comment_12_1= RULE_ML_COMMENT | lv_comment_12_2= RULE_SL_COMMENT )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ML_COMMENT) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==RULE_SL_COMMENT) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalDependencyModelLanguage.g:302:3: lv_comment_12_1= RULE_ML_COMMENT
                            {
                            lv_comment_12_1=(Token)match(input,RULE_ML_COMMENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_comment_12_1, grammarAccess.getDependencyAccess().getCommentML_COMMENTTerminalRuleCall_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getDependencyRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"comment",
                                      		lv_comment_12_1, 
                                      		"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalDependencyModelLanguage.g:317:8: lv_comment_12_2= RULE_SL_COMMENT
                            {
                            lv_comment_12_2=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_comment_12_2, grammarAccess.getDependencyAccess().getCommentSL_COMMENTTerminalRuleCall_1_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getDependencyRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"comment",
                                      		lv_comment_12_2, 
                                      		"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleSynchronization"
    // InternalDependencyModelLanguage.g:343:1: entryRuleSynchronization returns [EObject current=null] : iv_ruleSynchronization= ruleSynchronization EOF ;
    public final EObject entryRuleSynchronization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSynchronization = null;


        try {
            // InternalDependencyModelLanguage.g:344:2: (iv_ruleSynchronization= ruleSynchronization EOF )
            // InternalDependencyModelLanguage.g:345:2: iv_ruleSynchronization= ruleSynchronization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSynchronizationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSynchronization=ruleSynchronization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSynchronization; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSynchronization"


    // $ANTLR start "ruleSynchronization"
    // InternalDependencyModelLanguage.g:352:1: ruleSynchronization returns [EObject current=null] : ( ( (otherlv_0= 'synchronize' ( (lv_sendingEvents_1_0= ruleEvent ) ) (otherlv_2= ',' ( (lv_sendingEvents_3_0= ruleEvent ) ) )* otherlv_4= 'with' ( (lv_receivingEvents_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_receivingEvents_7_0= ruleEvent ) ) )* ) | (otherlv_8= 'synchronize' ( (lv_sendingEvents_9_0= ruleSynchronizationEvent ) ) (otherlv_10= ',' ( (lv_sendingEvents_11_0= ruleSynchronizationEvent ) ) )* otherlv_12= 'with' ( (lv_receivingEvents_13_0= ruleSynchronizationEvent ) ) (otherlv_14= ',' ( (lv_receivingEvents_15_0= ruleSynchronizationEvent ) ) )* ) ) (otherlv_16= 'using' ( (lv_channelName_17_0= ruleEString ) ) )? (otherlv_18= '[' ( (lv_generalSelectorExpression_19_0= ruleExpression ) ) otherlv_20= ']' otherlv_21= 'of type' ( (otherlv_22= RULE_ID ) ) )? ) ;
    public final EObject ruleSynchronization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_sendingEvents_1_0 = null;

        EObject lv_sendingEvents_3_0 = null;

        EObject lv_receivingEvents_5_0 = null;

        EObject lv_receivingEvents_7_0 = null;

        EObject lv_sendingEvents_9_0 = null;

        EObject lv_sendingEvents_11_0 = null;

        EObject lv_receivingEvents_13_0 = null;

        EObject lv_receivingEvents_15_0 = null;

        AntlrDatatypeRuleToken lv_channelName_17_0 = null;

        EObject lv_generalSelectorExpression_19_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:355:28: ( ( ( (otherlv_0= 'synchronize' ( (lv_sendingEvents_1_0= ruleEvent ) ) (otherlv_2= ',' ( (lv_sendingEvents_3_0= ruleEvent ) ) )* otherlv_4= 'with' ( (lv_receivingEvents_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_receivingEvents_7_0= ruleEvent ) ) )* ) | (otherlv_8= 'synchronize' ( (lv_sendingEvents_9_0= ruleSynchronizationEvent ) ) (otherlv_10= ',' ( (lv_sendingEvents_11_0= ruleSynchronizationEvent ) ) )* otherlv_12= 'with' ( (lv_receivingEvents_13_0= ruleSynchronizationEvent ) ) (otherlv_14= ',' ( (lv_receivingEvents_15_0= ruleSynchronizationEvent ) ) )* ) ) (otherlv_16= 'using' ( (lv_channelName_17_0= ruleEString ) ) )? (otherlv_18= '[' ( (lv_generalSelectorExpression_19_0= ruleExpression ) ) otherlv_20= ']' otherlv_21= 'of type' ( (otherlv_22= RULE_ID ) ) )? ) )
            // InternalDependencyModelLanguage.g:356:1: ( ( (otherlv_0= 'synchronize' ( (lv_sendingEvents_1_0= ruleEvent ) ) (otherlv_2= ',' ( (lv_sendingEvents_3_0= ruleEvent ) ) )* otherlv_4= 'with' ( (lv_receivingEvents_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_receivingEvents_7_0= ruleEvent ) ) )* ) | (otherlv_8= 'synchronize' ( (lv_sendingEvents_9_0= ruleSynchronizationEvent ) ) (otherlv_10= ',' ( (lv_sendingEvents_11_0= ruleSynchronizationEvent ) ) )* otherlv_12= 'with' ( (lv_receivingEvents_13_0= ruleSynchronizationEvent ) ) (otherlv_14= ',' ( (lv_receivingEvents_15_0= ruleSynchronizationEvent ) ) )* ) ) (otherlv_16= 'using' ( (lv_channelName_17_0= ruleEString ) ) )? (otherlv_18= '[' ( (lv_generalSelectorExpression_19_0= ruleExpression ) ) otherlv_20= ']' otherlv_21= 'of type' ( (otherlv_22= RULE_ID ) ) )? )
            {
            // InternalDependencyModelLanguage.g:356:1: ( ( (otherlv_0= 'synchronize' ( (lv_sendingEvents_1_0= ruleEvent ) ) (otherlv_2= ',' ( (lv_sendingEvents_3_0= ruleEvent ) ) )* otherlv_4= 'with' ( (lv_receivingEvents_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_receivingEvents_7_0= ruleEvent ) ) )* ) | (otherlv_8= 'synchronize' ( (lv_sendingEvents_9_0= ruleSynchronizationEvent ) ) (otherlv_10= ',' ( (lv_sendingEvents_11_0= ruleSynchronizationEvent ) ) )* otherlv_12= 'with' ( (lv_receivingEvents_13_0= ruleSynchronizationEvent ) ) (otherlv_14= ',' ( (lv_receivingEvents_15_0= ruleSynchronizationEvent ) ) )* ) ) (otherlv_16= 'using' ( (lv_channelName_17_0= ruleEString ) ) )? (otherlv_18= '[' ( (lv_generalSelectorExpression_19_0= ruleExpression ) ) otherlv_20= ']' otherlv_21= 'of type' ( (otherlv_22= RULE_ID ) ) )? )
            // InternalDependencyModelLanguage.g:356:2: ( (otherlv_0= 'synchronize' ( (lv_sendingEvents_1_0= ruleEvent ) ) (otherlv_2= ',' ( (lv_sendingEvents_3_0= ruleEvent ) ) )* otherlv_4= 'with' ( (lv_receivingEvents_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_receivingEvents_7_0= ruleEvent ) ) )* ) | (otherlv_8= 'synchronize' ( (lv_sendingEvents_9_0= ruleSynchronizationEvent ) ) (otherlv_10= ',' ( (lv_sendingEvents_11_0= ruleSynchronizationEvent ) ) )* otherlv_12= 'with' ( (lv_receivingEvents_13_0= ruleSynchronizationEvent ) ) (otherlv_14= ',' ( (lv_receivingEvents_15_0= ruleSynchronizationEvent ) ) )* ) ) (otherlv_16= 'using' ( (lv_channelName_17_0= ruleEString ) ) )? (otherlv_18= '[' ( (lv_generalSelectorExpression_19_0= ruleExpression ) ) otherlv_20= ']' otherlv_21= 'of type' ( (otherlv_22= RULE_ID ) ) )?
            {
            // InternalDependencyModelLanguage.g:356:2: ( (otherlv_0= 'synchronize' ( (lv_sendingEvents_1_0= ruleEvent ) ) (otherlv_2= ',' ( (lv_sendingEvents_3_0= ruleEvent ) ) )* otherlv_4= 'with' ( (lv_receivingEvents_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_receivingEvents_7_0= ruleEvent ) ) )* ) | (otherlv_8= 'synchronize' ( (lv_sendingEvents_9_0= ruleSynchronizationEvent ) ) (otherlv_10= ',' ( (lv_sendingEvents_11_0= ruleSynchronizationEvent ) ) )* otherlv_12= 'with' ( (lv_receivingEvents_13_0= ruleSynchronizationEvent ) ) (otherlv_14= ',' ( (lv_receivingEvents_15_0= ruleSynchronizationEvent ) ) )* ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalDependencyModelLanguage.g:356:3: (otherlv_0= 'synchronize' ( (lv_sendingEvents_1_0= ruleEvent ) ) (otherlv_2= ',' ( (lv_sendingEvents_3_0= ruleEvent ) ) )* otherlv_4= 'with' ( (lv_receivingEvents_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_receivingEvents_7_0= ruleEvent ) ) )* )
                    {
                    // InternalDependencyModelLanguage.g:356:3: (otherlv_0= 'synchronize' ( (lv_sendingEvents_1_0= ruleEvent ) ) (otherlv_2= ',' ( (lv_sendingEvents_3_0= ruleEvent ) ) )* otherlv_4= 'with' ( (lv_receivingEvents_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_receivingEvents_7_0= ruleEvent ) ) )* )
                    // InternalDependencyModelLanguage.g:356:5: otherlv_0= 'synchronize' ( (lv_sendingEvents_1_0= ruleEvent ) ) (otherlv_2= ',' ( (lv_sendingEvents_3_0= ruleEvent ) ) )* otherlv_4= 'with' ( (lv_receivingEvents_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_receivingEvents_7_0= ruleEvent ) ) )*
                    {
                    otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getSynchronizationAccess().getSynchronizeKeyword_0_0_0());
                          
                    }
                    // InternalDependencyModelLanguage.g:360:1: ( (lv_sendingEvents_1_0= ruleEvent ) )
                    // InternalDependencyModelLanguage.g:361:1: (lv_sendingEvents_1_0= ruleEvent )
                    {
                    // InternalDependencyModelLanguage.g:361:1: (lv_sendingEvents_1_0= ruleEvent )
                    // InternalDependencyModelLanguage.g:362:3: lv_sendingEvents_1_0= ruleEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSynchronizationAccess().getSendingEventsEventParserRuleCall_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_sendingEvents_1_0=ruleEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSynchronizationRule());
                      	        }
                             		add(
                             			current, 
                             			"sendingEvents",
                              		lv_sendingEvents_1_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.Event");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:378:2: (otherlv_2= ',' ( (lv_sendingEvents_3_0= ruleEvent ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDependencyModelLanguage.g:378:4: otherlv_2= ',' ( (lv_sendingEvents_3_0= ruleEvent ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getSynchronizationAccess().getCommaKeyword_0_0_2_0());
                    	          
                    	    }
                    	    // InternalDependencyModelLanguage.g:382:1: ( (lv_sendingEvents_3_0= ruleEvent ) )
                    	    // InternalDependencyModelLanguage.g:383:1: (lv_sendingEvents_3_0= ruleEvent )
                    	    {
                    	    // InternalDependencyModelLanguage.g:383:1: (lv_sendingEvents_3_0= ruleEvent )
                    	    // InternalDependencyModelLanguage.g:384:3: lv_sendingEvents_3_0= ruleEvent
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSynchronizationAccess().getSendingEventsEventParserRuleCall_0_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_sendingEvents_3_0=ruleEvent();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSynchronizationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"sendingEvents",
                    	              		lv_sendingEvents_3_0, 
                    	              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.Event");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSynchronizationAccess().getWithKeyword_0_0_3());
                          
                    }
                    // InternalDependencyModelLanguage.g:404:1: ( (lv_receivingEvents_5_0= ruleEvent ) )
                    // InternalDependencyModelLanguage.g:405:1: (lv_receivingEvents_5_0= ruleEvent )
                    {
                    // InternalDependencyModelLanguage.g:405:1: (lv_receivingEvents_5_0= ruleEvent )
                    // InternalDependencyModelLanguage.g:406:3: lv_receivingEvents_5_0= ruleEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSynchronizationAccess().getReceivingEventsEventParserRuleCall_0_0_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_receivingEvents_5_0=ruleEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSynchronizationRule());
                      	        }
                             		add(
                             			current, 
                             			"receivingEvents",
                              		lv_receivingEvents_5_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.Event");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:422:2: (otherlv_6= ',' ( (lv_receivingEvents_7_0= ruleEvent ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDependencyModelLanguage.g:422:4: otherlv_6= ',' ( (lv_receivingEvents_7_0= ruleEvent ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getSynchronizationAccess().getCommaKeyword_0_0_5_0());
                    	          
                    	    }
                    	    // InternalDependencyModelLanguage.g:426:1: ( (lv_receivingEvents_7_0= ruleEvent ) )
                    	    // InternalDependencyModelLanguage.g:427:1: (lv_receivingEvents_7_0= ruleEvent )
                    	    {
                    	    // InternalDependencyModelLanguage.g:427:1: (lv_receivingEvents_7_0= ruleEvent )
                    	    // InternalDependencyModelLanguage.g:428:3: lv_receivingEvents_7_0= ruleEvent
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSynchronizationAccess().getReceivingEventsEventParserRuleCall_0_0_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_8);
                    	    lv_receivingEvents_7_0=ruleEvent();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSynchronizationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"receivingEvents",
                    	              		lv_receivingEvents_7_0, 
                    	              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.Event");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:445:6: (otherlv_8= 'synchronize' ( (lv_sendingEvents_9_0= ruleSynchronizationEvent ) ) (otherlv_10= ',' ( (lv_sendingEvents_11_0= ruleSynchronizationEvent ) ) )* otherlv_12= 'with' ( (lv_receivingEvents_13_0= ruleSynchronizationEvent ) ) (otherlv_14= ',' ( (lv_receivingEvents_15_0= ruleSynchronizationEvent ) ) )* )
                    {
                    // InternalDependencyModelLanguage.g:445:6: (otherlv_8= 'synchronize' ( (lv_sendingEvents_9_0= ruleSynchronizationEvent ) ) (otherlv_10= ',' ( (lv_sendingEvents_11_0= ruleSynchronizationEvent ) ) )* otherlv_12= 'with' ( (lv_receivingEvents_13_0= ruleSynchronizationEvent ) ) (otherlv_14= ',' ( (lv_receivingEvents_15_0= ruleSynchronizationEvent ) ) )* )
                    // InternalDependencyModelLanguage.g:445:8: otherlv_8= 'synchronize' ( (lv_sendingEvents_9_0= ruleSynchronizationEvent ) ) (otherlv_10= ',' ( (lv_sendingEvents_11_0= ruleSynchronizationEvent ) ) )* otherlv_12= 'with' ( (lv_receivingEvents_13_0= ruleSynchronizationEvent ) ) (otherlv_14= ',' ( (lv_receivingEvents_15_0= ruleSynchronizationEvent ) ) )*
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSynchronizationAccess().getSynchronizeKeyword_0_1_0());
                          
                    }
                    // InternalDependencyModelLanguage.g:449:1: ( (lv_sendingEvents_9_0= ruleSynchronizationEvent ) )
                    // InternalDependencyModelLanguage.g:450:1: (lv_sendingEvents_9_0= ruleSynchronizationEvent )
                    {
                    // InternalDependencyModelLanguage.g:450:1: (lv_sendingEvents_9_0= ruleSynchronizationEvent )
                    // InternalDependencyModelLanguage.g:451:3: lv_sendingEvents_9_0= ruleSynchronizationEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSynchronizationAccess().getSendingEventsSynchronizationEventParserRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_sendingEvents_9_0=ruleSynchronizationEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSynchronizationRule());
                      	        }
                             		add(
                             			current, 
                             			"sendingEvents",
                              		lv_sendingEvents_9_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.SynchronizationEvent");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:467:2: (otherlv_10= ',' ( (lv_sendingEvents_11_0= ruleSynchronizationEvent ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalDependencyModelLanguage.g:467:4: otherlv_10= ',' ( (lv_sendingEvents_11_0= ruleSynchronizationEvent ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getSynchronizationAccess().getCommaKeyword_0_1_2_0());
                    	          
                    	    }
                    	    // InternalDependencyModelLanguage.g:471:1: ( (lv_sendingEvents_11_0= ruleSynchronizationEvent ) )
                    	    // InternalDependencyModelLanguage.g:472:1: (lv_sendingEvents_11_0= ruleSynchronizationEvent )
                    	    {
                    	    // InternalDependencyModelLanguage.g:472:1: (lv_sendingEvents_11_0= ruleSynchronizationEvent )
                    	    // InternalDependencyModelLanguage.g:473:3: lv_sendingEvents_11_0= ruleSynchronizationEvent
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSynchronizationAccess().getSendingEventsSynchronizationEventParserRuleCall_0_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_sendingEvents_11_0=ruleSynchronizationEvent();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSynchronizationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"sendingEvents",
                    	              		lv_sendingEvents_11_0, 
                    	              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.SynchronizationEvent");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSynchronizationAccess().getWithKeyword_0_1_3());
                          
                    }
                    // InternalDependencyModelLanguage.g:493:1: ( (lv_receivingEvents_13_0= ruleSynchronizationEvent ) )
                    // InternalDependencyModelLanguage.g:494:1: (lv_receivingEvents_13_0= ruleSynchronizationEvent )
                    {
                    // InternalDependencyModelLanguage.g:494:1: (lv_receivingEvents_13_0= ruleSynchronizationEvent )
                    // InternalDependencyModelLanguage.g:495:3: lv_receivingEvents_13_0= ruleSynchronizationEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSynchronizationAccess().getReceivingEventsSynchronizationEventParserRuleCall_0_1_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_receivingEvents_13_0=ruleSynchronizationEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSynchronizationRule());
                      	        }
                             		add(
                             			current, 
                             			"receivingEvents",
                              		lv_receivingEvents_13_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.SynchronizationEvent");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:511:2: (otherlv_14= ',' ( (lv_receivingEvents_15_0= ruleSynchronizationEvent ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalDependencyModelLanguage.g:511:4: otherlv_14= ',' ( (lv_receivingEvents_15_0= ruleSynchronizationEvent ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getSynchronizationAccess().getCommaKeyword_0_1_5_0());
                    	          
                    	    }
                    	    // InternalDependencyModelLanguage.g:515:1: ( (lv_receivingEvents_15_0= ruleSynchronizationEvent ) )
                    	    // InternalDependencyModelLanguage.g:516:1: (lv_receivingEvents_15_0= ruleSynchronizationEvent )
                    	    {
                    	    // InternalDependencyModelLanguage.g:516:1: (lv_receivingEvents_15_0= ruleSynchronizationEvent )
                    	    // InternalDependencyModelLanguage.g:517:3: lv_receivingEvents_15_0= ruleSynchronizationEvent
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSynchronizationAccess().getReceivingEventsSynchronizationEventParserRuleCall_0_1_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_8);
                    	    lv_receivingEvents_15_0=ruleSynchronizationEvent();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSynchronizationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"receivingEvents",
                    	              		lv_receivingEvents_15_0, 
                    	              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.SynchronizationEvent");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // InternalDependencyModelLanguage.g:533:6: (otherlv_16= 'using' ( (lv_channelName_17_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDependencyModelLanguage.g:533:8: otherlv_16= 'using' ( (lv_channelName_17_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getSynchronizationAccess().getUsingKeyword_1_0());
                          
                    }
                    // InternalDependencyModelLanguage.g:537:1: ( (lv_channelName_17_0= ruleEString ) )
                    // InternalDependencyModelLanguage.g:538:1: (lv_channelName_17_0= ruleEString )
                    {
                    // InternalDependencyModelLanguage.g:538:1: (lv_channelName_17_0= ruleEString )
                    // InternalDependencyModelLanguage.g:539:3: lv_channelName_17_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSynchronizationAccess().getChannelNameEStringParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_10);
                    lv_channelName_17_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSynchronizationRule());
                      	        }
                             		set(
                             			current, 
                             			"channelName",
                              		lv_channelName_17_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDependencyModelLanguage.g:555:4: (otherlv_18= '[' ( (lv_generalSelectorExpression_19_0= ruleExpression ) ) otherlv_20= ']' otherlv_21= 'of type' ( (otherlv_22= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDependencyModelLanguage.g:555:6: otherlv_18= '[' ( (lv_generalSelectorExpression_19_0= ruleExpression ) ) otherlv_20= ']' otherlv_21= 'of type' ( (otherlv_22= RULE_ID ) )
                    {
                    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getSynchronizationAccess().getLeftSquareBracketKeyword_2_0());
                          
                    }
                    // InternalDependencyModelLanguage.g:559:1: ( (lv_generalSelectorExpression_19_0= ruleExpression ) )
                    // InternalDependencyModelLanguage.g:560:1: (lv_generalSelectorExpression_19_0= ruleExpression )
                    {
                    // InternalDependencyModelLanguage.g:560:1: (lv_generalSelectorExpression_19_0= ruleExpression )
                    // InternalDependencyModelLanguage.g:561:3: lv_generalSelectorExpression_19_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSynchronizationAccess().getGeneralSelectorExpressionExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_generalSelectorExpression_19_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSynchronizationRule());
                      	        }
                             		set(
                             			current, 
                             			"generalSelectorExpression",
                              		lv_generalSelectorExpression_19_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getSynchronizationAccess().getRightSquareBracketKeyword_2_2());
                          
                    }
                    otherlv_21=(Token)match(input,21,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getSynchronizationAccess().getOfTypeKeyword_2_3());
                          
                    }
                    // InternalDependencyModelLanguage.g:585:1: ( (otherlv_22= RULE_ID ) )
                    // InternalDependencyModelLanguage.g:586:1: (otherlv_22= RULE_ID )
                    {
                    // InternalDependencyModelLanguage.g:586:1: (otherlv_22= RULE_ID )
                    // InternalDependencyModelLanguage.g:587:3: otherlv_22= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSynchronizationRule());
                      	        }
                              
                    }
                    otherlv_22=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_22, grammarAccess.getSynchronizationAccess().getSelectorTypeDataTypeCrossReference_2_4_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSynchronization"


    // $ANTLR start "entryRuleForbiddenStateCombination"
    // InternalDependencyModelLanguage.g:609:1: entryRuleForbiddenStateCombination returns [EObject current=null] : iv_ruleForbiddenStateCombination= ruleForbiddenStateCombination EOF ;
    public final EObject entryRuleForbiddenStateCombination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForbiddenStateCombination = null;


        try {
            // InternalDependencyModelLanguage.g:610:2: (iv_ruleForbiddenStateCombination= ruleForbiddenStateCombination EOF )
            // InternalDependencyModelLanguage.g:611:2: iv_ruleForbiddenStateCombination= ruleForbiddenStateCombination EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForbiddenStateCombinationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleForbiddenStateCombination=ruleForbiddenStateCombination();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForbiddenStateCombination; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForbiddenStateCombination"


    // $ANTLR start "ruleForbiddenStateCombination"
    // InternalDependencyModelLanguage.g:618:1: ruleForbiddenStateCombination returns [EObject current=null] : (otherlv_0= 'forbid state combination' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )+ ) ;
    public final EObject ruleForbiddenStateCombination() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:621:28: ( (otherlv_0= 'forbid state combination' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )+ ) )
            // InternalDependencyModelLanguage.g:622:1: (otherlv_0= 'forbid state combination' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )+ )
            {
            // InternalDependencyModelLanguage.g:622:1: (otherlv_0= 'forbid state combination' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )+ )
            // InternalDependencyModelLanguage.g:622:3: otherlv_0= 'forbid state combination' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )+
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForbiddenStateCombinationAccess().getForbidStateCombinationKeyword_0());
                  
            }
            // InternalDependencyModelLanguage.g:626:1: ( ( ruleQualifiedName ) )
            // InternalDependencyModelLanguage.g:627:1: ( ruleQualifiedName )
            {
            // InternalDependencyModelLanguage.g:627:1: ( ruleQualifiedName )
            // InternalDependencyModelLanguage.g:628:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getForbiddenStateCombinationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForbiddenStateCombinationAccess().getStatesStateCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:644:2: (otherlv_2= ',' ( ( ruleQualifiedName ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDependencyModelLanguage.g:644:4: otherlv_2= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getForbiddenStateCombinationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalDependencyModelLanguage.g:648:1: ( ( ruleQualifiedName ) )
            	    // InternalDependencyModelLanguage.g:649:1: ( ruleQualifiedName )
            	    {
            	    // InternalDependencyModelLanguage.g:649:1: ( ruleQualifiedName )
            	    // InternalDependencyModelLanguage.g:650:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getForbiddenStateCombinationRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getForbiddenStateCombinationAccess().getStatesStateCrossReference_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForbiddenStateCombination"


    // $ANTLR start "entryRuleBoundedActiveState"
    // InternalDependencyModelLanguage.g:674:1: entryRuleBoundedActiveState returns [EObject current=null] : iv_ruleBoundedActiveState= ruleBoundedActiveState EOF ;
    public final EObject entryRuleBoundedActiveState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundedActiveState = null;


        try {
            // InternalDependencyModelLanguage.g:675:2: (iv_ruleBoundedActiveState= ruleBoundedActiveState EOF )
            // InternalDependencyModelLanguage.g:676:2: iv_ruleBoundedActiveState= ruleBoundedActiveState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoundedActiveStateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBoundedActiveState=ruleBoundedActiveState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoundedActiveState; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoundedActiveState"


    // $ANTLR start "ruleBoundedActiveState"
    // InternalDependencyModelLanguage.g:683:1: ruleBoundedActiveState returns [EObject current=null] : (otherlv_0= 'bound states' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= 'by' otherlv_5= '[' ( (lv_constraint_6_0= ruleClockCondition ) ) otherlv_7= ']' ) ;
    public final EObject ruleBoundedActiveState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_constraint_6_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:686:28: ( (otherlv_0= 'bound states' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= 'by' otherlv_5= '[' ( (lv_constraint_6_0= ruleClockCondition ) ) otherlv_7= ']' ) )
            // InternalDependencyModelLanguage.g:687:1: (otherlv_0= 'bound states' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= 'by' otherlv_5= '[' ( (lv_constraint_6_0= ruleClockCondition ) ) otherlv_7= ']' )
            {
            // InternalDependencyModelLanguage.g:687:1: (otherlv_0= 'bound states' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= 'by' otherlv_5= '[' ( (lv_constraint_6_0= ruleClockCondition ) ) otherlv_7= ']' )
            // InternalDependencyModelLanguage.g:687:3: otherlv_0= 'bound states' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= 'by' otherlv_5= '[' ( (lv_constraint_6_0= ruleClockCondition ) ) otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBoundedActiveStateAccess().getBoundStatesKeyword_0());
                  
            }
            // InternalDependencyModelLanguage.g:691:1: ( ( ruleQualifiedName ) )
            // InternalDependencyModelLanguage.g:692:1: ( ruleQualifiedName )
            {
            // InternalDependencyModelLanguage.g:692:1: ( ruleQualifiedName )
            // InternalDependencyModelLanguage.g:693:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBoundedActiveStateRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBoundedActiveStateAccess().getStatesStateCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_17);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:709:2: (otherlv_2= ',' ( ( ruleQualifiedName ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDependencyModelLanguage.g:709:4: otherlv_2= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBoundedActiveStateAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalDependencyModelLanguage.g:713:1: ( ( ruleQualifiedName ) )
            	    // InternalDependencyModelLanguage.g:714:1: ( ruleQualifiedName )
            	    {
            	    // InternalDependencyModelLanguage.g:714:1: ( ruleQualifiedName )
            	    // InternalDependencyModelLanguage.g:715:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getBoundedActiveStateRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBoundedActiveStateAccess().getStatesStateCrossReference_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBoundedActiveStateAccess().getByKeyword_3());
                  
            }
            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBoundedActiveStateAccess().getLeftSquareBracketKeyword_4());
                  
            }
            // InternalDependencyModelLanguage.g:739:1: ( (lv_constraint_6_0= ruleClockCondition ) )
            // InternalDependencyModelLanguage.g:740:1: (lv_constraint_6_0= ruleClockCondition )
            {
            // InternalDependencyModelLanguage.g:740:1: (lv_constraint_6_0= ruleClockCondition )
            // InternalDependencyModelLanguage.g:741:3: lv_constraint_6_0= ruleClockCondition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBoundedActiveStateAccess().getConstraintClockConditionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_constraint_6_0=ruleClockCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBoundedActiveStateRule());
              	        }
                     		set(
                     			current, 
                     			"constraint",
                      		lv_constraint_6_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.ClockCondition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getBoundedActiveStateAccess().getRightSquareBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoundedActiveState"


    // $ANTLR start "entryRuleTriggerMessage"
    // InternalDependencyModelLanguage.g:769:1: entryRuleTriggerMessage returns [EObject current=null] : iv_ruleTriggerMessage= ruleTriggerMessage EOF ;
    public final EObject entryRuleTriggerMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerMessage = null;


        try {
            // InternalDependencyModelLanguage.g:770:2: (iv_ruleTriggerMessage= ruleTriggerMessage EOF )
            // InternalDependencyModelLanguage.g:771:2: iv_ruleTriggerMessage= ruleTriggerMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriggerMessageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTriggerMessage=ruleTriggerMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTriggerMessage; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriggerMessage"


    // $ANTLR start "ruleTriggerMessage"
    // InternalDependencyModelLanguage.g:778:1: ruleTriggerMessage returns [EObject current=null] : (otherlv_0= 'on' ( (lv_messageEvent_1_0= ruleMessageEvent ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleDataAssignmentEffect ) ) (otherlv_4= ';' ( (lv_effects_5_0= ruleDataAssignmentEffect ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleTriggerMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_messageEvent_1_0 = null;

        EObject lv_effects_3_0 = null;

        EObject lv_effects_5_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:781:28: ( (otherlv_0= 'on' ( (lv_messageEvent_1_0= ruleMessageEvent ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleDataAssignmentEffect ) ) (otherlv_4= ';' ( (lv_effects_5_0= ruleDataAssignmentEffect ) ) )* otherlv_6= '}' ) )
            // InternalDependencyModelLanguage.g:782:1: (otherlv_0= 'on' ( (lv_messageEvent_1_0= ruleMessageEvent ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleDataAssignmentEffect ) ) (otherlv_4= ';' ( (lv_effects_5_0= ruleDataAssignmentEffect ) ) )* otherlv_6= '}' )
            {
            // InternalDependencyModelLanguage.g:782:1: (otherlv_0= 'on' ( (lv_messageEvent_1_0= ruleMessageEvent ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleDataAssignmentEffect ) ) (otherlv_4= ';' ( (lv_effects_5_0= ruleDataAssignmentEffect ) ) )* otherlv_6= '}' )
            // InternalDependencyModelLanguage.g:782:3: otherlv_0= 'on' ( (lv_messageEvent_1_0= ruleMessageEvent ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleDataAssignmentEffect ) ) (otherlv_4= ';' ( (lv_effects_5_0= ruleDataAssignmentEffect ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTriggerMessageAccess().getOnKeyword_0());
                  
            }
            // InternalDependencyModelLanguage.g:786:1: ( (lv_messageEvent_1_0= ruleMessageEvent ) )
            // InternalDependencyModelLanguage.g:787:1: (lv_messageEvent_1_0= ruleMessageEvent )
            {
            // InternalDependencyModelLanguage.g:787:1: (lv_messageEvent_1_0= ruleMessageEvent )
            // InternalDependencyModelLanguage.g:788:3: lv_messageEvent_1_0= ruleMessageEvent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTriggerMessageAccess().getMessageEventMessageEventParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_20);
            lv_messageEvent_1_0=ruleMessageEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTriggerMessageRule());
              	        }
                     		set(
                     			current, 
                     			"messageEvent",
                      		lv_messageEvent_1_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.MessageEvent");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTriggerMessageAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalDependencyModelLanguage.g:808:1: ( (lv_effects_3_0= ruleDataAssignmentEffect ) )
            // InternalDependencyModelLanguage.g:809:1: (lv_effects_3_0= ruleDataAssignmentEffect )
            {
            // InternalDependencyModelLanguage.g:809:1: (lv_effects_3_0= ruleDataAssignmentEffect )
            // InternalDependencyModelLanguage.g:810:3: lv_effects_3_0= ruleDataAssignmentEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTriggerMessageAccess().getEffectsDataAssignmentEffectParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_22);
            lv_effects_3_0=ruleDataAssignmentEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTriggerMessageRule());
              	        }
                     		add(
                     			current, 
                     			"effects",
                      		lv_effects_3_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.DataAssignmentEffect");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:826:2: (otherlv_4= ';' ( (lv_effects_5_0= ruleDataAssignmentEffect ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDependencyModelLanguage.g:826:4: otherlv_4= ';' ( (lv_effects_5_0= ruleDataAssignmentEffect ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getTriggerMessageAccess().getSemicolonKeyword_4_0());
            	          
            	    }
            	    // InternalDependencyModelLanguage.g:830:1: ( (lv_effects_5_0= ruleDataAssignmentEffect ) )
            	    // InternalDependencyModelLanguage.g:831:1: (lv_effects_5_0= ruleDataAssignmentEffect )
            	    {
            	    // InternalDependencyModelLanguage.g:831:1: (lv_effects_5_0= ruleDataAssignmentEffect )
            	    // InternalDependencyModelLanguage.g:832:3: lv_effects_5_0= ruleDataAssignmentEffect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTriggerMessageAccess().getEffectsDataAssignmentEffectParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    lv_effects_5_0=ruleDataAssignmentEffect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTriggerMessageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"effects",
            	              		lv_effects_5_0, 
            	              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.DataAssignmentEffect");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getTriggerMessageAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriggerMessage"


    // $ANTLR start "entryRuleConditionalDependency"
    // InternalDependencyModelLanguage.g:860:1: entryRuleConditionalDependency returns [EObject current=null] : iv_ruleConditionalDependency= ruleConditionalDependency EOF ;
    public final EObject entryRuleConditionalDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalDependency = null;


        try {
            // InternalDependencyModelLanguage.g:861:2: (iv_ruleConditionalDependency= ruleConditionalDependency EOF )
            // InternalDependencyModelLanguage.g:862:2: iv_ruleConditionalDependency= ruleConditionalDependency EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalDependencyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConditionalDependency=ruleConditionalDependency();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalDependency; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalDependency"


    // $ANTLR start "ruleConditionalDependency"
    // InternalDependencyModelLanguage.g:869:1: ruleConditionalDependency returns [EObject current=null] : ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffect ) ) (otherlv_4= ';' ( (lv_effects_5_0= ruleEffect ) ) )* (otherlv_6= ';' )? otherlv_7= '}' ) | (otherlv_8= 'if' otherlv_9= '[' ( (lv_event_10_0= ruleComplexEvent ) ) otherlv_11= ']' otherlv_12= '{' ( (lv_effects_13_0= ruleLimitedEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleLimitedEffect ) ) )* (otherlv_16= ';' )? otherlv_17= '}' ) ) ;
    public final EObject ruleConditionalDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_condition_1_0 = null;

        EObject lv_effects_3_0 = null;

        EObject lv_effects_5_0 = null;

        EObject lv_event_10_0 = null;

        EObject lv_effects_13_0 = null;

        EObject lv_effects_15_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:872:28: ( ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffect ) ) (otherlv_4= ';' ( (lv_effects_5_0= ruleEffect ) ) )* (otherlv_6= ';' )? otherlv_7= '}' ) | (otherlv_8= 'if' otherlv_9= '[' ( (lv_event_10_0= ruleComplexEvent ) ) otherlv_11= ']' otherlv_12= '{' ( (lv_effects_13_0= ruleLimitedEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleLimitedEffect ) ) )* (otherlv_16= ';' )? otherlv_17= '}' ) ) )
            // InternalDependencyModelLanguage.g:873:1: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffect ) ) (otherlv_4= ';' ( (lv_effects_5_0= ruleEffect ) ) )* (otherlv_6= ';' )? otherlv_7= '}' ) | (otherlv_8= 'if' otherlv_9= '[' ( (lv_event_10_0= ruleComplexEvent ) ) otherlv_11= ']' otherlv_12= '{' ( (lv_effects_13_0= ruleLimitedEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleLimitedEffect ) ) )* (otherlv_16= ';' )? otherlv_17= '}' ) )
            {
            // InternalDependencyModelLanguage.g:873:1: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffect ) ) (otherlv_4= ';' ( (lv_effects_5_0= ruleEffect ) ) )* (otherlv_6= ';' )? otherlv_7= '}' ) | (otherlv_8= 'if' otherlv_9= '[' ( (lv_event_10_0= ruleComplexEvent ) ) otherlv_11= ']' otherlv_12= '{' ( (lv_effects_13_0= ruleLimitedEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleLimitedEffect ) ) )* (otherlv_16= ';' )? otherlv_17= '}' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                int LA22_1 = input.LA(2);

                if ( (synpred25_InternalDependencyModelLanguage()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalDependencyModelLanguage.g:873:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffect ) ) (otherlv_4= ';' ( (lv_effects_5_0= ruleEffect ) ) )* (otherlv_6= ';' )? otherlv_7= '}' )
                    {
                    // InternalDependencyModelLanguage.g:873:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffect ) ) (otherlv_4= ';' ( (lv_effects_5_0= ruleEffect ) ) )* (otherlv_6= ';' )? otherlv_7= '}' )
                    // InternalDependencyModelLanguage.g:873:4: otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffect ) ) (otherlv_4= ';' ( (lv_effects_5_0= ruleEffect ) ) )* (otherlv_6= ';' )? otherlv_7= '}'
                    {
                    otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getConditionalDependencyAccess().getIfKeyword_0_0());
                          
                    }
                    // InternalDependencyModelLanguage.g:877:1: ( (lv_condition_1_0= ruleCondition ) )
                    // InternalDependencyModelLanguage.g:878:1: (lv_condition_1_0= ruleCondition )
                    {
                    // InternalDependencyModelLanguage.g:878:1: (lv_condition_1_0= ruleCondition )
                    // InternalDependencyModelLanguage.g:879:3: lv_condition_1_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalDependencyAccess().getConditionConditionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_20);
                    lv_condition_1_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalDependencyRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_1_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalDependencyAccess().getLeftCurlyBracketKeyword_0_2());
                          
                    }
                    // InternalDependencyModelLanguage.g:899:1: ( (lv_effects_3_0= ruleEffect ) )
                    // InternalDependencyModelLanguage.g:900:1: (lv_effects_3_0= ruleEffect )
                    {
                    // InternalDependencyModelLanguage.g:900:1: (lv_effects_3_0= ruleEffect )
                    // InternalDependencyModelLanguage.g:901:3: lv_effects_3_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalDependencyAccess().getEffectsEffectParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    lv_effects_3_0=ruleEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalDependencyRule());
                      	        }
                             		add(
                             			current, 
                             			"effects",
                              		lv_effects_3_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:917:2: (otherlv_4= ';' ( (lv_effects_5_0= ruleEffect ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            int LA18_1 = input.LA(2);

                            if ( ((LA18_1>=29 && LA18_1<=32)) ) {
                                alt18=1;
                            }


                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalDependencyModelLanguage.g:917:4: otherlv_4= ';' ( (lv_effects_5_0= ruleEffect ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getConditionalDependencyAccess().getSemicolonKeyword_0_4_0());
                    	          
                    	    }
                    	    // InternalDependencyModelLanguage.g:921:1: ( (lv_effects_5_0= ruleEffect ) )
                    	    // InternalDependencyModelLanguage.g:922:1: (lv_effects_5_0= ruleEffect )
                    	    {
                    	    // InternalDependencyModelLanguage.g:922:1: (lv_effects_5_0= ruleEffect )
                    	    // InternalDependencyModelLanguage.g:923:3: lv_effects_5_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalDependencyAccess().getEffectsEffectParserRuleCall_0_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_22);
                    	    lv_effects_5_0=ruleEffect();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getConditionalDependencyRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"effects",
                    	              		lv_effects_5_0, 
                    	              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.Effect");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // InternalDependencyModelLanguage.g:939:4: (otherlv_6= ';' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==14) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalDependencyModelLanguage.g:939:6: otherlv_6= ';'
                            {
                            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getConditionalDependencyAccess().getSemicolonKeyword_0_5());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getConditionalDependencyAccess().getRightCurlyBracketKeyword_0_6());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:948:6: (otherlv_8= 'if' otherlv_9= '[' ( (lv_event_10_0= ruleComplexEvent ) ) otherlv_11= ']' otherlv_12= '{' ( (lv_effects_13_0= ruleLimitedEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleLimitedEffect ) ) )* (otherlv_16= ';' )? otherlv_17= '}' )
                    {
                    // InternalDependencyModelLanguage.g:948:6: (otherlv_8= 'if' otherlv_9= '[' ( (lv_event_10_0= ruleComplexEvent ) ) otherlv_11= ']' otherlv_12= '{' ( (lv_effects_13_0= ruleLimitedEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleLimitedEffect ) ) )* (otherlv_16= ';' )? otherlv_17= '}' )
                    // InternalDependencyModelLanguage.g:948:8: otherlv_8= 'if' otherlv_9= '[' ( (lv_event_10_0= ruleComplexEvent ) ) otherlv_11= ']' otherlv_12= '{' ( (lv_effects_13_0= ruleLimitedEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleLimitedEffect ) ) )* (otherlv_16= ';' )? otherlv_17= '}'
                    {
                    otherlv_8=(Token)match(input,28,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getConditionalDependencyAccess().getIfKeyword_1_0());
                          
                    }
                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getConditionalDependencyAccess().getLeftSquareBracketKeyword_1_1());
                          
                    }
                    // InternalDependencyModelLanguage.g:956:1: ( (lv_event_10_0= ruleComplexEvent ) )
                    // InternalDependencyModelLanguage.g:957:1: (lv_event_10_0= ruleComplexEvent )
                    {
                    // InternalDependencyModelLanguage.g:957:1: (lv_event_10_0= ruleComplexEvent )
                    // InternalDependencyModelLanguage.g:958:3: lv_event_10_0= ruleComplexEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalDependencyAccess().getEventComplexEventParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_event_10_0=ruleComplexEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalDependencyRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_10_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.ComplexEvent");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getConditionalDependencyAccess().getRightSquareBracketKeyword_1_3());
                          
                    }
                    otherlv_12=(Token)match(input,26,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getConditionalDependencyAccess().getLeftCurlyBracketKeyword_1_4());
                          
                    }
                    // InternalDependencyModelLanguage.g:982:1: ( (lv_effects_13_0= ruleLimitedEffect ) )
                    // InternalDependencyModelLanguage.g:983:1: (lv_effects_13_0= ruleLimitedEffect )
                    {
                    // InternalDependencyModelLanguage.g:983:1: (lv_effects_13_0= ruleLimitedEffect )
                    // InternalDependencyModelLanguage.g:984:3: lv_effects_13_0= ruleLimitedEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalDependencyAccess().getEffectsLimitedEffectParserRuleCall_1_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    lv_effects_13_0=ruleLimitedEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalDependencyRule());
                      	        }
                             		add(
                             			current, 
                             			"effects",
                              		lv_effects_13_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.LimitedEffect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:1000:2: (otherlv_14= ';' ( (lv_effects_15_0= ruleLimitedEffect ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            int LA20_1 = input.LA(2);

                            if ( ((LA20_1>=31 && LA20_1<=32)) ) {
                                alt20=1;
                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalDependencyModelLanguage.g:1000:4: otherlv_14= ';' ( (lv_effects_15_0= ruleLimitedEffect ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getConditionalDependencyAccess().getSemicolonKeyword_1_6_0());
                    	          
                    	    }
                    	    // InternalDependencyModelLanguage.g:1004:1: ( (lv_effects_15_0= ruleLimitedEffect ) )
                    	    // InternalDependencyModelLanguage.g:1005:1: (lv_effects_15_0= ruleLimitedEffect )
                    	    {
                    	    // InternalDependencyModelLanguage.g:1005:1: (lv_effects_15_0= ruleLimitedEffect )
                    	    // InternalDependencyModelLanguage.g:1006:3: lv_effects_15_0= ruleLimitedEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConditionalDependencyAccess().getEffectsLimitedEffectParserRuleCall_1_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_22);
                    	    lv_effects_15_0=ruleLimitedEffect();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getConditionalDependencyRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"effects",
                    	              		lv_effects_15_0, 
                    	              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.LimitedEffect");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    // InternalDependencyModelLanguage.g:1022:4: (otherlv_16= ';' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==14) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalDependencyModelLanguage.g:1022:6: otherlv_16= ';'
                            {
                            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getConditionalDependencyAccess().getSemicolonKeyword_1_7());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getConditionalDependencyAccess().getRightCurlyBracketKeyword_1_8());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalDependency"


    // $ANTLR start "entryRuleEffect"
    // InternalDependencyModelLanguage.g:1038:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalDependencyModelLanguage.g:1039:2: (iv_ruleEffect= ruleEffect EOF )
            // InternalDependencyModelLanguage.g:1040:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEffect=ruleEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalDependencyModelLanguage.g:1047:1: ruleEffect returns [EObject current=null] : (this_EnableDisableEffect_0= ruleEnableDisableEffect | this_DataAssignmentEffect_1= ruleDataAssignmentEffect | this_ClockResetEffect_2= ruleClockResetEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_EnableDisableEffect_0 = null;

        EObject this_DataAssignmentEffect_1 = null;

        EObject this_ClockResetEffect_2 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:1050:28: ( (this_EnableDisableEffect_0= ruleEnableDisableEffect | this_DataAssignmentEffect_1= ruleDataAssignmentEffect | this_ClockResetEffect_2= ruleClockResetEffect ) )
            // InternalDependencyModelLanguage.g:1051:1: (this_EnableDisableEffect_0= ruleEnableDisableEffect | this_DataAssignmentEffect_1= ruleDataAssignmentEffect | this_ClockResetEffect_2= ruleClockResetEffect )
            {
            // InternalDependencyModelLanguage.g:1051:1: (this_EnableDisableEffect_0= ruleEnableDisableEffect | this_DataAssignmentEffect_1= ruleDataAssignmentEffect | this_ClockResetEffect_2= ruleClockResetEffect )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 29:
            case 30:
                {
                alt23=1;
                }
                break;
            case 31:
                {
                alt23=2;
                }
                break;
            case 32:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalDependencyModelLanguage.g:1052:2: this_EnableDisableEffect_0= ruleEnableDisableEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getEnableDisableEffectParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EnableDisableEffect_0=ruleEnableDisableEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnableDisableEffect_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:1065:2: this_DataAssignmentEffect_1= ruleDataAssignmentEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getDataAssignmentEffectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DataAssignmentEffect_1=ruleDataAssignmentEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataAssignmentEffect_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:1078:2: this_ClockResetEffect_2= ruleClockResetEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getClockResetEffectParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ClockResetEffect_2=ruleClockResetEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClockResetEffect_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleLimitedEffect"
    // InternalDependencyModelLanguage.g:1097:1: entryRuleLimitedEffect returns [EObject current=null] : iv_ruleLimitedEffect= ruleLimitedEffect EOF ;
    public final EObject entryRuleLimitedEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimitedEffect = null;


        try {
            // InternalDependencyModelLanguage.g:1098:2: (iv_ruleLimitedEffect= ruleLimitedEffect EOF )
            // InternalDependencyModelLanguage.g:1099:2: iv_ruleLimitedEffect= ruleLimitedEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLimitedEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLimitedEffect=ruleLimitedEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLimitedEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLimitedEffect"


    // $ANTLR start "ruleLimitedEffect"
    // InternalDependencyModelLanguage.g:1106:1: ruleLimitedEffect returns [EObject current=null] : (this_DataAssignmentEffect_0= ruleDataAssignmentEffect | this_ClockResetEffect_1= ruleClockResetEffect ) ;
    public final EObject ruleLimitedEffect() throws RecognitionException {
        EObject current = null;

        EObject this_DataAssignmentEffect_0 = null;

        EObject this_ClockResetEffect_1 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:1109:28: ( (this_DataAssignmentEffect_0= ruleDataAssignmentEffect | this_ClockResetEffect_1= ruleClockResetEffect ) )
            // InternalDependencyModelLanguage.g:1110:1: (this_DataAssignmentEffect_0= ruleDataAssignmentEffect | this_ClockResetEffect_1= ruleClockResetEffect )
            {
            // InternalDependencyModelLanguage.g:1110:1: (this_DataAssignmentEffect_0= ruleDataAssignmentEffect | this_ClockResetEffect_1= ruleClockResetEffect )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            else if ( (LA24_0==32) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalDependencyModelLanguage.g:1111:2: this_DataAssignmentEffect_0= ruleDataAssignmentEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLimitedEffectAccess().getDataAssignmentEffectParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DataAssignmentEffect_0=ruleDataAssignmentEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataAssignmentEffect_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:1124:2: this_ClockResetEffect_1= ruleClockResetEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLimitedEffectAccess().getClockResetEffectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ClockResetEffect_1=ruleClockResetEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClockResetEffect_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLimitedEffect"


    // $ANTLR start "entryRuleEnableDisableEffect"
    // InternalDependencyModelLanguage.g:1143:1: entryRuleEnableDisableEffect returns [EObject current=null] : iv_ruleEnableDisableEffect= ruleEnableDisableEffect EOF ;
    public final EObject entryRuleEnableDisableEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnableDisableEffect = null;


        try {
            // InternalDependencyModelLanguage.g:1144:2: (iv_ruleEnableDisableEffect= ruleEnableDisableEffect EOF )
            // InternalDependencyModelLanguage.g:1145:2: iv_ruleEnableDisableEffect= ruleEnableDisableEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnableDisableEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEnableDisableEffect=ruleEnableDisableEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnableDisableEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnableDisableEffect"


    // $ANTLR start "ruleEnableDisableEffect"
    // InternalDependencyModelLanguage.g:1152:1: ruleEnableDisableEffect returns [EObject current=null] : ( ( ( (lv_isEnable_0_0= 'enable' ) ) | otherlv_1= 'disable' ) ( (lv_event_2_0= ruleEvent ) ) ) ;
    public final EObject ruleEnableDisableEffect() throws RecognitionException {
        EObject current = null;

        Token lv_isEnable_0_0=null;
        Token otherlv_1=null;
        EObject lv_event_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:1155:28: ( ( ( ( (lv_isEnable_0_0= 'enable' ) ) | otherlv_1= 'disable' ) ( (lv_event_2_0= ruleEvent ) ) ) )
            // InternalDependencyModelLanguage.g:1156:1: ( ( ( (lv_isEnable_0_0= 'enable' ) ) | otherlv_1= 'disable' ) ( (lv_event_2_0= ruleEvent ) ) )
            {
            // InternalDependencyModelLanguage.g:1156:1: ( ( ( (lv_isEnable_0_0= 'enable' ) ) | otherlv_1= 'disable' ) ( (lv_event_2_0= ruleEvent ) ) )
            // InternalDependencyModelLanguage.g:1156:2: ( ( (lv_isEnable_0_0= 'enable' ) ) | otherlv_1= 'disable' ) ( (lv_event_2_0= ruleEvent ) )
            {
            // InternalDependencyModelLanguage.g:1156:2: ( ( (lv_isEnable_0_0= 'enable' ) ) | otherlv_1= 'disable' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            else if ( (LA25_0==30) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalDependencyModelLanguage.g:1156:3: ( (lv_isEnable_0_0= 'enable' ) )
                    {
                    // InternalDependencyModelLanguage.g:1156:3: ( (lv_isEnable_0_0= 'enable' ) )
                    // InternalDependencyModelLanguage.g:1157:1: (lv_isEnable_0_0= 'enable' )
                    {
                    // InternalDependencyModelLanguage.g:1157:1: (lv_isEnable_0_0= 'enable' )
                    // InternalDependencyModelLanguage.g:1158:3: lv_isEnable_0_0= 'enable'
                    {
                    lv_isEnable_0_0=(Token)match(input,29,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isEnable_0_0, grammarAccess.getEnableDisableEffectAccess().getIsEnableEnableKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEnableDisableEffectRule());
                      	        }
                             		setWithLastConsumed(current, "isEnable", true, "enable");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:1172:7: otherlv_1= 'disable'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEnableDisableEffectAccess().getDisableKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // InternalDependencyModelLanguage.g:1176:2: ( (lv_event_2_0= ruleEvent ) )
            // InternalDependencyModelLanguage.g:1177:1: (lv_event_2_0= ruleEvent )
            {
            // InternalDependencyModelLanguage.g:1177:1: (lv_event_2_0= ruleEvent )
            // InternalDependencyModelLanguage.g:1178:3: lv_event_2_0= ruleEvent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnableDisableEffectAccess().getEventEventParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_event_2_0=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnableDisableEffectRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_2_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.Event");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnableDisableEffect"


    // $ANTLR start "entryRuleDataAssignmentEffect"
    // InternalDependencyModelLanguage.g:1202:1: entryRuleDataAssignmentEffect returns [EObject current=null] : iv_ruleDataAssignmentEffect= ruleDataAssignmentEffect EOF ;
    public final EObject entryRuleDataAssignmentEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAssignmentEffect = null;


        try {
            // InternalDependencyModelLanguage.g:1203:2: (iv_ruleDataAssignmentEffect= ruleDataAssignmentEffect EOF )
            // InternalDependencyModelLanguage.g:1204:2: iv_ruleDataAssignmentEffect= ruleDataAssignmentEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataAssignmentEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDataAssignmentEffect=ruleDataAssignmentEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataAssignmentEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataAssignmentEffect"


    // $ANTLR start "ruleDataAssignmentEffect"
    // InternalDependencyModelLanguage.g:1211:1: ruleDataAssignmentEffect returns [EObject current=null] : (otherlv_0= 'assign' ( (lv_lhs_typedNamedElementExpression_1_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_4_0= ruleIncrementDecrementOperatorExpression ) ) ) ) ;
    public final EObject ruleDataAssignmentEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_lhs_typedNamedElementExpression_1_0 = null;

        Enumerator lv_assignOperator_2_0 = null;

        EObject lv_rhs_assignExpression_3_0 = null;

        Enumerator lv_incrementDecrementOperator_4_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:1214:28: ( (otherlv_0= 'assign' ( (lv_lhs_typedNamedElementExpression_1_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_4_0= ruleIncrementDecrementOperatorExpression ) ) ) ) )
            // InternalDependencyModelLanguage.g:1215:1: (otherlv_0= 'assign' ( (lv_lhs_typedNamedElementExpression_1_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_4_0= ruleIncrementDecrementOperatorExpression ) ) ) )
            {
            // InternalDependencyModelLanguage.g:1215:1: (otherlv_0= 'assign' ( (lv_lhs_typedNamedElementExpression_1_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_4_0= ruleIncrementDecrementOperatorExpression ) ) ) )
            // InternalDependencyModelLanguage.g:1215:3: otherlv_0= 'assign' ( (lv_lhs_typedNamedElementExpression_1_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_4_0= ruleIncrementDecrementOperatorExpression ) ) )
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDataAssignmentEffectAccess().getAssignKeyword_0());
                  
            }
            // InternalDependencyModelLanguage.g:1219:1: ( (lv_lhs_typedNamedElementExpression_1_0= ruleTypedNamedElementExpression ) )
            // InternalDependencyModelLanguage.g:1220:1: (lv_lhs_typedNamedElementExpression_1_0= ruleTypedNamedElementExpression )
            {
            // InternalDependencyModelLanguage.g:1220:1: (lv_lhs_typedNamedElementExpression_1_0= ruleTypedNamedElementExpression )
            // InternalDependencyModelLanguage.g:1221:3: lv_lhs_typedNamedElementExpression_1_0= ruleTypedNamedElementExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataAssignmentEffectAccess().getLhs_typedNamedElementExpressionTypedNamedElementExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_lhs_typedNamedElementExpression_1_0=ruleTypedNamedElementExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataAssignmentEffectRule());
              	        }
                     		set(
                     			current, 
                     			"lhs_typedNamedElementExpression",
                      		lv_lhs_typedNamedElementExpression_1_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.TypedNamedElementExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:1237:2: ( ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_4_0= ruleIncrementDecrementOperatorExpression ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==62||(LA26_0>=92 && LA26_0<=93)) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=90 && LA26_0<=91)) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalDependencyModelLanguage.g:1237:3: ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleInitializeExpression ) ) )
                    {
                    // InternalDependencyModelLanguage.g:1237:3: ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleInitializeExpression ) ) )
                    // InternalDependencyModelLanguage.g:1237:4: ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleInitializeExpression ) )
                    {
                    // InternalDependencyModelLanguage.g:1237:4: ( (lv_assignOperator_2_0= ruleAssignOperator ) )
                    // InternalDependencyModelLanguage.g:1238:1: (lv_assignOperator_2_0= ruleAssignOperator )
                    {
                    // InternalDependencyModelLanguage.g:1238:1: (lv_assignOperator_2_0= ruleAssignOperator )
                    // InternalDependencyModelLanguage.g:1239:3: lv_assignOperator_2_0= ruleAssignOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataAssignmentEffectAccess().getAssignOperatorAssignOperatorEnumRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_assignOperator_2_0=ruleAssignOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataAssignmentEffectRule());
                      	        }
                             		set(
                             			current, 
                             			"assignOperator",
                              		lv_assignOperator_2_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.AssignOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:1255:2: ( (lv_rhs_assignExpression_3_0= ruleInitializeExpression ) )
                    // InternalDependencyModelLanguage.g:1256:1: (lv_rhs_assignExpression_3_0= ruleInitializeExpression )
                    {
                    // InternalDependencyModelLanguage.g:1256:1: (lv_rhs_assignExpression_3_0= ruleInitializeExpression )
                    // InternalDependencyModelLanguage.g:1257:3: lv_rhs_assignExpression_3_0= ruleInitializeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataAssignmentEffectAccess().getRhs_assignExpressionInitializeExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_rhs_assignExpression_3_0=ruleInitializeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataAssignmentEffectRule());
                      	        }
                             		set(
                             			current, 
                             			"rhs_assignExpression",
                              		lv_rhs_assignExpression_3_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.InitializeExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:1274:6: ( (lv_incrementDecrementOperator_4_0= ruleIncrementDecrementOperatorExpression ) )
                    {
                    // InternalDependencyModelLanguage.g:1274:6: ( (lv_incrementDecrementOperator_4_0= ruleIncrementDecrementOperatorExpression ) )
                    // InternalDependencyModelLanguage.g:1275:1: (lv_incrementDecrementOperator_4_0= ruleIncrementDecrementOperatorExpression )
                    {
                    // InternalDependencyModelLanguage.g:1275:1: (lv_incrementDecrementOperator_4_0= ruleIncrementDecrementOperatorExpression )
                    // InternalDependencyModelLanguage.g:1276:3: lv_incrementDecrementOperator_4_0= ruleIncrementDecrementOperatorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataAssignmentEffectAccess().getIncrementDecrementOperatorIncrementDecrementOperatorExpressionEnumRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_incrementDecrementOperator_4_0=ruleIncrementDecrementOperatorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataAssignmentEffectRule());
                      	        }
                             		set(
                             			current, 
                             			"incrementDecrementOperator",
                              		lv_incrementDecrementOperator_4_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.IncrementDecrementOperatorExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataAssignmentEffect"


    // $ANTLR start "entryRuleClockResetEffect"
    // InternalDependencyModelLanguage.g:1300:1: entryRuleClockResetEffect returns [EObject current=null] : iv_ruleClockResetEffect= ruleClockResetEffect EOF ;
    public final EObject entryRuleClockResetEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClockResetEffect = null;


        try {
            // InternalDependencyModelLanguage.g:1301:2: (iv_ruleClockResetEffect= ruleClockResetEffect EOF )
            // InternalDependencyModelLanguage.g:1302:2: iv_ruleClockResetEffect= ruleClockResetEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClockResetEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClockResetEffect=ruleClockResetEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClockResetEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClockResetEffect"


    // $ANTLR start "ruleClockResetEffect"
    // InternalDependencyModelLanguage.g:1309:1: ruleClockResetEffect returns [EObject current=null] : (otherlv_0= 'reset clocks' ( ( ruleQualifiedName ) ) (otherlv_2= 'and' ( ( ruleQualifiedName ) ) )* ) ;
    public final EObject ruleClockResetEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:1312:28: ( (otherlv_0= 'reset clocks' ( ( ruleQualifiedName ) ) (otherlv_2= 'and' ( ( ruleQualifiedName ) ) )* ) )
            // InternalDependencyModelLanguage.g:1313:1: (otherlv_0= 'reset clocks' ( ( ruleQualifiedName ) ) (otherlv_2= 'and' ( ( ruleQualifiedName ) ) )* )
            {
            // InternalDependencyModelLanguage.g:1313:1: (otherlv_0= 'reset clocks' ( ( ruleQualifiedName ) ) (otherlv_2= 'and' ( ( ruleQualifiedName ) ) )* )
            // InternalDependencyModelLanguage.g:1313:3: otherlv_0= 'reset clocks' ( ( ruleQualifiedName ) ) (otherlv_2= 'and' ( ( ruleQualifiedName ) ) )*
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClockResetEffectAccess().getResetClocksKeyword_0());
                  
            }
            // InternalDependencyModelLanguage.g:1317:1: ( ( ruleQualifiedName ) )
            // InternalDependencyModelLanguage.g:1318:1: ( ruleQualifiedName )
            {
            // InternalDependencyModelLanguage.g:1318:1: ( ruleQualifiedName )
            // InternalDependencyModelLanguage.g:1319:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getClockResetEffectRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClockResetEffectAccess().getClocksClockCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_28);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:1335:2: (otherlv_2= 'and' ( ( ruleQualifiedName ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==33) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDependencyModelLanguage.g:1335:4: otherlv_2= 'and' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getClockResetEffectAccess().getAndKeyword_2_0());
            	          
            	    }
            	    // InternalDependencyModelLanguage.g:1339:1: ( ( ruleQualifiedName ) )
            	    // InternalDependencyModelLanguage.g:1340:1: ( ruleQualifiedName )
            	    {
            	    // InternalDependencyModelLanguage.g:1340:1: ( ruleQualifiedName )
            	    // InternalDependencyModelLanguage.g:1341:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getClockResetEffectRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClockResetEffectAccess().getClocksClockCrossReference_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClockResetEffect"


    // $ANTLR start "entryRuleDataMerge"
    // InternalDependencyModelLanguage.g:1365:1: entryRuleDataMerge returns [EObject current=null] : iv_ruleDataMerge= ruleDataMerge EOF ;
    public final EObject entryRuleDataMerge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataMerge = null;


        try {
            // InternalDependencyModelLanguage.g:1366:2: (iv_ruleDataMerge= ruleDataMerge EOF )
            // InternalDependencyModelLanguage.g:1367:2: iv_ruleDataMerge= ruleDataMerge EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataMergeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDataMerge=ruleDataMerge();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataMerge; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataMerge"


    // $ANTLR start "ruleDataMerge"
    // InternalDependencyModelLanguage.g:1374:1: ruleDataMerge returns [EObject current=null] : ( (otherlv_0= 'merge variable' ( ( ruleQualifiedName ) ) (otherlv_2= 'into variable' ( (lv_variableName_3_0= ruleEString ) ) )? ) | (otherlv_4= 'merge variables' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )+ (otherlv_8= 'into variable' ( (lv_variableName_9_0= ruleEString ) ) )? ) | (otherlv_10= 'merge variable' ( ( ruleQualifiedName ) ) otherlv_12= 'into hybridport' ( ( ruleQualifiedName ) ) ) | (otherlv_14= 'merge variables' ( ( ruleQualifiedName ) ) (otherlv_16= ',' ( ( ruleQualifiedName ) ) )+ otherlv_18= 'into hybridport' ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleDataMerge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_variableName_3_0 = null;

        AntlrDatatypeRuleToken lv_variableName_9_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:1377:28: ( ( (otherlv_0= 'merge variable' ( ( ruleQualifiedName ) ) (otherlv_2= 'into variable' ( (lv_variableName_3_0= ruleEString ) ) )? ) | (otherlv_4= 'merge variables' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )+ (otherlv_8= 'into variable' ( (lv_variableName_9_0= ruleEString ) ) )? ) | (otherlv_10= 'merge variable' ( ( ruleQualifiedName ) ) otherlv_12= 'into hybridport' ( ( ruleQualifiedName ) ) ) | (otherlv_14= 'merge variables' ( ( ruleQualifiedName ) ) (otherlv_16= ',' ( ( ruleQualifiedName ) ) )+ otherlv_18= 'into hybridport' ( ( ruleQualifiedName ) ) ) ) )
            // InternalDependencyModelLanguage.g:1378:1: ( (otherlv_0= 'merge variable' ( ( ruleQualifiedName ) ) (otherlv_2= 'into variable' ( (lv_variableName_3_0= ruleEString ) ) )? ) | (otherlv_4= 'merge variables' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )+ (otherlv_8= 'into variable' ( (lv_variableName_9_0= ruleEString ) ) )? ) | (otherlv_10= 'merge variable' ( ( ruleQualifiedName ) ) otherlv_12= 'into hybridport' ( ( ruleQualifiedName ) ) ) | (otherlv_14= 'merge variables' ( ( ruleQualifiedName ) ) (otherlv_16= ',' ( ( ruleQualifiedName ) ) )+ otherlv_18= 'into hybridport' ( ( ruleQualifiedName ) ) ) )
            {
            // InternalDependencyModelLanguage.g:1378:1: ( (otherlv_0= 'merge variable' ( ( ruleQualifiedName ) ) (otherlv_2= 'into variable' ( (lv_variableName_3_0= ruleEString ) ) )? ) | (otherlv_4= 'merge variables' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )+ (otherlv_8= 'into variable' ( (lv_variableName_9_0= ruleEString ) ) )? ) | (otherlv_10= 'merge variable' ( ( ruleQualifiedName ) ) otherlv_12= 'into hybridport' ( ( ruleQualifiedName ) ) ) | (otherlv_14= 'merge variables' ( ( ruleQualifiedName ) ) (otherlv_16= ',' ( ( ruleQualifiedName ) ) )+ otherlv_18= 'into hybridport' ( ( ruleQualifiedName ) ) ) )
            int alt32=4;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalDependencyModelLanguage.g:1378:2: (otherlv_0= 'merge variable' ( ( ruleQualifiedName ) ) (otherlv_2= 'into variable' ( (lv_variableName_3_0= ruleEString ) ) )? )
                    {
                    // InternalDependencyModelLanguage.g:1378:2: (otherlv_0= 'merge variable' ( ( ruleQualifiedName ) ) (otherlv_2= 'into variable' ( (lv_variableName_3_0= ruleEString ) ) )? )
                    // InternalDependencyModelLanguage.g:1378:4: otherlv_0= 'merge variable' ( ( ruleQualifiedName ) ) (otherlv_2= 'into variable' ( (lv_variableName_3_0= ruleEString ) ) )?
                    {
                    otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getDataMergeAccess().getMergeVariableKeyword_0_0());
                          
                    }
                    // InternalDependencyModelLanguage.g:1382:1: ( ( ruleQualifiedName ) )
                    // InternalDependencyModelLanguage.g:1383:1: ( ruleQualifiedName )
                    {
                    // InternalDependencyModelLanguage.g:1383:1: ( ruleQualifiedName )
                    // InternalDependencyModelLanguage.g:1384:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataMergeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataMergeAccess().getVariablesVariableCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:1400:2: (otherlv_2= 'into variable' ( (lv_variableName_3_0= ruleEString ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==35) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalDependencyModelLanguage.g:1400:4: otherlv_2= 'into variable' ( (lv_variableName_3_0= ruleEString ) )
                            {
                            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getDataMergeAccess().getIntoVariableKeyword_0_2_0());
                                  
                            }
                            // InternalDependencyModelLanguage.g:1404:1: ( (lv_variableName_3_0= ruleEString ) )
                            // InternalDependencyModelLanguage.g:1405:1: (lv_variableName_3_0= ruleEString )
                            {
                            // InternalDependencyModelLanguage.g:1405:1: (lv_variableName_3_0= ruleEString )
                            // InternalDependencyModelLanguage.g:1406:3: lv_variableName_3_0= ruleEString
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDataMergeAccess().getVariableNameEStringParserRuleCall_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_variableName_3_0=ruleEString();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDataMergeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"variableName",
                                      		lv_variableName_3_0, 
                                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.EString");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:1423:6: (otherlv_4= 'merge variables' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )+ (otherlv_8= 'into variable' ( (lv_variableName_9_0= ruleEString ) ) )? )
                    {
                    // InternalDependencyModelLanguage.g:1423:6: (otherlv_4= 'merge variables' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )+ (otherlv_8= 'into variable' ( (lv_variableName_9_0= ruleEString ) ) )? )
                    // InternalDependencyModelLanguage.g:1423:8: otherlv_4= 'merge variables' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )+ (otherlv_8= 'into variable' ( (lv_variableName_9_0= ruleEString ) ) )?
                    {
                    otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDataMergeAccess().getMergeVariablesKeyword_1_0());
                          
                    }
                    // InternalDependencyModelLanguage.g:1427:1: ( ( ruleQualifiedName ) )
                    // InternalDependencyModelLanguage.g:1428:1: ( ruleQualifiedName )
                    {
                    // InternalDependencyModelLanguage.g:1428:1: ( ruleQualifiedName )
                    // InternalDependencyModelLanguage.g:1429:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataMergeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataMergeAccess().getVariablesVariableCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:1445:2: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==16) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalDependencyModelLanguage.g:1445:4: otherlv_6= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getDataMergeAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalDependencyModelLanguage.g:1449:1: ( ( ruleQualifiedName ) )
                    	    // InternalDependencyModelLanguage.g:1450:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalDependencyModelLanguage.g:1450:1: ( ruleQualifiedName )
                    	    // InternalDependencyModelLanguage.g:1451:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getDataMergeRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDataMergeAccess().getVariablesVariableCrossReference_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_30);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);

                    // InternalDependencyModelLanguage.g:1467:4: (otherlv_8= 'into variable' ( (lv_variableName_9_0= ruleEString ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==35) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalDependencyModelLanguage.g:1467:6: otherlv_8= 'into variable' ( (lv_variableName_9_0= ruleEString ) )
                            {
                            otherlv_8=(Token)match(input,35,FollowSets000.FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getDataMergeAccess().getIntoVariableKeyword_1_3_0());
                                  
                            }
                            // InternalDependencyModelLanguage.g:1471:1: ( (lv_variableName_9_0= ruleEString ) )
                            // InternalDependencyModelLanguage.g:1472:1: (lv_variableName_9_0= ruleEString )
                            {
                            // InternalDependencyModelLanguage.g:1472:1: (lv_variableName_9_0= ruleEString )
                            // InternalDependencyModelLanguage.g:1473:3: lv_variableName_9_0= ruleEString
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDataMergeAccess().getVariableNameEStringParserRuleCall_1_3_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_variableName_9_0=ruleEString();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDataMergeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"variableName",
                                      		lv_variableName_9_0, 
                                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.EString");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:1490:6: (otherlv_10= 'merge variable' ( ( ruleQualifiedName ) ) otherlv_12= 'into hybridport' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalDependencyModelLanguage.g:1490:6: (otherlv_10= 'merge variable' ( ( ruleQualifiedName ) ) otherlv_12= 'into hybridport' ( ( ruleQualifiedName ) ) )
                    // InternalDependencyModelLanguage.g:1490:8: otherlv_10= 'merge variable' ( ( ruleQualifiedName ) ) otherlv_12= 'into hybridport' ( ( ruleQualifiedName ) )
                    {
                    otherlv_10=(Token)match(input,34,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getDataMergeAccess().getMergeVariableKeyword_2_0());
                          
                    }
                    // InternalDependencyModelLanguage.g:1494:1: ( ( ruleQualifiedName ) )
                    // InternalDependencyModelLanguage.g:1495:1: ( ruleQualifiedName )
                    {
                    // InternalDependencyModelLanguage.g:1495:1: ( ruleQualifiedName )
                    // InternalDependencyModelLanguage.g:1496:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataMergeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataMergeAccess().getVariablesVariableCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,37,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getDataMergeAccess().getIntoHybridportKeyword_2_2());
                          
                    }
                    // InternalDependencyModelLanguage.g:1516:1: ( ( ruleQualifiedName ) )
                    // InternalDependencyModelLanguage.g:1517:1: ( ruleQualifiedName )
                    {
                    // InternalDependencyModelLanguage.g:1517:1: ( ruleQualifiedName )
                    // InternalDependencyModelLanguage.g:1518:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataMergeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataMergeAccess().getPortHybridPortCrossReference_2_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDependencyModelLanguage.g:1535:6: (otherlv_14= 'merge variables' ( ( ruleQualifiedName ) ) (otherlv_16= ',' ( ( ruleQualifiedName ) ) )+ otherlv_18= 'into hybridport' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalDependencyModelLanguage.g:1535:6: (otherlv_14= 'merge variables' ( ( ruleQualifiedName ) ) (otherlv_16= ',' ( ( ruleQualifiedName ) ) )+ otherlv_18= 'into hybridport' ( ( ruleQualifiedName ) ) )
                    // InternalDependencyModelLanguage.g:1535:8: otherlv_14= 'merge variables' ( ( ruleQualifiedName ) ) (otherlv_16= ',' ( ( ruleQualifiedName ) ) )+ otherlv_18= 'into hybridport' ( ( ruleQualifiedName ) )
                    {
                    otherlv_14=(Token)match(input,36,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getDataMergeAccess().getMergeVariablesKeyword_3_0());
                          
                    }
                    // InternalDependencyModelLanguage.g:1539:1: ( ( ruleQualifiedName ) )
                    // InternalDependencyModelLanguage.g:1540:1: ( ruleQualifiedName )
                    {
                    // InternalDependencyModelLanguage.g:1540:1: ( ruleQualifiedName )
                    // InternalDependencyModelLanguage.g:1541:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataMergeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataMergeAccess().getVariablesVariableCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:1557:2: (otherlv_16= ',' ( ( ruleQualifiedName ) ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==16) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalDependencyModelLanguage.g:1557:4: otherlv_16= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_16, grammarAccess.getDataMergeAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // InternalDependencyModelLanguage.g:1561:1: ( ( ruleQualifiedName ) )
                    	    // InternalDependencyModelLanguage.g:1562:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalDependencyModelLanguage.g:1562:1: ( ruleQualifiedName )
                    	    // InternalDependencyModelLanguage.g:1563:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getDataMergeRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDataMergeAccess().getVariablesVariableCrossReference_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_32);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    otherlv_18=(Token)match(input,37,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getDataMergeAccess().getIntoHybridportKeyword_3_3());
                          
                    }
                    // InternalDependencyModelLanguage.g:1583:1: ( ( ruleQualifiedName ) )
                    // InternalDependencyModelLanguage.g:1584:1: ( ruleQualifiedName )
                    {
                    // InternalDependencyModelLanguage.g:1584:1: ( ruleQualifiedName )
                    // InternalDependencyModelLanguage.g:1585:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataMergeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataMergeAccess().getPortHybridPortCrossReference_3_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataMerge"


    // $ANTLR start "entryRuleClockMerge"
    // InternalDependencyModelLanguage.g:1609:1: entryRuleClockMerge returns [EObject current=null] : iv_ruleClockMerge= ruleClockMerge EOF ;
    public final EObject entryRuleClockMerge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClockMerge = null;


        try {
            // InternalDependencyModelLanguage.g:1610:2: (iv_ruleClockMerge= ruleClockMerge EOF )
            // InternalDependencyModelLanguage.g:1611:2: iv_ruleClockMerge= ruleClockMerge EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClockMergeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClockMerge=ruleClockMerge();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClockMerge; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClockMerge"


    // $ANTLR start "ruleClockMerge"
    // InternalDependencyModelLanguage.g:1618:1: ruleClockMerge returns [EObject current=null] : (otherlv_0= 'merge clocks' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )+ (otherlv_4= 'into' ( (lv_clockName_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleClockMerge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_clockName_5_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:1621:28: ( (otherlv_0= 'merge clocks' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )+ (otherlv_4= 'into' ( (lv_clockName_5_0= ruleEString ) ) )? ) )
            // InternalDependencyModelLanguage.g:1622:1: (otherlv_0= 'merge clocks' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )+ (otherlv_4= 'into' ( (lv_clockName_5_0= ruleEString ) ) )? )
            {
            // InternalDependencyModelLanguage.g:1622:1: (otherlv_0= 'merge clocks' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )+ (otherlv_4= 'into' ( (lv_clockName_5_0= ruleEString ) ) )? )
            // InternalDependencyModelLanguage.g:1622:3: otherlv_0= 'merge clocks' ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )+ (otherlv_4= 'into' ( (lv_clockName_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClockMergeAccess().getMergeClocksKeyword_0());
                  
            }
            // InternalDependencyModelLanguage.g:1626:1: ( ( ruleQualifiedName ) )
            // InternalDependencyModelLanguage.g:1627:1: ( ruleQualifiedName )
            {
            // InternalDependencyModelLanguage.g:1627:1: ( ruleQualifiedName )
            // InternalDependencyModelLanguage.g:1628:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getClockMergeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClockMergeAccess().getClocksClockCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:1644:2: (otherlv_2= ',' ( ( ruleQualifiedName ) ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==16) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalDependencyModelLanguage.g:1644:4: otherlv_2= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getClockMergeAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalDependencyModelLanguage.g:1648:1: ( ( ruleQualifiedName ) )
            	    // InternalDependencyModelLanguage.g:1649:1: ( ruleQualifiedName )
            	    {
            	    // InternalDependencyModelLanguage.g:1649:1: ( ruleQualifiedName )
            	    // InternalDependencyModelLanguage.g:1650:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getClockMergeRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClockMergeAccess().getClocksClockCrossReference_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_33);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            // InternalDependencyModelLanguage.g:1666:4: (otherlv_4= 'into' ( (lv_clockName_5_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDependencyModelLanguage.g:1666:6: otherlv_4= 'into' ( (lv_clockName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getClockMergeAccess().getIntoKeyword_3_0());
                          
                    }
                    // InternalDependencyModelLanguage.g:1670:1: ( (lv_clockName_5_0= ruleEString ) )
                    // InternalDependencyModelLanguage.g:1671:1: (lv_clockName_5_0= ruleEString )
                    {
                    // InternalDependencyModelLanguage.g:1671:1: (lv_clockName_5_0= ruleEString )
                    // InternalDependencyModelLanguage.g:1672:3: lv_clockName_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClockMergeAccess().getClockNameEStringParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_clockName_5_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClockMergeRule());
                      	        }
                             		set(
                             			current, 
                             			"clockName",
                              		lv_clockName_5_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClockMerge"


    // $ANTLR start "entryRuleEvent"
    // InternalDependencyModelLanguage.g:1696:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalDependencyModelLanguage.g:1697:2: (iv_ruleEvent= ruleEvent EOF )
            // InternalDependencyModelLanguage.g:1698:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalDependencyModelLanguage.g:1705:1: ruleEvent returns [EObject current=null] : (this_TransitionEvent_0= ruleTransitionEvent | this_StateEvent_1= ruleStateEvent | this_StateCombinationEvent_2= ruleStateCombinationEvent | this_MessageEvent_3= ruleMessageEvent ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_TransitionEvent_0 = null;

        EObject this_StateEvent_1 = null;

        EObject this_StateCombinationEvent_2 = null;

        EObject this_MessageEvent_3 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:1708:28: ( (this_TransitionEvent_0= ruleTransitionEvent | this_StateEvent_1= ruleStateEvent | this_StateCombinationEvent_2= ruleStateCombinationEvent | this_MessageEvent_3= ruleMessageEvent ) )
            // InternalDependencyModelLanguage.g:1709:1: (this_TransitionEvent_0= ruleTransitionEvent | this_StateEvent_1= ruleStateEvent | this_StateCombinationEvent_2= ruleStateCombinationEvent | this_MessageEvent_3= ruleMessageEvent )
            {
            // InternalDependencyModelLanguage.g:1709:1: (this_TransitionEvent_0= ruleTransitionEvent | this_StateEvent_1= ruleStateEvent | this_StateCombinationEvent_2= ruleStateCombinationEvent | this_MessageEvent_3= ruleMessageEvent )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt35=1;
                }
                break;
            case 84:
                {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==42) ) {
                    alt35=3;
                }
                else if ( (LA35_2==RULE_ID) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    throw nvae;
                }
                }
                break;
            case 85:
                {
                int LA35_3 = input.LA(2);

                if ( (LA35_3==42) ) {
                    alt35=3;
                }
                else if ( (LA35_3==RULE_ID) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 3, input);

                    throw nvae;
                }
                }
                break;
            case 88:
            case 89:
                {
                alt35=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalDependencyModelLanguage.g:1710:2: this_TransitionEvent_0= ruleTransitionEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventAccess().getTransitionEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TransitionEvent_0=ruleTransitionEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TransitionEvent_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:1723:2: this_StateEvent_1= ruleStateEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventAccess().getStateEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StateEvent_1=ruleStateEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StateEvent_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:1736:2: this_StateCombinationEvent_2= ruleStateCombinationEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventAccess().getStateCombinationEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StateCombinationEvent_2=ruleStateCombinationEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StateCombinationEvent_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalDependencyModelLanguage.g:1749:2: this_MessageEvent_3= ruleMessageEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventAccess().getMessageEventParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MessageEvent_3=ruleMessageEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MessageEvent_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleMessageEvent"
    // InternalDependencyModelLanguage.g:1768:1: entryRuleMessageEvent returns [EObject current=null] : iv_ruleMessageEvent= ruleMessageEvent EOF ;
    public final EObject entryRuleMessageEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageEvent = null;


        try {
            // InternalDependencyModelLanguage.g:1769:2: (iv_ruleMessageEvent= ruleMessageEvent EOF )
            // InternalDependencyModelLanguage.g:1770:2: iv_ruleMessageEvent= ruleMessageEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageEventRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMessageEvent=ruleMessageEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageEvent; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageEvent"


    // $ANTLR start "ruleMessageEvent"
    // InternalDependencyModelLanguage.g:1777:1: ruleMessageEvent returns [EObject current=null] : ( ( (lv_kind_0_0= ruleMessageEventKind ) ) ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleMessageEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_kind_0_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:1780:28: ( ( ( (lv_kind_0_0= ruleMessageEventKind ) ) ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDependencyModelLanguage.g:1781:1: ( ( (lv_kind_0_0= ruleMessageEventKind ) ) ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDependencyModelLanguage.g:1781:1: ( ( (lv_kind_0_0= ruleMessageEventKind ) ) ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (otherlv_3= RULE_ID ) ) )
            // InternalDependencyModelLanguage.g:1781:2: ( (lv_kind_0_0= ruleMessageEventKind ) ) ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )? ( (otherlv_3= RULE_ID ) )
            {
            // InternalDependencyModelLanguage.g:1781:2: ( (lv_kind_0_0= ruleMessageEventKind ) )
            // InternalDependencyModelLanguage.g:1782:1: (lv_kind_0_0= ruleMessageEventKind )
            {
            // InternalDependencyModelLanguage.g:1782:1: (lv_kind_0_0= ruleMessageEventKind )
            // InternalDependencyModelLanguage.g:1783:3: lv_kind_0_0= ruleMessageEventKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageEventAccess().getKindMessageEventKindEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_14);
            lv_kind_0_0=ruleMessageEventKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMessageEventRule());
              	        }
                     		set(
                     			current, 
                     			"kind",
                      		lv_kind_0_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.MessageEventKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:1799:2: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==40) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // InternalDependencyModelLanguage.g:1799:3: ( (otherlv_1= RULE_ID ) ) otherlv_2= '.'
                    {
                    // InternalDependencyModelLanguage.g:1799:3: ( (otherlv_1= RULE_ID ) )
                    // InternalDependencyModelLanguage.g:1800:1: (otherlv_1= RULE_ID )
                    {
                    // InternalDependencyModelLanguage.g:1800:1: (otherlv_1= RULE_ID )
                    // InternalDependencyModelLanguage.g:1801:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMessageEventRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getMessageEventAccess().getPortDiscretePortCrossReference_1_0_0()); 
                      	
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMessageEventAccess().getFullStopKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // InternalDependencyModelLanguage.g:1819:3: ( (otherlv_3= RULE_ID ) )
            // InternalDependencyModelLanguage.g:1820:1: (otherlv_3= RULE_ID )
            {
            // InternalDependencyModelLanguage.g:1820:1: (otherlv_3= RULE_ID )
            // InternalDependencyModelLanguage.g:1821:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMessageEventRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getMessageEventAccess().getTypeMessageTypeCrossReference_2_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageEvent"


    // $ANTLR start "entryRuleTransitionEvent"
    // InternalDependencyModelLanguage.g:1843:1: entryRuleTransitionEvent returns [EObject current=null] : iv_ruleTransitionEvent= ruleTransitionEvent EOF ;
    public final EObject entryRuleTransitionEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionEvent = null;


        try {
            // InternalDependencyModelLanguage.g:1844:2: (iv_ruleTransitionEvent= ruleTransitionEvent EOF )
            // InternalDependencyModelLanguage.g:1845:2: iv_ruleTransitionEvent= ruleTransitionEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionEventRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTransitionEvent=ruleTransitionEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionEvent; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionEvent"


    // $ANTLR start "ruleTransitionEvent"
    // InternalDependencyModelLanguage.g:1852:1: ruleTransitionEvent returns [EObject current=null] : (otherlv_0= 'transition' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTransitionEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:1855:28: ( (otherlv_0= 'transition' ( ( ruleQualifiedName ) ) ) )
            // InternalDependencyModelLanguage.g:1856:1: (otherlv_0= 'transition' ( ( ruleQualifiedName ) ) )
            {
            // InternalDependencyModelLanguage.g:1856:1: (otherlv_0= 'transition' ( ( ruleQualifiedName ) ) )
            // InternalDependencyModelLanguage.g:1856:3: otherlv_0= 'transition' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionEventAccess().getTransitionKeyword_0());
                  
            }
            // InternalDependencyModelLanguage.g:1860:1: ( ( ruleQualifiedName ) )
            // InternalDependencyModelLanguage.g:1861:1: ( ruleQualifiedName )
            {
            // InternalDependencyModelLanguage.g:1861:1: ( ruleQualifiedName )
            // InternalDependencyModelLanguage.g:1862:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionEventRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionEventAccess().getTransitionTransitionCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionEvent"


    // $ANTLR start "entryRuleStateEvent"
    // InternalDependencyModelLanguage.g:1886:1: entryRuleStateEvent returns [EObject current=null] : iv_ruleStateEvent= ruleStateEvent EOF ;
    public final EObject entryRuleStateEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateEvent = null;


        try {
            // InternalDependencyModelLanguage.g:1887:2: (iv_ruleStateEvent= ruleStateEvent EOF )
            // InternalDependencyModelLanguage.g:1888:2: iv_ruleStateEvent= ruleStateEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateEventRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStateEvent=ruleStateEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateEvent; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateEvent"


    // $ANTLR start "ruleStateEvent"
    // InternalDependencyModelLanguage.g:1895:1: ruleStateEvent returns [EObject current=null] : ( ( (lv_kind_0_0= ruleStateEventKind ) ) ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleStateEvent() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:1898:28: ( ( ( (lv_kind_0_0= ruleStateEventKind ) ) ( ( ruleQualifiedName ) ) ) )
            // InternalDependencyModelLanguage.g:1899:1: ( ( (lv_kind_0_0= ruleStateEventKind ) ) ( ( ruleQualifiedName ) ) )
            {
            // InternalDependencyModelLanguage.g:1899:1: ( ( (lv_kind_0_0= ruleStateEventKind ) ) ( ( ruleQualifiedName ) ) )
            // InternalDependencyModelLanguage.g:1899:2: ( (lv_kind_0_0= ruleStateEventKind ) ) ( ( ruleQualifiedName ) )
            {
            // InternalDependencyModelLanguage.g:1899:2: ( (lv_kind_0_0= ruleStateEventKind ) )
            // InternalDependencyModelLanguage.g:1900:1: (lv_kind_0_0= ruleStateEventKind )
            {
            // InternalDependencyModelLanguage.g:1900:1: (lv_kind_0_0= ruleStateEventKind )
            // InternalDependencyModelLanguage.g:1901:3: lv_kind_0_0= ruleStateEventKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateEventAccess().getKindStateEventKindEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_14);
            lv_kind_0_0=ruleStateEventKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStateEventRule());
              	        }
                     		set(
                     			current, 
                     			"kind",
                      		lv_kind_0_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.StateEventKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:1917:2: ( ( ruleQualifiedName ) )
            // InternalDependencyModelLanguage.g:1918:1: ( ruleQualifiedName )
            {
            // InternalDependencyModelLanguage.g:1918:1: ( ruleQualifiedName )
            // InternalDependencyModelLanguage.g:1919:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getStateEventRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateEventAccess().getStateStateCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateEvent"


    // $ANTLR start "entryRuleStateCombinationEvent"
    // InternalDependencyModelLanguage.g:1943:1: entryRuleStateCombinationEvent returns [EObject current=null] : iv_ruleStateCombinationEvent= ruleStateCombinationEvent EOF ;
    public final EObject entryRuleStateCombinationEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateCombinationEvent = null;


        try {
            // InternalDependencyModelLanguage.g:1944:2: (iv_ruleStateCombinationEvent= ruleStateCombinationEvent EOF )
            // InternalDependencyModelLanguage.g:1945:2: iv_ruleStateCombinationEvent= ruleStateCombinationEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateCombinationEventRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStateCombinationEvent=ruleStateCombinationEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateCombinationEvent; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateCombinationEvent"


    // $ANTLR start "ruleStateCombinationEvent"
    // InternalDependencyModelLanguage.g:1952:1: ruleStateCombinationEvent returns [EObject current=null] : ( ( (lv_kind_0_0= ruleStateEventKind ) ) otherlv_1= 'combination' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ ) ;
    public final EObject ruleStateCombinationEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_kind_0_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:1955:28: ( ( ( (lv_kind_0_0= ruleStateEventKind ) ) otherlv_1= 'combination' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ ) )
            // InternalDependencyModelLanguage.g:1956:1: ( ( (lv_kind_0_0= ruleStateEventKind ) ) otherlv_1= 'combination' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ )
            {
            // InternalDependencyModelLanguage.g:1956:1: ( ( (lv_kind_0_0= ruleStateEventKind ) ) otherlv_1= 'combination' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ )
            // InternalDependencyModelLanguage.g:1956:2: ( (lv_kind_0_0= ruleStateEventKind ) ) otherlv_1= 'combination' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+
            {
            // InternalDependencyModelLanguage.g:1956:2: ( (lv_kind_0_0= ruleStateEventKind ) )
            // InternalDependencyModelLanguage.g:1957:1: (lv_kind_0_0= ruleStateEventKind )
            {
            // InternalDependencyModelLanguage.g:1957:1: (lv_kind_0_0= ruleStateEventKind )
            // InternalDependencyModelLanguage.g:1958:3: lv_kind_0_0= ruleStateEventKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateCombinationEventAccess().getKindStateEventKindEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_35);
            lv_kind_0_0=ruleStateEventKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStateCombinationEventRule());
              	        }
                     		set(
                     			current, 
                     			"kind",
                      		lv_kind_0_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.StateEventKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStateCombinationEventAccess().getCombinationKeyword_1());
                  
            }
            // InternalDependencyModelLanguage.g:1978:1: ( ( ruleQualifiedName ) )
            // InternalDependencyModelLanguage.g:1979:1: ( ruleQualifiedName )
            {
            // InternalDependencyModelLanguage.g:1979:1: ( ruleQualifiedName )
            // InternalDependencyModelLanguage.g:1980:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getStateCombinationEventRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateCombinationEventAccess().getStatesStateCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:1996:2: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==16) ) {
                    int LA37_1 = input.LA(2);

                    if ( (LA37_1==RULE_ID) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalDependencyModelLanguage.g:1996:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getStateCombinationEventAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalDependencyModelLanguage.g:2000:1: ( ( ruleQualifiedName ) )
            	    // InternalDependencyModelLanguage.g:2001:1: ( ruleQualifiedName )
            	    {
            	    // InternalDependencyModelLanguage.g:2001:1: ( ruleQualifiedName )
            	    // InternalDependencyModelLanguage.g:2002:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getStateCombinationEventRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateCombinationEventAccess().getStatesStateCrossReference_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateCombinationEvent"


    // $ANTLR start "entryRuleSynchronizationEvent"
    // InternalDependencyModelLanguage.g:2026:1: entryRuleSynchronizationEvent returns [EObject current=null] : iv_ruleSynchronizationEvent= ruleSynchronizationEvent EOF ;
    public final EObject entryRuleSynchronizationEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSynchronizationEvent = null;


        try {
            // InternalDependencyModelLanguage.g:2027:2: (iv_ruleSynchronizationEvent= ruleSynchronizationEvent EOF )
            // InternalDependencyModelLanguage.g:2028:2: iv_ruleSynchronizationEvent= ruleSynchronizationEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSynchronizationEventRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSynchronizationEvent=ruleSynchronizationEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSynchronizationEvent; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSynchronizationEvent"


    // $ANTLR start "ruleSynchronizationEvent"
    // InternalDependencyModelLanguage.g:2035:1: ruleSynchronizationEvent returns [EObject current=null] : ( ( (lv_event_0_0= ruleEvent ) ) otherlv_1= '[' ( (lv_selectorExpression_2_0= ruleExpression ) ) otherlv_3= ']' ) ;
    public final EObject ruleSynchronizationEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_event_0_0 = null;

        EObject lv_selectorExpression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:2038:28: ( ( ( (lv_event_0_0= ruleEvent ) ) otherlv_1= '[' ( (lv_selectorExpression_2_0= ruleExpression ) ) otherlv_3= ']' ) )
            // InternalDependencyModelLanguage.g:2039:1: ( ( (lv_event_0_0= ruleEvent ) ) otherlv_1= '[' ( (lv_selectorExpression_2_0= ruleExpression ) ) otherlv_3= ']' )
            {
            // InternalDependencyModelLanguage.g:2039:1: ( ( (lv_event_0_0= ruleEvent ) ) otherlv_1= '[' ( (lv_selectorExpression_2_0= ruleExpression ) ) otherlv_3= ']' )
            // InternalDependencyModelLanguage.g:2039:2: ( (lv_event_0_0= ruleEvent ) ) otherlv_1= '[' ( (lv_selectorExpression_2_0= ruleExpression ) ) otherlv_3= ']'
            {
            // InternalDependencyModelLanguage.g:2039:2: ( (lv_event_0_0= ruleEvent ) )
            // InternalDependencyModelLanguage.g:2040:1: (lv_event_0_0= ruleEvent )
            {
            // InternalDependencyModelLanguage.g:2040:1: (lv_event_0_0= ruleEvent )
            // InternalDependencyModelLanguage.g:2041:3: lv_event_0_0= ruleEvent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSynchronizationEventAccess().getEventEventParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_18);
            lv_event_0_0=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSynchronizationEventRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_0_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.Event");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSynchronizationEventAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // InternalDependencyModelLanguage.g:2061:1: ( (lv_selectorExpression_2_0= ruleExpression ) )
            // InternalDependencyModelLanguage.g:2062:1: (lv_selectorExpression_2_0= ruleExpression )
            {
            // InternalDependencyModelLanguage.g:2062:1: (lv_selectorExpression_2_0= ruleExpression )
            // InternalDependencyModelLanguage.g:2063:3: lv_selectorExpression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSynchronizationEventAccess().getSelectorExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_selectorExpression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSynchronizationEventRule());
              	        }
                     		set(
                     			current, 
                     			"selectorExpression",
                      		lv_selectorExpression_2_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSynchronizationEventAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSynchronizationEvent"


    // $ANTLR start "entryRuleComplexEvent"
    // InternalDependencyModelLanguage.g:2091:1: entryRuleComplexEvent returns [EObject current=null] : iv_ruleComplexEvent= ruleComplexEvent EOF ;
    public final EObject entryRuleComplexEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexEvent = null;


        try {
            // InternalDependencyModelLanguage.g:2092:2: (iv_ruleComplexEvent= ruleComplexEvent EOF )
            // InternalDependencyModelLanguage.g:2093:2: iv_ruleComplexEvent= ruleComplexEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexEventRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComplexEvent=ruleComplexEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexEvent; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexEvent"


    // $ANTLR start "ruleComplexEvent"
    // InternalDependencyModelLanguage.g:2100:1: ruleComplexEvent returns [EObject current=null] : ( (otherlv_0= '(' (this_CompositionEvent_1= ruleCompositionEvent | this_CountedEvent_2= ruleCountedEvent | this_DelayedEvent_3= ruleDelayedEvent ) otherlv_4= ')' ) | this_Event_5= ruleEvent ) ;
    public final EObject ruleComplexEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_CompositionEvent_1 = null;

        EObject this_CountedEvent_2 = null;

        EObject this_DelayedEvent_3 = null;

        EObject this_Event_5 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:2103:28: ( ( (otherlv_0= '(' (this_CompositionEvent_1= ruleCompositionEvent | this_CountedEvent_2= ruleCountedEvent | this_DelayedEvent_3= ruleDelayedEvent ) otherlv_4= ')' ) | this_Event_5= ruleEvent ) )
            // InternalDependencyModelLanguage.g:2104:1: ( (otherlv_0= '(' (this_CompositionEvent_1= ruleCompositionEvent | this_CountedEvent_2= ruleCountedEvent | this_DelayedEvent_3= ruleDelayedEvent ) otherlv_4= ')' ) | this_Event_5= ruleEvent )
            {
            // InternalDependencyModelLanguage.g:2104:1: ( (otherlv_0= '(' (this_CompositionEvent_1= ruleCompositionEvent | this_CountedEvent_2= ruleCountedEvent | this_DelayedEvent_3= ruleDelayedEvent ) otherlv_4= ')' ) | this_Event_5= ruleEvent )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                alt39=1;
            }
            else if ( (LA39_0==41||(LA39_0>=84 && LA39_0<=85)||(LA39_0>=88 && LA39_0<=89)) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalDependencyModelLanguage.g:2104:2: (otherlv_0= '(' (this_CompositionEvent_1= ruleCompositionEvent | this_CountedEvent_2= ruleCountedEvent | this_DelayedEvent_3= ruleDelayedEvent ) otherlv_4= ')' )
                    {
                    // InternalDependencyModelLanguage.g:2104:2: (otherlv_0= '(' (this_CompositionEvent_1= ruleCompositionEvent | this_CountedEvent_2= ruleCountedEvent | this_DelayedEvent_3= ruleDelayedEvent ) otherlv_4= ')' )
                    // InternalDependencyModelLanguage.g:2104:4: otherlv_0= '(' (this_CompositionEvent_1= ruleCompositionEvent | this_CountedEvent_2= ruleCountedEvent | this_DelayedEvent_3= ruleDelayedEvent ) otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getComplexEventAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // InternalDependencyModelLanguage.g:2108:1: (this_CompositionEvent_1= ruleCompositionEvent | this_CountedEvent_2= ruleCountedEvent | this_DelayedEvent_3= ruleDelayedEvent )
                    int alt38=3;
                    alt38 = dfa38.predict(input);
                    switch (alt38) {
                        case 1 :
                            // InternalDependencyModelLanguage.g:2109:2: this_CompositionEvent_1= ruleCompositionEvent
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getComplexEventAccess().getCompositionEventParserRuleCall_0_1_0()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_36);
                            this_CompositionEvent_1=ruleCompositionEvent();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_CompositionEvent_1; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalDependencyModelLanguage.g:2122:2: this_CountedEvent_2= ruleCountedEvent
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getComplexEventAccess().getCountedEventParserRuleCall_0_1_1()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_36);
                            this_CountedEvent_2=ruleCountedEvent();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_CountedEvent_2; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 3 :
                            // InternalDependencyModelLanguage.g:2135:2: this_DelayedEvent_3= ruleDelayedEvent
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getComplexEventAccess().getDelayedEventParserRuleCall_0_1_2()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_36);
                            this_DelayedEvent_3=ruleDelayedEvent();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_DelayedEvent_3; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getComplexEventAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:2152:2: this_Event_5= ruleEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexEventAccess().getEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Event_5=ruleEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Event_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexEvent"


    // $ANTLR start "entryRuleCompositionEvent"
    // InternalDependencyModelLanguage.g:2171:1: entryRuleCompositionEvent returns [EObject current=null] : iv_ruleCompositionEvent= ruleCompositionEvent EOF ;
    public final EObject entryRuleCompositionEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionEvent = null;


        try {
            // InternalDependencyModelLanguage.g:2172:2: (iv_ruleCompositionEvent= ruleCompositionEvent EOF )
            // InternalDependencyModelLanguage.g:2173:2: iv_ruleCompositionEvent= ruleCompositionEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositionEventRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompositionEvent=ruleCompositionEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositionEvent; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositionEvent"


    // $ANTLR start "ruleCompositionEvent"
    // InternalDependencyModelLanguage.g:2180:1: ruleCompositionEvent returns [EObject current=null] : ( ( (lv_leftEvent_0_0= ruleComplexEvent ) ) ( (lv_kind_1_0= ruleLogicOperator ) ) ( (lv_rightEvent_2_0= ruleComplexEvent ) ) ) ;
    public final EObject ruleCompositionEvent() throws RecognitionException {
        EObject current = null;

        EObject lv_leftEvent_0_0 = null;

        Enumerator lv_kind_1_0 = null;

        EObject lv_rightEvent_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:2183:28: ( ( ( (lv_leftEvent_0_0= ruleComplexEvent ) ) ( (lv_kind_1_0= ruleLogicOperator ) ) ( (lv_rightEvent_2_0= ruleComplexEvent ) ) ) )
            // InternalDependencyModelLanguage.g:2184:1: ( ( (lv_leftEvent_0_0= ruleComplexEvent ) ) ( (lv_kind_1_0= ruleLogicOperator ) ) ( (lv_rightEvent_2_0= ruleComplexEvent ) ) )
            {
            // InternalDependencyModelLanguage.g:2184:1: ( ( (lv_leftEvent_0_0= ruleComplexEvent ) ) ( (lv_kind_1_0= ruleLogicOperator ) ) ( (lv_rightEvent_2_0= ruleComplexEvent ) ) )
            // InternalDependencyModelLanguage.g:2184:2: ( (lv_leftEvent_0_0= ruleComplexEvent ) ) ( (lv_kind_1_0= ruleLogicOperator ) ) ( (lv_rightEvent_2_0= ruleComplexEvent ) )
            {
            // InternalDependencyModelLanguage.g:2184:2: ( (lv_leftEvent_0_0= ruleComplexEvent ) )
            // InternalDependencyModelLanguage.g:2185:1: (lv_leftEvent_0_0= ruleComplexEvent )
            {
            // InternalDependencyModelLanguage.g:2185:1: (lv_leftEvent_0_0= ruleComplexEvent )
            // InternalDependencyModelLanguage.g:2186:3: lv_leftEvent_0_0= ruleComplexEvent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositionEventAccess().getLeftEventComplexEventParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_37);
            lv_leftEvent_0_0=ruleComplexEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositionEventRule());
              	        }
                     		set(
                     			current, 
                     			"leftEvent",
                      		lv_leftEvent_0_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.ComplexEvent");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:2202:2: ( (lv_kind_1_0= ruleLogicOperator ) )
            // InternalDependencyModelLanguage.g:2203:1: (lv_kind_1_0= ruleLogicOperator )
            {
            // InternalDependencyModelLanguage.g:2203:1: (lv_kind_1_0= ruleLogicOperator )
            // InternalDependencyModelLanguage.g:2204:3: lv_kind_1_0= ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositionEventAccess().getKindLogicOperatorEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_kind_1_0=ruleLogicOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositionEventRule());
              	        }
                     		set(
                     			current, 
                     			"kind",
                      		lv_kind_1_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.LogicOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:2220:2: ( (lv_rightEvent_2_0= ruleComplexEvent ) )
            // InternalDependencyModelLanguage.g:2221:1: (lv_rightEvent_2_0= ruleComplexEvent )
            {
            // InternalDependencyModelLanguage.g:2221:1: (lv_rightEvent_2_0= ruleComplexEvent )
            // InternalDependencyModelLanguage.g:2222:3: lv_rightEvent_2_0= ruleComplexEvent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositionEventAccess().getRightEventComplexEventParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_rightEvent_2_0=ruleComplexEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositionEventRule());
              	        }
                     		set(
                     			current, 
                     			"rightEvent",
                      		lv_rightEvent_2_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.ComplexEvent");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositionEvent"


    // $ANTLR start "entryRuleCountedEvent"
    // InternalDependencyModelLanguage.g:2246:1: entryRuleCountedEvent returns [EObject current=null] : iv_ruleCountedEvent= ruleCountedEvent EOF ;
    public final EObject entryRuleCountedEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountedEvent = null;


        try {
            // InternalDependencyModelLanguage.g:2247:2: (iv_ruleCountedEvent= ruleCountedEvent EOF )
            // InternalDependencyModelLanguage.g:2248:2: iv_ruleCountedEvent= ruleCountedEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCountedEventRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCountedEvent=ruleCountedEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCountedEvent; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCountedEvent"


    // $ANTLR start "ruleCountedEvent"
    // InternalDependencyModelLanguage.g:2255:1: ruleCountedEvent returns [EObject current=null] : ( ( (lv_event_0_0= ruleComplexEvent ) ) otherlv_1= 'when counted' ( (lv_counter_2_0= ruleEInt ) ) otherlv_3= 'times' ) ;
    public final EObject ruleCountedEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_event_0_0 = null;

        AntlrDatatypeRuleToken lv_counter_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:2258:28: ( ( ( (lv_event_0_0= ruleComplexEvent ) ) otherlv_1= 'when counted' ( (lv_counter_2_0= ruleEInt ) ) otherlv_3= 'times' ) )
            // InternalDependencyModelLanguage.g:2259:1: ( ( (lv_event_0_0= ruleComplexEvent ) ) otherlv_1= 'when counted' ( (lv_counter_2_0= ruleEInt ) ) otherlv_3= 'times' )
            {
            // InternalDependencyModelLanguage.g:2259:1: ( ( (lv_event_0_0= ruleComplexEvent ) ) otherlv_1= 'when counted' ( (lv_counter_2_0= ruleEInt ) ) otherlv_3= 'times' )
            // InternalDependencyModelLanguage.g:2259:2: ( (lv_event_0_0= ruleComplexEvent ) ) otherlv_1= 'when counted' ( (lv_counter_2_0= ruleEInt ) ) otherlv_3= 'times'
            {
            // InternalDependencyModelLanguage.g:2259:2: ( (lv_event_0_0= ruleComplexEvent ) )
            // InternalDependencyModelLanguage.g:2260:1: (lv_event_0_0= ruleComplexEvent )
            {
            // InternalDependencyModelLanguage.g:2260:1: (lv_event_0_0= ruleComplexEvent )
            // InternalDependencyModelLanguage.g:2261:3: lv_event_0_0= ruleComplexEvent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCountedEventAccess().getEventComplexEventParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_38);
            lv_event_0_0=ruleComplexEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCountedEventRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_0_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.ComplexEvent");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCountedEventAccess().getWhenCountedKeyword_1());
                  
            }
            // InternalDependencyModelLanguage.g:2281:1: ( (lv_counter_2_0= ruleEInt ) )
            // InternalDependencyModelLanguage.g:2282:1: (lv_counter_2_0= ruleEInt )
            {
            // InternalDependencyModelLanguage.g:2282:1: (lv_counter_2_0= ruleEInt )
            // InternalDependencyModelLanguage.g:2283:3: lv_counter_2_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCountedEventAccess().getCounterEIntParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_40);
            lv_counter_2_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCountedEventRule());
              	        }
                     		set(
                     			current, 
                     			"counter",
                      		lv_counter_2_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.EInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCountedEventAccess().getTimesKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCountedEvent"


    // $ANTLR start "entryRuleDelayedEvent"
    // InternalDependencyModelLanguage.g:2311:1: entryRuleDelayedEvent returns [EObject current=null] : iv_ruleDelayedEvent= ruleDelayedEvent EOF ;
    public final EObject entryRuleDelayedEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayedEvent = null;


        try {
            // InternalDependencyModelLanguage.g:2312:2: (iv_ruleDelayedEvent= ruleDelayedEvent EOF )
            // InternalDependencyModelLanguage.g:2313:2: iv_ruleDelayedEvent= ruleDelayedEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDelayedEventRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDelayedEvent=ruleDelayedEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDelayedEvent; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelayedEvent"


    // $ANTLR start "ruleDelayedEvent"
    // InternalDependencyModelLanguage.g:2320:1: ruleDelayedEvent returns [EObject current=null] : ( ( (lv_event_0_0= ruleComplexEvent ) ) otherlv_1= 'delayed by' ( (lv_delay_2_0= ruleTimeValue ) ) ) ;
    public final EObject ruleDelayedEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_event_0_0 = null;

        EObject lv_delay_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:2323:28: ( ( ( (lv_event_0_0= ruleComplexEvent ) ) otherlv_1= 'delayed by' ( (lv_delay_2_0= ruleTimeValue ) ) ) )
            // InternalDependencyModelLanguage.g:2324:1: ( ( (lv_event_0_0= ruleComplexEvent ) ) otherlv_1= 'delayed by' ( (lv_delay_2_0= ruleTimeValue ) ) )
            {
            // InternalDependencyModelLanguage.g:2324:1: ( ( (lv_event_0_0= ruleComplexEvent ) ) otherlv_1= 'delayed by' ( (lv_delay_2_0= ruleTimeValue ) ) )
            // InternalDependencyModelLanguage.g:2324:2: ( (lv_event_0_0= ruleComplexEvent ) ) otherlv_1= 'delayed by' ( (lv_delay_2_0= ruleTimeValue ) )
            {
            // InternalDependencyModelLanguage.g:2324:2: ( (lv_event_0_0= ruleComplexEvent ) )
            // InternalDependencyModelLanguage.g:2325:1: (lv_event_0_0= ruleComplexEvent )
            {
            // InternalDependencyModelLanguage.g:2325:1: (lv_event_0_0= ruleComplexEvent )
            // InternalDependencyModelLanguage.g:2326:3: lv_event_0_0= ruleComplexEvent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDelayedEventAccess().getEventComplexEventParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_41);
            lv_event_0_0=ruleComplexEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDelayedEventRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_0_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.ComplexEvent");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDelayedEventAccess().getDelayedByKeyword_1());
                  
            }
            // InternalDependencyModelLanguage.g:2346:1: ( (lv_delay_2_0= ruleTimeValue ) )
            // InternalDependencyModelLanguage.g:2347:1: (lv_delay_2_0= ruleTimeValue )
            {
            // InternalDependencyModelLanguage.g:2347:1: (lv_delay_2_0= ruleTimeValue )
            // InternalDependencyModelLanguage.g:2348:3: lv_delay_2_0= ruleTimeValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDelayedEventAccess().getDelayTimeValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_delay_2_0=ruleTimeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDelayedEventRule());
              	        }
                     		set(
                     			current, 
                     			"delay",
                      		lv_delay_2_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.TimeValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelayedEvent"


    // $ANTLR start "entryRuleCondition"
    // InternalDependencyModelLanguage.g:2372:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalDependencyModelLanguage.g:2373:2: (iv_ruleCondition= ruleCondition EOF )
            // InternalDependencyModelLanguage.g:2374:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalDependencyModelLanguage.g:2381:1: ruleCondition returns [EObject current=null] : this_CompositionOrCondition_0= ruleCompositionOrCondition ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_CompositionOrCondition_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:2384:28: (this_CompositionOrCondition_0= ruleCompositionOrCondition )
            // InternalDependencyModelLanguage.g:2386:2: this_CompositionOrCondition_0= ruleCompositionOrCondition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionAccess().getCompositionOrConditionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_CompositionOrCondition_0=ruleCompositionOrCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompositionOrCondition_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleCompositionOrCondition"
    // InternalDependencyModelLanguage.g:2405:1: entryRuleCompositionOrCondition returns [EObject current=null] : iv_ruleCompositionOrCondition= ruleCompositionOrCondition EOF ;
    public final EObject entryRuleCompositionOrCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionOrCondition = null;


        try {
            // InternalDependencyModelLanguage.g:2406:2: (iv_ruleCompositionOrCondition= ruleCompositionOrCondition EOF )
            // InternalDependencyModelLanguage.g:2407:2: iv_ruleCompositionOrCondition= ruleCompositionOrCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositionOrConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompositionOrCondition=ruleCompositionOrCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositionOrCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositionOrCondition"


    // $ANTLR start "ruleCompositionOrCondition"
    // InternalDependencyModelLanguage.g:2414:1: ruleCompositionOrCondition returns [EObject current=null] : (this_CompositionAndCondition_0= ruleCompositionAndCondition ( () ( (lv_kind_2_0= ruleOrOperator ) ) ( (lv_rightCondition_3_0= ruleCompositionOrCondition ) ) )? ) ;
    public final EObject ruleCompositionOrCondition() throws RecognitionException {
        EObject current = null;

        EObject this_CompositionAndCondition_0 = null;

        Enumerator lv_kind_2_0 = null;

        EObject lv_rightCondition_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:2417:28: ( (this_CompositionAndCondition_0= ruleCompositionAndCondition ( () ( (lv_kind_2_0= ruleOrOperator ) ) ( (lv_rightCondition_3_0= ruleCompositionOrCondition ) ) )? ) )
            // InternalDependencyModelLanguage.g:2418:1: (this_CompositionAndCondition_0= ruleCompositionAndCondition ( () ( (lv_kind_2_0= ruleOrOperator ) ) ( (lv_rightCondition_3_0= ruleCompositionOrCondition ) ) )? )
            {
            // InternalDependencyModelLanguage.g:2418:1: (this_CompositionAndCondition_0= ruleCompositionAndCondition ( () ( (lv_kind_2_0= ruleOrOperator ) ) ( (lv_rightCondition_3_0= ruleCompositionOrCondition ) ) )? )
            // InternalDependencyModelLanguage.g:2419:2: this_CompositionAndCondition_0= ruleCompositionAndCondition ( () ( (lv_kind_2_0= ruleOrOperator ) ) ( (lv_rightCondition_3_0= ruleCompositionOrCondition ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompositionOrConditionAccess().getCompositionAndConditionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_43);
            this_CompositionAndCondition_0=ruleCompositionAndCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompositionAndCondition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalDependencyModelLanguage.g:2430:1: ( () ( (lv_kind_2_0= ruleOrOperator ) ) ( (lv_rightCondition_3_0= ruleCompositionOrCondition ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==74) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDependencyModelLanguage.g:2430:2: () ( (lv_kind_2_0= ruleOrOperator ) ) ( (lv_rightCondition_3_0= ruleCompositionOrCondition ) )
                    {
                    // InternalDependencyModelLanguage.g:2430:2: ()
                    // InternalDependencyModelLanguage.g:2431:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompositionOrConditionAccess().getCompositionConditionLeftConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalDependencyModelLanguage.g:2439:2: ( (lv_kind_2_0= ruleOrOperator ) )
                    // InternalDependencyModelLanguage.g:2440:1: (lv_kind_2_0= ruleOrOperator )
                    {
                    // InternalDependencyModelLanguage.g:2440:1: (lv_kind_2_0= ruleOrOperator )
                    // InternalDependencyModelLanguage.g:2441:3: lv_kind_2_0= ruleOrOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositionOrConditionAccess().getKindOrOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    lv_kind_2_0=ruleOrOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositionOrConditionRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_2_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.OrOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:2457:2: ( (lv_rightCondition_3_0= ruleCompositionOrCondition ) )
                    // InternalDependencyModelLanguage.g:2458:1: (lv_rightCondition_3_0= ruleCompositionOrCondition )
                    {
                    // InternalDependencyModelLanguage.g:2458:1: (lv_rightCondition_3_0= ruleCompositionOrCondition )
                    // InternalDependencyModelLanguage.g:2459:3: lv_rightCondition_3_0= ruleCompositionOrCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositionOrConditionAccess().getRightConditionCompositionOrConditionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_rightCondition_3_0=ruleCompositionOrCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositionOrConditionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightCondition",
                              		lv_rightCondition_3_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.CompositionOrCondition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositionOrCondition"


    // $ANTLR start "entryRuleCompositionAndCondition"
    // InternalDependencyModelLanguage.g:2483:1: entryRuleCompositionAndCondition returns [EObject current=null] : iv_ruleCompositionAndCondition= ruleCompositionAndCondition EOF ;
    public final EObject entryRuleCompositionAndCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionAndCondition = null;


        try {
            // InternalDependencyModelLanguage.g:2484:2: (iv_ruleCompositionAndCondition= ruleCompositionAndCondition EOF )
            // InternalDependencyModelLanguage.g:2485:2: iv_ruleCompositionAndCondition= ruleCompositionAndCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositionAndConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompositionAndCondition=ruleCompositionAndCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositionAndCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositionAndCondition"


    // $ANTLR start "ruleCompositionAndCondition"
    // InternalDependencyModelLanguage.g:2492:1: ruleCompositionAndCondition returns [EObject current=null] : (this_ConditionWithoutKeyword_0= ruleConditionWithoutKeyword ( () ( (lv_kind_2_0= ruleAndOperator ) ) ( (lv_rightCondition_3_0= ruleCompositionAndCondition ) ) )? ) ;
    public final EObject ruleCompositionAndCondition() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionWithoutKeyword_0 = null;

        Enumerator lv_kind_2_0 = null;

        EObject lv_rightCondition_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:2495:28: ( (this_ConditionWithoutKeyword_0= ruleConditionWithoutKeyword ( () ( (lv_kind_2_0= ruleAndOperator ) ) ( (lv_rightCondition_3_0= ruleCompositionAndCondition ) ) )? ) )
            // InternalDependencyModelLanguage.g:2496:1: (this_ConditionWithoutKeyword_0= ruleConditionWithoutKeyword ( () ( (lv_kind_2_0= ruleAndOperator ) ) ( (lv_rightCondition_3_0= ruleCompositionAndCondition ) ) )? )
            {
            // InternalDependencyModelLanguage.g:2496:1: (this_ConditionWithoutKeyword_0= ruleConditionWithoutKeyword ( () ( (lv_kind_2_0= ruleAndOperator ) ) ( (lv_rightCondition_3_0= ruleCompositionAndCondition ) ) )? )
            // InternalDependencyModelLanguage.g:2497:2: this_ConditionWithoutKeyword_0= ruleConditionWithoutKeyword ( () ( (lv_kind_2_0= ruleAndOperator ) ) ( (lv_rightCondition_3_0= ruleCompositionAndCondition ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompositionAndConditionAccess().getConditionWithoutKeywordParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_28);
            this_ConditionWithoutKeyword_0=ruleConditionWithoutKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionWithoutKeyword_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalDependencyModelLanguage.g:2508:1: ( () ( (lv_kind_2_0= ruleAndOperator ) ) ( (lv_rightCondition_3_0= ruleCompositionAndCondition ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==33) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDependencyModelLanguage.g:2508:2: () ( (lv_kind_2_0= ruleAndOperator ) ) ( (lv_rightCondition_3_0= ruleCompositionAndCondition ) )
                    {
                    // InternalDependencyModelLanguage.g:2508:2: ()
                    // InternalDependencyModelLanguage.g:2509:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompositionAndConditionAccess().getCompositionConditionLeftConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalDependencyModelLanguage.g:2517:2: ( (lv_kind_2_0= ruleAndOperator ) )
                    // InternalDependencyModelLanguage.g:2518:1: (lv_kind_2_0= ruleAndOperator )
                    {
                    // InternalDependencyModelLanguage.g:2518:1: (lv_kind_2_0= ruleAndOperator )
                    // InternalDependencyModelLanguage.g:2519:3: lv_kind_2_0= ruleAndOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositionAndConditionAccess().getKindAndOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    lv_kind_2_0=ruleAndOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositionAndConditionRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_2_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.AndOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:2535:2: ( (lv_rightCondition_3_0= ruleCompositionAndCondition ) )
                    // InternalDependencyModelLanguage.g:2536:1: (lv_rightCondition_3_0= ruleCompositionAndCondition )
                    {
                    // InternalDependencyModelLanguage.g:2536:1: (lv_rightCondition_3_0= ruleCompositionAndCondition )
                    // InternalDependencyModelLanguage.g:2537:3: lv_rightCondition_3_0= ruleCompositionAndCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositionAndConditionAccess().getRightConditionCompositionAndConditionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_rightCondition_3_0=ruleCompositionAndCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositionAndConditionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightCondition",
                              		lv_rightCondition_3_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.CompositionAndCondition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositionAndCondition"


    // $ANTLR start "entryRuleConditionWithoutKeyword"
    // InternalDependencyModelLanguage.g:2561:1: entryRuleConditionWithoutKeyword returns [EObject current=null] : iv_ruleConditionWithoutKeyword= ruleConditionWithoutKeyword EOF ;
    public final EObject entryRuleConditionWithoutKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionWithoutKeyword = null;


        try {
            // InternalDependencyModelLanguage.g:2562:2: (iv_ruleConditionWithoutKeyword= ruleConditionWithoutKeyword EOF )
            // InternalDependencyModelLanguage.g:2563:2: iv_ruleConditionWithoutKeyword= ruleConditionWithoutKeyword EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionWithoutKeywordRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConditionWithoutKeyword=ruleConditionWithoutKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionWithoutKeyword; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionWithoutKeyword"


    // $ANTLR start "ruleConditionWithoutKeyword"
    // InternalDependencyModelLanguage.g:2570:1: ruleConditionWithoutKeyword returns [EObject current=null] : (otherlv_0= '[' (this_ClockCondition_1= ruleClockCondition | this_StateStatusCondition_2= ruleStateStatusCondition | this_EventConstrainedIntervalCondition_3= ruleEventConstrainedIntervalCondition | this_DataCondition_4= ruleDataCondition | this_CompositionOrCondition_5= ruleCompositionOrCondition ) otherlv_6= ']' ) ;
    public final EObject ruleConditionWithoutKeyword() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_6=null;
        EObject this_ClockCondition_1 = null;

        EObject this_StateStatusCondition_2 = null;

        EObject this_EventConstrainedIntervalCondition_3 = null;

        EObject this_DataCondition_4 = null;

        EObject this_CompositionOrCondition_5 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:2573:28: ( (otherlv_0= '[' (this_ClockCondition_1= ruleClockCondition | this_StateStatusCondition_2= ruleStateStatusCondition | this_EventConstrainedIntervalCondition_3= ruleEventConstrainedIntervalCondition | this_DataCondition_4= ruleDataCondition | this_CompositionOrCondition_5= ruleCompositionOrCondition ) otherlv_6= ']' ) )
            // InternalDependencyModelLanguage.g:2574:1: (otherlv_0= '[' (this_ClockCondition_1= ruleClockCondition | this_StateStatusCondition_2= ruleStateStatusCondition | this_EventConstrainedIntervalCondition_3= ruleEventConstrainedIntervalCondition | this_DataCondition_4= ruleDataCondition | this_CompositionOrCondition_5= ruleCompositionOrCondition ) otherlv_6= ']' )
            {
            // InternalDependencyModelLanguage.g:2574:1: (otherlv_0= '[' (this_ClockCondition_1= ruleClockCondition | this_StateStatusCondition_2= ruleStateStatusCondition | this_EventConstrainedIntervalCondition_3= ruleEventConstrainedIntervalCondition | this_DataCondition_4= ruleDataCondition | this_CompositionOrCondition_5= ruleCompositionOrCondition ) otherlv_6= ']' )
            // InternalDependencyModelLanguage.g:2574:3: otherlv_0= '[' (this_ClockCondition_1= ruleClockCondition | this_StateStatusCondition_2= ruleStateStatusCondition | this_EventConstrainedIntervalCondition_3= ruleEventConstrainedIntervalCondition | this_DataCondition_4= ruleDataCondition | this_CompositionOrCondition_5= ruleCompositionOrCondition ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConditionWithoutKeywordAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // InternalDependencyModelLanguage.g:2578:1: (this_ClockCondition_1= ruleClockCondition | this_StateStatusCondition_2= ruleStateStatusCondition | this_EventConstrainedIntervalCondition_3= ruleEventConstrainedIntervalCondition | this_DataCondition_4= ruleDataCondition | this_CompositionOrCondition_5= ruleCompositionOrCondition )
            int alt42=5;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalDependencyModelLanguage.g:2579:2: this_ClockCondition_1= ruleClockCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionWithoutKeywordAccess().getClockConditionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    this_ClockCondition_1=ruleClockCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClockCondition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:2592:2: this_StateStatusCondition_2= ruleStateStatusCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionWithoutKeywordAccess().getStateStatusConditionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    this_StateStatusCondition_2=ruleStateStatusCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StateStatusCondition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:2605:2: this_EventConstrainedIntervalCondition_3= ruleEventConstrainedIntervalCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionWithoutKeywordAccess().getEventConstrainedIntervalConditionParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    this_EventConstrainedIntervalCondition_3=ruleEventConstrainedIntervalCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EventConstrainedIntervalCondition_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalDependencyModelLanguage.g:2618:2: this_DataCondition_4= ruleDataCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionWithoutKeywordAccess().getDataConditionParserRuleCall_1_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    this_DataCondition_4=ruleDataCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataCondition_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalDependencyModelLanguage.g:2631:2: this_CompositionOrCondition_5= ruleCompositionOrCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionWithoutKeywordAccess().getCompositionOrConditionParserRuleCall_1_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    this_CompositionOrCondition_5=ruleCompositionOrCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompositionOrCondition_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getConditionWithoutKeywordAccess().getRightSquareBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionWithoutKeyword"


    // $ANTLR start "entryRuleStateStatusCondition"
    // InternalDependencyModelLanguage.g:2654:1: entryRuleStateStatusCondition returns [EObject current=null] : iv_ruleStateStatusCondition= ruleStateStatusCondition EOF ;
    public final EObject entryRuleStateStatusCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateStatusCondition = null;


        try {
            // InternalDependencyModelLanguage.g:2655:2: (iv_ruleStateStatusCondition= ruleStateStatusCondition EOF )
            // InternalDependencyModelLanguage.g:2656:2: iv_ruleStateStatusCondition= ruleStateStatusCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateStatusConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStateStatusCondition=ruleStateStatusCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateStatusCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateStatusCondition"


    // $ANTLR start "ruleStateStatusCondition"
    // InternalDependencyModelLanguage.g:2663:1: ruleStateStatusCondition returns [EObject current=null] : ( ( ( ( ruleQualifiedName ) ) | (otherlv_1= 'state combination' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ ) ) ( (lv_kind_5_0= ruleStateStatusKind ) ) ) ;
    public final EObject ruleStateStatusCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_kind_5_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:2666:28: ( ( ( ( ( ruleQualifiedName ) ) | (otherlv_1= 'state combination' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ ) ) ( (lv_kind_5_0= ruleStateStatusKind ) ) ) )
            // InternalDependencyModelLanguage.g:2667:1: ( ( ( ( ruleQualifiedName ) ) | (otherlv_1= 'state combination' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ ) ) ( (lv_kind_5_0= ruleStateStatusKind ) ) )
            {
            // InternalDependencyModelLanguage.g:2667:1: ( ( ( ( ruleQualifiedName ) ) | (otherlv_1= 'state combination' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ ) ) ( (lv_kind_5_0= ruleStateStatusKind ) ) )
            // InternalDependencyModelLanguage.g:2667:2: ( ( ( ruleQualifiedName ) ) | (otherlv_1= 'state combination' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ ) ) ( (lv_kind_5_0= ruleStateStatusKind ) )
            {
            // InternalDependencyModelLanguage.g:2667:2: ( ( ( ruleQualifiedName ) ) | (otherlv_1= 'state combination' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==48) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalDependencyModelLanguage.g:2667:3: ( ( ruleQualifiedName ) )
                    {
                    // InternalDependencyModelLanguage.g:2667:3: ( ( ruleQualifiedName ) )
                    // InternalDependencyModelLanguage.g:2668:1: ( ruleQualifiedName )
                    {
                    // InternalDependencyModelLanguage.g:2668:1: ( ruleQualifiedName )
                    // InternalDependencyModelLanguage.g:2669:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getStateStatusConditionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStateStatusConditionAccess().getStatesStateCrossReference_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:2686:6: (otherlv_1= 'state combination' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ )
                    {
                    // InternalDependencyModelLanguage.g:2686:6: (otherlv_1= 'state combination' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+ )
                    // InternalDependencyModelLanguage.g:2686:8: otherlv_1= 'state combination' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+
                    {
                    otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStateStatusConditionAccess().getStateCombinationKeyword_0_1_0());
                          
                    }
                    // InternalDependencyModelLanguage.g:2690:1: ( ( ruleQualifiedName ) )
                    // InternalDependencyModelLanguage.g:2691:1: ( ruleQualifiedName )
                    {
                    // InternalDependencyModelLanguage.g:2691:1: ( ruleQualifiedName )
                    // InternalDependencyModelLanguage.g:2692:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getStateStatusConditionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStateStatusConditionAccess().getStatesStateCrossReference_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:2708:2: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==16) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalDependencyModelLanguage.g:2708:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getStateStatusConditionAccess().getCommaKeyword_0_1_2_0());
                    	          
                    	    }
                    	    // InternalDependencyModelLanguage.g:2712:1: ( ( ruleQualifiedName ) )
                    	    // InternalDependencyModelLanguage.g:2713:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalDependencyModelLanguage.g:2713:1: ( ruleQualifiedName )
                    	    // InternalDependencyModelLanguage.g:2714:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getStateStatusConditionRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateStatusConditionAccess().getStatesStateCrossReference_0_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_46);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt43 >= 1 ) break loop43;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(43, input);
                                throw eee;
                        }
                        cnt43++;
                    } while (true);


                    }


                    }
                    break;

            }

            // InternalDependencyModelLanguage.g:2730:6: ( (lv_kind_5_0= ruleStateStatusKind ) )
            // InternalDependencyModelLanguage.g:2731:1: (lv_kind_5_0= ruleStateStatusKind )
            {
            // InternalDependencyModelLanguage.g:2731:1: (lv_kind_5_0= ruleStateStatusKind )
            // InternalDependencyModelLanguage.g:2732:3: lv_kind_5_0= ruleStateStatusKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateStatusConditionAccess().getKindStateStatusKindEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_kind_5_0=ruleStateStatusKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStateStatusConditionRule());
              	        }
                     		set(
                     			current, 
                     			"kind",
                      		lv_kind_5_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.StateStatusKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateStatusCondition"


    // $ANTLR start "entryRuleEventConstrainedIntervalCondition"
    // InternalDependencyModelLanguage.g:2756:1: entryRuleEventConstrainedIntervalCondition returns [EObject current=null] : iv_ruleEventConstrainedIntervalCondition= ruleEventConstrainedIntervalCondition EOF ;
    public final EObject entryRuleEventConstrainedIntervalCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventConstrainedIntervalCondition = null;


        try {
            // InternalDependencyModelLanguage.g:2757:2: (iv_ruleEventConstrainedIntervalCondition= ruleEventConstrainedIntervalCondition EOF )
            // InternalDependencyModelLanguage.g:2758:2: iv_ruleEventConstrainedIntervalCondition= ruleEventConstrainedIntervalCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventConstrainedIntervalConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEventConstrainedIntervalCondition=ruleEventConstrainedIntervalCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventConstrainedIntervalCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventConstrainedIntervalCondition"


    // $ANTLR start "ruleEventConstrainedIntervalCondition"
    // InternalDependencyModelLanguage.g:2765:1: ruleEventConstrainedIntervalCondition returns [EObject current=null] : (otherlv_0= 'between' ( ( ( (lv_fromEvent_1_0= ruleComplexEvent ) ) otherlv_2= ',' ( (lv_untilEvent_3_0= ruleComplexEvent ) ) ) | ( ( (lv_initialEnabled_4_0= 'INIT' ) ) otherlv_5= ',' ( (lv_untilEvent_6_0= ruleComplexEvent ) ) ) | ( ( (lv_fromEvent_7_0= ruleComplexEvent ) ) otherlv_8= ',' ( ( (lv_untilEvent_9_0= ruleComplexEvent ) ) | ( (lv_enabledInfite_10_0= 'INFINITE' ) ) ) ) ) ) ;
    public final EObject ruleEventConstrainedIntervalCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_initialEnabled_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token lv_enabledInfite_10_0=null;
        EObject lv_fromEvent_1_0 = null;

        EObject lv_untilEvent_3_0 = null;

        EObject lv_untilEvent_6_0 = null;

        EObject lv_fromEvent_7_0 = null;

        EObject lv_untilEvent_9_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:2768:28: ( (otherlv_0= 'between' ( ( ( (lv_fromEvent_1_0= ruleComplexEvent ) ) otherlv_2= ',' ( (lv_untilEvent_3_0= ruleComplexEvent ) ) ) | ( ( (lv_initialEnabled_4_0= 'INIT' ) ) otherlv_5= ',' ( (lv_untilEvent_6_0= ruleComplexEvent ) ) ) | ( ( (lv_fromEvent_7_0= ruleComplexEvent ) ) otherlv_8= ',' ( ( (lv_untilEvent_9_0= ruleComplexEvent ) ) | ( (lv_enabledInfite_10_0= 'INFINITE' ) ) ) ) ) ) )
            // InternalDependencyModelLanguage.g:2769:1: (otherlv_0= 'between' ( ( ( (lv_fromEvent_1_0= ruleComplexEvent ) ) otherlv_2= ',' ( (lv_untilEvent_3_0= ruleComplexEvent ) ) ) | ( ( (lv_initialEnabled_4_0= 'INIT' ) ) otherlv_5= ',' ( (lv_untilEvent_6_0= ruleComplexEvent ) ) ) | ( ( (lv_fromEvent_7_0= ruleComplexEvent ) ) otherlv_8= ',' ( ( (lv_untilEvent_9_0= ruleComplexEvent ) ) | ( (lv_enabledInfite_10_0= 'INFINITE' ) ) ) ) ) )
            {
            // InternalDependencyModelLanguage.g:2769:1: (otherlv_0= 'between' ( ( ( (lv_fromEvent_1_0= ruleComplexEvent ) ) otherlv_2= ',' ( (lv_untilEvent_3_0= ruleComplexEvent ) ) ) | ( ( (lv_initialEnabled_4_0= 'INIT' ) ) otherlv_5= ',' ( (lv_untilEvent_6_0= ruleComplexEvent ) ) ) | ( ( (lv_fromEvent_7_0= ruleComplexEvent ) ) otherlv_8= ',' ( ( (lv_untilEvent_9_0= ruleComplexEvent ) ) | ( (lv_enabledInfite_10_0= 'INFINITE' ) ) ) ) ) )
            // InternalDependencyModelLanguage.g:2769:3: otherlv_0= 'between' ( ( ( (lv_fromEvent_1_0= ruleComplexEvent ) ) otherlv_2= ',' ( (lv_untilEvent_3_0= ruleComplexEvent ) ) ) | ( ( (lv_initialEnabled_4_0= 'INIT' ) ) otherlv_5= ',' ( (lv_untilEvent_6_0= ruleComplexEvent ) ) ) | ( ( (lv_fromEvent_7_0= ruleComplexEvent ) ) otherlv_8= ',' ( ( (lv_untilEvent_9_0= ruleComplexEvent ) ) | ( (lv_enabledInfite_10_0= 'INFINITE' ) ) ) ) )
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEventConstrainedIntervalConditionAccess().getBetweenKeyword_0());
                  
            }
            // InternalDependencyModelLanguage.g:2773:1: ( ( ( (lv_fromEvent_1_0= ruleComplexEvent ) ) otherlv_2= ',' ( (lv_untilEvent_3_0= ruleComplexEvent ) ) ) | ( ( (lv_initialEnabled_4_0= 'INIT' ) ) otherlv_5= ',' ( (lv_untilEvent_6_0= ruleComplexEvent ) ) ) | ( ( (lv_fromEvent_7_0= ruleComplexEvent ) ) otherlv_8= ',' ( ( (lv_untilEvent_9_0= ruleComplexEvent ) ) | ( (lv_enabledInfite_10_0= 'INFINITE' ) ) ) ) )
            int alt46=3;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalDependencyModelLanguage.g:2773:2: ( ( (lv_fromEvent_1_0= ruleComplexEvent ) ) otherlv_2= ',' ( (lv_untilEvent_3_0= ruleComplexEvent ) ) )
                    {
                    // InternalDependencyModelLanguage.g:2773:2: ( ( (lv_fromEvent_1_0= ruleComplexEvent ) ) otherlv_2= ',' ( (lv_untilEvent_3_0= ruleComplexEvent ) ) )
                    // InternalDependencyModelLanguage.g:2773:3: ( (lv_fromEvent_1_0= ruleComplexEvent ) ) otherlv_2= ',' ( (lv_untilEvent_3_0= ruleComplexEvent ) )
                    {
                    // InternalDependencyModelLanguage.g:2773:3: ( (lv_fromEvent_1_0= ruleComplexEvent ) )
                    // InternalDependencyModelLanguage.g:2774:1: (lv_fromEvent_1_0= ruleComplexEvent )
                    {
                    // InternalDependencyModelLanguage.g:2774:1: (lv_fromEvent_1_0= ruleComplexEvent )
                    // InternalDependencyModelLanguage.g:2775:3: lv_fromEvent_1_0= ruleComplexEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventConstrainedIntervalConditionAccess().getFromEventComplexEventParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_fromEvent_1_0=ruleComplexEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventConstrainedIntervalConditionRule());
                      	        }
                             		set(
                             			current, 
                             			"fromEvent",
                              		lv_fromEvent_1_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.ComplexEvent");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEventConstrainedIntervalConditionAccess().getCommaKeyword_1_0_1());
                          
                    }
                    // InternalDependencyModelLanguage.g:2795:1: ( (lv_untilEvent_3_0= ruleComplexEvent ) )
                    // InternalDependencyModelLanguage.g:2796:1: (lv_untilEvent_3_0= ruleComplexEvent )
                    {
                    // InternalDependencyModelLanguage.g:2796:1: (lv_untilEvent_3_0= ruleComplexEvent )
                    // InternalDependencyModelLanguage.g:2797:3: lv_untilEvent_3_0= ruleComplexEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventConstrainedIntervalConditionAccess().getUntilEventComplexEventParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_untilEvent_3_0=ruleComplexEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventConstrainedIntervalConditionRule());
                      	        }
                             		set(
                             			current, 
                             			"untilEvent",
                              		lv_untilEvent_3_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.ComplexEvent");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:2814:6: ( ( (lv_initialEnabled_4_0= 'INIT' ) ) otherlv_5= ',' ( (lv_untilEvent_6_0= ruleComplexEvent ) ) )
                    {
                    // InternalDependencyModelLanguage.g:2814:6: ( ( (lv_initialEnabled_4_0= 'INIT' ) ) otherlv_5= ',' ( (lv_untilEvent_6_0= ruleComplexEvent ) ) )
                    // InternalDependencyModelLanguage.g:2814:7: ( (lv_initialEnabled_4_0= 'INIT' ) ) otherlv_5= ',' ( (lv_untilEvent_6_0= ruleComplexEvent ) )
                    {
                    // InternalDependencyModelLanguage.g:2814:7: ( (lv_initialEnabled_4_0= 'INIT' ) )
                    // InternalDependencyModelLanguage.g:2815:1: (lv_initialEnabled_4_0= 'INIT' )
                    {
                    // InternalDependencyModelLanguage.g:2815:1: (lv_initialEnabled_4_0= 'INIT' )
                    // InternalDependencyModelLanguage.g:2816:3: lv_initialEnabled_4_0= 'INIT'
                    {
                    lv_initialEnabled_4_0=(Token)match(input,50,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_initialEnabled_4_0, grammarAccess.getEventConstrainedIntervalConditionAccess().getInitialEnabledINITKeyword_1_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventConstrainedIntervalConditionRule());
                      	        }
                             		setWithLastConsumed(current, "initialEnabled", true, "INIT");
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEventConstrainedIntervalConditionAccess().getCommaKeyword_1_1_1());
                          
                    }
                    // InternalDependencyModelLanguage.g:2833:1: ( (lv_untilEvent_6_0= ruleComplexEvent ) )
                    // InternalDependencyModelLanguage.g:2834:1: (lv_untilEvent_6_0= ruleComplexEvent )
                    {
                    // InternalDependencyModelLanguage.g:2834:1: (lv_untilEvent_6_0= ruleComplexEvent )
                    // InternalDependencyModelLanguage.g:2835:3: lv_untilEvent_6_0= ruleComplexEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventConstrainedIntervalConditionAccess().getUntilEventComplexEventParserRuleCall_1_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_untilEvent_6_0=ruleComplexEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventConstrainedIntervalConditionRule());
                      	        }
                             		set(
                             			current, 
                             			"untilEvent",
                              		lv_untilEvent_6_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.ComplexEvent");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:2852:6: ( ( (lv_fromEvent_7_0= ruleComplexEvent ) ) otherlv_8= ',' ( ( (lv_untilEvent_9_0= ruleComplexEvent ) ) | ( (lv_enabledInfite_10_0= 'INFINITE' ) ) ) )
                    {
                    // InternalDependencyModelLanguage.g:2852:6: ( ( (lv_fromEvent_7_0= ruleComplexEvent ) ) otherlv_8= ',' ( ( (lv_untilEvent_9_0= ruleComplexEvent ) ) | ( (lv_enabledInfite_10_0= 'INFINITE' ) ) ) )
                    // InternalDependencyModelLanguage.g:2852:7: ( (lv_fromEvent_7_0= ruleComplexEvent ) ) otherlv_8= ',' ( ( (lv_untilEvent_9_0= ruleComplexEvent ) ) | ( (lv_enabledInfite_10_0= 'INFINITE' ) ) )
                    {
                    // InternalDependencyModelLanguage.g:2852:7: ( (lv_fromEvent_7_0= ruleComplexEvent ) )
                    // InternalDependencyModelLanguage.g:2853:1: (lv_fromEvent_7_0= ruleComplexEvent )
                    {
                    // InternalDependencyModelLanguage.g:2853:1: (lv_fromEvent_7_0= ruleComplexEvent )
                    // InternalDependencyModelLanguage.g:2854:3: lv_fromEvent_7_0= ruleComplexEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventConstrainedIntervalConditionAccess().getFromEventComplexEventParserRuleCall_1_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_fromEvent_7_0=ruleComplexEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventConstrainedIntervalConditionRule());
                      	        }
                             		set(
                             			current, 
                             			"fromEvent",
                              		lv_fromEvent_7_0, 
                              		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.ComplexEvent");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEventConstrainedIntervalConditionAccess().getCommaKeyword_1_2_1());
                          
                    }
                    // InternalDependencyModelLanguage.g:2874:1: ( ( (lv_untilEvent_9_0= ruleComplexEvent ) ) | ( (lv_enabledInfite_10_0= 'INFINITE' ) ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==41||LA45_0==43||(LA45_0>=84 && LA45_0<=85)||(LA45_0>=88 && LA45_0<=89)) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==51) ) {
                        alt45=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalDependencyModelLanguage.g:2874:2: ( (lv_untilEvent_9_0= ruleComplexEvent ) )
                            {
                            // InternalDependencyModelLanguage.g:2874:2: ( (lv_untilEvent_9_0= ruleComplexEvent ) )
                            // InternalDependencyModelLanguage.g:2875:1: (lv_untilEvent_9_0= ruleComplexEvent )
                            {
                            // InternalDependencyModelLanguage.g:2875:1: (lv_untilEvent_9_0= ruleComplexEvent )
                            // InternalDependencyModelLanguage.g:2876:3: lv_untilEvent_9_0= ruleComplexEvent
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEventConstrainedIntervalConditionAccess().getUntilEventComplexEventParserRuleCall_1_2_2_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_untilEvent_9_0=ruleComplexEvent();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEventConstrainedIntervalConditionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"untilEvent",
                                      		lv_untilEvent_9_0, 
                                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.ComplexEvent");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalDependencyModelLanguage.g:2893:6: ( (lv_enabledInfite_10_0= 'INFINITE' ) )
                            {
                            // InternalDependencyModelLanguage.g:2893:6: ( (lv_enabledInfite_10_0= 'INFINITE' ) )
                            // InternalDependencyModelLanguage.g:2894:1: (lv_enabledInfite_10_0= 'INFINITE' )
                            {
                            // InternalDependencyModelLanguage.g:2894:1: (lv_enabledInfite_10_0= 'INFINITE' )
                            // InternalDependencyModelLanguage.g:2895:3: lv_enabledInfite_10_0= 'INFINITE'
                            {
                            lv_enabledInfite_10_0=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_enabledInfite_10_0, grammarAccess.getEventConstrainedIntervalConditionAccess().getEnabledInfiteINFINITEKeyword_1_2_2_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEventConstrainedIntervalConditionRule());
                              	        }
                                     		setWithLastConsumed(current, "enabledInfite", true, "INFINITE");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventConstrainedIntervalCondition"


    // $ANTLR start "entryRuleClockCondition"
    // InternalDependencyModelLanguage.g:2916:1: entryRuleClockCondition returns [EObject current=null] : iv_ruleClockCondition= ruleClockCondition EOF ;
    public final EObject entryRuleClockCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClockCondition = null;


        try {
            // InternalDependencyModelLanguage.g:2917:2: (iv_ruleClockCondition= ruleClockCondition EOF )
            // InternalDependencyModelLanguage.g:2918:2: iv_ruleClockCondition= ruleClockCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClockConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClockCondition=ruleClockCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClockCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClockCondition"


    // $ANTLR start "ruleClockCondition"
    // InternalDependencyModelLanguage.g:2925:1: ruleClockCondition returns [EObject current=null] : (this_BasicClockCondition_0= ruleBasicClockCondition | this_AuxiliaryClockCondition_1= ruleAuxiliaryClockCondition | this_HybridClockCondition_2= ruleHybridClockCondition ) ;
    public final EObject ruleClockCondition() throws RecognitionException {
        EObject current = null;

        EObject this_BasicClockCondition_0 = null;

        EObject this_AuxiliaryClockCondition_1 = null;

        EObject this_HybridClockCondition_2 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:2928:28: ( (this_BasicClockCondition_0= ruleBasicClockCondition | this_AuxiliaryClockCondition_1= ruleAuxiliaryClockCondition | this_HybridClockCondition_2= ruleHybridClockCondition ) )
            // InternalDependencyModelLanguage.g:2929:1: (this_BasicClockCondition_0= ruleBasicClockCondition | this_AuxiliaryClockCondition_1= ruleAuxiliaryClockCondition | this_HybridClockCondition_2= ruleHybridClockCondition )
            {
            // InternalDependencyModelLanguage.g:2929:1: (this_BasicClockCondition_0= ruleBasicClockCondition | this_AuxiliaryClockCondition_1= ruleAuxiliaryClockCondition | this_HybridClockCondition_2= ruleHybridClockCondition )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt47=1;
                }
                break;
            case 41:
            case 43:
            case 84:
            case 85:
            case 88:
            case 89:
                {
                alt47=2;
                }
                break;
            case RULE_ID:
            case 48:
                {
                alt47=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalDependencyModelLanguage.g:2930:2: this_BasicClockCondition_0= ruleBasicClockCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClockConditionAccess().getBasicClockConditionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BasicClockCondition_0=ruleBasicClockCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BasicClockCondition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:2943:2: this_AuxiliaryClockCondition_1= ruleAuxiliaryClockCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClockConditionAccess().getAuxiliaryClockConditionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AuxiliaryClockCondition_1=ruleAuxiliaryClockCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AuxiliaryClockCondition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:2956:2: this_HybridClockCondition_2= ruleHybridClockCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClockConditionAccess().getHybridClockConditionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_HybridClockCondition_2=ruleHybridClockCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HybridClockCondition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClockCondition"


    // $ANTLR start "entryRuleAuxiliaryClockCondition"
    // InternalDependencyModelLanguage.g:2975:1: entryRuleAuxiliaryClockCondition returns [EObject current=null] : iv_ruleAuxiliaryClockCondition= ruleAuxiliaryClockCondition EOF ;
    public final EObject entryRuleAuxiliaryClockCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuxiliaryClockCondition = null;


        try {
            // InternalDependencyModelLanguage.g:2976:2: (iv_ruleAuxiliaryClockCondition= ruleAuxiliaryClockCondition EOF )
            // InternalDependencyModelLanguage.g:2977:2: iv_ruleAuxiliaryClockCondition= ruleAuxiliaryClockCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAuxiliaryClockConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAuxiliaryClockCondition=ruleAuxiliaryClockCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAuxiliaryClockCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAuxiliaryClockCondition"


    // $ANTLR start "ruleAuxiliaryClockCondition"
    // InternalDependencyModelLanguage.g:2984:1: ruleAuxiliaryClockCondition returns [EObject current=null] : ( ( (lv_event_0_0= ruleComplexEvent ) ) ( (lv_operator_1_0= ruleNaturalLanguageComparingOperator ) ) ( (lv_bound_2_0= ruleTimeValue ) ) ) ;
    public final EObject ruleAuxiliaryClockCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_bound_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:2987:28: ( ( ( (lv_event_0_0= ruleComplexEvent ) ) ( (lv_operator_1_0= ruleNaturalLanguageComparingOperator ) ) ( (lv_bound_2_0= ruleTimeValue ) ) ) )
            // InternalDependencyModelLanguage.g:2988:1: ( ( (lv_event_0_0= ruleComplexEvent ) ) ( (lv_operator_1_0= ruleNaturalLanguageComparingOperator ) ) ( (lv_bound_2_0= ruleTimeValue ) ) )
            {
            // InternalDependencyModelLanguage.g:2988:1: ( ( (lv_event_0_0= ruleComplexEvent ) ) ( (lv_operator_1_0= ruleNaturalLanguageComparingOperator ) ) ( (lv_bound_2_0= ruleTimeValue ) ) )
            // InternalDependencyModelLanguage.g:2988:2: ( (lv_event_0_0= ruleComplexEvent ) ) ( (lv_operator_1_0= ruleNaturalLanguageComparingOperator ) ) ( (lv_bound_2_0= ruleTimeValue ) )
            {
            // InternalDependencyModelLanguage.g:2988:2: ( (lv_event_0_0= ruleComplexEvent ) )
            // InternalDependencyModelLanguage.g:2989:1: (lv_event_0_0= ruleComplexEvent )
            {
            // InternalDependencyModelLanguage.g:2989:1: (lv_event_0_0= ruleComplexEvent )
            // InternalDependencyModelLanguage.g:2990:3: lv_event_0_0= ruleComplexEvent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAuxiliaryClockConditionAccess().getEventComplexEventParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_49);
            lv_event_0_0=ruleComplexEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAuxiliaryClockConditionRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_0_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.ComplexEvent");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:3006:2: ( (lv_operator_1_0= ruleNaturalLanguageComparingOperator ) )
            // InternalDependencyModelLanguage.g:3007:1: (lv_operator_1_0= ruleNaturalLanguageComparingOperator )
            {
            // InternalDependencyModelLanguage.g:3007:1: (lv_operator_1_0= ruleNaturalLanguageComparingOperator )
            // InternalDependencyModelLanguage.g:3008:3: lv_operator_1_0= ruleNaturalLanguageComparingOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAuxiliaryClockConditionAccess().getOperatorNaturalLanguageComparingOperatorEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_42);
            lv_operator_1_0=ruleNaturalLanguageComparingOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAuxiliaryClockConditionRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_1_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.NaturalLanguageComparingOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:3024:2: ( (lv_bound_2_0= ruleTimeValue ) )
            // InternalDependencyModelLanguage.g:3025:1: (lv_bound_2_0= ruleTimeValue )
            {
            // InternalDependencyModelLanguage.g:3025:1: (lv_bound_2_0= ruleTimeValue )
            // InternalDependencyModelLanguage.g:3026:3: lv_bound_2_0= ruleTimeValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAuxiliaryClockConditionAccess().getBoundTimeValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_bound_2_0=ruleTimeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAuxiliaryClockConditionRule());
              	        }
                     		set(
                     			current, 
                     			"bound",
                      		lv_bound_2_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.TimeValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuxiliaryClockCondition"


    // $ANTLR start "entryRuleHybridClockCondition"
    // InternalDependencyModelLanguage.g:3050:1: entryRuleHybridClockCondition returns [EObject current=null] : iv_ruleHybridClockCondition= ruleHybridClockCondition EOF ;
    public final EObject entryRuleHybridClockCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHybridClockCondition = null;


        try {
            // InternalDependencyModelLanguage.g:3051:2: (iv_ruleHybridClockCondition= ruleHybridClockCondition EOF )
            // InternalDependencyModelLanguage.g:3052:2: iv_ruleHybridClockCondition= ruleHybridClockCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHybridClockConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHybridClockCondition=ruleHybridClockCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHybridClockCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHybridClockCondition"


    // $ANTLR start "ruleHybridClockCondition"
    // InternalDependencyModelLanguage.g:3059:1: ruleHybridClockCondition returns [EObject current=null] : ( ( (lv_condition_0_0= ruleStateStatusCondition ) ) ( (lv_operator_1_0= ruleNaturalLanguageComparingOperator ) ) ( (lv_bound_2_0= ruleTimeValue ) ) ) ;
    public final EObject ruleHybridClockCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_bound_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:3062:28: ( ( ( (lv_condition_0_0= ruleStateStatusCondition ) ) ( (lv_operator_1_0= ruleNaturalLanguageComparingOperator ) ) ( (lv_bound_2_0= ruleTimeValue ) ) ) )
            // InternalDependencyModelLanguage.g:3063:1: ( ( (lv_condition_0_0= ruleStateStatusCondition ) ) ( (lv_operator_1_0= ruleNaturalLanguageComparingOperator ) ) ( (lv_bound_2_0= ruleTimeValue ) ) )
            {
            // InternalDependencyModelLanguage.g:3063:1: ( ( (lv_condition_0_0= ruleStateStatusCondition ) ) ( (lv_operator_1_0= ruleNaturalLanguageComparingOperator ) ) ( (lv_bound_2_0= ruleTimeValue ) ) )
            // InternalDependencyModelLanguage.g:3063:2: ( (lv_condition_0_0= ruleStateStatusCondition ) ) ( (lv_operator_1_0= ruleNaturalLanguageComparingOperator ) ) ( (lv_bound_2_0= ruleTimeValue ) )
            {
            // InternalDependencyModelLanguage.g:3063:2: ( (lv_condition_0_0= ruleStateStatusCondition ) )
            // InternalDependencyModelLanguage.g:3064:1: (lv_condition_0_0= ruleStateStatusCondition )
            {
            // InternalDependencyModelLanguage.g:3064:1: (lv_condition_0_0= ruleStateStatusCondition )
            // InternalDependencyModelLanguage.g:3065:3: lv_condition_0_0= ruleStateStatusCondition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHybridClockConditionAccess().getConditionStateStatusConditionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_49);
            lv_condition_0_0=ruleStateStatusCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHybridClockConditionRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_0_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.StateStatusCondition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:3081:2: ( (lv_operator_1_0= ruleNaturalLanguageComparingOperator ) )
            // InternalDependencyModelLanguage.g:3082:1: (lv_operator_1_0= ruleNaturalLanguageComparingOperator )
            {
            // InternalDependencyModelLanguage.g:3082:1: (lv_operator_1_0= ruleNaturalLanguageComparingOperator )
            // InternalDependencyModelLanguage.g:3083:3: lv_operator_1_0= ruleNaturalLanguageComparingOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHybridClockConditionAccess().getOperatorNaturalLanguageComparingOperatorEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_42);
            lv_operator_1_0=ruleNaturalLanguageComparingOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHybridClockConditionRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_1_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.NaturalLanguageComparingOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:3099:2: ( (lv_bound_2_0= ruleTimeValue ) )
            // InternalDependencyModelLanguage.g:3100:1: (lv_bound_2_0= ruleTimeValue )
            {
            // InternalDependencyModelLanguage.g:3100:1: (lv_bound_2_0= ruleTimeValue )
            // InternalDependencyModelLanguage.g:3101:3: lv_bound_2_0= ruleTimeValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHybridClockConditionAccess().getBoundTimeValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_bound_2_0=ruleTimeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHybridClockConditionRule());
              	        }
                     		set(
                     			current, 
                     			"bound",
                      		lv_bound_2_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.TimeValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHybridClockCondition"


    // $ANTLR start "entryRuleBasicClockCondition"
    // InternalDependencyModelLanguage.g:3125:1: entryRuleBasicClockCondition returns [EObject current=null] : iv_ruleBasicClockCondition= ruleBasicClockCondition EOF ;
    public final EObject entryRuleBasicClockCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicClockCondition = null;


        try {
            // InternalDependencyModelLanguage.g:3126:2: (iv_ruleBasicClockCondition= ruleBasicClockCondition EOF )
            // InternalDependencyModelLanguage.g:3127:2: iv_ruleBasicClockCondition= ruleBasicClockCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicClockConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBasicClockCondition=ruleBasicClockCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicClockCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicClockCondition"


    // $ANTLR start "ruleBasicClockCondition"
    // InternalDependencyModelLanguage.g:3134:1: ruleBasicClockCondition returns [EObject current=null] : (otherlv_0= 'clock' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparingOperator ) ) ( (lv_bound_3_0= ruleTimeValue ) ) ) ;
    public final EObject ruleBasicClockCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_bound_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:3137:28: ( (otherlv_0= 'clock' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparingOperator ) ) ( (lv_bound_3_0= ruleTimeValue ) ) ) )
            // InternalDependencyModelLanguage.g:3138:1: (otherlv_0= 'clock' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparingOperator ) ) ( (lv_bound_3_0= ruleTimeValue ) ) )
            {
            // InternalDependencyModelLanguage.g:3138:1: (otherlv_0= 'clock' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparingOperator ) ) ( (lv_bound_3_0= ruleTimeValue ) ) )
            // InternalDependencyModelLanguage.g:3138:3: otherlv_0= 'clock' ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparingOperator ) ) ( (lv_bound_3_0= ruleTimeValue ) )
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBasicClockConditionAccess().getClockKeyword_0());
                  
            }
            // InternalDependencyModelLanguage.g:3142:1: ( ( ruleQualifiedName ) )
            // InternalDependencyModelLanguage.g:3143:1: ( ruleQualifiedName )
            {
            // InternalDependencyModelLanguage.g:3143:1: ( ruleQualifiedName )
            // InternalDependencyModelLanguage.g:3144:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBasicClockConditionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBasicClockConditionAccess().getClockClockCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_50);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:3160:2: ( (lv_operator_2_0= ruleComparingOperator ) )
            // InternalDependencyModelLanguage.g:3161:1: (lv_operator_2_0= ruleComparingOperator )
            {
            // InternalDependencyModelLanguage.g:3161:1: (lv_operator_2_0= ruleComparingOperator )
            // InternalDependencyModelLanguage.g:3162:3: lv_operator_2_0= ruleComparingOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBasicClockConditionAccess().getOperatorComparingOperatorEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_42);
            lv_operator_2_0=ruleComparingOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBasicClockConditionRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_2_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.ComparingOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:3178:2: ( (lv_bound_3_0= ruleTimeValue ) )
            // InternalDependencyModelLanguage.g:3179:1: (lv_bound_3_0= ruleTimeValue )
            {
            // InternalDependencyModelLanguage.g:3179:1: (lv_bound_3_0= ruleTimeValue )
            // InternalDependencyModelLanguage.g:3180:3: lv_bound_3_0= ruleTimeValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBasicClockConditionAccess().getBoundTimeValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_bound_3_0=ruleTimeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBasicClockConditionRule());
              	        }
                     		set(
                     			current, 
                     			"bound",
                      		lv_bound_3_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.TimeValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicClockCondition"


    // $ANTLR start "entryRuleDataCondition"
    // InternalDependencyModelLanguage.g:3204:1: entryRuleDataCondition returns [EObject current=null] : iv_ruleDataCondition= ruleDataCondition EOF ;
    public final EObject entryRuleDataCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataCondition = null;


        try {
            // InternalDependencyModelLanguage.g:3205:2: (iv_ruleDataCondition= ruleDataCondition EOF )
            // InternalDependencyModelLanguage.g:3206:2: iv_ruleDataCondition= ruleDataCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDataCondition=ruleDataCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataCondition"


    // $ANTLR start "ruleDataCondition"
    // InternalDependencyModelLanguage.g:3213:1: ruleDataCondition returns [EObject current=null] : ( (lv_expression_0_0= ruleLogicalExpression ) ) ;
    public final EObject ruleDataCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:3216:28: ( ( (lv_expression_0_0= ruleLogicalExpression ) ) )
            // InternalDependencyModelLanguage.g:3217:1: ( (lv_expression_0_0= ruleLogicalExpression ) )
            {
            // InternalDependencyModelLanguage.g:3217:1: ( (lv_expression_0_0= ruleLogicalExpression ) )
            // InternalDependencyModelLanguage.g:3218:1: (lv_expression_0_0= ruleLogicalExpression )
            {
            // InternalDependencyModelLanguage.g:3218:1: (lv_expression_0_0= ruleLogicalExpression )
            // InternalDependencyModelLanguage.g:3219:3: lv_expression_0_0= ruleLogicalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataConditionAccess().getExpressionLogicalExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_0_0=ruleLogicalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataConditionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_0_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.LogicalExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataCondition"


    // $ANTLR start "entryRuleTypedNamedElementExpression"
    // InternalDependencyModelLanguage.g:3243:1: entryRuleTypedNamedElementExpression returns [EObject current=null] : iv_ruleTypedNamedElementExpression= ruleTypedNamedElementExpression EOF ;
    public final EObject entryRuleTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedNamedElementExpression = null;


        try {
            // InternalDependencyModelLanguage.g:3244:2: (iv_ruleTypedNamedElementExpression= ruleTypedNamedElementExpression EOF )
            // InternalDependencyModelLanguage.g:3245:2: iv_ruleTypedNamedElementExpression= ruleTypedNamedElementExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedNamedElementExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedNamedElementExpression=ruleTypedNamedElementExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedNamedElementExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedNamedElementExpression"


    // $ANTLR start "ruleTypedNamedElementExpression"
    // InternalDependencyModelLanguage.g:3252:1: ruleTypedNamedElementExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )* ) ;
    public final EObject ruleTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_elementAccessors_1_1 = null;

        EObject lv_elementAccessors_1_2 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:3255:28: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )* ) )
            // InternalDependencyModelLanguage.g:3256:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )* )
            {
            // InternalDependencyModelLanguage.g:3256:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )* )
            // InternalDependencyModelLanguage.g:3256:2: ( ( ruleQualifiedName ) ) ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )*
            {
            // InternalDependencyModelLanguage.g:3256:2: ( ( ruleQualifiedName ) )
            // InternalDependencyModelLanguage.g:3257:1: ( ruleQualifiedName )
            {
            // InternalDependencyModelLanguage.g:3257:1: ( ruleQualifiedName )
            // InternalDependencyModelLanguage.g:3258:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypedNamedElementExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementTypedNamedElementCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_51);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:3274:2: ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==19||LA49_0==40) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalDependencyModelLanguage.g:3275:1: ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) )
            	    {
            	    // InternalDependencyModelLanguage.g:3275:1: ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) )
            	    // InternalDependencyModelLanguage.g:3276:1: (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression )
            	    {
            	    // InternalDependencyModelLanguage.g:3276:1: (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression )
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==19) ) {
            	        alt48=1;
            	    }
            	    else if ( (LA48_0==40) ) {
            	        alt48=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 48, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalDependencyModelLanguage.g:3277:3: lv_elementAccessors_1_1= ruleArrayIndexExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsArrayIndexExpressionParserRuleCall_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FollowSets000.FOLLOW_51);
            	            lv_elementAccessors_1_1=ruleArrayIndexExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getTypedNamedElementExpressionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elementAccessors",
            	                      		lv_elementAccessors_1_1, 
            	                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.ArrayIndexExpression");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalDependencyModelLanguage.g:3292:8: lv_elementAccessors_1_2= ruleAttributeAccessorExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAttributeAccessorExpressionParserRuleCall_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FollowSets000.FOLLOW_51);
            	            lv_elementAccessors_1_2=ruleAttributeAccessorExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getTypedNamedElementExpressionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elementAccessors",
            	                      		lv_elementAccessors_1_2, 
            	                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.AttributeAccessorExpression");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedNamedElementExpression"


    // $ANTLR start "entryRuleOperationCall"
    // InternalDependencyModelLanguage.g:3318:1: entryRuleOperationCall returns [EObject current=null] : iv_ruleOperationCall= ruleOperationCall EOF ;
    public final EObject entryRuleOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCall = null;


        try {
            // InternalDependencyModelLanguage.g:3319:2: (iv_ruleOperationCall= ruleOperationCall EOF )
            // InternalDependencyModelLanguage.g:3320:2: iv_ruleOperationCall= ruleOperationCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOperationCall=ruleOperationCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationCall"


    // $ANTLR start "ruleOperationCall"
    // InternalDependencyModelLanguage.g:3327:1: ruleOperationCall returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleOperationCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameterBinding_2_0 = null;

        EObject lv_parameterBinding_4_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:3330:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' ) )
            // InternalDependencyModelLanguage.g:3331:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' )
            {
            // InternalDependencyModelLanguage.g:3331:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' )
            // InternalDependencyModelLanguage.g:3331:2: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')'
            {
            // InternalDependencyModelLanguage.g:3331:2: ( ( ruleQualifiedName ) )
            // InternalDependencyModelLanguage.g:3332:1: ( ruleQualifiedName )
            {
            // InternalDependencyModelLanguage.g:3332:1: ( ruleQualifiedName )
            // InternalDependencyModelLanguage.g:3333:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationCallAccess().getOperationOperationCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_52);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalDependencyModelLanguage.g:3353:1: ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDependencyModelLanguage.g:3353:2: ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )*
                    {
                    // InternalDependencyModelLanguage.g:3353:2: ( (lv_parameterBinding_2_0= ruleParamaterBinding ) )
                    // InternalDependencyModelLanguage.g:3354:1: (lv_parameterBinding_2_0= ruleParamaterBinding )
                    {
                    // InternalDependencyModelLanguage.g:3354:1: (lv_parameterBinding_2_0= ruleParamaterBinding )
                    // InternalDependencyModelLanguage.g:3355:3: lv_parameterBinding_2_0= ruleParamaterBinding
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_54);
                    lv_parameterBinding_2_0=ruleParamaterBinding();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationCallRule());
                      	        }
                             		add(
                             			current, 
                             			"parameterBinding",
                              		lv_parameterBinding_2_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.ParamaterBinding");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:3371:2: (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==16) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalDependencyModelLanguage.g:3371:4: otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getOperationCallAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // InternalDependencyModelLanguage.g:3375:1: ( (lv_parameterBinding_4_0= ruleParamaterBinding ) )
                    	    // InternalDependencyModelLanguage.g:3376:1: (lv_parameterBinding_4_0= ruleParamaterBinding )
                    	    {
                    	    // InternalDependencyModelLanguage.g:3376:1: (lv_parameterBinding_4_0= ruleParamaterBinding )
                    	    // InternalDependencyModelLanguage.g:3377:3: lv_parameterBinding_4_0= ruleParamaterBinding
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_54);
                    	    lv_parameterBinding_4_0=ruleParamaterBinding();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperationCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameterBinding",
                    	              		lv_parameterBinding_4_0, 
                    	              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.ParamaterBinding");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getOperationCallAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationCall"


    // $ANTLR start "entryRuleLONG"
    // InternalDependencyModelLanguage.g:3405:1: entryRuleLONG returns [String current=null] : iv_ruleLONG= ruleLONG EOF ;
    public final String entryRuleLONG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLONG = null;


        try {
            // InternalDependencyModelLanguage.g:3406:2: (iv_ruleLONG= ruleLONG EOF )
            // InternalDependencyModelLanguage.g:3407:2: iv_ruleLONG= ruleLONG EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLONGRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLONG=ruleLONG();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLONG.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLONG"


    // $ANTLR start "ruleLONG"
    // InternalDependencyModelLanguage.g:3414:1: ruleLONG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLONG() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:3417:28: (this_INT_0= RULE_INT )
            // InternalDependencyModelLanguage.g:3418:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getLONGAccess().getINTTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLONG"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDependencyModelLanguage.g:3433:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDependencyModelLanguage.g:3434:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDependencyModelLanguage.g:3435:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDependencyModelLanguage.g:3442:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:3445:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDependencyModelLanguage.g:3446:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDependencyModelLanguage.g:3446:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDependencyModelLanguage.g:3446:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalDependencyModelLanguage.g:3453:1: (kw= '.' this_ID_2= RULE_ID )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==40) ) {
                    int LA52_2 = input.LA(2);

                    if ( (LA52_2==RULE_ID) ) {
                        int LA52_3 = input.LA(3);

                        if ( (synpred68_InternalDependencyModelLanguage()) ) {
                            alt52=1;
                        }


                    }


                }


                switch (alt52) {
            	case 1 :
            	    // InternalDependencyModelLanguage.g:3454:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,40,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEString"
    // InternalDependencyModelLanguage.g:3474:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDependencyModelLanguage.g:3475:2: (iv_ruleEString= ruleEString EOF )
            // InternalDependencyModelLanguage.g:3476:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDependencyModelLanguage.g:3483:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:3486:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDependencyModelLanguage.g:3487:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDependencyModelLanguage.g:3487:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_STRING) ) {
                alt53=1;
            }
            else if ( (LA53_0==RULE_ID) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalDependencyModelLanguage.g:3487:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:3495:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalDependencyModelLanguage.g:3510:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDependencyModelLanguage.g:3511:2: (iv_ruleEInt= ruleEInt EOF )
            // InternalDependencyModelLanguage.g:3512:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDependencyModelLanguage.g:3519:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:3522:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDependencyModelLanguage.g:3523:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDependencyModelLanguage.g:3523:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDependencyModelLanguage.g:3523:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDependencyModelLanguage.g:3523:2: (kw= '-' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==53) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDependencyModelLanguage.g:3524:2: kw= '-'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleLiteral"
    // InternalDependencyModelLanguage.g:3544:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // InternalDependencyModelLanguage.g:3545:2: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalDependencyModelLanguage.g:3546:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalDependencyModelLanguage.g:3553:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | kw= 'null' ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUMBER_0=null;
        Token this_BOOLEAN_1=null;
        Token this_INT_2=null;
        Token this_STRING_3=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:3556:28: ( (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | kw= 'null' ) )
            // InternalDependencyModelLanguage.g:3557:1: (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | kw= 'null' )
            {
            // InternalDependencyModelLanguage.g:3557:1: (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | kw= 'null' )
            int alt55=5;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt55=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt55=2;
                }
                break;
            case RULE_INT:
                {
                alt55=3;
                }
                break;
            case RULE_STRING:
                {
                alt55=4;
                }
                break;
            case 54:
                {
                alt55=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalDependencyModelLanguage.g:3557:6: this_NUMBER_0= RULE_NUMBER
                    {
                    this_NUMBER_0=(Token)match(input,RULE_NUMBER,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_0, grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:3565:10: this_BOOLEAN_1= RULE_BOOLEAN
                    {
                    this_BOOLEAN_1=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_1, grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:3573:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_2, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalDependencyModelLanguage.g:3581:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalDependencyModelLanguage.g:3590:2: kw= 'null'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLiteralAccess().getNullKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBlock"
    // InternalDependencyModelLanguage.g:3605:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalDependencyModelLanguage.g:3609:2: (iv_ruleBlock= ruleBlock EOF )
            // InternalDependencyModelLanguage.g:3610:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalDependencyModelLanguage.g:3620:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalDependencyModelLanguage.g:3624:28: ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' ) )
            // InternalDependencyModelLanguage.g:3625:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' )
            {
            // InternalDependencyModelLanguage.g:3625:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' )
            // InternalDependencyModelLanguage.g:3625:2: () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}'
            {
            // InternalDependencyModelLanguage.g:3625:2: ()
            // InternalDependencyModelLanguage.g:3626:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockAccess().getBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalDependencyModelLanguage.g:3638:1: ( (lv_expressions_2_0= ruleExpressionStartRule ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID||LA56_0==28||(LA56_0>=55 && LA56_0<=57)||LA56_0==61||LA56_0==63) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalDependencyModelLanguage.g:3639:1: (lv_expressions_2_0= ruleExpressionStartRule )
            	    {
            	    // InternalDependencyModelLanguage.g:3639:1: (lv_expressions_2_0= ruleExpressionStartRule )
            	    // InternalDependencyModelLanguage.g:3640:3: lv_expressions_2_0= ruleExpressionStartRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockAccess().getExpressionsExpressionStartRuleParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_57);
            	    lv_expressions_2_0=ruleExpressionStartRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.ExpressionStartRule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleForLoop"
    // InternalDependencyModelLanguage.g:3671:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // InternalDependencyModelLanguage.g:3672:2: (iv_ruleForLoop= ruleForLoop EOF )
            // InternalDependencyModelLanguage.g:3673:2: iv_ruleForLoop= ruleForLoop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForLoopRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleForLoop=ruleForLoop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForLoop; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // InternalDependencyModelLanguage.g:3680:1: ruleForLoop returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) ) ;
    public final EObject ruleForLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_initializeExpression_2_0 = null;

        EObject lv_loopTest_3_0 = null;

        EObject lv_countingExpression_5_0 = null;

        EObject lv_block_7_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:3683:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) ) )
            // InternalDependencyModelLanguage.g:3684:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) )
            {
            // InternalDependencyModelLanguage.g:3684:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) )
            // InternalDependencyModelLanguage.g:3684:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForLoopAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalDependencyModelLanguage.g:3692:1: ( (lv_initializeExpression_2_0= ruleAssignment ) )
            // InternalDependencyModelLanguage.g:3693:1: (lv_initializeExpression_2_0= ruleAssignment )
            {
            // InternalDependencyModelLanguage.g:3693:1: (lv_initializeExpression_2_0= ruleAssignment )
            // InternalDependencyModelLanguage.g:3694:3: lv_initializeExpression_2_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForLoopAccess().getInitializeExpressionAssignmentParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_11);
            lv_initializeExpression_2_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForLoopRule());
              	        }
                     		set(
                     			current, 
                     			"initializeExpression",
                      		lv_initializeExpression_2_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Assignment");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:3710:2: ( (lv_loopTest_3_0= ruleExpression ) )
            // InternalDependencyModelLanguage.g:3711:1: (lv_loopTest_3_0= ruleExpression )
            {
            // InternalDependencyModelLanguage.g:3711:1: (lv_loopTest_3_0= ruleExpression )
            // InternalDependencyModelLanguage.g:3712:3: lv_loopTest_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForLoopAccess().getLoopTestExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_loopTest_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForLoopRule());
              	        }
                     		set(
                     			current, 
                     			"loopTest",
                      		lv_loopTest_3_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getForLoopAccess().getSemicolonKeyword_4());
                  
            }
            // InternalDependencyModelLanguage.g:3732:1: ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) )
            // InternalDependencyModelLanguage.g:3733:1: (lv_countingExpression_5_0= ruleForLoopCountingExpression )
            {
            // InternalDependencyModelLanguage.g:3733:1: (lv_countingExpression_5_0= ruleForLoopCountingExpression )
            // InternalDependencyModelLanguage.g:3734:3: lv_countingExpression_5_0= ruleForLoopCountingExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForLoopAccess().getCountingExpressionForLoopCountingExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_36);
            lv_countingExpression_5_0=ruleForLoopCountingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForLoopRule());
              	        }
                     		set(
                     			current, 
                     			"countingExpression",
                      		lv_countingExpression_5_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.ForLoopCountingExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,44,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getForLoopAccess().getRightParenthesisKeyword_6());
                  
            }
            // InternalDependencyModelLanguage.g:3754:1: ( (lv_block_7_0= ruleBlock ) )
            // InternalDependencyModelLanguage.g:3755:1: (lv_block_7_0= ruleBlock )
            {
            // InternalDependencyModelLanguage.g:3755:1: (lv_block_7_0= ruleBlock )
            // InternalDependencyModelLanguage.g:3756:3: lv_block_7_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_block_7_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForLoopRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_7_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleForLoopCountingExpression"
    // InternalDependencyModelLanguage.g:3780:1: entryRuleForLoopCountingExpression returns [EObject current=null] : iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF ;
    public final EObject entryRuleForLoopCountingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoopCountingExpression = null;


        try {
            // InternalDependencyModelLanguage.g:3781:2: (iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF )
            // InternalDependencyModelLanguage.g:3782:2: iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForLoopCountingExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleForLoopCountingExpression=ruleForLoopCountingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForLoopCountingExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForLoopCountingExpression"


    // $ANTLR start "ruleForLoopCountingExpression"
    // InternalDependencyModelLanguage.g:3789:1: ruleForLoopCountingExpression returns [EObject current=null] : ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) ) ) ;
    public final EObject ruleForLoopCountingExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_typedNamedElementExpression_0_0 = null;

        Enumerator lv_incrementDecrementOperator_1_0 = null;

        Enumerator lv_assignOperator_2_0 = null;

        EObject lv_rhs_assignExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:3792:28: ( ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) ) ) )
            // InternalDependencyModelLanguage.g:3793:1: ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) ) )
            {
            // InternalDependencyModelLanguage.g:3793:1: ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) ) )
            // InternalDependencyModelLanguage.g:3793:2: ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) )
            {
            // InternalDependencyModelLanguage.g:3793:2: ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) )
            // InternalDependencyModelLanguage.g:3794:1: (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression )
            {
            // InternalDependencyModelLanguage.g:3794:1: (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression )
            // InternalDependencyModelLanguage.g:3795:3: lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getLhs_typedNamedElementExpressionTypedNamedElementExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_lhs_typedNamedElementExpression_0_0=ruleTypedNamedElementExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForLoopCountingExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"lhs_typedNamedElementExpression",
                      		lv_lhs_typedNamedElementExpression_0_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.TypedNamedElementExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:3811:2: ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=90 && LA57_0<=91)) ) {
                alt57=1;
            }
            else if ( (LA57_0==62||(LA57_0>=92 && LA57_0<=93)) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalDependencyModelLanguage.g:3811:3: ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) )
                    {
                    // InternalDependencyModelLanguage.g:3811:3: ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) )
                    // InternalDependencyModelLanguage.g:3812:1: (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator )
                    {
                    // InternalDependencyModelLanguage.g:3812:1: (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator )
                    // InternalDependencyModelLanguage.g:3813:3: lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorUnaryPostIncrementDecrementOperatorEnumRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_incrementDecrementOperator_1_0=ruleUnaryPostIncrementDecrementOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForLoopCountingExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"incrementDecrementOperator",
                              		lv_incrementDecrementOperator_1_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.UnaryPostIncrementDecrementOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:3830:6: ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) )
                    {
                    // InternalDependencyModelLanguage.g:3830:6: ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) )
                    // InternalDependencyModelLanguage.g:3830:7: ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) )
                    {
                    // InternalDependencyModelLanguage.g:3830:7: ( (lv_assignOperator_2_0= ruleAssignOperator ) )
                    // InternalDependencyModelLanguage.g:3831:1: (lv_assignOperator_2_0= ruleAssignOperator )
                    {
                    // InternalDependencyModelLanguage.g:3831:1: (lv_assignOperator_2_0= ruleAssignOperator )
                    // InternalDependencyModelLanguage.g:3832:3: lv_assignOperator_2_0= ruleAssignOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_assignOperator_2_0=ruleAssignOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForLoopCountingExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"assignOperator",
                              		lv_assignOperator_2_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.AssignOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:3848:2: ( (lv_rhs_assignExpression_3_0= ruleExpression ) )
                    // InternalDependencyModelLanguage.g:3849:1: (lv_rhs_assignExpression_3_0= ruleExpression )
                    {
                    // InternalDependencyModelLanguage.g:3849:1: (lv_rhs_assignExpression_3_0= ruleExpression )
                    // InternalDependencyModelLanguage.g:3850:3: lv_rhs_assignExpression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getRhs_assignExpressionExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_rhs_assignExpression_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForLoopCountingExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rhs_assignExpression",
                              		lv_rhs_assignExpression_3_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForLoopCountingExpression"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalDependencyModelLanguage.g:3874:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalDependencyModelLanguage.g:3875:2: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalDependencyModelLanguage.g:3876:2: iv_ruleWhileLoop= ruleWhileLoop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileLoopRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleWhileLoop=ruleWhileLoop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileLoop; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileLoop"


    // $ANTLR start "ruleWhileLoop"
    // InternalDependencyModelLanguage.g:3883:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_loopTest_2_0 = null;

        EObject lv_block_4_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:3886:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) )
            // InternalDependencyModelLanguage.g:3887:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            {
            // InternalDependencyModelLanguage.g:3887:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            // InternalDependencyModelLanguage.g:3887:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalDependencyModelLanguage.g:3895:1: ( (lv_loopTest_2_0= ruleExpression ) )
            // InternalDependencyModelLanguage.g:3896:1: (lv_loopTest_2_0= ruleExpression )
            {
            // InternalDependencyModelLanguage.g:3896:1: (lv_loopTest_2_0= ruleExpression )
            // InternalDependencyModelLanguage.g:3897:3: lv_loopTest_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileLoopAccess().getLoopTestExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_36);
            lv_loopTest_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileLoopRule());
              	        }
                     		set(
                     			current, 
                     			"loopTest",
                      		lv_loopTest_2_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3());
                  
            }
            // InternalDependencyModelLanguage.g:3917:1: ( (lv_block_4_0= ruleBlock ) )
            // InternalDependencyModelLanguage.g:3918:1: (lv_block_4_0= ruleBlock )
            {
            // InternalDependencyModelLanguage.g:3918:1: (lv_block_4_0= ruleBlock )
            // InternalDependencyModelLanguage.g:3919:3: lv_block_4_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileLoopAccess().getBlockBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_block_4_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileLoopRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_4_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleDoWhileLoop"
    // InternalDependencyModelLanguage.g:3943:1: entryRuleDoWhileLoop returns [EObject current=null] : iv_ruleDoWhileLoop= ruleDoWhileLoop EOF ;
    public final EObject entryRuleDoWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhileLoop = null;


        try {
            // InternalDependencyModelLanguage.g:3944:2: (iv_ruleDoWhileLoop= ruleDoWhileLoop EOF )
            // InternalDependencyModelLanguage.g:3945:2: iv_ruleDoWhileLoop= ruleDoWhileLoop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoWhileLoopRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDoWhileLoop=ruleDoWhileLoop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoWhileLoop; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoWhileLoop"


    // $ANTLR start "ruleDoWhileLoop"
    // InternalDependencyModelLanguage.g:3952:1: ruleDoWhileLoop returns [EObject current=null] : (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' ) ;
    public final EObject ruleDoWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_block_1_0 = null;

        EObject lv_loopTest_4_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:3955:28: ( (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' ) )
            // InternalDependencyModelLanguage.g:3956:1: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' )
            {
            // InternalDependencyModelLanguage.g:3956:1: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' )
            // InternalDependencyModelLanguage.g:3956:3: otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');'
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDoWhileLoopAccess().getDoKeyword_0());
                  
            }
            // InternalDependencyModelLanguage.g:3960:1: ( (lv_block_1_0= ruleBlock ) )
            // InternalDependencyModelLanguage.g:3961:1: (lv_block_1_0= ruleBlock )
            {
            // InternalDependencyModelLanguage.g:3961:1: (lv_block_1_0= ruleBlock )
            // InternalDependencyModelLanguage.g:3962:3: lv_block_1_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoWhileLoopAccess().getBlockBlockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_58);
            lv_block_1_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoWhileLoopRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_1_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,56,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDoWhileLoopAccess().getWhileKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDoWhileLoopAccess().getLeftParenthesisKeyword_3());
                  
            }
            // InternalDependencyModelLanguage.g:3986:1: ( (lv_loopTest_4_0= ruleExpression ) )
            // InternalDependencyModelLanguage.g:3987:1: (lv_loopTest_4_0= ruleExpression )
            {
            // InternalDependencyModelLanguage.g:3987:1: (lv_loopTest_4_0= ruleExpression )
            // InternalDependencyModelLanguage.g:3988:3: lv_loopTest_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoWhileLoopAccess().getLoopTestExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_59);
            lv_loopTest_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoWhileLoopRule());
              	        }
                     		set(
                     			current, 
                     			"loopTest",
                      		lv_loopTest_4_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDoWhileLoopAccess().getRightParenthesisSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoWhileLoop"


    // $ANTLR start "entryRuleIfStatement"
    // InternalDependencyModelLanguage.g:4016:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalDependencyModelLanguage.g:4017:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalDependencyModelLanguage.g:4018:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalDependencyModelLanguage.g:4025:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( (lv_elseIfStatements_5_0= ruleElseIfStatement ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_ifCondition_2_0 = null;

        EObject lv_ifBlock_4_0 = null;

        EObject lv_elseIfStatements_5_0 = null;

        EObject lv_elseBlock_7_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:4028:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( (lv_elseIfStatements_5_0= ruleElseIfStatement ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBlock ) ) )? ) )
            // InternalDependencyModelLanguage.g:4029:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( (lv_elseIfStatements_5_0= ruleElseIfStatement ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBlock ) ) )? )
            {
            // InternalDependencyModelLanguage.g:4029:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( (lv_elseIfStatements_5_0= ruleElseIfStatement ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBlock ) ) )? )
            // InternalDependencyModelLanguage.g:4029:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( (lv_elseIfStatements_5_0= ruleElseIfStatement ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBlock ) ) )?
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalDependencyModelLanguage.g:4037:1: ( (lv_ifCondition_2_0= ruleExpression ) )
            // InternalDependencyModelLanguage.g:4038:1: (lv_ifCondition_2_0= ruleExpression )
            {
            // InternalDependencyModelLanguage.g:4038:1: (lv_ifCondition_2_0= ruleExpression )
            // InternalDependencyModelLanguage.g:4039:3: lv_ifCondition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getIfConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_36);
            lv_ifCondition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"ifCondition",
                      		lv_ifCondition_2_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // InternalDependencyModelLanguage.g:4059:1: ( (lv_ifBlock_4_0= ruleBlock ) )
            // InternalDependencyModelLanguage.g:4060:1: (lv_ifBlock_4_0= ruleBlock )
            {
            // InternalDependencyModelLanguage.g:4060:1: (lv_ifBlock_4_0= ruleBlock )
            // InternalDependencyModelLanguage.g:4061:3: lv_ifBlock_4_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getIfBlockBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_60);
            lv_ifBlock_4_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"ifBlock",
                      		lv_ifBlock_4_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:4077:2: ( (lv_elseIfStatements_5_0= ruleElseIfStatement ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==60) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalDependencyModelLanguage.g:4078:1: (lv_elseIfStatements_5_0= ruleElseIfStatement )
            	    {
            	    // InternalDependencyModelLanguage.g:4078:1: (lv_elseIfStatements_5_0= ruleElseIfStatement )
            	    // InternalDependencyModelLanguage.g:4079:3: lv_elseIfStatements_5_0= ruleElseIfStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseIfStatementsElseIfStatementParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_60);
            	    lv_elseIfStatements_5_0=ruleElseIfStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elseIfStatements",
            	              		lv_elseIfStatements_5_0, 
            	              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.ElseIfStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            // InternalDependencyModelLanguage.g:4095:3: (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBlock ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==59) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalDependencyModelLanguage.g:4095:5: otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBlock ) )
                    {
                    otherlv_6=(Token)match(input,59,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getElseKeyword_6_0());
                          
                    }
                    // InternalDependencyModelLanguage.g:4099:1: ( (lv_elseBlock_7_0= ruleBlock ) )
                    // InternalDependencyModelLanguage.g:4100:1: (lv_elseBlock_7_0= ruleBlock )
                    {
                    // InternalDependencyModelLanguage.g:4100:1: (lv_elseBlock_7_0= ruleBlock )
                    // InternalDependencyModelLanguage.g:4101:3: lv_elseBlock_7_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_elseBlock_7_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"elseBlock",
                              		lv_elseBlock_7_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleElseIfStatement"
    // InternalDependencyModelLanguage.g:4125:1: entryRuleElseIfStatement returns [EObject current=null] : iv_ruleElseIfStatement= ruleElseIfStatement EOF ;
    public final EObject entryRuleElseIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfStatement = null;


        try {
            // InternalDependencyModelLanguage.g:4126:2: (iv_ruleElseIfStatement= ruleElseIfStatement EOF )
            // InternalDependencyModelLanguage.g:4127:2: iv_ruleElseIfStatement= ruleElseIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleElseIfStatement=ruleElseIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElseIfStatement"


    // $ANTLR start "ruleElseIfStatement"
    // InternalDependencyModelLanguage.g:4134:1: ruleElseIfStatement returns [EObject current=null] : (otherlv_0= 'elseif' otherlv_1= '(' ( (lv_elseIfCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_elseIfBlock_4_0= ruleBlock ) ) ) ;
    public final EObject ruleElseIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elseIfCondition_2_0 = null;

        EObject lv_elseIfBlock_4_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:4137:28: ( (otherlv_0= 'elseif' otherlv_1= '(' ( (lv_elseIfCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_elseIfBlock_4_0= ruleBlock ) ) ) )
            // InternalDependencyModelLanguage.g:4138:1: (otherlv_0= 'elseif' otherlv_1= '(' ( (lv_elseIfCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_elseIfBlock_4_0= ruleBlock ) ) )
            {
            // InternalDependencyModelLanguage.g:4138:1: (otherlv_0= 'elseif' otherlv_1= '(' ( (lv_elseIfCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_elseIfBlock_4_0= ruleBlock ) ) )
            // InternalDependencyModelLanguage.g:4138:3: otherlv_0= 'elseif' otherlv_1= '(' ( (lv_elseIfCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_elseIfBlock_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,60,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElseIfStatementAccess().getElseifKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getElseIfStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalDependencyModelLanguage.g:4146:1: ( (lv_elseIfCondition_2_0= ruleExpression ) )
            // InternalDependencyModelLanguage.g:4147:1: (lv_elseIfCondition_2_0= ruleExpression )
            {
            // InternalDependencyModelLanguage.g:4147:1: (lv_elseIfCondition_2_0= ruleExpression )
            // InternalDependencyModelLanguage.g:4148:3: lv_elseIfCondition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElseIfStatementAccess().getElseIfConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_36);
            lv_elseIfCondition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElseIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"elseIfCondition",
                      		lv_elseIfCondition_2_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getElseIfStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // InternalDependencyModelLanguage.g:4168:1: ( (lv_elseIfBlock_4_0= ruleBlock ) )
            // InternalDependencyModelLanguage.g:4169:1: (lv_elseIfBlock_4_0= ruleBlock )
            {
            // InternalDependencyModelLanguage.g:4169:1: (lv_elseIfBlock_4_0= ruleBlock )
            // InternalDependencyModelLanguage.g:4170:3: lv_elseIfBlock_4_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElseIfStatementAccess().getElseIfBlockBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_elseIfBlock_4_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElseIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"elseIfBlock",
                      		lv_elseIfBlock_4_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElseIfStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalDependencyModelLanguage.g:4194:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalDependencyModelLanguage.g:4195:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalDependencyModelLanguage.g:4196:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // InternalDependencyModelLanguage.g:4203:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:4206:28: ( ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalDependencyModelLanguage.g:4207:1: ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalDependencyModelLanguage.g:4207:1: ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalDependencyModelLanguage.g:4207:2: () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // InternalDependencyModelLanguage.g:4207:2: ()
            // InternalDependencyModelLanguage.g:4208:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getReturnKeyword_1());
                  
            }
            // InternalDependencyModelLanguage.g:4220:1: ( (lv_expression_2_0= ruleExpression ) )
            // InternalDependencyModelLanguage.g:4221:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalDependencyModelLanguage.g:4221:1: (lv_expression_2_0= ruleExpression )
            // InternalDependencyModelLanguage.g:4222:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReturnStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getReturnStatementAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleOperationCallStatement"
    // InternalDependencyModelLanguage.g:4250:1: entryRuleOperationCallStatement returns [EObject current=null] : iv_ruleOperationCallStatement= ruleOperationCallStatement EOF ;
    public final EObject entryRuleOperationCallStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCallStatement = null;


        try {
            // InternalDependencyModelLanguage.g:4251:2: (iv_ruleOperationCallStatement= ruleOperationCallStatement EOF )
            // InternalDependencyModelLanguage.g:4252:2: iv_ruleOperationCallStatement= ruleOperationCallStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationCallStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOperationCallStatement=ruleOperationCallStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationCallStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationCallStatement"


    // $ANTLR start "ruleOperationCallStatement"
    // InternalDependencyModelLanguage.g:4259:1: ruleOperationCallStatement returns [EObject current=null] : (this_OperationCall_0= ruleOperationCall otherlv_1= ';' ) ;
    public final EObject ruleOperationCallStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_OperationCall_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:4262:28: ( (this_OperationCall_0= ruleOperationCall otherlv_1= ';' ) )
            // InternalDependencyModelLanguage.g:4263:1: (this_OperationCall_0= ruleOperationCall otherlv_1= ';' )
            {
            // InternalDependencyModelLanguage.g:4263:1: (this_OperationCall_0= ruleOperationCall otherlv_1= ';' )
            // InternalDependencyModelLanguage.g:4264:2: this_OperationCall_0= ruleOperationCall otherlv_1= ';'
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationCallStatementAccess().getOperationCallParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_4);
            this_OperationCall_0=ruleOperationCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OperationCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationCallStatementAccess().getSemicolonKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationCallStatement"


    // $ANTLR start "entryRuleExpressionStartRule"
    // InternalDependencyModelLanguage.g:4287:1: entryRuleExpressionStartRule returns [EObject current=null] : iv_ruleExpressionStartRule= ruleExpressionStartRule EOF ;
    public final EObject entryRuleExpressionStartRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStartRule = null;


        try {
            // InternalDependencyModelLanguage.g:4288:2: (iv_ruleExpressionStartRule= ruleExpressionStartRule EOF )
            // InternalDependencyModelLanguage.g:4289:2: iv_ruleExpressionStartRule= ruleExpressionStartRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionStartRuleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpressionStartRule=ruleExpressionStartRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionStartRule; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionStartRule"


    // $ANTLR start "ruleExpressionStartRule"
    // InternalDependencyModelLanguage.g:4296:1: ruleExpressionStartRule returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement ) ;
    public final EObject ruleExpressionStartRule() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_ForLoop_1 = null;

        EObject this_WhileLoop_2 = null;

        EObject this_DoWhileLoop_3 = null;

        EObject this_IfStatement_4 = null;

        EObject this_ReturnStatement_5 = null;

        EObject this_LocalVariableOrConstantDeclarationStatement_6 = null;

        EObject this_OperationCallStatement_7 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:4299:28: ( (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement ) )
            // InternalDependencyModelLanguage.g:4300:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement )
            {
            // InternalDependencyModelLanguage.g:4300:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement )
            int alt60=8;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // InternalDependencyModelLanguage.g:4301:2: this_Assignment_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Assignment_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:4314:2: this_ForLoop_1= ruleForLoop
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getForLoopParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ForLoop_1=ruleForLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ForLoop_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:4327:2: this_WhileLoop_2= ruleWhileLoop
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getWhileLoopParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_WhileLoop_2=ruleWhileLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WhileLoop_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalDependencyModelLanguage.g:4340:2: this_DoWhileLoop_3= ruleDoWhileLoop
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getDoWhileLoopParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DoWhileLoop_3=ruleDoWhileLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DoWhileLoop_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalDependencyModelLanguage.g:4353:2: this_IfStatement_4= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getIfStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IfStatement_4=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfStatement_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalDependencyModelLanguage.g:4366:2: this_ReturnStatement_5= ruleReturnStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getReturnStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReturnStatement_5=ruleReturnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReturnStatement_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalDependencyModelLanguage.g:4379:2: this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getLocalVariableOrConstantDeclarationStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LocalVariableOrConstantDeclarationStatement_6=ruleLocalVariableOrConstantDeclarationStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalVariableOrConstantDeclarationStatement_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalDependencyModelLanguage.g:4392:2: this_OperationCallStatement_7= ruleOperationCallStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getOperationCallStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_OperationCallStatement_7=ruleOperationCallStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OperationCallStatement_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionStartRule"


    // $ANTLR start "entryRuleAssignment"
    // InternalDependencyModelLanguage.g:4411:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalDependencyModelLanguage.g:4412:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalDependencyModelLanguage.g:4413:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalDependencyModelLanguage.g:4420:1: ruleAssignment returns [EObject current=null] : ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_lhs_typedNamedElementExpression_0_0 = null;

        Enumerator lv_assignOperator_1_0 = null;

        EObject lv_rhs_assignExpression_2_0 = null;

        Enumerator lv_incrementDecrementOperator_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:4423:28: ( ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) ) otherlv_4= ';' ) )
            // InternalDependencyModelLanguage.g:4424:1: ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) ) otherlv_4= ';' )
            {
            // InternalDependencyModelLanguage.g:4424:1: ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) ) otherlv_4= ';' )
            // InternalDependencyModelLanguage.g:4424:2: ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) ) otherlv_4= ';'
            {
            // InternalDependencyModelLanguage.g:4424:2: ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) )
            // InternalDependencyModelLanguage.g:4425:1: (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression )
            {
            // InternalDependencyModelLanguage.g:4425:1: (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression )
            // InternalDependencyModelLanguage.g:4426:3: lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getLhs_typedNamedElementExpressionTypedNamedElementExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_lhs_typedNamedElementExpression_0_0=ruleTypedNamedElementExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"lhs_typedNamedElementExpression",
                      		lv_lhs_typedNamedElementExpression_0_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.TypedNamedElementExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:4442:2: ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==62||(LA61_0>=92 && LA61_0<=93)) ) {
                alt61=1;
            }
            else if ( ((LA61_0>=90 && LA61_0<=91)) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalDependencyModelLanguage.g:4442:3: ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) )
                    {
                    // InternalDependencyModelLanguage.g:4442:3: ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) )
                    // InternalDependencyModelLanguage.g:4442:4: ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) )
                    {
                    // InternalDependencyModelLanguage.g:4442:4: ( (lv_assignOperator_1_0= ruleAssignOperator ) )
                    // InternalDependencyModelLanguage.g:4443:1: (lv_assignOperator_1_0= ruleAssignOperator )
                    {
                    // InternalDependencyModelLanguage.g:4443:1: (lv_assignOperator_1_0= ruleAssignOperator )
                    // InternalDependencyModelLanguage.g:4444:3: lv_assignOperator_1_0= ruleAssignOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_assignOperator_1_0=ruleAssignOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"assignOperator",
                              		lv_assignOperator_1_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.AssignOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:4460:2: ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) )
                    // InternalDependencyModelLanguage.g:4461:1: (lv_rhs_assignExpression_2_0= ruleInitializeExpression )
                    {
                    // InternalDependencyModelLanguage.g:4461:1: (lv_rhs_assignExpression_2_0= ruleInitializeExpression )
                    // InternalDependencyModelLanguage.g:4462:3: lv_rhs_assignExpression_2_0= ruleInitializeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getRhs_assignExpressionInitializeExpressionParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_rhs_assignExpression_2_0=ruleInitializeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"rhs_assignExpression",
                              		lv_rhs_assignExpression_2_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.InitializeExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:4479:6: ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) )
                    {
                    // InternalDependencyModelLanguage.g:4479:6: ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) )
                    // InternalDependencyModelLanguage.g:4480:1: (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator )
                    {
                    // InternalDependencyModelLanguage.g:4480:1: (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator )
                    // InternalDependencyModelLanguage.g:4481:3: lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorUnaryPostIncrementDecrementOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_incrementDecrementOperator_3_0=ruleUnaryPostIncrementDecrementOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"incrementDecrementOperator",
                              		lv_incrementDecrementOperator_3_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.UnaryPostIncrementDecrementOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleInitializeExpression"
    // InternalDependencyModelLanguage.g:4509:1: entryRuleInitializeExpression returns [EObject current=null] : iv_ruleInitializeExpression= ruleInitializeExpression EOF ;
    public final EObject entryRuleInitializeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitializeExpression = null;


        try {
            // InternalDependencyModelLanguage.g:4510:2: (iv_ruleInitializeExpression= ruleInitializeExpression EOF )
            // InternalDependencyModelLanguage.g:4511:2: iv_ruleInitializeExpression= ruleInitializeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitializeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInitializeExpression=ruleInitializeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitializeExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitializeExpression"


    // $ANTLR start "ruleInitializeExpression"
    // InternalDependencyModelLanguage.g:4518:1: ruleInitializeExpression returns [EObject current=null] : (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression ) ;
    public final EObject ruleInitializeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArrayInitializeExpression_0 = null;

        EObject this_NondeterministicChoiceExpression_1 = null;

        EObject this_Expression_2 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:4521:28: ( (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression ) )
            // InternalDependencyModelLanguage.g:4522:1: (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression )
            {
            // InternalDependencyModelLanguage.g:4522:1: (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression )
            int alt62=3;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // InternalDependencyModelLanguage.g:4523:2: this_ArrayInitializeExpression_0= ruleArrayInitializeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInitializeExpressionAccess().getArrayInitializeExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ArrayInitializeExpression_0=ruleArrayInitializeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayInitializeExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:4536:2: this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInitializeExpressionAccess().getNondeterministicChoiceExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NondeterministicChoiceExpression_1=ruleNondeterministicChoiceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NondeterministicChoiceExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:4549:2: this_Expression_2= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInitializeExpressionAccess().getExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitializeExpression"


    // $ANTLR start "entryRuleArrayInitializeExpression"
    // InternalDependencyModelLanguage.g:4568:1: entryRuleArrayInitializeExpression returns [EObject current=null] : iv_ruleArrayInitializeExpression= ruleArrayInitializeExpression EOF ;
    public final EObject entryRuleArrayInitializeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayInitializeExpression = null;


        try {
            // InternalDependencyModelLanguage.g:4569:2: (iv_ruleArrayInitializeExpression= ruleArrayInitializeExpression EOF )
            // InternalDependencyModelLanguage.g:4570:2: iv_ruleArrayInitializeExpression= ruleArrayInitializeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayInitializeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArrayInitializeExpression=ruleArrayInitializeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayInitializeExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayInitializeExpression"


    // $ANTLR start "ruleArrayInitializeExpression"
    // InternalDependencyModelLanguage.g:4577:1: ruleArrayInitializeExpression returns [EObject current=null] : (otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayInitializeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:4580:28: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']' ) )
            // InternalDependencyModelLanguage.g:4581:1: (otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']' )
            {
            // InternalDependencyModelLanguage.g:4581:1: (otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']' )
            // InternalDependencyModelLanguage.g:4581:3: otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayInitializeExpressionAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // InternalDependencyModelLanguage.g:4585:1: ( (lv_expressions_1_0= ruleInitializeExpression ) )
            // InternalDependencyModelLanguage.g:4586:1: (lv_expressions_1_0= ruleInitializeExpression )
            {
            // InternalDependencyModelLanguage.g:4586:1: (lv_expressions_1_0= ruleInitializeExpression )
            // InternalDependencyModelLanguage.g:4587:3: lv_expressions_1_0= ruleInitializeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsInitializeExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_61);
            lv_expressions_1_0=ruleInitializeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayInitializeExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"expressions",
                      		lv_expressions_1_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.InitializeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:4603:2: (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==16) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalDependencyModelLanguage.g:4603:4: otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getArrayInitializeExpressionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalDependencyModelLanguage.g:4607:1: ( (lv_expressions_3_0= ruleInitializeExpression ) )
            	    // InternalDependencyModelLanguage.g:4608:1: (lv_expressions_3_0= ruleInitializeExpression )
            	    {
            	    // InternalDependencyModelLanguage.g:4608:1: (lv_expressions_3_0= ruleInitializeExpression )
            	    // InternalDependencyModelLanguage.g:4609:3: lv_expressions_3_0= ruleInitializeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsInitializeExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_61);
            	    lv_expressions_3_0=ruleInitializeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArrayInitializeExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_3_0, 
            	              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.InitializeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayInitializeExpressionAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayInitializeExpression"


    // $ANTLR start "entryRuleLocalVariableOrConstantDeclarationStatement"
    // InternalDependencyModelLanguage.g:4637:1: entryRuleLocalVariableOrConstantDeclarationStatement returns [EObject current=null] : iv_ruleLocalVariableOrConstantDeclarationStatement= ruleLocalVariableOrConstantDeclarationStatement EOF ;
    public final EObject entryRuleLocalVariableOrConstantDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariableOrConstantDeclarationStatement = null;


        try {
            // InternalDependencyModelLanguage.g:4638:2: (iv_ruleLocalVariableOrConstantDeclarationStatement= ruleLocalVariableOrConstantDeclarationStatement EOF )
            // InternalDependencyModelLanguage.g:4639:2: iv_ruleLocalVariableOrConstantDeclarationStatement= ruleLocalVariableOrConstantDeclarationStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalVariableOrConstantDeclarationStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLocalVariableOrConstantDeclarationStatement=ruleLocalVariableOrConstantDeclarationStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalVariableOrConstantDeclarationStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalVariableOrConstantDeclarationStatement"


    // $ANTLR start "ruleLocalVariableOrConstantDeclarationStatement"
    // InternalDependencyModelLanguage.g:4646:1: ruleLocalVariableOrConstantDeclarationStatement returns [EObject current=null] : ( ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) ) ) ;
    public final EObject ruleLocalVariableOrConstantDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_0_1 = null;

        EObject lv_variable_0_2 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:4649:28: ( ( ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) ) ) )
            // InternalDependencyModelLanguage.g:4650:1: ( ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) ) )
            {
            // InternalDependencyModelLanguage.g:4650:1: ( ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) ) )
            // InternalDependencyModelLanguage.g:4651:1: ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) )
            {
            // InternalDependencyModelLanguage.g:4651:1: ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) )
            // InternalDependencyModelLanguage.g:4652:1: (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration )
            {
            // InternalDependencyModelLanguage.g:4652:1: (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID) ) {
                alt64=1;
            }
            else if ( (LA64_0==63) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalDependencyModelLanguage.g:4653:3: lv_variable_0_1= ruleLocalVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableLocalVariableDeclarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_variable_0_1=ruleLocalVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalVariableOrConstantDeclarationStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"variable",
                              		lv_variable_0_1, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.LocalVariableDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:4668:8: lv_variable_0_2= ruleLocalConstantDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableLocalConstantDeclarationParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_variable_0_2=ruleLocalConstantDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalVariableOrConstantDeclarationStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"variable",
                              		lv_variable_0_2, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.LocalConstantDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalVariableOrConstantDeclarationStatement"


    // $ANTLR start "entryRuleLocalVariableDeclaration"
    // InternalDependencyModelLanguage.g:4694:1: entryRuleLocalVariableDeclaration returns [EObject current=null] : iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF ;
    public final EObject entryRuleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariableDeclaration = null;


        try {
            // InternalDependencyModelLanguage.g:4695:2: (iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF )
            // InternalDependencyModelLanguage.g:4696:2: iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalVariableDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLocalVariableDeclaration=ruleLocalVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalVariableDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalVariableDeclaration"


    // $ANTLR start "ruleLocalVariableDeclaration"
    // InternalDependencyModelLanguage.g:4703:1: ruleLocalVariableDeclaration returns [EObject current=null] : ( ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_initializeExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:4706:28: ( ( ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';' ) )
            // InternalDependencyModelLanguage.g:4707:1: ( ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';' )
            {
            // InternalDependencyModelLanguage.g:4707:1: ( ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';' )
            // InternalDependencyModelLanguage.g:4707:2: ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';'
            {
            // InternalDependencyModelLanguage.g:4707:2: ( ( ruleDATATYPE ) )
            // InternalDependencyModelLanguage.g:4708:1: ( ruleDATATYPE )
            {
            // InternalDependencyModelLanguage.g:4708:1: ( ruleDATATYPE )
            // InternalDependencyModelLanguage.g:4709:3: ruleDATATYPE
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalVariableDeclarationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeDataTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_14);
            ruleDATATYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:4725:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalDependencyModelLanguage.g:4726:1: (lv_name_1_0= RULE_ID )
            {
            // InternalDependencyModelLanguage.g:4726:1: (lv_name_1_0= RULE_ID )
            // InternalDependencyModelLanguage.g:4727:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getLocalVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.ID");
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:4743:2: (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==62) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalDependencyModelLanguage.g:4743:4: otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) )
                    {
                    otherlv_2=(Token)match(input,62,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLocalVariableDeclarationAccess().getColonEqualsSignKeyword_2_0());
                          
                    }
                    // InternalDependencyModelLanguage.g:4747:1: ( (lv_initializeExpression_3_0= ruleInitializeExpression ) )
                    // InternalDependencyModelLanguage.g:4748:1: (lv_initializeExpression_3_0= ruleInitializeExpression )
                    {
                    // InternalDependencyModelLanguage.g:4748:1: (lv_initializeExpression_3_0= ruleInitializeExpression )
                    // InternalDependencyModelLanguage.g:4749:3: lv_initializeExpression_3_0= ruleInitializeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalVariableDeclarationAccess().getInitializeExpressionInitializeExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_initializeExpression_3_0=ruleInitializeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"initializeExpression",
                              		lv_initializeExpression_3_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.InitializeExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLocalVariableDeclarationAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalVariableDeclaration"


    // $ANTLR start "entryRuleLocalConstantDeclaration"
    // InternalDependencyModelLanguage.g:4777:1: entryRuleLocalConstantDeclaration returns [EObject current=null] : iv_ruleLocalConstantDeclaration= ruleLocalConstantDeclaration EOF ;
    public final EObject entryRuleLocalConstantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalConstantDeclaration = null;


        try {
            // InternalDependencyModelLanguage.g:4778:2: (iv_ruleLocalConstantDeclaration= ruleLocalConstantDeclaration EOF )
            // InternalDependencyModelLanguage.g:4779:2: iv_ruleLocalConstantDeclaration= ruleLocalConstantDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalConstantDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLocalConstantDeclaration=ruleLocalConstantDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalConstantDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalConstantDeclaration"


    // $ANTLR start "ruleLocalConstantDeclaration"
    // InternalDependencyModelLanguage.g:4786:1: ruleLocalConstantDeclaration returns [EObject current=null] : ( ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleLocalConstantDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_initializeExpression_4_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:4789:28: ( ( ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';' ) )
            // InternalDependencyModelLanguage.g:4790:1: ( ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';' )
            {
            // InternalDependencyModelLanguage.g:4790:1: ( ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';' )
            // InternalDependencyModelLanguage.g:4790:2: ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';'
            {
            // InternalDependencyModelLanguage.g:4790:2: ( (lv_constant_0_0= 'const' ) )
            // InternalDependencyModelLanguage.g:4791:1: (lv_constant_0_0= 'const' )
            {
            // InternalDependencyModelLanguage.g:4791:1: (lv_constant_0_0= 'const' )
            // InternalDependencyModelLanguage.g:4792:3: lv_constant_0_0= 'const'
            {
            lv_constant_0_0=(Token)match(input,63,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_constant_0_0, grammarAccess.getLocalConstantDeclarationAccess().getConstantConstKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalConstantDeclarationRule());
              	        }
                     		setWithLastConsumed(current, "constant", true, "const");
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:4805:2: ( ( ruleDATATYPE ) )
            // InternalDependencyModelLanguage.g:4806:1: ( ruleDATATYPE )
            {
            // InternalDependencyModelLanguage.g:4806:1: ( ruleDATATYPE )
            // InternalDependencyModelLanguage.g:4807:3: ruleDATATYPE
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalConstantDeclarationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeDataTypeCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_14);
            ruleDATATYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:4823:2: ( (lv_name_2_0= RULE_ID ) )
            // InternalDependencyModelLanguage.g:4824:1: (lv_name_2_0= RULE_ID )
            {
            // InternalDependencyModelLanguage.g:4824:1: (lv_name_2_0= RULE_ID )
            // InternalDependencyModelLanguage.g:4825:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getLocalConstantDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalConstantDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,62,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLocalConstantDeclarationAccess().getColonEqualsSignKeyword_3());
                  
            }
            // InternalDependencyModelLanguage.g:4845:1: ( (lv_initializeExpression_4_0= ruleInitializeExpression ) )
            // InternalDependencyModelLanguage.g:4846:1: (lv_initializeExpression_4_0= ruleInitializeExpression )
            {
            // InternalDependencyModelLanguage.g:4846:1: (lv_initializeExpression_4_0= ruleInitializeExpression )
            // InternalDependencyModelLanguage.g:4847:3: lv_initializeExpression_4_0= ruleInitializeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalConstantDeclarationAccess().getInitializeExpressionInitializeExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_initializeExpression_4_0=ruleInitializeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalConstantDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"initializeExpression",
                      		lv_initializeExpression_4_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.InitializeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getLocalConstantDeclarationAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalConstantDeclaration"


    // $ANTLR start "entryRuleNondeterministicChoiceExpression"
    // InternalDependencyModelLanguage.g:4875:1: entryRuleNondeterministicChoiceExpression returns [EObject current=null] : iv_ruleNondeterministicChoiceExpression= ruleNondeterministicChoiceExpression EOF ;
    public final EObject entryRuleNondeterministicChoiceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNondeterministicChoiceExpression = null;


        try {
            // InternalDependencyModelLanguage.g:4876:2: (iv_ruleNondeterministicChoiceExpression= ruleNondeterministicChoiceExpression EOF )
            // InternalDependencyModelLanguage.g:4877:2: iv_ruleNondeterministicChoiceExpression= ruleNondeterministicChoiceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNondeterministicChoiceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNondeterministicChoiceExpression=ruleNondeterministicChoiceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNondeterministicChoiceExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNondeterministicChoiceExpression"


    // $ANTLR start "ruleNondeterministicChoiceExpression"
    // InternalDependencyModelLanguage.g:4884:1: ruleNondeterministicChoiceExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) ) ) ;
    public final EObject ruleNondeterministicChoiceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_range_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:4887:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) ) ) )
            // InternalDependencyModelLanguage.g:4888:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) ) )
            {
            // InternalDependencyModelLanguage.g:4888:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) ) )
            // InternalDependencyModelLanguage.g:4888:2: ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) )
            {
            // InternalDependencyModelLanguage.g:4888:2: ( (otherlv_0= RULE_ID ) )
            // InternalDependencyModelLanguage.g:4889:1: (otherlv_0= RULE_ID )
            {
            // InternalDependencyModelLanguage.g:4889:1: (otherlv_0= RULE_ID )
            // InternalDependencyModelLanguage.g:4890:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNondeterministicChoiceExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypePrimitiveDataTypeCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalDependencyModelLanguage.g:4904:2: ( (lv_range_1_0= ruleRange ) )
            // InternalDependencyModelLanguage.g:4905:1: (lv_range_1_0= ruleRange )
            {
            // InternalDependencyModelLanguage.g:4905:1: (lv_range_1_0= ruleRange )
            // InternalDependencyModelLanguage.g:4906:3: lv_range_1_0= ruleRange
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNondeterministicChoiceExpressionAccess().getRangeRangeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_range_1_0=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNondeterministicChoiceExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"range",
                      		lv_range_1_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Range");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNondeterministicChoiceExpression"


    // $ANTLR start "entryRuleRange"
    // InternalDependencyModelLanguage.g:4930:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalDependencyModelLanguage.g:4931:2: (iv_ruleRange= ruleRange EOF )
            // InternalDependencyModelLanguage.g:4932:2: iv_ruleRange= ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRange; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalDependencyModelLanguage.g:4939:1: ruleRange returns [EObject current=null] : (otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lowerBound_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:4942:28: ( (otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>' ) )
            // InternalDependencyModelLanguage.g:4943:1: (otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>' )
            {
            // InternalDependencyModelLanguage.g:4943:1: (otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>' )
            // InternalDependencyModelLanguage.g:4943:3: otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLessThanSignKeyword_0());
                  
            }
            // InternalDependencyModelLanguage.g:4947:1: ( (lv_lowerBound_1_0= ruleLONG ) )
            // InternalDependencyModelLanguage.g:4948:1: (lv_lowerBound_1_0= ruleLONG )
            {
            // InternalDependencyModelLanguage.g:4948:1: (lv_lowerBound_1_0= ruleLONG )
            // InternalDependencyModelLanguage.g:4949:3: lv_lowerBound_1_0= ruleLONG
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRangeAccess().getLowerBoundLONGParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_lowerBound_1_0=ruleLONG();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRangeRule());
              	        }
                     		set(
                     			current, 
                     			"lowerBound",
                      		lv_lowerBound_1_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.LONG");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getCommaKeyword_2());
                  
            }
            // InternalDependencyModelLanguage.g:4969:1: ( (lv_upperBound_3_0= ruleLONG ) )
            // InternalDependencyModelLanguage.g:4970:1: (lv_upperBound_3_0= ruleLONG )
            {
            // InternalDependencyModelLanguage.g:4970:1: (lv_upperBound_3_0= ruleLONG )
            // InternalDependencyModelLanguage.g:4971:3: lv_upperBound_3_0= ruleLONG
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRangeAccess().getUpperBoundLONGParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_65);
            lv_upperBound_3_0=ruleLONG();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRangeRule());
              	        }
                     		set(
                     			current, 
                     			"upperBound",
                      		lv_upperBound_3_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.LONG");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRangeAccess().getGreaterThanSignKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleExpression"
    // InternalDependencyModelLanguage.g:4999:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDependencyModelLanguage.g:5000:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalDependencyModelLanguage.g:5001:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDependencyModelLanguage.g:5008:1: ruleExpression returns [EObject current=null] : this_LogicalExpression_0= ruleLogicalExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:5011:28: (this_LogicalExpression_0= ruleLogicalExpression )
            // InternalDependencyModelLanguage.g:5013:2: this_LogicalExpression_0= ruleLogicalExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getLogicalExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_LogicalExpression_0=ruleLogicalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLogicalExpression"
    // InternalDependencyModelLanguage.g:5032:1: entryRuleLogicalExpression returns [EObject current=null] : iv_ruleLogicalExpression= ruleLogicalExpression EOF ;
    public final EObject entryRuleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalExpression = null;


        try {
            // InternalDependencyModelLanguage.g:5033:2: (iv_ruleLogicalExpression= ruleLogicalExpression EOF )
            // InternalDependencyModelLanguage.g:5034:2: iv_ruleLogicalExpression= ruleLogicalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLogicalExpression=ruleLogicalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalExpression"


    // $ANTLR start "ruleLogicalExpression"
    // InternalDependencyModelLanguage.g:5041:1: ruleLogicalExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:5044:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalDependencyModelLanguage.g:5046:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalDependencyModelLanguage.g:5065:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalDependencyModelLanguage.g:5066:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalDependencyModelLanguage.g:5067:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // InternalDependencyModelLanguage.g:5074:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:5077:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* ) )
            // InternalDependencyModelLanguage.g:5078:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // InternalDependencyModelLanguage.g:5078:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* )
            // InternalDependencyModelLanguage.g:5079:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_66);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalDependencyModelLanguage.g:5090:1: ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==94) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalDependencyModelLanguage.g:5090:2: () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // InternalDependencyModelLanguage.g:5090:2: ()
            	    // InternalDependencyModelLanguage.g:5091:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalDependencyModelLanguage.g:5099:2: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
            	    // InternalDependencyModelLanguage.g:5100:1: (lv_operator_2_0= ruleLogicalOrOperator )
            	    {
            	    // InternalDependencyModelLanguage.g:5100:1: (lv_operator_2_0= ruleLogicalOrOperator )
            	    // InternalDependencyModelLanguage.g:5101:3: lv_operator_2_0= ruleLogicalOrOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    lv_operator_2_0=ruleLogicalOrOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.LogicalOrOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalDependencyModelLanguage.g:5117:2: ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) )
            	    // InternalDependencyModelLanguage.g:5118:1: (lv_rightExpression_3_0= ruleLogicalAndExpression )
            	    {
            	    // InternalDependencyModelLanguage.g:5118:1: (lv_rightExpression_3_0= ruleLogicalAndExpression )
            	    // InternalDependencyModelLanguage.g:5119:3: lv_rightExpression_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_66);
            	    lv_rightExpression_3_0=ruleLogicalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpression",
            	              		lv_rightExpression_3_0, 
            	              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.LogicalAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalDependencyModelLanguage.g:5143:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalDependencyModelLanguage.g:5144:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalDependencyModelLanguage.g:5145:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // InternalDependencyModelLanguage.g:5152:1: ruleLogicalAndExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:5155:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalDependencyModelLanguage.g:5156:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalDependencyModelLanguage.g:5156:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            // InternalDependencyModelLanguage.g:5157:2: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_67);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparisonExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalDependencyModelLanguage.g:5168:1: ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==95) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalDependencyModelLanguage.g:5168:2: () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalDependencyModelLanguage.g:5168:2: ()
            	    // InternalDependencyModelLanguage.g:5169:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalDependencyModelLanguage.g:5177:2: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
            	    // InternalDependencyModelLanguage.g:5178:1: (lv_operator_2_0= ruleLogicalAndOperator )
            	    {
            	    // InternalDependencyModelLanguage.g:5178:1: (lv_operator_2_0= ruleLogicalAndOperator )
            	    // InternalDependencyModelLanguage.g:5179:3: lv_operator_2_0= ruleLogicalAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    lv_operator_2_0=ruleLogicalAndOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.LogicalAndOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalDependencyModelLanguage.g:5195:2: ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    // InternalDependencyModelLanguage.g:5196:1: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    {
            	    // InternalDependencyModelLanguage.g:5196:1: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    // InternalDependencyModelLanguage.g:5197:3: lv_rightExpression_3_0= ruleComparisonExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionComparisonExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_67);
            	    lv_rightExpression_3_0=ruleComparisonExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpression",
            	              		lv_rightExpression_3_0, 
            	              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.ComparisonExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalDependencyModelLanguage.g:5221:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalDependencyModelLanguage.g:5222:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalDependencyModelLanguage.g:5223:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalDependencyModelLanguage.g:5230:1: ruleComparisonExpression returns [EObject current=null] : (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonHigherOpExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:5233:28: ( (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? ) )
            // InternalDependencyModelLanguage.g:5234:1: (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? )
            {
            // InternalDependencyModelLanguage.g:5234:1: (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? )
            // InternalDependencyModelLanguage.g:5235:2: this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonExpressionAccess().getComparisonHigherOpExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_68);
            this_ComparisonHigherOpExpression_0=ruleComparisonHigherOpExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparisonHigherOpExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalDependencyModelLanguage.g:5246:1: ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=75 && LA68_0<=76)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalDependencyModelLanguage.g:5246:2: () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) )
                    {
                    // InternalDependencyModelLanguage.g:5246:2: ()
                    // InternalDependencyModelLanguage.g:5247:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalDependencyModelLanguage.g:5255:2: ( (lv_operator_2_0= ruleComparingEQNEQOperator ) )
                    // InternalDependencyModelLanguage.g:5256:1: (lv_operator_2_0= ruleComparingEQNEQOperator )
                    {
                    // InternalDependencyModelLanguage.g:5256:1: (lv_operator_2_0= ruleComparingEQNEQOperator )
                    // InternalDependencyModelLanguage.g:5257:3: lv_operator_2_0= ruleComparingEQNEQOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparingEQNEQOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleComparingEQNEQOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.ComparingEQNEQOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:5273:2: ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) )
                    // InternalDependencyModelLanguage.g:5274:1: (lv_rightExpression_3_0= ruleComparisonHigherOpExpression )
                    {
                    // InternalDependencyModelLanguage.g:5274:1: (lv_rightExpression_3_0= ruleComparisonHigherOpExpression )
                    // InternalDependencyModelLanguage.g:5275:3: lv_rightExpression_3_0= ruleComparisonHigherOpExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightExpressionComparisonHigherOpExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_rightExpression_3_0=ruleComparisonHigherOpExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpression",
                              		lv_rightExpression_3_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.ComparisonHigherOpExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleComparisonHigherOpExpression"
    // InternalDependencyModelLanguage.g:5299:1: entryRuleComparisonHigherOpExpression returns [EObject current=null] : iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF ;
    public final EObject entryRuleComparisonHigherOpExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonHigherOpExpression = null;


        try {
            // InternalDependencyModelLanguage.g:5300:2: (iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF )
            // InternalDependencyModelLanguage.g:5301:2: iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonHigherOpExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComparisonHigherOpExpression=ruleComparisonHigherOpExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonHigherOpExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonHigherOpExpression"


    // $ANTLR start "ruleComparisonHigherOpExpression"
    // InternalDependencyModelLanguage.g:5308:1: ruleComparisonHigherOpExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? ) ;
    public final EObject ruleComparisonHigherOpExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:5311:28: ( (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? ) )
            // InternalDependencyModelLanguage.g:5312:1: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? )
            {
            // InternalDependencyModelLanguage.g:5312:1: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? )
            // InternalDependencyModelLanguage.g:5313:2: this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_69);
            this_ArithmeticExpression_0=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ArithmeticExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalDependencyModelLanguage.g:5324:1: ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=64 && LA69_0<=65)||(LA69_0>=77 && LA69_0<=78)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalDependencyModelLanguage.g:5324:2: () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) )
                    {
                    // InternalDependencyModelLanguage.g:5324:2: ()
                    // InternalDependencyModelLanguage.g:5325:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getComparisonHigherOpExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalDependencyModelLanguage.g:5333:2: ( (lv_operator_2_0= ruleComparingRelOperator ) )
                    // InternalDependencyModelLanguage.g:5334:1: (lv_operator_2_0= ruleComparingRelOperator )
                    {
                    // InternalDependencyModelLanguage.g:5334:1: (lv_operator_2_0= ruleComparingRelOperator )
                    // InternalDependencyModelLanguage.g:5335:3: lv_operator_2_0= ruleComparingRelOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorComparingRelOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleComparingRelOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComparisonHigherOpExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.ComparingRelOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalDependencyModelLanguage.g:5351:2: ( (lv_rightExpression_3_0= ruleArithmeticExpression ) )
                    // InternalDependencyModelLanguage.g:5352:1: (lv_rightExpression_3_0= ruleArithmeticExpression )
                    {
                    // InternalDependencyModelLanguage.g:5352:1: (lv_rightExpression_3_0= ruleArithmeticExpression )
                    // InternalDependencyModelLanguage.g:5353:3: lv_rightExpression_3_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionArithmeticExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_rightExpression_3_0=ruleArithmeticExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComparisonHigherOpExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpression",
                              		lv_rightExpression_3_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.ArithmeticExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonHigherOpExpression"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalDependencyModelLanguage.g:5377:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalDependencyModelLanguage.g:5378:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalDependencyModelLanguage.g:5379:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalDependencyModelLanguage.g:5386:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditionExpression_0= ruleAdditionExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:5389:28: (this_AdditionExpression_0= ruleAdditionExpression )
            // InternalDependencyModelLanguage.g:5391:2: this_AdditionExpression_0= ruleAdditionExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditionExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_AdditionExpression_0=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditionExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleAdditionExpression"
    // InternalDependencyModelLanguage.g:5410:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // InternalDependencyModelLanguage.g:5411:2: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // InternalDependencyModelLanguage.g:5412:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAdditionExpression=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionExpression"


    // $ANTLR start "ruleAdditionExpression"
    // InternalDependencyModelLanguage.g:5419:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:5422:28: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* ) )
            // InternalDependencyModelLanguage.g:5423:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* )
            {
            // InternalDependencyModelLanguage.g:5423:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* )
            // InternalDependencyModelLanguage.g:5424:2: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_70);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalDependencyModelLanguage.g:5435:1: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==53||LA70_0==96) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalDependencyModelLanguage.g:5435:2: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) )
            	    {
            	    // InternalDependencyModelLanguage.g:5435:2: ()
            	    // InternalDependencyModelLanguage.g:5436:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalDependencyModelLanguage.g:5444:2: ( (lv_operator_2_0= ruleAdditionOperator ) )
            	    // InternalDependencyModelLanguage.g:5445:1: (lv_operator_2_0= ruleAdditionOperator )
            	    {
            	    // InternalDependencyModelLanguage.g:5445:1: (lv_operator_2_0= ruleAdditionOperator )
            	    // InternalDependencyModelLanguage.g:5446:3: lv_operator_2_0= ruleAdditionOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    lv_operator_2_0=ruleAdditionOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.AdditionOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalDependencyModelLanguage.g:5462:2: ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) )
            	    // InternalDependencyModelLanguage.g:5463:1: (lv_rightExpression_3_0= ruleMultiplicationExpression )
            	    {
            	    // InternalDependencyModelLanguage.g:5463:1: (lv_rightExpression_3_0= ruleMultiplicationExpression )
            	    // InternalDependencyModelLanguage.g:5464:3: lv_rightExpression_3_0= ruleMultiplicationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightExpressionMultiplicationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_70);
            	    lv_rightExpression_3_0=ruleMultiplicationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpression",
            	              		lv_rightExpression_3_0, 
            	              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.MultiplicationExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // InternalDependencyModelLanguage.g:5488:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // InternalDependencyModelLanguage.g:5489:2: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // InternalDependencyModelLanguage.g:5490:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // InternalDependencyModelLanguage.g:5497:1: ruleMultiplicationExpression returns [EObject current=null] : (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_TypeCastExpression_1= ruleTypeCastExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) ) )* ) ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryPreExpression_0 = null;

        EObject this_TypeCastExpression_1 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_rightExpression_4_1 = null;

        EObject lv_rightExpression_4_2 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:5500:28: ( (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_TypeCastExpression_1= ruleTypeCastExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) ) )* ) ) )
            // InternalDependencyModelLanguage.g:5501:1: (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_TypeCastExpression_1= ruleTypeCastExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) ) )* ) )
            {
            // InternalDependencyModelLanguage.g:5501:1: (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_TypeCastExpression_1= ruleTypeCastExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) ) )* ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==53||LA73_0==100) ) {
                alt73=1;
            }
            else if ( ((LA73_0>=RULE_ID && LA73_0<=RULE_MAXKEYWORD)||LA73_0==43||LA73_0==54||(LA73_0>=101 && LA73_0<=105)) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalDependencyModelLanguage.g:5502:2: this_UnaryPreExpression_0= ruleUnaryPreExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getUnaryPreExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_UnaryPreExpression_0=ruleUnaryPreExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnaryPreExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:5514:6: (this_TypeCastExpression_1= ruleTypeCastExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) ) )* )
                    {
                    // InternalDependencyModelLanguage.g:5514:6: (this_TypeCastExpression_1= ruleTypeCastExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) ) )* )
                    // InternalDependencyModelLanguage.g:5515:2: this_TypeCastExpression_1= ruleTypeCastExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getTypeCastExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_71);
                    this_TypeCastExpression_1=ruleTypeCastExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeCastExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalDependencyModelLanguage.g:5526:1: ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( ((LA72_0>=97 && LA72_0<=99)) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalDependencyModelLanguage.g:5526:2: () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) )
                    	    {
                    	    // InternalDependencyModelLanguage.g:5526:2: ()
                    	    // InternalDependencyModelLanguage.g:5527:2: 
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    // InternalDependencyModelLanguage.g:5535:2: ( (lv_operator_3_0= ruleMultiplicationOperator ) )
                    	    // InternalDependencyModelLanguage.g:5536:1: (lv_operator_3_0= ruleMultiplicationOperator )
                    	    {
                    	    // InternalDependencyModelLanguage.g:5536:1: (lv_operator_3_0= ruleMultiplicationOperator )
                    	    // InternalDependencyModelLanguage.g:5537:3: lv_operator_3_0= ruleMultiplicationOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_11);
                    	    lv_operator_3_0=ruleMultiplicationOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"operator",
                    	              		lv_operator_3_0, 
                    	              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.MultiplicationOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalDependencyModelLanguage.g:5553:2: ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) )
                    	    // InternalDependencyModelLanguage.g:5554:1: ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) )
                    	    {
                    	    // InternalDependencyModelLanguage.g:5554:1: ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) )
                    	    // InternalDependencyModelLanguage.g:5555:1: (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression )
                    	    {
                    	    // InternalDependencyModelLanguage.g:5555:1: (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression )
                    	    int alt71=2;
                    	    int LA71_0 = input.LA(1);

                    	    if ( (LA71_0==53||LA71_0==100) ) {
                    	        alt71=1;
                    	    }
                    	    else if ( ((LA71_0>=RULE_ID && LA71_0<=RULE_MAXKEYWORD)||LA71_0==43||LA71_0==54||(LA71_0>=101 && LA71_0<=105)) ) {
                    	        alt71=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 71, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt71) {
                    	        case 1 :
                    	            // InternalDependencyModelLanguage.g:5556:3: lv_rightExpression_4_1= ruleUnaryPreExpression
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionUnaryPreExpressionParserRuleCall_1_1_2_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_71);
                    	            lv_rightExpression_4_1=ruleUnaryPreExpression();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                    	              	        }
                    	                     		set(
                    	                     			current, 
                    	                     			"rightExpression",
                    	                      		lv_rightExpression_4_1, 
                    	                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.UnaryPreExpression");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalDependencyModelLanguage.g:5571:8: lv_rightExpression_4_2= ruleTypeCastExpression
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionTypeCastExpressionParserRuleCall_1_1_2_0_1()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_71);
                    	            lv_rightExpression_4_2=ruleTypeCastExpression();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                    	              	        }
                    	                     		set(
                    	                     			current, 
                    	                     			"rightExpression",
                    	                      		lv_rightExpression_4_2, 
                    	                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.TypeCastExpression");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleUnaryPreExpression"
    // InternalDependencyModelLanguage.g:5597:1: entryRuleUnaryPreExpression returns [EObject current=null] : iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF ;
    public final EObject entryRuleUnaryPreExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryPreExpression = null;


        try {
            // InternalDependencyModelLanguage.g:5598:2: (iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF )
            // InternalDependencyModelLanguage.g:5599:2: iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryPreExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnaryPreExpression=ruleUnaryPreExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryPreExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryPreExpression"


    // $ANTLR start "ruleUnaryPreExpression"
    // InternalDependencyModelLanguage.g:5606:1: ruleUnaryPreExpression returns [EObject current=null] : ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleTypeCastExpression ) ) ) ;
    public final EObject ruleUnaryPreExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_enclosedExpression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:5609:28: ( ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleTypeCastExpression ) ) ) )
            // InternalDependencyModelLanguage.g:5610:1: ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleTypeCastExpression ) ) )
            {
            // InternalDependencyModelLanguage.g:5610:1: ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleTypeCastExpression ) ) )
            // InternalDependencyModelLanguage.g:5610:2: () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleTypeCastExpression ) )
            {
            // InternalDependencyModelLanguage.g:5610:2: ()
            // InternalDependencyModelLanguage.g:5611:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnaryPreExpressionAccess().getUnaryExpressionAction_0(),
                          current);
                  
            }

            }

            // InternalDependencyModelLanguage.g:5619:2: ( (lv_operator_1_0= ruleUnaryPreOperator ) )
            // InternalDependencyModelLanguage.g:5620:1: (lv_operator_1_0= ruleUnaryPreOperator )
            {
            // InternalDependencyModelLanguage.g:5620:1: (lv_operator_1_0= ruleUnaryPreOperator )
            // InternalDependencyModelLanguage.g:5621:3: lv_operator_1_0= ruleUnaryPreOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnaryPreExpressionAccess().getOperatorUnaryPreOperatorEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_11);
            lv_operator_1_0=ruleUnaryPreOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnaryPreExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_1_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.UnaryPreOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:5637:2: ( (lv_enclosedExpression_2_0= ruleTypeCastExpression ) )
            // InternalDependencyModelLanguage.g:5638:1: (lv_enclosedExpression_2_0= ruleTypeCastExpression )
            {
            // InternalDependencyModelLanguage.g:5638:1: (lv_enclosedExpression_2_0= ruleTypeCastExpression )
            // InternalDependencyModelLanguage.g:5639:3: lv_enclosedExpression_2_0= ruleTypeCastExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionTypeCastExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_enclosedExpression_2_0=ruleTypeCastExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnaryPreExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"enclosedExpression",
                      		lv_enclosedExpression_2_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.TypeCastExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryPreExpression"


    // $ANTLR start "entryRuleTypeCastExpression"
    // InternalDependencyModelLanguage.g:5663:1: entryRuleTypeCastExpression returns [EObject current=null] : iv_ruleTypeCastExpression= ruleTypeCastExpression EOF ;
    public final EObject entryRuleTypeCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeCastExpression = null;


        try {
            // InternalDependencyModelLanguage.g:5664:2: (iv_ruleTypeCastExpression= ruleTypeCastExpression EOF )
            // InternalDependencyModelLanguage.g:5665:2: iv_ruleTypeCastExpression= ruleTypeCastExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeCastExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeCastExpression=ruleTypeCastExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeCastExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeCastExpression"


    // $ANTLR start "ruleTypeCastExpression"
    // InternalDependencyModelLanguage.g:5672:1: ruleTypeCastExpression returns [EObject current=null] : (this_Operand_0= ruleOperand | ( () otherlv_2= '(' ( ( ruleDATATYPE ) ) otherlv_4= ')' ( (lv_enclosedExpression_5_0= ruleOperand ) ) ) ) ;
    public final EObject ruleTypeCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Operand_0 = null;

        EObject lv_enclosedExpression_5_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:5675:28: ( (this_Operand_0= ruleOperand | ( () otherlv_2= '(' ( ( ruleDATATYPE ) ) otherlv_4= ')' ( (lv_enclosedExpression_5_0= ruleOperand ) ) ) ) )
            // InternalDependencyModelLanguage.g:5676:1: (this_Operand_0= ruleOperand | ( () otherlv_2= '(' ( ( ruleDATATYPE ) ) otherlv_4= ')' ( (lv_enclosedExpression_5_0= ruleOperand ) ) ) )
            {
            // InternalDependencyModelLanguage.g:5676:1: (this_Operand_0= ruleOperand | ( () otherlv_2= '(' ( ( ruleDATATYPE ) ) otherlv_4= ')' ( (lv_enclosedExpression_5_0= ruleOperand ) ) ) )
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // InternalDependencyModelLanguage.g:5677:2: this_Operand_0= ruleOperand
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeCastExpressionAccess().getOperandParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Operand_0=ruleOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Operand_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:5689:6: ( () otherlv_2= '(' ( ( ruleDATATYPE ) ) otherlv_4= ')' ( (lv_enclosedExpression_5_0= ruleOperand ) ) )
                    {
                    // InternalDependencyModelLanguage.g:5689:6: ( () otherlv_2= '(' ( ( ruleDATATYPE ) ) otherlv_4= ')' ( (lv_enclosedExpression_5_0= ruleOperand ) ) )
                    // InternalDependencyModelLanguage.g:5689:7: () otherlv_2= '(' ( ( ruleDATATYPE ) ) otherlv_4= ')' ( (lv_enclosedExpression_5_0= ruleOperand ) )
                    {
                    // InternalDependencyModelLanguage.g:5689:7: ()
                    // InternalDependencyModelLanguage.g:5690:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeCastExpressionAccess().getTypeCastExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTypeCastExpressionAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // InternalDependencyModelLanguage.g:5702:1: ( ( ruleDATATYPE ) )
                    // InternalDependencyModelLanguage.g:5703:1: ( ruleDATATYPE )
                    {
                    // InternalDependencyModelLanguage.g:5703:1: ( ruleDATATYPE )
                    // InternalDependencyModelLanguage.g:5704:3: ruleDATATYPE
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeCastExpressionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeCastExpressionAccess().getDataTypeDataTypeCrossReference_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    ruleDATATYPE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,44,FollowSets000.FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTypeCastExpressionAccess().getRightParenthesisKeyword_1_3());
                          
                    }
                    // InternalDependencyModelLanguage.g:5724:1: ( (lv_enclosedExpression_5_0= ruleOperand ) )
                    // InternalDependencyModelLanguage.g:5725:1: (lv_enclosedExpression_5_0= ruleOperand )
                    {
                    // InternalDependencyModelLanguage.g:5725:1: (lv_enclosedExpression_5_0= ruleOperand )
                    // InternalDependencyModelLanguage.g:5726:3: lv_enclosedExpression_5_0= ruleOperand
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeCastExpressionAccess().getEnclosedExpressionOperandParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_enclosedExpression_5_0=ruleOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeCastExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"enclosedExpression",
                              		lv_enclosedExpression_5_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Operand");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeCastExpression"


    // $ANTLR start "entryRuleOperand"
    // InternalDependencyModelLanguage.g:5750:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // InternalDependencyModelLanguage.g:5751:2: (iv_ruleOperand= ruleOperand EOF )
            // InternalDependencyModelLanguage.g:5752:2: iv_ruleOperand= ruleOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOperand=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperand; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalDependencyModelLanguage.g:5759:1: ruleOperand returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_TimeValueExpression_4= ruleTimeValueExpression | this_ExtendedTypedNamedElementExpression_5= ruleExtendedTypedNamedElementExpression | this_MaxMessageDelayReferenceExpression_6= ruleMaxMessageDelayReferenceExpression | this_OperationCall_7= ruleOperationCall | this_TriggerMessageExpression_8= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_9= ruleNoAttributeSelectorExpression ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_LiteralExpression_3 = null;

        EObject this_TimeValueExpression_4 = null;

        EObject this_ExtendedTypedNamedElementExpression_5 = null;

        EObject this_MaxMessageDelayReferenceExpression_6 = null;

        EObject this_OperationCall_7 = null;

        EObject this_TriggerMessageExpression_8 = null;

        EObject this_NoAttributeSelectorExpression_9 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:5762:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_TimeValueExpression_4= ruleTimeValueExpression | this_ExtendedTypedNamedElementExpression_5= ruleExtendedTypedNamedElementExpression | this_MaxMessageDelayReferenceExpression_6= ruleMaxMessageDelayReferenceExpression | this_OperationCall_7= ruleOperationCall | this_TriggerMessageExpression_8= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_9= ruleNoAttributeSelectorExpression ) )
            // InternalDependencyModelLanguage.g:5763:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_TimeValueExpression_4= ruleTimeValueExpression | this_ExtendedTypedNamedElementExpression_5= ruleExtendedTypedNamedElementExpression | this_MaxMessageDelayReferenceExpression_6= ruleMaxMessageDelayReferenceExpression | this_OperationCall_7= ruleOperationCall | this_TriggerMessageExpression_8= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_9= ruleNoAttributeSelectorExpression )
            {
            // InternalDependencyModelLanguage.g:5763:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_TimeValueExpression_4= ruleTimeValueExpression | this_ExtendedTypedNamedElementExpression_5= ruleExtendedTypedNamedElementExpression | this_MaxMessageDelayReferenceExpression_6= ruleMaxMessageDelayReferenceExpression | this_OperationCall_7= ruleOperationCall | this_TriggerMessageExpression_8= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_9= ruleNoAttributeSelectorExpression )
            int alt75=8;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // InternalDependencyModelLanguage.g:5763:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalDependencyModelLanguage.g:5763:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalDependencyModelLanguage.g:5763:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getOperandAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperandAccess().getExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getOperandAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:5785:2: this_LiteralExpression_3= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperandAccess().getLiteralExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LiteralExpression_3=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:5798:2: this_TimeValueExpression_4= ruleTimeValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperandAccess().getTimeValueExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TimeValueExpression_4=ruleTimeValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TimeValueExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalDependencyModelLanguage.g:5811:2: this_ExtendedTypedNamedElementExpression_5= ruleExtendedTypedNamedElementExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperandAccess().getExtendedTypedNamedElementExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExtendedTypedNamedElementExpression_5=ruleExtendedTypedNamedElementExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExtendedTypedNamedElementExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalDependencyModelLanguage.g:5824:2: this_MaxMessageDelayReferenceExpression_6= ruleMaxMessageDelayReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperandAccess().getMaxMessageDelayReferenceExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MaxMessageDelayReferenceExpression_6=ruleMaxMessageDelayReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MaxMessageDelayReferenceExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalDependencyModelLanguage.g:5837:2: this_OperationCall_7= ruleOperationCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperandAccess().getOperationCallParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_OperationCall_7=ruleOperationCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OperationCall_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalDependencyModelLanguage.g:5850:2: this_TriggerMessageExpression_8= ruleTriggerMessageExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperandAccess().getTriggerMessageExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TriggerMessageExpression_8=ruleTriggerMessageExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TriggerMessageExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalDependencyModelLanguage.g:5863:2: this_NoAttributeSelectorExpression_9= ruleNoAttributeSelectorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperandAccess().getNoAttributeSelectorExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NoAttributeSelectorExpression_9=ruleNoAttributeSelectorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NoAttributeSelectorExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalDependencyModelLanguage.g:5882:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalDependencyModelLanguage.g:5883:2: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalDependencyModelLanguage.g:5884:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalDependencyModelLanguage.g:5891:1: ruleLiteralExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:5894:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // InternalDependencyModelLanguage.g:5895:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // InternalDependencyModelLanguage.g:5895:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // InternalDependencyModelLanguage.g:5895:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // InternalDependencyModelLanguage.g:5895:2: ()
            // InternalDependencyModelLanguage.g:5896:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_0(),
                          current);
                  
            }

            }

            // InternalDependencyModelLanguage.g:5904:2: ( (lv_value_1_0= ruleLiteral ) )
            // InternalDependencyModelLanguage.g:5905:1: (lv_value_1_0= ruleLiteral )
            {
            // InternalDependencyModelLanguage.g:5905:1: (lv_value_1_0= ruleLiteral )
            // InternalDependencyModelLanguage.g:5906:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiteralExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLiteralExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguage.Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleTimeValueExpression"
    // InternalDependencyModelLanguage.g:5930:1: entryRuleTimeValueExpression returns [EObject current=null] : iv_ruleTimeValueExpression= ruleTimeValueExpression EOF ;
    public final EObject entryRuleTimeValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeValueExpression = null;


        try {
            // InternalDependencyModelLanguage.g:5931:2: (iv_ruleTimeValueExpression= ruleTimeValueExpression EOF )
            // InternalDependencyModelLanguage.g:5932:2: iv_ruleTimeValueExpression= ruleTimeValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeValueExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTimeValueExpression=ruleTimeValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeValueExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeValueExpression"


    // $ANTLR start "ruleTimeValueExpression"
    // InternalDependencyModelLanguage.g:5939:1: ruleTimeValueExpression returns [EObject current=null] : ( (lv_timeValue_0_0= ruleTimeValue ) ) ;
    public final EObject ruleTimeValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_timeValue_0_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:5942:28: ( ( (lv_timeValue_0_0= ruleTimeValue ) ) )
            // InternalDependencyModelLanguage.g:5943:1: ( (lv_timeValue_0_0= ruleTimeValue ) )
            {
            // InternalDependencyModelLanguage.g:5943:1: ( (lv_timeValue_0_0= ruleTimeValue ) )
            // InternalDependencyModelLanguage.g:5944:1: (lv_timeValue_0_0= ruleTimeValue )
            {
            // InternalDependencyModelLanguage.g:5944:1: (lv_timeValue_0_0= ruleTimeValue )
            // InternalDependencyModelLanguage.g:5945:3: lv_timeValue_0_0= ruleTimeValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeValueExpressionAccess().getTimeValueTimeValueParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_timeValue_0_0=ruleTimeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeValueExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"timeValue",
                      		lv_timeValue_0_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.TimeValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeValueExpression"


    // $ANTLR start "entryRuleTimeValue"
    // InternalDependencyModelLanguage.g:5969:1: entryRuleTimeValue returns [EObject current=null] : iv_ruleTimeValue= ruleTimeValue EOF ;
    public final EObject entryRuleTimeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeValue = null;


        try {
            // InternalDependencyModelLanguage.g:5970:2: (iv_ruleTimeValue= ruleTimeValue EOF )
            // InternalDependencyModelLanguage.g:5971:2: iv_ruleTimeValue= ruleTimeValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTimeValue=ruleTimeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeValue"


    // $ANTLR start "ruleTimeValue"
    // InternalDependencyModelLanguage.g:5978:1: ruleTimeValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleLiteralExpression ) ) ( (lv_unit_1_0= ruleTimeUnitExpr ) ) ) ;
    public final EObject ruleTimeValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        AntlrDatatypeRuleToken lv_unit_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:5981:28: ( ( ( (lv_value_0_0= ruleLiteralExpression ) ) ( (lv_unit_1_0= ruleTimeUnitExpr ) ) ) )
            // InternalDependencyModelLanguage.g:5982:1: ( ( (lv_value_0_0= ruleLiteralExpression ) ) ( (lv_unit_1_0= ruleTimeUnitExpr ) ) )
            {
            // InternalDependencyModelLanguage.g:5982:1: ( ( (lv_value_0_0= ruleLiteralExpression ) ) ( (lv_unit_1_0= ruleTimeUnitExpr ) ) )
            // InternalDependencyModelLanguage.g:5982:2: ( (lv_value_0_0= ruleLiteralExpression ) ) ( (lv_unit_1_0= ruleTimeUnitExpr ) )
            {
            // InternalDependencyModelLanguage.g:5982:2: ( (lv_value_0_0= ruleLiteralExpression ) )
            // InternalDependencyModelLanguage.g:5983:1: (lv_value_0_0= ruleLiteralExpression )
            {
            // InternalDependencyModelLanguage.g:5983:1: (lv_value_0_0= ruleLiteralExpression )
            // InternalDependencyModelLanguage.g:5984:3: lv_value_0_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeValueAccess().getValueLiteralExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_73);
            lv_value_0_0=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeValueRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.LiteralExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:6000:2: ( (lv_unit_1_0= ruleTimeUnitExpr ) )
            // InternalDependencyModelLanguage.g:6001:1: (lv_unit_1_0= ruleTimeUnitExpr )
            {
            // InternalDependencyModelLanguage.g:6001:1: (lv_unit_1_0= ruleTimeUnitExpr )
            // InternalDependencyModelLanguage.g:6002:3: lv_unit_1_0= ruleTimeUnitExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeValueAccess().getUnitTimeUnitExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_unit_1_0=ruleTimeUnitExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeValueRule());
              	        }
                     		set(
                     			current, 
                     			"unit",
                      		lv_unit_1_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.TimeUnitExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeValue"


    // $ANTLR start "entryRuleTimeUnitExpr"
    // InternalDependencyModelLanguage.g:6026:1: entryRuleTimeUnitExpr returns [String current=null] : iv_ruleTimeUnitExpr= ruleTimeUnitExpr EOF ;
    public final String entryRuleTimeUnitExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeUnitExpr = null;


        try {
            // InternalDependencyModelLanguage.g:6027:2: (iv_ruleTimeUnitExpr= ruleTimeUnitExpr EOF )
            // InternalDependencyModelLanguage.g:6028:2: iv_ruleTimeUnitExpr= ruleTimeUnitExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeUnitExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTimeUnitExpr=ruleTimeUnitExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeUnitExpr.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeUnitExpr"


    // $ANTLR start "ruleTimeUnitExpr"
    // InternalDependencyModelLanguage.g:6035:1: ruleTimeUnitExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'DAYS' | kw= 'HOURS' | kw= 'MILLISECONDS' | kw= 'MINUTES' | kw= 'SECONDS' | kw= 'MICROSECONDS' | kw= 'NANOSECONDS' ) ;
    public final AntlrDatatypeRuleToken ruleTimeUnitExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:6038:28: ( (kw= 'DAYS' | kw= 'HOURS' | kw= 'MILLISECONDS' | kw= 'MINUTES' | kw= 'SECONDS' | kw= 'MICROSECONDS' | kw= 'NANOSECONDS' ) )
            // InternalDependencyModelLanguage.g:6039:1: (kw= 'DAYS' | kw= 'HOURS' | kw= 'MILLISECONDS' | kw= 'MINUTES' | kw= 'SECONDS' | kw= 'MICROSECONDS' | kw= 'NANOSECONDS' )
            {
            // InternalDependencyModelLanguage.g:6039:1: (kw= 'DAYS' | kw= 'HOURS' | kw= 'MILLISECONDS' | kw= 'MINUTES' | kw= 'SECONDS' | kw= 'MICROSECONDS' | kw= 'NANOSECONDS' )
            int alt76=7;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt76=1;
                }
                break;
            case 67:
                {
                alt76=2;
                }
                break;
            case 68:
                {
                alt76=3;
                }
                break;
            case 69:
                {
                alt76=4;
                }
                break;
            case 70:
                {
                alt76=5;
                }
                break;
            case 71:
                {
                alt76=6;
                }
                break;
            case 72:
                {
                alt76=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6040:2: kw= 'DAYS'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getDAYSKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:6047:2: kw= 'HOURS'
                    {
                    kw=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getHOURSKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:6054:2: kw= 'MILLISECONDS'
                    {
                    kw=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getMILLISECONDSKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalDependencyModelLanguage.g:6061:2: kw= 'MINUTES'
                    {
                    kw=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getMINUTESKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalDependencyModelLanguage.g:6068:2: kw= 'SECONDS'
                    {
                    kw=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getSECONDSKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalDependencyModelLanguage.g:6075:2: kw= 'MICROSECONDS'
                    {
                    kw=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getMICROSECONDSKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalDependencyModelLanguage.g:6082:2: kw= 'NANOSECONDS'
                    {
                    kw=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getNANOSECONDSKeyword_6()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeUnitExpr"


    // $ANTLR start "entryRuleMaxMessageDelayReferenceExpression"
    // InternalDependencyModelLanguage.g:6095:1: entryRuleMaxMessageDelayReferenceExpression returns [EObject current=null] : iv_ruleMaxMessageDelayReferenceExpression= ruleMaxMessageDelayReferenceExpression EOF ;
    public final EObject entryRuleMaxMessageDelayReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxMessageDelayReferenceExpression = null;


        try {
            // InternalDependencyModelLanguage.g:6096:2: (iv_ruleMaxMessageDelayReferenceExpression= ruleMaxMessageDelayReferenceExpression EOF )
            // InternalDependencyModelLanguage.g:6097:2: iv_ruleMaxMessageDelayReferenceExpression= ruleMaxMessageDelayReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxMessageDelayReferenceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMaxMessageDelayReferenceExpression=ruleMaxMessageDelayReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxMessageDelayReferenceExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxMessageDelayReferenceExpression"


    // $ANTLR start "ruleMaxMessageDelayReferenceExpression"
    // InternalDependencyModelLanguage.g:6104:1: ruleMaxMessageDelayReferenceExpression returns [EObject current=null] : ( (otherlv_0= RULE_MAXKEYWORD ) ) ;
    public final EObject ruleMaxMessageDelayReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:6107:28: ( ( (otherlv_0= RULE_MAXKEYWORD ) ) )
            // InternalDependencyModelLanguage.g:6108:1: ( (otherlv_0= RULE_MAXKEYWORD ) )
            {
            // InternalDependencyModelLanguage.g:6108:1: ( (otherlv_0= RULE_MAXKEYWORD ) )
            // InternalDependencyModelLanguage.g:6109:1: (otherlv_0= RULE_MAXKEYWORD )
            {
            // InternalDependencyModelLanguage.g:6109:1: (otherlv_0= RULE_MAXKEYWORD )
            // InternalDependencyModelLanguage.g:6110:3: otherlv_0= RULE_MAXKEYWORD
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMaxMessageDelayReferenceExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_MAXKEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getMaxMessageDelayReferenceExpressionAccess().getTimeValueTimeValueCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxMessageDelayReferenceExpression"


    // $ANTLR start "entryRuleExtendedTypedNamedElementExpression"
    // InternalDependencyModelLanguage.g:6132:1: entryRuleExtendedTypedNamedElementExpression returns [EObject current=null] : iv_ruleExtendedTypedNamedElementExpression= ruleExtendedTypedNamedElementExpression EOF ;
    public final EObject entryRuleExtendedTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedTypedNamedElementExpression = null;


        try {
            // InternalDependencyModelLanguage.g:6133:2: (iv_ruleExtendedTypedNamedElementExpression= ruleExtendedTypedNamedElementExpression EOF )
            // InternalDependencyModelLanguage.g:6134:2: iv_ruleExtendedTypedNamedElementExpression= ruleExtendedTypedNamedElementExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExtendedTypedNamedElementExpression=ruleExtendedTypedNamedElementExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedTypedNamedElementExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedTypedNamedElementExpression"


    // $ANTLR start "ruleExtendedTypedNamedElementExpression"
    // InternalDependencyModelLanguage.g:6141:1: ruleExtendedTypedNamedElementExpression returns [EObject current=null] : (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )? ) ;
    public final EObject ruleExtendedTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TypedNamedElementExpression_0 = null;

        EObject lv_position_3_0 = null;

        Enumerator lv_incrementDecrementOperator_5_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:6144:28: ( (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )? ) )
            // InternalDependencyModelLanguage.g:6145:1: (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )? )
            {
            // InternalDependencyModelLanguage.g:6145:1: (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )? )
            // InternalDependencyModelLanguage.g:6146:2: this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getTypedNamedElementExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_74);
            this_TypedNamedElementExpression_0=ruleTypedNamedElementExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TypedNamedElementExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalDependencyModelLanguage.g:6157:1: ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )?
            int alt77=3;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==73) ) {
                alt77=1;
            }
            else if ( ((LA77_0>=90 && LA77_0<=91)) ) {
                alt77=2;
            }
            switch (alt77) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6157:2: ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) )
                    {
                    // InternalDependencyModelLanguage.g:6157:2: ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) )
                    // InternalDependencyModelLanguage.g:6157:3: () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) )
                    {
                    // InternalDependencyModelLanguage.g:6157:3: ()
                    // InternalDependencyModelLanguage.g:6158:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getExtendedTypedNamedElementExpressionAccess().getDiscreteInteractionEndpointReferenceTypedNamedElementExpressionAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,73,FollowSets000.FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExtendedTypedNamedElementExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0_1());
                          
                    }
                    // InternalDependencyModelLanguage.g:6170:1: ( (lv_position_3_0= rulePositionSelectorExpression ) )
                    // InternalDependencyModelLanguage.g:6171:1: (lv_position_3_0= rulePositionSelectorExpression )
                    {
                    // InternalDependencyModelLanguage.g:6171:1: (lv_position_3_0= rulePositionSelectorExpression )
                    // InternalDependencyModelLanguage.g:6172:3: lv_position_3_0= rulePositionSelectorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_position_3_0=rulePositionSelectorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExtendedTypedNamedElementExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"position",
                              		lv_position_3_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.PositionSelectorExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:6189:6: ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) )
                    {
                    // InternalDependencyModelLanguage.g:6189:6: ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) )
                    // InternalDependencyModelLanguage.g:6189:7: () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) )
                    {
                    // InternalDependencyModelLanguage.g:6189:7: ()
                    // InternalDependencyModelLanguage.g:6190:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getExtendedTypedNamedElementExpressionAccess().getAssignmentLhs_typedNamedElementExpressionAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalDependencyModelLanguage.g:6198:2: ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) )
                    // InternalDependencyModelLanguage.g:6199:1: (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression )
                    {
                    // InternalDependencyModelLanguage.g:6199:1: (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression )
                    // InternalDependencyModelLanguage.g:6200:3: lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getIncrementDecrementOperatorIncrementDecrementOperatorExpressionEnumRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_incrementDecrementOperator_5_0=ruleIncrementDecrementOperatorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExtendedTypedNamedElementExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"incrementDecrementOperator",
                              		lv_incrementDecrementOperator_5_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.IncrementDecrementOperatorExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtendedTypedNamedElementExpression"


    // $ANTLR start "entryRuleArrayIndexExpression"
    // InternalDependencyModelLanguage.g:6224:1: entryRuleArrayIndexExpression returns [EObject current=null] : iv_ruleArrayIndexExpression= ruleArrayIndexExpression EOF ;
    public final EObject entryRuleArrayIndexExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayIndexExpression = null;


        try {
            // InternalDependencyModelLanguage.g:6225:2: (iv_ruleArrayIndexExpression= ruleArrayIndexExpression EOF )
            // InternalDependencyModelLanguage.g:6226:2: iv_ruleArrayIndexExpression= ruleArrayIndexExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayIndexExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArrayIndexExpression=ruleArrayIndexExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayIndexExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayIndexExpression"


    // $ANTLR start "ruleArrayIndexExpression"
    // InternalDependencyModelLanguage.g:6233:1: ruleArrayIndexExpression returns [EObject current=null] : (otherlv_0= '[' ( (lv_index_1_0= ruleArithmeticExpression ) ) otherlv_2= ']' ) ;
    public final EObject ruleArrayIndexExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_index_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:6236:28: ( (otherlv_0= '[' ( (lv_index_1_0= ruleArithmeticExpression ) ) otherlv_2= ']' ) )
            // InternalDependencyModelLanguage.g:6237:1: (otherlv_0= '[' ( (lv_index_1_0= ruleArithmeticExpression ) ) otherlv_2= ']' )
            {
            // InternalDependencyModelLanguage.g:6237:1: (otherlv_0= '[' ( (lv_index_1_0= ruleArithmeticExpression ) ) otherlv_2= ']' )
            // InternalDependencyModelLanguage.g:6237:3: otherlv_0= '[' ( (lv_index_1_0= ruleArithmeticExpression ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayIndexExpressionAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // InternalDependencyModelLanguage.g:6241:1: ( (lv_index_1_0= ruleArithmeticExpression ) )
            // InternalDependencyModelLanguage.g:6242:1: (lv_index_1_0= ruleArithmeticExpression )
            {
            // InternalDependencyModelLanguage.g:6242:1: (lv_index_1_0= ruleArithmeticExpression )
            // InternalDependencyModelLanguage.g:6243:3: lv_index_1_0= ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayIndexExpressionAccess().getIndexArithmeticExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_index_1_0=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayIndexExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"index",
                      		lv_index_1_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.ArithmeticExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getArrayIndexExpressionAccess().getRightSquareBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayIndexExpression"


    // $ANTLR start "entryRuleAttributeAccessorExpression"
    // InternalDependencyModelLanguage.g:6271:1: entryRuleAttributeAccessorExpression returns [EObject current=null] : iv_ruleAttributeAccessorExpression= ruleAttributeAccessorExpression EOF ;
    public final EObject entryRuleAttributeAccessorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeAccessorExpression = null;


        try {
            // InternalDependencyModelLanguage.g:6272:2: (iv_ruleAttributeAccessorExpression= ruleAttributeAccessorExpression EOF )
            // InternalDependencyModelLanguage.g:6273:2: iv_ruleAttributeAccessorExpression= ruleAttributeAccessorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeAccessorExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeAccessorExpression=ruleAttributeAccessorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeAccessorExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeAccessorExpression"


    // $ANTLR start "ruleAttributeAccessorExpression"
    // InternalDependencyModelLanguage.g:6280:1: ruleAttributeAccessorExpression returns [EObject current=null] : (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAttributeAccessorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:6283:28: ( (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDependencyModelLanguage.g:6284:1: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDependencyModelLanguage.g:6284:1: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) )
            // InternalDependencyModelLanguage.g:6284:3: otherlv_0= '.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAttributeAccessorExpressionAccess().getFullStopKeyword_0());
                  
            }
            // InternalDependencyModelLanguage.g:6288:1: ( (otherlv_1= RULE_ID ) )
            // InternalDependencyModelLanguage.g:6289:1: (otherlv_1= RULE_ID )
            {
            // InternalDependencyModelLanguage.g:6289:1: (otherlv_1= RULE_ID )
            // InternalDependencyModelLanguage.g:6290:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeAccessorExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAttributeCrossReference_1_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeAccessorExpression"


    // $ANTLR start "entryRuleNoAttributeSelectorExpression"
    // InternalDependencyModelLanguage.g:6312:1: entryRuleNoAttributeSelectorExpression returns [EObject current=null] : iv_ruleNoAttributeSelectorExpression= ruleNoAttributeSelectorExpression EOF ;
    public final EObject entryRuleNoAttributeSelectorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoAttributeSelectorExpression = null;


        try {
            // InternalDependencyModelLanguage.g:6313:2: (iv_ruleNoAttributeSelectorExpression= ruleNoAttributeSelectorExpression EOF )
            // InternalDependencyModelLanguage.g:6314:2: iv_ruleNoAttributeSelectorExpression= ruleNoAttributeSelectorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNoAttributeSelectorExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNoAttributeSelectorExpression=ruleNoAttributeSelectorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNoAttributeSelectorExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoAttributeSelectorExpression"


    // $ANTLR start "ruleNoAttributeSelectorExpression"
    // InternalDependencyModelLanguage.g:6321:1: ruleNoAttributeSelectorExpression returns [EObject current=null] : ( (lv_position_0_0= rulePositionSelectorExpression ) ) ;
    public final EObject ruleNoAttributeSelectorExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_position_0_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:6324:28: ( ( (lv_position_0_0= rulePositionSelectorExpression ) ) )
            // InternalDependencyModelLanguage.g:6325:1: ( (lv_position_0_0= rulePositionSelectorExpression ) )
            {
            // InternalDependencyModelLanguage.g:6325:1: ( (lv_position_0_0= rulePositionSelectorExpression ) )
            // InternalDependencyModelLanguage.g:6326:1: (lv_position_0_0= rulePositionSelectorExpression )
            {
            // InternalDependencyModelLanguage.g:6326:1: (lv_position_0_0= rulePositionSelectorExpression )
            // InternalDependencyModelLanguage.g:6327:3: lv_position_0_0= rulePositionSelectorExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNoAttributeSelectorExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_position_0_0=rulePositionSelectorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNoAttributeSelectorExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"position",
                      		lv_position_0_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.PositionSelectorExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoAttributeSelectorExpression"


    // $ANTLR start "entryRulePositionSelectorExpression"
    // InternalDependencyModelLanguage.g:6351:1: entryRulePositionSelectorExpression returns [EObject current=null] : iv_rulePositionSelectorExpression= rulePositionSelectorExpression EOF ;
    public final EObject entryRulePositionSelectorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionSelectorExpression = null;


        try {
            // InternalDependencyModelLanguage.g:6352:2: (iv_rulePositionSelectorExpression= rulePositionSelectorExpression EOF )
            // InternalDependencyModelLanguage.g:6353:2: iv_rulePositionSelectorExpression= rulePositionSelectorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPositionSelectorExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePositionSelectorExpression=rulePositionSelectorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePositionSelectorExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePositionSelectorExpression"


    // $ANTLR start "rulePositionSelectorExpression"
    // InternalDependencyModelLanguage.g:6360:1: rulePositionSelectorExpression returns [EObject current=null] : ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? ) ;
    public final EObject rulePositionSelectorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_kind_0_0 = null;

        EObject lv_successor_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:6363:28: ( ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? ) )
            // InternalDependencyModelLanguage.g:6364:1: ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? )
            {
            // InternalDependencyModelLanguage.g:6364:1: ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? )
            // InternalDependencyModelLanguage.g:6364:2: ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )?
            {
            // InternalDependencyModelLanguage.g:6364:2: ( (lv_kind_0_0= rulePositionSelectorKind ) )
            // InternalDependencyModelLanguage.g:6365:1: (lv_kind_0_0= rulePositionSelectorKind )
            {
            // InternalDependencyModelLanguage.g:6365:1: (lv_kind_0_0= rulePositionSelectorKind )
            // InternalDependencyModelLanguage.g:6366:3: lv_kind_0_0= rulePositionSelectorKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPositionSelectorExpressionAccess().getKindPositionSelectorKindEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_75);
            lv_kind_0_0=rulePositionSelectorKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPositionSelectorExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"kind",
                      		lv_kind_0_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.PositionSelectorKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalDependencyModelLanguage.g:6382:2: (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==73) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6382:4: otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) )
                    {
                    otherlv_1=(Token)match(input,73,FollowSets000.FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPositionSelectorExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
                          
                    }
                    // InternalDependencyModelLanguage.g:6386:1: ( (lv_successor_2_0= rulePositionSelectorExpression ) )
                    // InternalDependencyModelLanguage.g:6387:1: (lv_successor_2_0= rulePositionSelectorExpression )
                    {
                    // InternalDependencyModelLanguage.g:6387:1: (lv_successor_2_0= rulePositionSelectorExpression )
                    // InternalDependencyModelLanguage.g:6388:3: lv_successor_2_0= rulePositionSelectorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPositionSelectorExpressionAccess().getSuccessorPositionSelectorExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_successor_2_0=rulePositionSelectorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPositionSelectorExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"successor",
                              		lv_successor_2_0, 
                              		"org.muml.pim.actionlanguage.xtext.ActionLanguage.PositionSelectorExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePositionSelectorExpression"


    // $ANTLR start "entryRuleParamaterBinding"
    // InternalDependencyModelLanguage.g:6412:1: entryRuleParamaterBinding returns [EObject current=null] : iv_ruleParamaterBinding= ruleParamaterBinding EOF ;
    public final EObject entryRuleParamaterBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamaterBinding = null;


        try {
            // InternalDependencyModelLanguage.g:6413:2: (iv_ruleParamaterBinding= ruleParamaterBinding EOF )
            // InternalDependencyModelLanguage.g:6414:2: iv_ruleParamaterBinding= ruleParamaterBinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamaterBindingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParamaterBinding=ruleParamaterBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamaterBinding; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamaterBinding"


    // $ANTLR start "ruleParamaterBinding"
    // InternalDependencyModelLanguage.g:6421:1: ruleParamaterBinding returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleParamaterBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:6424:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // InternalDependencyModelLanguage.g:6425:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // InternalDependencyModelLanguage.g:6425:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) )
            // InternalDependencyModelLanguage.g:6425:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) )
            {
            // InternalDependencyModelLanguage.g:6425:2: ()
            // InternalDependencyModelLanguage.g:6426:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParamaterBindingAccess().getParameterBindingAction_0(),
                          current);
                  
            }

            }

            // InternalDependencyModelLanguage.g:6434:2: ( (otherlv_1= RULE_ID ) )
            // InternalDependencyModelLanguage.g:6435:1: (otherlv_1= RULE_ID )
            {
            // InternalDependencyModelLanguage.g:6435:1: (otherlv_1= RULE_ID )
            // InternalDependencyModelLanguage.g:6436:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParamaterBindingRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getParamaterBindingAccess().getParameterParameterCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,62,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParamaterBindingAccess().getColonEqualsSignKeyword_2());
                  
            }
            // InternalDependencyModelLanguage.g:6454:1: ( (lv_value_3_0= ruleExpression ) )
            // InternalDependencyModelLanguage.g:6455:1: (lv_value_3_0= ruleExpression )
            {
            // InternalDependencyModelLanguage.g:6455:1: (lv_value_3_0= ruleExpression )
            // InternalDependencyModelLanguage.g:6456:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParamaterBindingAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParamaterBindingRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParamaterBinding"


    // $ANTLR start "entryRuleTriggerMessageExpression"
    // InternalDependencyModelLanguage.g:6480:1: entryRuleTriggerMessageExpression returns [EObject current=null] : iv_ruleTriggerMessageExpression= ruleTriggerMessageExpression EOF ;
    public final EObject entryRuleTriggerMessageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerMessageExpression = null;


        try {
            // InternalDependencyModelLanguage.g:6481:2: (iv_ruleTriggerMessageExpression= ruleTriggerMessageExpression EOF )
            // InternalDependencyModelLanguage.g:6482:2: iv_ruleTriggerMessageExpression= ruleTriggerMessageExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriggerMessageExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTriggerMessageExpression=ruleTriggerMessageExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTriggerMessageExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriggerMessageExpression"


    // $ANTLR start "ruleTriggerMessageExpression"
    // InternalDependencyModelLanguage.g:6489:1: ruleTriggerMessageExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTriggerMessageExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:6492:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDependencyModelLanguage.g:6493:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDependencyModelLanguage.g:6493:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            // InternalDependencyModelLanguage.g:6493:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
            {
            // InternalDependencyModelLanguage.g:6493:2: ( (otherlv_0= RULE_ID ) )
            // InternalDependencyModelLanguage.g:6494:1: (otherlv_0= RULE_ID )
            {
            // InternalDependencyModelLanguage.g:6494:1: (otherlv_0= RULE_ID )
            // InternalDependencyModelLanguage.g:6495:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTriggerMessageExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeMessageTypeCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,73,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTriggerMessageExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1());
                  
            }
            // InternalDependencyModelLanguage.g:6513:1: ( (otherlv_2= RULE_ID ) )
            // InternalDependencyModelLanguage.g:6514:1: (otherlv_2= RULE_ID )
            {
            // InternalDependencyModelLanguage.g:6514:1: (otherlv_2= RULE_ID )
            // InternalDependencyModelLanguage.g:6515:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTriggerMessageExpressionRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getTriggerMessageExpressionAccess().getParameterParameterCrossReference_2_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriggerMessageExpression"


    // $ANTLR start "entryRuleDATATYPE"
    // InternalDependencyModelLanguage.g:6537:1: entryRuleDATATYPE returns [String current=null] : iv_ruleDATATYPE= ruleDATATYPE EOF ;
    public final String entryRuleDATATYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATATYPE = null;


        try {
            // InternalDependencyModelLanguage.g:6538:2: (iv_ruleDATATYPE= ruleDATATYPE EOF )
            // InternalDependencyModelLanguage.g:6539:2: iv_ruleDATATYPE= ruleDATATYPE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDATATYPERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDATATYPE=ruleDATATYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDATATYPE.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDATATYPE"


    // $ANTLR start "ruleDATATYPE"
    // InternalDependencyModelLanguage.g:6546:1: ruleDATATYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )* ) ;
    public final AntlrDatatypeRuleToken ruleDATATYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // InternalDependencyModelLanguage.g:6549:28: ( (this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )* ) )
            // InternalDependencyModelLanguage.g:6550:1: (this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )* )
            {
            // InternalDependencyModelLanguage.g:6550:1: (this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )* )
            // InternalDependencyModelLanguage.g:6550:6: this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getDATATYPEAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalDependencyModelLanguage.g:6557:1: (kw= '[' this_INT_2= RULE_INT kw= ']' )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==19) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalDependencyModelLanguage.g:6558:2: kw= '[' this_INT_2= RULE_INT kw= ']'
            	    {
            	    kw=(Token)match(input,19,FollowSets000.FOLLOW_56); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getDATATYPEAccess().getLeftSquareBracketKeyword_1_0()); 
            	          
            	    }
            	    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_INT_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_INT_2, grammarAccess.getDATATYPEAccess().getINTTerminalRuleCall_1_1()); 
            	          
            	    }
            	    kw=(Token)match(input,20,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getDATATYPEAccess().getRightSquareBracketKeyword_1_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDATATYPE"


    // $ANTLR start "ruleOrOperator"
    // InternalDependencyModelLanguage.g:6584:1: ruleOrOperator returns [Enumerator current=null] : (enumLiteral_0= 'or' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6586:28: ( (enumLiteral_0= 'or' ) )
            // InternalDependencyModelLanguage.g:6587:1: (enumLiteral_0= 'or' )
            {
            // InternalDependencyModelLanguage.g:6587:1: (enumLiteral_0= 'or' )
            // InternalDependencyModelLanguage.g:6587:3: enumLiteral_0= 'or'
            {
            enumLiteral_0=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "ruleAndOperator"
    // InternalDependencyModelLanguage.g:6597:1: ruleAndOperator returns [Enumerator current=null] : (enumLiteral_0= 'and' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6599:28: ( (enumLiteral_0= 'and' ) )
            // InternalDependencyModelLanguage.g:6600:1: (enumLiteral_0= 'and' )
            {
            // InternalDependencyModelLanguage.g:6600:1: (enumLiteral_0= 'and' )
            // InternalDependencyModelLanguage.g:6600:3: enumLiteral_0= 'and'
            {
            enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "ruleLogicOperator"
    // InternalDependencyModelLanguage.g:6610:1: ruleLogicOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'or' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleLogicOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6612:28: ( ( (enumLiteral_0= 'or' ) | (enumLiteral_1= 'and' ) ) )
            // InternalDependencyModelLanguage.g:6613:1: ( (enumLiteral_0= 'or' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalDependencyModelLanguage.g:6613:1: ( (enumLiteral_0= 'or' ) | (enumLiteral_1= 'and' ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==74) ) {
                alt80=1;
            }
            else if ( (LA80_0==33) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6613:2: (enumLiteral_0= 'or' )
                    {
                    // InternalDependencyModelLanguage.g:6613:2: (enumLiteral_0= 'or' )
                    // InternalDependencyModelLanguage.g:6613:4: enumLiteral_0= 'or'
                    {
                    enumLiteral_0=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:6619:6: (enumLiteral_1= 'and' )
                    {
                    // InternalDependencyModelLanguage.g:6619:6: (enumLiteral_1= 'and' )
                    // InternalDependencyModelLanguage.g:6619:8: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicOperator"


    // $ANTLR start "ruleComparingOperator"
    // InternalDependencyModelLanguage.g:6629:1: ruleComparingOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) ) ;
    public final Enumerator ruleComparingOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6631:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) ) )
            // InternalDependencyModelLanguage.g:6632:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) )
            {
            // InternalDependencyModelLanguage.g:6632:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) )
            int alt81=6;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt81=1;
                }
                break;
            case 76:
                {
                alt81=2;
                }
                break;
            case 64:
                {
                alt81=3;
                }
                break;
            case 77:
                {
                alt81=4;
                }
                break;
            case 78:
                {
                alt81=5;
                }
                break;
            case 65:
                {
                alt81=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6632:2: (enumLiteral_0= '==' )
                    {
                    // InternalDependencyModelLanguage.g:6632:2: (enumLiteral_0= '==' )
                    // InternalDependencyModelLanguage.g:6632:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:6638:6: (enumLiteral_1= '<>' )
                    {
                    // InternalDependencyModelLanguage.g:6638:6: (enumLiteral_1= '<>' )
                    // InternalDependencyModelLanguage.g:6638:8: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparingOperatorAccess().getUNEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparingOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:6644:6: (enumLiteral_2= '<' )
                    {
                    // InternalDependencyModelLanguage.g:6644:6: (enumLiteral_2= '<' )
                    // InternalDependencyModelLanguage.g:6644:8: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDependencyModelLanguage.g:6650:6: (enumLiteral_3= '<=' )
                    {
                    // InternalDependencyModelLanguage.g:6650:6: (enumLiteral_3= '<=' )
                    // InternalDependencyModelLanguage.g:6650:8: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDependencyModelLanguage.g:6656:6: (enumLiteral_4= '>=' )
                    {
                    // InternalDependencyModelLanguage.g:6656:6: (enumLiteral_4= '>=' )
                    // InternalDependencyModelLanguage.g:6656:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDependencyModelLanguage.g:6662:6: (enumLiteral_5= '>' )
                    {
                    // InternalDependencyModelLanguage.g:6662:6: (enumLiteral_5= '>' )
                    // InternalDependencyModelLanguage.g:6662:8: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparingOperator"


    // $ANTLR start "ruleNaturalLanguageComparingOperator"
    // InternalDependencyModelLanguage.g:6672:1: ruleNaturalLanguageComparingOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'since exactly' ) | (enumLiteral_1= 'strictly short than' ) | (enumLiteral_2= 'shorter than' ) | (enumLiteral_3= 'strictly longer than' ) | (enumLiteral_4= 'longer than' ) ) ;
    public final Enumerator ruleNaturalLanguageComparingOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6674:28: ( ( (enumLiteral_0= 'since exactly' ) | (enumLiteral_1= 'strictly short than' ) | (enumLiteral_2= 'shorter than' ) | (enumLiteral_3= 'strictly longer than' ) | (enumLiteral_4= 'longer than' ) ) )
            // InternalDependencyModelLanguage.g:6675:1: ( (enumLiteral_0= 'since exactly' ) | (enumLiteral_1= 'strictly short than' ) | (enumLiteral_2= 'shorter than' ) | (enumLiteral_3= 'strictly longer than' ) | (enumLiteral_4= 'longer than' ) )
            {
            // InternalDependencyModelLanguage.g:6675:1: ( (enumLiteral_0= 'since exactly' ) | (enumLiteral_1= 'strictly short than' ) | (enumLiteral_2= 'shorter than' ) | (enumLiteral_3= 'strictly longer than' ) | (enumLiteral_4= 'longer than' ) )
            int alt82=5;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt82=1;
                }
                break;
            case 80:
                {
                alt82=2;
                }
                break;
            case 81:
                {
                alt82=3;
                }
                break;
            case 82:
                {
                alt82=4;
                }
                break;
            case 83:
                {
                alt82=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6675:2: (enumLiteral_0= 'since exactly' )
                    {
                    // InternalDependencyModelLanguage.g:6675:2: (enumLiteral_0= 'since exactly' )
                    // InternalDependencyModelLanguage.g:6675:4: enumLiteral_0= 'since exactly'
                    {
                    enumLiteral_0=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNaturalLanguageComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getNaturalLanguageComparingOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:6681:6: (enumLiteral_1= 'strictly short than' )
                    {
                    // InternalDependencyModelLanguage.g:6681:6: (enumLiteral_1= 'strictly short than' )
                    // InternalDependencyModelLanguage.g:6681:8: enumLiteral_1= 'strictly short than'
                    {
                    enumLiteral_1=(Token)match(input,80,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNaturalLanguageComparingOperatorAccess().getLESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getNaturalLanguageComparingOperatorAccess().getLESSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:6687:6: (enumLiteral_2= 'shorter than' )
                    {
                    // InternalDependencyModelLanguage.g:6687:6: (enumLiteral_2= 'shorter than' )
                    // InternalDependencyModelLanguage.g:6687:8: enumLiteral_2= 'shorter than'
                    {
                    enumLiteral_2=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNaturalLanguageComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getNaturalLanguageComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDependencyModelLanguage.g:6693:6: (enumLiteral_3= 'strictly longer than' )
                    {
                    // InternalDependencyModelLanguage.g:6693:6: (enumLiteral_3= 'strictly longer than' )
                    // InternalDependencyModelLanguage.g:6693:8: enumLiteral_3= 'strictly longer than'
                    {
                    enumLiteral_3=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNaturalLanguageComparingOperatorAccess().getGREATEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getNaturalLanguageComparingOperatorAccess().getGREATEREnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDependencyModelLanguage.g:6699:6: (enumLiteral_4= 'longer than' )
                    {
                    // InternalDependencyModelLanguage.g:6699:6: (enumLiteral_4= 'longer than' )
                    // InternalDependencyModelLanguage.g:6699:8: enumLiteral_4= 'longer than'
                    {
                    enumLiteral_4=(Token)match(input,83,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getNaturalLanguageComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getNaturalLanguageComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNaturalLanguageComparingOperator"


    // $ANTLR start "ruleStateEventKind"
    // InternalDependencyModelLanguage.g:6709:1: ruleStateEventKind returns [Enumerator current=null] : ( (enumLiteral_0= 'entering state' ) | (enumLiteral_1= 'leaving state' ) ) ;
    public final Enumerator ruleStateEventKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6711:28: ( ( (enumLiteral_0= 'entering state' ) | (enumLiteral_1= 'leaving state' ) ) )
            // InternalDependencyModelLanguage.g:6712:1: ( (enumLiteral_0= 'entering state' ) | (enumLiteral_1= 'leaving state' ) )
            {
            // InternalDependencyModelLanguage.g:6712:1: ( (enumLiteral_0= 'entering state' ) | (enumLiteral_1= 'leaving state' ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==84) ) {
                alt83=1;
            }
            else if ( (LA83_0==85) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6712:2: (enumLiteral_0= 'entering state' )
                    {
                    // InternalDependencyModelLanguage.g:6712:2: (enumLiteral_0= 'entering state' )
                    // InternalDependencyModelLanguage.g:6712:4: enumLiteral_0= 'entering state'
                    {
                    enumLiteral_0=(Token)match(input,84,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateEventKindAccess().getENTRYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getStateEventKindAccess().getENTRYEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:6718:6: (enumLiteral_1= 'leaving state' )
                    {
                    // InternalDependencyModelLanguage.g:6718:6: (enumLiteral_1= 'leaving state' )
                    // InternalDependencyModelLanguage.g:6718:8: enumLiteral_1= 'leaving state'
                    {
                    enumLiteral_1=(Token)match(input,85,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateEventKindAccess().getEXITEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getStateEventKindAccess().getEXITEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateEventKind"


    // $ANTLR start "ruleStateStatusKind"
    // InternalDependencyModelLanguage.g:6728:1: ruleStateStatusKind returns [Enumerator current=null] : ( (enumLiteral_0= 'is active' ) | (enumLiteral_1= 'is inactive' ) ) ;
    public final Enumerator ruleStateStatusKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6730:28: ( ( (enumLiteral_0= 'is active' ) | (enumLiteral_1= 'is inactive' ) ) )
            // InternalDependencyModelLanguage.g:6731:1: ( (enumLiteral_0= 'is active' ) | (enumLiteral_1= 'is inactive' ) )
            {
            // InternalDependencyModelLanguage.g:6731:1: ( (enumLiteral_0= 'is active' ) | (enumLiteral_1= 'is inactive' ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==86) ) {
                alt84=1;
            }
            else if ( (LA84_0==87) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6731:2: (enumLiteral_0= 'is active' )
                    {
                    // InternalDependencyModelLanguage.g:6731:2: (enumLiteral_0= 'is active' )
                    // InternalDependencyModelLanguage.g:6731:4: enumLiteral_0= 'is active'
                    {
                    enumLiteral_0=(Token)match(input,86,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateStatusKindAccess().getACTIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getStateStatusKindAccess().getACTIVEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:6737:6: (enumLiteral_1= 'is inactive' )
                    {
                    // InternalDependencyModelLanguage.g:6737:6: (enumLiteral_1= 'is inactive' )
                    // InternalDependencyModelLanguage.g:6737:8: enumLiteral_1= 'is inactive'
                    {
                    enumLiteral_1=(Token)match(input,87,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateStatusKindAccess().getINACTIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getStateStatusKindAccess().getINACTIVEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateStatusKind"


    // $ANTLR start "ruleMessageEventKind"
    // InternalDependencyModelLanguage.g:6747:1: ruleMessageEventKind returns [Enumerator current=null] : ( (enumLiteral_0= 'consuming' ) | (enumLiteral_1= 'sending' ) ) ;
    public final Enumerator ruleMessageEventKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6749:28: ( ( (enumLiteral_0= 'consuming' ) | (enumLiteral_1= 'sending' ) ) )
            // InternalDependencyModelLanguage.g:6750:1: ( (enumLiteral_0= 'consuming' ) | (enumLiteral_1= 'sending' ) )
            {
            // InternalDependencyModelLanguage.g:6750:1: ( (enumLiteral_0= 'consuming' ) | (enumLiteral_1= 'sending' ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==88) ) {
                alt85=1;
            }
            else if ( (LA85_0==89) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6750:2: (enumLiteral_0= 'consuming' )
                    {
                    // InternalDependencyModelLanguage.g:6750:2: (enumLiteral_0= 'consuming' )
                    // InternalDependencyModelLanguage.g:6750:4: enumLiteral_0= 'consuming'
                    {
                    enumLiteral_0=(Token)match(input,88,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMessageEventKindAccess().getCONSUMINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMessageEventKindAccess().getCONSUMINGEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:6756:6: (enumLiteral_1= 'sending' )
                    {
                    // InternalDependencyModelLanguage.g:6756:6: (enumLiteral_1= 'sending' )
                    // InternalDependencyModelLanguage.g:6756:8: enumLiteral_1= 'sending'
                    {
                    enumLiteral_1=(Token)match(input,89,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMessageEventKindAccess().getSENDINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMessageEventKindAccess().getSENDINGEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageEventKind"


    // $ANTLR start "ruleUnaryPostIncrementDecrementOperator"
    // InternalDependencyModelLanguage.g:6766:1: ruleUnaryPostIncrementDecrementOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleUnaryPostIncrementDecrementOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6768:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalDependencyModelLanguage.g:6769:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalDependencyModelLanguage.g:6769:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==90) ) {
                alt86=1;
            }
            else if ( (LA86_0==91) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6769:2: (enumLiteral_0= '++' )
                    {
                    // InternalDependencyModelLanguage.g:6769:2: (enumLiteral_0= '++' )
                    // InternalDependencyModelLanguage.g:6769:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,90,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:6775:6: (enumLiteral_1= '--' )
                    {
                    // InternalDependencyModelLanguage.g:6775:6: (enumLiteral_1= '--' )
                    // InternalDependencyModelLanguage.g:6775:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,91,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryPostIncrementDecrementOperator"


    // $ANTLR start "ruleIncrementDecrementOperatorExpression"
    // InternalDependencyModelLanguage.g:6785:1: ruleIncrementDecrementOperatorExpression returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleIncrementDecrementOperatorExpression() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6787:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalDependencyModelLanguage.g:6788:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalDependencyModelLanguage.g:6788:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==90) ) {
                alt87=1;
            }
            else if ( (LA87_0==91) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6788:2: (enumLiteral_0= '++' )
                    {
                    // InternalDependencyModelLanguage.g:6788:2: (enumLiteral_0= '++' )
                    // InternalDependencyModelLanguage.g:6788:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,90,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIncrementDecrementOperatorExpressionAccess().getINCREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getIncrementDecrementOperatorExpressionAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:6794:6: (enumLiteral_1= '--' )
                    {
                    // InternalDependencyModelLanguage.g:6794:6: (enumLiteral_1= '--' )
                    // InternalDependencyModelLanguage.g:6794:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,91,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getIncrementDecrementOperatorExpressionAccess().getDECREMENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getIncrementDecrementOperatorExpressionAccess().getDECREMENTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIncrementDecrementOperatorExpression"


    // $ANTLR start "ruleAssignOperator"
    // InternalDependencyModelLanguage.g:6804:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6806:28: ( ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) ) )
            // InternalDependencyModelLanguage.g:6807:1: ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) )
            {
            // InternalDependencyModelLanguage.g:6807:1: ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) )
            int alt88=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt88=1;
                }
                break;
            case 92:
                {
                alt88=2;
                }
                break;
            case 93:
                {
                alt88=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6807:2: (enumLiteral_0= ':=' )
                    {
                    // InternalDependencyModelLanguage.g:6807:2: (enumLiteral_0= ':=' )
                    // InternalDependencyModelLanguage.g:6807:4: enumLiteral_0= ':='
                    {
                    enumLiteral_0=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:6813:6: (enumLiteral_1= '+=' )
                    {
                    // InternalDependencyModelLanguage.g:6813:6: (enumLiteral_1= '+=' )
                    // InternalDependencyModelLanguage.g:6813:8: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,92,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:6819:6: (enumLiteral_2= '-=' )
                    {
                    // InternalDependencyModelLanguage.g:6819:6: (enumLiteral_2= '-=' )
                    // InternalDependencyModelLanguage.g:6819:8: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,93,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // InternalDependencyModelLanguage.g:6829:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6831:28: ( (enumLiteral_0= '||' ) )
            // InternalDependencyModelLanguage.g:6832:1: (enumLiteral_0= '||' )
            {
            // InternalDependencyModelLanguage.g:6832:1: (enumLiteral_0= '||' )
            // InternalDependencyModelLanguage.g:6832:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,94,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // InternalDependencyModelLanguage.g:6842:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6844:28: ( (enumLiteral_0= '&&' ) )
            // InternalDependencyModelLanguage.g:6845:1: (enumLiteral_0= '&&' )
            {
            // InternalDependencyModelLanguage.g:6845:1: (enumLiteral_0= '&&' )
            // InternalDependencyModelLanguage.g:6845:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,95,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleComparingEQNEQOperator"
    // InternalDependencyModelLanguage.g:6855:1: ruleComparingEQNEQOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleComparingEQNEQOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6857:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) )
            // InternalDependencyModelLanguage.g:6858:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalDependencyModelLanguage.g:6858:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==75) ) {
                alt89=1;
            }
            else if ( (LA89_0==76) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6858:2: (enumLiteral_0= '==' )
                    {
                    // InternalDependencyModelLanguage.g:6858:2: (enumLiteral_0= '==' )
                    // InternalDependencyModelLanguage.g:6858:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:6864:6: (enumLiteral_1= '<>' )
                    {
                    // InternalDependencyModelLanguage.g:6864:6: (enumLiteral_1= '<>' )
                    // InternalDependencyModelLanguage.g:6864:8: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparingEQNEQOperatorAccess().getUNEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparingEQNEQOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparingEQNEQOperator"


    // $ANTLR start "ruleComparingRelOperator"
    // InternalDependencyModelLanguage.g:6874:1: ruleComparingRelOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) ;
    public final Enumerator ruleComparingRelOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6876:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) )
            // InternalDependencyModelLanguage.g:6877:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            {
            // InternalDependencyModelLanguage.g:6877:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            int alt90=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt90=1;
                }
                break;
            case 77:
                {
                alt90=2;
                }
                break;
            case 78:
                {
                alt90=3;
                }
                break;
            case 65:
                {
                alt90=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6877:2: (enumLiteral_0= '<' )
                    {
                    // InternalDependencyModelLanguage.g:6877:2: (enumLiteral_0= '<' )
                    // InternalDependencyModelLanguage.g:6877:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:6883:6: (enumLiteral_1= '<=' )
                    {
                    // InternalDependencyModelLanguage.g:6883:6: (enumLiteral_1= '<=' )
                    // InternalDependencyModelLanguage.g:6883:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:6889:6: (enumLiteral_2= '>=' )
                    {
                    // InternalDependencyModelLanguage.g:6889:6: (enumLiteral_2= '>=' )
                    // InternalDependencyModelLanguage.g:6889:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDependencyModelLanguage.g:6895:6: (enumLiteral_3= '>' )
                    {
                    // InternalDependencyModelLanguage.g:6895:6: (enumLiteral_3= '>' )
                    // InternalDependencyModelLanguage.g:6895:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparingRelOperatorAccess().getGREATEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getComparingRelOperatorAccess().getGREATEREnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparingRelOperator"


    // $ANTLR start "ruleAdditionOperator"
    // InternalDependencyModelLanguage.g:6905:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6907:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDependencyModelLanguage.g:6908:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDependencyModelLanguage.g:6908:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==96) ) {
                alt91=1;
            }
            else if ( (LA91_0==53) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6908:2: (enumLiteral_0= '+' )
                    {
                    // InternalDependencyModelLanguage.g:6908:2: (enumLiteral_0= '+' )
                    // InternalDependencyModelLanguage.g:6908:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,96,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:6914:6: (enumLiteral_1= '-' )
                    {
                    // InternalDependencyModelLanguage.g:6914:6: (enumLiteral_1= '-' )
                    // InternalDependencyModelLanguage.g:6914:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "ruleMultiplicationOperator"
    // InternalDependencyModelLanguage.g:6924:1: ruleMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6926:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // InternalDependencyModelLanguage.g:6927:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // InternalDependencyModelLanguage.g:6927:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt92=3;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt92=1;
                }
                break;
            case 98:
                {
                alt92=2;
                }
                break;
            case 99:
                {
                alt92=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6927:2: (enumLiteral_0= '*' )
                    {
                    // InternalDependencyModelLanguage.g:6927:2: (enumLiteral_0= '*' )
                    // InternalDependencyModelLanguage.g:6927:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,97,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:6933:6: (enumLiteral_1= '/' )
                    {
                    // InternalDependencyModelLanguage.g:6933:6: (enumLiteral_1= '/' )
                    // InternalDependencyModelLanguage.g:6933:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,98,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:6939:6: (enumLiteral_2= '%' )
                    {
                    // InternalDependencyModelLanguage.g:6939:6: (enumLiteral_2= '%' )
                    // InternalDependencyModelLanguage.g:6939:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,99,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getMODULOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getMultiplicationOperatorAccess().getMODULOEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicationOperator"


    // $ANTLR start "ruleUnaryPreOperator"
    // InternalDependencyModelLanguage.g:6949:1: ruleUnaryPreOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleUnaryPreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6951:28: ( ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) ) )
            // InternalDependencyModelLanguage.g:6952:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDependencyModelLanguage.g:6952:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==100) ) {
                alt93=1;
            }
            else if ( (LA93_0==53) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6952:2: (enumLiteral_0= 'not' )
                    {
                    // InternalDependencyModelLanguage.g:6952:2: (enumLiteral_0= 'not' )
                    // InternalDependencyModelLanguage.g:6952:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,100,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:6958:6: (enumLiteral_1= '-' )
                    {
                    // InternalDependencyModelLanguage.g:6958:6: (enumLiteral_1= '-' )
                    // InternalDependencyModelLanguage.g:6958:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryPreOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryPreOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryPreOperator"


    // $ANTLR start "rulePositionSelectorKind"
    // InternalDependencyModelLanguage.g:6968:1: rulePositionSelectorKind returns [Enumerator current=null] : ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) ) ;
    public final Enumerator rulePositionSelectorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalDependencyModelLanguage.g:6970:28: ( ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) ) )
            // InternalDependencyModelLanguage.g:6971:1: ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) )
            {
            // InternalDependencyModelLanguage.g:6971:1: ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) )
            int alt94=5;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt94=1;
                }
                break;
            case 102:
                {
                alt94=2;
                }
                break;
            case 103:
                {
                alt94=3;
                }
                break;
            case 104:
                {
                alt94=4;
                }
                break;
            case 105:
                {
                alt94=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalDependencyModelLanguage.g:6971:2: (enumLiteral_0= 'self' )
                    {
                    // InternalDependencyModelLanguage.g:6971:2: (enumLiteral_0= 'self' )
                    // InternalDependencyModelLanguage.g:6971:4: enumLiteral_0= 'self'
                    {
                    enumLiteral_0=(Token)match(input,101,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDependencyModelLanguage.g:6977:6: (enumLiteral_1= 'first' )
                    {
                    // InternalDependencyModelLanguage.g:6977:6: (enumLiteral_1= 'first' )
                    // InternalDependencyModelLanguage.g:6977:8: enumLiteral_1= 'first'
                    {
                    enumLiteral_1=(Token)match(input,102,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDependencyModelLanguage.g:6983:6: (enumLiteral_2= 'last' )
                    {
                    // InternalDependencyModelLanguage.g:6983:6: (enumLiteral_2= 'last' )
                    // InternalDependencyModelLanguage.g:6983:8: enumLiteral_2= 'last'
                    {
                    enumLiteral_2=(Token)match(input,103,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDependencyModelLanguage.g:6989:6: (enumLiteral_3= 'prev' )
                    {
                    // InternalDependencyModelLanguage.g:6989:6: (enumLiteral_3= 'prev' )
                    // InternalDependencyModelLanguage.g:6989:8: enumLiteral_3= 'prev'
                    {
                    enumLiteral_3=(Token)match(input,104,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDependencyModelLanguage.g:6995:6: (enumLiteral_4= 'next' )
                    {
                    // InternalDependencyModelLanguage.g:6995:6: (enumLiteral_4= 'next' )
                    // InternalDependencyModelLanguage.g:6995:8: enumLiteral_4= 'next'
                    {
                    enumLiteral_4=(Token)match(input,105,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPositionSelectorKindAccess().getNEXTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getPositionSelectorKindAccess().getNEXTEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePositionSelectorKind"

    // $ANTLR start synpred25_InternalDependencyModelLanguage
    public final void synpred25_InternalDependencyModelLanguage_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_condition_1_0 = null;

        EObject lv_effects_3_0 = null;

        EObject lv_effects_5_0 = null;


        // InternalDependencyModelLanguage.g:873:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffect ) ) (otherlv_4= ';' ( (lv_effects_5_0= ruleEffect ) ) )* (otherlv_6= ';' )? otherlv_7= '}' ) )
        // InternalDependencyModelLanguage.g:873:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffect ) ) (otherlv_4= ';' ( (lv_effects_5_0= ruleEffect ) ) )* (otherlv_6= ';' )? otherlv_7= '}' )
        {
        // InternalDependencyModelLanguage.g:873:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffect ) ) (otherlv_4= ';' ( (lv_effects_5_0= ruleEffect ) ) )* (otherlv_6= ';' )? otherlv_7= '}' )
        // InternalDependencyModelLanguage.g:873:4: otherlv_0= 'if' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_effects_3_0= ruleEffect ) ) (otherlv_4= ';' ( (lv_effects_5_0= ruleEffect ) ) )* (otherlv_6= ';' )? otherlv_7= '}'
        {
        otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_18); if (state.failed) return ;
        // InternalDependencyModelLanguage.g:877:1: ( (lv_condition_1_0= ruleCondition ) )
        // InternalDependencyModelLanguage.g:878:1: (lv_condition_1_0= ruleCondition )
        {
        // InternalDependencyModelLanguage.g:878:1: (lv_condition_1_0= ruleCondition )
        // InternalDependencyModelLanguage.g:879:3: lv_condition_1_0= ruleCondition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalDependencyAccess().getConditionConditionParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_20);
        lv_condition_1_0=ruleCondition();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_23); if (state.failed) return ;
        // InternalDependencyModelLanguage.g:899:1: ( (lv_effects_3_0= ruleEffect ) )
        // InternalDependencyModelLanguage.g:900:1: (lv_effects_3_0= ruleEffect )
        {
        // InternalDependencyModelLanguage.g:900:1: (lv_effects_3_0= ruleEffect )
        // InternalDependencyModelLanguage.g:901:3: lv_effects_3_0= ruleEffect
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConditionalDependencyAccess().getEffectsEffectParserRuleCall_0_3_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_22);
        lv_effects_3_0=ruleEffect();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalDependencyModelLanguage.g:917:2: (otherlv_4= ';' ( (lv_effects_5_0= ruleEffect ) ) )*
        loop100:
        do {
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==14) ) {
                int LA100_1 = input.LA(2);

                if ( ((LA100_1>=29 && LA100_1<=32)) ) {
                    alt100=1;
                }


            }


            switch (alt100) {
        	case 1 :
        	    // InternalDependencyModelLanguage.g:917:4: otherlv_4= ';' ( (lv_effects_5_0= ruleEffect ) )
        	    {
        	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return ;
        	    // InternalDependencyModelLanguage.g:921:1: ( (lv_effects_5_0= ruleEffect ) )
        	    // InternalDependencyModelLanguage.g:922:1: (lv_effects_5_0= ruleEffect )
        	    {
        	    // InternalDependencyModelLanguage.g:922:1: (lv_effects_5_0= ruleEffect )
        	    // InternalDependencyModelLanguage.g:923:3: lv_effects_5_0= ruleEffect
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getConditionalDependencyAccess().getEffectsEffectParserRuleCall_0_4_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_22);
        	    lv_effects_5_0=ruleEffect();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop100;
            }
        } while (true);

        // InternalDependencyModelLanguage.g:939:4: (otherlv_6= ';' )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==14) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // InternalDependencyModelLanguage.g:939:6: otherlv_6= ';'
                {
                otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return ;

                }
                break;

        }

        otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalDependencyModelLanguage

    // $ANTLR start synpred48_InternalDependencyModelLanguage
    public final void synpred48_InternalDependencyModelLanguage_fragment() throws RecognitionException {   
        EObject this_CompositionEvent_1 = null;


        // InternalDependencyModelLanguage.g:2109:2: (this_CompositionEvent_1= ruleCompositionEvent )
        // InternalDependencyModelLanguage.g:2109:2: this_CompositionEvent_1= ruleCompositionEvent
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_CompositionEvent_1=ruleCompositionEvent();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalDependencyModelLanguage

    // $ANTLR start synpred49_InternalDependencyModelLanguage
    public final void synpred49_InternalDependencyModelLanguage_fragment() throws RecognitionException {   
        EObject this_CountedEvent_2 = null;


        // InternalDependencyModelLanguage.g:2122:2: (this_CountedEvent_2= ruleCountedEvent )
        // InternalDependencyModelLanguage.g:2122:2: this_CountedEvent_2= ruleCountedEvent
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_CountedEvent_2=ruleCountedEvent();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalDependencyModelLanguage

    // $ANTLR start synpred53_InternalDependencyModelLanguage
    public final void synpred53_InternalDependencyModelLanguage_fragment() throws RecognitionException {   
        EObject this_ClockCondition_1 = null;


        // InternalDependencyModelLanguage.g:2579:2: (this_ClockCondition_1= ruleClockCondition )
        // InternalDependencyModelLanguage.g:2579:2: this_ClockCondition_1= ruleClockCondition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ClockCondition_1=ruleClockCondition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalDependencyModelLanguage

    // $ANTLR start synpred54_InternalDependencyModelLanguage
    public final void synpred54_InternalDependencyModelLanguage_fragment() throws RecognitionException {   
        EObject this_StateStatusCondition_2 = null;


        // InternalDependencyModelLanguage.g:2592:2: (this_StateStatusCondition_2= ruleStateStatusCondition )
        // InternalDependencyModelLanguage.g:2592:2: this_StateStatusCondition_2= ruleStateStatusCondition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_StateStatusCondition_2=ruleStateStatusCondition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalDependencyModelLanguage

    // $ANTLR start synpred56_InternalDependencyModelLanguage
    public final void synpred56_InternalDependencyModelLanguage_fragment() throws RecognitionException {   
        EObject this_DataCondition_4 = null;


        // InternalDependencyModelLanguage.g:2618:2: (this_DataCondition_4= ruleDataCondition )
        // InternalDependencyModelLanguage.g:2618:2: this_DataCondition_4= ruleDataCondition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_DataCondition_4=ruleDataCondition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalDependencyModelLanguage

    // $ANTLR start synpred59_InternalDependencyModelLanguage
    public final void synpred59_InternalDependencyModelLanguage_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_fromEvent_1_0 = null;

        EObject lv_untilEvent_3_0 = null;


        // InternalDependencyModelLanguage.g:2773:2: ( ( ( (lv_fromEvent_1_0= ruleComplexEvent ) ) otherlv_2= ',' ( (lv_untilEvent_3_0= ruleComplexEvent ) ) ) )
        // InternalDependencyModelLanguage.g:2773:2: ( ( (lv_fromEvent_1_0= ruleComplexEvent ) ) otherlv_2= ',' ( (lv_untilEvent_3_0= ruleComplexEvent ) ) )
        {
        // InternalDependencyModelLanguage.g:2773:2: ( ( (lv_fromEvent_1_0= ruleComplexEvent ) ) otherlv_2= ',' ( (lv_untilEvent_3_0= ruleComplexEvent ) ) )
        // InternalDependencyModelLanguage.g:2773:3: ( (lv_fromEvent_1_0= ruleComplexEvent ) ) otherlv_2= ',' ( (lv_untilEvent_3_0= ruleComplexEvent ) )
        {
        // InternalDependencyModelLanguage.g:2773:3: ( (lv_fromEvent_1_0= ruleComplexEvent ) )
        // InternalDependencyModelLanguage.g:2774:1: (lv_fromEvent_1_0= ruleComplexEvent )
        {
        // InternalDependencyModelLanguage.g:2774:1: (lv_fromEvent_1_0= ruleComplexEvent )
        // InternalDependencyModelLanguage.g:2775:3: lv_fromEvent_1_0= ruleComplexEvent
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getEventConstrainedIntervalConditionAccess().getFromEventComplexEventParserRuleCall_1_0_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_15);
        lv_fromEvent_1_0=ruleComplexEvent();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_25); if (state.failed) return ;
        // InternalDependencyModelLanguage.g:2795:1: ( (lv_untilEvent_3_0= ruleComplexEvent ) )
        // InternalDependencyModelLanguage.g:2796:1: (lv_untilEvent_3_0= ruleComplexEvent )
        {
        // InternalDependencyModelLanguage.g:2796:1: (lv_untilEvent_3_0= ruleComplexEvent )
        // InternalDependencyModelLanguage.g:2797:3: lv_untilEvent_3_0= ruleComplexEvent
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getEventConstrainedIntervalConditionAccess().getUntilEventComplexEventParserRuleCall_1_0_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_untilEvent_3_0=ruleComplexEvent();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred59_InternalDependencyModelLanguage

    // $ANTLR start synpred68_InternalDependencyModelLanguage
    public final void synpred68_InternalDependencyModelLanguage_fragment() throws RecognitionException {   
        Token kw=null;
        Token this_ID_2=null;

        // InternalDependencyModelLanguage.g:3454:2: (kw= '.' this_ID_2= RULE_ID )
        // InternalDependencyModelLanguage.g:3454:2: kw= '.' this_ID_2= RULE_ID
        {
        kw=(Token)match(input,40,FollowSets000.FOLLOW_14); if (state.failed) return ;
        this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalDependencyModelLanguage

    // Delegated rules

    public final boolean synpred25_InternalDependencyModelLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalDependencyModelLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalDependencyModelLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalDependencyModelLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalDependencyModelLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalDependencyModelLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalDependencyModelLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalDependencyModelLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalDependencyModelLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalDependencyModelLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalDependencyModelLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalDependencyModelLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalDependencyModelLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalDependencyModelLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalDependencyModelLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalDependencyModelLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA75 dfa75 = new DFA75(this);
    static final String dfa_1s = "\33\uffff";
    static final String dfa_2s = "\1\17\1\51\5\6\1\20\1\6\2\20\1\6\2\uffff\1\20\2\6\1\20\2\6\4\20\2\6\1\20";
    static final String dfa_3s = "\1\17\1\131\1\6\2\52\2\6\1\50\1\6\2\50\1\6\2\uffff\1\50\2\6\1\50\2\6\1\50\1\23\2\50\1\6\1\131\1\50";
    static final String dfa_4s = "\14\uffff\1\1\1\2\15\uffff";
    static final String dfa_5s = "\33\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\52\uffff\1\3\1\4\2\uffff\1\5\1\6",
            "\1\7",
            "\1\11\43\uffff\1\10",
            "\1\11\43\uffff\1\10",
            "\1\12",
            "\1\12",
            "\2\14\1\uffff\1\15\24\uffff\1\13",
            "\1\16",
            "\2\14\1\uffff\1\15\24\uffff\1\17",
            "\2\14\1\uffff\1\15\24\uffff\1\20",
            "\1\21",
            "",
            "",
            "\1\23\27\uffff\1\22",
            "\1\24",
            "\1\25",
            "\2\14\1\uffff\1\15\24\uffff\1\13",
            "\1\26",
            "\1\27",
            "\2\14\1\uffff\1\15\24\uffff\1\17",
            "\2\14\1\uffff\1\15",
            "\1\23\27\uffff\1\22",
            "\1\31\1\14\1\uffff\1\15\24\uffff\1\30",
            "\1\32",
            "\1\27\42\uffff\1\14\52\uffff\2\14\2\uffff\2\14",
            "\1\31\1\14\1\uffff\1\15\24\uffff\1\30"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "356:2: ( (otherlv_0= 'synchronize' ( (lv_sendingEvents_1_0= ruleEvent ) ) (otherlv_2= ',' ( (lv_sendingEvents_3_0= ruleEvent ) ) )* otherlv_4= 'with' ( (lv_receivingEvents_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_receivingEvents_7_0= ruleEvent ) ) )* ) | (otherlv_8= 'synchronize' ( (lv_sendingEvents_9_0= ruleSynchronizationEvent ) ) (otherlv_10= ',' ( (lv_sendingEvents_11_0= ruleSynchronizationEvent ) ) )* otherlv_12= 'with' ( (lv_receivingEvents_13_0= ruleSynchronizationEvent ) ) (otherlv_14= ',' ( (lv_receivingEvents_15_0= ruleSynchronizationEvent ) ) )* ) )";
        }
    }
    static final String dfa_7s = "\21\uffff";
    static final String dfa_8s = "\3\uffff\1\7\6\uffff\1\7\1\uffff\1\16\3\uffff\1\16";
    static final String dfa_9s = "\1\42\2\6\1\16\1\20\1\6\2\uffff\2\6\1\16\1\20\1\16\1\6\2\uffff\1\16";
    static final String dfa_10s = "\1\44\2\6\2\50\1\6\2\uffff\2\6\3\50\1\6\2\uffff\1\50";
    static final String dfa_11s = "\6\uffff\1\3\1\1\6\uffff\1\2\1\4\1\uffff";
    static final String dfa_12s = "\21\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\uffff\1\2",
            "\1\3",
            "\1\4",
            "\1\7\24\uffff\1\7\1\uffff\1\6\2\uffff\1\5",
            "\1\11\27\uffff\1\10",
            "\1\12",
            "",
            "",
            "\1\13",
            "\1\14",
            "\1\7\24\uffff\1\7\1\uffff\1\6\2\uffff\1\5",
            "\1\11\27\uffff\1\10",
            "\1\16\1\uffff\1\11\22\uffff\1\16\1\uffff\1\17\2\uffff\1\15",
            "\1\20",
            "",
            "",
            "\1\16\1\uffff\1\11\22\uffff\1\16\1\uffff\1\17\2\uffff\1\15"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1378:1: ( (otherlv_0= 'merge variable' ( ( ruleQualifiedName ) ) (otherlv_2= 'into variable' ( (lv_variableName_3_0= ruleEString ) ) )? ) | (otherlv_4= 'merge variables' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )+ (otherlv_8= 'into variable' ( (lv_variableName_9_0= ruleEString ) ) )? ) | (otherlv_10= 'merge variable' ( ( ruleQualifiedName ) ) otherlv_12= 'into hybridport' ( ( ruleQualifiedName ) ) ) | (otherlv_14= 'merge variables' ( ( ruleQualifiedName ) ) (otherlv_16= ',' ( ( ruleQualifiedName ) ) )+ otherlv_18= 'into hybridport' ( ( ruleQualifiedName ) ) ) )";
        }
    }
    static final String dfa_14s = "\12\uffff";
    static final String dfa_15s = "\1\51\6\0\3\uffff";
    static final String dfa_16s = "\1\131\6\0\3\uffff";
    static final String dfa_17s = "\7\uffff\1\1\1\2\1\3";
    static final String dfa_18s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\3\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\1\uffff\1\1\50\uffff\1\3\1\4\2\uffff\1\5\1\6",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2108:1: (this_CompositionEvent_1= ruleCompositionEvent | this_CountedEvent_2= ruleCountedEvent | this_DelayedEvent_3= ruleDelayedEvent )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_1 = input.LA(1);

                         
                        int index38_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalDependencyModelLanguage()) ) {s = 7;}

                        else if ( (synpred49_InternalDependencyModelLanguage()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index38_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_2 = input.LA(1);

                         
                        int index38_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalDependencyModelLanguage()) ) {s = 7;}

                        else if ( (synpred49_InternalDependencyModelLanguage()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index38_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_3 = input.LA(1);

                         
                        int index38_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalDependencyModelLanguage()) ) {s = 7;}

                        else if ( (synpred49_InternalDependencyModelLanguage()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index38_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_4 = input.LA(1);

                         
                        int index38_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalDependencyModelLanguage()) ) {s = 7;}

                        else if ( (synpred49_InternalDependencyModelLanguage()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index38_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_5 = input.LA(1);

                         
                        int index38_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalDependencyModelLanguage()) ) {s = 7;}

                        else if ( (synpred49_InternalDependencyModelLanguage()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index38_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA38_6 = input.LA(1);

                         
                        int index38_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalDependencyModelLanguage()) ) {s = 7;}

                        else if ( (synpred49_InternalDependencyModelLanguage()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index38_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\32\uffff";
    static final String dfa_21s = "\1\6\1\uffff\1\0\5\uffff\2\0\20\uffff";
    static final String dfa_22s = "\1\151\1\uffff\1\0\5\uffff\2\0\20\uffff";
    static final String dfa_23s = "\1\uffff\1\1\10\uffff\1\3\1\4\14\uffff\1\5\1\2";
    static final String dfa_24s = "\2\uffff\1\0\5\uffff\1\1\1\2\20\uffff}>";
    static final String[] dfa_25s = {
            "\1\10\5\13\7\uffff\1\30\25\uffff\1\1\1\uffff\1\2\4\uffff\1\11\1\12\2\uffff\1\1\2\13\35\uffff\2\1\2\uffff\2\1\12\uffff\6\13",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2578:1: (this_ClockCondition_1= ruleClockCondition | this_StateStatusCondition_2= ruleStateStatusCondition | this_EventConstrainedIntervalCondition_3= ruleEventConstrainedIntervalCondition | this_DataCondition_4= ruleDataCondition | this_CompositionOrCondition_5= ruleCompositionOrCondition )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_2 = input.LA(1);

                         
                        int index42_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalDependencyModelLanguage()) ) {s = 1;}

                        else if ( (synpred56_InternalDependencyModelLanguage()) ) {s = 11;}

                         
                        input.seek(index42_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_8 = input.LA(1);

                         
                        int index42_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalDependencyModelLanguage()) ) {s = 1;}

                        else if ( (synpred54_InternalDependencyModelLanguage()) ) {s = 25;}

                        else if ( (synpred56_InternalDependencyModelLanguage()) ) {s = 11;}

                         
                        input.seek(index42_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_9 = input.LA(1);

                         
                        int index42_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalDependencyModelLanguage()) ) {s = 1;}

                        else if ( (synpred54_InternalDependencyModelLanguage()) ) {s = 25;}

                         
                        input.seek(index42_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_26s = "\7\uffff\1\2\1\1\1\3";
    static final String[] dfa_27s = {
            "\1\2\1\uffff\1\1\6\uffff\1\7\41\uffff\1\3\1\4\2\uffff\1\5\1\6",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_26;
            this.special = dfa_18;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "2773:1: ( ( ( (lv_fromEvent_1_0= ruleComplexEvent ) ) otherlv_2= ',' ( (lv_untilEvent_3_0= ruleComplexEvent ) ) ) | ( ( (lv_initialEnabled_4_0= 'INIT' ) ) otherlv_5= ',' ( (lv_untilEvent_6_0= ruleComplexEvent ) ) ) | ( ( (lv_fromEvent_7_0= ruleComplexEvent ) ) otherlv_8= ',' ( ( (lv_untilEvent_9_0= ruleComplexEvent ) ) | ( (lv_enabledInfite_10_0= 'INFINITE' ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_1 = input.LA(1);

                         
                        int index46_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalDependencyModelLanguage()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index46_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_2 = input.LA(1);

                         
                        int index46_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalDependencyModelLanguage()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index46_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA46_3 = input.LA(1);

                         
                        int index46_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalDependencyModelLanguage()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index46_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA46_4 = input.LA(1);

                         
                        int index46_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalDependencyModelLanguage()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index46_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA46_5 = input.LA(1);

                         
                        int index46_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalDependencyModelLanguage()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index46_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA46_6 = input.LA(1);

                         
                        int index46_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalDependencyModelLanguage()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index46_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_28s = "\17\uffff";
    static final String dfa_29s = "\2\6\6\uffff\2\6\2\uffff\1\24\1\23\1\6";
    static final String dfa_30s = "\1\77\1\135\6\uffff\1\151\1\6\2\uffff\1\143\2\135";
    static final String dfa_31s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\1\1\10\3\uffff";
    static final String dfa_32s = "\17\uffff}>";
    static final String[] dfa_33s = {
            "\1\1\25\uffff\1\5\32\uffff\1\2\1\3\1\4\3\uffff\1\6\1\uffff\1\7",
            "\1\7\14\uffff\1\10\24\uffff\1\11\2\uffff\1\13\22\uffff\1\12\33\uffff\4\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\14\4\12\37\uffff\1\12\11\uffff\2\12\55\uffff\6\12",
            "\1\15",
            "",
            "",
            "\1\16\40\uffff\1\12\14\uffff\7\12\27\uffff\4\12",
            "\1\12\24\uffff\1\11\2\uffff\1\13\22\uffff\1\12\33\uffff\4\12",
            "\1\7\14\uffff\1\10\24\uffff\1\12\25\uffff\1\12\33\uffff\4\12"
    };

    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = dfa_28;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "4300:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement )";
        }
    }
    static final String dfa_34s = "\2\uffff\1\3\2\uffff\1\3\2\uffff\1\11\1\uffff";
    static final String dfa_35s = "\1\6\1\uffff\1\16\1\uffff\1\6\1\16\1\6\1\20\1\6\1\uffff";
    static final String dfa_36s = "\1\151\1\uffff\1\143\1\uffff\1\151\1\143\1\151\1\143\1\151\1\uffff";
    static final String dfa_37s = "\1\uffff\1\1\1\uffff\1\3\5\uffff\1\2";
    static final String dfa_38s = "\12\uffff}>";
    static final String[] dfa_39s = {
            "\1\2\5\3\7\uffff\1\1\27\uffff\1\3\11\uffff\2\3\55\uffff\6\3",
            "",
            "\1\3\1\uffff\1\3\2\uffff\2\3\6\uffff\1\3\14\uffff\1\3\2\uffff\1\3\11\uffff\1\3\12\uffff\1\4\1\3\7\uffff\1\3\1\uffff\4\3\13\uffff\2\3\2\uffff\6\3",
            "",
            "\1\3\1\5\4\3\37\uffff\1\3\11\uffff\2\3\55\uffff\6\3",
            "\1\3\1\uffff\1\6\3\uffff\1\3\6\uffff\1\3\31\uffff\1\3\14\uffff\7\3\2\uffff\2\3\21\uffff\6\3",
            "\1\3\1\7\4\3\7\uffff\1\3\27\uffff\1\3\11\uffff\2\3\55\uffff\6\3",
            "\1\3\3\uffff\1\3\40\uffff\1\3\12\uffff\1\3\1\10\7\3\2\uffff\4\3\17\uffff\6\3",
            "\6\3\2\uffff\1\11\1\uffff\1\11\3\uffff\1\11\6\uffff\1\11\17\uffff\1\3\11\uffff\2\3\55\uffff\6\3",
            ""
    };
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[][] dfa_39 = unpackEncodedStringArray(dfa_39s);

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_14;
            this.eof = dfa_34;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_38;
            this.transition = dfa_39;
        }
        public String getDescription() {
            return "4522:1: (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression )";
        }
    }
    static final String dfa_40s = "\11\uffff";
    static final String dfa_41s = "\5\uffff\1\2\3\uffff";
    static final String dfa_42s = "\2\6\1\uffff\1\23\2\6\1\24\1\uffff\1\23";
    static final String dfa_43s = "\2\151\1\uffff\1\143\2\151\1\143\1\uffff\1\143";
    static final String dfa_44s = "\2\uffff\1\1\4\uffff\1\2\1\uffff";
    static final String dfa_45s = "\11\uffff}>";
    static final String[] dfa_46s = {
            "\6\2\37\uffff\1\1\12\uffff\1\2\56\uffff\5\2",
            "\1\3\5\2\37\uffff\1\2\11\uffff\2\2\55\uffff\6\2",
            "",
            "\1\4\24\uffff\1\2\2\uffff\1\2\1\5\10\uffff\1\2\12\uffff\2\2\7\uffff\1\2\1\uffff\4\2\13\uffff\2\2\2\uffff\6\2",
            "\1\2\1\6\4\2\37\uffff\1\2\11\uffff\2\2\55\uffff\6\2",
            "\6\7\2\uffff\1\2\1\uffff\1\2\3\uffff\1\2\6\uffff\1\2\17\uffff\1\7\1\2\10\uffff\1\2\1\7\3\uffff\1\2\5\uffff\2\2\11\uffff\4\2\17\uffff\6\2\1\uffff\5\7",
            "\1\10\40\uffff\1\2\14\uffff\7\2\27\uffff\4\2",
            "",
            "\1\4\24\uffff\1\2\3\uffff\1\5\10\uffff\1\2\12\uffff\2\2\7\uffff\1\2\1\uffff\4\2\13\uffff\2\2\2\uffff\6\2"
    };

    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[][] dfa_46 = unpackEncodedStringArray(dfa_46s);

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = dfa_40;
            this.eof = dfa_41;
            this.min = dfa_42;
            this.max = dfa_43;
            this.accept = dfa_44;
            this.special = dfa_45;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "5676:1: (this_Operand_0= ruleOperand | ( () otherlv_2= '(' ( ( ruleDATATYPE ) ) otherlv_4= ')' ( (lv_enclosedExpression_5_0= ruleOperand ) ) ) )";
        }
    }
    static final String dfa_47s = "\22\uffff";
    static final String dfa_48s = "\2\uffff\5\12\1\16\11\uffff\1\16";
    static final String dfa_49s = "\1\6\1\uffff\6\16\4\uffff\2\6\3\uffff\1\16";
    static final String dfa_50s = "\1\151\1\uffff\6\143\4\uffff\1\151\1\6\3\uffff\1\143";
    static final String dfa_51s = "\1\uffff\1\1\6\uffff\1\5\1\10\1\2\1\3\2\uffff\1\4\1\6\1\7\1\uffff";
    static final String dfa_52s = "\22\uffff}>";
    static final String[] dfa_53s = {
            "\1\7\1\4\1\5\1\2\1\3\1\10\37\uffff\1\1\12\uffff\1\6\56\uffff\5\11",
            "",
            "\1\12\1\uffff\1\12\3\uffff\1\12\6\uffff\1\12\20\uffff\1\12\10\uffff\1\12\4\uffff\1\12\5\uffff\2\12\7\13\2\uffff\4\12\17\uffff\6\12",
            "\1\12\1\uffff\1\12\3\uffff\1\12\6\uffff\1\12\20\uffff\1\12\10\uffff\1\12\4\uffff\1\12\5\uffff\2\12\7\13\2\uffff\4\12\17\uffff\6\12",
            "\1\12\1\uffff\1\12\3\uffff\1\12\6\uffff\1\12\20\uffff\1\12\10\uffff\1\12\4\uffff\1\12\5\uffff\2\12\7\13\2\uffff\4\12\17\uffff\6\12",
            "\1\12\1\uffff\1\12\3\uffff\1\12\6\uffff\1\12\20\uffff\1\12\10\uffff\1\12\4\uffff\1\12\5\uffff\2\12\7\13\2\uffff\4\12\17\uffff\6\12",
            "\1\12\1\uffff\1\12\3\uffff\1\12\6\uffff\1\12\20\uffff\1\12\10\uffff\1\12\4\uffff\1\12\5\uffff\2\12\7\13\2\uffff\4\12\17\uffff\6\12",
            "\1\16\1\uffff\1\16\2\uffff\2\16\6\uffff\1\16\14\uffff\1\15\2\uffff\1\17\1\16\10\uffff\1\16\4\uffff\1\16\5\uffff\2\16\7\uffff\1\14\1\uffff\4\16\13\uffff\2\16\2\uffff\6\16",
            "",
            "",
            "",
            "",
            "\1\20\136\uffff\5\16",
            "\1\21",
            "",
            "",
            "",
            "\1\16\1\uffff\1\16\2\uffff\2\16\6\uffff\1\16\14\uffff\1\15\2\uffff\1\17\1\16\10\uffff\1\16\4\uffff\1\16\5\uffff\2\16\7\uffff\1\16\1\uffff\4\16\13\uffff\2\16\2\uffff\6\16"
    };

    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[][] dfa_53 = unpackEncodedStringArray(dfa_53s);

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = dfa_47;
            this.eof = dfa_48;
            this.min = dfa_49;
            this.max = dfa_50;
            this.accept = dfa_51;
            this.special = dfa_52;
            this.transition = dfa_53;
        }
        public String getDescription() {
            return "5763:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_TimeValueExpression_4= ruleTimeValueExpression | this_ExtendedTypedNamedElementExpression_5= ruleExtendedTypedNamedElementExpression | this_MaxMessageDelayReferenceExpression_6= ruleMaxMessageDelayReferenceExpression | this_OperationCall_7= ruleOperationCall | this_TriggerMessageExpression_8= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_9= ruleNoAttributeSelectorExpression )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000005412C08002L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000020000000000L,0x0000000003300000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000D0002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000140L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0060080000000FC0L,0x000003F000000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001010000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00110A0000000040L,0x0000000003300000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001E0000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000A0000000000L,0x0000000003300000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x4000000000000000L,0x000000003C000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0060080000080FC0L,0x000003F000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800010002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000010000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000010002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000080L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000780L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00730A0000080FC0L,0x000003F003300000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000010000L,0x0000000000C00000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00040A0000000000L,0x0000000003300000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00080A0000000000L,0x0000000003300000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F8000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007803L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000010000080002L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000100000010000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0xA380000018000040L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1800000000000002L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x4000000000004000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006003L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0020000000000002L,0x0000000100000000L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x0000000E00000000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0040080000000FC0L,0x000003E000000000L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001FCL});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x4000000000000002L,0x000000003C000200L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    }


}