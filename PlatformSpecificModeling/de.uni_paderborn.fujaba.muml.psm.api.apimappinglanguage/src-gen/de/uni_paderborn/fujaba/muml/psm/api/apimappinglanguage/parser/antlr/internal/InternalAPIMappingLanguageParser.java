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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_NUMBER", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MappingRepository:'", "'{'", "','", "'}'", "'#'", "'import'", "'PortInstance:'", "'execCommand:'", "'initCommand:'", "'enum:'", "'API_Call:'", "'('", "')'", "':='", "'port:'", "'.'", "'for'", "';'", "'while'", "'do'", "');'", "'if'", "'elseif'", "'else'", "'return'", "'['", "']'", "'const'", "'<'", "'>'", "'null'", "'->'", "'++'", "'--'", "'+='", "'-='", "'||'", "'&&'", "'=='", "'<>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'self'", "'first'", "'last'", "'prev'", "'next'"
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
    public static final int T__13=13;
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
    public static final int RULE_ML_COMMENT=9;
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
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_BOOLEAN)||LA6_0==24||LA6_0==43||LA6_0==56||(LA6_0>=60 && LA6_0<=65)) ) {
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
            case 56:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
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
            case 56:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
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

            if ( ((LA15_0>=45 && LA15_0<=46)) ) {
                alt15=1;
            }
            else if ( (LA15_0==26||(LA15_0>=47 && LA15_0<=48)) ) {
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

            if ( (LA18_0==26||(LA18_0>=47 && LA18_0<=48)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=45 && LA18_0<=46)) ) {
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1613:1: ruleInitializeExpression returns [EObject current=null] : (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression | this_TypeCastExpression_3= ruleTypeCastExpression ) ;
    public final EObject ruleInitializeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArrayInitializeExpression_0 = null;

        EObject this_NondeterministicChoiceExpression_1 = null;

        EObject this_Expression_2 = null;

        EObject this_TypeCastExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1616:28: ( (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression | this_TypeCastExpression_3= ruleTypeCastExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1617:1: (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression | this_TypeCastExpression_3= ruleTypeCastExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1617:1: (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression | this_TypeCastExpression_3= ruleTypeCastExpression )
            int alt19=4;
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
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1648:5: this_TypeCastExpression_3= ruleTypeCastExpression
                    {
                     
                            newCompositeNode(grammarAccess.getInitializeExpressionAccess().getTypeCastExpressionParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTypeCastExpression_in_ruleInitializeExpression3658);
                    this_TypeCastExpression_3=ruleTypeCastExpression();

                    state._fsp--;

                     
                            current = this_TypeCastExpression_3; 
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1664:1: entryRuleArrayInitializeExpression returns [EObject current=null] : iv_ruleArrayInitializeExpression= ruleArrayInitializeExpression EOF ;
    public final EObject entryRuleArrayInitializeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayInitializeExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1665:2: (iv_ruleArrayInitializeExpression= ruleArrayInitializeExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1666:2: iv_ruleArrayInitializeExpression= ruleArrayInitializeExpression EOF
            {
             newCompositeNode(grammarAccess.getArrayInitializeExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArrayInitializeExpression_in_entryRuleArrayInitializeExpression3693);
            iv_ruleArrayInitializeExpression=ruleArrayInitializeExpression();

            state._fsp--;

             current =iv_ruleArrayInitializeExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArrayInitializeExpression3703); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1673:1: ruleArrayInitializeExpression returns [EObject current=null] : (otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayInitializeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1676:28: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1677:1: (otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1677:1: (otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1677:3: otherlv_0= '[' ( (lv_expressions_1_0= ruleInitializeExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleArrayInitializeExpression3740); 

                	newLeafNode(otherlv_0, grammarAccess.getArrayInitializeExpressionAccess().getLeftSquareBracketKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1681:1: ( (lv_expressions_1_0= ruleInitializeExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1682:1: (lv_expressions_1_0= ruleInitializeExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1682:1: (lv_expressions_1_0= ruleInitializeExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1683:3: lv_expressions_1_0= ruleInitializeExpression
            {
             
            	        newCompositeNode(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsInitializeExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInitializeExpression_in_ruleArrayInitializeExpression3761);
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

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1699:2: (otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1699:4: otherlv_2= ',' ( (lv_expressions_3_0= ruleInitializeExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArrayInitializeExpression3774); 

            	        	newLeafNode(otherlv_2, grammarAccess.getArrayInitializeExpressionAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1703:1: ( (lv_expressions_3_0= ruleInitializeExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1704:1: (lv_expressions_3_0= ruleInitializeExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1704:1: (lv_expressions_3_0= ruleInitializeExpression )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1705:3: lv_expressions_3_0= ruleInitializeExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsInitializeExpressionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleInitializeExpression_in_ruleArrayInitializeExpression3795);
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

            otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleArrayInitializeExpression3809); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1733:1: entryRuleLocalVariableOrConstantDeclarationStatement returns [EObject current=null] : iv_ruleLocalVariableOrConstantDeclarationStatement= ruleLocalVariableOrConstantDeclarationStatement EOF ;
    public final EObject entryRuleLocalVariableOrConstantDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariableOrConstantDeclarationStatement = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1734:2: (iv_ruleLocalVariableOrConstantDeclarationStatement= ruleLocalVariableOrConstantDeclarationStatement EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1735:2: iv_ruleLocalVariableOrConstantDeclarationStatement= ruleLocalVariableOrConstantDeclarationStatement EOF
            {
             newCompositeNode(grammarAccess.getLocalVariableOrConstantDeclarationStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalVariableOrConstantDeclarationStatement_in_entryRuleLocalVariableOrConstantDeclarationStatement3845);
            iv_ruleLocalVariableOrConstantDeclarationStatement=ruleLocalVariableOrConstantDeclarationStatement();

            state._fsp--;

             current =iv_ruleLocalVariableOrConstantDeclarationStatement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalVariableOrConstantDeclarationStatement3855); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1742:1: ruleLocalVariableOrConstantDeclarationStatement returns [EObject current=null] : ( ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) ) ) ;
    public final EObject ruleLocalVariableOrConstantDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_0_1 = null;

        EObject lv_variable_0_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1745:28: ( ( ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1746:1: ( ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1746:1: ( ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1747:1: ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1747:1: ( (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1748:1: (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1748:1: (lv_variable_0_1= ruleLocalVariableDeclaration | lv_variable_0_2= ruleLocalConstantDeclaration )
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
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1749:3: lv_variable_0_1= ruleLocalVariableDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableLocalVariableDeclarationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLocalVariableDeclaration_in_ruleLocalVariableOrConstantDeclarationStatement3902);
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
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1764:8: lv_variable_0_2= ruleLocalConstantDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableLocalConstantDeclarationParserRuleCall_0_1()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLocalConstantDeclaration_in_ruleLocalVariableOrConstantDeclarationStatement3921);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1790:1: entryRuleLocalVariableDeclaration returns [EObject current=null] : iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF ;
    public final EObject entryRuleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariableDeclaration = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1791:2: (iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1792:2: iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getLocalVariableDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalVariableDeclaration_in_entryRuleLocalVariableDeclaration3959);
            iv_ruleLocalVariableDeclaration=ruleLocalVariableDeclaration();

            state._fsp--;

             current =iv_ruleLocalVariableDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalVariableDeclaration3969); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1799:1: ruleLocalVariableDeclaration returns [EObject current=null] : ( ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_initializeExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1802:28: ( ( ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1803:1: ( ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1803:1: ( ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1803:2: ( ( ruleDATATYPE ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )? otherlv_4= ';'
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1803:2: ( ( ruleDATATYPE ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1804:1: ( ruleDATATYPE )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1804:1: ( ruleDATATYPE )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1805:3: ruleDATATYPE
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalVariableDeclarationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeDataTypeCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDATATYPE_in_ruleLocalVariableDeclaration4017);
            ruleDATATYPE();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1818:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1819:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1819:1: (lv_name_1_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1820:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLocalVariableDeclaration4034); 

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

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1836:2: (otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1836:4: otherlv_2= ':=' ( (lv_initializeExpression_3_0= ruleInitializeExpression ) )
                    {
                    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleLocalVariableDeclaration4052); 

                        	newLeafNode(otherlv_2, grammarAccess.getLocalVariableDeclarationAccess().getColonEqualsSignKeyword_2_0());
                        
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1840:1: ( (lv_initializeExpression_3_0= ruleInitializeExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1841:1: (lv_initializeExpression_3_0= ruleInitializeExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1841:1: (lv_initializeExpression_3_0= ruleInitializeExpression )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1842:3: lv_initializeExpression_3_0= ruleInitializeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalVariableDeclarationAccess().getInitializeExpressionInitializeExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInitializeExpression_in_ruleLocalVariableDeclaration4073);
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

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLocalVariableDeclaration4087); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1870:1: entryRuleLocalConstantDeclaration returns [EObject current=null] : iv_ruleLocalConstantDeclaration= ruleLocalConstantDeclaration EOF ;
    public final EObject entryRuleLocalConstantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalConstantDeclaration = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1871:2: (iv_ruleLocalConstantDeclaration= ruleLocalConstantDeclaration EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1872:2: iv_ruleLocalConstantDeclaration= ruleLocalConstantDeclaration EOF
            {
             newCompositeNode(grammarAccess.getLocalConstantDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalConstantDeclaration_in_entryRuleLocalConstantDeclaration4123);
            iv_ruleLocalConstantDeclaration=ruleLocalConstantDeclaration();

            state._fsp--;

             current =iv_ruleLocalConstantDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalConstantDeclaration4133); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1879:1: ruleLocalConstantDeclaration returns [EObject current=null] : ( ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleLocalConstantDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_initializeExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1882:28: ( ( ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1883:1: ( ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1883:1: ( ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1883:2: ( (lv_constant_0_0= 'const' ) ) ( ( ruleDATATYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_initializeExpression_4_0= ruleInitializeExpression ) ) otherlv_5= ';'
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1883:2: ( (lv_constant_0_0= 'const' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1884:1: (lv_constant_0_0= 'const' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1884:1: (lv_constant_0_0= 'const' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1885:3: lv_constant_0_0= 'const'
            {
            lv_constant_0_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleLocalConstantDeclaration4176); 

                    newLeafNode(lv_constant_0_0, grammarAccess.getLocalConstantDeclarationAccess().getConstantConstKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalConstantDeclarationRule());
            	        }
                   		setWithLastConsumed(current, "constant", true, "const");
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1898:2: ( ( ruleDATATYPE ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1899:1: ( ruleDATATYPE )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1899:1: ( ruleDATATYPE )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1900:3: ruleDATATYPE
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalConstantDeclarationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeDataTypeCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDATATYPE_in_ruleLocalConstantDeclaration4212);
            ruleDATATYPE();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1913:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1914:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1914:1: (lv_name_2_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1915:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLocalConstantDeclaration4229); 

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

            otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleLocalConstantDeclaration4246); 

                	newLeafNode(otherlv_3, grammarAccess.getLocalConstantDeclarationAccess().getColonEqualsSignKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1935:1: ( (lv_initializeExpression_4_0= ruleInitializeExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1936:1: (lv_initializeExpression_4_0= ruleInitializeExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1936:1: (lv_initializeExpression_4_0= ruleInitializeExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1937:3: lv_initializeExpression_4_0= ruleInitializeExpression
            {
             
            	        newCompositeNode(grammarAccess.getLocalConstantDeclarationAccess().getInitializeExpressionInitializeExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInitializeExpression_in_ruleLocalConstantDeclaration4267);
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

            otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLocalConstantDeclaration4279); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1965:1: entryRuleNondeterministicChoiceExpression returns [EObject current=null] : iv_ruleNondeterministicChoiceExpression= ruleNondeterministicChoiceExpression EOF ;
    public final EObject entryRuleNondeterministicChoiceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNondeterministicChoiceExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1966:2: (iv_ruleNondeterministicChoiceExpression= ruleNondeterministicChoiceExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1967:2: iv_ruleNondeterministicChoiceExpression= ruleNondeterministicChoiceExpression EOF
            {
             newCompositeNode(grammarAccess.getNondeterministicChoiceExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNondeterministicChoiceExpression_in_entryRuleNondeterministicChoiceExpression4315);
            iv_ruleNondeterministicChoiceExpression=ruleNondeterministicChoiceExpression();

            state._fsp--;

             current =iv_ruleNondeterministicChoiceExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNondeterministicChoiceExpression4325); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1974:1: ruleNondeterministicChoiceExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) ) ) ;
    public final EObject ruleNondeterministicChoiceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_range_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1977:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1978:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1978:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1978:2: ( (otherlv_0= RULE_ID ) ) ( (lv_range_1_0= ruleRange ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1978:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1979:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1979:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1980:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNondeterministicChoiceExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNondeterministicChoiceExpression4370); 

            		newLeafNode(otherlv_0, grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypePrimitiveDataTypeCrossReference_0_0()); 
            	

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1991:2: ( (lv_range_1_0= ruleRange ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1992:1: (lv_range_1_0= ruleRange )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1992:1: (lv_range_1_0= ruleRange )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:1993:3: lv_range_1_0= ruleRange
            {
             
            	        newCompositeNode(grammarAccess.getNondeterministicChoiceExpressionAccess().getRangeRangeParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleRange_in_ruleNondeterministicChoiceExpression4391);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2017:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2018:2: (iv_ruleRange= ruleRange EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2019:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRange_in_entryRuleRange4427);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRange4437); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2026:1: ruleRange returns [EObject current=null] : (otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lowerBound_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2029:28: ( (otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2030:1: (otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2030:1: (otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2030:3: otherlv_0= '<' ( (lv_lowerBound_1_0= ruleLONG ) ) otherlv_2= ',' ( (lv_upperBound_3_0= ruleLONG ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleRange4474); 

                	newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLessThanSignKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2034:1: ( (lv_lowerBound_1_0= ruleLONG ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2035:1: (lv_lowerBound_1_0= ruleLONG )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2035:1: (lv_lowerBound_1_0= ruleLONG )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2036:3: lv_lowerBound_1_0= ruleLONG
            {
             
            	        newCompositeNode(grammarAccess.getRangeAccess().getLowerBoundLONGParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLONG_in_ruleRange4495);
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

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRange4507); 

                	newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getCommaKeyword_2());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2056:1: ( (lv_upperBound_3_0= ruleLONG ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2057:1: (lv_upperBound_3_0= ruleLONG )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2057:1: (lv_upperBound_3_0= ruleLONG )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2058:3: lv_upperBound_3_0= ruleLONG
            {
             
            	        newCompositeNode(grammarAccess.getRangeAccess().getUpperBoundLONGParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLONG_in_ruleRange4528);
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

            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleRange4540); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2086:1: entryRuleLONG returns [String current=null] : iv_ruleLONG= ruleLONG EOF ;
    public final String entryRuleLONG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLONG = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2087:2: (iv_ruleLONG= ruleLONG EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2088:2: iv_ruleLONG= ruleLONG EOF
            {
             newCompositeNode(grammarAccess.getLONGRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLONG_in_entryRuleLONG4577);
            iv_ruleLONG=ruleLONG();

            state._fsp--;

             current =iv_ruleLONG.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLONG4588); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2095:1: ruleLONG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLONG() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2098:28: (this_INT_0= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2099:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLONG4627); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2114:1: entryRuleLogicalExpression returns [EObject current=null] : iv_ruleLogicalExpression= ruleLogicalExpression EOF ;
    public final EObject entryRuleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2115:2: (iv_ruleLogicalExpression= ruleLogicalExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2116:2: iv_ruleLogicalExpression= ruleLogicalExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalExpression_in_entryRuleLogicalExpression4671);
            iv_ruleLogicalExpression=ruleLogicalExpression();

            state._fsp--;

             current =iv_ruleLogicalExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalExpression4681); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2123:1: ruleLogicalExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2126:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2128:5: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
             
                    newCompositeNode(grammarAccess.getLogicalExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleLogicalExpression4727);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2144:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2145:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2146:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression4761);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;

             current =iv_ruleLogicalOrExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalOrExpression4771); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2153:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2156:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2157:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2157:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2158:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression4818);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;

             
                    current = this_LogicalAndExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2166:1: ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==49) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2166:2: () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2166:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2167:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLogicalOrExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2172:2: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2173:1: (lv_operator_2_0= ruleLogicalOrOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2173:1: (lv_operator_2_0= ruleLogicalOrOperator )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2174:3: lv_operator_2_0= ruleLogicalOrOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression4848);
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

            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2190:2: ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2191:1: (lv_rightExpression_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2191:1: (lv_rightExpression_3_0= ruleLogicalAndExpression )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2192:3: lv_rightExpression_3_0= ruleLogicalAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionLogicalAndExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression4869);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2216:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2217:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2218:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression4907);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;

             current =iv_ruleLogicalAndExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalAndExpression4917); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2225:1: ruleLogicalAndExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2228:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2229:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2229:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2230:5: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleLogicalAndExpression4964);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;

             
                    current = this_ComparisonExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2238:1: ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==50) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2238:2: () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2238:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2239:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLogicalAndExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2244:2: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2245:1: (lv_operator_2_0= ruleLogicalAndOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2245:1: (lv_operator_2_0= ruleLogicalAndOperator )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2246:3: lv_operator_2_0= ruleLogicalAndOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression4994);
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

            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2262:2: ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2263:1: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2263:1: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2264:3: lv_rightExpression_3_0= ruleComparisonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionComparisonExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleLogicalAndExpression5015);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2288:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2289:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2290:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression5053);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression5063); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2297:1: ruleComparisonExpression returns [EObject current=null] : (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonHigherOpExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2300:28: ( (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2301:1: (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2301:1: (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2302:5: this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getComparisonExpressionAccess().getComparisonHigherOpExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparisonHigherOpExpression_in_ruleComparisonExpression5110);
            this_ComparisonHigherOpExpression_0=ruleComparisonHigherOpExpression();

            state._fsp--;

             
                    current = this_ComparisonHigherOpExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2310:1: ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=51 && LA25_0<=52)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2310:2: () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2310:2: ()
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2311:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2316:2: ( (lv_operator_2_0= ruleComparingEQNEQOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2317:1: (lv_operator_2_0= ruleComparingEQNEQOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2317:1: (lv_operator_2_0= ruleComparingEQNEQOperator )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2318:3: lv_operator_2_0= ruleComparingEQNEQOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparingEQNEQOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComparingEQNEQOperator_in_ruleComparisonExpression5140);
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

                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2334:2: ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2335:1: (lv_rightExpression_3_0= ruleComparisonHigherOpExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2335:1: (lv_rightExpression_3_0= ruleComparisonHigherOpExpression )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2336:3: lv_rightExpression_3_0= ruleComparisonHigherOpExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightExpressionComparisonHigherOpExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComparisonHigherOpExpression_in_ruleComparisonExpression5161);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2360:1: entryRuleComparisonHigherOpExpression returns [EObject current=null] : iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF ;
    public final EObject entryRuleComparisonHigherOpExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonHigherOpExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2361:2: (iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2362:2: iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonHigherOpExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonHigherOpExpression_in_entryRuleComparisonHigherOpExpression5199);
            iv_ruleComparisonHigherOpExpression=ruleComparisonHigherOpExpression();

            state._fsp--;

             current =iv_ruleComparisonHigherOpExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonHigherOpExpression5209); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2369:1: ruleComparisonHigherOpExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? ) ;
    public final EObject ruleComparisonHigherOpExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2372:28: ( (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2373:1: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2373:1: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2374:5: this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_ruleComparisonHigherOpExpression5256);
            this_ArithmeticExpression_0=ruleArithmeticExpression();

            state._fsp--;

             
                    current = this_ArithmeticExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2382:1: ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=41 && LA26_0<=42)||(LA26_0>=53 && LA26_0<=54)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2382:2: () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2382:2: ()
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2383:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonHigherOpExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2388:2: ( (lv_operator_2_0= ruleComparingRelOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2389:1: (lv_operator_2_0= ruleComparingRelOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2389:1: (lv_operator_2_0= ruleComparingRelOperator )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2390:3: lv_operator_2_0= ruleComparingRelOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorComparingRelOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComparingRelOperator_in_ruleComparisonHigherOpExpression5286);
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

                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2406:2: ( (lv_rightExpression_3_0= ruleArithmeticExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2407:1: (lv_rightExpression_3_0= ruleArithmeticExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2407:1: (lv_rightExpression_3_0= ruleArithmeticExpression )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2408:3: lv_rightExpression_3_0= ruleArithmeticExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionArithmeticExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_ruleComparisonHigherOpExpression5307);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2432:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2433:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2434:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
             newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression5345);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;

             current =iv_ruleArithmeticExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArithmeticExpression5355); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2441:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditionExpression_0= ruleAdditionExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2444:28: (this_AdditionExpression_0= ruleAdditionExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2446:5: this_AdditionExpression_0= ruleAdditionExpression
            {
             
                    newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditionExpressionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAdditionExpression_in_ruleArithmeticExpression5401);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2462:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2463:2: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2464:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditionExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression5435);
            iv_ruleAdditionExpression=ruleAdditionExpression();

            state._fsp--;

             current =iv_ruleAdditionExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditionExpression5445); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2471:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2474:28: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2475:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2475:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2476:5: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression5492);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;

             
                    current = this_MultiplicationExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2484:1: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=55 && LA27_0<=56)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2484:2: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2484:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2485:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2490:2: ( (lv_operator_2_0= ruleAdditionOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2491:1: (lv_operator_2_0= ruleAdditionOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2491:1: (lv_operator_2_0= ruleAdditionOperator )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2492:3: lv_operator_2_0= ruleAdditionOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression5522);
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

            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2508:2: ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2509:1: (lv_rightExpression_3_0= ruleMultiplicationExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2509:1: (lv_rightExpression_3_0= ruleMultiplicationExpression )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2510:3: lv_rightExpression_3_0= ruleMultiplicationExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightExpressionMultiplicationExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression5543);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2534:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2535:2: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2536:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression5581);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;

             current =iv_ruleMultiplicationExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicationExpression5591); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2543:1: ruleMultiplicationExpression returns [EObject current=null] : (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) ) )* ) ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryPreExpression_0 = null;

        EObject this_Operand_1 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_rightExpression_4_1 = null;

        EObject lv_rightExpression_4_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2546:28: ( (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) ) )* ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2547:1: (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) ) )* ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2547:1: (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) ) )* ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56||LA30_0==60) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_BOOLEAN)||LA30_0==24||LA30_0==43||(LA30_0>=61 && LA30_0<=65)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2548:5: this_UnaryPreExpression_0= ruleUnaryPreExpression
                    {
                     
                            newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getUnaryPreExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryPreExpression_in_ruleMultiplicationExpression5638);
                    this_UnaryPreExpression_0=ruleUnaryPreExpression();

                    state._fsp--;

                     
                            current = this_UnaryPreExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2557:6: (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) ) )* )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2557:6: (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) ) )* )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2558:5: this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) ) )*
                    {
                     
                            newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperandParserRuleCall_1_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOperand_in_ruleMultiplicationExpression5666);
                    this_Operand_1=ruleOperand();

                    state._fsp--;

                     
                            current = this_Operand_1; 
                            afterParserOrEnumRuleCall();
                        
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2566:1: ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=57 && LA29_0<=59)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2566:2: () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2566:2: ()
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2567:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_1_0(),
                    	                current);
                    	        

                    	    }

                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2572:2: ( (lv_operator_3_0= ruleMultiplicationOperator ) )
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2573:1: (lv_operator_3_0= ruleMultiplicationOperator )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2573:1: (lv_operator_3_0= ruleMultiplicationOperator )
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2574:3: lv_operator_3_0= ruleMultiplicationOperator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression5696);
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

                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2590:2: ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) ) )
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2591:1: ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2591:1: ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand ) )
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2592:1: (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2592:1: (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleOperand )
                    	    int alt28=2;
                    	    int LA28_0 = input.LA(1);

                    	    if ( (LA28_0==56||LA28_0==60) ) {
                    	        alt28=1;
                    	    }
                    	    else if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_BOOLEAN)||LA28_0==24||LA28_0==43||(LA28_0>=61 && LA28_0<=65)) ) {
                    	        alt28=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 28, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt28) {
                    	        case 1 :
                    	            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2593:3: lv_rightExpression_4_1= ruleUnaryPreExpression
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionUnaryPreExpressionParserRuleCall_1_1_2_0_0()); 
                    	            	    
                    	            pushFollow(FollowSets000.FOLLOW_ruleUnaryPreExpression_in_ruleMultiplicationExpression5719);
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
                    	            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2608:8: lv_rightExpression_4_2= ruleOperand
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionOperandParserRuleCall_1_1_2_0_1()); 
                    	            	    
                    	            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_ruleMultiplicationExpression5738);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2634:1: entryRuleUnaryPreExpression returns [EObject current=null] : iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF ;
    public final EObject entryRuleUnaryPreExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryPreExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2635:2: (iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2636:2: iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryPreExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryPreExpression_in_entryRuleUnaryPreExpression5780);
            iv_ruleUnaryPreExpression=ruleUnaryPreExpression();

            state._fsp--;

             current =iv_ruleUnaryPreExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryPreExpression5790); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2643:1: ruleUnaryPreExpression returns [EObject current=null] : ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) ;
    public final EObject ruleUnaryPreExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_enclosedExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2646:28: ( ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2647:1: ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2647:1: ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2647:2: () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2647:2: ()
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2648:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnaryPreExpressionAccess().getUnaryExpressionAction_0(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2653:2: ( (lv_operator_1_0= ruleUnaryPreOperator ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2654:1: (lv_operator_1_0= ruleUnaryPreOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2654:1: (lv_operator_1_0= ruleUnaryPreOperator )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2655:3: lv_operator_1_0= ruleUnaryPreOperator
            {
             
            	        newCompositeNode(grammarAccess.getUnaryPreExpressionAccess().getOperatorUnaryPreOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUnaryPreOperator_in_ruleUnaryPreExpression5845);
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

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2671:2: ( (lv_enclosedExpression_2_0= ruleOperand ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2672:1: (lv_enclosedExpression_2_0= ruleOperand )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2672:1: (lv_enclosedExpression_2_0= ruleOperand )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2673:3: lv_enclosedExpression_2_0= ruleOperand
            {
             
            	        newCompositeNode(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionOperandParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_ruleUnaryPreExpression5866);
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


    // $ANTLR start "entryRuleTypeCastExpression"
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2697:1: entryRuleTypeCastExpression returns [EObject current=null] : iv_ruleTypeCastExpression= ruleTypeCastExpression EOF ;
    public final EObject entryRuleTypeCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeCastExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2698:2: (iv_ruleTypeCastExpression= ruleTypeCastExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2699:2: iv_ruleTypeCastExpression= ruleTypeCastExpression EOF
            {
             newCompositeNode(grammarAccess.getTypeCastExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeCastExpression_in_entryRuleTypeCastExpression5902);
            iv_ruleTypeCastExpression=ruleTypeCastExpression();

            state._fsp--;

             current =iv_ruleTypeCastExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeCastExpression5912); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2706:1: ruleTypeCastExpression returns [EObject current=null] : ( () otherlv_1= '(' ( ( ruleDATATYPE ) ) otherlv_3= ')' ( (lv_enclosedExpression_4_0= ruleOperand ) ) ) ;
    public final EObject ruleTypeCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_enclosedExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2709:28: ( ( () otherlv_1= '(' ( ( ruleDATATYPE ) ) otherlv_3= ')' ( (lv_enclosedExpression_4_0= ruleOperand ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2710:1: ( () otherlv_1= '(' ( ( ruleDATATYPE ) ) otherlv_3= ')' ( (lv_enclosedExpression_4_0= ruleOperand ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2710:1: ( () otherlv_1= '(' ( ( ruleDATATYPE ) ) otherlv_3= ')' ( (lv_enclosedExpression_4_0= ruleOperand ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2710:2: () otherlv_1= '(' ( ( ruleDATATYPE ) ) otherlv_3= ')' ( (lv_enclosedExpression_4_0= ruleOperand ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2710:2: ()
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2711:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTypeCastExpressionAccess().getTypeCastExpressionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTypeCastExpression5958); 

                	newLeafNode(otherlv_1, grammarAccess.getTypeCastExpressionAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2720:1: ( ( ruleDATATYPE ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2721:1: ( ruleDATATYPE )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2721:1: ( ruleDATATYPE )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2722:3: ruleDATATYPE
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeCastExpressionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeCastExpressionAccess().getDataTypeDataTypeCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDATATYPE_in_ruleTypeCastExpression5981);
            ruleDATATYPE();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTypeCastExpression5993); 

                	newLeafNode(otherlv_3, grammarAccess.getTypeCastExpressionAccess().getRightParenthesisKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2739:1: ( (lv_enclosedExpression_4_0= ruleOperand ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2740:1: (lv_enclosedExpression_4_0= ruleOperand )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2740:1: (lv_enclosedExpression_4_0= ruleOperand )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2741:3: lv_enclosedExpression_4_0= ruleOperand
            {
             
            	        newCompositeNode(grammarAccess.getTypeCastExpressionAccess().getEnclosedExpressionOperandParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_ruleTypeCastExpression6014);
            lv_enclosedExpression_4_0=ruleOperand();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeCastExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"enclosedExpression",
                    		lv_enclosedExpression_4_0, 
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
    // $ANTLR end "ruleTypeCastExpression"


    // $ANTLR start "entryRuleOperand"
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2765:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2766:2: (iv_ruleOperand= ruleOperand EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2767:2: iv_ruleOperand= ruleOperand EOF
            {
             newCompositeNode(grammarAccess.getOperandRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_entryRuleOperand6050);
            iv_ruleOperand=ruleOperand();

            state._fsp--;

             current =iv_ruleOperand; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperand6060); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2774:1: ruleOperand returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression | this_OperationCall_5= ruleOperationCall | this_TriggerMessageExpression_6= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_7= ruleNoAttributeSelectorExpression ) ;
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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2777:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression | this_OperationCall_5= ruleOperationCall | this_TriggerMessageExpression_6= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_7= ruleNoAttributeSelectorExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2778:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression | this_OperationCall_5= ruleOperationCall | this_TriggerMessageExpression_6= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_7= ruleNoAttributeSelectorExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2778:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression | this_OperationCall_5= ruleOperationCall | this_TriggerMessageExpression_6= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_7= ruleNoAttributeSelectorExpression )
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
                case 28:
                case 30:
                case 33:
                case 38:
                case 39:
                case 41:
                case 42:
                case 45:
                case 46:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    {
                    alt31=3;
                    }
                    break;
                case 44:
                    {
                    int LA31_6 = input.LA(3);

                    if ( (LA31_6==RULE_ID) ) {
                        alt31=5;
                    }
                    else if ( ((LA31_6>=61 && LA31_6<=65)) ) {
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
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
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
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2778:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2778:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2778:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleOperand6098); 

                        	newLeafNode(otherlv_0, grammarAccess.getOperandAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleOperand6120);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleOperand6131); 

                        	newLeafNode(otherlv_2, grammarAccess.getOperandAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2797:5: this_LiteralExpression_3= ruleLiteralExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getLiteralExpressionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_ruleOperand6160);
                    this_LiteralExpression_3=ruleLiteralExpression();

                    state._fsp--;

                     
                            current = this_LiteralExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2807:5: this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getExtendedTypedNamedElementExpressionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExtendedTypedNamedElementExpression_in_ruleOperand6187);
                    this_ExtendedTypedNamedElementExpression_4=ruleExtendedTypedNamedElementExpression();

                    state._fsp--;

                     
                            current = this_ExtendedTypedNamedElementExpression_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2817:5: this_OperationCall_5= ruleOperationCall
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getOperationCallParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOperationCall_in_ruleOperand6214);
                    this_OperationCall_5=ruleOperationCall();

                    state._fsp--;

                     
                            current = this_OperationCall_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2827:5: this_TriggerMessageExpression_6= ruleTriggerMessageExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getTriggerMessageExpressionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTriggerMessageExpression_in_ruleOperand6241);
                    this_TriggerMessageExpression_6=ruleTriggerMessageExpression();

                    state._fsp--;

                     
                            current = this_TriggerMessageExpression_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2837:5: this_NoAttributeSelectorExpression_7= ruleNoAttributeSelectorExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getNoAttributeSelectorExpressionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNoAttributeSelectorExpression_in_ruleOperand6268);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2853:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2854:2: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2855:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression6303);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralExpression6313); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2862:1: ruleLiteralExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2865:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2866:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2866:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2866:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2866:2: ()
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2867:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_0(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2872:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2873:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2873:1: (lv_value_1_0= ruleLiteral )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2874:3: lv_value_1_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getLiteralExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_ruleLiteralExpression6368);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2898:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2899:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2900:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral6405);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral6416); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2907:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | kw= 'null' ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUMBER_0=null;
        Token this_BOOLEAN_1=null;
        Token this_INT_2=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2910:28: ( (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | kw= 'null' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2911:1: (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | kw= 'null' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2911:1: (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | kw= 'null' )
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
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2911:6: this_NUMBER_0= RULE_NUMBER
                    {
                    this_NUMBER_0=(Token)match(input,RULE_NUMBER,FollowSets000.FOLLOW_RULE_NUMBER_in_ruleLiteral6456); 

                    		current.merge(this_NUMBER_0);
                        
                     
                        newLeafNode(this_NUMBER_0, grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2919:10: this_BOOLEAN_1= RULE_BOOLEAN
                    {
                    this_BOOLEAN_1=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleLiteral6482); 

                    		current.merge(this_BOOLEAN_1);
                        
                     
                        newLeafNode(this_BOOLEAN_1, grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2927:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLiteral6508); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2936:2: kw= 'null'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleLiteral6532); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2949:1: entryRuleExtendedTypedNamedElementExpression returns [EObject current=null] : iv_ruleExtendedTypedNamedElementExpression= ruleExtendedTypedNamedElementExpression EOF ;
    public final EObject entryRuleExtendedTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedTypedNamedElementExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2950:2: (iv_ruleExtendedTypedNamedElementExpression= ruleExtendedTypedNamedElementExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2951:2: iv_ruleExtendedTypedNamedElementExpression= ruleExtendedTypedNamedElementExpression EOF
            {
             newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedTypedNamedElementExpression_in_entryRuleExtendedTypedNamedElementExpression6572);
            iv_ruleExtendedTypedNamedElementExpression=ruleExtendedTypedNamedElementExpression();

            state._fsp--;

             current =iv_ruleExtendedTypedNamedElementExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedTypedNamedElementExpression6582); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2958:1: ruleExtendedTypedNamedElementExpression returns [EObject current=null] : (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )? ) ;
    public final EObject ruleExtendedTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TypedNamedElementExpression_0 = null;

        EObject lv_position_3_0 = null;

        Enumerator lv_incrementDecrementOperator_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2961:28: ( (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2962:1: (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2962:1: (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2963:5: this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getTypedNamedElementExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTypedNamedElementExpression_in_ruleExtendedTypedNamedElementExpression6629);
            this_TypedNamedElementExpression_0=ruleTypedNamedElementExpression();

            state._fsp--;

             
                    current = this_TypedNamedElementExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2971:1: ( ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) ) | ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) ) )?
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==44) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=45 && LA33_0<=46)) ) {
                alt33=2;
            }
            switch (alt33) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2971:2: ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2971:2: ( () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2971:3: () otherlv_2= '->' ( (lv_position_3_0= rulePositionSelectorExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2971:3: ()
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2972:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExtendedTypedNamedElementExpressionAccess().getDiscreteInteractionEndpointReferenceTypedNamedElementExpressionAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleExtendedTypedNamedElementExpression6651); 

                        	newLeafNode(otherlv_2, grammarAccess.getExtendedTypedNamedElementExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0_1());
                        
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2981:1: ( (lv_position_3_0= rulePositionSelectorExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2982:1: (lv_position_3_0= rulePositionSelectorExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2982:1: (lv_position_3_0= rulePositionSelectorExpression )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:2983:3: lv_position_3_0= rulePositionSelectorExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositionSelectorExpression_in_ruleExtendedTypedNamedElementExpression6672);
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
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3000:6: ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3000:6: ( () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3000:7: () ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3000:7: ()
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3001:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExtendedTypedNamedElementExpressionAccess().getAssignmentLhs_typedNamedElementExpressionAction_1_1_0(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3006:2: ( (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3007:1: (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3007:1: (lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3008:3: lv_incrementDecrementOperator_5_0= ruleIncrementDecrementOperatorExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getIncrementDecrementOperatorIncrementDecrementOperatorExpressionEnumRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIncrementDecrementOperatorExpression_in_ruleExtendedTypedNamedElementExpression6710);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3032:1: entryRuleTypedNamedElementExpression returns [EObject current=null] : iv_ruleTypedNamedElementExpression= ruleTypedNamedElementExpression EOF ;
    public final EObject entryRuleTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedNamedElementExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3033:2: (iv_ruleTypedNamedElementExpression= ruleTypedNamedElementExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3034:2: iv_ruleTypedNamedElementExpression= ruleTypedNamedElementExpression EOF
            {
             newCompositeNode(grammarAccess.getTypedNamedElementExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedNamedElementExpression_in_entryRuleTypedNamedElementExpression6749);
            iv_ruleTypedNamedElementExpression=ruleTypedNamedElementExpression();

            state._fsp--;

             current =iv_ruleTypedNamedElementExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedNamedElementExpression6759); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3041:1: ruleTypedNamedElementExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )* ) ;
    public final EObject ruleTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elementAccessors_1_1 = null;

        EObject lv_elementAccessors_1_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3044:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3045:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3045:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3045:2: ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )*
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3045:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3046:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3046:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3047:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypedNamedElementExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypedNamedElementExpression6804); 

            		newLeafNode(otherlv_0, grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementTypedNamedElementCrossReference_0_0()); 
            	

            }


            }

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3058:2: ( ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==28||LA35_0==38) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3059:1: ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3059:1: ( (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3060:1: (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3060:1: (lv_elementAccessors_1_1= ruleArrayIndexExpression | lv_elementAccessors_1_2= ruleAttributeAccessorExpression )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==38) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==28) ) {
            	        alt34=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3061:3: lv_elementAccessors_1_1= ruleArrayIndexExpression
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsArrayIndexExpressionParserRuleCall_1_0_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleArrayIndexExpression_in_ruleTypedNamedElementExpression6827);
            	            lv_elementAccessors_1_1=ruleArrayIndexExpression();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getTypedNamedElementExpressionRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"elementAccessors",
            	                    		lv_elementAccessors_1_1, 
            	                    		"ArrayIndexExpression");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3076:8: lv_elementAccessors_1_2= ruleAttributeAccessorExpression
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAttributeAccessorExpressionParserRuleCall_1_0_1()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleAttributeAccessorExpression_in_ruleTypedNamedElementExpression6846);
            	            lv_elementAccessors_1_2=ruleAttributeAccessorExpression();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getTypedNamedElementExpressionRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"elementAccessors",
            	                    		lv_elementAccessors_1_2, 
            	                    		"AttributeAccessorExpression");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3102:1: entryRuleArrayIndexExpression returns [EObject current=null] : iv_ruleArrayIndexExpression= ruleArrayIndexExpression EOF ;
    public final EObject entryRuleArrayIndexExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayIndexExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3103:2: (iv_ruleArrayIndexExpression= ruleArrayIndexExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3104:2: iv_ruleArrayIndexExpression= ruleArrayIndexExpression EOF
            {
             newCompositeNode(grammarAccess.getArrayIndexExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArrayIndexExpression_in_entryRuleArrayIndexExpression6886);
            iv_ruleArrayIndexExpression=ruleArrayIndexExpression();

            state._fsp--;

             current =iv_ruleArrayIndexExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArrayIndexExpression6896); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3111:1: ruleArrayIndexExpression returns [EObject current=null] : (otherlv_0= '[' ( (lv_index_1_0= ruleArithmeticExpression ) ) otherlv_2= ']' ) ;
    public final EObject ruleArrayIndexExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_index_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3114:28: ( (otherlv_0= '[' ( (lv_index_1_0= ruleArithmeticExpression ) ) otherlv_2= ']' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3115:1: (otherlv_0= '[' ( (lv_index_1_0= ruleArithmeticExpression ) ) otherlv_2= ']' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3115:1: (otherlv_0= '[' ( (lv_index_1_0= ruleArithmeticExpression ) ) otherlv_2= ']' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3115:3: otherlv_0= '[' ( (lv_index_1_0= ruleArithmeticExpression ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleArrayIndexExpression6933); 

                	newLeafNode(otherlv_0, grammarAccess.getArrayIndexExpressionAccess().getLeftSquareBracketKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3119:1: ( (lv_index_1_0= ruleArithmeticExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3120:1: (lv_index_1_0= ruleArithmeticExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3120:1: (lv_index_1_0= ruleArithmeticExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3121:3: lv_index_1_0= ruleArithmeticExpression
            {
             
            	        newCompositeNode(grammarAccess.getArrayIndexExpressionAccess().getIndexArithmeticExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_ruleArrayIndexExpression6954);
            lv_index_1_0=ruleArithmeticExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArrayIndexExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"index",
                    		lv_index_1_0, 
                    		"ArithmeticExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleArrayIndexExpression6966); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3149:1: entryRuleAttributeAccessorExpression returns [EObject current=null] : iv_ruleAttributeAccessorExpression= ruleAttributeAccessorExpression EOF ;
    public final EObject entryRuleAttributeAccessorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeAccessorExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3150:2: (iv_ruleAttributeAccessorExpression= ruleAttributeAccessorExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3151:2: iv_ruleAttributeAccessorExpression= ruleAttributeAccessorExpression EOF
            {
             newCompositeNode(grammarAccess.getAttributeAccessorExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeAccessorExpression_in_entryRuleAttributeAccessorExpression7002);
            iv_ruleAttributeAccessorExpression=ruleAttributeAccessorExpression();

            state._fsp--;

             current =iv_ruleAttributeAccessorExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeAccessorExpression7012); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3158:1: ruleAttributeAccessorExpression returns [EObject current=null] : (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAttributeAccessorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3161:28: ( (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3162:1: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3162:1: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3162:3: otherlv_0= '.' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAttributeAccessorExpression7049); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccessorExpressionAccess().getFullStopKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3166:1: ( (otherlv_1= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3167:1: (otherlv_1= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3167:1: (otherlv_1= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3168:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeAccessorExpressionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttributeAccessorExpression7069); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3187:1: entryRuleNoAttributeSelectorExpression returns [EObject current=null] : iv_ruleNoAttributeSelectorExpression= ruleNoAttributeSelectorExpression EOF ;
    public final EObject entryRuleNoAttributeSelectorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoAttributeSelectorExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3188:2: (iv_ruleNoAttributeSelectorExpression= ruleNoAttributeSelectorExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3189:2: iv_ruleNoAttributeSelectorExpression= ruleNoAttributeSelectorExpression EOF
            {
             newCompositeNode(grammarAccess.getNoAttributeSelectorExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoAttributeSelectorExpression_in_entryRuleNoAttributeSelectorExpression7105);
            iv_ruleNoAttributeSelectorExpression=ruleNoAttributeSelectorExpression();

            state._fsp--;

             current =iv_ruleNoAttributeSelectorExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoAttributeSelectorExpression7115); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3196:1: ruleNoAttributeSelectorExpression returns [EObject current=null] : ( (lv_position_0_0= rulePositionSelectorExpression ) ) ;
    public final EObject ruleNoAttributeSelectorExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_position_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3199:28: ( ( (lv_position_0_0= rulePositionSelectorExpression ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3200:1: ( (lv_position_0_0= rulePositionSelectorExpression ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3200:1: ( (lv_position_0_0= rulePositionSelectorExpression ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3201:1: (lv_position_0_0= rulePositionSelectorExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3201:1: (lv_position_0_0= rulePositionSelectorExpression )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3202:3: lv_position_0_0= rulePositionSelectorExpression
            {
             
            	        newCompositeNode(grammarAccess.getNoAttributeSelectorExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePositionSelectorExpression_in_ruleNoAttributeSelectorExpression7160);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3226:1: entryRulePositionSelectorExpression returns [EObject current=null] : iv_rulePositionSelectorExpression= rulePositionSelectorExpression EOF ;
    public final EObject entryRulePositionSelectorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionSelectorExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3227:2: (iv_rulePositionSelectorExpression= rulePositionSelectorExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3228:2: iv_rulePositionSelectorExpression= rulePositionSelectorExpression EOF
            {
             newCompositeNode(grammarAccess.getPositionSelectorExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePositionSelectorExpression_in_entryRulePositionSelectorExpression7195);
            iv_rulePositionSelectorExpression=rulePositionSelectorExpression();

            state._fsp--;

             current =iv_rulePositionSelectorExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePositionSelectorExpression7205); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3235:1: rulePositionSelectorExpression returns [EObject current=null] : ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? ) ;
    public final EObject rulePositionSelectorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_kind_0_0 = null;

        EObject lv_successor_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3238:28: ( ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3239:1: ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3239:1: ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3239:2: ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )?
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3239:2: ( (lv_kind_0_0= rulePositionSelectorKind ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3240:1: (lv_kind_0_0= rulePositionSelectorKind )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3240:1: (lv_kind_0_0= rulePositionSelectorKind )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3241:3: lv_kind_0_0= rulePositionSelectorKind
            {
             
            	        newCompositeNode(grammarAccess.getPositionSelectorExpressionAccess().getKindPositionSelectorKindEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePositionSelectorKind_in_rulePositionSelectorExpression7251);
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

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3257:2: (otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3257:4: otherlv_1= '->' ( (lv_successor_2_0= rulePositionSelectorExpression ) )
                    {
                    otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_rulePositionSelectorExpression7264); 

                        	newLeafNode(otherlv_1, grammarAccess.getPositionSelectorExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
                        
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3261:1: ( (lv_successor_2_0= rulePositionSelectorExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3262:1: (lv_successor_2_0= rulePositionSelectorExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3262:1: (lv_successor_2_0= rulePositionSelectorExpression )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3263:3: lv_successor_2_0= rulePositionSelectorExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPositionSelectorExpressionAccess().getSuccessorPositionSelectorExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositionSelectorExpression_in_rulePositionSelectorExpression7285);
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3287:1: entryRuleOperationCall returns [EObject current=null] : iv_ruleOperationCall= ruleOperationCall EOF ;
    public final EObject entryRuleOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCall = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3288:2: (iv_ruleOperationCall= ruleOperationCall EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3289:2: iv_ruleOperationCall= ruleOperationCall EOF
            {
             newCompositeNode(grammarAccess.getOperationCallRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperationCall_in_entryRuleOperationCall7323);
            iv_ruleOperationCall=ruleOperationCall();

            state._fsp--;

             current =iv_ruleOperationCall; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperationCall7333); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3296:1: ruleOperationCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3299:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3300:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3300:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3300:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')'
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3300:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3301:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3301:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3302:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOperationCall7378); 

            		newLeafNode(otherlv_0, grammarAccess.getOperationCallAccess().getOperationOperationCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleOperationCall7390); 

                	newLeafNode(otherlv_1, grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3317:1: ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3317:2: ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )*
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3317:2: ( (lv_parameterBinding_2_0= ruleParamaterBinding ) )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3318:1: (lv_parameterBinding_2_0= ruleParamaterBinding )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3318:1: (lv_parameterBinding_2_0= ruleParamaterBinding )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3319:3: lv_parameterBinding_2_0= ruleParamaterBinding
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParamaterBinding_in_ruleOperationCall7412);
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

                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3335:2: (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==15) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3335:4: otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOperationCall7425); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getOperationCallAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3339:1: ( (lv_parameterBinding_4_0= ruleParamaterBinding ) )
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3340:1: (lv_parameterBinding_4_0= ruleParamaterBinding )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3340:1: (lv_parameterBinding_4_0= ruleParamaterBinding )
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3341:3: lv_parameterBinding_4_0= ruleParamaterBinding
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParamaterBinding_in_ruleOperationCall7446);
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
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleOperationCall7462); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3369:1: entryRuleTriggerMessageExpression returns [EObject current=null] : iv_ruleTriggerMessageExpression= ruleTriggerMessageExpression EOF ;
    public final EObject entryRuleTriggerMessageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerMessageExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3370:2: (iv_ruleTriggerMessageExpression= ruleTriggerMessageExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3371:2: iv_ruleTriggerMessageExpression= ruleTriggerMessageExpression EOF
            {
             newCompositeNode(grammarAccess.getTriggerMessageExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTriggerMessageExpression_in_entryRuleTriggerMessageExpression7498);
            iv_ruleTriggerMessageExpression=ruleTriggerMessageExpression();

            state._fsp--;

             current =iv_ruleTriggerMessageExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTriggerMessageExpression7508); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3378:1: ruleTriggerMessageExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTriggerMessageExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3381:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3382:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3382:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3382:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3382:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3383:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3383:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3384:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTriggerMessageExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTriggerMessageExpression7553); 

            		newLeafNode(otherlv_0, grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeMessageTypeCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleTriggerMessageExpression7565); 

                	newLeafNode(otherlv_1, grammarAccess.getTriggerMessageExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3399:1: ( (otherlv_2= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3400:1: (otherlv_2= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3400:1: (otherlv_2= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3401:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTriggerMessageExpressionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTriggerMessageExpression7585); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3420:1: entryRuleDATATYPE returns [String current=null] : iv_ruleDATATYPE= ruleDATATYPE EOF ;
    public final String entryRuleDATATYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATATYPE = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3421:2: (iv_ruleDATATYPE= ruleDATATYPE EOF )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3422:2: iv_ruleDATATYPE= ruleDATATYPE EOF
            {
             newCompositeNode(grammarAccess.getDATATYPERule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDATATYPE_in_entryRuleDATATYPE7622);
            iv_ruleDATATYPE=ruleDATATYPE();

            state._fsp--;

             current =iv_ruleDATATYPE.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDATATYPE7633); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3429:1: ruleDATATYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )* ) ;
    public final AntlrDatatypeRuleToken ruleDATATYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3432:28: ( (this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )* ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3433:1: (this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )* )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3433:1: (this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )* )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3433:6: this_ID_0= RULE_ID (kw= '[' this_INT_2= RULE_INT kw= ']' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDATATYPE7673); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getDATATYPEAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3440:1: (kw= '[' this_INT_2= RULE_INT kw= ']' )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==38) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3441:2: kw= '[' this_INT_2= RULE_INT kw= ']'
            	    {
            	    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDATATYPE7692); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDATATYPEAccess().getLeftSquareBracketKeyword_1_0()); 
            	        
            	    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDATATYPE7707); 

            	    		current.merge(this_INT_2);
            	        
            	     
            	        newLeafNode(this_INT_2, grammarAccess.getDATATYPEAccess().getINTTerminalRuleCall_1_1()); 
            	        
            	    kw=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDATATYPE7725); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDATATYPEAccess().getRightSquareBracketKeyword_1_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3467:1: ruleUnaryPostIncrementDecrementOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleUnaryPostIncrementDecrementOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3469:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3470:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3470:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==45) ) {
                alt40=1;
            }
            else if ( (LA40_0==46) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3470:2: (enumLiteral_0= '++' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3470:2: (enumLiteral_0= '++' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3470:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleUnaryPostIncrementDecrementOperator7781); 

                            current = grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3476:6: (enumLiteral_1= '--' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3476:6: (enumLiteral_1= '--' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3476:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleUnaryPostIncrementDecrementOperator7798); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3486:1: ruleIncrementDecrementOperatorExpression returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleIncrementDecrementOperatorExpression() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3488:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3489:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3489:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==45) ) {
                alt41=1;
            }
            else if ( (LA41_0==46) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3489:2: (enumLiteral_0= '++' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3489:2: (enumLiteral_0= '++' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3489:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleIncrementDecrementOperatorExpression7843); 

                            current = grammarAccess.getIncrementDecrementOperatorExpressionAccess().getINCREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getIncrementDecrementOperatorExpressionAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3495:6: (enumLiteral_1= '--' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3495:6: (enumLiteral_1= '--' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3495:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleIncrementDecrementOperatorExpression7860); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3505:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3507:28: ( ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3508:1: ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3508:1: ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt42=1;
                }
                break;
            case 47:
                {
                alt42=2;
                }
                break;
            case 48:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3508:2: (enumLiteral_0= ':=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3508:2: (enumLiteral_0= ':=' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3508:4: enumLiteral_0= ':='
                    {
                    enumLiteral_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAssignOperator7905); 

                            current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3514:6: (enumLiteral_1= '+=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3514:6: (enumLiteral_1= '+=' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3514:8: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAssignOperator7922); 

                            current = grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3520:6: (enumLiteral_2= '-=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3520:6: (enumLiteral_2= '-=' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3520:8: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleAssignOperator7939); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3530:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3532:28: ( (enumLiteral_0= '||' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3533:1: (enumLiteral_0= '||' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3533:1: (enumLiteral_0= '||' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3533:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleLogicalOrOperator7983); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3543:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3545:28: ( (enumLiteral_0= '&&' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3546:1: (enumLiteral_0= '&&' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3546:1: (enumLiteral_0= '&&' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3546:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleLogicalAndOperator8026); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3556:1: ruleComparingEQNEQOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleComparingEQNEQOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3558:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3559:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3559:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            else if ( (LA43_0==52) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3559:2: (enumLiteral_0= '==' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3559:2: (enumLiteral_0= '==' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3559:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleComparingEQNEQOperator8070); 

                            current = grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3565:6: (enumLiteral_1= '<>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3565:6: (enumLiteral_1= '<>' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3565:8: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleComparingEQNEQOperator8087); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3575:1: ruleComparingRelOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) ;
    public final Enumerator ruleComparingRelOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3577:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3578:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3578:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt44=1;
                }
                break;
            case 53:
                {
                alt44=2;
                }
                break;
            case 54:
                {
                alt44=3;
                }
                break;
            case 42:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3578:2: (enumLiteral_0= '<' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3578:2: (enumLiteral_0= '<' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3578:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleComparingRelOperator8132); 

                            current = grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3584:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3584:6: (enumLiteral_1= '<=' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3584:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleComparingRelOperator8149); 

                            current = grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3590:6: (enumLiteral_2= '>=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3590:6: (enumLiteral_2= '>=' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3590:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleComparingRelOperator8166); 

                            current = grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3596:6: (enumLiteral_3= '>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3596:6: (enumLiteral_3= '>' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3596:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleComparingRelOperator8183); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3606:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3608:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3609:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3609:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==55) ) {
                alt45=1;
            }
            else if ( (LA45_0==56) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3609:2: (enumLiteral_0= '+' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3609:2: (enumLiteral_0= '+' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3609:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleAdditionOperator8228); 

                            current = grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3615:6: (enumLiteral_1= '-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3615:6: (enumLiteral_1= '-' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3615:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleAdditionOperator8245); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3625:1: ruleMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3627:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3628:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3628:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt46=1;
                }
                break;
            case 58:
                {
                alt46=2;
                }
                break;
            case 59:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3628:2: (enumLiteral_0= '*' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3628:2: (enumLiteral_0= '*' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3628:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleMultiplicationOperator8290); 

                            current = grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3634:6: (enumLiteral_1= '/' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3634:6: (enumLiteral_1= '/' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3634:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleMultiplicationOperator8307); 

                            current = grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3640:6: (enumLiteral_2= '%' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3640:6: (enumLiteral_2= '%' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3640:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleMultiplicationOperator8324); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3650:1: ruleUnaryPreOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleUnaryPreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3652:28: ( ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3653:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3653:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==60) ) {
                alt47=1;
            }
            else if ( (LA47_0==56) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3653:2: (enumLiteral_0= 'not' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3653:2: (enumLiteral_0= 'not' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3653:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleUnaryPreOperator8369); 

                            current = grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3659:6: (enumLiteral_1= '-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3659:6: (enumLiteral_1= '-' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3659:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleUnaryPreOperator8386); 

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
    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3669:1: rulePositionSelectorKind returns [Enumerator current=null] : ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) ) ;
    public final Enumerator rulePositionSelectorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3671:28: ( ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3672:1: ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3672:1: ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) )
            int alt48=5;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt48=1;
                }
                break;
            case 62:
                {
                alt48=2;
                }
                break;
            case 63:
                {
                alt48=3;
                }
                break;
            case 64:
                {
                alt48=4;
                }
                break;
            case 65:
                {
                alt48=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3672:2: (enumLiteral_0= 'self' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3672:2: (enumLiteral_0= 'self' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3672:4: enumLiteral_0= 'self'
                    {
                    enumLiteral_0=(Token)match(input,61,FollowSets000.FOLLOW_61_in_rulePositionSelectorKind8431); 

                            current = grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3678:6: (enumLiteral_1= 'first' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3678:6: (enumLiteral_1= 'first' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3678:8: enumLiteral_1= 'first'
                    {
                    enumLiteral_1=(Token)match(input,62,FollowSets000.FOLLOW_62_in_rulePositionSelectorKind8448); 

                            current = grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3684:6: (enumLiteral_2= 'last' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3684:6: (enumLiteral_2= 'last' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3684:8: enumLiteral_2= 'last'
                    {
                    enumLiteral_2=(Token)match(input,63,FollowSets000.FOLLOW_63_in_rulePositionSelectorKind8465); 

                            current = grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3690:6: (enumLiteral_3= 'prev' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3690:6: (enumLiteral_3= 'prev' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3690:8: enumLiteral_3= 'prev'
                    {
                    enumLiteral_3=(Token)match(input,64,FollowSets000.FOLLOW_64_in_rulePositionSelectorKind8482); 

                            current = grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3696:6: (enumLiteral_4= 'next' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3696:6: (enumLiteral_4= 'next' )
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/parser/antlr/internal/InternalAPIMappingLanguage.g:3696:8: enumLiteral_4= 'next'
                    {
                    enumLiteral_4=(Token)match(input,65,FollowSets000.FOLLOW_65_in_rulePositionSelectorKind8499); 

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
        "\1\50\1\60\7\uffff\1\101\2\uffff\1\73\1\60";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\uffff\1\1\1\10\2\uffff";
    static final String DFA10_specialS =
        "\16\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\21\uffff\1\10\5\uffff\1\2\1\uffff\1\3\1\4\1\uffff\1\5"+
            "\2\uffff\1\6\2\uffff\1\7",
            "\1\7\22\uffff\1\13\1\uffff\1\12\1\uffff\1\12\11\uffff\1\11"+
            "\6\uffff\4\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\14\2\12\17\uffff\1\12\22\uffff\1\12\14\uffff\1\12"+
            "\3\uffff\6\12",
            "",
            "",
            "\1\15\17\uffff\5\12",
            "\1\7\24\uffff\1\12\1\uffff\1\12\11\uffff\1\11\6\uffff\4\12"
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
        "\21\uffff";
    static final String DFA19_eofS =
        "\2\uffff\1\3\4\uffff\1\3\1\uffff\1\3\5\uffff\1\20\1\uffff";
    static final String DFA19_minS =
        "\1\5\1\uffff\1\17\1\uffff\2\5\1\30\1\17\3\5\1\47\1\uffff\1\17\1"+
        "\31\1\5\1\uffff";
    static final String DFA19_maxS =
        "\1\101\1\uffff\1\73\1\uffff\2\101\2\73\3\101\1\73\1\uffff\2\73"+
        "\1\101\1\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\10\uffff\1\4\3\uffff\1\2";
    static final String DFA19_specialS =
        "\21\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\3\3\16\uffff\1\3\1\4\15\uffff\1\1\4\uffff\1\3\14\uffff"+
            "\1\3\3\uffff\6\3",
            "",
            "\1\3\10\uffff\1\3\3\uffff\1\3\1\uffff\1\3\7\uffff\2\3\1\uffff"+
            "\1\5\1\3\1\uffff\3\3\2\uffff\13\3",
            "",
            "\1\6\3\3\16\uffff\2\3\22\uffff\1\3\14\uffff\1\3\3\uffff\6"+
            "\3",
            "\1\3\1\7\2\3\17\uffff\1\3\22\uffff\1\3\14\uffff\1\3\3\uffff"+
            "\6\3",
            "\1\3\1\11\2\uffff\1\3\11\uffff\1\10\2\uffff\2\3\1\uffff\3"+
            "\3\2\uffff\13\3",
            "\1\12\16\uffff\1\3\10\uffff\1\3\11\uffff\4\3\2\uffff\5\3",
            "\1\3\1\13\2\3\17\uffff\1\3\22\uffff\1\3\14\uffff\1\3\3\uffff"+
            "\6\3",
            "\4\14\6\uffff\1\3\10\uffff\1\14\5\uffff\1\3\10\uffff\1\3\1"+
            "\uffff\2\3\1\14\5\uffff\13\3\1\uffff\5\14",
            "\1\3\1\15\2\3\16\uffff\2\3\15\uffff\1\3\4\uffff\1\3\14\uffff"+
            "\1\3\3\uffff\6\3",
            "\1\16\17\uffff\5\3",
            "",
            "\1\3\27\uffff\1\3\1\uffff\1\3\1\17\6\uffff\13\3",
            "\1\11\2\uffff\1\3\11\uffff\1\10\2\uffff\2\3\1\uffff\3\3\2"+
            "\uffff\13\3",
            "\4\3\6\uffff\1\20\10\uffff\1\3\5\uffff\1\20\10\uffff\1\20"+
            "\3\uffff\1\3\14\uffff\1\3\3\uffff\6\3",
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
            return "1617:1: (this_ArrayInitializeExpression_0= ruleArrayInitializeExpression | this_NondeterministicChoiceExpression_1= ruleNondeterministicChoiceExpression | this_Expression_2= ruleExpression | this_TypeCastExpression_3= ruleTypeCastExpression )";
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
        public static final BitSet FOLLOW_20_in_rulePortApiMapping520 = new BitSet(new long[]{0xF1000840018041E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleEntry_in_rulePortApiMapping541 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_21_in_rulePortApiMapping554 = new BitSet(new long[]{0xF1000840018041E0L,0x0000000000000003L});
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
        public static final BitSet FOLLOW_26_in_ruleParamaterBinding1110 = new BitSet(new long[]{0xF100080009C001E0L,0x0000000000000003L});
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
        public static final BitSet FOLLOW_ruleAssignment_in_ruleForLoop2250 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleForLoop2271 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleForLoop2283 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleForLoopCountingExpression_in_ruleForLoop2304 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleForLoop2316 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleForLoop2337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoopCountingExpression_in_entryRuleForLoopCountingExpression2373 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForLoopCountingExpression2383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedNamedElementExpression_in_ruleForLoopCountingExpression2429 = new BitSet(new long[]{0x0001E00004000000L});
        public static final BitSet FOLLOW_ruleUnaryPostIncrementDecrementOperator_in_ruleForLoopCountingExpression2451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignOperator_in_ruleForLoopCountingExpression2479 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleForLoopCountingExpression2500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhileLoop_in_entryRuleWhileLoop2538 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWhileLoop2548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleWhileLoop2585 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleWhileLoop2597 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleWhileLoop2618 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleWhileLoop2630 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleWhileLoop2651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoWhileLoop_in_entryRuleDoWhileLoop2687 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoWhileLoop2697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleDoWhileLoop2734 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleDoWhileLoop2755 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleDoWhileLoop2767 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleDoWhileLoop2779 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleDoWhileLoop2800 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleDoWhileLoop2812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement2848 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement2858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleIfStatement2895 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleIfStatement2907 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement2928 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleIfStatement2940 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement2961 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_35_in_ruleIfStatement2974 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleIfStatement2986 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement3007 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleIfStatement3019 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement3040 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_36_in_ruleIfStatement3055 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement3076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement3114 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement3124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleReturnStatement3170 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStatement3191 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleReturnStatement3203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationCallStatement_in_entryRuleOperationCallStatement3239 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperationCallStatement3249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationCall_in_ruleOperationCallStatement3296 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleOperationCallStatement3307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3343 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedNamedElementExpression_in_ruleAssignment3399 = new BitSet(new long[]{0x0001E00004000000L});
        public static final BitSet FOLLOW_ruleAssignOperator_in_ruleAssignment3422 = new BitSet(new long[]{0xF1000840018041E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleInitializeExpression_in_ruleAssignment3443 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleUnaryPostIncrementDecrementOperator_in_ruleAssignment3471 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleAssignment3484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitializeExpression_in_entryRuleInitializeExpression3520 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitializeExpression3530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayInitializeExpression_in_ruleInitializeExpression3577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNondeterministicChoiceExpression_in_ruleInitializeExpression3604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleInitializeExpression3631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeCastExpression_in_ruleInitializeExpression3658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayInitializeExpression_in_entryRuleArrayInitializeExpression3693 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArrayInitializeExpression3703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleArrayInitializeExpression3740 = new BitSet(new long[]{0xF1000840018041E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleInitializeExpression_in_ruleArrayInitializeExpression3761 = new BitSet(new long[]{0x0000008000008000L});
        public static final BitSet FOLLOW_15_in_ruleArrayInitializeExpression3774 = new BitSet(new long[]{0xF1000840018041E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleInitializeExpression_in_ruleArrayInitializeExpression3795 = new BitSet(new long[]{0x0000008000008000L});
        public static final BitSet FOLLOW_39_in_ruleArrayInitializeExpression3809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalVariableOrConstantDeclarationStatement_in_entryRuleLocalVariableOrConstantDeclarationStatement3845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalVariableOrConstantDeclarationStatement3855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalVariableDeclaration_in_ruleLocalVariableOrConstantDeclarationStatement3902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalConstantDeclaration_in_ruleLocalVariableOrConstantDeclarationStatement3921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalVariableDeclaration_in_entryRuleLocalVariableDeclaration3959 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalVariableDeclaration3969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDATATYPE_in_ruleLocalVariableDeclaration4017 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVariableDeclaration4034 = new BitSet(new long[]{0x0000000044000000L});
        public static final BitSet FOLLOW_26_in_ruleLocalVariableDeclaration4052 = new BitSet(new long[]{0xF1000840018041E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleInitializeExpression_in_ruleLocalVariableDeclaration4073 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleLocalVariableDeclaration4087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalConstantDeclaration_in_entryRuleLocalConstantDeclaration4123 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalConstantDeclaration4133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleLocalConstantDeclaration4176 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleDATATYPE_in_ruleLocalConstantDeclaration4212 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLocalConstantDeclaration4229 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleLocalConstantDeclaration4246 = new BitSet(new long[]{0xF1000840018041E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleInitializeExpression_in_ruleLocalConstantDeclaration4267 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleLocalConstantDeclaration4279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNondeterministicChoiceExpression_in_entryRuleNondeterministicChoiceExpression4315 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNondeterministicChoiceExpression4325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNondeterministicChoiceExpression4370 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleRange_in_ruleNondeterministicChoiceExpression4391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRange_in_entryRuleRange4427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRange4437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleRange4474 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleLONG_in_ruleRange4495 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRange4507 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleLONG_in_ruleRange4528 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleRange4540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLONG_in_entryRuleLONG4577 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLONG4588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLONG4627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalExpression_in_entryRuleLogicalExpression4671 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalExpression4681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleLogicalExpression4727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression4761 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression4771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression4818 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression4848 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression4869 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression4907 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression4917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleLogicalAndExpression4964 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression4994 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleLogicalAndExpression5015 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression5053 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression5063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonHigherOpExpression_in_ruleComparisonExpression5110 = new BitSet(new long[]{0x0018000000000002L});
        public static final BitSet FOLLOW_ruleComparingEQNEQOperator_in_ruleComparisonExpression5140 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleComparisonHigherOpExpression_in_ruleComparisonExpression5161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonHigherOpExpression_in_entryRuleComparisonHigherOpExpression5199 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonHigherOpExpression5209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleComparisonHigherOpExpression5256 = new BitSet(new long[]{0x0060060000000002L});
        public static final BitSet FOLLOW_ruleComparingRelOperator_in_ruleComparisonHigherOpExpression5286 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleComparisonHigherOpExpression5307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression5345 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression5355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleArithmeticExpression5401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression5435 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression5445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression5492 = new BitSet(new long[]{0x0180000000000002L});
        public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression5522 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression5543 = new BitSet(new long[]{0x0180000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression5581 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression5591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryPreExpression_in_ruleMultiplicationExpression5638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_ruleMultiplicationExpression5666 = new BitSet(new long[]{0x0E00000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression5696 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleUnaryPreExpression_in_ruleMultiplicationExpression5719 = new BitSet(new long[]{0x0E00000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_ruleMultiplicationExpression5738 = new BitSet(new long[]{0x0E00000000000002L});
        public static final BitSet FOLLOW_ruleUnaryPreExpression_in_entryRuleUnaryPreExpression5780 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryPreExpression5790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryPreOperator_in_ruleUnaryPreExpression5845 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleOperand_in_ruleUnaryPreExpression5866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeCastExpression_in_entryRuleTypeCastExpression5902 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeCastExpression5912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleTypeCastExpression5958 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleDATATYPE_in_ruleTypeCastExpression5981 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleTypeCastExpression5993 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleOperand_in_ruleTypeCastExpression6014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_entryRuleOperand6050 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperand6060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleOperand6098 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleOperand6120 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleOperand6131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleOperand6160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedTypedNamedElementExpression_in_ruleOperand6187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationCall_in_ruleOperand6214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTriggerMessageExpression_in_ruleOperand6241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoAttributeSelectorExpression_in_ruleOperand6268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression6303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpression6313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_ruleLiteralExpression6368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral6405 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral6416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NUMBER_in_ruleLiteral6456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleLiteral6482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLiteral6508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleLiteral6532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedTypedNamedElementExpression_in_entryRuleExtendedTypedNamedElementExpression6572 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedTypedNamedElementExpression6582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedNamedElementExpression_in_ruleExtendedTypedNamedElementExpression6629 = new BitSet(new long[]{0x0000700000000002L});
        public static final BitSet FOLLOW_44_in_ruleExtendedTypedNamedElementExpression6651 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_rulePositionSelectorExpression_in_ruleExtendedTypedNamedElementExpression6672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIncrementDecrementOperatorExpression_in_ruleExtendedTypedNamedElementExpression6710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedNamedElementExpression_in_entryRuleTypedNamedElementExpression6749 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedNamedElementExpression6759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypedNamedElementExpression6804 = new BitSet(new long[]{0x0000004010000002L});
        public static final BitSet FOLLOW_ruleArrayIndexExpression_in_ruleTypedNamedElementExpression6827 = new BitSet(new long[]{0x0000004010000002L});
        public static final BitSet FOLLOW_ruleAttributeAccessorExpression_in_ruleTypedNamedElementExpression6846 = new BitSet(new long[]{0x0000004010000002L});
        public static final BitSet FOLLOW_ruleArrayIndexExpression_in_entryRuleArrayIndexExpression6886 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArrayIndexExpression6896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleArrayIndexExpression6933 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleArrayIndexExpression6954 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleArrayIndexExpression6966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeAccessorExpression_in_entryRuleAttributeAccessorExpression7002 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeAccessorExpression7012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleAttributeAccessorExpression7049 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeAccessorExpression7069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoAttributeSelectorExpression_in_entryRuleNoAttributeSelectorExpression7105 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoAttributeSelectorExpression7115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositionSelectorExpression_in_ruleNoAttributeSelectorExpression7160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositionSelectorExpression_in_entryRulePositionSelectorExpression7195 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePositionSelectorExpression7205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositionSelectorKind_in_rulePositionSelectorExpression7251 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_44_in_rulePositionSelectorExpression7264 = new BitSet(new long[]{0xF1000800018001E0L,0x0000000000000003L});
        public static final BitSet FOLLOW_rulePositionSelectorExpression_in_rulePositionSelectorExpression7285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationCall_in_entryRuleOperationCall7323 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperationCall7333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOperationCall7378 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleOperationCall7390 = new BitSet(new long[]{0x0000000002000020L});
        public static final BitSet FOLLOW_ruleParamaterBinding_in_ruleOperationCall7412 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_15_in_ruleOperationCall7425 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleParamaterBinding_in_ruleOperationCall7446 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleOperationCall7462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTriggerMessageExpression_in_entryRuleTriggerMessageExpression7498 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTriggerMessageExpression7508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTriggerMessageExpression7553 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleTriggerMessageExpression7565 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTriggerMessageExpression7585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDATATYPE_in_entryRuleDATATYPE7622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDATATYPE7633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDATATYPE7673 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_38_in_ruleDATATYPE7692 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDATATYPE7707 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleDATATYPE7725 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_45_in_ruleUnaryPostIncrementDecrementOperator7781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleUnaryPostIncrementDecrementOperator7798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleIncrementDecrementOperatorExpression7843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleIncrementDecrementOperatorExpression7860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleAssignOperator7905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleAssignOperator7922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleAssignOperator7939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleLogicalOrOperator7983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleLogicalAndOperator8026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleComparingEQNEQOperator8070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleComparingEQNEQOperator8087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleComparingRelOperator8132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleComparingRelOperator8149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleComparingRelOperator8166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleComparingRelOperator8183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleAdditionOperator8228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleAdditionOperator8245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleMultiplicationOperator8290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleMultiplicationOperator8307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleMultiplicationOperator8324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleUnaryPreOperator8369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleUnaryPreOperator8386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rulePositionSelectorKind8431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rulePositionSelectorKind8448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rulePositionSelectorKind8465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rulePositionSelectorKind8482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rulePositionSelectorKind8499 = new BitSet(new long[]{0x0000000000000002L});
    }


}