package org.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.ModuleDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalModuleDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ENUM_ELEMENT", "RULE_BIT", "RULE_HEX", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'}'", "'@'", "'criterion'", "':'", "'datasel'", "','", "';'", "'mcdc'", "'dc'", "'cc'", "'rand'", "'eqv'", "'bv'", "'in'", "'out'", "'inout'", "'tmp'", "'cst'", "'=='", "'('", "')'", "'int'", "'real'", "'bool'", "'enum'", "'bit'", "'hex'", "'str'", "']'", "'['", "'..'", "'?'", "'=>'", "'else'", "'loop'", "'error'", "'null'", "'='", "'or'", "'and'", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'not'", "'.'"
    };
    public static final int T__68=68;
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_ID=11;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int RULE_ENUM_ELEMENT=7;
    public static final int T__57=57;
    public static final int RULE_HEX=9;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=10;
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
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_IDENT=4;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=14;
    public static final int RULE_BIT=8;

    // delegates
    // delegators


        public InternalModuleDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalModuleDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalModuleDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g"; }



     	private ModuleDslGrammarAccess grammarAccess;
     	
        public InternalModuleDslParser(TokenStream input, ModuleDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LANGUAGE";	
       	}
       	
       	@Override
       	protected ModuleDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLANGUAGE"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:67:1: entryRuleLANGUAGE returns [EObject current=null] : iv_ruleLANGUAGE= ruleLANGUAGE EOF ;
    public final EObject entryRuleLANGUAGE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLANGUAGE = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:68:2: (iv_ruleLANGUAGE= ruleLANGUAGE EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:69:2: iv_ruleLANGUAGE= ruleLANGUAGE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLANGUAGERule()); 
            }
            pushFollow(FOLLOW_ruleLANGUAGE_in_entryRuleLANGUAGE75);
            iv_ruleLANGUAGE=ruleLANGUAGE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLANGUAGE; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLANGUAGE85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLANGUAGE"


    // $ANTLR start "ruleLANGUAGE"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:76:1: ruleLANGUAGE returns [EObject current=null] : ( (lv_modules_0_0= ruleMODULE_DECL ) )+ ;
    public final EObject ruleLANGUAGE() throws RecognitionException {
        EObject current = null;

        EObject lv_modules_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:79:28: ( ( (lv_modules_0_0= ruleMODULE_DECL ) )+ )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:80:1: ( (lv_modules_0_0= ruleMODULE_DECL ) )+
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:80:1: ( (lv_modules_0_0= ruleMODULE_DECL ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:81:1: (lv_modules_0_0= ruleMODULE_DECL )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:81:1: (lv_modules_0_0= ruleMODULE_DECL )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:82:3: lv_modules_0_0= ruleMODULE_DECL
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLANGUAGEAccess().getModulesMODULE_DECLParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMODULE_DECL_in_ruleLANGUAGE130);
            	    lv_modules_0_0=ruleMODULE_DECL();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLANGUAGERule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modules",
            	              		lv_modules_0_0, 
            	              		"MODULE_DECL");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // $ANTLR end "ruleLANGUAGE"


    // $ANTLR start "entryRuleMODULE_DECL"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:106:1: entryRuleMODULE_DECL returns [EObject current=null] : iv_ruleMODULE_DECL= ruleMODULE_DECL EOF ;
    public final EObject entryRuleMODULE_DECL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODULE_DECL = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:107:2: (iv_ruleMODULE_DECL= ruleMODULE_DECL EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:108:2: iv_ruleMODULE_DECL= ruleMODULE_DECL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMODULE_DECLRule()); 
            }
            pushFollow(FOLLOW_ruleMODULE_DECL_in_entryRuleMODULE_DECL166);
            iv_ruleMODULE_DECL=ruleMODULE_DECL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMODULE_DECL; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMODULE_DECL176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMODULE_DECL"


    // $ANTLR start "ruleMODULE_DECL"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:115:1: ruleMODULE_DECL returns [EObject current=null] : (otherlv_0= 'module' () ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '{' ( (lv_critdecl_4_0= ruleCRITERION_DECL ) ) ( (lv_dataseldecl_5_0= ruleDATASEL_DECL ) ) ( (lv_declaration_6_0= ruleVAR_CST ) )* ( (lv_instr_7_0= ruleINSTRUCTION ) )* otherlv_8= '}' ) ;
    public final EObject ruleMODULE_DECL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        EObject lv_critdecl_4_0 = null;

        EObject lv_dataseldecl_5_0 = null;

        EObject lv_declaration_6_0 = null;

        EObject lv_instr_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:118:28: ( (otherlv_0= 'module' () ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '{' ( (lv_critdecl_4_0= ruleCRITERION_DECL ) ) ( (lv_dataseldecl_5_0= ruleDATASEL_DECL ) ) ( (lv_declaration_6_0= ruleVAR_CST ) )* ( (lv_instr_7_0= ruleINSTRUCTION ) )* otherlv_8= '}' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:119:1: (otherlv_0= 'module' () ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '{' ( (lv_critdecl_4_0= ruleCRITERION_DECL ) ) ( (lv_dataseldecl_5_0= ruleDATASEL_DECL ) ) ( (lv_declaration_6_0= ruleVAR_CST ) )* ( (lv_instr_7_0= ruleINSTRUCTION ) )* otherlv_8= '}' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:119:1: (otherlv_0= 'module' () ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '{' ( (lv_critdecl_4_0= ruleCRITERION_DECL ) ) ( (lv_dataseldecl_5_0= ruleDATASEL_DECL ) ) ( (lv_declaration_6_0= ruleVAR_CST ) )* ( (lv_instr_7_0= ruleINSTRUCTION ) )* otherlv_8= '}' )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:119:3: otherlv_0= 'module' () ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '{' ( (lv_critdecl_4_0= ruleCRITERION_DECL ) ) ( (lv_dataseldecl_5_0= ruleDATASEL_DECL ) ) ( (lv_declaration_6_0= ruleVAR_CST ) )* ( (lv_instr_7_0= ruleINSTRUCTION ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleMODULE_DECL213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMODULE_DECLAccess().getModuleKeyword_0());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:123:1: ()
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:124:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMODULE_DECLAccess().getMODULE_DECLAction_1(),
                          current);
                  
            }

            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:129:2: ( (lv_name_2_0= RULE_IDENT ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:130:1: (lv_name_2_0= RULE_IDENT )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:130:1: (lv_name_2_0= RULE_IDENT )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:131:3: lv_name_2_0= RULE_IDENT
            {
            lv_name_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMODULE_DECL239); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMODULE_DECLAccess().getNameIDENTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMODULE_DECLRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"IDENT");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleMODULE_DECL256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMODULE_DECLAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:151:1: ( (lv_critdecl_4_0= ruleCRITERION_DECL ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:152:1: (lv_critdecl_4_0= ruleCRITERION_DECL )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:152:1: (lv_critdecl_4_0= ruleCRITERION_DECL )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:153:3: lv_critdecl_4_0= ruleCRITERION_DECL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMODULE_DECLAccess().getCritdeclCRITERION_DECLParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCRITERION_DECL_in_ruleMODULE_DECL277);
            lv_critdecl_4_0=ruleCRITERION_DECL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMODULE_DECLRule());
              	        }
                     		set(
                     			current, 
                     			"critdecl",
                      		lv_critdecl_4_0, 
                      		"CRITERION_DECL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:169:2: ( (lv_dataseldecl_5_0= ruleDATASEL_DECL ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:170:1: (lv_dataseldecl_5_0= ruleDATASEL_DECL )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:170:1: (lv_dataseldecl_5_0= ruleDATASEL_DECL )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:171:3: lv_dataseldecl_5_0= ruleDATASEL_DECL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMODULE_DECLAccess().getDataseldeclDATASEL_DECLParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDATASEL_DECL_in_ruleMODULE_DECL298);
            lv_dataseldecl_5_0=ruleDATASEL_DECL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMODULE_DECLRule());
              	        }
                     		set(
                     			current, 
                     			"dataseldecl",
                      		lv_dataseldecl_5_0, 
                      		"DATASEL_DECL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:187:2: ( (lv_declaration_6_0= ruleVAR_CST ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=31 && LA2_0<=35)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:188:1: (lv_declaration_6_0= ruleVAR_CST )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:188:1: (lv_declaration_6_0= ruleVAR_CST )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:189:3: lv_declaration_6_0= ruleVAR_CST
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMODULE_DECLAccess().getDeclarationVAR_CSTParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVAR_CST_in_ruleMODULE_DECL319);
            	    lv_declaration_6_0=ruleVAR_CST();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMODULE_DECLRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declaration",
            	              		lv_declaration_6_0, 
            	              		"VAR_CST");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:205:3: ( (lv_instr_7_0= ruleINSTRUCTION ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_IDENT||LA3_0==37||(LA3_0>=52 && LA3_0<=54)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:206:1: (lv_instr_7_0= ruleINSTRUCTION )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:206:1: (lv_instr_7_0= ruleINSTRUCTION )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:207:3: lv_instr_7_0= ruleINSTRUCTION
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMODULE_DECLAccess().getInstrINSTRUCTIONParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleINSTRUCTION_in_ruleMODULE_DECL341);
            	    lv_instr_7_0=ruleINSTRUCTION();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMODULE_DECLRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"instr",
            	              		lv_instr_7_0, 
            	              		"INSTRUCTION");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleMODULE_DECL354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMODULE_DECLAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "ruleMODULE_DECL"


    // $ANTLR start "entryRuleCRITERION_DECL"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:235:1: entryRuleCRITERION_DECL returns [EObject current=null] : iv_ruleCRITERION_DECL= ruleCRITERION_DECL EOF ;
    public final EObject entryRuleCRITERION_DECL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCRITERION_DECL = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:236:2: (iv_ruleCRITERION_DECL= ruleCRITERION_DECL EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:237:2: iv_ruleCRITERION_DECL= ruleCRITERION_DECL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCRITERION_DECLRule()); 
            }
            pushFollow(FOLLOW_ruleCRITERION_DECL_in_entryRuleCRITERION_DECL390);
            iv_ruleCRITERION_DECL=ruleCRITERION_DECL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCRITERION_DECL; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCRITERION_DECL400); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCRITERION_DECL"


    // $ANTLR start "ruleCRITERION_DECL"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:244:1: ruleCRITERION_DECL returns [EObject current=null] : (otherlv_0= '@' otherlv_1= 'criterion' otherlv_2= ':' () ( (lv_crit_4_0= ruleCRITERION ) ) ( (lv_end_5_0= ruleEND ) ) ) ;
    public final EObject ruleCRITERION_DECL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_crit_4_0 = null;

        EObject lv_end_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:247:28: ( (otherlv_0= '@' otherlv_1= 'criterion' otherlv_2= ':' () ( (lv_crit_4_0= ruleCRITERION ) ) ( (lv_end_5_0= ruleEND ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:248:1: (otherlv_0= '@' otherlv_1= 'criterion' otherlv_2= ':' () ( (lv_crit_4_0= ruleCRITERION ) ) ( (lv_end_5_0= ruleEND ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:248:1: (otherlv_0= '@' otherlv_1= 'criterion' otherlv_2= ':' () ( (lv_crit_4_0= ruleCRITERION ) ) ( (lv_end_5_0= ruleEND ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:248:3: otherlv_0= '@' otherlv_1= 'criterion' otherlv_2= ':' () ( (lv_crit_4_0= ruleCRITERION ) ) ( (lv_end_5_0= ruleEND ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleCRITERION_DECL437); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCRITERION_DECLAccess().getCommercialAtKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCRITERION_DECL449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCRITERION_DECLAccess().getCriterionKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleCRITERION_DECL461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCRITERION_DECLAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:260:1: ()
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:261:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCRITERION_DECLAccess().getCRITERION_DECLAction_3(),
                          current);
                  
            }

            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:266:2: ( (lv_crit_4_0= ruleCRITERION ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:267:1: (lv_crit_4_0= ruleCRITERION )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:267:1: (lv_crit_4_0= ruleCRITERION )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:268:3: lv_crit_4_0= ruleCRITERION
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCRITERION_DECLAccess().getCritCRITERIONParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCRITERION_in_ruleCRITERION_DECL491);
            lv_crit_4_0=ruleCRITERION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCRITERION_DECLRule());
              	        }
                     		set(
                     			current, 
                     			"crit",
                      		lv_crit_4_0, 
                      		"CRITERION");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:284:2: ( (lv_end_5_0= ruleEND ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:285:1: (lv_end_5_0= ruleEND )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:285:1: (lv_end_5_0= ruleEND )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:286:3: lv_end_5_0= ruleEND
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCRITERION_DECLAccess().getEndENDParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEND_in_ruleCRITERION_DECL512);
            lv_end_5_0=ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCRITERION_DECLRule());
              	        }
                     		set(
                     			current, 
                     			"end",
                      		lv_end_5_0, 
                      		"END");
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
    // $ANTLR end "ruleCRITERION_DECL"


    // $ANTLR start "entryRuleDATASEL_DECL"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:310:1: entryRuleDATASEL_DECL returns [EObject current=null] : iv_ruleDATASEL_DECL= ruleDATASEL_DECL EOF ;
    public final EObject entryRuleDATASEL_DECL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDATASEL_DECL = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:311:2: (iv_ruleDATASEL_DECL= ruleDATASEL_DECL EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:312:2: iv_ruleDATASEL_DECL= ruleDATASEL_DECL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDATASEL_DECLRule()); 
            }
            pushFollow(FOLLOW_ruleDATASEL_DECL_in_entryRuleDATASEL_DECL548);
            iv_ruleDATASEL_DECL=ruleDATASEL_DECL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDATASEL_DECL; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDATASEL_DECL558); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDATASEL_DECL"


    // $ANTLR start "ruleDATASEL_DECL"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:319:1: ruleDATASEL_DECL returns [EObject current=null] : (otherlv_0= '@' otherlv_1= 'datasel' otherlv_2= ':' () ( (lv_data1_4_0= ruleDATASEL ) ) (otherlv_5= ',' ( (lv_data2_6_0= ruleDATASEL ) ) )? ( (lv_end_7_0= ruleEND ) ) ) ;
    public final EObject ruleDATASEL_DECL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_data1_4_0 = null;

        EObject lv_data2_6_0 = null;

        EObject lv_end_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:322:28: ( (otherlv_0= '@' otherlv_1= 'datasel' otherlv_2= ':' () ( (lv_data1_4_0= ruleDATASEL ) ) (otherlv_5= ',' ( (lv_data2_6_0= ruleDATASEL ) ) )? ( (lv_end_7_0= ruleEND ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:323:1: (otherlv_0= '@' otherlv_1= 'datasel' otherlv_2= ':' () ( (lv_data1_4_0= ruleDATASEL ) ) (otherlv_5= ',' ( (lv_data2_6_0= ruleDATASEL ) ) )? ( (lv_end_7_0= ruleEND ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:323:1: (otherlv_0= '@' otherlv_1= 'datasel' otherlv_2= ':' () ( (lv_data1_4_0= ruleDATASEL ) ) (otherlv_5= ',' ( (lv_data2_6_0= ruleDATASEL ) ) )? ( (lv_end_7_0= ruleEND ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:323:3: otherlv_0= '@' otherlv_1= 'datasel' otherlv_2= ':' () ( (lv_data1_4_0= ruleDATASEL ) ) (otherlv_5= ',' ( (lv_data2_6_0= ruleDATASEL ) ) )? ( (lv_end_7_0= ruleEND ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleDATASEL_DECL595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDATASEL_DECLAccess().getCommercialAtKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleDATASEL_DECL607); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDATASEL_DECLAccess().getDataselKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleDATASEL_DECL619); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDATASEL_DECLAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:335:1: ()
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:336:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDATASEL_DECLAccess().getDATASEL_DECLAction_3(),
                          current);
                  
            }

            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:341:2: ( (lv_data1_4_0= ruleDATASEL ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:342:1: (lv_data1_4_0= ruleDATASEL )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:342:1: (lv_data1_4_0= ruleDATASEL )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:343:3: lv_data1_4_0= ruleDATASEL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDATASEL_DECLAccess().getData1DATASELParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDATASEL_in_ruleDATASEL_DECL649);
            lv_data1_4_0=ruleDATASEL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDATASEL_DECLRule());
              	        }
                     		set(
                     			current, 
                     			"data1",
                      		lv_data1_4_0, 
                      		"DATASEL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:359:2: (otherlv_5= ',' ( (lv_data2_6_0= ruleDATASEL ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:359:4: otherlv_5= ',' ( (lv_data2_6_0= ruleDATASEL ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleDATASEL_DECL662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDATASEL_DECLAccess().getCommaKeyword_5_0());
                          
                    }
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:363:1: ( (lv_data2_6_0= ruleDATASEL ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:364:1: (lv_data2_6_0= ruleDATASEL )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:364:1: (lv_data2_6_0= ruleDATASEL )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:365:3: lv_data2_6_0= ruleDATASEL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDATASEL_DECLAccess().getData2DATASELParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDATASEL_in_ruleDATASEL_DECL683);
                    lv_data2_6_0=ruleDATASEL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDATASEL_DECLRule());
                      	        }
                             		set(
                             			current, 
                             			"data2",
                              		lv_data2_6_0, 
                              		"DATASEL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:381:4: ( (lv_end_7_0= ruleEND ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:382:1: (lv_end_7_0= ruleEND )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:382:1: (lv_end_7_0= ruleEND )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:383:3: lv_end_7_0= ruleEND
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDATASEL_DECLAccess().getEndENDParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEND_in_ruleDATASEL_DECL706);
            lv_end_7_0=ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDATASEL_DECLRule());
              	        }
                     		set(
                     			current, 
                     			"end",
                      		lv_end_7_0, 
                      		"END");
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
    // $ANTLR end "ruleDATASEL_DECL"


    // $ANTLR start "entryRuleEND"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:407:1: entryRuleEND returns [EObject current=null] : iv_ruleEND= ruleEND EOF ;
    public final EObject entryRuleEND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEND = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:408:2: (iv_ruleEND= ruleEND EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:409:2: iv_ruleEND= ruleEND EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENDRule()); 
            }
            pushFollow(FOLLOW_ruleEND_in_entryRuleEND742);
            iv_ruleEND=ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEND; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEND752); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEND"


    // $ANTLR start "ruleEND"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:416:1: ruleEND returns [EObject current=null] : ( (lv_end_0_0= ';' ) ) ;
    public final EObject ruleEND() throws RecognitionException {
        EObject current = null;

        Token lv_end_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:419:28: ( ( (lv_end_0_0= ';' ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:420:1: ( (lv_end_0_0= ';' ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:420:1: ( (lv_end_0_0= ';' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:421:1: (lv_end_0_0= ';' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:421:1: (lv_end_0_0= ';' )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:422:3: lv_end_0_0= ';'
            {
            lv_end_0_0=(Token)match(input,24,FOLLOW_24_in_ruleEND794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_end_0_0, grammarAccess.getENDAccess().getEndSemicolonKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getENDRule());
              	        }
                     		setWithLastConsumed(current, "end", lv_end_0_0, ";");
              	    
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
    // $ANTLR end "ruleEND"


    // $ANTLR start "entryRuleCRITERION"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:443:1: entryRuleCRITERION returns [EObject current=null] : iv_ruleCRITERION= ruleCRITERION EOF ;
    public final EObject entryRuleCRITERION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCRITERION = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:444:2: (iv_ruleCRITERION= ruleCRITERION EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:445:2: iv_ruleCRITERION= ruleCRITERION EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCRITERIONRule()); 
            }
            pushFollow(FOLLOW_ruleCRITERION_in_entryRuleCRITERION842);
            iv_ruleCRITERION=ruleCRITERION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCRITERION; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCRITERION852); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCRITERION"


    // $ANTLR start "ruleCRITERION"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:452:1: ruleCRITERION returns [EObject current=null] : ( ( (lv_crit_0_1= 'mcdc' | lv_crit_0_2= 'dc' | lv_crit_0_3= 'cc' ) ) ) ;
    public final EObject ruleCRITERION() throws RecognitionException {
        EObject current = null;

        Token lv_crit_0_1=null;
        Token lv_crit_0_2=null;
        Token lv_crit_0_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:455:28: ( ( ( (lv_crit_0_1= 'mcdc' | lv_crit_0_2= 'dc' | lv_crit_0_3= 'cc' ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:456:1: ( ( (lv_crit_0_1= 'mcdc' | lv_crit_0_2= 'dc' | lv_crit_0_3= 'cc' ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:456:1: ( ( (lv_crit_0_1= 'mcdc' | lv_crit_0_2= 'dc' | lv_crit_0_3= 'cc' ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:457:1: ( (lv_crit_0_1= 'mcdc' | lv_crit_0_2= 'dc' | lv_crit_0_3= 'cc' ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:457:1: ( (lv_crit_0_1= 'mcdc' | lv_crit_0_2= 'dc' | lv_crit_0_3= 'cc' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:458:1: (lv_crit_0_1= 'mcdc' | lv_crit_0_2= 'dc' | lv_crit_0_3= 'cc' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:458:1: (lv_crit_0_1= 'mcdc' | lv_crit_0_2= 'dc' | lv_crit_0_3= 'cc' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 27:
                {
                alt5=3;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:459:3: lv_crit_0_1= 'mcdc'
                    {
                    lv_crit_0_1=(Token)match(input,25,FOLLOW_25_in_ruleCRITERION896); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_crit_0_1, grammarAccess.getCRITERIONAccess().getCritMcdcKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCRITERIONRule());
                      	        }
                             		setWithLastConsumed(current, "crit", lv_crit_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:471:8: lv_crit_0_2= 'dc'
                    {
                    lv_crit_0_2=(Token)match(input,26,FOLLOW_26_in_ruleCRITERION925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_crit_0_2, grammarAccess.getCRITERIONAccess().getCritDcKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCRITERIONRule());
                      	        }
                             		setWithLastConsumed(current, "crit", lv_crit_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:483:8: lv_crit_0_3= 'cc'
                    {
                    lv_crit_0_3=(Token)match(input,27,FOLLOW_27_in_ruleCRITERION954); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_crit_0_3, grammarAccess.getCRITERIONAccess().getCritCcKeyword_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCRITERIONRule());
                      	        }
                             		setWithLastConsumed(current, "crit", lv_crit_0_3, null);
                      	    
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
    // $ANTLR end "ruleCRITERION"


    // $ANTLR start "entryRuleDATASEL"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:506:1: entryRuleDATASEL returns [EObject current=null] : iv_ruleDATASEL= ruleDATASEL EOF ;
    public final EObject entryRuleDATASEL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDATASEL = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:507:2: (iv_ruleDATASEL= ruleDATASEL EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:508:2: iv_ruleDATASEL= ruleDATASEL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDATASELRule()); 
            }
            pushFollow(FOLLOW_ruleDATASEL_in_entryRuleDATASEL1005);
            iv_ruleDATASEL=ruleDATASEL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDATASEL; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDATASEL1015); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDATASEL"


    // $ANTLR start "ruleDATASEL"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:515:1: ruleDATASEL returns [EObject current=null] : ( ( (lv_sel_0_1= 'rand' | lv_sel_0_2= 'eqv' | lv_sel_0_3= 'bv' ) ) ) ;
    public final EObject ruleDATASEL() throws RecognitionException {
        EObject current = null;

        Token lv_sel_0_1=null;
        Token lv_sel_0_2=null;
        Token lv_sel_0_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:518:28: ( ( ( (lv_sel_0_1= 'rand' | lv_sel_0_2= 'eqv' | lv_sel_0_3= 'bv' ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:519:1: ( ( (lv_sel_0_1= 'rand' | lv_sel_0_2= 'eqv' | lv_sel_0_3= 'bv' ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:519:1: ( ( (lv_sel_0_1= 'rand' | lv_sel_0_2= 'eqv' | lv_sel_0_3= 'bv' ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:520:1: ( (lv_sel_0_1= 'rand' | lv_sel_0_2= 'eqv' | lv_sel_0_3= 'bv' ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:520:1: ( (lv_sel_0_1= 'rand' | lv_sel_0_2= 'eqv' | lv_sel_0_3= 'bv' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:521:1: (lv_sel_0_1= 'rand' | lv_sel_0_2= 'eqv' | lv_sel_0_3= 'bv' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:521:1: (lv_sel_0_1= 'rand' | lv_sel_0_2= 'eqv' | lv_sel_0_3= 'bv' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:522:3: lv_sel_0_1= 'rand'
                    {
                    lv_sel_0_1=(Token)match(input,28,FOLLOW_28_in_ruleDATASEL1059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_sel_0_1, grammarAccess.getDATASELAccess().getSelRandKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDATASELRule());
                      	        }
                             		setWithLastConsumed(current, "sel", lv_sel_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:534:8: lv_sel_0_2= 'eqv'
                    {
                    lv_sel_0_2=(Token)match(input,29,FOLLOW_29_in_ruleDATASEL1088); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_sel_0_2, grammarAccess.getDATASELAccess().getSelEqvKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDATASELRule());
                      	        }
                             		setWithLastConsumed(current, "sel", lv_sel_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:546:8: lv_sel_0_3= 'bv'
                    {
                    lv_sel_0_3=(Token)match(input,30,FOLLOW_30_in_ruleDATASEL1117); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_sel_0_3, grammarAccess.getDATASELAccess().getSelBvKeyword_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDATASELRule());
                      	        }
                             		setWithLastConsumed(current, "sel", lv_sel_0_3, null);
                      	    
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
    // $ANTLR end "ruleDATASEL"


    // $ANTLR start "entryRuleVAR_CST"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:569:1: entryRuleVAR_CST returns [EObject current=null] : iv_ruleVAR_CST= ruleVAR_CST EOF ;
    public final EObject entryRuleVAR_CST() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVAR_CST = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:570:2: (iv_ruleVAR_CST= ruleVAR_CST EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:571:2: iv_ruleVAR_CST= ruleVAR_CST EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVAR_CSTRule()); 
            }
            pushFollow(FOLLOW_ruleVAR_CST_in_entryRuleVAR_CST1168);
            iv_ruleVAR_CST=ruleVAR_CST();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVAR_CST; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVAR_CST1178); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVAR_CST"


    // $ANTLR start "ruleVAR_CST"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:578:1: ruleVAR_CST returns [EObject current=null] : (this_VAR_0= ruleVAR | this_CST_1= ruleCST ) ;
    public final EObject ruleVAR_CST() throws RecognitionException {
        EObject current = null;

        EObject this_VAR_0 = null;

        EObject this_CST_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:581:28: ( (this_VAR_0= ruleVAR | this_CST_1= ruleCST ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:582:1: (this_VAR_0= ruleVAR | this_CST_1= ruleCST )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:582:1: (this_VAR_0= ruleVAR | this_CST_1= ruleCST )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=31 && LA7_0<=34)) ) {
                alt7=1;
            }
            else if ( (LA7_0==35) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:583:5: this_VAR_0= ruleVAR
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVAR_CSTAccess().getVARParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVAR_in_ruleVAR_CST1225);
                    this_VAR_0=ruleVAR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VAR_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:593:5: this_CST_1= ruleCST
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVAR_CSTAccess().getCSTParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCST_in_ruleVAR_CST1252);
                    this_CST_1=ruleCST();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CST_1; 
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
    // $ANTLR end "ruleVAR_CST"


    // $ANTLR start "entryRuleVAR"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:609:1: entryRuleVAR returns [EObject current=null] : iv_ruleVAR= ruleVAR EOF ;
    public final EObject entryRuleVAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVAR = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:610:2: (iv_ruleVAR= ruleVAR EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:611:2: iv_ruleVAR= ruleVAR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVARRule()); 
            }
            pushFollow(FOLLOW_ruleVAR_in_entryRuleVAR1287);
            iv_ruleVAR=ruleVAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVAR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVAR1297); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVAR"


    // $ANTLR start "ruleVAR"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:618:1: ruleVAR returns [EObject current=null] : ( () ( (lv_flow_1_0= ruleFlow ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTYPE ) ) ( (lv_range_5_0= ruleRANGE ) )? ( (lv_end_6_0= ruleEND ) ) ) ;
    public final EObject ruleVAR() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_flow_1_0 = null;

        EObject lv_type_4_0 = null;

        EObject lv_range_5_0 = null;

        EObject lv_end_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:621:28: ( ( () ( (lv_flow_1_0= ruleFlow ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTYPE ) ) ( (lv_range_5_0= ruleRANGE ) )? ( (lv_end_6_0= ruleEND ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:622:1: ( () ( (lv_flow_1_0= ruleFlow ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTYPE ) ) ( (lv_range_5_0= ruleRANGE ) )? ( (lv_end_6_0= ruleEND ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:622:1: ( () ( (lv_flow_1_0= ruleFlow ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTYPE ) ) ( (lv_range_5_0= ruleRANGE ) )? ( (lv_end_6_0= ruleEND ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:622:2: () ( (lv_flow_1_0= ruleFlow ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTYPE ) ) ( (lv_range_5_0= ruleRANGE ) )? ( (lv_end_6_0= ruleEND ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:622:2: ()
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:623:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVARAccess().getVARAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:628:2: ( (lv_flow_1_0= ruleFlow ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:629:1: (lv_flow_1_0= ruleFlow )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:629:1: (lv_flow_1_0= ruleFlow )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:630:3: lv_flow_1_0= ruleFlow
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVARAccess().getFlowFlowParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFlow_in_ruleVAR1352);
            lv_flow_1_0=ruleFlow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVARRule());
              	        }
                     		set(
                     			current, 
                     			"flow",
                      		lv_flow_1_0, 
                      		"Flow");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:646:2: ( (lv_name_2_0= RULE_IDENT ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:647:1: (lv_name_2_0= RULE_IDENT )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:647:1: (lv_name_2_0= RULE_IDENT )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:648:3: lv_name_2_0= RULE_IDENT
            {
            lv_name_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleVAR1369); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getVARAccess().getNameIDENTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVARRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"IDENT");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleVAR1386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVARAccess().getColonKeyword_3());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:668:1: ( (lv_type_4_0= ruleTYPE ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:669:1: (lv_type_4_0= ruleTYPE )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:669:1: (lv_type_4_0= ruleTYPE )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:670:3: lv_type_4_0= ruleTYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVARAccess().getTypeTYPEParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTYPE_in_ruleVAR1407);
            lv_type_4_0=ruleTYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVARRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_4_0, 
                      		"TYPE");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:686:2: ( (lv_range_5_0= ruleRANGE ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17||(LA8_0>=46 && LA8_0<=47)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:687:1: (lv_range_5_0= ruleRANGE )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:687:1: (lv_range_5_0= ruleRANGE )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:688:3: lv_range_5_0= ruleRANGE
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVARAccess().getRangeRANGEParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRANGE_in_ruleVAR1428);
                    lv_range_5_0=ruleRANGE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVARRule());
                      	        }
                             		set(
                             			current, 
                             			"range",
                              		lv_range_5_0, 
                              		"RANGE");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:704:3: ( (lv_end_6_0= ruleEND ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:705:1: (lv_end_6_0= ruleEND )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:705:1: (lv_end_6_0= ruleEND )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:706:3: lv_end_6_0= ruleEND
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVARAccess().getEndENDParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEND_in_ruleVAR1450);
            lv_end_6_0=ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVARRule());
              	        }
                     		set(
                     			current, 
                     			"end",
                      		lv_end_6_0, 
                      		"END");
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
    // $ANTLR end "ruleVAR"


    // $ANTLR start "entryRuleFlow"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:730:1: entryRuleFlow returns [EObject current=null] : iv_ruleFlow= ruleFlow EOF ;
    public final EObject entryRuleFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlow = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:731:2: (iv_ruleFlow= ruleFlow EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:732:2: iv_ruleFlow= ruleFlow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowRule()); 
            }
            pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow1486);
            iv_ruleFlow=ruleFlow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlow; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlow1496); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:739:1: ruleFlow returns [EObject current=null] : ( ( (lv_flow_0_1= 'in' | lv_flow_0_2= 'out' | lv_flow_0_3= 'inout' | lv_flow_0_4= 'tmp' ) ) ) ;
    public final EObject ruleFlow() throws RecognitionException {
        EObject current = null;

        Token lv_flow_0_1=null;
        Token lv_flow_0_2=null;
        Token lv_flow_0_3=null;
        Token lv_flow_0_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:742:28: ( ( ( (lv_flow_0_1= 'in' | lv_flow_0_2= 'out' | lv_flow_0_3= 'inout' | lv_flow_0_4= 'tmp' ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:743:1: ( ( (lv_flow_0_1= 'in' | lv_flow_0_2= 'out' | lv_flow_0_3= 'inout' | lv_flow_0_4= 'tmp' ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:743:1: ( ( (lv_flow_0_1= 'in' | lv_flow_0_2= 'out' | lv_flow_0_3= 'inout' | lv_flow_0_4= 'tmp' ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:744:1: ( (lv_flow_0_1= 'in' | lv_flow_0_2= 'out' | lv_flow_0_3= 'inout' | lv_flow_0_4= 'tmp' ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:744:1: ( (lv_flow_0_1= 'in' | lv_flow_0_2= 'out' | lv_flow_0_3= 'inout' | lv_flow_0_4= 'tmp' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:745:1: (lv_flow_0_1= 'in' | lv_flow_0_2= 'out' | lv_flow_0_3= 'inout' | lv_flow_0_4= 'tmp' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:745:1: (lv_flow_0_1= 'in' | lv_flow_0_2= 'out' | lv_flow_0_3= 'inout' | lv_flow_0_4= 'tmp' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 33:
                {
                alt9=3;
                }
                break;
            case 34:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:746:3: lv_flow_0_1= 'in'
                    {
                    lv_flow_0_1=(Token)match(input,31,FOLLOW_31_in_ruleFlow1540); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_flow_0_1, grammarAccess.getFlowAccess().getFlowInKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFlowRule());
                      	        }
                             		setWithLastConsumed(current, "flow", lv_flow_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:758:8: lv_flow_0_2= 'out'
                    {
                    lv_flow_0_2=(Token)match(input,32,FOLLOW_32_in_ruleFlow1569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_flow_0_2, grammarAccess.getFlowAccess().getFlowOutKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFlowRule());
                      	        }
                             		setWithLastConsumed(current, "flow", lv_flow_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:770:8: lv_flow_0_3= 'inout'
                    {
                    lv_flow_0_3=(Token)match(input,33,FOLLOW_33_in_ruleFlow1598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_flow_0_3, grammarAccess.getFlowAccess().getFlowInoutKeyword_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFlowRule());
                      	        }
                             		setWithLastConsumed(current, "flow", lv_flow_0_3, null);
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:782:8: lv_flow_0_4= 'tmp'
                    {
                    lv_flow_0_4=(Token)match(input,34,FOLLOW_34_in_ruleFlow1627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_flow_0_4, grammarAccess.getFlowAccess().getFlowTmpKeyword_0_3());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFlowRule());
                      	        }
                             		setWithLastConsumed(current, "flow", lv_flow_0_4, null);
                      	    
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
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleCST"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:805:1: entryRuleCST returns [EObject current=null] : iv_ruleCST= ruleCST EOF ;
    public final EObject entryRuleCST() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCST = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:806:2: (iv_ruleCST= ruleCST EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:807:2: iv_ruleCST= ruleCST EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSTRule()); 
            }
            pushFollow(FOLLOW_ruleCST_in_entryRuleCST1678);
            iv_ruleCST=ruleCST();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCST; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCST1688); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCST"


    // $ANTLR start "ruleCST"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:814:1: ruleCST returns [EObject current=null] : ( () ( (lv_flow_1_0= 'cst' ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '==' ( (lv_type_4_0= ruleTYPE ) ) otherlv_5= '(' ( (lv_value_6_0= ruleLiteral ) ) otherlv_7= ')' ( (lv_end_8_0= ruleEND ) ) ) ;
    public final EObject ruleCST() throws RecognitionException {
        EObject current = null;

        Token lv_flow_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_type_4_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_end_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:817:28: ( ( () ( (lv_flow_1_0= 'cst' ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '==' ( (lv_type_4_0= ruleTYPE ) ) otherlv_5= '(' ( (lv_value_6_0= ruleLiteral ) ) otherlv_7= ')' ( (lv_end_8_0= ruleEND ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:818:1: ( () ( (lv_flow_1_0= 'cst' ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '==' ( (lv_type_4_0= ruleTYPE ) ) otherlv_5= '(' ( (lv_value_6_0= ruleLiteral ) ) otherlv_7= ')' ( (lv_end_8_0= ruleEND ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:818:1: ( () ( (lv_flow_1_0= 'cst' ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '==' ( (lv_type_4_0= ruleTYPE ) ) otherlv_5= '(' ( (lv_value_6_0= ruleLiteral ) ) otherlv_7= ')' ( (lv_end_8_0= ruleEND ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:818:2: () ( (lv_flow_1_0= 'cst' ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '==' ( (lv_type_4_0= ruleTYPE ) ) otherlv_5= '(' ( (lv_value_6_0= ruleLiteral ) ) otherlv_7= ')' ( (lv_end_8_0= ruleEND ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:818:2: ()
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:819:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSTAccess().getCSTAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:824:2: ( (lv_flow_1_0= 'cst' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:825:1: (lv_flow_1_0= 'cst' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:825:1: (lv_flow_1_0= 'cst' )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:826:3: lv_flow_1_0= 'cst'
            {
            lv_flow_1_0=(Token)match(input,35,FOLLOW_35_in_ruleCST1740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_flow_1_0, grammarAccess.getCSTAccess().getFlowCstKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCSTRule());
              	        }
                     		setWithLastConsumed(current, "flow", lv_flow_1_0, "cst");
              	    
            }

            }


            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:839:2: ( (lv_name_2_0= RULE_IDENT ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:840:1: (lv_name_2_0= RULE_IDENT )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:840:1: (lv_name_2_0= RULE_IDENT )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:841:3: lv_name_2_0= RULE_IDENT
            {
            lv_name_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleCST1770); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getCSTAccess().getNameIDENTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCSTRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"IDENT");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleCST1787); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCSTAccess().getEqualsSignEqualsSignKeyword_3());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:861:1: ( (lv_type_4_0= ruleTYPE ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:862:1: (lv_type_4_0= ruleTYPE )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:862:1: (lv_type_4_0= ruleTYPE )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:863:3: lv_type_4_0= ruleTYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSTAccess().getTypeTYPEParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTYPE_in_ruleCST1808);
            lv_type_4_0=ruleTYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSTRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_4_0, 
                      		"TYPE");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleCST1820); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCSTAccess().getLeftParenthesisKeyword_5());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:883:1: ( (lv_value_6_0= ruleLiteral ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:884:1: (lv_value_6_0= ruleLiteral )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:884:1: (lv_value_6_0= ruleLiteral )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:885:3: lv_value_6_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSTAccess().getValueLiteralParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleCST1841);
            lv_value_6_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSTRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_6_0, 
                      		"Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleCST1853); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getCSTAccess().getRightParenthesisKeyword_7());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:905:1: ( (lv_end_8_0= ruleEND ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:906:1: (lv_end_8_0= ruleEND )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:906:1: (lv_end_8_0= ruleEND )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:907:3: lv_end_8_0= ruleEND
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSTAccess().getEndENDParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEND_in_ruleCST1874);
            lv_end_8_0=ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSTRule());
              	        }
                     		set(
                     			current, 
                     			"end",
                      		lv_end_8_0, 
                      		"END");
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
    // $ANTLR end "ruleCST"


    // $ANTLR start "entryRuleTYPE"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:931:1: entryRuleTYPE returns [EObject current=null] : iv_ruleTYPE= ruleTYPE EOF ;
    public final EObject entryRuleTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTYPE = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:932:2: (iv_ruleTYPE= ruleTYPE EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:933:2: iv_ruleTYPE= ruleTYPE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTYPERule()); 
            }
            pushFollow(FOLLOW_ruleTYPE_in_entryRuleTYPE1910);
            iv_ruleTYPE=ruleTYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTYPE; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTYPE1920); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTYPE"


    // $ANTLR start "ruleTYPE"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:940:1: ruleTYPE returns [EObject current=null] : ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'real' | lv_type_0_3= 'bool' | lv_type_0_4= 'enum' | lv_type_0_5= 'bit' | lv_type_0_6= 'hex' | lv_type_0_7= 'str' ) ) ) ;
    public final EObject ruleTYPE() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;
        Token lv_type_0_5=null;
        Token lv_type_0_6=null;
        Token lv_type_0_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:943:28: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'real' | lv_type_0_3= 'bool' | lv_type_0_4= 'enum' | lv_type_0_5= 'bit' | lv_type_0_6= 'hex' | lv_type_0_7= 'str' ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:944:1: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'real' | lv_type_0_3= 'bool' | lv_type_0_4= 'enum' | lv_type_0_5= 'bit' | lv_type_0_6= 'hex' | lv_type_0_7= 'str' ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:944:1: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'real' | lv_type_0_3= 'bool' | lv_type_0_4= 'enum' | lv_type_0_5= 'bit' | lv_type_0_6= 'hex' | lv_type_0_7= 'str' ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:945:1: ( (lv_type_0_1= 'int' | lv_type_0_2= 'real' | lv_type_0_3= 'bool' | lv_type_0_4= 'enum' | lv_type_0_5= 'bit' | lv_type_0_6= 'hex' | lv_type_0_7= 'str' ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:945:1: ( (lv_type_0_1= 'int' | lv_type_0_2= 'real' | lv_type_0_3= 'bool' | lv_type_0_4= 'enum' | lv_type_0_5= 'bit' | lv_type_0_6= 'hex' | lv_type_0_7= 'str' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:946:1: (lv_type_0_1= 'int' | lv_type_0_2= 'real' | lv_type_0_3= 'bool' | lv_type_0_4= 'enum' | lv_type_0_5= 'bit' | lv_type_0_6= 'hex' | lv_type_0_7= 'str' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:946:1: (lv_type_0_1= 'int' | lv_type_0_2= 'real' | lv_type_0_3= 'bool' | lv_type_0_4= 'enum' | lv_type_0_5= 'bit' | lv_type_0_6= 'hex' | lv_type_0_7= 'str' )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt10=1;
                }
                break;
            case 40:
                {
                alt10=2;
                }
                break;
            case 41:
                {
                alt10=3;
                }
                break;
            case 42:
                {
                alt10=4;
                }
                break;
            case 43:
                {
                alt10=5;
                }
                break;
            case 44:
                {
                alt10=6;
                }
                break;
            case 45:
                {
                alt10=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:947:3: lv_type_0_1= 'int'
                    {
                    lv_type_0_1=(Token)match(input,39,FOLLOW_39_in_ruleTYPE1964); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_0_1, grammarAccess.getTYPEAccess().getTypeIntKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTYPERule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:959:8: lv_type_0_2= 'real'
                    {
                    lv_type_0_2=(Token)match(input,40,FOLLOW_40_in_ruleTYPE1993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_0_2, grammarAccess.getTYPEAccess().getTypeRealKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTYPERule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:971:8: lv_type_0_3= 'bool'
                    {
                    lv_type_0_3=(Token)match(input,41,FOLLOW_41_in_ruleTYPE2022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_0_3, grammarAccess.getTYPEAccess().getTypeBoolKeyword_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTYPERule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_0_3, null);
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:983:8: lv_type_0_4= 'enum'
                    {
                    lv_type_0_4=(Token)match(input,42,FOLLOW_42_in_ruleTYPE2051); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_0_4, grammarAccess.getTYPEAccess().getTypeEnumKeyword_0_3());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTYPERule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_0_4, null);
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:995:8: lv_type_0_5= 'bit'
                    {
                    lv_type_0_5=(Token)match(input,43,FOLLOW_43_in_ruleTYPE2080); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_0_5, grammarAccess.getTYPEAccess().getTypeBitKeyword_0_4());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTYPERule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_0_5, null);
                      	    
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1007:8: lv_type_0_6= 'hex'
                    {
                    lv_type_0_6=(Token)match(input,44,FOLLOW_44_in_ruleTYPE2109); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_0_6, grammarAccess.getTYPEAccess().getTypeHexKeyword_0_5());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTYPERule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_0_6, null);
                      	    
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1019:8: lv_type_0_7= 'str'
                    {
                    lv_type_0_7=(Token)match(input,45,FOLLOW_45_in_ruleTYPE2138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_0_7, grammarAccess.getTYPEAccess().getTypeStrKeyword_0_6());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTYPERule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_0_7, null);
                      	    
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
    // $ANTLR end "ruleTYPE"


    // $ANTLR start "entryRuleRANGE"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1042:1: entryRuleRANGE returns [EObject current=null] : iv_ruleRANGE= ruleRANGE EOF ;
    public final EObject entryRuleRANGE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRANGE = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1043:2: (iv_ruleRANGE= ruleRANGE EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1044:2: iv_ruleRANGE= ruleRANGE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRANGERule()); 
            }
            pushFollow(FOLLOW_ruleRANGE_in_entryRuleRANGE2189);
            iv_ruleRANGE=ruleRANGE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRANGE; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRANGE2199); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRANGE"


    // $ANTLR start "ruleRANGE"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1051:1: ruleRANGE returns [EObject current=null] : (this_INTERVAL_0= ruleINTERVAL | this_LSET_1= ruleLSET ) ;
    public final EObject ruleRANGE() throws RecognitionException {
        EObject current = null;

        EObject this_INTERVAL_0 = null;

        EObject this_LSET_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1054:28: ( (this_INTERVAL_0= ruleINTERVAL | this_LSET_1= ruleLSET ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1055:1: (this_INTERVAL_0= ruleINTERVAL | this_LSET_1= ruleLSET )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1055:1: (this_INTERVAL_0= ruleINTERVAL | this_LSET_1= ruleLSET )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=46 && LA11_0<=47)) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1056:5: this_INTERVAL_0= ruleINTERVAL
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRANGEAccess().getINTERVALParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleINTERVAL_in_ruleRANGE2246);
                    this_INTERVAL_0=ruleINTERVAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_INTERVAL_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1066:5: this_LSET_1= ruleLSET
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRANGEAccess().getLSETParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLSET_in_ruleRANGE2273);
                    this_LSET_1=ruleLSET();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LSET_1; 
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
    // $ANTLR end "ruleRANGE"


    // $ANTLR start "entryRuleINTERVAL"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1082:1: entryRuleINTERVAL returns [EObject current=null] : iv_ruleINTERVAL= ruleINTERVAL EOF ;
    public final EObject entryRuleINTERVAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINTERVAL = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1083:2: (iv_ruleINTERVAL= ruleINTERVAL EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1084:2: iv_ruleINTERVAL= ruleINTERVAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTERVALRule()); 
            }
            pushFollow(FOLLOW_ruleINTERVAL_in_entryRuleINTERVAL2308);
            iv_ruleINTERVAL=ruleINTERVAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTERVAL; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTERVAL2318); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTERVAL"


    // $ANTLR start "ruleINTERVAL"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1091:1: ruleINTERVAL returns [EObject current=null] : ( ( ( (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' ) ) ) ( (lv_min_1_0= ruleLiteral ) ) otherlv_2= '..' ( (lv_max_3_0= ruleLiteral ) ) ( ( (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' ) ) ) ) ;
    public final EObject ruleINTERVAL() throws RecognitionException {
        EObject current = null;

        Token lv_lsqbr_0_1=null;
        Token lv_lsqbr_0_2=null;
        Token otherlv_2=null;
        Token lv_rsqbr_4_1=null;
        Token lv_rsqbr_4_2=null;
        EObject lv_min_1_0 = null;

        EObject lv_max_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1094:28: ( ( ( ( (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' ) ) ) ( (lv_min_1_0= ruleLiteral ) ) otherlv_2= '..' ( (lv_max_3_0= ruleLiteral ) ) ( ( (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' ) ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1095:1: ( ( ( (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' ) ) ) ( (lv_min_1_0= ruleLiteral ) ) otherlv_2= '..' ( (lv_max_3_0= ruleLiteral ) ) ( ( (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' ) ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1095:1: ( ( ( (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' ) ) ) ( (lv_min_1_0= ruleLiteral ) ) otherlv_2= '..' ( (lv_max_3_0= ruleLiteral ) ) ( ( (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1095:2: ( ( (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' ) ) ) ( (lv_min_1_0= ruleLiteral ) ) otherlv_2= '..' ( (lv_max_3_0= ruleLiteral ) ) ( ( (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1095:2: ( ( (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1096:1: ( (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1096:1: ( (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1097:1: (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1097:1: (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==46) ) {
                alt12=1;
            }
            else if ( (LA12_0==47) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1098:3: lv_lsqbr_0_1= ']'
                    {
                    lv_lsqbr_0_1=(Token)match(input,46,FOLLOW_46_in_ruleINTERVAL2363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_lsqbr_0_1, grammarAccess.getINTERVALAccess().getLsqbrRightSquareBracketKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getINTERVALRule());
                      	        }
                             		setWithLastConsumed(current, "lsqbr", lv_lsqbr_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1110:8: lv_lsqbr_0_2= '['
                    {
                    lv_lsqbr_0_2=(Token)match(input,47,FOLLOW_47_in_ruleINTERVAL2392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_lsqbr_0_2, grammarAccess.getINTERVALAccess().getLsqbrLeftSquareBracketKeyword_0_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getINTERVALRule());
                      	        }
                             		setWithLastConsumed(current, "lsqbr", lv_lsqbr_0_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1125:2: ( (lv_min_1_0= ruleLiteral ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1126:1: (lv_min_1_0= ruleLiteral )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1126:1: (lv_min_1_0= ruleLiteral )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1127:3: lv_min_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getINTERVALAccess().getMinLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleINTERVAL2429);
            lv_min_1_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getINTERVALRule());
              	        }
                     		set(
                     			current, 
                     			"min",
                      		lv_min_1_0, 
                      		"Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleINTERVAL2441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getINTERVALAccess().getFullStopFullStopKeyword_2());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1147:1: ( (lv_max_3_0= ruleLiteral ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1148:1: (lv_max_3_0= ruleLiteral )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1148:1: (lv_max_3_0= ruleLiteral )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1149:3: lv_max_3_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getINTERVALAccess().getMaxLiteralParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleINTERVAL2462);
            lv_max_3_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getINTERVALRule());
              	        }
                     		set(
                     			current, 
                     			"max",
                      		lv_max_3_0, 
                      		"Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1165:2: ( ( (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1166:1: ( (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1166:1: ( (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1167:1: (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1167:1: (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==46) ) {
                alt13=1;
            }
            else if ( (LA13_0==47) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1168:3: lv_rsqbr_4_1= ']'
                    {
                    lv_rsqbr_4_1=(Token)match(input,46,FOLLOW_46_in_ruleINTERVAL2482); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_rsqbr_4_1, grammarAccess.getINTERVALAccess().getRsqbrRightSquareBracketKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getINTERVALRule());
                      	        }
                             		setWithLastConsumed(current, "rsqbr", lv_rsqbr_4_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1180:8: lv_rsqbr_4_2= '['
                    {
                    lv_rsqbr_4_2=(Token)match(input,47,FOLLOW_47_in_ruleINTERVAL2511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_rsqbr_4_2, grammarAccess.getINTERVALAccess().getRsqbrLeftSquareBracketKeyword_4_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getINTERVALRule());
                      	        }
                             		setWithLastConsumed(current, "rsqbr", lv_rsqbr_4_2, null);
                      	    
                    }

                    }
                    break;

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
    // $ANTLR end "ruleINTERVAL"


    // $ANTLR start "entryRuleLSET"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1203:1: entryRuleLSET returns [EObject current=null] : iv_ruleLSET= ruleLSET EOF ;
    public final EObject entryRuleLSET() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLSET = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1204:2: (iv_ruleLSET= ruleLSET EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1205:2: iv_ruleLSET= ruleLSET EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLSETRule()); 
            }
            pushFollow(FOLLOW_ruleLSET_in_entryRuleLSET2563);
            iv_ruleLSET=ruleLSET();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLSET; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLSET2573); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLSET"


    // $ANTLR start "ruleLSET"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1212:1: ruleLSET returns [EObject current=null] : (otherlv_0= '{' ( (lv_value_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleLSET() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1215:28: ( (otherlv_0= '{' ( (lv_value_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1216:1: (otherlv_0= '{' ( (lv_value_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1216:1: (otherlv_0= '{' ( (lv_value_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1216:3: otherlv_0= '{' ( (lv_value_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleLiteral ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleLSET2610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLSETAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1220:1: ( (lv_value_1_0= ruleLiteral ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1221:1: (lv_value_1_0= ruleLiteral )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1221:1: (lv_value_1_0= ruleLiteral )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1222:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLSETAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleLSET2631);
            lv_value_1_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLSETRule());
              	        }
                     		add(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1238:2: (otherlv_2= ',' ( (lv_value_3_0= ruleLiteral ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1238:4: otherlv_2= ',' ( (lv_value_3_0= ruleLiteral ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleLSET2644); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLSETAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1242:1: ( (lv_value_3_0= ruleLiteral ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1243:1: (lv_value_3_0= ruleLiteral )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1243:1: (lv_value_3_0= ruleLiteral )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1244:3: lv_value_3_0= ruleLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLSETAccess().getValueLiteralParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLiteral_in_ruleLSET2665);
            	    lv_value_3_0=ruleLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLSETRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"value",
            	              		lv_value_3_0, 
            	              		"Literal");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleLSET2679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLSETAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleLSET"


    // $ANTLR start "entryRuleLiteral"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1272:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1273:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1274:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2715);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2725); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1281:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (lv_value_15_0= RULE_IDENT ) ) ) | ( () ( (lv_value_17_0= '?' ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token lv_value_9_0=null;
        Token lv_value_11_0=null;
        Token lv_value_13_0=null;
        Token lv_value_15_0=null;
        Token lv_value_17_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1284:28: ( ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (lv_value_15_0= RULE_IDENT ) ) ) | ( () ( (lv_value_17_0= '?' ) ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1285:1: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (lv_value_15_0= RULE_IDENT ) ) ) | ( () ( (lv_value_17_0= '?' ) ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1285:1: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (lv_value_15_0= RULE_IDENT ) ) ) | ( () ( (lv_value_17_0= '?' ) ) ) )
            int alt15=9;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1285:2: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1285:2: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1285:3: () ( (lv_value_1_0= ruleINTEGER ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1285:3: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1286:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getIntLITERALAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1291:2: ( (lv_value_1_0= ruleINTEGER ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1292:1: (lv_value_1_0= ruleINTEGER )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1292:1: (lv_value_1_0= ruleINTEGER )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1293:3: lv_value_1_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getValueINTEGERParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleINTEGER_in_ruleLiteral2781);
                    lv_value_1_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"INTEGER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1310:6: ( () ( (lv_value_3_0= ruleDECIMAL ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1310:6: ( () ( (lv_value_3_0= ruleDECIMAL ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1310:7: () ( (lv_value_3_0= ruleDECIMAL ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1310:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1311:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getRealLITERALAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1316:2: ( (lv_value_3_0= ruleDECIMAL ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1317:1: (lv_value_3_0= ruleDECIMAL )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1317:1: (lv_value_3_0= ruleDECIMAL )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1318:3: lv_value_3_0= ruleDECIMAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getValueDECIMALParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleLiteral2819);
                    lv_value_3_0=ruleDECIMAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"DECIMAL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1335:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1335:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1335:7: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1335:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1336:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getBoolLITERALAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1341:2: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1342:1: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1342:1: (lv_value_5_0= RULE_BOOLEAN )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1343:3: lv_value_5_0= RULE_BOOLEAN
                    {
                    lv_value_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleLiteral2853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_5_0, grammarAccess.getLiteralAccess().getValueBOOLEANTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_5_0, 
                              		"BOOLEAN");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1360:6: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1360:6: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1360:7: () ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1360:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1361:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getStrLITERALAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1366:2: ( (lv_value_7_0= RULE_STRING ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1367:1: (lv_value_7_0= RULE_STRING )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1367:1: (lv_value_7_0= RULE_STRING )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1368:3: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral2892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_7_0, grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_7_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1385:6: ( () ( (lv_value_9_0= RULE_ENUM_ELEMENT ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1385:6: ( () ( (lv_value_9_0= RULE_ENUM_ELEMENT ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1385:7: () ( (lv_value_9_0= RULE_ENUM_ELEMENT ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1385:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1386:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getEnumLITERALAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1391:2: ( (lv_value_9_0= RULE_ENUM_ELEMENT ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1392:1: (lv_value_9_0= RULE_ENUM_ELEMENT )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1392:1: (lv_value_9_0= RULE_ENUM_ELEMENT )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1393:3: lv_value_9_0= RULE_ENUM_ELEMENT
                    {
                    lv_value_9_0=(Token)match(input,RULE_ENUM_ELEMENT,FOLLOW_RULE_ENUM_ELEMENT_in_ruleLiteral2931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_9_0, grammarAccess.getLiteralAccess().getValueENUM_ELEMENTTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_9_0, 
                              		"ENUM_ELEMENT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1410:6: ( () ( (lv_value_11_0= RULE_BIT ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1410:6: ( () ( (lv_value_11_0= RULE_BIT ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1410:7: () ( (lv_value_11_0= RULE_BIT ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1410:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1411:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getBitLITERALAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1416:2: ( (lv_value_11_0= RULE_BIT ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1417:1: (lv_value_11_0= RULE_BIT )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1417:1: (lv_value_11_0= RULE_BIT )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1418:3: lv_value_11_0= RULE_BIT
                    {
                    lv_value_11_0=(Token)match(input,RULE_BIT,FOLLOW_RULE_BIT_in_ruleLiteral2970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_11_0, grammarAccess.getLiteralAccess().getValueBITTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_11_0, 
                              		"BIT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1435:6: ( () ( (lv_value_13_0= RULE_HEX ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1435:6: ( () ( (lv_value_13_0= RULE_HEX ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1435:7: () ( (lv_value_13_0= RULE_HEX ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1435:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1436:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getHexLITERALAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1441:2: ( (lv_value_13_0= RULE_HEX ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1442:1: (lv_value_13_0= RULE_HEX )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1442:1: (lv_value_13_0= RULE_HEX )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1443:3: lv_value_13_0= RULE_HEX
                    {
                    lv_value_13_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleLiteral3009); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_13_0, grammarAccess.getLiteralAccess().getValueHEXTerminalRuleCall_6_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_13_0, 
                              		"HEX");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1460:6: ( () ( (lv_value_15_0= RULE_IDENT ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1460:6: ( () ( (lv_value_15_0= RULE_IDENT ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1460:7: () ( (lv_value_15_0= RULE_IDENT ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1460:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1461:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getIdentLITERALAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1466:2: ( (lv_value_15_0= RULE_IDENT ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1467:1: (lv_value_15_0= RULE_IDENT )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1467:1: (lv_value_15_0= RULE_IDENT )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1468:3: lv_value_15_0= RULE_IDENT
                    {
                    lv_value_15_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleLiteral3048); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_15_0, grammarAccess.getLiteralAccess().getValueIDENTTerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_15_0, 
                              		"IDENT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1485:6: ( () ( (lv_value_17_0= '?' ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1485:6: ( () ( (lv_value_17_0= '?' ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1485:7: () ( (lv_value_17_0= '?' ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1485:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1486:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getUnknowLITERALAction_8_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1491:2: ( (lv_value_17_0= '?' ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1492:1: (lv_value_17_0= '?' )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1492:1: (lv_value_17_0= '?' )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1493:3: lv_value_17_0= '?'
                    {
                    lv_value_17_0=(Token)match(input,49,FOLLOW_49_in_ruleLiteral3088); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_17_0, grammarAccess.getLiteralAccess().getValueQuestionMarkKeyword_8_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_17_0, "?");
                      	    
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleINSTRUCTION"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1514:1: entryRuleINSTRUCTION returns [EObject current=null] : iv_ruleINSTRUCTION= ruleINSTRUCTION EOF ;
    public final EObject entryRuleINSTRUCTION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINSTRUCTION = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1515:2: (iv_ruleINSTRUCTION= ruleINSTRUCTION EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1516:2: iv_ruleINSTRUCTION= ruleINSTRUCTION EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINSTRUCTIONRule()); 
            }
            pushFollow(FOLLOW_ruleINSTRUCTION_in_entryRuleINSTRUCTION3138);
            iv_ruleINSTRUCTION=ruleINSTRUCTION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINSTRUCTION; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleINSTRUCTION3148); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINSTRUCTION"


    // $ANTLR start "ruleINSTRUCTION"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1523:1: ruleINSTRUCTION returns [EObject current=null] : (this_IF_INSTR_0= ruleIF_INSTR | this_LOOP_INSTR_1= ruleLOOP_INSTR | this_ASSIGN_INSTR_2= ruleASSIGN_INSTR | this_ERROR_INSTR_3= ruleERROR_INSTR | this_NULL_INSTR_4= ruleNULL_INSTR ) ;
    public final EObject ruleINSTRUCTION() throws RecognitionException {
        EObject current = null;

        EObject this_IF_INSTR_0 = null;

        EObject this_LOOP_INSTR_1 = null;

        EObject this_ASSIGN_INSTR_2 = null;

        EObject this_ERROR_INSTR_3 = null;

        EObject this_NULL_INSTR_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1526:28: ( (this_IF_INSTR_0= ruleIF_INSTR | this_LOOP_INSTR_1= ruleLOOP_INSTR | this_ASSIGN_INSTR_2= ruleASSIGN_INSTR | this_ERROR_INSTR_3= ruleERROR_INSTR | this_NULL_INSTR_4= ruleNULL_INSTR ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1527:1: (this_IF_INSTR_0= ruleIF_INSTR | this_LOOP_INSTR_1= ruleLOOP_INSTR | this_ASSIGN_INSTR_2= ruleASSIGN_INSTR | this_ERROR_INSTR_3= ruleERROR_INSTR | this_NULL_INSTR_4= ruleNULL_INSTR )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1527:1: (this_IF_INSTR_0= ruleIF_INSTR | this_LOOP_INSTR_1= ruleLOOP_INSTR | this_ASSIGN_INSTR_2= ruleASSIGN_INSTR | this_ERROR_INSTR_3= ruleERROR_INSTR | this_NULL_INSTR_4= ruleNULL_INSTR )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt16=1;
                }
                break;
            case 52:
                {
                alt16=2;
                }
                break;
            case RULE_IDENT:
                {
                alt16=3;
                }
                break;
            case 53:
                {
                alt16=4;
                }
                break;
            case 54:
                {
                alt16=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1528:5: this_IF_INSTR_0= ruleIF_INSTR
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getIF_INSTRParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIF_INSTR_in_ruleINSTRUCTION3195);
                    this_IF_INSTR_0=ruleIF_INSTR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IF_INSTR_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1538:5: this_LOOP_INSTR_1= ruleLOOP_INSTR
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getLOOP_INSTRParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLOOP_INSTR_in_ruleINSTRUCTION3222);
                    this_LOOP_INSTR_1=ruleLOOP_INSTR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LOOP_INSTR_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1548:5: this_ASSIGN_INSTR_2= ruleASSIGN_INSTR
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getASSIGN_INSTRParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleASSIGN_INSTR_in_ruleINSTRUCTION3249);
                    this_ASSIGN_INSTR_2=ruleASSIGN_INSTR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ASSIGN_INSTR_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1558:5: this_ERROR_INSTR_3= ruleERROR_INSTR
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getERROR_INSTRParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleERROR_INSTR_in_ruleINSTRUCTION3276);
                    this_ERROR_INSTR_3=ruleERROR_INSTR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ERROR_INSTR_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1568:5: this_NULL_INSTR_4= ruleNULL_INSTR
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getNULL_INSTRParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNULL_INSTR_in_ruleINSTRUCTION3303);
                    this_NULL_INSTR_4=ruleNULL_INSTR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NULL_INSTR_4; 
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
    // $ANTLR end "ruleINSTRUCTION"


    // $ANTLR start "entryRuleIF_INSTR"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1584:1: entryRuleIF_INSTR returns [EObject current=null] : iv_ruleIF_INSTR= ruleIF_INSTR EOF ;
    public final EObject entryRuleIF_INSTR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIF_INSTR = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1585:2: (iv_ruleIF_INSTR= ruleIF_INSTR EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1586:2: iv_ruleIF_INSTR= ruleIF_INSTR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIF_INSTRRule()); 
            }
            pushFollow(FOLLOW_ruleIF_INSTR_in_entryRuleIF_INSTR3338);
            iv_ruleIF_INSTR=ruleIF_INSTR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIF_INSTR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIF_INSTR3348); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIF_INSTR"


    // $ANTLR start "ruleIF_INSTR"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1593:1: ruleIF_INSTR returns [EObject current=null] : (otherlv_0= '(' ( (lv_ifcond_1_0= ruleEXPRESSION ) ) otherlv_2= ')' otherlv_3= '=>' otherlv_4= '{' ( (lv_ifst_5_0= ruleINSTRUCTION ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) (otherlv_8= '=>' )? otherlv_9= '{' ( (lv_elst_10_0= ruleINSTRUCTION ) ) otherlv_11= '}' ) ) ;
    public final EObject ruleIF_INSTR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_ifcond_1_0 = null;

        EObject lv_ifst_5_0 = null;

        EObject lv_elst_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1596:28: ( (otherlv_0= '(' ( (lv_ifcond_1_0= ruleEXPRESSION ) ) otherlv_2= ')' otherlv_3= '=>' otherlv_4= '{' ( (lv_ifst_5_0= ruleINSTRUCTION ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) (otherlv_8= '=>' )? otherlv_9= '{' ( (lv_elst_10_0= ruleINSTRUCTION ) ) otherlv_11= '}' ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1597:1: (otherlv_0= '(' ( (lv_ifcond_1_0= ruleEXPRESSION ) ) otherlv_2= ')' otherlv_3= '=>' otherlv_4= '{' ( (lv_ifst_5_0= ruleINSTRUCTION ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) (otherlv_8= '=>' )? otherlv_9= '{' ( (lv_elst_10_0= ruleINSTRUCTION ) ) otherlv_11= '}' ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1597:1: (otherlv_0= '(' ( (lv_ifcond_1_0= ruleEXPRESSION ) ) otherlv_2= ')' otherlv_3= '=>' otherlv_4= '{' ( (lv_ifst_5_0= ruleINSTRUCTION ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) (otherlv_8= '=>' )? otherlv_9= '{' ( (lv_elst_10_0= ruleINSTRUCTION ) ) otherlv_11= '}' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1597:3: otherlv_0= '(' ( (lv_ifcond_1_0= ruleEXPRESSION ) ) otherlv_2= ')' otherlv_3= '=>' otherlv_4= '{' ( (lv_ifst_5_0= ruleINSTRUCTION ) ) otherlv_6= '}' ( ( ( 'else' )=>otherlv_7= 'else' ) (otherlv_8= '=>' )? otherlv_9= '{' ( (lv_elst_10_0= ruleINSTRUCTION ) ) otherlv_11= '}' )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleIF_INSTR3385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIF_INSTRAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1601:1: ( (lv_ifcond_1_0= ruleEXPRESSION ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1602:1: (lv_ifcond_1_0= ruleEXPRESSION )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1602:1: (lv_ifcond_1_0= ruleEXPRESSION )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1603:3: lv_ifcond_1_0= ruleEXPRESSION
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIF_INSTRAccess().getIfcondEXPRESSIONParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleIF_INSTR3406);
            lv_ifcond_1_0=ruleEXPRESSION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIF_INSTRRule());
              	        }
                     		set(
                     			current, 
                     			"ifcond",
                      		lv_ifcond_1_0, 
                      		"EXPRESSION");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleIF_INSTR3418); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIF_INSTRAccess().getRightParenthesisKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleIF_INSTR3430); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIF_INSTRAccess().getEqualsSignGreaterThanSignKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleIF_INSTR3442); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIF_INSTRAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1631:1: ( (lv_ifst_5_0= ruleINSTRUCTION ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1632:1: (lv_ifst_5_0= ruleINSTRUCTION )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1632:1: (lv_ifst_5_0= ruleINSTRUCTION )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1633:3: lv_ifst_5_0= ruleINSTRUCTION
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIF_INSTRAccess().getIfstINSTRUCTIONParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleINSTRUCTION_in_ruleIF_INSTR3463);
            lv_ifst_5_0=ruleINSTRUCTION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIF_INSTRRule());
              	        }
                     		set(
                     			current, 
                     			"ifst",
                      		lv_ifst_5_0, 
                      		"INSTRUCTION");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleIF_INSTR3475); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getIF_INSTRAccess().getRightCurlyBracketKeyword_6());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1653:1: ( ( ( 'else' )=>otherlv_7= 'else' ) (otherlv_8= '=>' )? otherlv_9= '{' ( (lv_elst_10_0= ruleINSTRUCTION ) ) otherlv_11= '}' )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1653:2: ( ( 'else' )=>otherlv_7= 'else' ) (otherlv_8= '=>' )? otherlv_9= '{' ( (lv_elst_10_0= ruleINSTRUCTION ) ) otherlv_11= '}'
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1653:2: ( ( 'else' )=>otherlv_7= 'else' )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1653:3: ( 'else' )=>otherlv_7= 'else'
            {
            otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleIF_INSTR3496); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getIF_INSTRAccess().getElseKeyword_7_0());
                  
            }

            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1658:2: (otherlv_8= '=>' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==50) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1658:4: otherlv_8= '=>'
                    {
                    otherlv_8=(Token)match(input,50,FOLLOW_50_in_ruleIF_INSTR3510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getIF_INSTRAccess().getEqualsSignGreaterThanSignKeyword_7_1());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleIF_INSTR3524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getIF_INSTRAccess().getLeftCurlyBracketKeyword_7_2());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1666:1: ( (lv_elst_10_0= ruleINSTRUCTION ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1667:1: (lv_elst_10_0= ruleINSTRUCTION )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1667:1: (lv_elst_10_0= ruleINSTRUCTION )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1668:3: lv_elst_10_0= ruleINSTRUCTION
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIF_INSTRAccess().getElstINSTRUCTIONParserRuleCall_7_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleINSTRUCTION_in_ruleIF_INSTR3545);
            lv_elst_10_0=ruleINSTRUCTION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIF_INSTRRule());
              	        }
                     		set(
                     			current, 
                     			"elst",
                      		lv_elst_10_0, 
                      		"INSTRUCTION");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleIF_INSTR3557); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getIF_INSTRAccess().getRightCurlyBracketKeyword_7_4());
                  
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
    // $ANTLR end "ruleIF_INSTR"


    // $ANTLR start "entryRuleLOOP_INSTR"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1696:1: entryRuleLOOP_INSTR returns [EObject current=null] : iv_ruleLOOP_INSTR= ruleLOOP_INSTR EOF ;
    public final EObject entryRuleLOOP_INSTR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLOOP_INSTR = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1697:2: (iv_ruleLOOP_INSTR= ruleLOOP_INSTR EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1698:2: iv_ruleLOOP_INSTR= ruleLOOP_INSTR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOOP_INSTRRule()); 
            }
            pushFollow(FOLLOW_ruleLOOP_INSTR_in_entryRuleLOOP_INSTR3594);
            iv_ruleLOOP_INSTR=ruleLOOP_INSTR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOOP_INSTR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOOP_INSTR3604); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLOOP_INSTR"


    // $ANTLR start "ruleLOOP_INSTR"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1705:1: ruleLOOP_INSTR returns [EObject current=null] : (otherlv_0= 'loop' otherlv_1= '(' ( (lv_val_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleLOOP_INSTR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_val_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1708:28: ( (otherlv_0= 'loop' otherlv_1= '(' ( (lv_val_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1709:1: (otherlv_0= 'loop' otherlv_1= '(' ( (lv_val_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1709:1: (otherlv_0= 'loop' otherlv_1= '(' ( (lv_val_2_0= RULE_INT ) ) otherlv_3= ')' )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1709:3: otherlv_0= 'loop' otherlv_1= '(' ( (lv_val_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleLOOP_INSTR3641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLOOP_INSTRAccess().getLoopKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleLOOP_INSTR3653); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLOOP_INSTRAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1717:1: ( (lv_val_2_0= RULE_INT ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1718:1: (lv_val_2_0= RULE_INT )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1718:1: (lv_val_2_0= RULE_INT )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1719:3: lv_val_2_0= RULE_INT
            {
            lv_val_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLOOP_INSTR3670); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_val_2_0, grammarAccess.getLOOP_INSTRAccess().getValINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLOOP_INSTRRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"val",
                      		lv_val_2_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleLOOP_INSTR3687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLOOP_INSTRAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleLOOP_INSTR"


    // $ANTLR start "entryRuleERROR_INSTR"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1747:1: entryRuleERROR_INSTR returns [EObject current=null] : iv_ruleERROR_INSTR= ruleERROR_INSTR EOF ;
    public final EObject entryRuleERROR_INSTR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERROR_INSTR = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1748:2: (iv_ruleERROR_INSTR= ruleERROR_INSTR EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1749:2: iv_ruleERROR_INSTR= ruleERROR_INSTR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getERROR_INSTRRule()); 
            }
            pushFollow(FOLLOW_ruleERROR_INSTR_in_entryRuleERROR_INSTR3723);
            iv_ruleERROR_INSTR=ruleERROR_INSTR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleERROR_INSTR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleERROR_INSTR3733); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERROR_INSTR"


    // $ANTLR start "ruleERROR_INSTR"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1756:1: ruleERROR_INSTR returns [EObject current=null] : (otherlv_0= 'error' () ( (lv_end_2_0= ruleEND ) ) ) ;
    public final EObject ruleERROR_INSTR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_end_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1759:28: ( (otherlv_0= 'error' () ( (lv_end_2_0= ruleEND ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1760:1: (otherlv_0= 'error' () ( (lv_end_2_0= ruleEND ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1760:1: (otherlv_0= 'error' () ( (lv_end_2_0= ruleEND ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1760:3: otherlv_0= 'error' () ( (lv_end_2_0= ruleEND ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleERROR_INSTR3770); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getERROR_INSTRAccess().getErrorKeyword_0());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1764:1: ()
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1765:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getERROR_INSTRAccess().getERROR_ASSIGNAction_1(),
                          current);
                  
            }

            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1770:2: ( (lv_end_2_0= ruleEND ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1771:1: (lv_end_2_0= ruleEND )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1771:1: (lv_end_2_0= ruleEND )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1772:3: lv_end_2_0= ruleEND
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getERROR_INSTRAccess().getEndENDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEND_in_ruleERROR_INSTR3800);
            lv_end_2_0=ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getERROR_INSTRRule());
              	        }
                     		set(
                     			current, 
                     			"end",
                      		lv_end_2_0, 
                      		"END");
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
    // $ANTLR end "ruleERROR_INSTR"


    // $ANTLR start "entryRuleNULL_INSTR"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1796:1: entryRuleNULL_INSTR returns [EObject current=null] : iv_ruleNULL_INSTR= ruleNULL_INSTR EOF ;
    public final EObject entryRuleNULL_INSTR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNULL_INSTR = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1797:2: (iv_ruleNULL_INSTR= ruleNULL_INSTR EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1798:2: iv_ruleNULL_INSTR= ruleNULL_INSTR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNULL_INSTRRule()); 
            }
            pushFollow(FOLLOW_ruleNULL_INSTR_in_entryRuleNULL_INSTR3836);
            iv_ruleNULL_INSTR=ruleNULL_INSTR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNULL_INSTR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNULL_INSTR3846); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNULL_INSTR"


    // $ANTLR start "ruleNULL_INSTR"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1805:1: ruleNULL_INSTR returns [EObject current=null] : (otherlv_0= 'null' () ( (lv_end_2_0= ruleEND ) ) ) ;
    public final EObject ruleNULL_INSTR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_end_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1808:28: ( (otherlv_0= 'null' () ( (lv_end_2_0= ruleEND ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1809:1: (otherlv_0= 'null' () ( (lv_end_2_0= ruleEND ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1809:1: (otherlv_0= 'null' () ( (lv_end_2_0= ruleEND ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1809:3: otherlv_0= 'null' () ( (lv_end_2_0= ruleEND ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleNULL_INSTR3883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNULL_INSTRAccess().getNullKeyword_0());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1813:1: ()
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1814:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNULL_INSTRAccess().getNULL_ASSIGNAction_1(),
                          current);
                  
            }

            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1819:2: ( (lv_end_2_0= ruleEND ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1820:1: (lv_end_2_0= ruleEND )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1820:1: (lv_end_2_0= ruleEND )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1821:3: lv_end_2_0= ruleEND
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNULL_INSTRAccess().getEndENDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEND_in_ruleNULL_INSTR3913);
            lv_end_2_0=ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNULL_INSTRRule());
              	        }
                     		set(
                     			current, 
                     			"end",
                      		lv_end_2_0, 
                      		"END");
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
    // $ANTLR end "ruleNULL_INSTR"


    // $ANTLR start "entryRuleASSIGN_INSTR"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1845:1: entryRuleASSIGN_INSTR returns [EObject current=null] : iv_ruleASSIGN_INSTR= ruleASSIGN_INSTR EOF ;
    public final EObject entryRuleASSIGN_INSTR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASSIGN_INSTR = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1846:2: (iv_ruleASSIGN_INSTR= ruleASSIGN_INSTR EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1847:2: iv_ruleASSIGN_INSTR= ruleASSIGN_INSTR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getASSIGN_INSTRRule()); 
            }
            pushFollow(FOLLOW_ruleASSIGN_INSTR_in_entryRuleASSIGN_INSTR3949);
            iv_ruleASSIGN_INSTR=ruleASSIGN_INSTR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleASSIGN_INSTR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleASSIGN_INSTR3959); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleASSIGN_INSTR"


    // $ANTLR start "ruleASSIGN_INSTR"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1854:1: ruleASSIGN_INSTR returns [EObject current=null] : ( ( (lv_sa_0_0= ruleSINGLE_ASSIGN ) ) (otherlv_1= ',' ( (lv_sa_2_0= ruleSINGLE_ASSIGN ) ) )* ( (lv_end_3_0= ruleEND ) ) ) ;
    public final EObject ruleASSIGN_INSTR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sa_0_0 = null;

        EObject lv_sa_2_0 = null;

        EObject lv_end_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1857:28: ( ( ( (lv_sa_0_0= ruleSINGLE_ASSIGN ) ) (otherlv_1= ',' ( (lv_sa_2_0= ruleSINGLE_ASSIGN ) ) )* ( (lv_end_3_0= ruleEND ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1858:1: ( ( (lv_sa_0_0= ruleSINGLE_ASSIGN ) ) (otherlv_1= ',' ( (lv_sa_2_0= ruleSINGLE_ASSIGN ) ) )* ( (lv_end_3_0= ruleEND ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1858:1: ( ( (lv_sa_0_0= ruleSINGLE_ASSIGN ) ) (otherlv_1= ',' ( (lv_sa_2_0= ruleSINGLE_ASSIGN ) ) )* ( (lv_end_3_0= ruleEND ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1858:2: ( (lv_sa_0_0= ruleSINGLE_ASSIGN ) ) (otherlv_1= ',' ( (lv_sa_2_0= ruleSINGLE_ASSIGN ) ) )* ( (lv_end_3_0= ruleEND ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1858:2: ( (lv_sa_0_0= ruleSINGLE_ASSIGN ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1859:1: (lv_sa_0_0= ruleSINGLE_ASSIGN )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1859:1: (lv_sa_0_0= ruleSINGLE_ASSIGN )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1860:3: lv_sa_0_0= ruleSINGLE_ASSIGN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getASSIGN_INSTRAccess().getSaSINGLE_ASSIGNParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSINGLE_ASSIGN_in_ruleASSIGN_INSTR4005);
            lv_sa_0_0=ruleSINGLE_ASSIGN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getASSIGN_INSTRRule());
              	        }
                     		add(
                     			current, 
                     			"sa",
                      		lv_sa_0_0, 
                      		"SINGLE_ASSIGN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1876:2: (otherlv_1= ',' ( (lv_sa_2_0= ruleSINGLE_ASSIGN ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1876:4: otherlv_1= ',' ( (lv_sa_2_0= ruleSINGLE_ASSIGN ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleASSIGN_INSTR4018); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getASSIGN_INSTRAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1880:1: ( (lv_sa_2_0= ruleSINGLE_ASSIGN ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1881:1: (lv_sa_2_0= ruleSINGLE_ASSIGN )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1881:1: (lv_sa_2_0= ruleSINGLE_ASSIGN )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1882:3: lv_sa_2_0= ruleSINGLE_ASSIGN
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getASSIGN_INSTRAccess().getSaSINGLE_ASSIGNParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSINGLE_ASSIGN_in_ruleASSIGN_INSTR4039);
            	    lv_sa_2_0=ruleSINGLE_ASSIGN();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getASSIGN_INSTRRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sa",
            	              		lv_sa_2_0, 
            	              		"SINGLE_ASSIGN");
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

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1898:4: ( (lv_end_3_0= ruleEND ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1899:1: (lv_end_3_0= ruleEND )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1899:1: (lv_end_3_0= ruleEND )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1900:3: lv_end_3_0= ruleEND
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getASSIGN_INSTRAccess().getEndENDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEND_in_ruleASSIGN_INSTR4062);
            lv_end_3_0=ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getASSIGN_INSTRRule());
              	        }
                     		set(
                     			current, 
                     			"end",
                      		lv_end_3_0, 
                      		"END");
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
    // $ANTLR end "ruleASSIGN_INSTR"


    // $ANTLR start "entryRuleSINGLE_ASSIGN"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1924:1: entryRuleSINGLE_ASSIGN returns [EObject current=null] : iv_ruleSINGLE_ASSIGN= ruleSINGLE_ASSIGN EOF ;
    public final EObject entryRuleSINGLE_ASSIGN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSINGLE_ASSIGN = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1925:2: (iv_ruleSINGLE_ASSIGN= ruleSINGLE_ASSIGN EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1926:2: iv_ruleSINGLE_ASSIGN= ruleSINGLE_ASSIGN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSINGLE_ASSIGNRule()); 
            }
            pushFollow(FOLLOW_ruleSINGLE_ASSIGN_in_entryRuleSINGLE_ASSIGN4098);
            iv_ruleSINGLE_ASSIGN=ruleSINGLE_ASSIGN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSINGLE_ASSIGN; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSINGLE_ASSIGN4108); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSINGLE_ASSIGN"


    // $ANTLR start "ruleSINGLE_ASSIGN"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1933:1: ruleSINGLE_ASSIGN returns [EObject current=null] : ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleEXPRESSION ) ) ) ;
    public final EObject ruleSINGLE_ASSIGN() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1936:28: ( ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleEXPRESSION ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1937:1: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleEXPRESSION ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1937:1: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleEXPRESSION ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1937:2: ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleEXPRESSION ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1937:2: ( (otherlv_0= RULE_IDENT ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1938:1: (otherlv_0= RULE_IDENT )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1938:1: (otherlv_0= RULE_IDENT )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1939:3: otherlv_0= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSINGLE_ASSIGNRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleSINGLE_ASSIGN4153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getSINGLE_ASSIGNAccess().getVarVAR_CSTCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleSINGLE_ASSIGN4165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSINGLE_ASSIGNAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1954:1: ( (lv_exp_2_0= ruleEXPRESSION ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1955:1: (lv_exp_2_0= ruleEXPRESSION )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1955:1: (lv_exp_2_0= ruleEXPRESSION )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1956:3: lv_exp_2_0= ruleEXPRESSION
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSINGLE_ASSIGNAccess().getExpEXPRESSIONParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleSINGLE_ASSIGN4186);
            lv_exp_2_0=ruleEXPRESSION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSINGLE_ASSIGNRule());
              	        }
                     		set(
                     			current, 
                     			"exp",
                      		lv_exp_2_0, 
                      		"EXPRESSION");
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
    // $ANTLR end "ruleSINGLE_ASSIGN"


    // $ANTLR start "entryRuleEXPRESSION"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1980:1: entryRuleEXPRESSION returns [EObject current=null] : iv_ruleEXPRESSION= ruleEXPRESSION EOF ;
    public final EObject entryRuleEXPRESSION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEXPRESSION = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1981:2: (iv_ruleEXPRESSION= ruleEXPRESSION EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1982:2: iv_ruleEXPRESSION= ruleEXPRESSION EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXPRESSIONRule()); 
            }
            pushFollow(FOLLOW_ruleEXPRESSION_in_entryRuleEXPRESSION4222);
            iv_ruleEXPRESSION=ruleEXPRESSION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXPRESSION; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRESSION4232); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXPRESSION"


    // $ANTLR start "ruleEXPRESSION"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1989:1: ruleEXPRESSION returns [EObject current=null] : this_OR_0= ruleOR ;
    public final EObject ruleEXPRESSION() throws RecognitionException {
        EObject current = null;

        EObject this_OR_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1992:28: (this_OR_0= ruleOR )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1994:5: this_OR_0= ruleOR
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEXPRESSIONAccess().getORParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOR_in_ruleEXPRESSION4278);
            this_OR_0=ruleOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OR_0; 
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
    // $ANTLR end "ruleEXPRESSION"


    // $ANTLR start "entryRuleOR"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2010:1: entryRuleOR returns [EObject current=null] : iv_ruleOR= ruleOR EOF ;
    public final EObject entryRuleOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOR = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2011:2: (iv_ruleOR= ruleOR EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2012:2: iv_ruleOR= ruleOR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getORRule()); 
            }
            pushFollow(FOLLOW_ruleOR_in_entryRuleOR4312);
            iv_ruleOR=ruleOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOR4322); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOR"


    // $ANTLR start "ruleOR"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2019:1: ruleOR returns [EObject current=null] : (this_AND_0= ruleAND ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAND ) ) )* ) ;
    public final EObject ruleOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AND_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2022:28: ( (this_AND_0= ruleAND ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAND ) ) )* ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2023:1: (this_AND_0= ruleAND ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAND ) ) )* )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2023:1: (this_AND_0= ruleAND ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAND ) ) )* )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2024:5: this_AND_0= ruleAND ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAND ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getORAccess().getANDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAND_in_ruleOR4369);
            this_AND_0=ruleAND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AND_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2032:1: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAND ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==56) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2032:2: () otherlv_2= 'or' ( (lv_right_3_0= ruleAND ) )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2032:2: ()
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2033:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getORAccess().getORLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleOR4390); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getORAccess().getOrKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2042:1: ( (lv_right_3_0= ruleAND ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2043:1: (lv_right_3_0= ruleAND )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2043:1: (lv_right_3_0= ruleAND )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2044:3: lv_right_3_0= ruleAND
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getORAccess().getRightANDParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAND_in_ruleOR4411);
            	    lv_right_3_0=ruleAND();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getORRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"AND");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleOR"


    // $ANTLR start "entryRuleAND"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2068:1: entryRuleAND returns [EObject current=null] : iv_ruleAND= ruleAND EOF ;
    public final EObject entryRuleAND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAND = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2069:2: (iv_ruleAND= ruleAND EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2070:2: iv_ruleAND= ruleAND EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getANDRule()); 
            }
            pushFollow(FOLLOW_ruleAND_in_entryRuleAND4449);
            iv_ruleAND=ruleAND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAND; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAND4459); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAND"


    // $ANTLR start "ruleAND"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2077:1: ruleAND returns [EObject current=null] : (this_EQUAL_DIFF_0= ruleEQUAL_DIFF ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEQUAL_DIFF ) ) )* ) ;
    public final EObject ruleAND() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EQUAL_DIFF_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2080:28: ( (this_EQUAL_DIFF_0= ruleEQUAL_DIFF ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEQUAL_DIFF ) ) )* ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2081:1: (this_EQUAL_DIFF_0= ruleEQUAL_DIFF ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEQUAL_DIFF ) ) )* )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2081:1: (this_EQUAL_DIFF_0= ruleEQUAL_DIFF ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEQUAL_DIFF ) ) )* )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2082:5: this_EQUAL_DIFF_0= ruleEQUAL_DIFF ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEQUAL_DIFF ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getANDAccess().getEQUAL_DIFFParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEQUAL_DIFF_in_ruleAND4506);
            this_EQUAL_DIFF_0=ruleEQUAL_DIFF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EQUAL_DIFF_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2090:1: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEQUAL_DIFF ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==57) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2090:2: () otherlv_2= 'and' ( (lv_right_3_0= ruleEQUAL_DIFF ) )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2090:2: ()
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2091:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getANDAccess().getANDLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleAND4527); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getANDAccess().getAndKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2100:1: ( (lv_right_3_0= ruleEQUAL_DIFF ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2101:1: (lv_right_3_0= ruleEQUAL_DIFF )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2101:1: (lv_right_3_0= ruleEQUAL_DIFF )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2102:3: lv_right_3_0= ruleEQUAL_DIFF
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getANDAccess().getRightEQUAL_DIFFParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEQUAL_DIFF_in_ruleAND4548);
            	    lv_right_3_0=ruleEQUAL_DIFF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getANDRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"EQUAL_DIFF");
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
    // $ANTLR end "ruleAND"


    // $ANTLR start "entryRuleEQUAL_DIFF"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2126:1: entryRuleEQUAL_DIFF returns [EObject current=null] : iv_ruleEQUAL_DIFF= ruleEQUAL_DIFF EOF ;
    public final EObject entryRuleEQUAL_DIFF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEQUAL_DIFF = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2127:2: (iv_ruleEQUAL_DIFF= ruleEQUAL_DIFF EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2128:2: iv_ruleEQUAL_DIFF= ruleEQUAL_DIFF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEQUAL_DIFFRule()); 
            }
            pushFollow(FOLLOW_ruleEQUAL_DIFF_in_entryRuleEQUAL_DIFF4586);
            iv_ruleEQUAL_DIFF=ruleEQUAL_DIFF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEQUAL_DIFF; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEQUAL_DIFF4596); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEQUAL_DIFF"


    // $ANTLR start "ruleEQUAL_DIFF"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2135:1: ruleEQUAL_DIFF returns [EObject current=null] : (this_COMPARISON_0= ruleCOMPARISON ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCOMPARISON ) ) )* ) ;
    public final EObject ruleEQUAL_DIFF() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_COMPARISON_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2138:28: ( (this_COMPARISON_0= ruleCOMPARISON ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCOMPARISON ) ) )* ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2139:1: (this_COMPARISON_0= ruleCOMPARISON ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCOMPARISON ) ) )* )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2139:1: (this_COMPARISON_0= ruleCOMPARISON ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCOMPARISON ) ) )* )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2140:5: this_COMPARISON_0= ruleCOMPARISON ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCOMPARISON ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEQUAL_DIFFAccess().getCOMPARISONParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCOMPARISON_in_ruleEQUAL_DIFF4643);
            this_COMPARISON_0=ruleCOMPARISON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_COMPARISON_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2148:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCOMPARISON ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36||LA22_0==58) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2148:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCOMPARISON ) )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2148:2: ()
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2149:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2154:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2155:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2155:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2156:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2156:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==36) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==58) ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2157:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,36,FOLLOW_36_in_ruleEQUAL_DIFF4672); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getEQUAL_DIFFAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getEQUAL_DIFFRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2169:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,58,FOLLOW_58_in_ruleEQUAL_DIFF4701); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getEQUAL_DIFFAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getEQUAL_DIFFRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2184:2: ( (lv_right_3_0= ruleCOMPARISON ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2185:1: (lv_right_3_0= ruleCOMPARISON )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2185:1: (lv_right_3_0= ruleCOMPARISON )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2186:3: lv_right_3_0= ruleCOMPARISON
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEQUAL_DIFFAccess().getRightCOMPARISONParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCOMPARISON_in_ruleEQUAL_DIFF4738);
            	    lv_right_3_0=ruleCOMPARISON();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEQUAL_DIFFRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"COMPARISON");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleEQUAL_DIFF"


    // $ANTLR start "entryRuleCOMPARISON"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2210:1: entryRuleCOMPARISON returns [EObject current=null] : iv_ruleCOMPARISON= ruleCOMPARISON EOF ;
    public final EObject entryRuleCOMPARISON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOMPARISON = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2211:2: (iv_ruleCOMPARISON= ruleCOMPARISON EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2212:2: iv_ruleCOMPARISON= ruleCOMPARISON EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCOMPARISONRule()); 
            }
            pushFollow(FOLLOW_ruleCOMPARISON_in_entryRuleCOMPARISON4776);
            iv_ruleCOMPARISON=ruleCOMPARISON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCOMPARISON; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOMPARISON4786); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOMPARISON"


    // $ANTLR start "ruleCOMPARISON"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2219:1: ruleCOMPARISON returns [EObject current=null] : (this_ADD_SUB_0= ruleADD_SUB ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleADD_SUB ) ) )* ) ;
    public final EObject ruleCOMPARISON() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_ADD_SUB_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2222:28: ( (this_ADD_SUB_0= ruleADD_SUB ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleADD_SUB ) ) )* ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2223:1: (this_ADD_SUB_0= ruleADD_SUB ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleADD_SUB ) ) )* )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2223:1: (this_ADD_SUB_0= ruleADD_SUB ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleADD_SUB ) ) )* )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2224:5: this_ADD_SUB_0= ruleADD_SUB ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleADD_SUB ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCOMPARISONAccess().getADD_SUBParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleADD_SUB_in_ruleCOMPARISON4833);
            this_ADD_SUB_0=ruleADD_SUB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ADD_SUB_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2232:1: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleADD_SUB ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=59 && LA24_0<=62)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2232:2: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleADD_SUB ) )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2232:2: ()
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2233:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2238:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2239:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2239:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2240:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2240:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    int alt23=4;
            	    switch ( input.LA(1) ) {
            	    case 59:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 61:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    case 62:
            	        {
            	        alt23=4;
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
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2241:3: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,59,FOLLOW_59_in_ruleCOMPARISON4862); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getCOMPARISONAccess().getOpLessThanSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getCOMPARISONRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2253:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,60,FOLLOW_60_in_ruleCOMPARISON4891); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getCOMPARISONAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getCOMPARISONRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2265:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,61,FOLLOW_61_in_ruleCOMPARISON4920); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getCOMPARISONAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getCOMPARISONRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2277:8: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,62,FOLLOW_62_in_ruleCOMPARISON4949); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_4, grammarAccess.getCOMPARISONAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getCOMPARISONRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2292:2: ( (lv_right_3_0= ruleADD_SUB ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2293:1: (lv_right_3_0= ruleADD_SUB )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2293:1: (lv_right_3_0= ruleADD_SUB )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2294:3: lv_right_3_0= ruleADD_SUB
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCOMPARISONAccess().getRightADD_SUBParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleADD_SUB_in_ruleCOMPARISON4986);
            	    lv_right_3_0=ruleADD_SUB();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCOMPARISONRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ADD_SUB");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
    // $ANTLR end "ruleCOMPARISON"


    // $ANTLR start "entryRuleADD_SUB"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2318:1: entryRuleADD_SUB returns [EObject current=null] : iv_ruleADD_SUB= ruleADD_SUB EOF ;
    public final EObject entryRuleADD_SUB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADD_SUB = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2319:2: (iv_ruleADD_SUB= ruleADD_SUB EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2320:2: iv_ruleADD_SUB= ruleADD_SUB EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getADD_SUBRule()); 
            }
            pushFollow(FOLLOW_ruleADD_SUB_in_entryRuleADD_SUB5024);
            iv_ruleADD_SUB=ruleADD_SUB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleADD_SUB; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleADD_SUB5034); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleADD_SUB"


    // $ANTLR start "ruleADD_SUB"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2327:1: ruleADD_SUB returns [EObject current=null] : (this_MULT_DIV_0= ruleMULT_DIV ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMULT_DIV ) ) )* ) ;
    public final EObject ruleADD_SUB() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MULT_DIV_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2330:28: ( (this_MULT_DIV_0= ruleMULT_DIV ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMULT_DIV ) ) )* ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2331:1: (this_MULT_DIV_0= ruleMULT_DIV ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMULT_DIV ) ) )* )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2331:1: (this_MULT_DIV_0= ruleMULT_DIV ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMULT_DIV ) ) )* )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2332:5: this_MULT_DIV_0= ruleMULT_DIV ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMULT_DIV ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getADD_SUBAccess().getMULT_DIVParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMULT_DIV_in_ruleADD_SUB5081);
            this_MULT_DIV_0=ruleMULT_DIV();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MULT_DIV_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2340:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMULT_DIV ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=63 && LA26_0<=64)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2340:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMULT_DIV ) )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2340:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==63) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==64) ) {
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
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2340:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2340:3: ( () otherlv_2= '+' )
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2340:4: () otherlv_2= '+'
            	            {
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2340:4: ()
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2341:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleADD_SUB5104); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getADD_SUBAccess().getPlusSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2351:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2351:6: ( () otherlv_4= '-' )
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2351:7: () otherlv_4= '-'
            	            {
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2351:7: ()
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2352:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,64,FOLLOW_64_in_ruleADD_SUB5133); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getADD_SUBAccess().getHyphenMinusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2361:3: ( (lv_right_5_0= ruleMULT_DIV ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2362:1: (lv_right_5_0= ruleMULT_DIV )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2362:1: (lv_right_5_0= ruleMULT_DIV )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2363:3: lv_right_5_0= ruleMULT_DIV
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getADD_SUBAccess().getRightMULT_DIVParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMULT_DIV_in_ruleADD_SUB5156);
            	    lv_right_5_0=ruleMULT_DIV();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getADD_SUBRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_5_0, 
            	              		"MULT_DIV");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleADD_SUB"


    // $ANTLR start "entryRuleMULT_DIV"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2387:1: entryRuleMULT_DIV returns [EObject current=null] : iv_ruleMULT_DIV= ruleMULT_DIV EOF ;
    public final EObject entryRuleMULT_DIV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMULT_DIV = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2388:2: (iv_ruleMULT_DIV= ruleMULT_DIV EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2389:2: iv_ruleMULT_DIV= ruleMULT_DIV EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMULT_DIVRule()); 
            }
            pushFollow(FOLLOW_ruleMULT_DIV_in_entryRuleMULT_DIV5194);
            iv_ruleMULT_DIV=ruleMULT_DIV();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMULT_DIV; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMULT_DIV5204); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMULT_DIV"


    // $ANTLR start "ruleMULT_DIV"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2396:1: ruleMULT_DIV returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMULT_DIV() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2399:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2400:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2400:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2401:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMULT_DIVAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMULT_DIV5251);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2409:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=65 && LA28_0<=66)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2409:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2409:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==65) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==66) ) {
            	        alt27=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2409:3: ( () otherlv_2= '*' )
            	            {
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2409:3: ( () otherlv_2= '*' )
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2409:4: () otherlv_2= '*'
            	            {
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2409:4: ()
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2410:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleMULT_DIV5274); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getMULT_DIVAccess().getAsteriskKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2420:6: ( () otherlv_4= '/' )
            	            {
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2420:6: ( () otherlv_4= '/' )
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2420:7: () otherlv_4= '/'
            	            {
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2420:7: ()
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2421:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,66,FOLLOW_66_in_ruleMULT_DIV5303); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getMULT_DIVAccess().getSolidusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2430:3: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2431:1: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2431:1: (lv_right_5_0= rulePrimaryExpression )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2432:3: lv_right_5_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMULT_DIVAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMULT_DIV5326);
            	    lv_right_5_0=rulePrimaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMULT_DIVRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_5_0, 
            	              		"PrimaryExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "ruleMULT_DIV"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2456:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2457:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2458:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression5364);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression5374); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2465:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_EXPRESSION_1= ruleEXPRESSION otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_exp_5_0= rulePrimaryExpression ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_EXPRESSION_1 = null;

        EObject lv_exp_5_0 = null;

        EObject this_Atomic_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2468:28: ( ( (otherlv_0= '(' this_EXPRESSION_1= ruleEXPRESSION otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_exp_5_0= rulePrimaryExpression ) ) ) | this_Atomic_6= ruleAtomic ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2469:1: ( (otherlv_0= '(' this_EXPRESSION_1= ruleEXPRESSION otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_exp_5_0= rulePrimaryExpression ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2469:1: ( (otherlv_0= '(' this_EXPRESSION_1= ruleEXPRESSION otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_exp_5_0= rulePrimaryExpression ) ) ) | this_Atomic_6= ruleAtomic )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt29=1;
                }
                break;
            case 67:
                {
                alt29=2;
                }
                break;
            case RULE_IDENT:
            case RULE_BOOLEAN:
            case RULE_STRING:
            case RULE_ENUM_ELEMENT:
            case RULE_BIT:
            case RULE_HEX:
            case RULE_INT:
            case 64:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2469:2: (otherlv_0= '(' this_EXPRESSION_1= ruleEXPRESSION otherlv_2= ')' )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2469:2: (otherlv_0= '(' this_EXPRESSION_1= ruleEXPRESSION otherlv_2= ')' )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2469:4: otherlv_0= '(' this_EXPRESSION_1= ruleEXPRESSION otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_37_in_rulePrimaryExpression5412); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEXPRESSIONParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEXPRESSION_in_rulePrimaryExpression5434);
                    this_EXPRESSION_1=ruleEXPRESSION();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EXPRESSION_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_rulePrimaryExpression5445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2487:6: ( () otherlv_4= 'not' ( (lv_exp_5_0= rulePrimaryExpression ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2487:6: ( () otherlv_4= 'not' ( (lv_exp_5_0= rulePrimaryExpression ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2487:7: () otherlv_4= 'not' ( (lv_exp_5_0= rulePrimaryExpression ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2487:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2488:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNOTAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,67,FOLLOW_67_in_rulePrimaryExpression5474); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getNotKeyword_1_1());
                          
                    }
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2497:1: ( (lv_exp_5_0= rulePrimaryExpression ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2498:1: (lv_exp_5_0= rulePrimaryExpression )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2498:1: (lv_exp_5_0= rulePrimaryExpression )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2499:3: lv_exp_5_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_rulePrimaryExpression5495);
                    lv_exp_5_0=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"exp",
                              		lv_exp_5_0, 
                              		"PrimaryExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2517:5: this_Atomic_6= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getAtomicParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimaryExpression5524);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Atomic_6; 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleAtomic"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2533:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2534:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2535:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic5559);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic5569); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2542:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (otherlv_15= RULE_IDENT ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token lv_value_9_0=null;
        Token lv_value_11_0=null;
        Token lv_value_13_0=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2545:28: ( ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (otherlv_15= RULE_IDENT ) ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2546:1: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (otherlv_15= RULE_IDENT ) ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2546:1: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (otherlv_15= RULE_IDENT ) ) ) )
            int alt30=8;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2546:2: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2546:2: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2546:3: () ( (lv_value_1_0= ruleINTEGER ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2546:3: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2547:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2552:2: ( (lv_value_1_0= ruleINTEGER ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2553:1: (lv_value_1_0= ruleINTEGER )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2553:1: (lv_value_1_0= ruleINTEGER )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2554:3: lv_value_1_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicAccess().getValueINTEGERParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleINTEGER_in_ruleAtomic5625);
                    lv_value_1_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"INTEGER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2571:6: ( () ( (lv_value_3_0= ruleDECIMAL ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2571:6: ( () ( (lv_value_3_0= ruleDECIMAL ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2571:7: () ( (lv_value_3_0= ruleDECIMAL ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2571:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2572:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getRealConstantAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2577:2: ( (lv_value_3_0= ruleDECIMAL ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2578:1: (lv_value_3_0= ruleDECIMAL )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2578:1: (lv_value_3_0= ruleDECIMAL )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2579:3: lv_value_3_0= ruleDECIMAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicAccess().getValueDECIMALParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleAtomic5663);
                    lv_value_3_0=ruleDECIMAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"DECIMAL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2596:6: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2596:6: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2596:7: () ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2596:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2597:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getStrConstantAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2602:2: ( (lv_value_5_0= RULE_STRING ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2603:1: (lv_value_5_0= RULE_STRING )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2603:1: (lv_value_5_0= RULE_STRING )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2604:3: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic5697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_5_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_5_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2621:6: ( () ( (lv_value_7_0= RULE_ENUM_ELEMENT ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2621:6: ( () ( (lv_value_7_0= RULE_ENUM_ELEMENT ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2621:7: () ( (lv_value_7_0= RULE_ENUM_ELEMENT ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2621:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2622:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getEnumConstantAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2627:2: ( (lv_value_7_0= RULE_ENUM_ELEMENT ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2628:1: (lv_value_7_0= RULE_ENUM_ELEMENT )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2628:1: (lv_value_7_0= RULE_ENUM_ELEMENT )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2629:3: lv_value_7_0= RULE_ENUM_ELEMENT
                    {
                    lv_value_7_0=(Token)match(input,RULE_ENUM_ELEMENT,FOLLOW_RULE_ENUM_ELEMENT_in_ruleAtomic5736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_7_0, grammarAccess.getAtomicAccess().getValueENUM_ELEMENTTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_7_0, 
                              		"ENUM_ELEMENT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2646:6: ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2646:6: ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2646:7: () ( (lv_value_9_0= RULE_BOOLEAN ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2646:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2647:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getBoolConstantAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2652:2: ( (lv_value_9_0= RULE_BOOLEAN ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2653:1: (lv_value_9_0= RULE_BOOLEAN )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2653:1: (lv_value_9_0= RULE_BOOLEAN )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2654:3: lv_value_9_0= RULE_BOOLEAN
                    {
                    lv_value_9_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleAtomic5775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_9_0, grammarAccess.getAtomicAccess().getValueBOOLEANTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_9_0, 
                              		"BOOLEAN");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2671:6: ( () ( (lv_value_11_0= RULE_BIT ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2671:6: ( () ( (lv_value_11_0= RULE_BIT ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2671:7: () ( (lv_value_11_0= RULE_BIT ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2671:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2672:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getBitConstantAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2677:2: ( (lv_value_11_0= RULE_BIT ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2678:1: (lv_value_11_0= RULE_BIT )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2678:1: (lv_value_11_0= RULE_BIT )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2679:3: lv_value_11_0= RULE_BIT
                    {
                    lv_value_11_0=(Token)match(input,RULE_BIT,FOLLOW_RULE_BIT_in_ruleAtomic5814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_11_0, grammarAccess.getAtomicAccess().getValueBITTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_11_0, 
                              		"BIT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2696:6: ( () ( (lv_value_13_0= RULE_HEX ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2696:6: ( () ( (lv_value_13_0= RULE_HEX ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2696:7: () ( (lv_value_13_0= RULE_HEX ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2696:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2697:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getHexConstantAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2702:2: ( (lv_value_13_0= RULE_HEX ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2703:1: (lv_value_13_0= RULE_HEX )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2703:1: (lv_value_13_0= RULE_HEX )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2704:3: lv_value_13_0= RULE_HEX
                    {
                    lv_value_13_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleAtomic5853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_13_0, grammarAccess.getAtomicAccess().getValueHEXTerminalRuleCall_6_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_13_0, 
                              		"HEX");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2721:6: ( () ( (otherlv_15= RULE_IDENT ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2721:6: ( () ( (otherlv_15= RULE_IDENT ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2721:7: () ( (otherlv_15= RULE_IDENT ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2721:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2722:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getVarExpRefAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2727:2: ( (otherlv_15= RULE_IDENT ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2728:1: (otherlv_15= RULE_IDENT )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2728:1: (otherlv_15= RULE_IDENT )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2729:3: otherlv_15= RULE_IDENT
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                              
                    }
                    otherlv_15=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleAtomic5895); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_15, grammarAccess.getAtomicAccess().getVrefVAR_CSTCrossReference_7_1_0()); 
                      	
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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleDECIMAL"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2748:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2749:2: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2750:2: iv_ruleDECIMAL= ruleDECIMAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDECIMALRule()); 
            }
            pushFollow(FOLLOW_ruleDECIMAL_in_entryRuleDECIMAL5933);
            iv_ruleDECIMAL=ruleDECIMAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDECIMAL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDECIMAL5944); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2757:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2760:28: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2761:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2761:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2761:2: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2761:2: (kw= '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==64) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2762:2: kw= '-'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleDECIMAL5983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDECIMALAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDECIMAL6000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2774:1: (kw= '.' this_INT_3= RULE_INT )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2775:2: kw= '.' this_INT_3= RULE_INT
            {
            kw=(Token)match(input,68,FOLLOW_68_in_ruleDECIMAL6019); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_2_0()); 
                  
            }
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDECIMAL6034); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_3, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2_1()); 
                  
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
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "entryRuleINTEGER"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2795:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2796:2: (iv_ruleINTEGER= ruleINTEGER EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2797:2: iv_ruleINTEGER= ruleINTEGER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTEGERRule()); 
            }
            pushFollow(FOLLOW_ruleINTEGER_in_entryRuleINTEGER6081);
            iv_ruleINTEGER=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTEGER.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTEGER6092); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTEGER"


    // $ANTLR start "ruleINTEGER"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2804:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2807:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2808:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2808:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2808:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2808:2: (kw= '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==64) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2809:2: kw= '-'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleINTEGER6131); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleINTEGER6148); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleINTEGER"

    // Delegated rules


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA15_eotS =
        "\14\uffff";
    static final String DFA15_eofS =
        "\2\uffff\1\12\11\uffff";
    static final String DFA15_minS =
        "\1\4\1\12\1\22\11\uffff";
    static final String DFA15_maxS =
        "\1\100\1\12\1\104\11\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\1\1\2";
    static final String DFA15_specialS =
        "\14\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\10\1\3\1\4\1\5\1\6\1\7\1\2\46\uffff\1\11\16\uffff\1\1",
            "\1\2",
            "\1\12\4\uffff\1\12\16\uffff\1\12\7\uffff\3\12\23\uffff\1\13",
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1285:1: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (lv_value_15_0= RULE_IDENT ) ) ) | ( () ( (lv_value_17_0= '?' ) ) ) )";
        }
    }
    static final String DFA30_eotS =
        "\13\uffff";
    static final String DFA30_eofS =
        "\2\uffff\1\12\10\uffff";
    static final String DFA30_minS =
        "\1\4\1\12\1\27\10\uffff";
    static final String DFA30_maxS =
        "\1\100\1\12\1\104\10\uffff";
    static final String DFA30_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\2\1\1";
    static final String DFA30_specialS =
        "\13\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\10\1\5\1\3\1\4\1\6\1\7\1\2\65\uffff\1\1",
            "\1\2",
            "\2\12\13\uffff\1\12\1\uffff\1\12\21\uffff\13\12\1\uffff\1"+
            "\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "2546:1: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (otherlv_15= RULE_IDENT ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleLANGUAGE_in_entryRuleLANGUAGE75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLANGUAGE85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_DECL_in_ruleLANGUAGE130 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleMODULE_DECL_in_entryRuleMODULE_DECL166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMODULE_DECL176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleMODULE_DECL213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMODULE_DECL239 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMODULE_DECL256 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleCRITERION_DECL_in_ruleMODULE_DECL277 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleDATASEL_DECL_in_ruleMODULE_DECL298 = new BitSet(new long[]{0x0070002F80040010L});
    public static final BitSet FOLLOW_ruleVAR_CST_in_ruleMODULE_DECL319 = new BitSet(new long[]{0x0070002F80040010L});
    public static final BitSet FOLLOW_ruleINSTRUCTION_in_ruleMODULE_DECL341 = new BitSet(new long[]{0x0070002000040010L});
    public static final BitSet FOLLOW_18_in_ruleMODULE_DECL354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCRITERION_DECL_in_entryRuleCRITERION_DECL390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCRITERION_DECL400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCRITERION_DECL437 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCRITERION_DECL449 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCRITERION_DECL461 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_ruleCRITERION_in_ruleCRITERION_DECL491 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleEND_in_ruleCRITERION_DECL512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATASEL_DECL_in_entryRuleDATASEL_DECL548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDATASEL_DECL558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDATASEL_DECL595 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDATASEL_DECL607 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDATASEL_DECL619 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_ruleDATASEL_in_ruleDATASEL_DECL649 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleDATASEL_DECL662 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_ruleDATASEL_in_ruleDATASEL_DECL683 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleEND_in_ruleDATASEL_DECL706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEND_in_entryRuleEND742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEND752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEND794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCRITERION_in_entryRuleCRITERION842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCRITERION852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCRITERION896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCRITERION925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCRITERION954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATASEL_in_entryRuleDATASEL1005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDATASEL1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDATASEL1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDATASEL1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDATASEL1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_CST_in_entryRuleVAR_CST1168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVAR_CST1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_in_ruleVAR_CST1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCST_in_ruleVAR_CST1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_in_entryRuleVAR1287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVAR1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_ruleVAR1352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleVAR1369 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVAR1386 = new BitSet(new long[]{0x00003F8000000000L});
    public static final BitSet FOLLOW_ruleTYPE_in_ruleVAR1407 = new BitSet(new long[]{0x0000C00001020000L});
    public static final BitSet FOLLOW_ruleRANGE_in_ruleVAR1428 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleEND_in_ruleVAR1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow1486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlow1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFlow1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFlow1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFlow1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFlow1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCST_in_entryRuleCST1678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCST1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCST1740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleCST1770 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleCST1787 = new BitSet(new long[]{0x00003F8000000000L});
    public static final BitSet FOLLOW_ruleTYPE_in_ruleCST1808 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleCST1820 = new BitSet(new long[]{0x00020000000007F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleCST1841 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCST1853 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleEND_in_ruleCST1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTYPE_in_entryRuleTYPE1910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTYPE1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTYPE1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTYPE1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTYPE2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTYPE2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTYPE2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTYPE2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTYPE2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRANGE_in_entryRuleRANGE2189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRANGE2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTERVAL_in_ruleRANGE2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLSET_in_ruleRANGE2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTERVAL_in_entryRuleINTERVAL2308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTERVAL2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleINTERVAL2363 = new BitSet(new long[]{0x00020000000007F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_47_in_ruleINTERVAL2392 = new BitSet(new long[]{0x00020000000007F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleINTERVAL2429 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleINTERVAL2441 = new BitSet(new long[]{0x00020000000007F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleINTERVAL2462 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleINTERVAL2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleINTERVAL2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLSET_in_entryRuleLSET2563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLSET2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleLSET2610 = new BitSet(new long[]{0x00020000000007F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleLSET2631 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_23_in_ruleLSET2644 = new BitSet(new long[]{0x00020000000007F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleLSET2665 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_18_in_ruleLSET2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_in_ruleLiteral2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleLiteral2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleLiteral2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENUM_ELEMENT_in_ruleLiteral2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BIT_in_ruleLiteral2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleLiteral3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleLiteral3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLiteral3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINSTRUCTION_in_entryRuleINSTRUCTION3138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINSTRUCTION3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIF_INSTR_in_ruleINSTRUCTION3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOOP_INSTR_in_ruleINSTRUCTION3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleASSIGN_INSTR_in_ruleINSTRUCTION3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleERROR_INSTR_in_ruleINSTRUCTION3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNULL_INSTR_in_ruleINSTRUCTION3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIF_INSTR_in_entryRuleIF_INSTR3338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIF_INSTR3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleIF_INSTR3385 = new BitSet(new long[]{0x00000020000007F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleIF_INSTR3406 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleIF_INSTR3418 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleIF_INSTR3430 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIF_INSTR3442 = new BitSet(new long[]{0x0070002000000010L});
    public static final BitSet FOLLOW_ruleINSTRUCTION_in_ruleIF_INSTR3463 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIF_INSTR3475 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleIF_INSTR3496 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_50_in_ruleIF_INSTR3510 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIF_INSTR3524 = new BitSet(new long[]{0x0070002000000010L});
    public static final BitSet FOLLOW_ruleINSTRUCTION_in_ruleIF_INSTR3545 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIF_INSTR3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOOP_INSTR_in_entryRuleLOOP_INSTR3594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOOP_INSTR3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLOOP_INSTR3641 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleLOOP_INSTR3653 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLOOP_INSTR3670 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleLOOP_INSTR3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleERROR_INSTR_in_entryRuleERROR_INSTR3723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleERROR_INSTR3733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleERROR_INSTR3770 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleEND_in_ruleERROR_INSTR3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNULL_INSTR_in_entryRuleNULL_INSTR3836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNULL_INSTR3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleNULL_INSTR3883 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleEND_in_ruleNULL_INSTR3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleASSIGN_INSTR_in_entryRuleASSIGN_INSTR3949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleASSIGN_INSTR3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSINGLE_ASSIGN_in_ruleASSIGN_INSTR4005 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleASSIGN_INSTR4018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSINGLE_ASSIGN_in_ruleASSIGN_INSTR4039 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleEND_in_ruleASSIGN_INSTR4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSINGLE_ASSIGN_in_entryRuleSINGLE_ASSIGN4098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSINGLE_ASSIGN4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleSINGLE_ASSIGN4153 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleSINGLE_ASSIGN4165 = new BitSet(new long[]{0x00000020000007F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleSINGLE_ASSIGN4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_entryRuleEXPRESSION4222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRESSION4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOR_in_ruleEXPRESSION4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOR_in_entryRuleOR4312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOR4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAND_in_ruleOR4369 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOR4390 = new BitSet(new long[]{0x00000020000007F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_ruleAND_in_ruleOR4411 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleAND_in_entryRuleAND4449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAND4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQUAL_DIFF_in_ruleAND4506 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleAND4527 = new BitSet(new long[]{0x00000020000007F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_ruleEQUAL_DIFF_in_ruleAND4548 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleEQUAL_DIFF_in_entryRuleEQUAL_DIFF4586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEQUAL_DIFF4596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOMPARISON_in_ruleEQUAL_DIFF4643 = new BitSet(new long[]{0x0400001000000002L});
    public static final BitSet FOLLOW_36_in_ruleEQUAL_DIFF4672 = new BitSet(new long[]{0x00000020000007F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_58_in_ruleEQUAL_DIFF4701 = new BitSet(new long[]{0x00000020000007F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_ruleCOMPARISON_in_ruleEQUAL_DIFF4738 = new BitSet(new long[]{0x0400001000000002L});
    public static final BitSet FOLLOW_ruleCOMPARISON_in_entryRuleCOMPARISON4776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOMPARISON4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleADD_SUB_in_ruleCOMPARISON4833 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleCOMPARISON4862 = new BitSet(new long[]{0x00000020000007F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_60_in_ruleCOMPARISON4891 = new BitSet(new long[]{0x00000020000007F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_61_in_ruleCOMPARISON4920 = new BitSet(new long[]{0x00000020000007F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_62_in_ruleCOMPARISON4949 = new BitSet(new long[]{0x00000020000007F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_ruleADD_SUB_in_ruleCOMPARISON4986 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_ruleADD_SUB_in_entryRuleADD_SUB5024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleADD_SUB5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULT_DIV_in_ruleADD_SUB5081 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_63_in_ruleADD_SUB5104 = new BitSet(new long[]{0x00000020000007F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_64_in_ruleADD_SUB5133 = new BitSet(new long[]{0x00000020000007F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_ruleMULT_DIV_in_ruleADD_SUB5156 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMULT_DIV_in_entryRuleMULT_DIV5194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMULT_DIV5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMULT_DIV5251 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_65_in_ruleMULT_DIV5274 = new BitSet(new long[]{0x00000020000007F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_66_in_ruleMULT_DIV5303 = new BitSet(new long[]{0x00000020000007F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMULT_DIV5326 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression5364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePrimaryExpression5412 = new BitSet(new long[]{0x00000020000007F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rulePrimaryExpression5434 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulePrimaryExpression5445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rulePrimaryExpression5474 = new BitSet(new long[]{0x00000020000007F0L,0x0000000000000009L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePrimaryExpression5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimaryExpression5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic5559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_in_ruleAtomic5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleAtomic5663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENUM_ELEMENT_in_ruleAtomic5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleAtomic5775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BIT_in_ruleAtomic5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleAtomic5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleAtomic5895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_entryRuleDECIMAL5933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDECIMAL5944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDECIMAL5983 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDECIMAL6000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleDECIMAL6019 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDECIMAL6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_in_entryRuleINTEGER6081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTEGER6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleINTEGER6131 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleINTEGER6148 = new BitSet(new long[]{0x0000000000000002L});

}