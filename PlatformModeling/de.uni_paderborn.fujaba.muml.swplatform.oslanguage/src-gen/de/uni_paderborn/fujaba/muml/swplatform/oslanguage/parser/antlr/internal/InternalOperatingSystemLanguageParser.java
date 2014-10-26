package de.uni_paderborn.fujaba.muml.swplatform.oslanguage.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.uni_paderborn.fujaba.muml.swplatform.oslanguage.services.OperatingSystemLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOperatingSystemLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OperatingSystem:'", "'{'", "'}'", "'import'", "'Device_API_Calls:'", "'enum:'", "','", "'('", "')'", "';'", "'['", "']'", "'days'", "'hours'", "'min'", "'sec'", "'ms'", "'\\u00B5s'", "'ns'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalOperatingSystemLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOperatingSystemLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOperatingSystemLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g"; }



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



    // $ANTLR start "entryRuleOperatingSystem"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:67:1: entryRuleOperatingSystem returns [EObject current=null] : iv_ruleOperatingSystem= ruleOperatingSystem EOF ;
    public final EObject entryRuleOperatingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatingSystem = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:68:2: (iv_ruleOperatingSystem= ruleOperatingSystem EOF )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:69:2: iv_ruleOperatingSystem= ruleOperatingSystem EOF
            {
             newCompositeNode(grammarAccess.getOperatingSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperatingSystem_in_entryRuleOperatingSystem75);
            iv_ruleOperatingSystem=ruleOperatingSystem();

            state._fsp--;

             current =iv_ruleOperatingSystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperatingSystem85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperatingSystem"


    // $ANTLR start "ruleOperatingSystem"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:76:1: ruleOperatingSystem returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'OperatingSystem:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_apirepositories_4_0= ruleAPIRepository ) ) | ( (lv_enumerationDataTypes_5_0= ruleEnumerationDataType ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleOperatingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_apirepositories_4_0 = null;

        EObject lv_enumerationDataTypes_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'OperatingSystem:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_apirepositories_4_0= ruleAPIRepository ) ) | ( (lv_enumerationDataTypes_5_0= ruleEnumerationDataType ) ) )* otherlv_6= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'OperatingSystem:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_apirepositories_4_0= ruleAPIRepository ) ) | ( (lv_enumerationDataTypes_5_0= ruleEnumerationDataType ) ) )* otherlv_6= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'OperatingSystem:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_apirepositories_4_0= ruleAPIRepository ) ) | ( (lv_enumerationDataTypes_5_0= ruleEnumerationDataType ) ) )* otherlv_6= '}' )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:80:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'OperatingSystem:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_apirepositories_4_0= ruleAPIRepository ) ) | ( (lv_enumerationDataTypes_5_0= ruleEnumerationDataType ) ) )* otherlv_6= '}'
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOperatingSystemAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleImport_in_ruleOperatingSystem131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOperatingSystemRule());
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

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleOperatingSystem144); 

                	newLeafNode(otherlv_1, grammarAccess.getOperatingSystemAccess().getOperatingSystemKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:102:1: ( (lv_name_2_0= ruleEString ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:103:1: (lv_name_2_0= ruleEString )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:103:1: (lv_name_2_0= ruleEString )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:104:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOperatingSystemAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOperatingSystem165);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperatingSystemRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOperatingSystem177); 

                	newLeafNode(otherlv_3, grammarAccess.getOperatingSystemAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:124:1: ( ( (lv_apirepositories_4_0= ruleAPIRepository ) ) | ( (lv_enumerationDataTypes_5_0= ruleEnumerationDataType ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }
                else if ( (LA2_0==16) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:124:2: ( (lv_apirepositories_4_0= ruleAPIRepository ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:124:2: ( (lv_apirepositories_4_0= ruleAPIRepository ) )
            	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:125:1: (lv_apirepositories_4_0= ruleAPIRepository )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:125:1: (lv_apirepositories_4_0= ruleAPIRepository )
            	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:126:3: lv_apirepositories_4_0= ruleAPIRepository
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOperatingSystemAccess().getApirepositoriesAPIRepositoryParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAPIRepository_in_ruleOperatingSystem199);
            	    lv_apirepositories_4_0=ruleAPIRepository();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOperatingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"apirepositories",
            	            		lv_apirepositories_4_0, 
            	            		"APIRepository");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:143:6: ( (lv_enumerationDataTypes_5_0= ruleEnumerationDataType ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:143:6: ( (lv_enumerationDataTypes_5_0= ruleEnumerationDataType ) )
            	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:144:1: (lv_enumerationDataTypes_5_0= ruleEnumerationDataType )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:144:1: (lv_enumerationDataTypes_5_0= ruleEnumerationDataType )
            	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:145:3: lv_enumerationDataTypes_5_0= ruleEnumerationDataType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOperatingSystemAccess().getEnumerationDataTypesEnumerationDataTypeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEnumerationDataType_in_ruleOperatingSystem226);
            	    lv_enumerationDataTypes_5_0=ruleEnumerationDataType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOperatingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"enumerationDataTypes",
            	            		lv_enumerationDataTypes_5_0, 
            	            		"EnumerationDataType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleOperatingSystem240); 

                	newLeafNode(otherlv_6, grammarAccess.getOperatingSystemAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleOperatingSystem"


    // $ANTLR start "entryRuleImport"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:173:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:174:2: (iv_ruleImport= ruleImport EOF )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:175:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImport_in_entryRuleImport276);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImport286); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:182:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:185:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:186:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:186:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:186:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleImport323); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:190:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:191:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:191:1: (lv_importURI_1_0= RULE_STRING )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:192:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleImport340); 

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


    // $ANTLR start "entryRuleEString"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:216:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:217:2: (iv_ruleEString= ruleEString EOF )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:218:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString382);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString393); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:225:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:228:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:229:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:229:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:229:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString433); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:237:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString459); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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


    // $ANTLR start "entryRuleAPIRepository"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:252:1: entryRuleAPIRepository returns [EObject current=null] : iv_ruleAPIRepository= ruleAPIRepository EOF ;
    public final EObject entryRuleAPIRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAPIRepository = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:253:2: (iv_ruleAPIRepository= ruleAPIRepository EOF )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:254:2: iv_ruleAPIRepository= ruleAPIRepository EOF
            {
             newCompositeNode(grammarAccess.getAPIRepositoryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAPIRepository_in_entryRuleAPIRepository504);
            iv_ruleAPIRepository=ruleAPIRepository();

            state._fsp--;

             current =iv_ruleAPIRepository; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAPIRepository514); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAPIRepository"


    // $ANTLR start "ruleAPIRepository"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:261:1: ruleAPIRepository returns [EObject current=null] : (otherlv_0= 'Device_API_Calls:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_apiCommands_3_0= ruleAPICommand ) )* otherlv_4= '}' ) ;
    public final EObject ruleAPIRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_apiCommands_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:264:28: ( (otherlv_0= 'Device_API_Calls:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_apiCommands_3_0= ruleAPICommand ) )* otherlv_4= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:265:1: (otherlv_0= 'Device_API_Calls:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_apiCommands_3_0= ruleAPICommand ) )* otherlv_4= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:265:1: (otherlv_0= 'Device_API_Calls:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_apiCommands_3_0= ruleAPICommand ) )* otherlv_4= '}' )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:265:3: otherlv_0= 'Device_API_Calls:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_apiCommands_3_0= ruleAPICommand ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAPIRepository551); 

                	newLeafNode(otherlv_0, grammarAccess.getAPIRepositoryAccess().getDevice_API_CallsKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:269:1: ( (lv_name_1_0= ruleEString ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:270:1: (lv_name_1_0= ruleEString )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:270:1: (lv_name_1_0= ruleEString )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:271:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAPIRepositoryAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAPIRepository572);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAPIRepositoryRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAPIRepository584); 

                	newLeafNode(otherlv_2, grammarAccess.getAPIRepositoryAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:291:1: ( (lv_apiCommands_3_0= ruleAPICommand ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:292:1: (lv_apiCommands_3_0= ruleAPICommand )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:292:1: (lv_apiCommands_3_0= ruleAPICommand )
            	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:293:3: lv_apiCommands_3_0= ruleAPICommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAPIRepositoryAccess().getApiCommandsAPICommandParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAPICommand_in_ruleAPIRepository605);
            	    lv_apiCommands_3_0=ruleAPICommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAPIRepositoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"apiCommands",
            	            		lv_apiCommands_3_0, 
            	            		"APICommand");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAPIRepository618); 

                	newLeafNode(otherlv_4, grammarAccess.getAPIRepositoryAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleAPIRepository"


    // $ANTLR start "entryRuleEnumerationDataType"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:321:1: entryRuleEnumerationDataType returns [EObject current=null] : iv_ruleEnumerationDataType= ruleEnumerationDataType EOF ;
    public final EObject entryRuleEnumerationDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationDataType = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:322:2: (iv_ruleEnumerationDataType= ruleEnumerationDataType EOF )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:323:2: iv_ruleEnumerationDataType= ruleEnumerationDataType EOF
            {
             newCompositeNode(grammarAccess.getEnumerationDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumerationDataType_in_entryRuleEnumerationDataType654);
            iv_ruleEnumerationDataType=ruleEnumerationDataType();

            state._fsp--;

             current =iv_ruleEnumerationDataType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerationDataType664); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationDataType"


    // $ANTLR start "ruleEnumerationDataType"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:330:1: ruleEnumerationDataType returns [EObject current=null] : (otherlv_0= 'enum:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_enumerationValues_3_0= ruleEnumerationValue ) ) (otherlv_4= ',' ( (lv_enumerationValues_5_0= ruleEnumerationValue ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleEnumerationDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_enumerationValues_3_0 = null;

        EObject lv_enumerationValues_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:333:28: ( (otherlv_0= 'enum:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_enumerationValues_3_0= ruleEnumerationValue ) ) (otherlv_4= ',' ( (lv_enumerationValues_5_0= ruleEnumerationValue ) ) )* )? otherlv_6= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:334:1: (otherlv_0= 'enum:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_enumerationValues_3_0= ruleEnumerationValue ) ) (otherlv_4= ',' ( (lv_enumerationValues_5_0= ruleEnumerationValue ) ) )* )? otherlv_6= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:334:1: (otherlv_0= 'enum:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_enumerationValues_3_0= ruleEnumerationValue ) ) (otherlv_4= ',' ( (lv_enumerationValues_5_0= ruleEnumerationValue ) ) )* )? otherlv_6= '}' )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:334:3: otherlv_0= 'enum:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_enumerationValues_3_0= ruleEnumerationValue ) ) (otherlv_4= ',' ( (lv_enumerationValues_5_0= ruleEnumerationValue ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEnumerationDataType701); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerationDataTypeAccess().getEnumKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:338:1: ( (lv_name_1_0= ruleEString ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:339:1: (lv_name_1_0= ruleEString )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:339:1: (lv_name_1_0= ruleEString )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:340:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumerationDataTypeAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumerationDataType722);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumerationDataTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEnumerationDataType734); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumerationDataTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:360:1: ( ( (lv_enumerationValues_3_0= ruleEnumerationValue ) ) (otherlv_4= ',' ( (lv_enumerationValues_5_0= ruleEnumerationValue ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:360:2: ( (lv_enumerationValues_3_0= ruleEnumerationValue ) ) (otherlv_4= ',' ( (lv_enumerationValues_5_0= ruleEnumerationValue ) ) )*
                    {
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:360:2: ( (lv_enumerationValues_3_0= ruleEnumerationValue ) )
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:361:1: (lv_enumerationValues_3_0= ruleEnumerationValue )
                    {
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:361:1: (lv_enumerationValues_3_0= ruleEnumerationValue )
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:362:3: lv_enumerationValues_3_0= ruleEnumerationValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumerationDataTypeAccess().getEnumerationValuesEnumerationValueParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerationValue_in_ruleEnumerationDataType756);
                    lv_enumerationValues_3_0=ruleEnumerationValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumerationDataTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"enumerationValues",
                            		lv_enumerationValues_3_0, 
                            		"EnumerationValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:378:2: (otherlv_4= ',' ( (lv_enumerationValues_5_0= ruleEnumerationValue ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:378:4: otherlv_4= ',' ( (lv_enumerationValues_5_0= ruleEnumerationValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEnumerationDataType769); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getEnumerationDataTypeAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:382:1: ( (lv_enumerationValues_5_0= ruleEnumerationValue ) )
                    	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:383:1: (lv_enumerationValues_5_0= ruleEnumerationValue )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:383:1: (lv_enumerationValues_5_0= ruleEnumerationValue )
                    	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:384:3: lv_enumerationValues_5_0= ruleEnumerationValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEnumerationDataTypeAccess().getEnumerationValuesEnumerationValueParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEnumerationValue_in_ruleEnumerationDataType790);
                    	    lv_enumerationValues_5_0=ruleEnumerationValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEnumerationDataTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"enumerationValues",
                    	            		lv_enumerationValues_5_0, 
                    	            		"EnumerationValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEnumerationDataType806); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumerationDataTypeAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleEnumerationDataType"


    // $ANTLR start "entryRuleAPICommand"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:412:1: entryRuleAPICommand returns [EObject current=null] : iv_ruleAPICommand= ruleAPICommand EOF ;
    public final EObject entryRuleAPICommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAPICommand = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:413:2: (iv_ruleAPICommand= ruleAPICommand EOF )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:414:2: iv_ruleAPICommand= ruleAPICommand EOF
            {
             newCompositeNode(grammarAccess.getAPICommandRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAPICommand_in_entryRuleAPICommand842);
            iv_ruleAPICommand=ruleAPICommand();

            state._fsp--;

             current =iv_ruleAPICommand; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAPICommand852); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAPICommand"


    // $ANTLR start "ruleAPICommand"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:421:1: ruleAPICommand returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_constraints_7_0= ruleTimeConstraint ) )? otherlv_8= ';' ) ;
    public final EObject ruleAPICommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_constraints_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:424:28: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_constraints_7_0= ruleTimeConstraint ) )? otherlv_8= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:425:1: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_constraints_7_0= ruleTimeConstraint ) )? otherlv_8= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:425:1: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_constraints_7_0= ruleTimeConstraint ) )? otherlv_8= ';' )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:425:2: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_constraints_7_0= ruleTimeConstraint ) )? otherlv_8= ';'
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:425:2: ( ( ruleEString ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:426:1: ( ruleEString )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:426:1: ( ruleEString )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:427:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAPICommandRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAPICommandAccess().getReturnDataTypeDataTypeCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAPICommand900);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:440:2: ( (lv_name_1_0= ruleEString ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:441:1: (lv_name_1_0= ruleEString )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:441:1: (lv_name_1_0= ruleEString )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:442:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAPICommandAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAPICommand921);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAPICommandRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAPICommand933); 

                	newLeafNode(otherlv_2, grammarAccess.getAPICommandAccess().getLeftParenthesisKeyword_2());
                
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:462:1: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:462:2: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:462:2: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:463:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:463:1: (lv_parameters_3_0= ruleParameter )
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:464:3: lv_parameters_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAPICommandAccess().getParametersParameterParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleAPICommand955);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAPICommandRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:480:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:480:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAPICommand968); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getAPICommandAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:484:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:485:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:485:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:486:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAPICommandAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleAPICommand989);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAPICommandRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_5_0, 
                    	            		"Parameter");
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

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAPICommand1005); 

                	newLeafNode(otherlv_6, grammarAccess.getAPICommandAccess().getRightParenthesisKeyword_4());
                
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:506:1: ( (lv_constraints_7_0= ruleTimeConstraint ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:507:1: (lv_constraints_7_0= ruleTimeConstraint )
                    {
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:507:1: (lv_constraints_7_0= ruleTimeConstraint )
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:508:3: lv_constraints_7_0= ruleTimeConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getAPICommandAccess().getConstraintsTimeConstraintParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTimeConstraint_in_ruleAPICommand1026);
                    lv_constraints_7_0=ruleTimeConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAPICommandRule());
                    	        }
                           		add(
                           			current, 
                           			"constraints",
                            		lv_constraints_7_0, 
                            		"TimeConstraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAPICommand1039); 

                	newLeafNode(otherlv_8, grammarAccess.getAPICommandAccess().getSemicolonKeyword_6());
                

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
    // $ANTLR end "ruleAPICommand"


    // $ANTLR start "entryRuleParameter"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:536:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:537:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:538:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter1075);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter1085); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:545:1: ruleParameter returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:548:28: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:549:1: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:549:1: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:549:2: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:549:2: ( ( ruleEString ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:550:1: ( ruleEString )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:550:1: ( ruleEString )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:551:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getDataTypeDataTypeCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter1133);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:564:2: ( (lv_name_1_0= ruleEString ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:565:1: (lv_name_1_0= ruleEString )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:565:1: (lv_name_1_0= ruleEString )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:566:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter1154);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEnumerationValue"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:590:1: entryRuleEnumerationValue returns [EObject current=null] : iv_ruleEnumerationValue= ruleEnumerationValue EOF ;
    public final EObject entryRuleEnumerationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationValue = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:591:2: (iv_ruleEnumerationValue= ruleEnumerationValue EOF )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:592:2: iv_ruleEnumerationValue= ruleEnumerationValue EOF
            {
             newCompositeNode(grammarAccess.getEnumerationValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumerationValue_in_entryRuleEnumerationValue1190);
            iv_ruleEnumerationValue=ruleEnumerationValue();

            state._fsp--;

             current =iv_ruleEnumerationValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerationValue1200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationValue"


    // $ANTLR start "ruleEnumerationValue"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:599:1: ruleEnumerationValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleEnumerationValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:602:28: ( ( (lv_value_0_0= ruleEString ) ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:603:1: ( (lv_value_0_0= ruleEString ) )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:603:1: ( (lv_value_0_0= ruleEString ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:604:1: (lv_value_0_0= ruleEString )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:604:1: (lv_value_0_0= ruleEString )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:605:3: lv_value_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumerationValueAccess().getValueEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumerationValue1245);
            lv_value_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumerationValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EString");
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
    // $ANTLR end "ruleEnumerationValue"


    // $ANTLR start "entryRuleTimeConstraint"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:629:1: entryRuleTimeConstraint returns [EObject current=null] : iv_ruleTimeConstraint= ruleTimeConstraint EOF ;
    public final EObject entryRuleTimeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeConstraint = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:630:2: (iv_ruleTimeConstraint= ruleTimeConstraint EOF )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:631:2: iv_ruleTimeConstraint= ruleTimeConstraint EOF
            {
             newCompositeNode(grammarAccess.getTimeConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeConstraint_in_entryRuleTimeConstraint1280);
            iv_ruleTimeConstraint=ruleTimeConstraint();

            state._fsp--;

             current =iv_ruleTimeConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimeConstraint1290); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeConstraint"


    // $ANTLR start "ruleTimeConstraint"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:638:1: ruleTimeConstraint returns [EObject current=null] : (otherlv_0= '[' ( (lv_samplingTime_1_0= ruleTimeValue ) ) otherlv_2= ']' ) ;
    public final EObject ruleTimeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_samplingTime_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:641:28: ( (otherlv_0= '[' ( (lv_samplingTime_1_0= ruleTimeValue ) ) otherlv_2= ']' ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:642:1: (otherlv_0= '[' ( (lv_samplingTime_1_0= ruleTimeValue ) ) otherlv_2= ']' )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:642:1: (otherlv_0= '[' ( (lv_samplingTime_1_0= ruleTimeValue ) ) otherlv_2= ']' )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:642:3: otherlv_0= '[' ( (lv_samplingTime_1_0= ruleTimeValue ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTimeConstraint1327); 

                	newLeafNode(otherlv_0, grammarAccess.getTimeConstraintAccess().getLeftSquareBracketKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:646:1: ( (lv_samplingTime_1_0= ruleTimeValue ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:647:1: (lv_samplingTime_1_0= ruleTimeValue )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:647:1: (lv_samplingTime_1_0= ruleTimeValue )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:648:3: lv_samplingTime_1_0= ruleTimeValue
            {
             
            	        newCompositeNode(grammarAccess.getTimeConstraintAccess().getSamplingTimeTimeValueParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTimeValue_in_ruleTimeConstraint1348);
            lv_samplingTime_1_0=ruleTimeValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTimeConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"samplingTime",
                    		lv_samplingTime_1_0, 
                    		"TimeValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTimeConstraint1360); 

                	newLeafNode(otherlv_2, grammarAccess.getTimeConstraintAccess().getRightSquareBracketKeyword_2());
                

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
    // $ANTLR end "ruleTimeConstraint"


    // $ANTLR start "entryRuleTimeValue"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:676:1: entryRuleTimeValue returns [EObject current=null] : iv_ruleTimeValue= ruleTimeValue EOF ;
    public final EObject entryRuleTimeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeValue = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:677:2: (iv_ruleTimeValue= ruleTimeValue EOF )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:678:2: iv_ruleTimeValue= ruleTimeValue EOF
            {
             newCompositeNode(grammarAccess.getTimeValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeValue_in_entryRuleTimeValue1396);
            iv_ruleTimeValue=ruleTimeValue();

            state._fsp--;

             current =iv_ruleTimeValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimeValue1406); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:685:1: ruleTimeValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleINTExpression ) ) ( (lv_unit_1_0= ruleTimeUnitExpr ) ) ) ;
    public final EObject ruleTimeValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        AntlrDatatypeRuleToken lv_unit_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:688:28: ( ( ( (lv_value_0_0= ruleINTExpression ) ) ( (lv_unit_1_0= ruleTimeUnitExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:689:1: ( ( (lv_value_0_0= ruleINTExpression ) ) ( (lv_unit_1_0= ruleTimeUnitExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:689:1: ( ( (lv_value_0_0= ruleINTExpression ) ) ( (lv_unit_1_0= ruleTimeUnitExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:689:2: ( (lv_value_0_0= ruleINTExpression ) ) ( (lv_unit_1_0= ruleTimeUnitExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:689:2: ( (lv_value_0_0= ruleINTExpression ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:690:1: (lv_value_0_0= ruleINTExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:690:1: (lv_value_0_0= ruleINTExpression )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:691:3: lv_value_0_0= ruleINTExpression
            {
             
            	        newCompositeNode(grammarAccess.getTimeValueAccess().getValueINTExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleINTExpression_in_ruleTimeValue1452);
            lv_value_0_0=ruleINTExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTimeValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INTExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:707:2: ( (lv_unit_1_0= ruleTimeUnitExpr ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:708:1: (lv_unit_1_0= ruleTimeUnitExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:708:1: (lv_unit_1_0= ruleTimeUnitExpr )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:709:3: lv_unit_1_0= ruleTimeUnitExpr
            {
             
            	        newCompositeNode(grammarAccess.getTimeValueAccess().getUnitTimeUnitExprParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTimeUnitExpr_in_ruleTimeValue1473);
            lv_unit_1_0=ruleTimeUnitExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTimeValueRule());
            	        }
                   		set(
                   			current, 
                   			"unit",
                    		lv_unit_1_0, 
                    		"TimeUnitExpr");
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
    // $ANTLR end "ruleTimeValue"


    // $ANTLR start "entryRuleINTExpression"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:733:1: entryRuleINTExpression returns [EObject current=null] : iv_ruleINTExpression= ruleINTExpression EOF ;
    public final EObject entryRuleINTExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINTExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:734:2: (iv_ruleINTExpression= ruleINTExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:735:2: iv_ruleINTExpression= ruleINTExpression EOF
            {
             newCompositeNode(grammarAccess.getINTExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleINTExpression_in_entryRuleINTExpression1509);
            iv_ruleINTExpression=ruleINTExpression();

            state._fsp--;

             current =iv_ruleINTExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleINTExpression1519); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTExpression"


    // $ANTLR start "ruleINTExpression"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:742:1: ruleINTExpression returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleINTExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:745:28: ( ( (lv_value_0_0= ruleEString ) ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:746:1: ( (lv_value_0_0= ruleEString ) )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:746:1: ( (lv_value_0_0= ruleEString ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:747:1: (lv_value_0_0= ruleEString )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:747:1: (lv_value_0_0= ruleEString )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:748:3: lv_value_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getINTExpressionAccess().getValueEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleINTExpression1564);
            lv_value_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getINTExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EString");
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
    // $ANTLR end "ruleINTExpression"


    // $ANTLR start "entryRuleTimeUnitExpr"
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:772:1: entryRuleTimeUnitExpr returns [String current=null] : iv_ruleTimeUnitExpr= ruleTimeUnitExpr EOF ;
    public final String entryRuleTimeUnitExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeUnitExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:773:2: (iv_ruleTimeUnitExpr= ruleTimeUnitExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:774:2: iv_ruleTimeUnitExpr= ruleTimeUnitExpr EOF
            {
             newCompositeNode(grammarAccess.getTimeUnitExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeUnitExpr_in_entryRuleTimeUnitExpr1600);
            iv_ruleTimeUnitExpr=ruleTimeUnitExpr();

            state._fsp--;

             current =iv_ruleTimeUnitExpr.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimeUnitExpr1611); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:781:1: ruleTimeUnitExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'days' | kw= 'hours' | kw= 'min' | kw= 'sec' | kw= 'ms' | kw= '\\u00B5s' | kw= 'ns' ) ;
    public final AntlrDatatypeRuleToken ruleTimeUnitExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:784:28: ( (kw= 'days' | kw= 'hours' | kw= 'min' | kw= 'sec' | kw= 'ms' | kw= '\\u00B5s' | kw= 'ns' ) )
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:785:1: (kw= 'days' | kw= 'hours' | kw= 'min' | kw= 'sec' | kw= 'ms' | kw= '\\u00B5s' | kw= 'ns' )
            {
            // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:785:1: (kw= 'days' | kw= 'hours' | kw= 'min' | kw= 'sec' | kw= 'ms' | kw= '\\u00B5s' | kw= 'ns' )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 24:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            case 26:
                {
                alt10=4;
                }
                break;
            case 27:
                {
                alt10=5;
                }
                break;
            case 28:
                {
                alt10=6;
                }
                break;
            case 29:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:786:2: kw= 'days'
                    {
                    kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTimeUnitExpr1649); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getDaysKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:793:2: kw= 'hours'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTimeUnitExpr1668); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getHoursKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:800:2: kw= 'min'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTimeUnitExpr1687); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getMinKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:807:2: kw= 'sec'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTimeUnitExpr1706); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getSecKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:814:2: kw= 'ms'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTimeUnitExpr1725); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getMsKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:821:2: kw= '\\u00B5s'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTimeUnitExpr1744); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getSKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.uni_paderborn.fujaba.muml.swplatform.oslanguage/src-gen/de/uni_paderborn/fujaba/muml/swplatform/oslanguage/parser/antlr/internal/InternalOperatingSystemLanguage.g:828:2: kw= 'ns'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTimeUnitExpr1763); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getNsKeyword_6()); 
                        

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
    // $ANTLR end "ruleTimeUnitExpr"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleOperatingSystem_in_entryRuleOperatingSystem75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperatingSystem85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_ruleOperatingSystem131 = new BitSet(new long[]{0x0000000000004800L});
        public static final BitSet FOLLOW_11_in_ruleOperatingSystem144 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOperatingSystem165 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOperatingSystem177 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_ruleAPIRepository_in_ruleOperatingSystem199 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_ruleEnumerationDataType_in_ruleOperatingSystem226 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_13_in_ruleOperatingSystem240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_entryRuleImport276 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImport286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleImport323 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleImport340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString382 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAPIRepository_in_entryRuleAPIRepository504 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAPIRepository514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleAPIRepository551 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAPIRepository572 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAPIRepository584 = new BitSet(new long[]{0x0000000000002030L});
        public static final BitSet FOLLOW_ruleAPICommand_in_ruleAPIRepository605 = new BitSet(new long[]{0x0000000000002030L});
        public static final BitSet FOLLOW_13_in_ruleAPIRepository618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationDataType_in_entryRuleEnumerationDataType654 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationDataType664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleEnumerationDataType701 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumerationDataType722 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEnumerationDataType734 = new BitSet(new long[]{0x0000000000002030L});
        public static final BitSet FOLLOW_ruleEnumerationValue_in_ruleEnumerationDataType756 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_17_in_ruleEnumerationDataType769 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEnumerationValue_in_ruleEnumerationDataType790 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_13_in_ruleEnumerationDataType806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAPICommand_in_entryRuleAPICommand842 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAPICommand852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAPICommand900 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAPICommand921 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAPICommand933 = new BitSet(new long[]{0x0000000000080030L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleAPICommand955 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleAPICommand968 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleAPICommand989 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_19_in_ruleAPICommand1005 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_ruleTimeConstraint_in_ruleAPICommand1026 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAPICommand1039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1075 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter1085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter1133 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationValue_in_entryRuleEnumerationValue1190 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationValue1200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumerationValue1245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeConstraint_in_entryRuleTimeConstraint1280 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimeConstraint1290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleTimeConstraint1327 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTimeValue_in_ruleTimeConstraint1348 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTimeConstraint1360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeValue_in_entryRuleTimeValue1396 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimeValue1406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleINTExpression_in_ruleTimeValue1452 = new BitSet(new long[]{0x000000003F800000L});
        public static final BitSet FOLLOW_ruleTimeUnitExpr_in_ruleTimeValue1473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleINTExpression_in_entryRuleINTExpression1509 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleINTExpression1519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleINTExpression1564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeUnitExpr_in_entryRuleTimeUnitExpr1600 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimeUnitExpr1611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleTimeUnitExpr1649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleTimeUnitExpr1668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleTimeUnitExpr1687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTimeUnitExpr1706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleTimeUnitExpr1725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleTimeUnitExpr1744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleTimeUnitExpr1763 = new BitSet(new long[]{0x0000000000000002L});
    }


}