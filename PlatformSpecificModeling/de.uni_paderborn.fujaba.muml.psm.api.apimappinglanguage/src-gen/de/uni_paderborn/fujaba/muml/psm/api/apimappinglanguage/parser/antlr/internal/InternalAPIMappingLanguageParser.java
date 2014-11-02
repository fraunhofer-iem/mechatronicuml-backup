package de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.parser.antlr.internal; 

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
import de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.services.APIMappingLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAPIMappingLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_NUMBER", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MappingRepository:'", "'{'", "','", "'}'", "'#'", "'import'", "'PortInstance:'", "'execCommand:'", "'initCommand:'", "'enum:'", "'API_Call:'", "'('", "')'", "':='", "'port:'", "'.'", "'for'", "';'", "'while'", "'do'", "');'", "'if'", "'elseif'", "'else'", "'return'", "'['", "']'", "'const'", "'<'", "'>'", "'null'", "'++'", "'--'", "'+='", "'-='", "'||'", "'&&'", "'=='", "'<>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'not'", "'self'", "'first'", "'last'", "'prev'", "'next'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int RULE_NUMBER=7;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalAPIMappingLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAPIMappingLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAPIMappingLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g"; }



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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:68:1: entryRuleMappingRepository returns [EObject current=null] : iv_ruleMappingRepository= ruleMappingRepository EOF ;
    public final EObject entryRuleMappingRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingRepository = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:69:2: (iv_ruleMappingRepository= ruleMappingRepository EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:70:2: iv_ruleMappingRepository= ruleMappingRepository EOF
            {
             newCompositeNode(grammarAccess.getMappingRepositoryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMappingRepository_in_entryRuleMappingRepository75);
            iv_ruleMappingRepository=ruleMappingRepository();

            state._fsp--;

             current =iv_ruleMappingRepository; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMappingRepository85); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:77:1: ruleMappingRepository returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'MappingRepository:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_portApiMappings_4_0= rulePortApiMapping ) ) (otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) ) )* )? otherlv_7= '}' (otherlv_8= '#' ( (lv_comment_9_0= ruleEString ) ) )? ) ;
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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'MappingRepository:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_portApiMappings_4_0= rulePortApiMapping ) ) (otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) ) )* )? otherlv_7= '}' (otherlv_8= '#' ( (lv_comment_9_0= ruleEString ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'MappingRepository:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_portApiMappings_4_0= rulePortApiMapping ) ) (otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) ) )* )? otherlv_7= '}' (otherlv_8= '#' ( (lv_comment_9_0= ruleEString ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'MappingRepository:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_portApiMappings_4_0= rulePortApiMapping ) ) (otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) ) )* )? otherlv_7= '}' (otherlv_8= '#' ( (lv_comment_9_0= ruleEString ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:81:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'MappingRepository:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_portApiMappings_4_0= rulePortApiMapping ) ) (otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) ) )* )? otherlv_7= '}' (otherlv_8= '#' ( (lv_comment_9_0= ruleEString ) ) )?
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:81:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:82:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:82:1: (lv_imports_0_0= ruleImport )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:83:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingRepositoryAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleImport_in_ruleMappingRepository131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMappingRepositoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMappingRepository144); 

                	newLeafNode(otherlv_1, grammarAccess.getMappingRepositoryAccess().getMappingRepositoryKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:103:1: ( (lv_name_2_0= ruleEString ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:104:1: (lv_name_2_0= ruleEString )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:104:1: (lv_name_2_0= ruleEString )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:105:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMappingRepositoryAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMappingRepository165);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMappingRepositoryRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMappingRepository177); 

                	newLeafNode(otherlv_3, grammarAccess.getMappingRepositoryAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:125:1: ( ( (lv_portApiMappings_4_0= rulePortApiMapping ) ) (otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:125:2: ( (lv_portApiMappings_4_0= rulePortApiMapping ) ) (otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) ) )*
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:125:2: ( (lv_portApiMappings_4_0= rulePortApiMapping ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:126:1: (lv_portApiMappings_4_0= rulePortApiMapping )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:126:1: (lv_portApiMappings_4_0= rulePortApiMapping )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:127:3: lv_portApiMappings_4_0= rulePortApiMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsPortApiMappingParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePortApiMapping_in_ruleMappingRepository199);
                    lv_portApiMappings_4_0=rulePortApiMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMappingRepositoryRule());
                    	        }
                           		add(
                           			current, 
                           			"portApiMappings",
                            		lv_portApiMappings_4_0, 
                            		"PortApiMapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:143:2: (otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:143:4: otherlv_5= ',' ( (lv_portApiMappings_6_0= rulePortApiMapping ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMappingRepository212); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getMappingRepositoryAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:147:1: ( (lv_portApiMappings_6_0= rulePortApiMapping ) )
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:148:1: (lv_portApiMappings_6_0= rulePortApiMapping )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:148:1: (lv_portApiMappings_6_0= rulePortApiMapping )
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:149:3: lv_portApiMappings_6_0= rulePortApiMapping
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsPortApiMappingParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePortApiMapping_in_ruleMappingRepository233);
                    	    lv_portApiMappings_6_0=rulePortApiMapping();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMappingRepositoryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"portApiMappings",
                    	            		lv_portApiMappings_6_0, 
                    	            		"PortApiMapping");
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

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMappingRepository249); 

                	newLeafNode(otherlv_7, grammarAccess.getMappingRepositoryAccess().getRightCurlyBracketKeyword_5());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:169:1: (otherlv_8= '#' ( (lv_comment_9_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:169:3: otherlv_8= '#' ( (lv_comment_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMappingRepository262); 

                        	newLeafNode(otherlv_8, grammarAccess.getMappingRepositoryAccess().getNumberSignKeyword_6_0());
                        
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:173:1: ( (lv_comment_9_0= ruleEString ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:174:1: (lv_comment_9_0= ruleEString )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:174:1: (lv_comment_9_0= ruleEString )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:175:3: lv_comment_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMappingRepositoryAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMappingRepository283);
                    lv_comment_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMappingRepositoryRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_9_0, 
                            		"EString");
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:199:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:200:2: (iv_ruleImport= ruleImport EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:201:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImport_in_entryRuleImport321);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImport331); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:208:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:211:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:212:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:212:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:212:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleImport368); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:216:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:217:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:217:1: (lv_importURI_1_0= RULE_STRING )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:218:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleImport385); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:242:1: entryRulePortApiMapping returns [EObject current=null] : iv_rulePortApiMapping= rulePortApiMapping EOF ;
    public final EObject entryRulePortApiMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortApiMapping = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:243:2: (iv_rulePortApiMapping= rulePortApiMapping EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:244:2: iv_rulePortApiMapping= rulePortApiMapping EOF
            {
             newCompositeNode(grammarAccess.getPortApiMappingRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePortApiMapping_in_entryRulePortApiMapping426);
            iv_rulePortApiMapping=rulePortApiMapping();

            state._fsp--;

             current =iv_rulePortApiMapping; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePortApiMapping436); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:251:1: rulePortApiMapping returns [EObject current=null] : (otherlv_0= 'PortInstance:' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'execCommand:' ( (lv_execCommand_4_0= ruleEntry ) ) (otherlv_5= 'initCommand:' ( (lv_initCommand_6_0= ruleEntry ) ) )? otherlv_7= '}' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:254:28: ( (otherlv_0= 'PortInstance:' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'execCommand:' ( (lv_execCommand_4_0= ruleEntry ) ) (otherlv_5= 'initCommand:' ( (lv_initCommand_6_0= ruleEntry ) ) )? otherlv_7= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:255:1: (otherlv_0= 'PortInstance:' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'execCommand:' ( (lv_execCommand_4_0= ruleEntry ) ) (otherlv_5= 'initCommand:' ( (lv_initCommand_6_0= ruleEntry ) ) )? otherlv_7= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:255:1: (otherlv_0= 'PortInstance:' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'execCommand:' ( (lv_execCommand_4_0= ruleEntry ) ) (otherlv_5= 'initCommand:' ( (lv_initCommand_6_0= ruleEntry ) ) )? otherlv_7= '}' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:255:3: otherlv_0= 'PortInstance:' ( ( ruleEString ) ) otherlv_2= '{' otherlv_3= 'execCommand:' ( (lv_execCommand_4_0= ruleEntry ) ) (otherlv_5= 'initCommand:' ( (lv_initCommand_6_0= ruleEntry ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePortApiMapping473); 

                	newLeafNode(otherlv_0, grammarAccess.getPortApiMappingAccess().getPortInstanceKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:259:1: ( ( ruleEString ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:260:1: ( ruleEString )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:260:1: ( ruleEString )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:261:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPortApiMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPortApiMappingAccess().getPortContinuousPortInstanceCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePortApiMapping496);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePortApiMapping508); 

                	newLeafNode(otherlv_2, grammarAccess.getPortApiMappingAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePortApiMapping520); 

                	newLeafNode(otherlv_3, grammarAccess.getPortApiMappingAccess().getExecCommandKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:282:1: ( (lv_execCommand_4_0= ruleEntry ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:283:1: (lv_execCommand_4_0= ruleEntry )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:283:1: (lv_execCommand_4_0= ruleEntry )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:284:3: lv_execCommand_4_0= ruleEntry
            {
             
            	        newCompositeNode(grammarAccess.getPortApiMappingAccess().getExecCommandEntryParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEntry_in_rulePortApiMapping541);
            lv_execCommand_4_0=ruleEntry();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPortApiMappingRule());
            	        }
                   		set(
                   			current, 
                   			"execCommand",
                    		lv_execCommand_4_0, 
                    		"Entry");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:300:2: (otherlv_5= 'initCommand:' ( (lv_initCommand_6_0= ruleEntry ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:300:4: otherlv_5= 'initCommand:' ( (lv_initCommand_6_0= ruleEntry ) )
                    {
                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePortApiMapping554); 

                        	newLeafNode(otherlv_5, grammarAccess.getPortApiMappingAccess().getInitCommandKeyword_5_0());
                        
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:304:1: ( (lv_initCommand_6_0= ruleEntry ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:305:1: (lv_initCommand_6_0= ruleEntry )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:305:1: (lv_initCommand_6_0= ruleEntry )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:306:3: lv_initCommand_6_0= ruleEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getPortApiMappingAccess().getInitCommandEntryParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEntry_in_rulePortApiMapping575);
                    lv_initCommand_6_0=ruleEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPortApiMappingRule());
                    	        }
                           		set(
                           			current, 
                           			"initCommand",
                            		lv_initCommand_6_0, 
                            		"Entry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePortApiMapping589); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:334:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:335:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:336:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression625);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression635); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:343:1: ruleExpression returns [EObject current=null] : (this_APICallExpression_0= ruleAPICallExpression | this_LogicalExpression_1= ruleLogicalExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_APICallExpression_0 = null;

        EObject this_LogicalExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:346:28: ( (this_APICallExpression_0= ruleAPICallExpression | this_LogicalExpression_1= ruleLogicalExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:347:1: (this_APICallExpression_0= ruleAPICallExpression | this_LogicalExpression_1= ruleLogicalExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:347:1: (this_APICallExpression_0= ruleAPICallExpression | this_LogicalExpression_1= ruleLogicalExpression )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_BOOLEAN)||LA6_0==24||LA6_0==43||LA6_0==55||(LA6_0>=58 && LA6_0<=63)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:348:5: this_APICallExpression_0= ruleAPICallExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getAPICallExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAPICallExpression_in_ruleExpression682);
                    this_APICallExpression_0=ruleAPICallExpression();

                    state._fsp--;

                     
                            current = this_APICallExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:358:5: this_LogicalExpression_1= ruleLogicalExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getLogicalExpressionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalExpression_in_ruleExpression709);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:374:1: entryRuleEnumerationValueExpression returns [EObject current=null] : iv_ruleEnumerationValueExpression= ruleEnumerationValueExpression EOF ;
    public final EObject entryRuleEnumerationValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationValueExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:375:2: (iv_ruleEnumerationValueExpression= ruleEnumerationValueExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:376:2: iv_ruleEnumerationValueExpression= ruleEnumerationValueExpression EOF
            {
             newCompositeNode(grammarAccess.getEnumerationValueExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumerationValueExpression_in_entryRuleEnumerationValueExpression744);
            iv_ruleEnumerationValueExpression=ruleEnumerationValueExpression();

            state._fsp--;

             current =iv_ruleEnumerationValueExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerationValueExpression754); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:383:1: ruleEnumerationValueExpression returns [EObject current=null] : (otherlv_0= 'enum:' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEnumerationValueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:386:28: ( (otherlv_0= 'enum:' ( (otherlv_1= RULE_ID ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:387:1: (otherlv_0= 'enum:' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:387:1: (otherlv_0= 'enum:' ( (otherlv_1= RULE_ID ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:387:3: otherlv_0= 'enum:' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEnumerationValueExpression791); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerationValueExpressionAccess().getEnumKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:391:1: ( (otherlv_1= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:392:1: (otherlv_1= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:392:1: (otherlv_1= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:393:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumerationValueExpressionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumerationValueExpression811); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:412:1: entryRuleAPICallExpression returns [EObject current=null] : iv_ruleAPICallExpression= ruleAPICallExpression EOF ;
    public final EObject entryRuleAPICallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAPICallExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:413:2: (iv_ruleAPICallExpression= ruleAPICallExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:414:2: iv_ruleAPICallExpression= ruleAPICallExpression EOF
            {
             newCompositeNode(grammarAccess.getAPICallExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAPICallExpression_in_entryRuleAPICallExpression847);
            iv_ruleAPICallExpression=ruleAPICallExpression();

            state._fsp--;

             current =iv_ruleAPICallExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAPICallExpression857); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:421:1: ruleAPICallExpression returns [EObject current=null] : (otherlv_0= 'API_Call:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameterBindings_3_0= ruleParamaterBinding ) ) (otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) ) )* )? otherlv_6= ')' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:424:28: ( (otherlv_0= 'API_Call:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameterBindings_3_0= ruleParamaterBinding ) ) (otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) ) )* )? otherlv_6= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:425:1: (otherlv_0= 'API_Call:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameterBindings_3_0= ruleParamaterBinding ) ) (otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) ) )* )? otherlv_6= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:425:1: (otherlv_0= 'API_Call:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameterBindings_3_0= ruleParamaterBinding ) ) (otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) ) )* )? otherlv_6= ')' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:425:3: otherlv_0= 'API_Call:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameterBindings_3_0= ruleParamaterBinding ) ) (otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAPICallExpression894); 

                	newLeafNode(otherlv_0, grammarAccess.getAPICallExpressionAccess().getAPI_CallKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:429:1: ( (otherlv_1= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:430:1: (otherlv_1= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:430:1: (otherlv_1= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:431:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAPICallExpressionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAPICallExpression914); 

            		newLeafNode(otherlv_1, grammarAccess.getAPICallExpressionAccess().getApiCommandAPICommandCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAPICallExpression926); 

                	newLeafNode(otherlv_2, grammarAccess.getAPICallExpressionAccess().getLeftParenthesisKeyword_2());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:446:1: ( ( (lv_parameterBindings_3_0= ruleParamaterBinding ) ) (otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:446:2: ( (lv_parameterBindings_3_0= ruleParamaterBinding ) ) (otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) ) )*
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:446:2: ( (lv_parameterBindings_3_0= ruleParamaterBinding ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:447:1: (lv_parameterBindings_3_0= ruleParamaterBinding )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:447:1: (lv_parameterBindings_3_0= ruleParamaterBinding )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:448:3: lv_parameterBindings_3_0= ruleParamaterBinding
                    {
                     
                    	        newCompositeNode(grammarAccess.getAPICallExpressionAccess().getParameterBindingsParamaterBindingParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParamaterBinding_in_ruleAPICallExpression948);
                    lv_parameterBindings_3_0=ruleParamaterBinding();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAPICallExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameterBindings",
                            		lv_parameterBindings_3_0, 
                            		"ParamaterBinding");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:464:2: (otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:464:4: otherlv_4= ',' ( (lv_parameterBindings_5_0= ruleParamaterBinding ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAPICallExpression961); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getAPICallExpressionAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:468:1: ( (lv_parameterBindings_5_0= ruleParamaterBinding ) )
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:469:1: (lv_parameterBindings_5_0= ruleParamaterBinding )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:469:1: (lv_parameterBindings_5_0= ruleParamaterBinding )
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:470:3: lv_parameterBindings_5_0= ruleParamaterBinding
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAPICallExpressionAccess().getParameterBindingsParamaterBindingParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParamaterBinding_in_ruleAPICallExpression982);
                    	    lv_parameterBindings_5_0=ruleParamaterBinding();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAPICallExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameterBindings",
                    	            		lv_parameterBindings_5_0, 
                    	            		"ParamaterBinding");
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

            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAPICallExpression998); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:498:1: entryRuleParamaterBinding returns [EObject current=null] : iv_ruleParamaterBinding= ruleParamaterBinding EOF ;
    public final EObject entryRuleParamaterBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamaterBinding = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:499:2: (iv_ruleParamaterBinding= ruleParamaterBinding EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:500:2: iv_ruleParamaterBinding= ruleParamaterBinding EOF
            {
             newCompositeNode(grammarAccess.getParamaterBindingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParamaterBinding_in_entryRuleParamaterBinding1034);
            iv_ruleParamaterBinding=ruleParamaterBinding();

            state._fsp--;

             current =iv_ruleParamaterBinding; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParamaterBinding1044); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:507:1: ruleParamaterBinding returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions ) ) ) ) ;
    public final EObject ruleParamaterBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_3_1 = null;

        EObject lv_value_3_2 = null;

        EObject lv_value_3_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:510:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:511:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:511:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:511:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:511:2: ()
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:512:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParamaterBindingAccess().getParameterBindingAction_0(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:517:2: ( (otherlv_1= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:518:1: (otherlv_1= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:518:1: (otherlv_1= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:519:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParamaterBindingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParamaterBinding1098); 

            		newLeafNode(otherlv_1, grammarAccess.getParamaterBindingAccess().getParameterParameterCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleParamaterBinding1110); 

                	newLeafNode(otherlv_2, grammarAccess.getParamaterBindingAccess().getColonEqualsSignKeyword_2());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:534:1: ( ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:535:1: ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:535:1: ( (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:536:1: (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:536:1: (lv_value_3_1= ruleExpression | lv_value_3_2= ruleEnumerationValueExpression | lv_value_3_3= ruleContiniousPortExpressions )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case RULE_NUMBER:
            case RULE_BOOLEAN:
            case 23:
            case 24:
            case 43:
            case 55:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 27:
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
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:537:3: lv_value_3_1= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getParamaterBindingAccess().getValueExpressionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleParamaterBinding1133);
                    lv_value_3_1=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParamaterBindingRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_1, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:552:8: lv_value_3_2= ruleEnumerationValueExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getParamaterBindingAccess().getValueEnumerationValueExpressionParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerationValueExpression_in_ruleParamaterBinding1152);
                    lv_value_3_2=ruleEnumerationValueExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParamaterBindingRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_2, 
                            		"EnumerationValueExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:567:8: lv_value_3_3= ruleContiniousPortExpressions
                    {
                     
                    	        newCompositeNode(grammarAccess.getParamaterBindingAccess().getValueContiniousPortExpressionsParserRuleCall_3_0_2()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleContiniousPortExpressions_in_ruleParamaterBinding1171);
                    lv_value_3_3=ruleContiniousPortExpressions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParamaterBindingRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_3, 
                            		"ContiniousPortExpressions");
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:593:1: entryRuleContiniousPortExpressions returns [EObject current=null] : iv_ruleContiniousPortExpressions= ruleContiniousPortExpressions EOF ;
    public final EObject entryRuleContiniousPortExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContiniousPortExpressions = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:594:2: (iv_ruleContiniousPortExpressions= ruleContiniousPortExpressions EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:595:2: iv_ruleContiniousPortExpressions= ruleContiniousPortExpressions EOF
            {
             newCompositeNode(grammarAccess.getContiniousPortExpressionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContiniousPortExpressions_in_entryRuleContiniousPortExpressions1210);
            iv_ruleContiniousPortExpressions=ruleContiniousPortExpressions();

            state._fsp--;

             current =iv_ruleContiniousPortExpressions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContiniousPortExpressions1220); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:602:1: ruleContiniousPortExpressions returns [EObject current=null] : (otherlv_0= 'port:' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleContiniousPortExpressions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:605:28: ( (otherlv_0= 'port:' ( (otherlv_1= RULE_ID ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:606:1: (otherlv_0= 'port:' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:606:1: (otherlv_0= 'port:' ( (otherlv_1= RULE_ID ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:606:3: otherlv_0= 'port:' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleContiniousPortExpressions1257); 

                	newLeafNode(otherlv_0, grammarAccess.getContiniousPortExpressionsAccess().getPortKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:610:1: ( (otherlv_1= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:611:1: (otherlv_1= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:611:1: (otherlv_1= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:612:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContiniousPortExpressionsRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleContiniousPortExpressions1277); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:631:1: entryRuleExpressionStartRule returns [EObject current=null] : iv_ruleExpressionStartRule= ruleExpressionStartRule EOF ;
    public final EObject entryRuleExpressionStartRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStartRule = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:632:2: (iv_ruleExpressionStartRule= ruleExpressionStartRule EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:633:2: iv_ruleExpressionStartRule= ruleExpressionStartRule EOF
            {
             newCompositeNode(grammarAccess.getExpressionStartRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionStartRule_in_entryRuleExpressionStartRule1313);
            iv_ruleExpressionStartRule=ruleExpressionStartRule();

            state._fsp--;

             current =iv_ruleExpressionStartRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionStartRule1323); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:640:1: ruleExpressionStartRule returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement | this_APICallExpression_8= ruleAPICallExpression ) ;
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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:643:28: ( (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement | this_APICallExpression_8= ruleAPICallExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:644:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement | this_APICallExpression_8= ruleAPICallExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:644:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement | this_APICallExpression_8= ruleAPICallExpression )
            int alt10=9;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:645:5: this_Assignment_0= ruleAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getAssignmentParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleExpressionStartRule1370);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;

                     
                            current = this_Assignment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:655:5: this_ForLoop_1= ruleForLoop
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getForLoopParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleForLoop_in_ruleExpressionStartRule1397);
                    this_ForLoop_1=ruleForLoop();

                    state._fsp--;

                     
                            current = this_ForLoop_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:665:5: this_WhileLoop_2= ruleWhileLoop
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getWhileLoopParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWhileLoop_in_ruleExpressionStartRule1424);
                    this_WhileLoop_2=ruleWhileLoop();

                    state._fsp--;

                     
                            current = this_WhileLoop_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:675:5: this_DoWhileLoop_3= ruleDoWhileLoop
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getDoWhileLoopParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDoWhileLoop_in_ruleExpressionStartRule1451);
                    this_DoWhileLoop_3=ruleDoWhileLoop();

                    state._fsp--;

                     
                            current = this_DoWhileLoop_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:685:5: this_IfStatement_4= ruleIfStatement
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getIfStatementParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIfStatement_in_ruleExpressionStartRule1478);
                    this_IfStatement_4=ruleIfStatement();

                    state._fsp--;

                     
                            current = this_IfStatement_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:695:5: this_ReturnStatement_5= ruleReturnStatement
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getReturnStatementParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReturnStatement_in_ruleExpressionStartRule1505);
                    this_ReturnStatement_5=ruleReturnStatement();

                    state._fsp--;

                     
                            current = this_ReturnStatement_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:705:5: this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getLocalVariableOrConstantDeclarationStatementParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLocalVariableOrConstantDeclarationStatement_in_ruleExpressionStartRule1532);
                    this_LocalVariableOrConstantDeclarationStatement_6=ruleLocalVariableOrConstantDeclarationStatement();

                    state._fsp--;

                     
                            current = this_LocalVariableOrConstantDeclarationStatement_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:715:5: this_OperationCallStatement_7= ruleOperationCallStatement
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getOperationCallStatementParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOperationCallStatement_in_ruleExpressionStartRule1559);
                    this_OperationCallStatement_7=ruleOperationCallStatement();

                    state._fsp--;

                     
                            current = this_OperationCallStatement_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:725:5: this_APICallExpression_8= ruleAPICallExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getAPICallExpressionParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAPICallExpression_in_ruleExpressionStartRule1586);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:741:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:742:2: (iv_ruleEString= ruleEString EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:743:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1622);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1633); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:750:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_QualifiedName_1= ruleQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_QualifiedName_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:753:28: ( (this_ID_0= RULE_ID | this_QualifiedName_1= ruleQualifiedName ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:754:1: (this_ID_0= RULE_ID | this_QualifiedName_1= ruleQualifiedName )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:754:1: (this_ID_0= RULE_ID | this_QualifiedName_1= ruleQualifiedName )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==28) ) {
                    alt11=2;
                }
                else if ( (LA11_1==EOF||LA11_1==14) ) {
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
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:754:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1673); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getEStringAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:763:5: this_QualifiedName_1= ruleQualifiedName
                    {
                     
                            newCompositeNode(grammarAccess.getEStringAccess().getQualifiedNameParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleEString1706);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:781:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:782:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:783:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1752);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName1763); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:790:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:793:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:794:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:794:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:794:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName1803); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:801:1: (kw= '.' this_ID_2= RULE_ID )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:802:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleQualifiedName1822); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName1837); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:822:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:823:2: (iv_ruleEntry= ruleEntry EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:824:2: iv_ruleEntry= ruleEntry EOF
            {
             newCompositeNode(grammarAccess.getEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntry_in_entryRuleEntry1884);
            iv_ruleEntry=ruleEntry();

            state._fsp--;

             current =iv_ruleEntry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntry1894); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:831:1: ruleEntry returns [EObject current=null] : (this_Block_0= ruleBlock | this_Expression_1= ruleExpression | this_ArrayInitializeExpression_2= ruleArrayInitializeExpression ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_Expression_1 = null;

        EObject this_ArrayInitializeExpression_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:834:28: ( (this_Block_0= ruleBlock | this_Expression_1= ruleExpression | this_ArrayInitializeExpression_2= ruleArrayInitializeExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:835:1: (this_Block_0= ruleBlock | this_Expression_1= ruleExpression | this_ArrayInitializeExpression_2= ruleArrayInitializeExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:835:1: (this_Block_0= ruleBlock | this_Expression_1= ruleExpression | this_ArrayInitializeExpression_2= ruleArrayInitializeExpression )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_NUMBER:
            case RULE_BOOLEAN:
            case 23:
            case 24:
            case 43:
            case 55:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt13=2;
                }
                break;
            case 38:
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
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:836:5: this_Block_0= ruleBlock
                    {
                     
                            newCompositeNode(grammarAccess.getEntryAccess().getBlockParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleEntry1941);
                    this_Block_0=ruleBlock();

                    state._fsp--;

                     
                            current = this_Block_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:846:5: this_Expression_1= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getEntryAccess().getExpressionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleEntry1968);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:856:5: this_ArrayInitializeExpression_2= ruleArrayInitializeExpression
                    {
                     
                            newCompositeNode(grammarAccess.getEntryAccess().getArrayInitializeExpressionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleArrayInitializeExpression_in_ruleEntry1995);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:872:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:876:2: (iv_ruleBlock= ruleBlock EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:877:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_entryRuleBlock2036);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBlock2046); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:887:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:891:28: ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:892:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:892:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:892:2: () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}'
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:892:2: ()
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:893:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBlock2096); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:902:1: ( (lv_expressions_2_0= ruleExpressionStartRule ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==23||LA14_0==29||(LA14_0>=31 && LA14_0<=32)||LA14_0==34||LA14_0==37||LA14_0==40) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:903:1: (lv_expressions_2_0= ruleExpressionStartRule )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:903:1: (lv_expressions_2_0= ruleExpressionStartRule )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:904:3: lv_expressions_2_0= ruleExpressionStartRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockAccess().getExpressionsExpressionStartRuleParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleExpressionStartRule_in_ruleBlock2117);
            	    lv_expressions_2_0=ruleExpressionStartRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_2_0, 
            	            		"ExpressionStartRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBlock2130); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:935:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:936:2: (iv_ruleForLoop= ruleForLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:937:2: iv_ruleForLoop= ruleForLoop EOF
            {
             newCompositeNode(grammarAccess.getForLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleForLoop_in_entryRuleForLoop2170);
            iv_ruleForLoop=ruleForLoop();

            state._fsp--;

             current =iv_ruleForLoop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForLoop2180); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:944:1: ruleForLoop returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) ) ;
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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:947:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:948:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:948:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:948:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleForLoop2217); 

                	newLeafNode(otherlv_0, grammarAccess.getForLoopAccess().getForKeyword_0());
                
            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleForLoop2229); 

                	newLeafNode(otherlv_1, grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:956:1: ( (lv_initializeExpression_2_0= ruleAssignment ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:957:1: (lv_initializeExpression_2_0= ruleAssignment )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:957:1: (lv_initializeExpression_2_0= ruleAssignment )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:958:3: lv_initializeExpression_2_0= ruleAssignment
            {
             
            	        newCompositeNode(grammarAccess.getForLoopAccess().getInitializeExpressionAssignmentParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleForLoop2250);
            lv_initializeExpression_2_0=ruleAssignment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForLoopRule());
            	        }
                   		set(
                   			current, 
                   			"initializeExpression",
                    		lv_initializeExpression_2_0, 
                    		"Assignment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:974:2: ( (lv_loopTest_3_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:975:1: (lv_loopTest_3_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:975:1: (lv_loopTest_3_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:976:3: lv_loopTest_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getForLoopAccess().getLoopTestExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleForLoop2271);
            lv_loopTest_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForLoopRule());
            	        }
                   		set(
                   			current, 
                   			"loopTest",
                    		lv_loopTest_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleForLoop2283); 

                	newLeafNode(otherlv_4, grammarAccess.getForLoopAccess().getSemicolonKeyword_4());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:996:1: ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:997:1: (lv_countingExpression_5_0= ruleForLoopCountingExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:997:1: (lv_countingExpression_5_0= ruleForLoopCountingExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:998:3: lv_countingExpression_5_0= ruleForLoopCountingExpression
            {
             
            	        newCompositeNode(grammarAccess.getForLoopAccess().getCountingExpressionForLoopCountingExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleForLoopCountingExpression_in_ruleForLoop2304);
            lv_countingExpression_5_0=ruleForLoopCountingExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForLoopRule());
            	        }
                   		set(
                   			current, 
                   			"countingExpression",
                    		lv_countingExpression_5_0, 
                    		"ForLoopCountingExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleForLoop2316); 

                	newLeafNode(otherlv_6, grammarAccess.getForLoopAccess().getRightParenthesisKeyword_6());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1018:1: ( (lv_block_7_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1019:1: (lv_block_7_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1019:1: (lv_block_7_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1020:3: lv_block_7_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleForLoop2337);
            lv_block_7_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForLoopRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_7_0, 
                    		"Block");
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1044:1: entryRuleForLoopCountingExpression returns [EObject current=null] : iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF ;
    public final EObject entryRuleForLoopCountingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoopCountingExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1045:2: (iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1046:2: iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF
            {
             newCompositeNode(grammarAccess.getForLoopCountingExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleForLoopCountingExpression_in_entryRuleForLoopCountingExpression2373);
            iv_ruleForLoopCountingExpression=ruleForLoopCountingExpression();

            state._fsp--;

             current =iv_ruleForLoopCountingExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForLoopCountingExpression2383); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1053:1: ruleForLoopCountingExpression returns [EObject current=null] : ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) ) ) ;
    public final EObject ruleForLoopCountingExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_typedNamedElementExpression_0_0 = null;

        Enumerator lv_incrementDecrementOperator_1_0 = null;

        Enumerator lv_assignOperator_2_0 = null;

        EObject lv_rhs_assignExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1056:28: ( ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1057:1: ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1057:1: ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1057:2: ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1057:2: ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1058:1: (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1058:1: (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1059:3: lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression
            {
             
            	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getLhs_typedNamedElementExpressionTypedNamedElementExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTypedNamedElementExpression_in_ruleForLoopCountingExpression2429);
            lv_lhs_typedNamedElementExpression_0_0=ruleTypedNamedElementExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForLoopCountingExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"lhs_typedNamedElementExpression",
                    		lv_lhs_typedNamedElementExpression_0_0, 
                    		"TypedNamedElementExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1075:2: ( ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=44 && LA15_0<=45)) ) {
                alt15=1;
            }
            else if ( (LA15_0==26||(LA15_0>=46 && LA15_0<=47)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1075:3: ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1075:3: ( (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1076:1: (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1076:1: (lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1077:3: lv_incrementDecrementOperator_1_0= ruleUnaryPostIncrementDecrementOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorUnaryPostIncrementDecrementOperatorEnumRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryPostIncrementDecrementOperator_in_ruleForLoopCountingExpression2451);
                    lv_incrementDecrementOperator_1_0=ruleUnaryPostIncrementDecrementOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForLoopCountingExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"incrementDecrementOperator",
                            		lv_incrementDecrementOperator_1_0, 
                            		"UnaryPostIncrementDecrementOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1094:6: ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1094:6: ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1094:7: ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1094:7: ( (lv_assignOperator_2_0= ruleAssignOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1095:1: (lv_assignOperator_2_0= ruleAssignOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1095:1: (lv_assignOperator_2_0= ruleAssignOperator )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1096:3: lv_assignOperator_2_0= ruleAssignOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssignOperator_in_ruleForLoopCountingExpression2479);
                    lv_assignOperator_2_0=ruleAssignOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForLoopCountingExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"assignOperator",
                            		lv_assignOperator_2_0, 
                            		"AssignOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1112:2: ( (lv_rhs_assignExpression_3_0= ruleExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1113:1: (lv_rhs_assignExpression_3_0= ruleExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1113:1: (lv_rhs_assignExpression_3_0= ruleExpression )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1114:3: lv_rhs_assignExpression_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getRhs_assignExpressionExpressionParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleForLoopCountingExpression2500);
                    lv_rhs_assignExpression_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForLoopCountingExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rhs_assignExpression",
                            		lv_rhs_assignExpression_3_0, 
                            		"Expression");
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1138:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1139:2: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1140:2: iv_ruleWhileLoop= ruleWhileLoop EOF
            {
             newCompositeNode(grammarAccess.getWhileLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWhileLoop_in_entryRuleWhileLoop2538);
            iv_ruleWhileLoop=ruleWhileLoop();

            state._fsp--;

             current =iv_ruleWhileLoop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWhileLoop2548); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1147:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_loopTest_2_0 = null;

        EObject lv_block_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1150:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1151:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1151:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1151:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleWhileLoop2585); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileKeyword_0());
                
            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleWhileLoop2597); 

                	newLeafNode(otherlv_1, grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1159:1: ( (lv_loopTest_2_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1160:1: (lv_loopTest_2_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1160:1: (lv_loopTest_2_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1161:3: lv_loopTest_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getWhileLoopAccess().getLoopTestExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleWhileLoop2618);
            lv_loopTest_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            	        }
                   		set(
                   			current, 
                   			"loopTest",
                    		lv_loopTest_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleWhileLoop2630); 

                	newLeafNode(otherlv_3, grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1181:1: ( (lv_block_4_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1182:1: (lv_block_4_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1182:1: (lv_block_4_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1183:3: lv_block_4_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getWhileLoopAccess().getBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleWhileLoop2651);
            lv_block_4_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_4_0, 
                    		"Block");
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1207:1: entryRuleDoWhileLoop returns [EObject current=null] : iv_ruleDoWhileLoop= ruleDoWhileLoop EOF ;
    public final EObject entryRuleDoWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhileLoop = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1208:2: (iv_ruleDoWhileLoop= ruleDoWhileLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1209:2: iv_ruleDoWhileLoop= ruleDoWhileLoop EOF
            {
             newCompositeNode(grammarAccess.getDoWhileLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDoWhileLoop_in_entryRuleDoWhileLoop2687);
            iv_ruleDoWhileLoop=ruleDoWhileLoop();

            state._fsp--;

             current =iv_ruleDoWhileLoop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoWhileLoop2697); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1216:1: ruleDoWhileLoop returns [EObject current=null] : (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1219:28: ( (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1220:1: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1220:1: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1220:3: otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDoWhileLoop2734); 

                	newLeafNode(otherlv_0, grammarAccess.getDoWhileLoopAccess().getDoKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1224:1: ( (lv_block_1_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1225:1: (lv_block_1_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1225:1: (lv_block_1_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1226:3: lv_block_1_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getDoWhileLoopAccess().getBlockBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleDoWhileLoop2755);
            lv_block_1_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDoWhileLoopRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_1_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDoWhileLoop2767); 

                	newLeafNode(otherlv_2, grammarAccess.getDoWhileLoopAccess().getWhileKeyword_2());
                
            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDoWhileLoop2779); 

                	newLeafNode(otherlv_3, grammarAccess.getDoWhileLoopAccess().getLeftParenthesisKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1250:1: ( (lv_loopTest_4_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1251:1: (lv_loopTest_4_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1251:1: (lv_loopTest_4_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1252:3: lv_loopTest_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getDoWhileLoopAccess().getLoopTestExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleDoWhileLoop2800);
            lv_loopTest_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDoWhileLoopRule());
            	        }
                   		set(
                   			current, 
                   			"loopTest",
                    		lv_loopTest_4_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleDoWhileLoop2812); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1280:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1281:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1282:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIfStatement_in_entryRuleIfStatement2848);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfStatement2858); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1289:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_ifCondition_2_0 = null;

        EObject lv_ifBlock_4_0 = null;

        EObject lv_elseIfConditions_7_0 = null;

        EObject lv_elseIfBlocks_9_0 = null;

        EObject lv_elseBlock_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1292:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1293:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1293:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1293:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )?
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleIfStatement2895); 

                	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleIfStatement2907); 

                	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1301:1: ( (lv_ifCondition_2_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1302:1: (lv_ifCondition_2_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1302:1: (lv_ifCondition_2_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1303:3: lv_ifCondition_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getIfStatementAccess().getIfConditionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIfStatement2928);
            lv_ifCondition_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	        }
                   		set(
                   			current, 
                   			"ifCondition",
                    		lv_ifCondition_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleIfStatement2940); 

                	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1323:1: ( (lv_ifBlock_4_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1324:1: (lv_ifBlock_4_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1324:1: (lv_ifBlock_4_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1325:3: lv_ifBlock_4_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getIfStatementAccess().getIfBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIfStatement2961);
            lv_ifBlock_4_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	        }
                   		set(
                   			current, 
                   			"ifBlock",
                    		lv_ifBlock_4_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1341:2: (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1341:4: otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) )
            	    {
            	    otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleIfStatement2974); 

            	        	newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseifKeyword_5_0());
            	        
            	    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleIfStatement2986); 

            	        	newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_5_1());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1349:1: ( (lv_elseIfConditions_7_0= ruleExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1350:1: (lv_elseIfConditions_7_0= ruleExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1350:1: (lv_elseIfConditions_7_0= ruleExpression )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1351:3: lv_elseIfConditions_7_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseIfConditionsExpressionParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIfStatement3007);
            	    lv_elseIfConditions_7_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elseIfConditions",
            	            		lv_elseIfConditions_7_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleIfStatement3019); 

            	        	newLeafNode(otherlv_8, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_5_3());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1371:1: ( (lv_elseIfBlocks_9_0= ruleBlock ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1372:1: (lv_elseIfBlocks_9_0= ruleBlock )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1372:1: (lv_elseIfBlocks_9_0= ruleBlock )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1373:3: lv_elseIfBlocks_9_0= ruleBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseIfBlocksBlockParserRuleCall_5_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIfStatement3040);
            	    lv_elseIfBlocks_9_0=ruleBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elseIfBlocks",
            	            		lv_elseIfBlocks_9_0, 
            	            		"Block");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1389:4: (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1389:6: otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) )
                    {
                    otherlv_10=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleIfStatement3055); 

                        	newLeafNode(otherlv_10, grammarAccess.getIfStatementAccess().getElseKeyword_6_0());
                        
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1393:1: ( (lv_elseBlock_11_0= ruleBlock ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1394:1: (lv_elseBlock_11_0= ruleBlock )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1394:1: (lv_elseBlock_11_0= ruleBlock )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1395:3: lv_elseBlock_11_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIfStatement3076);
                    lv_elseBlock_11_0=ruleBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"elseBlock",
                            		lv_elseBlock_11_0, 
                            		"Block");
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


    // $ANTLR start "entryRuleReturnStatement"
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1419:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1420:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1421:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
             newCompositeNode(grammarAccess.getReturnStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement3114);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;

             current =iv_ruleReturnStatement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReturnStatement3124); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1428:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1431:28: ( ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1432:1: ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1432:1: ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1432:2: () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1432:2: ()
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1433:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleReturnStatement3170); 

                	newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getReturnKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1442:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1443:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1443:1: (lv_expression_2_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1444:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleReturnStatement3191);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReturnStatementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleReturnStatement3203); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1472:1: entryRuleOperationCallStatement returns [EObject current=null] : iv_ruleOperationCallStatement= ruleOperationCallStatement EOF ;
    public final EObject entryRuleOperationCallStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCallStatement = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1473:2: (iv_ruleOperationCallStatement= ruleOperationCallStatement EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1474:2: iv_ruleOperationCallStatement= ruleOperationCallStatement EOF
            {
             newCompositeNode(grammarAccess.getOperationCallStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperationCallStatement_in_entryRuleOperationCallStatement3239);
            iv_ruleOperationCallStatement=ruleOperationCallStatement();

            state._fsp--;

             current =iv_ruleOperationCallStatement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperationCallStatement3249); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1481:1: ruleOperationCallStatement returns [EObject current=null] : (this_OperationCall_0= ruleOperationCall otherlv_1= ';' ) ;
    public final EObject ruleOperationCallStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_OperationCall_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1484:28: ( (this_OperationCall_0= ruleOperationCall otherlv_1= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1485:1: (this_OperationCall_0= ruleOperationCall otherlv_1= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1485:1: (this_OperationCall_0= ruleOperationCall otherlv_1= ';' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1486:5: this_OperationCall_0= ruleOperationCall otherlv_1= ';'
            {
             
                    newCompositeNode(grammarAccess.getOperationCallStatementAccess().getOperationCallParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOperationCall_in_ruleOperationCallStatement3296);
            this_OperationCall_0=ruleOperationCall();

            state._fsp--;

             
                    current = this_OperationCall_0; 
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleOperationCallStatement3307); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1506:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1507:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1508:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment3343);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment3353); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1515:1: ruleAssignment returns [EObject current=null] : ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_lhs_typedNamedElementExpression_0_0 = null;

        Enumerator lv_assignOperator_1_0 = null;

        EObject lv_rhs_assignExpression_2_0 = null;

        Enumerator lv_incrementDecrementOperator_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1518:28: ( ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) ) otherlv_4= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1519:1: ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) ) otherlv_4= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1519:1: ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) ) otherlv_4= ';' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1519:2: ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) ) otherlv_4= ';'
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1519:2: ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1520:1: (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1520:1: (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1521:3: lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getLhs_typedNamedElementExpressionTypedNamedElementExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTypedNamedElementExpression_in_ruleAssignment3399);
            lv_lhs_typedNamedElementExpression_0_0=ruleTypedNamedElementExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"lhs_typedNamedElementExpression",
                    		lv_lhs_typedNamedElementExpression_0_0, 
                    		"TypedNamedElementExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1537:2: ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26||(LA18_0>=46 && LA18_0<=47)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=44 && LA18_0<=45)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1537:3: ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1537:3: ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1537:4: ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1537:4: ( (lv_assignOperator_1_0= ruleAssignOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1538:1: (lv_assignOperator_1_0= ruleAssignOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1538:1: (lv_assignOperator_1_0= ruleAssignOperator )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1539:3: lv_assignOperator_1_0= ruleAssignOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssignOperator_in_ruleAssignment3422);
                    lv_assignOperator_1_0=ruleAssignOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	        }
                           		set(
                           			current, 
                           			"assignOperator",
                            		lv_assignOperator_1_0, 
                            		"AssignOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1555:2: ( (lv_rhs_assignExpression_2_0= ruleInitializeExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1556:1: (lv_rhs_assignExpression_2_0= ruleInitializeExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1556:1: (lv_rhs_assignExpression_2_0= ruleInitializeExpression )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1557:3: lv_rhs_assignExpression_2_0= ruleInitializeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getRhs_assignExpressionInitializeExpressionParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInitializeExpression_in_ruleAssignment3443);
                    lv_rhs_assignExpression_2_0=ruleInitializeExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	        }
                           		set(
                           			current, 
                           			"rhs_assignExpression",
                            		lv_rhs_assignExpression_2_0, 
                            		"InitializeExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1574:6: ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1574:6: ( (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1575:1: (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1575:1: (lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1576:3: lv_incrementDecrementOperator_3_0= ruleUnaryPostIncrementDecrementOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorUnaryPostIncrementDecrementOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryPostIncrementDecrementOperator_in_ruleAssignment3471);
                    lv_incrementDecrementOperator_3_0=ruleUnaryPostIncrementDecrementOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	        }
                           		set(
                           			current, 
                           			"incrementDecrementOperator",
                            		lv_incrementDecrementOperator_3_0, 
                            		"UnaryPostIncrementDecrementOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAssignment3484); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1604:1: entryRuleInitializeExpression returns [EObject current=null] : iv_ruleInitializeExpression= ruleInitializeExpression EOF ;
    public final EObject entryRuleInitializeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitializeExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1605:2: (iv_ruleInitializeExpression= ruleInitializeExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1606:2: iv_ruleInitializeExpression= ruleInitializeExpression EOF
            {
             newCompositeNode(grammarAccess.getInitializeExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitializeExpression_in_entryRuleInitializeExpression3520);
            iv_ruleInitializeExpression=ruleInitializeExpression();

            state._fsp--;

             current =iv_ruleInitializeExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitializeExpression3530); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1613:1: ruleInitializeExpression returns [EObject current=null] : (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression ) ;
    public final EObject ruleInitializeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArrayInitializeExpression_0 = null;

        EObject this_NondeterministicChoiceExpression_1 = null;

        EObject this_Expression_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1616:28: ( (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1617:1: (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1617:1: (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression )
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1618:5: this_ArrayInitializeExpression_0= ruleArrayInitializeExpression
                    {
                     
                            newCompositeNode(grammarAccess.getInitializeExpressionAccess().getArrayInitializeExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleArrayInitializeExpression_in_ruleInitializeExpression3577);
                    this_ArrayInitializeExpression_0=ruleArrayInitializeExpression();

                    state._fsp--;

                     
                            current = this_ArrayInitializeExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1628:5: this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression
                    {
                     
                            newCompositeNode(grammarAccess.getInitializeExpressionAccess().getNondeterministicChoiceExpressionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNondeterministicChoiceExpression_in_ruleInitializeExpression3604);
                    this_NondeterministicChoiceExpression_1=ruleNondeterministicChoiceExpression();

                    state._fsp--;

                     
                            current = this_NondeterministicChoiceExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1638:5: this_Expression_2= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getInitializeExpressionAccess().getExpressionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleInitializeExpression3631);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1654:1: entryRuleArrayInitializeExpression returns [EObject current=null] : iv_ruleArrayInitializeExpression= ruleArrayInitializeExpression EOF ;
    public final EObject entryRuleArrayInitializeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayInitializeExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1655:2: (iv_ruleArrayInitializeExpression= ruleArrayInitializeExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1656:2: iv_ruleArrayInitializeExpression= ruleArrayInitializeExpression EOF
            {
             newCompositeNode(grammarAccess.getArrayInitializeExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArrayInitializeExpression_in_entryRuleArrayInitializeExpression3666);
            iv_ruleArrayInitializeExpression=ruleArrayInitializeExpression();

            state._fsp--;

             current =iv_ruleArrayInitializeExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArrayInitializeExpression3676); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1663:1: ruleArrayInitializeExpression returns [EObject current=null] : (otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayInitializeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1666:28: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1667:1: (otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1667:1: (otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1667:3: otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleArrayInitializeExpression3713); 

                	newLeafNode(otherlv_0, grammarAccess.getArrayInitializeExpressionAccess().getLeftSquareBracketKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1671:1: ( (lv_expressions_1_0= ruleInitializeExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1672:1: (lv_expressions_1_0= ruleInitializeExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1672:1: (lv_expressions_1_0= ruleInitializeExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1673:3: lv_expressions_1_0= ruleInitializeExpression
            {
             
            	        newCompositeNode(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsInitializeExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInitializeExpression_in_ruleArrayInitializeExpression3734);
            lv_expressions_1_0=ruleInitializeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArrayInitializeExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"expressions",
                    		lv_expressions_1_0, 
                    		"InitializeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1689:2: (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1689:4: otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArrayInitializeExpression3747); 

            	        	newLeafNode(otherlv_2, grammarAccess.getArrayInitializeExpressionAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1693:1: ( (lv_expressions_3_0= ruleInitializeExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1694:1: (lv_expressions_3_0= ruleInitializeExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1694:1: (lv_expressions_3_0= ruleInitializeExpression )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1695:3: lv_expressions_3_0= ruleInitializeExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsInitializeExpressionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleInitializeExpression_in_ruleArrayInitializeExpression3768);
            	    lv_expressions_3_0=ruleInitializeExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArrayInitializeExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_3_0, 
            	            		"InitializeExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleArrayInitializeExpression3782); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1723:1: entryRuleLocalVariableOrConstantDeclarationStatement returns [EObject current=null] : iv_ruleLocalVariableOrConstantDeclarationStatement= ruleLocalVariableOrConstantDeclarationStatement EOF ;
    public final EObject entryRuleLocalVariableOrConstantDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariableOrConstantDeclarationStatement = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1724:2: (iv_ruleLocalVariableOrConstantDeclarationStatement= ruleLocalVariableOrConstantDeclarationStatement EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1725:2: iv_ruleLocalVariableOrConstantDeclarationStatement= ruleLocalVariableOrConstantDeclarationStatement EOF
            {
             newCompositeNode(grammarAccess.getLocalVariableOrConstantDeclarationStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalVariableOrConstantDeclarationStatement_in_entryRuleLocalVariableOrConstantDeclarationStatement3818);
            iv_ruleLocalVariableOrConstantDeclarationStatement=ruleLocalVariableOrConstantDeclarationStatement();

            state._fsp--;

             current =iv_ruleLocalVariableOrConstantDeclarationStatement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalVariableOrConstantDeclarationStatement3828); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1732:1: ruleLocalVariableOrConstantDeclarationStatement returns [EObject current=null] : ( ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) ) ) ;
    public final EObject ruleLocalVariableOrConstantDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_0_1 = null;

        EObject lv_variable_0_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1735:28: ( ( ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1736:1: ( ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1736:1: ( ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1737:1: ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1737:1: ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1738:1: (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1738:1: (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==40) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1739:3: lv_variable_0_1= ruleLocalVariableDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableLocalVariableDeclarationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLocalVariableDeclaration_in_ruleLocalVariableOrConstantDeclarationStatement3875);
                    lv_variable_0_1=ruleLocalVariableDeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalVariableOrConstantDeclarationStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_0_1, 
                            		"LocalVariableDeclaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1754:8: lv_variable_0_2= ruleLocalConstantDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableLocalConstantDeclarationParserRuleCall_0_1()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLocalConstantDeclaration_in_ruleLocalVariableOrConstantDeclarationStatement3894);
                    lv_variable_0_2=ruleLocalConstantDeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalVariableOrConstantDeclarationStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_0_2, 
                            		"LocalConstantDeclaration");
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1780:1: entryRuleLocalVariableDeclaration returns [EObject current=null] : iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF ;
    public final EObject entryRuleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariableDeclaration = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1781:2: (iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1782:2: iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getLocalVariableDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalVariableDeclaration_in_entryRuleLocalVariableDeclaration3932);
            iv_ruleLocalVariableDeclaration=ruleLocalVariableDeclaration();

            state._fsp--;

             current =iv_ruleLocalVariableDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalVariableDeclaration3942); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1789:1: ruleLocalVariableDeclaration returns [EObject current=null] : ( ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_initializeExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1792:28: ( ( ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1793:1: ( ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1793:1: ( ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1793:2: ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';'
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1793:2: ( ( ruleDATATYPE ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1794:1: ( ruleDATATYPE )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1794:1: ( ruleDATATYPE )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1795:3: ruleDATATYPE
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalVariableDeclarationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeDataTypeCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDATATYPE_in_ruleLocalVariableDeclaration3990);
            ruleDATATYPE();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1808:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1809:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1809:1: (lv_name_1_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1810:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLocalVariableDeclaration4007); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLocalVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalVariableDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1826:2: (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1826:4: otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) )
                    {
                    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleLocalVariableDeclaration4025); 

                        	newLeafNode(otherlv_2, grammarAccess.getLocalVariableDeclarationAccess().getColonEqualsSignKeyword_2_0());
                        
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1830:1: ( (lv_initializeExpression_3_0= ruleInitializeExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1831:1: (lv_initializeExpression_3_0= ruleInitializeExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1831:1: (lv_initializeExpression_3_0= ruleInitializeExpression )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1832:3: lv_initializeExpression_3_0= ruleInitializeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalVariableDeclarationAccess().getInitializeExpressionInitializeExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInitializeExpression_in_ruleLocalVariableDeclaration4046);
                    lv_initializeExpression_3_0=ruleInitializeExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalVariableDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"initializeExpression",
                            		lv_initializeExpression_3_0, 
                            		"InitializeExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLocalVariableDeclaration4060); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1860:1: entryRuleLocalConstantDeclaration returns [EObject current=null] : iv_ruleLocalConstantDeclaration= ruleLocalConstantDeclaration EOF ;
    public final EObject entryRuleLocalConstantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalConstantDeclaration = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1861:2: (iv_ruleLocalConstantDeclaration= ruleLocalConstantDeclaration EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1862:2: iv_ruleLocalConstantDeclaration= ruleLocalConstantDeclaration EOF
            {
             newCompositeNode(grammarAccess.getLocalConstantDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalConstantDeclaration_in_entryRuleLocalConstantDeclaration4096);
            iv_ruleLocalConstantDeclaration=ruleLocalConstantDeclaration();

            state._fsp--;

             current =iv_ruleLocalConstantDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalConstantDeclaration4106); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1869:1: ruleLocalConstantDeclaration returns [EObject current=null] : ( ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleLocalConstantDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_initializeExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1872:28: ( ( ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1873:1: ( ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1873:1: ( ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1873:2: ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';'
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1873:2: ( (lv_constant_0_0= 'const' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1874:1: (lv_constant_0_0= 'const' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1874:1: (lv_constant_0_0= 'const' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1875:3: lv_constant_0_0= 'const'
            {
            lv_constant_0_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleLocalConstantDeclaration4149); 

                    newLeafNode(lv_constant_0_0, grammarAccess.getLocalConstantDeclarationAccess().getConstantConstKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalConstantDeclarationRule());
            	        }
                   		setWithLastConsumed(current, "constant", true, "const");
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1888:2: ( ( ruleDATATYPE ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1889:1: ( ruleDATATYPE )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1889:1: ( ruleDATATYPE )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1890:3: ruleDATATYPE
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalConstantDeclarationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeDataTypeCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDATATYPE_in_ruleLocalConstantDeclaration4185);
            ruleDATATYPE();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1903:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1904:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1904:1: (lv_name_2_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1905:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLocalConstantDeclaration4202); 

            			newLeafNode(lv_name_2_0, grammarAccess.getLocalConstantDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalConstantDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleLocalConstantDeclaration4219); 

                	newLeafNode(otherlv_3, grammarAccess.getLocalConstantDeclarationAccess().getColonEqualsSignKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1925:1: ( (lv_initializeExpression_4_0= ruleInitializeExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1926:1: (lv_initializeExpression_4_0= ruleInitializeExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1926:1: (lv_initializeExpression_4_0= ruleInitializeExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1927:3: lv_initializeExpression_4_0= ruleInitializeExpression
            {
             
            	        newCompositeNode(grammarAccess.getLocalConstantDeclarationAccess().getInitializeExpressionInitializeExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInitializeExpression_in_ruleLocalConstantDeclaration4240);
            lv_initializeExpression_4_0=ruleInitializeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocalConstantDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"initializeExpression",
                    		lv_initializeExpression_4_0, 
                    		"InitializeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLocalConstantDeclaration4252); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1955:1: entryRuleNondeterministicChoiceExpression returns [EObject current=null] : iv_ruleNondeterministicChoiceExpression= ruleNondeterministicChoiceExpression EOF ;
    public final EObject entryRuleNondeterministicChoiceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNondeterministicChoiceExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1956:2: (iv_ruleNondeterministicChoiceExpression= ruleNondeterministicChoiceExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1957:2: iv_ruleNondeterministicChoiceExpression= ruleNondeterministicChoiceExpression EOF
            {
             newCompositeNode(grammarAccess.getNondeterministicChoiceExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNondeterministicChoiceExpression_in_entryRuleNondeterministicChoiceExpression4288);
            iv_ruleNondeterministicChoiceExpression=ruleNondeterministicChoiceExpression();

            state._fsp--;

             current =iv_ruleNondeterministicChoiceExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNondeterministicChoiceExpression4298); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1964:1: ruleNondeterministicChoiceExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) ) ) ;
    public final EObject ruleNondeterministicChoiceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_range_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1967:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1968:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1968:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1968:2: ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1968:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1969:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1969:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1970:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNondeterministicChoiceExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNondeterministicChoiceExpression4343); 

            		newLeafNode(otherlv_0, grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypePrimitiveDataTypeCrossReference_0_0()); 
            	

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1981:2: ( (lv_range_1_0= ruleRange ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1982:1: (lv_range_1_0= ruleRange )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1982:1: (lv_range_1_0= ruleRange )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1983:3: lv_range_1_0= ruleRange
            {
             
            	        newCompositeNode(grammarAccess.getNondeterministicChoiceExpressionAccess().getRangeRangeParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleRange_in_ruleNondeterministicChoiceExpression4364);
            lv_range_1_0=ruleRange();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNondeterministicChoiceExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_1_0, 
                    		"Range");
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2007:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2008:2: (iv_ruleRange= ruleRange EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2009:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRange_in_entryRuleRange4400);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRange4410); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2016:1: ruleRange returns [EObject current=null] : (otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lowerBound_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2019:28: ( (otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2020:1: (otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2020:1: (otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2020:3: otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleRange4447); 

                	newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLessThanSignKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2024:1: ( (lv_lowerBound_1_0= ruleLONG ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2025:1: (lv_lowerBound_1_0= ruleLONG )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2025:1: (lv_lowerBound_1_0= ruleLONG )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2026:3: lv_lowerBound_1_0= ruleLONG
            {
             
            	        newCompositeNode(grammarAccess.getRangeAccess().getLowerBoundLONGParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLONG_in_ruleRange4468);
            lv_lowerBound_1_0=ruleLONG();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRangeRule());
            	        }
                   		set(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_1_0, 
                    		"LONG");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRange4480); 

                	newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getCommaKeyword_2());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2046:1: ( (lv_upperBound_3_0= ruleLONG ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2047:1: (lv_upperBound_3_0= ruleLONG )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2047:1: (lv_upperBound_3_0= ruleLONG )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2048:3: lv_upperBound_3_0= ruleLONG
            {
             
            	        newCompositeNode(grammarAccess.getRangeAccess().getUpperBoundLONGParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLONG_in_ruleRange4501);
            lv_upperBound_3_0=ruleLONG();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRangeRule());
            	        }
                   		set(
                   			current, 
                   			"upperBound",
                    		lv_upperBound_3_0, 
                    		"LONG");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleRange4513); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2076:1: entryRuleLONG returns [String current=null] : iv_ruleLONG= ruleLONG EOF ;
    public final String entryRuleLONG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLONG = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2077:2: (iv_ruleLONG= ruleLONG EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2078:2: iv_ruleLONG= ruleLONG EOF
            {
             newCompositeNode(grammarAccess.getLONGRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLONG_in_entryRuleLONG4550);
            iv_ruleLONG=ruleLONG();

            state._fsp--;

             current =iv_ruleLONG.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLONG4561); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2085:1: ruleLONG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLONG() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2088:28: (this_INT_0= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2089:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLONG4600); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2104:1: entryRuleLogicalExpression returns [EObject current=null] : iv_ruleLogicalExpression= ruleLogicalExpression EOF ;
    public final EObject entryRuleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2105:2: (iv_ruleLogicalExpression= ruleLogicalExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2106:2: iv_ruleLogicalExpression= ruleLogicalExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalExpression_in_entryRuleLogicalExpression4644);
            iv_ruleLogicalExpression=ruleLogicalExpression();

            state._fsp--;

             current =iv_ruleLogicalExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalExpression4654); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2113:1: ruleLogicalExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2116:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2118:5: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
             
                    newCompositeNode(grammarAccess.getLogicalExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleLogicalExpression4700);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2134:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2135:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2136:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression4734);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;

             current =iv_ruleLogicalOrExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalOrExpression4744); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2143:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2146:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2147:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2147:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2148:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression4791);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;

             
                    current = this_LogicalAndExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2156:1: ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==48) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2156:2: () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2156:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2157:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLogicalOrExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2162:2: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2163:1: (lv_operator_2_0= ruleLogicalOrOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2163:1: (lv_operator_2_0= ruleLogicalOrOperator )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2164:3: lv_operator_2_0= ruleLogicalOrOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression4821);
            	    lv_operator_2_0=ruleLogicalOrOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"LogicalOrOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2180:2: ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2181:1: (lv_rightExpression_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2181:1: (lv_rightExpression_3_0= ruleLogicalAndExpression )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2182:3: lv_rightExpression_3_0= ruleLogicalAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionLogicalAndExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression4842);
            	    lv_rightExpression_3_0=ruleLogicalAndExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightExpression",
            	            		lv_rightExpression_3_0, 
            	            		"LogicalAndExpression");
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2206:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2207:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2208:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression4880);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;

             current =iv_ruleLogicalAndExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalAndExpression4890); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2215:1: ruleLogicalAndExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2218:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2219:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2219:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2220:5: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleLogicalAndExpression4937);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;

             
                    current = this_ComparisonExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2228:1: ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==49) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2228:2: () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2228:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2229:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLogicalAndExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2234:2: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2235:1: (lv_operator_2_0= ruleLogicalAndOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2235:1: (lv_operator_2_0= ruleLogicalAndOperator )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2236:3: lv_operator_2_0= ruleLogicalAndOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression4967);
            	    lv_operator_2_0=ruleLogicalAndOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"LogicalAndOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2252:2: ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2253:1: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2253:1: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2254:3: lv_rightExpression_3_0= ruleComparisonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionComparisonExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleLogicalAndExpression4988);
            	    lv_rightExpression_3_0=ruleComparisonExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightExpression",
            	            		lv_rightExpression_3_0, 
            	            		"ComparisonExpression");
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2278:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2279:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2280:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression5026);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression5036); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2287:1: ruleComparisonExpression returns [EObject current=null] : (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonHigherOpExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2290:28: ( (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2291:1: (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2291:1: (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2292:5: this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getComparisonExpressionAccess().getComparisonHigherOpExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparisonHigherOpExpression_in_ruleComparisonExpression5083);
            this_ComparisonHigherOpExpression_0=ruleComparisonHigherOpExpression();

            state._fsp--;

             
                    current = this_ComparisonHigherOpExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2300:1: ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=50 && LA25_0<=51)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2300:2: () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2300:2: ()
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2301:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2306:2: ( (lv_operator_2_0= ruleComparingEQNEQOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2307:1: (lv_operator_2_0= ruleComparingEQNEQOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2307:1: (lv_operator_2_0= ruleComparingEQNEQOperator )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2308:3: lv_operator_2_0= ruleComparingEQNEQOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparingEQNEQOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComparingEQNEQOperator_in_ruleComparisonExpression5113);
                    lv_operator_2_0=ruleComparingEQNEQOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_2_0, 
                            		"ComparingEQNEQOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2324:2: ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2325:1: (lv_rightExpression_3_0= ruleComparisonHigherOpExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2325:1: (lv_rightExpression_3_0= ruleComparisonHigherOpExpression )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2326:3: lv_rightExpression_3_0= ruleComparisonHigherOpExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightExpressionComparisonHigherOpExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComparisonHigherOpExpression_in_ruleComparisonExpression5134);
                    lv_rightExpression_3_0=ruleComparisonHigherOpExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rightExpression",
                            		lv_rightExpression_3_0, 
                            		"ComparisonHigherOpExpression");
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2350:1: entryRuleComparisonHigherOpExpression returns [EObject current=null] : iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF ;
    public final EObject entryRuleComparisonHigherOpExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonHigherOpExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2351:2: (iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2352:2: iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonHigherOpExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonHigherOpExpression_in_entryRuleComparisonHigherOpExpression5172);
            iv_ruleComparisonHigherOpExpression=ruleComparisonHigherOpExpression();

            state._fsp--;

             current =iv_ruleComparisonHigherOpExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonHigherOpExpression5182); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2359:1: ruleComparisonHigherOpExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? ) ;
    public final EObject ruleComparisonHigherOpExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2362:28: ( (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2363:1: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2363:1: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2364:5: this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_ruleComparisonHigherOpExpression5229);
            this_ArithmeticExpression_0=ruleArithmeticExpression();

            state._fsp--;

             
                    current = this_ArithmeticExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2372:1: ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=41 && LA26_0<=42)||(LA26_0>=52 && LA26_0<=53)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2372:2: () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2372:2: ()
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2373:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonHigherOpExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2378:2: ( (lv_operator_2_0= ruleComparingRelOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2379:1: (lv_operator_2_0= ruleComparingRelOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2379:1: (lv_operator_2_0= ruleComparingRelOperator )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2380:3: lv_operator_2_0= ruleComparingRelOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorComparingRelOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComparingRelOperator_in_ruleComparisonHigherOpExpression5259);
                    lv_operator_2_0=ruleComparingRelOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonHigherOpExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_2_0, 
                            		"ComparingRelOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2396:2: ( (lv_rightExpression_3_0= ruleArithmeticExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2397:1: (lv_rightExpression_3_0= ruleArithmeticExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2397:1: (lv_rightExpression_3_0= ruleArithmeticExpression )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2398:3: lv_rightExpression_3_0= ruleArithmeticExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionArithmeticExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_ruleComparisonHigherOpExpression5280);
                    lv_rightExpression_3_0=ruleArithmeticExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonHigherOpExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rightExpression",
                            		lv_rightExpression_3_0, 
                            		"ArithmeticExpression");
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2422:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2423:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2424:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
             newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression5318);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;

             current =iv_ruleArithmeticExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArithmeticExpression5328); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2431:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditionExpression_0= ruleAdditionExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2434:28: (this_AdditionExpression_0= ruleAdditionExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2436:5: this_AdditionExpression_0= ruleAdditionExpression
            {
             
                    newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditionExpressionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAdditionExpression_in_ruleArithmeticExpression5374);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2452:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2453:2: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2454:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditionExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression5408);
            iv_ruleAdditionExpression=ruleAdditionExpression();

            state._fsp--;

             current =iv_ruleAdditionExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditionExpression5418); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2461:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2464:28: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2465:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2465:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2466:5: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression5465);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;

             
                    current = this_MultiplicationExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2474:1: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=54 && LA27_0<=55)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2474:2: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2474:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2475:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2480:2: ( (lv_operator_2_0= ruleAdditionOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2481:1: (lv_operator_2_0= ruleAdditionOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2481:1: (lv_operator_2_0= ruleAdditionOperator )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2482:3: lv_operator_2_0= ruleAdditionOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression5495);
            	    lv_operator_2_0=ruleAdditionOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"AdditionOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2498:2: ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2499:1: (lv_rightExpression_3_0= ruleMultiplicationExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2499:1: (lv_rightExpression_3_0= ruleMultiplicationExpression )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2500:3: lv_rightExpression_3_0= ruleMultiplicationExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightExpressionMultiplicationExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression5516);
            	    lv_rightExpression_3_0=ruleMultiplicationExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightExpression",
            	            		lv_rightExpression_3_0, 
            	            		"MultiplicationExpression");
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2524:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2525:2: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2526:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression5554);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;

             current =iv_ruleMultiplicationExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicationExpression5564); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2533:1: ruleMultiplicationExpression returns [EObject current=null] : (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) ) )* ) ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryPreExpression_0 = null;

        EObject this_Operand_1 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_rightExpression_4_1 = null;

        EObject lv_rightExpression_4_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2536:28: ( (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) ) )* ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2537:1: (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) ) )* ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2537:1: (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) ) )* ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==55||LA30_0==58) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_BOOLEAN)||LA30_0==24||LA30_0==43||(LA30_0>=59 && LA30_0<=63)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2538:5: this_UnaryPreExpression_0= ruleUnaryPreExpression
                    {
                     
                            newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getUnaryPreExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryPreExpression_in_ruleMultiplicationExpression5611);
                    this_UnaryPreExpression_0=ruleUnaryPreExpression();

                    state._fsp--;

                     
                            current = this_UnaryPreExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2547:6: (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) ) )* )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2547:6: (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) ) )* )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2548:5: this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) ) )*
                    {
                     
                            newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperandParserRuleCall_1_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOperand_in_ruleMultiplicationExpression5639);
                    this_Operand_1=ruleOperand();

                    state._fsp--;

                     
                            current = this_Operand_1; 
                            afterParserOrEnumRuleCall();
                        
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2556:1: ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=56 && LA29_0<=57)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2556:2: () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2556:2: ()
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2557:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_1_0(),
                    	                current);
                    	        

                    	    }

                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2562:2: ( (lv_operator_3_0= ruleMultiplicationOperator ) )
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2563:1: (lv_operator_3_0= ruleMultiplicationOperator )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2563:1: (lv_operator_3_0= ruleMultiplicationOperator )
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2564:3: lv_operator_3_0= ruleMultiplicationOperator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression5669);
                    	    lv_operator_3_0=ruleMultiplicationOperator();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"operator",
                    	            		lv_operator_3_0, 
                    	            		"MultiplicationOperator");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2580:2: ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) )
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2581:1: ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2581:1: ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) )
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2582:1: (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2582:1: (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand )
                    	    int alt28=2;
                    	    int LA28_0 = input.LA(1);

                    	    if ( (LA28_0==55||LA28_0==58) ) {
                    	        alt28=1;
                    	    }
                    	    else if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_BOOLEAN)||LA28_0==24||LA28_0==43||(LA28_0>=59 && LA28_0<=63)) ) {
                    	        alt28=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 28, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt28) {
                    	        case 1 :
                    	            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2583:3: lv_rightExpression_4_1= ruleUnaryPreExpression
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionUnaryPreExpressionParserRuleCall_1_1_2_0_0()); 
                    	            	    
                    	            pushFollow(FollowSets000.FOLLOW_ruleUnaryPreExpression_in_ruleMultiplicationExpression5692);
                    	            lv_rightExpression_4_1=ruleUnaryPreExpression();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"rightExpression",
                    	                    		lv_rightExpression_4_1, 
                    	                    		"UnaryPreExpression");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2598:8: lv_rightExpression_4_2= ruleOperand
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionOperandParserRuleCall_1_1_2_0_1()); 
                    	            	    
                    	            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_ruleMultiplicationExpression5711);
                    	            lv_rightExpression_4_2=ruleOperand();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"rightExpression",
                    	                    		lv_rightExpression_4_2, 
                    	                    		"Operand");
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2624:1: entryRuleUnaryPreExpression returns [EObject current=null] : iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF ;
    public final EObject entryRuleUnaryPreExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryPreExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2625:2: (iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2626:2: iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryPreExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryPreExpression_in_entryRuleUnaryPreExpression5753);
            iv_ruleUnaryPreExpression=ruleUnaryPreExpression();

            state._fsp--;

             current =iv_ruleUnaryPreExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryPreExpression5763); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2633:1: ruleUnaryPreExpression returns [EObject current=null] : ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) ;
    public final EObject ruleUnaryPreExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_enclosedExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2636:28: ( ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2637:1: ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2637:1: ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2637:2: () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2637:2: ()
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2638:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnaryPreExpressionAccess().getUnaryExpressionAction_0(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2643:2: ( (lv_operator_1_0= ruleUnaryPreOperator ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2644:1: (lv_operator_1_0= ruleUnaryPreOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2644:1: (lv_operator_1_0= ruleUnaryPreOperator )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2645:3: lv_operator_1_0= ruleUnaryPreOperator
            {
             
            	        newCompositeNode(grammarAccess.getUnaryPreExpressionAccess().getOperatorUnaryPreOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUnaryPreOperator_in_ruleUnaryPreExpression5818);
            lv_operator_1_0=ruleUnaryPreOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryPreExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_1_0, 
                    		"UnaryPreOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2661:2: ( (lv_enclosedExpression_2_0= ruleOperand ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2662:1: (lv_enclosedExpression_2_0= ruleOperand )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2662:1: (lv_enclosedExpression_2_0= ruleOperand )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2663:3: lv_enclosedExpression_2_0= ruleOperand
            {
             
            	        newCompositeNode(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionOperandParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_ruleUnaryPreExpression5839);
            lv_enclosedExpression_2_0=ruleOperand();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryPreExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"enclosedExpression",
                    		lv_enclosedExpression_2_0, 
                    		"Operand");
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


    // $ANTLR start "entryRuleOperand"
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2687:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2688:2: (iv_ruleOperand= ruleOperand EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2689:2: iv_ruleOperand= ruleOperand EOF
            {
             newCompositeNode(grammarAccess.getOperandRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_entryRuleOperand5875);
            iv_ruleOperand=ruleOperand();

            state._fsp--;

             current =iv_ruleOperand; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperand5885); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2696:1: ruleOperand returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression | this_OperationCall_5= ruleOperationCall | this_TriggerMessageExpression_6= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_7= ruleNoAttributeSelectorExpression ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_LiteralExpression_3 = null;

        EObject this_ExtendedTypedNamedElementExpression_4 = null;

        EObject this_OperationCall_5 = null;

        EObject this_TriggerMessageExpression_6 = null;

        EObject this_NoAttributeSelectorExpression_7 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2699:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression | this_OperationCall_5= ruleOperationCall | this_TriggerMessageExpression_6= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_7= ruleNoAttributeSelectorExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2700:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression | this_OperationCall_5= ruleOperationCall | this_TriggerMessageExpression_6= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_7= ruleNoAttributeSelectorExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2700:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression | this_OperationCall_5= ruleOperationCall | this_TriggerMessageExpression_6= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_7= ruleNoAttributeSelectorExpression )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt31=1;
                }
                break;
            case RULE_INT:
            case RULE_NUMBER:
            case RULE_BOOLEAN:
            case 43:
                {
                alt31=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case 15:
                case 16:
                case 21:
                case 25:
                case 30:
                case 33:
                case 38:
                case 39:
                case 41:
                case 42:
                case 44:
                case 45:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    {
                    alt31=3;
                    }
                    break;
                case 28:
                    {
                    int LA31_6 = input.LA(3);

                    if ( (LA31_6==RULE_ID) ) {
                        alt31=5;
                    }
                    else if ( ((LA31_6>=59 && LA31_6<=63)) ) {
                        alt31=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 24:
                    {
                    alt31=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 3, input);

                    throw nvae;
                }

                }
                break;
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt31=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2700:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2700:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2700:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleOperand5923); 

                        	newLeafNode(otherlv_0, grammarAccess.getOperandAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleOperand5945);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleOperand5956); 

                        	newLeafNode(otherlv_2, grammarAccess.getOperandAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2719:5: this_LiteralExpression_3= ruleLiteralExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getLiteralExpressionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_ruleOperand5985);
                    this_LiteralExpression_3=ruleLiteralExpression();

                    state._fsp--;

                     
                            current = this_LiteralExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2729:5: this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getExtendedTypedNamedElementExpressionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExtendedTypedNamedElementExpression_in_ruleOperand6012);
                    this_ExtendedTypedNamedElementExpression_4=ruleExtendedTypedNamedElementExpression();

                    state._fsp--;

                     
                            current = this_ExtendedTypedNamedElementExpression_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2739:5: this_OperationCall_5= ruleOperationCall
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getOperationCallParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOperationCall_in_ruleOperand6039);
                    this_OperationCall_5=ruleOperationCall();

                    state._fsp--;

                     
                            current = this_OperationCall_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2749:5: this_TriggerMessageExpression_6= ruleTriggerMessageExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getTriggerMessageExpressionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTriggerMessageExpression_in_ruleOperand6066);
                    this_TriggerMessageExpression_6=ruleTriggerMessageExpression();

                    state._fsp--;

                     
                            current = this_TriggerMessageExpression_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2759:5: this_NoAttributeSelectorExpression_7= ruleNoAttributeSelectorExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getNoAttributeSelectorExpressionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNoAttributeSelectorExpression_in_ruleOperand6093);
                    this_NoAttributeSelectorExpression_7=ruleNoAttributeSelectorExpression();

                    state._fsp--;

                     
                            current = this_NoAttributeSelectorExpression_7; 
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2775:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2776:2: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2777:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression6128);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralExpression6138); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2784:1: ruleLiteralExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2787:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2788:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2788:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2788:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2788:2: ()
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2789:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_0(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2794:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2795:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2795:1: (lv_value_1_0= ruleLiteral )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2796:3: lv_value_1_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getLiteralExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_ruleLiteralExpression6193);
            lv_value_1_0=ruleLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLiteralExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"Literal");
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2820:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2821:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2822:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral6230);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral6241); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2829:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | kw= 'null' ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUMBER_0=null;
        Token this_BOOLEAN_1=null;
        Token this_INT_2=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2832:28: ( (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | kw= 'null' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2833:1: (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | kw= 'null' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2833:1: (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | kw= 'null' )
            int alt32=4;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt32=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt32=2;
                }
                break;
            case RULE_INT:
                {
                alt32=3;
                }
                break;
            case 43:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2833:6: this_NUMBER_0= RULE_NUMBER
                    {
                    this_NUMBER_0=(Token)match(input,RULE_NUMBER,FollowSets000.FOLLOW_RULE_NUMBER_in_ruleLiteral6281); 

                    		current.merge(this_NUMBER_0);
                        
                     
                        newLeafNode(this_NUMBER_0, grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2841:10: this_BOOLEAN_1= RULE_BOOLEAN
                    {
                    this_BOOLEAN_1=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleLiteral6307); 

                    		current.merge(this_BOOLEAN_1);
                        
                     
                        newLeafNode(this_BOOLEAN_1, grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2849:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLiteral6333); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2858:2: kw= 'null'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleLiteral6357); 

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


    // $ANTLR start "entryRuleExtendedTypedNamedElementExpression"
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2871:1: entryRuleExtendedTypedNamedElementExpression returns [EObject current=null] : iv_ruleExtendedTypedNamedElementExpression= ruleExtendedTypedNamedElementExpression EOF ;
    public final EObject entryRuleExtendedTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedTypedNamedElementExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2872:2: (iv_ruleExtendedTypedNamedElementExpression= ruleExtendedTypedNamedElementExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2873:2: iv_ruleExtendedTypedNamedElementExpression= ruleExtendedTypedNamedElementExpression EOF
            {
             newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedTypedNamedElementExpression_in_entryRuleExtendedTypedNamedElementExpression6397);
            iv_ruleExtendedTypedNamedElementExpression=ruleExtendedTypedNamedElementExpression();

            state._fsp--;

             current =iv_ruleExtendedTypedNamedElementExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedTypedNamedElementExpression6407); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2880:1: ruleExtendedTypedNamedElementExpression returns [EObject current=null] : (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '.' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )? ) ;
    public final EObject ruleExtendedTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TypedNamedElementExpression_0 = null;

        EObject lv_position_3_0 = null;

        Enumerator lv_incrementDecrementOperator_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2883:28: ( (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '.' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2884:1: (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '.' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2884:1: (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '.' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2885:5: this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '.' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getTypedNamedElementExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTypedNamedElementExpression_in_ruleExtendedTypedNamedElementExpression6454);
            this_TypedNamedElementExpression_0=ruleTypedNamedElementExpression();

            state._fsp--;

             
                    current = this_TypedNamedElementExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2893:1: ( ( () otherlv_2= '.' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )?
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=44 && LA33_0<=45)) ) {
                alt33=2;
            }
            switch (alt33) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2893:2: ( () otherlv_2= '.' ( (lv_position_3_0= rulePositionSelectorExpression ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2893:2: ( () otherlv_2= '.' ( (lv_position_3_0= rulePositionSelectorExpression ) ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2893:3: () otherlv_2= '.' ( (lv_position_3_0= rulePositionSelectorExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2893:3: ()
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2894:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExtendedTypedNamedElementExpressionAccess().getDiscreteInteractionEndpointReferenceTypedNamedElementExpressionAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleExtendedTypedNamedElementExpression6476); 

                        	newLeafNode(otherlv_2, grammarAccess.getExtendedTypedNamedElementExpressionAccess().getFullStopKeyword_1_0_1());
                        
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2903:1: ( (lv_position_3_0= rulePositionSelectorExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2904:1: (lv_position_3_0= rulePositionSelectorExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2904:1: (lv_position_3_0= rulePositionSelectorExpression )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2905:3: lv_position_3_0= rulePositionSelectorExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositionSelectorExpression_in_ruleExtendedTypedNamedElementExpression6497);
                    lv_position_3_0=rulePositionSelectorExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtendedTypedNamedElementExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"position",
                            		lv_position_3_0, 
                            		"PositionSelectorExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2922:6: ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2922:6: ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2922:7: () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2922:7: ()
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2923:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExtendedTypedNamedElementExpressionAccess().getAssignmentLhs_typedNamedElementExpressionAction_1_1_0(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2928:2: ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2929:1: (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2929:1: (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2930:3: lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getIncrementDecrementOperatorIncrementDecrementOperatorExpressionEnumRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIncrementDecrementOperatorExpression_in_ruleExtendedTypedNamedElementExpression6535);
                    lv_incrementDecrementOperator_5_0=ruleIncrementDecrementOperatorExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtendedTypedNamedElementExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"incrementDecrementOperator",
                            		lv_incrementDecrementOperator_5_0, 
                            		"IncrementDecrementOperatorExpression");
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2954:1: entryRuleTypedNamedElementExpression returns [EObject current=null] : iv_ruleTypedNamedElementExpression= ruleTypedNamedElementExpression EOF ;
    public final EObject entryRuleTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedNamedElementExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2955:2: (iv_ruleTypedNamedElementExpression= ruleTypedNamedElementExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2956:2: iv_ruleTypedNamedElementExpression= ruleTypedNamedElementExpression EOF
            {
             newCompositeNode(grammarAccess.getTypedNamedElementExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedNamedElementExpression_in_entryRuleTypedNamedElementExpression6574);
            iv_ruleTypedNamedElementExpression=ruleTypedNamedElementExpression();

            state._fsp--;

             current =iv_ruleTypedNamedElementExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedNamedElementExpression6584); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2963:1: ruleTypedNamedElementExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleArithmeticExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2966:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleArithmeticExpression ) ) otherlv_3= ']' )* ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2967:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleArithmeticExpression ) ) otherlv_3= ']' )* )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2967:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleArithmeticExpression ) ) otherlv_3= ']' )* )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2967:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleArithmeticExpression ) ) otherlv_3= ']' )*
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2967:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2968:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2968:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2969:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypedNamedElementExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypedNamedElementExpression6629); 

            		newLeafNode(otherlv_0, grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementTypedNamedElementCrossReference_0_0()); 
            	

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2980:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleArithmeticExpression ) ) otherlv_3= ']' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==38) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2980:4: otherlv_1= '[' ( (lv_indices_2_0= ruleArithmeticExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleTypedNamedElementExpression6642); 

            	        	newLeafNode(otherlv_1, grammarAccess.getTypedNamedElementExpressionAccess().getLeftSquareBracketKeyword_1_0());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2984:1: ( (lv_indices_2_0= ruleArithmeticExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2985:1: (lv_indices_2_0= ruleArithmeticExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2985:1: (lv_indices_2_0= ruleArithmeticExpression )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2986:3: lv_indices_2_0= ruleArithmeticExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTypedNamedElementExpressionAccess().getIndicesArithmeticExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_ruleTypedNamedElementExpression6663);
            	    lv_indices_2_0=ruleArithmeticExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTypedNamedElementExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"indices",
            	            		lv_indices_2_0, 
            	            		"ArithmeticExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleTypedNamedElementExpression6675); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTypedNamedElementExpressionAccess().getRightSquareBracketKeyword_1_2());
            	        

            	    }
            	    break;

            	default :
            	    break loop34;
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


    // $ANTLR start "entryRuleNoAttributeSelectorExpression"
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3014:1: entryRuleNoAttributeSelectorExpression returns [EObject current=null] : iv_ruleNoAttributeSelectorExpression= ruleNoAttributeSelectorExpression EOF ;
    public final EObject entryRuleNoAttributeSelectorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoAttributeSelectorExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3015:2: (iv_ruleNoAttributeSelectorExpression= ruleNoAttributeSelectorExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3016:2: iv_ruleNoAttributeSelectorExpression= ruleNoAttributeSelectorExpression EOF
            {
             newCompositeNode(grammarAccess.getNoAttributeSelectorExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoAttributeSelectorExpression_in_entryRuleNoAttributeSelectorExpression6713);
            iv_ruleNoAttributeSelectorExpression=ruleNoAttributeSelectorExpression();

            state._fsp--;

             current =iv_ruleNoAttributeSelectorExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoAttributeSelectorExpression6723); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3023:1: ruleNoAttributeSelectorExpression returns [EObject current=null] : ( (lv_position_0_0= rulePositionSelectorExpression ) ) ;
    public final EObject ruleNoAttributeSelectorExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_position_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3026:28: ( ( (lv_position_0_0= rulePositionSelectorExpression ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3027:1: ( (lv_position_0_0= rulePositionSelectorExpression ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3027:1: ( (lv_position_0_0= rulePositionSelectorExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3028:1: (lv_position_0_0= rulePositionSelectorExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3028:1: (lv_position_0_0= rulePositionSelectorExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3029:3: lv_position_0_0= rulePositionSelectorExpression
            {
             
            	        newCompositeNode(grammarAccess.getNoAttributeSelectorExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePositionSelectorExpression_in_ruleNoAttributeSelectorExpression6768);
            lv_position_0_0=rulePositionSelectorExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNoAttributeSelectorExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"position",
                    		lv_position_0_0, 
                    		"PositionSelectorExpression");
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3053:1: entryRulePositionSelectorExpression returns [EObject current=null] : iv_rulePositionSelectorExpression= rulePositionSelectorExpression EOF ;
    public final EObject entryRulePositionSelectorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionSelectorExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3054:2: (iv_rulePositionSelectorExpression= rulePositionSelectorExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3055:2: iv_rulePositionSelectorExpression= rulePositionSelectorExpression EOF
            {
             newCompositeNode(grammarAccess.getPositionSelectorExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePositionSelectorExpression_in_entryRulePositionSelectorExpression6803);
            iv_rulePositionSelectorExpression=rulePositionSelectorExpression();

            state._fsp--;

             current =iv_rulePositionSelectorExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePositionSelectorExpression6813); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3062:1: rulePositionSelectorExpression returns [EObject current=null] : ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '.' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? ) ;
    public final EObject rulePositionSelectorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_kind_0_0 = null;

        EObject lv_successor_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3065:28: ( ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '.' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3066:1: ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '.' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3066:1: ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '.' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3066:2: ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '.' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )?
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3066:2: ( (lv_kind_0_0= rulePositionSelectorKind ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3067:1: (lv_kind_0_0= rulePositionSelectorKind )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3067:1: (lv_kind_0_0= rulePositionSelectorKind )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3068:3: lv_kind_0_0= rulePositionSelectorKind
            {
             
            	        newCompositeNode(grammarAccess.getPositionSelectorExpressionAccess().getKindPositionSelectorKindEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePositionSelectorKind_in_rulePositionSelectorExpression6859);
            lv_kind_0_0=rulePositionSelectorKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPositionSelectorExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"kind",
                    		lv_kind_0_0, 
                    		"PositionSelectorKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3084:2: (otherlv_1= '.' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3084:4: otherlv_1= '.' ( (lv_successor_2_0= rulePositionSelectorExpression ) )
                    {
                    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulePositionSelectorExpression6872); 

                        	newLeafNode(otherlv_1, grammarAccess.getPositionSelectorExpressionAccess().getFullStopKeyword_1_0());
                        
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3088:1: ( (lv_successor_2_0= rulePositionSelectorExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3089:1: (lv_successor_2_0= rulePositionSelectorExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3089:1: (lv_successor_2_0= rulePositionSelectorExpression )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3090:3: lv_successor_2_0= rulePositionSelectorExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPositionSelectorExpressionAccess().getSuccessorPositionSelectorExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositionSelectorExpression_in_rulePositionSelectorExpression6893);
                    lv_successor_2_0=rulePositionSelectorExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPositionSelectorExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"successor",
                            		lv_successor_2_0, 
                            		"PositionSelectorExpression");
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3114:1: entryRuleOperationCall returns [EObject current=null] : iv_ruleOperationCall= ruleOperationCall EOF ;
    public final EObject entryRuleOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCall = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3115:2: (iv_ruleOperationCall= ruleOperationCall EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3116:2: iv_ruleOperationCall= ruleOperationCall EOF
            {
             newCompositeNode(grammarAccess.getOperationCallRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperationCall_in_entryRuleOperationCall6931);
            iv_ruleOperationCall=ruleOperationCall();

            state._fsp--;

             current =iv_ruleOperationCall; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperationCall6941); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3123:1: ruleOperationCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3126:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3127:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3127:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3127:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')'
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3127:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3128:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3128:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3129:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOperationCall6986); 

            		newLeafNode(otherlv_0, grammarAccess.getOperationCallAccess().getOperationOperationCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleOperationCall6998); 

                	newLeafNode(otherlv_1, grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3144:1: ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3144:2: ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )*
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3144:2: ( (lv_parameterBinding_2_0= ruleParamaterBinding ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3145:1: (lv_parameterBinding_2_0= ruleParamaterBinding )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3145:1: (lv_parameterBinding_2_0= ruleParamaterBinding )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3146:3: lv_parameterBinding_2_0= ruleParamaterBinding
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParamaterBinding_in_ruleOperationCall7020);
                    lv_parameterBinding_2_0=ruleParamaterBinding();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperationCallRule());
                    	        }
                           		add(
                           			current, 
                           			"parameterBinding",
                            		lv_parameterBinding_2_0, 
                            		"ParamaterBinding");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3162:2: (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==15) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3162:4: otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOperationCall7033); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getOperationCallAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3166:1: ( (lv_parameterBinding_4_0= ruleParamaterBinding ) )
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3167:1: (lv_parameterBinding_4_0= ruleParamaterBinding )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3167:1: (lv_parameterBinding_4_0= ruleParamaterBinding )
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3168:3: lv_parameterBinding_4_0= ruleParamaterBinding
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParamaterBinding_in_ruleOperationCall7054);
                    	    lv_parameterBinding_4_0=ruleParamaterBinding();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOperationCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameterBinding",
                    	            		lv_parameterBinding_4_0, 
                    	            		"ParamaterBinding");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleOperationCall7070); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3196:1: entryRuleTriggerMessageExpression returns [EObject current=null] : iv_ruleTriggerMessageExpression= ruleTriggerMessageExpression EOF ;
    public final EObject entryRuleTriggerMessageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerMessageExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3197:2: (iv_ruleTriggerMessageExpression= ruleTriggerMessageExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3198:2: iv_ruleTriggerMessageExpression= ruleTriggerMessageExpression EOF
            {
             newCompositeNode(grammarAccess.getTriggerMessageExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTriggerMessageExpression_in_entryRuleTriggerMessageExpression7106);
            iv_ruleTriggerMessageExpression=ruleTriggerMessageExpression();

            state._fsp--;

             current =iv_ruleTriggerMessageExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTriggerMessageExpression7116); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3205:1: ruleTriggerMessageExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTriggerMessageExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3208:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3209:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3209:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3209:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3209:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3210:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3210:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3211:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTriggerMessageExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTriggerMessageExpression7161); 

            		newLeafNode(otherlv_0, grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeMessageTypeCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTriggerMessageExpression7173); 

                	newLeafNode(otherlv_1, grammarAccess.getTriggerMessageExpressionAccess().getFullStopKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3226:1: ( (otherlv_2= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3227:1: (otherlv_2= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3227:1: (otherlv_2= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3228:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTriggerMessageExpressionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTriggerMessageExpression7193); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3247:1: entryRuleDATATYPE returns [String current=null] : iv_ruleDATATYPE= ruleDATATYPE EOF ;
    public final String entryRuleDATATYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATATYPE = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3248:2: (iv_ruleDATATYPE= ruleDATATYPE EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3249:2: iv_ruleDATATYPE= ruleDATATYPE EOF
            {
             newCompositeNode(grammarAccess.getDATATYPERule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDATATYPE_in_entryRuleDATATYPE7230);
            iv_ruleDATATYPE=ruleDATATYPE();

            state._fsp--;

             current =iv_ruleDATATYPE.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDATATYPE7241); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3256:1: ruleDATATYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )* ) ;
    public final AntlrDatatypeRuleToken ruleDATATYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3259:28: ( (this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )* ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3260:1: (this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )* )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3260:1: (this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )* )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3260:6: this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDATATYPE7281); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getDATATYPEAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3267:1: (kw= '[' this_INT_2= RULE_INT kw= ']' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==38) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3268:2: kw= '[' this_INT_2= RULE_INT kw= ']'
            	    {
            	    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDATATYPE7300); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDATATYPEAccess().getLeftSquareBracketKeyword_1_0()); 
            	        
            	    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDATATYPE7315); 

            	    		current.merge(this_INT_2);
            	        
            	     
            	        newLeafNode(this_INT_2, grammarAccess.getDATATYPEAccess().getINTTerminalRuleCall_1_1()); 
            	        
            	    kw=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDATATYPE7333); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDATATYPEAccess().getRightSquareBracketKeyword_1_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3294:1: ruleUnaryPostIncrementDecrementOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleUnaryPostIncrementDecrementOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3296:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3297:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3297:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                alt39=1;
            }
            else if ( (LA39_0==45) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3297:2: (enumLiteral_0= '++' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3297:2: (enumLiteral_0= '++' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3297:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleUnaryPostIncrementDecrementOperator7389); 

                            current = grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3303:6: (enumLiteral_1= '--' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3303:6: (enumLiteral_1= '--' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3303:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleUnaryPostIncrementDecrementOperator7406); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3313:1: ruleIncrementDecrementOperatorExpression returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleIncrementDecrementOperatorExpression() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3315:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3316:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3316:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            else if ( (LA40_0==45) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3316:2: (enumLiteral_0= '++' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3316:2: (enumLiteral_0= '++' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3316:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleIncrementDecrementOperatorExpression7451); 

                            current = grammarAccess.getIncrementDecrementOperatorExpressionAccess().getINCREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getIncrementDecrementOperatorExpressionAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3322:6: (enumLiteral_1= '--' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3322:6: (enumLiteral_1= '--' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3322:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleIncrementDecrementOperatorExpression7468); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3332:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3334:28: ( ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3335:1: ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3335:1: ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt41=1;
                }
                break;
            case 46:
                {
                alt41=2;
                }
                break;
            case 47:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3335:2: (enumLiteral_0= ':=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3335:2: (enumLiteral_0= ':=' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3335:4: enumLiteral_0= ':='
                    {
                    enumLiteral_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAssignOperator7513); 

                            current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3341:6: (enumLiteral_1= '+=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3341:6: (enumLiteral_1= '+=' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3341:8: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAssignOperator7530); 

                            current = grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3347:6: (enumLiteral_2= '-=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3347:6: (enumLiteral_2= '-=' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3347:8: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAssignOperator7547); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3357:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3359:28: ( (enumLiteral_0= '||' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3360:1: (enumLiteral_0= '||' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3360:1: (enumLiteral_0= '||' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3360:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleLogicalOrOperator7591); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3370:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3372:28: ( (enumLiteral_0= '&&' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3373:1: (enumLiteral_0= '&&' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3373:1: (enumLiteral_0= '&&' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3373:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleLogicalAndOperator7634); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3383:1: ruleComparingEQNEQOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleComparingEQNEQOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3385:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3386:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3386:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50) ) {
                alt42=1;
            }
            else if ( (LA42_0==51) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3386:2: (enumLiteral_0= '==' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3386:2: (enumLiteral_0= '==' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3386:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleComparingEQNEQOperator7678); 

                            current = grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3392:6: (enumLiteral_1= '<>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3392:6: (enumLiteral_1= '<>' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3392:8: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleComparingEQNEQOperator7695); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3402:1: ruleComparingRelOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) ;
    public final Enumerator ruleComparingRelOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3404:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3405:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3405:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            int alt43=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt43=1;
                }
                break;
            case 52:
                {
                alt43=2;
                }
                break;
            case 53:
                {
                alt43=3;
                }
                break;
            case 42:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3405:2: (enumLiteral_0= '<' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3405:2: (enumLiteral_0= '<' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3405:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleComparingRelOperator7740); 

                            current = grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3411:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3411:6: (enumLiteral_1= '<=' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3411:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleComparingRelOperator7757); 

                            current = grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3417:6: (enumLiteral_2= '>=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3417:6: (enumLiteral_2= '>=' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3417:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleComparingRelOperator7774); 

                            current = grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3423:6: (enumLiteral_3= '>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3423:6: (enumLiteral_3= '>' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3423:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleComparingRelOperator7791); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3433:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3435:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3436:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3436:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==54) ) {
                alt44=1;
            }
            else if ( (LA44_0==55) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3436:2: (enumLiteral_0= '+' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3436:2: (enumLiteral_0= '+' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3436:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleAdditionOperator7836); 

                            current = grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3442:6: (enumLiteral_1= '-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3442:6: (enumLiteral_1= '-' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3442:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleAdditionOperator7853); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3452:1: ruleMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3454:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3455:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3455:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==56) ) {
                alt45=1;
            }
            else if ( (LA45_0==57) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3455:2: (enumLiteral_0= '*' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3455:2: (enumLiteral_0= '*' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3455:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleMultiplicationOperator7898); 

                            current = grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3461:6: (enumLiteral_1= '/' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3461:6: (enumLiteral_1= '/' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3461:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleMultiplicationOperator7915); 

                            current = grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                        

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3471:1: ruleUnaryPreOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleUnaryPreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3473:28: ( ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3474:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3474:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==58) ) {
                alt46=1;
            }
            else if ( (LA46_0==55) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3474:2: (enumLiteral_0= 'not' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3474:2: (enumLiteral_0= 'not' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3474:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleUnaryPreOperator7960); 

                            current = grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3480:6: (enumLiteral_1= '-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3480:6: (enumLiteral_1= '-' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3480:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleUnaryPreOperator7977); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3490:1: rulePositionSelectorKind returns [Enumerator current=null] : ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) ) ;
    public final Enumerator rulePositionSelectorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3492:28: ( ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3493:1: ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3493:1: ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) )
            int alt47=5;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt47=1;
                }
                break;
            case 60:
                {
                alt47=2;
                }
                break;
            case 61:
                {
                alt47=3;
                }
                break;
            case 62:
                {
                alt47=4;
                }
                break;
            case 63:
                {
                alt47=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3493:2: (enumLiteral_0= 'self' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3493:2: (enumLiteral_0= 'self' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3493:4: enumLiteral_0= 'self'
                    {
                    enumLiteral_0=(Token)match(input,59,FollowSets000.FOLLOW_59_in_rulePositionSelectorKind8022); 

                            current = grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3499:6: (enumLiteral_1= 'first' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3499:6: (enumLiteral_1= 'first' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3499:8: enumLiteral_1= 'first'
                    {
                    enumLiteral_1=(Token)match(input,60,FollowSets000.FOLLOW_60_in_rulePositionSelectorKind8039); 

                            current = grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3505:6: (enumLiteral_2= 'last' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3505:6: (enumLiteral_2= 'last' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3505:8: enumLiteral_2= 'last'
                    {
                    enumLiteral_2=(Token)match(input,61,FollowSets000.FOLLOW_61_in_rulePositionSelectorKind8056); 

                            current = grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3511:6: (enumLiteral_3= 'prev' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3511:6: (enumLiteral_3= 'prev' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3511:8: enumLiteral_3= 'prev'
                    {
                    enumLiteral_3=(Token)match(input,62,FollowSets000.FOLLOW_62_in_rulePositionSelectorKind8073); 

                            current = grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3517:6: (enumLiteral_4= 'next' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3517:6: (enumLiteral_4= 'next' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3517:8: enumLiteral_4= 'next'
                    {
                    enumLiteral_4=(Token)match(input,63,FollowSets000.FOLLOW_63_in_rulePositionSelectorKind8090); 

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
    static final String DFA10_eotS =
        "\16\uffff";
    static final String DFA10_eofS =
        "\16\uffff";
    static final String DFA10_minS =
        "\2\5\7\uffff\1\5\2\uffff\1\47\1\5";
    static final String DFA10_maxS =
        "\1\50\1\57\7\uffff\1\77\2\uffff\1\71\1\57";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\uffff\1\1\1\10\2\uffff";
    static final String DFA10_specialS =
        "\16\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\21\uffff\1\10\5\uffff\1\2\1\uffff\1\3\1\4\1\uffff\1\5\2\uffff\1\6\2\uffff\1\7",
            "\1\7\22\uffff\1\13\1\uffff\1\12\13\uffff\1\11\5\uffff\4\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\14\2\12\17\uffff\1\12\22\uffff\1\12\13\uffff\1\12\2\uffff\6\12",
            "",
            "",
            "\1\15\16\uffff\4\12",
            "\1\7\24\uffff\1\12\13\uffff\1\11\5\uffff\4\12"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "644:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableOrConstantDeclarationStatement_6= ruleLocalVariableOrConstantDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement | this_APICallExpression_8= ruleAPICallExpression )";
        }
    }
    static final String DFA19_eotS =
        "\12\uffff";
    static final String DFA19_eofS =
        "\2\uffff\1\3\2\uffff\1\3\2\uffff\1\11\1\uffff";
    static final String DFA19_minS =
        "\1\5\1\uffff\1\17\1\uffff\1\5\1\17\1\5\1\17\1\5\1\uffff";
    static final String DFA19_maxS =
        "\1\77\1\uffff\1\71\1\uffff\1\77\1\71\1\77\1\71\1\77\1\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\5\uffff\1\2";
    static final String DFA19_specialS =
        "\12\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\3\3\16\uffff\2\3\15\uffff\1\1\4\uffff\1\3\13\uffff\1\3\2\uffff\6\3",
            "",
            "\1\3\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\7\uffff\2\3\1\uffff\1\4\1\3\1\uffff\2\3\2\uffff\12\3",
            "",
            "\1\3\1\5\2\3\17\uffff\1\3\22\uffff\1\3\13\uffff\1\3\2\uffff\6\3",
            "\1\6\16\uffff\1\3\10\uffff\1\3\10\uffff\4\3\2\uffff\4\3",
            "\1\3\1\7\2\3\16\uffff\2\3\15\uffff\1\3\4\uffff\1\3\13\uffff\1\3\2\uffff\6\3",
            "\1\3\27\uffff\1\3\1\uffff\1\3\1\10\5\uffff\12\3",
            "\4\3\6\uffff\1\11\10\uffff\1\3\5\uffff\1\11\10\uffff\1\11\3\uffff\1\3\13\uffff\1\3\2\uffff\6\3",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1617:1: (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMappingRepository_in_entryRuleMappingRepository75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMappingRepository85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_ruleMappingRepository131 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleMappingRepository144 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMappingRepository165 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMappingRepository177 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_rulePortApiMapping_in_ruleMappingRepository199 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleMappingRepository212 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rulePortApiMapping_in_ruleMappingRepository233 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleMappingRepository249 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleMappingRepository262 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMappingRepository283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_entryRuleImport321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImport331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleImport368 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleImport385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePortApiMapping_in_entryRulePortApiMapping426 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePortApiMapping436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rulePortApiMapping473 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEString_in_rulePortApiMapping496 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePortApiMapping508 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_rulePortApiMapping520 = new BitSet(new long[]{0xFC800840018041E0L});
        public static final BitSet FOLLOW_ruleEntry_in_rulePortApiMapping541 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_21_in_rulePortApiMapping554 = new BitSet(new long[]{0xFC800840018041E0L});
        public static final BitSet FOLLOW_ruleEntry_in_rulePortApiMapping575 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePortApiMapping589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression625 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAPICallExpression_in_ruleExpression682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalExpression_in_ruleExpression709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationValueExpression_in_entryRuleEnumerationValueExpression744 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationValueExpression754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleEnumerationValueExpression791 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationValueExpression811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAPICallExpression_in_entryRuleAPICallExpression847 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAPICallExpression857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleAPICallExpression894 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAPICallExpression914 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleAPICallExpression926 = new BitSet(new long[]{0x0000000002000020L});
        public static final BitSet FOLLOW_ruleParamaterBinding_in_ruleAPICallExpression948 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_15_in_ruleAPICallExpression961 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleParamaterBinding_in_ruleAPICallExpression982 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleAPICallExpression998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParamaterBinding_in_entryRuleParamaterBinding1034 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParamaterBinding1044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParamaterBinding1098 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleParamaterBinding1110 = new BitSet(new long[]{0xFC80080009C001E0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleParamaterBinding1133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationValueExpression_in_ruleParamaterBinding1152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContiniousPortExpressions_in_ruleParamaterBinding1171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContiniousPortExpressions_in_entryRuleContiniousPortExpressions1210 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContiniousPortExpressions1220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleContiniousPortExpressions1257 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleContiniousPortExpressions1277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionStartRule_in_entryRuleExpressionStartRule1313 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionStartRule1323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleExpressionStartRule1370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoop_in_ruleExpressionStartRule1397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhileLoop_in_ruleExpressionStartRule1424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoWhileLoop_in_ruleExpressionStartRule1451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfStatement_in_ruleExpressionStartRule1478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReturnStatement_in_ruleExpressionStartRule1505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalVariableOrConstantDeclarationStatement_in_ruleExpressionStartRule1532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationCallStatement_in_ruleExpressionStartRule1559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAPICallExpression_in_ruleExpressionStartRule1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEString1706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1752 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1803 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleQualifiedName1822 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1837 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry1884 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntry1894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleEntry1941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEntry1968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayInitializeExpression_in_ruleEntry1995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock2036 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBlock2046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleBlock2096 = new BitSet(new long[]{0x00000125A0810020L});
        public static final BitSet FOLLOW_ruleExpressionStartRule_in_ruleBlock2117 = new BitSet(new long[]{0x00000125A0810020L});
        public static final BitSet FOLLOW_16_in_ruleBlock2130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoop_in_entryRuleForLoop2170 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForLoop2180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleForLoop2217 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleForLoop2229 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleForLoop2250 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleForLoop2271 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleForLoop2283 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleForLoopCountingExpression_in_ruleForLoop2304 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleForLoop2316 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleForLoop2337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoopCountingExpression_in_entryRuleForLoopCountingExpression2373 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForLoopCountingExpression2383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedNamedElementExpression_in_ruleForLoopCountingExpression2429 = new BitSet(new long[]{0x0000F00004000000L});
        public static final BitSet FOLLOW_ruleUnaryPostIncrementDecrementOperator_in_ruleForLoopCountingExpression2451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignOperator_in_ruleForLoopCountingExpression2479 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleForLoopCountingExpression2500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhileLoop_in_entryRuleWhileLoop2538 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWhileLoop2548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleWhileLoop2585 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleWhileLoop2597 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleWhileLoop2618 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleWhileLoop2630 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleWhileLoop2651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoWhileLoop_in_entryRuleDoWhileLoop2687 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoWhileLoop2697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleDoWhileLoop2734 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleDoWhileLoop2755 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleDoWhileLoop2767 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleDoWhileLoop2779 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleDoWhileLoop2800 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleDoWhileLoop2812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement2848 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement2858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleIfStatement2895 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleIfStatement2907 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement2928 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleIfStatement2940 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement2961 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_35_in_ruleIfStatement2974 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleIfStatement2986 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement3007 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleIfStatement3019 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement3040 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_36_in_ruleIfStatement3055 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement3076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement3114 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement3124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleReturnStatement3170 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStatement3191 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleReturnStatement3203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationCallStatement_in_entryRuleOperationCallStatement3239 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperationCallStatement3249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationCall_in_ruleOperationCallStatement3296 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleOperationCallStatement3307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3343 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedNamedElementExpression_in_ruleAssignment3399 = new BitSet(new long[]{0x0000F00004000000L});
        public static final BitSet FOLLOW_ruleAssignOperator_in_ruleAssignment3422 = new BitSet(new long[]{0xFC800840018041E0L});
        public static final BitSet FOLLOW_ruleInitializeExpression_in_ruleAssignment3443 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleUnaryPostIncrementDecrementOperator_in_ruleAssignment3471 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleAssignment3484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitializeExpression_in_entryRuleInitializeExpression3520 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitializeExpression3530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayInitializeExpression_in_ruleInitializeExpression3577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNondeterministicChoiceExpression_in_ruleInitializeExpression3604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleInitializeExpression3631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayInitializeExpression_in_entryRuleArrayInitializeExpression3666 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArrayInitializeExpression3676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleArrayInitializeExpression3713 = new BitSet(new long[]{0xFC800840018041E0L});
        public static final BitSet FOLLOW_ruleInitializeExpression_in_ruleArrayInitializeExpression3734 = new BitSet(new long[]{0x0000008000008000L});
        public static final BitSet FOLLOW_15_in_ruleArrayInitializeExpression3747 = new BitSet(new long[]{0xFC800840018041E0L});
        public static final BitSet FOLLOW_ruleInitializeExpression_in_ruleArrayInitializeExpression3768 = new BitSet(new long[]{0x0000008000008000L});
        public static final BitSet FOLLOW_39_in_ruleArrayInitializeExpression3782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalVariableOrConstantDeclarationStatement_in_entryRuleLocalVariableOrConstantDeclarationStatement3818 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalVariableOrConstantDeclarationStatement3828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalVariableDeclaration_in_ruleLocalVariableOrConstantDeclarationStatement3875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalConstantDeclaration_in_ruleLocalVariableOrConstantDeclarationStatement3894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalVariableDeclaration_in_entryRuleLocalVariableDeclaration3932 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalVariableDeclaration3942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDATATYPE_in_ruleLocalVariableDeclaration3990 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVariableDeclaration4007 = new BitSet(new long[]{0x0000000044000000L});
        public static final BitSet FOLLOW_26_in_ruleLocalVariableDeclaration4025 = new BitSet(new long[]{0xFC800840018041E0L});
        public static final BitSet FOLLOW_ruleInitializeExpression_in_ruleLocalVariableDeclaration4046 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleLocalVariableDeclaration4060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalConstantDeclaration_in_entryRuleLocalConstantDeclaration4096 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalConstantDeclaration4106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleLocalConstantDeclaration4149 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleDATATYPE_in_ruleLocalConstantDeclaration4185 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLocalConstantDeclaration4202 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleLocalConstantDeclaration4219 = new BitSet(new long[]{0xFC800840018041E0L});
        public static final BitSet FOLLOW_ruleInitializeExpression_in_ruleLocalConstantDeclaration4240 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleLocalConstantDeclaration4252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNondeterministicChoiceExpression_in_entryRuleNondeterministicChoiceExpression4288 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNondeterministicChoiceExpression4298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNondeterministicChoiceExpression4343 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleRange_in_ruleNondeterministicChoiceExpression4364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRange_in_entryRuleRange4400 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRange4410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleRange4447 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleLONG_in_ruleRange4468 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRange4480 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleLONG_in_ruleRange4501 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleRange4513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLONG_in_entryRuleLONG4550 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLONG4561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLONG4600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalExpression_in_entryRuleLogicalExpression4644 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalExpression4654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleLogicalExpression4700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression4734 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression4744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression4791 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression4821 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression4842 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression4880 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression4890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleLogicalAndExpression4937 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression4967 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleLogicalAndExpression4988 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression5026 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression5036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonHigherOpExpression_in_ruleComparisonExpression5083 = new BitSet(new long[]{0x000C000000000002L});
        public static final BitSet FOLLOW_ruleComparingEQNEQOperator_in_ruleComparisonExpression5113 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_ruleComparisonHigherOpExpression_in_ruleComparisonExpression5134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonHigherOpExpression_in_entryRuleComparisonHigherOpExpression5172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonHigherOpExpression5182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleComparisonHigherOpExpression5229 = new BitSet(new long[]{0x0030060000000002L});
        public static final BitSet FOLLOW_ruleComparingRelOperator_in_ruleComparisonHigherOpExpression5259 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleComparisonHigherOpExpression5280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression5318 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression5328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleArithmeticExpression5374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression5408 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression5418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression5465 = new BitSet(new long[]{0x00C0000000000002L});
        public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression5495 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression5516 = new BitSet(new long[]{0x00C0000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression5554 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression5564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryPreExpression_in_ruleMultiplicationExpression5611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_ruleMultiplicationExpression5639 = new BitSet(new long[]{0x0300000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression5669 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_ruleUnaryPreExpression_in_ruleMultiplicationExpression5692 = new BitSet(new long[]{0x0300000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_ruleMultiplicationExpression5711 = new BitSet(new long[]{0x0300000000000002L});
        public static final BitSet FOLLOW_ruleUnaryPreExpression_in_entryRuleUnaryPreExpression5753 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryPreExpression5763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryPreOperator_in_ruleUnaryPreExpression5818 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_ruleOperand_in_ruleUnaryPreExpression5839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_entryRuleOperand5875 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperand5885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleOperand5923 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleOperand5945 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleOperand5956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleOperand5985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedTypedNamedElementExpression_in_ruleOperand6012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationCall_in_ruleOperand6039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTriggerMessageExpression_in_ruleOperand6066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoAttributeSelectorExpression_in_ruleOperand6093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression6128 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpression6138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_ruleLiteralExpression6193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral6230 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral6241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NUMBER_in_ruleLiteral6281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleLiteral6307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLiteral6333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleLiteral6357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedTypedNamedElementExpression_in_entryRuleExtendedTypedNamedElementExpression6397 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedTypedNamedElementExpression6407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedNamedElementExpression_in_ruleExtendedTypedNamedElementExpression6454 = new BitSet(new long[]{0x0000300010000002L});
        public static final BitSet FOLLOW_28_in_ruleExtendedTypedNamedElementExpression6476 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_rulePositionSelectorExpression_in_ruleExtendedTypedNamedElementExpression6497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIncrementDecrementOperatorExpression_in_ruleExtendedTypedNamedElementExpression6535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedNamedElementExpression_in_entryRuleTypedNamedElementExpression6574 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedNamedElementExpression6584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypedNamedElementExpression6629 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_38_in_ruleTypedNamedElementExpression6642 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleTypedNamedElementExpression6663 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleTypedNamedElementExpression6675 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_ruleNoAttributeSelectorExpression_in_entryRuleNoAttributeSelectorExpression6713 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoAttributeSelectorExpression6723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositionSelectorExpression_in_ruleNoAttributeSelectorExpression6768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositionSelectorExpression_in_entryRulePositionSelectorExpression6803 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePositionSelectorExpression6813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositionSelectorKind_in_rulePositionSelectorExpression6859 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_rulePositionSelectorExpression6872 = new BitSet(new long[]{0xFC800800018001E0L});
        public static final BitSet FOLLOW_rulePositionSelectorExpression_in_rulePositionSelectorExpression6893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationCall_in_entryRuleOperationCall6931 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperationCall6941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOperationCall6986 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleOperationCall6998 = new BitSet(new long[]{0x0000000002000020L});
        public static final BitSet FOLLOW_ruleParamaterBinding_in_ruleOperationCall7020 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_15_in_ruleOperationCall7033 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleParamaterBinding_in_ruleOperationCall7054 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleOperationCall7070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTriggerMessageExpression_in_entryRuleTriggerMessageExpression7106 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTriggerMessageExpression7116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTriggerMessageExpression7161 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleTriggerMessageExpression7173 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTriggerMessageExpression7193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDATATYPE_in_entryRuleDATATYPE7230 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDATATYPE7241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDATATYPE7281 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_38_in_ruleDATATYPE7300 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDATATYPE7315 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleDATATYPE7333 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_44_in_ruleUnaryPostIncrementDecrementOperator7389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleUnaryPostIncrementDecrementOperator7406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleIncrementDecrementOperatorExpression7451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleIncrementDecrementOperatorExpression7468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleAssignOperator7513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleAssignOperator7530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleAssignOperator7547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleLogicalOrOperator7591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleLogicalAndOperator7634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleComparingEQNEQOperator7678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleComparingEQNEQOperator7695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleComparingRelOperator7740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleComparingRelOperator7757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleComparingRelOperator7774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleComparingRelOperator7791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleAdditionOperator7836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleAdditionOperator7853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleMultiplicationOperator7898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleMultiplicationOperator7915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleUnaryPreOperator7960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleUnaryPreOperator7977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rulePositionSelectorKind8022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rulePositionSelectorKind8039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rulePositionSelectorKind8056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rulePositionSelectorKind8073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rulePositionSelectorKind8090 = new BitSet(new long[]{0x0000000000000002L});
    }


}