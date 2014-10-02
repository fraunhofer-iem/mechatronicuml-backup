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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_EDGE", "RULE_DEPTH", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cannot reuse state space when trace length optimisation is used.'", "'Verifying property'", "'at line'", "'Showing counter example.'", "'Showing example trace.'", "'('", "','", "')'", "'.'", "'-'", "'['", "']'", "'State'", "':'", "'->'", "'tau'", "'Delay:'", "'Transitions:'", "'-- Property is satisfied.'", "'-- Property is NOT satisfied.'", "'='", "'<='", "'>='", "'?'", "'!'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int RULE_DEPTH=7;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_EDGE=6;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int RULE_WS=11;

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:120:1: ruleTrace returns [EObject current=null] : (otherlv_0= 'Verifying property' ( (lv_property_1_0= RULE_INT ) ) otherlv_2= 'at line' ( (lv_line_3_0= RULE_INT ) ) ( (lv_result_4_0= ruleResult ) ) ( (otherlv_5= 'Showing counter example.' | otherlv_6= 'Showing example trace.' ) ( (lv_traceItems_7_0= ruleTraceItem ) )+ )? ) ;
    public final EObject ruleTrace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_property_1_0=null;
        Token otherlv_2=null;
        Token lv_line_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_result_4_0 = null;

        EObject lv_traceItems_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:123:28: ( (otherlv_0= 'Verifying property' ( (lv_property_1_0= RULE_INT ) ) otherlv_2= 'at line' ( (lv_line_3_0= RULE_INT ) ) ( (lv_result_4_0= ruleResult ) ) ( (otherlv_5= 'Showing counter example.' | otherlv_6= 'Showing example trace.' ) ( (lv_traceItems_7_0= ruleTraceItem ) )+ )? ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:124:1: (otherlv_0= 'Verifying property' ( (lv_property_1_0= RULE_INT ) ) otherlv_2= 'at line' ( (lv_line_3_0= RULE_INT ) ) ( (lv_result_4_0= ruleResult ) ) ( (otherlv_5= 'Showing counter example.' | otherlv_6= 'Showing example trace.' ) ( (lv_traceItems_7_0= ruleTraceItem ) )+ )? )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:124:1: (otherlv_0= 'Verifying property' ( (lv_property_1_0= RULE_INT ) ) otherlv_2= 'at line' ( (lv_line_3_0= RULE_INT ) ) ( (lv_result_4_0= ruleResult ) ) ( (otherlv_5= 'Showing counter example.' | otherlv_6= 'Showing example trace.' ) ( (lv_traceItems_7_0= ruleTraceItem ) )+ )? )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:124:3: otherlv_0= 'Verifying property' ( (lv_property_1_0= RULE_INT ) ) otherlv_2= 'at line' ( (lv_line_3_0= RULE_INT ) ) ( (lv_result_4_0= ruleResult ) ) ( (otherlv_5= 'Showing counter example.' | otherlv_6= 'Showing example trace.' ) ( (lv_traceItems_7_0= ruleTraceItem ) )+ )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleTrace230); 

                	newLeafNode(otherlv_0, grammarAccess.getTraceAccess().getVerifyingPropertyKeyword_0());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:128:1: ( (lv_property_1_0= RULE_INT ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:129:1: (lv_property_1_0= RULE_INT )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:129:1: (lv_property_1_0= RULE_INT )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:130:3: lv_property_1_0= RULE_INT
            {
            lv_property_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTrace247); 

            			newLeafNode(lv_property_1_0, grammarAccess.getTraceAccess().getPropertyINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTraceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"property",
                    		lv_property_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleTrace264); 

                	newLeafNode(otherlv_2, grammarAccess.getTraceAccess().getAtLineKeyword_2());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:150:1: ( (lv_line_3_0= RULE_INT ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:151:1: (lv_line_3_0= RULE_INT )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:151:1: (lv_line_3_0= RULE_INT )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:152:3: lv_line_3_0= RULE_INT
            {
            lv_line_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTrace281); 

            			newLeafNode(lv_line_3_0, grammarAccess.getTraceAccess().getLineINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTraceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"line",
                    		lv_line_3_0, 
                    		"INT");
            	    

            }


            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:168:2: ( (lv_result_4_0= ruleResult ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:169:1: (lv_result_4_0= ruleResult )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:169:1: (lv_result_4_0= ruleResult )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:170:3: lv_result_4_0= ruleResult
            {
             
            	        newCompositeNode(grammarAccess.getTraceAccess().getResultResultEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleResult_in_ruleTrace307);
            lv_result_4_0=ruleResult();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTraceRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_4_0, 
                    		"Result");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:186:2: ( (otherlv_5= 'Showing counter example.' | otherlv_6= 'Showing example trace.' ) ( (lv_traceItems_7_0= ruleTraceItem ) )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=16 && LA5_0<=17)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:186:3: (otherlv_5= 'Showing counter example.' | otherlv_6= 'Showing example trace.' ) ( (lv_traceItems_7_0= ruleTraceItem ) )+
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:186:3: (otherlv_5= 'Showing counter example.' | otherlv_6= 'Showing example trace.' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==16) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==17) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:186:5: otherlv_5= 'Showing counter example.'
                            {
                            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleTrace321); 

                                	newLeafNode(otherlv_5, grammarAccess.getTraceAccess().getShowingCounterExampleKeyword_5_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:191:7: otherlv_6= 'Showing example trace.'
                            {
                            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleTrace339); 

                                	newLeafNode(otherlv_6, grammarAccess.getTraceAccess().getShowingExampleTraceKeyword_5_0_1());
                                

                            }
                            break;

                    }

                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:195:2: ( (lv_traceItems_7_0= ruleTraceItem ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==25||(LA4_0>=29 && LA4_0<=30)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:196:1: (lv_traceItems_7_0= ruleTraceItem )
                    	    {
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:196:1: (lv_traceItems_7_0= ruleTraceItem )
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:197:3: lv_traceItems_7_0= ruleTraceItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTraceAccess().getTraceItemsTraceItemParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTraceItem_in_ruleTrace361);
                    	    lv_traceItems_7_0=ruleTraceItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTraceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"traceItems",
                    	            		lv_traceItems_7_0, 
                    	            		"TraceItem");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:221:1: entryRuleProcessIdentifier returns [EObject current=null] : iv_ruleProcessIdentifier= ruleProcessIdentifier EOF ;
    public final EObject entryRuleProcessIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessIdentifier = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:222:2: (iv_ruleProcessIdentifier= ruleProcessIdentifier EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:223:2: iv_ruleProcessIdentifier= ruleProcessIdentifier EOF
            {
             newCompositeNode(grammarAccess.getProcessIdentifierRule()); 
            pushFollow(FOLLOW_ruleProcessIdentifier_in_entryRuleProcessIdentifier400);
            iv_ruleProcessIdentifier=ruleProcessIdentifier();

            state._fsp--;

             current =iv_ruleProcessIdentifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessIdentifier410); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:230:1: ruleProcessIdentifier returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')' )? ) ;
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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:233:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')' )? ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:234:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')' )? )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:234:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')' )? )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:234:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')' )?
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:234:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:235:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:235:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:236:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessIdentifierRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessIdentifier455); 

            		newLeafNode(otherlv_0, grammarAccess.getProcessIdentifierAccess().getTemplateAbstractTemplateCrossReference_0_0()); 
            	

            }


            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:247:2: (otherlv_1= '(' ( (lv_arguments_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:247:4: otherlv_1= '(' ( (lv_arguments_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleProcessIdentifier468); 

                        	newLeafNode(otherlv_1, grammarAccess.getProcessIdentifierAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:251:1: ( (lv_arguments_2_0= RULE_INT ) )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:252:1: (lv_arguments_2_0= RULE_INT )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:252:1: (lv_arguments_2_0= RULE_INT )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:253:3: lv_arguments_2_0= RULE_INT
                    {
                    lv_arguments_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProcessIdentifier485); 

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

                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:269:2: (otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:269:4: otherlv_3= ',' ( (lv_arguments_4_0= RULE_INT ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleProcessIdentifier503); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getProcessIdentifierAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:273:1: ( (lv_arguments_4_0= RULE_INT ) )
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:274:1: (lv_arguments_4_0= RULE_INT )
                    	    {
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:274:1: (lv_arguments_4_0= RULE_INT )
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:275:3: lv_arguments_4_0= RULE_INT
                    	    {
                    	    lv_arguments_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProcessIdentifier520); 

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
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleProcessIdentifier539); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:303:1: entryRuleLocationActivity returns [EObject current=null] : iv_ruleLocationActivity= ruleLocationActivity EOF ;
    public final EObject entryRuleLocationActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationActivity = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:304:2: (iv_ruleLocationActivity= ruleLocationActivity EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:305:2: iv_ruleLocationActivity= ruleLocationActivity EOF
            {
             newCompositeNode(grammarAccess.getLocationActivityRule()); 
            pushFollow(FOLLOW_ruleLocationActivity_in_entryRuleLocationActivity577);
            iv_ruleLocationActivity=ruleLocationActivity();

            state._fsp--;

             current =iv_ruleLocationActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocationActivity587); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:312:1: ruleLocationActivity returns [EObject current=null] : ( ( (lv_process_0_0= ruleProcessIdentifier ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleLocationActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_process_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:315:28: ( ( ( (lv_process_0_0= ruleProcessIdentifier ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:316:1: ( ( (lv_process_0_0= ruleProcessIdentifier ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:316:1: ( ( (lv_process_0_0= ruleProcessIdentifier ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:316:2: ( (lv_process_0_0= ruleProcessIdentifier ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:316:2: ( (lv_process_0_0= ruleProcessIdentifier ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:317:1: (lv_process_0_0= ruleProcessIdentifier )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:317:1: (lv_process_0_0= ruleProcessIdentifier )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:318:3: lv_process_0_0= ruleProcessIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getLocationActivityAccess().getProcessProcessIdentifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleProcessIdentifier_in_ruleLocationActivity633);
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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleLocationActivity645); 

                	newLeafNode(otherlv_1, grammarAccess.getLocationActivityAccess().getFullStopKeyword_1());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:338:1: ( (otherlv_2= RULE_ID ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:339:1: (otherlv_2= RULE_ID )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:339:1: (otherlv_2= RULE_ID )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:340:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLocationActivityRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocationActivity665); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:359:1: entryRuleVariableValue returns [EObject current=null] : iv_ruleVariableValue= ruleVariableValue EOF ;
    public final EObject entryRuleVariableValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableValue = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:360:2: (iv_ruleVariableValue= ruleVariableValue EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:361:2: iv_ruleVariableValue= ruleVariableValue EOF
            {
             newCompositeNode(grammarAccess.getVariableValueRule()); 
            pushFollow(FOLLOW_ruleVariableValue_in_entryRuleVariableValue701);
            iv_ruleVariableValue=ruleVariableValue();

            state._fsp--;

             current =iv_ruleVariableValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableValue711); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:368:1: ruleVariableValue returns [EObject current=null] : ( ( (lv_firstNamedElementReference_0_0= ruleNamedElementReference ) ) (otherlv_1= '-' ( (lv_secondNamedElementReference_2_0= ruleNamedElementReference ) ) )? ( (lv_operator_3_0= ruleCompareOperator ) ) ( (lv_value_4_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_4_0=null;
        EObject lv_firstNamedElementReference_0_0 = null;

        EObject lv_secondNamedElementReference_2_0 = null;

        Enumerator lv_operator_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:371:28: ( ( ( (lv_firstNamedElementReference_0_0= ruleNamedElementReference ) ) (otherlv_1= '-' ( (lv_secondNamedElementReference_2_0= ruleNamedElementReference ) ) )? ( (lv_operator_3_0= ruleCompareOperator ) ) ( (lv_value_4_0= RULE_INT ) ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:372:1: ( ( (lv_firstNamedElementReference_0_0= ruleNamedElementReference ) ) (otherlv_1= '-' ( (lv_secondNamedElementReference_2_0= ruleNamedElementReference ) ) )? ( (lv_operator_3_0= ruleCompareOperator ) ) ( (lv_value_4_0= RULE_INT ) ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:372:1: ( ( (lv_firstNamedElementReference_0_0= ruleNamedElementReference ) ) (otherlv_1= '-' ( (lv_secondNamedElementReference_2_0= ruleNamedElementReference ) ) )? ( (lv_operator_3_0= ruleCompareOperator ) ) ( (lv_value_4_0= RULE_INT ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:372:2: ( (lv_firstNamedElementReference_0_0= ruleNamedElementReference ) ) (otherlv_1= '-' ( (lv_secondNamedElementReference_2_0= ruleNamedElementReference ) ) )? ( (lv_operator_3_0= ruleCompareOperator ) ) ( (lv_value_4_0= RULE_INT ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:372:2: ( (lv_firstNamedElementReference_0_0= ruleNamedElementReference ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:373:1: (lv_firstNamedElementReference_0_0= ruleNamedElementReference )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:373:1: (lv_firstNamedElementReference_0_0= ruleNamedElementReference )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:374:3: lv_firstNamedElementReference_0_0= ruleNamedElementReference
            {
             
            	        newCompositeNode(grammarAccess.getVariableValueAccess().getFirstNamedElementReferenceNamedElementReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNamedElementReference_in_ruleVariableValue757);
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

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:390:2: (otherlv_1= '-' ( (lv_secondNamedElementReference_2_0= ruleNamedElementReference ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:390:4: otherlv_1= '-' ( (lv_secondNamedElementReference_2_0= ruleNamedElementReference ) )
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleVariableValue770); 

                        	newLeafNode(otherlv_1, grammarAccess.getVariableValueAccess().getHyphenMinusKeyword_1_0());
                        
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:394:1: ( (lv_secondNamedElementReference_2_0= ruleNamedElementReference ) )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:395:1: (lv_secondNamedElementReference_2_0= ruleNamedElementReference )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:395:1: (lv_secondNamedElementReference_2_0= ruleNamedElementReference )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:396:3: lv_secondNamedElementReference_2_0= ruleNamedElementReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableValueAccess().getSecondNamedElementReferenceNamedElementReferenceParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNamedElementReference_in_ruleVariableValue791);
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

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:412:4: ( (lv_operator_3_0= ruleCompareOperator ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:413:1: (lv_operator_3_0= ruleCompareOperator )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:413:1: (lv_operator_3_0= ruleCompareOperator )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:414:3: lv_operator_3_0= ruleCompareOperator
            {
             
            	        newCompositeNode(grammarAccess.getVariableValueAccess().getOperatorCompareOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCompareOperator_in_ruleVariableValue814);
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

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:430:2: ( (lv_value_4_0= RULE_INT ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:431:1: (lv_value_4_0= RULE_INT )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:431:1: (lv_value_4_0= RULE_INT )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:432:3: lv_value_4_0= RULE_INT
            {
            lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVariableValue831); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:456:1: entryRuleSingleNamedElementReference returns [EObject current=null] : iv_ruleSingleNamedElementReference= ruleSingleNamedElementReference EOF ;
    public final EObject entryRuleSingleNamedElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleNamedElementReference = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:457:2: (iv_ruleSingleNamedElementReference= ruleSingleNamedElementReference EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:458:2: iv_ruleSingleNamedElementReference= ruleSingleNamedElementReference EOF
            {
             newCompositeNode(grammarAccess.getSingleNamedElementReferenceRule()); 
            pushFollow(FOLLOW_ruleSingleNamedElementReference_in_entryRuleSingleNamedElementReference872);
            iv_ruleSingleNamedElementReference=ruleSingleNamedElementReference();

            state._fsp--;

             current =iv_ruleSingleNamedElementReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleNamedElementReference882); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:465:1: ruleSingleNamedElementReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= RULE_INT ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleSingleNamedElementReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_indexes_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:468:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= RULE_INT ) ) otherlv_3= ']' )* ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:469:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= RULE_INT ) ) otherlv_3= ']' )* )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:469:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= RULE_INT ) ) otherlv_3= ']' )* )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:469:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indexes_2_0= RULE_INT ) ) otherlv_3= ']' )*
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:469:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:470:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:470:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:471:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleNamedElementReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleNamedElementReference927); 

            		newLeafNode(otherlv_0, grammarAccess.getSingleNamedElementReferenceAccess().getNamedElementNamedElementCrossReference_0_0()); 
            	

            }


            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:482:2: (otherlv_1= '[' ( (lv_indexes_2_0= RULE_INT ) ) otherlv_3= ']' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:482:4: otherlv_1= '[' ( (lv_indexes_2_0= RULE_INT ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleSingleNamedElementReference940); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSingleNamedElementReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	        
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:486:1: ( (lv_indexes_2_0= RULE_INT ) )
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:487:1: (lv_indexes_2_0= RULE_INT )
            	    {
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:487:1: (lv_indexes_2_0= RULE_INT )
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:488:3: lv_indexes_2_0= RULE_INT
            	    {
            	    lv_indexes_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSingleNamedElementReference957); 

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

            	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleSingleNamedElementReference974); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSingleNamedElementReferenceAccess().getRightSquareBracketKeyword_1_2());
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:516:1: entryRuleNamedElementReference returns [EObject current=null] : iv_ruleNamedElementReference= ruleNamedElementReference EOF ;
    public final EObject entryRuleNamedElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedElementReference = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:517:2: (iv_ruleNamedElementReference= ruleNamedElementReference EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:518:2: iv_ruleNamedElementReference= ruleNamedElementReference EOF
            {
             newCompositeNode(grammarAccess.getNamedElementReferenceRule()); 
            pushFollow(FOLLOW_ruleNamedElementReference_in_entryRuleNamedElementReference1012);
            iv_ruleNamedElementReference=ruleNamedElementReference();

            state._fsp--;

             current =iv_ruleNamedElementReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedElementReference1022); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:525:1: ruleNamedElementReference returns [EObject current=null] : ( ( (lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference ) ) (otherlv_1= '.' ( (lv_namedElementReference_2_0= ruleNamedElementReference ) ) )? ) ;
    public final EObject ruleNamedElementReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_singleNamedElementReference_0_0 = null;

        EObject lv_namedElementReference_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:528:28: ( ( ( (lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference ) ) (otherlv_1= '.' ( (lv_namedElementReference_2_0= ruleNamedElementReference ) ) )? ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:529:1: ( ( (lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference ) ) (otherlv_1= '.' ( (lv_namedElementReference_2_0= ruleNamedElementReference ) ) )? )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:529:1: ( ( (lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference ) ) (otherlv_1= '.' ( (lv_namedElementReference_2_0= ruleNamedElementReference ) ) )? )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:529:2: ( (lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference ) ) (otherlv_1= '.' ( (lv_namedElementReference_2_0= ruleNamedElementReference ) ) )?
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:529:2: ( (lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:530:1: (lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:530:1: (lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:531:3: lv_singleNamedElementReference_0_0= ruleSingleNamedElementReference
            {
             
            	        newCompositeNode(grammarAccess.getNamedElementReferenceAccess().getSingleNamedElementReferenceSingleNamedElementReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSingleNamedElementReference_in_ruleNamedElementReference1068);
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

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:547:2: (otherlv_1= '.' ( (lv_namedElementReference_2_0= ruleNamedElementReference ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:547:4: otherlv_1= '.' ( (lv_namedElementReference_2_0= ruleNamedElementReference ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleNamedElementReference1081); 

                        	newLeafNode(otherlv_1, grammarAccess.getNamedElementReferenceAccess().getFullStopKeyword_1_0());
                        
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:551:1: ( (lv_namedElementReference_2_0= ruleNamedElementReference ) )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:552:1: (lv_namedElementReference_2_0= ruleNamedElementReference )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:552:1: (lv_namedElementReference_2_0= ruleNamedElementReference )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:553:3: lv_namedElementReference_2_0= ruleNamedElementReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getNamedElementReferenceAccess().getNamedElementReferenceNamedElementReferenceParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNamedElementReference_in_ruleNamedElementReference1102);
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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:577:1: entryRuleTraceItem returns [EObject current=null] : iv_ruleTraceItem= ruleTraceItem EOF ;
    public final EObject entryRuleTraceItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceItem = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:578:2: (iv_ruleTraceItem= ruleTraceItem EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:579:2: iv_ruleTraceItem= ruleTraceItem EOF
            {
             newCompositeNode(grammarAccess.getTraceItemRule()); 
            pushFollow(FOLLOW_ruleTraceItem_in_entryRuleTraceItem1140);
            iv_ruleTraceItem=ruleTraceItem();

            state._fsp--;

             current =iv_ruleTraceItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTraceItem1150); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:586:1: ruleTraceItem returns [EObject current=null] : (this_State_0= ruleState | this_Transition_1= ruleTransition ) ;
    public final EObject ruleTraceItem() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_Transition_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:589:28: ( (this_State_0= ruleState | this_Transition_1= ruleTransition ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:590:1: (this_State_0= ruleState | this_Transition_1= ruleTransition )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:590:1: (this_State_0= ruleState | this_Transition_1= ruleTransition )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=29 && LA11_0<=30)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:591:5: this_State_0= ruleState
                    {
                     
                            newCompositeNode(grammarAccess.getTraceItemAccess().getStateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleState_in_ruleTraceItem1197);
                    this_State_0=ruleState();

                    state._fsp--;

                     
                            current = this_State_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:601:5: this_Transition_1= ruleTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTraceItemAccess().getTransitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTransition_in_ruleTraceItem1224);
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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:617:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_DEPTH");
        	
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:621:2: (iv_ruleState= ruleState EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:622:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState1265);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState1275); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:632:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' (otherlv_1= ':' )? otherlv_2= '(' ( (lv_locationActivities_3_0= ruleLocationActivity ) )+ otherlv_4= ')' ( ( (lv_variableValues_5_0= ruleVariableValue ) ) ( (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) ) )* )? ) ;
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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:636:28: ( (otherlv_0= 'State' (otherlv_1= ':' )? otherlv_2= '(' ( (lv_locationActivities_3_0= ruleLocationActivity ) )+ otherlv_4= ')' ( ( (lv_variableValues_5_0= ruleVariableValue ) ) ( (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) ) )* )? ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:637:1: (otherlv_0= 'State' (otherlv_1= ':' )? otherlv_2= '(' ( (lv_locationActivities_3_0= ruleLocationActivity ) )+ otherlv_4= ')' ( ( (lv_variableValues_5_0= ruleVariableValue ) ) ( (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) ) )* )? )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:637:1: (otherlv_0= 'State' (otherlv_1= ':' )? otherlv_2= '(' ( (lv_locationActivities_3_0= ruleLocationActivity ) )+ otherlv_4= ')' ( ( (lv_variableValues_5_0= ruleVariableValue ) ) ( (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) ) )* )? )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:637:3: otherlv_0= 'State' (otherlv_1= ':' )? otherlv_2= '(' ( (lv_locationActivities_3_0= ruleLocationActivity ) )+ otherlv_4= ')' ( ( (lv_variableValues_5_0= ruleVariableValue ) ) ( (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) ) )* )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleState1316); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:641:1: (otherlv_1= ':' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:641:3: otherlv_1= ':'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleState1329); 

                        	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getColonKeyword_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleState1343); 

                	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftParenthesisKeyword_2());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:649:1: ( (lv_locationActivities_3_0= ruleLocationActivity ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:650:1: (lv_locationActivities_3_0= ruleLocationActivity )
            	    {
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:650:1: (lv_locationActivities_3_0= ruleLocationActivity )
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:651:3: lv_locationActivities_3_0= ruleLocationActivity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getLocationActivitiesLocationActivityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLocationActivity_in_ruleState1364);
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleState1377); 

                	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getRightParenthesisKeyword_4());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:671:1: ( ( (lv_variableValues_5_0= ruleVariableValue ) ) ( (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:671:2: ( (lv_variableValues_5_0= ruleVariableValue ) ) ( (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) ) )*
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:671:2: ( (lv_variableValues_5_0= ruleVariableValue ) )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:672:1: (lv_variableValues_5_0= ruleVariableValue )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:672:1: (lv_variableValues_5_0= ruleVariableValue )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:673:3: lv_variableValues_5_0= ruleVariableValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getVariableValuesVariableValueParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableValue_in_ruleState1399);
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

                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:689:2: ( (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID||LA15_0==19) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:689:3: (otherlv_6= ',' )? ( (lv_variableValues_7_0= ruleVariableValue ) )
                    	    {
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:689:3: (otherlv_6= ',' )?
                    	    int alt14=2;
                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0==19) ) {
                    	        alt14=1;
                    	    }
                    	    switch (alt14) {
                    	        case 1 :
                    	            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:689:5: otherlv_6= ','
                    	            {
                    	            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleState1413); 

                    	                	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getCommaKeyword_5_1_0());
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:693:3: ( (lv_variableValues_7_0= ruleVariableValue ) )
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:694:1: (lv_variableValues_7_0= ruleVariableValue )
                    	    {
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:694:1: (lv_variableValues_7_0= ruleVariableValue )
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:695:3: lv_variableValues_7_0= ruleVariableValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getVariableValuesVariableValueParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVariableValue_in_ruleState1436);
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
                    	    break loop15;
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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:722:1: entryRuleEdgeActivity returns [EObject current=null] : iv_ruleEdgeActivity= ruleEdgeActivity EOF ;
    public final EObject entryRuleEdgeActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeActivity = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:723:2: (iv_ruleEdgeActivity= ruleEdgeActivity EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:724:2: iv_ruleEdgeActivity= ruleEdgeActivity EOF
            {
             newCompositeNode(grammarAccess.getEdgeActivityRule()); 
            pushFollow(FOLLOW_ruleEdgeActivity_in_entryRuleEdgeActivity1480);
            iv_ruleEdgeActivity=ruleEdgeActivity();

            state._fsp--;

             current =iv_ruleEdgeActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeActivity1490); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:731:1: ruleEdgeActivity returns [EObject current=null] : ( ( (lv_source_0_0= ruleLocationActivity ) ) otherlv_1= '->' ( (lv_target_2_0= ruleLocationActivity ) ) ( (lv_details_3_0= RULE_EDGE ) ) ) ;
    public final EObject ruleEdgeActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_details_3_0=null;
        EObject lv_source_0_0 = null;

        EObject lv_target_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:734:28: ( ( ( (lv_source_0_0= ruleLocationActivity ) ) otherlv_1= '->' ( (lv_target_2_0= ruleLocationActivity ) ) ( (lv_details_3_0= RULE_EDGE ) ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:735:1: ( ( (lv_source_0_0= ruleLocationActivity ) ) otherlv_1= '->' ( (lv_target_2_0= ruleLocationActivity ) ) ( (lv_details_3_0= RULE_EDGE ) ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:735:1: ( ( (lv_source_0_0= ruleLocationActivity ) ) otherlv_1= '->' ( (lv_target_2_0= ruleLocationActivity ) ) ( (lv_details_3_0= RULE_EDGE ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:735:2: ( (lv_source_0_0= ruleLocationActivity ) ) otherlv_1= '->' ( (lv_target_2_0= ruleLocationActivity ) ) ( (lv_details_3_0= RULE_EDGE ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:735:2: ( (lv_source_0_0= ruleLocationActivity ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:736:1: (lv_source_0_0= ruleLocationActivity )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:736:1: (lv_source_0_0= ruleLocationActivity )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:737:3: lv_source_0_0= ruleLocationActivity
            {
             
            	        newCompositeNode(grammarAccess.getEdgeActivityAccess().getSourceLocationActivityParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLocationActivity_in_ruleEdgeActivity1536);
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleEdgeActivity1548); 

                	newLeafNode(otherlv_1, grammarAccess.getEdgeActivityAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:757:1: ( (lv_target_2_0= ruleLocationActivity ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:758:1: (lv_target_2_0= ruleLocationActivity )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:758:1: (lv_target_2_0= ruleLocationActivity )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:759:3: lv_target_2_0= ruleLocationActivity
            {
             
            	        newCompositeNode(grammarAccess.getEdgeActivityAccess().getTargetLocationActivityParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLocationActivity_in_ruleEdgeActivity1569);
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

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:775:2: ( (lv_details_3_0= RULE_EDGE ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:776:1: (lv_details_3_0= RULE_EDGE )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:776:1: (lv_details_3_0= RULE_EDGE )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:777:3: lv_details_3_0= RULE_EDGE
            {
            lv_details_3_0=(Token)match(input,RULE_EDGE,FOLLOW_RULE_EDGE_in_ruleEdgeActivity1586); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:803:1: entryRuleChannelSynchronization returns [EObject current=null] : iv_ruleChannelSynchronization= ruleChannelSynchronization EOF ;
    public final EObject entryRuleChannelSynchronization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelSynchronization = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:804:2: (iv_ruleChannelSynchronization= ruleChannelSynchronization EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:805:2: iv_ruleChannelSynchronization= ruleChannelSynchronization EOF
            {
             newCompositeNode(grammarAccess.getChannelSynchronizationRule()); 
            pushFollow(FOLLOW_ruleChannelSynchronization_in_entryRuleChannelSynchronization1629);
            iv_ruleChannelSynchronization=ruleChannelSynchronization();

            state._fsp--;

             current =iv_ruleChannelSynchronization; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChannelSynchronization1639); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:812:1: ruleChannelSynchronization returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_kind_1_0= ruleSynchronizationKind ) ) ) ;
    public final EObject ruleChannelSynchronization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_kind_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:815:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_kind_1_0= ruleSynchronizationKind ) ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:816:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_kind_1_0= ruleSynchronizationKind ) ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:816:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_kind_1_0= ruleSynchronizationKind ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:816:2: ( (otherlv_0= RULE_ID ) ) ( (lv_kind_1_0= ruleSynchronizationKind ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:816:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:817:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:817:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:818:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChannelSynchronizationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChannelSynchronization1684); 

            		newLeafNode(otherlv_0, grammarAccess.getChannelSynchronizationAccess().getChannelVariableCrossReference_0_0()); 
            	

            }


            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:829:2: ( (lv_kind_1_0= ruleSynchronizationKind ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:830:1: (lv_kind_1_0= ruleSynchronizationKind )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:830:1: (lv_kind_1_0= ruleSynchronizationKind )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:831:3: lv_kind_1_0= ruleSynchronizationKind
            {
             
            	        newCompositeNode(grammarAccess.getChannelSynchronizationAccess().getKindSynchronizationKindEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSynchronizationKind_in_ruleChannelSynchronization1705);
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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:855:1: entryRuleTauSynchronization returns [String current=null] : iv_ruleTauSynchronization= ruleTauSynchronization EOF ;
    public final String entryRuleTauSynchronization() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTauSynchronization = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:856:2: (iv_ruleTauSynchronization= ruleTauSynchronization EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:857:2: iv_ruleTauSynchronization= ruleTauSynchronization EOF
            {
             newCompositeNode(grammarAccess.getTauSynchronizationRule()); 
            pushFollow(FOLLOW_ruleTauSynchronization_in_entryRuleTauSynchronization1742);
            iv_ruleTauSynchronization=ruleTauSynchronization();

            state._fsp--;

             current =iv_ruleTauSynchronization.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTauSynchronization1753); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:864:1: ruleTauSynchronization returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'tau' ;
    public final AntlrDatatypeRuleToken ruleTauSynchronization() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:867:28: (kw= 'tau' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:869:2: kw= 'tau'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleTauSynchronization1790); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:882:1: entryRuleDelayTransition returns [EObject current=null] : iv_ruleDelayTransition= ruleDelayTransition EOF ;
    public final EObject entryRuleDelayTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayTransition = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:883:2: (iv_ruleDelayTransition= ruleDelayTransition EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:884:2: iv_ruleDelayTransition= ruleDelayTransition EOF
            {
             newCompositeNode(grammarAccess.getDelayTransitionRule()); 
            pushFollow(FOLLOW_ruleDelayTransition_in_entryRuleDelayTransition1829);
            iv_ruleDelayTransition=ruleDelayTransition();

            state._fsp--;

             current =iv_ruleDelayTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelayTransition1839); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:891:1: ruleDelayTransition returns [EObject current=null] : (otherlv_0= 'Delay:' ( (lv_duration_1_0= RULE_INT ) ) ) ;
    public final EObject ruleDelayTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_duration_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:894:28: ( (otherlv_0= 'Delay:' ( (lv_duration_1_0= RULE_INT ) ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:895:1: (otherlv_0= 'Delay:' ( (lv_duration_1_0= RULE_INT ) ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:895:1: (otherlv_0= 'Delay:' ( (lv_duration_1_0= RULE_INT ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:895:3: otherlv_0= 'Delay:' ( (lv_duration_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleDelayTransition1876); 

                	newLeafNode(otherlv_0, grammarAccess.getDelayTransitionAccess().getDelayKeyword_0());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:899:1: ( (lv_duration_1_0= RULE_INT ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:900:1: (lv_duration_1_0= RULE_INT )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:900:1: (lv_duration_1_0= RULE_INT )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:901:3: lv_duration_1_0= RULE_INT
            {
            lv_duration_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDelayTransition1893); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:925:1: entryRuleActionTransition returns [EObject current=null] : iv_ruleActionTransition= ruleActionTransition EOF ;
    public final EObject entryRuleActionTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionTransition = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:926:2: (iv_ruleActionTransition= ruleActionTransition EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:927:2: iv_ruleActionTransition= ruleActionTransition EOF
            {
             newCompositeNode(grammarAccess.getActionTransitionRule()); 
            pushFollow(FOLLOW_ruleActionTransition_in_entryRuleActionTransition1934);
            iv_ruleActionTransition=ruleActionTransition();

            state._fsp--;

             current =iv_ruleActionTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionTransition1944); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:934:1: ruleActionTransition returns [EObject current=null] : (otherlv_0= 'Transitions:' ( (lv_edgeActivities_1_0= ruleEdgeActivity ) )+ ) ;
    public final EObject ruleActionTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_edgeActivities_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:937:28: ( (otherlv_0= 'Transitions:' ( (lv_edgeActivities_1_0= ruleEdgeActivity ) )+ ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:938:1: (otherlv_0= 'Transitions:' ( (lv_edgeActivities_1_0= ruleEdgeActivity ) )+ )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:938:1: (otherlv_0= 'Transitions:' ( (lv_edgeActivities_1_0= ruleEdgeActivity ) )+ )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:938:3: otherlv_0= 'Transitions:' ( (lv_edgeActivities_1_0= ruleEdgeActivity ) )+
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleActionTransition1981); 

                	newLeafNode(otherlv_0, grammarAccess.getActionTransitionAccess().getTransitionsKeyword_0());
                
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:942:1: ( (lv_edgeActivities_1_0= ruleEdgeActivity ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:943:1: (lv_edgeActivities_1_0= ruleEdgeActivity )
            	    {
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:943:1: (lv_edgeActivities_1_0= ruleEdgeActivity )
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:944:3: lv_edgeActivities_1_0= ruleEdgeActivity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionTransitionAccess().getEdgeActivitiesEdgeActivityParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEdgeActivity_in_ruleActionTransition2002);
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:968:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:969:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:970:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition2039);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition2049); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:977:1: ruleTransition returns [EObject current=null] : (this_ActionTransition_0= ruleActionTransition | this_DelayTransition_1= ruleDelayTransition ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        EObject this_ActionTransition_0 = null;

        EObject this_DelayTransition_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:980:28: ( (this_ActionTransition_0= ruleActionTransition | this_DelayTransition_1= ruleDelayTransition ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:981:1: (this_ActionTransition_0= ruleActionTransition | this_DelayTransition_1= ruleDelayTransition )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:981:1: (this_ActionTransition_0= ruleActionTransition | this_DelayTransition_1= ruleDelayTransition )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            else if ( (LA18_0==29) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:982:5: this_ActionTransition_0= ruleActionTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getActionTransitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActionTransition_in_ruleTransition2096);
                    this_ActionTransition_0=ruleActionTransition();

                    state._fsp--;

                     
                            current = this_ActionTransition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:992:5: this_DelayTransition_1= ruleDelayTransition
                    {
                     
                            newCompositeNode(grammarAccess.getTransitionAccess().getDelayTransitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDelayTransition_in_ruleTransition2123);
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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1008:1: ruleResult returns [Enumerator current=null] : ( (enumLiteral_0= '-- Property is satisfied.' ) | (enumLiteral_1= '-- Property is NOT satisfied.' ) ) ;
    public final Enumerator ruleResult() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1010:28: ( ( (enumLiteral_0= '-- Property is satisfied.' ) | (enumLiteral_1= '-- Property is NOT satisfied.' ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1011:1: ( (enumLiteral_0= '-- Property is satisfied.' ) | (enumLiteral_1= '-- Property is NOT satisfied.' ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1011:1: ( (enumLiteral_0= '-- Property is satisfied.' ) | (enumLiteral_1= '-- Property is NOT satisfied.' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            else if ( (LA19_0==32) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1011:2: (enumLiteral_0= '-- Property is satisfied.' )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1011:2: (enumLiteral_0= '-- Property is satisfied.' )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1011:4: enumLiteral_0= '-- Property is satisfied.'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_31_in_ruleResult2172); 

                            current = grammarAccess.getResultAccess().getSUCCESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getResultAccess().getSUCCESSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1017:6: (enumLiteral_1= '-- Property is NOT satisfied.' )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1017:6: (enumLiteral_1= '-- Property is NOT satisfied.' )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1017:8: enumLiteral_1= '-- Property is NOT satisfied.'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_32_in_ruleResult2189); 

                            current = grammarAccess.getResultAccess().getFAILUREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getResultAccess().getFAILUREEnumLiteralDeclaration_1()); 
                        

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1027:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1029:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1030:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1030:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) )
            int alt20=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1030:2: (enumLiteral_0= '=' )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1030:2: (enumLiteral_0= '=' )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1030:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleCompareOperator2234); 

                            current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1036:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1036:6: (enumLiteral_1= '<=' )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1036:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_34_in_ruleCompareOperator2251); 

                            current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1042:6: (enumLiteral_2= '>=' )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1042:6: (enumLiteral_2= '>=' )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1042:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_35_in_ruleCompareOperator2268); 

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
    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1052:1: ruleSynchronizationKind returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '!' ) ) ;
    public final Enumerator ruleSynchronizationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1054:28: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '!' ) ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1055:1: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '!' ) )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1055:1: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '!' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            else if ( (LA21_0==37) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1055:2: (enumLiteral_0= '?' )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1055:2: (enumLiteral_0= '?' )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1055:4: enumLiteral_0= '?'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_36_in_ruleSynchronizationKind2313); 

                            current = grammarAccess.getSynchronizationKindAccess().getRECEIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSynchronizationKindAccess().getRECEIVEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1061:6: (enumLiteral_1= '!' )
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1061:6: (enumLiteral_1= '!' )
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1061:8: enumLiteral_1= '!'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_37_in_ruleSynchronizationKind2330); 

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
    public static final BitSet FOLLOW_14_in_ruleTrace230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTrace247 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTrace264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTrace281 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ruleResult_in_ruleTrace307 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_16_in_ruleTrace321 = new BitSet(new long[]{0x0000000062000000L});
    public static final BitSet FOLLOW_17_in_ruleTrace339 = new BitSet(new long[]{0x0000000062000000L});
    public static final BitSet FOLLOW_ruleTraceItem_in_ruleTrace361 = new BitSet(new long[]{0x0000000062000002L});
    public static final BitSet FOLLOW_ruleProcessIdentifier_in_entryRuleProcessIdentifier400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessIdentifier410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessIdentifier455 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleProcessIdentifier468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProcessIdentifier485 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleProcessIdentifier503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProcessIdentifier520 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleProcessIdentifier539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationActivity_in_entryRuleLocationActivity577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocationActivity587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessIdentifier_in_ruleLocationActivity633 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleLocationActivity645 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocationActivity665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableValue_in_entryRuleVariableValue701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableValue711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedElementReference_in_ruleVariableValue757 = new BitSet(new long[]{0x0000000E00400000L});
    public static final BitSet FOLLOW_22_in_ruleVariableValue770 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleNamedElementReference_in_ruleVariableValue791 = new BitSet(new long[]{0x0000000E00400000L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleVariableValue814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVariableValue831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleNamedElementReference_in_entryRuleSingleNamedElementReference872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleNamedElementReference882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleNamedElementReference927 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleSingleNamedElementReference940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSingleNamedElementReference957 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSingleNamedElementReference974 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleNamedElementReference_in_entryRuleNamedElementReference1012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedElementReference1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleNamedElementReference_in_ruleNamedElementReference1068 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleNamedElementReference1081 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleNamedElementReference_in_ruleNamedElementReference1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceItem_in_entryRuleTraceItem1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraceItem1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_ruleTraceItem1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleTraceItem1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState1265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleState1316 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_26_in_ruleState1329 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleState1343 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLocationActivity_in_ruleState1364 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_20_in_ruleState1377 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleVariableValue_in_ruleState1399 = new BitSet(new long[]{0x0000000000080022L});
    public static final BitSet FOLLOW_19_in_ruleState1413 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableValue_in_ruleState1436 = new BitSet(new long[]{0x0000000000080022L});
    public static final BitSet FOLLOW_ruleEdgeActivity_in_entryRuleEdgeActivity1480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeActivity1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationActivity_in_ruleEdgeActivity1536 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEdgeActivity1548 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLocationActivity_in_ruleEdgeActivity1569 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_EDGE_in_ruleEdgeActivity1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChannelSynchronization_in_entryRuleChannelSynchronization1629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChannelSynchronization1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChannelSynchronization1684 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_ruleSynchronizationKind_in_ruleChannelSynchronization1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTauSynchronization_in_entryRuleTauSynchronization1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTauSynchronization1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTauSynchronization1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayTransition_in_entryRuleDelayTransition1829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelayTransition1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDelayTransition1876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDelayTransition1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionTransition_in_entryRuleActionTransition1934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionTransition1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleActionTransition1981 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEdgeActivity_in_ruleActionTransition2002 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition2039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionTransition_in_ruleTransition2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayTransition_in_ruleTransition2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleResult2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleResult2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCompareOperator2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCompareOperator2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCompareOperator2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSynchronizationKind2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSynchronizationKind2330 = new BitSet(new long[]{0x0000000000000002L});

}