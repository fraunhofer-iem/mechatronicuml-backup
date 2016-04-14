package org.muml.psm.api.apimappinglanguage.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.muml.psm.api.apimappinglanguage.xtext.services.APIMappingLanguageGrammarAccess;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAPIMappingLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_NUMBER", "RULE_BOOLEAN", "RULE_MINORMAXKEYWORD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MappingRepository:'", "'{'", "','", "'}'", "'#'", "'import'", "'PortInstance:'", "'execCommand:'", "'initCommand:'", "'enum:'", "'API_Call:'", "'('", "')'", "':='", "'port:'", "'.'", "'for'", "';'", "'while'", "'do'", "');'", "'if'", "'else'", "'elseif'", "'return'", "'['", "']'", "'const'", "'<'", "'>'", "'null'", "'->'", "'++'", "'--'", "'+='", "'-='", "'||'", "'&&'", "'=='", "'<>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'self'", "'first'", "'last'", "'prev'", "'next'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_MINORMAXKEYWORD=9;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_NUMBER=7;
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

    // delegates
    // delegators


        public InternalAPIMappingLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAPIMappingLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAPIMappingLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAPIMappingLanguage.g"; }



     	private APIMappingLanguageGrammarAccess grammarAccess;
     	
        public InternalAPIMappingLanguageParser(TokenStream input, APIMappingLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MappingRepository";	
       	}
       	
       	@Override
       	protected APIMappingLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMappingRepository"
    // InternalAPIMappingLanguage.g:68:1: entryRuleMappingRepository returns [EObject current=null] : iv_ruleMappingRepository= ruleMappingRepository EOF ;
    public final EObject entryRuleMappingRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingRepository = null;


        try {
            // InternalAPIMappingLanguage.g:69:2: (iv_ruleMappingRepository= ruleMappingRepository EOF )
            // InternalAPIMappingLanguage.g:70:2: iv_ruleMappingRepository= ruleMappingRepository EOF
            {
             newCompositeNode(grammarAccess.getMappingRepositoryRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMappingRepository=ruleMappingRepository();

            state._fsp--;

             current =iv_ruleMappingRepository; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleMappingRepository"


    // $ANTLR start "ruleMappingRepository"
    // InternalAPIMappingLanguage.g:77:1: ruleMappingRepository returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'MappingRepository:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_portApiMappings_4_0= rulePortApiMapping ) ) (otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) ) )* )? otherlv_7= '}' (otherlv_8= '#' ( (lv_comment_9_0= ruleEString ) ) )? ) ;
    public final EObject ruleMappingRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_portApiMappings_4_0 = null;

        EObject lv_portApiMappings_6_0 = null;

        AntlrDatatypeRuleToken lv_comment_9_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'MappingRepository:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_portApiMappings_4_0= rulePortApiMapping ) ) (otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) ) )* )? otherlv_7= '}' (otherlv_8= '#' ( (lv_comment_9_0= ruleEString ) ) )? ) )
            // InternalAPIMappingLanguage.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'MappingRepository:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_portApiMappings_4_0= rulePortApiMapping ) ) (otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) ) )* )? otherlv_7= '}' (otherlv_8= '#' ( (lv_comment_9_0= ruleEString ) ) )? )
            {
            // InternalAPIMappingLanguage.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'MappingRepository:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_portApiMappings_4_0= rulePortApiMapping ) ) (otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) ) )* )? otherlv_7= '}' (otherlv_8= '#' ( (lv_comment_9_0= ruleEString ) ) )? )
            // InternalAPIMappingLanguage.g:81:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'MappingRepository:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_portApiMappings_4_0= rulePortApiMapping ) ) (otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) ) )* )? otherlv_7= '}' (otherlv_8= '#' ( (lv_comment_9_0= ruleEString ) ) )?
            {
            // InternalAPIMappingLanguage.g:81:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:82:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalAPIMappingLanguage.g:82:1: (lv_imports_0_0= ruleImport )
            	    // InternalAPIMappingLanguage.g:83:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingRepositoryAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMappingRepositoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getMappingRepositoryAccess().getMappingRepositoryKeyword_1());
                
            // InternalAPIMappingLanguage.g:103:1: ( (lv_name_2_0= ruleEString ) )
            // InternalAPIMappingLanguage.g:104:1: (lv_name_2_0= ruleEString )
            {
            // InternalAPIMappingLanguage.g:104:1: (lv_name_2_0= ruleEString )
            // InternalAPIMappingLanguage.g:105:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMappingRepositoryAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMappingRepositoryRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_3, grammarAccess.getMappingRepositoryAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalAPIMappingLanguage.g:125:1: ( ( (lv_portApiMappings_4_0= rulePortApiMapping ) ) (otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAPIMappingLanguage.g:125:2: ( (lv_portApiMappings_4_0= rulePortApiMapping ) ) (otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) ) )*
                    {
                    // InternalAPIMappingLanguage.g:125:2: ( (lv_portApiMappings_4_0= rulePortApiMapping ) )
                    // InternalAPIMappingLanguage.g:126:1: (lv_portApiMappings_4_0= rulePortApiMapping )
                    {
                    // InternalAPIMappingLanguage.g:126:1: (lv_portApiMappings_4_0= rulePortApiMapping )
                    // InternalAPIMappingLanguage.g:127:3: lv_portApiMappings_4_0= rulePortApiMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsPortApiMappingParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_portApiMappings_4_0=rulePortApiMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMappingRepositoryRule());
                    	        }
                           		add(
                           			current, 
                           			"portApiMappings",
                            		lv_portApiMappings_4_0, 
                            		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.PortApiMapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalAPIMappingLanguage.g:143:2: (otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalAPIMappingLanguage.g:143:4: otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_8); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getMappingRepositoryAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // InternalAPIMappingLanguage.g:147:1: ( (lv_portApiMappings_6_0= rulePortApiMapping ) )
                    	    // InternalAPIMappingLanguage.g:148:1: (lv_portApiMappings_6_0= rulePortApiMapping )
                    	    {
                    	    // InternalAPIMappingLanguage.g:148:1: (lv_portApiMappings_6_0= rulePortApiMapping )
                    	    // InternalAPIMappingLanguage.g:149:3: lv_portApiMappings_6_0= rulePortApiMapping
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsPortApiMappingParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_portApiMappings_6_0=rulePortApiMapping();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMappingRepositoryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"portApiMappings",
                    	            		lv_portApiMappings_6_0, 
                    	            		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.PortApiMapping");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_9); 

                	newLeafNode(otherlv_7, grammarAccess.getMappingRepositoryAccess().getRightCurlyBracketKeyword_5());
                
            // InternalAPIMappingLanguage.g:169:1: (otherlv_8= '#' ( (lv_comment_9_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAPIMappingLanguage.g:169:3: otherlv_8= '#' ( (lv_comment_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); 

                        	newLeafNode(otherlv_8, grammarAccess.getMappingRepositoryAccess().getNumberSignKeyword_6_0());
                        
                    // InternalAPIMappingLanguage.g:173:1: ( (lv_comment_9_0= ruleEString ) )
                    // InternalAPIMappingLanguage.g:174:1: (lv_comment_9_0= ruleEString )
                    {
                    // InternalAPIMappingLanguage.g:174:1: (lv_comment_9_0= ruleEString )
                    // InternalAPIMappingLanguage.g:175:3: lv_comment_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMappingRepositoryAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_comment_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMappingRepositoryRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_9_0, 
                            		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.EString");
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
    // $ANTLR end "ruleMappingRepository"


    // $ANTLR start "entryRuleImport"
    // InternalAPIMappingLanguage.g:199:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAPIMappingLanguage.g:200:2: (iv_ruleImport= ruleImport EOF )
            // InternalAPIMappingLanguage.g:201:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalAPIMappingLanguage.g:208:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:211:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalAPIMappingLanguage.g:212:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalAPIMappingLanguage.g:212:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalAPIMappingLanguage.g:212:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_10); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // InternalAPIMappingLanguage.g:216:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalAPIMappingLanguage.g:217:1: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalAPIMappingLanguage.g:217:1: (lv_importURI_1_0= RULE_STRING )
            // InternalAPIMappingLanguage.g:218:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePortApiMapping"
    // InternalAPIMappingLanguage.g:242:1: entryRulePortApiMapping returns [EObject current=null] : iv_rulePortApiMapping= rulePortApiMapping EOF ;
    public final EObject entryRulePortApiMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortApiMapping = null;


        try {
            // InternalAPIMappingLanguage.g:243:2: (iv_rulePortApiMapping= rulePortApiMapping EOF )
            // InternalAPIMappingLanguage.g:244:2: iv_rulePortApiMapping= rulePortApiMapping EOF
            {
             newCompositeNode(grammarAccess.getPortApiMappingRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePortApiMapping=rulePortApiMapping();

            state._fsp--;

             current =iv_rulePortApiMapping; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRulePortApiMapping"


    // $ANTLR start "rulePortApiMapping"
    // InternalAPIMappingLanguage.g:251:1: rulePortApiMapping returns [EObject current=null] : (otherlv_0= 'PortInstance:' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'execCommand:' ( (lv_execCommand_4_0= ruleEntry ) ) (otherlv_5= 'initCommand:' ( (lv_initCommand_6_0= ruleEntry ) ) )? otherlv_7= '}' ) ;
    public final EObject rulePortApiMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_execCommand_4_0 = null;

        EObject lv_initCommand_6_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:254:28: ( (otherlv_0= 'PortInstance:' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'execCommand:' ( (lv_execCommand_4_0= ruleEntry ) ) (otherlv_5= 'initCommand:' ( (lv_initCommand_6_0= ruleEntry ) ) )? otherlv_7= '}' ) )
            // InternalAPIMappingLanguage.g:255:1: (otherlv_0= 'PortInstance:' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'execCommand:' ( (lv_execCommand_4_0= ruleEntry ) ) (otherlv_5= 'initCommand:' ( (lv_initCommand_6_0= ruleEntry ) ) )? otherlv_7= '}' )
            {
            // InternalAPIMappingLanguage.g:255:1: (otherlv_0= 'PortInstance:' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'execCommand:' ( (lv_execCommand_4_0= ruleEntry ) ) (otherlv_5= 'initCommand:' ( (lv_initCommand_6_0= ruleEntry ) ) )? otherlv_7= '}' )
            // InternalAPIMappingLanguage.g:255:3: otherlv_0= 'PortInstance:' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'execCommand:' ( (lv_execCommand_4_0= ruleEntry ) ) (otherlv_5= 'initCommand:' ( (lv_initCommand_6_0= ruleEntry ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getPortApiMappingAccess().getPortInstanceKeyword_0());
                
            // InternalAPIMappingLanguage.g:259:1: ( ( ruleEString ) )
            // InternalAPIMappingLanguage.g:260:1: ( ruleEString )
            {
            // InternalAPIMappingLanguage.g:260:1: ( ruleEString )
            // InternalAPIMappingLanguage.g:261:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPortApiMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPortApiMappingAccess().getPortContinuousPortInstanceCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_5);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_11); 

                	newLeafNode(otherlv_2, grammarAccess.getPortApiMappingAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_12); 

                	newLeafNode(otherlv_3, grammarAccess.getPortApiMappingAccess().getExecCommandKeyword_3());
                
            // InternalAPIMappingLanguage.g:282:1: ( (lv_execCommand_4_0= ruleEntry ) )
            // InternalAPIMappingLanguage.g:283:1: (lv_execCommand_4_0= ruleEntry )
            {
            // InternalAPIMappingLanguage.g:283:1: (lv_execCommand_4_0= ruleEntry )
            // InternalAPIMappingLanguage.g:284:3: lv_execCommand_4_0= ruleEntry
            {
             
            	        newCompositeNode(grammarAccess.getPortApiMappingAccess().getExecCommandEntryParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_13);
            lv_execCommand_4_0=ruleEntry();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPortApiMappingRule());
            	        }
                   		set(
                   			current, 
                   			"execCommand",
                    		lv_execCommand_4_0, 
                    		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Entry");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalAPIMappingLanguage.g:300:2: (otherlv_5= 'initCommand:' ( (lv_initCommand_6_0= ruleEntry ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAPIMappingLanguage.g:300:4: otherlv_5= 'initCommand:' ( (lv_initCommand_6_0= ruleEntry ) )
                    {
                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_12); 

                        	newLeafNode(otherlv_5, grammarAccess.getPortApiMappingAccess().getInitCommandKeyword_5_0());
                        
                    // InternalAPIMappingLanguage.g:304:1: ( (lv_initCommand_6_0= ruleEntry ) )
                    // InternalAPIMappingLanguage.g:305:1: (lv_initCommand_6_0= ruleEntry )
                    {
                    // InternalAPIMappingLanguage.g:305:1: (lv_initCommand_6_0= ruleEntry )
                    // InternalAPIMappingLanguage.g:306:3: lv_initCommand_6_0= ruleEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getPortApiMappingAccess().getInitCommandEntryParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_initCommand_6_0=ruleEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPortApiMappingRule());
                    	        }
                           		set(
                           			current, 
                           			"initCommand",
                            		lv_initCommand_6_0, 
                            		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Entry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getPortApiMappingAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "rulePortApiMapping"


    // $ANTLR start "entryRuleExpression"
    // InternalAPIMappingLanguage.g:334:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAPIMappingLanguage.g:335:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalAPIMappingLanguage.g:336:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:343:1: ruleExpression returns [EObject current=null] : (this_APICallExpression_0= ruleAPICallExpression | this_LogicalExpression_1= ruleLogicalExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_APICallExpression_0 = null;

        EObject this_LogicalExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:346:28: ( (this_APICallExpression_0= ruleAPICallExpression | this_LogicalExpression_1= ruleLogicalExpression ) )
            // InternalAPIMappingLanguage.g:347:1: (this_APICallExpression_0= ruleAPICallExpression | this_LogicalExpression_1= ruleLogicalExpression )
            {
            // InternalAPIMappingLanguage.g:347:1: (this_APICallExpression_0= ruleAPICallExpression | this_LogicalExpression_1= ruleLogicalExpression )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_MINORMAXKEYWORD)||LA6_0==25||LA6_0==44||LA6_0==57||(LA6_0>=61 && LA6_0<=66)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAPIMappingLanguage.g:348:5: this_APICallExpression_0= ruleAPICallExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getAPICallExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_APICallExpression_0=ruleAPICallExpression();

                    state._fsp--;

                     
                            current = this_APICallExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:358:5: this_LogicalExpression_1= ruleLogicalExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getLogicalExpressionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LogicalExpression_1=ruleLogicalExpression();

                    state._fsp--;

                     
                            current = this_LogicalExpression_1; 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEnumerationValueExpression"
    // InternalAPIMappingLanguage.g:374:1: entryRuleEnumerationValueExpression returns [EObject current=null] : iv_ruleEnumerationValueExpression= ruleEnumerationValueExpression EOF ;
    public final EObject entryRuleEnumerationValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationValueExpression = null;


        try {
            // InternalAPIMappingLanguage.g:375:2: (iv_ruleEnumerationValueExpression= ruleEnumerationValueExpression EOF )
            // InternalAPIMappingLanguage.g:376:2: iv_ruleEnumerationValueExpression= ruleEnumerationValueExpression EOF
            {
             newCompositeNode(grammarAccess.getEnumerationValueExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEnumerationValueExpression=ruleEnumerationValueExpression();

            state._fsp--;

             current =iv_ruleEnumerationValueExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumerationValueExpression"


    // $ANTLR start "ruleEnumerationValueExpression"
    // InternalAPIMappingLanguage.g:383:1: ruleEnumerationValueExpression returns [EObject current=null] : (otherlv_0= 'enum:' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEnumerationValueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:386:28: ( (otherlv_0= 'enum:' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAPIMappingLanguage.g:387:1: (otherlv_0= 'enum:' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAPIMappingLanguage.g:387:1: (otherlv_0= 'enum:' ( (otherlv_1= RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:387:3: otherlv_0= 'enum:' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerationValueExpressionAccess().getEnumKeyword_0());
                
            // InternalAPIMappingLanguage.g:391:1: ( (otherlv_1= RULE_ID ) )
            // InternalAPIMappingLanguage.g:392:1: (otherlv_1= RULE_ID )
            {
            // InternalAPIMappingLanguage.g:392:1: (otherlv_1= RULE_ID )
            // InternalAPIMappingLanguage.g:393:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumerationValueExpressionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		newLeafNode(otherlv_1, grammarAccess.getEnumerationValueExpressionAccess().getEnumValueEnumerationValueCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleEnumerationValueExpression"


    // $ANTLR start "entryRuleAPICallExpression"
    // InternalAPIMappingLanguage.g:412:1: entryRuleAPICallExpression returns [EObject current=null] : iv_ruleAPICallExpression= ruleAPICallExpression EOF ;
    public final EObject entryRuleAPICallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAPICallExpression = null;


        try {
            // InternalAPIMappingLanguage.g:413:2: (iv_ruleAPICallExpression= ruleAPICallExpression EOF )
            // InternalAPIMappingLanguage.g:414:2: iv_ruleAPICallExpression= ruleAPICallExpression EOF
            {
             newCompositeNode(grammarAccess.getAPICallExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAPICallExpression=ruleAPICallExpression();

            state._fsp--;

             current =iv_ruleAPICallExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAPICallExpression"


    // $ANTLR start "ruleAPICallExpression"
    // InternalAPIMappingLanguage.g:421:1: ruleAPICallExpression returns [EObject current=null] : (otherlv_0= 'API_Call:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameterBindings_3_0= ruleParamaterBinding ) ) (otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleAPICallExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameterBindings_3_0 = null;

        EObject lv_parameterBindings_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:424:28: ( (otherlv_0= 'API_Call:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameterBindings_3_0= ruleParamaterBinding ) ) (otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) ) )* )? otherlv_6= ')' ) )
            // InternalAPIMappingLanguage.g:425:1: (otherlv_0= 'API_Call:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameterBindings_3_0= ruleParamaterBinding ) ) (otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) ) )* )? otherlv_6= ')' )
            {
            // InternalAPIMappingLanguage.g:425:1: (otherlv_0= 'API_Call:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameterBindings_3_0= ruleParamaterBinding ) ) (otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) ) )* )? otherlv_6= ')' )
            // InternalAPIMappingLanguage.g:425:3: otherlv_0= 'API_Call:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameterBindings_3_0= ruleParamaterBinding ) ) (otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getAPICallExpressionAccess().getAPI_CallKeyword_0());
                
            // InternalAPIMappingLanguage.g:429:1: ( (otherlv_1= RULE_ID ) )
            // InternalAPIMappingLanguage.g:430:1: (otherlv_1= RULE_ID )
            {
            // InternalAPIMappingLanguage.g:430:1: (otherlv_1= RULE_ID )
            // InternalAPIMappingLanguage.g:431:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAPICallExpressionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); 

            		newLeafNode(otherlv_1, grammarAccess.getAPICallExpressionAccess().getApiCommandAPICommandCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_2, grammarAccess.getAPICallExpressionAccess().getLeftParenthesisKeyword_2());
                
            // InternalAPIMappingLanguage.g:446:1: ( ( (lv_parameterBindings_3_0= ruleParamaterBinding ) ) (otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAPIMappingLanguage.g:446:2: ( (lv_parameterBindings_3_0= ruleParamaterBinding ) ) (otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) ) )*
                    {
                    // InternalAPIMappingLanguage.g:446:2: ( (lv_parameterBindings_3_0= ruleParamaterBinding ) )
                    // InternalAPIMappingLanguage.g:447:1: (lv_parameterBindings_3_0= ruleParamaterBinding )
                    {
                    // InternalAPIMappingLanguage.g:447:1: (lv_parameterBindings_3_0= ruleParamaterBinding )
                    // InternalAPIMappingLanguage.g:448:3: lv_parameterBindings_3_0= ruleParamaterBinding
                    {
                     
                    	        newCompositeNode(grammarAccess.getAPICallExpressionAccess().getParameterBindingsParamaterBindingParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_17);
                    lv_parameterBindings_3_0=ruleParamaterBinding();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAPICallExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameterBindings",
                            		lv_parameterBindings_3_0, 
                            		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.ParamaterBinding");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalAPIMappingLanguage.g:464:2: (otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAPIMappingLanguage.g:464:4: otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_4); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getAPICallExpressionAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // InternalAPIMappingLanguage.g:468:1: ( (lv_parameterBindings_5_0= ruleParamaterBinding ) )
                    	    // InternalAPIMappingLanguage.g:469:1: (lv_parameterBindings_5_0= ruleParamaterBinding )
                    	    {
                    	    // InternalAPIMappingLanguage.g:469:1: (lv_parameterBindings_5_0= ruleParamaterBinding )
                    	    // InternalAPIMappingLanguage.g:470:3: lv_parameterBindings_5_0= ruleParamaterBinding
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAPICallExpressionAccess().getParameterBindingsParamaterBindingParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_17);
                    	    lv_parameterBindings_5_0=ruleParamaterBinding();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAPICallExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameterBindings",
                    	            		lv_parameterBindings_5_0, 
                    	            		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.ParamaterBinding");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getAPICallExpressionAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleAPICallExpression"


    // $ANTLR start "entryRuleParamaterBinding"
    // InternalAPIMappingLanguage.g:498:1: entryRuleParamaterBinding returns [EObject current=null] : iv_ruleParamaterBinding= ruleParamaterBinding EOF ;
    public final EObject entryRuleParamaterBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamaterBinding = null;


        try {
            // InternalAPIMappingLanguage.g:499:2: (iv_ruleParamaterBinding= ruleParamaterBinding EOF )
            // InternalAPIMappingLanguage.g:500:2: iv_ruleParamaterBinding= ruleParamaterBinding EOF
            {
             newCompositeNode(grammarAccess.getParamaterBindingRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParamaterBinding=ruleParamaterBinding();

            state._fsp--;

             current =iv_ruleParamaterBinding; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:507:1: ruleParamaterBinding returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions ) ) ) ) ;
    public final EObject ruleParamaterBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_3_1 = null;

        EObject lv_value_3_2 = null;

        EObject lv_value_3_3 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:510:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions ) ) ) ) )
            // InternalAPIMappingLanguage.g:511:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions ) ) ) )
            {
            // InternalAPIMappingLanguage.g:511:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions ) ) ) )
            // InternalAPIMappingLanguage.g:511:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions ) ) )
            {
            // InternalAPIMappingLanguage.g:511:2: ()
            // InternalAPIMappingLanguage.g:512:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParamaterBindingAccess().getParameterBindingAction_0(),
                        current);
                

            }

            // InternalAPIMappingLanguage.g:517:2: ( (otherlv_1= RULE_ID ) )
            // InternalAPIMappingLanguage.g:518:1: (otherlv_1= RULE_ID )
            {
            // InternalAPIMappingLanguage.g:518:1: (otherlv_1= RULE_ID )
            // InternalAPIMappingLanguage.g:519:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParamaterBindingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); 

            		newLeafNode(otherlv_1, grammarAccess.getParamaterBindingAccess().getParameterParameterCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_19); 

                	newLeafNode(otherlv_2, grammarAccess.getParamaterBindingAccess().getColonEqualsSignKeyword_2());
                
            // InternalAPIMappingLanguage.g:534:1: ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions ) ) )
            // InternalAPIMappingLanguage.g:535:1: ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions ) )
            {
            // InternalAPIMappingLanguage.g:535:1: ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions ) )
            // InternalAPIMappingLanguage.g:536:1: (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions )
            {
            // InternalAPIMappingLanguage.g:536:1: (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case RULE_NUMBER:
            case RULE_BOOLEAN:
            case RULE_MINORMAXKEYWORD:
            case 24:
            case 25:
            case 44:
            case 57:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 28:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAPIMappingLanguage.g:537:3: lv_value_3_1= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getParamaterBindingAccess().getValueExpressionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_3_1=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParamaterBindingRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_1, 
                            		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:552:8: lv_value_3_2= ruleEnumerationValueExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getParamaterBindingAccess().getValueEnumerationValueExpressionParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_3_2=ruleEnumerationValueExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParamaterBindingRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_2, 
                            		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.EnumerationValueExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:567:8: lv_value_3_3= ruleContiniousPortExpressions
                    {
                     
                    	        newCompositeNode(grammarAccess.getParamaterBindingAccess().getValueContiniousPortExpressionsParserRuleCall_3_0_2()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_3_3=ruleContiniousPortExpressions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParamaterBindingRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_3, 
                            		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.ContiniousPortExpressions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleParamaterBinding"


    // $ANTLR start "entryRuleContiniousPortExpressions"
    // InternalAPIMappingLanguage.g:593:1: entryRuleContiniousPortExpressions returns [EObject current=null] : iv_ruleContiniousPortExpressions= ruleContiniousPortExpressions EOF ;
    public final EObject entryRuleContiniousPortExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContiniousPortExpressions = null;


        try {
            // InternalAPIMappingLanguage.g:594:2: (iv_ruleContiniousPortExpressions= ruleContiniousPortExpressions EOF )
            // InternalAPIMappingLanguage.g:595:2: iv_ruleContiniousPortExpressions= ruleContiniousPortExpressions EOF
            {
             newCompositeNode(grammarAccess.getContiniousPortExpressionsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContiniousPortExpressions=ruleContiniousPortExpressions();

            state._fsp--;

             current =iv_ruleContiniousPortExpressions; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleContiniousPortExpressions"


    // $ANTLR start "ruleContiniousPortExpressions"
    // InternalAPIMappingLanguage.g:602:1: ruleContiniousPortExpressions returns [EObject current=null] : (otherlv_0= 'port:' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleContiniousPortExpressions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:605:28: ( (otherlv_0= 'port:' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAPIMappingLanguage.g:606:1: (otherlv_0= 'port:' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAPIMappingLanguage.g:606:1: (otherlv_0= 'port:' ( (otherlv_1= RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:606:3: otherlv_0= 'port:' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getContiniousPortExpressionsAccess().getPortKeyword_0());
                
            // InternalAPIMappingLanguage.g:610:1: ( (otherlv_1= RULE_ID ) )
            // InternalAPIMappingLanguage.g:611:1: (otherlv_1= RULE_ID )
            {
            // InternalAPIMappingLanguage.g:611:1: (otherlv_1= RULE_ID )
            // InternalAPIMappingLanguage.g:612:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContiniousPortExpressionsRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		newLeafNode(otherlv_1, grammarAccess.getContiniousPortExpressionsAccess().getContinuousPortContinuousPortInstanceCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleContiniousPortExpressions"


    // $ANTLR start "entryRuleExpressionStartRule"
    // InternalAPIMappingLanguage.g:631:1: entryRuleExpressionStartRule returns [EObject current=null] : iv_ruleExpressionStartRule= ruleExpressionStartRule EOF ;
    public final EObject entryRuleExpressionStartRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStartRule = null;


        try {
            // InternalAPIMappingLanguage.g:632:2: (iv_ruleExpressionStartRule= ruleExpressionStartRule EOF )
            // InternalAPIMappingLanguage.g:633:2: iv_ruleExpressionStartRule= ruleExpressionStartRule EOF
            {
             newCompositeNode(grammarAccess.getExpressionStartRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpressionStartRule=ruleExpressionStartRule();

            state._fsp--;

             current =iv_ruleExpressionStartRule; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:640:1: ruleExpressionStartRule returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement | this_APICallExpression_8= ruleAPICallExpression ) ;
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

        EObject this_APICallExpression_8 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:643:28: ( (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement | this_APICallExpression_8= ruleAPICallExpression ) )
            // InternalAPIMappingLanguage.g:644:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement | this_APICallExpression_8= ruleAPICallExpression )
            {
            // InternalAPIMappingLanguage.g:644:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement | this_APICallExpression_8= ruleAPICallExpression )
            int alt10=9;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalAPIMappingLanguage.g:645:5: this_Assignment_0= ruleAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getAssignmentParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;

                     
                            current = this_Assignment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:655:5: this_ForLoop_1= ruleForLoop
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getForLoopParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ForLoop_1=ruleForLoop();

                    state._fsp--;

                     
                            current = this_ForLoop_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:665:5: this_WhileLoop_2= ruleWhileLoop
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getWhileLoopParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_WhileLoop_2=ruleWhileLoop();

                    state._fsp--;

                     
                            current = this_WhileLoop_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalAPIMappingLanguage.g:675:5: this_DoWhileLoop_3= ruleDoWhileLoop
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getDoWhileLoopParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DoWhileLoop_3=ruleDoWhileLoop();

                    state._fsp--;

                     
                            current = this_DoWhileLoop_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalAPIMappingLanguage.g:685:5: this_IfStatement_4= ruleIfStatement
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getIfStatementParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IfStatement_4=ruleIfStatement();

                    state._fsp--;

                     
                            current = this_IfStatement_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalAPIMappingLanguage.g:695:5: this_ReturnStatement_5= ruleReturnStatement
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getReturnStatementParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReturnStatement_5=ruleReturnStatement();

                    state._fsp--;

                     
                            current = this_ReturnStatement_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalAPIMappingLanguage.g:705:5: this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getLocalVariableOrConstantDeclarationStatementParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LocalVariableOrConstantDeclarationStatement_6=ruleLocalVariableOrConstantDeclarationStatement();

                    state._fsp--;

                     
                            current = this_LocalVariableOrConstantDeclarationStatement_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalAPIMappingLanguage.g:715:5: this_OperationCallStatement_7= ruleOperationCallStatement
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getOperationCallStatementParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_OperationCallStatement_7=ruleOperationCallStatement();

                    state._fsp--;

                     
                            current = this_OperationCallStatement_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalAPIMappingLanguage.g:725:5: this_APICallExpression_8= ruleAPICallExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getAPICallExpressionParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_APICallExpression_8=ruleAPICallExpression();

                    state._fsp--;

                     
                            current = this_APICallExpression_8; 
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
    // $ANTLR end "ruleExpressionStartRule"


    // $ANTLR start "entryRuleEString"
    // InternalAPIMappingLanguage.g:741:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAPIMappingLanguage.g:742:2: (iv_ruleEString= ruleEString EOF )
            // InternalAPIMappingLanguage.g:743:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:750:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_QualifiedName_1= ruleQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_QualifiedName_1 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:753:28: ( (this_ID_0= RULE_ID | this_QualifiedName_1= ruleQualifiedName ) )
            // InternalAPIMappingLanguage.g:754:1: (this_ID_0= RULE_ID | this_QualifiedName_1= ruleQualifiedName )
            {
            // InternalAPIMappingLanguage.g:754:1: (this_ID_0= RULE_ID | this_QualifiedName_1= ruleQualifiedName )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==29) ) {
                    alt11=2;
                }
                else if ( (LA11_1==EOF||LA11_1==15) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAPIMappingLanguage.g:754:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getEStringAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:763:5: this_QualifiedName_1= ruleQualifiedName
                    {
                     
                            newCompositeNode(grammarAccess.getEStringAccess().getQualifiedNameParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_QualifiedName_1=ruleQualifiedName();

                    state._fsp--;


                    		current.merge(this_QualifiedName_1);
                        
                     
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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAPIMappingLanguage.g:781:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAPIMappingLanguage.g:782:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAPIMappingLanguage.g:783:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:790:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:793:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // InternalAPIMappingLanguage.g:794:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // InternalAPIMappingLanguage.g:794:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // InternalAPIMappingLanguage.g:794:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_20); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // InternalAPIMappingLanguage.g:801:1: (kw= '.' this_ID_2= RULE_ID )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:802:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,29,FollowSets000.FOLLOW_4); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEntry"
    // InternalAPIMappingLanguage.g:822:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalAPIMappingLanguage.g:823:2: (iv_ruleEntry= ruleEntry EOF )
            // InternalAPIMappingLanguage.g:824:2: iv_ruleEntry= ruleEntry EOF
            {
             newCompositeNode(grammarAccess.getEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEntry=ruleEntry();

            state._fsp--;

             current =iv_ruleEntry; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // InternalAPIMappingLanguage.g:831:1: ruleEntry returns [EObject current=null] : (this_Block_0= ruleBlock | this_Expression_1= ruleExpression | this_ArrayInitializeExpression_2= ruleArrayInitializeExpression ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_Expression_1 = null;

        EObject this_ArrayInitializeExpression_2 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:834:28: ( (this_Block_0= ruleBlock | this_Expression_1= ruleExpression | this_ArrayInitializeExpression_2= ruleArrayInitializeExpression ) )
            // InternalAPIMappingLanguage.g:835:1: (this_Block_0= ruleBlock | this_Expression_1= ruleExpression | this_ArrayInitializeExpression_2= ruleArrayInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:835:1: (this_Block_0= ruleBlock | this_Expression_1= ruleExpression | this_ArrayInitializeExpression_2= ruleArrayInitializeExpression )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_NUMBER:
            case RULE_BOOLEAN:
            case RULE_MINORMAXKEYWORD:
            case 24:
            case 25:
            case 44:
            case 57:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt13=2;
                }
                break;
            case 39:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAPIMappingLanguage.g:836:5: this_Block_0= ruleBlock
                    {
                     
                            newCompositeNode(grammarAccess.getEntryAccess().getBlockParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Block_0=ruleBlock();

                    state._fsp--;

                     
                            current = this_Block_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:846:5: this_Expression_1= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getEntryAccess().getExpressionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:856:5: this_ArrayInitializeExpression_2= ruleArrayInitializeExpression
                    {
                     
                            newCompositeNode(grammarAccess.getEntryAccess().getArrayInitializeExpressionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ArrayInitializeExpression_2=ruleArrayInitializeExpression();

                    state._fsp--;

                     
                            current = this_ArrayInitializeExpression_2; 
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
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleBlock"
    // InternalAPIMappingLanguage.g:872:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalAPIMappingLanguage.g:876:2: (iv_ruleBlock= ruleBlock EOF )
            // InternalAPIMappingLanguage.g:877:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:887:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalAPIMappingLanguage.g:891:28: ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' ) )
            // InternalAPIMappingLanguage.g:892:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' )
            {
            // InternalAPIMappingLanguage.g:892:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' )
            // InternalAPIMappingLanguage.g:892:2: () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}'
            {
            // InternalAPIMappingLanguage.g:892:2: ()
            // InternalAPIMappingLanguage.g:893:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalAPIMappingLanguage.g:902:1: ( (lv_expressions_2_0= ruleExpressionStartRule ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==24||LA14_0==30||(LA14_0>=32 && LA14_0<=33)||LA14_0==35||LA14_0==38||LA14_0==41) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:903:1: (lv_expressions_2_0= ruleExpressionStartRule )
            	    {
            	    // InternalAPIMappingLanguage.g:903:1: (lv_expressions_2_0= ruleExpressionStartRule )
            	    // InternalAPIMappingLanguage.g:904:3: lv_expressions_2_0= ruleExpressionStartRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockAccess().getExpressionsExpressionStartRuleParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    lv_expressions_2_0=ruleExpressionStartRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_2_0, 
            	            		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.ExpressionStartRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleForLoop"
    // InternalAPIMappingLanguage.g:935:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // InternalAPIMappingLanguage.g:936:2: (iv_ruleForLoop= ruleForLoop EOF )
            // InternalAPIMappingLanguage.g:937:2: iv_ruleForLoop= ruleForLoop EOF
            {
             newCompositeNode(grammarAccess.getForLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleForLoop=ruleForLoop();

            state._fsp--;

             current =iv_ruleForLoop; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:944:1: ruleForLoop returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) ) ;
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
            // InternalAPIMappingLanguage.g:947:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) ) )
            // InternalAPIMappingLanguage.g:948:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) )
            {
            // InternalAPIMappingLanguage.g:948:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) )
            // InternalAPIMappingLanguage.g:948:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_0, grammarAccess.getForLoopAccess().getForKeyword_0());
                
            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1());
                
            // InternalAPIMappingLanguage.g:956:1: ( (lv_initializeExpression_2_0= ruleAssignment ) )
            // InternalAPIMappingLanguage.g:957:1: (lv_initializeExpression_2_0= ruleAssignment )
            {
            // InternalAPIMappingLanguage.g:957:1: (lv_initializeExpression_2_0= ruleAssignment )
            // InternalAPIMappingLanguage.g:958:3: lv_initializeExpression_2_0= ruleAssignment
            {
             
            	        newCompositeNode(grammarAccess.getForLoopAccess().getInitializeExpressionAssignmentParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_23);
            lv_initializeExpression_2_0=ruleAssignment();

            state._fsp--;


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

            // InternalAPIMappingLanguage.g:974:2: ( (lv_loopTest_3_0= ruleExpression ) )
            // InternalAPIMappingLanguage.g:975:1: (lv_loopTest_3_0= ruleExpression )
            {
            // InternalAPIMappingLanguage.g:975:1: (lv_loopTest_3_0= ruleExpression )
            // InternalAPIMappingLanguage.g:976:3: lv_loopTest_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getForLoopAccess().getLoopTestExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_24);
            lv_loopTest_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForLoopRule());
            	        }
                   		set(
                   			current, 
                   			"loopTest",
                    		lv_loopTest_3_0, 
                    		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_4, grammarAccess.getForLoopAccess().getSemicolonKeyword_4());
                
            // InternalAPIMappingLanguage.g:996:1: ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) )
            // InternalAPIMappingLanguage.g:997:1: (lv_countingExpression_5_0= ruleForLoopCountingExpression )
            {
            // InternalAPIMappingLanguage.g:997:1: (lv_countingExpression_5_0= ruleForLoopCountingExpression )
            // InternalAPIMappingLanguage.g:998:3: lv_countingExpression_5_0= ruleForLoopCountingExpression
            {
             
            	        newCompositeNode(grammarAccess.getForLoopAccess().getCountingExpressionForLoopCountingExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_25);
            lv_countingExpression_5_0=ruleForLoopCountingExpression();

            state._fsp--;


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

            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_6, grammarAccess.getForLoopAccess().getRightParenthesisKeyword_6());
                
            // InternalAPIMappingLanguage.g:1018:1: ( (lv_block_7_0= ruleBlock ) )
            // InternalAPIMappingLanguage.g:1019:1: (lv_block_7_0= ruleBlock )
            {
            // InternalAPIMappingLanguage.g:1019:1: (lv_block_7_0= ruleBlock )
            // InternalAPIMappingLanguage.g:1020:3: lv_block_7_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_block_7_0=ruleBlock();

            state._fsp--;


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
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleForLoopCountingExpression"
    // InternalAPIMappingLanguage.g:1044:1: entryRuleForLoopCountingExpression returns [EObject current=null] : iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF ;
    public final EObject entryRuleForLoopCountingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoopCountingExpression = null;


        try {
            // InternalAPIMappingLanguage.g:1045:2: (iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF )
            // InternalAPIMappingLanguage.g:1046:2: iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF
            {
             newCompositeNode(grammarAccess.getForLoopCountingExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleForLoopCountingExpression=ruleForLoopCountingExpression();

            state._fsp--;

             current =iv_ruleForLoopCountingExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:1053:1: ruleForLoopCountingExpression returns [EObject current=null] : ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) ) ) ;
    public final EObject ruleForLoopCountingExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_typedNamedElementExpression_0_0 = null;

        Enumerator lv_incrementDecrementOperator_1_0 = null;

        Enumerator lv_assignOperator_2_0 = null;

        EObject lv_rhs_assignExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:1056:28: ( ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) ) ) )
            // InternalAPIMappingLanguage.g:1057:1: ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) ) )
            {
            // InternalAPIMappingLanguage.g:1057:1: ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) ) )
            // InternalAPIMappingLanguage.g:1057:2: ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) )
            {
            // InternalAPIMappingLanguage.g:1057:2: ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) )
            // InternalAPIMappingLanguage.g:1058:1: (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression )
            {
            // InternalAPIMappingLanguage.g:1058:1: (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression )
            // InternalAPIMappingLanguage.g:1059:3: lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression
            {
             
            	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getLhs_typedNamedElementExpressionTypedNamedElementExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_26);
            lv_lhs_typedNamedElementExpression_0_0=ruleTypedNamedElementExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForLoopCountingExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"lhs_typedNamedElementExpression",
                    		lv_lhs_typedNamedElementExpression_0_0, 
                    		"org.muml.pim.actionlanguage.xtext.ActionLanguage.TypedNamedElementExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalAPIMappingLanguage.g:1075:2: ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=46 && LA15_0<=47)) ) {
                alt15=1;
            }
            else if ( (LA15_0==27||(LA15_0>=48 && LA15_0<=49)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1075:3: ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) )
                    {
                    // InternalAPIMappingLanguage.g:1075:3: ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) )
                    // InternalAPIMappingLanguage.g:1076:1: (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator )
                    {
                    // InternalAPIMappingLanguage.g:1076:1: (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator )
                    // InternalAPIMappingLanguage.g:1077:3: lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorUnaryPostIncrementDecrementOperatorEnumRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_incrementDecrementOperator_1_0=ruleUnaryPostIncrementDecrementOperator();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:1094:6: ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) )
                    {
                    // InternalAPIMappingLanguage.g:1094:6: ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) )
                    // InternalAPIMappingLanguage.g:1094:7: ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) )
                    {
                    // InternalAPIMappingLanguage.g:1094:7: ( (lv_assignOperator_2_0= ruleAssignOperator ) )
                    // InternalAPIMappingLanguage.g:1095:1: (lv_assignOperator_2_0= ruleAssignOperator )
                    {
                    // InternalAPIMappingLanguage.g:1095:1: (lv_assignOperator_2_0= ruleAssignOperator )
                    // InternalAPIMappingLanguage.g:1096:3: lv_assignOperator_2_0= ruleAssignOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_23);
                    lv_assignOperator_2_0=ruleAssignOperator();

                    state._fsp--;


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

                    // InternalAPIMappingLanguage.g:1112:2: ( (lv_rhs_assignExpression_3_0= ruleExpression ) )
                    // InternalAPIMappingLanguage.g:1113:1: (lv_rhs_assignExpression_3_0= ruleExpression )
                    {
                    // InternalAPIMappingLanguage.g:1113:1: (lv_rhs_assignExpression_3_0= ruleExpression )
                    // InternalAPIMappingLanguage.g:1114:3: lv_rhs_assignExpression_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getRhs_assignExpressionExpressionParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_rhs_assignExpression_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForLoopCountingExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rhs_assignExpression",
                            		lv_rhs_assignExpression_3_0, 
                            		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleForLoopCountingExpression"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalAPIMappingLanguage.g:1138:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalAPIMappingLanguage.g:1139:2: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalAPIMappingLanguage.g:1140:2: iv_ruleWhileLoop= ruleWhileLoop EOF
            {
             newCompositeNode(grammarAccess.getWhileLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleWhileLoop=ruleWhileLoop();

            state._fsp--;

             current =iv_ruleWhileLoop; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:1147:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_loopTest_2_0 = null;

        EObject lv_block_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:1150:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) )
            // InternalAPIMappingLanguage.g:1151:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            {
            // InternalAPIMappingLanguage.g:1151:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            // InternalAPIMappingLanguage.g:1151:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileKeyword_0());
                
            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_23); 

                	newLeafNode(otherlv_1, grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1());
                
            // InternalAPIMappingLanguage.g:1159:1: ( (lv_loopTest_2_0= ruleExpression ) )
            // InternalAPIMappingLanguage.g:1160:1: (lv_loopTest_2_0= ruleExpression )
            {
            // InternalAPIMappingLanguage.g:1160:1: (lv_loopTest_2_0= ruleExpression )
            // InternalAPIMappingLanguage.g:1161:3: lv_loopTest_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getWhileLoopAccess().getLoopTestExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_25);
            lv_loopTest_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            	        }
                   		set(
                   			current, 
                   			"loopTest",
                    		lv_loopTest_2_0, 
                    		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3());
                
            // InternalAPIMappingLanguage.g:1181:1: ( (lv_block_4_0= ruleBlock ) )
            // InternalAPIMappingLanguage.g:1182:1: (lv_block_4_0= ruleBlock )
            {
            // InternalAPIMappingLanguage.g:1182:1: (lv_block_4_0= ruleBlock )
            // InternalAPIMappingLanguage.g:1183:3: lv_block_4_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getWhileLoopAccess().getBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_block_4_0=ruleBlock();

            state._fsp--;


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
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleDoWhileLoop"
    // InternalAPIMappingLanguage.g:1207:1: entryRuleDoWhileLoop returns [EObject current=null] : iv_ruleDoWhileLoop= ruleDoWhileLoop EOF ;
    public final EObject entryRuleDoWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhileLoop = null;


        try {
            // InternalAPIMappingLanguage.g:1208:2: (iv_ruleDoWhileLoop= ruleDoWhileLoop EOF )
            // InternalAPIMappingLanguage.g:1209:2: iv_ruleDoWhileLoop= ruleDoWhileLoop EOF
            {
             newCompositeNode(grammarAccess.getDoWhileLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDoWhileLoop=ruleDoWhileLoop();

            state._fsp--;

             current =iv_ruleDoWhileLoop; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:1216:1: ruleDoWhileLoop returns [EObject current=null] : (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' ) ;
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
            // InternalAPIMappingLanguage.g:1219:28: ( (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' ) )
            // InternalAPIMappingLanguage.g:1220:1: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' )
            {
            // InternalAPIMappingLanguage.g:1220:1: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' )
            // InternalAPIMappingLanguage.g:1220:3: otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getDoWhileLoopAccess().getDoKeyword_0());
                
            // InternalAPIMappingLanguage.g:1224:1: ( (lv_block_1_0= ruleBlock ) )
            // InternalAPIMappingLanguage.g:1225:1: (lv_block_1_0= ruleBlock )
            {
            // InternalAPIMappingLanguage.g:1225:1: (lv_block_1_0= ruleBlock )
            // InternalAPIMappingLanguage.g:1226:3: lv_block_1_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getDoWhileLoopAccess().getBlockBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_27);
            lv_block_1_0=ruleBlock();

            state._fsp--;


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

            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_2, grammarAccess.getDoWhileLoopAccess().getWhileKeyword_2());
                
            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_23); 

                	newLeafNode(otherlv_3, grammarAccess.getDoWhileLoopAccess().getLeftParenthesisKeyword_3());
                
            // InternalAPIMappingLanguage.g:1250:1: ( (lv_loopTest_4_0= ruleExpression ) )
            // InternalAPIMappingLanguage.g:1251:1: (lv_loopTest_4_0= ruleExpression )
            {
            // InternalAPIMappingLanguage.g:1251:1: (lv_loopTest_4_0= ruleExpression )
            // InternalAPIMappingLanguage.g:1252:3: lv_loopTest_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getDoWhileLoopAccess().getLoopTestExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_28);
            lv_loopTest_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDoWhileLoopRule());
            	        }
                   		set(
                   			current, 
                   			"loopTest",
                    		lv_loopTest_4_0, 
                    		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getDoWhileLoopAccess().getRightParenthesisSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleDoWhileLoop"


    // $ANTLR start "entryRuleIfStatement"
    // InternalAPIMappingLanguage.g:1280:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalAPIMappingLanguage.g:1281:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalAPIMappingLanguage.g:1282:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:1289:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( (lv_elseIfStatements_5_0= ruleElseIfStatement ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBlock ) ) )? ) ;
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
            // InternalAPIMappingLanguage.g:1292:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( (lv_elseIfStatements_5_0= ruleElseIfStatement ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBlock ) ) )? ) )
            // InternalAPIMappingLanguage.g:1293:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( (lv_elseIfStatements_5_0= ruleElseIfStatement ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBlock ) ) )? )
            {
            // InternalAPIMappingLanguage.g:1293:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( (lv_elseIfStatements_5_0= ruleElseIfStatement ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBlock ) ) )? )
            // InternalAPIMappingLanguage.g:1293:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( (lv_elseIfStatements_5_0= ruleElseIfStatement ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBlock ) ) )?
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_23); 

                	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                
            // InternalAPIMappingLanguage.g:1301:1: ( (lv_ifCondition_2_0= ruleExpression ) )
            // InternalAPIMappingLanguage.g:1302:1: (lv_ifCondition_2_0= ruleExpression )
            {
            // InternalAPIMappingLanguage.g:1302:1: (lv_ifCondition_2_0= ruleExpression )
            // InternalAPIMappingLanguage.g:1303:3: lv_ifCondition_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getIfStatementAccess().getIfConditionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_25);
            lv_ifCondition_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	        }
                   		set(
                   			current, 
                   			"ifCondition",
                    		lv_ifCondition_2_0, 
                    		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                
            // InternalAPIMappingLanguage.g:1323:1: ( (lv_ifBlock_4_0= ruleBlock ) )
            // InternalAPIMappingLanguage.g:1324:1: (lv_ifBlock_4_0= ruleBlock )
            {
            // InternalAPIMappingLanguage.g:1324:1: (lv_ifBlock_4_0= ruleBlock )
            // InternalAPIMappingLanguage.g:1325:3: lv_ifBlock_4_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getIfStatementAccess().getIfBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_29);
            lv_ifBlock_4_0=ruleBlock();

            state._fsp--;


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

            // InternalAPIMappingLanguage.g:1341:2: ( (lv_elseIfStatements_5_0= ruleElseIfStatement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==37) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:1342:1: (lv_elseIfStatements_5_0= ruleElseIfStatement )
            	    {
            	    // InternalAPIMappingLanguage.g:1342:1: (lv_elseIfStatements_5_0= ruleElseIfStatement )
            	    // InternalAPIMappingLanguage.g:1343:3: lv_elseIfStatements_5_0= ruleElseIfStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseIfStatementsElseIfStatementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    lv_elseIfStatements_5_0=ruleElseIfStatement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalAPIMappingLanguage.g:1359:3: (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBlock ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1359:5: otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBlock ) )
                    {
                    otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getElseKeyword_6_0());
                        
                    // InternalAPIMappingLanguage.g:1363:1: ( (lv_elseBlock_7_0= ruleBlock ) )
                    // InternalAPIMappingLanguage.g:1364:1: (lv_elseBlock_7_0= ruleBlock )
                    {
                    // InternalAPIMappingLanguage.g:1364:1: (lv_elseBlock_7_0= ruleBlock )
                    // InternalAPIMappingLanguage.g:1365:3: lv_elseBlock_7_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_elseBlock_7_0=ruleBlock();

                    state._fsp--;


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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleElseIfStatement"
    // InternalAPIMappingLanguage.g:1389:1: entryRuleElseIfStatement returns [EObject current=null] : iv_ruleElseIfStatement= ruleElseIfStatement EOF ;
    public final EObject entryRuleElseIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfStatement = null;


        try {
            // InternalAPIMappingLanguage.g:1390:2: (iv_ruleElseIfStatement= ruleElseIfStatement EOF )
            // InternalAPIMappingLanguage.g:1391:2: iv_ruleElseIfStatement= ruleElseIfStatement EOF
            {
             newCompositeNode(grammarAccess.getElseIfStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleElseIfStatement=ruleElseIfStatement();

            state._fsp--;

             current =iv_ruleElseIfStatement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:1398:1: ruleElseIfStatement returns [EObject current=null] : (otherlv_0= 'elseif' otherlv_1= '(' ( (lv_elseIfCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_elseIfBlock_4_0= ruleBlock ) ) ) ;
    public final EObject ruleElseIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elseIfCondition_2_0 = null;

        EObject lv_elseIfBlock_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:1401:28: ( (otherlv_0= 'elseif' otherlv_1= '(' ( (lv_elseIfCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_elseIfBlock_4_0= ruleBlock ) ) ) )
            // InternalAPIMappingLanguage.g:1402:1: (otherlv_0= 'elseif' otherlv_1= '(' ( (lv_elseIfCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_elseIfBlock_4_0= ruleBlock ) ) )
            {
            // InternalAPIMappingLanguage.g:1402:1: (otherlv_0= 'elseif' otherlv_1= '(' ( (lv_elseIfCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_elseIfBlock_4_0= ruleBlock ) ) )
            // InternalAPIMappingLanguage.g:1402:3: otherlv_0= 'elseif' otherlv_1= '(' ( (lv_elseIfCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_elseIfBlock_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_0, grammarAccess.getElseIfStatementAccess().getElseifKeyword_0());
                
            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_23); 

                	newLeafNode(otherlv_1, grammarAccess.getElseIfStatementAccess().getLeftParenthesisKeyword_1());
                
            // InternalAPIMappingLanguage.g:1410:1: ( (lv_elseIfCondition_2_0= ruleExpression ) )
            // InternalAPIMappingLanguage.g:1411:1: (lv_elseIfCondition_2_0= ruleExpression )
            {
            // InternalAPIMappingLanguage.g:1411:1: (lv_elseIfCondition_2_0= ruleExpression )
            // InternalAPIMappingLanguage.g:1412:3: lv_elseIfCondition_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getElseIfStatementAccess().getElseIfConditionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_25);
            lv_elseIfCondition_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElseIfStatementRule());
            	        }
                   		set(
                   			current, 
                   			"elseIfCondition",
                    		lv_elseIfCondition_2_0, 
                    		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getElseIfStatementAccess().getRightParenthesisKeyword_3());
                
            // InternalAPIMappingLanguage.g:1432:1: ( (lv_elseIfBlock_4_0= ruleBlock ) )
            // InternalAPIMappingLanguage.g:1433:1: (lv_elseIfBlock_4_0= ruleBlock )
            {
            // InternalAPIMappingLanguage.g:1433:1: (lv_elseIfBlock_4_0= ruleBlock )
            // InternalAPIMappingLanguage.g:1434:3: lv_elseIfBlock_4_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getElseIfStatementAccess().getElseIfBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_elseIfBlock_4_0=ruleBlock();

            state._fsp--;


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
    // $ANTLR end "ruleElseIfStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalAPIMappingLanguage.g:1458:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalAPIMappingLanguage.g:1459:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalAPIMappingLanguage.g:1460:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
             newCompositeNode(grammarAccess.getReturnStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;

             current =iv_ruleReturnStatement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:1467:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:1470:28: ( ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalAPIMappingLanguage.g:1471:1: ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalAPIMappingLanguage.g:1471:1: ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalAPIMappingLanguage.g:1471:2: () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // InternalAPIMappingLanguage.g:1471:2: ()
            // InternalAPIMappingLanguage.g:1472:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_23); 

                	newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getReturnKeyword_1());
                
            // InternalAPIMappingLanguage.g:1481:1: ( (lv_expression_2_0= ruleExpression ) )
            // InternalAPIMappingLanguage.g:1482:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalAPIMappingLanguage.g:1482:1: (lv_expression_2_0= ruleExpression )
            // InternalAPIMappingLanguage.g:1483:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_24);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReturnStatementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getReturnStatementAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleOperationCallStatement"
    // InternalAPIMappingLanguage.g:1511:1: entryRuleOperationCallStatement returns [EObject current=null] : iv_ruleOperationCallStatement= ruleOperationCallStatement EOF ;
    public final EObject entryRuleOperationCallStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCallStatement = null;


        try {
            // InternalAPIMappingLanguage.g:1512:2: (iv_ruleOperationCallStatement= ruleOperationCallStatement EOF )
            // InternalAPIMappingLanguage.g:1513:2: iv_ruleOperationCallStatement= ruleOperationCallStatement EOF
            {
             newCompositeNode(grammarAccess.getOperationCallStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOperationCallStatement=ruleOperationCallStatement();

            state._fsp--;

             current =iv_ruleOperationCallStatement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:1520:1: ruleOperationCallStatement returns [EObject current=null] : (this_OperationCall_0= ruleOperationCall otherlv_1= ';' ) ;
    public final EObject ruleOperationCallStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_OperationCall_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:1523:28: ( (this_OperationCall_0= ruleOperationCall otherlv_1= ';' ) )
            // InternalAPIMappingLanguage.g:1524:1: (this_OperationCall_0= ruleOperationCall otherlv_1= ';' )
            {
            // InternalAPIMappingLanguage.g:1524:1: (this_OperationCall_0= ruleOperationCall otherlv_1= ';' )
            // InternalAPIMappingLanguage.g:1525:5: this_OperationCall_0= ruleOperationCall otherlv_1= ';'
            {
             
                    newCompositeNode(grammarAccess.getOperationCallStatementAccess().getOperationCallParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_24);
            this_OperationCall_0=ruleOperationCall();

            state._fsp--;

             
                    current = this_OperationCall_0; 
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getOperationCallStatementAccess().getSemicolonKeyword_1());
                

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
    // $ANTLR end "ruleOperationCallStatement"


    // $ANTLR start "entryRuleAssignment"
    // InternalAPIMappingLanguage.g:1545:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalAPIMappingLanguage.g:1546:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalAPIMappingLanguage.g:1547:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:1554:1: ruleAssignment returns [EObject current=null] : ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_lhs_typedNamedElementExpression_0_0 = null;

        Enumerator lv_assignOperator_1_0 = null;

        EObject lv_rhs_assignExpression_2_0 = null;

        Enumerator lv_incrementDecrementOperator_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:1557:28: ( ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) ) otherlv_4= ';' ) )
            // InternalAPIMappingLanguage.g:1558:1: ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) ) otherlv_4= ';' )
            {
            // InternalAPIMappingLanguage.g:1558:1: ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) ) otherlv_4= ';' )
            // InternalAPIMappingLanguage.g:1558:2: ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) ) otherlv_4= ';'
            {
            // InternalAPIMappingLanguage.g:1558:2: ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) )
            // InternalAPIMappingLanguage.g:1559:1: (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression )
            {
            // InternalAPIMappingLanguage.g:1559:1: (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression )
            // InternalAPIMappingLanguage.g:1560:3: lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getLhs_typedNamedElementExpressionTypedNamedElementExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_26);
            lv_lhs_typedNamedElementExpression_0_0=ruleTypedNamedElementExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"lhs_typedNamedElementExpression",
                    		lv_lhs_typedNamedElementExpression_0_0, 
                    		"org.muml.pim.actionlanguage.xtext.ActionLanguage.TypedNamedElementExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalAPIMappingLanguage.g:1576:2: ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27||(LA18_0>=48 && LA18_0<=49)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=46 && LA18_0<=47)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1576:3: ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) )
                    {
                    // InternalAPIMappingLanguage.g:1576:3: ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) )
                    // InternalAPIMappingLanguage.g:1576:4: ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) )
                    {
                    // InternalAPIMappingLanguage.g:1576:4: ( (lv_assignOperator_1_0= ruleAssignOperator ) )
                    // InternalAPIMappingLanguage.g:1577:1: (lv_assignOperator_1_0= ruleAssignOperator )
                    {
                    // InternalAPIMappingLanguage.g:1577:1: (lv_assignOperator_1_0= ruleAssignOperator )
                    // InternalAPIMappingLanguage.g:1578:3: lv_assignOperator_1_0= ruleAssignOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_assignOperator_1_0=ruleAssignOperator();

                    state._fsp--;


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

                    // InternalAPIMappingLanguage.g:1594:2: ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) )
                    // InternalAPIMappingLanguage.g:1595:1: (lv_rhs_assignExpression_2_0= ruleInitializeExpression )
                    {
                    // InternalAPIMappingLanguage.g:1595:1: (lv_rhs_assignExpression_2_0= ruleInitializeExpression )
                    // InternalAPIMappingLanguage.g:1596:3: lv_rhs_assignExpression_2_0= ruleInitializeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getRhs_assignExpressionInitializeExpressionParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_rhs_assignExpression_2_0=ruleInitializeExpression();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:1613:6: ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) )
                    {
                    // InternalAPIMappingLanguage.g:1613:6: ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) )
                    // InternalAPIMappingLanguage.g:1614:1: (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator )
                    {
                    // InternalAPIMappingLanguage.g:1614:1: (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator )
                    // InternalAPIMappingLanguage.g:1615:3: lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorUnaryPostIncrementDecrementOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_incrementDecrementOperator_3_0=ruleUnaryPostIncrementDecrementOperator();

                    state._fsp--;


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
                    break;

            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleInitializeExpression"
    // InternalAPIMappingLanguage.g:1643:1: entryRuleInitializeExpression returns [EObject current=null] : iv_ruleInitializeExpression= ruleInitializeExpression EOF ;
    public final EObject entryRuleInitializeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitializeExpression = null;


        try {
            // InternalAPIMappingLanguage.g:1644:2: (iv_ruleInitializeExpression= ruleInitializeExpression EOF )
            // InternalAPIMappingLanguage.g:1645:2: iv_ruleInitializeExpression= ruleInitializeExpression EOF
            {
             newCompositeNode(grammarAccess.getInitializeExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInitializeExpression=ruleInitializeExpression();

            state._fsp--;

             current =iv_ruleInitializeExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:1652:1: ruleInitializeExpression returns [EObject current=null] : (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression ) ;
    public final EObject ruleInitializeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArrayInitializeExpression_0 = null;

        EObject this_NondeterministicChoiceExpression_1 = null;

        EObject this_Expression_2 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:1655:28: ( (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression ) )
            // InternalAPIMappingLanguage.g:1656:1: (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression )
            {
            // InternalAPIMappingLanguage.g:1656:1: (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression )
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1657:5: this_ArrayInitializeExpression_0= ruleArrayInitializeExpression
                    {
                     
                            newCompositeNode(grammarAccess.getInitializeExpressionAccess().getArrayInitializeExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ArrayInitializeExpression_0=ruleArrayInitializeExpression();

                    state._fsp--;

                     
                            current = this_ArrayInitializeExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:1667:5: this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression
                    {
                     
                            newCompositeNode(grammarAccess.getInitializeExpressionAccess().getNondeterministicChoiceExpressionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NondeterministicChoiceExpression_1=ruleNondeterministicChoiceExpression();

                    state._fsp--;

                     
                            current = this_NondeterministicChoiceExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:1677:5: this_Expression_2= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getInitializeExpressionAccess().getExpressionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Expression_2=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_2; 
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
    // $ANTLR end "ruleInitializeExpression"


    // $ANTLR start "entryRuleArrayInitializeExpression"
    // InternalAPIMappingLanguage.g:1693:1: entryRuleArrayInitializeExpression returns [EObject current=null] : iv_ruleArrayInitializeExpression= ruleArrayInitializeExpression EOF ;
    public final EObject entryRuleArrayInitializeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayInitializeExpression = null;


        try {
            // InternalAPIMappingLanguage.g:1694:2: (iv_ruleArrayInitializeExpression= ruleArrayInitializeExpression EOF )
            // InternalAPIMappingLanguage.g:1695:2: iv_ruleArrayInitializeExpression= ruleArrayInitializeExpression EOF
            {
             newCompositeNode(grammarAccess.getArrayInitializeExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArrayInitializeExpression=ruleArrayInitializeExpression();

            state._fsp--;

             current =iv_ruleArrayInitializeExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:1702:1: ruleArrayInitializeExpression returns [EObject current=null] : (otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayInitializeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:1705:28: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']' ) )
            // InternalAPIMappingLanguage.g:1706:1: (otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']' )
            {
            // InternalAPIMappingLanguage.g:1706:1: (otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']' )
            // InternalAPIMappingLanguage.g:1706:3: otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_12); 

                	newLeafNode(otherlv_0, grammarAccess.getArrayInitializeExpressionAccess().getLeftSquareBracketKeyword_0());
                
            // InternalAPIMappingLanguage.g:1710:1: ( (lv_expressions_1_0= ruleInitializeExpression ) )
            // InternalAPIMappingLanguage.g:1711:1: (lv_expressions_1_0= ruleInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:1711:1: (lv_expressions_1_0= ruleInitializeExpression )
            // InternalAPIMappingLanguage.g:1712:3: lv_expressions_1_0= ruleInitializeExpression
            {
             
            	        newCompositeNode(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsInitializeExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_30);
            lv_expressions_1_0=ruleInitializeExpression();

            state._fsp--;


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

            // InternalAPIMappingLanguage.g:1728:2: (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:1728:4: otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_12); 

            	        	newLeafNode(otherlv_2, grammarAccess.getArrayInitializeExpressionAccess().getCommaKeyword_2_0());
            	        
            	    // InternalAPIMappingLanguage.g:1732:1: ( (lv_expressions_3_0= ruleInitializeExpression ) )
            	    // InternalAPIMappingLanguage.g:1733:1: (lv_expressions_3_0= ruleInitializeExpression )
            	    {
            	    // InternalAPIMappingLanguage.g:1733:1: (lv_expressions_3_0= ruleInitializeExpression )
            	    // InternalAPIMappingLanguage.g:1734:3: lv_expressions_3_0= ruleInitializeExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsInitializeExpressionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    lv_expressions_3_0=ruleInitializeExpression();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getArrayInitializeExpressionAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleArrayInitializeExpression"


    // $ANTLR start "entryRuleLocalVariableOrConstantDeclarationStatement"
    // InternalAPIMappingLanguage.g:1762:1: entryRuleLocalVariableOrConstantDeclarationStatement returns [EObject current=null] : iv_ruleLocalVariableOrConstantDeclarationStatement= ruleLocalVariableOrConstantDeclarationStatement EOF ;
    public final EObject entryRuleLocalVariableOrConstantDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariableOrConstantDeclarationStatement = null;


        try {
            // InternalAPIMappingLanguage.g:1763:2: (iv_ruleLocalVariableOrConstantDeclarationStatement= ruleLocalVariableOrConstantDeclarationStatement EOF )
            // InternalAPIMappingLanguage.g:1764:2: iv_ruleLocalVariableOrConstantDeclarationStatement= ruleLocalVariableOrConstantDeclarationStatement EOF
            {
             newCompositeNode(grammarAccess.getLocalVariableOrConstantDeclarationStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLocalVariableOrConstantDeclarationStatement=ruleLocalVariableOrConstantDeclarationStatement();

            state._fsp--;

             current =iv_ruleLocalVariableOrConstantDeclarationStatement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:1771:1: ruleLocalVariableOrConstantDeclarationStatement returns [EObject current=null] : ( ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) ) ) ;
    public final EObject ruleLocalVariableOrConstantDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_0_1 = null;

        EObject lv_variable_0_2 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:1774:28: ( ( ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) ) ) )
            // InternalAPIMappingLanguage.g:1775:1: ( ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) ) )
            {
            // InternalAPIMappingLanguage.g:1775:1: ( ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) ) )
            // InternalAPIMappingLanguage.g:1776:1: ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) )
            {
            // InternalAPIMappingLanguage.g:1776:1: ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) )
            // InternalAPIMappingLanguage.g:1777:1: (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration )
            {
            // InternalAPIMappingLanguage.g:1777:1: (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==41) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1778:3: lv_variable_0_1= ruleLocalVariableDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableLocalVariableDeclarationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_variable_0_1=ruleLocalVariableDeclaration();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:1793:8: lv_variable_0_2= ruleLocalConstantDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableLocalConstantDeclarationParserRuleCall_0_1()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_variable_0_2=ruleLocalConstantDeclaration();

                    state._fsp--;


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
                    break;

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
    // $ANTLR end "ruleLocalVariableOrConstantDeclarationStatement"


    // $ANTLR start "entryRuleLocalVariableDeclaration"
    // InternalAPIMappingLanguage.g:1819:1: entryRuleLocalVariableDeclaration returns [EObject current=null] : iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF ;
    public final EObject entryRuleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariableDeclaration = null;


        try {
            // InternalAPIMappingLanguage.g:1820:2: (iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF )
            // InternalAPIMappingLanguage.g:1821:2: iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getLocalVariableDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLocalVariableDeclaration=ruleLocalVariableDeclaration();

            state._fsp--;

             current =iv_ruleLocalVariableDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:1828:1: ruleLocalVariableDeclaration returns [EObject current=null] : ( ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_initializeExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:1831:28: ( ( ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';' ) )
            // InternalAPIMappingLanguage.g:1832:1: ( ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';' )
            {
            // InternalAPIMappingLanguage.g:1832:1: ( ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';' )
            // InternalAPIMappingLanguage.g:1832:2: ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';'
            {
            // InternalAPIMappingLanguage.g:1832:2: ( ( ruleDATATYPE ) )
            // InternalAPIMappingLanguage.g:1833:1: ( ruleDATATYPE )
            {
            // InternalAPIMappingLanguage.g:1833:1: ( ruleDATATYPE )
            // InternalAPIMappingLanguage.g:1834:3: ruleDATATYPE
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalVariableDeclarationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeDataTypeCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_4);
            ruleDATATYPE();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalAPIMappingLanguage.g:1847:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalAPIMappingLanguage.g:1848:1: (lv_name_1_0= RULE_ID )
            {
            // InternalAPIMappingLanguage.g:1848:1: (lv_name_1_0= RULE_ID )
            // InternalAPIMappingLanguage.g:1849:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_31); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLocalVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalVariableDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.muml.pim.actionlanguage.xtext.ActionLanguage.ID");
            	    

            }


            }

            // InternalAPIMappingLanguage.g:1865:2: (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1865:4: otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) )
                    {
                    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_12); 

                        	newLeafNode(otherlv_2, grammarAccess.getLocalVariableDeclarationAccess().getColonEqualsSignKeyword_2_0());
                        
                    // InternalAPIMappingLanguage.g:1869:1: ( (lv_initializeExpression_3_0= ruleInitializeExpression ) )
                    // InternalAPIMappingLanguage.g:1870:1: (lv_initializeExpression_3_0= ruleInitializeExpression )
                    {
                    // InternalAPIMappingLanguage.g:1870:1: (lv_initializeExpression_3_0= ruleInitializeExpression )
                    // InternalAPIMappingLanguage.g:1871:3: lv_initializeExpression_3_0= ruleInitializeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalVariableDeclarationAccess().getInitializeExpressionInitializeExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_initializeExpression_3_0=ruleInitializeExpression();

                    state._fsp--;


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
                    break;

            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getLocalVariableDeclarationAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleLocalVariableDeclaration"


    // $ANTLR start "entryRuleLocalConstantDeclaration"
    // InternalAPIMappingLanguage.g:1899:1: entryRuleLocalConstantDeclaration returns [EObject current=null] : iv_ruleLocalConstantDeclaration= ruleLocalConstantDeclaration EOF ;
    public final EObject entryRuleLocalConstantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalConstantDeclaration = null;


        try {
            // InternalAPIMappingLanguage.g:1900:2: (iv_ruleLocalConstantDeclaration= ruleLocalConstantDeclaration EOF )
            // InternalAPIMappingLanguage.g:1901:2: iv_ruleLocalConstantDeclaration= ruleLocalConstantDeclaration EOF
            {
             newCompositeNode(grammarAccess.getLocalConstantDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLocalConstantDeclaration=ruleLocalConstantDeclaration();

            state._fsp--;

             current =iv_ruleLocalConstantDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:1908:1: ruleLocalConstantDeclaration returns [EObject current=null] : ( ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleLocalConstantDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_initializeExpression_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:1911:28: ( ( ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';' ) )
            // InternalAPIMappingLanguage.g:1912:1: ( ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';' )
            {
            // InternalAPIMappingLanguage.g:1912:1: ( ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';' )
            // InternalAPIMappingLanguage.g:1912:2: ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';'
            {
            // InternalAPIMappingLanguage.g:1912:2: ( (lv_constant_0_0= 'const' ) )
            // InternalAPIMappingLanguage.g:1913:1: (lv_constant_0_0= 'const' )
            {
            // InternalAPIMappingLanguage.g:1913:1: (lv_constant_0_0= 'const' )
            // InternalAPIMappingLanguage.g:1914:3: lv_constant_0_0= 'const'
            {
            lv_constant_0_0=(Token)match(input,41,FollowSets000.FOLLOW_4); 

                    newLeafNode(lv_constant_0_0, grammarAccess.getLocalConstantDeclarationAccess().getConstantConstKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalConstantDeclarationRule());
            	        }
                   		setWithLastConsumed(current, "constant", true, "const");
            	    

            }


            }

            // InternalAPIMappingLanguage.g:1927:2: ( ( ruleDATATYPE ) )
            // InternalAPIMappingLanguage.g:1928:1: ( ruleDATATYPE )
            {
            // InternalAPIMappingLanguage.g:1928:1: ( ruleDATATYPE )
            // InternalAPIMappingLanguage.g:1929:3: ruleDATATYPE
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalConstantDeclarationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeDataTypeCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_4);
            ruleDATATYPE();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalAPIMappingLanguage.g:1942:2: ( (lv_name_2_0= RULE_ID ) )
            // InternalAPIMappingLanguage.g:1943:1: (lv_name_2_0= RULE_ID )
            {
            // InternalAPIMappingLanguage.g:1943:1: (lv_name_2_0= RULE_ID )
            // InternalAPIMappingLanguage.g:1944:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); 

            			newLeafNode(lv_name_2_0, grammarAccess.getLocalConstantDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalConstantDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.muml.pim.actionlanguage.xtext.ActionLanguage.ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_12); 

                	newLeafNode(otherlv_3, grammarAccess.getLocalConstantDeclarationAccess().getColonEqualsSignKeyword_3());
                
            // InternalAPIMappingLanguage.g:1964:1: ( (lv_initializeExpression_4_0= ruleInitializeExpression ) )
            // InternalAPIMappingLanguage.g:1965:1: (lv_initializeExpression_4_0= ruleInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:1965:1: (lv_initializeExpression_4_0= ruleInitializeExpression )
            // InternalAPIMappingLanguage.g:1966:3: lv_initializeExpression_4_0= ruleInitializeExpression
            {
             
            	        newCompositeNode(grammarAccess.getLocalConstantDeclarationAccess().getInitializeExpressionInitializeExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_24);
            lv_initializeExpression_4_0=ruleInitializeExpression();

            state._fsp--;


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

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getLocalConstantDeclarationAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleLocalConstantDeclaration"


    // $ANTLR start "entryRuleNondeterministicChoiceExpression"
    // InternalAPIMappingLanguage.g:1994:1: entryRuleNondeterministicChoiceExpression returns [EObject current=null] : iv_ruleNondeterministicChoiceExpression= ruleNondeterministicChoiceExpression EOF ;
    public final EObject entryRuleNondeterministicChoiceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNondeterministicChoiceExpression = null;


        try {
            // InternalAPIMappingLanguage.g:1995:2: (iv_ruleNondeterministicChoiceExpression= ruleNondeterministicChoiceExpression EOF )
            // InternalAPIMappingLanguage.g:1996:2: iv_ruleNondeterministicChoiceExpression= ruleNondeterministicChoiceExpression EOF
            {
             newCompositeNode(grammarAccess.getNondeterministicChoiceExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNondeterministicChoiceExpression=ruleNondeterministicChoiceExpression();

            state._fsp--;

             current =iv_ruleNondeterministicChoiceExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2003:1: ruleNondeterministicChoiceExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) ) ) ;
    public final EObject ruleNondeterministicChoiceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_range_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:2006:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) ) ) )
            // InternalAPIMappingLanguage.g:2007:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) ) )
            {
            // InternalAPIMappingLanguage.g:2007:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) ) )
            // InternalAPIMappingLanguage.g:2007:2: ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) )
            {
            // InternalAPIMappingLanguage.g:2007:2: ( (otherlv_0= RULE_ID ) )
            // InternalAPIMappingLanguage.g:2008:1: (otherlv_0= RULE_ID )
            {
            // InternalAPIMappingLanguage.g:2008:1: (otherlv_0= RULE_ID )
            // InternalAPIMappingLanguage.g:2009:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNondeterministicChoiceExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_32); 

            		newLeafNode(otherlv_0, grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypePrimitiveDataTypeCrossReference_0_0()); 
            	

            }


            }

            // InternalAPIMappingLanguage.g:2020:2: ( (lv_range_1_0= ruleRange ) )
            // InternalAPIMappingLanguage.g:2021:1: (lv_range_1_0= ruleRange )
            {
            // InternalAPIMappingLanguage.g:2021:1: (lv_range_1_0= ruleRange )
            // InternalAPIMappingLanguage.g:2022:3: lv_range_1_0= ruleRange
            {
             
            	        newCompositeNode(grammarAccess.getNondeterministicChoiceExpressionAccess().getRangeRangeParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_range_1_0=ruleRange();

            state._fsp--;


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
    // $ANTLR end "ruleNondeterministicChoiceExpression"


    // $ANTLR start "entryRuleRange"
    // InternalAPIMappingLanguage.g:2046:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalAPIMappingLanguage.g:2047:2: (iv_ruleRange= ruleRange EOF )
            // InternalAPIMappingLanguage.g:2048:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2055:1: ruleRange returns [EObject current=null] : (otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lowerBound_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:2058:28: ( (otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>' ) )
            // InternalAPIMappingLanguage.g:2059:1: (otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>' )
            {
            // InternalAPIMappingLanguage.g:2059:1: (otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>' )
            // InternalAPIMappingLanguage.g:2059:3: otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_33); 

                	newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLessThanSignKeyword_0());
                
            // InternalAPIMappingLanguage.g:2063:1: ( (lv_lowerBound_1_0= ruleLONG ) )
            // InternalAPIMappingLanguage.g:2064:1: (lv_lowerBound_1_0= ruleLONG )
            {
            // InternalAPIMappingLanguage.g:2064:1: (lv_lowerBound_1_0= ruleLONG )
            // InternalAPIMappingLanguage.g:2065:3: lv_lowerBound_1_0= ruleLONG
            {
             
            	        newCompositeNode(grammarAccess.getRangeAccess().getLowerBoundLONGParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_34);
            lv_lowerBound_1_0=ruleLONG();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRangeRule());
            	        }
                   		set(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_1_0, 
                    		"org.muml.pim.actionlanguage.xtext.ActionLanguage.LONG");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_33); 

                	newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getCommaKeyword_2());
                
            // InternalAPIMappingLanguage.g:2085:1: ( (lv_upperBound_3_0= ruleLONG ) )
            // InternalAPIMappingLanguage.g:2086:1: (lv_upperBound_3_0= ruleLONG )
            {
            // InternalAPIMappingLanguage.g:2086:1: (lv_upperBound_3_0= ruleLONG )
            // InternalAPIMappingLanguage.g:2087:3: lv_upperBound_3_0= ruleLONG
            {
             
            	        newCompositeNode(grammarAccess.getRangeAccess().getUpperBoundLONGParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_35);
            lv_upperBound_3_0=ruleLONG();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRangeRule());
            	        }
                   		set(
                   			current, 
                   			"upperBound",
                    		lv_upperBound_3_0, 
                    		"org.muml.pim.actionlanguage.xtext.ActionLanguage.LONG");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getRangeAccess().getGreaterThanSignKeyword_4());
                

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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleLONG"
    // InternalAPIMappingLanguage.g:2115:1: entryRuleLONG returns [String current=null] : iv_ruleLONG= ruleLONG EOF ;
    public final String entryRuleLONG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLONG = null;


        try {
            // InternalAPIMappingLanguage.g:2116:2: (iv_ruleLONG= ruleLONG EOF )
            // InternalAPIMappingLanguage.g:2117:2: iv_ruleLONG= ruleLONG EOF
            {
             newCompositeNode(grammarAccess.getLONGRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLONG=ruleLONG();

            state._fsp--;

             current =iv_ruleLONG.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2124:1: ruleLONG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLONG() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:2127:28: (this_INT_0= RULE_INT )
            // InternalAPIMappingLanguage.g:2128:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getLONGAccess().getINTTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleLONG"


    // $ANTLR start "entryRuleLogicalExpression"
    // InternalAPIMappingLanguage.g:2143:1: entryRuleLogicalExpression returns [EObject current=null] : iv_ruleLogicalExpression= ruleLogicalExpression EOF ;
    public final EObject entryRuleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalExpression = null;


        try {
            // InternalAPIMappingLanguage.g:2144:2: (iv_ruleLogicalExpression= ruleLogicalExpression EOF )
            // InternalAPIMappingLanguage.g:2145:2: iv_ruleLogicalExpression= ruleLogicalExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLogicalExpression=ruleLogicalExpression();

            state._fsp--;

             current =iv_ruleLogicalExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2152:1: ruleLogicalExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:2155:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalAPIMappingLanguage.g:2157:5: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
             
                    newCompositeNode(grammarAccess.getLogicalExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;

             
                    current = this_LogicalOrExpression_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleLogicalExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalAPIMappingLanguage.g:2173:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalAPIMappingLanguage.g:2174:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalAPIMappingLanguage.g:2175:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;

             current =iv_ruleLogicalOrExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2182:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:2185:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* ) )
            // InternalAPIMappingLanguage.g:2186:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // InternalAPIMappingLanguage.g:2186:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* )
            // InternalAPIMappingLanguage.g:2187:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_36);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;

             
                    current = this_LogicalAndExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalAPIMappingLanguage.g:2195:1: ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==50) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:2195:2: () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // InternalAPIMappingLanguage.g:2195:2: ()
            	    // InternalAPIMappingLanguage.g:2196:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLogicalOrExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalAPIMappingLanguage.g:2201:2: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
            	    // InternalAPIMappingLanguage.g:2202:1: (lv_operator_2_0= ruleLogicalOrOperator )
            	    {
            	    // InternalAPIMappingLanguage.g:2202:1: (lv_operator_2_0= ruleLogicalOrOperator )
            	    // InternalAPIMappingLanguage.g:2203:3: lv_operator_2_0= ruleLogicalOrOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    lv_operator_2_0=ruleLogicalOrOperator();

            	    state._fsp--;


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

            	    // InternalAPIMappingLanguage.g:2219:2: ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) )
            	    // InternalAPIMappingLanguage.g:2220:1: (lv_rightExpression_3_0= ruleLogicalAndExpression )
            	    {
            	    // InternalAPIMappingLanguage.g:2220:1: (lv_rightExpression_3_0= ruleLogicalAndExpression )
            	    // InternalAPIMappingLanguage.g:2221:3: lv_rightExpression_3_0= ruleLogicalAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionLogicalAndExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_36);
            	    lv_rightExpression_3_0=ruleLogicalAndExpression();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalAPIMappingLanguage.g:2245:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalAPIMappingLanguage.g:2246:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalAPIMappingLanguage.g:2247:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;

             current =iv_ruleLogicalAndExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2254:1: ruleLogicalAndExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:2257:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalAPIMappingLanguage.g:2258:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalAPIMappingLanguage.g:2258:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            // InternalAPIMappingLanguage.g:2259:5: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_37);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;

             
                    current = this_ComparisonExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalAPIMappingLanguage.g:2267:1: ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==51) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:2267:2: () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalAPIMappingLanguage.g:2267:2: ()
            	    // InternalAPIMappingLanguage.g:2268:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLogicalAndExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalAPIMappingLanguage.g:2273:2: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
            	    // InternalAPIMappingLanguage.g:2274:1: (lv_operator_2_0= ruleLogicalAndOperator )
            	    {
            	    // InternalAPIMappingLanguage.g:2274:1: (lv_operator_2_0= ruleLogicalAndOperator )
            	    // InternalAPIMappingLanguage.g:2275:3: lv_operator_2_0= ruleLogicalAndOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    lv_operator_2_0=ruleLogicalAndOperator();

            	    state._fsp--;


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

            	    // InternalAPIMappingLanguage.g:2291:2: ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    // InternalAPIMappingLanguage.g:2292:1: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    {
            	    // InternalAPIMappingLanguage.g:2292:1: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    // InternalAPIMappingLanguage.g:2293:3: lv_rightExpression_3_0= ruleComparisonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionComparisonExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_37);
            	    lv_rightExpression_3_0=ruleComparisonExpression();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalAPIMappingLanguage.g:2317:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalAPIMappingLanguage.g:2318:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalAPIMappingLanguage.g:2319:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2326:1: ruleComparisonExpression returns [EObject current=null] : (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonHigherOpExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:2329:28: ( (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? ) )
            // InternalAPIMappingLanguage.g:2330:1: (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? )
            {
            // InternalAPIMappingLanguage.g:2330:1: (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? )
            // InternalAPIMappingLanguage.g:2331:5: this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getComparisonExpressionAccess().getComparisonHigherOpExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_38);
            this_ComparisonHigherOpExpression_0=ruleComparisonHigherOpExpression();

            state._fsp--;

             
                    current = this_ComparisonHigherOpExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalAPIMappingLanguage.g:2339:1: ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=52 && LA25_0<=53)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2339:2: () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) )
                    {
                    // InternalAPIMappingLanguage.g:2339:2: ()
                    // InternalAPIMappingLanguage.g:2340:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0(),
                                current);
                        

                    }

                    // InternalAPIMappingLanguage.g:2345:2: ( (lv_operator_2_0= ruleComparingEQNEQOperator ) )
                    // InternalAPIMappingLanguage.g:2346:1: (lv_operator_2_0= ruleComparingEQNEQOperator )
                    {
                    // InternalAPIMappingLanguage.g:2346:1: (lv_operator_2_0= ruleComparingEQNEQOperator )
                    // InternalAPIMappingLanguage.g:2347:3: lv_operator_2_0= ruleComparingEQNEQOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparingEQNEQOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_23);
                    lv_operator_2_0=ruleComparingEQNEQOperator();

                    state._fsp--;


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

                    // InternalAPIMappingLanguage.g:2363:2: ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) )
                    // InternalAPIMappingLanguage.g:2364:1: (lv_rightExpression_3_0= ruleComparisonHigherOpExpression )
                    {
                    // InternalAPIMappingLanguage.g:2364:1: (lv_rightExpression_3_0= ruleComparisonHigherOpExpression )
                    // InternalAPIMappingLanguage.g:2365:3: lv_rightExpression_3_0= ruleComparisonHigherOpExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightExpressionComparisonHigherOpExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_rightExpression_3_0=ruleComparisonHigherOpExpression();

                    state._fsp--;


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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleComparisonHigherOpExpression"
    // InternalAPIMappingLanguage.g:2389:1: entryRuleComparisonHigherOpExpression returns [EObject current=null] : iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF ;
    public final EObject entryRuleComparisonHigherOpExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonHigherOpExpression = null;


        try {
            // InternalAPIMappingLanguage.g:2390:2: (iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF )
            // InternalAPIMappingLanguage.g:2391:2: iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonHigherOpExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComparisonHigherOpExpression=ruleComparisonHigherOpExpression();

            state._fsp--;

             current =iv_ruleComparisonHigherOpExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2398:1: ruleComparisonHigherOpExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? ) ;
    public final EObject ruleComparisonHigherOpExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:2401:28: ( (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? ) )
            // InternalAPIMappingLanguage.g:2402:1: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? )
            {
            // InternalAPIMappingLanguage.g:2402:1: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? )
            // InternalAPIMappingLanguage.g:2403:5: this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_39);
            this_ArithmeticExpression_0=ruleArithmeticExpression();

            state._fsp--;

             
                    current = this_ArithmeticExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalAPIMappingLanguage.g:2411:1: ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=42 && LA26_0<=43)||(LA26_0>=54 && LA26_0<=55)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2411:2: () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) )
                    {
                    // InternalAPIMappingLanguage.g:2411:2: ()
                    // InternalAPIMappingLanguage.g:2412:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonHigherOpExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0(),
                                current);
                        

                    }

                    // InternalAPIMappingLanguage.g:2417:2: ( (lv_operator_2_0= ruleComparingRelOperator ) )
                    // InternalAPIMappingLanguage.g:2418:1: (lv_operator_2_0= ruleComparingRelOperator )
                    {
                    // InternalAPIMappingLanguage.g:2418:1: (lv_operator_2_0= ruleComparingRelOperator )
                    // InternalAPIMappingLanguage.g:2419:3: lv_operator_2_0= ruleComparingRelOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorComparingRelOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_23);
                    lv_operator_2_0=ruleComparingRelOperator();

                    state._fsp--;


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

                    // InternalAPIMappingLanguage.g:2435:2: ( (lv_rightExpression_3_0= ruleArithmeticExpression ) )
                    // InternalAPIMappingLanguage.g:2436:1: (lv_rightExpression_3_0= ruleArithmeticExpression )
                    {
                    // InternalAPIMappingLanguage.g:2436:1: (lv_rightExpression_3_0= ruleArithmeticExpression )
                    // InternalAPIMappingLanguage.g:2437:3: lv_rightExpression_3_0= ruleArithmeticExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionArithmeticExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_rightExpression_3_0=ruleArithmeticExpression();

                    state._fsp--;


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
    // $ANTLR end "ruleComparisonHigherOpExpression"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalAPIMappingLanguage.g:2461:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalAPIMappingLanguage.g:2462:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalAPIMappingLanguage.g:2463:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
             newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;

             current =iv_ruleArithmeticExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2470:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditionExpression_0= ruleAdditionExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:2473:28: (this_AdditionExpression_0= ruleAdditionExpression )
            // InternalAPIMappingLanguage.g:2475:5: this_AdditionExpression_0= ruleAdditionExpression
            {
             
                    newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditionExpressionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
            this_AdditionExpression_0=ruleAdditionExpression();

            state._fsp--;

             
                    current = this_AdditionExpression_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleAdditionExpression"
    // InternalAPIMappingLanguage.g:2491:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // InternalAPIMappingLanguage.g:2492:2: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // InternalAPIMappingLanguage.g:2493:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditionExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAdditionExpression=ruleAdditionExpression();

            state._fsp--;

             current =iv_ruleAdditionExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2500:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:2503:28: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* ) )
            // InternalAPIMappingLanguage.g:2504:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* )
            {
            // InternalAPIMappingLanguage.g:2504:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* )
            // InternalAPIMappingLanguage.g:2505:5: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_40);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;

             
                    current = this_MultiplicationExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalAPIMappingLanguage.g:2513:1: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=56 && LA27_0<=57)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:2513:2: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) )
            	    {
            	    // InternalAPIMappingLanguage.g:2513:2: ()
            	    // InternalAPIMappingLanguage.g:2514:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalAPIMappingLanguage.g:2519:2: ( (lv_operator_2_0= ruleAdditionOperator ) )
            	    // InternalAPIMappingLanguage.g:2520:1: (lv_operator_2_0= ruleAdditionOperator )
            	    {
            	    // InternalAPIMappingLanguage.g:2520:1: (lv_operator_2_0= ruleAdditionOperator )
            	    // InternalAPIMappingLanguage.g:2521:3: lv_operator_2_0= ruleAdditionOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    lv_operator_2_0=ruleAdditionOperator();

            	    state._fsp--;


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

            	    // InternalAPIMappingLanguage.g:2537:2: ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) )
            	    // InternalAPIMappingLanguage.g:2538:1: (lv_rightExpression_3_0= ruleMultiplicationExpression )
            	    {
            	    // InternalAPIMappingLanguage.g:2538:1: (lv_rightExpression_3_0= ruleMultiplicationExpression )
            	    // InternalAPIMappingLanguage.g:2539:3: lv_rightExpression_3_0= ruleMultiplicationExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightExpressionMultiplicationExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_40);
            	    lv_rightExpression_3_0=ruleMultiplicationExpression();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // InternalAPIMappingLanguage.g:2563:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // InternalAPIMappingLanguage.g:2564:2: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // InternalAPIMappingLanguage.g:2565:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;

             current =iv_ruleMultiplicationExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2572:1: ruleMultiplicationExpression returns [EObject current=null] : (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_TypeCastExpression_1= ruleTypeCastExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) ) )* ) ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryPreExpression_0 = null;

        EObject this_TypeCastExpression_1 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_rightExpression_4_1 = null;

        EObject lv_rightExpression_4_2 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:2575:28: ( (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_TypeCastExpression_1= ruleTypeCastExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) ) )* ) ) )
            // InternalAPIMappingLanguage.g:2576:1: (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_TypeCastExpression_1= ruleTypeCastExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) ) )* ) )
            {
            // InternalAPIMappingLanguage.g:2576:1: (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_TypeCastExpression_1= ruleTypeCastExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) ) )* ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==57||LA30_0==61) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_MINORMAXKEYWORD)||LA30_0==25||LA30_0==44||(LA30_0>=62 && LA30_0<=66)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2577:5: this_UnaryPreExpression_0= ruleUnaryPreExpression
                    {
                     
                            newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getUnaryPreExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_UnaryPreExpression_0=ruleUnaryPreExpression();

                    state._fsp--;

                     
                            current = this_UnaryPreExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2586:6: (this_TypeCastExpression_1= ruleTypeCastExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) ) )* )
                    {
                    // InternalAPIMappingLanguage.g:2586:6: (this_TypeCastExpression_1= ruleTypeCastExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) ) )* )
                    // InternalAPIMappingLanguage.g:2587:5: this_TypeCastExpression_1= ruleTypeCastExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) ) )*
                    {
                     
                            newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getTypeCastExpressionParserRuleCall_1_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_41);
                    this_TypeCastExpression_1=ruleTypeCastExpression();

                    state._fsp--;

                     
                            current = this_TypeCastExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    // InternalAPIMappingLanguage.g:2595:1: ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=58 && LA29_0<=60)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalAPIMappingLanguage.g:2595:2: () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) )
                    	    {
                    	    // InternalAPIMappingLanguage.g:2595:2: ()
                    	    // InternalAPIMappingLanguage.g:2596:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_1_0(),
                    	                current);
                    	        

                    	    }

                    	    // InternalAPIMappingLanguage.g:2601:2: ( (lv_operator_3_0= ruleMultiplicationOperator ) )
                    	    // InternalAPIMappingLanguage.g:2602:1: (lv_operator_3_0= ruleMultiplicationOperator )
                    	    {
                    	    // InternalAPIMappingLanguage.g:2602:1: (lv_operator_3_0= ruleMultiplicationOperator )
                    	    // InternalAPIMappingLanguage.g:2603:3: lv_operator_3_0= ruleMultiplicationOperator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_23);
                    	    lv_operator_3_0=ruleMultiplicationOperator();

                    	    state._fsp--;


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

                    	    // InternalAPIMappingLanguage.g:2619:2: ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) ) )
                    	    // InternalAPIMappingLanguage.g:2620:1: ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) )
                    	    {
                    	    // InternalAPIMappingLanguage.g:2620:1: ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression ) )
                    	    // InternalAPIMappingLanguage.g:2621:1: (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression )
                    	    {
                    	    // InternalAPIMappingLanguage.g:2621:1: (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleTypeCastExpression )
                    	    int alt28=2;
                    	    int LA28_0 = input.LA(1);

                    	    if ( (LA28_0==57||LA28_0==61) ) {
                    	        alt28=1;
                    	    }
                    	    else if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_MINORMAXKEYWORD)||LA28_0==25||LA28_0==44||(LA28_0>=62 && LA28_0<=66)) ) {
                    	        alt28=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 28, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt28) {
                    	        case 1 :
                    	            // InternalAPIMappingLanguage.g:2622:3: lv_rightExpression_4_1= ruleUnaryPreExpression
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionUnaryPreExpressionParserRuleCall_1_1_2_0_0()); 
                    	            	    
                    	            pushFollow(FollowSets000.FOLLOW_41);
                    	            lv_rightExpression_4_1=ruleUnaryPreExpression();

                    	            state._fsp--;


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
                    	            break;
                    	        case 2 :
                    	            // InternalAPIMappingLanguage.g:2637:8: lv_rightExpression_4_2= ruleTypeCastExpression
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionTypeCastExpressionParserRuleCall_1_1_2_0_1()); 
                    	            	    
                    	            pushFollow(FollowSets000.FOLLOW_41);
                    	            lv_rightExpression_4_2=ruleTypeCastExpression();

                    	            state._fsp--;


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
                    	            break;

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


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
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleUnaryPreExpression"
    // InternalAPIMappingLanguage.g:2663:1: entryRuleUnaryPreExpression returns [EObject current=null] : iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF ;
    public final EObject entryRuleUnaryPreExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryPreExpression = null;


        try {
            // InternalAPIMappingLanguage.g:2664:2: (iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF )
            // InternalAPIMappingLanguage.g:2665:2: iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryPreExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnaryPreExpression=ruleUnaryPreExpression();

            state._fsp--;

             current =iv_ruleUnaryPreExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2672:1: ruleUnaryPreExpression returns [EObject current=null] : ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleTypeCastExpression ) ) ) ;
    public final EObject ruleUnaryPreExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_enclosedExpression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:2675:28: ( ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleTypeCastExpression ) ) ) )
            // InternalAPIMappingLanguage.g:2676:1: ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleTypeCastExpression ) ) )
            {
            // InternalAPIMappingLanguage.g:2676:1: ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleTypeCastExpression ) ) )
            // InternalAPIMappingLanguage.g:2676:2: () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleTypeCastExpression ) )
            {
            // InternalAPIMappingLanguage.g:2676:2: ()
            // InternalAPIMappingLanguage.g:2677:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnaryPreExpressionAccess().getUnaryExpressionAction_0(),
                        current);
                

            }

            // InternalAPIMappingLanguage.g:2682:2: ( (lv_operator_1_0= ruleUnaryPreOperator ) )
            // InternalAPIMappingLanguage.g:2683:1: (lv_operator_1_0= ruleUnaryPreOperator )
            {
            // InternalAPIMappingLanguage.g:2683:1: (lv_operator_1_0= ruleUnaryPreOperator )
            // InternalAPIMappingLanguage.g:2684:3: lv_operator_1_0= ruleUnaryPreOperator
            {
             
            	        newCompositeNode(grammarAccess.getUnaryPreExpressionAccess().getOperatorUnaryPreOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_23);
            lv_operator_1_0=ruleUnaryPreOperator();

            state._fsp--;


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

            // InternalAPIMappingLanguage.g:2700:2: ( (lv_enclosedExpression_2_0= ruleTypeCastExpression ) )
            // InternalAPIMappingLanguage.g:2701:1: (lv_enclosedExpression_2_0= ruleTypeCastExpression )
            {
            // InternalAPIMappingLanguage.g:2701:1: (lv_enclosedExpression_2_0= ruleTypeCastExpression )
            // InternalAPIMappingLanguage.g:2702:3: lv_enclosedExpression_2_0= ruleTypeCastExpression
            {
             
            	        newCompositeNode(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionTypeCastExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_enclosedExpression_2_0=ruleTypeCastExpression();

            state._fsp--;


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
    // $ANTLR end "ruleUnaryPreExpression"


    // $ANTLR start "entryRuleTypeCastExpression"
    // InternalAPIMappingLanguage.g:2726:1: entryRuleTypeCastExpression returns [EObject current=null] : iv_ruleTypeCastExpression= ruleTypeCastExpression EOF ;
    public final EObject entryRuleTypeCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeCastExpression = null;


        try {
            // InternalAPIMappingLanguage.g:2727:2: (iv_ruleTypeCastExpression= ruleTypeCastExpression EOF )
            // InternalAPIMappingLanguage.g:2728:2: iv_ruleTypeCastExpression= ruleTypeCastExpression EOF
            {
             newCompositeNode(grammarAccess.getTypeCastExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeCastExpression=ruleTypeCastExpression();

            state._fsp--;

             current =iv_ruleTypeCastExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2735:1: ruleTypeCastExpression returns [EObject current=null] : (this_Operand_0= ruleOperand | ( () otherlv_2= '(' ( ( ruleDATATYPE ) ) otherlv_4= ')' ( (lv_enclosedExpression_5_0= ruleOperand ) ) ) ) ;
    public final EObject ruleTypeCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Operand_0 = null;

        EObject lv_enclosedExpression_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:2738:28: ( (this_Operand_0= ruleOperand | ( () otherlv_2= '(' ( ( ruleDATATYPE ) ) otherlv_4= ')' ( (lv_enclosedExpression_5_0= ruleOperand ) ) ) ) )
            // InternalAPIMappingLanguage.g:2739:1: (this_Operand_0= ruleOperand | ( () otherlv_2= '(' ( ( ruleDATATYPE ) ) otherlv_4= ')' ( (lv_enclosedExpression_5_0= ruleOperand ) ) ) )
            {
            // InternalAPIMappingLanguage.g:2739:1: (this_Operand_0= ruleOperand | ( () otherlv_2= '(' ( ( ruleDATATYPE ) ) otherlv_4= ')' ( (lv_enclosedExpression_5_0= ruleOperand ) ) ) )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2740:5: this_Operand_0= ruleOperand
                    {
                     
                            newCompositeNode(grammarAccess.getTypeCastExpressionAccess().getOperandParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Operand_0=ruleOperand();

                    state._fsp--;

                     
                            current = this_Operand_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2749:6: ( () otherlv_2= '(' ( ( ruleDATATYPE ) ) otherlv_4= ')' ( (lv_enclosedExpression_5_0= ruleOperand ) ) )
                    {
                    // InternalAPIMappingLanguage.g:2749:6: ( () otherlv_2= '(' ( ( ruleDATATYPE ) ) otherlv_4= ')' ( (lv_enclosedExpression_5_0= ruleOperand ) ) )
                    // InternalAPIMappingLanguage.g:2749:7: () otherlv_2= '(' ( ( ruleDATATYPE ) ) otherlv_4= ')' ( (lv_enclosedExpression_5_0= ruleOperand ) )
                    {
                    // InternalAPIMappingLanguage.g:2749:7: ()
                    // InternalAPIMappingLanguage.g:2750:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTypeCastExpressionAccess().getTypeCastExpressionAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_4); 

                        	newLeafNode(otherlv_2, grammarAccess.getTypeCastExpressionAccess().getLeftParenthesisKeyword_1_1());
                        
                    // InternalAPIMappingLanguage.g:2759:1: ( ( ruleDATATYPE ) )
                    // InternalAPIMappingLanguage.g:2760:1: ( ruleDATATYPE )
                    {
                    // InternalAPIMappingLanguage.g:2760:1: ( ruleDATATYPE )
                    // InternalAPIMappingLanguage.g:2761:3: ruleDATATYPE
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeCastExpressionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTypeCastExpressionAccess().getDataTypeDataTypeCrossReference_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_25);
                    ruleDATATYPE();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_42); 

                        	newLeafNode(otherlv_4, grammarAccess.getTypeCastExpressionAccess().getRightParenthesisKeyword_1_3());
                        
                    // InternalAPIMappingLanguage.g:2778:1: ( (lv_enclosedExpression_5_0= ruleOperand ) )
                    // InternalAPIMappingLanguage.g:2779:1: (lv_enclosedExpression_5_0= ruleOperand )
                    {
                    // InternalAPIMappingLanguage.g:2779:1: (lv_enclosedExpression_5_0= ruleOperand )
                    // InternalAPIMappingLanguage.g:2780:3: lv_enclosedExpression_5_0= ruleOperand
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeCastExpressionAccess().getEnclosedExpressionOperandParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_enclosedExpression_5_0=ruleOperand();

                    state._fsp--;


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
    // $ANTLR end "ruleTypeCastExpression"


    // $ANTLR start "entryRuleOperand"
    // InternalAPIMappingLanguage.g:2804:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // InternalAPIMappingLanguage.g:2805:2: (iv_ruleOperand= ruleOperand EOF )
            // InternalAPIMappingLanguage.g:2806:2: iv_ruleOperand= ruleOperand EOF
            {
             newCompositeNode(grammarAccess.getOperandRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOperand=ruleOperand();

            state._fsp--;

             current =iv_ruleOperand; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2813:1: ruleOperand returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression | this_TimeValueExpression_5= ruleTimeValueExpression | this_OperationCall_6= ruleOperationCall | this_TriggerMessageExpression_7= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_8= ruleNoAttributeSelectorExpression ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_LiteralExpression_3 = null;

        EObject this_ExtendedTypedNamedElementExpression_4 = null;

        EObject this_TimeValueExpression_5 = null;

        EObject this_OperationCall_6 = null;

        EObject this_TriggerMessageExpression_7 = null;

        EObject this_NoAttributeSelectorExpression_8 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:2816:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression | this_TimeValueExpression_5= ruleTimeValueExpression | this_OperationCall_6= ruleOperationCall | this_TriggerMessageExpression_7= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_8= ruleNoAttributeSelectorExpression ) )
            // InternalAPIMappingLanguage.g:2817:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression | this_TimeValueExpression_5= ruleTimeValueExpression | this_OperationCall_6= ruleOperationCall | this_TriggerMessageExpression_7= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_8= ruleNoAttributeSelectorExpression )
            {
            // InternalAPIMappingLanguage.g:2817:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression | this_TimeValueExpression_5= ruleTimeValueExpression | this_OperationCall_6= ruleOperationCall | this_TriggerMessageExpression_7= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_8= ruleNoAttributeSelectorExpression )
            int alt32=7;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2817:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalAPIMappingLanguage.g:2817:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalAPIMappingLanguage.g:2817:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_23); 

                        	newLeafNode(otherlv_0, grammarAccess.getOperandAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_25);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_2, grammarAccess.getOperandAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2836:5: this_LiteralExpression_3= ruleLiteralExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getLiteralExpressionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LiteralExpression_3=ruleLiteralExpression();

                    state._fsp--;

                     
                            current = this_LiteralExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2846:5: this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getExtendedTypedNamedElementExpressionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExtendedTypedNamedElementExpression_4=ruleExtendedTypedNamedElementExpression();

                    state._fsp--;

                     
                            current = this_ExtendedTypedNamedElementExpression_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalAPIMappingLanguage.g:2856:5: this_TimeValueExpression_5= ruleTimeValueExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getTimeValueExpressionParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TimeValueExpression_5=ruleTimeValueExpression();

                    state._fsp--;

                     
                            current = this_TimeValueExpression_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalAPIMappingLanguage.g:2866:5: this_OperationCall_6= ruleOperationCall
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getOperationCallParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_OperationCall_6=ruleOperationCall();

                    state._fsp--;

                     
                            current = this_OperationCall_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalAPIMappingLanguage.g:2876:5: this_TriggerMessageExpression_7= ruleTriggerMessageExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getTriggerMessageExpressionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TriggerMessageExpression_7=ruleTriggerMessageExpression();

                    state._fsp--;

                     
                            current = this_TriggerMessageExpression_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalAPIMappingLanguage.g:2886:5: this_NoAttributeSelectorExpression_8= ruleNoAttributeSelectorExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getNoAttributeSelectorExpressionParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NoAttributeSelectorExpression_8=ruleNoAttributeSelectorExpression();

                    state._fsp--;

                     
                            current = this_NoAttributeSelectorExpression_8; 
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
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalAPIMappingLanguage.g:2902:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAPIMappingLanguage.g:2903:2: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAPIMappingLanguage.g:2904:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2911:1: ruleLiteralExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:2914:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // InternalAPIMappingLanguage.g:2915:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // InternalAPIMappingLanguage.g:2915:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // InternalAPIMappingLanguage.g:2915:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // InternalAPIMappingLanguage.g:2915:2: ()
            // InternalAPIMappingLanguage.g:2916:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_0(),
                        current);
                

            }

            // InternalAPIMappingLanguage.g:2921:2: ( (lv_value_1_0= ruleLiteral ) )
            // InternalAPIMappingLanguage.g:2922:1: (lv_value_1_0= ruleLiteral )
            {
            // InternalAPIMappingLanguage.g:2922:1: (lv_value_1_0= ruleLiteral )
            // InternalAPIMappingLanguage.g:2923:3: lv_value_1_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getLiteralExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLiteralExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"org.muml.pim.actionlanguage.xtext.ActionLanguage.Literal");
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
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalAPIMappingLanguage.g:2947:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // InternalAPIMappingLanguage.g:2948:2: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalAPIMappingLanguage.g:2949:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2956:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | kw= 'null' ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUMBER_0=null;
        Token this_BOOLEAN_1=null;
        Token this_INT_2=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:2959:28: ( (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | kw= 'null' ) )
            // InternalAPIMappingLanguage.g:2960:1: (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | kw= 'null' )
            {
            // InternalAPIMappingLanguage.g:2960:1: (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | kw= 'null' )
            int alt33=4;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt33=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt33=2;
                }
                break;
            case RULE_INT:
                {
                alt33=3;
                }
                break;
            case 44:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2960:6: this_NUMBER_0= RULE_NUMBER
                    {
                    this_NUMBER_0=(Token)match(input,RULE_NUMBER,FollowSets000.FOLLOW_2); 

                    		current.merge(this_NUMBER_0);
                        
                     
                        newLeafNode(this_NUMBER_0, grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2968:10: this_BOOLEAN_1= RULE_BOOLEAN
                    {
                    this_BOOLEAN_1=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); 

                    		current.merge(this_BOOLEAN_1);
                        
                     
                        newLeafNode(this_BOOLEAN_1, grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2976:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalAPIMappingLanguage.g:2985:2: kw= 'null'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLiteralAccess().getNullKeyword_3()); 
                        

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleTimeValueExpression"
    // InternalAPIMappingLanguage.g:2998:1: entryRuleTimeValueExpression returns [EObject current=null] : iv_ruleTimeValueExpression= ruleTimeValueExpression EOF ;
    public final EObject entryRuleTimeValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeValueExpression = null;


        try {
            // InternalAPIMappingLanguage.g:2999:2: (iv_ruleTimeValueExpression= ruleTimeValueExpression EOF )
            // InternalAPIMappingLanguage.g:3000:2: iv_ruleTimeValueExpression= ruleTimeValueExpression EOF
            {
             newCompositeNode(grammarAccess.getTimeValueExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTimeValueExpression=ruleTimeValueExpression();

            state._fsp--;

             current =iv_ruleTimeValueExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:3007:1: ruleTimeValueExpression returns [EObject current=null] : ( (otherlv_0= RULE_MINORMAXKEYWORD ) ) ;
    public final EObject ruleTimeValueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:3010:28: ( ( (otherlv_0= RULE_MINORMAXKEYWORD ) ) )
            // InternalAPIMappingLanguage.g:3011:1: ( (otherlv_0= RULE_MINORMAXKEYWORD ) )
            {
            // InternalAPIMappingLanguage.g:3011:1: ( (otherlv_0= RULE_MINORMAXKEYWORD ) )
            // InternalAPIMappingLanguage.g:3012:1: (otherlv_0= RULE_MINORMAXKEYWORD )
            {
            // InternalAPIMappingLanguage.g:3012:1: (otherlv_0= RULE_MINORMAXKEYWORD )
            // InternalAPIMappingLanguage.g:3013:3: otherlv_0= RULE_MINORMAXKEYWORD
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTimeValueExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_MINORMAXKEYWORD,FollowSets000.FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getTimeValueExpressionAccess().getTimeValueTimeValueCrossReference_0()); 
            	

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
    // $ANTLR end "ruleTimeValueExpression"


    // $ANTLR start "entryRuleExtendedTypedNamedElementExpression"
    // InternalAPIMappingLanguage.g:3032:1: entryRuleExtendedTypedNamedElementExpression returns [EObject current=null] : iv_ruleExtendedTypedNamedElementExpression= ruleExtendedTypedNamedElementExpression EOF ;
    public final EObject entryRuleExtendedTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedTypedNamedElementExpression = null;


        try {
            // InternalAPIMappingLanguage.g:3033:2: (iv_ruleExtendedTypedNamedElementExpression= ruleExtendedTypedNamedElementExpression EOF )
            // InternalAPIMappingLanguage.g:3034:2: iv_ruleExtendedTypedNamedElementExpression= ruleExtendedTypedNamedElementExpression EOF
            {
             newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExtendedTypedNamedElementExpression=ruleExtendedTypedNamedElementExpression();

            state._fsp--;

             current =iv_ruleExtendedTypedNamedElementExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:3041:1: ruleExtendedTypedNamedElementExpression returns [EObject current=null] : (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )? ) ;
    public final EObject ruleExtendedTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TypedNamedElementExpression_0 = null;

        EObject lv_position_3_0 = null;

        Enumerator lv_incrementDecrementOperator_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:3044:28: ( (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )? ) )
            // InternalAPIMappingLanguage.g:3045:1: (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )? )
            {
            // InternalAPIMappingLanguage.g:3045:1: (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )? )
            // InternalAPIMappingLanguage.g:3046:5: this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getTypedNamedElementExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_43);
            this_TypedNamedElementExpression_0=ruleTypedNamedElementExpression();

            state._fsp--;

             
                    current = this_TypedNamedElementExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalAPIMappingLanguage.g:3054:1: ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )?
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=46 && LA34_0<=47)) ) {
                alt34=2;
            }
            switch (alt34) {
                case 1 :
                    // InternalAPIMappingLanguage.g:3054:2: ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) )
                    {
                    // InternalAPIMappingLanguage.g:3054:2: ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) )
                    // InternalAPIMappingLanguage.g:3054:3: () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) )
                    {
                    // InternalAPIMappingLanguage.g:3054:3: ()
                    // InternalAPIMappingLanguage.g:3055:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExtendedTypedNamedElementExpressionAccess().getDiscreteInteractionEndpointReferenceTypedNamedElementExpressionAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_42); 

                        	newLeafNode(otherlv_2, grammarAccess.getExtendedTypedNamedElementExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0_1());
                        
                    // InternalAPIMappingLanguage.g:3064:1: ( (lv_position_3_0= rulePositionSelectorExpression ) )
                    // InternalAPIMappingLanguage.g:3065:1: (lv_position_3_0= rulePositionSelectorExpression )
                    {
                    // InternalAPIMappingLanguage.g:3065:1: (lv_position_3_0= rulePositionSelectorExpression )
                    // InternalAPIMappingLanguage.g:3066:3: lv_position_3_0= rulePositionSelectorExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_position_3_0=rulePositionSelectorExpression();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:3083:6: ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) )
                    {
                    // InternalAPIMappingLanguage.g:3083:6: ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) )
                    // InternalAPIMappingLanguage.g:3083:7: () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) )
                    {
                    // InternalAPIMappingLanguage.g:3083:7: ()
                    // InternalAPIMappingLanguage.g:3084:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExtendedTypedNamedElementExpressionAccess().getAssignmentLhs_typedNamedElementExpressionAction_1_1_0(),
                                current);
                        

                    }

                    // InternalAPIMappingLanguage.g:3089:2: ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) )
                    // InternalAPIMappingLanguage.g:3090:1: (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression )
                    {
                    // InternalAPIMappingLanguage.g:3090:1: (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression )
                    // InternalAPIMappingLanguage.g:3091:3: lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getIncrementDecrementOperatorIncrementDecrementOperatorExpressionEnumRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_incrementDecrementOperator_5_0=ruleIncrementDecrementOperatorExpression();

                    state._fsp--;


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
    // $ANTLR end "ruleExtendedTypedNamedElementExpression"


    // $ANTLR start "entryRuleTypedNamedElementExpression"
    // InternalAPIMappingLanguage.g:3115:1: entryRuleTypedNamedElementExpression returns [EObject current=null] : iv_ruleTypedNamedElementExpression= ruleTypedNamedElementExpression EOF ;
    public final EObject entryRuleTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedNamedElementExpression = null;


        try {
            // InternalAPIMappingLanguage.g:3116:2: (iv_ruleTypedNamedElementExpression= ruleTypedNamedElementExpression EOF )
            // InternalAPIMappingLanguage.g:3117:2: iv_ruleTypedNamedElementExpression= ruleTypedNamedElementExpression EOF
            {
             newCompositeNode(grammarAccess.getTypedNamedElementExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedNamedElementExpression=ruleTypedNamedElementExpression();

            state._fsp--;

             current =iv_ruleTypedNamedElementExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:3124:1: ruleTypedNamedElementExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )* ) ;
    public final EObject ruleTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elementAccessors_1_1 = null;

        EObject lv_elementAccessors_1_2 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:3127:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )* ) )
            // InternalAPIMappingLanguage.g:3128:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )* )
            {
            // InternalAPIMappingLanguage.g:3128:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )* )
            // InternalAPIMappingLanguage.g:3128:2: ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )*
            {
            // InternalAPIMappingLanguage.g:3128:2: ( (otherlv_0= RULE_ID ) )
            // InternalAPIMappingLanguage.g:3129:1: (otherlv_0= RULE_ID )
            {
            // InternalAPIMappingLanguage.g:3129:1: (otherlv_0= RULE_ID )
            // InternalAPIMappingLanguage.g:3130:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypedNamedElementExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_44); 

            		newLeafNode(otherlv_0, grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementTypedNamedElementCrossReference_0_0()); 
            	

            }


            }

            // InternalAPIMappingLanguage.g:3141:2: ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==29||LA36_0==39) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:3142:1: ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) )
            	    {
            	    // InternalAPIMappingLanguage.g:3142:1: ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) )
            	    // InternalAPIMappingLanguage.g:3143:1: (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression )
            	    {
            	    // InternalAPIMappingLanguage.g:3143:1: (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==39) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==29) ) {
            	        alt35=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalAPIMappingLanguage.g:3144:3: lv_elementAccessors_1_1= ruleArrayIndexExpression
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsArrayIndexExpressionParserRuleCall_1_0_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_44);
            	            lv_elementAccessors_1_1=ruleArrayIndexExpression();

            	            state._fsp--;


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
            	            break;
            	        case 2 :
            	            // InternalAPIMappingLanguage.g:3159:8: lv_elementAccessors_1_2= ruleAttributeAccessorExpression
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAttributeAccessorExpressionParserRuleCall_1_0_1()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_44);
            	            lv_elementAccessors_1_2=ruleAttributeAccessorExpression();

            	            state._fsp--;


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
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // $ANTLR end "ruleTypedNamedElementExpression"


    // $ANTLR start "entryRuleArrayIndexExpression"
    // InternalAPIMappingLanguage.g:3185:1: entryRuleArrayIndexExpression returns [EObject current=null] : iv_ruleArrayIndexExpression= ruleArrayIndexExpression EOF ;
    public final EObject entryRuleArrayIndexExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayIndexExpression = null;


        try {
            // InternalAPIMappingLanguage.g:3186:2: (iv_ruleArrayIndexExpression= ruleArrayIndexExpression EOF )
            // InternalAPIMappingLanguage.g:3187:2: iv_ruleArrayIndexExpression= ruleArrayIndexExpression EOF
            {
             newCompositeNode(grammarAccess.getArrayIndexExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArrayIndexExpression=ruleArrayIndexExpression();

            state._fsp--;

             current =iv_ruleArrayIndexExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:3194:1: ruleArrayIndexExpression returns [EObject current=null] : (otherlv_0= '[' ( (lv_index_1_0= ruleArithmeticExpression ) ) otherlv_2= ']' ) ;
    public final EObject ruleArrayIndexExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_index_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:3197:28: ( (otherlv_0= '[' ( (lv_index_1_0= ruleArithmeticExpression ) ) otherlv_2= ']' ) )
            // InternalAPIMappingLanguage.g:3198:1: (otherlv_0= '[' ( (lv_index_1_0= ruleArithmeticExpression ) ) otherlv_2= ']' )
            {
            // InternalAPIMappingLanguage.g:3198:1: (otherlv_0= '[' ( (lv_index_1_0= ruleArithmeticExpression ) ) otherlv_2= ']' )
            // InternalAPIMappingLanguage.g:3198:3: otherlv_0= '[' ( (lv_index_1_0= ruleArithmeticExpression ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_23); 

                	newLeafNode(otherlv_0, grammarAccess.getArrayIndexExpressionAccess().getLeftSquareBracketKeyword_0());
                
            // InternalAPIMappingLanguage.g:3202:1: ( (lv_index_1_0= ruleArithmeticExpression ) )
            // InternalAPIMappingLanguage.g:3203:1: (lv_index_1_0= ruleArithmeticExpression )
            {
            // InternalAPIMappingLanguage.g:3203:1: (lv_index_1_0= ruleArithmeticExpression )
            // InternalAPIMappingLanguage.g:3204:3: lv_index_1_0= ruleArithmeticExpression
            {
             
            	        newCompositeNode(grammarAccess.getArrayIndexExpressionAccess().getIndexArithmeticExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_45);
            lv_index_1_0=ruleArithmeticExpression();

            state._fsp--;


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

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getArrayIndexExpressionAccess().getRightSquareBracketKeyword_2());
                

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
    // $ANTLR end "ruleArrayIndexExpression"


    // $ANTLR start "entryRuleAttributeAccessorExpression"
    // InternalAPIMappingLanguage.g:3232:1: entryRuleAttributeAccessorExpression returns [EObject current=null] : iv_ruleAttributeAccessorExpression= ruleAttributeAccessorExpression EOF ;
    public final EObject entryRuleAttributeAccessorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeAccessorExpression = null;


        try {
            // InternalAPIMappingLanguage.g:3233:2: (iv_ruleAttributeAccessorExpression= ruleAttributeAccessorExpression EOF )
            // InternalAPIMappingLanguage.g:3234:2: iv_ruleAttributeAccessorExpression= ruleAttributeAccessorExpression EOF
            {
             newCompositeNode(grammarAccess.getAttributeAccessorExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeAccessorExpression=ruleAttributeAccessorExpression();

            state._fsp--;

             current =iv_ruleAttributeAccessorExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:3241:1: ruleAttributeAccessorExpression returns [EObject current=null] : (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAttributeAccessorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:3244:28: ( (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAPIMappingLanguage.g:3245:1: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAPIMappingLanguage.g:3245:1: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:3245:3: otherlv_0= '.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccessorExpressionAccess().getFullStopKeyword_0());
                
            // InternalAPIMappingLanguage.g:3249:1: ( (otherlv_1= RULE_ID ) )
            // InternalAPIMappingLanguage.g:3250:1: (otherlv_1= RULE_ID )
            {
            // InternalAPIMappingLanguage.g:3250:1: (otherlv_1= RULE_ID )
            // InternalAPIMappingLanguage.g:3251:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeAccessorExpressionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		newLeafNode(otherlv_1, grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAttributeCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleAttributeAccessorExpression"


    // $ANTLR start "entryRuleNoAttributeSelectorExpression"
    // InternalAPIMappingLanguage.g:3270:1: entryRuleNoAttributeSelectorExpression returns [EObject current=null] : iv_ruleNoAttributeSelectorExpression= ruleNoAttributeSelectorExpression EOF ;
    public final EObject entryRuleNoAttributeSelectorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoAttributeSelectorExpression = null;


        try {
            // InternalAPIMappingLanguage.g:3271:2: (iv_ruleNoAttributeSelectorExpression= ruleNoAttributeSelectorExpression EOF )
            // InternalAPIMappingLanguage.g:3272:2: iv_ruleNoAttributeSelectorExpression= ruleNoAttributeSelectorExpression EOF
            {
             newCompositeNode(grammarAccess.getNoAttributeSelectorExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNoAttributeSelectorExpression=ruleNoAttributeSelectorExpression();

            state._fsp--;

             current =iv_ruleNoAttributeSelectorExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:3279:1: ruleNoAttributeSelectorExpression returns [EObject current=null] : ( (lv_position_0_0= rulePositionSelectorExpression ) ) ;
    public final EObject ruleNoAttributeSelectorExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_position_0_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:3282:28: ( ( (lv_position_0_0= rulePositionSelectorExpression ) ) )
            // InternalAPIMappingLanguage.g:3283:1: ( (lv_position_0_0= rulePositionSelectorExpression ) )
            {
            // InternalAPIMappingLanguage.g:3283:1: ( (lv_position_0_0= rulePositionSelectorExpression ) )
            // InternalAPIMappingLanguage.g:3284:1: (lv_position_0_0= rulePositionSelectorExpression )
            {
            // InternalAPIMappingLanguage.g:3284:1: (lv_position_0_0= rulePositionSelectorExpression )
            // InternalAPIMappingLanguage.g:3285:3: lv_position_0_0= rulePositionSelectorExpression
            {
             
            	        newCompositeNode(grammarAccess.getNoAttributeSelectorExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_position_0_0=rulePositionSelectorExpression();

            state._fsp--;


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
    // $ANTLR end "ruleNoAttributeSelectorExpression"


    // $ANTLR start "entryRulePositionSelectorExpression"
    // InternalAPIMappingLanguage.g:3309:1: entryRulePositionSelectorExpression returns [EObject current=null] : iv_rulePositionSelectorExpression= rulePositionSelectorExpression EOF ;
    public final EObject entryRulePositionSelectorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionSelectorExpression = null;


        try {
            // InternalAPIMappingLanguage.g:3310:2: (iv_rulePositionSelectorExpression= rulePositionSelectorExpression EOF )
            // InternalAPIMappingLanguage.g:3311:2: iv_rulePositionSelectorExpression= rulePositionSelectorExpression EOF
            {
             newCompositeNode(grammarAccess.getPositionSelectorExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePositionSelectorExpression=rulePositionSelectorExpression();

            state._fsp--;

             current =iv_rulePositionSelectorExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:3318:1: rulePositionSelectorExpression returns [EObject current=null] : ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? ) ;
    public final EObject rulePositionSelectorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_kind_0_0 = null;

        EObject lv_successor_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:3321:28: ( ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? ) )
            // InternalAPIMappingLanguage.g:3322:1: ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? )
            {
            // InternalAPIMappingLanguage.g:3322:1: ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? )
            // InternalAPIMappingLanguage.g:3322:2: ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )?
            {
            // InternalAPIMappingLanguage.g:3322:2: ( (lv_kind_0_0= rulePositionSelectorKind ) )
            // InternalAPIMappingLanguage.g:3323:1: (lv_kind_0_0= rulePositionSelectorKind )
            {
            // InternalAPIMappingLanguage.g:3323:1: (lv_kind_0_0= rulePositionSelectorKind )
            // InternalAPIMappingLanguage.g:3324:3: lv_kind_0_0= rulePositionSelectorKind
            {
             
            	        newCompositeNode(grammarAccess.getPositionSelectorExpressionAccess().getKindPositionSelectorKindEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_46);
            lv_kind_0_0=rulePositionSelectorKind();

            state._fsp--;


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

            // InternalAPIMappingLanguage.g:3340:2: (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAPIMappingLanguage.g:3340:4: otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) )
                    {
                    otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_42); 

                        	newLeafNode(otherlv_1, grammarAccess.getPositionSelectorExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
                        
                    // InternalAPIMappingLanguage.g:3344:1: ( (lv_successor_2_0= rulePositionSelectorExpression ) )
                    // InternalAPIMappingLanguage.g:3345:1: (lv_successor_2_0= rulePositionSelectorExpression )
                    {
                    // InternalAPIMappingLanguage.g:3345:1: (lv_successor_2_0= rulePositionSelectorExpression )
                    // InternalAPIMappingLanguage.g:3346:3: lv_successor_2_0= rulePositionSelectorExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPositionSelectorExpressionAccess().getSuccessorPositionSelectorExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_successor_2_0=rulePositionSelectorExpression();

                    state._fsp--;


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
    // $ANTLR end "rulePositionSelectorExpression"


    // $ANTLR start "entryRuleOperationCall"
    // InternalAPIMappingLanguage.g:3370:1: entryRuleOperationCall returns [EObject current=null] : iv_ruleOperationCall= ruleOperationCall EOF ;
    public final EObject entryRuleOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCall = null;


        try {
            // InternalAPIMappingLanguage.g:3371:2: (iv_ruleOperationCall= ruleOperationCall EOF )
            // InternalAPIMappingLanguage.g:3372:2: iv_ruleOperationCall= ruleOperationCall EOF
            {
             newCompositeNode(grammarAccess.getOperationCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOperationCall=ruleOperationCall();

            state._fsp--;

             current =iv_ruleOperationCall; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:3379:1: ruleOperationCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleOperationCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameterBinding_2_0 = null;

        EObject lv_parameterBinding_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:3382:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' ) )
            // InternalAPIMappingLanguage.g:3383:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' )
            {
            // InternalAPIMappingLanguage.g:3383:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' )
            // InternalAPIMappingLanguage.g:3383:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')'
            {
            // InternalAPIMappingLanguage.g:3383:2: ( (otherlv_0= RULE_ID ) )
            // InternalAPIMappingLanguage.g:3384:1: (otherlv_0= RULE_ID )
            {
            // InternalAPIMappingLanguage.g:3384:1: (otherlv_0= RULE_ID )
            // InternalAPIMappingLanguage.g:3385:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); 

            		newLeafNode(otherlv_0, grammarAccess.getOperationCallAccess().getOperationOperationCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_1());
                
            // InternalAPIMappingLanguage.g:3400:1: ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAPIMappingLanguage.g:3400:2: ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )*
                    {
                    // InternalAPIMappingLanguage.g:3400:2: ( (lv_parameterBinding_2_0= ruleParamaterBinding ) )
                    // InternalAPIMappingLanguage.g:3401:1: (lv_parameterBinding_2_0= ruleParamaterBinding )
                    {
                    // InternalAPIMappingLanguage.g:3401:1: (lv_parameterBinding_2_0= ruleParamaterBinding )
                    // InternalAPIMappingLanguage.g:3402:3: lv_parameterBinding_2_0= ruleParamaterBinding
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_17);
                    lv_parameterBinding_2_0=ruleParamaterBinding();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperationCallRule());
                    	        }
                           		add(
                           			current, 
                           			"parameterBinding",
                            		lv_parameterBinding_2_0, 
                            		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.ParamaterBinding");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalAPIMappingLanguage.g:3418:2: (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==16) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalAPIMappingLanguage.g:3418:4: otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_4); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getOperationCallAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // InternalAPIMappingLanguage.g:3422:1: ( (lv_parameterBinding_4_0= ruleParamaterBinding ) )
                    	    // InternalAPIMappingLanguage.g:3423:1: (lv_parameterBinding_4_0= ruleParamaterBinding )
                    	    {
                    	    // InternalAPIMappingLanguage.g:3423:1: (lv_parameterBinding_4_0= ruleParamaterBinding )
                    	    // InternalAPIMappingLanguage.g:3424:3: lv_parameterBinding_4_0= ruleParamaterBinding
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_17);
                    	    lv_parameterBinding_4_0=ruleParamaterBinding();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOperationCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameterBinding",
                    	            		lv_parameterBinding_4_0, 
                    	            		"org.muml.psm.api.apimappinglanguage.APIMappingLanguage.ParamaterBinding");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getOperationCallAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleOperationCall"


    // $ANTLR start "entryRuleTriggerMessageExpression"
    // InternalAPIMappingLanguage.g:3452:1: entryRuleTriggerMessageExpression returns [EObject current=null] : iv_ruleTriggerMessageExpression= ruleTriggerMessageExpression EOF ;
    public final EObject entryRuleTriggerMessageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerMessageExpression = null;


        try {
            // InternalAPIMappingLanguage.g:3453:2: (iv_ruleTriggerMessageExpression= ruleTriggerMessageExpression EOF )
            // InternalAPIMappingLanguage.g:3454:2: iv_ruleTriggerMessageExpression= ruleTriggerMessageExpression EOF
            {
             newCompositeNode(grammarAccess.getTriggerMessageExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTriggerMessageExpression=ruleTriggerMessageExpression();

            state._fsp--;

             current =iv_ruleTriggerMessageExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:3461:1: ruleTriggerMessageExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTriggerMessageExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:3464:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalAPIMappingLanguage.g:3465:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalAPIMappingLanguage.g:3465:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:3465:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:3465:2: ( (otherlv_0= RULE_ID ) )
            // InternalAPIMappingLanguage.g:3466:1: (otherlv_0= RULE_ID )
            {
            // InternalAPIMappingLanguage.g:3466:1: (otherlv_0= RULE_ID )
            // InternalAPIMappingLanguage.g:3467:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTriggerMessageExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_47); 

            		newLeafNode(otherlv_0, grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeMessageTypeCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getTriggerMessageExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // InternalAPIMappingLanguage.g:3482:1: ( (otherlv_2= RULE_ID ) )
            // InternalAPIMappingLanguage.g:3483:1: (otherlv_2= RULE_ID )
            {
            // InternalAPIMappingLanguage.g:3483:1: (otherlv_2= RULE_ID )
            // InternalAPIMappingLanguage.g:3484:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTriggerMessageExpressionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		newLeafNode(otherlv_2, grammarAccess.getTriggerMessageExpressionAccess().getParameterParameterCrossReference_2_0()); 
            	

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
    // $ANTLR end "ruleTriggerMessageExpression"


    // $ANTLR start "entryRuleDATATYPE"
    // InternalAPIMappingLanguage.g:3503:1: entryRuleDATATYPE returns [String current=null] : iv_ruleDATATYPE= ruleDATATYPE EOF ;
    public final String entryRuleDATATYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATATYPE = null;


        try {
            // InternalAPIMappingLanguage.g:3504:2: (iv_ruleDATATYPE= ruleDATATYPE EOF )
            // InternalAPIMappingLanguage.g:3505:2: iv_ruleDATATYPE= ruleDATATYPE EOF
            {
             newCompositeNode(grammarAccess.getDATATYPERule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDATATYPE=ruleDATATYPE();

            state._fsp--;

             current =iv_ruleDATATYPE.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:3512:1: ruleDATATYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )* ) ;
    public final AntlrDatatypeRuleToken ruleDATATYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // InternalAPIMappingLanguage.g:3515:28: ( (this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )* ) )
            // InternalAPIMappingLanguage.g:3516:1: (this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )* )
            {
            // InternalAPIMappingLanguage.g:3516:1: (this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )* )
            // InternalAPIMappingLanguage.g:3516:6: this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_48); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getDATATYPEAccess().getIDTerminalRuleCall_0()); 
                
            // InternalAPIMappingLanguage.g:3523:1: (kw= '[' this_INT_2= RULE_INT kw= ']' )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==39) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:3524:2: kw= '[' this_INT_2= RULE_INT kw= ']'
            	    {
            	    kw=(Token)match(input,39,FollowSets000.FOLLOW_33); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDATATYPEAccess().getLeftSquareBracketKeyword_1_0()); 
            	        
            	    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_45); 

            	    		current.merge(this_INT_2);
            	        
            	     
            	        newLeafNode(this_INT_2, grammarAccess.getDATATYPEAccess().getINTTerminalRuleCall_1_1()); 
            	        
            	    kw=(Token)match(input,40,FollowSets000.FOLLOW_48); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDATATYPEAccess().getRightSquareBracketKeyword_1_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end "ruleDATATYPE"


    // $ANTLR start "ruleUnaryPostIncrementDecrementOperator"
    // InternalAPIMappingLanguage.g:3550:1: ruleUnaryPostIncrementDecrementOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleUnaryPostIncrementDecrementOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalAPIMappingLanguage.g:3552:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalAPIMappingLanguage.g:3553:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalAPIMappingLanguage.g:3553:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==46) ) {
                alt41=1;
            }
            else if ( (LA41_0==47) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalAPIMappingLanguage.g:3553:2: (enumLiteral_0= '++' )
                    {
                    // InternalAPIMappingLanguage.g:3553:2: (enumLiteral_0= '++' )
                    // InternalAPIMappingLanguage.g:3553:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,46,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:3559:6: (enumLiteral_1= '--' )
                    {
                    // InternalAPIMappingLanguage.g:3559:6: (enumLiteral_1= '--' )
                    // InternalAPIMappingLanguage.g:3559:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,47,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleUnaryPostIncrementDecrementOperator"


    // $ANTLR start "ruleIncrementDecrementOperatorExpression"
    // InternalAPIMappingLanguage.g:3569:1: ruleIncrementDecrementOperatorExpression returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleIncrementDecrementOperatorExpression() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalAPIMappingLanguage.g:3571:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalAPIMappingLanguage.g:3572:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalAPIMappingLanguage.g:3572:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==46) ) {
                alt42=1;
            }
            else if ( (LA42_0==47) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalAPIMappingLanguage.g:3572:2: (enumLiteral_0= '++' )
                    {
                    // InternalAPIMappingLanguage.g:3572:2: (enumLiteral_0= '++' )
                    // InternalAPIMappingLanguage.g:3572:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,46,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getIncrementDecrementOperatorExpressionAccess().getINCREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getIncrementDecrementOperatorExpressionAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:3578:6: (enumLiteral_1= '--' )
                    {
                    // InternalAPIMappingLanguage.g:3578:6: (enumLiteral_1= '--' )
                    // InternalAPIMappingLanguage.g:3578:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,47,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getIncrementDecrementOperatorExpressionAccess().getDECREMENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getIncrementDecrementOperatorExpressionAccess().getDECREMENTEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleIncrementDecrementOperatorExpression"


    // $ANTLR start "ruleAssignOperator"
    // InternalAPIMappingLanguage.g:3588:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalAPIMappingLanguage.g:3590:28: ( ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) ) )
            // InternalAPIMappingLanguage.g:3591:1: ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) )
            {
            // InternalAPIMappingLanguage.g:3591:1: ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt43=1;
                }
                break;
            case 48:
                {
                alt43=2;
                }
                break;
            case 49:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalAPIMappingLanguage.g:3591:2: (enumLiteral_0= ':=' )
                    {
                    // InternalAPIMappingLanguage.g:3591:2: (enumLiteral_0= ':=' )
                    // InternalAPIMappingLanguage.g:3591:4: enumLiteral_0= ':='
                    {
                    enumLiteral_0=(Token)match(input,27,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:3597:6: (enumLiteral_1= '+=' )
                    {
                    // InternalAPIMappingLanguage.g:3597:6: (enumLiteral_1= '+=' )
                    // InternalAPIMappingLanguage.g:3597:8: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,48,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:3603:6: (enumLiteral_2= '-=' )
                    {
                    // InternalAPIMappingLanguage.g:3603:6: (enumLiteral_2= '-=' )
                    // InternalAPIMappingLanguage.g:3603:8: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,49,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleAssignOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // InternalAPIMappingLanguage.g:3613:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalAPIMappingLanguage.g:3615:28: ( (enumLiteral_0= '||' ) )
            // InternalAPIMappingLanguage.g:3616:1: (enumLiteral_0= '||' )
            {
            // InternalAPIMappingLanguage.g:3616:1: (enumLiteral_0= '||' )
            // InternalAPIMappingLanguage.g:3616:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_2); 

                    current = grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // InternalAPIMappingLanguage.g:3626:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalAPIMappingLanguage.g:3628:28: ( (enumLiteral_0= '&&' ) )
            // InternalAPIMappingLanguage.g:3629:1: (enumLiteral_0= '&&' )
            {
            // InternalAPIMappingLanguage.g:3629:1: (enumLiteral_0= '&&' )
            // InternalAPIMappingLanguage.g:3629:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,51,FollowSets000.FOLLOW_2); 

                    current = grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleComparingEQNEQOperator"
    // InternalAPIMappingLanguage.g:3639:1: ruleComparingEQNEQOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleComparingEQNEQOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalAPIMappingLanguage.g:3641:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) )
            // InternalAPIMappingLanguage.g:3642:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalAPIMappingLanguage.g:3642:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==52) ) {
                alt44=1;
            }
            else if ( (LA44_0==53) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalAPIMappingLanguage.g:3642:2: (enumLiteral_0= '==' )
                    {
                    // InternalAPIMappingLanguage.g:3642:2: (enumLiteral_0= '==' )
                    // InternalAPIMappingLanguage.g:3642:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,52,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:3648:6: (enumLiteral_1= '<>' )
                    {
                    // InternalAPIMappingLanguage.g:3648:6: (enumLiteral_1= '<>' )
                    // InternalAPIMappingLanguage.g:3648:8: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,53,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparingEQNEQOperatorAccess().getUNEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparingEQNEQOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleComparingEQNEQOperator"


    // $ANTLR start "ruleComparingRelOperator"
    // InternalAPIMappingLanguage.g:3658:1: ruleComparingRelOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) ;
    public final Enumerator ruleComparingRelOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalAPIMappingLanguage.g:3660:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) )
            // InternalAPIMappingLanguage.g:3661:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            {
            // InternalAPIMappingLanguage.g:3661:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt45=1;
                }
                break;
            case 54:
                {
                alt45=2;
                }
                break;
            case 55:
                {
                alt45=3;
                }
                break;
            case 43:
                {
                alt45=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalAPIMappingLanguage.g:3661:2: (enumLiteral_0= '<' )
                    {
                    // InternalAPIMappingLanguage.g:3661:2: (enumLiteral_0= '<' )
                    // InternalAPIMappingLanguage.g:3661:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:3667:6: (enumLiteral_1= '<=' )
                    {
                    // InternalAPIMappingLanguage.g:3667:6: (enumLiteral_1= '<=' )
                    // InternalAPIMappingLanguage.g:3667:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,54,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:3673:6: (enumLiteral_2= '>=' )
                    {
                    // InternalAPIMappingLanguage.g:3673:6: (enumLiteral_2= '>=' )
                    // InternalAPIMappingLanguage.g:3673:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,55,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalAPIMappingLanguage.g:3679:6: (enumLiteral_3= '>' )
                    {
                    // InternalAPIMappingLanguage.g:3679:6: (enumLiteral_3= '>' )
                    // InternalAPIMappingLanguage.g:3679:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparingRelOperatorAccess().getGREATEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparingRelOperatorAccess().getGREATEREnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleComparingRelOperator"


    // $ANTLR start "ruleAdditionOperator"
    // InternalAPIMappingLanguage.g:3689:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalAPIMappingLanguage.g:3691:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalAPIMappingLanguage.g:3692:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalAPIMappingLanguage.g:3692:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==56) ) {
                alt46=1;
            }
            else if ( (LA46_0==57) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalAPIMappingLanguage.g:3692:2: (enumLiteral_0= '+' )
                    {
                    // InternalAPIMappingLanguage.g:3692:2: (enumLiteral_0= '+' )
                    // InternalAPIMappingLanguage.g:3692:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,56,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:3698:6: (enumLiteral_1= '-' )
                    {
                    // InternalAPIMappingLanguage.g:3698:6: (enumLiteral_1= '-' )
                    // InternalAPIMappingLanguage.g:3698:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,57,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "ruleMultiplicationOperator"
    // InternalAPIMappingLanguage.g:3708:1: ruleMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalAPIMappingLanguage.g:3710:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // InternalAPIMappingLanguage.g:3711:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // InternalAPIMappingLanguage.g:3711:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt47=1;
                }
                break;
            case 59:
                {
                alt47=2;
                }
                break;
            case 60:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalAPIMappingLanguage.g:3711:2: (enumLiteral_0= '*' )
                    {
                    // InternalAPIMappingLanguage.g:3711:2: (enumLiteral_0= '*' )
                    // InternalAPIMappingLanguage.g:3711:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,58,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:3717:6: (enumLiteral_1= '/' )
                    {
                    // InternalAPIMappingLanguage.g:3717:6: (enumLiteral_1= '/' )
                    // InternalAPIMappingLanguage.g:3717:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,59,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:3723:6: (enumLiteral_2= '%' )
                    {
                    // InternalAPIMappingLanguage.g:3723:6: (enumLiteral_2= '%' )
                    // InternalAPIMappingLanguage.g:3723:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,60,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getMultiplicationOperatorAccess().getMODULOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMultiplicationOperatorAccess().getMODULOEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleMultiplicationOperator"


    // $ANTLR start "ruleUnaryPreOperator"
    // InternalAPIMappingLanguage.g:3733:1: ruleUnaryPreOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleUnaryPreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalAPIMappingLanguage.g:3735:28: ( ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) ) )
            // InternalAPIMappingLanguage.g:3736:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) )
            {
            // InternalAPIMappingLanguage.g:3736:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==61) ) {
                alt48=1;
            }
            else if ( (LA48_0==57) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalAPIMappingLanguage.g:3736:2: (enumLiteral_0= 'not' )
                    {
                    // InternalAPIMappingLanguage.g:3736:2: (enumLiteral_0= 'not' )
                    // InternalAPIMappingLanguage.g:3736:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,61,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:3742:6: (enumLiteral_1= '-' )
                    {
                    // InternalAPIMappingLanguage.g:3742:6: (enumLiteral_1= '-' )
                    // InternalAPIMappingLanguage.g:3742:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,57,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getUnaryPreOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUnaryPreOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleUnaryPreOperator"


    // $ANTLR start "rulePositionSelectorKind"
    // InternalAPIMappingLanguage.g:3752:1: rulePositionSelectorKind returns [Enumerator current=null] : ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) ) ;
    public final Enumerator rulePositionSelectorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalAPIMappingLanguage.g:3754:28: ( ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) ) )
            // InternalAPIMappingLanguage.g:3755:1: ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) )
            {
            // InternalAPIMappingLanguage.g:3755:1: ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) )
            int alt49=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt49=1;
                }
                break;
            case 63:
                {
                alt49=2;
                }
                break;
            case 64:
                {
                alt49=3;
                }
                break;
            case 65:
                {
                alt49=4;
                }
                break;
            case 66:
                {
                alt49=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalAPIMappingLanguage.g:3755:2: (enumLiteral_0= 'self' )
                    {
                    // InternalAPIMappingLanguage.g:3755:2: (enumLiteral_0= 'self' )
                    // InternalAPIMappingLanguage.g:3755:4: enumLiteral_0= 'self'
                    {
                    enumLiteral_0=(Token)match(input,62,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:3761:6: (enumLiteral_1= 'first' )
                    {
                    // InternalAPIMappingLanguage.g:3761:6: (enumLiteral_1= 'first' )
                    // InternalAPIMappingLanguage.g:3761:8: enumLiteral_1= 'first'
                    {
                    enumLiteral_1=(Token)match(input,63,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:3767:6: (enumLiteral_2= 'last' )
                    {
                    // InternalAPIMappingLanguage.g:3767:6: (enumLiteral_2= 'last' )
                    // InternalAPIMappingLanguage.g:3767:8: enumLiteral_2= 'last'
                    {
                    enumLiteral_2=(Token)match(input,64,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalAPIMappingLanguage.g:3773:6: (enumLiteral_3= 'prev' )
                    {
                    // InternalAPIMappingLanguage.g:3773:6: (enumLiteral_3= 'prev' )
                    // InternalAPIMappingLanguage.g:3773:8: enumLiteral_3= 'prev'
                    {
                    enumLiteral_3=(Token)match(input,65,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalAPIMappingLanguage.g:3779:6: (enumLiteral_4= 'next' )
                    {
                    // InternalAPIMappingLanguage.g:3779:6: (enumLiteral_4= 'next' )
                    // InternalAPIMappingLanguage.g:3779:8: enumLiteral_4= 'next'
                    {
                    enumLiteral_4=(Token)match(input,66,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getPositionSelectorKindAccess().getNEXTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPositionSelectorKindAccess().getNEXTEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "rulePositionSelectorKind"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\2\5\7\uffff\1\5\2\uffff\1\50\1\5";
    static final String dfa_3s = "\1\51\1\61\7\uffff\1\102\2\uffff\1\74\1\61";
    static final String dfa_4s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\uffff\1\1\1\10\2\uffff";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\22\uffff\1\10\5\uffff\1\2\1\uffff\1\3\1\4\1\uffff\1\5\2\uffff\1\6\2\uffff\1\7",
            "\1\7\23\uffff\1\13\1\uffff\1\12\1\uffff\1\12\11\uffff\1\11\6\uffff\4\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\14\3\12\17\uffff\1\12\22\uffff\1\12\14\uffff\1\12\3\uffff\6\12",
            "",
            "",
            "\1\15\17\uffff\5\12",
            "\1\7\25\uffff\1\12\1\uffff\1\12\11\uffff\1\11\6\uffff\4\12"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "644:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement | this_APICallExpression_8= ruleAPICallExpression )";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\2\uffff\1\3\2\uffff\1\3\2\uffff\1\11\1\uffff";
    static final String dfa_9s = "\1\5\1\uffff\1\20\1\uffff\1\5\1\20\1\5\1\20\1\5\1\uffff";
    static final String dfa_10s = "\1\102\1\uffff\1\74\1\uffff\1\102\1\74\1\102\1\74\1\102\1\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\uffff\1\3\5\uffff\1\2";
    static final String dfa_12s = "\12\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\4\3\16\uffff\2\3\15\uffff\1\1\4\uffff\1\3\14\uffff\1\3\3\uffff\6\3",
            "",
            "\1\3\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\7\uffff\2\3\1\uffff\1\4\1\3\1\uffff\3\3\2\uffff\13\3",
            "",
            "\1\3\1\5\3\3\17\uffff\1\3\22\uffff\1\3\14\uffff\1\3\3\uffff\6\3",
            "\1\6\16\uffff\1\3\10\uffff\1\3\11\uffff\4\3\2\uffff\5\3",
            "\1\3\1\7\3\3\16\uffff\2\3\15\uffff\1\3\4\uffff\1\3\14\uffff\1\3\3\uffff\6\3",
            "\1\3\27\uffff\1\3\1\uffff\1\3\1\10\6\uffff\13\3",
            "\5\3\6\uffff\1\11\10\uffff\1\3\5\uffff\1\11\10\uffff\1\11\3\uffff\1\3\14\uffff\1\3\3\uffff\6\3",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1656:1: (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression )";
        }
    }
    static final String dfa_14s = "\11\uffff";
    static final String dfa_15s = "\5\uffff\1\2\3\uffff";
    static final String dfa_16s = "\2\5\1\uffff\1\31\2\5\1\50\1\uffff\1\32";
    static final String dfa_17s = "\2\102\1\uffff\1\74\2\102\1\74\1\uffff\1\74";
    static final String dfa_18s = "\2\uffff\1\1\4\uffff\1\2\1\uffff";
    static final String dfa_19s = "\11\uffff}>";
    static final String[] dfa_20s = {
            "\5\2\17\uffff\1\1\22\uffff\1\2\21\uffff\5\2",
            "\1\3\4\2\16\uffff\2\2\22\uffff\1\2\14\uffff\1\2\3\uffff\6\2",
            "",
            "\1\2\1\5\2\uffff\1\2\11\uffff\1\4\2\uffff\2\2\1\uffff\3\2\2\uffff\13\2",
            "\1\2\1\6\3\2\17\uffff\1\2\22\uffff\1\2\14\uffff\1\2\3\uffff\6\2",
            "\5\7\6\uffff\2\2\4\uffff\1\2\2\uffff\1\7\1\2\4\uffff\1\2\2\uffff\1\2\5\uffff\1\2\1\uffff\2\2\1\7\5\uffff\13\2\1\uffff\5\7",
            "\1\10\17\uffff\5\2",
            "",
            "\1\5\2\uffff\1\2\11\uffff\1\4\2\uffff\2\2\1\uffff\3\2\2\uffff\13\2"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2739:1: (this_Operand_0= ruleOperand | ( () otherlv_2= '(' ( ( ruleDATATYPE ) ) otherlv_4= ')' ( (lv_enclosedExpression_5_0= ruleOperand ) ) ) )";
        }
    }
    static final String dfa_21s = "\3\uffff\1\6\6\uffff";
    static final String dfa_22s = "\1\5\2\uffff\1\20\3\uffff\1\5\2\uffff";
    static final String dfa_23s = "\1\102\2\uffff\1\74\3\uffff\1\102\2\uffff";
    static final String dfa_24s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\7\1\3\1\uffff\1\5\1\6";
    static final String[] dfa_25s = {
            "\1\3\3\2\1\4\17\uffff\1\1\22\uffff\1\2\21\uffff\5\5",
            "",
            "",
            "\2\6\4\uffff\1\6\2\uffff\1\10\1\6\2\uffff\1\6\1\uffff\1\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\1\uffff\1\7\2\6\2\uffff\13\6",
            "",
            "",
            "",
            "\1\11\70\uffff\5\6",
            "",
            ""
    };
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_7;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_12;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2817:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression | this_TimeValueExpression_5= ruleTimeValueExpression | this_OperationCall_6= ruleOperationCall | this_TriggerMessageExpression_7= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_8= ruleNoAttributeSelectorExpression )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xE2001080030083E0L,0x0000000000000007L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000020L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xE2001000138003E0L,0x0000000000000007L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000024B41020020L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xE2001000030003E0L,0x0000000000000007L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0003C00008000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003000000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000010000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000088000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0030000000000002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00C00C0000000002L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0300000000000002L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1C00000000000002L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0xC0001000020003E0L,0x0000000000000007L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000E00000000002L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008020000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000008000000002L});
    }


}