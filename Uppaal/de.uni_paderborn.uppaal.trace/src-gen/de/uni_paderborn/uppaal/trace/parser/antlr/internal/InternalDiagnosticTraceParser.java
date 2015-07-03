package de.uni_paderborn.uppaal.trace.parser.antlr.internal; 

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
import de.uni_paderborn.uppaal.trace.services.DiagnosticTraceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDiagnosticTraceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_EDGE", "RULE_DEPTH", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cannot reuse state space when trace length optimisation is used.'", "'Verifying'", "'property'", "'formula'", "'at line'", "'Showing counter example.'", "'Showing example trace.'", "'('", "','", "')'", "'.'", "'-'", "'['", "']'", "'State'", "':'", "'->'", "'tau'", "'Delay:'", "'Transitions:'", "'-- Property is satisfied.'", "'-- Property is NOT satisfied.'", "'-- Formula is satisfied.'", "'-- Formula is NOT satisfied.'", "'='", "'<='", "'>='", "'?'", "'!'"
    };
    public static final int RULE_DEPTH=7;
    public static final int RULE_EDGE=6;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDiagnosticTraceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDiagnosticTraceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDiagnosticTraceParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g"; }



     	private DiagnosticTraceGrammarAccess grammarAccess;
     	
        public InternalDiagnosticTraceParser(TokenStream input, DiagnosticTraceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TraceRepository";	
       	}
       	
       	@Override
       	protected DiagnosticTraceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTraceRepository"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:68:1: entryRuleTraceRepository returns [EObject current=null] : iv_ruleTraceRepository= ruleTraceRepository EOF ;
    public final EObject entryRuleTraceRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceRepository = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:69:2: (iv_ruleTraceRepository= ruleTraceRepository EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:70:2: iv_ruleTraceRepository= ruleTraceRepository EOF
            {
             newCompositeNode(grammarAccess.getTraceRepositoryRule()); 
            pushFollow(FOLLOW_ruleTraceRepository_in_entryRuleTraceRepository75);
            iv_ruleTraceRepository=ruleTraceRepository();

            state._fsp--;

             current =iv_ruleTraceRepository; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTraceRepository85); 

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
    // $ANTLR end "entryRuleTraceRepository"


    // $ANTLR start "ruleTraceRepository"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:77:1: ruleTraceRepository returns [EObject current=null] : ( (otherlv_0= 'Cannot reuse state space when trace length optimisation is used.' )? ( (lv_traces_1_0= ruleTrace ) )* ) ;
    public final EObject ruleTraceRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_traces_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:80:28: ( ( (otherlv_0= 'Cannot reuse state space when trace length optimisation is used.' )? ( (lv_traces_1_0= ruleTrace ) )* ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:81:1: ( (otherlv_0= 'Cannot reuse state space when trace length optimisation is used.' )? ( (lv_traces_1_0= ruleTrace ) )* )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:81:1: ( (otherlv_0= 'Cannot reuse state space when trace length optimisation is used.' )? ( (lv_traces_1_0= ruleTrace ) )* )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:81:2: (otherlv_0= 'Cannot reuse state space when trace length optimisation is used.' )? ( (lv_traces_1_0= ruleTrace ) )*
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:81:2: (otherlv_0= 'Cannot reuse state space when trace length optimisation is used.' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:81:4: otherlv_0= 'Cannot reuse state space when trace length optimisation is used.'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleTraceRepository123); 

                        	newLeafNode(otherlv_0, grammarAccess.getTraceRepositoryAccess().getCannotReuseStateSpaceWhenTraceLengthOptimisationIsUsedKeyword_0());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:85:3: ( (lv_traces_1_0= ruleTrace ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:86:1: (lv_traces_1_0= ruleTrace )
            	    {
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:86:1: (lv_traces_1_0= ruleTrace )
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:87:3: lv_traces_1_0= ruleTrace
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTraceRepositoryAccess().getTracesTraceParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTrace_in_ruleTraceRepository146);
            	    lv_traces_1_0=ruleTrace();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTraceRepositoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"traces",
            	            		lv_traces_1_0, 
            	            		"Trace");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraceRepository"


    // $ANTLR start "entryRuleTrace"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:111:1: entryRuleTrace returns [EObject current=null] : iv_ruleTrace= ruleTrace EOF ;
    public final EObject entryRuleTrace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrace = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:112:2: (iv_ruleTrace= ruleTrace EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:113:2: iv_ruleTrace= ruleTrace EOF
            {
             newCompositeNode(grammarAccess.getTraceRule()); 
            pushFollow(FOLLOW_ruleTrace_in_entryRuleTrace183);
            iv_ruleTrace=ruleTrace();

            state._fsp--;

             current =iv_ruleTrace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrace193); 

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
    // $ANTLR end "entryRuleTrace"


    // $ANTLR start "ruleTrace"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:120:1: ruleTrace returns [EObject current=null] : (otherlv_0= 'Verifying' (otherlv_1= 'property' | otherlv_2= 'formula' ) ( (lv_property_3_0= RULE_INT ) ) otherlv_4= 'at line' ( (lv_line_5_0= RULE_INT ) ) ( (lv_result_6_0= ruleResult ) ) ( (otherlv_7= 'Showing counter example.' | otherlv_8= 'Showing example trace.' ) ( (lv_traceItems_9_0= ruleTraceItem ) )+ )? ) ;
    public final EObject ruleTrace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_property_3_0=null;
        Token otherlv_4=null;
        Token lv_line_5_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_result_6_0 = null;

        EObject lv_traceItems_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:123:28: ( (otherlv_0= 'Verifying' (otherlv_1= 'property' | otherlv_2= 'formula' ) ( (lv_property_3_0= RULE_INT ) ) otherlv_4= 'at line' ( (lv_line_5_0= RULE_INT ) ) ( (lv_result_6_0= ruleResult ) ) ( (otherlv_7= 'Showing counter example.' | otherlv_8= 'Showing example trace.' ) ( (lv_traceItems_9_0= ruleTraceItem ) )+ )? ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:124:1: (otherlv_0= 'Verifying' (otherlv_1= 'property' | otherlv_2= 'formula' ) ( (lv_property_3_0= RULE_INT ) ) otherlv_4= 'at line' ( (lv_line_5_0= RULE_INT ) ) ( (lv_result_6_0= ruleResult ) ) ( (otherlv_7= 'Showing counter example.' | otherlv_8= 'Showing example trace.' ) ( (lv_traceItems_9_0= ruleTraceItem ) )+ )? )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:124:1: (otherlv_0= 'Verifying' (otherlv_1= 'property' | otherlv_2= 'formula' ) ( (lv_property_3_0= RULE_INT ) ) otherlv_4= 'at line' ( (lv_line_5_0= RULE_INT ) ) ( (lv_result_6_0= ruleResult ) ) ( (otherlv_7= 'Showing counter example.' | otherlv_8= 'Showing example trace.' ) ( (lv_traceItems_9_0= ruleTraceItem ) )+ )? )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:124:3: otherlv_0= 'Verifying' (otherlv_1= 'property' | otherlv_2= 'formula' ) ( (lv_property_3_0= RULE_INT ) ) otherlv_4= 'at line' ( (lv_line_5_0= RULE_INT ) ) ( (lv_result_6_0= ruleResult ) ) ( (otherlv_7= 'Showing counter example.' | otherlv_8= 'Showing example trace.' ) ( (lv_traceItems_9_0= ruleTraceItem ) )+ )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleTrace230); 

                	newLeafNode(otherlv_0, grammarAccess.getTraceAccess().getVerifyingKeyword_0());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:128:1: (otherlv_1= 'property' | otherlv_2= 'formula' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:128:3: otherlv_1= 'property'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleTrace243); 

                        	newLeafNode(otherlv_1, grammarAccess.getTraceAccess().getPropertyKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:133:7: otherlv_2= 'formula'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleTrace261); 

                        	newLeafNode(otherlv_2, grammarAccess.getTraceAccess().getFormulaKeyword_1_1());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:137:2: ( (lv_property_3_0= RULE_INT ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:138:1: (lv_property_3_0= RULE_INT )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:138:1: (lv_property_3_0= RULE_INT )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:139:3: lv_property_3_0= RULE_INT
            {
            lv_property_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTrace279); 

            			newLeafNode(lv_property_3_0, grammarAccess.getTraceAccess().getPropertyINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTraceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"property",
                    		lv_property_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleTrace296); 

                	newLeafNode(otherlv_4, grammarAccess.getTraceAccess().getAtLineKeyword_3());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:159:1: ( (lv_line_5_0= RULE_INT ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:160:1: (lv_line_5_0= RULE_INT )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:160:1: (lv_line_5_0= RULE_INT )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:161:3: lv_line_5_0= RULE_INT
            {
            lv_line_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTrace313); 

            			newLeafNode(lv_line_5_0, grammarAccess.getTraceAccess().getLineINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTraceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"line",
                    		lv_line_5_0, 
                    		"INT");
            	    

            }


            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:177:2: ( (lv_result_6_0= ruleResult ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:178:1: (lv_result_6_0= ruleResult )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:178:1: (lv_result_6_0= ruleResult )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:179:3: lv_result_6_0= ruleResult
            {
             
            	        newCompositeNode(grammarAccess.getTraceAccess().getResultResultEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleResult_in_ruleTrace339);
            lv_result_6_0=ruleResult();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTraceRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_6_0, 
                    		"Result");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:195:2: ( (otherlv_7= 'Showing counter example.' | otherlv_8= 'Showing example trace.' ) ( (lv_traceItems_9_0= ruleTraceItem ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=18 && LA6_0<=19)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:195:3: (otherlv_7= 'Showing counter example.' | otherlv_8= 'Showing example trace.' ) ( (lv_traceItems_9_0= ruleTraceItem ) )+
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:195:3: (otherlv_7= 'Showing counter example.' | otherlv_8= 'Showing example trace.' )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==18) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==19) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:195:5: otherlv_7= 'Showing counter example.'
                            {
                            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleTrace353); 

                                	newLeafNode(otherlv_7, grammarAccess.getTraceAccess().getShowingCounterExampleKeyword_6_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:200:7: otherlv_8= 'Showing example trace.'
                            {
                            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleTrace371); 

                                	newLeafNode(otherlv_8, grammarAccess.getTraceAccess().getShowingExampleTraceKeyword_6_0_1());
                                

                            }
                            break;

                    }

                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:204:2: ( (lv_traceItems_9_0= ruleTraceItem ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==27||(LA5_0>=31 && LA5_0<=32)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:205:1: (lv_traceItems_9_0= ruleTraceItem )
                    	    {
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:205:1: (lv_traceItems_9_0= ruleTraceItem )
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:206:3: lv_traceItems_9_0= ruleTraceItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTraceAccess().getTraceItemsTraceItemParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTraceItem_in_ruleTrace393);
                    	    lv_traceItems_9_0=ruleTraceItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTraceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"traceItems",
                    	            		lv_traceItems_9_0, 
                    	            		"TraceItem");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrace"


    // $ANTLR start "entryRuleProcessIdentifier"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:230:1: entryRuleProcessIdentifier returns [EObject current=null] : iv_ruleProcessIdentifier= ruleProcessIdentifier EOF ;
    public final EObject entryRuleProcessIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessIdentifier = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:231:2: (iv_ruleProcessIdentifier= ruleProcessIdentifier EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:232:2: iv_ruleProcessIdentifier= ruleProcessIdentifier EOF
            {
             newCompositeNode(grammarAccess.getProcessIdentifierRule()); 
            pushFollow(FOLLOW_ruleProcessIdentifier_in_entryRuleProcessIdentifier432);
            iv_ruleProcessIdentifier=ruleProcessIdentifier();

            state._fsp--;

             current =iv_ruleProcessIdentifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessIdentifier442); 

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
    // $ANTLR end "entryRuleProcessIdentifier"


    // $ANTLR start "ruleProcessIdentifier"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:239:1: ruleProcessIdentifier returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleProcessIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_arguments_2_0=null;
        Token otherlv_3=null;
        Token lv_arguments_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:242:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')' )? ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:243:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')' )? )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:243:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')' )? )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:243:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')' )?
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:243:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:244:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:244:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:245:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessIdentifierRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessIdentifier487); 

            		newLeafNode(otherlv_0, grammarAccess.getProcessIdentifierAccess().getTemplateAbstractTemplateCrossReference_0_0()); 
            	

            }


            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:256:2: (otherlv_1= '(' ( (lv_arguments_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:256:4: otherlv_1= '(' ( (lv_arguments_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleProcessIdentifier500); 

                        	newLeafNode(otherlv_1, grammarAccess.getProcessIdentifierAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:260:1: ( (lv_arguments_2_0= RULE_INT ) )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:261:1: (lv_arguments_2_0= RULE_INT )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:261:1: (lv_arguments_2_0= RULE_INT )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:262:3: lv_arguments_2_0= RULE_INT
                    {
                    lv_arguments_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProcessIdentifier517); 

                    			newLeafNode(lv_arguments_2_0, grammarAccess.getProcessIdentifierAccess().getArgumentsINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProcessIdentifierRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"arguments",
                            		lv_arguments_2_0, 
                            		"INT");
                    	    

                    }


                    }

                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:278:2: (otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:278:4: otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleProcessIdentifier535); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getProcessIdentifierAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:282:1: ( (lv_arguments_4_0= RULE_INT ) )
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:283:1: (lv_arguments_4_0= RULE_INT )
                    	    {
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:283:1: (lv_arguments_4_0= RULE_INT )
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:284:3: lv_arguments_4_0= RULE_INT
                    	    {
                    	    lv_arguments_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProcessIdentifier552); 

                    	    			newLeafNode(lv_arguments_4_0, grammarAccess.getProcessIdentifierAccess().getArgumentsINTTerminalRuleCall_1_2_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getProcessIdentifierRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_4_0, 
                    	            		"INT");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleProcessIdentifier571); 

                        	newLeafNode(otherlv_5, grammarAccess.getProcessIdentifierAccess().getRightParenthesisKeyword_1_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessIdentifier"


    // $ANTLR start "entryRuleLocationActivity"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:312:1: entryRuleLocationActivity returns [EObject current=null] : iv_ruleLocationActivity= ruleLocationActivity EOF ;
    public final EObject entryRuleLocationActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationActivity = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:313:2: (iv_ruleLocationActivity= ruleLocationActivity EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:314:2: iv_ruleLocationActivity= ruleLocationActivity EOF
            {
             newCompositeNode(grammarAccess.getLocationActivityRule()); 
            pushFollow(FOLLOW_ruleLocationActivity_in_entryRuleLocationActivity609);
            iv_ruleLocationActivity=ruleLocationActivity();

            state._fsp--;

             current =iv_ruleLocationActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocationActivity619); 

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
    // $ANTLR end "entryRuleLocationActivity"


    // $ANTLR start "ruleLocationActivity"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:321:1: ruleLocationActivity returns [EObject current=null] : ( ( (lv_process_0_0= ruleProcessIdentifier ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleLocationActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_process_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:324:28: ( ( ( (lv_process_0_0= ruleProcessIdentifier ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:325:1: ( ( (lv_process_0_0= ruleProcessIdentifier ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:325:1: ( ( (lv_process_0_0= ruleProcessIdentifier ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:325:2: ( (lv_process_0_0= ruleProcessIdentifier ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:325:2: ( (lv_process_0_0= ruleProcessIdentifier ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:326:1: (lv_process_0_0= ruleProcessIdentifier )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:326:1: (lv_process_0_0= ruleProcessIdentifier )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:327:3: lv_process_0_0= ruleProcessIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getLocationActivityAccess().getProcessProcessIdentifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleProcessIdentifier_in_ruleLocationActivity665);
            lv_process_0_0=ruleProcessIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocationActivityRule());
            	        }
                   		set(
                   			current, 
                   			"process",
                    		lv_process_0_0, 
                    		"ProcessIdentifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleLocationActivity677); 

                	newLeafNode(otherlv_1, grammarAccess.getLocationActivityAccess().getFullStopKeyword_1());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:347:1: ( (otherlv_2= RULE_ID ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:348:1: (otherlv_2= RULE_ID )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:348:1: (otherlv_2= RULE_ID )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:349:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLocationActivityRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocationActivity697); 

            		newLeafNode(otherlv_2, grammarAccess.getLocationActivityAccess().getLocationLocationCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocationActivity"


    // $ANTLR start "entryRuleVariableValue"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:368:1: entryRuleVariableValue returns [EObject current=null] : iv_ruleVariableValue= ruleVariableValue EOF ;
    public final EObject entryRuleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:369:2: (iv_ruleVariableValue= ruleVariableValue EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:370:2: iv_ruleVariableValue= ruleVariableValue EOF
            {
             newCompositeNode(grammarAccess.getVariableValueRule()); 
            pushFollow(FOLLOW_ruleVariableValue_in_entryRuleVariableValue733);
            iv_ruleVariableValue=ruleVariableValue();

            state._fsp--;

             current =iv_ruleVariableValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableValue743); 

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
    // $ANTLR end "entryRuleVariableValue"


    // $ANTLR start "ruleVariableValue"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:377:1: ruleVariableValue returns [EObject current=null] : ( ( (lv_firstNamedElementReference_0_0= ruleNamedElementReference ) ) (otherlv_1= '-' ( (lv_secondNamedElementReference_2_0= ruleNamedElementReference ) ) )? ( (lv_operator_3_0= ruleCompareOperator ) ) ( (lv_value_4_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_4_0=null;
        EObject lv_firstNamedElementReference_0_0 = null;

        EObject lv_secondNamedElementReference_2_0 = null;

        Enumerator lv_operator_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:380:28: ( ( ( (lv_firstNamedElementReference_0_0= ruleNamedElementReference ) ) (otherlv_1= '-' ( (lv_secondNamedElementReference_2_0= ruleNamedElementReference ) ) )? ( (lv_operator_3_0= ruleCompareOperator ) ) ( (lv_value_4_0= RULE_INT ) ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:381:1: ( ( (lv_firstNamedElementReference_0_0= ruleNamedElementReference ) ) (otherlv_1= '-' ( (lv_secondNamedElementReference_2_0= ruleNamedElementReference ) ) )? ( (lv_operator_3_0= ruleCompareOperator ) ) ( (lv_value_4_0= RULE_INT ) ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:381:1: ( ( (lv_firstNamedElementReference_0_0= ruleNamedElementReference ) ) (otherlv_1= '-' ( (lv_secondNamedElementReference_2_0= ruleNamedElementReference ) ) )? ( (lv_operator_3_0= ruleCompareOperator ) ) ( (lv_value_4_0= RULE_INT ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:381:2: ( (lv_firstNamedElementReference_0_0= ruleNamedElementReference ) ) (otherlv_1= '-' ( (lv_secondNamedElementReference_2_0= ruleNamedElementReference ) ) )? ( (lv_operator_3_0= ruleCompareOperator ) ) ( (lv_value_4_0= RULE_INT ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:381:2: ( (lv_firstNamedElementReference_0_0= ruleNamedElementReference ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:382:1: (lv_firstNamedElementReference_0_0= ruleNamedElementReference )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:382:1: (lv_firstNamedElementReference_0_0= ruleNamedElementReference )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:383:3: lv_firstNamedElementReference_0_0= ruleNamedElementReference
            {
             
            	        newCompositeNode(grammarAccess.getVariableValueAccess().getFirstNamedElementReferenceNamedElementReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNamedElementReference_in_ruleVariableValue789);
            lv_firstNamedElementReference_0_0=ruleNamedElementReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableValueRule());
            	        }
                   		set(
                   			current, 
                   			"firstNamedElementReference",
                    		lv_firstNamedElementReference_0_0, 
                    		"NamedElementReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:399:2: (otherlv_1= '-' ( (lv_secondNamedElementReference_2_0= ruleNamedElementReference ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:399:4: otherlv_1= '-' ( (lv_secondNamedElementReference_2_0= ruleNamedElementReference ) )
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleVariableValue802); 

                        	newLeafNode(otherlv_1, grammarAccess.getVariableValueAccess().getHyphenMinusKeyword_1_0());
                        
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:403:1: ( (lv_secondNamedElementReference_2_0= ruleNamedElementReference ) )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:404:1: (lv_secondNamedElementReference_2_0= ruleNamedElementReference )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:404:1: (lv_secondNamedElementReference_2_0= ruleNamedElementReference )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:405:3: lv_secondNamedElementReference_2_0= ruleNamedElementReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableValueAccess().getSecondNamedElementReferenceNamedElementReferenceParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNamedElementReference_in_ruleVariableValue823);
                    lv_secondNamedElementReference_2_0=ruleNamedElementReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableValueRule());
                    	        }
                           		set(
                           			current, 
                           			"secondNamedElementReference",
                            		lv_secondNamedElementReference_2_0, 
                            		"NamedElementReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:421:4: ( (lv_operator_3_0= ruleCompareOperator ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:422:1: (lv_operator_3_0= ruleCompareOperator )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:422:1: (lv_operator_3_0= ruleCompareOperator )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:423:3: lv_operator_3_0= ruleCompareOperator
            {
             
            	        newCompositeNode(grammarAccess.getVariableValueAccess().getOperatorCompareOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCompareOperator_in_ruleVariableValue846);
            lv_operator_3_0=ruleCompareOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableValueRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_3_0, 
                    		"CompareOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:439:2: ( (lv_value_4_0= RULE_INT ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:440:1: (lv_value_4_0= RULE_INT )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:440:1: (lv_value_4_0= RULE_INT )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:441:3: lv_value_4_0= RULE_INT
            {
            lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVariableValue863); 

            			newLeafNode(lv_value_4_0, grammarAccess.getVariableValueAccess().getValueINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableValue"


    // $ANTLR start "entryRuleSingleNamedElementReference"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:465:1: entryRuleSingleNamedElementReference returns [EObject current=null] : iv_ruleSingleNamedElementReference= ruleSingleNamedElementReference EOF ;
    public final EObject entryRuleSingleNamedElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleNamedElementReference = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:466:2: (iv_ruleSingleNamedElementReference= ruleSingleNamedElementReference EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:467:2: iv_ruleSingleNamedElementReference= ruleSingleNamedElementReference EOF
            {
             newCompositeNode(grammarAccess.getSingleNamedElementReferenceRule()); 
            pushFollow(FOLLOW_ruleSingleNamedElementReference_in_entryRuleSingleNamedElementReference904);
            iv_ruleSingleNamedElementReference=ruleSingleNamedElementReference();

            state._fsp--;

             current =iv_ruleSingleNamedElementReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleNamedElementReference914); 

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
    // $ANTLR end "entryRuleSingleNamedElementReference"


    // $ANTLR start "ruleSingleNamedElementReference"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:474:1: ruleSingleNamedElementReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= RULE_INT ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleSingleNamedElementReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_indexes_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:477:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= RULE_INT ) ) otherlv_3= ']' )* ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:478:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= RULE_INT ) ) otherlv_3= ']' )* )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:478:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= RULE_INT ) ) otherlv_3= ']' )* )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:478:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= RULE_INT ) ) otherlv_3= ']' )*
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:478:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:479:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:479:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:480:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleNamedElementReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleNamedElementReference959); 

            		newLeafNode(otherlv_0, grammarAccess.getSingleNamedElementReferenceAccess().getNamedElementNamedElementCrossReference_0_0()); 
            	

            }


            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:491:2: (otherlv_1= '[' ( (lv_indexes_2_0= RULE_INT ) ) otherlv_3= ']' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:491:4: otherlv_1= '[' ( (lv_indexes_2_0= RULE_INT ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleSingleNamedElementReference972); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSingleNamedElementReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	        
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:495:1: ( (lv_indexes_2_0= RULE_INT ) )
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:496:1: (lv_indexes_2_0= RULE_INT )
            	    {
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:496:1: (lv_indexes_2_0= RULE_INT )
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:497:3: lv_indexes_2_0= RULE_INT
            	    {
            	    lv_indexes_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSingleNamedElementReference989); 

            	    			newLeafNode(lv_indexes_2_0, grammarAccess.getSingleNamedElementReferenceAccess().getIndexesINTTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSingleNamedElementReferenceRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"indexes",
            	            		lv_indexes_2_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleSingleNamedElementReference1006); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSingleNamedElementReferenceAccess().getRightSquareBracketKeyword_1_2());
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleNamedElementReference"


    // $ANTLR start "entryRuleNamedElementReference"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:525:1: entryRuleNamedElementReference returns [EObject current=null] : iv_ruleNamedElementReference= ruleNamedElementReference EOF ;
    public final EObject entryRuleNamedElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedElementReference = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:526:2: (iv_ruleNamedElementReference= ruleNamedElementReference EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:527:2: iv_ruleNamedElementReference= ruleNamedElementReference EOF
            {
             newCompositeNode(grammarAccess.getNamedElementReferenceRule()); 
            pushFollow(FOLLOW_ruleNamedElementReference_in_entryRuleNamedElementReference1044);
            iv_ruleNamedElementReference=ruleNamedElementReference();

            state._fsp--;

             current =iv_ruleNamedElementReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedElementReference1054); 

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
    // $ANTLR end "entryRuleNamedElementReference"


    // $ANTLR start "ruleNamedElementReference"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:534:1: ruleNamedElementReference returns [EObject current=null] : ( ( (lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference ) ) (otherlv_1= '.' ( (lv_namedElementReference_2_0= ruleNamedElementReference ) ) )? ) ;
    public final EObject ruleNamedElementReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_singleNamedElementReference_0_0 = null;

        EObject lv_namedElementReference_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:537:28: ( ( ( (lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference ) ) (otherlv_1= '.' ( (lv_namedElementReference_2_0= ruleNamedElementReference ) ) )? ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:538:1: ( ( (lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference ) ) (otherlv_1= '.' ( (lv_namedElementReference_2_0= ruleNamedElementReference ) ) )? )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:538:1: ( ( (lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference ) ) (otherlv_1= '.' ( (lv_namedElementReference_2_0= ruleNamedElementReference ) ) )? )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:538:2: ( (lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference ) ) (otherlv_1= '.' ( (lv_namedElementReference_2_0= ruleNamedElementReference ) ) )?
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:538:2: ( (lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:539:1: (lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:539:1: (lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:540:3: lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference
            {
             
            	        newCompositeNode(grammarAccess.getNamedElementReferenceAccess().getSingleNamedElementReferenceSingleNamedElementReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSingleNamedElementReference_in_ruleNamedElementReference1100);
            lv_singleNamedElementReference_0_0=ruleSingleNamedElementReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamedElementReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"singleNamedElementReference",
                    		lv_singleNamedElementReference_0_0, 
                    		"SingleNamedElementReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:556:2: (otherlv_1= '.' ( (lv_namedElementReference_2_0= ruleNamedElementReference ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:556:4: otherlv_1= '.' ( (lv_namedElementReference_2_0= ruleNamedElementReference ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleNamedElementReference1113); 

                        	newLeafNode(otherlv_1, grammarAccess.getNamedElementReferenceAccess().getFullStopKeyword_1_0());
                        
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:560:1: ( (lv_namedElementReference_2_0= ruleNamedElementReference ) )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:561:1: (lv_namedElementReference_2_0= ruleNamedElementReference )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:561:1: (lv_namedElementReference_2_0= ruleNamedElementReference )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:562:3: lv_namedElementReference_2_0= ruleNamedElementReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getNamedElementReferenceAccess().getNamedElementReferenceNamedElementReferenceParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNamedElementReference_in_ruleNamedElementReference1134);
                    lv_namedElementReference_2_0=ruleNamedElementReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNamedElementReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"namedElementReference",
                            		lv_namedElementReference_2_0, 
                            		"NamedElementReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedElementReference"


    // $ANTLR start "entryRuleTraceItem"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:586:1: entryRuleTraceItem returns [EObject current=null] : iv_ruleTraceItem= ruleTraceItem EOF ;
    public final EObject entryRuleTraceItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceItem = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:587:2: (iv_ruleTraceItem= ruleTraceItem EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:588:2: iv_ruleTraceItem= ruleTraceItem EOF
            {
             newCompositeNode(grammarAccess.getTraceItemRule()); 
            pushFollow(FOLLOW_ruleTraceItem_in_entryRuleTraceItem1172);
            iv_ruleTraceItem=ruleTraceItem();

            state._fsp--;

             current =iv_ruleTraceItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTraceItem1182); 

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
    // $ANTLR end "entryRuleTraceItem"


    // $ANTLR start "ruleTraceItem"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:595:1: ruleTraceItem returns [EObject current=null] : (this_State_0= ruleState | this_Transition_1= ruleTransition ) ;
    public final EObject ruleTraceItem() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_Transition_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:598:28: ( (this_State_0= ruleState | this_Transition_1= ruleTransition ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:599:1: (this_State_0= ruleState | this_Transition_1= ruleTransition )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:599:1: (this_State_0= ruleState | this_Transition_1= ruleTransition )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=31 && LA12_0<=32)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:600:5: this_State_0= ruleState
                    {
                     
                            newCompositeNode(grammarAccess.getTraceItemAccess().getStateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleState_in_ruleTraceItem1229);
                    this_State_0=ruleState();

                    state._fsp--;

                     
                            current = this_State_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:610:5: this_Transition_1= ruleTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTraceItemAccess().getTransitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTransition_in_ruleTraceItem1256);
                    this_Transition_1=ruleTransition();

                    state._fsp--;

                     
                            current = this_Transition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraceItem"


    // $ANTLR start "entryRuleState"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:626:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_DEPTH");
        	
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:630:2: (iv_ruleState= ruleState EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:631:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState1297);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState1307); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:641:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' (otherlv_1= ':' )? otherlv_2= '(' ( (lv_locationActivities_3_0= ruleLocationActivity ) )+ otherlv_4= ')' ( ( (lv_variableValues_5_0= ruleVariableValue ) ) ( (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) ) )* )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_locationActivities_3_0 = null;

        EObject lv_variableValues_5_0 = null;

        EObject lv_variableValues_7_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_DEPTH");
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:645:28: ( (otherlv_0= 'State' (otherlv_1= ':' )? otherlv_2= '(' ( (lv_locationActivities_3_0= ruleLocationActivity ) )+ otherlv_4= ')' ( ( (lv_variableValues_5_0= ruleVariableValue ) ) ( (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) ) )* )? ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:646:1: (otherlv_0= 'State' (otherlv_1= ':' )? otherlv_2= '(' ( (lv_locationActivities_3_0= ruleLocationActivity ) )+ otherlv_4= ')' ( ( (lv_variableValues_5_0= ruleVariableValue ) ) ( (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) ) )* )? )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:646:1: (otherlv_0= 'State' (otherlv_1= ':' )? otherlv_2= '(' ( (lv_locationActivities_3_0= ruleLocationActivity ) )+ otherlv_4= ')' ( ( (lv_variableValues_5_0= ruleVariableValue ) ) ( (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) ) )* )? )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:646:3: otherlv_0= 'State' (otherlv_1= ':' )? otherlv_2= '(' ( (lv_locationActivities_3_0= ruleLocationActivity ) )+ otherlv_4= ')' ( ( (lv_variableValues_5_0= ruleVariableValue ) ) ( (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) ) )* )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleState1348); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:650:1: (otherlv_1= ':' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:650:3: otherlv_1= ':'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleState1361); 

                        	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getColonKeyword_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleState1375); 

                	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftParenthesisKeyword_2());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:658:1: ( (lv_locationActivities_3_0= ruleLocationActivity ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:659:1: (lv_locationActivities_3_0= ruleLocationActivity )
            	    {
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:659:1: (lv_locationActivities_3_0= ruleLocationActivity )
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:660:3: lv_locationActivities_3_0= ruleLocationActivity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getLocationActivitiesLocationActivityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLocationActivity_in_ruleState1396);
            	    lv_locationActivities_3_0=ruleLocationActivity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"locationActivities",
            	            		lv_locationActivities_3_0, 
            	            		"LocationActivity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleState1409); 

                	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getRightParenthesisKeyword_4());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:680:1: ( ( (lv_variableValues_5_0= ruleVariableValue ) ) ( (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:680:2: ( (lv_variableValues_5_0= ruleVariableValue ) ) ( (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) ) )*
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:680:2: ( (lv_variableValues_5_0= ruleVariableValue ) )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:681:1: (lv_variableValues_5_0= ruleVariableValue )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:681:1: (lv_variableValues_5_0= ruleVariableValue )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:682:3: lv_variableValues_5_0= ruleVariableValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getVariableValuesVariableValueParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableValue_in_ruleState1431);
                    lv_variableValues_5_0=ruleVariableValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		add(
                           			current, 
                           			"variableValues",
                            		lv_variableValues_5_0, 
                            		"VariableValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:698:2: ( (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID||LA16_0==21) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:698:3: (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) )
                    	    {
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:698:3: (otherlv_6= ',' )?
                    	    int alt15=2;
                    	    int LA15_0 = input.LA(1);

                    	    if ( (LA15_0==21) ) {
                    	        alt15=1;
                    	    }
                    	    switch (alt15) {
                    	        case 1 :
                    	            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:698:5: otherlv_6= ','
                    	            {
                    	            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleState1445); 

                    	                	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getCommaKeyword_5_1_0());
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:702:3: ( (lv_variableValues_7_0= ruleVariableValue ) )
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:703:1: (lv_variableValues_7_0= ruleVariableValue )
                    	    {
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:703:1: (lv_variableValues_7_0= ruleVariableValue )
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:704:3: lv_variableValues_7_0= ruleVariableValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getVariableValuesVariableValueParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVariableValue_in_ruleState1468);
                    	    lv_variableValues_7_0=ruleVariableValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variableValues",
                    	            		lv_variableValues_7_0, 
                    	            		"VariableValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEdgeActivity"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:731:1: entryRuleEdgeActivity returns [EObject current=null] : iv_ruleEdgeActivity= ruleEdgeActivity EOF ;
    public final EObject entryRuleEdgeActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeActivity = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:732:2: (iv_ruleEdgeActivity= ruleEdgeActivity EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:733:2: iv_ruleEdgeActivity= ruleEdgeActivity EOF
            {
             newCompositeNode(grammarAccess.getEdgeActivityRule()); 
            pushFollow(FOLLOW_ruleEdgeActivity_in_entryRuleEdgeActivity1512);
            iv_ruleEdgeActivity=ruleEdgeActivity();

            state._fsp--;

             current =iv_ruleEdgeActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeActivity1522); 

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
    // $ANTLR end "entryRuleEdgeActivity"


    // $ANTLR start "ruleEdgeActivity"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:740:1: ruleEdgeActivity returns [EObject current=null] : ( ( (lv_source_0_0= ruleLocationActivity ) ) otherlv_1= '->' ( (lv_target_2_0= ruleLocationActivity ) ) ( (lv_details_3_0= RULE_EDGE ) ) ) ;
    public final EObject ruleEdgeActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_details_3_0=null;
        EObject lv_source_0_0 = null;

        EObject lv_target_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:743:28: ( ( ( (lv_source_0_0= ruleLocationActivity ) ) otherlv_1= '->' ( (lv_target_2_0= ruleLocationActivity ) ) ( (lv_details_3_0= RULE_EDGE ) ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:744:1: ( ( (lv_source_0_0= ruleLocationActivity ) ) otherlv_1= '->' ( (lv_target_2_0= ruleLocationActivity ) ) ( (lv_details_3_0= RULE_EDGE ) ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:744:1: ( ( (lv_source_0_0= ruleLocationActivity ) ) otherlv_1= '->' ( (lv_target_2_0= ruleLocationActivity ) ) ( (lv_details_3_0= RULE_EDGE ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:744:2: ( (lv_source_0_0= ruleLocationActivity ) ) otherlv_1= '->' ( (lv_target_2_0= ruleLocationActivity ) ) ( (lv_details_3_0= RULE_EDGE ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:744:2: ( (lv_source_0_0= ruleLocationActivity ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:745:1: (lv_source_0_0= ruleLocationActivity )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:745:1: (lv_source_0_0= ruleLocationActivity )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:746:3: lv_source_0_0= ruleLocationActivity
            {
             
            	        newCompositeNode(grammarAccess.getEdgeActivityAccess().getSourceLocationActivityParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLocationActivity_in_ruleEdgeActivity1568);
            lv_source_0_0=ruleLocationActivity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEdgeActivityRule());
            	        }
                   		set(
                   			current, 
                   			"source",
                    		lv_source_0_0, 
                    		"LocationActivity");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleEdgeActivity1580); 

                	newLeafNode(otherlv_1, grammarAccess.getEdgeActivityAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:766:1: ( (lv_target_2_0= ruleLocationActivity ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:767:1: (lv_target_2_0= ruleLocationActivity )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:767:1: (lv_target_2_0= ruleLocationActivity )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:768:3: lv_target_2_0= ruleLocationActivity
            {
             
            	        newCompositeNode(grammarAccess.getEdgeActivityAccess().getTargetLocationActivityParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLocationActivity_in_ruleEdgeActivity1601);
            lv_target_2_0=ruleLocationActivity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEdgeActivityRule());
            	        }
                   		set(
                   			current, 
                   			"target",
                    		lv_target_2_0, 
                    		"LocationActivity");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:784:2: ( (lv_details_3_0= RULE_EDGE ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:785:1: (lv_details_3_0= RULE_EDGE )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:785:1: (lv_details_3_0= RULE_EDGE )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:786:3: lv_details_3_0= RULE_EDGE
            {
            lv_details_3_0=(Token)match(input,RULE_EDGE,FOLLOW_RULE_EDGE_in_ruleEdgeActivity1618); 

            			newLeafNode(lv_details_3_0, grammarAccess.getEdgeActivityAccess().getDetailsEDGETerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEdgeActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"details",
                    		lv_details_3_0, 
                    		"EDGE");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdgeActivity"


    // $ANTLR start "entryRuleChannelSynchronization"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:812:1: entryRuleChannelSynchronization returns [EObject current=null] : iv_ruleChannelSynchronization= ruleChannelSynchronization EOF ;
    public final EObject entryRuleChannelSynchronization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelSynchronization = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:813:2: (iv_ruleChannelSynchronization= ruleChannelSynchronization EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:814:2: iv_ruleChannelSynchronization= ruleChannelSynchronization EOF
            {
             newCompositeNode(grammarAccess.getChannelSynchronizationRule()); 
            pushFollow(FOLLOW_ruleChannelSynchronization_in_entryRuleChannelSynchronization1661);
            iv_ruleChannelSynchronization=ruleChannelSynchronization();

            state._fsp--;

             current =iv_ruleChannelSynchronization; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChannelSynchronization1671); 

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
    // $ANTLR end "entryRuleChannelSynchronization"


    // $ANTLR start "ruleChannelSynchronization"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:821:1: ruleChannelSynchronization returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_kind_1_0= ruleSynchronizationKind ) ) ) ;
    public final EObject ruleChannelSynchronization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_kind_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:824:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_kind_1_0= ruleSynchronizationKind ) ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:825:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_kind_1_0= ruleSynchronizationKind ) ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:825:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_kind_1_0= ruleSynchronizationKind ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:825:2: ( (otherlv_0= RULE_ID ) ) ( (lv_kind_1_0= ruleSynchronizationKind ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:825:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:826:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:826:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:827:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChannelSynchronizationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChannelSynchronization1716); 

            		newLeafNode(otherlv_0, grammarAccess.getChannelSynchronizationAccess().getChannelVariableCrossReference_0_0()); 
            	

            }


            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:838:2: ( (lv_kind_1_0= ruleSynchronizationKind ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:839:1: (lv_kind_1_0= ruleSynchronizationKind )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:839:1: (lv_kind_1_0= ruleSynchronizationKind )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:840:3: lv_kind_1_0= ruleSynchronizationKind
            {
             
            	        newCompositeNode(grammarAccess.getChannelSynchronizationAccess().getKindSynchronizationKindEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSynchronizationKind_in_ruleChannelSynchronization1737);
            lv_kind_1_0=ruleSynchronizationKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChannelSynchronizationRule());
            	        }
                   		set(
                   			current, 
                   			"kind",
                    		lv_kind_1_0, 
                    		"SynchronizationKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChannelSynchronization"


    // $ANTLR start "entryRuleTauSynchronization"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:864:1: entryRuleTauSynchronization returns [String current=null] : iv_ruleTauSynchronization= ruleTauSynchronization EOF ;
    public final String entryRuleTauSynchronization() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTauSynchronization = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:865:2: (iv_ruleTauSynchronization= ruleTauSynchronization EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:866:2: iv_ruleTauSynchronization= ruleTauSynchronization EOF
            {
             newCompositeNode(grammarAccess.getTauSynchronizationRule()); 
            pushFollow(FOLLOW_ruleTauSynchronization_in_entryRuleTauSynchronization1774);
            iv_ruleTauSynchronization=ruleTauSynchronization();

            state._fsp--;

             current =iv_ruleTauSynchronization.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTauSynchronization1785); 

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
    // $ANTLR end "entryRuleTauSynchronization"


    // $ANTLR start "ruleTauSynchronization"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:873:1: ruleTauSynchronization returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'tau' ;
    public final AntlrDatatypeRuleToken ruleTauSynchronization() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:876:28: (kw= 'tau' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:878:2: kw= 'tau'
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleTauSynchronization1822); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTauSynchronizationAccess().getTauKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTauSynchronization"


    // $ANTLR start "entryRuleDelayTransition"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:891:1: entryRuleDelayTransition returns [EObject current=null] : iv_ruleDelayTransition= ruleDelayTransition EOF ;
    public final EObject entryRuleDelayTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayTransition = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:892:2: (iv_ruleDelayTransition= ruleDelayTransition EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:893:2: iv_ruleDelayTransition= ruleDelayTransition EOF
            {
             newCompositeNode(grammarAccess.getDelayTransitionRule()); 
            pushFollow(FOLLOW_ruleDelayTransition_in_entryRuleDelayTransition1861);
            iv_ruleDelayTransition=ruleDelayTransition();

            state._fsp--;

             current =iv_ruleDelayTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelayTransition1871); 

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
    // $ANTLR end "entryRuleDelayTransition"


    // $ANTLR start "ruleDelayTransition"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:900:1: ruleDelayTransition returns [EObject current=null] : (otherlv_0= 'Delay:' ( (lv_duration_1_0= RULE_INT ) ) ) ;
    public final EObject ruleDelayTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_duration_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:903:28: ( (otherlv_0= 'Delay:' ( (lv_duration_1_0= RULE_INT ) ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:904:1: (otherlv_0= 'Delay:' ( (lv_duration_1_0= RULE_INT ) ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:904:1: (otherlv_0= 'Delay:' ( (lv_duration_1_0= RULE_INT ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:904:3: otherlv_0= 'Delay:' ( (lv_duration_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleDelayTransition1908); 

                	newLeafNode(otherlv_0, grammarAccess.getDelayTransitionAccess().getDelayKeyword_0());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:908:1: ( (lv_duration_1_0= RULE_INT ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:909:1: (lv_duration_1_0= RULE_INT )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:909:1: (lv_duration_1_0= RULE_INT )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:910:3: lv_duration_1_0= RULE_INT
            {
            lv_duration_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDelayTransition1925); 

            			newLeafNode(lv_duration_1_0, grammarAccess.getDelayTransitionAccess().getDurationINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDelayTransitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"duration",
                    		lv_duration_1_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelayTransition"


    // $ANTLR start "entryRuleActionTransition"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:934:1: entryRuleActionTransition returns [EObject current=null] : iv_ruleActionTransition= ruleActionTransition EOF ;
    public final EObject entryRuleActionTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionTransition = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:935:2: (iv_ruleActionTransition= ruleActionTransition EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:936:2: iv_ruleActionTransition= ruleActionTransition EOF
            {
             newCompositeNode(grammarAccess.getActionTransitionRule()); 
            pushFollow(FOLLOW_ruleActionTransition_in_entryRuleActionTransition1966);
            iv_ruleActionTransition=ruleActionTransition();

            state._fsp--;

             current =iv_ruleActionTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionTransition1976); 

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
    // $ANTLR end "entryRuleActionTransition"


    // $ANTLR start "ruleActionTransition"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:943:1: ruleActionTransition returns [EObject current=null] : (otherlv_0= 'Transitions:' ( (lv_edgeActivities_1_0= ruleEdgeActivity ) )+ ) ;
    public final EObject ruleActionTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_edgeActivities_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:946:28: ( (otherlv_0= 'Transitions:' ( (lv_edgeActivities_1_0= ruleEdgeActivity ) )+ ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:947:1: (otherlv_0= 'Transitions:' ( (lv_edgeActivities_1_0= ruleEdgeActivity ) )+ )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:947:1: (otherlv_0= 'Transitions:' ( (lv_edgeActivities_1_0= ruleEdgeActivity ) )+ )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:947:3: otherlv_0= 'Transitions:' ( (lv_edgeActivities_1_0= ruleEdgeActivity ) )+
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleActionTransition2013); 

                	newLeafNode(otherlv_0, grammarAccess.getActionTransitionAccess().getTransitionsKeyword_0());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:951:1: ( (lv_edgeActivities_1_0= ruleEdgeActivity ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:952:1: (lv_edgeActivities_1_0= ruleEdgeActivity )
            	    {
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:952:1: (lv_edgeActivities_1_0= ruleEdgeActivity )
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:953:3: lv_edgeActivities_1_0= ruleEdgeActivity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionTransitionAccess().getEdgeActivitiesEdgeActivityParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEdgeActivity_in_ruleActionTransition2034);
            	    lv_edgeActivities_1_0=ruleEdgeActivity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionTransitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"edgeActivities",
            	            		lv_edgeActivities_1_0, 
            	            		"EdgeActivity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionTransition"


    // $ANTLR start "entryRuleTransition"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:977:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:978:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:979:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition2071);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition2081); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:986:1: ruleTransition returns [EObject current=null] : (this_ActionTransition_0= ruleActionTransition | this_DelayTransition_1= ruleDelayTransition ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        EObject this_ActionTransition_0 = null;

        EObject this_DelayTransition_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:989:28: ( (this_ActionTransition_0= ruleActionTransition | this_DelayTransition_1= ruleDelayTransition ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:990:1: (this_ActionTransition_0= ruleActionTransition | this_DelayTransition_1= ruleDelayTransition )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:990:1: (this_ActionTransition_0= ruleActionTransition | this_DelayTransition_1= ruleDelayTransition )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            else if ( (LA19_0==31) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:991:5: this_ActionTransition_0= ruleActionTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getActionTransitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActionTransition_in_ruleTransition2128);
                    this_ActionTransition_0=ruleActionTransition();

                    state._fsp--;

                     
                            current = this_ActionTransition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1001:5: this_DelayTransition_1= ruleDelayTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getDelayTransitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDelayTransition_in_ruleTransition2155);
                    this_DelayTransition_1=ruleDelayTransition();

                    state._fsp--;

                     
                            current = this_DelayTransition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "ruleResult"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1017:1: ruleResult returns [Enumerator current=null] : ( (enumLiteral_0= '-- Property is satisfied.' ) | (enumLiteral_1= '-- Property is NOT satisfied.' ) | (enumLiteral_2= '-- Formula is satisfied.' ) | (enumLiteral_3= '-- Formula is NOT satisfied.' ) ) ;
    public final Enumerator ruleResult() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1019:28: ( ( (enumLiteral_0= '-- Property is satisfied.' ) | (enumLiteral_1= '-- Property is NOT satisfied.' ) | (enumLiteral_2= '-- Formula is satisfied.' ) | (enumLiteral_3= '-- Formula is NOT satisfied.' ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1020:1: ( (enumLiteral_0= '-- Property is satisfied.' ) | (enumLiteral_1= '-- Property is NOT satisfied.' ) | (enumLiteral_2= '-- Formula is satisfied.' ) | (enumLiteral_3= '-- Formula is NOT satisfied.' ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1020:1: ( (enumLiteral_0= '-- Property is satisfied.' ) | (enumLiteral_1= '-- Property is NOT satisfied.' ) | (enumLiteral_2= '-- Formula is satisfied.' ) | (enumLiteral_3= '-- Formula is NOT satisfied.' ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt20=1;
                }
                break;
            case 34:
                {
                alt20=2;
                }
                break;
            case 35:
                {
                alt20=3;
                }
                break;
            case 36:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1020:2: (enumLiteral_0= '-- Property is satisfied.' )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1020:2: (enumLiteral_0= '-- Property is satisfied.' )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1020:4: enumLiteral_0= '-- Property is satisfied.'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleResult2204); 

                            current = grammarAccess.getResultAccess().getSUCCESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getResultAccess().getSUCCESSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1026:6: (enumLiteral_1= '-- Property is NOT satisfied.' )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1026:6: (enumLiteral_1= '-- Property is NOT satisfied.' )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1026:8: enumLiteral_1= '-- Property is NOT satisfied.'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_34_in_ruleResult2221); 

                            current = grammarAccess.getResultAccess().getFAILUREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getResultAccess().getFAILUREEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1032:6: (enumLiteral_2= '-- Formula is satisfied.' )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1032:6: (enumLiteral_2= '-- Formula is satisfied.' )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1032:8: enumLiteral_2= '-- Formula is satisfied.'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_35_in_ruleResult2238); 

                            current = grammarAccess.getResultAccess().getSUCCESSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getResultAccess().getSUCCESSEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1038:6: (enumLiteral_3= '-- Formula is NOT satisfied.' )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1038:6: (enumLiteral_3= '-- Formula is NOT satisfied.' )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1038:8: enumLiteral_3= '-- Formula is NOT satisfied.'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_36_in_ruleResult2255); 

                            current = grammarAccess.getResultAccess().getFAILUREEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getResultAccess().getFAILUREEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResult"


    // $ANTLR start "ruleCompareOperator"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1048:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1050:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1051:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1051:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt21=1;
                }
                break;
            case 38:
                {
                alt21=2;
                }
                break;
            case 39:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1051:2: (enumLiteral_0= '=' )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1051:2: (enumLiteral_0= '=' )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1051:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_37_in_ruleCompareOperator2300); 

                            current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1057:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1057:6: (enumLiteral_1= '<=' )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1057:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_38_in_ruleCompareOperator2317); 

                            current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1063:6: (enumLiteral_2= '>=' )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1063:6: (enumLiteral_2= '>=' )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1063:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleCompareOperator2334); 

                            current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "ruleSynchronizationKind"
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1073:1: ruleSynchronizationKind returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '!' ) ) ;
    public final Enumerator ruleSynchronizationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1075:28: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '!' ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1076:1: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '!' ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1076:1: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '!' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            else if ( (LA22_0==41) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1076:2: (enumLiteral_0= '?' )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1076:2: (enumLiteral_0= '?' )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1076:4: enumLiteral_0= '?'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleSynchronizationKind2379); 

                            current = grammarAccess.getSynchronizationKindAccess().getRECEIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSynchronizationKindAccess().getRECEIVEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1082:6: (enumLiteral_1= '!' )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1082:6: (enumLiteral_1= '!' )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1082:8: enumLiteral_1= '!'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleSynchronizationKind2396); 

                            current = grammarAccess.getSynchronizationKindAccess().getSENDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSynchronizationKindAccess().getSENDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSynchronizationKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTraceRepository_in_entryRuleTraceRepository75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraceRepository85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTraceRepository123 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleTrace_in_ruleTraceRepository146 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleTrace_in_entryRuleTrace183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrace193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTrace230 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleTrace243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16_in_ruleTrace261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTrace279 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTrace296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTrace313 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_ruleResult_in_ruleTrace339 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_ruleTrace353 = new BitSet(new long[]{0x0000000188000000L});
    public static final BitSet FOLLOW_19_in_ruleTrace371 = new BitSet(new long[]{0x0000000188000000L});
    public static final BitSet FOLLOW_ruleTraceItem_in_ruleTrace393 = new BitSet(new long[]{0x0000000188000002L});
    public static final BitSet FOLLOW_ruleProcessIdentifier_in_entryRuleProcessIdentifier432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessIdentifier442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessIdentifier487 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleProcessIdentifier500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProcessIdentifier517 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleProcessIdentifier535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProcessIdentifier552 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleProcessIdentifier571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationActivity_in_entryRuleLocationActivity609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocationActivity619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessIdentifier_in_ruleLocationActivity665 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLocationActivity677 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocationActivity697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableValue_in_entryRuleVariableValue733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableValue743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedElementReference_in_ruleVariableValue789 = new BitSet(new long[]{0x000000E001000000L});
    public static final BitSet FOLLOW_24_in_ruleVariableValue802 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleNamedElementReference_in_ruleVariableValue823 = new BitSet(new long[]{0x000000E001000000L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleVariableValue846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVariableValue863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleNamedElementReference_in_entryRuleSingleNamedElementReference904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleNamedElementReference914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleNamedElementReference959 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleSingleNamedElementReference972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSingleNamedElementReference989 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSingleNamedElementReference1006 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleNamedElementReference_in_entryRuleNamedElementReference1044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedElementReference1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleNamedElementReference_in_ruleNamedElementReference1100 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleNamedElementReference1113 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleNamedElementReference_in_ruleNamedElementReference1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceItem_in_entryRuleTraceItem1172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraceItem1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_ruleTraceItem1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleTraceItem1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState1297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleState1348 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_28_in_ruleState1361 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleState1375 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLocationActivity_in_ruleState1396 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_22_in_ruleState1409 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleVariableValue_in_ruleState1431 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_21_in_ruleState1445 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableValue_in_ruleState1468 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_ruleEdgeActivity_in_entryRuleEdgeActivity1512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeActivity1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationActivity_in_ruleEdgeActivity1568 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleEdgeActivity1580 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLocationActivity_in_ruleEdgeActivity1601 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_EDGE_in_ruleEdgeActivity1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChannelSynchronization_in_entryRuleChannelSynchronization1661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChannelSynchronization1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChannelSynchronization1716 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_ruleSynchronizationKind_in_ruleChannelSynchronization1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTauSynchronization_in_entryRuleTauSynchronization1774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTauSynchronization1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTauSynchronization1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayTransition_in_entryRuleDelayTransition1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelayTransition1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDelayTransition1908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDelayTransition1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionTransition_in_entryRuleActionTransition1966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionTransition1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleActionTransition2013 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEdgeActivity_in_ruleActionTransition2034 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition2071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionTransition_in_ruleTransition2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayTransition_in_ruleTransition2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleResult2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleResult2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleResult2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleResult2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCompareOperator2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCompareOperator2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCompareOperator2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleSynchronizationKind2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleSynchronizationKind2396 = new BitSet(new long[]{0x0000000000000002L});

}